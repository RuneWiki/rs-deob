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
	public class36 field1044;

	@ObfuscatedName("client.bb")
	public class36 field1045;

	@ObfuscatedName("client.cb")
	public class36 field1046;

	@ObfuscatedName("client.db")
	public class36 field1047;

	@ObfuscatedName("client.eb")
	public boolean field1048 = false;

	@ObfuscatedName("client.fb")
	public int[] field1049 = new int[50];

	@ObfuscatedName("client.gb")
	public int field1050;

	@ObfuscatedName("client.hb")
	public int field1051;

	@ObfuscatedName("client.ib")
	public int field1052;

	@ObfuscatedName("client.jb")
	public static final int[][] field1053 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.kb")
	public int field1054 = -1;

	@ObfuscatedName("client.lb")
	public int field1055 = 128;

	@ObfuscatedName("client.mb")
	public int field1056;

	@ObfuscatedName("client.nb")
	public int field1057;

	@ObfuscatedName("client.ob")
	public int field1058;

	@ObfuscatedName("client.pb")
	public int field1059;

	@ObfuscatedName("client.qb")
	public static BigInteger field1060 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.rb")
	public int[] field1061;

	@ObfuscatedName("client.sb")
	public int[] field1062;

	@ObfuscatedName("client.tb")
	public int[] field1063;

	@ObfuscatedName("client.ub")
	public byte[][] field1064;

	@ObfuscatedName("client.vb")
	public int field1065;

	@ObfuscatedName("client.wb")
	public int field1066;

	@ObfuscatedName("client.xb")
	public long field1067;

	@ObfuscatedName("client.yb")
	public int field1068;

	@ObfuscatedName("client.zb")
	public int field1069;

	@ObfuscatedName("client.ac")
	public boolean field1094 = false;

	@ObfuscatedName("client.bc")
	public int field1095 = -1;

	@ObfuscatedName("client.cc")
	public int[] field1096 = new int[2000];

	@ObfuscatedName("client.dc")
	public int field1097;

	@ObfuscatedName("client.ec")
	public boolean field1098 = false;

	@ObfuscatedName("client.hc")
	public int field1099;

	@ObfuscatedName("client.ic")
	public int field1100;

	@ObfuscatedName("client.jc")
	public int field1101;

	@ObfuscatedName("client.kc")
	public int field1102;

	@ObfuscatedName("client.lc")
	public int field1103;

	@ObfuscatedName("client.mc")
	public int field1104;

	@ObfuscatedName("client.nc")
	public int field1105;

	@ObfuscatedName("client.oc")
	public int field1106;

	@ObfuscatedName("client.pc")
	public class36 field1107;

	@ObfuscatedName("client.qc")
	public class36 field1108;

	@ObfuscatedName("client.K")
	public boolean field1030 = false;

	@ObfuscatedName("client.L")
	public int field1031 = -1;

	@ObfuscatedName("client.O")
	public boolean field1034 = false;

	@ObfuscatedName("client.R")
	public String field1035 = "";

	@ObfuscatedName("client.S")
	public String field1036 = "";

	@ObfuscatedName("client.V")
	public int field1039 = 2;

	@ObfuscatedName("client.W")
	public int[] field1040 = new int[50];

	@ObfuscatedName("client.X")
	public class39 field1041 = class39.method225(1);

	@ObfuscatedName("client.Y")
	public int field1042 = -1;

	@ObfuscatedName("client.Z")
	public int[][] field1043 = new int[104][104];

	@ObfuscatedName("client.Eb")
	public int field1073 = -1;

	@ObfuscatedName("client.Kb")
	public class4 field1078 = new class4();

	@ObfuscatedName("client.Nb")
	public int field1081 = -1;

	@ObfuscatedName("client.Pb")
	public int field1083 = 0x4D4233;

	@ObfuscatedName("client.Sb")
	public int[] field1086 = new int[33];

	@ObfuscatedName("client.Wb")
	public int[] field1090 = new int[7];

	@ObfuscatedName("client.Xb")
	public String field1091 = "";

	@ObfuscatedName("client.Yb")
	public class36[] field1092 = new class36[8];

	@ObfuscatedName("client.Zb")
	public boolean field1093 = false;

	@ObfuscatedName("client.sc")
	public int[] field1110 = new int[5];

	@ObfuscatedName("client.vc")
	public boolean field1112 = false;

	@ObfuscatedName("client.Ec")
	public class42[][][] field1119 = new class42[4][104][104];

	@ObfuscatedName("client.Gc")
	public int[] field1121 = new int[5];

	@ObfuscatedName("client.Jc")
	public int[] field1124 = new int[151];

	@ObfuscatedName("client.Sc")
	public boolean[] field1131 = new boolean[5];

	@ObfuscatedName("client.Vc")
	public class49[] field1132 = new class49[5];

	@ObfuscatedName("client.Wc")
	public class37[] field1133 = new class37[50];

	@ObfuscatedName("client.Xc")
	public String field1134 = "";

	@ObfuscatedName("client.Yc")
	public boolean field1135 = false;

	@ObfuscatedName("client.fd")
	public int[] field1140 = new int[5];

	@ObfuscatedName("client.od")
	public class36[] field1149 = new class36[20];

	@ObfuscatedName("client.qd")
	public class39 field1150 = class39.method225(1);

	@ObfuscatedName("client.rd")
	public int[] field1151 = new int[256];

	@ObfuscatedName("client.wd")
	public int[][] field1156 = new int[104][104];

	@ObfuscatedName("client.Ad")
	public int[] field1159 = new int[1000];

	@ObfuscatedName("client.Bd")
	public int[] field1160 = new int[1000];

	@ObfuscatedName("client.Ed")
	public boolean field1163 = false;

	@ObfuscatedName("client.Fd")
	public int field1164 = -1;

	@ObfuscatedName("client.Gd")
	public int field1165 = -1;

	@ObfuscatedName("client.Nd")
	public int field1172 = -1;

	@ObfuscatedName("client.Od")
	public class42 field1173 = new class42();

	@ObfuscatedName("client.be")
	public int field1184 = 78;

	@ObfuscatedName("client.ee")
	public int field1187 = -1;

	@ObfuscatedName("client.ge")
	public CRC32 field1189 = new CRC32();

	@ObfuscatedName("client.ie")
	public boolean field1190 = false;

	@ObfuscatedName("client.je")
	public long[] field1191 = new long[200];

	@ObfuscatedName("client.ke")
	public boolean field1192 = false;

	@ObfuscatedName("client.me")
	public final int field1194 = 100;

	@ObfuscatedName("client.ne")
	public int[] field1195 = new int[100];

	@ObfuscatedName("client.ve")
	public int field1201 = 1;

	@ObfuscatedName("client.we")
	public boolean field1202 = false;

	@ObfuscatedName("client.xe")
	public String[] field1203 = new String[500];

	@ObfuscatedName("client.ye")
	public int[] field1204 = new int[100];

	@ObfuscatedName("client.ze")
	public String[] field1205 = new String[100];

	@ObfuscatedName("client.Ae")
	public String[] field1206 = new String[100];

	@ObfuscatedName("client.Be")
	public boolean field1207 = false;

	@ObfuscatedName("client.Ce")
	public String field1208 = "";

	@ObfuscatedName("client.He")
	public int[] field1213 = new int[4000];

	@ObfuscatedName("client.Ie")
	public int[] field1214 = new int[4000];

	@ObfuscatedName("client.Ke")
	public int[] field1215 = new int[5];

	@ObfuscatedName("client.Le")
	public int field1216 = 0x766654;

	@ObfuscatedName("client.ff")
	public boolean field1235 = false;

	@ObfuscatedName("client.jf")
	public boolean field1238 = false;

	@ObfuscatedName("client.pf")
	public boolean field1244 = true;

	@ObfuscatedName("client.qf")
	public String field1245 = "";

	@ObfuscatedName("client.Af")
	public int[] field1255 = new int[50];

	@ObfuscatedName("client.Bf")
	public int[] field1256 = new int[5];

	@ObfuscatedName("client.Hf")
	public class42 field1262 = new class42();

	@ObfuscatedName("client.If")
	public class42 field1263 = new class42();

	@ObfuscatedName("client.Kf")
	public int field1265 = 3;

	@ObfuscatedName("client.Lf")
	public int field1266 = -1;

	@ObfuscatedName("client.Nf")
	public int field1268 = 1;

	@ObfuscatedName("client.Pf")
	public boolean field1269 = false;

	@ObfuscatedName("client.Qf")
	public int[] field1270 = new int[200];

	@ObfuscatedName("client.Tf")
	public int field1273 = 50;

	@ObfuscatedName("client.Uf")
	public int[] field1274 = new int[field1273];

	@ObfuscatedName("client.Vf")
	public int[] field1275 = new int[field1273];

	@ObfuscatedName("client.Wf")
	public int[] field1276 = new int[field1273];

	@ObfuscatedName("client.Xf")
	public int[] field1277 = new int[field1273];

	@ObfuscatedName("client.Yf")
	public int[] field1278 = new int[field1273];

	@ObfuscatedName("client.Zf")
	public int[] field1279 = new int[field1273];

	@ObfuscatedName("client.ag")
	public int[] field1280 = new int[field1273];

	@ObfuscatedName("client.bg")
	public String[] field1281 = new String[field1273];

	@ObfuscatedName("client.gg")
	public int[] field1283 = new int[2000];

	@ObfuscatedName("client.ig")
	public int field1285 = 2;

	@ObfuscatedName("client.lg")
	public int[] field1287 = new int[33];

	@ObfuscatedName("client.mg")
	public boolean field1288 = false;

	@ObfuscatedName("client.og")
	public class27[] field1290 = new class27[8192];

	@ObfuscatedName("client.qg")
	public int[] field1292 = new int[8192];

	@ObfuscatedName("client.yg")
	public int field1300 = 0x332D25;

	@ObfuscatedName("client.Ag")
	public boolean field1302 = false;

	@ObfuscatedName("client.Fg")
	public int[] field1306 = new int[50];

	@ObfuscatedName("client.Lg")
	public class36[] field1312 = new class36[20];

	@ObfuscatedName("client.Ng")
	public class36[] field1314 = new class36[1000];

	@ObfuscatedName("client.Ug")
	public int[] field1321 = new int[9];

	@ObfuscatedName("client.Xg")
	public int[] field1323 = new int[151];

	@ObfuscatedName("client.Zg")
	public boolean field1325 = false;

	@ObfuscatedName("client.bh")
	public int field1327 = 2048;

	@ObfuscatedName("client.ch")
	public int field1328 = 2047;

	@ObfuscatedName("client.dh")
	public class28[] field1329 = new class28[field1327];

	@ObfuscatedName("client.fh")
	public int[] field1331 = new int[field1327];

	@ObfuscatedName("client.hh")
	public int[] field1333 = new int[field1327];

	@ObfuscatedName("client.ih")
	public class39[] field1334 = new class39[field1327];

	@ObfuscatedName("client.lh")
	public boolean field1337 = false;

	@ObfuscatedName("client.mh")
	public long[] field1338 = new long[100];

	@ObfuscatedName("client.sh")
	public String[] field1344 = new String[200];

	@ObfuscatedName("client.th")
	public boolean field1345 = true;

	@ObfuscatedName("client.uh")
	public int[] field1346 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.vh")
	public int[] field1347 = new int[500];

	@ObfuscatedName("client.wh")
	public int[] field1348 = new int[500];

	@ObfuscatedName("client.xh")
	public int[] field1349 = new int[500];

	@ObfuscatedName("client.yh")
	public int[] field1350 = new int[500];

	@ObfuscatedName("client.Bh")
	public class39 field1352 = class39.method225(1);

	@ObfuscatedName("client.Gh")
	public int[] field1356 = new int[50];

	@ObfuscatedName("client.Jh")
	public int[] field1359 = new int[1000];

	@ObfuscatedName("client.Mh")
	public boolean field1361 = true;

	@ObfuscatedName("client.ai")
	public String field1375 = "";

	@ObfuscatedName("client.bi")
	public String field1376 = "";

	@ObfuscatedName("client.ci")
	public class36[] field1377 = new class36[50];

	@ObfuscatedName("client.di")
	public int field1378 = -1;

	@ObfuscatedName("client.ei")
	public class62[] field1379 = new class62[4];

	@ObfuscatedName("client.fi")
	public String field1380 = "";

	@ObfuscatedName("client.ii")
	public class37[] field1383 = new class37[2];

	@ObfuscatedName("client.ji")
	public boolean field1384 = true;

	@ObfuscatedName("client.si")
	public int field1391 = 0x23201B;

	@ObfuscatedName("client.ti")
	public boolean field1392 = false;

	@ObfuscatedName("client.ui")
	public boolean field1393 = false;

	@ObfuscatedName("client.yi")
	public int field1396 = -1;

	@ObfuscatedName("client.Ci")
	public int[] field1400 = new int[50];

	@ObfuscatedName("client.Ii")
	public int field1404 = -1;

	@ObfuscatedName("client.Qi")
	public int field1411 = 2;

	@ObfuscatedName("client.Ui")
	public int[][] field1414 = new int[104][104];

	@ObfuscatedName("client.Wi")
	public boolean field1416 = false;

	@ObfuscatedName("client.aj")
	public final int[] field1420 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.bj")
	public boolean field1421 = false;

	@ObfuscatedName("client.jj")
	public int[] field1428 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.sj")
	public byte[] field1437 = new byte[16384];

	@ObfuscatedName("client.tj")
	public class37[] field1438 = new class37[13];

	@ObfuscatedName("client.Ub")
	public static int[] field1088 = new int[99];

	@ObfuscatedName("client.Nc")
	public static final int[] field1126 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.gf")
	public static String field1236 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Rf")
	public static BigInteger field1271 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.tg")
	public static int field1295 = 10;

	@ObfuscatedName("client.vg")
	public static boolean field1297 = true;

	@ObfuscatedName("client.J")
	public static int field1029;

	@ObfuscatedName("client.M")
	public int field1032;

	@ObfuscatedName("client.N")
	public int field1033;

	@ObfuscatedName("client.U")
	public int field1038;

	@ObfuscatedName("client.Ab")
	public int field1070;

	@ObfuscatedName("client.Bb")
	public int field1071;

	@ObfuscatedName("client.Cb")
	public int field1072;

	@ObfuscatedName("client.Fb")
	public int field1074;

	@ObfuscatedName("client.Lb")
	public int field1079;

	@ObfuscatedName("client.Mb")
	public static int field1080;

	@ObfuscatedName("client.Ob")
	public int field1082;

	@ObfuscatedName("client.Qb")
	public int field1084;

	@ObfuscatedName("client.Tb")
	public static int field1087;

	@ObfuscatedName("client.Vb")
	public int field1089;

	@ObfuscatedName("client.xc")
	public int field1113;

	@ObfuscatedName("client.yc")
	public int field1114;

	@ObfuscatedName("client.zc")
	public int field1115;

	@ObfuscatedName("client.Ac")
	public int field1116;

	@ObfuscatedName("client.Bc")
	public int field1117;

	@ObfuscatedName("client.Dc")
	public int field1118;

	@ObfuscatedName("client.Fc")
	public int field1120;

	@ObfuscatedName("client.Hc")
	public int field1122;

	@ObfuscatedName("client.Zc")
	public int field1136;

	@ObfuscatedName("client.ad")
	public int field1137;

	@ObfuscatedName("client.bd")
	public int field1138;

	@ObfuscatedName("client.cd")
	public int field1139;

	@ObfuscatedName("client.gd")
	public int field1141;

	@ObfuscatedName("client.hd")
	public int field1142;

	@ObfuscatedName("client.id")
	public int field1143;

	@ObfuscatedName("client.jd")
	public int field1144;

	@ObfuscatedName("client.kd")
	public int field1145;

	@ObfuscatedName("client.ld")
	public int field1146;

	@ObfuscatedName("client.sd")
	public int field1152;

	@ObfuscatedName("client.td")
	public int field1153;

	@ObfuscatedName("client.ud")
	public int field1154;

	@ObfuscatedName("client.xd")
	public static int field1157;

	@ObfuscatedName("client.zd")
	public int field1158;

	@ObfuscatedName("client.Cd")
	public int field1161;

	@ObfuscatedName("client.Dd")
	public int field1162;

	@ObfuscatedName("client.Hd")
	public static int field1166;

	@ObfuscatedName("client.Id")
	public int field1167;

	@ObfuscatedName("client.Jd")
	public int field1168;

	@ObfuscatedName("client.Kd")
	public int field1169;

	@ObfuscatedName("client.Ld")
	public int field1170;

	@ObfuscatedName("client.Md")
	public int field1171;

	@ObfuscatedName("client.ae")
	public int field1183;

	@ObfuscatedName("client.ce")
	public int field1185;

	@ObfuscatedName("client.de")
	public int field1186;

	@ObfuscatedName("client.le")
	public static int field1193;

	@ObfuscatedName("client.oe")
	public static int field1196;

	@ObfuscatedName("client.re")
	public int field1198;

	@ObfuscatedName("client.se")
	public int field1199;

	@ObfuscatedName("client.ue")
	public int field1200;

	@ObfuscatedName("client.De")
	public int field1209;

	@ObfuscatedName("client.Ge")
	public int field1212;

	@ObfuscatedName("client.We")
	public int field1226;

	@ObfuscatedName("client.Xe")
	public int field1227;

	@ObfuscatedName("client.Ye")
	public int field1228;

	@ObfuscatedName("client.Ze")
	public int field1229;

	@ObfuscatedName("client.af")
	public int field1230;

	@ObfuscatedName("client.bf")
	public int field1231;

	@ObfuscatedName("client.cf")
	public int field1232;

	@ObfuscatedName("client.df")
	public int field1233;

	@ObfuscatedName("client.ef")
	public int field1234;

	@ObfuscatedName("client.hf")
	public static int field1237;

	@ObfuscatedName("client.of")
	public int field1243;

	@ObfuscatedName("client.rf")
	public int field1246;

	@ObfuscatedName("client.uf")
	public int field1249;

	@ObfuscatedName("client.vf")
	public int field1250;

	@ObfuscatedName("client.wf")
	public int field1251;

	@ObfuscatedName("client.xf")
	public int field1252;

	@ObfuscatedName("client.yf")
	public int field1253;

	@ObfuscatedName("client.Cf")
	public int field1257;

	@ObfuscatedName("client.Df")
	public int field1258;

	@ObfuscatedName("client.Ef")
	public static int field1259;

	@ObfuscatedName("client.Ff")
	public static int field1260;

	@ObfuscatedName("client.Jf")
	public int field1264;

	@ObfuscatedName("client.Mf")
	public int field1267;

	@ObfuscatedName("client.Sf")
	public int field1272;

	@ObfuscatedName("client.hg")
	public int field1284;

	@ObfuscatedName("client.jg")
	public int field1286;

	@ObfuscatedName("client.ng")
	public int field1289;

	@ObfuscatedName("client.pg")
	public int field1291;

	@ObfuscatedName("client.sg")
	public int field1294;

	@ObfuscatedName("client.ug")
	public static int field1296;

	@ObfuscatedName("client.xg")
	public int field1299;

	@ObfuscatedName("client.zg")
	public static int field1301;

	@ObfuscatedName("client.Gg")
	public int field1307;

	@ObfuscatedName("client.Hg")
	public int field1308;

	@ObfuscatedName("client.Ig")
	public int field1309;

	@ObfuscatedName("client.Jg")
	public int field1310;

	@ObfuscatedName("client.Kg")
	public int field1311;

	@ObfuscatedName("client.Mg")
	public int field1313;

	@ObfuscatedName("client.Rg")
	public int field1318;

	@ObfuscatedName("client.Sg")
	public int field1319;

	@ObfuscatedName("client.Tg")
	public int field1320;

	@ObfuscatedName("client.Vg")
	public int field1322;

	@ObfuscatedName("client.Yg")
	public int field1324;

	@ObfuscatedName("client.ah")
	public int field1326;

	@ObfuscatedName("client.eh")
	public int field1330;

	@ObfuscatedName("client.gh")
	public int field1332;

	@ObfuscatedName("client.nh")
	public int field1339;

	@ObfuscatedName("client.oh")
	public int field1340;

	@ObfuscatedName("client.ph")
	public int field1341;

	@ObfuscatedName("client.qh")
	public int field1342;

	@ObfuscatedName("client.rh")
	public int field1343;

	@ObfuscatedName("client.zh")
	public int field1351;

	@ObfuscatedName("client.Ih")
	public int field1358;

	@ObfuscatedName("client.hi")
	public int field1382;

	@ObfuscatedName("client.ri")
	public int field1390;

	@ObfuscatedName("client.zi")
	public static int field1397;

	@ObfuscatedName("client.Ai")
	public int field1398;

	@ObfuscatedName("client.Bi")
	public int field1399;

	@ObfuscatedName("client.Di")
	public static int field1401;

	@ObfuscatedName("client.Ei")
	public static int field1402;

	@ObfuscatedName("client.Fi")
	public int field1403;

	@ObfuscatedName("client.Ki")
	public int field1406;

	@ObfuscatedName("client.Li")
	public int field1407;

	@ObfuscatedName("client.Mi")
	public int field1408;

	@ObfuscatedName("client.Pi")
	public int field1410;

	@ObfuscatedName("client.Ri")
	public int field1412;

	@ObfuscatedName("client.Si")
	public int field1413;

	@ObfuscatedName("client.Vi")
	public int field1415;

	@ObfuscatedName("client.Xi")
	public int field1417;

	@ObfuscatedName("client.Yi")
	public int field1418;

	@ObfuscatedName("client.cj")
	public int field1422;

	@ObfuscatedName("client.dj")
	public int field1423;

	@ObfuscatedName("client.ej")
	public int field1424;

	@ObfuscatedName("client.gj")
	public int field1425;

	@ObfuscatedName("client.hj")
	public static int field1426;

	@ObfuscatedName("client.ij")
	public int field1427;

	@ObfuscatedName("client.kj")
	public static int field1429;

	@ObfuscatedName("client.nj")
	public int field1432;

	@ObfuscatedName("client.oj")
	public int field1433;

	@ObfuscatedName("client.pj")
	public int field1434;

	@ObfuscatedName("client.qj")
	public int field1435;

	@ObfuscatedName("client.rj")
	public static int field1436;

	@ObfuscatedName("client.eg")
	public long field1282;

	@ObfuscatedName("client.rg")
	public long field1293;

	@ObfuscatedName("client.kh")
	public long field1336;

	@ObfuscatedName("client.Ni")
	public long field1409;

	@ObfuscatedName("client.Rb")
	public class19 field1085;

	@ObfuscatedName("client.jh")
	public static class28 field1335;

	@ObfuscatedName("client.T")
	public class36 field1037;

	@ObfuscatedName("client.Hb")
	public class36 field1076;

	@ObfuscatedName("client.Ib")
	public class36 field1077;

	@ObfuscatedName("client.rc")
	public class36 field1109;

	@ObfuscatedName("client.Ic")
	public class36 field1123;

	@ObfuscatedName("client.Ee")
	public class36 field1210;

	@ObfuscatedName("client.Fe")
	public class36 field1211;

	@ObfuscatedName("client.md")
	public class37 field1147;

	@ObfuscatedName("client.nd")
	public class37 field1148;

	@ObfuscatedName("client.Rd")
	public class37 field1174;

	@ObfuscatedName("client.Sd")
	public class37 field1175;

	@ObfuscatedName("client.Td")
	public class37 field1176;

	@ObfuscatedName("client.Ud")
	public class37 field1177;

	@ObfuscatedName("client.Vd")
	public class37 field1178;

	@ObfuscatedName("client.Cg")
	public class37 field1303;

	@ObfuscatedName("client.Dg")
	public class37 field1304;

	@ObfuscatedName("client.Eg")
	public class37 field1305;

	@ObfuscatedName("client.Og")
	public class37 field1315;

	@ObfuscatedName("client.Pg")
	public class37 field1316;

	@ObfuscatedName("client.Qg")
	public class37 field1317;

	@ObfuscatedName("client.ki")
	public class37 field1385;

	@ObfuscatedName("client.li")
	public class37 field1386;

	@ObfuscatedName("client.mi")
	public class37 field1387;

	@ObfuscatedName("client.ni")
	public class37 field1388;

	@ObfuscatedName("client.oi")
	public class37 field1389;

	@ObfuscatedName("client.lj")
	public class37 field1430;

	@ObfuscatedName("client.mj")
	public class37 field1431;

	@ObfuscatedName("client.Oc")
	public class38 field1127;

	@ObfuscatedName("client.Pc")
	public class38 field1128;

	@ObfuscatedName("client.Qc")
	public class38 field1129;

	@ObfuscatedName("client.Rc")
	public class38 field1130;

	@ObfuscatedName("client.Ne")
	public class44 field1217;

	@ObfuscatedName("client.Oe")
	public class44 field1218;

	@ObfuscatedName("client.Pe")
	public class44 field1219;

	@ObfuscatedName("client.Qe")
	public class44 field1220;

	@ObfuscatedName("client.Re")
	public class44 field1221;

	@ObfuscatedName("client.Se")
	public class44 field1222;

	@ObfuscatedName("client.Te")
	public class44 field1223;

	@ObfuscatedName("client.Ue")
	public class44 field1224;

	@ObfuscatedName("client.Ve")
	public class44 field1225;

	@ObfuscatedName("client.kf")
	public class44 field1239;

	@ObfuscatedName("client.lf")
	public class44 field1240;

	@ObfuscatedName("client.mf")
	public class44 field1241;

	@ObfuscatedName("client.nf")
	public class44 field1242;

	@ObfuscatedName("client.Oh")
	public class44 field1363;

	@ObfuscatedName("client.Ph")
	public class44 field1364;

	@ObfuscatedName("client.Qh")
	public class44 field1365;

	@ObfuscatedName("client.Rh")
	public class44 field1366;

	@ObfuscatedName("client.Sh")
	public class44 field1367;

	@ObfuscatedName("client.Th")
	public class44 field1368;

	@ObfuscatedName("client.Uh")
	public class44 field1369;

	@ObfuscatedName("client.Vh")
	public class44 field1370;

	@ObfuscatedName("client.Wh")
	public class44 field1371;

	@ObfuscatedName("client.Xh")
	public class44 field1372;

	@ObfuscatedName("client.Yh")
	public class44 field1373;

	@ObfuscatedName("client.Zh")
	public class44 field1374;

	@ObfuscatedName("client.gi")
	public class48 field1381;

	@ObfuscatedName("client.qe")
	public class50 field1197;

	@ObfuscatedName("client.tc")
	public class51 field1111;

	@ObfuscatedName("client.fe")
	public class58 field1188;

	@ObfuscatedName("client.Mc")
	public class5 field1125;

	@ObfuscatedName("client.vd")
	public String field1155;

	@ObfuscatedName("client.zf")
	public String field1254;

	@ObfuscatedName("client.Gf")
	public String field1261;

	@ObfuscatedName("client.Ji")
	public String field1405;

	@ObfuscatedName("client.Gb")
	public static boolean field1075;

	@ObfuscatedName("client.wg")
	public static boolean field1298;

	@ObfuscatedName("client.Wd")
	public int[] field1179;

	@ObfuscatedName("client.Xd")
	public int[] field1180;

	@ObfuscatedName("client.Yd")
	public int[] field1181;

	@ObfuscatedName("client.Zd")
	public int[] field1182;

	@ObfuscatedName("client.sf")
	public int[] field1247;

	@ObfuscatedName("client.tf")
	public int[] field1248;

	@ObfuscatedName("client.Dh")
	public int[] field1353;

	@ObfuscatedName("client.Eh")
	public int[] field1354;

	@ObfuscatedName("client.Fh")
	public int[] field1355;

	@ObfuscatedName("client.vi")
	public int[] field1394;

	@ObfuscatedName("client.wi")
	public int[] field1395;

	@ObfuscatedName("client.Hh")
	public class37[] field1357;

	@ObfuscatedName("client.Kh")
	public byte[][] field1360;

	@ObfuscatedName("client.Zi")
	public byte[][][] field1419;

	@ObfuscatedName("client.Nh")
	public int[][][] field1362;

	@ObfuscatedName("client.g(I)Ljava/lang/String;")
	public final String method427() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(B)V")
	public void method428() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1082);

		if (field1381 != null) {
			System.out.println("Od-cycle:" + field1381.field747);
		}

		System.out.println("loop-cycle:" + field1259);
		System.out.println("draw-cycle:" + field1426);
		System.out.println("ptype:" + field1340);
		System.out.println("psize:" + field1339);

		if (field1125 != null) {
			field1125.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.a(IIIIIIIIIZII)Z")
	public final boolean method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1156[var14][var15] = 0;
				field1043[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg4;
		field1156[arg10][arg4] = 99;
		field1043[arg10][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1213[var18] = arg10;
		int var35 = var18 + 1;
		field1214[var18] = arg4;
		boolean var20 = false;
		int var21 = field1213.length;
		int[][] var22 = field1379[field1390].field944;
		while (var35 != var19) {
			var16 = field1213[var19];
			var17 = field1214[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field1379[field1390].method368(arg0 - 1, var16, arg7, arg3, var17, arg9)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field1379[field1390].method369(var16, var17, arg0 - 1, arg3, arg7, arg9)) {
					var20 = true;
					break;
				}
			}

			if (arg5 != 0 && arg1 != 0 && field1379[field1390].method370(arg1, arg6, var17, arg9, arg5, var16, arg7)) {
				var20 = true;
				break;
			}

			int var23 = field1043[var16][var17] + 1;
			if (var16 > 0 && field1156[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1213[var35] = var16 - 1;
				field1214[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1156[var16 - 1][var17] = 2;
				field1043[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1156[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1213[var35] = var16 + 1;
				field1214[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1156[var16 + 1][var17] = 8;
				field1043[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1156[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1213[var35] = var16;
				field1214[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1156[var16][var17 - 1] = 1;
				field1043[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1156[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1213[var35] = var16;
				field1214[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1156[var16][var17 + 1] = 4;
				field1043[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1156[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1213[var35] = var16 - 1;
				field1214[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1156[var16 - 1][var17 - 1] = 3;
				field1043[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1156[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1213[var35] = var16 + 1;
				field1214[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1156[var16 + 1][var17 - 1] = 9;
				field1043[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1156[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1213[var35] = var16 - 1;
				field1214[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1156[var16 - 1][var17 + 1] = 6;
				field1043[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1156[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1213[var35] = var16 + 1;
				field1214[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1156[var16 + 1][var17 + 1] = 12;
				field1043[var16 + 1][var17 + 1] = var23;
			}
		}

		field1249 = 0;
		if (!var20) {
			if (arg8) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg7 - var25; var26 <= arg7 + var25; var26++) {
						for (int var27 = arg9 - var25; var27 <= arg9 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1043[var26][var27] < var24) {
								var24 = field1043[var26][var27];
								var16 = var26;
								var17 = var27;
								field1249 = 1;
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
		field1213[var28] = var16;
		int var36 = var28 + 1;
		field1214[var28] = var17;
		int var29;
		int var30 = var29 = field1156[var16][var17];
		while (arg10 != var16 || arg4 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1213[var36] = var16;
				field1214[var36++] = var17;
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

			var30 = field1156[var16][var17];
		}

		if (var36 <= 0) {
			if (arg2 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1213[var36];
		int var33 = field1214[var36];

		if (arg2 == 0) {
			field1041.method227(182);
			field1041.method228(var31 + var31 + 3);
		}

		if (arg2 == 1) {
			field1041.method227(198);
			field1041.method228(var31 + var31 + 3 + 14);
		}

		if (arg2 == 2) {
			field1041.method227(216);
			field1041.method228(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1041.method228(1);
		} else {
			field1041.method228(0);
		}

		field1041.method229(field1099 + var32);
		field1041.method229(field1100 + var33);
		field1105 = field1213[0];
		field1106 = field1214[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1041.method228(field1213[var36] - var32);
			field1041.method228(field1214[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.h(I)V")
	public final void method430() {
		method490();

		if (field1139 == 1) {
			field1092[field1138 / 100].method198(field1136 - 8 - 4, field1137 - 8 - 4);
		}

		if (field1139 == 2) {
			field1092[field1138 / 100 + 4].method198(field1136 - 8 - 4, field1137 - 8 - 4);
		}

		if (field1266 != -1) {
			method543(field1266, field1120);
			method473(class4.field57[field1266], 0, 0, 0);
		}

		if (field1313 > 0) {
			int var1 = 302 - (int) Math.abs(Math.sin(field1313 / 10.0D) * 10.0D);
			for (int var2 = 0; var2 < 30; var2++) {
				int var3 = (30 - var2) * 16;
				class34.method173(0xFFFF00, var1 + var2, field1313, var3, 256 - var3 / 2);
			}
		}

		if (field1054 != -1) {
			method543(field1054, field1120);
			method473(class4.field57[field1054], 0, 0, 0);
		}

		method484();

		if (!field1235) {
			method468();
			method500();
		} else if (field1307 == 0) {
			method438();
		}

		if (field1033 == 1) {
			if (field1079 > 0 || field1118 == 1) {
				field1149[1].method198(472, 258);
			} else {
				field1149[1].method198(472, 296);
			}
		}

		if (field1079 > 0) {
			field1149[0].method198(472, 296);
			field1128.method213(0xFFFF00, 484, 329, "Level: " + field1079);
		}

		if (field1118 == 1) {
			field1149[6].method198(472, 296);
			field1128.method213(0xFFFF00, 484, 329, "Arena");
		}

		if (field1413 != 0) {
			int var4 = field1413 / 50;
			int var5 = var4 / 60;
			var4 %= 60;
			if (var4 < 10) {
				field1128.method216("System update in: " + var5 + ":0" + var4, 0xFFFF00, 4, 329);
			} else {
				field1128.method216("System update in: " + var5 + ":" + var4, 0xFFFF00, 4, 329);
			}
		}
	}

	@ObfuscatedName("client.a(IB[B)Z")
	public final boolean method431(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method432(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method433(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1183; var2++) {
			if (arg0.equalsIgnoreCase(field1344[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1335.field423)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method434(int arg0, int arg1) {
		class42 var3 = field1119[field1390][arg0][arg1];
		if (var3 == null) {
			field1085.method84(field1390, arg0, arg1);
		} else {
			int var4 = -99999999;
			class30 var5 = null;
			for (class30 var6 = (class30) var3.method257(); var6 != null; var6 = (class30) var3.method259()) {
				class60 var7 = class60.method348(var6.field455);
				int var8 = var7.field911;
				if (var7.field910) {
					var8 = (var6.field456 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method255(var5);
			class30 var9 = null;
			class30 var10 = null;
			for (class30 var11 = (class30) var3.method257(); var11 != null; var11 = (class30) var3.method259()) {
				if (var5.field455 != var11.field455 && var9 == null) {
					var9 = var11;
				}

				if (var5.field455 != var11.field455 && var9.field455 != var11.field455 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1085.method70(var12, arg0, method526(arg1 * 128 + 64, field1390, arg0 * 128 + 64), field1390, arg1, var9, var10, var5);
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;ILjava/lang/String;)V")
	public final void method435(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field1095 != -1) {
			field1261 = arg2;
			field23 = 0;
		}

		if (field1172 == -1) {
			field1302 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1204[var4] = field1204[var4 - 1];
			field1205[var4] = field1205[var4 - 1];
			field1206[var4] = field1206[var4 - 1];
		}

		field1204[0] = arg1;
		field1205[0] = arg0;
		field1206[0] = arg2;
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method436(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(II)V")
	public final void method437(int arg0) {
		int var2 = class68.field1009[arg0].field1017;
		if (var2 != 0) {
			int var3 = field1283[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class35.method185(0.9D);
				}

				if (var3 == 2) {
					class35.method185(0.8D);
				}

				if (var3 == 3) {
					class35.method185(0.7D);
				}

				if (var3 == 4) {
					class35.method185(0.6D);
				}

				class60.field937.method116();
				field1325 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1361;

				if (var3 == 0) {
					method544(field1361, 0);
					field1361 = true;
				}

				if (var3 == 1) {
					method544(field1361, -400);
					field1361 = true;
				}

				if (var3 == 2) {
					method544(field1361, -800);
					field1361 = true;
				}

				if (var3 == 3) {
					method544(field1361, -1200);
					field1361 = true;
				}

				if (var3 == 4) {
					field1361 = false;
				}

				if (field1361 != var4 && !field1298) {
					if (field1361) {
						field1162 = field1042;
						field1163 = false;
						field1381.method288(2, field1162);
					} else {
						method515();
					}

					field1103 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1384 = true;
					method457(0);
				}

				if (var3 == 1) {
					field1384 = true;
					method457(-400);
				}

				if (var3 == 2) {
					field1384 = true;
					method457(-800);
				}

				if (var3 == 3) {
					field1384 = true;
					method457(-1200);
				}

				if (var3 == 4) {
					field1384 = false;
				}
			}

			if (var2 == 5) {
				field1231 = var3;
			}

			if (var2 == 6) {
				field1084 = var3;
			}

			if (var2 == 8) {
				field1104 = var3;
				field1302 = true;
			}

			if (var2 == 9) {
				field1424 = var3;
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method438() {
		int var1 = field1308;
		int var2 = field1309;
		int var3 = field1310;
		int var4 = field1311;
		int var5 = 0x5D5447;
		class34.method169(var2, var4, var1, var3, var5);
		class34.method169(var2 + 1, 16, var1 + 1, var3 - 2, 0);
		class34.method170(var1 + 1, var4 - 19, var2 + 18, var3 - 2, 0);
		field1129.method216("Choose Option", var5, var1 + 3, var2 + 14);
		int var6 = field17;
		int var7 = field18;
		if (field1307 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1307 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1307 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1050; var8++) {
			int var9 = (field1050 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1129.method218(var10, var1 + 3, var9, true, field1203[var8]);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method439() {
		for (int var1 = 0; var1 < field1291; var1++) {
			int var2 = field1292[var1];
			class27 var3 = field1290[var2];
			if (var3 != null) {
				method440(var3.field422.field867, var3);
			}
		}
	}

	@ObfuscatedName("client.a(BILz;)V")
	public final void method440(int arg0, class26 arg1) {
		if (arg1.field368 < 128 || arg1.field369 < 128 || arg1.field368 >= 13184 || arg1.field369 >= 13184) {
			arg1.field396 = -1;
			arg1.field401 = -1;
			arg1.field410 = 0;
			arg1.field411 = 0;
			arg1.field368 = arg1.field417[0] * 128 + arg1.field372 * 64;
			arg1.field369 = arg1.field418[0] * 128 + arg1.field372 * 64;
			arg1.method125();
		}

		if (field1335 == arg1 && (arg1.field368 < 1536 || arg1.field369 < 1536 || arg1.field368 >= 11776 || arg1.field369 >= 11776)) {
			arg1.field396 = -1;
			arg1.field401 = -1;
			arg1.field410 = 0;
			arg1.field411 = 0;
			arg1.field368 = arg1.field417[0] * 128 + arg1.field372 * 64;
			arg1.field369 = arg1.field418[0] * 128 + arg1.field372 * 64;
			arg1.method125();
		}

		if (arg1.field410 > field1259) {
			method441(arg1);
		} else if (arg1.field411 >= field1259) {
			method442(arg1);
		} else {
			method443(arg1);
		}

		method444(arg1);
		method445(arg1);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method441(class26 arg0) {
		int var2 = arg0.field410 - field1259;
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

	@ObfuscatedName("client.a(BLz;)V")
	public final void method442(class26 arg0) {
		if (field1259 == arg0.field411 || arg0.field396 == -1 || arg0.field399 != 0 || arg0.field398 + 1 > class66.field978[arg0.field396].method382(arg0.field397)) {
			int var2 = arg0.field411 - arg0.field410;
			int var3 = field1259 - arg0.field410;
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
	public final void method443(class26 arg0) {
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

	@ObfuscatedName("client.a(Lz;B)V")
	public final void method444(class26 arg0) {
		if (arg0.field390 != -1 && arg0.field390 < 32768) {
			class27 var2 = field1290[arg0.field390];
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
			if (field1396 == var5) {
				var5 = field1328;
			}

			class28 var6 = field1329[var5];
			if (var6 != null) {
				int var7 = arg0.field368 - var6.field368;
				int var8 = arg0.field369 - var6.field369;
				if (var7 != 0 || var8 != 0) {
					arg0.field415 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field391 != 0 || arg0.field392 != 0) && (arg0.field416 == 0 || arg0.field420 > 0)) {
			int var9 = arg0.field368 - (arg0.field391 - field1099 - field1099) * 64;
			int var10 = arg0.field369 - (arg0.field392 - field1100 - field1100) * 64;
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

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method445(class26 arg0) {
		arg0.field371 = false;

		if (arg0.field393 != -1) {
			class66 var2 = class66.field978[arg0.field393];
			arg0.field395++;
			if (arg0.field394 < var2.field979 && arg0.field395 > var2.method382(arg0.field394)) {
				arg0.field395 = 0;
				arg0.field394++;
			}

			if (arg0.field394 >= var2.field979) {
				arg0.field395 = 0;
				arg0.field394 = 0;
			}
		}

		if (arg0.field401 != -1 && field1259 >= arg0.field404) {
			if (arg0.field402 < 0) {
				arg0.field402 = 0;
			}

			class66 var3 = class67.field994[arg0.field401].field998;
			arg0.field403++;
			while (arg0.field402 < var3.field979 && arg0.field403 > var3.method382(arg0.field402)) {
				arg0.field403 -= var3.method382(arg0.field402);
				arg0.field402++;
			}

			if (arg0.field402 >= var3.field979 && (arg0.field402 < 0 || arg0.field402 >= var3.field979)) {
				arg0.field401 = -1;
			}
		}

		if (arg0.field396 != -1 && arg0.field399 <= 1) {
			class66 var4 = class66.field978[arg0.field396];
			if (var4.field990 == 1 && arg0.field421 > 0 && arg0.field410 <= field1259 && arg0.field411 < field1259) {
				arg0.field399 = 1;
				return;
			}
		}

		if (arg0.field396 != -1 && arg0.field399 == 0) {
			class66 var5 = class66.field978[arg0.field396];
			arg0.field398++;
			while (arg0.field397 < var5.field979 && arg0.field398 > var5.method382(arg0.field397)) {
				arg0.field398 -= var5.method382(arg0.field397);
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

	@ObfuscatedName("client.k(I)V")
	public final void method446() {
		if (field1325) {
			field1325 = false;
			field1217.method268(0, field9, 4);
			field1218.method268(0, field9, 357);
			field1219.method268(722, field9, 4);
			field1220.method268(743, field9, 205);
			field1221.method268(0, field9, 0);
			field1222.method268(516, field9, 4);
			field1223.method268(516, field9, 205);
			field1224.method268(496, field9, 357);
			field1225.method268(0, field9, 338);
			field1421 = true;
			field1302 = true;
			field1392 = true;
			field1288 = true;

			if (field1318 != 2) {
				field1241.method268(4, field9, 4);
				field1240.method268(550, field9, 4);
			}
		}

		if (field1318 == 2) {
			method510();
		}

		if (field1235 && field1307 == 1) {
			field1421 = true;
		}

		if (field1073 != -1) {
			boolean var1 = method543(field1073, field1120);
			if (var1) {
				field1421 = true;
			}
		}

		if (field1435 == 2) {
			field1421 = true;
		}

		if (field1169 == 2) {
			field1421 = true;
		}

		if (field1421) {
			method558();
			field1421 = false;
		}

		if (field1172 == -1) {
			field1078.field77 = field1184 - field1146 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method536(0, 463, field1184, 77, false, field1078, field18 - 357, field17 - 17);
			}

			int var2 = field1184 - field1078.field77 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1184 - 77) {
				var2 = field1184 - 77;
			}

			if (field1146 != var2) {
				field1146 = var2;
				field1302 = true;
			}
		}

		if (field1172 != -1) {
			boolean var3 = method543(field1172, field1120);
			if (var3) {
				field1302 = true;
			}
		}

		if (field1435 == 3) {
			field1302 = true;
		}

		if (field1169 == 3) {
			field1302 = true;
		}

		if (field1261 != null) {
			field1302 = true;
		}

		if (field1235 && field1307 == 2) {
			field1302 = true;
		}

		if (field1302) {
			method537();
			field1302 = false;
		}

		if (field1318 == 2) {
			method514();
			field1240.method268(550, field9, 4);
		}

		if (field1031 != -1) {
			field1392 = true;
		}

		if (field1392) {
			if (field1031 != -1 && field1265 == field1031) {
				field1031 = -1;
				field1041.method227(243);
				field1041.method228(field1265);
			}

			field1392 = false;
			field1374.method267();
			field1317.method211(0, 0);

			if (field1073 == -1) {
				if (field1428[field1265] != -1) {
					if (field1265 == 0) {
						field1174.method211(22, 10);
					}

					if (field1265 == 1) {
						field1175.method211(54, 8);
					}

					if (field1265 == 2) {
						field1175.method211(82, 8);
					}

					if (field1265 == 3) {
						field1176.method211(110, 8);
					}

					if (field1265 == 4) {
						field1178.method211(153, 8);
					}

					if (field1265 == 5) {
						field1178.method211(181, 8);
					}

					if (field1265 == 6) {
						field1177.method211(209, 9);
					}
				}

				if (field1428[0] != -1 && (field1031 != 0 || field1259 % 20 < 10)) {
					field1438[0].method211(29, 13);
				}

				if (field1428[1] != -1 && (field1031 != 1 || field1259 % 20 < 10)) {
					field1438[1].method211(53, 11);
				}

				if (field1428[2] != -1 && (field1031 != 2 || field1259 % 20 < 10)) {
					field1438[2].method211(82, 11);
				}

				if (field1428[3] != -1 && (field1031 != 3 || field1259 % 20 < 10)) {
					field1438[3].method211(115, 12);
				}

				if (field1428[4] != -1 && (field1031 != 4 || field1259 % 20 < 10)) {
					field1438[4].method211(153, 13);
				}

				if (field1428[5] != -1 && (field1031 != 5 || field1259 % 20 < 10)) {
					field1438[5].method211(180, 11);
				}

				if (field1428[6] != -1 && (field1031 != 6 || field1259 % 20 < 10)) {
					field1438[6].method211(208, 13);
				}
			}

			field1374.method268(516, field9, 160);
			field1373.method267();
			field1316.method211(0, 0);

			if (field1073 == -1) {
				if (field1428[field1265] != -1) {
					if (field1265 == 7) {
						field1385.method211(42, 0);
					}

					if (field1265 == 8) {
						field1386.method211(74, 0);
					}

					if (field1265 == 9) {
						field1386.method211(102, 0);
					}

					if (field1265 == 10) {
						field1387.method211(130, 1);
					}

					if (field1265 == 11) {
						field1389.method211(173, 0);
					}

					if (field1265 == 12) {
						field1389.method211(201, 0);
					}

					if (field1265 == 13) {
						field1388.method211(229, 0);
					}
				}

				if (field1428[8] != -1 && (field1031 != 8 || field1259 % 20 < 10)) {
					field1438[7].method211(74, 2);
				}

				if (field1428[9] != -1 && (field1031 != 9 || field1259 % 20 < 10)) {
					field1438[8].method211(102, 3);
				}

				if (field1428[10] != -1 && (field1031 != 10 || field1259 % 20 < 10)) {
					field1438[9].method211(137, 4);
				}

				if (field1428[11] != -1 && (field1031 != 11 || field1259 % 20 < 10)) {
					field1438[10].method211(174, 2);
				}

				if (field1428[12] != -1 && (field1031 != 12 || field1259 % 20 < 10)) {
					field1438[11].method211(201, 2);
				}

				if (field1428[13] != -1 && (field1031 != 13 || field1259 % 20 < 10)) {
					field1438[12].method211(226, 2);
				}
			}

			field1373.method268(496, field9, 466);
			field1241.method267();
		}

		if (field1288) {
			field1288 = false;
			field1372.method267();
			field1315.method211(0, 0);
			field1128.method214(true, 28, 0xFFFFFF, 55, "Public chat");

			if (field1243 == 0) {
				field1128.method214(true, 41, 0xFF00, 55, "On");
			}

			if (field1243 == 1) {
				field1128.method214(true, 41, 0xFFFF00, 55, "Friends");
			}

			if (field1243 == 2) {
				field1128.method214(true, 41, 0xFF0000, 55, "Off");
			}

			if (field1243 == 3) {
				field1128.method214(true, 41, 0xFFFF, 55, "Hide");
			}

			field1128.method214(true, 28, 0xFFFFFF, 184, "Private chat");

			if (field1382 == 0) {
				field1128.method214(true, 41, 0xFF00, 184, "On");
			}

			if (field1382 == 1) {
				field1128.method214(true, 41, 0xFFFF00, 184, "Friends");
			}

			if (field1382 == 2) {
				field1128.method214(true, 41, 0xFF0000, 184, "Off");
			}

			field1128.method214(true, 28, 0xFFFFFF, 324, "Trade/duel");

			if (field1299 == 0) {
				field1128.method214(true, 41, 0xFF00, 324, "On");
			}

			if (field1299 == 1) {
				field1128.method214(true, 41, 0xFFFF00, 324, "Friends");
			}

			if (field1299 == 2) {
				field1128.method214(true, 41, 0xFF0000, 324, "Off");
			}

			field1128.method214(true, 33, 0xFFFFFF, 458, "Report abuse");
			field1372.method268(0, field9, 453);
			field1241.method267();
		}

		field1120 = 0;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method447() {
		int var1 = field1226 * 128 + 64;
		int var2 = field1227 * 128 + 64;
		int var3 = method526(var2, field1390, var1) - field1228;

		if (field1141 < var1) {
			field1141 += (var1 - field1141) * field1230 / 1000 + field1229;
			if (field1141 > var1) {
				field1141 = var1;
			}
		}

		if (field1141 > var1) {
			field1141 -= (field1141 - var1) * field1230 / 1000 + field1229;
			if (field1141 < var1) {
				field1141 = var1;
			}
		}

		if (field1142 < var3) {
			field1142 += (var3 - field1142) * field1230 / 1000 + field1229;
			if (field1142 > var3) {
				field1142 = var3;
			}
		}

		if (field1142 > var3) {
			field1142 -= (field1142 - var3) * field1230 / 1000 + field1229;
			if (field1142 < var3) {
				field1142 = var3;
			}
		}

		if (field1143 < var2) {
			field1143 += (var2 - field1143) * field1230 / 1000 + field1229;
			if (field1143 > var2) {
				field1143 = var2;
			}
		}

		if (field1143 > var2) {
			field1143 -= (field1143 - var2) * field1230 / 1000 + field1229;
			if (field1143 < var2) {
				field1143 = var2;
			}
		}

		int var4 = field1068 * 128 + 64;
		int var5 = field1069 * 128 + 64;
		int var6 = method526(var5, field1390, var4) - field1070;
		int var7 = var4 - field1141;
		int var8 = var6 - field1142;
		int var9 = var5 - field1143;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1144 < var11) {
			field1144 += (var11 - field1144) * field1072 / 1000 + field1071;
			if (field1144 > var11) {
				field1144 = var11;
			}
		}

		if (field1144 > var11) {
			field1144 -= (field1144 - var11) * field1072 / 1000 + field1071;
			if (field1144 < var11) {
				field1144 = var11;
			}
		}

		int var13 = var12 - field1145;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1145 += field1072 * var13 / 1000 + field1071;
			field1145 &= 0x7FF;
		}

		if (var13 < 0) {
			field1145 -= -var13 * field1072 / 1000 + field1071;
			field1145 &= 0x7FF;
		}

		int var14 = var12 - field1145;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1145 = var12;
		}
	}

	public final void run() {
		if (field1098) {
			method464();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method448() {
		if (field1242 == null) {
			method504();
			field10 = null;
			field1363 = null;
			field1364 = null;
			field1365 = null;
			field1366 = null;
			field1367 = null;
			field1368 = null;
			field1369 = null;
			field1370 = null;
			field1371 = null;
			field1242 = new class44(96, method11(), 479);
			field1240 = new class44(156, method11(), 172);
			class34.method167();
			field1304.method211(0, 0);
			field1239 = new class44(261, method11(), 190);
			field1241 = new class44(334, method11(), 512);
			class34.method167();
			field1372 = new class44(50, method11(), 496);
			field1373 = new class44(37, method11(), 269);
			field1374 = new class44(45, method11(), 249);
			field1325 = true;
		}
	}

	@ObfuscatedName("client.b(B)Z")
	public final boolean method449() {
		if (field1125 == null) {
			return false;
		}

		try {
			int var1 = field1125.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1340 == -1) {
				field1125.method41(field1150.field622, 0, 1);
				field1340 = field1150.field622[0] & 0xFF;
				if (field1197 != null) {
					field1340 = field1340 - field1197.method304() & 0xFF;
				}

				field1339 = class61.field939[field1340];
				var1--;
			}

			if (field1339 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1125.method41(field1150.field622, 0, 1);
				field1339 = field1150.field622[0] & 0xFF;
				var1--;
			}

			if (field1339 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1125.method41(field1150.field622, 0, 2);
				field1150.field623 = 0;
				field1339 = field1150.method240();
				var1 -= 2;
			}

			if (var1 < field1339) {
				return false;
			}

			field1150.field623 = 0;
			field1125.method41(field1150.field622, 0, field1339);
			field1341 = 0;
			field1234 = field1233;
			field1233 = field1232;
			field1232 = field1340;

			if (field1340 == 203) {
				field1398 = field1150.method238();
				field1399 = field1150.method238();
				field1340 = -1;
				return true;
			}

			if (field1340 == 69) {
				int var2 = field1150.method240();
				int var3 = field1150.method240();
				class4.field57[var2].field110 = var3;
				field1340 = -1;
				return true;
			}

			if (field1340 == 236) {
				int var4 = field1150.method240();
				method499(var4);

				if (field1172 != -1) {
					field1172 = -1;
					field1302 = true;
				}

				if (field1034) {
					field1034 = false;
					field1302 = true;
				}

				field1073 = var4;
				field1421 = true;
				field1392 = true;
				field1054 = -1;
				field1202 = false;
				field1340 = -1;
				return true;
			}

			if (field1340 == 177) {
				int var5 = field1150.method240();
				method499(var5);

				if (field1073 != -1) {
					field1073 = -1;
					field1421 = true;
					field1392 = true;
				}

				if (field1172 != -1) {
					field1172 = -1;
					field1302 = true;
				}

				if (field1034) {
					field1034 = false;
					field1302 = true;
				}

				field1054 = var5;
				field1202 = false;
				field1340 = -1;
				return true;
			}

			if (field1340 == 165) {
				class39 var6 = class6.method47();
				if (var6 != null) {
					field1041.method227(19);
					field1041.method229(var6.field623);
					field1041.method236(var6.field622, var6.field623, 0);
					var6.method226();
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 60) {
				int var7 = field1150.method240();
				int var8 = field1150.method240();
				class4.field57[var7].field106 = 1;
				class4.field57[var7].field107 = var8;
				field1340 = -1;
				return true;
			}

			if (field1340 == 105) {
				method472(field1339, field1150);
				field1340 = -1;
				return true;
			}

			if (field1340 == 15) {
				field1398 = field1150.method238();
				field1399 = field1150.method238();

				while (field1150.field623 < field1339) {
					int var9 = field1150.method238();
					method503(field1150, var9);
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 8) {
				field1265 = field1150.method238();
				field1421 = true;
				field1392 = true;
				field1340 = -1;
				return true;
			}

			if (field1340 == 152) {
				int var10 = field1150.method241();
				field1095 = var10;
				field1302 = true;
				field1340 = -1;
				return true;
			}

			if (field1340 == 207) {
				long var11 = field1150.method244();
				int var13 = field1150.method243();
				int var14 = field1150.method238();
				boolean var15 = false;
				for (int var16 = 0; var16 < 100; var16++) {
					if (field1195[var16] == var13) {
						var15 = true;
						break;
					}
				}

				if (var14 <= 1) {
					for (int var17 = 0; var17 < field1185; var17++) {
						if (field1338[var17] == var11) {
							var15 = true;
							break;
						}
					}
				}

				if (!var15 && field1286 == 0) {
					try {
						field1195[field1212] = var13;
						field1212 = (field1212 + 1) % 100;
						String var18 = class53.method316(field1339 - 13, field1150);
						var18 = class69.method399(var18);
						if (var14 == 2 || var14 == 3) {
							method435("@cr2@" + class52.method313(class52.method310(var11)), 7, var18);
						} else if (var14 == 1) {
							method435("@cr1@" + class52.method313(class52.method310(var11)), 7, var18);
						} else {
							method435(class52.method313(class52.method310(var11)), 3, var18);
						}
					} catch (Exception var153) {
						signlink.reporterror("cde1");
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 175) {
				String var20 = field1150.method245();
				if (var20.endsWith(":tradereq:")) {
					String var21 = var20.substring(0, var20.indexOf(":"));
					long var22 = class52.method309(var21);
					boolean var24 = false;
					for (int var25 = 0; var25 < field1185; var25++) {
						if (field1338[var25] == var22) {
							var24 = true;
							break;
						}
					}

					if (!var24 && field1286 == 0) {
						method435(var21, 4, "wishes to trade with you.");
					}
				} else if (var20.endsWith(":duelreq:")) {
					String var26 = var20.substring(0, var20.indexOf(":"));
					long var27 = class52.method309(var26);
					boolean var29 = false;
					for (int var30 = 0; var30 < field1185; var30++) {
						if (field1338[var30] == var27) {
							var29 = true;
							break;
						}
					}

					if (!var29 && field1286 == 0) {
						method435(var26, 8, "wishes to duel with you.");
					}
				} else {
					method435("", 0, var20);
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 181) {
				field1185 = field1339 / 8;
				for (int var31 = 0; var31 < field1185; var31++) {
					field1338[var31] = field1150.method244();
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 229) {
				int var32 = field1150.method240();
				int var33 = field1150.method240();

				if (field1172 != -1) {
					field1172 = -1;
					field1302 = true;
				}

				if (field1034) {
					field1034 = false;
					field1302 = true;
				}

				field1054 = var32;
				field1073 = var33;
				field1421 = true;
				field1392 = true;
				field1202 = false;
				field1340 = -1;
				return true;
			}

			if (field1340 == 238) {
				field1032 = field1150.method243();
				field1209 = field1150.method240();
				field1161 = field1150.method238();
				field1294 = field1150.method240();
				field1122 = field1150.method238();
				if (field1032 != 0 && field1054 == -1) {
					signlink.dnslookup(class52.method312(field1032));
					method517();
					short var34 = 650;
					if (field1161 != 201 || field1122 == 1) {
						var34 = 655;
					}

					field1380 = "";
					field1048 = false;

					for (int var35 = 0; var35 < class4.field57.length; var35++) {
						if (class4.field57[var35] != null && class4.field57[var35].field66 == var34) {
							field1054 = class4.field57[var35].field63;
							break;
						}
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 161) {
				method485(field1339, field1150);
				field1030 = false;
				field1340 = -1;
				return true;
			}

			if (field1340 == 243) {
				field1418 = field1150.method238();
				if (field1418 == 1) {
					field1097 = field1150.method240();
				}

				if (field1418 >= 2 && field1418 <= 6) {
					if (field1418 == 2) {
						field1116 = 64;
						field1117 = 64;
					}

					if (field1418 == 3) {
						field1116 = 0;
						field1117 = 64;
					}

					if (field1418 == 4) {
						field1116 = 128;
						field1117 = 64;
					}

					if (field1418 == 5) {
						field1116 = 64;
						field1117 = 0;
					}

					if (field1418 == 6) {
						field1116 = 64;
						field1117 = 128;
					}

					field1418 = 2;
					field1113 = field1150.method240();
					field1114 = field1150.method240();
					field1115 = field1150.method238();
				}

				if (field1418 == 10) {
					field1403 = field1150.method240();
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 135) {
				int var36 = field1150.method240();
				int var37 = field1150.method240();
				int var38 = var37 >> 10 & 0x1F;
				int var39 = var37 >> 5 & 0x1F;
				int var40 = var37 & 0x1F;
				class4.field57[var36].field100 = (var40 << 3) + (var38 << 19) + (var39 << 11);
				field1340 = -1;
				return true;
			}

			if (field1340 == 56) {
				field1094 = false;
				field1034 = true;
				field1208 = "";
				field1302 = true;
				field1340 = -1;
				return true;
			}

			if (field1340 == 7) {
				int var41 = field1150.method240();
				method499(var41);

				if (field1073 != -1) {
					field1073 = -1;
					field1421 = true;
					field1392 = true;
				}

				field1172 = var41;
				field1302 = true;
				field1054 = -1;
				field1202 = false;
				field1340 = -1;
				return true;
			}

			if (field1340 == 151 || field1340 == 188 || field1340 == 190 || field1340 == 141 || field1340 == 187 || field1340 == 13 || field1340 == 94 || field1340 == 71 || field1340 == 198 || field1340 == 119) {
				method503(field1150, field1340);
				field1340 = -1;
				return true;
			}

			if (field1340 == 96) {
				int var42 = field1150.method240();
				if (var42 == 0xFFFF) {
					var42 = -1;
				}

				if (field1042 != var42 && field1361 && !field1298) {
					field1162 = var42;
					field1163 = true;
					field1381.method288(2, field1162);
				}

				field1042 = var42;
				field1103 = 0;
				field1340 = -1;
				return true;
			}

			if (field1340 == 39) {
				int var43 = field1150.method240();
				int var44 = field1150.method240();
				if (field1361 && !field1298) {
					field1162 = var43;
					field1163 = false;
					field1381.method288(2, field1162);
					field1103 = var44;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 225) {
				int var45 = field1150.method240();
				boolean var46 = field1150.method238() == 1;
				class4.field57[var45].field78 = var46;
				field1340 = -1;
				return true;
			}

			if (field1340 == 143) {
				int var47 = field1150.method240();
				class4 var48 = class4.field57[var47];
				for (int var49 = 0; var49 < var48.field58.length; var49++) {
					var48.field58[var49] = -1;
					var48.field58[var49] = 0;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 26) {
				field1413 = field1150.method240() * 30;
				field1340 = -1;
				return true;
			}

			if (field1340 == 209) {
				int var50 = field1150.method240();
				int var51 = field1150.method238();
				int var52 = field1150.method240();
				if (field1384 && !field1298 && field1408 < 50) {
					field1040[field1408] = var50;
					field1356[field1408] = var51;
					field1400[field1408] = class55.field782[var50] + var52;
					field1408++;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 109) {
				long var53 = field1150.method244();
				int var55 = field1150.method238();
				String var56 = class52.method313(class52.method310(var53));
				for (int var57 = 0; var57 < field1183; var57++) {
					if (field1191[var57] == var53) {
						if (field1270[var57] != var55) {
							field1270[var57] = var55;
							field1421 = true;

							if (var55 > 0) {
								method435("", 5, var56 + " has logged in.");
							}

							if (var55 == 0) {
								method435("", 5, var56 + " has logged out.");
							}
						}

						var56 = null;
						break;
					}
				}

				if (var56 != null && field1183 < 200) {
					field1191[field1183] = var53;
					field1344[field1183] = var56;
					field1270[field1183] = var55;
					field1183++;
					field1421 = true;
				}

				boolean var58 = false;
				while (!var58) {
					var58 = true;
					for (int var59 = 0; var59 < field1183 - 1; var59++) {
						if (field1270[var59] != field1295 && field1270[var59 + 1] == field1295 || field1270[var59] == 0 && field1270[var59 + 1] != 0) {
							int var60 = field1270[var59];
							field1270[var59] = field1270[var59 + 1];
							field1270[var59 + 1] = var60;
							String var61 = field1344[var59];
							field1344[var59] = field1344[var59 + 1];
							field1344[var59 + 1] = var61;
							long var62 = field1191[var59];
							field1191[var59] = field1191[var59 + 1];
							field1191[var59 + 1] = var62;
							field1421 = true;
							var58 = false;
						}
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 2) {
				field1243 = field1150.method238();
				field1382 = field1150.method238();
				field1299 = field1150.method238();
				field1288 = true;
				field1302 = true;
				field1340 = -1;
				return true;
			}

			if (field1340 == 36) {
				method554();
				field1340 = -1;
				return false;
			}

			if (field1340 == 28) {
				class6.method44();
				field1340 = -1;
				return true;
			}

			if (field1340 == 174) {
				if (field1073 != -1) {
					field1073 = -1;
					field1421 = true;
					field1392 = true;
				}

				if (field1172 != -1) {
					field1172 = -1;
					field1302 = true;
				}

				if (field1034) {
					field1034 = false;
					field1302 = true;
				}

				field1054 = -1;
				field1202 = false;
				field1340 = -1;
				return true;
			}

			if (field1340 == 29) {
				int var64 = field1150.method240();
				int var65 = field1150.method238();

				if (var64 == 0xFFFF) {
					var64 = -1;
				}

				field1428[var65] = var64;
				field1421 = true;
				field1392 = true;
				field1340 = -1;
				return true;
			}

			if (field1340 == 132) {
				field1031 = field1150.method238();
				if (field1265 == field1031) {
					if (field1031 == 3) {
						field1265 = 1;
					} else {
						field1265 = 3;
					}

					field1421 = true;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 25) {
				for (int var66 = 0; var66 < field1283.length; var66++) {
					if (field1283[var66] != field1096[var66]) {
						field1283[var66] = field1096[var66];
						method437(var66);
						field1421 = true;
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 156) {
				field1421 = true;
				int var67 = field1150.method240();
				class4 var68 = class4.field57[var67];
				int var69 = field1150.method238();
				for (int var70 = 0; var70 < var69; var70++) {
					var68.field58[var70] = field1150.method240();
					int var71 = field1150.method238();
					if (var71 == 255) {
						var71 = field1150.method243();
					}

					var68.field59[var70] = var71;
				}

				for (int var72 = var69; var72 < var68.field58.length; var72++) {
					var68.field58[var72] = 0;
					var68.field59[var72] = 0;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 32) {
				int var73 = field1150.method240();
				String var74 = field1150.method245();
				class4.field57[var73].field98 = var74;

				if (field1428[field1265] == class4.field57[var73].field63) {
					field1421 = true;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 140) {
				field1398 = field1150.method238();
				field1399 = field1150.method238();
				for (int var75 = field1398; var75 < field1398 + 8; var75++) {
					for (int var76 = field1399; var76 < field1399 + 8; var76++) {
						if (field1119[field1390][var75][var76] != null) {
							field1119[field1390][var75][var76] = null;
							method434(var75, var76);
						}
					}
				}

				for (class41 var77 = (class41) field1263.method257(); var77 != null; var77 = (class41) field1263.method259()) {
					if (var77.field641 >= field1398 && var77.field641 < field1398 + 8 && var77.field642 >= field1399 && var77.field642 < field1399 + 8 && field1390 == var77.field639) {
						var77.field650 = 0;
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 76) {
				int var78 = field1150.method240();
				int var79 = field1150.method240();
				class4.field57[var78].field106 = 2;
				class4.field57[var78].field107 = var79;
				field1340 = -1;
				return true;
			}

			if (field1340 == 75) {
				int var80 = field1150.method240();
				int var81 = field1150.method243();
				field1096[var80] = var81;

				if (field1283[var80] != var81) {
					field1283[var80] = var81;
					method437(var80);
					field1421 = true;

					if (field1095 != -1) {
						field1302 = true;
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 134) {
				field1192 = false;

				for (int var82 = 0; var82 < 5; var82++) {
					field1131[var82] = false;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 226) {
				int var83 = field1150.method240();
				int var84 = field1150.method240();
				class4 var85 = class4.field57[var83];
				if (var85 != null && var85.field64 == 0) {
					if (var84 < 0) {
						var84 = 0;
					}

					if (var84 > var85.field76 - var85.field68) {
						var84 = var85.field76 - var85.field68;
					}

					var85.field77 = var84;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 103) {
				int var86 = field1150.method238();
				int var87 = field1150.method238();
				int var88 = field1150.method238();
				int var89 = field1150.method238();
				field1131[var86] = true;
				field1121[var86] = var87;
				field1110[var86] = var88;
				field1256[var86] = var89;
				field1140[var86] = 0;
				field1340 = -1;
				return true;
			}

			if (field1340 == 123) {
				field1192 = true;
				field1068 = field1150.method238();
				field1069 = field1150.method238();
				field1070 = field1150.method240();
				field1071 = field1150.method238();
				field1072 = field1150.method238();
				if (field1072 >= 100) {
					int var90 = field1068 * 128 + 64;
					int var91 = field1069 * 128 + 64;
					int var92 = method526(var91, field1390, var90) - field1070;
					int var93 = var90 - field1141;
					int var94 = var92 - field1142;
					int var95 = var91 - field1143;
					int var96 = (int) Math.sqrt(var93 * var93 + var95 * var95);
					field1144 = (int) (Math.atan2(var94, var96) * 325.949D) & 0x7FF;
					field1145 = (int) (Math.atan2(var93, var95) * -325.949D) & 0x7FF;

					if (field1144 < 128) {
						field1144 = 128;
					}

					if (field1144 > 383) {
						field1144 = 383;
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 95) {
				field1421 = true;
				int var97 = field1150.method240();
				class4 var98 = class4.field57[var97];
				while (field1150.field623 < field1339) {
					int var99 = field1150.method238();
					int var100 = field1150.method240();
					int var101 = field1150.method238();
					if (var101 == 255) {
						var101 = field1150.method243();
					}

					if (var99 >= 0 && var99 < var98.field58.length) {
						var98.field58[var99] = var100;
						var98.field59[var99] = var101;
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 110) {
				field1421 = true;
				int var102 = field1150.method238();
				int var103 = field1150.method243();
				int var104 = field1150.method238();
				field1255[var102] = var103;
				field1049[var102] = var104;
				field1306[var102] = 1;
				for (int var105 = 0; var105 < 98; var105++) {
					if (var103 >= field1088[var105]) {
						field1306[var102] = var105 + 2;
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 66) {
				int var106 = field1150.method240();
				int var107 = field1150.method240();
				if (field1065 == var106 && field1066 == var107 && field1318 == 2) {
					field1340 = -1;
					return true;
				}

				field1065 = var106;
				field1066 = var107;
				field1099 = (field1065 - 6) * 8;
				field1100 = (field1066 - 6) * 8;
				field1207 = false;
				if ((field1065 / 8 == 48 || field1065 / 8 == 49) && field1066 / 8 == 48) {
					field1207 = true;
				}

				if (field1065 / 8 == 48 && field1066 / 8 == 148) {
					field1207 = true;
				}

				field1318 = 1;
				field1067 = System.currentTimeMillis();
				field1241.method267();
				field1128.method213(0, 257, 151, "Loading - please wait.");
				field1128.method213(0xFFFFFF, 256, 150, "Loading - please wait.");
				field1241.method268(4, field9, 4);
				int var108 = 0;
				for (int var109 = (field1065 - 6) / 8; var109 <= (field1065 + 6) / 8; var109++) {
					for (int var110 = (field1066 - 6) / 8; var110 <= (field1066 + 6) / 8; var110++) {
						var108++;
					}
				}

				field1064 = new byte[var108][];
				field1360 = new byte[var108][];
				field1353 = new int[var108];
				field1354 = new int[var108];
				field1355 = new int[var108];
				int var111 = 0;
				for (int var112 = (field1065 - 6) / 8; var112 <= (field1065 + 6) / 8; var112++) {
					for (int var113 = (field1066 - 6) / 8; var113 <= (field1066 + 6) / 8; var113++) {
						field1353[var111] = (var112 << 8) + var113;

						if (field1207 && (var113 == 49 || var113 == 149 || var113 == 147 || var112 == 50 || var112 == 49 && var113 == 47)) {
							field1354[var111] = -1;
							field1355[var111] = -1;
							var111++;
						} else {
							int var114 = field1354[var111] = field1381.method283(0, var112, var113);
							if (var114 != -1) {
								field1381.method288(3, var114);
							}

							int var115 = field1355[var111] = field1381.method283(1, var112, var113);
							if (var115 != -1) {
								field1381.method288(3, var115);
							}

							var111++;
						}
					}
				}

				int var116 = field1099 - field1101;
				int var117 = field1100 - field1102;
				field1101 = field1099;
				field1102 = field1100;

				for (int var118 = 0; var118 < 8192; var118++) {
					class27 var119 = field1290[var118];
					if (var119 != null) {
						for (int var120 = 0; var120 < 10; var120++) {
							var119.field417[var120] -= var116;
							var119.field418[var120] -= var117;
						}

						var119.field368 -= var116 * 128;
						var119.field369 -= var117 * 128;
					}
				}

				for (int var121 = 0; var121 < field1327; var121++) {
					class28 var122 = field1329[var121];
					if (var122 != null) {
						for (int var123 = 0; var123 < 10; var123++) {
							var122.field417[var123] -= var116;
							var122.field418[var123] -= var117;
						}

						var122.field368 -= var116 * 128;
						var122.field369 -= var117 * 128;
					}
				}

				field1030 = true;
				byte var124 = 0;
				byte var125 = 104;
				byte var126 = 1;
				if (var116 < 0) {
					var124 = 103;
					var125 = -1;
					var126 = -1;
				}

				byte var127 = 0;
				byte var128 = 104;
				byte var129 = 1;
				if (var117 < 0) {
					var127 = 103;
					var128 = -1;
					var129 = -1;
				}

				for (int var130 = var124; var130 != var125; var130 += var126) {
					for (int var131 = var127; var131 != var128; var131 += var129) {
						int var132 = var116 + var130;
						int var133 = var117 + var131;
						for (int var134 = 0; var134 < 4; var134++) {
							if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
								field1119[var134][var130][var131] = field1119[var134][var132][var133];
							} else {
								field1119[var134][var130][var131] = null;
							}
						}
					}
				}

				for (class41 var135 = (class41) field1263.method257(); var135 != null; var135 = (class41) field1263.method259()) {
					var135.field641 -= var116;
					var135.field642 -= var117;
					if (var135.field641 < 0 || var135.field642 < 0 || var135.field641 >= 104 || var135.field642 >= 104) {
						var135.method119();
					}
				}

				if (field1105 != 0) {
					field1105 -= var116;
					field1106 -= var117;
				}

				field1192 = false;
				field1340 = -1;
				return true;
			}

			if (field1340 == 115) {
				int var136 = field1150.method241();
				field1266 = var136;
				field1340 = -1;
				return true;
			}

			if (field1340 == 144) {
				for (int var137 = 0; var137 < field1329.length; var137++) {
					if (field1329[var137] != null) {
						field1329[var137].field396 = -1;
					}
				}

				for (int var138 = 0; var138 < field1290.length; var138++) {
					if (field1290[var138] != null) {
						field1290[var138].field396 = -1;
					}
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 108) {
				field1313 = 255;
				field1340 = -1;
				return true;
			}

			if (field1340 == 35) {
				field1033 = field1150.method238();
				field1340 = -1;
				return true;
			}

			if (field1340 == 70) {
				if (field1265 == 12) {
					field1421 = true;
				}

				field1074 = field1150.method241();
				field1340 = -1;
				return true;
			}

			if (field1340 == 83) {
				int var139 = field1150.method240();
				class4.field57[var139].field106 = 3;
				class4.field57[var139].field107 = (field1335.field427[8] << 6) + (field1335.field427[0] << 12) + (field1335.field428[0] << 24) + (field1335.field428[4] << 18) + field1335.field427[11];
				field1340 = -1;
				return true;
			}

			if (field1340 == 153) {
				int var140 = field1150.method240();
				int var141 = field1150.method240();
				int var142 = field1150.method240();
				class60 var143 = class60.method348(var141);
				class4.field57[var140].field106 = 4;
				class4.field57[var140].field107 = var141;
				class4.field57[var140].field113 = var143.field904;
				class4.field57[var140].field114 = var143.field905;
				class4.field57[var140].field112 = var143.field903 * 100 / var142;
				field1340 = -1;
				return true;
			}

			if (field1340 == 86) {
				field1192 = true;
				field1226 = field1150.method238();
				field1227 = field1150.method238();
				field1228 = field1150.method240();
				field1229 = field1150.method238();
				field1230 = field1150.method238();
				if (field1230 >= 100) {
					field1141 = field1226 * 128 + 64;
					field1143 = field1227 * 128 + 64;
					field1142 = method526(field1143, field1390, field1141) - field1228;
				}

				field1340 = -1;
				return true;
			}

			if (field1340 == 230) {
				int var144 = field1150.method240();
				int var145 = field1150.method241();
				int var146 = field1150.method241();
				class4 var147 = class4.field57[var144];
				var147.field70 = var145;
				var147.field71 = var146;
				field1340 = -1;
				return true;
			}

			if (field1340 == 233) {
				field1105 = 0;
				field1340 = -1;
				return true;
			}

			if (field1340 == 208) {
				if (field1265 == 12) {
					field1421 = true;
				}

				field1351 = field1150.method238();
				field1340 = -1;
				return true;
			}

			if (field1340 == 49) {
				field1396 = field1150.method240();
				field1422 = field1150.method238();
				field1340 = -1;
				return true;
			}

			if (field1340 == 192) {
				int var148 = field1150.method240();
				byte var149 = field1150.method239();
				field1096[var148] = var149;

				if (field1283[var148] != var149) {
					field1283[var148] = var149;
					method437(var148);
					field1421 = true;

					if (field1095 != -1) {
						field1302 = true;
					}
				}

				field1340 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1340 + "," + field1339 + " - " + field1233 + "," + field1234);
			method554();
		} catch (IOException var154) {
			method507();
		} catch (Exception var155) {
			String var151 = "T2 - " + field1340 + "," + field1233 + "," + field1234 + " - " + field1339 + "," + (field1335.field417[0] + field1099) + "," + (field1335.field418[0] + field1100) + " - ";
			for (int var152 = 0; var152 < field1339 && var152 < 50; var152++) {
				var151 = var151 + field1150.field622[var152] + ",";
			}

			signlink.reporterror(var151);
			method554();
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = class32.field550[var7];
			int var13 = class32.field551[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class32.field550[var8];
			int var16 = class32.field551[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1141 = arg3 - var9;
		field1142 = arg1 - var10;
		field1143 = arg2 - var11;
		field1144 = arg0;
		field1145 = arg4;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method451() {
		field1430 = new class37(field1111, "titlebox", 0);
		field1431 = new class37(field1111, "titlebutton", 0);
		field1357 = new class37[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1357[var1] = new class37(field1111, "runes", var1);
		}

		field1108 = new class36(128, 265);
		field1109 = new class36(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1108.field596[var2] = field1366.field655[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1109.field596[var3] = field1367.field655[var3];
		}

		field1180 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1180[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1180[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1180[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1180[var7 + 192] = 0xFFFFFF;
		}

		field1181 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1181[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1181[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1181[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1181[var11 + 192] = 0xFFFFFF;
		}

		field1182 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1182[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1182[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1182[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1182[var15 + 192] = 0xFFFFFF;
		}

		field1179 = new int[256];
		field1394 = new int[32768];
		field1395 = new int[32768];
		method454(null);
		field1247 = new int[32768];
		field1248 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1337) {
			field1098 = true;
			field1337 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIIIIB)V")
	public final void method452(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1085.method89(arg3, arg0, arg1);
		if (var6 != 0) {
			int var7 = field1085.method93(arg3, arg0, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field1107.field596;
			int var12 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method333(var13);
			if (var14.field839 == -1) {
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
				class37 var15 = field1133[var14.field839];
				if (var15 != null) {
					int var16 = (var14.field824 * 4 - var15.field605) / 2;
					int var17 = (var14.field825 * 4 - var15.field606) / 2;
					var15.method211(arg0 * 4 + var16 + 48, (104 - arg1 - var14.field825) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1085.method91(arg3, arg0, arg1);
		if (var18 != 0) {
			int var19 = field1085.method93(arg3, arg0, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method333(var22);
			if (var23.field839 != -1) {
				class37 var24 = field1133[var23.field839];
				if (var24 != null) {
					int var25 = (var23.field824 * 4 - var24.field605) / 2;
					int var26 = (var23.field825 * 4 - var24.field606) / 2;
					var24.method211(arg0 * 4 + var25 + 48, (104 - arg1 - var23.field825) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1107.field596;
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

		int var30 = field1085.method92(arg3, arg0, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method333(var31);
			if (var32.field839 != -1) {
				class37 var33 = field1133[var32.field839];
				if (var33 != null) {
					int var34 = (var32.field824 * 4 - var33.field605) / 2;
					int var35 = (var32.field825 * 4 - var33.field606) / 2;
					var33.method211(arg0 * 4 + var34 + 48, (104 - arg1 - var32.field825) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg1 >= 1 && arg5 <= 102 && arg1 <= 102) {
			if (field1298 && field1390 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field1085.method89(arg6, arg5, arg1);
			}

			if (arg3 == 1) {
				var8 = field1085.method90(arg6, arg5, arg1);
			}

			if (arg3 == 2) {
				var8 = field1085.method91(arg6, arg5, arg1);
			}

			if (arg3 == 3) {
				var8 = field1085.method92(arg6, arg5, arg1);
			}

			if (var8 != 0) {
				int var12 = field1085.method93(arg6, arg5, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field1085.method80(arg1, arg6, arg5);
					class57 var16 = class57.method333(var13);
					if (var16.field826) {
						field1379[arg6].method364(arg1, var15, arg5, var14, var16.field827);
					}
				}

				if (arg3 == 1) {
					field1085.method81(arg5, arg6, arg1);
				}

				if (arg3 == 2) {
					field1085.method82(arg1, arg6, arg5);
					class57 var17 = class57.method333(var13);
					if (var17.field824 + arg5 > 103 || var17.field824 + arg1 > 103 || var17.field825 + arg5 > 103 || var17.field825 + arg1 > 103) {
						return;
					}

					if (var17.field826) {
						field1379[arg6].method365(arg5, var17.field824, arg1, var17.field827, var15, var17.field825);
					}
				}

				if (arg3 == 3) {
					field1085.method83(arg5, arg6, arg1);
					class57 var18 = class57.method333(var13);
					if (var18.field826 && var18.field828) {
						field1379[arg6].method367(arg1, arg5);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field1419[1][arg5][arg1] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				class3.method31(field1362, field1085, arg6, arg1, arg5, arg4, var19, arg0, field1379[arg6], arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;)V")
	public final void method454(class37 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1394.length; var3++) {
			field1394[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1394[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1395[var9] = (field1394[var9 - 1] + field1394[var9 + 1] + field1394[var9 - 128] + field1394[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1394;
			field1394 = field1395;
			field1395 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1394[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;IB)V")
	public final void method455(class39 arg0, int arg1) {
		for (int var3 = 0; var3 < field1332; var3++) {
			int var4 = field1333[var3];
			class28 var5 = field1329[var4];
			int var6 = arg0.method238();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method238() << 8;
			}

			method548(var6, var4, var5, arg0);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1263.method257(); var11 != null; var11 = (class41) field1263.method259()) {
			if (var11.field639 == arg2 && var11.field641 == arg7 && var11.field642 == arg4 && var11.field640 == arg1) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field639 = arg2;
			var10.field640 = arg1;
			var10.field641 = arg7;
			var10.field642 = arg4;
			method521(var10);
			field1263.method254(var10);
		}

		var10.field646 = arg0;
		var10.field648 = arg8;
		var10.field647 = arg3;
		var10.field649 = arg5;
		var10.field650 = arg6;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method457(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method458(boolean arg0) {
		for (int var2 = 0; var2 < field1291; var2++) {
			class27 var3 = field1290[field1292[var2]];
			int var4 = (field1292[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method126() && var3.field422.field886 == arg0) {
				int var5 = var3.field368 >> 7;
				int var6 = var3.field369 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field372 == 1 && (var3.field368 & 0x7F) == 0x40 && (var3.field369 & 0x7F) == 0x40) {
						if (field1414[var5][var6] == field1427) {
							continue;
						}

						field1414[var5][var6] = field1427;
					}

					field1085.method74((var3.field372 - 1) * 64 + 60, var3.field369, var3.field370, var3.field368, var4, field1390, var3.field371, method526(var3.field369, field1390, var3.field368), var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLz;I)V")
	public final void method459(class26 arg0, int arg1) {
		method460(arg0.field369, arg1, arg0.field368);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method460(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method526(arg0, field1390, arg2) - arg1;
			arg2 -= field1141;
			var4 -= field1142;
			arg0 -= field1143;
			int var5 = class32.field550[field1144];
			int var6 = class32.field551[field1144];
			int var7 = class32.field550[field1145];
			int var8 = class32.field551[field1145];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1164 = (var9 << 9) / arg0 + class35.field578;
				field1165 = (var11 << 9) / arg0 + class35.field579;
			} else {
				field1164 = -1;
				field1165 = -1;
			}
		} else {
			field1164 = -1;
			field1165 = -1;
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method461() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1269) {
			field1337 = false;
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

		if (field1112) {
			field1337 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1135) {
			field1337 = false;
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

	@ObfuscatedName("client.a(BI)V")
	public final void method462(int arg0) {
		if (arg0 >= 0) {
			if (field1034) {
				field1034 = false;
				field1302 = true;
			}

			int var2 = field1347[arg0];
			int var3 = field1348[arg0];
			int var4 = field1349[arg0];
			int var5 = field1350[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 465) {
				field1041.method227(177);
				field1041.method229(var3);
				class4 var6 = class4.field57[var3];
				if (var6.field72 != null && var6.field72[0][0] == 5) {
					int var7 = var6.field72[0][1];
					field1283[var7] = 1 - field1283[var7];
					method437(var7);
					field1421 = true;
				}
			}

			if (var4 == 881) {
				field1041.method227(126);
				field1041.method229(var5);
				field1041.method229(var2);
				field1041.method229(var3);
				field1041.method229(field1253);
				field1041.method229(field1251);
				field1041.method229(field1252);
				field1432 = 0;
				field1433 = var3;
				field1434 = var2;
				field1435 = 2;
				if (class4.field57[var3].field63 == field1054) {
					field1435 = 1;
				}

				if (class4.field57[var3].field63 == field1172) {
					field1435 = 3;
				}
			}

			if (var4 == 1102) {
				class60 var8 = class60.method348(var5);
				String var9;
				if (var8.field900 == null) {
					var9 = "It's a " + var8.field899 + ".";
				} else {
					var9 = new String(var8.field900);
				}

				method435("", 0, var9);
			}

			if (var4 == 581) {
				if ((var5 & 0x3) == 0) {
					field1196++;
				}

				if (field1196 >= 99) {
					field1041.method227(87);
					field1041.method232(0);
				}

				method540(var5, 204, var2, var3);
			}

			if (var4 == 1607) {
				class27 var10 = field1290[var5];
				if (var10 != null) {
					String var11;
					if (var10.field422.field866 == null) {
						var11 = "It's a " + var10.field422.field865 + ".";
					} else {
						var11 = new String(var10.field422.field866);
					}

					method435("", 0, var11);
				}
			}

			if (var4 == 1175) {
				int var12 = var5 >> 14 & 0x7FFF;
				class57 var13 = class57.method333(var12);
				String var14;
				if (var13.field821 == null) {
					var14 = "It's a " + var13.field820 + ".";
				} else {
					var14 = new String(var13.field821);
				}

				method435("", 0, var14);
			}

			if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
				class27 var15 = field1290[var5];
				if (var15 != null) {
					method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var15.field417[0], false, var15.field418[0], field1335.field417[0]);
					field1136 = field24;
					field1137 = field25;
					field1139 = 2;
					field1138 = 0;

					if (var4 == 728) {
						field1041.method227(180);
					}

					if (var4 == 963) {
						field1041.method227(107);
					}

					if (var4 == 542) {
						field1041.method227(252);
					}

					if (var4 == 6) {
						if ((var5 & 0x3) == 0) {
							field1401++;
						}

						if (field1401 >= 124) {
							field1041.method227(95);
							field1041.method232(0);
						}

						field1041.method227(196);
					}

					if (var4 == 245) {
						if ((var5 & 0x3) == 0) {
							field1260++;
						}

						if (field1260 >= 85) {
							field1041.method227(186);
							field1041.method229(39596);
						}

						field1041.method227(43);
					}

					field1041.method229(var5);
				}
			}

			if (var4 == 1773) {
				class60 var16 = class60.method348(var5);
				String var17;
				if (var3 >= 100000) {
					var17 = var3 + " x " + var16.field899;
				} else if (var16.field900 == null) {
					var17 = "It's a " + var16.field899 + ".";
				} else {
					var17 = new String(var16.field900);
				}

				method435("", 0, var17);
			}

			if (var4 == 188) {
				field1250 = 1;
				field1251 = var2;
				field1252 = var3;
				field1253 = var5;
				field1254 = class60.method348(var5).field899;
				field1152 = 0;
				field1421 = true;
			} else {
				if (var4 == 900) {
					class27 var18 = field1290[var5];
					if (var18 != null) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var18.field417[0], false, var18.field418[0], field1335.field417[0]);
						field1136 = field24;
						field1137 = field25;
						field1139 = 2;
						field1138 = 0;
						field1041.method227(14);
						field1041.method229(var5);
						field1041.method229(field1253);
						field1041.method229(field1251);
						field1041.method229(field1252);
					}
				}

				if (var4 == 217) {
					boolean var19 = method429(0, 0, 2, 0, field1335.field418[0], 0, 0, var2, false, var3, field1335.field417[0]);
					if (!var19) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var2, false, var3, field1335.field417[0]);
					}

					field1136 = field24;
					field1137 = field25;
					field1139 = 2;
					field1138 = 0;
					field1041.method227(143);
					field1041.method229(field1099 + var2);
					field1041.method229(field1100 + var3);
					field1041.method229(var5);
					field1041.method229(field1253);
					field1041.method229(field1251);
					field1041.method229(field1252);
				}

				if (var4 == 651) {
					class28 var21 = field1329[var5];
					if (var21 != null) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var21.field417[0], false, var21.field418[0], field1335.field417[0]);
						field1136 = field24;
						field1137 = field25;
						field1139 = 2;
						field1138 = 0;
						field1041.method227(52);
						field1041.method229(var5);
						field1041.method229(field1153);
					}
				}

				if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
					if (var4 == 22) {
						field1041.method227(48);
					}

					if (var4 == 415) {
						if ((var3 & 0x3) == 0) {
							field1166++;
						}

						if (field1166 >= 55) {
							field1041.method227(119);
							field1041.method232(0);
						}

						field1041.method227(242);
					}

					if (var4 == 892) {
						if ((var2 & 0x3) == 0) {
							field1157++;
						}

						if (field1157 >= 130) {
							field1041.method227(233);
							field1041.method228(177);
						}

						field1041.method227(183);
					}

					if (var4 == 602) {
						field1041.method227(13);
					}

					if (var4 == 596) {
						field1041.method227(58);
					}

					field1041.method229(var5);
					field1041.method229(var2);
					field1041.method229(var3);
					field1432 = 0;
					field1433 = var3;
					field1434 = var2;
					field1435 = 2;
					if (class4.field57[var3].field63 == field1054) {
						field1435 = 1;
					}

					if (class4.field57[var3].field63 == field1172) {
						field1435 = 3;
					}
				}

				if (var4 == 951) {
					class4 var22 = class4.field57[var3];
					boolean var23 = true;
					if (var22.field66 > 0) {
						var23 = method529(var22);
					}

					if (var23) {
						field1041.method227(177);
						field1041.method229(var3);
					}
				}

				if (var4 == 504) {
					method540(var5, 219, var2, var3);
				}

				if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
					if (var4 == 38) {
						field1041.method227(193);
					}

					if (var4 == 347) {
						field1041.method227(9);
					}

					if (var4 == 478) {
						if ((var2 & 0x3) == 0) {
							field1402++;
						}

						if (field1402 >= 90) {
							field1041.method227(74);
						}

						field1041.method227(194);
					}

					if (var4 == 422) {
						field1041.method227(115);
					}

					if (var4 == 405) {
						field1029 += var5;
						if (field1029 >= 97) {
							field1041.method227(146);
							field1041.method231(0xE42D58);
						}

						field1041.method227(104);
					}

					field1041.method229(var5);
					field1041.method229(var2);
					field1041.method229(var3);
					field1432 = 0;
					field1433 = var3;
					field1434 = var2;
					field1435 = 2;
					if (class4.field57[var3].field63 == field1054) {
						field1435 = 1;
					}

					if (class4.field57[var3].field63 == field1172) {
						field1435 = 3;
					}
				}

				if (var4 == 965) {
					boolean var24 = method429(0, 0, 2, 0, field1335.field418[0], 0, 0, var2, false, var3, field1335.field417[0]);
					if (!var24) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var2, false, var3, field1335.field417[0]);
					}

					field1136 = field24;
					field1137 = field25;
					field1139 = 2;
					field1138 = 0;
					field1041.method227(122);
					field1041.method229(field1099 + var2);
					field1041.method229(field1100 + var3);
					field1041.method229(var5);
					field1041.method229(field1153);
				}

				if (var4 == 367) {
					class28 var26 = field1329[var5];
					if (var26 != null) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var26.field417[0], false, var26.field418[0], field1335.field417[0]);
						field1136 = field24;
						field1137 = field25;
						field1139 = 2;
						field1138 = 0;
						field1041.method227(210);
						field1041.method229(var5);
						field1041.method229(field1253);
						field1041.method229(field1251);
						field1041.method229(field1252);
					}
				}

				if (var4 == 947) {
					method517();
				}

				if (var4 == 44 && !field1202) {
					field1041.method227(239);
					field1041.method229(var3);
					field1202 = true;
				}

				if (var4 == 1501) {
					field1193 += field1100;
					if (field1193 >= 92) {
						field1041.method227(250);
						field1041.method232(0);
					}

					method540(var5, 86, var2, var3);
				}

				if (var4 == 960) {
					field1041.method227(177);
					field1041.method229(var3);
					class4 var27 = class4.field57[var3];
					if (var27.field72 != null && var27.field72[0][0] == 5) {
						int var28 = var27.field72[0][1];
						if (field1283[var28] != var27.field74[0]) {
							field1283[var28] = var27.field74[0];
							method437(var28);
							field1421 = true;
						}
					}
				}

				if (var4 == 364) {
					method540(var5, 226, var2, var3);
				}

				if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
					class28 var29 = field1329[var5];
					if (var29 != null) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var29.field417[0], false, var29.field418[0], field1335.field417[0]);
						field1136 = field24;
						field1137 = field25;
						field1139 = 2;
						field1138 = 0;

						if (var4 == 1101) {
							field1041.method227(135);
						}

						if (var4 == 1373) {
							field1041.method227(54);
						}

						if (var4 == 1544) {
							field1041.method227(172);
						}

						if (var4 == 151) {
							field1301++;
							if (field1301 >= 90) {
								field1041.method227(171);
								field1041.method229(31114);
							}

							field1041.method227(165);
						}

						field1041.method229(var5);
					}
				}

				if (var4 == 285) {
					method540(var5, 1, var2, var3);
				}

				if (var4 == 55 && method540(var5, 208, var2, var3)) {
					field1041.method229(field1153);
				}

				if (var4 == 903 || var4 == 363) {
					String var30 = field1203[arg0];
					int var31 = var30.indexOf("@whi@");
					if (var31 != -1) {
						var30 = var30.substring(var31 + 5).trim();
						String var32 = class52.method313(class52.method310(class52.method309(var30)));
						boolean var33 = false;
						for (int var34 = 0; var34 < field1330; var34++) {
							class28 var35 = field1329[field1331[var34]];
							if (var35 != null && var35.field423 != null && var35.field423.equalsIgnoreCase(var32)) {
								method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var35.field417[0], false, var35.field418[0], field1335.field417[0]);

								if (var4 == 903) {
									field1041.method227(54);
								}

								if (var4 == 363) {
									field1041.method227(135);
								}

								field1041.method229(field1331[var34]);
								var33 = true;
								break;
							}
						}

						if (!var33) {
							method435("", 0, "Unable to find " + var32);
						}
					}
				}

				if (var4 == 265) {
					class27 var36 = field1290[var5];
					if (var36 != null) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var36.field417[0], false, var36.field418[0], field1335.field417[0]);
						field1136 = field24;
						field1137 = field25;
						field1139 = 2;
						field1138 = 0;
						field1041.method227(141);
						field1041.method229(var5);
						field1041.method229(field1153);
					}
				}

				if (var4 == 660) {
					if (field1235) {
						field1085.method101(var2 - 4, var3 - 4);
					} else {
						field1085.method101(field24 - 4, field25 - 4);
					}
				}

				if (var4 == 34) {
					String var37 = field1203[arg0];
					int var38 = var37.indexOf("@whi@");
					if (var38 != -1) {
						method517();
						field1380 = var37.substring(var38 + 5).trim();
						field1048 = false;

						for (int var39 = 0; var39 < class4.field57.length; var39++) {
							if (class4.field57[var39] != null && class4.field57[var39].field66 == 600) {
								field1404 = field1054 = class4.field57[var39].field63;
								break;
							}
						}
					}
				}

				if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
					String var40 = field1203[arg0];
					int var41 = var40.indexOf("@whi@");
					if (var41 != -1) {
						long var42 = class52.method309(var40.substring(var41 + 5).trim());
						if (var4 == 406) {
							method530(var42);
						}

						if (var4 == 436) {
							method467(var42);
						}

						if (var4 == 557) {
							method471(var42);
						}

						if (var4 == 556) {
							method549(var42);
						}
					}
				}

				if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
					boolean var44 = method429(0, 0, 2, 0, field1335.field418[0], 0, 0, var2, false, var3, field1335.field417[0]);
					if (!var44) {
						method429(0, 1, 2, 0, field1335.field418[0], 1, 0, var2, false, var3, field1335.field417[0]);
					}

					field1136 = field24;
					field1137 = field25;
					field1139 = 2;
					field1138 = 0;

					if (var4 == 99) {
						field1041.method227(55);
					}

					if (var4 == 993) {
						field1041.method227(238);
					}

					if (var4 == 224) {
						field1041.method227(113);
					}

					if (var4 == 877) {
						field1041.method227(247);
					}

					if (var4 == 746) {
						field1041.method227(17);
					}

					field1041.method229(field1099 + var2);
					field1041.method229(field1100 + var3);
					field1041.method229(var5);
				}

				if (var4 == 930) {
					class4 var46 = class4.field57[var3];
					field1152 = 1;
					field1153 = var3;
					field1154 = var46.field117;
					field1250 = 0;
					field1421 = true;
					String var47 = var46.field115;
					if (var47.indexOf(" ") != -1) {
						var47 = var47.substring(0, var47.indexOf(" "));
					}

					String var48 = var46.field115;
					if (var48.indexOf(" ") != -1) {
						var48 = var48.substring(var48.indexOf(" ") + 1);
					}

					field1155 = var47 + " " + var46.field116 + " " + var48;

					if (field1154 == 16) {
						field1421 = true;
						field1265 = 3;
						field1392 = true;
					}
				} else {
					if (var4 == 679) {
						String var49 = field1203[arg0];
						int var50 = var49.indexOf("@whi@");
						if (var50 != -1) {
							long var51 = class52.method309(var49.substring(var50 + 5).trim());
							int var53 = -1;
							for (int var54 = 0; var54 < field1183; var54++) {
								if (field1191[var54] == var51) {
									var53 = var54;
									break;
								}
							}

							if (var53 != -1 && field1270[var53] > 0) {
								field1302 = true;
								field1034 = false;
								field1094 = true;
								field1245 = "";
								field1423 = 3;
								field1282 = field1191[var53];
								field1091 = "Enter message to send to " + field1344[var53];
							}
						}
					}

					if (var4 == 391) {
						field1041.method227(188);
						field1041.method229(var5);
						field1041.method229(var2);
						field1041.method229(var3);
						field1041.method229(field1153);
						field1432 = 0;
						field1433 = var3;
						field1434 = var2;
						field1435 = 2;
						if (class4.field57[var3].field63 == field1054) {
							field1435 = 1;
						}

						if (class4.field57[var3].field63 == field1172) {
							field1435 = 3;
						}
					}

					if (var4 == 450 && method540(var5, 147, var2, var3)) {
						field1041.method229(field1253);
						field1041.method229(field1251);
						field1041.method229(field1252);
					}

					field1250 = 0;
					field1152 = 0;
					field1421 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;IZ)V")
	public final void method463(class39 arg0, int arg1) {
		arg0.method248();
		int var3 = arg0.method249(8);
		if (var3 < field1291) {
			for (int var4 = var3; var4 < field1291; var4++) {
				field1359[field1358++] = field1292[var4];
			}
		}

		if (var3 > field1291) {
			signlink.reporterror(field1035 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1291 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1292[var5];
			class27 var7 = field1290[var6];
			int var8 = arg0.method249(1);
			if (var8 == 0) {
				field1292[field1291++] = var6;
				var7.field413 = field1259;
			} else {
				int var9 = arg0.method249(2);
				if (var9 == 0) {
					field1292[field1291++] = var6;
					var7.field413 = field1259;
					field1333[field1332++] = var6;
				} else if (var9 == 1) {
					field1292[field1291++] = var6;
					var7.field413 = field1259;
					int var10 = arg0.method249(3);
					var7.method124(false, var10);
					int var11 = arg0.method249(1);
					if (var11 == 1) {
						field1333[field1332++] = var6;
					}
				} else if (var9 == 2) {
					field1292[field1291++] = var6;
					var7.field413 = field1259;
					int var12 = arg0.method249(3);
					var7.method124(true, var12);
					int var13 = arg0.method249(3);
					var7.method124(true, var13);
					int var14 = arg0.method249(1);
					if (var14 == 1) {
						field1333[field1332++] = var6;
					}
				} else if (var9 == 3) {
					field1359[field1358++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method464() {
		field1093 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1337) {
				field1082++;
				method493();
				method493();
				method512();
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

		field1093 = false;
	}

	@ObfuscatedName("client.a(ILbb;III)V")
	public final void method465(class28 arg0, int arg1, int arg2, int arg3) {
		if (field1335 != arg0 && field1050 < 400) {
			String var5 = arg0.field423 + method436(field1335.field429, arg0.field429) + " (level-" + arg0.field429 + ")";
			if (field1250 == 1) {
				field1203[field1050] = "Use " + field1254 + " with @whi@" + var5;
				field1349[field1050] = 367;
				field1350[field1050] = arg2;
				field1347[field1050] = arg1;
				field1348[field1050] = arg3;
				field1050++;
			} else if (field1152 != 1) {
				field1203[field1050] = "Follow @whi@" + var5;
				field1349[field1050] = 1544;
				field1350[field1050] = arg2;
				field1347[field1050] = arg1;
				field1348[field1050] = arg3;
				field1050++;
				if (field1286 == 0) {
					field1203[field1050] = "Trade with @whi@" + var5;
					field1349[field1050] = 1373;
					field1350[field1050] = arg2;
					field1347[field1050] = arg1;
					field1348[field1050] = arg3;
					field1050++;
				}

				if (field1079 > 0) {
					field1203[field1050] = "Attack @whi@" + var5;

					if (field1335.field429 >= arg0.field429) {
						field1349[field1050] = 151;
					} else {
						field1349[field1050] = 2151;
					}

					field1350[field1050] = arg2;
					field1347[field1050] = arg1;
					field1348[field1050] = arg3;
					field1050++;
				}

				if (field1118 == 1) {
					field1203[field1050] = "Fight @whi@" + var5;
					field1349[field1050] = 151;
					field1350[field1050] = arg2;
					field1347[field1050] = arg1;
					field1348[field1050] = arg3;
					field1050++;
				}

				if (field1118 == 2) {
					field1203[field1050] = "Duel-with @whi@" + var5;
					field1349[field1050] = 1101;
					field1350[field1050] = arg2;
					field1347[field1050] = arg1;
					field1348[field1050] = arg3;
					field1050++;
				}
			} else if ((field1154 & 0x8) == 8) {
				field1203[field1050] = field1155 + " @whi@" + var5;
				field1349[field1050] = 651;
				field1350[field1050] = arg2;
				field1347[field1050] = arg1;
				field1348[field1050] = arg3;
				field1050++;
			}

			for (int var6 = 0; var6 < field1050; var6++) {
				if (field1349[var6] == 660) {
					field1203[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)V")
	public final void method466(class4 arg0) {
		int var2 = arg0.field66;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 > 700) {
				var2 -= 601;
			} else {
				var2--;
			}

			if (var2 >= field1183) {
				arg0.field98 = "";
				arg0.field65 = 0;
			} else {
				arg0.field98 = field1344[var2];
				arg0.field65 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= field1183) {
				arg0.field98 = "";
				arg0.field65 = 0;
			} else {
				if (field1270[var2] == 0) {
					arg0.field98 = "@red@Offline";
				} else if (field1270[var2] == field1295) {
					arg0.field98 = "@gre@World-" + (field1270[var2] - 9);
				} else {
					arg0.field98 = "@yel@World-" + (field1270[var2] - 9);
				}

				arg0.field65 = 1;
			}
		} else if (var2 == 203) {
			arg0.field76 = field1183 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1185) {
				arg0.field98 = "";
				arg0.field65 = 0;
			} else {
				arg0.field98 = class52.method313(class52.method310(field1338[var2]));
				arg0.field65 = 1;
			}
		} else if (var2 == 503) {
			arg0.field76 = field1185 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 == 327) {
			arg0.field113 = 150;
			arg0.field114 = (int) (Math.sin(field1259 / 40.0D) * 256.0D) & 0x7FF;

			if (field1238) {
				for (int var3 = 0; var3 < 7; var3++) {
					int var4 = field1090[var3];
					if (var4 >= 0 && !class64.field959[var4].method377()) {
						return;
					}
				}

				field1238 = false;
				class32[] var5 = new class32[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1090[var7];
					if (var8 >= 0) {
						var5[var6++] = class64.field959[var8].method378();
					}
				}

				class32 var9 = new class32(var5, var6);
				for (int var10 = 0; var10 < 5; var10++) {
					if (field1215[var10] != 0) {
						var9.method152(field1053[var10][0], field1053[var10][field1215[var10]]);

						if (var10 == 1) {
							var9.method152(field1126[0], field1126[field1215[var10]]);
						}
					}
				}

				var9.method145();
				var9.method146(class66.field978[field1335.field373].field980[0]);
				var9.method155(64, 850, -30, -50, -30, true);
				arg0.field106 = 5;
				arg0.field107 = 0;
				class4.method36(var9, 0, 5);
			}
		} else if (var2 == 324) {
			if (field1210 == null) {
				field1210 = arg0.field104;
				field1211 = arg0.field105;
			}

			if (field1244) {
				arg0.field104 = field1211;
			} else {
				arg0.field104 = field1210;
			}
		} else if (var2 == 325) {
			if (field1210 == null) {
				field1210 = arg0.field104;
				field1211 = arg0.field105;
			}

			if (field1244) {
				arg0.field104 = field1210;
			} else {
				arg0.field104 = field1211;
			}
		} else if (var2 == 600) {
			arg0.field98 = field1380;
			if (field1259 % 20 < 10) {
				arg0.field98 = arg0.field98 + "|";
			} else {
				arg0.field98 = arg0.field98 + " ";
			}
		} else if (var2 == 613) {
			if (field1322 < 1) {
				arg0.field98 = "";
			} else if (field1048) {
				arg0.field100 = 0xFF0000;
				arg0.field98 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field100 = 0xFFFFFF;
				arg0.field98 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1032 == 0) {
				arg0.field98 = "";
			} else {
				String var11;
				if (field1209 == 0) {
					var11 = "earlier today";
				} else if (field1209 == 1) {
					var11 = "yesterday";
				} else {
					var11 = field1209 + " days ago";
				}

				arg0.field98 = "You last logged in " + var11 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1294 == 0) {
				arg0.field98 = "0 unread messages";
				arg0.field100 = 0xFFFF00;
			}

			if (field1294 == 1) {
				arg0.field98 = "1 unread message";
				arg0.field100 = 0xFF00;
			}

			if (field1294 > 1) {
				arg0.field98 = field1294 + " unread messages";
				arg0.field100 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1161 == 201) {
				if (field1122 == 1) {
					arg0.field98 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field98 = "";
				}
			} else if (field1161 == 200) {
				arg0.field98 = "You have not yet set any password recovery questions.";
			} else {
				String var12;
				if (field1161 == 0) {
					var12 = "Earlier today";
				} else if (field1161 == 1) {
					var12 = "Yesterday";
				} else {
					var12 = field1161 + " days ago";
				}

				arg0.field98 = var12 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1161 == 201) {
				if (field1122 == 1) {
					arg0.field98 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field98 = "";
				}
			} else if (field1161 == 200) {
				arg0.field98 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field98 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1161 == 201) {
				if (field1122 == 1) {
					arg0.field98 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field98 = "";
				}
			} else if (field1161 == 200) {
				arg0.field98 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field98 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method467(long arg0) {
		if (arg0 != 0L) {
			if (field1185 >= 100) {
				method435("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class52.method313(class52.method310(arg0));
				for (int var4 = 0; var4 < field1185; var4++) {
					if (field1338[var4] == arg0) {
						method435("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1183; var5++) {
					if (field1191[var5] == arg0) {
						method435("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1338[field1185++] = arg0;
				field1421 = true;
				field1041.method227(20);
				field1041.method234(arg0);
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method468() {
		if (field1169 == 0) {
			field1203[0] = "Cancel";
			field1349[0] = 1252;
			field1050 = 1;
			method546();
			field1412 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1054 == -1) {
					method532();
				} else {
					method494(4, field18, 0, class4.field57[field1054], field17, 4);
				}
			}

			if (field1412 != field1089) {
				field1089 = field1412;
			}

			field1412 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1073 != -1) {
					method494(553, field18, 0, class4.field57[field1073], field17, 205);
				} else if (field1428[field1265] != -1) {
					method494(553, field18, 0, class4.field57[field1428[field1265]], field17, 205);
				}
			}

			if (field1412 != field1264) {
				field1421 = true;
				field1264 = field1412;
			}

			field1412 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1172 != -1) {
					method494(17, field18, 0, class4.field57[field1172], field17, 357);
				} else if (field18 < 434 && field17 < 426) {
					method531(field17 - 17, field18 - 357);
				}
			}

			if (field1172 != -1 && field1412 != field1051) {
				field1302 = true;
				field1051 = field1412;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1050 - 1; var2++) {
					if (field1349[var2] < 1000 && field1349[var2 + 1] > 1000) {
						String var3 = field1203[var2];
						field1203[var2] = field1203[var2 + 1];
						field1203[var2 + 1] = var3;
						int var4 = field1349[var2];
						field1349[var2] = field1349[var2 + 1];
						field1349[var2 + 1] = var4;
						int var5 = field1347[var2];
						field1347[var2] = field1347[var2 + 1];
						field1347[var2 + 1] = var5;
						int var6 = field1348[var2];
						field1348[var2] = field1348[var2 + 1];
						field1348[var2 + 1] = var6;
						int var7 = field1350[var2];
						field1350[var2] = field1350[var2 + 1];
						field1350[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method469() {
		class57.field851.method116();
		class57.field852.method116();
		class59.field890.method116();
		class60.field936.method116();
		class60.field937.method116();
		class28.field444.method116();
		class67.field1007.method116();
	}

	@ObfuscatedName("client.q(I)V")
	public static final void method470() {
		class19.field266 = false;
		class35.field573 = false;
		field1298 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method471(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1183; var3++) {
				if (field1191[var3] == arg0) {
					field1183--;
					field1421 = true;

					for (int var4 = var3; var4 < field1183; var4++) {
						field1344[var4] = field1344[var4 + 1];
						field1270[var4] = field1270[var4 + 1];
						field1191[var4] = field1191[var4 + 1];
					}

					field1041.method227(61);
					field1041.method234(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method472(int arg0, class39 arg1) {
		field1358 = 0;
		field1332 = 0;
		method463(arg1, arg0);
		method520(arg0, arg1);
		method502(arg1, arg0);

		for (int var3 = 0; var3 < field1358; var3++) {
			int var4 = field1359[var3];
			if (field1259 != field1290[var4].field413) {
				field1290[var4].field422 = null;
				field1290[var4] = null;
			}
		}

		if (arg1.field623 != arg0) {
			signlink.reporterror(field1035 + " size mismatch in getnpcpos - pos:" + arg1.field623 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1291; var5++) {
			if (field1290[field1292[var5]] == null) {
				signlink.reporterror(field1035 + " null entry in npc list - pos:" + var5 + " size:" + field1291);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ld;IZII)V")
	public final void method473(class4 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field64 == 0 && arg0.field79 != null && (!arg0.field78 || field1089 == arg0.field62 || field1264 == arg0.field62 || field1051 == arg0.field62)) {
			int var5 = class34.field568;
			int var6 = class34.field566;
			int var7 = class34.field569;
			int var8 = class34.field567;
			class34.method166(arg3, arg0.field67 + arg1, arg0.field68 + arg3, arg1);
			int var9 = arg0.field79.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field80[var10] + arg1;
				int var12 = arg0.field81[var10] + arg3 - arg2;
				class4 var13 = class4.field57[arg0.field79[var10]];
				var11 += var13.field70;
				var12 += var13.field71;

				if (var13.field66 > 0) {
					method466(var13);
				}

				if (var13.field64 == 0) {
					if (var13.field77 > var13.field76 - var13.field68) {
						var13.field77 = var13.field76 - var13.field68;
					}

					if (var13.field77 < 0) {
						var13.field77 = 0;
					}

					method473(var13, var11, var13.field77, var12);

					if (var13.field76 > var13.field68) {
						method538(var12, var13.field67 + var11, var13.field77, var13.field76, var13.field68);
					}
				} else if (var13.field64 != 1) {
					if (var13.field64 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field68; var15++) {
							for (int var16 = 0; var16 < var13.field67; var16++) {
								int var17 = (var13.field88 + 32) * var16 + var11;
								int var18 = (var13.field89 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field91[var14];
									var18 += var13.field92[var14];
								}

								if (var13.field58[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field58[var14] - 1;
									if (var17 > class34.field568 - 32 && var17 < class34.field569 && var18 > class34.field566 - 32 && var18 < class34.field567 || field1169 != 0 && field1168 == var14) {
										int var22 = 0;
										if (field1250 == 1 && field1251 == var14 && field1252 == var13.field62) {
											var22 = 0xFFFFFF;
										}

										class36 var23 = class60.method354(var22, var13.field59[var14], var21);
										if (var23 != null) {
											if (field1169 != 0 && field1168 == var14 && field1167 == var13.field62) {
												var19 = field17 - field1170;
												var20 = field18 - field1171;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1246 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method200(128, var18 + var20, var17 + var19);

												if (var18 + var20 < class34.field566 && arg0.field77 > 0) {
													int var24 = (class34.field566 - var18 - var20) * field1120 / 3;
													if (var24 > field1120 * 10) {
														var24 = field1120 * 10;
													}

													if (var24 > arg0.field77) {
														var24 = arg0.field77;
													}

													arg0.field77 -= var24;
													field1171 += var24;
												}

												if (var18 + var20 + 32 > class34.field567 && arg0.field77 < arg0.field76 - arg0.field68) {
													int var25 = (var18 + var20 + 32 - class34.field567) * field1120 / 3;
													if (var25 > field1120 * 10) {
														var25 = field1120 * 10;
													}

													if (var25 > arg0.field76 - arg0.field68 - arg0.field77) {
														var25 = arg0.field76 - arg0.field68 - arg0.field77;
													}

													arg0.field77 += var25;
													field1171 -= var25;
												}
											} else if (field1435 != 0 && field1434 == var14 && field1433 == var13.field62) {
												var23.method200(128, var18, var17);
											} else {
												var23.method198(var17, var18);
											}

											if (var23.field601 == 33 || var13.field59[var14] != 1) {
												int var26 = var13.field59[var14];
												field1127.method216(method497(var26), 0, var17 + var19 + 1, var18 + 10 + var20);
												field1127.method216(method497(var26), 0xFFFF00, var17 + var19, var18 + 9 + var20);
											}
										}
									}
								} else if (var13.field90 != null && var14 < 20) {
									class36 var27 = var13.field90[var14];
									if (var27 != null) {
										var27.method198(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field64 == 3) {
						boolean var28 = false;
						if (field1051 == var13.field62 || field1264 == var13.field62 || field1089 == var13.field62) {
							var28 = true;
						}

						int var29;
						if (method547(var13)) {
							var29 = var13.field101;
							if (var28 && var13.field103 != 0) {
								var29 = var13.field103;
							}
						} else {
							var29 = var13.field100;
							if (var28 && var13.field102 != 0) {
								var29 = var13.field102;
							}
						}

						if (var13.field69 == 0) {
							if (var13.field94) {
								class34.method169(var12, var13.field68, var11, var13.field67, var29);
							} else {
								class34.method170(var11, var13.field68, var12, var13.field67, var29);
							}
						} else if (var13.field94) {
							class34.method168(var11, var13.field68, var12, var29, 256 - (var13.field69 & 0xFF), var13.field67);
						} else {
							class34.method171(var13.field67, var11, var12, 256 - (var13.field69 & 0xFF), var29, var13.field68);
						}
					} else if (var13.field64 == 4) {
						class38 var30 = var13.field97;
						String var31 = var13.field98;
						boolean var32 = false;
						if (field1051 == var13.field62 || field1264 == var13.field62 || field1089 == var13.field62) {
							var32 = true;
						}

						int var33;
						if (method547(var13)) {
							var33 = var13.field101;
							if (var32 && var13.field103 != 0) {
								var33 = var13.field103;
							}

							if (var13.field99.length() > 0) {
								var31 = var13.field99;
							}
						} else {
							var33 = var13.field100;
							if (var32 && var13.field102 != 0) {
								var33 = var13.field102;
							}
						}

						if (var13.field65 == 6 && field1202) {
							var31 = "Please wait...";
							var33 = var13.field100;
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

									var31 = var31.substring(0, var35) + method516(method552(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method516(method552(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method516(method552(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method516(method552(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method516(method552(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field95) {
								var30.method214(var13.field96, var34, var33, var13.field67 / 2 + var11, var41);
							} else {
								var30.method218(var33, var11, var34, var13.field96, var41);
							}

							var34 += var30.field618;
						}
					} else if (var13.field64 == 5) {
						class36 var42;
						if (method547(var13)) {
							var42 = var13.field105;
						} else {
							var42 = var13.field104;
						}

						if (var42 != null) {
							var42.method198(var11, var12);
						}
					} else if (var13.field64 == 6) {
						int var43 = class35.field578;
						int var44 = class35.field579;
						class35.field578 = var13.field67 / 2 + var11;
						class35.field579 = var13.field68 / 2 + var12;
						int var45 = class35.field582[var13.field113] * var13.field112 >> 16;
						int var46 = class35.field583[var13.field113] * var13.field112 >> 16;
						boolean var47 = method547(var13);
						int var48;
						if (var47) {
							var48 = var13.field111;
						} else {
							var48 = var13.field110;
						}

						class32 var49;
						if (var48 == -1) {
							var49 = var13.method34(-1, var47, -1);
						} else {
							class66 var50 = class66.field978[var48];
							var49 = var13.method34(var50.field980[var13.field60], var47, var50.field981[var13.field60]);
						}

						if (var49 != null) {
							var49.method158(0, var13.field114, 0, var13.field113, 0, var45, var46);
						}

						class35.field578 = var43;
						class35.field579 = var44;
					} else if (var13.field64 == 7) {
						class38 var51 = var13.field97;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field68; var53++) {
							for (int var54 = 0; var54 < var13.field67; var54++) {
								if (var13.field58[var52] > 0) {
									class60 var55 = class60.method348(var13.field58[var52] - 1);
									String var56 = var55.field899;
									if (var55.field910 || var13.field59[var52] != 1) {
										var56 = var56 + " x" + method482(var13.field59[var52]);
									}

									int var57 = (var13.field88 + 115) * var54 + var11;
									int var58 = (var13.field89 + 12) * var53 + var12;
									if (var13.field95) {
										var51.method214(var13.field96, var58, var13.field100, var13.field67 / 2 + var57, var56);
									} else {
										var51.method218(var13.field100, var57, var58, var13.field96, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class34.method166(var6, var7, var8, var5);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method474() {
		while (true) {
			class40 var1 = field1381.method290();
			if (var1 == null) {
				return;
			}

			if (var1.field634 == 0) {
				class32.method136(var1.field635, var1.field636);

				if ((field1381.method286(var1.field635) & 0x62) != 0) {
					field1421 = true;

					if (field1172 != -1) {
						field1302 = true;
					}
				}
			}

			if (var1.field634 == 1 && var1.field636 != null) {
				class8.method59(var1.field636);
			}

			if (var1.field634 == 2 && field1162 == var1.field635 && var1.field636 != null) {
				method542(field1163, var1.field636);
			}

			if (var1.field634 == 3 && field1318 == 1) {
				for (int var2 = 0; var2 < field1064.length; var2++) {
					if (field1354[var2] == var1.field635) {
						field1064[var2] = var1.field636;

						if (var1.field636 == null) {
							field1354[var2] = -1;
						}

						break;
					}

					if (field1355[var2] == var1.field635) {
						field1360[var2] = var1.field636;

						if (var1.field636 == null) {
							field1355[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field634 == 93 && field1381.method285(var1.field635)) {
				class3.method17(new class39(var1.field636), field1381);
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method475() {
		if (field1298 && field1318 == 2 && class3.field33 != field1390) {
			field1241.method267();
			field1128.method213(0, 257, 151, "Loading - please wait.");
			field1128.method213(0xFFFFFF, 256, 150, "Loading - please wait.");
			field1241.method268(4, field9, 4);
			field1318 = 1;
			field1067 = System.currentTimeMillis();
		}

		if (field1318 == 1) {
			int var1 = method476();
			if (var1 != 0 && System.currentTimeMillis() - field1067 > 360000L) {
				signlink.reporterror(field1035 + " glcfb " + field1409 + "," + var1 + "," + field1298 + "," + field1132[0] + "," + field1381.method289() + "," + field1390 + "," + field1065 + "," + field1066);
				field1067 = System.currentTimeMillis();
			}
		}

		if (field1318 == 2 && field1390 != field1081) {
			field1081 = field1390;
			method522(field1390);
		}
	}

	@ObfuscatedName("client.t(I)I")
	public final int method476() {
		for (int var1 = 0; var1 < field1064.length; var1++) {
			if (field1064[var1] == null && field1354[var1] != -1) {
				return -1;
			}

			if (field1360[var1] == null && field1355[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1064.length; var3++) {
			byte[] var4 = field1360[var3];
			if (var4 != null) {
				int var5 = (field1353[var3] >> 8) * 64 - field1099;
				int var6 = (field1353[var3] & 0xFF) * 64 - field1100;
				var2 &= class3.method16(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1030) {
			return -4;
		} else {
			field1318 = 2;
			class3.field33 = field1390;
			method535();
			return 0;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method477() {
		if (field1363 == null) {
			field10 = null;
			field1242 = null;
			field1240 = null;
			field1239 = null;
			field1241 = null;
			field1372 = null;
			field1373 = null;
			field1374 = null;
			field1366 = new class44(265, method11(), 128);
			class34.method167();
			field1367 = new class44(265, method11(), 128);
			class34.method167();
			field1363 = new class44(171, method11(), 509);
			class34.method167();
			field1364 = new class44(132, method11(), 360);
			class34.method167();
			field1365 = new class44(200, method11(), 360);
			class34.method167();
			field1368 = new class44(238, method11(), 202);
			class34.method167();
			field1369 = new class44(238, method11(), 203);
			class34.method167();
			field1370 = new class44(94, method11(), 74);
			class34.method167();
			field1371 = new class44(94, method11(), 75);
			class34.method167();

			if (field1111 != null) {
				method508();
				method451();
			}

			field1325 = true;
		}
	}

	@ObfuscatedName("client.a(IIILgc;I)V")
	public final void method478(int arg0, int arg1, class59 arg2, int arg3) {
		if (field1050 < 400) {
			String var5 = arg2.field865;
			if (arg2.field883 != 0) {
				var5 = var5 + method436(field1335.field429, arg2.field883) + " (level-" + arg2.field883 + ")";
			}

			if (field1250 == 1) {
				field1203[field1050] = "Use " + field1254 + " with @yel@" + var5;
				field1349[field1050] = 900;
				field1350[field1050] = arg1;
				field1347[field1050] = arg0;
				field1348[field1050] = arg3;
				field1050++;
			} else if (field1152 != 1) {
				if (arg2.field878 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg2.field878[var6] != null && !arg2.field878[var6].equalsIgnoreCase("attack")) {
							field1203[field1050] = arg2.field878[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1349[field1050] = 728;
							}

							if (var6 == 1) {
								field1349[field1050] = 542;
							}

							if (var6 == 2) {
								field1349[field1050] = 6;
							}

							if (var6 == 3) {
								field1349[field1050] = 963;
							}

							if (var6 == 4) {
								field1349[field1050] = 245;
							}

							field1350[field1050] = arg1;
							field1347[field1050] = arg0;
							field1348[field1050] = arg3;
							field1050++;
						}
					}
				}

				if (arg2.field878 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg2.field878[var7] != null && arg2.field878[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg2.field883 > field1335.field429) {
								var8 = 2000;
							}

							field1203[field1050] = arg2.field878[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1349[field1050] = var8 + 728;
							}

							if (var7 == 1) {
								field1349[field1050] = var8 + 542;
							}

							if (var7 == 2) {
								field1349[field1050] = var8 + 6;
							}

							if (var7 == 3) {
								field1349[field1050] = var8 + 963;
							}

							if (var7 == 4) {
								field1349[field1050] = var8 + 245;
							}

							field1350[field1050] = arg1;
							field1347[field1050] = arg0;
							field1348[field1050] = arg3;
							field1050++;
						}
					}
				}

				field1203[field1050] = "Examine @yel@" + var5;
				field1349[field1050] = 1607;
				field1350[field1050] = arg1;
				field1347[field1050] = arg0;
				field1348[field1050] = arg3;
				field1050++;
			} else if ((field1154 & 0x2) == 2) {
				field1203[field1050] = field1155 + " @yel@" + var5;
				field1349[field1050] = 265;
				field1350[field1050] = arg1;
				field1347[field1050] = arg0;
				field1348[field1050] = arg3;
				field1050++;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method479() {
		method477();
		field1365.method267();
		field1430.method211(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1319 == 0) {
			int var3 = var2 / 2 + 80;
			field1127.method214(true, var3, 0x75A9A9, var1 / 2, field1381.field733);
			int var4 = var2 / 2 - 20;
			field1129.method214(true, var4, 0xFFFF00, var1 / 2, "Welcome to RuneScape");
			var4 += 30;
			int var5 = var1 / 2 - 80;
			int var6 = var2 / 2 + 20;
			field1431.method211(var5 - 73, var6 - 20);
			field1129.method214(true, var6 + 5, 0xFFFFFF, var5, "New user");
			int var7 = var1 / 2 + 80;
			field1431.method211(var7 - 73, var6 - 20);
			field1129.method214(true, var6 + 5, 0xFFFFFF, var7, "Existing User");
		}

		if (field1319 == 2) {
			int var8 = var2 / 2 - 40;
			if (field1375.length() > 0) {
				field1129.method214(true, var8 - 15, 0xFFFF00, var1 / 2, field1375);
				field1129.method214(true, var8, 0xFFFF00, var1 / 2, field1376);
				var8 += 30;
			} else {
				field1129.method214(true, var8 - 7, 0xFFFF00, var1 / 2, field1376);
				var8 += 30;
			}

			field1129.method218(0xFFFFFF, var1 / 2 - 90, var8, true, "Username: " + field1035 + (field1059 == 0 & field1259 % 40 < 20 ? "@yel@|" : ""));
			var8 += 15;
			field1129.method218(0xFFFFFF, var1 / 2 - 88, var8, true, "Password: " + class52.method315(field1036) + (field1059 == 1 & field1259 % 40 < 20 ? "@yel@|" : ""));
			var8 += 15;
			int var9 = var1 / 2 - 80;
			int var10 = var2 / 2 + 50;
			field1431.method211(var9 - 73, var10 - 20);
			field1129.method214(true, var10 + 5, 0xFFFFFF, var9, "Login");
			int var11 = var1 / 2 + 80;
			field1431.method211(var11 - 73, var10 - 20);
			field1129.method214(true, var10 + 5, 0xFFFFFF, var11, "Cancel");
		}

		if (field1319 == 3) {
			field1129.method214(true, var2 / 2 - 60, 0xFFFF00, var1 / 2, "Create a free account");
			int var12 = var2 / 2 - 35;
			field1129.method214(true, var12, 0xFFFFFF, var1 / 2, "To create a new account you need to");
			var12 += 15;
			field1129.method214(true, var12, 0xFFFFFF, var1 / 2, "go back to the main RuneScape webpage");
			var12 += 15;
			field1129.method214(true, var12, 0xFFFFFF, var1 / 2, "and choose the red 'create account'");
			var12 += 15;
			field1129.method214(true, var12, 0xFFFFFF, var1 / 2, "button at the top right of that page.");
			var12 += 15;
			int var13 = var1 / 2;
			int var14 = var2 / 2 + 50;
			field1431.method211(var13 - 73, var14 - 20);
			field1129.method214(true, var14 + 5, 0xFFFFFF, var13, "Cancel");
		}

		field1365.method268(202, field9, 171);

		if (field1325) {
			field1325 = false;
			field1363.method268(128, field9, 0);
			field1364.method268(202, field9, 371);
			field1368.method268(0, field9, 265);
			field1369.method268(562, field9, 265);
			field1370.method268(128, field9, 171);
			field1371.method268(562, field9, 171);
		}
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void method480(class39 arg0, int arg1) {
		int var3 = arg0.method249(8);
		if (var3 < field1330) {
			for (int var4 = var3; var4 < field1330; var4++) {
				field1359[field1358++] = field1331[var4];
			}
		}

		if (var3 > field1330) {
			signlink.reporterror(field1035 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1330 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1331[var5];
			class28 var7 = field1329[var6];
			int var8 = arg0.method249(1);
			if (var8 == 0) {
				field1331[field1330++] = var6;
				var7.field413 = field1259;
			} else {
				int var9 = arg0.method249(2);
				if (var9 == 0) {
					field1331[field1330++] = var6;
					var7.field413 = field1259;
					field1333[field1332++] = var6;
				} else if (var9 == 1) {
					field1331[field1330++] = var6;
					var7.field413 = field1259;
					int var10 = arg0.method249(3);
					var7.method124(false, var10);
					int var11 = arg0.method249(1);
					if (var11 == 1) {
						field1333[field1332++] = var6;
					}
				} else if (var9 == 2) {
					field1331[field1330++] = var6;
					var7.field413 = field1259;
					int var12 = arg0.method249(3);
					var7.method124(true, var12);
					int var13 = arg0.method249(3);
					var7.method124(true, var13);
					int var14 = arg0.method249(1);
					if (var14 == 1) {
						field1333[field1332++] = var6;
					}
				} else if (var9 == 3) {
					field1359[field1358++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method481() {
		field1272 = 0;
		for (int var1 = -1; var1 < field1330 + field1291; var1++) {
			class26 var2;
			if (var1 == -1) {
				var2 = field1335;
			} else if (var1 < field1330) {
				var2 = field1329[field1331[var1]];
			} else {
				var2 = field1290[field1292[var1 - field1330]];
			}

			if (var2 != null && var2.method126()) {
				if (var1 >= field1330) {
					class59 var6 = ((class27) var2).field422;
					if (var6.field889 >= 0 && var6.field889 < field1149.length) {
						method459(var2, var2.field414 + 15);

						if (field1164 > -1) {
							field1149[var6.field889].method198(field1164 - 12, field1165 - 30);
						}
					}

					if (field1418 == 1 && field1292[var1 - field1330] == field1097 && field1259 % 20 < 10) {
						method459(var2, var2.field414 + 15);

						if (field1164 > -1) {
							field1149[2].method198(field1164 - 12, field1165 - 28);
						}
					}
				} else {
					int var3 = 30;
					class28 var4 = (class28) var2;
					if (var4.field426 != 0) {
						method459(var2, var2.field414 + 15);

						if (field1164 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field426 & 1 << var5) != 0) {
									field1149[var5].method198(field1164 - 12, field1165 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1418 == 10 && field1331[var1] == field1403) {
						method459(var2, var2.field414 + 15);

						if (field1164 > -1) {
							field1149[7].method198(field1164 - 12, field1165 - var3);
						}
					}
				}

				if (var2.field380 != null && (var1 >= field1330 || field1243 == 0 || field1243 == 3 || field1243 == 1 && method433(((class28) var2).field423))) {
					method459(var2, var2.field414);

					if (field1164 > -1 && field1272 < field1273) {
						field1277[field1272] = field1129.method215(var2.field380) / 2;
						field1276[field1272] = field1129.field618;
						field1274[field1272] = field1164;
						field1275[field1272] = field1165;
						field1278[field1272] = var2.field382;
						field1279[field1272] = var2.field383;
						field1280[field1272] = var2.field381;
						field1281[field1272++] = var2.field380;

						if (field1084 == 0 && var2.field383 == 1) {
							field1276[field1272] += 10;
							field1275[field1272] += 5;
						}

						if (field1084 == 0 && var2.field383 == 2) {
							field1277[field1272] = 60;
						}
					}
				}

				if (var2.field387 > field1259) {
					method459(var2, var2.field414 + 15);

					if (field1164 > -1) {
						int var7 = var2.field388 * 30 / var2.field389;
						if (var7 > 30) {
							var7 = 30;
						}

						class34.method169(field1165 - 3, 5, field1164 - 15, var7, 0xFF00);
						class34.method169(field1165 - 3, 5, field1164 + var7 - 15, 30 - var7, 0xFF0000);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field386[var8] > field1259) {
						method459(var2, var2.field414 / 2);

						if (field1164 > -1) {
							if (var8 == 1) {
								field1165 -= 20;
							}

							if (var8 == 2) {
								field1164 -= 15;
								field1165 -= 10;
							}

							if (var8 == 3) {
								field1164 += 15;
								field1165 -= 10;
							}

							field1312[var2.field385[var8]].method198(field1164 - 12, field1165 - 12);
							field1127.method213(0, field1164, field1165 + 4, String.valueOf(var2.field384[var8]));
							field1127.method213(0xFFFFFF, field1164 - 1, field1165 + 3, String.valueOf(var2.field384[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1272; var9++) {
			int var10 = field1274[var9];
			int var11 = field1275[var9];
			int var12 = field1277[var9];
			int var13 = field1276[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1275[var15] - field1276[var15] && var11 - var13 < field1275[var15] + 2 && var10 - var12 < field1277[var15] + field1274[var15] && var10 + var12 > field1274[var15] - field1277[var15] && field1275[var15] - field1276[var15] < var11) {
						var11 = field1275[var15] - field1276[var15];
						var14 = true;
					}
				}
			}

			field1164 = field1274[var9];
			field1165 = field1275[var9] = var11;
			String var16 = field1281[var9];
			if (field1084 == 0) {
				int var17 = 0xFFFF00;
				if (field1278[var9] < 6) {
					var17 = field1346[field1278[var9]];
				}

				if (field1278[var9] == 6) {
					var17 = field1427 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1278[var9] == 7) {
					var17 = field1427 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1278[var9] == 8) {
					var17 = field1427 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1278[var9] == 9) {
					int var18 = 150 - field1280[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1278[var9] == 10) {
					int var19 = 150 - field1280[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1278[var9] == 11) {
					int var20 = 150 - field1280[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1279[var9] == 0) {
					field1129.method213(0, field1164, field1165 + 1, var16);
					field1129.method213(var17, field1164, field1165, var16);
				}

				if (field1279[var9] == 1) {
					field1129.method217(field1164, 0, field1165 + 1, var16, field1427);
					field1129.method217(field1164, var17, field1165, var16, field1427);
				}

				if (field1279[var9] == 2) {
					int var21 = field1129.method215(var16);
					int var22 = (150 - field1280[var9]) * (var21 + 100) / 150;
					class34.method166(0, field1164 + 50, 334, field1164 - 50);
					field1129.method216(var16, 0, field1164 + 50 - var22, field1165 + 1);
					field1129.method216(var16, var17, field1164 + 50 - var22, field1165);
					class34.method165();
				}
			} else {
				field1129.method213(0, field1164, field1165 + 1, var16);
				field1129.method213(0xFFFF00, field1164, field1165, var16);
			}
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public static final String method482(int arg0) {
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

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method483(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.w(I)V")
	public final void method484() {
		int var1 = (field1335.field368 >> 7) + field1099;
		int var2 = (field1335.field369 >> 7) + field1100;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1079 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1079 = (var2 - 9920) / 8 + 1;
		} else {
			field1079 = 0;
		}

		field1118 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1118 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1118 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1118 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1118 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1118 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1118 = 1;
			}
		}

		if (field1118 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1118 = 2;
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

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method485(int arg0, class39 arg1) {
		field1358 = 0;
		field1332 = 0;
		method550(arg0, arg1);
		method480(arg1, arg0);
		method527(arg1, arg0);
		method455(arg1, arg0);

		for (int var3 = 0; var3 < field1358; var3++) {
			int var4 = field1359[var3];
			if (field1259 != field1329[var4].field413) {
				field1329[var4] = null;
			}
		}

		if (arg1.field623 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field623 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1330; var5++) {
			if (field1329[field1331[var5]] == null) {
				signlink.reporterror(field1035 + " null entry in pl list - pos:" + var5 + " size:" + field1330);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method486() {
		if (field1169 == 0) {
			int var1 = field23;
			if (field1152 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1235) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1307 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1307 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1307 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1308 - 10 || var2 > field1310 + field1308 + 10 || var3 < field1309 - 10 || var3 > field1311 + field1309 + 10) {
						field1235 = false;

						if (field1307 == 1) {
							field1421 = true;
						}

						if (field1307 == 2) {
							field1302 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1308;
					int var5 = field1309;
					int var6 = field1310;
					int var7 = field24;
					int var8 = field25;
					if (field1307 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1307 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1307 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1050; var10++) {
						int var11 = (field1050 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method462(var9);
					}

					field1235 = false;

					if (field1307 == 1) {
						field1421 = true;
					}

					if (field1307 == 2) {
						field1302 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1050 > 0) {
					int var12 = field1349[field1050 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = field1347[field1050 - 1];
						int var14 = field1348[field1050 - 1];
						class4 var15 = class4.field57[var14];
						if (var15.field84 || var15.field87) {
							field1393 = false;
							field1246 = 0;
							field1167 = var14;
							field1168 = var13;
							field1169 = 2;
							field1170 = field24;
							field1171 = field25;

							if (class4.field57[var14].field63 == field1054) {
								field1169 = 1;
							}

							if (class4.field57[var14].field63 == field1172) {
								field1169 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1231 == 1 || method492(field1050 - 1)) && field1050 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1050 > 0) {
					method462(field1050 - 1);
				}

				if (var1 != 2 || field1050 <= 0) {
					return;
				}

				method533();
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method487(class4 arg0) {
		int var2 = arg0.field66;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1203[field1050] = "Remove @whi@" + arg0.field98;
				field1349[field1050] = 556;
				field1050++;
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

		field1203[field1050] = "Remove @whi@" + field1344[var2];
		field1349[field1050] = 557;
		field1050++;
		field1203[field1050] = "Message @whi@" + field1344[var2];
		field1349[field1050] = 679;
		field1050++;
		return true;
	}

	@ObfuscatedName("client.a(ILjb;II)V")
	public final void method488(int arg0, class36 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1056 + field1038 & 0x7FF;
			int var6 = class32.field550[var5];
			int var7 = class32.field551[var5];
			var6 = var6 * 256 / (field1267 + 256);
			var7 = var7 * 256 / (field1267 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1037.method203(15, 256, 15, var12 + 94 + 4 - 10, 20, 83 - var13 - 20, var10, 20);
		} else {
			method511(arg2, arg1, arg0);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1296 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method489() {
		if (field1318 == 2) {
			for (class41 var1 = (class41) field1263.method257(); var1 != null; var1 = (class41) field1263.method259()) {
				if (var1.field650 > 0) {
					var1.field650--;
				}

				if (var1.field650 != 0) {
					if (var1.field649 > 0) {
						var1.field649--;
					}

					if (var1.field649 == 0 && var1.field641 >= 1 && var1.field642 >= 1 && var1.field641 <= 102 && var1.field642 <= 102 && (var1.field646 < 0 || class3.method30(var1.field648, var1.field646))) {
						method453(var1.field648, var1.field642, var1.field647, var1.field640, var1.field646, var1.field641, var1.field639);
						var1.field649 = -1;

						if (var1.field646 == var1.field643 && var1.field643 == -1) {
							var1.method119();
						} else if (var1.field646 == var1.field643 && var1.field647 == var1.field644 && var1.field648 == var1.field645) {
							var1.method119();
						}
					}
				} else if (var1.field643 < 0 || class3.method30(var1.field645, var1.field643)) {
					method453(var1.field645, var1.field642, var1.field644, var1.field640, var1.field643, var1.field641, var1.field639);
					var1.method119();
				}
			}

			field1087++;
			if (field1087 > 85) {
				field1087 = 0;
				field1041.method227(63);
				return;
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method490() {
		if (field1104 != 0) {
			class38 var1 = field1128;
			int var2 = 0;
			if (field1413 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1206[var3] != null) {
					int var4 = field1204[var3];
					String var5 = field1205[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1382 == 0 || field1382 == 1 && method433(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method216("From", 0, var8, var7);
						var1.method216("From", 0xFFFF, var8, var7 - 1);
						int var11 = var8 + var1.method215("From ");
						if (var6 == 1) {
							field1383[0].method211(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1383[1].method211(var11, var7 - 12);
							var11 += 14;
						}

						var1.method216(var5 + ": " + field1206[var3], 0, var11, var7);
						var1.method216(var5 + ": " + field1206[var3], 0xFFFF, var11, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1382 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method216(field1206[var3], 0, 4, var9);
						var1.method216(field1206[var3], 0xFFFF, 4, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1382 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method216("To " + var5 + ": " + field1206[var3], 0, 4, var10);
						var1.method216("To " + var5 + ": " + field1206[var3], 0xFFFF, 4, var10 - 1);
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
	public static final void method491() {
		class19.field266 = true;
		class35.field573 = true;
		field1298 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method492(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1349[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method493() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1247[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1247[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1248[var10] = (field1247[var10 - 1] + field1247[var10 + 1] + field1247[var10 - 128] + field1247[var10 + 128]) / 4;
			}
		}

		field1425 += 128;
		if (field1425 > field1394.length) {
			field1425 -= field1394.length;
			int var11 = (int) (Math.random() * 12.0D);
			method454(field1357[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1248[var14 + 128] - field1394[field1425 + var14 & field1394.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1247[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1151[var16] = field1151[var16 + 1];
		}

		field1151[var1 - 1] = (int) (Math.sin(field1259 / 14.0D) * 16.0D + Math.sin(field1259 / 15.0D) * 14.0D + Math.sin(field1259 / 16.0D) * 12.0D);

		if (field1406 > 0) {
			field1406 -= 4;
		}

		if (field1407 > 0) {
			field1407 -= 4;
		}

		if (field1406 == 0 && field1407 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1406 = 1024;
			}

			if (var17 == 1) {
				field1407 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZIILd;II)V")
	public final void method494(int arg0, int arg1, int arg2, class4 arg3, int arg4, int arg5) {
		if (arg3.field64 == 0 && arg3.field79 != null && !arg3.field78 && (arg4 >= arg0 && arg1 >= arg5 && arg4 <= arg3.field67 + arg0 && arg1 <= arg3.field68 + arg5)) {
			int var7 = arg3.field79.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.field80[var8] + arg0;
				int var10 = arg3.field81[var8] + arg5 - arg2;
				class4 var11 = class4.field57[arg3.field79[var8]];
				var9 += var11.field70;
				var10 += var11.field71;
				if ((var11.field75 >= 0 || var11.field102 != 0) && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field67 + var9 && arg1 < var11.field68 + var10) {
					if (var11.field75 >= 0) {
						field1412 = var11.field75;
					} else {
						field1412 = var11.field62;
					}
				}

				if (var11.field64 == 0) {
					method494(var9, arg1, var11.field77, var11, arg4, var10);

					if (var11.field76 > var11.field68) {
						method536(var10, var11.field67 + var9, var11.field76, var11.field68, true, var11, arg1, arg4);
					}
				} else {
					if (var11.field65 == 1 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field67 + var9 && arg1 < var11.field68 + var10) {
						boolean var12 = false;
						if (var11.field66 != 0) {
							var12 = method487(var11);
						}

						if (!var12) {
							field1203[field1050] = var11.field118;
							field1349[field1050] = 951;
							field1348[field1050] = var11.field62;
							field1050++;
						}
					}

					if (var11.field65 == 2 && field1152 == 0 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field67 + var9 && arg1 < var11.field68 + var10) {
						String var13 = var11.field115;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1203[field1050] = var13 + " @gre@" + var11.field116;
						field1349[field1050] = 930;
						field1348[field1050] = var11.field62;
						field1050++;
					}

					if (var11.field65 == 3 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field67 + var9 && arg1 < var11.field68 + var10) {
						field1203[field1050] = "Close";
						field1349[field1050] = 947;
						field1348[field1050] = var11.field62;
						field1050++;
					}

					if (var11.field65 == 4 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field67 + var9 && arg1 < var11.field68 + var10) {
						field1203[field1050] = var11.field118;
						field1349[field1050] = 465;
						field1348[field1050] = var11.field62;
						field1050++;
					}

					if (var11.field65 == 5 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field67 + var9 && arg1 < var11.field68 + var10) {
						field1203[field1050] = var11.field118;
						field1349[field1050] = 960;
						field1348[field1050] = var11.field62;
						field1050++;
					}

					if (var11.field65 == 6 && !field1202 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field67 + var9 && arg1 < var11.field68 + var10) {
						field1203[field1050] = var11.field118;
						field1349[field1050] = 44;
						field1348[field1050] = var11.field62;
						field1050++;
					}

					if (var11.field64 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field68; var15++) {
							for (int var16 = 0; var16 < var11.field67; var16++) {
								int var17 = (var11.field88 + 32) * var16 + var9;
								int var18 = (var11.field89 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field91[var14];
									var18 += var11.field92[var14];
								}

								if (arg4 >= var17 && arg1 >= var18 && arg4 < var17 + 32 && arg1 < var18 + 32) {
									field1257 = var14;
									field1258 = var11.field62;

									if (var11.field58[var14] > 0) {
										class60 var19 = class60.method348(var11.field58[var14] - 1);
										if (field1250 == 1 && var11.field85) {
											if (field1252 != var11.field62 || field1251 != var14) {
												field1203[field1050] = "Use " + field1254 + " with @lre@" + var19.field899;
												field1349[field1050] = 881;
												field1350[field1050] = var19.field897;
												field1347[field1050] = var14;
												field1348[field1050] = var11.field62;
												field1050++;
											}
										} else if (field1152 != 1 || !var11.field85) {
											if (var11.field85) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field914 != null && var19.field914[var20] != null) {
														field1203[field1050] = var19.field914[var20] + " @lre@" + var19.field899;

														if (var20 == 3) {
															field1349[field1050] = 478;
														}

														if (var20 == 4) {
															field1349[field1050] = 347;
														}

														field1350[field1050] = var19.field897;
														field1347[field1050] = var14;
														field1348[field1050] = var11.field62;
														field1050++;
													} else if (var20 == 4) {
														field1203[field1050] = "Drop @lre@" + var19.field899;
														field1349[field1050] = 347;
														field1350[field1050] = var19.field897;
														field1347[field1050] = var14;
														field1348[field1050] = var11.field62;
														field1050++;
													}
												}
											}

											if (var11.field86) {
												field1203[field1050] = "Use @lre@" + var19.field899;
												field1349[field1050] = 188;
												field1350[field1050] = var19.field897;
												field1347[field1050] = var14;
												field1348[field1050] = var11.field62;
												field1050++;
											}

											if (var11.field85 && var19.field914 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field914[var21] != null) {
														field1203[field1050] = var19.field914[var21] + " @lre@" + var19.field899;

														if (var21 == 0) {
															field1349[field1050] = 405;
														}

														if (var21 == 1) {
															field1349[field1050] = 38;
														}

														if (var21 == 2) {
															field1349[field1050] = 422;
														}

														field1350[field1050] = var19.field897;
														field1347[field1050] = var14;
														field1348[field1050] = var11.field62;
														field1050++;
													}
												}
											}

											if (var11.field93 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field93[var22] != null) {
														field1203[field1050] = var11.field93[var22] + " @lre@" + var19.field899;

														if (var22 == 0) {
															field1349[field1050] = 602;
														}

														if (var22 == 1) {
															field1349[field1050] = 596;
														}

														if (var22 == 2) {
															field1349[field1050] = 22;
														}

														if (var22 == 3) {
															field1349[field1050] = 892;
														}

														if (var22 == 4) {
															field1349[field1050] = 415;
														}

														field1350[field1050] = var19.field897;
														field1347[field1050] = var14;
														field1348[field1050] = var11.field62;
														field1050++;
													}
												}
											}

											field1203[field1050] = "Examine @lre@" + var19.field899;
											field1349[field1050] = 1773;
											field1350[field1050] = var19.field897;
											field1348[field1050] = var11.field59[var14];
											field1050++;
										} else if ((field1154 & 0x10) == 0x10) {
											field1203[field1050] = field1155 + " @lre@" + var19.field899;
											field1349[field1050] = 391;
											field1350[field1050] = var19.field897;
											field1347[field1050] = var14;
											field1348[field1050] = var11.field62;
											field1050++;
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

	@ObfuscatedName("client.c(Z)V")
	public final void method495() {
		if (field1418 == 2) {
			method460((field1114 - field1100 << 7) + field1117, field1115 * 2, (field1113 - field1099 << 7) + field1116);

			if (field1164 > -1 && field1259 % 20 < 10) {
				field1149[2].method198(field1164 - 12, field1165 - 28);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method496() {
		field1238 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1090[var1] = -1;
			for (int var2 = 0; var2 < class64.field958; var2++) {
				if (!class64.field959[var2].field965 && class64.field959[var2].field960 == var1 + (field1244 ? 0 : 7)) {
					field1090[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public static final String method497(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.b(I)V")
	public final void method7() {
		if (!field1135 && !field1269 && !field1112) {
			field1259++;

			if (field1190) {
				method541();
			} else {
				method513();
			}

			method474();
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method498() {
		for (class41 var1 = (class41) field1263.method257(); var1 != null; var1 = (class41) field1263.method259()) {
			if (var1.field650 == -1) {
				var1.field649 = 0;
				method521(var1);
			} else {
				var1.method119();
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method499(int arg0) {
		class4 var2 = class4.field57[arg0];
		for (int var3 = 0; var3 < var2.field79.length && var2.field79[var3] != -1; var3++) {
			class4 var4 = class4.field57[var2.field79[var3]];
			if (var4.field64 == 1) {
				method499(var4.field62);
			}

			var4.field60 = 0;
			var4.field61 = 0;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method500() {
		if (field1050 >= 2 || field1250 != 0 || field1152 != 0) {
			String var1;
			if (field1250 == 1 && field1050 < 2) {
				var1 = "Use " + field1254 + " with...";
			} else if (field1152 == 1 && field1050 < 2) {
				var1 = field1155 + "...";
			} else {
				var1 = field1203[field1050 - 1];
			}

			if (field1050 > 2) {
				var1 = var1 + "@whi@ / " + (field1050 - 2) + " more options";
			}

			field1129.method219(field1259 / 1000, 0xFFFFFF, var1, 15, 4, true);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method501() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1428[0] != -1) {
				field1421 = true;
				field1265 = 0;
				field1392 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1428[1] != -1) {
				field1421 = true;
				field1265 = 1;
				field1392 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1428[2] != -1) {
				field1421 = true;
				field1265 = 2;
				field1392 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1428[3] != -1) {
				field1421 = true;
				field1265 = 3;
				field1392 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1428[4] != -1) {
				field1421 = true;
				field1265 = 4;
				field1392 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1428[5] != -1) {
				field1421 = true;
				field1265 = 5;
				field1392 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1428[6] != -1) {
				field1421 = true;
				field1265 = 6;
				field1392 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1428[7] != -1) {
				field1421 = true;
				field1265 = 7;
				field1392 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1428[8] != -1) {
				field1421 = true;
				field1265 = 8;
				field1392 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1428[9] != -1) {
				field1421 = true;
				field1265 = 9;
				field1392 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1428[10] != -1) {
				field1421 = true;
				field1265 = 10;
				field1392 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1428[11] != -1) {
				field1421 = true;
				field1265 = 11;
				field1392 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1428[12] != -1) {
				field1421 = true;
				field1265 = 12;
				field1392 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1428[13] != -1) {
				field1421 = true;
				field1265 = 13;
				field1392 = true;
			}

			field1237++;
			if (field1237 > 150) {
				field1237 = 0;
				field1041.method227(136);
				field1041.method228(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method502(class39 arg0, int arg1) {
		for (int var3 = 0; var3 < field1332; var3++) {
			int var4 = field1333[var3];
			class27 var5 = field1290[var4];
			int var6 = arg0.method238();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method238();
				int var8 = arg0.method238();
				var5.method127(var8, var7);
				var5.field387 = field1259 + 300;
				var5.field388 = arg0.method238();
				var5.field389 = arg0.method238();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg0.method240();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field396 == var9) {
					var5.field400 = 0;
				}

				int var10 = arg0.method238();
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
				var5.field390 = arg0.method240();
				if (var5.field390 == 0xFFFF) {
					var5.field390 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field380 = arg0.method245();
				var5.field381 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.method238();
				int var13 = arg0.method238();
				var5.method127(var13, var12);
				var5.field387 = field1259 + 300;
				var5.field388 = arg0.method238();
				var5.field389 = arg0.method238();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field422 = class59.method342(arg0.method240());
				var5.field375 = var5.field422.field871;
				var5.field376 = var5.field422.field872;
				var5.field377 = var5.field422.field873;
				var5.field378 = var5.field422.field874;
				var5.field373 = var5.field422.field870;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field401 = arg0.method240();
				int var14 = arg0.method243();
				var5.field405 = var14 >> 16;
				var5.field404 = (var14 & 0xFFFF) + field1259;
				var5.field402 = 0;
				var5.field403 = 0;

				if (var5.field404 > field1259) {
					var5.field402 = -1;
				}

				if (var5.field401 == 0xFFFF) {
					var5.field401 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field391 = arg0.method240();
				var5.field392 = arg0.method240();
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;BI)V")
	public final void method503(class39 arg0, int arg1) {
		if (arg1 == 119 || arg1 == 198) {
			int var3 = arg0.method238();
			int var4 = (var3 >> 4 & 0x7) + field1398;
			int var5 = (var3 & 0x7) + field1399;
			int var6 = arg0.method238();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1420[var7];
			int var10;
			if (arg1 == 198) {
				var10 = -1;
			} else {
				var10 = arg0.method240();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method456(var10, var9, field1390, var8, var5, 0, -1, var4, var7);
			}
		} else if (arg1 == 71) {
			int var11 = arg0.method238();
			int var12 = (var11 >> 4 & 0x7) + field1398;
			int var13 = (var11 & 0x7) + field1399;
			int var14 = arg0.method238();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1420[var15];
			int var18 = arg0.method240();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1362[field1390][var12][var13];
				int var20 = field1362[field1390][var12 + 1][var13];
				int var21 = field1362[field1390][var12 + 1][var13 + 1];
				int var22 = field1362[field1390][var12][var13 + 1];
				if (var17 == 0) {
					class18 var23 = field1085.method85(var13, field1390, var12);
					if (var23 != null) {
						int var24 = var23.field264 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field262 = new class29(var21, var24, false, var19, var22, 2, var16 + 4, var20, var18);
							var23.field263 = new class29(var21, var24, false, var19, var22, 2, var16 + 1 & 0x3, var20, var18);
						} else {
							var23.field262 = new class29(var21, var24, false, var19, var22, var15, var16, var20, var18);
						}
					}
				}

				if (var17 == 1) {
					class9 var25 = field1085.method86(var13, field1390, var12);
					if (var25 != null) {
						var25.field155 = new class29(var21, var25.field156 >> 14 & 0x7FFF, false, var19, var22, 4, 0, var20, var18);
					}
				}

				if (var17 == 2) {
					class17 var26 = field1085.method87(var13, var12, field1390);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field247 = new class29(var21, var26.field255 >> 14 & 0x7FFF, false, var19, var22, var15, var16, var20, var18);
					}
				}

				if (var17 == 3) {
					class11 var27 = field1085.method88(var13, field1390, var12);
					if (var27 != null) {
						var27.field186 = new class29(var21, var27.field187 >> 14 & 0x7FFF, false, var19, var22, 22, var16, var20, var18);
					}
				}
			}
		} else if (arg1 == 94) {
			int var28 = arg0.method238();
			int var29 = (var28 >> 4 & 0x7) + field1398;
			int var30 = (var28 & 0x7) + field1399;
			int var31 = arg0.method240();
			int var32 = arg0.method240();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class30 var33 = new class30();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1119[field1390][var29][var30] == null) {
					field1119[field1390][var29][var30] = new class42();
				}

				field1119[field1390][var29][var30].method254(var33);
				method434(var29, var30);
			}
		} else if (arg1 == 13) {
			int var34 = arg0.method238();
			int var35 = (var34 >> 4 & 0x7) + field1398;
			int var36 = (var34 & 0x7) + field1399;
			int var37 = arg0.method240();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1119[field1390][var35][var36];
				if (var38 != null) {
					for (class30 var39 = (class30) var38.method257(); var39 != null; var39 = (class30) var38.method259()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method119();
							break;
						}
					}

					if (var38.method257() == null) {
						field1119[field1390][var35][var36] = null;
					}

					method434(var35, var36);
				}
			}
		} else if (arg1 == 187) {
			int var40 = arg0.method238();
			int var41 = (var40 >> 4 & 0x7) + field1398;
			int var42 = (var40 & 0x7) + field1399;
			int var43 = var41 + arg0.method239();
			int var44 = var42 + arg0.method239();
			int var45 = arg0.method241();
			int var46 = arg0.method240();
			int var47 = arg0.method238();
			int var48 = arg0.method238();
			int var49 = arg0.method240();
			int var50 = arg0.method240();
			int var51 = arg0.method238();
			int var52 = arg0.method238();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class31 var53 = new class31(method526(var42, field1390, var41) - var47, var52, field1390, var42, field1259 + var50, var48, var46, var51, var45, var41, field1259 + var49);
				var53.method132(var43, var44, field1259 + var49, method526(var44, field1390, var43) - var48);
				field1262.method254(var53);
			}
		} else if (arg1 == 141) {
			int var54 = arg0.method238();
			int var55 = (var54 >> 4 & 0x7) + field1398;
			int var56 = (var54 & 0x7) + field1399;
			int var57 = arg0.method240();
			int var58 = arg0.method238();
			int var59 = arg0.method240();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class33 var60 = new class33(field1390, var59, var56, method526(var56, field1390, var55) - var58, var57, var55, field1259);
				field1173.method254(var60);
			}
		} else if (arg1 == 190) {
			int var61 = arg0.method238();
			int var62 = (var61 >> 4 & 0x7) + field1398;
			int var63 = (var61 & 0x7) + field1399;
			int var64 = arg0.method240();
			int var65 = arg0.method240();
			int var66 = arg0.method240();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1396 != var66) {
				class30 var67 = new class30();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1119[field1390][var62][var63] == null) {
					field1119[field1390][var62][var63] = new class42();
				}

				field1119[field1390][var62][var63].method254(var67);
				method434(var62, var63);
			}
		} else if (arg1 == 188) {
			int var68 = arg0.method238();
			int var69 = (var68 >> 4 & 0x7) + field1398;
			int var70 = (var68 & 0x7) + field1399;
			int var71 = arg0.method238();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1420[var72];
			int var75 = arg0.method240();
			int var76 = arg0.method240();
			int var77 = arg0.method240();
			int var78 = arg0.method240();
			byte var79 = arg0.method239();
			byte var80 = arg0.method239();
			byte var81 = arg0.method239();
			byte var82 = arg0.method239();
			class28 var83;
			if (field1396 == var78) {
				var83 = field1335;
			} else {
				var83 = field1329[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method333(var75);
				int var85 = field1362[field1390][var69][var70];
				int var86 = field1362[field1390][var69 + 1][var70];
				int var87 = field1362[field1390][var69 + 1][var70 + 1];
				int var88 = field1362[field1390][var69][var70 + 1];
				class32 var89 = var84.method339(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method456(-1, var74, field1390, 0, var70, var76 + 1, var77 + 1, var69, 0);
					var83.field432 = field1259 + var76;
					var83.field433 = field1259 + var77;
					var83.field437 = var89;
					int var90 = var84.field824;
					int var91 = var84.field825;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field825;
						var91 = var84.field824;
					}

					var83.field434 = var69 * 128 + var90 * 64;
					var83.field436 = var70 * 128 + var91 * 64;
					var83.field435 = method526(var83.field436, field1390, var83.field434);

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
		} else if (arg1 == 151) {
			int var94 = arg0.method238();
			int var95 = (var94 >> 4 & 0x7) + field1398;
			int var96 = (var94 & 0x7) + field1399;
			int var97 = arg0.method240();
			int var98 = arg0.method240();
			int var99 = arg0.method240();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1119[field1390][var95][var96];
				if (var100 != null) {
					for (class30 var101 = (class30) var100.method257(); var101 != null; var101 = (class30) var100.method259()) {
						if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
							var101.field456 = var99;
							break;
						}
					}

					method434(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method504() {
		field1337 = false;
		while (field1093) {
			field1337 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1430 = null;
		field1431 = null;
		field1357 = null;
		field1179 = null;
		field1180 = null;
		field1181 = null;
		field1182 = null;
		field1394 = null;
		field1395 = null;
		field1247 = null;
		field1248 = null;
		field1108 = null;
		field1109 = null;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method505() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1243 = (field1243 + 1) % 4;
				field1288 = true;
				field1302 = true;
				field1041.method227(8);
				field1041.method228(field1243);
				field1041.method228(field1382);
				field1041.method228(field1299);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1382 = (field1382 + 1) % 3;
				field1288 = true;
				field1302 = true;
				field1041.method227(8);
				field1041.method228(field1243);
				field1041.method228(field1382);
				field1041.method228(field1299);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1299 = (field1299 + 1) % 3;
				field1288 = true;
				field1302 = true;
				field1041.method227(8);
				field1041.method228(field1243);
				field1041.method228(field1382);
				field1041.method228(field1299);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method517();
				field1380 = "";
				field1048 = false;

				for (int var1 = 0; var1 < class4.field57.length; var1++) {
					if (class4.field57[var1] != null && class4.field57[var1].field66 == 600) {
						field1404 = field1054 = class4.field57[var1].field63;
						return;
					}
				}

				return;
			}
		}
	}

	public final void init() {
		field1295 = Integer.parseInt(getParameter("nodeid"));
		field1296 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method491();
		} else {
			method470();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1297 = false;
		} else {
			field1297 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.e(II)V")
	public final void method506(int arg0) {
		if (!field1298) {
			if (class35.field592[17] >= arg0) {
				class37 var2 = class35.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1120 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1437;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1437 = var5;
				class35.method183(17);
			}

			if (class35.field592[24] >= arg0) {
				class37 var8 = class35.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1120 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1437;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1437 = var11;
				class35.method183(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method507() {
		if (field1343 > 0) {
			method554();
		} else {
			field1241.method267();
			field1128.method213(0, 257, 144, "Connection lost");
			field1128.method213(0xFFFFFF, 256, 143, "Connection lost");
			field1128.method213(0, 257, 159, "Please wait - attempting to reestablish");
			field1128.method213(0xFFFFFF, 256, 158, "Please wait - attempting to reestablish");
			field1241.method268(4, field9, 4);
			field1105 = 0;
			class5 var1 = field1125;
			field1190 = false;
			method551(field1035, field1036, true);

			if (!field1190) {
				method554();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method508() {
		byte[] var1 = field1111.method308("title.dat", null);
		class36 var2 = new class36(var1, this);
		field1366.method267();
		var2.method196(0, 0);
		field1367.method267();
		var2.method196(-637, 0);
		field1363.method267();
		var2.method196(-128, 0);
		field1364.method267();
		var2.method196(-202, -371);
		field1365.method267();
		var2.method196(-202, -171);
		field1368.method267();
		var2.method196(0, -265);
		field1369.method267();
		var2.method196(-562, -265);
		field1370.method267();
		var2.method196(-128, -171);
		field1371.method267();
		var2.method196(-562, -171);
		int[] var3 = new int[var2.field597];
		for (int var4 = 0; var4 < var2.field598; var4++) {
			for (int var5 = 0; var5 < var2.field597; var5++) {
				var3[var5] = var2.field596[var2.field597 * var4 + var2.field597 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field597; var6++) {
				var2.field596[var2.field597 * var4 + var6] = var3[var6];
			}
		}

		field1366.method267();
		var2.method196(382, 0);
		field1367.method267();
		var2.method196(-255, 0);
		field1363.method267();
		var2.method196(254, 0);
		field1364.method267();
		var2.method196(180, -371);
		field1365.method267();
		var2.method196(180, -171);
		field1368.method267();
		var2.method196(382, -265);
		field1369.method267();
		var2.method196(-180, -265);
		field1370.method267();
		var2.method196(254, -171);
		field1371.method267();
		var2.method196(-180, -171);
		class36 var7 = new class36(field1111, "logo", 0);
		field1363.method267();
		var7.method198(382 - var7.field597 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(BLjava/lang/String;I)V")
	public final void method13(String arg0, int arg1) {
		field1186 = arg1;
		field1405 = arg0;
		method477();

		if (field1111 == null) {
			super.method13(arg0, arg1);
		} else {
			field1365.method267();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1129.method213(0xFFFFFF, var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			class34.method170(var3 / 2 - 152, 34, var6, 304, 0x8C1111);
			class34.method170(var3 / 2 - 151, 32, var6 + 1, 302, 0);
			class34.method169(var6 + 2, 30, var3 / 2 - 150, arg1 * 3, 0x8C1111);
			class34.method169(var6 + 2, 30, arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, 0);
			field1129.method213(0xFFFFFF, var3 / 2, var4 / 2 + 5 - var5, arg0);
			field1365.method268(202, field9, 171);

			if (field1325) {
				field1325 = false;

				if (!field1337) {
					field1366.method268(0, field9, 0);
					field1367.method268(637, field9, 0);
				}

				field1363.method268(128, field9, 0);
				field1364.method268(202, field9, 371);
				field1368.method268(0, field9, 265);
				field1369.method268(562, field9, 265);
				field1370.method268(128, field9, 171);
				field1371.method268(562, field9, 171);
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method509() {
		for (int var1 = 0; var1 < field1408; var1++) {
			if (field1400[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1040[var1] != field1187 || field1356[var1] != field1378) {
						class39 var3 = class55.method322(field1040[var1], field1356[var1]);
						if (System.currentTimeMillis() + var3.field623 / 22 > field1415 / 22 + field1293) {
							field1415 = var3.field623;
							field1293 = System.currentTimeMillis();

							if (method431(var3.field623, var3.field622)) {
								field1187 = field1040[var1];
								field1378 = field1356[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method525()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1400[var1] != -5) {
					field1400[var1] = -5;
				} else {
					field1408--;
					for (int var5 = var1; var5 < field1408; var5++) {
						field1040[var5] = field1040[var5 + 1];
						field1356[var5] = field1356[var5 + 1];
						field1400[var5] = field1400[var5 + 1];
					}

					var1--;
				}
			} else {
				field1400[var1]--;
			}
		}

		if (field1103 > 0) {
			field1103 -= 20;
			if (field1103 < 0) {
				field1103 = 0;
			}

			if (field1103 == 0 && field1361 && !field1298) {
				field1162 = field1042;
				field1163 = false;
				field1381.method288(2, field1162);
				return;
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method510() {
		field1427++;
		method458(true);
		method528();
		method458(false);
		method545();
		method553();

		if (!field1192) {
			int var1 = field1055;
			if (field1320 / 256 > var1) {
				var1 = field1320 / 256;
			}

			if (field1131[4] && field1110[4] + 128 > var1) {
				var1 = field1110[4] + 128;
			}

			int var2 = field1200 + field1056 & 0x7FF;
			method450(var1, method526(field1335.field369, field1390, field1335.field368) - 50, field1199, field1198, var2, var1 * 3 + 600);
			field1397++;
			if (field1397 > 1802) {
				field1397 = 0;
				field1041.method227(223);
				field1041.method228(0);
				int var3 = field1041.field623;
				field1041.method229(29711);
				field1041.method228(70);
				field1041.method228((int) (Math.random() * 256.0D));
				field1041.method228(242);
				field1041.method228(186);
				field1041.method228(39);
				field1041.method228(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1041.method228(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1041.method229(57856);
				}

				field1041.method229((int) (Math.random() * 65536.0D));
				field1041.method237(field1041.field623 - var3);
			}
		}

		int var4;
		if (field1192) {
			var4 = method519();
		} else {
			var4 = method518();
		}

		int var5 = field1141;
		int var6 = field1142;
		int var7 = field1143;
		int var8 = field1144;
		int var9 = field1145;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1131[var10]) {
				int var11 = (int) (Math.random() * (field1121[var10] * 2 + 1) + Math.sin(field1256[var10] / 100.0D * field1140[var10]) * field1110[var10] - field1121[var10]);
				if (var10 == 0) {
					field1141 += var11;
				}

				if (var10 == 1) {
					field1142 += var11;
				}

				if (var10 == 2) {
					field1143 += var11;
				}

				if (var10 == 3) {
					field1145 = field1145 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1144 += var11;
					if (field1144 < 128) {
						field1144 = 128;
					}

					if (field1144 > 383) {
						field1144 = 383;
					}
				}
			}
		}

		int var12 = class35.field593;
		class32.field545 = true;
		class32.field548 = 0;
		class32.field546 = field17 - 4;
		class32.field547 = field18 - 4;
		class34.method167();
		field1085.method102(field1144, field1141, field1142, field1145, field1143, var4);
		field1085.method77();
		method481();
		method495();
		method506(var12);
		method430();
		field1241.method268(4, field9, 4);
		field1141 = var5;
		field1142 = var6;
		field1143 = var7;
		field1144 = var8;
		field1145 = var9;
	}

	@ObfuscatedName("client.b(ILjb;II)V")
	public final void method511(int arg0, class36 arg1, int arg2) {
		int var4 = field1056 + field1038 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class32.field550[var4];
			int var7 = class32.field551[var4];
			var6 = var6 * 256 / (field1267 + 256);
			var7 = var7 * 256 / (field1267 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method204(var8 + 94 + 4 - arg1.field601 / 2, field1304, 83 - var9 - arg1.field602 / 2 - 4);
			} else {
				arg1.method198(var8 + 94 + 4 - arg1.field601 / 2, 83 - var9 - arg1.field602 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method512() {
		short var1 = 256;

		if (field1406 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1406 > 768) {
					field1179[var2] = method432(1024 - field1406, field1180[var2], field1181[var2]);
				} else if (field1406 > 256) {
					field1179[var2] = field1181[var2];
				} else {
					field1179[var2] = method432(256 - field1406, field1181[var2], field1180[var2]);
				}
			}
		} else if (field1407 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1407 > 768) {
					field1179[var3] = method432(1024 - field1407, field1180[var3], field1182[var3]);
				} else if (field1407 > 256) {
					field1179[var3] = field1182[var3];
				} else {
					field1179[var3] = method432(256 - field1407, field1182[var3], field1180[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1179[var4] = field1180[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1366.field655[var5] = field1108.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1151[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1247[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1179[var12];
					int var15 = field1366.field655[var7];
					field1366.field655[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1366.method268(0, field9, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1367.field655[var16] = field1109.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1151[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1247[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1179[var23];
					int var26 = field1367.field655[var18];
					field1367.field655[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1367.method268(637, field9, 0);
	}

	@ObfuscatedName("client.H(I)V")
	public final void method513() {
		if (field1319 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1319 = 3;
				field1059 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1375 = "";
				field1376 = "Enter your username & password.";
				field1319 = 2;
				field1059 = 0;
			}
		} else if (field1319 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1059 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1059 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method551(field1035, field1036, false);

				if (field1190) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1319 = 0;
				field1035 = "";
				field1036 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1236.length(); var10++) {
					if (var8 == field1236.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1059 == 0) {
					if (var8 == 8 && field1035.length() > 0) {
						field1035 = field1035.substring(0, field1035.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1059 = 1;
					}

					if (var9) {
						field1035 = field1035 + (char) var8;
					}

					if (field1035.length() > 12) {
						field1035 = field1035.substring(0, 12);
					}
				} else if (field1059 == 1) {
					if (var8 == 8 && field1036.length() > 0) {
						field1036 = field1036.substring(0, field1036.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1059 = 0;
					}

					if (var9) {
						field1036 = field1036 + (char) var8;
					}

					if (field1036.length() > 20) {
						field1036 = field1036.substring(0, 20);
					}
				}
			}
		} else if (field1319 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1319 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method514() {
		field1240.method267();
		int var1 = field1056 + field1038 & 0x7FF;
		int var2 = field1335.field368 / 32 + 48;
		int var3 = 464 - field1335.field369 / 32;
		field1107.method202(field1323, field1124, field1267 + 256, 5, var2, 151, var3, 146, var1, 25);
		field1123.method202(field1086, field1287, 256, 0, 25, 33, 25, 33, field1056, 0);

		for (int var4 = 0; var4 < field1158; var4++) {
			int var5 = field1159[var4] * 4 + 2 - field1335.field368 / 32;
			int var6 = field1160[var4] * 4 + 2 - field1335.field369 / 32;
			method511(var5, field1314[var4], var6);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1119[field1390][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1335.field368 / 32;
					int var11 = var8 * 4 + 2 - field1335.field369 / 32;
					method511(var10, field1044, var11);
				}
			}
		}

		for (int var12 = 0; var12 < field1291; var12++) {
			class27 var13 = field1290[field1292[var12]];
			if (var13 != null && var13.method126() && var13.field422.field882) {
				int var14 = var13.field368 / 32 - field1335.field368 / 32;
				int var15 = var13.field369 / 32 - field1335.field369 / 32;
				method511(var14, field1045, var15);
			}
		}

		for (int var16 = 0; var16 < field1330; var16++) {
			class28 var17 = field1329[field1331[var16]];
			if (var17 != null && var17.method126()) {
				int var18 = var17.field368 / 32 - field1335.field368 / 32;
				int var19 = var17.field369 / 32 - field1335.field369 / 32;
				boolean var20 = false;
				long var21 = class52.method309(var17.field423);
				for (int var23 = 0; var23 < field1183; var23++) {
					if (field1191[var23] == var21 && field1270[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method511(var18, field1047, var19);
				} else {
					method511(var18, field1046, var19);
				}
			}
		}

		if (field1418 != 0 && field1259 % 20 < 10) {
			if (field1418 == 1 && field1097 >= 0 && field1097 < field1290.length) {
				class27 var24 = field1290[field1097];
				if (var24 != null) {
					int var25 = var24.field368 / 32 - field1335.field368 / 32;
					int var26 = var24.field369 / 32 - field1335.field369 / 32;
					method488(var26, field1077, var25);
				}
			}

			if (field1418 == 2) {
				int var27 = (field1113 - field1099) * 4 + 2 - field1335.field368 / 32;
				int var28 = (field1114 - field1100) * 4 + 2 - field1335.field369 / 32;
				method488(var28, field1077, var27);
			}

			if (field1418 == 10 && field1403 >= 0 && field1403 < field1329.length) {
				class28 var29 = field1329[field1403];
				if (var29 != null) {
					int var30 = var29.field368 / 32 - field1335.field368 / 32;
					int var31 = var29.field369 / 32 - field1335.field369 / 32;
					method488(var31, field1077, var30);
				}
			}
		}

		if (field1105 != 0) {
			int var32 = field1105 * 4 + 2 - field1335.field368 / 32;
			int var33 = field1106 * 4 + 2 - field1335.field369 / 32;
			method511(var32, field1076, var33);
		}

		class34.method169(78, 3, 97, 3, 0xFFFFFF);
		field1241.method267();
	}

	@ObfuscatedName("client.J(I)V")
	public final void method515() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public final String method516(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.K(I)V")
	public final void method517() {
		field1041.method227(245);

		if (field1073 != -1) {
			field1073 = -1;
			field1421 = true;
			field1202 = false;
			field1392 = true;
		}

		if (field1172 != -1) {
			field1172 = -1;
			field1302 = true;
			field1202 = false;
		}

		field1054 = -1;
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

	@ObfuscatedName("client.L(I)I")
	public final int method518() {
		int var1 = 3;
		if (field1144 < 310) {
			int var2 = field1141 >> 7;
			int var3 = field1143 >> 7;
			int var4 = field1335.field368 >> 7;
			int var5 = field1335.field369 >> 7;

			if ((field1419[field1390][var2][var3] & 0x4) != 0) {
				var1 = field1390;
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

					if ((field1419[field1390][var2][var3] & 0x4) != 0) {
						var1 = field1390;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1419[field1390][var2][var3] & 0x4) != 0) {
							var1 = field1390;
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

					if ((field1419[field1390][var2][var3] & 0x4) != 0) {
						var1 = field1390;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1419[field1390][var2][var3] & 0x4) != 0) {
							var1 = field1390;
						}
					}
				}
			}
		}

		if ((field1419[field1390][field1335.field368 >> 7][field1335.field369 >> 7] & 0x4) != 0) {
			var1 = field1390;
		}

		return var1;
	}

	@ObfuscatedName("client.f(Z)I")
	public final int method519() {
		int var1 = method526(field1143, field1390, field1141);
		if (var1 - field1142 < 800 && (field1419[field1390][field1141 >> 7][field1143 >> 7] & 0x4) != 0) {
			return field1390;
		}

		return 3;
	}

	@ObfuscatedName("client.b(IILmb;)V")
	public final void method520(int arg0, class39 arg1) {
		while (arg1.field624 + 21 < arg0 * 8) {
			int var3 = arg1.method249(13);
			if (var3 == 8191) {
				break;
			}

			if (field1290[var3] == null) {
				field1290[var3] = new class27();
			}

			class27 var4 = field1290[var3];
			field1292[field1291++] = var3;
			var4.field413 = field1259;
			var4.field422 = class59.method342(arg1.method249(11));
			var4.field372 = var4.field422.field867;
			var4.field375 = var4.field422.field871;
			var4.field376 = var4.field422.field872;
			var4.field377 = var4.field422.field873;
			var4.field378 = var4.field422.field874;
			var4.field373 = var4.field422.field870;
			int var5 = arg1.method249(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method249(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method123(field1335.field417[0] + var5, field1335.field418[0] + var6, false);
			int var7 = arg1.method249(1);
			if (var7 == 1) {
				field1333[field1332++] = var3;
			}
		}

		arg1.method250();
	}

	@ObfuscatedName("client.e(I)V")
	public final void method10() {
		field1325 = true;
	}

	@ObfuscatedName("client.a(BLob;)V")
	public final void method521(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field640 == 0) {
			var2 = field1085.method89(arg0.field639, arg0.field641, arg0.field642);
		}

		if (arg0.field640 == 1) {
			var2 = field1085.method90(arg0.field639, arg0.field641, arg0.field642);
		}

		if (arg0.field640 == 2) {
			var2 = field1085.method91(arg0.field639, arg0.field641, arg0.field642);
		}

		if (arg0.field640 == 3) {
			var2 = field1085.method92(arg0.field639, arg0.field641, arg0.field642);
		}

		if (var2 != 0) {
			int var6 = field1085.method93(arg0.field639, arg0.field641, arg0.field642, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field643 = var3;
		arg0.field645 = var4;
		arg0.field644 = var5;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method522(int arg0) {
		int[] var2 = field1107.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1419[arg0][var7][var5] & 0x18) == 0) {
					field1085.method98(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1419[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1085.method98(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1107.method193();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1419[arg0][var11][var10] & 0x18) == 0) {
					method452(var11, var10, var9, arg0, var8);
				}

				if (arg0 < 3 && (field1419[arg0 + 1][var11][var10] & 0x8) != 0) {
					method452(var11, var10, var9, arg0 + 1, var8);
				}
			}
		}

		field1241.method267();
		field1158 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1085.method92(field1390, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method333(var14).field838;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1379[field1390].field944;
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

						field1314[field1158] = field1377[var15];
						field1159[field1158] = var16;
						field1160[field1158] = var17;
						field1158++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method523() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1056 + field1038 & 0x7FF;
				int var4 = class35.field582[var3];
				int var5 = class35.field583[var3];
				var4 = (field1267 + 256) * var4 >> 8;
				var5 = (field1267 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1335.field368 + var6 >> 7;
				int var9 = field1335.field369 - var7 >> 7;
				boolean var10 = method429(0, 0, 1, 0, field1335.field418[0], 0, 0, var8, true, var9, field1335.field417[0]);
				if (var10) {
					field1041.method228(var1);
					field1041.method228(var2);
					field1041.method229(field1056);
					field1041.method228(57);
					field1041.method228(field1038);
					field1041.method228(field1267);
					field1041.method228(89);
					field1041.method229(field1335.field368);
					field1041.method229(field1335.field369);
					field1041.method228(field1249);
					field1041.method228(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method9() {
		if (field1135 || field1269 || field1112) {
			method461();
		} else {
			field1426++;

			if (field1190) {
				method446();
			} else {
				method479();
			}

			field1326 = 0;
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method524() {
		for (int var1 = -1; var1 < field1330; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1328;
			} else {
				var2 = field1331[var1];
			}

			class28 var3 = field1329[var2];
			if (var3 != null) {
				method440(1, var3);
			}
		}

		field1436++;
		if (field1436 > 1406) {
			field1436 = 0;
			field1041.method227(112);
			field1041.method228(0);
			int var4 = field1041.field623;
			field1041.method228(162);
			field1041.method228(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1041.method228(84);
			}

			field1041.method229(31824);
			field1041.method229(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1041.method228(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1041.method228(134);
			}

			field1041.method228(100);
			field1041.method228(94);
			field1041.method229(35521);
			field1041.method237(field1041.field623 - var4);
		}
	}

	@ObfuscatedName("client.i(B)Z")
	public final boolean method525() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method526(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field1419[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field1362[var6][var4][var5] + field1362[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1362[var6][var4][var5 + 1] + field1362[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.c(ILmb;I)V")
	public final void method527(class39 arg0, int arg1) {
		while (arg0.field624 + 10 < arg1 * 8) {
			int var3 = arg0.method249(11);
			if (var3 == 2047) {
				break;
			}

			if (field1329[var3] == null) {
				field1329[var3] = new class28();
				if (field1334[var3] != null) {
					field1329[var3].method129(field1334[var3]);
				}
			}

			field1331[field1330++] = var3;
			class28 var4 = field1329[var3];
			var4.field413 = field1259;
			int var5 = arg0.method249(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method249(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method249(1);
			var4.method123(field1335.field417[0] + var5, field1335.field418[0] + var6, var7 == 1);
			int var8 = arg0.method249(1);
			if (var8 == 1) {
				field1333[field1332++] = var3;
			}
		}

		arg0.method250();
	}

	@ObfuscatedName("client.O(I)V")
	public final void method528() {
		if (field1335.field368 >> 7 == field1105 && field1335.field369 >> 7 == field1106) {
			field1105 = 0;
		}

		for (int var1 = -1; var1 < field1330; var1++) {
			class28 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1335;
				var3 = field1328 << 14;
			} else {
				var2 = field1329[field1331[var1]];
				var3 = field1331[var1] << 14;
			}

			if (var2 != null && var2.method126()) {
				var2.field442 = false;
				if ((field1298 && field1330 > 50 || field1330 > 200) && var1 != -1 && var2.field393 == var2.field373) {
					var2.field442 = true;
				}

				int var4 = var2.field368 >> 7;
				int var5 = var2.field369 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field437 == null || field1259 < var2.field432 || field1259 >= var2.field433) {
						if ((var2.field368 & 0x7F) == 0x40 && (var2.field369 & 0x7F) == 0x40) {
							if (field1414[var4][var5] == field1427 && var1 != -1) {
								continue;
							}

							field1414[var4][var5] = field1427;
						}

						var2.field431 = method526(var2.field369, field1390, var2.field368);
						field1085.method74(60, var2.field369, var2.field370, var2.field368, var3, field1390, var2.field371, var2.field431, var2);
					} else {
						var2.field442 = false;
						var2.field431 = method526(var2.field369, field1390, var2.field368);
						field1085.method75(var2.field368, var2.field438, var2.field441, var2.field439, var2.field370, var2.field440, var2, field1390, var2.field431, var3, var2.field369, 60);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLd;)Z")
	public final boolean method529(class4 arg0) {
		int var2 = arg0.field66;
		if (var2 == 201) {
			field1302 = true;
			field1034 = false;
			field1094 = true;
			field1245 = "";
			field1423 = 1;
			field1091 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1302 = true;
			field1034 = false;
			field1094 = true;
			field1245 = "";
			field1423 = 2;
			field1091 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1343 = 250;
			return true;
		}

		if (var2 == 501) {
			field1302 = true;
			field1034 = false;
			field1094 = true;
			field1245 = "";
			field1423 = 4;
			field1091 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1302 = true;
			field1034 = false;
			field1094 = true;
			field1245 = "";
			field1423 = 5;
			field1091 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1090[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field958 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field958) {
							var5 = 0;
						}
					}

					if (!class64.field959[var5].field965 && class64.field959[var5].field960 == var3 + (field1244 ? 0 : 7)) {
						break;
					}
				}

				field1090[var3] = var5;
				field1238 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1215[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1053[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1053[var6].length) {
					var8 = 0;
				}
			}

			field1215[var6] = var8;
			field1238 = true;
		}

		if (var2 == 324 && !field1244) {
			field1244 = true;
			method496();
		}

		if (var2 == 325 && field1244) {
			field1244 = false;
			method496();
		}

		if (var2 == 326) {
			field1041.method227(150);
			field1041.method228(field1244 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1041.method228(field1090[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1041.method228(field1215[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1048 = !field1048;
		}

		if (var2 >= 601 && var2 <= 612) {
			method517();

			if (field1380.length() > 0) {
				field1041.method227(205);
				field1041.method234(class52.method309(field1380));
				field1041.method228(var2 - 601);
				field1041.method228(field1048 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method530(long arg0) {
		if (arg0 != 0L) {
			if (field1183 >= 100 && field1422 != 1) {
				method435("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field1183 >= 200) {
				method435("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = class52.method313(class52.method310(arg0));
				for (int var4 = 0; var4 < field1183; var4++) {
					if (field1191[var4] == arg0) {
						method435("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1185; var5++) {
					if (field1338[var5] == arg0) {
						method435("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1335.field423)) {
					field1344[field1183] = var3;
					field1191[field1183] = arg0;
					field1270[field1183] = 0;
					field1183++;
					field1421 = true;
					field1041.method227(116);
					field1041.method234(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIZ)V")
	public final void method531(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1206[var4] != null) {
				int var5 = field1204[var4];
				int var6 = field1146 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1205[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1243 == 0 || field1243 == 1 && method433(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field1335.field423)) {
						if (field1322 >= 1) {
							field1203[field1050] = "Report abuse @whi@" + var7;
							field1349[field1050] = 34;
							field1050++;
						}

						field1203[field1050] = "Add ignore @whi@" + var7;
						field1349[field1050] = 436;
						field1050++;
						field1203[field1050] = "Add friend @whi@" + var7;
						field1349[field1050] = 406;
						field1050++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1104 == 0 && (var5 == 7 || field1382 == 0 || field1382 == 1 && method433(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1322 >= 1) {
							field1203[field1050] = "Report abuse @whi@" + var7;
							field1349[field1050] = 34;
							field1050++;
						}

						field1203[field1050] = "Add ignore @whi@" + var7;
						field1349[field1050] = 436;
						field1050++;
						field1203[field1050] = "Add friend @whi@" + var7;
						field1349[field1050] = 406;
						field1050++;
					}

					var3++;
				}

				if (var5 == 4 && (field1299 == 0 || field1299 == 1 && method433(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1203[field1050] = "Accept trade @whi@" + var7;
						field1349[field1050] = 903;
						field1050++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1104 == 0 && field1382 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1299 == 0 || field1299 == 1 && method433(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1203[field1050] = "Accept duel @whi@" + var7;
						field1349[field1050] = 363;
						field1050++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1125 != null) {
				field1125.method38();
			}
		} catch (Exception var1) {
		}

		field1125 = null;
		method515();

		if (field1188 != null) {
			field1188.field854 = false;
		}

		field1188 = null;
		field1381.method280();
		field1381 = null;
		field1041 = null;
		field1352 = null;
		field1150 = null;
		field1353 = null;
		field1064 = null;
		field1360 = null;
		field1354 = null;
		field1355 = null;
		field1362 = null;
		field1419 = null;
		field1085 = null;
		field1379 = null;
		field1156 = null;
		field1043 = null;
		field1213 = null;
		field1214 = null;
		field1437 = null;
		field1239 = null;
		field1240 = null;
		field1241 = null;
		field1242 = null;
		field1372 = null;
		field1373 = null;
		field1374 = null;
		field1217 = null;
		field1218 = null;
		field1219 = null;
		field1220 = null;
		field1221 = null;
		field1222 = null;
		field1223 = null;
		field1224 = null;
		field1225 = null;
		field1303 = null;
		field1304 = null;
		field1305 = null;
		field1315 = null;
		field1316 = null;
		field1317 = null;
		field1438 = null;
		field1174 = null;
		field1175 = null;
		field1176 = null;
		field1177 = null;
		field1178 = null;
		field1385 = null;
		field1386 = null;
		field1387 = null;
		field1388 = null;
		field1389 = null;
		field1123 = null;
		field1312 = null;
		field1149 = null;
		field1092 = null;
		field1044 = null;
		field1045 = null;
		field1046 = null;
		field1047 = null;
		field1133 = null;
		field1377 = null;
		field1414 = null;
		field1329 = null;
		field1331 = null;
		field1333 = null;
		field1334 = null;
		field1359 = null;
		field1290 = null;
		field1292 = null;
		field1119 = null;
		field1263 = null;
		field1262 = null;
		field1173 = null;
		field1347 = null;
		field1348 = null;
		field1349 = null;
		field1350 = null;
		field1203 = null;
		field1283 = null;
		field1159 = null;
		field1160 = null;
		field1314 = null;
		field1107 = null;
		field1344 = null;
		field1191 = null;
		field1270 = null;
		field1366 = null;
		field1367 = null;
		field1363 = null;
		field1364 = null;
		field1365 = null;
		field1368 = null;
		field1369 = null;
		field1370 = null;
		field1371 = null;
		method504();
		class57.method332();
		class59.method341();
		class60.method347();
		class63.field946 = null;
		class64.field959 = null;
		class4.field57 = null;
		class65.field966 = null;
		class66.field978 = null;
		class67.field994 = null;
		class67.field1007 = null;
		class68.field1009 = null;
		field10 = null;
		class28.field444 = null;
		class35.method176();
		class19.method62();
		class32.method134();
		class8.method60();
		System.gc();
	}

	@ObfuscatedName("client.P(I)V")
	public final void method532() {
		if (field1250 == 0 && field1152 == 0) {
			field1203[field1050] = "Walk here";
			field1349[field1050] = 660;
			field1347[field1050] = field17;
			field1348[field1050] = field18;
			field1050++;
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

				if (var6 == 2 && field1085.method93(field1390, var4, var5, var3) >= 0) {
					class57 var8 = class57.method333(var7);
					if (field1250 == 1) {
						field1203[field1050] = "Use " + field1254 + " with @cya@" + var8.field820;
						field1349[field1050] = 450;
						field1350[field1050] = var3;
						field1347[field1050] = var4;
						field1348[field1050] = var5;
						field1050++;
					} else if (field1152 != 1) {
						if (var8.field836 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field836[var9] != null) {
									field1203[field1050] = var8.field836[var9] + " @cya@" + var8.field820;

									if (var9 == 0) {
										field1349[field1050] = 285;
									}

									if (var9 == 1) {
										field1349[field1050] = 504;
									}

									if (var9 == 2) {
										field1349[field1050] = 364;
									}

									if (var9 == 3) {
										field1349[field1050] = 581;
									}

									if (var9 == 4) {
										field1349[field1050] = 1501;
									}

									field1350[field1050] = var3;
									field1347[field1050] = var4;
									field1348[field1050] = var5;
									field1050++;
								}
							}
						}

						field1203[field1050] = "Examine @cya@" + var8.field820;
						field1349[field1050] = 1175;
						field1350[field1050] = var3;
						field1347[field1050] = var4;
						field1348[field1050] = var5;
						field1050++;
					} else if ((field1154 & 0x4) == 4) {
						field1203[field1050] = field1155 + " @cya@" + var8.field820;
						field1349[field1050] = 55;
						field1350[field1050] = var3;
						field1347[field1050] = var4;
						field1348[field1050] = var5;
						field1050++;
					}
				}

				if (var6 == 1) {
					class27 var10 = field1290[var7];
					if (var10.field422.field867 == 1 && (var10.field368 & 0x7F) == 0x40 && (var10.field369 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1291; var11++) {
							class27 var12 = field1290[field1292[var11]];
							if (var12 != null && var10 != var12 && var12.field422.field867 == 1 && var10.field368 == var12.field368 && var10.field369 == var12.field369) {
								method478(var4, field1292[var11], var12.field422, var5);
							}
						}
					}

					method478(var4, var7, var10.field422, var5);
				}

				if (var6 == 0) {
					class28 var13 = field1329[var7];
					if ((var13.field368 & 0x7F) == 0x40 && (var13.field369 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1291; var14++) {
							class27 var15 = field1290[field1292[var14]];
							if (var15 != null && var15.field422.field867 == 1 && var13.field368 == var15.field368 && var13.field369 == var15.field369) {
								method478(var4, field1292[var14], var15.field422, var5);
							}
						}

						for (int var16 = 0; var16 < field1330; var16++) {
							class28 var17 = field1329[field1331[var16]];
							if (var17 != null && var13 != var17 && var13.field368 == var17.field368 && var13.field369 == var17.field369) {
								method465(var17, var4, field1331[var16], var5);
							}
						}
					}

					method465(var13, var4, var7, var5);
				}

				if (var6 == 3) {
					class42 var18 = field1119[field1390][var4][var5];
					if (var18 != null) {
						for (class30 var19 = (class30) var18.method258(); var19 != null; var19 = (class30) var18.method260()) {
							class60 var20 = class60.method348(var19.field455);
							if (field1250 == 1) {
								field1203[field1050] = "Use " + field1254 + " with @lre@" + var20.field899;
								field1349[field1050] = 217;
								field1350[field1050] = var19.field455;
								field1347[field1050] = var4;
								field1348[field1050] = var5;
								field1050++;
							} else if (field1152 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field913 != null && var20.field913[var21] != null) {
										field1203[field1050] = var20.field913[var21] + " @lre@" + var20.field899;

										if (var21 == 0) {
											field1349[field1050] = 224;
										}

										if (var21 == 1) {
											field1349[field1050] = 993;
										}

										if (var21 == 2) {
											field1349[field1050] = 99;
										}

										if (var21 == 3) {
											field1349[field1050] = 746;
										}

										if (var21 == 4) {
											field1349[field1050] = 877;
										}

										field1350[field1050] = var19.field455;
										field1347[field1050] = var4;
										field1348[field1050] = var5;
										field1050++;
									} else if (var21 == 2) {
										field1203[field1050] = "Take @lre@" + var20.field899;
										field1349[field1050] = 99;
										field1350[field1050] = var19.field455;
										field1347[field1050] = var4;
										field1348[field1050] = var5;
										field1050++;
									}
								}

								field1203[field1050] = "Examine @lre@" + var20.field899;
								field1349[field1050] = 1102;
								field1350[field1050] = var19.field455;
								field1347[field1050] = var4;
								field1348[field1050] = var5;
								field1050++;
							} else if ((field1154 & 0x1) == 1) {
								field1203[field1050] = field1155 + " @lre@" + var20.field899;
								field1349[field1050] = 965;
								field1350[field1050] = var19.field455;
								field1347[field1050] = var4;
								field1348[field1050] = var5;
								field1050++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method533() {
		int var1 = field1129.method215("Choose Option");
		for (int var2 = 0; var2 < field1050; var2++) {
			int var3 = field1129.method215(field1203[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1050 * 15 + 21;
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

			field1235 = true;
			field1307 = 0;
			field1308 = var5;
			field1309 = var6;
			field1310 = var1;
			field1311 = field1050 * 15 + 22;
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

			field1235 = true;
			field1307 = 1;
			field1308 = var7;
			field1309 = var8;
			field1310 = var1;
			field1311 = field1050 * 15 + 22;
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

			field1235 = true;
			field1307 = 2;
			field1308 = var9;
			field1309 = var10;
			field1310 = var1;
			field1311 = field1050 * 15 + 22;
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method534() {
		try {
			int var1 = field1335.field368 + field1284;
			int var2 = field1335.field369 + field1410;
			if (field1198 - var1 < -500 || field1198 - var1 > 500 || field1199 - var2 < -500 || field1199 - var2 > 500) {
				field1198 = var1;
				field1199 = var2;
			}

			if (field1198 != var1) {
				field1198 += (var1 - field1198) / 16;
			}

			if (field1199 != var2) {
				field1199 += (var2 - field1199) / 16;
			}

			if (field27[1] == 1) {
				field1057 += (-field1057 - 24) / 2;
			} else if (field27[2] == 1) {
				field1057 += (24 - field1057) / 2;
			} else {
				field1057 /= 2;
			}

			if (field27[3] == 1) {
				field1058 += (12 - field1058) / 2;
			} else if (field27[4] == 1) {
				field1058 += (-field1058 - 12) / 2;
			} else {
				field1058 /= 2;
			}

			field1056 = field1057 / 2 + field1056 & 0x7FF;
			field1055 += field1058 / 2;
			if (field1055 < 128) {
				field1055 = 128;
			}

			if (field1055 > 383) {
				field1055 = 383;
			}

			int var3 = field1198 >> 7;
			int var4 = field1199 >> 7;
			int var5 = method526(field1199, field1390, field1198);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1390;
						if (var9 < 3 && (field1419[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1362[var9][var7][var8];
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

			if (var11 > field1320) {
				field1320 += (var11 - field1320) / 24;
			} else if (var11 < field1320) {
				field1320 += (var11 - field1320) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1335.field368 + "," + field1335.field369 + "," + field1198 + "," + field1199 + "," + field1065 + "," + field1066 + "," + field1099 + "," + field1100);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method535() {
		try {
			field1081 = -1;
			field1173.method261();
			field1262.method261();
			class35.method179();
			method469();
			field1085.method63();

			for (int var1 = 0; var1 < 4; var1++) {
				field1379[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(field1419, field1362, 104, 104);
			int var3 = field1064.length;
			class3.field32 = class19.field266;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1353[var4] >> 8;
				int var6 = field1353[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1085.method64(field1390);
			} else {
				field1085.method64(0);
			}

			field1041.method227(206);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1353[var7] >> 8) * 64 - field1099;
				int var9 = (field1353[var7] & 0xFF) * 64 - field1100;
				byte[] var10 = field1064[var7];
				if (var10 != null) {
					var2.method15(var10, (field1065 - 6) * 8, var9, var8, (field1066 - 6) * 8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1353[var11] >> 8) * 64 - field1099;
				int var13 = (field1353[var11] & 0xFF) * 64 - field1100;
				byte[] var14 = field1064[var11];
				if (var14 == null && field1066 < 800) {
					var2.method14(64, var13, var12, 64);
				}
			}

			field1041.method227(206);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1360[var15];
				if (var16 != null) {
					int var17 = (field1353[var15] >> 8) * 64 - field1099;
					int var18 = (field1353[var15] & 0xFF) * 64 - field1100;
					var2.method18(field1379, var18, var16, var17, field1085);
				}
			}

			field1041.method227(206);
			var2.method20(field1379, field1085);
			field1241.method267();
			field1041.method227(206);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method434(var19, var20);
				}
			}

			method498();
		} catch (Exception var33) {
		}

		class57.field851.method116();

		if (field1298 && signlink.cache_dat != null) {
			int var22 = field1381.method281(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1381.method286(var23);
				if ((var24 & 0x79) == 0) {
					class32.method137(var23);
				}
			}
		}

		System.gc();
		class35.method180(20);
		field1381.method292();
		int var25 = (field1065 - 6) / 8 - 1;
		int var26 = (field1065 + 6) / 8 + 1;
		int var27 = (field1066 - 6) / 8 - 1;
		int var28 = (field1066 + 6) / 8 + 1;
		if (field1207) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1381.method283(0, var29, var30);
					if (var31 != -1) {
						field1381.method293(var31, 3);
					}

					int var32 = field1381.method283(1, var29, var30);
					if (var32 != -1) {
						field1381.method293(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZLd;IIB)V")
	public final void method536(int arg0, int arg1, int arg2, int arg3, boolean arg4, class4 arg5, int arg6, int arg7) {
		if (field1416) {
			field1289 = 32;
		} else {
			field1289 = 0;
		}

		field1416 = false;
		if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 && arg6 < arg0 + 16) {
			arg5.field77 -= field1326 * 4;

			if (arg4) {
				field1421 = true;
				return;
			}
		} else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 + arg3 - 16 && arg6 < arg0 + arg3) {
			arg5.field77 += field1326 * 4;

			if (arg4) {
				field1421 = true;
				return;
			}
		} else if (arg7 >= arg1 - field1289 && arg7 < arg1 + field1289 + 16 && arg6 >= arg0 + 16 && arg6 < arg0 + arg3 - 16 && field1326 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg0 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg5.field77 = (arg2 - arg3) * var10 / var11;

			if (arg4) {
				field1421 = true;
			}

			field1416 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.S(I)V")
	public final void method537() {
		field1242.method267();
		class35.field584 = field1061;
		field1305.method211(0, 0);

		if (field1094) {
			field1129.method213(0, 239, 40, field1091);
			field1129.method213(128, 239, 60, field1245 + "*");
		} else if (field1034) {
			field1129.method213(0, 239, 40, "Enter amount:");
			field1129.method213(128, 239, 60, field1208 + "*");
		} else if (field1261 != null) {
			field1129.method213(0, 239, 40, field1261);
			field1129.method213(128, 239, 60, "Click to continue");
		} else if (field1172 != -1) {
			method473(class4.field57[field1172], 0, 0, 0);
		} else if (field1095 == -1) {
			class38 var1 = field1128;
			int var2 = 0;
			class34.method166(0, 463, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1206[var3] != null) {
					int var4 = field1204[var3];
					int var5 = field1146 + 70 - var2 * 14;
					String var6 = field1205[var3];
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
							var1.method216(field1206[var3], 0, 4, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1243 == 0 || field1243 == 1 && method433(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1383[0].method211(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1383[1].method211(var8, var5 - 12);
								var8 += 14;
							}

							var1.method216(var6 + ":", 0, var8, var5);
							var8 += var1.method215(var6) + 8;
							var1.method216(field1206[var3], 255, var8, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1104 == 0 && (var4 == 7 || field1382 == 0 || field1382 == 1 && method433(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method216("From", 0, var9, var5);
							int var11 = var9 + var1.method215("From ");
							if (var7 == 1) {
								field1383[0].method211(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1383[1].method211(var11, var5 - 12);
								var11 += 14;
							}

							var1.method216(var6 + ":", 0, var11, var5);
							var11 += var1.method215(var6) + 8;
							var1.method216(field1206[var3], 0x800000, var11, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field1299 == 0 || field1299 == 1 && method433(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(var6 + " " + field1206[var3], 0x800080, 4, var5);
						}

						var2++;
					}

					if (var4 == 5 && field1104 == 0 && field1382 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(field1206[var3], 0x800000, 4, var5);
						}

						var2++;
					}

					if (var4 == 6 && field1104 == 0 && field1382 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216("To " + var6 + ":", 0, 4, var5);
							var1.method216(field1206[var3], 0x800000, var1.method215("To " + var6) + 12, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field1299 == 0 || field1299 == 1 && method433(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(var6 + " " + field1206[var3], 0x7E3200, 4, var5);
						}

						var2++;
					}
				}
			}

			class34.method165();
			field1184 = var2 * 14 + 7;
			if (field1184 < 78) {
				field1184 = 78;
			}

			method538(0, 463, field1184 - field1146 - 77, field1184, 77);
			String var10;
			if (field1335 == null || field1335.field423 == null) {
				var10 = class52.method313(field1035);
			} else {
				var10 = field1335.field423;
			}

			var1.method216(var10 + ":", 0, 4, 90);
			var1.method216(field1134 + "*", 255, var1.method215(var10 + ": ") + 6, 90);
			class34.method172(77, 479, 0, 0);
		} else {
			method473(class4.field57[field1095], 0, 0, 0);
		}

		if (field1235 && field1307 == 2) {
			method438();
		}

		field1242.method268(17, field9, 357);
		field1241.method267();
		class35.field584 = field1063;
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1075) {
			field1135 = true;
		} else {
			field1075 = true;
			boolean var1 = false;
			String var2 = method427();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
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
						field1132[var3] = new class49(signlink.cache_dat, var3 + 1, 500000, signlink.cache_idx[var3]);
					}
				}

				try {
					int var4 = 5;
					field1321[8] = 0;
					while (field1321[8] == 0) {
						method13("Connecting to web server", 20);

						try {
							DataInputStream var5 = method483("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field622, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1321[var7] = var6.method243();
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

					field1111 = method555("title screen", 1, field1321[1], "title", 25);
					field1127 = new class38("p11", field1111);
					field1128 = new class38("p12", field1111);
					field1129 = new class38("b12", field1111);
					field1130 = new class38("q8", field1111);
					method508();
					method451();
					class51 var9 = method555("config", 2, field1321[2], "config", 30);
					class51 var10 = method555("interface", 3, field1321[3], "interface", 35);
					class51 var11 = method555("2d graphics", 4, field1321[4], "media", 40);
					class51 var12 = method555("textures", 6, field1321[6], "textures", 45);
					class51 var13 = method555("chat system", 7, field1321[7], "wordenc", 50);
					class51 var14 = method555("sound effects", 8, field1321[8], "sounds", 55);
					field1419 = new byte[4][104][104];
					field1362 = new int[4][105][105];
					field1085 = new class19(field1362, 104, 104, 4);

					for (int var15 = 0; var15 < 4; var15++) {
						field1379[var15] = new class62(104, 104);
					}

					field1107 = new class36(512, 512);
					class51 var16 = method555("update list", 5, field1321[5], "versionlist", 60);
					method13("Connecting to update server", 60);
					field1381 = new class48();
					field1381.method279(var16, this);
					class8.method58(field1381.method282());
					class32.method135(field1381.method281(0), field1381);

					if (!field1298) {
						field1162 = 0;
						field1163 = false;
						field1381.method288(2, field1162);

						while (field1381.method289() > 0) {
							method474();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}
						}
					}

					method13("Requesting animations", 65);
					int var17 = field1381.method281(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1381.method288(1, var18);
					}

					while (field1381.method289() > 0) {
						int var19 = var17 - field1381.method289();
						if (var19 > 0) {
							method13("Loading animations - " + var19 * 100 / var17 + "%", 65);
						}

						method474();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}
					}

					method13("Requesting models", 70);
					int var20 = field1381.method281(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1381.method286(var21);
						if ((var22 & 0x1) != 0) {
							field1381.method288(0, var21);
						}
					}

					int var23 = field1381.method289();
					while (field1381.method289() > 0) {
						int var24 = var23 - field1381.method289();
						if (var24 > 0) {
							method13("Loading models - " + var24 * 100 / var23 + "%", 70);
						}

						method474();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field1132[0] != null) {
						method13("Requesting maps", 75);
						field1381.method288(3, field1381.method283(0, 47, 48));
						field1381.method288(3, field1381.method283(1, 47, 48));
						field1381.method288(3, field1381.method283(0, 48, 48));
						field1381.method288(3, field1381.method283(1, 48, 48));
						field1381.method288(3, field1381.method283(0, 49, 48));
						field1381.method288(3, field1381.method283(1, 49, 48));
						field1381.method288(3, field1381.method283(0, 47, 47));
						field1381.method288(3, field1381.method283(1, 47, 47));
						field1381.method288(3, field1381.method283(0, 48, 47));
						field1381.method288(3, field1381.method283(1, 48, 47));
						field1381.method288(3, field1381.method283(0, 48, 148));
						field1381.method288(3, field1381.method283(1, 48, 148));
						int var25 = field1381.method289();
						while (field1381.method289() > 0) {
							int var26 = var25 - field1381.method289();
							if (var26 > 0) {
								method13("Loading maps - " + var26 * 100 / var25 + "%", 75);
							}

							method474();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var27 = field1381.method281(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1381.method286(var28);
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
							field1381.method291(var28, 0, var30);
						}
					}

					field1381.method284(field1297);

					if (!field1298) {
						int var31 = field1381.method281(2);
						for (int var32 = 1; var32 < var31; var32++) {
							if (field1381.method287(var32)) {
								field1381.method291(var32, 2, (byte) 1);
							}
						}
					}

					method13("Unpacking media", 80);
					field1303 = new class37(var11, "invback", 0);
					field1305 = new class37(var11, "chatback", 0);
					field1304 = new class37(var11, "mapback", 0);
					field1315 = new class37(var11, "backbase1", 0);
					field1316 = new class37(var11, "backbase2", 0);
					field1317 = new class37(var11, "backhmid1", 0);

					for (int var33 = 0; var33 < 13; var33++) {
						field1438[var33] = new class37(var11, "sideicons", var33);
					}

					field1123 = new class36(var11, "compass", 0);
					field1037 = new class36(var11, "mapedge", 0);
					field1037.method195();

					try {
						for (int var34 = 0; var34 < 50; var34++) {
							field1133[var34] = new class37(var11, "mapscene", var34);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var35 = 0; var35 < 50; var35++) {
							field1377[var35] = new class36(var11, "mapfunction", var35);
						}
					} catch (Exception var78) {
					}

					try {
						for (int var36 = 0; var36 < 20; var36++) {
							field1312[var36] = new class36(var11, "hitmarks", var36);
						}
					} catch (Exception var77) {
					}

					try {
						for (int var37 = 0; var37 < 20; var37++) {
							field1149[var37] = new class36(var11, "headicons", var37);
						}
					} catch (Exception var76) {
					}

					field1076 = new class36(var11, "mapmarker", 0);
					field1077 = new class36(var11, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field1092[var38] = new class36(var11, "cross", var38);
					}

					field1044 = new class36(var11, "mapdots", 0);
					field1045 = new class36(var11, "mapdots", 1);
					field1046 = new class36(var11, "mapdots", 2);
					field1047 = new class36(var11, "mapdots", 3);
					field1147 = new class37(var11, "scrollbar", 0);
					field1148 = new class37(var11, "scrollbar", 1);
					field1174 = new class37(var11, "redstone1", 0);
					field1175 = new class37(var11, "redstone2", 0);
					field1176 = new class37(var11, "redstone3", 0);
					field1177 = new class37(var11, "redstone1", 0);
					field1177.method208();
					field1178 = new class37(var11, "redstone2", 0);
					field1178.method208();
					field1385 = new class37(var11, "redstone1", 0);
					field1385.method209();
					field1386 = new class37(var11, "redstone2", 0);
					field1386.method209();
					field1387 = new class37(var11, "redstone3", 0);
					field1387.method209();
					field1388 = new class37(var11, "redstone1", 0);
					field1388.method208();
					field1388.method209();
					field1389 = new class37(var11, "redstone2", 0);
					field1389.method208();
					field1389.method209();

					for (int var39 = 0; var39 < 2; var39++) {
						field1383[var39] = new class37(var11, "mod_icons", var39);
					}

					class36 var40 = new class36(var11, "backleft1", 0);
					field1217 = new class44(var40.field598, method11(), var40.field597);
					var40.method196(0, 0);
					class36 var41 = new class36(var11, "backleft2", 0);
					field1218 = new class44(var41.field598, method11(), var41.field597);
					var41.method196(0, 0);
					class36 var42 = new class36(var11, "backright1", 0);
					field1219 = new class44(var42.field598, method11(), var42.field597);
					var42.method196(0, 0);
					class36 var43 = new class36(var11, "backright2", 0);
					field1220 = new class44(var43.field598, method11(), var43.field597);
					var43.method196(0, 0);
					class36 var44 = new class36(var11, "backtop1", 0);
					field1221 = new class44(var44.field598, method11(), var44.field597);
					var44.method196(0, 0);
					class36 var45 = new class36(var11, "backvmid1", 0);
					field1222 = new class44(var45.field598, method11(), var45.field597);
					var45.method196(0, 0);
					class36 var46 = new class36(var11, "backvmid2", 0);
					field1223 = new class44(var46.field598, method11(), var46.field597);
					var46.method196(0, 0);
					class36 var47 = new class36(var11, "backvmid3", 0);
					field1224 = new class44(var47.field598, method11(), var47.field597);
					var47.method196(0, 0);
					class36 var48 = new class36(var11, "backhmid2", 0);
					field1225 = new class44(var48.field598, method11(), var48.field597);
					var48.method196(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 50; var53++) {
						if (field1377[var53] != null) {
							field1377[var53].method194(var49 + var52, var50 + var52, var51 + var52);
						}

						if (field1133[var53] != null) {
							field1133[var53].method210(var49 + var52, var50 + var52, var51 + var52);
						}
					}

					method13("Unpacking textures", 83);
					class35.method181(var12);
					class35.method185(0.8D);
					class35.method180(20);
					method13("Unpacking config", 86);
					class66.method381(var9);
					class57.method331(var9);
					class63.method371(var9);
					class60.method346(var9);
					class59.method340(var9);
					class64.method375(var9);
					class67.method384(var9);
					class68.method387(var9);
					class60.field896 = field1297;

					if (!field1298) {
						method13("Unpacking sounds", 90);
						byte[] var54 = var14.method308("sounds.dat", null);
						class39 var55 = new class39(var54);
						class55.method321(var55);
					}

					method13("Unpacking interfaces", 95);
					class38[] var56 = new class38[] { field1127, field1128, field1129, field1130 };
					class4.method32(var56, var11, var10);
					method13("Preparing game engine", 100);

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field1304.field603[field1304.field605 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field1086[var57] = var58;
						field1287[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field1304.field603[field1304.field605 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field1323[var61 - 5] = var62 - 25;
						field1124[var61 - 5] = var63 - var62;
					}

					class35.method178(479, 96);
					field1061 = class35.field584;
					class35.method178(190, 261);
					field1062 = class35.field584;
					class35.method178(512, 334);
					field1063 = class35.field584;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = class35.field582[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					class19.method99(800, 512, var65, 334, 500);
					class69.method389(var13);
					field1188 = new class58(this);
				} catch (Exception var81) {
					signlink.reporterror("loaderror " + field1405 + " " + field1186);
					field1269 = true;
				}
			} else {
				field1112 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZ)V")
	public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1147.method211(arg1, arg0);
		field1148.method211(arg1, arg0 + arg4 - 16);
		class34.method169(arg0 + 16, arg4 - 32, arg1, 16, field1391);
		int var6 = (arg4 - 32) * arg4 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg3 - arg4);
		class34.method169(arg0 + var7 + 16, var6, arg1, 16, field1083);
		class34.method174(field1216, arg1, var6, arg0 + var7 + 16);
		class34.method174(field1216, arg1 + 1, var6, arg0 + var7 + 16);
		class34.method172(arg0 + var7 + 16, 16, arg1, field1216);
		class34.method172(arg0 + var7 + 17, 16, arg1, field1216);
		class34.method174(field1300, arg1 + 15, var6, arg0 + var7 + 16);
		class34.method174(field1300, arg1 + 14, var6 - 1, arg0 + var7 + 17);
		class34.method172(arg0 + var7 + var6 + 15, 16, arg1, field1300);
		class34.method172(arg0 + var7 + var6 + 14, 15, arg1 + 1, field1300);
	}

	@ObfuscatedName("client.T(I)V")
	public final void method539() {
		for (int var1 = -1; var1 < field1330; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1328;
			} else {
				var2 = field1331[var1];
			}

			class28 var3 = field1329[var2];
			if (var3 != null && var3.field381 > 0) {
				var3.field381--;
				if (var3.field381 == 0) {
					var3.field380 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1291; var4++) {
			int var5 = field1292[var4];
			class27 var6 = field1290[var5];
			if (var6 != null && var6.field381 > 0) {
				var6.field381--;
				if (var6.field381 == 0) {
					var6.field380 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BIIII)Z")
	public final boolean method540(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1085.method93(field1390, arg2, arg3, arg0);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var9 = class57.method333(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field824;
				var11 = var9.field825;
			} else {
				var10 = var9.field825;
				var11 = var9.field824;
			}

			int var12 = var9.field848;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method429(0, var11, 2, 0, field1335.field418[0], var10, var12, arg2, false, arg3, field1335.field417[0]);
		} else {
			method429(var7 + 1, 0, 2, var8, field1335.field418[0], 0, 0, arg2, false, arg3, field1335.field417[0]);
		}

		field1136 = field24;
		field1137 = field25;
		field1139 = 2;
		field1138 = 0;
		field1041.method227(arg1);
		field1041.method229(field1099 + arg2);
		field1041.method229(field1100 + arg3);
		field1041.method229(var5);
		return true;
	}

	@ObfuscatedName("client.U(I)V")
	public final void method541() {
		if (field1413 > 1) {
			field1413--;
		}

		if (field1343 > 0) {
			field1343--;
		}

		if (field1313 > 0) {
			field1313 -= 2;
		}

		for (int var1 = 0; var1 < 5 && method449(); var1++) {
		}

		if (field1190) {
			method475();
			method489();
			method509();
			class39 var2 = class6.method46();
			if (var2 != null) {
				field1041.method227(19);
				field1041.method229(var2.field623);
				field1041.method236(var2.field622, var2.field623, 0);
				var2.method226();
			}

			field1341++;
			if (field1341 > 750) {
				method507();
			}

			method524();
			method439();
			method539();
			field1120++;

			if (field1139 != 0) {
				field1138 += 20;
				if (field1138 >= 400) {
					field1139 = 0;
				}
			}

			if (field1435 != 0) {
				field1432++;
				if (field1432 >= 15) {
					if (field1435 == 2) {
						field1421 = true;
					}

					if (field1435 == 3) {
						field1302 = true;
					}

					field1435 = 0;
				}
			}

			if (field1169 != 0) {
				field1246++;

				if (field17 > field1170 + 5 || field17 < field1170 - 5 || field18 > field1171 + 5 || field18 < field1171 - 5) {
					field1393 = true;
				}

				if (field16 == 0) {
					if (field1169 == 2) {
						field1421 = true;
					}

					if (field1169 == 3) {
						field1302 = true;
					}

					field1169 = 0;

					if (field1393 && field1246 >= 5) {
						field1258 = -1;
						method468();

						if (field1258 == field1167 && field1257 != field1168) {
							class4 var3 = class4.field57[field1167];
							byte var4 = 0;
							if (field1424 == 1 && var3.field66 == 206) {
								var4 = 1;
							}

							if (var3.field58[field1257] <= 0) {
								var4 = 0;
							}

							if (var3.field87) {
								int var5 = field1168;
								int var6 = field1257;
								var3.field58[var6] = var3.field58[var5];
								var3.field59[var6] = var3.field59[var5];
								var3.field58[var5] = -1;
								var3.field59[var5] = 0;
							} else if (var4 == 1) {
								int var7 = field1168;
								int var8 = field1257;
								while (var7 != var8) {
									if (var7 > var8) {
										var3.method33(var7, var7 - 1);
										var7--;
									} else if (var7 < var8) {
										var3.method33(var7, var7 + 1);
										var7++;
									}
								}
							} else {
								var3.method33(field1168, field1257);
							}

							field1041.method227(7);
							field1041.method229(field1167);
							field1041.method229(field1168);
							field1041.method229(field1257);
							field1041.method228(var4);
						}
					} else if ((field1231 == 1 || method492(field1050 - 1)) && field1050 > 2) {
						method533();
					} else if (field1050 > 0) {
						method462(field1050 - 1);
					}

					field1432 = 10;
					field23 = 0;
				}
			}

			field1429++;
			if (field1429 > 127) {
				field1429 = 0;
				field1041.method227(181);
				field1041.method231(0x4C2B2C);
			}

			if (class19.field300 != -1) {
				int var9 = class19.field300;
				int var10 = class19.field301;
				boolean var11 = method429(0, 0, 0, 0, field1335.field418[0], 0, 0, var9, true, var10, field1335.field417[0]);
				class19.field300 = -1;

				if (var11) {
					field1136 = field24;
					field1137 = field25;
					field1139 = 1;
					field1138 = 0;
				}
			}

			if (field23 == 1 && field1261 != null) {
				field1261 = null;
				field1302 = true;
				field23 = 0;
			}

			method486();
			method523();
			method501();
			method505();

			if (field16 == 1 || field23 == 1) {
				field1326++;
			}

			if (field1318 == 2) {
				method534();
			}

			if (field1318 == 2 && field1192) {
				method447();
			}

			for (int var12 = 0; var12 < 5; var12++) {
				field1140[var12]++;
			}

			method557();
			field15++;
			if (field15 > 4500) {
				field1343 = 250;
				field15 -= 500;
				field1041.method227(102);
			}

			field1417++;
			if (field1417 > 500) {
				field1417 = 0;
				int var13 = (int) (Math.random() * 8.0D);
				if ((var13 & 0x1) == 1) {
					field1284 += field1285;
				}

				if ((var13 & 0x2) == 2) {
					field1410 += field1411;
				}

				if ((var13 & 0x4) == 4) {
					field1200 += field1201;
				}
			}

			if (field1284 < -50) {
				field1285 = 2;
			}

			if (field1284 > 50) {
				field1285 = -2;
			}

			if (field1410 < -55) {
				field1411 = 2;
			}

			if (field1410 > 55) {
				field1411 = -2;
			}

			if (field1200 < -40) {
				field1201 = 1;
			}

			if (field1200 > 40) {
				field1201 = -1;
			}

			field1324++;
			if (field1324 > 500) {
				field1324 = 0;
				int var14 = (int) (Math.random() * 8.0D);
				if ((var14 & 0x1) == 1) {
					field1038 += field1039;
				}

				if ((var14 & 0x2) == 2) {
					field1267 += field1268;
				}
			}

			if (field1038 < -60) {
				field1039 = 2;
			}

			if (field1038 > 60) {
				field1039 = -2;
			}

			if (field1267 < -20) {
				field1268 = 1;
			}

			if (field1267 > 10) {
				field1268 = -1;
			}

			field1080++;
			if (field1080 > 110) {
				field1080 = 0;
				field1041.method227(94);
				field1041.method232(0);
			}

			field1342++;
			if (field1342 > 50) {
				field1041.method227(206);
			}

			try {
				if (field1125 != null && field1041.field623 > 0) {
					field1125.method42(0, field1041.field623, field1041.field622);
					field1041.field623 = 0;
					field1342 = 0;
				}
			} catch (IOException var16) {
				method507();
			} catch (Exception var17) {
				method554();
			}
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void method542(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method543(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field57[arg0];
		for (int var5 = 0; var5 < var4.field79.length && var4.field79[var5] != -1; var5++) {
			class4 var6 = class4.field57[var4.field79[var5]];
			if (var6.field64 == 1) {
				var3 |= method543(var6.field62, arg1);
			}

			if (var6.field64 == 6 && (var6.field110 != -1 || var6.field111 != -1)) {
				boolean var7 = method547(var6);
				int var8;
				if (var7) {
					var8 = var6.field111;
				} else {
					var8 = var6.field110;
				}

				if (var8 != -1) {
					class66 var9 = class66.field978[var8];
					var6.field61 += arg1;
					while (var6.field61 > var9.method382(var6.field60)) {
						var6.field61 -= var9.method382(var6.field60) + 1;
						var6.field60++;
						if (var6.field60 >= var9.field979) {
							var6.field60 -= var9.field983;
							if (var6.field60 < 0 || var6.field60 >= var9.field979) {
								var6.field60 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method544(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.V(I)V")
	public final void method545() {
		for (class31 var1 = (class31) field1262.method257(); var1 != null; var1 = (class31) field1262.method259()) {
			if (field1390 != var1.field458 || field1259 > var1.field464) {
				var1.method119();
			} else if (field1259 >= var1.field463) {
				if (var1.field467 > 0) {
					class27 var2 = field1290[var1.field467 - 1];
					if (var2 != null && var2.field368 >= 0 && var2.field368 < 13312 && var2.field369 >= 0 && var2.field369 < 13312) {
						var1.method132(var2.field368, var2.field369, field1259, method526(var2.field369, var1.field458, var2.field368) - var1.field462);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class28 var4;
					if (field1396 == var3) {
						var4 = field1335;
					} else {
						var4 = field1329[var3];
					}

					if (var4 != null && var4.field368 >= 0 && var4.field368 < 13312 && var4.field369 >= 0 && var4.field369 < 13312) {
						var1.method132(var4.field368, var4.field369, field1259, method526(var4.field369, var1.field458, var4.field368) - var1.field462);
					}
				}

				var1.method133(field1120);
				field1085.method74(60, (int) var1.field470, var1.field477, (int) var1.field469, -1, field1390, false, (int) var1.field471, var1);
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method546() {
		if (field1104 != 0) {
			int var1 = 0;
			if (field1413 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1206[var2] != null) {
					int var3 = field1204[var2];
					String var4 = field1205[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1382 == 0 || field1382 == 1 && method433(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1128.method215("From:  " + var4 + field1206[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1322 >= 1) {
									field1203[field1050] = "Report abuse @whi@" + var4;
									field1349[field1050] = 2034;
									field1050++;
								}

								field1203[field1050] = "Add ignore @whi@" + var4;
								field1349[field1050] = 2436;
								field1050++;
								field1203[field1050] = "Add friend @whi@" + var4;
								field1349[field1050] = 2406;
								field1050++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1382 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method547(class4 arg0) {
		if (arg0.field73 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field73.length; var2++) {
			int var3 = method552(arg0, var2);
			int var4 = arg0.field74[var2];
			if (arg0.field73[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field73[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field73[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(BIILbb;Lmb;)V")
	public final void method548(int arg0, int arg1, class28 arg2, class39 arg3) {
		if ((arg0 & 0x1) == 1) {
			int var5 = arg3.method238();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg3.method247(var5, var6, 0);
			field1334[arg1] = var7;
			arg2.method129(var7);
		}

		if ((arg0 & 0x2) == 2) {
			int var8 = arg3.method240();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field396 == var8) {
				arg2.field400 = 0;
			}

			int var9 = arg3.method238();
			if (arg2.field396 == var8 && var8 != -1) {
				int var10 = class66.field978[var8].field992;
				if (var10 == 1) {
					arg2.field397 = 0;
					arg2.field398 = 0;
					arg2.field399 = var9;
					arg2.field400 = 0;
				}

				if (var10 == 2) {
					arg2.field400 = 0;
				}
			} else if (var8 == -1 || arg2.field396 == -1 || class66.field978[var8].field986 >= class66.field978[arg2.field396].field986) {
				arg2.field396 = var8;
				arg2.field397 = 0;
				arg2.field398 = 0;
				arg2.field399 = var9;
				arg2.field400 = 0;
				arg2.field421 = arg2.field416;
			}
		}

		if ((arg0 & 0x4) == 4) {
			arg2.field390 = arg3.method240();
			if (arg2.field390 == 0xFFFF) {
				arg2.field390 = -1;
			}
		}

		if ((arg0 & 0x8) == 8) {
			arg2.field380 = arg3.method245();
			arg2.field382 = 0;
			arg2.field383 = 0;
			arg2.field381 = 150;
			method435(arg2.field423, 2, arg2.field380);
		}

		if ((arg0 & 0x10) == 0x10) {
			int var11 = arg3.method238();
			int var12 = arg3.method238();
			arg2.method127(var12, var11);
			arg2.field387 = field1259 + 300;
			arg2.field388 = arg3.method238();
			arg2.field389 = arg3.method238();
		}

		if ((arg0 & 0x20) == 0x20) {
			arg2.field391 = arg3.method240();
			arg2.field392 = arg3.method240();
		}

		if ((arg0 & 0x40) == 0x40) {
			int var13 = arg3.method240();
			int var14 = arg3.method238();
			int var15 = arg3.method238();
			int var16 = arg3.field623;

			if (arg2.field423 != null && arg2.field424) {
				long var17 = class52.method309(arg2.field423);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1185; var20++) {
						if (field1338[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1286 == 0) {
					try {
						String var21 = class53.method316(var15, arg3);
						var21 = class69.method399(var21);
						arg2.field380 = var21;
						arg2.field382 = var13 >> 8;
						arg2.field383 = var13 & 0xFF;
						arg2.field381 = 150;

						if (var14 == 2 || var14 == 3) {
							method435("@cr2@" + arg2.field423, 1, var21);
						} else if (var14 == 1) {
							method435("@cr1@" + arg2.field423, 1, var21);
						} else {
							method435(arg2.field423, 2, var21);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field623 = var15 + var16;
		}

		if ((arg0 & 0x100) == 0x100) {
			arg2.field401 = arg3.method240();
			int var23 = arg3.method243();
			arg2.field405 = var23 >> 16;
			arg2.field404 = (var23 & 0xFFFF) + field1259;
			arg2.field402 = 0;
			arg2.field403 = 0;

			if (arg2.field404 > field1259) {
				arg2.field402 = -1;
			}

			if (arg2.field401 == 0xFFFF) {
				arg2.field401 = -1;
			}
		}

		if ((arg0 & 0x200) == 0x200) {
			arg2.field406 = arg3.method238();
			arg2.field408 = arg3.method238();
			arg2.field407 = arg3.method238();
			arg2.field409 = arg3.method238();
			arg2.field410 = arg3.method240() + field1259;
			arg2.field411 = arg3.method240() + field1259;
			arg2.field412 = arg3.method238();
			arg2.method125();
		}

		if ((arg0 & 0x400) == 0x400) {
			int var24 = arg3.method238();
			int var25 = arg3.method238();
			arg2.method127(var25, var24);
			arg2.field387 = field1259 + 300;
			arg2.field388 = arg3.method238();
			arg2.field389 = arg3.method238();
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method549(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1185; var3++) {
				if (field1338[var3] == arg0) {
					field1185--;
					field1421 = true;

					for (int var4 = var3; var4 < field1185; var4++) {
						field1338[var4] = field1338[var4 + 1];
					}

					field1041.method227(4);
					field1041.method234(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IILmb;)V")
	public final void method550(int arg0, class39 arg1) {
		arg1.method248();
		int var3 = arg1.method249(1);
		if (var3 != 0) {
			int var4 = arg1.method249(2);
			if (var4 == 0) {
				field1333[field1332++] = field1328;
			} else if (var4 == 1) {
				int var5 = arg1.method249(3);
				field1335.method124(false, var5);
				int var6 = arg1.method249(1);
				if (var6 == 1) {
					field1333[field1332++] = field1328;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method249(3);
				field1335.method124(true, var7);
				int var8 = arg1.method249(3);
				field1335.method124(true, var8);
				int var9 = arg1.method249(1);
				if (var9 == 1) {
					field1333[field1332++] = field1328;
				}
			} else if (var4 == 3) {
				field1390 = arg1.method249(2);
				int var10 = arg1.method249(7);
				int var11 = arg1.method249(7);
				int var12 = arg1.method249(1);
				field1335.method123(var10, var11, var12 == 1);
				int var13 = arg1.method249(1);
				if (var13 == 1) {
					field1333[field1332++] = field1328;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method551(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1375 = "";
				field1376 = "Connecting to server...";
				method479();
			}

			field1125 = new class5(this, method556(field1296 + 43594));
			long var4 = class52.method309(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1041.field623 = 0;
			field1041.method228(14);
			field1041.method228(var6);
			field1125.method42(0, 2, field1041.field622);

			for (int var7 = 0; var7 < 8; var7++) {
				field1125.method39();
			}

			int var8 = field1125.method39();
			if (var8 == 0) {
				field1125.method41(field1150.field622, 0, 8);
				field1150.field623 = 0;
				field1409 = field1150.method244();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1409 >> 32), (int) field1409 };
				field1041.field623 = 0;
				field1041.method228(10);
				field1041.method232(var9[0]);
				field1041.method232(var9[1]);
				field1041.method232(var9[2]);
				field1041.method232(var9[3]);
				field1041.method232(signlink.uid);
				field1041.method235(arg0);
				field1041.method235(arg1);
				field1041.method253(field1271, field1060);
				field1352.field623 = 0;

				if (arg2) {
					field1352.method228(18);
				} else {
					field1352.method228(16);
				}

				field1352.method228(field1041.field623 + 36 + 1 + 1);
				field1352.method228(245);
				field1352.method228(field1298 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1352.method232(field1321[var10]);
				}

				field1352.method236(field1041.field622, field1041.field623, 0);
				field1041.field627 = new class50(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1197 = new class50(var9);
				field1125.method42(0, field1352.field623, field1352.field622);
				var8 = field1125.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var19) {
				}

				method551(arg0, arg1, arg2);
			} else if (var8 == 2 || var8 == 18 || var8 == 19) {
				field1322 = 0;
				if (var8 == 18) {
					field1322 = 1;
				}

				if (var8 == 19) {
					field1322 = 2;
				}

				class6.method45();
				field1336 = 0L;
				field1052 = 0;
				field1188.field856 = 0;
				field14 = true;
				field1345 = true;
				field1190 = true;
				field1041.field623 = 0;
				field1150.field623 = 0;
				field1340 = -1;
				field1232 = -1;
				field1233 = -1;
				field1234 = -1;
				field1339 = 0;
				field1341 = 0;
				field1413 = 0;
				field1343 = 0;
				field1418 = 0;
				field1313 = 0;
				field1050 = 0;
				field1235 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1206[var12] = null;
				}

				field1250 = 0;
				field1152 = 0;
				field1318 = 0;
				field1408 = 0;
				field1284 = (int) (Math.random() * 100.0D) - 50;
				field1410 = (int) (Math.random() * 110.0D) - 55;
				field1200 = (int) (Math.random() * 80.0D) - 40;
				field1038 = (int) (Math.random() * 120.0D) - 60;
				field1267 = (int) (Math.random() * 30.0D) - 20;
				field1056 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1081 = -1;
				field1105 = 0;
				field1106 = 0;
				field1330 = 0;
				field1291 = 0;

				for (int var13 = 0; var13 < field1327; var13++) {
					field1329[var13] = null;
					field1334[var13] = null;
				}

				for (int var14 = 0; var14 < 8192; var14++) {
					field1290[var14] = null;
				}

				field1335 = field1329[field1328] = new class28();
				field1262.method261();
				field1173.method261();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1119[var15][var16][var17] = null;
						}
					}
				}

				field1263 = new class42();
				field1183 = 0;
				field1095 = -1;
				field1172 = -1;
				field1054 = -1;
				field1073 = -1;
				field1266 = -1;
				field1202 = false;
				field1265 = 3;
				field1034 = false;
				field1235 = false;
				field1094 = false;
				field1261 = null;
				field1033 = 0;
				field1031 = -1;
				field1244 = true;
				method496();

				for (int var18 = 0; var18 < 5; var18++) {
					field1215[var18] = 0;
				}

				field1196 = 0;
				field1401 = 0;
				field1029 = 0;
				field1260 = 0;
				field1402 = 0;
				field1193 = 0;
				field1166 = 0;
				field1301 = 0;
				field1157 = 0;
				method448();
			} else if (var8 == 3) {
				field1375 = "";
				field1376 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1375 = "Your account has been disabled.";
				field1376 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1375 = "Your account is already logged in.";
				field1376 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1375 = "RuneScape has been updated!";
				field1376 = "Please reload this page.";
			} else if (var8 == 7) {
				field1375 = "This world is full.";
				field1376 = "Please use a different world.";
			} else if (var8 == 8) {
				field1375 = "Unable to connect.";
				field1376 = "Login server offline.";
			} else if (var8 == 9) {
				field1375 = "Login limit exceeded.";
				field1376 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1375 = "Unable to connect.";
				field1376 = "Bad session id.";
			} else if (var8 == 11) {
				field1376 = "Login server rejected session.";
				field1376 = "Please try again.";
			} else if (var8 == 12) {
				field1375 = "You need a members account to login to this world.";
				field1376 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1375 = "Could not complete login.";
				field1376 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1375 = "The server is being updated.";
				field1376 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1190 = true;
				field1041.field623 = 0;
				field1150.field623 = 0;
				field1340 = -1;
				field1232 = -1;
				field1233 = -1;
				field1234 = -1;
				field1339 = 0;
				field1341 = 0;
				field1413 = 0;
				field1050 = 0;
				field1235 = false;
				field1067 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1375 = "Login attempts exceeded.";
				field1376 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1375 = "You are standing in a members-only area.";
				field1376 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1375 = "Invalid loginserver requested";
				field1376 = "Please try using a different world.";
			} else {
				field1375 = "Unexpected server response";
				field1376 = "Please try using a different world.";
			}
		} catch (IOException var20) {
			field1375 = "";
			field1376 = "Error connecting to server.";
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 245);

			if (arg0.length == 5) {
				field1295 = Integer.parseInt(arg0[0]);
				field1296 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method491();
				} else if (arg0[2].equals("highmem")) {
					method470();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1297 = false;
				} else if (arg0[3].equals("members")) {
					field1297 = true;
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

	@ObfuscatedName("client.a(ILd;I)I")
	public final int method552(class4 arg0, int arg1) {
		if (arg0.field72 == null || arg1 >= arg0.field72.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field72[arg1];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1049[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1306[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1255[var3[var5++]];
				}

				if (var6 == 4) {
					class4 var7 = class4.field57[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field58.length; var9++) {
						if (var7.field58[var9] == var8) {
							var4 += var7.field59[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field1283[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1088[field1306[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1283[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1335.field429;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1306[var10];
					}
				}

				if (var6 == 10) {
					class4 var11 = class4.field57[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field58.length; var13++) {
						if (var11.field58[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field1351;
				}

				if (var6 == 12) {
					var4 += field1074;
				}

				if (var6 == 13) {
					int var14 = field1283[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.W(I)V")
	public final void method553() {
		for (class33 var1 = (class33) field1173.method257(); var1 != null; var1 = (class33) field1173.method259()) {
			if (field1390 != var1.field556 || var1.field562) {
				var1.method119();
			} else if (field1259 >= var1.field555) {
				var1.method163(field1120);

				if (var1.field562) {
					var1.method119();
				} else {
					field1085.method74(60, var1.field558, 0, var1.field557, -1, var1.field556, false, var1.field559, var1);
				}
			}
		}
	}

	@ObfuscatedName("client.X(I)V")
	public final void method554() {
		try {
			if (field1125 != null) {
				field1125.method38();
			}
		} catch (Exception var2) {
		}

		field1125 = null;
		field1190 = false;
		field1319 = 0;
		field1035 = "";
		field1036 = "";
		class6.method45();
		method469();
		field1085.method63();

		for (int var1 = 0; var1 < 4; var1++) {
			field1379[var1].method359();
		}

		System.gc();
		method515();
		field1042 = -1;
		field1162 = -1;
		field1103 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;I)Lyb;")
	public final class51 method555(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1132[0] != null) {
				var6 = field1132[0].method300(arg1);
			}
		} catch (Exception var28) {
		}

		if (var6 != null) {
			field1189.reset();
			field1189.update(var6);
			int var8 = (int) field1189.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class51(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13("Requesting " + arg0, arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method483(arg3 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class39 var16 = new class39(var15);
				var16.field623 = 3;
				int var17 = var16.method242() + 6;
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
						method13("Loading " + arg0 + " - " + var22 + "%", arg4);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1132[0] != null) {
						field1132[0].method301(var6, arg1, var6.length);
					}
				} catch (Exception var27) {
					field1132[0] = null;
				}

				if (var6 != null) {
					field1189.reset();
					field1189.update(var6);
					int var23 = (int) field1189.getValue();
					if (arg2 != var23) {
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
						method13("Game updated - please reload page", arg4);
						var24 = 10;
					} else {
						method13(var11 + " - Retrying in " + var24, arg4);
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

	@ObfuscatedName("client.Y(I)Ljava/net/Socket;")
	public final Socket method556(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.Z(I)V")
	public final void method557() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1054 != -1 && field1404 == field1054) {
				if (var1 == 8 && field1380.length() > 0) {
					field1380 = field1380.substring(0, field1380.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1380.length() < 12) {
					field1380 = field1380 + (char) var1;
				}
			} else if (field1094) {
				if (var1 >= 32 && var1 <= 122 && field1245.length() < 80) {
					field1245 = field1245 + (char) var1;
					field1302 = true;
				}

				if (var1 == 8 && field1245.length() > 0) {
					field1245 = field1245.substring(0, field1245.length() - 1);
					field1302 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1094 = false;
					field1302 = true;

					if (field1423 == 1) {
						long var2 = class52.method309(field1245);
						method530(var2);
					}

					if (field1423 == 2 && field1183 > 0) {
						long var4 = class52.method309(field1245);
						method471(var4);
					}

					if (field1423 == 3 && field1245.length() > 0) {
						field1041.method227(99);
						field1041.method228(0);
						int var6 = field1041.field623;
						field1041.method234(field1282);
						class53.method317(field1041, field1245);
						field1041.method237(field1041.field623 - var6);
						field1245 = class52.method314(field1245);
						field1245 = class69.method399(field1245);
						method435(class52.method313(class52.method310(field1282)), 6, field1245);

						if (field1382 == 2) {
							field1382 = 1;
							field1288 = true;
							field1041.method227(8);
							field1041.method228(field1243);
							field1041.method228(field1382);
							field1041.method228(field1299);
						}
					}

					if (field1423 == 4 && field1185 < 100) {
						long var7 = class52.method309(field1245);
						method467(var7);
					}

					if (field1423 == 5 && field1185 > 0) {
						long var9 = class52.method309(field1245);
						method549(var9);
					}
				}
			} else if (field1034) {
				if (var1 >= 48 && var1 <= 57 && field1208.length() < 10) {
					field1208 = field1208 + (char) var1;
					field1302 = true;
				}

				if (var1 == 8 && field1208.length() > 0) {
					field1208 = field1208.substring(0, field1208.length() - 1);
					field1302 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1208.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1208);
						} catch (Exception var16) {
						}

						field1041.method227(241);
						field1041.method232(var11);
					}

					field1034 = false;
					field1302 = true;
				}
			} else if (field1172 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1134.length() < 80) {
					field1134 = field1134 + (char) var1;
					field1302 = true;
				}

				if (var1 == 8 && field1134.length() > 0) {
					field1134 = field1134.substring(0, field1134.length() - 1);
					field1302 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1134.length() > 0) {
					if (field1322 == 2) {
						if (field1134.equals("::clientdrop")) {
							method507();
						}

						if (field1134.equals("::lag")) {
							method428();
						}

						if (field1134.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field1381.method281(2); var12++) {
								field1381.method291(var12, 2, (byte) 1);
							}
						}
					}

					if (field1134.startsWith("::")) {
						field1041.method227(11);
						field1041.method228(field1134.length() - 1);
						field1041.method235(field1134.substring(2));
					} else {
						byte var13 = 0;
						if (field1134.startsWith("yellow:")) {
							var13 = 0;
							field1134 = field1134.substring(7);
						}

						if (field1134.startsWith("red:")) {
							var13 = 1;
							field1134 = field1134.substring(4);
						}

						if (field1134.startsWith("green:")) {
							var13 = 2;
							field1134 = field1134.substring(6);
						}

						if (field1134.startsWith("cyan:")) {
							var13 = 3;
							field1134 = field1134.substring(5);
						}

						if (field1134.startsWith("purple:")) {
							var13 = 4;
							field1134 = field1134.substring(7);
						}

						if (field1134.startsWith("white:")) {
							var13 = 5;
							field1134 = field1134.substring(6);
						}

						if (field1134.startsWith("flash1:")) {
							var13 = 6;
							field1134 = field1134.substring(7);
						}

						if (field1134.startsWith("flash2:")) {
							var13 = 7;
							field1134 = field1134.substring(7);
						}

						if (field1134.startsWith("flash3:")) {
							var13 = 8;
							field1134 = field1134.substring(7);
						}

						if (field1134.startsWith("glow1:")) {
							var13 = 9;
							field1134 = field1134.substring(6);
						}

						if (field1134.startsWith("glow2:")) {
							var13 = 10;
							field1134 = field1134.substring(6);
						}

						if (field1134.startsWith("glow3:")) {
							var13 = 11;
							field1134 = field1134.substring(6);
						}

						byte var14 = 0;
						if (field1134.startsWith("wave:")) {
							var14 = 1;
							field1134 = field1134.substring(5);
						}

						if (field1134.startsWith("scroll:")) {
							var14 = 2;
							field1134 = field1134.substring(7);
						}

						field1041.method227(78);
						field1041.method228(0);
						int var15 = field1041.field623;
						field1041.method228(var13);
						field1041.method228(var14);
						class53.method317(field1041, field1134);
						field1041.method237(field1041.field623 - var15);
						field1134 = class52.method314(field1134);
						field1134 = class69.method399(field1134);
						field1335.field380 = field1134;
						field1335.field382 = var13;
						field1335.field383 = var14;
						field1335.field381 = 150;

						if (field1322 == 2) {
							method435("@cr2@" + field1335.field423, 2, field1335.field380);
						} else if (field1322 == 1) {
							method435("@cr1@" + field1335.field423, 2, field1335.field380);
						} else {
							method435(field1335.field423, 2, field1335.field380);
						}

						if (field1243 == 2) {
							field1243 = 3;
							field1288 = true;
							field1041.method227(8);
							field1041.method228(field1243);
							field1041.method228(field1382);
							field1041.method228(field1299);
						}
					}

					field1134 = "";
					field1302 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.ab(I)V")
	public final void method558() {
		field1239.method267();
		class35.field584 = field1062;
		field1303.method211(0, 0);

		if (field1073 != -1) {
			method473(class4.field57[field1073], 0, 0, 0);
		} else if (field1428[field1265] != -1) {
			method473(class4.field57[field1428[field1265]], 0, 0, 0);
		}

		if (field1235 && field1307 == 1) {
			method438();
		}

		field1239.method268(553, field9, 205);
		field1241.method267();
		class35.field584 = field1063;
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1088[var1] = var0 / 4;
		}
	}
}
