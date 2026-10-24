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
	public class37 field1037;

	@ObfuscatedName("client.bb")
	public class37 field1038;

	@ObfuscatedName("client.cb")
	public class37 field1039;

	@ObfuscatedName("client.db")
	public class37 field1040;

	@ObfuscatedName("client.eb")
	public class37 field1041;

	@ObfuscatedName("client.gb")
	public int field1042 = 0x23201B;

	@ObfuscatedName("client.hb")
	public class44 field1043;

	@ObfuscatedName("client.ib")
	public class44 field1044;

	@ObfuscatedName("client.jb")
	public class44 field1045;

	@ObfuscatedName("client.kb")
	public class44 field1046;

	@ObfuscatedName("client.lb")
	public boolean field1047 = false;

	@ObfuscatedName("client.mb")
	public int field1048;

	@ObfuscatedName("client.nb")
	public boolean field1049 = false;

	@ObfuscatedName("client.ob")
	public static int field1050;

	@ObfuscatedName("client.qb")
	public boolean field1051 = false;

	@ObfuscatedName("client.rb")
	public boolean field1052 = false;

	@ObfuscatedName("client.ub")
	public int field1053;

	@ObfuscatedName("client.vb")
	public int field1054;

	@ObfuscatedName("client.wb")
	public class36 field1055;

	@ObfuscatedName("client.xb")
	public int[] field1056 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.yb")
	public static BigInteger field1057 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ac")
	public int field1083;

	@ObfuscatedName("client.bc")
	public int field1084;

	@ObfuscatedName("client.cc")
	public int[] field1085 = new int[33];

	@ObfuscatedName("client.dc")
	public int[] field1086 = new int[7];

	@ObfuscatedName("client.ec")
	public int field1087;

	@ObfuscatedName("client.hc")
	public static int field1088;

	@ObfuscatedName("client.ic")
	public int[][] field1089 = new int[104][104];

	@ObfuscatedName("client.jc")
	public int[] field1090 = new int[9];

	@ObfuscatedName("client.kc")
	public class49[] field1091 = new class49[5];

	@ObfuscatedName("client.mc")
	public int[] field1092 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.nc")
	public int field1093 = -1;

	@ObfuscatedName("client.oc")
	public int[] field1094 = new int[50];

	@ObfuscatedName("client.pc")
	public boolean field1095 = false;

	@ObfuscatedName("client.qc")
	public class51 field1096;

	@ObfuscatedName("client.Y")
	public boolean field1035 = false;

	@ObfuscatedName("client.Z")
	public class36[] field1036 = new class36[20];

	@ObfuscatedName("client.Ab")
	public class37[] field1058 = new class37[2];

	@ObfuscatedName("client.Db")
	public int[] field1061 = new int[5];

	@ObfuscatedName("client.Ib")
	public boolean field1065 = false;

	@ObfuscatedName("client.Kb")
	public int field1067 = 1;

	@ObfuscatedName("client.Ub")
	public class27[] field1077 = new class27[8192];

	@ObfuscatedName("client.Wb")
	public int[] field1079 = new int[8192];

	@ObfuscatedName("client.Yb")
	public class36[] field1081 = new class36[20];

	@ObfuscatedName("client.rc")
	public int field1097 = 0x4D4233;

	@ObfuscatedName("client.sc")
	public String field1098 = "";

	@ObfuscatedName("client.tc")
	public int field1099 = -1;

	@ObfuscatedName("client.uc")
	public class62[] field1100 = new class62[4];

	@ObfuscatedName("client.vc")
	public boolean field1101 = false;

	@ObfuscatedName("client.xc")
	public boolean field1103 = false;

	@ObfuscatedName("client.yc")
	public boolean field1104 = true;

	@ObfuscatedName("client.Ec")
	public int field1110 = 0x766654;

	@ObfuscatedName("client.Kc")
	public int[] field1114 = new int[50];

	@ObfuscatedName("client.Mc")
	public int[][] field1116 = new int[104][104];

	@ObfuscatedName("client.Oc")
	public int field1118 = 2;

	@ObfuscatedName("client.Qc")
	public int field1120 = 50;

	@ObfuscatedName("client.Rc")
	public int[] field1121 = new int[field1120];

	@ObfuscatedName("client.Sc")
	public int[] field1122 = new int[field1120];

	@ObfuscatedName("client.Tc")
	public int[] field1123 = new int[field1120];

	@ObfuscatedName("client.Uc")
	public int[] field1124 = new int[field1120];

	@ObfuscatedName("client.Vc")
	public int[] field1125 = new int[field1120];

	@ObfuscatedName("client.Wc")
	public int[] field1126 = new int[field1120];

	@ObfuscatedName("client.Xc")
	public int[] field1127 = new int[field1120];

	@ObfuscatedName("client.Yc")
	public String[] field1128 = new String[field1120];

	@ObfuscatedName("client.Zc")
	public boolean field1129 = false;

	@ObfuscatedName("client.ed")
	public CRC32 field1134 = new CRC32();

	@ObfuscatedName("client.fd")
	public int field1135 = 78;

	@ObfuscatedName("client.sd")
	public boolean field1147 = false;

	@ObfuscatedName("client.vd")
	public boolean field1148 = false;

	@ObfuscatedName("client.zd")
	public boolean field1152 = false;

	@ObfuscatedName("client.Ad")
	public String field1153 = "";

	@ObfuscatedName("client.Bd")
	public String field1154 = "";

	@ObfuscatedName("client.Cd")
	public class42 field1155 = new class42();

	@ObfuscatedName("client.Ed")
	public class37[] field1157 = new class37[50];

	@ObfuscatedName("client.Fd")
	public boolean field1158 = true;

	@ObfuscatedName("client.Gd")
	public class36[] field1159 = new class36[8];

	@ObfuscatedName("client.Id")
	public int field1161 = 2;

	@ObfuscatedName("client.Kd")
	public class39 field1163 = class39.method225(1);

	@ObfuscatedName("client.Pd")
	public int field1166 = -1;

	@ObfuscatedName("client.Qd")
	public final int[] field1167 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ce")
	public int field1179 = -1;

	@ObfuscatedName("client.fe")
	public boolean[] field1182 = new boolean[5];

	@ObfuscatedName("client.ie")
	public int[] field1185 = new int[1000];

	@ObfuscatedName("client.me")
	public int[] field1189 = new int[5];

	@ObfuscatedName("client.pe")
	public boolean field1192 = false;

	@ObfuscatedName("client.qe")
	public class39 field1193 = class39.method225(1);

	@ObfuscatedName("client.we")
	public boolean field1199 = false;

	@ObfuscatedName("client.Ee")
	public boolean field1203 = false;

	@ObfuscatedName("client.Ge")
	public class42 field1205 = new class42();

	@ObfuscatedName("client.Me")
	public int field1211 = 1;

	@ObfuscatedName("client.Pe")
	public int[] field1214 = new int[5];

	@ObfuscatedName("client.Qe")
	public int[] field1215 = new int[50];

	@ObfuscatedName("client.Re")
	public String[] field1216 = new String[500];

	@ObfuscatedName("client.Ve")
	public int[] field1220 = new int[1000];

	@ObfuscatedName("client.We")
	public int[] field1221 = new int[1000];

	@ObfuscatedName("client.Ye")
	public int field1223 = -1;

	@ObfuscatedName("client.hf")
	public boolean field1232 = false;

	@ObfuscatedName("client.mf")
	public int[] field1235 = new int[50];

	@ObfuscatedName("client.of")
	public long[] field1237 = new long[200];

	@ObfuscatedName("client.Df")
	public boolean field1251 = false;

	@ObfuscatedName("client.Hf")
	public long[] field1254 = new long[100];

	@ObfuscatedName("client.If")
	public boolean field1255 = false;

	@ObfuscatedName("client.Jf")
	public int field1256 = -1;

	@ObfuscatedName("client.Lf")
	public int[] field1257 = new int[5];

	@ObfuscatedName("client.Sf")
	public int[] field1264 = new int[2000];

	@ObfuscatedName("client.Uf")
	public int field1265 = -1;

	@ObfuscatedName("client.Xf")
	public int[] field1267 = new int[2000];

	@ObfuscatedName("client.Yf")
	public String field1268 = "";

	@ObfuscatedName("client.bg")
	public class42[][][] field1271 = new class42[4][104][104];

	@ObfuscatedName("client.rg")
	public int field1286 = 3;

	@ObfuscatedName("client.sg")
	public int field1287 = -1;

	@ObfuscatedName("client.tg")
	public int field1288 = 0x332D25;

	@ObfuscatedName("client.wg")
	public int[] field1290 = new int[200];

	@ObfuscatedName("client.yg")
	public int[] field1292 = new int[151];

	@ObfuscatedName("client.Ag")
	public int field1294 = 2;

	@ObfuscatedName("client.Bg")
	public class37[] field1295 = new class37[13];

	@ObfuscatedName("client.Eg")
	public int field1296 = -1;

	@ObfuscatedName("client.Fg")
	public int[] field1297 = new int[33];

	@ObfuscatedName("client.Gg")
	public byte[] field1298 = new byte[16384];

	@ObfuscatedName("client.Jg")
	public int[] field1301 = new int[500];

	@ObfuscatedName("client.Kg")
	public int[] field1302 = new int[500];

	@ObfuscatedName("client.Lg")
	public int[] field1303 = new int[500];

	@ObfuscatedName("client.Mg")
	public int[] field1304 = new int[500];

	@ObfuscatedName("client.Ng")
	public String field1305 = "";

	@ObfuscatedName("client.Og")
	public String field1306 = "";

	@ObfuscatedName("client.Pg")
	public String field1307 = "";

	@ObfuscatedName("client.Ug")
	public String field1312 = "";

	@ObfuscatedName("client.Yg")
	public int[] field1316 = new int[256];

	@ObfuscatedName("client.ah")
	public String field1317 = "";

	@ObfuscatedName("client.bh")
	public boolean field1318 = true;

	@ObfuscatedName("client.nh")
	public int[] field1330 = new int[50];

	@ObfuscatedName("client.oh")
	public int field1331 = 2048;

	@ObfuscatedName("client.ph")
	public int field1332 = 2047;

	@ObfuscatedName("client.qh")
	public class28[] field1333 = new class28[field1331];

	@ObfuscatedName("client.sh")
	public int[] field1335 = new int[field1331];

	@ObfuscatedName("client.uh")
	public int[] field1337 = new int[field1331];

	@ObfuscatedName("client.vh")
	public class39[] field1338 = new class39[field1331];

	@ObfuscatedName("client.Eh")
	public int[][] field1345 = new int[104][104];

	@ObfuscatedName("client.Fh")
	public class39 field1346 = class39.method225(1);

	@ObfuscatedName("client.Kh")
	public boolean field1350 = false;

	@ObfuscatedName("client.Lh")
	public final int field1351 = 100;

	@ObfuscatedName("client.Mh")
	public int[] field1352 = new int[100];

	@ObfuscatedName("client.Wh")
	public class42 field1362 = new class42();

	@ObfuscatedName("client.bi")
	public int[] field1367 = new int[4000];

	@ObfuscatedName("client.ci")
	public int[] field1368 = new int[4000];

	@ObfuscatedName("client.gi")
	public boolean field1372 = false;

	@ObfuscatedName("client.hi")
	public int[] field1373 = new int[50];

	@ObfuscatedName("client.ii")
	public class36[] field1374 = new class36[50];

	@ObfuscatedName("client.ji")
	public int[] field1375 = new int[100];

	@ObfuscatedName("client.ki")
	public String[] field1376 = new String[100];

	@ObfuscatedName("client.li")
	public String[] field1377 = new String[100];

	@ObfuscatedName("client.si")
	public int[] field1382 = new int[5];

	@ObfuscatedName("client.ui")
	public boolean field1384 = true;

	@ObfuscatedName("client.wi")
	public boolean field1386 = false;

	@ObfuscatedName("client.xi")
	public boolean field1387 = false;

	@ObfuscatedName("client.Bi")
	public int[] field1390 = new int[151];

	@ObfuscatedName("client.Ci")
	public class36[] field1391 = new class36[1000];

	@ObfuscatedName("client.Hi")
	public String[] field1396 = new String[200];

	@ObfuscatedName("client.Ii")
	public int field1397 = 128;

	@ObfuscatedName("client.Yi")
	public class4 field1410 = new class4();

	@ObfuscatedName("client.ej")
	public int field1416 = -1;

	@ObfuscatedName("client.gj")
	public boolean field1418 = false;

	@ObfuscatedName("client.hj")
	public int field1419 = -1;

	@ObfuscatedName("client.qj")
	public int field1427 = -1;

	@ObfuscatedName("client.xj")
	public int field1432 = -1;

	@ObfuscatedName("client.yj")
	public int field1433 = -1;

	@ObfuscatedName("client.Rd")
	public static String field1168 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ig")
	public static final int[] field1300 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.lh")
	public static int[] field1328 = new int[99];

	@ObfuscatedName("client.Gh")
	public static final int[][] field1347 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Rh")
	public static int field1357 = 10;

	@ObfuscatedName("client.Th")
	public static boolean field1359 = true;

	@ObfuscatedName("client.Ti")
	public static BigInteger field1406 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Q")
	public int field1029;

	@ObfuscatedName("client.V")
	public int field1033;

	@ObfuscatedName("client.W")
	public int field1034;

	@ObfuscatedName("client.Eb")
	public int field1062;

	@ObfuscatedName("client.Gb")
	public int field1063;

	@ObfuscatedName("client.Hb")
	public int field1064;

	@ObfuscatedName("client.Jb")
	public int field1066;

	@ObfuscatedName("client.Vb")
	public int field1078;

	@ObfuscatedName("client.Xb")
	public int field1080;

	@ObfuscatedName("client.Zb")
	public static int field1082;

	@ObfuscatedName("client.wc")
	public int field1102;

	@ObfuscatedName("client.zc")
	public int field1105;

	@ObfuscatedName("client.Ac")
	public int field1106;

	@ObfuscatedName("client.Bc")
	public int field1107;

	@ObfuscatedName("client.Cc")
	public int field1108;

	@ObfuscatedName("client.Dc")
	public int field1109;

	@ObfuscatedName("client.Fc")
	public int field1111;

	@ObfuscatedName("client.Gc")
	public int field1112;

	@ObfuscatedName("client.Jc")
	public int field1113;

	@ObfuscatedName("client.Nc")
	public int field1117;

	@ObfuscatedName("client.Pc")
	public int field1119;

	@ObfuscatedName("client.ad")
	public int field1130;

	@ObfuscatedName("client.qd")
	public int field1145;

	@ObfuscatedName("client.wd")
	public static int field1149;

	@ObfuscatedName("client.xd")
	public static int field1150;

	@ObfuscatedName("client.Dd")
	public int field1156;

	@ObfuscatedName("client.Hd")
	public int field1160;

	@ObfuscatedName("client.Jd")
	public int field1162;

	@ObfuscatedName("client.Od")
	public int field1165;

	@ObfuscatedName("client.Sd")
	public int field1169;

	@ObfuscatedName("client.Vd")
	public int field1172;

	@ObfuscatedName("client.Wd")
	public int field1173;

	@ObfuscatedName("client.Xd")
	public int field1174;

	@ObfuscatedName("client.Yd")
	public int field1175;

	@ObfuscatedName("client.Zd")
	public int field1176;

	@ObfuscatedName("client.ae")
	public int field1177;

	@ObfuscatedName("client.be")
	public static int field1178;

	@ObfuscatedName("client.de")
	public int field1180;

	@ObfuscatedName("client.ge")
	public int field1183;

	@ObfuscatedName("client.he")
	public int field1184;

	@ObfuscatedName("client.je")
	public static int field1186;

	@ObfuscatedName("client.ke")
	public int field1187;

	@ObfuscatedName("client.le")
	public int field1188;

	@ObfuscatedName("client.ne")
	public static int field1190;

	@ObfuscatedName("client.oe")
	public static int field1191;

	@ObfuscatedName("client.re")
	public int field1194;

	@ObfuscatedName("client.se")
	public int field1195;

	@ObfuscatedName("client.te")
	public int field1196;

	@ObfuscatedName("client.ue")
	public int field1197;

	@ObfuscatedName("client.ve")
	public int field1198;

	@ObfuscatedName("client.xe")
	public static int field1200;

	@ObfuscatedName("client.ye")
	public int field1201;

	@ObfuscatedName("client.De")
	public int field1202;

	@ObfuscatedName("client.Fe")
	public int field1204;

	@ObfuscatedName("client.Je")
	public int field1208;

	@ObfuscatedName("client.Ke")
	public int field1209;

	@ObfuscatedName("client.Le")
	public int field1210;

	@ObfuscatedName("client.Ne")
	public int field1212;

	@ObfuscatedName("client.Oe")
	public int field1213;

	@ObfuscatedName("client.Se")
	public int field1217;

	@ObfuscatedName("client.Ue")
	public int field1219;

	@ObfuscatedName("client.Xe")
	public static int field1222;

	@ObfuscatedName("client.Ze")
	public int field1224;

	@ObfuscatedName("client.af")
	public int field1225;

	@ObfuscatedName("client.ef")
	public int field1229;

	@ObfuscatedName("client.ff")
	public int field1230;

	@ObfuscatedName("client.gf")
	public int field1231;

	@ObfuscatedName("client.jf")
	public int field1233;

	@ObfuscatedName("client.kf")
	public int field1234;

	@ObfuscatedName("client.nf")
	public int field1236;

	@ObfuscatedName("client.wf")
	public int field1245;

	@ObfuscatedName("client.xf")
	public int field1246;

	@ObfuscatedName("client.yf")
	public int field1247;

	@ObfuscatedName("client.Af")
	public int field1248;

	@ObfuscatedName("client.Bf")
	public int field1249;

	@ObfuscatedName("client.Cf")
	public int field1250;

	@ObfuscatedName("client.Ef")
	public int field1252;

	@ObfuscatedName("client.Mf")
	public int field1258;

	@ObfuscatedName("client.Nf")
	public int field1259;

	@ObfuscatedName("client.Of")
	public int field1260;

	@ObfuscatedName("client.Pf")
	public int field1261;

	@ObfuscatedName("client.Qf")
	public int field1262;

	@ObfuscatedName("client.Vf")
	public static int field1266;

	@ObfuscatedName("client.cg")
	public int field1272;

	@ObfuscatedName("client.fg")
	public int field1275;

	@ObfuscatedName("client.lg")
	public int field1280;

	@ObfuscatedName("client.mg")
	public int field1281;

	@ObfuscatedName("client.ng")
	public int field1282;

	@ObfuscatedName("client.og")
	public int field1283;

	@ObfuscatedName("client.pg")
	public int field1284;

	@ObfuscatedName("client.vg")
	public int field1289;

	@ObfuscatedName("client.zg")
	public int field1293;

	@ObfuscatedName("client.Hg")
	public static int field1299;

	@ObfuscatedName("client.Tg")
	public int field1311;

	@ObfuscatedName("client.Vg")
	public int field1313;

	@ObfuscatedName("client.dh")
	public int field1320;

	@ObfuscatedName("client.eh")
	public int field1321;

	@ObfuscatedName("client.fh")
	public int field1322;

	@ObfuscatedName("client.gh")
	public int field1323;

	@ObfuscatedName("client.hh")
	public int field1324;

	@ObfuscatedName("client.ih")
	public int field1325;

	@ObfuscatedName("client.jh")
	public int field1326;

	@ObfuscatedName("client.mh")
	public int field1329;

	@ObfuscatedName("client.rh")
	public int field1334;

	@ObfuscatedName("client.th")
	public int field1336;

	@ObfuscatedName("client.yh")
	public static int field1339;

	@ObfuscatedName("client.Ih")
	public static int field1348;

	@ObfuscatedName("client.Jh")
	public static int field1349;

	@ObfuscatedName("client.Nh")
	public int field1353;

	@ObfuscatedName("client.Oh")
	public int field1354;

	@ObfuscatedName("client.Ph")
	public int field1355;

	@ObfuscatedName("client.Qh")
	public int field1356;

	@ObfuscatedName("client.Sh")
	public static int field1358;

	@ObfuscatedName("client.Vh")
	public int field1361;

	@ObfuscatedName("client.di")
	public int field1369;

	@ObfuscatedName("client.ei")
	public int field1370;

	@ObfuscatedName("client.fi")
	public static int field1371;

	@ObfuscatedName("client.ni")
	public int field1379;

	@ObfuscatedName("client.pi")
	public int field1380;

	@ObfuscatedName("client.ri")
	public int field1381;

	@ObfuscatedName("client.vi")
	public int field1385;

	@ObfuscatedName("client.Di")
	public int field1392;

	@ObfuscatedName("client.Ei")
	public int field1393;

	@ObfuscatedName("client.Fi")
	public int field1394;

	@ObfuscatedName("client.Gi")
	public int field1395;

	@ObfuscatedName("client.Ji")
	public int field1398;

	@ObfuscatedName("client.Ki")
	public int field1399;

	@ObfuscatedName("client.Li")
	public int field1400;

	@ObfuscatedName("client.Oi")
	public int field1401;

	@ObfuscatedName("client.Pi")
	public int field1402;

	@ObfuscatedName("client.Qi")
	public int field1403;

	@ObfuscatedName("client.Ri")
	public int field1404;

	@ObfuscatedName("client.Si")
	public int field1405;

	@ObfuscatedName("client.Vi")
	public int field1407;

	@ObfuscatedName("client.Wi")
	public int field1408;

	@ObfuscatedName("client.Xi")
	public int field1409;

	@ObfuscatedName("client.Zi")
	public int field1411;

	@ObfuscatedName("client.aj")
	public int field1412;

	@ObfuscatedName("client.bj")
	public int field1413;

	@ObfuscatedName("client.cj")
	public int field1414;

	@ObfuscatedName("client.dj")
	public int field1415;

	@ObfuscatedName("client.fj")
	public int field1417;

	@ObfuscatedName("client.jj")
	public int field1420;

	@ObfuscatedName("client.kj")
	public int field1421;

	@ObfuscatedName("client.lj")
	public int field1422;

	@ObfuscatedName("client.tj")
	public int field1428;

	@ObfuscatedName("client.uj")
	public int field1429;

	@ObfuscatedName("client.vj")
	public int field1430;

	@ObfuscatedName("client.wj")
	public int field1431;

	@ObfuscatedName("client.Cb")
	public long field1060;

	@ObfuscatedName("client.rd")
	public long field1146;

	@ObfuscatedName("client.ee")
	public long field1181;

	@ObfuscatedName("client.eg")
	public long field1274;

	@ObfuscatedName("client.nj")
	public long field1424;

	@ObfuscatedName("client.ti")
	public class19 field1383;

	@ObfuscatedName("client.Lc")
	public static class28 field1115;

	@ObfuscatedName("client.K")
	public class36 field1024;

	@ObfuscatedName("client.L")
	public class36 field1025;

	@ObfuscatedName("client.Td")
	public class36 field1170;

	@ObfuscatedName("client.Ud")
	public class36 field1171;

	@ObfuscatedName("client.He")
	public class36 field1206;

	@ObfuscatedName("client.Ie")
	public class36 field1207;

	@ObfuscatedName("client.zh")
	public class36 field1340;

	@ObfuscatedName("client.Xh")
	public class36 field1363;

	@ObfuscatedName("client.Yh")
	public class36 field1364;

	@ObfuscatedName("client.Zh")
	public class36 field1365;

	@ObfuscatedName("client.ai")
	public class36 field1366;

	@ObfuscatedName("client.mi")
	public class36 field1378;

	@ObfuscatedName("client.M")
	public class37 field1026;

	@ObfuscatedName("client.N")
	public class37 field1027;

	@ObfuscatedName("client.O")
	public class37 field1028;

	@ObfuscatedName("client.R")
	public class37 field1030;

	@ObfuscatedName("client.S")
	public class37 field1031;

	@ObfuscatedName("client.T")
	public class37 field1032;

	@ObfuscatedName("client.pf")
	public class37 field1238;

	@ObfuscatedName("client.qf")
	public class37 field1239;

	@ObfuscatedName("client.rf")
	public class37 field1240;

	@ObfuscatedName("client.sf")
	public class37 field1241;

	@ObfuscatedName("client.tf")
	public class37 field1242;

	@ObfuscatedName("client.uf")
	public class37 field1243;

	@ObfuscatedName("client.vf")
	public class37 field1244;

	@ObfuscatedName("client.oj")
	public class37 field1425;

	@ObfuscatedName("client.pj")
	public class37 field1426;

	@ObfuscatedName("client.hg")
	public class38 field1276;

	@ObfuscatedName("client.ig")
	public class38 field1277;

	@ObfuscatedName("client.jg")
	public class38 field1278;

	@ObfuscatedName("client.kg")
	public class38 field1279;

	@ObfuscatedName("client.Lb")
	public class44 field1068;

	@ObfuscatedName("client.Mb")
	public class44 field1069;

	@ObfuscatedName("client.Nb")
	public class44 field1070;

	@ObfuscatedName("client.Ob")
	public class44 field1071;

	@ObfuscatedName("client.Pb")
	public class44 field1072;

	@ObfuscatedName("client.Qb")
	public class44 field1073;

	@ObfuscatedName("client.Rb")
	public class44 field1074;

	@ObfuscatedName("client.Sb")
	public class44 field1075;

	@ObfuscatedName("client.Tb")
	public class44 field1076;

	@ObfuscatedName("client.bd")
	public class44 field1131;

	@ObfuscatedName("client.cd")
	public class44 field1132;

	@ObfuscatedName("client.dd")
	public class44 field1133;

	@ObfuscatedName("client.gd")
	public class44 field1136;

	@ObfuscatedName("client.hd")
	public class44 field1137;

	@ObfuscatedName("client.id")
	public class44 field1138;

	@ObfuscatedName("client.jd")
	public class44 field1139;

	@ObfuscatedName("client.kd")
	public class44 field1140;

	@ObfuscatedName("client.ld")
	public class44 field1141;

	@ObfuscatedName("client.md")
	public class44 field1142;

	@ObfuscatedName("client.nd")
	public class44 field1143;

	@ObfuscatedName("client.od")
	public class44 field1144;

	@ObfuscatedName("client.Md")
	public class48 field1164;

	@ObfuscatedName("client.Te")
	public class50 field1218;

	@ObfuscatedName("client.xg")
	public class58 field1291;

	@ObfuscatedName("client.ag")
	public class5 field1270;

	@ObfuscatedName("client.Gf")
	public String field1253;

	@ObfuscatedName("client.dg")
	public String field1273;

	@ObfuscatedName("client.kh")
	public String field1327;

	@ObfuscatedName("client.mj")
	public String field1423;

	@ObfuscatedName("client.yd")
	public static boolean field1151;

	@ObfuscatedName("client.Uh")
	public static boolean field1360;

	@ObfuscatedName("client.bf")
	public int[] field1226;

	@ObfuscatedName("client.cf")
	public int[] field1227;

	@ObfuscatedName("client.df")
	public int[] field1228;

	@ObfuscatedName("client.Qg")
	public int[] field1308;

	@ObfuscatedName("client.Rg")
	public int[] field1309;

	@ObfuscatedName("client.Sg")
	public int[] field1310;

	@ObfuscatedName("client.Wg")
	public int[] field1314;

	@ObfuscatedName("client.Xg")
	public int[] field1315;

	@ObfuscatedName("client.Ah")
	public int[] field1341;

	@ObfuscatedName("client.Bh")
	public int[] field1342;

	@ObfuscatedName("client.Ch")
	public int[] field1343;

	@ObfuscatedName("client.Dh")
	public int[] field1344;

	@ObfuscatedName("client.yi")
	public int[] field1388;

	@ObfuscatedName("client.zi")
	public int[] field1389;

	@ObfuscatedName("client.Bb")
	public class37[] field1059;

	@ObfuscatedName("client.Rf")
	public byte[][] field1263;

	@ObfuscatedName("client.qg")
	public byte[][] field1285;

	@ObfuscatedName("client.ch")
	public byte[][][] field1319;

	@ObfuscatedName("client.Zf")
	public int[][][] field1269;

	@ObfuscatedName("client.f(I)V")
	public final void method427() {
		while (true) {
			class40 var1 = field1164.method290();
			if (var1 == null) {
				return;
			}

			if (var1.field632 == 0) {
				class32.method136(var1.field633, var1.field634);

				if ((field1164.method286(var1.field633) & 0x62) != 0) {
					field1051 = true;

					if (field1265 != -1) {
						field1255 = true;
					}
				}
			}

			if (var1.field632 == 1 && var1.field634 != null) {
				class8.method59(var1.field634);
			}

			if (var1.field632 == 2 && field1385 == var1.field633 && var1.field634 != null) {
				method522(var1.field634, field1386);
			}

			if (var1.field632 == 3 && field1320 == 1) {
				for (int var2 = 0; var2 < field1263.length; var2++) {
					if (field1309[var2] == var1.field633) {
						field1263[var2] = var1.field634;

						if (var1.field634 == null) {
							field1309[var2] = -1;
						}

						break;
					}

					if (field1310[var2] == var1.field633) {
						field1285[var2] = var1.field634;

						if (var1.field634 == null) {
							field1310[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field632 == 93 && field1164.method285(var1.field633)) {
				class3.method17(new class39(var1.field634), field1164);
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method428(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1329; var3++) {
				if (field1237[var3] == arg0) {
					field1329--;
					field1051 = true;

					for (int var4 = var3; var4 < field1329; var4++) {
						field1396[var4] = field1396[var4 + 1];
						field1290[var4] = field1290[var4 + 1];
						field1237[var4] = field1237[var4 + 1];
					}

					field1193.method227(69);
					field1193.method234(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method429(class39 arg0, int arg1) {
		int var3 = arg0.method249(8);
		if (var3 < field1334) {
			for (int var4 = var3; var4 < field1334; var4++) {
				field1185[field1184++] = field1335[var4];
			}
		}

		if (var3 > field1334) {
			signlink.reporterror(field1153 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1334 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1335[var5];
			class28 var7 = field1333[var6];
			int var8 = arg0.method249(1);
			if (var8 == 0) {
				field1335[field1334++] = var6;
				var7.field411 = field1371;
			} else {
				int var9 = arg0.method249(2);
				if (var9 == 0) {
					field1335[field1334++] = var6;
					var7.field411 = field1371;
					field1337[field1336++] = var6;
				} else if (var9 == 1) {
					field1335[field1334++] = var6;
					var7.field411 = field1371;
					int var10 = arg0.method249(3);
					var7.method124(false, var10);
					int var11 = arg0.method249(1);
					if (var11 == 1) {
						field1337[field1336++] = var6;
					}
				} else if (var9 == 2) {
					field1335[field1334++] = var6;
					var7.field411 = field1371;
					int var12 = arg0.method249(3);
					var7.method124(true, var12);
					int var13 = arg0.method249(3);
					var7.method124(true, var13);
					int var14 = arg0.method249(1);
					if (var14 == 1) {
						field1337[field1336++] = var6;
					}
				} else if (var9 == 3) {
					field1185[field1184++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method430() {
		if (field1174 == 0) {
			field1216[0] = "Cancel";
			field1303[0] = 1252;
			field1245 = 1;
			method466();
			field1379 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1223 == -1) {
					method521();
				} else {
					method490(4, 0, class4.field57[field1223], field18, field17, 4);
				}
			}

			if (field1379 != field1252) {
				field1252 = field1379;
			}

			field1379 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1427 != -1) {
					method490(205, 0, class4.field57[field1427], field18, field17, 553);
				} else if (field1092[field1286] != -1) {
					method490(205, 0, class4.field57[field1092[field1286]], field18, field17, 553);
				}
			}

			if (field1379 != field1225) {
				field1051 = true;
				field1225 = field1379;
			}

			field1379 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 426 && field18 < 453) {
				if (field1265 != -1) {
					method490(357, 0, class4.field57[field1265], field18, field17, 17);
				} else if (field18 < 434) {
					method524(field18 - 357, field17 - 17);
				}
			}

			if (field1265 != -1 && field1379 != field1370) {
				field1255 = true;
				field1370 = field1379;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1245 - 1; var2++) {
					if (field1303[var2] < 1000 && field1303[var2 + 1] > 1000) {
						String var3 = field1216[var2];
						field1216[var2] = field1216[var2 + 1];
						field1216[var2 + 1] = var3;
						int var4 = field1303[var2];
						field1303[var2] = field1303[var2 + 1];
						field1303[var2 + 1] = var4;
						int var5 = field1301[var2];
						field1301[var2] = field1301[var2 + 1];
						field1301[var2 + 1] = var5;
						int var6 = field1302[var2];
						field1302[var2] = field1302[var2 + 1];
						field1302[var2 + 1] = var6;
						int var7 = field1304[var2];
						field1304[var2] = field1304[var2 + 1];
						field1304[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljb;IBI)V")
	public final void method431(class36 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1398 + field1117 & 0x7FF;
			int var6 = class32.field548[var5];
			int var7 = class32.field549[var5];
			var6 = var6 * 256 / (field1066 + 256);
			var7 = var7 * 256 / (field1066 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1378.method203(83 - var13 - 20, 256, 15, 20, 15, var12 + 94 + 4 - 10, var10, 20);
		} else {
			method464(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.b(B)Z")
	public final boolean method432() {
		if (field1270 == null) {
			return false;
		}

		try {
			int var1 = field1270.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1259 == -1) {
				field1270.method41(field1163.field620, 0, 1);
				field1259 = field1163.field620[0] & 0xFF;
				if (field1218 != null) {
					field1259 = field1259 - field1218.method304() & 0xFF;
				}

				field1258 = class61.field936[field1259];
				var1--;
			}

			if (field1258 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1270.method41(field1163.field620, 0, 1);
				field1258 = field1163.field620[0] & 0xFF;
				var1--;
			}

			if (field1258 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1270.method41(field1163.field620, 0, 2);
				field1163.field621 = 0;
				field1258 = field1163.method240();
				var1 -= 2;
			}

			if (var1 < field1258) {
				return false;
			}

			field1163.field621 = 0;
			field1270.method41(field1163.field620, 0, field1258);
			field1260 = 0;
			field1409 = field1408;
			field1408 = field1407;
			field1407 = field1259;

			if (field1259 == 241) {
				int var2 = field1163.method240();
				int var3 = field1163.method241();
				int var4 = field1163.method241();
				class4 var5 = class4.field57[var2];
				var5.field70 = var3;
				var5.field71 = var4;
				field1259 = -1;
				return true;
			}

			if (field1259 == 10) {
				int var6 = field1163.method240();
				method477(var6);

				if (field1427 != -1) {
					field1427 = -1;
					field1051 = true;
					field1047 = true;
				}

				if (field1265 != -1) {
					field1265 = -1;
					field1255 = true;
				}

				if (field1129) {
					field1129 = false;
					field1255 = true;
				}

				field1223 = var6;
				field1065 = false;
				field1259 = -1;
				return true;
			}

			if (field1259 == 168) {
				field1093 = field1163.method238();
				if (field1286 == field1093) {
					if (field1093 == 3) {
						field1286 = 1;
					} else {
						field1286 = 3;
					}

					field1051 = true;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 164) {
				int var7 = field1163.method240();
				int var8 = field1163.method240();
				int var9 = field1163.method240();
				class60 var10 = class60.method348(var8);
				class4.field57[var7].field104 = 4;
				class4.field57[var7].field105 = var8;
				class4.field57[var7].field111 = var10.field901;
				class4.field57[var7].field112 = var10.field902;
				class4.field57[var7].field110 = var10.field900 * 100 / var9;
				field1259 = -1;
				return true;
			}

			if (field1259 == 240) {
				int var11 = field1163.method240();
				if (var11 == 0xFFFF) {
					var11 = -1;
				}

				if (field1419 != var11 && field1158 && !field1360) {
					field1385 = var11;
					field1386 = true;
					field1164.method288(2, field1385);
				}

				field1419 = var11;
				field1063 = 0;
				field1259 = -1;
				return true;
			}

			if (field1259 == 173) {
				int var12 = field1163.method240();
				int var13 = field1163.method240();
				if (field1158 && !field1360) {
					field1385 = var12;
					field1386 = false;
					field1164.method288(2, field1385);
					field1063 = var13;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 177) {
				if (field1286 == 12) {
					field1051 = true;
				}

				field1236 = field1163.method238();
				field1259 = -1;
				return true;
			}

			if (field1259 == 49) {
				field1202 = field1163.method238();
				if (field1202 == 1) {
					field1113 = field1163.method240();
				}

				if (field1202 >= 2 && field1202 <= 6) {
					if (field1202 == 2) {
						field1108 = 64;
						field1109 = 64;
					}

					if (field1202 == 3) {
						field1108 = 0;
						field1109 = 64;
					}

					if (field1202 == 4) {
						field1108 = 128;
						field1109 = 64;
					}

					if (field1202 == 5) {
						field1108 = 64;
						field1109 = 0;
					}

					if (field1202 == 6) {
						field1108 = 64;
						field1109 = 128;
					}

					field1202 = 2;
					field1105 = field1163.method240();
					field1106 = field1163.method240();
					field1107 = field1163.method238();
				}

				if (field1202 == 10) {
					field1204 = field1163.method240();
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 222) {
				field1199 = true;
				field1194 = field1163.method238();
				field1195 = field1163.method238();
				field1196 = field1163.method240();
				field1197 = field1163.method238();
				field1198 = field1163.method238();
				if (field1198 >= 100) {
					int var14 = field1194 * 128 + 64;
					int var15 = field1195 * 128 + 64;
					int var16 = method485(var14, field1177, var15) - field1196;
					int var17 = var14 - field1401;
					int var18 = var16 - field1402;
					int var19 = var15 - field1403;
					int var20 = (int) Math.sqrt(var17 * var17 + var19 * var19);
					field1404 = (int) (Math.atan2(var18, var20) * 325.949D) & 0x7FF;
					field1405 = (int) (Math.atan2(var17, var19) * -325.949D) & 0x7FF;

					if (field1404 < 128) {
						field1404 = 128;
					}

					if (field1404 > 383) {
						field1404 = 383;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 62) {
				field1053 = 0;
				field1259 = -1;
				return true;
			}

			if (field1259 == 131) {
				field1229 = field1163.method238();
				field1230 = field1163.method238();
				for (int var21 = field1229; var21 < field1229 + 8; var21++) {
					for (int var22 = field1230; var22 < field1230 + 8; var22++) {
						if (field1271[field1177][var21][var22] != null) {
							field1271[field1177][var21][var22] = null;
							method531(var21, var22);
						}
					}
				}

				for (class41 var23 = (class41) field1205.method257(); var23 != null; var23 = (class41) field1205.method259()) {
					if (var23.field639 >= field1229 && var23.field639 < field1229 + 8 && var23.field640 >= field1230 && var23.field640 < field1230 + 8 && field1177 == var23.field637) {
						var23.field648 = 0;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 160) {
				if (field1286 == 12) {
					field1051 = true;
				}

				field1145 = field1163.method241();
				field1259 = -1;
				return true;
			}

			if (field1259 == 226) {
				int var24 = field1163.method240();
				int var25 = field1163.method243();
				field1267[var24] = var25;

				if (field1264[var24] != var25) {
					field1264[var24] = var25;
					method538(var24);
					field1051 = true;

					if (field1166 != -1) {
						field1255 = true;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 60) {
				class39 var26 = class6.method47();
				if (var26 != null) {
					field1193.method227(217);
					field1193.method229(var26.field621);
					field1193.method236(var26.field621, var26.field620, 0);
					var26.method226();
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 165) {
				int var27 = field1163.method240();
				int var28 = field1163.method240();
				if (field1111 == var27 && field1112 == var28 && field1320 == 2) {
					field1259 = -1;
					return true;
				}

				field1111 = var27;
				field1112 = var28;
				field1392 = (field1111 - 6) * 8;
				field1393 = (field1112 - 6) * 8;
				field1035 = false;
				if ((field1111 / 8 == 48 || field1111 / 8 == 49) && field1112 / 8 == 48) {
					field1035 = true;
				}

				if (field1111 / 8 == 48 && field1112 / 8 == 148) {
					field1035 = true;
				}

				field1320 = 1;
				field1181 = System.currentTimeMillis();
				field1045.method267();
				field1277.method213("Loading - please wait.", 257, 151, 0);
				field1277.method213("Loading - please wait.", 256, 150, 0xFFFFFF);
				field1045.method268(4, 4, field9);
				int var29 = 0;
				for (int var30 = (field1111 - 6) / 8; var30 <= (field1111 + 6) / 8; var30++) {
					for (int var31 = (field1112 - 6) / 8; var31 <= (field1112 + 6) / 8; var31++) {
						var29++;
					}
				}

				field1263 = new byte[var29][];
				field1285 = new byte[var29][];
				field1308 = new int[var29];
				field1309 = new int[var29];
				field1310 = new int[var29];
				int var32 = 0;
				for (int var33 = (field1111 - 6) / 8; var33 <= (field1111 + 6) / 8; var33++) {
					for (int var34 = (field1112 - 6) / 8; var34 <= (field1112 + 6) / 8; var34++) {
						field1308[var32] = (var33 << 8) + var34;

						if (field1035 && (var34 == 49 || var34 == 149 || var34 == 147 || var33 == 50 || var33 == 49 && var34 == 47)) {
							field1309[var32] = -1;
							field1310[var32] = -1;
							var32++;
						} else {
							int var35 = field1309[var32] = field1164.method283(var33, 0, var34);
							if (var35 != -1) {
								field1164.method288(3, var35);
							}

							int var36 = field1310[var32] = field1164.method283(var33, 1, var34);
							if (var36 != -1) {
								field1164.method288(3, var36);
							}

							var32++;
						}
					}
				}

				int var37 = field1392 - field1394;
				int var38 = field1393 - field1395;
				field1394 = field1392;
				field1395 = field1393;

				for (int var39 = 0; var39 < 8192; var39++) {
					class27 var40 = field1077[var39];
					if (var40 != null) {
						for (int var41 = 0; var41 < 10; var41++) {
							var40.field415[var41] -= var37;
							var40.field416[var41] -= var38;
						}

						var40.field366 -= var37 * 128;
						var40.field367 -= var38 * 128;
					}
				}

				for (int var42 = 0; var42 < field1331; var42++) {
					class28 var43 = field1333[var42];
					if (var43 != null) {
						for (int var44 = 0; var44 < 10; var44++) {
							var43.field415[var44] -= var37;
							var43.field416[var44] -= var38;
						}

						var43.field366 -= var37 * 128;
						var43.field367 -= var38 * 128;
					}
				}

				field1147 = true;
				byte var45 = 0;
				byte var46 = 104;
				byte var47 = 1;
				if (var37 < 0) {
					var45 = 103;
					var46 = -1;
					var47 = -1;
				}

				byte var48 = 0;
				byte var49 = 104;
				byte var50 = 1;
				if (var38 < 0) {
					var48 = 103;
					var49 = -1;
					var50 = -1;
				}

				for (int var51 = var45; var51 != var46; var51 += var47) {
					for (int var52 = var48; var52 != var49; var52 += var50) {
						int var53 = var37 + var51;
						int var54 = var38 + var52;
						for (int var55 = 0; var55 < 4; var55++) {
							if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
								field1271[var55][var51][var52] = field1271[var55][var53][var54];
							} else {
								field1271[var55][var51][var52] = null;
							}
						}
					}
				}

				for (class41 var56 = (class41) field1205.method257(); var56 != null; var56 = (class41) field1205.method259()) {
					var56.field639 -= var37;
					var56.field640 -= var38;
					if (var56.field639 < 0 || var56.field640 < 0 || var56.field639 >= 104 || var56.field640 >= 104) {
						var56.method119();
					}
				}

				if (field1053 != 0) {
					field1053 -= var37;
					field1054 -= var38;
				}

				field1199 = false;
				field1259 = -1;
				return true;
			}

			if (field1259 == 132) {
				field1051 = true;
				int var57 = field1163.method240();
				class4 var58 = class4.field57[var57];
				while (field1163.field621 < field1258) {
					int var59 = field1163.method238();
					int var60 = field1163.method240();
					int var61 = field1163.method238();
					if (var61 == 255) {
						var61 = field1163.method243();
					}

					if (var59 >= 0 && var59 < var58.field58.length) {
						var58.field58[var59] = var60;
						var58.field59[var59] = var61;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 78) {
				int var62 = field1163.method240();
				int var63 = field1163.method240();
				int var64 = var63 >> 10 & 0x1F;
				int var65 = var63 >> 5 & 0x1F;
				int var66 = var63 & 0x1F;
				class4.field57[var62].field99 = (var66 << 3) + (var64 << 19) + (var65 << 11);
				field1259 = -1;
				return true;
			}

			if (field1259 == 192) {
				field1187 = 255;
				field1259 = -1;
				return true;
			}

			if (field1259 == 242) {
				for (int var67 = 0; var67 < field1333.length; var67++) {
					if (field1333[var67] != null) {
						field1333[var67].field394 = -1;
					}
				}

				for (int var68 = 0; var68 < field1077.length; var68++) {
					if (field1077[var68] != null) {
						field1077[var68].field394 = -1;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 174) {
				int var69 = field1163.method241();
				field1166 = var69;
				field1255 = true;
				field1259 = -1;
				return true;
			}

			if (field1259 == 94) {
				field1229 = field1163.method238();
				field1230 = field1163.method238();
				field1259 = -1;
				return true;
			}

			if (field1259 == 85) {
				field1361 = field1163.method240() * 30;
				field1259 = -1;
				return true;
			}

			if (field1259 == 95) {
				String var70 = field1163.method245();
				if (var70.endsWith(":tradereq:")) {
					String var71 = var70.substring(0, var70.indexOf(":"));
					long var72 = class52.method309(var71);
					boolean var74 = false;
					for (int var75 = 0; var75 < field1209; var75++) {
						if (field1254[var75] == var72) {
							var74 = true;
							break;
						}
					}

					if (!var74 && field1213 == 0) {
						method470(4, "wishes to trade with you.", var71);
					}
				} else if (var70.endsWith(":duelreq:")) {
					String var76 = var70.substring(0, var70.indexOf(":"));
					long var77 = class52.method309(var76);
					boolean var79 = false;
					for (int var80 = 0; var80 < field1209; var80++) {
						if (field1254[var80] == var77) {
							var79 = true;
							break;
						}
					}

					if (!var79 && field1213 == 0) {
						method470(8, "wishes to duel with you.", var76);
					}
				} else {
					method470(0, var70, "");
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 108) {
				int var81 = field1163.method240();
				class4.field57[var81].field104 = 3;
				class4.field57[var81].field105 = (field1115.field425[8] << 6) + (field1115.field425[0] << 12) + (field1115.field426[0] << 24) + (field1115.field426[4] << 18) + field1115.field425[11];
				field1259 = -1;
				return true;
			}

			if (field1259 == 44) {
				field1130 = field1163.method243();
				field1029 = field1163.method240();
				field1247 = field1163.method238();
				field1224 = field1163.method240();
				field1208 = field1163.method238();
				if (field1130 != 0 && field1223 == -1) {
					signlink.dnslookup(class52.method312(field1130));
					method489();
					short var82 = 650;
					if (field1247 != 201 || field1208 == 1) {
						var82 = 655;
					}

					field1312 = "";
					field1192 = false;

					for (int var83 = 0; var83 < class4.field57.length; var83++) {
						if (class4.field57[var83] != null && class4.field57[var83].field66 == var82) {
							field1223 = class4.field57[var83].field63;
							break;
						}
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 22) {
				class6.method44();
				field1259 = -1;
				return true;
			}

			if (field1259 == 129) {
				int var84 = field1163.method240();
				int var85 = field1163.method240();
				class4.field57[var84].field104 = 2;
				class4.field57[var84].field105 = var85;
				field1259 = -1;
				return true;
			}

			if (field1259 == 214) {
				if (field1427 != -1) {
					field1427 = -1;
					field1051 = true;
					field1047 = true;
				}

				if (field1265 != -1) {
					field1265 = -1;
					field1255 = true;
				}

				if (field1129) {
					field1129 = false;
					field1255 = true;
				}

				field1223 = -1;
				field1065 = false;
				field1259 = -1;
				return true;
			}

			if (field1259 == 154) {
				int var86 = field1163.method240();
				String var87 = field1163.method245();
				class4.field57[var86].field97 = var87;

				if (field1092[field1286] == class4.field57[var86].field63) {
					field1051 = true;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 209 || field1259 == 29 || field1259 == 69 || field1259 == 198 || field1259 == 137 || field1259 == 39 || field1259 == 234 || field1259 == 155 || field1259 == 125 || field1259 == 232) {
				method495(field1163, field1259);
				field1259 = -1;
				return true;
			}

			if (field1259 == 244) {
				method517(field1163, field1258);
				field1259 = -1;
				return true;
			}

			if (field1259 == 152) {
				field1251 = false;
				field1129 = true;
				field1098 = "";
				field1255 = true;
				field1259 = -1;
				return true;
			}

			if (field1259 == 7) {
				field1209 = field1258 / 8;
				for (int var88 = 0; var88 < field1209; var88++) {
					field1254[var88] = field1163.method244();
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 9) {
				field1064 = field1163.method238();
				field1156 = field1163.method238();
				field1183 = field1163.method238();
				field1101 = true;
				field1255 = true;
				field1259 = -1;
				return true;
			}

			if (field1259 == 70) {
				long var89 = field1163.method244();
				int var91 = field1163.method238();
				String var92 = class52.method313(class52.method310(var89));
				for (int var93 = 0; var93 < field1329; var93++) {
					if (field1237[var93] == var89) {
						if (field1290[var93] != var91) {
							field1290[var93] = var91;
							field1051 = true;

							if (var91 > 0) {
								method470(5, var92 + " has logged in.", "");
							}

							if (var91 == 0) {
								method470(5, var92 + " has logged out.", "");
							}
						}

						var92 = null;
						break;
					}
				}

				if (var92 != null && field1329 < 200) {
					field1237[field1329] = var89;
					field1396[field1329] = var92;
					field1290[field1329] = var91;
					field1329++;
					field1051 = true;
				}

				boolean var94 = false;
				while (!var94) {
					var94 = true;
					for (int var95 = 0; var95 < field1329 - 1; var95++) {
						if (field1290[var95] != field1357 && field1290[var95 + 1] == field1357 || field1290[var95] == 0 && field1290[var95 + 1] != 0) {
							int var96 = field1290[var95];
							field1290[var95] = field1290[var95 + 1];
							field1290[var95 + 1] = var96;
							String var97 = field1396[var95];
							field1396[var95] = field1396[var95 + 1];
							field1396[var95 + 1] = var97;
							long var98 = field1237[var95];
							field1237[var95] = field1237[var95 + 1];
							field1237[var95 + 1] = var98;
							field1051 = true;
							var94 = false;
						}
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 24) {
				field1051 = true;
				int var100 = field1163.method238();
				int var101 = field1163.method243();
				int var102 = field1163.method238();
				field1373[var100] = var101;
				field1235[var100] = var102;
				field1215[var100] = 1;
				for (int var103 = 0; var103 < 98; var103++) {
					if (var101 >= field1328[var103]) {
						field1215[var100] = var103 + 2;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 56) {
				field1286 = field1163.method238();
				field1051 = true;
				field1047 = true;
				field1259 = -1;
				return true;
			}

			if (field1259 == 17) {
				method467();
				field1259 = -1;
				return false;
			}

			if (field1259 == 219) {
				int var104 = field1163.method240();
				int var105 = field1163.method240();
				class4.field57[var104].field108 = var105;
				field1259 = -1;
				return true;
			}

			if (field1259 == 245) {
				int var106 = field1163.method240();
				int var107 = field1163.method240();
				class4.field57[var106].field104 = 1;
				class4.field57[var106].field105 = var107;
				field1259 = -1;
				return true;
			}

			if (field1259 == 30) {
				long var108 = field1163.method244();
				int var110 = field1163.method243();
				int var111 = field1163.method238();
				boolean var112 = false;
				for (int var113 = 0; var113 < 100; var113++) {
					if (field1352[var113] == var110) {
						var112 = true;
						break;
					}
				}

				if (var111 <= 1) {
					for (int var114 = 0; var114 < field1209; var114++) {
						if (field1254[var114] == var108) {
							var112 = true;
							break;
						}
					}
				}

				if (!var112 && field1213 == 0) {
					try {
						field1352[field1313] = var110;
						field1313 = (field1313 + 1) % 100;
						String var115 = class53.method316(field1258 - 13, field1163);
						var115 = class69.method399(var115);
						if (var111 == 2 || var111 == 3) {
							method470(7, var115, "@cr2@" + class52.method313(class52.method310(var108)));
						} else if (var111 == 1) {
							method470(7, var115, "@cr1@" + class52.method313(class52.method310(var108)));
						} else {
							method470(3, var115, class52.method313(class52.method310(var108)));
						}
					} catch (Exception var150) {
						signlink.reporterror("cde1");
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 53) {
				field1199 = false;

				for (int var117 = 0; var117 < 5; var117++) {
					field1182[var117] = false;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 86) {
				method478(field1258, field1163);
				field1147 = false;
				field1259 = -1;
				return true;
			}

			if (field1259 == 236) {
				int var118 = field1163.method240();
				byte var119 = field1163.method239();
				field1267[var118] = var119;

				if (field1264[var118] != var119) {
					field1264[var118] = var119;
					method538(var118);
					field1051 = true;

					if (field1166 != -1) {
						field1255 = true;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 176) {
				int var120 = field1163.method240();
				method477(var120);

				if (field1265 != -1) {
					field1265 = -1;
					field1255 = true;
				}

				if (field1129) {
					field1129 = false;
					field1255 = true;
				}

				field1427 = var120;
				field1051 = true;
				field1047 = true;
				field1223 = -1;
				field1065 = false;
				field1259 = -1;
				return true;
			}

			if (field1259 == 123) {
				int var121 = field1163.method240();
				boolean var122 = field1163.method238() == 1;
				class4.field57[var121].field78 = var122;
				field1259 = -1;
				return true;
			}

			if (field1259 == 200) {
				int var123 = field1163.method240();
				int var124 = field1163.method238();

				if (var123 == 0xFFFF) {
					var123 = -1;
				}

				field1092[var124] = var123;
				field1051 = true;
				field1047 = true;
				field1259 = -1;
				return true;
			}

			if (field1259 == 189) {
				int var125 = field1163.method240();
				method477(var125);

				if (field1427 != -1) {
					field1427 = -1;
					field1051 = true;
					field1047 = true;
				}

				field1265 = var125;
				field1255 = true;
				field1223 = -1;
				field1065 = false;
				field1259 = -1;
				return true;
			}

			if (field1259 == 233) {
				field1229 = field1163.method238();
				field1230 = field1163.method238();

				while (field1163.field621 < field1258) {
					int var126 = field1163.method238();
					method495(field1163, var126);
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 12) {
				field1199 = true;
				field1411 = field1163.method238();
				field1412 = field1163.method238();
				field1413 = field1163.method240();
				field1414 = field1163.method238();
				field1415 = field1163.method238();
				if (field1415 >= 100) {
					field1401 = field1411 * 128 + 64;
					field1403 = field1412 * 128 + 64;
					field1402 = method485(field1401, field1177, field1403) - field1413;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 210) {
				field1287 = field1163.method240();
				field1062 = field1163.method238();
				field1259 = -1;
				return true;
			}

			if (field1259 == 162) {
				int var127 = field1163.method240();
				class4 var128 = class4.field57[var127];
				for (int var129 = 0; var129 < var128.field58.length; var129++) {
					var128.field58[var129] = -1;
					var128.field58[var129] = 0;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 158) {
				int var130 = field1163.method241();
				field1256 = var130;
				field1259 = -1;
				return true;
			}

			if (field1259 == 87) {
				for (int var131 = 0; var131 < field1264.length; var131++) {
					if (field1267[var131] != field1264[var131]) {
						field1264[var131] = field1267[var131];
						method538(var131);
						field1051 = true;
					}
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 151) {
				int var132 = field1163.method240();
				int var133 = field1163.method238();
				int var134 = field1163.method240();
				if (field1384 && !field1360 && field1289 < 50) {
					field1094[field1289] = var132;
					field1330[field1289] = var133;
					field1114[field1289] = class55.field780[var132] + var134;
					field1289++;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 72) {
				field1051 = true;
				int var135 = field1163.method240();
				class4 var136 = class4.field57[var135];
				int var137 = field1163.method238();
				for (int var138 = 0; var138 < var137; var138++) {
					var136.field58[var138] = field1163.method240();
					int var139 = field1163.method238();
					if (var139 == 255) {
						var139 = field1163.method243();
					}

					var136.field59[var138] = var139;
				}

				for (int var140 = var137; var140 < var136.field58.length; var140++) {
					var136.field58[var140] = 0;
					var136.field59[var140] = 0;
				}

				field1259 = -1;
				return true;
			}

			if (field1259 == 97) {
				field1084 = field1163.method238();
				field1259 = -1;
				return true;
			}

			if (field1259 == 207) {
				int var141 = field1163.method240();
				int var142 = field1163.method240();

				if (field1265 != -1) {
					field1265 = -1;
					field1255 = true;
				}

				if (field1129) {
					field1129 = false;
					field1255 = true;
				}

				field1223 = var141;
				field1427 = var142;
				field1051 = true;
				field1047 = true;
				field1065 = false;
				field1259 = -1;
				return true;
			}

			if (field1259 == 50) {
				int var143 = field1163.method238();
				int var144 = field1163.method238();
				int var145 = field1163.method238();
				int var146 = field1163.method238();
				field1182[var143] = true;
				field1061[var143] = var144;
				field1214[var143] = var145;
				field1257[var143] = var146;
				field1189[var143] = 0;
				field1259 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1259 + "," + field1258 + " - " + field1408 + "," + field1409);
			method467();
		} catch (IOException var151) {
			method507();
		} catch (Exception var152) {
			String var148 = "T2 - " + field1259 + "," + field1408 + "," + field1409 + " - " + field1258 + "," + (field1115.field415[0] + field1392) + "," + (field1115.field416[0] + field1393) + " - ";
			for (int var149 = 0; var149 < field1258 && var149 < 50; var149++) {
				var148 = var148 + field1163.field620[var149] + ",";
			}

			signlink.reporterror(var148);
			method467();
		}

		return true;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method433() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1372) {
			field1148 = false;
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

		if (field1387) {
			field1148 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1350) {
			field1148 = false;
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

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.h(I)V")
	public final void method434() {
		if (field1174 == 0) {
			int var1 = field23;
			if (field1420 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1152) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1280 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1280 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1280 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1281 - 10 || var2 > field1283 + field1281 + 10 || var3 < field1282 - 10 || var3 > field1284 + field1282 + 10) {
						field1152 = false;

						if (field1280 == 1) {
							field1051 = true;
						}

						if (field1280 == 2) {
							field1255 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1281;
					int var5 = field1282;
					int var6 = field1283;
					int var7 = field24;
					int var8 = field25;
					if (field1280 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1280 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1280 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1245; var10++) {
						int var11 = (field1245 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method483(var9);
					}

					field1152 = false;

					if (field1280 == 1) {
						field1051 = true;
					}

					if (field1280 == 2) {
						field1255 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1245 > 0) {
					int var12 = field1303[field1245 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = field1301[field1245 - 1];
						int var14 = field1302[field1245 - 1];
						class4 var15 = class4.field57[var14];
						if (var15.field84) {
							field1232 = false;
							field1162 = 0;
							field1172 = var14;
							field1173 = var13;
							field1174 = 2;
							field1175 = field24;
							field1176 = field25;

							if (class4.field57[var14].field63 == field1223) {
								field1174 = 1;
							}

							if (class4.field57[var14].field63 == field1265) {
								field1174 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1417 == 1 || method548(field1245 - 1)) && field1245 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1245 > 0) {
					method483(field1245 - 1);
				}

				if (var1 != 2 || field1245 <= 0) {
					return;
				}

				method525();
			}
		}
	}

	@ObfuscatedName("client.a(ZII)Ljava/lang/String;")
	public static final String method435(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(Z)V")
	public final void method436() {
		for (int var1 = 0; var1 < field1078; var1++) {
			int var2 = field1079[var1];
			class27 var3 = field1077[var2];
			if (var3 != null) {
				method437(var3, var3.field420.field864);
			}
		}
	}

	@ObfuscatedName("client.a(Lz;II)V")
	public final void method437(class26 arg0, int arg1) {
		if (arg0.field366 < 128 || arg0.field367 < 128 || arg0.field366 >= 13184 || arg0.field367 >= 13184) {
			arg0.field394 = -1;
			arg0.field399 = -1;
			arg0.field408 = 0;
			arg0.field409 = 0;
			arg0.field366 = arg0.field415[0] * 128 + arg0.field370 * 64;
			arg0.field367 = arg0.field416[0] * 128 + arg0.field370 * 64;
			arg0.method125();
		}

		if (field1115 == arg0 && (arg0.field366 < 1536 || arg0.field367 < 1536 || arg0.field366 >= 11776 || arg0.field367 >= 11776)) {
			arg0.field394 = -1;
			arg0.field399 = -1;
			arg0.field408 = 0;
			arg0.field409 = 0;
			arg0.field366 = arg0.field415[0] * 128 + arg0.field370 * 64;
			arg0.field367 = arg0.field416[0] * 128 + arg0.field370 * 64;
			arg0.method125();
		}

		if (arg0.field408 > field1371) {
			method438(arg0);
		} else if (arg0.field409 >= field1371) {
			method439(arg0);
		} else {
			method440(arg0);
		}

		method441(arg0);
		method442(arg0);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method438(class26 arg0) {
		int var2 = arg0.field408 - field1371;
		int var3 = arg0.field404 * 128 + arg0.field370 * 64;
		int var4 = arg0.field406 * 128 + arg0.field370 * 64;
		arg0.field366 += (var3 - arg0.field366) / var2;
		arg0.field367 += (var4 - arg0.field367) / var2;
		arg0.field418 = 0;

		if (arg0.field410 == 0) {
			arg0.field413 = 1024;
		}

		if (arg0.field410 == 1) {
			arg0.field413 = 1536;
		}

		if (arg0.field410 == 2) {
			arg0.field413 = 0;
		}

		if (arg0.field410 == 3) {
			arg0.field413 = 512;
		}
	}

	@ObfuscatedName("client.b(ILz;)V")
	public final void method439(class26 arg0) {
		if (field1371 == arg0.field409 || arg0.field394 == -1 || arg0.field397 != 0 || arg0.field396 + 1 > class66.field973[arg0.field394].method382(arg0.field395)) {
			int var2 = arg0.field409 - arg0.field408;
			int var3 = field1371 - arg0.field408;
			int var4 = arg0.field404 * 128 + arg0.field370 * 64;
			int var5 = arg0.field406 * 128 + arg0.field370 * 64;
			int var6 = arg0.field405 * 128 + arg0.field370 * 64;
			int var7 = arg0.field407 * 128 + arg0.field370 * 64;
			arg0.field366 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field367 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field418 = 0;

		if (arg0.field410 == 0) {
			arg0.field413 = 1024;
		}

		if (arg0.field410 == 1) {
			arg0.field413 = 1536;
		}

		if (arg0.field410 == 2) {
			arg0.field413 = 0;
		}

		if (arg0.field410 == 3) {
			arg0.field413 = 512;
		}

		arg0.field368 = arg0.field413;
	}

	@ObfuscatedName("client.c(ILz;)V")
	public final void method440(class26 arg0) {
		arg0.field391 = arg0.field371;
		if (arg0.field414 == 0) {
			arg0.field418 = 0;
		} else {
			if (arg0.field394 != -1 && arg0.field397 == 0) {
				class66 var2 = class66.field973[arg0.field394];
				if (arg0.field419 > 0 && var2.field985 == 0) {
					arg0.field418++;
					return;
				}

				if (arg0.field419 <= 0 && var2.field986 == 0) {
					arg0.field418++;
					return;
				}
			}

			int var3 = arg0.field366;
			int var4 = arg0.field367;
			int var5 = arg0.field415[arg0.field414 - 1] * 128 + arg0.field370 * 64;
			int var6 = arg0.field416[arg0.field414 - 1] * 128 + arg0.field370 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field413 = 1280;
					} else if (var4 > var6) {
						arg0.field413 = 1792;
					} else {
						arg0.field413 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field413 = 768;
					} else if (var4 > var6) {
						arg0.field413 = 256;
					} else {
						arg0.field413 = 512;
					}
				} else if (var4 < var6) {
					arg0.field413 = 1024;
				} else {
					arg0.field413 = 0;
				}

				int var7 = arg0.field413 - arg0.field368 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field374;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field373;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field376;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field375;
				}

				if (var8 == -1) {
					var8 = arg0.field373;
				}

				arg0.field391 = var8;
				int var9 = 4;
				if (arg0.field413 != arg0.field368 && arg0.field388 == -1) {
					var9 = 2;
				}

				if (arg0.field414 > 2) {
					var9 = 6;
				}

				if (arg0.field414 > 3) {
					var9 = 8;
				}

				if (arg0.field418 > 0 && arg0.field414 > 1) {
					var9 = 8;
					arg0.field418--;
				}

				if (arg0.field417[arg0.field414 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field391 == arg0.field373 && arg0.field377 != -1) {
					arg0.field391 = arg0.field377;
				}

				if (var3 < var5) {
					arg0.field366 += var9;
					if (arg0.field366 > var5) {
						arg0.field366 = var5;
					}
				} else if (var3 > var5) {
					arg0.field366 -= var9;
					if (arg0.field366 < var5) {
						arg0.field366 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field367 += var9;
					if (arg0.field367 > var6) {
						arg0.field367 = var6;
					}
				} else if (var4 > var6) {
					arg0.field367 -= var9;
					if (arg0.field367 < var6) {
						arg0.field367 = var6;
					}
				}

				if (arg0.field366 == var5 && arg0.field367 == var6) {
					arg0.field414--;

					if (arg0.field419 > 0) {
						arg0.field419--;
						return;
					}
				}
			} else {
				arg0.field366 = var5;
				arg0.field367 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ZLz;)V")
	public final void method441(class26 arg0) {
		if (arg0.field388 != -1 && arg0.field388 < 32768) {
			class27 var2 = field1077[arg0.field388];
			if (var2 != null) {
				int var3 = arg0.field366 - var2.field366;
				int var4 = arg0.field367 - var2.field367;
				if (var3 != 0 || var4 != 0) {
					arg0.field413 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field388 >= 32768) {
			int var5 = arg0.field388 - 32768;
			if (field1287 == var5) {
				var5 = field1332;
			}

			class28 var6 = field1333[var5];
			if (var6 != null) {
				int var7 = arg0.field366 - var6.field366;
				int var8 = arg0.field367 - var6.field367;
				if (var7 != 0 || var8 != 0) {
					arg0.field413 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field389 != 0 || arg0.field390 != 0) && (arg0.field414 == 0 || arg0.field418 > 0)) {
			int var9 = arg0.field366 - (arg0.field389 - field1392 - field1392) * 64;
			int var10 = arg0.field367 - (arg0.field390 - field1393 - field1393) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field413 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field389 = 0;
			arg0.field390 = 0;
		}

		int var11 = arg0.field413 - arg0.field368 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field368 = arg0.field413;
			} else if (var11 > 1024) {
				arg0.field368 -= 32;
			} else {
				arg0.field368 += 32;
			}

			arg0.field368 &= 0x7FF;
			if (arg0.field391 == arg0.field371 && arg0.field413 != arg0.field368) {
				if (arg0.field372 != -1) {
					arg0.field391 = arg0.field372;
					return;
				}

				arg0.field391 = arg0.field373;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method442(class26 arg0) {
		arg0.field369 = false;

		if (arg0.field391 != -1) {
			class66 var2 = class66.field973[arg0.field391];
			arg0.field393++;
			if (arg0.field392 < var2.field974 && arg0.field393 > var2.method382(arg0.field392)) {
				arg0.field393 = 0;
				arg0.field392++;
			}

			if (arg0.field392 >= var2.field974) {
				arg0.field393 = 0;
				arg0.field392 = 0;
			}
		}

		if (arg0.field399 != -1 && field1371 >= arg0.field402) {
			if (arg0.field400 < 0) {
				arg0.field400 = 0;
			}

			class66 var3 = class67.field989[arg0.field399].field993;
			arg0.field401++;
			while (arg0.field400 < var3.field974 && arg0.field401 > var3.method382(arg0.field400)) {
				arg0.field401 -= var3.method382(arg0.field400);
				arg0.field400++;
			}

			if (arg0.field400 >= var3.field974 && (arg0.field400 < 0 || arg0.field400 >= var3.field974)) {
				arg0.field399 = -1;
			}
		}

		if (arg0.field394 != -1 && arg0.field397 <= 1) {
			class66 var4 = class66.field973[arg0.field394];
			if (var4.field985 == 1 && arg0.field419 > 0 && arg0.field408 <= field1371 && arg0.field409 < field1371) {
				arg0.field397 = 1;
				return;
			}
		}

		if (arg0.field394 != -1 && arg0.field397 == 0) {
			class66 var5 = class66.field973[arg0.field394];
			arg0.field396++;
			while (arg0.field395 < var5.field974 && arg0.field396 > var5.method382(arg0.field395)) {
				arg0.field396 -= var5.method382(arg0.field395);
				arg0.field395++;
			}

			if (arg0.field395 >= var5.field974) {
				arg0.field395 -= var5.field978;
				arg0.field398++;
				if (arg0.field398 >= var5.field984) {
					arg0.field394 = -1;
				}

				if (arg0.field395 < 0 || arg0.field395 >= var5.field974) {
					arg0.field394 = -1;
				}
			}

			arg0.field369 = var5.field980;
		}

		if (arg0.field397 > 0) {
			arg0.field397--;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method443() {
		if (field1049) {
			field1049 = false;
			field1136.method268(4, 0, field9);
			field1137.method268(357, 0, field9);
			field1138.method268(4, 722, field9);
			field1139.method268(205, 743, field9);
			field1140.method268(0, 0, field9);
			field1141.method268(4, 516, field9);
			field1142.method268(205, 516, field9);
			field1143.method268(357, 496, field9);
			field1144.method268(338, 0, field9);
			field1051 = true;
			field1255 = true;
			field1047 = true;
			field1101 = true;

			if (field1320 != 2) {
				field1045.method268(4, 4, field9);
				field1044.method268(4, 550, field9);
			}
		}

		if (field1320 == 2) {
			method446();
		}

		if (field1152 && field1280 == 1) {
			field1051 = true;
		}

		if (field1427 != -1) {
			boolean var1 = method481(field1169, field1427);
			if (var1) {
				field1051 = true;
			}
		}

		if (field1356 == 2) {
			field1051 = true;
		}

		if (field1174 == 2) {
			field1051 = true;
		}

		if (field1051) {
			method514();
			field1051 = false;
		}

		if (field1265 == -1) {
			field1410.field77 = field1135 - field1246 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method556(field17 - 17, 0, 463, field1135, false, field1410, field18 - 357, 77);
			}

			int var2 = field1135 - field1410.field77 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1135 - 77) {
				var2 = field1135 - 77;
			}

			if (field1246 != var2) {
				field1246 = var2;
				field1255 = true;
			}
		}

		if (field1265 != -1) {
			boolean var3 = method481(field1169, field1265);
			if (var3) {
				field1255 = true;
			}
		}

		if (field1356 == 3) {
			field1255 = true;
		}

		if (field1174 == 3) {
			field1255 = true;
		}

		if (field1273 != null) {
			field1255 = true;
		}

		if (field1152 && field1280 == 2) {
			field1255 = true;
		}

		if (field1255) {
			method555();
			field1255 = false;
		}

		if (field1320 == 2) {
			method458();
			field1044.method268(4, 550, field9);
		}

		if (field1093 != -1) {
			field1047 = true;
		}

		if (field1047) {
			if (field1093 != -1 && field1286 == field1093) {
				field1093 = -1;
				field1193.method227(233);
				field1193.method228(field1286);
			}

			field1047 = false;
			field1133.method267();
			field1032.method211(0, 0);

			if (field1427 == -1) {
				if (field1092[field1286] != -1) {
					if (field1286 == 0) {
						field1238.method211(10, 22);
					}

					if (field1286 == 1) {
						field1239.method211(8, 54);
					}

					if (field1286 == 2) {
						field1239.method211(8, 82);
					}

					if (field1286 == 3) {
						field1240.method211(8, 110);
					}

					if (field1286 == 4) {
						field1242.method211(8, 153);
					}

					if (field1286 == 5) {
						field1242.method211(8, 181);
					}

					if (field1286 == 6) {
						field1241.method211(9, 209);
					}
				}

				if (field1092[0] != -1 && (field1093 != 0 || field1371 % 20 < 10)) {
					field1295[0].method211(13, 29);
				}

				if (field1092[1] != -1 && (field1093 != 1 || field1371 % 20 < 10)) {
					field1295[1].method211(11, 53);
				}

				if (field1092[2] != -1 && (field1093 != 2 || field1371 % 20 < 10)) {
					field1295[2].method211(11, 82);
				}

				if (field1092[3] != -1 && (field1093 != 3 || field1371 % 20 < 10)) {
					field1295[3].method211(12, 115);
				}

				if (field1092[4] != -1 && (field1093 != 4 || field1371 % 20 < 10)) {
					field1295[4].method211(13, 153);
				}

				if (field1092[5] != -1 && (field1093 != 5 || field1371 % 20 < 10)) {
					field1295[5].method211(11, 180);
				}

				if (field1092[6] != -1 && (field1093 != 6 || field1371 % 20 < 10)) {
					field1295[6].method211(13, 208);
				}
			}

			field1133.method268(160, 516, field9);
			field1132.method267();
			field1031.method211(0, 0);

			if (field1427 == -1) {
				if (field1092[field1286] != -1) {
					if (field1286 == 7) {
						field1037.method211(0, 42);
					}

					if (field1286 == 8) {
						field1038.method211(0, 74);
					}

					if (field1286 == 9) {
						field1038.method211(0, 102);
					}

					if (field1286 == 10) {
						field1039.method211(1, 130);
					}

					if (field1286 == 11) {
						field1041.method211(0, 173);
					}

					if (field1286 == 12) {
						field1041.method211(0, 201);
					}

					if (field1286 == 13) {
						field1040.method211(0, 229);
					}
				}

				if (field1092[8] != -1 && (field1093 != 8 || field1371 % 20 < 10)) {
					field1295[7].method211(2, 74);
				}

				if (field1092[9] != -1 && (field1093 != 9 || field1371 % 20 < 10)) {
					field1295[8].method211(3, 102);
				}

				if (field1092[10] != -1 && (field1093 != 10 || field1371 % 20 < 10)) {
					field1295[9].method211(4, 137);
				}

				if (field1092[11] != -1 && (field1093 != 11 || field1371 % 20 < 10)) {
					field1295[10].method211(2, 174);
				}

				if (field1092[12] != -1 && (field1093 != 12 || field1371 % 20 < 10)) {
					field1295[11].method211(2, 201);
				}

				if (field1092[13] != -1 && (field1093 != 13 || field1371 % 20 < 10)) {
					field1295[12].method211(2, 226);
				}
			}

			field1132.method268(466, 496, field9);
			field1045.method267();
		}

		if (field1101) {
			field1101 = false;
			field1131.method267();
			field1030.method211(0, 0);
			field1277.method214(28, true, 0xFFFFFF, "Public chat", 55);

			if (field1064 == 0) {
				field1277.method214(41, true, 0xFF00, "On", 55);
			}

			if (field1064 == 1) {
				field1277.method214(41, true, 0xFFFF00, "Friends", 55);
			}

			if (field1064 == 2) {
				field1277.method214(41, true, 0xFF0000, "Off", 55);
			}

			if (field1064 == 3) {
				field1277.method214(41, true, 0xFFFF, "Hide", 55);
			}

			field1277.method214(28, true, 0xFFFFFF, "Private chat", 184);

			if (field1156 == 0) {
				field1277.method214(41, true, 0xFF00, "On", 184);
			}

			if (field1156 == 1) {
				field1277.method214(41, true, 0xFFFF00, "Friends", 184);
			}

			if (field1156 == 2) {
				field1277.method214(41, true, 0xFF0000, "Off", 184);
			}

			field1277.method214(28, true, 0xFFFFFF, "Trade/duel", 324);

			if (field1183 == 0) {
				field1277.method214(41, true, 0xFF00, "On", 324);
			}

			if (field1183 == 1) {
				field1277.method214(41, true, 0xFFFF00, "Friends", 324);
			}

			if (field1183 == 2) {
				field1277.method214(41, true, 0xFF0000, "Off", 324);
			}

			field1277.method214(33, true, 0xFFFFFF, "Report abuse", 458);
			field1131.method268(453, 0, field9);
			field1045.method267();
		}

		field1169 = 0;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method444() {
		for (class33 var1 = (class33) field1155.method257(); var1 != null; var1 = (class33) field1155.method259()) {
			if (field1177 != var1.field554 || var1.field560) {
				var1.method119();
			} else if (field1371 >= var1.field553) {
				var1.method163(field1169);

				if (var1.field560) {
					var1.method119();
				} else {
					field1383.method74(var1.field554, var1, var1.field556, var1.field557, var1.field555, 0, -1, 60, false);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILbb;I)V")
	public final void method445(int arg0, int arg1, class28 arg2, int arg3) {
		if (field1115 != arg2 && field1245 < 400) {
			String var5 = arg2.field421 + method435(arg2.field427, field1115.field427) + " (level-" + arg2.field427 + ")";
			if (field1323 == 1) {
				field1216[field1245] = "Use " + field1327 + " with @whi@" + var5;
				field1303[field1245] = 367;
				field1304[field1245] = arg1;
				field1301[field1245] = arg3;
				field1302[field1245] = arg0;
				field1245++;
			} else if (field1420 != 1) {
				field1216[field1245] = "Follow @whi@" + var5;
				field1303[field1245] = 1544;
				field1304[field1245] = arg1;
				field1301[field1245] = arg3;
				field1302[field1245] = arg0;
				field1245++;
				if (field1213 == 0) {
					field1216[field1245] = "Trade with @whi@" + var5;
					field1303[field1245] = 1373;
					field1304[field1245] = arg1;
					field1301[field1245] = arg3;
					field1302[field1245] = arg0;
					field1245++;
				}

				if (field1381 > 0) {
					field1216[field1245] = "Attack @whi@" + var5;

					if (field1115.field427 >= arg2.field427) {
						field1303[field1245] = 151;
					} else {
						field1303[field1245] = 2151;
					}

					field1304[field1245] = arg1;
					field1301[field1245] = arg3;
					field1302[field1245] = arg0;
					field1245++;
				}

				if (field1369 == 1) {
					field1216[field1245] = "Fight @whi@" + var5;
					field1303[field1245] = 151;
					field1304[field1245] = arg1;
					field1301[field1245] = arg3;
					field1302[field1245] = arg0;
					field1245++;
				}

				if (field1369 == 2) {
					field1216[field1245] = "Duel-with @whi@" + var5;
					field1303[field1245] = 1101;
					field1304[field1245] = arg1;
					field1301[field1245] = arg3;
					field1302[field1245] = arg0;
					field1245++;
				}
			} else if ((field1422 & 0x8) == 8) {
				field1216[field1245] = field1423 + " @whi@" + var5;
				field1303[field1245] = 651;
				field1304[field1245] = arg1;
				field1301[field1245] = arg3;
				field1302[field1245] = arg0;
				field1245++;
			}

			for (int var6 = 0; var6 < field1245; var6++) {
				if (field1303[var6] == 660) {
					field1216[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method446() {
		field1165++;
		method460(true);
		method479();
		method460(false);
		method513();
		method444();

		if (!field1199) {
			int var1 = field1397;
			if (field1083 / 256 > var1) {
				var1 = field1083 / 256;
			}

			if (field1182[4] && field1214[4] + 128 > var1) {
				var1 = field1214[4] + 128;
			}

			int var2 = field1398 + field1210 & 0x7FF;
			method544(method485(field1115.field366, field1177, field1115.field367) - 50, var2, var1, field1033, field1034, var1 * 3 + 600);
			field1186++;
			if (field1186 > 1802) {
				field1186 = 0;
				field1193.method227(148);
				field1193.method228(0);
				int var3 = field1193.field621;
				field1193.method229(29711);
				field1193.method228(70);
				field1193.method228((int) (Math.random() * 256.0D));
				field1193.method228(242);
				field1193.method228(186);
				field1193.method228(39);
				field1193.method228(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1193.method228(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1193.method229(57856);
				}

				field1193.method229((int) (Math.random() * 65536.0D));
				field1193.method237(field1193.field621 - var3);
			}
		}

		int var4;
		if (field1199) {
			var4 = method503();
		} else {
			var4 = method502();
		}

		int var5 = field1401;
		int var6 = field1402;
		int var7 = field1403;
		int var8 = field1404;
		int var9 = field1405;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1182[var10]) {
				int var11 = (int) (Math.random() * (field1061[var10] * 2 + 1) + Math.sin(field1257[var10] / 100.0D * field1189[var10]) * field1214[var10] - field1061[var10]);
				if (var10 == 0) {
					field1401 += var11;
				}

				if (var10 == 1) {
					field1402 += var11;
				}

				if (var10 == 2) {
					field1403 += var11;
				}

				if (var10 == 3) {
					field1405 = field1405 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1404 += var11;
					if (field1404 < 128) {
						field1404 = 128;
					}

					if (field1404 > 383) {
						field1404 = 383;
					}
				}
			}
		}

		int var12 = class35.field591;
		class32.field543 = true;
		class32.field546 = 0;
		class32.field544 = field17 - 4;
		class32.field545 = field18 - 4;
		class34.method167();
		field1383.method102(field1402, field1405, var4, field1404, field1403, field1401);
		field1383.method77();
		method547();
		method465();
		method515(var12);
		method447();
		field1045.method268(4, 4, field9);
		field1401 = var5;
		field1402 = var6;
		field1403 = var7;
		field1404 = var8;
		field1405 = var9;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method447() {
		method486();

		if (field1431 == 1) {
			field1159[field1430 / 100].method198(field1429 - 8 - 4, field1428 - 8 - 4);
		}

		if (field1431 == 2) {
			field1159[field1430 / 100 + 4].method198(field1429 - 8 - 4, field1428 - 8 - 4);
		}

		if (field1256 != -1) {
			method481(field1169, field1256);
			method484(0, class4.field57[field1256], 0, 0);
		}

		if (field1187 > 0) {
			int var1 = 302 - (int) Math.abs(Math.sin(field1187 / 10.0D) * 10.0D);
			for (int var2 = 0; var2 < 30; var2++) {
				int var3 = (30 - var2) * 16;
				class34.method173(field1187, var1 + var2, 0xFFFF00, var3, 256 - var3 / 2);
			}
		}

		if (field1223 != -1) {
			method481(field1169, field1223);
			method484(0, class4.field57[field1223], 0, 0);
		}

		method509();

		if (!field1152) {
			method430();
			method461();
		} else if (field1280 == 0) {
			method504();
		}

		if (field1084 == 1) {
			if (field1381 > 0 || field1369 == 1) {
				field1036[1].method198(258, 472);
			} else {
				field1036[1].method198(296, 472);
			}
		}

		if (field1381 > 0) {
			field1036[0].method198(296, 472);
			field1277.method213("Level: " + field1381, 484, 329, 0xFFFF00);
		}

		if (field1369 == 1) {
			field1036[6].method198(296, 472);
			field1277.method213("Arena", 484, 329, 0xFFFF00);
		}

		if (field1361 != 0) {
			int var4 = field1361 / 50;
			int var5 = var4 / 60;
			var4 %= 60;
			if (var4 < 10) {
				field1277.method216(4, 329, "System update in: " + var5 + ":0" + var4, 0xFFFF00);
			} else {
				field1277.method216(4, 329, "System update in: " + var5 + ":" + var4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public static final void method448() {
		class19.field264 = false;
		class35.field571 = false;
		field1360 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.a(BLd;)Z")
	public final boolean method449(class4 arg0) {
		int var2 = arg0.field66;
		if (var2 == 201) {
			field1255 = true;
			field1129 = false;
			field1251 = true;
			field1307 = "";
			field1272 = 1;
			field1317 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1255 = true;
			field1129 = false;
			field1251 = true;
			field1307 = "";
			field1272 = 2;
			field1317 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1262 = 250;
			return true;
		}

		if (var2 == 501) {
			field1255 = true;
			field1129 = false;
			field1251 = true;
			field1307 = "";
			field1272 = 4;
			field1317 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1255 = true;
			field1129 = false;
			field1251 = true;
			field1307 = "";
			field1272 = 5;
			field1317 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1086[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field955 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field955) {
							var5 = 0;
						}
					}

					if (!class64.field956[var5].field962 && class64.field956[var5].field957 == var3 + (field1318 ? 0 : 7)) {
						break;
					}
				}

				field1086[var3] = var5;
				field1052 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1382[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1347[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1347[var6].length) {
					var8 = 0;
				}
			}

			field1382[var6] = var8;
			field1052 = true;
		}

		if (var2 == 324 && !field1318) {
			field1318 = true;
			method542();
		}

		if (var2 == 325 && field1318) {
			field1318 = false;
			method542();
		}

		if (var2 == 326) {
			field1193.method227(8);
			field1193.method228(field1318 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1193.method228(field1086[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1193.method228(field1382[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1192 = !field1192;
		}

		if (var2 >= 601 && var2 <= 612) {
			method489();

			if (field1312.length() > 0) {
				field1193.method227(251);
				field1193.method234(class52.method309(field1312));
				field1193.method228(var2 - 601);
				field1193.method228(field1192 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(Lz;IZ)V")
	public final void method450(class26 arg0, int arg1) {
		method451(arg0.field367, arg1, arg0.field366);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method451(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method485(arg2, field1177, arg0) - arg1;
			arg2 -= field1401;
			var4 -= field1402;
			arg0 -= field1403;
			int var5 = class32.field548[field1404];
			int var6 = class32.field549[field1404];
			int var7 = class32.field548[field1405];
			int var8 = class32.field549[field1405];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1432 = (var9 << 9) / arg0 + class35.field576;
				field1433 = (var11 << 9) / arg0 + class35.field577;
			} else {
				field1432 = -1;
				field1433 = -1;
			}
		} else {
			field1432 = -1;
			field1433 = -1;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method452() {
		if (field1068 == null) {
			field10 = null;
			field1046 = null;
			field1044 = null;
			field1043 = null;
			field1045 = null;
			field1131 = null;
			field1132 = null;
			field1133 = null;
			field1071 = new class44(265, 128, method11());
			class34.method167();
			field1072 = new class44(265, 128, method11());
			class34.method167();
			field1068 = new class44(171, 509, method11());
			class34.method167();
			field1069 = new class44(132, 360, method11());
			class34.method167();
			field1070 = new class44(200, 360, method11());
			class34.method167();
			field1073 = new class44(238, 202, method11());
			class34.method167();
			field1074 = new class44(238, 203, method11());
			class34.method167();
			field1075 = new class44(94, 74, method11());
			class34.method167();
			field1076 = new class44(94, 75, method11());
			class34.method167();

			if (field1096 != null) {
				method468();
				method491();
			}

			field1049 = true;
		}
	}

	@ObfuscatedName("client.a(BIIIII)V")
	public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1383.method89(arg2, arg4, arg3);
		if (var6 != 0) {
			int var7 = field1383.method93(arg2, arg4, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field1055.field594;
			int var12 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method333(var13);
			if (var14.field837 == -1) {
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
				class37 var15 = field1157[var14.field837];
				if (var15 != null) {
					int var16 = (var14.field822 * 4 - var15.field603) / 2;
					int var17 = (var14.field823 * 4 - var15.field604) / 2;
					var15.method211((104 - arg3 - var14.field823) * 4 + var17 + 48, arg4 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field1383.method91(arg2, arg4, arg3);
		if (var18 != 0) {
			int var19 = field1383.method93(arg2, arg4, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method333(var22);
			if (var23.field837 != -1) {
				class37 var24 = field1157[var23.field837];
				if (var24 != null) {
					int var25 = (var23.field822 * 4 - var24.field603) / 2;
					int var26 = (var23.field823 * 4 - var24.field604) / 2;
					var24.method211((104 - arg3 - var23.field823) * 4 + var26 + 48, arg4 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1055.field594;
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

		int var30 = field1383.method92(arg2, arg4, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method333(var31);
			if (var32.field837 != -1) {
				class37 var33 = field1157[var32.field837];
				if (var33 != null) {
					int var34 = (var32.field822 * 4 - var33.field603) / 2;
					int var35 = (var32.field823 * 4 - var33.field604) / 2;
					var33.method211((104 - arg3 - var32.field823) * 4 + var35 + 48, arg4 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)Ljava/net/Socket;")
	public final Socket method454(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(Lmb;IB)V")
	public final void method455(class39 arg0, int arg1) {
		while (arg0.field622 + 10 < arg1 * 8) {
			int var3 = arg0.method249(11);
			if (var3 == 2047) {
				break;
			}

			if (field1333[var3] == null) {
				field1333[var3] = new class28();
				if (field1338[var3] != null) {
					field1333[var3].method129(field1338[var3]);
				}
			}

			field1335[field1334++] = var3;
			class28 var4 = field1333[var3];
			var4.field411 = field1371;
			int var5 = arg0.method249(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method249(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method249(1);
			var4.method123(field1115.field416[0] + var6, field1115.field415[0] + var5, var7 == 1);
			int var8 = arg0.method249(1);
			if (var8 == 1) {
				field1337[field1336++] = var3;
			}
		}

		arg0.method250();
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method456() {
		for (int var1 = -1; var1 < field1334; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1332;
			} else {
				var2 = field1335[var1];
			}

			class28 var3 = field1333[var2];
			if (var3 != null && var3.field379 > 0) {
				var3.field379--;
				if (var3.field379 == 0) {
					var3.field378 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1078; var4++) {
			int var5 = field1079[var4];
			class27 var6 = field1077[var5];
			if (var6 != null && var6.field379 > 0) {
				var6.field379--;
				if (var6.field379 == 0) {
					var6.field378 = null;
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

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method457(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1383.method93(field1177, arg2, arg3, arg0);
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
				var10 = var9.field822;
				var11 = var9.field823;
			} else {
				var10 = var9.field823;
				var11 = var9.field822;
			}

			int var12 = var9.field846;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method497(arg3, field1115.field416[0], var12, var11, 0, false, 0, arg2, field1115.field415[0], var10, 2);
		} else {
			method497(arg3, field1115.field416[0], 0, 0, var8, false, var7 + 1, arg2, field1115.field415[0], 0, 2);
		}

		field1428 = field24;
		field1429 = field25;
		field1431 = 2;
		field1430 = 0;
		field1193.method227(arg1);
		field1193.method229(field1392 + arg2);
		field1193.method229(field1393 + arg3);
		field1193.method229(var5);
		return true;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method458() {
		field1044.method267();
		int var1 = field1398 + field1117 & 0x7FF;
		int var2 = field1115.field366 / 32 + 48;
		int var3 = 464 - field1115.field367 / 32;
		field1055.method202(var1, var3, 25, var2, field1390, 5, 146, field1066 + 256, 151, field1292);
		field1340.method202(field1398, 25, 0, 25, field1085, 0, 33, 256, 33, field1297);

		for (int var4 = 0; var4 < field1219; var4++) {
			int var5 = field1220[var4] * 4 + 2 - field1115.field366 / 32;
			int var6 = field1221[var4] * 4 + 2 - field1115.field367 / 32;
			method464(var5, field1391[var4], var6);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1271[field1177][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1115.field366 / 32;
					int var11 = var8 * 4 + 2 - field1115.field367 / 32;
					method464(var10, field1363, var11);
				}
			}
		}

		for (int var12 = 0; var12 < field1078; var12++) {
			class27 var13 = field1077[field1079[var12]];
			if (var13 != null && var13.method126() && var13.field420.field879) {
				int var14 = var13.field366 / 32 - field1115.field366 / 32;
				int var15 = var13.field367 / 32 - field1115.field367 / 32;
				method464(var14, field1364, var15);
			}
		}

		for (int var16 = 0; var16 < field1334; var16++) {
			class28 var17 = field1333[field1335[var16]];
			if (var17 != null && var17.method126()) {
				int var18 = var17.field366 / 32 - field1115.field366 / 32;
				int var19 = var17.field367 / 32 - field1115.field367 / 32;
				boolean var20 = false;
				long var21 = class52.method309(var17.field421);
				for (int var23 = 0; var23 < field1329; var23++) {
					if (field1237[var23] == var21 && field1290[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method464(var18, field1366, var19);
				} else {
					method464(var18, field1365, var19);
				}
			}
		}

		if (field1202 != 0 && field1371 % 20 < 10) {
			if (field1202 == 1 && field1113 >= 0 && field1113 < field1077.length) {
				class27 var24 = field1077[field1113];
				if (var24 != null) {
					int var25 = var24.field366 / 32 - field1115.field366 / 32;
					int var26 = var24.field367 / 32 - field1115.field367 / 32;
					method431(field1025, var25, var26);
				}
			}

			if (field1202 == 2) {
				int var27 = (field1105 - field1392) * 4 + 2 - field1115.field366 / 32;
				int var28 = (field1106 - field1393) * 4 + 2 - field1115.field367 / 32;
				method431(field1025, var27, var28);
			}

			if (field1202 == 10 && field1204 >= 0 && field1204 < field1333.length) {
				class28 var29 = field1333[field1204];
				if (var29 != null) {
					int var30 = var29.field366 / 32 - field1115.field366 / 32;
					int var31 = var29.field367 / 32 - field1115.field367 / 32;
					method431(field1025, var30, var31);
				}
			}
		}

		if (field1053 != 0) {
			int var32 = field1053 * 4 + 2 - field1115.field366 / 32;
			int var33 = field1054 * 4 + 2 - field1115.field367 / 32;
			method464(var32, field1024, var33);
		}

		class34.method169(3, 3, 78, 97, 0xFFFFFF);
		field1045.method267();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method459() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1092[0] != -1) {
				field1051 = true;
				field1286 = 0;
				field1047 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1092[1] != -1) {
				field1051 = true;
				field1286 = 1;
				field1047 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1092[2] != -1) {
				field1051 = true;
				field1286 = 2;
				field1047 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1092[3] != -1) {
				field1051 = true;
				field1286 = 3;
				field1047 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1092[4] != -1) {
				field1051 = true;
				field1286 = 4;
				field1047 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1092[5] != -1) {
				field1051 = true;
				field1286 = 5;
				field1047 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1092[6] != -1) {
				field1051 = true;
				field1286 = 6;
				field1047 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1092[7] != -1) {
				field1051 = true;
				field1286 = 7;
				field1047 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1092[8] != -1) {
				field1051 = true;
				field1286 = 8;
				field1047 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1092[9] != -1) {
				field1051 = true;
				field1286 = 9;
				field1047 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1092[10] != -1) {
				field1051 = true;
				field1286 = 10;
				field1047 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1092[11] != -1) {
				field1051 = true;
				field1286 = 11;
				field1047 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1092[12] != -1) {
				field1051 = true;
				field1286 = 12;
				field1047 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1092[13] != -1) {
				field1051 = true;
				field1286 = 13;
				field1047 = true;
			}

			field1149++;
			if (field1149 > 150) {
				field1149 = 0;
				field1193.method227(46);
				field1193.method228(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method460(boolean arg0) {
		for (int var2 = 0; var2 < field1078; var2++) {
			class27 var3 = field1077[field1079[var2]];
			int var4 = (field1079[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method126() && var3.field420.field883 == arg0) {
				int var5 = var3.field366 >> 7;
				int var6 = var3.field367 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field370 == 1 && (var3.field366 & 0x7F) == 0x40 && (var3.field367 & 0x7F) == 0x40) {
						if (field1345[var5][var6] == field1165) {
							continue;
						}

						field1345[var5][var6] = field1165;
					}

					field1383.method74(field1177, var3, var3.field367, method485(var3.field366, field1177, var3.field367), var3.field366, var3.field368, var4, (var3.field370 - 1) * 64 + 60, var3.field369);
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method461() {
		if (field1245 >= 2 || field1323 != 0 || field1420 != 0) {
			String var1;
			if (field1323 == 1 && field1245 < 2) {
				var1 = "Use " + field1327 + " with...";
			} else if (field1420 == 1 && field1245 < 2) {
				var1 = field1423 + "...";
			} else {
				var1 = field1216[field1245 - 1];
			}

			if (field1245 > 2) {
				var1 = var1 + "@whi@ / " + (field1245 - 2) + " more options";
			}

			field1278.method219(4, field1371 / 1000, 0xFFFFFF, var1, 15, true);
		}
	}

	@ObfuscatedName("client.b(Lmb;IB)V")
	public final void method462(class39 arg0, int arg1) {
		arg0.method248();
		int var3 = arg0.method249(8);
		if (var3 < field1078) {
			for (int var4 = var3; var4 < field1078; var4++) {
				field1185[field1184++] = field1079[var4];
			}
		}

		if (var3 > field1078) {
			signlink.reporterror(field1153 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1078 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1079[var5];
			class27 var7 = field1077[var6];
			int var8 = arg0.method249(1);
			if (var8 == 0) {
				field1079[field1078++] = var6;
				var7.field411 = field1371;
			} else {
				int var9 = arg0.method249(2);
				if (var9 == 0) {
					field1079[field1078++] = var6;
					var7.field411 = field1371;
					field1337[field1336++] = var6;
				} else if (var9 == 1) {
					field1079[field1078++] = var6;
					var7.field411 = field1371;
					int var10 = arg0.method249(3);
					var7.method124(false, var10);
					int var11 = arg0.method249(1);
					if (var11 == 1) {
						field1337[field1336++] = var6;
					}
				} else if (var9 == 2) {
					field1079[field1078++] = var6;
					var7.field411 = field1371;
					int var12 = arg0.method249(3);
					var7.method124(true, var12);
					int var13 = arg0.method249(3);
					var7.method124(true, var13);
					int var14 = arg0.method249(1);
					if (var14 == 1) {
						field1337[field1336++] = var6;
					}
				} else if (var9 == 3) {
					field1185[field1184++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method463(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ILjb;II)V")
	public final void method464(int arg0, class36 arg1, int arg2) {
		int var4 = field1398 + field1117 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class32.field548[var4];
			int var7 = class32.field549[var4];
			var6 = var6 * 256 / (field1066 + 256);
			var7 = var7 * 256 / (field1066 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method204(field1027, var8 + 94 + 4 - arg1.field599 / 2, 83 - var9 - arg1.field600 / 2 - 4);
			} else {
				arg1.method198(83 - var9 - arg1.field600 / 2 - 4, var8 + 94 - arg1.field599 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method465() {
		if (field1202 == 2) {
			method451((field1106 - field1393 << 7) + field1109, field1107 * 2, (field1105 - field1392 << 7) + field1108);

			if (field1432 > -1 && field1371 % 20 < 10) {
				field1036[2].method198(field1433 - 28, field1432 - 12);
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method466() {
		if (field1201 != 0) {
			int var1 = 0;
			if (field1361 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1377[var2] != null) {
					int var3 = field1375[var2];
					String var4 = field1376[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1156 == 0 || field1156 == 1 && method543(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field17 < 516 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							if (field1275 >= 1) {
								field1216[field1245] = "Report abuse @whi@" + var4;
								field1303[field1245] = 2034;
								field1245++;
							}

							field1216[field1245] = "Add ignore @whi@" + var4;
							field1303[field1245] = 2436;
							field1245++;
							field1216[field1245] = "Add friend @whi@" + var4;
							field1303[field1245] = 2406;
							field1245++;
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1156 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;B)V")
	public final void method13(int arg0, String arg1) {
		field1102 = arg0;
		field1253 = arg1;
		method452();

		if (field1096 == null) {
			super.method13(arg0, arg1);
		} else {
			field1070.method267();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1278.method213("RuneScape is loading - please wait...", var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class34.method170(var6, 34, 0x8C1111, var3 / 2 - 152, 304);
			class34.method170(var6 + 1, 32, 0, var3 / 2 - 151, 302);
			class34.method169(30, arg0 * 3, var6 + 2, var3 / 2 - 150, 0x8C1111);
			class34.method169(30, 300 - arg0 * 3, var6 + 2, arg0 * 3 + var3 / 2 - 150, 0);
			field1278.method213(arg1, var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF);
			field1070.method268(171, 202, field9);

			if (field1049) {
				field1049 = false;

				if (!field1148) {
					field1071.method268(0, 0, field9);
					field1072.method268(0, 637, field9);
				}

				field1068.method268(0, 128, field9);
				field1069.method268(371, 202, field9);
				field1073.method268(265, 0, field9);
				field1074.method268(265, 562, field9);
				field1075.method268(171, 128, field9);
				field1076.method268(171, 562, field9);
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method467() {
		try {
			if (field1270 != null) {
				field1270.method38();
			}
		} catch (Exception var2) {
		}

		field1270 = null;
		field1418 = false;
		field1380 = 0;
		field1153 = "";
		field1154 = "";
		class6.method45();
		method500();
		field1383.method63();

		for (int var1 = 0; var1 < 4; var1++) {
			field1100[var1].method359();
		}

		System.gc();
		method551();
		field1419 = -1;
		field1385 = -1;
		field1063 = 0;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method468() {
		byte[] var1 = field1096.method308("title.dat", null);
		class36 var2 = new class36(var1, this);
		field1071.method267();
		var2.method196(0, 0);
		field1072.method267();
		var2.method196(0, -637);
		field1068.method267();
		var2.method196(0, -128);
		field1069.method267();
		var2.method196(-371, -202);
		field1070.method267();
		var2.method196(-171, -202);
		field1073.method267();
		var2.method196(-265, 0);
		field1074.method267();
		var2.method196(-265, -562);
		field1075.method267();
		var2.method196(-171, -128);
		field1076.method267();
		var2.method196(-171, -562);
		int[] var3 = new int[var2.field595];
		for (int var4 = 0; var4 < var2.field596; var4++) {
			for (int var5 = 0; var5 < var2.field595; var5++) {
				var3[var5] = var2.field594[var2.field595 * var4 + var2.field595 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field595; var6++) {
				var2.field594[var2.field595 * var4 + var6] = var3[var6];
			}
		}

		field1071.method267();
		var2.method196(0, 382);
		field1072.method267();
		var2.method196(0, -255);
		field1068.method267();
		var2.method196(0, 254);
		field1069.method267();
		var2.method196(-371, 180);
		field1070.method267();
		var2.method196(-171, 180);
		field1073.method267();
		var2.method196(-265, 382);
		field1074.method267();
		var2.method196(-265, -180);
		field1075.method267();
		var2.method196(-171, 254);
		field1076.method267();
		var2.method196(-171, -180);
		class36 var7 = new class36(field1096, "logo", 0);
		field1068.method267();
		var7.method198(18, 382 - var7.field595 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.h(B)V")
	public final void method469() {
		if (field1046 == null) {
			method473();
			field10 = null;
			field1068 = null;
			field1069 = null;
			field1070 = null;
			field1071 = null;
			field1072 = null;
			field1073 = null;
			field1074 = null;
			field1075 = null;
			field1076 = null;
			field1046 = new class44(96, 479, method11());
			field1044 = new class44(156, 172, method11());
			class34.method167();
			field1027.method211(0, 0);
			field1043 = new class44(261, 190, method11());
			field1045 = new class44(334, 512, method11());
			class34.method167();
			field1131 = new class44(50, 496, method11());
			field1132 = new class44(37, 269, method11());
			field1133 = new class44(45, 249, method11());
			field1049 = true;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ZLjava/lang/String;)V")
	public final void method470(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1166 != -1) {
			field1273 = arg1;
			field23 = 0;
		}

		if (field1265 == -1) {
			field1255 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1375[var4] = field1375[var4 - 1];
			field1376[var4] = field1376[var4 - 1];
			field1377[var4] = field1377[var4 - 1];
		}

		field1375[0] = arg0;
		field1376[0] = arg2;
		field1377[0] = arg1;
	}

	@ObfuscatedName("client.a(IBLmb;)V")
	public final void method471(int arg0, class39 arg1) {
		arg1.method248();
		int var3 = arg1.method249(1);
		if (var3 != 0) {
			int var4 = arg1.method249(2);
			if (var4 == 0) {
				field1337[field1336++] = field1332;
			} else if (var4 == 1) {
				int var5 = arg1.method249(3);
				field1115.method124(false, var5);
				int var6 = arg1.method249(1);
				if (var6 == 1) {
					field1337[field1336++] = field1332;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method249(3);
				field1115.method124(true, var7);
				int var8 = arg1.method249(3);
				field1115.method124(true, var8);
				int var9 = arg1.method249(1);
				if (var9 == 1) {
					field1337[field1336++] = field1332;
				}
			} else if (var4 == 3) {
				field1177 = arg1.method249(2);
				int var10 = arg1.method249(7);
				int var11 = arg1.method249(7);
				int var12 = arg1.method249(1);
				field1115.method123(var11, var10, var12 == 1);
				int var13 = arg1.method249(1);
				if (var13 == 1) {
					field1337[field1336++] = field1332;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;IILjava/lang/String;)Lyb;")
	public final class51 method472(int arg0, String arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1091[0] != null) {
				var6 = field1091[0].method300(arg2);
			}
		} catch (Exception var28) {
		}

		if (var6 != null) {
			field1134.reset();
			field1134.update(var6);
			int var8 = (int) field1134.getValue();
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
			method13(arg0, "Requesting " + arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method545(arg4 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class39 var16 = new class39(var15);
				var16.field621 = 3;
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
						method13(arg0, "Loading " + arg1 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1091[0] != null) {
						field1091[0].method301(arg2, var6, var6.length);
					}
				} catch (Exception var27) {
					field1091[0] = null;
				}

				if (var6 != null) {
					field1134.reset();
					field1134.update(var6);
					int var23 = (int) field1134.getValue();
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
						method13(arg0, "Game updated - please reload page");
						var24 = 10;
					} else {
						method13(arg0, var11 + " - Retrying in " + var24);
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

	@ObfuscatedName("client.p(I)V")
	public final void method473() {
		field1148 = false;
		while (field1103) {
			field1148 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1243 = null;
		field1244 = null;
		field1059 = null;
		field1341 = null;
		field1342 = null;
		field1343 = null;
		field1344 = null;
		field1388 = null;
		field1389 = null;
		field1314 = null;
		field1315 = null;
		field1170 = null;
		field1171 = null;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg6 >= 1 && arg0 <= 102 && arg6 <= 102) {
			if (field1360 && field1177 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = field1383.method89(arg3, arg0, arg6);
			}

			if (arg5 == 1) {
				var8 = field1383.method90(arg3, arg0, arg6);
			}

			if (arg5 == 2) {
				var8 = field1383.method91(arg3, arg0, arg6);
			}

			if (arg5 == 3) {
				var8 = field1383.method92(arg3, arg0, arg6);
			}

			if (var8 != 0) {
				int var12 = field1383.method93(arg3, arg0, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					field1383.method80(arg3, arg6, arg0);
					class57 var16 = class57.method333(var13);
					if (var16.field824) {
						field1100[arg3].method364(var14, var16.field825, arg6, var15, arg0);
					}
				}

				if (arg5 == 1) {
					field1383.method81(arg6, arg3, arg0);
				}

				if (arg5 == 2) {
					field1383.method82(arg6, arg3, arg0);
					class57 var17 = class57.method333(var13);
					if (var17.field822 + arg0 > 103 || var17.field822 + arg6 > 103 || var17.field823 + arg0 > 103 || var17.field823 + arg6 > 103) {
						return;
					}

					if (var17.field824) {
						field1100[arg3].method365(var17.field823, var15, arg0, var17.field825, arg6, var17.field822);
					}
				}

				if (arg5 == 3) {
					field1383.method83(arg6, arg0, arg3);
					class57 var18 = class57.method333(var13);
					if (var18.field824 && var18.field826) {
						field1100[arg3].method367(arg6, arg0);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field1319[1][arg0][arg6] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				class3.method31(field1269, field1100[arg3], arg4, var19, arg1, arg6, arg2, field1383, arg3, arg0);
				return;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1358 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method475(class39 arg0, int arg1) {
		for (int var3 = 0; var3 < field1336; var3++) {
			int var4 = field1337[var3];
			class28 var5 = field1333[var4];
			int var6 = arg0.method238();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method238() << 8;
			}

			method541(var5, arg0, var6, var4);
		}
	}

	@ObfuscatedName("client.a(ZLd;)V")
	public final void method476(class4 arg0) {
		int var2 = arg0.field66;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 > 700) {
				var2 -= 601;
			} else {
				var2--;
			}

			if (var2 >= field1329) {
				arg0.field97 = "";
				arg0.field65 = 0;
			} else {
				arg0.field97 = field1396[var2];
				arg0.field65 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= field1329) {
				arg0.field97 = "";
				arg0.field65 = 0;
			} else {
				if (field1290[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1290[var2] == field1357) {
					arg0.field97 = "@gre@World-" + (field1290[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1290[var2] - 9);
				}

				arg0.field65 = 1;
			}
		} else if (var2 == 203) {
			arg0.field76 = field1329 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1209) {
				arg0.field97 = "";
				arg0.field65 = 0;
			} else {
				arg0.field97 = class52.method313(class52.method310(field1254[var2]));
				arg0.field65 = 1;
			}
		} else if (var2 == 503) {
			arg0.field76 = field1209 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 == 327) {
			arg0.field111 = 150;
			arg0.field112 = (int) (Math.sin(field1371 / 40.0D) * 256.0D) & 0x7FF;

			if (field1052) {
				for (int var3 = 0; var3 < 7; var3++) {
					int var4 = field1086[var3];
					if (var4 >= 0 && !class64.field956[var4].method377()) {
						return;
					}
				}

				field1052 = false;
				class32[] var5 = new class32[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1086[var7];
					if (var8 >= 0) {
						var5[var6++] = class64.field956[var8].method378();
					}
				}

				class32 var9 = new class32(var6, var5);
				for (int var10 = 0; var10 < 5; var10++) {
					if (field1382[var10] != 0) {
						var9.method152(field1347[var10][0], field1347[var10][field1382[var10]]);

						if (var10 == 1) {
							var9.method152(field1300[0], field1300[field1382[var10]]);
						}
					}
				}

				var9.method145();
				var9.method146(class66.field973[field1115.field371].field975[0]);
				var9.method155(64, 850, -30, -50, -30, true);
				arg0.field104 = 5;
				arg0.field105 = 0;
				class4.method36(0, var9, 5);
			}
		} else if (var2 == 324) {
			if (field1206 == null) {
				field1206 = arg0.field102;
				field1207 = arg0.field103;
			}

			if (field1318) {
				arg0.field102 = field1207;
			} else {
				arg0.field102 = field1206;
			}
		} else if (var2 == 325) {
			if (field1206 == null) {
				field1206 = arg0.field102;
				field1207 = arg0.field103;
			}

			if (field1318) {
				arg0.field102 = field1206;
			} else {
				arg0.field102 = field1207;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1312;
			if (field1371 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1275 < 1) {
				arg0.field97 = "";
			} else if (field1192) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1130 == 0) {
				arg0.field97 = "";
			} else {
				String var11;
				if (field1029 == 0) {
					var11 = "earlier today";
				} else if (field1029 == 1) {
					var11 = "yesterday";
				} else {
					var11 = field1029 + " days ago";
				}

				arg0.field97 = "You last logged in " + var11 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1224 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1224 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1224 > 1) {
				arg0.field97 = field1224 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1247 == 201) {
				if (field1208 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1247 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var12;
				if (field1247 == 0) {
					var12 = "Earlier today";
				} else if (field1247 == 1) {
					var12 = "Yesterday";
				} else {
					var12 = field1247 + " days ago";
				}

				arg0.field97 = var12 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1247 == 201) {
				if (field1208 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1247 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1247 == 201) {
				if (field1208 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1247 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method477(int arg0) {
		class4 var2 = class4.field57[arg0];
		for (int var3 = 0; var3 < var2.field79.length && var2.field79[var3] != -1; var3++) {
			class4 var4 = class4.field57[var2.field79[var3]];
			if (var4.field64 == 1) {
				method477(var4.field62);
			}

			var4.field60 = 0;
			var4.field61 = 0;
		}
	}

	@ObfuscatedName("client.a(IZLmb;)V")
	public final void method478(int arg0, class39 arg1) {
		field1184 = 0;
		field1336 = 0;
		method471(arg0, arg1);
		method429(arg1, arg0);
		method455(arg1, arg0);
		method475(arg1, arg0);

		for (int var3 = 0; var3 < field1184; var3++) {
			int var4 = field1185[var3];
			if (field1371 != field1333[var4].field411) {
				field1333[var4] = null;
			}
		}

		if (arg1.field621 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field621 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1334; var5++) {
			if (field1333[field1335[var5]] == null) {
				signlink.reporterror(field1153 + " null entry in pl list - pos:" + var5 + " size:" + field1334);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method479() {
		if (field1115.field366 >> 7 == field1053 && field1115.field367 >> 7 == field1054) {
			field1053 = 0;
		}

		for (int var1 = -1; var1 < field1334; var1++) {
			class28 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1115;
				var3 = field1332 << 14;
			} else {
				var2 = field1333[field1335[var1]];
				var3 = field1335[var1] << 14;
			}

			if (var2 != null && var2.method126()) {
				var2.field440 = false;
				if ((field1360 && field1334 > 50 || field1334 > 200) && var1 != -1 && var2.field391 == var2.field371) {
					var2.field440 = true;
				}

				int var4 = var2.field366 >> 7;
				int var5 = var2.field367 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field435 == null || field1371 < var2.field430 || field1371 >= var2.field431) {
						if ((var2.field366 & 0x7F) == 0x40 && (var2.field367 & 0x7F) == 0x40) {
							if (field1345[var4][var5] == field1165 && var1 != -1) {
								continue;
							}

							field1345[var4][var5] = field1165;
						}

						var2.field429 = method485(var2.field366, field1177, var2.field367);
						field1383.method74(field1177, var2, var2.field367, var2.field429, var2.field366, var2.field368, var3, 60, var2.field369);
					} else {
						var2.field440 = false;
						var2.field429 = method485(var2.field366, field1177, var2.field367);
						field1383.method75(var2.field439, var2.field368, var2.field436, var2, var3, var2.field437, var2.field438, var2.field366, var2.field429, field1177, var2.field367, 60);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method480() {
		if (field1380 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1380 = 3;
				field1231 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1305 = "";
				field1306 = "Enter your username & password.";
				field1380 = 2;
				field1231 = 0;
			}
		} else if (field1380 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1231 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1231 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method519(field1153, field1154, false);

				if (field1418) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1380 = 0;
				field1153 = "";
				field1154 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1168.length(); var10++) {
					if (var8 == field1168.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1231 == 0) {
					if (var8 == 8 && field1153.length() > 0) {
						field1153 = field1153.substring(0, field1153.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1231 = 1;
					}

					if (var9) {
						field1153 = field1153 + (char) var8;
					}

					if (field1153.length() > 12) {
						field1153 = field1153.substring(0, 12);
					}
				} else if (field1231 == 1) {
					if (var8 == 8 && field1154.length() > 0) {
						field1154 = field1154.substring(0, field1154.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1231 = 0;
					}

					if (var9) {
						field1154 = field1154 + (char) var8;
					}

					if (field1154.length() > 20) {
						field1154 = field1154.substring(0, 20);
					}
				}
			}
		} else if (field1380 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1380 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(BII)Z")
	public final boolean method481(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field57[arg1];
		for (int var5 = 0; var5 < var4.field79.length && var4.field79[var5] != -1; var5++) {
			class4 var6 = class4.field57[var4.field79[var5]];
			if (var6.field64 == 1) {
				var3 |= method481(arg0, var6.field62);
			}

			if (var6.field64 == 6 && (var6.field108 != -1 || var6.field109 != -1)) {
				boolean var7 = method498(var6);
				int var8;
				if (var7) {
					var8 = var6.field109;
				} else {
					var8 = var6.field108;
				}

				if (var8 != -1) {
					class66 var9 = class66.field973[var8];
					var6.field61 += arg0;
					while (var6.field61 > var9.method382(var6.field60)) {
						var6.field61 -= var9.method382(var6.field60) + 1;
						var6.field60++;
						if (var6.field60 >= var9.field974) {
							var6.field60 -= var9.field978;
							if (var6.field60 < 0 || var6.field60 >= var9.field974) {
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

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1205.method257(); var11 != null; var11 = (class41) field1205.method259()) {
			if (var11.field637 == arg3 && var11.field639 == arg4 && var11.field640 == arg5 && var11.field638 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field637 = arg3;
			var10.field638 = arg6;
			var10.field639 = arg4;
			var10.field640 = arg5;
			method523(var10);
			field1205.method254(var10);
		}

		var10.field644 = arg7;
		var10.field646 = arg1;
		var10.field645 = arg2;
		var10.field647 = arg0;
		var10.field648 = arg8;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method483(int arg0) {
		if (arg0 >= 0) {
			if (field1129) {
				field1129 = false;
				field1255 = true;
			}

			int var2 = field1301[arg0];
			int var3 = field1302[arg0];
			int var4 = field1303[arg0];
			int var5 = field1304[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 391) {
				field1193.method227(143);
				field1193.method229(var5);
				field1193.method229(var2);
				field1193.method229(var3);
				field1193.method229(field1421);
				field1353 = 0;
				field1354 = var3;
				field1355 = var2;
				field1356 = 2;
				if (class4.field57[var3].field63 == field1223) {
					field1356 = 1;
				}

				if (class4.field57[var3].field63 == field1265) {
					field1356 = 3;
				}
			}

			if (var4 == 1501) {
				field1082 += field1393;
				if (field1082 >= 92) {
					field1193.method227(177);
					field1193.method232(0);
				}

				method457(var5, 243, var2, var3);
			}

			if (var4 == 285) {
				method457(var5, 238, var2, var3);
			}

			if (var4 == 1607) {
				class27 var6 = field1077[var5];
				if (var6 != null) {
					String var7;
					if (var6.field420.field863 == null) {
						var7 = "It's a " + var6.field420.field862 + ".";
					} else {
						var7 = new String(var6.field420.field863);
					}

					method470(0, var7, "");
				}
			}

			if (var4 == 651) {
				class28 var8 = field1333[var5];
				if (var8 != null) {
					method497(var8.field416[0], field1115.field416[0], 0, 1, 0, false, 0, var8.field415[0], field1115.field415[0], 1, 2);
					field1428 = field24;
					field1429 = field25;
					field1431 = 2;
					field1430 = 0;
					field1193.method227(73);
					field1193.method229(var5);
					field1193.method229(field1421);
				}
			}

			if (var4 == 900) {
				class27 var9 = field1077[var5];
				if (var9 != null) {
					method497(var9.field416[0], field1115.field416[0], 0, 1, 0, false, 0, var9.field415[0], field1115.field415[0], 1, 2);
					field1428 = field24;
					field1429 = field25;
					field1431 = 2;
					field1430 = 0;
					field1193.method227(52);
					field1193.method229(var5);
					field1193.method229(field1326);
					field1193.method229(field1324);
					field1193.method229(field1325);
				}
			}

			if (var4 == 55 && method457(var5, 182, var2, var3)) {
				field1193.method229(field1421);
			}

			if (var4 == 1102) {
				class60 var10 = class60.method348(var5);
				String var11;
				if (var10.field897 == null) {
					var11 = "It's a " + var10.field896 + ".";
				} else {
					var11 = new String(var10.field897);
				}

				method470(0, var11, "");
			}

			if (var4 == 960) {
				field1193.method227(39);
				field1193.method229(var3);
				class4 var12 = class4.field57[var3];
				if (var12.field72 != null && var12.field72[0][0] == 5) {
					int var13 = var12.field72[0][1];
					if (field1264[var13] != var12.field74[0]) {
						field1264[var13] = var12.field74[0];
						method538(var13);
						field1051 = true;
					}
				}
			}

			if (var4 == 660) {
				if (field1152) {
					field1383.method101(var3 - 4, var2 - 4);
				} else {
					field1383.method101(field25 - 4, field24 - 4);
				}
			}

			if (var4 == 44 && !field1065) {
				field1193.method227(11);
				field1193.method229(var3);
				field1065 = true;
			}

			if (var4 == 450 && method457(var5, 106, var2, var3)) {
				field1193.method229(field1326);
				field1193.method229(field1324);
				field1193.method229(field1325);
			}

			if (var4 == 1175) {
				int var14 = var5 >> 14 & 0x7FFF;
				class57 var15 = class57.method333(var14);
				String var16;
				if (var15.field819 == null) {
					var16 = "It's a " + var15.field818 + ".";
				} else {
					var16 = new String(var15.field819);
				}

				method470(0, var16, "");
			}

			if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
				class28 var17 = field1333[var5];
				if (var17 != null) {
					method497(var17.field416[0], field1115.field416[0], 0, 1, 0, false, 0, var17.field415[0], field1115.field415[0], 1, 2);
					field1428 = field24;
					field1429 = field25;
					field1431 = 2;
					field1430 = 0;

					if (var4 == 151) {
						field1266++;
						if (field1266 >= 90) {
							field1193.method227(100);
							field1193.method229(31114);
						}

						field1193.method227(219);
					}

					if (var4 == 1544) {
						field1193.method227(64);
					}

					if (var4 == 1101) {
						field1193.method227(211);
					}

					if (var4 == 1373) {
						field1193.method227(43);
					}

					field1193.method229(var5);
				}
			}

			if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
				String var18 = field1216[arg0];
				int var19 = var18.indexOf("@whi@");
				if (var19 != -1) {
					long var20 = class52.method309(var18.substring(var19 + 5).trim());
					if (var4 == 406) {
						method512(var20);
					}

					if (var4 == 436) {
						method529(var20);
					}

					if (var4 == 557) {
						method428(var20);
					}

					if (var4 == 556) {
						method533(var20);
					}
				}
			}

			if (var4 == 581) {
				if ((var5 & 0x3) == 0) {
					field1349++;
				}

				if (field1349 >= 99) {
					field1193.method227(47);
					field1193.method232(0);
				}

				method457(var5, 55, var2, var3);
			}

			if (var4 == 465) {
				field1193.method227(39);
				field1193.method229(var3);
				class4 var22 = class4.field57[var3];
				if (var22.field72 != null && var22.field72[0][0] == 5) {
					int var23 = var22.field72[0][1];
					field1264[var23] = 1 - field1264[var23];
					method538(var23);
					field1051 = true;
				}
			}

			if (var4 == 951) {
				class4 var24 = class4.field57[var3];
				boolean var25 = true;
				if (var24.field66 > 0) {
					var25 = method449(var24);
				}

				if (var25) {
					field1193.method227(39);
					field1193.method229(var3);
				}
			}

			if (var4 == 930) {
				class4 var26 = class4.field57[var3];
				field1420 = 1;
				field1421 = var3;
				field1422 = var26.field115;
				field1323 = 0;
				field1051 = true;
				String var27 = var26.field113;
				if (var27.indexOf(" ") != -1) {
					var27 = var27.substring(0, var27.indexOf(" "));
				}

				String var28 = var26.field113;
				if (var28.indexOf(" ") != -1) {
					var28 = var28.substring(var28.indexOf(" ") + 1);
				}

				field1423 = var27 + " " + var26.field114 + " " + var28;

				if (field1422 == 16) {
					field1051 = true;
					field1286 = 3;
					field1047 = true;
				}
			} else {
				if (var4 == 34) {
					String var29 = field1216[arg0];
					int var30 = var29.indexOf("@whi@");
					if (var30 != -1) {
						method489();
						field1312 = var29.substring(var30 + 5).trim();
						field1192 = false;

						for (int var31 = 0; var31 < class4.field57.length; var31++) {
							if (class4.field57[var31] != null && class4.field57[var31].field66 == 600) {
								field1296 = field1223 = class4.field57[var31].field63;
								break;
							}
						}
					}
				}

				if (var4 == 265) {
					class27 var32 = field1077[var5];
					if (var32 != null) {
						method497(var32.field416[0], field1115.field416[0], 0, 1, 0, false, 0, var32.field415[0], field1115.field415[0], 1, 2);
						field1428 = field24;
						field1429 = field25;
						field1431 = 2;
						field1430 = 0;
						field1193.method227(101);
						field1193.method229(var5);
						field1193.method229(field1421);
					}
				}

				if (var4 == 367) {
					class28 var33 = field1333[var5];
					if (var33 != null) {
						method497(var33.field416[0], field1115.field416[0], 0, 1, 0, false, 0, var33.field415[0], field1115.field415[0], 1, 2);
						field1428 = field24;
						field1429 = field25;
						field1431 = 2;
						field1430 = 0;
						field1193.method227(48);
						field1193.method229(var5);
						field1193.method229(field1326);
						field1193.method229(field1324);
						field1193.method229(field1325);
					}
				}

				if (var4 == 188) {
					field1323 = 1;
					field1324 = var2;
					field1325 = var3;
					field1326 = var5;
					field1327 = class60.method348(var5).field896;
					field1420 = 0;
					field1051 = true;
				} else {
					if (var4 == 965) {
						boolean var34 = method497(var3, field1115.field416[0], 0, 0, 0, false, 0, var2, field1115.field415[0], 0, 2);
						if (!var34) {
							method497(var3, field1115.field416[0], 0, 1, 0, false, 0, var2, field1115.field415[0], 1, 2);
						}

						field1428 = field24;
						field1429 = field25;
						field1431 = 2;
						field1430 = 0;
						field1193.method227(25);
						field1193.method229(field1392 + var2);
						field1193.method229(field1393 + var3);
						field1193.method229(var5);
						field1193.method229(field1421);
					}

					if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
						class27 var36 = field1077[var5];
						if (var36 != null) {
							method497(var36.field416[0], field1115.field416[0], 0, 1, 0, false, 0, var36.field415[0], field1115.field415[0], 1, 2);
							field1428 = field24;
							field1429 = field25;
							field1431 = 2;
							field1430 = 0;

							if (var4 == 6) {
								if ((var5 & 0x3) == 0) {
									field1339++;
								}

								if (field1339 >= 124) {
									field1193.method227(218);
									field1193.method232(0);
								}

								field1193.method227(132);
							}

							if (var4 == 728) {
								field1193.method227(222);
							}

							if (var4 == 542) {
								field1193.method227(84);
							}

							if (var4 == 963) {
								field1193.method227(229);
							}

							if (var4 == 245) {
								if ((var5 & 0x3) == 0) {
									field1088++;
								}

								if (field1088 >= 85) {
									field1193.method227(34);
									field1193.method229(39596);
								}

								field1193.method227(102);
							}

							field1193.method229(var5);
						}
					}

					if (var4 == 881) {
						field1193.method227(58);
						field1193.method229(var5);
						field1193.method229(var2);
						field1193.method229(var3);
						field1193.method229(field1326);
						field1193.method229(field1324);
						field1193.method229(field1325);
						field1353 = 0;
						field1354 = var3;
						field1355 = var2;
						field1356 = 2;
						if (class4.field57[var3].field63 == field1223) {
							field1356 = 1;
						}

						if (class4.field57[var3].field63 == field1265) {
							field1356 = 3;
						}
					}

					if (var4 == 504) {
						method457(var5, 38, var2, var3);
					}

					if (var4 == 903 || var4 == 363) {
						String var37 = field1216[arg0];
						int var38 = var37.indexOf("@whi@");
						if (var38 != -1) {
							var37 = var37.substring(var38 + 5).trim();
							String var39 = class52.method313(class52.method310(class52.method309(var37)));
							boolean var40 = false;
							for (int var41 = 0; var41 < field1334; var41++) {
								class28 var42 = field1333[field1335[var41]];
								if (var42 != null && var42.field421 != null && var42.field421.equalsIgnoreCase(var39)) {
									method497(var42.field416[0], field1115.field416[0], 0, 1, 0, false, 0, var42.field415[0], field1115.field415[0], 1, 2);

									if (var4 == 903) {
										field1193.method227(43);
									}

									if (var4 == 363) {
										field1193.method227(211);
									}

									field1193.method229(field1335[var41]);
									var40 = true;
									break;
								}
							}

							if (!var40) {
								method470(0, "Unable to find " + var39, "");
							}
						}
					}

					if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
						if (var4 == 347) {
							field1193.method227(133);
						}

						if (var4 == 405) {
							field1191 += var5;
							if (field1191 >= 97) {
								field1193.method227(37);
								field1193.method231(0xE42D58);
							}

							field1193.method227(228);
						}

						if (var4 == 478) {
							if ((var2 & 0x3) == 0) {
								field1348++;
							}

							if (field1348 >= 90) {
								field1193.method227(7);
							}

							field1193.method227(6);
						}

						if (var4 == 38) {
							field1193.method227(166);
						}

						if (var4 == 422) {
							field1193.method227(221);
						}

						field1193.method229(var5);
						field1193.method229(var2);
						field1193.method229(var3);
						field1353 = 0;
						field1354 = var3;
						field1355 = var2;
						field1356 = 2;
						if (class4.field57[var3].field63 == field1223) {
							field1356 = 1;
						}

						if (class4.field57[var3].field63 == field1265) {
							field1356 = 3;
						}
					}

					if (var4 == 364) {
						method457(var5, 19, var2, var3);
					}

					if (var4 == 1773) {
						class60 var43 = class60.method348(var5);
						String var44;
						if (var3 >= 100000) {
							var44 = var3 + " x " + var43.field896;
						} else if (var43.field897 == null) {
							var44 = "It's a " + var43.field896 + ".";
						} else {
							var44 = new String(var43.field897);
						}

						method470(0, var44, "");
					}

					if (var4 == 947) {
						method489();
					}

					if (var4 == 217) {
						boolean var45 = method497(var3, field1115.field416[0], 0, 0, 0, false, 0, var2, field1115.field415[0], 0, 2);
						if (!var45) {
							method497(var3, field1115.field416[0], 0, 1, 0, false, 0, var2, field1115.field415[0], 1, 2);
						}

						field1428 = field24;
						field1429 = field25;
						field1431 = 2;
						field1430 = 0;
						field1193.method227(111);
						field1193.method229(field1392 + var2);
						field1193.method229(field1393 + var3);
						field1193.method229(var5);
						field1193.method229(field1326);
						field1193.method229(field1324);
						field1193.method229(field1325);
					}

					if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
						boolean var47 = method497(var3, field1115.field416[0], 0, 0, 0, false, 0, var2, field1115.field415[0], 0, 2);
						if (!var47) {
							method497(var3, field1115.field416[0], 0, 1, 0, false, 0, var2, field1115.field415[0], 1, 2);
						}

						field1428 = field24;
						field1429 = field25;
						field1431 = 2;
						field1430 = 0;

						if (var4 == 993) {
							field1193.method227(110);
						}

						if (var4 == 877) {
							field1193.method227(225);
						}

						if (var4 == 99) {
							field1193.method227(27);
						}

						if (var4 == 746) {
							field1193.method227(17);
						}

						if (var4 == 224) {
							field1193.method227(231);
						}

						field1193.method229(field1392 + var2);
						field1193.method229(field1393 + var3);
						field1193.method229(var5);
					}

					if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
						if (var4 == 22) {
							field1193.method227(158);
						}

						if (var4 == 602) {
							field1193.method227(153);
						}

						if (var4 == 596) {
							field1193.method227(193);
						}

						if (var4 == 892) {
							if ((var2 & 0x3) == 0) {
								field1299++;
							}

							if (field1299 >= 130) {
								field1193.method227(169);
								field1193.method228(177);
							}

							field1193.method227(204);
						}

						if (var4 == 415) {
							if ((var3 & 0x3) == 0) {
								field1050++;
							}

							if (field1050 >= 55) {
								field1193.method227(50);
								field1193.method232(0);
							}

							field1193.method227(212);
						}

						field1193.method229(var5);
						field1193.method229(var2);
						field1193.method229(var3);
						field1353 = 0;
						field1354 = var3;
						field1355 = var2;
						field1356 = 2;
						if (class4.field57[var3].field63 == field1223) {
							field1356 = 1;
						}

						if (class4.field57[var3].field63 == field1265) {
							field1356 = 3;
						}
					}

					if (var4 == 679) {
						String var49 = field1216[arg0];
						int var50 = var49.indexOf("@whi@");
						if (var50 != -1) {
							long var51 = class52.method309(var49.substring(var50 + 5).trim());
							int var53 = -1;
							for (int var54 = 0; var54 < field1329; var54++) {
								if (field1237[var54] == var51) {
									var53 = var54;
									break;
								}
							}

							if (var53 != -1 && field1290[var53] > 0) {
								field1255 = true;
								field1129 = false;
								field1251 = true;
								field1307 = "";
								field1272 = 3;
								field1424 = field1237[var53];
								field1317 = "Enter message to send to " + field1396[var53];
							}
						}
					}

					field1323 = 0;
					field1420 = 0;
					field1051 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILd;IZI)V")
	public final void method484(int arg0, class4 arg1, int arg2, int arg3) {
		if (arg1.field64 == 0 && arg1.field79 != null && (!arg1.field78 || field1252 == arg1.field62 || field1225 == arg1.field62 || field1370 == arg1.field62)) {
			int var5 = class34.field566;
			int var6 = class34.field564;
			int var7 = class34.field567;
			int var8 = class34.field565;
			class34.method166(arg1.field68 + arg0, arg1.field67 + arg2, arg0, arg2);
			int var9 = arg1.field79.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field80[var10] + arg2;
				int var12 = arg1.field81[var10] + arg0 - arg3;
				class4 var13 = class4.field57[arg1.field79[var10]];
				var11 += var13.field70;
				var12 += var13.field71;

				if (var13.field66 > 0) {
					method476(var13);
				}

				if (var13.field64 == 0) {
					if (var13.field77 > var13.field76 - var13.field68) {
						var13.field77 = var13.field76 - var13.field68;
					}

					if (var13.field77 < 0) {
						var13.field77 = 0;
					}

					method484(var12, var13, var11, var13.field77);

					if (var13.field76 > var13.field68) {
						method518(var13.field68, var12, var13.field77, var13.field67 + var11, var13.field76);
					}
				} else if (var13.field64 != 1) {
					if (var13.field64 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field68; var15++) {
							for (int var16 = 0; var16 < var13.field67; var16++) {
								int var17 = (var13.field87 + 32) * var16 + var11;
								int var18 = (var13.field88 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field90[var14];
									var18 += var13.field91[var14];
								}

								if (var13.field58[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field58[var14] - 1;
									if (var17 > class34.field566 - 32 && var17 < class34.field567 && var18 > class34.field564 - 32 && var18 < class34.field565 || field1174 != 0 && field1173 == var14) {
										int var22 = 0;
										if (field1323 == 1 && field1324 == var14 && field1325 == var13.field62) {
											var22 = 0xFFFFFF;
										}

										class36 var23 = class60.method354(var21, var13.field59[var14], var22);
										if (var23 != null) {
											if (field1174 != 0 && field1173 == var14 && field1172 == var13.field62) {
												var19 = field17 - field1175;
												var20 = field18 - field1176;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1162 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method200(128, var18 + var20, var17 + var19);

												if (var18 + var20 < class34.field564 && arg1.field77 > 0) {
													int var24 = (class34.field564 - var18 - var20) * field1169 / 3;
													if (var24 > field1169 * 10) {
														var24 = field1169 * 10;
													}

													if (var24 > arg1.field77) {
														var24 = arg1.field77;
													}

													arg1.field77 -= var24;
													field1176 += var24;
												}

												if (var18 + var20 + 32 > class34.field565 && arg1.field77 < arg1.field76 - arg1.field68) {
													int var25 = (var18 + var20 + 32 - class34.field565) * field1169 / 3;
													if (var25 > field1169 * 10) {
														var25 = field1169 * 10;
													}

													if (var25 > arg1.field76 - arg1.field68 - arg1.field77) {
														var25 = arg1.field76 - arg1.field68 - arg1.field77;
													}

													arg1.field77 += var25;
													field1176 -= var25;
												}
											} else if (field1356 != 0 && field1355 == var14 && field1354 == var13.field62) {
												var23.method200(128, var18, var17);
											} else {
												var23.method198(var18, var17);
											}

											if (var23.field599 == 33 || var13.field59[var14] != 1) {
												int var26 = var13.field59[var14];
												field1276.method216(var17 + var19 + 1, var18 + 10 + var20, method520(var26), 0);
												field1276.method216(var17 + var19, var18 + 9 + var20, method520(var26), 0xFFFF00);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									class36 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method198(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field64 == 3) {
						if (var13.field69 == 0) {
							if (var13.field93) {
								class34.method169(var13.field68, var13.field67, var12, var11, var13.field99);
							} else {
								class34.method170(var12, var13.field68, var13.field99, var11, var13.field67);
							}
						} else if (var13.field93) {
							class34.method168(var12, var13.field68, var13.field67, var11, 256 - (var13.field69 & 0xFF), var13.field99);
						} else {
							class34.method171(var13.field67, var13.field99, var11, 256 - (var13.field69 & 0xFF), var13.field68, var12);
						}
					} else if (var13.field64 == 4) {
						class38 var28 = var13.field96;
						int var29 = var13.field99;
						String var30 = var13.field97;

						if ((field1370 == var13.field62 || field1225 == var13.field62 || field1252 == var13.field62) && var13.field101 != 0) {
							var29 = var13.field101;
						}

						if (method498(var13)) {
							var29 = var13.field100;

							if (var13.field98.length() > 0) {
								var30 = var13.field98;
							}
						}

						if (var13.field65 == 6 && field1065) {
							var30 = "Please wait...";
							var29 = var13.field99;
						}

						if (class34.field562 == 479) {
							if (var29 == 0xFFFF00) {
								var29 = 255;
							}

							if (var29 == 49152) {
								var29 = 0xFFFFFF;
							}
						}

						int var31 = var28.field616 + var12;
						while (var30.length() > 0) {
							if (var30.indexOf("%") != -1) {
								while (true) {
									int var32 = var30.indexOf("%1");
									if (var32 == -1) {
										break;
									}

									var30 = var30.substring(0, var32) + method527(method546(0, var13)) + var30.substring(var32 + 2);
								}

								while (true) {
									int var33 = var30.indexOf("%2");
									if (var33 == -1) {
										break;
									}

									var30 = var30.substring(0, var33) + method527(method546(1, var13)) + var30.substring(var33 + 2);
								}

								while (true) {
									int var34 = var30.indexOf("%3");
									if (var34 == -1) {
										break;
									}

									var30 = var30.substring(0, var34) + method527(method546(2, var13)) + var30.substring(var34 + 2);
								}

								while (true) {
									int var35 = var30.indexOf("%4");
									if (var35 == -1) {
										break;
									}

									var30 = var30.substring(0, var35) + method527(method546(3, var13)) + var30.substring(var35 + 2);
								}

								while (true) {
									int var36 = var30.indexOf("%5");
									if (var36 == -1) {
										break;
									}

									var30 = var30.substring(0, var36) + method527(method546(4, var13)) + var30.substring(var36 + 2);
								}
							}

							int var37 = var30.indexOf("\\n");
							String var38;
							if (var37 == -1) {
								var38 = var30;
								var30 = "";
							} else {
								var38 = var30.substring(0, var37);
								var30 = var30.substring(var37 + 2);
							}

							if (var13.field94) {
								var28.method214(var31, var13.field95, var29, var38, var13.field67 / 2 + var11);
							} else {
								var28.method218(var38, var29, var31, var13.field95, var11);
							}

							var31 += var28.field616;
						}
					} else if (var13.field64 == 5) {
						class36 var39;
						if (method498(var13)) {
							var39 = var13.field103;
						} else {
							var39 = var13.field102;
						}

						if (var39 != null) {
							var39.method198(var12, var11);
						}
					} else if (var13.field64 == 6) {
						int var40 = class35.field576;
						int var41 = class35.field577;
						class35.field576 = var13.field67 / 2 + var11;
						class35.field577 = var13.field68 / 2 + var12;
						int var42 = class35.field580[var13.field111] * var13.field110 >> 16;
						int var43 = class35.field581[var13.field111] * var13.field110 >> 16;
						boolean var44 = method498(var13);
						int var45;
						if (var44) {
							var45 = var13.field109;
						} else {
							var45 = var13.field108;
						}

						class32 var46;
						if (var45 == -1) {
							var46 = var13.method34(var44, -1, -1);
						} else {
							class66 var47 = class66.field973[var45];
							var46 = var13.method34(var44, var47.field975[var13.field60], var47.field976[var13.field60]);
						}

						if (var46 != null) {
							var46.method158(0, var13.field112, 0, var13.field111, 0, var42, var43);
						}

						class35.field576 = var40;
						class35.field577 = var41;
					} else if (var13.field64 == 7) {
						class38 var48 = var13.field96;
						int var49 = 0;
						for (int var50 = 0; var50 < var13.field68; var50++) {
							for (int var51 = 0; var51 < var13.field67; var51++) {
								if (var13.field58[var49] > 0) {
									class60 var52 = class60.method348(var13.field58[var49] - 1);
									String var53 = var52.field896;
									if (var52.field907 || var13.field59[var49] != 1) {
										var53 = var53 + " x" + method511(var13.field59[var49]);
									}

									int var54 = (var13.field87 + 115) * var51 + var11;
									int var55 = (var13.field88 + 12) * var50 + var12;
									if (var13.field94) {
										var48.method214(var55, var13.field95, var13.field99, var53, var13.field67 / 2 + var54);
									} else {
										var48.method218(var53, var13.field99, var55, var13.field95, var54);
									}
								}

								var49++;
							}
						}
					}
				}
			}

			class34.method166(var8, var7, var6, var5);
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method485(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field1319[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field1269[var6][var4][var5] + field1269[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1269[var6][var4][var5 + 1] + field1269[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method486() {
		if (field1201 != 0) {
			class38 var1 = field1277;
			int var2 = 0;
			if (field1361 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1377[var3] != null) {
					int var4 = field1375[var3];
					String var5 = field1376[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1156 == 0 || field1156 == 1 && method543(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method216(var8, var7, "From", 0);
						var1.method216(var8, var7 - 1, "From", 0xFFFF);
						int var11 = var8 + var1.method215("From ");
						if (var6 == 1) {
							field1058[0].method211(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field1058[1].method211(var7 - 12, var11);
							var11 += 14;
						}

						var1.method216(var11, var7, var5 + ": " + field1377[var3], 0);
						var1.method216(var11, var7 - 1, var5 + ": " + field1377[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1156 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method216(4, var9, field1377[var3], 0);
						var1.method216(4, var9 - 1, field1377[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1156 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method216(4, var10, "To " + var5 + ": " + field1377[var3], 0);
						var1.method216(4, var10 - 1, "To " + var5 + ": " + field1377[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method487() {
		if (field1360 && field1320 == 2 && class3.field33 != field1177) {
			field1045.method267();
			field1277.method213("Loading - please wait.", 257, 151, 0);
			field1277.method213("Loading - please wait.", 256, 150, 0xFFFFFF);
			field1045.method268(4, 4, field9);
			field1320 = 1;
			field1181 = System.currentTimeMillis();
		}

		if (field1320 == 1) {
			int var1 = method488();
			if (var1 != 0 && System.currentTimeMillis() - field1181 > 360000L) {
				signlink.reporterror(field1153 + " glcfb " + field1060 + "," + var1 + "," + field1360 + "," + field1091[0] + "," + field1164.method289() + "," + field1177 + "," + field1111 + "," + field1112);
				field1181 = System.currentTimeMillis();
			}
		}

		if (field1320 == 2 && field1416 != field1177) {
			field1416 = field1177;
			method540(field1177);
		}
	}

	@ObfuscatedName("client.t(I)I")
	public final int method488() {
		for (int var1 = 0; var1 < field1263.length; var1++) {
			if (field1263[var1] == null && field1309[var1] != -1) {
				return -1;
			}

			if (field1285[var1] == null && field1310[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1263.length; var3++) {
			byte[] var4 = field1285[var3];
			if (var4 != null) {
				int var5 = (field1308[var3] >> 8) * 64 - field1392;
				int var6 = (field1308[var3] & 0xFF) * 64 - field1393;
				var2 &= class3.method16(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1147) {
			return -4;
		} else {
			field1320 = 2;
			class3.field33 = field1177;
			method508();
			return 0;
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method489() {
		field1193.method227(187);

		if (field1427 != -1) {
			field1427 = -1;
			field1051 = true;
			field1065 = false;
			field1047 = true;
		}

		if (field1265 != -1) {
			field1265 = -1;
			field1255 = true;
			field1065 = false;
		}

		field1223 = -1;
	}

	@ObfuscatedName("client.a(ZIILd;III)V")
	public final void method490(int arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5) {
		if (arg2.field64 == 0 && arg2.field79 != null && !arg2.field78 && (arg4 >= arg5 && arg3 >= arg0 && arg4 <= arg2.field67 + arg5 && arg3 <= arg2.field68 + arg0)) {
			int var7 = arg2.field79.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg2.field80[var8] + arg5;
				int var10 = arg2.field81[var8] + arg0 - arg1;
				class4 var11 = class4.field57[arg2.field79[var8]];
				var9 += var11.field70;
				var10 += var11.field71;
				if ((var11.field75 >= 0 || var11.field101 != 0) && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field67 + var9 && arg3 < var11.field68 + var10) {
					if (var11.field75 >= 0) {
						field1379 = var11.field75;
					} else {
						field1379 = var11.field62;
					}
				}

				if (var11.field64 == 0) {
					method490(var10, var11.field77, var11, arg3, arg4, var9);

					if (var11.field76 > var11.field68) {
						method556(arg4, var10, var11.field67 + var9, var11.field76, true, var11, arg3, var11.field68);
					}
				} else {
					if (var11.field65 == 1 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field67 + var9 && arg3 < var11.field68 + var10) {
						boolean var12 = false;
						if (var11.field66 != 0) {
							var12 = method506(var11);
						}

						if (!var12) {
							field1216[field1245] = var11.field116;
							field1303[field1245] = 951;
							field1302[field1245] = var11.field62;
							field1245++;
						}
					}

					if (var11.field65 == 2 && field1420 == 0 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field67 + var9 && arg3 < var11.field68 + var10) {
						String var13 = var11.field113;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1216[field1245] = var13 + " @gre@" + var11.field114;
						field1303[field1245] = 930;
						field1302[field1245] = var11.field62;
						field1245++;
					}

					if (var11.field65 == 3 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field67 + var9 && arg3 < var11.field68 + var10) {
						field1216[field1245] = "Close";
						field1303[field1245] = 947;
						field1302[field1245] = var11.field62;
						field1245++;
					}

					if (var11.field65 == 4 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field67 + var9 && arg3 < var11.field68 + var10) {
						field1216[field1245] = var11.field116;
						field1303[field1245] = 465;
						field1302[field1245] = var11.field62;
						field1245++;
					}

					if (var11.field65 == 5 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field67 + var9 && arg3 < var11.field68 + var10) {
						field1216[field1245] = var11.field116;
						field1303[field1245] = 960;
						field1302[field1245] = var11.field62;
						field1245++;
					}

					if (var11.field65 == 6 && !field1065 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field67 + var9 && arg3 < var11.field68 + var10) {
						field1216[field1245] = var11.field116;
						field1303[field1245] = 44;
						field1302[field1245] = var11.field62;
						field1245++;
					}

					if (var11.field64 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field68; var15++) {
							for (int var16 = 0; var16 < var11.field67; var16++) {
								int var17 = (var11.field87 + 32) * var16 + var9;
								int var18 = (var11.field88 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field90[var14];
									var18 += var11.field91[var14];
								}

								if (arg4 >= var17 && arg3 >= var18 && arg4 < var17 + 32 && arg3 < var18 + 32) {
									field1249 = var14;
									field1250 = var11.field62;

									if (var11.field58[var14] > 0) {
										class60 var19 = class60.method348(var11.field58[var14] - 1);
										if (field1323 == 1 && var11.field85) {
											if (field1325 != var11.field62 || field1324 != var14) {
												field1216[field1245] = "Use " + field1327 + " with @lre@" + var19.field896;
												field1303[field1245] = 881;
												field1304[field1245] = var19.field894;
												field1301[field1245] = var14;
												field1302[field1245] = var11.field62;
												field1245++;
											}
										} else if (field1420 != 1 || !var11.field85) {
											if (var11.field85) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field911 != null && var19.field911[var20] != null) {
														field1216[field1245] = var19.field911[var20] + " @lre@" + var19.field896;

														if (var20 == 3) {
															field1303[field1245] = 478;
														}

														if (var20 == 4) {
															field1303[field1245] = 347;
														}

														field1304[field1245] = var19.field894;
														field1301[field1245] = var14;
														field1302[field1245] = var11.field62;
														field1245++;
													} else if (var20 == 4) {
														field1216[field1245] = "Drop @lre@" + var19.field896;
														field1303[field1245] = 347;
														field1304[field1245] = var19.field894;
														field1301[field1245] = var14;
														field1302[field1245] = var11.field62;
														field1245++;
													}
												}
											}

											if (var11.field86) {
												field1216[field1245] = "Use @lre@" + var19.field896;
												field1303[field1245] = 188;
												field1304[field1245] = var19.field894;
												field1301[field1245] = var14;
												field1302[field1245] = var11.field62;
												field1245++;
											}

											if (var11.field85 && var19.field911 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field911[var21] != null) {
														field1216[field1245] = var19.field911[var21] + " @lre@" + var19.field896;

														if (var21 == 0) {
															field1303[field1245] = 405;
														}

														if (var21 == 1) {
															field1303[field1245] = 38;
														}

														if (var21 == 2) {
															field1303[field1245] = 422;
														}

														field1304[field1245] = var19.field894;
														field1301[field1245] = var14;
														field1302[field1245] = var11.field62;
														field1245++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1216[field1245] = var11.field92[var22] + " @lre@" + var19.field896;

														if (var22 == 0) {
															field1303[field1245] = 602;
														}

														if (var22 == 1) {
															field1303[field1245] = 596;
														}

														if (var22 == 2) {
															field1303[field1245] = 22;
														}

														if (var22 == 3) {
															field1303[field1245] = 892;
														}

														if (var22 == 4) {
															field1303[field1245] = 415;
														}

														field1304[field1245] = var19.field894;
														field1301[field1245] = var14;
														field1302[field1245] = var11.field62;
														field1245++;
													}
												}
											}

											field1216[field1245] = "Examine @lre@" + var19.field896;
											field1303[field1245] = 1773;
											field1304[field1245] = var19.field894;
											field1302[field1245] = var11.field59[var14];
											field1245++;
										} else if ((field1422 & 0x10) == 0x10) {
											field1216[field1245] = field1423 + " @lre@" + var19.field896;
											field1303[field1245] = 391;
											field1304[field1245] = var19.field894;
											field1301[field1245] = var14;
											field1302[field1245] = var11.field62;
											field1245++;
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

	@ObfuscatedName("client.u(I)V")
	public final void method491() {
		field1243 = new class37(field1096, "titlebox", 0);
		field1244 = new class37(field1096, "titlebutton", 0);
		field1059 = new class37[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1059[var1] = new class37(field1096, "runes", var1);
		}

		field1170 = new class36(128, 265);
		field1171 = new class36(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1170.field594[var2] = field1071.field653[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1171.field594[var3] = field1072.field653[var3];
		}

		field1342 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1342[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1342[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1342[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1342[var7 + 192] = 0xFFFFFF;
		}

		field1343 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1343[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1343[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1343[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1343[var11 + 192] = 0xFFFFFF;
		}

		field1344 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1344[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1344[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1344[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1344[var15 + 192] = 0xFFFFFF;
		}

		field1341 = new int[256];
		field1388 = new int[32768];
		field1389 = new int[32768];
		method537(null);
		field1314 = new int[32768];
		field1315 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1148) {
			field1203 = true;
			field1148 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method492() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1314[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1314[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1315[var10] = (field1314[var10 - 1] + field1314[var10 + 1] + field1314[var10 - 128] + field1314[var10 + 128]) / 4;
			}
		}

		field1080 += 128;
		if (field1080 > field1388.length) {
			field1080 -= field1388.length;
			int var11 = (int) (Math.random() * 12.0D);
			method537(field1059[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1315[var14 + 128] - field1388[field1080 + var14 & field1388.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1314[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1316[var16] = field1316[var16 + 1];
		}

		field1316[var1 - 1] = (int) (Math.sin(field1371 / 14.0D) * 16.0D + Math.sin(field1371 / 15.0D) * 14.0D + Math.sin(field1371 / 16.0D) * 12.0D);

		if (field1321 > 0) {
			field1321 -= 4;
		}

		if (field1322 > 0) {
			field1322 -= 4;
		}

		if (field1321 == 0 && field1322 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1321 = 1024;
			}

			if (var17 == 1) {
				field1322 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method493() {
		method452();
		field1070.method267();
		field1243.method211(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1380 == 0) {
			int var3 = var2 / 2 + 80;
			field1276.method214(var3, true, 0x75A9A9, field1164.field731, var1 / 2);
			int var4 = var2 / 2 - 20;
			field1278.method214(var4, true, 0xFFFF00, "Welcome to RuneScape", var1 / 2);
			var4 += 30;
			int var5 = var1 / 2 - 80;
			int var6 = var2 / 2 + 20;
			field1244.method211(var6 - 20, var5 - 73);
			field1278.method214(var6 + 5, true, 0xFFFFFF, "New user", var5);
			int var7 = var1 / 2 + 80;
			field1244.method211(var6 - 20, var7 - 73);
			field1278.method214(var6 + 5, true, 0xFFFFFF, "Existing User", var7);
		}

		if (field1380 == 2) {
			int var8 = var2 / 2 - 40;
			if (field1305.length() > 0) {
				field1278.method214(var8 - 15, true, 0xFFFF00, field1305, var1 / 2);
				field1278.method214(var8, true, 0xFFFF00, field1306, var1 / 2);
				var8 += 30;
			} else {
				field1278.method214(var8 - 7, true, 0xFFFF00, field1306, var1 / 2);
				var8 += 30;
			}

			field1278.method218("Username: " + field1153 + (field1231 == 0 & field1371 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var8, true, var1 / 2 - 90);
			var8 += 15;
			field1278.method218("Password: " + class52.method315(field1154) + (field1231 == 1 & field1371 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var8, true, var1 / 2 - 88);
			var8 += 15;
			int var9 = var1 / 2 - 80;
			int var10 = var2 / 2 + 50;
			field1244.method211(var10 - 20, var9 - 73);
			field1278.method214(var10 + 5, true, 0xFFFFFF, "Login", var9);
			int var11 = var1 / 2 + 80;
			field1244.method211(var10 - 20, var11 - 73);
			field1278.method214(var10 + 5, true, 0xFFFFFF, "Cancel", var11);
		}

		if (field1380 == 3) {
			field1278.method214(var2 / 2 - 60, true, 0xFFFF00, "Create a free account", var1 / 2);
			int var12 = var2 / 2 - 35;
			field1278.method214(var12, true, 0xFFFFFF, "To create a new account you need to", var1 / 2);
			var12 += 15;
			field1278.method214(var12, true, 0xFFFFFF, "go back to the main RuneScape webpage", var1 / 2);
			var12 += 15;
			field1278.method214(var12, true, 0xFFFFFF, "and choose the red 'create account'", var1 / 2);
			var12 += 15;
			field1278.method214(var12, true, 0xFFFFFF, "button at the top right of that page.", var1 / 2);
			var12 += 15;
			int var13 = var1 / 2;
			int var14 = var2 / 2 + 50;
			field1244.method211(var14 - 20, var13 - 73);
			field1278.method214(var14 + 5, true, 0xFFFFFF, "Cancel", var13);
		}

		field1070.method268(171, 202, field9);

		if (field1049) {
			field1049 = false;
			field1068.method268(0, 128, field9);
			field1069.method268(371, 202, field9);
			field1073.method268(265, 0, field9);
			field1074.method268(265, 562, field9);
			field1075.method268(171, 128, field9);
			field1076.method268(171, 562, field9);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method494() {
		short var1 = 256;

		if (field1321 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1321 > 768) {
					field1341[var2] = method516(field1342[var2], 1024 - field1321, field1343[var2]);
				} else if (field1321 > 256) {
					field1341[var2] = field1343[var2];
				} else {
					field1341[var2] = method516(field1343[var2], 256 - field1321, field1342[var2]);
				}
			}
		} else if (field1322 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1322 > 768) {
					field1341[var3] = method516(field1342[var3], 1024 - field1322, field1344[var3]);
				} else if (field1322 > 256) {
					field1341[var3] = field1344[var3];
				} else {
					field1341[var3] = method516(field1344[var3], 256 - field1322, field1342[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1341[var4] = field1342[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1071.field653[var5] = field1170.field594[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1316[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1314[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1341[var12];
					int var15 = field1071.field653[var7];
					field1071.field653[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1071.method268(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1072.field653[var16] = field1171.field594[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1316[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1314[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1341[var23];
					int var26 = field1072.field653[var18];
					field1072.field653[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1072.method268(0, 637, field9);
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method495(class39 arg0, int arg1) {
		if (arg1 == 232 || arg1 == 125) {
			int var3 = arg0.method238();
			int var4 = (var3 >> 4 & 0x7) + field1229;
			int var5 = (var3 & 0x7) + field1230;
			int var6 = arg0.method238();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1167[var7];
			int var10;
			if (arg1 == 125) {
				var10 = -1;
			} else {
				var10 = arg0.method240();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method482(0, var7, var8, field1177, var4, var5, var9, var10, -1);
			}
		} else if (arg1 == 155) {
			int var11 = arg0.method238();
			int var12 = (var11 >> 4 & 0x7) + field1229;
			int var13 = (var11 & 0x7) + field1230;
			int var14 = arg0.method238();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1167[var15];
			int var18 = arg0.method240();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1269[field1177][var12][var13];
				int var20 = field1269[field1177][var12 + 1][var13];
				int var21 = field1269[field1177][var12 + 1][var13 + 1];
				int var22 = field1269[field1177][var12][var13 + 1];
				if (var17 == 0) {
					class18 var23 = field1383.method85(field1177, var12, var13);
					if (var23 != null) {
						int var24 = var23.field262 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field260 = new class29(var16 + 4, var22, var24, var18, var20, false, var21, var19, 2);
							var23.field261 = new class29(var16 + 1 & 0x3, var22, var24, var18, var20, false, var21, var19, 2);
						} else {
							var23.field260 = new class29(var16, var22, var24, var18, var20, false, var21, var19, var15);
						}
					}
				}

				if (var17 == 1) {
					class9 var25 = field1383.method86(var12, field1177, var13);
					if (var25 != null) {
						var25.field153 = new class29(0, var22, var25.field154 >> 14 & 0x7FFF, var18, var20, false, var21, var19, 4);
					}
				}

				if (var17 == 2) {
					class17 var26 = field1383.method87(var12, field1177, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field245 = new class29(var16, var22, var26.field253 >> 14 & 0x7FFF, var18, var20, false, var21, var19, var15);
					}
				}

				if (var17 == 3) {
					class11 var27 = field1383.method88(var12, var13, field1177);
					if (var27 != null) {
						var27.field184 = new class29(var16, var22, var27.field185 >> 14 & 0x7FFF, var18, var20, false, var21, var19, 22);
					}
				}
			}
		} else if (arg1 == 234) {
			int var28 = arg0.method238();
			int var29 = (var28 >> 4 & 0x7) + field1229;
			int var30 = (var28 & 0x7) + field1230;
			int var31 = arg0.method240();
			int var32 = arg0.method240();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class30 var33 = new class30();
				var33.field453 = var31;
				var33.field454 = var32;

				if (field1271[field1177][var29][var30] == null) {
					field1271[field1177][var29][var30] = new class42();
				}

				field1271[field1177][var29][var30].method254(var33);
				method531(var29, var30);
			}
		} else if (arg1 == 39) {
			int var34 = arg0.method238();
			int var35 = (var34 >> 4 & 0x7) + field1229;
			int var36 = (var34 & 0x7) + field1230;
			int var37 = arg0.method240();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1271[field1177][var35][var36];
				if (var38 != null) {
					for (class30 var39 = (class30) var38.method257(); var39 != null; var39 = (class30) var38.method259()) {
						if ((var37 & 0x7FFF) == var39.field453) {
							var39.method119();
							break;
						}
					}

					if (var38.method257() == null) {
						field1271[field1177][var35][var36] = null;
					}

					method531(var35, var36);
				}
			}
		} else if (arg1 == 137) {
			int var40 = arg0.method238();
			int var41 = (var40 >> 4 & 0x7) + field1229;
			int var42 = (var40 & 0x7) + field1230;
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
				class31 var53 = new class31(var48, field1177, var51, method485(var41, field1177, var42) - var47, var42, field1371 + var50, var46, field1371 + var49, var45, var52, var41);
				var53.method132(method485(var43, field1177, var44) - var48, field1371 + var49, var44, var43);
				field1362.method254(var53);
			}
		} else if (arg1 == 198) {
			int var54 = arg0.method238();
			int var55 = (var54 >> 4 & 0x7) + field1229;
			int var56 = (var54 & 0x7) + field1230;
			int var57 = arg0.method240();
			int var58 = arg0.method238();
			int var59 = arg0.method240();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class33 var60 = new class33(field1371, var55, var59, method485(var55, field1177, var56) - var58, field1177, var56, var57);
				field1155.method254(var60);
			}
		} else if (arg1 == 69) {
			int var61 = arg0.method238();
			int var62 = (var61 >> 4 & 0x7) + field1229;
			int var63 = (var61 & 0x7) + field1230;
			int var64 = arg0.method240();
			int var65 = arg0.method240();
			int var66 = arg0.method240();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1287 != var66) {
				class30 var67 = new class30();
				var67.field453 = var64;
				var67.field454 = var65;

				if (field1271[field1177][var62][var63] == null) {
					field1271[field1177][var62][var63] = new class42();
				}

				field1271[field1177][var62][var63].method254(var67);
				method531(var62, var63);
			}
		} else if (arg1 == 29) {
			int var68 = arg0.method238();
			int var69 = (var68 >> 4 & 0x7) + field1229;
			int var70 = (var68 & 0x7) + field1230;
			int var71 = arg0.method238();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1167[var72];
			int var75 = arg0.method240();
			int var76 = arg0.method240();
			int var77 = arg0.method240();
			int var78 = arg0.method240();
			byte var79 = arg0.method239();
			byte var80 = arg0.method239();
			byte var81 = arg0.method239();
			byte var82 = arg0.method239();
			class28 var83;
			if (field1287 == var78) {
				var83 = field1115;
			} else {
				var83 = field1333[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method333(var75);
				int var85 = field1269[field1177][var69][var70];
				int var86 = field1269[field1177][var69 + 1][var70];
				int var87 = field1269[field1177][var69 + 1][var70 + 1];
				int var88 = field1269[field1177][var69][var70 + 1];
				class32 var89 = var84.method339(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method482(var76 + 1, 0, 0, field1177, var69, var70, var74, -1, var77 + 1);
					var83.field430 = field1371 + var76;
					var83.field431 = field1371 + var77;
					var83.field435 = var89;
					int var90 = var84.field822;
					int var91 = var84.field823;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field823;
						var91 = var84.field822;
					}

					var83.field432 = var69 * 128 + var90 * 64;
					var83.field434 = var70 * 128 + var91 * 64;
					var83.field433 = method485(var83.field432, field1177, var83.field434);

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

					var83.field436 = var69 + var79;
					var83.field438 = var69 + var81;
					var83.field437 = var70 + var80;
					var83.field439 = var70 + var82;
				}
			}
		} else if (arg1 == 209) {
			int var94 = arg0.method238();
			int var95 = (var94 >> 4 & 0x7) + field1229;
			int var96 = (var94 & 0x7) + field1230;
			int var97 = arg0.method240();
			int var98 = arg0.method240();
			int var99 = arg0.method240();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1271[field1177][var95][var96];
				if (var100 != null) {
					for (class30 var101 = (class30) var100.method257(); var101 != null; var101 = (class30) var100.method259()) {
						if ((var97 & 0x7FFF) == var101.field453 && var101.field454 == var98) {
							var101.field454 = var99;
							break;
						}
					}

					method531(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method496() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1398 + field1117 & 0x7FF;
				int var4 = class35.field580[var3];
				int var5 = class35.field581[var3];
				var4 = (field1066 + 256) * var4 >> 8;
				var5 = (field1066 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1115.field366 + var6 >> 7;
				int var9 = field1115.field367 - var7 >> 7;
				boolean var10 = method497(var9, field1115.field416[0], 0, 0, 0, true, 0, var8, field1115.field415[0], 0, 1);
				if (var10) {
					field1193.method228(var1);
					field1193.method228(var2);
					field1193.method229(field1398);
					field1193.method228(57);
					field1193.method228(field1117);
					field1193.method228(field1066);
					field1193.method228(89);
					field1193.method229(field1115.field366);
					field1193.method229(field1115.field367);
					field1193.method228(field1217);
					field1193.method228(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIZIIIII)Z")
	public final boolean method497(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1116[var14][var15] = 0;
				field1089[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg1;
		field1116[arg8][arg1] = 99;
		field1089[arg8][arg1] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1367[var18] = arg8;
		int var35 = var18 + 1;
		field1368[var18] = arg1;
		boolean var20 = false;
		int var21 = field1367.length;
		int[][] var22 = field1100[field1177].field941;
		while (var35 != var19) {
			var16 = field1367[var19];
			var17 = field1368[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && field1100[field1177].method368(arg0, arg4, var17, arg6 - 1, arg7, var16)) {
					var20 = true;
					break;
				}

				if (arg6 < 10 && field1100[field1177].method369(arg7, arg0, arg4, arg6 - 1, var17, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg3 != 0 && field1100[field1177].method370(arg7, arg0, arg9, arg2, arg3, var17, var16)) {
				var20 = true;
				break;
			}

			int var23 = field1089[var16][var17] + 1;
			if (var16 > 0 && field1116[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1367[var35] = var16 - 1;
				field1368[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1116[var16 - 1][var17] = 2;
				field1089[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1116[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1367[var35] = var16 + 1;
				field1368[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1116[var16 + 1][var17] = 8;
				field1089[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1116[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1367[var35] = var16;
				field1368[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1116[var16][var17 - 1] = 1;
				field1089[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1116[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1367[var35] = var16;
				field1368[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1116[var16][var17 + 1] = 4;
				field1089[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1116[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1367[var35] = var16 - 1;
				field1368[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1116[var16 - 1][var17 - 1] = 3;
				field1089[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1116[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1367[var35] = var16 + 1;
				field1368[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1116[var16 + 1][var17 - 1] = 9;
				field1089[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1116[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1367[var35] = var16 - 1;
				field1368[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1116[var16 - 1][var17 + 1] = 6;
				field1089[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1116[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1367[var35] = var16 + 1;
				field1368[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1116[var16 + 1][var17 + 1] = 12;
				field1089[var16 + 1][var17 + 1] = var23;
			}
		}

		field1217 = 0;
		if (!var20) {
			if (arg5) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg7 - var25; var26 <= arg7 + var25; var26++) {
						for (int var27 = arg0 - var25; var27 <= arg0 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1089[var26][var27] < var24) {
								var24 = field1089[var26][var27];
								var16 = var26;
								var17 = var27;
								field1217 = 1;
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
		field1367[var28] = var16;
		int var36 = var28 + 1;
		field1368[var28] = var17;
		int var29;
		int var30 = var29 = field1116[var16][var17];
		while (arg8 != var16 || arg1 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1367[var36] = var16;
				field1368[var36++] = var17;
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

			var30 = field1116[var16][var17];
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
		int var32 = field1367[var36];
		int var33 = field1368[var36];

		if (arg10 == 0) {
			field1193.method227(63);
			field1193.method228(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			field1193.method227(56);
			field1193.method228(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			field1193.method227(167);
			field1193.method228(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1193.method228(1);
		} else {
			field1193.method228(0);
		}

		field1193.method229(field1392 + var32);
		field1193.method229(field1393 + var33);
		field1053 = field1367[0];
		field1054 = field1368[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1193.method228(field1367[var36] - var32);
			field1193.method228(field1368[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method498(class4 arg0) {
		if (arg0.field73 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field73.length; var2++) {
			int var3 = method546(var2, arg0);
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

	@ObfuscatedName("client.i(Z)Z")
	public final boolean method499() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.y(I)V")
	public final void method500() {
		class57.field848.method116();
		class57.field849.method116();
		class59.field887.method116();
		class60.field933.method116();
		class60.field934.method116();
		class28.field442.method116();
		class67.field1002.method116();
	}

	@ObfuscatedName("client.a([BZI)Z")
	public final boolean method501(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.j(Z)I")
	public final int method502() {
		int var1 = 3;
		if (field1404 < 310) {
			int var2 = field1401 >> 7;
			int var3 = field1403 >> 7;
			int var4 = field1115.field366 >> 7;
			int var5 = field1115.field367 >> 7;

			if ((field1319[field1177][var2][var3] & 0x4) != 0) {
				var1 = field1177;
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

					if ((field1319[field1177][var2][var3] & 0x4) != 0) {
						var1 = field1177;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1319[field1177][var2][var3] & 0x4) != 0) {
							var1 = field1177;
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

					if ((field1319[field1177][var2][var3] & 0x4) != 0) {
						var1 = field1177;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1319[field1177][var2][var3] & 0x4) != 0) {
							var1 = field1177;
						}
					}
				}
			}
		}

		if ((field1319[field1177][field1115.field366 >> 7][field1115.field367 >> 7] & 0x4) != 0) {
			var1 = field1177;
		}

		return var1;
	}

	@ObfuscatedName("client.k(Z)I")
	public final int method503() {
		int var1 = method485(field1401, field1177, field1403);
		if (var1 - field1402 < 800 && (field1319[field1177][field1401 >> 7][field1403 >> 7] & 0x4) != 0) {
			return field1177;
		}

		return 3;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method504() {
		int var1 = field1281;
		int var2 = field1282;
		int var3 = field1283;
		int var4 = field1284;
		int var5 = 0x5D5447;
		class34.method169(var4, var3, var2, var1, var5);
		class34.method169(16, var3 - 2, var2 + 1, var1 + 1, 0);
		class34.method170(var2 + 18, var4 - 19, 0, var1 + 1, var3 - 2);
		field1278.method216(var1 + 3, var2 + 14, "Choose Option", var5);
		int var6 = field17;
		int var7 = field18;
		if (field1280 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1280 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1280 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1245; var8++) {
			int var9 = (field1245 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1278.method218(field1216[var8], var10, var9, true, var1 + 3);
		}
	}

	@ObfuscatedName("client.j(B)V")
	public static final void method505() {
		class19.field264 = true;
		class35.field571 = true;
		field1360 = true;
		class3.field32 = true;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 245);

			if (arg0.length == 5) {
				field1357 = Integer.parseInt(arg0[0]);
				field1358 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method505();
				} else if (arg0[2].equals("highmem")) {
					method448();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1359 = false;
				} else if (arg0[3].equals("members")) {
					field1359 = true;
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

	public final void run() {
		if (field1203) {
			method535();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method506(class4 arg0) {
		int var2 = arg0.field66;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1216[field1245] = "Remove @whi@" + arg0.field97;
				field1303[field1245] = 556;
				field1245++;
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

		field1216[field1245] = "Remove @whi@" + field1396[var2];
		field1303[field1245] = 557;
		field1245++;
		field1216[field1245] = "Message @whi@" + field1396[var2];
		field1303[field1245] = 679;
		field1245++;
		return true;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method507() {
		if (field1262 > 0) {
			method467();
		} else {
			field1045.method267();
			field1277.method213("Connection lost", 257, 144, 0);
			field1277.method213("Connection lost", 256, 143, 0xFFFFFF);
			field1277.method213("Please wait - attempting to reestablish", 257, 159, 0);
			field1277.method213("Please wait - attempting to reestablish", 256, 158, 0xFFFFFF);
			field1045.method268(4, 4, field9);
			field1053 = 0;
			class5 var1 = field1270;
			field1418 = false;
			method519(field1153, field1154, true);

			if (!field1418) {
				method467();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method508() {
		try {
			field1416 = -1;
			field1155.method261();
			field1362.method261();
			class35.method179();
			method500();
			field1383.method63();

			for (int var1 = 0; var1 < 4; var1++) {
				field1100[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(104, field1319, 104, field1269);
			int var3 = field1263.length;
			class3.field32 = class19.field264;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1308[var4] >> 8;
				int var6 = field1308[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1383.method64(field1177);
			} else {
				field1383.method64(0);
			}

			field1193.method227(107);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1308[var7] >> 8) * 64 - field1392;
				int var9 = (field1308[var7] & 0xFF) * 64 - field1393;
				byte[] var10 = field1263[var7];
				if (var10 != null) {
					var2.method15(var9, (field1111 - 6) * 8, var10, var8, (field1112 - 6) * 8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1308[var11] >> 8) * 64 - field1392;
				int var13 = (field1308[var11] & 0xFF) * 64 - field1393;
				byte[] var14 = field1263[var11];
				if (var14 == null && field1112 < 800) {
					var2.method14(var12, 64, var13, 64);
				}
			}

			field1193.method227(107);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1285[var15];
				if (var16 != null) {
					int var17 = (field1308[var15] >> 8) * 64 - field1392;
					int var18 = (field1308[var15] & 0xFF) * 64 - field1393;
					var2.method18(var18, field1100, field1383, var17, var16);
				}
			}

			field1193.method227(107);
			var2.method20(field1100, field1383);
			field1045.method267();
			field1193.method227(107);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method531(var19, var20);
				}
			}

			method510();
		} catch (Exception var33) {
		}

		class57.field848.method116();

		if (field1360 && signlink.cache_dat != null) {
			int var22 = field1164.method281(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1164.method286(var23);
				if ((var24 & 0x79) == 0) {
					class32.method137(var23);
				}
			}
		}

		System.gc();
		class35.method180(20);
		field1164.method292();
		int var25 = (field1111 - 6) / 8 - 1;
		int var26 = (field1111 + 6) / 8 + 1;
		int var27 = (field1112 - 6) / 8 - 1;
		int var28 = (field1112 + 6) / 8 + 1;
		if (field1035) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1164.method283(var29, 0, var30);
					if (var31 != -1) {
						field1164.method293(var31, 3);
					}

					int var32 = field1164.method283(var29, 1, var30);
					if (var32 != -1) {
						field1164.method293(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method509() {
		int var1 = (field1115.field366 >> 7) + field1392;
		int var2 = (field1115.field367 >> 7) + field1393;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1381 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1381 = (var2 - 9920) / 8 + 1;
		} else {
			field1381 = 0;
		}

		field1369 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1369 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1369 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1369 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1369 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1369 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1369 = 1;
			}
		}

		if (field1369 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1369 = 2;
		}

		field1213 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1213 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1213 = 1;
		}

		if (field1213 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1213 = 0;
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method510() {
		for (class41 var1 = (class41) field1205.method257(); var1 != null; var1 = (class41) field1205.method259()) {
			if (var1.field648 == -1) {
				var1.field647 = 0;
				method523(var1);
			} else {
				var1.method119();
			}
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method511(int arg0) {
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

	@ObfuscatedName("client.a(IJ)V")
	public final void method512(long arg0) {
		if (arg0 != 0L) {
			if (field1329 >= 100 && field1062 != 1) {
				method470(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field1329 >= 200) {
				method470(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = class52.method313(class52.method310(arg0));
				for (int var4 = 0; var4 < field1329; var4++) {
					if (field1237[var4] == arg0) {
						method470(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1209; var5++) {
					if (field1254[var5] == arg0) {
						method470(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field1115.field421)) {
					field1396[field1329] = var3;
					field1237[field1329] = arg0;
					field1290[field1329] = 0;
					field1329++;
					field1051 = true;
					field1193.method227(9);
					field1193.method234(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1270 != null) {
				field1270.method38();
			}
		} catch (Exception var1) {
		}

		field1270 = null;
		method551();

		if (field1291 != null) {
			field1291.field851 = false;
		}

		field1291 = null;
		field1164.method280();
		field1164 = null;
		field1193 = null;
		field1346 = null;
		field1163 = null;
		field1308 = null;
		field1263 = null;
		field1285 = null;
		field1309 = null;
		field1310 = null;
		field1269 = null;
		field1319 = null;
		field1383 = null;
		field1100 = null;
		field1116 = null;
		field1089 = null;
		field1367 = null;
		field1368 = null;
		field1298 = null;
		field1043 = null;
		field1044 = null;
		field1045 = null;
		field1046 = null;
		field1131 = null;
		field1132 = null;
		field1133 = null;
		field1136 = null;
		field1137 = null;
		field1138 = null;
		field1139 = null;
		field1140 = null;
		field1141 = null;
		field1142 = null;
		field1143 = null;
		field1144 = null;
		field1026 = null;
		field1027 = null;
		field1028 = null;
		field1030 = null;
		field1031 = null;
		field1032 = null;
		field1295 = null;
		field1238 = null;
		field1239 = null;
		field1240 = null;
		field1241 = null;
		field1242 = null;
		field1037 = null;
		field1038 = null;
		field1039 = null;
		field1040 = null;
		field1041 = null;
		field1340 = null;
		field1081 = null;
		field1036 = null;
		field1159 = null;
		field1363 = null;
		field1364 = null;
		field1365 = null;
		field1366 = null;
		field1157 = null;
		field1374 = null;
		field1345 = null;
		field1333 = null;
		field1335 = null;
		field1337 = null;
		field1338 = null;
		field1185 = null;
		field1077 = null;
		field1079 = null;
		field1271 = null;
		field1205 = null;
		field1362 = null;
		field1155 = null;
		field1301 = null;
		field1302 = null;
		field1303 = null;
		field1304 = null;
		field1216 = null;
		field1264 = null;
		field1220 = null;
		field1221 = null;
		field1391 = null;
		field1055 = null;
		field1396 = null;
		field1237 = null;
		field1290 = null;
		field1071 = null;
		field1072 = null;
		field1068 = null;
		field1069 = null;
		field1070 = null;
		field1073 = null;
		field1074 = null;
		field1075 = null;
		field1076 = null;
		method473();
		class57.method332();
		class59.method341();
		class60.method347();
		class63.field943 = null;
		class64.field956 = null;
		class4.field57 = null;
		class65.field963 = null;
		class66.field973 = null;
		class67.field989 = null;
		class67.field1002 = null;
		class68.field1004 = null;
		field10 = null;
		class28.field442 = null;
		class35.method176();
		class19.method62();
		class32.method134();
		class8.method60();
		System.gc();
	}

	@ObfuscatedName("client.d(I)V")
	public final void method10() {
		field1049 = true;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method513() {
		for (class31 var1 = (class31) field1362.method257(); var1 != null; var1 = (class31) field1362.method259()) {
			if (field1177 != var1.field456 || field1371 > var1.field462) {
				var1.method119();
			} else if (field1371 >= var1.field461) {
				if (var1.field465 > 0) {
					class27 var2 = field1077[var1.field465 - 1];
					if (var2 != null && var2.field366 >= 0 && var2.field366 < 13312 && var2.field367 >= 0 && var2.field367 < 13312) {
						var1.method132(method485(var2.field366, var1.field456, var2.field367) - var1.field460, field1371, var2.field367, var2.field366);
					}
				}

				if (var1.field465 < 0) {
					int var3 = -var1.field465 - 1;
					class28 var4;
					if (field1287 == var3) {
						var4 = field1115;
					} else {
						var4 = field1333[var3];
					}

					if (var4 != null && var4.field366 >= 0 && var4.field366 < 13312 && var4.field367 >= 0 && var4.field367 < 13312) {
						var1.method132(method485(var4.field366, var1.field456, var4.field367) - var1.field460, field1371, var4.field367, var4.field366);
					}
				}

				var1.method133(field1169);
				field1383.method74(field1177, var1, (int) var1.field468, (int) var1.field469, (int) var1.field467, var1.field475, -1, 60, false);
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method514() {
		field1043.method267();
		class35.field582 = field1227;
		field1026.method211(0, 0);

		if (field1427 != -1) {
			method484(0, class4.field57[field1427], 0, 0);
		} else if (field1092[field1286] != -1) {
			method484(0, class4.field57[field1092[field1286]], 0, 0);
		}

		if (field1152 && field1280 == 1) {
			method504();
		}

		field1043.method268(205, 553, field9);
		field1045.method267();
		class35.field582 = field1228;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method515(int arg0) {
		if (!field1360) {
			if (class35.field590[17] >= arg0) {
				class37 var2 = class35.field584[17];
				int var3 = var2.field604 * var2.field603 - 1;
				int var4 = field1169 * var2.field603 * 2;
				byte[] var5 = var2.field601;
				byte[] var6 = field1298;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field601 = var6;
				field1298 = var5;
				class35.method183(17);
			}

			if (class35.field590[24] >= arg0) {
				class37 var8 = class35.field584[24];
				int var9 = var8.field604 * var8.field603 - 1;
				int var10 = field1169 * var8.field603 * 2;
				byte[] var11 = var8.field601;
				byte[] var12 = field1298;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field601 = var12;
				field1298 = var11;
				class35.method183(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method516(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.b(Lmb;II)V")
	public final void method517(class39 arg0, int arg1) {
		field1184 = 0;
		field1336 = 0;
		method462(arg0, arg1);
		method553(arg0, arg1);
		method539(arg1, arg0);

		for (int var3 = 0; var3 < field1184; var3++) {
			int var4 = field1185[var3];
			if (field1371 != field1077[var4].field411) {
				field1077[var4].field420 = null;
				field1077[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror(field1153 + " size mismatch in getnpcpos - pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1078; var5++) {
			if (field1077[field1079[var5]] == null) {
				signlink.reporterror(field1153 + " null entry in npc list - pos:" + var5 + " size:" + field1078);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method518(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1425.method211(arg1, arg3);
		field1426.method211(arg0 + arg1 - 16, arg3);
		class34.method169(arg0 - 32, 16, arg1 + 16, arg3, field1042);
		int var6 = (arg0 - 32) * arg0 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg2 / (arg4 - arg0);
		class34.method169(var6, 16, arg1 + var7 + 16, arg3, field1097);
		class34.method174(var6, arg1 + var7 + 16, arg3, field1110);
		class34.method174(var6, arg1 + var7 + 16, arg3 + 1, field1110);
		class34.method172(field1110, arg3, 16, arg1 + var7 + 16);
		class34.method172(field1110, arg3, 16, arg1 + var7 + 17);
		class34.method174(var6, arg1 + var7 + 16, arg3 + 15, field1288);
		class34.method174(var6 - 1, arg1 + 17 + var7, arg3 + 14, field1288);
		class34.method172(field1288, arg3, 16, arg1 + var7 + var6 + 15);
		class34.method172(field1288, arg3 + 1, 15, arg1 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method519(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1305 = "";
				field1306 = "Connecting to server...";
				method493();
			}

			field1270 = new class5(this, method454(field1358 + 43594));
			long var4 = class52.method309(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1193.field621 = 0;
			field1193.method228(14);
			field1193.method228(var6);
			field1270.method42(2, 0, field1193.field620);

			for (int var7 = 0; var7 < 8; var7++) {
				field1270.method39();
			}

			int var8 = field1270.method39();
			if (var8 == 0) {
				field1270.method41(field1163.field620, 0, 8);
				field1163.field621 = 0;
				field1060 = field1163.method244();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1060 >> 32), (int) field1060 };
				field1193.field621 = 0;
				field1193.method228(10);
				field1193.method232(var9[0]);
				field1193.method232(var9[1]);
				field1193.method232(var9[2]);
				field1193.method232(var9[3]);
				field1193.method232(signlink.uid);
				field1193.method235(arg0);
				field1193.method235(arg1);
				field1193.method253(field1057, field1406);
				field1346.field621 = 0;

				if (arg2) {
					field1346.method228(18);
				} else {
					field1346.method228(16);
				}

				field1346.method228(field1193.field621 + 36 + 1 + 1);
				field1346.method228(245);
				field1346.method228(field1360 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1346.method232(field1090[var10]);
				}

				field1346.method236(field1193.field621, field1193.field620, 0);
				field1193.field625 = new class50(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1218 = new class50(var9);
				field1270.method42(field1346.field621, 0, field1346.field620);
				var8 = field1270.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var19) {
				}

				method519(arg0, arg1, arg2);
			} else if (var8 == 2 || var8 == 18 || var8 == 19) {
				field1275 = 0;
				if (var8 == 18) {
					field1275 = 1;
				}

				if (var8 == 19) {
					field1275 = 2;
				}

				class6.method45();
				field1274 = 0L;
				field1212 = 0;
				field1291.field853 = 0;
				field14 = true;
				field1104 = true;
				field1418 = true;
				field1193.field621 = 0;
				field1163.field621 = 0;
				field1259 = -1;
				field1407 = -1;
				field1408 = -1;
				field1409 = -1;
				field1258 = 0;
				field1260 = 0;
				field1361 = 0;
				field1262 = 0;
				field1202 = 0;
				field1187 = 0;
				field1245 = 0;
				field1152 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1377[var12] = null;
				}

				field1323 = 0;
				field1420 = 0;
				field1320 = 0;
				field1289 = 0;
				field1293 = (int) (Math.random() * 100.0D) - 50;
				field1160 = (int) (Math.random() * 110.0D) - 55;
				field1210 = (int) (Math.random() * 80.0D) - 40;
				field1117 = (int) (Math.random() * 120.0D) - 60;
				field1066 = (int) (Math.random() * 30.0D) - 20;
				field1398 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1416 = -1;
				field1053 = 0;
				field1054 = 0;
				field1334 = 0;
				field1078 = 0;

				for (int var13 = 0; var13 < field1331; var13++) {
					field1333[var13] = null;
					field1338[var13] = null;
				}

				for (int var14 = 0; var14 < 8192; var14++) {
					field1077[var14] = null;
				}

				field1115 = field1333[field1332] = new class28();
				field1362.method261();
				field1155.method261();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1271[var15][var16][var17] = null;
						}
					}
				}

				field1205 = new class42();
				field1329 = 0;
				field1166 = -1;
				field1265 = -1;
				field1223 = -1;
				field1427 = -1;
				field1256 = -1;
				field1065 = false;
				field1286 = 3;
				field1129 = false;
				field1152 = false;
				field1251 = false;
				field1273 = null;
				field1084 = 0;
				field1093 = -1;
				field1318 = true;
				method542();

				for (int var18 = 0; var18 < 5; var18++) {
					field1382[var18] = 0;
				}

				field1349 = 0;
				field1339 = 0;
				field1191 = 0;
				field1088 = 0;
				field1348 = 0;
				field1082 = 0;
				field1050 = 0;
				field1266 = 0;
				field1299 = 0;
				method469();
			} else if (var8 == 3) {
				field1305 = "";
				field1306 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1305 = "Your account has been disabled.";
				field1306 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1305 = "Your account is already logged in.";
				field1306 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1305 = "RuneScape has been updated!";
				field1306 = "Please reload this page.";
			} else if (var8 == 7) {
				field1305 = "This world is full.";
				field1306 = "Please use a different world.";
			} else if (var8 == 8) {
				field1305 = "Unable to connect.";
				field1306 = "Login server offline.";
			} else if (var8 == 9) {
				field1305 = "Login limit exceeded.";
				field1306 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1305 = "Unable to connect.";
				field1306 = "Bad session id.";
			} else if (var8 == 11) {
				field1306 = "Login server rejected session.";
				field1306 = "Please try again.";
			} else if (var8 == 12) {
				field1305 = "You need a members account to login to this world.";
				field1306 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1305 = "Could not complete login.";
				field1306 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1305 = "The server is being updated.";
				field1306 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1418 = true;
				field1193.field621 = 0;
				field1163.field621 = 0;
				field1259 = -1;
				field1407 = -1;
				field1408 = -1;
				field1409 = -1;
				field1258 = 0;
				field1260 = 0;
				field1361 = 0;
				field1245 = 0;
				field1152 = false;
				field1181 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1305 = "Login attempts exceeded.";
				field1306 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1305 = "You are standing in a members-only area.";
				field1306 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1305 = "Invalid loginserver requested";
				field1306 = "Please try using a different world.";
			} else {
				field1305 = "Unexpected server response";
				field1306 = "Please try using a different world.";
			}
		} catch (IOException var20) {
			field1305 = "";
			field1306 = "Error connecting to server.";
		}
	}

	public final void init() {
		field1357 = Integer.parseInt(getParameter("nodeid"));
		field1358 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method505();
		} else {
			method448();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1359 = false;
		} else {
			field1359 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method520(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method521() {
		if (field1323 == 0 && field1420 == 0) {
			field1216[field1245] = "Walk here";
			field1303[field1245] = 660;
			field1301[field1245] = field17;
			field1302[field1245] = field18;
			field1245++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class32.field546; var2++) {
			int var3 = class32.field547[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1383.method93(field1177, var4, var5, var3) >= 0) {
					class57 var8 = class57.method333(var7);
					if (field1323 == 1) {
						field1216[field1245] = "Use " + field1327 + " with @cya@" + var8.field818;
						field1303[field1245] = 450;
						field1304[field1245] = var3;
						field1301[field1245] = var4;
						field1302[field1245] = var5;
						field1245++;
					} else if (field1420 != 1) {
						if (var8.field834 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field834[var9] != null) {
									field1216[field1245] = var8.field834[var9] + " @cya@" + var8.field818;

									if (var9 == 0) {
										field1303[field1245] = 285;
									}

									if (var9 == 1) {
										field1303[field1245] = 504;
									}

									if (var9 == 2) {
										field1303[field1245] = 364;
									}

									if (var9 == 3) {
										field1303[field1245] = 581;
									}

									if (var9 == 4) {
										field1303[field1245] = 1501;
									}

									field1304[field1245] = var3;
									field1301[field1245] = var4;
									field1302[field1245] = var5;
									field1245++;
								}
							}
						}

						field1216[field1245] = "Examine @cya@" + var8.field818;
						field1303[field1245] = 1175;
						field1304[field1245] = var3;
						field1301[field1245] = var4;
						field1302[field1245] = var5;
						field1245++;
					} else if ((field1422 & 0x4) == 4) {
						field1216[field1245] = field1423 + " @cya@" + var8.field818;
						field1303[field1245] = 55;
						field1304[field1245] = var3;
						field1301[field1245] = var4;
						field1302[field1245] = var5;
						field1245++;
					}
				}

				if (var6 == 1) {
					class27 var10 = field1077[var7];
					if (var10.field420.field864 == 1 && (var10.field366 & 0x7F) == 0x40 && (var10.field367 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1078; var11++) {
							class27 var12 = field1077[field1079[var11]];
							if (var12 != null && var10 != var12 && var12.field420.field864 == 1 && var10.field366 == var12.field366 && var10.field367 == var12.field367) {
								method530(var12.field420, var5, field1079[var11], var4);
							}
						}
					}

					method530(var10.field420, var5, var7, var4);
				}

				if (var6 == 0) {
					class28 var13 = field1333[var7];
					if ((var13.field366 & 0x7F) == 0x40 && (var13.field367 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1078; var14++) {
							class27 var15 = field1077[field1079[var14]];
							if (var15 != null && var15.field420.field864 == 1 && var13.field366 == var15.field366 && var13.field367 == var15.field367) {
								method530(var15.field420, var5, field1079[var14], var4);
							}
						}

						for (int var16 = 0; var16 < field1334; var16++) {
							class28 var17 = field1333[field1335[var16]];
							if (var17 != null && var13 != var17 && var13.field366 == var17.field366 && var13.field367 == var17.field367) {
								method445(var5, field1335[var16], var17, var4);
							}
						}
					}

					method445(var5, var7, var13, var4);
				}

				if (var6 == 3) {
					class42 var18 = field1271[field1177][var4][var5];
					if (var18 != null) {
						for (class30 var19 = (class30) var18.method258(); var19 != null; var19 = (class30) var18.method260()) {
							class60 var20 = class60.method348(var19.field453);
							if (field1323 == 1) {
								field1216[field1245] = "Use " + field1327 + " with @lre@" + var20.field896;
								field1303[field1245] = 217;
								field1304[field1245] = var19.field453;
								field1301[field1245] = var4;
								field1302[field1245] = var5;
								field1245++;
							} else if (field1420 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field910 != null && var20.field910[var21] != null) {
										field1216[field1245] = var20.field910[var21] + " @lre@" + var20.field896;

										if (var21 == 0) {
											field1303[field1245] = 224;
										}

										if (var21 == 1) {
											field1303[field1245] = 993;
										}

										if (var21 == 2) {
											field1303[field1245] = 99;
										}

										if (var21 == 3) {
											field1303[field1245] = 746;
										}

										if (var21 == 4) {
											field1303[field1245] = 877;
										}

										field1304[field1245] = var19.field453;
										field1301[field1245] = var4;
										field1302[field1245] = var5;
										field1245++;
									} else if (var21 == 2) {
										field1216[field1245] = "Take @lre@" + var20.field896;
										field1303[field1245] = 99;
										field1304[field1245] = var19.field453;
										field1301[field1245] = var4;
										field1302[field1245] = var5;
										field1245++;
									}
								}

								field1216[field1245] = "Examine @lre@" + var20.field896;
								field1303[field1245] = 1102;
								field1304[field1245] = var19.field453;
								field1301[field1245] = var4;
								field1302[field1245] = var5;
								field1245++;
							} else if ((field1422 & 0x1) == 1) {
								field1216[field1245] = field1423 + " @lre@" + var20.field896;
								field1303[field1245] = 965;
								field1304[field1245] = var19.field453;
								field1301[field1245] = var4;
								field1302[field1245] = var5;
								field1245++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a([BZB)V")
	public final void method522(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.a(ILob;)V")
	public final void method523(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field638 == 0) {
			var2 = field1383.method89(arg0.field637, arg0.field639, arg0.field640);
		}

		if (arg0.field638 == 1) {
			var2 = field1383.method90(arg0.field637, arg0.field639, arg0.field640);
		}

		if (arg0.field638 == 2) {
			var2 = field1383.method91(arg0.field637, arg0.field639, arg0.field640);
		}

		if (arg0.field638 == 3) {
			var2 = field1383.method92(arg0.field637, arg0.field639, arg0.field640);
		}

		if (var2 != 0) {
			int var6 = field1383.method93(arg0.field637, arg0.field639, arg0.field640, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field641 = var3;
		arg0.field643 = var4;
		arg0.field642 = var5;
	}

	@ObfuscatedName("client.b(III)V")
	public final void method524(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1377[var4] != null) {
				int var5 = field1375[var4];
				int var6 = field1246 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1376[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1064 == 0 || field1064 == 1 && method543(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1115.field421)) {
						if (field1275 >= 1) {
							field1216[field1245] = "Report abuse @whi@" + var7;
							field1303[field1245] = 34;
							field1245++;
						}

						field1216[field1245] = "Add ignore @whi@" + var7;
						field1303[field1245] = 436;
						field1245++;
						field1216[field1245] = "Add friend @whi@" + var7;
						field1303[field1245] = 406;
						field1245++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1201 == 0 && (var5 == 7 || field1156 == 0 || field1156 == 1 && method543(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1275 >= 1) {
							field1216[field1245] = "Report abuse @whi@" + var7;
							field1303[field1245] = 34;
							field1245++;
						}

						field1216[field1245] = "Add ignore @whi@" + var7;
						field1303[field1245] = 436;
						field1245++;
						field1216[field1245] = "Add friend @whi@" + var7;
						field1303[field1245] = 406;
						field1245++;
					}

					var3++;
				}

				if (var5 == 4 && (field1183 == 0 || field1183 == 1 && method543(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1216[field1245] = "Accept trade @whi@" + var7;
						field1303[field1245] = 903;
						field1245++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1201 == 0 && field1156 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1183 == 0 || field1183 == 1 && method543(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1216[field1245] = "Accept duel @whi@" + var7;
						field1303[field1245] = 363;
						field1245++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method525() {
		int var1 = field1278.method215("Choose Option");
		for (int var2 = 0; var2 < field1245; var2++) {
			int var3 = field1278.method215(field1216[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1245 * 15 + 21;
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

			field1152 = true;
			field1280 = 0;
			field1281 = var5;
			field1282 = var6;
			field1283 = var1;
			field1284 = field1245 * 15 + 22;
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

			field1152 = true;
			field1280 = 1;
			field1281 = var7;
			field1282 = var8;
			field1283 = var1;
			field1284 = field1245 * 15 + 22;
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

			field1152 = true;
			field1280 = 2;
			field1281 = var9;
			field1282 = var10;
			field1283 = var1;
			field1284 = field1245 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method526(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method527(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.b(I)V")
	public final void method7() {
		if (!field1350 && !field1372 && !field1387) {
			field1371++;

			if (field1418) {
				method532();
			} else {
				method480();
			}

			method427();
		}
	}

	@ObfuscatedName("client.G(I)Ljava/lang/String;")
	public final String method528() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method529(long arg0) {
		if (arg0 != 0L) {
			if (field1209 >= 100) {
				method470(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = class52.method313(class52.method310(arg0));
				for (int var4 = 0; var4 < field1209; var4++) {
					if (field1254[var4] == arg0) {
						method470(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1329; var5++) {
					if (field1237[var5] == arg0) {
						method470(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field1254[field1209++] = arg0;
				field1051 = true;
				field1193.method227(203);
				field1193.method234(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(Lgc;IIII)V")
	public final void method530(class59 arg0, int arg1, int arg2, int arg3) {
		if (field1245 < 400) {
			String var5 = arg0.field862;
			if (arg0.field880 != 0) {
				var5 = var5 + method435(arg0.field880, field1115.field427) + " (level-" + arg0.field880 + ")";
			}

			if (field1323 == 1) {
				field1216[field1245] = "Use " + field1327 + " with @yel@" + var5;
				field1303[field1245] = 900;
				field1304[field1245] = arg2;
				field1301[field1245] = arg3;
				field1302[field1245] = arg1;
				field1245++;
			} else if (field1420 != 1) {
				if (arg0.field875 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg0.field875[var6] != null && !arg0.field875[var6].equalsIgnoreCase("attack")) {
							field1216[field1245] = arg0.field875[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1303[field1245] = 728;
							}

							if (var6 == 1) {
								field1303[field1245] = 542;
							}

							if (var6 == 2) {
								field1303[field1245] = 6;
							}

							if (var6 == 3) {
								field1303[field1245] = 963;
							}

							if (var6 == 4) {
								field1303[field1245] = 245;
							}

							field1304[field1245] = arg2;
							field1301[field1245] = arg3;
							field1302[field1245] = arg1;
							field1245++;
						}
					}
				}

				if (arg0.field875 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg0.field875[var7] != null && arg0.field875[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg0.field880 > field1115.field427) {
								var8 = 2000;
							}

							field1216[field1245] = arg0.field875[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1303[field1245] = var8 + 728;
							}

							if (var7 == 1) {
								field1303[field1245] = var8 + 542;
							}

							if (var7 == 2) {
								field1303[field1245] = var8 + 6;
							}

							if (var7 == 3) {
								field1303[field1245] = var8 + 963;
							}

							if (var7 == 4) {
								field1303[field1245] = var8 + 245;
							}

							field1304[field1245] = arg2;
							field1301[field1245] = arg3;
							field1302[field1245] = arg1;
							field1245++;
						}
					}
				}

				field1216[field1245] = "Examine @yel@" + var5;
				field1303[field1245] = 1607;
				field1304[field1245] = arg2;
				field1301[field1245] = arg3;
				field1302[field1245] = arg1;
				field1245++;
			} else if ((field1422 & 0x2) == 2) {
				field1216[field1245] = field1423 + " @yel@" + var5;
				field1303[field1245] = 265;
				field1304[field1245] = arg2;
				field1301[field1245] = arg3;
				field1302[field1245] = arg1;
				field1245++;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method531(int arg0, int arg1) {
		class42 var3 = field1271[field1177][arg0][arg1];
		if (var3 == null) {
			field1383.method84(field1177, arg0, arg1);
		} else {
			int var4 = -99999999;
			class30 var5 = null;
			for (class30 var6 = (class30) var3.method257(); var6 != null; var6 = (class30) var3.method259()) {
				class60 var7 = class60.method348(var6.field453);
				int var8 = var7.field908;
				if (var7.field907) {
					var8 = (var6.field454 + 1) * var8;
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
				if (var5.field453 != var11.field453 && var9 == null) {
					var9 = var11;
				}

				if (var5.field453 != var11.field453 && var9.field453 != var11.field453 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1383.method70(var9, arg1, arg0, var5, var12, method485(arg0 * 128 + 64, field1177, arg1 * 128 + 64), field1177, var10);
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method532() {
		if (field1361 > 1) {
			field1361--;
		}

		if (field1262 > 0) {
			field1262--;
		}

		if (field1187 > 0) {
			field1187 -= 2;
		}

		for (int var1 = 0; var1 < 5 && method432(); var1++) {
		}

		if (field1418) {
			method487();
			method549();
			method550();
			class39 var2 = class6.method46();
			if (var2 != null) {
				field1193.method227(217);
				field1193.method229(var2.field621);
				field1193.method236(var2.field621, var2.field620, 0);
				var2.method226();
			}

			field1260++;
			if (field1260 > 750) {
				method507();
			}

			method558();
			method436();
			method456();
			field1169++;

			if (field1431 != 0) {
				field1430 += 20;
				if (field1430 >= 400) {
					field1431 = 0;
				}
			}

			if (field1356 != 0) {
				field1353++;
				if (field1353 >= 15) {
					if (field1356 == 2) {
						field1051 = true;
					}

					if (field1356 == 3) {
						field1255 = true;
					}

					field1356 = 0;
				}
			}

			if (field1174 != 0) {
				field1162++;

				if (field17 > field1175 + 5 || field17 < field1175 - 5 || field18 > field1176 + 5 || field18 < field1176 - 5) {
					field1232 = true;
				}

				if (field16 == 0) {
					if (field1174 == 2) {
						field1051 = true;
					}

					if (field1174 == 3) {
						field1255 = true;
					}

					field1174 = 0;

					if (field1232 && field1162 >= 5) {
						field1250 = -1;
						method430();

						if (field1250 == field1172 && field1249 != field1173) {
							class4 var3 = class4.field57[field1172];
							byte var4 = 0;
							if (field1311 == 1 && var3.field66 == 206) {
								var4 = 1;
							}

							if (var3.field58[field1249] <= 0) {
								var4 = 0;
							}

							if (var4 == 1) {
								int var5 = field1173;
								int var6 = field1249;
								while (var5 != var6) {
									if (var5 > var6) {
										var3.method33(var5 - 1, var5);
										var5--;
									} else if (var5 < var6) {
										var3.method33(var5 + 1, var5);
										var5++;
									}
								}
							} else {
								var3.method33(field1249, field1173);
							}

							field1193.method227(81);
							field1193.method229(field1172);
							field1193.method229(field1173);
							field1193.method229(field1249);
							field1193.method228(var4);
						}
					} else if ((field1417 == 1 || method548(field1245 - 1)) && field1245 > 2) {
						method525();
					} else if (field1245 > 0) {
						method483(field1245 - 1);
					}

					field1353 = 10;
					field23 = 0;
				}
			}

			field1178++;
			if (field1178 > 127) {
				field1178 = 0;
				field1193.method227(144);
				field1193.method231(0x4C2B2C);
			}

			if (class19.field298 != -1) {
				int var7 = class19.field298;
				int var8 = class19.field299;
				boolean var9 = method497(var8, field1115.field416[0], 0, 0, 0, true, 0, var7, field1115.field415[0], 0, 0);
				class19.field298 = -1;

				if (var9) {
					field1428 = field24;
					field1429 = field25;
					field1431 = 1;
					field1430 = 0;
				}
			}

			if (field23 == 1 && field1273 != null) {
				field1273 = null;
				field1255 = true;
				field23 = 0;
			}

			method434();
			method496();
			method459();
			method534();

			if (field16 == 1 || field23 == 1) {
				field1188++;
			}

			if (field1320 == 2) {
				method554();
			}

			if (field1320 == 2 && field1199) {
				method552();
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1189[var10]++;
			}

			method536();
			field15++;
			if (field15 > 4500) {
				field1262 = 250;
				field15 -= 500;
				field1193.method227(146);
			}

			field1180++;
			if (field1180 > 500) {
				field1180 = 0;
				int var11 = (int) (Math.random() * 8.0D);
				if ((var11 & 0x1) == 1) {
					field1293 += field1294;
				}

				if ((var11 & 0x2) == 2) {
					field1160 += field1161;
				}

				if ((var11 & 0x4) == 4) {
					field1210 += field1211;
				}
			}

			if (field1293 < -50) {
				field1294 = 2;
			}

			if (field1293 > 50) {
				field1294 = -2;
			}

			if (field1160 < -55) {
				field1161 = 2;
			}

			if (field1160 > 55) {
				field1161 = -2;
			}

			if (field1210 < -40) {
				field1211 = 1;
			}

			if (field1210 > 40) {
				field1211 = -1;
			}

			field1048++;
			if (field1048 > 500) {
				field1048 = 0;
				int var12 = (int) (Math.random() * 8.0D);
				if ((var12 & 0x1) == 1) {
					field1117 += field1118;
				}

				if ((var12 & 0x2) == 2) {
					field1066 += field1067;
				}
			}

			if (field1117 < -60) {
				field1118 = 2;
			}

			if (field1117 > 60) {
				field1118 = -2;
			}

			if (field1066 < -20) {
				field1067 = 1;
			}

			if (field1066 > 10) {
				field1067 = -1;
			}

			field1222++;
			if (field1222 > 110) {
				field1222 = 0;
				field1193.method227(41);
				field1193.method232(0);
			}

			field1261++;
			if (field1261 > 50) {
				field1193.method227(107);
			}

			try {
				if (field1270 != null && field1193.field621 > 0) {
					field1270.method42(field1193.field621, 0, field1193.field620);
					field1193.field621 = 0;
					field1261 = 0;
				}
			} catch (IOException var14) {
				method507();
			} catch (Exception var15) {
				method467();
			}
		}
	}

	@ObfuscatedName("client.c(IJ)V")
	public final void method533(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1209; var3++) {
				if (field1254[var3] == arg0) {
					field1209--;
					field1051 = true;

					for (int var4 = var3; var4 < field1209; var4++) {
						field1254[var4] = field1254[var4 + 1];
					}

					field1193.method227(207);
					field1193.method234(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method534() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1064 = (field1064 + 1) % 4;
				field1101 = true;
				field1255 = true;
				field1193.method227(98);
				field1193.method228(field1064);
				field1193.method228(field1156);
				field1193.method228(field1183);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1156 = (field1156 + 1) % 3;
				field1101 = true;
				field1255 = true;
				field1193.method227(98);
				field1193.method228(field1064);
				field1193.method228(field1156);
				field1193.method228(field1183);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1183 = (field1183 + 1) % 3;
				field1101 = true;
				field1255 = true;
				field1193.method227(98);
				field1193.method228(field1064);
				field1193.method228(field1156);
				field1193.method228(field1183);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method489();
				field1312 = "";
				field1192 = false;

				for (int var1 = 0; var1 < class4.field57.length; var1++) {
					if (class4.field57[var1] != null && class4.field57[var1].field66 == 600) {
						field1296 = field1223 = class4.field57[var1].field63;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method535() {
		field1103 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1148) {
				field1248++;
				method492();
				method492();
				method494();
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

		field1103 = false;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method536() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1223 != -1 && field1296 == field1223) {
				if (var1 == 8 && field1312.length() > 0) {
					field1312 = field1312.substring(0, field1312.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1312.length() < 12) {
					field1312 = field1312 + (char) var1;
				}
			} else if (field1251) {
				if (var1 >= 32 && var1 <= 122 && field1307.length() < 80) {
					field1307 = field1307 + (char) var1;
					field1255 = true;
				}

				if (var1 == 8 && field1307.length() > 0) {
					field1307 = field1307.substring(0, field1307.length() - 1);
					field1255 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1251 = false;
					field1255 = true;

					if (field1272 == 1) {
						long var2 = class52.method309(field1307);
						method512(var2);
					}

					if (field1272 == 2 && field1329 > 0) {
						long var4 = class52.method309(field1307);
						method428(var4);
					}

					if (field1272 == 3 && field1307.length() > 0) {
						field1193.method227(170);
						field1193.method228(0);
						int var6 = field1193.field621;
						field1193.method234(field1424);
						class53.method317(field1193, field1307);
						field1193.method237(field1193.field621 - var6);
						field1307 = class52.method314(field1307);
						field1307 = class69.method399(field1307);
						method470(6, field1307, class52.method313(class52.method310(field1424)));

						if (field1156 == 2) {
							field1156 = 1;
							field1101 = true;
							field1193.method227(98);
							field1193.method228(field1064);
							field1193.method228(field1156);
							field1193.method228(field1183);
						}
					}

					if (field1272 == 4 && field1209 < 100) {
						long var7 = class52.method309(field1307);
						method529(var7);
					}

					if (field1272 == 5 && field1209 > 0) {
						long var9 = class52.method309(field1307);
						method533(var9);
					}
				}
			} else if (field1129) {
				if (var1 >= 48 && var1 <= 57 && field1098.length() < 10) {
					field1098 = field1098 + (char) var1;
					field1255 = true;
				}

				if (var1 == 8 && field1098.length() > 0) {
					field1098 = field1098.substring(0, field1098.length() - 1);
					field1255 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1098.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1098);
						} catch (Exception var16) {
						}

						field1193.method227(190);
						field1193.method232(var11);
					}

					field1129 = false;
					field1255 = true;
				}
			} else if (field1265 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1268.length() < 80) {
					field1268 = field1268 + (char) var1;
					field1255 = true;
				}

				if (var1 == 8 && field1268.length() > 0) {
					field1268 = field1268.substring(0, field1268.length() - 1);
					field1255 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1268.length() > 0) {
					if (field1275 == 2) {
						if (field1268.equals("::clientdrop")) {
							method507();
						}

						if (field1268.equals("::lag")) {
							method557();
						}

						if (field1268.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field1164.method281(2); var12++) {
								field1164.method291((byte) 1, var12, 2);
							}
						}
					}

					if (field1268.startsWith("::")) {
						field1193.method227(76);
						field1193.method228(field1268.length() - 1);
						field1193.method235(field1268.substring(2));
					} else {
						byte var13 = 0;
						if (field1268.startsWith("yellow:")) {
							var13 = 0;
							field1268 = field1268.substring(7);
						}

						if (field1268.startsWith("red:")) {
							var13 = 1;
							field1268 = field1268.substring(4);
						}

						if (field1268.startsWith("green:")) {
							var13 = 2;
							field1268 = field1268.substring(6);
						}

						if (field1268.startsWith("cyan:")) {
							var13 = 3;
							field1268 = field1268.substring(5);
						}

						if (field1268.startsWith("purple:")) {
							var13 = 4;
							field1268 = field1268.substring(7);
						}

						if (field1268.startsWith("white:")) {
							var13 = 5;
							field1268 = field1268.substring(6);
						}

						if (field1268.startsWith("flash1:")) {
							var13 = 6;
							field1268 = field1268.substring(7);
						}

						if (field1268.startsWith("flash2:")) {
							var13 = 7;
							field1268 = field1268.substring(7);
						}

						if (field1268.startsWith("flash3:")) {
							var13 = 8;
							field1268 = field1268.substring(7);
						}

						if (field1268.startsWith("glow1:")) {
							var13 = 9;
							field1268 = field1268.substring(6);
						}

						if (field1268.startsWith("glow2:")) {
							var13 = 10;
							field1268 = field1268.substring(6);
						}

						if (field1268.startsWith("glow3:")) {
							var13 = 11;
							field1268 = field1268.substring(6);
						}

						byte var14 = 0;
						if (field1268.startsWith("wave:")) {
							var14 = 1;
							field1268 = field1268.substring(5);
						}

						if (field1268.startsWith("scroll:")) {
							var14 = 2;
							field1268 = field1268.substring(7);
						}

						field1193.method227(171);
						field1193.method228(0);
						int var15 = field1193.field621;
						field1193.method228(var13);
						field1193.method228(var14);
						class53.method317(field1193, field1268);
						field1193.method237(field1193.field621 - var15);
						field1268 = class52.method314(field1268);
						field1268 = class69.method399(field1268);
						field1115.field378 = field1268;
						field1115.field380 = var13;
						field1115.field381 = var14;
						field1115.field379 = 150;

						if (field1275 == 2) {
							method470(2, field1115.field378, "@cr2@" + field1115.field421);
						} else if (field1275 == 1) {
							method470(2, field1115.field378, "@cr1@" + field1115.field421);
						} else {
							method470(2, field1115.field378, field1115.field421);
						}

						if (field1064 == 2) {
							field1064 = 3;
							field1101 = true;
							field1193.method227(98);
							field1193.method228(field1064);
							field1193.method228(field1156);
							field1193.method228(field1183);
						}
					}

					field1268 = "";
					field1255 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;I)V")
	public final void method537(class37 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1388.length; var3++) {
			field1388[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1388[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1389[var9] = (field1388[var9 - 1] + field1388[var9 + 1] + field1388[var9 - 128] + field1388[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1388;
			field1388 = field1389;
			field1389 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field604; var12++) {
				for (int var13 = 0; var13 < arg0.field603; var13++) {
					if (arg0.field601[var11++] != 0) {
						int var14 = var13 + arg0.field605 + 16;
						int var15 = var12 + arg0.field606 + 16;
						int var16 = (var15 << 7) + var14;
						field1388[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method538(int arg0) {
		int var2 = class68.field1004[arg0].field1012;
		if (var2 != 0) {
			int var3 = field1264[arg0];
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

				class60.field934.method116();
				field1049 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1158;

				if (var3 == 0) {
					method463(0, field1158);
					field1158 = true;
				}

				if (var3 == 1) {
					method463(-400, field1158);
					field1158 = true;
				}

				if (var3 == 2) {
					method463(-800, field1158);
					field1158 = true;
				}

				if (var3 == 3) {
					method463(-1200, field1158);
					field1158 = true;
				}

				if (var3 == 4) {
					field1158 = false;
				}

				if (field1158 != var4 && !field1360) {
					if (field1158) {
						field1385 = field1419;
						field1386 = false;
						field1164.method288(2, field1385);
					} else {
						method551();
					}

					field1063 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1384 = true;
					method526(0);
				}

				if (var3 == 1) {
					field1384 = true;
					method526(-400);
				}

				if (var3 == 2) {
					field1384 = true;
					method526(-800);
				}

				if (var3 == 3) {
					field1384 = true;
					method526(-1200);
				}

				if (var3 == 4) {
					field1384 = false;
				}
			}

			if (var2 == 5) {
				field1417 = var3;
			}

			if (var2 == 6) {
				field1087 = var3;
			}

			if (var2 == 8) {
				field1201 = var3;
				field1255 = true;
			}

			if (var2 == 9) {
				field1311 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method539(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1336; var3++) {
			int var4 = field1337[var3];
			class27 var5 = field1077[var4];
			int var6 = arg1.method238();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method238();
				int var8 = arg1.method238();
				var5.method127(var7, var8);
				var5.field385 = field1371 + 300;
				var5.field386 = arg1.method238();
				var5.field387 = arg1.method238();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg1.method240();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field394 == var9) {
					var5.field398 = 0;
				}

				int var10 = arg1.method238();
				if (var5.field394 == var9 && var9 != -1) {
					int var11 = class66.field973[var9].field987;
					if (var11 == 1) {
						var5.field395 = 0;
						var5.field396 = 0;
						var5.field397 = var10;
						var5.field398 = 0;
					}

					if (var11 == 2) {
						var5.field398 = 0;
					}
				} else if (var9 == -1 || var5.field394 == -1 || class66.field973[var9].field981 >= class66.field973[var5.field394].field981) {
					var5.field394 = var9;
					var5.field395 = 0;
					var5.field396 = 0;
					var5.field397 = var10;
					var5.field398 = 0;
					var5.field419 = var5.field414;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field388 = arg1.method240();
				if (var5.field388 == 0xFFFF) {
					var5.field388 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field378 = arg1.method245();
				var5.field379 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg1.method238();
				int var13 = arg1.method238();
				var5.method127(var12, var13);
				var5.field385 = field1371 + 300;
				var5.field386 = arg1.method238();
				var5.field387 = arg1.method238();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field420 = class59.method342(arg1.method240());
				var5.field373 = var5.field420.field868;
				var5.field374 = var5.field420.field869;
				var5.field375 = var5.field420.field870;
				var5.field376 = var5.field420.field871;
				var5.field371 = var5.field420.field867;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field399 = arg1.method240();
				int var14 = arg1.method243();
				var5.field403 = var14 >> 16;
				var5.field402 = (var14 & 0xFFFF) + field1371;
				var5.field400 = 0;
				var5.field401 = 0;

				if (var5.field402 > field1371) {
					var5.field400 = -1;
				}

				if (var5.field399 == 0xFFFF) {
					var5.field399 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field389 = arg1.method240();
				var5.field390 = arg1.method240();
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method540(int arg0) {
		int[] var2 = field1055.field594;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1319[arg0][var7][var5] & 0x18) == 0) {
					field1383.method98(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1319[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1383.method98(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1055.method193();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1319[arg0][var11][var10] & 0x18) == 0) {
					method453(var9, var8, arg0, var10, var11);
				}

				if (arg0 < 3 && (field1319[arg0 + 1][var11][var10] & 0x8) != 0) {
					method453(var9, var8, arg0 + 1, var10, var11);
				}
			}
		}

		field1045.method267();
		field1219 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1383.method92(field1177, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method333(var14).field836;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1100[field1177].field941;
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

						field1391[field1219] = field1374[var15];
						field1220[field1219] = var16;
						field1221[field1219] = var17;
						field1219++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lbb;Lmb;III)V")
	public final void method541(class28 arg0, class39 arg1, int arg2, int arg3) {
		if ((arg2 & 0x1) == 1) {
			int var5 = arg1.method238();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg1.method247(var6, var5, 0);
			field1338[arg3] = var7;
			arg0.method129(var7);
		}

		if ((arg2 & 0x2) == 2) {
			int var8 = arg1.method240();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg0.field394 == var8) {
				arg0.field398 = 0;
			}

			int var9 = arg1.method238();
			if (arg0.field394 == var8 && var8 != -1) {
				int var10 = class66.field973[var8].field987;
				if (var10 == 1) {
					arg0.field395 = 0;
					arg0.field396 = 0;
					arg0.field397 = var9;
					arg0.field398 = 0;
				}

				if (var10 == 2) {
					arg0.field398 = 0;
				}
			} else if (var8 == -1 || arg0.field394 == -1 || class66.field973[var8].field981 >= class66.field973[arg0.field394].field981) {
				arg0.field394 = var8;
				arg0.field395 = 0;
				arg0.field396 = 0;
				arg0.field397 = var9;
				arg0.field398 = 0;
				arg0.field419 = arg0.field414;
			}
		}

		if ((arg2 & 0x4) == 4) {
			arg0.field388 = arg1.method240();
			if (arg0.field388 == 0xFFFF) {
				arg0.field388 = -1;
			}
		}

		if ((arg2 & 0x8) == 8) {
			arg0.field378 = arg1.method245();
			arg0.field380 = 0;
			arg0.field381 = 0;
			arg0.field379 = 150;
			method470(2, arg0.field378, arg0.field421);
		}

		if ((arg2 & 0x10) == 0x10) {
			int var11 = arg1.method238();
			int var12 = arg1.method238();
			arg0.method127(var11, var12);
			arg0.field385 = field1371 + 300;
			arg0.field386 = arg1.method238();
			arg0.field387 = arg1.method238();
		}

		if ((arg2 & 0x20) == 0x20) {
			arg0.field389 = arg1.method240();
			arg0.field390 = arg1.method240();
		}

		if ((arg2 & 0x40) == 0x40) {
			int var13 = arg1.method240();
			int var14 = arg1.method238();
			int var15 = arg1.method238();
			int var16 = arg1.field621;

			if (arg0.field421 != null && arg0.field422) {
				long var17 = class52.method309(arg0.field421);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1209; var20++) {
						if (field1254[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1213 == 0) {
					try {
						String var21 = class53.method316(var15, arg1);
						var21 = class69.method399(var21);
						arg0.field378 = var21;
						arg0.field380 = var13 >> 8;
						arg0.field381 = var13 & 0xFF;
						arg0.field379 = 150;

						if (var14 == 2 || var14 == 3) {
							method470(1, var21, "@cr2@" + arg0.field421);
						} else if (var14 == 1) {
							method470(1, var21, "@cr1@" + arg0.field421);
						} else {
							method470(2, var21, arg0.field421);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field621 = var15 + var16;
		}

		if ((arg2 & 0x100) == 0x100) {
			arg0.field399 = arg1.method240();
			int var23 = arg1.method243();
			arg0.field403 = var23 >> 16;
			arg0.field402 = (var23 & 0xFFFF) + field1371;
			arg0.field400 = 0;
			arg0.field401 = 0;

			if (arg0.field402 > field1371) {
				arg0.field400 = -1;
			}

			if (arg0.field399 == 0xFFFF) {
				arg0.field399 = -1;
			}
		}

		if ((arg2 & 0x200) == 0x200) {
			arg0.field404 = arg1.method238();
			arg0.field406 = arg1.method238();
			arg0.field405 = arg1.method238();
			arg0.field407 = arg1.method238();
			arg0.field408 = arg1.method240() + field1371;
			arg0.field409 = arg1.method240() + field1371;
			arg0.field410 = arg1.method238();
			arg0.method125();
		}

		if ((arg2 & 0x400) == 0x400) {
			int var24 = arg1.method238();
			int var25 = arg1.method238();
			arg0.method127(var24, var25);
			arg0.field385 = field1371 + 300;
			arg0.field386 = arg1.method238();
			arg0.field387 = arg1.method238();
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method542() {
		field1052 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1086[var1] = -1;
			for (int var2 = 0; var2 < class64.field955; var2++) {
				if (!class64.field956[var2].field962 && class64.field956[var2].field957 == var1 + (field1318 ? 0 : 7)) {
					field1086[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method543(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1329; var2++) {
			if (arg0.equalsIgnoreCase(field1396[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1115.field421)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method9() {
		if (field1350 || field1372 || field1387) {
			method433();
		} else {
			field1150++;

			if (field1418) {
				method443();
			} else {
				method493();
			}

			field1188 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = class32.field548[var7];
			int var13 = class32.field549[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class32.field548[var8];
			int var16 = class32.field549[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1401 = arg3 - var9;
		field1402 = arg0 - var10;
		field1403 = arg4 - var11;
		field1404 = arg2;
		field1405 = arg1;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method545(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1151) {
			field1350 = true;
		} else {
			field1151 = true;
			boolean var1 = false;
			String var2 = method528();
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
						field1091[var3] = new class49(signlink.cache_idx[var3], var3 + 1, 500000, signlink.cache_dat);
					}
				}

				try {
					int var4 = 5;
					field1090[8] = 0;
					while (field1090[8] == 0) {
						method13(20, "Connecting to web server");

						try {
							DataInputStream var5 = method545("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field620, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1090[var7] = var6.method243();
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

					field1096 = method472(25, "title screen", 1, field1090[1], "title");
					field1276 = new class38("p11", field1096);
					field1277 = new class38("p12", field1096);
					field1278 = new class38("b12", field1096);
					field1279 = new class38("q8", field1096);
					method468();
					method491();
					class51 var9 = method472(30, "config", 2, field1090[2], "config");
					class51 var10 = method472(35, "interface", 3, field1090[3], "interface");
					class51 var11 = method472(40, "2d graphics", 4, field1090[4], "media");
					class51 var12 = method472(45, "textures", 6, field1090[6], "textures");
					class51 var13 = method472(50, "chat system", 7, field1090[7], "wordenc");
					class51 var14 = method472(55, "sound effects", 8, field1090[8], "sounds");
					field1319 = new byte[4][104][104];
					field1269 = new int[4][105][105];
					field1383 = new class19(104, 104, field1269, 4);

					for (int var15 = 0; var15 < 4; var15++) {
						field1100[var15] = new class62(104, 104);
					}

					field1055 = new class36(512, 512);
					class51 var16 = method472(60, "update list", 5, field1090[5], "versionlist");
					method13(60, "Connecting to update server");
					field1164 = new class48();
					field1164.method279(var16, this);
					class8.method58(field1164.method282());
					class32.method135(field1164.method281(0), field1164);

					if (!field1360) {
						field1385 = 0;
						field1386 = false;
						field1164.method288(2, field1385);

						while (field1164.method289() > 0) {
							method427();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}
						}
					}

					method13(65, "Requesting animations");
					int var17 = field1164.method281(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1164.method288(1, var18);
					}

					while (field1164.method289() > 0) {
						int var19 = var17 - field1164.method289();
						if (var19 > 0) {
							method13(65, "Loading animations - " + var19 * 100 / var17 + "%");
						}

						method427();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}
					}

					method13(70, "Requesting models");
					int var20 = field1164.method281(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1164.method286(var21);
						if ((var22 & 0x1) != 0) {
							field1164.method288(0, var21);
						}
					}

					int var23 = field1164.method289();
					while (field1164.method289() > 0) {
						int var24 = var23 - field1164.method289();
						if (var24 > 0) {
							method13(70, "Loading models - " + var24 * 100 / var23 + "%");
						}

						method427();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field1091[0] != null) {
						method13(75, "Requesting maps");
						field1164.method288(3, field1164.method283(47, 0, 48));
						field1164.method288(3, field1164.method283(47, 1, 48));
						field1164.method288(3, field1164.method283(48, 0, 48));
						field1164.method288(3, field1164.method283(48, 1, 48));
						field1164.method288(3, field1164.method283(49, 0, 48));
						field1164.method288(3, field1164.method283(49, 1, 48));
						field1164.method288(3, field1164.method283(47, 0, 47));
						field1164.method288(3, field1164.method283(47, 1, 47));
						field1164.method288(3, field1164.method283(48, 0, 47));
						field1164.method288(3, field1164.method283(48, 1, 47));
						field1164.method288(3, field1164.method283(48, 0, 148));
						field1164.method288(3, field1164.method283(48, 1, 148));
						int var25 = field1164.method289();
						while (field1164.method289() > 0) {
							int var26 = var25 - field1164.method289();
							if (var26 > 0) {
								method13(75, "Loading maps - " + var26 * 100 / var25 + "%");
							}

							method427();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var27 = field1164.method281(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1164.method286(var28);
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
							field1164.method291(var30, var28, 0);
						}
					}

					field1164.method284(field1359);

					if (!field1360) {
						int var31 = field1164.method281(2);
						for (int var32 = 1; var32 < var31; var32++) {
							if (field1164.method287(var32)) {
								field1164.method291((byte) 1, var32, 2);
							}
						}
					}

					method13(80, "Unpacking media");
					field1026 = new class37(var11, "invback", 0);
					field1028 = new class37(var11, "chatback", 0);
					field1027 = new class37(var11, "mapback", 0);
					field1030 = new class37(var11, "backbase1", 0);
					field1031 = new class37(var11, "backbase2", 0);
					field1032 = new class37(var11, "backhmid1", 0);

					for (int var33 = 0; var33 < 13; var33++) {
						field1295[var33] = new class37(var11, "sideicons", var33);
					}

					field1340 = new class36(var11, "compass", 0);
					field1378 = new class36(var11, "mapedge", 0);
					field1378.method195();

					try {
						for (int var34 = 0; var34 < 50; var34++) {
							field1157[var34] = new class37(var11, "mapscene", var34);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var35 = 0; var35 < 50; var35++) {
							field1374[var35] = new class36(var11, "mapfunction", var35);
						}
					} catch (Exception var78) {
					}

					try {
						for (int var36 = 0; var36 < 20; var36++) {
							field1081[var36] = new class36(var11, "hitmarks", var36);
						}
					} catch (Exception var77) {
					}

					try {
						for (int var37 = 0; var37 < 20; var37++) {
							field1036[var37] = new class36(var11, "headicons", var37);
						}
					} catch (Exception var76) {
					}

					field1024 = new class36(var11, "mapmarker", 0);
					field1025 = new class36(var11, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field1159[var38] = new class36(var11, "cross", var38);
					}

					field1363 = new class36(var11, "mapdots", 0);
					field1364 = new class36(var11, "mapdots", 1);
					field1365 = new class36(var11, "mapdots", 2);
					field1366 = new class36(var11, "mapdots", 3);
					field1425 = new class37(var11, "scrollbar", 0);
					field1426 = new class37(var11, "scrollbar", 1);
					field1238 = new class37(var11, "redstone1", 0);
					field1239 = new class37(var11, "redstone2", 0);
					field1240 = new class37(var11, "redstone3", 0);
					field1241 = new class37(var11, "redstone1", 0);
					field1241.method208();
					field1242 = new class37(var11, "redstone2", 0);
					field1242.method208();
					field1037 = new class37(var11, "redstone1", 0);
					field1037.method209();
					field1038 = new class37(var11, "redstone2", 0);
					field1038.method209();
					field1039 = new class37(var11, "redstone3", 0);
					field1039.method209();
					field1040 = new class37(var11, "redstone1", 0);
					field1040.method208();
					field1040.method209();
					field1041 = new class37(var11, "redstone2", 0);
					field1041.method208();
					field1041.method209();

					for (int var39 = 0; var39 < 2; var39++) {
						field1058[var39] = new class37(var11, "mod_icons", var39);
					}

					class36 var40 = new class36(var11, "backleft1", 0);
					field1136 = new class44(var40.field596, var40.field595, method11());
					var40.method196(0, 0);
					class36 var41 = new class36(var11, "backleft2", 0);
					field1137 = new class44(var41.field596, var41.field595, method11());
					var41.method196(0, 0);
					class36 var42 = new class36(var11, "backright1", 0);
					field1138 = new class44(var42.field596, var42.field595, method11());
					var42.method196(0, 0);
					class36 var43 = new class36(var11, "backright2", 0);
					field1139 = new class44(var43.field596, var43.field595, method11());
					var43.method196(0, 0);
					class36 var44 = new class36(var11, "backtop1", 0);
					field1140 = new class44(var44.field596, var44.field595, method11());
					var44.method196(0, 0);
					class36 var45 = new class36(var11, "backvmid1", 0);
					field1141 = new class44(var45.field596, var45.field595, method11());
					var45.method196(0, 0);
					class36 var46 = new class36(var11, "backvmid2", 0);
					field1142 = new class44(var46.field596, var46.field595, method11());
					var46.method196(0, 0);
					class36 var47 = new class36(var11, "backvmid3", 0);
					field1143 = new class44(var47.field596, var47.field595, method11());
					var47.method196(0, 0);
					class36 var48 = new class36(var11, "backhmid2", 0);
					field1144 = new class44(var48.field596, var48.field595, method11());
					var48.method196(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 50; var53++) {
						if (field1374[var53] != null) {
							field1374[var53].method194(var51 + var52, var50 + var52, var49 + var52);
						}

						if (field1157[var53] != null) {
							field1157[var53].method210(var51 + var52, var50 + var52, var49 + var52);
						}
					}

					method13(83, "Unpacking textures");
					class35.method181(var12);
					class35.method185(0.8D);
					class35.method180(20);
					method13(86, "Unpacking config");
					class66.method381(var9);
					class57.method331(var9);
					class63.method371(var9);
					class60.method346(var9);
					class59.method340(var9);
					class64.method375(var9);
					class67.method384(var9);
					class68.method387(var9);
					class60.field893 = field1359;

					if (!field1360) {
						method13(90, "Unpacking sounds");
						byte[] var54 = var14.method308("sounds.dat", null);
						class39 var55 = new class39(var54);
						class55.method321(var55);
					}

					method13(95, "Unpacking interfaces");
					class38[] var56 = new class38[] { field1276, field1277, field1278, field1279 };
					class4.method32(var56, var10, var11);
					method13(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field1027.field601[field1027.field603 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field1085[var57] = var58;
						field1297[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field1027.field601[field1027.field603 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field1390[var61 - 5] = var62 - 25;
						field1292[var61 - 5] = var63 - var62;
					}

					class35.method178(96, 479);
					field1226 = class35.field582;
					class35.method178(261, 190);
					field1227 = class35.field582;
					class35.method178(334, 512);
					field1228 = class35.field582;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = class35.field580[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					class19.method99(var65, 512, 800, 500, 334);
					class69.method389(var13);
					field1291 = new class58(this);
				} catch (Exception var81) {
					signlink.reporterror("loaderror " + field1253 + " " + field1102);
					field1372 = true;
				}
			} else {
				field1387 = true;
			}
		}
	}

	@ObfuscatedName("client.a(ZILd;)I")
	public final int method546(int arg0, class4 arg1) {
		if (arg1.field72 == null || arg0 >= arg1.field72.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field72[arg0];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1235[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1215[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1373[var3[var5++]];
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
					var4 += field1264[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1328[field1215[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1264[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1115.field427;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1215[var10];
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
					var4 += field1236;
				}

				if (var6 == 12) {
					var4 += field1145;
				}

				if (var6 == 13) {
					int var14 = field1264[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method547() {
		field1119 = 0;
		for (int var1 = -1; var1 < field1334 + field1078; var1++) {
			class26 var2;
			if (var1 == -1) {
				var2 = field1115;
			} else if (var1 < field1334) {
				var2 = field1333[field1335[var1]];
			} else {
				var2 = field1077[field1079[var1 - field1334]];
			}

			if (var2 != null && var2.method126()) {
				if (var1 >= field1334) {
					class59 var6 = ((class27) var2).field420;
					if (var6.field886 >= 0 && var6.field886 < field1036.length) {
						method450(var2, var2.field412 + 15);

						if (field1432 > -1) {
							field1036[var6.field886].method198(field1433 - 30, field1432 - 12);
						}
					}

					if (field1202 == 1 && field1079[var1 - field1334] == field1113 && field1371 % 20 < 10) {
						method450(var2, var2.field412 + 15);

						if (field1432 > -1) {
							field1036[2].method198(field1433 - 28, field1432 - 12);
						}
					}
				} else {
					int var3 = 30;
					class28 var4 = (class28) var2;
					if (var4.field424 != 0) {
						method450(var2, var2.field412 + 15);

						if (field1432 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field424 & 1 << var5) != 0) {
									field1036[var5].method198(field1433 - var3, field1432 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1202 == 10 && field1335[var1] == field1204) {
						method450(var2, var2.field412 + 15);

						if (field1432 > -1) {
							field1036[7].method198(field1433 - var3, field1432 - 12);
						}
					}
				}

				if (var2.field378 != null && (var1 >= field1334 || field1064 == 0 || field1064 == 3 || field1064 == 1 && method543(((class28) var2).field421))) {
					method450(var2, var2.field412);

					if (field1432 > -1 && field1119 < field1120) {
						field1124[field1119] = field1278.method215(var2.field378) / 2;
						field1123[field1119] = field1278.field616;
						field1121[field1119] = field1432;
						field1122[field1119] = field1433;
						field1125[field1119] = var2.field380;
						field1126[field1119] = var2.field381;
						field1127[field1119] = var2.field379;
						field1128[field1119++] = var2.field378;

						if (field1087 == 0 && var2.field381 == 1) {
							field1123[field1119] += 10;
							field1122[field1119] += 5;
						}

						if (field1087 == 0 && var2.field381 == 2) {
							field1124[field1119] = 60;
						}
					}
				}

				if (var2.field385 > field1371) {
					method450(var2, var2.field412 + 15);

					if (field1432 > -1) {
						int var7 = var2.field386 * 30 / var2.field387;
						if (var7 > 30) {
							var7 = 30;
						}

						class34.method169(5, var7, field1433 - 3, field1432 - 15, 0xFF00);
						class34.method169(5, 30 - var7, field1433 - 3, field1432 + var7 - 15, 0xFF0000);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field384[var8] > field1371) {
						method450(var2, var2.field412 / 2);

						if (field1432 > -1) {
							if (var8 == 1) {
								field1433 -= 20;
							}

							if (var8 == 2) {
								field1432 -= 15;
								field1433 -= 10;
							}

							if (var8 == 3) {
								field1432 += 15;
								field1433 -= 10;
							}

							field1081[var2.field383[var8]].method198(field1433 - 12, field1432 - 12);
							field1276.method213(String.valueOf(var2.field382[var8]), field1432, field1433 + 4, 0);
							field1276.method213(String.valueOf(var2.field382[var8]), field1432 - 1, field1433 + 3, 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1119; var9++) {
			int var10 = field1121[var9];
			int var11 = field1122[var9];
			int var12 = field1124[var9];
			int var13 = field1123[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1122[var15] - field1123[var15] && var11 - var13 < field1122[var15] + 2 && var10 - var12 < field1124[var15] + field1121[var15] && var10 + var12 > field1121[var15] - field1124[var15] && field1122[var15] - field1123[var15] < var11) {
						var11 = field1122[var15] - field1123[var15];
						var14 = true;
					}
				}
			}

			field1432 = field1121[var9];
			field1433 = field1122[var9] = var11;
			String var16 = field1128[var9];
			if (field1087 == 0) {
				int var17 = 0xFFFF00;
				if (field1125[var9] < 6) {
					var17 = field1056[field1125[var9]];
				}

				if (field1125[var9] == 6) {
					var17 = field1165 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1125[var9] == 7) {
					var17 = field1165 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1125[var9] == 8) {
					var17 = field1165 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1125[var9] == 9) {
					int var18 = 150 - field1127[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1125[var9] == 10) {
					int var19 = 150 - field1127[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1125[var9] == 11) {
					int var20 = 150 - field1127[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1126[var9] == 0) {
					field1278.method213(var16, field1432, field1433 + 1, 0);
					field1278.method213(var16, field1432, field1433, var17);
				}

				if (field1126[var9] == 1) {
					field1278.method217(field1165, var16, field1432, field1433 + 1, 0);
					field1278.method217(field1165, var16, field1432, field1433, var17);
				}

				if (field1126[var9] == 2) {
					int var21 = field1278.method215(var16);
					int var22 = (150 - field1127[var9]) * (var21 + 100) / 150;
					class34.method166(334, field1432 + 50, 0, field1432 - 50);
					field1278.method216(field1432 + 50 - var22, field1433 + 1, var16, 0);
					field1278.method216(field1432 + 50 - var22, field1433, var16, var17);
					class34.method165();
				}
			} else {
				field1278.method213(var16, field1432, field1433 + 1, 0);
				field1278.method213(var16, field1432, field1433, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.b(IB)Z")
	public final boolean method548(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1303[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method549() {
		if (field1320 == 2) {
			for (class41 var1 = (class41) field1205.method257(); var1 != null; var1 = (class41) field1205.method259()) {
				if (var1.field648 > 0) {
					var1.field648--;
				}

				if (var1.field648 != 0) {
					if (var1.field647 > 0) {
						var1.field647--;
					}

					if (var1.field647 == 0 && (var1.field644 < 0 || class3.method30(var1.field644, var1.field646))) {
						method474(var1.field639, var1.field645, var1.field644, var1.field637, var1.field646, var1.field638, var1.field640);
						var1.field647 = -1;

						if (var1.field644 == var1.field641 && var1.field641 == -1) {
							var1.method119();
						} else if (var1.field644 == var1.field641 && var1.field645 == var1.field642 && var1.field646 == var1.field643) {
							var1.method119();
						}
					}
				} else if (var1.field641 < 0 || class3.method30(var1.field641, var1.field643)) {
					method474(var1.field639, var1.field642, var1.field641, var1.field637, var1.field643, var1.field638, var1.field640);
					var1.method119();
				}
			}

			field1190++;
			if (field1190 > 85) {
				field1190 = 0;
				field1193.method227(232);
				return;
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method550() {
		for (int var1 = 0; var1 < field1289; var1++) {
			if (field1114[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1094[var1] != field1099 || field1330[var1] != field1179) {
						class39 var3 = class55.method322(field1094[var1], field1330[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1234 / 22 + field1146) {
							field1234 = var3.field621;
							field1146 = System.currentTimeMillis();

							if (method501(var3.field620, var3.field621)) {
								field1099 = field1094[var1];
								field1179 = field1330[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method499()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1114[var1] != -5) {
					field1114[var1] = -5;
				} else {
					field1289--;
					for (int var5 = var1; var5 < field1289; var5++) {
						field1094[var5] = field1094[var5 + 1];
						field1330[var5] = field1330[var5 + 1];
						field1114[var5] = field1114[var5 + 1];
					}

					var1--;
				}
			} else {
				field1114[var1]--;
			}
		}

		if (field1063 > 0) {
			field1063 -= 20;
			if (field1063 < 0) {
				field1063 = 0;
			}

			if (field1063 == 0 && field1158 && !field1360) {
				field1385 = field1419;
				field1386 = false;
				field1164.method288(2, field1385);
				return;
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method551() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.L(I)V")
	public final void method552() {
		int var1 = field1411 * 128 + 64;
		int var2 = field1412 * 128 + 64;
		int var3 = method485(var1, field1177, var2) - field1413;

		if (field1401 < var1) {
			field1401 += (var1 - field1401) * field1415 / 1000 + field1414;
			if (field1401 > var1) {
				field1401 = var1;
			}
		}

		if (field1401 > var1) {
			field1401 -= (field1401 - var1) * field1415 / 1000 + field1414;
			if (field1401 < var1) {
				field1401 = var1;
			}
		}

		if (field1402 < var3) {
			field1402 += (var3 - field1402) * field1415 / 1000 + field1414;
			if (field1402 > var3) {
				field1402 = var3;
			}
		}

		if (field1402 > var3) {
			field1402 -= (field1402 - var3) * field1415 / 1000 + field1414;
			if (field1402 < var3) {
				field1402 = var3;
			}
		}

		if (field1403 < var2) {
			field1403 += (var2 - field1403) * field1415 / 1000 + field1414;
			if (field1403 > var2) {
				field1403 = var2;
			}
		}

		if (field1403 > var2) {
			field1403 -= (field1403 - var2) * field1415 / 1000 + field1414;
			if (field1403 < var2) {
				field1403 = var2;
			}
		}

		int var4 = field1194 * 128 + 64;
		int var5 = field1195 * 128 + 64;
		int var6 = method485(var4, field1177, var5) - field1196;
		int var7 = var4 - field1401;
		int var8 = var6 - field1402;
		int var9 = var5 - field1403;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1404 < var11) {
			field1404 += (var11 - field1404) * field1198 / 1000 + field1197;
			if (field1404 > var11) {
				field1404 = var11;
			}
		}

		if (field1404 > var11) {
			field1404 -= (field1404 - var11) * field1198 / 1000 + field1197;
			if (field1404 < var11) {
				field1404 = var11;
			}
		}

		int var13 = var12 - field1405;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1405 += field1198 * var13 / 1000 + field1197;
			field1405 &= 0x7FF;
		}

		if (var13 < 0) {
			field1405 -= -var13 * field1198 / 1000 + field1197;
			field1405 &= 0x7FF;
		}

		int var14 = var12 - field1405;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1405 = var12;
		}
	}

	@ObfuscatedName("client.c(Lmb;II)V")
	public final void method553(class39 arg0, int arg1) {
		while (arg0.field622 + 21 < arg1 * 8) {
			int var3 = arg0.method249(13);
			if (var3 == 8191) {
				break;
			}

			if (field1077[var3] == null) {
				field1077[var3] = new class27();
			}

			class27 var4 = field1077[var3];
			field1079[field1078++] = var3;
			var4.field411 = field1371;
			var4.field420 = class59.method342(arg0.method249(11));
			var4.field370 = var4.field420.field864;
			var4.field373 = var4.field420.field868;
			var4.field374 = var4.field420.field869;
			var4.field375 = var4.field420.field870;
			var4.field376 = var4.field420.field871;
			var4.field371 = var4.field420.field867;
			int var5 = arg0.method249(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method249(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method123(field1115.field416[0] + var6, field1115.field415[0] + var5, false);
			int var7 = arg0.method249(1);
			if (var7 == 1) {
				field1337[field1336++] = var3;
			}
		}

		arg0.method250();
	}

	@ObfuscatedName("client.M(I)V")
	public final void method554() {
		try {
			int var1 = field1115.field366 + field1293;
			int var2 = field1115.field367 + field1160;
			if (field1033 - var1 < -500 || field1033 - var1 > 500 || field1034 - var2 < -500 || field1034 - var2 > 500) {
				field1033 = var1;
				field1034 = var2;
			}

			if (field1033 != var1) {
				field1033 += (var1 - field1033) / 16;
			}

			if (field1034 != var2) {
				field1034 += (var2 - field1034) / 16;
			}

			if (field27[1] == 1) {
				field1399 += (-field1399 - 24) / 2;
			} else if (field27[2] == 1) {
				field1399 += (24 - field1399) / 2;
			} else {
				field1399 /= 2;
			}

			if (field27[3] == 1) {
				field1400 += (12 - field1400) / 2;
			} else if (field27[4] == 1) {
				field1400 += (-field1400 - 12) / 2;
			} else {
				field1400 /= 2;
			}

			field1398 = field1399 / 2 + field1398 & 0x7FF;
			field1397 += field1400 / 2;
			if (field1397 < 128) {
				field1397 = 128;
			}

			if (field1397 > 383) {
				field1397 = 383;
			}

			int var3 = field1033 >> 7;
			int var4 = field1034 >> 7;
			int var5 = method485(field1033, field1177, field1034);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1177;
						if (var9 < 3 && (field1319[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1269[var9][var7][var8];
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

			if (var11 > field1083) {
				field1083 += (var11 - field1083) / 24;
			} else if (var11 < field1083) {
				field1083 += (var11 - field1083) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1115.field366 + "," + field1115.field367 + "," + field1033 + "," + field1034 + "," + field1111 + "," + field1112 + "," + field1392 + "," + field1393);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method555() {
		field1046.method267();
		class35.field582 = field1226;
		field1028.method211(0, 0);

		if (field1251) {
			field1278.method213(field1317, 239, 40, 0);
			field1278.method213(field1307 + "*", 239, 60, 128);
		} else if (field1129) {
			field1278.method213("Enter amount:", 239, 40, 0);
			field1278.method213(field1098 + "*", 239, 60, 128);
		} else if (field1273 != null) {
			field1278.method213(field1273, 239, 40, 0);
			field1278.method213("Click to continue", 239, 60, 128);
		} else if (field1265 != -1) {
			method484(0, class4.field57[field1265], 0, 0);
		} else if (field1166 == -1) {
			class38 var1 = field1277;
			int var2 = 0;
			class34.method166(77, 463, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1377[var3] != null) {
					int var4 = field1375[var3];
					int var5 = field1246 + 70 - var2 * 14;
					String var6 = field1376[var3];
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
							var1.method216(4, var5, field1377[var3], 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1064 == 0 || field1064 == 1 && method543(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1058[0].method211(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field1058[1].method211(var5 - 12, var8);
								var8 += 14;
							}

							var1.method216(var8, var5, var6 + ":", 0);
							var8 += var1.method215(var6) + 8;
							var1.method216(var8, var5, field1377[var3], 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1201 == 0 && (var4 == 7 || field1156 == 0 || field1156 == 1 && method543(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method216(var9, var5, "From", 0);
							int var11 = var9 + var1.method215("From ");
							if (var7 == 1) {
								field1058[0].method211(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field1058[1].method211(var5 - 12, var11);
								var11 += 14;
							}

							var1.method216(var11, var5, var6 + ":", 0);
							var11 += var1.method215(var6) + 8;
							var1.method216(var11, var5, field1377[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1183 == 0 || field1183 == 1 && method543(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(4, var5, var6 + " " + field1377[var3], 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1201 == 0 && field1156 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(4, var5, field1377[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1201 == 0 && field1156 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(4, var5, "To " + var6 + ":", 0);
							var1.method216(var1.method215("To " + var6) + 12, var5, field1377[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1183 == 0 || field1183 == 1 && method543(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(4, var5, var6 + " " + field1377[var3], 0x7E3200);
						}

						var2++;
					}
				}
			}

			class34.method165();
			field1135 = var2 * 14 + 7;
			if (field1135 < 78) {
				field1135 = 78;
			}

			method518(77, 0, field1135 - field1246 - 77, 463, field1135);
			String var10;
			if (field1115 == null || field1115.field421 == null) {
				var10 = class52.method313(field1153);
			} else {
				var10 = field1115.field421;
			}

			var1.method216(4, 90, var10 + ":", 0);
			var1.method216(var1.method215(var10 + ": ") + 6, 90, field1268 + "*", 255);
			class34.method172(0, 0, 479, 77);
		} else {
			method484(0, class4.field57[field1166], 0, 0);
		}

		if (field1152 && field1280 == 2) {
			method504();
		}

		field1046.method268(357, 17, field9);
		field1045.method267();
		class35.field582 = field1228;
	}

	@ObfuscatedName("client.a(IIIIZLd;IBI)V")
	public final void method556(int arg0, int arg1, int arg2, int arg3, boolean arg4, class4 arg5, int arg6, int arg7) {
		if (field1095) {
			field1233 = 32;
		} else {
			field1233 = 0;
		}

		field1095 = false;
		if (arg0 >= arg2 && arg0 < arg2 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
			arg5.field77 -= field1188 * 4;

			if (arg4) {
				field1051 = true;
				return;
			}
		} else if (arg0 >= arg2 && arg0 < arg2 + 16 && arg6 >= arg1 + arg7 - 16 && arg6 < arg1 + arg7) {
			arg5.field77 += field1188 * 4;

			if (arg4) {
				field1051 = true;
				return;
			}
		} else if (arg0 >= arg2 - field1233 && arg0 < arg2 + field1233 + 16 && arg6 >= arg1 + 16 && arg6 < arg1 + arg7 - 16 && field1188 > 0) {
			int var9 = (arg7 - 32) * arg7 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg1 - var9 / 2 - 16;
			int var11 = arg7 - var9 - 32;
			arg5.field77 = (arg3 - arg7) * var10 / var11;

			if (arg4) {
				field1051 = true;
			}

			field1095 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.o(B)V")
	public void method557() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1248);

		if (field1164 != null) {
			System.out.println("Od-cycle:" + field1164.field745);
		}

		System.out.println("loop-cycle:" + field1371);
		System.out.println("draw-cycle:" + field1150);
		System.out.println("ptype:" + field1259);
		System.out.println("psize:" + field1258);

		if (field1270 != null) {
			field1270.method43();
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

	@ObfuscatedName("client.O(I)V")
	public final void method558() {
		for (int var1 = -1; var1 < field1334; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1332;
			} else {
				var2 = field1335[var1];
			}

			class28 var3 = field1333[var2];
			if (var3 != null) {
				method437(var3, 1);
			}
		}

		field1200++;
		if (field1200 > 1406) {
			field1200 = 0;
			field1193.method227(215);
			field1193.method228(0);
			int var4 = field1193.field621;
			field1193.method228(162);
			field1193.method228(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1193.method228(84);
			}

			field1193.method229(31824);
			field1193.method229(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1193.method228(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1193.method228(134);
			}

			field1193.method228(100);
			field1193.method228(94);
			field1193.method229(35521);
			field1193.method237(field1193.field621 - var4);
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1328[var1] = var0 / 4;
		}
	}
}
