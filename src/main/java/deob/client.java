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
	public class37 field1012;

	@ObfuscatedName("client.bb")
	public class37 field1013;

	@ObfuscatedName("client.cb")
	public class37 field1014;

	@ObfuscatedName("client.db")
	public class37 field1015;

	@ObfuscatedName("client.eb")
	public class37 field1016;

	@ObfuscatedName("client.fb")
	public boolean field1017 = false;

	@ObfuscatedName("client.gb")
	public int field1018;

	@ObfuscatedName("client.hb")
	public class36 field1019;

	@ObfuscatedName("client.ib")
	public int field1020;

	@ObfuscatedName("client.jb")
	public int[] field1021 = new int[1000];

	@ObfuscatedName("client.kb")
	public int[] field1022 = new int[1000];

	@ObfuscatedName("client.lb")
	public boolean field1023 = false;

	@ObfuscatedName("client.nb")
	public class42 field1024 = new class42();

	@ObfuscatedName("client.ob")
	public int[] field1025 = new int[151];

	@ObfuscatedName("client.pb")
	public static boolean field1026;

	@ObfuscatedName("client.rb")
	public int field1027;

	@ObfuscatedName("client.sb")
	public int field1028;

	@ObfuscatedName("client.tb")
	public int field1029;

	@ObfuscatedName("client.ub")
	public int field1030;

	@ObfuscatedName("client.vb")
	public class36[] field1031 = new class36[20];

	@ObfuscatedName("client.wb")
	public int[] field1032 = new int[4000];

	@ObfuscatedName("client.xb")
	public int[] field1033 = new int[4000];

	@ObfuscatedName("client.yb")
	public static int field1034;

	@ObfuscatedName("client.zb")
	public boolean field1035 = true;

	@ObfuscatedName("client.ac")
	public int[] field1057 = new int[5];

	@ObfuscatedName("client.bc")
	public int[] field1058 = new int[5];

	@ObfuscatedName("client.cc")
	public boolean field1059 = false;

	@ObfuscatedName("client.ec")
	public int[] field1060 = new int[50];

	@ObfuscatedName("client.fc")
	public class36 field1061;

	@ObfuscatedName("client.gc")
	public class36 field1062;

	@ObfuscatedName("client.hc")
	public class49[] field1063 = new class49[5];

	@ObfuscatedName("client.jc")
	public boolean field1064 = false;

	@ObfuscatedName("client.kc")
	public int field1065;

	@ObfuscatedName("client.lc")
	public int field1066;

	@ObfuscatedName("client.mc")
	public int field1067;

	@ObfuscatedName("client.nc")
	public int field1068;

	@ObfuscatedName("client.oc")
	public boolean field1069 = false;

	@ObfuscatedName("client.I")
	public boolean field994 = false;

	@ObfuscatedName("client.K")
	public int[] field996 = new int[9];

	@ObfuscatedName("client.L")
	public byte[] field997 = new byte[16384];

	@ObfuscatedName("client.M")
	public int[] field998 = new int[256];

	@ObfuscatedName("client.P")
	public int field1001 = 50;

	@ObfuscatedName("client.Q")
	public int[] field1002 = new int[field1001];

	@ObfuscatedName("client.R")
	public int[] field1003 = new int[field1001];

	@ObfuscatedName("client.S")
	public int[] field1004 = new int[field1001];

	@ObfuscatedName("client.T")
	public int[] field1005 = new int[field1001];

	@ObfuscatedName("client.U")
	public int[] field1006 = new int[field1001];

	@ObfuscatedName("client.V")
	public int[] field1007 = new int[field1001];

	@ObfuscatedName("client.W")
	public int[] field1008 = new int[field1001];

	@ObfuscatedName("client.X")
	public String[] field1009 = new String[field1001];

	@ObfuscatedName("client.Ab")
	public class61[] field1036 = new class61[4];

	@ObfuscatedName("client.Bb")
	public int[] field1037 = new int[50];

	@ObfuscatedName("client.Db")
	public int field1038 = -1;

	@ObfuscatedName("client.Eb")
	public int field1039 = -1;

	@ObfuscatedName("client.Fb")
	public int[] field1040 = new int[5];

	@ObfuscatedName("client.Mb")
	public int[] field1046 = new int[33];

	@ObfuscatedName("client.Ob")
	public boolean field1047 = true;

	@ObfuscatedName("client.Qb")
	public int field1049 = -1;

	@ObfuscatedName("client.Rb")
	public boolean[] field1050 = new boolean[5];

	@ObfuscatedName("client.qc")
	public int[] field1070 = new int[5];

	@ObfuscatedName("client.wc")
	public int[] field1076 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.yc")
	public String field1078 = "";

	@ObfuscatedName("client.zc")
	public String[] field1079 = new String[500];

	@ObfuscatedName("client.Ac")
	public class37[] field1080 = new class37[13];

	@ObfuscatedName("client.Bc")
	public class39 field1081 = class39.method218(1);

	@ObfuscatedName("client.Dc")
	public int[][] field1083 = new int[104][104];

	@ObfuscatedName("client.Ec")
	public boolean field1084 = false;

	@ObfuscatedName("client.Lc")
	public class39 field1090 = class39.method218(1);

	@ObfuscatedName("client.Mc")
	public class37[] field1091 = new class37[50];

	@ObfuscatedName("client.Qc")
	public long[] field1095 = new long[100];

	@ObfuscatedName("client.Rc")
	public int[] field1096 = new int[2000];

	@ObfuscatedName("client.Tc")
	public boolean field1097 = false;

	@ObfuscatedName("client.Vc")
	public boolean field1099 = false;

	@ObfuscatedName("client.gd")
	public int field1110 = -1;

	@ObfuscatedName("client.id")
	public final int[] field1111 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.qd")
	public int field1118 = -1;

	@ObfuscatedName("client.xd")
	public boolean field1125 = false;

	@ObfuscatedName("client.Nd")
	public int[] field1141 = new int[100];

	@ObfuscatedName("client.Od")
	public String[] field1142 = new String[100];

	@ObfuscatedName("client.Pd")
	public String[] field1143 = new String[100];

	@ObfuscatedName("client.Qd")
	public int[] field1144 = new int[50];

	@ObfuscatedName("client.Vd")
	public int[] field1147 = new int[1000];

	@ObfuscatedName("client.Xd")
	public boolean field1149 = false;

	@ObfuscatedName("client.Zd")
	public boolean field1150 = false;

	@ObfuscatedName("client.he")
	public String field1158 = "";

	@ObfuscatedName("client.oe")
	public int field1165 = 1;

	@ObfuscatedName("client.De")
	public boolean field1179 = false;

	@ObfuscatedName("client.Ge")
	public int field1182 = 2;

	@ObfuscatedName("client.Je")
	public class36[] field1185 = new class36[50];

	@ObfuscatedName("client.Ke")
	public int field1186 = 3;

	@ObfuscatedName("client.Le")
	public int[] field1187 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Me")
	public int field1188 = -1;

	@ObfuscatedName("client.Qe")
	public int[] field1191 = new int[50];

	@ObfuscatedName("client.Se")
	public int[][] field1193 = new int[104][104];

	@ObfuscatedName("client.Te")
	public String field1194 = "";

	@ObfuscatedName("client.Ze")
	public int field1198 = -1;

	@ObfuscatedName("client.af")
	public int[] field1199 = new int[50];

	@ObfuscatedName("client.bf")
	public int field1200 = -1;

	@ObfuscatedName("client.cf")
	public class36[] field1201 = new class36[20];

	@ObfuscatedName("client.df")
	public int[] field1202 = new int[50];

	@ObfuscatedName("client.ef")
	public class36[] field1203 = new class36[8];

	@ObfuscatedName("client.gf")
	public int field1205 = 2;

	@ObfuscatedName("client.kf")
	public CRC32 field1208 = new CRC32();

	@ObfuscatedName("client.mf")
	public boolean field1210 = false;

	@ObfuscatedName("client.nf")
	public int field1211 = 0x332D25;

	@ObfuscatedName("client.rf")
	public class4 field1215 = new class4();

	@ObfuscatedName("client.tf")
	public int[] field1216 = new int[7];

	@ObfuscatedName("client.wf")
	public class42 field1219 = new class42();

	@ObfuscatedName("client.yf")
	public String[] field1220 = new String[100];

	@ObfuscatedName("client.Jf")
	public class27[] field1231 = new class27[8192];

	@ObfuscatedName("client.Lf")
	public int[] field1233 = new int[8192];

	@ObfuscatedName("client.Mf")
	public String field1234 = "";

	@ObfuscatedName("client.Nf")
	public String field1235 = "";

	@ObfuscatedName("client.Of")
	public int field1236 = -1;

	@ObfuscatedName("client.ag")
	public boolean field1246 = false;

	@ObfuscatedName("client.lg")
	public int field1254 = -1;

	@ObfuscatedName("client.tg")
	public int[] field1261 = new int[151];

	@ObfuscatedName("client.vg")
	public int field1263 = 1;

	@ObfuscatedName("client.wg")
	public long[] field1264 = new long[100];

	@ObfuscatedName("client.Bg")
	public int field1269 = 2;

	@ObfuscatedName("client.Dg")
	public int field1271 = -1;

	@ObfuscatedName("client.Fg")
	public int field1273 = 0x23201B;

	@ObfuscatedName("client.Pg")
	public boolean field1280 = false;

	@ObfuscatedName("client.Rg")
	public boolean field1281 = false;

	@ObfuscatedName("client.Vg")
	public final int field1284 = 100;

	@ObfuscatedName("client.Wg")
	public int[] field1285 = new int[100];

	@ObfuscatedName("client.Yg")
	public int field1287 = 2048;

	@ObfuscatedName("client.Zg")
	public int field1288 = 2047;

	@ObfuscatedName("client.ah")
	public class28[] field1289 = new class28[field1287];

	@ObfuscatedName("client.ch")
	public int[] field1291 = new int[field1287];

	@ObfuscatedName("client.eh")
	public int[] field1293 = new int[field1287];

	@ObfuscatedName("client.fh")
	public class39[] field1294 = new class39[field1287];

	@ObfuscatedName("client.hh")
	public boolean field1296 = false;

	@ObfuscatedName("client.kh")
	public boolean field1298 = false;

	@ObfuscatedName("client.mh")
	public int[] field1300 = new int[2000];

	@ObfuscatedName("client.rh")
	public int[] field1305 = new int[33];

	@ObfuscatedName("client.zh")
	public int field1312 = -1;

	@ObfuscatedName("client.Ah")
	public int field1313 = -1;

	@ObfuscatedName("client.Ih")
	public int field1319 = 0x766654;

	@ObfuscatedName("client.Jh")
	public int field1320 = 78;

	@ObfuscatedName("client.Nh")
	public boolean field1322 = false;

	@ObfuscatedName("client.Oh")
	public int[] field1323 = new int[100];

	@ObfuscatedName("client.Th")
	public int[] field1326 = new int[500];

	@ObfuscatedName("client.Uh")
	public int[] field1327 = new int[500];

	@ObfuscatedName("client.Vh")
	public int[] field1328 = new int[500];

	@ObfuscatedName("client.Wh")
	public int[] field1329 = new int[500];

	@ObfuscatedName("client.Xh")
	public boolean field1330 = false;

	@ObfuscatedName("client.qi")
	public int field1346 = 0x4D4233;

	@ObfuscatedName("client.ri")
	public String field1347 = "";

	@ObfuscatedName("client.si")
	public String field1348 = "";

	@ObfuscatedName("client.ui")
	public class42[][][] field1349 = new class42[4][104][104];

	@ObfuscatedName("client.Di")
	public boolean field1358 = false;

	@ObfuscatedName("client.Fi")
	public boolean field1360 = true;

	@ObfuscatedName("client.Qi")
	public boolean field1371 = false;

	@ObfuscatedName("client.Ti")
	public String field1374 = "";

	@ObfuscatedName("client.Vi")
	public int field1376 = 128;

	@ObfuscatedName("client.aj")
	public int[] field1381 = new int[5];

	@ObfuscatedName("client.bj")
	public boolean field1382 = false;

	@ObfuscatedName("client.cj")
	public boolean field1383 = false;

	@ObfuscatedName("client.dj")
	public class36[] field1384 = new class36[1000];

	@ObfuscatedName("client.hj")
	public class39 field1388 = class39.method218(1);

	@ObfuscatedName("client.ij")
	public class42 field1389 = new class42();

	@ObfuscatedName("client.jj")
	public String field1390 = "";

	@ObfuscatedName("client.kj")
	public int[][] field1391 = new int[104][104];

	@ObfuscatedName("client.rc")
	public static int field1071 = 10;

	@ObfuscatedName("client.tc")
	public static boolean field1073 = true;

	@ObfuscatedName("client.Kc")
	public static BigInteger field1089 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Uc")
	public static final int[][] field1098 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Re")
	public static final int[] field1192 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.mg")
	public static String field1255 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ii")
	public static int[] field1363 = new int[99];

	@ObfuscatedName("client.Ri")
	public static BigInteger field1372 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.O")
	public int field1000;

	@ObfuscatedName("client.Y")
	public static int field1010;

	@ObfuscatedName("client.Hb")
	public int field1041;

	@ObfuscatedName("client.Ib")
	public int field1042;

	@ObfuscatedName("client.Jb")
	public int field1043;

	@ObfuscatedName("client.Kb")
	public int field1044;

	@ObfuscatedName("client.Lb")
	public int field1045;

	@ObfuscatedName("client.Pb")
	public static int field1048;

	@ObfuscatedName("client.Sb")
	public int field1051;

	@ObfuscatedName("client.Ub")
	public int field1052;

	@ObfuscatedName("client.Vb")
	public int field1053;

	@ObfuscatedName("client.Wb")
	public int field1054;

	@ObfuscatedName("client.Xb")
	public int field1055;

	@ObfuscatedName("client.Zb")
	public int field1056;

	@ObfuscatedName("client.sc")
	public static int field1072;

	@ObfuscatedName("client.vc")
	public int field1075;

	@ObfuscatedName("client.xc")
	public static int field1077;

	@ObfuscatedName("client.Fc")
	public int field1085;

	@ObfuscatedName("client.Gc")
	public int field1086;

	@ObfuscatedName("client.Jc")
	public int field1088;

	@ObfuscatedName("client.Nc")
	public int field1092;

	@ObfuscatedName("client.Oc")
	public int field1093;

	@ObfuscatedName("client.Wc")
	public int field1100;

	@ObfuscatedName("client.Xc")
	public int field1101;

	@ObfuscatedName("client.Yc")
	public int field1102;

	@ObfuscatedName("client.Zc")
	public int field1103;

	@ObfuscatedName("client.ad")
	public int field1104;

	@ObfuscatedName("client.bd")
	public int field1105;

	@ObfuscatedName("client.cd")
	public int field1106;

	@ObfuscatedName("client.dd")
	public int field1107;

	@ObfuscatedName("client.rd")
	public int field1119;

	@ObfuscatedName("client.sd")
	public int field1120;

	@ObfuscatedName("client.td")
	public int field1121;

	@ObfuscatedName("client.ud")
	public int field1122;

	@ObfuscatedName("client.vd")
	public int field1123;

	@ObfuscatedName("client.wd")
	public static int field1124;

	@ObfuscatedName("client.yd")
	public int field1126;

	@ObfuscatedName("client.zd")
	public int field1127;

	@ObfuscatedName("client.Ad")
	public int field1128;

	@ObfuscatedName("client.Bd")
	public int field1129;

	@ObfuscatedName("client.Cd")
	public int field1130;

	@ObfuscatedName("client.Dd")
	public int field1131;

	@ObfuscatedName("client.Ud")
	public int field1146;

	@ObfuscatedName("client.ae")
	public static int field1151;

	@ObfuscatedName("client.be")
	public int field1152;

	@ObfuscatedName("client.ce")
	public int field1153;

	@ObfuscatedName("client.ie")
	public int field1159;

	@ObfuscatedName("client.me")
	public int field1163;

	@ObfuscatedName("client.ne")
	public int field1164;

	@ObfuscatedName("client.pe")
	public int field1166;

	@ObfuscatedName("client.qe")
	public int field1167;

	@ObfuscatedName("client.re")
	public int field1168;

	@ObfuscatedName("client.se")
	public int field1169;

	@ObfuscatedName("client.xe")
	public int field1174;

	@ObfuscatedName("client.ze")
	public int field1175;

	@ObfuscatedName("client.Ae")
	public int field1176;

	@ObfuscatedName("client.Ce")
	public int field1178;

	@ObfuscatedName("client.Ee")
	public int field1180;

	@ObfuscatedName("client.Fe")
	public int field1181;

	@ObfuscatedName("client.He")
	public static int field1183;

	@ObfuscatedName("client.Ie")
	public int field1184;

	@ObfuscatedName("client.Ne")
	public int field1189;

	@ObfuscatedName("client.Oe")
	public int field1190;

	@ObfuscatedName("client.Ve")
	public int field1195;

	@ObfuscatedName("client.We")
	public int field1196;

	@ObfuscatedName("client.Xe")
	public int field1197;

	@ObfuscatedName("client.ff")
	public int field1204;

	@ObfuscatedName("client.hf")
	public int field1206;

	@ObfuscatedName("client.jf")
	public int field1207;

	@ObfuscatedName("client.lf")
	public int field1209;

	@ObfuscatedName("client.qf")
	public int field1214;

	@ObfuscatedName("client.Kf")
	public int field1232;

	@ObfuscatedName("client.Wf")
	public int field1242;

	@ObfuscatedName("client.dg")
	public static int field1247;

	@ObfuscatedName("client.ig")
	public int field1252;

	@ObfuscatedName("client.jg")
	public static int field1253;

	@ObfuscatedName("client.ng")
	public static int field1256;

	@ObfuscatedName("client.rg")
	public static int field1260;

	@ObfuscatedName("client.ug")
	public int field1262;

	@ObfuscatedName("client.xg")
	public int field1265;

	@ObfuscatedName("client.yg")
	public int field1266;

	@ObfuscatedName("client.zg")
	public int field1267;

	@ObfuscatedName("client.Ag")
	public int field1268;

	@ObfuscatedName("client.Cg")
	public int field1270;

	@ObfuscatedName("client.Gg")
	public static int field1274;

	@ObfuscatedName("client.Hg")
	public int field1275;

	@ObfuscatedName("client.Ig")
	public int field1276;

	@ObfuscatedName("client.Jg")
	public int field1277;

	@ObfuscatedName("client.Kg")
	public int field1278;

	@ObfuscatedName("client.Ug")
	public int field1283;

	@ObfuscatedName("client.Xg")
	public int field1286;

	@ObfuscatedName("client.bh")
	public int field1290;

	@ObfuscatedName("client.dh")
	public int field1292;

	@ObfuscatedName("client.gh")
	public int field1295;

	@ObfuscatedName("client.lh")
	public int field1299;

	@ObfuscatedName("client.nh")
	public int field1301;

	@ObfuscatedName("client.oh")
	public int field1302;

	@ObfuscatedName("client.ph")
	public int field1303;

	@ObfuscatedName("client.sh")
	public int field1306;

	@ObfuscatedName("client.th")
	public int field1307;

	@ObfuscatedName("client.uh")
	public int field1308;

	@ObfuscatedName("client.vh")
	public int field1309;

	@ObfuscatedName("client.wh")
	public int field1310;

	@ObfuscatedName("client.xh")
	public int field1311;

	@ObfuscatedName("client.Bh")
	public int field1314;

	@ObfuscatedName("client.Fh")
	public int field1317;

	@ObfuscatedName("client.Hh")
	public int field1318;

	@ObfuscatedName("client.Lh")
	public int field1321;

	@ObfuscatedName("client.Ph")
	public static int field1324;

	@ObfuscatedName("client.ei")
	public int field1336;

	@ObfuscatedName("client.fi")
	public int field1337;

	@ObfuscatedName("client.gi")
	public int field1338;

	@ObfuscatedName("client.hi")
	public int field1339;

	@ObfuscatedName("client.ii")
	public int field1340;

	@ObfuscatedName("client.ji")
	public int field1341;

	@ObfuscatedName("client.ki")
	public int field1342;

	@ObfuscatedName("client.li")
	public int field1343;

	@ObfuscatedName("client.mi")
	public int field1344;

	@ObfuscatedName("client.oi")
	public int field1345;

	@ObfuscatedName("client.vi")
	public int field1350;

	@ObfuscatedName("client.wi")
	public int field1351;

	@ObfuscatedName("client.xi")
	public int field1352;

	@ObfuscatedName("client.yi")
	public int field1353;

	@ObfuscatedName("client.zi")
	public int field1354;

	@ObfuscatedName("client.Ai")
	public int field1355;

	@ObfuscatedName("client.Bi")
	public int field1356;

	@ObfuscatedName("client.Ci")
	public static int field1357;

	@ObfuscatedName("client.Ji")
	public int field1364;

	@ObfuscatedName("client.Ki")
	public int field1365;

	@ObfuscatedName("client.Li")
	public int field1366;

	@ObfuscatedName("client.Mi")
	public int field1367;

	@ObfuscatedName("client.Ni")
	public int field1368;

	@ObfuscatedName("client.Oi")
	public int field1369;

	@ObfuscatedName("client.Pi")
	public int field1370;

	@ObfuscatedName("client.Ui")
	public int field1375;

	@ObfuscatedName("client.Wi")
	public int field1377;

	@ObfuscatedName("client.Xi")
	public int field1378;

	@ObfuscatedName("client.Yi")
	public int field1379;

	@ObfuscatedName("client.Zi")
	public static int field1380;

	@ObfuscatedName("client.H")
	public static int field993;

	@ObfuscatedName("client.N")
	public static int field999;

	@ObfuscatedName("client.Z")
	public long field1011;

	@ObfuscatedName("client.Ic")
	public long field1087;

	@ObfuscatedName("client.Eg")
	public long field1272;

	@ObfuscatedName("client.Gi")
	public long field1361;

	@ObfuscatedName("client.J")
	public class19 field995;

	@ObfuscatedName("client.Td")
	public static class28 field1145;

	@ObfuscatedName("client.ed")
	public class36 field1108;

	@ObfuscatedName("client.fd")
	public class36 field1109;

	@ObfuscatedName("client.Be")
	public class36 field1177;

	@ObfuscatedName("client.Rf")
	public class36 field1238;

	@ObfuscatedName("client.Sf")
	public class36 field1239;

	@ObfuscatedName("client.Tf")
	public class36 field1240;

	@ObfuscatedName("client.Uf")
	public class36 field1241;

	@ObfuscatedName("client.Rh")
	public class36 field1325;

	@ObfuscatedName("client.od")
	public class37 field1116;

	@ObfuscatedName("client.pd")
	public class37 field1117;

	@ObfuscatedName("client.je")
	public class37 field1160;

	@ObfuscatedName("client.ke")
	public class37 field1161;

	@ObfuscatedName("client.le")
	public class37 field1162;

	@ObfuscatedName("client.of")
	public class37 field1212;

	@ObfuscatedName("client.pf")
	public class37 field1213;

	@ObfuscatedName("client.Zh")
	public class37 field1331;

	@ObfuscatedName("client.ai")
	public class37 field1332;

	@ObfuscatedName("client.bi")
	public class37 field1333;

	@ObfuscatedName("client.ci")
	public class37 field1334;

	@ObfuscatedName("client.di")
	public class37 field1335;

	@ObfuscatedName("client.ej")
	public class37 field1385;

	@ObfuscatedName("client.fj")
	public class37 field1386;

	@ObfuscatedName("client.gj")
	public class37 field1387;

	@ObfuscatedName("client.eg")
	public class38 field1248;

	@ObfuscatedName("client.fg")
	public class38 field1249;

	@ObfuscatedName("client.gg")
	public class38 field1250;

	@ObfuscatedName("client.hg")
	public class38 field1251;

	@ObfuscatedName("client.ld")
	public class44 field1113;

	@ObfuscatedName("client.md")
	public class44 field1114;

	@ObfuscatedName("client.nd")
	public class44 field1115;

	@ObfuscatedName("client.Ed")
	public class44 field1132;

	@ObfuscatedName("client.Fd")
	public class44 field1133;

	@ObfuscatedName("client.Gd")
	public class44 field1134;

	@ObfuscatedName("client.Hd")
	public class44 field1135;

	@ObfuscatedName("client.Id")
	public class44 field1136;

	@ObfuscatedName("client.Jd")
	public class44 field1137;

	@ObfuscatedName("client.Kd")
	public class44 field1138;

	@ObfuscatedName("client.Ld")
	public class44 field1139;

	@ObfuscatedName("client.Md")
	public class44 field1140;

	@ObfuscatedName("client.de")
	public class44 field1154;

	@ObfuscatedName("client.ee")
	public class44 field1155;

	@ObfuscatedName("client.fe")
	public class44 field1156;

	@ObfuscatedName("client.ge")
	public class44 field1157;

	@ObfuscatedName("client.zf")
	public class44 field1221;

	@ObfuscatedName("client.Af")
	public class44 field1222;

	@ObfuscatedName("client.Bf")
	public class44 field1223;

	@ObfuscatedName("client.Cf")
	public class44 field1224;

	@ObfuscatedName("client.Df")
	public class44 field1225;

	@ObfuscatedName("client.Ef")
	public class44 field1226;

	@ObfuscatedName("client.Ff")
	public class44 field1227;

	@ObfuscatedName("client.Gf")
	public class44 field1228;

	@ObfuscatedName("client.Hf")
	public class44 field1229;

	@ObfuscatedName("client.If")
	public class44 field1230;

	@ObfuscatedName("client.Qf")
	public class48 field1237;

	@ObfuscatedName("client.jd")
	public class50 field1112;

	@ObfuscatedName("client.Pc")
	public class51 field1094;

	@ObfuscatedName("client.Ei")
	public class5 field1359;

	@ObfuscatedName("client.Lg")
	public String field1279;

	@ObfuscatedName("client.Tg")
	public String field1282;

	@ObfuscatedName("client.qh")
	public String field1304;

	@ObfuscatedName("client.lj")
	public String field1392;

	@ObfuscatedName("client.uc")
	public static boolean field1074;

	@ObfuscatedName("client.te")
	public int[] field1170;

	@ObfuscatedName("client.ue")
	public int[] field1171;

	@ObfuscatedName("client.ve")
	public int[] field1172;

	@ObfuscatedName("client.we")
	public int[] field1173;

	@ObfuscatedName("client.uf")
	public int[] field1217;

	@ObfuscatedName("client.vf")
	public int[] field1218;

	@ObfuscatedName("client.Xf")
	public int[] field1243;

	@ObfuscatedName("client.Yf")
	public int[] field1244;

	@ObfuscatedName("client.Zf")
	public int[] field1245;

	@ObfuscatedName("client.og")
	public int[] field1257;

	@ObfuscatedName("client.pg")
	public int[] field1258;

	@ObfuscatedName("client.qg")
	public int[] field1259;

	@ObfuscatedName("client.Ch")
	public int[] field1315;

	@ObfuscatedName("client.Dh")
	public int[] field1316;

	@ObfuscatedName("client.Hi")
	public class37[] field1362;

	@ObfuscatedName("client.Wd")
	public byte[][] field1148;

	@ObfuscatedName("client.ih")
	public byte[][] field1297;

	@ObfuscatedName("client.Si")
	public byte[][][] field1373;

	@ObfuscatedName("client.Cc")
	public int[][][] field1082;

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method418(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1234 = "";
				field1235 = "Connecting to server...";
				method424();
			}

			field1359 = new class5(method541(field1072 + 43594), this);
			field1359.method40(field1388.field610, 0, 8);
			field1388.field611 = 0;
			field1087 = field1388.method237();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1087 >> 32), (int) field1087 };
			field1081.field611 = 0;
			field1081.method221(10);
			field1081.method225(var4[0]);
			field1081.method225(var4[1]);
			field1081.method225(var4[2]);
			field1081.method225(var4[3]);
			field1081.method225(signlink.uid);
			field1081.method228(arg0);
			field1081.method228(arg1);
			field1081.method246(field1372, field1089);
			field1090.field611 = 0;

			if (arg2) {
				field1090.method221(18);
			} else {
				field1090.method221(16);
			}

			field1090.method221(field1081.field611 + 36 + 1 + 1);
			field1090.method221(237);
			field1090.method221(field1074 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1090.method225(field996[var5]);
			}

			field1090.method229(0, field1081.field610, field1081.field611);
			field1081.field615 = new class50(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1112 = new class50(var4);
			field1359.method41(field1090.field610, 0, field1090.field611);
			int var7 = field1359.method38();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method418(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field1246 = true;
				} else {
					field1246 = false;
				}

				class6.method44();
				field1382 = true;
				field1081.field611 = 0;
				field1388.field611 = 0;
				field1352 = -1;
				field1337 = -1;
				field1338 = -1;
				field1339 = -1;
				field1351 = 0;
				field1353 = 0;
				field1356 = 0;
				field1355 = 0;
				field1370 = 0;
				field1295 = 0;
				field1330 = false;
				field14 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field1143[var8] = null;
				}

				field1275 = 0;
				field1301 = 0;
				field1318 = 0;
				field1206 = 0;
				field1181 = (int) (Math.random() * 100.0D) - 50;
				field1204 = (int) (Math.random() * 110.0D) - 55;
				field1164 = (int) (Math.random() * 80.0D) - 40;
				field1268 = (int) (Math.random() * 120.0D) - 60;
				field1262 = (int) (Math.random() * 30.0D) - 20;
				field1377 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1198 = -1;
				field1175 = 0;
				field1176 = 0;
				field1290 = 0;
				field1232 = 0;

				for (int var9 = 0; var9 < field1287; var9++) {
					field1289[var9] = null;
					field1294[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1231[var10] = null;
				}

				field1145 = field1289[field1288] = new class28();
				field1219.method254();
				field1389.method254();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1349[var11][var12][var13] = null;
						}
					}
				}

				field1024 = new class42();
				field1196 = 0;
				field1254 = -1;
				field1236 = -1;
				field1118 = -1;
				field1049 = -1;
				field1150 = false;
				field1186 = 3;
				field1084 = false;
				field1330 = false;
				field994 = false;
				field1282 = null;
				field1283 = 0;
				field1271 = -1;
				field1360 = true;
				method477();

				for (int var14 = 0; var14 < 5; var14++) {
					field1057[var14] = 0;
				}

				field993 = 0;
				field1260 = 0;
				field1247 = 0;
				field1048 = 0;
				field1077 = 0;
				field999 = 0;
				field1183 = 0;
				field1034 = 0;
				field1274 = 0;
				method513();
				return;
			}

			if (var7 == 3) {
				field1234 = "";
				field1235 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field1234 = "Your account has been disabled.";
				field1235 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field1234 = "Your account is already logged in.";
				field1235 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field1234 = "RuneScape has been updated!";
				field1235 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field1234 = "This world is full.";
				field1235 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field1234 = "Unable to connect.";
				field1235 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field1234 = "Login limit exceeded.";
				field1235 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field1234 = "Unable to connect.";
				field1235 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field1235 = "Login server rejected session.";
				field1235 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field1234 = "You need a members account to login to this world.";
				field1235 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field1234 = "Could not complete login.";
				field1235 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field1234 = "The server is being updated.";
				field1235 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field1382 = true;
				field1081.field611 = 0;
				field1388.field611 = 0;
				field1352 = -1;
				field1337 = -1;
				field1338 = -1;
				field1339 = -1;
				field1351 = 0;
				field1353 = 0;
				field1356 = 0;
				field1295 = 0;
				field1330 = false;
				field1272 = System.currentTimeMillis();
				return;
			}

			if (var7 == 16) {
				field1234 = "Login attempts exceeded.";
				field1235 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field1234 = "You are standing in a members-only area.";
				field1235 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field1234 = "";
			field1235 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ZI[B)Z")
	public final boolean method419(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method420(int arg0, int arg1) {
		if (field1350 != 0) {
			int var3 = 0;
			if (field1356 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field1143[var4] != null) {
					int var5 = field1141[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field1299 == 0 || field1299 == 1 && method480(field1142[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field16 > 8 && field16 < 520 && arg0 - 11 > var6 - 10 && arg0 - 11 <= var6 + 3) {
							if (field1246) {
								field1079[field1295] = "Report abuse @whi@" + field1142[var4];
								field1328[field1295] = 2034;
								field1295++;
							}

							field1079[field1295] = "Add ignore @whi@" + field1142[var4];
							field1328[field1295] = 2436;
							field1295++;
							field1079[field1295] = "Add friend @whi@" + field1142[var4];
							field1328[field1295] = 2406;
							field1295++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field1299 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method421() {
		for (class41 var1 = (class41) field1024.method250(); var1 != null; var1 = (class41) field1024.method252()) {
			if (var1.field638 == -1) {
				var1.field637 = 0;
				method462(var1);
			} else {
				var1.method118();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZIBLd;)V")
	public final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class4 arg7) {
		if (field1298) {
			field1270 = 32;
		} else {
			field1270 = 0;
		}

		field1298 = false;
		if (arg6 >= arg0 && arg6 < arg0 + 16 && arg3 >= arg4 && arg3 < arg4 + 16) {
			arg7.field70 -= field1056 * 4;

			if (arg5) {
				field1097 = true;
				return;
			}
		} else if (arg6 >= arg0 && arg6 < arg0 + 16 && arg3 >= arg2 + arg4 - 16 && arg3 < arg2 + arg4) {
			arg7.field70 += field1056 * 4;

			if (arg5) {
				field1097 = true;
				return;
			}
		} else if (arg6 >= arg0 - field1270 && arg6 < arg0 + field1270 + 16 && arg3 >= arg4 + 16 && arg3 < arg2 + arg4 - 16 && field1056 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg4 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg7.field70 = (arg1 - arg2) * var10 / var11;

			if (arg5) {
				field1097 = true;
			}

			field1298 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public void method423() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1195);

		if (field1237 != null) {
			System.out.println("Od-cycle:" + field1237.field733);
		}

		System.out.println("loop-cycle:" + field1256);
		System.out.println("draw-cycle:" + field1357);
		System.out.println("ptype:" + field1352);
		System.out.println("psize:" + field1351);

		if (field1359 != null) {
			field1359.method42();
		}

		field6 = true;
	}

	@ObfuscatedName("client.e(B)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method424() {
		method528();
		field1134.method260();
		field1212.method204(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1207 == 0) {
			int var3 = var2 / 2 + 80;
			field1248.method207(0x75A9A9, true, var1 / 2, var3, field1237.field719);
			int var4 = var2 / 2 - 20;
			field1250.method207(0xFFFF00, true, var1 / 2, var4, "Welcome to RuneScape");
			var4 += 30;
			int var5 = var1 / 2 - 80;
			int var6 = var2 / 2 + 20;
			field1213.method204(var6 - 20, var5 - 73);
			field1250.method207(0xFFFFFF, true, var5, var6 + 5, "New user");
			int var7 = var1 / 2 + 80;
			field1213.method204(var6 - 20, var7 - 73);
			field1250.method207(0xFFFFFF, true, var7, var6 + 5, "Existing User");
		}

		if (field1207 == 2) {
			int var8 = var2 / 2 - 40;
			if (field1234.length() > 0) {
				field1250.method207(0xFFFF00, true, var1 / 2, var8 - 15, field1234);
				field1250.method207(0xFFFF00, true, var1 / 2, var8, field1235);
				var8 += 30;
			} else {
				field1250.method207(0xFFFF00, true, var1 / 2, var8 - 7, field1235);
				var8 += 30;
			}

			field1250.method211(0xFFFFFF, var8, "Username: " + field1347 + (field1029 == 0 & field1256 % 40 < 20 ? "@yel@|" : ""), true, var1 / 2 - 90);
			var8 += 15;
			field1250.method211(0xFFFFFF, var8, "Password: " + class52.method306(field1348) + (field1029 == 1 & field1256 % 40 < 20 ? "@yel@|" : ""), true, var1 / 2 - 88);
			var8 += 15;
			int var9 = var1 / 2 - 80;
			int var10 = var2 / 2 + 50;
			field1213.method204(var10 - 20, var9 - 73);
			field1250.method207(0xFFFFFF, true, var9, var10 + 5, "Login");
			int var11 = var1 / 2 + 80;
			field1213.method204(var10 - 20, var11 - 73);
			field1250.method207(0xFFFFFF, true, var11, var10 + 5, "Cancel");
		}

		if (field1207 == 3) {
			field1250.method207(0xFFFF00, true, var1 / 2, var2 / 2 - 60, "Create a free account");
			int var12 = var2 / 2 - 35;
			field1250.method207(0xFFFFFF, true, var1 / 2, var12, "To create a new account you need to");
			var12 += 15;
			field1250.method207(0xFFFFFF, true, var1 / 2, var12, "go back to the main RuneScape webpage");
			var12 += 15;
			field1250.method207(0xFFFFFF, true, var1 / 2, var12, "and choose the red 'create account'");
			var12 += 15;
			field1250.method207(0xFFFFFF, true, var1 / 2, var12, "button at the top right of that page.");
			var12 += 15;
			int var13 = var1 / 2;
			int var14 = var2 / 2 + 50;
			field1213.method204(var14 - 20, var13 - 73);
			field1250.method207(0xFFFFFF, true, var13, var14 + 5, "Cancel");
		}

		field1134.method261(214, field9, 186);

		if (field1210) {
			field1210 = false;
			field1132.method261(128, field9, 0);
			field1133.method261(214, field9, 386);
			field1137.method261(0, field9, 265);
			field1138.method261(574, field9, 265);
			field1139.method261(128, field9, 186);
			field1140.method261(574, field9, 186);
		}
	}

	@ObfuscatedName("client.a(Lmb;ZI)V")
	public final void method425(class39 arg0, int arg1) {
		field1146 = 0;
		field1292 = 0;
		method456(arg1, arg0);
		method473(arg1, arg0);
		method436(arg0, arg1);
		method504(arg0, arg1);

		for (int var3 = 0; var3 < field1146; var3++) {
			int var4 = field1147[var3];
			if (field1256 != field1289[var4].field403) {
				field1289[var4] = null;
			}
		}

		if (arg0.field611 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field611 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1290; var5++) {
			if (field1289[field1291[var5]] == null) {
				signlink.reporterror(field1347 + " null entry in pl list - pos:" + var5 + " size:" + field1290);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method426() {
		int var1 = field1120;
		int var2 = field1121;
		int var3 = field1122;
		int var4 = field1123;
		int var5 = 0x5D5447;
		class34.method165(var4, var2, var3, var1, var5);
		class34.method165(16, var2 + 1, var3 - 2, var1 + 1, 0);
		class34.method166(var2 + 18, var1 + 1, var3 - 2, 0, var4 - 19);
		field1250.method209(var5, var1 + 3, var2 + 14, "Choose Option");
		int var6 = field16;
		int var7 = field17;
		if (field1119 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1119 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field1119 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field1295; var8++) {
			int var9 = (field1295 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1250.method211(var10, var9, field1079[var8], true, var1 + 3);
		}
	}

	@ObfuscatedName("client.a(I)V")
	public final void method9() {
		if (field1322 || field1059 || field1383) {
			method463();
		} else {
			field1357++;

			if (field1382) {
				method503();
			} else {
				method424();
			}

			field1056 = 0;
		}
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String method427(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method428(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.h(B)V")
	public final void method429() {
		field1266++;
		method548();
		method469();
		method538();
		method489();

		if (!field1149) {
			int var1 = field1376;
			if (field1189 / 256 > var1) {
				var1 = field1189 / 256;
			}

			if (field1050[4] && field1040[4] + 128 > var1) {
				var1 = field1040[4] + 128;
			}

			int var2 = field1377 + field1164 & 0x7FF;
			method485(field1105, var1, var1 * 3 + 600, field1104, var2, method520(field1174, field1145.field360, field1145.field359) - 50);
			field1380++;
			if (field1380 > 1802) {
				field1380 = 0;
				field1081.method220(15);
				field1081.method221(0);
				int var3 = field1081.field611;
				field1081.method222(29711);
				field1081.method221(70);
				field1081.method221((int) (Math.random() * 256.0D));
				field1081.method221(242);
				field1081.method221(186);
				field1081.method221(39);
				field1081.method221(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1081.method221(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1081.method222(57856);
				}

				field1081.method222((int) (Math.random() * 65536.0D));
				field1081.method230(field1081.field611 - var3);
			}
		}

		int var4;
		if (field1149) {
			var4 = method472();
		} else {
			var4 = method471();
		}

		int var5 = field1041;
		int var6 = field1042;
		int var7 = field1043;
		int var8 = field1044;
		int var9 = field1045;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1050[var10]) {
				int var11 = (int) (Math.random() * (field1058[var10] * 2 + 1) + Math.sin(field1381[var10] / 100.0D * field1070[var10]) * field1040[var10] - field1058[var10]);
				if (var10 == 0) {
					field1041 += var11;
				}

				if (var10 == 1) {
					field1042 += var11;
				}

				if (var10 == 2) {
					field1043 += var11;
				}

				if (var10 == 3) {
					field1045 = field1045 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1044 += var11;
					if (field1044 < 128) {
						field1044 = 128;
					}

					if (field1044 > 383) {
						field1044 = 383;
					}
				}
			}
		}

		int var12 = class35.field582;
		class32.field534 = true;
		class32.field537 = 0;
		class32.field535 = field16 - 8;
		class32.field536 = field17 - 11;
		class34.method164();
		field995.method101(field1042, field1041, field1044, var4, field1045, field1043);
		field995.method76();
		method484();
		method441();
		method494(var12);
		method479();
		field1156.method261(8, field9, 11);
		field1041 = var5;
		field1042 = var6;
		field1043 = var7;
		field1044 = var8;
		field1045 = var9;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method430(int arg0) {
		int[] var2 = field1177.field585;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1373[arg0][var7][var5] & 0x18) == 0) {
					field995.method97(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1373[arg0 + 1][var7][var5] & 0x8) != 0) {
					field995.method97(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1177.method186();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1373[arg0][var11][var10] & 0x18) == 0) {
					method521(var11, var10, var8, arg0, var9);
				}

				if (arg0 < 3 && (field1373[arg0 + 1][var11][var10] & 0x8) != 0) {
					method521(var11, var10, var8, arg0 + 1, var9);
				}
			}
		}

		field1156.method260();
		field1020 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field995.method91(field1174, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method324(var14).field824;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1036[field1174].field914;
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

						field1384[field1020] = field1185[var15];
						field1021[field1020] = var16;
						field1022[field1020] = var17;
						field1020++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILd;IIII)V")
	public final void method431(int arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5) {
		if (arg2.field58 == 0 && arg2.field72 != null && !arg2.field71 && (arg0 >= arg3 && arg5 >= arg4 && arg0 <= arg2.field61 + arg3 && arg5 <= arg2.field62 + arg4)) {
			int var7 = arg2.field72.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg2.field73[var8] + arg3;
				int var10 = arg2.field74[var8] + arg4 - arg1;
				class4 var11 = class4.field51[arg2.field72[var8]];
				var9 += var11.field63;
				var10 += var11.field64;
				if ((var11.field68 >= 0 || var11.field94 != 0) && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field61 + var9 && arg5 < var11.field62 + var10) {
					if (var11.field68 >= 0) {
						field1018 = var11.field68;
					} else {
						field1018 = var11.field56;
					}
				}

				if (var11.field58 == 0) {
					method431(arg0, var11.field70, var11, var9, var10, arg5);

					if (var11.field69 > var11.field62) {
						method422(var11.field61 + var9, var11.field69, var11.field62, arg5, var10, true, arg0, var11);
					}
				} else {
					if (var11.field59 == 1 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field61 + var9 && arg5 < var11.field62 + var10) {
						boolean var12 = false;
						if (var11.field60 != 0) {
							var12 = method508(var11);
						}

						if (!var12) {
							field1079[field1295] = var11.field109;
							field1328[field1295] = 951;
							field1327[field1295] = var11.field56;
							field1295++;
						}
					}

					if (var11.field59 == 2 && field1301 == 0 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field61 + var9 && arg5 < var11.field62 + var10) {
						String var13 = var11.field106;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1079[field1295] = var13 + " @gre@" + var11.field107;
						field1328[field1295] = 930;
						field1327[field1295] = var11.field56;
						field1295++;
					}

					if (var11.field59 == 3 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field61 + var9 && arg5 < var11.field62 + var10) {
						field1079[field1295] = "Close";
						field1328[field1295] = 947;
						field1327[field1295] = var11.field56;
						field1295++;
					}

					if (var11.field59 == 4 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field61 + var9 && arg5 < var11.field62 + var10) {
						field1079[field1295] = var11.field109;
						field1328[field1295] = 465;
						field1327[field1295] = var11.field56;
						field1295++;
					}

					if (var11.field59 == 5 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field61 + var9 && arg5 < var11.field62 + var10) {
						field1079[field1295] = var11.field109;
						field1328[field1295] = 960;
						field1327[field1295] = var11.field56;
						field1295++;
					}

					if (var11.field59 == 6 && !field1150 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field61 + var9 && arg5 < var11.field62 + var10) {
						field1079[field1295] = var11.field109;
						field1328[field1295] = 44;
						field1327[field1295] = var11.field56;
						field1295++;
					}

					if (var11.field58 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field62; var15++) {
							for (int var16 = 0; var16 < var11.field61; var16++) {
								int var17 = (var11.field80 + 32) * var16 + var9;
								int var18 = (var11.field81 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field83[var14];
									var18 += var11.field84[var14];
								}

								if (arg0 >= var17 && arg5 >= var18 && arg0 < var17 + 32 && arg5 < var18 + 32) {
									field1085 = var14;
									field1086 = var11.field56;

									if (var11.field52[var14] > 0) {
										class59 var19 = class59.method339(var11.field52[var14] - 1);
										if (field1275 == 1 && var11.field78) {
											if (field1277 != var11.field56 || field1276 != var14) {
												field1079[field1295] = "Use " + field1279 + " with @lre@" + var19.field874;
												field1328[field1295] = 881;
												field1329[field1295] = var19.field872;
												field1326[field1295] = var14;
												field1327[field1295] = var11.field56;
												field1295++;
											}
										} else if (field1301 != 1 || !var11.field78) {
											if (var11.field78) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field889 != null && var19.field889[var20] != null) {
														field1079[field1295] = var19.field889[var20] + " @lre@" + var19.field874;

														if (var20 == 3) {
															field1328[field1295] = 478;
														}

														if (var20 == 4) {
															field1328[field1295] = 347;
														}

														field1329[field1295] = var19.field872;
														field1326[field1295] = var14;
														field1327[field1295] = var11.field56;
														field1295++;
													} else if (var20 == 4) {
														field1079[field1295] = "Drop @lre@" + var19.field874;
														field1328[field1295] = 347;
														field1329[field1295] = var19.field872;
														field1326[field1295] = var14;
														field1327[field1295] = var11.field56;
														field1295++;
													}
												}
											}

											if (var11.field79) {
												field1079[field1295] = "Use @lre@" + var19.field874;
												field1328[field1295] = 188;
												field1329[field1295] = var19.field872;
												field1326[field1295] = var14;
												field1327[field1295] = var11.field56;
												field1295++;
											}

											if (var11.field78 && var19.field889 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field889[var21] != null) {
														field1079[field1295] = var19.field889[var21] + " @lre@" + var19.field874;

														if (var21 == 0) {
															field1328[field1295] = 405;
														}

														if (var21 == 1) {
															field1328[field1295] = 38;
														}

														if (var21 == 2) {
															field1328[field1295] = 422;
														}

														field1329[field1295] = var19.field872;
														field1326[field1295] = var14;
														field1327[field1295] = var11.field56;
														field1295++;
													}
												}
											}

											if (var11.field85 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field85[var22] != null) {
														field1079[field1295] = var11.field85[var22] + " @lre@" + var19.field874;

														if (var22 == 0) {
															field1328[field1295] = 602;
														}

														if (var22 == 1) {
															field1328[field1295] = 596;
														}

														if (var22 == 2) {
															field1328[field1295] = 22;
														}

														if (var22 == 3) {
															field1328[field1295] = 892;
														}

														if (var22 == 4) {
															field1328[field1295] = 415;
														}

														field1329[field1295] = var19.field872;
														field1326[field1295] = var14;
														field1327[field1295] = var11.field56;
														field1295++;
													}
												}
											}

											field1079[field1295] = "Examine @lre@" + var19.field874;
											field1328[field1295] = 1773;
											field1329[field1295] = var19.field872;
											field1327[field1295] = var11.field53[var14];
											field1295++;
										} else if ((field1303 & 0x10) == 0x10) {
											field1079[field1295] = field1304 + " @lre@" + var19.field874;
											field1328[field1295] = 391;
											field1329[field1295] = var19.field872;
											field1326[field1295] = var14;
											field1327[field1295] = var11.field56;
											field1295++;
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

	@ObfuscatedName("client.i(B)V")
	public final void method432() {
		field1099 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1179) {
				field1195++;
				method515();
				method515();
				method527();
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

		field1099 = false;
	}

	@ObfuscatedName("client.a(I[BZ)V")
	public final void method433(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method434(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1196; var3++) {
				if (field1095[var3] == arg0) {
					field1196--;
					field1097 = true;

					for (int var4 = var3; var4 < field1196; var4++) {
						field1220[var4] = field1220[var4 + 1];
						field1323[var4] = field1323[var4 + 1];
						field1095[var4] = field1095[var4 + 1];
					}

					field1081.method220(39);
					field1081.method227(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method435() {
		field1081.method220(224);

		if (field1049 != -1) {
			field1049 = -1;
			field1097 = true;
			field1150 = false;
			field1280 = true;
		}

		if (field1236 != -1) {
			field1236 = -1;
			field1281 = true;
			field1150 = false;
		}

		field1118 = -1;
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method436(class39 arg0, int arg1) {
		while (arg0.field612 + 10 < arg1 * 8) {
			int var3 = arg0.method242(11);
			if (var3 == 2047) {
				break;
			}

			if (field1289[var3] == null) {
				field1289[var3] = new class28();
				if (field1294[var3] != null) {
					field1289[var3].method126(field1294[var3]);
				}
			}

			field1291[field1290++] = var3;
			class28 var4 = field1289[var3];
			var4.field403 = field1256;
			int var5 = arg0.method242(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method242(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method242(1);
			var4.method122(field1145.field407[0] + var5, field1145.field408[0] + var6, var7 == 1);
			int var8 = arg0.method242(1);
			if (var8 == 1) {
				field1293[field1292++] = var3;
			}
		}

		arg0.method243();
	}

	@ObfuscatedName("client.d(I)V")
	public final void method437() {
		int var1 = field1250.method208("Choose Option");
		for (int var2 = 0; var2 < field1295; var2++) {
			int var3 = field1250.method208(field1079[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1295 * 15 + 21;
		if (field19 > 8 && field20 > 11 && field19 < 520 && field20 < 345) {
			int var5 = field19 - var1 / 2 - 8;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field20 - 11;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field1330 = true;
			field1119 = 0;
			field1120 = var5;
			field1121 = var6;
			field1122 = var1;
			field1123 = field1295 * 15 + 22;
		}

		if (field19 > 562 && field20 > 231 && field19 < 752 && field20 < 492) {
			int var7 = field19 - var1 / 2 - 562;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field20 - 231;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field1330 = true;
			field1119 = 1;
			field1120 = var7;
			field1121 = var8;
			field1122 = var1;
			field1123 = field1295 * 15 + 22;
		}

		if (field19 > 22 && field20 > 375 && field19 < 501 && field20 < 471) {
			int var9 = field19 - var1 / 2 - 22;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field20 - 375;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field1330 = true;
			field1119 = 2;
			field1120 = var9;
			field1121 = var10;
			field1122 = var1;
			field1123 = field1295 * 15 + 22;
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method438() {
		byte[] var1 = field1094.method299("title.dat", null);
		class36 var2 = new class36(var1, this);
		field1135.method260();
		var2.method188(0, 0);
		field1136.method260();
		var2.method188(0, -661);
		field1132.method260();
		var2.method188(0, -128);
		field1133.method260();
		var2.method188(-386, -214);
		field1134.method260();
		var2.method188(-186, -214);
		field1137.method260();
		var2.method188(-265, 0);
		field1138.method260();
		var2.method188(-265, -574);
		field1139.method260();
		var2.method188(-186, -128);
		field1140.method260();
		var2.method188(-186, -574);
		int[] var3 = new int[var2.field586];
		for (int var4 = 0; var4 < var2.field587; var4++) {
			for (int var5 = 0; var5 < var2.field586; var5++) {
				var3[var5] = var2.field585[var2.field586 * var4 + var2.field586 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field586; var6++) {
				var2.field585[var2.field586 * var4 + var6] = var3[var6];
			}
		}

		field1135.method260();
		var2.method188(0, 394);
		field1136.method260();
		var2.method188(0, -267);
		field1132.method260();
		var2.method188(0, 266);
		field1133.method260();
		var2.method188(-386, 180);
		field1134.method260();
		var2.method188(-186, 180);
		field1137.method260();
		var2.method188(-265, 394);
		field1138.method260();
		var2.method188(-265, -180);
		field1139.method260();
		var2.method188(-186, 212);
		field1140.method260();
		var2.method188(-186, -180);
		class36 var7 = new class36(field1094, "logo", 0);
		field1132.method260();
		var7.method190(18, field7 / 2 - var7.field586 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method439(class4 arg0) {
		if (arg0.field66 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field66.length; var2++) {
			int var3 = method531(var2, arg0);
			int var4 = arg0.field67[var2];
			if (arg0.field66[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field66[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field66[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIIIB)V")
	public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg1 >= 1 && arg2 <= 102 && arg1 <= 102) {
			if (field1074 && field1174 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field995.method88(arg5, arg2, arg1);
			}

			if (arg0 == 1) {
				var8 = field995.method89(arg2, arg1, arg5);
			}

			if (arg0 == 2) {
				var8 = field995.method90(arg5, arg2, arg1);
			}

			if (arg0 == 3) {
				var8 = field995.method91(arg5, arg2, arg1);
			}

			if (var8 != 0) {
				int var12 = field995.method92(arg5, arg2, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field995.method79(arg5, arg1, arg2);
					class57 var16 = class57.method324(var13);
					if (var16.field812) {
						field1036[arg5].method355(var16.field813, var14, var15, arg2, arg1);
					}
				}

				if (arg0 == 1) {
					field995.method80(arg2, arg5, arg1);
				}

				if (arg0 == 2) {
					field995.method81(arg2, arg1, arg5);
					class57 var17 = class57.method324(var13);
					if (var17.field810 + arg2 > 103 || var17.field810 + arg1 > 103 || var17.field811 + arg2 > 103 || var17.field811 + arg1 > 103) {
						return;
					}

					if (var17.field812) {
						field1036[arg5].method356(var17.field810, var15, var17.field813, arg2, var17.field811, arg1);
					}
				}

				if (arg0 == 3) {
					field995.method82(arg1, arg2, arg5);
					class57 var18 = class57.method324(var13);
					if (var18.field812 && var18.field814) {
						field1036[arg5].method358(arg1, arg2);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field1373[1][arg2][arg1] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				class3.method31(arg4, arg6, arg1, arg5, field1082, var19, field1036[arg5], arg3, field995, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method441() {
		if (field1370 == 2) {
			method517((field1364 - field1100 << 7) + field1367, (field1365 - field1101 << 7) + field1368, field1366 * 2);

			if (field1312 > -1 && field1256 % 20 < 10) {
				field1031[2].method190(field1313 - 28, field1312 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(IZ)Z")
	public final boolean method442(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1328[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method443() {
		if (field1128 == 0) {
			int var1 = field18;
			if (field1301 == 1 && field19 >= 520 && field20 >= 165 && field19 <= 788 && field20 <= 230) {
				var1 = 0;
			}

			if (field1330) {
				if (var1 != 1) {
					int var2 = field16;
					int var3 = field17;
					if (field1119 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1119 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field1119 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field1120 - 10 || var2 > field1122 + field1120 + 10 || var3 < field1121 - 10 || var3 > field1123 + field1121 + 10) {
						field1330 = false;

						if (field1119 == 1) {
							field1097 = true;
						}

						if (field1119 == 2) {
							field1281 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1120;
					int var5 = field1121;
					int var6 = field1122;
					int var7 = field19;
					int var8 = field20;
					if (field1119 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1119 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field1119 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1295; var10++) {
						int var11 = (field1295 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method486(var9);
					}

					field1330 = false;

					if (field1119 == 1) {
						field1097 = true;
					}

					if (field1119 == 2) {
						field1281 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1295 > 0) {
					int var12 = field1328[field1295 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = field1326[field1295 - 1];
						int var14 = field1327[field1295 - 1];
						class4 var15 = class4.field51[var14];
						if (var15.field77) {
							field1125 = false;
							field1375 = 0;
							field1126 = var14;
							field1127 = var13;
							field1128 = 2;
							field1129 = field19;
							field1130 = field20;

							if (class4.field51[var14].field57 == field1118) {
								field1128 = 1;
							}

							if (class4.field51[var14].field57 == field1236) {
								field1128 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1027 == 1 || method442(field1295 - 1)) && field1295 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1295 > 0) {
					method486(field1295 - 1);
				}

				if (var1 != 2 || field1295 <= 0) {
					return;
				}

				method437();
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method444(int arg0) {
		int var2 = class67.field974[arg0].field982;
		if (var2 != 0) {
			int var3 = field1096[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class35.method178(0.9D);
				}

				if (var3 == 2) {
					class35.method178(0.8D);
				}

				if (var3 == 3) {
					class35.method178(0.7D);
				}

				if (var3 == 4) {
					class35.method178(0.6D);
				}

				class59.field907.method115();
				field1210 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1047;

				if (var3 == 0) {
					method448(field1047, 0);
					field1047 = true;
				}

				if (var3 == 1) {
					method448(field1047, -400);
					field1047 = true;
				}

				if (var3 == 2) {
					method448(field1047, -800);
					field1047 = true;
				}

				if (var3 == 3) {
					method448(field1047, -1200);
					field1047 = true;
				}

				if (var3 == 4) {
					field1047 = false;
				}

				if (field1047 != var4 && !field1074) {
					if (field1047) {
						field1068 = field1039;
						field1069 = false;
						field1237.method279(2, field1068);
					} else {
						method544();
					}

					field1190 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1035 = true;
					method507(0);
				}

				if (var3 == 1) {
					field1035 = true;
					method507(-400);
				}

				if (var3 == 2) {
					field1035 = true;
					method507(-800);
				}

				if (var3 == 3) {
					field1035 = true;
					method507(-1200);
				}

				if (var3 == 4) {
					field1035 = false;
				}
			}

			if (var2 == 5) {
				field1027 = var3;
			}

			if (var2 == 6) {
				field1336 = var3;
			}

			if (var2 == 8) {
				field1350 = var3;
				field1281 = true;
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public static final String method445(int arg0) {
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

	@ObfuscatedName("client.g(I)V")
	public final void method446() {
		for (int var1 = -1; var1 < field1290; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1288;
			} else {
				var2 = field1291[var1];
			}

			class28 var3 = field1289[var2];
			if (var3 != null && var3.field372 > 0) {
				var3.field372--;
				if (var3.field372 == 0) {
					var3.field371 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1232; var4++) {
			int var5 = field1233[var4];
			class27 var6 = field1231[var5];
			if (var6 != null && var6.field372 > 0) {
				var6.field372--;
				if (var6.field372 == 0) {
					var6.field371 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method447() {
		if (field18 == 1) {
			if (field19 >= 549 && field19 <= 583 && field20 >= 195 && field20 < 231 && field1187[0] != -1) {
				field1097 = true;
				field1186 = 0;
				field1280 = true;
			}

			if (field19 >= 579 && field19 <= 609 && field20 >= 194 && field20 < 231 && field1187[1] != -1) {
				field1097 = true;
				field1186 = 1;
				field1280 = true;
			}

			if (field19 >= 607 && field19 <= 637 && field20 >= 194 && field20 < 231 && field1187[2] != -1) {
				field1097 = true;
				field1186 = 2;
				field1280 = true;
			}

			if (field19 >= 635 && field19 <= 679 && field20 >= 194 && field20 < 229 && field1187[3] != -1) {
				field1097 = true;
				field1186 = 3;
				field1280 = true;
			}

			if (field19 >= 676 && field19 <= 706 && field20 >= 194 && field20 < 231 && field1187[4] != -1) {
				field1097 = true;
				field1186 = 4;
				field1280 = true;
			}

			if (field19 >= 704 && field19 <= 734 && field20 >= 194 && field20 < 231 && field1187[5] != -1) {
				field1097 = true;
				field1186 = 5;
				field1280 = true;
			}

			if (field19 >= 732 && field19 <= 766 && field20 >= 195 && field20 < 231 && field1187[6] != -1) {
				field1097 = true;
				field1186 = 6;
				field1280 = true;
			}

			if (field19 >= 550 && field19 <= 584 && field20 >= 492 && field20 < 528 && field1187[7] != -1) {
				field1097 = true;
				field1186 = 7;
				field1280 = true;
			}

			if (field19 >= 582 && field19 <= 612 && field20 >= 492 && field20 < 529 && field1187[8] != -1) {
				field1097 = true;
				field1186 = 8;
				field1280 = true;
			}

			if (field19 >= 609 && field19 <= 639 && field20 >= 492 && field20 < 529 && field1187[9] != -1) {
				field1097 = true;
				field1186 = 9;
				field1280 = true;
			}

			if (field19 >= 637 && field19 <= 681 && field20 >= 493 && field20 < 528 && field1187[10] != -1) {
				field1097 = true;
				field1186 = 10;
				field1280 = true;
			}

			if (field19 >= 679 && field19 <= 709 && field20 >= 492 && field20 < 529 && field1187[11] != -1) {
				field1097 = true;
				field1186 = 11;
				field1280 = true;
			}

			if (field19 >= 706 && field19 <= 736 && field20 >= 492 && field20 < 529 && field1187[12] != -1) {
				field1097 = true;
				field1186 = 12;
				field1280 = true;
			}

			if (field19 >= 734 && field19 <= 768 && field20 >= 492 && field20 < 528 && field1187[13] != -1) {
				field1097 = true;
				field1186 = 13;
				field1280 = true;
			}

			field1324++;
			if (field1324 > 150) {
				field1324 = 0;
				field1081.method220(43);
				field1081.method221(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method448(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;Ljava/lang/String;)V")
	public final void method449(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1254 != -1) {
			field1282 = arg2;
			field18 = 0;
		}

		if (field1236 == -1) {
			field1281 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1141[var4] = field1141[var4 - 1];
			field1142[var4] = field1142[var4 - 1];
			field1143[var4] = field1143[var4 - 1];
		}

		field1141[0] = arg0;
		field1142[0] = arg1;
		field1143[0] = arg2;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method450() {
		while (true) {
			class40 var1 = field1237.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field622 == 0) {
				class32.method133(var1.field624, var1.field623);

				if ((field1237.method278(var1.field623) & 0x62) != 0) {
					field1097 = true;

					if (field1236 != -1) {
						field1281 = true;
					}
				}
			}

			if (var1.field622 == 1 && var1.field624 != null) {
				class8.method58(var1.field624);
			}

			if (var1.field622 == 2 && field1068 == var1.field623 && var1.field624 != null) {
				method433(var1.field624, field1069);
			}

			if (var1.field622 == 3 && field1318 == 1) {
				for (int var2 = 0; var2 < field1297.length; var2++) {
					if (field1258[var2] == var1.field623) {
						field1297[var2] = var1.field624;

						if (var1.field624 == null) {
							field1258[var2] = -1;
						}

						break;
					}

					if (field1259[var2] == var1.field623) {
						field1148[var2] = var1.field624;

						if (var1.field624 == null) {
							field1259[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field622 == 93 && field1237.method277(var1.field623)) {
				class3.method17(new class39(var1.field624), field1237);
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method451() {
		if (field1074 && field1318 == 2 && class3.field27 != field1174) {
			field1156.method260();
			field1249.method206("Loading - please wait.", 257, 151, 0);
			field1249.method206("Loading - please wait.", 256, 150, 0xFFFFFF);
			field1156.method261(8, field9, 11);
			field1318 = 1;
			field1272 = System.currentTimeMillis();
		}

		if (field1318 == 1) {
			int var1 = method452();
			if (var1 != 0 && System.currentTimeMillis() - field1272 > 360000L) {
				signlink.reporterror(field1347 + " glcfb " + field1087 + "," + var1 + "," + field1074 + "," + field1063[0] + "," + field1237.method280() + "," + field1174 + "," + field1092 + "," + field1093);
				field1272 = System.currentTimeMillis();
			}
		}

		if (field1318 == 2 && field1198 != field1174) {
			field1198 = field1174;
			method430(field1174);
		}
	}

	@ObfuscatedName("client.l(B)I")
	public final int method452() {
		for (int var1 = 0; var1 < field1297.length; var1++) {
			if (field1297[var1] == null && field1258[var1] != -1) {
				return -1;
			}

			if (field1148[var1] == null && field1259[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1297.length; var3++) {
			byte[] var4 = field1148[var3];
			if (var4 != null) {
				int var5 = (field1257[var3] >> 8) * 64 - field1100;
				int var6 = (field1257[var3] & 0xFF) * 64 - field1101;
				var2 &= class3.method16(var6, var5, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1371) {
			return -4;
		} else {
			field1318 = 2;
			class3.field27 = field1174;
			method505();
			return 0;
		}
	}

	@ObfuscatedName("client.a(ZILmb;)V")
	public final void method453(int arg0, class39 arg1) {
		while (arg1.field612 + 21 < arg0 * 8) {
			int var3 = arg1.method242(13);
			if (var3 == 8191) {
				break;
			}

			if (field1231[var3] == null) {
				field1231[var3] = new class27();
			}

			class27 var4 = field1231[var3];
			field1233[field1232++] = var3;
			var4.field403 = field1256;
			var4.field411 = class58.method333(arg1.method242(11));
			var4.field363 = var4.field411.field846;
			var4.field366 = var4.field411.field850;
			var4.field367 = var4.field411.field851;
			var4.field368 = var4.field411.field852;
			var4.field369 = var4.field411.field853;
			var4.field364 = var4.field411.field849;
			int var5 = arg1.method242(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method242(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method122(field1145.field407[0] + var5, field1145.field408[0] + var6, false);
			int var7 = arg1.method242(1);
			if (var7 == 1) {
				field1293[field1292++] = var3;
			}
		}

		arg1.method243();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIBILjava/lang/String;)Lyb;")
	public final class51 method454(String arg0, int arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1063[0] != null) {
				var6 = field1063[0].method291(arg3);
			}
		} catch (Exception var27) {
		}

		if (var6 != null) {
			field1208.reset();
			field1208.update(var6);
			int var8 = (int) field1208.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class51(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			method13("Requesting " + arg4, arg2);
			Object var11 = null;

			try {
				int var12 = 0;
				DataInputStream var13 = method493(arg0 + arg1);
				byte[] var14 = new byte[6];
				var13.readFully(var14, 0, 6);
				class39 var15 = new class39(var14);
				var15.field611 = 3;
				int var16 = var15.method235() + 6;
				int var17 = 6;
				var6 = new byte[var16];
				for (int var18 = 0; var18 < 6; var18++) {
					var6[var18] = var14[var18];
				}

				while (var17 < var16) {
					int var19 = var16 - var17;
					if (var19 > 1000) {
						var19 = 1000;
					}

					int var20 = var13.read(var6, var17, var19);
					if (var20 < 0) {
						throw new IOException("EOF");
					}

					var17 += var20;
					int var21 = var17 * 100 / var16;
					if (var12 != var21) {
						method13("Loading " + arg4 + " - " + var21 + "%", arg2);
					}

					var12 = var21;
				}

				var13.close();

				try {
					if (field1063[0] != null) {
						field1063[0].method292(arg3, var6.length, var6);
					}
				} catch (Exception var26) {
					field1063[0] = null;
				}

				if (var6 != null) {
					field1208.reset();
					field1208.update(var6);
					int var22 = (int) field1208.getValue();
					if (arg1 != var22) {
						var6 = null;
						var10++;
					}
				}
			} catch (IOException var28) {
				var6 = null;
			} catch (Exception var29) {
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			}

			if (var6 == null) {
				for (int var23 = var7; var23 > 0; var23--) {
					if (var10 >= 3) {
						method13("Game updated - please reload page", arg2);
						var23 = 10;
					} else {
						method13("Error loading - Will retry in " + var23 + " secs.", arg2);
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var25) {
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

	@ObfuscatedName("client.m(B)V")
	public static final void method455() {
		class19.field257 = true;
		class35.field562 = true;
		field1074 = true;
		class3.field26 = true;
	}

	@ObfuscatedName("client.b(ZILmb;)V")
	public final void method456(int arg0, class39 arg1) {
		arg1.method241();
		int var3 = arg1.method242(1);
		if (var3 != 0) {
			int var4 = arg1.method242(2);
			if (var4 == 0) {
				field1293[field1292++] = field1288;
			} else if (var4 == 1) {
				int var5 = arg1.method242(3);
				field1145.method123(var5, false);
				int var6 = arg1.method242(1);
				if (var6 == 1) {
					field1293[field1292++] = field1288;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method242(3);
				field1145.method123(var7, true);
				int var8 = arg1.method242(3);
				field1145.method123(var8, true);
				int var9 = arg1.method242(1);
				if (var9 == 1) {
					field1293[field1292++] = field1288;
				}
			} else if (var4 == 3) {
				field1174 = arg1.method242(2);
				int var10 = arg1.method242(7);
				int var11 = arg1.method242(7);
				int var12 = arg1.method242(1);
				field1145.method122(var10, var11, var12 == 1);
				int var13 = arg1.method242(1);
				if (var13 == 1) {
					field1293[field1292++] = field1288;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method457() {
		field1212 = new class37(field1094, "titlebox", 0);
		field1213 = new class37(field1094, "titlebutton", 0);
		field1362 = new class37[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1362[var1] = new class37(field1094, "runes", var1);
		}

		field1108 = new class36(128, 265);
		field1109 = new class36(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1108.field585[var2] = field1135.field643[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1109.field585[var3] = field1136.field643[var3];
		}

		field1171 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1171[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1171[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1171[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1171[var7 + 192] = 0xFFFFFF;
		}

		field1172 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1172[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1172[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1172[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1172[var11 + 192] = 0xFFFFFF;
		}

		field1173 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1173[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1173[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1173[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1173[var15 + 192] = 0xFFFFFF;
		}

		field1170 = new int[256];
		field1217 = new int[32768];
		field1218 = new int[32768];
		method488(null);
		field1315 = new int[32768];
		field1316 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1179) {
			field1296 = true;
			field1179 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method458() {
		try {
			int var1 = field1145.field359 + field1181;
			int var2 = field1145.field360 + field1204;
			if (field1104 - var1 < -500 || field1104 - var1 > 500 || field1105 - var2 < -500 || field1105 - var2 > 500) {
				field1104 = var1;
				field1105 = var2;
			}

			if (field1104 != var1) {
				field1104 += (var1 - field1104) / 16;
			}

			if (field1105 != var2) {
				field1105 += (var2 - field1105) / 16;
			}

			if (field21[1] == 1) {
				field1378 += (-field1378 - 24) / 2;
			} else if (field21[2] == 1) {
				field1378 += (24 - field1378) / 2;
			} else {
				field1378 /= 2;
			}

			if (field21[3] == 1) {
				field1379 += (12 - field1379) / 2;
			} else if (field21[4] == 1) {
				field1379 += (-field1379 - 12) / 2;
			} else {
				field1379 /= 2;
			}

			field1377 = field1378 / 2 + field1377 & 0x7FF;
			field1376 += field1379 / 2;
			if (field1376 < 128) {
				field1376 = 128;
			}

			if (field1376 > 383) {
				field1376 = 383;
			}

			int var3 = field1104 >> 7;
			int var4 = field1105 >> 7;
			int var5 = method520(field1174, field1105, field1104);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1174;
						if (var9 < 3 && (field1373[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1082[var9][var7][var8];
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
			signlink.reporterror("glfc_ex " + field1145.field359 + "," + field1145.field360 + "," + field1104 + "," + field1105 + "," + field1092 + "," + field1093 + "," + field1100 + "," + field1101);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method459() {
		try {
			if (field1359 != null) {
				field1359.method37();
			}
		} catch (Exception var2) {
		}

		field1359 = null;
		field1382 = false;
		field1207 = 0;
		field1347 = "";
		field1348 = "";
		class6.method44();
		method481();
		field995.method62();

		for (int var1 = 0; var1 < 4; var1++) {
			field1036[var1].method350();
		}

		System.gc();
		method544();
		field1039 = -1;
		field1068 = -1;
		field1190 = 0;
	}

	@ObfuscatedName("client.a(IZIZIIIIIIII)Z")
	public final boolean method460(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1083[var14][var15] = 0;
				field1193[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg3;
		field1083[arg10][arg3] = 99;
		field1193[arg10][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1032[var18] = arg10;
		int var35 = var18 + 1;
		field1033[var18] = arg3;
		boolean var20 = false;
		int var21 = field1032.length;
		int[][] var22 = field1036[field1174].field914;
		while (var35 != var19) {
			var16 = field1032[var19];
			var17 = field1033[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg5 == var17) {
				var20 = true;
				break;
			}

			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && field1036[field1174].method359(arg5, arg8 - 1, arg4, var17, var16, arg0)) {
					var20 = true;
					break;
				}

				if (arg8 < 10 && field1036[field1174].method360(var17, arg5, arg8 - 1, arg0, arg4, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg7 != 0 && arg9 != 0 && field1036[field1174].method361(var16, arg1, arg0, arg5, var17, arg7, arg9)) {
				var20 = true;
				break;
			}

			int var23 = field1193[var16][var17] + 1;
			if (var16 > 0 && field1083[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1032[var35] = var16 - 1;
				field1033[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1083[var16 - 1][var17] = 2;
				field1193[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1083[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1032[var35] = var16 + 1;
				field1033[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1083[var16 + 1][var17] = 8;
				field1193[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1083[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1032[var35] = var16;
				field1033[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1083[var16][var17 - 1] = 1;
				field1193[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1083[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1032[var35] = var16;
				field1033[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1083[var16][var17 + 1] = 4;
				field1193[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1083[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1032[var35] = var16 - 1;
				field1033[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1083[var16 - 1][var17 - 1] = 3;
				field1193[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1083[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1032[var35] = var16 + 1;
				field1033[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1083[var16 + 1][var17 - 1] = 9;
				field1193[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1083[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1032[var35] = var16 - 1;
				field1033[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1083[var16 - 1][var17 + 1] = 6;
				field1193[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1083[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1032[var35] = var16 + 1;
				field1033[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1083[var16 + 1][var17 + 1] = 12;
				field1193[var16 + 1][var17 + 1] = var23;
			}
		}

		field1317 = 0;
		if (!var20) {
			if (arg2) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg5 - var25; var27 <= arg5 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1193[var26][var27] < var24) {
								var24 = field1193[var26][var27];
								var16 = var26;
								var17 = var27;
								field1317 = 1;
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
		field1032[var28] = var16;
		int var36 = var28 + 1;
		field1033[var28] = var17;
		int var29;
		int var30 = var29 = field1083[var16][var17];
		while (arg10 != var16 || arg3 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1032[var36] = var16;
				field1033[var36++] = var17;
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

			var30 = field1083[var16][var17];
		}

		if (var36 <= 0) {
			if (arg6 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1032[var36];
		int var33 = field1033[var36];

		if (arg6 == 0) {
			field1081.method220(222);
			field1081.method221(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field1081.method220(201);
			field1081.method221(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field1081.method220(140);
			field1081.method221(var31 + var31 + 3);
		}

		if (field21[5] == 1) {
			field1081.method221(1);
		} else {
			field1081.method221(0);
		}

		field1081.method222(field1100 + var32);
		field1081.method222(field1101 + var33);
		field1175 = field1032[0];
		field1176 = field1033[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1081.method221(field1032[var36] - var32);
			field1081.method221(field1033[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(IIZIII)V")
	public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1116.method204(arg1, arg3);
		field1117.method204(arg1 + arg4 - 16, arg3);
		class34.method165(arg4 - 32, arg1 + 16, 16, arg3, field1273);
		int var6 = (arg4 - 32) * arg4 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg0 / (arg2 - arg4);
		class34.method165(var6, arg1 + var7 + 16, 16, arg3, field1346);
		class34.method168(field1319, arg1 + var7 + 16, var6, arg3);
		class34.method168(field1319, arg1 + var7 + 16, var6, arg3 + 1);
		class34.method167(arg3, arg1 + var7 + 16, 16, field1319);
		class34.method167(arg3, arg1 + var7 + 17, 16, field1319);
		class34.method168(field1211, arg1 + var7 + 16, var6, arg3 + 15);
		class34.method168(field1211, arg1 + var7 + 17, var6 - 1, arg3 + 14);
		class34.method167(arg3, arg1 + var7 + var6 + 15, 16, field1211);
		class34.method167(arg3 + 1, arg1 + 14 + var7 + var6, 15, field1211);
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1026) {
			field1322 = true;
		} else {
			field1026 = true;
			boolean var1 = false;
			String var2 = method476();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.249")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.252")) {
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
						field1063[var3] = new class49(500000, signlink.cache_dat, var3 + 1, signlink.cache_idx[var3]);
					}
				}

				try {
					int var4 = 5;
					field996[8] = 0;
					while (field996[8] == 0) {
						method13("Connecting to web server", 20);

						try {
							DataInputStream var5 = method493("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field610, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field996[var7] = var6.method236();
							}

							var5.close();
						} catch (IOException var82) {
							for (int var8 = var4; var8 > 0; var8--) {
								method13("Error loading - Will retry in " + var8 + " secs.", 10);

								try {
									Thread.sleep(1000L);
								} catch (Exception var77) {
								}
							}

							var4 *= 2;
							if (var4 > 60) {
								var4 = 60;
							}
						}
					}

					field1094 = method454("title", field996[1], 25, 1, "title screen");
					field1248 = new class38("p11", field1094);
					field1249 = new class38("p12", field1094);
					field1250 = new class38("b12", field1094);
					field1251 = new class38("q8", field1094);
					method438();
					method457();
					class51 var9 = method454("config", field996[2], 30, 2, "config");
					class51 var10 = method454("interface", field996[3], 35, 3, "interface");
					class51 var11 = method454("media", field996[4], 40, 4, "2d graphics");
					class51 var12 = method454("textures", field996[6], 45, 6, "textures");
					class51 var13 = method454("wordenc", field996[7], 50, 7, "chat system");
					class51 var14 = method454("sounds", field996[8], 55, 8, "sound effects");
					field1373 = new byte[4][104][104];
					field1082 = new int[4][105][105];
					field995 = new class19(4, field1082, 104, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1036[var15] = new class61(104, 104);
					}

					field1177 = new class36(512, 512);
					class51 var16 = method454("versionlist", field996[5], 60, 5, "update list");
					method13("Connecting to update server", 60);
					field1237 = new class48();
					field1237.method272(var16, this);
					class8.method57(field1237.method275());
					class32.method132(field1237.method274(0), field1237);

					if (!field1074) {
						field1068 = 0;
						field1069 = false;
						field1237.method279(2, field1068);

						while (field1237.method280() > 0) {
							method450();

							try {
								Thread.sleep(100L);
							} catch (Exception var76) {
							}
						}
					}

					method13("Requesting animations", 65);
					int var17 = field1237.method274(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1237.method279(1, var18);
					}

					while (field1237.method280() > 0) {
						int var19 = var17 - field1237.method280();
						if (var19 > 0) {
							method13("Loading animations - " + var19 * 100 / var17 + "%", 65);
						}

						method450();

						try {
							Thread.sleep(100L);
						} catch (Exception var75) {
						}
					}

					method13("Requesting models", 70);
					int var20 = field1237.method274(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1237.method278(var21);
						if ((var22 & 0x1) != 0) {
							field1237.method279(0, var21);
						}
					}

					int var23 = field1237.method280();
					while (field1237.method280() > 0) {
						int var24 = var23 - field1237.method280();
						if (var24 > 0) {
							method13("Loading models - " + var24 * 100 / var23 + "%", 70);
						}

						method450();

						try {
							Thread.sleep(100L);
						} catch (Exception var74) {
						}
					}

					if (field1063[0] != null) {
						method13("Requesting maps", 75);
						field1237.method279(3, field1237.method276(48, 0, 47));
						field1237.method279(3, field1237.method276(48, 1, 47));
						field1237.method279(3, field1237.method276(48, 0, 48));
						field1237.method279(3, field1237.method276(48, 1, 48));
						field1237.method279(3, field1237.method276(48, 0, 49));
						field1237.method279(3, field1237.method276(48, 1, 49));
						field1237.method279(3, field1237.method276(47, 0, 47));
						field1237.method279(3, field1237.method276(47, 1, 47));
						field1237.method279(3, field1237.method276(47, 0, 48));
						field1237.method279(3, field1237.method276(47, 1, 48));
						field1237.method279(3, field1237.method276(148, 0, 48));
						field1237.method279(3, field1237.method276(148, 1, 48));
						int var25 = field1237.method280();
						while (field1237.method280() > 0) {
							int var26 = var25 - field1237.method280();
							if (var26 > 0) {
								method13("Loading maps - " + var26 * 100 / var25 + "%", 75);
							}

							method450();

							try {
								Thread.sleep(100L);
							} catch (Exception var73) {
							}
						}
					}

					int var27 = field1237.method274(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1237.method278(var28);
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
							field1237.method282(var28, 0, var30);
						}
					}

					int var31 = field1237.method274(3);
					for (int var32 = 0; var32 < var31; var32++) {
						field1237.method282(var32, 3, (byte) 2);
					}

					if (!field1074) {
						int var33 = field1237.method274(2);
						for (int var34 = 1; var34 < var33; var34++) {
							field1237.method282(var34, 2, (byte) 1);
						}
					}

					method13("Unpacking media", 80);
					field1160 = new class37(var11, "invback", 0);
					field1162 = new class37(var11, "chatback", 0);
					field1161 = new class37(var11, "mapback", 0);
					field1385 = new class37(var11, "backbase1", 0);
					field1386 = new class37(var11, "backbase2", 0);
					field1387 = new class37(var11, "backhmid1", 0);

					for (int var35 = 0; var35 < 13; var35++) {
						field1080[var35] = new class37(var11, "sideicons", var35);
					}

					field1325 = new class36(var11, "compass", 0);

					try {
						for (int var36 = 0; var36 < 50; var36++) {
							field1091[var36] = new class37(var11, "mapscene", var36);
						}
					} catch (Exception var81) {
					}

					try {
						for (int var37 = 0; var37 < 50; var37++) {
							field1185[var37] = new class36(var11, "mapfunction", var37);
						}
					} catch (Exception var80) {
					}

					try {
						for (int var38 = 0; var38 < 20; var38++) {
							field1201[var38] = new class36(var11, "hitmarks", var38);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var39 = 0; var39 < 20; var39++) {
							field1031[var39] = new class36(var11, "headicons", var39);
						}
					} catch (Exception var78) {
					}

					field1019 = new class36(var11, "mapflag", 0);

					for (int var40 = 0; var40 < 8; var40++) {
						field1203[var40] = new class36(var11, "cross", var40);
					}

					field1238 = new class36(var11, "mapdots", 0);
					field1239 = new class36(var11, "mapdots", 1);
					field1240 = new class36(var11, "mapdots", 2);
					field1241 = new class36(var11, "mapdots", 3);
					field1116 = new class37(var11, "scrollbar", 0);
					field1117 = new class37(var11, "scrollbar", 1);
					field1331 = new class37(var11, "redstone1", 0);
					field1332 = new class37(var11, "redstone2", 0);
					field1333 = new class37(var11, "redstone3", 0);
					field1334 = new class37(var11, "redstone1", 0);
					field1334.method201();
					field1335 = new class37(var11, "redstone2", 0);
					field1335.method201();
					field1012 = new class37(var11, "redstone1", 0);
					field1012.method202();
					field1013 = new class37(var11, "redstone2", 0);
					field1013.method202();
					field1014 = new class37(var11, "redstone3", 0);
					field1014.method202();
					field1015 = new class37(var11, "redstone1", 0);
					field1015.method201();
					field1015.method202();
					field1016 = new class37(var11, "redstone2", 0);
					field1016.method201();
					field1016.method202();
					class36 var41 = new class36(var11, "backleft1", 0);
					field1221 = new class44(var41.field587, var41.field586, method11());
					var41.method188(0, 0);
					class36 var42 = new class36(var11, "backleft2", 0);
					field1222 = new class44(var42.field587, var42.field586, method11());
					var42.method188(0, 0);
					class36 var43 = new class36(var11, "backright1", 0);
					field1223 = new class44(var43.field587, var43.field586, method11());
					var43.method188(0, 0);
					class36 var44 = new class36(var11, "backright2", 0);
					field1224 = new class44(var44.field587, var44.field586, method11());
					var44.method188(0, 0);
					class36 var45 = new class36(var11, "backtop1", 0);
					field1225 = new class44(var45.field587, var45.field586, method11());
					var45.method188(0, 0);
					class36 var46 = new class36(var11, "backtop2", 0);
					field1226 = new class44(var46.field587, var46.field586, method11());
					var46.method188(0, 0);
					class36 var47 = new class36(var11, "backvmid1", 0);
					field1227 = new class44(var47.field587, var47.field586, method11());
					var47.method188(0, 0);
					class36 var48 = new class36(var11, "backvmid2", 0);
					field1228 = new class44(var48.field587, var48.field586, method11());
					var48.method188(0, 0);
					class36 var49 = new class36(var11, "backvmid3", 0);
					field1229 = new class44(var49.field587, var49.field586, method11());
					var49.method188(0, 0);
					class36 var50 = new class36(var11, "backhmid2", 0);
					field1230 = new class44(var50.field587, var50.field586, method11());
					var50.method188(0, 0);
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 21.0D) - 10;
					int var53 = (int) (Math.random() * 21.0D) - 10;
					int var54 = (int) (Math.random() * 41.0D) - 20;
					for (int var55 = 0; var55 < 50; var55++) {
						if (field1185[var55] != null) {
							field1185[var55].method187(var51 + var54, var52 + var54, var53 + var54);
						}

						if (field1091[var55] != null) {
							field1091[var55].method203(var51 + var54, var52 + var54, var53 + var54);
						}
					}

					method13("Unpacking textures", 83);
					class35.method174(var12);
					class35.method178(0.8D);
					class35.method173(20);
					method13("Unpacking config", 86);
					class65.method372(var9);
					class57.method322(var9);
					class62.method362(var9);
					class59.method337(var9);
					class58.method331(var9);
					class63.method366(var9);
					class66.method375(var9);
					class67.method378(var9);
					class59.field871 = field1073;

					if (!field1074) {
						method13("Unpacking sounds", 90);
						byte[] var56 = var14.method299("sounds.dat", null);
						class39 var57 = new class39(var56);
						class55.method312(var57);
					}

					method13("Unpacking interfaces", 95);
					class38[] var58 = new class38[] { field1248, field1249, field1250, field1251 };
					class4.method32(var58, var11, var10);
					method13("Preparing game engine", 100);

					for (int var59 = 0; var59 < 33; var59++) {
						int var60 = 999;
						int var61 = 0;
						for (int var62 = 0; var62 < 35; var62++) {
							if (field1161.field592[field1161.field594 * var59 + var62] == 0) {
								if (var60 == 999) {
									var60 = var62;
								}
							} else if (var60 != 999) {
								var61 = var62;
								break;
							}
						}

						field1305[var59] = var60;
						field1046[var59] = var61 - var60;
					}

					for (int var63 = 9; var63 < 160; var63++) {
						int var64 = 999;
						int var65 = 0;
						for (int var66 = 10; var66 < 168; var66++) {
							if (field1161.field592[field1161.field594 * var63 + var66] == 0 && (var66 > 34 || var63 > 34)) {
								if (var64 == 999) {
									var64 = var66;
								}
							} else if (var64 != 999) {
								var65 = var66;
								break;
							}
						}

						field1025[var63 - 9] = var64 - 21;
						field1261[var63 - 9] = var65 - var64;
					}

					class35.method171(479, 96);
					field1243 = class35.field573;
					class35.method171(190, 261);
					field1244 = class35.field573;
					class35.method171(512, 334);
					field1245 = class35.field573;
					int[] var67 = new int[9];
					for (int var68 = 0; var68 < 9; var68++) {
						int var69 = var68 * 32 + 128 + 15;
						int var70 = var69 * 3 + 600;
						int var71 = class35.field571[var69];
						var67[var68] = var70 * var71 >> 16;
					}

					class19.method98(500, 512, 334, 800, var67);
					class68.method380(var13);
				} catch (Exception var83) {
					signlink.reporterror("loaderror " + field1392 + " " + field1075);
					field1059 = true;
				}
			} else {
				field1383 = true;
			}
		}
	}

	@ObfuscatedName("client.a(ZLob;)V")
	public final void method462(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field628 == 0) {
			var2 = field995.method88(arg0.field627, arg0.field629, arg0.field630);
		}

		if (arg0.field628 == 1) {
			var2 = field995.method89(arg0.field629, arg0.field630, arg0.field627);
		}

		if (arg0.field628 == 2) {
			var2 = field995.method90(arg0.field627, arg0.field629, arg0.field630);
		}

		if (arg0.field628 == 3) {
			var2 = field995.method91(arg0.field627, arg0.field629, arg0.field630);
		}

		if (var2 != 0) {
			int var6 = field995.method92(arg0.field627, arg0.field629, arg0.field630, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field631 = var3;
		arg0.field633 = var4;
		arg0.field632 = var5;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method463() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1059) {
			field1179 = false;
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

		if (field1383) {
			field1179 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1322) {
			field1179 = false;
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

	@ObfuscatedName("client.l(I)V")
	public final void method464() {
		int var1 = (field1145.field359 >> 7) + field1100;
		int var2 = (field1145.field360 >> 7) + field1101;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1306 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1306 = (var2 - 9920) / 8 + 1;
		} else {
			field1306 = 0;
		}

		field1265 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1265 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1265 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1265 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1265 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1265 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1265 = 1;
			}
		}

		if (field1265 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1265 = 2;
		}

		field1286 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1286 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1286 = 1;
		}

		if (field1286 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1286 = 0;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BI)V")
	public final void method13(String arg0, int arg1) {
		field1075 = arg1;
		field1392 = arg0;
		method528();

		if (field1094 == null) {
			super.method13(arg0, arg1);
		} else {
			field1134.method260();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1250.method206("RuneScape is loading - please wait...", var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class34.method166(var6, var3 / 2 - 152, 304, 0x8C1111, 34);
			class34.method166(var6 + 1, var3 / 2 - 151, 302, 0, 32);
			class34.method165(30, var6 + 2, arg1 * 3, var3 / 2 - 150, 0x8C1111);
			class34.method165(30, var6 + 2, 300 - arg1 * 3, arg1 * 3 + var3 / 2 - 150, 0);
			field1250.method206(arg0, var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF);
			field1134.method261(214, field9, 186);

			if (field1210) {
				field1210 = false;

				if (!field1179) {
					field1135.method261(0, field9, 0);
					field1136.method261(661, field9, 0);
				}

				field1132.method261(128, field9, 0);
				field1133.method261(214, field9, 386);
				field1137.method261(0, field9, 265);
				field1138.method261(574, field9, 265);
				field1139.method261(128, field9, 186);
				field1140.method261(574, field9, 186);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIZII)V")
	public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1024.method250(); var11 != null; var11 = (class41) field1024.method252()) {
			if (var11.field627 == arg7 && var11.field629 == arg8 && var11.field630 == arg6 && var11.field628 == arg4) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field627 = arg7;
			var10.field628 = arg4;
			var10.field629 = arg8;
			var10.field630 = arg6;
			method462(var10);
			field1024.method247(var10);
		}

		var10.field634 = arg5;
		var10.field636 = arg0;
		var10.field635 = arg1;
		var10.field637 = arg3;
		var10.field638 = arg2;
	}

	@ObfuscatedName("client.a(IIB)V")
	public final void method466(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1143[var4] != null) {
				int var5 = field1141[var4];
				int var6 = field1345 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1242 == 0 || field1242 == 1 && method480(field1142[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !field1142[var4].equals(field1145.field412)) {
						if (field1246) {
							field1079[field1295] = "Report abuse @whi@" + field1142[var4];
							field1328[field1295] = 34;
							field1295++;
						}

						field1079[field1295] = "Add ignore @whi@" + field1142[var4];
						field1328[field1295] = 436;
						field1295++;
						field1079[field1295] = "Add friend @whi@" + field1142[var4];
						field1328[field1295] = 406;
						field1295++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1350 == 0 && (var5 == 7 || field1299 == 0 || field1299 == 1 && method480(field1142[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1246) {
							field1079[field1295] = "Report abuse @whi@" + field1142[var4];
							field1328[field1295] = 34;
							field1295++;
						}

						field1079[field1295] = "Add ignore @whi@" + field1142[var4];
						field1328[field1295] = 436;
						field1295++;
						field1079[field1295] = "Add friend @whi@" + field1142[var4];
						field1328[field1295] = 406;
						field1295++;
					}

					var3++;
				}

				if (var5 == 4 && (field1107 == 0 || field1107 == 1 && method480(field1142[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1079[field1295] = "Accept trade @whi@" + field1142[var4];
						field1328[field1295] = 903;
						field1295++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1350 == 0 && field1299 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1107 == 0 || field1107 == 1 && method480(field1142[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1079[field1295] = "Accept duel @whi@" + field1142[var4];
						field1328[field1295] = 363;
						field1295++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLd;)V")
	public final void method467(class4 arg0) {
		int var2 = arg0.field60;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1196) {
				arg0.field90 = "";
				arg0.field59 = 0;
			} else {
				arg0.field90 = field1220[var2];
				arg0.field59 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1196) {
				arg0.field90 = "";
				arg0.field59 = 0;
			} else {
				if (field1323[var2] == 0) {
					arg0.field90 = "@red@Offline";
				} else if (field1323[var2] == field1071) {
					arg0.field90 = "@gre@World-" + (field1323[var2] - 9);
				} else {
					arg0.field90 = "@yel@World-" + (field1323[var2] - 9);
				}

				arg0.field59 = 1;
			}
		} else if (var2 == 203) {
			arg0.field69 = field1196 * 15 + 20;
			if (arg0.field69 <= arg0.field62) {
				arg0.field69 = arg0.field62 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1067) {
				arg0.field90 = "";
				arg0.field59 = 0;
			} else {
				arg0.field90 = class52.method304(class52.method301(field1264[var2]));
				arg0.field59 = 1;
			}
		} else if (var2 == 503) {
			arg0.field69 = field1067 * 15 + 20;
			if (arg0.field69 <= arg0.field62) {
				arg0.field69 = arg0.field62 + 1;
			}
		} else if (var2 == 327) {
			arg0.field104 = 150;
			arg0.field105 = (int) (Math.sin(field1256 / 40.0D) * 256.0D) & 0x7FF;

			if (field1358) {
				for (int var3 = 0; var3 < 7; var3++) {
					int var4 = field1216[var3];
					if (var4 >= 0 && !class63.field929[var4].method368()) {
						return;
					}
				}

				field1358 = false;
				class32[] var5 = new class32[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1216[var7];
					if (var8 >= 0) {
						var5[var6++] = class63.field929[var8].method369();
					}
				}

				class32 var9 = new class32(var6, var5);
				for (int var10 = 0; var10 < 5; var10++) {
					if (field1057[var10] != 0) {
						var9.method149(field1098[var10][0], field1098[var10][field1057[var10]]);

						if (var10 == 1) {
							var9.method149(field1192[0], field1192[field1057[var10]]);
						}
					}
				}

				var9.method142();
				var9.method143(class65.field946[field1145.field364].field948[0]);
				var9.method152(64, 850, -30, -50, -30, true);
				arg0.field97 = 5;
				arg0.field98 = 0;
				class4.method35(5, 0, var9);
			}
		} else if (var2 == 324) {
			if (field1061 == null) {
				field1061 = arg0.field95;
				field1062 = arg0.field96;
			}

			if (field1360) {
				arg0.field95 = field1062;
			} else {
				arg0.field95 = field1061;
			}
		} else if (var2 == 325) {
			if (field1061 == null) {
				field1061 = arg0.field95;
				field1062 = arg0.field96;
			}

			if (field1360) {
				arg0.field95 = field1061;
			} else {
				arg0.field95 = field1062;
			}
		} else if (var2 == 600) {
			arg0.field90 = field1194;
			if (field1256 % 20 < 10) {
				arg0.field90 = arg0.field90 + "|";
			} else {
				arg0.field90 = arg0.field90 + " ";
			}
		} else if (var2 == 613) {
			if (!field1246) {
				arg0.field90 = "";
			} else if (field1064) {
				arg0.field92 = 0xFF0000;
				arg0.field90 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field92 = 0xFFFFFF;
				arg0.field90 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1197 == 0) {
				arg0.field90 = "";
			} else {
				String var11;
				if (field1051 == 0) {
					var11 = "earlier today";
				} else if (field1051 == 1) {
					var11 = "yesterday";
				} else {
					var11 = field1051 + " days ago";
				}

				arg0.field90 = "You last logged in " + var11 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1184 == 0) {
				arg0.field90 = "0 unread messages";
				arg0.field92 = 0xFFFF00;
			}

			if (field1184 == 1) {
				arg0.field90 = "1 unread message";
				arg0.field92 = 0xFF00;
			}

			if (field1184 > 1) {
				arg0.field90 = field1184 + " unread messages";
				arg0.field92 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1314 == 201) {
				arg0.field90 = "";
			} else if (field1314 == 200) {
				arg0.field90 = "You have not yet set any password recovery questions.";
			} else {
				String var12;
				if (field1314 == 0) {
					var12 = "Earlier today";
				} else if (field1314 == 1) {
					var12 = "Yesterday";
				} else {
					var12 = field1314 + " days ago";
				}

				arg0.field90 = var12 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1314 == 201) {
				arg0.field90 = "";
			} else if (field1314 == 200) {
				arg0.field90 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field90 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1314 == 201) {
				arg0.field90 = "";
			} else if (field1314 == 200) {
				arg0.field90 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field90 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.m(I)Z")
	public final boolean method468() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method469() {
		for (int var1 = 0; var1 < field1232; var1++) {
			class27 var2 = field1231[field1233[var1]];
			int var3 = (field1233[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method124()) {
				int var4 = var2.field359 >> 7;
				int var5 = var2.field360 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field363 == 1 && (var2.field359 & 0x7F) == 0x40 && (var2.field360 & 0x7F) == 0x40) {
						if (field1391[var4][var5] == field1266) {
							continue;
						}

						field1391[var4][var5] = field1266;
					}

					field995.method73(var2.field362, var3, method520(field1174, var2.field360, var2.field359), (var2.field363 - 1) * 64 + 60, field1174, var2.field361, var2, var2.field359, var2.field360);
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method470() {
		if (field18 == 1) {
			if (field19 >= 8 && field19 <= 108 && field20 >= 490 && field20 <= 522) {
				field1242 = (field1242 + 1) % 4;
				field1017 = true;
				field1281 = true;
				field1081.method220(130);
				field1081.method221(field1242);
				field1081.method221(field1299);
				field1081.method221(field1107);
			}

			if (field19 >= 137 && field19 <= 237 && field20 >= 490 && field20 <= 522) {
				field1299 = (field1299 + 1) % 3;
				field1017 = true;
				field1281 = true;
				field1081.method220(130);
				field1081.method221(field1242);
				field1081.method221(field1299);
				field1081.method221(field1107);
			}

			if (field19 >= 275 && field19 <= 375 && field20 >= 490 && field20 <= 522) {
				field1107 = (field1107 + 1) % 3;
				field1017 = true;
				field1281 = true;
				field1081.method220(130);
				field1081.method221(field1242);
				field1081.method221(field1299);
				field1081.method221(field1107);
			}

			if (field19 >= 416 && field19 <= 516 && field20 >= 490 && field20 <= 522) {
				method435();
				field1194 = "";
				field1064 = false;

				for (int var1 = 0; var1 < class4.field51.length; var1++) {
					if (class4.field51[var1] != null && class4.field51[var1].field60 == 600) {
						field1188 = field1118 = class4.field51[var1].field57;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.c(Z)I")
	public final int method471() {
		int var1 = 3;
		if (field1044 < 310) {
			int var2 = field1041 >> 7;
			int var3 = field1043 >> 7;
			int var4 = field1145.field359 >> 7;
			int var5 = field1145.field360 >> 7;

			if ((field1373[field1174][var2][var3] & 0x4) != 0) {
				var1 = field1174;
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

					if ((field1373[field1174][var2][var3] & 0x4) != 0) {
						var1 = field1174;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1373[field1174][var2][var3] & 0x4) != 0) {
							var1 = field1174;
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

					if ((field1373[field1174][var2][var3] & 0x4) != 0) {
						var1 = field1174;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1373[field1174][var2][var3] & 0x4) != 0) {
							var1 = field1174;
						}
					}
				}
			}
		}

		if ((field1373[field1174][field1145.field359 >> 7][field1145.field360 >> 7] & 0x4) != 0) {
			var1 = field1174;
		}

		return var1;
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method472() {
		int var1 = method520(field1174, field1043, field1041);
		if (var1 - field1042 < 800 && (field1373[field1174][field1041 >> 7][field1043 >> 7] & 0x4) != 0) {
			return field1174;
		}

		return 3;
	}

	public final void run() {
		if (field1296) {
			method432();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IBLmb;)V")
	public final void method473(int arg0, class39 arg1) {
		int var3 = arg1.method242(8);
		if (var3 < field1290) {
			for (int var4 = var3; var4 < field1290; var4++) {
				field1147[field1146++] = field1291[var4];
			}
		}

		if (var3 > field1290) {
			signlink.reporterror(field1347 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1290 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1291[var5];
			class28 var7 = field1289[var6];
			int var8 = arg1.method242(1);
			if (var8 == 0) {
				field1291[field1290++] = var6;
				var7.field403 = field1256;
			} else {
				int var9 = arg1.method242(2);
				if (var9 == 0) {
					field1291[field1290++] = var6;
					var7.field403 = field1256;
					field1293[field1292++] = var6;
				} else if (var9 == 1) {
					field1291[field1290++] = var6;
					var7.field403 = field1256;
					int var10 = arg1.method242(3);
					var7.method123(var10, false);
					int var11 = arg1.method242(1);
					if (var11 == 1) {
						field1293[field1292++] = var6;
					}
				} else if (var9 == 2) {
					field1291[field1290++] = var6;
					var7.field403 = field1256;
					int var12 = arg1.method242(3);
					var7.method123(var12, true);
					int var13 = arg1.method242(3);
					var7.method123(var13, true);
					int var14 = arg1.method242(1);
					if (var14 == 1) {
						field1293[field1292++] = var6;
					}
				} else if (var9 == 3) {
					field1147[field1146++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method474() {
		if (field1350 != 0) {
			class38 var1 = field1249;
			int var2 = 0;
			if (field1356 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1143[var3] != null) {
					int var4 = field1141[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1299 == 0 || field1299 == 1 && method480(field1142[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method209(0, 4, var5, "From " + field1142[var3] + ": " + field1143[var3]);
						var1.method209(0xFFFF, 4, var5 - 1, "From " + field1142[var3] + ": " + field1143[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1299 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method209(0, 4, var6, field1143[var3]);
						var1.method209(0xFFFF, 4, var6 - 1, field1143[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1299 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method209(0, 4, var7, "To " + field1142[var3] + ": " + field1143[var3]);
						var1.method209(0xFFFF, 4, var7 - 1, "To " + field1142[var3] + ": " + field1143[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;IIII)V")
	public final void method475(class4 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field58 == 0 && arg0.field72 != null && (!arg0.field71 || field1214 == arg0.field56 || field1028 == arg0.field56 || field1088 == arg0.field56)) {
			int var5 = class34.field557;
			int var6 = class34.field555;
			int var7 = class34.field558;
			int var8 = class34.field556;
			class34.method163(arg0.field62 + arg3, arg3, arg1, arg0.field61 + arg1);
			int var9 = arg0.field72.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field73[var10] + arg1;
				int var12 = arg0.field74[var10] + arg3 - arg2;
				class4 var13 = class4.field51[arg0.field72[var10]];
				var11 += var13.field63;
				var12 += var13.field64;

				if (var13.field60 > 0) {
					method467(var13);
				}

				if (var13.field58 == 0) {
					if (var13.field70 > var13.field69 - var13.field62) {
						var13.field70 = var13.field69 - var13.field62;
					}

					if (var13.field70 < 0) {
						var13.field70 = 0;
					}

					method475(var13, var11, var13.field70, var12);

					if (var13.field69 > var13.field62) {
						method461(var13.field70, var12, var13.field69, var13.field61 + var11, var13.field62);
					}
				} else if (var13.field58 != 1) {
					if (var13.field58 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field62; var15++) {
							for (int var16 = 0; var16 < var13.field61; var16++) {
								int var17 = (var13.field80 + 32) * var16 + var11;
								int var18 = (var13.field81 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field83[var14];
									var18 += var13.field84[var14];
								}

								if (var13.field52[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field52[var14] - 1;
									if (var17 > class34.field557 - 32 && var17 < class34.field558 && var18 > class34.field555 - 32 && var18 < class34.field556 || field1128 != 0 && field1127 == var14) {
										class36 var22 = class59.method345(var13.field53[var14], var21);
										if (var22 != null) {
											if (field1128 != 0 && field1127 == var14 && field1126 == var13.field56) {
												var19 = field16 - field1129;
												var20 = field17 - field1130;

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

												var22.method194(128, var17 + var19, var18 + var20);
											} else if (field1055 != 0 && field1054 == var14 && field1053 == var13.field56) {
												var22.method194(128, var17, var18);
											} else {
												var22.method190(var18, var17);
											}

											if (var22.field590 == 33 || var13.field53[var14] != 1) {
												int var23 = var13.field53[var14];
												field1248.method209(0, var17 + var19 + 1, var18 + 10 + var20, method427(var23));
												field1248.method209(0xFFFF00, var17 + var19, var18 + 9 + var20, method427(var23));
											}
										}
									}
								} else if (var13.field82 != null && var14 < 20) {
									class36 var24 = var13.field82[var14];
									if (var24 != null) {
										var24.method190(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field58 == 3) {
						if (var13.field86) {
							class34.method165(var13.field62, var12, var13.field61, var11, var13.field92);
						} else {
							class34.method166(var12, var11, var13.field61, var13.field92, var13.field62);
						}
					} else if (var13.field58 == 4) {
						class38 var25 = var13.field89;
						int var26 = var13.field92;
						String var27 = var13.field90;

						if ((field1088 == var13.field56 || field1028 == var13.field56 || field1214 == var13.field56) && var13.field94 != 0) {
							var26 = var13.field94;
						}

						if (method439(var13)) {
							var26 = var13.field93;

							if (var13.field91.length() > 0) {
								var27 = var13.field91;
							}
						}

						if (var13.field59 == 6 && field1150) {
							var27 = "Please wait...";
							var26 = var13.field92;
						}

						int var28 = var25.field607 + var12;
						while (var27.length() > 0) {
							if (var27.indexOf("%") != -1) {
								while (true) {
									int var29 = var27.indexOf("%1");
									if (var29 == -1) {
										break;
									}

									var27 = var27.substring(0, var29) + method428(method531(0, var13)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method428(method531(1, var13)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method428(method531(2, var13)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method428(method531(3, var13)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method428(method531(4, var13)) + var27.substring(var33 + 2);
								}
							}

							int var34 = var27.indexOf("\\n");
							String var35;
							if (var34 == -1) {
								var35 = var27;
								var27 = "";
							} else {
								var35 = var27.substring(0, var34);
								var27 = var27.substring(var34 + 2);
							}

							if (var13.field87) {
								var25.method207(var26, var13.field88, var13.field61 / 2 + var11, var28, var35);
							} else {
								var25.method211(var26, var28, var35, var13.field88, var11);
							}

							var28 += var25.field607;
						}
					} else if (var13.field58 == 5) {
						class36 var36;
						if (method439(var13)) {
							var36 = var13.field96;
						} else {
							var36 = var13.field95;
						}

						if (var36 != null) {
							var36.method190(var12, var11);
						}
					} else if (var13.field58 == 6) {
						int var37 = class35.field567;
						int var38 = class35.field568;
						class35.field567 = var13.field61 / 2 + var11;
						class35.field568 = var13.field62 / 2 + var12;
						int var39 = class35.field571[var13.field104] * var13.field103 >> 16;
						int var40 = class35.field572[var13.field104] * var13.field103 >> 16;
						boolean var41 = method439(var13);
						int var42;
						if (var41) {
							var42 = var13.field102;
						} else {
							var42 = var13.field101;
						}

						class32 var43;
						if (var42 == -1) {
							var43 = var13.method33(-1, -1, var41);
						} else {
							class65 var44 = class65.field946[var42];
							var43 = var13.method33(var44.field949[var13.field54], var44.field948[var13.field54], var41);
						}

						if (var43 != null) {
							var43.method155(0, var13.field105, 0, var13.field104, 0, var39, var40);
						}

						class35.field567 = var37;
						class35.field568 = var38;
					} else if (var13.field58 == 7) {
						class38 var45 = var13.field89;
						int var46 = 0;
						for (int var47 = 0; var47 < var13.field62; var47++) {
							for (int var48 = 0; var48 < var13.field61; var48++) {
								if (var13.field52[var46] > 0) {
									class59 var49 = class59.method339(var13.field52[var46] - 1);
									String var50 = var49.field874;
									if (var49.field885 || var13.field53[var46] != 1) {
										var50 = var50 + " x" + method445(var13.field53[var46]);
									}

									int var51 = (var13.field80 + 115) * var48 + var11;
									int var52 = (var13.field81 + 12) * var47 + var12;
									if (var13.field87) {
										var45.method207(var13.field92, var13.field88, var13.field61 / 2 + var51, var52, var50);
									} else {
										var45.method211(var13.field92, var52, var50, var13.field88, var51);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class34.method163(var8, var6, var5, var7);
		}
	}

	@ObfuscatedName("client.f(Z)Ljava/lang/String;")
	public final String method476() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.o(I)V")
	public final void method477() {
		field1358 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1216[var1] = -1;
			for (int var2 = 0; var2 < class63.field928; var2++) {
				if (!class63.field929[var2].field935 && class63.field929[var2].field930 == var1 + (field1360 ? 0 : 7)) {
					field1216[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method478(int arg0, int arg1) {
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

	@ObfuscatedName("client.g(Z)V")
	public final void method479() {
		method474();

		if (field1169 == 1) {
			field1203[field1168 / 100].method190(field1167 - 8 - 11, field1166 - 8 - 8);
		}

		if (field1169 == 2) {
			field1203[field1168 / 100 + 4].method190(field1167 - 8 - 11, field1166 - 8 - 8);
		}

		if (field1118 != -1) {
			method514(field1118, field1159);
			method475(class4.field51[field1118], 0, 0, 0);
		}

		method464();

		if (!field1330) {
			method536();
			method509();
		} else if (field1119 == 0) {
			method426();
		}

		if (field1283 == 1) {
			if (field1306 > 0 || field1265 == 1) {
				field1031[1].method190(258, 472);
			} else {
				field1031[1].method190(296, 472);
			}
		}

		if (field1306 > 0) {
			field1031[0].method190(296, 472);
			field1249.method206("Level: " + field1306, 484, 329, 0xFFFF00);
		}

		if (field1265 == 1) {
			field1031[6].method190(296, 472);
			field1249.method206("Arena", 484, 329, 0xFFFF00);
		}

		if (field1356 != 0) {
			int var1 = field1356 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1249.method209(0xFFFF00, 4, 329, "System update in: " + var2 + ":0" + var1);
			} else {
				field1249.method209(0xFFFF00, 4, 329, "System update in: " + var2 + ":" + var1);
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method480(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1196; var2++) {
			if (arg0.equalsIgnoreCase(field1220[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1145.field412)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method481() {
		class57.field836.method115();
		class57.field837.method115();
		class58.field865.method115();
		class59.field906.method115();
		class59.field907.method115();
		class28.field433.method115();
		class66.field972.method115();
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 237);

			if (arg0.length == 5) {
				field1071 = Integer.parseInt(arg0[0]);
				field1072 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method455();
				} else if (arg0[2].equals("highmem")) {
					method519();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1073 = false;
				} else if (arg0[3].equals("members")) {
					field1073 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method1(789, 532);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method482() {
		if (field18 == 1) {
			int var1 = field19 - 21 - 561;
			int var2 = field20 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1377 + field1268 & 0x7FF;
				int var4 = class35.field571[var3];
				int var5 = class35.field572[var3];
				var4 = (field1262 + 256) * var4 >> 8;
				var5 = (field1262 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1145.field359 + var6 >> 7;
				int var9 = field1145.field360 - var7 >> 7;
				boolean var10 = method460(var8, 0, true, field1145.field408[0], 0, var9, 1, 0, 0, 0, field1145.field407[0]);
				if (var10) {
					field1081.method221(var1);
					field1081.method221(var2);
					field1081.method222(field1377);
					field1081.method221(57);
					field1081.method221(field1268);
					field1081.method221(field1262);
					field1081.method221(89);
					field1081.method222(field1145.field359);
					field1081.method222(field1145.field360);
					field1081.method221(field1317);
					field1081.method221(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method483(long arg0) {
		if (arg0 != 0L) {
			if (field1067 >= 100) {
				method449(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class52.method304(class52.method301(arg0));
				for (int var4 = 0; var4 < field1067; var4++) {
					if (field1264[var4] == arg0) {
						method449(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1196; var5++) {
					if (field1095[var5] == arg0) {
						method449(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1264[field1067++] = arg0;
				field1097 = true;
				field1081.method220(84);
				field1081.method227(arg0);
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method484() {
		field1000 = 0;
		for (int var1 = -1; var1 < field1290 + field1232; var1++) {
			class26 var2;
			if (var1 == -1) {
				var2 = field1145;
			} else if (var1 < field1290) {
				var2 = field1289[field1291[var1]];
			} else {
				var2 = field1231[field1233[var1 - field1290]];
			}

			if (var2 != null && var2.method124()) {
				if (var1 < field1290) {
					int var3 = 30;
					class28 var4 = (class28) var2;
					if (var4.field415 != 0) {
						method516(var2.field404 + 15, var2);

						if (field1312 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field415 & 1 << var5) != 0) {
									field1031[var5].method190(field1313 - var3, field1312 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1370 == 10 && field1291[var1] == field1267) {
						method516(var2.field404 + 15, var2);

						if (field1312 > -1) {
							field1031[7].method190(field1313 - var3, field1312 - 12);
						}
					}
				} else if (field1370 == 1 && field1233[var1 - field1290] == field1163 && field1256 % 20 < 10) {
					method516(var2.field404 + 15, var2);

					if (field1312 > -1) {
						field1031[2].method190(field1313 - 28, field1312 - 12);
					}
				}

				if (var2.field371 != null && (var1 >= field1290 || field1242 == 0 || field1242 == 3 || field1242 == 1 && method480(((class28) var2).field412))) {
					method516(var2.field404, var2);

					if (field1312 > -1 && field1000 < field1001) {
						field1005[field1000] = field1250.method208(var2.field371) / 2;
						field1004[field1000] = field1250.field607;
						field1002[field1000] = field1312;
						field1003[field1000] = field1313;
						field1006[field1000] = var2.field373;
						field1007[field1000] = var2.field374;
						field1008[field1000] = var2.field372;
						field1009[field1000++] = var2.field371;

						if (field1336 == 0 && var2.field374 == 1) {
							field1004[field1000] += 10;
							field1003[field1000] += 5;
						}

						if (field1336 == 0 && var2.field374 == 2) {
							field1005[field1000] = 60;
						}
					}
				}

				if (var2.field377 > field1256 + 100) {
					method516(var2.field404 + 15, var2);

					if (field1312 > -1) {
						int var6 = var2.field378 * 30 / var2.field379;
						if (var6 > 30) {
							var6 = 30;
						}

						class34.method165(5, field1313 - 3, var6, field1312 - 15, 0xFF00);
						class34.method165(5, field1313 - 3, 30 - var6, field1312 + var6 - 15, 0xFF0000);
					}
				}

				if (var2.field377 > field1256 + 330) {
					method516(var2.field404 / 2, var2);

					if (field1312 > -1) {
						field1201[var2.field376].method190(field1313 - 12, field1312 - 12);
						field1248.method206(String.valueOf(var2.field375), field1312, field1313 + 4, 0);
						field1248.method206(String.valueOf(var2.field375), field1312 - 1, field1313 + 3, 0xFFFFFF);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field1000; var7++) {
			int var8 = field1002[var7];
			int var9 = field1003[var7];
			int var10 = field1005[var7];
			int var11 = field1004[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field1003[var13] - field1004[var13] && var9 - var11 < field1003[var13] + 2 && var8 - var10 < field1005[var13] + field1002[var13] && var8 + var10 > field1002[var13] - field1005[var13] && field1003[var13] - field1004[var13] < var9) {
						var9 = field1003[var13] - field1004[var13];
						var12 = true;
					}
				}
			}

			field1312 = field1002[var7];
			field1313 = field1003[var7] = var9;
			String var14 = field1009[var7];
			if (field1336 == 0) {
				int var15 = 0xFFFF00;
				if (field1006[var7] < 6) {
					var15 = field1076[field1006[var7]];
				}

				if (field1006[var7] == 6) {
					var15 = field1266 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1006[var7] == 7) {
					var15 = field1266 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1006[var7] == 8) {
					var15 = field1266 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1006[var7] == 9) {
					int var16 = 150 - field1008[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1006[var7] == 10) {
					int var17 = 150 - field1008[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1006[var7] == 11) {
					int var18 = 150 - field1008[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1007[var7] == 0) {
					field1250.method206(var14, field1312, field1313 + 1, 0);
					field1250.method206(var14, field1312, field1313, var15);
				}

				if (field1007[var7] == 1) {
					field1250.method210(var14, 0, field1313 + 1, field1266, field1312);
					field1250.method210(var14, var15, field1313, field1266, field1312);
				}

				if (field1007[var7] == 2) {
					int var19 = field1250.method208(var14);
					int var20 = (150 - field1008[var7]) * (var19 + 100) / 150;
					class34.method163(334, 0, field1312 - 50, field1312 + 50);
					field1250.method209(0, field1312 + 50 - var20, field1313 + 1, var14);
					field1250.method209(var15, field1312 + 50 - var20, field1313, var14);
					class34.method162();
				}
			} else {
				field1250.method206(var14, field1312, field1313 + 1, 0);
				field1250.method206(var14, field1312, field1313, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = class32.field539[var7];
			int var13 = class32.field540[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class32.field539[var8];
			int var16 = class32.field540[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1041 = arg3 - var9;
		field1042 = arg5 - var10;
		field1043 = arg0 - var11;
		field1044 = arg1;
		field1045 = arg4;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method486(int arg0) {
		if (arg0 >= 0) {
			if (field1084) {
				field1084 = false;
				field1281 = true;
			}

			int var2 = field1326[arg0];
			int var3 = field1327[arg0];
			int var4 = field1328[arg0];
			int var5 = field1329[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 55 && method490(var5, var3, 62, var2)) {
				field1081.method222(field1302);
			}

			if (var4 == 367) {
				class28 var6 = field1289[var5];
				if (var6 != null) {
					method460(var6.field407[0], 0, false, field1145.field408[0], 0, var6.field408[0], 2, 1, 0, 1, field1145.field407[0]);
					field1166 = field19;
					field1167 = field20;
					field1169 = 2;
					field1168 = 0;
					field1081.method220(101);
					field1081.method222(var5);
					field1081.method222(field1278);
					field1081.method222(field1276);
					field1081.method222(field1277);
				}
			}

			if (var4 == 34) {
				String var7 = field1079[arg0];
				int var8 = var7.indexOf("@whi@");
				if (var8 != -1) {
					method435();
					field1194 = var7.substring(var8 + 5).trim();
					field1064 = false;

					for (int var9 = 0; var9 < class4.field51.length; var9++) {
						if (class4.field51[var9] != null && class4.field51[var9].field60 == 600) {
							field1188 = field1118 = class4.field51[var9].field57;
							break;
						}
					}
				}
			}

			if (var4 == 930) {
				class4 var10 = class4.field51[var3];
				field1301 = 1;
				field1302 = var3;
				field1303 = var10.field108;
				field1275 = 0;
				String var11 = var10.field106;
				if (var11.indexOf(" ") != -1) {
					var11 = var11.substring(0, var11.indexOf(" "));
				}

				String var12 = var10.field106;
				if (var12.indexOf(" ") != -1) {
					var12 = var12.substring(var12.indexOf(" ") + 1);
				}

				field1304 = var11 + " " + var10.field107 + " " + var12;

				if (field1303 == 16) {
					field1097 = true;
					field1186 = 3;
					field1280 = true;
				}
			} else {
				if (var4 == 217) {
					boolean var13 = method460(var2, 0, false, field1145.field408[0], 0, var3, 2, 0, 0, 0, field1145.field407[0]);
					if (!var13) {
						method460(var2, 0, false, field1145.field408[0], 0, var3, 2, 1, 0, 1, field1145.field407[0]);
					}

					field1166 = field19;
					field1167 = field20;
					field1169 = 2;
					field1168 = 0;
					field1081.method220(76);
					field1081.method222(field1100 + var2);
					field1081.method222(field1101 + var3);
					field1081.method222(var5);
					field1081.method222(field1278);
					field1081.method222(field1276);
					field1081.method222(field1277);
				}

				if (var4 == 660) {
					if (field1330) {
						field995.method100(var2 - 8, var3 - 11);
					} else {
						field995.method100(field19 - 8, field20 - 11);
					}
				}

				if (var4 == 450 && method490(var5, var3, 160, var2)) {
					field1081.method222(field1278);
					field1081.method222(field1276);
					field1081.method222(field1277);
				}

				if (var4 == 391) {
					field1081.method220(90);
					field1081.method222(var5);
					field1081.method222(var2);
					field1081.method222(var3);
					field1081.method222(field1302);
					field1052 = 0;
					field1053 = var3;
					field1054 = var2;
					field1055 = 2;
					if (class4.field51[var3].field57 == field1118) {
						field1055 = 1;
					}

					if (class4.field51[var3].field57 == field1236) {
						field1055 = 3;
					}
				}

				if (var4 == 965) {
					boolean var15 = method460(var2, 0, false, field1145.field408[0], 0, var3, 2, 0, 0, 0, field1145.field407[0]);
					if (!var15) {
						method460(var2, 0, false, field1145.field408[0], 0, var3, 2, 1, 0, 1, field1145.field407[0]);
					}

					field1166 = field19;
					field1167 = field20;
					field1169 = 2;
					field1168 = 0;
					field1081.method220(78);
					field1081.method222(field1100 + var2);
					field1081.method222(field1101 + var3);
					field1081.method222(var5);
					field1081.method222(field1302);
				}

				if (var4 == 465) {
					field1081.method220(111);
					field1081.method222(var3);
					class4 var17 = class4.field51[var3];
					if (var17.field65 != null && var17.field65[0][0] == 5) {
						int var18 = var17.field65[0][1];
						field1096[var18] = 1 - field1096[var18];
						method444(var18);
						field1097 = true;
					}
				}

				if (var4 == 900) {
					class27 var19 = field1231[var5];
					if (var19 != null) {
						method460(var19.field407[0], 0, false, field1145.field408[0], 0, var19.field408[0], 2, 1, 0, 1, field1145.field407[0]);
						field1166 = field19;
						field1167 = field20;
						field1169 = 2;
						field1168 = 0;
						field1081.method220(21);
						field1081.method222(var5);
						field1081.method222(field1278);
						field1081.method222(field1276);
						field1081.method222(field1277);
					}
				}

				if (var4 == 947) {
					method435();
				}

				if (var4 == 960) {
					field1081.method220(111);
					field1081.method222(var3);
					class4 var20 = class4.field51[var3];
					if (var20.field65 != null && var20.field65[0][0] == 5) {
						int var21 = var20.field65[0][1];
						if (field1096[var21] != var20.field67[0]) {
							field1096[var21] = var20.field67[0];
							method444(var21);
							field1097 = true;
						}
					}
				}

				if (var4 == 1773) {
					class59 var22 = class59.method339(var5);
					String var23;
					if (var3 >= 100000) {
						var23 = var3 + " x " + var22.field874;
					} else if (var22.field875 == null) {
						var23 = "It's a " + var22.field874 + ".";
					} else {
						var23 = new String(var22.field875);
					}

					method449(0, "", var23);
				}

				if (var4 == 881) {
					field1081.method220(45);
					field1081.method222(var5);
					field1081.method222(var2);
					field1081.method222(var3);
					field1081.method222(field1278);
					field1081.method222(field1276);
					field1081.method222(field1277);
					field1052 = 0;
					field1053 = var3;
					field1054 = var2;
					field1055 = 2;
					if (class4.field51[var3].field57 == field1118) {
						field1055 = 1;
					}

					if (class4.field51[var3].field57 == field1236) {
						field1055 = 3;
					}
				}

				if (var4 == 951) {
					class4 var24 = class4.field51[var3];
					boolean var25 = true;
					if (var24.field60 > 0) {
						var25 = method529(var24);
					}

					if (var25) {
						field1081.method220(111);
						field1081.method222(var3);
					}
				}

				if (var4 == 265) {
					class27 var26 = field1231[var5];
					if (var26 != null) {
						method460(var26.field407[0], 0, false, field1145.field408[0], 0, var26.field408[0], 2, 1, 0, 1, field1145.field407[0]);
						field1166 = field19;
						field1167 = field20;
						field1169 = 2;
						field1168 = 0;
						field1081.method220(114);
						field1081.method222(var5);
						field1081.method222(field1302);
					}
				}

				if (var4 == 1175) {
					int var27 = var5 >> 14 & 0x7FFF;
					class57 var28 = class57.method324(var27);
					String var29;
					if (var28.field807 == null) {
						var29 = "It's a " + var28.field806 + ".";
					} else {
						var29 = new String(var28.field807);
					}

					method449(0, "", var29);
				}

				if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
					if (var4 == 602) {
						field1081.method220(22);
					}

					if (var4 == 892) {
						if ((var2 & 0x3) == 0) {
							field1274++;
						}

						if (field1274 >= 130) {
							field1081.method220(36);
							field1081.method221(177);
						}

						field1081.method220(77);
					}

					if (var4 == 22) {
						field1081.method220(239);
					}

					if (var4 == 596) {
						field1081.method220(81);
					}

					if (var4 == 415) {
						if ((var3 & 0x3) == 0) {
							field1183++;
						}

						if (field1183 >= 55) {
							field1081.method220(126);
							field1081.method225(0);
						}

						field1081.method220(154);
					}

					field1081.method222(var5);
					field1081.method222(var2);
					field1081.method222(var3);
					field1052 = 0;
					field1053 = var3;
					field1054 = var2;
					field1055 = 2;
					if (class4.field51[var3].field57 == field1118) {
						field1055 = 1;
					}

					if (class4.field51[var3].field57 == field1236) {
						field1055 = 3;
					}
				}

				if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
					class28 var30 = field1289[var5];
					if (var30 != null) {
						method460(var30.field407[0], 0, false, field1145.field408[0], 0, var30.field408[0], 2, 1, 0, 1, field1145.field407[0]);
						field1166 = field19;
						field1167 = field20;
						field1169 = 2;
						field1168 = 0;

						if (var4 == 1101) {
							field1081.method220(223);
						}

						if (var4 == 151) {
							field1034++;
							if (field1034 >= 90) {
								field1081.method220(65);
								field1081.method222(31114);
							}

							field1081.method220(94);
						}

						if (var4 == 1373) {
							field1081.method220(192);
						}

						if (var4 == 1544) {
							field1081.method220(66);
						}

						field1081.method222(var5);
					}
				}

				if (var4 == 285) {
					method490(var5, var3, 47, var2);
				}

				if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
					if (var4 == 422) {
						field1081.method220(176);
					}

					if (var4 == 478) {
						if ((var2 & 0x3) == 0) {
							field1077++;
						}

						if (field1077 >= 90) {
							field1081.method220(52);
						}

						field1081.method220(85);
					}

					if (var4 == 38) {
						field1081.method220(203);
					}

					if (var4 == 405) {
						field1247 += var5;
						if (field1247 >= 97) {
							field1081.method220(161);
							field1081.method224(0xE42D58);
						}

						field1081.method220(93);
					}

					if (var4 == 347) {
						field1081.method220(127);
					}

					field1081.method222(var5);
					field1081.method222(var2);
					field1081.method222(var3);
					field1052 = 0;
					field1053 = var3;
					field1054 = var2;
					field1055 = 2;
					if (class4.field51[var3].field57 == field1118) {
						field1055 = 1;
					}

					if (class4.field51[var3].field57 == field1236) {
						field1055 = 3;
					}
				}

				if (var4 == 188) {
					field1275 = 1;
					field1276 = var2;
					field1277 = var3;
					field1278 = var5;
					field1279 = class59.method339(var5).field874;
					field1301 = 0;
				} else {
					if (var4 == 1607) {
						class27 var31 = field1231[var5];
						if (var31 != null) {
							String var32;
							if (var31.field411.field845 == null) {
								var32 = "It's a " + var31.field411.field844 + ".";
							} else {
								var32 = new String(var31.field411.field845);
							}

							method449(0, "", var32);
						}
					}

					if (var4 == 651) {
						class28 var33 = field1289[var5];
						if (var33 != null) {
							method460(var33.field407[0], 0, false, field1145.field408[0], 0, var33.field408[0], 2, 1, 0, 1, field1145.field407[0]);
							field1166 = field19;
							field1167 = field20;
							field1169 = 2;
							field1168 = 0;
							field1081.method220(116);
							field1081.method222(var5);
							field1081.method222(field1302);
						}
					}

					if (var4 == 504) {
						method490(var5, var3, 185, var2);
					}

					if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
						boolean var34 = method460(var2, 0, false, field1145.field408[0], 0, var3, 2, 0, 0, 0, field1145.field407[0]);
						if (!var34) {
							method460(var2, 0, false, field1145.field408[0], 0, var3, 2, 1, 0, 1, field1145.field407[0]);
						}

						field1166 = field19;
						field1167 = field20;
						field1169 = 2;
						field1168 = 0;

						if (var4 == 746) {
							field1081.method220(195);
						}

						if (var4 == 877) {
							field1081.method220(139);
						}

						if (var4 == 224) {
							field1081.method220(186);
						}

						if (var4 == 993) {
							field1081.method220(46);
						}

						if (var4 == 99) {
							field1081.method220(86);
						}

						field1081.method222(field1100 + var2);
						field1081.method222(field1101 + var3);
						field1081.method222(var5);
					}

					if (var4 == 581) {
						if ((var5 & 0x3) == 0) {
							field993++;
						}

						if (field993 >= 99) {
							field1081.method220(255);
							field1081.method225(0);
						}

						method490(var5, var3, 83, var2);
					}

					if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
						class27 var36 = field1231[var5];
						if (var36 != null) {
							method460(var36.field407[0], 0, false, field1145.field408[0], 0, var36.field408[0], 2, 1, 0, 1, field1145.field407[0]);
							field1166 = field19;
							field1167 = field20;
							field1169 = 2;
							field1168 = 0;

							if (var4 == 542) {
								field1081.method220(158);
							}

							if (var4 == 245) {
								if ((var5 & 0x3) == 0) {
									field1048++;
								}

								if (field1048 >= 85) {
									field1081.method220(174);
									field1081.method222(39596);
								}

								field1081.method220(242);
							}

							if (var4 == 963) {
								field1081.method220(99);
							}

							if (var4 == 728) {
								field1081.method220(149);
							}

							if (var4 == 6) {
								if ((var5 & 0x3) == 0) {
									field1260++;
								}

								if (field1260 >= 124) {
									field1081.method220(55);
									field1081.method225(0);
								}

								field1081.method220(237);
							}

							field1081.method222(var5);
						}
					}

					if (var4 == 364) {
						method490(var5, var3, 75, var2);
					}

					if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
						String var37 = field1079[arg0];
						int var38 = var37.indexOf("@whi@");
						if (var38 != -1) {
							long var39 = class52.method300(var37.substring(var38 + 5).trim());
							if (var4 == 406) {
								method518(var39);
							}

							if (var4 == 436) {
								method483(var39);
							}

							if (var4 == 557) {
								method434(var39);
							}

							if (var4 == 556) {
								method523(var39);
							}
						}
					}

					if (var4 == 903 || var4 == 363) {
						String var41 = field1079[arg0];
						int var42 = var41.indexOf("@whi@");
						if (var42 != -1) {
							var41 = var41.substring(var42 + 5).trim();
							String var43 = class52.method304(class52.method301(class52.method300(var41)));
							boolean var44 = false;
							for (int var45 = 0; var45 < field1290; var45++) {
								class28 var46 = field1289[field1291[var45]];
								if (var46 != null && var46.field412 != null && var46.field412.equalsIgnoreCase(var43)) {
									method460(var46.field407[0], 0, false, field1145.field408[0], 0, var46.field408[0], 2, 1, 0, 1, field1145.field407[0]);

									if (var4 == 903) {
										field1081.method220(192);
									}

									if (var4 == 363) {
										field1081.method220(223);
									}

									field1081.method222(field1291[var45]);
									var44 = true;
									break;
								}
							}

							if (!var44) {
								method449(0, "", "Unable to find " + var43);
							}
						}
					}

					if (var4 == 44 && !field1150) {
						field1081.method220(157);
						field1081.method222(var3);
						field1150 = true;
					}

					if (var4 == 1501) {
						field999 += field1101;
						if (field999 >= 92) {
							field1081.method220(220);
							field1081.method225(0);
						}

						method490(var5, var3, 134, var2);
					}

					if (var4 == 679) {
						String var47 = field1079[arg0];
						int var48 = var47.indexOf("@whi@");
						if (var48 != -1) {
							long var49 = class52.method300(var47.substring(var48 + 5).trim());
							int var51 = -1;
							for (int var52 = 0; var52 < field1196; var52++) {
								if (field1095[var52] == var49) {
									var51 = var52;
									break;
								}
							}

							if (var51 != -1 && field1323[var51] > 0) {
								field1281 = true;
								field1084 = false;
								field994 = true;
								field1374 = "";
								field1252 = 3;
								field1011 = field1095[var51];
								field1390 = "Enter message to send to " + field1220[var51];
							}
						}
					}

					if (var4 == 1102) {
						class59 var53 = class59.method339(var5);
						String var54;
						if (var53.field875 == null) {
							var54 = "It's a " + var53.field874 + ".";
						} else {
							var54 = new String(var53.field875);
						}

						method449(0, "", var54);
					}

					field1275 = 0;
					field1301 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method487() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1118 != -1 && field1188 == field1118) {
				if (var1 == 8 && field1194.length() > 0) {
					field1194 = field1194.substring(0, field1194.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1194.length() < 12) {
					field1194 = field1194 + (char) var1;
				}
			} else if (field994) {
				if (var1 >= 32 && var1 <= 122 && field1374.length() < 80) {
					field1374 = field1374 + (char) var1;
					field1281 = true;
				}

				if (var1 == 8 && field1374.length() > 0) {
					field1374 = field1374.substring(0, field1374.length() - 1);
					field1281 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field994 = false;
					field1281 = true;

					if (field1252 == 1) {
						long var2 = class52.method300(field1374);
						method518(var2);
					}

					if (field1252 == 2 && field1196 > 0) {
						long var4 = class52.method300(field1374);
						method434(var4);
					}

					if (field1252 == 3 && field1374.length() > 0) {
						field1081.method220(183);
						field1081.method221(0);
						int var6 = field1081.field611;
						field1081.method227(field1011);
						class53.method308(field1374, field1081);
						field1081.method230(field1081.field611 - var6);
						field1374 = class52.method305(field1374);
						field1374 = class68.method390(field1374);
						method449(6, class52.method304(class52.method301(field1011)), field1374);

						if (field1299 == 2) {
							field1299 = 1;
							field1017 = true;
							field1081.method220(130);
							field1081.method221(field1242);
							field1081.method221(field1299);
							field1081.method221(field1107);
						}
					}

					if (field1252 == 4 && field1067 < 100) {
						long var7 = class52.method300(field1374);
						method483(var7);
					}

					if (field1252 == 5 && field1067 > 0) {
						long var9 = class52.method300(field1374);
						method523(var9);
					}
				}
			} else if (field1084) {
				if (var1 >= 48 && var1 <= 57 && field1158.length() < 10) {
					field1158 = field1158 + (char) var1;
					field1281 = true;
				}

				if (var1 == 8 && field1158.length() > 0) {
					field1158 = field1158.substring(0, field1158.length() - 1);
					field1281 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1158.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1158);
						} catch (Exception var15) {
						}

						field1081.method220(206);
						field1081.method225(var11);
					}

					field1084 = false;
					field1281 = true;
				}
			} else if (field1236 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1078.length() < 80) {
					field1078 = field1078 + (char) var1;
					field1281 = true;
				}

				if (var1 == 8 && field1078.length() > 0) {
					field1078 = field1078.substring(0, field1078.length() - 1);
					field1281 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1078.length() > 0) {
					if (field1078.equals("::clientdrop") && (field12 != null || method476().indexOf("192.168.1.") != -1)) {
						method542();
					} else if (field1078.equals("::lag")) {
						method423();
					} else if (field1078.startsWith("::")) {
						field1081.method220(91);
						field1081.method221(field1078.length() - 1);
						field1081.method228(field1078.substring(2));
					} else {
						byte var12 = 0;
						if (field1078.startsWith("yellow:")) {
							var12 = 0;
							field1078 = field1078.substring(7);
						}

						if (field1078.startsWith("red:")) {
							var12 = 1;
							field1078 = field1078.substring(4);
						}

						if (field1078.startsWith("green:")) {
							var12 = 2;
							field1078 = field1078.substring(6);
						}

						if (field1078.startsWith("cyan:")) {
							var12 = 3;
							field1078 = field1078.substring(5);
						}

						if (field1078.startsWith("purple:")) {
							var12 = 4;
							field1078 = field1078.substring(7);
						}

						if (field1078.startsWith("white:")) {
							var12 = 5;
							field1078 = field1078.substring(6);
						}

						if (field1078.startsWith("flash1:")) {
							var12 = 6;
							field1078 = field1078.substring(7);
						}

						if (field1078.startsWith("flash2:")) {
							var12 = 7;
							field1078 = field1078.substring(7);
						}

						if (field1078.startsWith("flash3:")) {
							var12 = 8;
							field1078 = field1078.substring(7);
						}

						if (field1078.startsWith("glow1:")) {
							var12 = 9;
							field1078 = field1078.substring(6);
						}

						if (field1078.startsWith("glow2:")) {
							var12 = 10;
							field1078 = field1078.substring(6);
						}

						if (field1078.startsWith("glow3:")) {
							var12 = 11;
							field1078 = field1078.substring(6);
						}

						byte var13 = 0;
						if (field1078.startsWith("wave:")) {
							var13 = 1;
							field1078 = field1078.substring(5);
						}

						if (field1078.startsWith("scroll:")) {
							var13 = 2;
							field1078 = field1078.substring(7);
						}

						field1081.method220(89);
						field1081.method221(0);
						int var14 = field1081.field611;
						field1081.method221(var12);
						field1081.method221(var13);
						class53.method308(field1078, field1081);
						field1081.method230(field1081.field611 - var14);
						field1078 = class52.method305(field1078);
						field1078 = class68.method390(field1078);
						field1145.field371 = field1078;
						field1145.field373 = var12;
						field1145.field374 = var13;
						field1145.field372 = 150;
						method449(2, field1145.field412, field1145.field371);

						if (field1242 == 2) {
							field1242 = 3;
							field1017 = true;
							field1081.method220(130);
							field1081.method221(field1242);
							field1081.method221(field1299);
							field1081.method221(field1107);
						}
					}

					field1078 = "";
					field1281 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLkb;)V")
	public final void method488(class37 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1217.length; var3++) {
			field1217[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1217[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1218[var9] = (field1217[var9 - 1] + field1217[var9 + 1] + field1217[var9 - 128] + field1217[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1217;
			field1217 = field1218;
			field1218 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field595; var12++) {
				for (int var13 = 0; var13 < arg0.field594; var13++) {
					if (arg0.field592[var11++] != 0) {
						int var14 = var13 + arg0.field596 + 16;
						int var15 = var12 + arg0.field597 + 16;
						int var16 = (var15 << 7) + var14;
						field1217[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method489() {
		for (class33 var1 = (class33) field1389.method250(); var1 != null; var1 = (class33) field1389.method252()) {
			if (field1174 != var1.field545 || var1.field551) {
				var1.method118();
			} else if (field1256 >= var1.field544) {
				var1.method160(field1159);

				if (var1.field551) {
					var1.method118();
				} else {
					field995.method73(false, -1, var1.field548, 60, var1.field545, 0, var1, var1.field546, var1.field547);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method490(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field995.method92(field1174, arg3, arg1, arg0);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var9 = class57.method324(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field810;
				var11 = var9.field811;
			} else {
				var10 = var9.field811;
				var11 = var9.field810;
			}

			int var12 = var9.field834;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method460(arg3, var12, false, field1145.field408[0], 0, arg1, 2, var10, 0, var11, field1145.field407[0]);
		} else {
			method460(arg3, 0, false, field1145.field408[0], var8, arg1, 2, 0, var7 + 1, 0, field1145.field407[0]);
		}

		field1166 = field19;
		field1167 = field20;
		field1169 = 2;
		field1168 = 0;
		field1081.method220(arg2);
		field1081.method222(field1100 + arg3);
		field1081.method222(field1101 + arg1);
		field1081.method222(var5);
		return true;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method491() {
		if (field1207 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field18 == 1 && field19 >= var1 - 75 && field19 <= var1 + 75 && field20 >= var2 - 20 && field20 <= var2 + 20) {
				field1207 = 3;
				field1029 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field18 == 1 && field19 >= var3 - 75 && field19 <= var3 + 75 && field20 >= var2 - 20 && field20 <= var2 + 20) {
				field1234 = "";
				field1235 = "Enter your username & password.";
				field1207 = 2;
				field1029 = 0;
			}
		} else if (field1207 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field18 == 1 && field20 >= var4 - 15 && field20 < var4) {
				field1029 = 0;
			}

			var4 += 15;
			if (field18 == 1 && field20 >= var4 - 15 && field20 < var4) {
				field1029 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field18 == 1 && field19 >= var5 - 75 && field19 <= var5 + 75 && field20 >= var6 - 20 && field20 <= var6 + 20) {
				method418(field1347, field1348, false);
			}

			int var7 = field7 / 2 + 80;
			if (field18 == 1 && field19 >= var7 - 75 && field19 <= var7 + 75 && field20 >= var6 - 20 && field20 <= var6 + 20) {
				field1207 = 0;
				field1347 = "";
				field1348 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1255.length(); var10++) {
					if (var8 == field1255.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1029 == 0) {
					if (var8 == 8 && field1347.length() > 0) {
						field1347 = field1347.substring(0, field1347.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1029 = 1;
					}

					if (var9) {
						field1347 = field1347 + (char) var8;
					}

					if (field1347.length() > 12) {
						field1347 = field1347.substring(0, 12);
					}
				} else if (field1029 == 1) {
					if (var8 == 8 && field1348.length() > 0) {
						field1348 = field1348.substring(0, field1348.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1029 = 0;
					}

					if (var9) {
						field1348 = field1348 + (char) var8;
					}

					if (field1348.length() > 20) {
						field1348 = field1348.substring(0, 20);
					}
				}
			}
		} else if (field1207 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field18 == 1 && field19 >= var11 - 75 && field19 <= var11 + 75 && field20 >= var12 - 20 && field20 <= var12 + 20) {
				field1207 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method492() {
		if (field1356 > 1) {
			field1356--;
		}

		if (field1355 > 0) {
			field1355--;
		}

		for (int var1 = 0; var1 < 5 && method510(); var1++) {
		}

		if (field1382) {
			method451();
			method526();
			method537();
			class39 var2 = class6.method45();
			if (var2 != null) {
				field1081.method220(54);
				field1081.method222(var2.field611);
				field1081.method229(0, var2.field610, var2.field611);
				var2.method219();
			}

			field1353++;
			if (field1353 > 750) {
				method542();
			}

			method512();
			method496();
			method446();

			if ((field21[1] == 1 || field21[2] == 1 || field21[3] == 1 || field21[4] == 1) && field1106++ > 5) {
				field1106 = 0;
				field1081.method220(152);
				field1081.method222(field1376);
				field1081.method222(field1377);
				field1081.method221(field1268);
				field1081.method221(field1262);
			}

			field1159++;

			if (field1169 != 0) {
				field1168 += 20;
				if (field1168 >= 400) {
					field1169 = 0;
				}
			}

			if (field1055 != 0) {
				field1052++;
				if (field1052 >= 15) {
					if (field1055 == 2) {
						field1097 = true;
					}

					if (field1055 == 3) {
						field1281 = true;
					}

					field1055 = 0;
				}
			}

			if (field1128 != 0) {
				field1375++;

				if (field16 > field1129 + 5 || field16 < field1129 - 5 || field17 > field1130 + 5 || field17 < field1130 - 5) {
					field1125 = true;
				}

				if (field15 == 0) {
					if (field1128 == 2) {
						field1097 = true;
					}

					if (field1128 == 3) {
						field1281 = true;
					}

					field1128 = 0;

					if (field1125 && field1375 >= 5) {
						field1086 = -1;
						method536();

						if (field1126 == field1086 && field1127 != field1085) {
							class4 var3 = class4.field51[field1126];
							int var4 = var3.field52[field1085];
							var3.field52[field1085] = var3.field52[field1127];
							var3.field52[field1127] = var4;
							int var5 = var3.field53[field1085];
							var3.field53[field1085] = var3.field53[field1127];
							var3.field53[field1127] = var5;
							field1081.method220(128);
							field1081.method222(field1126);
							field1081.method222(field1127);
							field1081.method222(field1085);
						}
					} else if ((field1027 == 1 || method442(field1295 - 1)) && field1295 > 2) {
						method437();
					} else if (field1295 > 0) {
						method486(field1295 - 1);
					}

					field1052 = 10;
					field18 = 0;
				}
			}

			field1253++;
			if (field1253 > 127) {
				field1253 = 0;
				field1081.method220(225);
				field1081.method224(0x4C2B2C);
			}

			if (class19.field291 != -1) {
				int var6 = class19.field291;
				int var7 = class19.field292;
				boolean var8 = method460(var6, 0, true, field1145.field408[0], 0, var7, 0, 0, 0, 0, field1145.field407[0]);
				class19.field291 = -1;

				if (var8) {
					field1166 = field19;
					field1167 = field20;
					field1169 = 1;
					field1168 = 0;
				}
			}

			if (field18 == 1 && field1282 != null) {
				field1282 = null;
				field1281 = true;
				field18 = 0;
			}

			method443();
			method482();
			method447();
			method470();

			if (field15 == 1 || field18 == 1) {
				field1056++;
			}

			if (field1318 == 2) {
				method458();
			}

			if (field1318 == 2 && field1149) {
				method533();
			}

			for (int var9 = 0; var9 < 5; var9++) {
				field1070[var9]++;
			}

			method487();
			field14++;
			if (field14 > 4500) {
				field1355 = 250;
				field14 -= 500;
				field1081.method220(113);
			}

			field1369++;
			if (field1369 > 500) {
				field1369 = 0;
				int var10 = (int) (Math.random() * 8.0D);
				if ((var10 & 0x1) == 1) {
					field1181 += field1182;
				}

				if ((var10 & 0x2) == 2) {
					field1204 += field1205;
				}

				if ((var10 & 0x4) == 4) {
					field1164 += field1165;
				}
			}

			if (field1181 < -50) {
				field1182 = 2;
			}

			if (field1181 > 50) {
				field1182 = -2;
			}

			if (field1204 < -55) {
				field1205 = 2;
			}

			if (field1204 > 55) {
				field1205 = -2;
			}

			if (field1164 < -40) {
				field1165 = 1;
			}

			if (field1164 > 40) {
				field1165 = -1;
			}

			field1209++;
			if (field1209 > 500) {
				field1209 = 0;
				int var11 = (int) (Math.random() * 8.0D);
				if ((var11 & 0x1) == 1) {
					field1268 += field1269;
				}

				if ((var11 & 0x2) == 2) {
					field1262 += field1263;
				}
			}

			if (field1268 < -60) {
				field1269 = 2;
			}

			if (field1268 > 60) {
				field1269 = -2;
			}

			if (field1262 < -20) {
				field1263 = 1;
			}

			if (field1262 > 10) {
				field1263 = -1;
			}

			field1010++;
			if (field1010 > 110) {
				field1010 = 0;
				field1081.method220(227);
				field1081.method225(0);
			}

			field1354++;
			if (field1354 > 50) {
				field1081.method220(251);
			}

			try {
				if (field1359 != null && field1081.field611 > 0) {
					field1359.method41(field1081.field610, 0, field1081.field611);
					field1081.field611 = 0;
					field1354 = 0;
				}
			} catch (IOException var13) {
				method542();
			} catch (Exception var14) {
				method459();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method493(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method494(int arg0) {
		if (!field1074) {
			if (class35.field581[17] >= arg0) {
				class37 var2 = class35.field575[17];
				int var3 = var2.field595 * var2.field594 - 1;
				int var4 = field1159 * var2.field594 * 2;
				byte[] var5 = var2.field592;
				byte[] var6 = field997;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field592 = var6;
				field997 = var5;
				class35.method176(17);
			}

			if (class35.field581[24] >= arg0) {
				class37 var8 = class35.field575[24];
				int var9 = var8.field595 * var8.field594 - 1;
				int var10 = field1159 * var8.field594 * 2;
				byte[] var11 = var8.field592;
				byte[] var12 = field997;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field592 = var12;
				field997 = var11;
				class35.method176(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method495(int arg0) {
		class4 var2 = class4.field51[arg0];
		for (int var3 = 0; var3 < var2.field72.length && var2.field72[var3] != -1; var3++) {
			class4 var4 = class4.field51[var2.field72[var3]];
			if (var4.field58 == 1) {
				method495(var4.field56);
			}

			var4.field54 = 0;
			var4.field55 = 0;
		}
	}

	@ObfuscatedName("client.s(B)V")
	public final void method496() {
		for (int var1 = 0; var1 < field1232; var1++) {
			int var2 = field1233[var1];
			class27 var3 = field1231[var2];
			if (var3 != null) {
				method497(var3, var3.field411.field846);
			}
		}
	}

	@ObfuscatedName("client.a(Lz;ZI)V")
	public final void method497(class26 arg0, int arg1) {
		if (arg0.field359 < 128 || arg0.field360 < 128 || arg0.field359 >= 13184 || arg0.field360 >= 13184) {
			arg0.field386 = -1;
			arg0.field391 = -1;
			arg0.field400 = 0;
			arg0.field401 = 0;
			arg0.field359 = arg0.field407[0] * 128 + arg0.field363 * 64;
			arg0.field360 = arg0.field408[0] * 128 + arg0.field363 * 64;
			arg0.field406 = 0;
		}

		if (field1145 == arg0 && (arg0.field359 < 1536 || arg0.field360 < 1536 || arg0.field359 >= 11776 || arg0.field360 >= 11776)) {
			arg0.field386 = -1;
			arg0.field391 = -1;
			arg0.field400 = 0;
			arg0.field401 = 0;
			arg0.field359 = arg0.field407[0] * 128 + arg0.field363 * 64;
			arg0.field360 = arg0.field408[0] * 128 + arg0.field363 * 64;
			arg0.field406 = 0;
		}

		if (arg0.field400 > field1256) {
			method498(arg0);
		} else if (arg0.field401 >= field1256) {
			method499(arg0);
		} else {
			method500(arg0);
		}

		method501(arg0);
		method502(arg0);
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method498(class26 arg0) {
		int var2 = arg0.field400 - field1256;
		int var3 = arg0.field396 * 128 + arg0.field363 * 64;
		int var4 = arg0.field398 * 128 + arg0.field363 * 64;
		arg0.field359 += (var3 - arg0.field359) / var2;
		arg0.field360 += (var4 - arg0.field360) / var2;
		arg0.field410 = 0;

		if (arg0.field402 == 0) {
			arg0.field405 = 1024;
		}

		if (arg0.field402 == 1) {
			arg0.field405 = 1536;
		}

		if (arg0.field402 == 2) {
			arg0.field405 = 0;
		}

		if (arg0.field402 == 3) {
			arg0.field405 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLz;)V")
	public final void method499(class26 arg0) {
		if (field1256 == arg0.field401 || arg0.field386 == -1 || arg0.field389 != 0 || arg0.field388 + 1 > class65.field946[arg0.field386].method373(arg0.field387)) {
			int var2 = arg0.field401 - arg0.field400;
			int var3 = field1256 - arg0.field400;
			int var4 = arg0.field396 * 128 + arg0.field363 * 64;
			int var5 = arg0.field398 * 128 + arg0.field363 * 64;
			int var6 = arg0.field397 * 128 + arg0.field363 * 64;
			int var7 = arg0.field399 * 128 + arg0.field363 * 64;
			arg0.field359 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field360 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field410 = 0;

		if (arg0.field402 == 0) {
			arg0.field405 = 1024;
		}

		if (arg0.field402 == 1) {
			arg0.field405 = 1536;
		}

		if (arg0.field402 == 2) {
			arg0.field405 = 0;
		}

		if (arg0.field402 == 3) {
			arg0.field405 = 512;
		}

		arg0.field361 = arg0.field405;
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method500(class26 arg0) {
		arg0.field383 = arg0.field364;
		if (arg0.field406 == 0) {
			arg0.field410 = 0;
		} else {
			if (arg0.field386 != -1 && arg0.field389 == 0) {
				class65 var2 = class65.field946[arg0.field386];
				if (var2.field952 == null) {
					arg0.field410++;
					return;
				}
			}

			int var3 = arg0.field359;
			int var4 = arg0.field360;
			int var5 = arg0.field407[arg0.field406 - 1] * 128 + arg0.field363 * 64;
			int var6 = arg0.field408[arg0.field406 - 1] * 128 + arg0.field363 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field405 = 1280;
					} else if (var4 > var6) {
						arg0.field405 = 1792;
					} else {
						arg0.field405 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field405 = 768;
					} else if (var4 > var6) {
						arg0.field405 = 256;
					} else {
						arg0.field405 = 512;
					}
				} else if (var4 < var6) {
					arg0.field405 = 1024;
				} else {
					arg0.field405 = 0;
				}

				int var7 = arg0.field405 - arg0.field361 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field367;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field366;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field369;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field368;
				}

				if (var8 == -1) {
					var8 = arg0.field366;
				}

				arg0.field383 = var8;
				int var9 = 4;
				if (arg0.field405 != arg0.field361 && arg0.field380 == -1) {
					var9 = 2;
				}

				if (arg0.field406 > 2) {
					var9 = 6;
				}

				if (arg0.field406 > 3) {
					var9 = 8;
				}

				if (arg0.field410 > 0 && arg0.field406 > 1) {
					var9 = 8;
					arg0.field410--;
				}

				if (arg0.field409[arg0.field406 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field383 == arg0.field366 && arg0.field370 != -1) {
					arg0.field383 = arg0.field370;
				}

				if (var3 < var5) {
					arg0.field359 += var9;
					if (arg0.field359 > var5) {
						arg0.field359 = var5;
					}
				} else if (var3 > var5) {
					arg0.field359 -= var9;
					if (arg0.field359 < var5) {
						arg0.field359 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field360 += var9;
					if (arg0.field360 > var6) {
						arg0.field360 = var6;
					}
				} else if (var4 > var6) {
					arg0.field360 -= var9;
					if (arg0.field360 < var6) {
						arg0.field360 = var6;
					}
				}

				if (arg0.field359 == var5 && arg0.field360 == var6) {
					arg0.field406--;
				}
			} else {
				arg0.field359 = var5;
				arg0.field360 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(Lz;I)V")
	public final void method501(class26 arg0) {
		if (arg0.field380 != -1 && arg0.field380 < 32768) {
			class27 var2 = field1231[arg0.field380];
			if (var2 != null) {
				int var3 = arg0.field359 - var2.field359;
				int var4 = arg0.field360 - var2.field360;
				if (var3 != 0 || var4 != 0) {
					arg0.field405 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field380 >= 32768) {
			int var5 = arg0.field380 - 32768;
			if (field1038 == var5) {
				var5 = field1288;
			}

			class28 var6 = field1289[var5];
			if (var6 != null) {
				int var7 = arg0.field359 - var6.field359;
				int var8 = arg0.field360 - var6.field360;
				if (var7 != 0 || var8 != 0) {
					arg0.field405 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field381 != 0 || arg0.field382 != 0) && (arg0.field406 == 0 || arg0.field410 > 0)) {
			int var9 = arg0.field359 - (arg0.field381 - field1100 - field1100) * 64;
			int var10 = arg0.field360 - (arg0.field382 - field1101 - field1101) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field405 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field381 = 0;
			arg0.field382 = 0;
		}

		int var11 = arg0.field405 - arg0.field361 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field361 = arg0.field405;
			} else if (var11 > 1024) {
				arg0.field361 -= 32;
			} else {
				arg0.field361 += 32;
			}

			arg0.field361 &= 0x7FF;
			if (arg0.field383 == arg0.field364 && arg0.field405 != arg0.field361) {
				if (arg0.field365 != -1) {
					arg0.field383 = arg0.field365;
					return;
				}

				arg0.field383 = arg0.field366;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lz;B)V")
	public final void method502(class26 arg0) {
		arg0.field362 = false;

		if (arg0.field383 != -1) {
			class65 var2 = class65.field946[arg0.field383];
			arg0.field385++;
			if (arg0.field384 < var2.field947 && arg0.field385 > var2.method373(arg0.field384)) {
				arg0.field385 = 0;
				arg0.field384++;
			}

			if (arg0.field384 >= var2.field947) {
				arg0.field385 = 0;
				arg0.field384 = 0;
			}
		}

		if (arg0.field386 != -1 && arg0.field389 == 0) {
			class65 var3 = class65.field946[arg0.field386];
			arg0.field388++;
			while (arg0.field387 < var3.field947 && arg0.field388 > var3.method373(arg0.field387)) {
				arg0.field388 -= var3.method373(arg0.field387);
				arg0.field387++;
			}

			if (arg0.field387 >= var3.field947) {
				arg0.field387 -= var3.field951;
				arg0.field390++;
				if (arg0.field390 >= var3.field957) {
					arg0.field386 = -1;
				}

				if (arg0.field387 < 0 || arg0.field387 >= var3.field947) {
					arg0.field386 = -1;
				}
			}

			arg0.field362 = var3.field953;
		}

		if (arg0.field389 > 0) {
			arg0.field389--;
		}

		if (arg0.field391 != -1 && field1256 >= arg0.field394) {
			if (arg0.field392 < 0) {
				arg0.field392 = 0;
			}

			class65 var4 = class66.field959[arg0.field391].field963;
			arg0.field393++;
			while (arg0.field392 < var4.field947 && arg0.field393 > var4.method373(arg0.field392)) {
				arg0.field393 -= var4.method373(arg0.field392);
				arg0.field392++;
			}

			if (arg0.field392 >= var4.field947) {
				if (arg0.field392 < 0 || arg0.field392 >= var4.field947) {
					arg0.field391 = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method503() {
		if (field1210) {
			field1210 = false;
			field1221.method261(0, field9, 11);
			field1222.method261(0, field9, 375);
			field1223.method261(729, field9, 5);
			field1224.method261(752, field9, 231);
			field1225.method261(0, field9, 0);
			field1226.method261(561, field9, 0);
			field1227.method261(520, field9, 11);
			field1228.method261(520, field9, 231);
			field1229.method261(501, field9, 375);
			field1230.method261(0, field9, 345);
			field1097 = true;
			field1281 = true;
			field1280 = true;
			field1017 = true;

			if (field1318 != 2) {
				field1156.method261(8, field9, 11);
				field1155.method261(561, field9, 5);
			}
		}

		if (field1318 == 2) {
			method429();
		}

		if (field1330 && field1119 == 1) {
			field1097 = true;
		}

		if (field1049 != -1) {
			boolean var1 = method514(field1049, field1159);
			if (var1) {
				field1097 = true;
			}
		}

		if (field1055 == 2) {
			field1097 = true;
		}

		if (field1128 == 2) {
			field1097 = true;
		}

		if (field1097) {
			method506();
			field1097 = false;
		}

		if (field1236 == -1) {
			field1215.field70 = field1320 - field1345 - 77;

			if (field16 > 453 && field16 < 565 && field17 > 350) {
				method422(463, field1320, 77, field17 - 375, 0, false, field16 - 22, field1215);
			}

			int var2 = field1320 - field1215.field70 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1320 - 77) {
				var2 = field1320 - 77;
			}

			if (field1345 != var2) {
				field1345 = var2;
				field1281 = true;
			}
		}

		if (field1236 != -1) {
			boolean var3 = method514(field1236, field1159);
			if (var3) {
				field1281 = true;
			}
		}

		if (field1055 == 3) {
			field1281 = true;
		}

		if (field1128 == 3) {
			field1281 = true;
		}

		if (field1282 != null) {
			field1281 = true;
		}

		if (field1330 && field1119 == 2) {
			field1281 = true;
		}

		if (field1281) {
			method525();
			field1281 = false;
		}

		if (field1318 == 2) {
			method546();
			field1155.method261(561, field9, 5);
		}

		if (field1271 != -1) {
			field1280 = true;
		}

		if (field1280) {
			if (field1271 != -1 && field1271 == field1186) {
				field1271 = -1;
				field1081.method220(48);
				field1081.method221(field1186);
			}

			field1280 = false;
			field1115.method260();
			field1387.method204(0, 0);

			if (field1049 == -1) {
				if (field1187[field1186] != -1) {
					if (field1186 == 0) {
						field1331.method204(30, 29);
					}

					if (field1186 == 1) {
						field1332.method204(29, 59);
					}

					if (field1186 == 2) {
						field1332.method204(29, 87);
					}

					if (field1186 == 3) {
						field1333.method204(29, 115);
					}

					if (field1186 == 4) {
						field1335.method204(29, 156);
					}

					if (field1186 == 5) {
						field1335.method204(29, 184);
					}

					if (field1186 == 6) {
						field1334.method204(30, 212);
					}
				}

				if (field1187[0] != -1 && (field1271 != 0 || field1256 % 20 < 10)) {
					field1080[0].method204(34, 35);
				}

				if (field1187[1] != -1 && (field1271 != 1 || field1256 % 20 < 10)) {
					field1080[1].method204(32, 59);
				}

				if (field1187[2] != -1 && (field1271 != 2 || field1256 % 20 < 10)) {
					field1080[2].method204(32, 86);
				}

				if (field1187[3] != -1 && (field1271 != 3 || field1256 % 20 < 10)) {
					field1080[3].method204(33, 121);
				}

				if (field1187[4] != -1 && (field1271 != 4 || field1256 % 20 < 10)) {
					field1080[4].method204(34, 157);
				}

				if (field1187[5] != -1 && (field1271 != 5 || field1256 % 20 < 10)) {
					field1080[5].method204(32, 185);
				}

				if (field1187[6] != -1 && (field1271 != 6 || field1256 % 20 < 10)) {
					field1080[6].method204(34, 212);
				}
			}

			field1115.method261(520, field9, 165);
			field1114.method260();
			field1386.method204(0, 0);

			if (field1049 == -1) {
				if (field1187[field1186] != -1) {
					if (field1186 == 7) {
						field1012.method204(0, 49);
					}

					if (field1186 == 8) {
						field1013.method204(0, 81);
					}

					if (field1186 == 9) {
						field1013.method204(0, 108);
					}

					if (field1186 == 10) {
						field1014.method204(1, 136);
					}

					if (field1186 == 11) {
						field1016.method204(0, 178);
					}

					if (field1186 == 12) {
						field1016.method204(0, 205);
					}

					if (field1186 == 13) {
						field1015.method204(0, 233);
					}
				}

				if (field1187[8] != -1 && (field1271 != 8 || field1256 % 20 < 10)) {
					field1080[7].method204(2, 80);
				}

				if (field1187[9] != -1 && (field1271 != 9 || field1256 % 20 < 10)) {
					field1080[8].method204(3, 107);
				}

				if (field1187[10] != -1 && (field1271 != 10 || field1256 % 20 < 10)) {
					field1080[9].method204(4, 142);
				}

				if (field1187[11] != -1 && (field1271 != 11 || field1256 % 20 < 10)) {
					field1080[10].method204(2, 179);
				}

				if (field1187[12] != -1 && (field1271 != 12 || field1256 % 20 < 10)) {
					field1080[11].method204(2, 206);
				}

				if (field1187[13] != -1 && (field1271 != 13 || field1256 % 20 < 10)) {
					field1080[12].method204(2, 230);
				}
			}

			field1114.method261(501, field9, 492);
			field1156.method260();
		}

		if (field1017) {
			field1017 = false;
			field1113.method260();
			field1385.method204(0, 0);
			field1249.method207(0xFFFFFF, true, 57, 33, "Public chat");

			if (field1242 == 0) {
				field1249.method207(0xFF00, true, 57, 46, "On");
			}

			if (field1242 == 1) {
				field1249.method207(0xFFFF00, true, 57, 46, "Friends");
			}

			if (field1242 == 2) {
				field1249.method207(0xFF0000, true, 57, 46, "Off");
			}

			if (field1242 == 3) {
				field1249.method207(0xFFFF, true, 57, 46, "Hide");
			}

			field1249.method207(0xFFFFFF, true, 186, 33, "Private chat");

			if (field1299 == 0) {
				field1249.method207(0xFF00, true, 186, 46, "On");
			}

			if (field1299 == 1) {
				field1249.method207(0xFFFF00, true, 186, 46, "Friends");
			}

			if (field1299 == 2) {
				field1249.method207(0xFF0000, true, 186, 46, "Off");
			}

			field1249.method207(0xFFFFFF, true, 326, 33, "Trade/duel");

			if (field1107 == 0) {
				field1249.method207(0xFF00, true, 326, 46, "On");
			}

			if (field1107 == 1) {
				field1249.method207(0xFFFF00, true, 326, 46, "Friends");
			}

			if (field1107 == 2) {
				field1249.method207(0xFF0000, true, 326, 46, "Off");
			}

			field1249.method207(0xFFFFFF, true, 462, 38, "Report abuse");
			field1113.method261(0, field9, 471);
			field1156.method260();
		}

		field1159 = 0;
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method504(class39 arg0, int arg1) {
		for (int var3 = 0; var3 < field1292; var3++) {
			int var4 = field1293[var3];
			class28 var5 = field1289[var4];
			int var6 = arg0.method231();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method231() << 8;
			}

			method524(var4, arg0, var5, var6);
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method505() {
		try {
			field1198 = -1;
			field1389.method254();
			field1219.method254();
			class35.method172();
			method481();
			field995.method62();

			for (int var1 = 0; var1 < 4; var1++) {
				field1036[var1].method350();
			}

			System.gc();
			class3 var2 = new class3(104, 104, field1082, field1373);
			int var3 = field1297.length;
			class3.field26 = class19.field257;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1257[var4] >> 8;
				int var6 = field1257[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field26 = false;
				}
			}

			if (class3.field26) {
				field995.method63(field1174);
			} else {
				field995.method63(0);
			}

			field1081.method220(251);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1257[var7] >> 8) * 64 - field1100;
				int var9 = (field1257[var7] & 0xFF) * 64 - field1101;
				byte[] var10 = field1297[var7];
				if (var10 != null) {
					var2.method15(var10, (field1093 - 6) * 8, var8, (field1092 - 6) * 8, var9);
				} else if (field1093 < 800) {
					var2.method14(var8, 64, 64, var9);
				}
			}

			field1081.method220(251);

			for (int var11 = 0; var11 < var3; var11++) {
				byte[] var12 = field1148[var11];
				if (var12 != null) {
					int var13 = (field1257[var11] >> 8) * 64 - field1100;
					int var14 = (field1257[var11] & 0xFF) * 64 - field1101;
					var2.method18(var14, field1036, var12, var13, field995);
				}
			}

			field1081.method220(251);
			var2.method20(field995, field1036);
			field1156.method260();
			field1081.method220(251);

			for (int var15 = 0; var15 < 104; var15++) {
				for (int var16 = 0; var16 < 104; var16++) {
					method530(var15, var16);
				}
			}

			method421();
		} catch (Exception var29) {
		}

		class57.field836.method115();

		if (field1074 && signlink.cache_dat != null) {
			int var18 = field1237.method274(0);
			for (int var19 = 0; var19 < var18; var19++) {
				int var20 = field1237.method278(var19);
				if ((var20 & 0x79) == 0) {
					class32.method134(var19);
				}
			}
		}

		System.gc();
		class35.method173(20);
		field1237.method283();
		int var21 = (field1092 - 6) / 8 - 1;
		int var22 = (field1092 + 6) / 8 + 1;
		int var23 = (field1093 - 6) / 8 - 1;
		int var24 = (field1093 + 6) / 8 + 1;
		if (field1023) {
			var21 = 49;
			var22 = 50;
			var23 = 49;
			var24 = 50;
		}

		for (int var25 = var21; var25 <= var22; var25++) {
			for (int var26 = var23; var26 <= var24; var26++) {
				if (var21 == var25 || var22 == var25 || var23 == var26 || var24 == var26) {
					int var27 = field1237.method276(var26, 0, var25);
					if (var27 != -1) {
						field1237.method284(3, var27);
					}

					int var28 = field1237.method276(var26, 1, var25);
					if (var28 != -1) {
						field1237.method284(3, var28);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method506() {
		field1154.method260();
		class35.field573 = field1244;
		field1160.method204(0, 0);

		if (field1049 != -1) {
			method475(class4.field51[field1049], 0, 0, 0);
		} else if (field1187[field1186] != -1) {
			method475(class4.field51[field1187[field1186]], 0, 0, 0);
		}

		if (field1330 && field1119 == 1) {
			method426();
		}

		field1154.method261(562, field9, 231);
		field1156.method260();
		class35.field573 = field1245;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1359 != null) {
				field1359.method37();
			}
		} catch (Exception var1) {
		}

		field1359 = null;
		method544();
		field1237.method273();
		field1237 = null;
		field1081 = null;
		field1090 = null;
		field1388 = null;
		field1257 = null;
		field1297 = null;
		field1148 = null;
		field1258 = null;
		field1259 = null;
		field1082 = null;
		field1373 = null;
		field995 = null;
		field1036 = null;
		field1083 = null;
		field1193 = null;
		field1032 = null;
		field1033 = null;
		field997 = null;
		field1154 = null;
		field1155 = null;
		field1156 = null;
		field1157 = null;
		field1113 = null;
		field1114 = null;
		field1115 = null;
		field1221 = null;
		field1222 = null;
		field1223 = null;
		field1224 = null;
		field1225 = null;
		field1226 = null;
		field1227 = null;
		field1228 = null;
		field1229 = null;
		field1230 = null;
		field1160 = null;
		field1161 = null;
		field1162 = null;
		field1385 = null;
		field1386 = null;
		field1387 = null;
		field1080 = null;
		field1331 = null;
		field1332 = null;
		field1333 = null;
		field1334 = null;
		field1335 = null;
		field1012 = null;
		field1013 = null;
		field1014 = null;
		field1015 = null;
		field1016 = null;
		field1325 = null;
		field1201 = null;
		field1031 = null;
		field1203 = null;
		field1238 = null;
		field1239 = null;
		field1240 = null;
		field1241 = null;
		field1091 = null;
		field1185 = null;
		field1391 = null;
		field1289 = null;
		field1291 = null;
		field1293 = null;
		field1294 = null;
		field1147 = null;
		field1231 = null;
		field1233 = null;
		field1349 = null;
		field1024 = null;
		field1219 = null;
		field1389 = null;
		field1326 = null;
		field1327 = null;
		field1328 = null;
		field1329 = null;
		field1079 = null;
		field1096 = null;
		field1021 = null;
		field1022 = null;
		field1384 = null;
		field1177 = null;
		field1220 = null;
		field1095 = null;
		field1323 = null;
		field1135 = null;
		field1136 = null;
		field1132 = null;
		field1133 = null;
		field1134 = null;
		field1137 = null;
		field1138 = null;
		field1139 = null;
		field1140 = null;
		method532();
		class57.method323();
		class58.method332();
		class59.method338();
		class62.field916 = null;
		class63.field929 = null;
		class4.field51 = null;
		class64.field936 = null;
		class65.field946 = null;
		class66.field959 = null;
		class66.field972 = null;
		class67.field974 = null;
		field10 = null;
		class28.field433 = null;
		class35.method169();
		class19.method61();
		class32.method131();
		class8.method59();
		System.gc();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.f(II)V")
	public final void method507(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(Ld;I)Z")
	public final boolean method508(class4 arg0) {
		int var2 = arg0.field60;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1079[field1295] = "Remove @whi@" + field1220[var2];
			field1328[field1295] = 557;
			field1295++;
			field1079[field1295] = "Message @whi@" + field1220[var2];
			field1328[field1295] = 679;
			field1295++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1079[field1295] = "Remove @whi@" + arg0.field90;
			field1328[field1295] = 556;
			field1295++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method509() {
		if (field1295 >= 2 || field1275 != 0 || field1301 != 0) {
			String var1;
			if (field1275 == 1 && field1295 < 2) {
				var1 = "Use " + field1279 + " with...";
			} else if (field1301 == 1 && field1295 < 2) {
				var1 = field1304 + "...";
			} else {
				var1 = field1079[field1295 - 1];
			}

			if (field1295 > 2) {
				var1 = var1 + "@whi@ / " + (field1295 - 2) + " more options";
			}

			field1250.method212(15, field1256 / 1000, true, var1, 4, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.l(Z)Z")
	public final boolean method510() {
		if (field1359 == null) {
			return false;
		}

		try {
			int var1 = field1359.method39();
			if (var1 == 0) {
				return false;
			}

			if (field1352 == -1) {
				field1359.method40(field1388.field610, 0, 1);
				field1352 = field1388.field610[0] & 0xFF;
				if (field1112 != null) {
					field1352 = field1352 - field1112.method295() & 0xFF;
				}

				field1351 = class60.field909[field1352];
				var1--;
			}

			if (field1351 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1359.method40(field1388.field610, 0, 1);
				field1351 = field1388.field610[0] & 0xFF;
				var1--;
			}

			if (field1351 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1359.method40(field1388.field610, 0, 2);
				field1388.field611 = 0;
				field1351 = field1388.method233();
				var1 -= 2;
			}

			if (var1 < field1351) {
				return false;
			}

			field1388.field611 = 0;
			field1359.method40(field1388.field610, 0, field1351);
			field1353 = 0;
			field1339 = field1338;
			field1338 = field1337;
			field1337 = field1352;

			if (field1352 == 11) {
				field1356 = field1388.method233() * 30;
				field1352 = -1;
				return true;
			}

			if (field1352 == 90) {
				field1152 = field1388.method231();
				field1153 = field1388.method231();
				field1352 = -1;
				return true;
			}

			if (field1352 == 202) {
				field1149 = true;
				field1340 = field1388.method231();
				field1341 = field1388.method231();
				field1342 = field1388.method233();
				field1343 = field1388.method231();
				field1344 = field1388.method231();
				if (field1344 >= 100) {
					field1041 = field1340 * 128 + 64;
					field1043 = field1341 * 128 + 64;
					field1042 = method520(field1174, field1341, field1340) - field1342;
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 159) {
				field1097 = true;
				int var2 = field1388.method231();
				int var3 = field1388.method236();
				int var4 = field1388.method231();
				field1060[var2] = var3;
				field1191[var2] = var4;
				field1037[var2] = 1;
				for (int var5 = 0; var5 < 98; var5++) {
					if (var3 >= field1363[var5]) {
						field1037[var2] = var5 + 2;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 3) {
				int var6 = field1388.method233();
				int var7 = field1388.method233();
				if (field1092 == var6 && field1093 == var7 && field1318 == 2) {
					field1352 = -1;
					return true;
				}

				field1092 = var6;
				field1093 = var7;
				field1100 = (field1092 - 6) * 8;
				field1101 = (field1093 - 6) * 8;
				field1023 = false;
				if ((field1092 / 8 == 48 || field1092 / 8 == 49) && field1093 / 8 == 48) {
					field1023 = true;
				}

				if (field1092 / 8 == 48 && field1093 / 8 == 148) {
					field1023 = true;
				}

				field1318 = 1;
				field1272 = System.currentTimeMillis();
				field1156.method260();
				field1249.method206("Loading - please wait.", 257, 151, 0);
				field1249.method206("Loading - please wait.", 256, 150, 0xFFFFFF);
				field1156.method261(8, field9, 11);
				int var8 = 0;
				for (int var9 = (field1092 - 6) / 8; var9 <= (field1092 + 6) / 8; var9++) {
					for (int var10 = (field1093 - 6) / 8; var10 <= (field1093 + 6) / 8; var10++) {
						var8++;
					}
				}

				field1297 = new byte[var8][];
				field1148 = new byte[var8][];
				field1257 = new int[var8];
				field1258 = new int[var8];
				field1259 = new int[var8];
				int var11 = 0;
				for (int var12 = (field1092 - 6) / 8; var12 <= (field1092 + 6) / 8; var12++) {
					for (int var13 = (field1093 - 6) / 8; var13 <= (field1093 + 6) / 8; var13++) {
						field1257[var11] = (var12 << 8) + var13;

						if (field1023 && (var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || var12 == 49 && var13 == 47)) {
							field1258[var11] = -1;
							field1259[var11] = -1;
							var11++;
						} else {
							int var14 = field1258[var11] = field1237.method276(var13, 0, var12);
							if (var14 != -1) {
								field1237.method279(3, var14);
							}

							int var15 = field1259[var11] = field1237.method276(var13, 1, var12);
							if (var15 != -1) {
								field1237.method279(3, var15);
							}

							var11++;
						}
					}
				}

				int var16 = field1100 - field1102;
				int var17 = field1101 - field1103;
				field1102 = field1100;
				field1103 = field1101;

				for (int var18 = 0; var18 < 8192; var18++) {
					class27 var19 = field1231[var18];
					if (var19 != null) {
						for (int var20 = 0; var20 < 10; var20++) {
							var19.field407[var20] -= var16;
							var19.field408[var20] -= var17;
						}

						var19.field359 -= var16 * 128;
						var19.field360 -= var17 * 128;
					}
				}

				for (int var21 = 0; var21 < field1287; var21++) {
					class28 var22 = field1289[var21];
					if (var22 != null) {
						for (int var23 = 0; var23 < 10; var23++) {
							var22.field407[var23] -= var16;
							var22.field408[var23] -= var17;
						}

						var22.field359 -= var16 * 128;
						var22.field360 -= var17 * 128;
					}
				}

				field1371 = true;
				byte var24 = 0;
				byte var25 = 104;
				byte var26 = 1;
				if (var16 < 0) {
					var24 = 103;
					var25 = -1;
					var26 = -1;
				}

				byte var27 = 0;
				byte var28 = 104;
				byte var29 = 1;
				if (var17 < 0) {
					var27 = 103;
					var28 = -1;
					var29 = -1;
				}

				for (int var30 = var24; var30 != var25; var30 += var26) {
					for (int var31 = var27; var31 != var28; var31 += var29) {
						int var32 = var16 + var30;
						int var33 = var17 + var31;
						for (int var34 = 0; var34 < 4; var34++) {
							if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
								field1349[var34][var30][var31] = field1349[var34][var32][var33];
							} else {
								field1349[var34][var30][var31] = null;
							}
						}
					}
				}

				for (class41 var35 = (class41) field1024.method250(); var35 != null; var35 = (class41) field1024.method252()) {
					var35.field629 -= var16;
					var35.field630 -= var17;
					if (var35.field629 < 0 || var35.field630 < 0 || var35.field629 >= 104 || var35.field630 >= 104) {
						var35.method118();
					}
				}

				if (field1175 != 0) {
					field1175 -= var16;
					field1176 -= var17;
				}

				field1149 = false;
				field1352 = -1;
				return true;
			}

			if (field1352 == 110) {
				class39 var36 = class6.method46();
				if (var36 != null) {
					field1081.method220(54);
					field1081.method222(var36.field611);
					field1081.method229(0, var36.field610, var36.field611);
					var36.method219();
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 82) {
				long var37 = field1388.method237();
				int var39 = field1388.method236();
				int var40 = field1388.method231();
				boolean var41 = false;
				for (int var42 = 0; var42 < 100; var42++) {
					if (field1285[var42] == var39) {
						var41 = true;
						break;
					}
				}

				if (var40 <= 1) {
					for (int var43 = 0; var43 < field1067; var43++) {
						if (field1264[var43] == var37) {
							var41 = true;
							break;
						}
					}
				}

				if (!var41 && field1286 == 0) {
					try {
						field1285[field1131] = var39;
						field1131 = (field1131 + 1) % 100;
						String var44 = class53.method307(field1351 - 13, field1388);
						var44 = class68.method390(var44);
						if (var40 > 1) {
							method449(7, class52.method304(class52.method301(var37)), var44);
						} else {
							method449(3, class52.method304(class52.method301(var37)), var44);
						}
					} catch (Exception var149) {
						signlink.reporterror("cde1");
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 64) {
				field1067 = field1351 / 8;
				for (int var46 = 0; var46 < field1067; var46++) {
					field1264[var46] = field1388.method237();
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 15) {
				int var47 = field1388.method233();
				int var48 = field1388.method231();

				if (var47 == 0xFFFF) {
					var47 = -1;
				}

				field1187[var48] = var47;
				field1097 = true;
				field1280 = true;
				field1352 = -1;
				return true;
			}

			if (field1352 == 153) {
				for (int var49 = 0; var49 < field1289.length; var49++) {
					if (field1289[var49] != null) {
						field1289[var49].field386 = -1;
					}
				}

				for (int var50 = 0; var50 < field1231.length; var50++) {
					if (field1231[var50] != null) {
						field1231[var50].field386 = -1;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 254) {
				method425(field1388, field1351);
				field1371 = false;
				field1352 = -1;
				return true;
			}

			if (field1352 == 228) {
				field1370 = field1388.method231();
				if (field1370 == 1) {
					field1163 = field1388.method233();
				}

				if (field1370 >= 2 && field1370 <= 6) {
					if (field1370 == 2) {
						field1367 = 64;
						field1368 = 64;
					}

					if (field1370 == 3) {
						field1367 = 0;
						field1368 = 64;
					}

					if (field1370 == 4) {
						field1367 = 128;
						field1368 = 64;
					}

					if (field1370 == 5) {
						field1367 = 64;
						field1368 = 0;
					}

					if (field1370 == 6) {
						field1367 = 64;
						field1368 = 128;
					}

					field1370 = 2;
					field1364 = field1388.method233();
					field1365 = field1388.method233();
					field1366 = field1388.method231();
				}

				if (field1370 == 10) {
					field1267 = field1388.method233();
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 130) {
				method539(field1388, field1351);
				field1352 = -1;
				return true;
			}

			if (field1352 == 200) {
				if (field1186 == 12) {
					field1097 = true;
				}

				field1030 = field1388.method234();
				field1352 = -1;
				return true;
			}

			if (field1352 == 118) {
				int var51 = field1388.method231();
				int var52 = field1388.method231();
				int var53 = field1388.method231();
				int var54 = field1388.method231();
				field1050[var51] = true;
				field1058[var51] = var52;
				field1040[var51] = var53;
				field1381[var51] = var54;
				field1070[var51] = 0;
				field1352 = -1;
				return true;
			}

			if (field1352 == 27) {
				field1038 = field1388.method233();
				field1352 = -1;
				return true;
			}

			if (field1352 == 35) {
				field1242 = field1388.method231();
				field1299 = field1388.method231();
				field1107 = field1388.method231();
				field1017 = true;
				field1281 = true;
				field1352 = -1;
				return true;
			}

			if (field1352 == 115) {
				if (field1049 != -1) {
					field1049 = -1;
					field1097 = true;
					field1280 = true;
				}

				if (field1236 != -1) {
					field1236 = -1;
					field1281 = true;
				}

				if (field1084) {
					field1084 = false;
					field1281 = true;
				}

				field1118 = -1;
				field1150 = false;
				field1352 = -1;
				return true;
			}

			if (field1352 == 2) {
				long var55 = field1388.method237();
				int var57 = field1388.method231();
				String var58 = class52.method304(class52.method301(var55));
				for (int var59 = 0; var59 < field1196; var59++) {
					if (field1095[var59] == var55) {
						if (field1323[var59] != var57) {
							field1323[var59] = var57;
							field1097 = true;

							if (var57 > 0) {
								method449(5, "", var58 + " has logged in.");
							}

							if (var57 == 0) {
								method449(5, "", var58 + " has logged out.");
							}
						}

						var58 = null;
						break;
					}
				}

				if (var58 != null && field1196 < 100) {
					field1095[field1196] = var55;
					field1220[field1196] = var58;
					field1323[field1196] = var57;
					field1196++;
					field1097 = true;
				}

				boolean var60 = false;
				while (!var60) {
					var60 = true;
					for (int var61 = 0; var61 < field1196 - 1; var61++) {
						if (field1323[var61] != field1071 && field1323[var61 + 1] == field1071 || field1323[var61] == 0 && field1323[var61 + 1] != 0) {
							int var62 = field1323[var61];
							field1323[var61] = field1323[var61 + 1];
							field1323[var61 + 1] = var62;
							String var63 = field1220[var61];
							field1220[var61] = field1220[var61 + 1];
							field1220[var61 + 1] = var63;
							long var64 = field1095[var61];
							field1095[var61] = field1095[var61 + 1];
							field1095[var61 + 1] = var64;
							field1097 = true;
							var60 = false;
						}
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 65) {
				field1175 = 0;
				field1352 = -1;
				return true;
			}

			if (field1352 == 8) {
				field1149 = false;

				for (int var66 = 0; var66 < 5; var66++) {
					field1050[var66] = false;
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 21) {
				int var67 = field1388.method233();
				class4.field51[var67].field97 = 3;
				class4.field51[var67].field98 = (field1145.field416[8] << 6) + (field1145.field416[0] << 12) + (field1145.field417[0] << 24) + (field1145.field417[4] << 18) + field1145.field416[11];
				field1352 = -1;
				return true;
			}

			if (field1352 == 183) {
				int var68 = field1388.method233();
				int var69 = field1388.method233();
				class4.field51[var68].field101 = var69;
				field1352 = -1;
				return true;
			}

			if (field1352 == 182) {
				field1097 = true;
				int var70 = field1388.method233();
				class4 var71 = class4.field51[var70];
				while (field1388.field611 < field1351) {
					int var72 = field1388.method231();
					int var73 = field1388.method233();
					int var74 = field1388.method231();
					if (var74 == 255) {
						var74 = field1388.method236();
					}

					if (var72 >= 0 && var72 < var71.field52.length) {
						var71.field52[var72] = var73;
						var71.field53[var72] = var74;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 24) {
				field1197 = field1388.method236();
				field1051 = field1388.method233();
				field1314 = field1388.method231();
				field1184 = field1388.method233();

				if (field1197 != 0 && field1118 == -1) {
					signlink.dnslookup(class52.method303(field1197));
					method435();
					short var75 = 650;
					if (field1314 != 201) {
						var75 = 655;
					}

					field1194 = "";
					field1064 = false;

					for (int var76 = 0; var76 < class4.field51.length; var76++) {
						if (class4.field51[var76] != null && class4.field51[var76].field60 == var75) {
							field1118 = class4.field51[var76].field57;
							break;
						}
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 186) {
				if (field1186 == 12) {
					field1097 = true;
				}

				field1178 = field1388.method231();
				field1352 = -1;
				return true;
			}

			if (field1352 == 155) {
				int var77 = field1388.method233();
				int var78 = field1388.method234();
				int var79 = field1388.method234();
				class4 var80 = class4.field51[var77];
				var80.field63 = var78;
				var80.field64 = var79;
				field1352 = -1;
				return true;
			}

			if (field1352 == 211) {
				int var81 = field1388.method233();
				int var82 = field1388.method233();
				class4.field51[var81].field97 = 1;
				class4.field51[var81].field98 = var82;
				field1352 = -1;
				return true;
			}

			if (field1352 == 177) {
				String var83 = field1388.method238();
				if (var83.endsWith(":tradereq:")) {
					String var84 = var83.substring(0, var83.indexOf(":"));
					long var85 = class52.method300(var84);
					boolean var87 = false;
					for (int var88 = 0; var88 < field1067; var88++) {
						if (field1264[var88] == var85) {
							var87 = true;
							break;
						}
					}

					if (!var87 && field1286 == 0) {
						method449(4, var84, "wishes to trade with you.");
					}
				} else if (var83.endsWith(":duelreq:")) {
					String var89 = var83.substring(0, var83.indexOf(":"));
					long var90 = class52.method300(var89);
					boolean var92 = false;
					for (int var93 = 0; var93 < field1067; var93++) {
						if (field1264[var93] == var90) {
							var92 = true;
							break;
						}
					}

					if (!var92 && field1286 == 0) {
						method449(8, var89, "wishes to duel with you.");
					}
				} else {
					method449(0, "", var83);
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 178) {
				int var94 = field1388.method233();
				if (var94 == 0xFFFF) {
					var94 = -1;
				}

				if (field1039 != var94 && field1047 && !field1074) {
					field1068 = var94;
					field1069 = true;
					field1237.method279(2, field1068);
				}

				field1039 = var94;
				field1190 = 0;
				field1352 = -1;
				return true;
			}

			if (field1352 == 75) {
				int var95 = field1388.method233();
				int var96 = field1388.method233();
				if (field1047 && !field1074) {
					field1068 = var95;
					field1069 = false;
					field1237.method279(2, field1068);
					field1190 = var96;
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 157) {
				int var97 = field1388.method233();
				class4 var98 = class4.field51[var97];
				for (int var99 = 0; var99 < var98.field52.length; var99++) {
					var98.field52[var99] = -1;
					var98.field52[var99] = 0;
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 144) {
				field1152 = field1388.method231();
				field1153 = field1388.method231();
				for (int var100 = field1152; var100 < field1152 + 8; var100++) {
					for (int var101 = field1153; var101 < field1153 + 8; var101++) {
						if (field1349[field1174][var100][var101] != null) {
							field1349[field1174][var100][var101] = null;
							method530(var100, var101);
						}
					}
				}

				for (class41 var102 = (class41) field1024.method250(); var102 != null; var102 = (class41) field1024.method252()) {
					if (var102.field629 >= field1152 && var102.field629 < field1152 + 8 && var102.field630 >= field1153 && var102.field630 < field1153 + 8 && field1174 == var102.field627) {
						var102.field638 = 0;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 43) {
				for (int var103 = 0; var103 < field1096.length; var103++) {
					if (field1300[var103] != field1096[var103]) {
						field1096[var103] = field1300[var103];
						method444(var103);
						field1097 = true;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 22) {
				field994 = false;
				field1084 = true;
				field1158 = "";
				field1281 = true;
				field1352 = -1;
				return true;
			}

			if (field1352 == 36) {
				int var104 = field1388.method233();
				method495(var104);

				if (field1049 != -1) {
					field1049 = -1;
					field1097 = true;
					field1280 = true;
				}

				if (field1236 != -1) {
					field1236 = -1;
					field1281 = true;
				}

				if (field1084) {
					field1084 = false;
					field1281 = true;
				}

				field1118 = var104;
				field1150 = false;
				field1352 = -1;
				return true;
			}

			if (field1352 == 135) {
				int var105 = field1388.method233();
				byte var106 = field1388.method232();
				field1300[var105] = var106;

				if (field1096[var105] != var106) {
					field1096[var105] = var106;
					method444(var105);
					field1097 = true;

					if (field1254 != -1) {
						field1281 = true;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 246 || field1352 == 248 || field1352 == 131 || field1352 == 215 || field1352 == 67 || field1352 == 247 || field1352 == 167 || field1352 == 230 || field1352 == 31 || field1352 == 112) {
				method547(field1388, field1352);
				field1352 = -1;
				return true;
			}

			if (field1352 == 78) {
				int var107 = field1388.method233();
				int var108 = field1388.method233();
				int var109 = field1388.method233();
				class59 var110 = class59.method339(var108);
				class4.field51[var107].field97 = 4;
				class4.field51[var107].field98 = var108;
				class4.field51[var107].field104 = var110.field879;
				class4.field51[var107].field105 = var110.field880;
				class4.field51[var107].field103 = var110.field878 * 100 / var109;
				field1352 = -1;
				return true;
			}

			if (field1352 == 120) {
				int var111 = field1388.method233();
				int var112 = field1388.method233();
				int var113 = var112 >> 10 & 0x1F;
				int var114 = var112 >> 5 & 0x1F;
				int var115 = var112 & 0x1F;
				class4.field51[var111].field92 = (var115 << 3) + (var113 << 19) + (var114 << 11);
				field1352 = -1;
				return true;
			}

			if (field1352 == 250) {
				field1152 = field1388.method231();
				field1153 = field1388.method231();

				while (field1388.field611 < field1351) {
					int var116 = field1388.method231();
					method547(field1388, var116);
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 13) {
				field1186 = field1388.method231();
				field1097 = true;
				field1280 = true;
				field1352 = -1;
				return true;
			}

			if (field1352 == 199) {
				field1283 = field1388.method231();
				field1352 = -1;
				return true;
			}

			if (field1352 == 46) {
				int var117 = field1388.method233();
				method495(var117);

				if (field1049 != -1) {
					field1049 = -1;
					field1097 = true;
					field1280 = true;
				}

				field1236 = var117;
				field1281 = true;
				field1118 = -1;
				field1150 = false;
				field1352 = -1;
				return true;
			}

			if (field1352 == 168) {
				int var118 = field1388.method234();
				field1254 = var118;
				field1281 = true;
				field1352 = -1;
				return true;
			}

			if (field1352 == 173) {
				int var119 = field1388.method233();
				boolean var120 = field1388.method231() == 1;
				class4.field51[var119].field71 = var120;
				field1352 = -1;
				return true;
			}

			if (field1352 == 18) {
				method459();
				field1352 = -1;
				return false;
			}

			if (field1352 == 181) {
				int var121 = field1388.method233();
				int var122 = field1388.method236();
				field1300[var121] = var122;

				if (field1096[var121] != var122) {
					field1096[var121] = var122;
					method444(var121);
					field1097 = true;

					if (field1254 != -1) {
						field1281 = true;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 107) {
				int var123 = field1388.method233();
				method495(var123);

				if (field1236 != -1) {
					field1236 = -1;
					field1281 = true;
				}

				if (field1084) {
					field1084 = false;
					field1281 = true;
				}

				field1049 = var123;
				field1097 = true;
				field1280 = true;
				field1118 = -1;
				field1150 = false;
				field1352 = -1;
				return true;
			}

			if (field1352 == 96) {
				int var124 = field1388.method233();
				int var125 = field1388.method231();
				int var126 = field1388.method233();
				if (field1035 && !field1074 && field1206 < 50) {
					field1202[field1206] = var124;
					field1144[field1206] = var125;
					field1199[field1206] = class55.field768[var124] + var126;
					field1206++;
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 203) {
				field1097 = true;
				int var127 = field1388.method233();
				class4 var128 = class4.field51[var127];
				int var129 = field1388.method231();
				for (int var130 = 0; var130 < var129; var130++) {
					var128.field52[var130] = field1388.method233();
					int var131 = field1388.method231();
					if (var131 == 255) {
						var131 = field1388.method236();
					}

					var128.field53[var130] = var131;
				}

				for (int var132 = var129; var132 < var128.field52.length; var132++) {
					var128.field52[var132] = 0;
					var128.field53[var132] = 0;
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 94) {
				field1271 = field1388.method231();
				if (field1271 == field1186) {
					if (field1271 == 3) {
						field1186 = 1;
					} else {
						field1186 = 3;
					}

					field1097 = true;
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 0) {
				field1149 = true;
				field1307 = field1388.method231();
				field1308 = field1388.method231();
				field1309 = field1388.method233();
				field1310 = field1388.method231();
				field1311 = field1388.method231();
				if (field1311 >= 100) {
					int var133 = field1307 * 128 + 64;
					int var134 = field1308 * 128 + 64;
					int var135 = method520(field1174, field1308, field1307) - field1309;
					int var136 = var133 - field1041;
					int var137 = var135 - field1042;
					int var138 = var134 - field1043;
					int var139 = (int) Math.sqrt(var136 * var136 + var138 * var138);
					field1044 = (int) (Math.atan2(var137, var139) * 325.949D) & 0x7FF;
					field1045 = (int) (Math.atan2(var136, var138) * -325.949D) & 0x7FF;

					if (field1044 < 128) {
						field1044 = 128;
					}

					if (field1044 > 383) {
						field1044 = 383;
					}
				}

				field1352 = -1;
				return true;
			}

			if (field1352 == 146) {
				int var140 = field1388.method233();
				int var141 = field1388.method233();
				class4.field51[var140].field97 = 2;
				class4.field51[var140].field98 = var141;
				field1352 = -1;
				return true;
			}

			if (field1352 == 25) {
				class6.method43();
				field1352 = -1;
				return true;
			}

			if (field1352 == 140) {
				int var142 = field1388.method233();
				int var143 = field1388.method233();

				if (field1236 != -1) {
					field1236 = -1;
					field1281 = true;
				}

				if (field1084) {
					field1084 = false;
					field1281 = true;
				}

				field1118 = var142;
				field1049 = var143;
				field1097 = true;
				field1280 = true;
				field1150 = false;
				field1352 = -1;
				return true;
			}

			if (field1352 == 98) {
				int var144 = field1388.method233();
				String var145 = field1388.method238();
				class4.field51[var144].field90 = var145;

				if (field1187[field1186] == class4.field51[var144].field57) {
					field1097 = true;
				}

				field1352 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1352 + "," + field1351 + " - " + field1338 + "," + field1339);
			method459();
		} catch (IOException var150) {
			method542();
		} catch (Exception var151) {
			String var147 = "T2 - " + field1352 + "," + field1338 + "," + field1339 + " - " + field1351 + "," + (field1145.field407[0] + field1100) + "," + (field1145.field408[0] + field1101) + " - ";
			for (int var148 = 0; var148 < field1351 && var148 < 50; var148++) {
				var147 = var147 + field1388.field610[var148] + ",";
			}

			signlink.reporterror(var147);
			method459();
		}

		return true;
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method511(int arg0, class39 arg1) {
		arg1.method241();
		int var3 = arg1.method242(8);
		if (var3 < field1232) {
			for (int var4 = var3; var4 < field1232; var4++) {
				field1147[field1146++] = field1233[var4];
			}
		}

		if (var3 > field1232) {
			signlink.reporterror(field1347 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1232 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1233[var5];
			class27 var7 = field1231[var6];
			int var8 = arg1.method242(1);
			if (var8 == 0) {
				field1233[field1232++] = var6;
				var7.field403 = field1256;
			} else {
				int var9 = arg1.method242(2);
				if (var9 == 0) {
					field1233[field1232++] = var6;
					var7.field403 = field1256;
					field1293[field1292++] = var6;
				} else if (var9 == 1) {
					field1233[field1232++] = var6;
					var7.field403 = field1256;
					int var10 = arg1.method242(3);
					var7.method123(var10, false);
					int var11 = arg1.method242(1);
					if (var11 == 1) {
						field1293[field1292++] = var6;
					}
				} else if (var9 == 2) {
					field1233[field1232++] = var6;
					var7.field403 = field1256;
					int var12 = arg1.method242(3);
					var7.method123(var12, true);
					int var13 = arg1.method242(3);
					var7.method123(var13, true);
					int var14 = arg1.method242(1);
					if (var14 == 1) {
						field1293[field1292++] = var6;
					}
				} else if (var9 == 3) {
					field1147[field1146++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method512() {
		for (int var1 = -1; var1 < field1290; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1288;
			} else {
				var2 = field1291[var1];
			}

			class28 var3 = field1289[var2];
			if (var3 != null) {
				method497(var3, 1);
			}
		}

		field1124++;
		if (field1124 > 1406) {
			field1124 = 0;
			field1081.method220(124);
			field1081.method221(0);
			int var4 = field1081.field611;
			field1081.method221(162);
			field1081.method221(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1081.method221(84);
			}

			field1081.method222(31824);
			field1081.method222(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1081.method221(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1081.method221(134);
			}

			field1081.method221(100);
			field1081.method221(94);
			field1081.method222(35521);
			field1081.method230(field1081.field611 - var4);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method513() {
		if (field1157 == null) {
			method532();
			field10 = null;
			field1132 = null;
			field1133 = null;
			field1134 = null;
			field1135 = null;
			field1136 = null;
			field1137 = null;
			field1138 = null;
			field1139 = null;
			field1140 = null;
			field1157 = new class44(96, 479, method11());
			field1155 = new class44(160, 168, method11());
			class34.method164();
			field1161.method204(0, 0);
			field1154 = new class44(261, 190, method11());
			field1156 = new class44(334, 512, method11());
			class34.method164();
			field1113 = new class44(61, 501, method11());
			field1114 = new class44(40, 288, method11());
			field1115 = new class44(66, 269, method11());
			field1210 = true;
		}
	}

	@ObfuscatedName("client.b(IIZ)Z")
	public final boolean method514(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field51[arg0];
		for (int var5 = 0; var5 < var4.field72.length && var4.field72[var5] != -1; var5++) {
			class4 var6 = class4.field51[var4.field72[var5]];
			if (var6.field58 == 1) {
				var3 |= method514(var6.field56, arg1);
			}

			if (var6.field58 == 6 && (var6.field101 != -1 || var6.field102 != -1)) {
				boolean var7 = method439(var6);
				int var8;
				if (var7) {
					var8 = var6.field102;
				} else {
					var8 = var6.field101;
				}

				if (var8 != -1) {
					class65 var9 = class65.field946[var8];
					var6.field55 += arg1;
					while (var6.field55 > var9.method373(var6.field54)) {
						var6.field55 -= var9.method373(var6.field54) + 1;
						var6.field54++;
						if (var6.field54 >= var9.field947) {
							var6.field54 -= var9.field951;
							if (var6.field54 < 0 || var6.field54 >= var9.field947) {
								var6.field54 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method515() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1315[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1315[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1316[var10] = (field1315[var10 - 1] + field1315[var10 + 1] + field1315[var10 - 128] + field1315[var10 + 128]) / 4;
			}
		}

		field1321 += 128;
		if (field1321 > field1217.length) {
			field1321 -= field1217.length;
			int var11 = (int) (Math.random() * 12.0D);
			method488(field1362[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1316[var14 + 128] - field1217[field1321 + var14 & field1217.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1315[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field998[var16] = field998[var16 + 1];
		}

		field998[var1 - 1] = (int) (Math.sin(field1256 / 14.0D) * 16.0D + Math.sin(field1256 / 15.0D) * 14.0D + Math.sin(field1256 / 16.0D) * 12.0D);

		if (field1065 > 0) {
			field1065 -= 4;
		}

		if (field1066 > 0) {
			field1066 -= 4;
		}

		if (field1065 == 0 && field1066 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1065 = 1024;
			}

			if (var17 == 1) {
				field1066 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILz;I)V")
	public final void method516(int arg0, class26 arg1) {
		method517(arg1.field359, arg1.field360, arg0);
	}

	@ObfuscatedName("client.a(IIIZ)V")
	public final void method517(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method520(field1174, arg1, arg0) - arg2;
			arg0 -= field1041;
			var4 -= field1042;
			arg1 -= field1043;
			int var5 = class32.field539[field1044];
			int var6 = class32.field540[field1044];
			int var7 = class32.field539[field1045];
			int var8 = class32.field540[field1045];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field1312 = (var9 << 9) / arg1 + class35.field567;
				field1313 = (var11 << 9) / arg1 + class35.field568;
			} else {
				field1312 = -1;
				field1313 = -1;
			}
		} else {
			field1312 = -1;
			field1313 = -1;
		}
	}

	public final void init() {
		field1071 = Integer.parseInt(getParameter("nodeid"));
		field1072 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method455();
		} else {
			method519();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1073 = false;
		} else {
			field1073 = true;
		}

		method2(532, 789);
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method518(long arg0) {
		if (arg0 != 0L) {
			if (field1196 >= 100) {
				method449(0, "", "Your friends list is full. Max of 100 hit");
			} else {
				String var3 = class52.method304(class52.method301(arg0));
				for (int var4 = 0; var4 < field1196; var4++) {
					if (field1095[var4] == arg0) {
						method449(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1067; var5++) {
					if (field1264[var5] == arg0) {
						method449(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1145.field412)) {
					field1220[field1196] = var3;
					field1095[field1196] = arg0;
					field1323[field1196] = 0;
					field1196++;
					field1097 = true;
					field1081.method220(8);
					field1081.method227(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public static final void method519() {
		class19.field257 = false;
		class35.field562 = false;
		field1074 = false;
		class3.field26 = false;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method520(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		int var6 = arg0;
		if (arg0 < 3 && (field1373[1][var4][var5] & 0x2) == 2) {
			var6 = arg0 + 1;
		}

		int var7 = arg2 & 0x7F;
		int var8 = arg1 & 0x7F;
		int var9 = (128 - var7) * field1082[var6][var4][var5] + field1082[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field1082[var6][var4][var5 + 1] + field1082[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field995.method88(arg3, arg0, arg1);
		if (var6 != 0) {
			int var7 = field995.method92(arg3, arg0, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field1177.field585;
			int var12 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method324(var13);
			if (var14.field825 == -1) {
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
				class37 var15 = field1091[var14.field825];
				if (var15 != null) {
					int var16 = (var14.field810 * 4 - var15.field594) / 2;
					int var17 = (var14.field811 * 4 - var15.field595) / 2;
					var15.method204((104 - arg1 - var14.field811) * 4 + var17 + 48, arg0 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field995.method90(arg3, arg0, arg1);
		if (var18 != 0) {
			int var19 = field995.method92(arg3, arg0, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method324(var22);
			if (var23.field825 != -1) {
				class37 var24 = field1091[var23.field825];
				if (var24 != null) {
					int var25 = (var23.field810 * 4 - var24.field594) / 2;
					int var26 = (var23.field811 * 4 - var24.field595) / 2;
					var24.method204((104 - arg1 - var23.field811) * 4 + var26 + 48, arg0 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1177.field585;
				int var29 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field995.method91(arg3, arg0, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method324(var31);
			if (var32.field825 != -1) {
				class37 var33 = field1091[var32.field825];
				if (var33 != null) {
					int var34 = (var32.field810 * 4 - var33.field594) / 2;
					int var35 = (var32.field811 * 4 - var33.field595) / 2;
					var33.method204((104 - arg1 - var32.field811) * 4 + var35 + 48, arg0 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjb;II)V")
	public final void method522(class36 arg0, int arg1, int arg2) {
		int var4 = field1377 + field1268 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class32.field539[var4];
			int var7 = class32.field540[var4];
			var6 = var6 * 256 / (field1262 + 256);
			var7 = var7 * 256 / (field1262 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method197(var8 + 94 - arg0.field590 / 2, 83 - var9 - arg0.field591 / 2, field1161);
			} else {
				arg0.method190(83 - var9 - arg0.field591 / 2, var8 + 94 - arg0.field590 / 2);
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method523(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1067; var3++) {
				if (field1264[var3] == arg0) {
					field1067--;
					field1097 = true;

					for (int var4 = var3; var4 < field1067; var4++) {
						field1264[var4] = field1264[var4 + 1];
					}

					field1081.method220(181);
					field1081.method227(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;Lbb;BI)V")
	public final void method524(int arg0, class39 arg1, class28 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg1.method231();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg1.method240(0, var6, var5);
			field1294[arg0] = var7;
			arg2.method126(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg1.method233();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field386 == var8) {
				arg2.field390 = 0;
			}

			int var9 = arg1.method231();
			if (var8 == -1 || arg2.field386 == -1 || class65.field946[var8].field954 > class65.field946[arg2.field386].field954 || class65.field946[arg2.field386].field954 == 0) {
				arg2.field386 = var8;
				arg2.field387 = 0;
				arg2.field388 = 0;
				arg2.field389 = var9;
				arg2.field390 = 0;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg2.field380 = arg1.method233();
			if (arg2.field380 == 0xFFFF) {
				arg2.field380 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg2.field371 = arg1.method238();
			arg2.field373 = 0;
			arg2.field374 = 0;
			arg2.field372 = 150;
			method449(2, arg2.field412, arg2.field371);
		}

		if ((arg3 & 0x10) == 0x10) {
			arg2.field375 = arg1.method231();
			arg2.field376 = arg1.method231();
			arg2.field377 = field1256 + 400;
			arg2.field378 = arg1.method231();
			arg2.field379 = arg1.method231();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg2.field381 = arg1.method233();
			arg2.field382 = arg1.method233();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var10 = arg1.method233();
			int var11 = arg1.method231();
			int var12 = arg1.method231();
			int var13 = arg1.field611;

			if (arg2.field412 != null) {
				long var14 = class52.method300(arg2.field412);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1067; var17++) {
						if (field1264[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1286 == 0) {
					try {
						String var18 = class53.method307(var12, arg1);
						var18 = class68.method390(var18);
						arg2.field371 = var18;
						arg2.field373 = var10 >> 8;
						arg2.field374 = var10 & 0xFF;
						arg2.field372 = 150;

						if (var11 > 1) {
							method449(1, arg2.field412, var18);
						} else {
							method449(2, arg2.field412, var18);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field611 = var12 + var13;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg2.field391 = arg1.method233();
			int var20 = arg1.method236();
			arg2.field395 = var20 >> 16;
			arg2.field394 = (var20 & 0xFFFF) + field1256;
			arg2.field392 = 0;
			arg2.field393 = 0;

			if (arg2.field394 > field1256) {
				arg2.field392 = -1;
			}

			if (arg2.field391 == 0xFFFF) {
				arg2.field391 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg2.field396 = arg1.method231();
			arg2.field398 = arg1.method231();
			arg2.field397 = arg1.method231();
			arg2.field399 = arg1.method231();
			arg2.field400 = arg1.method233() + field1256;
			arg2.field401 = arg1.method233() + field1256;
			arg2.field402 = arg1.method231();
			arg2.field406 = 0;
			arg2.field407[0] = arg2.field397;
			arg2.field408[0] = arg2.field399;
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1072 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.x(I)V")
	public final void method525() {
		field1157.method260();
		class35.field573 = field1243;
		field1162.method204(0, 0);

		if (field994) {
			field1250.method206(field1390, 239, 40, 0);
			field1250.method206(field1374 + "*", 239, 60, 128);
		} else if (field1084) {
			field1250.method206("Enter amount:", 239, 40, 0);
			field1250.method206(field1158 + "*", 239, 60, 128);
		} else if (field1282 != null) {
			field1250.method206(field1282, 239, 40, 0);
			field1250.method206("Click to continue", 239, 60, 128);
		} else if (field1236 != -1) {
			method475(class4.field51[field1236], 0, 0, 0);
		} else if (field1254 == -1) {
			class38 var1 = field1249;
			int var2 = 0;
			class34.method163(77, 0, 0, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1143[var3] != null) {
					int var4 = field1141[var3];
					int var5 = field1345 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0, 4, var5, field1143[var3]);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0xFFFFFF, 4, var5, field1142[var3] + ":");
							var1.method209(255, var1.method208(field1142[var3]) + 12, var5, field1143[var3]);
						}

						var2++;
					}

					if (var4 == 2 && (field1242 == 0 || field1242 == 1 && method480(field1142[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0, 4, var5, field1142[var3] + ":");
							var1.method209(255, var1.method208(field1142[var3]) + 12, var5, field1143[var3]);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1350 == 0 && (var4 == 7 || field1299 == 0 || field1299 == 1 && method480(field1142[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0, 4, var5, "From " + field1142[var3] + ":");
							var1.method209(0x800000, var1.method208("From " + field1142[var3]) + 12, var5, field1143[var3]);
						}

						var2++;
					}

					if (var4 == 4 && (field1107 == 0 || field1107 == 1 && method480(field1142[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0x800080, 4, var5, field1142[var3] + " " + field1143[var3]);
						}

						var2++;
					}

					if (var4 == 5 && field1350 == 0 && field1299 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0x800000, 4, var5, field1143[var3]);
						}

						var2++;
					}

					if (var4 == 6 && field1350 == 0 && field1299 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0, 4, var5, "To " + field1142[var3] + ":");
							var1.method209(0x800000, var1.method208("To " + field1142[var3]) + 12, var5, field1143[var3]);
						}

						var2++;
					}

					if (var4 == 8 && (field1107 == 0 || field1107 == 1 && method480(field1142[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(0xCBB789, 4, var5, field1142[var3] + " " + field1143[var3]);
						}

						var2++;
					}
				}
			}

			class34.method162();
			field1320 = var2 * 14 + 7;
			if (field1320 < 78) {
				field1320 = 78;
			}

			method461(field1320 - field1345 - 77, 0, field1320, 463, 77);
			var1.method209(0, 4, 90, class52.method304(field1347) + ":");
			var1.method209(255, var1.method208(field1347 + ": ") + 6, 90, field1078 + "*");
			class34.method167(0, 77, 479, 0);
		} else {
			method475(class4.field51[field1254], 0, 0, 0);
		}

		if (field1330 && field1119 == 2) {
			method426();
		}

		field1157.method261(22, field9, 375);
		field1156.method260();
		class35.field573 = field1245;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method526() {
		if (field1318 == 2) {
			for (class41 var1 = (class41) field1024.method250(); var1 != null; var1 = (class41) field1024.method252()) {
				if (var1.field638 > 0) {
					var1.field638--;
				}

				if (var1.field638 != 0) {
					if (var1.field637 > 0) {
						var1.field637--;
					}

					if (var1.field637 == 0 && (var1.field634 < 0 || class3.method30(var1.field634, var1.field636))) {
						method440(var1.field628, var1.field630, var1.field629, var1.field635, var1.field634, var1.field627, var1.field636);
						var1.field637 = -1;

						if (var1.field634 == var1.field631 && var1.field631 == -1) {
							var1.method118();
						} else if (var1.field634 == var1.field631 && var1.field635 == var1.field632 && var1.field636 == var1.field633) {
							var1.method118();
						}
					}
				} else if (var1.field631 < 0 || class3.method30(var1.field631, var1.field633)) {
					method440(var1.field628, var1.field630, var1.field629, var1.field632, var1.field631, var1.field627, var1.field633);
					var1.method118();
				}
			}

			field1151++;
			if (field1151 > 85) {
				field1151 = 0;
				field1081.method220(120);
				return;
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method527() {
		short var1 = 256;

		if (field1065 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1065 > 768) {
					field1170[var2] = method534(field1171[var2], 1024 - field1065, field1172[var2]);
				} else if (field1065 > 256) {
					field1170[var2] = field1172[var2];
				} else {
					field1170[var2] = method534(field1172[var2], 256 - field1065, field1171[var2]);
				}
			}
		} else if (field1066 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1066 > 768) {
					field1170[var3] = method534(field1171[var3], 1024 - field1066, field1173[var3]);
				} else if (field1066 > 256) {
					field1170[var3] = field1173[var3];
				} else {
					field1170[var3] = method534(field1173[var3], 256 - field1066, field1171[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1170[var4] = field1171[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1135.field643[var5] = field1108.field585[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field998[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1315[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1170[var12];
					int var15 = field1135.field643[var7];
					field1135.field643[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1135.method261(0, field9, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1136.field643[var16] = field1109.field585[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field998[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1315[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1170[var23];
					int var26 = field1136.field643[var18];
					field1136.field643[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1136.method261(661, field9, 0);
	}

	@ObfuscatedName("client.z(I)V")
	public final void method528() {
		if (field1132 == null) {
			field10 = null;
			field1157 = null;
			field1155 = null;
			field1154 = null;
			field1156 = null;
			field1113 = null;
			field1114 = null;
			field1115 = null;
			field1135 = new class44(265, 128, method11());
			class34.method164();
			field1136 = new class44(265, 128, method11());
			class34.method164();
			field1132 = new class44(186, 533, method11());
			class34.method164();
			field1133 = new class44(146, 360, method11());
			class34.method164();
			field1134 = new class44(200, 360, method11());
			class34.method164();
			field1137 = new class44(267, 214, method11());
			class34.method164();
			field1138 = new class44(267, 215, method11());
			class34.method164();
			field1139 = new class44(79, 86, method11());
			class34.method164();
			field1140 = new class44(79, 87, method11());
			class34.method164();

			if (field1094 != null) {
				method438();
				method457();
			}

			field1210 = true;
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method529(class4 arg0) {
		int var2 = arg0.field60;
		if (var2 == 201) {
			field1281 = true;
			field1084 = false;
			field994 = true;
			field1374 = "";
			field1252 = 1;
			field1390 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1281 = true;
			field1084 = false;
			field994 = true;
			field1374 = "";
			field1252 = 2;
			field1390 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1355 = 250;
			return true;
		}

		if (var2 == 501) {
			field1281 = true;
			field1084 = false;
			field994 = true;
			field1374 = "";
			field1252 = 4;
			field1390 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1281 = true;
			field1084 = false;
			field994 = true;
			field1374 = "";
			field1252 = 5;
			field1390 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1216[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class63.field928 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class63.field928) {
							var5 = 0;
						}
					}

					if (!class63.field929[var5].field935 && class63.field929[var5].field930 == var3 + (field1360 ? 0 : 7)) {
						break;
					}
				}

				field1216[var3] = var5;
				field1358 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1057[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1098[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1098[var6].length) {
					var8 = 0;
				}
			}

			field1057[var6] = var8;
			field1358 = true;
		}

		if (var2 == 324 && !field1360) {
			field1360 = true;
			method477();
		}

		if (var2 == 325 && field1360) {
			field1360 = false;
			method477();
		}

		if (var2 == 326) {
			field1081.method220(188);
			field1081.method221(field1360 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1081.method221(field1216[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1081.method221(field1057[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1064 = !field1064;
		}

		if (var2 >= 601 && var2 <= 612) {
			method435();

			if (field1194.length() > 0) {
				field1081.method220(144);
				field1081.method227(class52.method300(field1194));
				field1081.method221(var2 - 601);
				field1081.method221(field1064 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method530(int arg0, int arg1) {
		class42 var3 = field1349[field1174][arg0][arg1];
		if (var3 == null) {
			field995.method83(field1174, arg0, arg1);
		} else {
			int var4 = -99999999;
			class30 var5 = null;
			for (class30 var6 = (class30) var3.method250(); var6 != null; var6 = (class30) var3.method252()) {
				class59 var7 = class59.method339(var6.field444);
				int var8 = var7.field886;
				if (var7.field885) {
					var8 = (var6.field445 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method248(var5);
			class30 var9 = null;
			class30 var10 = null;
			for (class30 var11 = (class30) var3.method250(); var11 != null; var11 = (class30) var3.method252()) {
				if (var5.field444 != var11.field444 && var9 == null) {
					var9 = var11;
				}

				if (var5.field444 != var11.field444 && var9.field444 != var11.field444 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field995.method69(var10, var12, var5, field1174, var9, method520(field1174, arg1 * 128 + 64, arg0 * 128 + 64), arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IZLd;)I")
	public final int method531(int arg0, class4 arg1) {
		if (arg1.field65 == null || arg0 >= arg1.field65.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field65[arg0];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1191[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1037[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1060[var3[var5++]];
				}

				if (var6 == 4) {
					class4 var7 = class4.field51[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field52.length; var9++) {
						if (var7.field52[var9] == var8) {
							var4 += var7.field53[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field1096[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1363[field1037[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1096[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1145.field418;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1037[var10];
					}
				}

				if (var6 == 10) {
					class4 var11 = class4.field51[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field52.length; var13++) {
						if (var11.field52[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field1178;
				}

				if (var6 == 12) {
					var4 += field1030;
				}

				if (var6 == 13) {
					int var14 = field1096[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
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

	@ObfuscatedName("client.t(B)V")
	public final void method532() {
		field1179 = false;
		while (field1099) {
			field1179 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1212 = null;
		field1213 = null;
		field1362 = null;
		field1170 = null;
		field1171 = null;
		field1172 = null;
		field1173 = null;
		field1217 = null;
		field1218 = null;
		field1315 = null;
		field1316 = null;
		field1108 = null;
		field1109 = null;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method533() {
		int var1 = field1340 * 128 + 64;
		int var2 = field1341 * 128 + 64;
		int var3 = method520(field1174, field1341, field1340) - field1342;

		if (field1041 < var1) {
			field1041 += (var1 - field1041) * field1344 / 1000 + field1343;
			if (field1041 > var1) {
				field1041 = var1;
			}
		}

		if (field1041 > var1) {
			field1041 -= (field1041 - var1) * field1344 / 1000 + field1343;
			if (field1041 < var1) {
				field1041 = var1;
			}
		}

		if (field1042 < var3) {
			field1042 += (var3 - field1042) * field1344 / 1000 + field1343;
			if (field1042 > var3) {
				field1042 = var3;
			}
		}

		if (field1042 > var3) {
			field1042 -= (field1042 - var3) * field1344 / 1000 + field1343;
			if (field1042 < var3) {
				field1042 = var3;
			}
		}

		if (field1043 < var2) {
			field1043 += (var2 - field1043) * field1344 / 1000 + field1343;
			if (field1043 > var2) {
				field1043 = var2;
			}
		}

		if (field1043 > var2) {
			field1043 -= (field1043 - var2) * field1344 / 1000 + field1343;
			if (field1043 < var2) {
				field1043 = var2;
			}
		}

		int var4 = field1307 * 128 + 64;
		int var5 = field1308 * 128 + 64;
		int var6 = method520(field1174, field1308, field1307) - field1309;
		int var7 = var4 - field1041;
		int var8 = var6 - field1042;
		int var9 = var5 - field1043;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1044 < var11) {
			field1044 += (var11 - field1044) * field1311 / 1000 + field1310;
			if (field1044 > var11) {
				field1044 = var11;
			}
		}

		if (field1044 > var11) {
			field1044 -= (field1044 - var11) * field1311 / 1000 + field1310;
			if (field1044 < var11) {
				field1044 = var11;
			}
		}

		int var13 = var12 - field1045;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1045 += field1311 * var13 / 1000 + field1310;
			field1045 &= 0x7FF;
		}

		if (var13 < 0) {
			field1045 -= -var13 * field1311 / 1000 + field1310;
			field1045 &= 0x7FF;
		}

		int var14 = var12 - field1045;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1045 = var12;
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int method534(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IIILfc;I)V")
	public final void method535(int arg0, int arg1, class58 arg2, int arg3) {
		if (field1295 < 400) {
			String var5 = arg2.field844;
			if (arg2.field862 != 0) {
				var5 = var5 + method478(field1145.field418, arg2.field862) + " (level-" + arg2.field862 + ")";
			}

			if (field1275 == 1) {
				field1079[field1295] = "Use " + field1279 + " with @yel@" + var5;
				field1328[field1295] = 900;
				field1329[field1295] = arg1;
				field1326[field1295] = arg3;
				field1327[field1295] = arg0;
				field1295++;
			} else if (field1301 != 1) {
				if (arg2.field857 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg2.field857[var6] != null && !arg2.field857[var6].equalsIgnoreCase("attack")) {
							field1079[field1295] = arg2.field857[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1328[field1295] = 728;
							}

							if (var6 == 1) {
								field1328[field1295] = 542;
							}

							if (var6 == 2) {
								field1328[field1295] = 6;
							}

							if (var6 == 3) {
								field1328[field1295] = 963;
							}

							if (var6 == 4) {
								field1328[field1295] = 245;
							}

							field1329[field1295] = arg1;
							field1326[field1295] = arg3;
							field1327[field1295] = arg0;
							field1295++;
						}
					}
				}

				if (arg2.field857 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg2.field857[var7] != null && arg2.field857[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg2.field862 > field1145.field418) {
								var8 = 2000;
							}

							field1079[field1295] = arg2.field857[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1328[field1295] = var8 + 728;
							}

							if (var7 == 1) {
								field1328[field1295] = var8 + 542;
							}

							if (var7 == 2) {
								field1328[field1295] = var8 + 6;
							}

							if (var7 == 3) {
								field1328[field1295] = var8 + 963;
							}

							if (var7 == 4) {
								field1328[field1295] = var8 + 245;
							}

							field1329[field1295] = arg1;
							field1326[field1295] = arg3;
							field1327[field1295] = arg0;
							field1295++;
						}
					}
				}

				field1079[field1295] = "Examine @yel@" + var5;
				field1328[field1295] = 1607;
				field1329[field1295] = arg1;
				field1326[field1295] = arg3;
				field1327[field1295] = arg0;
				field1295++;
			} else if ((field1303 & 0x2) == 2) {
				field1079[field1295] = field1304 + " @yel@" + var5;
				field1328[field1295] = 265;
				field1329[field1295] = arg1;
				field1326[field1295] = arg3;
				field1327[field1295] = arg0;
				field1295++;
				return;
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method536() {
		if (field1128 == 0) {
			field1079[0] = "Cancel";
			field1328[0] = 1252;
			field1295 = 1;
			method420(field17, field16);
			field1018 = 0;

			if (field16 > 8 && field17 > 11 && field16 < 520 && field17 < 345) {
				if (field1118 == -1) {
					method545();
				} else {
					method431(field16, 0, class4.field51[field1118], 8, 11, field17);
				}
			}

			if (field1214 != field1018) {
				field1214 = field1018;
			}

			field1018 = 0;

			if (field16 > 562 && field17 > 231 && field16 < 752 && field17 < 492) {
				if (field1049 != -1) {
					method431(field16, 0, class4.field51[field1049], 562, 231, field17);
				} else if (field1187[field1186] != -1) {
					method431(field16, 0, class4.field51[field1187[field1186]], 562, 231, field17);
				}
			}

			if (field1028 != field1018) {
				field1097 = true;
				field1028 = field1018;
			}

			field1018 = 0;

			if (field16 > 22 && field17 > 375 && field16 < 431 && field17 < 471) {
				if (field1236 == -1) {
					method466(field16 - 22, field17 - 375);
				} else {
					method431(field16, 0, class4.field51[field1236], 22, 375, field17);
				}
			}

			if (field1236 != -1 && field1088 != field1018) {
				field1281 = true;
				field1088 = field1018;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1295 - 1; var2++) {
					if (field1328[var2] < 1000 && field1328[var2 + 1] > 1000) {
						String var3 = field1079[var2];
						field1079[var2] = field1079[var2 + 1];
						field1079[var2 + 1] = var3;
						int var4 = field1328[var2];
						field1328[var2] = field1328[var2 + 1];
						field1328[var2 + 1] = var4;
						int var5 = field1326[var2];
						field1326[var2] = field1326[var2 + 1];
						field1326[var2 + 1] = var5;
						int var6 = field1327[var2];
						field1327[var2] = field1327[var2 + 1];
						field1327[var2 + 1] = var6;
						int var7 = field1329[var2];
						field1329[var2] = field1329[var2 + 1];
						field1329[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method537() {
		for (int var1 = 0; var1 < field1206; var1++) {
			if (field1199[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1202[var1] != field1200 || field1144[var1] != field1110) {
						class39 var3 = class55.method313(field1144[var1], field1202[var1]);
						if (System.currentTimeMillis() + var3.field611 / 22 > field1180 / 22 + field1361) {
							field1180 = var3.field611;
							field1361 = System.currentTimeMillis();

							if (method419(var3.field611, var3.field610)) {
								field1200 = field1202[var1];
								field1110 = field1144[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method468()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1199[var1] != -5) {
					field1199[var1] = -5;
				} else {
					field1206--;
					for (int var5 = var1; var5 < field1206; var5++) {
						field1202[var5] = field1202[var5 + 1];
						field1144[var5] = field1144[var5 + 1];
						field1199[var5] = field1199[var5 + 1];
					}

					var1--;
				}
			} else {
				field1199[var1]--;
			}
		}

		if (field1190 > 0) {
			field1190 -= 20;
			if (field1190 < 0) {
				field1190 = 0;
			}

			if (field1190 == 0 && field1047 && !field1074) {
				field1068 = field1039;
				field1069 = false;
				field1237.method279(2, field1068);
				return;
			}
		}
	}

	@ObfuscatedName("client.u(B)V")
	public final void method538() {
		for (class31 var1 = (class31) field1219.method250(); var1 != null; var1 = (class31) field1219.method252()) {
			if (field1174 != var1.field447 || field1256 > var1.field453) {
				var1.method118();
			} else if (field1256 >= var1.field452) {
				if (var1.field456 > 0) {
					class27 var2 = field1231[var1.field456 - 1];
					if (var2 != null) {
						var1.method129(method520(var1.field447, var2.field360, var2.field359) - var1.field451, var2.field360, field1256, var2.field359);
					}
				}

				if (var1.field456 < 0) {
					int var3 = -var1.field456 - 1;
					class28 var4;
					if (field1038 == var3) {
						var4 = field1145;
					} else {
						var4 = field1289[var3];
					}

					if (var4 != null) {
						var1.method129(method520(var1.field447, var4.field360, var4.field359) - var1.field451, var4.field360, field1256, var4.field359);
					}
				}

				var1.method130(field1159);
				field995.method73(false, -1, (int) var1.field460, 60, field1174, var1.field466, var1, (int) var1.field458, (int) var1.field459);
			}
		}
	}

	@ObfuscatedName("client.b(Lmb;II)V")
	public final void method539(class39 arg0, int arg1) {
		field1146 = 0;
		field1292 = 0;
		method511(arg1, arg0);
		method453(arg1, arg0);
		method543(arg1, arg0);

		for (int var3 = 0; var3 < field1146; var3++) {
			int var4 = field1147[var3];
			if (field1256 != field1231[var4].field403) {
				field1231[var4].field411 = null;
				field1231[var4] = null;
			}
		}

		if (arg0.field611 != arg1) {
			signlink.reporterror(field1347 + " size mismatch in getnpcpos - pos:" + arg0.field611 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1232; var5++) {
			if (field1231[field1233[var5]] == null) {
				signlink.reporterror(field1347 + " null entry in npc list - pos:" + var5 + " size:" + field1232);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIILbb;I)V")
	public final void method540(int arg0, int arg1, int arg2, class28 arg3) {
		if (field1145 != arg3 && field1295 < 400) {
			String var5 = arg3.field412 + method478(field1145.field418, arg3.field418) + " (level-" + arg3.field418 + ")";
			if (field1275 == 1) {
				field1079[field1295] = "Use " + field1279 + " with @whi@" + var5;
				field1328[field1295] = 367;
				field1329[field1295] = arg2;
				field1326[field1295] = arg0;
				field1327[field1295] = arg1;
				field1295++;
			} else if (field1301 != 1) {
				field1079[field1295] = "Follow @whi@" + var5;
				field1328[field1295] = 1544;
				field1329[field1295] = arg2;
				field1326[field1295] = arg0;
				field1327[field1295] = arg1;
				field1295++;
				if (field1286 == 0) {
					field1079[field1295] = "Trade with @whi@" + var5;
					field1328[field1295] = 1373;
					field1329[field1295] = arg2;
					field1326[field1295] = arg0;
					field1327[field1295] = arg1;
					field1295++;
				}

				if (field1306 > 0) {
					field1079[field1295] = "Attack @whi@" + var5;

					if (field1145.field418 >= arg3.field418) {
						field1328[field1295] = 151;
					} else {
						field1328[field1295] = 2151;
					}

					field1329[field1295] = arg2;
					field1326[field1295] = arg0;
					field1327[field1295] = arg1;
					field1295++;
				}

				if (field1265 == 1) {
					field1079[field1295] = "Fight @whi@" + var5;
					field1328[field1295] = 151;
					field1329[field1295] = arg2;
					field1326[field1295] = arg0;
					field1327[field1295] = arg1;
					field1295++;
				}

				if (field1265 == 2) {
					field1079[field1295] = "Duel-with @whi@" + var5;
					field1328[field1295] = 1101;
					field1329[field1295] = arg2;
					field1326[field1295] = arg0;
					field1327[field1295] = arg1;
					field1295++;
				}
			} else if ((field1303 & 0x8) == 8) {
				field1079[field1295] = field1304 + " @whi@" + var5;
				field1328[field1295] = 651;
				field1329[field1295] = arg2;
				field1326[field1295] = arg0;
				field1327[field1295] = arg1;
				field1295++;
			}

			for (int var6 = 0; var6 < field1295; var6++) {
				if (field1328[var6] == 660) {
					field1079[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)Ljava/net/Socket;")
	public final Socket method541(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.E(I)V")
	public final void method542() {
		if (field1355 > 0) {
			method459();
		} else {
			field1156.method260();
			field1249.method206("Connection lost", 257, 144, 0);
			field1249.method206("Connection lost", 256, 143, 0xFFFFFF);
			field1249.method206("Please wait - attempting to reestablish", 257, 159, 0);
			field1249.method206("Please wait - attempting to reestablish", 256, 158, 0xFFFFFF);
			field1156.method261(8, field9, 11);
			field1175 = 0;
			class5 var1 = field1359;
			field1382 = false;
			method418(field1347, field1348, true);

			if (!field1382) {
				method459();
			}

			try {
				var1.method37();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;Z)V")
	public final void method543(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1292; var3++) {
			int var4 = field1293[var3];
			class27 var5 = field1231[var4];
			int var6 = arg1.method231();
			if ((var6 & 0x2) == 2) {
				int var7 = arg1.method233();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field386 == var7) {
					var5.field390 = 0;
				}

				int var8 = arg1.method231();
				if (var7 == -1 || var5.field386 == -1 || class65.field946[var7].field954 > class65.field946[var5.field386].field954 || class65.field946[var5.field386].field954 == 0) {
					var5.field386 = var7;
					var5.field387 = 0;
					var5.field388 = 0;
					var5.field389 = var8;
					var5.field390 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field380 = arg1.method233();
				if (var5.field380 == 0xFFFF) {
					var5.field380 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field371 = arg1.method238();
				var5.field372 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field375 = arg1.method231();
				var5.field376 = arg1.method231();
				var5.field377 = field1256 + 400;
				var5.field378 = arg1.method231();
				var5.field379 = arg1.method231();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field411 = class58.method333(arg1.method233());
				var5.field366 = var5.field411.field850;
				var5.field367 = var5.field411.field851;
				var5.field368 = var5.field411.field852;
				var5.field369 = var5.field411.field853;
				var5.field364 = var5.field411.field849;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field391 = arg1.method233();
				int var9 = arg1.method236();
				var5.field395 = var9 >> 16;
				var5.field394 = (var9 & 0xFFFF) + field1256;
				var5.field392 = 0;
				var5.field393 = 0;

				if (var5.field394 > field1256) {
					var5.field392 = -1;
				}

				if (var5.field391 == 0xFFFF) {
					var5.field391 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field381 = arg1.method233();
				var5.field382 = arg1.method233();
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method544() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.d(B)V")
	public final void method10() {
		field1210 = true;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method545() {
		if (field1275 == 0 && field1301 == 0) {
			field1079[field1295] = "Walk here";
			field1328[field1295] = 660;
			field1326[field1295] = field16;
			field1327[field1295] = field17;
			field1295++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class32.field537; var2++) {
			int var3 = class32.field538[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field995.method92(field1174, var4, var5, var3) >= 0) {
					class57 var8 = class57.method324(var7);
					if (field1275 == 1) {
						field1079[field1295] = "Use " + field1279 + " with @cya@" + var8.field806;
						field1328[field1295] = 450;
						field1329[field1295] = var3;
						field1326[field1295] = var4;
						field1327[field1295] = var5;
						field1295++;
					} else if (field1301 != 1) {
						if (var8.field822 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field822[var9] != null) {
									field1079[field1295] = var8.field822[var9] + " @cya@" + var8.field806;

									if (var9 == 0) {
										field1328[field1295] = 285;
									}

									if (var9 == 1) {
										field1328[field1295] = 504;
									}

									if (var9 == 2) {
										field1328[field1295] = 364;
									}

									if (var9 == 3) {
										field1328[field1295] = 581;
									}

									if (var9 == 4) {
										field1328[field1295] = 1501;
									}

									field1329[field1295] = var3;
									field1326[field1295] = var4;
									field1327[field1295] = var5;
									field1295++;
								}
							}
						}

						field1079[field1295] = "Examine @cya@" + var8.field806;
						field1328[field1295] = 1175;
						field1329[field1295] = var3;
						field1326[field1295] = var4;
						field1327[field1295] = var5;
						field1295++;
					} else if ((field1303 & 0x4) == 4) {
						field1079[field1295] = field1304 + " @cya@" + var8.field806;
						field1328[field1295] = 55;
						field1329[field1295] = var3;
						field1326[field1295] = var4;
						field1327[field1295] = var5;
						field1295++;
					}
				}

				if (var6 == 1) {
					class27 var10 = field1231[var7];
					if (var10.field411.field846 == 1 && (var10.field359 & 0x7F) == 0x40 && (var10.field360 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1232; var11++) {
							class27 var12 = field1231[field1233[var11]];
							if (var12 != null && var10 != var12 && var12.field411.field846 == 1 && var10.field359 == var12.field359 && var10.field360 == var12.field360) {
								method535(var5, field1233[var11], var12.field411, var4);
							}
						}
					}

					method535(var5, var7, var10.field411, var4);
				}

				if (var6 == 0) {
					class28 var13 = field1289[var7];
					if ((var13.field359 & 0x7F) == 0x40 && (var13.field360 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1232; var14++) {
							class27 var15 = field1231[field1233[var14]];
							if (var15 != null && var15.field411.field846 == 1 && var13.field359 == var15.field359 && var13.field360 == var15.field360) {
								method535(var5, field1233[var14], var15.field411, var4);
							}
						}

						for (int var16 = 0; var16 < field1290; var16++) {
							class28 var17 = field1289[field1291[var16]];
							if (var17 != null && var13 != var17 && var13.field359 == var17.field359 && var13.field360 == var17.field360) {
								method540(var4, var5, field1291[var16], var17);
							}
						}
					}

					method540(var4, var5, var7, var13);
				}

				if (var6 == 3) {
					class42 var18 = field1349[field1174][var4][var5];
					if (var18 != null) {
						for (class30 var19 = (class30) var18.method251(); var19 != null; var19 = (class30) var18.method253()) {
							class59 var20 = class59.method339(var19.field444);
							if (field1275 == 1) {
								field1079[field1295] = "Use " + field1279 + " with @lre@" + var20.field874;
								field1328[field1295] = 217;
								field1329[field1295] = var19.field444;
								field1326[field1295] = var4;
								field1327[field1295] = var5;
								field1295++;
							} else if (field1301 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field888 != null && var20.field888[var21] != null) {
										field1079[field1295] = var20.field888[var21] + " @lre@" + var20.field874;

										if (var21 == 0) {
											field1328[field1295] = 224;
										}

										if (var21 == 1) {
											field1328[field1295] = 993;
										}

										if (var21 == 2) {
											field1328[field1295] = 99;
										}

										if (var21 == 3) {
											field1328[field1295] = 746;
										}

										if (var21 == 4) {
											field1328[field1295] = 877;
										}

										field1329[field1295] = var19.field444;
										field1326[field1295] = var4;
										field1327[field1295] = var5;
										field1295++;
									} else if (var21 == 2) {
										field1079[field1295] = "Take @lre@" + var20.field874;
										field1328[field1295] = 99;
										field1329[field1295] = var19.field444;
										field1326[field1295] = var4;
										field1327[field1295] = var5;
										field1295++;
									}
								}

								field1079[field1295] = "Examine @lre@" + var20.field874;
								field1328[field1295] = 1102;
								field1329[field1295] = var19.field444;
								field1326[field1295] = var4;
								field1327[field1295] = var5;
								field1295++;
							} else if ((field1303 & 0x1) == 1) {
								field1079[field1295] = field1304 + " @lre@" + var20.field874;
								field1328[field1295] = 965;
								field1329[field1295] = var19.field444;
								field1326[field1295] = var4;
								field1327[field1295] = var5;
								field1295++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method546() {
		field1155.method260();
		int var1 = field1377 + field1268 & 0x7FF;
		int var2 = field1145.field359 / 32 + 48;
		int var3 = 464 - field1145.field360 / 32;
		field1177.method196(var3, var2, 146, 151, 9, field1261, 21, field1025, var1, field1262 + 256);
		field1325.method196(25, 25, 33, 33, 0, field1046, 0, field1305, field1377, 256);

		for (int var4 = 0; var4 < field1020; var4++) {
			int var5 = field1021[var4] * 4 + 2 - field1145.field359 / 32;
			int var6 = field1022[var4] * 4 + 2 - field1145.field360 / 32;
			method522(field1384[var4], var5, var6);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1349[field1174][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1145.field359 / 32;
					int var11 = var8 * 4 + 2 - field1145.field360 / 32;
					method522(field1238, var10, var11);
				}
			}
		}

		for (int var12 = 0; var12 < field1232; var12++) {
			class27 var13 = field1231[field1233[var12]];
			if (var13 != null && var13.method124() && var13.field411.field861) {
				int var14 = var13.field359 / 32 - field1145.field359 / 32;
				int var15 = var13.field360 / 32 - field1145.field360 / 32;
				method522(field1239, var14, var15);
			}
		}

		for (int var16 = 0; var16 < field1290; var16++) {
			class28 var17 = field1289[field1291[var16]];
			if (var17 != null && var17.method124()) {
				int var18 = var17.field359 / 32 - field1145.field359 / 32;
				int var19 = var17.field360 / 32 - field1145.field360 / 32;
				boolean var20 = false;
				long var21 = class52.method300(var17.field412);
				for (int var23 = 0; var23 < field1196; var23++) {
					if (field1095[var23] == var21 && field1323[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method522(field1241, var18, var19);
				} else {
					method522(field1240, var18, var19);
				}
			}
		}

		if (field1175 != 0) {
			int var24 = field1175 * 4 + 2 - field1145.field359 / 32;
			int var25 = field1176 * 4 + 2 - field1145.field360 / 32;
			method522(field1019, var24, var25);
		}

		class34.method165(3, 82, 3, 93, 0xFFFFFF);
		field1156.method260();
	}

	@ObfuscatedName("client.c(Lmb;II)V")
	public final void method547(class39 arg0, int arg1) {
		if (arg1 == 112 || arg1 == 31) {
			int var3 = arg0.method231();
			int var4 = (var3 >> 4 & 0x7) + field1152;
			int var5 = (var3 & 0x7) + field1153;
			int var6 = arg0.method231();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1111[var7];
			int var10;
			if (arg1 == 31) {
				var10 = -1;
			} else {
				var10 = arg0.method233();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method465(var7, var8, -1, 0, var9, var10, var5, field1174, var4);
			}
		} else if (arg1 == 230) {
			int var11 = arg0.method231();
			int var12 = (var11 >> 4 & 0x7) + field1152;
			int var13 = (var11 & 0x7) + field1153;
			int var14 = arg0.method231();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1111[var15];
			int var18 = arg0.method233();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1082[field1174][var12][var13];
				int var20 = field1082[field1174][var12 + 1][var13];
				int var21 = field1082[field1174][var12 + 1][var13 + 1];
				int var22 = field1082[field1174][var12][var13 + 1];
				if (var17 == 0) {
					class18 var23 = field995.method84(var13, var12, field1174);
					if (var23 != null) {
						int var24 = var23.field255 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field253 = new class29(2, var24, var21, var18, var16 + 4, false, var20, var22, var19);
							var23.field254 = new class29(2, var24, var21, var18, var16 + 1 & 0x3, false, var20, var22, var19);
						} else {
							var23.field253 = new class29(var15, var24, var21, var18, var16, false, var20, var22, var19);
						}
					}
				}

				if (var17 == 1) {
					class9 var25 = field995.method85(field1174, var12, var13);
					if (var25 != null) {
						var25.field146 = new class29(4, var25.field147 >> 14 & 0x7FFF, var21, var18, 0, false, var20, var22, var19);
					}
				}

				if (var17 == 2) {
					class17 var26 = field995.method86(var12, var13, field1174);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field238 = new class29(var15, var26.field246 >> 14 & 0x7FFF, var21, var18, var16, false, var20, var22, var19);
					}
				}

				if (var17 == 3) {
					class11 var27 = field995.method87(var13, var12, field1174);
					if (var27 != null) {
						var27.field177 = new class29(22, var27.field178 >> 14 & 0x7FFF, var21, var18, var16, false, var20, var22, var19);
					}
				}
			}
		} else if (arg1 == 167) {
			int var28 = arg0.method231();
			int var29 = (var28 >> 4 & 0x7) + field1152;
			int var30 = (var28 & 0x7) + field1153;
			int var31 = arg0.method233();
			int var32 = arg0.method233();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class30 var33 = new class30();
				var33.field444 = var31;
				var33.field445 = var32;

				if (field1349[field1174][var29][var30] == null) {
					field1349[field1174][var29][var30] = new class42();
				}

				field1349[field1174][var29][var30].method247(var33);
				method530(var29, var30);
			}
		} else if (arg1 == 247) {
			int var34 = arg0.method231();
			int var35 = (var34 >> 4 & 0x7) + field1152;
			int var36 = (var34 & 0x7) + field1153;
			int var37 = arg0.method233();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1349[field1174][var35][var36];
				if (var38 != null) {
					for (class30 var39 = (class30) var38.method250(); var39 != null; var39 = (class30) var38.method252()) {
						if ((var37 & 0x7FFF) == var39.field444) {
							var39.method118();
							break;
						}
					}

					if (var38.method250() == null) {
						field1349[field1174][var35][var36] = null;
					}

					method530(var35, var36);
				}
			}
		} else if (arg1 == 67) {
			int var40 = arg0.method231();
			int var41 = (var40 >> 4 & 0x7) + field1152;
			int var42 = (var40 & 0x7) + field1153;
			int var43 = var41 + arg0.method232();
			int var44 = var42 + arg0.method232();
			int var45 = arg0.method234();
			int var46 = arg0.method233();
			int var47 = arg0.method231();
			int var48 = arg0.method231();
			int var49 = arg0.method233();
			int var50 = arg0.method233();
			int var51 = arg0.method231();
			int var52 = arg0.method231();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class31 var53 = new class31(field1256 + var50, var48, var41, var46, var52, method520(field1174, var42, var41) - var47, var42, field1256 + var49, var51, field1174, var45);
				var53.method129(method520(field1174, var44, var43) - var48, var44, field1256 + var49, var43);
				field1219.method247(var53);
			}
		} else if (arg1 == 215) {
			int var54 = arg0.method231();
			int var55 = (var54 >> 4 & 0x7) + field1152;
			int var56 = (var54 & 0x7) + field1153;
			int var57 = arg0.method233();
			int var58 = arg0.method231();
			int var59 = arg0.method233();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class33 var60 = new class33(var56, var55, var57, field1256, var59, method520(field1174, var56, var55) - var58, field1174);
				field1389.method247(var60);
			}
		} else if (arg1 == 131) {
			int var61 = arg0.method231();
			int var62 = (var61 >> 4 & 0x7) + field1152;
			int var63 = (var61 & 0x7) + field1153;
			int var64 = arg0.method233();
			int var65 = arg0.method233();
			int var66 = arg0.method233();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1038 != var66) {
				class30 var67 = new class30();
				var67.field444 = var64;
				var67.field445 = var65;

				if (field1349[field1174][var62][var63] == null) {
					field1349[field1174][var62][var63] = new class42();
				}

				field1349[field1174][var62][var63].method247(var67);
				method530(var62, var63);
			}
		} else if (arg1 == 248) {
			int var68 = arg0.method231();
			int var69 = (var68 >> 4 & 0x7) + field1152;
			int var70 = (var68 & 0x7) + field1153;
			int var71 = arg0.method231();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1111[var72];
			int var75 = arg0.method233();
			int var76 = arg0.method233();
			int var77 = arg0.method233();
			int var78 = arg0.method233();
			byte var79 = arg0.method232();
			byte var80 = arg0.method232();
			byte var81 = arg0.method232();
			byte var82 = arg0.method232();
			class28 var83;
			if (field1038 == var78) {
				var83 = field1145;
			} else {
				var83 = field1289[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method324(var75);
				int var85 = field1082[field1174][var69][var70];
				int var86 = field1082[field1174][var69 + 1][var70];
				int var87 = field1082[field1174][var69 + 1][var70 + 1];
				int var88 = field1082[field1174][var69][var70 + 1];
				class32 var89 = var84.method330(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method465(0, 0, var77 + 1, var76 + 1, var74, -1, var70, field1174, var69);
					var83.field421 = field1256 + var76;
					var83.field422 = field1256 + var77;
					var83.field426 = var89;
					int var90 = var84.field810;
					int var91 = var84.field811;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field811;
						var91 = var84.field810;
					}

					var83.field423 = var69 * 128 + var90 * 64;
					var83.field425 = var70 * 128 + var91 * 64;
					var83.field424 = method520(field1174, var83.field425, var83.field423);

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

					var83.field427 = var69 + var79;
					var83.field429 = var69 + var81;
					var83.field428 = var70 + var80;
					var83.field430 = var70 + var82;
				}
			}
		} else if (arg1 == 246) {
			int var94 = arg0.method231();
			int var95 = (var94 >> 4 & 0x7) + field1152;
			int var96 = (var94 & 0x7) + field1153;
			int var97 = arg0.method233();
			int var98 = arg0.method233();
			int var99 = arg0.method233();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1349[field1174][var95][var96];
				if (var100 != null) {
					for (class30 var101 = (class30) var100.method250(); var101 != null; var101 = (class30) var100.method252()) {
						if ((var97 & 0x7FFF) == var101.field444 && var101.field445 == var98) {
							var101.field445 = var99;
							break;
						}
					}

					method530(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field1322 && !field1059 && !field1383) {
			field1256++;

			if (field1382) {
				method492();
			} else {
				method491();
			}

			method450();
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method548() {
		if (field1145.field359 >> 7 == field1175 && field1145.field360 >> 7 == field1176) {
			field1175 = 0;
		}

		for (int var1 = -1; var1 < field1290; var1++) {
			class28 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1145;
				var3 = field1288 << 14;
			} else {
				var2 = field1289[field1291[var1]];
				var3 = field1291[var1] << 14;
			}

			if (var2 != null && var2.method124()) {
				var2.field431 = false;
				if ((field1074 && field1290 > 50 || field1290 > 200) && var1 != -1 && var2.field383 == var2.field364) {
					var2.field431 = true;
				}

				int var4 = var2.field359 >> 7;
				int var5 = var2.field360 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field426 == null || field1256 < var2.field421 || field1256 >= var2.field422) {
						if ((var2.field359 & 0x7F) == 0x40 && (var2.field360 & 0x7F) == 0x40) {
							if (field1391[var4][var5] == field1266) {
								continue;
							}

							field1391[var4][var5] = field1266;
						}

						var2.field420 = method520(field1174, var2.field360, var2.field359);
						field995.method73(var2.field362, var3, var2.field420, 60, field1174, var2.field361, var2, var2.field359, var2.field360);
					} else {
						var2.field431 = false;
						var2.field420 = method520(field1174, var2.field360, var2.field359);
						field995.method74(field1174, var2.field428, var3, var2.field361, var2.field359, var2.field427, var2.field429, var2.field430, var2, var2.field360, var2.field420, 60);
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
			field1363[var1] = var0 / 4;
		}
	}
}
