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
	public int field1009;

	@ObfuscatedName("client.cb")
	public int field1010 = 0x4D4233;

	@ObfuscatedName("client.db")
	public int field1011;

	@ObfuscatedName("client.eb")
	public boolean field1012 = false;

	@ObfuscatedName("client.gb")
	public static int field1013;

	@ObfuscatedName("client.hb")
	public int field1014;

	@ObfuscatedName("client.ib")
	public class42 field1015 = new class42();

	@ObfuscatedName("client.jb")
	public int[][] field1016 = new int[104][104];

	@ObfuscatedName("client.kb")
	public class37[] field1017 = new class37[50];

	@ObfuscatedName("client.lb")
	public int[] field1018 = new int[50];

	@ObfuscatedName("client.nb")
	public static int field1019;

	@ObfuscatedName("client.ob")
	public int field1020;

	@ObfuscatedName("client.pb")
	public int field1021 = -1;

	@ObfuscatedName("client.qb")
	public long[] field1022 = new long[100];

	@ObfuscatedName("client.rb")
	public int field1023 = -1;

	@ObfuscatedName("client.sb")
	public int field1024;

	@ObfuscatedName("client.tb")
	public int field1025;

	@ObfuscatedName("client.ub")
	public int field1026;

	@ObfuscatedName("client.vb")
	public int field1027;

	@ObfuscatedName("client.wb")
	public String field1028;

	@ObfuscatedName("client.xb")
	public static int[] field1029 = new int[99];

	@ObfuscatedName("client.yb")
	public static int field1030;

	@ObfuscatedName("client.zb")
	public int field1031;

	@ObfuscatedName("client.ac")
	public int[] field1054 = new int[5];

	@ObfuscatedName("client.bc")
	public int field1055 = -1;

	@ObfuscatedName("client.cc")
	public int field1056 = -1;

	@ObfuscatedName("client.dc")
	public int field1057;

	@ObfuscatedName("client.ec")
	public class36[] field1058 = new class36[1000];

	@ObfuscatedName("client.fc")
	public final int[] field1059 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.gc")
	public int[] field1060 = new int[151];

	@ObfuscatedName("client.hc")
	public int field1061;

	@ObfuscatedName("client.ic")
	public int[] field1062 = new int[1000];

	@ObfuscatedName("client.jc")
	public int[] field1063 = new int[1000];

	@ObfuscatedName("client.kc")
	public String field1064 = "";

	@ObfuscatedName("client.lc")
	public class49[] field1065 = new class49[5];

	@ObfuscatedName("client.mc")
	public int field1066;

	@ObfuscatedName("client.nc")
	public int field1067;

	@ObfuscatedName("client.oc")
	public int field1068;

	@ObfuscatedName("client.pc")
	public int field1069;

	@ObfuscatedName("client.D")
	public boolean field991 = false;

	@ObfuscatedName("client.F")
	public int[] field993 = new int[100];

	@ObfuscatedName("client.G")
	public String[] field994 = new String[100];

	@ObfuscatedName("client.H")
	public String[] field995 = new String[100];

	@ObfuscatedName("client.O")
	public String[] field1001 = new String[100];

	@ObfuscatedName("client.P")
	public class36[] field1002 = new class36[20];

	@ObfuscatedName("client.X")
	public int[] field1007 = new int[50];

	@ObfuscatedName("client.Z")
	public int[] field1008 = new int[50];

	@ObfuscatedName("client.Ab")
	public int field1032 = 1;

	@ObfuscatedName("client.Eb")
	public boolean field1035 = false;

	@ObfuscatedName("client.Fb")
	public int field1036 = -1;

	@ObfuscatedName("client.Ib")
	public boolean[] field1038 = new boolean[5];

	@ObfuscatedName("client.Kb")
	public boolean field1040 = false;

	@ObfuscatedName("client.Mb")
	public int field1042 = 2;

	@ObfuscatedName("client.Tb")
	public int field1047 = 2;

	@ObfuscatedName("client.Zb")
	public boolean field1053 = false;

	@ObfuscatedName("client.vc")
	public int[] field1075 = new int[256];

	@ObfuscatedName("client.xc")
	public class27[] field1077 = new class27[8192];

	@ObfuscatedName("client.zc")
	public int[] field1079 = new int[8192];

	@ObfuscatedName("client.Qc")
	public class42 field1096 = new class42();

	@ObfuscatedName("client.Vc")
	public int[] field1100 = new int[33];

	@ObfuscatedName("client.id")
	public class36[] field1111 = new class36[8];

	@ObfuscatedName("client.jd")
	public int[] field1112 = new int[100];

	@ObfuscatedName("client.kd")
	public int[] field1113 = new int[2000];

	@ObfuscatedName("client.ld")
	public int[][] field1114 = new int[104][104];

	@ObfuscatedName("client.nd")
	public class4 field1116 = new class4();

	@ObfuscatedName("client.Ad")
	public int[][] field1129 = new int[104][104];

	@ObfuscatedName("client.Id")
	public int[] field1136 = new int[33];

	@ObfuscatedName("client.Kd")
	public int field1138 = 2;

	@ObfuscatedName("client.Rd")
	public int[] field1144 = new int[50];

	@ObfuscatedName("client.Td")
	public String field1145 = "";

	@ObfuscatedName("client.oe")
	public int[] field1164 = new int[5];

	@ObfuscatedName("client.pe")
	public int field1165 = 0x766654;

	@ObfuscatedName("client.qe")
	public boolean field1166 = false;

	@ObfuscatedName("client.re")
	public int[] field1167 = new int[5];

	@ObfuscatedName("client.se")
	public class42[][][] field1168 = new class42[4][104][104];

	@ObfuscatedName("client.ve")
	public class36[] field1171 = new class36[20];

	@ObfuscatedName("client.we")
	public int[] field1172 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.ze")
	public String field1174 = "";

	@ObfuscatedName("client.Ae")
	public boolean field1175 = false;

	@ObfuscatedName("client.De")
	public boolean field1178 = false;

	@ObfuscatedName("client.Ie")
	public long[] field1183 = new long[100];

	@ObfuscatedName("client.Ke")
	public int field1185 = 1;

	@ObfuscatedName("client.Le")
	public boolean field1186 = false;

	@ObfuscatedName("client.Me")
	public int field1187 = -1;

	@ObfuscatedName("client.Oe")
	public int[] field1189 = new int[1000];

	@ObfuscatedName("client.df")
	public boolean field1204 = false;

	@ObfuscatedName("client.gf")
	public int[] field1207 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.hf")
	public int[] field1208 = new int[50];

	@ObfuscatedName("client.mf")
	public boolean field1212 = false;

	@ObfuscatedName("client.nf")
	public class36[] field1213 = new class36[50];

	@ObfuscatedName("client.of")
	public int[] field1214 = new int[500];

	@ObfuscatedName("client.pf")
	public int[] field1215 = new int[500];

	@ObfuscatedName("client.qf")
	public int[] field1216 = new int[500];

	@ObfuscatedName("client.rf")
	public int[] field1217 = new int[500];

	@ObfuscatedName("client.tf")
	public int field1219 = 50;

	@ObfuscatedName("client.uf")
	public int[] field1220 = new int[field1219];

	@ObfuscatedName("client.vf")
	public int[] field1221 = new int[field1219];

	@ObfuscatedName("client.wf")
	public int[] field1222 = new int[field1219];

	@ObfuscatedName("client.xf")
	public int[] field1223 = new int[field1219];

	@ObfuscatedName("client.yf")
	public int[] field1224 = new int[field1219];

	@ObfuscatedName("client.zf")
	public int[] field1225 = new int[field1219];

	@ObfuscatedName("client.Af")
	public int[] field1226 = new int[field1219];

	@ObfuscatedName("client.Bf")
	public String[] field1227 = new String[field1219];

	@ObfuscatedName("client.Cf")
	public int field1228 = -1;

	@ObfuscatedName("client.Kf")
	public boolean field1235 = true;

	@ObfuscatedName("client.Mf")
	public int[] field1236 = new int[151];

	@ObfuscatedName("client.Nf")
	public String field1237 = "";

	@ObfuscatedName("client.Of")
	public String field1238 = "";

	@ObfuscatedName("client.Rf")
	public class39 field1240 = class39.method218(1);

	@ObfuscatedName("client.Sf")
	public boolean field1241 = false;

	@ObfuscatedName("client.bg")
	public int field1250 = -1;

	@ObfuscatedName("client.cg")
	public byte[] field1251 = new byte[16384];

	@ObfuscatedName("client.dg")
	public boolean field1252 = false;

	@ObfuscatedName("client.kg")
	public int[] field1259 = new int[5];

	@ObfuscatedName("client.mg")
	public class39 field1260 = class39.method218(1);

	@ObfuscatedName("client.ng")
	public int field1261 = -1;

	@ObfuscatedName("client.og")
	public boolean field1262 = false;

	@ObfuscatedName("client.vg")
	public boolean field1269 = false;

	@ObfuscatedName("client.Eg")
	public String[] field1277 = new String[500];

	@ObfuscatedName("client.Ig")
	public boolean field1281 = false;

	@ObfuscatedName("client.Jg")
	public boolean field1282 = false;

	@ObfuscatedName("client.Kg")
	public boolean field1283 = false;

	@ObfuscatedName("client.Lg")
	public String field1284 = "";

	@ObfuscatedName("client.Mg")
	public String field1285 = "";

	@ObfuscatedName("client.Qg")
	public int field1288 = 78;

	@ObfuscatedName("client.Rg")
	public boolean field1289 = true;

	@ObfuscatedName("client.Wg")
	public boolean field1294 = false;

	@ObfuscatedName("client.Xg")
	public boolean field1295 = false;

	@ObfuscatedName("client.fh")
	public class61[] field1303 = new class61[4];

	@ObfuscatedName("client.jh")
	public int[] field1306 = new int[50];

	@ObfuscatedName("client.mh")
	public boolean field1308 = false;

	@ObfuscatedName("client.qh")
	public int field1312 = 0x332D25;

	@ObfuscatedName("client.sh")
	public boolean field1314 = false;

	@ObfuscatedName("client.th")
	public int[] field1315 = new int[5];

	@ObfuscatedName("client.zh")
	public class39 field1321 = class39.method218(1);

	@ObfuscatedName("client.Ah")
	public int field1322 = 2048;

	@ObfuscatedName("client.Bh")
	public int field1323 = 2047;

	@ObfuscatedName("client.Ch")
	public class28[] field1324 = new class28[field1322];

	@ObfuscatedName("client.Eh")
	public int[] field1326 = new int[field1322];

	@ObfuscatedName("client.Gh")
	public int[] field1328 = new int[field1322];

	@ObfuscatedName("client.Hh")
	public class39[] field1329 = new class39[field1322];

	@ObfuscatedName("client.Jh")
	public int field1331 = -1;

	@ObfuscatedName("client.Oh")
	public String field1336 = "";

	@ObfuscatedName("client.Ph")
	public String field1337 = "";

	@ObfuscatedName("client.Zh")
	public final int field1345 = 100;

	@ObfuscatedName("client.ai")
	public int[] field1346 = new int[100];

	@ObfuscatedName("client.di")
	public int field1349 = -1;

	@ObfuscatedName("client.ei")
	public class42 field1350 = new class42();

	@ObfuscatedName("client.hi")
	public int[] field1353 = new int[9];

	@ObfuscatedName("client.ji")
	public boolean field1355 = false;

	@ObfuscatedName("client.ki")
	public class37[] field1356 = new class37[13];

	@ObfuscatedName("client.mi")
	public int field1358 = -1;

	@ObfuscatedName("client.ni")
	public int[] field1359 = new int[2000];

	@ObfuscatedName("client.pi")
	public int field1360 = 0x23201B;

	@ObfuscatedName("client.qi")
	public int[] field1361 = new int[7];

	@ObfuscatedName("client.ri")
	public CRC32 field1362 = new CRC32();

	@ObfuscatedName("client.si")
	public boolean field1363 = false;

	@ObfuscatedName("client.wi")
	public int field1366 = 3;

	@ObfuscatedName("client.yi")
	public int field1368 = 128;

	@ObfuscatedName("client.Ki")
	public boolean field1378 = true;

	@ObfuscatedName("client.Pi")
	public int[] field1383 = new int[4000];

	@ObfuscatedName("client.Qi")
	public int[] field1384 = new int[4000];

	@ObfuscatedName("client.Ri")
	public int field1385 = -1;

	@ObfuscatedName("client.I")
	public static int field996 = 10;

	@ObfuscatedName("client.K")
	public static boolean field998 = true;

	@ObfuscatedName("client.Bb")
	public static final int[][] field1033 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Zc")
	public static BigInteger field1104 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.md")
	public static final int[] field1115 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.od")
	public static BigInteger field1117 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ih")
	public static String field1330 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.M")
	public int field1000;

	@ObfuscatedName("client.R")
	public int field1003;

	@ObfuscatedName("client.U")
	public static int field1004;

	@ObfuscatedName("client.Cb")
	public static int field1034;

	@ObfuscatedName("client.Jb")
	public int field1039;

	@ObfuscatedName("client.Lb")
	public int field1041;

	@ObfuscatedName("client.Nb")
	public int field1043;

	@ObfuscatedName("client.Ob")
	public int field1044;

	@ObfuscatedName("client.Pb")
	public int field1045;

	@ObfuscatedName("client.Sb")
	public int field1046;

	@ObfuscatedName("client.Ub")
	public int field1048;

	@ObfuscatedName("client.Vb")
	public int field1049;

	@ObfuscatedName("client.Wb")
	public int field1050;

	@ObfuscatedName("client.Xb")
	public int field1051;

	@ObfuscatedName("client.qc")
	public int field1070;

	@ObfuscatedName("client.wc")
	public int field1076;

	@ObfuscatedName("client.yc")
	public int field1078;

	@ObfuscatedName("client.Ac")
	public int field1080;

	@ObfuscatedName("client.Bc")
	public int field1081;

	@ObfuscatedName("client.Cc")
	public int field1082;

	@ObfuscatedName("client.Dc")
	public int field1083;

	@ObfuscatedName("client.Ec")
	public int field1084;

	@ObfuscatedName("client.Pc")
	public static int field1095;

	@ObfuscatedName("client.Sc")
	public int field1097;

	@ObfuscatedName("client.Tc")
	public int field1098;

	@ObfuscatedName("client.Uc")
	public int field1099;

	@ObfuscatedName("client.gd")
	public int field1109;

	@ObfuscatedName("client.hd")
	public int field1110;

	@ObfuscatedName("client.pd")
	public int field1118;

	@ObfuscatedName("client.qd")
	public int field1119;

	@ObfuscatedName("client.rd")
	public int field1120;

	@ObfuscatedName("client.sd")
	public int field1121;

	@ObfuscatedName("client.td")
	public int field1122;

	@ObfuscatedName("client.ud")
	public int field1123;

	@ObfuscatedName("client.Bd")
	public int field1130;

	@ObfuscatedName("client.Dd")
	public static int field1131;

	@ObfuscatedName("client.Ed")
	public int field1132;

	@ObfuscatedName("client.Fd")
	public int field1133;

	@ObfuscatedName("client.Jd")
	public int field1137;

	@ObfuscatedName("client.Ld")
	public int field1139;

	@ObfuscatedName("client.Md")
	public int field1140;

	@ObfuscatedName("client.Nd")
	public int field1141;

	@ObfuscatedName("client.Od")
	public int field1142;

	@ObfuscatedName("client.Pd")
	public int field1143;

	@ObfuscatedName("client.Vd")
	public int field1146;

	@ObfuscatedName("client.ee")
	public int field1155;

	@ObfuscatedName("client.le")
	public int field1161;

	@ObfuscatedName("client.me")
	public int field1162;

	@ObfuscatedName("client.ne")
	public int field1163;

	@ObfuscatedName("client.xe")
	public static int field1173;

	@ObfuscatedName("client.Be")
	public int field1176;

	@ObfuscatedName("client.Ce")
	public int field1177;

	@ObfuscatedName("client.Ee")
	public int field1179;

	@ObfuscatedName("client.Fe")
	public int field1180;

	@ObfuscatedName("client.Ge")
	public int field1181;

	@ObfuscatedName("client.Je")
	public int field1184;

	@ObfuscatedName("client.Ne")
	public int field1188;

	@ObfuscatedName("client.Se")
	public int field1193;

	@ObfuscatedName("client.cf")
	public int field1203;

	@ObfuscatedName("client.ef")
	public int field1205;

	@ObfuscatedName("client.ff")
	public int field1206;

	@ObfuscatedName("client.jf")
	public int field1209;

	@ObfuscatedName("client.kf")
	public int field1210;

	@ObfuscatedName("client.sf")
	public int field1218;

	@ObfuscatedName("client.Qf")
	public static int field1239;

	@ObfuscatedName("client.Tf")
	public int field1242;

	@ObfuscatedName("client.Uf")
	public int field1243;

	@ObfuscatedName("client.Vf")
	public int field1244;

	@ObfuscatedName("client.Wf")
	public int field1245;

	@ObfuscatedName("client.Xf")
	public int field1246;

	@ObfuscatedName("client.Yf")
	public int field1247;

	@ObfuscatedName("client.Zf")
	public int field1248;

	@ObfuscatedName("client.ag")
	public int field1249;

	@ObfuscatedName("client.fg")
	public int field1254;

	@ObfuscatedName("client.gg")
	public int field1255;

	@ObfuscatedName("client.hg")
	public int field1256;

	@ObfuscatedName("client.ig")
	public int field1257;

	@ObfuscatedName("client.jg")
	public int field1258;

	@ObfuscatedName("client.tg")
	public int field1267;

	@ObfuscatedName("client.wg")
	public int field1270;

	@ObfuscatedName("client.xg")
	public int field1271;

	@ObfuscatedName("client.yg")
	public int field1272;

	@ObfuscatedName("client.zg")
	public int field1273;

	@ObfuscatedName("client.Ag")
	public int field1274;

	@ObfuscatedName("client.Bg")
	public int field1275;

	@ObfuscatedName("client.Dg")
	public int field1276;

	@ObfuscatedName("client.Fg")
	public int field1278;

	@ObfuscatedName("client.Gg")
	public int field1279;

	@ObfuscatedName("client.Hg")
	public int field1280;

	@ObfuscatedName("client.Og")
	public int field1286;

	@ObfuscatedName("client.Pg")
	public static int field1287;

	@ObfuscatedName("client.Sg")
	public int field1290;

	@ObfuscatedName("client.Tg")
	public static int field1291;

	@ObfuscatedName("client.Ug")
	public static int field1292;

	@ObfuscatedName("client.Vg")
	public int field1293;

	@ObfuscatedName("client.ah")
	public int field1298;

	@ObfuscatedName("client.bh")
	public int field1299;

	@ObfuscatedName("client.ch")
	public int field1300;

	@ObfuscatedName("client.dh")
	public int field1301;

	@ObfuscatedName("client.eh")
	public int field1302;

	@ObfuscatedName("client.hh")
	public int field1304;

	@ObfuscatedName("client.ih")
	public int field1305;

	@ObfuscatedName("client.lh")
	public static int field1307;

	@ObfuscatedName("client.ph")
	public int field1311;

	@ObfuscatedName("client.rh")
	public static int field1313;

	@ObfuscatedName("client.uh")
	public int field1316;

	@ObfuscatedName("client.vh")
	public int field1317;

	@ObfuscatedName("client.wh")
	public int field1318;

	@ObfuscatedName("client.xh")
	public int field1319;

	@ObfuscatedName("client.yh")
	public int field1320;

	@ObfuscatedName("client.Dh")
	public int field1325;

	@ObfuscatedName("client.Fh")
	public int field1327;

	@ObfuscatedName("client.Kh")
	public int field1332;

	@ObfuscatedName("client.Rh")
	public int field1338;

	@ObfuscatedName("client.Sh")
	public int field1339;

	@ObfuscatedName("client.Th")
	public int field1340;

	@ObfuscatedName("client.Uh")
	public int field1341;

	@ObfuscatedName("client.Vh")
	public int field1342;

	@ObfuscatedName("client.Yh")
	public int field1344;

	@ObfuscatedName("client.bi")
	public static int field1347;

	@ObfuscatedName("client.ti")
	public static int field1364;

	@ObfuscatedName("client.vi")
	public int field1365;

	@ObfuscatedName("client.xi")
	public int field1367;

	@ObfuscatedName("client.zi")
	public int field1369;

	@ObfuscatedName("client.Ai")
	public int field1370;

	@ObfuscatedName("client.Bi")
	public int field1371;

	@ObfuscatedName("client.Di")
	public int field1373;

	@ObfuscatedName("client.Ei")
	public int field1374;

	@ObfuscatedName("client.Fi")
	public int field1375;

	@ObfuscatedName("client.Gi")
	public int field1376;

	@ObfuscatedName("client.Hi")
	public int field1377;

	@ObfuscatedName("client.C")
	public static int field990;

	@ObfuscatedName("client.J")
	public static int field997;

	@ObfuscatedName("client.ug")
	public long field1268;

	@ObfuscatedName("client.nh")
	public long field1309;

	@ObfuscatedName("client.E")
	public long field992;

	@ObfuscatedName("client.li")
	public class19 field1357;

	@ObfuscatedName("client.fe")
	public static class28 field1156;

	@ObfuscatedName("client.Gb")
	public class36 field1037;

	@ObfuscatedName("client.rc")
	public class36 field1071;

	@ObfuscatedName("client.sc")
	public class36 field1072;

	@ObfuscatedName("client.tc")
	public class36 field1073;

	@ObfuscatedName("client.uc")
	public class36 field1074;

	@ObfuscatedName("client.te")
	public class36 field1169;

	@ObfuscatedName("client.ue")
	public class36 field1170;

	@ObfuscatedName("client.He")
	public class36 field1182;

	@ObfuscatedName("client.lf")
	public class36 field1211;

	@ObfuscatedName("client.Yg")
	public class36 field1296;

	@ObfuscatedName("client.Zg")
	public class36 field1297;

	@ObfuscatedName("client.cd")
	public class37 field1106;

	@ObfuscatedName("client.dd")
	public class37 field1107;

	@ObfuscatedName("client.vd")
	public class37 field1124;

	@ObfuscatedName("client.wd")
	public class37 field1125;

	@ObfuscatedName("client.xd")
	public class37 field1126;

	@ObfuscatedName("client.yd")
	public class37 field1127;

	@ObfuscatedName("client.zd")
	public class37 field1128;

	@ObfuscatedName("client.Gd")
	public class37 field1134;

	@ObfuscatedName("client.Hd")
	public class37 field1135;

	@ObfuscatedName("client.be")
	public class37 field1152;

	@ObfuscatedName("client.ce")
	public class37 field1153;

	@ObfuscatedName("client.de")
	public class37 field1154;

	@ObfuscatedName("client.Pe")
	public class37 field1190;

	@ObfuscatedName("client.Qe")
	public class37 field1191;

	@ObfuscatedName("client.Re")
	public class37 field1192;

	@ObfuscatedName("client.Df")
	public class37 field1229;

	@ObfuscatedName("client.Ef")
	public class37 field1230;

	@ObfuscatedName("client.Ff")
	public class37 field1231;

	@ObfuscatedName("client.Gf")
	public class37 field1232;

	@ObfuscatedName("client.Hf")
	public class37 field1233;

	@ObfuscatedName("client.ge")
	public class38 field1157;

	@ObfuscatedName("client.he")
	public class38 field1158;

	@ObfuscatedName("client.ie")
	public class38 field1159;

	@ObfuscatedName("client.je")
	public class38 field1160;

	@ObfuscatedName("client.Fc")
	public class44 field1085;

	@ObfuscatedName("client.Gc")
	public class44 field1086;

	@ObfuscatedName("client.Hc")
	public class44 field1087;

	@ObfuscatedName("client.Ic")
	public class44 field1088;

	@ObfuscatedName("client.Jc")
	public class44 field1089;

	@ObfuscatedName("client.Kc")
	public class44 field1090;

	@ObfuscatedName("client.Lc")
	public class44 field1091;

	@ObfuscatedName("client.Mc")
	public class44 field1092;

	@ObfuscatedName("client.Nc")
	public class44 field1093;

	@ObfuscatedName("client.Oc")
	public class44 field1094;

	@ObfuscatedName("client.Wc")
	public class44 field1101;

	@ObfuscatedName("client.Xc")
	public class44 field1102;

	@ObfuscatedName("client.Yc")
	public class44 field1103;

	@ObfuscatedName("client.Te")
	public class44 field1194;

	@ObfuscatedName("client.Ue")
	public class44 field1195;

	@ObfuscatedName("client.Ve")
	public class44 field1196;

	@ObfuscatedName("client.We")
	public class44 field1197;

	@ObfuscatedName("client.Xe")
	public class44 field1198;

	@ObfuscatedName("client.Ye")
	public class44 field1199;

	@ObfuscatedName("client.Ze")
	public class44 field1200;

	@ObfuscatedName("client.af")
	public class44 field1201;

	@ObfuscatedName("client.bf")
	public class44 field1202;

	@ObfuscatedName("client.pg")
	public class44 field1263;

	@ObfuscatedName("client.qg")
	public class44 field1264;

	@ObfuscatedName("client.rg")
	public class44 field1265;

	@ObfuscatedName("client.sg")
	public class44 field1266;

	@ObfuscatedName("client.ad")
	public class48 field1105;

	@ObfuscatedName("client.ci")
	public class50 field1348;

	@ObfuscatedName("client.Wh")
	public class51 field1343;

	@ObfuscatedName("client.ed")
	public class5 field1108;

	@ObfuscatedName("client.Yb")
	public String field1052;

	@ObfuscatedName("client.eg")
	public String field1253;

	@ObfuscatedName("client.oh")
	public static boolean field1310;

	@ObfuscatedName("client.L")
	public static boolean field999;

	@ObfuscatedName("client.V")
	public int[] field1005;

	@ObfuscatedName("client.W")
	public int[] field1006;

	@ObfuscatedName("client.Wd")
	public int[] field1147;

	@ObfuscatedName("client.Xd")
	public int[] field1148;

	@ObfuscatedName("client.Yd")
	public int[] field1149;

	@ObfuscatedName("client.Zd")
	public int[] field1150;

	@ObfuscatedName("client.ae")
	public int[] field1151;

	@ObfuscatedName("client.Lh")
	public int[] field1333;

	@ObfuscatedName("client.Mh")
	public int[] field1334;

	@ObfuscatedName("client.Nh")
	public int[] field1335;

	@ObfuscatedName("client.Li")
	public int[] field1379;

	@ObfuscatedName("client.Mi")
	public int[] field1380;

	@ObfuscatedName("client.Ni")
	public int[] field1381;

	@ObfuscatedName("client.Oi")
	public int[] field1382;

	@ObfuscatedName("client.Ci")
	public class37[] field1372;

	@ObfuscatedName("client.If")
	public byte[][] field1234;

	@ObfuscatedName("client.fi")
	public byte[][] field1351;

	@ObfuscatedName("client.ii")
	public byte[][][] field1354;

	@ObfuscatedName("client.gi")
	public int[][][] field1352;

	@ObfuscatedName("client.d(B)V")
	public final void method9() {
		if (field1166 || field1282 || field1178) {
			method487();
		} else {
			field1013++;

			if (field1295) {
				method528();
			} else {
				method466();
			}

			field1000 = 0;
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method414(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field997 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(ILmb;Z)V")
	public final void method415(int arg0, class39 arg1) {
		field1188 = 0;
		field1327 = 0;
		method490(arg1, arg0);
		method426(arg1, arg0);
		method420(arg0, arg1);

		for (int var3 = 0; var3 < field1188; var3++) {
			int var4 = field1189[var3];
			if (field1131 != field1077[var4].field403) {
				field1077[var4].field411 = null;
				field1077[var4] = null;
			}
		}

		if (arg1.field611 != arg0) {
			signlink.reporterror(field1284 + " size mismatch in getnpcpos - pos:" + arg1.field611 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1078; var5++) {
			if (field1077[field1079[var5]] == null) {
				signlink.reporterror(field1284 + " null entry in npc list - pos:" + var5 + " size:" + field1078);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIBIIII)Z")
	public final boolean method416(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1129[var14][var15] = 0;
				field1114[var14][var15] = 99999999;
			}
		}

		int var16 = arg2;
		int var17 = arg3;
		field1129[arg2][arg3] = 99;
		field1114[arg2][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1383[var18] = arg2;
		int var35 = var18 + 1;
		field1384[var18] = arg3;
		boolean var20 = false;
		int var21 = field1383.length;
		int[][] var22 = field1303[field1003].field911;
		while (var35 != var19) {
			var16 = field1383[var19];
			var17 = field1384[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && field1303[field1003].method355(arg9 - 1, arg8, var17, arg1, var16, arg4)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && field1303[field1003].method356(arg4, var17, arg8, var16, arg1, arg9 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg10 != 0 && arg7 != 0 && field1303[field1003].method357(arg7, arg1, arg10, arg8, var16, arg5, var17)) {
				var20 = true;
				break;
			}

			int var23 = field1114[var16][var17] + 1;
			if (var16 > 0 && field1129[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1383[var35] = var16 - 1;
				field1384[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1129[var16 - 1][var17] = 2;
				field1114[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1129[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1383[var35] = var16 + 1;
				field1384[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1129[var16 + 1][var17] = 8;
				field1114[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1129[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1383[var35] = var16;
				field1384[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1129[var16][var17 - 1] = 1;
				field1114[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1129[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1383[var35] = var16;
				field1384[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1129[var16][var17 + 1] = 4;
				field1114[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1129[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1383[var35] = var16 - 1;
				field1384[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1129[var16 - 1][var17 - 1] = 3;
				field1114[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1129[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1383[var35] = var16 + 1;
				field1384[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1129[var16 + 1][var17 - 1] = 9;
				field1114[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1129[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1383[var35] = var16 - 1;
				field1384[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1129[var16 - 1][var17 + 1] = 6;
				field1114[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1129[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1383[var35] = var16 + 1;
				field1384[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1129[var16 + 1][var17 + 1] = 12;
				field1114[var16 + 1][var17 + 1] = var23;
			}
		}

		field1123 = 0;
		if (!var20) {
			if (arg0) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1114[var26][var27] < var24) {
								var24 = field1114[var26][var27];
								var16 = var26;
								var17 = var27;
								field1123 = 1;
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
		field1383[var28] = var16;
		int var36 = var28 + 1;
		field1384[var28] = var17;
		int var29;
		int var30 = var29 = field1129[var16][var17];
		while (arg2 != var16 || arg3 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1383[var36] = var16;
				field1384[var36++] = var17;
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

			var30 = field1129[var16][var17];
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
		int var32 = field1383[var36];
		int var33 = field1384[var36];

		if (arg6 == 0) {
			field1321.method220(222);
			field1321.method221(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field1321.method220(201);
			field1321.method221(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field1321.method220(140);
			field1321.method221(var31 + var31 + 3);
		}

		if (field21[5] == 1) {
			field1321.method221(1);
		} else {
			field1321.method221(0);
		}

		field1321.method222(field1317 + var32);
		field1321.method222(field1318 + var33);
		field1209 = field1383[0];
		field1210 = field1384[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1321.method221(field1383[var36] - var32);
			field1321.method221(field1384[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method417() {
		if (field1133 != 0) {
			class38 var1 = field1158;
			int var2 = 0;
			if (field1130 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field995[var3] != null) {
					int var4 = field993[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1276 == 0 || field1276 == 1 && method454(field994[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method209(4, "From " + field994[var3] + ": " + field995[var3], 0, var5);
						var1.method209(4, "From " + field994[var3] + ": " + field995[var3], 0xFFFF, var5 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1276 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method209(4, field995[var3], 0, var6);
						var1.method209(4, field995[var3], 0xFFFF, var6 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1276 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method209(4, "To " + field994[var3] + ": " + field995[var3], 0, var7);
						var1.method209(4, "To " + field994[var3] + ": " + field995[var3], 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method418() {
		try {
			if (field1108 != null) {
				field1108.method37();
			}
		} catch (Exception var2) {
		}

		field1108 = null;
		field1295 = false;
		field1098 = 0;
		field1284 = "";
		field1285 = "";
		class6.method44();
		method542();
		field1357.method62();

		for (int var1 = 0; var1 < 4; var1++) {
			field1303[var1].method346();
		}

		System.gc();
		method543();
		field1036 = -1;
		field1039 = -1;
		field1365 = 0;
	}

	@ObfuscatedName("client.e(B)Z")
	public final boolean method419() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ZILmb;)V")
	public final void method420(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1327; var3++) {
			int var4 = field1328[var3];
			class27 var5 = field1077[var4];
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
				if (var7 == -1 || var5.field386 == -1 || class65.field943[var7].field951 > class65.field943[var5.field386].field951 || class65.field943[var5.field386].field951 == 0) {
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
				var5.field377 = field1131 + 400;
				var5.field378 = arg1.method231();
				var5.field379 = arg1.method231();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field411 = class58.method329(arg1.method233());
				var5.field366 = var5.field411.field847;
				var5.field367 = var5.field411.field848;
				var5.field368 = var5.field411.field849;
				var5.field369 = var5.field411.field850;
				var5.field364 = var5.field411.field846;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field391 = arg1.method233();
				int var9 = arg1.method236();
				var5.field395 = var9 >> 16;
				var5.field394 = (var9 & 0xFFFF) + field1131;
				var5.field392 = 0;
				var5.field393 = 0;

				if (var5.field394 > field1131) {
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

	@ObfuscatedName("client.e(I)V")
	public final void method421() {
		int var1 = field1080 * 128 + 64;
		int var2 = field1081 * 128 + 64;
		int var3 = method499(field1081, field1080, field1003) - field1082;

		if (field1066 < var1) {
			field1066 += (var1 - field1066) * field1084 / 1000 + field1083;
			if (field1066 > var1) {
				field1066 = var1;
			}
		}

		if (field1066 > var1) {
			field1066 -= (field1066 - var1) * field1084 / 1000 + field1083;
			if (field1066 < var1) {
				field1066 = var1;
			}
		}

		if (field1067 < var3) {
			field1067 += (var3 - field1067) * field1084 / 1000 + field1083;
			if (field1067 > var3) {
				field1067 = var3;
			}
		}

		if (field1067 > var3) {
			field1067 -= (field1067 - var3) * field1084 / 1000 + field1083;
			if (field1067 < var3) {
				field1067 = var3;
			}
		}

		if (field1068 < var2) {
			field1068 += (var2 - field1068) * field1084 / 1000 + field1083;
			if (field1068 > var2) {
				field1068 = var2;
			}
		}

		if (field1068 > var2) {
			field1068 -= (field1068 - var2) * field1084 / 1000 + field1083;
			if (field1068 < var2) {
				field1068 = var2;
			}
		}

		int var4 = field1118 * 128 + 64;
		int var5 = field1119 * 128 + 64;
		int var6 = method499(field1119, field1118, field1003) - field1120;
		int var7 = var4 - field1066;
		int var8 = var6 - field1067;
		int var9 = var5 - field1068;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1069 < var11) {
			field1069 += (var11 - field1069) * field1122 / 1000 + field1121;
			if (field1069 > var11) {
				field1069 = var11;
			}
		}

		if (field1069 > var11) {
			field1069 -= (field1069 - var11) * field1122 / 1000 + field1121;
			if (field1069 < var11) {
				field1069 = var11;
			}
		}

		int var13 = var12 - field1070;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1070 += field1122 * var13 / 1000 + field1121;
			field1070 &= 0x7FF;
		}

		if (var13 < 0) {
			field1070 -= -var13 * field1122 / 1000 + field1121;
			field1070 &= 0x7FF;
		}

		int var14 = var12 - field1070;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1070 = var12;
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method422(class4 arg0) {
		int var2 = arg0.field60;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1277[field1332] = "Remove @whi@" + field1001[var2];
			field1216[field1332] = 557;
			field1332++;
			field1277[field1332] = "Message @whi@" + field1001[var2];
			field1216[field1332] = 679;
			field1332++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1277[field1332] = "Remove @whi@" + arg0.field90;
			field1216[field1332] = 556;
			field1332++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IBIIII)V")
	public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1106.method204(arg2, arg3);
		field1107.method204(arg2, arg3 + arg4 - 16);
		class34.method165(arg2, 16, field1360, arg4 - 32, arg3 + 16);
		int var6 = (arg4 - 32) * arg4 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg0 / (arg1 - arg4);
		class34.method165(arg2, 16, field1010, var6, arg3 + var7 + 16);
		class34.method168(arg3 + var7 + 16, field1165, arg2, var6);
		class34.method168(arg3 + var7 + 16, field1165, arg2 + 1, var6);
		class34.method167(arg2, field1165, 16, arg3 + var7 + 16);
		class34.method167(arg2, field1165, 16, arg3 + var7 + 17);
		class34.method168(arg3 + var7 + 16, field1312, arg2 + 15, var6);
		class34.method168(arg3 + var7 + 17, field1312, arg2 + 14, var6 - 1);
		class34.method167(arg2, field1312, 16, arg3 + var7 + var6 + 15);
		class34.method167(arg2 + 1, field1312, 15, arg3 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.b(II)V")
	public final void method424(int arg0, int arg1) {
		class42 var3 = field1168[field1003][arg0][arg1];
		if (var3 == null) {
			field1357.method83(field1003, arg0, arg1);
		} else {
			int var4 = -99999999;
			class30 var5 = null;
			for (class30 var6 = (class30) var3.method250(); var6 != null; var6 = (class30) var3.method252()) {
				class59 var7 = class59.method335(var6.field444);
				int var8 = var7.field883;
				if (var7.field882) {
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
			field1357.method69(var12, var9, arg0, arg1, field1003, var10, method499(arg1 * 128 + 64, arg0 * 128 + 64, field1003), var5);
		}
	}

	@ObfuscatedName("client.a(ILbb;III)V")
	public final void method425(int arg0, class28 arg1, int arg2, int arg3) {
		if (field1156 != arg1 && field1332 < 400) {
			String var5 = arg1.field412 + method439(field1156.field418, arg1.field418) + " (level-" + arg1.field418 + ")";
			if (field1048 == 1) {
				field1277[field1332] = "Use " + field1052 + " with @whi@" + var5;
				field1216[field1332] = 367;
				field1217[field1332] = arg2;
				field1214[field1332] = arg0;
				field1215[field1332] = arg3;
				field1332++;
			} else if (field1025 != 1) {
				field1277[field1332] = "Follow @whi@" + var5;
				field1216[field1332] = 1544;
				field1217[field1332] = arg2;
				field1214[field1332] = arg0;
				field1215[field1332] = arg3;
				field1332++;
				if (field1344 == 0) {
					field1277[field1332] = "Trade with @whi@" + var5;
					field1216[field1332] = 1373;
					field1217[field1332] = arg2;
					field1214[field1332] = arg0;
					field1215[field1332] = arg3;
					field1332++;
				}

				if (field1076 > 0) {
					field1277[field1332] = "Attack @whi@" + var5;

					if (field1156.field418 >= arg1.field418) {
						field1216[field1332] = 151;
					} else {
						field1216[field1332] = 2151;
					}

					field1217[field1332] = arg2;
					field1214[field1332] = arg0;
					field1215[field1332] = arg3;
					field1332++;
				}

				if (field1304 == 1) {
					field1277[field1332] = "Fight @whi@" + var5;
					field1216[field1332] = 151;
					field1217[field1332] = arg2;
					field1214[field1332] = arg0;
					field1215[field1332] = arg3;
					field1332++;
				}

				if (field1304 == 2) {
					field1277[field1332] = "Duel-with @whi@" + var5;
					field1216[field1332] = 1101;
					field1217[field1332] = arg2;
					field1214[field1332] = arg0;
					field1215[field1332] = arg3;
					field1332++;
				}
			} else if ((field1027 & 0x8) == 8) {
				field1277[field1332] = field1028 + " @whi@" + var5;
				field1216[field1332] = 651;
				field1217[field1332] = arg2;
				field1214[field1332] = arg0;
				field1215[field1332] = arg3;
				field1332++;
			}

			for (int var6 = 0; var6 < field1332; var6++) {
				if (field1216[var6] == 660) {
					field1277[var6] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method426(class39 arg0, int arg1) {
		while (arg0.field612 + 21 < arg1 * 8) {
			int var3 = arg0.method242(13);
			if (var3 == 8191) {
				break;
			}

			if (field1077[var3] == null) {
				field1077[var3] = new class27();
			}

			class27 var4 = field1077[var3];
			field1079[field1078++] = var3;
			var4.field403 = field1131;
			var4.field411 = class58.method329(arg0.method242(11));
			var4.field363 = var4.field411.field843;
			var4.field366 = var4.field411.field847;
			var4.field367 = var4.field411.field848;
			var4.field368 = var4.field411.field849;
			var4.field369 = var4.field411.field850;
			var4.field364 = var4.field411.field846;
			int var5 = arg0.method242(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method242(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method122(false, field1156.field408[0] + var6, field1156.field407[0] + var5);
			int var7 = arg0.method242(1);
			if (var7 == 1) {
				field1328[field1327++] = var3;
			}
		}

		arg0.method243();
	}

	@ObfuscatedName("client.b(ILmb;Z)V")
	public final void method427(int arg0, class39 arg1) {
		if (arg0 == 112 || arg0 == 31) {
			int var3 = arg1.method231();
			int var4 = (var3 >> 4 & 0x7) + field1270;
			int var5 = (var3 & 0x7) + field1271;
			int var6 = arg1.method231();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1059[var7];
			int var10;
			if (arg0 == 31) {
				var10 = -1;
			} else {
				var10 = arg1.method233();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method480(var5, field1003, -1, var7, 0, var8, var10, var9, var4);
			}
		} else if (arg0 == 230) {
			int var11 = arg1.method231();
			int var12 = (var11 >> 4 & 0x7) + field1270;
			int var13 = (var11 & 0x7) + field1271;
			int var14 = arg1.method231();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1059[var15];
			int var18 = arg1.method233();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1352[field1003][var12][var13];
				int var20 = field1352[field1003][var12 + 1][var13];
				int var21 = field1352[field1003][var12 + 1][var13 + 1];
				int var22 = field1352[field1003][var12][var13 + 1];
				if (var17 == 0) {
					class18 var23 = field1357.method84(var12, var13, field1003);
					if (var23 != null) {
						int var24 = var23.field255 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field253 = new class29(var19, var16 + 4, var20, var24, var21, var18, false, 2, var22);
							var23.field254 = new class29(var19, var16 + 1 & 0x3, var20, var24, var21, var18, false, 2, var22);
						} else {
							var23.field253 = new class29(var19, var16, var20, var24, var21, var18, false, var15, var22);
						}
					}
				}

				if (var17 == 1) {
					class9 var25 = field1357.method85(var12, var13, field1003);
					if (var25 != null) {
						var25.field146 = new class29(var19, 0, var20, var25.field147 >> 14 & 0x7FFF, var21, var18, false, 4, var22);
					}
				}

				if (var17 == 2) {
					class17 var26 = field1357.method86(var12, field1003, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field238 = new class29(var19, var16, var20, var26.field246 >> 14 & 0x7FFF, var21, var18, false, var15, var22);
					}
				}

				if (var17 == 3) {
					class11 var27 = field1357.method87(var12, field1003, var13);
					if (var27 != null) {
						var27.field177 = new class29(var19, var16, var20, var27.field178 >> 14 & 0x7FFF, var21, var18, false, 22, var22);
					}
				}
			}
		} else if (arg0 == 167) {
			int var28 = arg1.method231();
			int var29 = (var28 >> 4 & 0x7) + field1270;
			int var30 = (var28 & 0x7) + field1271;
			int var31 = arg1.method233();
			int var32 = arg1.method233();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class30 var33 = new class30();
				var33.field444 = var31;
				var33.field445 = var32;

				if (field1168[field1003][var29][var30] == null) {
					field1168[field1003][var29][var30] = new class42();
				}

				field1168[field1003][var29][var30].method247(var33);
				method424(var29, var30);
			}
		} else if (arg0 == 247) {
			int var34 = arg1.method231();
			int var35 = (var34 >> 4 & 0x7) + field1270;
			int var36 = (var34 & 0x7) + field1271;
			int var37 = arg1.method233();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1168[field1003][var35][var36];
				if (var38 != null) {
					for (class30 var39 = (class30) var38.method250(); var39 != null; var39 = (class30) var38.method252()) {
						if ((var37 & 0x7FFF) == var39.field444) {
							var39.method118();
							break;
						}
					}

					if (var38.method250() == null) {
						field1168[field1003][var35][var36] = null;
					}

					method424(var35, var36);
				}
			}
		} else if (arg0 == 67) {
			int var40 = arg1.method231();
			int var41 = (var40 >> 4 & 0x7) + field1270;
			int var42 = (var40 & 0x7) + field1271;
			int var43 = var41 + arg1.method232();
			int var44 = var42 + arg1.method232();
			int var45 = arg1.method234();
			int var46 = arg1.method233();
			int var47 = arg1.method231();
			int var48 = arg1.method231();
			int var49 = arg1.method233();
			int var50 = arg1.method233();
			int var51 = arg1.method231();
			int var52 = arg1.method231();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class31 var53 = new class31(var45, var52, field1131 + var49, var51, var42, var41, field1131 + var50, field1003, var46, method499(var42, var41, field1003) - var47, var48);
				var53.method129(var43, field1131 + var49, method499(var44, var43, field1003) - var48, var44);
				field1096.method247(var53);
			}
		} else if (arg0 == 215) {
			int var54 = arg1.method231();
			int var55 = (var54 >> 4 & 0x7) + field1270;
			int var56 = (var54 & 0x7) + field1271;
			int var57 = arg1.method233();
			int var58 = arg1.method231();
			int var59 = arg1.method233();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class33 var60 = new class33(var57, var59, method499(var56, var55, field1003) - var58, var56, field1131, var55, field1003);
				field1350.method247(var60);
			}
		} else if (arg0 == 131) {
			int var61 = arg1.method231();
			int var62 = (var61 >> 4 & 0x7) + field1270;
			int var63 = (var61 & 0x7) + field1271;
			int var64 = arg1.method233();
			int var65 = arg1.method233();
			int var66 = arg1.method233();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1349 != var66) {
				class30 var67 = new class30();
				var67.field444 = var64;
				var67.field445 = var65;

				if (field1168[field1003][var62][var63] == null) {
					field1168[field1003][var62][var63] = new class42();
				}

				field1168[field1003][var62][var63].method247(var67);
				method424(var62, var63);
			}
		} else if (arg0 == 248) {
			int var68 = arg1.method231();
			int var69 = (var68 >> 4 & 0x7) + field1270;
			int var70 = (var68 & 0x7) + field1271;
			int var71 = arg1.method231();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1059[var72];
			int var75 = arg1.method233();
			int var76 = arg1.method233();
			int var77 = arg1.method233();
			int var78 = arg1.method233();
			byte var79 = arg1.method232();
			byte var80 = arg1.method232();
			byte var81 = arg1.method232();
			byte var82 = arg1.method232();
			class28 var83;
			if (field1349 == var78) {
				var83 = field1156;
			} else {
				var83 = field1324[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method320(var75);
				int var85 = field1352[field1003][var69][var70];
				int var86 = field1352[field1003][var69 + 1][var70];
				int var87 = field1352[field1003][var69 + 1][var70 + 1];
				int var88 = field1352[field1003][var69][var70 + 1];
				class32 var89 = var84.method326(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method480(var70, field1003, var77 + 1, 0, var76 + 1, 0, -1, var74, var69);
					var83.field421 = field1131 + var76;
					var83.field422 = field1131 + var77;
					var83.field426 = var89;
					int var90 = var84.field807;
					int var91 = var84.field808;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field808;
						var91 = var84.field807;
					}

					var83.field423 = var69 * 128 + var90 * 64;
					var83.field425 = var70 * 128 + var91 * 64;
					var83.field424 = method499(var83.field425, var83.field423, field1003);

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
		} else if (arg0 == 246) {
			int var94 = arg1.method231();
			int var95 = (var94 >> 4 & 0x7) + field1270;
			int var96 = (var94 & 0x7) + field1271;
			int var97 = arg1.method233();
			int var98 = arg1.method233();
			int var99 = arg1.method233();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1168[field1003][var95][var96];
				if (var100 != null) {
					for (class30 var101 = (class30) var100.method250(); var101 != null; var101 = (class30) var100.method252()) {
						if ((var97 & 0x7FFF) == var101.field444 && var101.field445 == var98) {
							var101.field445 = var99;
							break;
						}
					}

					method424(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method428() {
		short var1 = 256;

		if (field1274 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1274 > 768) {
					field1379[var2] = method513(1024 - field1274, field1380[var2], field1381[var2]);
				} else if (field1274 > 256) {
					field1379[var2] = field1381[var2];
				} else {
					field1379[var2] = method513(256 - field1274, field1381[var2], field1380[var2]);
				}
			}
		} else if (field1275 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1275 > 768) {
					field1379[var3] = method513(1024 - field1275, field1380[var3], field1382[var3]);
				} else if (field1275 > 256) {
					field1379[var3] = field1382[var3];
				} else {
					field1379[var3] = method513(256 - field1275, field1382[var3], field1380[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1379[var4] = field1380[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1197.field643[var5] = field1296.field585[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1075[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1150[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1379[var12];
					int var15 = field1197.field643[var7];
					field1197.field643[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1197.method261(0, field9, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1198.field643[var16] = field1297.field585[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1075[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1150[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1379[var23];
					int var26 = field1198.field643[var18];
					field1198.field643[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1198.method261(661, field9, 0);
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

	@ObfuscatedName("client.c(II)V")
	public final void method429(int arg0) {
		if (!field999) {
			if (class35.field581[17] >= arg0) {
				class37 var2 = class35.field575[17];
				int var3 = var2.field595 * var2.field594 - 1;
				int var4 = field1176 * var2.field594 * 2;
				byte[] var5 = var2.field592;
				byte[] var6 = field1251;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field592 = var6;
				field1251 = var5;
				class35.method176(17);
			}

			if (class35.field581[24] >= arg0) {
				class37 var8 = class35.field575[24];
				int var9 = var8.field595 * var8.field594 - 1;
				int var10 = field1176 * var8.field594 * 2;
				byte[] var11 = var8.field592;
				byte[] var12 = field1251;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field592 = var12;
				field1251 = var11;
				class35.method176(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method430(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1237 = "";
				field1238 = "Connecting to server...";
				method466();
			}

			field1108 = new class5(method436(field997 + 43594), this);
			field1108.method40(field1260.field610, 0, 8);
			field1260.field611 = 0;
			field992 = field1260.method237();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field992 >> 32), (int) field992 };
			field1321.field611 = 0;
			field1321.method221(10);
			field1321.method225(var4[0]);
			field1321.method225(var4[1]);
			field1321.method225(var4[2]);
			field1321.method225(var4[3]);
			field1321.method225(signlink.uid);
			field1321.method228(arg0);
			field1321.method228(arg1);
			field1321.method246(field1104, field1117);
			field1240.field611 = 0;

			if (arg2) {
				field1240.method221(18);
			} else {
				field1240.method221(16);
			}

			field1240.method221(field1321.field611 + 36 + 1 + 1);
			field1240.method221(234);
			field1240.method221(field999 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1240.method225(field1353[var5]);
			}

			field1240.method229(field1321.field610, field1321.field611, 0);
			field1321.field615 = new class50(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1348 = new class50(var4);
			field1108.method41(field1240.field611, field1240.field610, 0);
			int var7 = field1108.method38();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method430(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field1283 = true;
				} else {
					field1283 = false;
				}

				class6.method44();
				field1295 = true;
				field1321.field611 = 0;
				field1260.field611 = 0;
				field1374 = -1;
				field1278 = -1;
				field1279 = -1;
				field1280 = -1;
				field1373 = 0;
				field1375 = 0;
				field1130 = 0;
				field1377 = 0;
				field1254 = 0;
				field1332 = 0;
				field1269 = false;
				field14 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field995[var8] = null;
				}

				field1048 = 0;
				field1025 = 0;
				field1045 = 0;
				field1024 = 0;
				field1041 = (int) (Math.random() * 100.0D) - 50;
				field1137 = (int) (Math.random() * 110.0D) - 55;
				field1031 = (int) (Math.random() * 80.0D) - 40;
				field1046 = (int) (Math.random() * 120.0D) - 60;
				field1184 = (int) (Math.random() * 30.0D) - 20;
				field1369 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1021 = -1;
				field1209 = 0;
				field1210 = 0;
				field1325 = 0;
				field1078 = 0;

				for (int var9 = 0; var9 < field1322; var9++) {
					field1324[var9] = null;
					field1329[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1077[var10] = null;
				}

				field1156 = field1324[field1323] = new class28();
				field1096.method254();
				field1350.method254();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1168[var11][var12][var13] = null;
						}
					}
				}

				field1015 = new class42();
				field1097 = 0;
				field1358 = -1;
				field1331 = -1;
				field1385 = -1;
				field1228 = -1;
				field1035 = false;
				field1366 = 3;
				field1314 = false;
				field1269 = false;
				field1186 = false;
				field1253 = null;
				field1316 = 0;
				field1250 = -1;
				field1378 = true;
				method455();

				for (int var14 = 0; var14 < 5; var14++) {
					field1315[var14] = 0;
				}

				field1364 = 0;
				field1030 = 0;
				field1239 = 0;
				field1291 = 0;
				field1004 = 0;
				field1287 = 0;
				field1019 = 0;
				field990 = 0;
				field1307 = 0;
				method538();
				return;
			}

			if (var7 == 3) {
				field1237 = "";
				field1238 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field1237 = "Your account has been disabled.";
				field1238 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field1237 = "Your account is already logged in.";
				field1238 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field1237 = "RuneScape has been updated!";
				field1238 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field1237 = "This world is full.";
				field1238 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field1237 = "Unable to connect.";
				field1238 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field1237 = "Login limit exceeded.";
				field1238 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field1237 = "Unable to connect.";
				field1238 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field1238 = "Login server rejected session.";
				field1238 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field1237 = "You need a members account to login to this world.";
				field1238 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field1237 = "Could not complete login.";
				field1238 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field1237 = "The server is being updated.";
				field1238 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field1295 = true;
				field1321.field611 = 0;
				field1260.field611 = 0;
				field1374 = -1;
				field1278 = -1;
				field1279 = -1;
				field1280 = -1;
				field1373 = 0;
				field1375 = 0;
				field1130 = 0;
				field1332 = 0;
				field1269 = false;
				return;
			}

			if (var7 == 16) {
				field1237 = "Login attempts exceeded.";
				field1238 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field1237 = "You are standing in a members-only area.";
				field1238 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field1237 = "";
			field1238 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ILob;)V")
	public final void method431(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field628 == 0) {
			var2 = field1357.method88(arg0.field627, arg0.field629, arg0.field630);
		}

		if (arg0.field628 == 1) {
			var2 = field1357.method89(arg0.field627, arg0.field630, arg0.field629);
		}

		if (arg0.field628 == 2) {
			var2 = field1357.method90(arg0.field627, arg0.field629, arg0.field630);
		}

		if (arg0.field628 == 3) {
			var2 = field1357.method91(arg0.field627, arg0.field629, arg0.field630);
		}

		if (var2 != 0) {
			int var6 = field1357.method92(arg0.field627, arg0.field629, arg0.field630, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field631 = var3;
		arg0.field633 = var4;
		arg0.field632 = var5;
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method432(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field51[arg1];
		for (int var5 = 0; var5 < var4.field72.length && var4.field72[var5] != -1; var5++) {
			class4 var6 = class4.field51[var4.field72[var5]];
			if (var6.field58 == 1) {
				var3 |= method432(arg0, var6.field56);
			}

			if (var6.field58 == 6 && (var6.field101 != -1 || var6.field102 != -1)) {
				boolean var7 = method498(var6);
				int var8;
				if (var7) {
					var8 = var6.field102;
				} else {
					var8 = var6.field101;
				}

				if (var8 != -1) {
					class65 var9 = class65.field943[var8];
					var6.field55 += arg0;
					while (var6.field55 > var9.method369(var6.field54)) {
						var6.field55 -= var9.method369(var6.field54) + 1;
						var6.field54++;
						if (var6.field54 >= var9.field944) {
							var6.field54 -= var9.field948;
							if (var6.field54 < 0 || var6.field54 >= var9.field944) {
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

	@ObfuscatedName("client.a(JI)V")
	public final void method433(long arg0) {
		if (arg0 != 0L) {
			if (field1293 >= 100) {
				method458("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = class52.method300(class52.method297(arg0));
				for (int var4 = 0; var4 < field1293; var4++) {
					if (field1022[var4] == arg0) {
						method458(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1097; var5++) {
					if (field1183[var5] == arg0) {
						method458("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field1022[field1293++] = arg0;
				field1355 = true;
				field1321.method220(84);
				field1321.method227(arg0);
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method434() {
		if (field1098 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field18 == 1 && field19 >= var1 - 75 && field19 <= var1 + 75 && field20 >= var2 - 20 && field20 <= var2 + 20) {
				field1098 = 3;
				field1109 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field18 == 1 && field19 >= var3 - 75 && field19 <= var3 + 75 && field20 >= var2 - 20 && field20 <= var2 + 20) {
				field1237 = "";
				field1238 = "Enter your username & password.";
				field1098 = 2;
				field1109 = 0;
			}
		} else if (field1098 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field18 == 1 && field20 >= var4 - 15 && field20 < var4) {
				field1109 = 0;
			}

			var4 += 15;
			if (field18 == 1 && field20 >= var4 - 15 && field20 < var4) {
				field1109 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field18 == 1 && field19 >= var5 - 75 && field19 <= var5 + 75 && field20 >= var6 - 20 && field20 <= var6 + 20) {
				method430(field1284, field1285, false);
			}

			int var7 = field7 / 2 + 80;
			if (field18 == 1 && field19 >= var7 - 75 && field19 <= var7 + 75 && field20 >= var6 - 20 && field20 <= var6 + 20) {
				field1098 = 0;
				field1284 = "";
				field1285 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1330.length(); var10++) {
					if (var8 == field1330.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1109 == 0) {
					if (var8 == 8 && field1284.length() > 0) {
						field1284 = field1284.substring(0, field1284.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1109 = 1;
					}

					if (var9) {
						field1284 = field1284 + (char) var8;
					}

					if (field1284.length() > 12) {
						field1284 = field1284.substring(0, 12);
					}
				} else if (field1109 == 1) {
					if (var8 == 8 && field1285.length() > 0) {
						field1285 = field1285.substring(0, field1285.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1109 = 0;
					}

					if (var9) {
						field1285 = field1285 + (char) var8;
					}

					if (field1285.length() > 20) {
						field1285 = field1285.substring(0, 20);
					}
				}
			}
		} else if (field1098 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field18 == 1 && field19 >= var11 - 75 && field19 <= var11 + 75 && field20 >= var12 - 20 && field20 <= var12 + 20) {
				field1098 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;)V")
	public final void method435(class37 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1005.length; var3++) {
			field1005[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1005[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1006[var9] = (field1005[var9 - 1] + field1005[var9 + 1] + field1005[var9 - 128] + field1005[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1005;
			field1005 = field1006;
			field1006 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field595; var12++) {
				for (int var13 = 0; var13 < arg0.field594; var13++) {
					if (arg0.field592[var11++] != 0) {
						int var14 = var13 + arg0.field596 + 16;
						int var15 = var12 + arg0.field597 + 16;
						int var16 = (var15 << 7) + var14;
						field1005[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)Ljava/net/Socket;")
	public final Socket method436(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method437() {
		for (int var1 = 0; var1 < field1078; var1++) {
			class27 var2 = field1077[field1079[var1]];
			int var3 = (field1079[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method124()) {
				int var4 = var2.field359 >> 7;
				int var5 = var2.field360 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field363 == 1 && (var2.field359 & 0x7F) == 0x40 && (var2.field360 & 0x7F) == 0x40) {
						if (field1016[var4][var5] == field1179) {
							continue;
						}

						field1016[var4][var5] = field1179;
					}

					field1357.method73(var2.field359, var2.field361, var3, field1003, var2.field360, var2.field362, var2, (var2.field363 - 1) * 64 + 60, method499(var2.field360, var2.field359, field1003));
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method438() {
		for (int var1 = -1; var1 < field1325; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1323;
			} else {
				var2 = field1326[var1];
			}

			class28 var3 = field1324[var2];
			if (var3 != null && var3.field372 > 0) {
				var3.field372--;
				if (var3.field372 == 0) {
					var3.field371 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1078; var4++) {
			int var5 = field1079[var4];
			class27 var6 = field1077[var5];
			if (var6 != null && var6.field372 > 0) {
				var6.field372--;
				if (var6.field372 == 0) {
					var6.field371 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method439(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IIBIII)V")
	public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1357.method88(arg2, arg1, arg4);
		if (var6 != 0) {
			int var7 = field1357.method92(arg2, arg1, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field1211.field585;
			int var12 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method320(var13);
			if (var14.field822 == -1) {
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
				class37 var15 = field1017[var14.field822];
				if (var15 != null) {
					int var16 = (var14.field807 * 4 - var15.field594) / 2;
					int var17 = (var14.field808 * 4 - var15.field595) / 2;
					var15.method204(arg1 * 4 + var16 + 48, (104 - arg4 - var14.field808) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1357.method90(arg2, arg1, arg4);
		if (var18 != 0) {
			int var19 = field1357.method92(arg2, arg1, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method320(var22);
			if (var23.field822 != -1) {
				class37 var24 = field1017[var23.field822];
				if (var24 != null) {
					int var25 = (var23.field807 * 4 - var24.field594) / 2;
					int var26 = (var23.field808 * 4 - var24.field595) / 2;
					var24.method204(arg1 * 4 + var25 + 48, (104 - arg4 - var23.field808) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1211.field585;
				int var29 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field1357.method91(arg2, arg1, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method320(var31);
			if (var32.field822 != -1) {
				class37 var33 = field1017[var32.field822];
				if (var33 != null) {
					int var34 = (var32.field807 * 4 - var33.field594) / 2;
					int var35 = (var32.field808 * 4 - var33.field595) / 2;
					var33.method204(arg1 * 4 + var34 + 48, (104 - arg4 - var32.field808) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method441() {
		if (field1377 > 0) {
			method418();
		} else {
			field1265.method260();
			field1158.method206("Connection lost", 257, 144, 0);
			field1158.method206("Connection lost", 256, 143, 0xFFFFFF);
			field1158.method206("Please wait - attempting to reestablish", 257, 159, 0);
			field1158.method206("Please wait - attempting to reestablish", 256, 158, 0xFFFFFF);
			field1265.method261(8, field9, 11);
			field1209 = 0;
			class5 var1 = field1108;
			field1295 = false;
			method430(field1284, field1285, true);

			if (!field1295) {
				method418();
			}

			try {
				var1.method37();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method442(int arg0, int arg1) {
		if (field1133 != 0) {
			int var3 = 0;
			if (field1130 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field995[var4] != null) {
					int var5 = field993[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field1276 == 0 || field1276 == 1 && method454(field994[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field16 > 8 && field16 < 520 && arg0 - 11 > var6 - 10 && arg0 - 11 <= var6 + 3) {
							if (field1283) {
								field1277[field1332] = "Report abuse @whi@" + field994[var4];
								field1216[field1332] = 2034;
								field1332++;
							}

							field1277[field1332] = "Add ignore @whi@" + field994[var4];
							field1216[field1332] = 2436;
							field1332++;
							field1277[field1332] = "Add friend @whi@" + field994[var4];
							field1216[field1332] = 2406;
							field1332++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field1276 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method443(int arg0) {
		class4 var2 = class4.field51[arg0];
		for (int var3 = 0; var3 < var2.field72.length && var2.field72[var3] != -1; var3++) {
			class4 var4 = class4.field51[var2.field72[var3]];
			if (var4.field58 == 1) {
				method443(var4.field56);
			}

			var4.field54 = 0;
			var4.field55 = 0;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method444() {
		if (field999 && field1045 == 2 && class3.field27 != field1003) {
			field1265.method260();
			field1158.method206("Loading - please wait.", 257, 151, 0);
			field1158.method206("Loading - please wait.", 256, 150, 0xFFFFFF);
			field1265.method261(8, field9, 11);
			field1045 = 1;
		}

		if (field1045 == 1) {
			for (int var1 = 0; var1 < field1351.length; var1++) {
				if (field1351[var1] == null && field1334[var1] != -1) {
					return;
				}

				if (field1234[var1] == null && field1335[var1] != -1) {
					return;
				}
			}

			boolean var2 = true;
			for (int var3 = 0; var3 < field1351.length; var3++) {
				byte[] var4 = field1234[var3];
				if (var4 != null) {
					int var5 = (field1333[var3] >> 8) * 64 - field1317;
					int var6 = (field1333[var3] & 0xFF) * 64 - field1318;
					var2 &= class3.method16(var4, var5, var6);
				}
			}

			if (!var2) {
				return;
			}

			field1045 = 2;
			class3.field27 = field1003;
			method470();
		}

		if (field1045 == 2 && field1021 != field1003) {
			field1021 = field1003;
			method534(field1003);
		}
	}

	@ObfuscatedName("client.a(ILd;IBI)V")
	public final void method445(int arg0, class4 arg1, int arg2, int arg3) {
		if (arg1.field58 == 0 && arg1.field72 != null && (!arg1.field71 || field1011 == arg1.field56 || field1044 == arg1.field56 || field1043 == arg1.field56)) {
			int var5 = class34.field557;
			int var6 = class34.field555;
			int var7 = class34.field558;
			int var8 = class34.field556;
			class34.method163(arg2, arg3, arg1.field62 + arg3, arg1.field61 + arg2);
			int var9 = arg1.field72.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field73[var10] + arg2;
				int var12 = arg1.field74[var10] + arg3 - arg0;
				class4 var13 = class4.field51[arg1.field72[var10]];
				var11 += var13.field63;
				var12 += var13.field64;

				if (var13.field60 > 0) {
					method531(var13);
				}

				if (var13.field58 == 0) {
					if (var13.field70 > var13.field69 - var13.field62) {
						var13.field70 = var13.field69 - var13.field62;
					}

					if (var13.field70 < 0) {
						var13.field70 = 0;
					}

					method445(var13.field70, var13, var11, var12);

					if (var13.field69 > var13.field62) {
						method423(var13.field70, var13.field69, var13.field61 + var11, var12, var13.field62);
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
									if (var17 > class34.field557 - 32 && var17 < class34.field558 && var18 > class34.field555 - 32 && var18 < class34.field556 || field1141 != 0 && field1140 == var14) {
										class36 var22 = class59.method341(var13.field53[var14], var21);
										if (var22 != null) {
											if (field1141 != 0 && field1140 == var14 && field1139 == var13.field56) {
												var19 = field16 - field1142;
												var20 = field17 - field1143;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1177 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var22.method194(128, var17 + var19, var18 + var20);
											} else if (field1342 != 0 && field1341 == var14 && field1340 == var13.field56) {
												var22.method194(128, var17, var18);
											} else {
												var22.method190(var17, var18);
											}

											if (var22.field590 == 33 || var13.field53[var14] != 1) {
												int var23 = var13.field53[var14];
												field1157.method209(var17 + var19 + 1, method520(var23), 0, var18 + var20 + 10);
												field1157.method209(var17 + var19, method520(var23), 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field82 != null && var14 < 20) {
									class36 var24 = var13.field82[var14];
									if (var24 != null) {
										var24.method190(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field58 == 3) {
						if (var13.field86) {
							class34.method165(var11, var13.field61, var13.field92, var13.field62, var12);
						} else {
							class34.method166(var12, var13.field62, var11, var13.field61, var13.field92);
						}
					} else if (var13.field58 == 4) {
						class38 var25 = var13.field89;
						int var26 = var13.field92;
						String var27 = var13.field90;

						if ((field1043 == var13.field56 || field1044 == var13.field56 || field1011 == var13.field56) && var13.field94 != 0) {
							var26 = var13.field94;
						}

						if (method498(var13)) {
							var26 = var13.field93;

							if (var13.field91.length() > 0) {
								var27 = var13.field91;
							}
						}

						if (var13.field59 == 6 && field1035) {
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

									var27 = var27.substring(0, var29) + method473(method506(0, var13)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method473(method506(1, var13)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method473(method506(2, var13)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method473(method506(3, var13)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method473(method506(4, var13)) + var27.substring(var33 + 2);
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
								var25.method207(var13.field88, var28, var35, var26, var13.field61 / 2 + var11);
							} else {
								var25.method211(var13.field88, var35, var26, var28, var11);
							}

							var28 += var25.field607;
						}
					} else if (var13.field58 == 5) {
						class36 var36;
						if (method498(var13)) {
							var36 = var13.field96;
						} else {
							var36 = var13.field95;
						}

						if (var36 != null) {
							var36.method190(var11, var12);
						}
					} else if (var13.field58 == 6) {
						int var37 = class35.field567;
						int var38 = class35.field568;
						class35.field567 = var13.field61 / 2 + var11;
						class35.field568 = var13.field62 / 2 + var12;
						int var39 = class35.field571[var13.field104] * var13.field103 >> 16;
						int var40 = class35.field572[var13.field104] * var13.field103 >> 16;
						boolean var41 = method498(var13);
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
							class65 var44 = class65.field943[var42];
							var43 = var13.method33(var44.field945[var13.field54], var44.field946[var13.field54], var41);
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
									class59 var49 = class59.method335(var13.field52[var46] - 1);
									String var50 = var49.field871;
									if (var49.field882 || var13.field53[var46] != 1) {
										var50 = var50 + " x" + method489(var13.field53[var46]);
									}

									int var51 = (var13.field80 + 115) * var48 + var11;
									int var52 = (var13.field81 + 12) * var47 + var12;
									if (var13.field87) {
										var45.method207(var13.field88, var52, var50, var13.field92, var13.field61 / 2 + var51);
									} else {
										var45.method211(var13.field88, var50, var13.field92, var52, var51);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class34.method163(var5, var6, var8, var7);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method446() {
		if (field1130 > 1) {
			field1130--;
		}

		if (field1377 > 0) {
			field1377--;
		}

		for (int var1 = 0; var1 < 5 && method512(); var1++) {
		}

		if (field1295) {
			method444();
			method449();
			method450();
			class39 var2 = class6.method45();
			if (var2 != null) {
				field1321.method220(54);
				field1321.method222(var2.field611);
				field1321.method229(var2.field610, var2.field611, 0);
				var2.method219();
			}

			field1375++;
			if (field1375 > 750) {
				method441();
			}

			method459();
			method521();
			method438();

			if ((field21[1] == 1 || field21[2] == 1 || field21[3] == 1 || field21[4] == 1) && field1163++ > 5) {
				field1163 = 0;
				field1321.method220(152);
				field1321.method222(field1368);
				field1321.method222(field1369);
				field1321.method221(field1046);
				field1321.method221(field1184);
			}

			field1176++;

			if (field1258 != 0) {
				field1257 += 20;
				if (field1257 >= 400) {
					field1258 = 0;
				}
			}

			if (field1342 != 0) {
				field1339++;
				if (field1339 >= 15) {
					if (field1342 == 2) {
						field1355 = true;
					}

					if (field1342 == 3) {
						field1252 = true;
					}

					field1342 = 0;
				}
			}

			if (field1141 != 0) {
				field1177++;

				if (field16 > field1142 + 5 || field16 < field1142 - 5 || field17 > field1143 + 5 || field17 < field1143 - 5) {
					field991 = true;
				}

				if (field15 == 0) {
					if (field1141 == 2) {
						field1355 = true;
					}

					if (field1141 == 3) {
						field1252 = true;
					}

					field1141 = 0;

					if (field991 && field1177 >= 5) {
						field1273 = -1;
						method476();

						if (field1273 == field1139 && field1272 != field1140) {
							class4 var3 = class4.field51[field1139];
							int var4 = var3.field52[field1272];
							var3.field52[field1272] = var3.field52[field1140];
							var3.field52[field1140] = var4;
							int var5 = var3.field53[field1272];
							var3.field53[field1272] = var3.field53[field1140];
							var3.field53[field1140] = var5;
							field1321.method220(128);
							field1321.method222(field1139);
							field1321.method222(field1140);
							field1321.method222(field1272);
						}
					} else if ((field1286 == 1 || method537(field1332 - 1)) && field1332 > 2) {
						method475();
					} else if (field1332 > 0) {
						method464(field1332 - 1);
					}

					field1339 = 10;
					field18 = 0;
				}
			}

			field1095++;
			if (field1095 > 127) {
				field1095 = 0;
				field1321.method220(225);
				field1321.method224(0x4C2B2C);
			}

			if (class19.field291 != -1) {
				int var6 = class19.field291;
				int var7 = class19.field292;
				boolean var8 = method416(true, var7, field1156.field407[0], field1156.field408[0], 0, 0, 0, 0, var6, 0, 0);
				class19.field291 = -1;

				if (var8) {
					field1255 = field19;
					field1256 = field20;
					field1258 = 1;
					field1257 = 0;
				}
			}

			if (field18 == 1 && field1253 != null) {
				field1253 = null;
				field1252 = true;
				field18 = 0;
			}

			method507();
			method478();
			method477();
			method495();

			if (field15 == 1 || field18 == 1) {
				field1000++;
			}

			if (field1045 == 2) {
				method519();
			}

			if (field1045 == 2 && field1262) {
				method421();
			}

			for (int var9 = 0; var9 < 5; var9++) {
				field1167[var9]++;
			}

			method530();
			field14++;
			if (field14 > 4500) {
				field1377 = 250;
				field14 -= 500;
				field1321.method220(113);
			}

			field1181++;
			if (field1181 > 500) {
				field1181 = 0;
				int var10 = (int) (Math.random() * 8.0D);
				if ((var10 & 0x1) == 1) {
					field1041 += field1042;
				}

				if ((var10 & 0x2) == 2) {
					field1137 += field1138;
				}

				if ((var10 & 0x4) == 4) {
					field1031 += field1032;
				}
			}

			if (field1041 < -50) {
				field1042 = 2;
			}

			if (field1041 > 50) {
				field1042 = -2;
			}

			if (field1137 < -55) {
				field1138 = 2;
			}

			if (field1137 > 55) {
				field1138 = -2;
			}

			if (field1031 < -40) {
				field1032 = 1;
			}

			if (field1031 > 40) {
				field1032 = -1;
			}

			field1203++;
			if (field1203 > 500) {
				field1203 = 0;
				int var11 = (int) (Math.random() * 8.0D);
				if ((var11 & 0x1) == 1) {
					field1046 += field1047;
				}

				if ((var11 & 0x2) == 2) {
					field1184 += field1185;
				}
			}

			if (field1046 < -60) {
				field1047 = 2;
			}

			if (field1046 > 60) {
				field1047 = -2;
			}

			if (field1184 < -20) {
				field1185 = 1;
			}

			if (field1184 > 10) {
				field1185 = -1;
			}

			field1034++;
			if (field1034 > 110) {
				field1034 = 0;
				field1321.method220(227);
				field1321.method225(0);
			}

			field1376++;
			if (field1376 > 50) {
				field1321.method220(251);
			}

			try {
				if (field1108 != null && field1321.field611 > 0) {
					field1108.method41(field1321.field611, field1321.field610, 0);
					field1321.field611 = 0;
					field1376 = 0;
				}
			} catch (IOException var13) {
				method441();
			} catch (Exception var14) {
				method418();
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public static final void method447() {
		class19.field257 = true;
		class35.field562 = true;
		field999 = true;
		class3.field26 = true;
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method448(class39 arg0, int arg1) {
		int var3 = arg0.method242(8);
		if (var3 < field1325) {
			for (int var4 = var3; var4 < field1325; var4++) {
				field1189[field1188++] = field1326[var4];
			}
		}

		if (var3 > field1325) {
			signlink.reporterror(field1284 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1325 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1326[var5];
			class28 var7 = field1324[var6];
			int var8 = arg0.method242(1);
			if (var8 == 0) {
				field1326[field1325++] = var6;
				var7.field403 = field1131;
			} else {
				int var9 = arg0.method242(2);
				if (var9 == 0) {
					field1326[field1325++] = var6;
					var7.field403 = field1131;
					field1328[field1327++] = var6;
				} else if (var9 == 1) {
					field1326[field1325++] = var6;
					var7.field403 = field1131;
					int var10 = arg0.method242(3);
					var7.method123(false, var10);
					int var11 = arg0.method242(1);
					if (var11 == 1) {
						field1328[field1327++] = var6;
					}
				} else if (var9 == 2) {
					field1326[field1325++] = var6;
					var7.field403 = field1131;
					int var12 = arg0.method242(3);
					var7.method123(true, var12);
					int var13 = arg0.method242(3);
					var7.method123(true, var13);
					int var14 = arg0.method242(1);
					if (var14 == 1) {
						field1328[field1327++] = var6;
					}
				} else if (var9 == 3) {
					field1189[field1188++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method449() {
		if (field1045 == 2) {
			for (class41 var1 = (class41) field1015.method250(); var1 != null; var1 = (class41) field1015.method252()) {
				if (var1.field638 > 0) {
					var1.field638--;
				}

				if (var1.field638 != 0) {
					if (var1.field637 > 0) {
						var1.field637--;
					}

					if (var1.field637 == 0 && (var1.field634 < 0 || class3.method30(var1.field634, var1.field636))) {
						method462(var1.field635, var1.field634, var1.field630, var1.field627, var1.field628, var1.field636, var1.field629);
						var1.field637 = -1;

						if (var1.field634 == var1.field631 && var1.field631 == -1) {
							var1.method118();
						} else if (var1.field634 == var1.field631 && var1.field635 == var1.field632 && var1.field636 == var1.field633) {
							var1.method118();
						}
					}
				} else if (var1.field631 < 0 || class3.method30(var1.field631, var1.field633)) {
					method462(var1.field632, var1.field631, var1.field630, var1.field627, var1.field628, var1.field633, var1.field629);
					var1.method118();
				}
			}

			field1173++;
			if (field1173 > 85) {
				field1173 = 0;
				field1321.method220(120);
				return;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method450() {
		for (int var1 = 0; var1 < field1024; var1++) {
			if (field1007[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1208[var1] != field1261 || field1306[var1] != field1187) {
						class39 var3 = class55.method309(field1306[var1], field1208[var1]);
						if (System.currentTimeMillis() + var3.field611 / 22 > field1193 / 22 + field1309) {
							field1193 = var3.field611;
							field1309 = System.currentTimeMillis();

							if (method502(var3.field611, var3.field610)) {
								field1261 = field1208[var1];
								field1187 = field1306[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method419()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1007[var1] != -5) {
					field1007[var1] = -5;
				} else {
					field1024--;
					for (int var5 = var1; var5 < field1024; var5++) {
						field1208[var5] = field1208[var5 + 1];
						field1306[var5] = field1306[var5 + 1];
						field1007[var5] = field1007[var5 + 1];
					}

					var1--;
				}
			} else {
				field1007[var1]--;
			}
		}

		if (field1365 > 0) {
			field1365 -= 20;
			if (field1365 < 0) {
				field1365 = 0;
			}

			if (field1365 == 0 && field1235 && !field999) {
				field1039 = field1036;
				field1040 = false;
				field1105.method279(2, field1039);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method451(int arg0) {
		int var2 = class67.field971[arg0].field979;
		if (var2 != 0) {
			int var3 = field1113[arg0];
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

				class59.field904.method115();
				field1204 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1235;

				if (var3 == 0) {
					method414(field1235, 0);
					field1235 = true;
				}

				if (var3 == 1) {
					method414(field1235, -400);
					field1235 = true;
				}

				if (var3 == 2) {
					method414(field1235, -800);
					field1235 = true;
				}

				if (var3 == 3) {
					method414(field1235, -1200);
					field1235 = true;
				}

				if (var3 == 4) {
					field1235 = false;
				}

				if (field1235 != var4 && !field999) {
					if (field1235) {
						field1039 = field1036;
						field1040 = false;
						field1105.method279(2, field1039);
					} else {
						method543();
					}

					field1365 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1289 = true;
					method496(0);
				}

				if (var3 == 1) {
					field1289 = true;
					method496(-400);
				}

				if (var3 == 2) {
					field1289 = true;
					method496(-800);
				}

				if (var3 == 3) {
					field1289 = true;
					method496(-1200);
				}

				if (var3 == 4) {
					field1289 = false;
				}
			}

			if (var2 == 5) {
				field1286 = var3;
			}

			if (var2 == 6) {
				field1367 = var3;
			}

			if (var2 == 8) {
				field1133 = var3;
				field1252 = true;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method452() {
		if (field1254 == 2) {
			method469((field1242 - field1317 << 7) + field1245, field1244 * 2, (field1243 - field1318 << 7) + field1246);

			if (field1055 > -1 && field1131 % 20 < 10) {
				field1002[2].method190(field1055 - 12, field1056 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method453(class4 arg0) {
		int var2 = arg0.field60;
		if (var2 == 201) {
			field1252 = true;
			field1314 = false;
			field1186 = true;
			field1064 = "";
			field1014 = 1;
			field1174 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1252 = true;
			field1314 = false;
			field1186 = true;
			field1064 = "";
			field1014 = 2;
			field1174 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1377 = 250;
			return true;
		}

		if (var2 == 501) {
			field1252 = true;
			field1314 = false;
			field1186 = true;
			field1064 = "";
			field1014 = 4;
			field1174 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1252 = true;
			field1314 = false;
			field1186 = true;
			field1064 = "";
			field1014 = 5;
			field1174 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1361[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class63.field925 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class63.field925) {
							var5 = 0;
						}
					}

					if (!class63.field926[var5].field932 && class63.field926[var5].field927 == var3 + (field1378 ? 0 : 7)) {
						break;
					}
				}

				field1361[var3] = var5;
				field1363 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1315[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1033[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1033[var6].length) {
					var8 = 0;
				}
			}

			field1315[var6] = var8;
			field1363 = true;
		}

		if (var2 == 324 && !field1378) {
			field1378 = true;
			method455();
		}

		if (var2 == 325 && field1378) {
			field1378 = false;
			method455();
		}

		if (var2 == 326) {
			field1321.method220(188);
			field1321.method221(field1378 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1321.method221(field1361[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1321.method221(field1315[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1281 = !field1281;
		}

		if (var2 >= 601 && var2 <= 612) {
			method465();

			if (field1336.length() > 0) {
				field1321.method220(144);
				field1321.method227(class52.method296(field1336));
				field1321.method221(var2 - 601);
				field1321.method221(field1281 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.b(I)V")
	public final void method10() {
		field1204 = true;
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method454(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1097; var2++) {
			if (arg0.equalsIgnoreCase(field1001[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1156.field412)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method455() {
		field1363 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1361[var1] = -1;
			for (int var2 = 0; var2 < class63.field925; var2++) {
				if (!class63.field926[var2].field932 && class63.field926[var2].field927 == var1 + (field1378 ? 0 : 7)) {
					field1361[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method456(long arg0) {
		if (arg0 != 0L) {
			if (field1097 >= 100) {
				method458("Your friends list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = class52.method300(class52.method297(arg0));
				for (int var4 = 0; var4 < field1097; var4++) {
					if (field1183[var4] == arg0) {
						method458(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1293; var5++) {
					if (field1022[var5] == arg0) {
						method458("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field1156.field412)) {
					field1001[field1097] = var3;
					field1183[field1097] = arg0;
					field1112[field1097] = 0;
					field1097++;
					field1355 = true;
					field1321.method220(8);
					field1321.method227(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Lmb;II)V")
	public final void method457(class39 arg0, int arg1) {
		arg0.method241();
		int var3 = arg0.method242(1);
		if (var3 != 0) {
			int var4 = arg0.method242(2);
			if (var4 == 0) {
				field1328[field1327++] = field1323;
			} else if (var4 == 1) {
				int var5 = arg0.method242(3);
				field1156.method123(false, var5);
				int var6 = arg0.method242(1);
				if (var6 == 1) {
					field1328[field1327++] = field1323;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method242(3);
				field1156.method123(true, var7);
				int var8 = arg0.method242(3);
				field1156.method123(true, var8);
				int var9 = arg0.method242(1);
				if (var9 == 1) {
					field1328[field1327++] = field1323;
				}
			} else if (var4 == 3) {
				field1003 = arg0.method242(2);
				int var10 = arg0.method242(7);
				int var11 = arg0.method242(7);
				int var12 = arg0.method242(1);
				field1156.method122(var12 == 1, var11, var10);
				int var13 = arg0.method242(1);
				if (var13 == 1) {
					field1328[field1327++] = field1323;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;Z)V")
	public final void method458(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field1358 != -1) {
			field1253 = arg0;
			field18 = 0;
		}

		if (field1331 == -1) {
			field1252 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field993[var4] = field993[var4 - 1];
			field994[var4] = field994[var4 - 1];
			field995[var4] = field995[var4 - 1];
		}

		field993[0] = arg1;
		field994[0] = arg2;
		field995[0] = arg0;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method459() {
		for (int var1 = -1; var1 < field1325; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1323;
			} else {
				var2 = field1326[var1];
			}

			class28 var3 = field1324[var2];
			if (var3 != null) {
				method522(var3, 1);
			}
		}

		field1347++;
		if (field1347 > 1406) {
			field1347 = 0;
			field1321.method220(124);
			field1321.method221(0);
			int var4 = field1321.field611;
			field1321.method221(162);
			field1321.method221(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1321.method221(84);
			}

			field1321.method222(31824);
			field1321.method222(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1321.method221(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1321.method221(134);
			}

			field1321.method221(100);
			field1321.method221(94);
			field1321.method222(35521);
			field1321.method230(field1321.field611 - var4);
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method460() {
		while (true) {
			class40 var1 = field1105.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field622 == 0) {
				class32.method133(var1.field624, var1.field623);

				if ((field1105.method278(var1.field623) & 0x62) != 0) {
					field1355 = true;

					if (field1331 != -1) {
						field1252 = true;
					}
				}
			}

			if (var1.field622 == 1 && var1.field624 != null) {
				class8.method58(var1.field624);
			}

			if (var1.field622 == 2 && field1039 == var1.field623 && var1.field624 != null) {
				method508(var1.field624, field1040);
			}

			if (var1.field622 == 3 && field1045 == 1) {
				for (int var2 = 0; var2 < field1351.length; var2++) {
					if (field1334[var2] == var1.field623) {
						field1351[var2] = var1.field624;

						if (var1.field624 == null) {
							field1334[var2] = -1;
						}

						break;
					}

					if (field1335[var2] == var1.field623) {
						field1234[var2] = var1.field624;

						if (var1.field624 == null) {
							field1335[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field622 == 93 && field1105.method277(var1.field623)) {
				class3.method17(new class39(var1.field624), field1105);
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method461() {
		field1053 = false;
		while (field1212) {
			field1053 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1134 = null;
		field1135 = null;
		field1372 = null;
		field1379 = null;
		field1380 = null;
		field1381 = null;
		field1382 = null;
		field1005 = null;
		field1006 = null;
		field1150 = null;
		field1151 = null;
		field1296 = null;
		field1297 = null;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method7() {
		if (!field1166 && !field1282 && !field1178) {
			field1131++;

			if (field1295) {
				method446();
			} else {
				method434();
			}

			method460();
		}
	}

	@ObfuscatedName("client.a(IIZIIIII)V")
	public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
			if (field999 && field1003 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field1357.method88(arg3, arg6, arg2);
			}

			if (arg4 == 1) {
				var8 = field1357.method89(arg3, arg2, arg6);
			}

			if (arg4 == 2) {
				var8 = field1357.method90(arg3, arg6, arg2);
			}

			if (arg4 == 3) {
				var8 = field1357.method91(arg3, arg6, arg2);
			}

			if (var8 != 0) {
				int var12 = field1357.method92(arg3, arg6, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field1357.method79(arg2, arg3, arg6);
					class57 var16 = class57.method320(var13);
					if (var16.field809) {
						field1303[arg3].method351(var16.field810, var15, var14, arg6, arg2);
					}
				}

				if (arg4 == 1) {
					field1357.method80(arg3, arg6, arg2);
				}

				if (arg4 == 2) {
					field1357.method81(arg6, arg2, arg3);
					class57 var17 = class57.method320(var13);
					if (var17.field807 + arg6 > 103 || var17.field807 + arg2 > 103 || var17.field808 + arg6 > 103 || var17.field808 + arg2 > 103) {
						return;
					}

					if (var17.field809) {
						field1303[arg3].method352(var17.field810, arg6, arg2, var17.field807, var17.field808, var15);
					}
				}

				if (arg4 == 3) {
					field1357.method82(arg2, arg6, arg3);
					class57 var18 = class57.method320(var13);
					if (var18.field809 && var18.field811) {
						field1303[arg3].method354(arg2, arg6);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field1354[1][arg6][arg2] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				class3.method31(field1303[arg3], arg2, arg1, field1352, var19, arg0, field1357, arg3, arg5, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILjb;B)V")
	public final void method463(int arg0, int arg1, class36 arg2) {
		int var4 = field1369 + field1046 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = class32.field539[var4];
			int var7 = class32.field540[var4];
			var6 = var6 * 256 / (field1184 + 256);
			var7 = var7 * 256 / (field1184 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method197(field1191, var8 + 94 - arg2.field590 / 2, 83 - var9 - arg2.field591 / 2);
			} else {
				arg2.method190(var8 + 94 - arg2.field590 / 2, 83 - var9 - arg2.field591 / 2);
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method464(int arg0) {
		if (arg0 >= 0) {
			if (field1314) {
				field1314 = false;
				field1252 = true;
			}

			int var2 = field1214[arg0];
			int var3 = field1215[arg0];
			int var4 = field1216[arg0];
			int var5 = field1217[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
				boolean var6 = method416(false, var3, field1156.field407[0], field1156.field408[0], 0, 0, 2, 0, var2, 0, 0);
				if (!var6) {
					method416(false, var3, field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var2, 0, 1);
				}

				field1255 = field19;
				field1256 = field20;
				field1258 = 2;
				field1257 = 0;

				if (var4 == 993) {
					field1321.method220(46);
				}

				if (var4 == 224) {
					field1321.method220(186);
				}

				if (var4 == 877) {
					field1321.method220(139);
				}

				if (var4 == 99) {
					field1321.method220(86);
				}

				if (var4 == 746) {
					field1321.method220(195);
				}

				field1321.method222(field1317 + var2);
				field1321.method222(field1318 + var3);
				field1321.method222(var5);
			}

			if (var4 == 903 || var4 == 363) {
				String var8 = field1277[arg0];
				int var9 = var8.indexOf("@whi@");
				if (var9 != -1) {
					var8 = var8.substring(var9 + 5).trim();
					String var10 = class52.method300(class52.method297(class52.method296(var8)));
					boolean var11 = false;
					for (int var12 = 0; var12 < field1325; var12++) {
						class28 var13 = field1324[field1326[var12]];
						if (var13 != null && var13.field412 != null && var13.field412.equalsIgnoreCase(var10)) {
							method416(false, var13.field408[0], field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var13.field407[0], 0, 1);

							if (var4 == 903) {
								field1321.method220(192);
							}

							if (var4 == 363) {
								field1321.method220(223);
							}

							field1321.method222(field1326[var12]);
							var11 = true;
							break;
						}
					}

					if (!var11) {
						method458("Unable to find " + var10, 0, "");
					}
				}
			}

			if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
				class27 var14 = field1077[var5];
				if (var14 != null) {
					method416(false, var14.field408[0], field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var14.field407[0], 0, 1);
					field1255 = field19;
					field1256 = field20;
					field1258 = 2;
					field1257 = 0;

					if (var4 == 963) {
						field1321.method220(99);
					}

					if (var4 == 6) {
						if ((var5 & 0x3) == 0) {
							field1030++;
						}

						if (field1030 >= 124) {
							field1321.method220(55);
							field1321.method225(0);
						}

						field1321.method220(237);
					}

					if (var4 == 542) {
						field1321.method220(158);
					}

					if (var4 == 728) {
						field1321.method220(149);
					}

					if (var4 == 245) {
						if ((var5 & 0x3) == 0) {
							field1291++;
						}

						if (field1291 >= 85) {
							field1321.method220(174);
							field1321.method222(39596);
						}

						field1321.method220(242);
					}

					field1321.method222(var5);
				}
			}

			if (var4 == 651) {
				class28 var15 = field1324[var5];
				if (var15 != null) {
					method416(false, var15.field408[0], field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var15.field407[0], 0, 1);
					field1255 = field19;
					field1256 = field20;
					field1258 = 2;
					field1257 = 0;
					field1321.method220(116);
					field1321.method222(var5);
					field1321.method222(field1026);
				}
			}

			if (var4 == 930) {
				class4 var16 = class4.field51[var3];
				field1025 = 1;
				field1026 = var3;
				field1027 = var16.field108;
				field1048 = 0;
				String var17 = var16.field106;
				if (var17.indexOf(" ") != -1) {
					var17 = var17.substring(0, var17.indexOf(" "));
				}

				String var18 = var16.field106;
				if (var18.indexOf(" ") != -1) {
					var18 = var18.substring(var18.indexOf(" ") + 1);
				}

				field1028 = var17 + " " + var16.field107 + " " + var18;

				if (field1027 == 16) {
					field1355 = true;
					field1366 = 3;
					field1012 = true;
				}
			} else {
				if (var4 == 1102) {
					class59 var19 = class59.method335(var5);
					String var20;
					if (var19.field872 == null) {
						var20 = "It's a " + var19.field871 + ".";
					} else {
						var20 = new String(var19.field872);
					}

					method458(var20, 0, "");
				}

				if (var4 == 265) {
					class27 var21 = field1077[var5];
					if (var21 != null) {
						method416(false, var21.field408[0], field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var21.field407[0], 0, 1);
						field1255 = field19;
						field1256 = field20;
						field1258 = 2;
						field1257 = 0;
						field1321.method220(114);
						field1321.method222(var5);
						field1321.method222(field1026);
					}
				}

				if (var4 == 1607) {
					class27 var22 = field1077[var5];
					if (var22 != null) {
						String var23;
						if (var22.field411.field842 == null) {
							var23 = "It's a " + var22.field411.field841 + ".";
						} else {
							var23 = new String(var22.field411.field842);
						}

						method458(var23, 0, "");
					}
				}

				if (var4 == 217) {
					boolean var24 = method416(false, var3, field1156.field407[0], field1156.field408[0], 0, 0, 2, 0, var2, 0, 0);
					if (!var24) {
						method416(false, var3, field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var2, 0, 1);
					}

					field1255 = field19;
					field1256 = field20;
					field1258 = 2;
					field1257 = 0;
					field1321.method220(76);
					field1321.method222(field1317 + var2);
					field1321.method222(field1318 + var3);
					field1321.method222(var5);
					field1321.method222(field1051);
					field1321.method222(field1049);
					field1321.method222(field1050);
				}

				if (var4 == 1175) {
					int var26 = var5 >> 14 & 0x7FFF;
					class57 var27 = class57.method320(var26);
					String var28;
					if (var27.field804 == null) {
						var28 = "It's a " + var27.field803 + ".";
					} else {
						var28 = new String(var27.field804);
					}

					method458(var28, 0, "");
				}

				if (var4 == 947) {
					method465();
				}

				if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
					if (var4 == 596) {
						field1321.method220(81);
					}

					if (var4 == 415) {
						if ((var3 & 0x3) == 0) {
							field1019++;
						}

						if (field1019 >= 55) {
							field1321.method220(126);
							field1321.method225(0);
						}

						field1321.method220(154);
					}

					if (var4 == 22) {
						field1321.method220(239);
					}

					if (var4 == 602) {
						field1321.method220(22);
					}

					if (var4 == 892) {
						if ((var2 & 0x3) == 0) {
							field1307++;
						}

						if (field1307 >= 130) {
							field1321.method220(36);
							field1321.method221(177);
						}

						field1321.method220(77);
					}

					field1321.method222(var5);
					field1321.method222(var2);
					field1321.method222(var3);
					field1339 = 0;
					field1340 = var3;
					field1341 = var2;
					field1342 = 2;
					if (class4.field51[var3].field57 == field1385) {
						field1342 = 1;
					}

					if (class4.field51[var3].field57 == field1331) {
						field1342 = 3;
					}
				}

				if (var4 == 285) {
					method503(47, var5, var3, var2);
				}

				if (var4 == 951) {
					class4 var29 = class4.field51[var3];
					boolean var30 = true;
					if (var29.field60 > 0) {
						var30 = method453(var29);
					}

					if (var30) {
						field1321.method220(111);
						field1321.method222(var3);
					}
				}

				if (var4 == 504) {
					method503(185, var5, var3, var2);
				}

				if (var4 == 1501) {
					field1287 += field1318;
					if (field1287 >= 92) {
						field1321.method220(220);
						field1321.method225(0);
					}

					method503(134, var5, var3, var2);
				}

				if (var4 == 188) {
					field1048 = 1;
					field1049 = var2;
					field1050 = var3;
					field1051 = var5;
					field1052 = class59.method335(var5).field871;
					field1025 = 0;
				} else {
					if (var4 == 960) {
						field1321.method220(111);
						field1321.method222(var3);
						class4 var31 = class4.field51[var3];
						if (var31.field65 != null && var31.field65[0][0] == 5) {
							int var32 = var31.field65[0][1];
							if (field1113[var32] != var31.field67[0]) {
								field1113[var32] = var31.field67[0];
								method451(var32);
								field1355 = true;
							}
						}
					}

					if (var4 == 367) {
						class28 var33 = field1324[var5];
						if (var33 != null) {
							method416(false, var33.field408[0], field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var33.field407[0], 0, 1);
							field1255 = field19;
							field1256 = field20;
							field1258 = 2;
							field1257 = 0;
							field1321.method220(101);
							field1321.method222(var5);
							field1321.method222(field1051);
							field1321.method222(field1049);
							field1321.method222(field1050);
						}
					}

					if (var4 == 679) {
						String var34 = field1277[arg0];
						int var35 = var34.indexOf("@whi@");
						if (var35 != -1) {
							long var36 = class52.method296(var34.substring(var35 + 5).trim());
							int var38 = -1;
							for (int var39 = 0; var39 < field1097; var39++) {
								if (field1183[var39] == var36) {
									var38 = var39;
									break;
								}
							}

							if (var38 != -1 && field1112[var38] > 0) {
								field1252 = true;
								field1314 = false;
								field1186 = true;
								field1064 = "";
								field1014 = 3;
								field1268 = field1183[var38];
								field1174 = "Enter message to send to " + field1001[var38];
							}
						}
					}

					if (var4 == 660) {
						if (field1269) {
							field1357.method100(var3 - 11, var2 - 8);
						} else {
							field1357.method100(field20 - 11, field19 - 8);
						}
					}

					if (var4 == 965) {
						boolean var40 = method416(false, var3, field1156.field407[0], field1156.field408[0], 0, 0, 2, 0, var2, 0, 0);
						if (!var40) {
							method416(false, var3, field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var2, 0, 1);
						}

						field1255 = field19;
						field1256 = field20;
						field1258 = 2;
						field1257 = 0;
						field1321.method220(78);
						field1321.method222(field1317 + var2);
						field1321.method222(field1318 + var3);
						field1321.method222(var5);
						field1321.method222(field1026);
					}

					if (var4 == 465) {
						field1321.method220(111);
						field1321.method222(var3);
						class4 var42 = class4.field51[var3];
						if (var42.field65 != null && var42.field65[0][0] == 5) {
							int var43 = var42.field65[0][1];
							field1113[var43] = 1 - field1113[var43];
							method451(var43);
							field1355 = true;
						}
					}

					if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
						if (var4 == 347) {
							field1321.method220(127);
						}

						if (var4 == 422) {
							field1321.method220(176);
						}

						if (var4 == 478) {
							if ((var2 & 0x3) == 0) {
								field1004++;
							}

							if (field1004 >= 90) {
								field1321.method220(52);
							}

							field1321.method220(85);
						}

						if (var4 == 405) {
							field1239 += var5;
							if (field1239 >= 97) {
								field1321.method220(161);
								field1321.method224(0xE42D58);
							}

							field1321.method220(93);
						}

						if (var4 == 38) {
							field1321.method220(203);
						}

						field1321.method222(var5);
						field1321.method222(var2);
						field1321.method222(var3);
						field1339 = 0;
						field1340 = var3;
						field1341 = var2;
						field1342 = 2;
						if (class4.field51[var3].field57 == field1385) {
							field1342 = 1;
						}

						if (class4.field51[var3].field57 == field1331) {
							field1342 = 3;
						}
					}

					if (var4 == 44 && !field1035) {
						field1321.method220(157);
						field1321.method222(var3);
						field1035 = true;
					}

					if (var4 == 881) {
						field1321.method220(45);
						field1321.method222(var5);
						field1321.method222(var2);
						field1321.method222(var3);
						field1321.method222(field1051);
						field1321.method222(field1049);
						field1321.method222(field1050);
						field1339 = 0;
						field1340 = var3;
						field1341 = var2;
						field1342 = 2;
						if (class4.field51[var3].field57 == field1385) {
							field1342 = 1;
						}

						if (class4.field51[var3].field57 == field1331) {
							field1342 = 3;
						}
					}

					if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
						String var44 = field1277[arg0];
						int var45 = var44.indexOf("@whi@");
						if (var45 != -1) {
							long var46 = class52.method296(var44.substring(var45 + 5).trim());
							if (var4 == 406) {
								method456(var46);
							}

							if (var4 == 436) {
								method433(var46);
							}

							if (var4 == 557) {
								method467(var46);
							}

							if (var4 == 556) {
								method517(var46);
							}
						}
					}

					if (var4 == 581) {
						if ((var5 & 0x3) == 0) {
							field1364++;
						}

						if (field1364 >= 99) {
							field1321.method220(255);
							field1321.method225(0);
						}

						method503(83, var5, var3, var2);
					}

					if (var4 == 1773) {
						class59 var48 = class59.method335(var5);
						String var49;
						if (var3 >= 100000) {
							var49 = var3 + " x " + var48.field871;
						} else if (var48.field872 == null) {
							var49 = "It's a " + var48.field871 + ".";
						} else {
							var49 = new String(var48.field872);
						}

						method458(var49, 0, "");
					}

					if (var4 == 391) {
						field1321.method220(90);
						field1321.method222(var5);
						field1321.method222(var2);
						field1321.method222(var3);
						field1321.method222(field1026);
						field1339 = 0;
						field1340 = var3;
						field1341 = var2;
						field1342 = 2;
						if (class4.field51[var3].field57 == field1385) {
							field1342 = 1;
						}

						if (class4.field51[var3].field57 == field1331) {
							field1342 = 3;
						}
					}

					if (var4 == 364) {
						method503(75, var5, var3, var2);
					}

					if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
						class28 var50 = field1324[var5];
						if (var50 != null) {
							method416(false, var50.field408[0], field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var50.field407[0], 0, 1);
							field1255 = field19;
							field1256 = field20;
							field1258 = 2;
							field1257 = 0;

							if (var4 == 151) {
								field990++;
								if (field990 >= 90) {
									field1321.method220(65);
									field1321.method222(31114);
								}

								field1321.method220(94);
							}

							if (var4 == 1544) {
								field1321.method220(66);
							}

							if (var4 == 1101) {
								field1321.method220(223);
							}

							if (var4 == 1373) {
								field1321.method220(192);
							}

							field1321.method222(var5);
						}
					}

					if (var4 == 450 && method503(160, var5, var3, var2)) {
						field1321.method222(field1051);
						field1321.method222(field1049);
						field1321.method222(field1050);
					}

					if (var4 == 34) {
						String var51 = field1277[arg0];
						int var52 = var51.indexOf("@whi@");
						if (var52 != -1) {
							method465();
							field1336 = var51.substring(var52 + 5).trim();
							field1281 = false;

							for (int var53 = 0; var53 < class4.field51.length; var53++) {
								if (class4.field51[var53] != null && class4.field51[var53].field60 == 600) {
									field1023 = field1385 = class4.field51[var53].field57;
									break;
								}
							}
						}
					}

					if (var4 == 900) {
						class27 var54 = field1077[var5];
						if (var54 != null) {
							method416(false, var54.field408[0], field1156.field407[0], field1156.field408[0], 0, 0, 2, 1, var54.field407[0], 0, 1);
							field1255 = field19;
							field1256 = field20;
							field1258 = 2;
							field1257 = 0;
							field1321.method220(21);
							field1321.method222(var5);
							field1321.method222(field1051);
							field1321.method222(field1049);
							field1321.method222(field1050);
						}
					}

					if (var4 == 55 && method503(62, var5, var3, var2)) {
						field1321.method222(field1026);
					}

					field1048 = 0;
					field1025 = 0;
				}
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.m(I)V")
	public final void method465() {
		field1321.method220(224);

		if (field1228 != -1) {
			field1228 = -1;
			field1355 = true;
			field1035 = false;
			field1012 = true;
		}

		if (field1331 != -1) {
			field1331 = -1;
			field1252 = true;
			field1035 = false;
		}

		field1385 = -1;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method466() {
		method493();
		field1196.method260();
		field1134.method204(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1098 == 0) {
			int var3 = var2 / 2 + 80;
			field1157.method207(true, var3, field1105.field716, 0x75A9A9, var1 / 2);
			int var4 = var2 / 2 - 20;
			field1159.method207(true, var4, "Welcome to RuneScape", 0xFFFF00, var1 / 2);
			var4 += 30;
			int var5 = var1 / 2 - 80;
			int var6 = var2 / 2 + 20;
			field1135.method204(var5 - 73, var6 - 20);
			field1159.method207(true, var6 + 5, "New user", 0xFFFFFF, var5);
			int var7 = var1 / 2 + 80;
			field1135.method204(var7 - 73, var6 - 20);
			field1159.method207(true, var6 + 5, "Existing User", 0xFFFFFF, var7);
		}

		if (field1098 == 2) {
			int var8 = var2 / 2 - 40;
			if (field1237.length() > 0) {
				field1159.method207(true, var8 - 15, field1237, 0xFFFF00, var1 / 2);
				field1159.method207(true, var8, field1238, 0xFFFF00, var1 / 2);
				var8 += 30;
			} else {
				field1159.method207(true, var8 - 7, field1238, 0xFFFF00, var1 / 2);
				var8 += 30;
			}

			field1159.method211(true, "Username: " + field1284 + (field1109 == 0 & field1131 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var8, var1 / 2 - 90);
			var8 += 15;
			field1159.method211(true, "Password: " + class52.method302(field1285) + (field1109 == 1 & field1131 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var8, var1 / 2 - 88);
			var8 += 15;
			int var9 = var1 / 2 - 80;
			int var10 = var2 / 2 + 50;
			field1135.method204(var9 - 73, var10 - 20);
			field1159.method207(true, var10 + 5, "Login", 0xFFFFFF, var9);
			int var11 = var1 / 2 + 80;
			field1135.method204(var11 - 73, var10 - 20);
			field1159.method207(true, var10 + 5, "Cancel", 0xFFFFFF, var11);
		}

		if (field1098 == 3) {
			field1159.method207(true, var2 / 2 - 60, "Create a free account", 0xFFFF00, var1 / 2);
			int var12 = var2 / 2 - 35;
			field1159.method207(true, var12, "To create a new account you need to", 0xFFFFFF, var1 / 2);
			var12 += 15;
			field1159.method207(true, var12, "go back to the main RuneScape webpage", 0xFFFFFF, var1 / 2);
			var12 += 15;
			field1159.method207(true, var12, "and choose the red 'create account'", 0xFFFFFF, var1 / 2);
			var12 += 15;
			field1159.method207(true, var12, "button at the top right of that page.", 0xFFFFFF, var1 / 2);
			var12 += 15;
			int var13 = var1 / 2;
			int var14 = var2 / 2 + 50;
			field1135.method204(var13 - 73, var14 - 20);
			field1159.method207(true, var14 + 5, "Cancel", 0xFFFFFF, var13);
		}

		field1196.method261(214, field9, 186);

		if (field1204) {
			field1204 = false;
			field1194.method261(128, field9, 0);
			field1195.method261(214, field9, 386);
			field1199.method261(0, field9, 265);
			field1200.method261(574, field9, 265);
			field1201.method261(128, field9, 186);
			field1202.method261(574, field9, 186);
		}
	}

	public final void init() {
		field996 = Integer.parseInt(getParameter("nodeid"));
		field997 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method447();
		} else {
			method501();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field998 = false;
		} else {
			field998 = true;
		}

		method2(789, 532);
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method467(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1097; var3++) {
				if (field1183[var3] == arg0) {
					field1097--;
					field1355 = true;

					for (int var4 = var3; var4 < field1097; var4++) {
						field1001[var4] = field1001[var4 + 1];
						field1112[var4] = field1112[var4 + 1];
						field1183[var4] = field1183[var4 + 1];
					}

					field1321.method220(39);
					field1321.method227(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lz;II)V")
	public final void method468(class26 arg0, int arg1) {
		method469(arg0.field359, arg1, arg0.field360);
	}

	@ObfuscatedName("client.a(IIZI)V")
	public final void method469(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method499(arg2, arg0, field1003) - arg1;
			arg0 -= field1066;
			var4 -= field1067;
			arg2 -= field1068;
			int var5 = class32.field539[field1069];
			int var6 = class32.field540[field1069];
			int var7 = class32.field539[field1070];
			int var8 = class32.field540[field1070];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field1055 = (var9 << 9) / arg2 + class35.field567;
				field1056 = (var11 << 9) / arg2 + class35.field568;
			} else {
				field1055 = -1;
				field1056 = -1;
			}
		} else {
			field1055 = -1;
			field1056 = -1;
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method470() {
		try {
			field1021 = -1;
			field1350.method254();
			field1096.method254();
			class35.method172();
			method542();
			field1357.method62();

			for (int var1 = 0; var1 < 4; var1++) {
				field1303[var1].method346();
			}

			System.gc();
			class3 var2 = new class3(104, field1352, field1354, 104);
			int var3 = field1351.length;
			class3.field26 = class19.field257;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1333[var4] >> 8;
				int var6 = field1333[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field26 = false;
				}
			}

			if (class3.field26) {
				field1357.method63(field1003);
			} else {
				field1357.method63(0);
			}

			field1321.method220(251);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1333[var7] >> 8) * 64 - field1317;
				int var9 = (field1333[var7] & 0xFF) * 64 - field1318;
				byte[] var10 = field1351[var7];
				if (var10 != null) {
					var2.method15(var10, (field1249 - 6) * 8, var9, var8, (field1248 - 6) * 8);
				} else if (field1249 < 800) {
					var2.method14(64, var9, var8, 64);
				}
			}

			field1321.method220(251);

			for (int var11 = 0; var11 < var3; var11++) {
				byte[] var12 = field1234[var11];
				if (var12 != null) {
					int var13 = (field1333[var11] >> 8) * 64 - field1317;
					int var14 = (field1333[var11] & 0xFF) * 64 - field1318;
					var2.method18(field1303, field1357, var14, var13, var12);
				}
			}

			field1321.method220(251);
			var2.method20(field1357, field1303);
			field1265.method260();
			field1321.method220(251);

			for (int var15 = 0; var15 < 104; var15++) {
				for (int var16 = 0; var16 < 104; var16++) {
					method424(var15, var16);
				}
			}

			method482();
		} catch (Exception var29) {
		}

		class57.field833.method115();

		if (field999 && signlink.cache_dat != null) {
			int var18 = field1105.method274(0);
			for (int var19 = 0; var19 < var18; var19++) {
				int var20 = field1105.method278(var19);
				if ((var20 & 0x79) == 0) {
					class32.method134(var19);
				}
			}
		}

		System.gc();
		class35.method173(20);
		field1105.method283();
		int var21 = (field1248 - 6) / 8 - 1;
		int var22 = (field1248 + 6) / 8 + 1;
		int var23 = (field1249 - 6) / 8 - 1;
		int var24 = (field1249 + 6) / 8 + 1;
		if (field1294) {
			var21 = 49;
			var22 = 50;
			var23 = 49;
			var24 = 50;
		}

		for (int var25 = var21; var25 <= var22; var25++) {
			for (int var26 = var23; var26 <= var24; var26++) {
				if (var21 == var25 || var22 == var25 || var23 == var26 || var24 == var26) {
					int var27 = field1105.method276(var25, var26, 0);
					if (var27 != -1) {
						field1105.method284(3, var27);
					}

					int var28 = field1105.method276(var25, var26, 1);
					if (var28 != -1) {
						field1105.method284(3, var28);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)Ljava/lang/String;")
	public final String method471() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IZLd;IIIIIZ)V")
	public final void method472(int arg0, boolean arg1, class4 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field1241) {
			field1155 = 32;
		} else {
			field1155 = 0;
		}

		field1241 = false;
		if (arg7 >= arg3 && arg7 < arg3 + 16 && arg4 >= arg6 && arg4 < arg6 + 16) {
			arg2.field70 -= field1000 * 4;

			if (arg1) {
				field1355 = true;
				return;
			}
		} else if (arg7 >= arg3 && arg7 < arg3 + 16 && arg4 >= arg0 + arg6 - 16 && arg4 < arg0 + arg6) {
			arg2.field70 += field1000 * 4;

			if (arg1) {
				field1355 = true;
				return;
			}
		} else if (arg7 >= arg3 - field1155 && arg7 < arg3 + field1155 + 16 && arg4 >= arg6 + 16 && arg4 < arg0 + arg6 - 16 && field1000 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg6 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg2.field70 = (arg5 - arg0) * var10 / var11;

			if (arg1) {
				field1355 = true;
			}

			field1241 = true;
		} else {
			return;
		}
	}

	public final void run() {
		if (field1308) {
			method484();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public final String method473(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method474() {
		field1264.method260();
		int var1 = field1369 + field1046 & 0x7FF;
		int var2 = field1156.field359 / 32 + 48;
		int var3 = 464 - field1156.field360 / 32;
		field1211.method196(field1184 + 256, field1236, var2, var3, 21, 151, field1060, var1, 146, 9);
		field1037.method196(256, field1100, 25, 25, 0, 33, field1136, field1369, 33, 0);

		for (int var4 = 0; var4 < field1061; var4++) {
			int var5 = field1062[var4] * 4 + 2 - field1156.field359 / 32;
			int var6 = field1063[var4] * 4 + 2 - field1156.field360 / 32;
			method463(var6, var5, field1058[var4]);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1168[field1003][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1156.field359 / 32;
					int var11 = var8 * 4 + 2 - field1156.field360 / 32;
					method463(var11, var10, field1071);
				}
			}
		}

		for (int var12 = 0; var12 < field1078; var12++) {
			class27 var13 = field1077[field1079[var12]];
			if (var13 != null && var13.method124() && var13.field411.field858) {
				int var14 = var13.field359 / 32 - field1156.field359 / 32;
				int var15 = var13.field360 / 32 - field1156.field360 / 32;
				method463(var15, var14, field1072);
			}
		}

		for (int var16 = 0; var16 < field1325; var16++) {
			class28 var17 = field1324[field1326[var16]];
			if (var17 != null && var17.method124()) {
				int var18 = var17.field359 / 32 - field1156.field359 / 32;
				int var19 = var17.field360 / 32 - field1156.field360 / 32;
				boolean var20 = false;
				long var21 = class52.method296(var17.field412);
				for (int var23 = 0; var23 < field1097; var23++) {
					if (field1183[var23] == var21 && field1112[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method463(var19, var18, field1074);
				} else {
					method463(var19, var18, field1073);
				}
			}
		}

		if (field1209 != 0) {
			int var24 = field1209 * 4 + 2 - field1156.field359 / 32;
			int var25 = field1210 * 4 + 2 - field1156.field360 / 32;
			method463(var25, var24, field1182);
		}

		class34.method165(93, 3, 0xFFFFFF, 3, 82);
		field1265.method260();
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method475() {
		int var1 = field1159.method208("Choose Option");
		for (int var2 = 0; var2 < field1332; var2++) {
			int var3 = field1159.method208(field1277[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1332 * 15 + 21;
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

			field1269 = true;
			field1298 = 0;
			field1299 = var5;
			field1300 = var6;
			field1301 = var1;
			field1302 = field1332 * 15 + 22;
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

			field1269 = true;
			field1298 = 1;
			field1299 = var7;
			field1300 = var8;
			field1301 = var1;
			field1302 = field1332 * 15 + 22;
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

			field1269 = true;
			field1298 = 2;
			field1299 = var9;
			field1300 = var10;
			field1301 = var1;
			field1302 = field1332 * 15 + 22;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method476() {
		if (field1141 == 0) {
			field1277[0] = "Cancel";
			field1216[0] = 1252;
			field1332 = 1;
			method442(field17, field16);
			field1146 = 0;

			if (field16 > 8 && field17 > 11 && field16 < 520 && field17 < 345) {
				if (field1385 == -1) {
					method532();
				} else {
					method516(8, 11, field16, field17, 0, class4.field51[field1385]);
				}
			}

			if (field1146 != field1011) {
				field1011 = field1146;
			}

			field1146 = 0;

			if (field16 > 562 && field17 > 231 && field16 < 752 && field17 < 492) {
				if (field1228 != -1) {
					method516(562, 231, field16, field17, 0, class4.field51[field1228]);
				} else if (field1207[field1366] != -1) {
					method516(562, 231, field16, field17, 0, class4.field51[field1207[field1366]]);
				}
			}

			if (field1146 != field1044) {
				field1355 = true;
				field1044 = field1146;
			}

			field1146 = 0;

			if (field16 > 22 && field17 > 375 && field16 < 431 && field17 < 471) {
				if (field1331 == -1) {
					method510(field16 - 22, field17 - 375);
				} else {
					method516(22, 375, field16, field17, 0, class4.field51[field1331]);
				}
			}

			if (field1331 != -1 && field1146 != field1043) {
				field1252 = true;
				field1043 = field1146;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1332 - 1; var2++) {
					if (field1216[var2] < 1000 && field1216[var2 + 1] > 1000) {
						String var3 = field1277[var2];
						field1277[var2] = field1277[var2 + 1];
						field1277[var2 + 1] = var3;
						int var4 = field1216[var2];
						field1216[var2] = field1216[var2 + 1];
						field1216[var2 + 1] = var4;
						int var5 = field1214[var2];
						field1214[var2] = field1214[var2 + 1];
						field1214[var2 + 1] = var5;
						int var6 = field1215[var2];
						field1215[var2] = field1215[var2 + 1];
						field1215[var2 + 1] = var6;
						int var7 = field1217[var2];
						field1217[var2] = field1217[var2 + 1];
						field1217[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method477() {
		if (field18 == 1) {
			if (field19 >= 549 && field19 <= 583 && field20 >= 195 && field20 < 231 && field1207[0] != -1) {
				field1355 = true;
				field1366 = 0;
				field1012 = true;
			}

			if (field19 >= 579 && field19 <= 609 && field20 >= 194 && field20 < 231 && field1207[1] != -1) {
				field1355 = true;
				field1366 = 1;
				field1012 = true;
			}

			if (field19 >= 607 && field19 <= 637 && field20 >= 194 && field20 < 231 && field1207[2] != -1) {
				field1355 = true;
				field1366 = 2;
				field1012 = true;
			}

			if (field19 >= 635 && field19 <= 679 && field20 >= 194 && field20 < 229 && field1207[3] != -1) {
				field1355 = true;
				field1366 = 3;
				field1012 = true;
			}

			if (field19 >= 676 && field19 <= 706 && field20 >= 194 && field20 < 231 && field1207[4] != -1) {
				field1355 = true;
				field1366 = 4;
				field1012 = true;
			}

			if (field19 >= 704 && field19 <= 734 && field20 >= 194 && field20 < 231 && field1207[5] != -1) {
				field1355 = true;
				field1366 = 5;
				field1012 = true;
			}

			if (field19 >= 732 && field19 <= 766 && field20 >= 195 && field20 < 231 && field1207[6] != -1) {
				field1355 = true;
				field1366 = 6;
				field1012 = true;
			}

			if (field19 >= 550 && field19 <= 584 && field20 >= 492 && field20 < 528 && field1207[7] != -1) {
				field1355 = true;
				field1366 = 7;
				field1012 = true;
			}

			if (field19 >= 582 && field19 <= 612 && field20 >= 492 && field20 < 529 && field1207[8] != -1) {
				field1355 = true;
				field1366 = 8;
				field1012 = true;
			}

			if (field19 >= 609 && field19 <= 639 && field20 >= 492 && field20 < 529 && field1207[9] != -1) {
				field1355 = true;
				field1366 = 9;
				field1012 = true;
			}

			if (field19 >= 637 && field19 <= 681 && field20 >= 493 && field20 < 528 && field1207[10] != -1) {
				field1355 = true;
				field1366 = 10;
				field1012 = true;
			}

			if (field19 >= 679 && field19 <= 709 && field20 >= 492 && field20 < 529 && field1207[11] != -1) {
				field1355 = true;
				field1366 = 11;
				field1012 = true;
			}

			if (field19 >= 706 && field19 <= 736 && field20 >= 492 && field20 < 529 && field1207[12] != -1) {
				field1355 = true;
				field1366 = 12;
				field1012 = true;
			}

			if (field19 >= 734 && field19 <= 768 && field20 >= 492 && field20 < 528 && field1207[13] != -1) {
				field1355 = true;
				field1366 = 13;
				field1012 = true;
			}

			field1313++;
			if (field1313 > 150) {
				field1313 = 0;
				field1321.method220(43);
				field1321.method221(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method478() {
		if (field18 == 1) {
			int var1 = field19 - 21 - 561;
			int var2 = field20 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1369 + field1046 & 0x7FF;
				int var4 = class35.field571[var3];
				int var5 = class35.field572[var3];
				var4 = (field1184 + 256) * var4 >> 8;
				var5 = (field1184 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1156.field359 + var6 >> 7;
				int var9 = field1156.field360 - var7 >> 7;
				boolean var10 = method416(true, var9, field1156.field407[0], field1156.field408[0], 0, 0, 1, 0, var8, 0, 0);
				if (var10) {
					field1321.method221(var1);
					field1321.method221(var2);
					field1321.method222(field1369);
					field1321.method221(57);
					field1321.method221(field1046);
					field1321.method221(field1184);
					field1321.method221(89);
					field1321.method222(field1156.field359);
					field1321.method222(field1156.field360);
					field1321.method221(field1123);
					field1321.method221(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBIILfc;)V")
	public final void method479(int arg0, int arg1, int arg2, class58 arg3) {
		if (field1332 < 400) {
			String var5 = arg3.field841;
			if (arg3.field859 != 0) {
				var5 = var5 + method439(field1156.field418, arg3.field859) + " (level-" + arg3.field859 + ")";
			}

			if (field1048 == 1) {
				field1277[field1332] = "Use " + field1052 + " with @yel@" + var5;
				field1216[field1332] = 900;
				field1217[field1332] = arg1;
				field1214[field1332] = arg0;
				field1215[field1332] = arg2;
				field1332++;
			} else if (field1025 != 1) {
				if (arg3.field854 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg3.field854[var6] != null && !arg3.field854[var6].equalsIgnoreCase("attack")) {
							field1277[field1332] = arg3.field854[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1216[field1332] = 728;
							}

							if (var6 == 1) {
								field1216[field1332] = 542;
							}

							if (var6 == 2) {
								field1216[field1332] = 6;
							}

							if (var6 == 3) {
								field1216[field1332] = 963;
							}

							if (var6 == 4) {
								field1216[field1332] = 245;
							}

							field1217[field1332] = arg1;
							field1214[field1332] = arg0;
							field1215[field1332] = arg2;
							field1332++;
						}
					}
				}

				if (arg3.field854 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg3.field854[var7] != null && arg3.field854[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg3.field859 > field1156.field418) {
								var8 = 2000;
							}

							field1277[field1332] = arg3.field854[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1216[field1332] = var8 + 728;
							}

							if (var7 == 1) {
								field1216[field1332] = var8 + 542;
							}

							if (var7 == 2) {
								field1216[field1332] = var8 + 6;
							}

							if (var7 == 3) {
								field1216[field1332] = var8 + 963;
							}

							if (var7 == 4) {
								field1216[field1332] = var8 + 245;
							}

							field1217[field1332] = arg1;
							field1214[field1332] = arg0;
							field1215[field1332] = arg2;
							field1332++;
						}
					}
				}

				field1277[field1332] = "Examine @yel@" + var5;
				field1216[field1332] = 1607;
				field1217[field1332] = arg1;
				field1214[field1332] = arg0;
				field1215[field1332] = arg2;
				field1332++;
			} else if ((field1027 & 0x2) == 2) {
				field1277[field1332] = field1028 + " @yel@" + var5;
				field1216[field1332] = 265;
				field1217[field1332] = arg1;
				field1214[field1332] = arg0;
				field1215[field1332] = arg2;
				field1332++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1015.method250(); var11 != null; var11 = (class41) field1015.method252()) {
			if (var11.field627 == arg1 && var11.field629 == arg8 && var11.field630 == arg0 && var11.field628 == arg7) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field627 = arg1;
			var10.field628 = arg7;
			var10.field629 = arg8;
			var10.field630 = arg0;
			method431(var10);
			field1015.method247(var10);
		}

		var10.field634 = arg6;
		var10.field636 = arg3;
		var10.field635 = arg5;
		var10.field637 = arg4;
		var10.field638 = arg2;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method481() {
		field1263.method260();
		class35.field573 = field1148;
		field1190.method204(0, 0);

		if (field1228 != -1) {
			method445(0, class4.field51[field1228], 0, 0);
		} else if (field1207[field1366] != -1) {
			method445(0, class4.field51[field1207[field1366]], 0, 0);
		}

		if (field1269 && field1298 == 1) {
			method492();
		}

		field1263.method261(562, field9, 231);
		field1265.method260();
		class35.field573 = field1149;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method482() {
		for (class41 var1 = (class41) field1015.method250(); var1 != null; var1 = (class41) field1015.method252()) {
			if (var1.field638 == -1) {
				var1.field637 = 0;
				method431(var1);
			} else {
				var1.method118();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = class32.field539[var7];
			int var13 = class32.field540[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class32.field539[var8];
			int var16 = class32.field540[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1066 = arg2 - var9;
		field1067 = arg0 - var10;
		field1068 = arg4 - var11;
		field1069 = arg1;
		field1070 = arg3;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method484() {
		field1212 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1053) {
				field1009++;
				method529();
				method529();
				method428();
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

		field1212 = false;
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method485(int arg0, class39 arg1) {
		field1188 = 0;
		field1327 = 0;
		method457(arg1, arg0);
		method448(arg1, arg0);
		method511(arg0, arg1);
		method515(arg0, arg1);

		for (int var3 = 0; var3 < field1188; var3++) {
			int var4 = field1189[var3];
			if (field1131 != field1324[var4].field403) {
				field1324[var4] = null;
			}
		}

		if (arg1.field611 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field611 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1325; var5++) {
			if (field1324[field1326[var5]] == null) {
				signlink.reporterror(field1284 + " null entry in pl list - pos:" + var5 + " size:" + field1325);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method486() {
		field1179++;
		method509();
		method437();
		method536();
		method504();

		if (!field1262) {
			int var1 = field1368;
			if (field1180 / 256 > var1) {
				var1 = field1180 / 256;
			}

			if (field1038[4] && field1259[4] + 128 > var1) {
				var1 = field1259[4] + 128;
			}

			int var2 = field1369 + field1031 & 0x7FF;
			method483(method499(field1156.field360, field1156.field359, field1003) - 50, var1, field1161, var2, field1162, var1 * 3 + 600);
			field1292++;
			if (field1292 > 1802) {
				field1292 = 0;
				field1321.method220(15);
				field1321.method221(0);
				int var3 = field1321.field611;
				field1321.method222(29711);
				field1321.method221(70);
				field1321.method221((int) (Math.random() * 256.0D));
				field1321.method221(242);
				field1321.method221(186);
				field1321.method221(39);
				field1321.method221(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1321.method221(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1321.method222(57856);
				}

				field1321.method222((int) (Math.random() * 65536.0D));
				field1321.method230(field1321.field611 - var3);
			}
		}

		int var4;
		if (field1262) {
			var4 = method540();
		} else {
			var4 = method539();
		}

		int var5 = field1066;
		int var6 = field1067;
		int var7 = field1068;
		int var8 = field1069;
		int var9 = field1070;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1038[var10]) {
				int var11 = (int) (Math.random() * (field1164[var10] * 2 + 1) + Math.sin(field1054[var10] / 100.0D * field1167[var10]) * field1259[var10] - field1164[var10]);
				if (var10 == 0) {
					field1066 += var11;
				}

				if (var10 == 1) {
					field1067 += var11;
				}

				if (var10 == 2) {
					field1068 += var11;
				}

				if (var10 == 3) {
					field1070 = field1070 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1069 += var11;
					if (field1069 < 128) {
						field1069 = 128;
					}

					if (field1069 > 383) {
						field1069 = 383;
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
		field1357.method101(field1068, field1069, field1067, field1066, var4, field1070);
		field1357.method76();
		method488();
		method452();
		method429(var12);
		method518();
		field1265.method261(8, field9, 11);
		field1066 = var5;
		field1067 = var6;
		field1068 = var7;
		field1069 = var8;
		field1070 = var9;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method487() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1282) {
			field1053 = false;
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

		if (field1178) {
			field1053 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1166) {
			field1053 = false;
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
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1310) {
			field1166 = true;
		} else {
			field1310 = true;
			boolean var1 = false;
			String var2 = method471();
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
						field1065[var3] = new class49(var3 + 1, 500000, signlink.cache_idx[var3], signlink.cache_dat);
					}
				}

				try {
					int var4 = 5;
					field1353[8] = 0;
					while (field1353[8] == 0) {
						method13(20, "Connecting to web server");

						try {
							DataInputStream var5 = method533("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field610, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1353[var7] = var6.method236();
							}

							var5.close();
						} catch (IOException var82) {
							for (int var8 = var4; var8 > 0; var8--) {
								method13(10, "Error loading - Will retry in " + var8 + " secs.");

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

					field1343 = method541("title", 25, field1353[1], "title screen", 1);
					field1157 = new class38(field1343, "p11");
					field1158 = new class38(field1343, "p12");
					field1159 = new class38(field1343, "b12");
					field1160 = new class38(field1343, "q8");
					method535();
					method494();
					class51 var9 = method541("config", 30, field1353[2], "config", 2);
					class51 var10 = method541("interface", 35, field1353[3], "interface", 3);
					class51 var11 = method541("media", 40, field1353[4], "2d graphics", 4);
					class51 var12 = method541("textures", 45, field1353[6], "textures", 6);
					class51 var13 = method541("wordenc", 50, field1353[7], "chat system", 7);
					class51 var14 = method541("sounds", 55, field1353[8], "sound effects", 8);
					field1354 = new byte[4][104][104];
					field1352 = new int[4][105][105];
					field1357 = new class19(4, 104, field1352, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1303[var15] = new class61(104, 104);
					}

					field1211 = new class36(512, 512);
					class51 var16 = method541("versionlist", 60, field1353[5], "update list", 5);
					method13(60, "Connecting to update server");
					field1105 = new class48();
					field1105.method272(var16, this);
					class8.method57(field1105.method275());
					class32.method132(field1105.method274(0), field1105);

					if (!field999) {
						field1039 = 0;
						field1040 = false;
						field1105.method279(2, field1039);

						while (field1105.method280() > 0) {
							method460();

							try {
								Thread.sleep(100L);
							} catch (Exception var76) {
							}
						}
					}

					method13(65, "Requesting animations");
					int var17 = field1105.method274(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1105.method279(1, var18);
					}

					while (field1105.method280() > 0) {
						int var19 = var17 - field1105.method280();
						if (var19 > 0) {
							method13(65, "Loading animations - " + var19 * 100 / var17 + "%");
						}

						method460();

						try {
							Thread.sleep(100L);
						} catch (Exception var75) {
						}
					}

					method13(70, "Requesting models");
					int var20 = field1105.method274(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1105.method278(var21);
						if ((var22 & 0x1) != 0) {
							field1105.method279(0, var21);
						}
					}

					int var23 = field1105.method280();
					while (field1105.method280() > 0) {
						int var24 = var23 - field1105.method280();
						if (var24 > 0) {
							method13(70, "Loading models - " + var24 * 100 / var23 + "%");
						}

						method460();

						try {
							Thread.sleep(100L);
						} catch (Exception var74) {
						}
					}

					if (field1065[0] != null) {
						method13(75, "Requesting maps");
						field1105.method279(3, field1105.method276(47, 48, 0));
						field1105.method279(3, field1105.method276(47, 48, 1));
						field1105.method279(3, field1105.method276(48, 48, 0));
						field1105.method279(3, field1105.method276(48, 48, 1));
						field1105.method279(3, field1105.method276(49, 48, 0));
						field1105.method279(3, field1105.method276(49, 48, 1));
						field1105.method279(3, field1105.method276(47, 47, 0));
						field1105.method279(3, field1105.method276(47, 47, 1));
						field1105.method279(3, field1105.method276(48, 47, 0));
						field1105.method279(3, field1105.method276(48, 47, 1));
						field1105.method279(3, field1105.method276(48, 148, 0));
						field1105.method279(3, field1105.method276(48, 148, 1));
						int var25 = field1105.method280();
						while (field1105.method280() > 0) {
							int var26 = var25 - field1105.method280();
							if (var26 > 0) {
								method13(75, "Loading maps - " + var26 * 100 / var25 + "%");
							}

							method460();

							try {
								Thread.sleep(100L);
							} catch (Exception var73) {
							}
						}
					}

					int var27 = field1105.method274(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1105.method278(var28);
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
							field1105.method282(0, var30, var28);
						}
					}

					int var31 = field1105.method274(3);
					for (int var32 = 0; var32 < var31; var32++) {
						field1105.method282(3, (byte) 2, var32);
					}

					if (!field999) {
						int var33 = field1105.method274(2);
						for (int var34 = 1; var34 < var33; var34++) {
							field1105.method282(2, (byte) 1, var34);
						}
					}

					method13(80, "Unpacking media");
					field1190 = new class37(var11, "invback", 0);
					field1192 = new class37(var11, "chatback", 0);
					field1191 = new class37(var11, "mapback", 0);
					field1152 = new class37(var11, "backbase1", 0);
					field1153 = new class37(var11, "backbase2", 0);
					field1154 = new class37(var11, "backhmid1", 0);

					for (int var35 = 0; var35 < 13; var35++) {
						field1356[var35] = new class37(var11, "sideicons", var35);
					}

					field1037 = new class36(var11, "compass", 0);

					try {
						for (int var36 = 0; var36 < 50; var36++) {
							field1017[var36] = new class37(var11, "mapscene", var36);
						}
					} catch (Exception var81) {
					}

					try {
						for (int var37 = 0; var37 < 50; var37++) {
							field1213[var37] = new class36(var11, "mapfunction", var37);
						}
					} catch (Exception var80) {
					}

					try {
						for (int var38 = 0; var38 < 20; var38++) {
							field1171[var38] = new class36(var11, "hitmarks", var38);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var39 = 0; var39 < 20; var39++) {
							field1002[var39] = new class36(var11, "headicons", var39);
						}
					} catch (Exception var78) {
					}

					field1182 = new class36(var11, "mapflag", 0);

					for (int var40 = 0; var40 < 8; var40++) {
						field1111[var40] = new class36(var11, "cross", var40);
					}

					field1071 = new class36(var11, "mapdots", 0);
					field1072 = new class36(var11, "mapdots", 1);
					field1073 = new class36(var11, "mapdots", 2);
					field1074 = new class36(var11, "mapdots", 3);
					field1106 = new class37(var11, "scrollbar", 0);
					field1107 = new class37(var11, "scrollbar", 1);
					field1124 = new class37(var11, "redstone1", 0);
					field1125 = new class37(var11, "redstone2", 0);
					field1126 = new class37(var11, "redstone3", 0);
					field1127 = new class37(var11, "redstone1", 0);
					field1127.method201();
					field1128 = new class37(var11, "redstone2", 0);
					field1128.method201();
					field1229 = new class37(var11, "redstone1", 0);
					field1229.method202();
					field1230 = new class37(var11, "redstone2", 0);
					field1230.method202();
					field1231 = new class37(var11, "redstone3", 0);
					field1231.method202();
					field1232 = new class37(var11, "redstone1", 0);
					field1232.method201();
					field1232.method202();
					field1233 = new class37(var11, "redstone2", 0);
					field1233.method201();
					field1233.method202();
					class36 var41 = new class36(var11, "backleft1", 0);
					field1085 = new class44(method11(), var41.field586, var41.field587);
					var41.method188(0, 0);
					class36 var42 = new class36(var11, "backleft2", 0);
					field1086 = new class44(method11(), var42.field586, var42.field587);
					var42.method188(0, 0);
					class36 var43 = new class36(var11, "backright1", 0);
					field1087 = new class44(method11(), var43.field586, var43.field587);
					var43.method188(0, 0);
					class36 var44 = new class36(var11, "backright2", 0);
					field1088 = new class44(method11(), var44.field586, var44.field587);
					var44.method188(0, 0);
					class36 var45 = new class36(var11, "backtop1", 0);
					field1089 = new class44(method11(), var45.field586, var45.field587);
					var45.method188(0, 0);
					class36 var46 = new class36(var11, "backtop2", 0);
					field1090 = new class44(method11(), var46.field586, var46.field587);
					var46.method188(0, 0);
					class36 var47 = new class36(var11, "backvmid1", 0);
					field1091 = new class44(method11(), var47.field586, var47.field587);
					var47.method188(0, 0);
					class36 var48 = new class36(var11, "backvmid2", 0);
					field1092 = new class44(method11(), var48.field586, var48.field587);
					var48.method188(0, 0);
					class36 var49 = new class36(var11, "backvmid3", 0);
					field1093 = new class44(method11(), var49.field586, var49.field587);
					var49.method188(0, 0);
					class36 var50 = new class36(var11, "backhmid2", 0);
					field1094 = new class44(method11(), var50.field586, var50.field587);
					var50.method188(0, 0);
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 21.0D) - 10;
					int var53 = (int) (Math.random() * 21.0D) - 10;
					int var54 = (int) (Math.random() * 41.0D) - 20;
					for (int var55 = 0; var55 < 50; var55++) {
						if (field1213[var55] != null) {
							field1213[var55].method187(var51 + var54, var52 + var54, var53 + var54);
						}

						if (field1017[var55] != null) {
							field1017[var55].method203(var51 + var54, var52 + var54, var53 + var54);
						}
					}

					method13(83, "Unpacking textures");
					class35.method174(var12);
					class35.method178(0.8D);
					class35.method173(20);
					method13(86, "Unpacking config");
					class65.method368(var9);
					class57.method318(var9);
					class62.method358(var9);
					class59.method333(var9);
					class58.method327(var9);
					class63.method362(var9);
					class66.method371(var9);
					class67.method374(var9);
					class59.field868 = field998;

					if (!field999) {
						method13(90, "Unpacking sounds");
						byte[] var56 = var14.method295("sounds.dat", null);
						class39 var57 = new class39(var56);
						class55.method308(var57);
					}

					method13(95, "Unpacking interfaces");
					class38[] var58 = new class38[] { field1157, field1158, field1159, field1160 };
					class4.method32(var10, var58, var11);
					method13(100, "Preparing game engine");

					for (int var59 = 0; var59 < 33; var59++) {
						int var60 = 999;
						int var61 = 0;
						for (int var62 = 0; var62 < 35; var62++) {
							if (field1191.field592[field1191.field594 * var59 + var62] == 0) {
								if (var60 == 999) {
									var60 = var62;
								}
							} else if (var60 != 999) {
								var61 = var62;
								break;
							}
						}

						field1136[var59] = var60;
						field1100[var59] = var61 - var60;
					}

					for (int var63 = 9; var63 < 160; var63++) {
						int var64 = 999;
						int var65 = 0;
						for (int var66 = 10; var66 < 168; var66++) {
							if (field1191.field592[field1191.field594 * var63 + var66] == 0 && (var66 > 34 || var63 > 34)) {
								if (var64 == 999) {
									var64 = var66;
								}
							} else if (var64 != 999) {
								var65 = var66;
								break;
							}
						}

						field1060[var63 - 9] = var64 - 21;
						field1236[var63 - 9] = var65 - var64;
					}

					class35.method171(479, 96);
					field1147 = class35.field573;
					class35.method171(190, 261);
					field1148 = class35.field573;
					class35.method171(512, 334);
					field1149 = class35.field573;
					int[] var67 = new int[9];
					for (int var68 = 0; var68 < 9; var68++) {
						int var69 = var68 * 32 + 128 + 15;
						int var70 = var69 * 3 + 600;
						int var71 = class35.field571[var69];
						var67[var68] = var70 * var71 >> 16;
					}

					class19.method98(var67, 512, 500, 800, 334);
					class68.method376(var13);
				} catch (Exception var83) {
					signlink.reporterror("loaderror - " + var83.getMessage());
					field1282 = true;
				}
			} else {
				field1178 = true;
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method488() {
		field1218 = 0;
		for (int var1 = -1; var1 < field1325 + field1078; var1++) {
			class26 var2;
			if (var1 == -1) {
				var2 = field1156;
			} else if (var1 < field1325) {
				var2 = field1324[field1326[var1]];
			} else {
				var2 = field1077[field1079[var1 - field1325]];
			}

			if (var2 != null && var2.method124()) {
				if (var1 < field1325) {
					int var3 = 30;
					class28 var4 = (class28) var2;
					if (var4.field415 != 0) {
						method468(var2, var2.field404 + 15);

						if (field1055 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field415 & 1 << var5) != 0) {
									field1002[var5].method190(field1055 - 12, field1056 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1254 == 10 && field1326[var1] == field1020) {
						method468(var2, var2.field404 + 15);

						if (field1055 > -1) {
							field1002[7].method190(field1055 - 12, field1056 - var3);
						}
					}
				} else if (field1254 == 1 && field1079[var1 - field1325] == field1132 && field1131 % 20 < 10) {
					method468(var2, var2.field404 + 15);

					if (field1055 > -1) {
						field1002[2].method190(field1055 - 12, field1056 - 28);
					}
				}

				if (var2.field371 != null && (var1 >= field1325 || field1290 == 0 || field1290 == 3 || field1290 == 1 && method454(((class28) var2).field412))) {
					method468(var2, var2.field404);

					if (field1055 > -1 && field1218 < field1219) {
						field1223[field1218] = field1159.method208(var2.field371) / 2;
						field1222[field1218] = field1159.field607;
						field1220[field1218] = field1055;
						field1221[field1218] = field1056;
						field1224[field1218] = var2.field373;
						field1225[field1218] = var2.field374;
						field1226[field1218] = var2.field372;
						field1227[field1218++] = var2.field371;

						if (field1367 == 0 && var2.field374 == 1) {
							field1222[field1218] += 10;
							field1221[field1218] += 5;
						}

						if (field1367 == 0 && var2.field374 == 2) {
							field1223[field1218] = 60;
						}
					}
				}

				if (var2.field377 > field1131 + 100) {
					method468(var2, var2.field404 + 15);

					if (field1055 > -1) {
						int var6 = var2.field378 * 30 / var2.field379;
						if (var6 > 30) {
							var6 = 30;
						}

						class34.method165(field1055 - 15, var6, 0xFF00, 5, field1056 - 3);
						class34.method165(field1055 + var6 - 15, 30 - var6, 0xFF0000, 5, field1056 - 3);
					}
				}

				if (var2.field377 > field1131 + 330) {
					method468(var2, var2.field404 / 2);

					if (field1055 > -1) {
						field1171[var2.field376].method190(field1055 - 12, field1056 - 12);
						field1157.method206(String.valueOf(var2.field375), field1055, field1056 + 4, 0);
						field1157.method206(String.valueOf(var2.field375), field1055 - 1, field1056 + 3, 0xFFFFFF);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field1218; var7++) {
			int var8 = field1220[var7];
			int var9 = field1221[var7];
			int var10 = field1223[var7];
			int var11 = field1222[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field1221[var13] - field1222[var13] && var9 - var11 < field1221[var13] + 2 && var8 - var10 < field1223[var13] + field1220[var13] && var8 + var10 > field1220[var13] - field1223[var13] && field1221[var13] - field1222[var13] < var9) {
						var9 = field1221[var13] - field1222[var13];
						var12 = true;
					}
				}
			}

			field1055 = field1220[var7];
			field1056 = field1221[var7] = var9;
			String var14 = field1227[var7];
			if (field1367 == 0) {
				int var15 = 0xFFFF00;
				if (field1224[var7] < 6) {
					var15 = field1172[field1224[var7]];
				}

				if (field1224[var7] == 6) {
					var15 = field1179 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1224[var7] == 7) {
					var15 = field1179 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1224[var7] == 8) {
					var15 = field1179 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1224[var7] == 9) {
					int var16 = 150 - field1226[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1224[var7] == 10) {
					int var17 = 150 - field1226[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1224[var7] == 11) {
					int var18 = 150 - field1226[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1225[var7] == 0) {
					field1159.method206(var14, field1055, field1056 + 1, 0);
					field1159.method206(var14, field1055, field1056, var15);
				}

				if (field1225[var7] == 1) {
					field1159.method210(field1179, field1056 + 1, 0, field1055, var14);
					field1159.method210(field1179, field1056, var15, field1055, var14);
				}

				if (field1225[var7] == 2) {
					int var19 = field1159.method208(var14);
					int var20 = (150 - field1226[var7]) * (var19 + 100) / 150;
					class34.method163(field1055 - 50, 0, 334, field1055 + 50);
					field1159.method209(field1055 + 50 - var20, var14, 0, field1056 + 1);
					field1159.method209(field1055 + 50 - var20, var14, var15, field1056);
					class34.method162();
				}
			} else {
				field1159.method206(var14, field1055, field1056 + 1, 0);
				field1159.method206(var14, field1055, field1056, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method489(int arg0) {
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

	@ObfuscatedName("client.a(Lmb;IB)V")
	public final void method490(class39 arg0, int arg1) {
		arg0.method241();
		int var3 = arg0.method242(8);
		if (var3 < field1078) {
			for (int var4 = var3; var4 < field1078; var4++) {
				field1189[field1188++] = field1079[var4];
			}
		}

		if (var3 > field1078) {
			signlink.reporterror(field1284 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1078 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1079[var5];
			class27 var7 = field1077[var6];
			int var8 = arg0.method242(1);
			if (var8 == 0) {
				field1079[field1078++] = var6;
				var7.field403 = field1131;
			} else {
				int var9 = arg0.method242(2);
				if (var9 == 0) {
					field1079[field1078++] = var6;
					var7.field403 = field1131;
					field1328[field1327++] = var6;
				} else if (var9 == 1) {
					field1079[field1078++] = var6;
					var7.field403 = field1131;
					int var10 = arg0.method242(3);
					var7.method123(false, var10);
					int var11 = arg0.method242(1);
					if (var11 == 1) {
						field1328[field1327++] = var6;
					}
				} else if (var9 == 2) {
					field1079[field1078++] = var6;
					var7.field403 = field1131;
					int var12 = arg0.method242(3);
					var7.method123(true, var12);
					int var13 = arg0.method242(3);
					var7.method123(true, var13);
					int var14 = arg0.method242(1);
					if (var14 == 1) {
						field1328[field1327++] = var6;
					}
				} else if (var9 == 3) {
					field1189[field1188++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLbb;ILmb;I)V")
	public final void method491(class28 arg0, int arg1, class39 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg2.method231();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg2.method240(var5, 0, var6);
			field1329[arg1] = var7;
			arg0.method126(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg2.method233();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg0.field386 == var8) {
				arg0.field390 = 0;
			}

			int var9 = arg2.method231();
			if (var8 == -1 || arg0.field386 == -1 || class65.field943[var8].field951 > class65.field943[arg0.field386].field951 || class65.field943[arg0.field386].field951 == 0) {
				arg0.field386 = var8;
				arg0.field387 = 0;
				arg0.field388 = 0;
				arg0.field389 = var9;
				arg0.field390 = 0;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg0.field380 = arg2.method233();
			if (arg0.field380 == 0xFFFF) {
				arg0.field380 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg0.field371 = arg2.method238();
			arg0.field373 = 0;
			arg0.field374 = 0;
			arg0.field372 = 150;
			method458(arg0.field371, 2, arg0.field412);
		}

		if ((arg3 & 0x10) == 0x10) {
			arg0.field375 = arg2.method231();
			arg0.field376 = arg2.method231();
			arg0.field377 = field1131 + 400;
			arg0.field378 = arg2.method231();
			arg0.field379 = arg2.method231();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg0.field381 = arg2.method233();
			arg0.field382 = arg2.method233();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var10 = arg2.method233();
			int var11 = arg2.method231();
			int var12 = arg2.method231();
			int var13 = arg2.field611;

			if (arg0.field412 != null) {
				long var14 = class52.method296(arg0.field412);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1293; var17++) {
						if (field1022[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1344 == 0) {
					try {
						String var18 = class53.method303(var12, arg2);
						var18 = class68.method386(var18);
						arg0.field371 = var18;
						arg0.field373 = var10 >> 8;
						arg0.field374 = var10 & 0xFF;
						arg0.field372 = 150;

						if (var11 > 1) {
							method458(var18, 1, arg0.field412);
						} else {
							method458(var18, 2, arg0.field412);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field611 = var12 + var13;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg0.field391 = arg2.method233();
			int var20 = arg2.method236();
			arg0.field395 = var20 >> 16;
			arg0.field394 = (var20 & 0xFFFF) + field1131;
			arg0.field392 = 0;
			arg0.field393 = 0;

			if (arg0.field394 > field1131) {
				arg0.field392 = -1;
			}

			if (arg0.field391 == 0xFFFF) {
				arg0.field391 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg0.field396 = arg2.method231();
			arg0.field398 = arg2.method231();
			arg0.field397 = arg2.method231();
			arg0.field399 = arg2.method231();
			arg0.field400 = arg2.method233() + field1131;
			arg0.field401 = arg2.method233() + field1131;
			arg0.field402 = arg2.method231();
			arg0.field406 = 0;
			arg0.field407[0] = arg0.field397;
			arg0.field408[0] = arg0.field399;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method492() {
		int var1 = field1299;
		int var2 = field1300;
		int var3 = field1301;
		int var4 = field1302;
		int var5 = 0x5D5447;
		class34.method165(var1, var3, var5, var4, var2);
		class34.method165(var1 + 1, var3 - 2, 0, 16, var2 + 1);
		class34.method166(var2 + 18, var4 - 19, var1 + 1, var3 - 2, 0);
		field1159.method209(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = field16;
		int var7 = field17;
		if (field1298 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1298 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field1298 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field1332; var8++) {
			int var9 = (field1332 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1159.method211(true, field1277[var8], var10, var9, var1 + 3);
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method493() {
		if (field1194 == null) {
			field10 = null;
			field1266 = null;
			field1264 = null;
			field1263 = null;
			field1265 = null;
			field1101 = null;
			field1102 = null;
			field1103 = null;
			field1197 = new class44(method11(), 128, 265);
			class34.method164();
			field1198 = new class44(method11(), 128, 265);
			class34.method164();
			field1194 = new class44(method11(), 533, 186);
			class34.method164();
			field1195 = new class44(method11(), 360, 146);
			class34.method164();
			field1196 = new class44(method11(), 360, 200);
			class34.method164();
			field1199 = new class44(method11(), 214, 267);
			class34.method164();
			field1200 = new class44(method11(), 215, 267);
			class34.method164();
			field1201 = new class44(method11(), 86, 79);
			class34.method164();
			field1202 = new class44(method11(), 87, 79);
			class34.method164();

			if (field1343 != null) {
				method535();
				method494();
			}

			field1204 = true;
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method494() {
		field1134 = new class37(field1343, "titlebox", 0);
		field1135 = new class37(field1343, "titlebutton", 0);
		field1372 = new class37[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1372[var1] = new class37(field1343, "runes", var1);
		}

		field1296 = new class36(128, 265);
		field1297 = new class36(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1296.field585[var2] = field1197.field643[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1297.field585[var3] = field1198.field643[var3];
		}

		field1380 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1380[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1380[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1380[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1380[var7 + 192] = 0xFFFFFF;
		}

		field1381 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1381[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1381[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1381[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1381[var11 + 192] = 0xFFFFFF;
		}

		field1382 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1382[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1382[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1382[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1382[var15 + 192] = 0xFFFFFF;
		}

		field1379 = new int[256];
		field1005 = new int[32768];
		field1006 = new int[32768];
		method435(null);
		field1150 = new int[32768];
		field1151 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1053) {
			field1308 = true;
			field1053 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method495() {
		if (field18 == 1) {
			if (field19 >= 8 && field19 <= 108 && field20 >= 490 && field20 <= 522) {
				field1290 = (field1290 + 1) % 4;
				field1175 = true;
				field1252 = true;
				field1321.method220(130);
				field1321.method221(field1290);
				field1321.method221(field1276);
				field1321.method221(field1057);
			}

			if (field19 >= 137 && field19 <= 237 && field20 >= 490 && field20 <= 522) {
				field1276 = (field1276 + 1) % 3;
				field1175 = true;
				field1252 = true;
				field1321.method220(130);
				field1321.method221(field1290);
				field1321.method221(field1276);
				field1321.method221(field1057);
			}

			if (field19 >= 275 && field19 <= 375 && field20 >= 490 && field20 <= 522) {
				field1057 = (field1057 + 1) % 3;
				field1175 = true;
				field1252 = true;
				field1321.method220(130);
				field1321.method221(field1290);
				field1321.method221(field1276);
				field1321.method221(field1057);
			}

			if (field19 >= 416 && field19 <= 516 && field20 >= 490 && field20 <= 522) {
				method465();
				field1336 = "";
				field1281 = false;

				for (int var1 = 0; var1 < class4.field51.length; var1++) {
					if (class4.field51[var1] != null && class4.field51[var1].field60 == 600) {
						field1023 = field1385 = class4.field51[var1].field57;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1108 != null) {
				field1108.method37();
			}
		} catch (Exception var1) {
		}

		field1108 = null;
		method543();
		field1105.method273();
		field1105 = null;
		field1321 = null;
		field1240 = null;
		field1260 = null;
		field1333 = null;
		field1351 = null;
		field1234 = null;
		field1334 = null;
		field1335 = null;
		field1352 = null;
		field1354 = null;
		field1357 = null;
		field1303 = null;
		field1129 = null;
		field1114 = null;
		field1383 = null;
		field1384 = null;
		field1251 = null;
		field1263 = null;
		field1264 = null;
		field1265 = null;
		field1266 = null;
		field1101 = null;
		field1102 = null;
		field1103 = null;
		field1085 = null;
		field1086 = null;
		field1087 = null;
		field1088 = null;
		field1089 = null;
		field1090 = null;
		field1091 = null;
		field1092 = null;
		field1093 = null;
		field1094 = null;
		field1190 = null;
		field1191 = null;
		field1192 = null;
		field1152 = null;
		field1153 = null;
		field1154 = null;
		field1356 = null;
		field1124 = null;
		field1125 = null;
		field1126 = null;
		field1127 = null;
		field1128 = null;
		field1229 = null;
		field1230 = null;
		field1231 = null;
		field1232 = null;
		field1233 = null;
		field1037 = null;
		field1171 = null;
		field1002 = null;
		field1111 = null;
		field1071 = null;
		field1072 = null;
		field1073 = null;
		field1074 = null;
		field1017 = null;
		field1213 = null;
		field1016 = null;
		field1324 = null;
		field1326 = null;
		field1328 = null;
		field1329 = null;
		field1189 = null;
		field1077 = null;
		field1079 = null;
		field1168 = null;
		field1015 = null;
		field1096 = null;
		field1350 = null;
		field1214 = null;
		field1215 = null;
		field1216 = null;
		field1217 = null;
		field1277 = null;
		field1113 = null;
		field1062 = null;
		field1063 = null;
		field1058 = null;
		field1211 = null;
		field1001 = null;
		field1183 = null;
		field1112 = null;
		field1197 = null;
		field1198 = null;
		field1194 = null;
		field1195 = null;
		field1196 = null;
		field1199 = null;
		field1200 = null;
		field1201 = null;
		field1202 = null;
		method461();
		class57.method319();
		class58.method328();
		class59.method334();
		class62.field913 = null;
		class63.field926 = null;
		class4.field51 = null;
		class64.field933 = null;
		class65.field943 = null;
		class66.field956 = null;
		class66.field969 = null;
		class67.field971 = null;
		field10 = null;
		class28.field433 = null;
		class35.method169();
		class19.method61();
		class32.method131();
		class8.method59();
		System.gc();
	}

	@ObfuscatedName("client.g(II)V")
	public final void method496(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.x(I)V")
	public void method497() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1009);

		if (field1105 != null) {
			System.out.println("Od-cycle:" + field1105.field730);
		}

		System.out.println("loop-cycle:" + field1131);
		System.out.println("draw-cycle:" + field1013);
		System.out.println("ptype:" + field1374);
		System.out.println("psize:" + field1373);

		if (field1108 != null) {
			field1108.method42();
		}

		field6 = true;
	}

	@ObfuscatedName("client.a(Z)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.a(ZLd;)Z")
	public final boolean method498(class4 arg0) {
		if (arg0.field66 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field66.length; var2++) {
			int var3 = method506(var2, arg0);
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

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 234);

			if (arg0.length == 5) {
				field996 = Integer.parseInt(arg0[0]);
				field997 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method447();
				} else if (arg0[2].equals("highmem")) {
					method501();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field998 = false;
				} else if (arg0[3].equals("members")) {
					field998 = true;
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

	@ObfuscatedName("client.a(IIIB)I")
	public final int method499(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		int var6 = arg2;
		if (arg2 < 3 && (field1354[1][var4][var5] & 0x2) == 2) {
			var6 = arg2 + 1;
		}

		int var7 = arg1 & 0x7F;
		int var8 = arg0 & 0x7F;
		int var9 = (128 - var7) * field1352[var6][var4][var5] + field1352[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field1352[var6][var4][var5 + 1] + field1352[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.o(B)V")
	public final void method500() {
		int var1 = (field1156.field359 >> 7) + field1317;
		int var2 = (field1156.field360 >> 7) + field1318;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1076 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1076 = (var2 - 9920) / 8 + 1;
		} else {
			field1076 = 0;
		}

		field1304 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1304 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1304 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1304 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1304 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1304 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1304 = 1;
			}
		}

		if (field1304 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1304 = 2;
		}

		field1344 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1344 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1344 = 1;
		}

		if (field1344 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1344 = 0;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public static final void method501() {
		class19.field257 = false;
		class35.field562 = false;
		field999 = false;
		class3.field26 = false;
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method502(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method503(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg1 >> 14 & 0x7FFF;
		int var6 = field1357.method92(field1003, arg3, arg2, arg1);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var9 = class57.method320(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field807;
				var11 = var9.field808;
			} else {
				var10 = var9.field808;
				var11 = var9.field807;
			}

			int var12 = var9.field831;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method416(false, arg2, field1156.field407[0], field1156.field408[0], 0, var12, 2, var11, arg3, 0, var10);
		} else {
			method416(false, arg2, field1156.field407[0], field1156.field408[0], var8, 0, 2, 0, arg3, var7 + 1, 0);
		}

		field1255 = field19;
		field1256 = field20;
		field1258 = 2;
		field1257 = 0;
		field1321.method220(arg0);
		field1321.method222(field1317 + arg3);
		field1321.method222(field1318 + arg2);
		field1321.method222(var5);
		return true;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method504() {
		for (class33 var1 = (class33) field1350.method250(); var1 != null; var1 = (class33) field1350.method252()) {
			if (field1003 != var1.field545 || var1.field551) {
				var1.method118();
			} else if (field1131 >= var1.field544) {
				var1.method160(field1176);

				if (var1.field551) {
					var1.method118();
				} else {
					field1357.method73(var1.field546, 0, -1, var1.field545, var1.field547, false, var1, 60, var1.field548);
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method505() {
		field1266.method260();
		class35.field573 = field1147;
		field1192.method204(0, 0);

		if (field1186) {
			field1159.method206(field1174, 239, 40, 0);
			field1159.method206(field1064 + "*", 239, 60, 128);
		} else if (field1314) {
			field1159.method206("Enter amount:", 239, 40, 0);
			field1159.method206(field1145 + "*", 239, 60, 128);
		} else if (field1253 != null) {
			field1159.method206(field1253, 239, 40, 0);
			field1159.method206("Click to continue", 239, 60, 128);
		} else if (field1331 != -1) {
			method445(0, class4.field51[field1331], 0, 0);
		} else if (field1358 == -1) {
			class38 var1 = field1158;
			int var2 = 0;
			class34.method163(0, 0, 77, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field995[var3] != null) {
					int var4 = field993[var3];
					int var5 = field1247 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, field995[var3], 0, var5);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, field994[var3] + ":", 0xFFFFFF, var5);
							var1.method209(var1.method208(field994[var3]) + 12, field995[var3], 255, var5);
						}

						var2++;
					}

					if (var4 == 2 && (field1290 == 0 || field1290 == 1 && method454(field994[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, field994[var3] + ":", 0, var5);
							var1.method209(var1.method208(field994[var3]) + 12, field995[var3], 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1133 == 0 && (var4 == 7 || field1276 == 0 || field1276 == 1 && method454(field994[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, "From " + field994[var3] + ":", 0, var5);
							var1.method209(var1.method208("From " + field994[var3]) + 12, field995[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field1057 == 0 || field1057 == 1 && method454(field994[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, field994[var3] + " " + field995[var3], 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field1133 == 0 && field1276 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, field995[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field1133 == 0 && field1276 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, "To " + field994[var3] + ":", 0, var5);
							var1.method209(var1.method208("To " + field994[var3]) + 12, field995[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field1057 == 0 || field1057 == 1 && method454(field994[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method209(4, field994[var3] + " " + field995[var3], 0xCBB789, var5);
						}

						var2++;
					}
				}
			}

			class34.method162();
			field1288 = var2 * 14 + 7;
			if (field1288 < 78) {
				field1288 = 78;
			}

			method423(field1288 - field1247 - 77, field1288, 463, 0, 77);
			var1.method209(4, class52.method300(field1284) + ":", 0, 90);
			var1.method209(var1.method208(field1284 + ": ") + 6, field1337 + "*", 255, 90);
			class34.method167(0, 0, 479, 77);
		} else {
			method445(0, class4.field51[field1358], 0, 0);
		}

		if (field1269 && field1298 == 2) {
			method492();
		}

		field1266.method261(22, field9, 375);
		field1265.method260();
		class35.field573 = field1149;
	}

	@ObfuscatedName("client.a(IILd;)I")
	public final int method506(int arg0, class4 arg1) {
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
					var4 += field1018[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1008[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1144[var3[var5++]];
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
					var4 += field1113[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1029[field1008[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1113[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1156.field418;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1008[var10];
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
					var4 += field1110;
				}

				if (var6 == 12) {
					var4 += field1267;
				}

				if (var6 == 13) {
					int var14 = field1113[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method507() {
		if (field1141 == 0) {
			int var1 = field18;
			if (field1025 == 1 && field19 >= 520 && field20 >= 165 && field19 <= 788 && field20 <= 230) {
				var1 = 0;
			}

			if (field1269) {
				if (var1 != 1) {
					int var2 = field16;
					int var3 = field17;
					if (field1298 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1298 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field1298 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field1299 - 10 || var2 > field1301 + field1299 + 10 || var3 < field1300 - 10 || var3 > field1302 + field1300 + 10) {
						field1269 = false;

						if (field1298 == 1) {
							field1355 = true;
						}

						if (field1298 == 2) {
							field1252 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1299;
					int var5 = field1300;
					int var6 = field1301;
					int var7 = field19;
					int var8 = field20;
					if (field1298 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1298 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field1298 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1332; var10++) {
						int var11 = (field1332 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method464(var9);
					}

					field1269 = false;

					if (field1298 == 1) {
						field1355 = true;
					}

					if (field1298 == 2) {
						field1252 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1332 > 0) {
					int var12 = field1216[field1332 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = field1214[field1332 - 1];
						int var14 = field1215[field1332 - 1];
						class4 var15 = class4.field51[var14];
						if (var15.field77) {
							field991 = false;
							field1177 = 0;
							field1139 = var14;
							field1140 = var13;
							field1141 = 2;
							field1142 = field19;
							field1143 = field20;

							if (class4.field51[var14].field57 == field1385) {
								field1141 = 1;
							}

							if (class4.field51[var14].field57 == field1331) {
								field1141 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1286 == 1 || method537(field1332 - 1)) && field1332 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1332 > 0) {
					method464(field1332 - 1);
				}

				if (var1 != 2 || field1332 <= 0) {
					return;
				}

				method475();
			}
		}
	}

	@ObfuscatedName("client.a(I[BZ)V")
	public final void method508(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.q(B)V")
	public final void method509() {
		if (field1156.field359 >> 7 == field1209 && field1156.field360 >> 7 == field1210) {
			field1209 = 0;
		}

		for (int var1 = -1; var1 < field1325; var1++) {
			class28 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1156;
				var3 = field1323 << 14;
			} else {
				var2 = field1324[field1326[var1]];
				var3 = field1326[var1] << 14;
			}

			if (var2 != null && var2.method124()) {
				var2.field431 = false;
				if ((field999 && field1325 > 50 || field1325 > 200) && var1 != -1 && var2.field383 == var2.field364) {
					var2.field431 = true;
				}

				int var4 = var2.field359 >> 7;
				int var5 = var2.field360 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field426 == null || field1131 < var2.field421 || field1131 >= var2.field422) {
						if ((var2.field359 & 0x7F) == 0x40 && (var2.field360 & 0x7F) == 0x40) {
							if (field1016[var4][var5] == field1179) {
								continue;
							}

							field1016[var4][var5] = field1179;
						}

						var2.field420 = method499(var2.field360, var2.field359, field1003);
						field1357.method73(var2.field359, var2.field361, var3, field1003, var2.field360, var2.field362, var2, 60, var2.field420);
					} else {
						var2.field431 = false;
						var2.field420 = method499(var2.field360, var2.field359, field1003);
						field1357.method74(var2, var2.field360, var2.field429, var2.field427, var2.field430, field1003, var2.field359, var2.field420, var3, var2.field361, 60, var2.field428);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method510(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field995[var4] != null) {
				int var5 = field993[var4];
				int var6 = field1247 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1290 == 0 || field1290 == 1 && method454(field994[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !field994[var4].equals(field1156.field412)) {
						if (field1283) {
							field1277[field1332] = "Report abuse @whi@" + field994[var4];
							field1216[field1332] = 34;
							field1332++;
						}

						field1277[field1332] = "Add ignore @whi@" + field994[var4];
						field1216[field1332] = 436;
						field1332++;
						field1277[field1332] = "Add friend @whi@" + field994[var4];
						field1216[field1332] = 406;
						field1332++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1133 == 0 && (var5 == 7 || field1276 == 0 || field1276 == 1 && method454(field994[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1283) {
							field1277[field1332] = "Report abuse @whi@" + field994[var4];
							field1216[field1332] = 34;
							field1332++;
						}

						field1277[field1332] = "Add ignore @whi@" + field994[var4];
						field1216[field1332] = 436;
						field1332++;
						field1277[field1332] = "Add friend @whi@" + field994[var4];
						field1216[field1332] = 406;
						field1332++;
					}

					var3++;
				}

				if (var5 == 4 && (field1057 == 0 || field1057 == 1 && method454(field994[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1277[field1332] = "Accept trade @whi@" + field994[var4];
						field1216[field1332] = 903;
						field1332++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1133 == 0 && field1276 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1057 == 0 || field1057 == 1 && method454(field994[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1277[field1332] = "Accept duel @whi@" + field994[var4];
						field1216[field1332] = 363;
						field1332++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZILmb;)V")
	public final void method511(int arg0, class39 arg1) {
		while (arg1.field612 + 10 < arg0 * 8) {
			int var3 = arg1.method242(11);
			if (var3 == 2047) {
				break;
			}

			if (field1324[var3] == null) {
				field1324[var3] = new class28();
				if (field1329[var3] != null) {
					field1324[var3].method126(field1329[var3]);
				}
			}

			field1326[field1325++] = var3;
			class28 var4 = field1324[var3];
			var4.field403 = field1131;
			int var5 = arg1.method242(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method242(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method242(1);
			var4.method122(var7 == 1, field1156.field408[0] + var6, field1156.field407[0] + var5);
			int var8 = arg1.method242(1);
			if (var8 == 1) {
				field1328[field1327++] = var3;
			}
		}

		arg1.method243();
	}

	@ObfuscatedName("client.y(I)Z")
	public final boolean method512() {
		if (field1108 == null) {
			return false;
		}

		try {
			int var1 = field1108.method39();
			if (var1 == 0) {
				return false;
			}

			if (field1374 == -1) {
				field1108.method40(field1260.field610, 0, 1);
				field1374 = field1260.field610[0] & 0xFF;
				if (field1348 != null) {
					field1374 = field1374 - field1348.method291() & 0xFF;
				}

				field1373 = class60.field906[field1374];
				var1--;
			}

			if (field1373 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1108.method40(field1260.field610, 0, 1);
				field1373 = field1260.field610[0] & 0xFF;
				var1--;
			}

			if (field1373 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1108.method40(field1260.field610, 0, 2);
				field1260.field611 = 0;
				field1373 = field1260.method233();
				var1 -= 2;
			}

			if (var1 < field1373) {
				return false;
			}

			field1260.field611 = 0;
			field1108.method40(field1260.field610, 0, field1373);
			field1375 = 0;
			field1280 = field1279;
			field1279 = field1278;
			field1278 = field1374;

			if (field1374 == 11) {
				field1130 = field1260.method233() * 30;
				field1374 = -1;
				return true;
			}

			if (field1374 == 64) {
				field1293 = field1373 / 8;
				for (int var2 = 0; var2 < field1293; var2++) {
					field1022[var2] = field1260.method237();
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 18) {
				method418();
				field1374 = -1;
				return false;
			}

			if (field1374 == 120) {
				int var3 = field1260.method233();
				int var4 = field1260.method233();
				int var5 = var4 >> 10 & 0x1F;
				int var6 = var4 >> 5 & 0x1F;
				int var7 = var4 & 0x1F;
				class4.field51[var3].field92 = (var7 << 3) + (var5 << 19) + (var6 << 11);
				field1374 = -1;
				return true;
			}

			if (field1374 == 115) {
				if (field1228 != -1) {
					field1228 = -1;
					field1355 = true;
					field1012 = true;
				}

				if (field1331 != -1) {
					field1331 = -1;
					field1252 = true;
				}

				if (field1314) {
					field1314 = false;
					field1252 = true;
				}

				field1385 = -1;
				field1035 = false;
				field1374 = -1;
				return true;
			}

			if (field1374 == 135) {
				int var8 = field1260.method233();
				byte var9 = field1260.method232();
				field1359[var8] = var9;

				if (field1113[var8] != var9) {
					field1113[var8] = var9;
					method451(var8);
					field1355 = true;

					if (field1358 != -1) {
						field1252 = true;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 211) {
				int var10 = field1260.method233();
				int var11 = field1260.method233();
				class4.field51[var10].field97 = 1;
				class4.field51[var10].field98 = var11;
				field1374 = -1;
				return true;
			}

			if (field1374 == 78) {
				int var12 = field1260.method233();
				int var13 = field1260.method233();
				int var14 = field1260.method233();
				class59 var15 = class59.method335(var13);
				class4.field51[var12].field97 = 4;
				class4.field51[var12].field98 = var13;
				class4.field51[var12].field104 = var15.field876;
				class4.field51[var12].field105 = var15.field877;
				class4.field51[var12].field103 = var15.field875 * 100 / var14;
				field1374 = -1;
				return true;
			}

			if (field1374 == 46) {
				int var16 = field1260.method233();
				method443(var16);

				if (field1228 != -1) {
					field1228 = -1;
					field1355 = true;
					field1012 = true;
				}

				field1331 = var16;
				field1252 = true;
				field1385 = -1;
				field1035 = false;
				field1374 = -1;
				return true;
			}

			if (field1374 == 8) {
				field1262 = false;

				for (int var17 = 0; var17 < 5; var17++) {
					field1038[var17] = false;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 35) {
				field1290 = field1260.method231();
				field1276 = field1260.method231();
				field1057 = field1260.method231();
				field1175 = true;
				field1252 = true;
				field1374 = -1;
				return true;
			}

			if (field1374 == 3) {
				int var18 = field1260.method233();
				int var19 = field1260.method233();
				if (field1248 == var18 && field1249 == var19 && field1045 == 2) {
					field1374 = -1;
					return true;
				}

				field1248 = var18;
				field1249 = var19;
				field1317 = (field1248 - 6) * 8;
				field1318 = (field1249 - 6) * 8;
				field1294 = false;
				if ((field1248 / 8 == 48 || field1248 / 8 == 49) && field1249 / 8 == 48) {
					field1294 = true;
				}

				if (field1248 / 8 == 48 && field1249 / 8 == 148) {
					field1294 = true;
				}

				field1045 = 1;
				field1265.method260();
				field1158.method206("Loading - please wait.", 257, 151, 0);
				field1158.method206("Loading - please wait.", 256, 150, 0xFFFFFF);
				field1265.method261(8, field9, 11);
				int var20 = 0;
				for (int var21 = (field1248 - 6) / 8; var21 <= (field1248 + 6) / 8; var21++) {
					for (int var22 = (field1249 - 6) / 8; var22 <= (field1249 + 6) / 8; var22++) {
						var20++;
					}
				}

				field1351 = new byte[var20][];
				field1234 = new byte[var20][];
				field1333 = new int[var20];
				field1334 = new int[var20];
				field1335 = new int[var20];
				int var23 = 0;
				for (int var24 = (field1248 - 6) / 8; var24 <= (field1248 + 6) / 8; var24++) {
					for (int var25 = (field1249 - 6) / 8; var25 <= (field1249 + 6) / 8; var25++) {
						field1333[var23] = (var24 << 8) + var25;

						if (field1294 && (var25 == 49 || var25 == 149 || var25 == 147 || var24 == 50 || var24 == 49 && var25 == 47)) {
							field1334[var23] = -1;
							field1335[var23] = -1;
							var23++;
						} else {
							int var26 = field1334[var23] = field1105.method276(var24, var25, 0);
							if (var26 != -1) {
								field1105.method279(3, var26);
							}

							int var27 = field1335[var23] = field1105.method276(var24, var25, 1);
							if (var27 != -1) {
								field1105.method279(3, var27);
							}

							var23++;
						}
					}
				}

				int var28 = field1317 - field1319;
				int var29 = field1318 - field1320;
				field1319 = field1317;
				field1320 = field1318;

				for (int var30 = 0; var30 < 8192; var30++) {
					class27 var31 = field1077[var30];
					if (var31 != null) {
						for (int var32 = 0; var32 < 10; var32++) {
							var31.field407[var32] -= var28;
							var31.field408[var32] -= var29;
						}

						var31.field359 -= var28 * 128;
						var31.field360 -= var29 * 128;
					}
				}

				for (int var33 = 0; var33 < field1322; var33++) {
					class28 var34 = field1324[var33];
					if (var34 != null) {
						for (int var35 = 0; var35 < 10; var35++) {
							var34.field407[var35] -= var28;
							var34.field408[var35] -= var29;
						}

						var34.field359 -= var28 * 128;
						var34.field360 -= var29 * 128;
					}
				}

				byte var36 = 0;
				byte var37 = 104;
				byte var38 = 1;
				if (var28 < 0) {
					var36 = 103;
					var37 = -1;
					var38 = -1;
				}

				byte var39 = 0;
				byte var40 = 104;
				byte var41 = 1;
				if (var29 < 0) {
					var39 = 103;
					var40 = -1;
					var41 = -1;
				}

				for (int var42 = var36; var42 != var37; var42 += var38) {
					for (int var43 = var39; var43 != var40; var43 += var41) {
						int var44 = var28 + var42;
						int var45 = var29 + var43;
						for (int var46 = 0; var46 < 4; var46++) {
							if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
								field1168[var46][var42][var43] = field1168[var46][var44][var45];
							} else {
								field1168[var46][var42][var43] = null;
							}
						}
					}
				}

				for (class41 var47 = (class41) field1015.method250(); var47 != null; var47 = (class41) field1015.method252()) {
					var47.field629 -= var28;
					var47.field630 -= var29;
					if (var47.field629 < 0 || var47.field630 < 0 || var47.field629 >= 104 || var47.field630 >= 104) {
						var47.method118();
					}
				}

				if (field1209 != 0) {
					field1209 -= var28;
					field1210 -= var29;
				}

				field1262 = false;
				field1374 = -1;
				return true;
			}

			if (field1374 == 25) {
				class6.method43();
				field1374 = -1;
				return true;
			}

			if (field1374 == 94) {
				field1250 = field1260.method231();
				if (field1366 == field1250) {
					if (field1250 == 3) {
						field1366 = 1;
					} else {
						field1366 = 3;
					}

					field1355 = true;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 246 || field1374 == 248 || field1374 == 131 || field1374 == 215 || field1374 == 67 || field1374 == 247 || field1374 == 167 || field1374 == 230 || field1374 == 31 || field1374 == 112) {
				method427(field1374, field1260);
				field1374 = -1;
				return true;
			}

			if (field1374 == 146) {
				int var48 = field1260.method233();
				int var49 = field1260.method233();
				class4.field51[var48].field97 = 2;
				class4.field51[var48].field98 = var49;
				field1374 = -1;
				return true;
			}

			if (field1374 == 159) {
				field1355 = true;
				int var50 = field1260.method231();
				int var51 = field1260.method236();
				int var52 = field1260.method231();
				field1144[var50] = var51;
				field1018[var50] = var52;
				field1008[var50] = 1;
				for (int var53 = 0; var53 < 98; var53++) {
					if (var51 >= field1029[var53]) {
						field1008[var50] = var53 + 2;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 15) {
				int var54 = field1260.method233();
				int var55 = field1260.method231();

				if (var54 == 0xFFFF) {
					var54 = -1;
				}

				field1207[var55] = var54;
				field1355 = true;
				field1012 = true;
				field1374 = -1;
				return true;
			}

			if (field1374 == 202) {
				field1262 = true;
				field1080 = field1260.method231();
				field1081 = field1260.method231();
				field1082 = field1260.method233();
				field1083 = field1260.method231();
				field1084 = field1260.method231();
				if (field1084 >= 100) {
					field1066 = field1080 * 128 + 64;
					field1068 = field1081 * 128 + 64;
					field1067 = method499(field1081, field1080, field1003) - field1082;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 107) {
				int var56 = field1260.method233();
				method443(var56);

				if (field1331 != -1) {
					field1331 = -1;
					field1252 = true;
				}

				if (field1314) {
					field1314 = false;
					field1252 = true;
				}

				field1228 = var56;
				field1355 = true;
				field1012 = true;
				field1385 = -1;
				field1035 = false;
				field1374 = -1;
				return true;
			}

			if (field1374 == 250) {
				field1270 = field1260.method231();
				field1271 = field1260.method231();

				while (field1260.field611 < field1373) {
					int var57 = field1260.method231();
					method427(var57, field1260);
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 2) {
				long var58 = field1260.method237();
				int var60 = field1260.method231();
				String var61 = class52.method300(class52.method297(var58));
				for (int var62 = 0; var62 < field1097; var62++) {
					if (field1183[var62] == var58) {
						if (field1112[var62] != var60) {
							field1112[var62] = var60;
							field1355 = true;

							if (var60 > 0) {
								method458(var61 + " has logged in.", 5, "");
							}

							if (var60 == 0) {
								method458(var61 + " has logged out.", 5, "");
							}
						}

						var61 = null;
						break;
					}
				}

				if (var61 != null && field1097 < 100) {
					field1183[field1097] = var58;
					field1001[field1097] = var61;
					field1112[field1097] = var60;
					field1097++;
					field1355 = true;
				}

				boolean var63 = false;
				while (!var63) {
					var63 = true;
					for (int var64 = 0; var64 < field1097 - 1; var64++) {
						if (field1112[var64] != field996 && field1112[var64 + 1] == field996 || field1112[var64] == 0 && field1112[var64 + 1] != 0) {
							int var65 = field1112[var64];
							field1112[var64] = field1112[var64 + 1];
							field1112[var64 + 1] = var65;
							String var66 = field1001[var64];
							field1001[var64] = field1001[var64 + 1];
							field1001[var64 + 1] = var66;
							long var67 = field1183[var64];
							field1183[var64] = field1183[var64 + 1];
							field1183[var64 + 1] = var67;
							field1355 = true;
							var63 = false;
						}
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 130) {
				method415(field1373, field1260);
				field1374 = -1;
				return true;
			}

			if (field1374 == 13) {
				field1366 = field1260.method231();
				field1355 = true;
				field1012 = true;
				field1374 = -1;
				return true;
			}

			if (field1374 == 173) {
				int var69 = field1260.method233();
				boolean var70 = field1260.method231() == 1;
				class4.field51[var69].field71 = var70;
				field1374 = -1;
				return true;
			}

			if (field1374 == 65) {
				field1209 = 0;
				field1374 = -1;
				return true;
			}

			if (field1374 == 153) {
				for (int var71 = 0; var71 < field1324.length; var71++) {
					if (field1324[var71] != null) {
						field1324[var71].field386 = -1;
					}
				}

				for (int var72 = 0; var72 < field1077.length; var72++) {
					if (field1077[var72] != null) {
						field1077[var72].field386 = -1;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 22) {
				field1186 = false;
				field1314 = true;
				field1145 = "";
				field1252 = true;
				field1374 = -1;
				return true;
			}

			if (field1374 == 186) {
				if (field1366 == 12) {
					field1355 = true;
				}

				field1110 = field1260.method231();
				field1374 = -1;
				return true;
			}

			if (field1374 == 182) {
				field1355 = true;
				int var73 = field1260.method233();
				class4 var74 = class4.field51[var73];
				while (field1260.field611 < field1373) {
					int var75 = field1260.method231();
					int var76 = field1260.method233();
					int var77 = field1260.method231();
					if (var77 == 255) {
						var77 = field1260.method236();
					}

					if (var75 >= 0 && var75 < var74.field52.length) {
						var74.field52[var75] = var76;
						var74.field53[var75] = var77;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 200) {
				if (field1366 == 12) {
					field1355 = true;
				}

				field1267 = field1260.method234();
				field1374 = -1;
				return true;
			}

			if (field1374 == 21) {
				int var78 = field1260.method233();
				class4.field51[var78].field97 = 3;
				class4.field51[var78].field98 = (field1156.field416[8] << 6) + (field1156.field416[0] << 12) + (field1156.field417[0] << 24) + (field1156.field417[4] << 18) + field1156.field416[11];
				field1374 = -1;
				return true;
			}

			if (field1374 == 183) {
				int var79 = field1260.method233();
				int var80 = field1260.method233();
				class4.field51[var79].field101 = var80;
				field1374 = -1;
				return true;
			}

			if (field1374 == 140) {
				int var81 = field1260.method233();
				int var82 = field1260.method233();

				if (field1331 != -1) {
					field1331 = -1;
					field1252 = true;
				}

				if (field1314) {
					field1314 = false;
					field1252 = true;
				}

				field1385 = var81;
				field1228 = var82;
				field1355 = true;
				field1012 = true;
				field1035 = false;
				field1374 = -1;
				return true;
			}

			if (field1374 == 178) {
				int var83 = field1260.method233();
				if (var83 == 0xFFFF) {
					var83 = -1;
				}

				if (field1036 != var83 && field1235 && !field999) {
					field1039 = var83;
					field1040 = true;
					field1105.method279(2, field1039);
				}

				field1036 = var83;
				field1365 = 0;
				field1374 = -1;
				return true;
			}

			if (field1374 == 75) {
				int var84 = field1260.method233();
				int var85 = field1260.method233();
				if (field1235 && !field999) {
					field1039 = var84;
					field1040 = false;
					field1105.method279(2, field1039);
					field1365 = var85;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 157) {
				int var86 = field1260.method233();
				class4 var87 = class4.field51[var86];
				for (int var88 = 0; var88 < var87.field52.length; var88++) {
					var87.field52[var88] = -1;
					var87.field52[var88] = 0;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 155) {
				int var89 = field1260.method233();
				int var90 = field1260.method234();
				int var91 = field1260.method234();
				class4 var92 = class4.field51[var89];
				var92.field63 = var90;
				var92.field64 = var91;
				field1374 = -1;
				return true;
			}

			if (field1374 == 24) {
				field1205 = field1260.method236();
				field1338 = field1260.method233();
				field1206 = field1260.method231();
				field1305 = field1260.method233();

				if (field1205 != 0 && field1385 == -1) {
					signlink.dnslookup(class52.method299(field1205));
					method465();
					short var93 = 650;
					if (field1206 != 201) {
						var93 = 655;
					}

					field1336 = "";
					field1281 = false;

					for (int var94 = 0; var94 < class4.field51.length; var94++) {
						if (class4.field51[var94] != null && class4.field51[var94].field60 == var93) {
							field1385 = class4.field51[var94].field57;
							break;
						}
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 203) {
				field1355 = true;
				int var95 = field1260.method233();
				class4 var96 = class4.field51[var95];
				int var97 = field1260.method231();
				for (int var98 = 0; var98 < var97; var98++) {
					var96.field52[var98] = field1260.method233();
					int var99 = field1260.method231();
					if (var99 == 255) {
						var99 = field1260.method236();
					}

					var96.field53[var98] = var99;
				}

				for (int var100 = var97; var100 < var96.field52.length; var100++) {
					var96.field52[var100] = 0;
					var96.field53[var100] = 0;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 181) {
				int var101 = field1260.method233();
				int var102 = field1260.method236();
				field1359[var101] = var102;

				if (field1113[var101] != var102) {
					field1113[var101] = var102;
					method451(var101);
					field1355 = true;

					if (field1358 != -1) {
						field1252 = true;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 110) {
				class39 var103 = class6.method46();
				if (var103 != null) {
					field1321.method220(54);
					field1321.method222(var103.field611);
					field1321.method229(var103.field610, var103.field611, 0);
					var103.method219();
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 0) {
				field1262 = true;
				field1118 = field1260.method231();
				field1119 = field1260.method231();
				field1120 = field1260.method233();
				field1121 = field1260.method231();
				field1122 = field1260.method231();
				if (field1122 >= 100) {
					int var104 = field1118 * 128 + 64;
					int var105 = field1119 * 128 + 64;
					int var106 = method499(field1119, field1118, field1003) - field1120;
					int var107 = var104 - field1066;
					int var108 = var106 - field1067;
					int var109 = var105 - field1068;
					int var110 = (int) Math.sqrt(var107 * var107 + var109 * var109);
					field1069 = (int) (Math.atan2(var108, var110) * 325.949D) & 0x7FF;
					field1070 = (int) (Math.atan2(var107, var109) * -325.949D) & 0x7FF;

					if (field1069 < 128) {
						field1069 = 128;
					}

					if (field1069 > 383) {
						field1069 = 383;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 168) {
				int var111 = field1260.method234();
				field1358 = var111;
				field1252 = true;
				field1374 = -1;
				return true;
			}

			if (field1374 == 98) {
				int var112 = field1260.method233();
				String var113 = field1260.method238();
				class4.field51[var112].field90 = var113;

				if (field1207[field1366] == class4.field51[var112].field57) {
					field1355 = true;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 82) {
				long var114 = field1260.method237();
				int var116 = field1260.method236();
				int var117 = field1260.method231();
				boolean var118 = false;
				for (int var119 = 0; var119 < 100; var119++) {
					if (field1346[var119] == var116) {
						var118 = true;
						break;
					}
				}

				if (var117 <= 1) {
					for (int var120 = 0; var120 < field1293; var120++) {
						if (field1022[var120] == var114) {
							var118 = true;
							break;
						}
					}
				}

				if (!var118 && field1344 == 0) {
					try {
						field1346[field1311] = var116;
						field1311 = (field1311 + 1) % 100;
						String var121 = class53.method303(field1373 - 13, field1260);
						var121 = class68.method386(var121);
						if (var117 > 1) {
							method458(var121, 7, class52.method300(class52.method297(var114)));
						} else {
							method458(var121, 3, class52.method300(class52.method297(var114)));
						}
					} catch (Exception var149) {
						signlink.reporterror("cde1");
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 144) {
				field1270 = field1260.method231();
				field1271 = field1260.method231();
				for (int var123 = field1270; var123 < field1270 + 8; var123++) {
					for (int var124 = field1271; var124 < field1271 + 8; var124++) {
						if (field1168[field1003][var123][var124] != null) {
							field1168[field1003][var123][var124] = null;
							method424(var123, var124);
						}
					}
				}

				for (class41 var125 = (class41) field1015.method250(); var125 != null; var125 = (class41) field1015.method252()) {
					if (var125.field629 >= field1270 && var125.field629 < field1270 + 8 && var125.field630 >= field1271 && var125.field630 < field1271 + 8 && field1003 == var125.field627) {
						var125.field638 = 0;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 254) {
				method485(field1373, field1260);
				field1374 = -1;
				return true;
			}

			if (field1374 == 90) {
				field1270 = field1260.method231();
				field1271 = field1260.method231();
				field1374 = -1;
				return true;
			}

			if (field1374 == 96) {
				int var126 = field1260.method233();
				int var127 = field1260.method231();
				int var128 = field1260.method233();
				if (field1289 && !field999 && field1024 < 50) {
					field1208[field1024] = var126;
					field1306[field1024] = var127;
					field1007[field1024] = class55.field765[var126] + var128;
					field1024++;
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 36) {
				int var129 = field1260.method233();
				method443(var129);

				if (field1228 != -1) {
					field1228 = -1;
					field1355 = true;
					field1012 = true;
				}

				if (field1331 != -1) {
					field1331 = -1;
					field1252 = true;
				}

				if (field1314) {
					field1314 = false;
					field1252 = true;
				}

				field1385 = var129;
				field1035 = false;
				field1374 = -1;
				return true;
			}

			if (field1374 == 199) {
				field1316 = field1260.method231();
				field1374 = -1;
				return true;
			}

			if (field1374 == 118) {
				int var130 = field1260.method231();
				int var131 = field1260.method231();
				int var132 = field1260.method231();
				int var133 = field1260.method231();
				field1038[var130] = true;
				field1164[var130] = var131;
				field1259[var130] = var132;
				field1054[var130] = var133;
				field1167[var130] = 0;
				field1374 = -1;
				return true;
			}

			if (field1374 == 177) {
				String var134 = field1260.method238();
				if (var134.endsWith(":tradereq:")) {
					String var135 = var134.substring(0, var134.indexOf(":"));
					long var136 = class52.method296(var135);
					boolean var138 = false;
					for (int var139 = 0; var139 < field1293; var139++) {
						if (field1022[var139] == var136) {
							var138 = true;
							break;
						}
					}

					if (!var138 && field1344 == 0) {
						method458("wishes to trade with you.", 4, var135);
					}
				} else if (var134.endsWith(":duelreq:")) {
					String var140 = var134.substring(0, var134.indexOf(":"));
					long var141 = class52.method296(var140);
					boolean var143 = false;
					for (int var144 = 0; var144 < field1293; var144++) {
						if (field1022[var144] == var141) {
							var143 = true;
							break;
						}
					}

					if (!var143 && field1344 == 0) {
						method458("wishes to duel with you.", 8, var140);
					}
				} else {
					method458(var134, 0, "");
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 228) {
				field1254 = field1260.method231();
				if (field1254 == 1) {
					field1132 = field1260.method233();
				}

				if (field1254 >= 2 && field1254 <= 6) {
					if (field1254 == 2) {
						field1245 = 64;
						field1246 = 64;
					}

					if (field1254 == 3) {
						field1245 = 0;
						field1246 = 64;
					}

					if (field1254 == 4) {
						field1245 = 128;
						field1246 = 64;
					}

					if (field1254 == 5) {
						field1245 = 64;
						field1246 = 0;
					}

					if (field1254 == 6) {
						field1245 = 64;
						field1246 = 128;
					}

					field1254 = 2;
					field1242 = field1260.method233();
					field1243 = field1260.method233();
					field1244 = field1260.method231();
				}

				if (field1254 == 10) {
					field1020 = field1260.method233();
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 43) {
				for (int var145 = 0; var145 < field1113.length; var145++) {
					if (field1359[var145] != field1113[var145]) {
						field1113[var145] = field1359[var145];
						method451(var145);
						field1355 = true;
					}
				}

				field1374 = -1;
				return true;
			}

			if (field1374 == 27) {
				field1349 = field1260.method233();
				field1374 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1374 + "," + field1373 + " - " + field1279 + "," + field1280);
			method418();
		} catch (IOException var150) {
			method441();
		} catch (Exception var151) {
			String var147 = "T2 - " + field1374 + "," + field1279 + "," + field1280 + " - " + field1373 + "," + (field1156.field407[0] + field1317) + "," + (field1156.field408[0] + field1318) + " - ";
			for (int var148 = 0; var148 < field1373 && var148 < 50; var148++) {
				var147 = var147 + field1260.field610[var148] + ",";
			}

			signlink.reporterror(var147);
			method418();
		}

		return true;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method513(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method514() {
		if (field1332 >= 2 || field1048 != 0 || field1025 != 0) {
			String var1;
			if (field1048 == 1 && field1332 < 2) {
				var1 = "Use " + field1052 + " with...";
			} else if (field1025 == 1 && field1332 < 2) {
				var1 = field1028 + "...";
			} else {
				var1 = field1277[field1332 - 1];
			}

			if (field1332 > 2) {
				var1 = var1 + "@whi@ / " + (field1332 - 2) + " more options";
			}

			field1159.method212(0xFFFFFF, var1, field1131 / 1000, 4, 15, true);
		}
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method515(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1327; var3++) {
			int var4 = field1328[var3];
			class28 var5 = field1324[var4];
			int var6 = arg1.method231();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method231() << 8;
			}

			method491(var5, var4, arg1, var6);
		}
	}

	@ObfuscatedName("client.a(IIIIIILd;)V")
	public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, class4 arg5) {
		if (arg5.field58 == 0 && arg5.field72 != null && !arg5.field71 && (arg2 >= arg0 && arg3 >= arg1 && arg2 <= arg5.field61 + arg0 && arg3 <= arg5.field62 + arg1)) {
			int var7 = arg5.field72.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field73[var8] + arg0;
				int var10 = arg5.field74[var8] + arg1 - arg4;
				class4 var11 = class4.field51[arg5.field72[var8]];
				var9 += var11.field63;
				var10 += var11.field64;
				if ((var11.field68 >= 0 || var11.field94 != 0) && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field61 + var9 && arg3 < var11.field62 + var10) {
					if (var11.field68 >= 0) {
						field1146 = var11.field68;
					} else {
						field1146 = var11.field56;
					}
				}

				if (var11.field58 == 0) {
					method516(var9, var10, arg2, arg3, var11.field70, var11);

					if (var11.field69 > var11.field62) {
						method472(var11.field62, true, var11, var11.field61 + var9, arg3, var11.field69, var10, arg2);
					}
				} else {
					if (var11.field59 == 1 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field61 + var9 && arg3 < var11.field62 + var10) {
						boolean var12 = false;
						if (var11.field60 != 0) {
							var12 = method422(var11);
						}

						if (!var12) {
							field1277[field1332] = var11.field109;
							field1216[field1332] = 951;
							field1215[field1332] = var11.field56;
							field1332++;
						}
					}

					if (var11.field59 == 2 && field1025 == 0 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field61 + var9 && arg3 < var11.field62 + var10) {
						String var13 = var11.field106;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1277[field1332] = var13 + " @gre@" + var11.field107;
						field1216[field1332] = 930;
						field1215[field1332] = var11.field56;
						field1332++;
					}

					if (var11.field59 == 3 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field61 + var9 && arg3 < var11.field62 + var10) {
						field1277[field1332] = "Close";
						field1216[field1332] = 947;
						field1215[field1332] = var11.field56;
						field1332++;
					}

					if (var11.field59 == 4 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field61 + var9 && arg3 < var11.field62 + var10) {
						field1277[field1332] = var11.field109;
						field1216[field1332] = 465;
						field1215[field1332] = var11.field56;
						field1332++;
					}

					if (var11.field59 == 5 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field61 + var9 && arg3 < var11.field62 + var10) {
						field1277[field1332] = var11.field109;
						field1216[field1332] = 960;
						field1215[field1332] = var11.field56;
						field1332++;
					}

					if (var11.field59 == 6 && !field1035 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field61 + var9 && arg3 < var11.field62 + var10) {
						field1277[field1332] = var11.field109;
						field1216[field1332] = 44;
						field1215[field1332] = var11.field56;
						field1332++;
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

								if (arg2 >= var17 && arg3 >= var18 && arg2 < var17 + 32 && arg3 < var18 + 32) {
									field1272 = var14;
									field1273 = var11.field56;

									if (var11.field52[var14] > 0) {
										class59 var19 = class59.method335(var11.field52[var14] - 1);
										if (field1048 == 1 && var11.field78) {
											if (field1050 != var11.field56 || field1049 != var14) {
												field1277[field1332] = "Use " + field1052 + " with @lre@" + var19.field871;
												field1216[field1332] = 881;
												field1217[field1332] = var19.field869;
												field1214[field1332] = var14;
												field1215[field1332] = var11.field56;
												field1332++;
											}
										} else if (field1025 != 1 || !var11.field78) {
											if (var11.field78) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field886 != null && var19.field886[var20] != null) {
														field1277[field1332] = var19.field886[var20] + " @lre@" + var19.field871;

														if (var20 == 3) {
															field1216[field1332] = 478;
														}

														if (var20 == 4) {
															field1216[field1332] = 347;
														}

														field1217[field1332] = var19.field869;
														field1214[field1332] = var14;
														field1215[field1332] = var11.field56;
														field1332++;
													} else if (var20 == 4) {
														field1277[field1332] = "Drop @lre@" + var19.field871;
														field1216[field1332] = 347;
														field1217[field1332] = var19.field869;
														field1214[field1332] = var14;
														field1215[field1332] = var11.field56;
														field1332++;
													}
												}
											}

											if (var11.field79) {
												field1277[field1332] = "Use @lre@" + var19.field871;
												field1216[field1332] = 188;
												field1217[field1332] = var19.field869;
												field1214[field1332] = var14;
												field1215[field1332] = var11.field56;
												field1332++;
											}

											if (var11.field78 && var19.field886 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field886[var21] != null) {
														field1277[field1332] = var19.field886[var21] + " @lre@" + var19.field871;

														if (var21 == 0) {
															field1216[field1332] = 405;
														}

														if (var21 == 1) {
															field1216[field1332] = 38;
														}

														if (var21 == 2) {
															field1216[field1332] = 422;
														}

														field1217[field1332] = var19.field869;
														field1214[field1332] = var14;
														field1215[field1332] = var11.field56;
														field1332++;
													}
												}
											}

											if (var11.field85 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field85[var22] != null) {
														field1277[field1332] = var11.field85[var22] + " @lre@" + var19.field871;

														if (var22 == 0) {
															field1216[field1332] = 602;
														}

														if (var22 == 1) {
															field1216[field1332] = 596;
														}

														if (var22 == 2) {
															field1216[field1332] = 22;
														}

														if (var22 == 3) {
															field1216[field1332] = 892;
														}

														if (var22 == 4) {
															field1216[field1332] = 415;
														}

														field1217[field1332] = var19.field869;
														field1214[field1332] = var14;
														field1215[field1332] = var11.field56;
														field1332++;
													}
												}
											}

											field1277[field1332] = "Examine @lre@" + var19.field871;
											field1216[field1332] = 1773;
											field1217[field1332] = var19.field869;
											field1215[field1332] = var11.field53[var14];
											field1332++;
										} else if ((field1027 & 0x10) == 0x10) {
											field1277[field1332] = field1028 + " @lre@" + var19.field871;
											field1216[field1332] = 391;
											field1217[field1332] = var19.field869;
											field1214[field1332] = var14;
											field1215[field1332] = var11.field56;
											field1332++;
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

	@ObfuscatedName("client.c(JI)V")
	public final void method517(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1293; var3++) {
				if (field1022[var3] == arg0) {
					field1293--;
					field1355 = true;

					for (int var4 = var3; var4 < field1293; var4++) {
						field1022[var4] = field1022[var4 + 1];
					}

					field1321.method220(181);
					field1321.method227(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method518() {
		method417();

		if (field1258 == 1) {
			field1111[field1257 / 100].method190(field1255 - 8 - 8, field1256 - 8 - 11);
		}

		if (field1258 == 2) {
			field1111[field1257 / 100 + 4].method190(field1255 - 8 - 8, field1256 - 8 - 11);
		}

		if (field1385 != -1) {
			method432(field1176, field1385);
			method445(0, class4.field51[field1385], 0, 0);
		}

		method500();

		if (!field1269) {
			method476();
			method514();
		} else if (field1298 == 0) {
			method492();
		}

		if (field1316 == 1) {
			if (field1076 > 0 || field1304 == 1) {
				field1002[1].method190(472, 258);
			} else {
				field1002[1].method190(472, 296);
			}
		}

		if (field1076 > 0) {
			field1002[0].method190(472, 296);
			field1158.method206("Level: " + field1076, 484, 329, 0xFFFF00);
		}

		if (field1304 == 1) {
			field1002[6].method190(472, 296);
			field1158.method206("Arena", 484, 329, 0xFFFF00);
		}

		if (field1130 != 0) {
			int var1 = field1130 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1158.method209(4, "System update in: " + var2 + ":0" + var1, 0xFFFF00, 329);
			} else {
				field1158.method209(4, "System update in: " + var2 + ":" + var1, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method519() {
		int var1 = field1156.field359 + field1041;
		int var2 = field1156.field360 + field1137;
		if (field1161 - var1 < -500 || field1161 - var1 > 500 || field1162 - var2 < -500 || field1162 - var2 > 500) {
			field1161 = var1;
			field1162 = var2;
		}

		if (field1161 != var1) {
			field1161 += (var1 - field1161) / 16;
		}

		if (field1162 != var2) {
			field1162 += (var2 - field1162) / 16;
		}

		if (field21[1] == 1) {
			field1370 += (-field1370 - 24) / 2;
		} else if (field21[2] == 1) {
			field1370 += (24 - field1370) / 2;
		} else {
			field1370 /= 2;
		}

		if (field21[3] == 1) {
			field1371 += (12 - field1371) / 2;
		} else if (field21[4] == 1) {
			field1371 += (-field1371 - 12) / 2;
		} else {
			field1371 /= 2;
		}

		field1369 = field1370 / 2 + field1369 & 0x7FF;
		field1368 += field1371 / 2;
		if (field1368 < 128) {
			field1368 = 128;
		}

		if (field1368 > 383) {
			field1368 = 383;
		}

		int var3 = field1161 >> 7;
		int var4 = field1162 >> 7;
		int var5 = method499(field1162, field1161, field1003);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1003;
					if (var9 < 3 && (field1354[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field1352[var9][var7][var8];
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

		if (var11 > field1180) {
			field1180 += (var11 - field1180) / 24;
		} else if (var11 < field1180) {
			field1180 += (var11 - field1180) / 80;
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method520(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.z(I)V")
	public final void method521() {
		for (int var1 = 0; var1 < field1078; var1++) {
			int var2 = field1079[var1];
			class27 var3 = field1077[var2];
			if (var3 != null) {
				method522(var3, var3.field411.field843);
			}
		}
	}

	@ObfuscatedName("client.a(Lz;IB)V")
	public final void method522(class26 arg0, int arg1) {
		if (arg0.field359 < 128 || arg0.field360 < 128 || arg0.field359 >= 13184 || arg0.field360 >= 13184) {
			arg0.field386 = -1;
			arg0.field391 = -1;
			arg0.field400 = 0;
			arg0.field401 = 0;
			arg0.field359 = arg0.field407[0] * 128 + arg0.field363 * 64;
			arg0.field360 = arg0.field408[0] * 128 + arg0.field363 * 64;
			arg0.field406 = 0;
		}

		if (field1156 == arg0 && (arg0.field359 < 1536 || arg0.field360 < 1536 || arg0.field359 >= 11776 || arg0.field360 >= 11776)) {
			arg0.field386 = -1;
			arg0.field391 = -1;
			arg0.field400 = 0;
			arg0.field401 = 0;
			arg0.field359 = arg0.field407[0] * 128 + arg0.field363 * 64;
			arg0.field360 = arg0.field408[0] * 128 + arg0.field363 * 64;
			arg0.field406 = 0;
		}

		if (arg0.field400 > field1131) {
			method523(arg0);
		} else if (arg0.field401 >= field1131) {
			method524(arg0);
		} else {
			method525(arg0);
		}

		method526(arg0);
		method527(arg0);
	}

	@ObfuscatedName("client.a(BLz;)V")
	public final void method523(class26 arg0) {
		int var2 = arg0.field400 - field1131;
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

	@ObfuscatedName("client.a(Lz;B)V")
	public final void method524(class26 arg0) {
		if (field1131 == arg0.field401 || arg0.field386 == -1 || arg0.field389 != 0 || arg0.field388 + 1 > class65.field943[arg0.field386].method369(arg0.field387)) {
			int var2 = arg0.field401 - arg0.field400;
			int var3 = field1131 - arg0.field400;
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

	@ObfuscatedName("client.b(BLz;)V")
	public final void method525(class26 arg0) {
		arg0.field383 = arg0.field364;
		if (arg0.field406 == 0) {
			arg0.field410 = 0;
		} else {
			if (arg0.field386 != -1 && arg0.field389 == 0) {
				class65 var2 = class65.field943[arg0.field386];
				if (var2.field949 == null) {
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

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method526(class26 arg0) {
		if (arg0.field380 != -1 && arg0.field380 < 32768) {
			class27 var2 = field1077[arg0.field380];
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
			if (field1349 == var5) {
				var5 = field1323;
			}

			class28 var6 = field1324[var5];
			if (var6 != null) {
				int var7 = arg0.field359 - var6.field359;
				int var8 = arg0.field360 - var6.field360;
				if (var7 != 0 || var8 != 0) {
					arg0.field405 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field381 != 0 || arg0.field382 != 0) && (arg0.field406 == 0 || arg0.field410 > 0)) {
			int var9 = arg0.field359 - (arg0.field381 - field1317 - field1317) * 64;
			int var10 = arg0.field360 - (arg0.field382 - field1318 - field1318) * 64;
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

	@ObfuscatedName("client.b(Lz;B)V")
	public final void method527(class26 arg0) {
		arg0.field362 = false;

		if (arg0.field383 != -1) {
			class65 var2 = class65.field943[arg0.field383];
			arg0.field385++;
			if (arg0.field384 < var2.field944 && arg0.field385 > var2.method369(arg0.field384)) {
				arg0.field385 = 0;
				arg0.field384++;
			}

			if (arg0.field384 >= var2.field944) {
				arg0.field385 = 0;
				arg0.field384 = 0;
			}
		}

		if (arg0.field386 != -1 && arg0.field389 == 0) {
			class65 var3 = class65.field943[arg0.field386];
			arg0.field388++;
			while (arg0.field387 < var3.field944 && arg0.field388 > var3.method369(arg0.field387)) {
				arg0.field388 -= var3.method369(arg0.field387);
				arg0.field387++;
			}

			if (arg0.field387 >= var3.field944) {
				arg0.field387 -= var3.field948;
				arg0.field390++;
				if (arg0.field390 >= var3.field954) {
					arg0.field386 = -1;
				}

				if (arg0.field387 < 0 || arg0.field387 >= var3.field944) {
					arg0.field386 = -1;
				}
			}

			arg0.field362 = var3.field950;
		}

		if (arg0.field389 > 0) {
			arg0.field389--;
		}

		if (arg0.field391 != -1 && field1131 >= arg0.field394) {
			if (arg0.field392 < 0) {
				arg0.field392 = 0;
			}

			class65 var4 = class66.field956[arg0.field391].field960;
			arg0.field393++;
			while (arg0.field392 < var4.field944 && arg0.field393 > var4.method369(arg0.field392)) {
				arg0.field393 -= var4.method369(arg0.field392);
				arg0.field392++;
			}

			if (arg0.field392 >= var4.field944) {
				if (arg0.field392 < 0 || arg0.field392 >= var4.field944) {
					arg0.field391 = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method528() {
		if (field1204) {
			field1204 = false;
			field1085.method261(0, field9, 11);
			field1086.method261(0, field9, 375);
			field1087.method261(729, field9, 5);
			field1088.method261(752, field9, 231);
			field1089.method261(0, field9, 0);
			field1090.method261(561, field9, 0);
			field1091.method261(520, field9, 11);
			field1092.method261(520, field9, 231);
			field1093.method261(501, field9, 375);
			field1094.method261(0, field9, 345);
			field1355 = true;
			field1252 = true;
			field1012 = true;
			field1175 = true;

			if (field1045 != 2) {
				field1265.method261(8, field9, 11);
				field1264.method261(561, field9, 5);
			}
		}

		if (field1045 == 2) {
			method486();
		}

		if (field1269 && field1298 == 1) {
			field1355 = true;
		}

		if (field1228 != -1) {
			boolean var1 = method432(field1176, field1228);
			if (var1) {
				field1355 = true;
			}
		}

		if (field1342 == 2) {
			field1355 = true;
		}

		if (field1141 == 2) {
			field1355 = true;
		}

		if (field1355) {
			method481();
			field1355 = false;
		}

		if (field1331 == -1) {
			field1116.field70 = field1288 - field1247 - 77;

			if (field16 > 453 && field16 < 565 && field17 > 350) {
				method472(77, false, field1116, 463, field17 - 375, field1288, 0, field16 - 22);
			}

			int var2 = field1288 - field1116.field70 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1288 - 77) {
				var2 = field1288 - 77;
			}

			if (field1247 != var2) {
				field1247 = var2;
				field1252 = true;
			}
		}

		if (field1331 != -1) {
			boolean var3 = method432(field1176, field1331);
			if (var3) {
				field1252 = true;
			}
		}

		if (field1342 == 3) {
			field1252 = true;
		}

		if (field1141 == 3) {
			field1252 = true;
		}

		if (field1253 != null) {
			field1252 = true;
		}

		if (field1269 && field1298 == 2) {
			field1252 = true;
		}

		if (field1252) {
			method505();
			field1252 = false;
		}

		if (field1045 == 2) {
			method474();
			field1264.method261(561, field9, 5);
		}

		if (field1250 != -1) {
			field1012 = true;
		}

		if (field1012) {
			if (field1250 != -1 && field1366 == field1250) {
				field1250 = -1;
				field1321.method220(48);
				field1321.method221(field1366);
			}

			field1012 = false;
			field1103.method260();
			field1154.method204(0, 0);

			if (field1228 == -1) {
				if (field1207[field1366] != -1) {
					if (field1366 == 0) {
						field1124.method204(29, 30);
					}

					if (field1366 == 1) {
						field1125.method204(59, 29);
					}

					if (field1366 == 2) {
						field1125.method204(87, 29);
					}

					if (field1366 == 3) {
						field1126.method204(115, 29);
					}

					if (field1366 == 4) {
						field1128.method204(156, 29);
					}

					if (field1366 == 5) {
						field1128.method204(184, 29);
					}

					if (field1366 == 6) {
						field1127.method204(212, 30);
					}
				}

				if (field1207[0] != -1 && (field1250 != 0 || field1131 % 20 < 10)) {
					field1356[0].method204(35, 34);
				}

				if (field1207[1] != -1 && (field1250 != 1 || field1131 % 20 < 10)) {
					field1356[1].method204(59, 32);
				}

				if (field1207[2] != -1 && (field1250 != 2 || field1131 % 20 < 10)) {
					field1356[2].method204(86, 32);
				}

				if (field1207[3] != -1 && (field1250 != 3 || field1131 % 20 < 10)) {
					field1356[3].method204(121, 33);
				}

				if (field1207[4] != -1 && (field1250 != 4 || field1131 % 20 < 10)) {
					field1356[4].method204(157, 34);
				}

				if (field1207[5] != -1 && (field1250 != 5 || field1131 % 20 < 10)) {
					field1356[5].method204(185, 32);
				}

				if (field1207[6] != -1 && (field1250 != 6 || field1131 % 20 < 10)) {
					field1356[6].method204(212, 34);
				}
			}

			field1103.method261(520, field9, 165);
			field1102.method260();
			field1153.method204(0, 0);

			if (field1228 == -1) {
				if (field1207[field1366] != -1) {
					if (field1366 == 7) {
						field1229.method204(49, 0);
					}

					if (field1366 == 8) {
						field1230.method204(81, 0);
					}

					if (field1366 == 9) {
						field1230.method204(108, 0);
					}

					if (field1366 == 10) {
						field1231.method204(136, 1);
					}

					if (field1366 == 11) {
						field1233.method204(178, 0);
					}

					if (field1366 == 12) {
						field1233.method204(205, 0);
					}

					if (field1366 == 13) {
						field1232.method204(233, 0);
					}
				}

				if (field1207[8] != -1 && (field1250 != 8 || field1131 % 20 < 10)) {
					field1356[7].method204(80, 2);
				}

				if (field1207[9] != -1 && (field1250 != 9 || field1131 % 20 < 10)) {
					field1356[8].method204(107, 3);
				}

				if (field1207[10] != -1 && (field1250 != 10 || field1131 % 20 < 10)) {
					field1356[9].method204(142, 4);
				}

				if (field1207[11] != -1 && (field1250 != 11 || field1131 % 20 < 10)) {
					field1356[10].method204(179, 2);
				}

				if (field1207[12] != -1 && (field1250 != 12 || field1131 % 20 < 10)) {
					field1356[11].method204(206, 2);
				}

				if (field1207[13] != -1 && (field1250 != 13 || field1131 % 20 < 10)) {
					field1356[12].method204(230, 2);
				}
			}

			field1102.method261(501, field9, 492);
			field1265.method260();
		}

		if (field1175) {
			field1175 = false;
			field1101.method260();
			field1152.method204(0, 0);
			field1158.method207(true, 33, "Public chat", 0xFFFFFF, 57);

			if (field1290 == 0) {
				field1158.method207(true, 46, "On", 0xFF00, 57);
			}

			if (field1290 == 1) {
				field1158.method207(true, 46, "Friends", 0xFFFF00, 57);
			}

			if (field1290 == 2) {
				field1158.method207(true, 46, "Off", 0xFF0000, 57);
			}

			if (field1290 == 3) {
				field1158.method207(true, 46, "Hide", 0xFFFF, 57);
			}

			field1158.method207(true, 33, "Private chat", 0xFFFFFF, 186);

			if (field1276 == 0) {
				field1158.method207(true, 46, "On", 0xFF00, 186);
			}

			if (field1276 == 1) {
				field1158.method207(true, 46, "Friends", 0xFFFF00, 186);
			}

			if (field1276 == 2) {
				field1158.method207(true, 46, "Off", 0xFF0000, 186);
			}

			field1158.method207(true, 33, "Trade/duel", 0xFFFFFF, 326);

			if (field1057 == 0) {
				field1158.method207(true, 46, "On", 0xFF00, 326);
			}

			if (field1057 == 1) {
				field1158.method207(true, 46, "Friends", 0xFFFF00, 326);
			}

			if (field1057 == 2) {
				field1158.method207(true, 46, "Off", 0xFF0000, 326);
			}

			field1158.method207(true, 38, "Report abuse", 0xFFFFFF, 462);
			field1101.method261(0, field9, 471);
			field1265.method260();
		}

		field1176 = 0;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method529() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1150[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1150[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1151[var10] = (field1150[var10 - 1] + field1150[var10 + 1] + field1150[var10 - 128] + field1150[var10 + 128]) / 4;
			}
		}

		field1099 += 128;
		if (field1099 > field1005.length) {
			field1099 -= field1005.length;
			int var11 = (int) (Math.random() * 12.0D);
			method435(field1372[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1151[var14 + 128] - field1005[field1099 + var14 & field1005.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1150[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1075[var16] = field1075[var16 + 1];
		}

		field1075[var1 - 1] = (int) (Math.sin(field1131 / 14.0D) * 16.0D + Math.sin(field1131 / 15.0D) * 14.0D + Math.sin(field1131 / 16.0D) * 12.0D);

		if (field1274 > 0) {
			field1274 -= 4;
		}

		if (field1275 > 0) {
			field1275 -= 4;
		}

		if (field1274 == 0 && field1275 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1274 = 1024;
			}

			if (var17 == 1) {
				field1275 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.s(B)V")
	public final void method530() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1385 != -1 && field1385 == field1023) {
				if (var1 == 8 && field1336.length() > 0) {
					field1336 = field1336.substring(0, field1336.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1336.length() < 12) {
					field1336 = field1336 + (char) var1;
				}
			} else if (field1186) {
				if (var1 >= 32 && var1 <= 122 && field1064.length() < 80) {
					field1064 = field1064 + (char) var1;
					field1252 = true;
				}

				if (var1 == 8 && field1064.length() > 0) {
					field1064 = field1064.substring(0, field1064.length() - 1);
					field1252 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1186 = false;
					field1252 = true;

					if (field1014 == 1) {
						long var2 = class52.method296(field1064);
						method456(var2);
					}

					if (field1014 == 2 && field1097 > 0) {
						long var4 = class52.method296(field1064);
						method467(var4);
					}

					if (field1014 == 3 && field1064.length() > 0) {
						field1321.method220(183);
						field1321.method221(0);
						int var6 = field1321.field611;
						field1321.method227(field1268);
						class53.method304(field1064, field1321);
						field1321.method230(field1321.field611 - var6);
						field1064 = class52.method301(field1064);
						field1064 = class68.method386(field1064);
						method458(field1064, 6, class52.method300(class52.method297(field1268)));

						if (field1276 == 2) {
							field1276 = 1;
							field1175 = true;
							field1321.method220(130);
							field1321.method221(field1290);
							field1321.method221(field1276);
							field1321.method221(field1057);
						}
					}

					if (field1014 == 4 && field1293 < 100) {
						long var7 = class52.method296(field1064);
						method433(var7);
					}

					if (field1014 == 5 && field1293 > 0) {
						long var9 = class52.method296(field1064);
						method517(var9);
					}
				}
			} else if (field1314) {
				if (var1 >= 48 && var1 <= 57 && field1145.length() < 10) {
					field1145 = field1145 + (char) var1;
					field1252 = true;
				}

				if (var1 == 8 && field1145.length() > 0) {
					field1145 = field1145.substring(0, field1145.length() - 1);
					field1252 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1145.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1145);
						} catch (Exception var15) {
						}

						field1321.method220(206);
						field1321.method225(var11);
					}

					field1314 = false;
					field1252 = true;
				}
			} else if (field1331 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1337.length() < 80) {
					field1337 = field1337 + (char) var1;
					field1252 = true;
				}

				if (var1 == 8 && field1337.length() > 0) {
					field1337 = field1337.substring(0, field1337.length() - 1);
					field1252 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1337.length() > 0) {
					if (field1337.equals("::clientdrop") && (field12 != null || method471().indexOf("192.168.1.") != -1)) {
						method441();
					} else if (field1337.equals("::lag")) {
						method497();
					} else if (field1337.startsWith("::")) {
						field1321.method220(91);
						field1321.method221(field1337.length() - 1);
						field1321.method228(field1337.substring(2));
					} else {
						byte var12 = 0;
						if (field1337.startsWith("yellow:")) {
							var12 = 0;
							field1337 = field1337.substring(7);
						}

						if (field1337.startsWith("red:")) {
							var12 = 1;
							field1337 = field1337.substring(4);
						}

						if (field1337.startsWith("green:")) {
							var12 = 2;
							field1337 = field1337.substring(6);
						}

						if (field1337.startsWith("cyan:")) {
							var12 = 3;
							field1337 = field1337.substring(5);
						}

						if (field1337.startsWith("purple:")) {
							var12 = 4;
							field1337 = field1337.substring(7);
						}

						if (field1337.startsWith("white:")) {
							var12 = 5;
							field1337 = field1337.substring(6);
						}

						if (field1337.startsWith("flash1:")) {
							var12 = 6;
							field1337 = field1337.substring(7);
						}

						if (field1337.startsWith("flash2:")) {
							var12 = 7;
							field1337 = field1337.substring(7);
						}

						if (field1337.startsWith("flash3:")) {
							var12 = 8;
							field1337 = field1337.substring(7);
						}

						if (field1337.startsWith("glow1:")) {
							var12 = 9;
							field1337 = field1337.substring(6);
						}

						if (field1337.startsWith("glow2:")) {
							var12 = 10;
							field1337 = field1337.substring(6);
						}

						if (field1337.startsWith("glow3:")) {
							var12 = 11;
							field1337 = field1337.substring(6);
						}

						byte var13 = 0;
						if (field1337.startsWith("wave:")) {
							var13 = 1;
							field1337 = field1337.substring(5);
						}

						if (field1337.startsWith("scroll:")) {
							var13 = 2;
							field1337 = field1337.substring(7);
						}

						field1321.method220(89);
						field1321.method221(0);
						int var14 = field1321.field611;
						field1321.method221(var12);
						field1321.method221(var13);
						class53.method304(field1337, field1321);
						field1321.method230(field1321.field611 - var14);
						field1337 = class52.method301(field1337);
						field1337 = class68.method386(field1337);
						field1156.field371 = field1337;
						field1156.field373 = var12;
						field1156.field374 = var13;
						field1156.field372 = 150;
						method458(field1156.field371, 2, field1156.field412);

						if (field1290 == 2) {
							field1290 = 3;
							field1175 = true;
							field1321.method220(130);
							field1321.method221(field1290);
							field1321.method221(field1276);
							field1321.method221(field1057);
						}
					}

					field1337 = "";
					field1252 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;Z)V")
	public final void method531(class4 arg0) {
		int var2 = arg0.field60;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1097) {
				arg0.field90 = "";
				arg0.field59 = 0;
			} else {
				arg0.field90 = field1001[var2];
				arg0.field59 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1097) {
				arg0.field90 = "";
				arg0.field59 = 0;
			} else {
				if (field1112[var2] == 0) {
					arg0.field90 = "@red@Offline";
				} else if (field1112[var2] == field996) {
					arg0.field90 = "@gre@World-" + (field1112[var2] - 9);
				} else {
					arg0.field90 = "@yel@World-" + (field1112[var2] - 9);
				}

				arg0.field59 = 1;
			}
		} else if (var2 == 203) {
			arg0.field69 = field1097 * 15 + 20;
			if (arg0.field69 <= arg0.field62) {
				arg0.field69 = arg0.field62 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1293) {
				arg0.field90 = "";
				arg0.field59 = 0;
			} else {
				arg0.field90 = class52.method300(class52.method297(field1022[var2]));
				arg0.field59 = 1;
			}
		} else if (var2 == 503) {
			arg0.field69 = field1293 * 15 + 20;
			if (arg0.field69 <= arg0.field62) {
				arg0.field69 = arg0.field62 + 1;
			}
		} else if (var2 == 327) {
			arg0.field104 = 150;
			arg0.field105 = (int) (Math.sin(field1131 / 40.0D) * 256.0D) & 0x7FF;

			if (field1363) {
				for (int var3 = 0; var3 < 7; var3++) {
					int var4 = field1361[var3];
					if (var4 >= 0 && !class63.field926[var4].method364()) {
						return;
					}
				}

				field1363 = false;
				class32[] var5 = new class32[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1361[var7];
					if (var8 >= 0) {
						var5[var6++] = class63.field926[var8].method365();
					}
				}

				class32 var9 = new class32(var6, var5);
				for (int var10 = 0; var10 < 5; var10++) {
					if (field1315[var10] != 0) {
						var9.method149(field1033[var10][0], field1033[var10][field1315[var10]]);

						if (var10 == 1) {
							var9.method149(field1115[0], field1115[field1315[var10]]);
						}
					}
				}

				var9.method142();
				var9.method143(class65.field943[field1156.field364].field945[0]);
				var9.method152(64, 850, -30, -50, -30, true);
				arg0.field97 = 5;
				arg0.field98 = 0;
				class4.method35(5, 0, var9);
			}
		} else if (var2 == 324) {
			if (field1169 == null) {
				field1169 = arg0.field95;
				field1170 = arg0.field96;
			}

			if (field1378) {
				arg0.field95 = field1170;
			} else {
				arg0.field95 = field1169;
			}
		} else if (var2 == 325) {
			if (field1169 == null) {
				field1169 = arg0.field95;
				field1170 = arg0.field96;
			}

			if (field1378) {
				arg0.field95 = field1169;
			} else {
				arg0.field95 = field1170;
			}
		} else if (var2 == 600) {
			arg0.field90 = field1336;
			if (field1131 % 20 < 10) {
				arg0.field90 = arg0.field90 + "|";
			} else {
				arg0.field90 = arg0.field90 + " ";
			}
		} else if (var2 == 613) {
			if (!field1283) {
				arg0.field90 = "";
			} else if (field1281) {
				arg0.field92 = 0xFF0000;
				arg0.field90 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field92 = 0xFFFFFF;
				arg0.field90 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1205 == 0) {
				arg0.field90 = "";
			} else {
				String var11;
				if (field1338 == 0) {
					var11 = "earlier today";
				} else if (field1338 == 1) {
					var11 = "yesterday";
				} else {
					var11 = field1338 + " days ago";
				}

				arg0.field90 = "You last logged in " + var11 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1305 == 0) {
				arg0.field90 = "0 unread messages";
				arg0.field92 = 0xFFFF00;
			}

			if (field1305 == 1) {
				arg0.field90 = "1 unread message";
				arg0.field92 = 0xFF00;
			}

			if (field1305 > 1) {
				arg0.field90 = field1305 + " unread messages";
				arg0.field92 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1206 == 201) {
				arg0.field90 = "";
			} else if (field1206 == 200) {
				arg0.field90 = "You have not yet set any password recovery questions.";
			} else {
				String var12;
				if (field1206 == 0) {
					var12 = "Earlier today";
				} else if (field1206 == 1) {
					var12 = "Yesterday";
				} else {
					var12 = field1206 + " days ago";
				}

				arg0.field90 = var12 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1206 == 201) {
				arg0.field90 = "";
			} else if (field1206 == 200) {
				arg0.field90 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field90 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1206 == 201) {
				arg0.field90 = "";
			} else if (field1206 == 200) {
				arg0.field90 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field90 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.t(B)V")
	public final void method532() {
		if (field1048 == 0 && field1025 == 0) {
			field1277[field1332] = "Walk here";
			field1216[field1332] = 660;
			field1214[field1332] = field16;
			field1215[field1332] = field17;
			field1332++;
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

				if (var6 == 2 && field1357.method92(field1003, var4, var5, var3) >= 0) {
					class57 var8 = class57.method320(var7);
					if (field1048 == 1) {
						field1277[field1332] = "Use " + field1052 + " with @cya@" + var8.field803;
						field1216[field1332] = 450;
						field1217[field1332] = var3;
						field1214[field1332] = var4;
						field1215[field1332] = var5;
						field1332++;
					} else if (field1025 != 1) {
						if (var8.field819 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field819[var9] != null) {
									field1277[field1332] = var8.field819[var9] + " @cya@" + var8.field803;

									if (var9 == 0) {
										field1216[field1332] = 285;
									}

									if (var9 == 1) {
										field1216[field1332] = 504;
									}

									if (var9 == 2) {
										field1216[field1332] = 364;
									}

									if (var9 == 3) {
										field1216[field1332] = 581;
									}

									if (var9 == 4) {
										field1216[field1332] = 1501;
									}

									field1217[field1332] = var3;
									field1214[field1332] = var4;
									field1215[field1332] = var5;
									field1332++;
								}
							}
						}

						field1277[field1332] = "Examine @cya@" + var8.field803;
						field1216[field1332] = 1175;
						field1217[field1332] = var3;
						field1214[field1332] = var4;
						field1215[field1332] = var5;
						field1332++;
					} else if ((field1027 & 0x4) == 4) {
						field1277[field1332] = field1028 + " @cya@" + var8.field803;
						field1216[field1332] = 55;
						field1217[field1332] = var3;
						field1214[field1332] = var4;
						field1215[field1332] = var5;
						field1332++;
					}
				}

				if (var6 == 1) {
					class27 var10 = field1077[var7];
					if (var10.field411.field843 == 1 && (var10.field359 & 0x7F) == 0x40 && (var10.field360 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1078; var11++) {
							class27 var12 = field1077[field1079[var11]];
							if (var12 != null && var10 != var12 && var12.field411.field843 == 1 && var10.field359 == var12.field359 && var10.field360 == var12.field360) {
								method479(var4, field1079[var11], var5, var12.field411);
							}
						}
					}

					method479(var4, var7, var5, var10.field411);
				}

				if (var6 == 0) {
					class28 var13 = field1324[var7];
					if ((var13.field359 & 0x7F) == 0x40 && (var13.field360 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1078; var14++) {
							class27 var15 = field1077[field1079[var14]];
							if (var15 != null && var15.field411.field843 == 1 && var13.field359 == var15.field359 && var13.field360 == var15.field360) {
								method479(var4, field1079[var14], var5, var15.field411);
							}
						}

						for (int var16 = 0; var16 < field1325; var16++) {
							class28 var17 = field1324[field1326[var16]];
							if (var17 != null && var13 != var17 && var13.field359 == var17.field359 && var13.field360 == var17.field360) {
								method425(var4, var17, field1326[var16], var5);
							}
						}
					}

					method425(var4, var13, var7, var5);
				}

				if (var6 == 3) {
					class42 var18 = field1168[field1003][var4][var5];
					if (var18 != null) {
						for (class30 var19 = (class30) var18.method251(); var19 != null; var19 = (class30) var18.method253()) {
							class59 var20 = class59.method335(var19.field444);
							if (field1048 == 1) {
								field1277[field1332] = "Use " + field1052 + " with @lre@" + var20.field871;
								field1216[field1332] = 217;
								field1217[field1332] = var19.field444;
								field1214[field1332] = var4;
								field1215[field1332] = var5;
								field1332++;
							} else if (field1025 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field885 != null && var20.field885[var21] != null) {
										field1277[field1332] = var20.field885[var21] + " @lre@" + var20.field871;

										if (var21 == 0) {
											field1216[field1332] = 224;
										}

										if (var21 == 1) {
											field1216[field1332] = 993;
										}

										if (var21 == 2) {
											field1216[field1332] = 99;
										}

										if (var21 == 3) {
											field1216[field1332] = 746;
										}

										if (var21 == 4) {
											field1216[field1332] = 877;
										}

										field1217[field1332] = var19.field444;
										field1214[field1332] = var4;
										field1215[field1332] = var5;
										field1332++;
									} else if (var21 == 2) {
										field1277[field1332] = "Take @lre@" + var20.field871;
										field1216[field1332] = 99;
										field1217[field1332] = var19.field444;
										field1214[field1332] = var4;
										field1215[field1332] = var5;
										field1332++;
									}
								}

								field1277[field1332] = "Examine @lre@" + var20.field871;
								field1216[field1332] = 1102;
								field1217[field1332] = var19.field444;
								field1214[field1332] = var4;
								field1215[field1332] = var5;
								field1332++;
							} else if ((field1027 & 0x1) == 1) {
								field1277[field1332] = field1028 + " @lre@" + var20.field871;
								field1216[field1332] = 965;
								field1217[field1332] = var19.field444;
								field1214[field1332] = var4;
								field1215[field1332] = var5;
								field1332++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method533(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method534(int arg0) {
		int[] var2 = field1211.field585;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1354[arg0][var7][var5] & 0x18) == 0) {
					field1357.method97(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1354[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1357.method97(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1211.method186();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1354[arg0][var11][var10] & 0x18) == 0) {
					method440(var8, var11, arg0, var9, var10);
				}

				if (arg0 < 3 && (field1354[arg0 + 1][var11][var10] & 0x8) != 0) {
					method440(var8, var11, arg0 + 1, var9, var10);
				}
			}
		}

		field1265.method260();
		field1061 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1357.method91(field1003, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method320(var14).field821;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1303[field1003].field911;
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

						field1058[field1061] = field1213[var15];
						field1062[field1061] = var16;
						field1063[field1061] = var17;
						field1061++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method535() {
		byte[] var1 = field1343.method295("title.dat", null);
		class36 var2 = new class36(var1, this);
		field1197.method260();
		var2.method188(0, 0);
		field1198.method260();
		var2.method188(-661, 0);
		field1194.method260();
		var2.method188(-128, 0);
		field1195.method260();
		var2.method188(-214, -386);
		field1196.method260();
		var2.method188(-214, -186);
		field1199.method260();
		var2.method188(0, -265);
		field1200.method260();
		var2.method188(-574, -265);
		field1201.method260();
		var2.method188(-128, -186);
		field1202.method260();
		var2.method188(-574, -186);
		int[] var3 = new int[var2.field586];
		for (int var4 = 0; var4 < var2.field587; var4++) {
			for (int var5 = 0; var5 < var2.field586; var5++) {
				var3[var5] = var2.field585[var2.field586 * var4 + var2.field586 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field586; var6++) {
				var2.field585[var2.field586 * var4 + var6] = var3[var6];
			}
		}

		field1197.method260();
		var2.method188(394, 0);
		field1198.method260();
		var2.method188(-267, 0);
		field1194.method260();
		var2.method188(266, 0);
		field1195.method260();
		var2.method188(180, -386);
		field1196.method260();
		var2.method188(180, -186);
		field1199.method260();
		var2.method188(394, -265);
		field1200.method260();
		var2.method188(-180, -265);
		field1201.method260();
		var2.method188(212, -186);
		field1202.method260();
		var2.method188(-180, -186);
		class36 var7 = new class36(field1343, "logo", 0);
		field1194.method260();
		var7.method190(field7 / 2 - var7.field586 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.D(I)V")
	public final void method536() {
		for (class31 var1 = (class31) field1096.method250(); var1 != null; var1 = (class31) field1096.method252()) {
			if (field1003 != var1.field447 || field1131 > var1.field453) {
				var1.method118();
			} else if (field1131 >= var1.field452) {
				if (var1.field456 > 0) {
					class27 var2 = field1077[var1.field456 - 1];
					if (var2 != null) {
						var1.method129(var2.field359, field1131, method499(var2.field360, var2.field359, var1.field447) - var1.field451, var2.field360);
					}
				}

				if (var1.field456 < 0) {
					int var3 = -var1.field456 - 1;
					class28 var4;
					if (field1349 == var3) {
						var4 = field1156;
					} else {
						var4 = field1324[var3];
					}

					if (var4 != null) {
						var1.method129(var4.field359, field1131, method499(var4.field360, var4.field359, var1.field447) - var1.field451, var4.field360);
					}
				}

				var1.method130(field1176);
				field1357.method73((int) var1.field458, var1.field466, -1, field1003, (int) var1.field459, false, var1, 60, (int) var1.field460);
			}
		}
	}

	@ObfuscatedName("client.a(BI)Z")
	public final boolean method537(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1216[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method538() {
		if (field1266 == null) {
			method461();
			field10 = null;
			field1194 = null;
			field1195 = null;
			field1196 = null;
			field1197 = null;
			field1198 = null;
			field1199 = null;
			field1200 = null;
			field1201 = null;
			field1202 = null;
			field1266 = new class44(method11(), 479, 96);
			field1264 = new class44(method11(), 168, 160);
			class34.method164();
			field1191.method204(0, 0);
			field1263 = new class44(method11(), 190, 261);
			field1265 = new class44(method11(), 512, 334);
			class34.method164();
			field1101 = new class44(method11(), 501, 61);
			field1102 = new class44(method11(), 288, 40);
			field1103 = new class44(method11(), 269, 66);
			field1204 = true;
		}
	}

	@ObfuscatedName("client.u(B)I")
	public final int method539() {
		int var1 = 3;
		if (field1069 < 310) {
			int var2 = field1066 >> 7;
			int var3 = field1068 >> 7;
			int var4 = field1156.field359 >> 7;
			int var5 = field1156.field360 >> 7;

			if ((field1354[field1003][var2][var3] & 0x4) != 0) {
				var1 = field1003;
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

					if ((field1354[field1003][var2][var3] & 0x4) != 0) {
						var1 = field1003;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1354[field1003][var2][var3] & 0x4) != 0) {
							var1 = field1003;
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

					if ((field1354[field1003][var2][var3] & 0x4) != 0) {
						var1 = field1003;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1354[field1003][var2][var3] & 0x4) != 0) {
							var1 = field1003;
						}
					}
				}
			}
		}

		if ((field1354[field1003][field1156.field359 >> 7][field1156.field360 >> 7] & 0x4) != 0) {
			var1 = field1003;
		}

		return var1;
	}

	@ObfuscatedName("client.F(I)I")
	public final int method540() {
		int var1 = method499(field1068, field1066, field1003);
		if (var1 - field1067 < 800 && (field1354[field1003][field1066 >> 7][field1068 >> 7] & 0x4) != 0) {
			return field1003;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		method493();

		if (field1343 == null) {
			super.method13(arg0, arg1);
		} else {
			field1196.method260();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1159.method206("RuneScape is loading - please wait...", var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class34.method166(var6, 34, var3 / 2 - 152, 304, 0x8C1111);
			class34.method166(var6 + 1, 32, var3 / 2 - 151, 302, 0);
			class34.method165(var3 / 2 - 150, arg0 * 3, 0x8C1111, 30, var6 + 2);
			class34.method165(arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, 0, 30, var6 + 2);
			field1159.method206(arg1, var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF);
			field1196.method261(214, field9, 186);

			if (field1204) {
				field1204 = false;

				if (!field1053) {
					field1197.method261(0, field9, 0);
					field1198.method261(661, field9, 0);
				}

				field1194.method261(128, field9, 0);
				field1195.method261(214, field9, 386);
				field1199.method261(0, field9, 265);
				field1200.method261(574, field9, 265);
				field1201.method261(128, field9, 186);
				field1202.method261(574, field9, 186);
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;IILjava/lang/String;I)Lyb;")
	public final class51 method541(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1065[0] != null) {
				var6 = field1065[0].method287(arg4);
			}
		} catch (Exception var24) {
			signlink.reporterror("loaderror: lj1 " + arg0);
		}

		if (var6 != null) {
			field1362.reset();
			field1362.update(var6);
			int var8 = (int) field1362.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class51(var6);
		}

		while (var6 == null) {
			method13(arg1, "Requesting " + arg3);

			try {
				int var10 = 0;
				DataInputStream var11 = method533(arg0 + arg2);
				byte[] var12 = new byte[6];
				var11.readFully(var12, 0, 6);
				class39 var13 = new class39(var12);
				var13.field611 = 3;
				int var14 = var13.method235() + 6;
				int var15 = 6;
				var6 = new byte[var14];
				for (int var16 = 0; var16 < 6; var16++) {
					var6[var16] = var12[var16];
				}

				while (var15 < var14) {
					int var17 = var14 - var15;
					if (var17 > 1000) {
						var17 = 1000;
					}

					var15 += var11.read(var6, var15, var17);
					int var18 = var15 * 100 / var14;
					if (var10 != var18) {
						method13(arg1, "Loading " + arg3 + " - " + var18 + "%");
					}

					var10 = var18;
				}

				var11.close();

				try {
					if (field1065[0] != null) {
						field1065[0].method288(var6.length, var6, arg4);
					}
				} catch (Exception var23) {
					signlink.reporterror("loaderror: lj3 " + arg0);
				}

				field1362.reset();
				field1362.update(var6);
				int var19 = (int) field1362.getValue();
				if (arg2 != var19) {
					signlink.reporterror("loaderror: lj2 " + arg0 + " crc:" + arg2 + " crc2:" + var19);
				}
			} catch (IOException var25) {
				var6 = null;

				for (int var20 = var7; var20 > 0; var20--) {
					method13(arg1, "Error loading - Will retry in " + var20 + " secs.");

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				var7 *= 2;
				if (var7 > 60) {
					var7 = 60;
				}
			} catch (Exception var26) {
				signlink.reporterror("loaderror: lj4 " + arg0);
			}
		}

		return new class51(var6);
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method542() {
		class57.field833.method115();
		class57.field834.method115();
		class58.field862.method115();
		class59.field903.method115();
		class59.field904.method115();
		class28.field433.method115();
		class66.field969.method115();
	}

	@ObfuscatedName("client.G(I)V")
	public final void method543() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1029[var1] = var0 / 4;
		}
	}
}
