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
	public static int field1072;

	@ObfuscatedName("client.bb")
	public int field1073;

	@ObfuscatedName("client.cb")
	public int field1074;

	@ObfuscatedName("client.db")
	public int field1075;

	@ObfuscatedName("client.eb")
	public boolean field1076 = false;

	@ObfuscatedName("client.fb")
	public String field1077 = "";

	@ObfuscatedName("client.gb")
	public class5 field1078;

	@ObfuscatedName("client.hb")
	public static int field1079;

	@ObfuscatedName("client.ib")
	public static int field1080;

	@ObfuscatedName("client.jb")
	public boolean field1081 = false;

	@ObfuscatedName("client.kb")
	public int field1082;

	@ObfuscatedName("client.lb")
	public boolean field1083 = false;

	@ObfuscatedName("client.mb")
	public int field1084;

	@ObfuscatedName("client.nb")
	public int field1085;

	@ObfuscatedName("client.ob")
	public class36[] field1086 = new class36[100];

	@ObfuscatedName("client.pb")
	public int[] field1087 = new int[151];

	@ObfuscatedName("client.qb")
	public int field1088;

	@ObfuscatedName("client.rb")
	public int field1089;

	@ObfuscatedName("client.sb")
	public int field1090;

	@ObfuscatedName("client.tb")
	public int field1091;

	@ObfuscatedName("client.ub")
	public String field1092;

	@ObfuscatedName("client.vb")
	public int field1093;

	@ObfuscatedName("client.wb")
	public int[] field1094;

	@ObfuscatedName("client.xb")
	public int[] field1095;

	@ObfuscatedName("client.zb")
	public static boolean field1096;

	@ObfuscatedName("client.ac")
	public int field1121 = 0x4D4233;

	@ObfuscatedName("client.bc")
	public int field1122;

	@ObfuscatedName("client.dc")
	public static int field1123;

	@ObfuscatedName("client.ec")
	public int field1124;

	@ObfuscatedName("client.fc")
	public int field1125;

	@ObfuscatedName("client.gc")
	public int field1126;

	@ObfuscatedName("client.hc")
	public int field1127;

	@ObfuscatedName("client.ic")
	public static int field1128;

	@ObfuscatedName("client.jc")
	public class35 field1129;

	@ObfuscatedName("client.kc")
	public class35 field1130;

	@ObfuscatedName("client.lc")
	public class35 field1131;

	@ObfuscatedName("client.mc")
	public class35 field1132;

	@ObfuscatedName("client.nc")
	public int field1133;

	@ObfuscatedName("client.oc")
	public int[] field1134 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.pc")
	public byte[][][] field1135;

	@ObfuscatedName("client.rc")
	public class35 field1136;

	@ObfuscatedName("client.sc")
	public int field1137;

	@ObfuscatedName("client.R")
	public boolean field1064 = false;

	@ObfuscatedName("client.U")
	public int[] field1067 = new int[class67.field1012];

	@ObfuscatedName("client.V")
	public int field1068 = -1;

	@ObfuscatedName("client.Y")
	public class48[] field1070 = new class48[5];

	@ObfuscatedName("client.Z")
	public int field1071 = -1;

	@ObfuscatedName("client.Bb")
	public int[] field1097 = new int[50];

	@ObfuscatedName("client.Lb")
	public int[] field1106 = new int[500];

	@ObfuscatedName("client.Mb")
	public int[] field1107 = new int[500];

	@ObfuscatedName("client.Nb")
	public int[] field1108 = new int[500];

	@ObfuscatedName("client.Ob")
	public int[] field1109 = new int[500];

	@ObfuscatedName("client.Vb")
	public boolean field1116 = false;

	@ObfuscatedName("client.Wb")
	public class41[][][] field1117 = new class41[4][104][104];

	@ObfuscatedName("client.Xb")
	public int field1118 = -1;

	@ObfuscatedName("client.zc")
	public String field1144 = "";

	@ObfuscatedName("client.Ac")
	public String field1145 = "";

	@ObfuscatedName("client.Bc")
	public int[] field1146 = new int[50];

	@ObfuscatedName("client.Hc")
	public int[] field1152 = new int[1000];

	@ObfuscatedName("client.Ic")
	public String[] field1153 = new String[5];

	@ObfuscatedName("client.Jc")
	public boolean[] field1154 = new boolean[5];

	@ObfuscatedName("client.Kc")
	public int field1155 = 78;

	@ObfuscatedName("client.Lc")
	public byte[] field1156 = new byte[16384];

	@ObfuscatedName("client.Nc")
	public int[] field1158 = new int[100];

	@ObfuscatedName("client.Oc")
	public String[] field1159 = new String[100];

	@ObfuscatedName("client.Pc")
	public String[] field1160 = new String[100];

	@ObfuscatedName("client.Qc")
	public class41 field1161 = new class41();

	@ObfuscatedName("client.Tc")
	public int field1162 = 0x766654;

	@ObfuscatedName("client.Wc")
	public boolean field1164 = false;

	@ObfuscatedName("client.Zc")
	public String field1167 = "";

	@ObfuscatedName("client.ad")
	public String field1168 = "";

	@ObfuscatedName("client.dd")
	public String field1171 = "";

	@ObfuscatedName("client.ed")
	public boolean field1172 = false;

	@ObfuscatedName("client.hd")
	public int field1175 = 1;

	@ObfuscatedName("client.id")
	public class62[] field1176 = new class62[4];

	@ObfuscatedName("client.jd")
	public int field1177 = -1;

	@ObfuscatedName("client.ld")
	public int[] field1178 = new int[200];

	@ObfuscatedName("client.td")
	public class35[] field1185 = new class35[8];

	@ObfuscatedName("client.yd")
	public class41 field1190 = new class41();

	@ObfuscatedName("client.Cd")
	public boolean field1194 = false;

	@ObfuscatedName("client.Hd")
	public class35[] field1199 = new class35[20];

	@ObfuscatedName("client.Id")
	public class38 field1200 = class38.method217(1);

	@ObfuscatedName("client.Jd")
	public boolean field1201 = false;

	@ObfuscatedName("client.Md")
	public int[] field1202 = new int[2000];

	@ObfuscatedName("client.ae")
	public boolean field1214 = false;

	@ObfuscatedName("client.ee")
	public int[] field1218 = new int[class67.field1012];

	@ObfuscatedName("client.ge")
	public boolean field1219 = false;

	@ObfuscatedName("client.he")
	public CRC32 field1220 = new CRC32();

	@ObfuscatedName("client.le")
	public int[] field1222 = new int[5];

	@ObfuscatedName("client.ue")
	public class38 field1229 = class38.method217(1);

	@ObfuscatedName("client.ve")
	public int[] field1230 = new int[5];

	@ObfuscatedName("client.we")
	public boolean field1231 = false;

	@ObfuscatedName("client.ye")
	public int field1233 = 2;

	@ObfuscatedName("client.ze")
	public boolean field1234 = false;

	@ObfuscatedName("client.Ae")
	public int field1235 = -1;

	@ObfuscatedName("client.De")
	public int[] field1238 = new int[class67.field1012];

	@ObfuscatedName("client.Ge")
	public boolean field1241 = false;

	@ObfuscatedName("client.Ke")
	public boolean[] field1242 = new boolean[5];

	@ObfuscatedName("client.Le")
	public class35[] field1243 = new class35[1000];

	@ObfuscatedName("client.Me")
	public long[] field1244 = new long[200];

	@ObfuscatedName("client.Ne")
	public boolean field1245 = false;

	@ObfuscatedName("client.Se")
	public boolean field1249 = false;

	@ObfuscatedName("client.Ye")
	public int field1255 = 1;

	@ObfuscatedName("client.af")
	public boolean field1257 = true;

	@ObfuscatedName("client.bf")
	public String field1258 = "";

	@ObfuscatedName("client.cf")
	public String field1259 = "";

	@ObfuscatedName("client.df")
	public int[][] field1260 = new int[104][104];

	@ObfuscatedName("client.gf")
	public int field1262 = -1;

	@ObfuscatedName("client.jf")
	public int field1264 = 0x23201B;

	@ObfuscatedName("client.lf")
	public int[] field1266 = new int[151];

	@ObfuscatedName("client.vf")
	public int[] field1276 = new int[5];

	@ObfuscatedName("client.wf")
	public boolean field1277 = false;

	@ObfuscatedName("client.xf")
	public class36[] field1278 = new class36[2];

	@ObfuscatedName("client.yf")
	public int field1279 = 2048;

	@ObfuscatedName("client.zf")
	public int field1280 = 2047;

	@ObfuscatedName("client.Af")
	public class27[] field1281 = new class27[field1279];

	@ObfuscatedName("client.Cf")
	public int[] field1283 = new int[field1279];

	@ObfuscatedName("client.Ef")
	public int[] field1285 = new int[field1279];

	@ObfuscatedName("client.Ff")
	public class38[] field1286 = new class38[field1279];

	@ObfuscatedName("client.Gf")
	public class35[] field1287 = new class35[100];

	@ObfuscatedName("client.Hf")
	public int field1288 = 3;

	@ObfuscatedName("client.Kf")
	public int[] field1291 = new int[1000];

	@ObfuscatedName("client.Lf")
	public int[] field1292 = new int[1000];

	@ObfuscatedName("client.Pf")
	public int[] field1295 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Vf")
	public int field1301 = -1;

	@ObfuscatedName("client.Wf")
	public int[] field1302 = new int[9];

	@ObfuscatedName("client.cg")
	public int field1307 = 0x332D25;

	@ObfuscatedName("client.ng")
	public String[] field1318 = new String[500];

	@ObfuscatedName("client.og")
	public boolean field1319 = false;

	@ObfuscatedName("client.pg")
	public class4 field1320 = new class4();

	@ObfuscatedName("client.vg")
	public final int[] field1325 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.wg")
	public int field1326 = -1;

	@ObfuscatedName("client.zg")
	public boolean field1328 = true;

	@ObfuscatedName("client.Ag")
	public int[] field1329 = new int[256];

	@ObfuscatedName("client.Cg")
	public int field1331 = -1;

	@ObfuscatedName("client.Pg")
	public String field1344 = "";

	@ObfuscatedName("client.Vg")
	public int[] field1350 = new int[4000];

	@ObfuscatedName("client.Wg")
	public int[] field1351 = new int[4000];

	@ObfuscatedName("client.Xg")
	public int[] field1352 = new int[5];

	@ObfuscatedName("client.Zg")
	public int[][] field1354 = new int[104][104];

	@ObfuscatedName("client.ch")
	public int field1356 = -1;

	@ObfuscatedName("client.dh")
	public boolean field1357 = false;

	@ObfuscatedName("client.ih")
	public int[] field1361 = new int[33];

	@ObfuscatedName("client.jh")
	public boolean field1362 = true;

	@ObfuscatedName("client.oh")
	public int field1367 = -1;

	@ObfuscatedName("client.xh")
	public int[] field1375 = new int[5];

	@ObfuscatedName("client.Eh")
	public int field1381 = -1;

	@ObfuscatedName("client.Fh")
	public int field1382 = -1;

	@ObfuscatedName("client.Ih")
	public int field1384 = 128;

	@ObfuscatedName("client.Nh")
	public boolean field1388 = true;

	@ObfuscatedName("client.Oh")
	public boolean field1389 = false;

	@ObfuscatedName("client.Ph")
	public int[] field1390 = new int[2000];

	@ObfuscatedName("client.Qh")
	public long[] field1391 = new long[100];

	@ObfuscatedName("client.Sh")
	public int field1393 = 50;

	@ObfuscatedName("client.Th")
	public int[] field1394 = new int[field1393];

	@ObfuscatedName("client.Uh")
	public int[] field1395 = new int[field1393];

	@ObfuscatedName("client.Vh")
	public int[] field1396 = new int[field1393];

	@ObfuscatedName("client.Wh")
	public int[] field1397 = new int[field1393];

	@ObfuscatedName("client.Xh")
	public int[] field1398 = new int[field1393];

	@ObfuscatedName("client.Yh")
	public int[] field1399 = new int[field1393];

	@ObfuscatedName("client.Zh")
	public int[] field1400 = new int[field1393];

	@ObfuscatedName("client.ai")
	public String[] field1401 = new String[field1393];

	@ObfuscatedName("client.ci")
	public class41 field1402 = new class41();

	@ObfuscatedName("client.ei")
	public boolean field1404 = true;

	@ObfuscatedName("client.gi")
	public int field1406 = 2;

	@ObfuscatedName("client.ii")
	public class38 field1407 = class38.method217(1);

	@ObfuscatedName("client.vi")
	public int[] field1418 = new int[50];

	@ObfuscatedName("client.wi")
	public String[] field1419 = new String[200];

	@ObfuscatedName("client.yi")
	public class35[] field1421 = new class35[20];

	@ObfuscatedName("client.zi")
	public final int field1422 = 100;

	@ObfuscatedName("client.Ai")
	public int[] field1423 = new int[100];

	@ObfuscatedName("client.Di")
	public int[] field1426 = new int[7];

	@ObfuscatedName("client.Fi")
	public int field1428 = -1;

	@ObfuscatedName("client.Ii")
	public boolean field1431 = false;

	@ObfuscatedName("client.Oi")
	public boolean field1437 = false;

	@ObfuscatedName("client.aj")
	public boolean field1448 = false;

	@ObfuscatedName("client.ej")
	public int field1452 = 2;

	@ObfuscatedName("client.pj")
	public int[][] field1463 = new int[104][104];

	@ObfuscatedName("client.vj")
	public boolean field1468 = false;

	@ObfuscatedName("client.wj")
	public boolean field1469 = false;

	@ObfuscatedName("client.xj")
	public class36[] field1470 = new class36[13];

	@ObfuscatedName("client.Aj")
	public class26[] field1471 = new class26[16384];

	@ObfuscatedName("client.Cj")
	public int[] field1473 = new int[16384];

	@ObfuscatedName("client.Ij")
	public int[] field1479 = new int[33];

	@ObfuscatedName("client.Ub")
	public static BigInteger field1115 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Vc")
	public static final int[][] field1163 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Yc")
	public static int[] field1166 = new int[32];

	@ObfuscatedName("client.Ce")
	public static final int[] field1237 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Zf")
	public static int[] field1305 = new int[99];

	@ObfuscatedName("client.ig")
	public static int field1313 = 10;

	@ObfuscatedName("client.kg")
	public static boolean field1315 = true;

	@ObfuscatedName("client.di")
	public static BigInteger field1403 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Gi")
	public static String field1429 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.M")
	public int field1060;

	@ObfuscatedName("client.N")
	public static int field1061;

	@ObfuscatedName("client.P")
	public int field1062;

	@ObfuscatedName("client.Q")
	public static int field1063;

	@ObfuscatedName("client.T")
	public int field1066;

	@ObfuscatedName("client.X")
	public int field1069;

	@ObfuscatedName("client.Gb")
	public int field1102;

	@ObfuscatedName("client.Ib")
	public static int field1103;

	@ObfuscatedName("client.Jb")
	public int field1104;

	@ObfuscatedName("client.Kb")
	public int field1105;

	@ObfuscatedName("client.Pb")
	public int field1110;

	@ObfuscatedName("client.Qb")
	public int field1111;

	@ObfuscatedName("client.Rb")
	public int field1112;

	@ObfuscatedName("client.Sb")
	public int field1113;

	@ObfuscatedName("client.Tb")
	public int field1114;

	@ObfuscatedName("client.Zb")
	public static int field1120;

	@ObfuscatedName("client.tc")
	public int field1138;

	@ObfuscatedName("client.uc")
	public int field1139;

	@ObfuscatedName("client.Fc")
	public int field1150;

	@ObfuscatedName("client.Gc")
	public int field1151;

	@ObfuscatedName("client.Mc")
	public int field1157;

	@ObfuscatedName("client.Xc")
	public int field1165;

	@ObfuscatedName("client.bd")
	public static int field1169;

	@ObfuscatedName("client.fd")
	public int field1173;

	@ObfuscatedName("client.gd")
	public int field1174;

	@ObfuscatedName("client.md")
	public static int field1179;

	@ObfuscatedName("client.nd")
	public int field1180;

	@ObfuscatedName("client.od")
	public int field1181;

	@ObfuscatedName("client.pd")
	public int field1182;

	@ObfuscatedName("client.ud")
	public int field1186;

	@ObfuscatedName("client.vd")
	public int field1187;

	@ObfuscatedName("client.wd")
	public static int field1188;

	@ObfuscatedName("client.Dd")
	public int field1195;

	@ObfuscatedName("client.Ed")
	public int field1196;

	@ObfuscatedName("client.Fd")
	public int field1197;

	@ObfuscatedName("client.Gd")
	public int field1198;

	@ObfuscatedName("client.Rd")
	public int field1207;

	@ObfuscatedName("client.Sd")
	public int field1208;

	@ObfuscatedName("client.Td")
	public int field1209;

	@ObfuscatedName("client.Ud")
	public int field1210;

	@ObfuscatedName("client.Vd")
	public int field1211;

	@ObfuscatedName("client.Wd")
	public int field1212;

	@ObfuscatedName("client.Xd")
	public int field1213;

	@ObfuscatedName("client.be")
	public int field1215;

	@ObfuscatedName("client.ce")
	public int field1216;

	@ObfuscatedName("client.de")
	public static int field1217;

	@ObfuscatedName("client.xe")
	public int field1232;

	@ObfuscatedName("client.Be")
	public int field1236;

	@ObfuscatedName("client.Ee")
	public int field1239;

	@ObfuscatedName("client.Fe")
	public int field1240;

	@ObfuscatedName("client.Oe")
	public int field1246;

	@ObfuscatedName("client.Te")
	public int field1250;

	@ObfuscatedName("client.Ue")
	public int field1251;

	@ObfuscatedName("client.Ve")
	public int field1252;

	@ObfuscatedName("client.We")
	public int field1253;

	@ObfuscatedName("client.Xe")
	public int field1254;

	@ObfuscatedName("client.Ze")
	public int field1256;

	@ObfuscatedName("client.ef")
	public int field1261;

	@ObfuscatedName("client.hf")
	public int field1263;

	@ObfuscatedName("client.kf")
	public int field1265;

	@ObfuscatedName("client.mf")
	public int field1267;

	@ObfuscatedName("client.nf")
	public int field1268;

	@ObfuscatedName("client.of")
	public int field1269;

	@ObfuscatedName("client.pf")
	public int field1270;

	@ObfuscatedName("client.qf")
	public int field1271;

	@ObfuscatedName("client.rf")
	public int field1272;

	@ObfuscatedName("client.uf")
	public static int field1275;

	@ObfuscatedName("client.Bf")
	public int field1282;

	@ObfuscatedName("client.Df")
	public int field1284;

	@ObfuscatedName("client.If")
	public int field1289;

	@ObfuscatedName("client.Jf")
	public int field1290;

	@ObfuscatedName("client.Qf")
	public int field1296;

	@ObfuscatedName("client.Rf")
	public int field1297;

	@ObfuscatedName("client.Sf")
	public int field1298;

	@ObfuscatedName("client.bg")
	public int field1306;

	@ObfuscatedName("client.eg")
	public int field1309;

	@ObfuscatedName("client.fg")
	public int field1310;

	@ObfuscatedName("client.gg")
	public int field1311;

	@ObfuscatedName("client.hg")
	public static int field1312;

	@ObfuscatedName("client.jg")
	public static int field1314;

	@ObfuscatedName("client.mg")
	public static int field1317;

	@ObfuscatedName("client.qg")
	public int field1321;

	@ObfuscatedName("client.rg")
	public int field1322;

	@ObfuscatedName("client.tg")
	public int field1323;

	@ObfuscatedName("client.ug")
	public int field1324;

	@ObfuscatedName("client.yg")
	public int field1327;

	@ObfuscatedName("client.Dg")
	public int field1332;

	@ObfuscatedName("client.Eg")
	public int field1333;

	@ObfuscatedName("client.Fg")
	public int field1334;

	@ObfuscatedName("client.Gg")
	public int field1335;

	@ObfuscatedName("client.Hg")
	public int field1336;

	@ObfuscatedName("client.Ig")
	public int field1337;

	@ObfuscatedName("client.Jg")
	public int field1338;

	@ObfuscatedName("client.Lg")
	public static int field1340;

	@ObfuscatedName("client.Mg")
	public int field1341;

	@ObfuscatedName("client.Qg")
	public int field1345;

	@ObfuscatedName("client.Rg")
	public int field1346;

	@ObfuscatedName("client.Sg")
	public int field1347;

	@ObfuscatedName("client.Tg")
	public int field1348;

	@ObfuscatedName("client.Ug")
	public int field1349;

	@ObfuscatedName("client.Yg")
	public int field1353;

	@ObfuscatedName("client.ah")
	public int field1355;

	@ObfuscatedName("client.nh")
	public int field1366;

	@ObfuscatedName("client.ph")
	public static int field1368;

	@ObfuscatedName("client.wh")
	public int field1374;

	@ObfuscatedName("client.yh")
	public int field1376;

	@ObfuscatedName("client.zh")
	public int field1377;

	@ObfuscatedName("client.Ah")
	public int field1378;

	@ObfuscatedName("client.Bh")
	public int field1379;

	@ObfuscatedName("client.Ch")
	public int field1380;

	@ObfuscatedName("client.Hh")
	public int field1383;

	@ObfuscatedName("client.Jh")
	public int field1385;

	@ObfuscatedName("client.Kh")
	public int field1386;

	@ObfuscatedName("client.Lh")
	public int field1387;

	@ObfuscatedName("client.Rh")
	public int field1392;

	@ObfuscatedName("client.fi")
	public int field1405;

	@ObfuscatedName("client.qi")
	public int field1413;

	@ObfuscatedName("client.ri")
	public int field1414;

	@ObfuscatedName("client.si")
	public int field1415;

	@ObfuscatedName("client.ti")
	public int field1416;

	@ObfuscatedName("client.ui")
	public int field1417;

	@ObfuscatedName("client.xi")
	public int field1420;

	@ObfuscatedName("client.Bi")
	public int field1424;

	@ObfuscatedName("client.Ci")
	public int field1425;

	@ObfuscatedName("client.Ei")
	public int field1427;

	@ObfuscatedName("client.Hi")
	public int field1430;

	@ObfuscatedName("client.Ji")
	public int field1432;

	@ObfuscatedName("client.Ki")
	public int field1433;

	@ObfuscatedName("client.Li")
	public int field1434;

	@ObfuscatedName("client.Mi")
	public int field1435;

	@ObfuscatedName("client.Ni")
	public int field1436;

	@ObfuscatedName("client.Zi")
	public int field1447;

	@ObfuscatedName("client.bj")
	public int field1449;

	@ObfuscatedName("client.dj")
	public int field1451;

	@ObfuscatedName("client.Bj")
	public int field1472;

	@ObfuscatedName("client.Ej")
	public int field1475;

	@ObfuscatedName("client.Fj")
	public int field1476;

	@ObfuscatedName("client.Gj")
	public int field1477;

	@ObfuscatedName("client.S")
	public long field1065;

	@ObfuscatedName("client.Kg")
	public long field1339;

	@ObfuscatedName("client.pi")
	public long field1412;

	@ObfuscatedName("client.cj")
	public long field1450;

	@ObfuscatedName("client.Dj")
	public long field1474;

	@ObfuscatedName("client.ji")
	public class18 field1408;

	@ObfuscatedName("client.xd")
	public static class27 field1189;

	@ObfuscatedName("client.qd")
	public class35 field1183;

	@ObfuscatedName("client.me")
	public class35 field1223;

	@ObfuscatedName("client.Nf")
	public class35 field1293;

	@ObfuscatedName("client.Of")
	public class35 field1294;

	@ObfuscatedName("client.Ng")
	public class35 field1342;

	@ObfuscatedName("client.Og")
	public class35 field1343;

	@ObfuscatedName("client.gh")
	public class35 field1359;

	@ObfuscatedName("client.hh")
	public class35 field1360;

	@ObfuscatedName("client.vc")
	public class36 field1140;

	@ObfuscatedName("client.wc")
	public class36 field1141;

	@ObfuscatedName("client.xc")
	public class36 field1142;

	@ObfuscatedName("client.zd")
	public class36 field1191;

	@ObfuscatedName("client.Ad")
	public class36 field1192;

	@ObfuscatedName("client.Bd")
	public class36 field1193;

	@ObfuscatedName("client.pe")
	public class36 field1224;

	@ObfuscatedName("client.qe")
	public class36 field1225;

	@ObfuscatedName("client.re")
	public class36 field1226;

	@ObfuscatedName("client.se")
	public class36 field1227;

	@ObfuscatedName("client.te")
	public class36 field1228;

	@ObfuscatedName("client.Qe")
	public class36 field1247;

	@ObfuscatedName("client.Re")
	public class36 field1248;

	@ObfuscatedName("client.Xf")
	public class36 field1303;

	@ObfuscatedName("client.Yf")
	public class36 field1304;

	@ObfuscatedName("client.qh")
	public class36 field1369;

	@ObfuscatedName("client.rh")
	public class36 field1370;

	@ObfuscatedName("client.sh")
	public class36 field1371;

	@ObfuscatedName("client.th")
	public class36 field1372;

	@ObfuscatedName("client.uh")
	public class36 field1373;

	@ObfuscatedName("client.qj")
	public class37 field1464;

	@ObfuscatedName("client.rj")
	public class37 field1465;

	@ObfuscatedName("client.sj")
	public class37 field1466;

	@ObfuscatedName("client.tj")
	public class37 field1467;

	@ObfuscatedName("client.Cb")
	public class43 field1098;

	@ObfuscatedName("client.Db")
	public class43 field1099;

	@ObfuscatedName("client.Eb")
	public class43 field1100;

	@ObfuscatedName("client.Fb")
	public class43 field1101;

	@ObfuscatedName("client.kh")
	public class43 field1363;

	@ObfuscatedName("client.lh")
	public class43 field1364;

	@ObfuscatedName("client.mh")
	public class43 field1365;

	@ObfuscatedName("client.Qi")
	public class43 field1438;

	@ObfuscatedName("client.Ri")
	public class43 field1439;

	@ObfuscatedName("client.Si")
	public class43 field1440;

	@ObfuscatedName("client.Ti")
	public class43 field1441;

	@ObfuscatedName("client.Ui")
	public class43 field1442;

	@ObfuscatedName("client.Vi")
	public class43 field1443;

	@ObfuscatedName("client.Wi")
	public class43 field1444;

	@ObfuscatedName("client.Xi")
	public class43 field1445;

	@ObfuscatedName("client.Yi")
	public class43 field1446;

	@ObfuscatedName("client.fj")
	public class43 field1453;

	@ObfuscatedName("client.gj")
	public class43 field1454;

	@ObfuscatedName("client.hj")
	public class43 field1455;

	@ObfuscatedName("client.ij")
	public class43 field1456;

	@ObfuscatedName("client.jj")
	public class43 field1457;

	@ObfuscatedName("client.kj")
	public class43 field1458;

	@ObfuscatedName("client.lj")
	public class43 field1459;

	@ObfuscatedName("client.mj")
	public class43 field1460;

	@ObfuscatedName("client.nj")
	public class43 field1461;

	@ObfuscatedName("client.Bg")
	public class47 field1330;

	@ObfuscatedName("client.ke")
	public class49 field1221;

	@ObfuscatedName("client.Yb")
	public class50 field1119;

	@ObfuscatedName("client.Kj")
	public class58 field1481;

	@ObfuscatedName("client.oj")
	public String field1462;

	@ObfuscatedName("client.Hj")
	public String field1478;

	@ObfuscatedName("client.Jj")
	public String field1480;

	@ObfuscatedName("client.dg")
	public Socket field1308;

	@ObfuscatedName("client.Tf")
	public static boolean field1299;

	@ObfuscatedName("client.Uf")
	public static boolean field1300;

	@ObfuscatedName("client.lg")
	public static boolean field1316;

	@ObfuscatedName("client.Cc")
	public int[] field1147;

	@ObfuscatedName("client.Dc")
	public int[] field1148;

	@ObfuscatedName("client.Ec")
	public int[] field1149;

	@ObfuscatedName("client.Nd")
	public int[] field1203;

	@ObfuscatedName("client.Od")
	public int[] field1204;

	@ObfuscatedName("client.Pd")
	public int[] field1205;

	@ObfuscatedName("client.Qd")
	public int[] field1206;

	@ObfuscatedName("client.sf")
	public int[] field1273;

	@ObfuscatedName("client.tf")
	public int[] field1274;

	@ObfuscatedName("client.ki")
	public int[] field1409;

	@ObfuscatedName("client.li")
	public int[] field1410;

	@ObfuscatedName("client.mi")
	public int[] field1411;

	@ObfuscatedName("client.fh")
	public class36[] field1358;

	@ObfuscatedName("client.yc")
	public byte[][] field1143;

	@ObfuscatedName("client.sd")
	public byte[][] field1184;

	@ObfuscatedName("client.cd")
	public int[][][] field1170;

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
			if (field1316 && field1122 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field1408.method76(arg2, arg0, arg4);
			}

			if (arg1 == 1) {
				var8 = field1408.method77(arg2, arg4, arg0);
			}

			if (arg1 == 2) {
				var8 = field1408.method78(arg2, arg0, arg4);
			}

			if (arg1 == 3) {
				var8 = field1408.method79(arg2, arg0, arg4);
			}

			if (var8 != 0) {
				int var12 = field1408.method80(arg2, arg0, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field1408.method67(arg0, arg4, arg2);
					class57 var16 = class57.method330(var13);
					if (var16.field837) {
						field1176[arg2].method364(arg0, var16.field838, var14, arg4, var15);
					}
				}

				if (arg1 == 1) {
					field1408.method68(arg4, arg2, arg0);
				}

				if (arg1 == 2) {
					field1408.method69(arg4, arg2, arg0);
					class57 var17 = class57.method330(var13);
					if (var17.field835 + arg0 > 103 || var17.field835 + arg4 > 103 || var17.field836 + arg0 > 103 || var17.field836 + arg4 > 103) {
						return;
					}

					if (var17.field837) {
						field1176[arg2].method365(var17.field838, var15, arg0, arg4, var17.field836, var17.field835);
					}
				}

				if (arg1 == 3) {
					field1408.method70(arg4, arg2, arg0);
					class57 var18 = class57.method330(var13);
					if (var18.field837 && var18.field839) {
						field1176[arg2].method367(arg4, arg0);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field1135[1][arg0][arg4] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				class3.method31(var19, arg2, arg3, field1170, field1176[arg2], arg6, arg4, field1408, arg0, arg5);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method430(int arg0) {
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

	@ObfuscatedName("client.a(ILgc;III)V")
	public final void method431(int arg0, class59 arg1, int arg2, int arg3) {
		if (field1265 < 400) {
			if (arg1.field905 != null) {
				arg1 = arg1.method345();
			}

			if (arg1 != null) {
				String var5 = arg1.field880;
				if (arg1.field897 != 0) {
					var5 = var5 + method553(arg1.field897, field1189.field422) + " (level-" + arg1.field897 + ")";
				}

				if (field1088 == 1) {
					field1318[field1265] = "Use " + field1092 + " with @yel@" + var5;
					field1108[field1265] = 829;
					field1109[field1265] = arg2;
					field1106[field1265] = arg0;
					field1107[field1265] = arg3;
					field1265++;
				} else if (field1475 != 1) {
					if (arg1.field892 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field892[var6] != null && !arg1.field892[var6].equalsIgnoreCase("attack")) {
								field1318[field1265] = arg1.field892[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field1108[field1265] = 242;
								}

								if (var6 == 1) {
									field1108[field1265] = 209;
								}

								if (var6 == 2) {
									field1108[field1265] = 309;
								}

								if (var6 == 3) {
									field1108[field1265] = 852;
								}

								if (var6 == 4) {
									field1108[field1265] = 793;
								}

								field1109[field1265] = arg2;
								field1106[field1265] = arg0;
								field1107[field1265] = arg3;
								field1265++;
							}
						}
					}

					if (arg1.field892 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field892[var7] != null && arg1.field892[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field897 > field1189.field422) {
									var8 = 2000;
								}

								field1318[field1265] = arg1.field892[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field1108[field1265] = var8 + 242;
								}

								if (var7 == 1) {
									field1108[field1265] = var8 + 209;
								}

								if (var7 == 2) {
									field1108[field1265] = var8 + 309;
								}

								if (var7 == 3) {
									field1108[field1265] = var8 + 852;
								}

								if (var7 == 4) {
									field1108[field1265] = var8 + 793;
								}

								field1109[field1265] = arg2;
								field1106[field1265] = arg0;
								field1107[field1265] = arg3;
								field1265++;
							}
						}
					}

					field1318[field1265] = "Examine @yel@" + var5;
					field1108[field1265] = 1714;
					field1109[field1265] = arg2;
					field1106[field1265] = arg0;
					field1107[field1265] = arg3;
					field1265++;
				} else if ((field1477 & 0x2) == 2) {
					field1318[field1265] = field1478 + " @yel@" + var5;
					field1108[field1265] = 240;
					field1109[field1265] = arg2;
					field1106[field1265] = arg0;
					field1107[field1265] = arg3;
					field1265++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1078 != null) {
				field1078.method38();
			}
		} catch (Exception var1) {
		}

		field1078 = null;
		method462();

		if (field1481 != null) {
			field1481.field868 = false;
		}

		field1481 = null;
		field1330.method271();
		field1330 = null;
		field1407 = null;
		field1200 = null;
		field1229 = null;
		field1147 = null;
		field1184 = null;
		field1143 = null;
		field1148 = null;
		field1149 = null;
		field1170 = null;
		field1135 = null;
		field1408 = null;
		field1176 = null;
		field1260 = null;
		field1463 = null;
		field1350 = null;
		field1351 = null;
		field1156 = null;
		field1098 = null;
		field1099 = null;
		field1100 = null;
		field1101 = null;
		field1363 = null;
		field1364 = null;
		field1365 = null;
		field1438 = null;
		field1439 = null;
		field1440 = null;
		field1441 = null;
		field1442 = null;
		field1443 = null;
		field1444 = null;
		field1445 = null;
		field1446 = null;
		field1140 = null;
		field1141 = null;
		field1142 = null;
		field1191 = null;
		field1192 = null;
		field1193 = null;
		field1470 = null;
		field1224 = null;
		field1225 = null;
		field1226 = null;
		field1227 = null;
		field1228 = null;
		field1369 = null;
		field1370 = null;
		field1371 = null;
		field1372 = null;
		field1373 = null;
		field1223 = null;
		field1199 = null;
		field1421 = null;
		field1185 = null;
		field1129 = null;
		field1130 = null;
		field1131 = null;
		field1132 = null;
		field1086 = null;
		field1287 = null;
		field1354 = null;
		field1281 = null;
		field1283 = null;
		field1285 = null;
		field1286 = null;
		field1152 = null;
		field1471 = null;
		field1473 = null;
		field1117 = null;
		field1190 = null;
		field1161 = null;
		field1402 = null;
		field1106 = null;
		field1107 = null;
		field1108 = null;
		field1109 = null;
		field1318 = null;
		field1202 = null;
		field1291 = null;
		field1292 = null;
		field1243 = null;
		field1183 = null;
		field1419 = null;
		field1244 = null;
		field1178 = null;
		field1456 = null;
		field1457 = null;
		field1453 = null;
		field1454 = null;
		field1455 = null;
		field1458 = null;
		field1459 = null;
		field1460 = null;
		field1461 = null;
		method440();
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

	@ObfuscatedName("client.f(I)V")
	public final void method432() {
		if (field1265 >= 2 || field1088 != 0 || field1475 != 0) {
			String var1;
			if (field1088 == 1 && field1265 < 2) {
				var1 = "Use " + field1092 + " with...";
			} else if (field1475 == 1 && field1265 < 2) {
				var1 = field1478 + "...";
			} else {
				var1 = field1318[field1265 - 1];
			}

			if (field1265 > 2) {
				var1 = var1 + "@whi@ / " + (field1265 - 2) + " more options";
			}

			field1466.method211(field1217 / 1000, 0xFFFFFF, 15, var1, 4, true);
		}
	}

	@ObfuscatedName("client.a(Ld;BI)I")
	public final int method433(class4 arg0, int arg1) {
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
					var8 = field1067[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1238[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1218[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field909 && (!class60.method348(var11).field930 || field1315)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1202[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1305[field1238[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1202[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1189.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1012; var13++) {
						if (class67.field1014[var13]) {
							var8 += field1238[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field909 && (!class60.method348(var15).field930 || field1315)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1374;
				}

				if (var7 == 12) {
					var8 = field1355;
				}

				if (var7 == 13) {
					int var17 = field1202[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1030[var19];
					int var21 = var20.field1032;
					int var22 = var20.field1033;
					int var23 = var20.field1034;
					int var24 = field1166[var23 - var22];
					var8 = field1202[var21] >> var22 & var24;
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
					var8 = (field1189.field360 >> 7) + field1267;
				}

				if (var7 == 19) {
					var8 = (field1189.field361 >> 7) + field1268;
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

	@ObfuscatedName("client.a(Llb;II)V")
	public final void method434(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1284; var3++) {
			int var4 = field1285[var3];
			class26 var5 = field1471[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method229();
				int var8 = arg0.method229();
				var5.method114(var8, field1217, var7);
				var5.field379 = field1217 + 300;
				var5.field380 = arg0.method229();
				var5.field381 = arg0.method229();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg0.method231();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field388 == var9) {
					var5.field392 = 0;
				}

				int var10 = arg0.method229();
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
				var5.field382 = arg0.method231();
				if (var5.field382 == 0xFFFF) {
					var5.field382 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field372 = arg0.method236();
				var5.field373 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.method229();
				int var13 = arg0.method229();
				var5.method114(var13, field1217, var12);
				var5.field379 = field1217 + 300;
				var5.field380 = arg0.method229();
				var5.field381 = arg0.method229();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class59.method341(arg0.method231());
				var5.field364 = var5.field415.field882;
				var5.field408 = var5.field415.field904;
				var5.field367 = var5.field415.field886;
				var5.field368 = var5.field415.field887;
				var5.field369 = var5.field415.field888;
				var5.field370 = var5.field415.field889;
				var5.field365 = var5.field415.field885;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg0.method231();
				int var14 = arg0.method234();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1217;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1217) {
					var5.field394 = -1;
				}

				if (var5.field393 == 0xFFFF) {
					var5.field393 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field383 = arg0.method231();
				var5.field384 = arg0.method231();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method435(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1424; var2++) {
			if (arg0.equalsIgnoreCase(field1419[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1189.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method436(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1318[field1265] = "Remove @whi@" + arg0.field97;
				field1108[field1265] = 884;
				field1265++;
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

		field1318[field1265] = "Remove @whi@" + field1419[var2];
		field1108[field1265] = 513;
		field1265++;
		field1318[field1265] = "Message @whi@" + field1419[var2];
		field1108[field1265] = 902;
		field1265++;
		return true;
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method437(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.g(I)V")
	public final void method438() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1468) {
			field1172 = false;
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

		if (field1083) {
			field1172 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1448) {
			field1172 = false;
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

	@ObfuscatedName("client.h(I)V")
	public final void method439() {
		if (field1309 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1309 = 3;
				field1105 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1167 = "";
				field1168 = "Enter your username & password.";
				field1309 = 2;
				field1105 = 0;
			}
		} else if (field1309 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1105 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1105 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1353 = 0;
				method490(field1144, field1145, false);

				if (field1214) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1309 = 0;
				field1144 = "";
				field1145 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1429.length(); var10++) {
					if (var8 == field1429.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1105 == 0) {
					if (var8 == 8 && field1144.length() > 0) {
						field1144 = field1144.substring(0, field1144.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1105 = 1;
					}

					if (var9) {
						field1144 = field1144 + (char) var8;
					}

					if (field1144.length() > 12) {
						field1144 = field1144.substring(0, 12);
					}
				} else if (field1105 == 1) {
					if (var8 == 8 && field1145.length() > 0) {
						field1145 = field1145.substring(0, field1145.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1105 = 0;
					}

					if (var9) {
						field1145 = field1145 + (char) var8;
					}

					if (field1145.length() > 20) {
						field1145 = field1145.substring(0, 20);
					}
				}
			}
		} else if (field1309 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1309 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method440() {
		field1172 = false;
		while (field1319) {
			field1172 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1303 = null;
		field1304 = null;
		field1358 = null;
		field1203 = null;
		field1204 = null;
		field1205 = null;
		field1206 = null;
		field1094 = null;
		field1095 = null;
		field1273 = null;
		field1274 = null;
		field1293 = null;
		field1294 = null;
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method441(long arg0) {
		if (arg0 != 0L) {
			if (field1180 >= 100) {
				method559(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1180; var4++) {
					if (field1391[var4] == arg0) {
						method559(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1424; var5++) {
					if (field1244[var5] == arg0) {
						method559(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1391[field1180++] = arg0;
				field1201 = true;
				field1407.method218(158);
				field1407.method225(arg0);
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method442() {
		class57.field865.method103();
		class57.field866.method103();
		class59.field908.method103();
		class60.field955.method103();
		class60.field956.method103();
		class27.field440.method103();
		class68.field1028.method103();
	}

	@ObfuscatedName("client.a(Ljb;I)V")
	public final void method443(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1094.length; var3++) {
			field1094[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1094[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1095[var9] = (field1094[var9 - 1] + field1094[var9 + 1] + field1094[var9 - 128] + field1094[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1094;
			field1094 = field1095;
			field1095 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1094[var16] = 0;
					}
				}
			}
		}
	}

	public final void run() {
		if (field1277) {
			method540();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method444() {
		if (field1316 && field1323 == 2 && class3.field33 != field1122) {
			field1100.method258();
			field1465.method202("Loading - please wait.", 151, 0, 257);
			field1465.method202("Loading - please wait.", 150, 0xFFFFFF, 256);
			field1100.method259(field9, 4, 4);
			field1323 = 1;
			field1412 = System.currentTimeMillis();
		}

		if (field1323 == 1) {
			int var1 = method445();
			if (var1 != 0 && System.currentTimeMillis() - field1412 > 360000L) {
				signlink.reporterror(field1144 + " glcfb " + field1474 + "," + var1 + "," + field1316 + "," + field1070[0] + "," + field1330.method280() + "," + field1122 + "," + field1084 + "," + field1085);
				field1412 = System.currentTimeMillis();
			}
		}

		if (field1323 == 2 && field1331 != field1122) {
			field1331 = field1122;
			method543(field1122);
		}
	}

	@ObfuscatedName("client.k(I)I")
	public final int method445() {
		for (int var1 = 0; var1 < field1184.length; var1++) {
			if (field1184[var1] == null && field1148[var1] != -1) {
				return -1;
			}

			if (field1143[var1] == null && field1149[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1184.length; var3++) {
			byte[] var4 = field1143[var3];
			if (var4 != null) {
				int var5 = (field1147[var3] >> 8) * 64 - field1267;
				int var6 = (field1147[var3] & 0xFF) * 64 - field1268;
				var2 &= class3.method16(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1234) {
			return -4;
		} else {
			field1323 = 2;
			class3.field33 = field1122;
			method476();
			field1407.method218(81);
			return 0;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method446() {
		if (field1332 != 0) {
			class37 var1 = field1465;
			int var2 = 0;
			if (field1338 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1160[var3] != null) {
					int var4 = field1158[var3];
					String var5 = field1159[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1449 == 0 || field1449 == 1 && method435(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method206("From", var8, 0, var7);
						var1.method206("From", var8, 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method204("From ");
						if (var6 == 1) {
							field1278[0].method199(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1278[1].method199(var11, var7 - 12);
							var11 += 14;
						}

						var1.method206(var5 + ": " + field1160[var3], var11, 0, var7);
						var1.method206(var5 + ": " + field1160[var3], var11, 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1449 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method206(field1160[var3], 4, 0, var9);
						var1.method206(field1160[var3], 4, 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1449 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method206("To " + var5 + ": " + field1160[var3], 4, 0, var10);
						var1.method206("To " + var5 + ": " + field1160[var3], 4, 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method447() {
		if (field1453 == null) {
			field10 = null;
			field1101 = null;
			field1099 = null;
			field1098 = null;
			field1100 = null;
			field1363 = null;
			field1364 = null;
			field1365 = null;
			field1456 = new class43(method11(), 265, 128);
			class33.method155();
			field1457 = new class43(method11(), 265, 128);
			class33.method155();
			field1453 = new class43(method11(), 171, 509);
			class33.method155();
			field1454 = new class43(method11(), 132, 360);
			class33.method155();
			field1455 = new class43(method11(), 200, 360);
			class33.method155();
			field1458 = new class43(method11(), 238, 202);
			class33.method155();
			field1459 = new class43(method11(), 238, 203);
			class33.method155();
			field1460 = new class43(method11(), 94, 74);
			class33.method155();
			field1461 = new class43(method11(), 94, 75);
			class33.method155();

			if (field1119 != null) {
				method552();
				method522();
			}

			field1241 = true;
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method448() {
		field1101.method258();
		class34.field584 = field1409;
		field1142.method199(0, 0);

		if (field1431) {
			field1466.method202(field1344, 40, 0, 239);
			field1466.method202(field1077 + "*", 60, 128, 239);
		} else if (field1064) {
			field1466.method202("Enter amount:", 40, 0, 239);
			field1466.method202(field1258 + "*", 60, 128, 239);
		} else if (field1480 != null) {
			field1466.method202(field1480, 40, 0, 239);
			field1466.method202("Click to continue", 60, 128, 239);
		} else if (field1071 != -1) {
			method546(0, 0, 0, class4.field56[field1071]);
		} else if (field1428 == -1) {
			class37 var1 = field1465;
			int var2 = 0;
			class33.method154(0, 463, 0, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1160[var3] != null) {
					int var4 = field1158[var3];
					int var5 = field1062 + 70 - var2 * 14;
					String var6 = field1159[var3];
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
							var1.method206(field1160[var3], 4, 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1069 == 0 || field1069 == 1 && method435(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1278[0].method199(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1278[1].method199(var8, var5 - 12);
								var8 += 14;
							}

							var1.method206(var6 + ":", var8, 0, var5);
							var8 += var1.method204(var6) + 8;
							var1.method206(field1160[var3], var8, 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1332 == 0 && (var4 == 7 || field1449 == 0 || field1449 == 1 && method435(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method206("From", var9, 0, var5);
							int var11 = var9 + var1.method204("From ");
							if (var7 == 1) {
								field1278[0].method199(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1278[1].method199(var11, var5 - 12);
								var11 += 14;
							}

							var1.method206(var6 + ":", var11, 0, var5);
							var11 += var1.method204(var6) + 8;
							var1.method206(field1160[var3], var11, 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field1216 == 0 || field1216 == 1 && method435(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1160[var3], 4, 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field1332 == 0 && field1449 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(field1160[var3], 4, 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field1332 == 0 && field1449 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206("To " + var6 + ":", 4, 0, var5);
							var1.method206(field1160[var3], var1.method204("To " + var6) + 12, 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field1216 == 0 || field1216 == 1 && method435(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1160[var3], 4, 0x7E3200, var5);
						}

						var2++;
					}
				}
			}

			class33.method153();
			field1155 = var2 * 14 + 7;
			if (field1155 < 78) {
				field1155 = 78;
			}

			method537(463, field1155, field1155 - field1062 - 77, 0, 77);
			String var10;
			if (field1189 == null || field1189.field416 == null) {
				var10 = class51.method304(field1144);
			} else {
				var10 = field1189.field416;
			}

			var1.method206(var10 + ":", 4, 0, 90);
			var1.method206(field1171 + "*", var1.method204(var10 + ": ") + 6, 255, 90);
			class33.method160(77, 0, 0, 479);
		} else {
			method546(0, 0, 0, class4.field56[field1428]);
		}

		if (field1389 && field1333 == 2) {
			method557();
		}

		field1101.method259(field9, 17, 357);
		field1100.method258();
		class34.field584 = field1411;
	}

	@ObfuscatedName("client.a(Lnb;I)V")
	public final void method449(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field639 == 0) {
			var2 = field1408.method76(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 1) {
			var2 = field1408.method77(arg0.field638, arg0.field641, arg0.field640);
		}

		if (arg0.field639 == 2) {
			var2 = field1408.method78(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 3) {
			var2 = field1408.method79(arg0.field638, arg0.field640, arg0.field641);
		}

		if (var2 != 0) {
			int var6 = field1408.method80(arg0.field638, arg0.field640, arg0.field641, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field642 = var3;
		arg0.field644 = var4;
		arg0.field643 = var5;
	}

	@ObfuscatedName("client.a(IBLlb;)V")
	public final void method450(int arg0, class38 arg1) {
		field1151 = 0;
		field1284 = 0;
		method521(arg0, arg1);
		method494(arg0, arg1);
		method434(arg1, arg0);

		for (int var3 = 0; var3 < field1151; var3++) {
			int var4 = field1152[var3];
			if (field1217 != field1471[var4].field405) {
				field1471[var4].field415 = null;
				field1471[var4] = null;
			}
		}

		if (arg1.field621 != arg0) {
			signlink.reporterror(field1144 + " size mismatch in getnpcpos - pos:" + arg1.field621 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1472; var5++) {
			if (field1471[field1473[var5]] == null) {
				signlink.reporterror(field1144 + " null entry in npc list - pos:" + var5 + " size:" + field1472);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)V")
	public final void method451(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1425 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1425 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1425 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1424;
				if (field1425 != 2) {
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
					arg0.field97 = field1419[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1424;
			if (field1425 != 2) {
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
				if (field1178[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1178[var2] == field1313) {
					arg0.field97 = "@gre@World-" + (field1178[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1178[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1424;
			if (field1425 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1425 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1425 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1180;
				if (field1425 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method304(class51.method301(field1391[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1180 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1217 / 40.0D) * 256.0D) & 0x7FF;

			if (field1219) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1426[var7];
					if (var8 >= 0 && !class64.field978[var8].method377()) {
						return;
					}
				}

				field1219 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1426[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field978[var12].method378();
					}
				}

				class31 var13 = new class31(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1352[var14] != 0) {
						var13.method140(field1163[var14][0], field1163[var14][field1352[var14]]);

						if (var14 == 1) {
							var13.method140(field1237[0], field1237[field1352[var14]]);
						}
					}
				}

				var13.method133();
				var13.method134(class66.field996[field1189.field365].field998[0]);
				var13.method143(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field1359 == null) {
				field1359 = arg0.field103;
				field1360 = arg0.field104;
			}

			if (field1362) {
				arg0.field103 = field1360;
			} else {
				arg0.field103 = field1359;
			}
		} else if (var2 == 325) {
			if (field1359 == null) {
				field1359 = arg0.field103;
				field1360 = arg0.field104;
			}

			if (field1362) {
				arg0.field103 = field1359;
			} else {
				arg0.field103 = field1360;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1259;
			if (field1217 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1157 < 1) {
				arg0.field97 = "";
			} else if (field1437) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1430 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1187 == 0) {
					var15 = "earlier today";
				} else if (field1187 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1187 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1195 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1195 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1195 > 1) {
				arg0.field97 = field1195 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1383 == 201) {
				if (field1082 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1383 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1383 == 0) {
					var16 = "Earlier today";
				} else if (field1383 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1383 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1383 == 201) {
				if (field1082 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1383 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1383 == 201) {
				if (field1082 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1383 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(ILib;II)V")
	public final void method452(int arg0, class35 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1451 + field1385 & 0x7FF;
			int var6 = class31.field550[var5];
			int var7 = class31.field551[var5];
			var6 = var6 * 256 / (field1174 + 256);
			var7 = var7 * 256 / (field1174 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1136.method191(15, 15, 20, 83 - var13 - 20, var12 + 94 + 4 - 10, var10, 256, 20);
		} else {
			method469(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method7() {
		if (!field1448 && !field1468 && !field1083) {
			field1217++;

			if (field1214) {
				method486();
			} else {
				method439();
			}

			method547();
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method453() {
		field1392 = 0;
		for (int var1 = -1; var1 < field1472 + field1282; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1189;
			} else if (var1 < field1282) {
				var2 = field1281[field1283[var1]];
			} else {
				var2 = field1471[field1473[var1 - field1282]];
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

				if (var1 >= field1282) {
					class59 var7 = ((class26) var2).field415;
					if (var7.field903 >= 0 && var7.field903 < field1421.length) {
						method478(var2, var2.field406 + 15);

						if (field1381 > -1) {
							field1421[var7.field903].method186(field1381 - 12, field1382 - 30);
						}
					}

					if (field1447 == 1 && field1473[var1 - field1282] == field1102 && field1217 % 20 < 10) {
						method478(var2, var2.field406 + 15);

						if (field1381 > -1) {
							field1421[2].method186(field1381 - 12, field1382 - 28);
						}
					}
				} else {
					int var4 = 30;
					class27 var5 = (class27) var2;
					if (var5.field419 != 0) {
						method478(var2, var2.field406 + 15);

						if (field1381 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field419 & 1 << var6) != 0) {
									field1421[var6].method186(field1381 - 12, field1382 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1447 == 10 && field1283[var1] == field1139) {
						method478(var2, var2.field406 + 15);

						if (field1381 > -1) {
							field1421[7].method186(field1381 - 12, field1382 - var4);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1282 || field1069 == 0 || field1069 == 3 || field1069 == 1 && method435(((class27) var2).field416))) {
					method478(var2, var2.field406);

					if (field1381 > -1 && field1392 < field1393) {
						field1397[field1392] = field1466.method205(var2.field372) / 2;
						field1396[field1392] = field1466.field617;
						field1394[field1392] = field1381;
						field1395[field1392] = field1382;
						field1398[field1392] = var2.field374;
						field1399[field1392] = var2.field375;
						field1400[field1392] = var2.field373;
						field1401[field1392++] = var2.field372;

						if (field1246 == 0 && var2.field375 >= 1 && var2.field375 <= 3) {
							field1396[field1392] += 10;
							field1395[field1392] += 5;
						}

						if (field1246 == 0 && var2.field375 == 4) {
							field1397[field1392] = 60;
						}

						if (field1246 == 0 && var2.field375 == 5) {
							field1396[field1392] += 5;
						}
					}
				}

				if (var2.field379 > field1217) {
					method478(var2, var2.field406 + 15);

					if (field1381 > -1) {
						int var8 = var2.field380 * 30 / var2.field381;
						if (var8 > 30) {
							var8 = 30;
						}

						class33.method157(field1382 - 3, 5, 0xFF00, var8, field1381 - 15);
						class33.method157(field1382 - 3, 5, 0xFF0000, 30 - var8, field1381 - 15 + var8);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field378[var9] > field1217) {
						method478(var2, var2.field406 / 2);

						if (field1381 > -1) {
							if (var9 == 1) {
								field1382 -= 20;
							}

							if (var9 == 2) {
								field1381 -= 15;
								field1382 -= 10;
							}

							if (var9 == 3) {
								field1381 += 15;
								field1382 -= 10;
							}

							field1199[var2.field377[var9]].method186(field1381 - 12, field1382 - 12);
							field1464.method202(String.valueOf(var2.field376[var9]), field1382 + 4, 0, field1381);
							field1464.method202(String.valueOf(var2.field376[var9]), field1382 + 3, 0xFFFFFF, field1381 - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field1392; var10++) {
			int var11 = field1394[var10];
			int var12 = field1395[var10];
			int var13 = field1397[var10];
			int var14 = field1396[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field1395[var16] - field1396[var16] && var12 - var14 < field1395[var16] + 2 && var11 - var13 < field1397[var16] + field1394[var16] && var11 + var13 > field1394[var16] - field1397[var16] && field1395[var16] - field1396[var16] < var12) {
						var12 = field1395[var16] - field1396[var16];
						var15 = true;
					}
				}
			}

			field1381 = field1394[var10];
			field1382 = field1395[var10] = var12;
			String var17 = field1401[var10];
			if (field1246 == 0) {
				int var18 = 0xFFFF00;
				if (field1398[var10] < 6) {
					var18 = field1134[field1398[var10]];
				}

				if (field1398[var10] == 6) {
					var18 = field1256 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1398[var10] == 7) {
					var18 = field1256 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1398[var10] == 8) {
					var18 = field1256 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1398[var10] == 9) {
					int var19 = 150 - field1400[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field1398[var10] == 10) {
					int var20 = 150 - field1400[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field1398[var10] == 11) {
					int var21 = 150 - field1400[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field1399[var10] == 0) {
					field1466.method202(var17, field1382 + 1, 0, field1381);
					field1466.method202(var17, field1382, var18, field1381);
				}

				if (field1399[var10] == 1) {
					field1466.method207(field1256, 0, field1382 + 1, field1381, var17);
					field1466.method207(field1256, var18, field1382, field1381, var17);
				}

				if (field1399[var10] == 2) {
					field1466.method208(0, field1256, var17, field1382 + 1, field1381);
					field1466.method208(var18, field1256, var17, field1382, field1381);
				}

				if (field1399[var10] == 3) {
					field1466.method209(var17, 150 - field1400[var10], 0, field1382 + 1, field1256, field1381);
					field1466.method209(var17, 150 - field1400[var10], var18, field1382, field1256, field1381);
				}

				if (field1399[var10] == 4) {
					int var22 = field1466.method205(var17);
					int var23 = (150 - field1400[var10]) * (var22 + 100) / 150;
					class33.method154(field1381 - 50, field1381 + 50, 0, 334);
					field1466.method206(var17, field1381 + 50 - var23, 0, field1382 + 1);
					field1466.method206(var17, field1381 + 50 - var23, var18, field1382);
					class33.method153();
				}

				if (field1399[var10] == 5) {
					int var24 = 150 - field1400[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					class33.method154(0, 512, field1382 - field1466.field617 - 1, field1382 + 5);
					field1466.method202(var17, field1382 + var25 + 1, 0, field1381);
					field1466.method202(var17, field1382 + var25, var18, field1381);
					class33.method153();
				}
			} else {
				field1466.method202(var17, field1382 + 1, 0, field1381);
				field1466.method202(var17, field1382, 0xFFFF00, field1381);
			}
		}
	}

	@ObfuscatedName("client.a(IILab;IZ)V")
	public final void method454(int arg0, int arg1, class27 arg2, int arg3) {
		if (field1189 != arg2 && field1265 < 400) {
			String var5;
			if (arg2.field423 == 0) {
				var5 = arg2.field416 + method553(arg2.field422, field1189.field422) + " (level-" + arg2.field422 + ")";
			} else {
				var5 = arg2.field416 + " (skill-" + arg2.field423 + ")";
			}

			if (field1088 == 1) {
				field1318[field1265] = "Use " + field1092 + " with @whi@" + var5;
				field1108[field1265] = 275;
				field1109[field1265] = arg3;
				field1106[field1265] = arg0;
				field1107[field1265] = arg1;
				field1265++;
			} else if (field1475 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1153[var6] != null) {
						field1318[field1265] = field1153[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1153[var6].equalsIgnoreCase("attack")) {
							if (arg2.field422 > field1189.field422) {
								var7 = 2000;
							}

							if (field1189.field439 != 0 && arg2.field439 != 0) {
								if (field1189.field439 == arg2.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1154[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1108[field1265] = var7 + 639;
						}

						if (var6 == 1) {
							field1108[field1265] = var7 + 499;
						}

						if (var6 == 2) {
							field1108[field1265] = var7 + 27;
						}

						if (var6 == 3) {
							field1108[field1265] = var7 + 387;
						}

						if (var6 == 4) {
							field1108[field1265] = var7 + 185;
						}

						field1109[field1265] = arg3;
						field1106[field1265] = arg0;
						field1107[field1265] = arg1;
						field1265++;
					}
				}
			} else if ((field1477 & 0x8) == 8) {
				field1318[field1265] = field1478 + " @whi@" + var5;
				field1108[field1265] = 131;
				field1109[field1265] = arg3;
				field1106[field1265] = arg0;
				field1107[field1265] = arg1;
				field1265++;
			}

			for (int var8 = 0; var8 < field1265; var8++) {
				if (field1108[var8] == 718) {
					field1318[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method455() {
		field1098.method258();
		class34.field584 = field1410;
		field1140.method199(0, 0);

		if (field1356 != -1) {
			method546(0, 0, 0, class4.field56[field1356]);
		} else if (field1295[field1288] != -1) {
			method546(0, 0, 0, class4.field56[field1295[field1288]]);
		}

		if (field1389 && field1333 == 1) {
			method557();
		}

		field1098.method259(field9, 553, 205);
		field1100.method258();
		class34.field584 = field1411;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method456() {
		field1099.method258();

		if (field1298 == 2) {
			byte[] var1 = field1141.field603;
			int[] var2 = class33.field563;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1223.method190(0, 33, 25, 33, field1385, field1479, field1361, 256, 0, 25);
			field1100.method258();
		} else {
			int var5 = field1451 + field1385 & 0x7FF;
			int var6 = field1189.field360 / 32 + 48;
			int var7 = 464 - field1189.field361 / 32;
			field1183.method190(5, 151, var6, 146, var5, field1087, field1266, field1174 + 256, 25, var7);
			field1223.method190(0, 33, 25, 33, field1385, field1479, field1361, 256, 0, 25);

			for (int var8 = 0; var8 < field1290; var8++) {
				int var9 = field1291[var8] * 4 + 2 - field1189.field360 / 32;
				int var10 = field1292[var8] * 4 + 2 - field1189.field361 / 32;
				method469(field1243[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1117[field1122][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1189.field360 / 32;
						int var15 = var12 * 4 + 2 - field1189.field361 / 32;
						method469(field1129, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field1472; var16++) {
				class26 var17 = field1471[field1473[var16]];
				if (var17 != null && var17.method113()) {
					class59 var18 = var17.field415;
					if (var18.field905 != null) {
						var18 = var18.method345();
					}

					if (var18 != null && var18.field896) {
						int var19 = var17.field360 / 32 - field1189.field360 / 32;
						int var20 = var17.field361 / 32 - field1189.field361 / 32;
						method469(field1130, var19, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field1282; var21++) {
				class27 var22 = field1281[field1283[var21]];
				if (var22 != null && var22.method113()) {
					int var23 = var22.field360 / 32 - field1189.field360 / 32;
					int var24 = var22.field361 / 32 - field1189.field361 / 32;
					boolean var25 = false;
					long var26 = class51.method300(var22.field416);
					for (int var28 = 0; var28 < field1424; var28++) {
						if (field1244[var28] == var26 && field1178[var28] != 0) {
							var25 = true;
							break;
						}
					}

					if (field1189.field439 != 0 && var22.field439 != 0) {
						if (field1189.field439 == var22.field439) {
							var25 = true;
						} else {
							var25 = false;
						}
					}

					if (var25) {
						method469(field1132, var23, var24);
					} else {
						method469(field1131, var23, var24);
					}
				}
			}

			if (field1447 != 0 && field1217 % 20 < 10) {
				if (field1447 == 1 && field1102 >= 0 && field1102 < field1471.length) {
					class26 var29 = field1471[field1102];
					if (var29 != null) {
						int var30 = var29.field360 / 32 - field1189.field360 / 32;
						int var31 = var29.field361 / 32 - field1189.field361 / 32;
						method452(var31, field1343, var30);
					}
				}

				if (field1447 == 2) {
					int var32 = (field1110 - field1267) * 4 + 2 - field1189.field360 / 32;
					int var33 = (field1111 - field1268) * 4 + 2 - field1189.field361 / 32;
					method452(var33, field1343, var32);
				}

				if (field1447 == 10 && field1139 >= 0 && field1139 < field1281.length) {
					class27 var34 = field1281[field1139];
					if (var34 != null) {
						int var35 = var34.field360 / 32 - field1189.field360 / 32;
						int var36 = var34.field361 / 32 - field1189.field361 / 32;
						method452(var36, field1343, var35);
					}
				}
			}

			if (field1181 != 0) {
				int var37 = field1181 * 4 + 2 - field1189.field360 / 32;
				int var38 = field1182 * 4 + 2 - field1189.field361 / 32;
				method469(field1342, var37, var38);
			}

			class33.method157(78, 3, 0xFFFFFF, 3, 97);
			field1100.method258();
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method457() {
		for (class32 var1 = (class32) field1402.method248(); var1 != null; var1 = (class32) field1402.method250()) {
			if (field1122 != var1.field556 || var1.field562) {
				var1.method106();
			} else if (field1217 >= var1.field555) {
				var1.method151(field1060);

				if (var1.field562) {
					var1.method106();
				} else {
					field1408.method61(var1, var1.field557, var1.field556, var1.field559, 60, var1.field558, 0, false, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public static final void method458() {
		class18.field258 = true;
		class34.field573 = true;
		field1316 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.a(ILlb;B)V")
	public final void method459(int arg0, class38 arg1) {
		int var3 = arg1.method240(8);
		if (var3 < field1282) {
			for (int var4 = var3; var4 < field1282; var4++) {
				field1152[field1151++] = field1283[var4];
			}
		}

		if (var3 > field1282) {
			signlink.reporterror(field1144 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1282 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1283[var5];
			class27 var7 = field1281[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1283[field1282++] = var6;
				var7.field405 = field1217;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1283[field1282++] = var6;
					var7.field405 = field1217;
					field1285[field1284++] = var6;
				} else if (var9 == 1) {
					field1283[field1282++] = var6;
					var7.field405 = field1217;
					int var10 = arg1.method240(3);
					var7.method111(false, var10);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1285[field1284++] = var6;
					}
				} else if (var9 == 2) {
					field1283[field1282++] = var6;
					var7.field405 = field1217;
					int var12 = arg1.method240(3);
					var7.method111(true, var12);
					int var13 = arg1.method240(3);
					var7.method111(true, var13);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1285[field1284++] = var6;
					}
				} else if (var9 == 3) {
					field1152[field1151++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ld;I)Z")
	public final boolean method460(class4 arg0) {
		int var2 = arg0.field65;
		if (field1425 == 2) {
			if (var2 == 201) {
				field1231 = true;
				field1064 = false;
				field1431 = true;
				field1077 = "";
				field1207 = 1;
				field1344 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1231 = true;
				field1064 = false;
				field1431 = true;
				field1077 = "";
				field1207 = 2;
				field1344 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1349 = 250;
			return true;
		}

		if (var2 == 501) {
			field1231 = true;
			field1064 = false;
			field1431 = true;
			field1077 = "";
			field1207 = 4;
			field1344 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1231 = true;
			field1064 = false;
			field1431 = true;
			field1077 = "";
			field1207 = 5;
			field1344 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1426[var3];
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

					if (!class64.field978[var5].field984 && class64.field978[var5].field979 == var3 + (field1362 ? 0 : 7)) {
						break;
					}
				}

				field1426[var3] = var5;
				field1219 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1352[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1163[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1163[var6].length) {
					var8 = 0;
				}
			}

			field1352[var6] = var8;
			field1219 = true;
		}

		if (var2 == 324 && !field1362) {
			field1362 = true;
			method471();
		}

		if (var2 == 325 && field1362) {
			field1362 = false;
			method471();
		}

		if (var2 == 326) {
			field1407.method218(145);
			field1407.method219(field1362 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1407.method219(field1426[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1407.method219(field1352[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1437 = !field1437;
		}

		if (var2 >= 601 && var2 <= 612) {
			method475();

			if (field1259.length() > 0) {
				field1407.method218(85);
				field1407.method225(class51.method300(field1259));
				field1407.method219(var2 - 601);
				field1407.method219(field1437 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method461(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method462() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.g(Z)V")
	public void method463() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1186);

		if (field1330 != null) {
			System.out.println("Od-cycle:" + field1330.field747);
		}

		System.out.println("loop-cycle:" + field1217);
		System.out.println("draw-cycle:" + field1188);
		System.out.println("ptype:" + field1346);
		System.out.println("psize:" + field1345);

		if (field1078 != null) {
			field1078.method43();
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

	@ObfuscatedName("client.a(ZLlb;I)V")
	public final void method464(class38 arg0, int arg1) {
		if (arg1 == 136 || arg1 == 211) {
			int var3 = arg0.method229();
			int var4 = (var3 >> 4 & 0x7) + field1296;
			int var5 = (var3 & 0x7) + field1297;
			int var6 = arg0.method229();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1325[var7];
			int var10;
			if (arg1 == 211) {
				var10 = -1;
			} else {
				var10 = arg0.method231();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method539(var7, field1122, -1, var5, 0, var8, var4, var10, var9);
			}
		} else if (arg1 == 2) {
			int var11 = arg0.method229();
			int var12 = (var11 >> 4 & 0x7) + field1296;
			int var13 = (var11 & 0x7) + field1297;
			int var14 = arg0.method229();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1325[var15];
			int var18 = arg0.method231();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1170[field1122][var12][var13];
				int var20 = field1170[field1122][var12 + 1][var13];
				int var21 = field1170[field1122][var12 + 1][var13 + 1];
				int var22 = field1170[field1122][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1408.method72(field1122, var12, var13);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var22, false, 2, var19, var20, var21, var16 + 4, var24, var18);
							var23.field255 = new class28(var22, false, 2, var19, var20, var21, var16 + 1 & 0x3, var24, var18);
						} else {
							var23.field254 = new class28(var22, false, var15, var19, var20, var21, var16, var24, var18);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1408.method73(var12, field1122, var13);
					if (var25 != null) {
						var25.field147 = new class28(var22, false, 4, var19, var20, var21, 0, var25.field148 >> 14 & 0x7FFF, var18);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1408.method74(var13, field1122, var12);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var22, false, var15, var19, var20, var21, var16, var26.field247 >> 14 & 0x7FFF, var18);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1408.method75(field1122, var13, var12);
					if (var27 != null) {
						var27.field178 = new class28(var22, false, 22, var19, var20, var21, var16, var27.field179 >> 14 & 0x7FFF, var18);
					}
				}
			}
		} else if (arg1 == 147) {
			int var28 = arg0.method229();
			int var29 = (var28 >> 4 & 0x7) + field1296;
			int var30 = (var28 & 0x7) + field1297;
			int var31 = arg0.method231();
			int var32 = arg0.method231();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1117[field1122][var29][var30] == null) {
					field1117[field1122][var29][var30] = new class41();
				}

				field1117[field1122][var29][var30].method245(var33);
				method508(var29, var30);
			}
		} else if (arg1 == 53) {
			int var34 = arg0.method229();
			int var35 = (var34 >> 4 & 0x7) + field1296;
			int var36 = (var34 & 0x7) + field1297;
			int var37 = arg0.method231();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1117[field1122][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method248(); var39 != null; var39 = (class29) var38.method250()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method106();
							break;
						}
					}

					if (var38.method248() == null) {
						field1117[field1122][var35][var36] = null;
					}

					method508(var35, var36);
				}
			}
		} else if (arg1 == 30) {
			int var40 = arg0.method229();
			int var41 = (var40 >> 4 & 0x7) + field1296;
			int var42 = (var40 & 0x7) + field1297;
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
				class30 var53 = new class30(method555(var41, field1122, var42) - var47, var42, var46, field1217 + var50, var45, var51, var52, var41, var48, field1122, field1217 + var49);
				var53.method120(var44, field1217 + var49, method555(var43, field1122, var44) - var48, var43);
				field1161.method245(var53);
			}
		} else if (arg1 == 193) {
			int var54 = arg0.method229();
			int var55 = (var54 >> 4 & 0x7) + field1296;
			int var56 = (var54 & 0x7) + field1297;
			int var57 = arg0.method231();
			int var58 = arg0.method229();
			int var59 = arg0.method231();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(var56, var59, field1122, var57, method555(var55, field1122, var56) - var58, var55, field1217);
				field1402.method245(var60);
			}
		} else if (arg1 == 137) {
			int var61 = arg0.method229();
			int var62 = (var61 >> 4 & 0x7) + field1296;
			int var63 = (var61 & 0x7) + field1297;
			int var64 = arg0.method231();
			int var65 = arg0.method231();
			int var66 = arg0.method231();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1068 != var66) {
				class29 var67 = new class29();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1117[field1122][var62][var63] == null) {
					field1117[field1122][var62][var63] = new class41();
				}

				field1117[field1122][var62][var63].method245(var67);
				method508(var62, var63);
			}
		} else {
			if (arg1 == 191) {
				int var68 = arg0.method229();
				int var69 = (var68 >> 4 & 0x7) + field1296;
				int var70 = (var68 & 0x7) + field1297;
				int var71 = arg0.method229();
				int var72 = var71 >> 2;
				int var73 = var71 & 0x3;
				int var74 = field1325[var72];
				int var75 = arg0.method231();
				int var76 = arg0.method231();
				int var77 = arg0.method231();
				int var78 = arg0.method231();
				byte var79 = arg0.method230();
				byte var80 = arg0.method230();
				byte var81 = arg0.method230();
				byte var82 = arg0.method230();
				class27 var83;
				if (field1068 == var78) {
					var83 = field1189;
				} else {
					var83 = field1281[var78];
				}

				if (var83 != null) {
					class57 var84 = class57.method330(var75);
					int var85 = field1170[field1122][var69][var70];
					int var86 = field1170[field1122][var69 + 1][var70];
					int var87 = field1170[field1122][var69 + 1][var70 + 1];
					int var88 = field1170[field1122][var69][var70 + 1];
					class31 var89 = var84.method336(var72, var73, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method539(0, field1122, var77 + 1, var70, var76 + 1, 0, var69, -1, var74);
						var83.field426 = field1217 + var76;
						var83.field427 = field1217 + var77;
						var83.field431 = var89;
						int var90 = var84.field835;
						int var91 = var84.field836;
						if (var73 == 1 || var73 == 3) {
							var90 = var84.field836;
							var91 = var84.field835;
						}

						var83.field428 = var69 * 128 + var90 * 64;
						var83.field430 = var70 * 128 + var91 * 64;
						var83.field429 = method555(var83.field428, field1122, var83.field430);

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

			if (arg1 == 253) {
				int var94 = arg0.method229();
				int var95 = (var94 >> 4 & 0x7) + field1296;
				int var96 = (var94 & 0x7) + field1297;
				int var97 = arg0.method231();
				int var98 = arg0.method231();
				int var99 = arg0.method231();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					class41 var100 = field1117[field1122][var95][var96];
					if (var100 != null) {
						for (class29 var101 = (class29) var100.method248(); var101 != null; var101 = (class29) var100.method250()) {
							if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
								var101.field456 = var99;
								break;
							}
						}

						method508(var95, var96);
					}
				}
			} else if (arg1 == 222) {
				int var102 = arg0.method229();
				int var103 = (var102 >> 4 & 0x7) + field1296;
				int var104 = (var102 & 0x7) + field1297;
				int var105 = arg0.method231();
				int var106 = arg0.method229();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field1189.field410[0] >= var103 - var107 && field1189.field410[0] <= var103 + var107 && field1189.field411[0] >= var104 - var107 && field1189.field411[0] <= var104 + var107 && field1388 && !field1316 && field1261 < 50) {
					field1146[field1261] = var105;
					field1418[field1261] = var108;
					field1097[field1261] = class55.field790[var105];
					field1261++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method465() {
		if (field1088 == 0 && field1475 == 0) {
			field1318[field1265] = "Walk here";
			field1108[field1265] = 718;
			field1106[field1265] = field17;
			field1107[field1265] = field18;
			field1265++;
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

				if (var6 == 2 && field1408.method80(field1122, var4, var5, var3) >= 0) {
					class57 var8 = class57.method330(var7);
					if (var8.field862 != null) {
						var8 = var8.method338();
					}

					if (var8 == null) {
						continue;
					}

					if (field1088 == 1) {
						field1318[field1265] = "Use " + field1092 + " with @cya@" + var8.field831;
						field1108[field1265] = 810;
						field1109[field1265] = var3;
						field1106[field1265] = var4;
						field1107[field1265] = var5;
						field1265++;
					} else if (field1475 != 1) {
						if (var8.field847 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field847[var9] != null) {
									field1318[field1265] = var8.field847[var9] + " @cya@" + var8.field831;

									if (var9 == 0) {
										field1108[field1265] = 625;
									}

									if (var9 == 1) {
										field1108[field1265] = 721;
									}

									if (var9 == 2) {
										field1108[field1265] = 743;
									}

									if (var9 == 3) {
										field1108[field1265] = 357;
									}

									if (var9 == 4) {
										field1108[field1265] = 1071;
									}

									field1109[field1265] = var3;
									field1106[field1265] = var4;
									field1107[field1265] = var5;
									field1265++;
								}
							}
						}

						field1318[field1265] = "Examine @cya@" + var8.field831;
						field1108[field1265] = 1381;
						field1109[field1265] = var8.field828 << 14;
						field1106[field1265] = var4;
						field1107[field1265] = var5;
						field1265++;
					} else if ((field1477 & 0x4) == 4) {
						field1318[field1265] = field1478 + " @cya@" + var8.field831;
						field1108[field1265] = 899;
						field1109[field1265] = var3;
						field1106[field1265] = var4;
						field1107[field1265] = var5;
						field1265++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1471[var7];
					if (var10.field415.field882 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1472; var11++) {
							class26 var12 = field1471[field1473[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field882 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method431(var4, var12.field415, field1473[var11], var5);
							}
						}

						for (int var13 = 0; var13 < field1282; var13++) {
							class27 var14 = field1281[field1283[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method454(var4, var5, var14, field1283[var13]);
							}
						}
					}

					method431(var4, var10.field415, var7, var5);
				}

				if (var6 == 0) {
					class27 var15 = field1281[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1472; var16++) {
							class26 var17 = field1471[field1473[var16]];
							if (var17 != null && var17.field415.field882 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method431(var4, var17.field415, field1473[var16], var5);
							}
						}

						for (int var18 = 0; var18 < field1282; var18++) {
							class27 var19 = field1281[field1283[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method454(var4, var5, var19, field1283[var18]);
							}
						}
					}

					method454(var4, var5, var15, var7);
				}

				if (var6 == 3) {
					class41 var20 = field1117[field1122][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method249(); var21 != null; var21 = (class29) var20.method251()) {
							class60 var22 = class60.method348(var21.field455);
							if (field1088 == 1) {
								field1318[field1265] = "Use " + field1092 + " with @lre@" + var22.field917;
								field1108[field1265] = 111;
								field1109[field1265] = var21.field455;
								field1106[field1265] = var4;
								field1107[field1265] = var5;
								field1265++;
							} else if (field1475 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field931 != null && var22.field931[var23] != null) {
										field1318[field1265] = var22.field931[var23] + " @lre@" + var22.field917;

										if (var23 == 0) {
											field1108[field1265] = 139;
										}

										if (var23 == 1) {
											field1108[field1265] = 778;
										}

										if (var23 == 2) {
											field1108[field1265] = 617;
										}

										if (var23 == 3) {
											field1108[field1265] = 224;
										}

										if (var23 == 4) {
											field1108[field1265] = 662;
										}

										field1109[field1265] = var21.field455;
										field1106[field1265] = var4;
										field1107[field1265] = var5;
										field1265++;
									} else if (var23 == 2) {
										field1318[field1265] = "Take @lre@" + var22.field917;
										field1108[field1265] = 617;
										field1109[field1265] = var21.field455;
										field1106[field1265] = var4;
										field1107[field1265] = var5;
										field1265++;
									}
								}

								field1318[field1265] = "Examine @lre@" + var22.field917;
								field1108[field1265] = 1152;
								field1109[field1265] = var21.field455;
								field1106[field1265] = var4;
								field1107[field1265] = var5;
								field1265++;
							} else if ((field1477 & 0x1) == 1) {
								field1318[field1265] = field1478 + " @lre@" + var22.field917;
								field1108[field1265] = 370;
								field1109[field1265] = var21.field455;
								field1106[field1265] = var4;
								field1107[field1265] = var5;
								field1265++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IB)Z")
	public final boolean method466(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1108[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method467(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1408.method80(field1122, arg1, arg2, arg0);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1340++;
		if (field1340 > 1086) {
			field1340 = 0;
			field1407.method218(170);
			field1407.method219(0);
			int var9 = field1407.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1407.method220(16791);
			}

			field1407.method219(254);
			field1407.method220((int) (Math.random() * 65536.0D));
			field1407.method220(16128);
			field1407.method220(52610);
			field1407.method220((int) (Math.random() * 65536.0D));
			field1407.method220(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1407.method220(35025);
			}

			field1407.method220(46628);
			field1407.method219((int) (Math.random() * 256.0D));
			field1407.method228(field1407.field621 - var9);
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

			method482(0, arg2, arg1, field1189.field411[0], var13, 0, 2, false, field1189.field410[0], var12, var11);
		} else {
			method482(var7 + 1, arg2, arg1, field1189.field411[0], 0, var8, 2, false, field1189.field410[0], 0, 0);
		}

		field1250 = field24;
		field1251 = field25;
		field1253 = 2;
		field1252 = 0;
		field1407.method218(arg3);
		field1407.method220(field1267 + arg1);
		field1407.method220(field1268 + arg2);
		field1407.method220(var5);
		return true;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method468(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ZLib;II)V")
	public final void method469(class35 arg0, int arg1, int arg2) {
		int var4 = field1451 + field1385 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field550[var4];
			int var7 = class31.field551[var4];
			var6 = var6 * 256 / (field1174 + 256);
			var7 = var7 * 256 / (field1174 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method192(var8 + 94 + 4 - arg0.field601 / 2, field1141, 83 - var9 - arg0.field602 / 2 - 4);
			} else {
				arg0.method186(var8 + 94 + 4 - arg0.field601 / 2, 83 - var9 - arg0.field602 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(BLlb;I)V")
	public final void method470(class38 arg0, int arg1) {
		while (arg0.field622 + 10 < arg1 * 8) {
			int var3 = arg0.method240(11);
			if (var3 == 2047) {
				break;
			}

			if (field1281[var3] == null) {
				field1281[var3] = new class27();
				if (field1286[var3] != null) {
					field1281[var3].method116(field1286[var3]);
				}
			}

			field1283[field1282++] = var3;
			class27 var4 = field1281[var3];
			var4.field405 = field1217;
			int var5 = arg0.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method240(1);
			var4.method110(field1189.field411[0] + var6, var7 == 1, field1189.field410[0] + var5);
			int var8 = arg0.method240(1);
			if (var8 == 1) {
				field1285[field1284++] = var3;
			}
		}

		arg0.method241();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method471() {
		field1219 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1426[var1] = -1;
			for (int var2 = 0; var2 < class64.field977; var2++) {
				if (!class64.field978[var2].field984 && class64.field978[var2].field979 == var1 + (field1362 ? 0 : 7)) {
					field1426[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;Lab;II)V")
	public final void method472(class38 arg0, class27 arg1, int arg2, int arg3) {
		if ((arg2 & 0x1) == 1) {
			int var5 = arg0.method229();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg0.method238(var5, 0, var6);
			field1286[arg3] = var7;
			arg1.method116(var7);
		}

		if ((arg2 & 0x2) == 2) {
			int var8 = arg0.method231();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg1.field388 == var8) {
				arg1.field392 = 0;
			}

			int var9 = arg0.method229();
			if (arg1.field388 == var8 && var8 != -1) {
				int var10 = class66.field996[var8].field1010;
				if (var10 == 1) {
					arg1.field389 = 0;
					arg1.field390 = 0;
					arg1.field391 = var9;
					arg1.field392 = 0;
				}

				if (var10 == 2) {
					arg1.field392 = 0;
				}
			} else if (var8 == -1 || arg1.field388 == -1 || class66.field996[var8].field1004 >= class66.field996[arg1.field388].field1004) {
				arg1.field388 = var8;
				arg1.field389 = 0;
				arg1.field390 = 0;
				arg1.field391 = var9;
				arg1.field392 = 0;
				arg1.field414 = arg1.field409;
			}
		}

		if ((arg2 & 0x4) == 4) {
			arg1.field382 = arg0.method231();
			if (arg1.field382 == 0xFFFF) {
				arg1.field382 = -1;
			}
		}

		if ((arg2 & 0x8) == 8) {
			arg1.field372 = arg0.method236();
			if (arg1.field372.charAt(0) == '~') {
				arg1.field372 = arg1.field372.substring(1);
				method559(2, arg1.field416, arg1.field372);
			} else if (field1189 == arg1) {
				method559(2, arg1.field416, arg1.field372);
			}

			arg1.field374 = 0;
			arg1.field375 = 0;
			arg1.field373 = 150;
		}

		if ((arg2 & 0x10) == 0x10) {
			int var11 = arg0.method229();
			int var12 = arg0.method229();
			arg1.method114(var12, field1217, var11);
			arg1.field379 = field1217 + 300;
			arg1.field380 = arg0.method229();
			arg1.field381 = arg0.method229();
		}

		if ((arg2 & 0x20) == 0x20) {
			arg1.field383 = arg0.method231();
			arg1.field384 = arg0.method231();
		}

		if ((arg2 & 0x40) == 0x40) {
			int var13 = arg0.method231();
			int var14 = arg0.method229();
			int var15 = arg0.method229();
			int var16 = arg0.field621;

			if (arg1.field416 != null && arg1.field417) {
				long var17 = class51.method300(arg1.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1180; var20++) {
						if (field1391[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1366 == 0) {
					try {
						String var21 = class52.method306(var15, arg0);
						var21 = class71.method401(var21);
						arg1.field372 = var21;
						arg1.field374 = var13 >> 8;
						arg1.field375 = var13 & 0xFF;
						arg1.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method559(1, "@cr2@" + arg1.field416, var21);
						} else if (var14 == 1) {
							method559(1, "@cr1@" + arg1.field416, var21);
						} else {
							method559(2, arg1.field416, var21);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field621 = var15 + var16;
		}

		if ((arg2 & 0x100) == 0x100) {
			arg1.field393 = arg0.method231();
			int var23 = arg0.method234();
			arg1.field397 = var23 >> 16;
			arg1.field396 = (var23 & 0xFFFF) + field1217;
			arg1.field394 = 0;
			arg1.field395 = 0;

			if (arg1.field396 > field1217) {
				arg1.field394 = -1;
			}

			if (arg1.field393 == 0xFFFF) {
				arg1.field393 = -1;
			}
		}

		if ((arg2 & 0x200) == 0x200) {
			arg1.field398 = arg0.method229();
			arg1.field400 = arg0.method229();
			arg1.field399 = arg0.method229();
			arg1.field401 = arg0.method229();
			arg1.field402 = arg0.method231() + field1217;
			arg1.field403 = arg0.method231() + field1217;
			arg1.field404 = arg0.method229();
			arg1.method112();
		}

		if ((arg2 & 0x400) == 0x400) {
			int var24 = arg0.method229();
			int var25 = arg0.method229();
			arg1.method114(var25, field1217, var24);
			arg1.field379 = field1217 + 300;
			arg1.field380 = arg0.method229();
			arg1.field381 = arg0.method229();
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method473() {
		for (class40 var1 = (class40) field1190.method248(); var1 != null; var1 = (class40) field1190.method250()) {
			if (var1.field649 == -1) {
				var1.field648 = 0;
				method449(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public final String method474(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method475() {
		field1407.method218(165);

		if (field1356 != -1) {
			field1356 = -1;
			field1201 = true;
			field1116 = false;
			field1249 = true;
		}

		if (field1071 != -1) {
			field1071 = -1;
			field1231 = true;
			field1116 = false;
		}

		field1367 = -1;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method476() {
		try {
			field1331 = -1;
			field1402.method252();
			field1161.method252();
			class34.method167();
			method442();
			field1408.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1176[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(104, field1170, 104, field1135);
			int var3 = field1184.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1147[var4] >> 8;
				int var6 = field1147[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1408.method51(field1122);
			} else {
				field1408.method51(0);
			}

			field1407.method218(115);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1147[var7] >> 8) * 64 - field1267;
				int var9 = (field1147[var7] & 0xFF) * 64 - field1268;
				byte[] var10 = field1184[var7];
				if (var10 != null) {
					var2.method15((field1085 - 6) * 8, var8, (field1084 - 6) * 8, var9, var10);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1147[var11] >> 8) * 64 - field1267;
				int var13 = (field1147[var11] & 0xFF) * 64 - field1268;
				byte[] var14 = field1184[var11];
				if (var14 == null && field1085 < 800) {
					var2.method14(64, var12, var13, 64);
				}
			}

			field1407.method218(115);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1143[var15];
				if (var16 != null) {
					int var17 = (field1147[var15] >> 8) * 64 - field1267;
					int var18 = (field1147[var15] & 0xFF) * 64 - field1268;
					var2.method18(var18, field1176, field1408, var17, var16);
				}
			}

			field1407.method218(115);
			var2.method20(field1176, field1408);
			field1100.method258();
			field1407.method218(115);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method508(var19, var20);
				}
			}

			method473();
		} catch (Exception var33) {
		}

		class57.field865.method103();

		if (field1316 && signlink.cache_dat != null) {
			int var22 = field1330.method272(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1330.method277(var23);
				if ((var24 & 0x79) == 0) {
					class31.method125(var23);
				}
			}
		}

		System.gc();
		class34.method168(20);
		field1330.method283();
		int var25 = (field1084 - 6) / 8 - 1;
		int var26 = (field1084 + 6) / 8 + 1;
		int var27 = (field1085 - 6) / 8 - 1;
		int var28 = (field1085 + 6) / 8 + 1;
		if (field1469) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1330.method274(var30, 0, var29);
					if (var31 != -1) {
						field1330.method284(3, var31);
					}

					int var32 = field1330.method274(var30, 1, var29);
					if (var32 != -1) {
						field1330.method284(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method477() {
		int var1 = field1208 * 128 + 64;
		int var2 = field1209 * 128 + 64;
		int var3 = method555(var1, field1122, var2) - field1210;

		if (field1376 < var1) {
			field1376 += (var1 - field1376) * field1212 / 1000 + field1211;
			if (field1376 > var1) {
				field1376 = var1;
			}
		}

		if (field1376 > var1) {
			field1376 -= (field1376 - var1) * field1212 / 1000 + field1211;
			if (field1376 < var1) {
				field1376 = var1;
			}
		}

		if (field1377 < var3) {
			field1377 += (var3 - field1377) * field1212 / 1000 + field1211;
			if (field1377 > var3) {
				field1377 = var3;
			}
		}

		if (field1377 > var3) {
			field1377 -= (field1377 - var3) * field1212 / 1000 + field1211;
			if (field1377 < var3) {
				field1377 = var3;
			}
		}

		if (field1378 < var2) {
			field1378 += (var2 - field1378) * field1212 / 1000 + field1211;
			if (field1378 > var2) {
				field1378 = var2;
			}
		}

		if (field1378 > var2) {
			field1378 -= (field1378 - var2) * field1212 / 1000 + field1211;
			if (field1378 < var2) {
				field1378 = var2;
			}
		}

		int var4 = field1432 * 128 + 64;
		int var5 = field1433 * 128 + 64;
		int var6 = method555(var4, field1122, var5) - field1434;
		int var7 = var4 - field1376;
		int var8 = var6 - field1377;
		int var9 = var5 - field1378;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1379 < var11) {
			field1379 += (var11 - field1379) * field1436 / 1000 + field1435;
			if (field1379 > var11) {
				field1379 = var11;
			}
		}

		if (field1379 > var11) {
			field1379 -= (field1379 - var11) * field1436 / 1000 + field1435;
			if (field1379 < var11) {
				field1379 = var11;
			}
		}

		int var13 = var12 - field1380;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1380 += field1436 * var13 / 1000 + field1435;
			field1380 &= 0x7FF;
		}

		if (var13 < 0) {
			field1380 -= -var13 * field1436 / 1000 + field1435;
			field1380 &= 0x7FF;
		}

		int var14 = var12 - field1380;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1380 = var12;
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

	@ObfuscatedName("client.a(ILy;I)V")
	public final void method478(class25 arg0, int arg1) {
		method479(arg0.field361, arg1, arg0.field360);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method479(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method555(arg2, field1122, arg0) - arg1;
			arg2 -= field1376;
			var4 -= field1377;
			arg0 -= field1378;
			int var5 = class31.field550[field1379];
			int var6 = class31.field551[field1379];
			int var7 = class31.field550[field1380];
			int var8 = class31.field551[field1380];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1381 = (var9 << 9) / arg0 + class34.field578;
				field1382 = (var11 << 9) / arg0 + class34.field579;
			} else {
				field1381 = -1;
				field1382 = -1;
			}
		} else {
			field1381 = -1;
			field1382 = -1;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method480() {
		for (int var1 = 0; var1 < field1261; var1++) {
			if (field1097[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1146[var1] != field1118 || field1418[var1] != field1326) {
						class38 var3 = class55.method319(field1418[var1], field1146[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1150 / 22 + field1339) {
							field1150 = var3.field621;
							field1339 = System.currentTimeMillis();

							if (method495(var3.field621, var3.field620)) {
								field1118 = field1146[var1];
								field1326 = field1418[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method510()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1097[var1] != -5) {
					field1097[var1] = -5;
				} else {
					field1261--;
					for (int var5 = var1; var5 < field1261; var5++) {
						field1146[var5] = field1146[var5 + 1];
						field1418[var5] = field1418[var5 + 1];
						field1097[var5] = field1097[var5 + 1];
					}

					var1--;
				}
			} else {
				field1097[var1]--;
			}
		}

		if (field1215 > 0) {
			field1215 -= 20;
			if (field1215 < 0) {
				field1215 = 0;
			}

			if (field1215 == 0 && field1404 && !field1316) {
				field1327 = field1235;
				field1328 = true;
				field1330.method279(2, field1327);
				return;
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method481() {
		int var1 = field1466.method204("Choose Option");
		for (int var2 = 0; var2 < field1265; var2++) {
			int var3 = field1466.method204(field1318[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1265 * 15 + 21;
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

			field1389 = true;
			field1333 = 0;
			field1334 = var5;
			field1335 = var6;
			field1336 = var1;
			field1337 = field1265 * 15 + 22;
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

			field1389 = true;
			field1333 = 1;
			field1334 = var7;
			field1335 = var8;
			field1336 = var1;
			field1337 = field1265 * 15 + 22;
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

			field1389 = true;
			field1333 = 2;
			field1334 = var9;
			field1335 = var10;
			field1336 = var1;
			field1337 = field1265 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(BIIIIIIIZIII)Z")
	public final boolean method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1260[var14][var15] = 0;
				field1463[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg3;
		field1260[arg8][arg3] = 99;
		field1463[arg8][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1350[var18] = arg8;
		int var35 = var18 + 1;
		field1351[var18] = arg3;
		boolean var20 = false;
		int var21 = field1350.length;
		int[][] var22 = field1176[field1122].field963;
		while (var35 != var19) {
			var16 = field1350[var19];
			var17 = field1351[var19];
			var19 = (var19 + 1) % var21;

			if (arg2 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field1176[field1122].method368(arg2, var16, arg1, var17, arg0 - 1, arg5)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field1176[field1122].method369(arg1, arg5, var17, arg2, var16, arg0 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg10 != 0 && arg9 != 0 && field1176[field1122].method370(arg2, arg4, var17, arg10, arg1, arg9, var16)) {
				var20 = true;
				break;
			}

			int var23 = field1463[var16][var17] + 1;
			if (var16 > 0 && field1260[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1350[var35] = var16 - 1;
				field1351[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1260[var16 - 1][var17] = 2;
				field1463[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1260[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1350[var35] = var16 + 1;
				field1351[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1260[var16 + 1][var17] = 8;
				field1463[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1260[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1350[var35] = var16;
				field1351[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1260[var16][var17 - 1] = 1;
				field1463[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1260[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1350[var35] = var16;
				field1351[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1260[var16][var17 + 1] = 4;
				field1463[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1260[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1350[var35] = var16 - 1;
				field1351[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1260[var16 - 1][var17 - 1] = 3;
				field1463[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1260[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1350[var35] = var16 + 1;
				field1351[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1260[var16 + 1][var17 - 1] = 9;
				field1463[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1260[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1350[var35] = var16 - 1;
				field1351[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1260[var16 - 1][var17 + 1] = 6;
				field1463[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1260[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1350[var35] = var16 + 1;
				field1351[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1260[var16 + 1][var17 + 1] = 12;
				field1463[var16 + 1][var17 + 1] = var23;
			}
		}

		field1173 = 0;
		if (!var20) {
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg2 - var25; var26 <= arg2 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1463[var26][var27] < var24) {
								var24 = field1463[var26][var27];
								var16 = var26;
								var17 = var27;
								field1173 = 1;
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
		field1350[var28] = var16;
		int var36 = var28 + 1;
		field1351[var28] = var17;
		int var29;
		int var30 = var29 = field1260[var16][var17];
		while (arg8 != var16 || arg3 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1350[var36] = var16;
				field1351[var36++] = var17;
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

			var30 = field1260[var16][var17];
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
		int var32 = field1350[var36];
		int var33 = field1351[var36];

		if (arg6 == 0) {
			field1407.method218(141);
			field1407.method219(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field1407.method218(196);
			field1407.method219(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field1407.method218(70);
			field1407.method219(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1407.method219(1);
		} else {
			field1407.method219(0);
		}

		field1407.method220(field1267 + var32);
		field1407.method220(field1268 + var33);
		field1181 = field1350[0];
		field1182 = field1351[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1407.method219(field1350[var36] - var32);
			field1407.method219(field1351[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method483() {
		int var1 = 5;
		field1302[8] = 0;
		int var2 = 0;
		while (field1302[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method501("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 299);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field620, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1302[var6] = var5.method234();
				}

				int var7 = var5.method234();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1302[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1302[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1302[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1302[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1302[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1302[8] == 0) {
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

				field1357 = !field1357;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method484() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1069 = (field1069 + 1) % 4;
				field1081 = true;
				field1231 = true;
				field1407.method218(242);
				field1407.method219(field1069);
				field1407.method219(field1449);
				field1407.method219(field1216);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1449 = (field1449 + 1) % 3;
				field1081 = true;
				field1231 = true;
				field1407.method218(242);
				field1407.method219(field1069);
				field1407.method219(field1449);
				field1407.method219(field1216);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1216 = (field1216 + 1) % 3;
				field1081 = true;
				field1231 = true;
				field1407.method218(242);
				field1407.method219(field1069);
				field1407.method219(field1449);
				field1407.method219(field1216);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1367 == -1) {
					method475();
					field1259 = "";
					field1437 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1301 = field1367 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method559(0, "", "Please close the interface you have open before using 'report abuse'");
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

	@ObfuscatedName("client.e(II)V")
	public final void method485(int arg0) {
		if (arg0 >= 0) {
			if (field1064) {
				field1064 = false;
				field1231 = true;
			}

			int var2 = field1106[arg0];
			int var3 = field1107[arg0];
			int var4 = field1108[arg0];
			int var5 = field1109[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 563) {
				field1407.method218(199);
				field1407.method220(var5);
				field1407.method220(var2);
				field1407.method220(var3);
				field1407.method220(field1476);
				field1124 = 0;
				field1125 = var3;
				field1126 = var2;
				field1127 = 2;
				if (class4.field56[var3].field62 == field1367) {
					field1127 = 1;
				}

				if (class4.field56[var3].field62 == field1071) {
					field1127 = 3;
				}
			}

			if (var4 == 111) {
				boolean var6 = method482(0, var3, var2, field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 0, 0);
				if (!var6) {
					method482(0, var3, var2, field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
				}

				field1250 = field24;
				field1251 = field25;
				field1253 = 2;
				field1252 = 0;
				field1407.method218(163);
				field1407.method220(field1267 + var2);
				field1407.method220(field1268 + var3);
				field1407.method220(var5);
				field1407.method220(field1091);
				field1407.method220(field1089);
				field1407.method220(field1090);
			}

			if (var4 == 899 && method467(var5, var2, var3, 124)) {
				field1407.method220(field1476);
			}

			if (var4 == 1152) {
				class60 var8 = class60.method348(var5);
				String var9;
				if (var8.field918 == null) {
					var9 = "It's a " + var8.field917 + ".";
				} else {
					var9 = new String(var8.field918);
				}

				method559(0, "", var9);
			}

			if (var4 == 275) {
				class27 var10 = field1281[var5];
				if (var10 != null) {
					method482(0, var10.field411[0], var10.field410[0], field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
					field1250 = field24;
					field1251 = field25;
					field1253 = 2;
					field1252 = 0;
					field1407.method218(136);
					field1407.method220(var5);
					field1407.method220(field1091);
					field1407.method220(field1089);
					field1407.method220(field1090);
				}
			}

			if (var4 == 1071) {
				method467(var5, var2, var3, 253);
			}

			if (var4 == 435) {
				field1407.method218(62);
				field1407.method220(var3);
				class4 var11 = class4.field56[var3];
				if (var11.field71 != null && var11.field71[0][0] == 5) {
					int var12 = var11.field71[0][1];
					field1202[var12] = 1 - field1202[var12];
					method550(var12);
					field1201 = true;
				}
			}

			if (var4 == 370) {
				boolean var13 = method482(0, var3, var2, field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 0, 0);
				if (!var13) {
					method482(0, var3, var2, field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
				}

				field1250 = field24;
				field1251 = field25;
				field1253 = 2;
				field1252 = 0;
				field1407.method218(195);
				field1407.method220(field1267 + var2);
				field1407.method220(field1268 + var3);
				field1407.method220(var5);
				field1407.method220(field1476);
			}

			if (var4 == 810 && method467(var5, var2, var3, 215)) {
				field1407.method220(field1091);
				field1407.method220(field1089);
				field1407.method220(field1090);
			}

			if (var4 == 997 && !field1116) {
				field1407.method218(223);
				field1407.method220(var3);
				field1116 = true;
			}

			if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
				boolean var15 = method482(0, var3, var2, field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 0, 0);
				if (!var15) {
					method482(0, var3, var2, field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
				}

				field1250 = field24;
				field1251 = field25;
				field1253 = 2;
				field1252 = 0;

				if (var4 == 139) {
					if ((var2 & 0x3) == 0) {
						field1120++;
					}

					if (field1120 >= 123) {
						field1407.method218(58);
						field1407.method223(0);
					}

					field1407.method218(27);
				}

				if (var4 == 662) {
					field1061 += field1268;
					if (field1061 >= 118) {
						field1407.method218(26);
						field1407.method223(0);
					}

					field1407.method218(211);
				}

				if (var4 == 617) {
					field1407.method218(60);
				}

				if (var4 == 224) {
					field1063 += var3;
					if (field1063 >= 75) {
						field1407.method218(41);
						field1407.method219(19);
					}

					field1407.method218(123);
				}

				if (var4 == 778) {
					field1407.method218(42);
				}

				field1407.method220(field1267 + var2);
				field1407.method220(field1268 + var3);
				field1407.method220(var5);
			}

			if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
				class26 var17 = field1471[var5];
				if (var17 != null) {
					method482(0, var17.field411[0], var17.field410[0], field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
					field1250 = field24;
					field1251 = field25;
					field1253 = 2;
					field1252 = 0;

					if (var4 == 309) {
						field1407.method218(239);
					}

					if (var4 == 852) {
						field1407.method218(22);
					}

					if (var4 == 793) {
						field1407.method218(188);
					}

					if (var4 == 209) {
						field1407.method218(4);
					}

					if (var4 == 242) {
						field1407.method218(35);
					}

					field1407.method220(var5);
				}
			}

			if (var4 == 1381) {
				int var18 = var5 >> 14 & 0x7FFF;
				class57 var19 = class57.method330(var18);
				String var20;
				if (var19.field832 == null) {
					var20 = "It's a " + var19.field831 + ".";
				} else {
					var20 = new String(var19.field832);
				}

				method559(0, "", var20);
			}

			if (var4 == 524) {
				String var21 = field1318[arg0];
				int var22 = var21.indexOf("@whi@");
				if (var22 != -1) {
					if (field1367 == -1) {
						method475();
						field1259 = var21.substring(var22 + 5).trim();
						field1437 = false;

						for (int var23 = 0; var23 < class4.field56.length; var23++) {
							if (class4.field56[var23] != null && class4.field56[var23].field65 == 600) {
								field1301 = field1367 = class4.field56[var23].field62;
								break;
							}
						}
					} else {
						method559(0, "", "Please close the interface you have open before using 'report abuse'");
					}
				}
			}

			if (var4 == 721) {
				field1123 += var3;
				if (field1123 >= 139) {
					field1407.method218(202);
					field1407.method223(0);
				}

				method467(var5, var2, var3, 207);
			}

			if (var4 == 743) {
				field1179++;
				if (field1179 >= 124) {
					field1407.method218(173);
					field1407.method220(37954);
				}

				method467(var5, var2, var3, 98);
			}

			if (var4 == 102) {
				field1088 = 1;
				field1089 = var2;
				field1090 = var3;
				field1091 = var5;
				field1092 = class60.method348(var5).field917;
				field1475 = 0;
				field1201 = true;
			} else if (var4 == 274) {
				class4 var24 = class4.field56[var3];
				field1475 = 1;
				field1476 = var3;
				field1477 = var24.field116;
				field1088 = 0;
				field1201 = true;
				String var25 = var24.field114;
				if (var25.indexOf(" ") != -1) {
					var25 = var25.substring(0, var25.indexOf(" "));
				}

				String var26 = var24.field114;
				if (var26.indexOf(" ") != -1) {
					var26 = var26.substring(var26.indexOf(" ") + 1);
				}

				field1478 = var25 + " " + var24.field115 + " " + var26;

				if (field1477 == 16) {
					field1201 = true;
					field1288 = 3;
					field1249 = true;
				}
			} else {
				if (var4 == 357) {
					method467(var5, var2, var3, 5);
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class27 var27 = field1281[var5];
					if (var27 != null) {
						method482(0, var27.field411[0], var27.field410[0], field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
						field1250 = field24;
						field1251 = field25;
						field1253 = 2;
						field1252 = 0;

						if (var4 == 27) {
							field1407.method218(17);
						}

						if (var4 == 185) {
							field1407.method218(83);
						}

						if (var4 == 387) {
							field1312 += var5;
							if (field1312 >= 66) {
								field1407.method218(222);
								field1407.method219(154);
							}

							field1407.method218(241);
						}

						if (var4 == 639) {
							field1275++;
							if (field1275 >= 52) {
								field1407.method218(0);
								field1407.method219(131);
							}

							field1407.method218(10);
						}

						if (var4 == 499) {
							field1407.method218(40);
						}

						field1407.method220(var5);
					}
				}

				if (var4 == 225) {
					field1407.method218(62);
					field1407.method220(var3);
					class4 var28 = class4.field56[var3];
					if (var28.field71 != null && var28.field71[0][0] == 5) {
						int var29 = var28.field71[0][1];
						if (field1202[var29] != var28.field73[0]) {
							field1202[var29] = var28.field73[0];
							method550(var29);
							field1201 = true;
						}
					}
				}

				if (var4 == 737) {
					method475();
				}

				if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
					if (var4 == 681) {
						field1072++;
						if (field1072 >= 116) {
							field1407.method218(152);
							field1407.method222(0xC6A439);
						}

						field1407.method218(254);
					}

					if (var4 == 962) {
						field1407.method218(156);
					}

					if (var4 == 795) {
						field1407.method218(213);
					}

					if (var4 == 100) {
						field1407.method218(127);
					}

					if (var4 == 694) {
						field1407.method218(64);
					}

					field1407.method220(var5);
					field1407.method220(var2);
					field1407.method220(var3);
					field1124 = 0;
					field1125 = var3;
					field1126 = var2;
					field1127 = 2;
					if (class4.field56[var3].field62 == field1367) {
						field1127 = 1;
					}

					if (class4.field56[var3].field62 == field1071) {
						field1127 = 3;
					}
				}

				if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
					if (var4 == 354) {
						field1407.method218(87);
					}

					if (var4 == 555) {
						field1407.method218(130);
					}

					if (var4 == 113) {
						field1407.method218(88);
					}

					if (var4 == 582) {
						if ((var5 & 0x3) == 0) {
							field1079++;
						}

						if (field1079 >= 133) {
							field1407.method218(203);
							field1407.method220(6118);
						}

						field1407.method218(198);
					}

					if (var4 == 331) {
						field1407.method218(125);
					}

					field1407.method220(var5);
					field1407.method220(var2);
					field1407.method220(var3);
					field1124 = 0;
					field1125 = var3;
					field1126 = var2;
					field1127 = 2;
					if (class4.field56[var3].field62 == field1367) {
						field1127 = 1;
					}

					if (class4.field56[var3].field62 == field1071) {
						field1127 = 3;
					}
				}

				if (var4 == 625) {
					method467(var5, var2, var3, 238);
				}

				if (var4 == 398) {
					field1407.method218(101);
					field1407.method220(var5);
					field1407.method220(var2);
					field1407.method220(var3);
					field1407.method220(field1091);
					field1407.method220(field1089);
					field1407.method220(field1090);
					field1124 = 0;
					field1125 = var3;
					field1126 = var2;
					field1127 = 2;
					if (class4.field56[var3].field62 == field1367) {
						field1127 = 1;
					}

					if (class4.field56[var3].field62 == field1071) {
						field1127 = 3;
					}
				}

				if (var4 == 231) {
					class4 var30 = class4.field56[var3];
					boolean var31 = true;
					if (var30.field65 > 0) {
						var31 = method460(var30);
					}

					if (var31) {
						field1407.method218(62);
						field1407.method220(var3);
					}
				}

				if (var4 == 1714) {
					class26 var32 = field1471[var5];
					if (var32 != null) {
						class59 var33 = var32.field415;
						if (var33.field905 != null) {
							var33 = var33.method345();
						}

						if (var33 != null) {
							String var34;
							if (var33.field881 == null) {
								var34 = "It's a " + var33.field880 + ".";
							} else {
								var34 = new String(var33.field881);
							}

							method559(0, "", var34);
						}
					}
				}

				if (var4 == 1328) {
					class60 var35 = class60.method348(var5);
					class4 var36 = class4.field56[var3];
					String var37;
					if (var36 != null && var36.field58[var2] >= 100000) {
						var37 = var36.field58[var2] + " x " + var35.field917;
					} else if (var35.field918 == null) {
						var37 = "It's a " + var35.field917 + ".";
					} else {
						var37 = new String(var35.field918);
					}

					method559(0, "", var37);
				}

				if (var4 == 902) {
					String var38 = field1318[arg0];
					int var39 = var38.indexOf("@whi@");
					if (var39 != -1) {
						long var40 = class51.method300(var38.substring(var39 + 5).trim());
						int var42 = -1;
						for (int var43 = 0; var43 < field1424; var43++) {
							if (field1244[var43] == var40) {
								var42 = var43;
								break;
							}
						}

						if (var42 != -1 && field1178[var42] > 0) {
							field1231 = true;
							field1064 = false;
							field1431 = true;
							field1077 = "";
							field1207 = 3;
							field1450 = field1244[var42];
							field1344 = "Enter message to send to " + field1419[var42];
						}
					}
				}

				if (var4 == 829) {
					class26 var44 = field1471[var5];
					if (var44 != null) {
						method482(0, var44.field411[0], var44.field410[0], field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
						field1250 = field24;
						field1251 = field25;
						field1253 = 2;
						field1252 = 0;
						field1407.method218(120);
						field1407.method220(var5);
						field1407.method220(field1091);
						field1407.method220(field1089);
						field1407.method220(field1090);
					}
				}

				if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
					String var45 = field1318[arg0];
					int var46 = var45.indexOf("@whi@");
					if (var46 != -1) {
						long var47 = class51.method300(var45.substring(var46 + 5).trim());
						if (var4 == 605) {
							method520(var47);
						}

						if (var4 == 47) {
							method441(var47);
						}

						if (var4 == 513) {
							method541(var47);
						}

						if (var4 == 884) {
							method509(var47);
						}
					}
				}

				if (var4 == 718) {
					if (field1389) {
						field1408.method88(var3 - 4, var2 - 4);
					} else {
						field1408.method88(field25 - 4, field24 - 4);
					}
				}

				if (var4 == 240) {
					class26 var49 = field1471[var5];
					if (var49 != null) {
						method482(0, var49.field411[0], var49.field410[0], field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
						field1250 = field24;
						field1251 = field25;
						field1253 = 2;
						field1252 = 0;
						field1407.method218(100);
						field1407.method220(var5);
						field1407.method220(field1476);
					}
				}

				if (var4 == 507 || var4 == 957) {
					String var50 = field1318[arg0];
					int var51 = var50.indexOf("@whi@");
					if (var51 != -1) {
						var50 = var50.substring(var51 + 5).trim();
						String var52 = class51.method304(class51.method301(class51.method300(var50)));
						boolean var53 = false;
						for (int var54 = 0; var54 < field1282; var54++) {
							class27 var55 = field1281[field1283[var54]];
							if (var55 != null && var55.field416 != null && var55.field416.equalsIgnoreCase(var52)) {
								method482(0, var55.field411[0], var55.field410[0], field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);

								if (var4 == 507) {
									field1312 += var5;
									if (field1312 >= 66) {
										field1407.method218(222);
										field1407.method219(154);
									}

									field1407.method218(241);
								}

								if (var4 == 957) {
									field1275++;
									if (field1275 >= 52) {
										field1407.method218(0);
										field1407.method219(131);
									}

									field1407.method218(10);
								}

								field1407.method220(field1283[var54]);
								var53 = true;
								break;
							}
						}

						if (!var53) {
							method559(0, "", "Unable to find " + var52);
						}
					}
				}

				if (var4 == 131) {
					class27 var56 = field1281[var5];
					if (var56 != null) {
						method482(0, var56.field411[0], var56.field410[0], field1189.field411[0], 0, 0, 2, false, field1189.field410[0], 1, 1);
						field1250 = field24;
						field1251 = field25;
						field1253 = 2;
						field1252 = 0;
						field1407.method218(97);
						field1407.method220(var5);
						field1407.method220(field1476);
					}
				}

				field1088 = 0;
				field1475 = 0;
				field1201 = true;
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method486() {
		if (field1338 > 1) {
			field1338--;
		}

		if (field1349 > 0) {
			field1349--;
		}

		for (int var1 = 0; var1 < 5 && method498(); var1++) {
		}

		if (field1214) {
			synchronized (field1481.field869) {
				if (!field1300) {
					field1481.field870 = 0;
				} else if (field23 != 0 || field1481.field870 >= 40) {
					field1407.method218(151);
					field1407.method219(0);
					int var3 = field1407.field621;
					int var4 = 0;
					for (int var5 = 0; var5 < field1481.field870 && var3 - field1407.field621 < 240; var5++) {
						var4++;
						int var6 = field1481.field872[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1481.field871[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1481.field872[var5] == -1 && field1481.field871[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1137 != var7 || field1138 != var6) {
							int var9 = var7 - field1137;
							field1137 = var7;
							int var10 = var6 - field1138;
							field1138 = var6;

							if (field1213 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1407.method220((field1213 << 12) + (var9 << 6) + var10);
								field1213 = 0;
							} else if (field1213 < 8) {
								field1407.method222((field1213 << 19) + var8 + 0x800000);
								field1213 = 0;
							} else {
								field1407.method223((field1213 << 19) + var8 - 0x40000000);
								field1213 = 0;
							}
						} else if (field1213 < 2047) {
							field1213++;
						}
					}

					field1407.method228(field1407.field621 - var3);

					if (var4 >= field1481.field870) {
						field1481.field870 = 0;
					} else {
						field1481.field870 -= var4;
						for (int var11 = 0; var11 < field1481.field870; var11++) {
							field1481.field871[var11] = field1481.field871[var4 + var11];
							field1481.field872[var11] = field1481.field872[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1065) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1065 = field26;
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
				field1407.method218(240);
				field1407.method223((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1075 > 0) {
				field1075--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1076 = true;
			}

			if (field1076 && field1075 <= 0) {
				field1075 = 20;
				field1076 = false;
				field1407.method218(169);
				field1407.method220(field1384);
				field1407.method220(field1385);
			}

			if (field14 && !field1257) {
				field1257 = true;
				field1407.method218(247);
				field1407.method219(1);
			}

			if (!field14 && field1257) {
				field1257 = false;
				field1407.method218(247);
				field1407.method219(0);
			}

			method444();
			method513();
			method480();
			field1347++;
			if (field1347 > 750) {
				method515();
			}

			method503();
			method528();
			method551();
			field1060++;

			if (field1253 != 0) {
				field1252 += 20;
				if (field1252 >= 400) {
					field1253 = 0;
				}
			}

			if (field1127 != 0) {
				field1124++;
				if (field1124 >= 15) {
					if (field1127 == 2) {
						field1201 = true;
					}

					if (field1127 == 3) {
						field1231 = true;
					}

					field1127 = 0;
				}
			}

			if (field1415 != 0) {
				field1236++;

				if (field17 > field1416 + 5 || field17 < field1416 - 5 || field18 > field1417 + 5 || field18 < field1417 - 5) {
					field1245 = true;
				}

				if (field16 == 0) {
					if (field1415 == 2) {
						field1201 = true;
					}

					if (field1415 == 3) {
						field1231 = true;
					}

					field1415 = 0;

					if (field1245 && field1236 >= 5) {
						field1322 = -1;
						method554();

						if (field1413 == field1322 && field1414 != field1321) {
							class4 var19 = class4.field56[field1413];
							byte var20 = 0;
							if (field1093 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1321] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1414;
								int var22 = field1321;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1414;
								int var24 = field1321;
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
								var19.method33(field1321, field1414);
							}

							field1407.method218(38);
							field1407.method220(field1413);
							field1407.method220(field1414);
							field1407.method220(field1321);
							field1407.method219(var20);
						}
					} else if ((field1165 == 1 || method466(field1265 - 1)) && field1265 > 2) {
						method481();
					} else if (field1265 > 0) {
						method485(field1265 - 1);
					}

					field1124 = 10;
					field23 = 0;
				}
			}

			field1128++;
			if (field1128 > 62) {
				field1128 = 0;
				field1407.method218(6);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method482(0, var26, var25, field1189.field411[0], 0, 0, 0, true, field1189.field410[0], 0, 0);
				class18.field292 = -1;

				if (var27) {
					field1250 = field24;
					field1251 = field25;
					field1253 = 1;
					field1252 = 0;
				}
			}

			if (field23 == 1 && field1480 != null) {
				field1480 = null;
				field1231 = true;
				field23 = 0;
			}

			method488();
			method525();
			method487();
			method484();

			if (field16 == 1 || field23 == 1) {
				field1289++;
			}

			if (field1323 == 2) {
				method538();
			}

			if (field1323 == 2 && field1164) {
				method477();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1276[var28]++;
			}

			method502();
			field15++;
			if (field15 > 4500) {
				field1349 = 250;
				field15 -= 500;
				field1407.method218(80);
			}

			field1420++;
			if (field1420 > 500) {
				field1420 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1405 += field1406;
				}

				if ((var29 & 0x2) == 2) {
					field1232 += field1233;
				}

				if ((var29 & 0x4) == 4) {
					field1254 += field1255;
				}
			}

			if (field1405 < -50) {
				field1406 = 2;
			}

			if (field1405 > 50) {
				field1406 = -2;
			}

			if (field1232 < -55) {
				field1233 = 2;
			}

			if (field1232 > 55) {
				field1233 = -2;
			}

			if (field1254 < -40) {
				field1255 = 1;
			}

			if (field1254 > 40) {
				field1255 = -1;
			}

			field1240++;
			if (field1240 > 500) {
				field1240 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1451 += field1452;
				}

				if ((var30 & 0x2) == 2) {
					field1174 += field1175;
				}
			}

			if (field1451 < -60) {
				field1452 = 2;
			}

			if (field1451 > 60) {
				field1452 = -2;
			}

			if (field1174 < -20) {
				field1175 = 1;
			}

			if (field1174 > 10) {
				field1175 = -1;
			}

			field1348++;
			if (field1348 > 50) {
				field1407.method218(115);
			}

			try {
				if (field1078 != null && field1407.field621 > 0) {
					field1078.method42(field1407.field620, field1407.field621, 0);
					field1407.field621 = 0;
					field1348 = 0;
				}
			} catch (IOException var32) {
				method515();
			} catch (Exception var33) {
				method542();
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method487() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1295[0] != -1) {
				field1201 = true;
				field1288 = 0;
				field1249 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1295[1] != -1) {
				field1201 = true;
				field1288 = 1;
				field1249 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1295[2] != -1) {
				field1201 = true;
				field1288 = 2;
				field1249 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1295[3] != -1) {
				field1201 = true;
				field1288 = 3;
				field1249 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1295[4] != -1) {
				field1201 = true;
				field1288 = 4;
				field1249 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1295[5] != -1) {
				field1201 = true;
				field1288 = 5;
				field1249 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1295[6] != -1) {
				field1201 = true;
				field1288 = 6;
				field1249 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1295[7] != -1) {
				field1201 = true;
				field1288 = 7;
				field1249 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1295[8] != -1) {
				field1201 = true;
				field1288 = 8;
				field1249 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1295[9] != -1) {
				field1201 = true;
				field1288 = 9;
				field1249 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1295[10] != -1) {
				field1201 = true;
				field1288 = 10;
				field1249 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1295[11] != -1) {
				field1201 = true;
				field1288 = 11;
				field1249 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1295[12] != -1) {
				field1201 = true;
				field1288 = 12;
				field1249 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1295[13] != -1) {
				field1201 = true;
				field1288 = 13;
				field1249 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method488() {
		if (field1415 == 0) {
			int var1 = field23;
			if (field1475 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1389) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1333 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1333 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1333 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1334 - 10 || var2 > field1336 + field1334 + 10 || var3 < field1335 - 10 || var3 > field1337 + field1335 + 10) {
						field1389 = false;

						if (field1333 == 1) {
							field1201 = true;
						}

						if (field1333 == 2) {
							field1231 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1334;
					int var5 = field1335;
					int var6 = field1336;
					int var7 = field24;
					int var8 = field25;
					if (field1333 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1333 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1333 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1265; var10++) {
						int var11 = (field1265 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method485(var9);
					}

					field1389 = false;

					if (field1333 == 1) {
						field1201 = true;
					}

					if (field1333 == 2) {
						field1231 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1265 > 0) {
					int var12 = field1108[field1265 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1106[field1265 - 1];
						int var14 = field1107[field1265 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1245 = false;
							field1236 = 0;
							field1413 = var14;
							field1414 = var13;
							field1415 = 2;
							field1416 = field24;
							field1417 = field25;

							if (class4.field56[var14].field62 == field1367) {
								field1415 = 1;
							}

							if (class4.field56[var14].field62 == field1071) {
								field1415 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1165 == 1 || method466(field1265 - 1)) && field1265 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1265 > 0) {
					method485(field1265 - 1);
				}

				if (var1 != 2 || field1265 <= 0) {
					return;
				}

				method481();
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method489(int arg0) {
		if (!field1316) {
			if (class34.field592[17] >= arg0) {
				class36 var2 = class34.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1060 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1156;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1156 = var5;
				class34.method171(17);
			}

			if (class34.field592[24] >= arg0) {
				class36 var8 = class34.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1060 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1156;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1156 = var11;
				class34.method171(24);
			}

			if (class34.field592[34] >= arg0) {
				class36 var14 = class34.field586[34];
				int var15 = var14.field606 * var14.field605 - 1;
				int var16 = field1060 * var14.field605 * 2;
				byte[] var17 = var14.field603;
				byte[] var18 = field1156;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field603 = var18;
				field1156 = var17;
				class34.method171(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method490(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1167 = "";
				field1168 = "Connecting to server...";
				method518(true);
			}

			field1078 = new class5(this, method562(field1314 + 43594));
			long var4 = class51.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1407.field621 = 0;
			field1407.method219(14);
			field1407.method219(var6);
			field1078.method42(field1407.field620, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field1078.method39();
			}

			int var8 = field1078.method39();
			int var9 = var8;

			if (var8 == 0) {
				field1078.method41(field1229.field620, 0, 8);
				field1229.field621 = 0;
				field1474 = field1229.method235();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1474 >> 32), (int) field1474 };
				field1407.field621 = 0;
				field1407.method219(10);
				field1407.method223(var10[0]);
				field1407.method223(var10[1]);
				field1407.method223(var10[2]);
				field1407.method223(var10[3]);
				field1407.method223(signlink.uid);
				field1407.method226(arg0);
				field1407.method226(arg1);
				field1407.method244(field1115, field1403);
				field1200.field621 = 0;

				if (arg2) {
					field1200.method219(18);
				} else {
					field1200.method219(16);
				}

				field1200.method219(field1407.field621 + 36 + 1 + 1 + 2);
				field1200.method219(255);
				field1200.method220(299);
				field1200.method219(field1316 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field1200.method223(field1302[var11]);
				}

				field1200.method227(0, field1407.field621, field1407.field620);
				field1407.field625 = new class49(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field1221 = new class49(var10);
				field1078.method42(field1200.field620, field1200.field621, 0);
				var8 = field1078.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method490(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1157 = field1078.method39();
				field1300 = field1078.method39() == 1;
				field1065 = 0L;
				field1213 = 0;
				field1481.field870 = 0;
				field14 = true;
				field1257 = true;
				field1214 = true;
				field1407.field621 = 0;
				field1229.field621 = 0;
				field1346 = -1;
				field1196 = -1;
				field1197 = -1;
				field1198 = -1;
				field1345 = 0;
				field1347 = 0;
				field1338 = 0;
				field1349 = 0;
				field1447 = 0;
				field1265 = 0;
				field1389 = false;
				field15 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field1160[var13] = null;
				}

				field1088 = 0;
				field1475 = 0;
				field1323 = 0;
				field1261 = 0;
				field1405 = (int) (Math.random() * 100.0D) - 50;
				field1232 = (int) (Math.random() * 110.0D) - 55;
				field1254 = (int) (Math.random() * 80.0D) - 40;
				field1451 = (int) (Math.random() * 120.0D) - 60;
				field1174 = (int) (Math.random() * 30.0D) - 20;
				field1385 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1298 = 0;
				field1331 = -1;
				field1181 = 0;
				field1182 = 0;
				field1282 = 0;
				field1472 = 0;

				for (int var14 = 0; var14 < field1279; var14++) {
					field1281[var14] = null;
					field1286[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field1471[var15] = null;
				}

				field1189 = field1281[field1280] = new class27();
				field1161.method252();
				field1402.method252();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field1117[var16][var17][var18] = null;
						}
					}
				}

				field1190 = new class41();
				field1425 = 0;
				field1424 = 0;
				field1428 = -1;
				field1071 = -1;
				field1367 = -1;
				field1356 = -1;
				field1262 = -1;
				field1116 = false;
				field1288 = 3;
				field1064 = false;
				field1389 = false;
				field1431 = false;
				field1480 = null;
				field1310 = 0;
				field1177 = -1;
				field1362 = true;
				method471();

				for (int var19 = 0; var19 < 5; var19++) {
					field1352[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field1153[var20] = null;
					field1154[var20] = false;
				}

				field1123 = 0;
				field1179 = 0;
				field1061 = 0;
				field1275 = 0;
				field1312 = 0;
				field1079 = 0;
				field1120 = 0;
				field1063 = 0;
				field1072 = 0;
				method497();
			} else if (var8 == 3) {
				field1167 = "";
				field1168 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1167 = "Your account has been disabled.";
				field1168 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1167 = "Your account is already logged in.";
				field1168 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1167 = "RuneScape has been updated!";
				field1168 = "Please reload this page.";
			} else if (var8 == 7) {
				field1167 = "This world is full.";
				field1168 = "Please use a different world.";
			} else if (var8 == 8) {
				field1167 = "Unable to connect.";
				field1168 = "Login server offline.";
			} else if (var8 == 9) {
				field1167 = "Login limit exceeded.";
				field1168 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1167 = "Unable to connect.";
				field1168 = "Bad session id.";
			} else if (var8 == 11) {
				field1168 = "Login server rejected session.";
				field1168 = "Please try again.";
			} else if (var8 == 12) {
				field1167 = "You need a members account to login to this world.";
				field1168 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1167 = "Could not complete login.";
				field1168 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1167 = "The server is being updated.";
				field1168 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1214 = true;
				field1407.field621 = 0;
				field1229.field621 = 0;
				field1346 = -1;
				field1196 = -1;
				field1197 = -1;
				field1198 = -1;
				field1345 = 0;
				field1347 = 0;
				field1338 = 0;
				field1265 = 0;
				field1389 = false;
				field1412 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1167 = "Login attempts exceeded.";
				field1168 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1167 = "You are standing in a members-only area.";
				field1168 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1167 = "Invalid loginserver requested";
				field1168 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field1078.method39(); var21 >= 0; var21--) {
					field1167 = "You have only just left another world";
					field1168 = "Your profile will be transferred in: " + var21 + " seconds";
					method518(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method490(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field1167 = "Unexpected server response";
				field1168 = "Please try using a different world.";
			} else if (var9 != 0) {
				field1167 = "No response from server";
				field1168 = "Please try using a different world.";
			} else if (field1353 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field1353++;
				method490(arg0, arg1, arg2);
			} else {
				field1167 = "No response from loginserver";
				field1168 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field1167 = "";
			field1168 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method491() {
		if (field1332 != 0) {
			int var1 = 0;
			if (field1338 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1160[var2] != null) {
					int var3 = field1158[var2];
					String var4 = field1159[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1449 == 0 || field1449 == 1 && method435(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1465.method204("From:  " + var4 + field1160[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1157 >= 1) {
									field1318[field1265] = "Report abuse @whi@" + var4;
									field1108[field1265] = 2524;
									field1265++;
								}

								field1318[field1265] = "Add ignore @whi@" + var4;
								field1108[field1265] = 2047;
								field1265++;
								field1318[field1265] = "Add friend @whi@" + var4;
								field1108[field1265] = 2605;
								field1265++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1449 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method492() {
		field1256++;
		method514(true);
		method524(true);
		method514(false);
		method524(false);
		method516();
		method457();

		if (!field1164) {
			int var1 = field1384;
			if (field1263 / 256 > var1) {
				var1 = field1263 / 256;
			}

			if (field1242[4] && field1222[4] + 128 > var1) {
				var1 = field1222[4] + 128;
			}

			int var2 = field1385 + field1254 & 0x7FF;
			method519(var1, field1073, var1 * 3 + 600, field1074, method555(field1189.field360, field1122, field1189.field361) - 50, var2);
		}

		int var3;
		if (field1164) {
			var3 = method549();
		} else {
			var3 = method548();
		}

		int var4 = field1376;
		int var5 = field1377;
		int var6 = field1378;
		int var7 = field1379;
		int var8 = field1380;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1242[var9]) {
				int var10 = (int) (Math.random() * (field1230[var9] * 2 + 1) + Math.sin(field1375[var9] / 100.0D * field1276[var9]) * field1222[var9] - field1230[var9]);
				if (var9 == 0) {
					field1376 += var10;
				}

				if (var9 == 1) {
					field1377 += var10;
				}

				if (var9 == 2) {
					field1378 += var10;
				}

				if (var9 == 3) {
					field1380 = field1380 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1379 += var10;
					if (field1379 < 128) {
						field1379 = 128;
					}

					if (field1379 > 383) {
						field1379 = 383;
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
		field1408.method89(field1376, field1379, field1378, field1380, var3, field1377);
		field1408.method64();
		method453();
		method561();
		method489(var11);
		method512();
		field1100.method259(field9, 4, 4);
		field1376 = var4;
		field1377 = var5;
		field1378 = var6;
		field1379 = var7;
		field1380 = var8;
	}

	@ObfuscatedName("client.b(III)V")
	public final void method493(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1160[var4] != null) {
				int var5 = field1158[var4];
				int var6 = field1062 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1159[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1069 == 0 || field1069 == 1 && method435(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1189.field416)) {
						if (field1157 >= 1) {
							field1318[field1265] = "Report abuse @whi@" + var7;
							field1108[field1265] = 524;
							field1265++;
						}

						field1318[field1265] = "Add ignore @whi@" + var7;
						field1108[field1265] = 47;
						field1265++;
						field1318[field1265] = "Add friend @whi@" + var7;
						field1108[field1265] = 605;
						field1265++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1332 == 0 && (var5 == 7 || field1449 == 0 || field1449 == 1 && method435(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1157 >= 1) {
							field1318[field1265] = "Report abuse @whi@" + var7;
							field1108[field1265] = 524;
							field1265++;
						}

						field1318[field1265] = "Add ignore @whi@" + var7;
						field1108[field1265] = 47;
						field1265++;
						field1318[field1265] = "Add friend @whi@" + var7;
						field1108[field1265] = 605;
						field1265++;
					}

					var3++;
				}

				if (var5 == 4 && (field1216 == 0 || field1216 == 1 && method435(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1318[field1265] = "Accept trade @whi@" + var7;
						field1108[field1265] = 507;
						field1265++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1332 == 0 && field1449 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1216 == 0 || field1216 == 1 && method435(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1318[field1265] = "Accept challenge @whi@" + var7;
						field1108[field1265] = 957;
						field1265++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IBLlb;)V")
	public final void method494(int arg0, class38 arg1) {
		while (arg1.field622 + 21 < arg0 * 8) {
			int var3 = arg1.method240(14);
			if (var3 == 16383) {
				break;
			}

			if (field1471[var3] == null) {
				field1471[var3] = new class26();
			}

			class26 var4 = field1471[var3];
			field1473[field1472++] = var3;
			var4.field405 = field1217;
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
			var4.method110(field1189.field411[0] + var6, var7 == 1, field1189.field410[0] + var5);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1285[field1284++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method495(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.u(I)V")
	public static final void method496() {
		class18.field258 = false;
		class34.field573 = false;
		field1316 = false;
		class3.field32 = false;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 299);

			if (arg0.length == 5) {
				field1313 = Integer.parseInt(arg0[0]);
				field1314 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method458();
				} else if (arg0[2].equals("highmem")) {
					method496();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1315 = false;
				} else if (arg0[3].equals("members")) {
					field1315 = true;
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

	@ObfuscatedName("client.h(B)V")
	public final void method497() {
		if (field1101 == null) {
			method440();
			field10 = null;
			field1453 = null;
			field1454 = null;
			field1455 = null;
			field1456 = null;
			field1457 = null;
			field1458 = null;
			field1459 = null;
			field1460 = null;
			field1461 = null;
			field1101 = new class43(method11(), 96, 479);
			field1099 = new class43(method11(), 156, 172);
			class33.method155();
			field1141.method199(0, 0);
			field1098 = new class43(method11(), 261, 190);
			field1100 = new class43(method11(), 334, 512);
			class33.method155();
			field1363 = new class43(method11(), 50, 496);
			field1364 = new class43(method11(), 37, 269);
			field1365 = new class43(method11(), 45, 249);
			field1241 = true;
		}
	}

	@ObfuscatedName("client.m(Z)Z")
	public final boolean method498() {
		if (field1078 == null) {
			return false;
		}

		try {
			int var1 = field1078.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1346 == -1) {
				field1078.method41(field1229.field620, 0, 1);
				field1346 = field1229.field620[0] & 0xFF;
				if (field1221 != null) {
					field1346 = field1346 - field1221.method295() & 0xFF;
				}

				field1345 = class61.field958[field1346];
				var1--;
			}

			if (field1345 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1078.method41(field1229.field620, 0, 1);
				field1345 = field1229.field620[0] & 0xFF;
				var1--;
			}

			if (field1345 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1078.method41(field1229.field620, 0, 2);
				field1229.field621 = 0;
				field1345 = field1229.method231();
				var1 -= 2;
			}

			if (var1 < field1345) {
				return false;
			}

			field1229.field621 = 0;
			field1078.method41(field1229.field620, 0, field1345);
			field1347 = 0;
			field1198 = field1197;
			field1197 = field1196;
			field1196 = field1346;

			if (field1346 == 238) {
				String var2 = field1229.method236();
				if (var2.endsWith(":tradereq:")) {
					String var3 = var2.substring(0, var2.indexOf(":"));
					long var4 = class51.method300(var3);
					boolean var6 = false;
					for (int var7 = 0; var7 < field1180; var7++) {
						if (field1391[var7] == var4) {
							var6 = true;
							break;
						}
					}

					if (!var6 && field1366 == 0) {
						method559(4, var3, "wishes to trade with you.");
					}
				} else if (var2.endsWith(":duelreq:")) {
					String var8 = var2.substring(0, var2.indexOf(":"));
					long var9 = class51.method300(var8);
					boolean var11 = false;
					for (int var12 = 0; var12 < field1180; var12++) {
						if (field1391[var12] == var9) {
							var11 = true;
							break;
						}
					}

					if (!var11 && field1366 == 0) {
						method559(8, var8, "wishes to duel with you.");
					}
				} else if (var2.endsWith(":chalreq:")) {
					String var13 = var2.substring(0, var2.indexOf(":"));
					long var14 = class51.method300(var13);
					boolean var16 = false;
					for (int var17 = 0; var17 < field1180; var17++) {
						if (field1391[var17] == var14) {
							var16 = true;
							break;
						}
					}

					if (!var16 && field1366 == 0) {
						String var18 = var2.substring(var2.indexOf(":") + 1, var2.length() - 9);
						method559(8, var13, var18);
					}
				} else {
					method559(0, "", var2);
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 118) {
				field1425 = field1229.method229();
				field1201 = true;
				field1346 = -1;
				return true;
			}

			if (field1346 == 75) {
				method542();
				field1346 = -1;
				return false;
			}

			if (field1346 == 169) {
				int var19 = field1229.method231();
				String var20 = field1229.method236();
				class4.field56[var19].field97 = var20;

				if (field1295[field1288] == class4.field56[var19].field62) {
					field1201 = true;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 196) {
				method507(field1345, field1229);
				field1234 = false;
				field1346 = -1;
				return true;
			}

			if (field1346 == 108) {
				field1296 = field1229.method229();
				field1297 = field1229.method229();

				while (field1229.field621 < field1345) {
					int var21 = field1229.method229();
					method464(field1229, var21);
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 188) {
				field1201 = true;
				int var22 = field1229.method231();
				class4 var23 = class4.field56[var22];
				int var24 = field1229.method231();
				for (int var25 = 0; var25 < var24; var25++) {
					var23.field57[var25] = field1229.method231();
					int var26 = field1229.method229();
					if (var26 == 255) {
						var26 = field1229.method234();
					}

					var23.field58[var25] = var26;
				}

				for (int var27 = var24; var27 < var23.field57.length; var27++) {
					var23.field57[var27] = 0;
					var23.field58[var27] = 0;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 195) {
				method450(field1345, field1229);
				field1346 = -1;
				return true;
			}

			if (field1346 == 170) {
				int var28 = field1229.method231();
				int var29 = field1229.method231();
				if (field1084 == var28 && field1085 == var29 && field1323 == 2) {
					field1346 = -1;
					return true;
				}

				field1084 = var28;
				field1085 = var29;
				field1267 = (field1084 - 6) * 8;
				field1268 = (field1085 - 6) * 8;
				field1469 = false;
				if ((field1084 / 8 == 48 || field1084 / 8 == 49) && field1085 / 8 == 48) {
					field1469 = true;
				}

				if (field1084 / 8 == 48 && field1085 / 8 == 148) {
					field1469 = true;
				}

				field1323 = 1;
				field1412 = System.currentTimeMillis();
				field1100.method258();
				field1465.method202("Loading - please wait.", 151, 0, 257);
				field1465.method202("Loading - please wait.", 150, 0xFFFFFF, 256);
				field1100.method259(field9, 4, 4);
				int var30 = 0;
				for (int var31 = (field1084 - 6) / 8; var31 <= (field1084 + 6) / 8; var31++) {
					for (int var32 = (field1085 - 6) / 8; var32 <= (field1085 + 6) / 8; var32++) {
						var30++;
					}
				}

				field1184 = new byte[var30][];
				field1143 = new byte[var30][];
				field1147 = new int[var30];
				field1148 = new int[var30];
				field1149 = new int[var30];
				int var33 = 0;
				for (int var34 = (field1084 - 6) / 8; var34 <= (field1084 + 6) / 8; var34++) {
					for (int var35 = (field1085 - 6) / 8; var35 <= (field1085 + 6) / 8; var35++) {
						field1147[var33] = (var34 << 8) + var35;

						if (field1469 && (var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || var34 == 49 && var35 == 47)) {
							field1148[var33] = -1;
							field1149[var33] = -1;
							var33++;
						} else {
							int var36 = field1148[var33] = field1330.method274(var35, 0, var34);
							if (var36 != -1) {
								field1330.method279(3, var36);
							}

							int var37 = field1149[var33] = field1330.method274(var35, 1, var34);
							if (var37 != -1) {
								field1330.method279(3, var37);
							}

							var33++;
						}
					}
				}

				int var38 = field1267 - field1269;
				int var39 = field1268 - field1270;
				field1269 = field1267;
				field1270 = field1268;

				for (int var40 = 0; var40 < 16384; var40++) {
					class26 var41 = field1471[var40];
					if (var41 != null) {
						for (int var42 = 0; var42 < 10; var42++) {
							var41.field410[var42] -= var38;
							var41.field411[var42] -= var39;
						}

						var41.field360 -= var38 * 128;
						var41.field361 -= var39 * 128;
					}
				}

				for (int var43 = 0; var43 < field1279; var43++) {
					class27 var44 = field1281[var43];
					if (var44 != null) {
						for (int var45 = 0; var45 < 10; var45++) {
							var44.field410[var45] -= var38;
							var44.field411[var45] -= var39;
						}

						var44.field360 -= var38 * 128;
						var44.field361 -= var39 * 128;
					}
				}

				field1234 = true;
				byte var46 = 0;
				byte var47 = 104;
				byte var48 = 1;
				if (var38 < 0) {
					var46 = 103;
					var47 = -1;
					var48 = -1;
				}

				byte var49 = 0;
				byte var50 = 104;
				byte var51 = 1;
				if (var39 < 0) {
					var49 = 103;
					var50 = -1;
					var51 = -1;
				}

				for (int var52 = var46; var52 != var47; var52 += var48) {
					for (int var53 = var49; var53 != var50; var53 += var51) {
						int var54 = var38 + var52;
						int var55 = var39 + var53;
						for (int var56 = 0; var56 < 4; var56++) {
							if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
								field1117[var56][var52][var53] = field1117[var56][var54][var55];
							} else {
								field1117[var56][var52][var53] = null;
							}
						}
					}
				}

				for (class40 var57 = (class40) field1190.method248(); var57 != null; var57 = (class40) field1190.method250()) {
					var57.field640 -= var38;
					var57.field641 -= var39;
					if (var57.field640 < 0 || var57.field641 < 0 || var57.field640 >= 104 || var57.field641 >= 104) {
						var57.method106();
					}
				}

				if (field1181 != 0) {
					field1181 -= var38;
					field1182 -= var39;
				}

				field1164 = false;
				field1346 = -1;
				return true;
			}

			if (field1346 == 83) {
				field1181 = 0;
				field1346 = -1;
				return true;
			}

			if (field1346 == 213) {
				int var58 = field1229.method231();
				byte var59 = field1229.method230();
				field1390[var58] = var59;

				if (field1202[var58] != var59) {
					field1202[var58] = var59;
					method550(var58);
					field1201 = true;

					if (field1428 != -1) {
						field1231 = true;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 153) {
				int var60 = field1229.method231();
				int var61 = field1229.method231();
				int var62 = field1229.method231();

				if (var61 == 0xFFFF) {
					class4.field56[var60].field105 = 0;
					field1346 = -1;
					return true;
				}

				class60 var63 = class60.method348(var61);
				class4.field56[var60].field105 = 4;
				class4.field56[var60].field106 = var61;
				class4.field56[var60].field112 = var63.field922;
				class4.field56[var60].field113 = var63.field923;
				class4.field56[var60].field111 = var63.field921 * 100 / var62;
				field1346 = -1;
				return true;
			}

			if (field1346 == 19) {
				field1310 = field1229.method229();
				field1346 = -1;
				return true;
			}

			if (field1346 == 212) {
				if (field1356 != -1) {
					field1356 = -1;
					field1201 = true;
					field1249 = true;
				}

				if (field1071 != -1) {
					field1071 = -1;
					field1231 = true;
				}

				if (field1064) {
					field1064 = false;
					field1231 = true;
				}

				field1367 = -1;
				field1116 = false;
				field1346 = -1;
				return true;
			}

			if (field1346 == 186) {
				int var64 = field1229.method231();
				int var65 = field1229.method232();
				class4 var66 = class4.field56[var64];
				var66.field109 = var65;

				if (var65 == -1) {
					var66.field59 = 0;
					var66.field60 = 0;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 33) {
				field1068 = field1229.method231();
				field1341 = field1229.method229();
				field1346 = -1;
				return true;
			}

			if (field1346 == 181) {
				field1177 = field1229.method229();
				if (field1288 == field1177) {
					if (field1177 == 3) {
						field1288 = 1;
					} else {
						field1288 = 3;
					}

					field1201 = true;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 138) {
				field1164 = false;

				for (int var67 = 0; var67 < 5; var67++) {
					field1242[var67] = false;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 55) {
				field1447 = field1229.method229();
				if (field1447 == 1) {
					field1102 = field1229.method231();
				}

				if (field1447 >= 2 && field1447 <= 6) {
					if (field1447 == 2) {
						field1113 = 64;
						field1114 = 64;
					}

					if (field1447 == 3) {
						field1113 = 0;
						field1114 = 64;
					}

					if (field1447 == 4) {
						field1113 = 128;
						field1114 = 64;
					}

					if (field1447 == 5) {
						field1113 = 64;
						field1114 = 0;
					}

					if (field1447 == 6) {
						field1113 = 64;
						field1114 = 128;
					}

					field1447 = 2;
					field1110 = field1229.method231();
					field1111 = field1229.method231();
					field1112 = field1229.method229();
				}

				if (field1447 == 10) {
					field1139 = field1229.method231();
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 105) {
				field1180 = field1345 / 8;
				for (int var68 = 0; var68 < field1180; var68++) {
					field1391[var68] = field1229.method235();
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 145) {
				int var69 = field1229.method231();
				int var70 = field1229.method234();
				field1390[var69] = var70;

				if (field1202[var69] != var70) {
					field1202[var69] = var70;
					method550(var69);
					field1201 = true;

					if (field1428 != -1) {
						field1231 = true;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 44) {
				field1296 = field1229.method229();
				field1297 = field1229.method229();
				for (int var71 = field1296; var71 < field1296 + 8; var71++) {
					for (int var72 = field1297; var72 < field1297 + 8; var72++) {
						if (field1117[field1122][var71][var72] != null) {
							field1117[field1122][var71][var72] = null;
							method508(var71, var72);
						}
					}
				}

				for (class40 var73 = (class40) field1190.method248(); var73 != null; var73 = (class40) field1190.method250()) {
					if (var73.field640 >= field1296 && var73.field640 < field1296 + 8 && var73.field641 >= field1297 && var73.field641 < field1297 + 8 && field1122 == var73.field638) {
						var73.field649 = 0;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 141) {
				int var74 = field1229.method231();
				int var75 = field1229.method229();

				if (var74 == 0xFFFF) {
					var74 = -1;
				}

				field1295[var75] = var74;
				field1201 = true;
				field1249 = true;
				field1346 = -1;
				return true;
			}

			if (field1346 == 38) {
				int var76 = field1229.method231();
				if (var76 == 0xFFFF) {
					var76 = -1;
				}

				if (field1235 != var76 && field1404 && !field1316 && field1215 == 0) {
					field1327 = var76;
					field1328 = true;
					field1330.method279(2, field1327);
				}

				field1235 = var76;
				field1346 = -1;
				return true;
			}

			if (field1346 == 183) {
				int var77 = field1229.method231();
				int var78 = field1229.method231();
				if (field1404 && !field1316) {
					field1327 = var77;
					field1328 = false;
					field1330.method279(2, field1327);
					field1215 = var78;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 85) {
				int var79 = field1229.method231();
				int var80 = field1229.method231();
				class4 var81 = class4.field56[var79];
				if (var81 != null && var81.field63 == 0) {
					if (var80 < 0) {
						var80 = 0;
					}

					if (var80 > var81.field75 - var81.field67) {
						var80 = var81.field75 - var81.field67;
					}

					var81.field76 = var80;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 111) {
				for (int var82 = 0; var82 < field1281.length; var82++) {
					if (field1281[var82] != null) {
						field1281[var82].field388 = -1;
					}
				}

				for (int var83 = 0; var83 < field1471.length; var83++) {
					if (field1471[var83] != null) {
						field1471[var83].field388 = -1;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 77) {
				int var84 = field1229.method231();
				method544(var84);

				if (field1356 != -1) {
					field1356 = -1;
					field1201 = true;
					field1249 = true;
				}

				field1071 = var84;
				field1231 = true;
				field1367 = -1;
				field1116 = false;
				field1346 = -1;
				return true;
			}

			if (field1346 == 3) {
				field1288 = field1229.method229();
				field1201 = true;
				field1249 = true;
				field1346 = -1;
				return true;
			}

			if (field1346 == 81) {
				int var85 = field1229.method231();
				int var86 = field1229.method231();
				int var87 = field1229.method231();
				int var88 = field1229.method231();
				class4.field56[var85].field112 = var86;
				class4.field56[var85].field113 = var87;
				class4.field56[var85].field111 = var88;
				field1346 = -1;
				return true;
			}

			if (field1346 == 22) {
				field1296 = field1229.method229();
				field1297 = field1229.method229();
				field1346 = -1;
				return true;
			}

			if (field1346 == 185) {
				int var89 = field1229.method231();
				int var90 = field1229.method231();
				class4.field56[var89].field105 = 1;
				class4.field56[var89].field106 = var90;
				field1346 = -1;
				return true;
			}

			if (field1346 == 13) {
				field1201 = true;
				int var91 = field1229.method231();
				class4 var92 = class4.field56[var91];
				while (field1229.field621 < field1345) {
					int var93 = field1229.method243();
					int var94 = field1229.method231();
					int var95 = field1229.method229();
					if (var95 == 255) {
						var95 = field1229.method234();
					}

					if (var93 >= 0 && var93 < var92.field57.length) {
						var92.field57[var93] = var94;
						var92.field58[var93] = var95;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 214) {
				int var96 = field1229.method231();
				int var97 = field1229.method231();
				int var98 = var97 >> 10 & 0x1F;
				int var99 = var97 >> 5 & 0x1F;
				int var100 = var97 & 0x1F;
				class4.field56[var96].field99 = (var100 << 3) + (var98 << 19) + (var99 << 11);
				field1346 = -1;
				return true;
			}

			if (field1346 == 98) {
				int var101 = field1229.method229();
				int var102 = field1229.method229();
				String var103 = field1229.method236();
				if (var101 >= 1 && var101 <= 5) {
					if (var103.equalsIgnoreCase("null")) {
						var103 = null;
					}

					field1153[var101 - 1] = var103;
					field1154[var101 - 1] = var102 == 0;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 204) {
				int var104 = field1229.method231();
				class4 var105 = class4.field56[var104];
				for (int var106 = 0; var106 < var105.field57.length; var106++) {
					var105.field57[var106] = -1;
					var105.field57[var106] = 0;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 156) {
				if (field1288 == 12) {
					field1201 = true;
				}

				field1355 = field1229.method232();
				field1346 = -1;
				return true;
			}

			if (field1346 == 151) {
				field1201 = true;
				int var107 = field1229.method229();
				int var108 = field1229.method234();
				int var109 = field1229.method229();
				field1218[var107] = var108;
				field1067[var107] = var109;
				field1238[var107] = 1;
				for (int var110 = 0; var110 < 98; var110++) {
					if (var108 >= field1305[var110]) {
						field1238[var107] = var110 + 2;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 222 || field1346 == 253 || field1346 == 191 || field1346 == 137 || field1346 == 193 || field1346 == 30 || field1346 == 53 || field1346 == 147 || field1346 == 2 || field1346 == 211 || field1346 == 136) {
				method464(field1229, field1346);
				field1346 = -1;
				return true;
			}

			if (field1346 == 45) {
				int var111 = field1229.method231();
				int var112 = field1229.method229();
				int var113 = field1229.method231();
				if (field1388 && !field1316 && field1261 < 50) {
					field1146[field1261] = var111;
					field1418[field1261] = var112;
					field1097[field1261] = class55.field790[var111] + var113;
					field1261++;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 62) {
				field1431 = false;
				field1064 = true;
				field1258 = "";
				field1231 = true;
				field1346 = -1;
				return true;
			}

			if (field1346 == 149) {
				long var114 = field1229.method235();
				int var116 = field1229.method229();
				String var117 = class51.method304(class51.method301(var114));
				for (int var118 = 0; var118 < field1424; var118++) {
					if (field1244[var118] == var114) {
						if (field1178[var118] != var116) {
							field1178[var118] = var116;
							field1201 = true;

							if (var116 > 0) {
								method559(5, "", var117 + " has logged in.");
							}

							if (var116 == 0) {
								method559(5, "", var117 + " has logged out.");
							}
						}

						var117 = null;
						break;
					}
				}

				if (var117 != null && field1424 < 200) {
					field1244[field1424] = var114;
					field1419[field1424] = var117;
					field1178[field1424] = var116;
					field1424++;
					field1201 = true;
				}

				boolean var119 = false;
				while (!var119) {
					var119 = true;
					for (int var120 = 0; var120 < field1424 - 1; var120++) {
						if (field1178[var120] != field1313 && field1178[var120 + 1] == field1313 || field1178[var120] == 0 && field1178[var120 + 1] != 0) {
							int var121 = field1178[var120];
							field1178[var120] = field1178[var120 + 1];
							field1178[var120 + 1] = var121;
							String var122 = field1419[var120];
							field1419[var120] = field1419[var120 + 1];
							field1419[var120 + 1] = var122;
							long var123 = field1244[var120];
							field1244[var120] = field1244[var120 + 1];
							field1244[var120 + 1] = var123;
							field1201 = true;
							var119 = false;
						}
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 226) {
				for (int var125 = 0; var125 < field1202.length; var125++) {
					if (field1390[var125] != field1202[var125]) {
						field1202[var125] = field1390[var125];
						method550(var125);
						field1201 = true;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 131) {
				field1298 = field1229.method229();
				field1346 = -1;
				return true;
			}

			if (field1346 == 9) {
				int var126 = field1229.method232();
				field1428 = var126;
				field1231 = true;
				field1346 = -1;
				return true;
			}

			if (field1346 == 237) {
				int var127 = field1229.method231();
				method544(var127);

				if (field1071 != -1) {
					field1071 = -1;
					field1231 = true;
				}

				if (field1064) {
					field1064 = false;
					field1231 = true;
				}

				field1356 = var127;
				field1201 = true;
				field1249 = true;
				field1367 = -1;
				field1116 = false;
				field1346 = -1;
				return true;
			}

			if (field1346 == 115) {
				field1164 = true;
				field1208 = field1229.method229();
				field1209 = field1229.method229();
				field1210 = field1229.method231();
				field1211 = field1229.method229();
				field1212 = field1229.method229();
				if (field1212 >= 100) {
					field1376 = field1208 * 128 + 64;
					field1378 = field1209 * 128 + 64;
					field1377 = method555(field1376, field1122, field1378) - field1210;
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 224) {
				long var128 = field1229.method235();
				int var130 = field1229.method234();
				int var131 = field1229.method229();
				boolean var132 = false;
				for (int var133 = 0; var133 < 100; var133++) {
					if (field1423[var133] == var130) {
						var132 = true;
						break;
					}
				}

				if (var131 <= 1) {
					for (int var134 = 0; var134 < field1180; var134++) {
						if (field1391[var134] == var128) {
							var132 = true;
							break;
						}
					}
				}

				if (!var132 && field1366 == 0) {
					try {
						field1423[field1306] = var130;
						field1306 = (field1306 + 1) % 100;
						String var135 = class52.method306(field1345 - 13, field1229);
						var135 = class71.method401(var135);
						if (var131 == 2 || var131 == 3) {
							method559(7, "@cr2@" + class51.method304(class51.method301(var128)), var135);
						} else if (var131 == 1) {
							method559(7, "@cr1@" + class51.method304(class51.method301(var128)), var135);
						} else {
							method559(3, class51.method304(class51.method301(var128)), var135);
						}
					} catch (Exception var166) {
						signlink.reporterror("cde1");
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 51) {
				int var137 = field1229.method231();
				boolean var138 = field1229.method229() == 1;
				class4.field56[var137].field77 = var138;
				field1346 = -1;
				return true;
			}

			if (field1346 == 7) {
				int var139 = field1229.method231();
				int var140 = field1229.method231();
				class4.field56[var139].field105 = 2;
				class4.field56[var139].field106 = var140;
				field1346 = -1;
				return true;
			}

			if (field1346 == 130) {
				int var141 = field1229.method231();
				int var142 = field1229.method232();
				int var143 = field1229.method232();
				class4 var144 = class4.field56[var141];
				var144.field69 = var142;
				var144.field70 = var143;
				field1346 = -1;
				return true;
			}

			if (field1346 == 245) {
				int var145 = field1229.method231();
				int var146 = field1229.method231();

				if (field1071 != -1) {
					field1071 = -1;
					field1231 = true;
				}

				if (field1064) {
					field1064 = false;
					field1231 = true;
				}

				field1367 = var145;
				field1356 = var146;
				field1201 = true;
				field1249 = true;
				field1116 = false;
				field1346 = -1;
				return true;
			}

			if (field1346 == 246) {
				int var147 = field1229.method232();
				if (var147 >= 0) {
					method544(var147);
				}

				field1262 = var147;
				field1346 = -1;
				return true;
			}

			if (field1346 == 92) {
				int var148 = field1229.method229();
				int var149 = field1229.method229();
				int var150 = field1229.method229();
				int var151 = field1229.method229();
				field1242[var148] = true;
				field1230[var148] = var149;
				field1222[var148] = var150;
				field1375[var148] = var151;
				field1276[var148] = 0;
				field1346 = -1;
				return true;
			}

			if (field1346 == 228) {
				field1338 = field1229.method231() * 30;
				field1346 = -1;
				return true;
			}

			if (field1346 == 94) {
				int var152 = field1229.method231();
				class4.field56[var152].field105 = 3;

				if (field1189.field438 == null) {
					class4.field56[var152].field106 = (field1189.field420[11] << 5) + (field1189.field420[8] << 10) + (field1189.field420[0] << 15) + (field1189.field421[0] << 25) + (field1189.field421[4] << 20) + field1189.field420[1];
				} else {
					class4.field56[var152].field106 = (int) (field1189.field438.field879 + 0x12345678L);
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 206) {
				field1069 = field1229.method229();
				field1449 = field1229.method229();
				field1216 = field1229.method229();
				field1081 = true;
				field1231 = true;
				field1346 = -1;
				return true;
			}

			if (field1346 == 27) {
				if (field1288 == 12) {
					field1201 = true;
				}

				field1374 = field1229.method229();
				field1346 = -1;
				return true;
			}

			if (field1346 == 241) {
				field1164 = true;
				field1432 = field1229.method229();
				field1433 = field1229.method229();
				field1434 = field1229.method231();
				field1435 = field1229.method229();
				field1436 = field1229.method229();
				if (field1436 >= 100) {
					int var153 = field1432 * 128 + 64;
					int var154 = field1433 * 128 + 64;
					int var155 = method555(var153, field1122, var154) - field1434;
					int var156 = var153 - field1376;
					int var157 = var155 - field1377;
					int var158 = var154 - field1378;
					int var159 = (int) Math.sqrt(var156 * var156 + var158 * var158);
					field1379 = (int) (Math.atan2(var157, var159) * 325.949D) & 0x7FF;
					field1380 = (int) (Math.atan2(var156, var158) * -325.949D) & 0x7FF;

					if (field1379 < 128) {
						field1379 = 128;
					}

					if (field1379 > 383) {
						field1379 = 383;
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 119) {
				field1430 = field1229.method234();
				field1187 = field1229.method231();
				field1383 = field1229.method229();
				field1195 = field1229.method231();
				field1082 = field1229.method229();
				if (field1430 != 0 && field1367 == -1) {
					signlink.dnslookup(class51.method303(field1430));
					method475();
					short var160 = 650;
					if (field1383 != 201 || field1082 == 1) {
						var160 = 655;
					}

					field1259 = "";
					field1437 = false;

					for (int var161 = 0; var161 < class4.field56.length; var161++) {
						if (class4.field56[var161] != null && class4.field56[var161].field65 == var160) {
							field1367 = class4.field56[var161].field62;
							break;
						}
					}
				}

				field1346 = -1;
				return true;
			}

			if (field1346 == 236) {
				int var162 = field1229.method231();
				method544(var162);

				if (field1356 != -1) {
					field1356 = -1;
					field1201 = true;
					field1249 = true;
				}

				if (field1071 != -1) {
					field1071 = -1;
					field1231 = true;
				}

				if (field1064) {
					field1064 = false;
					field1231 = true;
				}

				field1367 = var162;
				field1116 = false;
				field1346 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1346 + "," + field1345 + " - " + field1197 + "," + field1198);
			method542();
		} catch (IOException var167) {
			method515();
		} catch (Exception var168) {
			String var164 = "T2 - " + field1346 + "," + field1197 + "," + field1198 + " - " + field1345 + "," + (field1189.field410[0] + field1267) + "," + (field1189.field411[0] + field1268) + " - ";
			for (int var165 = 0; var165 < field1345 && var165 < 50; var165++) {
				var164 = var164 + field1229.field620[var165] + ",";
			}

			signlink.reporterror(var164);
			method542();
		}

		return true;
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method499(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method499(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method500(var6);
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

	@ObfuscatedName("client.a(Ld;Z)Z")
	public final boolean method500(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method433(arg0, var2);
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

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method501(String arg0) throws IOException {
		if (field1357) {
			if (field1308 != null) {
				try {
					field1308.close();
				} catch (Exception var4) {
				}

				field1308 = null;
			}

			field1308 = method562(43595);
			field1308.setSoTimeout(10000);
			InputStream var2 = field1308.getInputStream();
			OutputStream var3 = field1308.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.v(I)V")
	public final void method502() {
		field1080++;
		if (field1080 > 192) {
			field1080 = 0;
			field1407.method218(24);
			field1407.method219(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1367 != -1 && field1367 == field1301) {
						break;
					}

					if (field1431) {
						if (var1 >= 32 && var1 <= 122 && field1077.length() < 80) {
							field1077 = field1077 + (char) var1;
							field1231 = true;
						}

						if (var1 == 8 && field1077.length() > 0) {
							field1077 = field1077.substring(0, field1077.length() - 1);
							field1231 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1431 = false;
							field1231 = true;

							if (field1207 == 1) {
								long var2 = class51.method300(field1077);
								method520(var2);
							}

							if (field1207 == 2 && field1424 > 0) {
								long var4 = class51.method300(field1077);
								method541(var4);
							}

							if (field1207 == 3 && field1077.length() > 0) {
								field1407.method218(47);
								field1407.method219(0);
								int var6 = field1407.field621;
								field1407.method225(field1450);
								class52.method307(field1407, field1077);
								field1407.method228(field1407.field621 - var6);
								field1077 = class52.method308(field1077);
								field1077 = class71.method401(field1077);
								method559(6, class51.method304(class51.method301(field1450)), field1077);

								if (field1449 == 2) {
									field1449 = 1;
									field1081 = true;
									field1407.method218(242);
									field1407.method219(field1069);
									field1407.method219(field1449);
									field1407.method219(field1216);
								}
							}

							if (field1207 == 4 && field1180 < 100) {
								long var7 = class51.method300(field1077);
								method441(var7);
							}

							if (field1207 == 5 && field1180 > 0) {
								long var9 = class51.method300(field1077);
								method509(var9);
							}
						}
					} else if (field1064) {
						if (var1 >= 48 && var1 <= 57 && field1258.length() < 10) {
							field1258 = field1258 + (char) var1;
							field1231 = true;
						}

						if (var1 == 8 && field1258.length() > 0) {
							field1258 = field1258.substring(0, field1258.length() - 1);
							field1231 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1258.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1258);
								} catch (Exception var18) {
								}

								field1407.method218(236);
								field1407.method223(var11);
							}

							field1064 = false;
							field1231 = true;
						}
					} else if (field1071 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1171.length() < 80) {
							field1171 = field1171 + (char) var1;
							field1231 = true;
						}

						if (var1 == 8 && field1171.length() > 0) {
							field1171 = field1171.substring(0, field1171.length() - 1);
							field1231 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1171.length() > 0) {
							if (field1157 == 2) {
								if (field1171.equals("::clientdrop")) {
									method515();
								}

								if (field1171.equals("::lag")) {
									method463();
								}

								if (field1171.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1330.method272(2); var12++) {
										field1330.method282((byte) 1, var12, 2);
									}
								}

								if (field1171.equals("::fpson")) {
									field1096 = true;
								}

								if (field1171.equals("::fpsoff")) {
									field1096 = false;
								}
							}

							if (field1171.startsWith("::")) {
								field1407.method218(248);
								field1407.method219(field1171.length() - 1);
								field1407.method226(field1171.substring(2));
							} else {
								String var13 = field1171.toLowerCase();
								byte var14 = 0;
								if (var13.startsWith("yellow:")) {
									var14 = 0;
									field1171 = field1171.substring(7);
								} else if (var13.startsWith("red:")) {
									var14 = 1;
									field1171 = field1171.substring(4);
								} else if (var13.startsWith("green:")) {
									var14 = 2;
									field1171 = field1171.substring(6);
								} else if (var13.startsWith("cyan:")) {
									var14 = 3;
									field1171 = field1171.substring(5);
								} else if (var13.startsWith("purple:")) {
									var14 = 4;
									field1171 = field1171.substring(7);
								} else if (var13.startsWith("white:")) {
									var14 = 5;
									field1171 = field1171.substring(6);
								} else if (var13.startsWith("flash1:")) {
									var14 = 6;
									field1171 = field1171.substring(7);
								} else if (var13.startsWith("flash2:")) {
									var14 = 7;
									field1171 = field1171.substring(7);
								} else if (var13.startsWith("flash3:")) {
									var14 = 8;
									field1171 = field1171.substring(7);
								} else if (var13.startsWith("glow1:")) {
									var14 = 9;
									field1171 = field1171.substring(6);
								} else if (var13.startsWith("glow2:")) {
									var14 = 10;
									field1171 = field1171.substring(6);
								} else if (var13.startsWith("glow3:")) {
									var14 = 11;
									field1171 = field1171.substring(6);
								}

								String var15 = field1171.toLowerCase();
								byte var16 = 0;
								if (var15.startsWith("wave:")) {
									var16 = 1;
									field1171 = field1171.substring(5);
								} else if (var15.startsWith("wave2:")) {
									var16 = 2;
									field1171 = field1171.substring(6);
								} else if (var15.startsWith("shake:")) {
									var16 = 3;
									field1171 = field1171.substring(6);
								} else if (var15.startsWith("scroll:")) {
									var16 = 4;
									field1171 = field1171.substring(7);
								} else if (var15.startsWith("slide:")) {
									var16 = 5;
									field1171 = field1171.substring(6);
								}

								field1407.method218(37);
								field1407.method219(0);
								int var17 = field1407.field621;
								field1407.method219(var14);
								field1407.method219(var16);
								class52.method307(field1407, field1171);
								field1407.method228(field1407.field621 - var17);
								field1171 = class52.method308(field1171);
								field1171 = class71.method401(field1171);
								field1189.field372 = field1171;
								field1189.field374 = var14;
								field1189.field375 = var16;
								field1189.field373 = 150;

								if (field1157 == 2) {
									method559(2, "@cr2@" + field1189.field416, field1189.field372);
								} else if (field1157 == 1) {
									method559(2, "@cr1@" + field1189.field416, field1189.field372);
								} else {
									method559(2, field1189.field416, field1189.field372);
								}

								if (field1069 == 2) {
									field1069 = 3;
									field1081 = true;
									field1407.method218(242);
									field1407.method219(field1069);
									field1407.method219(field1449);
									field1407.method219(field1216);
								}
							}

							field1171 = "";
							field1231 = true;
						}
					}
				}

				if (var1 == 8 && field1259.length() > 0) {
					field1259 = field1259.substring(0, field1259.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1259.length() < 12) {
				field1259 = field1259 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method503() {
		for (int var1 = -1; var1 < field1282; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1280;
			} else {
				var2 = field1283[var1];
			}

			class27 var3 = field1281[var2];
			if (var3 != null) {
				method529(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method504(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(1);
		if (var3 != 0) {
			int var4 = arg1.method240(2);
			if (var4 == 0) {
				field1285[field1284++] = field1280;
			} else if (var4 == 1) {
				int var5 = arg1.method240(3);
				field1189.method111(false, var5);
				int var6 = arg1.method240(1);
				if (var6 == 1) {
					field1285[field1284++] = field1280;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method240(3);
				field1189.method111(true, var7);
				int var8 = arg1.method240(3);
				field1189.method111(true, var8);
				int var9 = arg1.method240(1);
				if (var9 == 1) {
					field1285[field1284++] = field1280;
				}
			} else if (var4 == 3) {
				field1122 = arg1.method240(2);
				int var10 = arg1.method240(7);
				int var11 = arg1.method240(7);
				int var12 = arg1.method240(1);
				field1189.method110(var11, var12 == 1, var10);
				int var13 = arg1.method240(1);
				if (var13 == 1) {
					field1285[field1284++] = field1280;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method505(String arg0) {
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

	@ObfuscatedName("client.n(Z)V")
	public final void method506() {
		short var1 = 256;

		if (field1271 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1271 > 768) {
					field1203[var2] = method468(field1205[var2], 1024 - field1271, field1204[var2]);
				} else if (field1271 > 256) {
					field1203[var2] = field1205[var2];
				} else {
					field1203[var2] = method468(field1204[var2], 256 - field1271, field1205[var2]);
				}
			}
		} else if (field1272 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1272 > 768) {
					field1203[var3] = method468(field1206[var3], 1024 - field1272, field1204[var3]);
				} else if (field1272 > 256) {
					field1203[var3] = field1206[var3];
				} else {
					field1203[var3] = method468(field1204[var3], 256 - field1272, field1206[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1203[var4] = field1204[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1456.field654[var5] = field1293.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1329[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1273[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1203[var12];
					int var15 = field1456.field654[var7];
					field1456.field654[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1456.method259(field9, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1457.field654[var16] = field1294.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1329[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1273[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1203[var23];
					int var26 = field1457.field654[var18];
					field1457.field654[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1457.method259(field9, 637, 0);
	}

	@ObfuscatedName("client.b(IILlb;)V")
	public final void method507(int arg0, class38 arg1) {
		field1151 = 0;
		field1284 = 0;
		method504(arg0, arg1);
		method459(arg0, arg1);
		method470(arg1, arg0);
		method556(arg0, arg1);

		for (int var3 = 0; var3 < field1151; var3++) {
			int var4 = field1152[var3];
			if (field1217 != field1281[var4].field405) {
				field1281[var4] = null;
			}
		}

		if (arg1.field621 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field621 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1282; var5++) {
			if (field1281[field1283[var5]] == null) {
				signlink.reporterror(field1144 + " null entry in pl list - pos:" + var5 + " size:" + field1282);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method508(int arg0, int arg1) {
		class41 var3 = field1117[field1122][arg0][arg1];
		if (var3 == null) {
			field1408.method71(field1122, arg0, arg1);
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
			field1408.method57(arg0, var10, field1122, var12, method555(arg0 * 128 + 64, field1122, arg1 * 128 + 64), var9, var5, arg1);
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method509(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1180; var3++) {
				if (field1391[var3] == arg0) {
					field1180--;
					field1201 = true;

					for (int var4 = var3; var4 < field1180; var4++) {
						field1391[var4] = field1391[var4 + 1];
					}

					field1407.method218(104);
					field1407.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)Z")
	public final boolean method510() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.x(I)V")
	public final void method511() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1273[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1273[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1274[var10] = (field1273[var10 - 1] + field1273[var10 + 1] + field1273[var10 - 128] + field1273[var10 + 128]) / 4;
			}
		}

		field1427 += 128;
		if (field1427 > field1094.length) {
			field1427 -= field1094.length;
			int var11 = (int) (Math.random() * 12.0D);
			method443(field1358[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1274[var14 + 128] - field1094[field1427 + var14 & field1094.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1273[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1329[var16] = field1329[var16 + 1];
		}

		field1329[var1 - 1] = (int) (Math.sin(field1217 / 14.0D) * 16.0D + Math.sin(field1217 / 15.0D) * 14.0D + Math.sin(field1217 / 16.0D) * 12.0D);

		if (field1271 > 0) {
			field1271 -= 4;
		}

		if (field1272 > 0) {
			field1272 -= 4;
		}

		if (field1271 == 0 && field1272 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1271 = 1024;
			}

			if (var17 == 1) {
				field1272 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method512() {
		method446();

		if (field1253 == 1) {
			field1185[field1252 / 100].method186(field1250 - 8 - 4, field1251 - 8 - 4);
		}

		if (field1253 == 2) {
			field1185[field1252 / 100 + 4].method186(field1250 - 8 - 4, field1251 - 8 - 4);
			field1368++;
			if (field1368 > 57) {
				field1368 = 0;
				field1407.method218(34);
			}
		}

		if (field1262 != -1) {
			method499(field1060, field1262);
			method546(0, 0, 0, class4.field56[field1262]);
		}

		if (field1367 != -1) {
			method499(field1060, field1367);
			method546(0, 0, 0, class4.field56[field1367]);
		}

		method560();

		if (!field1389) {
			method554();
			method432();
		} else if (field1333 == 0) {
			method557();
		}

		if (field1310 == 1) {
			field1421[1].method186(472, 296);
		}

		if (field1096) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field1465.method201(var1, var2, "Fps:" + field5, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field1316) {
				int var7 = 0xFF0000;
			}

			field1465.method201(var1, var2, "Mem:" + var5 + "k", 0xFFFF00);
			var2 += 15;
		}

		if (field1338 != 0) {
			int var8 = field1338 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1465.method206("System update in: " + var9 + ":0" + var8, 4, 0xFFFF00, 329);
			} else {
				field1465.method206("System update in: " + var9 + ":" + var8, 4, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method513() {
		if (field1323 == 2) {
			for (class40 var1 = (class40) field1190.method248(); var1 != null; var1 = (class40) field1190.method250()) {
				if (var1.field649 > 0) {
					var1.field649--;
				}

				if (var1.field649 != 0) {
					if (var1.field648 > 0) {
						var1.field648--;
					}

					if (var1.field648 == 0 && var1.field640 >= 1 && var1.field641 >= 1 && var1.field640 <= 102 && var1.field641 <= 102 && (var1.field645 < 0 || class3.method30(var1.field645, var1.field647))) {
						method429(var1.field640, var1.field639, var1.field638, var1.field645, var1.field641, var1.field647, var1.field646);
						var1.field648 = -1;

						if (var1.field645 == var1.field642 && var1.field642 == -1) {
							var1.method106();
						} else if (var1.field645 == var1.field642 && var1.field646 == var1.field643 && var1.field647 == var1.field644) {
							var1.method106();
						}
					}
				} else if (var1.field642 < 0 || class3.method30(var1.field642, var1.field644)) {
					method429(var1.field640, var1.field639, var1.field638, var1.field642, var1.field641, var1.field644, var1.field643);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method514(boolean arg0) {
		if (field1189.field360 >> 7 == field1181 && field1189.field361 >> 7 == field1182) {
			field1181 = 0;
			field1169++;
			if (field1169 > 122) {
				field1169 = 0;
				field1407.method218(110);
				field1407.method219(62);
			}
		}

		int var2 = field1282;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1189;
				var5 = field1280 << 14;
			} else {
				var4 = field1281[field1283[var3]];
				var5 = field1283[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1316 && field1282 > 50 || field1282 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1217 < var4.field426 || field1217 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1354[var6][var7] == field1256) {
								continue;
							}

							field1354[var6][var7] = field1256;
						}

						var4.field425 = method555(var4.field360, field1122, var4.field361);
						field1408.method61(var4, var4.field360, field1122, var4.field425, 60, var4.field361, var4.field362, var4.field363, var5);
					} else {
						var4.field436 = false;
						var4.field425 = method555(var4.field360, field1122, var4.field361);
						field1408.method62(var4.field435, var4.field432, field1122, var4.field434, var4.field361, var4, var5, var4.field362, 60, var4.field425, var4.field360, var4.field433);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method515() {
		if (field1349 > 0) {
			method542();
		} else {
			field1100.method258();
			field1465.method202("Connection lost", 144, 0, 257);
			field1465.method202("Connection lost", 143, 0xFFFFFF, 256);
			field1465.method202("Please wait - attempting to reestablish", 159, 0, 257);
			field1465.method202("Please wait - attempting to reestablish", 158, 0xFFFFFF, 256);
			field1100.method259(field9, 4, 4);
			field1298 = 0;
			field1181 = 0;
			class5 var1 = field1078;
			field1214 = false;
			field1353 = 0;
			method490(field1144, field1145, true);

			if (!field1214) {
				method542();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method516() {
		for (class30 var1 = (class30) field1161.method248(); var1 != null; var1 = (class30) field1161.method250()) {
			if (field1122 != var1.field458 || field1217 > var1.field464) {
				var1.method106();
			} else if (field1217 >= var1.field463) {
				if (var1.field467 > 0) {
					class26 var2 = field1471[var1.field467 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method120(var2.field361, field1217, method555(var2.field360, var1.field458, var2.field361) - var1.field462, var2.field360);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class27 var4;
					if (field1068 == var3) {
						var4 = field1189;
					} else {
						var4 = field1281[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method120(var4.field361, field1217, method555(var4.field360, var1.field458, var4.field361) - var1.field462, var4.field360);
					}
				}

				var1.method121(field1060);
				field1408.method61(var1, (int) var1.field469, field1122, (int) var1.field471, 60, (int) var1.field470, var1.field477, false, -1);
			}
		}

		field1317++;
		if (field1317 > 1174) {
			field1317 = 0;
			field1407.method218(90);
			field1407.method219(0);
			int var5 = field1407.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1407.method220(11499);
			}

			field1407.method220(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1407.method219(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1407.method219(94);
			}

			field1407.method220(51693);
			field1407.method219(16);
			field1407.method220(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1407.method219(65);
			}

			field1407.method219((int) (Math.random() * 256.0D));
			field1407.method220(22990);
			field1407.method228(field1407.field621 - var5);
		}
	}

	@ObfuscatedName("client.a(ZZI)V")
	public final void method517(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1299) {
			field1448 = true;
		} else {
			field1299 = true;
			boolean var1 = false;
			String var2 = method545();
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
						field1070[var3] = new class48(signlink.cache_dat, 500000, var3 + 1, signlink.cache_idx[var3]);
					}
				}

				try {
					method483();
					field1119 = method536("title", 25, field1302[1], 1, "title screen");
					field1464 = new class37(false, "p11_full", field1119);
					field1465 = new class37(false, "p12_full", field1119);
					field1466 = new class37(false, "b12_full", field1119);
					field1467 = new class37(true, "q8_full", field1119);
					method552();
					method522();
					class50 var4 = method536("config", 30, field1302[2], 2, "config");
					class50 var5 = method536("interface", 35, field1302[3], 3, "interface");
					class50 var6 = method536("media", 40, field1302[4], 4, "2d graphics");
					class50 var7 = method536("textures", 45, field1302[6], 6, "textures");
					class50 var8 = method536("wordenc", 50, field1302[7], 7, "chat system");
					class50 var9 = method536("sounds", 55, field1302[8], 8, "sound effects");
					field1135 = new byte[4][104][104];
					field1170 = new int[4][105][105];
					field1408 = new class18(104, field1170, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field1176[var10] = new class62(104, 104);
					}

					field1183 = new class35(512, 512);
					class50 var11 = method536("versionlist", 60, field1302[5], 5, "update list");
					method13(60, "Connecting to update server");
					field1330 = new class47();
					field1330.method270(var11, this);
					class7.method44(field1330.method273());
					class31.method123(field1330.method272(0), field1330);

					if (!field1316) {
						field1327 = 0;
						try {
							field1327 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1328 = true;
						field1330.method279(2, field1327);

						while (field1330.method280() > 0) {
							method547();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1330.field738 > 3) {
								method505("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field1330.method272(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1330.method279(1, var13);
					}

					while (field1330.method280() > 0) {
						int var14 = var12 - field1330.method280();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method547();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1330.field738 > 3) {
							method505("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field1330.method272(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1330.method277(var16);
						if ((var17 & 0x1) != 0) {
							field1330.method279(0, var16);
						}
					}

					int var18 = field1330.method280();
					while (field1330.method280() > 0) {
						int var19 = var18 - field1330.method280();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method547();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1070[0] != null) {
						method13(75, "Requesting maps");
						field1330.method279(3, field1330.method274(48, 0, 47));
						field1330.method279(3, field1330.method274(48, 1, 47));
						field1330.method279(3, field1330.method274(48, 0, 48));
						field1330.method279(3, field1330.method274(48, 1, 48));
						field1330.method279(3, field1330.method274(48, 0, 49));
						field1330.method279(3, field1330.method274(48, 1, 49));
						field1330.method279(3, field1330.method274(47, 0, 47));
						field1330.method279(3, field1330.method274(47, 1, 47));
						field1330.method279(3, field1330.method274(47, 0, 48));
						field1330.method279(3, field1330.method274(47, 1, 48));
						field1330.method279(3, field1330.method274(148, 0, 48));
						field1330.method279(3, field1330.method274(148, 1, 48));
						int var20 = field1330.method280();
						while (field1330.method280() > 0) {
							int var21 = var20 - field1330.method280();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method547();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1330.method272(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1330.method277(var23);
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
							field1330.method282(var25, var23, 0);
						}
					}

					field1330.method275(field1315);

					if (!field1316) {
						int var26 = field1330.method272(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1330.method278(var27)) {
								field1330.method282((byte) 1, var27, 2);
							}
						}
					}

					method13(80, "Unpacking media");
					field1140 = new class36(var6, "invback", 0);
					field1142 = new class36(var6, "chatback", 0);
					field1141 = new class36(var6, "mapback", 0);
					field1191 = new class36(var6, "backbase1", 0);
					field1192 = new class36(var6, "backbase2", 0);
					field1193 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1470[var28] = new class36(var6, "sideicons", var28);
					}

					field1223 = new class35(var6, "compass", 0);
					field1136 = new class35(var6, "mapedge", 0);
					field1136.method183();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1086[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1287[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1199[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1421[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1342 = new class35(var6, "mapmarker", 0);
					field1343 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1185[var33] = new class35(var6, "cross", var33);
					}

					field1129 = new class35(var6, "mapdots", 0);
					field1130 = new class35(var6, "mapdots", 1);
					field1131 = new class35(var6, "mapdots", 2);
					field1132 = new class35(var6, "mapdots", 3);
					field1247 = new class36(var6, "scrollbar", 0);
					field1248 = new class36(var6, "scrollbar", 1);
					field1224 = new class36(var6, "redstone1", 0);
					field1225 = new class36(var6, "redstone2", 0);
					field1226 = new class36(var6, "redstone3", 0);
					field1227 = new class36(var6, "redstone1", 0);
					field1227.method196();
					field1228 = new class36(var6, "redstone2", 0);
					field1228.method196();
					field1369 = new class36(var6, "redstone1", 0);
					field1369.method197();
					field1370 = new class36(var6, "redstone2", 0);
					field1370.method197();
					field1371 = new class36(var6, "redstone3", 0);
					field1371.method197();
					field1372 = new class36(var6, "redstone1", 0);
					field1372.method196();
					field1372.method197();
					field1373 = new class36(var6, "redstone2", 0);
					field1373.method196();
					field1373.method197();

					for (int var34 = 0; var34 < 2; var34++) {
						field1278[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1438 = new class43(method11(), var35.field598, var35.field597);
					var35.method184(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1439 = new class43(method11(), var36.field598, var36.field597);
					var36.method184(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1440 = new class43(method11(), var37.field598, var37.field597);
					var37.method184(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1441 = new class43(method11(), var38.field598, var38.field597);
					var38.method184(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1442 = new class43(method11(), var39.field598, var39.field597);
					var39.method184(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1443 = new class43(method11(), var40.field598, var40.field597);
					var40.method184(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1444 = new class43(method11(), var41.field598, var41.field597);
					var41.method184(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1445 = new class43(method11(), var42.field598, var42.field597);
					var42.method184(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1446 = new class43(method11(), var43.field598, var43.field597);
					var43.method184(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1287[var48] != null) {
							field1287[var48].method182(var46 + var47, var44 + var47, var45 + var47);
						}

						if (field1086[var48] != null) {
							field1086[var48].method198(var46 + var47, var44 + var47, var45 + var47);
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
					class60.field914 = field1315;

					if (!field1316) {
						method13(90, "Unpacking sounds");
						byte[] var49 = var9.method299("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method318(var50);
					}

					method13(95, "Unpacking interfaces");
					class37[] var51 = new class37[] { field1464, field1465, field1466, field1467 };
					class4.method32(var6, var5, var51);
					method13(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1141.field603[field1141.field605 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1479[var52] = var53;
						field1361[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1141.field603[field1141.field605 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1087[var56 - 5] = var57 - 25;
						field1266[var56 - 5] = var58 - var57;
					}

					class34.method166(479, 96);
					field1409 = class34.field584;
					class34.method166(190, 261);
					field1410 = class34.field584;
					class34.method166(512, 334);
					field1411 = class34.field584;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field582[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(800, 334, 500, var60, 512);
					class71.method391(var8);
					field1481 = new class58(this);
					method12(field1481, 10);
					class28.field441 = this;
					class57.field821 = this;
					class59.field873 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1462 + " " + field1324);
					field1468 = true;
				}
			} else {
				field1083 = true;
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method518(boolean arg0) {
		method447();
		field1455.method258();
		field1303.method199(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1309 == 0) {
			int var4 = var3 / 2 + 80;
			field1464.method203(field1330.field732, var4, var2 / 2, 0x75A9A9, true);
			int var5 = var3 / 2 - 20;
			field1466.method203("Welcome to RuneScape", var5, var2 / 2, 0xFFFF00, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1304.method199(var6 - 73, var7 - 20);
			field1466.method203("New User", var7 + 5, var6, 0xFFFFFF, true);
			int var8 = var2 / 2 + 80;
			field1304.method199(var8 - 73, var7 - 20);
			field1466.method203("Existing User", var7 + 5, var8, 0xFFFFFF, true);
		}

		if (field1309 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1167.length() > 0) {
				field1466.method203(field1167, var9 - 15, var2 / 2, 0xFFFF00, true);
				field1466.method203(field1168, var9, var2 / 2, 0xFFFF00, true);
				var9 += 30;
			} else {
				field1466.method203(field1168, var9 - 7, var2 / 2, 0xFFFF00, true);
				var9 += 30;
			}

			field1466.method210("Username: " + field1144 + (field1105 == 0 & field1217 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var2 / 2 - 90, true, var9);
			var9 += 15;
			field1466.method210("Password: " + class51.method305(field1145) + (field1105 == 1 & field1217 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var2 / 2 - 88, true, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1304.method199(var10 - 73, var11 - 20);
				field1466.method203("Login", var11 + 5, var10, 0xFFFFFF, true);
				int var12 = var2 / 2 + 80;
				field1304.method199(var12 - 73, var11 - 20);
				field1466.method203("Cancel", var11 + 5, var12, 0xFFFFFF, true);
			}
		}

		if (field1309 == 3) {
			field1466.method203("Create a free account", var3 / 2 - 60, var2 / 2, 0xFFFF00, true);
			int var13 = var3 / 2 - 35;
			field1466.method203("To create a new account you need to", var13, var2 / 2, 0xFFFFFF, true);
			var13 += 15;
			field1466.method203("go back to the main RuneScape webpage", var13, var2 / 2, 0xFFFFFF, true);
			var13 += 15;
			field1466.method203("and choose the red 'create account'", var13, var2 / 2, 0xFFFFFF, true);
			var13 += 15;
			field1466.method203("button at the top right of that page.", var13, var2 / 2, 0xFFFFFF, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1304.method199(var14 - 73, var15 - 20);
			field1466.method203("Cancel", var15 + 5, var14, 0xFFFFFF, true);
		}

		field1455.method259(field9, 202, 171);

		if (field1241) {
			field1241 = false;
			field1453.method259(field9, 128, 0);
			field1454.method259(field9, 202, 371);
			field1458.method259(field9, 0, 265);
			field1459.method259(field9, 562, 265);
			field1460.method259(field9, 128, 171);
			field1461.method259(field9, 562, 171);
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = class31.field550[var7];
			int var13 = class31.field551[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field550[var8];
			int var16 = class31.field551[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1376 = arg1 - var9;
		field1377 = arg4 - var10;
		field1378 = arg3 - var11;
		field1379 = arg0;
		field1380 = arg5;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method520(long arg0) {
		if (arg0 != 0L) {
			if (field1424 >= 100 && field1341 != 1) {
				method559(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field1424 >= 200) {
				method559(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1424; var4++) {
					if (field1244[var4] == arg0) {
						method559(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1180; var5++) {
					if (field1391[var5] == arg0) {
						method559(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1189.field416)) {
					field1419[field1424] = var3;
					field1244[field1424] = arg0;
					field1178[field1424] = 0;
					field1424++;
					field1201 = true;
					field1407.method218(221);
					field1407.method225(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILlb;B)V")
	public final void method521(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(8);
		if (var3 < field1472) {
			for (int var4 = var3; var4 < field1472; var4++) {
				field1152[field1151++] = field1473[var4];
			}
		}

		if (var3 > field1472) {
			signlink.reporterror(field1144 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1472 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1473[var5];
			class26 var7 = field1471[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1473[field1472++] = var6;
				var7.field405 = field1217;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1473[field1472++] = var6;
					var7.field405 = field1217;
					field1285[field1284++] = var6;
				} else if (var9 == 1) {
					field1473[field1472++] = var6;
					var7.field405 = field1217;
					int var10 = arg1.method240(3);
					var7.method111(false, var10);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1285[field1284++] = var6;
					}
				} else if (var9 == 2) {
					field1473[field1472++] = var6;
					var7.field405 = field1217;
					int var12 = arg1.method240(3);
					var7.method111(true, var12);
					int var13 = arg1.method240(3);
					var7.method111(true, var13);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1285[field1284++] = var6;
					}
				} else if (var9 == 3) {
					field1152[field1151++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method522() {
		field1303 = new class36(field1119, "titlebox", 0);
		field1304 = new class36(field1119, "titlebutton", 0);
		field1358 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1358[var2] = new class36(field1119, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1358[var3] = new class36(field1119, "runes", (var3 & 0x3) + 12);
			}
		}

		field1293 = new class35(128, 265);
		field1294 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1293.field596[var4] = field1456.field654[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1294.field596[var5] = field1457.field654[var5];
		}

		field1204 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1204[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1204[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1204[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1204[var9 + 192] = 0xFFFFFF;
		}

		field1205 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1205[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1205[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1205[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1205[var13 + 192] = 0xFFFFFF;
		}

		field1206 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1206[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1206[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1206[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1206[var17 + 192] = 0xFFFFFF;
		}

		field1203 = new int[256];
		field1094 = new int[32768];
		field1095 = new int[32768];
		method443(null);
		field1273 = new int[32768];
		field1274 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1172) {
			field1277 = true;
			field1172 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIIIIB)V")
	public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1408.method76(arg4, arg0, arg1);
		if (var6 != 0) {
			int var7 = field1408.method80(arg4, arg0, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field1183.field596;
			int var12 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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
				class36 var15 = field1086[var14.field849];
				if (var15 != null) {
					int var16 = (var14.field835 * 4 - var15.field605) / 2;
					int var17 = (var14.field836 * 4 - var15.field606) / 2;
					var15.method199(arg0 * 4 + var16 + 48, (104 - arg1 - var14.field836) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1408.method78(arg4, arg0, arg1);
		if (var18 != 0) {
			int var19 = field1408.method80(arg4, arg0, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method330(var22);
			if (var23.field849 != -1) {
				class36 var24 = field1086[var23.field849];
				if (var24 != null) {
					int var25 = (var23.field835 * 4 - var24.field605) / 2;
					int var26 = (var23.field836 * 4 - var24.field606) / 2;
					var24.method199(arg0 * 4 + var25 + 48, (104 - arg1 - var23.field836) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1183.field596;
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

		int var30 = field1408.method79(arg4, arg0, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method330(var31);
			if (var32.field849 != -1) {
				class36 var33 = field1086[var32.field849];
				if (var33 != null) {
					int var34 = (var32.field835 * 4 - var33.field605) / 2;
					int var35 = (var32.field836 * 4 - var33.field606) / 2;
					var33.method199(arg0 * 4 + var34 + 48, (104 - arg1 - var32.field836) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method524(boolean arg0) {
		for (int var2 = 0; var2 < field1472; var2++) {
			class26 var3 = field1471[field1473[var2]];
			int var4 = (field1473[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field900 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1354[var5][var6] == field1256) {
							continue;
						}

						field1354[var5][var6] = field1256;
					}

					field1408.method61(var3, var3.field360, field1122, method555(var3.field360, field1122, var3.field361), (var3.field364 - 1) * 64 + 60, var3.field361, var3.field362, var3.field363, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method525() {
		if (field1298 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1451 + field1385 & 0x7FF;
				int var4 = class34.field582[var3];
				int var5 = class34.field583[var3];
				var4 = (field1174 + 256) * var4 >> 8;
				var5 = (field1174 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1189.field360 + var6 >> 7;
				int var9 = field1189.field361 - var7 >> 7;
				boolean var10 = method482(0, var9, var8, field1189.field411[0], 0, 0, 1, true, field1189.field410[0], 0, 0);
				if (var10) {
					field1407.method219(var1);
					field1407.method219(var2);
					field1407.method220(field1385);
					field1407.method219(57);
					field1407.method219(field1451);
					field1407.method219(field1174);
					field1407.method219(89);
					field1407.method220(field1189.field360);
					field1407.method220(field1189.field361);
					field1407.method219(field1173);
					field1407.method219(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILd;IIBII)V")
	public final void method526(int arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field63 == 0 && arg1.field78 != null && !arg1.field77 && (arg5 >= arg3 && arg2 >= arg0 && arg5 <= arg1.field66 + arg3 && arg2 <= arg1.field67 + arg0)) {
			int var7 = arg1.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field79[var8] + arg3;
				int var10 = arg1.field80[var8] + arg0 - arg4;
				class4 var11 = class4.field56[arg1.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1066 = var11.field74;
					} else {
						field1066 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method526(var10, var11, arg2, var9, var11.field76, arg5);

					if (var11.field75 > var11.field67) {
						method527(var11, var10, arg2, var11.field66 + var9, var11.field67, var11.field75, arg5, true);
					}
				} else {
					if (var11.field64 == 1 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method436(var11);
						}

						if (!var12) {
							field1318[field1265] = var11.field117;
							field1108[field1265] = 231;
							field1107[field1265] = var11.field61;
							field1265++;
						}
					}

					if (var11.field64 == 2 && field1475 == 0 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1318[field1265] = var13 + " @gre@" + var11.field115;
						field1108[field1265] = 274;
						field1107[field1265] = var11.field61;
						field1265++;
					}

					if (var11.field64 == 3 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1318[field1265] = "Close";
						field1108[field1265] = 737;
						field1107[field1265] = var11.field61;
						field1265++;
					}

					if (var11.field64 == 4 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1318[field1265] = var11.field117;
						field1108[field1265] = 435;
						field1107[field1265] = var11.field61;
						field1265++;
					}

					if (var11.field64 == 5 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1318[field1265] = var11.field117;
						field1108[field1265] = 225;
						field1107[field1265] = var11.field61;
						field1265++;
					}

					if (var11.field64 == 6 && !field1116 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1318[field1265] = var11.field117;
						field1108[field1265] = 997;
						field1107[field1265] = var11.field61;
						field1265++;
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

								if (arg5 >= var17 && arg2 >= var18 && arg5 < var17 + 32 && arg2 < var18 + 32) {
									field1321 = var14;
									field1322 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method348(var11.field57[var14] - 1);
										if (field1088 == 1 && var11.field84) {
											if (field1090 != var11.field61 || field1089 != var14) {
												field1318[field1265] = "Use " + field1092 + " with @lre@" + var19.field917;
												field1108[field1265] = 398;
												field1109[field1265] = var19.field915;
												field1106[field1265] = var14;
												field1107[field1265] = var11.field61;
												field1265++;
											}
										} else if (field1475 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field932 != null && var19.field932[var20] != null) {
														field1318[field1265] = var19.field932[var20] + " @lre@" + var19.field917;

														if (var20 == 3) {
															field1108[field1265] = 681;
														}

														if (var20 == 4) {
															field1108[field1265] = 100;
														}

														field1109[field1265] = var19.field915;
														field1106[field1265] = var14;
														field1107[field1265] = var11.field61;
														field1265++;
													} else if (var20 == 4) {
														field1318[field1265] = "Drop @lre@" + var19.field917;
														field1108[field1265] = 100;
														field1109[field1265] = var19.field915;
														field1106[field1265] = var14;
														field1107[field1265] = var11.field61;
														field1265++;
													}
												}
											}

											if (var11.field85) {
												field1318[field1265] = "Use @lre@" + var19.field917;
												field1108[field1265] = 102;
												field1109[field1265] = var19.field915;
												field1106[field1265] = var14;
												field1107[field1265] = var11.field61;
												field1265++;
											}

											if (var11.field84 && var19.field932 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field932[var21] != null) {
														field1318[field1265] = var19.field932[var21] + " @lre@" + var19.field917;

														if (var21 == 0) {
															field1108[field1265] = 694;
														}

														if (var21 == 1) {
															field1108[field1265] = 962;
														}

														if (var21 == 2) {
															field1108[field1265] = 795;
														}

														field1109[field1265] = var19.field915;
														field1106[field1265] = var14;
														field1107[field1265] = var11.field61;
														field1265++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1318[field1265] = var11.field92[var22] + " @lre@" + var19.field917;

														if (var22 == 0) {
															field1108[field1265] = 582;
														}

														if (var22 == 1) {
															field1108[field1265] = 113;
														}

														if (var22 == 2) {
															field1108[field1265] = 555;
														}

														if (var22 == 3) {
															field1108[field1265] = 331;
														}

														if (var22 == 4) {
															field1108[field1265] = 354;
														}

														field1109[field1265] = var19.field915;
														field1106[field1265] = var14;
														field1107[field1265] = var11.field61;
														field1265++;
													}
												}
											}

											field1318[field1265] = "Examine @lre@" + var19.field917;
											field1108[field1265] = 1328;
											field1109[field1265] = var19.field915;
											field1106[field1265] = var14;
											field1107[field1265] = var11.field61;
											field1265++;
										} else if ((field1477 & 0x10) == 0x10) {
											field1318[field1265] = field1478 + " @lre@" + var19.field917;
											field1108[field1265] = 563;
											field1109[field1265] = var19.field915;
											field1106[field1265] = var14;
											field1107[field1265] = var11.field61;
											field1265++;
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

	@ObfuscatedName("client.a(Ld;IIIIIIIZ)V")
	public final void method527(class4 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (field1194) {
			field1239 = 32;
		} else {
			field1239 = 0;
		}

		field1194 = false;
		if (arg6 >= arg3 && arg6 < arg3 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
			arg0.field76 -= field1289 * 4;

			if (arg7) {
				field1201 = true;
				return;
			}
		} else if (arg6 >= arg3 && arg6 < arg3 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
			arg0.field76 += field1289 * 4;

			if (arg7) {
				field1201 = true;
				return;
			}
		} else if (arg6 >= arg3 - field1239 && arg6 < arg3 + field1239 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg4 - 16 && field1289 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg1 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg0.field76 = (arg5 - arg4) * var10 / var11;

			if (arg7) {
				field1201 = true;
			}

			field1194 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(BILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field1324 = arg0;
		field1462 = arg1;
		method447();

		if (field1119 == null) {
			super.method13(arg0, arg1);
		} else {
			field1455.method258();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1466.method202("RuneScape is loading - please wait...", var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			class33.method158(var3 / 2 - 152, var6, 304, 0x8C1111, 34);
			class33.method158(var3 / 2 - 151, var6 + 1, 302, 0, 32);
			class33.method157(var6 + 2, 30, 0x8C1111, arg0 * 3, var3 / 2 - 150);
			class33.method157(var6 + 2, 30, 0, 300 - arg0 * 3, arg0 * 3 + (var3 / 2 - 150));
			field1466.method202(arg1, var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2);
			field1455.method259(field9, 202, 171);

			if (field1241) {
				field1241 = false;

				if (!field1172) {
					field1456.method259(field9, 0, 0);
					field1457.method259(field9, 637, 0);
				}

				field1453.method259(field9, 128, 0);
				field1454.method259(field9, 202, 371);
				field1458.method259(field9, 0, 265);
				field1459.method259(field9, 562, 265);
				field1460.method259(field9, 128, 171);
				field1461.method259(field9, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method528() {
		for (int var1 = 0; var1 < field1472; var1++) {
			int var2 = field1473[var1];
			class26 var3 = field1471[var2];
			if (var3 != null) {
				method529(var3, var3.field415.field882);
			}
		}
	}

	@ObfuscatedName("client.b(ILy;I)V")
	public final void method529(class25 arg0, int arg1) {
		if (arg0.field360 < 128 || arg0.field361 < 128 || arg0.field360 >= 13184 || arg0.field361 >= 13184) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (field1189 == arg0 && (arg0.field360 < 1536 || arg0.field361 < 1536 || arg0.field360 >= 11776 || arg0.field361 >= 11776)) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (arg0.field402 > field1217) {
			method530(arg0);
		} else if (arg0.field403 >= field1217) {
			method531(arg0);
		} else {
			method532(arg0);
		}

		method533(arg0);
		method534(arg0);
	}

	@ObfuscatedName("client.a(ILy;)V")
	public final void method530(class25 arg0) {
		int var2 = arg0.field402 - field1217;
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
	public final void method531(class25 arg0) {
		if (field1217 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field996[arg0.field388].method382(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1217 - arg0.field402;
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

	@ObfuscatedName("client.c(ILy;)V")
	public final void method532(class25 arg0) {
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

	@ObfuscatedName("client.a(Ly;Z)V")
	public final void method533(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1471[arg0.field382];
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
				if (field1068 == var5) {
					var5 = field1280;
				}

				class27 var6 = field1281[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1267 - field1267) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1268 - field1268) * 64;
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

	@ObfuscatedName("client.a(ZLy;)V")
	public final void method534(class25 arg0) {
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

		if (arg0.field393 != -1 && field1217 >= arg0.field396) {
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
			if (var4.field1008 == 1 && arg0.field414 > 0 && arg0.field402 <= field1217 && arg0.field403 < field1217) {
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

	@ObfuscatedName("client.B(I)V")
	public final void method535() {
		if (field1241) {
			field1241 = false;
			field1438.method259(field9, 0, 4);
			field1439.method259(field9, 0, 357);
			field1440.method259(field9, 722, 4);
			field1441.method259(field9, 743, 205);
			field1442.method259(field9, 0, 0);
			field1443.method259(field9, 516, 4);
			field1444.method259(field9, 516, 205);
			field1445.method259(field9, 496, 357);
			field1446.method259(field9, 0, 338);
			field1201 = true;
			field1231 = true;
			field1249 = true;
			field1081 = true;

			if (field1323 != 2) {
				field1100.method259(field9, 4, 4);
				field1099.method259(field9, 550, 4);
			}
		}

		if (field1323 == 2) {
			method492();
		}

		if (field1389 && field1333 == 1) {
			field1201 = true;
		}

		if (field1356 != -1) {
			boolean var1 = method499(field1060, field1356);
			if (var1) {
				field1201 = true;
			}
		}

		if (field1127 == 2) {
			field1201 = true;
		}

		if (field1415 == 2) {
			field1201 = true;
		}

		if (field1201) {
			method455();
			field1201 = false;
		}

		if (field1071 == -1) {
			field1320.field76 = field1155 - field1062 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method527(field1320, 0, field18 - 357, 463, 77, field1155, field17 - 17, false);
			}

			int var2 = field1155 - field1320.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1155 - 77) {
				var2 = field1155 - 77;
			}

			if (field1062 != var2) {
				field1062 = var2;
				field1231 = true;
			}
		}

		if (field1071 != -1) {
			boolean var3 = method499(field1060, field1071);
			if (var3) {
				field1231 = true;
			}
		}

		if (field1127 == 3) {
			field1231 = true;
		}

		if (field1415 == 3) {
			field1231 = true;
		}

		if (field1480 != null) {
			field1231 = true;
		}

		if (field1389 && field1333 == 2) {
			field1231 = true;
		}

		if (field1231) {
			method448();
			field1231 = false;
		}

		if (field1323 == 2) {
			method456();
			field1099.method259(field9, 550, 4);
		}

		if (field1177 != -1) {
			field1249 = true;
		}

		if (field1249) {
			if (field1177 != -1 && field1288 == field1177) {
				field1177 = -1;
				field1407.method218(36);
				field1407.method219(field1288);
			}

			field1249 = false;
			field1365.method258();
			field1193.method199(0, 0);

			if (field1356 == -1) {
				if (field1295[field1288] != -1) {
					if (field1288 == 0) {
						field1224.method199(22, 10);
					}

					if (field1288 == 1) {
						field1225.method199(54, 8);
					}

					if (field1288 == 2) {
						field1225.method199(82, 8);
					}

					if (field1288 == 3) {
						field1226.method199(110, 8);
					}

					if (field1288 == 4) {
						field1228.method199(153, 8);
					}

					if (field1288 == 5) {
						field1228.method199(181, 8);
					}

					if (field1288 == 6) {
						field1227.method199(209, 9);
					}
				}

				if (field1295[0] != -1 && (field1177 != 0 || field1217 % 20 < 10)) {
					field1470[0].method199(29, 13);
				}

				if (field1295[1] != -1 && (field1177 != 1 || field1217 % 20 < 10)) {
					field1470[1].method199(53, 11);
				}

				if (field1295[2] != -1 && (field1177 != 2 || field1217 % 20 < 10)) {
					field1470[2].method199(82, 11);
				}

				if (field1295[3] != -1 && (field1177 != 3 || field1217 % 20 < 10)) {
					field1470[3].method199(115, 12);
				}

				if (field1295[4] != -1 && (field1177 != 4 || field1217 % 20 < 10)) {
					field1470[4].method199(153, 13);
				}

				if (field1295[5] != -1 && (field1177 != 5 || field1217 % 20 < 10)) {
					field1470[5].method199(180, 11);
				}

				if (field1295[6] != -1 && (field1177 != 6 || field1217 % 20 < 10)) {
					field1470[6].method199(208, 13);
				}
			}

			field1365.method259(field9, 516, 160);
			field1364.method258();
			field1192.method199(0, 0);

			if (field1356 == -1) {
				if (field1295[field1288] != -1) {
					if (field1288 == 7) {
						field1369.method199(42, 0);
					}

					if (field1288 == 8) {
						field1370.method199(74, 0);
					}

					if (field1288 == 9) {
						field1370.method199(102, 0);
					}

					if (field1288 == 10) {
						field1371.method199(130, 1);
					}

					if (field1288 == 11) {
						field1373.method199(173, 0);
					}

					if (field1288 == 12) {
						field1373.method199(201, 0);
					}

					if (field1288 == 13) {
						field1372.method199(229, 0);
					}
				}

				if (field1295[8] != -1 && (field1177 != 8 || field1217 % 20 < 10)) {
					field1470[7].method199(74, 2);
				}

				if (field1295[9] != -1 && (field1177 != 9 || field1217 % 20 < 10)) {
					field1470[8].method199(102, 3);
				}

				if (field1295[10] != -1 && (field1177 != 10 || field1217 % 20 < 10)) {
					field1470[9].method199(137, 4);
				}

				if (field1295[11] != -1 && (field1177 != 11 || field1217 % 20 < 10)) {
					field1470[10].method199(174, 2);
				}

				if (field1295[12] != -1 && (field1177 != 12 || field1217 % 20 < 10)) {
					field1470[11].method199(201, 2);
				}

				if (field1295[13] != -1 && (field1177 != 13 || field1217 % 20 < 10)) {
					field1470[12].method199(226, 2);
				}
			}

			field1364.method259(field9, 496, 466);
			field1100.method258();
		}

		if (field1081) {
			field1081 = false;
			field1363.method258();
			field1191.method199(0, 0);
			field1465.method203("Public chat", 28, 55, 0xFFFFFF, true);

			if (field1069 == 0) {
				field1465.method203("On", 41, 55, 0xFF00, true);
			}

			if (field1069 == 1) {
				field1465.method203("Friends", 41, 55, 0xFFFF00, true);
			}

			if (field1069 == 2) {
				field1465.method203("Off", 41, 55, 0xFF0000, true);
			}

			if (field1069 == 3) {
				field1465.method203("Hide", 41, 55, 0xFFFF, true);
			}

			field1465.method203("Private chat", 28, 184, 0xFFFFFF, true);

			if (field1449 == 0) {
				field1465.method203("On", 41, 184, 0xFF00, true);
			}

			if (field1449 == 1) {
				field1465.method203("Friends", 41, 184, 0xFFFF00, true);
			}

			if (field1449 == 2) {
				field1465.method203("Off", 41, 184, 0xFF0000, true);
			}

			field1465.method203("Trade/compete", 28, 324, 0xFFFFFF, true);

			if (field1216 == 0) {
				field1465.method203("On", 41, 324, 0xFF00, true);
			}

			if (field1216 == 1) {
				field1465.method203("Friends", 41, 324, 0xFFFF00, true);
			}

			if (field1216 == 2) {
				field1465.method203("Off", 41, 324, 0xFF0000, true);
			}

			field1465.method203("Report abuse", 33, 458, 0xFFFFFF, true);
			field1363.method259(field9, 0, 453);
			field1100.method258();
		}

		field1060 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIIILjava/lang/String;)Lxb;")
	public final class50 method536(String arg0, int arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1070[0] != null) {
				var6 = field1070[0].method291(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1220.reset();
			field1220.update(var6);
			int var8 = (int) field1220.getValue();
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
			method13(arg1, "Requesting " + arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method501(arg0 + arg2);
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
						method13(arg1, "Loading " + arg4 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1070[0] != null) {
						field1070[0].method292(var6, arg3, var6.length);
					}
				} catch (Exception var28) {
					field1070[0] = null;
				}

				if (var6 != null) {
					field1220.reset();
					field1220.update(var6);
					int var23 = (int) field1220.getValue();
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
						method13(arg1, "Game updated - please reload page");
						var25 = 10;
					} else {
						method13(arg1, var11 + " - Retrying in " + var25);
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

				field1357 = !field1357;
			}
		}

		return new class50(var6);
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1314 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1247.method199(arg0, arg3);
		field1248.method199(arg0, arg3 + arg4 - 16);
		class33.method157(arg3 + 16, arg4 - 32, field1264, 16, arg0);
		int var6 = (arg4 - 32) * arg4 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg1 - arg4);
		class33.method157(arg3 + var7 + 16, var6, field1121, 16, arg0);
		class33.method162(field1162, var6, arg0, arg3 + var7 + 16);
		class33.method162(field1162, var6, arg0 + 1, arg3 + 16 + var7);
		class33.method160(arg3 + var7 + 16, arg0, field1162, 16);
		class33.method160(arg3 + var7 + 17, arg0, field1162, 16);
		class33.method162(field1307, var6, arg0 + 15, arg3 + 16 + var7);
		class33.method162(field1307, var6 - 1, arg0 + 14, arg3 + var7 + 17);
		class33.method160(arg3 + var7 + var6 + 15, arg0, field1307, 16);
		class33.method160(arg3 + var7 + var6 + 14, arg0 + 1, field1307, 15);
	}

	@ObfuscatedName("client.C(I)V")
	public final void method538() {
		try {
			int var1 = field1189.field360 + field1405;
			int var2 = field1189.field361 + field1232;
			if (field1073 - var1 < -500 || field1073 - var1 > 500 || field1074 - var2 < -500 || field1074 - var2 > 500) {
				field1073 = var1;
				field1074 = var2;
			}

			if (field1073 != var1) {
				field1073 += (var1 - field1073) / 16;
			}

			if (field1074 != var2) {
				field1074 += (var2 - field1074) / 16;
			}

			if (field27[1] == 1) {
				field1386 += (-field1386 - 24) / 2;
			} else if (field27[2] == 1) {
				field1386 += (24 - field1386) / 2;
			} else {
				field1386 /= 2;
			}

			if (field27[3] == 1) {
				field1387 += (12 - field1387) / 2;
			} else if (field27[4] == 1) {
				field1387 += (-field1387 - 12) / 2;
			} else {
				field1387 /= 2;
			}

			field1385 = field1386 / 2 + field1385 & 0x7FF;
			field1384 += field1387 / 2;
			if (field1384 < 128) {
				field1384 = 128;
			}

			if (field1384 > 383) {
				field1384 = 383;
			}

			int var3 = field1073 >> 7;
			int var4 = field1074 >> 7;
			int var5 = method555(field1073, field1122, field1074);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1122;
						if (var9 < 3 && (field1135[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1170[var9][var7][var8];
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

			if (var11 > field1263) {
				field1263 += (var11 - field1263) / 24;
			} else if (var11 < field1263) {
				field1263 += (var11 - field1263) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1189.field360 + "," + field1189.field361 + "," + field1073 + "," + field1074 + "," + field1084 + "," + field1085 + "," + field1267 + "," + field1268);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1190.method248(); var11 != null; var11 = (class40) field1190.method250()) {
			if (var11.field638 == arg1 && var11.field640 == arg6 && var11.field641 == arg3 && var11.field639 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field638 = arg1;
			var10.field639 = arg8;
			var10.field640 = arg6;
			var10.field641 = arg3;
			method449(var10);
			field1190.method245(var10);
		}

		var10.field645 = arg7;
		var10.field647 = arg0;
		var10.field646 = arg5;
		var10.field648 = arg4;
		var10.field649 = arg2;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method540() {
		field1319 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1172) {
				field1186++;
				method511();
				method511();
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

		field1319 = false;
	}

	@ObfuscatedName("client.b(JB)V")
	public final void method541(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1424; var3++) {
				if (field1244[var3] == arg0) {
					field1424--;
					field1201 = true;

					for (int var4 = var3; var4 < field1424; var4++) {
						field1419[var4] = field1419[var4 + 1];
						field1178[var4] = field1178[var4 + 1];
						field1244[var4] = field1244[var4 + 1];
					}

					field1407.method218(160);
					field1407.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method542() {
		try {
			if (field1078 != null) {
				field1078.method38();
			}
		} catch (Exception var2) {
		}

		field1078 = null;
		field1214 = false;
		field1309 = 0;
		field1144 = "";
		field1145 = "";
		method442();
		field1408.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1176[var1].method359();
		}

		System.gc();
		method462();
		field1235 = -1;
		field1327 = -1;
		field1215 = 0;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method543(int arg0) {
		int[] var2 = field1183.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1135[arg0][var7][var5] & 0x18) == 0) {
					field1408.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1135[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1408.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1183.method181();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1135[arg0][var11][var10] & 0x18) == 0) {
					method523(var11, var10, var9, var8, arg0);
				}

				if (arg0 < 3 && (field1135[arg0 + 1][var11][var10] & 0x8) != 0) {
					method523(var11, var10, var9, var8, arg0 + 1);
				}
			}
		}

		field1100.method258();
		field1290 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1408.method79(field1122, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method330(var14).field848;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1176[field1122].field963;
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

						field1243[field1290] = field1287[var15];
						field1291[field1290] = var16;
						field1292[field1290] = var17;
						field1290++;
					}
				}
			}
		}

		field1103++;
		if (field1103 > 112) {
			field1103 = 0;
			field1407.method218(164);
			field1407.method219(50);
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method544(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method544(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.E(I)Ljava/lang/String;")
	public final String method545() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IBIILd;)V")
	public final void method546(int arg0, int arg1, int arg2, class4 arg3) {
		if (arg3.field63 == 0 && arg3.field78 != null && (!arg3.field77 || field1133 == arg3.field61 || field1311 == arg3.field61 || field1104 == arg3.field61)) {
			int var5 = class33.field568;
			int var6 = class33.field566;
			int var7 = class33.field569;
			int var8 = class33.field567;
			class33.method154(arg0, arg3.field66 + arg0, arg2, arg3.field67 + arg2);
			int var9 = arg3.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field79[var10] + arg0;
				int var12 = arg3.field80[var10] + arg2 - arg1;
				class4 var13 = class4.field56[arg3.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method451(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method546(var11, var13.field76, var12, var13);

					if (var13.field75 > var13.field67) {
						method537(var13.field66 + var11, var13.field75, var13.field76, var12, var13.field67);
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
									if (var17 > class33.field568 - 32 && var17 < class33.field569 && var18 > class33.field566 - 32 && var18 < class33.field567 || field1415 != 0 && field1414 == var14) {
										int var22 = 0;
										if (field1088 == 1 && field1089 == var14 && field1090 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method354(var13.field58[var14], var22, var21);
										if (var23 != null) {
											if (field1415 != 0 && field1414 == var14 && field1413 == var13.field61) {
												var19 = field17 - field1416;
												var20 = field18 - field1417;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1236 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method188(var18 + var20, 128, var17 + var19);

												if (var18 + var20 < class33.field566 && arg3.field76 > 0) {
													int var24 = (class33.field566 - var18 - var20) * field1060 / 3;
													if (var24 > field1060 * 10) {
														var24 = field1060 * 10;
													}

													if (var24 > arg3.field76) {
														var24 = arg3.field76;
													}

													arg3.field76 -= var24;
													field1417 += var24;
												}

												if (var18 + var20 + 32 > class33.field567 && arg3.field76 < arg3.field75 - arg3.field67) {
													int var25 = (var18 + var20 + 32 - class33.field567) * field1060 / 3;
													if (var25 > field1060 * 10) {
														var25 = field1060 * 10;
													}

													if (var25 > arg3.field75 - arg3.field67 - arg3.field76) {
														var25 = arg3.field75 - arg3.field67 - arg3.field76;
													}

													arg3.field76 += var25;
													field1417 -= var25;
												}
											} else if (field1127 != 0 && field1126 == var14 && field1125 == var13.field61) {
												var23.method188(var18, 128, var17);
											} else {
												var23.method186(var17, var18);
											}

											if (var23.field601 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1464.method206(method437(var26), var17 + var19 + 1, 0, var18 + var20 + 10);
												field1464.method206(method437(var26), var17 + var19, 0xFFFF00, var18 + var20 + 9);
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
						if (field1104 == var13.field61 || field1311 == var13.field61 || field1133 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method500(var13)) {
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
								class33.method157(var12, var13.field67, var29, var13.field66, var11);
							} else {
								class33.method158(var11, var12, var13.field66, var29, var13.field67);
							}
						} else if (var13.field93) {
							class33.method156(var13.field66, var12, var13.field67, var11, 256 - (var13.field68 & 0xFF), var29);
						} else {
							class33.method159(var29, var12, 256 - (var13.field68 & 0xFF), var13.field67, var11, var13.field66);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1104 == var13.field61 || field1311 == var13.field61 || field1133 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method500(var13)) {
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

						if (var13.field64 == 6 && field1116) {
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

									var31 = var31.substring(0, var35) + method474(method433(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method474(method433(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method474(method433(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method474(method433(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method474(method433(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method203(var41, var34, var13.field66 / 2 + var11, var33, var13.field95);
							} else {
								var30.method210(var41, var33, var11, var13.field95, var34);
							}

							var34 += var30.field617;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method500(var13)) {
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
						boolean var47 = method500(var13);
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
							class66 var50 = class66.field996[var48];
							var49 = var13.method34(var50.field999[var13.field59], var47, var50.field998[var13.field59]);
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
										var56 = var56 + " x" + method430(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method203(var56, var58, var13.field66 / 2 + var57, var13.field99, var13.field95);
									} else {
										var51.method210(var56, var13.field99, var57, var13.field95, var58);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method154(var5, var7, var6, var8);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method547() {
		while (true) {
			class39 var1 = field1330.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field633 == 0) {
				class31.method124(var1.field634, var1.field635);

				if ((field1330.method277(var1.field634) & 0x62) != 0) {
					field1201 = true;

					if (field1071 != -1) {
						field1231 = true;
					}
				}
			}

			if (var1.field633 == 1 && var1.field635 != null) {
				class7.method45(var1.field635);
			}

			if (var1.field633 == 2 && field1327 == var1.field634 && var1.field635 != null) {
				method558(field1328, var1.field635);
			}

			if (var1.field633 == 3 && field1323 == 1) {
				for (int var2 = 0; var2 < field1184.length; var2++) {
					if (field1148[var2] == var1.field634) {
						field1184[var2] = var1.field635;

						if (var1.field635 == null) {
							field1148[var2] = -1;
						}

						break;
					}

					if (field1149[var2] == var1.field634) {
						field1143[var2] = var1.field635;

						if (var1.field635 == null) {
							field1149[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field633 == 93 && field1330.method276(var1.field634)) {
				class3.method17(new class38(var1.field635), field1330);
			}
		}
	}

	@ObfuscatedName("client.G(I)I")
	public final int method548() {
		int var1 = 3;
		if (field1379 < 310) {
			int var2 = field1376 >> 7;
			int var3 = field1378 >> 7;
			int var4 = field1189.field360 >> 7;
			int var5 = field1189.field361 >> 7;

			if ((field1135[field1122][var2][var3] & 0x4) != 0) {
				var1 = field1122;
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

					if ((field1135[field1122][var2][var3] & 0x4) != 0) {
						var1 = field1122;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1135[field1122][var2][var3] & 0x4) != 0) {
							var1 = field1122;
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

					if ((field1135[field1122][var2][var3] & 0x4) != 0) {
						var1 = field1122;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1135[field1122][var2][var3] & 0x4) != 0) {
							var1 = field1122;
						}
					}
				}
			}
		}

		if ((field1135[field1122][field1189.field360 >> 7][field1189.field361 >> 7] & 0x4) != 0) {
			var1 = field1122;
		}

		return var1;
	}

	@ObfuscatedName("client.q(Z)I")
	public final int method549() {
		int var1 = method555(field1376, field1122, field1378);
		if (var1 - field1377 < 800 && (field1135[field1122][field1376 >> 7][field1378 >> 7] & 0x4) != 0) {
			return field1122;
		}

		return 3;
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method550(int arg0) {
		int var2 = class70.field1039[arg0].field1047;
		if (var2 != 0) {
			int var3 = field1202[arg0];
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
				field1241 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1404;

				if (var3 == 0) {
					method517(field1404, 0);
					field1404 = true;
				}

				if (var3 == 1) {
					method517(field1404, -400);
					field1404 = true;
				}

				if (var3 == 2) {
					method517(field1404, -800);
					field1404 = true;
				}

				if (var3 == 3) {
					method517(field1404, -1200);
					field1404 = true;
				}

				if (var3 == 4) {
					field1404 = false;
				}

				if (field1404 != var4 && !field1316) {
					if (field1404) {
						field1327 = field1235;
						field1328 = true;
						field1330.method279(2, field1327);
					} else {
						method462();
					}

					field1215 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1388 = true;
					method461(0);
				}

				if (var3 == 1) {
					field1388 = true;
					method461(-400);
				}

				if (var3 == 2) {
					field1388 = true;
					method461(-800);
				}

				if (var3 == 3) {
					field1388 = true;
					method461(-1200);
				}

				if (var3 == 4) {
					field1388 = false;
				}
			}

			if (var2 == 5) {
				field1165 = var3;
			}

			if (var2 == 6) {
				field1246 = var3;
			}

			if (var2 == 8) {
				field1332 = var3;
				field1231 = true;
			}

			if (var2 == 9) {
				field1093 = var3;
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method551() {
		for (int var1 = -1; var1 < field1282; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1280;
			} else {
				var2 = field1283[var1];
			}

			class27 var3 = field1281[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1472; var4++) {
			int var5 = field1473[var4];
			class26 var6 = field1471[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method552() {
		byte[] var1 = field1119.method299("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1456.method258();
		var2.method184(0, 0);
		field1457.method258();
		var2.method184(-637, 0);
		field1453.method258();
		var2.method184(-128, 0);
		field1454.method258();
		var2.method184(-202, -371);
		field1455.method258();
		var2.method184(-202, -171);
		field1458.method258();
		var2.method184(0, -265);
		field1459.method258();
		var2.method184(-562, -265);
		field1460.method258();
		var2.method184(-128, -171);
		field1461.method258();
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

		field1456.method258();
		var2.method184(382, 0);
		field1457.method258();
		var2.method184(-255, 0);
		field1453.method258();
		var2.method184(254, 0);
		field1454.method258();
		var2.method184(180, -371);
		field1455.method258();
		var2.method184(180, -171);
		field1458.method258();
		var2.method184(382, -265);
		field1459.method258();
		var2.method184(-180, -265);
		field1460.method258();
		var2.method184(254, -171);
		field1461.method258();
		var2.method184(-180, -171);
		class35 var7 = new class35(field1119, "logo", 0);
		field1453.method258();
		var7.method186(382 - var7.field597 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method553(int arg0, int arg1) {
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

	@ObfuscatedName("client.J(I)V")
	public final void method554() {
		if (field1415 == 0) {
			field1318[0] = "Cancel";
			field1108[0] = 1106;
			field1265 = 1;
			method491();
			field1066 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1367 == -1) {
					method465();
				} else {
					method526(4, class4.field56[field1367], field18, 4, 0, field17);
				}
			}

			if (field1133 != field1066) {
				field1133 = field1066;
			}

			field1066 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1356 != -1) {
					method526(205, class4.field56[field1356], field18, 553, 0, field17);
				} else if (field1295[field1288] != -1) {
					method526(205, class4.field56[field1295[field1288]], field18, 553, 0, field17);
				}
			}

			if (field1311 != field1066) {
				field1201 = true;
				field1311 = field1066;
			}

			field1066 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1071 != -1) {
					method526(357, class4.field56[field1071], field18, 17, 0, field17);
				} else if (field18 < 434 && field17 < 426) {
					method493(field18 - 357, field17 - 17);
				}
			}

			if (field1071 != -1 && field1104 != field1066) {
				field1231 = true;
				field1104 = field1066;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1265 - 1; var2++) {
					if (field1108[var2] < 1000 && field1108[var2 + 1] > 1000) {
						String var3 = field1318[var2];
						field1318[var2] = field1318[var2 + 1];
						field1318[var2 + 1] = var3;
						int var4 = field1108[var2];
						field1108[var2] = field1108[var2 + 1];
						field1108[var2 + 1] = var4;
						int var5 = field1106[var2];
						field1106[var2] = field1106[var2 + 1];
						field1106[var2 + 1] = var5;
						int var6 = field1107[var2];
						field1107[var2] = field1107[var2 + 1];
						field1107[var2 + 1] = var6;
						int var7 = field1109[var2];
						field1109[var2] = field1109[var2 + 1];
						field1109[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method555(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field1135[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field1170[var6][var4][var5] + field1170[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1170[var6][var4][var5 + 1] + field1170[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method9() {
		if (field1448 || field1468 || field1083) {
			method438();
		} else {
			field1188++;

			if (field1214) {
				method535();
			} else {
				method518(false);
			}

			field1289 = 0;
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method10() {
		field1241 = true;
	}

	public final void init() {
		field1313 = Integer.parseInt(getParameter("nodeid"));
		field1314 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method458();
		} else {
			method496();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1315 = false;
		} else {
			field1315 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.c(ILlb;B)V")
	public final void method556(int arg0, class38 arg1) {
		for (int var3 = 0; var3 < field1284; var3++) {
			int var4 = field1285[var3];
			class27 var5 = field1281[var4];
			int var6 = arg1.method229();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method229() << 8;
			}

			method472(arg1, var5, var6, var4);
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method557() {
		int var1 = field1334;
		int var2 = field1335;
		int var3 = field1336;
		int var4 = field1337;
		int var5 = 0x5D5447;
		class33.method157(var2, var4, var5, var3, var1);
		class33.method157(var2 + 1, 16, 0, var3 - 2, var1 + 1);
		class33.method158(var1 + 1, var2 + 18, var3 - 2, 0, var4 - 19);
		field1466.method206("Choose Option", var1 + 3, var5, var2 + 14);
		int var6 = field17;
		int var7 = field18;
		if (field1333 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1333 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1333 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1265; var8++) {
			int var9 = (field1265 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1466.method210(field1318[var8], var10, var1 + 3, true, var9);
		}
	}

	@ObfuscatedName("client.a(IZ[B)V")
	public final void method558(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method559(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1428 != -1) {
			field1480 = arg2;
			field23 = 0;
		}

		if (field1071 == -1) {
			field1231 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1158[var4] = field1158[var4 - 1];
			field1159[var4] = field1159[var4 - 1];
			field1160[var4] = field1160[var4 - 1];
		}

		field1158[0] = arg0;
		field1159[0] = arg1;
		field1160[0] = arg2;
	}

	@ObfuscatedName("client.K(I)V")
	public final void method560() {
		field1366 = 0;
		int var1 = (field1189.field360 >> 7) + field1267;
		int var2 = (field1189.field361 >> 7) + field1268;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1366 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1366 = 1;
		}

		if (field1366 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1366 = 0;
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method561() {
		if (field1447 == 2) {
			method479((field1111 - field1268 << 7) + field1114, field1112 * 2, (field1110 - field1267 << 7) + field1113);

			if (field1381 > -1 && field1217 % 20 < 10) {
				field1421[2].method186(field1381 - 12, field1382 - 28);
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.M(I)Ljava/net/Socket;")
	public final Socket method562(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1166[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1305[var3] = var2 / 4;
		}
	}
}
