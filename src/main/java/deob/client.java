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
	public int field1054 = -1;

	@ObfuscatedName("client.bb")
	public class44 field1055;

	@ObfuscatedName("client.cb")
	public class44 field1056;

	@ObfuscatedName("client.db")
	public class44 field1057;

	@ObfuscatedName("client.eb")
	public class44 field1058;

	@ObfuscatedName("client.fb")
	public class44 field1059;

	@ObfuscatedName("client.gb")
	public class44 field1060;

	@ObfuscatedName("client.hb")
	public class44 field1061;

	@ObfuscatedName("client.ib")
	public class44 field1062;

	@ObfuscatedName("client.jb")
	public class44 field1063;

	@ObfuscatedName("client.kb")
	public int[] field1064 = new int[4000];

	@ObfuscatedName("client.lb")
	public int[] field1065 = new int[4000];

	@ObfuscatedName("client.mb")
	public String[] field1066 = new String[500];

	@ObfuscatedName("client.nb")
	public class62[] field1067 = new class62[4];

	@ObfuscatedName("client.ob")
	public int field1068;

	@ObfuscatedName("client.pb")
	public int[] field1069 = new int[7];

	@ObfuscatedName("client.qb")
	public int field1070;

	@ObfuscatedName("client.sb")
	public static int field1071;

	@ObfuscatedName("client.tb")
	public int field1072;

	@ObfuscatedName("client.ub")
	public int field1073 = 2;

	@ObfuscatedName("client.vb")
	public int[] field1074 = new int[5];

	@ObfuscatedName("client.wb")
	public boolean field1075 = false;

	@ObfuscatedName("client.xb")
	public int field1076;

	@ObfuscatedName("client.zb")
	public int field1077;

	@ObfuscatedName("client.ac")
	public int field1099;

	@ObfuscatedName("client.bc")
	public int field1100;

	@ObfuscatedName("client.cc")
	public int field1101;

	@ObfuscatedName("client.dc")
	public int field1102;

	@ObfuscatedName("client.ec")
	public int field1103;

	@ObfuscatedName("client.fc")
	public int[] field1104 = new int[50];

	@ObfuscatedName("client.gc")
	public int field1105;

	@ObfuscatedName("client.hc")
	public int field1106;

	@ObfuscatedName("client.ic")
	public int field1107;

	@ObfuscatedName("client.jc")
	public int field1108;

	@ObfuscatedName("client.kc")
	public int field1109;

	@ObfuscatedName("client.lc")
	public int field1110;

	@ObfuscatedName("client.mc")
	public int field1111 = -1;

	@ObfuscatedName("client.nc")
	public final int field1112 = 100;

	@ObfuscatedName("client.oc")
	public int[] field1113 = new int[100];

	@ObfuscatedName("client.pc")
	public int field1114;

	@ObfuscatedName("client.qc")
	public int field1115;

	@ObfuscatedName("client.sc")
	public class37 field1116;

	@ObfuscatedName("client.N")
	public int field1041 = -1;

	@ObfuscatedName("client.P")
	public boolean field1043 = false;

	@ObfuscatedName("client.Q")
	public int field1044 = -1;

	@ObfuscatedName("client.Ib")
	public int field1085 = 3;

	@ObfuscatedName("client.Nb")
	public boolean field1088 = false;

	@ObfuscatedName("client.Rb")
	public boolean field1091 = false;

	@ObfuscatedName("client.Vb")
	public int[] field1095 = new int[33];

	@ObfuscatedName("client.Xb")
	public int[] field1096 = new int[100];

	@ObfuscatedName("client.Yb")
	public String[] field1097 = new String[100];

	@ObfuscatedName("client.Zb")
	public String[] field1098 = new String[100];

	@ObfuscatedName("client.yc")
	public String field1122 = "";

	@ObfuscatedName("client.Ac")
	public final int[] field1123 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Gc")
	public boolean field1129 = false;

	@ObfuscatedName("client.Hc")
	public int[] field1130 = new int[151];

	@ObfuscatedName("client.Ic")
	public int[][] field1131 = new int[104][104];

	@ObfuscatedName("client.Jc")
	public int[] field1132 = new int[5];

	@ObfuscatedName("client.Kc")
	public int[] field1133 = new int[256];

	@ObfuscatedName("client.Sc")
	public String[] field1140 = new String[200];

	@ObfuscatedName("client.ad")
	public class42 field1148 = new class42();

	@ObfuscatedName("client.ed")
	public long[] field1150 = new long[100];

	@ObfuscatedName("client.kd")
	public boolean field1155 = true;

	@ObfuscatedName("client.ld")
	public String field1156 = "";

	@ObfuscatedName("client.md")
	public class4 field1157 = new class4();

	@ObfuscatedName("client.nd")
	public boolean field1158 = false;

	@ObfuscatedName("client.pd")
	public boolean field1160 = false;

	@ObfuscatedName("client.wd")
	public boolean field1166 = false;

	@ObfuscatedName("client.yd")
	public long[] field1168 = new long[200];

	@ObfuscatedName("client.Cd")
	public int[] field1171 = new int[500];

	@ObfuscatedName("client.Dd")
	public int[] field1172 = new int[500];

	@ObfuscatedName("client.Ed")
	public int[] field1173 = new int[500];

	@ObfuscatedName("client.Fd")
	public int[] field1174 = new int[500];

	@ObfuscatedName("client.Hd")
	public String field1176 = "";

	@ObfuscatedName("client.Id")
	public String field1177 = "";

	@ObfuscatedName("client.Kd")
	public int[] field1179 = new int[9];

	@ObfuscatedName("client.Ld")
	public class39 field1180 = class39.method226(1);

	@ObfuscatedName("client.Nd")
	public int[] field1182 = new int[1000];

	@ObfuscatedName("client.Od")
	public class42[][][] field1183 = new class42[4][104][104];

	@ObfuscatedName("client.Qd")
	public int[] field1185 = new int[33];

	@ObfuscatedName("client.Rd")
	public String field1186 = "";

	@ObfuscatedName("client.Xd")
	public boolean field1191 = false;

	@ObfuscatedName("client.Yd")
	public CRC32 field1192 = new CRC32();

	@ObfuscatedName("client.Zd")
	public boolean field1193 = false;

	@ObfuscatedName("client.be")
	public int field1194 = 0x766654;

	@ObfuscatedName("client.ce")
	public class49[] field1195 = new class49[5];

	@ObfuscatedName("client.ke")
	public boolean field1201 = false;

	@ObfuscatedName("client.le")
	public String field1202 = "";

	@ObfuscatedName("client.ue")
	public int field1209 = 50;

	@ObfuscatedName("client.ve")
	public int[] field1210 = new int[field1209];

	@ObfuscatedName("client.we")
	public int[] field1211 = new int[field1209];

	@ObfuscatedName("client.xe")
	public int[] field1212 = new int[field1209];

	@ObfuscatedName("client.ye")
	public int[] field1213 = new int[field1209];

	@ObfuscatedName("client.ze")
	public int[] field1214 = new int[field1209];

	@ObfuscatedName("client.Ae")
	public int[] field1215 = new int[field1209];

	@ObfuscatedName("client.Be")
	public int[] field1216 = new int[field1209];

	@ObfuscatedName("client.Ce")
	public String[] field1217 = new String[field1209];

	@ObfuscatedName("client.De")
	public int field1218 = 0x332D25;

	@ObfuscatedName("client.Ee")
	public int[] field1219 = new int[5];

	@ObfuscatedName("client.Fe")
	public int field1220 = -1;

	@ObfuscatedName("client.Ge")
	public boolean field1221 = false;

	@ObfuscatedName("client.Je")
	public boolean field1223 = true;

	@ObfuscatedName("client.Qe")
	public boolean field1230 = false;

	@ObfuscatedName("client.Re")
	public int field1231 = -1;

	@ObfuscatedName("client.Se")
	public int field1232 = -1;

	@ObfuscatedName("client.Ze")
	public int field1237 = -1;

	@ObfuscatedName("client.bf")
	public class37[] field1239 = new class37[2];

	@ObfuscatedName("client.ff")
	public int field1243 = 1;

	@ObfuscatedName("client.jf")
	public String field1244 = "";

	@ObfuscatedName("client.lf")
	public boolean field1246 = false;

	@ObfuscatedName("client.mf")
	public class36[] field1247 = new class36[8];

	@ObfuscatedName("client.qf")
	public int[] field1250 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.rf")
	public class37[] field1251 = new class37[13];

	@ObfuscatedName("client.vf")
	public byte[] field1255 = new byte[16384];

	@ObfuscatedName("client.Af")
	public class36[] field1259 = new class36[50];

	@ObfuscatedName("client.Ef")
	public int[] field1262 = new int[1000];

	@ObfuscatedName("client.Ff")
	public int[] field1263 = new int[1000];

	@ObfuscatedName("client.Hf")
	public int field1265 = -1;

	@ObfuscatedName("client.Mf")
	public boolean field1269 = false;

	@ObfuscatedName("client.Nf")
	public int field1270 = -1;

	@ObfuscatedName("client.Of")
	public int field1271 = -1;

	@ObfuscatedName("client.Sf")
	public boolean field1274 = false;

	@ObfuscatedName("client.Vf")
	public int field1277 = 78;

	@ObfuscatedName("client.Xf")
	public class37[] field1279 = new class37[50];

	@ObfuscatedName("client.Zf")
	public int[] field1281 = new int[class67.field994];

	@ObfuscatedName("client.ag")
	public int[] field1282 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.bg")
	public int[] field1283 = new int[50];

	@ObfuscatedName("client.cg")
	public boolean field1284 = false;

	@ObfuscatedName("client.eg")
	public boolean field1286 = false;

	@ObfuscatedName("client.fg")
	public int[] field1287 = new int[2000];

	@ObfuscatedName("client.gg")
	public boolean field1288 = true;

	@ObfuscatedName("client.hg")
	public boolean field1289 = false;

	@ObfuscatedName("client.vg")
	public int field1303 = 0x23201B;

	@ObfuscatedName("client.zg")
	public class36[] field1307 = new class36[20];

	@ObfuscatedName("client.Bg")
	public int field1309 = 1;

	@ObfuscatedName("client.Kg")
	public int[] field1315 = new int[class67.field994];

	@ObfuscatedName("client.Tg")
	public boolean[] field1324 = new boolean[5];

	@ObfuscatedName("client.Wg")
	public int[] field1327 = new int[50];

	@ObfuscatedName("client.Yg")
	public int[][] field1328 = new int[104][104];

	@ObfuscatedName("client.Zg")
	public boolean field1329 = true;

	@ObfuscatedName("client.dh")
	public class42 field1333 = new class42();

	@ObfuscatedName("client.eh")
	public int[] field1334 = new int[151];

	@ObfuscatedName("client.ih")
	public boolean field1337 = false;

	@ObfuscatedName("client.mh")
	public boolean field1340 = false;

	@ObfuscatedName("client.sh")
	public boolean field1345 = false;

	@ObfuscatedName("client.Ch")
	public class27[] field1354 = new class27[8192];

	@ObfuscatedName("client.Eh")
	public int[] field1356 = new int[8192];

	@ObfuscatedName("client.Gh")
	public class36[] field1358 = new class36[1000];

	@ObfuscatedName("client.Hh")
	public int[] field1359 = new int[class67.field994];

	@ObfuscatedName("client.Jh")
	public int field1361 = 0x4D4233;

	@ObfuscatedName("client.Lh")
	public boolean field1363 = false;

	@ObfuscatedName("client.Vh")
	public int[] field1372 = new int[5];

	@ObfuscatedName("client.Xh")
	public int[] field1374 = new int[200];

	@ObfuscatedName("client.Yh")
	public int field1375 = 128;

	@ObfuscatedName("client.ci")
	public class39 field1379 = class39.method226(1);

	@ObfuscatedName("client.fi")
	public class39 field1382 = class39.method226(1);

	@ObfuscatedName("client.gi")
	public int[][] field1383 = new int[104][104];

	@ObfuscatedName("client.mi")
	public int field1389 = -1;

	@ObfuscatedName("client.oi")
	public int field1391 = 2;

	@ObfuscatedName("client.pi")
	public int field1392 = -1;

	@ObfuscatedName("client.ui")
	public int field1397 = -1;

	@ObfuscatedName("client.wi")
	public class36[] field1399 = new class36[20];

	@ObfuscatedName("client.xi")
	public int[] field1400 = new int[5];

	@ObfuscatedName("client.yi")
	public int field1401 = 2048;

	@ObfuscatedName("client.zi")
	public int field1402 = 2047;

	@ObfuscatedName("client.Ai")
	public class28[] field1403 = new class28[field1401];

	@ObfuscatedName("client.Ci")
	public int[] field1405 = new int[field1401];

	@ObfuscatedName("client.Ei")
	public int[] field1407 = new int[field1401];

	@ObfuscatedName("client.Fi")
	public class39[] field1408 = new class39[field1401];

	@ObfuscatedName("client.Hi")
	public class42 field1409 = new class42();

	@ObfuscatedName("client.Vi")
	public boolean field1423 = false;

	@ObfuscatedName("client.Zi")
	public int[] field1427 = new int[2000];

	@ObfuscatedName("client.jj")
	public int field1436 = 2;

	@ObfuscatedName("client.sj")
	public String field1444 = "";

	@ObfuscatedName("client.tj")
	public String field1445 = "";

	@ObfuscatedName("client.Eb")
	public static int field1081 = 10;

	@ObfuscatedName("client.Gb")
	public static boolean field1083 = true;

	@ObfuscatedName("client.Qc")
	public static int[] field1138 = new int[32];

	@ObfuscatedName("client.Ue")
	public static BigInteger field1233 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.af")
	public static String field1238 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.yf")
	public static final int[][] field1257 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Pf")
	public static BigInteger field1272 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.yh")
	public static int[] field1351 = new int[99];

	@ObfuscatedName("client.Qh")
	public static final int[] field1368 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.K")
	public int field1039;

	@ObfuscatedName("client.M")
	public int field1040;

	@ObfuscatedName("client.O")
	public int field1042;

	@ObfuscatedName("client.Ab")
	public int field1078;

	@ObfuscatedName("client.Bb")
	public int field1079;

	@ObfuscatedName("client.Cb")
	public int field1080;

	@ObfuscatedName("client.Fb")
	public static int field1082;

	@ObfuscatedName("client.Mb")
	public int field1087;

	@ObfuscatedName("client.Ob")
	public static int field1089;

	@ObfuscatedName("client.Sb")
	public static int field1092;

	@ObfuscatedName("client.Bc")
	public int field1124;

	@ObfuscatedName("client.Cc")
	public int field1125;

	@ObfuscatedName("client.Dc")
	public int field1126;

	@ObfuscatedName("client.Ec")
	public int field1127;

	@ObfuscatedName("client.Mc")
	public int field1134;

	@ObfuscatedName("client.Vc")
	public int field1143;

	@ObfuscatedName("client.Wc")
	public int field1144;

	@ObfuscatedName("client.Xc")
	public int field1145;

	@ObfuscatedName("client.Yc")
	public int field1146;

	@ObfuscatedName("client.Zc")
	public int field1147;

	@ObfuscatedName("client.bd")
	public static int field1149;

	@ObfuscatedName("client.fd")
	public int field1151;

	@ObfuscatedName("client.gd")
	public int field1152;

	@ObfuscatedName("client.od")
	public int field1159;

	@ObfuscatedName("client.vd")
	public static int field1165;

	@ObfuscatedName("client.xd")
	public int field1167;

	@ObfuscatedName("client.zd")
	public int field1169;

	@ObfuscatedName("client.Bd")
	public int field1170;

	@ObfuscatedName("client.Gd")
	public static int field1175;

	@ObfuscatedName("client.Md")
	public int field1181;

	@ObfuscatedName("client.Sd")
	public int field1187;

	@ObfuscatedName("client.de")
	public static int field1196;

	@ObfuscatedName("client.me")
	public int field1203;

	@ObfuscatedName("client.ne")
	public int field1204;

	@ObfuscatedName("client.oe")
	public int field1205;

	@ObfuscatedName("client.pe")
	public int field1206;

	@ObfuscatedName("client.re")
	public int field1207;

	@ObfuscatedName("client.te")
	public int field1208;

	@ObfuscatedName("client.He")
	public int field1222;

	@ObfuscatedName("client.Ke")
	public int field1224;

	@ObfuscatedName("client.Le")
	public int field1225;

	@ObfuscatedName("client.Me")
	public int field1226;

	@ObfuscatedName("client.Ne")
	public int field1227;

	@ObfuscatedName("client.Oe")
	public int field1228;

	@ObfuscatedName("client.Pe")
	public int field1229;

	@ObfuscatedName("client.df")
	public int field1241;

	@ObfuscatedName("client.ef")
	public int field1242;

	@ObfuscatedName("client.of")
	public static int field1248;

	@ObfuscatedName("client.wf")
	public int field1256;

	@ObfuscatedName("client.zf")
	public int field1258;

	@ObfuscatedName("client.Df")
	public int field1261;

	@ObfuscatedName("client.Gf")
	public static int field1264;

	@ObfuscatedName("client.If")
	public int field1266;

	@ObfuscatedName("client.Jf")
	public int field1267;

	@ObfuscatedName("client.Lf")
	public static int field1268;

	@ObfuscatedName("client.Tf")
	public int field1275;

	@ObfuscatedName("client.Uf")
	public int field1276;

	@ObfuscatedName("client.Wf")
	public int field1278;

	@ObfuscatedName("client.Yf")
	public int field1280;

	@ObfuscatedName("client.ig")
	public int field1290;

	@ObfuscatedName("client.wg")
	public int field1304;

	@ObfuscatedName("client.xg")
	public int field1305;

	@ObfuscatedName("client.yg")
	public static int field1306;

	@ObfuscatedName("client.Ag")
	public int field1308;

	@ObfuscatedName("client.Dg")
	public static int field1310;

	@ObfuscatedName("client.Eg")
	public int field1311;

	@ObfuscatedName("client.Hg")
	public int field1312;

	@ObfuscatedName("client.Ig")
	public int field1313;

	@ObfuscatedName("client.Jg")
	public int field1314;

	@ObfuscatedName("client.Og")
	public int field1319;

	@ObfuscatedName("client.Pg")
	public int field1320;

	@ObfuscatedName("client.Qg")
	public int field1321;

	@ObfuscatedName("client.Rg")
	public int field1322;

	@ObfuscatedName("client.Sg")
	public int field1323;

	@ObfuscatedName("client.Ug")
	public static int field1325;

	@ObfuscatedName("client.fh")
	public int field1335;

	@ObfuscatedName("client.gh")
	public int field1336;

	@ObfuscatedName("client.jh")
	public int field1338;

	@ObfuscatedName("client.kh")
	public int field1339;

	@ObfuscatedName("client.nh")
	public int field1341;

	@ObfuscatedName("client.oh")
	public int field1342;

	@ObfuscatedName("client.ph")
	public int field1343;

	@ObfuscatedName("client.rh")
	public static int field1344;

	@ObfuscatedName("client.th")
	public int field1346;

	@ObfuscatedName("client.uh")
	public int field1347;

	@ObfuscatedName("client.vh")
	public int field1348;

	@ObfuscatedName("client.wh")
	public int field1349;

	@ObfuscatedName("client.xh")
	public int field1350;

	@ObfuscatedName("client.zh")
	public static int field1352;

	@ObfuscatedName("client.Bh")
	public int field1353;

	@ObfuscatedName("client.Dh")
	public int field1355;

	@ObfuscatedName("client.Fh")
	public int field1357;

	@ObfuscatedName("client.Ih")
	public int field1360;

	@ObfuscatedName("client.Kh")
	public int field1362;

	@ObfuscatedName("client.Mh")
	public int field1364;

	@ObfuscatedName("client.Nh")
	public int field1365;

	@ObfuscatedName("client.Oh")
	public int field1366;

	@ObfuscatedName("client.Rh")
	public int field1369;

	@ObfuscatedName("client.Sh")
	public int field1370;

	@ObfuscatedName("client.Th")
	public int field1371;

	@ObfuscatedName("client.Wh")
	public int field1373;

	@ObfuscatedName("client.Zh")
	public int field1376;

	@ObfuscatedName("client.ai")
	public int field1377;

	@ObfuscatedName("client.bi")
	public int field1378;

	@ObfuscatedName("client.ei")
	public int field1381;

	@ObfuscatedName("client.hi")
	public int field1384;

	@ObfuscatedName("client.ii")
	public int field1385;

	@ObfuscatedName("client.ji")
	public int field1386;

	@ObfuscatedName("client.ki")
	public int field1387;

	@ObfuscatedName("client.li")
	public int field1388;

	@ObfuscatedName("client.ni")
	public int field1390;

	@ObfuscatedName("client.vi")
	public int field1398;

	@ObfuscatedName("client.Bi")
	public int field1404;

	@ObfuscatedName("client.Di")
	public int field1406;

	@ObfuscatedName("client.Ii")
	public int field1410;

	@ObfuscatedName("client.Ji")
	public int field1411;

	@ObfuscatedName("client.Ki")
	public int field1412;

	@ObfuscatedName("client.Li")
	public int field1413;

	@ObfuscatedName("client.Mi")
	public int field1414;

	@ObfuscatedName("client.Ni")
	public int field1415;

	@ObfuscatedName("client.Oi")
	public int field1416;

	@ObfuscatedName("client.Pi")
	public int field1417;

	@ObfuscatedName("client.Qi")
	public int field1418;

	@ObfuscatedName("client.Ri")
	public int field1419;

	@ObfuscatedName("client.Si")
	public int field1420;

	@ObfuscatedName("client.Ti")
	public int field1421;

	@ObfuscatedName("client.Ui")
	public int field1422;

	@ObfuscatedName("client.Wi")
	public int field1424;

	@ObfuscatedName("client.Xi")
	public int field1425;

	@ObfuscatedName("client.aj")
	public int field1428;

	@ObfuscatedName("client.ij")
	public int field1435;

	@ObfuscatedName("client.lj")
	public static int field1437;

	@ObfuscatedName("client.mj")
	public int field1438;

	@ObfuscatedName("client.nj")
	public int field1439;

	@ObfuscatedName("client.oj")
	public int field1440;

	@ObfuscatedName("client.pj")
	public int field1441;

	@ObfuscatedName("client.uj")
	public static int field1446;

	@ObfuscatedName("client.wj")
	public int field1448;

	@ObfuscatedName("client.sd")
	public long field1163;

	@ObfuscatedName("client.cf")
	public long field1240;

	@ObfuscatedName("client.Qf")
	public long field1273;

	@ObfuscatedName("client.Vg")
	public long field1326;

	@ObfuscatedName("client.Yi")
	public long field1426;

	@ObfuscatedName("client.pf")
	public class19 field1249;

	@ObfuscatedName("client.Pb")
	public static class28 field1090;

	@ObfuscatedName("client.Jb")
	public class36 field1086;

	@ObfuscatedName("client.Tb")
	public class36 field1093;

	@ObfuscatedName("client.Ub")
	public class36 field1094;

	@ObfuscatedName("client.hd")
	public class36 field1153;

	@ObfuscatedName("client.qd")
	public class36 field1161;

	@ObfuscatedName("client.rd")
	public class36 field1162;

	@ObfuscatedName("client.Xe")
	public class36 field1235;

	@ObfuscatedName("client.Ye")
	public class36 field1236;

	@ObfuscatedName("client.dg")
	public class36 field1285;

	@ObfuscatedName("client.qi")
	public class36 field1393;

	@ObfuscatedName("client.ri")
	public class36 field1394;

	@ObfuscatedName("client.si")
	public class36 field1395;

	@ObfuscatedName("client.ti")
	public class36 field1396;

	@ObfuscatedName("client.tc")
	public class37 field1117;

	@ObfuscatedName("client.uc")
	public class37 field1118;

	@ObfuscatedName("client.vc")
	public class37 field1119;

	@ObfuscatedName("client.wc")
	public class37 field1120;

	@ObfuscatedName("client.Nc")
	public class37 field1135;

	@ObfuscatedName("client.Oc")
	public class37 field1136;

	@ObfuscatedName("client.Pc")
	public class37 field1137;

	@ObfuscatedName("client.Tc")
	public class37 field1141;

	@ObfuscatedName("client.Uc")
	public class37 field1142;

	@ObfuscatedName("client.sf")
	public class37 field1252;

	@ObfuscatedName("client.tf")
	public class37 field1253;

	@ObfuscatedName("client.uf")
	public class37 field1254;

	@ObfuscatedName("client.jg")
	public class37 field1291;

	@ObfuscatedName("client.kg")
	public class37 field1292;

	@ObfuscatedName("client.lg")
	public class37 field1293;

	@ObfuscatedName("client.mg")
	public class37 field1294;

	@ObfuscatedName("client.ng")
	public class37 field1295;

	@ObfuscatedName("client.gj")
	public class37 field1433;

	@ObfuscatedName("client.hj")
	public class37 field1434;

	@ObfuscatedName("client.ge")
	public class38 field1197;

	@ObfuscatedName("client.he")
	public class38 field1198;

	@ObfuscatedName("client.ie")
	public class38 field1199;

	@ObfuscatedName("client.je")
	public class38 field1200;

	@ObfuscatedName("client.R")
	public class44 field1045;

	@ObfuscatedName("client.S")
	public class44 field1046;

	@ObfuscatedName("client.T")
	public class44 field1047;

	@ObfuscatedName("client.U")
	public class44 field1048;

	@ObfuscatedName("client.V")
	public class44 field1049;

	@ObfuscatedName("client.W")
	public class44 field1050;

	@ObfuscatedName("client.X")
	public class44 field1051;

	@ObfuscatedName("client.Y")
	public class44 field1052;

	@ObfuscatedName("client.Z")
	public class44 field1053;

	@ObfuscatedName("client.sg")
	public class44 field1300;

	@ObfuscatedName("client.tg")
	public class44 field1301;

	@ObfuscatedName("client.ug")
	public class44 field1302;

	@ObfuscatedName("client.bj")
	public class44 field1429;

	@ObfuscatedName("client.cj")
	public class44 field1430;

	@ObfuscatedName("client.dj")
	public class44 field1431;

	@ObfuscatedName("client.ej")
	public class44 field1432;

	@ObfuscatedName("client.xc")
	public class48 field1121;

	@ObfuscatedName("client.kf")
	public class50 field1245;

	@ObfuscatedName("client.di")
	public class51 field1380;

	@ObfuscatedName("client.ud")
	public class58 field1164;

	@ObfuscatedName("client.Ng")
	public class5 field1318;

	@ObfuscatedName("client.J")
	public String field1038;

	@ObfuscatedName("client.Fc")
	public String field1128;

	@ObfuscatedName("client.Cf")
	public String field1260;

	@ObfuscatedName("client.Ph")
	public String field1367;

	@ObfuscatedName("client.Hb")
	public static boolean field1084;

	@ObfuscatedName("client.Ve")
	public static boolean field1234;

	@ObfuscatedName("client.Td")
	public int[] field1188;

	@ObfuscatedName("client.Ud")
	public int[] field1189;

	@ObfuscatedName("client.Vd")
	public int[] field1190;

	@ObfuscatedName("client.og")
	public int[] field1296;

	@ObfuscatedName("client.pg")
	public int[] field1297;

	@ObfuscatedName("client.qg")
	public int[] field1298;

	@ObfuscatedName("client.rg")
	public int[] field1299;

	@ObfuscatedName("client.Lg")
	public int[] field1316;

	@ObfuscatedName("client.Mg")
	public int[] field1317;

	@ObfuscatedName("client.ah")
	public int[] field1330;

	@ObfuscatedName("client.bh")
	public int[] field1331;

	@ObfuscatedName("client.ch")
	public int[] field1332;

	@ObfuscatedName("client.qj")
	public int[] field1442;

	@ObfuscatedName("client.rj")
	public int[] field1443;

	@ObfuscatedName("client.vj")
	public class37[] field1447;

	@ObfuscatedName("client.Rc")
	public byte[][] field1139;

	@ObfuscatedName("client.id")
	public byte[][] field1154;

	@ObfuscatedName("client.Pd")
	public byte[][][] field1184;

	@ObfuscatedName("client.Jd")
	public int[][][] field1178;

	@ObfuscatedName("client.d(B)V")
	public void method431() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1381);

		if (field1121 != null) {
			System.out.println("Od-cycle:" + field1121.field749);
		}

		System.out.println("loop-cycle:" + field1446);
		System.out.println("draw-cycle:" + field1437);
		System.out.println("ptype:" + field1411);
		System.out.println("psize:" + field1410);

		if (field1318 != null) {
			field1318.method43();
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

	@ObfuscatedName("client.e(I)V")
	public static final void method432() {
		class19.field267 = true;
		class35.field574 = true;
		field1084 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.a(ZILmb;)V")
	public final void method433(int arg0, class39 arg1) {
		int var3 = arg1.method250(8);
		if (var3 < field1404) {
			for (int var4 = var3; var4 < field1404; var4++) {
				field1182[field1181++] = field1405[var4];
			}
		}

		if (var3 > field1404) {
			signlink.reporterror(field1444 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1404 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1405[var5];
			class28 var7 = field1403[var6];
			int var8 = arg1.method250(1);
			if (var8 == 0) {
				field1405[field1404++] = var6;
				var7.field414 = field1446;
			} else {
				int var9 = arg1.method250(2);
				if (var9 == 0) {
					field1405[field1404++] = var6;
					var7.field414 = field1446;
					field1407[field1406++] = var6;
				} else if (var9 == 1) {
					field1405[field1404++] = var6;
					var7.field414 = field1446;
					int var10 = arg1.method250(3);
					var7.method125(var10, false);
					int var11 = arg1.method250(1);
					if (var11 == 1) {
						field1407[field1406++] = var6;
					}
				} else if (var9 == 2) {
					field1405[field1404++] = var6;
					var7.field414 = field1446;
					int var12 = arg1.method250(3);
					var7.method125(var12, true);
					int var13 = arg1.method250(3);
					var7.method125(var13, true);
					int var14 = arg1.method250(1);
					if (var14 == 1) {
						field1407[field1406++] = var6;
					}
				} else if (var9 == 3) {
					field1182[field1181++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method434() {
		for (int var1 = -1; var1 < field1404; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1402;
			} else {
				var2 = field1405[var1];
			}

			class28 var3 = field1403[var2];
			if (var3 != null && var3.field382 > 0) {
				var3.field382--;
				if (var3.field382 == 0) {
					var3.field381 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1355; var4++) {
			int var5 = field1356[var4];
			class27 var6 = field1354[var5];
			if (var6 != null && var6.field382 > 0) {
				var6.field382--;
				if (var6.field382 == 0) {
					var6.field381 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method435() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.b(II)V")
	public final void method436(int arg0) {
		signlink.wavevol = arg0;
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

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method437(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method438() {
		class57.field852.method117();
		class57.field853.method117();
		class59.field890.method117();
		class60.field936.method117();
		class60.field937.method117();
		class28.field445.method117();
		class68.field1010.method117();
	}

	@ObfuscatedName("client.e(B)V")
	public final void method439() {
		for (int var1 = 0; var1 < field1276; var1++) {
			if (field1327[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1104[var1] != field1044 || field1283[var1] != field1231) {
						class39 var3 = class55.method323(field1283[var1], field1104[var1]);
						if (System.currentTimeMillis() + var3.field624 / 22 > field1304 / 22 + field1273) {
							field1304 = var3.field624;
							field1273 = System.currentTimeMillis();

							if (method468(var3.field624, var3.field623)) {
								field1044 = field1104[var1];
								field1231 = field1283[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method535()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1327[var1] != -5) {
					field1327[var1] = -5;
				} else {
					field1276--;
					for (int var5 = var1; var5 < field1276; var5++) {
						field1104[var5] = field1104[var5 + 1];
						field1283[var5] = field1283[var5 + 1];
						field1327[var5] = field1327[var5 + 1];
					}

					var1--;
				}
			} else {
				field1327[var1]--;
			}
		}

		if (field1305 > 0) {
			field1305 -= 20;
			if (field1305 < 0) {
				field1305 = 0;
			}

			if (field1305 == 0 && field1288 && !field1084) {
				field1422 = field1220;
				field1423 = false;
				field1121.method289(2, field1422);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method440(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1176 = "";
				field1177 = "Connecting to server...";
				method476();
			}

			field1318 = new class5(this, method464(field1082 + 43594));
			long var4 = class52.method310(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1382.field624 = 0;
			field1382.method229(14);
			field1382.method229(var6);
			field1318.method42(0, field1382.field623, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field1318.method39();
			}

			int var8 = field1318.method39();
			if (var8 == 0) {
				field1318.method41(field1379.field623, 0, 8);
				field1379.field624 = 0;
				field1163 = field1379.method245();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1163 >> 32), (int) field1163 };
				field1382.field624 = 0;
				field1382.method229(10);
				field1382.method233(var9[0]);
				field1382.method233(var9[1]);
				field1382.method233(var9[2]);
				field1382.method233(var9[3]);
				field1382.method233(signlink.uid);
				field1382.method236(arg0);
				field1382.method236(arg1);
				field1382.method254(field1272, field1233);
				field1180.field624 = 0;

				if (arg2) {
					field1180.method229(18);
				} else {
					field1180.method229(16);
				}

				field1180.method229(field1382.field624 + 36 + 1 + 1);
				field1180.method229(249);
				field1180.method229(field1084 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1180.method233(field1179[var10]);
				}

				field1180.method237(field1382.field624, field1382.field623, 0);
				field1382.field628 = new class50(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1245 = new class50(var9);
				field1318.method42(0, field1180.field623, field1180.field624);
				var8 = field1318.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var19) {
				}

				method440(arg0, arg1, arg2);
			} else if (var8 == 2 || var8 == 18 || var8 == 19) {
				field1229 = 0;
				if (var8 == 18) {
					field1229 = 1;
				}

				if (var8 == 19) {
					field1229 = 2;
				}

				class6.method45();
				field1326 = 0L;
				field1280 = 0;
				field1164.field857 = 0;
				field14 = true;
				field1223 = true;
				field1075 = true;
				field1382.field624 = 0;
				field1379.field624 = 0;
				field1411 = -1;
				field1341 = -1;
				field1342 = -1;
				field1343 = -1;
				field1410 = 0;
				field1412 = 0;
				field1105 = 0;
				field1414 = 0;
				field1385 = 0;
				field1256 = 0;
				field1314 = 0;
				field1201 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1098[var12] = null;
				}

				field1124 = 0;
				field1364 = 0;
				field1311 = 0;
				field1276 = 0;
				field1435 = (int) (Math.random() * 100.0D) - 50;
				field1072 = (int) (Math.random() * 110.0D) - 55;
				field1242 = (int) (Math.random() * 80.0D) - 40;
				field1390 = (int) (Math.random() * 120.0D) - 60;
				field1308 = (int) (Math.random() * 30.0D) - 20;
				field1376 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1054 = -1;
				field1151 = 0;
				field1152 = 0;
				field1404 = 0;
				field1355 = 0;

				for (int var13 = 0; var13 < field1401; var13++) {
					field1403[var13] = null;
					field1408[var13] = null;
				}

				for (int var14 = 0; var14 < 8192; var14++) {
					field1354[var14] = null;
				}

				field1090 = field1403[field1402] = new class28();
				field1409.method262();
				field1333.method262();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1183[var15][var16][var17] = null;
						}
					}
				}

				field1148 = new class42();
				field1207 = 0;
				field1232 = -1;
				field1389 = -1;
				field1111 = -1;
				field1265 = -1;
				field1397 = -1;
				field1284 = false;
				field1085 = 3;
				field1221 = false;
				field1201 = false;
				field1043 = false;
				field1260 = null;
				field1424 = 0;
				field1392 = -1;
				field1155 = true;
				method473();

				for (int var18 = 0; var18 < 5; var18++) {
					field1372[var18] = 0;
				}

				field1175 = 0;
				field1344 = 0;
				field1306 = 0;
				field1071 = 0;
				field1089 = 0;
				field1352 = 0;
				field1092 = 0;
				field1310 = 0;
				field1248 = 0;
				method497();
			} else if (var8 == 3) {
				field1176 = "";
				field1177 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1176 = "Your account has been disabled.";
				field1177 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1176 = "Your account is already logged in.";
				field1177 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1176 = "RuneScape has been updated!";
				field1177 = "Please reload this page.";
			} else if (var8 == 7) {
				field1176 = "This world is full.";
				field1177 = "Please use a different world.";
			} else if (var8 == 8) {
				field1176 = "Unable to connect.";
				field1177 = "Login server offline.";
			} else if (var8 == 9) {
				field1176 = "Login limit exceeded.";
				field1177 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1176 = "Unable to connect.";
				field1177 = "Bad session id.";
			} else if (var8 == 11) {
				field1177 = "Login server rejected session.";
				field1177 = "Please try again.";
			} else if (var8 == 12) {
				field1176 = "You need a members account to login to this world.";
				field1177 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1176 = "Could not complete login.";
				field1177 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1176 = "The server is being updated.";
				field1177 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1075 = true;
				field1382.field624 = 0;
				field1379.field624 = 0;
				field1411 = -1;
				field1341 = -1;
				field1342 = -1;
				field1343 = -1;
				field1410 = 0;
				field1412 = 0;
				field1105 = 0;
				field1314 = 0;
				field1201 = false;
				field1240 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1176 = "Login attempts exceeded.";
				field1177 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1176 = "You are standing in a members-only area.";
				field1177 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1176 = "Invalid loginserver requested";
				field1177 = "Please try using a different world.";
			} else if (var8 == -1) {
				field1176 = "No response from server";
				field1177 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1176 = "Unexpected server response";
				field1177 = "Please try using a different world.";
			}
		} catch (IOException var20) {
			field1176 = "";
			field1177 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ZII)Z")
	public final boolean method441(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field57[arg0];
		for (int var5 = 0; var5 < var4.field79.length && var4.field79[var5] != -1; var5++) {
			class4 var6 = class4.field57[var4.field79[var5]];
			if (var6.field64 == 1) {
				var3 |= method441(var6.field62, arg1);
			}

			if (var6.field64 == 6 && (var6.field110 != -1 || var6.field111 != -1)) {
				boolean var7 = method447(var6);
				int var8;
				if (var7) {
					var8 = var6.field111;
				} else {
					var8 = var6.field110;
				}

				if (var8 != -1) {
					class66 var9 = class66.field979[var8];
					var6.field61 += arg1;
					while (var6.field61 > var9.method384(var6.field60)) {
						var6.field61 -= var9.method384(var6.field60) + 1;
						var6.field60++;
						if (var6.field60 >= var9.field980) {
							var6.field60 -= var9.field984;
							if (var6.field60 < 0 || var6.field60 >= var9.field980) {
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

	@ObfuscatedName("client.b(Z)V")
	public final void method442() {
		if (field1084 && field1311 == 2 && class3.field33 != field1078) {
			field1431.method268();
			field1198.method214("Loading - please wait.", 0, 151, 257);
			field1198.method214("Loading - please wait.", 0xFFFFFF, 150, 256);
			field1431.method269(4, field9, 4);
			field1311 = 1;
			field1240 = System.currentTimeMillis();
		}

		if (field1311 == 1) {
			int var1 = method443();
			if (var1 != 0 && System.currentTimeMillis() - field1240 > 360000L) {
				signlink.reporterror(field1444 + " glcfb " + field1163 + "," + var1 + "," + field1084 + "," + field1195[0] + "," + field1121.method290() + "," + field1078 + "," + field1266 + "," + field1267);
				field1240 = System.currentTimeMillis();
			}
		}

		if (field1311 == 2 && field1078 != field1054) {
			field1054 = field1078;
			method517(field1078);
		}
	}

	@ObfuscatedName("client.f(B)I")
	public final int method443() {
		for (int var1 = 0; var1 < field1154.length; var1++) {
			if (field1154[var1] == null && field1189[var1] != -1) {
				return -1;
			}

			if (field1139[var1] == null && field1190[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1154.length; var3++) {
			byte[] var4 = field1139[var3];
			if (var4 != null) {
				int var5 = (field1188[var3] >> 8) * 64 - field1203;
				int var6 = (field1188[var3] & 0xFF) * 64 - field1204;
				var2 &= class3.method16(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1091) {
			return -4;
		} else {
			field1311 = 2;
			class3.field33 = field1078;
			method445();
			return 0;
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method444() {
		if (field1226 == 0) {
			field1066[0] = "Cancel";
			field1173[0] = 1252;
			field1314 = 1;
			method480();
			field1080 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1111 == -1) {
					method546();
				} else {
					method550(4, 4, 0, field17, field18, class4.field57[field1111]);
				}
			}

			if (field1080 != field1068) {
				field1068 = field1080;
			}

			field1080 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1265 != -1) {
					method550(205, 553, 0, field17, field18, class4.field57[field1265]);
				} else if (field1250[field1085] != -1) {
					method550(205, 553, 0, field17, field18, class4.field57[field1250[field1085]]);
				}
			}

			if (field1080 != field1077) {
				field1337 = true;
				field1077 = field1080;
			}

			field1080 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1389 != -1) {
					method550(357, 17, 0, field17, field18, class4.field57[field1389]);
				} else if (field18 < 434 && field17 < 426) {
					method513(field18 - 357, field17 - 17);
				}
			}

			if (field1389 != -1 && field1222 != field1080) {
				field1129 = true;
				field1222 = field1080;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1314 - 1; var2++) {
					if (field1173[var2] < 1000 && field1173[var2 + 1] > 1000) {
						String var3 = field1066[var2];
						field1066[var2] = field1066[var2 + 1];
						field1066[var2 + 1] = var3;
						int var4 = field1173[var2];
						field1173[var2] = field1173[var2 + 1];
						field1173[var2 + 1] = var4;
						int var5 = field1171[var2];
						field1171[var2] = field1171[var2 + 1];
						field1171[var2 + 1] = var5;
						int var6 = field1172[var2];
						field1172[var2] = field1172[var2 + 1];
						field1172[var2 + 1] = var6;
						int var7 = field1174[var2];
						field1174[var2] = field1174[var2 + 1];
						field1174[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method445() {
		try {
			field1054 = -1;
			field1333.method262();
			field1409.method262();
			class35.method180();
			method438();
			field1249.method64();

			for (int var1 = 0; var1 < 4; var1++) {
				field1067[var1].method361();
			}

			System.gc();
			class3 var2 = new class3(104, field1184, 104, field1178);
			int var3 = field1154.length;
			class3.field32 = class19.field267;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1188[var4] >> 8;
				int var6 = field1188[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1249.method65(field1078);
			} else {
				field1249.method65(0);
			}

			field1382.method228(206);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1188[var7] >> 8) * 64 - field1203;
				int var9 = (field1188[var7] & 0xFF) * 64 - field1204;
				byte[] var10 = field1154[var7];
				if (var10 != null) {
					var2.method15(var10, var9, (field1267 - 6) * 8, var8, (field1266 - 6) * 8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1188[var11] >> 8) * 64 - field1203;
				int var13 = (field1188[var11] & 0xFF) * 64 - field1204;
				byte[] var14 = field1154[var11];
				if (var14 == null && field1267 < 800) {
					var2.method14(var12, 64, var13, 64);
				}
			}

			field1382.method228(206);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1139[var15];
				if (var16 != null) {
					int var17 = (field1188[var15] >> 8) * 64 - field1203;
					int var18 = (field1188[var15] & 0xFF) * 64 - field1204;
					var2.method18(field1249, var18, var17, field1067, var16);
				}
			}

			field1382.method228(206);
			var2.method20(field1067, field1249);
			field1431.method268();
			field1382.method228(206);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method495(var19, var20);
				}
			}

			method457();
		} catch (Exception var33) {
		}

		class57.field852.method117();

		if (field1084 && signlink.cache_dat != null) {
			int var22 = field1121.method282(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1121.method287(var23);
				if ((var24 & 0x79) == 0) {
					class32.method138(var23);
				}
			}
		}

		System.gc();
		class35.method181(20);
		field1121.method293();
		int var25 = (field1266 - 6) / 8 - 1;
		int var26 = (field1266 + 6) / 8 + 1;
		int var27 = (field1267 - 6) / 8 - 1;
		int var28 = (field1267 + 6) / 8 + 1;
		if (field1286) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1121.method284(var30, 0, var29);
					if (var31 != -1) {
						field1121.method294(3, var31);
					}

					int var32 = field1121.method284(var30, 1, var29);
					if (var32 != -1) {
						field1121.method294(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method446() {
		if (field1357 != 0) {
			class38 var1 = field1198;
			int var2 = 0;
			if (field1105 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1098[var3] != null) {
					int var4 = field1096[var3];
					String var5 = field1097[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1448 == 0 || field1448 == 1 && method559(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method217(var7, var8, "From", 0);
						var1.method217(var7 - 1, var8, "From", 0xFFFF);
						int var11 = var8 + var1.method216("From ");
						if (var6 == 1) {
							field1239[0].method212(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field1239[1].method212(var7 - 12, var11);
							var11 += 14;
						}

						var1.method217(var7, var11, var5 + ": " + field1098[var3], 0);
						var1.method217(var7 - 1, var11, var5 + ": " + field1098[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1448 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method217(var9, 4, field1098[var3], 0);
						var1.method217(var9 - 1, 4, field1098[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1448 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method217(var10, 4, "To " + var5 + ": " + field1098[var3], 0);
						var1.method217(var10 - 1, 4, "To " + var5 + ": " + field1098[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method447(class4 arg0) {
		if (arg0.field73 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field73.length; var2++) {
			int var3 = method478(arg0, var2);
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

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method448(class4 arg0) {
		int var2 = arg0.field66;
		if (var2 == 201) {
			field1129 = true;
			field1221 = false;
			field1043 = true;
			field1186 = "";
			field1338 = 1;
			field1202 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1129 = true;
			field1221 = false;
			field1043 = true;
			field1186 = "";
			field1338 = 2;
			field1202 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1414 = 250;
			return true;
		}

		if (var2 == 501) {
			field1129 = true;
			field1221 = false;
			field1043 = true;
			field1186 = "";
			field1338 = 4;
			field1202 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1129 = true;
			field1221 = false;
			field1043 = true;
			field1186 = "";
			field1338 = 5;
			field1202 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1069[var3];
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

					if (!class64.field959[var5].field965 && class64.field959[var5].field960 == var3 + (field1155 ? 0 : 7)) {
						break;
					}
				}

				field1069[var3] = var5;
				field1158 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1372[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1257[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1257[var6].length) {
					var8 = 0;
				}
			}

			field1372[var6] = var8;
			field1158 = true;
		}

		if (var2 == 324 && !field1155) {
			field1155 = true;
			method473();
		}

		if (var2 == 325 && field1155) {
			field1155 = false;
			method473();
		}

		if (var2 == 326) {
			field1382.method228(150);
			field1382.method229(field1155 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1382.method229(field1069[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1382.method229(field1372[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1274 = !field1274;
		}

		if (var2 >= 601 && var2 <= 612) {
			method537();

			if (field1156.length() > 0) {
				field1382.method228(205);
				field1382.method235(class52.method310(field1156));
				field1382.method229(var2 - 601);
				field1382.method229(field1274 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IBIIII)V")
	public final void method449(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1433.method212(arg2, arg1);
		field1434.method212(arg2 + arg4 - 16, arg1);
		class34.method170(16, arg1, arg2 + 16, arg4 - 32, field1303);
		int var6 = (arg4 - 32) * arg4 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg0 / (arg3 - arg4);
		class34.method170(16, arg1, arg2 + var7 + 16, var6, field1361);
		class34.method175(arg2 + var7 + 16, var6, field1194, arg1);
		class34.method175(arg2 + var7 + 16, var6, field1194, arg1 + 1);
		class34.method173(arg2 + var7 + 16, arg1, 16, field1194);
		class34.method173(arg2 + var7 + 17, arg1, 16, field1194);
		class34.method175(arg2 + var7 + 16, var6, field1218, arg1 + 15);
		class34.method175(arg2 + var7 + 17, var6 - 1, field1218, arg1 + 14);
		class34.method173(arg2 + var7 + var6 + 15, arg1, 16, field1218);
		class34.method173(arg2 + var7 + var6 + 14, arg1 + 1, 15, field1218);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method450() {
		field1432.method268();
		class35.field585 = field1330;
		field1254.method212(0, 0);

		if (field1043) {
			field1199.method214(field1202, 0, 40, 239);
			field1199.method214(field1186 + "*", 128, 60, 239);
		} else if (field1221) {
			field1199.method214("Enter amount:", 0, 40, 239);
			field1199.method214(field1122 + "*", 128, 60, 239);
		} else if (field1260 != null) {
			field1199.method214(field1260, 0, 40, 239);
			field1199.method214("Click to continue", 128, 60, 239);
		} else if (field1389 != -1) {
			method503(class4.field57[field1389], 0, 0, 0);
		} else if (field1232 == -1) {
			class38 var1 = field1198;
			int var2 = 0;
			class34.method167(0, 463, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1098[var3] != null) {
					int var4 = field1096[var3];
					int var5 = field1290 + 70 - var2 * 14;
					String var6 = field1097[var3];
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
							var1.method217(var5, 4, field1098[var3], 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1313 == 0 || field1313 == 1 && method559(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1239[0].method212(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field1239[1].method212(var5 - 12, var8);
								var8 += 14;
							}

							var1.method217(var5, var8, var6 + ":", 0);
							var8 += var1.method216(var6) + 8;
							var1.method217(var5, var8, field1098[var3], 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1357 == 0 && (var4 == 7 || field1448 == 0 || field1448 == 1 && method559(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method217(var5, var9, "From", 0);
							int var11 = var9 + var1.method216("From ");
							if (var7 == 1) {
								field1239[0].method212(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field1239[1].method212(var5 - 12, var11);
								var11 += 14;
							}

							var1.method217(var5, var11, var6 + ":", 0);
							var11 += var1.method216(var6) + 8;
							var1.method217(var5, var11, field1098[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1187 == 0 || field1187 == 1 && method559(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 4, var6 + " " + field1098[var3], 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1357 == 0 && field1448 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 4, field1098[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1357 == 0 && field1448 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 4, "To " + var6 + ":", 0);
							var1.method217(var5, var1.method216("To " + var6) + 12, field1098[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1187 == 0 || field1187 == 1 && method559(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 4, var6 + " " + field1098[var3], 0x7E3200);
						}

						var2++;
					}
				}
			}

			class34.method166();
			field1277 = var2 * 14 + 7;
			if (field1277 < 78) {
				field1277 = 78;
			}

			method449(field1277 - field1290 - 77, 463, 0, field1277, 77);
			String var10;
			if (field1090 == null || field1090.field424 == null) {
				var10 = class52.method314(field1444);
			} else {
				var10 = field1090.field424;
			}

			var1.method217(90, 4, var10 + ":", 0);
			var1.method217(90, var1.method216(var10 + ": ") + 6, field1244 + "*", 255);
			class34.method173(77, 0, 479, 0);
		} else {
			method503(class4.field57[field1232], 0, 0, 0);
		}

		if (field1201 && field1319 == 2) {
			method475();
		}

		field1432.method269(357, field9, 17);
		field1431.method268();
		class35.field585 = field1332;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method451(boolean arg0) {
		if (field1090.field369 >> 7 == field1151 && field1090.field370 >> 7 == field1152) {
			field1151 = 0;
		}

		int var2 = field1404;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class28 var4;
			int var5;
			if (arg0) {
				var4 = field1090;
				var5 = field1402 << 14;
			} else {
				var4 = field1403[field1405[var3]];
				var5 = field1405[var3] << 14;
			}

			if (var4 != null && var4.method127()) {
				var4.field443 = false;
				if ((field1084 && field1404 > 50 || field1404 > 200) && !arg0 && var4.field394 == var4.field374) {
					var4.field443 = true;
				}

				int var6 = var4.field369 >> 7;
				int var7 = var4.field370 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field438 == null || field1446 < var4.field433 || field1446 >= var4.field434) {
						if ((var4.field369 & 0x7F) == 0x40 && (var4.field370 & 0x7F) == 0x40) {
							if (field1131[var6][var7] == field1170) {
								continue;
							}

							field1131[var6][var7] = field1170;
						}

						var4.field432 = method484(var4.field370, field1078, var4.field369);
						field1249.method75(var4, var4.field432, var4.field371, var5, var4.field372, field1078, var4.field370, 60, var4.field369);
					} else {
						var4.field443 = false;
						var4.field432 = method484(var4.field370, field1078, var4.field369);
						field1249.method76(var4, var5, var4.field442, var4.field371, var4.field432, var4.field370, var4.field439, var4.field369, field1078, 60, var4.field440, var4.field441);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljb;III)V")
	public final void method452(class36 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1390 + field1376 & 0x7FF;
			int var6 = class32.field551[var5];
			int var7 = class32.field552[var5];
			var6 = var6 * 256 / (field1308 + 256);
			var7 = var7 * 256 / (field1308 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1086.method204(256, 15, var12 + 94 + 4 - 10, 20, var10, 15, 83 - var13 - 20, 20);
		} else {
			method540(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method453() {
		if (field1385 == 2) {
			method557((field1347 - field1204 << 7) + field1350, field1348 * 2, (field1346 - field1203 << 7) + field1349);

			if (field1270 > -1 && field1446 % 20 < 10) {
				field1307[2].method199(field1271 - 28, field1270 - 12);
			}
		}
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method454(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1173[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method455() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1269) {
			field1191 = false;
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

		if (field1345) {
			field1191 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1088) {
			field1191 = false;
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

	@ObfuscatedName("client.j(I)V")
	public final void method456() {
		try {
			int var1 = field1090.field369 + field1435;
			int var2 = field1090.field370 + field1072;
			if (field1335 - var1 < -500 || field1335 - var1 > 500 || field1336 - var2 < -500 || field1336 - var2 > 500) {
				field1335 = var1;
				field1336 = var2;
			}

			if (field1335 != var1) {
				field1335 += (var1 - field1335) / 16;
			}

			if (field1336 != var2) {
				field1336 += (var2 - field1336) / 16;
			}

			if (field27[1] == 1) {
				field1377 += (-field1377 - 24) / 2;
			} else if (field27[2] == 1) {
				field1377 += (24 - field1377) / 2;
			} else {
				field1377 /= 2;
			}

			if (field27[3] == 1) {
				field1378 += (12 - field1378) / 2;
			} else if (field27[4] == 1) {
				field1378 += (-field1378 - 12) / 2;
			} else {
				field1378 /= 2;
			}

			field1376 = field1377 / 2 + field1376 & 0x7FF;
			field1375 += field1378 / 2;
			if (field1375 < 128) {
				field1375 = 128;
			}

			if (field1375 > 383) {
				field1375 = 383;
			}

			int var3 = field1335 >> 7;
			int var4 = field1336 >> 7;
			int var5 = method484(field1336, field1078, field1335);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1078;
						if (var9 < 3 && (field1184[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1178[var9][var7][var8];
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

			if (var11 > field1386) {
				field1386 += (var11 - field1386) / 24;
			} else if (var11 < field1386) {
				field1386 += (var11 - field1386) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1090.field369 + "," + field1090.field370 + "," + field1335 + "," + field1336 + "," + field1266 + "," + field1267 + "," + field1203 + "," + field1204);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method457() {
		for (class41 var1 = (class41) field1148.method258(); var1 != null; var1 = (class41) field1148.method260()) {
			if (var1.field652 == -1) {
				var1.field651 = 0;
				method549(var1);
			} else {
				var1.method120();
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method458() {
		for (class31 var1 = (class31) field1409.method258(); var1 != null; var1 = (class31) field1409.method260()) {
			if (field1078 != var1.field459 || field1446 > var1.field465) {
				var1.method120();
			} else if (field1446 >= var1.field464) {
				if (var1.field468 > 0) {
					class27 var2 = field1354[var1.field468 - 1];
					if (var2 != null && var2.field369 >= 0 && var2.field369 < 13312 && var2.field370 >= 0 && var2.field370 < 13312) {
						var1.method133(field1446, var2.field370, var2.field369, method484(var2.field370, var1.field459, var2.field369) - var1.field463);
					}
				}

				if (var1.field468 < 0) {
					int var3 = -var1.field468 - 1;
					class28 var4;
					if (field1041 == var3) {
						var4 = field1090;
					} else {
						var4 = field1403[var3];
					}

					if (var4 != null && var4.field369 >= 0 && var4.field369 < 13312 && var4.field370 >= 0 && var4.field370 < 13312) {
						var1.method133(field1446, var4.field370, var4.field369, method484(var4.field370, var1.field459, var4.field369) - var1.field463);
					}
				}

				var1.method134(field1167);
				field1249.method75(var1, (int) var1.field472, var1.field478, -1, false, field1078, (int) var1.field471, 60, (int) var1.field470);
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method459(long arg0) {
		if (arg0 != 0L) {
			if (field1079 >= 100) {
				method544(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class52.method314(class52.method311(arg0));
				for (int var4 = 0; var4 < field1079; var4++) {
					if (field1150[var4] == arg0) {
						method544(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1207; var5++) {
					if (field1168[var5] == arg0) {
						method544(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1150[field1079++] = arg0;
				field1337 = true;
				field1382.method228(20);
				field1382.method235(arg0);
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method460() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1313 = (field1313 + 1) % 4;
				field1340 = true;
				field1129 = true;
				field1382.method228(8);
				field1382.method229(field1313);
				field1382.method229(field1448);
				field1382.method229(field1187);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1448 = (field1448 + 1) % 3;
				field1340 = true;
				field1129 = true;
				field1382.method228(8);
				field1382.method229(field1313);
				field1382.method229(field1448);
				field1382.method229(field1187);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1187 = (field1187 + 1) % 3;
				field1340 = true;
				field1129 = true;
				field1382.method228(8);
				field1382.method229(field1313);
				field1382.method229(field1448);
				field1382.method229(field1187);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method537();
				field1156 = "";
				field1274 = false;

				for (int var1 = 0; var1 < class4.field57.length; var1++) {
					if (class4.field57[var1] != null && class4.field57[var1].field66 == 600) {
						field1237 = field1111 = class4.field57[var1].field63;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;IZ)V")
	public final void method461(class39 arg0, int arg1) {
		field1181 = 0;
		field1406 = 0;
		method543(arg1, arg0);
		method433(arg1, arg0);
		method505(arg1, arg0);
		method554(arg1, arg0);

		for (int var3 = 0; var3 < field1181; var3++) {
			int var4 = field1182[var3];
			if (field1446 != field1403[var4].field414) {
				field1403[var4] = null;
			}
		}

		if (arg0.field624 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field624 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1404; var5++) {
			if (field1403[field1405[var5]] == null) {
				signlink.reporterror(field1444 + " null entry in pl list - pos:" + var5 + " size:" + field1404);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.j(B)I")
	public final int method462() {
		int var1 = 3;
		if (field1146 < 310) {
			int var2 = field1143 >> 7;
			int var3 = field1145 >> 7;
			int var4 = field1090.field369 >> 7;
			int var5 = field1090.field370 >> 7;

			if ((field1184[field1078][var2][var3] & 0x4) != 0) {
				var1 = field1078;
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

					if ((field1184[field1078][var2][var3] & 0x4) != 0) {
						var1 = field1078;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1184[field1078][var2][var3] & 0x4) != 0) {
							var1 = field1078;
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

					if ((field1184[field1078][var2][var3] & 0x4) != 0) {
						var1 = field1078;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1184[field1078][var2][var3] & 0x4) != 0) {
							var1 = field1078;
						}
					}
				}
			}
		}

		if ((field1184[field1078][field1090.field369 >> 7][field1090.field370 >> 7] & 0x4) != 0) {
			var1 = field1078;
		}

		return var1;
	}

	@ObfuscatedName("client.k(I)I")
	public final int method463() {
		int var1 = method484(field1145, field1078, field1143);
		if (var1 - field1144 < 800 && (field1184[field1078][field1143 >> 7][field1145 >> 7] & 0x4) != 0) {
			return field1078;
		}

		return 3;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1082 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.l(I)Ljava/net/Socket;")
	public final Socket method464(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.m(I)V")
	public final void method465() {
		if (field1311 == 2) {
			for (class41 var1 = (class41) field1148.method258(); var1 != null; var1 = (class41) field1148.method260()) {
				if (var1.field652 > 0) {
					var1.field652--;
				}

				if (var1.field652 != 0) {
					if (var1.field651 > 0) {
						var1.field651--;
					}

					if (var1.field651 == 0 && var1.field643 >= 1 && var1.field644 >= 1 && var1.field643 <= 102 && var1.field644 <= 102 && (var1.field648 < 0 || class3.method30(var1.field650, var1.field648))) {
						method528(var1.field649, var1.field641, var1.field643, var1.field650, var1.field648, var1.field642, var1.field644);
						var1.field651 = -1;

						if (var1.field648 == var1.field645 && var1.field645 == -1) {
							var1.method120();
						} else if (var1.field648 == var1.field645 && var1.field649 == var1.field646 && var1.field650 == var1.field647) {
							var1.method120();
						}
					}
				} else if (var1.field645 < 0 || class3.method30(var1.field647, var1.field645)) {
					method528(var1.field646, var1.field641, var1.field643, var1.field647, var1.field645, var1.field642, var1.field644);
					var1.method120();
				}
			}

			field1165++;
			if (field1165 > 85) {
				field1165 = 0;
				field1382.method228(63);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZZ[B)V")
	public final void method466(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.n(I)Z")
	public final boolean method467() {
		if (field1318 == null) {
			return false;
		}

		try {
			int var1 = field1318.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1411 == -1) {
				field1318.method41(field1379.field623, 0, 1);
				field1411 = field1379.field623[0] & 0xFF;
				if (field1245 != null) {
					field1411 = field1411 - field1245.method305() & 0xFF;
				}

				field1410 = class61.field939[field1411];
				var1--;
			}

			if (field1410 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1318.method41(field1379.field623, 0, 1);
				field1410 = field1379.field623[0] & 0xFF;
				var1--;
			}

			if (field1410 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1318.method41(field1379.field623, 0, 2);
				field1379.field624 = 0;
				field1410 = field1379.method241();
				var1 -= 2;
			}

			if (var1 < field1410) {
				return false;
			}

			field1379.field624 = 0;
			field1318.method41(field1379.field623, 0, field1410);
			field1412 = 0;
			field1343 = field1342;
			field1342 = field1341;
			field1341 = field1411;

			if (field1411 == 15) {
				field1370 = field1379.method239();
				field1371 = field1379.method239();

				while (field1379.field624 < field1410) {
					int var2 = field1379.method239();
					method506(var2, field1379);
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 153) {
				int var3 = field1379.method241();
				int var4 = field1379.method241();
				int var5 = field1379.method241();
				class60 var6 = class60.method350(var4);
				class4.field57[var3].field106 = 4;
				class4.field57[var3].field107 = var4;
				class4.field57[var3].field113 = var6.field904;
				class4.field57[var3].field114 = var6.field905;
				class4.field57[var3].field112 = var6.field903 * 100 / var5;
				field1411 = -1;
				return true;
			}

			if (field1411 == 165) {
				class39 var7 = class6.method47();
				if (var7 != null) {
					field1382.method228(19);
					field1382.method230(var7.field624);
					field1382.method237(var7.field624, var7.field623, 0);
					var7.method227();
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 156) {
				field1337 = true;
				int var8 = field1379.method241();
				class4 var9 = class4.field57[var8];
				int var10 = field1379.method239();
				for (int var11 = 0; var11 < var10; var11++) {
					var9.field58[var11] = field1379.method241();
					int var12 = field1379.method239();
					if (var12 == 255) {
						var12 = field1379.method244();
					}

					var9.field59[var11] = var12;
				}

				for (int var13 = var10; var13 < var9.field58.length; var13++) {
					var9.field58[var13] = 0;
					var9.field59[var13] = 0;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 69) {
				int var14 = field1379.method241();
				int var15 = field1379.method241();
				class4.field57[var14].field110 = var15;
				field1411 = -1;
				return true;
			}

			if (field1411 == 115) {
				int var16 = field1379.method242();
				if (var16 >= 0) {
					method469(var16);
				}

				field1397 = var16;
				field1411 = -1;
				return true;
			}

			if (field1411 == 32) {
				int var17 = field1379.method241();
				String var18 = field1379.method246();
				class4.field57[var17].field98 = var18;

				if (field1250[field1085] == class4.field57[var17].field63) {
					field1337 = true;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 96) {
				int var19 = field1379.method241();
				if (var19 == 0xFFFF) {
					var19 = -1;
				}

				if (field1220 != var19 && field1288 && !field1084 && field1305 == 0) {
					field1422 = var19;
					field1423 = true;
					field1121.method289(2, field1422);
				}

				field1220 = var19;
				field1411 = -1;
				return true;
			}

			if (field1411 == 39) {
				int var20 = field1379.method241();
				int var21 = field1379.method241();
				if (field1288 && !field1084) {
					field1422 = var20;
					field1423 = false;
					field1121.method289(2, field1422);
					field1305 = var21;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 243) {
				field1385 = field1379.method239();
				if (field1385 == 1) {
					field1042 = field1379.method241();
				}

				if (field1385 >= 2 && field1385 <= 6) {
					if (field1385 == 2) {
						field1349 = 64;
						field1350 = 64;
					}

					if (field1385 == 3) {
						field1349 = 0;
						field1350 = 64;
					}

					if (field1385 == 4) {
						field1349 = 128;
						field1350 = 64;
					}

					if (field1385 == 5) {
						field1349 = 64;
						field1350 = 0;
					}

					if (field1385 == 6) {
						field1349 = 64;
						field1350 = 128;
					}

					field1385 = 2;
					field1346 = field1379.method241();
					field1347 = field1379.method241();
					field1348 = field1379.method239();
				}

				if (field1385 == 10) {
					field1416 = field1379.method241();
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 26) {
				field1105 = field1379.method241() * 30;
				field1411 = -1;
				return true;
			}

			if (field1411 == 60) {
				int var22 = field1379.method241();
				int var23 = field1379.method241();
				class4.field57[var22].field106 = 1;
				class4.field57[var22].field107 = var23;
				field1411 = -1;
				return true;
			}

			if (field1411 == 76) {
				int var24 = field1379.method241();
				int var25 = field1379.method241();
				class4.field57[var24].field106 = 2;
				class4.field57[var24].field107 = var25;
				field1411 = -1;
				return true;
			}

			if (field1411 == 2) {
				field1313 = field1379.method239();
				field1448 = field1379.method239();
				field1187 = field1379.method239();
				field1340 = true;
				field1129 = true;
				field1411 = -1;
				return true;
			}

			if (field1411 == 25) {
				for (int var26 = 0; var26 < field1287.length; var26++) {
					if (field1427[var26] != field1287[var26]) {
						field1287[var26] = field1427[var26];
						method527(var26);
						field1337 = true;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 208) {
				if (field1085 == 12) {
					field1337 = true;
				}

				field1425 = field1379.method239();
				field1411 = -1;
				return true;
			}

			if (field1411 == 161) {
				method461(field1379, field1410);
				field1091 = false;
				field1411 = -1;
				return true;
			}

			if (field1411 == 140) {
				field1370 = field1379.method239();
				field1371 = field1379.method239();
				for (int var27 = field1370; var27 < field1370 + 8; var27++) {
					for (int var28 = field1371; var28 < field1371 + 8; var28++) {
						if (field1183[field1078][var27][var28] != null) {
							field1183[field1078][var27][var28] = null;
							method495(var27, var28);
						}
					}
				}

				for (class41 var29 = (class41) field1148.method258(); var29 != null; var29 = (class41) field1148.method260()) {
					if (var29.field643 >= field1370 && var29.field643 < field1370 + 8 && var29.field644 >= field1371 && var29.field644 < field1371 + 8 && field1078 == var29.field641) {
						var29.field652 = 0;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 207) {
				long var30 = field1379.method245();
				int var32 = field1379.method244();
				int var33 = field1379.method239();
				boolean var34 = false;
				for (int var35 = 0; var35 < 100; var35++) {
					if (field1113[var35] == var32) {
						var34 = true;
						break;
					}
				}

				if (var33 <= 1) {
					for (int var36 = 0; var36 < field1079; var36++) {
						if (field1150[var36] == var30) {
							var34 = true;
							break;
						}
					}
				}

				if (!var34 && field1353 == 0) {
					try {
						field1113[field1312] = var32;
						field1312 = (field1312 + 1) % 100;
						String var37 = class53.method317(field1379, field1410 - 13);
						var37 = class71.method403(var37);
						if (var33 == 2 || var33 == 3) {
							method544(7, "@cr2@" + class52.method314(class52.method311(var30)), var37);
						} else if (var33 == 1) {
							method544(7, "@cr1@" + class52.method314(class52.method311(var30)), var37);
						} else {
							method544(3, class52.method314(class52.method311(var30)), var37);
						}
					} catch (Exception var153) {
						signlink.reporterror("cde1");
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 152) {
				int var39 = field1379.method242();
				field1232 = var39;
				field1129 = true;
				field1411 = -1;
				return true;
			}

			if (field1411 == 7) {
				int var40 = field1379.method241();
				method469(var40);

				if (field1265 != -1) {
					field1265 = -1;
					field1337 = true;
					field1193 = true;
				}

				field1389 = var40;
				field1129 = true;
				field1111 = -1;
				field1284 = false;
				field1411 = -1;
				return true;
			}

			if (field1411 == 28) {
				class6.method44();
				field1411 = -1;
				return true;
			}

			if (field1411 == 135) {
				int var41 = field1379.method241();
				int var42 = field1379.method241();
				int var43 = var42 >> 10 & 0x1F;
				int var44 = var42 >> 5 & 0x1F;
				int var45 = var42 & 0x1F;
				class4.field57[var41].field100 = (var45 << 3) + (var43 << 19) + (var44 << 11);
				field1411 = -1;
				return true;
			}

			if (field1411 == 144) {
				for (int var46 = 0; var46 < field1403.length; var46++) {
					if (field1403[var46] != null) {
						field1403[var46].field397 = -1;
					}
				}

				for (int var47 = 0; var47 < field1354.length; var47++) {
					if (field1354[var47] != null) {
						field1354[var47].field397 = -1;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 225) {
				int var48 = field1379.method241();
				boolean var49 = field1379.method239() == 1;
				class4.field57[var48].field78 = var49;
				field1411 = -1;
				return true;
			}

			if (field1411 == 230) {
				int var50 = field1379.method241();
				int var51 = field1379.method242();
				int var52 = field1379.method242();
				class4 var53 = class4.field57[var50];
				var53.field70 = var51;
				var53.field71 = var52;
				field1411 = -1;
				return true;
			}

			if (field1411 == 192) {
				int var54 = field1379.method241();
				byte var55 = field1379.method240();
				field1427[var54] = var55;

				if (field1287[var54] != var55) {
					field1287[var54] = var55;
					method527(var54);
					field1337 = true;

					if (field1232 != -1) {
						field1129 = true;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 226) {
				int var56 = field1379.method241();
				int var57 = field1379.method241();
				class4 var58 = class4.field57[var56];
				if (var58 != null && var58.field64 == 0) {
					if (var57 < 0) {
						var57 = 0;
					}

					if (var57 > var58.field76 - var58.field68) {
						var57 = var58.field76 - var58.field68;
					}

					var58.field77 = var57;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 238) {
				field1373 = field1379.method244();
				field1428 = field1379.method241();
				field1039 = field1379.method239();
				field1169 = field1379.method241();
				field1070 = field1379.method239();
				if (field1373 != 0 && field1111 == -1) {
					signlink.dnslookup(class52.method313(field1373));
					method537();
					short var59 = 650;
					if (field1039 != 201 || field1070 == 1) {
						var59 = 655;
					}

					field1156 = "";
					field1274 = false;

					for (int var60 = 0; var60 < class4.field57.length; var60++) {
						if (class4.field57[var60] != null && class4.field57[var60].field66 == var59) {
							field1111 = class4.field57[var60].field63;
							break;
						}
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 203) {
				field1370 = field1379.method239();
				field1371 = field1379.method239();
				field1411 = -1;
				return true;
			}

			if (field1411 == 123) {
				field1160 = true;
				field1106 = field1379.method239();
				field1107 = field1379.method239();
				field1108 = field1379.method241();
				field1109 = field1379.method239();
				field1110 = field1379.method239();
				if (field1110 >= 100) {
					int var61 = field1106 * 128 + 64;
					int var62 = field1107 * 128 + 64;
					int var63 = method484(var62, field1078, var61) - field1108;
					int var64 = var61 - field1143;
					int var65 = var63 - field1144;
					int var66 = var62 - field1145;
					int var67 = (int) Math.sqrt(var64 * var64 + var66 * var66);
					field1146 = (int) (Math.atan2(var65, var67) * 325.949D) & 0x7FF;
					field1147 = (int) (Math.atan2(var64, var66) * -325.949D) & 0x7FF;

					if (field1146 < 128) {
						field1146 = 128;
					}

					if (field1146 > 383) {
						field1146 = 383;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 56) {
				field1043 = false;
				field1221 = true;
				field1122 = "";
				field1129 = true;
				field1411 = -1;
				return true;
			}

			if (field1411 == 86) {
				field1160 = true;
				field1417 = field1379.method239();
				field1418 = field1379.method239();
				field1419 = field1379.method241();
				field1420 = field1379.method239();
				field1421 = field1379.method239();
				if (field1421 >= 100) {
					field1143 = field1417 * 128 + 64;
					field1145 = field1418 * 128 + 64;
					field1144 = method484(field1145, field1078, field1143) - field1419;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 105) {
				method510(field1379, field1410);
				field1411 = -1;
				return true;
			}

			if (field1411 == 174) {
				if (field1265 != -1) {
					field1265 = -1;
					field1337 = true;
					field1193 = true;
				}

				if (field1389 != -1) {
					field1389 = -1;
					field1129 = true;
				}

				if (field1221) {
					field1221 = false;
					field1129 = true;
				}

				field1111 = -1;
				field1284 = false;
				field1411 = -1;
				return true;
			}

			if (field1411 == 109) {
				long var68 = field1379.method245();
				int var70 = field1379.method239();
				String var71 = class52.method314(class52.method311(var68));
				for (int var72 = 0; var72 < field1207; var72++) {
					if (field1168[var72] == var68) {
						if (field1374[var72] != var70) {
							field1374[var72] = var70;
							field1337 = true;

							if (var70 > 0) {
								method544(5, "", var71 + " has logged in.");
							}

							if (var70 == 0) {
								method544(5, "", var71 + " has logged out.");
							}
						}

						var71 = null;
						break;
					}
				}

				if (var71 != null && field1207 < 200) {
					field1168[field1207] = var68;
					field1140[field1207] = var71;
					field1374[field1207] = var70;
					field1207++;
					field1337 = true;
				}

				boolean var73 = false;
				while (!var73) {
					var73 = true;
					for (int var74 = 0; var74 < field1207 - 1; var74++) {
						if (field1374[var74] != field1081 && field1374[var74 + 1] == field1081 || field1374[var74] == 0 && field1374[var74 + 1] != 0) {
							int var75 = field1374[var74];
							field1374[var74] = field1374[var74 + 1];
							field1374[var74 + 1] = var75;
							String var76 = field1140[var74];
							field1140[var74] = field1140[var74 + 1];
							field1140[var74 + 1] = var76;
							long var77 = field1168[var74];
							field1168[var74] = field1168[var74 + 1];
							field1168[var74 + 1] = var77;
							field1337 = true;
							var73 = false;
						}
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 49) {
				field1041 = field1379.method241();
				field1360 = field1379.method239();
				field1411 = -1;
				return true;
			}

			if (field1411 == 75) {
				int var79 = field1379.method241();
				int var80 = field1379.method244();
				field1427[var79] = var80;

				if (field1287[var79] != var80) {
					field1287[var79] = var80;
					method527(var79);
					field1337 = true;

					if (field1232 != -1) {
						field1129 = true;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 29) {
				int var81 = field1379.method241();
				int var82 = field1379.method239();

				if (var81 == 0xFFFF) {
					var81 = -1;
				}

				field1250[var82] = var81;
				field1337 = true;
				field1193 = true;
				field1411 = -1;
				return true;
			}

			if (field1411 == 8) {
				field1085 = field1379.method239();
				field1337 = true;
				field1193 = true;
				field1411 = -1;
				return true;
			}

			if (field1411 == 177) {
				int var83 = field1379.method241();
				method469(var83);

				if (field1265 != -1) {
					field1265 = -1;
					field1337 = true;
					field1193 = true;
				}

				if (field1389 != -1) {
					field1389 = -1;
					field1129 = true;
				}

				if (field1221) {
					field1221 = false;
					field1129 = true;
				}

				field1111 = var83;
				field1284 = false;
				field1411 = -1;
				return true;
			}

			if (field1411 == 236) {
				int var84 = field1379.method241();
				method469(var84);

				if (field1389 != -1) {
					field1389 = -1;
					field1129 = true;
				}

				if (field1221) {
					field1221 = false;
					field1129 = true;
				}

				field1265 = var84;
				field1337 = true;
				field1193 = true;
				field1111 = -1;
				field1284 = false;
				field1411 = -1;
				return true;
			}

			if (field1411 == 95) {
				field1337 = true;
				int var85 = field1379.method241();
				class4 var86 = class4.field57[var85];
				while (field1379.field624 < field1410) {
					int var87 = field1379.method239();
					int var88 = field1379.method241();
					int var89 = field1379.method239();
					if (var89 == 255) {
						var89 = field1379.method244();
					}

					if (var87 >= 0 && var87 < var86.field58.length) {
						var86.field58[var87] = var88;
						var86.field59[var87] = var89;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 108) {
				field1256 = 255;
				field1411 = -1;
				return true;
			}

			if (field1411 == 70) {
				if (field1085 == 12) {
					field1337 = true;
				}

				field1040 = field1379.method242();
				field1411 = -1;
				return true;
			}

			if (field1411 == 181) {
				field1079 = field1410 / 8;
				for (int var90 = 0; var90 < field1079; var90++) {
					field1150[var90] = field1379.method245();
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 175) {
				String var91 = field1379.method246();
				if (var91.endsWith(":tradereq:")) {
					String var92 = var91.substring(0, var91.indexOf(":"));
					long var93 = class52.method310(var92);
					boolean var95 = false;
					for (int var96 = 0; var96 < field1079; var96++) {
						if (field1150[var96] == var93) {
							var95 = true;
							break;
						}
					}

					if (!var95 && field1353 == 0) {
						method544(4, var92, "wishes to trade with you.");
					}
				} else if (var91.endsWith(":duelreq:")) {
					String var97 = var91.substring(0, var91.indexOf(":"));
					long var98 = class52.method310(var97);
					boolean var100 = false;
					for (int var101 = 0; var101 < field1079; var101++) {
						if (field1150[var101] == var98) {
							var100 = true;
							break;
						}
					}

					if (!var100 && field1353 == 0) {
						method544(8, var97, "wishes to duel with you.");
					}
				} else {
					method544(0, "", var91);
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 229) {
				int var102 = field1379.method241();
				int var103 = field1379.method241();

				if (field1389 != -1) {
					field1389 = -1;
					field1129 = true;
				}

				if (field1221) {
					field1221 = false;
					field1129 = true;
				}

				field1111 = var102;
				field1265 = var103;
				field1337 = true;
				field1193 = true;
				field1284 = false;
				field1411 = -1;
				return true;
			}

			if (field1411 == 110) {
				field1337 = true;
				int var104 = field1379.method239();
				int var105 = field1379.method244();
				int var106 = field1379.method239();
				field1281[var104] = var105;
				field1315[var104] = var106;
				field1359[var104] = 1;
				for (int var107 = 0; var107 < 98; var107++) {
					if (var105 >= field1351[var107]) {
						field1359[var104] = var107 + 2;
					}
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 143) {
				int var108 = field1379.method241();
				class4 var109 = class4.field57[var108];
				for (int var110 = 0; var110 < var109.field58.length; var110++) {
					var109.field58[var110] = -1;
					var109.field58[var110] = 0;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 233) {
				field1151 = 0;
				field1411 = -1;
				return true;
			}

			if (field1411 == 132) {
				field1392 = field1379.method239();
				if (field1392 == field1085) {
					if (field1392 == 3) {
						field1085 = 1;
					} else {
						field1085 = 3;
					}

					field1337 = true;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 83) {
				int var111 = field1379.method241();
				class4.field57[var111].field106 = 3;
				class4.field57[var111].field107 = (field1090.field428[8] << 6) + (field1090.field428[0] << 12) + (field1090.field429[0] << 24) + (field1090.field429[4] << 18) + field1090.field428[11];
				field1411 = -1;
				return true;
			}

			if (field1411 == 209) {
				int var112 = field1379.method241();
				int var113 = field1379.method239();
				int var114 = field1379.method241();
				if (field1329 && !field1084 && field1276 < 50) {
					field1104[field1276] = var112;
					field1283[field1276] = var113;
					field1327[field1276] = class55.field783[var112] + var114;
					field1276++;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 103) {
				int var115 = field1379.method239();
				int var116 = field1379.method239();
				int var117 = field1379.method239();
				int var118 = field1379.method239();
				field1324[var115] = true;
				field1219[var115] = var116;
				field1074[var115] = var117;
				field1400[var115] = var118;
				field1132[var115] = 0;
				field1411 = -1;
				return true;
			}

			if (field1411 == 151 || field1411 == 188 || field1411 == 190 || field1411 == 141 || field1411 == 187 || field1411 == 13 || field1411 == 94 || field1411 == 71 || field1411 == 198 || field1411 == 119) {
				method506(field1411, field1379);
				field1411 = -1;
				return true;
			}

			if (field1411 == 35) {
				field1424 = field1379.method239();
				field1411 = -1;
				return true;
			}

			if (field1411 == 36) {
				method553();
				field1411 = -1;
				return false;
			}

			if (field1411 == 134) {
				field1160 = false;

				for (int var119 = 0; var119 < 5; var119++) {
					field1324[var119] = false;
				}

				field1411 = -1;
				return true;
			}

			if (field1411 == 66) {
				int var120 = field1379.method241();
				int var121 = field1379.method241();
				if (field1266 == var120 && field1267 == var121 && field1311 == 2) {
					field1411 = -1;
					return true;
				}

				field1266 = var120;
				field1267 = var121;
				field1203 = (field1266 - 6) * 8;
				field1204 = (field1267 - 6) * 8;
				field1286 = false;
				if ((field1266 / 8 == 48 || field1266 / 8 == 49) && field1267 / 8 == 48) {
					field1286 = true;
				}

				if (field1266 / 8 == 48 && field1267 / 8 == 148) {
					field1286 = true;
				}

				field1311 = 1;
				field1240 = System.currentTimeMillis();
				field1431.method268();
				field1198.method214("Loading - please wait.", 0, 151, 257);
				field1198.method214("Loading - please wait.", 0xFFFFFF, 150, 256);
				field1431.method269(4, field9, 4);
				int var122 = 0;
				for (int var123 = (field1266 - 6) / 8; var123 <= (field1266 + 6) / 8; var123++) {
					for (int var124 = (field1267 - 6) / 8; var124 <= (field1267 + 6) / 8; var124++) {
						var122++;
					}
				}

				field1154 = new byte[var122][];
				field1139 = new byte[var122][];
				field1188 = new int[var122];
				field1189 = new int[var122];
				field1190 = new int[var122];
				int var125 = 0;
				for (int var126 = (field1266 - 6) / 8; var126 <= (field1266 + 6) / 8; var126++) {
					for (int var127 = (field1267 - 6) / 8; var127 <= (field1267 + 6) / 8; var127++) {
						field1188[var125] = (var126 << 8) + var127;

						if (field1286 && (var127 == 49 || var127 == 149 || var127 == 147 || var126 == 50 || var126 == 49 && var127 == 47)) {
							field1189[var125] = -1;
							field1190[var125] = -1;
							var125++;
						} else {
							int var128 = field1189[var125] = field1121.method284(var127, 0, var126);
							if (var128 != -1) {
								field1121.method289(3, var128);
							}

							int var129 = field1190[var125] = field1121.method284(var127, 1, var126);
							if (var129 != -1) {
								field1121.method289(3, var129);
							}

							var125++;
						}
					}
				}

				int var130 = field1203 - field1205;
				int var131 = field1204 - field1206;
				field1205 = field1203;
				field1206 = field1204;

				for (int var132 = 0; var132 < 8192; var132++) {
					class27 var133 = field1354[var132];
					if (var133 != null) {
						for (int var134 = 0; var134 < 10; var134++) {
							var133.field418[var134] -= var130;
							var133.field419[var134] -= var131;
						}

						var133.field369 -= var130 * 128;
						var133.field370 -= var131 * 128;
					}
				}

				for (int var135 = 0; var135 < field1401; var135++) {
					class28 var136 = field1403[var135];
					if (var136 != null) {
						for (int var137 = 0; var137 < 10; var137++) {
							var136.field418[var137] -= var130;
							var136.field419[var137] -= var131;
						}

						var136.field369 -= var130 * 128;
						var136.field370 -= var131 * 128;
					}
				}

				field1091 = true;
				byte var138 = 0;
				byte var139 = 104;
				byte var140 = 1;
				if (var130 < 0) {
					var138 = 103;
					var139 = -1;
					var140 = -1;
				}

				byte var141 = 0;
				byte var142 = 104;
				byte var143 = 1;
				if (var131 < 0) {
					var141 = 103;
					var142 = -1;
					var143 = -1;
				}

				for (int var144 = var138; var144 != var139; var144 += var140) {
					for (int var145 = var141; var145 != var142; var145 += var143) {
						int var146 = var130 + var144;
						int var147 = var131 + var145;
						for (int var148 = 0; var148 < 4; var148++) {
							if (var146 >= 0 && var147 >= 0 && var146 < 104 && var147 < 104) {
								field1183[var148][var144][var145] = field1183[var148][var146][var147];
							} else {
								field1183[var148][var144][var145] = null;
							}
						}
					}
				}

				for (class41 var149 = (class41) field1148.method258(); var149 != null; var149 = (class41) field1148.method260()) {
					var149.field643 -= var130;
					var149.field644 -= var131;
					if (var149.field643 < 0 || var149.field644 < 0 || var149.field643 >= 104 || var149.field644 >= 104) {
						var149.method120();
					}
				}

				if (field1151 != 0) {
					field1151 -= var130;
					field1152 -= var131;
				}

				field1160 = false;
				field1411 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1411 + "," + field1410 + " - " + field1342 + "," + field1343);
			method553();
		} catch (IOException var154) {
			method498();
		} catch (Exception var155) {
			String var151 = "T2 - " + field1411 + "," + field1342 + "," + field1343 + " - " + field1410 + "," + (field1090.field418[0] + field1203) + "," + (field1090.field419[0] + field1204) + " - ";
			for (int var152 = 0; var152 < field1410 && var152 < 50; var152++) {
				var151 = var151 + field1379.field623[var152] + ",";
			}

			signlink.reporterror(var151);
			method553();
		}

		return true;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method468(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.e(II)V")
	public final void method469(int arg0) {
		class4 var2 = class4.field57[arg0];
		for (int var3 = 0; var3 < var2.field79.length && var2.field79[var3] != -1; var3++) {
			class4 var4 = class4.field57[var2.field79[var3]];
			if (var4.field64 == 1) {
				method469(var4.field62);
			}

			var4.field60 = 0;
			var4.field61 = 0;
		}
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void method470(class39 arg0, int arg1) {
		while (arg0.field625 + 21 < arg1 * 8) {
			int var3 = arg0.method250(13);
			if (var3 == 8191) {
				break;
			}

			if (field1354[var3] == null) {
				field1354[var3] = new class27();
			}

			class27 var4 = field1354[var3];
			field1356[field1355++] = var3;
			var4.field414 = field1446;
			var4.field423 = class59.method344(arg0.method250(11));
			var4.field373 = var4.field423.field868;
			var4.field376 = var4.field423.field872;
			var4.field377 = var4.field423.field873;
			var4.field378 = var4.field423.field874;
			var4.field379 = var4.field423.field875;
			var4.field374 = var4.field423.field871;
			int var5 = arg0.method250(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method124(field1090.field418[0] + var5, false, field1090.field419[0] + var6);
			int var7 = arg0.method250(1);
			if (var7 == 1) {
				field1407[field1406++] = var3;
			}
		}

		arg0.method251();
	}

	@ObfuscatedName("client.o(I)V")
	public final void method471() {
		for (int var1 = -1; var1 < field1404; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1402;
			} else {
				var2 = field1405[var1];
			}

			class28 var3 = field1403[var2];
			if (var3 != null) {
				method520(1, var3);
			}
		}

		field1325++;
		if (field1325 > 1406) {
			field1325 = 0;
			field1382.method228(112);
			field1382.method229(0);
			int var4 = field1382.field624;
			field1382.method229(162);
			field1382.method229(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1382.method229(84);
			}

			field1382.method230(31824);
			field1382.method230(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1382.method229(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1382.method229(134);
			}

			field1382.method229(100);
			field1382.method229(94);
			field1382.method230(35521);
			field1382.method238(field1382.field624 - var4);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method472() {
		field1170++;
		method451(true);
		method496(true);
		method451(false);
		method496(false);
		method458();
		method542();

		if (!field1160) {
			int var1 = field1375;
			if (field1386 / 256 > var1) {
				var1 = field1386 / 256;
			}

			if (field1324[4] && field1074[4] + 128 > var1) {
				var1 = field1074[4] + 128;
			}

			int var2 = field1376 + field1242 & 0x7FF;
			method533(method484(field1090.field370, field1078, field1090.field369) - 50, var1 * 3 + 600, var2, field1336, field1335, var1);
			field1196++;
			if (field1196 > 1802) {
				field1196 = 0;
				field1382.method228(223);
				field1382.method229(0);
				int var3 = field1382.field624;
				field1382.method230(29711);
				field1382.method229(70);
				field1382.method229((int) (Math.random() * 256.0D));
				field1382.method229(242);
				field1382.method229(186);
				field1382.method229(39);
				field1382.method229(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1382.method229(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1382.method230(57856);
				}

				field1382.method230((int) (Math.random() * 65536.0D));
				field1382.method238(field1382.field624 - var3);
			}
		}

		int var4;
		if (field1160) {
			var4 = method463();
		} else {
			var4 = method462();
		}

		int var5 = field1143;
		int var6 = field1144;
		int var7 = field1145;
		int var8 = field1146;
		int var9 = field1147;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1324[var10]) {
				int var11 = (int) (Math.random() * (field1219[var10] * 2 + 1) + Math.sin(field1400[var10] / 100.0D * field1132[var10]) * field1074[var10] - field1219[var10]);
				if (var10 == 0) {
					field1143 += var11;
				}

				if (var10 == 1) {
					field1144 += var11;
				}

				if (var10 == 2) {
					field1145 += var11;
				}

				if (var10 == 3) {
					field1147 = field1147 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1146 += var11;
					if (field1146 < 128) {
						field1146 = 128;
					}

					if (field1146 > 383) {
						field1146 = 383;
					}
				}
			}
		}

		int var12 = class35.field594;
		class32.field546 = true;
		class32.field549 = 0;
		class32.field547 = field17 - 4;
		class32.field548 = field18 - 4;
		class34.method168();
		field1249.method103(field1145, field1146, field1147, field1144, field1143, var4);
		field1249.method78();
		method518();
		method453();
		method509(var12);
		method558();
		field1431.method269(4, field9, 4);
		field1143 = var5;
		field1144 = var6;
		field1145 = var7;
		field1146 = var8;
		field1147 = var9;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method473() {
		field1158 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1069[var1] = -1;
			for (int var2 = 0; var2 < class64.field958; var2++) {
				if (!class64.field959[var2].field965 && class64.field959[var2].field960 == var1 + (field1155 ? 0 : 7)) {
					field1069[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method474(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	public final void run() {
		if (field1230) {
			method538();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method475() {
		int var1 = field1320;
		int var2 = field1321;
		int var3 = field1322;
		int var4 = field1323;
		int var5 = 0x5D5447;
		class34.method170(var3, var1, var2, var4, var5);
		class34.method170(var3 - 2, var1 + 1, var2 + 1, 16, 0);
		class34.method171(var4 - 19, var2 + 18, var3 - 2, 0, var1 + 1);
		field1199.method217(var2 + 14, var1 + 3, "Choose Option", var5);
		int var6 = field17;
		int var7 = field18;
		if (field1319 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1319 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1319 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1314; var8++) {
			int var9 = (field1314 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1199.method219(field1066[var8], var9, var1 + 3, true, var10);
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method476() {
		method493();
		field1057.method268();
		field1141.method212(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1241 == 0) {
			int var3 = var2 / 2 + 80;
			field1197.method215(var3, var1 / 2, true, field1121.field735, 0x75A9A9);
			int var4 = var2 / 2 - 20;
			field1199.method215(var4, var1 / 2, true, "Welcome to RuneScape", 0xFFFF00);
			var4 += 30;
			int var5 = var1 / 2 - 80;
			int var6 = var2 / 2 + 20;
			field1142.method212(var6 - 20, var5 - 73);
			field1199.method215(var6 + 5, var5, true, "New user", 0xFFFFFF);
			int var7 = var1 / 2 + 80;
			field1142.method212(var6 - 20, var7 - 73);
			field1199.method215(var6 + 5, var7, true, "Existing User", 0xFFFFFF);
		}

		if (field1241 == 2) {
			int var8 = var2 / 2 - 40;
			if (field1176.length() > 0) {
				field1199.method215(var8 - 15, var1 / 2, true, field1176, 0xFFFF00);
				field1199.method215(var8, var1 / 2, true, field1177, 0xFFFF00);
				var8 += 30;
			} else {
				field1199.method215(var8 - 7, var1 / 2, true, field1177, 0xFFFF00);
				var8 += 30;
			}

			field1199.method219("Username: " + field1444 + (field1339 == 0 & field1446 % 40 < 20 ? "@yel@|" : ""), var8, var1 / 2 - 90, true, 0xFFFFFF);
			var8 += 15;
			field1199.method219("Password: " + class52.method316(field1445) + (field1339 == 1 & field1446 % 40 < 20 ? "@yel@|" : ""), var8, var1 / 2 - 88, true, 0xFFFFFF);
			var8 += 15;
			int var9 = var1 / 2 - 80;
			int var10 = var2 / 2 + 50;
			field1142.method212(var10 - 20, var9 - 73);
			field1199.method215(var10 + 5, var9, true, "Login", 0xFFFFFF);
			int var11 = var1 / 2 + 80;
			field1142.method212(var10 - 20, var11 - 73);
			field1199.method215(var10 + 5, var11, true, "Cancel", 0xFFFFFF);
		}

		if (field1241 == 3) {
			field1199.method215(var2 / 2 - 60, var1 / 2, true, "Create a free account", 0xFFFF00);
			int var12 = var2 / 2 - 35;
			field1199.method215(var12, var1 / 2, true, "To create a new account you need to", 0xFFFFFF);
			var12 += 15;
			field1199.method215(var12, var1 / 2, true, "go back to the main RuneScape webpage", 0xFFFFFF);
			var12 += 15;
			field1199.method215(var12, var1 / 2, true, "and choose the red 'create account'", 0xFFFFFF);
			var12 += 15;
			field1199.method215(var12, var1 / 2, true, "button at the top right of that page.", 0xFFFFFF);
			var12 += 15;
			int var13 = var1 / 2;
			int var14 = var2 / 2 + 50;
			field1142.method212(var14 - 20, var13 - 73);
			field1199.method215(var14 + 5, var13, true, "Cancel", 0xFFFFFF);
		}

		field1057.method269(171, field9, 202);

		if (field1363) {
			field1363 = false;
			field1055.method269(0, field9, 128);
			field1056.method269(371, field9, 202);
			field1060.method269(265, field9, 0);
			field1061.method269(265, field9, 562);
			field1062.method269(171, field9, 128);
			field1063.method269(171, field9, 562);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method477() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1250[0] != -1) {
				field1337 = true;
				field1085 = 0;
				field1193 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1250[1] != -1) {
				field1337 = true;
				field1085 = 1;
				field1193 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1250[2] != -1) {
				field1337 = true;
				field1085 = 2;
				field1193 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1250[3] != -1) {
				field1337 = true;
				field1085 = 3;
				field1193 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1250[4] != -1) {
				field1337 = true;
				field1085 = 4;
				field1193 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1250[5] != -1) {
				field1337 = true;
				field1085 = 5;
				field1193 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1250[6] != -1) {
				field1337 = true;
				field1085 = 6;
				field1193 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1250[7] != -1) {
				field1337 = true;
				field1085 = 7;
				field1193 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1250[8] != -1) {
				field1337 = true;
				field1085 = 8;
				field1193 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1250[9] != -1) {
				field1337 = true;
				field1085 = 9;
				field1193 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1250[10] != -1) {
				field1337 = true;
				field1085 = 10;
				field1193 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1250[11] != -1) {
				field1337 = true;
				field1085 = 11;
				field1193 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1250[12] != -1) {
				field1337 = true;
				field1085 = 12;
				field1193 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1250[13] != -1) {
				field1337 = true;
				field1085 = 13;
				field1193 = true;
			}

			field1268++;
			if (field1268 > 150) {
				field1268 = 0;
				field1382.method228(136);
				field1382.method229(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(BLd;I)I")
	public final int method478(class4 arg0, int arg1) {
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
					var4 += field1315[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1359[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1281[var3[var5++]];
				}

				if (var6 == 4) {
					class4 var7 = class4.field57[var3[var5++]];
					int var8 = var3[var5++];
					if (var8 >= 0 && var8 < class60.field891 && (!class60.method350(var8).field912 || field1083)) {
						for (int var9 = 0; var9 < var7.field58.length; var9++) {
							if (var8 + 1 == var7.field58[var9]) {
								var4 += var7.field59[var9];
							}
						}
					}
				}

				if (var6 == 5) {
					var4 += field1287[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1351[field1359[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1287[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1090.field430;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < class67.field994; var10++) {
						if (class67.field996[var10]) {
							var4 += field1359[var10];
						}
					}
				}

				if (var6 == 10) {
					class4 var11 = class4.field57[var3[var5++]];
					int var12 = var3[var5++] + 1;
					if (var12 >= 0 && var12 < class60.field891 && (!class60.method350(var12).field912 || field1083)) {
						for (int var13 = 0; var13 < var11.field58.length; var13++) {
							if (var11.field58[var13] == var12) {
								var4 += 999999999;
								break;
							}
						}
					}
				}

				if (var6 == 11) {
					var4 += field1425;
				}

				if (var6 == 12) {
					var4 += field1040;
				}

				if (var6 == 13) {
					int var14 = field1287[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}

				if (var6 == 14) {
					int var16 = var3[var5++];
					class69 var17 = class69.field1012[var16];
					int var18 = var17.field1014;
					int var19 = var17.field1015;
					int var20 = var17.field1016;
					int var21 = field1138[var20 - var19];
					var4 += field1287[var18] >> var19 & var21;
				}
			}
		} catch (Exception var22) {
			return -1;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method479() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1442[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1442[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1443[var10] = (field1442[var10 - 1] + field1442[var10 + 1] + field1442[var10 - 128] + field1442[var10 + 128]) / 4;
			}
		}

		field1159 += 128;
		if (field1159 > field1316.length) {
			field1159 -= field1316.length;
			int var11 = (int) (Math.random() * 12.0D);
			method541(field1447[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1443[var14 + 128] - field1316[field1159 + var14 & field1316.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1442[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1133[var16] = field1133[var16 + 1];
		}

		field1133[var1 - 1] = (int) (Math.sin(field1446 / 14.0D) * 16.0D + Math.sin(field1446 / 15.0D) * 14.0D + Math.sin(field1446 / 16.0D) * 12.0D);

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

	@ObfuscatedName("client.h(Z)V")
	public final void method480() {
		if (field1357 != 0) {
			int var1 = 0;
			if (field1105 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1098[var2] != null) {
					int var3 = field1096[var2];
					String var4 = field1097[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1448 == 0 || field1448 == 1 && method559(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1198.method216("From:  " + var4 + field1098[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1229 >= 1) {
									field1066[field1314] = "Report abuse @whi@" + var4;
									field1173[field1314] = 2034;
									field1314++;
								}

								field1066[field1314] = "Add ignore @whi@" + var4;
								field1173[field1314] = 2436;
								field1314++;
								field1066[field1314] = "Add friend @whi@" + var4;
								field1173[field1314] = 2406;
								field1314++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1448 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;I)Lyb;")
	public final class51 method481(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1195[0] != null) {
				var6 = field1195[0].method301(arg1);
			}
		} catch (Exception var28) {
		}

		if (var6 != null) {
			field1192.reset();
			field1192.update(var6);
			int var8 = (int) field1192.getValue();
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
			method13("Requesting " + arg3, arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method474(arg0 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class39 var16 = new class39(var15);
				var16.field624 = 3;
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
						method13("Loading " + arg3 + " - " + var22 + "%", arg4);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1195[0] != null) {
						field1195[0].method302(var6, arg1, var6.length);
					}
				} catch (Exception var27) {
					field1195[0] = null;
				}

				if (var6 != null) {
					field1192.reset();
					field1192.update(var6);
					int var23 = (int) field1192.getValue();
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

	@ObfuscatedName("client.i(Z)V")
	public final void method482() {
		if (field1105 > 1) {
			field1105--;
		}

		if (field1414 > 0) {
			field1414--;
		}

		if (field1256 > 0) {
			field1256 -= 2;
		}

		for (int var1 = 0; var1 < 5 && method467(); var1++) {
		}

		if (field1075) {
			method442();
			method465();
			method439();
			class39 var2 = class6.method46();
			if (var2 != null) {
				field1382.method228(19);
				field1382.method230(var2.field624);
				field1382.method237(var2.field624, var2.field623, 0);
				var2.method227();
			}

			field1412++;
			if (field1412 > 750) {
				method498();
			}

			method471();
			method519();
			method434();
			field1167++;

			if (field1441 != 0) {
				field1440 += 20;
				if (field1440 >= 400) {
					field1441 = 0;
				}
			}

			if (field1103 != 0) {
				field1100++;
				if (field1100 >= 15) {
					if (field1103 == 2) {
						field1337 = true;
					}

					if (field1103 == 3) {
						field1129 = true;
					}

					field1103 = 0;
				}
			}

			if (field1226 != 0) {
				field1278++;

				if (field17 > field1227 + 5 || field17 < field1227 - 5 || field18 > field1228 + 5 || field18 < field1228 - 5) {
					field1246 = true;
				}

				if (field16 == 0) {
					if (field1226 == 2) {
						field1337 = true;
					}

					if (field1226 == 3) {
						field1129 = true;
					}

					field1226 = 0;

					if (field1246 && field1278 >= 5) {
						field1115 = -1;
						method444();

						if (field1224 == field1115 && field1225 != field1114) {
							class4 var3 = class4.field57[field1224];
							byte var4 = 0;
							if (field1275 == 1 && var3.field66 == 206) {
								var4 = 1;
							}

							if (var3.field58[field1114] <= 0) {
								var4 = 0;
							}

							if (var3.field87) {
								int var5 = field1225;
								int var6 = field1114;
								var3.field58[var6] = var3.field58[var5];
								var3.field59[var6] = var3.field59[var5];
								var3.field58[var5] = -1;
								var3.field59[var5] = 0;
							} else if (var4 == 1) {
								int var7 = field1225;
								int var8 = field1114;
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
								var3.method33(field1114, field1225);
							}

							field1382.method228(7);
							field1382.method230(field1224);
							field1382.method230(field1225);
							field1382.method230(field1114);
							field1382.method229(var4);
						}
					} else if ((field1415 == 1 || method454(field1314 - 1)) && field1314 > 2) {
						method534();
					} else if (field1314 > 0) {
						method548(field1314 - 1);
					}

					field1100 = 10;
					field23 = 0;
				}
			}

			field1149++;
			if (field1149 > 127) {
				field1149 = 0;
				field1382.method228(181);
				field1382.method232(0x4C2B2C);
			}

			if (class19.field301 != -1) {
				int var9 = class19.field301;
				int var10 = class19.field302;
				boolean var11 = method499(true, 0, 0, var9, 0, 0, field1090.field418[0], 0, var10, 0, field1090.field419[0]);
				class19.field301 = -1;

				if (var11) {
					field1438 = field24;
					field1439 = field25;
					field1441 = 1;
					field1440 = 0;
				}
			}

			if (field23 == 1 && field1260 != null) {
				field1260 = null;
				field1129 = true;
				field23 = 0;
			}

			method500();
			method529();
			method477();
			method460();

			if (field16 == 1 || field23 == 1) {
				field1076++;
			}

			if (field1311 == 2) {
				method456();
			}

			if (field1311 == 2 && field1160) {
				method551();
			}

			for (int var12 = 0; var12 < 5; var12++) {
				field1132[var12]++;
			}

			method508();
			field15++;
			if (field15 > 4500) {
				field1414 = 250;
				field15 -= 500;
				field1382.method228(102);
			}

			field1384++;
			if (field1384 > 500) {
				field1384 = 0;
				int var13 = (int) (Math.random() * 8.0D);
				if ((var13 & 0x1) == 1) {
					field1435 += field1436;
				}

				if ((var13 & 0x2) == 2) {
					field1072 += field1073;
				}

				if ((var13 & 0x4) == 4) {
					field1242 += field1243;
				}
			}

			if (field1435 < -50) {
				field1436 = 2;
			}

			if (field1435 > 50) {
				field1436 = -2;
			}

			if (field1072 < -55) {
				field1073 = 2;
			}

			if (field1072 > 55) {
				field1073 = -2;
			}

			if (field1242 < -40) {
				field1243 = 1;
			}

			if (field1242 > 40) {
				field1243 = -1;
			}

			field1362++;
			if (field1362 > 500) {
				field1362 = 0;
				int var14 = (int) (Math.random() * 8.0D);
				if ((var14 & 0x1) == 1) {
					field1390 += field1391;
				}

				if ((var14 & 0x2) == 2) {
					field1308 += field1309;
				}
			}

			if (field1390 < -60) {
				field1391 = 2;
			}

			if (field1390 > 60) {
				field1391 = -2;
			}

			if (field1308 < -20) {
				field1309 = 1;
			}

			if (field1308 > 10) {
				field1309 = -1;
			}

			field1264++;
			if (field1264 > 110) {
				field1264 = 0;
				field1382.method228(94);
				field1382.method233(0);
			}

			field1413++;
			if (field1413 > 50) {
				field1382.method228(206);
			}

			try {
				if (field1318 != null && field1382.field624 > 0) {
					field1318.method42(0, field1382.field623, field1382.field624);
					field1382.field624 = 0;
					field1413 = 0;
				}
			} catch (IOException var16) {
				method498();
			} catch (Exception var17) {
				method553();
			}
		}
	}

	@ObfuscatedName("client.m(B)Ljava/lang/String;")
	public final String method483() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method484(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field1184[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field1178[var6][var4][var5] + field1178[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1178[var6][var4][var5 + 1] + field1178[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method485(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1079; var3++) {
				if (field1150[var3] == arg0) {
					field1079--;
					field1337 = true;

					for (int var4 = var3; var4 < field1079; var4++) {
						field1150[var4] = field1150[var4 + 1];
					}

					field1382.method228(4);
					field1382.method235(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public static final void method486() {
		class19.field267 = false;
		class35.field574 = false;
		field1084 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method487(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(ZLd;)V")
	public final void method488(class4 arg0) {
		int var2 = arg0.field66;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 > 700) {
				var2 -= 601;
			} else {
				var2--;
			}

			if (var2 >= field1207) {
				arg0.field98 = "";
				arg0.field65 = 0;
			} else {
				arg0.field98 = field1140[var2];
				arg0.field65 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= field1207) {
				arg0.field98 = "";
				arg0.field65 = 0;
			} else {
				if (field1374[var2] == 0) {
					arg0.field98 = "@red@Offline";
				} else if (field1374[var2] == field1081) {
					arg0.field98 = "@gre@World-" + (field1374[var2] - 9);
				} else {
					arg0.field98 = "@yel@World-" + (field1374[var2] - 9);
				}

				arg0.field65 = 1;
			}
		} else if (var2 == 203) {
			arg0.field76 = field1207 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1079) {
				arg0.field98 = "";
				arg0.field65 = 0;
			} else {
				arg0.field98 = class52.method314(class52.method311(field1150[var2]));
				arg0.field65 = 1;
			}
		} else if (var2 == 503) {
			arg0.field76 = field1079 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 == 327) {
			arg0.field113 = 150;
			arg0.field114 = (int) (Math.sin(field1446 / 40.0D) * 256.0D) & 0x7FF;

			if (field1158) {
				for (int var3 = 0; var3 < 7; var3++) {
					int var4 = field1069[var3];
					if (var4 >= 0 && !class64.field959[var4].method379()) {
						return;
					}
				}

				field1158 = false;
				class32[] var5 = new class32[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1069[var7];
					if (var8 >= 0) {
						var5[var6++] = class64.field959[var8].method380();
					}
				}

				class32 var9 = new class32(var6, var5);
				for (int var10 = 0; var10 < 5; var10++) {
					if (field1372[var10] != 0) {
						var9.method153(field1257[var10][0], field1257[var10][field1372[var10]]);

						if (var10 == 1) {
							var9.method153(field1368[0], field1368[field1372[var10]]);
						}
					}
				}

				var9.method146();
				var9.method147(class66.field979[field1090.field374].field981[0]);
				var9.method156(64, 850, -30, -50, -30, true);
				arg0.field106 = 5;
				arg0.field107 = 0;
				class4.method36(0, 5, var9);
			}
		} else if (var2 == 324) {
			if (field1161 == null) {
				field1161 = arg0.field104;
				field1162 = arg0.field105;
			}

			if (field1155) {
				arg0.field104 = field1162;
			} else {
				arg0.field104 = field1161;
			}
		} else if (var2 == 325) {
			if (field1161 == null) {
				field1161 = arg0.field104;
				field1162 = arg0.field105;
			}

			if (field1155) {
				arg0.field104 = field1161;
			} else {
				arg0.field104 = field1162;
			}
		} else if (var2 == 600) {
			arg0.field98 = field1156;
			if (field1446 % 20 < 10) {
				arg0.field98 = arg0.field98 + "|";
			} else {
				arg0.field98 = arg0.field98 + " ";
			}
		} else if (var2 == 613) {
			if (field1229 < 1) {
				arg0.field98 = "";
			} else if (field1274) {
				arg0.field100 = 0xFF0000;
				arg0.field98 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field100 = 0xFFFFFF;
				arg0.field98 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1373 == 0) {
				arg0.field98 = "";
			} else {
				String var11;
				if (field1428 == 0) {
					var11 = "earlier today";
				} else if (field1428 == 1) {
					var11 = "yesterday";
				} else {
					var11 = field1428 + " days ago";
				}

				arg0.field98 = "You last logged in " + var11 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1169 == 0) {
				arg0.field98 = "0 unread messages";
				arg0.field100 = 0xFFFF00;
			}

			if (field1169 == 1) {
				arg0.field98 = "1 unread message";
				arg0.field100 = 0xFF00;
			}

			if (field1169 > 1) {
				arg0.field98 = field1169 + " unread messages";
				arg0.field100 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1039 == 201) {
				if (field1070 == 1) {
					arg0.field98 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field98 = "";
				}
			} else if (field1039 == 200) {
				arg0.field98 = "You have not yet set any password recovery questions.";
			} else {
				String var12;
				if (field1039 == 0) {
					var12 = "Earlier today";
				} else if (field1039 == 1) {
					var12 = "Yesterday";
				} else {
					var12 = field1039 + " days ago";
				}

				arg0.field98 = var12 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1039 == 201) {
				if (field1070 == 1) {
					arg0.field98 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field98 = "";
				}
			} else if (field1039 == 200) {
				arg0.field98 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field98 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1039 == 201) {
				if (field1070 == 1) {
					arg0.field98 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field98 = "";
				}
			} else if (field1039 == 200) {
				arg0.field98 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field98 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(BIIILbb;)V")
	public final void method489(int arg0, int arg1, int arg2, class28 arg3) {
		if (field1090 != arg3 && field1314 < 400) {
			String var5 = arg3.field424 + method487(arg3.field430, field1090.field430) + " (level-" + arg3.field430 + ")";
			if (field1124 == 1) {
				field1066[field1314] = "Use " + field1128 + " with @whi@" + var5;
				field1173[field1314] = 367;
				field1174[field1314] = arg0;
				field1171[field1314] = arg1;
				field1172[field1314] = arg2;
				field1314++;
			} else if (field1364 != 1) {
				field1066[field1314] = "Follow @whi@" + var5;
				field1173[field1314] = 1544;
				field1174[field1314] = arg0;
				field1171[field1314] = arg1;
				field1172[field1314] = arg2;
				field1314++;
				if (field1353 == 0) {
					field1066[field1314] = "Trade with @whi@" + var5;
					field1173[field1314] = 1373;
					field1174[field1314] = arg0;
					field1171[field1314] = arg1;
					field1172[field1314] = arg2;
					field1314++;
				}

				if (field1099 > 0) {
					field1066[field1314] = "Attack @whi@" + var5;

					if (field1090.field430 >= arg3.field430) {
						field1173[field1314] = 151;
					} else {
						field1173[field1314] = 2151;
					}

					field1174[field1314] = arg0;
					field1171[field1314] = arg1;
					field1172[field1314] = arg2;
					field1314++;
				}

				if (field1134 == 1) {
					field1066[field1314] = "Fight @whi@" + var5;
					field1173[field1314] = 151;
					field1174[field1314] = arg0;
					field1171[field1314] = arg1;
					field1172[field1314] = arg2;
					field1314++;
				}

				if (field1134 == 2) {
					field1066[field1314] = "Duel-with @whi@" + var5;
					field1173[field1314] = 1101;
					field1174[field1314] = arg0;
					field1171[field1314] = arg1;
					field1172[field1314] = arg2;
					field1314++;
				}
			} else if ((field1366 & 0x8) == 8) {
				field1066[field1314] = field1367 + " @whi@" + var5;
				field1173[field1314] = 651;
				field1174[field1314] = arg0;
				field1171[field1314] = arg1;
				field1172[field1314] = arg2;
				field1314++;
			}

			for (int var6 = 0; var6 < field1314; var6++) {
				if (field1173[var6] == 660) {
					field1066[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method490() {
		byte[] var1 = field1380.method309("title.dat", null);
		class36 var2 = new class36(var1, this);
		field1058.method268();
		var2.method197(0, 0);
		field1059.method268();
		var2.method197(-637, 0);
		field1055.method268();
		var2.method197(-128, 0);
		field1056.method268();
		var2.method197(-202, -371);
		field1057.method268();
		var2.method197(-202, -171);
		field1060.method268();
		var2.method197(0, -265);
		field1061.method268();
		var2.method197(-562, -265);
		field1062.method268();
		var2.method197(-128, -171);
		field1063.method268();
		var2.method197(-562, -171);
		int[] var3 = new int[var2.field598];
		for (int var4 = 0; var4 < var2.field599; var4++) {
			for (int var5 = 0; var5 < var2.field598; var5++) {
				var3[var5] = var2.field597[var2.field598 * var4 + var2.field598 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field598; var6++) {
				var2.field597[var2.field598 * var4 + var6] = var3[var6];
			}
		}

		field1058.method268();
		var2.method197(382, 0);
		field1059.method268();
		var2.method197(-255, 0);
		field1055.method268();
		var2.method197(254, 0);
		field1056.method268();
		var2.method197(180, -371);
		field1057.method268();
		var2.method197(180, -171);
		field1060.method268();
		var2.method197(382, -265);
		field1061.method268();
		var2.method197(-180, -265);
		field1062.method268();
		var2.method197(254, -171);
		field1063.method268();
		var2.method197(-180, -171);
		class36 var7 = new class36(field1380, "logo", 0);
		field1055.method268();
		var7.method199(18, 382 - var7.field598 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method491(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method492() {
		while (true) {
			class40 var1 = field1121.method291();
			if (var1 == null) {
				return;
			}

			if (var1.field636 == 0) {
				class32.method137(var1.field637, var1.field638);

				if ((field1121.method287(var1.field637) & 0x62) != 0) {
					field1337 = true;

					if (field1389 != -1) {
						field1129 = true;
					}
				}
			}

			if (var1.field636 == 1 && var1.field638 != null) {
				class8.method59(var1.field638);
			}

			if (var1.field636 == 2 && field1422 == var1.field637 && var1.field638 != null) {
				method466(field1423, var1.field638);
			}

			if (var1.field636 == 3 && field1311 == 1) {
				for (int var2 = 0; var2 < field1154.length; var2++) {
					if (field1189[var2] == var1.field637) {
						field1154[var2] = var1.field638;

						if (var1.field638 == null) {
							field1189[var2] = -1;
						}

						break;
					}

					if (field1190[var2] == var1.field637) {
						field1139[var2] = var1.field638;

						if (var1.field638 == null) {
							field1190[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field636 == 93 && field1121.method286(var1.field637)) {
				class3.method17(new class39(var1.field638), field1121);
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method493() {
		if (field1055 == null) {
			field10 = null;
			field1432 = null;
			field1430 = null;
			field1429 = null;
			field1431 = null;
			field1300 = null;
			field1301 = null;
			field1302 = null;
			field1058 = new class44(265, method11(), 128);
			class34.method168();
			field1059 = new class44(265, method11(), 128);
			class34.method168();
			field1055 = new class44(171, method11(), 509);
			class34.method168();
			field1056 = new class44(132, method11(), 360);
			class34.method168();
			field1057 = new class44(200, method11(), 360);
			class34.method168();
			field1060 = new class44(238, method11(), 202);
			class34.method168();
			field1061 = new class44(238, method11(), 203);
			class34.method168();
			field1062 = new class44(94, method11(), 74);
			class34.method168();
			field1063 = new class44(94, method11(), 75);
			class34.method168();

			if (field1380 != null) {
				method490();
				method547();
			}

			field1363 = true;
		}
	}

	@ObfuscatedName("client.b(ZII)V")
	public final void method494(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method10() {
		field1363 = true;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method495(int arg0, int arg1) {
		class42 var3 = field1183[field1078][arg0][arg1];
		if (var3 == null) {
			field1249.method85(field1078, arg0, arg1);
		} else {
			int var4 = -99999999;
			class30 var5 = null;
			for (class30 var6 = (class30) var3.method258(); var6 != null; var6 = (class30) var3.method260()) {
				class60 var7 = class60.method350(var6.field456);
				int var8 = var7.field911;
				if (var7.field910) {
					var8 = (var6.field457 + 1) * var8;
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
				if (var5.field456 != var11.field456 && var9 == null) {
					var9 = var11;
				}

				if (var5.field456 != var11.field456 && var9.field456 != var11.field456 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1249.method71(arg1, arg0, var10, var9, field1078, var12, var5, method484(arg1 * 128 + 64, field1078, arg0 * 128 + 64));
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method496(boolean arg0) {
		for (int var2 = 0; var2 < field1355; var2++) {
			class27 var3 = field1354[field1356[var2]];
			int var4 = (field1356[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method127() && var3.field423.field886 == arg0) {
				int var5 = var3.field369 >> 7;
				int var6 = var3.field370 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field373 == 1 && (var3.field369 & 0x7F) == 0x40 && (var3.field370 & 0x7F) == 0x40) {
						if (field1131[var5][var6] == field1170) {
							continue;
						}

						field1131[var5][var6] = field1170;
					}

					field1249.method75(var3, method484(var3.field370, field1078, var3.field369), var3.field371, var4, var3.field372, field1078, var3.field370, (var3.field373 - 1) * 64 + 60, var3.field369);
				}
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method497() {
		if (field1432 == null) {
			method545();
			field10 = null;
			field1055 = null;
			field1056 = null;
			field1057 = null;
			field1058 = null;
			field1059 = null;
			field1060 = null;
			field1061 = null;
			field1062 = null;
			field1063 = null;
			field1432 = new class44(96, method11(), 479);
			field1430 = new class44(156, method11(), 172);
			class34.method168();
			field1253.method212(0, 0);
			field1429 = new class44(261, method11(), 190);
			field1431 = new class44(334, method11(), 512);
			class34.method168();
			field1300 = new class44(50, method11(), 496);
			field1301 = new class44(37, method11(), 269);
			field1302 = new class44(45, method11(), 249);
			field1363 = true;
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method498() {
		if (field1414 > 0) {
			method553();
		} else {
			field1431.method268();
			field1198.method214("Connection lost", 0, 144, 257);
			field1198.method214("Connection lost", 0xFFFFFF, 143, 256);
			field1198.method214("Please wait - attempting to reestablish", 0, 159, 257);
			field1198.method214("Please wait - attempting to reestablish", 0xFFFFFF, 158, 256);
			field1431.method269(4, field9, 4);
			field1151 = 0;
			class5 var1 = field1318;
			field1075 = false;
			method440(field1444, field1445, true);

			if (!field1075) {
				method553();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIIIIIZ)Z")
	public final boolean method499(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1328[var14][var15] = 0;
				field1383[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg10;
		field1328[arg6][arg10] = 99;
		field1383[arg6][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1064[var18] = arg6;
		int var35 = var18 + 1;
		field1065[var18] = arg10;
		boolean var20 = false;
		int var21 = field1064.length;
		int[][] var22 = field1067[field1078].field944;
		while (var35 != var19) {
			var16 = field1064[var19];
			var17 = field1065[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field1067[field1078].method370(arg3, var16, arg2 - 1, arg7, arg8, var17)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field1067[field1078].method371(arg3, var16, arg8, arg7, arg2 - 1, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg1 != 0 && arg9 != 0 && field1067[field1078].method372(arg8, arg4, arg9, var17, var16, arg1, arg3)) {
				var20 = true;
				break;
			}

			int var23 = field1383[var16][var17] + 1;
			if (var16 > 0 && field1328[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1064[var35] = var16 - 1;
				field1065[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1328[var16 - 1][var17] = 2;
				field1383[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1328[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1064[var35] = var16 + 1;
				field1065[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1328[var16 + 1][var17] = 8;
				field1383[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1328[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1064[var35] = var16;
				field1065[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1328[var16][var17 - 1] = 1;
				field1383[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1328[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1064[var35] = var16;
				field1065[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1328[var16][var17 + 1] = 4;
				field1383[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1328[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1064[var35] = var16 - 1;
				field1065[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1328[var16 - 1][var17 - 1] = 3;
				field1383[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1328[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1064[var35] = var16 + 1;
				field1065[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1328[var16 + 1][var17 - 1] = 9;
				field1383[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1328[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1064[var35] = var16 - 1;
				field1065[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1328[var16 - 1][var17 + 1] = 6;
				field1383[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1328[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1064[var35] = var16 + 1;
				field1065[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1328[var16 + 1][var17 + 1] = 12;
				field1383[var16 + 1][var17 + 1] = var23;
			}
		}

		field1087 = 0;
		if (!var20) {
			if (arg0) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg8 - var25; var27 <= arg8 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1383[var26][var27] < var24) {
								var24 = field1383[var26][var27];
								var16 = var26;
								var17 = var27;
								field1087 = 1;
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
		field1064[var28] = var16;
		int var36 = var28 + 1;
		field1065[var28] = var17;
		int var29;
		int var30 = var29 = field1328[var16][var17];
		while (arg6 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1064[var36] = var16;
				field1065[var36++] = var17;
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

			var30 = field1328[var16][var17];
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
		int var32 = field1064[var36];
		int var33 = field1065[var36];

		if (arg5 == 0) {
			field1382.method228(182);
			field1382.method229(var31 + var31 + 3);
		}

		if (arg5 == 1) {
			field1382.method228(198);
			field1382.method229(var31 + var31 + 3 + 14);
		}

		if (arg5 == 2) {
			field1382.method228(216);
			field1382.method229(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1382.method229(1);
		} else {
			field1382.method229(0);
		}

		field1382.method230(field1203 + var32);
		field1382.method230(field1204 + var33);
		field1151 = field1064[0];
		field1152 = field1065[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1382.method229(field1064[var36] - var32);
			field1382.method229(field1065[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.p(B)V")
	public final void method500() {
		if (field1226 == 0) {
			int var1 = field23;
			if (field1364 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1201) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1319 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1319 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1319 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1320 - 10 || var2 > field1322 + field1320 + 10 || var3 < field1321 - 10 || var3 > field1323 + field1321 + 10) {
						field1201 = false;

						if (field1319 == 1) {
							field1337 = true;
						}

						if (field1319 == 2) {
							field1129 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1320;
					int var5 = field1321;
					int var6 = field1322;
					int var7 = field24;
					int var8 = field25;
					if (field1319 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1319 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1319 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1314; var10++) {
						int var11 = (field1314 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method548(var9);
					}

					field1201 = false;

					if (field1319 == 1) {
						field1337 = true;
					}

					if (field1319 == 2) {
						field1129 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1314 > 0) {
					int var12 = field1173[field1314 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188 || var12 == 1773) {
						int var13 = field1171[field1314 - 1];
						int var14 = field1172[field1314 - 1];
						class4 var15 = class4.field57[var14];
						if (var15.field84 || var15.field87) {
							field1246 = false;
							field1278 = 0;
							field1224 = var14;
							field1225 = var13;
							field1226 = 2;
							field1227 = field24;
							field1228 = field25;

							if (class4.field57[var14].field63 == field1111) {
								field1226 = 1;
							}

							if (class4.field57[var14].field63 == field1389) {
								field1226 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1415 == 1 || method454(field1314 - 1)) && field1314 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1314 > 0) {
					method548(field1314 - 1);
				}

				if (var1 != 2 || field1314 <= 0) {
					return;
				}

				method534();
			}
		}
	}

	@ObfuscatedName("client.b(JB)V")
	public final void method501(long arg0) {
		if (arg0 != 0L) {
			if (field1207 >= 100 && field1360 != 1) {
				method544(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field1207 >= 200) {
				method544(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = class52.method314(class52.method311(arg0));
				for (int var4 = 0; var4 < field1207; var4++) {
					if (field1168[var4] == arg0) {
						method544(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1079; var5++) {
					if (field1150[var5] == arg0) {
						method544(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1090.field424)) {
					field1140[field1207] = var3;
					field1168[field1207] = arg0;
					field1374[field1207] = 0;
					field1207++;
					field1337 = true;
					field1382.method228(116);
					field1382.method235(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZLd;)Z")
	public final boolean method502(class4 arg0) {
		int var2 = arg0.field66;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1066[field1314] = "Remove @whi@" + arg0.field98;
				field1173[field1314] = 556;
				field1314++;
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

		field1066[field1314] = "Remove @whi@" + field1140[var2];
		field1173[field1314] = 557;
		field1314++;
		field1066[field1314] = "Message @whi@" + field1140[var2];
		field1173[field1314] = 679;
		field1314++;
		return true;
	}

	@ObfuscatedName("client.a(ZLd;III)V")
	public final void method503(class4 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field64 == 0 && arg0.field79 != null && (!arg0.field78 || field1068 == arg0.field62 || field1077 == arg0.field62 || field1222 == arg0.field62)) {
			int var5 = class34.field569;
			int var6 = class34.field567;
			int var7 = class34.field570;
			int var8 = class34.field568;
			class34.method167(arg2, arg0.field67 + arg2, arg0.field68 + arg3, arg3);
			int var9 = arg0.field79.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field80[var10] + arg2;
				int var12 = arg0.field81[var10] + arg3 - arg1;
				class4 var13 = class4.field57[arg0.field79[var10]];
				var11 += var13.field70;
				var12 += var13.field71;

				if (var13.field66 > 0) {
					method488(var13);
				}

				if (var13.field64 == 0) {
					if (var13.field77 > var13.field76 - var13.field68) {
						var13.field77 = var13.field76 - var13.field68;
					}

					if (var13.field77 < 0) {
						var13.field77 = 0;
					}

					method503(var13, var13.field77, var11, var12);

					if (var13.field76 > var13.field68) {
						method449(var13.field77, var13.field67 + var11, var12, var13.field76, var13.field68);
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
									if (var17 > class34.field569 - 32 && var17 < class34.field570 && var18 > class34.field567 - 32 && var18 < class34.field568 || field1226 != 0 && field1225 == var14) {
										int var22 = 0;
										if (field1124 == 1 && field1125 == var14 && field1126 == var13.field62) {
											var22 = 0xFFFFFF;
										}

										class36 var23 = class60.method356(var22, var13.field59[var14], var21);
										if (var23 != null) {
											if (field1226 != 0 && field1225 == var14 && field1224 == var13.field62) {
												var19 = field17 - field1227;
												var20 = field18 - field1228;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1278 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method201(128, var17 + var19, var18 + var20);

												if (var18 + var20 < class34.field567 && arg0.field77 > 0) {
													int var24 = (class34.field567 - var18 - var20) * field1167 / 3;
													if (var24 > field1167 * 10) {
														var24 = field1167 * 10;
													}

													if (var24 > arg0.field77) {
														var24 = arg0.field77;
													}

													arg0.field77 -= var24;
													field1228 += var24;
												}

												if (var18 + var20 + 32 > class34.field568 && arg0.field77 < arg0.field76 - arg0.field68) {
													int var25 = (var18 + var20 + 32 - class34.field568) * field1167 / 3;
													if (var25 > field1167 * 10) {
														var25 = field1167 * 10;
													}

													if (var25 > arg0.field76 - arg0.field68 - arg0.field77) {
														var25 = arg0.field76 - arg0.field68 - arg0.field77;
													}

													arg0.field77 += var25;
													field1228 -= var25;
												}
											} else if (field1103 != 0 && field1102 == var14 && field1101 == var13.field62) {
												var23.method201(128, var17, var18);
											} else {
												var23.method199(var18, var17);
											}

											if (var23.field602 == 33 || var13.field59[var14] != 1) {
												int var26 = var13.field59[var14];
												field1197.method217(var18 + var20 + 10, var17 + 1 + var19, method491(var26), 0);
												field1197.method217(var18 + var20 + 9, var17 + var19, method491(var26), 0xFFFF00);
											}
										}
									}
								} else if (var13.field90 != null && var14 < 20) {
									class36 var27 = var13.field90[var14];
									if (var27 != null) {
										var27.method199(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field64 == 3) {
						boolean var28 = false;
						if (field1222 == var13.field62 || field1077 == var13.field62 || field1068 == var13.field62) {
							var28 = true;
						}

						int var29;
						if (method447(var13)) {
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
								class34.method170(var13.field67, var11, var12, var13.field68, var29);
							} else {
								class34.method171(var13.field68, var12, var13.field67, var29, var11);
							}
						} else if (var13.field94) {
							class34.method169(var11, var13.field68, var12, 256 - (var13.field69 & 0xFF), var13.field67, var29);
						} else {
							class34.method172(var13.field67, var29, var13.field68, var12, var11, 256 - (var13.field69 & 0xFF));
						}
					} else if (var13.field64 == 4) {
						class38 var30 = var13.field97;
						String var31 = var13.field98;
						boolean var32 = false;
						if (field1222 == var13.field62 || field1077 == var13.field62 || field1068 == var13.field62) {
							var32 = true;
						}

						int var33;
						if (method447(var13)) {
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

						if (var13.field65 == 6 && field1284) {
							var31 = "Please wait...";
							var33 = var13.field100;
						}

						if (class34.field565 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field619 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method437(method478(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method437(method478(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method437(method478(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method437(method478(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method437(method478(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method215(var34, var13.field67 / 2 + var11, var13.field96, var41, var33);
							} else {
								var30.method219(var41, var34, var11, var13.field96, var33);
							}

							var34 += var30.field619;
						}
					} else if (var13.field64 == 5) {
						class36 var42;
						if (method447(var13)) {
							var42 = var13.field105;
						} else {
							var42 = var13.field104;
						}

						if (var42 != null) {
							var42.method199(var12, var11);
						}
					} else if (var13.field64 == 6) {
						int var43 = class35.field579;
						int var44 = class35.field580;
						class35.field579 = var13.field67 / 2 + var11;
						class35.field580 = var13.field68 / 2 + var12;
						int var45 = class35.field583[var13.field113] * var13.field112 >> 16;
						int var46 = class35.field584[var13.field113] * var13.field112 >> 16;
						boolean var47 = method447(var13);
						int var48;
						if (var47) {
							var48 = var13.field111;
						} else {
							var48 = var13.field110;
						}

						class32 var49;
						if (var48 == -1) {
							var49 = var13.method34(-1, -1, var47);
						} else {
							class66 var50 = class66.field979[var48];
							var49 = var13.method34(var50.field982[var13.field60], var50.field981[var13.field60], var47);
						}

						if (var49 != null) {
							var49.method159(0, var13.field114, 0, var13.field113, 0, var45, var46);
						}

						class35.field579 = var43;
						class35.field580 = var44;
					} else if (var13.field64 == 7) {
						class38 var51 = var13.field97;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field68; var53++) {
							for (int var54 = 0; var54 < var13.field67; var54++) {
								if (var13.field58[var52] > 0) {
									class60 var55 = class60.method350(var13.field58[var52] - 1);
									String var56 = var55.field899;
									if (var55.field910 || var13.field59[var52] != 1) {
										var56 = var56 + " x" + method516(var13.field59[var52]);
									}

									int var57 = (var13.field88 + 115) * var54 + var11;
									int var58 = (var13.field89 + 12) * var53 + var12;
									if (var13.field95) {
										var51.method215(var58, var13.field67 / 2 + var57, var13.field96, var56, var13.field100);
									} else {
										var51.method219(var56, var58, var57, var13.field96, var13.field100);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class34.method167(var5, var7, var8, var6);
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method504() {
		field1430.method268();
		int var1 = field1390 + field1376 & 0x7FF;
		int var2 = field1090.field369 / 32 + 48;
		int var3 = 464 - field1090.field370 / 32;
		field1153.method203(5, field1130, var2, 151, 146, var3, 25, field1334, var1, field1308 + 256);
		field1285.method203(0, field1095, 25, 33, 33, 25, 0, field1185, field1376, 256);

		for (int var4 = 0; var4 < field1261; var4++) {
			int var5 = field1262[var4] * 4 + 2 - field1090.field369 / 32;
			int var6 = field1263[var4] * 4 + 2 - field1090.field370 / 32;
			method540(field1358[var4], var6, var5);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1183[field1078][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1090.field369 / 32;
					int var11 = var8 * 4 + 2 - field1090.field370 / 32;
					method540(field1393, var11, var10);
				}
			}
		}

		for (int var12 = 0; var12 < field1355; var12++) {
			class27 var13 = field1354[field1356[var12]];
			if (var13 != null && var13.method127() && var13.field423.field882) {
				int var14 = var13.field369 / 32 - field1090.field369 / 32;
				int var15 = var13.field370 / 32 - field1090.field370 / 32;
				method540(field1394, var15, var14);
			}
		}

		for (int var16 = 0; var16 < field1404; var16++) {
			class28 var17 = field1403[field1405[var16]];
			if (var17 != null && var17.method127()) {
				int var18 = var17.field369 / 32 - field1090.field369 / 32;
				int var19 = var17.field370 / 32 - field1090.field370 / 32;
				boolean var20 = false;
				long var21 = class52.method310(var17.field424);
				for (int var23 = 0; var23 < field1207; var23++) {
					if (field1168[var23] == var21 && field1374[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method540(field1396, var19, var18);
				} else {
					method540(field1395, var19, var18);
				}
			}
		}

		if (field1385 != 0 && field1446 % 20 < 10) {
			if (field1385 == 1 && field1042 >= 0 && field1042 < field1354.length) {
				class27 var24 = field1354[field1042];
				if (var24 != null) {
					int var25 = var24.field369 / 32 - field1090.field369 / 32;
					int var26 = var24.field370 / 32 - field1090.field370 / 32;
					method452(field1094, var25, var26);
				}
			}

			if (field1385 == 2) {
				int var27 = (field1346 - field1203) * 4 + 2 - field1090.field369 / 32;
				int var28 = (field1347 - field1204) * 4 + 2 - field1090.field370 / 32;
				method452(field1094, var27, var28);
			}

			if (field1385 == 10 && field1416 >= 0 && field1416 < field1403.length) {
				class28 var29 = field1403[field1416];
				if (var29 != null) {
					int var30 = var29.field369 / 32 - field1090.field369 / 32;
					int var31 = var29.field370 / 32 - field1090.field370 / 32;
					method452(field1094, var30, var31);
				}
			}
		}

		if (field1151 != 0) {
			int var32 = field1151 * 4 + 2 - field1090.field369 / 32;
			int var33 = field1152 * 4 + 2 - field1090.field370 / 32;
			method540(field1093, var33, var32);
		}

		class34.method170(3, 97, 78, 3, 0xFFFFFF);
		field1431.method268();
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method505(int arg0, class39 arg1) {
		while (arg1.field625 + 10 < arg0 * 8) {
			int var3 = arg1.method250(11);
			if (var3 == 2047) {
				break;
			}

			if (field1403[var3] == null) {
				field1403[var3] = new class28();
				if (field1408[var3] != null) {
					field1403[var3].method130(field1408[var3]);
				}
			}

			field1405[field1404++] = var3;
			class28 var4 = field1403[var3];
			var4.field414 = field1446;
			int var5 = arg1.method250(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method250(1);
			var4.method124(field1090.field418[0] + var5, var7 == 1, field1090.field419[0] + var6);
			int var8 = arg1.method250(1);
			if (var8 == 1) {
				field1407[field1406++] = var3;
			}
		}

		arg1.method251();
	}

	@ObfuscatedName("client.b(IILmb;)V")
	public final void method506(int arg0, class39 arg1) {
		if (arg0 == 119 || arg0 == 198) {
			int var3 = arg1.method239();
			int var4 = (var3 >> 4 & 0x7) + field1370;
			int var5 = (var3 & 0x7) + field1371;
			int var6 = arg1.method239();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1123[var7];
			int var10;
			if (arg0 == 198) {
				var10 = -1;
			} else {
				var10 = arg1.method241();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method532(var5, field1078, var9, -1, var10, var4, 0, var7, var8);
			}
		} else if (arg0 == 71) {
			int var11 = arg1.method239();
			int var12 = (var11 >> 4 & 0x7) + field1370;
			int var13 = (var11 & 0x7) + field1371;
			int var14 = arg1.method239();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1123[var15];
			int var18 = arg1.method241();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1178[field1078][var12][var13];
				int var20 = field1178[field1078][var12 + 1][var13];
				int var21 = field1178[field1078][var12 + 1][var13 + 1];
				int var22 = field1178[field1078][var12][var13 + 1];
				if (var17 == 0) {
					class18 var23 = field1249.method86(var13, field1078, var12);
					if (var23 != null) {
						int var24 = var23.field265 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field263 = new class29(var19, false, var22, var18, var20, var21, var16 + 4, var24, 2);
							var23.field264 = new class29(var19, false, var22, var18, var20, var21, var16 + 1 & 0x3, var24, 2);
						} else {
							var23.field263 = new class29(var19, false, var22, var18, var20, var21, var16, var24, var15);
						}
					}
				}

				if (var17 == 1) {
					class9 var25 = field1249.method87(var13, var12, field1078);
					if (var25 != null) {
						var25.field156 = new class29(var19, false, var22, var18, var20, var21, 0, var25.field157 >> 14 & 0x7FFF, 4);
					}
				}

				if (var17 == 2) {
					class17 var26 = field1249.method88(var13, var12, field1078);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field248 = new class29(var19, false, var22, var18, var20, var21, var16, var26.field256 >> 14 & 0x7FFF, var15);
					}
				}

				if (var17 == 3) {
					class11 var27 = field1249.method89(var13, var12, field1078);
					if (var27 != null) {
						var27.field187 = new class29(var19, false, var22, var18, var20, var21, var16, var27.field188 >> 14 & 0x7FFF, 22);
					}
				}
			}
		} else if (arg0 == 94) {
			int var28 = arg1.method239();
			int var29 = (var28 >> 4 & 0x7) + field1370;
			int var30 = (var28 & 0x7) + field1371;
			int var31 = arg1.method241();
			int var32 = arg1.method241();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class30 var33 = new class30();
				var33.field456 = var31;
				var33.field457 = var32;

				if (field1183[field1078][var29][var30] == null) {
					field1183[field1078][var29][var30] = new class42();
				}

				field1183[field1078][var29][var30].method255(var33);
				method495(var29, var30);
			}
		} else if (arg0 == 13) {
			int var34 = arg1.method239();
			int var35 = (var34 >> 4 & 0x7) + field1370;
			int var36 = (var34 & 0x7) + field1371;
			int var37 = arg1.method241();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1183[field1078][var35][var36];
				if (var38 != null) {
					for (class30 var39 = (class30) var38.method258(); var39 != null; var39 = (class30) var38.method260()) {
						if ((var37 & 0x7FFF) == var39.field456) {
							var39.method120();
							break;
						}
					}

					if (var38.method258() == null) {
						field1183[field1078][var35][var36] = null;
					}

					method495(var35, var36);
				}
			}
		} else if (arg0 == 187) {
			int var40 = arg1.method239();
			int var41 = (var40 >> 4 & 0x7) + field1370;
			int var42 = (var40 & 0x7) + field1371;
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
				class31 var53 = new class31(var52, var42, var46, field1446 + var50, field1446 + var49, method484(var42, field1078, var41) - var47, var41, var48, var51, var45, field1078);
				var53.method133(field1446 + var49, var44, var43, method484(var44, field1078, var43) - var48);
				field1409.method255(var53);
			}
		} else if (arg0 == 141) {
			int var54 = arg1.method239();
			int var55 = (var54 >> 4 & 0x7) + field1370;
			int var56 = (var54 & 0x7) + field1371;
			int var57 = arg1.method241();
			int var58 = arg1.method239();
			int var59 = arg1.method241();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class33 var60 = new class33(var56, var59, var57, var55, field1446, method484(var56, field1078, var55) - var58, field1078);
				field1333.method255(var60);
			}
		} else if (arg0 == 190) {
			int var61 = arg1.method239();
			int var62 = (var61 >> 4 & 0x7) + field1370;
			int var63 = (var61 & 0x7) + field1371;
			int var64 = arg1.method241();
			int var65 = arg1.method241();
			int var66 = arg1.method241();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1041 != var66) {
				class30 var67 = new class30();
				var67.field456 = var64;
				var67.field457 = var65;

				if (field1183[field1078][var62][var63] == null) {
					field1183[field1078][var62][var63] = new class42();
				}

				field1183[field1078][var62][var63].method255(var67);
				method495(var62, var63);
			}
		} else if (arg0 == 188) {
			int var68 = arg1.method239();
			int var69 = (var68 >> 4 & 0x7) + field1370;
			int var70 = (var68 & 0x7) + field1371;
			int var71 = arg1.method239();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1123[var72];
			int var75 = arg1.method241();
			int var76 = arg1.method241();
			int var77 = arg1.method241();
			int var78 = arg1.method241();
			byte var79 = arg1.method240();
			byte var80 = arg1.method240();
			byte var81 = arg1.method240();
			byte var82 = arg1.method240();
			class28 var83;
			if (field1041 == var78) {
				var83 = field1090;
			} else {
				var83 = field1403[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method334(var75);
				int var85 = field1178[field1078][var69][var70];
				int var86 = field1178[field1078][var69 + 1][var70];
				int var87 = field1178[field1078][var69 + 1][var70 + 1];
				int var88 = field1178[field1078][var69][var70 + 1];
				class32 var89 = var84.method340(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method532(var70, field1078, var74, var77 + 1, -1, var69, var76 + 1, 0, 0);
					var83.field433 = field1446 + var76;
					var83.field434 = field1446 + var77;
					var83.field438 = var89;
					int var90 = var84.field825;
					int var91 = var84.field826;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field826;
						var91 = var84.field825;
					}

					var83.field435 = var69 * 128 + var90 * 64;
					var83.field437 = var70 * 128 + var91 * 64;
					var83.field436 = method484(var83.field437, field1078, var83.field435);

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

					var83.field439 = var69 + var79;
					var83.field441 = var69 + var81;
					var83.field440 = var70 + var80;
					var83.field442 = var70 + var82;
				}
			}
		} else if (arg0 == 151) {
			int var94 = arg1.method239();
			int var95 = (var94 >> 4 & 0x7) + field1370;
			int var96 = (var94 & 0x7) + field1371;
			int var97 = arg1.method241();
			int var98 = arg1.method241();
			int var99 = arg1.method241();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1183[field1078][var95][var96];
				if (var100 != null) {
					for (class30 var101 = (class30) var100.method258(); var101 != null; var101 = (class30) var100.method260()) {
						if ((var97 & 0x7FFF) == var101.field456 && var101.field457 == var98) {
							var101.field457 = var99;
							break;
						}
					}

					method495(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BIIII)Z")
	public final boolean method507(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1249.method94(field1078, arg3, arg2, arg0);
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
				var10 = var9.field825;
				var11 = var9.field826;
			} else {
				var10 = var9.field826;
				var11 = var9.field825;
			}

			int var12 = var9.field848;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method499(false, var10, 0, arg3, var12, 2, field1090.field418[0], 0, arg2, var11, field1090.field419[0]);
		} else {
			method499(false, 0, var7 + 1, arg3, 0, 2, field1090.field418[0], var8, arg2, 0, field1090.field419[0]);
		}

		field1438 = field24;
		field1439 = field25;
		field1441 = 2;
		field1440 = 0;
		field1382.method228(arg1);
		field1382.method230(field1203 + arg3);
		field1382.method230(field1204 + arg2);
		field1382.method230(var5);
		return true;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method508() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1111 != -1 && field1237 == field1111) {
				if (var1 == 8 && field1156.length() > 0) {
					field1156 = field1156.substring(0, field1156.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1156.length() < 12) {
					field1156 = field1156 + (char) var1;
				}
			} else if (field1043) {
				if (var1 >= 32 && var1 <= 122 && field1186.length() < 80) {
					field1186 = field1186 + (char) var1;
					field1129 = true;
				}

				if (var1 == 8 && field1186.length() > 0) {
					field1186 = field1186.substring(0, field1186.length() - 1);
					field1129 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1043 = false;
					field1129 = true;

					if (field1338 == 1) {
						long var2 = class52.method310(field1186);
						method501(var2);
					}

					if (field1338 == 2 && field1207 > 0) {
						long var4 = class52.method310(field1186);
						method536(var4);
					}

					if (field1338 == 3 && field1186.length() > 0) {
						field1382.method228(99);
						field1382.method229(0);
						int var6 = field1382.field624;
						field1382.method235(field1426);
						class53.method318(field1186, field1382);
						field1382.method238(field1382.field624 - var6);
						field1186 = class52.method315(field1186);
						field1186 = class71.method403(field1186);
						method544(6, class52.method314(class52.method311(field1426)), field1186);

						if (field1448 == 2) {
							field1448 = 1;
							field1340 = true;
							field1382.method228(8);
							field1382.method229(field1313);
							field1382.method229(field1448);
							field1382.method229(field1187);
						}
					}

					if (field1338 == 4 && field1079 < 100) {
						long var7 = class52.method310(field1186);
						method459(var7);
					}

					if (field1338 == 5 && field1079 > 0) {
						long var9 = class52.method310(field1186);
						method485(var9);
					}
				}
			} else if (field1221) {
				if (var1 >= 48 && var1 <= 57 && field1122.length() < 10) {
					field1122 = field1122 + (char) var1;
					field1129 = true;
				}

				if (var1 == 8 && field1122.length() > 0) {
					field1122 = field1122.substring(0, field1122.length() - 1);
					field1129 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1122.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1122);
						} catch (Exception var16) {
						}

						field1382.method228(241);
						field1382.method233(var11);
					}

					field1221 = false;
					field1129 = true;
				}
			} else if (field1389 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1244.length() < 80) {
					field1244 = field1244 + (char) var1;
					field1129 = true;
				}

				if (var1 == 8 && field1244.length() > 0) {
					field1244 = field1244.substring(0, field1244.length() - 1);
					field1129 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1244.length() > 0) {
					if (field1229 == 2) {
						if (field1244.equals("::clientdrop")) {
							method498();
						}

						if (field1244.equals("::lag")) {
							method431();
						}

						if (field1244.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field1121.method282(2); var12++) {
								field1121.method292((byte) 1, var12, 2);
							}
						}
					}

					if (field1244.startsWith("::")) {
						field1382.method228(11);
						field1382.method229(field1244.length() - 1);
						field1382.method236(field1244.substring(2));
					} else {
						byte var13 = 0;
						if (field1244.startsWith("yellow:")) {
							var13 = 0;
							field1244 = field1244.substring(7);
						}

						if (field1244.startsWith("red:")) {
							var13 = 1;
							field1244 = field1244.substring(4);
						}

						if (field1244.startsWith("green:")) {
							var13 = 2;
							field1244 = field1244.substring(6);
						}

						if (field1244.startsWith("cyan:")) {
							var13 = 3;
							field1244 = field1244.substring(5);
						}

						if (field1244.startsWith("purple:")) {
							var13 = 4;
							field1244 = field1244.substring(7);
						}

						if (field1244.startsWith("white:")) {
							var13 = 5;
							field1244 = field1244.substring(6);
						}

						if (field1244.startsWith("flash1:")) {
							var13 = 6;
							field1244 = field1244.substring(7);
						}

						if (field1244.startsWith("flash2:")) {
							var13 = 7;
							field1244 = field1244.substring(7);
						}

						if (field1244.startsWith("flash3:")) {
							var13 = 8;
							field1244 = field1244.substring(7);
						}

						if (field1244.startsWith("glow1:")) {
							var13 = 9;
							field1244 = field1244.substring(6);
						}

						if (field1244.startsWith("glow2:")) {
							var13 = 10;
							field1244 = field1244.substring(6);
						}

						if (field1244.startsWith("glow3:")) {
							var13 = 11;
							field1244 = field1244.substring(6);
						}

						byte var14 = 0;
						if (field1244.startsWith("wave:")) {
							var14 = 1;
							field1244 = field1244.substring(5);
						}

						if (field1244.startsWith("scroll:")) {
							var14 = 2;
							field1244 = field1244.substring(7);
						}

						field1382.method228(78);
						field1382.method229(0);
						int var15 = field1382.field624;
						field1382.method229(var13);
						field1382.method229(var14);
						class53.method318(field1244, field1382);
						field1382.method238(field1382.field624 - var15);
						field1244 = class52.method315(field1244);
						field1244 = class71.method403(field1244);
						field1090.field381 = field1244;
						field1090.field383 = var13;
						field1090.field384 = var14;
						field1090.field382 = 150;

						if (field1229 == 2) {
							method544(2, "@cr2@" + field1090.field424, field1090.field381);
						} else if (field1229 == 1) {
							method544(2, "@cr1@" + field1090.field424, field1090.field381);
						} else {
							method544(2, field1090.field424, field1090.field381);
						}

						if (field1313 == 2) {
							field1313 = 3;
							field1340 = true;
							field1382.method228(8);
							field1382.method229(field1313);
							field1382.method229(field1448);
							field1382.method229(field1187);
						}
					}

					field1244 = "";
					field1129 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method509(int arg0) {
		if (!field1084) {
			if (class35.field593[17] >= arg0) {
				class37 var2 = class35.field587[17];
				int var3 = var2.field607 * var2.field606 - 1;
				int var4 = field1167 * var2.field606 * 2;
				byte[] var5 = var2.field604;
				byte[] var6 = field1255;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field604 = var6;
				field1255 = var5;
				class35.method184(17);
			}

			if (class35.field593[24] >= arg0) {
				class37 var8 = class35.field587[24];
				int var9 = var8.field607 * var8.field606 - 1;
				int var10 = field1167 * var8.field606 * 2;
				byte[] var11 = var8.field604;
				byte[] var12 = field1255;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field604 = var12;
				field1255 = var11;
				class35.method184(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method510(class39 arg0, int arg1) {
		field1181 = 0;
		field1406 = 0;
		method514(arg1, arg0);
		method470(arg0, arg1);
		method539(arg1, arg0);

		for (int var3 = 0; var3 < field1181; var3++) {
			int var4 = field1182[var3];
			if (field1446 != field1354[var4].field414) {
				field1354[var4].field423 = null;
				field1354[var4] = null;
			}
		}

		if (arg0.field624 != arg1) {
			signlink.reporterror(field1444 + " size mismatch in getnpcpos - pos:" + arg0.field624 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1355; var5++) {
			if (field1354[field1356[var5]] == null) {
				signlink.reporterror(field1444 + " null entry in npc list - pos:" + var5 + " size:" + field1355);
				throw new RuntimeException("eek");
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 249);

			if (arg0.length == 5) {
				field1081 = Integer.parseInt(arg0[0]);
				field1082 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method432();
				} else if (arg0[2].equals("highmem")) {
					method486();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1083 = false;
				} else if (arg0[3].equals("members")) {
					field1083 = true;
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
	public final void method511() {
		if (field1241 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1241 = 3;
				field1339 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1176 = "";
				field1177 = "Enter your username & password.";
				field1241 = 2;
				field1339 = 0;
			}
		} else if (field1241 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1339 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1339 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method440(field1444, field1445, false);

				if (field1075) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1241 = 0;
				field1444 = "";
				field1445 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1238.length(); var10++) {
					if (var8 == field1238.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1339 == 0) {
					if (var8 == 8 && field1444.length() > 0) {
						field1444 = field1444.substring(0, field1444.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1339 = 1;
					}

					if (var9) {
						field1444 = field1444 + (char) var8;
					}

					if (field1444.length() > 12) {
						field1444 = field1444.substring(0, 12);
					}
				} else if (field1339 == 1) {
					if (var8 == 8 && field1445.length() > 0) {
						field1445 = field1445.substring(0, field1445.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1339 = 0;
					}

					if (var9) {
						field1445 = field1445 + (char) var8;
					}

					if (field1445.length() > 20) {
						field1445 = field1445.substring(0, 20);
					}
				}
			}
		} else if (field1241 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1241 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILgc;II)V")
	public final void method512(int arg0, class59 arg1, int arg2, int arg3) {
		if (field1314 < 400) {
			String var5 = arg1.field866;
			if (arg1.field883 != 0) {
				var5 = var5 + method487(arg1.field883, field1090.field430) + " (level-" + arg1.field883 + ")";
			}

			if (field1124 == 1) {
				field1066[field1314] = "Use " + field1128 + " with @yel@" + var5;
				field1173[field1314] = 900;
				field1174[field1314] = arg3;
				field1171[field1314] = arg2;
				field1172[field1314] = arg0;
				field1314++;
			} else if (field1364 != 1) {
				if (arg1.field878 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg1.field878[var6] != null && !arg1.field878[var6].equalsIgnoreCase("attack")) {
							field1066[field1314] = arg1.field878[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1173[field1314] = 728;
							}

							if (var6 == 1) {
								field1173[field1314] = 542;
							}

							if (var6 == 2) {
								field1173[field1314] = 6;
							}

							if (var6 == 3) {
								field1173[field1314] = 963;
							}

							if (var6 == 4) {
								field1173[field1314] = 245;
							}

							field1174[field1314] = arg3;
							field1171[field1314] = arg2;
							field1172[field1314] = arg0;
							field1314++;
						}
					}
				}

				if (arg1.field878 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg1.field878[var7] != null && arg1.field878[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg1.field883 > field1090.field430) {
								var8 = 2000;
							}

							field1066[field1314] = arg1.field878[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1173[field1314] = var8 + 728;
							}

							if (var7 == 1) {
								field1173[field1314] = var8 + 542;
							}

							if (var7 == 2) {
								field1173[field1314] = var8 + 6;
							}

							if (var7 == 3) {
								field1173[field1314] = var8 + 963;
							}

							if (var7 == 4) {
								field1173[field1314] = var8 + 245;
							}

							field1174[field1314] = arg3;
							field1171[field1314] = arg2;
							field1172[field1314] = arg0;
							field1314++;
						}
					}
				}

				field1066[field1314] = "Examine @yel@" + var5;
				field1173[field1314] = 1607;
				field1174[field1314] = arg3;
				field1171[field1314] = arg2;
				field1172[field1314] = arg0;
				field1314++;
			} else if ((field1366 & 0x2) == 2) {
				field1066[field1314] = field1367 + " @yel@" + var5;
				field1173[field1314] = 265;
				field1174[field1314] = arg3;
				field1171[field1314] = arg2;
				field1172[field1314] = arg0;
				field1314++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method513(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1098[var4] != null) {
				int var5 = field1096[var4];
				int var6 = field1290 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1097[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1313 == 0 || field1313 == 1 && method559(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1090.field424)) {
						if (field1229 >= 1) {
							field1066[field1314] = "Report abuse @whi@" + var7;
							field1173[field1314] = 34;
							field1314++;
						}

						field1066[field1314] = "Add ignore @whi@" + var7;
						field1173[field1314] = 436;
						field1314++;
						field1066[field1314] = "Add friend @whi@" + var7;
						field1173[field1314] = 406;
						field1314++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1357 == 0 && (var5 == 7 || field1448 == 0 || field1448 == 1 && method559(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1229 >= 1) {
							field1066[field1314] = "Report abuse @whi@" + var7;
							field1173[field1314] = 34;
							field1314++;
						}

						field1066[field1314] = "Add ignore @whi@" + var7;
						field1173[field1314] = 436;
						field1314++;
						field1066[field1314] = "Add friend @whi@" + var7;
						field1173[field1314] = 406;
						field1314++;
					}

					var3++;
				}

				if (var5 == 4 && (field1187 == 0 || field1187 == 1 && method559(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1066[field1314] = "Accept trade @whi@" + var7;
						field1173[field1314] = 903;
						field1314++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1357 == 0 && field1448 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1187 == 0 || field1187 == 1 && method559(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1066[field1314] = "Accept duel @whi@" + var7;
						field1173[field1314] = 363;
						field1314++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method13(String arg0, int arg1) {
		field1258 = arg1;
		field1038 = arg0;
		method493();

		if (field1380 == null) {
			super.method13(arg0, arg1);
		} else {
			field1057.method268();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1199.method214("RuneScape is loading - please wait...", 0xFFFFFF, var4 / 2 - var5 - 26, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			class34.method171(34, var6, 304, 0x8C1111, var3 / 2 - 152);
			class34.method171(32, var6 + 1, 302, 0, var3 / 2 - 151);
			class34.method170(arg1 * 3, var3 / 2 - 150, var6 + 2, 30, 0x8C1111);
			class34.method170(300 - arg1 * 3, arg1 * 3 + (var3 / 2 - 150), var6 + 2, 30, 0);
			field1199.method214(arg0, 0xFFFFFF, var4 / 2 + 5 - var5, var3 / 2);
			field1057.method269(171, field9, 202);

			if (field1363) {
				field1363 = false;

				if (!field1191) {
					field1058.method269(0, field9, 0);
					field1059.method269(0, field9, 637);
				}

				field1055.method269(0, field9, 128);
				field1056.method269(371, field9, 202);
				field1060.method269(265, field9, 0);
				field1061.method269(265, field9, 562);
				field1062.method269(171, field9, 128);
				field1063.method269(171, field9, 562);
			}
		}
	}

	@ObfuscatedName("client.c(IILmb;)V")
	public final void method514(int arg0, class39 arg1) {
		arg1.method249();
		int var3 = arg1.method250(8);
		if (var3 < field1355) {
			for (int var4 = var3; var4 < field1355; var4++) {
				field1182[field1181++] = field1356[var4];
			}
		}

		if (var3 > field1355) {
			signlink.reporterror(field1444 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1355 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1356[var5];
			class27 var7 = field1354[var6];
			int var8 = arg1.method250(1);
			if (var8 == 0) {
				field1356[field1355++] = var6;
				var7.field414 = field1446;
			} else {
				int var9 = arg1.method250(2);
				if (var9 == 0) {
					field1356[field1355++] = var6;
					var7.field414 = field1446;
					field1407[field1406++] = var6;
				} else if (var9 == 1) {
					field1356[field1355++] = var6;
					var7.field414 = field1446;
					int var10 = arg1.method250(3);
					var7.method125(var10, false);
					int var11 = arg1.method250(1);
					if (var11 == 1) {
						field1407[field1406++] = var6;
					}
				} else if (var9 == 2) {
					field1356[field1355++] = var6;
					var7.field414 = field1446;
					int var12 = arg1.method250(3);
					var7.method125(var12, true);
					int var13 = arg1.method250(3);
					var7.method125(var13, true);
					int var14 = arg1.method250(1);
					if (var14 == 1) {
						field1407[field1406++] = var6;
					}
				} else if (var9 == 3) {
					field1182[field1181++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method515() {
		field1429.method268();
		class35.field585 = field1331;
		field1252.method212(0, 0);

		if (field1265 != -1) {
			method503(class4.field57[field1265], 0, 0, 0);
		} else if (field1250[field1085] != -1) {
			method503(class4.field57[field1250[field1085]], 0, 0, 0);
		}

		if (field1201 && field1319 == 1) {
			method475();
		}

		field1429.method269(205, field9, 553);
		field1431.method268();
		class35.field585 = field1332;
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public static final String method516(int arg0) {
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

	@ObfuscatedName("client.h(II)V")
	public final void method517(int arg0) {
		int[] var2 = field1153.field597;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1184[arg0][var7][var5] & 0x18) == 0) {
					field1249.method99(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1184[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1249.method99(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1153.method194();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1184[arg0][var11][var10] & 0x18) == 0) {
					method562(var8, var9, arg0, var10, var11);
				}

				if (arg0 < 3 && (field1184[arg0 + 1][var11][var10] & 0x8) != 0) {
					method562(var8, var9, arg0 + 1, var10, var11);
				}
			}
		}

		field1431.method268();
		field1261 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1249.method93(field1078, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method334(var14).field838;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1067[field1078].field944;
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

						field1358[field1261] = field1259[var15];
						field1262[field1261] = var16;
						field1263[field1261] = var17;
						field1261++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1318 != null) {
				field1318.method38();
			}
		} catch (Exception var1) {
		}

		field1318 = null;
		method435();

		if (field1164 != null) {
			field1164.field855 = false;
		}

		field1164 = null;
		field1121.method281();
		field1121 = null;
		field1382 = null;
		field1180 = null;
		field1379 = null;
		field1188 = null;
		field1154 = null;
		field1139 = null;
		field1189 = null;
		field1190 = null;
		field1178 = null;
		field1184 = null;
		field1249 = null;
		field1067 = null;
		field1328 = null;
		field1383 = null;
		field1064 = null;
		field1065 = null;
		field1255 = null;
		field1429 = null;
		field1430 = null;
		field1431 = null;
		field1432 = null;
		field1300 = null;
		field1301 = null;
		field1302 = null;
		field1045 = null;
		field1046 = null;
		field1047 = null;
		field1048 = null;
		field1049 = null;
		field1050 = null;
		field1051 = null;
		field1052 = null;
		field1053 = null;
		field1252 = null;
		field1253 = null;
		field1254 = null;
		field1135 = null;
		field1136 = null;
		field1137 = null;
		field1251 = null;
		field1291 = null;
		field1292 = null;
		field1293 = null;
		field1294 = null;
		field1295 = null;
		field1116 = null;
		field1117 = null;
		field1118 = null;
		field1119 = null;
		field1120 = null;
		field1285 = null;
		field1399 = null;
		field1307 = null;
		field1247 = null;
		field1393 = null;
		field1394 = null;
		field1395 = null;
		field1396 = null;
		field1279 = null;
		field1259 = null;
		field1131 = null;
		field1403 = null;
		field1405 = null;
		field1407 = null;
		field1408 = null;
		field1182 = null;
		field1354 = null;
		field1356 = null;
		field1183 = null;
		field1148 = null;
		field1409 = null;
		field1333 = null;
		field1171 = null;
		field1172 = null;
		field1173 = null;
		field1174 = null;
		field1066 = null;
		field1287 = null;
		field1262 = null;
		field1263 = null;
		field1358 = null;
		field1153 = null;
		field1140 = null;
		field1168 = null;
		field1374 = null;
		field1058 = null;
		field1059 = null;
		field1055 = null;
		field1056 = null;
		field1057 = null;
		field1060 = null;
		field1061 = null;
		field1062 = null;
		field1063 = null;
		method545();
		class57.method333();
		class59.method343();
		class60.method349();
		class63.field946 = null;
		class64.field959 = null;
		class4.field57 = null;
		class65.field966 = null;
		class66.field979 = null;
		class68.field998 = null;
		class68.field1010 = null;
		class70.field1018 = null;
		field10 = null;
		class28.field445 = null;
		class35.method177();
		class19.method63();
		class32.method135();
		class8.method60();
		System.gc();
	}

	@ObfuscatedName("client.w(I)V")
	public final void method518() {
		field1208 = 0;
		for (int var1 = -1; var1 < field1404 + field1355; var1++) {
			class26 var2;
			if (var1 == -1) {
				var2 = field1090;
			} else if (var1 < field1404) {
				var2 = field1403[field1405[var1]];
			} else {
				var2 = field1354[field1356[var1 - field1404]];
			}

			if (var2 != null && var2.method127()) {
				if (var1 >= field1404) {
					class59 var6 = ((class27) var2).field423;
					if (var6.field889 >= 0 && var6.field889 < field1307.length) {
						method556(var2, var2.field415 + 15);

						if (field1270 > -1) {
							field1307[var6.field889].method199(field1271 - 30, field1270 - 12);
						}
					}

					if (field1385 == 1 && field1356[var1 - field1404] == field1042 && field1446 % 20 < 10) {
						method556(var2, var2.field415 + 15);

						if (field1270 > -1) {
							field1307[2].method199(field1271 - 28, field1270 - 12);
						}
					}
				} else {
					int var3 = 30;
					class28 var4 = (class28) var2;
					if (var4.field427 != 0) {
						method556(var2, var2.field415 + 15);

						if (field1270 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field427 & 1 << var5) != 0) {
									field1307[var5].method199(field1271 - var3, field1270 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1385 == 10 && field1405[var1] == field1416) {
						method556(var2, var2.field415 + 15);

						if (field1270 > -1) {
							field1307[7].method199(field1271 - var3, field1270 - 12);
						}
					}
				}

				if (var2.field381 != null && (var1 >= field1404 || field1313 == 0 || field1313 == 3 || field1313 == 1 && method559(((class28) var2).field424))) {
					method556(var2, var2.field415);

					if (field1270 > -1 && field1208 < field1209) {
						field1213[field1208] = field1199.method216(var2.field381) / 2;
						field1212[field1208] = field1199.field619;
						field1210[field1208] = field1270;
						field1211[field1208] = field1271;
						field1214[field1208] = var2.field383;
						field1215[field1208] = var2.field384;
						field1216[field1208] = var2.field382;
						field1217[field1208++] = var2.field381;

						if (field1369 == 0 && var2.field384 == 1) {
							field1212[field1208] += 10;
							field1211[field1208] += 5;
						}

						if (field1369 == 0 && var2.field384 == 2) {
							field1213[field1208] = 60;
						}
					}
				}

				if (var2.field388 > field1446) {
					method556(var2, var2.field415 + 15);

					if (field1270 > -1) {
						int var7 = var2.field389 * 30 / var2.field390;
						if (var7 > 30) {
							var7 = 30;
						}

						class34.method170(var7, field1270 - 15, field1271 - 3, 5, 0xFF00);
						class34.method170(30 - var7, field1270 - 15 + var7, field1271 - 3, 5, 0xFF0000);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field387[var8] > field1446) {
						method556(var2, var2.field415 / 2);

						if (field1270 > -1) {
							if (var8 == 1) {
								field1271 -= 20;
							}

							if (var8 == 2) {
								field1270 -= 15;
								field1271 -= 10;
							}

							if (var8 == 3) {
								field1270 += 15;
								field1271 -= 10;
							}

							field1399[var2.field386[var8]].method199(field1271 - 12, field1270 - 12);
							field1197.method214(String.valueOf(var2.field385[var8]), 0, field1271 + 4, field1270);
							field1197.method214(String.valueOf(var2.field385[var8]), 0xFFFFFF, field1271 + 3, field1270 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1208; var9++) {
			int var10 = field1210[var9];
			int var11 = field1211[var9];
			int var12 = field1213[var9];
			int var13 = field1212[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1211[var15] - field1212[var15] && var11 - var13 < field1211[var15] + 2 && var10 - var12 < field1213[var15] + field1210[var15] && var10 + var12 > field1210[var15] - field1213[var15] && field1211[var15] - field1212[var15] < var11) {
						var11 = field1211[var15] - field1212[var15];
						var14 = true;
					}
				}
			}

			field1270 = field1210[var9];
			field1271 = field1211[var9] = var11;
			String var16 = field1217[var9];
			if (field1369 == 0) {
				int var17 = 0xFFFF00;
				if (field1214[var9] < 6) {
					var17 = field1282[field1214[var9]];
				}

				if (field1214[var9] == 6) {
					var17 = field1170 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1214[var9] == 7) {
					var17 = field1170 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1214[var9] == 8) {
					var17 = field1170 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1214[var9] == 9) {
					int var18 = 150 - field1216[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1214[var9] == 10) {
					int var19 = 150 - field1216[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1214[var9] == 11) {
					int var20 = 150 - field1216[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1215[var9] == 0) {
					field1199.method214(var16, 0, field1271 + 1, field1270);
					field1199.method214(var16, var17, field1271, field1270);
				}

				if (field1215[var9] == 1) {
					field1199.method218(field1270, var16, 0, field1170, field1271 + 1);
					field1199.method218(field1270, var16, var17, field1170, field1271);
				}

				if (field1215[var9] == 2) {
					int var21 = field1199.method216(var16);
					int var22 = (150 - field1216[var9]) * (var21 + 100) / 150;
					class34.method167(field1270 - 50, field1270 + 50, 334, 0);
					field1199.method217(field1271 + 1, field1270 + 50 - var22, var16, 0);
					field1199.method217(field1271, field1270 + 50 - var22, var16, var17);
					class34.method166();
				}
			} else {
				field1199.method214(var16, 0, field1271 + 1, field1270);
				field1199.method214(var16, 0xFFFF00, field1271, field1270);
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method519() {
		for (int var1 = 0; var1 < field1355; var1++) {
			int var2 = field1356[var1];
			class27 var3 = field1354[var2];
			if (var3 != null) {
				method520(var3.field423.field868, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILz;Z)V")
	public final void method520(int arg0, class26 arg1) {
		if (arg1.field369 < 128 || arg1.field370 < 128 || arg1.field369 >= 13184 || arg1.field370 >= 13184) {
			arg1.field397 = -1;
			arg1.field402 = -1;
			arg1.field411 = 0;
			arg1.field412 = 0;
			arg1.field369 = arg1.field418[0] * 128 + arg1.field373 * 64;
			arg1.field370 = arg1.field419[0] * 128 + arg1.field373 * 64;
			arg1.method126();
		}

		if (field1090 == arg1 && (arg1.field369 < 1536 || arg1.field370 < 1536 || arg1.field369 >= 11776 || arg1.field370 >= 11776)) {
			arg1.field397 = -1;
			arg1.field402 = -1;
			arg1.field411 = 0;
			arg1.field412 = 0;
			arg1.field369 = arg1.field418[0] * 128 + arg1.field373 * 64;
			arg1.field370 = arg1.field419[0] * 128 + arg1.field373 * 64;
			arg1.method126();
		}

		if (arg1.field411 > field1446) {
			method521(arg1);
		} else if (arg1.field412 >= field1446) {
			method522(arg1);
		} else {
			method523(arg1);
		}

		method524(arg1);
		method525(arg1);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method521(class26 arg0) {
		int var2 = arg0.field411 - field1446;
		int var3 = arg0.field407 * 128 + arg0.field373 * 64;
		int var4 = arg0.field409 * 128 + arg0.field373 * 64;
		arg0.field369 += (var3 - arg0.field369) / var2;
		arg0.field370 += (var4 - arg0.field370) / var2;
		arg0.field421 = 0;

		if (arg0.field413 == 0) {
			arg0.field416 = 1024;
		}

		if (arg0.field413 == 1) {
			arg0.field416 = 1536;
		}

		if (arg0.field413 == 2) {
			arg0.field416 = 0;
		}

		if (arg0.field413 == 3) {
			arg0.field416 = 512;
		}
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method522(class26 arg0) {
		if (field1446 == arg0.field412 || arg0.field397 == -1 || arg0.field400 != 0 || arg0.field399 + 1 > class66.field979[arg0.field397].method384(arg0.field398)) {
			int var2 = arg0.field412 - arg0.field411;
			int var3 = field1446 - arg0.field411;
			int var4 = arg0.field407 * 128 + arg0.field373 * 64;
			int var5 = arg0.field409 * 128 + arg0.field373 * 64;
			int var6 = arg0.field408 * 128 + arg0.field373 * 64;
			int var7 = arg0.field410 * 128 + arg0.field373 * 64;
			arg0.field369 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field370 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field421 = 0;

		if (arg0.field413 == 0) {
			arg0.field416 = 1024;
		}

		if (arg0.field413 == 1) {
			arg0.field416 = 1536;
		}

		if (arg0.field413 == 2) {
			arg0.field416 = 0;
		}

		if (arg0.field413 == 3) {
			arg0.field416 = 512;
		}

		arg0.field371 = arg0.field416;
	}

	@ObfuscatedName("client.b(Lz;I)V")
	public final void method523(class26 arg0) {
		arg0.field394 = arg0.field374;
		if (arg0.field417 == 0) {
			arg0.field421 = 0;
		} else {
			if (arg0.field397 != -1 && arg0.field400 == 0) {
				class66 var2 = class66.field979[arg0.field397];
				if (arg0.field422 > 0 && var2.field991 == 0) {
					arg0.field421++;
					return;
				}

				if (arg0.field422 <= 0 && var2.field992 == 0) {
					arg0.field421++;
					return;
				}
			}

			int var3 = arg0.field369;
			int var4 = arg0.field370;
			int var5 = arg0.field418[arg0.field417 - 1] * 128 + arg0.field373 * 64;
			int var6 = arg0.field419[arg0.field417 - 1] * 128 + arg0.field373 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field416 = 1280;
					} else if (var4 > var6) {
						arg0.field416 = 1792;
					} else {
						arg0.field416 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field416 = 768;
					} else if (var4 > var6) {
						arg0.field416 = 256;
					} else {
						arg0.field416 = 512;
					}
				} else if (var4 < var6) {
					arg0.field416 = 1024;
				} else {
					arg0.field416 = 0;
				}

				int var7 = arg0.field416 - arg0.field371 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field377;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field376;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field379;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field378;
				}

				if (var8 == -1) {
					var8 = arg0.field376;
				}

				arg0.field394 = var8;
				int var9 = 4;
				if (arg0.field416 != arg0.field371 && arg0.field391 == -1) {
					var9 = 2;
				}

				if (arg0.field417 > 2) {
					var9 = 6;
				}

				if (arg0.field417 > 3) {
					var9 = 8;
				}

				if (arg0.field421 > 0 && arg0.field417 > 1) {
					var9 = 8;
					arg0.field421--;
				}

				if (arg0.field420[arg0.field417 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field394 == arg0.field376 && arg0.field380 != -1) {
					arg0.field394 = arg0.field380;
				}

				if (var3 < var5) {
					arg0.field369 += var9;
					if (arg0.field369 > var5) {
						arg0.field369 = var5;
					}
				} else if (var3 > var5) {
					arg0.field369 -= var9;
					if (arg0.field369 < var5) {
						arg0.field369 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field370 += var9;
					if (arg0.field370 > var6) {
						arg0.field370 = var6;
					}
				} else if (var4 > var6) {
					arg0.field370 -= var9;
					if (arg0.field370 < var6) {
						arg0.field370 = var6;
					}
				}

				if (arg0.field369 == var5 && arg0.field370 == var6) {
					arg0.field417--;

					if (arg0.field422 > 0) {
						arg0.field422--;
						return;
					}
				}
			} else {
				arg0.field369 = var5;
				arg0.field370 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(Lz;B)V")
	public final void method524(class26 arg0) {
		if (arg0.field391 != -1 && arg0.field391 < 32768) {
			class27 var2 = field1354[arg0.field391];
			if (var2 != null) {
				int var3 = arg0.field369 - var2.field369;
				int var4 = arg0.field370 - var2.field370;
				if (var3 != 0 || var4 != 0) {
					arg0.field416 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field391 >= 32768) {
			int var5 = arg0.field391 - 32768;
			if (field1041 == var5) {
				var5 = field1402;
			}

			class28 var6 = field1403[var5];
			if (var6 != null) {
				int var7 = arg0.field369 - var6.field369;
				int var8 = arg0.field370 - var6.field370;
				if (var7 != 0 || var8 != 0) {
					arg0.field416 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field392 != 0 || arg0.field393 != 0) && (arg0.field417 == 0 || arg0.field421 > 0)) {
			int var9 = arg0.field369 - (arg0.field392 - field1203 - field1203) * 64;
			int var10 = arg0.field370 - (arg0.field393 - field1204 - field1204) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field416 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field392 = 0;
			arg0.field393 = 0;
		}

		int var11 = arg0.field416 - arg0.field371 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field371 = arg0.field416;
			} else if (var11 > 1024) {
				arg0.field371 -= 32;
			} else {
				arg0.field371 += 32;
			}

			arg0.field371 &= 0x7FF;
			if (arg0.field394 == arg0.field374 && arg0.field416 != arg0.field371) {
				if (arg0.field375 != -1) {
					arg0.field394 = arg0.field375;
					return;
				}

				arg0.field394 = arg0.field376;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Lz;B)V")
	public final void method525(class26 arg0) {
		arg0.field372 = false;

		if (arg0.field394 != -1) {
			class66 var2 = class66.field979[arg0.field394];
			arg0.field396++;
			if (arg0.field395 < var2.field980 && arg0.field396 > var2.method384(arg0.field395)) {
				arg0.field396 = 0;
				arg0.field395++;
			}

			if (arg0.field395 >= var2.field980) {
				arg0.field396 = 0;
				arg0.field395 = 0;
			}
		}

		if (arg0.field402 != -1 && field1446 >= arg0.field405) {
			if (arg0.field403 < 0) {
				arg0.field403 = 0;
			}

			class66 var3 = class68.field998[arg0.field402].field1002;
			arg0.field404++;
			while (arg0.field403 < var3.field980 && arg0.field404 > var3.method384(arg0.field403)) {
				arg0.field404 -= var3.method384(arg0.field403);
				arg0.field403++;
			}

			if (arg0.field403 >= var3.field980 && (arg0.field403 < 0 || arg0.field403 >= var3.field980)) {
				arg0.field402 = -1;
			}
		}

		if (arg0.field397 != -1 && arg0.field400 <= 1) {
			class66 var4 = class66.field979[arg0.field397];
			if (var4.field991 == 1 && arg0.field422 > 0 && arg0.field411 <= field1446 && arg0.field412 < field1446) {
				arg0.field400 = 1;
				return;
			}
		}

		if (arg0.field397 != -1 && arg0.field400 == 0) {
			class66 var5 = class66.field979[arg0.field397];
			arg0.field399++;
			while (arg0.field398 < var5.field980 && arg0.field399 > var5.method384(arg0.field398)) {
				arg0.field399 -= var5.method384(arg0.field398);
				arg0.field398++;
			}

			if (arg0.field398 >= var5.field980) {
				arg0.field398 -= var5.field984;
				arg0.field401++;
				if (arg0.field401 >= var5.field990) {
					arg0.field397 = -1;
				}

				if (arg0.field398 < 0 || arg0.field398 >= var5.field980) {
					arg0.field397 = -1;
				}
			}

			arg0.field372 = var5.field986;
		}

		if (arg0.field400 > 0) {
			arg0.field400--;
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method526() {
		if (field1363) {
			field1363 = false;
			field1045.method269(4, field9, 0);
			field1046.method269(357, field9, 0);
			field1047.method269(4, field9, 722);
			field1048.method269(205, field9, 743);
			field1049.method269(0, field9, 0);
			field1050.method269(4, field9, 516);
			field1051.method269(205, field9, 516);
			field1052.method269(357, field9, 496);
			field1053.method269(338, field9, 0);
			field1337 = true;
			field1129 = true;
			field1193 = true;
			field1340 = true;

			if (field1311 != 2) {
				field1431.method269(4, field9, 4);
				field1430.method269(4, field9, 550);
			}
		}

		if (field1311 == 2) {
			method472();
		}

		if (field1201 && field1319 == 1) {
			field1337 = true;
		}

		if (field1265 != -1) {
			boolean var1 = method441(field1265, field1167);
			if (var1) {
				field1337 = true;
			}
		}

		if (field1103 == 2) {
			field1337 = true;
		}

		if (field1226 == 2) {
			field1337 = true;
		}

		if (field1337) {
			method515();
			field1337 = false;
		}

		if (field1389 == -1) {
			field1157.field77 = field1277 - field1290 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method552(77, false, 463, field18 - 357, field1157, 0, field17 - 17, field1277);
			}

			int var2 = field1277 - field1157.field77 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1277 - 77) {
				var2 = field1277 - 77;
			}

			if (field1290 != var2) {
				field1290 = var2;
				field1129 = true;
			}
		}

		if (field1389 != -1) {
			boolean var3 = method441(field1389, field1167);
			if (var3) {
				field1129 = true;
			}
		}

		if (field1103 == 3) {
			field1129 = true;
		}

		if (field1226 == 3) {
			field1129 = true;
		}

		if (field1260 != null) {
			field1129 = true;
		}

		if (field1201 && field1319 == 2) {
			field1129 = true;
		}

		if (field1129) {
			method450();
			field1129 = false;
		}

		if (field1311 == 2) {
			method504();
			field1430.method269(4, field9, 550);
		}

		if (field1392 != -1) {
			field1193 = true;
		}

		if (field1193) {
			if (field1392 != -1 && field1392 == field1085) {
				field1392 = -1;
				field1382.method228(243);
				field1382.method229(field1085);
			}

			field1193 = false;
			field1302.method268();
			field1137.method212(0, 0);

			if (field1265 == -1) {
				if (field1250[field1085] != -1) {
					if (field1085 == 0) {
						field1291.method212(10, 22);
					}

					if (field1085 == 1) {
						field1292.method212(8, 54);
					}

					if (field1085 == 2) {
						field1292.method212(8, 82);
					}

					if (field1085 == 3) {
						field1293.method212(8, 110);
					}

					if (field1085 == 4) {
						field1295.method212(8, 153);
					}

					if (field1085 == 5) {
						field1295.method212(8, 181);
					}

					if (field1085 == 6) {
						field1294.method212(9, 209);
					}
				}

				if (field1250[0] != -1 && (field1392 != 0 || field1446 % 20 < 10)) {
					field1251[0].method212(13, 29);
				}

				if (field1250[1] != -1 && (field1392 != 1 || field1446 % 20 < 10)) {
					field1251[1].method212(11, 53);
				}

				if (field1250[2] != -1 && (field1392 != 2 || field1446 % 20 < 10)) {
					field1251[2].method212(11, 82);
				}

				if (field1250[3] != -1 && (field1392 != 3 || field1446 % 20 < 10)) {
					field1251[3].method212(12, 115);
				}

				if (field1250[4] != -1 && (field1392 != 4 || field1446 % 20 < 10)) {
					field1251[4].method212(13, 153);
				}

				if (field1250[5] != -1 && (field1392 != 5 || field1446 % 20 < 10)) {
					field1251[5].method212(11, 180);
				}

				if (field1250[6] != -1 && (field1392 != 6 || field1446 % 20 < 10)) {
					field1251[6].method212(13, 208);
				}
			}

			field1302.method269(160, field9, 516);
			field1301.method268();
			field1136.method212(0, 0);

			if (field1265 == -1) {
				if (field1250[field1085] != -1) {
					if (field1085 == 7) {
						field1116.method212(0, 42);
					}

					if (field1085 == 8) {
						field1117.method212(0, 74);
					}

					if (field1085 == 9) {
						field1117.method212(0, 102);
					}

					if (field1085 == 10) {
						field1118.method212(1, 130);
					}

					if (field1085 == 11) {
						field1120.method212(0, 173);
					}

					if (field1085 == 12) {
						field1120.method212(0, 201);
					}

					if (field1085 == 13) {
						field1119.method212(0, 229);
					}
				}

				if (field1250[8] != -1 && (field1392 != 8 || field1446 % 20 < 10)) {
					field1251[7].method212(2, 74);
				}

				if (field1250[9] != -1 && (field1392 != 9 || field1446 % 20 < 10)) {
					field1251[8].method212(3, 102);
				}

				if (field1250[10] != -1 && (field1392 != 10 || field1446 % 20 < 10)) {
					field1251[9].method212(4, 137);
				}

				if (field1250[11] != -1 && (field1392 != 11 || field1446 % 20 < 10)) {
					field1251[10].method212(2, 174);
				}

				if (field1250[12] != -1 && (field1392 != 12 || field1446 % 20 < 10)) {
					field1251[11].method212(2, 201);
				}

				if (field1250[13] != -1 && (field1392 != 13 || field1446 % 20 < 10)) {
					field1251[12].method212(2, 226);
				}
			}

			field1301.method269(466, field9, 496);
			field1431.method268();
		}

		if (field1340) {
			field1340 = false;
			field1300.method268();
			field1135.method212(0, 0);
			field1198.method215(28, 55, true, "Public chat", 0xFFFFFF);

			if (field1313 == 0) {
				field1198.method215(41, 55, true, "On", 0xFF00);
			}

			if (field1313 == 1) {
				field1198.method215(41, 55, true, "Friends", 0xFFFF00);
			}

			if (field1313 == 2) {
				field1198.method215(41, 55, true, "Off", 0xFF0000);
			}

			if (field1313 == 3) {
				field1198.method215(41, 55, true, "Hide", 0xFFFF);
			}

			field1198.method215(28, 184, true, "Private chat", 0xFFFFFF);

			if (field1448 == 0) {
				field1198.method215(41, 184, true, "On", 0xFF00);
			}

			if (field1448 == 1) {
				field1198.method215(41, 184, true, "Friends", 0xFFFF00);
			}

			if (field1448 == 2) {
				field1198.method215(41, 184, true, "Off", 0xFF0000);
			}

			field1198.method215(28, 324, true, "Trade/duel", 0xFFFFFF);

			if (field1187 == 0) {
				field1198.method215(41, 324, true, "On", 0xFF00);
			}

			if (field1187 == 1) {
				field1198.method215(41, 324, true, "Friends", 0xFFFF00);
			}

			if (field1187 == 2) {
				field1198.method215(41, 324, true, "Off", 0xFF0000);
			}

			field1198.method215(33, 458, true, "Report abuse", 0xFFFFFF);
			field1300.method269(453, field9, 0);
			field1431.method268();
		}

		field1167 = 0;
	}

	@ObfuscatedName("client.i(II)V")
	public final void method527(int arg0) {
		int var2 = class70.field1018[arg0].field1026;
		if (var2 != 0) {
			int var3 = field1287[arg0];
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

				class60.field937.method117();
				field1363 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1288;

				if (var3 == 0) {
					method494(field1288, 0);
					field1288 = true;
				}

				if (var3 == 1) {
					method494(field1288, -400);
					field1288 = true;
				}

				if (var3 == 2) {
					method494(field1288, -800);
					field1288 = true;
				}

				if (var3 == 3) {
					method494(field1288, -1200);
					field1288 = true;
				}

				if (var3 == 4) {
					field1288 = false;
				}

				if (field1288 != var4 && !field1084) {
					if (field1288) {
						field1422 = field1220;
						field1423 = false;
						field1121.method289(2, field1422);
					} else {
						method435();
					}

					field1305 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1329 = true;
					method436(0);
				}

				if (var3 == 1) {
					field1329 = true;
					method436(-400);
				}

				if (var3 == 2) {
					field1329 = true;
					method436(-800);
				}

				if (var3 == 3) {
					field1329 = true;
					method436(-1200);
				}

				if (var3 == 4) {
					field1329 = false;
				}
			}

			if (var2 == 5) {
				field1415 = var3;
			}

			if (var2 == 6) {
				field1369 = var3;
			}

			if (var2 == 8) {
				field1357 = var3;
				field1129 = true;
			}

			if (var2 == 9) {
				field1275 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBIII)V")
	public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg6 >= 1 && arg2 <= 102 && arg6 <= 102) {
			if (field1084 && field1078 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = field1249.method90(arg1, arg2, arg6);
			}

			if (arg5 == 1) {
				var8 = field1249.method91(arg2, arg6, arg1);
			}

			if (arg5 == 2) {
				var8 = field1249.method92(arg1, arg2, arg6);
			}

			if (arg5 == 3) {
				var8 = field1249.method93(arg1, arg2, arg6);
			}

			if (var8 != 0) {
				int var12 = field1249.method94(arg1, arg2, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					field1249.method81(arg2, arg6, arg1);
					class57 var16 = class57.method334(var13);
					if (var16.field827) {
						field1067[arg1].method366(arg2, arg6, var14, var16.field828, var15);
					}
				}

				if (arg5 == 1) {
					field1249.method82(arg6, arg1, arg2);
				}

				if (arg5 == 2) {
					field1249.method83(arg6, arg2, arg1);
					class57 var17 = class57.method334(var13);
					if (var17.field825 + arg2 > 103 || var17.field825 + arg6 > 103 || var17.field826 + arg2 > 103 || var17.field826 + arg6 > 103) {
						return;
					}

					if (var17.field827) {
						field1067[arg1].method367(arg6, var17.field825, arg2, var17.field826, var15, var17.field828);
					}
				}

				if (arg5 == 3) {
					field1249.method84(arg2, arg1, arg6);
					class57 var18 = class57.method334(var13);
					if (var18.field827 && var18.field829) {
						field1067[arg1].method369(arg2, arg6);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field1184[1][arg2][arg6] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				class3.method31(field1178, arg3, field1249, var19, arg2, field1067[arg1], arg0, arg1, arg4, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method529() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1390 + field1376 & 0x7FF;
				int var4 = class35.field583[var3];
				int var5 = class35.field584[var3];
				var4 = (field1308 + 256) * var4 >> 8;
				var5 = (field1308 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1090.field369 + var6 >> 7;
				int var9 = field1090.field370 - var7 >> 7;
				boolean var10 = method499(true, 0, 0, var8, 0, 1, field1090.field418[0], 0, var9, 0, field1090.field419[0]);
				if (var10) {
					field1382.method229(var1);
					field1382.method229(var2);
					field1382.method230(field1376);
					field1382.method229(57);
					field1382.method229(field1390);
					field1382.method229(field1308);
					field1382.method229(89);
					field1382.method230(field1090.field369);
					field1382.method230(field1090.field370);
					field1382.method229(field1087);
					field1382.method229(63);
					return;
				}
			}
		}
	}

	public final void init() {
		field1081 = Integer.parseInt(getParameter("nodeid"));
		field1082 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method432();
		} else {
			method486();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1083 = false;
		} else {
			field1083 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method530() {
		int var1 = (field1090.field369 >> 7) + field1203;
		int var2 = (field1090.field370 >> 7) + field1204;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1099 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1099 = (var2 - 9920) / 8 + 1;
		} else {
			field1099 = 0;
		}

		field1134 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1134 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1134 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1134 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1134 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1134 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1134 = 1;
			}
		}

		if (field1134 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1134 = 2;
		}

		field1353 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1353 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1353 = 1;
		}

		if (field1353 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1353 = 0;
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method531() {
		if (field1314 >= 2 || field1124 != 0 || field1364 != 0) {
			String var1;
			if (field1124 == 1 && field1314 < 2) {
				var1 = "Use " + field1128 + " with...";
			} else if (field1364 == 1 && field1314 < 2) {
				var1 = field1367 + "...";
			} else {
				var1 = field1066[field1314 - 1];
			}

			if (field1314 > 2) {
				var1 = var1 + "@whi@ / " + (field1314 - 2) + " more options";
			}

			field1199.method220(field1446 / 1000, 15, 4, 0xFFFFFF, var1, true);
		}
	}

	@ObfuscatedName("client.a(IIIIIIBIII)V")
	public final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1148.method258(); var11 != null; var11 = (class41) field1148.method260()) {
			if (var11.field641 == arg1 && var11.field643 == arg5 && var11.field644 == arg0 && var11.field642 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field641 = arg1;
			var10.field642 = arg2;
			var10.field643 = arg5;
			var10.field644 = arg0;
			method549(var10);
			field1148.method255(var10);
		}

		var10.field648 = arg4;
		var10.field650 = arg7;
		var10.field649 = arg8;
		var10.field651 = arg6;
		var10.field652 = arg3;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = class32.field551[var7];
			int var13 = class32.field552[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class32.field551[var8];
			int var16 = class32.field552[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1143 = arg4 - var9;
		field1144 = arg0 - var10;
		field1145 = arg3 - var11;
		field1146 = arg5;
		field1147 = arg2;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method534() {
		int var1 = field1199.method216("Choose Option");
		for (int var2 = 0; var2 < field1314; var2++) {
			int var3 = field1199.method216(field1066[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1314 * 15 + 21;
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
			field1319 = 0;
			field1320 = var5;
			field1321 = var6;
			field1322 = var1;
			field1323 = field1314 * 15 + 22;
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
			field1319 = 1;
			field1320 = var7;
			field1321 = var8;
			field1322 = var1;
			field1323 = field1314 * 15 + 22;
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
			field1319 = 2;
			field1320 = var9;
			field1321 = var10;
			field1322 = var1;
			field1323 = field1314 * 15 + 22;
		}
	}

	@ObfuscatedName("client.s(B)Z")
	public final boolean method535() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.b(I)V")
	public final void method9() {
		if (field1088 || field1269 || field1345) {
			method455();
		} else {
			field1437++;

			if (field1075) {
				method526();
			} else {
				method476();
			}

			field1076 = 0;
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method536(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1207; var3++) {
				if (field1168[var3] == arg0) {
					field1207--;
					field1337 = true;

					for (int var4 = var3; var4 < field1207; var4++) {
						field1140[var4] = field1140[var4 + 1];
						field1374[var4] = field1374[var4 + 1];
						field1168[var4] = field1168[var4 + 1];
					}

					field1382.method228(61);
					field1382.method235(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method537() {
		field1382.method228(245);

		if (field1265 != -1) {
			field1265 = -1;
			field1337 = true;
			field1284 = false;
			field1193 = true;
		}

		if (field1389 != -1) {
			field1389 = -1;
			field1129 = true;
			field1284 = false;
		}

		field1111 = -1;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method538() {
		field1166 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1191) {
				field1381++;
				method479();
				method479();
				method561();
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

		field1166 = false;
	}

	@ObfuscatedName("client.a(ILmb;Z)V")
	public final void method539(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1406; var3++) {
			int var4 = field1407[var3];
			class27 var5 = field1354[var4];
			int var6 = arg1.method239();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method239();
				int var8 = arg1.method239();
				var5.method128(var7, var8);
				var5.field388 = field1446 + 300;
				var5.field389 = arg1.method239();
				var5.field390 = arg1.method239();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg1.method241();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field397 == var9) {
					var5.field401 = 0;
				}

				int var10 = arg1.method239();
				if (var5.field397 == var9 && var9 != -1) {
					int var11 = class66.field979[var9].field993;
					if (var11 == 1) {
						var5.field398 = 0;
						var5.field399 = 0;
						var5.field400 = var10;
						var5.field401 = 0;
					}

					if (var11 == 2) {
						var5.field401 = 0;
					}
				} else if (var9 == -1 || var5.field397 == -1 || class66.field979[var9].field987 >= class66.field979[var5.field397].field987) {
					var5.field397 = var9;
					var5.field398 = 0;
					var5.field399 = 0;
					var5.field400 = var10;
					var5.field401 = 0;
					var5.field422 = var5.field417;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field391 = arg1.method241();
				if (var5.field391 == 0xFFFF) {
					var5.field391 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field381 = arg1.method246();
				var5.field382 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg1.method239();
				int var13 = arg1.method239();
				var5.method128(var12, var13);
				var5.field388 = field1446 + 300;
				var5.field389 = arg1.method239();
				var5.field390 = arg1.method239();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field423 = class59.method344(arg1.method241());
				var5.field376 = var5.field423.field872;
				var5.field377 = var5.field423.field873;
				var5.field378 = var5.field423.field874;
				var5.field379 = var5.field423.field875;
				var5.field374 = var5.field423.field871;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field402 = arg1.method241();
				int var14 = arg1.method244();
				var5.field406 = var14 >> 16;
				var5.field405 = (var14 & 0xFFFF) + field1446;
				var5.field403 = 0;
				var5.field404 = 0;

				if (var5.field405 > field1446) {
					var5.field403 = -1;
				}

				if (var5.field402 == 0xFFFF) {
					var5.field402 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field392 = arg1.method241();
				var5.field393 = arg1.method241();
			}
		}
	}

	@ObfuscatedName("client.b(Ljb;III)V")
	public final void method540(class36 arg0, int arg1, int arg2) {
		int var4 = field1390 + field1376 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class32.field551[var4];
			int var7 = class32.field552[var4];
			var6 = var6 * 256 / (field1308 + 256);
			var7 = var7 * 256 / (field1308 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method205(83 - var9 - arg0.field603 / 2 - 4, var8 + 94 - arg0.field602 / 2 + 4, field1253);
			} else {
				arg0.method199(83 - var9 - arg0.field603 / 2 - 4, var8 + 94 - arg0.field602 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;I)V")
	public final void method541(class37 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1316.length; var3++) {
			field1316[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1316[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1317[var9] = (field1316[var9 - 1] + field1316[var9 + 1] + field1316[var9 - 128] + field1316[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1316;
			field1316 = field1317;
			field1317 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field607; var12++) {
				for (int var13 = 0; var13 < arg0.field606; var13++) {
					if (arg0.field604[var11++] != 0) {
						int var14 = var13 + arg0.field608 + 16;
						int var15 = var12 + arg0.field609 + 16;
						int var16 = (var15 << 7) + var14;
						field1316[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(B)V")
	public final void method542() {
		for (class33 var1 = (class33) field1333.method258(); var1 != null; var1 = (class33) field1333.method260()) {
			if (field1078 != var1.field557 || var1.field563) {
				var1.method120();
			} else if (field1446 >= var1.field556) {
				var1.method164(field1167);

				if (var1.field563) {
					var1.method120();
				} else {
					field1249.method75(var1, var1.field560, 0, -1, false, var1.field557, var1.field559, 60, var1.field558);
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method7() {
		if (!field1088 && !field1269 && !field1345) {
			field1446++;

			if (field1075) {
				method482();
			} else {
				method511();
			}

			method492();
		}
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method543(int arg0, class39 arg1) {
		arg1.method249();
		int var3 = arg1.method250(1);
		if (var3 != 0) {
			int var4 = arg1.method250(2);
			if (var4 == 0) {
				field1407[field1406++] = field1402;
			} else if (var4 == 1) {
				int var5 = arg1.method250(3);
				field1090.method125(var5, false);
				int var6 = arg1.method250(1);
				if (var6 == 1) {
					field1407[field1406++] = field1402;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method250(3);
				field1090.method125(var7, true);
				int var8 = arg1.method250(3);
				field1090.method125(var8, true);
				int var9 = arg1.method250(1);
				if (var9 == 1) {
					field1407[field1406++] = field1402;
				}
			} else if (var4 == 3) {
				field1078 = arg1.method250(2);
				int var10 = arg1.method250(7);
				int var11 = arg1.method250(7);
				int var12 = arg1.method250(1);
				field1090.method124(var10, var12 == 1, var11);
				int var13 = arg1.method250(1);
				if (var13 == 1) {
					field1407[field1406++] = field1402;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public final void method544(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1232 != -1) {
			field1260 = arg2;
			field23 = 0;
		}

		if (field1389 == -1) {
			field1129 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1096[var4] = field1096[var4 - 1];
			field1097[var4] = field1097[var4 - 1];
			field1098[var4] = field1098[var4 - 1];
		}

		field1096[0] = arg0;
		field1097[0] = arg1;
		field1098[0] = arg2;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method545() {
		field1191 = false;
		while (field1166) {
			field1191 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1141 = null;
		field1142 = null;
		field1447 = null;
		field1296 = null;
		field1297 = null;
		field1298 = null;
		field1299 = null;
		field1316 = null;
		field1317 = null;
		field1442 = null;
		field1443 = null;
		field1235 = null;
		field1236 = null;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method546() {
		if (field1124 == 0 && field1364 == 0) {
			field1066[field1314] = "Walk here";
			field1173[field1314] = 660;
			field1171[field1314] = field17;
			field1172[field1314] = field18;
			field1314++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class32.field549; var2++) {
			int var3 = class32.field550[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1249.method94(field1078, var4, var5, var3) >= 0) {
					class57 var8 = class57.method334(var7);
					if (field1124 == 1) {
						field1066[field1314] = "Use " + field1128 + " with @cya@" + var8.field821;
						field1173[field1314] = 450;
						field1174[field1314] = var3;
						field1171[field1314] = var4;
						field1172[field1314] = var5;
						field1314++;
					} else if (field1364 != 1) {
						if (var8.field837 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field837[var9] != null) {
									field1066[field1314] = var8.field837[var9] + " @cya@" + var8.field821;

									if (var9 == 0) {
										field1173[field1314] = 285;
									}

									if (var9 == 1) {
										field1173[field1314] = 504;
									}

									if (var9 == 2) {
										field1173[field1314] = 364;
									}

									if (var9 == 3) {
										field1173[field1314] = 581;
									}

									if (var9 == 4) {
										field1173[field1314] = 1501;
									}

									field1174[field1314] = var3;
									field1171[field1314] = var4;
									field1172[field1314] = var5;
									field1314++;
								}
							}
						}

						field1066[field1314] = "Examine @cya@" + var8.field821;
						field1173[field1314] = 1175;
						field1174[field1314] = var3;
						field1171[field1314] = var4;
						field1172[field1314] = var5;
						field1314++;
					} else if ((field1366 & 0x4) == 4) {
						field1066[field1314] = field1367 + " @cya@" + var8.field821;
						field1173[field1314] = 55;
						field1174[field1314] = var3;
						field1171[field1314] = var4;
						field1172[field1314] = var5;
						field1314++;
					}
				}

				if (var6 == 1) {
					class27 var10 = field1354[var7];
					if (var10.field423.field868 == 1 && (var10.field369 & 0x7F) == 0x40 && (var10.field370 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1355; var11++) {
							class27 var12 = field1354[field1356[var11]];
							if (var12 != null && var10 != var12 && var12.field423.field868 == 1 && var10.field369 == var12.field369 && var10.field370 == var12.field370) {
								method512(var5, var12.field423, var4, field1356[var11]);
							}
						}
					}

					method512(var5, var10.field423, var4, var7);
				}

				if (var6 == 0) {
					class28 var13 = field1403[var7];
					if ((var13.field369 & 0x7F) == 0x40 && (var13.field370 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1355; var14++) {
							class27 var15 = field1354[field1356[var14]];
							if (var15 != null && var15.field423.field868 == 1 && var13.field369 == var15.field369 && var13.field370 == var15.field370) {
								method512(var5, var15.field423, var4, field1356[var14]);
							}
						}

						for (int var16 = 0; var16 < field1404; var16++) {
							class28 var17 = field1403[field1405[var16]];
							if (var17 != null && var13 != var17 && var13.field369 == var17.field369 && var13.field370 == var17.field370) {
								method489(field1405[var16], var4, var5, var17);
							}
						}
					}

					method489(var7, var4, var5, var13);
				}

				if (var6 == 3) {
					class42 var18 = field1183[field1078][var4][var5];
					if (var18 != null) {
						for (class30 var19 = (class30) var18.method259(); var19 != null; var19 = (class30) var18.method261()) {
							class60 var20 = class60.method350(var19.field456);
							if (field1124 == 1) {
								field1066[field1314] = "Use " + field1128 + " with @lre@" + var20.field899;
								field1173[field1314] = 217;
								field1174[field1314] = var19.field456;
								field1171[field1314] = var4;
								field1172[field1314] = var5;
								field1314++;
							} else if (field1364 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field913 != null && var20.field913[var21] != null) {
										field1066[field1314] = var20.field913[var21] + " @lre@" + var20.field899;

										if (var21 == 0) {
											field1173[field1314] = 224;
										}

										if (var21 == 1) {
											field1173[field1314] = 993;
										}

										if (var21 == 2) {
											field1173[field1314] = 99;
										}

										if (var21 == 3) {
											field1173[field1314] = 746;
										}

										if (var21 == 4) {
											field1173[field1314] = 877;
										}

										field1174[field1314] = var19.field456;
										field1171[field1314] = var4;
										field1172[field1314] = var5;
										field1314++;
									} else if (var21 == 2) {
										field1066[field1314] = "Take @lre@" + var20.field899;
										field1173[field1314] = 99;
										field1174[field1314] = var19.field456;
										field1171[field1314] = var4;
										field1172[field1314] = var5;
										field1314++;
									}
								}

								field1066[field1314] = "Examine @lre@" + var20.field899;
								field1173[field1314] = 1102;
								field1174[field1314] = var19.field456;
								field1171[field1314] = var4;
								field1172[field1314] = var5;
								field1314++;
							} else if ((field1366 & 0x1) == 1) {
								field1066[field1314] = field1367 + " @lre@" + var20.field899;
								field1173[field1314] = 965;
								field1174[field1314] = var19.field456;
								field1171[field1314] = var4;
								field1172[field1314] = var5;
								field1314++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method547() {
		field1141 = new class37(field1380, "titlebox", 0);
		field1142 = new class37(field1380, "titlebutton", 0);
		field1447 = new class37[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1447[var1] = new class37(field1380, "runes", var1);
		}

		field1235 = new class36(128, 265);
		field1236 = new class36(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1235.field597[var2] = field1058.field657[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1236.field597[var3] = field1059.field657[var3];
		}

		field1297 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1297[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1297[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1297[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1297[var7 + 192] = 0xFFFFFF;
		}

		field1298 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1298[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1298[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1298[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1298[var11 + 192] = 0xFFFFFF;
		}

		field1299 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1299[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1299[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1299[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1299[var15 + 192] = 0xFFFFFF;
		}

		field1296 = new int[256];
		field1316 = new int[32768];
		field1317 = new int[32768];
		method541(null);
		field1442 = new int[32768];
		field1443 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1191) {
			field1230 = true;
			field1191 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void method548(int arg0) {
		if (arg0 >= 0) {
			if (field1221) {
				field1221 = false;
				field1129 = true;
			}

			int var2 = field1171[arg0];
			int var3 = field1172[arg0];
			int var4 = field1173[arg0];
			int var5 = field1174[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 1501) {
				field1352 += field1204;
				if (field1352 >= 92) {
					field1382.method228(250);
					field1382.method233(0);
				}

				method507(var5, 86, var3, var2);
			}

			if (var4 == 450 && method507(var5, 147, var3, var2)) {
				field1382.method230(field1127);
				field1382.method230(field1125);
				field1382.method230(field1126);
			}

			if (var4 == 679) {
				String var6 = field1066[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = class52.method310(var6.substring(var7 + 5).trim());
					int var10 = -1;
					for (int var11 = 0; var11 < field1207; var11++) {
						if (field1168[var11] == var8) {
							var10 = var11;
							break;
						}
					}

					if (var10 != -1 && field1374[var10] > 0) {
						field1129 = true;
						field1221 = false;
						field1043 = true;
						field1186 = "";
						field1338 = 3;
						field1426 = field1168[var10];
						field1202 = "Enter message to send to " + field1140[var10];
					}
				}
			}

			if (var4 == 903 || var4 == 363) {
				String var12 = field1066[arg0];
				int var13 = var12.indexOf("@whi@");
				if (var13 != -1) {
					var12 = var12.substring(var13 + 5).trim();
					String var14 = class52.method314(class52.method311(class52.method310(var12)));
					boolean var15 = false;
					for (int var16 = 0; var16 < field1404; var16++) {
						class28 var17 = field1403[field1405[var16]];
						if (var17 != null && var17.field424 != null && var17.field424.equalsIgnoreCase(var14)) {
							method499(false, 1, 0, var17.field418[0], 0, 2, field1090.field418[0], 0, var17.field419[0], 1, field1090.field419[0]);

							if (var4 == 903) {
								field1382.method228(54);
							}

							if (var4 == 363) {
								field1382.method228(135);
							}

							field1382.method230(field1405[var16]);
							var15 = true;
							break;
						}
					}

					if (!var15) {
						method544(0, "", "Unable to find " + var14);
					}
				}
			}

			if (var4 == 367) {
				class28 var18 = field1403[var5];
				if (var18 != null) {
					method499(false, 1, 0, var18.field418[0], 0, 2, field1090.field418[0], 0, var18.field419[0], 1, field1090.field419[0]);
					field1438 = field24;
					field1439 = field25;
					field1441 = 2;
					field1440 = 0;
					field1382.method228(210);
					field1382.method230(var5);
					field1382.method230(field1127);
					field1382.method230(field1125);
					field1382.method230(field1126);
				}
			}

			if (var4 == 1607) {
				class27 var19 = field1354[var5];
				if (var19 != null) {
					String var20;
					if (var19.field423.field867 == null) {
						var20 = "It's a " + var19.field423.field866 + ".";
					} else {
						var20 = new String(var19.field423.field867);
					}

					method544(0, "", var20);
				}
			}

			if (var4 == 1102) {
				class60 var21 = class60.method350(var5);
				String var22;
				if (var21.field900 == null) {
					var22 = "It's a " + var21.field899 + ".";
				} else {
					var22 = new String(var21.field900);
				}

				method544(0, "", var22);
			}

			if (var4 == 581) {
				if ((var5 & 0x3) == 0) {
					field1175++;
				}

				if (field1175 >= 99) {
					field1382.method228(87);
					field1382.method233(0);
				}

				method507(var5, 204, var3, var2);
			}

			if (var4 == 960) {
				field1382.method228(177);
				field1382.method230(var3);
				class4 var23 = class4.field57[var3];
				if (var23.field72 != null && var23.field72[0][0] == 5) {
					int var24 = var23.field72[0][1];
					if (field1287[var24] != var23.field74[0]) {
						field1287[var24] = var23.field74[0];
						method527(var24);
						field1337 = true;
					}
				}
			}

			if (var4 == 55 && method507(var5, 208, var3, var2)) {
				field1382.method230(field1365);
			}

			if (var4 == 947) {
				method537();
			}

			if (var4 == 951) {
				class4 var25 = class4.field57[var3];
				boolean var26 = true;
				if (var25.field66 > 0) {
					var26 = method448(var25);
				}

				if (var26) {
					field1382.method228(177);
					field1382.method230(var3);
				}
			}

			if (var4 == 1175) {
				int var27 = var5 >> 14 & 0x7FFF;
				class57 var28 = class57.method334(var27);
				String var29;
				if (var28.field822 == null) {
					var29 = "It's a " + var28.field821 + ".";
				} else {
					var29 = new String(var28.field822);
				}

				method544(0, "", var29);
			}

			if (var4 == 504) {
				method507(var5, 219, var3, var2);
			}

			if (var4 == 1773) {
				class60 var30 = class60.method350(var5);
				class4 var31 = class4.field57[var3];
				String var32;
				if (var31 != null && var31.field59[var2] >= 100000) {
					var32 = var31.field59[var2] + " x " + var30.field899;
				} else if (var30.field900 == null) {
					var32 = "It's a " + var30.field899 + ".";
				} else {
					var32 = new String(var30.field900);
				}

				method544(0, "", var32);
			}

			if (var4 == 660) {
				if (field1201) {
					field1249.method102(var2 - 4, var3 - 4);
				} else {
					field1249.method102(field24 - 4, field25 - 4);
				}
			}

			if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
				class27 var33 = field1354[var5];
				if (var33 != null) {
					method499(false, 1, 0, var33.field418[0], 0, 2, field1090.field418[0], 0, var33.field419[0], 1, field1090.field419[0]);
					field1438 = field24;
					field1439 = field25;
					field1441 = 2;
					field1440 = 0;

					if (var4 == 728) {
						field1382.method228(180);
					}

					if (var4 == 963) {
						field1382.method228(107);
					}

					if (var4 == 6) {
						if ((var5 & 0x3) == 0) {
							field1344++;
						}

						if (field1344 >= 124) {
							field1382.method228(95);
							field1382.method233(0);
						}

						field1382.method228(196);
					}

					if (var4 == 542) {
						field1382.method228(252);
					}

					if (var4 == 245) {
						if ((var5 & 0x3) == 0) {
							field1071++;
						}

						if (field1071 >= 85) {
							field1382.method228(186);
							field1382.method230(39596);
						}

						field1382.method228(43);
					}

					field1382.method230(var5);
				}
			}

			if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
				class28 var34 = field1403[var5];
				if (var34 != null) {
					method499(false, 1, 0, var34.field418[0], 0, 2, field1090.field418[0], 0, var34.field419[0], 1, field1090.field419[0]);
					field1438 = field24;
					field1439 = field25;
					field1441 = 2;
					field1440 = 0;

					if (var4 == 1544) {
						field1382.method228(172);
					}

					if (var4 == 1101) {
						field1382.method228(135);
					}

					if (var4 == 151) {
						field1310++;
						if (field1310 >= 90) {
							field1382.method228(171);
							field1382.method230(31114);
						}

						field1382.method228(165);
					}

					if (var4 == 1373) {
						field1382.method228(54);
					}

					field1382.method230(var5);
				}
			}

			if (var4 == 465) {
				field1382.method228(177);
				field1382.method230(var3);
				class4 var35 = class4.field57[var3];
				if (var35.field72 != null && var35.field72[0][0] == 5) {
					int var36 = var35.field72[0][1];
					field1287[var36] = 1 - field1287[var36];
					method527(var36);
					field1337 = true;
				}
			}

			if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
				String var37 = field1066[arg0];
				int var38 = var37.indexOf("@whi@");
				if (var38 != -1) {
					long var39 = class52.method310(var37.substring(var38 + 5).trim());
					if (var4 == 406) {
						method501(var39);
					}

					if (var4 == 436) {
						method459(var39);
					}

					if (var4 == 557) {
						method536(var39);
					}

					if (var4 == 556) {
						method485(var39);
					}
				}
			}

			if (var4 == 217) {
				boolean var41 = method499(false, 0, 0, var2, 0, 2, field1090.field418[0], 0, var3, 0, field1090.field419[0]);
				if (!var41) {
					method499(false, 1, 0, var2, 0, 2, field1090.field418[0], 0, var3, 1, field1090.field419[0]);
				}

				field1438 = field24;
				field1439 = field25;
				field1441 = 2;
				field1440 = 0;
				field1382.method228(143);
				field1382.method230(field1203 + var2);
				field1382.method230(field1204 + var3);
				field1382.method230(var5);
				field1382.method230(field1127);
				field1382.method230(field1125);
				field1382.method230(field1126);
			}

			if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
				if (var4 == 347) {
					field1382.method228(9);
				}

				if (var4 == 405) {
					field1306 += var5;
					if (field1306 >= 97) {
						field1382.method228(146);
						field1382.method232(0xE42D58);
					}

					field1382.method228(104);
				}

				if (var4 == 478) {
					if ((var2 & 0x3) == 0) {
						field1089++;
					}

					if (field1089 >= 90) {
						field1382.method228(74);
					}

					field1382.method228(194);
				}

				if (var4 == 422) {
					field1382.method228(115);
				}

				if (var4 == 38) {
					field1382.method228(193);
				}

				field1382.method230(var5);
				field1382.method230(var2);
				field1382.method230(var3);
				field1100 = 0;
				field1101 = var3;
				field1102 = var2;
				field1103 = 2;
				if (class4.field57[var3].field63 == field1111) {
					field1103 = 1;
				}

				if (class4.field57[var3].field63 == field1389) {
					field1103 = 3;
				}
			}

			if (var4 == 265) {
				class27 var43 = field1354[var5];
				if (var43 != null) {
					method499(false, 1, 0, var43.field418[0], 0, 2, field1090.field418[0], 0, var43.field419[0], 1, field1090.field419[0]);
					field1438 = field24;
					field1439 = field25;
					field1441 = 2;
					field1440 = 0;
					field1382.method228(141);
					field1382.method230(var5);
					field1382.method230(field1365);
				}
			}

			if (var4 == 900) {
				class27 var44 = field1354[var5];
				if (var44 != null) {
					method499(false, 1, 0, var44.field418[0], 0, 2, field1090.field418[0], 0, var44.field419[0], 1, field1090.field419[0]);
					field1438 = field24;
					field1439 = field25;
					field1441 = 2;
					field1440 = 0;
					field1382.method228(14);
					field1382.method230(var5);
					field1382.method230(field1127);
					field1382.method230(field1125);
					field1382.method230(field1126);
				}
			}

			if (var4 == 881) {
				field1382.method228(126);
				field1382.method230(var5);
				field1382.method230(var2);
				field1382.method230(var3);
				field1382.method230(field1127);
				field1382.method230(field1125);
				field1382.method230(field1126);
				field1100 = 0;
				field1101 = var3;
				field1102 = var2;
				field1103 = 2;
				if (class4.field57[var3].field63 == field1111) {
					field1103 = 1;
				}

				if (class4.field57[var3].field63 == field1389) {
					field1103 = 3;
				}
			}

			if (var4 == 965) {
				boolean var45 = method499(false, 0, 0, var2, 0, 2, field1090.field418[0], 0, var3, 0, field1090.field419[0]);
				if (!var45) {
					method499(false, 1, 0, var2, 0, 2, field1090.field418[0], 0, var3, 1, field1090.field419[0]);
				}

				field1438 = field24;
				field1439 = field25;
				field1441 = 2;
				field1440 = 0;
				field1382.method228(122);
				field1382.method230(field1203 + var2);
				field1382.method230(field1204 + var3);
				field1382.method230(var5);
				field1382.method230(field1365);
			}

			if (var4 == 930) {
				class4 var47 = class4.field57[var3];
				field1364 = 1;
				field1365 = var3;
				field1366 = var47.field117;
				field1124 = 0;
				field1337 = true;
				String var48 = var47.field115;
				if (var48.indexOf(" ") != -1) {
					var48 = var48.substring(0, var48.indexOf(" "));
				}

				String var49 = var47.field115;
				if (var49.indexOf(" ") != -1) {
					var49 = var49.substring(var49.indexOf(" ") + 1);
				}

				field1367 = var48 + " " + var47.field116 + " " + var49;

				if (field1366 == 16) {
					field1337 = true;
					field1085 = 3;
					field1193 = true;
				}
			} else if (var4 == 188) {
				field1124 = 1;
				field1125 = var2;
				field1126 = var3;
				field1127 = var5;
				field1128 = class60.method350(var5).field899;
				field1364 = 0;
				field1337 = true;
			} else {
				if (var4 == 364) {
					method507(var5, 226, var3, var2);
				}

				if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
					boolean var50 = method499(false, 0, 0, var2, 0, 2, field1090.field418[0], 0, var3, 0, field1090.field419[0]);
					if (!var50) {
						method499(false, 1, 0, var2, 0, 2, field1090.field418[0], 0, var3, 1, field1090.field419[0]);
					}

					field1438 = field24;
					field1439 = field25;
					field1441 = 2;
					field1440 = 0;

					if (var4 == 993) {
						field1382.method228(238);
					}

					if (var4 == 746) {
						field1382.method228(17);
					}

					if (var4 == 224) {
						field1382.method228(113);
					}

					if (var4 == 877) {
						field1382.method228(247);
					}

					if (var4 == 99) {
						field1382.method228(55);
					}

					field1382.method230(field1203 + var2);
					field1382.method230(field1204 + var3);
					field1382.method230(var5);
				}

				if (var4 == 44 && !field1284) {
					field1382.method228(239);
					field1382.method230(var3);
					field1284 = true;
				}

				if (var4 == 391) {
					field1382.method228(188);
					field1382.method230(var5);
					field1382.method230(var2);
					field1382.method230(var3);
					field1382.method230(field1365);
					field1100 = 0;
					field1101 = var3;
					field1102 = var2;
					field1103 = 2;
					if (class4.field57[var3].field63 == field1111) {
						field1103 = 1;
					}

					if (class4.field57[var3].field63 == field1389) {
						field1103 = 3;
					}
				}

				if (var4 == 651) {
					class28 var52 = field1403[var5];
					if (var52 != null) {
						method499(false, 1, 0, var52.field418[0], 0, 2, field1090.field418[0], 0, var52.field419[0], 1, field1090.field419[0]);
						field1438 = field24;
						field1439 = field25;
						field1441 = 2;
						field1440 = 0;
						field1382.method228(52);
						field1382.method230(var5);
						field1382.method230(field1365);
					}
				}

				if (var4 == 34) {
					String var53 = field1066[arg0];
					int var54 = var53.indexOf("@whi@");
					if (var54 != -1) {
						method537();
						field1156 = var53.substring(var54 + 5).trim();
						field1274 = false;

						for (int var55 = 0; var55 < class4.field57.length; var55++) {
							if (class4.field57[var55] != null && class4.field57[var55].field66 == 600) {
								field1237 = field1111 = class4.field57[var55].field63;
								break;
							}
						}
					}
				}

				if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
					if (var4 == 415) {
						if ((var3 & 0x3) == 0) {
							field1092++;
						}

						if (field1092 >= 55) {
							field1382.method228(119);
							field1382.method233(0);
						}

						field1382.method228(242);
					}

					if (var4 == 892) {
						if ((var2 & 0x3) == 0) {
							field1248++;
						}

						if (field1248 >= 130) {
							field1382.method228(233);
							field1382.method229(177);
						}

						field1382.method228(183);
					}

					if (var4 == 596) {
						field1382.method228(58);
					}

					if (var4 == 22) {
						field1382.method228(48);
					}

					if (var4 == 602) {
						field1382.method228(13);
					}

					field1382.method230(var5);
					field1382.method230(var2);
					field1382.method230(var3);
					field1100 = 0;
					field1101 = var3;
					field1102 = var2;
					field1103 = 2;
					if (class4.field57[var3].field63 == field1111) {
						field1103 = 1;
					}

					if (class4.field57[var3].field63 == field1389) {
						field1103 = 3;
					}
				}

				if (var4 == 285) {
					method507(var5, 1, var3, var2);
				}

				field1124 = 0;
				field1364 = 0;
				field1337 = true;
			}
		}
	}

	@ObfuscatedName("client.a(Lob;I)V")
	public final void method549(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field642 == 0) {
			var2 = field1249.method90(arg0.field641, arg0.field643, arg0.field644);
		}

		if (arg0.field642 == 1) {
			var2 = field1249.method91(arg0.field643, arg0.field644, arg0.field641);
		}

		if (arg0.field642 == 2) {
			var2 = field1249.method92(arg0.field641, arg0.field643, arg0.field644);
		}

		if (arg0.field642 == 3) {
			var2 = field1249.method93(arg0.field641, arg0.field643, arg0.field644);
		}

		if (var2 != 0) {
			int var6 = field1249.method94(arg0.field641, arg0.field643, arg0.field644, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field645 = var3;
		arg0.field647 = var4;
		arg0.field646 = var5;
	}

	@ObfuscatedName("client.a(IIIIIILd;)V")
	public final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, class4 arg5) {
		if (arg5.field64 == 0 && arg5.field79 != null && !arg5.field78 && (arg3 >= arg1 && arg4 >= arg0 && arg3 <= arg5.field67 + arg1 && arg4 <= arg5.field68 + arg0)) {
			int var7 = arg5.field79.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field80[var8] + arg1;
				int var10 = arg5.field81[var8] + arg0 - arg2;
				class4 var11 = class4.field57[arg5.field79[var8]];
				var9 += var11.field70;
				var10 += var11.field71;
				if ((var11.field75 >= 0 || var11.field102 != 0) && arg3 >= var9 && arg4 >= var10 && arg3 < var11.field67 + var9 && arg4 < var11.field68 + var10) {
					if (var11.field75 >= 0) {
						field1080 = var11.field75;
					} else {
						field1080 = var11.field62;
					}
				}

				if (var11.field64 == 0) {
					method550(var10, var9, var11.field77, arg3, arg4, var11);

					if (var11.field76 > var11.field68) {
						method552(var11.field68, true, var11.field67 + var9, arg4, var11, var10, arg3, var11.field76);
					}
				} else {
					if (var11.field65 == 1 && arg3 >= var9 && arg4 >= var10 && arg3 < var11.field67 + var9 && arg4 < var11.field68 + var10) {
						boolean var12 = false;
						if (var11.field66 != 0) {
							var12 = method502(var11);
						}

						if (!var12) {
							field1066[field1314] = var11.field118;
							field1173[field1314] = 951;
							field1172[field1314] = var11.field62;
							field1314++;
						}
					}

					if (var11.field65 == 2 && field1364 == 0 && arg3 >= var9 && arg4 >= var10 && arg3 < var11.field67 + var9 && arg4 < var11.field68 + var10) {
						String var13 = var11.field115;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1066[field1314] = var13 + " @gre@" + var11.field116;
						field1173[field1314] = 930;
						field1172[field1314] = var11.field62;
						field1314++;
					}

					if (var11.field65 == 3 && arg3 >= var9 && arg4 >= var10 && arg3 < var11.field67 + var9 && arg4 < var11.field68 + var10) {
						field1066[field1314] = "Close";
						field1173[field1314] = 947;
						field1172[field1314] = var11.field62;
						field1314++;
					}

					if (var11.field65 == 4 && arg3 >= var9 && arg4 >= var10 && arg3 < var11.field67 + var9 && arg4 < var11.field68 + var10) {
						field1066[field1314] = var11.field118;
						field1173[field1314] = 465;
						field1172[field1314] = var11.field62;
						field1314++;
					}

					if (var11.field65 == 5 && arg3 >= var9 && arg4 >= var10 && arg3 < var11.field67 + var9 && arg4 < var11.field68 + var10) {
						field1066[field1314] = var11.field118;
						field1173[field1314] = 960;
						field1172[field1314] = var11.field62;
						field1314++;
					}

					if (var11.field65 == 6 && !field1284 && arg3 >= var9 && arg4 >= var10 && arg3 < var11.field67 + var9 && arg4 < var11.field68 + var10) {
						field1066[field1314] = var11.field118;
						field1173[field1314] = 44;
						field1172[field1314] = var11.field62;
						field1314++;
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

								if (arg3 >= var17 && arg4 >= var18 && arg3 < var17 + 32 && arg4 < var18 + 32) {
									field1114 = var14;
									field1115 = var11.field62;

									if (var11.field58[var14] > 0) {
										class60 var19 = class60.method350(var11.field58[var14] - 1);
										if (field1124 == 1 && var11.field85) {
											if (field1126 != var11.field62 || field1125 != var14) {
												field1066[field1314] = "Use " + field1128 + " with @lre@" + var19.field899;
												field1173[field1314] = 881;
												field1174[field1314] = var19.field897;
												field1171[field1314] = var14;
												field1172[field1314] = var11.field62;
												field1314++;
											}
										} else if (field1364 != 1 || !var11.field85) {
											if (var11.field85) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field914 != null && var19.field914[var20] != null) {
														field1066[field1314] = var19.field914[var20] + " @lre@" + var19.field899;

														if (var20 == 3) {
															field1173[field1314] = 478;
														}

														if (var20 == 4) {
															field1173[field1314] = 347;
														}

														field1174[field1314] = var19.field897;
														field1171[field1314] = var14;
														field1172[field1314] = var11.field62;
														field1314++;
													} else if (var20 == 4) {
														field1066[field1314] = "Drop @lre@" + var19.field899;
														field1173[field1314] = 347;
														field1174[field1314] = var19.field897;
														field1171[field1314] = var14;
														field1172[field1314] = var11.field62;
														field1314++;
													}
												}
											}

											if (var11.field86) {
												field1066[field1314] = "Use @lre@" + var19.field899;
												field1173[field1314] = 188;
												field1174[field1314] = var19.field897;
												field1171[field1314] = var14;
												field1172[field1314] = var11.field62;
												field1314++;
											}

											if (var11.field85 && var19.field914 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field914[var21] != null) {
														field1066[field1314] = var19.field914[var21] + " @lre@" + var19.field899;

														if (var21 == 0) {
															field1173[field1314] = 405;
														}

														if (var21 == 1) {
															field1173[field1314] = 38;
														}

														if (var21 == 2) {
															field1173[field1314] = 422;
														}

														field1174[field1314] = var19.field897;
														field1171[field1314] = var14;
														field1172[field1314] = var11.field62;
														field1314++;
													}
												}
											}

											if (var11.field93 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field93[var22] != null) {
														field1066[field1314] = var11.field93[var22] + " @lre@" + var19.field899;

														if (var22 == 0) {
															field1173[field1314] = 602;
														}

														if (var22 == 1) {
															field1173[field1314] = 596;
														}

														if (var22 == 2) {
															field1173[field1314] = 22;
														}

														if (var22 == 3) {
															field1173[field1314] = 892;
														}

														if (var22 == 4) {
															field1173[field1314] = 415;
														}

														field1174[field1314] = var19.field897;
														field1171[field1314] = var14;
														field1172[field1314] = var11.field62;
														field1314++;
													}
												}
											}

											field1066[field1314] = "Examine @lre@" + var19.field899;
											field1173[field1314] = 1773;
											field1174[field1314] = var19.field897;
											field1171[field1314] = var14;
											field1172[field1314] = var11.field62;
											field1314++;
										} else if ((field1366 & 0x10) == 0x10) {
											field1066[field1314] = field1367 + " @lre@" + var19.field899;
											field1173[field1314] = 391;
											field1174[field1314] = var19.field897;
											field1171[field1314] = var14;
											field1172[field1314] = var11.field62;
											field1314++;
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

	@ObfuscatedName("client.E(I)V")
	public final void method551() {
		int var1 = field1417 * 128 + 64;
		int var2 = field1418 * 128 + 64;
		int var3 = method484(var2, field1078, var1) - field1419;

		if (field1143 < var1) {
			field1143 += (var1 - field1143) * field1421 / 1000 + field1420;
			if (field1143 > var1) {
				field1143 = var1;
			}
		}

		if (field1143 > var1) {
			field1143 -= (field1143 - var1) * field1421 / 1000 + field1420;
			if (field1143 < var1) {
				field1143 = var1;
			}
		}

		if (field1144 < var3) {
			field1144 += (var3 - field1144) * field1421 / 1000 + field1420;
			if (field1144 > var3) {
				field1144 = var3;
			}
		}

		if (field1144 > var3) {
			field1144 -= (field1144 - var3) * field1421 / 1000 + field1420;
			if (field1144 < var3) {
				field1144 = var3;
			}
		}

		if (field1145 < var2) {
			field1145 += (var2 - field1145) * field1421 / 1000 + field1420;
			if (field1145 > var2) {
				field1145 = var2;
			}
		}

		if (field1145 > var2) {
			field1145 -= (field1145 - var2) * field1421 / 1000 + field1420;
			if (field1145 < var2) {
				field1145 = var2;
			}
		}

		int var4 = field1106 * 128 + 64;
		int var5 = field1107 * 128 + 64;
		int var6 = method484(var5, field1078, var4) - field1108;
		int var7 = var4 - field1143;
		int var8 = var6 - field1144;
		int var9 = var5 - field1145;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1146 < var11) {
			field1146 += (var11 - field1146) * field1110 / 1000 + field1109;
			if (field1146 > var11) {
				field1146 = var11;
			}
		}

		if (field1146 > var11) {
			field1146 -= (field1146 - var11) * field1110 / 1000 + field1109;
			if (field1146 < var11) {
				field1146 = var11;
			}
		}

		int var13 = var12 - field1147;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1147 += field1110 * var13 / 1000 + field1109;
			field1147 &= 0x7FF;
		}

		if (var13 < 0) {
			field1147 -= -var13 * field1110 / 1000 + field1109;
			field1147 &= 0x7FF;
		}

		int var14 = var12 - field1147;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1147 = var12;
		}
	}

	@ObfuscatedName("client.a(IZIILd;IIII)V")
	public final void method552(int arg0, boolean arg1, int arg2, int arg3, class4 arg4, int arg5, int arg6, int arg7) {
		if (field1289) {
			field1398 = 32;
		} else {
			field1398 = 0;
		}

		field1289 = false;
		if (arg6 >= arg2 && arg6 < arg2 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
			arg4.field77 -= field1076 * 4;

			if (arg1) {
				field1337 = true;
				return;
			}
		} else if (arg6 >= arg2 && arg6 < arg2 + 16 && arg3 >= arg0 + arg5 - 16 && arg3 < arg0 + arg5) {
			arg4.field77 += field1076 * 4;

			if (arg1) {
				field1337 = true;
				return;
			}
		} else if (arg6 >= arg2 - field1398 && arg6 < arg2 + field1398 + 16 && arg3 >= arg5 + 16 && arg3 < arg0 + arg5 - 16 && field1076 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg5 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg4.field77 = (arg7 - arg0) * var10 / var11;

			if (arg1) {
				field1337 = true;
			}

			field1289 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method553() {
		try {
			if (field1318 != null) {
				field1318.method38();
			}
		} catch (Exception var2) {
		}

		field1318 = null;
		field1075 = false;
		field1241 = 0;
		field1444 = "";
		field1445 = "";
		class6.method45();
		method438();
		field1249.method64();

		for (int var1 = 0; var1 < 4; var1++) {
			field1067[var1].method361();
		}

		System.gc();
		method435();
		field1220 = -1;
		field1422 = -1;
		field1305 = 0;
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1234) {
			field1088 = true;
		} else {
			field1234 = true;
			boolean var1 = false;
			String var2 = method483();
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
						field1195[var3] = new class49(signlink.cache_idx[var3], signlink.cache_dat, 500000, var3 + 1);
					}
				}

				try {
					int var4 = 5;
					field1179[8] = 0;
					while (field1179[8] == 0) {
						method13("Connecting to web server", 20);

						try {
							DataInputStream var5 = method474("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field623, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1179[var7] = var6.method244();
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

					field1380 = method481("title", 1, field1179[1], "title screen", 25);
					field1197 = new class38("p11", field1380);
					field1198 = new class38("p12", field1380);
					field1199 = new class38("b12", field1380);
					field1200 = new class38("q8", field1380);
					method490();
					method547();
					class51 var9 = method481("config", 2, field1179[2], "config", 30);
					class51 var10 = method481("interface", 3, field1179[3], "interface", 35);
					class51 var11 = method481("media", 4, field1179[4], "2d graphics", 40);
					class51 var12 = method481("textures", 6, field1179[6], "textures", 45);
					class51 var13 = method481("wordenc", 7, field1179[7], "chat system", 50);
					class51 var14 = method481("sounds", 8, field1179[8], "sound effects", 55);
					field1184 = new byte[4][104][104];
					field1178 = new int[4][105][105];
					field1249 = new class19(4, 104, 104, field1178);

					for (int var15 = 0; var15 < 4; var15++) {
						field1067[var15] = new class62(104, 104);
					}

					field1153 = new class36(512, 512);
					class51 var16 = method481("versionlist", 5, field1179[5], "update list", 60);
					method13("Connecting to update server", 60);
					field1121 = new class48();
					field1121.method280(var16, this);
					class8.method58(field1121.method283());
					class32.method136(field1121.method282(0), field1121);

					if (!field1084) {
						field1422 = 0;
						field1423 = false;
						field1121.method289(2, field1422);

						while (field1121.method290() > 0) {
							method492();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}
						}
					}

					method13("Requesting animations", 65);
					int var17 = field1121.method282(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1121.method289(1, var18);
					}

					while (field1121.method290() > 0) {
						int var19 = var17 - field1121.method290();
						if (var19 > 0) {
							method13("Loading animations - " + var19 * 100 / var17 + "%", 65);
						}

						method492();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}
					}

					method13("Requesting models", 70);
					int var20 = field1121.method282(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1121.method287(var21);
						if ((var22 & 0x1) != 0) {
							field1121.method289(0, var21);
						}
					}

					int var23 = field1121.method290();
					while (field1121.method290() > 0) {
						int var24 = var23 - field1121.method290();
						if (var24 > 0) {
							method13("Loading models - " + var24 * 100 / var23 + "%", 70);
						}

						method492();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field1195[0] != null) {
						method13("Requesting maps", 75);
						field1121.method289(3, field1121.method284(48, 0, 47));
						field1121.method289(3, field1121.method284(48, 1, 47));
						field1121.method289(3, field1121.method284(48, 0, 48));
						field1121.method289(3, field1121.method284(48, 1, 48));
						field1121.method289(3, field1121.method284(48, 0, 49));
						field1121.method289(3, field1121.method284(48, 1, 49));
						field1121.method289(3, field1121.method284(47, 0, 47));
						field1121.method289(3, field1121.method284(47, 1, 47));
						field1121.method289(3, field1121.method284(47, 0, 48));
						field1121.method289(3, field1121.method284(47, 1, 48));
						field1121.method289(3, field1121.method284(148, 0, 48));
						field1121.method289(3, field1121.method284(148, 1, 48));
						int var25 = field1121.method290();
						while (field1121.method290() > 0) {
							int var26 = var25 - field1121.method290();
							if (var26 > 0) {
								method13("Loading maps - " + var26 * 100 / var25 + "%", 75);
							}

							method492();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var27 = field1121.method282(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1121.method287(var28);
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
							field1121.method292(var30, var28, 0);
						}
					}

					field1121.method285(field1083);

					if (!field1084) {
						int var31 = field1121.method282(2);
						for (int var32 = 1; var32 < var31; var32++) {
							if (field1121.method288(var32)) {
								field1121.method292((byte) 1, var32, 2);
							}
						}
					}

					method13("Unpacking media", 80);
					field1252 = new class37(var11, "invback", 0);
					field1254 = new class37(var11, "chatback", 0);
					field1253 = new class37(var11, "mapback", 0);
					field1135 = new class37(var11, "backbase1", 0);
					field1136 = new class37(var11, "backbase2", 0);
					field1137 = new class37(var11, "backhmid1", 0);

					for (int var33 = 0; var33 < 13; var33++) {
						field1251[var33] = new class37(var11, "sideicons", var33);
					}

					field1285 = new class36(var11, "compass", 0);
					field1086 = new class36(var11, "mapedge", 0);
					field1086.method196();

					try {
						for (int var34 = 0; var34 < 50; var34++) {
							field1279[var34] = new class37(var11, "mapscene", var34);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var35 = 0; var35 < 50; var35++) {
							field1259[var35] = new class36(var11, "mapfunction", var35);
						}
					} catch (Exception var78) {
					}

					try {
						for (int var36 = 0; var36 < 20; var36++) {
							field1399[var36] = new class36(var11, "hitmarks", var36);
						}
					} catch (Exception var77) {
					}

					try {
						for (int var37 = 0; var37 < 20; var37++) {
							field1307[var37] = new class36(var11, "headicons", var37);
						}
					} catch (Exception var76) {
					}

					field1093 = new class36(var11, "mapmarker", 0);
					field1094 = new class36(var11, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field1247[var38] = new class36(var11, "cross", var38);
					}

					field1393 = new class36(var11, "mapdots", 0);
					field1394 = new class36(var11, "mapdots", 1);
					field1395 = new class36(var11, "mapdots", 2);
					field1396 = new class36(var11, "mapdots", 3);
					field1433 = new class37(var11, "scrollbar", 0);
					field1434 = new class37(var11, "scrollbar", 1);
					field1291 = new class37(var11, "redstone1", 0);
					field1292 = new class37(var11, "redstone2", 0);
					field1293 = new class37(var11, "redstone3", 0);
					field1294 = new class37(var11, "redstone1", 0);
					field1294.method209();
					field1295 = new class37(var11, "redstone2", 0);
					field1295.method209();
					field1116 = new class37(var11, "redstone1", 0);
					field1116.method210();
					field1117 = new class37(var11, "redstone2", 0);
					field1117.method210();
					field1118 = new class37(var11, "redstone3", 0);
					field1118.method210();
					field1119 = new class37(var11, "redstone1", 0);
					field1119.method209();
					field1119.method210();
					field1120 = new class37(var11, "redstone2", 0);
					field1120.method209();
					field1120.method210();

					for (int var39 = 0; var39 < 2; var39++) {
						field1239[var39] = new class37(var11, "mod_icons", var39);
					}

					class36 var40 = new class36(var11, "backleft1", 0);
					field1045 = new class44(var40.field599, method11(), var40.field598);
					var40.method197(0, 0);
					class36 var41 = new class36(var11, "backleft2", 0);
					field1046 = new class44(var41.field599, method11(), var41.field598);
					var41.method197(0, 0);
					class36 var42 = new class36(var11, "backright1", 0);
					field1047 = new class44(var42.field599, method11(), var42.field598);
					var42.method197(0, 0);
					class36 var43 = new class36(var11, "backright2", 0);
					field1048 = new class44(var43.field599, method11(), var43.field598);
					var43.method197(0, 0);
					class36 var44 = new class36(var11, "backtop1", 0);
					field1049 = new class44(var44.field599, method11(), var44.field598);
					var44.method197(0, 0);
					class36 var45 = new class36(var11, "backvmid1", 0);
					field1050 = new class44(var45.field599, method11(), var45.field598);
					var45.method197(0, 0);
					class36 var46 = new class36(var11, "backvmid2", 0);
					field1051 = new class44(var46.field599, method11(), var46.field598);
					var46.method197(0, 0);
					class36 var47 = new class36(var11, "backvmid3", 0);
					field1052 = new class44(var47.field599, method11(), var47.field598);
					var47.method197(0, 0);
					class36 var48 = new class36(var11, "backhmid2", 0);
					field1053 = new class44(var48.field599, method11(), var48.field598);
					var48.method197(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 50; var53++) {
						if (field1259[var53] != null) {
							field1259[var53].method195(var50 + var52, var51 + var52, var49 + var52);
						}

						if (field1279[var53] != null) {
							field1279[var53].method211(var50 + var52, var51 + var52, var49 + var52);
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
					class60.field896 = field1083;

					if (!field1084) {
						method13("Unpacking sounds", 90);
						byte[] var54 = var14.method309("sounds.dat", null);
						class39 var55 = new class39(var54);
						class55.method322(var55);
					}

					method13("Unpacking interfaces", 95);
					class38[] var56 = new class38[] { field1197, field1198, field1199, field1200 };
					class4.method32(var56, var11, var10);
					method13("Preparing game engine", 100);

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field1253.field604[field1253.field606 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field1185[var57] = var58;
						field1095[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field1253.field604[field1253.field606 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field1334[var61 - 5] = var62 - 25;
						field1130[var61 - 5] = var63 - var62;
					}

					class35.method179(96, 479);
					field1330 = class35.field585;
					class35.method179(261, 190);
					field1331 = class35.field585;
					class35.method179(334, 512);
					field1332 = class35.field585;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = class35.field583[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					class19.method100(334, 800, 512, var65, 500);
					class71.method393(var13);
					field1164 = new class58(this);
				} catch (Exception var81) {
					signlink.reporterror("loaderror " + field1038 + " " + field1258);
					field1269 = true;
				}
			} else {
				field1345 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IZLmb;)V")
	public final void method554(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1406; var3++) {
			int var4 = field1407[var3];
			class28 var5 = field1403[var4];
			int var6 = arg1.method239();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method239() << 8;
			}

			method560(arg1, var5, var4, var6);
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method555(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(Lz;II)V")
	public final void method556(class26 arg0, int arg1) {
		method557(arg0.field370, arg1, arg0.field369);
	}

	@ObfuscatedName("client.a(ZIII)V")
	public final void method557(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method484(arg0, field1078, arg2) - arg1;
			arg2 -= field1143;
			var4 -= field1144;
			arg0 -= field1145;
			int var5 = class32.field551[field1146];
			int var6 = class32.field552[field1146];
			int var7 = class32.field551[field1147];
			int var8 = class32.field552[field1147];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1270 = (var9 << 9) / arg0 + class35.field579;
				field1271 = (var11 << 9) / arg0 + class35.field580;
			} else {
				field1270 = -1;
				field1271 = -1;
			}
		} else {
			field1270 = -1;
			field1271 = -1;
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method558() {
		method446();

		if (field1441 == 1) {
			field1247[field1440 / 100].method199(field1439 - 8 - 4, field1438 - 8 - 4);
		}

		if (field1441 == 2) {
			field1247[field1440 / 100 + 4].method199(field1439 - 8 - 4, field1438 - 8 - 4);
		}

		if (field1397 != -1) {
			method441(field1397, field1167);
			method503(class4.field57[field1397], 0, 0, 0);
		}

		if (field1256 > 0) {
			int var1 = 302 - (int) Math.abs(Math.sin(field1256 / 10.0D) * 10.0D);
			for (int var2 = 0; var2 < 30; var2++) {
				int var3 = (30 - var2) * 16;
				class34.method174(var1 + var2, field1256, var3, 0xFFFF00, 256 - var3 / 2);
			}
		}

		if (field1111 != -1) {
			method441(field1111, field1167);
			method503(class4.field57[field1111], 0, 0, 0);
		}

		method530();

		if (!field1201) {
			method444();
			method531();
		} else if (field1319 == 0) {
			method475();
		}

		if (field1424 == 1) {
			if (field1099 > 0 || field1134 == 1) {
				field1307[1].method199(258, 472);
			} else {
				field1307[1].method199(296, 472);
			}
		}

		if (field1099 > 0) {
			field1307[0].method199(296, 472);
			field1198.method214("Level: " + field1099, 0xFFFF00, 329, 484);
		}

		if (field1134 == 1) {
			field1307[6].method199(296, 472);
			field1198.method214("Arena", 0xFFFF00, 329, 484);
		}

		if (field1105 != 0) {
			int var4 = field1105 / 50;
			int var5 = var4 / 60;
			var4 %= 60;
			if (var4 < 10) {
				field1198.method217(329, 4, "System update in: " + var5 + ":0" + var4, 0xFFFF00);
			} else {
				field1198.method217(329, 4, "System update in: " + var5 + ":" + var4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method559(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1207; var2++) {
			if (arg0.equalsIgnoreCase(field1140[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1090.field424)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(Lmb;Lbb;IBI)V")
	public final void method560(class39 arg0, class28 arg1, int arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg0.method239();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg0.method248(0, var5, var6);
			field1408[arg2] = var7;
			arg1.method130(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg0.method241();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg1.field397 == var8) {
				arg1.field401 = 0;
			}

			int var9 = arg0.method239();
			if (arg1.field397 == var8 && var8 != -1) {
				int var10 = class66.field979[var8].field993;
				if (var10 == 1) {
					arg1.field398 = 0;
					arg1.field399 = 0;
					arg1.field400 = var9;
					arg1.field401 = 0;
				}

				if (var10 == 2) {
					arg1.field401 = 0;
				}
			} else if (var8 == -1 || arg1.field397 == -1 || class66.field979[var8].field987 >= class66.field979[arg1.field397].field987) {
				arg1.field397 = var8;
				arg1.field398 = 0;
				arg1.field399 = 0;
				arg1.field400 = var9;
				arg1.field401 = 0;
				arg1.field422 = arg1.field417;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg1.field391 = arg0.method241();
			if (arg1.field391 == 0xFFFF) {
				arg1.field391 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg1.field381 = arg0.method246();
			arg1.field383 = 0;
			arg1.field384 = 0;
			arg1.field382 = 150;
			method544(2, arg1.field424, arg1.field381);
		}

		if ((arg3 & 0x10) == 0x10) {
			int var11 = arg0.method239();
			int var12 = arg0.method239();
			arg1.method128(var11, var12);
			arg1.field388 = field1446 + 300;
			arg1.field389 = arg0.method239();
			arg1.field390 = arg0.method239();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg1.field392 = arg0.method241();
			arg1.field393 = arg0.method241();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var13 = arg0.method241();
			int var14 = arg0.method239();
			int var15 = arg0.method239();
			int var16 = arg0.field624;

			if (arg1.field424 != null && arg1.field425) {
				long var17 = class52.method310(arg1.field424);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1079; var20++) {
						if (field1150[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1353 == 0) {
					try {
						String var21 = class53.method317(arg0, var15);
						var21 = class71.method403(var21);
						arg1.field381 = var21;
						arg1.field383 = var13 >> 8;
						arg1.field384 = var13 & 0xFF;
						arg1.field382 = 150;

						if (var14 == 2 || var14 == 3) {
							method544(1, "@cr2@" + arg1.field424, var21);
						} else if (var14 == 1) {
							method544(1, "@cr1@" + arg1.field424, var21);
						} else {
							method544(2, arg1.field424, var21);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field624 = var15 + var16;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg1.field402 = arg0.method241();
			int var23 = arg0.method244();
			arg1.field406 = var23 >> 16;
			arg1.field405 = (var23 & 0xFFFF) + field1446;
			arg1.field403 = 0;
			arg1.field404 = 0;

			if (arg1.field405 > field1446) {
				arg1.field403 = -1;
			}

			if (arg1.field402 == 0xFFFF) {
				arg1.field402 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg1.field407 = arg0.method239();
			arg1.field409 = arg0.method239();
			arg1.field408 = arg0.method239();
			arg1.field410 = arg0.method239();
			arg1.field411 = arg0.method241() + field1446;
			arg1.field412 = arg0.method241() + field1446;
			arg1.field413 = arg0.method239();
			arg1.method126();
		}

		if ((arg3 & 0x400) == 0x400) {
			int var24 = arg0.method239();
			int var25 = arg0.method239();
			arg1.method128(var24, var25);
			arg1.field388 = field1446 + 300;
			arg1.field389 = arg0.method239();
			arg1.field390 = arg0.method239();
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method561() {
		short var1 = 256;

		if (field1387 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1387 > 768) {
					field1296[var2] = method555(field1298[var2], 1024 - field1387, field1297[var2]);
				} else if (field1387 > 256) {
					field1296[var2] = field1298[var2];
				} else {
					field1296[var2] = method555(field1297[var2], 256 - field1387, field1298[var2]);
				}
			}
		} else if (field1388 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1388 > 768) {
					field1296[var3] = method555(field1299[var3], 1024 - field1388, field1297[var3]);
				} else if (field1388 > 256) {
					field1296[var3] = field1299[var3];
				} else {
					field1296[var3] = method555(field1297[var3], 256 - field1388, field1299[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1296[var4] = field1297[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1058.field657[var5] = field1235.field597[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1133[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1442[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1296[var12];
					int var15 = field1058.field657[var7];
					field1058.field657[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1058.method269(0, field9, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1059.field657[var16] = field1236.field597[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1133[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1442[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1296[var23];
					int var26 = field1059.field657[var18];
					field1059.field657[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1059.method269(0, field9, 637);
	}

	@ObfuscatedName("client.a(IIIIIB)V")
	public final void method562(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1249.method90(arg2, arg4, arg3);
		if (var6 != 0) {
			int var7 = field1249.method94(arg2, arg4, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field1153.field597;
			int var12 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method334(var13);
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
				class37 var15 = field1279[var14.field839];
				if (var15 != null) {
					int var16 = (var14.field825 * 4 - var15.field606) / 2;
					int var17 = (var14.field826 * 4 - var15.field607) / 2;
					var15.method212((104 - arg3 - var14.field826) * 4 + var17 + 48, arg4 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field1249.method92(arg2, arg4, arg3);
		if (var18 != 0) {
			int var19 = field1249.method94(arg2, arg4, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method334(var22);
			if (var23.field839 != -1) {
				class37 var24 = field1279[var23.field839];
				if (var24 != null) {
					int var25 = (var23.field825 * 4 - var24.field606) / 2;
					int var26 = (var23.field826 * 4 - var24.field607) / 2;
					var24.method212((104 - arg3 - var23.field826) * 4 + var26 + 48, arg4 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1153.field597;
				int var29 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field1249.method93(arg2, arg4, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method334(var31);
			if (var32.field839 != -1) {
				class37 var33 = field1279[var32.field839];
				if (var33 != null) {
					int var34 = (var32.field825 * 4 - var33.field606) / 2;
					int var35 = (var32.field826 * 4 - var33.field607) / 2;
					var33.method212((104 - arg3 - var32.field826) * 4 + var35 + 48, arg4 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1138[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1351[var3] = var2 / 4;
		}
	}
}
