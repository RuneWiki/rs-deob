package deob;

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
	public int field1058;

	@ObfuscatedName("client.bb")
	public int field1059;

	@ObfuscatedName("client.cb")
	public String field1060;

	@ObfuscatedName("client.eb")
	public static int field1061;

	@ObfuscatedName("client.fb")
	public int[] field1062;

	@ObfuscatedName("client.gb")
	public int[] field1063;

	@ObfuscatedName("client.hb")
	public int field1064;

	@ObfuscatedName("client.ib")
	public int field1065;

	@ObfuscatedName("client.jb")
	public int field1066;

	@ObfuscatedName("client.kb")
	public int field1067;

	@ObfuscatedName("client.lb")
	public int field1068;

	@ObfuscatedName("client.mb")
	public int[][] field1069 = new int[104][104];

	@ObfuscatedName("client.ob")
	public int field1070;

	@ObfuscatedName("client.pb")
	public boolean field1071 = false;

	@ObfuscatedName("client.qb")
	public static boolean field1072;

	@ObfuscatedName("client.rb")
	public static BigInteger field1073 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.sb")
	public int field1074;

	@ObfuscatedName("client.tb")
	public int field1075 = 128;

	@ObfuscatedName("client.ub")
	public int field1076;

	@ObfuscatedName("client.vb")
	public int field1077;

	@ObfuscatedName("client.wb")
	public int field1078;

	@ObfuscatedName("client.xb")
	public int[] field1079 = new int[256];

	@ObfuscatedName("client.yb")
	public class35 field1080;

	@ObfuscatedName("client.zb")
	public class35 field1081;

	@ObfuscatedName("client.ac")
	public static int field1106;

	@ObfuscatedName("client.bc")
	public class62[] field1107 = new class62[4];

	@ObfuscatedName("client.cc")
	public boolean field1108 = true;

	@ObfuscatedName("client.ec")
	public int[] field1109 = new int[50];

	@ObfuscatedName("client.fc")
	public boolean field1110 = true;

	@ObfuscatedName("client.gc")
	public String[] field1111 = new String[200];

	@ObfuscatedName("client.hc")
	public int[] field1112 = new int[class67.field997];

	@ObfuscatedName("client.jc")
	public int field1113;

	@ObfuscatedName("client.kc")
	public int field1114;

	@ObfuscatedName("client.lc")
	public int field1115;

	@ObfuscatedName("client.mc")
	public int field1116;

	@ObfuscatedName("client.nc")
	public int field1117;

	@ObfuscatedName("client.pc")
	public String field1118 = "";

	@ObfuscatedName("client.qc")
	public String field1119 = "";

	@ObfuscatedName("client.rc")
	public int field1120;

	@ObfuscatedName("client.sc")
	public int field1121;

	@ObfuscatedName("client.K")
	public int[] field1042 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.M")
	public int field1044 = -1;

	@ObfuscatedName("client.U")
	public long[] field1052 = new long[200];

	@ObfuscatedName("client.W")
	public int field1054 = -1;

	@ObfuscatedName("client.X")
	public final int[] field1055 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ab")
	public boolean field1082 = false;

	@ObfuscatedName("client.Bb")
	public int[] field1083 = new int[class67.field997];

	@ObfuscatedName("client.Hb")
	public boolean field1089 = false;

	@ObfuscatedName("client.Lb")
	public boolean field1093 = false;

	@ObfuscatedName("client.Mb")
	public class41 field1094 = new class41();

	@ObfuscatedName("client.Ob")
	public boolean field1095 = false;

	@ObfuscatedName("client.Qb")
	public int[] field1097 = new int[100];

	@ObfuscatedName("client.Rb")
	public String[] field1098 = new String[100];

	@ObfuscatedName("client.Sb")
	public String[] field1099 = new String[100];

	@ObfuscatedName("client.Ub")
	public boolean field1100 = false;

	@ObfuscatedName("client.Vb")
	public int[] field1101 = new int[33];

	@ObfuscatedName("client.uc")
	public int field1123 = 0x332D25;

	@ObfuscatedName("client.Bc")
	public int[] field1129 = new int[151];

	@ObfuscatedName("client.Cc")
	public int[] field1130 = new int[class67.field997];

	@ObfuscatedName("client.Dc")
	public int[] field1131 = new int[50];

	@ObfuscatedName("client.Ic")
	public class41 field1135 = new class41();

	@ObfuscatedName("client.Nc")
	public String field1140 = "";

	@ObfuscatedName("client.Qc")
	public boolean field1141 = true;

	@ObfuscatedName("client.Sc")
	public int field1143 = -1;

	@ObfuscatedName("client.Tc")
	public class38 field1144 = class38.method212(1);

	@ObfuscatedName("client.Vc")
	public int[] field1146 = new int[200];

	@ObfuscatedName("client.Wc")
	public boolean field1147 = false;

	@ObfuscatedName("client.Yc")
	public int[] field1149 = new int[4000];

	@ObfuscatedName("client.Zc")
	public int[] field1150 = new int[4000];

	@ObfuscatedName("client.bd")
	public int[] field1152 = new int[2000];

	@ObfuscatedName("client.fd")
	public boolean field1155 = false;

	@ObfuscatedName("client.gd")
	public int[] field1156 = new int[151];

	@ObfuscatedName("client.hd")
	public int[] field1157 = new int[7];

	@ObfuscatedName("client.kd")
	public class41[][][] field1158 = new class41[4][104][104];

	@ObfuscatedName("client.pd")
	public int[] field1163 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.td")
	public boolean field1167 = false;

	@ObfuscatedName("client.wd")
	public String[] field1170 = new String[5];

	@ObfuscatedName("client.xd")
	public boolean[] field1171 = new boolean[5];

	@ObfuscatedName("client.yd")
	public long[] field1172 = new long[100];

	@ObfuscatedName("client.zd")
	public class35[] field1173 = new class35[1000];

	@ObfuscatedName("client.Ad")
	public boolean field1174 = false;

	@ObfuscatedName("client.Gd")
	public int[][] field1180 = new int[104][104];

	@ObfuscatedName("client.Ud")
	public boolean field1194 = false;

	@ObfuscatedName("client.Vd")
	public class48[] field1195 = new class48[5];

	@ObfuscatedName("client.fe")
	public class38 field1204 = class38.method212(1);

	@ObfuscatedName("client.he")
	public int field1206 = 2;

	@ObfuscatedName("client.je")
	public int[] field1208 = new int[5];

	@ObfuscatedName("client.qe")
	public int[] field1214 = new int[5];

	@ObfuscatedName("client.re")
	public class35[] field1215 = new class35[100];

	@ObfuscatedName("client.Be")
	public int field1224 = -1;

	@ObfuscatedName("client.Ce")
	public int field1225 = -1;

	@ObfuscatedName("client.Ee")
	public final int field1227 = 100;

	@ObfuscatedName("client.Fe")
	public int[] field1228 = new int[100];

	@ObfuscatedName("client.We")
	public int[] field1244 = new int[5];

	@ObfuscatedName("client.Xe")
	public String field1245 = "";

	@ObfuscatedName("client.Ze")
	public int field1247 = 1;

	@ObfuscatedName("client.ef")
	public boolean field1250 = false;

	@ObfuscatedName("client.mf")
	public int[] field1257 = new int[33];

	@ObfuscatedName("client.nf")
	public String field1258 = "";

	@ObfuscatedName("client.wf")
	public int[] field1266 = new int[1000];

	@ObfuscatedName("client.yf")
	public boolean field1268 = false;

	@ObfuscatedName("client.Ff")
	public int field1275 = -1;

	@ObfuscatedName("client.Hf")
	public int field1277 = 50;

	@ObfuscatedName("client.If")
	public int[] field1278 = new int[field1277];

	@ObfuscatedName("client.Jf")
	public int[] field1279 = new int[field1277];

	@ObfuscatedName("client.Kf")
	public int[] field1280 = new int[field1277];

	@ObfuscatedName("client.Lf")
	public int[] field1281 = new int[field1277];

	@ObfuscatedName("client.Mf")
	public int[] field1282 = new int[field1277];

	@ObfuscatedName("client.Nf")
	public int[] field1283 = new int[field1277];

	@ObfuscatedName("client.Of")
	public int[] field1284 = new int[field1277];

	@ObfuscatedName("client.Pf")
	public String[] field1285 = new String[field1277];

	@ObfuscatedName("client.Tf")
	public class41 field1289 = new class41();

	@ObfuscatedName("client.Vf")
	public int field1291 = -1;

	@ObfuscatedName("client.Wf")
	public int field1292 = 3;

	@ObfuscatedName("client.Yf")
	public int field1294 = -1;

	@ObfuscatedName("client.bg")
	public byte[] field1296 = new byte[16384];

	@ObfuscatedName("client.cg")
	public int field1297 = -1;

	@ObfuscatedName("client.dg")
	public int field1298 = -1;

	@ObfuscatedName("client.ng")
	public String[] field1307 = new String[500];

	@ObfuscatedName("client.tg")
	public boolean field1313 = false;

	@ObfuscatedName("client.ug")
	public int[] field1314 = new int[2000];

	@ObfuscatedName("client.vg")
	public boolean field1315 = false;

	@ObfuscatedName("client.Ag")
	public boolean field1320 = false;

	@ObfuscatedName("client.Cg")
	public boolean field1321 = false;

	@ObfuscatedName("client.Dg")
	public String field1322 = "";

	@ObfuscatedName("client.Eg")
	public String field1323 = "";

	@ObfuscatedName("client.Gg")
	public int field1325 = 0x23201B;

	@ObfuscatedName("client.Kg")
	public boolean field1329 = false;

	@ObfuscatedName("client.Lg")
	public int field1330 = 78;

	@ObfuscatedName("client.Pg")
	public boolean field1334 = false;

	@ObfuscatedName("client.Qg")
	public class35[] field1335 = new class35[8];

	@ObfuscatedName("client.Ug")
	public class35[] field1337 = new class35[20];

	@ObfuscatedName("client.Wg")
	public int field1339 = -1;

	@ObfuscatedName("client.Xg")
	public class38 field1340 = class38.method212(1);

	@ObfuscatedName("client.Zg")
	public class35[] field1341 = new class35[20];

	@ObfuscatedName("client.eh")
	public boolean field1344 = false;

	@ObfuscatedName("client.jh")
	public class26[] field1349 = new class26[16384];

	@ObfuscatedName("client.lh")
	public int[] field1351 = new int[16384];

	@ObfuscatedName("client.mh")
	public String field1352 = "";

	@ObfuscatedName("client.th")
	public int[] field1359 = new int[9];

	@ObfuscatedName("client.wh")
	public boolean field1362 = false;

	@ObfuscatedName("client.yh")
	public int[] field1364 = new int[500];

	@ObfuscatedName("client.zh")
	public int[] field1365 = new int[500];

	@ObfuscatedName("client.Ah")
	public int[] field1366 = new int[500];

	@ObfuscatedName("client.Bh")
	public int[] field1367 = new int[500];

	@ObfuscatedName("client.Eh")
	public int field1369 = 2;

	@ObfuscatedName("client.Fh")
	public int field1370 = -1;

	@ObfuscatedName("client.Vh")
	public class36[] field1386 = new class36[100];

	@ObfuscatedName("client.Yh")
	public boolean[] field1389 = new boolean[5];

	@ObfuscatedName("client.Zh")
	public int field1390 = 0x766654;

	@ObfuscatedName("client.bi")
	public int field1392 = 1;

	@ObfuscatedName("client.di")
	public boolean field1394 = false;

	@ObfuscatedName("client.ei")
	public int field1395 = -1;

	@ObfuscatedName("client.fi")
	public int field1396 = 0x4D4233;

	@ObfuscatedName("client.mi")
	public String field1402 = "";

	@ObfuscatedName("client.oi")
	public int[] field1404 = new int[1000];

	@ObfuscatedName("client.pi")
	public int[] field1405 = new int[1000];

	@ObfuscatedName("client.ri")
	public class4 field1407 = new class4();

	@ObfuscatedName("client.si")
	public boolean field1408 = false;

	@ObfuscatedName("client.Ai")
	public boolean field1414 = true;

	@ObfuscatedName("client.Bi")
	public int[] field1415 = new int[5];

	@ObfuscatedName("client.Ci")
	public class36[] field1416 = new class36[13];

	@ObfuscatedName("client.Fi")
	public int[][] field1418 = new int[104][104];

	@ObfuscatedName("client.Gi")
	public boolean field1419 = false;

	@ObfuscatedName("client.Ni")
	public int field1425 = 2;

	@ObfuscatedName("client.Pi")
	public class36[] field1427 = new class36[2];

	@ObfuscatedName("client.Qi")
	public CRC32 field1428 = new CRC32();

	@ObfuscatedName("client.Yi")
	public int field1436 = -1;

	@ObfuscatedName("client.Zi")
	public int field1437 = 2048;

	@ObfuscatedName("client.aj")
	public int field1438 = 2047;

	@ObfuscatedName("client.bj")
	public class27[] field1439 = new class27[field1437];

	@ObfuscatedName("client.dj")
	public int[] field1441 = new int[field1437];

	@ObfuscatedName("client.fj")
	public int[] field1443 = new int[field1437];

	@ObfuscatedName("client.gj")
	public class38[] field1444 = new class38[field1437];

	@ObfuscatedName("client.nj")
	public int[] field1451 = new int[5];

	@ObfuscatedName("client.sj")
	public boolean field1455 = false;

	@ObfuscatedName("client.wj")
	public boolean field1458 = false;

	@ObfuscatedName("client.xj")
	public int[] field1459 = new int[50];

	@ObfuscatedName("client.P")
	public static final int[] field1047 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Rc")
	public static String field1142 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Md")
	public static int[] field1186 = new int[99];

	@ObfuscatedName("client.Bf")
	public static int field1271 = 10;

	@ObfuscatedName("client.Df")
	public static boolean field1273 = true;

	@ObfuscatedName("client.mg")
	public static int[] field1306 = new int[32];

	@ObfuscatedName("client.ah")
	public static final int[][] field1342 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Oi")
	public static BigInteger field1426 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.L")
	public int field1043;

	@ObfuscatedName("client.N")
	public int field1045;

	@ObfuscatedName("client.O")
	public int field1046;

	@ObfuscatedName("client.V")
	public int field1053;

	@ObfuscatedName("client.Y")
	public int field1056;

	@ObfuscatedName("client.Z")
	public int field1057;

	@ObfuscatedName("client.Cb")
	public int field1084;

	@ObfuscatedName("client.Db")
	public int field1085;

	@ObfuscatedName("client.Eb")
	public int field1086;

	@ObfuscatedName("client.Fb")
	public int field1087;

	@ObfuscatedName("client.Ib")
	public int field1090;

	@ObfuscatedName("client.Jb")
	public int field1091;

	@ObfuscatedName("client.Kb")
	public int field1092;

	@ObfuscatedName("client.Pb")
	public int field1096;

	@ObfuscatedName("client.Zb")
	public int field1105;

	@ObfuscatedName("client.tc")
	public int field1122;

	@ObfuscatedName("client.Ec")
	public int field1132;

	@ObfuscatedName("client.Hc")
	public int field1134;

	@ObfuscatedName("client.Kc")
	public int field1137;

	@ObfuscatedName("client.Lc")
	public int field1138;

	@ObfuscatedName("client.Mc")
	public int field1139;

	@ObfuscatedName("client.Uc")
	public int field1145;

	@ObfuscatedName("client.Xc")
	public int field1148;

	@ObfuscatedName("client.ad")
	public int field1151;

	@ObfuscatedName("client.cd")
	public static int field1153;

	@ObfuscatedName("client.ed")
	public static int field1154;

	@ObfuscatedName("client.qd")
	public static int field1164;

	@ObfuscatedName("client.rd")
	public int field1165;

	@ObfuscatedName("client.sd")
	public int field1166;

	@ObfuscatedName("client.vd")
	public int field1169;

	@ObfuscatedName("client.Bd")
	public int field1175;

	@ObfuscatedName("client.Dd")
	public int field1177;

	@ObfuscatedName("client.Hd")
	public static int field1181;

	@ObfuscatedName("client.Nd")
	public int field1187;

	@ObfuscatedName("client.Od")
	public int field1188;

	@ObfuscatedName("client.Pd")
	public int field1189;

	@ObfuscatedName("client.Qd")
	public int field1190;

	@ObfuscatedName("client.Rd")
	public int field1191;

	@ObfuscatedName("client.Sd")
	public int field1192;

	@ObfuscatedName("client.Td")
	public static int field1193;

	@ObfuscatedName("client.Yd")
	public int field1198;

	@ObfuscatedName("client.Zd")
	public int field1199;

	@ObfuscatedName("client.ae")
	public int field1200;

	@ObfuscatedName("client.be")
	public int field1201;

	@ObfuscatedName("client.ce")
	public int field1202;

	@ObfuscatedName("client.de")
	public int field1203;

	@ObfuscatedName("client.ge")
	public int field1205;

	@ObfuscatedName("client.ie")
	public int field1207;

	@ObfuscatedName("client.ke")
	public int field1209;

	@ObfuscatedName("client.le")
	public int field1210;

	@ObfuscatedName("client.me")
	public int field1211;

	@ObfuscatedName("client.ne")
	public int field1212;

	@ObfuscatedName("client.pe")
	public int field1213;

	@ObfuscatedName("client.xe")
	public int field1220;

	@ObfuscatedName("client.ye")
	public int field1221;

	@ObfuscatedName("client.ze")
	public int field1222;

	@ObfuscatedName("client.Ae")
	public int field1223;

	@ObfuscatedName("client.Ge")
	public int field1229;

	@ObfuscatedName("client.He")
	public int field1230;

	@ObfuscatedName("client.Je")
	public int field1231;

	@ObfuscatedName("client.Ue")
	public int field1242;

	@ObfuscatedName("client.Ye")
	public int field1246;

	@ObfuscatedName("client.ff")
	public int field1251;

	@ObfuscatedName("client.gf")
	public int field1252;

	@ObfuscatedName("client.hf")
	public int field1253;

	@ObfuscatedName("client.jf")
	public int field1254;

	@ObfuscatedName("client.kf")
	public int field1255;

	@ObfuscatedName("client.lf")
	public static int field1256;

	@ObfuscatedName("client.pf")
	public int field1259;

	@ObfuscatedName("client.qf")
	public int field1260;

	@ObfuscatedName("client.rf")
	public int field1261;

	@ObfuscatedName("client.sf")
	public int field1262;

	@ObfuscatedName("client.tf")
	public int field1263;

	@ObfuscatedName("client.vf")
	public int field1265;

	@ObfuscatedName("client.xf")
	public int field1267;

	@ObfuscatedName("client.zf")
	public static int field1269;

	@ObfuscatedName("client.Af")
	public int field1270;

	@ObfuscatedName("client.Cf")
	public static int field1272;

	@ObfuscatedName("client.Gf")
	public int field1276;

	@ObfuscatedName("client.Qf")
	public static int field1286;

	@ObfuscatedName("client.Rf")
	public static int field1287;

	@ObfuscatedName("client.Uf")
	public int field1290;

	@ObfuscatedName("client.Xf")
	public int field1293;

	@ObfuscatedName("client.Zf")
	public int field1295;

	@ObfuscatedName("client.fg")
	public int field1299;

	@ObfuscatedName("client.gg")
	public int field1300;

	@ObfuscatedName("client.hg")
	public int field1301;

	@ObfuscatedName("client.ig")
	public int field1302;

	@ObfuscatedName("client.jg")
	public int field1303;

	@ObfuscatedName("client.kg")
	public static int field1304;

	@ObfuscatedName("client.lg")
	public int field1305;

	@ObfuscatedName("client.og")
	public int field1308;

	@ObfuscatedName("client.pg")
	public int field1309;

	@ObfuscatedName("client.qg")
	public int field1310;

	@ObfuscatedName("client.rg")
	public int field1311;

	@ObfuscatedName("client.sg")
	public static int field1312;

	@ObfuscatedName("client.wg")
	public int field1316;

	@ObfuscatedName("client.xg")
	public int field1317;

	@ObfuscatedName("client.yg")
	public int field1318;

	@ObfuscatedName("client.zg")
	public int field1319;

	@ObfuscatedName("client.Fg")
	public int field1324;

	@ObfuscatedName("client.Ig")
	public int field1327;

	@ObfuscatedName("client.Jg")
	public int field1328;

	@ObfuscatedName("client.Mg")
	public static int field1331;

	@ObfuscatedName("client.Sg")
	public int field1336;

	@ObfuscatedName("client.dh")
	public int field1343;

	@ObfuscatedName("client.kh")
	public int field1350;

	@ObfuscatedName("client.nh")
	public int field1353;

	@ObfuscatedName("client.oh")
	public int field1354;

	@ObfuscatedName("client.vh")
	public int field1361;

	@ObfuscatedName("client.xh")
	public int field1363;

	@ObfuscatedName("client.Dh")
	public int field1368;

	@ObfuscatedName("client.Wh")
	public int field1387;

	@ObfuscatedName("client.Xh")
	public int field1388;

	@ObfuscatedName("client.ai")
	public int field1391;

	@ObfuscatedName("client.ci")
	public static int field1393;

	@ObfuscatedName("client.ni")
	public int field1403;

	@ObfuscatedName("client.qi")
	public int field1406;

	@ObfuscatedName("client.ui")
	public static int field1410;

	@ObfuscatedName("client.xi")
	public int field1411;

	@ObfuscatedName("client.zi")
	public int field1413;

	@ObfuscatedName("client.Di")
	public int field1417;

	@ObfuscatedName("client.Ki")
	public static int field1422;

	@ObfuscatedName("client.Li")
	public int field1423;

	@ObfuscatedName("client.Mi")
	public int field1424;

	@ObfuscatedName("client.Ri")
	public int field1429;

	@ObfuscatedName("client.Ui")
	public int field1432;

	@ObfuscatedName("client.cj")
	public int field1440;

	@ObfuscatedName("client.ej")
	public int field1442;

	@ObfuscatedName("client.hj")
	public int field1445;

	@ObfuscatedName("client.ij")
	public int field1446;

	@ObfuscatedName("client.jj")
	public int field1447;

	@ObfuscatedName("client.kj")
	public int field1448;

	@ObfuscatedName("client.lj")
	public int field1449;

	@ObfuscatedName("client.mj")
	public int field1450;

	@ObfuscatedName("client.oj")
	public int field1452;

	@ObfuscatedName("client.tj")
	public int field1456;

	@ObfuscatedName("client.yj")
	public static int field1460;

	@ObfuscatedName("client.De")
	public long field1226;

	@ObfuscatedName("client.Hg")
	public long field1326;

	@ObfuscatedName("client.Uh")
	public long field1385;

	@ObfuscatedName("client.Si")
	public long field1430;

	@ObfuscatedName("client.qj")
	public long field1453;

	@ObfuscatedName("client.Jc")
	public class18 field1136;

	@ObfuscatedName("client.Gc")
	public static class27 field1133;

	@ObfuscatedName("client.Q")
	public class35 field1048;

	@ObfuscatedName("client.ud")
	public class35 field1168;

	@ObfuscatedName("client.af")
	public class35 field1248;

	@ObfuscatedName("client.bf")
	public class35 field1249;

	@ObfuscatedName("client.Ng")
	public class35 field1332;

	@ObfuscatedName("client.Og")
	public class35 field1333;

	@ObfuscatedName("client.fh")
	public class35 field1345;

	@ObfuscatedName("client.gh")
	public class35 field1346;

	@ObfuscatedName("client.hh")
	public class35 field1347;

	@ObfuscatedName("client.ih")
	public class35 field1348;

	@ObfuscatedName("client.ph")
	public class35 field1355;

	@ObfuscatedName("client.R")
	public class36 field1049;

	@ObfuscatedName("client.S")
	public class36 field1050;

	@ObfuscatedName("client.T")
	public class36 field1051;

	@ObfuscatedName("client.vc")
	public class36 field1124;

	@ObfuscatedName("client.wc")
	public class36 field1125;

	@ObfuscatedName("client.xc")
	public class36 field1126;

	@ObfuscatedName("client.yc")
	public class36 field1127;

	@ObfuscatedName("client.zc")
	public class36 field1128;

	@ObfuscatedName("client.Ed")
	public class36 field1178;

	@ObfuscatedName("client.Fd")
	public class36 field1179;

	@ObfuscatedName("client.Gh")
	public class36 field1371;

	@ObfuscatedName("client.Hh")
	public class36 field1372;

	@ObfuscatedName("client.Ih")
	public class36 field1373;

	@ObfuscatedName("client.hi")
	public class36 field1397;

	@ObfuscatedName("client.ii")
	public class36 field1398;

	@ObfuscatedName("client.ji")
	public class36 field1399;

	@ObfuscatedName("client.ki")
	public class36 field1400;

	@ObfuscatedName("client.li")
	public class36 field1401;

	@ObfuscatedName("client.Hi")
	public class36 field1420;

	@ObfuscatedName("client.Ii")
	public class36 field1421;

	@ObfuscatedName("client.te")
	public class37 field1216;

	@ObfuscatedName("client.ue")
	public class37 field1217;

	@ObfuscatedName("client.ve")
	public class37 field1218;

	@ObfuscatedName("client.we")
	public class37 field1219;

	@ObfuscatedName("client.Id")
	public class43 field1182;

	@ObfuscatedName("client.Jd")
	public class43 field1183;

	@ObfuscatedName("client.Kd")
	public class43 field1184;

	@ObfuscatedName("client.Ld")
	public class43 field1185;

	@ObfuscatedName("client.Ke")
	public class43 field1232;

	@ObfuscatedName("client.Le")
	public class43 field1233;

	@ObfuscatedName("client.Me")
	public class43 field1234;

	@ObfuscatedName("client.Ne")
	public class43 field1235;

	@ObfuscatedName("client.Oe")
	public class43 field1236;

	@ObfuscatedName("client.Pe")
	public class43 field1237;

	@ObfuscatedName("client.Qe")
	public class43 field1238;

	@ObfuscatedName("client.Re")
	public class43 field1239;

	@ObfuscatedName("client.Se")
	public class43 field1240;

	@ObfuscatedName("client.qh")
	public class43 field1356;

	@ObfuscatedName("client.rh")
	public class43 field1357;

	@ObfuscatedName("client.sh")
	public class43 field1358;

	@ObfuscatedName("client.Kh")
	public class43 field1375;

	@ObfuscatedName("client.Lh")
	public class43 field1376;

	@ObfuscatedName("client.Mh")
	public class43 field1377;

	@ObfuscatedName("client.Nh")
	public class43 field1378;

	@ObfuscatedName("client.Oh")
	public class43 field1379;

	@ObfuscatedName("client.Ph")
	public class43 field1380;

	@ObfuscatedName("client.Qh")
	public class43 field1381;

	@ObfuscatedName("client.Rh")
	public class43 field1382;

	@ObfuscatedName("client.Sh")
	public class43 field1383;

	@ObfuscatedName("client.Th")
	public class47 field1384;

	@ObfuscatedName("client.Sf")
	public class49 field1288;

	@ObfuscatedName("client.Ti")
	public class50 field1431;

	@ObfuscatedName("client.Ve")
	public class58 field1243;

	@ObfuscatedName("client.Jh")
	public class5 field1374;

	@ObfuscatedName("client.Gb")
	public String field1088;

	@ObfuscatedName("client.ti")
	public String field1409;

	@ObfuscatedName("client.yi")
	public String field1412;

	@ObfuscatedName("client.Cd")
	public Socket field1176;

	@ObfuscatedName("client.Te")
	public static boolean field1241;

	@ObfuscatedName("client.Ef")
	public static boolean field1274;

	@ObfuscatedName("client.Wb")
	public int[] field1102;

	@ObfuscatedName("client.Xb")
	public int[] field1103;

	@ObfuscatedName("client.Yb")
	public int[] field1104;

	@ObfuscatedName("client.ld")
	public int[] field1159;

	@ObfuscatedName("client.md")
	public int[] field1160;

	@ObfuscatedName("client.nd")
	public int[] field1161;

	@ObfuscatedName("client.od")
	public int[] field1162;

	@ObfuscatedName("client.Wd")
	public int[] field1196;

	@ObfuscatedName("client.Xd")
	public int[] field1197;

	@ObfuscatedName("client.Vi")
	public int[] field1433;

	@ObfuscatedName("client.Wi")
	public int[] field1434;

	@ObfuscatedName("client.Xi")
	public int[] field1435;

	@ObfuscatedName("client.rj")
	public class36[] field1454;

	@ObfuscatedName("client.Vg")
	public byte[][] field1338;

	@ObfuscatedName("client.vj")
	public byte[][] field1457;

	@ObfuscatedName("client.uh")
	public byte[][][] field1360;

	@ObfuscatedName("client.uf")
	public int[][][] field1264;

	@ObfuscatedName("client.a(IIIILd;)V")
	public final void method422(int arg0, int arg1, int arg2, class4 arg3) {
		if (arg3.field63 == 0 && arg3.field78 != null && (!arg3.field77 || field1231 == arg3.field61 || field1456 == arg3.field61 || field1255 == arg3.field61)) {
			int var5 = class33.field563;
			int var6 = class33.field561;
			int var7 = class33.field564;
			int var8 = class33.field562;
			class33.method153(arg1, arg3.field66 + arg1, arg2, arg3.field67 + arg2);
			int var9 = arg3.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field79[var10] + arg1;
				int var12 = arg3.field80[var10] + arg2 - arg0;
				class4 var13 = class4.field56[arg3.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method497(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method422(var13.field76, var11, var12, var13);

					if (var13.field75 > var13.field67) {
						method425(var13.field76, var13.field66 + var11, var13.field67, var13.field75, var12);
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
									if (var17 > class33.field563 - 32 && var17 < class33.field564 && var18 > class33.field561 - 32 && var18 < class33.field562 || field1447 != 0 && field1446 == var14) {
										int var22 = 0;
										if (field1084 == 1 && field1085 == var14 && field1086 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method347(var21, var22, var13.field58[var14]);
										if (var23 != null) {
											if (field1447 != 0 && field1446 == var14 && field1445 == var13.field61) {
												var19 = field17 - field1448;
												var20 = field18 - field1449;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1417 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method187(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < class33.field561 && arg3.field76 > 0) {
													int var24 = (class33.field561 - var18 - var20) * field1053 / 3;
													if (var24 > field1053 * 10) {
														var24 = field1053 * 10;
													}

													if (var24 > arg3.field76) {
														var24 = arg3.field76;
													}

													arg3.field76 -= var24;
													field1449 += var24;
												}

												if (var18 + var20 + 32 > class33.field562 && arg3.field76 < arg3.field75 - arg3.field67) {
													int var25 = (var18 + var20 + 32 - class33.field562) * field1053 / 3;
													if (var25 > field1053 * 10) {
														var25 = field1053 * 10;
													}

													if (var25 > arg3.field75 - arg3.field67 - arg3.field76) {
														var25 = arg3.field75 - arg3.field67 - arg3.field76;
													}

													arg3.field76 += var25;
													field1449 -= var25;
												}
											} else if (field1319 != 0 && field1318 == var14 && field1317 == var13.field61) {
												var23.method187(var17, 128, var18);
											} else {
												var23.method185(var18, var17);
											}

											if (var23.field596 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1216.method203(var17 + var19 + 1, 0, method494(var26), var18 + var20 + 10);
												field1216.method203(var17 + var19, 0xFFFF00, method494(var26), var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									class35 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method185(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field63 == 3) {
						boolean var28 = false;
						if (field1255 == var13.field61 || field1456 == var13.field61 || field1231 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method438(var13)) {
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
								class33.method156(var29, var13.field66, var12, var13.field67, var11);
							} else {
								class33.method157(var13.field66, var13.field67, var11, var12, var29);
							}
						} else if (var13.field93) {
							class33.method155(var13.field66, var29, 256 - (var13.field68 & 0xFF), var11, var12, var13.field67);
						} else {
							class33.method158(256 - (var13.field68 & 0xFF), var11, var13.field67, var29, var12, var13.field66);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1255 == var13.field61 || field1456 == var13.field61 || field1231 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method438(var13)) {
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

						if (var13.field64 == 6 && field1089) {
							var31 = "Please wait...";
							var33 = var13.field99;
						}

						if (class33.field559 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field612 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method511(method475(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method511(method475(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method511(method475(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method511(method475(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method511(method475(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method201(var41, var34, var33, var13.field95, var13.field66 / 2 + var11);
							} else {
								var30.method205(var41, var34, var33, var11, var13.field95);
							}

							var34 += var30.field612;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method438(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method185(var12, var11);
						}
					} else if (var13.field63 == 6) {
						int var43 = class34.field573;
						int var44 = class34.field574;
						class34.field573 = var13.field66 / 2 + var11;
						class34.field574 = var13.field67 / 2 + var12;
						int var45 = class34.field577[var13.field112] * var13.field111 >> 16;
						int var46 = class34.field578[var13.field112] * var13.field111 >> 16;
						boolean var47 = method438(var13);
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
							class66 var50 = class66.field982[var48];
							var49 = var13.method34(var50.field984[var13.field59], var47, var50.field985[var13.field59]);
						}

						if (var49 != null) {
							var49.method145(0, var13.field113, 0, var13.field112, 0, var45, var46);
						}

						class34.field573 = var43;
						class34.field574 = var44;
					} else if (var13.field63 == 7) {
						class37 var51 = var13.field96;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field67; var53++) {
							for (int var54 = 0; var54 < var13.field66; var54++) {
								if (var13.field57[var52] > 0) {
									class60 var55 = class60.method341(var13.field57[var52] - 1);
									String var56 = var55.field902;
									if (var55.field913 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method435(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method201(var56, var58, var13.field99, var13.field95, var13.field66 / 2 + var57);
									} else {
										var51.method205(var56, var58, var13.field99, var57, var13.field95);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method153(var5, var7, var6, var8);
		}
	}

	public final void run() {
		if (field1313) {
			method452();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method423() {
		class57.field854.method103();
		class57.field855.method103();
		class59.field893.method103();
		class60.field939.method103();
		class60.field940.method103();
		class27.field439.method103();
		class68.field1013.method103();
	}

	@ObfuscatedName("client.e(I)V")
	public final void method424() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1424 + field1076 & 0x7FF;
				int var4 = class34.field577[var3];
				int var5 = class34.field578[var3];
				var4 = (field1246 + 256) * var4 >> 8;
				var5 = (field1246 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1133.field360 + var6 >> 7;
				int var9 = field1133.field361 - var7 >> 7;
				boolean var10 = method429(var9, 1, field1133.field411[0], 0, true, var8, 0, field1133.field410[0], 0, 0, 0);
				if (var10) {
					field1144.method214(var1);
					field1144.method214(var2);
					field1144.method215(field1076);
					field1144.method214(57);
					field1144.method214(field1424);
					field1144.method214(field1246);
					field1144.method214(89);
					field1144.method215(field1133.field360);
					field1144.method215(field1133.field361);
					field1144.method214(field1450);
					field1144.method214(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method425(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1420.method198(arg4, arg1);
		field1421.method198(arg2 + arg4 - 16, arg1);
		class33.method156(field1325, 16, arg4 + 16, arg2 - 32, arg1);
		int var6 = (arg2 - 32) * arg2 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg0 / (arg3 - arg2);
		class33.method156(field1396, 16, arg4 + var7 + 16, var6, arg1);
		class33.method161(var6, arg4 + var7 + 16, arg1, field1390);
		class33.method161(var6, arg4 + var7 + 16, arg1 + 1, field1390);
		class33.method159(arg1, field1390, arg4 + var7 + 16, 16);
		class33.method159(arg1, field1390, arg4 + var7 + 17, 16);
		class33.method161(var6, arg4 + var7 + 16, arg1 + 15, field1123);
		class33.method161(var6 - 1, arg4 + 17 + var7, arg1 + 14, field1123);
		class33.method159(arg1, field1123, arg4 + var7 + var6 + 15, 16);
		class33.method159(arg1 + 1, field1123, arg4 + var7 + var6 + 14, 15);
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(ZIIIIII)V")
	public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = class31.field545[var7];
			int var13 = class31.field546[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field545[var8];
			int var16 = class31.field546[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1299 = arg0 - var9;
		field1300 = arg4 - var10;
		field1301 = arg2 - var11;
		field1302 = arg3;
		field1303 = arg5;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method427(String arg0) throws IOException {
		if (field1100) {
			if (field1176 != null) {
				try {
					field1176.close();
				} catch (Exception var4) {
				}

				field1176 = null;
			}

			field1176 = method530(43595);
			field1176.setSoTimeout(10000);
			InputStream var2 = field1176.getInputStream();
			OutputStream var3 = field1176.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a([BIZ)Z")
	public final boolean method428(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IIIIIZIIIIII)Z")
	public final boolean method429(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1180[var14][var15] = 0;
				field1069[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg2;
		field1180[arg7][arg2] = 99;
		field1069[arg7][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1149[var18] = arg7;
		int var35 = var18 + 1;
		field1150[var18] = arg2;
		boolean var20 = false;
		int var21 = field1149.length;
		int[][] var22 = field1107[field1432].field947;
		while (var35 != var19) {
			var16 = field1149[var19];
			var17 = field1150[var19];
			var19 = (var19 + 1) % var21;

			if (arg5 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && field1107[field1432].method361(var16, arg5, arg3, arg9 - 1, var17, arg0)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && field1107[field1432].method362(var16, var17, arg3, arg0, arg9 - 1, arg5)) {
					var20 = true;
					break;
				}
			}

			if (arg6 != 0 && arg10 != 0 && field1107[field1432].method363(arg6, var17, arg0, arg5, arg8, var16, arg10)) {
				var20 = true;
				break;
			}

			int var23 = field1069[var16][var17] + 1;
			if (var16 > 0 && field1180[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1149[var35] = var16 - 1;
				field1150[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1180[var16 - 1][var17] = 2;
				field1069[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1180[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1149[var35] = var16 + 1;
				field1150[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1180[var16 + 1][var17] = 8;
				field1069[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1180[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1149[var35] = var16;
				field1150[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1180[var16][var17 - 1] = 1;
				field1069[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1180[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1149[var35] = var16;
				field1150[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1180[var16][var17 + 1] = 4;
				field1069[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1180[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1149[var35] = var16 - 1;
				field1150[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1180[var16 - 1][var17 - 1] = 3;
				field1069[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1180[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1149[var35] = var16 + 1;
				field1150[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1180[var16 + 1][var17 - 1] = 9;
				field1069[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1180[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1149[var35] = var16 - 1;
				field1150[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1180[var16 - 1][var17 + 1] = 6;
				field1069[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1180[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1149[var35] = var16 + 1;
				field1150[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1180[var16 + 1][var17 + 1] = 12;
				field1069[var16 + 1][var17 + 1] = var23;
			}
		}

		field1450 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg5 - var25; var26 <= arg5 + var25; var26++) {
						for (int var27 = arg0 - var25; var27 <= arg0 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1069[var26][var27] < var24) {
								var24 = field1069[var26][var27];
								var16 = var26;
								var17 = var27;
								field1450 = 1;
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
		field1149[var28] = var16;
		int var36 = var28 + 1;
		field1150[var28] = var17;
		int var29;
		int var30 = var29 = field1180[var16][var17];
		while (arg7 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1149[var36] = var16;
				field1150[var36++] = var17;
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

			var30 = field1180[var16][var17];
		}

		if (var36 <= 0) {
			if (arg1 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1149[var36];
		int var33 = field1150[var36];

		if (arg1 == 0) {
			field1144.method213(6);
			field1144.method214(var31 + var31 + 3);
		}

		if (arg1 == 1) {
			field1144.method213(220);
			field1144.method214(var31 + var31 + 3 + 14);
		}

		if (arg1 == 2) {
			field1144.method213(127);
			field1144.method214(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1144.method214(1);
		} else {
			field1144.method214(0);
		}

		field1144.method215(field1209 + var32);
		field1144.method215(field1210 + var33);
		field1353 = field1149[0];
		field1354 = field1150[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1144.method214(field1149[var36] - var32);
			field1144.method214(field1150[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method430() {
		try {
			if (field1374 != null) {
				field1374.method38();
			}
		} catch (Exception var2) {
		}

		field1374 = null;
		field1320 = false;
		field1177 = 0;
		field1118 = "";
		field1119 = "";
		method423();
		field1136.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1107[var1].method352();
		}

		System.gc();
		method543();
		field1294 = -1;
		field1361 = -1;
		field1305 = 0;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method431() {
		try {
			int var1 = field1133.field360 + field1368;
			int var2 = field1133.field361 + field1205;
			if (field1090 - var1 < -500 || field1090 - var1 > 500 || field1091 - var2 < -500 || field1091 - var2 > 500) {
				field1090 = var1;
				field1091 = var2;
			}

			if (field1090 != var1) {
				field1090 += (var1 - field1090) / 16;
			}

			if (field1091 != var2) {
				field1091 += (var2 - field1091) / 16;
			}

			if (field27[1] == 1) {
				field1077 += (-field1077 - 24) / 2;
			} else if (field27[2] == 1) {
				field1077 += (24 - field1077) / 2;
			} else {
				field1077 /= 2;
			}

			if (field27[3] == 1) {
				field1078 += (12 - field1078) / 2;
			} else if (field27[4] == 1) {
				field1078 += (-field1078 - 12) / 2;
			} else {
				field1078 /= 2;
			}

			field1076 = field1077 / 2 + field1076 & 0x7FF;
			field1075 += field1078 / 2;
			if (field1075 < 128) {
				field1075 = 128;
			}

			if (field1075 > 383) {
				field1075 = 383;
			}

			int var3 = field1090 >> 7;
			int var4 = field1091 >> 7;
			int var5 = method525(field1432, field1090, field1091);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1432;
						if (var9 < 3 && (field1360[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1264[var9][var7][var8];
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

			if (var11 > field1429) {
				field1429 += (var11 - field1429) / 24;
			} else if (var11 < field1429) {
				field1429 += (var11 - field1429) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1133.field360 + "," + field1133.field361 + "," + field1090 + "," + field1091 + "," + field1045 + "," + field1046 + "," + field1209 + "," + field1210);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.f(I)V")
	public static final void method432() {
		class18.field258 = true;
		class34.field568 = true;
		field1274 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method433(boolean arg0) {
		if (field1133.field360 >> 7 == field1353 && field1133.field361 >> 7 == field1354) {
			field1353 = 0;
			field1269++;
			if (field1269 > 122) {
				field1269 = 0;
				field1144.method213(36);
				field1144.method214(62);
			}
		}

		int var2 = field1440;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1133;
				var5 = field1438 << 14;
			} else {
				var4 = field1439[field1441[var3]];
				var5 = field1441[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1274 && field1440 > 50 || field1440 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1410 < var4.field426 || field1410 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1418[var6][var7] == field1267) {
								continue;
							}

							field1418[var6][var7] = field1267;
						}

						var4.field425 = method525(field1432, var4.field360, var4.field361);
						field1136.method61(var4.field362, var4.field361, var4.field363, var4.field360, var4.field425, var4, field1432, 60, var5);
					} else {
						var4.field436 = false;
						var4.field425 = method525(field1432, var4.field360, var4.field361);
						field1136.method62(var4.field360, var4.field435, var4, var5, var4.field361, var4.field362, var4.field434, 60, var4.field425, var4.field432, field1432, var4.field433);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method434() {
		field1182.method253();
		class34.field579 = field1434;
		field1049.method198(0, 0);

		if (field1370 != -1) {
			method422(0, 0, 0, class4.field56[field1370]);
		} else if (field1163[field1292] != -1) {
			method422(0, 0, 0, class4.field56[field1163[field1292]]);
		}

		if (field1250 && field1188 == 1) {
			method547();
		}

		field1182.method254(553, 205, field9);
		field1184.method253();
		class34.field579 = field1435;
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String method435(int arg0) {
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

	@ObfuscatedName("client.a(Llb;II)V")
	public final void method436(class38 arg0, int arg1) {
		while (arg0.field617 + 10 < arg1 * 8) {
			int var3 = arg0.method235(11);
			if (var3 == 2047) {
				break;
			}

			if (field1439[var3] == null) {
				field1439[var3] = new class27();
				if (field1444[var3] != null) {
					field1439[var3].method116(field1444[var3]);
				}
			}

			field1441[field1440++] = var3;
			class27 var4 = field1439[var3];
			var4.field405 = field1410;
			int var5 = arg0.method235(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method235(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method235(1);
			var4.method110(field1133.field410[0] + var5, var7 == 1, field1133.field411[0] + var6);
			int var8 = arg0.method235(1);
			if (var8 == 1) {
				field1443[field1442++] = var3;
			}
		}

		arg0.method236();
	}

	@ObfuscatedName("client.c(B)V")
	public final void method437() {
		for (int var1 = 0; var1 < field1145; var1++) {
			if (field1131[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1459[var1] != field1297 || field1109[var1] != field1054) {
						class38 var3 = class55.method314(field1459[var1], field1109[var1]);
						if (System.currentTimeMillis() + var3.field616 / 22 > field1406 / 22 + field1430) {
							field1406 = var3.field616;
							field1430 = System.currentTimeMillis();

							if (method428(var3.field615, var3.field616)) {
								field1297 = field1459[var1];
								field1054 = field1109[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method490()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1131[var1] != -5) {
					field1131[var1] = -5;
				} else {
					field1145--;
					for (int var5 = var1; var5 < field1145; var5++) {
						field1459[var5] = field1459[var5 + 1];
						field1109[var5] = field1109[var5 + 1];
						field1131[var5] = field1131[var5 + 1];
					}

					var1--;
				}
			} else {
				field1131[var1]--;
			}
		}

		if (field1305 > 0) {
			field1305 -= 20;
			if (field1305 < 0) {
				field1305 = 0;
			}

			if (field1305 == 0 && field1108 && !field1274) {
				field1361 = field1294;
				field1362 = false;
				field1384.method274(2, field1361);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method438(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method475(arg0, var2);
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

	@ObfuscatedName("client.g(I)V")
	public final void method439() {
		field1165 = 0;
		int var1 = (field1133.field360 >> 7) + field1209;
		int var2 = (field1133.field361 >> 7) + field1210;
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

	@ObfuscatedName("client.h(I)V")
	public final void method440() {
		if (field1074 != 0) {
			int var1 = 0;
			if (field1213 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1099[var2] != null) {
					int var3 = field1097[var2];
					String var4 = field1098[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1105 == 0 || field1105 == 1 && method445(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1217.method202("From:  " + var4 + field1099[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1363 >= 1) {
									field1307[field1096] = "Report abuse @whi@" + var4;
									field1366[field1096] = 2524;
									field1096++;
								}

								field1307[field1096] = "Add ignore @whi@" + var4;
								field1366[field1096] = 2047;
								field1096++;
								field1307[field1096] = "Add friend @whi@" + var4;
								field1366[field1096] = 2605;
								field1096++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1105 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;BI)V")
	public final void method441(class38 arg0, int arg1) {
		while (arg0.field617 + 21 < arg1 * 8) {
			int var3 = arg0.method235(14);
			if (var3 == 16383) {
				break;
			}

			if (field1349[var3] == null) {
				field1349[var3] = new class26();
			}

			class26 var4 = field1349[var3];
			field1351[field1350++] = var3;
			var4.field405 = field1410;
			var4.field415 = class59.method335(arg0.method235(11));
			var4.field364 = var4.field415.field870;
			var4.field408 = var4.field415.field892;
			var4.field367 = var4.field415.field874;
			var4.field368 = var4.field415.field875;
			var4.field369 = var4.field415.field876;
			var4.field370 = var4.field415.field877;
			var4.field365 = var4.field415.field873;
			int var5 = arg0.method235(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method235(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method110(field1133.field410[0] + var5, false, field1133.field411[0] + var6);
			int var7 = arg0.method235(1);
			if (var7 == 1) {
				field1443[field1442++] = var3;
			}
		}

		arg0.method236();
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void method442(class38 arg0, int arg1) {
		arg0.method234();
		int var3 = arg0.method235(8);
		if (var3 < field1350) {
			for (int var4 = var3; var4 < field1350; var4++) {
				field1266[field1265++] = field1351[var4];
			}
		}

		if (var3 > field1350) {
			signlink.reporterror(field1118 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1350 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1351[var5];
			class26 var7 = field1349[var6];
			int var8 = arg0.method235(1);
			if (var8 == 0) {
				field1351[field1350++] = var6;
				var7.field405 = field1410;
			} else {
				int var9 = arg0.method235(2);
				if (var9 == 0) {
					field1351[field1350++] = var6;
					var7.field405 = field1410;
					field1443[field1442++] = var6;
				} else if (var9 == 1) {
					field1351[field1350++] = var6;
					var7.field405 = field1410;
					int var10 = arg0.method235(3);
					var7.method111(var10, false);
					int var11 = arg0.method235(1);
					if (var11 == 1) {
						field1443[field1442++] = var6;
					}
				} else if (var9 == 2) {
					field1351[field1350++] = var6;
					var7.field405 = field1410;
					int var12 = arg0.method235(3);
					var7.method111(var12, true);
					int var13 = arg0.method235(3);
					var7.method111(var13, true);
					int var14 = arg0.method235(1);
					if (var14 == 1) {
						field1443[field1442++] = var6;
					}
				} else if (var9 == 3) {
					field1266[field1265++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method443(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(IIIIIILd;)V")
	public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, class4 arg5) {
		if (arg5.field63 == 0 && arg5.field78 != null && !arg5.field77 && (arg4 >= arg3 && arg0 >= arg2 && arg4 <= arg5.field66 + arg3 && arg0 <= arg5.field67 + arg2)) {
			int var7 = arg5.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field79[var8] + arg3;
				int var10 = arg5.field80[var8] + arg2 - arg1;
				class4 var11 = class4.field56[arg5.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg4 >= var9 && arg0 >= var10 && arg4 < var11.field66 + var9 && arg0 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1134 = var11.field74;
					} else {
						field1134 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method444(arg0, var11.field76, var10, var9, arg4, var11);

					if (var11.field75 > var11.field67) {
						method473(var11, var11.field66 + var9, var11.field67, var10, var11.field75, true, arg4, arg0);
					}
				} else {
					if (var11.field64 == 1 && arg4 >= var9 && arg0 >= var10 && arg4 < var11.field66 + var9 && arg0 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method512(var11);
						}

						if (!var12) {
							field1307[field1096] = var11.field117;
							field1366[field1096] = 231;
							field1365[field1096] = var11.field61;
							field1096++;
						}
					}

					if (var11.field64 == 2 && field1057 == 0 && arg4 >= var9 && arg0 >= var10 && arg4 < var11.field66 + var9 && arg0 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1307[field1096] = var13 + " @gre@" + var11.field115;
						field1366[field1096] = 274;
						field1365[field1096] = var11.field61;
						field1096++;
					}

					if (var11.field64 == 3 && arg4 >= var9 && arg0 >= var10 && arg4 < var11.field66 + var9 && arg0 < var11.field67 + var10) {
						field1307[field1096] = "Close";
						field1366[field1096] = 737;
						field1365[field1096] = var11.field61;
						field1096++;
					}

					if (var11.field64 == 4 && arg4 >= var9 && arg0 >= var10 && arg4 < var11.field66 + var9 && arg0 < var11.field67 + var10) {
						field1307[field1096] = var11.field117;
						field1366[field1096] = 435;
						field1365[field1096] = var11.field61;
						field1096++;
					}

					if (var11.field64 == 5 && arg4 >= var9 && arg0 >= var10 && arg4 < var11.field66 + var9 && arg0 < var11.field67 + var10) {
						field1307[field1096] = var11.field117;
						field1366[field1096] = 225;
						field1365[field1096] = var11.field61;
						field1096++;
					}

					if (var11.field64 == 6 && !field1089 && arg4 >= var9 && arg0 >= var10 && arg4 < var11.field66 + var9 && arg0 < var11.field67 + var10) {
						field1307[field1096] = var11.field117;
						field1366[field1096] = 997;
						field1365[field1096] = var11.field61;
						field1096++;
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

								if (arg4 >= var17 && arg0 >= var18 && arg4 < var17 + 32 && arg0 < var18 + 32) {
									field1120 = var14;
									field1121 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method341(var11.field57[var14] - 1);
										if (field1084 == 1 && var11.field84) {
											if (field1086 != var11.field61 || field1085 != var14) {
												field1307[field1096] = "Use " + field1088 + " with @lre@" + var19.field902;
												field1366[field1096] = 398;
												field1367[field1096] = var19.field900;
												field1364[field1096] = var14;
												field1365[field1096] = var11.field61;
												field1096++;
											}
										} else if (field1057 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field917 != null && var19.field917[var20] != null) {
														field1307[field1096] = var19.field917[var20] + " @lre@" + var19.field902;

														if (var20 == 3) {
															field1366[field1096] = 681;
														}

														if (var20 == 4) {
															field1366[field1096] = 100;
														}

														field1367[field1096] = var19.field900;
														field1364[field1096] = var14;
														field1365[field1096] = var11.field61;
														field1096++;
													} else if (var20 == 4) {
														field1307[field1096] = "Drop @lre@" + var19.field902;
														field1366[field1096] = 100;
														field1367[field1096] = var19.field900;
														field1364[field1096] = var14;
														field1365[field1096] = var11.field61;
														field1096++;
													}
												}
											}

											if (var11.field85) {
												field1307[field1096] = "Use @lre@" + var19.field902;
												field1366[field1096] = 102;
												field1367[field1096] = var19.field900;
												field1364[field1096] = var14;
												field1365[field1096] = var11.field61;
												field1096++;
											}

											if (var11.field84 && var19.field917 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field917[var21] != null) {
														field1307[field1096] = var19.field917[var21] + " @lre@" + var19.field902;

														if (var21 == 0) {
															field1366[field1096] = 694;
														}

														if (var21 == 1) {
															field1366[field1096] = 962;
														}

														if (var21 == 2) {
															field1366[field1096] = 795;
														}

														field1367[field1096] = var19.field900;
														field1364[field1096] = var14;
														field1365[field1096] = var11.field61;
														field1096++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1307[field1096] = var11.field92[var22] + " @lre@" + var19.field902;

														if (var22 == 0) {
															field1366[field1096] = 582;
														}

														if (var22 == 1) {
															field1366[field1096] = 113;
														}

														if (var22 == 2) {
															field1366[field1096] = 555;
														}

														if (var22 == 3) {
															field1366[field1096] = 331;
														}

														if (var22 == 4) {
															field1366[field1096] = 354;
														}

														field1367[field1096] = var19.field900;
														field1364[field1096] = var14;
														field1365[field1096] = var11.field61;
														field1096++;
													}
												}
											}

											field1307[field1096] = "Examine @lre@" + var19.field902;
											field1366[field1096] = 1328;
											field1367[field1096] = var19.field900;
											field1364[field1096] = var14;
											field1365[field1096] = var11.field61;
											field1096++;
										} else if ((field1059 & 0x10) == 0x10) {
											field1307[field1096] = field1060 + " @lre@" + var19.field902;
											field1366[field1096] = 563;
											field1367[field1096] = var19.field900;
											field1364[field1096] = var14;
											field1365[field1096] = var11.field61;
											field1096++;
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

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method445(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1229; var2++) {
			if (arg0.equalsIgnoreCase(field1111[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1133.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(Llb;II)V")
	public final void method446(class38 arg0, int arg1) {
		if (arg1 == 70 || arg1 == 88) {
			int var3 = arg0.method224();
			int var4 = (var3 >> 4 & 0x7) + field1137;
			int var5 = (var3 & 0x7) + field1138;
			int var6 = arg0.method224();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1055[var7];
			int var10;
			if (arg1 == 88) {
				var10 = -1;
			} else {
				var10 = arg0.method226();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method524(-1, var7, 0, var4, var8, var10, var5, var9, field1432);
			}
		} else if (arg1 == 30) {
			int var11 = arg0.method224();
			int var12 = (var11 >> 4 & 0x7) + field1137;
			int var13 = (var11 & 0x7) + field1138;
			int var14 = arg0.method224();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1055[var15];
			int var18 = arg0.method226();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1264[field1432][var12][var13];
				int var20 = field1264[field1432][var12 + 1][var13];
				int var21 = field1264[field1432][var12 + 1][var13 + 1];
				int var22 = field1264[field1432][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1136.method72(var13, var12, field1432);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var24, 2, var20, var18, var19, false, var16 + 4, var22, var21);
							var23.field255 = new class28(var24, 2, var20, var18, var19, false, var16 + 1 & 0x3, var22, var21);
						} else {
							var23.field254 = new class28(var24, var15, var20, var18, var19, false, var16, var22, var21);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1136.method73(field1432, var12, var13);
					if (var25 != null) {
						var25.field147 = new class28(var25.field148 >> 14 & 0x7FFF, 4, var20, var18, var19, false, 0, var22, var21);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1136.method74(var12, var13, field1432);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var26.field247 >> 14 & 0x7FFF, var15, var20, var18, var19, false, var16, var22, var21);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1136.method75(field1432, var13, var12);
					if (var27 != null) {
						var27.field178 = new class28(var27.field179 >> 14 & 0x7FFF, 22, var20, var18, var19, false, var16, var22, var21);
					}
				}
			}
		} else if (arg1 == 120) {
			int var28 = arg0.method224();
			int var29 = (var28 >> 4 & 0x7) + field1137;
			int var30 = (var28 & 0x7) + field1138;
			int var31 = arg0.method226();
			int var32 = arg0.method226();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field450 = var31;
				var33.field451 = var32;

				if (field1158[field1432][var29][var30] == null) {
					field1158[field1432][var29][var30] = new class41();
				}

				field1158[field1432][var29][var30].method240(var33);
				method491(var29, var30);
			}
		} else if (arg1 == 115) {
			int var34 = arg0.method224();
			int var35 = (var34 >> 4 & 0x7) + field1137;
			int var36 = (var34 & 0x7) + field1138;
			int var37 = arg0.method226();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1158[field1432][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method243(); var39 != null; var39 = (class29) var38.method245()) {
						if ((var37 & 0x7FFF) == var39.field450) {
							var39.method106();
							break;
						}
					}

					if (var38.method243() == null) {
						field1158[field1432][var35][var36] = null;
					}

					method491(var35, var36);
				}
			}
		} else if (arg1 == 37) {
			int var40 = arg0.method224();
			int var41 = (var40 >> 4 & 0x7) + field1137;
			int var42 = (var40 & 0x7) + field1138;
			int var43 = var41 + arg0.method225();
			int var44 = var42 + arg0.method225();
			int var45 = arg0.method227();
			int var46 = arg0.method226();
			int var47 = arg0.method224() * 4;
			int var48 = arg0.method224() * 4;
			int var49 = arg0.method226();
			int var50 = arg0.method226();
			int var51 = arg0.method224();
			int var52 = arg0.method224();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class30 var53 = new class30(var42, var51, var48, var45, method525(field1432, var41, var42) - var47, field1410 + var50, var46, var52, field1410 + var49, field1432, var41);
				var53.method119(method525(field1432, var43, var44) - var48, field1410 + var49, var44, var43);
				field1135.method240(var53);
			}
		} else if (arg1 == 114) {
			int var54 = arg0.method224();
			int var55 = (var54 >> 4 & 0x7) + field1137;
			int var56 = (var54 & 0x7) + field1138;
			int var57 = arg0.method226();
			int var58 = arg0.method224();
			int var59 = arg0.method226();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(var59, var55, method525(field1432, var55, var56) - var58, field1432, field1410, var57, var56);
				field1289.method240(var60);
			}
		} else if (arg1 == 8) {
			int var61 = arg0.method224();
			int var62 = (var61 >> 4 & 0x7) + field1137;
			int var63 = (var61 & 0x7) + field1138;
			int var64 = arg0.method226();
			int var65 = arg0.method226();
			int var66 = arg0.method226();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1339 != var66) {
				class29 var67 = new class29();
				var67.field450 = var64;
				var67.field451 = var65;

				if (field1158[field1432][var62][var63] == null) {
					field1158[field1432][var62][var63] = new class41();
				}

				field1158[field1432][var62][var63].method240(var67);
				method491(var62, var63);
			}
		} else if (arg1 == 218) {
			int var68 = arg0.method224();
			int var69 = (var68 >> 4 & 0x7) + field1137;
			int var70 = (var68 & 0x7) + field1138;
			int var71 = arg0.method224();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1055[var72];
			int var75 = arg0.method226();
			int var76 = arg0.method226();
			int var77 = arg0.method226();
			int var78 = arg0.method226();
			byte var79 = arg0.method225();
			byte var80 = arg0.method225();
			byte var81 = arg0.method225();
			byte var82 = arg0.method225();
			class27 var83;
			if (field1339 == var78) {
				var83 = field1133;
			} else {
				var83 = field1439[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method325(var75);
				int var85 = field1264[field1432][var69][var70];
				int var86 = field1264[field1432][var69 + 1][var70];
				int var87 = field1264[field1432][var69 + 1][var70 + 1];
				int var88 = field1264[field1432][var69][var70 + 1];
				class31 var89 = var84.method331(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method524(var77 + 1, 0, var76 + 1, var69, 0, -1, var70, var74, field1432);
					var83.field426 = field1410 + var76;
					var83.field427 = field1410 + var77;
					var83.field431 = var89;
					int var90 = var84.field827;
					int var91 = var84.field828;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field828;
						var91 = var84.field827;
					}

					var83.field428 = var69 * 128 + var90 * 64;
					var83.field430 = var70 * 128 + var91 * 64;
					var83.field429 = method525(field1432, var83.field428, var83.field430);

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
		} else if (arg1 == 98) {
			int var94 = arg0.method224();
			int var95 = (var94 >> 4 & 0x7) + field1137;
			int var96 = (var94 & 0x7) + field1138;
			int var97 = arg0.method226();
			int var98 = arg0.method226();
			int var99 = arg0.method226();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1158[field1432][var95][var96];
				if (var100 != null) {
					for (class29 var101 = (class29) var100.method243(); var101 != null; var101 = (class29) var100.method245()) {
						if ((var97 & 0x7FFF) == var101.field450 && var101.field451 == var98) {
							var101.field451 = var99;
							break;
						}
					}

					method491(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method447(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1229; var3++) {
				if (field1052[var3] == arg0) {
					field1229--;
					field1082 = true;

					for (int var4 = var3; var4 < field1229; var4++) {
						field1111[var4] = field1111[var4 + 1];
						field1146[var4] = field1146[var4 + 1];
						field1052[var4] = field1052[var4 + 1];
					}

					field1144.method213(84);
					field1144.method220(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;ZI)V")
	public final void method448(class38 arg0, int arg1) {
		field1265 = 0;
		field1442 = 0;
		method442(arg0, arg1);
		method441(arg0, arg1);
		method470(arg0, arg1);

		for (int var3 = 0; var3 < field1265; var3++) {
			int var4 = field1266[var3];
			if (field1410 != field1349[var4].field405) {
				field1349[var4].field415 = null;
				field1349[var4] = null;
			}
		}

		if (arg0.field616 != arg1) {
			signlink.reporterror(field1118 + " size mismatch in getnpcpos - pos:" + arg0.field616 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1350; var5++) {
			if (field1349[field1351[var5]] == null) {
				signlink.reporterror(field1118 + " null entry in npc list - pos:" + var5 + " size:" + field1350);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method449() {
		if (field1447 == 0) {
			int var1 = field23;
			if (field1057 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1250) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1188 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1188 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1188 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1189 - 10 || var2 > field1191 + field1189 + 10 || var3 < field1190 - 10 || var3 > field1192 + field1190 + 10) {
						field1250 = false;

						if (field1188 == 1) {
							field1082 = true;
						}

						if (field1188 == 2) {
							field1155 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1189;
					int var5 = field1190;
					int var6 = field1191;
					int var7 = field24;
					int var8 = field25;
					if (field1188 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1188 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1188 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1096; var10++) {
						int var11 = (field1096 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method486(var9);
					}

					field1250 = false;

					if (field1188 == 1) {
						field1082 = true;
					}

					if (field1188 == 2) {
						field1155 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1096 > 0) {
					int var12 = field1366[field1096 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1364[field1096 - 1];
						int var14 = field1365[field1096 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1147 = false;
							field1417 = 0;
							field1445 = var14;
							field1446 = var13;
							field1447 = 2;
							field1448 = field24;
							field1449 = field25;

							if (class4.field56[var14].field62 == field1291) {
								field1447 = 1;
							}

							if (class4.field56[var14].field62 == field1275) {
								field1447 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1270 == 1 || method549(field1096 - 1)) && field1096 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1096 > 0) {
					method486(field1096 - 1);
				}

				if (var1 != 2 || field1096 <= 0) {
					return;
				}

				method538();
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method450() {
		field1144.method213(58);

		if (field1370 != -1) {
			field1370 = -1;
			field1082 = true;
			field1089 = false;
			field1268 = true;
		}

		if (field1275 != -1) {
			field1275 = -1;
			field1155 = true;
			field1089 = false;
		}

		field1291 = -1;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method451() {
		field1329 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1157[var1] = -1;
			for (int var2 = 0; var2 < class64.field961; var2++) {
				if (!class64.field962[var2].field968 && class64.field962[var2].field963 == var1 + (field1110 ? 0 : 7)) {
					field1157[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method452() {
		field1315 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1334) {
				field1293++;
				method496();
				method496();
				method540();
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

		field1315 = false;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method453(int arg0) {
		if (!field1274) {
			if (class34.field587[17] >= arg0) {
				class36 var2 = class34.field581[17];
				int var3 = var2.field601 * var2.field600 - 1;
				int var4 = field1053 * var2.field600 * 2;
				byte[] var5 = var2.field598;
				byte[] var6 = field1296;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field598 = var6;
				field1296 = var5;
				class34.method170(17);
			}

			if (class34.field587[24] >= arg0) {
				class36 var8 = class34.field581[24];
				int var9 = var8.field601 * var8.field600 - 1;
				int var10 = field1053 * var8.field600 * 2;
				byte[] var11 = var8.field598;
				byte[] var12 = field1296;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field598 = var12;
				field1296 = var11;
				class34.method170(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method7() {
		if (!field1194 && !field1394 && !field1167) {
			field1410++;

			if (field1320) {
				method455();
			} else {
				method548();
			}

			method457();
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method454(int arg0) {
		int[] var2 = field1355.field591;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1360[arg0][var7][var5] & 0x18) == 0) {
					field1136.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1360[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1136.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1355.method180();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1360[arg0][var11][var10] & 0x18) == 0) {
					method498(var9, arg0, var11, var10, var8);
				}

				if (arg0 < 3 && (field1360[arg0 + 1][var11][var10] & 0x8) != 0) {
					method498(var9, arg0 + 1, var11, var10, var8);
				}
			}
		}

		field1184.method253();
		field1403 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1136.method79(field1432, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method325(var14).field840;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1107[field1432].field947;
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

						field1173[field1403] = field1215[var15];
						field1404[field1403] = var16;
						field1405[field1403] = var17;
						field1403++;
					}
				}
			}
		}

		field1286++;
		if (field1286 > 112) {
			field1286 = 0;
			field1144.method213(4);
			field1144.method214(50);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method455() {
		if (field1213 > 1) {
			field1213--;
		}

		if (field1068 > 0) {
			field1068--;
		}

		for (int var1 = 0; var1 < 5 && method521(); var1++) {
		}

		if (field1320) {
			synchronized (field1243.field858) {
				if (!field1072) {
					field1243.field859 = 0;
				} else if (field23 != 0 || field1243.field859 >= 40) {
					field1144.method213(232);
					field1144.method214(0);
					int var3 = field1144.field616;
					int var4 = 0;
					for (int var5 = 0; var5 < field1243.field859 && var3 - field1144.field616 < 240; var5++) {
						var4++;
						int var6 = field1243.field861[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1243.field860[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1243.field861[var5] == -1 && field1243.field860[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1251 != var7 || field1252 != var6) {
							int var9 = var7 - field1251;
							field1251 = var7;
							int var10 = var6 - field1252;
							field1252 = var6;

							if (field1169 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1144.method215((field1169 << 12) + (var9 << 6) + var10);
								field1169 = 0;
							} else if (field1169 < 8) {
								field1144.method217((field1169 << 19) + var8 + 0x800000);
								field1169 = 0;
							} else {
								field1144.method218((field1169 << 19) + var8 - 0x40000000);
								field1169 = 0;
							}
						} else if (field1169 < 2047) {
							field1169++;
						}
					}

					field1144.method223(field1144.field616 - var3);

					if (var4 >= field1243.field859) {
						field1243.field859 = 0;
					} else {
						field1243.field859 -= var4;
						for (int var11 = 0; var11 < field1243.field859; var11++) {
							field1243.field860[var11] = field1243.field860[var4 + var11];
							field1243.field861[var11] = field1243.field861[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1385) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1385 = field26;
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
				field1144.method213(234);
				field1144.method218((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1092 > 0) {
				field1092--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1093 = true;
			}

			if (field1093 && field1092 <= 0) {
				field1092 = 20;
				field1093 = false;
				field1144.method213(91);
				field1144.method215(field1075);
				field1144.method215(field1076);
			}

			if (field14 && !field1414) {
				field1414 = true;
				field1144.method213(8);
				field1144.method214(1);
			}

			if (!field14 && field1414) {
				field1414 = false;
				field1144.method213(8);
				field1144.method214(0);
			}

			method476();
			method469();
			method437();
			field1066++;
			if (field1066 > 750) {
				method492();
			}

			method539();
			method502();
			method481();
			field1053++;

			if (field1311 != 0) {
				field1310 += 20;
				if (field1310 >= 400) {
					field1311 = 0;
				}
			}

			if (field1319 != 0) {
				field1316++;
				if (field1316 >= 15) {
					if (field1319 == 2) {
						field1082 = true;
					}

					if (field1319 == 3) {
						field1155 = true;
					}

					field1319 = 0;
				}
			}

			if (field1447 != 0) {
				field1417++;

				if (field17 > field1448 + 5 || field17 < field1448 - 5 || field18 > field1449 + 5 || field18 < field1449 - 5) {
					field1147 = true;
				}

				if (field16 == 0) {
					if (field1447 == 2) {
						field1082 = true;
					}

					if (field1447 == 3) {
						field1155 = true;
					}

					field1447 = 0;

					if (field1147 && field1417 >= 5) {
						field1121 = -1;
						method514();

						if (field1445 == field1121 && field1446 != field1120) {
							class4 var19 = class4.field56[field1445];
							byte var20 = 0;
							if (field1043 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1120] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1446;
								int var22 = field1120;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1446;
								int var24 = field1120;
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
								var19.method33(field1120, field1446);
							}

							field1144.method213(176);
							field1144.method215(field1445);
							field1144.method215(field1446);
							field1144.method215(field1120);
							field1144.method214(var20);
						}
					} else if ((field1270 == 1 || method549(field1096 - 1)) && field1096 > 2) {
						method538();
					} else if (field1096 > 0) {
						method486(field1096 - 1);
					}

					field1316 = 10;
					field23 = 0;
				}
			}

			field1061++;
			if (field1061 > 62) {
				field1061 = 0;
				field1144.method213(182);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method429(var26, 0, field1133.field411[0], 0, true, var25, 0, field1133.field410[0], 0, 0, 0);
				class18.field292 = -1;

				if (var27) {
					field1308 = field24;
					field1309 = field25;
					field1311 = 1;
					field1310 = 0;
				}
			}

			if (field23 == 1 && field1409 != null) {
				field1409 = null;
				field1155 = true;
				field23 = 0;
			}

			method449();
			method424();
			method482();
			method545();

			if (field16 == 1 || field23 == 1) {
				field1207++;
			}

			if (field1295 == 2) {
				method431();
			}

			if (field1295 == 2 && field1071) {
				method527();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1244[var28]++;
			}

			method493();
			field15++;
			if (field15 > 4500) {
				field1068 = 250;
				field15 -= 500;
				field1144.method213(144);
			}

			field1242++;
			if (field1242 > 500) {
				field1242 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1368 += field1369;
				}

				if ((var29 & 0x2) == 2) {
					field1205 += field1206;
				}

				if ((var29 & 0x4) == 4) {
					field1391 += field1392;
				}
			}

			if (field1368 < -50) {
				field1369 = 2;
			}

			if (field1368 > 50) {
				field1369 = -2;
			}

			if (field1205 < -55) {
				field1206 = 2;
			}

			if (field1205 > 55) {
				field1206 = -2;
			}

			if (field1391 < -40) {
				field1392 = 1;
			}

			if (field1391 > 40) {
				field1392 = -1;
			}

			field1343++;
			if (field1343 > 500) {
				field1343 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1424 += field1425;
				}

				if ((var30 & 0x2) == 2) {
					field1246 += field1247;
				}
			}

			if (field1424 < -60) {
				field1425 = 2;
			}

			if (field1424 > 60) {
				field1425 = -2;
			}

			if (field1246 < -20) {
				field1247 = 1;
			}

			if (field1246 > 10) {
				field1247 = -1;
			}

			field1067++;
			if (field1067 > 50) {
				field1144.method213(239);
			}

			try {
				if (field1374 != null && field1144.field616 > 0) {
					field1374.method42(field1144.field616, field1144.field615, 0);
					field1144.field616 = 0;
					field1067 = 0;
				}
			} catch (IOException var32) {
				method492();
			} catch (Exception var33) {
				method430();
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method456() {
		if (field1198 == 2) {
			method553(field1201 * 2, (field1200 - field1210 << 7) + field1203, (field1199 - field1209 << 7) + field1202);

			if (field1224 > -1 && field1410 % 20 < 10) {
				field1341[2].method185(field1225 - 28, field1224 - 12);
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method457() {
		while (true) {
			class39 var1 = field1384.method276();
			if (var1 == null) {
				return;
			}

			if (var1.field628 == 0) {
				class31.method123(var1.field630, var1.field629);

				if ((field1384.method272(var1.field629) & 0x62) != 0) {
					field1082 = true;

					if (field1275 != -1) {
						field1155 = true;
					}
				}
			}

			if (var1.field628 == 1 && var1.field630 != null) {
				class7.method45(var1.field630);
			}

			if (var1.field628 == 2 && field1361 == var1.field629 && var1.field630 != null) {
				method523(var1.field630, field1362);
			}

			if (var1.field628 == 3 && field1295 == 1) {
				for (int var2 = 0; var2 < field1338.length; var2++) {
					if (field1103[var2] == var1.field629) {
						field1338[var2] = var1.field630;

						if (var1.field630 == null) {
							field1103[var2] = -1;
						}

						break;
					}

					if (field1104[var2] == var1.field629) {
						field1457[var2] = var1.field630;

						if (var1.field630 == null) {
							field1104[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field628 == 93 && field1384.method271(var1.field629)) {
				class3.method17(new class38(var1.field630), field1384);
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method458(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1413; var3++) {
				if (field1172[var3] == arg0) {
					field1413--;
					field1082 = true;

					for (int var4 = var3; var4 < field1413; var4++) {
						field1172[var4] = field1172[var4 + 1];
					}

					field1144.method213(193);
					field1144.method220(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public static final void method459() {
		class18.field258 = false;
		class34.field568 = false;
		field1274 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.a(IBILgc;I)V")
	public final void method460(int arg0, int arg1, class59 arg2, int arg3) {
		if (field1096 < 400) {
			String var5 = arg2.field868;
			if (arg2.field885 != 0) {
				var5 = var5 + method468(arg2.field885, field1133.field422) + " (level-" + arg2.field885 + ")";
			}

			if (field1084 == 1) {
				field1307[field1096] = "Use " + field1088 + " with @yel@" + var5;
				field1366[field1096] = 829;
				field1367[field1096] = arg3;
				field1364[field1096] = arg1;
				field1365[field1096] = arg0;
				field1096++;
			} else if (field1057 != 1) {
				if (arg2.field880 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg2.field880[var6] != null && !arg2.field880[var6].equalsIgnoreCase("attack")) {
							field1307[field1096] = arg2.field880[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1366[field1096] = 242;
							}

							if (var6 == 1) {
								field1366[field1096] = 209;
							}

							if (var6 == 2) {
								field1366[field1096] = 309;
							}

							if (var6 == 3) {
								field1366[field1096] = 852;
							}

							if (var6 == 4) {
								field1366[field1096] = 793;
							}

							field1367[field1096] = arg3;
							field1364[field1096] = arg1;
							field1365[field1096] = arg0;
							field1096++;
						}
					}
				}

				if (arg2.field880 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg2.field880[var7] != null && arg2.field880[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg2.field885 > field1133.field422) {
								var8 = 2000;
							}

							field1307[field1096] = arg2.field880[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1366[field1096] = var8 + 242;
							}

							if (var7 == 1) {
								field1366[field1096] = var8 + 209;
							}

							if (var7 == 2) {
								field1366[field1096] = var8 + 309;
							}

							if (var7 == 3) {
								field1366[field1096] = var8 + 852;
							}

							if (var7 == 4) {
								field1366[field1096] = var8 + 793;
							}

							field1367[field1096] = arg3;
							field1364[field1096] = arg1;
							field1365[field1096] = arg0;
							field1096++;
						}
					}
				}

				field1307[field1096] = "Examine @yel@" + var5;
				field1366[field1096] = 1714;
				field1367[field1096] = arg3;
				field1364[field1096] = arg1;
				field1365[field1096] = arg0;
				field1096++;
			} else if ((field1059 & 0x2) == 2) {
				field1307[field1096] = field1060 + " @yel@" + var5;
				field1366[field1096] = 240;
				field1367[field1096] = arg3;
				field1364[field1096] = arg1;
				field1365[field1096] = arg0;
				field1096++;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method10() {
		field1344 = true;
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

	@ObfuscatedName("client.m(I)V")
	public final void method461() {
		field1183.method253();
		int var1 = field1424 + field1076 & 0x7FF;
		int var2 = field1133.field360 / 32 + 48;
		int var3 = 464 - field1133.field361 / 32;
		field1355.method189(var2, 151, 5, field1129, field1246 + 256, 25, var1, 146, var3, field1156);
		field1168.method189(25, 33, 0, field1257, 256, 0, field1076, 33, 25, field1101);

		for (int var4 = 0; var4 < field1403; var4++) {
			int var5 = field1404[var4] * 4 + 2 - field1133.field360 / 32;
			int var6 = field1405[var4] * 4 + 2 - field1133.field361 / 32;
			method516(var6, var5, field1173[var4]);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class41 var9 = field1158[field1432][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1133.field360 / 32;
					int var11 = var8 * 4 + 2 - field1133.field361 / 32;
					method516(var11, var10, field1345);
				}
			}
		}

		for (int var12 = 0; var12 < field1350; var12++) {
			class26 var13 = field1349[field1351[var12]];
			if (var13 != null && var13.method113() && var13.field415.field884) {
				int var14 = var13.field360 / 32 - field1133.field360 / 32;
				int var15 = var13.field361 / 32 - field1133.field361 / 32;
				method516(var15, var14, field1346);
			}
		}

		for (int var16 = 0; var16 < field1440; var16++) {
			class27 var17 = field1439[field1441[var16]];
			if (var17 != null && var17.method113()) {
				int var18 = var17.field360 / 32 - field1133.field360 / 32;
				int var19 = var17.field361 / 32 - field1133.field361 / 32;
				boolean var20 = false;
				long var21 = class51.method295(var17.field416);
				for (int var23 = 0; var23 < field1229; var23++) {
					if (field1052[var23] == var21 && field1146[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method516(var19, var18, field1348);
				} else {
					method516(var19, var18, field1347);
				}
			}
		}

		if (field1198 != 0 && field1410 % 20 < 10) {
			if (field1198 == 1 && field1122 >= 0 && field1122 < field1349.length) {
				class26 var24 = field1349[field1122];
				if (var24 != null) {
					int var25 = var24.field360 / 32 - field1133.field360 / 32;
					int var26 = var24.field361 / 32 - field1133.field361 / 32;
					method528(field1249, var25, var26);
				}
			}

			if (field1198 == 2) {
				int var27 = (field1199 - field1209) * 4 + 2 - field1133.field360 / 32;
				int var28 = (field1200 - field1210) * 4 + 2 - field1133.field361 / 32;
				method528(field1249, var27, var28);
			}

			if (field1198 == 10 && field1452 >= 0 && field1452 < field1439.length) {
				class27 var29 = field1439[field1452];
				if (var29 != null) {
					int var30 = var29.field360 / 32 - field1133.field360 / 32;
					int var31 = var29.field361 / 32 - field1133.field361 / 32;
					method528(field1249, var30, var31);
				}
			}
		}

		if (field1353 != 0) {
			int var32 = field1353 * 4 + 2 - field1133.field360 / 32;
			int var33 = field1354 * 4 + 2 - field1133.field361 / 32;
			method516(var33, var32, field1248);
		}

		class33.method156(0xFFFFFF, 3, 78, 3, 97);
		field1184.method253();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method462() {
		field1276 = 0;
		for (int var1 = -1; var1 < field1440 + field1350; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1133;
			} else if (var1 < field1440) {
				var2 = field1439[field1441[var1]];
			} else {
				var2 = field1349[field1351[var1 - field1440]];
			}

			if (var2 != null && var2.method113()) {
				if (var1 >= field1440) {
					class59 var6 = ((class26) var2).field415;
					if (var6.field891 >= 0 && var6.field891 < field1341.length) {
						method552(var2.field406 + 15, var2);

						if (field1224 > -1) {
							field1341[var6.field891].method185(field1225 - 30, field1224 - 12);
						}
					}

					if (field1198 == 1 && field1351[var1 - field1440] == field1122 && field1410 % 20 < 10) {
						method552(var2.field406 + 15, var2);

						if (field1224 > -1) {
							field1341[2].method185(field1225 - 28, field1224 - 12);
						}
					}
				} else {
					int var3 = 30;
					class27 var4 = (class27) var2;
					if (var4.field419 != 0) {
						method552(var2.field406 + 15, var2);

						if (field1224 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field419 & 1 << var5) != 0) {
									field1341[var5].method185(field1225 - var3, field1224 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1198 == 10 && field1441[var1] == field1452) {
						method552(var2.field406 + 15, var2);

						if (field1224 > -1) {
							field1341[7].method185(field1225 - var3, field1224 - 12);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1440 || field1187 == 0 || field1187 == 3 || field1187 == 1 && method445(((class27) var2).field416))) {
					method552(var2.field406, var2);

					if (field1224 > -1 && field1276 < field1277) {
						field1281[field1276] = field1218.method202(var2.field372) / 2;
						field1280[field1276] = field1218.field612;
						field1278[field1276] = field1224;
						field1279[field1276] = field1225;
						field1282[field1276] = var2.field374;
						field1283[field1276] = var2.field375;
						field1284[field1276] = var2.field373;
						field1285[field1276++] = var2.field372;

						if (field1132 == 0 && var2.field375 == 1) {
							field1280[field1276] += 10;
							field1279[field1276] += 5;
						}

						if (field1132 == 0 && var2.field375 == 2) {
							field1281[field1276] = 60;
						}
					}
				}

				if (var2.field379 > field1410) {
					method552(var2.field406 + 15, var2);

					if (field1224 > -1) {
						int var7 = var2.field380 * 30 / var2.field381;
						if (var7 > 30) {
							var7 = 30;
						}

						class33.method156(0xFF00, var7, field1225 - 3, 5, field1224 - 15);
						class33.method156(0xFF0000, 30 - var7, field1225 - 3, 5, field1224 + var7 - 15);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field378[var8] > field1410) {
						method552(var2.field406 / 2, var2);

						if (field1224 > -1) {
							if (var8 == 1) {
								field1225 -= 20;
							}

							if (var8 == 2) {
								field1224 -= 15;
								field1225 -= 10;
							}

							if (var8 == 3) {
								field1224 += 15;
								field1225 -= 10;
							}

							field1337[var2.field377[var8]].method185(field1225 - 12, field1224 - 12);
							field1216.method200(field1224, field1225 + 4, 0, String.valueOf(var2.field376[var8]));
							field1216.method200(field1224 - 1, field1225 + 3, 0xFFFFFF, String.valueOf(var2.field376[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1276; var9++) {
			int var10 = field1278[var9];
			int var11 = field1279[var9];
			int var12 = field1281[var9];
			int var13 = field1280[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1279[var15] - field1280[var15] && var11 - var13 < field1279[var15] + 2 && var10 - var12 < field1281[var15] + field1278[var15] && var10 + var12 > field1278[var15] - field1281[var15] && field1279[var15] - field1280[var15] < var11) {
						var11 = field1279[var15] - field1280[var15];
						var14 = true;
					}
				}
			}

			field1224 = field1278[var9];
			field1225 = field1279[var9] = var11;
			String var16 = field1285[var9];
			if (field1132 == 0) {
				int var17 = 0xFFFF00;
				if (field1282[var9] < 6) {
					var17 = field1042[field1282[var9]];
				}

				if (field1282[var9] == 6) {
					var17 = field1267 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1282[var9] == 7) {
					var17 = field1267 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1282[var9] == 8) {
					var17 = field1267 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1282[var9] == 9) {
					int var18 = 150 - field1284[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1282[var9] == 10) {
					int var19 = 150 - field1284[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1282[var9] == 11) {
					int var20 = 150 - field1284[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1283[var9] == 0) {
					field1218.method200(field1224, field1225 + 1, 0, var16);
					field1218.method200(field1224, field1225, var17, var16);
				}

				if (field1283[var9] == 1) {
					field1218.method204(field1267, 0, field1224, var16, field1225 + 1);
					field1218.method204(field1267, var17, field1224, var16, field1225);
				}

				if (field1283[var9] == 2) {
					int var21 = field1218.method202(var16);
					int var22 = (150 - field1284[var9]) * (var21 + 100) / 150;
					class33.method153(field1224 - 50, field1224 + 50, 0, 334);
					field1218.method203(field1224 + 50 - var22, 0, var16, field1225 + 1);
					field1218.method203(field1224 + 50 - var22, var17, var16, field1225);
					class33.method152();
				}
			} else {
				field1218.method200(field1224, field1225 + 1, 0, var16);
				field1218.method200(field1224, field1225, 0xFFFF00, var16);
			}
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method463(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1099[var4] != null) {
				int var5 = field1097[var4];
				int var6 = field1411 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1098[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1187 == 0 || field1187 == 1 && method445(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field1133.field416)) {
						if (field1363 >= 1) {
							field1307[field1096] = "Report abuse @whi@" + var7;
							field1366[field1096] = 524;
							field1096++;
						}

						field1307[field1096] = "Add ignore @whi@" + var7;
						field1366[field1096] = 47;
						field1096++;
						field1307[field1096] = "Add friend @whi@" + var7;
						field1366[field1096] = 605;
						field1096++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1074 == 0 && (var5 == 7 || field1105 == 0 || field1105 == 1 && method445(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1363 >= 1) {
							field1307[field1096] = "Report abuse @whi@" + var7;
							field1366[field1096] = 524;
							field1096++;
						}

						field1307[field1096] = "Add ignore @whi@" + var7;
						field1366[field1096] = 47;
						field1096++;
						field1307[field1096] = "Add friend @whi@" + var7;
						field1366[field1096] = 605;
						field1096++;
					}

					var3++;
				}

				if (var5 == 4 && (field1327 == 0 || field1327 == 1 && method445(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1307[field1096] = "Accept trade @whi@" + var7;
						field1366[field1096] = 507;
						field1096++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1074 == 0 && field1105 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1327 == 0 || field1327 == 1 && method445(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1307[field1096] = "Accept duel @whi@" + var7;
						field1366[field1096] = 957;
						field1096++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method464() {
		if (field1375 == null) {
			field10 = null;
			field1185 = null;
			field1183 = null;
			field1182 = null;
			field1184 = null;
			field1356 = null;
			field1357 = null;
			field1358 = null;
			field1378 = new class43(128, method11(), 265);
			class33.method154();
			field1379 = new class43(128, method11(), 265);
			class33.method154();
			field1375 = new class43(509, method11(), 171);
			class33.method154();
			field1376 = new class43(360, method11(), 132);
			class33.method154();
			field1377 = new class43(360, method11(), 200);
			class33.method154();
			field1380 = new class43(202, method11(), 238);
			class33.method154();
			field1381 = new class43(203, method11(), 238);
			class33.method154();
			field1382 = new class43(74, method11(), 94);
			class33.method154();
			field1383 = new class43(75, method11(), 94);
			class33.method154();

			if (field1431 != null) {
				method489();
				method466();
			}

			field1344 = true;
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method465(boolean arg0) {
		method464();
		field1377.method253();
		field1178.method198(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1177 == 0) {
			int var4 = var3 / 2 + 80;
			field1216.method201(field1384.field727, var4, 0x75A9A9, true, var2 / 2);
			int var5 = var3 / 2 - 20;
			field1218.method201("Welcome to RuneScape", var5, 0xFFFF00, true, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1179.method198(var7 - 20, var6 - 73);
			field1218.method201("New User", var7 + 5, 0xFFFFFF, true, var6);
			int var8 = var2 / 2 + 80;
			field1179.method198(var7 - 20, var8 - 73);
			field1218.method201("Existing User", var7 + 5, 0xFFFFFF, true, var8);
		}

		if (field1177 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1322.length() > 0) {
				field1218.method201(field1322, var9 - 15, 0xFFFF00, true, var2 / 2);
				field1218.method201(field1323, var9, 0xFFFF00, true, var2 / 2);
				var9 += 30;
			} else {
				field1218.method201(field1323, var9 - 7, 0xFFFF00, true, var2 / 2);
				var9 += 30;
			}

			field1218.method205("Username: " + field1118 + (field1290 == 0 & field1410 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, var2 / 2 - 90, true);
			var9 += 15;
			field1218.method205("Password: " + class51.method301(field1119) + (field1290 == 1 & field1410 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, var2 / 2 - 88, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1179.method198(var11 - 20, var10 - 73);
				field1218.method201("Login", var11 + 5, 0xFFFFFF, true, var10);
				int var12 = var2 / 2 + 80;
				field1179.method198(var11 - 20, var12 - 73);
				field1218.method201("Cancel", var11 + 5, 0xFFFFFF, true, var12);
			}
		}

		if (field1177 == 3) {
			field1218.method201("Create a free account", var3 / 2 - 60, 0xFFFF00, true, var2 / 2);
			int var13 = var3 / 2 - 35;
			field1218.method201("To create a new account you need to", var13, 0xFFFFFF, true, var2 / 2);
			var13 += 15;
			field1218.method201("go back to the main RuneScape webpage", var13, 0xFFFFFF, true, var2 / 2);
			var13 += 15;
			field1218.method201("and choose the red 'create account'", var13, 0xFFFFFF, true, var2 / 2);
			var13 += 15;
			field1218.method201("button at the top right of that page.", var13, 0xFFFFFF, true, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1179.method198(var15 - 20, var14 - 73);
			field1218.method201("Cancel", var15 + 5, 0xFFFFFF, true, var14);
		}

		field1377.method254(202, 171, field9);

		if (field1344) {
			field1344 = false;
			field1375.method254(128, 0, field9);
			field1376.method254(202, 371, field9);
			field1380.method254(0, 265, field9);
			field1381.method254(562, 265, field9);
			field1382.method254(128, 171, field9);
			field1383.method254(562, 171, field9);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method466() {
		field1178 = new class36(field1431, "titlebox", 0);
		field1179 = new class36(field1431, "titlebutton", 0);
		field1454 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1454[var2] = new class36(field1431, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1454[var3] = new class36(field1431, "runes", (var3 & 0x3) + 12);
			}
		}

		field1332 = new class35(128, 265);
		field1333 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1332.field591[var4] = field1378.field649[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1333.field591[var5] = field1379.field649[var5];
		}

		field1160 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1160[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1160[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1160[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1160[var9 + 192] = 0xFFFFFF;
		}

		field1161 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1161[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1161[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1161[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1161[var13 + 192] = 0xFFFFFF;
		}

		field1162 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1162[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1162[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1162[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1162[var17 + 192] = 0xFFFFFF;
		}

		field1159 = new int[256];
		field1062 = new int[32768];
		field1063 = new int[32768];
		method479(null);
		field1196 = new int[32768];
		field1197 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1334) {
			field1313 = true;
			field1334 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(ZZI)V")
	public final void method467(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field1254 = arg0;
		field1412 = arg1;
		method464();

		if (field1431 == null) {
			super.method13(arg0, arg1);
		} else {
			field1377.method253();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1218.method200(var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			class33.method157(304, 34, var3 / 2 - 152, var6, 0x8C1111);
			class33.method157(302, 32, var3 / 2 - 151, var6 + 1, 0);
			class33.method156(0x8C1111, arg0 * 3, var6 + 2, 30, var3 / 2 - 150);
			class33.method156(0, 300 - arg0 * 3, var6 + 2, 30, arg0 * 3 + var3 / 2 - 150);
			field1218.method200(var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF, arg1);
			field1377.method254(202, 171, field9);

			if (field1344) {
				field1344 = false;

				if (!field1334) {
					field1378.method254(0, 0, field9);
					field1379.method254(637, 0, field9);
				}

				field1375.method254(128, 0, field9);
				field1376.method254(202, 371, field9);
				field1380.method254(0, 265, field9);
				field1381.method254(562, 265, field9);
				field1382.method254(128, 171, field9);
				field1383.method254(562, 171, field9);
			}
		}
	}

	@ObfuscatedName("client.a(IIB)Ljava/lang/String;")
	public static final String method468(int arg0, int arg1) {
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

	@ObfuscatedName("client.g(B)V")
	public final void method469() {
		if (field1295 == 2) {
			for (class40 var1 = (class40) field1094.method243(); var1 != null; var1 = (class40) field1094.method245()) {
				if (var1.field644 > 0) {
					var1.field644--;
				}

				if (var1.field644 != 0) {
					if (var1.field643 > 0) {
						var1.field643--;
					}

					if (var1.field643 == 0 && var1.field635 >= 1 && var1.field636 >= 1 && var1.field635 <= 102 && var1.field636 <= 102 && (var1.field640 < 0 || class3.method30(var1.field642, var1.field640))) {
						method484(var1.field640, var1.field634, var1.field633, var1.field636, var1.field635, var1.field642, var1.field641);
						var1.field643 = -1;

						if (var1.field640 == var1.field637 && var1.field637 == -1) {
							var1.method106();
						} else if (var1.field640 == var1.field637 && var1.field641 == var1.field638 && var1.field642 == var1.field639) {
							var1.method106();
						}
					}
				} else if (var1.field637 < 0 || class3.method30(var1.field639, var1.field637)) {
					method484(var1.field637, var1.field634, var1.field633, var1.field636, var1.field635, var1.field639, var1.field638);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.c(Llb;II)V")
	public final void method470(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1442; var3++) {
			int var4 = field1443[var3];
			class26 var5 = field1349[var4];
			int var6 = arg0.method224();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method224();
				int var8 = arg0.method224();
				var5.method114(field1410, var8, var7);
				var5.field379 = field1410 + 300;
				var5.field380 = arg0.method224();
				var5.field381 = arg0.method224();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg0.method226();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field388 == var9) {
					var5.field392 = 0;
				}

				int var10 = arg0.method224();
				if (var5.field388 == var9 && var9 != -1) {
					int var11 = class66.field982[var9].field996;
					if (var11 == 1) {
						var5.field389 = 0;
						var5.field390 = 0;
						var5.field391 = var10;
						var5.field392 = 0;
					}

					if (var11 == 2) {
						var5.field392 = 0;
					}
				} else if (var9 == -1 || var5.field388 == -1 || class66.field982[var9].field990 >= class66.field982[var5.field388].field990) {
					var5.field388 = var9;
					var5.field389 = 0;
					var5.field390 = 0;
					var5.field391 = var10;
					var5.field392 = 0;
					var5.field414 = var5.field409;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field382 = arg0.method226();
				if (var5.field382 == 0xFFFF) {
					var5.field382 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field372 = arg0.method231();
				var5.field373 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.method224();
				int var13 = arg0.method224();
				var5.method114(field1410, var13, var12);
				var5.field379 = field1410 + 300;
				var5.field380 = arg0.method224();
				var5.field381 = arg0.method224();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class59.method335(arg0.method226());
				var5.field364 = var5.field415.field870;
				var5.field408 = var5.field415.field892;
				var5.field367 = var5.field415.field874;
				var5.field368 = var5.field415.field875;
				var5.field369 = var5.field415.field876;
				var5.field370 = var5.field415.field877;
				var5.field365 = var5.field415.field873;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg0.method226();
				int var14 = arg0.method229();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1410;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1410) {
					var5.field394 = -1;
				}

				if (var5.field393 == 0xFFFF) {
					var5.field393 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field383 = arg0.method226();
				var5.field384 = arg0.method226();
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method471() {
		if (field1096 >= 2 || field1084 != 0 || field1057 != 0) {
			String var1;
			if (field1084 == 1 && field1096 < 2) {
				var1 = "Use " + field1088 + " with...";
			} else if (field1057 == 1 && field1096 < 2) {
				var1 = field1060 + "...";
			} else {
				var1 = field1307[field1096 - 1];
			}

			if (field1096 > 2) {
				var1 = var1 + "@whi@ / " + (field1096 - 2) + " more options";
			}

			field1218.method206(true, field1410 / 1000, var1, 0xFFFFFF, 4, 15);
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method472(class4 arg0) {
		int var2 = arg0.field65;
		if (field1230 == 2) {
			if (var2 == 201) {
				field1155 = true;
				field1458 = false;
				field1174 = true;
				field1258 = "";
				field1056 = 1;
				field1245 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1155 = true;
				field1458 = false;
				field1174 = true;
				field1258 = "";
				field1056 = 2;
				field1245 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1068 = 250;
			return true;
		}

		if (var2 == 501) {
			field1155 = true;
			field1458 = false;
			field1174 = true;
			field1258 = "";
			field1056 = 4;
			field1245 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1155 = true;
			field1458 = false;
			field1174 = true;
			field1258 = "";
			field1056 = 5;
			field1245 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1157[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field961 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field961) {
							var5 = 0;
						}
					}

					if (!class64.field962[var5].field968 && class64.field962[var5].field963 == var3 + (field1110 ? 0 : 7)) {
						break;
					}
				}

				field1157[var3] = var5;
				field1329 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1415[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1342[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1342[var6].length) {
					var8 = 0;
				}
			}

			field1415[var6] = var8;
			field1329 = true;
		}

		if (var2 == 324 && !field1110) {
			field1110 = true;
			method451();
		}

		if (var2 == 325 && field1110) {
			field1110 = false;
			method451();
		}

		if (var2 == 326) {
			field1144.method213(13);
			field1144.method214(field1110 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1144.method214(field1157[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1144.method214(field1415[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1095 = !field1095;
		}

		if (var2 >= 601 && var2 <= 612) {
			method450();

			if (field1140.length() > 0) {
				field1144.method213(203);
				field1144.method220(class51.method295(field1140));
				field1144.method214(var2 - 601);
				field1144.method214(field1095 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(Ld;ZIIIIZII)V")
	public final void method473(class4 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		if (field1455) {
			field1148 = 32;
		} else {
			field1148 = 0;
		}

		field1455 = false;
		if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
			arg0.field76 -= field1207 * 4;

			if (arg5) {
				field1082 = true;
				return;
			}
		} else if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg2 + arg3 - 16 && arg7 < arg2 + arg3) {
			arg0.field76 += field1207 * 4;

			if (arg5) {
				field1082 = true;
				return;
			}
		} else if (arg6 >= arg1 - field1148 && arg6 < arg1 + field1148 + 16 && arg7 >= arg3 + 16 && arg7 < arg2 + arg3 - 16 && field1207 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg4;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg3 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg0.field76 = (arg4 - arg2) * var10 / var11;

			if (arg5) {
				field1082 = true;
			}

			field1455 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method9() {
		if (field1194 || field1394 || field1167) {
			method541();
		} else {
			field1164++;

			if (field1320) {
				method509();
			} else {
				method465(false);
			}

			field1207 = 0;
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method474(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method474(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.a(ZLd;I)I")
	public final int method475(class4 arg0, int arg1) {
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
					var8 = field1130[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1112[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1083[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field894 && (!class60.method341(var11).field915 || field1273)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1152[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1186[field1112[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1152[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1133.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field997; var13++) {
						if (class67.field999[var13]) {
							var8 += field1112[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field894 && (!class60.method341(var15).field915 || field1273)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1166;
				}

				if (var7 == 12) {
					var8 = field1139;
				}

				if (var7 == 13) {
					int var17 = field1152[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1015[var19];
					int var21 = var20.field1017;
					int var22 = var20.field1018;
					int var23 = var20.field1019;
					int var24 = field1306[var23 - var22];
					var8 = field1152[var21] >> var22 & var24;
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
					var8 = (field1133.field360 >> 7) + field1209;
				}

				if (var7 == 19) {
					var8 = (field1133.field361 >> 7) + field1210;
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

	@ObfuscatedName("client.r(I)V")
	public final void method476() {
		if (field1274 && field1295 == 2 && class3.field33 != field1432) {
			field1184.method253();
			field1217.method200(257, 151, 0, "Loading - please wait.");
			field1217.method200(256, 150, 0xFFFFFF, "Loading - please wait.");
			field1184.method254(4, 4, field9);
			field1295 = 1;
			field1453 = System.currentTimeMillis();
		}

		if (field1295 == 1) {
			int var1 = method477();
			if (var1 != 0 && System.currentTimeMillis() - field1453 > 360000L) {
				signlink.reporterror(field1118 + " glcfb " + field1226 + "," + var1 + "," + field1274 + "," + field1195[0] + "," + field1384.method275() + "," + field1432 + "," + field1045 + "," + field1046);
				field1453 = System.currentTimeMillis();
			}
		}

		if (field1295 == 2 && field1432 != field1044) {
			field1044 = field1432;
			method454(field1432);
		}
	}

	@ObfuscatedName("client.s(I)I")
	public final int method477() {
		for (int var1 = 0; var1 < field1338.length; var1++) {
			if (field1338[var1] == null && field1103[var1] != -1) {
				return -1;
			}

			if (field1457[var1] == null && field1104[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1338.length; var3++) {
			byte[] var4 = field1457[var3];
			if (var4 != null) {
				int var5 = (field1102[var3] >> 8) * 64 - field1209;
				int var6 = (field1102[var3] & 0xFF) * 64 - field1210;
				var2 &= class3.method16(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1419) {
			return -4;
		} else {
			field1295 = 2;
			class3.field33 = field1432;
			method531();
			field1144.method213(134);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method478(long arg0) {
		if (arg0 != 0L) {
			if (field1229 >= 100 && field1070 != 1) {
				method526(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field1229 >= 200) {
				method526(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = class51.method299(class51.method296(arg0));
				for (int var4 = 0; var4 < field1229; var4++) {
					if (field1052[var4] == arg0) {
						method526(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1413; var5++) {
					if (field1172[var5] == arg0) {
						method526(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field1133.field416)) {
					field1111[field1229] = var3;
					field1052[field1229] = arg0;
					field1146[field1229] = 0;
					field1229++;
					field1082 = true;
					field1144.method213(9);
					field1144.method220(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public final void method479(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1062.length; var3++) {
			field1062[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1062[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1063[var9] = (field1062[var9 - 1] + field1062[var9 + 1] + field1062[var9 - 128] + field1062[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1062;
			field1062 = field1063;
			field1063 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field601; var12++) {
				for (int var13 = 0; var13 < arg0.field600; var13++) {
					if (arg0.field598[var11++] != 0) {
						int var14 = var13 + arg0.field602 + 16;
						int var15 = var12 + arg0.field603 + 16;
						int var16 = (var15 << 7) + var14;
						field1062[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method480() {
		if (field1084 == 0 && field1057 == 0) {
			field1307[field1096] = "Walk here";
			field1366[field1096] = 718;
			field1364[field1096] = field17;
			field1365[field1096] = field18;
			field1096++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field543; var2++) {
			int var3 = class31.field544[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1136.method80(field1432, var4, var5, var3) >= 0) {
					class57 var8 = class57.method325(var7);
					if (field1084 == 1) {
						field1307[field1096] = "Use " + field1088 + " with @cya@" + var8.field823;
						field1366[field1096] = 810;
						field1367[field1096] = var3;
						field1364[field1096] = var4;
						field1365[field1096] = var5;
						field1096++;
					} else if (field1057 != 1) {
						if (var8.field839 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field839[var9] != null) {
									field1307[field1096] = var8.field839[var9] + " @cya@" + var8.field823;

									if (var9 == 0) {
										field1366[field1096] = 625;
									}

									if (var9 == 1) {
										field1366[field1096] = 721;
									}

									if (var9 == 2) {
										field1366[field1096] = 743;
									}

									if (var9 == 3) {
										field1366[field1096] = 357;
									}

									if (var9 == 4) {
										field1366[field1096] = 1071;
									}

									field1367[field1096] = var3;
									field1364[field1096] = var4;
									field1365[field1096] = var5;
									field1096++;
								}
							}
						}

						field1307[field1096] = "Examine @cya@" + var8.field823;
						field1366[field1096] = 1381;
						field1367[field1096] = var3;
						field1364[field1096] = var4;
						field1365[field1096] = var5;
						field1096++;
					} else if ((field1059 & 0x4) == 4) {
						field1307[field1096] = field1060 + " @cya@" + var8.field823;
						field1366[field1096] = 899;
						field1367[field1096] = var3;
						field1364[field1096] = var4;
						field1365[field1096] = var5;
						field1096++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1349[var7];
					if (var10.field415.field870 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1350; var11++) {
							class26 var12 = field1349[field1351[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field870 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method460(var5, var4, var12.field415, field1351[var11]);
							}
						}

						for (int var13 = 0; var13 < field1440; var13++) {
							class27 var14 = field1439[field1441[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method495(var14, field1441[var13], var5, var4);
							}
						}
					}

					method460(var5, var4, var10.field415, var7);
				}

				if (var6 == 0) {
					class27 var15 = field1439[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1350; var16++) {
							class26 var17 = field1349[field1351[var16]];
							if (var17 != null && var17.field415.field870 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method460(var5, var4, var17.field415, field1351[var16]);
							}
						}

						for (int var18 = 0; var18 < field1440; var18++) {
							class27 var19 = field1439[field1441[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method495(var19, field1441[var18], var5, var4);
							}
						}
					}

					method495(var15, var7, var5, var4);
				}

				if (var6 == 3) {
					class41 var20 = field1158[field1432][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method244(); var21 != null; var21 = (class29) var20.method246()) {
							class60 var22 = class60.method341(var21.field450);
							if (field1084 == 1) {
								field1307[field1096] = "Use " + field1088 + " with @lre@" + var22.field902;
								field1366[field1096] = 111;
								field1367[field1096] = var21.field450;
								field1364[field1096] = var4;
								field1365[field1096] = var5;
								field1096++;
							} else if (field1057 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field916 != null && var22.field916[var23] != null) {
										field1307[field1096] = var22.field916[var23] + " @lre@" + var22.field902;

										if (var23 == 0) {
											field1366[field1096] = 139;
										}

										if (var23 == 1) {
											field1366[field1096] = 778;
										}

										if (var23 == 2) {
											field1366[field1096] = 617;
										}

										if (var23 == 3) {
											field1366[field1096] = 224;
										}

										if (var23 == 4) {
											field1366[field1096] = 662;
										}

										field1367[field1096] = var21.field450;
										field1364[field1096] = var4;
										field1365[field1096] = var5;
										field1096++;
									} else if (var23 == 2) {
										field1307[field1096] = "Take @lre@" + var22.field902;
										field1366[field1096] = 617;
										field1367[field1096] = var21.field450;
										field1364[field1096] = var4;
										field1365[field1096] = var5;
										field1096++;
									}
								}

								field1307[field1096] = "Examine @lre@" + var22.field902;
								field1366[field1096] = 1152;
								field1367[field1096] = var21.field450;
								field1364[field1096] = var4;
								field1365[field1096] = var5;
								field1096++;
							} else if ((field1059 & 0x1) == 1) {
								field1307[field1096] = field1060 + " @lre@" + var22.field902;
								field1366[field1096] = 370;
								field1367[field1096] = var21.field450;
								field1364[field1096] = var4;
								field1365[field1096] = var5;
								field1096++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method481() {
		for (int var1 = -1; var1 < field1440; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1438;
			} else {
				var2 = field1441[var1];
			}

			class27 var3 = field1439[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1350; var4++) {
			int var5 = field1351[var4];
			class26 var6 = field1349[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method482() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1163[0] != -1) {
				field1082 = true;
				field1292 = 0;
				field1268 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1163[1] != -1) {
				field1082 = true;
				field1292 = 1;
				field1268 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1163[2] != -1) {
				field1082 = true;
				field1292 = 2;
				field1268 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1163[3] != -1) {
				field1082 = true;
				field1292 = 3;
				field1268 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1163[4] != -1) {
				field1082 = true;
				field1292 = 4;
				field1268 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1163[5] != -1) {
				field1082 = true;
				field1292 = 5;
				field1268 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1163[6] != -1) {
				field1082 = true;
				field1292 = 6;
				field1268 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1163[7] != -1) {
				field1082 = true;
				field1292 = 7;
				field1268 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1163[8] != -1) {
				field1082 = true;
				field1292 = 8;
				field1268 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1163[9] != -1) {
				field1082 = true;
				field1292 = 9;
				field1268 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1163[10] != -1) {
				field1082 = true;
				field1292 = 10;
				field1268 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1163[11] != -1) {
				field1082 = true;
				field1292 = 11;
				field1268 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1163[12] != -1) {
				field1082 = true;
				field1292 = 12;
				field1268 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1163[13] != -1) {
				field1082 = true;
				field1292 = 13;
				field1268 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method483() {
		for (class30 var1 = (class30) field1135.method243(); var1 != null; var1 = (class30) field1135.method245()) {
			if (field1432 != var1.field453 || field1410 > var1.field459) {
				var1.method106();
			} else if (field1410 >= var1.field458) {
				if (var1.field462 > 0) {
					class26 var2 = field1349[var1.field462 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method119(method525(var1.field453, var2.field360, var2.field361) - var1.field457, field1410, var2.field361, var2.field360);
					}
				}

				if (var1.field462 < 0) {
					int var3 = -var1.field462 - 1;
					class27 var4;
					if (field1339 == var3) {
						var4 = field1133;
					} else {
						var4 = field1439[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method119(method525(var1.field453, var4.field360, var4.field361) - var1.field457, field1410, var4.field361, var4.field360);
					}
				}

				var1.method120(field1053);
				field1136.method61(var1.field472, (int) var1.field465, false, (int) var1.field464, (int) var1.field466, var1, field1432, 60, -1);
			}
		}

		field1422++;
		if (field1422 > 1174) {
			field1422 = 0;
			field1144.method213(51);
			field1144.method214(0);
			int var5 = field1144.field616;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1144.method215(11499);
			}

			field1144.method215(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1144.method214(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1144.method214(94);
			}

			field1144.method215(51693);
			field1144.method214(16);
			field1144.method215(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1144.method214(65);
			}

			field1144.method214((int) (Math.random() * 256.0D));
			field1144.method215(22990);
			field1144.method223(field1144.field616 - var5);
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
			if (field1274 && field1432 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field1136.method76(arg2, arg4, arg3);
			}

			if (arg1 == 1) {
				var8 = field1136.method77(arg2, arg4, arg3);
			}

			if (arg1 == 2) {
				var8 = field1136.method78(arg2, arg4, arg3);
			}

			if (arg1 == 3) {
				var8 = field1136.method79(arg2, arg4, arg3);
			}

			if (var8 != 0) {
				int var12 = field1136.method80(arg2, arg4, arg3, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field1136.method67(arg4, arg2, arg3);
					class57 var16 = class57.method325(var13);
					if (var16.field829) {
						field1107[arg2].method357(var14, arg4, var15, arg3, var16.field830);
					}
				}

				if (arg1 == 1) {
					field1136.method68(arg2, arg4, arg3);
				}

				if (arg1 == 2) {
					field1136.method69(arg2, arg4, arg3);
					class57 var17 = class57.method325(var13);
					if (var17.field827 + arg4 > 103 || var17.field827 + arg3 > 103 || var17.field828 + arg4 > 103 || var17.field828 + arg3 > 103) {
						return;
					}

					if (var17.field829) {
						field1107[arg2].method358(arg3, var17.field828, var15, arg4, var17.field830, var17.field827);
					}
				}

				if (arg1 == 3) {
					field1136.method70(arg2, arg4, arg3);
					class57 var18 = class57.method325(var13);
					if (var18.field829 && var18.field831) {
						field1107[arg2].method360(arg3, arg4);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field1360[1][arg4][arg3] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				class3.method31(arg2, arg4, arg0, arg5, field1136, field1107[arg2], var19, arg6, arg3, field1264);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public final void method485(int arg0, class38 arg1) {
		int var3 = arg1.method235(8);
		if (var3 < field1440) {
			for (int var4 = var3; var4 < field1440; var4++) {
				field1266[field1265++] = field1441[var4];
			}
		}

		if (var3 > field1440) {
			signlink.reporterror(field1118 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1440 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1441[var5];
			class27 var7 = field1439[var6];
			int var8 = arg1.method235(1);
			if (var8 == 0) {
				field1441[field1440++] = var6;
				var7.field405 = field1410;
			} else {
				int var9 = arg1.method235(2);
				if (var9 == 0) {
					field1441[field1440++] = var6;
					var7.field405 = field1410;
					field1443[field1442++] = var6;
				} else if (var9 == 1) {
					field1441[field1440++] = var6;
					var7.field405 = field1410;
					int var10 = arg1.method235(3);
					var7.method111(var10, false);
					int var11 = arg1.method235(1);
					if (var11 == 1) {
						field1443[field1442++] = var6;
					}
				} else if (var9 == 2) {
					field1441[field1440++] = var6;
					var7.field405 = field1410;
					int var12 = arg1.method235(3);
					var7.method111(var12, true);
					int var13 = arg1.method235(3);
					var7.method111(var13, true);
					int var14 = arg1.method235(1);
					if (var14 == 1) {
						field1443[field1442++] = var6;
					}
				} else if (var9 == 3) {
					field1266[field1265++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method486(int arg0) {
		if (arg0 >= 0) {
			if (field1458) {
				field1458 = false;
				field1155 = true;
			}

			int var2 = field1364[arg0];
			int var3 = field1365[arg0];
			int var4 = field1366[arg0];
			int var5 = field1367[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 737) {
				method450();
			}

			if (var4 == 111) {
				boolean var6 = method429(var3, 2, field1133.field411[0], 0, false, var2, 0, field1133.field410[0], 0, 0, 0);
				if (!var6) {
					method429(var3, 2, field1133.field411[0], 0, false, var2, 1, field1133.field410[0], 0, 0, 1);
				}

				field1308 = field24;
				field1309 = field25;
				field1311 = 2;
				field1310 = 0;
				field1144.method213(245);
				field1144.method215(field1209 + var2);
				field1144.method215(field1210 + var3);
				field1144.method215(var5);
				field1144.method215(field1087);
				field1144.method215(field1085);
				field1144.method215(field1086);
			}

			if (var4 == 810 && method520(var3, var2, 240, var5)) {
				field1144.method215(field1087);
				field1144.method215(field1085);
				field1144.method215(field1086);
			}

			if (var4 == 1328) {
				class60 var8 = class60.method341(var5);
				class4 var9 = class4.field56[var3];
				String var10;
				if (var9 != null && var9.field58[var2] >= 100000) {
					var10 = var9.field58[var2] + " x " + var8.field902;
				} else if (var8.field903 == null) {
					var10 = "It's a " + var8.field902 + ".";
				} else {
					var10 = new String(var8.field903);
				}

				method526(0, var10, "");
			}

			if (var4 == 231) {
				class4 var11 = class4.field56[var3];
				boolean var12 = true;
				if (var11.field65 > 0) {
					var12 = method472(var11);
				}

				if (var12) {
					field1144.method213(244);
					field1144.method215(var3);
				}
			}

			if (var4 == 563) {
				field1144.method213(102);
				field1144.method215(var5);
				field1144.method215(var2);
				field1144.method215(var3);
				field1144.method215(field1058);
				field1316 = 0;
				field1317 = var3;
				field1318 = var2;
				field1319 = 2;
				if (class4.field56[var3].field62 == field1291) {
					field1319 = 1;
				}

				if (class4.field56[var3].field62 == field1275) {
					field1319 = 3;
				}
			}

			if (var4 == 1152) {
				class60 var13 = class60.method341(var5);
				String var14;
				if (var13.field903 == null) {
					var14 = "It's a " + var13.field902 + ".";
				} else {
					var14 = new String(var13.field903);
				}

				method526(0, var14, "");
			}

			if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
				if (var4 == 331) {
					field1144.method213(160);
				}

				if (var4 == 113) {
					field1144.method213(70);
				}

				if (var4 == 555) {
					field1144.method213(59);
				}

				if (var4 == 582) {
					if ((var5 & 0x3) == 0) {
						field1256++;
					}

					if (field1256 >= 133) {
						field1144.method213(131);
						field1144.method215(6118);
					}

					field1144.method213(181);
				}

				if (var4 == 354) {
					field1144.method213(62);
				}

				field1144.method215(var5);
				field1144.method215(var2);
				field1144.method215(var3);
				field1316 = 0;
				field1317 = var3;
				field1318 = var2;
				field1319 = 2;
				if (class4.field56[var3].field62 == field1291) {
					field1319 = 1;
				}

				if (class4.field56[var3].field62 == field1275) {
					field1319 = 3;
				}
			}

			if (var4 == 1381) {
				int var15 = var5 >> 14 & 0x7FFF;
				class57 var16 = class57.method325(var15);
				String var17;
				if (var16.field824 == null) {
					var17 = "It's a " + var16.field823 + ".";
				} else {
					var17 = new String(var16.field824);
				}

				method526(0, var17, "");
			}

			if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
				class26 var18 = field1349[var5];
				if (var18 != null) {
					method429(var18.field411[0], 2, field1133.field411[0], 0, false, var18.field410[0], 1, field1133.field410[0], 0, 0, 1);
					field1308 = field24;
					field1309 = field25;
					field1311 = 2;
					field1310 = 0;

					if (var4 == 309) {
						field1144.method213(69);
					}

					if (var4 == 242) {
						field1144.method213(143);
					}

					if (var4 == 852) {
						field1144.method213(122);
					}

					if (var4 == 209) {
						field1144.method213(195);
					}

					if (var4 == 793) {
						field1144.method213(118);
					}

					field1144.method215(var5);
				}
			}

			if (var4 == 102) {
				field1084 = 1;
				field1085 = var2;
				field1086 = var3;
				field1087 = var5;
				field1088 = class60.method341(var5).field902;
				field1057 = 0;
				field1082 = true;
			} else {
				if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
					if (var4 == 100) {
						field1144.method213(74);
					}

					if (var4 == 694) {
						field1144.method213(243);
					}

					if (var4 == 681) {
						field1460++;
						if (field1460 >= 116) {
							field1144.method213(162);
							field1144.method217(0xC6A439);
						}

						field1144.method213(163);
					}

					if (var4 == 962) {
						field1144.method213(228);
					}

					if (var4 == 795) {
						field1144.method213(80);
					}

					field1144.method215(var5);
					field1144.method215(var2);
					field1144.method215(var3);
					field1316 = 0;
					field1317 = var3;
					field1318 = var2;
					field1319 = 2;
					if (class4.field56[var3].field62 == field1291) {
						field1319 = 1;
					}

					if (class4.field56[var3].field62 == field1275) {
						field1319 = 3;
					}
				}

				if (var4 == 370) {
					boolean var19 = method429(var3, 2, field1133.field411[0], 0, false, var2, 0, field1133.field410[0], 0, 0, 0);
					if (!var19) {
						method429(var3, 2, field1133.field411[0], 0, false, var2, 1, field1133.field410[0], 0, 0, 1);
					}

					field1308 = field24;
					field1309 = field25;
					field1311 = 2;
					field1310 = 0;
					field1144.method213(202);
					field1144.method215(field1209 + var2);
					field1144.method215(field1210 + var3);
					field1144.method215(var5);
					field1144.method215(field1058);
				}

				if (var4 == 225) {
					field1144.method213(244);
					field1144.method215(var3);
					class4 var21 = class4.field56[var3];
					if (var21.field71 != null && var21.field71[0][0] == 5) {
						int var22 = var21.field71[0][1];
						if (field1152[var22] != var21.field73[0]) {
							field1152[var22] = var21.field73[0];
							method535(var22);
							field1082 = true;
						}
					}
				}

				if (var4 == 625) {
					method520(var3, var2, 33, var5);
				}

				if (var4 == 718) {
					if (field1250) {
						field1136.method88(var3 - 4, var2 - 4);
					} else {
						field1136.method88(field25 - 4, field24 - 4);
					}
				}

				if (var4 == 275) {
					class27 var23 = field1439[var5];
					if (var23 != null) {
						method429(var23.field411[0], 2, field1133.field411[0], 0, false, var23.field410[0], 1, field1133.field410[0], 0, 0, 1);
						field1308 = field24;
						field1309 = field25;
						field1311 = 2;
						field1310 = 0;
						field1144.method213(113);
						field1144.method215(var5);
						field1144.method215(field1087);
						field1144.method215(field1085);
						field1144.method215(field1086);
					}
				}

				if (var4 == 721) {
					field1153 += var3;
					if (field1153 >= 139) {
						field1144.method213(28);
						field1144.method218(0);
					}

					method520(var3, var2, 213, var5);
				}

				if (var4 == 899 && method520(var3, var2, 26, var5)) {
					field1144.method215(field1058);
				}

				if (var4 == 743) {
					field1181++;
					if (field1181 >= 124) {
						field1144.method213(77);
						field1144.method215(37954);
					}

					method520(var3, var2, 98, var5);
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class27 var24 = field1439[var5];
					if (var24 != null) {
						method429(var24.field411[0], 2, field1133.field411[0], 0, false, var24.field410[0], 1, field1133.field410[0], 0, 0, 1);
						field1308 = field24;
						field1309 = field25;
						field1311 = 2;
						field1310 = 0;

						if (var4 == 499) {
							field1144.method213(17);
						}

						if (var4 == 639) {
							field1193++;
							if (field1193 >= 52) {
								field1144.method213(121);
								field1144.method214(131);
							}

							field1144.method213(192);
						}

						if (var4 == 27) {
							field1144.method213(18);
						}

						if (var4 == 387) {
							field1312 += var5;
							if (field1312 >= 66) {
								field1144.method213(233);
								field1144.method214(154);
							}

							field1144.method213(72);
						}

						if (var4 == 185) {
							field1144.method213(230);
						}

						field1144.method215(var5);
					}
				}

				if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
					String var25 = field1307[arg0];
					int var26 = var25.indexOf("@whi@");
					if (var26 != -1) {
						long var27 = class51.method295(var25.substring(var26 + 5).trim());
						if (var4 == 605) {
							method478(var27);
						}

						if (var4 == 47) {
							method487(var27);
						}

						if (var4 == 513) {
							method447(var27);
						}

						if (var4 == 884) {
							method458(var27);
						}
					}
				}

				if (var4 == 435) {
					field1144.method213(244);
					field1144.method215(var3);
					class4 var29 = class4.field56[var3];
					if (var29.field71 != null && var29.field71[0][0] == 5) {
						int var30 = var29.field71[0][1];
						field1152[var30] = 1 - field1152[var30];
						method535(var30);
						field1082 = true;
					}
				}

				if (var4 == 131) {
					class27 var31 = field1439[var5];
					if (var31 != null) {
						method429(var31.field411[0], 2, field1133.field411[0], 0, false, var31.field410[0], 1, field1133.field410[0], 0, 0, 1);
						field1308 = field24;
						field1309 = field25;
						field1311 = 2;
						field1310 = 0;
						field1144.method213(68);
						field1144.method215(var5);
						field1144.method215(field1058);
					}
				}

				if (var4 == 274) {
					class4 var32 = class4.field56[var3];
					field1057 = 1;
					field1058 = var3;
					field1059 = var32.field116;
					field1084 = 0;
					field1082 = true;
					String var33 = var32.field114;
					if (var33.indexOf(" ") != -1) {
						var33 = var33.substring(0, var33.indexOf(" "));
					}

					String var34 = var32.field114;
					if (var34.indexOf(" ") != -1) {
						var34 = var34.substring(var34.indexOf(" ") + 1);
					}

					field1060 = var33 + " " + var32.field115 + " " + var34;

					if (field1059 == 16) {
						field1082 = true;
						field1292 = 3;
						field1268 = true;
					}
				} else {
					if (var4 == 524) {
						String var35 = field1307[arg0];
						int var36 = var35.indexOf("@whi@");
						if (var36 != -1) {
							method450();
							field1140 = var35.substring(var36 + 5).trim();
							field1095 = false;

							for (int var37 = 0; var37 < class4.field56.length; var37++) {
								if (class4.field56[var37] != null && class4.field56[var37].field65 == 600) {
									field1395 = field1291 = class4.field56[var37].field62;
									break;
								}
							}
						}
					}

					if (var4 == 357) {
						method520(var3, var2, 87, var5);
					}

					if (var4 == 1071) {
						method520(var3, var2, 147, var5);
					}

					if (var4 == 240) {
						class26 var38 = field1349[var5];
						if (var38 != null) {
							method429(var38.field411[0], 2, field1133.field411[0], 0, false, var38.field410[0], 1, field1133.field410[0], 0, 0, 1);
							field1308 = field24;
							field1309 = field25;
							field1311 = 2;
							field1310 = 0;
							field1144.method213(231);
							field1144.method215(var5);
							field1144.method215(field1058);
						}
					}

					if (var4 == 1714) {
						class26 var39 = field1349[var5];
						if (var39 != null) {
							String var40;
							if (var39.field415.field869 == null) {
								var40 = "It's a " + var39.field415.field868 + ".";
							} else {
								var40 = new String(var39.field415.field869);
							}

							method526(0, var40, "");
						}
					}

					if (var4 == 902) {
						String var41 = field1307[arg0];
						int var42 = var41.indexOf("@whi@");
						if (var42 != -1) {
							long var43 = class51.method295(var41.substring(var42 + 5).trim());
							int var45 = -1;
							for (int var46 = 0; var46 < field1229; var46++) {
								if (field1052[var46] == var43) {
									var45 = var46;
									break;
								}
							}

							if (var45 != -1 && field1146[var45] > 0) {
								field1155 = true;
								field1458 = false;
								field1174 = true;
								field1258 = "";
								field1056 = 3;
								field1326 = field1052[var45];
								field1245 = "Enter message to send to " + field1111[var45];
							}
						}
					}

					if (var4 == 507 || var4 == 957) {
						String var47 = field1307[arg0];
						int var48 = var47.indexOf("@whi@");
						if (var48 != -1) {
							var47 = var47.substring(var48 + 5).trim();
							String var49 = class51.method299(class51.method296(class51.method295(var47)));
							boolean var50 = false;
							for (int var51 = 0; var51 < field1440; var51++) {
								class27 var52 = field1439[field1441[var51]];
								if (var52 != null && var52.field416 != null && var52.field416.equalsIgnoreCase(var49)) {
									method429(var52.field411[0], 2, field1133.field411[0], 0, false, var52.field410[0], 1, field1133.field410[0], 0, 0, 1);

									if (var4 == 507) {
										field1312 += var5;
										if (field1312 >= 66) {
											field1144.method213(233);
											field1144.method214(154);
										}

										field1144.method213(72);
									}

									if (var4 == 957) {
										field1193++;
										if (field1193 >= 52) {
											field1144.method213(121);
											field1144.method214(131);
										}

										field1144.method213(192);
									}

									field1144.method215(field1441[var51]);
									var50 = true;
									break;
								}
							}

							if (!var50) {
								method526(0, "Unable to find " + var49, "");
							}
						}
					}

					if (var4 == 997 && !field1089) {
						field1144.method213(146);
						field1144.method215(var3);
						field1089 = true;
					}

					if (var4 == 829) {
						class26 var53 = field1349[var5];
						if (var53 != null) {
							method429(var53.field411[0], 2, field1133.field411[0], 0, false, var53.field410[0], 1, field1133.field410[0], 0, 0, 1);
							field1308 = field24;
							field1309 = field25;
							field1311 = 2;
							field1310 = 0;
							field1144.method213(119);
							field1144.method215(var5);
							field1144.method215(field1087);
							field1144.method215(field1085);
							field1144.method215(field1086);
						}
					}

					if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
						boolean var54 = method429(var3, 2, field1133.field411[0], 0, false, var2, 0, field1133.field410[0], 0, 0, 0);
						if (!var54) {
							method429(var3, 2, field1133.field411[0], 0, false, var2, 1, field1133.field410[0], 0, 0, 1);
						}

						field1308 = field24;
						field1309 = field25;
						field1311 = 2;
						field1310 = 0;

						if (var4 == 662) {
							field1287 += field1210;
							if (field1287 >= 118) {
								field1144.method213(56);
								field1144.method218(0);
							}

							field1144.method213(97);
						}

						if (var4 == 224) {
							field1154 += var3;
							if (field1154 >= 75) {
								field1144.method213(206);
								field1144.method214(19);
							}

							field1144.method213(47);
						}

						if (var4 == 139) {
							if ((var2 & 0x3) == 0) {
								field1331++;
							}

							if (field1331 >= 123) {
								field1144.method213(187);
								field1144.method218(0);
							}

							field1144.method213(141);
						}

						if (var4 == 778) {
							field1144.method213(67);
						}

						if (var4 == 617) {
							field1144.method213(178);
						}

						field1144.method215(field1209 + var2);
						field1144.method215(field1210 + var3);
						field1144.method215(var5);
					}

					if (var4 == 398) {
						field1144.method213(200);
						field1144.method215(var5);
						field1144.method215(var2);
						field1144.method215(var3);
						field1144.method215(field1087);
						field1144.method215(field1085);
						field1144.method215(field1086);
						field1316 = 0;
						field1317 = var3;
						field1318 = var2;
						field1319 = 2;
						if (class4.field56[var3].field62 == field1291) {
							field1319 = 1;
						}

						if (class4.field56[var3].field62 == field1275) {
							field1319 = 3;
						}
					}

					field1084 = 0;
					field1057 = 0;
					field1082 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method487(long arg0) {
		if (arg0 != 0L) {
			if (field1413 >= 100) {
				method526(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = class51.method299(class51.method296(arg0));
				for (int var4 = 0; var4 < field1413; var4++) {
					if (field1172[var4] == arg0) {
						method526(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1229; var5++) {
					if (field1052[var5] == arg0) {
						method526(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field1172[field1413++] = arg0;
				field1082 = true;
				field1144.method213(189);
				field1144.method220(arg0);
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method488() {
		if (field1185 == null) {
			method542();
			field10 = null;
			field1375 = null;
			field1376 = null;
			field1377 = null;
			field1378 = null;
			field1379 = null;
			field1380 = null;
			field1381 = null;
			field1382 = null;
			field1383 = null;
			field1185 = new class43(479, method11(), 96);
			field1183 = new class43(172, method11(), 156);
			class33.method154();
			field1050.method198(0, 0);
			field1182 = new class43(190, method11(), 261);
			field1184 = new class43(512, method11(), 334);
			class33.method154();
			field1356 = new class43(496, method11(), 50);
			field1357 = new class43(269, method11(), 37);
			field1358 = new class43(249, method11(), 45);
			field1344 = true;
		}
	}

	public final void init() {
		field1271 = Integer.parseInt(getParameter("nodeid"));
		field1272 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method432();
		} else {
			method459();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1273 = false;
		} else {
			field1273 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.w(I)V")
	public final void method489() {
		byte[] var1 = field1431.method294("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1378.method253();
		var2.method183(0, 0);
		field1379.method253();
		var2.method183(0, -637);
		field1375.method253();
		var2.method183(0, -128);
		field1376.method253();
		var2.method183(-371, -202);
		field1377.method253();
		var2.method183(-171, -202);
		field1380.method253();
		var2.method183(-265, 0);
		field1381.method253();
		var2.method183(-265, -562);
		field1382.method253();
		var2.method183(-171, -128);
		field1383.method253();
		var2.method183(-171, -562);
		int[] var3 = new int[var2.field592];
		for (int var4 = 0; var4 < var2.field593; var4++) {
			for (int var5 = 0; var5 < var2.field592; var5++) {
				var3[var5] = var2.field591[var2.field592 * var4 + var2.field592 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field592; var6++) {
				var2.field591[var2.field592 * var4 + var6] = var3[var6];
			}
		}

		field1378.method253();
		var2.method183(0, 382);
		field1379.method253();
		var2.method183(0, -255);
		field1375.method253();
		var2.method183(0, 254);
		field1376.method253();
		var2.method183(-371, 180);
		field1377.method253();
		var2.method183(-171, 180);
		field1380.method253();
		var2.method183(-265, 382);
		field1381.method253();
		var2.method183(-265, -180);
		field1382.method253();
		var2.method183(-171, 254);
		field1383.method253();
		var2.method183(-171, -180);
		class35 var7 = new class35(field1431, "logo", 0);
		field1375.method253();
		var7.method185(18, 382 - var7.field592 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.i(B)Z")
	public final boolean method490() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.g(II)V")
	public final void method491(int arg0, int arg1) {
		class41 var3 = field1158[field1432][arg0][arg1];
		if (var3 == null) {
			field1136.method71(field1432, arg0, arg1);
		} else {
			int var4 = -99999999;
			class29 var5 = null;
			for (class29 var6 = (class29) var3.method243(); var6 != null; var6 = (class29) var3.method245()) {
				class60 var7 = class60.method341(var6.field450);
				int var8 = var7.field914;
				if (var7.field913) {
					var8 = (var6.field451 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method241(var5);
			class29 var9 = null;
			class29 var10 = null;
			for (class29 var11 = (class29) var3.method243(); var11 != null; var11 = (class29) var3.method245()) {
				if (var5.field450 != var11.field450 && var9 == null) {
					var9 = var11;
				}

				if (var5.field450 != var11.field450 && var9.field450 != var11.field450 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1136.method57(var10, var12, field1432, arg0, var9, var5, method525(field1432, arg0 * 128 + 64, arg1 * 128 + 64), arg1);
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method492() {
		if (field1068 > 0) {
			method430();
		} else {
			field1184.method253();
			field1217.method200(257, 144, 0, "Connection lost");
			field1217.method200(256, 143, 0xFFFFFF, "Connection lost");
			field1217.method200(257, 159, 0, "Please wait - attempting to reestablish");
			field1217.method200(256, 158, 0xFFFFFF, "Please wait - attempting to reestablish");
			field1184.method254(4, 4, field9);
			field1353 = 0;
			class5 var1 = field1374;
			field1320 = false;
			method546(field1118, field1119, true);

			if (!field1320) {
				method430();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method493() {
		field1106++;
		if (field1106 > 192) {
			field1106 = 0;
			field1144.method213(226);
			field1144.method214(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1291 != -1 && field1395 == field1291) {
						break;
					}

					if (field1174) {
						if (var1 >= 32 && var1 <= 122 && field1258.length() < 80) {
							field1258 = field1258 + (char) var1;
							field1155 = true;
						}

						if (var1 == 8 && field1258.length() > 0) {
							field1258 = field1258.substring(0, field1258.length() - 1);
							field1155 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1174 = false;
							field1155 = true;

							if (field1056 == 1) {
								long var2 = class51.method295(field1258);
								method478(var2);
							}

							if (field1056 == 2 && field1229 > 0) {
								long var4 = class51.method295(field1258);
								method447(var4);
							}

							if (field1056 == 3 && field1258.length() > 0) {
								field1144.method213(214);
								field1144.method214(0);
								int var6 = field1144.field616;
								field1144.method220(field1326);
								class52.method303(field1144, field1258);
								field1144.method223(field1144.field616 - var6);
								field1258 = class51.method300(field1258);
								field1258 = class71.method394(field1258);
								method526(6, field1258, class51.method299(class51.method296(field1326)));

								if (field1105 == 2) {
									field1105 = 1;
									field1321 = true;
									field1144.method213(129);
									field1144.method214(field1187);
									field1144.method214(field1105);
									field1144.method214(field1327);
								}
							}

							if (field1056 == 4 && field1413 < 100) {
								long var7 = class51.method295(field1258);
								method487(var7);
							}

							if (field1056 == 5 && field1413 > 0) {
								long var9 = class51.method295(field1258);
								method458(var9);
							}
						}
					} else if (field1458) {
						if (var1 >= 48 && var1 <= 57 && field1352.length() < 10) {
							field1352 = field1352 + (char) var1;
							field1155 = true;
						}

						if (var1 == 8 && field1352.length() > 0) {
							field1352 = field1352.substring(0, field1352.length() - 1);
							field1155 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1352.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1352);
								} catch (Exception var16) {
								}

								field1144.method213(161);
								field1144.method218(var11);
							}

							field1458 = false;
							field1155 = true;
						}
					} else if (field1275 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1402.length() < 80) {
							field1402 = field1402 + (char) var1;
							field1155 = true;
						}

						if (var1 == 8 && field1402.length() > 0) {
							field1402 = field1402.substring(0, field1402.length() - 1);
							field1155 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1402.length() > 0) {
							if (field1363 == 2) {
								if (field1402.equals("::clientdrop")) {
									method492();
								}

								if (field1402.equals("::lag")) {
									method517();
								}

								if (field1402.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1384.method267(2); var12++) {
										field1384.method277(2, var12, (byte) 1);
									}
								}
							}

							if (field1402.startsWith("::")) {
								field1144.method213(86);
								field1144.method214(field1402.length() - 1);
								field1144.method221(field1402.substring(2));
							} else {
								byte var13 = 0;
								if (field1402.startsWith("yellow:")) {
									var13 = 0;
									field1402 = field1402.substring(7);
								}

								if (field1402.startsWith("red:")) {
									var13 = 1;
									field1402 = field1402.substring(4);
								}

								if (field1402.startsWith("green:")) {
									var13 = 2;
									field1402 = field1402.substring(6);
								}

								if (field1402.startsWith("cyan:")) {
									var13 = 3;
									field1402 = field1402.substring(5);
								}

								if (field1402.startsWith("purple:")) {
									var13 = 4;
									field1402 = field1402.substring(7);
								}

								if (field1402.startsWith("white:")) {
									var13 = 5;
									field1402 = field1402.substring(6);
								}

								if (field1402.startsWith("flash1:")) {
									var13 = 6;
									field1402 = field1402.substring(7);
								}

								if (field1402.startsWith("flash2:")) {
									var13 = 7;
									field1402 = field1402.substring(7);
								}

								if (field1402.startsWith("flash3:")) {
									var13 = 8;
									field1402 = field1402.substring(7);
								}

								if (field1402.startsWith("glow1:")) {
									var13 = 9;
									field1402 = field1402.substring(6);
								}

								if (field1402.startsWith("glow2:")) {
									var13 = 10;
									field1402 = field1402.substring(6);
								}

								if (field1402.startsWith("glow3:")) {
									var13 = 11;
									field1402 = field1402.substring(6);
								}

								byte var14 = 0;
								if (field1402.startsWith("wave:")) {
									var14 = 1;
									field1402 = field1402.substring(5);
								}

								if (field1402.startsWith("scroll:")) {
									var14 = 2;
									field1402 = field1402.substring(7);
								}

								field1144.method213(83);
								field1144.method214(0);
								int var15 = field1144.field616;
								field1144.method214(var13);
								field1144.method214(var14);
								class52.method303(field1144, field1402);
								field1144.method223(field1144.field616 - var15);
								field1402 = class51.method300(field1402);
								field1402 = class71.method394(field1402);
								field1133.field372 = field1402;
								field1133.field374 = var13;
								field1133.field375 = var14;
								field1133.field373 = 150;

								if (field1363 == 2) {
									method526(2, field1133.field372, "@cr2@" + field1133.field416);
								} else if (field1363 == 1) {
									method526(2, field1133.field372, "@cr1@" + field1133.field416);
								} else {
									method526(2, field1133.field372, field1133.field416);
								}

								if (field1187 == 2) {
									field1187 = 3;
									field1321 = true;
									field1144.method213(129);
									field1144.method214(field1187);
									field1144.method214(field1105);
									field1144.method214(field1327);
								}
							}

							field1402 = "";
							field1155 = true;
						}
					}
				}

				if (var1 == 8 && field1140.length() > 0) {
					field1140 = field1140.substring(0, field1140.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1140.length() < 12) {
				field1140 = field1140 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method494(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(Lab;IBII)V")
	public final void method495(class27 arg0, int arg1, int arg2, int arg3) {
		if (field1133 != arg0 && field1096 < 400) {
			String var5;
			if (arg0.field423 == 0) {
				var5 = arg0.field416 + method468(arg0.field422, field1133.field422) + " (level-" + arg0.field422 + ")";
			} else {
				var5 = arg0.field416 + " (skill-" + arg0.field423 + ")";
			}

			if (field1084 == 1) {
				field1307[field1096] = "Use " + field1088 + " with @whi@" + var5;
				field1366[field1096] = 275;
				field1367[field1096] = arg1;
				field1364[field1096] = arg3;
				field1365[field1096] = arg2;
				field1096++;
			} else if (field1057 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1170[var6] != null) {
						field1307[field1096] = field1170[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1170[var6].equalsIgnoreCase("attack")) {
							if (arg0.field422 > field1133.field422) {
								var7 = 2000;
							}
						} else if (field1171[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1366[field1096] = var7 + 639;
						}

						if (var6 == 1) {
							field1366[field1096] = var7 + 499;
						}

						if (var6 == 2) {
							field1366[field1096] = var7 + 27;
						}

						if (var6 == 3) {
							field1366[field1096] = var7 + 387;
						}

						if (var6 == 4) {
							field1366[field1096] = var7 + 185;
						}

						field1367[field1096] = arg1;
						field1364[field1096] = arg3;
						field1365[field1096] = arg2;
						field1096++;
					}
				}
			} else if ((field1059 & 0x8) == 8) {
				field1307[field1096] = field1060 + " @whi@" + var5;
				field1366[field1096] = 131;
				field1367[field1096] = arg1;
				field1364[field1096] = arg3;
				field1365[field1096] = arg2;
				field1096++;
			}

			for (int var8 = 0; var8 < field1096; var8++) {
				if (field1366[var8] == 718) {
					field1307[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method496() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1196[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1196[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1197[var10] = (field1196[var10 - 1] + field1196[var10 + 1] + field1196[var10 - 128] + field1196[var10 + 128]) / 4;
			}
		}

		field1175 += 128;
		if (field1175 > field1062.length) {
			field1175 -= field1062.length;
			int var11 = (int) (Math.random() * 12.0D);
			method479(field1454[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1197[var14 + 128] - field1062[field1175 + var14 & field1062.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1196[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1079[var16] = field1079[var16 + 1];
		}

		field1079[var1 - 1] = (int) (Math.sin(field1410 / 14.0D) * 16.0D + Math.sin(field1410 / 15.0D) * 14.0D + Math.sin(field1410 / 16.0D) * 12.0D);

		if (field1387 > 0) {
			field1387 -= 4;
		}

		if (field1388 > 0) {
			field1388 -= 4;
		}

		if (field1387 == 0 && field1388 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1387 = 1024;
			}

			if (var17 == 1) {
				field1388 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZLd;)V")
	public final void method497(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1230 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1230 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1230 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1229;
				if (field1230 != 2) {
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
					arg0.field97 = field1111[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1229;
			if (field1230 != 2) {
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
				if (field1146[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1146[var2] == field1271) {
					arg0.field97 = "@gre@World-" + (field1146[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1146[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1229;
			if (field1230 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1413) {
				arg0.field97 = "";
				arg0.field64 = 0;
			} else {
				arg0.field97 = class51.method299(class51.method296(field1172[var2]));
				arg0.field64 = 1;
			}
		} else if (var2 == 503) {
			arg0.field75 = field1413 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1410 / 40.0D) * 256.0D) & 0x7FF;

			if (field1329) {
				for (int var6 = 0; var6 < 7; var6++) {
					int var7 = field1157[var6];
					if (var7 >= 0 && !class64.field962[var7].method370()) {
						return;
					}
				}

				field1329 = false;
				class31[] var8 = new class31[7];
				int var9 = 0;
				for (int var10 = 0; var10 < 7; var10++) {
					int var11 = field1157[var10];
					if (var11 >= 0) {
						var8[var9++] = class64.field962[var11].method371();
					}
				}

				class31 var12 = new class31(var9, var8);
				for (int var13 = 0; var13 < 5; var13++) {
					if (field1415[var13] != 0) {
						var12.method139(field1342[var13][0], field1342[var13][field1415[var13]]);

						if (var13 == 1) {
							var12.method139(field1047[0], field1047[field1415[var13]]);
						}
					}
				}

				var12.method132();
				var12.method133(class66.field982[field1133.field365].field984[0]);
				var12.method142(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(5, 0, var12);
			}
		} else if (var2 == 324) {
			if (field1080 == null) {
				field1080 = arg0.field103;
				field1081 = arg0.field104;
			}

			if (field1110) {
				arg0.field103 = field1081;
			} else {
				arg0.field103 = field1080;
			}
		} else if (var2 == 325) {
			if (field1080 == null) {
				field1080 = arg0.field103;
				field1081 = arg0.field104;
			}

			if (field1110) {
				arg0.field103 = field1080;
			} else {
				arg0.field103 = field1081;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1140;
			if (field1410 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1363 < 1) {
				arg0.field97 = "";
			} else if (field1095) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1220 == 0) {
				arg0.field97 = "";
			} else {
				String var14;
				if (field1423 == 0) {
					var14 = "earlier today";
				} else if (field1423 == 1) {
					var14 = "yesterday";
				} else {
					var14 = field1423 + " days ago";
				}

				arg0.field97 = "You last logged in " + var14 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1336 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1336 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1336 > 1) {
				arg0.field97 = field1336 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1151 == 201) {
				if (field1328 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1151 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var15;
				if (field1151 == 0) {
					var15 = "Earlier today";
				} else if (field1151 == 1) {
					var15 = "Yesterday";
				} else {
					var15 = field1151 + " days ago";
				}

				arg0.field97 = var15 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1151 == 201) {
				if (field1328 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1151 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1151 == 201) {
				if (field1328 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1151 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1136.method76(arg1, arg2, arg3);
		if (var6 != 0) {
			int var7 = field1136.method80(arg1, arg2, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field1355.field591;
			int var12 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method325(var13);
			if (var14.field841 == -1) {
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
				class36 var15 = field1386[var14.field841];
				if (var15 != null) {
					int var16 = (var14.field827 * 4 - var15.field600) / 2;
					int var17 = (var14.field828 * 4 - var15.field601) / 2;
					var15.method198((104 - arg3 - var14.field828) * 4 + var17 + 48, arg2 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field1136.method78(arg1, arg2, arg3);
		if (var18 != 0) {
			int var19 = field1136.method80(arg1, arg2, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method325(var22);
			if (var23.field841 != -1) {
				class36 var24 = field1386[var23.field841];
				if (var24 != null) {
					int var25 = (var23.field827 * 4 - var24.field600) / 2;
					int var26 = (var23.field828 * 4 - var24.field601) / 2;
					var24.method198((104 - arg3 - var23.field828) * 4 + var26 + 48, arg2 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1355.field591;
				int var29 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field1136.method79(arg1, arg2, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method325(var31);
			if (var32.field841 != -1) {
				class36 var33 = field1386[var32.field841];
				if (var33 != null) {
					int var34 = (var32.field827 * 4 - var33.field600) / 2;
					int var35 = (var32.field828 * 4 - var33.field601) / 2;
					var33.method198((104 - arg3 - var32.field828) * 4 + var35 + 48, arg2 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;IIILjava/lang/String;)Lxb;")
	public final class50 method499(String arg0, int arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1195[0] != null) {
				var6 = field1195[0].method286(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1428.reset();
			field1428.update(var6);
			int var8 = (int) field1428.getValue();
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
			method13(arg3, "Requesting " + arg0);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method427(arg4 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class38 var16 = new class38(var15);
				var16.field616 = 3;
				int var17 = var16.method228() + 6;
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
						method13(arg3, "Loading " + arg0 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1195[0] != null) {
						field1195[0].method287(var6, arg2, var6.length);
					}
				} catch (Exception var28) {
					field1195[0] = null;
				}

				if (var6 != null) {
					field1428.reset();
					field1428.update(var6);
					int var23 = (int) field1428.getValue();
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

				field1100 = !field1100;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.a(Lnb;B)V")
	public final void method500(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field634 == 0) {
			var2 = field1136.method76(arg0.field633, arg0.field635, arg0.field636);
		}

		if (arg0.field634 == 1) {
			var2 = field1136.method77(arg0.field633, arg0.field635, arg0.field636);
		}

		if (arg0.field634 == 2) {
			var2 = field1136.method78(arg0.field633, arg0.field635, arg0.field636);
		}

		if (arg0.field634 == 3) {
			var2 = field1136.method79(arg0.field633, arg0.field635, arg0.field636);
		}

		if (var2 != 0) {
			int var6 = field1136.method80(arg0.field633, arg0.field635, arg0.field636, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field637 = var3;
		arg0.field639 = var4;
		arg0.field638 = var5;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method501(boolean arg0) {
		for (int var2 = 0; var2 < field1350; var2++) {
			class26 var3 = field1349[field1351[var2]];
			int var4 = (field1351[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field888 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1418[var5][var6] == field1267) {
							continue;
						}

						field1418[var5][var6] = field1267;
					}

					field1136.method61(var3.field362, var3.field361, var3.field363, var3.field360, method525(field1432, var3.field360, var3.field361), var3, field1432, (var3.field364 - 1) * 64 + 60, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method502() {
		for (int var1 = 0; var1 < field1350; var1++) {
			int var2 = field1351[var1];
			class26 var3 = field1349[var2];
			if (var3 != null) {
				method503(var3.field415.field870, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ZILy;)V")
	public final void method503(int arg0, class25 arg1) {
		if (arg1.field360 < 128 || arg1.field361 < 128 || arg1.field360 >= 13184 || arg1.field361 >= 13184) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (field1133 == arg1 && (arg1.field360 < 1536 || arg1.field361 < 1536 || arg1.field360 >= 11776 || arg1.field361 >= 11776)) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (arg1.field402 > field1410) {
			method504(arg1);
		} else if (arg1.field403 >= field1410) {
			method505(arg1);
		} else {
			method506(arg1);
		}

		method507(arg1);
		method508(arg1);
	}

	@ObfuscatedName("client.a(Ly;I)V")
	public final void method504(class25 arg0) {
		int var2 = arg0.field402 - field1410;
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

	@ObfuscatedName("client.b(Ly;I)V")
	public final void method505(class25 arg0) {
		if (field1410 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field982[arg0.field388].method375(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1410 - arg0.field402;
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
	public final void method506(class25 arg0) {
		arg0.field385 = arg0.field365;
		if (arg0.field409 == 0) {
			arg0.field413 = 0;
		} else {
			if (arg0.field388 != -1 && arg0.field391 == 0) {
				class66 var2 = class66.field982[arg0.field388];
				if (arg0.field414 > 0 && var2.field994 == 0) {
					arg0.field413++;
					return;
				}

				if (arg0.field414 <= 0 && var2.field995 == 0) {
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
	public final void method507(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1349[arg0.field382];
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
				if (field1339 == var5) {
					var5 = field1438;
				}

				class27 var6 = field1439[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1209 - field1209) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1210 - field1210) * 64;
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

	@ObfuscatedName("client.a(ILy;)V")
	public final void method508(class25 arg0) {
		arg0.field363 = false;

		if (arg0.field385 != -1) {
			class66 var2 = class66.field982[arg0.field385];
			arg0.field387++;
			if (arg0.field386 < var2.field983 && arg0.field387 > var2.method375(arg0.field386)) {
				arg0.field387 = 0;
				arg0.field386++;
			}

			if (arg0.field386 >= var2.field983) {
				arg0.field387 = 0;
				arg0.field386 = 0;
			}
		}

		if (arg0.field393 != -1 && field1410 >= arg0.field396) {
			if (arg0.field394 < 0) {
				arg0.field394 = 0;
			}

			class66 var3 = class68.field1001[arg0.field393].field1005;
			arg0.field395++;
			while (arg0.field394 < var3.field983 && arg0.field395 > var3.method375(arg0.field394)) {
				arg0.field395 -= var3.method375(arg0.field394);
				arg0.field394++;
			}

			if (arg0.field394 >= var3.field983 && (arg0.field394 < 0 || arg0.field394 >= var3.field983)) {
				arg0.field393 = -1;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 <= 1) {
			class66 var4 = class66.field982[arg0.field388];
			if (var4.field994 == 1 && arg0.field414 > 0 && arg0.field402 <= field1410 && arg0.field403 < field1410) {
				arg0.field391 = 1;
				return;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 == 0) {
			class66 var5 = class66.field982[arg0.field388];
			arg0.field390++;
			while (arg0.field389 < var5.field983 && arg0.field390 > var5.method375(arg0.field389)) {
				arg0.field390 -= var5.method375(arg0.field389);
				arg0.field389++;
			}

			if (arg0.field389 >= var5.field983) {
				arg0.field389 -= var5.field987;
				arg0.field392++;
				if (arg0.field392 >= var5.field993) {
					arg0.field388 = -1;
				}

				if (arg0.field389 < 0 || arg0.field389 >= var5.field983) {
					arg0.field388 = -1;
				}
			}

			arg0.field363 = var5.field989;
		}

		if (arg0.field391 > 0) {
			arg0.field391--;
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method509() {
		if (field1344) {
			field1344 = false;
			field1232.method254(0, 4, field9);
			field1233.method254(0, 357, field9);
			field1234.method254(722, 4, field9);
			field1235.method254(743, 205, field9);
			field1236.method254(0, 0, field9);
			field1237.method254(516, 4, field9);
			field1238.method254(516, 205, field9);
			field1239.method254(496, 357, field9);
			field1240.method254(0, 338, field9);
			field1082 = true;
			field1155 = true;
			field1268 = true;
			field1321 = true;

			if (field1295 != 2) {
				field1184.method254(4, 4, field9);
				field1183.method254(550, 4, field9);
			}
		}

		if (field1295 == 2) {
			method537();
		}

		if (field1250 && field1188 == 1) {
			field1082 = true;
		}

		if (field1370 != -1) {
			boolean var1 = method513(field1370, field1053);
			if (var1) {
				field1082 = true;
			}
		}

		if (field1319 == 2) {
			field1082 = true;
		}

		if (field1447 == 2) {
			field1082 = true;
		}

		if (field1082) {
			method434();
			field1082 = false;
		}

		if (field1275 == -1) {
			field1407.field76 = field1330 - field1411 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method473(field1407, 463, 77, 0, field1330, false, field17 - 17, field18 - 357);
			}

			int var2 = field1330 - field1407.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1330 - 77) {
				var2 = field1330 - 77;
			}

			if (field1411 != var2) {
				field1411 = var2;
				field1155 = true;
			}
		}

		if (field1275 != -1) {
			boolean var3 = method513(field1275, field1053);
			if (var3) {
				field1155 = true;
			}
		}

		if (field1319 == 3) {
			field1155 = true;
		}

		if (field1447 == 3) {
			field1155 = true;
		}

		if (field1409 != null) {
			field1155 = true;
		}

		if (field1250 && field1188 == 2) {
			field1155 = true;
		}

		if (field1155) {
			method510();
			field1155 = false;
		}

		if (field1295 == 2) {
			method461();
			field1183.method254(550, 4, field9);
		}

		if (field1143 != -1) {
			field1268 = true;
		}

		if (field1268) {
			if (field1143 != -1 && field1292 == field1143) {
				field1143 = -1;
				field1144.method213(201);
				field1144.method214(field1292);
			}

			field1268 = false;
			field1358.method253();
			field1373.method198(0, 0);

			if (field1370 == -1) {
				if (field1163[field1292] != -1) {
					if (field1292 == 0) {
						field1124.method198(10, 22);
					}

					if (field1292 == 1) {
						field1125.method198(8, 54);
					}

					if (field1292 == 2) {
						field1125.method198(8, 82);
					}

					if (field1292 == 3) {
						field1126.method198(8, 110);
					}

					if (field1292 == 4) {
						field1128.method198(8, 153);
					}

					if (field1292 == 5) {
						field1128.method198(8, 181);
					}

					if (field1292 == 6) {
						field1127.method198(9, 209);
					}
				}

				if (field1163[0] != -1 && (field1143 != 0 || field1410 % 20 < 10)) {
					field1416[0].method198(13, 29);
				}

				if (field1163[1] != -1 && (field1143 != 1 || field1410 % 20 < 10)) {
					field1416[1].method198(11, 53);
				}

				if (field1163[2] != -1 && (field1143 != 2 || field1410 % 20 < 10)) {
					field1416[2].method198(11, 82);
				}

				if (field1163[3] != -1 && (field1143 != 3 || field1410 % 20 < 10)) {
					field1416[3].method198(12, 115);
				}

				if (field1163[4] != -1 && (field1143 != 4 || field1410 % 20 < 10)) {
					field1416[4].method198(13, 153);
				}

				if (field1163[5] != -1 && (field1143 != 5 || field1410 % 20 < 10)) {
					field1416[5].method198(11, 180);
				}

				if (field1163[6] != -1 && (field1143 != 6 || field1410 % 20 < 10)) {
					field1416[6].method198(13, 208);
				}
			}

			field1358.method254(516, 160, field9);
			field1357.method253();
			field1372.method198(0, 0);

			if (field1370 == -1) {
				if (field1163[field1292] != -1) {
					if (field1292 == 7) {
						field1397.method198(0, 42);
					}

					if (field1292 == 8) {
						field1398.method198(0, 74);
					}

					if (field1292 == 9) {
						field1398.method198(0, 102);
					}

					if (field1292 == 10) {
						field1399.method198(1, 130);
					}

					if (field1292 == 11) {
						field1401.method198(0, 173);
					}

					if (field1292 == 12) {
						field1401.method198(0, 201);
					}

					if (field1292 == 13) {
						field1400.method198(0, 229);
					}
				}

				if (field1163[8] != -1 && (field1143 != 8 || field1410 % 20 < 10)) {
					field1416[7].method198(2, 74);
				}

				if (field1163[9] != -1 && (field1143 != 9 || field1410 % 20 < 10)) {
					field1416[8].method198(3, 102);
				}

				if (field1163[10] != -1 && (field1143 != 10 || field1410 % 20 < 10)) {
					field1416[9].method198(4, 137);
				}

				if (field1163[11] != -1 && (field1143 != 11 || field1410 % 20 < 10)) {
					field1416[10].method198(2, 174);
				}

				if (field1163[12] != -1 && (field1143 != 12 || field1410 % 20 < 10)) {
					field1416[11].method198(2, 201);
				}

				if (field1163[13] != -1 && (field1143 != 13 || field1410 % 20 < 10)) {
					field1416[12].method198(2, 226);
				}
			}

			field1357.method254(496, 466, field9);
			field1184.method253();
		}

		if (field1321) {
			field1321 = false;
			field1356.method253();
			field1371.method198(0, 0);
			field1217.method201("Public chat", 28, 0xFFFFFF, true, 55);

			if (field1187 == 0) {
				field1217.method201("On", 41, 0xFF00, true, 55);
			}

			if (field1187 == 1) {
				field1217.method201("Friends", 41, 0xFFFF00, true, 55);
			}

			if (field1187 == 2) {
				field1217.method201("Off", 41, 0xFF0000, true, 55);
			}

			if (field1187 == 3) {
				field1217.method201("Hide", 41, 0xFFFF, true, 55);
			}

			field1217.method201("Private chat", 28, 0xFFFFFF, true, 184);

			if (field1105 == 0) {
				field1217.method201("On", 41, 0xFF00, true, 184);
			}

			if (field1105 == 1) {
				field1217.method201("Friends", 41, 0xFFFF00, true, 184);
			}

			if (field1105 == 2) {
				field1217.method201("Off", 41, 0xFF0000, true, 184);
			}

			field1217.method201("Trade/duel", 28, 0xFFFFFF, true, 324);

			if (field1327 == 0) {
				field1217.method201("On", 41, 0xFF00, true, 324);
			}

			if (field1327 == 1) {
				field1217.method201("Friends", 41, 0xFFFF00, true, 324);
			}

			if (field1327 == 2) {
				field1217.method201("Off", 41, 0xFF0000, true, 324);
			}

			field1217.method201("Report abuse", 33, 0xFFFFFF, true, 458);
			field1356.method254(0, 453, field9);
			field1184.method253();
		}

		field1053 = 0;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method510() {
		field1185.method253();
		class34.field579 = field1433;
		field1051.method198(0, 0);

		if (field1174) {
			field1218.method200(239, 40, 0, field1245);
			field1218.method200(239, 60, 128, field1258 + "*");
		} else if (field1458) {
			field1218.method200(239, 40, 0, "Enter amount:");
			field1218.method200(239, 60, 128, field1352 + "*");
		} else if (field1409 != null) {
			field1218.method200(239, 40, 0, field1409);
			field1218.method200(239, 60, 128, "Click to continue");
		} else if (field1275 != -1) {
			method422(0, 0, 0, class4.field56[field1275]);
		} else if (field1436 == -1) {
			class37 var1 = field1217;
			int var2 = 0;
			class33.method153(0, 463, 0, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1099[var3] != null) {
					int var4 = field1097[var3];
					int var5 = field1411 + 70 - var2 * 14;
					String var6 = field1098[var3];
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
							var1.method203(4, 0, field1099[var3], var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1187 == 0 || field1187 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1427[0].method198(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field1427[1].method198(var5 - 12, var8);
								var8 += 14;
							}

							var1.method203(var8, 0, var6 + ":", var5);
							var8 += var1.method202(var6) + 8;
							var1.method203(var8, 255, field1099[var3], var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1074 == 0 && (var4 == 7 || field1105 == 0 || field1105 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method203(var9, 0, "From", var5);
							int var11 = var9 + var1.method202("From ");
							if (var7 == 1) {
								field1427[0].method198(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field1427[1].method198(var5 - 12, var11);
								var11 += 14;
							}

							var1.method203(var11, 0, var6 + ":", var5);
							var11 += var1.method202(var6) + 8;
							var1.method203(var11, 0x800000, field1099[var3], var5);
						}

						var2++;
					}

					if (var4 == 4 && (field1327 == 0 || field1327 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method203(4, 0x800080, var6 + " " + field1099[var3], var5);
						}

						var2++;
					}

					if (var4 == 5 && field1074 == 0 && field1105 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method203(4, 0x800000, field1099[var3], var5);
						}

						var2++;
					}

					if (var4 == 6 && field1074 == 0 && field1105 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method203(4, 0, "To " + var6 + ":", var5);
							var1.method203(var1.method202("To " + var6) + 12, 0x800000, field1099[var3], var5);
						}

						var2++;
					}

					if (var4 == 8 && (field1327 == 0 || field1327 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method203(4, 0x7E3200, var6 + " " + field1099[var3], var5);
						}

						var2++;
					}
				}
			}

			class33.method152();
			field1330 = var2 * 14 + 7;
			if (field1330 < 78) {
				field1330 = 78;
			}

			method425(field1330 - field1411 - 77, 463, 77, field1330, 0);
			String var10;
			if (field1133 == null || field1133.field416 == null) {
				var10 = class51.method299(field1118);
			} else {
				var10 = field1133.field416;
			}

			var1.method203(4, 0, var10 + ":", 90);
			var1.method203(var1.method202(var10 + ": ") + 6, 255, field1402 + "*", 90);
			class33.method159(0, 0, 77, 479);
		} else {
			method422(0, 0, 0, class4.field56[field1436]);
		}

		if (field1250 && field1188 == 2) {
			method547();
		}

		field1185.method254(17, 357, field9);
		field1184.method253();
		class34.field579 = field1435;
	}

	@ObfuscatedName("client.i(II)Ljava/lang/String;")
	public final String method511(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method512(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1307[field1096] = "Remove @whi@" + arg0.field97;
				field1366[field1096] = 884;
				field1096++;
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

		field1307[field1096] = "Remove @whi@" + field1111[var2];
		field1366[field1096] = 513;
		field1096++;
		field1307[field1096] = "Message @whi@" + field1111[var2];
		field1366[field1096] = 902;
		field1096++;
		return true;
	}

	@ObfuscatedName("client.a(III)Z")
	public final boolean method513(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg0];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method513(var6.field61, arg1);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method438(var6);
				int var8;
				if (var7) {
					var8 = var6.field110;
				} else {
					var8 = var6.field109;
				}

				if (var8 != -1) {
					class66 var9 = class66.field982[var8];
					var6.field60 += arg1;
					while (var6.field60 > var9.method375(var6.field59)) {
						var6.field60 -= var9.method375(var6.field59) + 1;
						var6.field59++;
						if (var6.field59 >= var9.field983) {
							var6.field59 -= var9.field987;
							if (var6.field59 < 0 || var6.field59 >= var9.field983) {
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

	@ObfuscatedName("client.j(B)V")
	public final void method514() {
		if (field1447 == 0) {
			field1307[0] = "Cancel";
			field1366[0] = 1106;
			field1096 = 1;
			method440();
			field1134 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1291 == -1) {
					method480();
				} else {
					method444(field18, 0, 4, 4, field17, class4.field56[field1291]);
				}
			}

			if (field1231 != field1134) {
				field1231 = field1134;
			}

			field1134 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1370 != -1) {
					method444(field18, 0, 205, 553, field17, class4.field56[field1370]);
				} else if (field1163[field1292] != -1) {
					method444(field18, 0, 205, 553, field17, class4.field56[field1163[field1292]]);
				}
			}

			if (field1456 != field1134) {
				field1082 = true;
				field1456 = field1134;
			}

			field1134 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1275 != -1) {
					method444(field18, 0, 357, 17, field17, class4.field56[field1275]);
				} else if (field18 < 434 && field17 < 426) {
					method463(field17 - 17, field18 - 357);
				}
			}

			if (field1275 != -1 && field1255 != field1134) {
				field1155 = true;
				field1255 = field1134;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1096 - 1; var2++) {
					if (field1366[var2] < 1000 && field1366[var2 + 1] > 1000) {
						String var3 = field1307[var2];
						field1307[var2] = field1307[var2 + 1];
						field1307[var2 + 1] = var3;
						int var4 = field1366[var2];
						field1366[var2] = field1366[var2 + 1];
						field1366[var2 + 1] = var4;
						int var5 = field1364[var2];
						field1364[var2] = field1364[var2 + 1];
						field1364[var2 + 1] = var5;
						int var6 = field1365[var2];
						field1365[var2] = field1365[var2 + 1];
						field1365[var2 + 1] = var6;
						int var7 = field1367[var2];
						field1367[var2] = field1367[var2 + 1];
						field1367[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method515() {
		if (field1074 != 0) {
			class37 var1 = field1217;
			int var2 = 0;
			if (field1213 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1099[var3] != null) {
					int var4 = field1097[var3];
					String var5 = field1098[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1105 == 0 || field1105 == 1 && method445(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method203(var8, 0, "From", var7);
						var1.method203(var8, 0xFFFF, "From", var7 - 1);
						int var11 = var8 + var1.method202("From ");
						if (var6 == 1) {
							field1427[0].method198(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field1427[1].method198(var7 - 12, var11);
							var11 += 14;
						}

						var1.method203(var11, 0, var5 + ": " + field1099[var3], var7);
						var1.method203(var11, 0xFFFF, var5 + ": " + field1099[var3], var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1105 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method203(4, 0, field1099[var3], var9);
						var1.method203(4, 0xFFFF, field1099[var3], var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1105 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method203(4, 0, "To " + var5 + ": " + field1099[var3], var10);
						var1.method203(4, 0xFFFF, "To " + var5 + ": " + field1099[var3], var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILib;)V")
	public final void method516(int arg0, int arg1, class35 arg2) {
		int var4 = field1424 + field1076 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = class31.field545[var4];
			int var7 = class31.field546[var4];
			var6 = var6 * 256 / (field1246 + 256);
			var7 = var7 * 256 / (field1246 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method191(83 - var9 - arg2.field597 / 2 - 4, var8 + 94 - arg2.field596 / 2 + 4, field1050);
			} else {
				arg2.method185(83 - var9 - arg2.field597 / 2 - 4, var8 + 94 - arg2.field596 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public void method517() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1293);

		if (field1384 != null) {
			System.out.println("Od-cycle:" + field1384.field741);
		}

		System.out.println("loop-cycle:" + field1410);
		System.out.println("draw-cycle:" + field1164);
		System.out.println("ptype:" + field1065);
		System.out.println("psize:" + field1064);

		if (field1374 != null) {
			field1374.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.c(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.D(I)I")
	public final int method518() {
		int var1 = 3;
		if (field1302 < 310) {
			int var2 = field1299 >> 7;
			int var3 = field1301 >> 7;
			int var4 = field1133.field360 >> 7;
			int var5 = field1133.field361 >> 7;

			if ((field1360[field1432][var2][var3] & 0x4) != 0) {
				var1 = field1432;
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

					if ((field1360[field1432][var2][var3] & 0x4) != 0) {
						var1 = field1432;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1360[field1432][var2][var3] & 0x4) != 0) {
							var1 = field1432;
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

					if ((field1360[field1432][var2][var3] & 0x4) != 0) {
						var1 = field1432;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1360[field1432][var2][var3] & 0x4) != 0) {
							var1 = field1432;
						}
					}
				}
			}
		}

		if ((field1360[field1432][field1133.field360 >> 7][field1133.field361 >> 7] & 0x4) != 0) {
			var1 = field1432;
		}

		return var1;
	}

	@ObfuscatedName("client.E(I)I")
	public final int method519() {
		int var1 = method525(field1432, field1299, field1301);
		if (var1 - field1300 < 800 && (field1360[field1432][field1299 >> 7][field1301 >> 7] & 0x4) != 0) {
			return field1432;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method520(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field1136.method80(field1432, arg1, arg0, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1304++;
		if (field1304 > 1086) {
			field1304 = 0;
			field1144.method213(225);
			field1144.method214(0);
			int var9 = field1144.field616;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1144.method215(16791);
			}

			field1144.method214(254);
			field1144.method215((int) (Math.random() * 65536.0D));
			field1144.method215(16128);
			field1144.method215(52610);
			field1144.method215((int) (Math.random() * 65536.0D));
			field1144.method215(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1144.method215(35025);
			}

			field1144.method215(46628);
			field1144.method214((int) (Math.random() * 256.0D));
			field1144.method223(field1144.field616 - var9);
		}

		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var10 = class57.method325(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.field827;
				var12 = var10.field828;
			} else {
				var11 = var10.field828;
				var12 = var10.field827;
			}

			int var13 = var10.field850;
			if (var8 != 0) {
				var13 = (var13 >> 4 - var8) + (var13 << var8 & 0xF);
			}

			method429(arg0, 2, field1133.field411[0], 0, false, arg1, var11, field1133.field410[0], var13, 0, var12);
		} else {
			method429(arg0, 2, field1133.field411[0], var8, false, arg1, 0, field1133.field410[0], 0, var7 + 1, 0);
		}

		field1308 = field24;
		field1309 = field25;
		field1311 = 2;
		field1310 = 0;
		field1144.method213(arg2);
		field1144.method215(field1209 + arg1);
		field1144.method215(field1210 + arg0);
		field1144.method215(var5);
		return true;
	}

	@ObfuscatedName("client.k(B)Z")
	public final boolean method521() {
		if (field1374 == null) {
			return false;
		}

		try {
			int var1 = field1374.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1065 == -1) {
				field1374.method41(field1204.field615, 0, 1);
				field1065 = field1204.field615[0] & 0xFF;
				if (field1288 != null) {
					field1065 = field1065 - field1288.method290() & 0xFF;
				}

				field1064 = class61.field942[field1065];
				var1--;
			}

			if (field1064 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1374.method41(field1204.field615, 0, 1);
				field1064 = field1204.field615[0] & 0xFF;
				var1--;
			}

			if (field1064 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1374.method41(field1204.field615, 0, 2);
				field1204.field616 = 0;
				field1064 = field1204.method226();
				var1 -= 2;
			}

			if (var1 < field1064) {
				return false;
			}

			field1204.field616 = 0;
			field1374.method41(field1204.field615, 0, field1064);
			field1066 = 0;
			field1223 = field1222;
			field1222 = field1221;
			field1221 = field1065;

			if (field1065 == 163) {
				int var2 = field1204.method226();
				if (var2 == 0xFFFF) {
					var2 = -1;
				}

				if (field1294 != var2 && field1108 && !field1274 && field1305 == 0) {
					field1361 = var2;
					field1362 = true;
					field1384.method274(2, field1361);
				}

				field1294 = var2;
				field1065 = -1;
				return true;
			}

			if (field1065 == 242) {
				int var3 = field1204.method226();
				int var4 = field1204.method226();
				if (field1108 && !field1274) {
					field1361 = var3;
					field1362 = false;
					field1384.method274(2, field1361);
					field1305 = var4;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 196) {
				int var5 = field1204.method226();
				int var6 = field1204.method229();
				field1314[var5] = var6;

				if (field1152[var5] != var6) {
					field1152[var5] = var6;
					method535(var5);
					field1082 = true;

					if (field1436 != -1) {
						field1155 = true;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 14) {
				int var7 = field1204.method226();
				int var8 = field1204.method226();
				class4 var9 = class4.field56[var7];
				if (var9 != null && var9.field63 == 0) {
					if (var8 < 0) {
						var8 = 0;
					}

					if (var8 > var9.field75 - var9.field67) {
						var8 = var9.field75 - var9.field67;
					}

					var9.field76 = var8;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 87) {
				method532(field1064, field1204);
				field1419 = false;
				field1065 = -1;
				return true;
			}

			if (field1065 == 111) {
				long var10 = field1204.method230();
				int var12 = field1204.method224();
				String var13 = class51.method299(class51.method296(var10));
				for (int var14 = 0; var14 < field1229; var14++) {
					if (field1052[var14] == var10) {
						if (field1146[var14] != var12) {
							field1146[var14] = var12;
							field1082 = true;

							if (var12 > 0) {
								method526(5, var13 + " has logged in.", "");
							}

							if (var12 == 0) {
								method526(5, var13 + " has logged out.", "");
							}
						}

						var13 = null;
						break;
					}
				}

				if (var13 != null && field1229 < 200) {
					field1052[field1229] = var10;
					field1111[field1229] = var13;
					field1146[field1229] = var12;
					field1229++;
					field1082 = true;
				}

				boolean var15 = false;
				while (!var15) {
					var15 = true;
					for (int var16 = 0; var16 < field1229 - 1; var16++) {
						if (field1146[var16] != field1271 && field1146[var16 + 1] == field1271 || field1146[var16] == 0 && field1146[var16 + 1] != 0) {
							int var17 = field1146[var16];
							field1146[var16] = field1146[var16 + 1];
							field1146[var16 + 1] = var17;
							String var18 = field1111[var16];
							field1111[var16] = field1111[var16 + 1];
							field1111[var16 + 1] = var18;
							long var19 = field1052[var16];
							field1052[var16] = field1052[var16 + 1];
							field1052[var16 + 1] = var19;
							field1082 = true;
							var15 = false;
						}
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 91) {
				int var21 = field1204.method226();
				int var22 = field1204.method224();

				if (var21 == 0xFFFF) {
					var21 = -1;
				}

				field1163[var22] = var21;
				field1082 = true;
				field1268 = true;
				field1065 = -1;
				return true;
			}

			if (field1065 == 28) {
				field1082 = true;
				int var23 = field1204.method226();
				class4 var24 = class4.field56[var23];
				int var25 = field1204.method224();
				for (int var26 = 0; var26 < var25; var26++) {
					var24.field57[var26] = field1204.method226();
					int var27 = field1204.method224();
					if (var27 == 255) {
						var27 = field1204.method229();
					}

					var24.field58[var26] = var27;
				}

				for (int var28 = var25; var28 < var24.field57.length; var28++) {
					var24.field57[var28] = 0;
					var24.field58[var28] = 0;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 213) {
				field1339 = field1204.method226();
				field1070 = field1204.method224();
				field1065 = -1;
				return true;
			}

			if (field1065 == 222) {
				int var29 = field1204.method226();
				int var30 = field1204.method226();
				int var31 = field1204.method226();
				class60 var32 = class60.method341(var30);
				class4.field56[var29].field105 = 4;
				class4.field56[var29].field106 = var30;
				class4.field56[var29].field112 = var32.field907;
				class4.field56[var29].field113 = var32.field908;
				class4.field56[var29].field111 = var32.field906 * 100 / var31;
				field1065 = -1;
				return true;
			}

			if (field1065 == 63) {
				field1413 = field1064 / 8;
				for (int var33 = 0; var33 < field1413; var33++) {
					field1172[var33] = field1204.method230();
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 64) {
				field1198 = field1204.method224();
				if (field1198 == 1) {
					field1122 = field1204.method226();
				}

				if (field1198 >= 2 && field1198 <= 6) {
					if (field1198 == 2) {
						field1202 = 64;
						field1203 = 64;
					}

					if (field1198 == 3) {
						field1202 = 0;
						field1203 = 64;
					}

					if (field1198 == 4) {
						field1202 = 128;
						field1203 = 64;
					}

					if (field1198 == 5) {
						field1202 = 64;
						field1203 = 0;
					}

					if (field1198 == 6) {
						field1202 = 64;
						field1203 = 128;
					}

					field1198 = 2;
					field1199 = field1204.method226();
					field1200 = field1204.method226();
					field1201 = field1204.method224();
				}

				if (field1198 == 10) {
					field1452 = field1204.method226();
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 197) {
				int var34 = field1204.method226();
				method474(var34);

				if (field1370 != -1) {
					field1370 = -1;
					field1082 = true;
					field1268 = true;
				}

				if (field1275 != -1) {
					field1275 = -1;
					field1155 = true;
				}

				if (field1458) {
					field1458 = false;
					field1155 = true;
				}

				field1291 = var34;
				field1089 = false;
				field1065 = -1;
				return true;
			}

			if (field1065 == 255) {
				field1230 = field1204.method224();
				field1082 = true;
				field1065 = -1;
				return true;
			}

			if (field1065 == 5) {
				field1174 = false;
				field1458 = true;
				field1352 = "";
				field1155 = true;
				field1065 = -1;
				return true;
			}

			if (field1065 == 187) {
				int var35 = field1204.method226();
				method474(var35);

				if (field1275 != -1) {
					field1275 = -1;
					field1155 = true;
				}

				if (field1458) {
					field1458 = false;
					field1155 = true;
				}

				field1370 = var35;
				field1082 = true;
				field1268 = true;
				field1291 = -1;
				field1089 = false;
				field1065 = -1;
				return true;
			}

			if (field1065 == 161) {
				int var36 = field1204.method226();
				class4.field56[var36].field105 = 3;
				class4.field56[var36].field106 = (field1133.field420[8] << 6) + (field1133.field420[0] << 12) + (field1133.field421[0] << 24) + (field1133.field421[4] << 18) + field1133.field420[11];
				field1065 = -1;
				return true;
			}

			if (field1065 == 174) {
				if (field1370 != -1) {
					field1370 = -1;
					field1082 = true;
					field1268 = true;
				}

				if (field1275 != -1) {
					field1275 = -1;
					field1155 = true;
				}

				if (field1458) {
					field1458 = false;
					field1155 = true;
				}

				field1291 = -1;
				field1089 = false;
				field1065 = -1;
				return true;
			}

			if (field1065 == 0) {
				field1071 = true;
				field1259 = field1204.method224();
				field1260 = field1204.method224();
				field1261 = field1204.method226();
				field1262 = field1204.method224();
				field1263 = field1204.method224();
				if (field1263 >= 100) {
					int var37 = field1259 * 128 + 64;
					int var38 = field1260 * 128 + 64;
					int var39 = method525(field1432, var37, var38) - field1261;
					int var40 = var37 - field1299;
					int var41 = var39 - field1300;
					int var42 = var38 - field1301;
					int var43 = (int) Math.sqrt(var40 * var40 + var42 * var42);
					field1302 = (int) (Math.atan2(var41, var43) * 325.949D) & 0x7FF;
					field1303 = (int) (Math.atan2(var40, var42) * -325.949D) & 0x7FF;

					if (field1302 < 128) {
						field1302 = 128;
					}

					if (field1302 > 383) {
						field1302 = 383;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 141) {
				int var44 = field1204.method226();
				method474(var44);

				if (field1370 != -1) {
					field1370 = -1;
					field1082 = true;
					field1268 = true;
				}

				field1275 = var44;
				field1155 = true;
				field1291 = -1;
				field1089 = false;
				field1065 = -1;
				return true;
			}

			if (field1065 == 173) {
				field1137 = field1204.method224();
				field1138 = field1204.method224();
				field1065 = -1;
				return true;
			}

			if (field1065 == 209) {
				int var45 = field1204.method226();
				int var46 = field1204.method226();
				if (field1045 == var45 && field1046 == var46 && field1295 == 2) {
					field1065 = -1;
					return true;
				}

				field1045 = var45;
				field1046 = var46;
				field1209 = (field1045 - 6) * 8;
				field1210 = (field1046 - 6) * 8;
				field1408 = false;
				if ((field1045 / 8 == 48 || field1045 / 8 == 49) && field1046 / 8 == 48) {
					field1408 = true;
				}

				if (field1045 / 8 == 48 && field1046 / 8 == 148) {
					field1408 = true;
				}

				field1295 = 1;
				field1453 = System.currentTimeMillis();
				field1184.method253();
				field1217.method200(257, 151, 0, "Loading - please wait.");
				field1217.method200(256, 150, 0xFFFFFF, "Loading - please wait.");
				field1184.method254(4, 4, field9);
				int var47 = 0;
				for (int var48 = (field1045 - 6) / 8; var48 <= (field1045 + 6) / 8; var48++) {
					for (int var49 = (field1046 - 6) / 8; var49 <= (field1046 + 6) / 8; var49++) {
						var47++;
					}
				}

				field1338 = new byte[var47][];
				field1457 = new byte[var47][];
				field1102 = new int[var47];
				field1103 = new int[var47];
				field1104 = new int[var47];
				int var50 = 0;
				for (int var51 = (field1045 - 6) / 8; var51 <= (field1045 + 6) / 8; var51++) {
					for (int var52 = (field1046 - 6) / 8; var52 <= (field1046 + 6) / 8; var52++) {
						field1102[var50] = (var51 << 8) + var52;

						if (field1408 && (var52 == 49 || var52 == 149 || var52 == 147 || var51 == 50 || var51 == 49 && var52 == 47)) {
							field1103[var50] = -1;
							field1104[var50] = -1;
							var50++;
						} else {
							int var53 = field1103[var50] = field1384.method269(var52, 0, var51);
							if (var53 != -1) {
								field1384.method274(3, var53);
							}

							int var54 = field1104[var50] = field1384.method269(var52, 1, var51);
							if (var54 != -1) {
								field1384.method274(3, var54);
							}

							var50++;
						}
					}
				}

				int var55 = field1209 - field1211;
				int var56 = field1210 - field1212;
				field1211 = field1209;
				field1212 = field1210;

				for (int var57 = 0; var57 < 16384; var57++) {
					class26 var58 = field1349[var57];
					if (var58 != null) {
						for (int var59 = 0; var59 < 10; var59++) {
							var58.field410[var59] -= var55;
							var58.field411[var59] -= var56;
						}

						var58.field360 -= var55 * 128;
						var58.field361 -= var56 * 128;
					}
				}

				for (int var60 = 0; var60 < field1437; var60++) {
					class27 var61 = field1439[var60];
					if (var61 != null) {
						for (int var62 = 0; var62 < 10; var62++) {
							var61.field410[var62] -= var55;
							var61.field411[var62] -= var56;
						}

						var61.field360 -= var55 * 128;
						var61.field361 -= var56 * 128;
					}
				}

				field1419 = true;
				byte var63 = 0;
				byte var64 = 104;
				byte var65 = 1;
				if (var55 < 0) {
					var63 = 103;
					var64 = -1;
					var65 = -1;
				}

				byte var66 = 0;
				byte var67 = 104;
				byte var68 = 1;
				if (var56 < 0) {
					var66 = 103;
					var67 = -1;
					var68 = -1;
				}

				for (int var69 = var63; var69 != var64; var69 += var65) {
					for (int var70 = var66; var70 != var67; var70 += var68) {
						int var71 = var55 + var69;
						int var72 = var56 + var70;
						for (int var73 = 0; var73 < 4; var73++) {
							if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
								field1158[var73][var69][var70] = field1158[var73][var71][var72];
							} else {
								field1158[var73][var69][var70] = null;
							}
						}
					}
				}

				for (class40 var74 = (class40) field1094.method243(); var74 != null; var74 = (class40) field1094.method245()) {
					var74.field635 -= var55;
					var74.field636 -= var56;
					if (var74.field635 < 0 || var74.field636 < 0 || var74.field635 >= 104 || var74.field636 >= 104) {
						var74.method106();
					}
				}

				if (field1353 != 0) {
					field1353 -= var55;
					field1354 -= var56;
				}

				field1071 = false;
				field1065 = -1;
				return true;
			}

			if (field1065 == 146) {
				field1220 = field1204.method229();
				field1423 = field1204.method226();
				field1151 = field1204.method224();
				field1336 = field1204.method226();
				field1328 = field1204.method224();
				if (field1220 != 0 && field1291 == -1) {
					signlink.dnslookup(class51.method298(field1220));
					method450();
					short var75 = 650;
					if (field1151 != 201 || field1328 == 1) {
						var75 = 655;
					}

					field1140 = "";
					field1095 = false;

					for (int var76 = 0; var76 < class4.field56.length; var76++) {
						if (class4.field56[var76] != null && class4.field56[var76].field65 == var75) {
							field1291 = class4.field56[var76].field62;
							break;
						}
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 3) {
				int var77 = field1204.method226();
				int var78 = field1204.method226();
				class4.field56[var77].field105 = 2;
				class4.field56[var77].field106 = var78;
				field1065 = -1;
				return true;
			}

			if (field1065 == 239) {
				int var79 = field1204.method227();
				field1436 = var79;
				field1155 = true;
				field1065 = -1;
				return true;
			}

			if (field1065 == 85) {
				int var80 = field1204.method227();
				if (var80 >= 0) {
					method474(var80);
				}

				field1298 = var80;
				field1065 = -1;
				return true;
			}

			if (field1065 == 95) {
				int var81 = field1204.method226();
				int var82 = field1204.method227();
				class4 var83 = class4.field56[var81];
				var83.field109 = var82;

				if (var82 == -1) {
					var83.field59 = 0;
					var83.field60 = 0;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 21) {
				method430();
				field1065 = -1;
				return false;
			}

			if (field1065 == 249) {
				int var84 = field1204.method226();
				int var85 = field1204.method226();

				if (field1275 != -1) {
					field1275 = -1;
					field1155 = true;
				}

				if (field1458) {
					field1458 = false;
					field1155 = true;
				}

				field1291 = var84;
				field1370 = var85;
				field1082 = true;
				field1268 = true;
				field1089 = false;
				field1065 = -1;
				return true;
			}

			if (field1065 == 41) {
				int var86 = field1204.method226();
				String var87 = field1204.method231();
				class4.field56[var86].field97 = var87;

				if (field1163[field1292] == class4.field56[var86].field62) {
					field1082 = true;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 75) {
				field1324 = field1204.method224();
				field1065 = -1;
				return true;
			}

			if (field1065 == 98 || field1065 == 218 || field1065 == 8 || field1065 == 114 || field1065 == 37 || field1065 == 115 || field1065 == 120 || field1065 == 30 || field1065 == 88 || field1065 == 70) {
				method446(field1204, field1065);
				field1065 = -1;
				return true;
			}

			if (field1065 == 138) {
				field1292 = field1204.method224();
				field1082 = true;
				field1268 = true;
				field1065 = -1;
				return true;
			}

			if (field1065 == 136) {
				field1082 = true;
				int var88 = field1204.method224();
				int var89 = field1204.method229();
				int var90 = field1204.method224();
				field1083[var88] = var89;
				field1130[var88] = var90;
				field1112[var88] = 1;
				for (int var91 = 0; var91 < 98; var91++) {
					if (var89 >= field1186[var91]) {
						field1112[var88] = var91 + 2;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 38) {
				int var92 = field1204.method226();
				int var93 = field1204.method226();
				int var94 = var93 >> 10 & 0x1F;
				int var95 = var93 >> 5 & 0x1F;
				int var96 = var93 & 0x1F;
				class4.field56[var92].field99 = (var96 << 3) + (var94 << 19) + (var95 << 11);
				field1065 = -1;
				return true;
			}

			if (field1065 == 25) {
				int var97 = field1204.method226();
				int var98 = field1204.method224();
				int var99 = field1204.method226();
				if (field1141 && !field1274 && field1145 < 50) {
					field1459[field1145] = var97;
					field1109[field1145] = var98;
					field1131[field1145] = class55.field783[var97] + var99;
					field1145++;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 55) {
				field1071 = true;
				field1113 = field1204.method224();
				field1114 = field1204.method224();
				field1115 = field1204.method226();
				field1116 = field1204.method224();
				field1117 = field1204.method224();
				if (field1117 >= 100) {
					field1299 = field1113 * 128 + 64;
					field1301 = field1114 * 128 + 64;
					field1300 = method525(field1432, field1299, field1301) - field1115;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 167) {
				field1071 = false;

				for (int var100 = 0; var100 < 5; var100++) {
					field1389[var100] = false;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 227) {
				int var101 = field1204.method226();
				boolean var102 = field1204.method224() == 1;
				class4.field56[var101].field77 = var102;
				field1065 = -1;
				return true;
			}

			if (field1065 == 164) {
				if (field1292 == 12) {
					field1082 = true;
				}

				field1139 = field1204.method227();
				field1065 = -1;
				return true;
			}

			if (field1065 == 140) {
				for (int var103 = 0; var103 < field1152.length; var103++) {
					if (field1314[var103] != field1152[var103]) {
						field1152[var103] = field1314[var103];
						method535(var103);
						field1082 = true;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 94) {
				if (field1292 == 12) {
					field1082 = true;
				}

				field1166 = field1204.method224();
				field1065 = -1;
				return true;
			}

			if (field1065 == 143) {
				field1213 = field1204.method226() * 30;
				field1065 = -1;
				return true;
			}

			if (field1065 == 168) {
				int var104 = field1204.method226();
				class4 var105 = class4.field56[var104];
				for (int var106 = 0; var106 < var105.field57.length; var106++) {
					var105.field57[var106] = -1;
					var105.field57[var106] = 0;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 61) {
				field1137 = field1204.method224();
				field1138 = field1204.method224();

				while (field1204.field616 < field1064) {
					int var107 = field1204.method224();
					method446(field1204, var107);
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 58) {
				field1143 = field1204.method224();
				if (field1292 == field1143) {
					if (field1143 == 3) {
						field1292 = 1;
					} else {
						field1292 = 3;
					}

					field1082 = true;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 204) {
				int var108 = field1204.method224();
				int var109 = field1204.method224();
				String var110 = field1204.method231();
				if (var108 >= 1 && var108 <= 5) {
					if (var110.equalsIgnoreCase("null")) {
						var110 = null;
					}

					field1170[var108 - 1] = var110;
					field1171[var108 - 1] = var109 == 0;
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 24) {
				field1187 = field1204.method224();
				field1105 = field1204.method224();
				field1327 = field1204.method224();
				field1321 = true;
				field1155 = true;
				field1065 = -1;
				return true;
			}

			if (field1065 == 73) {
				String var111 = field1204.method231();
				if (var111.endsWith(":tradereq:")) {
					String var112 = var111.substring(0, var111.indexOf(":"));
					long var113 = class51.method295(var112);
					boolean var115 = false;
					for (int var116 = 0; var116 < field1413; var116++) {
						if (field1172[var116] == var113) {
							var115 = true;
							break;
						}
					}

					if (!var115 && field1165 == 0) {
						method526(4, "wishes to trade with you.", var112);
					}
				} else if (var111.endsWith(":duelreq:")) {
					String var117 = var111.substring(0, var111.indexOf(":"));
					long var118 = class51.method295(var117);
					boolean var120 = false;
					for (int var121 = 0; var121 < field1413; var121++) {
						if (field1172[var121] == var118) {
							var120 = true;
							break;
						}
					}

					if (!var120 && field1165 == 0) {
						method526(8, "wishes to duel with you.", var117);
					}
				} else {
					method526(0, var111, "");
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 225) {
				int var122 = field1204.method224();
				int var123 = field1204.method224();
				int var124 = field1204.method224();
				int var125 = field1204.method224();
				field1389[var122] = true;
				field1208[var122] = var123;
				field1451[var122] = var124;
				field1214[var122] = var125;
				field1244[var122] = 0;
				field1065 = -1;
				return true;
			}

			if (field1065 == 170) {
				field1082 = true;
				int var126 = field1204.method226();
				class4 var127 = class4.field56[var126];
				while (field1204.field616 < field1064) {
					int var128 = field1204.method224();
					int var129 = field1204.method226();
					int var130 = field1204.method224();
					if (var130 == 255) {
						var130 = field1204.method229();
					}

					if (var128 >= 0 && var128 < var127.field57.length) {
						var127.field57[var128] = var129;
						var127.field58[var128] = var130;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 108) {
				field1353 = 0;
				field1065 = -1;
				return true;
			}

			if (field1065 == 60) {
				long var131 = field1204.method230();
				int var133 = field1204.method229();
				int var134 = field1204.method224();
				boolean var135 = false;
				for (int var136 = 0; var136 < 100; var136++) {
					if (field1228[var136] == var133) {
						var135 = true;
						break;
					}
				}

				if (var134 <= 1) {
					for (int var137 = 0; var137 < field1413; var137++) {
						if (field1172[var137] == var131) {
							var135 = true;
							break;
						}
					}
				}

				if (!var135 && field1165 == 0) {
					try {
						field1228[field1253] = var133;
						field1253 = (field1253 + 1) % 100;
						String var138 = class52.method302(field1064 - 13, field1204);
						var138 = class71.method394(var138);
						if (var134 == 2 || var134 == 3) {
							method526(7, var138, "@cr2@" + class51.method299(class51.method296(var131)));
						} else if (var134 == 1) {
							method526(7, var138, "@cr1@" + class51.method299(class51.method296(var131)));
						} else {
							method526(3, var138, class51.method299(class51.method296(var131)));
						}
					} catch (Exception var156) {
						signlink.reporterror("cde1");
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 186) {
				int var140 = field1204.method226();
				byte var141 = field1204.method225();
				field1314[var140] = var141;

				if (field1152[var140] != var141) {
					field1152[var140] = var141;
					method535(var140);
					field1082 = true;

					if (field1436 != -1) {
						field1155 = true;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 211) {
				int var142 = field1204.method226();
				int var143 = field1204.method226();
				class4.field56[var142].field105 = 1;
				class4.field56[var142].field106 = var143;
				field1065 = -1;
				return true;
			}

			if (field1065 == 159) {
				field1137 = field1204.method224();
				field1138 = field1204.method224();
				for (int var144 = field1137; var144 < field1137 + 8; var144++) {
					for (int var145 = field1138; var145 < field1138 + 8; var145++) {
						if (field1158[field1432][var144][var145] != null) {
							field1158[field1432][var144][var145] = null;
							method491(var144, var145);
						}
					}
				}

				for (class40 var146 = (class40) field1094.method243(); var146 != null; var146 = (class40) field1094.method245()) {
					if (var146.field635 >= field1137 && var146.field635 < field1137 + 8 && var146.field636 >= field1138 && var146.field636 < field1138 + 8 && field1432 == var146.field633) {
						var146.field644 = 0;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 123) {
				method448(field1204, field1064);
				field1065 = -1;
				return true;
			}

			if (field1065 == 203) {
				for (int var147 = 0; var147 < field1439.length; var147++) {
					if (field1439[var147] != null) {
						field1439[var147].field388 = -1;
					}
				}

				for (int var148 = 0; var148 < field1349.length; var148++) {
					if (field1349[var148] != null) {
						field1349[var148].field388 = -1;
					}
				}

				field1065 = -1;
				return true;
			}

			if (field1065 == 27) {
				int var149 = field1204.method226();
				int var150 = field1204.method227();
				int var151 = field1204.method227();
				class4 var152 = class4.field56[var149];
				var152.field69 = var150;
				var152.field70 = var151;
				field1065 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1065 + "," + field1064 + " - " + field1222 + "," + field1223);
			method430();
		} catch (IOException var157) {
			method492();
		} catch (Exception var158) {
			String var154 = "T2 - " + field1065 + "," + field1222 + "," + field1223 + " - " + field1064 + "," + (field1133.field410[0] + field1209) + "," + (field1133.field411[0] + field1210) + " - ";
			for (int var155 = 0; var155 < field1064 && var155 < 50; var155++) {
				var154 = var154 + field1204.field615[var155] + ",";
			}

			signlink.reporterror(var154);
			method430();
		}

		return true;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method522() {
		for (class40 var1 = (class40) field1094.method243(); var1 != null; var1 = (class40) field1094.method245()) {
			if (var1.field644 == -1) {
				var1.field643 = 0;
				method500(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.a(B[BZ)V")
	public final void method523(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1094.method243(); var11 != null; var11 = (class40) field1094.method245()) {
			if (var11.field633 == arg8 && var11.field635 == arg3 && var11.field636 == arg6 && var11.field634 == arg7) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field633 = arg8;
			var10.field634 = arg7;
			var10.field635 = arg3;
			var10.field636 = arg6;
			method500(var10);
			field1094.method240(var10);
		}

		var10.field640 = arg5;
		var10.field642 = arg1;
		var10.field641 = arg4;
		var10.field643 = arg2;
		var10.field644 = arg0;
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method525(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field1360[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field1264[var6][var4][var5] + field1264[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1264[var6][var4][var5 + 1] + field1264[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method526(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1436 != -1) {
			field1409 = arg1;
			field23 = 0;
		}

		if (field1275 == -1) {
			field1155 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1097[var4] = field1097[var4 - 1];
			field1098[var4] = field1098[var4 - 1];
			field1099[var4] = field1099[var4 - 1];
		}

		field1097[0] = arg0;
		field1098[0] = arg2;
		field1099[0] = arg1;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method527() {
		int var1 = field1113 * 128 + 64;
		int var2 = field1114 * 128 + 64;
		int var3 = method525(field1432, var1, var2) - field1115;

		if (field1299 < var1) {
			field1299 += (var1 - field1299) * field1117 / 1000 + field1116;
			if (field1299 > var1) {
				field1299 = var1;
			}
		}

		if (field1299 > var1) {
			field1299 -= (field1299 - var1) * field1117 / 1000 + field1116;
			if (field1299 < var1) {
				field1299 = var1;
			}
		}

		if (field1300 < var3) {
			field1300 += (var3 - field1300) * field1117 / 1000 + field1116;
			if (field1300 > var3) {
				field1300 = var3;
			}
		}

		if (field1300 > var3) {
			field1300 -= (field1300 - var3) * field1117 / 1000 + field1116;
			if (field1300 < var3) {
				field1300 = var3;
			}
		}

		if (field1301 < var2) {
			field1301 += (var2 - field1301) * field1117 / 1000 + field1116;
			if (field1301 > var2) {
				field1301 = var2;
			}
		}

		if (field1301 > var2) {
			field1301 -= (field1301 - var2) * field1117 / 1000 + field1116;
			if (field1301 < var2) {
				field1301 = var2;
			}
		}

		int var4 = field1259 * 128 + 64;
		int var5 = field1260 * 128 + 64;
		int var6 = method525(field1432, var4, var5) - field1261;
		int var7 = var4 - field1299;
		int var8 = var6 - field1300;
		int var9 = var5 - field1301;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1302 < var11) {
			field1302 += (var11 - field1302) * field1263 / 1000 + field1262;
			if (field1302 > var11) {
				field1302 = var11;
			}
		}

		if (field1302 > var11) {
			field1302 -= (field1302 - var11) * field1263 / 1000 + field1262;
			if (field1302 < var11) {
				field1302 = var11;
			}
		}

		int var13 = var12 - field1303;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1303 += field1263 * var13 / 1000 + field1262;
			field1303 &= 0x7FF;
		}

		if (var13 < 0) {
			field1303 -= -var13 * field1263 / 1000 + field1262;
			field1303 &= 0x7FF;
		}

		int var14 = var12 - field1303;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1303 = var12;
		}
	}

	@ObfuscatedName("client.a(Lib;IBI)V")
	public final void method528(class35 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1424 + field1076 & 0x7FF;
			int var6 = class31.field545[var5];
			int var7 = class31.field546[var5];
			var6 = var6 * 256 / (field1246 + 256);
			var7 = var7 * 256 / (field1246 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1048.method190(var12 + 94 + 4 - 10, 83 - var13 - 20, 15, 20, 256, 15, 20, var10);
		} else {
			method516(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method529() {
		method515();

		if (field1311 == 1) {
			field1335[field1310 / 100].method185(field1309 - 8 - 4, field1308 - 8 - 4);
		}

		if (field1311 == 2) {
			field1335[field1310 / 100 + 4].method185(field1309 - 8 - 4, field1308 - 8 - 4);
			field1393++;
			if (field1393 > 57) {
				field1393 = 0;
				field1144.method213(100);
			}
		}

		if (field1298 != -1) {
			method513(field1298, field1053);
			method422(0, 0, 0, class4.field56[field1298]);
		}

		if (field1291 != -1) {
			method513(field1291, field1053);
			method422(0, 0, 0, class4.field56[field1291]);
		}

		method439();

		if (!field1250) {
			method514();
			method471();
		} else if (field1188 == 0) {
			method547();
		}

		if (field1324 == 1) {
			field1341[1].method185(296, 472);
		}

		if (field1213 != 0) {
			int var1 = field1213 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1217.method203(4, 0xFFFF00, "System update in: " + var2 + ":0" + var1, 329);
			} else {
				field1217.method203(4, 0xFFFF00, "System update in: " + var2 + ":" + var1, 329);
			}
		}
	}

	@ObfuscatedName("client.H(I)Ljava/net/Socket;")
	public final Socket method530(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.I(I)V")
	public final void method531() {
		try {
			field1044 = -1;
			field1289.method247();
			field1135.method247();
			class34.method166();
			method423();
			field1136.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1107[var1].method352();
			}

			System.gc();
			class3 var2 = new class3(104, field1360, field1264, 104);
			int var3 = field1338.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1102[var4] >> 8;
				int var6 = field1102[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1136.method51(field1432);
			} else {
				field1136.method51(0);
			}

			field1144.method213(239);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1102[var7] >> 8) * 64 - field1209;
				int var9 = (field1102[var7] & 0xFF) * 64 - field1210;
				byte[] var10 = field1338[var7];
				if (var10 != null) {
					var2.method15(var8, (field1045 - 6) * 8, (field1046 - 6) * 8, var10, var9);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1102[var11] >> 8) * 64 - field1209;
				int var13 = (field1102[var11] & 0xFF) * 64 - field1210;
				byte[] var14 = field1338[var11];
				if (var14 == null && field1046 < 800) {
					var2.method14(64, 64, var12, var13);
				}
			}

			field1144.method213(239);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1457[var15];
				if (var16 != null) {
					int var17 = (field1102[var15] >> 8) * 64 - field1209;
					int var18 = (field1102[var15] & 0xFF) * 64 - field1210;
					var2.method18(var17, field1136, field1107, var16, var18);
				}
			}

			field1144.method213(239);
			var2.method20(field1136, field1107);
			field1184.method253();
			field1144.method213(239);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method491(var19, var20);
				}
			}

			method522();
		} catch (Exception var33) {
		}

		class57.field854.method103();

		if (field1274 && signlink.cache_dat != null) {
			int var22 = field1384.method267(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1384.method272(var23);
				if ((var24 & 0x79) == 0) {
					class31.method124(var23);
				}
			}
		}

		System.gc();
		class34.method167(20);
		field1384.method278();
		int var25 = (field1045 - 6) / 8 - 1;
		int var26 = (field1045 + 6) / 8 + 1;
		int var27 = (field1046 - 6) / 8 - 1;
		int var28 = (field1046 + 6) / 8 + 1;
		if (field1408) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1384.method269(var30, 0, var29);
					if (var31 != -1) {
						field1384.method279(3, var31);
					}

					int var32 = field1384.method269(var30, 1, var29);
					if (var32 != -1) {
						field1384.method279(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZILlb;)V")
	public final void method532(int arg0, class38 arg1) {
		field1265 = 0;
		field1442 = 0;
		method544(arg1, arg0);
		method485(arg0, arg1);
		method436(arg1, arg0);
		method533(arg0, arg1);

		for (int var3 = 0; var3 < field1265; var3++) {
			int var4 = field1266[var3];
			if (field1410 != field1439[var4].field405) {
				field1439[var4] = null;
			}
		}

		if (arg1.field616 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field616 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1440; var5++) {
			if (field1439[field1441[var5]] == null) {
				signlink.reporterror(field1118 + " null entry in pl list - pos:" + var5 + " size:" + field1440);
				throw new RuntimeException("eek");
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 270);

			if (arg0.length == 5) {
				field1271 = Integer.parseInt(arg0[0]);
				field1272 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method432();
				} else if (arg0[2].equals("highmem")) {
					method459();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1273 = false;
				} else if (arg0[3].equals("members")) {
					field1273 = true;
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

	@ObfuscatedName("client.a(IZLlb;)V")
	public final void method533(int arg0, class38 arg1) {
		for (int var3 = 0; var3 < field1442; var3++) {
			int var4 = field1443[var3];
			class27 var5 = field1439[var4];
			int var6 = arg1.method224();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method224() << 8;
			}

			method536(var4, var5, arg1, var6);
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method534() {
		int var1 = 5;
		field1359[8] = 0;
		int var2 = 0;
		while (field1359[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method427("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 270);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field615, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1359[var6] = var5.method229();
				}

				int var7 = var5.method229();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1359[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1359[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1359[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1359[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1359[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1359[8] == 0) {
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

				field1100 = !field1100;
			}
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void method535(int arg0) {
		int var2 = class70.field1021[arg0].field1029;
		if (var2 != 0) {
			int var3 = field1152[arg0];
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

				class60.field940.method103();
				field1344 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1108;

				if (var3 == 0) {
					method467(field1108, 0);
					field1108 = true;
				}

				if (var3 == 1) {
					method467(field1108, -400);
					field1108 = true;
				}

				if (var3 == 2) {
					method467(field1108, -800);
					field1108 = true;
				}

				if (var3 == 3) {
					method467(field1108, -1200);
					field1108 = true;
				}

				if (var3 == 4) {
					field1108 = false;
				}

				if (field1108 != var4 && !field1274) {
					if (field1108) {
						field1361 = field1294;
						field1362 = false;
						field1384.method274(2, field1361);
					} else {
						method543();
					}

					field1305 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1141 = true;
					method443(0);
				}

				if (var3 == 1) {
					field1141 = true;
					method443(-400);
				}

				if (var3 == 2) {
					field1141 = true;
					method443(-800);
				}

				if (var3 == 3) {
					field1141 = true;
					method443(-1200);
				}

				if (var3 == 4) {
					field1141 = false;
				}
			}

			if (var2 == 5) {
				field1270 = var3;
			}

			if (var2 == 6) {
				field1132 = var3;
			}

			if (var2 == 8) {
				field1074 = var3;
				field1155 = true;
			}

			if (var2 == 9) {
				field1043 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IILab;Llb;I)V")
	public final void method536(int arg0, class27 arg1, class38 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg2.method224();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg2.method233(var5, 0, var6);
			field1444[arg0] = var7;
			arg1.method116(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg2.method226();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg1.field388 == var8) {
				arg1.field392 = 0;
			}

			int var9 = arg2.method224();
			if (arg1.field388 == var8 && var8 != -1) {
				int var10 = class66.field982[var8].field996;
				if (var10 == 1) {
					arg1.field389 = 0;
					arg1.field390 = 0;
					arg1.field391 = var9;
					arg1.field392 = 0;
				}

				if (var10 == 2) {
					arg1.field392 = 0;
				}
			} else if (var8 == -1 || arg1.field388 == -1 || class66.field982[var8].field990 >= class66.field982[arg1.field388].field990) {
				arg1.field388 = var8;
				arg1.field389 = 0;
				arg1.field390 = 0;
				arg1.field391 = var9;
				arg1.field392 = 0;
				arg1.field414 = arg1.field409;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg1.field382 = arg2.method226();
			if (arg1.field382 == 0xFFFF) {
				arg1.field382 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg1.field372 = arg2.method231();
			arg1.field374 = 0;
			arg1.field375 = 0;
			arg1.field373 = 150;
			method526(2, arg1.field372, arg1.field416);
		}

		if ((arg3 & 0x10) == 0x10) {
			int var11 = arg2.method224();
			int var12 = arg2.method224();
			arg1.method114(field1410, var12, var11);
			arg1.field379 = field1410 + 300;
			arg1.field380 = arg2.method224();
			arg1.field381 = arg2.method224();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg1.field383 = arg2.method226();
			arg1.field384 = arg2.method226();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var13 = arg2.method226();
			int var14 = arg2.method224();
			int var15 = arg2.method224();
			int var16 = arg2.field616;

			if (arg1.field416 != null && arg1.field417) {
				long var17 = class51.method295(arg1.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1413; var20++) {
						if (field1172[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1165 == 0) {
					try {
						String var21 = class52.method302(var15, arg2);
						var21 = class71.method394(var21);
						arg1.field372 = var21;
						arg1.field374 = var13 >> 8;
						arg1.field375 = var13 & 0xFF;
						arg1.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method526(1, var21, "@cr2@" + arg1.field416);
						} else if (var14 == 1) {
							method526(1, var21, "@cr1@" + arg1.field416);
						} else {
							method526(2, var21, arg1.field416);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field616 = var15 + var16;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg1.field393 = arg2.method226();
			int var23 = arg2.method229();
			arg1.field397 = var23 >> 16;
			arg1.field396 = (var23 & 0xFFFF) + field1410;
			arg1.field394 = 0;
			arg1.field395 = 0;

			if (arg1.field396 > field1410) {
				arg1.field394 = -1;
			}

			if (arg1.field393 == 0xFFFF) {
				arg1.field393 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg1.field398 = arg2.method224();
			arg1.field400 = arg2.method224();
			arg1.field399 = arg2.method224();
			arg1.field401 = arg2.method224();
			arg1.field402 = arg2.method226() + field1410;
			arg1.field403 = arg2.method226() + field1410;
			arg1.field404 = arg2.method224();
			arg1.method112();
		}

		if ((arg3 & 0x400) == 0x400) {
			int var24 = arg2.method224();
			int var25 = arg2.method224();
			arg1.method114(field1410, var25, var24);
			arg1.field379 = field1410 + 300;
			arg1.field380 = arg2.method224();
			arg1.field381 = arg2.method224();
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method537() {
		field1267++;
		method433(true);
		method501(true);
		method433(false);
		method501(false);
		method483();
		method551();

		if (!field1071) {
			int var1 = field1075;
			if (field1429 / 256 > var1) {
				var1 = field1429 / 256;
			}

			if (field1389[4] && field1451[4] + 128 > var1) {
				var1 = field1451[4] + 128;
			}

			int var2 = field1391 + field1076 & 0x7FF;
			method426(field1090, var1 * 3 + 600, field1091, var1, method525(field1432, field1133.field360, field1133.field361) - 50, var2);
		}

		int var3;
		if (field1071) {
			var3 = method519();
		} else {
			var3 = method518();
		}

		int var4 = field1299;
		int var5 = field1300;
		int var6 = field1301;
		int var7 = field1302;
		int var8 = field1303;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1389[var9]) {
				int var10 = (int) (Math.random() * (field1208[var9] * 2 + 1) + Math.sin(field1214[var9] / 100.0D * field1244[var9]) * field1451[var9] - field1208[var9]);
				if (var9 == 0) {
					field1299 += var10;
				}

				if (var9 == 1) {
					field1300 += var10;
				}

				if (var9 == 2) {
					field1301 += var10;
				}

				if (var9 == 3) {
					field1303 = field1303 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1302 += var10;
					if (field1302 < 128) {
						field1302 = 128;
					}

					if (field1302 > 383) {
						field1302 = 383;
					}
				}
			}
		}

		int var11 = class34.field588;
		class31.field540 = true;
		class31.field543 = 0;
		class31.field541 = field17 - 4;
		class31.field542 = field18 - 4;
		class33.method154();
		field1136.method89(var3, field1299, field1302, field1303, field1300, field1301);
		field1136.method64();
		method462();
		method456();
		method453(var11);
		method529();
		field1184.method254(4, 4, field9);
		field1299 = var4;
		field1300 = var5;
		field1301 = var6;
		field1302 = var7;
		field1303 = var8;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method538() {
		int var1 = field1218.method202("Choose Option");
		for (int var2 = 0; var2 < field1096; var2++) {
			int var3 = field1218.method202(field1307[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1096 * 15 + 21;
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

			field1250 = true;
			field1188 = 0;
			field1189 = var5;
			field1190 = var6;
			field1191 = var1;
			field1192 = field1096 * 15 + 22;
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

			field1250 = true;
			field1188 = 1;
			field1189 = var7;
			field1190 = var8;
			field1191 = var1;
			field1192 = field1096 * 15 + 22;
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

			field1250 = true;
			field1188 = 2;
			field1189 = var9;
			field1190 = var10;
			field1191 = var1;
			field1192 = field1096 * 15 + 22;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method539() {
		for (int var1 = -1; var1 < field1440; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1438;
			} else {
				var2 = field1441[var1];
			}

			class27 var3 = field1439[var2];
			if (var3 != null) {
				method503(1, var3);
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method540() {
		short var1 = 256;

		if (field1387 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1387 > 768) {
					field1159[var2] = method550(field1160[var2], field1161[var2], 1024 - field1387);
				} else if (field1387 > 256) {
					field1159[var2] = field1161[var2];
				} else {
					field1159[var2] = method550(field1161[var2], field1160[var2], 256 - field1387);
				}
			}
		} else if (field1388 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1388 > 768) {
					field1159[var3] = method550(field1160[var3], field1162[var3], 1024 - field1388);
				} else if (field1388 > 256) {
					field1159[var3] = field1162[var3];
				} else {
					field1159[var3] = method550(field1162[var3], field1160[var3], 256 - field1388);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1159[var4] = field1160[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1378.field649[var5] = field1332.field591[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1079[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1196[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1159[var12];
					int var15 = field1378.field649[var7];
					field1378.field649[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1378.method254(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1379.field649[var16] = field1333.field591[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1079[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1196[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1159[var23];
					int var26 = field1379.field649[var18];
					field1379.field649[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1379.method254(637, 0, field9);
	}

	@ObfuscatedName("client.m(B)V")
	public final void method541() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1394) {
			field1334 = false;
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

		if (field1167) {
			field1334 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1194) {
			field1334 = false;
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

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1241) {
			field1194 = true;
		} else {
			field1241 = true;
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
						field1195[var3] = new class48(500000, signlink.cache_idx[var3], signlink.cache_dat, var3 + 1);
					}
				}

				try {
					method534();
					field1431 = method499("title screen", field1359[1], 1, 25, "title");
					field1216 = new class37(field1431, "p11_full", false);
					field1217 = new class37(field1431, "p12_full", false);
					field1218 = new class37(field1431, "b12_full", false);
					field1219 = new class37(field1431, "q8_full", true);
					method489();
					method466();
					class50 var4 = method499("config", field1359[2], 2, 30, "config");
					class50 var5 = method499("interface", field1359[3], 3, 35, "interface");
					class50 var6 = method499("2d graphics", field1359[4], 4, 40, "media");
					class50 var7 = method499("textures", field1359[6], 6, 45, "textures");
					class50 var8 = method499("chat system", field1359[7], 7, 50, "wordenc");
					class50 var9 = method499("sound effects", field1359[8], 8, 55, "sounds");
					field1360 = new byte[4][104][104];
					field1264 = new int[4][105][105];
					field1136 = new class18(4, field1264, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field1107[var10] = new class62(104, 104);
					}

					field1355 = new class35(512, 512);
					class50 var11 = method499("update list", field1359[5], 5, 60, "versionlist");
					method13(60, "Connecting to update server");
					field1384 = new class47();
					field1384.method265(var11, this);
					class7.method44(field1384.method268());
					class31.method122(field1384.method267(0), field1384);

					if (!field1274) {
						field1361 = 0;
						try {
							field1361 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1362 = false;
						field1384.method274(2, field1361);

						while (field1384.method275() > 0) {
							method457();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field1384.method267(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1384.method274(1, var13);
					}

					while (field1384.method275() > 0) {
						int var14 = var12 - field1384.method275();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method457();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}
					}

					method13(70, "Requesting models");
					int var15 = field1384.method267(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1384.method272(var16);
						if ((var17 & 0x1) != 0) {
							field1384.method274(0, var16);
						}
					}

					int var18 = field1384.method275();
					while (field1384.method275() > 0) {
						int var19 = var18 - field1384.method275();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method457();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1195[0] != null) {
						method13(75, "Requesting maps");
						field1384.method274(3, field1384.method269(48, 0, 47));
						field1384.method274(3, field1384.method269(48, 1, 47));
						field1384.method274(3, field1384.method269(48, 0, 48));
						field1384.method274(3, field1384.method269(48, 1, 48));
						field1384.method274(3, field1384.method269(48, 0, 49));
						field1384.method274(3, field1384.method269(48, 1, 49));
						field1384.method274(3, field1384.method269(47, 0, 47));
						field1384.method274(3, field1384.method269(47, 1, 47));
						field1384.method274(3, field1384.method269(47, 0, 48));
						field1384.method274(3, field1384.method269(47, 1, 48));
						field1384.method274(3, field1384.method269(148, 0, 48));
						field1384.method274(3, field1384.method269(148, 1, 48));
						int var20 = field1384.method275();
						while (field1384.method275() > 0) {
							int var21 = var20 - field1384.method275();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method457();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1384.method267(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1384.method272(var23);
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
							field1384.method277(0, var23, var25);
						}
					}

					field1384.method270(field1273);

					if (!field1274) {
						int var26 = field1384.method267(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1384.method273(var27)) {
								field1384.method277(2, var27, (byte) 1);
							}
						}
					}

					method13(80, "Unpacking media");
					field1049 = new class36(var6, "invback", 0);
					field1051 = new class36(var6, "chatback", 0);
					field1050 = new class36(var6, "mapback", 0);
					field1371 = new class36(var6, "backbase1", 0);
					field1372 = new class36(var6, "backbase2", 0);
					field1373 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1416[var28] = new class36(var6, "sideicons", var28);
					}

					field1168 = new class35(var6, "compass", 0);
					field1048 = new class35(var6, "mapedge", 0);
					field1048.method182();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1386[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1215[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1337[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1341[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1248 = new class35(var6, "mapmarker", 0);
					field1249 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1335[var33] = new class35(var6, "cross", var33);
					}

					field1345 = new class35(var6, "mapdots", 0);
					field1346 = new class35(var6, "mapdots", 1);
					field1347 = new class35(var6, "mapdots", 2);
					field1348 = new class35(var6, "mapdots", 3);
					field1420 = new class36(var6, "scrollbar", 0);
					field1421 = new class36(var6, "scrollbar", 1);
					field1124 = new class36(var6, "redstone1", 0);
					field1125 = new class36(var6, "redstone2", 0);
					field1126 = new class36(var6, "redstone3", 0);
					field1127 = new class36(var6, "redstone1", 0);
					field1127.method195();
					field1128 = new class36(var6, "redstone2", 0);
					field1128.method195();
					field1397 = new class36(var6, "redstone1", 0);
					field1397.method196();
					field1398 = new class36(var6, "redstone2", 0);
					field1398.method196();
					field1399 = new class36(var6, "redstone3", 0);
					field1399.method196();
					field1400 = new class36(var6, "redstone1", 0);
					field1400.method195();
					field1400.method196();
					field1401 = new class36(var6, "redstone2", 0);
					field1401.method195();
					field1401.method196();

					for (int var34 = 0; var34 < 2; var34++) {
						field1427[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1232 = new class43(var35.field592, method11(), var35.field593);
					var35.method183(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1233 = new class43(var36.field592, method11(), var36.field593);
					var36.method183(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1234 = new class43(var37.field592, method11(), var37.field593);
					var37.method183(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1235 = new class43(var38.field592, method11(), var38.field593);
					var38.method183(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1236 = new class43(var39.field592, method11(), var39.field593);
					var39.method183(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1237 = new class43(var40.field592, method11(), var40.field593);
					var40.method183(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1238 = new class43(var41.field592, method11(), var41.field593);
					var41.method183(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1239 = new class43(var42.field592, method11(), var42.field593);
					var42.method183(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1240 = new class43(var43.field592, method11(), var43.field593);
					var43.method183(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1215[var48] != null) {
							field1215[var48].method181(var44 + var47, var45 + var47, var46 + var47);
						}

						if (field1386[var48] != null) {
							field1386[var48].method197(var44 + var47, var45 + var47, var46 + var47);
						}
					}

					method13(83, "Unpacking textures");
					class34.method168(var7);
					class34.method172(0.8D);
					class34.method167(20);
					method13(86, "Unpacking config");
					class66.method374(var4);
					class57.method323(var4);
					class63.method364(var4);
					class60.method339(var4);
					class59.method333(var4);
					class64.method368(var4);
					class68.method377(var4);
					class70.method382(var4);
					class69.method380(var4);
					class60.field899 = field1273;

					if (!field1274) {
						method13(90, "Unpacking sounds");
						byte[] var49 = var9.method294("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method313(var50);
					}

					method13(95, "Unpacking interfaces");
					class37[] var51 = new class37[] { field1216, field1217, field1218, field1219 };
					class4.method32(var6, var5, var51);
					method13(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1050.field598[field1050.field600 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1101[var52] = var53;
						field1257[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1050.field598[field1050.field600 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1156[var56 - 5] = var57 - 25;
						field1129[var56 - 5] = var58 - var57;
					}

					class34.method165(479, 96);
					field1433 = class34.field579;
					class34.method165(190, 261);
					field1434 = class34.field579;
					class34.method165(512, 334);
					field1435 = class34.field579;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field577[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(var60, 500, 800, 512, 334);
					class71.method384(var8);
					field1243 = new class58(this);
					method12(field1243, 10);
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1412 + " " + field1254);
					field1394 = true;
				}
			} else {
				field1167 = true;
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method542() {
		field1334 = false;
		while (field1315) {
			field1334 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1178 = null;
		field1179 = null;
		field1454 = null;
		field1159 = null;
		field1160 = null;
		field1161 = null;
		field1162 = null;
		field1062 = null;
		field1063 = null;
		field1196 = null;
		field1197 = null;
		field1332 = null;
		field1333 = null;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method543() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1272 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.c(ILlb;I)V")
	public final void method544(class38 arg0, int arg1) {
		arg0.method234();
		int var3 = arg0.method235(1);
		if (var3 != 0) {
			int var4 = arg0.method235(2);
			if (var4 == 0) {
				field1443[field1442++] = field1438;
			} else if (var4 == 1) {
				int var5 = arg0.method235(3);
				field1133.method111(var5, false);
				int var6 = arg0.method235(1);
				if (var6 == 1) {
					field1443[field1442++] = field1438;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method235(3);
				field1133.method111(var7, true);
				int var8 = arg0.method235(3);
				field1133.method111(var8, true);
				int var9 = arg0.method235(1);
				if (var9 == 1) {
					field1443[field1442++] = field1438;
				}
			} else if (var4 == 3) {
				field1432 = arg0.method235(2);
				int var10 = arg0.method235(7);
				int var11 = arg0.method235(7);
				int var12 = arg0.method235(1);
				field1133.method110(var10, var12 == 1, var11);
				int var13 = arg0.method235(1);
				if (var13 == 1) {
					field1443[field1442++] = field1438;
				}
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method545() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1187 = (field1187 + 1) % 4;
				field1321 = true;
				field1155 = true;
				field1144.method213(129);
				field1144.method214(field1187);
				field1144.method214(field1105);
				field1144.method214(field1327);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1105 = (field1105 + 1) % 3;
				field1321 = true;
				field1155 = true;
				field1144.method213(129);
				field1144.method214(field1187);
				field1144.method214(field1105);
				field1144.method214(field1327);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1327 = (field1327 + 1) % 3;
				field1321 = true;
				field1155 = true;
				field1144.method213(129);
				field1144.method214(field1187);
				field1144.method214(field1105);
				field1144.method214(field1327);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method450();
				field1140 = "";
				field1095 = false;

				for (int var1 = 0; var1 < class4.field56.length; var1++) {
					if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
						field1395 = field1291 = class4.field56[var1].field62;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.a(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1374 != null) {
				field1374.method38();
			}
		} catch (Exception var1) {
		}

		field1374 = null;
		method543();

		if (field1243 != null) {
			field1243.field857 = false;
		}

		field1243 = null;
		field1384.method266();
		field1384 = null;
		field1144 = null;
		field1340 = null;
		field1204 = null;
		field1102 = null;
		field1338 = null;
		field1457 = null;
		field1103 = null;
		field1104 = null;
		field1264 = null;
		field1360 = null;
		field1136 = null;
		field1107 = null;
		field1180 = null;
		field1069 = null;
		field1149 = null;
		field1150 = null;
		field1296 = null;
		field1182 = null;
		field1183 = null;
		field1184 = null;
		field1185 = null;
		field1356 = null;
		field1357 = null;
		field1358 = null;
		field1232 = null;
		field1233 = null;
		field1234 = null;
		field1235 = null;
		field1236 = null;
		field1237 = null;
		field1238 = null;
		field1239 = null;
		field1240 = null;
		field1049 = null;
		field1050 = null;
		field1051 = null;
		field1371 = null;
		field1372 = null;
		field1373 = null;
		field1416 = null;
		field1124 = null;
		field1125 = null;
		field1126 = null;
		field1127 = null;
		field1128 = null;
		field1397 = null;
		field1398 = null;
		field1399 = null;
		field1400 = null;
		field1401 = null;
		field1168 = null;
		field1337 = null;
		field1341 = null;
		field1335 = null;
		field1345 = null;
		field1346 = null;
		field1347 = null;
		field1348 = null;
		field1386 = null;
		field1215 = null;
		field1418 = null;
		field1439 = null;
		field1441 = null;
		field1443 = null;
		field1444 = null;
		field1266 = null;
		field1349 = null;
		field1351 = null;
		field1158 = null;
		field1094 = null;
		field1135 = null;
		field1289 = null;
		field1364 = null;
		field1365 = null;
		field1366 = null;
		field1367 = null;
		field1307 = null;
		field1152 = null;
		field1404 = null;
		field1405 = null;
		field1173 = null;
		field1355 = null;
		field1111 = null;
		field1052 = null;
		field1146 = null;
		field1378 = null;
		field1379 = null;
		field1375 = null;
		field1376 = null;
		field1377 = null;
		field1380 = null;
		field1381 = null;
		field1382 = null;
		field1383 = null;
		method542();
		class57.method324();
		class59.method334();
		class60.method340();
		class63.field949 = null;
		class64.field962 = null;
		class4.field56 = null;
		class65.field969 = null;
		class66.field982 = null;
		class68.field1001 = null;
		class68.field1013 = null;
		class70.field1021 = null;
		field10 = null;
		class27.field439 = null;
		class34.method163();
		class18.method49();
		class31.method121();
		class7.method46();
		System.gc();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method546(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1322 = "";
				field1323 = "Connecting to server...";
				method465(true);
			}

			field1374 = new class5(this, method530(field1272 + 43594));
			long var4 = class51.method295(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1144.field616 = 0;
			field1144.method214(14);
			field1144.method214(var6);
			field1374.method42(2, field1144.field615, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field1374.method39();
			}

			int var8 = field1374.method39();
			if (var8 == 0) {
				field1374.method41(field1204.field615, 0, 8);
				field1204.field616 = 0;
				field1226 = field1204.method230();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1226 >> 32), (int) field1226 };
				field1144.field616 = 0;
				field1144.method214(10);
				field1144.method218(var9[0]);
				field1144.method218(var9[1]);
				field1144.method218(var9[2]);
				field1144.method218(var9[3]);
				field1144.method218(signlink.uid);
				field1144.method221(arg0);
				field1144.method221(arg1);
				field1144.method239(field1426, field1073);
				field1340.field616 = 0;

				if (arg2) {
					field1340.method214(18);
				} else {
					field1340.method214(16);
				}

				field1340.method214(field1144.field616 + 36 + 1 + 1 + 2);
				field1340.method214(255);
				field1340.method215(270);
				field1340.method214(field1274 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1340.method218(field1359[var10]);
				}

				field1340.method222(field1144.field615, 0, field1144.field616);
				field1144.field620 = new class49(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1288 = new class49(var9);
				field1374.method42(field1340.field616, field1340.field615, 0);
				var8 = field1374.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}

				method546(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1363 = field1374.method39();
				field1072 = field1374.method39() == 1;
				field1385 = 0L;
				field1169 = 0;
				field1243.field859 = 0;
				field14 = true;
				field1414 = true;
				field1320 = true;
				field1144.field616 = 0;
				field1204.field616 = 0;
				field1065 = -1;
				field1221 = -1;
				field1222 = -1;
				field1223 = -1;
				field1064 = 0;
				field1066 = 0;
				field1213 = 0;
				field1068 = 0;
				field1198 = 0;
				field1096 = 0;
				field1250 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1099[var12] = null;
				}

				field1084 = 0;
				field1057 = 0;
				field1295 = 0;
				field1145 = 0;
				field1368 = (int) (Math.random() * 100.0D) - 50;
				field1205 = (int) (Math.random() * 110.0D) - 55;
				field1391 = (int) (Math.random() * 80.0D) - 40;
				field1424 = (int) (Math.random() * 120.0D) - 60;
				field1246 = (int) (Math.random() * 30.0D) - 20;
				field1076 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1044 = -1;
				field1353 = 0;
				field1354 = 0;
				field1440 = 0;
				field1350 = 0;

				for (int var13 = 0; var13 < field1437; var13++) {
					field1439[var13] = null;
					field1444[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					field1349[var14] = null;
				}

				field1133 = field1439[field1438] = new class27();
				field1135.method247();
				field1289.method247();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1158[var15][var16][var17] = null;
						}
					}
				}

				field1094 = new class41();
				field1230 = 0;
				field1229 = 0;
				field1436 = -1;
				field1275 = -1;
				field1291 = -1;
				field1370 = -1;
				field1298 = -1;
				field1089 = false;
				field1292 = 3;
				field1458 = false;
				field1250 = false;
				field1174 = false;
				field1409 = null;
				field1324 = 0;
				field1143 = -1;
				field1110 = true;
				method451();

				for (int var18 = 0; var18 < 5; var18++) {
					field1415[var18] = 0;
				}

				for (int var19 = 0; var19 < 5; var19++) {
					field1170[var19] = null;
					field1171[var19] = false;
				}

				field1153 = 0;
				field1181 = 0;
				field1287 = 0;
				field1193 = 0;
				field1312 = 0;
				field1256 = 0;
				field1331 = 0;
				field1154 = 0;
				field1460 = 0;
				method488();
			} else if (var8 == 3) {
				field1322 = "";
				field1323 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1322 = "Your account has been disabled.";
				field1323 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1322 = "Your account is already logged in.";
				field1323 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1322 = "RuneScape has been updated!";
				field1323 = "Please reload this page.";
			} else if (var8 == 7) {
				field1322 = "This world is full.";
				field1323 = "Please use a different world.";
			} else if (var8 == 8) {
				field1322 = "Unable to connect.";
				field1323 = "Login server offline.";
			} else if (var8 == 9) {
				field1322 = "Login limit exceeded.";
				field1323 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1322 = "Unable to connect.";
				field1323 = "Bad session id.";
			} else if (var8 == 11) {
				field1323 = "Login server rejected session.";
				field1323 = "Please try again.";
			} else if (var8 == 12) {
				field1322 = "You need a members account to login to this world.";
				field1323 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1322 = "Could not complete login.";
				field1323 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1322 = "The server is being updated.";
				field1323 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1320 = true;
				field1144.field616 = 0;
				field1204.field616 = 0;
				field1065 = -1;
				field1221 = -1;
				field1222 = -1;
				field1223 = -1;
				field1064 = 0;
				field1066 = 0;
				field1213 = 0;
				field1096 = 0;
				field1250 = false;
				field1453 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1322 = "Login attempts exceeded.";
				field1323 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1322 = "You are standing in a members-only area.";
				field1323 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1322 = "Invalid loginserver requested";
				field1323 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = field1374.method39(); var20 >= 0; var20--) {
					field1322 = "You have only just left another world";
					field1323 = "Your profile will be transferred in: " + var20 + " seconds";
					method465(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				method546(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1322 = "No response from server";
				field1323 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1322 = "Unexpected server response";
				field1323 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			field1322 = "";
			field1323 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method547() {
		int var1 = field1189;
		int var2 = field1190;
		int var3 = field1191;
		int var4 = field1192;
		int var5 = 0x5D5447;
		class33.method156(var5, var3, var2, var4, var1);
		class33.method156(0, var3 - 2, var2 + 1, 16, var1 + 1);
		class33.method157(var3 - 2, var4 - 19, var1 + 1, var2 + 18, 0);
		field1218.method203(var1 + 3, var5, "Choose Option", var2 + 14);
		int var6 = field17;
		int var7 = field18;
		if (field1188 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1188 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1188 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1096; var8++) {
			int var9 = (field1096 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1218.method205(field1307[var8], var9, var10, var1 + 3, true);
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method548() {
		if (field1177 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1177 = 3;
				field1290 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1322 = "";
				field1323 = "Enter your username & password.";
				field1177 = 2;
				field1290 = 0;
			}
		} else if (field1177 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1290 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1290 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method546(field1118, field1119, false);

				if (field1320) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1177 = 0;
				field1118 = "";
				field1119 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1142.length(); var10++) {
					if (var8 == field1142.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1290 == 0) {
					if (var8 == 8 && field1118.length() > 0) {
						field1118 = field1118.substring(0, field1118.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1290 = 1;
					}

					if (var9) {
						field1118 = field1118 + (char) var8;
					}

					if (field1118.length() > 12) {
						field1118 = field1118.substring(0, 12);
					}
				} else if (field1290 == 1) {
					if (var8 == 8 && field1119.length() > 0) {
						field1119 = field1119.substring(0, field1119.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1290 = 0;
					}

					if (var9) {
						field1119 = field1119 + (char) var8;
					}

					if (field1119.length() > 20) {
						field1119 = field1119.substring(0, 20);
					}
				}
			}
		} else if (field1177 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1177 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Z")
	public final boolean method549(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1366[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method550(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.M(I)V")
	public final void method551() {
		for (class32 var1 = (class32) field1289.method243(); var1 != null; var1 = (class32) field1289.method245()) {
			if (field1432 != var1.field551 || var1.field557) {
				var1.method106();
			} else if (field1410 >= var1.field550) {
				var1.method150(field1053);

				if (var1.field557) {
					var1.method106();
				} else {
					field1136.method61(0, var1.field553, false, var1.field552, var1.field554, var1, var1.field551, 60, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILy;)V")
	public final void method552(int arg0, class25 arg1) {
		method553(arg0, arg1.field361, arg1.field360);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method553(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method525(field1432, arg2, arg1) - arg0;
			arg2 -= field1299;
			var4 -= field1300;
			arg1 -= field1301;
			int var5 = class31.field545[field1302];
			int var6 = class31.field546[field1302];
			int var7 = class31.field545[field1303];
			int var8 = class31.field546[field1303];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field1224 = (var9 << 9) / arg1 + class34.field573;
				field1225 = (var11 << 9) / arg1 + class34.field574;
			} else {
				field1224 = -1;
				field1225 = -1;
			}
		} else {
			field1224 = -1;
			field1225 = -1;
		}
	}

	@ObfuscatedName("client.N(I)Ljava/lang/String;")
	public final String method554() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1186[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field1306[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
