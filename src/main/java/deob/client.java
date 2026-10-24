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
	public int field1065;

	@ObfuscatedName("client.bb")
	public static boolean field1066;

	@ObfuscatedName("client.cb")
	public class35[] field1067 = new class35[50];

	@ObfuscatedName("client.db")
	public String field1068;

	@ObfuscatedName("client.fb")
	public class36 field1069;

	@ObfuscatedName("client.gb")
	public class36 field1070;

	@ObfuscatedName("client.hb")
	public class36 field1071;

	@ObfuscatedName("client.ib")
	public class36 field1072;

	@ObfuscatedName("client.jb")
	public class36 field1073;

	@ObfuscatedName("client.kb")
	public String field1074;

	@ObfuscatedName("client.lb")
	public int field1075 = -1;

	@ObfuscatedName("client.mb")
	public static boolean field1076;

	@ObfuscatedName("client.nb")
	public int field1077;

	@ObfuscatedName("client.ob")
	public int field1078 = 50;

	@ObfuscatedName("client.pb")
	public int[] field1079 = new int[field1078];

	@ObfuscatedName("client.qb")
	public int[] field1080 = new int[field1078];

	@ObfuscatedName("client.rb")
	public int[] field1081 = new int[field1078];

	@ObfuscatedName("client.sb")
	public int[] field1082 = new int[field1078];

	@ObfuscatedName("client.tb")
	public int[] field1083 = new int[field1078];

	@ObfuscatedName("client.ub")
	public int[] field1084 = new int[field1078];

	@ObfuscatedName("client.vb")
	public int[] field1085 = new int[field1078];

	@ObfuscatedName("client.wb")
	public String[] field1086 = new String[field1078];

	@ObfuscatedName("client.yb")
	public class35 field1087;

	@ObfuscatedName("client.zb")
	public class35 field1088;

	@ObfuscatedName("client.ac")
	public int field1111;

	@ObfuscatedName("client.bc")
	public int field1112;

	@ObfuscatedName("client.cc")
	public int field1113;

	@ObfuscatedName("client.dc")
	public class39 field1114 = class39.method216(1);

	@ObfuscatedName("client.ec")
	public int field1115;

	@ObfuscatedName("client.fc")
	public boolean field1116 = false;

	@ObfuscatedName("client.gc")
	public class36 field1117;

	@ObfuscatedName("client.hc")
	public class36 field1118;

	@ObfuscatedName("client.ic")
	public long field1119;

	@ObfuscatedName("client.jc")
	public String field1120 = "";

	@ObfuscatedName("client.kc")
	public String field1121 = "";

	@ObfuscatedName("client.lc")
	public int field1122;

	@ObfuscatedName("client.mc")
	public int[] field1123 = new int[5];

	@ObfuscatedName("client.nc")
	public int field1124 = -1;

	@ObfuscatedName("client.oc")
	public class36[] field1125;

	@ObfuscatedName("client.pc")
	public int field1126;

	@ObfuscatedName("client.qc")
	public int field1127 = 2;

	@ObfuscatedName("client.rc")
	public int field1128;

	@ObfuscatedName("client.sc")
	public int field1129;

	@ObfuscatedName("client.tc")
	public int field1130;

	@ObfuscatedName("client.V")
	public int field1062 = -1;

	@ObfuscatedName("client.Ab")
	public int[] field1089 = new int[5];

	@ObfuscatedName("client.Bb")
	public class26[] field1090 = new class26[16384];

	@ObfuscatedName("client.Db")
	public int[] field1092 = new int[16384];

	@ObfuscatedName("client.Fb")
	public final int[] field1093 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Jb")
	public boolean field1096 = true;

	@ObfuscatedName("client.Lb")
	public long[] field1098 = new long[200];

	@ObfuscatedName("client.Ob")
	public class42[][][] field1100 = new class42[4][104][104];

	@ObfuscatedName("client.Pb")
	public boolean field1101 = false;

	@ObfuscatedName("client.Qb")
	public int field1102 = 0x332D25;

	@ObfuscatedName("client.Sb")
	public int field1103 = -1;

	@ObfuscatedName("client.Vb")
	public class35[] field1106 = new class35[20];

	@ObfuscatedName("client.Wb")
	public int[] field1107 = new int[class68.field1006];

	@ObfuscatedName("client.uc")
	public int[] field1131 = new int[class68.field1006];

	@ObfuscatedName("client.wc")
	public int[][] field1132 = new int[104][104];

	@ObfuscatedName("client.xc")
	public int field1133 = 2048;

	@ObfuscatedName("client.yc")
	public int field1134 = 2047;

	@ObfuscatedName("client.zc")
	public class27[] field1135 = new class27[field1133];

	@ObfuscatedName("client.Bc")
	public int[] field1137 = new int[field1133];

	@ObfuscatedName("client.Dc")
	public int[] field1139 = new int[field1133];

	@ObfuscatedName("client.Ec")
	public class39[] field1140 = new class39[field1133];

	@ObfuscatedName("client.Fc")
	public boolean field1141 = false;

	@ObfuscatedName("client.Nc")
	public int[] field1146 = new int[256];

	@ObfuscatedName("client.Pc")
	public final int field1147 = 100;

	@ObfuscatedName("client.Qc")
	public int[] field1148 = new int[100];

	@ObfuscatedName("client.Sc")
	public class36[] field1149 = new class36[50];

	@ObfuscatedName("client.Uc")
	public int[] field1151 = new int[5];

	@ObfuscatedName("client.Vc")
	public class36[] field1152 = new class36[2];

	@ObfuscatedName("client.fd")
	public int[] field1160 = new int[100];

	@ObfuscatedName("client.gd")
	public String[] field1161 = new String[100];

	@ObfuscatedName("client.hd")
	public String[] field1162 = new String[100];

	@ObfuscatedName("client.id")
	public int[] field1163 = new int[5];

	@ObfuscatedName("client.kd")
	public boolean field1165 = true;

	@ObfuscatedName("client.md")
	public boolean field1167 = false;

	@ObfuscatedName("client.rd")
	public int field1172 = -1;

	@ObfuscatedName("client.sd")
	public boolean field1173 = false;

	@ObfuscatedName("client.wd")
	public long[] field1177 = new long[100];

	@ObfuscatedName("client.Dd")
	public CRC32 field1182 = new CRC32();

	@ObfuscatedName("client.Gd")
	public int[] field1185 = new int[500];

	@ObfuscatedName("client.Hd")
	public int[] field1186 = new int[500];

	@ObfuscatedName("client.Id")
	public int[] field1187 = new int[500];

	@ObfuscatedName("client.Jd")
	public int[] field1188 = new int[500];

	@ObfuscatedName("client.Md")
	public int field1191 = 78;

	@ObfuscatedName("client.Od")
	public class39 field1193 = class39.method216(1);

	@ObfuscatedName("client.Pd")
	public class39 field1194 = class39.method216(1);

	@ObfuscatedName("client.Sd")
	public int[] field1196 = new int[1000];

	@ObfuscatedName("client.Td")
	public int[] field1197 = new int[1000];

	@ObfuscatedName("client.Yd")
	public boolean field1202 = false;

	@ObfuscatedName("client.Zd")
	public boolean field1203 = false;

	@ObfuscatedName("client.de")
	public class35[] field1207 = new class35[1000];

	@ObfuscatedName("client.ge")
	public boolean field1210 = false;

	@ObfuscatedName("client.ne")
	public int field1214 = 0x4D4233;

	@ObfuscatedName("client.we")
	public boolean field1221 = false;

	@ObfuscatedName("client.ze")
	public int field1224 = 1;

	@ObfuscatedName("client.Ae")
	public String field1225 = "";

	@ObfuscatedName("client.Be")
	public boolean field1226 = false;

	@ObfuscatedName("client.Ce")
	public boolean field1227 = true;

	@ObfuscatedName("client.De")
	public int[][] field1228 = new int[104][104];

	@ObfuscatedName("client.Fe")
	public int[] field1229 = new int[class68.field1006];

	@ObfuscatedName("client.Je")
	public String field1233 = "";

	@ObfuscatedName("client.Ke")
	public String field1234 = "";

	@ObfuscatedName("client.Pe")
	public int field1236 = -1;

	@ObfuscatedName("client.Qe")
	public int field1237 = 3;

	@ObfuscatedName("client.Ue")
	public int[] field1241 = new int[200];

	@ObfuscatedName("client.Ve")
	public int field1242 = -1;

	@ObfuscatedName("client.We")
	public int field1243 = 0x23201B;

	@ObfuscatedName("client.gf")
	public boolean field1252 = false;

	@ObfuscatedName("client.lf")
	public boolean field1254 = false;

	@ObfuscatedName("client.mf")
	public boolean field1255 = false;

	@ObfuscatedName("client.of")
	public int[] field1257 = new int[5];

	@ObfuscatedName("client.pf")
	public int field1258 = 0x766654;

	@ObfuscatedName("client.sf")
	public byte[] field1260 = new byte[16384];

	@ObfuscatedName("client.zf")
	public class36[] field1267 = new class36[13];

	@ObfuscatedName("client.Cf")
	public class42 field1270 = new class42();

	@ObfuscatedName("client.Hf")
	public int[] field1272 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Nf")
	public int[] field1276 = new int[50];

	@ObfuscatedName("client.Qf")
	public String[] field1278 = new String[500];

	@ObfuscatedName("client.Sf")
	public int[] field1280 = new int[1000];

	@ObfuscatedName("client.Uf")
	public class63[] field1282 = new class63[4];

	@ObfuscatedName("client.Xf")
	public boolean field1284 = false;

	@ObfuscatedName("client.Yf")
	public String field1285 = "";

	@ObfuscatedName("client.Zf")
	public boolean field1286 = false;

	@ObfuscatedName("client.ag")
	public boolean field1287 = false;

	@ObfuscatedName("client.fg")
	public boolean field1292 = false;

	@ObfuscatedName("client.hg")
	public class4 field1294 = new class4();

	@ObfuscatedName("client.ig")
	public class49[] field1295 = new class49[5];

	@ObfuscatedName("client.tg")
	public int field1306 = -1;

	@ObfuscatedName("client.xg")
	public class42 field1309 = new class42();

	@ObfuscatedName("client.zg")
	public boolean field1311 = false;

	@ObfuscatedName("client.Bg")
	public boolean field1313 = true;

	@ObfuscatedName("client.Cg")
	public int field1314 = 128;

	@ObfuscatedName("client.Kg")
	public boolean field1322 = false;

	@ObfuscatedName("client.Qg")
	public boolean field1328 = false;

	@ObfuscatedName("client.Rg")
	public boolean field1329 = false;

	@ObfuscatedName("client.kh")
	public String[] field1348 = new String[5];

	@ObfuscatedName("client.lh")
	public boolean[] field1349 = new boolean[5];

	@ObfuscatedName("client.mh")
	public String field1350 = "";

	@ObfuscatedName("client.ph")
	public int[] field1353 = new int[2000];

	@ObfuscatedName("client.qh")
	public String[] field1354 = new String[200];

	@ObfuscatedName("client.rh")
	public int field1355 = -1;

	@ObfuscatedName("client.sh")
	public int[][] field1356 = new int[104][104];

	@ObfuscatedName("client.vh")
	public int field1359 = -1;

	@ObfuscatedName("client.yh")
	public int field1361 = 2;

	@ObfuscatedName("client.Hh")
	public String field1369 = "";

	@ObfuscatedName("client.Qh")
	public int[] field1377 = new int[151];

	@ObfuscatedName("client.Rh")
	public int[] field1378 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Wh")
	public int[] field1383 = new int[7];

	@ObfuscatedName("client.di")
	public int field1390 = 1;

	@ObfuscatedName("client.fi")
	public int field1392 = -1;

	@ObfuscatedName("client.gi")
	public int field1393 = -1;

	@ObfuscatedName("client.hi")
	public boolean field1394 = false;

	@ObfuscatedName("client.ii")
	public int[] field1395 = new int[4000];

	@ObfuscatedName("client.ji")
	public int[] field1396 = new int[4000];

	@ObfuscatedName("client.ki")
	public int[] field1397 = new int[33];

	@ObfuscatedName("client.mi")
	public class42 field1399 = new class42();

	@ObfuscatedName("client.ni")
	public int field1400 = -1;

	@ObfuscatedName("client.si")
	public class35[] field1405 = new class35[8];

	@ObfuscatedName("client.Di")
	public boolean[] field1414 = new boolean[5];

	@ObfuscatedName("client.Ei")
	public int[] field1415 = new int[50];

	@ObfuscatedName("client.Hi")
	public int[] field1418 = new int[2000];

	@ObfuscatedName("client.Ki")
	public int field1421 = -1;

	@ObfuscatedName("client.Mi")
	public class35[] field1423 = new class35[20];

	@ObfuscatedName("client.Oi")
	public int field1425 = 2;

	@ObfuscatedName("client.Qi")
	public int[] field1427 = new int[33];

	@ObfuscatedName("client.Ri")
	public String field1428 = "";

	@ObfuscatedName("client.Si")
	public int[] field1429 = new int[50];

	@ObfuscatedName("client.Wi")
	public int[] field1433 = new int[151];

	@ObfuscatedName("client.oj")
	public boolean field1450 = false;

	@ObfuscatedName("client.pj")
	public boolean field1451 = false;

	@ObfuscatedName("client.qj")
	public boolean field1452 = false;

	@ObfuscatedName("client.sj")
	public int[] field1454 = new int[9];

	@ObfuscatedName("client.N")
	public static BigInteger field1054 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.W")
	public static final int[][] field1063 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Xb")
	public static int[] field1108 = new int[99];

	@ObfuscatedName("client.ud")
	public static BigInteger field1175 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Me")
	public static int[] field1235 = new int[32];

	@ObfuscatedName("client.uf")
	public static int field1262 = 10;

	@ObfuscatedName("client.wf")
	public static boolean field1264 = true;

	@ObfuscatedName("client.Tf")
	public static final int[] field1281 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Sh")
	public static String field1379 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.K")
	public int field1051;

	@ObfuscatedName("client.O")
	public int field1055;

	@ObfuscatedName("client.P")
	public int field1056;

	@ObfuscatedName("client.Q")
	public int field1057;

	@ObfuscatedName("client.R")
	public static int field1058;

	@ObfuscatedName("client.Y")
	public static int field1064;

	@ObfuscatedName("client.Cb")
	public int field1091;

	@ObfuscatedName("client.Hb")
	public static int field1094;

	@ObfuscatedName("client.Ib")
	public int field1095;

	@ObfuscatedName("client.Kb")
	public int field1097;

	@ObfuscatedName("client.Tb")
	public static int field1104;

	@ObfuscatedName("client.Ub")
	public static int field1105;

	@ObfuscatedName("client.Yb")
	public int field1109;

	@ObfuscatedName("client.Zb")
	public int field1110;

	@ObfuscatedName("client.Ac")
	public int field1136;

	@ObfuscatedName("client.Cc")
	public int field1138;

	@ObfuscatedName("client.Gc")
	public int field1142;

	@ObfuscatedName("client.Lc")
	public int field1144;

	@ObfuscatedName("client.Mc")
	public static int field1145;

	@ObfuscatedName("client.Tc")
	public int field1150;

	@ObfuscatedName("client.Wc")
	public static int field1153;

	@ObfuscatedName("client.Zc")
	public int field1154;

	@ObfuscatedName("client.ad")
	public int field1155;

	@ObfuscatedName("client.jd")
	public int field1164;

	@ObfuscatedName("client.ld")
	public int field1166;

	@ObfuscatedName("client.nd")
	public int field1168;

	@ObfuscatedName("client.od")
	public int field1169;

	@ObfuscatedName("client.pd")
	public int field1170;

	@ObfuscatedName("client.qd")
	public int field1171;

	@ObfuscatedName("client.yd")
	public int field1178;

	@ObfuscatedName("client.Cd")
	public static int field1181;

	@ObfuscatedName("client.Ed")
	public int field1183;

	@ObfuscatedName("client.Fd")
	public int field1184;

	@ObfuscatedName("client.Ld")
	public int field1190;

	@ObfuscatedName("client.Nd")
	public int field1192;

	@ObfuscatedName("client.Rd")
	public int field1195;

	@ObfuscatedName("client.Ud")
	public int field1198;

	@ObfuscatedName("client.Vd")
	public int field1199;

	@ObfuscatedName("client.Wd")
	public int field1200;

	@ObfuscatedName("client.Xd")
	public int field1201;

	@ObfuscatedName("client.ae")
	public int field1204;

	@ObfuscatedName("client.fe")
	public int field1209;

	@ObfuscatedName("client.je")
	public int field1211;

	@ObfuscatedName("client.ke")
	public static int field1212;

	@ObfuscatedName("client.me")
	public int field1213;

	@ObfuscatedName("client.oe")
	public int field1215;

	@ObfuscatedName("client.pe")
	public int field1216;

	@ObfuscatedName("client.qe")
	public int field1217;

	@ObfuscatedName("client.re")
	public int field1218;

	@ObfuscatedName("client.ve")
	public int field1220;

	@ObfuscatedName("client.xe")
	public int field1222;

	@ObfuscatedName("client.ye")
	public int field1223;

	@ObfuscatedName("client.Ge")
	public int field1230;

	@ObfuscatedName("client.He")
	public int field1231;

	@ObfuscatedName("client.Re")
	public int field1238;

	@ObfuscatedName("client.Ye")
	public int field1245;

	@ObfuscatedName("client.Ze")
	public int field1246;

	@ObfuscatedName("client.af")
	public int field1247;

	@ObfuscatedName("client.kf")
	public int field1253;

	@ObfuscatedName("client.nf")
	public int field1256;

	@ObfuscatedName("client.qf")
	public int field1259;

	@ObfuscatedName("client.tf")
	public int field1261;

	@ObfuscatedName("client.vf")
	public static int field1263;

	@ObfuscatedName("client.Af")
	public int field1268;

	@ObfuscatedName("client.Bf")
	public static int field1269;

	@ObfuscatedName("client.Ff")
	public static int field1271;

	@ObfuscatedName("client.If")
	public static int field1273;

	@ObfuscatedName("client.Lf")
	public int field1274;

	@ObfuscatedName("client.Mf")
	public int field1275;

	@ObfuscatedName("client.Rf")
	public int field1279;

	@ObfuscatedName("client.Wf")
	public int field1283;

	@ObfuscatedName("client.bg")
	public int field1288;

	@ObfuscatedName("client.sg")
	public int field1305;

	@ObfuscatedName("client.ug")
	public int field1307;

	@ObfuscatedName("client.vg")
	public int field1308;

	@ObfuscatedName("client.yg")
	public int field1310;

	@ObfuscatedName("client.Ag")
	public int field1312;

	@ObfuscatedName("client.Dg")
	public int field1315;

	@ObfuscatedName("client.Eg")
	public int field1316;

	@ObfuscatedName("client.Fg")
	public int field1317;

	@ObfuscatedName("client.Lg")
	public int field1323;

	@ObfuscatedName("client.Mg")
	public int field1324;

	@ObfuscatedName("client.Ng")
	public int field1325;

	@ObfuscatedName("client.Og")
	public int field1326;

	@ObfuscatedName("client.Pg")
	public int field1327;

	@ObfuscatedName("client.Tg")
	public int field1331;

	@ObfuscatedName("client.Ug")
	public int field1332;

	@ObfuscatedName("client.hh")
	public int field1345;

	@ObfuscatedName("client.oh")
	public static int field1352;

	@ObfuscatedName("client.th")
	public int field1357;

	@ObfuscatedName("client.uh")
	public int field1358;

	@ObfuscatedName("client.xh")
	public int field1360;

	@ObfuscatedName("client.zh")
	public static int field1362;

	@ObfuscatedName("client.Ih")
	public static int field1370;

	@ObfuscatedName("client.Kh")
	public int field1372;

	@ObfuscatedName("client.Yh")
	public int field1385;

	@ObfuscatedName("client.Zh")
	public int field1386;

	@ObfuscatedName("client.ai")
	public int field1387;

	@ObfuscatedName("client.bi")
	public int field1388;

	@ObfuscatedName("client.ci")
	public int field1389;

	@ObfuscatedName("client.ei")
	public static int field1391;

	@ObfuscatedName("client.li")
	public int field1398;

	@ObfuscatedName("client.oi")
	public int field1401;

	@ObfuscatedName("client.pi")
	public int field1402;

	@ObfuscatedName("client.qi")
	public int field1403;

	@ObfuscatedName("client.ri")
	public int field1404;

	@ObfuscatedName("client.wi")
	public int field1407;

	@ObfuscatedName("client.xi")
	public int field1408;

	@ObfuscatedName("client.yi")
	public int field1409;

	@ObfuscatedName("client.zi")
	public int field1410;

	@ObfuscatedName("client.Ai")
	public int field1411;

	@ObfuscatedName("client.Bi")
	public int field1412;

	@ObfuscatedName("client.Ci")
	public int field1413;

	@ObfuscatedName("client.Fi")
	public int field1416;

	@ObfuscatedName("client.Gi")
	public int field1417;

	@ObfuscatedName("client.Ii")
	public int field1419;

	@ObfuscatedName("client.Ji")
	public int field1420;

	@ObfuscatedName("client.Li")
	public static int field1422;

	@ObfuscatedName("client.Ni")
	public int field1424;

	@ObfuscatedName("client.Pi")
	public int field1426;

	@ObfuscatedName("client.Ui")
	public static int field1431;

	@ObfuscatedName("client.Vi")
	public int field1432;

	@ObfuscatedName("client.Xi")
	public int field1434;

	@ObfuscatedName("client.Yi")
	public int field1435;

	@ObfuscatedName("client.Zi")
	public int field1436;

	@ObfuscatedName("client.aj")
	public int field1437;

	@ObfuscatedName("client.bj")
	public int field1438;

	@ObfuscatedName("client.cj")
	public int field1439;

	@ObfuscatedName("client.hj")
	public int field1444;

	@ObfuscatedName("client.jj")
	public int field1445;

	@ObfuscatedName("client.kj")
	public int field1446;

	@ObfuscatedName("client.lj")
	public int field1447;

	@ObfuscatedName("client.mj")
	public int field1448;

	@ObfuscatedName("client.nj")
	public int field1449;

	@ObfuscatedName("client.rj")
	public int field1453;

	@ObfuscatedName("client.tj")
	public int field1455;

	@ObfuscatedName("client.uj")
	public int field1456;

	@ObfuscatedName("client.vj")
	public int field1457;

	@ObfuscatedName("client.wj")
	public int field1458;

	@ObfuscatedName("client.xj")
	public int field1459;

	@ObfuscatedName("client.yj")
	public int field1460;

	@ObfuscatedName("client.zj")
	public int field1461;

	@ObfuscatedName("client.Aj")
	public int field1462;

	@ObfuscatedName("client.Bj")
	public int field1463;

	@ObfuscatedName("client.Cj")
	public int field1464;

	@ObfuscatedName("client.Dj")
	public int field1465;

	@ObfuscatedName("client.Ej")
	public int field1466;

	@ObfuscatedName("client.Fj")
	public int field1467;

	@ObfuscatedName("client.Xe")
	public long field1244;

	@ObfuscatedName("client.nh")
	public long field1351;

	@ObfuscatedName("client.Xh")
	public long field1384;

	@ObfuscatedName("client.ti")
	public long field1406;

	@ObfuscatedName("client.yf")
	public class18 field1266;

	@ObfuscatedName("client.Ah")
	public static class27 field1363;

	@ObfuscatedName("client.L")
	public class35 field1052;

	@ObfuscatedName("client.M")
	public class35 field1053;

	@ObfuscatedName("client.Ic")
	public class35 field1143;

	@ObfuscatedName("client.bd")
	public class35 field1156;

	@ObfuscatedName("client.cd")
	public class35 field1157;

	@ObfuscatedName("client.dd")
	public class35 field1158;

	@ObfuscatedName("client.ed")
	public class35 field1159;

	@ObfuscatedName("client.td")
	public class35 field1174;

	@ObfuscatedName("client.Ie")
	public class35 field1232;

	@ObfuscatedName("client.ih")
	public class35 field1346;

	@ObfuscatedName("client.jh")
	public class35 field1347;

	@ObfuscatedName("client.Se")
	public class36 field1239;

	@ObfuscatedName("client.Te")
	public class36 field1240;

	@ObfuscatedName("client.cf")
	public class36 field1249;

	@ObfuscatedName("client.df")
	public class36 field1250;

	@ObfuscatedName("client.ef")
	public class36 field1251;

	@ObfuscatedName("client.cg")
	public class36 field1289;

	@ObfuscatedName("client.dg")
	public class36 field1290;

	@ObfuscatedName("client.eg")
	public class36 field1291;

	@ObfuscatedName("client.Ch")
	public class36 field1364;

	@ObfuscatedName("client.Dh")
	public class36 field1365;

	@ObfuscatedName("client.Eh")
	public class36 field1366;

	@ObfuscatedName("client.Fh")
	public class36 field1367;

	@ObfuscatedName("client.Gh")
	public class36 field1368;

	@ObfuscatedName("client.Gg")
	public class37 field1318;

	@ObfuscatedName("client.Hg")
	public class37 field1319;

	@ObfuscatedName("client.Ig")
	public class37 field1320;

	@ObfuscatedName("client.Jg")
	public class37 field1321;

	@ObfuscatedName("client.jg")
	public class44 field1296;

	@ObfuscatedName("client.kg")
	public class44 field1297;

	@ObfuscatedName("client.lg")
	public class44 field1298;

	@ObfuscatedName("client.mg")
	public class44 field1299;

	@ObfuscatedName("client.ng")
	public class44 field1300;

	@ObfuscatedName("client.og")
	public class44 field1301;

	@ObfuscatedName("client.pg")
	public class44 field1302;

	@ObfuscatedName("client.qg")
	public class44 field1303;

	@ObfuscatedName("client.rg")
	public class44 field1304;

	@ObfuscatedName("client.Vg")
	public class44 field1333;

	@ObfuscatedName("client.Wg")
	public class44 field1334;

	@ObfuscatedName("client.Xg")
	public class44 field1335;

	@ObfuscatedName("client.Yg")
	public class44 field1336;

	@ObfuscatedName("client.Zg")
	public class44 field1337;

	@ObfuscatedName("client.ah")
	public class44 field1338;

	@ObfuscatedName("client.bh")
	public class44 field1339;

	@ObfuscatedName("client.ch")
	public class44 field1340;

	@ObfuscatedName("client.dh")
	public class44 field1341;

	@ObfuscatedName("client.Mh")
	public class44 field1373;

	@ObfuscatedName("client.Nh")
	public class44 field1374;

	@ObfuscatedName("client.Oh")
	public class44 field1375;

	@ObfuscatedName("client.Ph")
	public class44 field1376;

	@ObfuscatedName("client.Th")
	public class44 field1380;

	@ObfuscatedName("client.Uh")
	public class44 field1381;

	@ObfuscatedName("client.Vh")
	public class44 field1382;

	@ObfuscatedName("client.Pf")
	public class48 field1277;

	@ObfuscatedName("client.Sg")
	public class50 field1330;

	@ObfuscatedName("client.gg")
	public class51 field1293;

	@ObfuscatedName("client.Nb")
	public class59 field1099;

	@ObfuscatedName("client.vd")
	public class5 field1176;

	@ObfuscatedName("client.se")
	public String field1219;

	@ObfuscatedName("client.bf")
	public String field1248;

	@ObfuscatedName("client.xf")
	public static boolean field1265;

	@ObfuscatedName("client.S")
	public int[] field1059;

	@ObfuscatedName("client.T")
	public int[] field1060;

	@ObfuscatedName("client.U")
	public int[] field1061;

	@ObfuscatedName("client.zd")
	public int[] field1179;

	@ObfuscatedName("client.Ad")
	public int[] field1180;

	@ObfuscatedName("client.be")
	public int[] field1205;

	@ObfuscatedName("client.ce")
	public int[] field1206;

	@ObfuscatedName("client.eh")
	public int[] field1342;

	@ObfuscatedName("client.fh")
	public int[] field1343;

	@ObfuscatedName("client.gh")
	public int[] field1344;

	@ObfuscatedName("client.dj")
	public int[] field1440;

	@ObfuscatedName("client.ej")
	public int[] field1441;

	@ObfuscatedName("client.fj")
	public int[] field1442;

	@ObfuscatedName("client.gj")
	public int[] field1443;

	@ObfuscatedName("client.Kd")
	public byte[][] field1189;

	@ObfuscatedName("client.Ti")
	public byte[][] field1430;

	@ObfuscatedName("client.ee")
	public byte[][][] field1208;

	@ObfuscatedName("client.Jh")
	public int[][][] field1371;

	@ObfuscatedName("client.f(I)V")
	public final void method426() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1378[0] != -1) {
				field1394 = true;
				field1237 = 0;
				field1284 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1378[1] != -1) {
				field1394 = true;
				field1237 = 1;
				field1284 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1378[2] != -1) {
				field1394 = true;
				field1237 = 2;
				field1284 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1378[3] != -1) {
				field1394 = true;
				field1237 = 3;
				field1284 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1378[4] != -1) {
				field1394 = true;
				field1237 = 4;
				field1284 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1378[5] != -1) {
				field1394 = true;
				field1237 = 5;
				field1284 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1378[6] != -1) {
				field1394 = true;
				field1237 = 6;
				field1284 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1378[7] != -1) {
				field1394 = true;
				field1237 = 7;
				field1284 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1378[8] != -1) {
				field1394 = true;
				field1237 = 8;
				field1284 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1378[9] != -1) {
				field1394 = true;
				field1237 = 9;
				field1284 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1378[10] != -1) {
				field1394 = true;
				field1237 = 10;
				field1284 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1378[11] != -1) {
				field1394 = true;
				field1237 = 11;
				field1284 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1378[12] != -1) {
				field1394 = true;
				field1237 = 12;
				field1284 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1378[13] != -1) {
				field1394 = true;
				field1237 = 13;
				field1284 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method427() {
		field1376.method257();
		class34.field578 = field1342;
		field1251.method198(0, 0);

		if (field1450) {
			field1320.method200(40, 239, field1369, 0);
			field1320.method200(60, 239, field1225 + "*", 128);
		} else if (field1311) {
			field1320.method200(40, 239, "Enter amount:", 0);
			field1320.method200(60, 239, field1428 + "*", 128);
		} else if (field1068 != null) {
			field1320.method200(40, 239, field1068, 0);
			field1320.method200(60, 239, "Click to continue", 128);
		} else if (field1103 != -1) {
			method543(0, 0, 0, class4.field56[field1103]);
		} else if (field1306 == -1) {
			class37 var1 = field1319;
			int var2 = 0;
			class33.method153(77, 0, 0, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1162[var3] != null) {
					int var4 = field1160[var3];
					int var5 = field1426 + 70 - var2 * 14;
					String var6 = field1161[var3];
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
							var1.method203(field1162[var3], 0, var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1150 == 0 || field1150 == 1 && method455(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1152[0].method198(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1152[1].method198(var8, var5 - 12);
								var8 += 14;
							}

							var1.method203(var6 + ":", 0, var5, var8);
							var8 += var1.method202(var6) + 8;
							var1.method203(field1162[var3], 255, var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1312 == 0 && (var4 == 7 || field1467 == 0 || field1467 == 1 && method455(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method203("From", 0, var5, var9);
							int var11 = var9 + var1.method202("From ");
							if (var7 == 1) {
								field1152[0].method198(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1152[1].method198(var11, var5 - 12);
								var11 += 14;
							}

							var1.method203(var6 + ":", 0, var5, var11);
							var11 += var1.method202(var6) + 8;
							var1.method203(field1162[var3], 0x800000, var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field1192 == 0 || field1192 == 1 && method455(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method203(var6 + " " + field1162[var3], 0x800080, var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && field1312 == 0 && field1467 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method203(field1162[var3], 0x800000, var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && field1312 == 0 && field1467 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method203("To " + var6 + ":", 0, var5, 4);
							var1.method203(field1162[var3], 0x800000, var5, var1.method202("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field1192 == 0 || field1192 == 1 && method455(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method203(var6 + " " + field1162[var3], 0x7E3200, var5, 4);
						}

						var2++;
					}
				}
			}

			class33.method152();
			field1191 = var2 * 14 + 7;
			if (field1191 < 78) {
				field1191 = 78;
			}

			method508(463, 0, field1191 - field1426 - 77, 77, field1191);
			String var10;
			if (field1363 == null || field1363.field416 == null) {
				var10 = class52.method303(field1120);
			} else {
				var10 = field1363.field416;
			}

			var1.method203(var10 + ":", 0, 90, 4);
			var1.method203(field1350 + "*", 255, 90, var1.method202(var10 + ": ") + 6);
			class33.method159(0, 479, 0, 77);
		} else {
			method543(0, 0, 0, class4.field56[field1306]);
		}

		if (field1173 && field1445 == 2) {
			method516();
		}

		field1376.method258(357, field9, 17);
		field1375.method257();
		class34.field578 = field1344;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method428(boolean arg0) {
		method466();
		field1335.method257();
		field1239.method198(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1308 == 0) {
			int var4 = var3 / 2 + 80;
			field1318.method201(var2 / 2, true, 0x75A9A9, var4, field1277.field736);
			int var5 = var3 / 2 - 20;
			field1320.method201(var2 / 2, true, 0xFFFF00, var5, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1240.method198(var6 - 73, var7 - 20);
			field1320.method201(var6, true, 0xFFFFFF, var7 + 5, "New user");
			int var8 = var2 / 2 + 80;
			field1240.method198(var8 - 73, var7 - 20);
			field1320.method201(var8, true, 0xFFFFFF, var7 + 5, "Existing User");
		}

		if (field1308 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1233.length() > 0) {
				field1320.method201(var2 / 2, true, 0xFFFF00, var9 - 15, field1233);
				field1320.method201(var2 / 2, true, 0xFFFF00, var9, field1234);
				var9 += 30;
			} else {
				field1320.method201(var2 / 2, true, 0xFFFF00, var9 - 7, field1234);
				var9 += 30;
			}

			field1320.method205(var9, "Username: " + field1120 + (field1178 == 0 & field1058 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, true, 0xFFFFFF);
			var9 += 15;
			field1320.method205(var9, "Password: " + class52.method305(field1121) + (field1178 == 1 & field1058 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, true, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1240.method198(var10 - 73, var11 - 20);
				field1320.method201(var10, true, 0xFFFFFF, var11 + 5, "Login");
				int var12 = var2 / 2 + 80;
				field1240.method198(var12 - 73, var11 - 20);
				field1320.method201(var12, true, 0xFFFFFF, var11 + 5, "Cancel");
			}
		}

		if (field1308 == 3) {
			field1320.method201(var2 / 2, true, 0xFFFF00, var3 / 2 - 60, "Create a free account");
			int var13 = var3 / 2 - 35;
			field1320.method201(var2 / 2, true, 0xFFFFFF, var13, "To create a new account you need to");
			var13 += 15;
			field1320.method201(var2 / 2, true, 0xFFFFFF, var13, "go back to the main RuneScape webpage");
			var13 += 15;
			field1320.method201(var2 / 2, true, 0xFFFFFF, var13, "and choose the red 'create account'");
			var13 += 15;
			field1320.method201(var2 / 2, true, 0xFFFFFF, var13, "button at the top right of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1240.method198(var14 - 73, var15 - 20);
			field1320.method201(var14, true, 0xFFFFFF, var15 + 5, "Cancel");
		}

		field1335.method258(171, field9, 202);

		if (field1210) {
			field1210 = false;
			field1333.method258(0, field9, 128);
			field1334.method258(371, field9, 202);
			field1338.method258(265, field9, 0);
			field1339.method258(265, field9, 562);
			field1340.method258(171, field9, 128);
			field1341.method258(171, field9, 562);
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method429() {
		if (field1308 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1308 = 3;
				field1178 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1233 = "";
				field1234 = "Enter your username & password.";
				field1308 = 2;
				field1178 = 0;
			}
		} else if (field1308 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1178 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1178 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method464(field1120, field1121, false);

				if (field1452) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1308 = 0;
				field1120 = "";
				field1121 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1379.length(); var10++) {
					if (var8 == field1379.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1178 == 0) {
					if (var8 == 8 && field1120.length() > 0) {
						field1120 = field1120.substring(0, field1120.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1178 = 1;
					}

					if (var9) {
						field1120 = field1120 + (char) var8;
					}

					if (field1120.length() > 12) {
						field1120 = field1120.substring(0, 12);
					}
				} else if (field1178 == 1) {
					if (var8 == 8 && field1121.length() > 0) {
						field1121 = field1121.substring(0, field1121.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1178 = 0;
					}

					if (var9) {
						field1121 = field1121 + (char) var8;
					}

					if (field1121.length() > 20) {
						field1121 = field1121.substring(0, 20);
					}
				}
			}
		} else if (field1308 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1308 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZ)V")
	public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1266.method76(arg0, arg4, arg2);
		if (var6 != 0) {
			int var7 = field1266.method80(arg0, arg4, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field1232.field590;
			int var12 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class58 var14 = class58.method329(var13);
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
				class36 var15 = field1149[var14.field850];
				if (var15 != null) {
					int var16 = (var14.field836 * 4 - var15.field599) / 2;
					int var17 = (var14.field837 * 4 - var15.field600) / 2;
					var15.method198(arg4 * 4 + var16 + 48, (104 - arg2 - var14.field837) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1266.method78(arg0, arg4, arg2);
		if (var18 != 0) {
			int var19 = field1266.method80(arg0, arg4, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class58 var23 = class58.method329(var22);
			if (var23.field850 != -1) {
				class36 var24 = field1149[var23.field850];
				if (var24 != null) {
					int var25 = (var23.field836 * 4 - var24.field599) / 2;
					int var26 = (var23.field837 * 4 - var24.field600) / 2;
					var24.method198(arg4 * 4 + var25 + 48, (104 - arg2 - var23.field837) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1232.field590;
				int var29 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field1266.method79(arg0, arg4, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class58 var32 = class58.method329(var31);
			if (var32.field850 != -1) {
				class36 var33 = field1149[var32.field850];
				if (var33 != null) {
					int var34 = (var32.field836 * 4 - var33.field599) / 2;
					int var35 = (var32.field837 * 4 - var33.field600) / 2;
					var33.method198(arg4 * 4 + var34 + 48, (104 - arg2 - var32.field837) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method431(long arg0) {
		if (arg0 != 0L) {
			if (field1416 >= 100 && field1211 != 1) {
				method539("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field1416 >= 200) {
				method539("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = class52.method303(class52.method300(arg0));
				for (int var4 = 0; var4 < field1416; var4++) {
					if (field1098[var4] == arg0) {
						method539(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1305; var5++) {
					if (field1177[var5] == arg0) {
						method539("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field1363.field416)) {
					field1354[field1416] = var3;
					field1098[field1416] = arg0;
					field1241[field1416] = 0;
					field1416++;
					field1394 = true;
					field1194.method217(9);
					field1194.method224(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLy;I)V")
	public final void method432(class25 arg0, int arg1) {
		method433(arg0.field360, arg1, arg0.field361);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method433(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method515(arg0, arg2, field1434) - arg1;
			arg0 -= field1435;
			var4 -= field1436;
			arg2 -= field1437;
			int var5 = class31.field544[field1438];
			int var6 = class31.field545[field1438];
			int var7 = class31.field544[field1439];
			int var8 = class31.field545[field1439];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field1392 = (var9 << 9) / arg2 + class34.field572;
				field1393 = (var11 << 9) / arg2 + class34.field573;
			} else {
				field1392 = -1;
				field1393 = -1;
			}
		} else {
			field1392 = -1;
			field1393 = -1;
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method434(class39 arg0, int arg1) {
		if (arg1 == 70 || arg1 == 88) {
			int var3 = arg0.method228();
			int var4 = (var3 >> 4 & 0x7) + field1419;
			int var5 = (var3 & 0x7) + field1420;
			int var6 = arg0.method228();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1093[var7];
			int var10;
			if (arg1 == 88) {
				var10 = -1;
			} else {
				var10 = arg0.method230();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method490(var10, -1, 0, var5, var4, var7, var9, var8, field1434);
			}
		} else if (arg1 == 30) {
			int var11 = arg0.method228();
			int var12 = (var11 >> 4 & 0x7) + field1419;
			int var13 = (var11 & 0x7) + field1420;
			int var14 = arg0.method228();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1093[var15];
			int var18 = arg0.method230();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1371[field1434][var12][var13];
				int var20 = field1371[field1434][var12 + 1][var13];
				int var21 = field1371[field1434][var12 + 1][var13 + 1];
				int var22 = field1371[field1434][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1266.method72(field1434, var12, var13);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var18, var16 + 4, false, var20, var19, var24, var22, 2, var21);
							var23.field255 = new class28(var18, var16 + 1 & 0x3, false, var20, var19, var24, var22, 2, var21);
						} else {
							var23.field254 = new class28(var18, var16, false, var20, var19, var24, var22, var15, var21);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1266.method73(var12, field1434, var13);
					if (var25 != null) {
						var25.field147 = new class28(var18, 0, false, var20, var19, var25.field148 >> 14 & 0x7FFF, var22, 4, var21);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1266.method74(var12, field1434, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var18, var16, false, var20, var19, var26.field247 >> 14 & 0x7FFF, var22, var15, var21);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1266.method75(field1434, var13, var12);
					if (var27 != null) {
						var27.field178 = new class28(var18, var16, false, var20, var19, var27.field179 >> 14 & 0x7FFF, var22, 22, var21);
					}
				}
			}
		} else if (arg1 == 120) {
			int var28 = arg0.method228();
			int var29 = (var28 >> 4 & 0x7) + field1419;
			int var30 = (var28 & 0x7) + field1420;
			int var31 = arg0.method230();
			int var32 = arg0.method230();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field449 = var31;
				var33.field450 = var32;

				if (field1100[field1434][var29][var30] == null) {
					field1100[field1434][var29][var30] = new class42();
				}

				field1100[field1434][var29][var30].method244(var33);
				method546(var29, var30);
			}
		} else if (arg1 == 115) {
			int var34 = arg0.method228();
			int var35 = (var34 >> 4 & 0x7) + field1419;
			int var36 = (var34 & 0x7) + field1420;
			int var37 = arg0.method230();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1100[field1434][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method247(); var39 != null; var39 = (class29) var38.method249()) {
						if ((var37 & 0x7FFF) == var39.field449) {
							var39.method106();
							break;
						}
					}

					if (var38.method247() == null) {
						field1100[field1434][var35][var36] = null;
					}

					method546(var35, var36);
				}
			}
		} else if (arg1 == 37) {
			int var40 = arg0.method228();
			int var41 = (var40 >> 4 & 0x7) + field1419;
			int var42 = (var40 & 0x7) + field1420;
			int var43 = var41 + arg0.method229();
			int var44 = var42 + arg0.method229();
			int var45 = arg0.method231();
			int var46 = arg0.method230();
			int var47 = arg0.method228() * 4;
			int var48 = arg0.method228() * 4;
			int var49 = arg0.method230();
			int var50 = arg0.method230();
			int var51 = arg0.method228();
			int var52 = arg0.method228();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class30 var53 = new class30(var46, field1058 + var49, var45, var42, method515(var41, var42, field1434) - var47, field1434, var51, var48, field1058 + var50, var41, var52);
				var53.method119(var43, method515(var43, var44, field1434) - var48, var44, field1058 + var49);
				field1309.method244(var53);
			}
		} else if (arg1 == 114) {
			int var54 = arg0.method228();
			int var55 = (var54 >> 4 & 0x7) + field1419;
			int var56 = (var54 & 0x7) + field1420;
			int var57 = arg0.method230();
			int var58 = arg0.method228();
			int var59 = arg0.method230();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(field1058, var57, var56, var59, field1434, method515(var55, var56, field1434) - var58, var55);
				field1270.method244(var60);
			}
		} else if (arg1 == 8) {
			int var61 = arg0.method228();
			int var62 = (var61 >> 4 & 0x7) + field1419;
			int var63 = (var61 & 0x7) + field1420;
			int var64 = arg0.method230();
			int var65 = arg0.method230();
			int var66 = arg0.method230();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1421 != var66) {
				class29 var67 = new class29();
				var67.field449 = var64;
				var67.field450 = var65;

				if (field1100[field1434][var62][var63] == null) {
					field1100[field1434][var62][var63] = new class42();
				}

				field1100[field1434][var62][var63].method244(var67);
				method546(var62, var63);
			}
		} else if (arg1 == 218) {
			int var68 = arg0.method228();
			int var69 = (var68 >> 4 & 0x7) + field1419;
			int var70 = (var68 & 0x7) + field1420;
			int var71 = arg0.method228();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1093[var72];
			int var75 = arg0.method230();
			int var76 = arg0.method230();
			int var77 = arg0.method230();
			int var78 = arg0.method230();
			byte var79 = arg0.method229();
			byte var80 = arg0.method229();
			byte var81 = arg0.method229();
			byte var82 = arg0.method229();
			class27 var83;
			if (field1421 == var78) {
				var83 = field1363;
			} else {
				var83 = field1135[var78];
			}

			if (var83 != null) {
				class58 var84 = class58.method329(var75);
				int var85 = field1371[field1434][var69][var70];
				int var86 = field1371[field1434][var69 + 1][var70];
				int var87 = field1371[field1434][var69 + 1][var70 + 1];
				int var88 = field1371[field1434][var69][var70 + 1];
				class31 var89 = var84.method335(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method490(-1, var77 + 1, var76 + 1, var70, var69, 0, var74, 0, field1434);
					var83.field425 = field1058 + var76;
					var83.field426 = field1058 + var77;
					var83.field430 = var89;
					int var90 = var84.field836;
					int var91 = var84.field837;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field837;
						var91 = var84.field836;
					}

					var83.field427 = var69 * 128 + var90 * 64;
					var83.field429 = var70 * 128 + var91 * 64;
					var83.field428 = method515(var83.field427, var83.field429, field1434);

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

					var83.field431 = var69 + var79;
					var83.field433 = var69 + var81;
					var83.field432 = var70 + var80;
					var83.field434 = var70 + var82;
				}
			}
		} else if (arg1 == 98) {
			int var94 = arg0.method228();
			int var95 = (var94 >> 4 & 0x7) + field1419;
			int var96 = (var94 & 0x7) + field1420;
			int var97 = arg0.method230();
			int var98 = arg0.method230();
			int var99 = arg0.method230();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1100[field1434][var95][var96];
				if (var100 != null) {
					for (class29 var101 = (class29) var100.method247(); var101 != null; var101 = (class29) var100.method249()) {
						if ((var97 & 0x7FFF) == var101.field449 && var101.field450 == var98) {
							var101.field450 = var99;
							break;
						}
					}

					method546(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method435(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.i(I)V")
	public final void method436() {
		for (class41 var1 = (class41) field1399.method247(); var1 != null; var1 = (class41) field1399.method249()) {
			if (var1.field653 == -1) {
				var1.field652 = 0;
				method477(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.a(IIZIIIIIIIII)Z")
	public final boolean method437(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1356[var14][var15] = 0;
				field1132[var14][var15] = 99999999;
			}
		}

		int var16 = arg5;
		int var17 = arg0;
		field1356[arg5][arg0] = 99;
		field1132[arg5][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1395[var18] = arg5;
		int var35 = var18 + 1;
		field1396[var18] = arg0;
		boolean var20 = false;
		int var21 = field1395.length;
		int[][] var22 = field1282[field1434].field956;
		while (var35 != var19) {
			var16 = field1395[var19];
			var17 = field1396[var19];
			var19 = (var19 + 1) % var21;

			if (arg1 == var16 && arg6 == var17) {
				var20 = true;
				break;
			}

			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && field1282[field1434].method365(arg9, var17, arg1, arg6, arg4 - 1, var16)) {
					var20 = true;
					break;
				}

				if (arg4 < 10 && field1282[field1434].method366(arg1, var16, var17, arg6, arg4 - 1, arg9)) {
					var20 = true;
					break;
				}
			}

			if (arg7 != 0 && arg8 != 0 && field1282[field1434].method367(arg3, var16, arg1, arg6, arg8, arg7, var17)) {
				var20 = true;
				break;
			}

			int var23 = field1132[var16][var17] + 1;
			if (var16 > 0 && field1356[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1395[var35] = var16 - 1;
				field1396[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1356[var16 - 1][var17] = 2;
				field1132[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1356[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1395[var35] = var16 + 1;
				field1396[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1356[var16 + 1][var17] = 8;
				field1132[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1356[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1395[var35] = var16;
				field1396[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1356[var16][var17 - 1] = 1;
				field1132[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1356[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1395[var35] = var16;
				field1396[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1356[var16][var17 + 1] = 4;
				field1132[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1356[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1395[var35] = var16 - 1;
				field1396[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1356[var16 - 1][var17 - 1] = 3;
				field1132[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1356[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1395[var35] = var16 + 1;
				field1396[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1356[var16 + 1][var17 - 1] = 9;
				field1132[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1356[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1395[var35] = var16 - 1;
				field1396[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1356[var16 - 1][var17 + 1] = 6;
				field1132[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1356[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1395[var35] = var16 + 1;
				field1396[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1356[var16 + 1][var17 + 1] = 12;
				field1132[var16 + 1][var17 + 1] = var23;
			}
		}

		field1444 = 0;
		if (!var20) {
			if (arg2) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg1 - var25; var26 <= arg1 + var25; var26++) {
						for (int var27 = arg6 - var25; var27 <= arg6 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1132[var26][var27] < var24) {
								var24 = field1132[var26][var27];
								var16 = var26;
								var17 = var27;
								field1444 = 1;
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
		field1395[var28] = var16;
		int var36 = var28 + 1;
		field1396[var28] = var17;
		int var29;
		int var30 = var29 = field1356[var16][var17];
		while (arg5 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1395[var36] = var16;
				field1396[var36++] = var17;
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

			var30 = field1356[var16][var17];
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
		int var32 = field1395[var36];
		int var33 = field1396[var36];

		if (arg10 == 0) {
			field1194.method217(6);
			field1194.method218(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			field1194.method217(220);
			field1194.method218(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			field1194.method217(127);
			field1194.method218(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1194.method218(1);
		} else {
			field1194.method218(0);
		}

		field1194.method219(field1385 + var32);
		field1194.method219(field1386 + var33);
		field1230 = field1395[0];
		field1231 = field1396[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1194.method218(field1395[var36] - var32);
			field1194.method218(field1396[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method438(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1138; var3++) {
			int var4 = field1139[var3];
			class26 var5 = field1090[var4];
			int var6 = arg1.method228();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method228();
				int var8 = arg1.method228();
				var5.method114(field1058, var7, var8);
				var5.field379 = field1058 + 300;
				var5.field380 = arg1.method228();
				var5.field381 = arg1.method228();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg1.method230();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field388 == var9) {
					var5.field392 = 0;
				}

				int var10 = arg1.method228();
				if (var5.field388 == var9 && var9 != -1) {
					int var11 = class67.field991[var9].field1005;
					if (var11 == 1) {
						var5.field389 = 0;
						var5.field390 = 0;
						var5.field391 = var10;
						var5.field392 = 0;
					}

					if (var11 == 2) {
						var5.field392 = 0;
					}
				} else if (var9 == -1 || var5.field388 == -1 || class67.field991[var9].field999 >= class67.field991[var5.field388].field999) {
					var5.field388 = var9;
					var5.field389 = 0;
					var5.field390 = 0;
					var5.field391 = var10;
					var5.field392 = 0;
					var5.field414 = var5.field409;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field382 = arg1.method230();
				if (var5.field382 == 0xFFFF) {
					var5.field382 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field372 = arg1.method235();
				var5.field373 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg1.method228();
				int var13 = arg1.method228();
				var5.method114(field1058, var12, var13);
				var5.field379 = field1058 + 300;
				var5.field380 = arg1.method228();
				var5.field381 = arg1.method228();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class60.method339(arg1.method230());
				var5.field364 = var5.field415.field879;
				var5.field408 = var5.field415.field901;
				var5.field367 = var5.field415.field883;
				var5.field368 = var5.field415.field884;
				var5.field369 = var5.field415.field885;
				var5.field370 = var5.field415.field886;
				var5.field365 = var5.field415.field882;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg1.method230();
				int var14 = arg1.method233();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1058;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1058) {
					var5.field394 = -1;
				}

				if (var5.field393 == 0xFFFF) {
					var5.field393 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field383 = arg1.method230();
				var5.field384 = arg1.method230();
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method439(class4 arg0) {
		int var2 = arg0.field65;
		if (field1417 == 2) {
			if (var2 == 201) {
				field1286 = true;
				field1311 = false;
				field1450 = true;
				field1225 = "";
				field1332 = 1;
				field1369 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1286 = true;
				field1311 = false;
				field1450 = true;
				field1225 = "";
				field1332 = 2;
				field1369 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1459 = 250;
			return true;
		}

		if (var2 == 501) {
			field1286 = true;
			field1311 = false;
			field1450 = true;
			field1225 = "";
			field1332 = 4;
			field1369 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1286 = true;
			field1311 = false;
			field1450 = true;
			field1225 = "";
			field1332 = 5;
			field1369 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1383[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class65.field970 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class65.field970) {
							var5 = 0;
						}
					}

					if (!class65.field971[var5].field977 && class65.field971[var5].field972 == var3 + (field1313 ? 0 : 7)) {
						break;
					}
				}

				field1383[var3] = var5;
				field1328 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1123[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1063[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1063[var6].length) {
					var8 = 0;
				}
			}

			field1123[var6] = var8;
			field1328 = true;
		}

		if (var2 == 324 && !field1313) {
			field1313 = true;
			method513();
		}

		if (var2 == 325 && field1313) {
			field1313 = false;
			method513();
		}

		if (var2 == 326) {
			field1194.method217(13);
			field1194.method218(field1313 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1194.method218(field1383[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1194.method218(field1123[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1255 = !field1255;
		}

		if (var2 >= 601 && var2 <= 612) {
			method453();

			if (field1285.length() > 0) {
				field1194.method217(203);
				field1194.method224(class52.method299(field1285));
				field1194.method218(var2 - 601);
				field1194.method218(field1255 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method440(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method440(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method484(var6);
				int var8;
				if (var7) {
					var8 = var6.field110;
				} else {
					var8 = var6.field109;
				}

				if (var8 != -1) {
					class67 var9 = class67.field991[var8];
					var6.field60 += arg0;
					while (var6.field60 > var9.method379(var6.field59)) {
						var6.field60 -= var9.method379(var6.field59) + 1;
						var6.field59++;
						if (var6.field59 >= var9.field992) {
							var6.field59 -= var9.field996;
							if (var6.field59 < 0 || var6.field59 >= var9.field992) {
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

	@ObfuscatedName("client.b(Z)V")
	public final void method441() {
		if (field1376 == null) {
			method534();
			field10 = null;
			field1333 = null;
			field1334 = null;
			field1335 = null;
			field1336 = null;
			field1337 = null;
			field1338 = null;
			field1339 = null;
			field1340 = null;
			field1341 = null;
			field1376 = new class44(479, 96, method11());
			field1374 = new class44(172, 156, method11());
			class33.method154();
			field1250.method198(0, 0);
			field1373 = new class44(190, 261, method11());
			field1375 = new class44(512, 334, method11());
			class33.method154();
			field1380 = new class44(496, 50, method11());
			field1381 = new class44(269, 37, method11());
			field1382 = new class44(249, 45, method11());
			field1210 = true;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method442() {
		if (field1065 == 2) {
			method433((field1462 - field1385 << 7) + field1465, field1464 * 2, (field1463 - field1386 << 7) + field1466);

			if (field1392 > -1 && field1058 % 20 < 10) {
				field1106[2].method185(field1392 - 12, field1393 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method443(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1416; var3++) {
				if (field1098[var3] == arg0) {
					field1416--;
					field1394 = true;

					for (int var4 = var3; var4 < field1416; var4++) {
						field1354[var4] = field1354[var4 + 1];
						field1241[var4] = field1241[var4 + 1];
						field1098[var4] = field1098[var4 + 1];
					}

					field1194.method217(84);
					field1194.method224(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method444() {
		if (field1312 != 0) {
			class37 var1 = field1319;
			int var2 = 0;
			if (field1130 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1162[var3] != null) {
					int var4 = field1160[var3];
					String var5 = field1161[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1467 == 0 || field1467 == 1 && method455(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method203("From", 0, var7, var8);
						var1.method203("From", 0xFFFF, var7 - 1, var8);
						int var11 = var8 + var1.method202("From ");
						if (var6 == 1) {
							field1152[0].method198(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1152[1].method198(var11, var7 - 12);
							var11 += 14;
						}

						var1.method203(var5 + ": " + field1162[var3], 0, var7, var11);
						var1.method203(var5 + ": " + field1162[var3], 0xFFFF, var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1467 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method203(field1162[var3], 0, var9, 4);
						var1.method203(field1162[var3], 0xFFFF, var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1467 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method203("To " + var5 + ": " + field1162[var3], 0, var10, 4);
						var1.method203("To " + var5 + ": " + field1162[var3], 0xFFFF, var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)Z")
	public final boolean method445() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method446() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1322) {
			field1141 = false;
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

		if (field1101) {
			field1141 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1221) {
			field1141 = false;
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

	@ObfuscatedName("client.k(I)V")
	public void method447() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1345);

		if (field1277 != null) {
			System.out.println("Od-cycle:" + field1277.field750);
		}

		System.out.println("loop-cycle:" + field1058);
		System.out.println("draw-cycle:" + field1422);
		System.out.println("ptype:" + field1456);
		System.out.println("psize:" + field1455);

		if (field1176 != null) {
			field1176.method43();
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

	@ObfuscatedName("client.f(Z)V")
	public final void method448() {
		method444();

		if (field1171 == 1) {
			field1405[field1170 / 100].method185(field1168 - 8 - 4, field1169 - 8 - 4);
		}

		if (field1171 == 2) {
			field1405[field1170 / 100 + 4].method185(field1168 - 8 - 4, field1169 - 8 - 4);
			field1271++;
			if (field1271 > 57) {
				field1271 = 0;
				field1194.method217(100);
			}
		}

		if (field1124 != -1) {
			method440(field1166, field1124);
			method543(0, 0, 0, class4.field56[field1124]);
		}

		if (field1062 != -1) {
			method440(field1166, field1062);
			method543(0, 0, 0, class4.field56[field1062]);
		}

		method480();

		if (!field1173) {
			method544();
			method456();
		} else if (field1445 == 0) {
			method516();
		}

		if (field1413 == 1) {
			field1106[1].method185(472, 296);
		}

		if (field1130 != 0) {
			int var1 = field1130 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1319.method203("System update in: " + var2 + ":0" + var1, 0xFFFF00, 329, 4);
			} else {
				field1319.method203("System update in: " + var2 + ":" + var1, 0xFFFF00, 329, 4);
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method449() {
		if (field1459 > 0) {
			method475();
		} else {
			field1375.method257();
			field1319.method200(144, 257, "Connection lost", 0);
			field1319.method200(143, 256, "Connection lost", 0xFFFFFF);
			field1319.method200(159, 257, "Please wait - attempting to reestablish", 0);
			field1319.method200(158, 256, "Please wait - attempting to reestablish", 0xFFFFFF);
			field1375.method258(4, field9, 4);
			field1230 = 0;
			class5 var1 = field1176;
			field1452 = false;
			method464(field1120, field1121, true);

			if (!field1452) {
				method475();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.m(I)Ljava/net/Socket;")
	public final Socket method450(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public final String method451(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.c(III)V")
	public final void method452(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1162[var4] != null) {
				int var5 = field1160[var4];
				int var6 = field1426 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1161[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1150 == 0 || field1150 == 1 && method455(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1363.field416)) {
						if (field1407 >= 1) {
							field1278[field1261] = "Report abuse @whi@" + var7;
							field1187[field1261] = 524;
							field1261++;
						}

						field1278[field1261] = "Add ignore @whi@" + var7;
						field1187[field1261] = 47;
						field1261++;
						field1278[field1261] = "Add friend @whi@" + var7;
						field1187[field1261] = 605;
						field1261++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1312 == 0 && (var5 == 7 || field1467 == 0 || field1467 == 1 && method455(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1407 >= 1) {
							field1278[field1261] = "Report abuse @whi@" + var7;
							field1187[field1261] = 524;
							field1261++;
						}

						field1278[field1261] = "Add ignore @whi@" + var7;
						field1187[field1261] = 47;
						field1261++;
						field1278[field1261] = "Add friend @whi@" + var7;
						field1187[field1261] = 605;
						field1261++;
					}

					var3++;
				}

				if (var5 == 4 && (field1192 == 0 || field1192 == 1 && method455(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1278[field1261] = "Accept trade @whi@" + var7;
						field1187[field1261] = 507;
						field1261++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1312 == 0 && field1467 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1192 == 0 || field1192 == 1 && method455(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1278[field1261] = "Accept duel @whi@" + var7;
						field1187[field1261] = 957;
						field1261++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method453() {
		field1194.method217(58);

		if (field1172 != -1) {
			field1172 = -1;
			field1394 = true;
			field1252 = false;
			field1284 = true;
		}

		if (field1103 != -1) {
			field1103 = -1;
			field1286 = true;
			field1252 = false;
		}

		field1062 = -1;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method454() {
		if (field1312 != 0) {
			int var1 = 0;
			if (field1130 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1162[var2] != null) {
					int var3 = field1160[var2];
					String var4 = field1161[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1467 == 0 || field1467 == 1 && method455(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1319.method202("From:  " + var4 + field1162[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1407 >= 1) {
									field1278[field1261] = "Report abuse @whi@" + var4;
									field1187[field1261] = 2524;
									field1261++;
								}

								field1278[field1261] = "Add ignore @whi@" + var4;
								field1187[field1261] = 2047;
								field1261++;
								field1278[field1261] = "Add friend @whi@" + var4;
								field1187[field1261] = 2605;
								field1261++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1467 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method7() {
		if (!field1221 && !field1322 && !field1101) {
			field1058++;

			if (field1452) {
				method491();
			} else {
				method429();
			}

			method541();
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method455(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1416; var2++) {
			if (arg0.equalsIgnoreCase(field1354[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1363.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method456() {
		if (field1261 >= 2 || field1215 != 0 || field1245 != 0) {
			String var1;
			if (field1215 == 1 && field1261 < 2) {
				var1 = "Use " + field1219 + " with...";
			} else if (field1245 == 1 && field1261 < 2) {
				var1 = field1248 + "...";
			} else {
				var1 = field1278[field1261 - 1];
			}

			if (field1261 > 2) {
				var1 = var1 + "@whi@ / " + (field1261 - 2) + " more options";
			}

			field1320.method206(true, var1, 15, 0xFFFFFF, field1058 / 1000, 4);
		}
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method457(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.q(I)V")
	public final void method458() {
		try {
			field1359 = -1;
			field1270.method251();
			field1309.method251();
			class34.method166();
			method523();
			field1266.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1282[var1].method356();
			}

			System.gc();
			class3 var2 = new class3(field1371, 104, field1208, 104);
			int var3 = field1189.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1059[var4] >> 8;
				int var6 = field1059[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1266.method51(field1434);
			} else {
				field1266.method51(0);
			}

			field1194.method217(239);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1059[var7] >> 8) * 64 - field1385;
				int var9 = (field1059[var7] & 0xFF) * 64 - field1386;
				byte[] var10 = field1189[var7];
				if (var10 != null) {
					var2.method15(var9, (field1274 - 6) * 8, (field1275 - 6) * 8, var8, var10);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1059[var11] >> 8) * 64 - field1385;
				int var13 = (field1059[var11] & 0xFF) * 64 - field1386;
				byte[] var14 = field1189[var11];
				if (var14 == null && field1275 < 800) {
					var2.method14(64, var13, var12, 64);
				}
			}

			field1194.method217(239);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1430[var15];
				if (var16 != null) {
					int var17 = (field1059[var15] >> 8) * 64 - field1385;
					int var18 = (field1059[var15] & 0xFF) * 64 - field1386;
					var2.method18(var18, var17, var16, field1266, field1282);
				}
			}

			field1194.method217(239);
			var2.method20(field1266, field1282);
			field1375.method257();
			field1194.method217(239);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method546(var19, var20);
				}
			}

			method436();
		} catch (Exception var33) {
		}

		class58.field863.method103();

		if (field1265 && signlink.cache_dat != null) {
			int var22 = field1277.method271(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1277.method276(var23);
				if ((var24 & 0x79) == 0) {
					class31.method124(var23);
				}
			}
		}

		System.gc();
		class34.method167(20);
		field1277.method282();
		int var25 = (field1274 - 6) / 8 - 1;
		int var26 = (field1274 + 6) / 8 + 1;
		int var27 = (field1275 - 6) / 8 - 1;
		int var28 = (field1275 + 6) / 8 + 1;
		if (field1329) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1277.method273(var29, 0, var30);
					if (var31 != -1) {
						field1277.method283(3, var31);
					}

					int var32 = field1277.method273(var29, 1, var30);
					if (var32 != -1) {
						field1277.method283(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method459() {
		for (int var1 = -1; var1 < field1136; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1134;
			} else {
				var2 = field1137[var1];
			}

			class27 var3 = field1135[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1091; var4++) {
			int var5 = field1092[var4];
			class26 var6 = field1090[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1066) {
			field1221 = true;
		} else {
			field1066 = true;
			boolean var1 = false;
			String var2 = method549();
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
						field1295[var3] = new class49(signlink.cache_dat, 500000, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					int var4 = 5;
					field1454[8] = 0;
					while (field1454[8] == 0) {
						method13(20, "Connecting to web server");

						try {
							DataInputStream var5 = method435("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field624, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1454[var7] = var6.method233();
							}

							var5.close();
						} catch (IOException var80) {
							for (int var8 = var4; var8 > 0; var8--) {
								method13(10, "Error loading - Will retry in " + var8 + " secs.");

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

					field1293 = method552("title", 1, "title screen", field1454[1], 25);
					field1318 = new class37(field1293, "p11");
					field1319 = new class37(field1293, "p12");
					field1320 = new class38("b12_full", field1293);
					field1321 = new class37(field1293, "q8");
					method465();
					method525();
					class51 var9 = method552("config", 2, "config", field1454[2], 30);
					class51 var10 = method552("interface", 3, "interface", field1454[3], 35);
					class51 var11 = method552("media", 4, "2d graphics", field1454[4], 40);
					class51 var12 = method552("textures", 6, "textures", field1454[6], 45);
					class51 var13 = method552("wordenc", 7, "chat system", field1454[7], 50);
					class51 var14 = method552("sounds", 8, "sound effects", field1454[8], 55);
					field1208 = new byte[4][104][104];
					field1371 = new int[4][105][105];
					field1266 = new class18(104, 104, field1371, 4);

					for (int var15 = 0; var15 < 4; var15++) {
						field1282[var15] = new class63(104, 104);
					}

					field1232 = new class35(512, 512);
					class51 var16 = method552("versionlist", 5, "update list", field1454[5], 60);
					method13(60, "Connecting to update server");
					field1277 = new class48();
					field1277.method269(var16, this);
					class7.method44(field1277.method272());
					class31.method122(field1277.method271(0), field1277);

					if (!field1265) {
						field1253 = 0;
						field1254 = false;
						field1277.method278(2, field1253);

						while (field1277.method279() > 0) {
							method541();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}
						}
					}

					method13(65, "Requesting animations");
					int var17 = field1277.method271(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1277.method278(1, var18);
					}

					while (field1277.method279() > 0) {
						int var19 = var17 - field1277.method279();
						if (var19 > 0) {
							method13(65, "Loading animations - " + var19 * 100 / var17 + "%");
						}

						method541();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}
					}

					method13(70, "Requesting models");
					int var20 = field1277.method271(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1277.method276(var21);
						if ((var22 & 0x1) != 0) {
							field1277.method278(0, var21);
						}
					}

					int var23 = field1277.method279();
					while (field1277.method279() > 0) {
						int var24 = var23 - field1277.method279();
						if (var24 > 0) {
							method13(70, "Loading models - " + var24 * 100 / var23 + "%");
						}

						method541();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field1295[0] != null) {
						method13(75, "Requesting maps");
						field1277.method278(3, field1277.method273(47, 0, 48));
						field1277.method278(3, field1277.method273(47, 1, 48));
						field1277.method278(3, field1277.method273(48, 0, 48));
						field1277.method278(3, field1277.method273(48, 1, 48));
						field1277.method278(3, field1277.method273(49, 0, 48));
						field1277.method278(3, field1277.method273(49, 1, 48));
						field1277.method278(3, field1277.method273(47, 0, 47));
						field1277.method278(3, field1277.method273(47, 1, 47));
						field1277.method278(3, field1277.method273(48, 0, 47));
						field1277.method278(3, field1277.method273(48, 1, 47));
						field1277.method278(3, field1277.method273(48, 0, 148));
						field1277.method278(3, field1277.method273(48, 1, 148));
						int var25 = field1277.method279();
						while (field1277.method279() > 0) {
							int var26 = var25 - field1277.method279();
							if (var26 > 0) {
								method13(75, "Loading maps - " + var26 * 100 / var25 + "%");
							}

							method541();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var27 = field1277.method271(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1277.method276(var28);
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
							field1277.method281(var28, var30, 0);
						}
					}

					field1277.method274(field1264);

					if (!field1265) {
						int var31 = field1277.method271(2);
						for (int var32 = 1; var32 < var31; var32++) {
							if (field1277.method277(var32)) {
								field1277.method281(var32, (byte) 1, 2);
							}
						}
					}

					method13(80, "Unpacking media");
					field1249 = new class36(var11, "invback", 0);
					field1251 = new class36(var11, "chatback", 0);
					field1250 = new class36(var11, "mapback", 0);
					field1289 = new class36(var11, "backbase1", 0);
					field1290 = new class36(var11, "backbase2", 0);
					field1291 = new class36(var11, "backhmid1", 0);

					for (int var33 = 0; var33 < 13; var33++) {
						field1267[var33] = new class36(var11, "sideicons", var33);
					}

					field1174 = new class35(var11, "compass", 0);
					field1143 = new class35(var11, "mapedge", 0);
					field1143.method182();

					try {
						for (int var34 = 0; var34 < 50; var34++) {
							field1149[var34] = new class36(var11, "mapscene", var34);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var35 = 0; var35 < 50; var35++) {
							field1067[var35] = new class35(var11, "mapfunction", var35);
						}
					} catch (Exception var78) {
					}

					try {
						for (int var36 = 0; var36 < 20; var36++) {
							field1423[var36] = new class35(var11, "hitmarks", var36);
						}
					} catch (Exception var77) {
					}

					try {
						for (int var37 = 0; var37 < 20; var37++) {
							field1106[var37] = new class35(var11, "headicons", var37);
						}
					} catch (Exception var76) {
					}

					field1052 = new class35(var11, "mapmarker", 0);
					field1053 = new class35(var11, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field1405[var38] = new class35(var11, "cross", var38);
					}

					field1156 = new class35(var11, "mapdots", 0);
					field1157 = new class35(var11, "mapdots", 1);
					field1158 = new class35(var11, "mapdots", 2);
					field1159 = new class35(var11, "mapdots", 3);
					field1117 = new class36(var11, "scrollbar", 0);
					field1118 = new class36(var11, "scrollbar", 1);
					field1364 = new class36(var11, "redstone1", 0);
					field1365 = new class36(var11, "redstone2", 0);
					field1366 = new class36(var11, "redstone3", 0);
					field1367 = new class36(var11, "redstone1", 0);
					field1367.method195();
					field1368 = new class36(var11, "redstone2", 0);
					field1368.method195();
					field1069 = new class36(var11, "redstone1", 0);
					field1069.method196();
					field1070 = new class36(var11, "redstone2", 0);
					field1070.method196();
					field1071 = new class36(var11, "redstone3", 0);
					field1071.method196();
					field1072 = new class36(var11, "redstone1", 0);
					field1072.method195();
					field1072.method196();
					field1073 = new class36(var11, "redstone2", 0);
					field1073.method195();
					field1073.method196();

					for (int var39 = 0; var39 < 2; var39++) {
						field1152[var39] = new class36(var11, "mod_icons", var39);
					}

					class35 var40 = new class35(var11, "backleft1", 0);
					field1296 = new class44(var40.field591, var40.field592, method11());
					var40.method183(0, 0);
					class35 var41 = new class35(var11, "backleft2", 0);
					field1297 = new class44(var41.field591, var41.field592, method11());
					var41.method183(0, 0);
					class35 var42 = new class35(var11, "backright1", 0);
					field1298 = new class44(var42.field591, var42.field592, method11());
					var42.method183(0, 0);
					class35 var43 = new class35(var11, "backright2", 0);
					field1299 = new class44(var43.field591, var43.field592, method11());
					var43.method183(0, 0);
					class35 var44 = new class35(var11, "backtop1", 0);
					field1300 = new class44(var44.field591, var44.field592, method11());
					var44.method183(0, 0);
					class35 var45 = new class35(var11, "backvmid1", 0);
					field1301 = new class44(var45.field591, var45.field592, method11());
					var45.method183(0, 0);
					class35 var46 = new class35(var11, "backvmid2", 0);
					field1302 = new class44(var46.field591, var46.field592, method11());
					var46.method183(0, 0);
					class35 var47 = new class35(var11, "backvmid3", 0);
					field1303 = new class44(var47.field591, var47.field592, method11());
					var47.method183(0, 0);
					class35 var48 = new class35(var11, "backhmid2", 0);
					field1304 = new class44(var48.field591, var48.field592, method11());
					var48.method183(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 50; var53++) {
						if (field1067[var53] != null) {
							field1067[var53].method181(var51 + var52, var49 + var52, var50 + var52);
						}

						if (field1149[var53] != null) {
							field1149[var53].method197(var51 + var52, var49 + var52, var50 + var52);
						}
					}

					method13(83, "Unpacking textures");
					class34.method168(var12);
					class34.method172(0.8D);
					class34.method167(20);
					method13(86, "Unpacking config");
					class67.method378(var9);
					class58.method327(var9);
					class64.method368(var9);
					class61.method343(var9);
					class60.method337(var9);
					class65.method372(var9);
					class69.method381(var9);
					class71.method386(var9);
					class70.method384(var9);
					class61.field908 = field1264;

					if (!field1265) {
						method13(90, "Unpacking sounds");
						byte[] var54 = var14.method298("sounds.dat", null);
						class39 var55 = new class39(var54);
						class56.method317(var55);
					}

					method13(95, "Unpacking interfaces");
					class37[] var56 = new class37[] { field1318, field1319, field1320, field1321 };
					class4.method32(var56, var10, var11);
					method13(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field1250.field597[field1250.field599 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field1397[var57] = var58;
						field1427[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field1250.field597[field1250.field599 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field1377[var61 - 5] = var62 - 25;
						field1433[var61 - 5] = var63 - var62;
					}

					class34.method165(96, 479);
					field1342 = class34.field578;
					class34.method165(261, 190);
					field1343 = class34.field578;
					class34.method165(334, 512);
					field1344 = class34.field578;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = class34.field576[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					class18.method86(800, 334, 512, var65, 500);
					class72.method388(var13);
					field1099 = new class59(this);
					method12(field1099, 10);
				} catch (Exception var81) {
					signlink.reporterror("loaderror " + field1074 + " " + field1051);
					field1322 = true;
				}
			} else {
				field1101 = true;
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method460(long arg0) {
		if (arg0 != 0L) {
			if (field1305 >= 100) {
				method539("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = class52.method303(class52.method300(arg0));
				for (int var4 = 0; var4 < field1305; var4++) {
					if (field1177[var4] == arg0) {
						method539(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1416; var5++) {
					if (field1098[var5] == arg0) {
						method539("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field1177[field1305++] = arg0;
				field1394 = true;
				field1194.method217(189);
				field1194.method224(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IBLmb;)V")
	public final void method461(int arg0, class39 arg1) {
		field1279 = 0;
		field1138 = 0;
		method488(arg1, arg0);
		method511(arg0, arg1);
		method438(arg0, arg1);

		for (int var3 = 0; var3 < field1279; var3++) {
			int var4 = field1280[var3];
			if (field1058 != field1090[var4].field405) {
				field1090[var4].field415 = null;
				field1090[var4] = null;
			}
		}

		if (arg1.field625 != arg0) {
			signlink.reporterror(field1120 + " size mismatch in getnpcpos - pos:" + arg1.field625 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1091; var5++) {
			if (field1090[field1092[var5]] == null) {
				signlink.reporterror(field1120 + " null entry in npc list - pos:" + var5 + " size:" + field1091);
				throw new RuntimeException("eek");
			}
		}
	}

	public final void init() {
		field1262 = Integer.parseInt(getParameter("nodeid"));
		field1263 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method518();
		} else {
			method536();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1264 = false;
		} else {
			field1264 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.r(I)V")
	public final void method462() {
		for (int var1 = 0; var1 < field1190; var1++) {
			if (field1429[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1415[var1] != field1400 || field1276[var1] != field1242) {
						class39 var3 = class56.method318(field1415[var1], field1276[var1]);
						if (System.currentTimeMillis() + var3.field625 / 22 > field1358 / 22 + field1244) {
							field1358 = var3.field625;
							field1244 = System.currentTimeMillis();

							if (method457(var3.field624, var3.field625)) {
								field1400 = field1415[var1];
								field1242 = field1276[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method445()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1429[var1] != -5) {
					field1429[var1] = -5;
				} else {
					field1190--;
					for (int var5 = var1; var5 < field1190; var5++) {
						field1415[var5] = field1415[var5 + 1];
						field1276[var5] = field1276[var5 + 1];
						field1429[var5] = field1429[var5 + 1];
					}

					var1--;
				}
			} else {
				field1429[var1]--;
			}
		}

		if (field1097 > 0) {
			field1097 -= 20;
			if (field1097 < 0) {
				field1097 = 0;
			}

			if (field1097 == 0 && field1165 && !field1265) {
				field1253 = field1355;
				field1254 = false;
				field1277.method278(2, field1253);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method463(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method464(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1233 = "";
				field1234 = "Connecting to server...";
				method428(true);
			}

			field1176 = new class5(this, method450(field1263 + 43594));
			long var4 = class52.method299(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1194.field625 = 0;
			field1194.method218(14);
			field1194.method218(var6);
			field1176.method42(2, field1194.field624, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field1176.method39();
			}

			int var8 = field1176.method39();
			if (var8 == 0) {
				field1176.method41(field1193.field624, 0, 8);
				field1193.field625 = 0;
				field1384 = field1193.method234();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1384 >> 32), (int) field1384 };
				field1194.field625 = 0;
				field1194.method218(10);
				field1194.method222(var9[0]);
				field1194.method222(var9[1]);
				field1194.method222(var9[2]);
				field1194.method222(var9[3]);
				field1194.method222(signlink.uid);
				field1194.method225(arg0);
				field1194.method225(arg1);
				field1194.method243(field1054, field1175);
				field1114.field625 = 0;

				if (arg2) {
					field1114.method218(18);
				} else {
					field1114.method218(16);
				}

				field1114.method218(field1194.field625 + 36 + 1 + 1 + 2);
				field1114.method218(255);
				field1114.method219(257);
				field1114.method218(field1265 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1114.method222(field1454[var10]);
				}

				field1114.method226(0, field1194.field624, field1194.field625);
				field1194.field629 = new class50(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1330 = new class50(var9);
				field1176.method42(field1114.field625, field1114.field624, 0);
				var8 = field1176.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}

				method464(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1407 = field1176.method39();
				field1076 = field1176.method39() == 1;
				field1406 = 0L;
				field1122 = 0;
				field1099.field868 = 0;
				field14 = true;
				field1227 = true;
				field1452 = true;
				field1194.field625 = 0;
				field1193.field625 = 0;
				field1456 = -1;
				field1055 = -1;
				field1056 = -1;
				field1057 = -1;
				field1455 = 0;
				field1457 = 0;
				field1130 = 0;
				field1459 = 0;
				field1065 = 0;
				field1261 = 0;
				field1173 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1162[var12] = null;
				}

				field1215 = 0;
				field1245 = 0;
				field1288 = 0;
				field1190 = 0;
				field1126 = (int) (Math.random() * 100.0D) - 50;
				field1424 = (int) (Math.random() * 110.0D) - 55;
				field1223 = (int) (Math.random() * 80.0D) - 40;
				field1360 = (int) (Math.random() * 120.0D) - 60;
				field1389 = (int) (Math.random() * 30.0D) - 20;
				field1315 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1359 = -1;
				field1230 = 0;
				field1231 = 0;
				field1136 = 0;
				field1091 = 0;

				for (int var13 = 0; var13 < field1133; var13++) {
					field1135[var13] = null;
					field1140[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					field1090[var14] = null;
				}

				field1363 = field1135[field1134] = new class27();
				field1309.method251();
				field1270.method251();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1100[var15][var16][var17] = null;
						}
					}
				}

				field1399 = new class42();
				field1417 = 0;
				field1416 = 0;
				field1306 = -1;
				field1103 = -1;
				field1062 = -1;
				field1172 = -1;
				field1124 = -1;
				field1252 = false;
				field1237 = 3;
				field1311 = false;
				field1173 = false;
				field1450 = false;
				field1068 = null;
				field1413 = 0;
				field1075 = -1;
				field1313 = true;
				method513();

				for (int var18 = 0; var18 < 5; var18++) {
					field1123[var18] = 0;
				}

				for (int var19 = 0; var19 < 5; var19++) {
					field1348[var19] = null;
					field1349[var19] = false;
				}

				field1431 = 0;
				field1362 = 0;
				field1104 = 0;
				field1273 = 0;
				field1145 = 0;
				field1094 = 0;
				field1064 = 0;
				field1391 = 0;
				field1269 = 0;
				method441();
			} else if (var8 == 3) {
				field1233 = "";
				field1234 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1233 = "Your account has been disabled.";
				field1234 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1233 = "Your account is already logged in.";
				field1234 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1233 = "RuneScape has been updated!";
				field1234 = "Please reload this page.";
			} else if (var8 == 7) {
				field1233 = "This world is full.";
				field1234 = "Please use a different world.";
			} else if (var8 == 8) {
				field1233 = "Unable to connect.";
				field1234 = "Login server offline.";
			} else if (var8 == 9) {
				field1233 = "Login limit exceeded.";
				field1234 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1233 = "Unable to connect.";
				field1234 = "Bad session id.";
			} else if (var8 == 11) {
				field1234 = "Login server rejected session.";
				field1234 = "Please try again.";
			} else if (var8 == 12) {
				field1233 = "You need a members account to login to this world.";
				field1234 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1233 = "Could not complete login.";
				field1234 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1233 = "The server is being updated.";
				field1234 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1452 = true;
				field1194.field625 = 0;
				field1193.field625 = 0;
				field1456 = -1;
				field1055 = -1;
				field1056 = -1;
				field1057 = -1;
				field1455 = 0;
				field1457 = 0;
				field1130 = 0;
				field1261 = 0;
				field1173 = false;
				field1119 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1233 = "Login attempts exceeded.";
				field1234 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1233 = "You are standing in a members-only area.";
				field1234 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1233 = "Invalid loginserver requested";
				field1234 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = field1176.method39(); var20 >= 0; var20--) {
					field1233 = "You have only just left another world";
					field1234 = "Your profile will be transfered in: " + var20 + " seconds";
					method428(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				method464(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1233 = "No response from server";
				field1234 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1233 = "Unexpected server response";
				field1234 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			field1233 = "";
			field1234 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method465() {
		byte[] var1 = field1293.method298("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1336.method257();
		var2.method183(0, 0);
		field1337.method257();
		var2.method183(0, -637);
		field1333.method257();
		var2.method183(0, -128);
		field1334.method257();
		var2.method183(-371, -202);
		field1335.method257();
		var2.method183(-171, -202);
		field1338.method257();
		var2.method183(-265, 0);
		field1339.method257();
		var2.method183(-265, -562);
		field1340.method257();
		var2.method183(-171, -128);
		field1341.method257();
		var2.method183(-171, -562);
		int[] var3 = new int[var2.field591];
		for (int var4 = 0; var4 < var2.field592; var4++) {
			for (int var5 = 0; var5 < var2.field591; var5++) {
				var3[var5] = var2.field590[var2.field591 * var4 + var2.field591 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field591; var6++) {
				var2.field590[var2.field591 * var4 + var6] = var3[var6];
			}
		}

		field1336.method257();
		var2.method183(0, 382);
		field1337.method257();
		var2.method183(0, -255);
		field1333.method257();
		var2.method183(0, 254);
		field1334.method257();
		var2.method183(-371, 180);
		field1335.method257();
		var2.method183(-171, 180);
		field1338.method257();
		var2.method183(-265, 382);
		field1339.method257();
		var2.method183(-265, -180);
		field1340.method257();
		var2.method183(-171, 254);
		field1341.method257();
		var2.method183(-171, -180);
		class35 var7 = new class35(field1293, "logo", 0);
		field1333.method257();
		var7.method185(382 - var7.field591 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.s(I)V")
	public final void method466() {
		if (field1333 == null) {
			field10 = null;
			field1376 = null;
			field1374 = null;
			field1373 = null;
			field1375 = null;
			field1380 = null;
			field1381 = null;
			field1382 = null;
			field1336 = new class44(128, 265, method11());
			class33.method154();
			field1337 = new class44(128, 265, method11());
			class33.method154();
			field1333 = new class44(509, 171, method11());
			class33.method154();
			field1334 = new class44(360, 132, method11());
			class33.method154();
			field1335 = new class44(360, 200, method11());
			class33.method154();
			field1338 = new class44(202, 238, method11());
			class33.method154();
			field1339 = new class44(203, 238, method11());
			class33.method154();
			field1340 = new class44(74, 94, method11());
			class33.method154();
			field1341 = new class44(75, 94, method11());
			class33.method154();

			if (field1293 != null) {
				method465();
				method525();
			}

			field1210 = true;
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method467() {
		for (class32 var1 = (class32) field1270.method247(); var1 != null; var1 = (class32) field1270.method249()) {
			if (field1434 != var1.field550 || var1.field556) {
				var1.method106();
			} else if (field1058 >= var1.field549) {
				var1.method150(field1166);

				if (var1.field556) {
					var1.method106();
				} else {
					field1266.method61(var1.field550, var1.field551, var1, var1.field553, false, var1.field552, 0, 60, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method468() {
		int var1 = field1320.method202("Choose Option");
		for (int var2 = 0; var2 < field1261; var2++) {
			int var3 = field1320.method202(field1278[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1261 * 15 + 21;
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

			field1173 = true;
			field1445 = 0;
			field1446 = var5;
			field1447 = var6;
			field1448 = var1;
			field1449 = field1261 * 15 + 22;
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

			field1173 = true;
			field1445 = 1;
			field1446 = var7;
			field1447 = var8;
			field1448 = var1;
			field1449 = field1261 * 15 + 22;
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

			field1173 = true;
			field1445 = 2;
			field1446 = var9;
			field1447 = var10;
			field1448 = var1;
			field1449 = field1261 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(ILd;)V")
	public final void method469(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1417 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1417 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1417 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1416;
				if (field1417 != 2) {
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
					arg0.field97 = field1354[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1416;
			if (field1417 != 2) {
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
				if (field1241[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1241[var2] == field1262) {
					arg0.field97 = "@gre@World-" + (field1241[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1241[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1416;
			if (field1417 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1305) {
				arg0.field97 = "";
				arg0.field64 = 0;
			} else {
				arg0.field97 = class52.method303(class52.method300(field1177[var2]));
				arg0.field64 = 1;
			}
		} else if (var2 == 503) {
			arg0.field75 = field1305 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1058 / 40.0D) * 256.0D) & 0x7FF;

			if (field1328) {
				for (int var6 = 0; var6 < 7; var6++) {
					int var7 = field1383[var6];
					if (var7 >= 0 && !class65.field971[var7].method374()) {
						return;
					}
				}

				field1328 = false;
				class31[] var8 = new class31[7];
				int var9 = 0;
				for (int var10 = 0; var10 < 7; var10++) {
					int var11 = field1383[var10];
					if (var11 >= 0) {
						var8[var9++] = class65.field971[var11].method375();
					}
				}

				class31 var12 = new class31(var8, var9);
				for (int var13 = 0; var13 < 5; var13++) {
					if (field1123[var13] != 0) {
						var12.method139(field1063[var13][0], field1063[var13][field1123[var13]]);

						if (var13 == 1) {
							var12.method139(field1281[0], field1281[field1123[var13]]);
						}
					}
				}

				var12.method132();
				var12.method133(class67.field991[field1363.field365].field993[0]);
				var12.method142(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(0, var12, 5);
			}
		} else if (var2 == 324) {
			if (field1087 == null) {
				field1087 = arg0.field103;
				field1088 = arg0.field104;
			}

			if (field1313) {
				arg0.field103 = field1088;
			} else {
				arg0.field103 = field1087;
			}
		} else if (var2 == 325) {
			if (field1087 == null) {
				field1087 = arg0.field103;
				field1088 = arg0.field104;
			}

			if (field1313) {
				arg0.field103 = field1087;
			} else {
				arg0.field103 = field1088;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1285;
			if (field1058 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1407 < 1) {
				arg0.field97 = "";
			} else if (field1255) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1307 == 0) {
				arg0.field97 = "";
			} else {
				String var14;
				if (field1372 == 0) {
					var14 = "earlier today";
				} else if (field1372 == 1) {
					var14 = "yesterday";
				} else {
					var14 = field1372 + " days ago";
				}

				arg0.field97 = "You last logged in " + var14 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1461 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1461 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1461 > 1) {
				arg0.field97 = field1461 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1222 == 201) {
				if (field1460 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1222 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var15;
				if (field1222 == 0) {
					var15 = "Earlier today";
				} else if (field1222 == 1) {
					var15 = "Yesterday";
				} else {
					var15 = field1222 + " days ago";
				}

				arg0.field97 = var15 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1222 == 201) {
				if (field1460 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1222 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1222 == 201) {
				if (field1460 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1222 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method470(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(Lmb;II)V")
	public final void method471(class39 arg0, int arg1) {
		field1279 = 0;
		field1138 = 0;
		method474(arg0, arg1);
		method527(arg0, arg1);
		method506(arg1, arg0);
		method505(arg0, arg1);

		for (int var3 = 0; var3 < field1279; var3++) {
			int var4 = field1280[var3];
			if (field1058 != field1135[var4].field405) {
				field1135[var4] = null;
			}
		}

		if (arg0.field625 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field625 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1136; var5++) {
			if (field1135[field1137[var5]] == null) {
				signlink.reporterror(field1120 + " null entry in pl list - pos:" + var5 + " size:" + field1136);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(BJ)V")
	public final void method472(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1305; var3++) {
				if (field1177[var3] == arg0) {
					field1305--;
					field1394 = true;

					for (int var4 = var3; var4 < field1305; var4++) {
						field1177[var4] = field1177[var4 + 1];
					}

					field1194.method217(193);
					field1194.method224(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method473() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1179[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1179[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1180[var10] = (field1179[var10 - 1] + field1179[var10 + 1] + field1179[var10 - 128] + field1179[var10 + 128]) / 4;
			}
		}

		field1268 += 128;
		if (field1268 > field1205.length) {
			field1268 -= field1205.length;
			int var11 = (int) (Math.random() * 12.0D);
			method519(field1125[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1180[var14 + 128] - field1205[field1268 + var14 & field1205.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1179[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1146[var16] = field1146[var16 + 1];
		}

		field1146[var1 - 1] = (int) (Math.sin(field1058 / 14.0D) * 16.0D + Math.sin(field1058 / 15.0D) * 14.0D + Math.sin(field1058 / 16.0D) * 12.0D);

		if (field1183 > 0) {
			field1183 -= 4;
		}

		if (field1184 > 0) {
			field1184 -= 4;
		}

		if (field1183 == 0 && field1184 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1183 = 1024;
			}

			if (var17 == 1) {
				field1184 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method474(class39 arg0, int arg1) {
		arg0.method238();
		int var3 = arg0.method239(1);
		if (var3 != 0) {
			int var4 = arg0.method239(2);
			if (var4 == 0) {
				field1139[field1138++] = field1134;
			} else if (var4 == 1) {
				int var5 = arg0.method239(3);
				field1363.method111(var5, false);
				int var6 = arg0.method239(1);
				if (var6 == 1) {
					field1139[field1138++] = field1134;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method239(3);
				field1363.method111(var7, true);
				int var8 = arg0.method239(3);
				field1363.method111(var8, true);
				int var9 = arg0.method239(1);
				if (var9 == 1) {
					field1139[field1138++] = field1134;
				}
			} else if (var4 == 3) {
				field1434 = arg0.method239(2);
				int var10 = arg0.method239(7);
				int var11 = arg0.method239(7);
				int var12 = arg0.method239(1);
				field1363.method110(var12 == 1, var11, var10);
				int var13 = arg0.method239(1);
				if (var13 == 1) {
					field1139[field1138++] = field1134;
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method475() {
		try {
			if (field1176 != null) {
				field1176.method38();
			}
		} catch (Exception var2) {
		}

		field1176 = null;
		field1452 = false;
		field1308 = 0;
		field1120 = "";
		field1121 = "";
		method523();
		field1266.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1282[var1].method356();
		}

		System.gc();
		method509();
		field1355 = -1;
		field1253 = -1;
		field1097 = 0;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method476(int arg0) {
		int var2 = class71.field1030[arg0].field1038;
		if (var2 != 0) {
			int var3 = field1353[arg0];
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

				class61.field949.method103();
				field1210 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1165;

				if (var3 == 0) {
					method463(0, field1165);
					field1165 = true;
				}

				if (var3 == 1) {
					method463(-400, field1165);
					field1165 = true;
				}

				if (var3 == 2) {
					method463(-800, field1165);
					field1165 = true;
				}

				if (var3 == 3) {
					method463(-1200, field1165);
					field1165 = true;
				}

				if (var3 == 4) {
					field1165 = false;
				}

				if (field1165 != var4 && !field1265) {
					if (field1165) {
						field1253 = field1355;
						field1254 = false;
						field1277.method278(2, field1253);
					} else {
						method509();
					}

					field1097 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1096 = true;
					method470(0);
				}

				if (var3 == 1) {
					field1096 = true;
					method470(-400);
				}

				if (var3 == 2) {
					field1096 = true;
					method470(-800);
				}

				if (var3 == 3) {
					field1096 = true;
					method470(-1200);
				}

				if (var3 == 4) {
					field1096 = false;
				}
			}

			if (var2 == 5) {
				field1259 = var3;
			}

			if (var2 == 6) {
				field1213 = var3;
			}

			if (var2 == 8) {
				field1312 = var3;
				field1286 = true;
			}

			if (var2 == 9) {
				field1164 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(ILob;)V")
	public final void method477(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field643 == 0) {
			var2 = field1266.method76(arg0.field642, arg0.field644, arg0.field645);
		}

		if (arg0.field643 == 1) {
			var2 = field1266.method77(arg0.field644, arg0.field642, arg0.field645);
		}

		if (arg0.field643 == 2) {
			var2 = field1266.method78(arg0.field642, arg0.field644, arg0.field645);
		}

		if (arg0.field643 == 3) {
			var2 = field1266.method79(arg0.field642, arg0.field644, arg0.field645);
		}

		if (var2 != 0) {
			int var6 = field1266.method80(arg0.field642, arg0.field644, arg0.field645, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field646 = var3;
		arg0.field648 = var4;
		arg0.field647 = var5;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method13(int arg0, String arg1) {
		field1051 = arg0;
		field1074 = arg1;
		method466();

		if (field1293 == null) {
			super.method13(arg0, arg1);
		} else {
			field1335.method257();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1320.method200(var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class33.method157(var3 / 2 - 152, 304, 34, var6, 0x8C1111);
			class33.method157(var3 / 2 - 151, 302, 32, var6 + 1, 0);
			class33.method156(arg0 * 3, 0x8C1111, var6 + 2, 30, var3 / 2 - 150);
			class33.method156(300 - arg0 * 3, 0, var6 + 2, 30, arg0 * 3 + var3 / 2 - 150);
			field1320.method200(var4 / 2 + 5 - var5, var3 / 2, arg1, 0xFFFFFF);
			field1335.method258(171, field9, 202);

			if (field1210) {
				field1210 = false;

				if (!field1141) {
					field1336.method258(0, field9, 0);
					field1337.method258(0, field9, 637);
				}

				field1333.method258(0, field9, 128);
				field1334.method258(371, field9, 202);
				field1338.method258(265, field9, 0);
				field1339.method258(265, field9, 562);
				field1340.method258(171, field9, 128);
				field1341.method258(171, field9, 562);
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method478() {
		for (int var1 = -1; var1 < field1136; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1134;
			} else {
				var2 = field1137[var1];
			}

			class27 var3 = field1135[var2];
			if (var3 != null) {
				method493(1, var3);
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method479() {
		field1374.method257();
		int var1 = field1360 + field1315 & 0x7FF;
		int var2 = field1363.field360 / 32 + 48;
		int var3 = 464 - field1363.field361 / 32;
		field1232.method189(field1389 + 256, var1, var2, var3, field1377, 146, field1433, 5, 25, 151);
		field1174.method189(256, field1315, 25, 25, field1397, 33, field1427, 0, 0, 33);

		for (int var4 = 0; var4 < field1195; var4++) {
			int var5 = field1196[var4] * 4 + 2 - field1363.field360 / 32;
			int var6 = field1197[var4] * 4 + 2 - field1363.field361 / 32;
			method550(var6, field1207[var4], var5);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1100[field1434][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1363.field360 / 32;
					int var11 = var8 * 4 + 2 - field1363.field361 / 32;
					method550(var11, field1156, var10);
				}
			}
		}

		for (int var12 = 0; var12 < field1091; var12++) {
			class26 var13 = field1090[field1092[var12]];
			if (var13 != null && var13.method113() && var13.field415.field893) {
				int var14 = var13.field360 / 32 - field1363.field360 / 32;
				int var15 = var13.field361 / 32 - field1363.field361 / 32;
				method550(var15, field1157, var14);
			}
		}

		for (int var16 = 0; var16 < field1136; var16++) {
			class27 var17 = field1135[field1137[var16]];
			if (var17 != null && var17.method113()) {
				int var18 = var17.field360 / 32 - field1363.field360 / 32;
				int var19 = var17.field361 / 32 - field1363.field361 / 32;
				boolean var20 = false;
				long var21 = class52.method299(var17.field416);
				for (int var23 = 0; var23 < field1416; var23++) {
					if (field1098[var23] == var21 && field1241[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method550(var19, field1159, var18);
				} else {
					method550(var19, field1158, var18);
				}
			}
		}

		if (field1065 != 0 && field1058 % 20 < 10) {
			if (field1065 == 1 && field1432 >= 0 && field1432 < field1090.length) {
				class26 var24 = field1090[field1432];
				if (var24 != null) {
					int var25 = var24.field360 / 32 - field1363.field360 / 32;
					int var26 = var24.field361 / 32 - field1363.field361 / 32;
					method486(var26, field1053, var25);
				}
			}

			if (field1065 == 2) {
				int var27 = (field1462 - field1385) * 4 + 2 - field1363.field360 / 32;
				int var28 = (field1463 - field1386) * 4 + 2 - field1363.field361 / 32;
				method486(var28, field1053, var27);
			}

			if (field1065 == 10 && field1398 >= 0 && field1398 < field1135.length) {
				class27 var29 = field1135[field1398];
				if (var29 != null) {
					int var30 = var29.field360 / 32 - field1363.field360 / 32;
					int var31 = var29.field361 / 32 - field1363.field361 / 32;
					method486(var31, field1053, var30);
				}
			}
		}

		if (field1230 != 0) {
			int var32 = field1230 * 4 + 2 - field1363.field360 / 32;
			int var33 = field1231 * 4 + 2 - field1363.field361 / 32;
			method550(var33, field1052, var32);
		}

		class33.method156(3, 0xFFFFFF, 78, 3, 97);
		field1375.method257();
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method480() {
		field1142 = 0;
		int var1 = (field1363.field360 >> 7) + field1385;
		int var2 = (field1363.field361 >> 7) + field1386;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1142 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1142 = 1;
		}

		if (field1142 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1142 = 0;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method481() {
		if (field1265 && field1288 == 2 && class3.field33 != field1434) {
			field1375.method257();
			field1319.method200(151, 257, "Loading - please wait.", 0);
			field1319.method200(150, 256, "Loading - please wait.", 0xFFFFFF);
			field1375.method258(4, field9, 4);
			field1288 = 1;
			field1119 = System.currentTimeMillis();
		}

		if (field1288 == 1) {
			int var1 = method482();
			if (var1 != 0 && System.currentTimeMillis() - field1119 > 360000L) {
				signlink.reporterror(field1120 + " glcfb " + field1384 + "," + var1 + "," + field1265 + "," + field1295[0] + "," + field1277.method279() + "," + field1434 + "," + field1274 + "," + field1275);
				field1119 = System.currentTimeMillis();
			}
		}

		if (field1288 == 2 && field1434 != field1359) {
			field1359 = field1434;
			method542(field1434);
		}
	}

	@ObfuscatedName("client.f(B)I")
	public final int method482() {
		for (int var1 = 0; var1 < field1189.length; var1++) {
			if (field1189[var1] == null && field1060[var1] != -1) {
				return -1;
			}

			if (field1430[var1] == null && field1061[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1189.length; var3++) {
			byte[] var4 = field1430[var3];
			if (var4 != null) {
				int var5 = (field1059[var3] >> 8) * 64 - field1385;
				int var6 = (field1059[var3] & 0xFF) * 64 - field1386;
				var2 &= class3.method16(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1292) {
			return -4;
		} else {
			field1288 = 2;
			class3.field33 = field1434;
			method458();
			field1194.method217(134);
			return 0;
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method483(int arg0) {
		if (arg0 >= 0) {
			if (field1311) {
				field1311 = false;
				field1286 = true;
			}

			int var2 = field1185[arg0];
			int var3 = field1186[arg0];
			int var4 = field1187[arg0];
			int var5 = field1188[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 902) {
				String var6 = field1278[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = class52.method299(var6.substring(var7 + 5).trim());
					int var10 = -1;
					for (int var11 = 0; var11 < field1416; var11++) {
						if (field1098[var11] == var8) {
							var10 = var11;
							break;
						}
					}

					if (var10 != -1 && field1241[var10] > 0) {
						field1286 = true;
						field1311 = false;
						field1450 = true;
						field1225 = "";
						field1332 = 3;
						field1351 = field1098[var10];
						field1369 = "Enter message to send to " + field1354[var10];
					}
				}
			}

			if (var4 == 357) {
				method540(var3, var5, 87, var2);
			}

			if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
				if (var4 == 555) {
					field1194.method217(59);
				}

				if (var4 == 354) {
					field1194.method217(62);
				}

				if (var4 == 113) {
					field1194.method217(70);
				}

				if (var4 == 582) {
					if ((var5 & 0x3) == 0) {
						field1094++;
					}

					if (field1094 >= 133) {
						field1194.method217(131);
						field1194.method219(6118);
					}

					field1194.method217(181);
				}

				if (var4 == 331) {
					field1194.method217(160);
				}

				field1194.method219(var5);
				field1194.method219(var2);
				field1194.method219(var3);
				field1401 = 0;
				field1402 = var3;
				field1403 = var2;
				field1404 = 2;
				if (class4.field56[var3].field62 == field1062) {
					field1404 = 1;
				}

				if (class4.field56[var3].field62 == field1103) {
					field1404 = 3;
				}
			}

			if (var4 == 899 && method540(var3, var5, 26, var2)) {
				field1194.method219(field1246);
			}

			if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
				class27 var12 = field1135[var5];
				if (var12 != null) {
					method437(field1363.field411[0], var12.field410[0], false, 0, 0, field1363.field410[0], var12.field411[0], 1, 1, 0, 2);
					field1168 = field24;
					field1169 = field25;
					field1171 = 2;
					field1170 = 0;

					if (var4 == 185) {
						field1194.method217(230);
					}

					if (var4 == 387) {
						field1145 += var5;
						if (field1145 >= 66) {
							field1194.method217(233);
							field1194.method218(154);
						}

						field1194.method217(72);
					}

					if (var4 == 27) {
						field1194.method217(18);
					}

					if (var4 == 499) {
						field1194.method217(17);
					}

					if (var4 == 639) {
						field1273++;
						if (field1273 >= 52) {
							field1194.method217(121);
							field1194.method218(131);
						}

						field1194.method217(192);
					}

					field1194.method219(var5);
				}
			}

			if (var4 == 829) {
				class26 var13 = field1090[var5];
				if (var13 != null) {
					method437(field1363.field411[0], var13.field410[0], false, 0, 0, field1363.field410[0], var13.field411[0], 1, 1, 0, 2);
					field1168 = field24;
					field1169 = field25;
					field1171 = 2;
					field1170 = 0;
					field1194.method217(119);
					field1194.method219(var5);
					field1194.method219(field1218);
					field1194.method219(field1216);
					field1194.method219(field1217);
				}
			}

			if (var4 == 1328) {
				class61 var14 = class61.method345(var5);
				class4 var15 = class4.field56[var3];
				String var16;
				if (var15 != null && var15.field58[var2] >= 100000) {
					var16 = var15.field58[var2] + " x " + var14.field911;
				} else if (var14.field912 == null) {
					var16 = "It's a " + var14.field911 + ".";
				} else {
					var16 = new String(var14.field912);
				}

				method539(var16, "", 0);
			}

			if (var4 == 102) {
				field1215 = 1;
				field1216 = var2;
				field1217 = var3;
				field1218 = var5;
				field1219 = class61.method345(var5).field911;
				field1245 = 0;
				field1394 = true;
			} else {
				if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
					class26 var17 = field1090[var5];
					if (var17 != null) {
						method437(field1363.field411[0], var17.field410[0], false, 0, 0, field1363.field410[0], var17.field411[0], 1, 1, 0, 2);
						field1168 = field24;
						field1169 = field25;
						field1171 = 2;
						field1170 = 0;

						if (var4 == 852) {
							field1194.method217(122);
						}

						if (var4 == 242) {
							field1194.method217(143);
						}

						if (var4 == 309) {
							field1194.method217(69);
						}

						if (var4 == 793) {
							field1194.method217(118);
						}

						if (var4 == 209) {
							field1194.method217(195);
						}

						field1194.method219(var5);
					}
				}

				if (var4 == 718) {
					if (field1173) {
						field1266.method88(var3 - 4, var2 - 4);
					} else {
						field1266.method88(field25 - 4, field24 - 4);
					}
				}

				if (var4 == 743) {
					field1362++;
					if (field1362 >= 124) {
						field1194.method217(77);
						field1194.method219(37954);
					}

					method540(var3, var5, 98, var2);
				}

				if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
					boolean var18 = method437(field1363.field411[0], var2, false, 0, 0, field1363.field410[0], var3, 0, 0, 0, 2);
					if (!var18) {
						method437(field1363.field411[0], var2, false, 0, 0, field1363.field410[0], var3, 1, 1, 0, 2);
					}

					field1168 = field24;
					field1169 = field25;
					field1171 = 2;
					field1170 = 0;

					if (var4 == 662) {
						field1104 += field1386;
						if (field1104 >= 118) {
							field1194.method217(56);
							field1194.method222(0);
						}

						field1194.method217(97);
					}

					if (var4 == 617) {
						field1194.method217(178);
					}

					if (var4 == 139) {
						if ((var2 & 0x3) == 0) {
							field1064++;
						}

						if (field1064 >= 123) {
							field1194.method217(187);
							field1194.method222(0);
						}

						field1194.method217(141);
					}

					if (var4 == 224) {
						field1391 += var3;
						if (field1391 >= 75) {
							field1194.method217(206);
							field1194.method218(19);
						}

						field1194.method217(47);
					}

					if (var4 == 778) {
						field1194.method217(67);
					}

					field1194.method219(field1385 + var2);
					field1194.method219(field1386 + var3);
					field1194.method219(var5);
				}

				if (var4 == 225) {
					field1194.method217(244);
					field1194.method219(var3);
					class4 var20 = class4.field56[var3];
					if (var20.field71 != null && var20.field71[0][0] == 5) {
						int var21 = var20.field71[0][1];
						if (field1353[var21] != var20.field73[0]) {
							field1353[var21] = var20.field73[0];
							method476(var21);
							field1394 = true;
						}
					}
				}

				if (var4 == 398) {
					field1194.method217(200);
					field1194.method219(var5);
					field1194.method219(var2);
					field1194.method219(var3);
					field1194.method219(field1218);
					field1194.method219(field1216);
					field1194.method219(field1217);
					field1401 = 0;
					field1402 = var3;
					field1403 = var2;
					field1404 = 2;
					if (class4.field56[var3].field62 == field1062) {
						field1404 = 1;
					}

					if (class4.field56[var3].field62 == field1103) {
						field1404 = 3;
					}
				}

				if (var4 == 1381) {
					int var22 = var5 >> 14 & 0x7FFF;
					class58 var23 = class58.method329(var22);
					String var24;
					if (var23.field833 == null) {
						var24 = "It's a " + var23.field832 + ".";
					} else {
						var24 = new String(var23.field833);
					}

					method539(var24, "", 0);
				}

				if (var4 == 997 && !field1252) {
					field1194.method217(146);
					field1194.method219(var3);
					field1252 = true;
				}

				if (var4 == 507 || var4 == 957) {
					String var25 = field1278[arg0];
					int var26 = var25.indexOf("@whi@");
					if (var26 != -1) {
						var25 = var25.substring(var26 + 5).trim();
						String var27 = class52.method303(class52.method300(class52.method299(var25)));
						boolean var28 = false;
						for (int var29 = 0; var29 < field1136; var29++) {
							class27 var30 = field1135[field1137[var29]];
							if (var30 != null && var30.field416 != null && var30.field416.equalsIgnoreCase(var27)) {
								method437(field1363.field411[0], var30.field410[0], false, 0, 0, field1363.field410[0], var30.field411[0], 1, 1, 0, 2);

								if (var4 == 507) {
									field1145 += var5;
									if (field1145 >= 66) {
										field1194.method217(233);
										field1194.method218(154);
									}

									field1194.method217(72);
								}

								if (var4 == 957) {
									field1273++;
									if (field1273 >= 52) {
										field1194.method217(121);
										field1194.method218(131);
									}

									field1194.method217(192);
								}

								field1194.method219(field1137[var29]);
								var28 = true;
								break;
							}
						}

						if (!var28) {
							method539("Unable to find " + var27, "", 0);
						}
					}
				}

				if (var4 == 737) {
					method453();
				}

				if (var4 == 563) {
					field1194.method217(102);
					field1194.method219(var5);
					field1194.method219(var2);
					field1194.method219(var3);
					field1194.method219(field1246);
					field1401 = 0;
					field1402 = var3;
					field1403 = var2;
					field1404 = 2;
					if (class4.field56[var3].field62 == field1062) {
						field1404 = 1;
					}

					if (class4.field56[var3].field62 == field1103) {
						field1404 = 3;
					}
				}

				if (var4 == 1714) {
					class26 var31 = field1090[var5];
					if (var31 != null) {
						String var32;
						if (var31.field415.field878 == null) {
							var32 = "It's a " + var31.field415.field877 + ".";
						} else {
							var32 = new String(var31.field415.field878);
						}

						method539(var32, "", 0);
					}
				}

				if (var4 == 131) {
					class27 var33 = field1135[var5];
					if (var33 != null) {
						method437(field1363.field411[0], var33.field410[0], false, 0, 0, field1363.field410[0], var33.field411[0], 1, 1, 0, 2);
						field1168 = field24;
						field1169 = field25;
						field1171 = 2;
						field1170 = 0;
						field1194.method217(68);
						field1194.method219(var5);
						field1194.method219(field1246);
					}
				}

				if (var4 == 524) {
					String var34 = field1278[arg0];
					int var35 = var34.indexOf("@whi@");
					if (var35 != -1) {
						method453();
						field1285 = var34.substring(var35 + 5).trim();
						field1255 = false;

						for (int var36 = 0; var36 < class4.field56.length; var36++) {
							if (class4.field56[var36] != null && class4.field56[var36].field65 == 600) {
								field1236 = field1062 = class4.field56[var36].field62;
								break;
							}
						}
					}
				}

				if (var4 == 240) {
					class26 var37 = field1090[var5];
					if (var37 != null) {
						method437(field1363.field411[0], var37.field410[0], false, 0, 0, field1363.field410[0], var37.field411[0], 1, 1, 0, 2);
						field1168 = field24;
						field1169 = field25;
						field1171 = 2;
						field1170 = 0;
						field1194.method217(231);
						field1194.method219(var5);
						field1194.method219(field1246);
					}
				}

				if (var4 == 111) {
					boolean var38 = method437(field1363.field411[0], var2, false, 0, 0, field1363.field410[0], var3, 0, 0, 0, 2);
					if (!var38) {
						method437(field1363.field411[0], var2, false, 0, 0, field1363.field410[0], var3, 1, 1, 0, 2);
					}

					field1168 = field24;
					field1169 = field25;
					field1171 = 2;
					field1170 = 0;
					field1194.method217(245);
					field1194.method219(field1385 + var2);
					field1194.method219(field1386 + var3);
					field1194.method219(var5);
					field1194.method219(field1218);
					field1194.method219(field1216);
					field1194.method219(field1217);
				}

				if (var4 == 1152) {
					class61 var40 = class61.method345(var5);
					String var41;
					if (var40.field912 == null) {
						var41 = "It's a " + var40.field911 + ".";
					} else {
						var41 = new String(var40.field912);
					}

					method539(var41, "", 0);
				}

				if (var4 == 721) {
					field1431 += var3;
					if (field1431 >= 139) {
						field1194.method217(28);
						field1194.method222(0);
					}

					method540(var3, var5, 213, var2);
				}

				if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
					if (var4 == 100) {
						field1194.method217(74);
					}

					if (var4 == 962) {
						field1194.method217(228);
					}

					if (var4 == 681) {
						field1269++;
						if (field1269 >= 116) {
							field1194.method217(162);
							field1194.method221(0xC6A439);
						}

						field1194.method217(163);
					}

					if (var4 == 694) {
						field1194.method217(243);
					}

					if (var4 == 795) {
						field1194.method217(80);
					}

					field1194.method219(var5);
					field1194.method219(var2);
					field1194.method219(var3);
					field1401 = 0;
					field1402 = var3;
					field1403 = var2;
					field1404 = 2;
					if (class4.field56[var3].field62 == field1062) {
						field1404 = 1;
					}

					if (class4.field56[var3].field62 == field1103) {
						field1404 = 3;
					}
				}

				if (var4 == 435) {
					field1194.method217(244);
					field1194.method219(var3);
					class4 var42 = class4.field56[var3];
					if (var42.field71 != null && var42.field71[0][0] == 5) {
						int var43 = var42.field71[0][1];
						field1353[var43] = 1 - field1353[var43];
						method476(var43);
						field1394 = true;
					}
				}

				if (var4 == 275) {
					class27 var44 = field1135[var5];
					if (var44 != null) {
						method437(field1363.field411[0], var44.field410[0], false, 0, 0, field1363.field410[0], var44.field411[0], 1, 1, 0, 2);
						field1168 = field24;
						field1169 = field25;
						field1171 = 2;
						field1170 = 0;
						field1194.method217(113);
						field1194.method219(var5);
						field1194.method219(field1218);
						field1194.method219(field1216);
						field1194.method219(field1217);
					}
				}

				if (var4 == 1071) {
					method540(var3, var5, 147, var2);
				}

				if (var4 == 625) {
					method540(var3, var5, 33, var2);
				}

				if (var4 == 231) {
					class4 var45 = class4.field56[var3];
					boolean var46 = true;
					if (var45.field65 > 0) {
						var46 = method439(var45);
					}

					if (var46) {
						field1194.method217(244);
						field1194.method219(var3);
					}
				}

				if (var4 == 810 && method540(var3, var5, 240, var2)) {
					field1194.method219(field1218);
					field1194.method219(field1216);
					field1194.method219(field1217);
				}

				if (var4 == 274) {
					class4 var47 = class4.field56[var3];
					field1245 = 1;
					field1246 = var3;
					field1247 = var47.field116;
					field1215 = 0;
					field1394 = true;
					String var48 = var47.field114;
					if (var48.indexOf(" ") != -1) {
						var48 = var48.substring(0, var48.indexOf(" "));
					}

					String var49 = var47.field114;
					if (var49.indexOf(" ") != -1) {
						var49 = var49.substring(var49.indexOf(" ") + 1);
					}

					field1248 = var48 + " " + var47.field115 + " " + var49;

					if (field1247 == 16) {
						field1394 = true;
						field1237 = 3;
						field1284 = true;
					}
				} else {
					if (var4 == 370) {
						boolean var50 = method437(field1363.field411[0], var2, false, 0, 0, field1363.field410[0], var3, 0, 0, 0, 2);
						if (!var50) {
							method437(field1363.field411[0], var2, false, 0, 0, field1363.field410[0], var3, 1, 1, 0, 2);
						}

						field1168 = field24;
						field1169 = field25;
						field1171 = 2;
						field1170 = 0;
						field1194.method217(202);
						field1194.method219(field1385 + var2);
						field1194.method219(field1386 + var3);
						field1194.method219(var5);
						field1194.method219(field1246);
					}

					if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
						String var52 = field1278[arg0];
						int var53 = var52.indexOf("@whi@");
						if (var53 != -1) {
							long var54 = class52.method299(var52.substring(var53 + 5).trim());
							if (var4 == 605) {
								method431(var54);
							}

							if (var4 == 47) {
								method460(var54);
							}

							if (var4 == 513) {
								method443(var54);
							}

							if (var4 == 884) {
								method472(var54);
							}
						}
					}

					field1215 = 0;
					field1245 = 0;
					field1394 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method484(class4 arg0) {
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

	@ObfuscatedName("client.a(BI)Z")
	public final boolean method485(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1187[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(BILib;I)V")
	public final void method486(int arg0, class35 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1360 + field1315 & 0x7FF;
			int var6 = class31.field544[var5];
			int var7 = class31.field545[var5];
			var6 = var6 * 256 / (field1389 + 256);
			var7 = var7 * 256 / (field1389 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1143.method190(20, var10, 83 - var13 - 20, 15, 20, var12 + 94 + 4 - 10, 15, 256);
		} else {
			method550(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method487(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void method488(class39 arg0, int arg1) {
		arg0.method238();
		int var3 = arg0.method239(8);
		if (var3 < field1091) {
			for (int var4 = var3; var4 < field1091; var4++) {
				field1280[field1279++] = field1092[var4];
			}
		}

		if (var3 > field1091) {
			signlink.reporterror(field1120 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1091 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1092[var5];
			class26 var7 = field1090[var6];
			int var8 = arg0.method239(1);
			if (var8 == 0) {
				field1092[field1091++] = var6;
				var7.field405 = field1058;
			} else {
				int var9 = arg0.method239(2);
				if (var9 == 0) {
					field1092[field1091++] = var6;
					var7.field405 = field1058;
					field1139[field1138++] = var6;
				} else if (var9 == 1) {
					field1092[field1091++] = var6;
					var7.field405 = field1058;
					int var10 = arg0.method239(3);
					var7.method111(var10, false);
					int var11 = arg0.method239(1);
					if (var11 == 1) {
						field1139[field1138++] = var6;
					}
				} else if (var9 == 2) {
					field1092[field1091++] = var6;
					var7.field405 = field1058;
					int var12 = arg0.method239(3);
					var7.method111(var12, true);
					int var13 = arg0.method239(3);
					var7.method111(var13, true);
					int var14 = arg0.method239(1);
					if (var14 == 1) {
						field1139[field1138++] = var6;
					}
				} else if (var9 == 3) {
					field1280[field1279++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;IIII)V")
	public final void method489(class60 arg0, int arg1, int arg2, int arg3) {
		if (field1261 < 400) {
			String var5 = arg0.field877;
			if (arg0.field894 != 0) {
				var5 = var5 + method517(arg0.field894, field1363.field422) + " (level-" + arg0.field894 + ")";
			}

			if (field1215 == 1) {
				field1278[field1261] = "Use " + field1219 + " with @yel@" + var5;
				field1187[field1261] = 829;
				field1188[field1261] = arg1;
				field1185[field1261] = arg3;
				field1186[field1261] = arg2;
				field1261++;
			} else if (field1245 != 1) {
				if (arg0.field889 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg0.field889[var6] != null && !arg0.field889[var6].equalsIgnoreCase("attack")) {
							field1278[field1261] = arg0.field889[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1187[field1261] = 242;
							}

							if (var6 == 1) {
								field1187[field1261] = 209;
							}

							if (var6 == 2) {
								field1187[field1261] = 309;
							}

							if (var6 == 3) {
								field1187[field1261] = 852;
							}

							if (var6 == 4) {
								field1187[field1261] = 793;
							}

							field1188[field1261] = arg1;
							field1185[field1261] = arg3;
							field1186[field1261] = arg2;
							field1261++;
						}
					}
				}

				if (arg0.field889 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg0.field889[var7] != null && arg0.field889[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg0.field894 > field1363.field422) {
								var8 = 2000;
							}

							field1278[field1261] = arg0.field889[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1187[field1261] = var8 + 242;
							}

							if (var7 == 1) {
								field1187[field1261] = var8 + 209;
							}

							if (var7 == 2) {
								field1187[field1261] = var8 + 309;
							}

							if (var7 == 3) {
								field1187[field1261] = var8 + 852;
							}

							if (var7 == 4) {
								field1187[field1261] = var8 + 793;
							}

							field1188[field1261] = arg1;
							field1185[field1261] = arg3;
							field1186[field1261] = arg2;
							field1261++;
						}
					}
				}

				field1278[field1261] = "Examine @yel@" + var5;
				field1187[field1261] = 1714;
				field1188[field1261] = arg1;
				field1185[field1261] = arg3;
				field1186[field1261] = arg2;
				field1261++;
			} else if ((field1247 & 0x2) == 2) {
				field1278[field1261] = field1248 + " @yel@" + var5;
				field1187[field1261] = 240;
				field1188[field1261] = arg1;
				field1185[field1261] = arg3;
				field1186[field1261] = arg2;
				field1261++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIZII)V")
	public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1399.method247(); var11 != null; var11 = (class41) field1399.method249()) {
			if (var11.field642 == arg8 && var11.field644 == arg4 && var11.field645 == arg3 && var11.field643 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field642 = arg8;
			var10.field643 = arg6;
			var10.field644 = arg4;
			var10.field645 = arg3;
			method477(var10);
			field1399.method244(var10);
		}

		var10.field649 = arg0;
		var10.field651 = arg5;
		var10.field650 = arg7;
		var10.field652 = arg2;
		var10.field653 = arg1;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method491() {
		if (field1130 > 1) {
			field1130--;
		}

		if (field1459 > 0) {
			field1459--;
		}

		for (int var1 = 0; var1 < 5 && method504(); var1++) {
		}

		if (field1452) {
			synchronized (field1099.field867) {
				if (!field1076) {
					field1099.field868 = 0;
				} else if (field23 != 0 || field1099.field868 >= 40) {
					field1194.method217(232);
					field1194.method218(0);
					int var3 = field1194.field625;
					int var4 = 0;
					for (int var5 = 0; var5 < field1099.field868 && var3 - field1194.field625 < 240; var5++) {
						var4++;
						int var6 = field1099.field870[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1099.field869[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1099.field870[var5] == -1 && field1099.field869[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1154 != var7 || field1155 != var6) {
							int var9 = var7 - field1154;
							field1154 = var7;
							int var10 = var6 - field1155;
							field1155 = var6;

							if (field1122 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1194.method219((field1122 << 12) + (var9 << 6) + var10);
								field1122 = 0;
							} else if (field1122 < 8) {
								field1194.method221((field1122 << 19) + var8 + 0x800000);
								field1122 = 0;
							} else {
								field1194.method222((field1122 << 19) + var8 - 0x40000000);
								field1122 = 0;
							}
						} else if (field1122 < 2047) {
							field1122++;
						}
					}

					field1194.method227(field1194.field625 - var3);

					if (var4 >= field1099.field868) {
						field1099.field868 = 0;
					} else {
						field1099.field868 -= var4;
						for (int var11 = 0; var11 < field1099.field868; var11++) {
							field1099.field869[var11] = field1099.field869[var4 + var11];
							field1099.field870[var11] = field1099.field870[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1406) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1406 = field26;
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
				field1194.method217(234);
				field1194.method222((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1201 > 0) {
				field1201--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1202 = true;
			}

			if (field1202 && field1201 <= 0) {
				field1201 = 20;
				field1202 = false;
				field1194.method217(91);
				field1194.method219(field1314);
				field1194.method219(field1315);
			}

			if (field14 && !field1227) {
				field1227 = true;
				field1194.method217(8);
				field1194.method218(1);
			}

			if (!field14 && field1227) {
				field1227 = false;
				field1194.method217(8);
				field1194.method218(0);
			}

			method481();
			method529();
			method462();
			field1457++;
			if (field1457 > 750) {
				method449();
			}

			method478();
			method492();
			method459();
			field1166++;

			if (field1171 != 0) {
				field1170 += 20;
				if (field1170 >= 400) {
					field1171 = 0;
				}
			}

			if (field1404 != 0) {
				field1401++;
				if (field1401 >= 15) {
					if (field1404 == 2) {
						field1394 = true;
					}

					if (field1404 == 3) {
						field1286 = true;
					}

					field1404 = 0;
				}
			}

			if (field1410 != 0) {
				field1198++;

				if (field17 > field1411 + 5 || field17 < field1411 - 5 || field18 > field1412 + 5 || field18 < field1412 - 5) {
					field1451 = true;
				}

				if (field16 == 0) {
					if (field1410 == 2) {
						field1394 = true;
					}

					if (field1410 == 3) {
						field1286 = true;
					}

					field1410 = 0;

					if (field1451 && field1198 >= 5) {
						field1129 = -1;
						method544();

						if (field1408 == field1129 && field1409 != field1128) {
							class4 var19 = class4.field56[field1408];
							byte var20 = 0;
							if (field1164 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1128] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1409;
								int var22 = field1128;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1409;
								int var24 = field1128;
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
								var19.method33(field1128, field1409);
							}

							field1194.method217(176);
							field1194.method219(field1408);
							field1194.method219(field1409);
							field1194.method219(field1128);
							field1194.method218(var20);
						}
					} else if ((field1259 == 1 || method485(field1261 - 1)) && field1261 > 2) {
						method468();
					} else if (field1261 > 0) {
						method483(field1261 - 1);
					}

					field1401 = 10;
					field23 = 0;
				}
			}

			field1105++;
			if (field1105 > 62) {
				field1105 = 0;
				field1194.method217(182);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method437(field1363.field411[0], var25, true, 0, 0, field1363.field410[0], var26, 0, 0, 0, 0);
				class18.field292 = -1;

				if (var27) {
					field1168 = field24;
					field1169 = field25;
					field1171 = 1;
					field1170 = 0;
				}
			}

			if (field23 == 1 && field1068 != null) {
				field1068 = null;
				field1286 = true;
				field23 = 0;
			}

			method500();
			method507();
			method426();
			method554();

			if (field16 == 1 || field23 == 1) {
				field1095++;
			}

			if (field1288 == 2) {
				method530();
			}

			if (field1288 == 2 && field1167) {
				method512();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1257[var28]++;
			}

			method520();
			field15++;
			if (field15 > 4500) {
				field1459 = 250;
				field15 -= 500;
				field1194.method217(144);
			}

			field1453++;
			if (field1453 > 500) {
				field1453 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1126 += field1127;
				}

				if ((var29 & 0x2) == 2) {
					field1424 += field1425;
				}

				if ((var29 & 0x4) == 4) {
					field1223 += field1224;
				}
			}

			if (field1126 < -50) {
				field1127 = 2;
			}

			if (field1126 > 50) {
				field1127 = -2;
			}

			if (field1424 < -55) {
				field1425 = 2;
			}

			if (field1424 > 55) {
				field1425 = -2;
			}

			if (field1223 < -40) {
				field1224 = 1;
			}

			if (field1223 > 40) {
				field1224 = -1;
			}

			field1209++;
			if (field1209 > 500) {
				field1209 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1360 += field1361;
				}

				if ((var30 & 0x2) == 2) {
					field1389 += field1390;
				}
			}

			if (field1360 < -60) {
				field1361 = 2;
			}

			if (field1360 > 60) {
				field1361 = -2;
			}

			if (field1389 < -20) {
				field1390 = 1;
			}

			if (field1389 > 10) {
				field1390 = -1;
			}

			field1458++;
			if (field1458 > 50) {
				field1194.method217(239);
			}

			try {
				if (field1176 != null && field1194.field625 > 0) {
					field1176.method42(field1194.field625, field1194.field624, 0);
					field1194.field625 = 0;
					field1458 = 0;
				}
			} catch (IOException var32) {
				method449();
			} catch (Exception var33) {
				method475();
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

	@ObfuscatedName("client.x(I)V")
	public final void method492() {
		for (int var1 = 0; var1 < field1091; var1++) {
			int var2 = field1092[var1];
			class26 var3 = field1090[var2];
			if (var3 != null) {
				method493(var3.field415.field879, var3);
			}
		}
	}

	@ObfuscatedName("client.a(BILy;)V")
	public final void method493(int arg0, class25 arg1) {
		if (arg1.field360 < 128 || arg1.field361 < 128 || arg1.field360 >= 13184 || arg1.field361 >= 13184) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (field1363 == arg1 && (arg1.field360 < 1536 || arg1.field361 < 1536 || arg1.field360 >= 11776 || arg1.field361 >= 11776)) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (arg1.field402 > field1058) {
			method494(arg1);
		} else if (arg1.field403 >= field1058) {
			method495(arg1);
		} else {
			method496(arg1);
		}

		method497(arg1);
		method498(arg1);
	}

	@ObfuscatedName("client.a(Ly;Z)V")
	public final void method494(class25 arg0) {
		int var2 = arg0.field402 - field1058;
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
	public final void method495(class25 arg0) {
		if (field1058 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class67.field991[arg0.field388].method379(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1058 - arg0.field402;
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

	@ObfuscatedName("client.b(Ly;Z)V")
	public final void method496(class25 arg0) {
		arg0.field385 = arg0.field365;
		if (arg0.field409 == 0) {
			arg0.field413 = 0;
		} else {
			if (arg0.field388 != -1 && arg0.field391 == 0) {
				class67 var2 = class67.field991[arg0.field388];
				if (arg0.field414 > 0 && var2.field1003 == 0) {
					arg0.field413++;
					return;
				}

				if (arg0.field414 <= 0 && var2.field1004 == 0) {
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
	public final void method497(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1090[arg0.field382];
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
				if (field1421 == var5) {
					var5 = field1134;
				}

				class27 var6 = field1135[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1385 - field1385) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1386 - field1386) * 64;
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

	@ObfuscatedName("client.c(Ly;I)V")
	public final void method498(class25 arg0) {
		arg0.field363 = false;

		if (arg0.field385 != -1) {
			class67 var2 = class67.field991[arg0.field385];
			arg0.field387++;
			if (arg0.field386 < var2.field992 && arg0.field387 > var2.method379(arg0.field386)) {
				arg0.field387 = 0;
				arg0.field386++;
			}

			if (arg0.field386 >= var2.field992) {
				arg0.field387 = 0;
				arg0.field386 = 0;
			}
		}

		if (arg0.field393 != -1 && field1058 >= arg0.field396) {
			if (arg0.field394 < 0) {
				arg0.field394 = 0;
			}

			class67 var3 = class69.field1010[arg0.field393].field1014;
			arg0.field395++;
			while (arg0.field394 < var3.field992 && arg0.field395 > var3.method379(arg0.field394)) {
				arg0.field395 -= var3.method379(arg0.field394);
				arg0.field394++;
			}

			if (arg0.field394 >= var3.field992 && (arg0.field394 < 0 || arg0.field394 >= var3.field992)) {
				arg0.field393 = -1;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 <= 1) {
			class67 var4 = class67.field991[arg0.field388];
			if (var4.field1003 == 1 && arg0.field414 > 0 && arg0.field402 <= field1058 && arg0.field403 < field1058) {
				arg0.field391 = 1;
				return;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 == 0) {
			class67 var5 = class67.field991[arg0.field388];
			arg0.field390++;
			while (arg0.field389 < var5.field992 && arg0.field390 > var5.method379(arg0.field389)) {
				arg0.field390 -= var5.method379(arg0.field389);
				arg0.field389++;
			}

			if (arg0.field389 >= var5.field992) {
				arg0.field389 -= var5.field996;
				arg0.field392++;
				if (arg0.field392 >= var5.field1002) {
					arg0.field388 = -1;
				}

				if (arg0.field389 < 0 || arg0.field389 >= var5.field992) {
					arg0.field388 = -1;
				}
			}

			arg0.field363 = var5.field998;
		}

		if (arg0.field391 > 0) {
			arg0.field391--;
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method499() {
		if (field1210) {
			field1210 = false;
			field1296.method258(4, field9, 0);
			field1297.method258(357, field9, 0);
			field1298.method258(4, field9, 722);
			field1299.method258(205, field9, 743);
			field1300.method258(0, field9, 0);
			field1301.method258(4, field9, 516);
			field1302.method258(205, field9, 516);
			field1303.method258(357, field9, 496);
			field1304.method258(338, field9, 0);
			field1394 = true;
			field1286 = true;
			field1284 = true;
			field1203 = true;

			if (field1288 != 2) {
				field1375.method258(4, field9, 4);
				field1374.method258(4, field9, 550);
			}
		}

		if (field1288 == 2) {
			method521();
		}

		if (field1173 && field1445 == 1) {
			field1394 = true;
		}

		if (field1172 != -1) {
			boolean var1 = method440(field1166, field1172);
			if (var1) {
				field1394 = true;
			}
		}

		if (field1404 == 2) {
			field1394 = true;
		}

		if (field1410 == 2) {
			field1394 = true;
		}

		if (field1394) {
			method548();
			field1394 = false;
		}

		if (field1103 == -1) {
			field1294.field76 = field1191 - field1426 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method531(0, field17 - 17, 463, field1294, false, 77, field18 - 357, field1191);
			}

			int var2 = field1191 - field1294.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1191 - 77) {
				var2 = field1191 - 77;
			}

			if (field1426 != var2) {
				field1426 = var2;
				field1286 = true;
			}
		}

		if (field1103 != -1) {
			boolean var3 = method440(field1166, field1103);
			if (var3) {
				field1286 = true;
			}
		}

		if (field1404 == 3) {
			field1286 = true;
		}

		if (field1410 == 3) {
			field1286 = true;
		}

		if (field1068 != null) {
			field1286 = true;
		}

		if (field1173 && field1445 == 2) {
			field1286 = true;
		}

		if (field1286) {
			method427();
			field1286 = false;
		}

		if (field1288 == 2) {
			method479();
			field1374.method258(4, field9, 550);
		}

		if (field1075 != -1) {
			field1284 = true;
		}

		if (field1284) {
			if (field1075 != -1 && field1237 == field1075) {
				field1075 = -1;
				field1194.method217(201);
				field1194.method218(field1237);
			}

			field1284 = false;
			field1382.method257();
			field1291.method198(0, 0);

			if (field1172 == -1) {
				if (field1378[field1237] != -1) {
					if (field1237 == 0) {
						field1364.method198(22, 10);
					}

					if (field1237 == 1) {
						field1365.method198(54, 8);
					}

					if (field1237 == 2) {
						field1365.method198(82, 8);
					}

					if (field1237 == 3) {
						field1366.method198(110, 8);
					}

					if (field1237 == 4) {
						field1368.method198(153, 8);
					}

					if (field1237 == 5) {
						field1368.method198(181, 8);
					}

					if (field1237 == 6) {
						field1367.method198(209, 9);
					}
				}

				if (field1378[0] != -1 && (field1075 != 0 || field1058 % 20 < 10)) {
					field1267[0].method198(29, 13);
				}

				if (field1378[1] != -1 && (field1075 != 1 || field1058 % 20 < 10)) {
					field1267[1].method198(53, 11);
				}

				if (field1378[2] != -1 && (field1075 != 2 || field1058 % 20 < 10)) {
					field1267[2].method198(82, 11);
				}

				if (field1378[3] != -1 && (field1075 != 3 || field1058 % 20 < 10)) {
					field1267[3].method198(115, 12);
				}

				if (field1378[4] != -1 && (field1075 != 4 || field1058 % 20 < 10)) {
					field1267[4].method198(153, 13);
				}

				if (field1378[5] != -1 && (field1075 != 5 || field1058 % 20 < 10)) {
					field1267[5].method198(180, 11);
				}

				if (field1378[6] != -1 && (field1075 != 6 || field1058 % 20 < 10)) {
					field1267[6].method198(208, 13);
				}
			}

			field1382.method258(160, field9, 516);
			field1381.method257();
			field1290.method198(0, 0);

			if (field1172 == -1) {
				if (field1378[field1237] != -1) {
					if (field1237 == 7) {
						field1069.method198(42, 0);
					}

					if (field1237 == 8) {
						field1070.method198(74, 0);
					}

					if (field1237 == 9) {
						field1070.method198(102, 0);
					}

					if (field1237 == 10) {
						field1071.method198(130, 1);
					}

					if (field1237 == 11) {
						field1073.method198(173, 0);
					}

					if (field1237 == 12) {
						field1073.method198(201, 0);
					}

					if (field1237 == 13) {
						field1072.method198(229, 0);
					}
				}

				if (field1378[8] != -1 && (field1075 != 8 || field1058 % 20 < 10)) {
					field1267[7].method198(74, 2);
				}

				if (field1378[9] != -1 && (field1075 != 9 || field1058 % 20 < 10)) {
					field1267[8].method198(102, 3);
				}

				if (field1378[10] != -1 && (field1075 != 10 || field1058 % 20 < 10)) {
					field1267[9].method198(137, 4);
				}

				if (field1378[11] != -1 && (field1075 != 11 || field1058 % 20 < 10)) {
					field1267[10].method198(174, 2);
				}

				if (field1378[12] != -1 && (field1075 != 12 || field1058 % 20 < 10)) {
					field1267[11].method198(201, 2);
				}

				if (field1378[13] != -1 && (field1075 != 13 || field1058 % 20 < 10)) {
					field1267[12].method198(226, 2);
				}
			}

			field1381.method258(466, field9, 496);
			field1375.method257();
		}

		if (field1203) {
			field1203 = false;
			field1380.method257();
			field1289.method198(0, 0);
			field1319.method201(55, true, 0xFFFFFF, 28, "Public chat");

			if (field1150 == 0) {
				field1319.method201(55, true, 0xFF00, 41, "On");
			}

			if (field1150 == 1) {
				field1319.method201(55, true, 0xFFFF00, 41, "Friends");
			}

			if (field1150 == 2) {
				field1319.method201(55, true, 0xFF0000, 41, "Off");
			}

			if (field1150 == 3) {
				field1319.method201(55, true, 0xFFFF, 41, "Hide");
			}

			field1319.method201(184, true, 0xFFFFFF, 28, "Private chat");

			if (field1467 == 0) {
				field1319.method201(184, true, 0xFF00, 41, "On");
			}

			if (field1467 == 1) {
				field1319.method201(184, true, 0xFFFF00, 41, "Friends");
			}

			if (field1467 == 2) {
				field1319.method201(184, true, 0xFF0000, 41, "Off");
			}

			field1319.method201(324, true, 0xFFFFFF, 28, "Trade/duel");

			if (field1192 == 0) {
				field1319.method201(324, true, 0xFF00, 41, "On");
			}

			if (field1192 == 1) {
				field1319.method201(324, true, 0xFFFF00, 41, "Friends");
			}

			if (field1192 == 2) {
				field1319.method201(324, true, 0xFF0000, 41, "Off");
			}

			field1319.method201(458, true, 0xFFFFFF, 33, "Report abuse");
			field1380.method258(453, field9, 0);
			field1375.method257();
		}

		field1166 = 0;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method500() {
		if (field1410 == 0) {
			int var1 = field23;
			if (field1245 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1173) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1445 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1445 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1445 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1446 - 10 || var2 > field1448 + field1446 + 10 || var3 < field1447 - 10 || var3 > field1449 + field1447 + 10) {
						field1173 = false;

						if (field1445 == 1) {
							field1394 = true;
						}

						if (field1445 == 2) {
							field1286 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1446;
					int var5 = field1447;
					int var6 = field1448;
					int var7 = field24;
					int var8 = field25;
					if (field1445 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1445 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1445 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1261; var10++) {
						int var11 = (field1261 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method483(var9);
					}

					field1173 = false;

					if (field1445 == 1) {
						field1394 = true;
					}

					if (field1445 == 2) {
						field1286 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1261 > 0) {
					int var12 = field1187[field1261 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1185[field1261 - 1];
						int var14 = field1186[field1261 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1451 = false;
							field1198 = 0;
							field1408 = var14;
							field1409 = var13;
							field1410 = 2;
							field1411 = field24;
							field1412 = field25;

							if (class4.field56[var14].field62 == field1062) {
								field1410 = 1;
							}

							if (class4.field56[var14].field62 == field1103) {
								field1410 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1259 == 1 || method485(field1261 - 1)) && field1261 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1261 > 0) {
					method483(field1261 - 1);
				}

				if (var1 != 2 || field1261 <= 0) {
					return;
				}

				method468();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = class31.field544[var7];
			int var13 = class31.field545[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field544[var8];
			int var16 = class31.field545[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1435 = arg3 - var9;
		field1436 = arg2 - var10;
		field1437 = arg0 - var11;
		field1438 = arg5;
		field1439 = arg1;
	}

	@ObfuscatedName("client.z(I)I")
	public final int method502() {
		int var1 = 3;
		if (field1438 < 310) {
			int var2 = field1435 >> 7;
			int var3 = field1437 >> 7;
			int var4 = field1363.field360 >> 7;
			int var5 = field1363.field361 >> 7;

			if ((field1208[field1434][var2][var3] & 0x4) != 0) {
				var1 = field1434;
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

					if ((field1208[field1434][var2][var3] & 0x4) != 0) {
						var1 = field1434;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1208[field1434][var2][var3] & 0x4) != 0) {
							var1 = field1434;
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

					if ((field1208[field1434][var2][var3] & 0x4) != 0) {
						var1 = field1434;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1208[field1434][var2][var3] & 0x4) != 0) {
							var1 = field1434;
						}
					}
				}
			}
		}

		if ((field1208[field1434][field1363.field360 >> 7][field1363.field361 >> 7] & 0x4) != 0) {
			var1 = field1434;
		}

		return var1;
	}

	@ObfuscatedName("client.j(Z)I")
	public final int method503() {
		int var1 = method515(field1435, field1437, field1434);
		if (var1 - field1436 < 800 && (field1208[field1434][field1435 >> 7][field1437 >> 7] & 0x4) != 0) {
			return field1434;
		}

		return 3;
	}

	@ObfuscatedName("client.h(B)Z")
	public final boolean method504() {
		if (field1176 == null) {
			return false;
		}

		try {
			int var1 = field1176.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1456 == -1) {
				field1176.method41(field1193.field624, 0, 1);
				field1456 = field1193.field624[0] & 0xFF;
				if (field1330 != null) {
					field1456 = field1456 - field1330.method294() & 0xFF;
				}

				field1455 = class62.field951[field1456];
				var1--;
			}

			if (field1455 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1176.method41(field1193.field624, 0, 1);
				field1455 = field1193.field624[0] & 0xFF;
				var1--;
			}

			if (field1455 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1176.method41(field1193.field624, 0, 2);
				field1193.field625 = 0;
				field1455 = field1193.method230();
				var1 -= 2;
			}

			if (var1 < field1455) {
				return false;
			}

			field1193.field625 = 0;
			field1176.method41(field1193.field624, 0, field1455);
			field1457 = 0;
			field1057 = field1056;
			field1056 = field1055;
			field1055 = field1456;

			if (field1456 == 203) {
				for (int var2 = 0; var2 < field1135.length; var2++) {
					if (field1135[var2] != null) {
						field1135[var2].field388 = -1;
					}
				}

				for (int var3 = 0; var3 < field1090.length; var3++) {
					if (field1090[var3] != null) {
						field1090[var3].field388 = -1;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 143) {
				field1130 = field1193.method230() * 30;
				field1456 = -1;
				return true;
			}

			if (field1456 == 173) {
				field1419 = field1193.method228();
				field1420 = field1193.method228();
				field1456 = -1;
				return true;
			}

			if (field1456 == 14) {
				int var4 = field1193.method230();
				int var5 = field1193.method230();
				class4 var6 = class4.field56[var4];
				if (var6 != null && var6.field63 == 0) {
					if (var5 < 0) {
						var5 = 0;
					}

					if (var5 > var6.field75 - var6.field67) {
						var5 = var6.field75 - var6.field67;
					}

					var6.field76 = var5;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 60) {
				long var7 = field1193.method234();
				int var9 = field1193.method233();
				int var10 = field1193.method228();
				boolean var11 = false;
				for (int var12 = 0; var12 < 100; var12++) {
					if (field1148[var12] == var9) {
						var11 = true;
						break;
					}
				}

				if (var10 <= 1) {
					for (int var13 = 0; var13 < field1305; var13++) {
						if (field1177[var13] == var7) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field1142 == 0) {
					try {
						field1148[field1144] = var9;
						field1144 = (field1144 + 1) % 100;
						String var14 = class53.method306(field1193, field1455 - 13);
						var14 = class72.method398(var14);
						if (var10 == 2 || var10 == 3) {
							method539(var14, "@cr2@" + class52.method303(class52.method300(var7)), 7);
						} else if (var10 == 1) {
							method539(var14, "@cr1@" + class52.method303(class52.method300(var7)), 7);
						} else {
							method539(var14, class52.method303(class52.method300(var7)), 3);
						}
					} catch (Exception var156) {
						signlink.reporterror("cde1");
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 3) {
				int var16 = field1193.method230();
				int var17 = field1193.method230();
				class4.field56[var16].field105 = 2;
				class4.field56[var16].field106 = var17;
				field1456 = -1;
				return true;
			}

			if (field1456 == 123) {
				method461(field1455, field1193);
				field1456 = -1;
				return true;
			}

			if (field1456 == 239) {
				int var18 = field1193.method231();
				field1306 = var18;
				field1286 = true;
				field1456 = -1;
				return true;
			}

			if (field1456 == 0) {
				field1167 = true;
				field1109 = field1193.method228();
				field1110 = field1193.method228();
				field1111 = field1193.method230();
				field1112 = field1193.method228();
				field1113 = field1193.method228();
				if (field1113 >= 100) {
					int var19 = field1109 * 128 + 64;
					int var20 = field1110 * 128 + 64;
					int var21 = method515(var19, var20, field1434) - field1111;
					int var22 = var19 - field1435;
					int var23 = var21 - field1436;
					int var24 = var20 - field1437;
					int var25 = (int) Math.sqrt(var22 * var22 + var24 * var24);
					field1438 = (int) (Math.atan2(var23, var25) * 325.949D) & 0x7FF;
					field1439 = (int) (Math.atan2(var22, var24) * -325.949D) & 0x7FF;

					if (field1438 < 128) {
						field1438 = 128;
					}

					if (field1438 > 383) {
						field1438 = 383;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 174) {
				if (field1172 != -1) {
					field1172 = -1;
					field1394 = true;
					field1284 = true;
				}

				if (field1103 != -1) {
					field1103 = -1;
					field1286 = true;
				}

				if (field1311) {
					field1311 = false;
					field1286 = true;
				}

				field1062 = -1;
				field1252 = false;
				field1456 = -1;
				return true;
			}

			if (field1456 == 58) {
				field1075 = field1193.method228();
				if (field1237 == field1075) {
					if (field1075 == 3) {
						field1237 = 1;
					} else {
						field1237 = 3;
					}

					field1394 = true;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 95) {
				int var26 = field1193.method230();
				int var27 = field1193.method231();
				class4 var28 = class4.field56[var26];
				var28.field109 = var27;

				if (var27 == -1) {
					var28.field59 = 0;
					var28.field60 = 0;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 27) {
				int var29 = field1193.method230();
				int var30 = field1193.method231();
				int var31 = field1193.method231();
				class4 var32 = class4.field56[var29];
				var32.field69 = var30;
				var32.field70 = var31;
				field1456 = -1;
				return true;
			}

			if (field1456 == 196) {
				int var33 = field1193.method230();
				int var34 = field1193.method233();
				field1418[var33] = var34;

				if (field1353[var33] != var34) {
					field1353[var33] = var34;
					method476(var33);
					field1394 = true;

					if (field1306 != -1) {
						field1286 = true;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 73) {
				String var35 = field1193.method235();
				if (var35.endsWith(":tradereq:")) {
					String var36 = var35.substring(0, var35.indexOf(":"));
					long var37 = class52.method299(var36);
					boolean var39 = false;
					for (int var40 = 0; var40 < field1305; var40++) {
						if (field1177[var40] == var37) {
							var39 = true;
							break;
						}
					}

					if (!var39 && field1142 == 0) {
						method539("wishes to trade with you.", var36, 4);
					}
				} else if (var35.endsWith(":duelreq:")) {
					String var41 = var35.substring(0, var35.indexOf(":"));
					long var42 = class52.method299(var41);
					boolean var44 = false;
					for (int var45 = 0; var45 < field1305; var45++) {
						if (field1177[var45] == var42) {
							var44 = true;
							break;
						}
					}

					if (!var44 && field1142 == 0) {
						method539("wishes to duel with you.", var41, 8);
					}
				} else {
					method539(var35, "", 0);
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 75) {
				field1413 = field1193.method228();
				field1456 = -1;
				return true;
			}

			if (field1456 == 222) {
				int var46 = field1193.method230();
				int var47 = field1193.method230();
				int var48 = field1193.method230();
				class61 var49 = class61.method345(var47);
				class4.field56[var46].field105 = 4;
				class4.field56[var46].field106 = var47;
				class4.field56[var46].field112 = var49.field916;
				class4.field56[var46].field113 = var49.field917;
				class4.field56[var46].field111 = var49.field915 * 100 / var48;
				field1456 = -1;
				return true;
			}

			if (field1456 == 159) {
				field1419 = field1193.method228();
				field1420 = field1193.method228();
				for (int var50 = field1419; var50 < field1419 + 8; var50++) {
					for (int var51 = field1420; var51 < field1420 + 8; var51++) {
						if (field1100[field1434][var50][var51] != null) {
							field1100[field1434][var50][var51] = null;
							method546(var50, var51);
						}
					}
				}

				for (class41 var52 = (class41) field1399.method247(); var52 != null; var52 = (class41) field1399.method249()) {
					if (var52.field644 >= field1419 && var52.field644 < field1419 + 8 && var52.field645 >= field1420 && var52.field645 < field1420 + 8 && field1434 == var52.field642) {
						var52.field653 = 0;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 136) {
				field1394 = true;
				int var53 = field1193.method228();
				int var54 = field1193.method233();
				int var55 = field1193.method228();
				field1131[var53] = var54;
				field1107[var53] = var55;
				field1229[var53] = 1;
				for (int var56 = 0; var56 < 98; var56++) {
					if (var54 >= field1108[var56]) {
						field1229[var53] = var56 + 2;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 5) {
				field1450 = false;
				field1311 = true;
				field1428 = "";
				field1286 = true;
				field1456 = -1;
				return true;
			}

			if (field1456 == 91) {
				int var57 = field1193.method230();
				int var58 = field1193.method228();

				if (var57 == 0xFFFF) {
					var57 = -1;
				}

				field1378[var58] = var57;
				field1394 = true;
				field1284 = true;
				field1456 = -1;
				return true;
			}

			if (field1456 == 141) {
				int var59 = field1193.method230();
				method532(var59);

				if (field1172 != -1) {
					field1172 = -1;
					field1394 = true;
					field1284 = true;
				}

				field1103 = var59;
				field1286 = true;
				field1062 = -1;
				field1252 = false;
				field1456 = -1;
				return true;
			}

			if (field1456 == 25) {
				int var60 = field1193.method230();
				int var61 = field1193.method228();
				int var62 = field1193.method230();
				if (field1096 && !field1265 && field1190 < 50) {
					field1415[field1190] = var60;
					field1276[field1190] = var61;
					field1429[field1190] = class56.field792[var60] + var62;
					field1190++;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 98 || field1456 == 218 || field1456 == 8 || field1456 == 114 || field1456 == 37 || field1456 == 115 || field1456 == 120 || field1456 == 30 || field1456 == 88 || field1456 == 70) {
				method434(field1193, field1456);
				field1456 = -1;
				return true;
			}

			if (field1456 == 28) {
				field1394 = true;
				int var63 = field1193.method230();
				class4 var64 = class4.field56[var63];
				int var65 = field1193.method228();
				for (int var66 = 0; var66 < var65; var66++) {
					var64.field57[var66] = field1193.method230();
					int var67 = field1193.method228();
					if (var67 == 255) {
						var67 = field1193.method233();
					}

					var64.field58[var66] = var67;
				}

				for (int var68 = var65; var68 < var64.field57.length; var68++) {
					var64.field57[var68] = 0;
					var64.field58[var68] = 0;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 204) {
				int var69 = field1193.method228();
				int var70 = field1193.method228();
				String var71 = field1193.method235();
				if (var69 >= 1 && var69 <= 5) {
					if (var71.equalsIgnoreCase("null")) {
						var71 = null;
					}

					field1348[var69 - 1] = var71;
					field1349[var69 - 1] = var70 == 0;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 63) {
				field1305 = field1455 / 8;
				for (int var72 = 0; var72 < field1305; var72++) {
					field1177[var72] = field1193.method234();
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 85) {
				int var73 = field1193.method231();
				if (var73 >= 0) {
					method532(var73);
				}

				field1124 = var73;
				field1456 = -1;
				return true;
			}

			if (field1456 == 211) {
				int var74 = field1193.method230();
				int var75 = field1193.method230();
				class4.field56[var74].field105 = 1;
				class4.field56[var74].field106 = var75;
				field1456 = -1;
				return true;
			}

			if (field1456 == 146) {
				field1307 = field1193.method233();
				field1372 = field1193.method230();
				field1222 = field1193.method228();
				field1461 = field1193.method230();
				field1460 = field1193.method228();
				if (field1307 != 0 && field1062 == -1) {
					signlink.dnslookup(class52.method302(field1307));
					method453();
					short var76 = 650;
					if (field1222 != 201 || field1460 == 1) {
						var76 = 655;
					}

					field1285 = "";
					field1255 = false;

					for (int var77 = 0; var77 < class4.field56.length; var77++) {
						if (class4.field56[var77] != null && class4.field56[var77].field65 == var76) {
							field1062 = class4.field56[var77].field62;
							break;
						}
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 164) {
				if (field1237 == 12) {
					field1394 = true;
				}

				field1238 = field1193.method231();
				field1456 = -1;
				return true;
			}

			if (field1456 == 227) {
				int var78 = field1193.method230();
				boolean var79 = field1193.method228() == 1;
				class4.field56[var78].field77 = var79;
				field1456 = -1;
				return true;
			}

			if (field1456 == 249) {
				int var80 = field1193.method230();
				int var81 = field1193.method230();

				if (field1103 != -1) {
					field1103 = -1;
					field1286 = true;
				}

				if (field1311) {
					field1311 = false;
					field1286 = true;
				}

				field1062 = var80;
				field1172 = var81;
				field1394 = true;
				field1284 = true;
				field1252 = false;
				field1456 = -1;
				return true;
			}

			if (field1456 == 87) {
				method471(field1193, field1455);
				field1292 = false;
				field1456 = -1;
				return true;
			}

			if (field1456 == 21) {
				method475();
				field1456 = -1;
				return false;
			}

			if (field1456 == 161) {
				int var82 = field1193.method230();
				class4.field56[var82].field105 = 3;
				class4.field56[var82].field106 = (field1363.field420[8] << 6) + (field1363.field420[0] << 12) + (field1363.field421[0] << 24) + (field1363.field421[4] << 18) + field1363.field420[11];
				field1456 = -1;
				return true;
			}

			if (field1456 == 255) {
				field1417 = field1193.method228();
				field1394 = true;
				field1456 = -1;
				return true;
			}

			if (field1456 == 197) {
				int var83 = field1193.method230();
				method532(var83);

				if (field1172 != -1) {
					field1172 = -1;
					field1394 = true;
					field1284 = true;
				}

				if (field1103 != -1) {
					field1103 = -1;
					field1286 = true;
				}

				if (field1311) {
					field1311 = false;
					field1286 = true;
				}

				field1062 = var83;
				field1252 = false;
				field1456 = -1;
				return true;
			}

			if (field1456 == 187) {
				int var84 = field1193.method230();
				method532(var84);

				if (field1103 != -1) {
					field1103 = -1;
					field1286 = true;
				}

				if (field1311) {
					field1311 = false;
					field1286 = true;
				}

				field1172 = var84;
				field1394 = true;
				field1284 = true;
				field1062 = -1;
				field1252 = false;
				field1456 = -1;
				return true;
			}

			if (field1456 == 213) {
				field1421 = field1193.method230();
				field1211 = field1193.method228();
				field1456 = -1;
				return true;
			}

			if (field1456 == 186) {
				int var85 = field1193.method230();
				byte var86 = field1193.method229();
				field1418[var85] = var86;

				if (field1353[var85] != var86) {
					field1353[var85] = var86;
					method476(var85);
					field1394 = true;

					if (field1306 != -1) {
						field1286 = true;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 94) {
				if (field1237 == 12) {
					field1394 = true;
				}

				field1220 = field1193.method228();
				field1456 = -1;
				return true;
			}

			if (field1456 == 64) {
				field1065 = field1193.method228();
				if (field1065 == 1) {
					field1432 = field1193.method230();
				}

				if (field1065 >= 2 && field1065 <= 6) {
					if (field1065 == 2) {
						field1465 = 64;
						field1466 = 64;
					}

					if (field1065 == 3) {
						field1465 = 0;
						field1466 = 64;
					}

					if (field1065 == 4) {
						field1465 = 128;
						field1466 = 64;
					}

					if (field1065 == 5) {
						field1465 = 64;
						field1466 = 0;
					}

					if (field1065 == 6) {
						field1465 = 64;
						field1466 = 128;
					}

					field1065 = 2;
					field1462 = field1193.method230();
					field1463 = field1193.method230();
					field1464 = field1193.method228();
				}

				if (field1065 == 10) {
					field1398 = field1193.method230();
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 167) {
				field1167 = false;

				for (int var87 = 0; var87 < 5; var87++) {
					field1414[var87] = false;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 225) {
				int var88 = field1193.method228();
				int var89 = field1193.method228();
				int var90 = field1193.method228();
				int var91 = field1193.method228();
				field1414[var88] = true;
				field1151[var88] = var89;
				field1163[var88] = var90;
				field1089[var88] = var91;
				field1257[var88] = 0;
				field1456 = -1;
				return true;
			}

			if (field1456 == 55) {
				field1167 = true;
				field1323 = field1193.method228();
				field1324 = field1193.method228();
				field1325 = field1193.method230();
				field1326 = field1193.method228();
				field1327 = field1193.method228();
				if (field1327 >= 100) {
					field1435 = field1323 * 128 + 64;
					field1437 = field1324 * 128 + 64;
					field1436 = method515(field1435, field1437, field1434) - field1325;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 140) {
				for (int var92 = 0; var92 < field1353.length; var92++) {
					if (field1418[var92] != field1353[var92]) {
						field1353[var92] = field1418[var92];
						method476(var92);
						field1394 = true;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 170) {
				field1394 = true;
				int var93 = field1193.method230();
				class4 var94 = class4.field56[var93];
				while (field1193.field625 < field1455) {
					int var95 = field1193.method228();
					int var96 = field1193.method230();
					int var97 = field1193.method228();
					if (var97 == 255) {
						var97 = field1193.method233();
					}

					if (var95 >= 0 && var95 < var94.field57.length) {
						var94.field57[var95] = var96;
						var94.field58[var95] = var97;
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 61) {
				field1419 = field1193.method228();
				field1420 = field1193.method228();

				while (field1193.field625 < field1455) {
					int var98 = field1193.method228();
					method434(field1193, var98);
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 108) {
				field1230 = 0;
				field1456 = -1;
				return true;
			}

			if (field1456 == 38) {
				int var99 = field1193.method230();
				int var100 = field1193.method230();
				int var101 = var100 >> 10 & 0x1F;
				int var102 = var100 >> 5 & 0x1F;
				int var103 = var100 & 0x1F;
				class4.field56[var99].field99 = (var103 << 3) + (var101 << 19) + (var102 << 11);
				field1456 = -1;
				return true;
			}

			if (field1456 == 168) {
				int var104 = field1193.method230();
				class4 var105 = class4.field56[var104];
				for (int var106 = 0; var106 < var105.field57.length; var106++) {
					var105.field57[var106] = -1;
					var105.field57[var106] = 0;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 163) {
				int var107 = field1193.method230();
				if (var107 == 0xFFFF) {
					var107 = -1;
				}

				if (field1355 != var107 && field1165 && !field1265 && field1097 == 0) {
					field1253 = var107;
					field1254 = true;
					field1277.method278(2, field1253);
				}

				field1355 = var107;
				field1456 = -1;
				return true;
			}

			if (field1456 == 242) {
				int var108 = field1193.method230();
				int var109 = field1193.method230();
				if (field1165 && !field1265) {
					field1253 = var108;
					field1254 = false;
					field1277.method278(2, field1253);
					field1097 = var109;
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 111) {
				long var110 = field1193.method234();
				int var112 = field1193.method228();
				String var113 = class52.method303(class52.method300(var110));
				for (int var114 = 0; var114 < field1416; var114++) {
					if (field1098[var114] == var110) {
						if (field1241[var114] != var112) {
							field1241[var114] = var112;
							field1394 = true;

							if (var112 > 0) {
								method539(var113 + " has logged in.", "", 5);
							}

							if (var112 == 0) {
								method539(var113 + " has logged out.", "", 5);
							}
						}

						var113 = null;
						break;
					}
				}

				if (var113 != null && field1416 < 200) {
					field1098[field1416] = var110;
					field1354[field1416] = var113;
					field1241[field1416] = var112;
					field1416++;
					field1394 = true;
				}

				boolean var115 = false;
				while (!var115) {
					var115 = true;
					for (int var116 = 0; var116 < field1416 - 1; var116++) {
						if (field1241[var116] != field1262 && field1241[var116 + 1] == field1262 || field1241[var116] == 0 && field1241[var116 + 1] != 0) {
							int var117 = field1241[var116];
							field1241[var116] = field1241[var116 + 1];
							field1241[var116 + 1] = var117;
							String var118 = field1354[var116];
							field1354[var116] = field1354[var116 + 1];
							field1354[var116 + 1] = var118;
							long var119 = field1098[var116];
							field1098[var116] = field1098[var116 + 1];
							field1098[var116 + 1] = var119;
							field1394 = true;
							var115 = false;
						}
					}
				}

				field1456 = -1;
				return true;
			}

			if (field1456 == 138) {
				field1237 = field1193.method228();
				field1394 = true;
				field1284 = true;
				field1456 = -1;
				return true;
			}

			if (field1456 == 209) {
				int var121 = field1193.method230();
				int var122 = field1193.method230();
				if (field1274 == var121 && field1275 == var122 && field1288 == 2) {
					field1456 = -1;
					return true;
				}

				field1274 = var121;
				field1275 = var122;
				field1385 = (field1274 - 6) * 8;
				field1386 = (field1275 - 6) * 8;
				field1329 = false;
				if ((field1274 / 8 == 48 || field1274 / 8 == 49) && field1275 / 8 == 48) {
					field1329 = true;
				}

				if (field1274 / 8 == 48 && field1275 / 8 == 148) {
					field1329 = true;
				}

				field1288 = 1;
				field1119 = System.currentTimeMillis();
				field1375.method257();
				field1319.method200(151, 257, "Loading - please wait.", 0);
				field1319.method200(150, 256, "Loading - please wait.", 0xFFFFFF);
				field1375.method258(4, field9, 4);
				int var123 = 0;
				for (int var124 = (field1274 - 6) / 8; var124 <= (field1274 + 6) / 8; var124++) {
					for (int var125 = (field1275 - 6) / 8; var125 <= (field1275 + 6) / 8; var125++) {
						var123++;
					}
				}

				field1189 = new byte[var123][];
				field1430 = new byte[var123][];
				field1059 = new int[var123];
				field1060 = new int[var123];
				field1061 = new int[var123];
				int var126 = 0;
				for (int var127 = (field1274 - 6) / 8; var127 <= (field1274 + 6) / 8; var127++) {
					for (int var128 = (field1275 - 6) / 8; var128 <= (field1275 + 6) / 8; var128++) {
						field1059[var126] = (var127 << 8) + var128;

						if (field1329 && (var128 == 49 || var128 == 149 || var128 == 147 || var127 == 50 || var127 == 49 && var128 == 47)) {
							field1060[var126] = -1;
							field1061[var126] = -1;
							var126++;
						} else {
							int var129 = field1060[var126] = field1277.method273(var127, 0, var128);
							if (var129 != -1) {
								field1277.method278(3, var129);
							}

							int var130 = field1061[var126] = field1277.method273(var127, 1, var128);
							if (var130 != -1) {
								field1277.method278(3, var130);
							}

							var126++;
						}
					}
				}

				int var131 = field1385 - field1387;
				int var132 = field1386 - field1388;
				field1387 = field1385;
				field1388 = field1386;

				for (int var133 = 0; var133 < 16384; var133++) {
					class26 var134 = field1090[var133];
					if (var134 != null) {
						for (int var135 = 0; var135 < 10; var135++) {
							var134.field410[var135] -= var131;
							var134.field411[var135] -= var132;
						}

						var134.field360 -= var131 * 128;
						var134.field361 -= var132 * 128;
					}
				}

				for (int var136 = 0; var136 < field1133; var136++) {
					class27 var137 = field1135[var136];
					if (var137 != null) {
						for (int var138 = 0; var138 < 10; var138++) {
							var137.field410[var138] -= var131;
							var137.field411[var138] -= var132;
						}

						var137.field360 -= var131 * 128;
						var137.field361 -= var132 * 128;
					}
				}

				field1292 = true;
				byte var139 = 0;
				byte var140 = 104;
				byte var141 = 1;
				if (var131 < 0) {
					var139 = 103;
					var140 = -1;
					var141 = -1;
				}

				byte var142 = 0;
				byte var143 = 104;
				byte var144 = 1;
				if (var132 < 0) {
					var142 = 103;
					var143 = -1;
					var144 = -1;
				}

				for (int var145 = var139; var145 != var140; var145 += var141) {
					for (int var146 = var142; var146 != var143; var146 += var144) {
						int var147 = var131 + var145;
						int var148 = var132 + var146;
						for (int var149 = 0; var149 < 4; var149++) {
							if (var147 >= 0 && var148 >= 0 && var147 < 104 && var148 < 104) {
								field1100[var149][var145][var146] = field1100[var149][var147][var148];
							} else {
								field1100[var149][var145][var146] = null;
							}
						}
					}
				}

				for (class41 var150 = (class41) field1399.method247(); var150 != null; var150 = (class41) field1399.method249()) {
					var150.field644 -= var131;
					var150.field645 -= var132;
					if (var150.field644 < 0 || var150.field645 < 0 || var150.field644 >= 104 || var150.field645 >= 104) {
						var150.method106();
					}
				}

				if (field1230 != 0) {
					field1230 -= var131;
					field1231 -= var132;
				}

				field1167 = false;
				field1456 = -1;
				return true;
			}

			if (field1456 == 24) {
				field1150 = field1193.method228();
				field1467 = field1193.method228();
				field1192 = field1193.method228();
				field1203 = true;
				field1286 = true;
				field1456 = -1;
				return true;
			}

			if (field1456 == 41) {
				int var151 = field1193.method230();
				String var152 = field1193.method235();
				class4.field56[var151].field97 = var152;

				if (field1378[field1237] == class4.field56[var151].field62) {
					field1394 = true;
				}

				field1456 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1456 + "," + field1455 + " - " + field1056 + "," + field1057);
			method475();
		} catch (IOException var157) {
			method449();
		} catch (Exception var158) {
			String var154 = "T2 - " + field1456 + "," + field1056 + "," + field1057 + " - " + field1455 + "," + (field1363.field410[0] + field1385) + "," + (field1363.field411[0] + field1386) + " - ";
			for (int var155 = 0; var155 < field1455 && var155 < 50; var155++) {
				var154 = var154 + field1193.field624[var155] + ",";
			}

			signlink.reporterror(var154);
			method475();
		}

		return true;
	}

	@ObfuscatedName("client.c(Lmb;II)V")
	public final void method505(class39 arg0, int arg1) {
		for (int var3 = 0; var3 < field1138; var3++) {
			int var4 = field1139[var3];
			class27 var5 = field1135[var4];
			int var6 = arg0.method228();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method228() << 8;
			}

			method522(var4, var6, arg0, var5);
		}
	}

	@ObfuscatedName("client.b(IILmb;)V")
	public final void method506(int arg0, class39 arg1) {
		while (arg1.field626 + 10 < arg0 * 8) {
			int var3 = arg1.method239(11);
			if (var3 == 2047) {
				break;
			}

			if (field1135[var3] == null) {
				field1135[var3] = new class27();
				if (field1140[var3] != null) {
					field1135[var3].method116(field1140[var3]);
				}
			}

			field1137[field1136++] = var3;
			class27 var4 = field1135[var3];
			var4.field405 = field1058;
			int var5 = arg1.method239(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method239(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method239(1);
			var4.method110(var7 == 1, field1363.field411[0] + var6, field1363.field410[0] + var5);
			int var8 = arg1.method239(1);
			if (var8 == 1) {
				field1139[field1138++] = var3;
			}
		}

		arg1.method240();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method507() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1360 + field1315 & 0x7FF;
				int var4 = class34.field576[var3];
				int var5 = class34.field577[var3];
				var4 = (field1389 + 256) * var4 >> 8;
				var5 = (field1389 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1363.field360 + var6 >> 7;
				int var9 = field1363.field361 - var7 >> 7;
				boolean var10 = method437(field1363.field411[0], var8, true, 0, 0, field1363.field410[0], var9, 0, 0, 0, 1);
				if (var10) {
					field1194.method218(var1);
					field1194.method218(var2);
					field1194.method219(field1315);
					field1194.method218(57);
					field1194.method218(field1360);
					field1194.method218(field1389);
					field1194.method218(89);
					field1194.method219(field1363.field360);
					field1194.method219(field1363.field361);
					field1194.method218(field1444);
					field1194.method218(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIB)V")
	public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1117.method198(arg0, arg1);
		field1118.method198(arg0, arg1 + arg3 - 16);
		class33.method156(16, field1243, arg1 + 16, arg3 - 32, arg0);
		int var6 = (arg3 - 32) * arg3 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg2 / (arg4 - arg3);
		class33.method156(16, field1214, arg1 + var7 + 16, var6, arg0);
		class33.method161(arg1 + var7 + 16, arg0, field1258, var6);
		class33.method161(arg1 + var7 + 16, arg0 + 1, field1258, var6);
		class33.method159(field1258, 16, arg0, arg1 + var7 + 16);
		class33.method159(field1258, 16, arg0, arg1 + var7 + 17);
		class33.method161(arg1 + var7 + 16, arg0 + 15, field1102, var6);
		class33.method161(arg1 + var7 + 17, arg0 + 14, field1102, var6 - 1);
		class33.method159(field1102, 16, arg0, arg1 + var7 + var6 + 15);
		class33.method159(field1102, 15, arg0 + 1, arg1 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.B(I)V")
	public final void method509() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.C(I)V")
	public final void method510() {
		for (class30 var1 = (class30) field1309.method247(); var1 != null; var1 = (class30) field1309.method249()) {
			if (field1434 != var1.field452 || field1058 > var1.field458) {
				var1.method106();
			} else if (field1058 >= var1.field457) {
				if (var1.field461 > 0) {
					class26 var2 = field1090[var1.field461 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method119(var2.field360, method515(var2.field360, var2.field361, var1.field452) - var1.field456, var2.field361, field1058);
					}
				}

				if (var1.field461 < 0) {
					int var3 = -var1.field461 - 1;
					class27 var4;
					if (field1421 == var3) {
						var4 = field1363;
					} else {
						var4 = field1135[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method119(var4.field360, method515(var4.field360, var4.field361, var1.field452) - var1.field456, var4.field361, field1058);
					}
				}

				var1.method120(field1166);
				field1266.method61(field1434, (int) var1.field463, var1, (int) var1.field465, false, (int) var1.field464, var1.field471, 60, -1);
			}
		}

		field1352++;
		if (field1352 > 1174) {
			field1352 = 0;
			field1194.method217(51);
			field1194.method218(0);
			int var5 = field1194.field625;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1194.method219(11499);
			}

			field1194.method219(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1194.method218(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1194.method218(94);
			}

			field1194.method219(51693);
			field1194.method218(16);
			field1194.method219(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1194.method218(65);
			}

			field1194.method218((int) (Math.random() * 256.0D));
			field1194.method219(22990);
			field1194.method227(field1194.field625 - var5);
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 257);

			if (arg0.length == 5) {
				field1262 = Integer.parseInt(arg0[0]);
				field1263 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method518();
				} else if (arg0[2].equals("highmem")) {
					method536();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1264 = false;
				} else if (arg0[3].equals("members")) {
					field1264 = true;
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

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method511(int arg0, class39 arg1) {
		while (arg1.field626 + 21 < arg0 * 8) {
			int var3 = arg1.method239(14);
			if (var3 == 16383) {
				break;
			}

			if (field1090[var3] == null) {
				field1090[var3] = new class26();
			}

			class26 var4 = field1090[var3];
			field1092[field1091++] = var3;
			var4.field405 = field1058;
			var4.field415 = class60.method339(arg1.method239(11));
			var4.field364 = var4.field415.field879;
			var4.field408 = var4.field415.field901;
			var4.field367 = var4.field415.field883;
			var4.field368 = var4.field415.field884;
			var4.field369 = var4.field415.field885;
			var4.field370 = var4.field415.field886;
			var4.field365 = var4.field415.field882;
			int var5 = arg1.method239(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method239(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method110(false, field1363.field411[0] + var6, field1363.field410[0] + var5);
			int var7 = arg1.method239(1);
			if (var7 == 1) {
				field1139[field1138++] = var3;
			}
		}

		arg1.method240();
	}

	@ObfuscatedName("client.D(I)V")
	public final void method512() {
		int var1 = field1323 * 128 + 64;
		int var2 = field1324 * 128 + 64;
		int var3 = method515(var1, var2, field1434) - field1325;

		if (field1435 < var1) {
			field1435 += (var1 - field1435) * field1327 / 1000 + field1326;
			if (field1435 > var1) {
				field1435 = var1;
			}
		}

		if (field1435 > var1) {
			field1435 -= (field1435 - var1) * field1327 / 1000 + field1326;
			if (field1435 < var1) {
				field1435 = var1;
			}
		}

		if (field1436 < var3) {
			field1436 += (var3 - field1436) * field1327 / 1000 + field1326;
			if (field1436 > var3) {
				field1436 = var3;
			}
		}

		if (field1436 > var3) {
			field1436 -= (field1436 - var3) * field1327 / 1000 + field1326;
			if (field1436 < var3) {
				field1436 = var3;
			}
		}

		if (field1437 < var2) {
			field1437 += (var2 - field1437) * field1327 / 1000 + field1326;
			if (field1437 > var2) {
				field1437 = var2;
			}
		}

		if (field1437 > var2) {
			field1437 -= (field1437 - var2) * field1327 / 1000 + field1326;
			if (field1437 < var2) {
				field1437 = var2;
			}
		}

		int var4 = field1109 * 128 + 64;
		int var5 = field1110 * 128 + 64;
		int var6 = method515(var4, var5, field1434) - field1111;
		int var7 = var4 - field1435;
		int var8 = var6 - field1436;
		int var9 = var5 - field1437;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1438 < var11) {
			field1438 += (var11 - field1438) * field1113 / 1000 + field1112;
			if (field1438 > var11) {
				field1438 = var11;
			}
		}

		if (field1438 > var11) {
			field1438 -= (field1438 - var11) * field1113 / 1000 + field1112;
			if (field1438 < var11) {
				field1438 = var11;
			}
		}

		int var13 = var12 - field1439;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1439 += field1113 * var13 / 1000 + field1112;
			field1439 &= 0x7FF;
		}

		if (var13 < 0) {
			field1439 -= -var13 * field1113 / 1000 + field1112;
			field1439 &= 0x7FF;
		}

		int var14 = var12 - field1439;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1439 = var12;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method513() {
		field1328 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1383[var1] = -1;
			for (int var2 = 0; var2 < class65.field970; var2++) {
				if (!class65.field971[var2].field977 && class65.field971[var2].field972 == var1 + (field1313 ? 0 : 7)) {
					field1383[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method514(int arg0) {
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

	@ObfuscatedName("client.a(Z)V")
	public final void method9() {
		if (field1221 || field1322 || field1101) {
			method446();
		} else {
			field1422++;

			if (field1452) {
				method499();
			} else {
				method428(false);
			}

			field1095 = 0;
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method515(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field1208[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field1371[var6][var4][var5] + field1371[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1371[var6][var4][var5 + 1] + field1371[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method516() {
		int var1 = field1446;
		int var2 = field1447;
		int var3 = field1448;
		int var4 = field1449;
		int var5 = 0x5D5447;
		class33.method156(var3, var5, var2, var4, var1);
		class33.method156(var3 - 2, 0, var2 + 1, 16, var1 + 1);
		class33.method157(var1 + 1, var3 - 2, var4 - 19, var2 + 18, 0);
		field1320.method203("Choose Option", var5, var2 + 14, var1 + 3);
		int var6 = field17;
		int var7 = field18;
		if (field1445 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1445 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1445 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1261; var8++) {
			int var9 = (field1261 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1320.method205(var9, field1278[var8], var1 + 3, true, var10);
		}
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method517(int arg0, int arg1) {
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

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1263 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.i(B)V")
	public static final void method518() {
		class18.field258 = true;
		class34.field567 = true;
		field1265 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public final void method519(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1205.length; var3++) {
			field1205[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1205[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1206[var9] = (field1205[var9 - 1] + field1205[var9 + 1] + field1205[var9 - 128] + field1205[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1205;
			field1205 = field1206;
			field1206 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field600; var12++) {
				for (int var13 = 0; var13 < arg0.field599; var13++) {
					if (arg0.field597[var11++] != 0) {
						int var14 = var13 + arg0.field601 + 16;
						int var15 = var12 + arg0.field602 + 16;
						int var16 = (var15 << 7) + var14;
						field1205[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method520() {
		field1370++;
		if (field1370 > 192) {
			field1370 = 0;
			field1194.method217(226);
			field1194.method218(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1062 != -1 && field1236 == field1062) {
						break;
					}

					if (field1450) {
						if (var1 >= 32 && var1 <= 122 && field1225.length() < 80) {
							field1225 = field1225 + (char) var1;
							field1286 = true;
						}

						if (var1 == 8 && field1225.length() > 0) {
							field1225 = field1225.substring(0, field1225.length() - 1);
							field1286 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1450 = false;
							field1286 = true;

							if (field1332 == 1) {
								long var2 = class52.method299(field1225);
								method431(var2);
							}

							if (field1332 == 2 && field1416 > 0) {
								long var4 = class52.method299(field1225);
								method443(var4);
							}

							if (field1332 == 3 && field1225.length() > 0) {
								field1194.method217(214);
								field1194.method218(0);
								int var6 = field1194.field625;
								field1194.method224(field1351);
								class53.method307(field1225, field1194);
								field1194.method227(field1194.field625 - var6);
								field1225 = class52.method304(field1225);
								field1225 = class72.method398(field1225);
								method539(field1225, class52.method303(class52.method300(field1351)), 6);

								if (field1467 == 2) {
									field1467 = 1;
									field1203 = true;
									field1194.method217(129);
									field1194.method218(field1150);
									field1194.method218(field1467);
									field1194.method218(field1192);
								}
							}

							if (field1332 == 4 && field1305 < 100) {
								long var7 = class52.method299(field1225);
								method460(var7);
							}

							if (field1332 == 5 && field1305 > 0) {
								long var9 = class52.method299(field1225);
								method472(var9);
							}
						}
					} else if (field1311) {
						if (var1 >= 48 && var1 <= 57 && field1428.length() < 10) {
							field1428 = field1428 + (char) var1;
							field1286 = true;
						}

						if (var1 == 8 && field1428.length() > 0) {
							field1428 = field1428.substring(0, field1428.length() - 1);
							field1286 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1428.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1428);
								} catch (Exception var16) {
								}

								field1194.method217(161);
								field1194.method222(var11);
							}

							field1311 = false;
							field1286 = true;
						}
					} else if (field1103 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1350.length() < 80) {
							field1350 = field1350 + (char) var1;
							field1286 = true;
						}

						if (var1 == 8 && field1350.length() > 0) {
							field1350 = field1350.substring(0, field1350.length() - 1);
							field1286 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1350.length() > 0) {
							if (field1407 == 2) {
								if (field1350.equals("::clientdrop")) {
									method449();
								}

								if (field1350.equals("::lag")) {
									method447();
								}

								if (field1350.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1277.method271(2); var12++) {
										field1277.method281(var12, (byte) 1, 2);
									}
								}
							}

							if (field1350.startsWith("::")) {
								field1194.method217(86);
								field1194.method218(field1350.length() - 1);
								field1194.method225(field1350.substring(2));
							} else {
								byte var13 = 0;
								if (field1350.startsWith("yellow:")) {
									var13 = 0;
									field1350 = field1350.substring(7);
								}

								if (field1350.startsWith("red:")) {
									var13 = 1;
									field1350 = field1350.substring(4);
								}

								if (field1350.startsWith("green:")) {
									var13 = 2;
									field1350 = field1350.substring(6);
								}

								if (field1350.startsWith("cyan:")) {
									var13 = 3;
									field1350 = field1350.substring(5);
								}

								if (field1350.startsWith("purple:")) {
									var13 = 4;
									field1350 = field1350.substring(7);
								}

								if (field1350.startsWith("white:")) {
									var13 = 5;
									field1350 = field1350.substring(6);
								}

								if (field1350.startsWith("flash1:")) {
									var13 = 6;
									field1350 = field1350.substring(7);
								}

								if (field1350.startsWith("flash2:")) {
									var13 = 7;
									field1350 = field1350.substring(7);
								}

								if (field1350.startsWith("flash3:")) {
									var13 = 8;
									field1350 = field1350.substring(7);
								}

								if (field1350.startsWith("glow1:")) {
									var13 = 9;
									field1350 = field1350.substring(6);
								}

								if (field1350.startsWith("glow2:")) {
									var13 = 10;
									field1350 = field1350.substring(6);
								}

								if (field1350.startsWith("glow3:")) {
									var13 = 11;
									field1350 = field1350.substring(6);
								}

								byte var14 = 0;
								if (field1350.startsWith("wave:")) {
									var14 = 1;
									field1350 = field1350.substring(5);
								}

								if (field1350.startsWith("scroll:")) {
									var14 = 2;
									field1350 = field1350.substring(7);
								}

								field1194.method217(83);
								field1194.method218(0);
								int var15 = field1194.field625;
								field1194.method218(var13);
								field1194.method218(var14);
								class53.method307(field1350, field1194);
								field1194.method227(field1194.field625 - var15);
								field1350 = class52.method304(field1350);
								field1350 = class72.method398(field1350);
								field1363.field372 = field1350;
								field1363.field374 = var13;
								field1363.field375 = var14;
								field1363.field373 = 150;

								if (field1407 == 2) {
									method539(field1363.field372, "@cr2@" + field1363.field416, 2);
								} else if (field1407 == 1) {
									method539(field1363.field372, "@cr1@" + field1363.field416, 2);
								} else {
									method539(field1363.field372, field1363.field416, 2);
								}

								if (field1150 == 2) {
									field1150 = 3;
									field1203 = true;
									field1194.method217(129);
									field1194.method218(field1150);
									field1194.method218(field1467);
									field1194.method218(field1192);
								}
							}

							field1350 = "";
							field1286 = true;
						}
					}
				}

				if (var1 == 8 && field1285.length() > 0) {
					field1285 = field1285.substring(0, field1285.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1285.length() < 12) {
				field1285 = field1285 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method521() {
		field1310++;
		method551(true);
		method555(true);
		method551(false);
		method555(false);
		method510();
		method467();

		if (!field1167) {
			int var1 = field1314;
			if (field1204 / 256 > var1) {
				var1 = field1204 / 256;
			}

			if (field1414[4] && field1163[4] + 128 > var1) {
				var1 = field1163[4] + 128;
			}

			int var2 = field1315 + field1223 & 0x7FF;
			method501(field1200, var2, method515(field1363.field360, field1363.field361, field1434) - 50, field1199, var1 * 3 + 600, var1);
		}

		int var3;
		if (field1167) {
			var3 = method503();
		} else {
			var3 = method502();
		}

		int var4 = field1435;
		int var5 = field1436;
		int var6 = field1437;
		int var7 = field1438;
		int var8 = field1439;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1414[var9]) {
				int var10 = (int) (Math.random() * (field1151[var9] * 2 + 1) + Math.sin(field1089[var9] / 100.0D * field1257[var9]) * field1163[var9] - field1151[var9]);
				if (var9 == 0) {
					field1435 += var10;
				}

				if (var9 == 1) {
					field1436 += var10;
				}

				if (var9 == 2) {
					field1437 += var10;
				}

				if (var9 == 3) {
					field1439 = field1439 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1438 += var10;
					if (field1438 < 128) {
						field1438 = 128;
					}

					if (field1438 > 383) {
						field1438 = 383;
					}
				}
			}
		}

		int var11 = class34.field587;
		class31.field539 = true;
		class31.field542 = 0;
		class31.field540 = field17 - 4;
		class31.field541 = field18 - 4;
		class33.method154();
		field1266.method89(field1437, field1435, field1436, field1438, var3, field1439);
		field1266.method64();
		method526();
		method442();
		method528(var11);
		method448();
		field1375.method258(4, field9, 4);
		field1435 = var4;
		field1436 = var5;
		field1437 = var6;
		field1438 = var7;
		field1439 = var8;
	}

	@ObfuscatedName("client.a(IIILmb;Lab;)V")
	public final void method522(int arg0, int arg1, class39 arg2, class27 arg3) {
		if ((arg1 & 0x1) == 1) {
			int var5 = arg2.method228();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg2.method237(var5, 0, var6);
			field1140[arg0] = var7;
			arg3.method116(var7);
		}

		if ((arg1 & 0x2) == 2) {
			int var8 = arg2.method230();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg3.field388 == var8) {
				arg3.field392 = 0;
			}

			int var9 = arg2.method228();
			if (arg3.field388 == var8 && var8 != -1) {
				int var10 = class67.field991[var8].field1005;
				if (var10 == 1) {
					arg3.field389 = 0;
					arg3.field390 = 0;
					arg3.field391 = var9;
					arg3.field392 = 0;
				}

				if (var10 == 2) {
					arg3.field392 = 0;
				}
			} else if (var8 == -1 || arg3.field388 == -1 || class67.field991[var8].field999 >= class67.field991[arg3.field388].field999) {
				arg3.field388 = var8;
				arg3.field389 = 0;
				arg3.field390 = 0;
				arg3.field391 = var9;
				arg3.field392 = 0;
				arg3.field414 = arg3.field409;
			}
		}

		if ((arg1 & 0x4) == 4) {
			arg3.field382 = arg2.method230();
			if (arg3.field382 == 0xFFFF) {
				arg3.field382 = -1;
			}
		}

		if ((arg1 & 0x8) == 8) {
			arg3.field372 = arg2.method235();
			arg3.field374 = 0;
			arg3.field375 = 0;
			arg3.field373 = 150;
			method539(arg3.field372, arg3.field416, 2);
		}

		if ((arg1 & 0x10) == 0x10) {
			int var11 = arg2.method228();
			int var12 = arg2.method228();
			arg3.method114(field1058, var11, var12);
			arg3.field379 = field1058 + 300;
			arg3.field380 = arg2.method228();
			arg3.field381 = arg2.method228();
		}

		if ((arg1 & 0x20) == 0x20) {
			arg3.field383 = arg2.method230();
			arg3.field384 = arg2.method230();
		}

		if ((arg1 & 0x40) == 0x40) {
			int var13 = arg2.method230();
			int var14 = arg2.method228();
			int var15 = arg2.method228();
			int var16 = arg2.field625;

			if (arg3.field416 != null && arg3.field417) {
				long var17 = class52.method299(arg3.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1305; var20++) {
						if (field1177[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1142 == 0) {
					try {
						String var21 = class53.method306(arg2, var15);
						var21 = class72.method398(var21);
						arg3.field372 = var21;
						arg3.field374 = var13 >> 8;
						arg3.field375 = var13 & 0xFF;
						arg3.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method539(var21, "@cr2@" + arg3.field416, 1);
						} else if (var14 == 1) {
							method539(var21, "@cr1@" + arg3.field416, 1);
						} else {
							method539(var21, arg3.field416, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field625 = var15 + var16;
		}

		if ((arg1 & 0x100) == 0x100) {
			arg3.field393 = arg2.method230();
			int var23 = arg2.method233();
			arg3.field397 = var23 >> 16;
			arg3.field396 = (var23 & 0xFFFF) + field1058;
			arg3.field394 = 0;
			arg3.field395 = 0;

			if (arg3.field396 > field1058) {
				arg3.field394 = -1;
			}

			if (arg3.field393 == 0xFFFF) {
				arg3.field393 = -1;
			}
		}

		if ((arg1 & 0x200) == 0x200) {
			arg3.field398 = arg2.method228();
			arg3.field400 = arg2.method228();
			arg3.field399 = arg2.method228();
			arg3.field401 = arg2.method228();
			arg3.field402 = arg2.method230() + field1058;
			arg3.field403 = arg2.method230() + field1058;
			arg3.field404 = arg2.method228();
			arg3.method112();
		}

		if ((arg1 & 0x400) == 0x400) {
			int var24 = arg2.method228();
			int var25 = arg2.method228();
			arg3.method114(field1058, var24, var25);
			arg3.field379 = field1058 + 300;
			arg3.field380 = arg2.method228();
			arg3.field381 = arg2.method228();
		}
	}

	public final void run() {
		if (field1226) {
			method556();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method523() {
		class58.field863.method103();
		class58.field864.method103();
		class60.field902.method103();
		class61.field948.method103();
		class61.field949.method103();
		class27.field438.method103();
		class69.field1022.method103();
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method524(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1278[field1261] = "Remove @whi@" + arg0.field97;
				field1187[field1261] = 884;
				field1261++;
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

		field1278[field1261] = "Remove @whi@" + field1354[var2];
		field1187[field1261] = 513;
		field1261++;
		field1278[field1261] = "Message @whi@" + field1354[var2];
		field1187[field1261] = 902;
		field1261++;
		return true;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method525() {
		field1239 = new class36(field1293, "titlebox", 0);
		field1240 = new class36(field1293, "titlebutton", 0);
		field1125 = new class36[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1125[var1] = new class36(field1293, "runes", var1);
		}

		field1346 = new class35(128, 265);
		field1347 = new class35(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1346.field590[var2] = field1336.field658[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1347.field590[var3] = field1337.field658[var3];
		}

		field1441 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1441[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1441[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1441[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1441[var7 + 192] = 0xFFFFFF;
		}

		field1442 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1442[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1442[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1442[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1442[var11 + 192] = 0xFFFFFF;
		}

		field1443 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1443[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1443[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1443[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1443[var15 + 192] = 0xFFFFFF;
		}

		field1440 = new int[256];
		field1205 = new int[32768];
		field1206 = new int[32768];
		method519(null);
		field1179 = new int[32768];
		field1180 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1141) {
			field1226 = true;
			field1141 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method526() {
		field1077 = 0;
		for (int var1 = -1; var1 < field1136 + field1091; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1363;
			} else if (var1 < field1136) {
				var2 = field1135[field1137[var1]];
			} else {
				var2 = field1090[field1092[var1 - field1136]];
			}

			if (var2 != null && var2.method113()) {
				if (var1 >= field1136) {
					class60 var6 = ((class26) var2).field415;
					if (var6.field900 >= 0 && var6.field900 < field1106.length) {
						method432(var2, var2.field406 + 15);

						if (field1392 > -1) {
							field1106[var6.field900].method185(field1392 - 12, field1393 - 30);
						}
					}

					if (field1065 == 1 && field1092[var1 - field1136] == field1432 && field1058 % 20 < 10) {
						method432(var2, var2.field406 + 15);

						if (field1392 > -1) {
							field1106[2].method185(field1392 - 12, field1393 - 28);
						}
					}
				} else {
					int var3 = 30;
					class27 var4 = (class27) var2;
					if (var4.field419 != 0) {
						method432(var2, var2.field406 + 15);

						if (field1392 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field419 & 1 << var5) != 0) {
									field1106[var5].method185(field1392 - 12, field1393 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1065 == 10 && field1137[var1] == field1398) {
						method432(var2, var2.field406 + 15);

						if (field1392 > -1) {
							field1106[7].method185(field1392 - 12, field1393 - var3);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1136 || field1150 == 0 || field1150 == 3 || field1150 == 1 && method455(((class27) var2).field416))) {
					method432(var2, var2.field406);

					if (field1392 > -1 && field1077 < field1078) {
						field1082[field1077] = field1320.method202(var2.field372) / 2;
						field1081[field1077] = field1320.field612;
						field1079[field1077] = field1392;
						field1080[field1077] = field1393;
						field1083[field1077] = var2.field374;
						field1084[field1077] = var2.field375;
						field1085[field1077] = var2.field373;
						field1086[field1077++] = var2.field372;

						if (field1213 == 0 && var2.field375 == 1) {
							field1081[field1077] += 10;
							field1080[field1077] += 5;
						}

						if (field1213 == 0 && var2.field375 == 2) {
							field1082[field1077] = 60;
						}
					}
				}

				if (var2.field379 > field1058) {
					method432(var2, var2.field406 + 15);

					if (field1392 > -1) {
						int var7 = var2.field380 * 30 / var2.field381;
						if (var7 > 30) {
							var7 = 30;
						}

						class33.method156(var7, 0xFF00, field1393 - 3, 5, field1392 - 15);
						class33.method156(30 - var7, 0xFF0000, field1393 - 3, 5, field1392 + var7 - 15);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field378[var8] > field1058) {
						method432(var2, var2.field406 / 2);

						if (field1392 > -1) {
							if (var8 == 1) {
								field1393 -= 20;
							}

							if (var8 == 2) {
								field1392 -= 15;
								field1393 -= 10;
							}

							if (var8 == 3) {
								field1392 += 15;
								field1393 -= 10;
							}

							field1423[var2.field377[var8]].method185(field1392 - 12, field1393 - 12);
							field1318.method200(field1393 + 4, field1392, String.valueOf(var2.field376[var8]), 0);
							field1318.method200(field1393 + 3, field1392 - 1, String.valueOf(var2.field376[var8]), 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1077; var9++) {
			int var10 = field1079[var9];
			int var11 = field1080[var9];
			int var12 = field1082[var9];
			int var13 = field1081[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1080[var15] - field1081[var15] && var11 - var13 < field1080[var15] + 2 && var10 - var12 < field1082[var15] + field1079[var15] && var10 + var12 > field1079[var15] - field1082[var15] && field1080[var15] - field1081[var15] < var11) {
						var11 = field1080[var15] - field1081[var15];
						var14 = true;
					}
				}
			}

			field1392 = field1079[var9];
			field1393 = field1080[var9] = var11;
			String var16 = field1086[var9];
			if (field1213 == 0) {
				int var17 = 0xFFFF00;
				if (field1083[var9] < 6) {
					var17 = field1272[field1083[var9]];
				}

				if (field1083[var9] == 6) {
					var17 = field1310 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1083[var9] == 7) {
					var17 = field1310 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1083[var9] == 8) {
					var17 = field1310 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1083[var9] == 9) {
					int var18 = 150 - field1085[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1083[var9] == 10) {
					int var19 = 150 - field1085[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1083[var9] == 11) {
					int var20 = 150 - field1085[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1084[var9] == 0) {
					field1320.method200(field1393 + 1, field1392, var16, 0);
					field1320.method200(field1393, field1392, var16, var17);
				}

				if (field1084[var9] == 1) {
					field1320.method204(var16, field1392, field1310, field1393 + 1, 0);
					field1320.method204(var16, field1392, field1310, field1393, var17);
				}

				if (field1084[var9] == 2) {
					int var21 = field1320.method202(var16);
					int var22 = (150 - field1085[var9]) * (var21 + 100) / 150;
					class33.method153(334, 0, field1392 - 50, field1392 + 50);
					field1320.method203(var16, 0, field1393 + 1, field1392 + 50 - var22);
					field1320.method203(var16, var17, field1393, field1392 + 50 - var22);
					class33.method152();
				}
			} else {
				field1320.method200(field1393 + 1, field1392, var16, 0);
				field1320.method200(field1393, field1392, var16, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;IZ)V")
	public final void method527(class39 arg0, int arg1) {
		int var3 = arg0.method239(8);
		if (var3 < field1136) {
			for (int var4 = var3; var4 < field1136; var4++) {
				field1280[field1279++] = field1137[var4];
			}
		}

		if (var3 > field1136) {
			signlink.reporterror(field1120 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1136 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1137[var5];
			class27 var7 = field1135[var6];
			int var8 = arg0.method239(1);
			if (var8 == 0) {
				field1137[field1136++] = var6;
				var7.field405 = field1058;
			} else {
				int var9 = arg0.method239(2);
				if (var9 == 0) {
					field1137[field1136++] = var6;
					var7.field405 = field1058;
					field1139[field1138++] = var6;
				} else if (var9 == 1) {
					field1137[field1136++] = var6;
					var7.field405 = field1058;
					int var10 = arg0.method239(3);
					var7.method111(var10, false);
					int var11 = arg0.method239(1);
					if (var11 == 1) {
						field1139[field1138++] = var6;
					}
				} else if (var9 == 2) {
					field1137[field1136++] = var6;
					var7.field405 = field1058;
					int var12 = arg0.method239(3);
					var7.method111(var12, true);
					int var13 = arg0.method239(3);
					var7.method111(var13, true);
					int var14 = arg0.method239(1);
					if (var14 == 1) {
						field1139[field1138++] = var6;
					}
				} else if (var9 == 3) {
					field1280[field1279++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method10() {
		field1210 = true;
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method528(int arg0) {
		if (!field1265) {
			if (class34.field586[17] >= arg0) {
				class36 var2 = class34.field580[17];
				int var3 = var2.field600 * var2.field599 - 1;
				int var4 = field1166 * var2.field599 * 2;
				byte[] var5 = var2.field597;
				byte[] var6 = field1260;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field597 = var6;
				field1260 = var5;
				class34.method170(17);
			}

			if (class34.field586[24] >= arg0) {
				class36 var8 = class34.field580[24];
				int var9 = var8.field600 * var8.field599 - 1;
				int var10 = field1166 * var8.field599 * 2;
				byte[] var11 = var8.field597;
				byte[] var12 = field1260;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field597 = var12;
				field1260 = var11;
				class34.method170(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method529() {
		if (field1288 == 2) {
			for (class41 var1 = (class41) field1399.method247(); var1 != null; var1 = (class41) field1399.method249()) {
				if (var1.field653 > 0) {
					var1.field653--;
				}

				if (var1.field653 != 0) {
					if (var1.field652 > 0) {
						var1.field652--;
					}

					if (var1.field652 == 0 && var1.field644 >= 1 && var1.field645 >= 1 && var1.field644 <= 102 && var1.field645 <= 102 && (var1.field649 < 0 || class3.method30(var1.field649, var1.field651))) {
						method553(var1.field645, var1.field643, var1.field644, var1.field642, var1.field650, var1.field651, var1.field649);
						var1.field652 = -1;

						if (var1.field649 == var1.field646 && var1.field646 == -1) {
							var1.method106();
						} else if (var1.field649 == var1.field646 && var1.field650 == var1.field647 && var1.field651 == var1.field648) {
							var1.method106();
						}
					}
				} else if (var1.field646 < 0 || class3.method30(var1.field646, var1.field648)) {
					method553(var1.field645, var1.field643, var1.field644, var1.field642, var1.field647, var1.field648, var1.field646);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method530() {
		try {
			int var1 = field1363.field360 + field1126;
			int var2 = field1363.field361 + field1424;
			if (field1199 - var1 < -500 || field1199 - var1 > 500 || field1200 - var2 < -500 || field1200 - var2 > 500) {
				field1199 = var1;
				field1200 = var2;
			}

			if (field1199 != var1) {
				field1199 += (var1 - field1199) / 16;
			}

			if (field1200 != var2) {
				field1200 += (var2 - field1200) / 16;
			}

			if (field27[1] == 1) {
				field1316 += (-field1316 - 24) / 2;
			} else if (field27[2] == 1) {
				field1316 += (24 - field1316) / 2;
			} else {
				field1316 /= 2;
			}

			if (field27[3] == 1) {
				field1317 += (12 - field1317) / 2;
			} else if (field27[4] == 1) {
				field1317 += (-field1317 - 12) / 2;
			} else {
				field1317 /= 2;
			}

			field1315 = field1316 / 2 + field1315 & 0x7FF;
			field1314 += field1317 / 2;
			if (field1314 < 128) {
				field1314 = 128;
			}

			if (field1314 > 383) {
				field1314 = 383;
			}

			int var3 = field1199 >> 7;
			int var4 = field1200 >> 7;
			int var5 = method515(field1199, field1200, field1434);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1434;
						if (var9 < 3 && (field1208[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1371[var9][var7][var8];
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

			if (var11 > field1204) {
				field1204 += (var11 - field1204) / 24;
			} else if (var11 < field1204) {
				field1204 += (var11 - field1204) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1363.field360 + "," + field1363.field361 + "," + field1199 + "," + field1200 + "," + field1274 + "," + field1275 + "," + field1385 + "," + field1386);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IIIZLd;ZIII)V")
	public final void method531(int arg0, int arg1, int arg2, class4 arg3, boolean arg4, int arg5, int arg6, int arg7) {
		if (field1116) {
			field1357 = 32;
		} else {
			field1357 = 0;
		}

		field1116 = false;
		if (arg1 >= arg2 && arg1 < arg2 + 16 && arg6 >= arg0 && arg6 < arg0 + 16) {
			arg3.field76 -= field1095 * 4;

			if (arg4) {
				field1394 = true;
				return;
			}
		} else if (arg1 >= arg2 && arg1 < arg2 + 16 && arg6 >= arg0 + arg5 - 16 && arg6 < arg0 + arg5) {
			arg3.field76 += field1095 * 4;

			if (arg4) {
				field1394 = true;
				return;
			}
		} else if (arg1 >= arg2 - field1357 && arg1 < arg2 + field1357 + 16 && arg6 >= arg0 + 16 && arg6 < arg0 + arg5 - 16 && field1095 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg0 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg3.field76 = (arg7 - arg5) * var10 / var11;

			if (arg4) {
				field1394 = true;
			}

			field1116 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method532(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method532(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method533(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method534() {
		field1141 = false;
		while (field1287) {
			field1141 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1239 = null;
		field1240 = null;
		field1125 = null;
		field1440 = null;
		field1441 = null;
		field1442 = null;
		field1443 = null;
		field1205 = null;
		field1206 = null;
		field1179 = null;
		field1180 = null;
		field1346 = null;
		field1347 = null;
	}

	@ObfuscatedName("client.a(Ld;BI)I")
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
					var8 = field1107[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1229[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1131[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class61.field903 && (!class61.method345(var11).field924 || field1264)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1353[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1108[field1229[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1353[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1363.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class68.field1006; var13++) {
						if (class68.field1008[var13]) {
							var8 += field1229[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class61.field903 && (!class61.method345(var15).field924 || field1264)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1220;
				}

				if (var7 == 12) {
					var8 = field1238;
				}

				if (var7 == 13) {
					int var17 = field1353[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class70 var20 = class70.field1024[var19];
					int var21 = var20.field1026;
					int var22 = var20.field1027;
					int var23 = var20.field1028;
					int var24 = field1235[var23 - var22];
					var8 = field1353[var21] >> var22 & var24;
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
					var8 = (field1363.field360 >> 7) + field1385;
				}

				if (var7 == 19) {
					var8 = (field1363.field361 >> 7) + field1386;
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

	@ObfuscatedName("client.I(I)V")
	public static final void method536() {
		class18.field258 = false;
		class34.field567 = false;
		field1265 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method537() {
		if (field1215 == 0 && field1245 == 0) {
			field1278[field1261] = "Walk here";
			field1187[field1261] = 718;
			field1185[field1261] = field17;
			field1186[field1261] = field18;
			field1261++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field542; var2++) {
			int var3 = class31.field543[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1266.method80(field1434, var4, var5, var3) >= 0) {
					class58 var8 = class58.method329(var7);
					if (field1215 == 1) {
						field1278[field1261] = "Use " + field1219 + " with @cya@" + var8.field832;
						field1187[field1261] = 810;
						field1188[field1261] = var3;
						field1185[field1261] = var4;
						field1186[field1261] = var5;
						field1261++;
					} else if (field1245 != 1) {
						if (var8.field848 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field848[var9] != null) {
									field1278[field1261] = var8.field848[var9] + " @cya@" + var8.field832;

									if (var9 == 0) {
										field1187[field1261] = 625;
									}

									if (var9 == 1) {
										field1187[field1261] = 721;
									}

									if (var9 == 2) {
										field1187[field1261] = 743;
									}

									if (var9 == 3) {
										field1187[field1261] = 357;
									}

									if (var9 == 4) {
										field1187[field1261] = 1071;
									}

									field1188[field1261] = var3;
									field1185[field1261] = var4;
									field1186[field1261] = var5;
									field1261++;
								}
							}
						}

						field1278[field1261] = "Examine @cya@" + var8.field832;
						field1187[field1261] = 1381;
						field1188[field1261] = var3;
						field1185[field1261] = var4;
						field1186[field1261] = var5;
						field1261++;
					} else if ((field1247 & 0x4) == 4) {
						field1278[field1261] = field1248 + " @cya@" + var8.field832;
						field1187[field1261] = 899;
						field1188[field1261] = var3;
						field1185[field1261] = var4;
						field1186[field1261] = var5;
						field1261++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1090[var7];
					if (var10.field415.field879 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1091; var11++) {
							class26 var12 = field1090[field1092[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field879 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method489(var12.field415, field1092[var11], var5, var4);
							}
						}

						for (int var13 = 0; var13 < field1136; var13++) {
							class27 var14 = field1135[field1137[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method547(var5, var4, field1137[var13], var14);
							}
						}
					}

					method489(var10.field415, var7, var5, var4);
				}

				if (var6 == 0) {
					class27 var15 = field1135[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1091; var16++) {
							class26 var17 = field1090[field1092[var16]];
							if (var17 != null && var17.field415.field879 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method489(var17.field415, field1092[var16], var5, var4);
							}
						}

						for (int var18 = 0; var18 < field1136; var18++) {
							class27 var19 = field1135[field1137[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method547(var5, var4, field1137[var18], var19);
							}
						}
					}

					method547(var5, var4, var7, var15);
				}

				if (var6 == 3) {
					class42 var20 = field1100[field1434][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method248(); var21 != null; var21 = (class29) var20.method250()) {
							class61 var22 = class61.method345(var21.field449);
							if (field1215 == 1) {
								field1278[field1261] = "Use " + field1219 + " with @lre@" + var22.field911;
								field1187[field1261] = 111;
								field1188[field1261] = var21.field449;
								field1185[field1261] = var4;
								field1186[field1261] = var5;
								field1261++;
							} else if (field1245 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field925 != null && var22.field925[var23] != null) {
										field1278[field1261] = var22.field925[var23] + " @lre@" + var22.field911;

										if (var23 == 0) {
											field1187[field1261] = 139;
										}

										if (var23 == 1) {
											field1187[field1261] = 778;
										}

										if (var23 == 2) {
											field1187[field1261] = 617;
										}

										if (var23 == 3) {
											field1187[field1261] = 224;
										}

										if (var23 == 4) {
											field1187[field1261] = 662;
										}

										field1188[field1261] = var21.field449;
										field1185[field1261] = var4;
										field1186[field1261] = var5;
										field1261++;
									} else if (var23 == 2) {
										field1278[field1261] = "Take @lre@" + var22.field911;
										field1187[field1261] = 617;
										field1188[field1261] = var21.field449;
										field1185[field1261] = var4;
										field1186[field1261] = var5;
										field1261++;
									}
								}

								field1278[field1261] = "Examine @lre@" + var22.field911;
								field1187[field1261] = 1152;
								field1188[field1261] = var21.field449;
								field1185[field1261] = var4;
								field1186[field1261] = var5;
								field1261++;
							} else if ((field1247 & 0x1) == 1) {
								field1278[field1261] = field1248 + " @lre@" + var22.field911;
								field1187[field1261] = 370;
								field1188[field1261] = var21.field449;
								field1185[field1261] = var4;
								field1186[field1261] = var5;
								field1261++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(IZ)Ljava/lang/String;")
	public static final String method538(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;BI)V")
	public final void method539(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1306 != -1) {
			field1068 = arg0;
			field23 = 0;
		}

		if (field1103 == -1) {
			field1286 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1160[var4] = field1160[var4 - 1];
			field1161[var4] = field1161[var4 - 1];
			field1162[var4] = field1162[var4 - 1];
		}

		field1160[0] = arg2;
		field1161[0] = arg1;
		field1162[0] = arg0;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method540(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg1 >> 14 & 0x7FFF;
		int var6 = field1266.method80(field1434, arg3, arg0, arg1);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1181++;
		if (field1181 > 1086) {
			field1181 = 0;
			field1194.method217(225);
			field1194.method218(0);
			int var9 = field1194.field625;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1194.method219(16791);
			}

			field1194.method218(254);
			field1194.method219((int) (Math.random() * 65536.0D));
			field1194.method219(16128);
			field1194.method219(52610);
			field1194.method219((int) (Math.random() * 65536.0D));
			field1194.method219(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1194.method219(35025);
			}

			field1194.method219(46628);
			field1194.method218((int) (Math.random() * 256.0D));
			field1194.method227(field1194.field625 - var9);
		}

		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class58 var10 = class58.method329(var5);
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

			method437(field1363.field411[0], arg3, false, var13, 0, field1363.field410[0], arg0, var11, var12, 0, 2);
		} else {
			method437(field1363.field411[0], arg3, false, 0, var7 + 1, field1363.field410[0], arg0, 0, 0, var8, 2);
		}

		field1168 = field24;
		field1169 = field25;
		field1171 = 2;
		field1170 = 0;
		field1194.method217(arg2);
		field1194.method219(field1385 + arg3);
		field1194.method219(field1386 + arg0);
		field1194.method219(var5);
		return true;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method541() {
		while (true) {
			class40 var1 = field1277.method280();
			if (var1 == null) {
				return;
			}

			if (var1.field637 == 0) {
				class31.method123(var1.field638, var1.field639);

				if ((field1277.method276(var1.field638) & 0x62) != 0) {
					field1394 = true;

					if (field1103 != -1) {
						field1286 = true;
					}
				}
			}

			if (var1.field637 == 1 && var1.field639 != null) {
				class7.method45(var1.field639);
			}

			if (var1.field637 == 2 && field1253 == var1.field638 && var1.field639 != null) {
				method533(field1254, var1.field639);
			}

			if (var1.field637 == 3 && field1288 == 1) {
				for (int var2 = 0; var2 < field1189.length; var2++) {
					if (field1060[var2] == var1.field638) {
						field1189[var2] = var1.field639;

						if (var1.field639 == null) {
							field1060[var2] = -1;
						}

						break;
					}

					if (field1061[var2] == var1.field638) {
						field1430[var2] = var1.field639;

						if (var1.field639 == null) {
							field1061[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field637 == 93 && field1277.method275(var1.field638)) {
				class3.method17(field1277, new class39(var1.field639));
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method542(int arg0) {
		int[] var2 = field1232.field590;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1208[arg0][var7][var5] & 0x18) == 0) {
					field1266.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1208[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1266.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1232.method180();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1208[arg0][var11][var10] & 0x18) == 0) {
					method430(arg0, var8, var10, var9, var11);
				}

				if (arg0 < 3 && (field1208[arg0 + 1][var11][var10] & 0x8) != 0) {
					method430(arg0 + 1, var8, var10, var9, var11);
				}
			}
		}

		field1375.method257();
		field1195 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1266.method79(field1434, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class58.method329(var14).field849;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1282[field1434].field956;
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

						field1207[field1195] = field1067[var15];
						field1196[field1195] = var16;
						field1197[field1195] = var17;
						field1195++;
					}
				}
			}
		}

		field1212++;
		if (field1212 > 112) {
			field1212 = 0;
			field1194.method217(4);
			field1194.method218(50);
		}
	}

	@ObfuscatedName("client.a(IZIILd;)V")
	public final void method543(int arg0, int arg1, int arg2, class4 arg3) {
		if (arg3.field63 == 0 && arg3.field78 != null && (!arg3.field77 || field1283 == arg3.field61 || field1115 == arg3.field61 || field1331 == arg3.field61)) {
			int var5 = class33.field562;
			int var6 = class33.field560;
			int var7 = class33.field563;
			int var8 = class33.field561;
			class33.method153(arg3.field67 + arg1, arg1, arg0, arg3.field66 + arg0);
			int var9 = arg3.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field79[var10] + arg0;
				int var12 = arg3.field80[var10] + arg1 - arg2;
				class4 var13 = class4.field56[arg3.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method469(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method543(var11, var12, var13.field76, var13);

					if (var13.field75 > var13.field67) {
						method508(var13.field66 + var11, var12, var13.field76, var13.field67, var13.field75);
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
									if (var17 > class33.field562 - 32 && var17 < class33.field563 && var18 > class33.field560 - 32 && var18 < class33.field561 || field1410 != 0 && field1409 == var14) {
										int var22 = 0;
										if (field1215 == 1 && field1216 == var14 && field1217 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class61.method351(var22, var21, var13.field58[var14]);
										if (var23 != null) {
											if (field1410 != 0 && field1409 == var14 && field1408 == var13.field61) {
												var19 = field17 - field1411;
												var20 = field18 - field1412;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1198 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method187(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < class33.field560 && arg3.field76 > 0) {
													int var24 = (class33.field560 - var18 - var20) * field1166 / 3;
													if (var24 > field1166 * 10) {
														var24 = field1166 * 10;
													}

													if (var24 > arg3.field76) {
														var24 = arg3.field76;
													}

													arg3.field76 -= var24;
													field1412 += var24;
												}

												if (var18 + var20 + 32 > class33.field561 && arg3.field76 < arg3.field75 - arg3.field67) {
													int var25 = (var18 + var20 + 32 - class33.field561) * field1166 / 3;
													if (var25 > field1166 * 10) {
														var25 = field1166 * 10;
													}

													if (var25 > arg3.field75 - arg3.field67 - arg3.field76) {
														var25 = arg3.field75 - arg3.field67 - arg3.field76;
													}

													arg3.field76 += var25;
													field1412 -= var25;
												}
											} else if (field1404 != 0 && field1403 == var14 && field1402 == var13.field61) {
												var23.method187(var17, 128, var18);
											} else {
												var23.method185(var17, var18);
											}

											if (var23.field595 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1318.method203(method538(var26), 0, var18 + var20 + 10, var17 + 1 + var19);
												field1318.method203(method538(var26), 0xFFFF00, var18 + var20 + 9, var17 + var19);
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
						if (field1331 == var13.field61 || field1115 == var13.field61 || field1283 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method484(var13)) {
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
								class33.method156(var13.field66, var29, var12, var13.field67, var11);
							} else {
								class33.method157(var11, var13.field66, var13.field67, var12, var29);
							}
						} else if (var13.field93) {
							class33.method155(256 - (var13.field68 & 0xFF), var29, var11, var13.field67, var13.field66, var12);
						} else {
							class33.method158(var29, var12, var13.field66, var13.field67, 256 - (var13.field68 & 0xFF), var11);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1331 == var13.field61 || field1115 == var13.field61 || field1283 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method484(var13)) {
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

						if (var13.field64 == 6 && field1252) {
							var31 = "Please wait...";
							var33 = var13.field99;
						}

						if (class33.field558 == 479) {
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

									var31 = var31.substring(0, var35) + method451(method535(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method451(method535(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method451(method535(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method451(method535(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method451(method535(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method201(var13.field66 / 2 + var11, var13.field95, var33, var34, var41);
							} else {
								var30.method205(var34, var41, var11, var13.field95, var33);
							}

							var34 += var30.field612;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method484(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method185(var11, var12);
						}
					} else if (var13.field63 == 6) {
						int var43 = class34.field572;
						int var44 = class34.field573;
						class34.field572 = var13.field66 / 2 + var11;
						class34.field573 = var13.field67 / 2 + var12;
						int var45 = class34.field576[var13.field112] * var13.field111 >> 16;
						int var46 = class34.field577[var13.field112] * var13.field111 >> 16;
						boolean var47 = method484(var13);
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
							class67 var50 = class67.field991[var48];
							var49 = var13.method34(var50.field994[var13.field59], var50.field993[var13.field59], var47);
						}

						if (var49 != null) {
							var49.method145(0, var13.field113, 0, var13.field112, 0, var45, var46);
						}

						class34.field572 = var43;
						class34.field573 = var44;
					} else if (var13.field63 == 7) {
						class37 var51 = var13.field96;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field67; var53++) {
							for (int var54 = 0; var54 < var13.field66; var54++) {
								if (var13.field57[var52] > 0) {
									class61 var55 = class61.method345(var13.field57[var52] - 1);
									String var56 = var55.field911;
									if (var55.field922 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method514(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method201(var13.field66 / 2 + var57, var13.field95, var13.field99, var58, var56);
									} else {
										var51.method205(var58, var56, var57, var13.field95, var13.field99);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method153(var8, var6, var5, var7);
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method544() {
		if (field1410 == 0) {
			field1278[0] = "Cancel";
			field1187[0] = 1106;
			field1261 = 1;
			method454();
			field1256 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1062 == -1) {
					method537();
				} else {
					method557(class4.field56[field1062], 0, 4, field18, field17, 4);
				}
			}

			if (field1283 != field1256) {
				field1283 = field1256;
			}

			field1256 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1172 != -1) {
					method557(class4.field56[field1172], 0, 205, field18, field17, 553);
				} else if (field1378[field1237] != -1) {
					method557(class4.field56[field1378[field1237]], 0, 205, field18, field17, 553);
				}
			}

			if (field1256 != field1115) {
				field1394 = true;
				field1115 = field1256;
			}

			field1256 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1103 != -1) {
					method557(class4.field56[field1103], 0, 357, field18, field17, 17);
				} else if (field18 < 434 && field17 < 426) {
					method452(field18 - 357, field17 - 17);
				}
			}

			if (field1103 != -1 && field1331 != field1256) {
				field1286 = true;
				field1331 = field1256;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1261 - 1; var2++) {
					if (field1187[var2] < 1000 && field1187[var2 + 1] > 1000) {
						String var3 = field1278[var2];
						field1278[var2] = field1278[var2 + 1];
						field1278[var2 + 1] = var3;
						int var4 = field1187[var2];
						field1187[var2] = field1187[var2 + 1];
						field1187[var2 + 1] = var4;
						int var5 = field1185[var2];
						field1185[var2] = field1185[var2 + 1];
						field1185[var2 + 1] = var5;
						int var6 = field1186[var2];
						field1186[var2] = field1186[var2 + 1];
						field1186[var2 + 1] = var6;
						int var7 = field1188[var2];
						field1188[var2] = field1188[var2 + 1];
						field1188[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1176 != null) {
				field1176.method38();
			}
		} catch (Exception var1) {
		}

		field1176 = null;
		method509();

		if (field1099 != null) {
			field1099.field866 = false;
		}

		field1099 = null;
		field1277.method270();
		field1277 = null;
		field1194 = null;
		field1114 = null;
		field1193 = null;
		field1059 = null;
		field1189 = null;
		field1430 = null;
		field1060 = null;
		field1061 = null;
		field1371 = null;
		field1208 = null;
		field1266 = null;
		field1282 = null;
		field1356 = null;
		field1132 = null;
		field1395 = null;
		field1396 = null;
		field1260 = null;
		field1373 = null;
		field1374 = null;
		field1375 = null;
		field1376 = null;
		field1380 = null;
		field1381 = null;
		field1382 = null;
		field1296 = null;
		field1297 = null;
		field1298 = null;
		field1299 = null;
		field1300 = null;
		field1301 = null;
		field1302 = null;
		field1303 = null;
		field1304 = null;
		field1249 = null;
		field1250 = null;
		field1251 = null;
		field1289 = null;
		field1290 = null;
		field1291 = null;
		field1267 = null;
		field1364 = null;
		field1365 = null;
		field1366 = null;
		field1367 = null;
		field1368 = null;
		field1069 = null;
		field1070 = null;
		field1071 = null;
		field1072 = null;
		field1073 = null;
		field1174 = null;
		field1423 = null;
		field1106 = null;
		field1405 = null;
		field1156 = null;
		field1157 = null;
		field1158 = null;
		field1159 = null;
		field1149 = null;
		field1067 = null;
		field1228 = null;
		field1135 = null;
		field1137 = null;
		field1139 = null;
		field1140 = null;
		field1280 = null;
		field1090 = null;
		field1092 = null;
		field1100 = null;
		field1399 = null;
		field1309 = null;
		field1270 = null;
		field1185 = null;
		field1186 = null;
		field1187 = null;
		field1188 = null;
		field1278 = null;
		field1353 = null;
		field1196 = null;
		field1197 = null;
		field1207 = null;
		field1232 = null;
		field1354 = null;
		field1098 = null;
		field1241 = null;
		field1336 = null;
		field1337 = null;
		field1333 = null;
		field1334 = null;
		field1335 = null;
		field1338 = null;
		field1339 = null;
		field1340 = null;
		field1341 = null;
		method534();
		class58.method328();
		class60.method338();
		class61.method344();
		class64.field958 = null;
		class65.field971 = null;
		class4.field56 = null;
		class66.field978 = null;
		class67.field991 = null;
		class69.field1010 = null;
		class69.field1022 = null;
		class71.field1030 = null;
		field10 = null;
		class27.field438 = null;
		class34.method163();
		class18.method49();
		class31.method121();
		class7.method46();
		System.gc();
	}

	@ObfuscatedName("client.J(I)V")
	public final void method545() {
		short var1 = 256;

		if (field1183 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1183 > 768) {
					field1440[var2] = method487(field1441[var2], field1442[var2], 1024 - field1183);
				} else if (field1183 > 256) {
					field1440[var2] = field1442[var2];
				} else {
					field1440[var2] = method487(field1442[var2], field1441[var2], 256 - field1183);
				}
			}
		} else if (field1184 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1184 > 768) {
					field1440[var3] = method487(field1441[var3], field1443[var3], 1024 - field1184);
				} else if (field1184 > 256) {
					field1440[var3] = field1443[var3];
				} else {
					field1440[var3] = method487(field1443[var3], field1441[var3], 256 - field1184);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1440[var4] = field1441[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1336.field658[var5] = field1346.field590[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1146[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1179[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1440[var12];
					int var15 = field1336.field658[var7];
					field1336.field658[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1336.method258(0, field9, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1337.field658[var16] = field1347.field590[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1146[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1179[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1440[var23];
					int var26 = field1337.field658[var18];
					field1337.field658[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1337.method258(0, field9, 637);
	}

	@ObfuscatedName("client.f(II)V")
	public final void method546(int arg0, int arg1) {
		class42 var3 = field1100[field1434][arg0][arg1];
		if (var3 == null) {
			field1266.method71(field1434, arg0, arg1);
		} else {
			int var4 = -99999999;
			class29 var5 = null;
			for (class29 var6 = (class29) var3.method247(); var6 != null; var6 = (class29) var3.method249()) {
				class61 var7 = class61.method345(var6.field449);
				int var8 = var7.field923;
				if (var7.field922) {
					var8 = (var6.field450 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method245(var5);
			class29 var9 = null;
			class29 var10 = null;
			for (class29 var11 = (class29) var3.method247(); var11 != null; var11 = (class29) var3.method249()) {
				if (var5.field449 != var11.field449 && var9 == null) {
					var9 = var11;
				}

				if (var5.field449 != var11.field449 && var9.field449 != var11.field449 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1266.method57(field1434, var5, var9, method515(arg0 * 128 + 64, arg1 * 128 + 64, field1434), arg1, arg0, var12, var10);
		}
	}

	@ObfuscatedName("client.a(IIIILab;)V")
	public final void method547(int arg0, int arg1, int arg2, class27 arg3) {
		if (field1363 != arg3 && field1261 < 400) {
			String var5 = arg3.field416 + method517(arg3.field422, field1363.field422) + " (level-" + arg3.field422 + ")";
			if (field1215 == 1) {
				field1278[field1261] = "Use " + field1219 + " with @whi@" + var5;
				field1187[field1261] = 275;
				field1188[field1261] = arg2;
				field1185[field1261] = arg1;
				field1186[field1261] = arg0;
				field1261++;
			} else if (field1245 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1348[var6] != null) {
						field1278[field1261] = field1348[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1348[var6].equalsIgnoreCase("attack")) {
							if (arg3.field422 > field1363.field422) {
								var7 = 2000;
							}
						} else if (field1349[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1187[field1261] = var7 + 639;
						}

						if (var6 == 1) {
							field1187[field1261] = var7 + 499;
						}

						if (var6 == 2) {
							field1187[field1261] = var7 + 27;
						}

						if (var6 == 3) {
							field1187[field1261] = var7 + 387;
						}

						if (var6 == 4) {
							field1187[field1261] = var7 + 185;
						}

						field1188[field1261] = arg2;
						field1185[field1261] = arg1;
						field1186[field1261] = arg0;
						field1261++;
					}
				}
			} else if ((field1247 & 0x8) == 8) {
				field1278[field1261] = field1248 + " @whi@" + var5;
				field1187[field1261] = 131;
				field1188[field1261] = arg2;
				field1185[field1261] = arg1;
				field1186[field1261] = arg0;
				field1261++;
			}

			for (int var8 = 0; var8 < field1261; var8++) {
				if (field1187[var8] == 718) {
					field1278[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method548() {
		field1373.method257();
		class34.field578 = field1343;
		field1249.method198(0, 0);

		if (field1172 != -1) {
			method543(0, 0, 0, class4.field56[field1172]);
		} else if (field1378[field1237] != -1) {
			method543(0, 0, 0, class4.field56[field1378[field1237]]);
		}

		if (field1173 && field1445 == 1) {
			method516();
		}

		field1373.method258(205, field9, 553);
		field1375.method257();
		class34.field578 = field1344;
	}

	@ObfuscatedName("client.o(B)Ljava/lang/String;")
	public final String method549() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(ILib;ZI)V")
	public final void method550(int arg0, class35 arg1, int arg2) {
		int var4 = field1360 + field1315 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field544[var4];
			int var7 = class31.field545[var4];
			var6 = var6 * 256 / (field1389 + 256);
			var7 = var7 * 256 / (field1389 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method191(83 - var9 - arg1.field596 / 2 - 4, var8 + 94 - arg1.field595 / 2 + 4, field1250);
			} else {
				arg1.method185(var8 + 94 + 4 - arg1.field595 / 2, 83 - var9 - arg1.field596 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method551(boolean arg0) {
		if (field1363.field360 >> 7 == field1230 && field1363.field361 >> 7 == field1231) {
			field1230 = 0;
			field1153++;
			if (field1153 > 122) {
				field1153 = 0;
				field1194.method217(36);
				field1194.method218(62);
			}
		}

		int var2 = field1136;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1363;
				var5 = field1134 << 14;
			} else {
				var4 = field1135[field1137[var3]];
				var5 = field1137[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field435 = false;
				if ((field1265 && field1136 > 50 || field1136 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field435 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field430 == null || field1058 < var4.field425 || field1058 >= var4.field426) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1228[var6][var7] == field1310) {
								continue;
							}

							field1228[var6][var7] = field1310;
						}

						var4.field424 = method515(var4.field360, var4.field361, field1434);
						field1266.method61(field1434, var4.field360, var4, var4.field424, var4.field363, var4.field361, var4.field362, 60, var5);
					} else {
						var4.field435 = false;
						var4.field424 = method515(var4.field360, var4.field361, field1434);
						field1266.method62(var4.field360, var4.field362, var4, var4.field424, field1434, var4.field361, var5, var4.field433, 60, var4.field434, var4.field432, var4.field431);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;IBI)Lyb;")
	public final class51 method552(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1295[0] != null) {
				var6 = field1295[0].method290(arg1);
			}
		} catch (Exception var28) {
		}

		if (var6 != null) {
			field1182.reset();
			field1182.update(var6);
			int var8 = (int) field1182.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class51(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13(arg4, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method435(arg0 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class39 var16 = new class39(var15);
				var16.field625 = 3;
				int var17 = var16.method232() + 6;
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
					if (field1295[0] != null) {
						field1295[0].method291(var6, arg1, var6.length);
					}
				} catch (Exception var27) {
					field1295[0] = null;
				}

				if (var6 != null) {
					field1182.reset();
					field1182.update(var6);
					int var23 = (int) field1182.getValue();
					if (arg3 != var23) {
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
						method13(arg4, "Game updated - please reload page");
						var24 = 10;
					} else {
						method13(arg4, var11 + " - Retrying in " + var24);
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

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg0 >= 1 && arg2 <= 102 && arg0 <= 102) {
			if (field1265 && field1434 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field1266.method76(arg3, arg2, arg0);
			}

			if (arg1 == 1) {
				var8 = field1266.method77(arg2, arg3, arg0);
			}

			if (arg1 == 2) {
				var8 = field1266.method78(arg3, arg2, arg0);
			}

			if (arg1 == 3) {
				var8 = field1266.method79(arg3, arg2, arg0);
			}

			if (var8 != 0) {
				int var12 = field1266.method80(arg3, arg2, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field1266.method67(arg3, arg0, arg2);
					class58 var16 = class58.method329(var13);
					if (var16.field838) {
						field1282[arg3].method361(var14, var15, arg2, var16.field839, arg0);
					}
				}

				if (arg1 == 1) {
					field1266.method68(arg3, arg0, arg2);
				}

				if (arg1 == 2) {
					field1266.method69(arg0, arg3, arg2);
					class58 var17 = class58.method329(var13);
					if (var17.field836 + arg2 > 103 || var17.field836 + arg0 > 103 || var17.field837 + arg2 > 103 || var17.field837 + arg0 > 103) {
						return;
					}

					if (var17.field838) {
						field1282[arg3].method362(arg0, arg2, var17.field839, var17.field837, var17.field836, var15);
					}
				}

				if (arg1 == 3) {
					field1266.method70(arg0, arg3, arg2);
					class58 var18 = class58.method329(var13);
					if (var18.field838 && var18.field840) {
						field1282[arg3].method364(arg2, arg0);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field1208[1][arg2][arg0] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				class3.method31(arg4, arg5, arg3, arg2, field1371, field1266, arg0, var19, arg6, field1282[arg3]);
				return;
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method554() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1150 = (field1150 + 1) % 4;
				field1203 = true;
				field1286 = true;
				field1194.method217(129);
				field1194.method218(field1150);
				field1194.method218(field1467);
				field1194.method218(field1192);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1467 = (field1467 + 1) % 3;
				field1203 = true;
				field1286 = true;
				field1194.method217(129);
				field1194.method218(field1150);
				field1194.method218(field1467);
				field1194.method218(field1192);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1192 = (field1192 + 1) % 3;
				field1203 = true;
				field1286 = true;
				field1194.method217(129);
				field1194.method218(field1150);
				field1194.method218(field1467);
				field1194.method218(field1192);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method453();
				field1285 = "";
				field1255 = false;

				for (int var1 = 0; var1 < class4.field56.length; var1++) {
					if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
						field1236 = field1062 = class4.field56[var1].field62;
						return;
					}
				}

				return;
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method555(boolean arg0) {
		for (int var2 = 0; var2 < field1091; var2++) {
			class26 var3 = field1090[field1092[var2]];
			int var4 = (field1092[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field897 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1228[var5][var6] == field1310) {
							continue;
						}

						field1228[var5][var6] = field1310;
					}

					field1266.method61(field1434, var3.field360, var3, method515(var3.field360, var3.field361, field1434), var3.field363, var3.field361, var3.field362, (var3.field364 - 1) * 64 + 60, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method556() {
		field1287 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1141) {
				field1345++;
				method473();
				method473();
				method545();
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

		field1287 = false;
	}

	@ObfuscatedName("client.a(Ld;IIBIII)V")
	public final void method557(class4 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field63 == 0 && arg0.field78 != null && !arg0.field77 && (arg4 >= arg5 && arg3 >= arg2 && arg4 <= arg0.field66 + arg5 && arg3 <= arg0.field67 + arg2)) {
			int var7 = arg0.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.field79[var8] + arg5;
				int var10 = arg0.field80[var8] + arg2 - arg1;
				class4 var11 = class4.field56[arg0.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1256 = var11.field74;
					} else {
						field1256 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method557(var11, var11.field76, var10, arg3, arg4, var9);

					if (var11.field75 > var11.field67) {
						method531(var10, arg4, var11.field66 + var9, var11, true, var11.field67, arg3, var11.field75);
					}
				} else {
					if (var11.field64 == 1 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method524(var11);
						}

						if (!var12) {
							field1278[field1261] = var11.field117;
							field1187[field1261] = 231;
							field1186[field1261] = var11.field61;
							field1261++;
						}
					}

					if (var11.field64 == 2 && field1245 == 0 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1278[field1261] = var13 + " @gre@" + var11.field115;
						field1187[field1261] = 274;
						field1186[field1261] = var11.field61;
						field1261++;
					}

					if (var11.field64 == 3 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1278[field1261] = "Close";
						field1187[field1261] = 737;
						field1186[field1261] = var11.field61;
						field1261++;
					}

					if (var11.field64 == 4 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1278[field1261] = var11.field117;
						field1187[field1261] = 435;
						field1186[field1261] = var11.field61;
						field1261++;
					}

					if (var11.field64 == 5 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1278[field1261] = var11.field117;
						field1187[field1261] = 225;
						field1186[field1261] = var11.field61;
						field1261++;
					}

					if (var11.field64 == 6 && !field1252 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1278[field1261] = var11.field117;
						field1187[field1261] = 997;
						field1186[field1261] = var11.field61;
						field1261++;
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
									field1128 = var14;
									field1129 = var11.field61;

									if (var11.field57[var14] > 0) {
										class61 var19 = class61.method345(var11.field57[var14] - 1);
										if (field1215 == 1 && var11.field84) {
											if (field1217 != var11.field61 || field1216 != var14) {
												field1278[field1261] = "Use " + field1219 + " with @lre@" + var19.field911;
												field1187[field1261] = 398;
												field1188[field1261] = var19.field909;
												field1185[field1261] = var14;
												field1186[field1261] = var11.field61;
												field1261++;
											}
										} else if (field1245 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field926 != null && var19.field926[var20] != null) {
														field1278[field1261] = var19.field926[var20] + " @lre@" + var19.field911;

														if (var20 == 3) {
															field1187[field1261] = 681;
														}

														if (var20 == 4) {
															field1187[field1261] = 100;
														}

														field1188[field1261] = var19.field909;
														field1185[field1261] = var14;
														field1186[field1261] = var11.field61;
														field1261++;
													} else if (var20 == 4) {
														field1278[field1261] = "Drop @lre@" + var19.field911;
														field1187[field1261] = 100;
														field1188[field1261] = var19.field909;
														field1185[field1261] = var14;
														field1186[field1261] = var11.field61;
														field1261++;
													}
												}
											}

											if (var11.field85) {
												field1278[field1261] = "Use @lre@" + var19.field911;
												field1187[field1261] = 102;
												field1188[field1261] = var19.field909;
												field1185[field1261] = var14;
												field1186[field1261] = var11.field61;
												field1261++;
											}

											if (var11.field84 && var19.field926 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field926[var21] != null) {
														field1278[field1261] = var19.field926[var21] + " @lre@" + var19.field911;

														if (var21 == 0) {
															field1187[field1261] = 694;
														}

														if (var21 == 1) {
															field1187[field1261] = 962;
														}

														if (var21 == 2) {
															field1187[field1261] = 795;
														}

														field1188[field1261] = var19.field909;
														field1185[field1261] = var14;
														field1186[field1261] = var11.field61;
														field1261++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1278[field1261] = var11.field92[var22] + " @lre@" + var19.field911;

														if (var22 == 0) {
															field1187[field1261] = 582;
														}

														if (var22 == 1) {
															field1187[field1261] = 113;
														}

														if (var22 == 2) {
															field1187[field1261] = 555;
														}

														if (var22 == 3) {
															field1187[field1261] = 331;
														}

														if (var22 == 4) {
															field1187[field1261] = 354;
														}

														field1188[field1261] = var19.field909;
														field1185[field1261] = var14;
														field1186[field1261] = var11.field61;
														field1261++;
													}
												}
											}

											field1278[field1261] = "Examine @lre@" + var19.field911;
											field1187[field1261] = 1328;
											field1188[field1261] = var19.field909;
											field1185[field1261] = var14;
											field1186[field1261] = var11.field61;
											field1261++;
										} else if ((field1247 & 0x10) == 0x10) {
											field1278[field1261] = field1248 + " @lre@" + var19.field911;
											field1187[field1261] = 563;
											field1188[field1261] = var19.field909;
											field1185[field1261] = var14;
											field1186[field1261] = var11.field61;
											field1261++;
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

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1108[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field1235[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
