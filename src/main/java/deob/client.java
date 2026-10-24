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
	public int[] field1052 = new int[class67.field995];

	@ObfuscatedName("client.bb")
	public String field1053 = "";

	@ObfuscatedName("client.cb")
	public String field1054 = "";

	@ObfuscatedName("client.db")
	public int field1055;

	@ObfuscatedName("client.eb")
	public boolean field1056 = false;

	@ObfuscatedName("client.gb")
	public boolean field1057 = false;

	@ObfuscatedName("client.hb")
	public int field1058;

	@ObfuscatedName("client.ib")
	public String[] field1059 = new String[200];

	@ObfuscatedName("client.jb")
	public class37 field1060;

	@ObfuscatedName("client.kb")
	public class37 field1061;

	@ObfuscatedName("client.lb")
	public class37 field1062;

	@ObfuscatedName("client.mb")
	public boolean field1063 = false;

	@ObfuscatedName("client.nb")
	public int[] field1064 = new int[4000];

	@ObfuscatedName("client.ob")
	public int[] field1065 = new int[4000];

	@ObfuscatedName("client.qb")
	public class19 field1066;

	@ObfuscatedName("client.rb")
	public class4 field1067 = new class4();

	@ObfuscatedName("client.sb")
	public int field1068;

	@ObfuscatedName("client.tb")
	public byte[][][] field1069;

	@ObfuscatedName("client.ub")
	public static int field1070;

	@ObfuscatedName("client.vb")
	public int field1071;

	@ObfuscatedName("client.wb")
	public int field1072;

	@ObfuscatedName("client.xb")
	public int field1073;

	@ObfuscatedName("client.yb")
	public int field1074;

	@ObfuscatedName("client.zb")
	public int field1075;

	@ObfuscatedName("client.ac")
	public int field1097;

	@ObfuscatedName("client.bc")
	public int field1098;

	@ObfuscatedName("client.cc")
	public int field1099;

	@ObfuscatedName("client.dc")
	public String field1100;

	@ObfuscatedName("client.fc")
	public static BigInteger field1101 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.gc")
	public class44 field1102;

	@ObfuscatedName("client.hc")
	public class44 field1103;

	@ObfuscatedName("client.ic")
	public class44 field1104;

	@ObfuscatedName("client.jc")
	public class44 field1105;

	@ObfuscatedName("client.kc")
	public int field1106 = -1;

	@ObfuscatedName("client.mc")
	public int field1107 = -1;

	@ObfuscatedName("client.nc")
	public int field1108;

	@ObfuscatedName("client.oc")
	public int field1109;

	@ObfuscatedName("client.pc")
	public int field1110;

	@ObfuscatedName("client.qc")
	public int field1111;

	@ObfuscatedName("client.rc")
	public int field1112;

	@ObfuscatedName("client.sc")
	public int field1113;

	@ObfuscatedName("client.M")
	public boolean field1039 = true;

	@ObfuscatedName("client.N")
	public int[] field1040 = new int[5];

	@ObfuscatedName("client.X")
	public int field1049 = 0x23201B;

	@ObfuscatedName("client.Z")
	public String field1051 = "";

	@ObfuscatedName("client.Fb")
	public boolean field1078 = false;

	@ObfuscatedName("client.Gb")
	public int field1079 = -1;

	@ObfuscatedName("client.Kb")
	public int field1082 = 50;

	@ObfuscatedName("client.Lb")
	public int[] field1083 = new int[field1082];

	@ObfuscatedName("client.Mb")
	public int[] field1084 = new int[field1082];

	@ObfuscatedName("client.Nb")
	public int[] field1085 = new int[field1082];

	@ObfuscatedName("client.Ob")
	public int[] field1086 = new int[field1082];

	@ObfuscatedName("client.Pb")
	public int[] field1087 = new int[field1082];

	@ObfuscatedName("client.Qb")
	public int[] field1088 = new int[field1082];

	@ObfuscatedName("client.Rb")
	public int[] field1089 = new int[field1082];

	@ObfuscatedName("client.Sb")
	public String[] field1090 = new String[field1082];

	@ObfuscatedName("client.Xb")
	public int field1094 = -1;

	@ObfuscatedName("client.Yb")
	public int field1095 = -1;

	@ObfuscatedName("client.tc")
	public int[] field1114 = new int[100];

	@ObfuscatedName("client.uc")
	public String[] field1115 = new String[100];

	@ObfuscatedName("client.vc")
	public String[] field1116 = new String[100];

	@ObfuscatedName("client.Cc")
	public int[] field1122 = new int[151];

	@ObfuscatedName("client.Uc")
	public String[] field1139 = new String[5];

	@ObfuscatedName("client.Vc")
	public boolean[] field1140 = new boolean[5];

	@ObfuscatedName("client.Xc")
	public int[] field1142 = new int[1000];

	@ObfuscatedName("client.Yc")
	public boolean field1143 = false;

	@ObfuscatedName("client.Zc")
	public int field1144 = -1;

	@ObfuscatedName("client.ad")
	public int[] field1145 = new int[5];

	@ObfuscatedName("client.bd")
	public boolean field1146 = false;

	@ObfuscatedName("client.dd")
	public int field1147 = 128;

	@ObfuscatedName("client.hd")
	public boolean field1151 = false;

	@ObfuscatedName("client.ld")
	public int field1154 = -1;

	@ObfuscatedName("client.md")
	public boolean field1155 = true;

	@ObfuscatedName("client.rd")
	public int field1159 = -1;

	@ObfuscatedName("client.sd")
	public class36[] field1160 = new class36[20];

	@ObfuscatedName("client.td")
	public long[] field1161 = new long[100];

	@ObfuscatedName("client.Ad")
	public class42 field1167 = new class42();

	@ObfuscatedName("client.Dd")
	public boolean field1169 = false;

	@ObfuscatedName("client.Hd")
	public class36[] field1172 = new class36[50];

	@ObfuscatedName("client.Nd")
	public int[] field1177 = new int[151];

	@ObfuscatedName("client.Qd")
	public boolean[] field1180 = new boolean[5];

	@ObfuscatedName("client.Ud")
	public int[] field1183 = new int[2000];

	@ObfuscatedName("client.Vd")
	public boolean field1184 = false;

	@ObfuscatedName("client.Wd")
	public class39 field1185 = class39.method226(1);

	@ObfuscatedName("client.Yd")
	public int[] field1187 = new int[200];

	@ObfuscatedName("client.Zd")
	public int[] field1188 = new int[50];

	@ObfuscatedName("client.fe")
	public boolean field1194 = false;

	@ObfuscatedName("client.ie")
	public int field1196 = 2;

	@ObfuscatedName("client.ne")
	public boolean field1200 = false;

	@ObfuscatedName("client.oe")
	public int[][] field1201 = new int[104][104];

	@ObfuscatedName("client.qe")
	public final int[] field1203 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.se")
	public long[] field1205 = new long[200];

	@ObfuscatedName("client.te")
	public int field1206 = 3;

	@ObfuscatedName("client.ve")
	public boolean field1208 = true;

	@ObfuscatedName("client.Be")
	public int field1212 = -1;

	@ObfuscatedName("client.De")
	public class37[] field1214 = new class37[13];

	@ObfuscatedName("client.Je")
	public int field1220 = -1;

	@ObfuscatedName("client.Re")
	public int field1228 = 0x332D25;

	@ObfuscatedName("client.Ze")
	public class39 field1234 = class39.method226(1);

	@ObfuscatedName("client.af")
	public int[] field1235 = new int[5];

	@ObfuscatedName("client.cf")
	public boolean field1237 = false;

	@ObfuscatedName("client.df")
	public int field1238 = -1;

	@ObfuscatedName("client.gf")
	public int field1241 = 2;

	@ObfuscatedName("client.hf")
	public class27[] field1242 = new class27[16384];

	@ObfuscatedName("client.kf")
	public int[] field1244 = new int[16384];

	@ObfuscatedName("client.nf")
	public int[] field1246 = new int[2000];

	@ObfuscatedName("client.of")
	public boolean field1247 = false;

	@ObfuscatedName("client.qf")
	public int field1249 = 2048;

	@ObfuscatedName("client.rf")
	public int field1250 = 2047;

	@ObfuscatedName("client.sf")
	public class28[] field1251 = new class28[field1249];

	@ObfuscatedName("client.uf")
	public int[] field1253 = new int[field1249];

	@ObfuscatedName("client.wf")
	public int[] field1255 = new int[field1249];

	@ObfuscatedName("client.xf")
	public class39[] field1256 = new class39[field1249];

	@ObfuscatedName("client.zf")
	public boolean field1258 = false;

	@ObfuscatedName("client.Af")
	public class37[] field1259 = new class37[2];

	@ObfuscatedName("client.Bf")
	public int[] field1260 = new int[9];

	@ObfuscatedName("client.Df")
	public int field1262 = 1;

	@ObfuscatedName("client.Ef")
	public boolean field1263 = false;

	@ObfuscatedName("client.Hf")
	public int[][] field1266 = new int[104][104];

	@ObfuscatedName("client.If")
	public final int field1267 = 100;

	@ObfuscatedName("client.Jf")
	public int[] field1268 = new int[100];

	@ObfuscatedName("client.Kf")
	public class37[] field1269 = new class37[50];

	@ObfuscatedName("client.Lf")
	public int[] field1270 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Mf")
	public class36[] field1271 = new class36[8];

	@ObfuscatedName("client.Rf")
	public class39 field1274 = class39.method226(1);

	@ObfuscatedName("client.Yf")
	public int[] field1281 = new int[5];

	@ObfuscatedName("client.ig")
	public int[] field1290 = new int[class67.field995];

	@ObfuscatedName("client.kg")
	public boolean field1291 = true;

	@ObfuscatedName("client.ug")
	public int field1301 = -1;

	@ObfuscatedName("client.xg")
	public int[] field1304 = new int[256];

	@ObfuscatedName("client.yg")
	public boolean field1305 = false;

	@ObfuscatedName("client.Ag")
	public String field1307 = "";

	@ObfuscatedName("client.Dg")
	public int[] field1310 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Fg")
	public int[] field1312 = new int[33];

	@ObfuscatedName("client.Mg")
	public int[] field1318 = new int[50];

	@ObfuscatedName("client.Ug")
	public int field1326 = 78;

	@ObfuscatedName("client.Vg")
	public int[] field1327 = new int[class67.field995];

	@ObfuscatedName("client.gh")
	public boolean field1338 = false;

	@ObfuscatedName("client.kh")
	public boolean field1341 = false;

	@ObfuscatedName("client.lh")
	public int field1342 = 0x766654;

	@ObfuscatedName("client.rh")
	public int[] field1347 = new int[500];

	@ObfuscatedName("client.sh")
	public int[] field1348 = new int[500];

	@ObfuscatedName("client.th")
	public int[] field1349 = new int[500];

	@ObfuscatedName("client.uh")
	public int[] field1350 = new int[500];

	@ObfuscatedName("client.xh")
	public int[] field1351 = new int[33];

	@ObfuscatedName("client.Kh")
	public class49[] field1363 = new class49[5];

	@ObfuscatedName("client.Nh")
	public int[] field1365 = new int[1000];

	@ObfuscatedName("client.Oh")
	public int[] field1366 = new int[1000];

	@ObfuscatedName("client.Sh")
	public int[] field1370 = new int[7];

	@ObfuscatedName("client.Vh")
	public class42 field1373 = new class42();

	@ObfuscatedName("client.Wh")
	public byte[] field1374 = new byte[16384];

	@ObfuscatedName("client.Xh")
	public CRC32 field1375 = new CRC32();

	@ObfuscatedName("client.Yh")
	public boolean field1376 = false;

	@ObfuscatedName("client.Zh")
	public class36[] field1377 = new class36[20];

	@ObfuscatedName("client.li")
	public String field1387 = "";

	@ObfuscatedName("client.mi")
	public String field1388 = "";

	@ObfuscatedName("client.oi")
	public class42 field1390 = new class42();

	@ObfuscatedName("client.ti")
	public String field1395 = "";

	@ObfuscatedName("client.ui")
	public boolean field1396 = false;

	@ObfuscatedName("client.vi")
	public int field1397 = -1;

	@ObfuscatedName("client.xi")
	public boolean field1399 = false;

	@ObfuscatedName("client.Ai")
	public int field1401 = 0x4D4233;

	@ObfuscatedName("client.Ji")
	public boolean field1408 = false;

	@ObfuscatedName("client.Oi")
	public class36[] field1413 = new class36[1000];

	@ObfuscatedName("client.Qi")
	public class42[][][] field1415 = new class42[4][104][104];

	@ObfuscatedName("client.Ti")
	public int field1418 = -1;

	@ObfuscatedName("client.kj")
	public String field1432 = "";

	@ObfuscatedName("client.lj")
	public class62[] field1433 = new class62[4];

	@ObfuscatedName("client.nj")
	public int field1435 = 2;

	@ObfuscatedName("client.oj")
	public String field1436 = "";

	@ObfuscatedName("client.pj")
	public boolean field1437 = false;

	@ObfuscatedName("client.wj")
	public int field1442 = 1;

	@ObfuscatedName("client.xj")
	public int[][] field1443 = new int[104][104];

	@ObfuscatedName("client.Bj")
	public boolean field1447 = false;

	@ObfuscatedName("client.Dj")
	public String[] field1449 = new String[500];

	@ObfuscatedName("client.Ej")
	public int[] field1450 = new int[5];

	@ObfuscatedName("client.Fj")
	public int[] field1451 = new int[50];

	@ObfuscatedName("client.Kc")
	public static int field1129 = 10;

	@ObfuscatedName("client.Mc")
	public static boolean field1131 = true;

	@ObfuscatedName("client.pe")
	public static String field1202 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.re")
	public static final int[][] field1204 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.hg")
	public static int[] field1289 = new int[99];

	@ObfuscatedName("client.tg")
	public static int[] field1300 = new int[32];

	@ObfuscatedName("client.Lg")
	public static BigInteger field1317 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.rj")
	public static final int[] field1439 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.P")
	public int field1042;

	@ObfuscatedName("client.Q")
	public int field1043;

	@ObfuscatedName("client.R")
	public int field1044;

	@ObfuscatedName("client.S")
	public int field1045;

	@ObfuscatedName("client.T")
	public int field1046;

	@ObfuscatedName("client.W")
	public int field1048;

	@ObfuscatedName("client.Cb")
	public static int field1077;

	@ObfuscatedName("client.Ib")
	public static int field1080;

	@ObfuscatedName("client.Jb")
	public int field1081;

	@ObfuscatedName("client.Ub")
	public int field1091;

	@ObfuscatedName("client.Zb")
	public static int field1096;

	@ObfuscatedName("client.wc")
	public int field1117;

	@ObfuscatedName("client.xc")
	public int field1118;

	@ObfuscatedName("client.yc")
	public int field1119;

	@ObfuscatedName("client.zc")
	public int field1120;

	@ObfuscatedName("client.Gc")
	public int field1126;

	@ObfuscatedName("client.Hc")
	public int field1127;

	@ObfuscatedName("client.Jc")
	public static int field1128;

	@ObfuscatedName("client.Lc")
	public static int field1130;

	@ObfuscatedName("client.Oc")
	public int field1133;

	@ObfuscatedName("client.Wc")
	public int field1141;

	@ObfuscatedName("client.ed")
	public int field1148;

	@ObfuscatedName("client.fd")
	public int field1149;

	@ObfuscatedName("client.gd")
	public int field1150;

	@ObfuscatedName("client.jd")
	public int field1152;

	@ObfuscatedName("client.kd")
	public static int field1153;

	@ObfuscatedName("client.nd")
	public int field1156;

	@ObfuscatedName("client.od")
	public int field1157;

	@ObfuscatedName("client.pd")
	public int field1158;

	@ObfuscatedName("client.ud")
	public int field1162;

	@ObfuscatedName("client.vd")
	public int field1163;

	@ObfuscatedName("client.Cd")
	public int field1168;

	@ObfuscatedName("client.Id")
	public int field1173;

	@ObfuscatedName("client.Jd")
	public int field1174;

	@ObfuscatedName("client.Kd")
	public int field1175;

	@ObfuscatedName("client.Od")
	public int field1178;

	@ObfuscatedName("client.Pd")
	public static int field1179;

	@ObfuscatedName("client.Rd")
	public static int field1181;

	@ObfuscatedName("client.Td")
	public int field1182;

	@ObfuscatedName("client.Xd")
	public int field1186;

	@ObfuscatedName("client.ae")
	public int field1189;

	@ObfuscatedName("client.be")
	public int field1190;

	@ObfuscatedName("client.ce")
	public int field1191;

	@ObfuscatedName("client.de")
	public int field1192;

	@ObfuscatedName("client.ee")
	public int field1193;

	@ObfuscatedName("client.he")
	public int field1195;

	@ObfuscatedName("client.je")
	public int field1197;

	@ObfuscatedName("client.me")
	public int field1199;

	@ObfuscatedName("client.ue")
	public static int field1207;

	@ObfuscatedName("client.we")
	public static int field1209;

	@ObfuscatedName("client.xe")
	public int field1210;

	@ObfuscatedName("client.ye")
	public int field1211;

	@ObfuscatedName("client.Ee")
	public int field1215;

	@ObfuscatedName("client.Fe")
	public int field1216;

	@ObfuscatedName("client.Ge")
	public int field1217;

	@ObfuscatedName("client.He")
	public int field1218;

	@ObfuscatedName("client.Ie")
	public int field1219;

	@ObfuscatedName("client.Oe")
	public int field1225;

	@ObfuscatedName("client.bf")
	public static int field1236;

	@ObfuscatedName("client.ef")
	public int field1239;

	@ObfuscatedName("client.ff")
	public int field1240;

	@ObfuscatedName("client.jf")
	public int field1243;

	@ObfuscatedName("client.lf")
	public static int field1245;

	@ObfuscatedName("client.tf")
	public int field1252;

	@ObfuscatedName("client.vf")
	public int field1254;

	@ObfuscatedName("client.yf")
	public int field1257;

	@ObfuscatedName("client.Cf")
	public int field1261;

	@ObfuscatedName("client.Gf")
	public int field1265;

	@ObfuscatedName("client.Nf")
	public int field1272;

	@ObfuscatedName("client.Of")
	public int field1273;

	@ObfuscatedName("client.Xf")
	public int field1280;

	@ObfuscatedName("client.lg")
	public int field1292;

	@ObfuscatedName("client.mg")
	public int field1293;

	@ObfuscatedName("client.ng")
	public int field1294;

	@ObfuscatedName("client.og")
	public int field1295;

	@ObfuscatedName("client.pg")
	public int field1296;

	@ObfuscatedName("client.qg")
	public int field1297;

	@ObfuscatedName("client.rg")
	public int field1298;

	@ObfuscatedName("client.sg")
	public int field1299;

	@ObfuscatedName("client.vg")
	public int field1302;

	@ObfuscatedName("client.wg")
	public int field1303;

	@ObfuscatedName("client.zg")
	public int field1306;

	@ObfuscatedName("client.Bg")
	public int field1308;

	@ObfuscatedName("client.Eg")
	public int field1311;

	@ObfuscatedName("client.Hg")
	public int field1313;

	@ObfuscatedName("client.Ig")
	public int field1314;

	@ObfuscatedName("client.Jg")
	public int field1315;

	@ObfuscatedName("client.Kg")
	public int field1316;

	@ObfuscatedName("client.Ng")
	public int field1319;

	@ObfuscatedName("client.Og")
	public int field1320;

	@ObfuscatedName("client.Pg")
	public int field1321;

	@ObfuscatedName("client.Qg")
	public int field1322;

	@ObfuscatedName("client.Rg")
	public int field1323;

	@ObfuscatedName("client.Tg")
	public static int field1325;

	@ObfuscatedName("client.fh")
	public int field1337;

	@ObfuscatedName("client.ih")
	public int field1339;

	@ObfuscatedName("client.jh")
	public static int field1340;

	@ObfuscatedName("client.zh")
	public int field1353;

	@ObfuscatedName("client.Ah")
	public int field1354;

	@ObfuscatedName("client.Bh")
	public int field1355;

	@ObfuscatedName("client.Ch")
	public int field1356;

	@ObfuscatedName("client.Dh")
	public int field1357;

	@ObfuscatedName("client.Eh")
	public int field1358;

	@ObfuscatedName("client.Fh")
	public int field1359;

	@ObfuscatedName("client.Gh")
	public static int field1360;

	@ObfuscatedName("client.Ih")
	public int field1361;

	@ObfuscatedName("client.Jh")
	public int field1362;

	@ObfuscatedName("client.Mh")
	public int field1364;

	@ObfuscatedName("client.Ph")
	public int field1367;

	@ObfuscatedName("client.Th")
	public int field1371;

	@ObfuscatedName("client.Uh")
	public int field1372;

	@ObfuscatedName("client.ei")
	public int field1382;

	@ObfuscatedName("client.hi")
	public int field1384;

	@ObfuscatedName("client.ii")
	public int field1385;

	@ObfuscatedName("client.ni")
	public int field1389;

	@ObfuscatedName("client.pi")
	public int field1391;

	@ObfuscatedName("client.qi")
	public int field1392;

	@ObfuscatedName("client.ri")
	public int field1393;

	@ObfuscatedName("client.si")
	public int field1394;

	@ObfuscatedName("client.wi")
	public int field1398;

	@ObfuscatedName("client.zi")
	public static int field1400;

	@ObfuscatedName("client.Gi")
	public int field1405;

	@ObfuscatedName("client.Hi")
	public int field1406;

	@ObfuscatedName("client.Ii")
	public int field1407;

	@ObfuscatedName("client.Ki")
	public int field1409;

	@ObfuscatedName("client.Li")
	public int field1410;

	@ObfuscatedName("client.Mi")
	public int field1411;

	@ObfuscatedName("client.Ni")
	public int field1412;

	@ObfuscatedName("client.Pi")
	public int field1414;

	@ObfuscatedName("client.Ri")
	public int field1416;

	@ObfuscatedName("client.Si")
	public static int field1417;

	@ObfuscatedName("client.jj")
	public static int field1431;

	@ObfuscatedName("client.mj")
	public int field1434;

	@ObfuscatedName("client.uj")
	public int field1440;

	@ObfuscatedName("client.vj")
	public int field1441;

	@ObfuscatedName("client.yj")
	public int field1444;

	@ObfuscatedName("client.zj")
	public int field1445;

	@ObfuscatedName("client.Cj")
	public int field1448;

	@ObfuscatedName("client.O")
	public long field1041;

	@ObfuscatedName("client.Ed")
	public long field1170;

	@ObfuscatedName("client.ke")
	public long field1198;

	@ObfuscatedName("client.Ff")
	public long field1264;

	@ObfuscatedName("client.Fi")
	public long field1404;

	@ObfuscatedName("client.qj")
	public static class28 field1438;

	@ObfuscatedName("client.Vb")
	public class36 field1092;

	@ObfuscatedName("client.Wb")
	public class36 field1093;

	@ObfuscatedName("client.Ue")
	public class36 field1230;

	@ObfuscatedName("client.Ve")
	public class36 field1231;

	@ObfuscatedName("client.pf")
	public class36 field1248;

	@ObfuscatedName("client.mh")
	public class36 field1343;

	@ObfuscatedName("client.nh")
	public class36 field1344;

	@ObfuscatedName("client.oh")
	public class36 field1345;

	@ObfuscatedName("client.ph")
	public class36 field1346;

	@ObfuscatedName("client.Qh")
	public class36 field1368;

	@ObfuscatedName("client.Rh")
	public class36 field1369;

	@ObfuscatedName("client.ki")
	public class36 field1386;

	@ObfuscatedName("client.Aj")
	public class36 field1446;

	@ObfuscatedName("client.Pc")
	public class37 field1134;

	@ObfuscatedName("client.Qc")
	public class37 field1135;

	@ObfuscatedName("client.Rc")
	public class37 field1136;

	@ObfuscatedName("client.Sc")
	public class37 field1137;

	@ObfuscatedName("client.Tc")
	public class37 field1138;

	@ObfuscatedName("client.xd")
	public class37 field1164;

	@ObfuscatedName("client.yd")
	public class37 field1165;

	@ObfuscatedName("client.zd")
	public class37 field1166;

	@ObfuscatedName("client.Sf")
	public class37 field1275;

	@ObfuscatedName("client.Tf")
	public class37 field1276;

	@ObfuscatedName("client.Uf")
	public class37 field1277;

	@ObfuscatedName("client.Vf")
	public class37 field1278;

	@ObfuscatedName("client.Wf")
	public class37 field1279;

	@ObfuscatedName("client.ai")
	public class37 field1378;

	@ObfuscatedName("client.bi")
	public class37 field1379;

	@ObfuscatedName("client.Bi")
	public class37 field1402;

	@ObfuscatedName("client.Ci")
	public class37 field1403;

	@ObfuscatedName("client.Ke")
	public class38 field1221;

	@ObfuscatedName("client.Le")
	public class38 field1222;

	@ObfuscatedName("client.Me")
	public class38 field1223;

	@ObfuscatedName("client.Ne")
	public class38 field1224;

	@ObfuscatedName("client.Dc")
	public class44 field1123;

	@ObfuscatedName("client.Ec")
	public class44 field1124;

	@ObfuscatedName("client.Fc")
	public class44 field1125;

	@ObfuscatedName("client.Wg")
	public class44 field1328;

	@ObfuscatedName("client.Xg")
	public class44 field1329;

	@ObfuscatedName("client.Yg")
	public class44 field1330;

	@ObfuscatedName("client.Zg")
	public class44 field1331;

	@ObfuscatedName("client.ah")
	public class44 field1332;

	@ObfuscatedName("client.bh")
	public class44 field1333;

	@ObfuscatedName("client.ch")
	public class44 field1334;

	@ObfuscatedName("client.dh")
	public class44 field1335;

	@ObfuscatedName("client.eh")
	public class44 field1336;

	@ObfuscatedName("client.Yi")
	public class44 field1422;

	@ObfuscatedName("client.Zi")
	public class44 field1423;

	@ObfuscatedName("client.aj")
	public class44 field1424;

	@ObfuscatedName("client.bj")
	public class44 field1425;

	@ObfuscatedName("client.cj")
	public class44 field1426;

	@ObfuscatedName("client.dj")
	public class44 field1427;

	@ObfuscatedName("client.ej")
	public class44 field1428;

	@ObfuscatedName("client.fj")
	public class44 field1429;

	@ObfuscatedName("client.gj")
	public class44 field1430;

	@ObfuscatedName("client.Y")
	public class48 field1050;

	@ObfuscatedName("client.Sg")
	public class50 field1324;

	@ObfuscatedName("client.Ld")
	public class51 field1176;

	@ObfuscatedName("client.Te")
	public class58 field1229;

	@ObfuscatedName("client.U")
	public class5 field1047;

	@ObfuscatedName("client.Ac")
	public String field1121;

	@ObfuscatedName("client.Fd")
	public String field1171;

	@ObfuscatedName("client.Cg")
	public String field1309;

	@ObfuscatedName("client.Nc")
	public static boolean field1132;

	@ObfuscatedName("client.yh")
	public static boolean field1352;

	@ObfuscatedName("client.fi")
	public static boolean field1383;

	@ObfuscatedName("client.Pe")
	public int[] field1226;

	@ObfuscatedName("client.Qe")
	public int[] field1227;

	@ObfuscatedName("client.ag")
	public int[] field1282;

	@ObfuscatedName("client.bg")
	public int[] field1283;

	@ObfuscatedName("client.cg")
	public int[] field1284;

	@ObfuscatedName("client.dg")
	public int[] field1285;

	@ObfuscatedName("client.eg")
	public int[] field1286;

	@ObfuscatedName("client.fg")
	public int[] field1287;

	@ObfuscatedName("client.gg")
	public int[] field1288;

	@ObfuscatedName("client.ci")
	public int[] field1380;

	@ObfuscatedName("client.di")
	public int[] field1381;

	@ObfuscatedName("client.Ui")
	public int[] field1419;

	@ObfuscatedName("client.Vi")
	public int[] field1420;

	@ObfuscatedName("client.Wi")
	public int[] field1421;

	@ObfuscatedName("client.Ab")
	public class37[] field1076;

	@ObfuscatedName("client.Ce")
	public byte[][] field1213;

	@ObfuscatedName("client.Ye")
	public byte[][] field1233;

	@ObfuscatedName("client.We")
	public int[][][] field1232;

	@ObfuscatedName("client.a(ILgc;IZI)V")
	public final void method431(int arg0, class59 arg1, int arg2, int arg3) {
		if (field1359 < 400) {
			String var5 = arg1.field866;
			if (arg1.field883 != 0) {
				var5 = var5 + method440(arg1.field883, field1438.field430) + " (level-" + arg1.field883 + ")";
			}

			if (field1117 == 1) {
				field1449[field1359] = "Use " + field1121 + " with @yel@" + var5;
				field1349[field1359] = 829;
				field1350[field1359] = arg3;
				field1347[field1359] = arg0;
				field1348[field1359] = arg2;
				field1359++;
			} else if (field1097 != 1) {
				if (arg1.field878 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg1.field878[var6] != null && !arg1.field878[var6].equalsIgnoreCase("attack")) {
							field1449[field1359] = arg1.field878[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1349[field1359] = 242;
							}

							if (var6 == 1) {
								field1349[field1359] = 209;
							}

							if (var6 == 2) {
								field1349[field1359] = 309;
							}

							if (var6 == 3) {
								field1349[field1359] = 852;
							}

							if (var6 == 4) {
								field1349[field1359] = 793;
							}

							field1350[field1359] = arg3;
							field1347[field1359] = arg0;
							field1348[field1359] = arg2;
							field1359++;
						}
					}
				}

				if (arg1.field878 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg1.field878[var7] != null && arg1.field878[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg1.field883 > field1438.field430) {
								var8 = 2000;
							}

							field1449[field1359] = arg1.field878[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1349[field1359] = var8 + 242;
							}

							if (var7 == 1) {
								field1349[field1359] = var8 + 209;
							}

							if (var7 == 2) {
								field1349[field1359] = var8 + 309;
							}

							if (var7 == 3) {
								field1349[field1359] = var8 + 852;
							}

							if (var7 == 4) {
								field1349[field1359] = var8 + 793;
							}

							field1350[field1359] = arg3;
							field1347[field1359] = arg0;
							field1348[field1359] = arg2;
							field1359++;
						}
					}
				}

				field1449[field1359] = "Examine @yel@" + var5;
				field1349[field1359] = 1714;
				field1350[field1359] = arg3;
				field1347[field1359] = arg0;
				field1348[field1359] = arg2;
				field1359++;
			} else if ((field1099 & 0x2) == 2) {
				field1449[field1359] = field1100 + " @yel@" + var5;
				field1349[field1359] = 240;
				field1350[field1359] = arg3;
				field1347[field1359] = arg0;
				field1348[field1359] = arg2;
				field1359++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method432(boolean arg0) {
		method486();
		field1424.method268();
		field1402.method212(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1440 == 0) {
			int var4 = var3 / 2 + 80;
			field1221.method215(field1050.field735, var2 / 2, true, 0x75A9A9, var4);
			int var5 = var3 / 2 - 20;
			field1223.method215("Welcome to RuneScape", var2 / 2, true, 0xFFFF00, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1403.method212(var6 - 73, var7 - 20);
			field1223.method215("New user", var6, true, 0xFFFFFF, var7 + 5);
			int var8 = var2 / 2 + 80;
			field1403.method212(var8 - 73, var7 - 20);
			field1223.method215("Existing User", var8, true, 0xFFFFFF, var7 + 5);
		}

		if (field1440 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1053.length() > 0) {
				field1223.method215(field1053, var2 / 2, true, 0xFFFF00, var9 - 15);
				field1223.method215(field1054, var2 / 2, true, 0xFFFF00, var9);
				var9 += 30;
			} else {
				field1223.method215(field1054, var2 / 2, true, 0xFFFF00, var9 - 7);
				var9 += 30;
			}

			field1223.method219(0xFFFFFF, true, "Username: " + field1387 + (field1225 == 0 & field1417 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 90);
			var9 += 15;
			field1223.method219(0xFFFFFF, true, "Password: " + class52.method316(field1388) + (field1225 == 1 & field1417 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 88);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1403.method212(var10 - 73, var11 - 20);
				field1223.method215("Login", var10, true, 0xFFFFFF, var11 + 5);
				int var12 = var2 / 2 + 80;
				field1403.method212(var12 - 73, var11 - 20);
				field1223.method215("Cancel", var12, true, 0xFFFFFF, var11 + 5);
			}
		}

		if (field1440 == 3) {
			field1223.method215("Create a free account", var2 / 2, true, 0xFFFF00, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field1223.method215("To create a new account you need to", var2 / 2, true, 0xFFFFFF, var13);
			var13 += 15;
			field1223.method215("go back to the main RuneScape webpage", var2 / 2, true, 0xFFFFFF, var13);
			var13 += 15;
			field1223.method215("and choose the red 'create account'", var2 / 2, true, 0xFFFFFF, var13);
			var13 += 15;
			field1223.method215("button at the top right of that page.", var2 / 2, true, 0xFFFFFF, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1403.method212(var14 - 73, var15 - 20);
			field1223.method215("Cancel", var14, true, 0xFFFFFF, var15 + 5);
		}

		field1424.method269(field9, 171, 202);

		if (field1200) {
			field1200 = false;
			field1422.method269(field9, 0, 128);
			field1423.method269(field9, 371, 202);
			field1427.method269(field9, 265, 0);
			field1428.method269(field9, 265, 562);
			field1429.method269(field9, 171, 128);
			field1430.method269(field9, 171, 562);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public void method433() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1162);

		if (field1050 != null) {
			System.out.println("Od-cycle:" + field1050.field749);
		}

		System.out.println("loop-cycle:" + field1417);
		System.out.println("draw-cycle:" + field1209);
		System.out.println("ptype:" + field1216);
		System.out.println("psize:" + field1215);

		if (field1047 != null) {
			field1047.method43();
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

	@ObfuscatedName("client.a(IBLd;IIII)V")
	public final void method434(int arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field63 == 0 && arg1.field78 != null && !arg1.field77 && (arg5 >= arg0 && arg2 >= arg4 && arg5 <= arg1.field66 + arg0 && arg2 <= arg1.field67 + arg4)) {
			int var7 = arg1.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field79[var8] + arg0;
				int var10 = arg1.field80[var8] + arg4 - arg3;
				class4 var11 = class4.field56[arg1.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1182 = var11.field74;
					} else {
						field1182 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method434(var9, var11, arg2, var11.field76, var10, arg5);

					if (var11.field75 > var11.field67) {
						method437(var11.field67, var11.field75, var10, arg2, true, var11.field66 + var9, var11, arg5);
					}
				} else {
					if (var11.field64 == 1 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method471(var11);
						}

						if (!var12) {
							field1449[field1359] = var11.field117;
							field1349[field1359] = 231;
							field1348[field1359] = var11.field61;
							field1359++;
						}
					}

					if (var11.field64 == 2 && field1097 == 0 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1449[field1359] = var13 + " @gre@" + var11.field115;
						field1349[field1359] = 274;
						field1348[field1359] = var11.field61;
						field1359++;
					}

					if (var11.field64 == 3 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1449[field1359] = "Close";
						field1349[field1359] = 737;
						field1348[field1359] = var11.field61;
						field1359++;
					}

					if (var11.field64 == 4 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1449[field1359] = var11.field117;
						field1349[field1359] = 435;
						field1348[field1359] = var11.field61;
						field1359++;
					}

					if (var11.field64 == 5 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1449[field1359] = var11.field117;
						field1349[field1359] = 225;
						field1348[field1359] = var11.field61;
						field1359++;
					}

					if (var11.field64 == 6 && !field1063 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1449[field1359] = var11.field117;
						field1349[field1359] = 997;
						field1348[field1359] = var11.field61;
						field1359++;
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
									field1391 = var14;
									field1392 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method350(var11.field57[var14] - 1);
										if (field1117 == 1 && var11.field84) {
											if (field1119 != var11.field61 || field1118 != var14) {
												field1449[field1359] = "Use " + field1121 + " with @lre@" + var19.field900;
												field1349[field1359] = 398;
												field1350[field1359] = var19.field898;
												field1347[field1359] = var14;
												field1348[field1359] = var11.field61;
												field1359++;
											}
										} else if (field1097 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field915 != null && var19.field915[var20] != null) {
														field1449[field1359] = var19.field915[var20] + " @lre@" + var19.field900;

														if (var20 == 3) {
															field1349[field1359] = 681;
														}

														if (var20 == 4) {
															field1349[field1359] = 100;
														}

														field1350[field1359] = var19.field898;
														field1347[field1359] = var14;
														field1348[field1359] = var11.field61;
														field1359++;
													} else if (var20 == 4) {
														field1449[field1359] = "Drop @lre@" + var19.field900;
														field1349[field1359] = 100;
														field1350[field1359] = var19.field898;
														field1347[field1359] = var14;
														field1348[field1359] = var11.field61;
														field1359++;
													}
												}
											}

											if (var11.field85) {
												field1449[field1359] = "Use @lre@" + var19.field900;
												field1349[field1359] = 102;
												field1350[field1359] = var19.field898;
												field1347[field1359] = var14;
												field1348[field1359] = var11.field61;
												field1359++;
											}

											if (var11.field84 && var19.field915 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field915[var21] != null) {
														field1449[field1359] = var19.field915[var21] + " @lre@" + var19.field900;

														if (var21 == 0) {
															field1349[field1359] = 694;
														}

														if (var21 == 1) {
															field1349[field1359] = 962;
														}

														if (var21 == 2) {
															field1349[field1359] = 795;
														}

														field1350[field1359] = var19.field898;
														field1347[field1359] = var14;
														field1348[field1359] = var11.field61;
														field1359++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1449[field1359] = var11.field92[var22] + " @lre@" + var19.field900;

														if (var22 == 0) {
															field1349[field1359] = 582;
														}

														if (var22 == 1) {
															field1349[field1359] = 113;
														}

														if (var22 == 2) {
															field1349[field1359] = 555;
														}

														if (var22 == 3) {
															field1349[field1359] = 331;
														}

														if (var22 == 4) {
															field1349[field1359] = 354;
														}

														field1350[field1359] = var19.field898;
														field1347[field1359] = var14;
														field1348[field1359] = var11.field61;
														field1359++;
													}
												}
											}

											field1449[field1359] = "Examine @lre@" + var19.field900;
											field1349[field1359] = 1328;
											field1350[field1359] = var19.field898;
											field1347[field1359] = var14;
											field1348[field1359] = var11.field61;
											field1359++;
										} else if ((field1099 & 0x10) == 0x10) {
											field1449[field1359] = field1100 + " @lre@" + var19.field900;
											field1349[field1359] = 563;
											field1350[field1359] = var19.field898;
											field1347[field1359] = var14;
											field1348[field1359] = var11.field61;
											field1359++;
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

	public final void run() {
		if (field1143) {
			method524();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method435() {
		if (field1359 >= 2 || field1117 != 0 || field1097 != 0) {
			String var1;
			if (field1117 == 1 && field1359 < 2) {
				var1 = "Use " + field1121 + " with...";
			} else if (field1097 == 1 && field1359 < 2) {
				var1 = field1100 + "...";
			} else {
				var1 = field1449[field1359 - 1];
			}

			if (field1359 > 2) {
				var1 = var1 + "@whi@ / " + (field1359 - 2) + " more options";
			}

			field1223.method220(true, 4, 0xFFFFFF, 15, field1417 / 1000, var1);
		}
	}

	@ObfuscatedName("client.a([BZI)Z")
	public final boolean method436(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IIIBIZILd;I)V")
	public final void method437(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class4 arg6, int arg7) {
		if (field1341) {
			field1173 = 32;
		} else {
			field1173 = 0;
		}

		field1341 = false;
		if (arg7 >= arg5 && arg7 < arg5 + 16 && arg3 >= arg2 && arg3 < arg2 + 16) {
			arg6.field76 -= field1048 * 4;

			if (arg4) {
				field1194 = true;
				return;
			}
		} else if (arg7 >= arg5 && arg7 < arg5 + 16 && arg3 >= arg0 + arg2 - 16 && arg3 < arg0 + arg2) {
			arg6.field76 += field1048 * 4;

			if (arg4) {
				field1194 = true;
				return;
			}
		} else if (arg7 >= arg5 - field1173 && arg7 < arg5 + field1173 + 16 && arg3 >= arg2 + 16 && arg3 < arg0 + arg2 - 16 && field1048 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg2 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg6.field76 = (arg1 - arg0) * var10 / var11;

			if (arg4) {
				field1194 = true;
			}

			field1341 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IIILjb;)V")
	public final void method438(int arg0, int arg1, class36 arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1195 + field1148 & 0x7FF;
			int var6 = class32.field551[var5];
			int var7 = class32.field552[var5];
			var6 = var6 * 256 / (field1261 + 256);
			var7 = var7 * 256 / (field1261 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1386.method204(var12 + 94 + 4 - 10, 20, 256, 15, 83 - var13 - 20, 20, var10, 15);
		} else {
			method506(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method439(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1053 = "";
				field1054 = "Connecting to server...";
				method432(true);
			}

			field1047 = new class5(this, method500(field1130 + 43594));
			long var4 = class52.method310(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1274.field624 = 0;
			field1274.method229(14);
			field1274.method229(var6);
			field1047.method42(2, field1274.field623, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field1047.method39();
			}

			int var8 = field1047.method39();
			if (var8 == 0) {
				field1047.method41(field1234.field623, 0, 8);
				field1234.field624 = 0;
				field1264 = field1234.method245();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1264 >> 32), (int) field1264 };
				field1274.field624 = 0;
				field1274.method229(10);
				field1274.method233(var9[0]);
				field1274.method233(var9[1]);
				field1274.method233(var9[2]);
				field1274.method233(var9[3]);
				field1274.method233(signlink.uid);
				field1274.method236(arg0);
				field1274.method236(arg1);
				field1274.method254(field1101, field1317);
				field1185.field624 = 0;

				if (arg2) {
					field1185.method229(18);
				} else {
					field1185.method229(16);
				}

				field1185.method229(field1274.field624 + 36 + 1 + 1);
				field1185.method229(253);
				field1185.method229(field1132 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1185.method233(field1260[var10]);
				}

				field1185.method237(0, field1274.field624, field1274.field623);
				field1274.field628 = new class50(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1324 = new class50(var9);
				field1047.method42(field1185.field624, field1185.field623, 0);
				var8 = field1047.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}

				method439(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1367 = field1047.method39();
				field1352 = field1047.method39() == 1;
				class6.method45();
				field1404 = 0L;
				field1448 = 0;
				field1229.field857 = 0;
				field14 = true;
				field1208 = true;
				field1263 = true;
				field1274.field624 = 0;
				field1234.field624 = 0;
				field1216 = -1;
				field1297 = -1;
				field1298 = -1;
				field1299 = -1;
				field1215 = 0;
				field1217 = 0;
				field1133 = 0;
				field1219 = 0;
				field1337 = 0;
				field1359 = 0;
				field1247 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1116[var12] = null;
				}

				field1117 = 0;
				field1097 = 0;
				field1372 = 0;
				field1394 = 0;
				field1434 = (int) (Math.random() * 100.0D) - 50;
				field1240 = (int) (Math.random() * 110.0D) - 55;
				field1441 = (int) (Math.random() * 80.0D) - 40;
				field1195 = (int) (Math.random() * 120.0D) - 60;
				field1261 = (int) (Math.random() * 30.0D) - 20;
				field1148 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1397 = -1;
				field1444 = 0;
				field1445 = 0;
				field1252 = 0;
				field1243 = 0;

				for (int var13 = 0; var13 < field1249; var13++) {
					field1251[var13] = null;
					field1256[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					field1242[var14] = null;
				}

				field1438 = field1251[field1250] = new class28();
				field1390.method262();
				field1167.method262();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1415[var15][var16][var17] = null;
						}
					}
				}

				field1373 = new class42();
				field1303 = 0;
				field1302 = 0;
				field1154 = -1;
				field1220 = -1;
				field1238 = -1;
				field1212 = -1;
				field1106 = -1;
				field1063 = false;
				field1206 = 3;
				field1396 = false;
				field1247 = false;
				field1447 = false;
				field1171 = null;
				field1292 = 0;
				field1107 = -1;
				field1039 = true;
				method472();

				for (int var18 = 0; var18 < 5; var18++) {
					field1281[var18] = 0;
				}

				for (int var19 = 0; var19 < 5; var19++) {
					field1139[var19] = null;
					field1140[var19] = false;
				}

				field1236 = 0;
				field1128 = 0;
				field1360 = 0;
				field1245 = 0;
				field1400 = 0;
				field1077 = 0;
				field1179 = 0;
				field1207 = 0;
				field1096 = 0;
				method455();
			} else if (var8 == 3) {
				field1053 = "";
				field1054 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1053 = "Your account has been disabled.";
				field1054 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1053 = "Your account is already logged in.";
				field1054 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1053 = "RuneScape has been updated!";
				field1054 = "Please reload this page.";
			} else if (var8 == 7) {
				field1053 = "This world is full.";
				field1054 = "Please use a different world.";
			} else if (var8 == 8) {
				field1053 = "Unable to connect.";
				field1054 = "Login server offline.";
			} else if (var8 == 9) {
				field1053 = "Login limit exceeded.";
				field1054 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1053 = "Unable to connect.";
				field1054 = "Bad session id.";
			} else if (var8 == 11) {
				field1054 = "Login server rejected session.";
				field1054 = "Please try again.";
			} else if (var8 == 12) {
				field1053 = "You need a members account to login to this world.";
				field1054 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1053 = "Could not complete login.";
				field1054 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1053 = "The server is being updated.";
				field1054 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1263 = true;
				field1274.field624 = 0;
				field1234.field624 = 0;
				field1216 = -1;
				field1297 = -1;
				field1298 = -1;
				field1299 = -1;
				field1215 = 0;
				field1217 = 0;
				field1133 = 0;
				field1359 = 0;
				field1247 = false;
				field1198 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1053 = "Login attempts exceeded.";
				field1054 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1053 = "You are standing in a members-only area.";
				field1054 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1053 = "Invalid loginserver requested";
				field1054 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = field1047.method39(); var20 >= 0; var20--) {
					field1053 = "You have only just left another world";
					field1054 = "Your profile will be transfered in: " + var20 + " seconds";
					method432(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				method439(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1053 = "No response from server";
				field1054 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1053 = "Unexpected server response";
				field1054 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			field1053 = "";
			field1054 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method7() {
		if (!field1169 && !field1408 && !field1376) {
			field1417++;

			if (field1263) {
				method507();
			} else {
				method485();
			}

			method519();
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method440(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(BI)V")
	public final void method441(int arg0) {
		int[] var2 = field1446.field597;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1069[arg0][var7][var5] & 0x18) == 0) {
					field1066.method99(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1069[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1066.method99(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1446.method194();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1069[arg0][var11][var10] & 0x18) == 0) {
					method456(var8, var9, var11, var10, arg0);
				}

				if (arg0 < 3 && (field1069[arg0 + 1][var11][var10] & 0x8) != 0) {
					method456(var8, var9, var11, var10, arg0 + 1);
				}
			}
		}

		field1104.method268();
		field1364 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1066.method93(field1406, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method334(var14).field838;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1433[field1406].field945;
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

						field1413[field1364] = field1172[var15];
						field1365[field1364] = var16;
						field1366[field1364] = var17;
						field1364++;
					}
				}
			}
		}

		field1080++;
		if (field1080 > 112) {
			field1080 = 0;
			field1274.method228(4);
			field1274.method229(50);
		}
	}

	@ObfuscatedName("client.a(IIIIIZIIIIII)Z")
	public final boolean method442(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1266[var14][var15] = 0;
				field1201[var14][var15] = 99999999;
			}
		}

		int var16 = arg2;
		int var17 = arg6;
		field1266[arg2][arg6] = 99;
		field1201[arg2][arg6] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1064[var18] = arg2;
		int var35 = var18 + 1;
		field1065[var18] = arg6;
		boolean var20 = false;
		int var21 = field1064.length;
		int[][] var22 = field1433[field1406].field945;
		while (var35 != var19) {
			var16 = field1064[var19];
			var17 = field1065[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg4 == var17) {
				var20 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field1433[field1406].method370(arg7 - 1, var16, arg4, arg8, var17, arg3)) {
					var20 = true;
					break;
				}

				if (arg7 < 10 && field1433[field1406].method371(arg3, arg8, arg4, var17, var16, arg7 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg10 != 0 && arg9 != 0 && field1433[field1406].method372(arg10, arg4, arg1, var16, arg9, var17, arg8)) {
				var20 = true;
				break;
			}

			int var23 = field1201[var16][var17] + 1;
			if (var16 > 0 && field1266[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1064[var35] = var16 - 1;
				field1065[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1266[var16 - 1][var17] = 2;
				field1201[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1266[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1064[var35] = var16 + 1;
				field1065[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1266[var16 + 1][var17] = 8;
				field1201[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1266[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1064[var35] = var16;
				field1065[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1266[var16][var17 - 1] = 1;
				field1201[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1266[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1064[var35] = var16;
				field1065[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1266[var16][var17 + 1] = 4;
				field1201[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1266[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1064[var35] = var16 - 1;
				field1065[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1266[var16 - 1][var17 - 1] = 3;
				field1201[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1266[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1064[var35] = var16 + 1;
				field1065[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1266[var16 + 1][var17 - 1] = 9;
				field1201[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1266[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1064[var35] = var16 - 1;
				field1065[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1266[var16 - 1][var17 + 1] = 6;
				field1201[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1266[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1064[var35] = var16 + 1;
				field1065[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1266[var16 + 1][var17 + 1] = 12;
				field1201[var16 + 1][var17 + 1] = var23;
			}
		}

		field1382 = 0;
		if (!var20) {
			if (arg5) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
						for (int var27 = arg4 - var25; var27 <= arg4 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1201[var26][var27] < var24) {
								var24 = field1201[var26][var27];
								var16 = var26;
								var17 = var27;
								field1382 = 1;
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
		int var30 = var29 = field1266[var16][var17];
		while (arg2 != var16 || arg6 != var17) {
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

			var30 = field1266[var16][var17];
		}

		if (var36 <= 0) {
			if (arg0 == 1) {
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

		if (arg0 == 0) {
			field1274.method228(6);
			field1274.method229(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			field1274.method228(220);
			field1274.method229(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			field1274.method228(127);
			field1274.method229(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1274.method229(1);
		} else {
			field1274.method229(0);
		}

		field1274.method230(field1313 + var32);
		field1274.method230(field1314 + var33);
		field1444 = field1064[0];
		field1445 = field1065[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1274.method229(field1064[var36] - var32);
			field1274.method229(field1065[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method443() {
		field1402 = new class37(field1176, "titlebox", 0);
		field1403 = new class37(field1176, "titlebutton", 0);
		field1076 = new class37[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1076[var1] = new class37(field1176, "runes", var1);
		}

		field1230 = new class36(128, 265);
		field1231 = new class36(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1230.field597[var2] = field1425.field657[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1231.field597[var3] = field1426.field657[var3];
		}

		field1283 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1283[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1283[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1283[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1283[var7 + 192] = 0xFFFFFF;
		}

		field1284 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1284[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1284[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1284[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1284[var11 + 192] = 0xFFFFFF;
		}

		field1285 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1285[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1285[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1285[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1285[var15 + 192] = 0xFFFFFF;
		}

		field1282 = new int[256];
		field1380 = new int[32768];
		field1381 = new int[32768];
		method469(null);
		field1226 = new int[32768];
		field1227 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1056) {
			field1143 = true;
			field1056 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method444() {
		if (field1361 != 0) {
			class38 var1 = field1222;
			int var2 = 0;
			if (field1133 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1116[var3] != null) {
					int var4 = field1114[var3];
					String var5 = field1115[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1308 == 0 || field1308 == 1 && method484(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method217(var7, 0, "From", var8);
						var1.method217(var7 - 1, 0xFFFF, "From", var8);
						int var11 = var8 + var1.method216("From ");
						if (var6 == 1) {
							field1259[0].method212(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1259[1].method212(var11, var7 - 12);
							var11 += 14;
						}

						var1.method217(var7, 0, var5 + ": " + field1116[var3], var11);
						var1.method217(var7 - 1, 0xFFFF, var5 + ": " + field1116[var3], var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1308 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method217(var9, 0, field1116[var3], 4);
						var1.method217(var9 - 1, 0xFFFF, field1116[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1308 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method217(var10, 0, "To " + var5 + ": " + field1116[var3], 4);
						var1.method217(var10 - 1, 0xFFFF, "To " + var5 + ": " + field1116[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZLmb;)V")
	public final void method445(int arg0, class39 arg1) {
		if (arg0 == 70 || arg0 == 88) {
			int var3 = arg1.method239();
			int var4 = (var3 >> 4 & 0x7) + field1272;
			int var5 = (var3 & 0x7) + field1273;
			int var6 = arg1.method239();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1203[var7];
			int var10;
			if (arg0 == 88) {
				var10 = -1;
			} else {
				var10 = arg1.method241();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method474(0, var9, field1406, var4, var7, -1, var8, var5, var10);
			}
		} else if (arg0 == 30) {
			int var11 = arg1.method239();
			int var12 = (var11 >> 4 & 0x7) + field1272;
			int var13 = (var11 & 0x7) + field1273;
			int var14 = arg1.method239();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1203[var15];
			int var18 = arg1.method241();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1232[field1406][var12][var13];
				int var20 = field1232[field1406][var12 + 1][var13];
				int var21 = field1232[field1406][var12 + 1][var13 + 1];
				int var22 = field1232[field1406][var12][var13 + 1];
				if (var17 == 0) {
					class18 var23 = field1066.method86(field1406, var13, var12);
					if (var23 != null) {
						int var24 = var23.field264 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field262 = new class29(var21, var19, var24, 2, var16 + 4, var22, var18, false, var20);
							var23.field263 = new class29(var21, var19, var24, 2, var16 + 1 & 0x3, var22, var18, false, var20);
						} else {
							var23.field262 = new class29(var21, var19, var24, var15, var16, var22, var18, false, var20);
						}
					}
				}

				if (var17 == 1) {
					class9 var25 = field1066.method87(var12, var13, field1406);
					if (var25 != null) {
						var25.field155 = new class29(var21, var19, var25.field156 >> 14 & 0x7FFF, 4, 0, var22, var18, false, var20);
					}
				}

				if (var17 == 2) {
					class17 var26 = field1066.method88(var12, field1406, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field247 = new class29(var21, var19, var26.field255 >> 14 & 0x7FFF, var15, var16, var22, var18, false, var20);
					}
				}

				if (var17 == 3) {
					class11 var27 = field1066.method89(var12, var13, field1406);
					if (var27 != null) {
						var27.field186 = new class29(var21, var19, var27.field187 >> 14 & 0x7FFF, 22, var16, var22, var18, false, var20);
					}
				}
			}
		} else if (arg0 == 120) {
			int var28 = arg1.method239();
			int var29 = (var28 >> 4 & 0x7) + field1272;
			int var30 = (var28 & 0x7) + field1273;
			int var31 = arg1.method241();
			int var32 = arg1.method241();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class30 var33 = new class30();
				var33.field456 = var31;
				var33.field457 = var32;

				if (field1415[field1406][var29][var30] == null) {
					field1415[field1406][var29][var30] = new class42();
				}

				field1415[field1406][var29][var30].method255(var33);
				method560(var29, var30);
			}
		} else if (arg0 == 115) {
			int var34 = arg1.method239();
			int var35 = (var34 >> 4 & 0x7) + field1272;
			int var36 = (var34 & 0x7) + field1273;
			int var37 = arg1.method241();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1415[field1406][var35][var36];
				if (var38 != null) {
					for (class30 var39 = (class30) var38.method258(); var39 != null; var39 = (class30) var38.method260()) {
						if ((var37 & 0x7FFF) == var39.field456) {
							var39.method120();
							break;
						}
					}

					if (var38.method258() == null) {
						field1415[field1406][var35][var36] = null;
					}

					method560(var35, var36);
				}
			}
		} else if (arg0 == 37) {
			int var40 = arg1.method239();
			int var41 = (var40 >> 4 & 0x7) + field1272;
			int var42 = (var40 & 0x7) + field1273;
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
				class31 var53 = new class31(var45, var42, var41, var51, field1417 + var49, var48, method542(var41, var42, field1406) - var47, var52, var46, field1406, field1417 + var50);
				var53.method133(var43, field1417 + var49, method542(var43, var44, field1406) - var48, var44);
				field1390.method255(var53);
			}
		} else if (arg0 == 114) {
			int var54 = arg1.method239();
			int var55 = (var54 >> 4 & 0x7) + field1272;
			int var56 = (var54 & 0x7) + field1273;
			int var57 = arg1.method241();
			int var58 = arg1.method239();
			int var59 = arg1.method241();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class33 var60 = new class33(field1417, var57, field1406, method542(var55, var56, field1406) - var58, var59, var55, var56);
				field1167.method255(var60);
			}
		} else if (arg0 == 8) {
			int var61 = arg1.method239();
			int var62 = (var61 >> 4 & 0x7) + field1272;
			int var63 = (var61 & 0x7) + field1273;
			int var64 = arg1.method241();
			int var65 = arg1.method241();
			int var66 = arg1.method241();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1079 != var66) {
				class30 var67 = new class30();
				var67.field456 = var64;
				var67.field457 = var65;

				if (field1415[field1406][var62][var63] == null) {
					field1415[field1406][var62][var63] = new class42();
				}

				field1415[field1406][var62][var63].method255(var67);
				method560(var62, var63);
			}
		} else if (arg0 == 218) {
			int var68 = arg1.method239();
			int var69 = (var68 >> 4 & 0x7) + field1272;
			int var70 = (var68 & 0x7) + field1273;
			int var71 = arg1.method239();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1203[var72];
			int var75 = arg1.method241();
			int var76 = arg1.method241();
			int var77 = arg1.method241();
			int var78 = arg1.method241();
			byte var79 = arg1.method240();
			byte var80 = arg1.method240();
			byte var81 = arg1.method240();
			byte var82 = arg1.method240();
			class28 var83;
			if (field1079 == var78) {
				var83 = field1438;
			} else {
				var83 = field1251[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method334(var75);
				int var85 = field1232[field1406][var69][var70];
				int var86 = field1232[field1406][var69 + 1][var70];
				int var87 = field1232[field1406][var69 + 1][var70 + 1];
				int var88 = field1232[field1406][var69][var70 + 1];
				class32 var89 = var84.method340(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method474(var76 + 1, var74, field1406, var69, 0, var77 + 1, 0, var70, -1);
					var83.field433 = field1417 + var76;
					var83.field434 = field1417 + var77;
					var83.field438 = var89;
					int var90 = var84.field825;
					int var91 = var84.field826;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field826;
						var91 = var84.field825;
					}

					var83.field435 = var69 * 128 + var90 * 64;
					var83.field437 = var70 * 128 + var91 * 64;
					var83.field436 = method542(var83.field435, var83.field437, field1406);

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
		} else if (arg0 == 98) {
			int var94 = arg1.method239();
			int var95 = (var94 >> 4 & 0x7) + field1272;
			int var96 = (var94 & 0x7) + field1273;
			int var97 = arg1.method241();
			int var98 = arg1.method241();
			int var99 = arg1.method241();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1415[field1406][var95][var96];
				if (var100 != null) {
					for (class30 var101 = (class30) var100.method258(); var101 != null; var101 = (class30) var100.method260()) {
						if ((var97 & 0x7FFF) == var101.field456 && var101.field457 == var98) {
							var101.field457 = var99;
							break;
						}
					}

					method560(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILob;)V")
	public final void method446(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field642 == 0) {
			var2 = field1066.method90(arg0.field641, arg0.field643, arg0.field644);
		}

		if (arg0.field642 == 1) {
			var2 = field1066.method91(arg0.field641, arg0.field644, arg0.field643);
		}

		if (arg0.field642 == 2) {
			var2 = field1066.method92(arg0.field641, arg0.field643, arg0.field644);
		}

		if (arg0.field642 == 3) {
			var2 = field1066.method93(arg0.field641, arg0.field643, arg0.field644);
		}

		if (var2 != 0) {
			int var6 = field1066.method94(arg0.field641, arg0.field643, arg0.field644, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field645 = var3;
		arg0.field647 = var4;
		arg0.field646 = var5;
	}

	@ObfuscatedName("client.j(I)I")
	public final int method447() {
		int var1 = 3;
		if (field1322 < 310) {
			int var2 = field1319 >> 7;
			int var3 = field1321 >> 7;
			int var4 = field1438.field368 >> 7;
			int var5 = field1438.field369 >> 7;

			if ((field1069[field1406][var2][var3] & 0x4) != 0) {
				var1 = field1406;
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

					if ((field1069[field1406][var2][var3] & 0x4) != 0) {
						var1 = field1406;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1069[field1406][var2][var3] & 0x4) != 0) {
							var1 = field1406;
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

					if ((field1069[field1406][var2][var3] & 0x4) != 0) {
						var1 = field1406;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1069[field1406][var2][var3] & 0x4) != 0) {
							var1 = field1406;
						}
					}
				}
			}
		}

		if ((field1069[field1406][field1438.field368 >> 7][field1438.field369 >> 7] & 0x4) != 0) {
			var1 = field1406;
		}

		return var1;
	}

	@ObfuscatedName("client.k(I)I")
	public final int method448() {
		int var1 = method542(field1319, field1321, field1406);
		if (var1 - field1320 < 800 && (field1069[field1406][field1319 >> 7][field1321 >> 7] & 0x4) != 0) {
			return field1406;
		}

		return 3;
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

	@ObfuscatedName("client.a(IZI)V")
	public final void method449(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method450() {
		if (field1219 > 0) {
			method525();
		} else {
			field1104.method268();
			field1222.method214(257, "Connection lost", 144, 0);
			field1222.method214(256, "Connection lost", 143, 0xFFFFFF);
			field1222.method214(257, "Please wait - attempting to reestablish", 159, 0);
			field1222.method214(256, "Please wait - attempting to reestablish", 158, 0xFFFFFF);
			field1104.method269(field9, 4, 4);
			field1444 = 0;
			class5 var1 = field1047;
			field1263 = false;
			method439(field1387, field1388, true);

			if (!field1263) {
				method525();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.b(B)Z")
	public final boolean method451() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public final String method452(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ILmb;B)V")
	public final void method453(int arg0, class39 arg1) {
		while (arg1.field625 + 10 < arg0 * 8) {
			int var3 = arg1.method250(11);
			if (var3 == 2047) {
				break;
			}

			if (field1251[var3] == null) {
				field1251[var3] = new class28();
				if (field1256[var3] != null) {
					field1251[var3].method130(field1256[var3]);
				}
			}

			field1253[field1252++] = var3;
			class28 var4 = field1251[var3];
			var4.field413 = field1417;
			int var5 = arg1.method250(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method250(1);
			var4.method124(var7 == 1, field1438.field419[0] + var6, field1438.field418[0] + var5);
			int var8 = arg1.method250(1);
			if (var8 == 1) {
				field1255[field1254++] = var3;
			}
		}

		arg1.method251();
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method454() {
		for (class31 var1 = (class31) field1390.method258(); var1 != null; var1 = (class31) field1390.method260()) {
			if (field1406 != var1.field459 || field1417 > var1.field465) {
				var1.method120();
			} else if (field1417 >= var1.field464) {
				if (var1.field468 > 0) {
					class27 var2 = field1242[var1.field468 - 1];
					if (var2 != null && var2.field368 >= 0 && var2.field368 < 13312 && var2.field369 >= 0 && var2.field369 < 13312) {
						var1.method133(var2.field368, field1417, method542(var2.field368, var2.field369, var1.field459) - var1.field463, var2.field369);
					}
				}

				if (var1.field468 < 0) {
					int var3 = -var1.field468 - 1;
					class28 var4;
					if (field1079 == var3) {
						var4 = field1438;
					} else {
						var4 = field1251[var3];
					}

					if (var4 != null && var4.field368 >= 0 && var4.field368 < 13312 && var4.field369 >= 0 && var4.field369 < 13312) {
						var1.method133(var4.field368, field1417, method542(var4.field368, var4.field369, var1.field459) - var1.field463, var4.field369);
					}
				}

				var1.method134(field1091);
				field1066.method75(-1, (int) var1.field470, (int) var1.field472, var1, (int) var1.field471, field1406, 60, false, var1.field478);
			}
		}

		field1431++;
		if (field1431 > 1174) {
			field1431 = 0;
			field1274.method228(51);
			field1274.method229(0);
			int var5 = field1274.field624;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1274.method230(11499);
			}

			field1274.method230(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1274.method229(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1274.method229(94);
			}

			field1274.method230(51693);
			field1274.method229(16);
			field1274.method230(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1274.method229(65);
			}

			field1274.method229((int) (Math.random() * 256.0D));
			field1274.method230(22990);
			field1274.method238(field1274.field624 - var5);
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method455() {
		if (field1105 == null) {
			method539();
			field10 = null;
			field1422 = null;
			field1423 = null;
			field1424 = null;
			field1425 = null;
			field1426 = null;
			field1427 = null;
			field1428 = null;
			field1429 = null;
			field1430 = null;
			field1105 = new class44(479, 96, method11());
			field1103 = new class44(172, 156, method11());
			class34.method168();
			field1165.method212(0, 0);
			field1102 = new class44(190, 261, method11());
			field1104 = new class44(512, 334, method11());
			class34.method168();
			field1123 = new class44(496, 50, method11());
			field1124 = new class44(269, 37, method11());
			field1125 = new class44(249, 45, method11());
			field1200 = true;
		}
	}

	@ObfuscatedName("client.a(IBIIII)V")
	public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1066.method90(arg4, arg2, arg3);
		if (var6 != 0) {
			int var7 = field1066.method94(arg4, arg2, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field1446.field597;
			int var12 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
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
				class37 var15 = field1269[var14.field839];
				if (var15 != null) {
					int var16 = (var14.field825 * 4 - var15.field606) / 2;
					int var17 = (var14.field826 * 4 - var15.field607) / 2;
					var15.method212(arg2 * 4 + var16 + 48, (104 - arg3 - var14.field826) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1066.method92(arg4, arg2, arg3);
		if (var18 != 0) {
			int var19 = field1066.method94(arg4, arg2, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method334(var22);
			if (var23.field839 != -1) {
				class37 var24 = field1269[var23.field839];
				if (var24 != null) {
					int var25 = (var23.field825 * 4 - var24.field606) / 2;
					int var26 = (var23.field826 * 4 - var24.field607) / 2;
					var24.method212(arg2 * 4 + var25 + 48, (104 - arg3 - var23.field826) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1446.field597;
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

		int var30 = field1066.method93(arg4, arg2, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method334(var31);
			if (var32.field839 != -1) {
				class37 var33 = field1269[var32.field839];
				if (var33 != null) {
					int var34 = (var32.field825 * 4 - var33.field606) / 2;
					int var35 = (var32.field826 * 4 - var33.field607) / 2;
					var33.method212(arg2 * 4 + var34 + 48, (104 - arg3 - var32.field826) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 253);

			if (arg0.length == 5) {
				field1129 = Integer.parseInt(arg0[0]);
				field1130 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method480();
				} else if (arg0[2].equals("highmem")) {
					method470();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1131 = false;
				} else if (arg0[3].equals("members")) {
					field1131 = true;
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

	@ObfuscatedName("client.m(I)V")
	public final void method457() {
		int var1 = field1110;
		int var2 = field1111;
		int var3 = field1112;
		int var4 = field1113;
		int var5 = 0x5D5447;
		class34.method170(var5, var3, var2, var4, var1);
		class34.method170(0, var3 - 2, var2 + 1, 16, var1 + 1);
		class34.method171(var4 - 19, var2 + 18, var1 + 1, var3 - 2, 0);
		field1223.method217(var2 + 14, var5, "Choose Option", var1 + 3);
		int var6 = field17;
		int var7 = field18;
		if (field1109 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1109 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1109 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1359; var8++) {
			int var9 = (field1359 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1223.method219(var10, true, field1449[var8], var9, var1 + 3);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method458() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1055 = (field1055 + 1) % 4;
				field1338 = true;
				field1057 = true;
				field1274.method228(129);
				field1274.method229(field1055);
				field1274.method229(field1308);
				field1274.method229(field1068);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1308 = (field1308 + 1) % 3;
				field1338 = true;
				field1057 = true;
				field1274.method228(129);
				field1274.method229(field1055);
				field1274.method229(field1308);
				field1274.method229(field1068);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1068 = (field1068 + 1) % 3;
				field1338 = true;
				field1057 = true;
				field1274.method228(129);
				field1274.method229(field1055);
				field1274.method229(field1308);
				field1274.method229(field1068);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method521();
				field1395 = "";
				field1184 = false;

				for (int var1 = 0; var1 < class4.field56.length; var1++) {
					if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
						field1159 = field1238 = class4.field56[var1].field62;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method459() {
		if (field1355 == 0) {
			int var1 = field23;
			if (field1097 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1247) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1109 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1109 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1109 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1110 - 10 || var2 > field1112 + field1110 + 10 || var3 < field1111 - 10 || var3 > field1113 + field1111 + 10) {
						field1247 = false;

						if (field1109 == 1) {
							field1194 = true;
						}

						if (field1109 == 2) {
							field1057 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1110;
					int var5 = field1111;
					int var6 = field1112;
					int var7 = field24;
					int var8 = field25;
					if (field1109 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1109 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1109 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1359; var10++) {
						int var11 = (field1359 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method526(var9);
					}

					field1247 = false;

					if (field1109 == 1) {
						field1194 = true;
					}

					if (field1109 == 2) {
						field1057 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1359 > 0) {
					int var12 = field1349[field1359 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1347[field1359 - 1];
						int var14 = field1348[field1359 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1305 = false;
							field1306 = 0;
							field1353 = var14;
							field1354 = var13;
							field1355 = 2;
							field1356 = field24;
							field1357 = field25;

							if (class4.field56[var14].field62 == field1238) {
								field1355 = 1;
							}

							if (class4.field56[var14].field62 == field1220) {
								field1355 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1362 == 1 || method468(field1359 - 1)) && field1359 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1359 > 0) {
					method526(field1359 - 1);
				}

				if (var1 != 2 || field1359 <= 0) {
					return;
				}

				method475();
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method460(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1339; var3++) {
				if (field1161[var3] == arg0) {
					field1339--;
					field1194 = true;

					for (int var4 = var3; var4 < field1339; var4++) {
						field1161[var4] = field1161[var4 + 1];
					}

					field1274.method228(193);
					field1274.method235(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZI)V")
	public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = class32.field551[var7];
			int var13 = class32.field552[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class32.field551[var8];
			int var16 = class32.field552[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1319 = arg0 - var9;
		field1320 = arg5 - var10;
		field1321 = arg3 - var11;
		field1322 = arg4;
		field1323 = arg1;
	}

	@ObfuscatedName("client.d(III)V")
	public final void method462(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1116[var4] != null) {
				int var5 = field1114[var4];
				int var6 = field1186 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1115[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1055 == 0 || field1055 == 1 && method484(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1438.field424)) {
						if (field1367 >= 1) {
							field1449[field1359] = "Report abuse @whi@" + var7;
							field1349[field1359] = 524;
							field1359++;
						}

						field1449[field1359] = "Add ignore @whi@" + var7;
						field1349[field1359] = 47;
						field1359++;
						field1449[field1359] = "Add friend @whi@" + var7;
						field1349[field1359] = 605;
						field1359++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1361 == 0 && (var5 == 7 || field1308 == 0 || field1308 == 1 && method484(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1367 >= 1) {
							field1449[field1359] = "Report abuse @whi@" + var7;
							field1349[field1359] = 524;
							field1359++;
						}

						field1449[field1359] = "Add ignore @whi@" + var7;
						field1349[field1359] = 47;
						field1359++;
						field1449[field1359] = "Add friend @whi@" + var7;
						field1349[field1359] = 605;
						field1359++;
					}

					var3++;
				}

				if (var5 == 4 && (field1068 == 0 || field1068 == 1 && method484(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1449[field1359] = "Accept trade @whi@" + var7;
						field1349[field1359] = 507;
						field1359++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1361 == 0 && field1308 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1068 == 0 || field1068 == 1 && method484(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1449[field1359] = "Accept duel @whi@" + var7;
						field1349[field1359] = 957;
						field1359++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method463() {
		if (field1337 == 2) {
			method494((field1043 - field1314 << 7) + field1046, field1044 * 2, (field1042 - field1313 << 7) + field1045);

			if (field1094 > -1 && field1417 % 20 < 10) {
				field1377[2].method199(field1094 - 12, field1095 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method464(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public final void method465(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1154 != -1) {
			field1171 = arg1;
			field23 = 0;
		}

		if (field1220 == -1) {
			field1057 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1114[var4] = field1114[var4 - 1];
			field1115[var4] = field1115[var4 - 1];
			field1116[var4] = field1116[var4 - 1];
		}

		field1114[0] = arg2;
		field1115[0] = arg0;
		field1116[0] = arg1;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field1152 = arg0;
		field1309 = arg1;
		method486();

		if (field1176 == null) {
			super.method13(arg0, arg1);
		} else {
			field1424.method268();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1223.method214(var3 / 2, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class34.method171(34, var6, var3 / 2 - 152, 304, 0x8C1111);
			class34.method171(32, var6 + 1, var3 / 2 - 151, 302, 0);
			class34.method170(0x8C1111, arg0 * 3, var6 + 2, 30, var3 / 2 - 150);
			class34.method170(0, 300 - arg0 * 3, var6 + 2, 30, arg0 * 3 + var3 / 2 - 150);
			field1223.method214(var3 / 2, arg1, var4 / 2 + 5 - var5, 0xFFFFFF);
			field1424.method269(field9, 171, 202);

			if (field1200) {
				field1200 = false;

				if (!field1056) {
					field1425.method269(field9, 0, 0);
					field1426.method269(field9, 0, 637);
				}

				field1422.method269(field9, 0, 128);
				field1423.method269(field9, 371, 202);
				field1427.method269(field9, 265, 0);
				field1428.method269(field9, 265, 562);
				field1429.method269(field9, 171, 128);
				field1430.method269(field9, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method466(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 >> 14 & 0x7FFF;
		int var6 = field1066.method94(field1406, arg3, arg1, arg2);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1153++;
		if (field1153 > 1086) {
			field1153 = 0;
			field1274.method228(225);
			field1274.method229(0);
			int var9 = field1274.field624;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1274.method230(16791);
			}

			field1274.method229(254);
			field1274.method230((int) (Math.random() * 65536.0D));
			field1274.method230(16128);
			field1274.method230(52610);
			field1274.method230((int) (Math.random() * 65536.0D));
			field1274.method230(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1274.method230(35025);
			}

			field1274.method230(46628);
			field1274.method229((int) (Math.random() * 256.0D));
			field1274.method238(field1274.field624 - var9);
		}

		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var10 = class57.method334(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.field825;
				var12 = var10.field826;
			} else {
				var11 = var10.field826;
				var12 = var10.field825;
			}

			int var13 = var10.field848;
			if (var8 != 0) {
				var13 = (var13 >> 4 - var8) + (var13 << var8 & 0xF);
			}

			method442(2, var13, field1438.field418[0], 0, arg1, false, field1438.field419[0], 0, arg3, var12, var11);
		} else {
			method442(2, 0, field1438.field418[0], var8, arg1, false, field1438.field419[0], var7 + 1, arg3, 0, 0);
		}

		field1409 = field24;
		field1410 = field25;
		field1412 = 2;
		field1411 = 0;
		field1274.method228(arg0);
		field1274.method230(field1313 + arg3);
		field1274.method230(field1314 + arg1);
		field1274.method230(var5);
		return true;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method467() {
		field1405++;
		method535(true);
		method555(true);
		method535(false);
		method555(false);
		method454();
		method537();

		if (!field1258) {
			int var1 = field1147;
			if (field1311 / 256 > var1) {
				var1 = field1311 / 256;
			}

			if (field1180[4] && field1040[4] + 128 > var1) {
				var1 = field1040[4] + 128;
			}

			int var2 = field1441 + field1148 & 0x7FF;
			method461(field1157, var2, var1 * 3 + 600, field1158, var1, method542(field1438.field368, field1438.field369, field1406) - 50);
		}

		int var3;
		if (field1258) {
			var3 = method448();
		} else {
			var3 = method447();
		}

		int var4 = field1319;
		int var5 = field1320;
		int var6 = field1321;
		int var7 = field1322;
		int var8 = field1323;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1180[var9]) {
				int var10 = (int) (Math.random() * (field1145[var9] * 2 + 1) + Math.sin(field1235[var9] / 100.0D * field1450[var9]) * field1040[var9] - field1145[var9]);
				if (var9 == 0) {
					field1319 += var10;
				}

				if (var9 == 1) {
					field1320 += var10;
				}

				if (var9 == 2) {
					field1321 += var10;
				}

				if (var9 == 3) {
					field1323 = field1323 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1322 += var10;
					if (field1322 < 128) {
						field1322 = 128;
					}

					if (field1322 > 383) {
						field1322 = 383;
					}
				}
			}
		}

		int var11 = class35.field594;
		class32.field546 = true;
		class32.field549 = 0;
		class32.field547 = field17 - 4;
		class32.field548 = field18 - 4;
		class34.method168();
		field1066.method103(field1322, field1319, field1321, field1323, field1320, var3);
		field1066.method78();
		method511();
		method463();
		method492(var11);
		method503();
		field1104.method269(field9, 4, 4);
		field1319 = var4;
		field1320 = var5;
		field1321 = var6;
		field1322 = var7;
		field1323 = var8;
	}

	@ObfuscatedName("client.a(II)Z")
	public final boolean method468(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1349[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(BLkb;)V")
	public final void method469(class37 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1380.length; var3++) {
			field1380[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1380[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1381[var9] = (field1380[var9 - 1] + field1380[var9 + 1] + field1380[var9 - 128] + field1380[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1380;
			field1380 = field1381;
			field1381 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field607; var12++) {
				for (int var13 = 0; var13 < arg0.field606; var13++) {
					if (arg0.field604[var11++] != 0) {
						int var14 = var13 + arg0.field608 + 16;
						int var15 = var12 + arg0.field609 + 16;
						int var16 = (var15 << 7) + var14;
						field1380[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1047 != null) {
				field1047.method38();
			}
		} catch (Exception var1) {
		}

		field1047 = null;
		method518();

		if (field1229 != null) {
			field1229.field855 = false;
		}

		field1229 = null;
		field1050.method281();
		field1050 = null;
		field1274 = null;
		field1185 = null;
		field1234 = null;
		field1286 = null;
		field1233 = null;
		field1213 = null;
		field1287 = null;
		field1288 = null;
		field1232 = null;
		field1069 = null;
		field1066 = null;
		field1433 = null;
		field1266 = null;
		field1201 = null;
		field1064 = null;
		field1065 = null;
		field1374 = null;
		field1102 = null;
		field1103 = null;
		field1104 = null;
		field1105 = null;
		field1123 = null;
		field1124 = null;
		field1125 = null;
		field1328 = null;
		field1329 = null;
		field1330 = null;
		field1331 = null;
		field1332 = null;
		field1333 = null;
		field1334 = null;
		field1335 = null;
		field1336 = null;
		field1164 = null;
		field1165 = null;
		field1166 = null;
		field1060 = null;
		field1061 = null;
		field1062 = null;
		field1214 = null;
		field1134 = null;
		field1135 = null;
		field1136 = null;
		field1137 = null;
		field1138 = null;
		field1275 = null;
		field1276 = null;
		field1277 = null;
		field1278 = null;
		field1279 = null;
		field1248 = null;
		field1160 = null;
		field1377 = null;
		field1271 = null;
		field1343 = null;
		field1344 = null;
		field1345 = null;
		field1346 = null;
		field1269 = null;
		field1172 = null;
		field1443 = null;
		field1251 = null;
		field1253 = null;
		field1255 = null;
		field1256 = null;
		field1142 = null;
		field1242 = null;
		field1244 = null;
		field1415 = null;
		field1373 = null;
		field1390 = null;
		field1167 = null;
		field1347 = null;
		field1348 = null;
		field1349 = null;
		field1350 = null;
		field1449 = null;
		field1183 = null;
		field1365 = null;
		field1366 = null;
		field1413 = null;
		field1446 = null;
		field1059 = null;
		field1205 = null;
		field1187 = null;
		field1425 = null;
		field1426 = null;
		field1422 = null;
		field1423 = null;
		field1424 = null;
		field1427 = null;
		field1428 = null;
		field1429 = null;
		field1430 = null;
		method539();
		class57.method333();
		class59.method343();
		class60.method349();
		class63.field947 = null;
		class64.field960 = null;
		class4.field56 = null;
		class65.field967 = null;
		class66.field980 = null;
		class68.field999 = null;
		class68.field1011 = null;
		class70.field1019 = null;
		field10 = null;
		class28.field445 = null;
		class35.method177();
		class19.method63();
		class32.method135();
		class8.method60();
		System.gc();
	}

	@ObfuscatedName("client.p(I)V")
	public static final void method470() {
		class19.field266 = false;
		class35.field574 = false;
		field1132 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method471(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1449[field1359] = "Remove @whi@" + arg0.field97;
				field1349[field1359] = 884;
				field1359++;
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

		field1449[field1359] = "Remove @whi@" + field1059[var2];
		field1349[field1359] = 513;
		field1359++;
		field1449[field1359] = "Message @whi@" + field1059[var2];
		field1349[field1359] = 902;
		field1359++;
		return true;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method472() {
		field1151 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1370[var1] = -1;
			for (int var2 = 0; var2 < class64.field959; var2++) {
				if (!class64.field960[var2].field966 && class64.field960[var2].field961 == var1 + (field1039 ? 0 : 7)) {
					field1370[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method473() {
		if (field1361 != 0) {
			int var1 = 0;
			if (field1133 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1116[var2] != null) {
					int var3 = field1114[var2];
					String var4 = field1115[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1308 == 0 || field1308 == 1 && method484(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1222.method216("From:  " + var4 + field1116[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1367 >= 1) {
									field1449[field1359] = "Report abuse @whi@" + var4;
									field1349[field1359] = 2524;
									field1359++;
								}

								field1449[field1359] = "Add ignore @whi@" + var4;
								field1349[field1359] = 2047;
								field1359++;
								field1449[field1359] = "Add friend @whi@" + var4;
								field1349[field1359] = 2605;
								field1359++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1308 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1373.method258(); var11 != null; var11 = (class41) field1373.method260()) {
			if (var11.field641 == arg2 && var11.field643 == arg3 && var11.field644 == arg7 && var11.field642 == arg1) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field641 = arg2;
			var10.field642 = arg1;
			var10.field643 = arg3;
			var10.field644 = arg7;
			method446(var10);
			field1373.method255(var10);
		}

		var10.field648 = arg8;
		var10.field650 = arg4;
		var10.field649 = arg6;
		var10.field651 = arg0;
		var10.field652 = arg5;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method475() {
		int var1 = field1223.method216("Choose Option");
		for (int var2 = 0; var2 < field1359; var2++) {
			int var3 = field1223.method216(field1449[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1359 * 15 + 21;
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

			field1247 = true;
			field1109 = 0;
			field1110 = var5;
			field1111 = var6;
			field1112 = var1;
			field1113 = field1359 * 15 + 22;
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

			field1247 = true;
			field1109 = 1;
			field1110 = var7;
			field1111 = var8;
			field1112 = var1;
			field1113 = field1359 * 15 + 22;
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

			field1247 = true;
			field1109 = 2;
			field1110 = var9;
			field1111 = var10;
			field1112 = var1;
			field1113 = field1359 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(Ld;BI)I")
	public final int method476(class4 arg0, int arg1) {
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
					var8 = field1327[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1290[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1052[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field892 && (!class60.method350(var11).field913 || field1131)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1183[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1289[field1290[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1183[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1438.field430;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field995; var13++) {
						if (class67.field997[var13]) {
							var8 += field1290[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field892 && (!class60.method350(var15).field913 || field1131)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1174;
				}

				if (var7 == 12) {
					var8 = field1175;
				}

				if (var7 == 13) {
					int var17 = field1183[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1013[var19];
					int var21 = var20.field1015;
					int var22 = var20.field1016;
					int var23 = var20.field1017;
					int var24 = field1300[var23 - var22];
					var8 = field1183[var21] >> var22 & var24;
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
					var8 = (field1438.field368 >> 7) + field1313;
				}

				if (var7 == 19) {
					var8 = (field1438.field369 >> 7) + field1314;
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

	@ObfuscatedName("client.a(IZ)V")
	public final void method477(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(ILmb;Z)V")
	public final void method478(int arg0, class39 arg1) {
		field1141 = 0;
		field1254 = 0;
		method520(arg0, arg1);
		method538(arg1, arg0);
		method453(arg0, arg1);
		method532(arg0, arg1);

		for (int var3 = 0; var3 < field1141; var3++) {
			int var4 = field1142[var3];
			if (field1417 != field1251[var4].field413) {
				field1251[var4] = null;
			}
		}

		if (arg1.field624 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field624 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1252; var5++) {
			if (field1251[field1253[var5]] == null) {
				signlink.reporterror(field1387 + " null entry in pl list - pos:" + var5 + " size:" + field1252);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method479(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.s(I)V")
	public static final void method480() {
		class19.field266 = true;
		class35.field574 = true;
		field1132 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.a(ZILmb;)V")
	public final void method481(int arg0, class39 arg1) {
		arg1.method249();
		int var3 = arg1.method250(8);
		if (var3 < field1243) {
			for (int var4 = var3; var4 < field1243; var4++) {
				field1142[field1141++] = field1244[var4];
			}
		}

		if (var3 > field1243) {
			signlink.reporterror(field1387 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1243 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1244[var5];
			class27 var7 = field1242[var6];
			int var8 = arg1.method250(1);
			if (var8 == 0) {
				field1244[field1243++] = var6;
				var7.field413 = field1417;
			} else {
				int var9 = arg1.method250(2);
				if (var9 == 0) {
					field1244[field1243++] = var6;
					var7.field413 = field1417;
					field1255[field1254++] = var6;
				} else if (var9 == 1) {
					field1244[field1243++] = var6;
					var7.field413 = field1417;
					int var10 = arg1.method250(3);
					var7.method125(var10, false);
					int var11 = arg1.method250(1);
					if (var11 == 1) {
						field1255[field1254++] = var6;
					}
				} else if (var9 == 2) {
					field1244[field1243++] = var6;
					var7.field413 = field1417;
					int var12 = arg1.method250(3);
					var7.method125(var12, true);
					int var13 = arg1.method250(3);
					var7.method125(var13, true);
					int var14 = arg1.method250(1);
					if (var14 == 1) {
						field1255[field1254++] = var6;
					}
				} else if (var9 == 3) {
					field1142[field1141++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method482() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1226[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1226[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1227[var10] = (field1226[var10 - 1] + field1226[var10 + 1] + field1226[var10 - 128] + field1226[var10 + 128]) / 4;
			}
		}

		field1407 += 128;
		if (field1407 > field1380.length) {
			field1407 -= field1380.length;
			int var11 = (int) (Math.random() * 12.0D);
			method469(field1076[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1227[var14 + 128] - field1380[field1407 + var14 & field1380.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1226[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1304[var16] = field1304[var16 + 1];
		}

		field1304[var1 - 1] = (int) (Math.sin(field1417 / 14.0D) * 16.0D + Math.sin(field1417 / 15.0D) * 14.0D + Math.sin(field1417 / 16.0D) * 12.0D);

		if (field1384 > 0) {
			field1384 -= 4;
		}

		if (field1385 > 0) {
			field1385 -= 4;
		}

		if (field1384 == 0 && field1385 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1384 = 1024;
			}

			if (var17 == 1) {
				field1385 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method483() {
		if (field1372 == 2) {
			for (class41 var1 = (class41) field1373.method258(); var1 != null; var1 = (class41) field1373.method260()) {
				if (var1.field652 > 0) {
					var1.field652--;
				}

				if (var1.field652 != 0) {
					if (var1.field651 > 0) {
						var1.field651--;
					}

					if (var1.field651 == 0 && var1.field643 >= 1 && var1.field644 >= 1 && var1.field643 <= 102 && var1.field644 <= 102 && (var1.field648 < 0 || class3.method30(var1.field650, var1.field648))) {
						method510(var1.field650, var1.field644, var1.field642, var1.field649, var1.field643, var1.field648, var1.field641);
						var1.field651 = -1;

						if (var1.field648 == var1.field645 && var1.field645 == -1) {
							var1.method120();
						} else if (var1.field648 == var1.field645 && var1.field649 == var1.field646 && var1.field650 == var1.field647) {
							var1.method120();
						}
					}
				} else if (var1.field645 < 0 || class3.method30(var1.field647, var1.field645)) {
					method510(var1.field647, var1.field644, var1.field642, var1.field646, var1.field643, var1.field645, var1.field641);
					var1.method120();
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method484(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1302; var2++) {
			if (arg0.equalsIgnoreCase(field1059[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1438.field424)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method485() {
		if (field1440 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1440 = 3;
				field1225 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1053 = "";
				field1054 = "Enter your username & password.";
				field1440 = 2;
				field1225 = 0;
			}
		} else if (field1440 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1225 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1225 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method439(field1387, field1388, false);

				if (field1263) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1440 = 0;
				field1387 = "";
				field1388 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1202.length(); var10++) {
					if (var8 == field1202.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1225 == 0) {
					if (var8 == 8 && field1387.length() > 0) {
						field1387 = field1387.substring(0, field1387.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1225 = 1;
					}

					if (var9) {
						field1387 = field1387 + (char) var8;
					}

					if (field1387.length() > 12) {
						field1387 = field1387.substring(0, 12);
					}
				} else if (field1225 == 1) {
					if (var8 == 8 && field1388.length() > 0) {
						field1388 = field1388.substring(0, field1388.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1225 = 0;
					}

					if (var9) {
						field1388 = field1388 + (char) var8;
					}

					if (field1388.length() > 20) {
						field1388 = field1388.substring(0, 20);
					}
				}
			}
		} else if (field1440 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1440 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method486() {
		if (field1422 == null) {
			field10 = null;
			field1105 = null;
			field1103 = null;
			field1102 = null;
			field1104 = null;
			field1123 = null;
			field1124 = null;
			field1125 = null;
			field1425 = new class44(128, 265, method11());
			class34.method168();
			field1426 = new class44(128, 265, method11());
			class34.method168();
			field1422 = new class44(509, 171, method11());
			class34.method168();
			field1423 = new class44(360, 132, method11());
			class34.method168();
			field1424 = new class44(360, 200, method11());
			class34.method168();
			field1427 = new class44(202, 238, method11());
			class34.method168();
			field1428 = new class44(203, 238, method11());
			class34.method168();
			field1429 = new class44(74, 94, method11());
			class34.method168();
			field1430 = new class44(75, 94, method11());
			class34.method168();

			if (field1176 != null) {
				method523();
				method443();
			}

			field1200 = true;
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method487() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1195 + field1148 & 0x7FF;
				int var4 = class35.field583[var3];
				int var5 = class35.field584[var3];
				var4 = (field1261 + 256) * var4 >> 8;
				var5 = (field1261 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1438.field368 + var6 >> 7;
				int var9 = field1438.field369 - var7 >> 7;
				boolean var10 = method442(1, 0, field1438.field418[0], 0, var9, true, field1438.field419[0], 0, var8, 0, 0);
				if (var10) {
					field1274.method229(var1);
					field1274.method229(var2);
					field1274.method230(field1148);
					field1274.method229(57);
					field1274.method229(field1195);
					field1274.method229(field1261);
					field1274.method229(89);
					field1274.method230(field1438.field368);
					field1274.method230(field1438.field369);
					field1274.method229(field1382);
					field1274.method229(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1383) {
			field1169 = true;
		} else {
			field1383 = true;
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
						field1363[var3] = new class49(signlink.cache_dat, signlink.cache_idx[var3], 500000, var3 + 1);
					}
				}

				try {
					int var4 = 5;
					field1260[8] = 0;
					while (field1260[8] == 0) {
						method13(20, "Connecting to web server");

						try {
							DataInputStream var5 = method464("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field623, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1260[var7] = var6.method244();
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

					field1176 = method513("title", "title screen", field1260[1], 1, 25);
					field1221 = new class38(field1176, "p11");
					field1222 = new class38(field1176, "p12");
					field1223 = new class38(field1176, "b12");
					field1224 = new class38(field1176, "q8");
					method523();
					method443();
					class51 var9 = method513("config", "config", field1260[2], 2, 30);
					class51 var10 = method513("interface", "interface", field1260[3], 3, 35);
					class51 var11 = method513("media", "2d graphics", field1260[4], 4, 40);
					class51 var12 = method513("textures", "textures", field1260[6], 6, 45);
					class51 var13 = method513("wordenc", "chat system", field1260[7], 7, 50);
					class51 var14 = method513("sounds", "sound effects", field1260[8], 8, 55);
					field1069 = new byte[4][104][104];
					field1232 = new int[4][105][105];
					field1066 = new class19(104, 4, field1232, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1433[var15] = new class62(104, 104);
					}

					field1446 = new class36(512, 512);
					class51 var16 = method513("versionlist", "update list", field1260[5], 5, 60);
					method13(60, "Connecting to update server");
					field1050 = new class48();
					field1050.method280(var16, this);
					class8.method58(field1050.method283());
					class32.method136(field1050.method282(0), field1050);

					if (!field1132) {
						field1398 = 0;
						field1399 = false;
						field1050.method289(2, field1398);

						while (field1050.method290() > 0) {
							method519();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}
						}
					}

					method13(65, "Requesting animations");
					int var17 = field1050.method282(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1050.method289(1, var18);
					}

					while (field1050.method290() > 0) {
						int var19 = var17 - field1050.method290();
						if (var19 > 0) {
							method13(65, "Loading animations - " + var19 * 100 / var17 + "%");
						}

						method519();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}
					}

					method13(70, "Requesting models");
					int var20 = field1050.method282(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1050.method287(var21);
						if ((var22 & 0x1) != 0) {
							field1050.method289(0, var21);
						}
					}

					int var23 = field1050.method290();
					while (field1050.method290() > 0) {
						int var24 = var23 - field1050.method290();
						if (var24 > 0) {
							method13(70, "Loading models - " + var24 * 100 / var23 + "%");
						}

						method519();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field1363[0] != null) {
						method13(75, "Requesting maps");
						field1050.method289(3, field1050.method284(47, 48, 0));
						field1050.method289(3, field1050.method284(47, 48, 1));
						field1050.method289(3, field1050.method284(48, 48, 0));
						field1050.method289(3, field1050.method284(48, 48, 1));
						field1050.method289(3, field1050.method284(49, 48, 0));
						field1050.method289(3, field1050.method284(49, 48, 1));
						field1050.method289(3, field1050.method284(47, 47, 0));
						field1050.method289(3, field1050.method284(47, 47, 1));
						field1050.method289(3, field1050.method284(48, 47, 0));
						field1050.method289(3, field1050.method284(48, 47, 1));
						field1050.method289(3, field1050.method284(48, 148, 0));
						field1050.method289(3, field1050.method284(48, 148, 1));
						int var25 = field1050.method290();
						while (field1050.method290() > 0) {
							int var26 = var25 - field1050.method290();
							if (var26 > 0) {
								method13(75, "Loading maps - " + var26 * 100 / var25 + "%");
							}

							method519();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var27 = field1050.method282(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1050.method287(var28);
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
							field1050.method292(0, var28, var30);
						}
					}

					field1050.method285(field1131);

					if (!field1132) {
						int var31 = field1050.method282(2);
						for (int var32 = 1; var32 < var31; var32++) {
							if (field1050.method288(var32)) {
								field1050.method292(2, var32, (byte) 1);
							}
						}
					}

					method13(80, "Unpacking media");
					field1164 = new class37(var11, "invback", 0);
					field1166 = new class37(var11, "chatback", 0);
					field1165 = new class37(var11, "mapback", 0);
					field1060 = new class37(var11, "backbase1", 0);
					field1061 = new class37(var11, "backbase2", 0);
					field1062 = new class37(var11, "backhmid1", 0);

					for (int var33 = 0; var33 < 13; var33++) {
						field1214[var33] = new class37(var11, "sideicons", var33);
					}

					field1248 = new class36(var11, "compass", 0);
					field1386 = new class36(var11, "mapedge", 0);
					field1386.method196();

					try {
						for (int var34 = 0; var34 < 50; var34++) {
							field1269[var34] = new class37(var11, "mapscene", var34);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var35 = 0; var35 < 50; var35++) {
							field1172[var35] = new class36(var11, "mapfunction", var35);
						}
					} catch (Exception var78) {
					}

					try {
						for (int var36 = 0; var36 < 20; var36++) {
							field1160[var36] = new class36(var11, "hitmarks", var36);
						}
					} catch (Exception var77) {
					}

					try {
						for (int var37 = 0; var37 < 20; var37++) {
							field1377[var37] = new class36(var11, "headicons", var37);
						}
					} catch (Exception var76) {
					}

					field1092 = new class36(var11, "mapmarker", 0);
					field1093 = new class36(var11, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field1271[var38] = new class36(var11, "cross", var38);
					}

					field1343 = new class36(var11, "mapdots", 0);
					field1344 = new class36(var11, "mapdots", 1);
					field1345 = new class36(var11, "mapdots", 2);
					field1346 = new class36(var11, "mapdots", 3);
					field1378 = new class37(var11, "scrollbar", 0);
					field1379 = new class37(var11, "scrollbar", 1);
					field1134 = new class37(var11, "redstone1", 0);
					field1135 = new class37(var11, "redstone2", 0);
					field1136 = new class37(var11, "redstone3", 0);
					field1137 = new class37(var11, "redstone1", 0);
					field1137.method209();
					field1138 = new class37(var11, "redstone2", 0);
					field1138.method209();
					field1275 = new class37(var11, "redstone1", 0);
					field1275.method210();
					field1276 = new class37(var11, "redstone2", 0);
					field1276.method210();
					field1277 = new class37(var11, "redstone3", 0);
					field1277.method210();
					field1278 = new class37(var11, "redstone1", 0);
					field1278.method209();
					field1278.method210();
					field1279 = new class37(var11, "redstone2", 0);
					field1279.method209();
					field1279.method210();

					for (int var39 = 0; var39 < 2; var39++) {
						field1259[var39] = new class37(var11, "mod_icons", var39);
					}

					class36 var40 = new class36(var11, "backleft1", 0);
					field1328 = new class44(var40.field598, var40.field599, method11());
					var40.method197(0, 0);
					class36 var41 = new class36(var11, "backleft2", 0);
					field1329 = new class44(var41.field598, var41.field599, method11());
					var41.method197(0, 0);
					class36 var42 = new class36(var11, "backright1", 0);
					field1330 = new class44(var42.field598, var42.field599, method11());
					var42.method197(0, 0);
					class36 var43 = new class36(var11, "backright2", 0);
					field1331 = new class44(var43.field598, var43.field599, method11());
					var43.method197(0, 0);
					class36 var44 = new class36(var11, "backtop1", 0);
					field1332 = new class44(var44.field598, var44.field599, method11());
					var44.method197(0, 0);
					class36 var45 = new class36(var11, "backvmid1", 0);
					field1333 = new class44(var45.field598, var45.field599, method11());
					var45.method197(0, 0);
					class36 var46 = new class36(var11, "backvmid2", 0);
					field1334 = new class44(var46.field598, var46.field599, method11());
					var46.method197(0, 0);
					class36 var47 = new class36(var11, "backvmid3", 0);
					field1335 = new class44(var47.field598, var47.field599, method11());
					var47.method197(0, 0);
					class36 var48 = new class36(var11, "backhmid2", 0);
					field1336 = new class44(var48.field598, var48.field599, method11());
					var48.method197(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 50; var53++) {
						if (field1172[var53] != null) {
							field1172[var53].method195(var49 + var52, var50 + var52, var51 + var52);
						}

						if (field1269[var53] != null) {
							field1269[var53].method211(var49 + var52, var50 + var52, var51 + var52);
						}
					}

					method13(83, "Unpacking textures");
					class35.method182(var12);
					class35.method186(0.8D);
					class35.method181(20);
					method13(86, "Unpacking config");
					class66.method383(var9);
					class57.method332(var9);
					class63.method373(var9);
					class60.method348(var9);
					class59.method342(var9);
					class64.method377(var9);
					class68.method386(var9);
					class70.method391(var9);
					class69.method389(var9);
					class60.field897 = field1131;

					if (!field1132) {
						method13(90, "Unpacking sounds");
						byte[] var54 = var14.method309("sounds.dat", null);
						class39 var55 = new class39(var54);
						class55.method322(var55);
					}

					method13(95, "Unpacking interfaces");
					class38[] var56 = new class38[] { field1221, field1222, field1223, field1224 };
					class4.method32(var10, var56, var11);
					method13(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field1165.field604[field1165.field606 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field1351[var57] = var58;
						field1312[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field1165.field604[field1165.field606 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field1177[var61 - 5] = var62 - 25;
						field1122[var61 - 5] = var63 - var62;
					}

					class35.method179(96, 479);
					field1419 = class35.field585;
					class35.method179(261, 190);
					field1420 = class35.field585;
					class35.method179(334, 512);
					field1421 = class35.field585;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = class35.field583[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					class19.method100(512, 800, 500, 334, var65);
					class71.method393(var13);
					field1229 = new class58(this);
				} catch (Exception var81) {
					signlink.reporterror("loaderror " + field1309 + " " + field1152);
					field1408 = true;
				}
			} else {
				field1376 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method488(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method489() {
		if (field1132 && field1372 == 2 && class3.field33 != field1406) {
			field1104.method268();
			field1222.method214(257, "Loading - please wait.", 151, 0);
			field1222.method214(256, "Loading - please wait.", 150, 0xFFFFFF);
			field1104.method269(field9, 4, 4);
			field1372 = 1;
			field1198 = System.currentTimeMillis();
		}

		if (field1372 == 1) {
			int var1 = method490();
			if (var1 != 0 && System.currentTimeMillis() - field1198 > 360000L) {
				signlink.reporterror(field1387 + " glcfb " + field1264 + "," + var1 + "," + field1132 + "," + field1363[0] + "," + field1050.method290() + "," + field1406 + "," + field1210 + "," + field1211);
				field1198 = System.currentTimeMillis();
			}
		}

		if (field1372 == 2 && field1406 != field1397) {
			field1397 = field1406;
			method441(field1406);
		}
	}

	@ObfuscatedName("client.d(B)I")
	public final int method490() {
		for (int var1 = 0; var1 < field1233.length; var1++) {
			if (field1233[var1] == null && field1287[var1] != -1) {
				return -1;
			}

			if (field1213[var1] == null && field1288[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1233.length; var3++) {
			byte[] var4 = field1213[var3];
			if (var4 != null) {
				int var5 = (field1286[var3] >> 8) * 64 - field1313;
				int var6 = (field1286[var3] & 0xFF) * 64 - field1314;
				var2 &= class3.method16(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1078) {
			return -4;
		} else {
			field1372 = 2;
			class3.field33 = field1406;
			method556();
			field1274.method228(134);
			return 0;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method491() {
		if (field1355 == 0) {
			field1449[0] = "Cancel";
			field1349[0] = 1106;
			field1359 = 1;
			method473();
			field1182 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1238 == -1) {
					method541();
				} else {
					method434(4, class4.field56[field1238], field18, 0, 4, field17);
				}
			}

			if (field1182 != field1127) {
				field1127 = field1182;
			}

			field1182 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1212 != -1) {
					method434(553, class4.field56[field1212], field18, 0, 205, field17);
				} else if (field1310[field1206] != -1) {
					method434(553, class4.field56[field1310[field1206]], field18, 0, 205, field17);
				}
			}

			if (field1257 != field1182) {
				field1194 = true;
				field1257 = field1182;
			}

			field1182 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1220 != -1) {
					method434(17, class4.field56[field1220], field18, 0, 357, field17);
				} else if (field18 < 434 && field17 < 426) {
					method462(field18 - 357, field17 - 17);
				}
			}

			if (field1220 != -1 && field1197 != field1182) {
				field1057 = true;
				field1197 = field1182;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1359 - 1; var2++) {
					if (field1349[var2] < 1000 && field1349[var2 + 1] > 1000) {
						String var3 = field1449[var2];
						field1449[var2] = field1449[var2 + 1];
						field1449[var2 + 1] = var3;
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

	@ObfuscatedName("client.c(II)V")
	public final void method492(int arg0) {
		if (!field1132) {
			if (class35.field593[17] >= arg0) {
				class37 var2 = class35.field587[17];
				int var3 = var2.field607 * var2.field606 - 1;
				int var4 = field1091 * var2.field606 * 2;
				byte[] var5 = var2.field604;
				byte[] var6 = field1374;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field604 = var6;
				field1374 = var5;
				class35.method184(17);
			}

			if (class35.field593[24] >= arg0) {
				class37 var8 = class35.field587[24];
				int var9 = var8.field607 * var8.field606 - 1;
				int var10 = field1091 * var8.field606 * 2;
				byte[] var11 = var8.field604;
				byte[] var12 = field1374;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field604 = var12;
				field1374 = var11;
				class35.method184(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lz;BI)V")
	public final void method493(class26 arg0, int arg1) {
		method494(arg0.field369, arg1, arg0.field368);
	}

	@ObfuscatedName("client.a(IIIZ)V")
	public final void method494(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method542(arg2, arg0, field1406) - arg1;
			arg2 -= field1319;
			var4 -= field1320;
			arg0 -= field1321;
			int var5 = class32.field551[field1322];
			int var6 = class32.field552[field1322];
			int var7 = class32.field551[field1323];
			int var8 = class32.field552[field1323];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1094 = (var9 << 9) / arg0 + class35.field579;
				field1095 = (var11 << 9) / arg0 + class35.field580;
			} else {
				field1094 = -1;
				field1095 = -1;
			}
		} else {
			field1094 = -1;
			field1095 = -1;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method495(long arg0) {
		if (arg0 != 0L) {
			if (field1302 >= 100 && field1265 != 1) {
				method465("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field1302 >= 200) {
				method465("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = class52.method314(class52.method311(arg0));
				for (int var4 = 0; var4 < field1302; var4++) {
					if (field1205[var4] == arg0) {
						method465("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1339; var5++) {
					if (field1161[var5] == arg0) {
						method465("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field1438.field424)) {
					field1059[field1302] = var3;
					field1205[field1302] = arg0;
					field1187[field1302] = 0;
					field1302++;
					field1194 = true;
					field1274.method228(9);
					field1274.method235(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method496() {
		field1414 = 0;
		int var1 = (field1438.field368 >> 7) + field1313;
		int var2 = (field1438.field369 >> 7) + field1314;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1414 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1414 = 1;
		}

		if (field1414 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1414 = 0;
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method497() {
		field1105.method268();
		class35.field585 = field1419;
		field1166.method212(0, 0);

		if (field1447) {
			field1223.method214(239, field1307, 40, 0);
			field1223.method214(239, field1432 + "*", 60, 128);
		} else if (field1396) {
			field1223.method214(239, "Enter amount:", 40, 0);
			field1223.method214(239, field1436 + "*", 60, 128);
		} else if (field1171 != null) {
			field1223.method214(239, field1171, 40, 0);
			field1223.method214(239, "Click to continue", 60, 128);
		} else if (field1220 != -1) {
			method543(0, 0, class4.field56[field1220], 0);
		} else if (field1154 == -1) {
			class38 var1 = field1222;
			int var2 = 0;
			class34.method167(0, 0, 77, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1116[var3] != null) {
					int var4 = field1114[var3];
					int var5 = field1186 + 70 - var2 * 14;
					String var6 = field1115[var3];
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
							var1.method217(var5, 0, field1116[var3], 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1055 == 0 || field1055 == 1 && method484(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1259[0].method212(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1259[1].method212(var8, var5 - 12);
								var8 += 14;
							}

							var1.method217(var5, 0, var6 + ":", var8);
							var8 += var1.method216(var6) + 8;
							var1.method217(var5, 255, field1116[var3], var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1361 == 0 && (var4 == 7 || field1308 == 0 || field1308 == 1 && method484(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method217(var5, 0, "From", var9);
							int var11 = var9 + var1.method216("From ");
							if (var7 == 1) {
								field1259[0].method212(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1259[1].method212(var11, var5 - 12);
								var11 += 14;
							}

							var1.method217(var5, 0, var6 + ":", var11);
							var11 += var1.method216(var6) + 8;
							var1.method217(var5, 0x800000, field1116[var3], var11);
						}

						var2++;
					}

					if (var4 == 4 && (field1068 == 0 || field1068 == 1 && method484(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 0x800080, var6 + " " + field1116[var3], 4);
						}

						var2++;
					}

					if (var4 == 5 && field1361 == 0 && field1308 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 0x800000, field1116[var3], 4);
						}

						var2++;
					}

					if (var4 == 6 && field1361 == 0 && field1308 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 0, "To " + var6 + ":", 4);
							var1.method217(var5, 0x800000, field1116[var3], var1.method216("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field1068 == 0 || field1068 == 1 && method484(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(var5, 0x7E3200, var6 + " " + field1116[var3], 4);
						}

						var2++;
					}
				}
			}

			class34.method166();
			field1326 = var2 * 14 + 7;
			if (field1326 < 78) {
				field1326 = 78;
			}

			method508(field1326 - field1186 - 77, 0, 77, field1326, 463);
			String var10;
			if (field1438 == null || field1438.field424 == null) {
				var10 = class52.method314(field1387);
			} else {
				var10 = field1438.field424;
			}

			var1.method217(90, 0, var10 + ":", 4);
			var1.method217(90, 255, field1051 + "*", var1.method216(var10 + ": ") + 6);
			class34.method173(0, 77, 479, 0);
		} else {
			method543(0, 0, class4.field56[field1154], 0);
		}

		if (field1247 && field1109 == 2) {
			method457();
		}

		field1105.method269(field9, 357, 17);
		field1104.method268();
		class35.field585 = field1421;
	}

	@ObfuscatedName("client.a(IIILbb;Lmb;)V")
	public final void method498(int arg0, int arg1, class28 arg2, class39 arg3) {
		if ((arg1 & 0x1) == 1) {
			int var5 = arg3.method239();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg3.method248(var5, var6, 0);
			field1256[arg0] = var7;
			arg2.method130(var7);
		}

		if ((arg1 & 0x2) == 2) {
			int var8 = arg3.method241();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field396 == var8) {
				arg2.field400 = 0;
			}

			int var9 = arg3.method239();
			if (arg2.field396 == var8 && var8 != -1) {
				int var10 = class66.field980[var8].field994;
				if (var10 == 1) {
					arg2.field397 = 0;
					arg2.field398 = 0;
					arg2.field399 = var9;
					arg2.field400 = 0;
				}

				if (var10 == 2) {
					arg2.field400 = 0;
				}
			} else if (var8 == -1 || arg2.field396 == -1 || class66.field980[var8].field988 >= class66.field980[arg2.field396].field988) {
				arg2.field396 = var8;
				arg2.field397 = 0;
				arg2.field398 = 0;
				arg2.field399 = var9;
				arg2.field400 = 0;
				arg2.field422 = arg2.field417;
			}
		}

		if ((arg1 & 0x4) == 4) {
			arg2.field390 = arg3.method241();
			if (arg2.field390 == 0xFFFF) {
				arg2.field390 = -1;
			}
		}

		if ((arg1 & 0x8) == 8) {
			arg2.field380 = arg3.method246();
			arg2.field382 = 0;
			arg2.field383 = 0;
			arg2.field381 = 150;
			method465(arg2.field424, arg2.field380, 2);
		}

		if ((arg1 & 0x10) == 0x10) {
			int var11 = arg3.method239();
			int var12 = arg3.method239();
			arg2.method128(var12, var11);
			arg2.field387 = field1417 + 300;
			arg2.field388 = arg3.method239();
			arg2.field389 = arg3.method239();
		}

		if ((arg1 & 0x20) == 0x20) {
			arg2.field391 = arg3.method241();
			arg2.field392 = arg3.method241();
		}

		if ((arg1 & 0x40) == 0x40) {
			int var13 = arg3.method241();
			int var14 = arg3.method239();
			int var15 = arg3.method239();
			int var16 = arg3.field624;

			if (arg2.field424 != null && arg2.field425) {
				long var17 = class52.method310(arg2.field424);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1339; var20++) {
						if (field1161[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1414 == 0) {
					try {
						String var21 = class53.method317(var15, arg3);
						var21 = class71.method403(var21);
						arg2.field380 = var21;
						arg2.field382 = var13 >> 8;
						arg2.field383 = var13 & 0xFF;
						arg2.field381 = 150;

						if (var14 == 2 || var14 == 3) {
							method465("@cr2@" + arg2.field424, var21, 1);
						} else if (var14 == 1) {
							method465("@cr1@" + arg2.field424, var21, 1);
						} else {
							method465(arg2.field424, var21, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field624 = var15 + var16;
		}

		if ((arg1 & 0x100) == 0x100) {
			arg2.field401 = arg3.method241();
			int var23 = arg3.method244();
			arg2.field405 = var23 >> 16;
			arg2.field404 = (var23 & 0xFFFF) + field1417;
			arg2.field402 = 0;
			arg2.field403 = 0;

			if (arg2.field404 > field1417) {
				arg2.field402 = -1;
			}

			if (arg2.field401 == 0xFFFF) {
				arg2.field401 = -1;
			}
		}

		if ((arg1 & 0x200) == 0x200) {
			arg2.field406 = arg3.method239();
			arg2.field408 = arg3.method239();
			arg2.field407 = arg3.method239();
			arg2.field409 = arg3.method239();
			arg2.field410 = arg3.method241() + field1417;
			arg2.field411 = arg3.method241() + field1417;
			arg2.field412 = arg3.method239();
			arg2.method126();
		}

		if ((arg1 & 0x400) == 0x400) {
			int var24 = arg3.method239();
			int var25 = arg3.method239();
			arg2.method128(var25, var24);
			arg2.field387 = field1417 + 300;
			arg2.field388 = arg3.method239();
			arg2.field389 = arg3.method239();
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method9() {
		if (field1169 || field1408 || field1376) {
			method534();
		} else {
			field1209++;

			if (field1263) {
				method552();
			} else {
				method432(false);
			}

			field1048 = 0;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method499() {
		for (int var1 = -1; var1 < field1252; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1250;
			} else {
				var2 = field1253[var1];
			}

			class28 var3 = field1251[var2];
			if (var3 != null) {
				method546(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.x(I)Ljava/net/Socket;")
	public final Socket method500(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.j(Z)Z")
	public final boolean method501() {
		if (field1047 == null) {
			return false;
		}

		try {
			int var1 = field1047.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1216 == -1) {
				field1047.method41(field1234.field623, 0, 1);
				field1216 = field1234.field623[0] & 0xFF;
				if (field1324 != null) {
					field1216 = field1216 - field1324.method305() & 0xFF;
				}

				field1215 = class61.field940[field1216];
				var1--;
			}

			if (field1215 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1047.method41(field1234.field623, 0, 1);
				field1215 = field1234.field623[0] & 0xFF;
				var1--;
			}

			if (field1215 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1047.method41(field1234.field623, 0, 2);
				field1234.field624 = 0;
				field1215 = field1234.method241();
				var1 -= 2;
			}

			if (var1 < field1215) {
				return false;
			}

			field1234.field624 = 0;
			field1047.method41(field1234.field623, 0, field1215);
			field1217 = 0;
			field1299 = field1298;
			field1298 = field1297;
			field1297 = field1216;

			if (field1216 == 186) {
				int var2 = field1234.method241();
				byte var3 = field1234.method240();
				field1246[var2] = var3;

				if (field1183[var2] != var3) {
					field1183[var2] = var3;
					method559(var2);
					field1194 = true;

					if (field1154 != -1) {
						field1057 = true;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 29) {
				class39 var4 = class6.method47();
				if (var4 != null) {
					field1274.method228(142);
					field1274.method230(var4.field624);
					field1274.method237(0, var4.field624, var4.field623);
					var4.method227();
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 64) {
				field1337 = field1234.method239();
				if (field1337 == 1) {
					field1416 = field1234.method241();
				}

				if (field1337 >= 2 && field1337 <= 6) {
					if (field1337 == 2) {
						field1045 = 64;
						field1046 = 64;
					}

					if (field1337 == 3) {
						field1045 = 0;
						field1046 = 64;
					}

					if (field1337 == 4) {
						field1045 = 128;
						field1046 = 64;
					}

					if (field1337 == 5) {
						field1045 = 64;
						field1046 = 0;
					}

					if (field1337 == 6) {
						field1045 = 64;
						field1046 = 128;
					}

					field1337 = 2;
					field1042 = field1234.method241();
					field1043 = field1234.method241();
					field1044 = field1234.method239();
				}

				if (field1337 == 10) {
					field1163 = field1234.method241();
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 146) {
				field1178 = field1234.method244();
				field1389 = field1234.method241();
				field1239 = field1234.method239();
				field1371 = field1234.method241();
				field1108 = field1234.method239();
				if (field1178 != 0 && field1238 == -1) {
					signlink.dnslookup(class52.method313(field1178));
					method521();
					short var5 = 650;
					if (field1239 != 201 || field1108 == 1) {
						var5 = 655;
					}

					field1395 = "";
					field1184 = false;

					for (int var6 = 0; var6 < class4.field56.length; var6++) {
						if (class4.field56[var6] != null && class4.field56[var6].field65 == var5) {
							field1238 = class4.field56[var6].field62;
							break;
						}
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 227) {
				int var7 = field1234.method241();
				boolean var8 = field1234.method239() == 1;
				class4.field56[var7].field77 = var8;
				field1216 = -1;
				return true;
			}

			if (field1216 == 136) {
				field1194 = true;
				int var9 = field1234.method239();
				int var10 = field1234.method244();
				int var11 = field1234.method239();
				field1052[var9] = var10;
				field1327[var9] = var11;
				field1290[var9] = 1;
				for (int var12 = 0; var12 < 98; var12++) {
					if (var10 >= field1289[var12]) {
						field1290[var9] = var12 + 2;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 164) {
				if (field1206 == 12) {
					field1194 = true;
				}

				field1175 = field1234.method242();
				field1216 = -1;
				return true;
			}

			if (field1216 == 140) {
				for (int var13 = 0; var13 < field1183.length; var13++) {
					if (field1246[var13] != field1183[var13]) {
						field1183[var13] = field1246[var13];
						method559(var13);
						field1194 = true;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 14) {
				int var14 = field1234.method241();
				int var15 = field1234.method241();
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

				field1216 = -1;
				return true;
			}

			if (field1216 == 87) {
				method478(field1215, field1234);
				field1078 = false;
				field1216 = -1;
				return true;
			}

			if (field1216 == 159) {
				field1272 = field1234.method239();
				field1273 = field1234.method239();
				for (int var17 = field1272; var17 < field1272 + 8; var17++) {
					for (int var18 = field1273; var18 < field1273 + 8; var18++) {
						if (field1415[field1406][var17][var18] != null) {
							field1415[field1406][var17][var18] = null;
							method560(var17, var18);
						}
					}
				}

				for (class41 var19 = (class41) field1373.method258(); var19 != null; var19 = (class41) field1373.method260()) {
					if (var19.field643 >= field1272 && var19.field643 < field1272 + 8 && var19.field644 >= field1273 && var19.field644 < field1273 + 8 && field1406 == var19.field641) {
						var19.field652 = 0;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 251) {
				class6.method44();
				field1216 = -1;
				return true;
			}

			if (field1216 == 111) {
				long var20 = field1234.method245();
				int var22 = field1234.method239();
				String var23 = class52.method314(class52.method311(var20));
				for (int var24 = 0; var24 < field1302; var24++) {
					if (field1205[var24] == var20) {
						if (field1187[var24] != var22) {
							field1187[var24] = var22;
							field1194 = true;

							if (var22 > 0) {
								method465("", var23 + " has logged in.", 5);
							}

							if (var22 == 0) {
								method465("", var23 + " has logged out.", 5);
							}
						}

						var23 = null;
						break;
					}
				}

				if (var23 != null && field1302 < 200) {
					field1205[field1302] = var20;
					field1059[field1302] = var23;
					field1187[field1302] = var22;
					field1302++;
					field1194 = true;
				}

				boolean var25 = false;
				while (!var25) {
					var25 = true;
					for (int var26 = 0; var26 < field1302 - 1; var26++) {
						if (field1187[var26] != field1129 && field1187[var26 + 1] == field1129 || field1187[var26] == 0 && field1187[var26 + 1] != 0) {
							int var27 = field1187[var26];
							field1187[var26] = field1187[var26 + 1];
							field1187[var26 + 1] = var27;
							String var28 = field1059[var26];
							field1059[var26] = field1059[var26 + 1];
							field1059[var26 + 1] = var28;
							long var29 = field1205[var26];
							field1205[var26] = field1205[var26 + 1];
							field1205[var26 + 1] = var29;
							field1194 = true;
							var25 = false;
						}
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 5) {
				field1447 = false;
				field1396 = true;
				field1436 = "";
				field1057 = true;
				field1216 = -1;
				return true;
			}

			if (field1216 == 203) {
				for (int var31 = 0; var31 < field1251.length; var31++) {
					if (field1251[var31] != null) {
						field1251[var31].field396 = -1;
					}
				}

				for (int var32 = 0; var32 < field1242.length; var32++) {
					if (field1242[var32] != null) {
						field1242[var32].field396 = -1;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 73) {
				String var33 = field1234.method246();
				if (var33.endsWith(":tradereq:")) {
					String var34 = var33.substring(0, var33.indexOf(":"));
					long var35 = class52.method310(var34);
					boolean var37 = false;
					for (int var38 = 0; var38 < field1339; var38++) {
						if (field1161[var38] == var35) {
							var37 = true;
							break;
						}
					}

					if (!var37 && field1414 == 0) {
						method465(var34, "wishes to trade with you.", 4);
					}
				} else if (var33.endsWith(":duelreq:")) {
					String var39 = var33.substring(0, var33.indexOf(":"));
					long var40 = class52.method310(var39);
					boolean var42 = false;
					for (int var43 = 0; var43 < field1339; var43++) {
						if (field1161[var43] == var40) {
							var42 = true;
							break;
						}
					}

					if (!var42 && field1414 == 0) {
						method465(var39, "wishes to duel with you.", 8);
					}
				} else {
					method465("", var33, 0);
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 24) {
				field1055 = field1234.method239();
				field1308 = field1234.method239();
				field1068 = field1234.method239();
				field1338 = true;
				field1057 = true;
				field1216 = -1;
				return true;
			}

			if (field1216 == 63) {
				field1339 = field1215 / 8;
				for (int var44 = 0; var44 < field1339; var44++) {
					field1161[var44] = field1234.method245();
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 58) {
				field1107 = field1234.method239();
				if (field1206 == field1107) {
					if (field1107 == 3) {
						field1206 = 1;
					} else {
						field1206 = 3;
					}

					field1194 = true;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 95) {
				int var45 = field1234.method241();
				int var46 = field1234.method242();
				class4 var47 = class4.field56[var45];
				var47.field109 = var46;

				if (var46 == -1) {
					var47.field59 = 0;
					var47.field60 = 0;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 170) {
				field1194 = true;
				int var48 = field1234.method241();
				class4 var49 = class4.field56[var48];
				while (field1234.field624 < field1215) {
					int var50 = field1234.method239();
					int var51 = field1234.method241();
					int var52 = field1234.method239();
					if (var52 == 255) {
						var52 = field1234.method244();
					}

					if (var50 >= 0 && var50 < var49.field57.length) {
						var49.field57[var50] = var51;
						var49.field58[var50] = var52;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 108) {
				field1444 = 0;
				field1216 = -1;
				return true;
			}

			if (field1216 == 75) {
				field1292 = field1234.method239();
				field1216 = -1;
				return true;
			}

			if (field1216 == 27) {
				int var53 = field1234.method241();
				int var54 = field1234.method242();
				int var55 = field1234.method242();
				class4 var56 = class4.field56[var53];
				var56.field69 = var54;
				var56.field70 = var55;
				field1216 = -1;
				return true;
			}

			if (field1216 == 197) {
				int var57 = field1234.method241();
				method515(var57);

				if (field1212 != -1) {
					field1212 = -1;
					field1194 = true;
					field1237 = true;
				}

				if (field1220 != -1) {
					field1220 = -1;
					field1057 = true;
				}

				if (field1396) {
					field1396 = false;
					field1057 = true;
				}

				field1238 = var57;
				field1063 = false;
				field1216 = -1;
				return true;
			}

			if (field1216 == 141) {
				int var58 = field1234.method241();
				method515(var58);

				if (field1212 != -1) {
					field1212 = -1;
					field1194 = true;
					field1237 = true;
				}

				field1220 = var58;
				field1057 = true;
				field1238 = -1;
				field1063 = false;
				field1216 = -1;
				return true;
			}

			if (field1216 == 85) {
				int var59 = field1234.method242();
				if (var59 >= 0) {
					method515(var59);
				}

				field1106 = var59;
				field1216 = -1;
				return true;
			}

			if (field1216 == 94) {
				if (field1206 == 12) {
					field1194 = true;
				}

				field1174 = field1234.method239();
				field1216 = -1;
				return true;
			}

			if (field1216 == 91) {
				int var60 = field1234.method241();
				int var61 = field1234.method239();

				if (var60 == 0xFFFF) {
					var60 = -1;
				}

				field1310[var61] = var60;
				field1194 = true;
				field1237 = true;
				field1216 = -1;
				return true;
			}

			if (field1216 == 55) {
				field1258 = true;
				field1071 = field1234.method239();
				field1072 = field1234.method239();
				field1073 = field1234.method241();
				field1074 = field1234.method239();
				field1075 = field1234.method239();
				if (field1075 >= 100) {
					field1319 = field1071 * 128 + 64;
					field1321 = field1072 * 128 + 64;
					field1320 = method542(field1319, field1321, field1406) - field1073;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 173) {
				field1272 = field1234.method239();
				field1273 = field1234.method239();
				field1216 = -1;
				return true;
			}

			if (field1216 == 163) {
				int var62 = field1234.method241();
				if (var62 == 0xFFFF) {
					var62 = -1;
				}

				if (field1144 != var62 && field1291 && !field1132 && field1280 == 0) {
					field1398 = var62;
					field1399 = true;
					field1050.method289(2, field1398);
				}

				field1144 = var62;
				field1216 = -1;
				return true;
			}

			if (field1216 == 242) {
				int var63 = field1234.method241();
				int var64 = field1234.method241();
				if (field1291 && !field1132) {
					field1398 = var63;
					field1399 = false;
					field1050.method289(2, field1398);
					field1280 = var64;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 60) {
				long var65 = field1234.method245();
				int var67 = field1234.method244();
				int var68 = field1234.method239();
				boolean var69 = false;
				for (int var70 = 0; var70 < 100; var70++) {
					if (field1268[var70] == var67) {
						var69 = true;
						break;
					}
				}

				if (var68 <= 1) {
					for (int var71 = 0; var71 < field1339; var71++) {
						if (field1161[var71] == var65) {
							var69 = true;
							break;
						}
					}
				}

				if (!var69 && field1414 == 0) {
					try {
						field1268[field1358] = var67;
						field1358 = (field1358 + 1) % 100;
						String var72 = class53.method317(field1215 - 13, field1234);
						var72 = class71.method403(var72);
						if (var68 == 2 || var68 == 3) {
							method465("@cr2@" + class52.method314(class52.method311(var65)), var72, 7);
						} else if (var68 == 1) {
							method465("@cr1@" + class52.method314(class52.method311(var65)), var72, 7);
						} else {
							method465(class52.method314(class52.method311(var65)), var72, 3);
						}
					} catch (Exception var157) {
						signlink.reporterror("cde1");
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 3) {
				int var74 = field1234.method241();
				int var75 = field1234.method241();
				class4.field56[var74].field105 = 2;
				class4.field56[var74].field106 = var75;
				field1216 = -1;
				return true;
			}

			if (field1216 == 213) {
				field1079 = field1234.method241();
				field1265 = field1234.method239();
				field1216 = -1;
				return true;
			}

			if (field1216 == 143) {
				field1133 = field1234.method241() * 30;
				field1216 = -1;
				return true;
			}

			if (field1216 == 168) {
				int var76 = field1234.method241();
				class4 var77 = class4.field56[var76];
				for (int var78 = 0; var78 < var77.field57.length; var78++) {
					var77.field57[var78] = -1;
					var77.field57[var78] = 0;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 21) {
				method525();
				field1216 = -1;
				return false;
			}

			if (field1216 == 98 || field1216 == 218 || field1216 == 8 || field1216 == 114 || field1216 == 37 || field1216 == 115 || field1216 == 120 || field1216 == 30 || field1216 == 88 || field1216 == 70) {
				method445(field1216, field1234);
				field1216 = -1;
				return true;
			}

			if (field1216 == 211) {
				int var79 = field1234.method241();
				int var80 = field1234.method241();
				class4.field56[var79].field105 = 1;
				class4.field56[var79].field106 = var80;
				field1216 = -1;
				return true;
			}

			if (field1216 == 138) {
				field1206 = field1234.method239();
				field1194 = true;
				field1237 = true;
				field1216 = -1;
				return true;
			}

			if (field1216 == 61) {
				field1272 = field1234.method239();
				field1273 = field1234.method239();

				while (field1234.field624 < field1215) {
					int var81 = field1234.method239();
					method445(var81, field1234);
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 41) {
				int var82 = field1234.method241();
				String var83 = field1234.method246();
				class4.field56[var82].field97 = var83;

				if (field1310[field1206] == class4.field56[var82].field62) {
					field1194 = true;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 225) {
				int var84 = field1234.method239();
				int var85 = field1234.method239();
				int var86 = field1234.method239();
				int var87 = field1234.method239();
				field1180[var84] = true;
				field1145[var84] = var85;
				field1040[var84] = var86;
				field1235[var84] = var87;
				field1450[var84] = 0;
				field1216 = -1;
				return true;
			}

			if (field1216 == 0) {
				field1258 = true;
				field1189 = field1234.method239();
				field1190 = field1234.method239();
				field1191 = field1234.method241();
				field1192 = field1234.method239();
				field1193 = field1234.method239();
				if (field1193 >= 100) {
					int var88 = field1189 * 128 + 64;
					int var89 = field1190 * 128 + 64;
					int var90 = method542(var88, var89, field1406) - field1191;
					int var91 = var88 - field1319;
					int var92 = var90 - field1320;
					int var93 = var89 - field1321;
					int var94 = (int) Math.sqrt(var91 * var91 + var93 * var93);
					field1322 = (int) (Math.atan2(var92, var94) * 325.949D) & 0x7FF;
					field1323 = (int) (Math.atan2(var91, var93) * -325.949D) & 0x7FF;

					if (field1322 < 128) {
						field1322 = 128;
					}

					if (field1322 > 383) {
						field1322 = 383;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 38) {
				int var95 = field1234.method241();
				int var96 = field1234.method241();
				int var97 = var96 >> 10 & 0x1F;
				int var98 = var96 >> 5 & 0x1F;
				int var99 = var96 & 0x1F;
				class4.field56[var95].field99 = (var99 << 3) + (var97 << 19) + (var98 << 11);
				field1216 = -1;
				return true;
			}

			if (field1216 == 204) {
				int var100 = field1234.method239();
				int var101 = field1234.method239();
				String var102 = field1234.method246();
				if (var100 >= 1 && var100 <= 5) {
					if (var102.equalsIgnoreCase("null")) {
						var102 = null;
					}

					field1139[var100 - 1] = var102;
					field1140[var100 - 1] = var101 == 0;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 25) {
				int var103 = field1234.method241();
				int var104 = field1234.method239();
				int var105 = field1234.method241();
				if (field1155 && !field1132 && field1394 < 50) {
					field1188[field1394] = var103;
					field1318[field1394] = var104;
					field1451[field1394] = class55.field783[var103] + var105;
					field1394++;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 174) {
				if (field1212 != -1) {
					field1212 = -1;
					field1194 = true;
					field1237 = true;
				}

				if (field1220 != -1) {
					field1220 = -1;
					field1057 = true;
				}

				if (field1396) {
					field1396 = false;
					field1057 = true;
				}

				field1238 = -1;
				field1063 = false;
				field1216 = -1;
				return true;
			}

			if (field1216 == 222) {
				int var106 = field1234.method241();
				int var107 = field1234.method241();
				int var108 = field1234.method241();
				class60 var109 = class60.method350(var107);
				class4.field56[var106].field105 = 4;
				class4.field56[var106].field106 = var107;
				class4.field56[var106].field112 = var109.field905;
				class4.field56[var106].field113 = var109.field906;
				class4.field56[var106].field111 = var109.field904 * 100 / var108;
				field1216 = -1;
				return true;
			}

			if (field1216 == 161) {
				int var110 = field1234.method241();
				class4.field56[var110].field105 = 3;
				class4.field56[var110].field106 = (field1438.field428[8] << 6) + (field1438.field428[0] << 12) + (field1438.field429[0] << 24) + (field1438.field429[4] << 18) + field1438.field428[11];
				field1216 = -1;
				return true;
			}

			if (field1216 == 255) {
				field1303 = field1234.method239();
				field1194 = true;
				field1216 = -1;
				return true;
			}

			if (field1216 == 123) {
				method505(field1215, field1234);
				field1216 = -1;
				return true;
			}

			if (field1216 == 187) {
				int var111 = field1234.method241();
				method515(var111);

				if (field1220 != -1) {
					field1220 = -1;
					field1057 = true;
				}

				if (field1396) {
					field1396 = false;
					field1057 = true;
				}

				field1212 = var111;
				field1194 = true;
				field1237 = true;
				field1238 = -1;
				field1063 = false;
				field1216 = -1;
				return true;
			}

			if (field1216 == 249) {
				int var112 = field1234.method241();
				int var113 = field1234.method241();

				if (field1220 != -1) {
					field1220 = -1;
					field1057 = true;
				}

				if (field1396) {
					field1396 = false;
					field1057 = true;
				}

				field1238 = var112;
				field1212 = var113;
				field1194 = true;
				field1237 = true;
				field1063 = false;
				field1216 = -1;
				return true;
			}

			if (field1216 == 196) {
				int var114 = field1234.method241();
				int var115 = field1234.method244();
				field1246[var114] = var115;

				if (field1183[var114] != var115) {
					field1183[var114] = var115;
					method559(var114);
					field1194 = true;

					if (field1154 != -1) {
						field1057 = true;
					}
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 239) {
				int var116 = field1234.method242();
				field1154 = var116;
				field1057 = true;
				field1216 = -1;
				return true;
			}

			if (field1216 == 167) {
				field1258 = false;

				for (int var117 = 0; var117 < 5; var117++) {
					field1180[var117] = false;
				}

				field1216 = -1;
				return true;
			}

			if (field1216 == 209) {
				int var118 = field1234.method241();
				int var119 = field1234.method241();
				if (field1210 == var118 && field1211 == var119 && field1372 == 2) {
					field1216 = -1;
					return true;
				}

				field1210 = var118;
				field1211 = var119;
				field1313 = (field1210 - 6) * 8;
				field1314 = (field1211 - 6) * 8;
				field1437 = false;
				if ((field1210 / 8 == 48 || field1210 / 8 == 49) && field1211 / 8 == 48) {
					field1437 = true;
				}

				if (field1210 / 8 == 48 && field1211 / 8 == 148) {
					field1437 = true;
				}

				field1372 = 1;
				field1198 = System.currentTimeMillis();
				field1104.method268();
				field1222.method214(257, "Loading - please wait.", 151, 0);
				field1222.method214(256, "Loading - please wait.", 150, 0xFFFFFF);
				field1104.method269(field9, 4, 4);
				int var120 = 0;
				for (int var121 = (field1210 - 6) / 8; var121 <= (field1210 + 6) / 8; var121++) {
					for (int var122 = (field1211 - 6) / 8; var122 <= (field1211 + 6) / 8; var122++) {
						var120++;
					}
				}

				field1233 = new byte[var120][];
				field1213 = new byte[var120][];
				field1286 = new int[var120];
				field1287 = new int[var120];
				field1288 = new int[var120];
				int var123 = 0;
				for (int var124 = (field1210 - 6) / 8; var124 <= (field1210 + 6) / 8; var124++) {
					for (int var125 = (field1211 - 6) / 8; var125 <= (field1211 + 6) / 8; var125++) {
						field1286[var123] = (var124 << 8) + var125;

						if (field1437 && (var125 == 49 || var125 == 149 || var125 == 147 || var124 == 50 || var124 == 49 && var125 == 47)) {
							field1287[var123] = -1;
							field1288[var123] = -1;
							var123++;
						} else {
							int var126 = field1287[var123] = field1050.method284(var124, var125, 0);
							if (var126 != -1) {
								field1050.method289(3, var126);
							}

							int var127 = field1288[var123] = field1050.method284(var124, var125, 1);
							if (var127 != -1) {
								field1050.method289(3, var127);
							}

							var123++;
						}
					}
				}

				int var128 = field1313 - field1315;
				int var129 = field1314 - field1316;
				field1315 = field1313;
				field1316 = field1314;

				for (int var130 = 0; var130 < 16384; var130++) {
					class27 var131 = field1242[var130];
					if (var131 != null) {
						for (int var132 = 0; var132 < 10; var132++) {
							var131.field418[var132] -= var128;
							var131.field419[var132] -= var129;
						}

						var131.field368 -= var128 * 128;
						var131.field369 -= var129 * 128;
					}
				}

				for (int var133 = 0; var133 < field1249; var133++) {
					class28 var134 = field1251[var133];
					if (var134 != null) {
						for (int var135 = 0; var135 < 10; var135++) {
							var134.field418[var135] -= var128;
							var134.field419[var135] -= var129;
						}

						var134.field368 -= var128 * 128;
						var134.field369 -= var129 * 128;
					}
				}

				field1078 = true;
				byte var136 = 0;
				byte var137 = 104;
				byte var138 = 1;
				if (var128 < 0) {
					var136 = 103;
					var137 = -1;
					var138 = -1;
				}

				byte var139 = 0;
				byte var140 = 104;
				byte var141 = 1;
				if (var129 < 0) {
					var139 = 103;
					var140 = -1;
					var141 = -1;
				}

				for (int var142 = var136; var142 != var137; var142 += var138) {
					for (int var143 = var139; var143 != var140; var143 += var141) {
						int var144 = var128 + var142;
						int var145 = var129 + var143;
						for (int var146 = 0; var146 < 4; var146++) {
							if (var144 >= 0 && var145 >= 0 && var144 < 104 && var145 < 104) {
								field1415[var146][var142][var143] = field1415[var146][var144][var145];
							} else {
								field1415[var146][var142][var143] = null;
							}
						}
					}
				}

				for (class41 var147 = (class41) field1373.method258(); var147 != null; var147 = (class41) field1373.method260()) {
					var147.field643 -= var128;
					var147.field644 -= var129;
					if (var147.field643 < 0 || var147.field644 < 0 || var147.field643 >= 104 || var147.field644 >= 104) {
						var147.method120();
					}
				}

				if (field1444 != 0) {
					field1444 -= var128;
					field1445 -= var129;
				}

				field1258 = false;
				field1216 = -1;
				return true;
			}

			if (field1216 == 28) {
				field1194 = true;
				int var148 = field1234.method241();
				class4 var149 = class4.field56[var148];
				int var150 = field1234.method239();
				for (int var151 = 0; var151 < var150; var151++) {
					var149.field57[var151] = field1234.method241();
					int var152 = field1234.method239();
					if (var152 == 255) {
						var152 = field1234.method244();
					}

					var149.field58[var151] = var152;
				}

				for (int var153 = var150; var153 < var149.field57.length; var153++) {
					var149.field57[var153] = 0;
					var149.field58[var153] = 0;
				}

				field1216 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1216 + "," + field1215 + " - " + field1298 + "," + field1299);
			method525();
		} catch (IOException var158) {
			method450();
		} catch (Exception var159) {
			String var155 = "T2 - " + field1216 + "," + field1298 + "," + field1299 + " - " + field1215 + "," + (field1438.field418[0] + field1313) + "," + (field1438.field419[0] + field1314) + " - ";
			for (int var156 = 0; var156 < field1215 && var156 < 50; var156++) {
				var155 = var155 + field1234.field623[var156] + ",";
			}

			signlink.reporterror(var155);
			method525();
		}

		return true;
	}

	@ObfuscatedName("client.a(Ld;I)V")
	public final void method502(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1303 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1303 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1303 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1302;
				if (field1303 != 2) {
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
					arg0.field97 = field1059[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1302;
			if (field1303 != 2) {
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
				if (field1187[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1187[var2] == field1129) {
					arg0.field97 = "@gre@World-" + (field1187[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1187[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1302;
			if (field1303 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1339) {
				arg0.field97 = "";
				arg0.field64 = 0;
			} else {
				arg0.field97 = class52.method314(class52.method311(field1161[var2]));
				arg0.field64 = 1;
			}
		} else if (var2 == 503) {
			arg0.field75 = field1339 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1417 / 40.0D) * 256.0D) & 0x7FF;

			if (field1151) {
				for (int var6 = 0; var6 < 7; var6++) {
					int var7 = field1370[var6];
					if (var7 >= 0 && !class64.field960[var7].method379()) {
						return;
					}
				}

				field1151 = false;
				class32[] var8 = new class32[7];
				int var9 = 0;
				for (int var10 = 0; var10 < 7; var10++) {
					int var11 = field1370[var10];
					if (var11 >= 0) {
						var8[var9++] = class64.field960[var11].method380();
					}
				}

				class32 var12 = new class32(var8, var9);
				for (int var13 = 0; var13 < 5; var13++) {
					if (field1281[var13] != 0) {
						var12.method153(field1204[var13][0], field1204[var13][field1281[var13]]);

						if (var13 == 1) {
							var12.method153(field1439[0], field1439[field1281[var13]]);
						}
					}
				}

				var12.method146();
				var12.method147(class66.field980[field1438.field373].field982[0]);
				var12.method156(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(var12, 5, 0);
			}
		} else if (var2 == 324) {
			if (field1368 == null) {
				field1368 = arg0.field103;
				field1369 = arg0.field104;
			}

			if (field1039) {
				arg0.field103 = field1369;
			} else {
				arg0.field103 = field1368;
			}
		} else if (var2 == 325) {
			if (field1368 == null) {
				field1368 = arg0.field103;
				field1369 = arg0.field104;
			}

			if (field1039) {
				arg0.field103 = field1368;
			} else {
				arg0.field103 = field1369;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1395;
			if (field1417 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1367 < 1) {
				arg0.field97 = "";
			} else if (field1184) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1178 == 0) {
				arg0.field97 = "";
			} else {
				String var14;
				if (field1389 == 0) {
					var14 = "earlier today";
				} else if (field1389 == 1) {
					var14 = "yesterday";
				} else {
					var14 = field1389 + " days ago";
				}

				arg0.field97 = "You last logged in " + var14 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1371 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1371 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1371 > 1) {
				arg0.field97 = field1371 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1239 == 201) {
				if (field1108 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1239 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var15;
				if (field1239 == 0) {
					var15 = "Earlier today";
				} else if (field1239 == 1) {
					var15 = "Yesterday";
				} else {
					var15 = field1239 + " days ago";
				}

				arg0.field97 = var15 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1239 == 201) {
				if (field1108 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1239 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1239 == 201) {
				if (field1108 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1239 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method503() {
		method444();

		if (field1412 == 1) {
			field1271[field1411 / 100].method199(field1409 - 8 - 4, field1410 - 8 - 4);
		}

		if (field1412 == 2) {
			field1271[field1411 / 100 + 4].method199(field1409 - 8 - 4, field1410 - 8 - 4);
			field1070++;
			if (field1070 > 57) {
				field1070 = 0;
				field1274.method228(100);
			}
		}

		if (field1106 != -1) {
			method536(field1106, field1091);
			method543(0, 0, class4.field56[field1106], 0);
		}

		if (field1238 != -1) {
			method536(field1238, field1091);
			method543(0, 0, class4.field56[field1238], 0);
		}

		method496();

		if (!field1247) {
			method491();
			method435();
		} else if (field1109 == 0) {
			method457();
		}

		if (field1292 == 1) {
			field1377[1].method199(472, 296);
		}

		if (field1133 != 0) {
			int var1 = field1133 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1222.method217(329, 0xFFFF00, "System update in: " + var2 + ":0" + var1, 4);
			} else {
				field1222.method217(329, 0xFFFF00, "System update in: " + var2 + ":" + var1, 4);
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method504() {
		for (int var1 = -1; var1 < field1252; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1250;
			} else {
				var2 = field1253[var1];
			}

			class28 var3 = field1251[var2];
			if (var3 != null && var3.field381 > 0) {
				var3.field381--;
				if (var3.field381 == 0) {
					var3.field380 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1243; var4++) {
			int var5 = field1244[var4];
			class27 var6 = field1242[var5];
			if (var6 != null && var6.field381 > 0) {
				var6.field381--;
				if (var6.field381 == 0) {
					var6.field380 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method505(int arg0, class39 arg1) {
		field1141 = 0;
		field1254 = 0;
		method481(arg0, arg1);
		method527(arg0, arg1);
		method561(arg1, arg0);

		for (int var3 = 0; var3 < field1141; var3++) {
			int var4 = field1142[var3];
			if (field1417 != field1242[var4].field413) {
				field1242[var4].field423 = null;
				field1242[var4] = null;
			}
		}

		if (arg1.field624 != arg0) {
			signlink.reporterror(field1387 + " size mismatch in getnpcpos - pos:" + arg1.field624 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1243; var5++) {
			if (field1242[field1244[var5]] == null) {
				signlink.reporterror(field1387 + " null entry in npc list - pos:" + var5 + " size:" + field1243);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljb;IBI)V")
	public final void method506(class36 arg0, int arg1, int arg2) {
		int var4 = field1195 + field1148 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class32.field551[var4];
			int var7 = class32.field552[var4];
			var6 = var6 * 256 / (field1261 + 256);
			var7 = var7 * 256 / (field1261 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method205(83 - var9 - arg0.field603 / 2 - 4, var8 + 94 - arg0.field602 / 2 + 4, field1165);
			} else {
				arg0.method199(var8 + 94 + 4 - arg0.field602 / 2, 83 - var9 - arg0.field603 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method507() {
		if (field1133 > 1) {
			field1133--;
		}

		if (field1219 > 0) {
			field1219--;
		}

		for (int var1 = 0; var1 < 5 && method501(); var1++) {
		}

		if (field1263) {
			method489();
			method483();
			method553();
			class39 var2 = class6.method46();
			if (var2 != null) {
				field1274.method228(142);
				field1274.method230(var2.field624);
				field1274.method237(0, var2.field624, var2.field623);
				var2.method227();
			}

			field1217++;
			if (field1217 > 750) {
				method450();
			}

			method499();
			method545();
			method504();
			field1091++;

			if (field1412 != 0) {
				field1411 += 20;
				if (field1411 >= 400) {
					field1412 = 0;
				}
			}

			if (field1296 != 0) {
				field1293++;
				if (field1293 >= 15) {
					if (field1296 == 2) {
						field1194 = true;
					}

					if (field1296 == 3) {
						field1057 = true;
					}

					field1296 = 0;
				}
			}

			if (field1355 != 0) {
				field1306++;

				if (field17 > field1356 + 5 || field17 < field1356 - 5 || field18 > field1357 + 5 || field18 < field1357 - 5) {
					field1305 = true;
				}

				if (field16 == 0) {
					if (field1355 == 2) {
						field1194 = true;
					}

					if (field1355 == 3) {
						field1057 = true;
					}

					field1355 = 0;

					if (field1305 && field1306 >= 5) {
						field1392 = -1;
						method491();

						if (field1392 == field1353 && field1391 != field1354) {
							class4 var3 = class4.field56[field1353];
							byte var4 = 0;
							if (field1058 == 1 && var3.field65 == 206) {
								var4 = 1;
							}

							if (var3.field57[field1391] <= 0) {
								var4 = 0;
							}

							if (var3.field86) {
								int var5 = field1354;
								int var6 = field1391;
								var3.field57[var6] = var3.field57[var5];
								var3.field58[var6] = var3.field58[var5];
								var3.field57[var5] = -1;
								var3.field58[var5] = 0;
							} else if (var4 == 1) {
								int var7 = field1354;
								int var8 = field1391;
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
								var3.method33(field1354, field1391);
							}

							field1274.method228(176);
							field1274.method230(field1353);
							field1274.method230(field1354);
							field1274.method230(field1391);
							field1274.method229(var4);
						}
					} else if ((field1362 == 1 || method468(field1359 - 1)) && field1359 > 2) {
						method475();
					} else if (field1359 > 0) {
						method526(field1359 - 1);
					}

					field1293 = 10;
					field23 = 0;
				}
			}

			field1181++;
			if (field1181 > 62) {
				field1181 = 0;
				field1274.method228(182);
			}

			if (class19.field300 != -1) {
				int var9 = class19.field300;
				int var10 = class19.field301;
				boolean var11 = method442(0, 0, field1438.field418[0], 0, var10, true, field1438.field419[0], 0, var9, 0, 0);
				class19.field300 = -1;

				if (var11) {
					field1409 = field24;
					field1410 = field25;
					field1412 = 1;
					field1411 = 0;
				}
			}

			if (field23 == 1 && field1171 != null) {
				field1171 = null;
				field1057 = true;
				field23 = 0;
			}

			method459();
			method487();
			method516();
			method458();

			if (field16 == 1 || field23 == 1) {
				field1048++;
			}

			if (field1372 == 2) {
				method562();
			}

			if (field1372 == 2 && field1258) {
				method514();
			}

			for (int var12 = 0; var12 < 5; var12++) {
				field1450[var12]++;
			}

			method528();
			field15++;
			if (field15 > 4500) {
				field1219 = 250;
				field15 -= 500;
				field1274.method228(144);
			}

			field1393++;
			if (field1393 > 500) {
				field1393 = 0;
				int var13 = (int) (Math.random() * 8.0D);
				if ((var13 & 0x1) == 1) {
					field1434 += field1435;
				}

				if ((var13 & 0x2) == 2) {
					field1240 += field1241;
				}

				if ((var13 & 0x4) == 4) {
					field1441 += field1442;
				}
			}

			if (field1434 < -50) {
				field1435 = 2;
			}

			if (field1434 > 50) {
				field1435 = -2;
			}

			if (field1240 < -55) {
				field1241 = 2;
			}

			if (field1240 > 55) {
				field1241 = -2;
			}

			if (field1441 < -40) {
				field1442 = 1;
			}

			if (field1441 > 40) {
				field1442 = -1;
			}

			field1199++;
			if (field1199 > 500) {
				field1199 = 0;
				int var14 = (int) (Math.random() * 8.0D);
				if ((var14 & 0x1) == 1) {
					field1195 += field1196;
				}

				if ((var14 & 0x2) == 2) {
					field1261 += field1262;
				}
			}

			if (field1195 < -60) {
				field1196 = 2;
			}

			if (field1195 > 60) {
				field1196 = -2;
			}

			if (field1261 < -20) {
				field1262 = 1;
			}

			if (field1261 > 10) {
				field1262 = -1;
			}

			field1218++;
			if (field1218 > 50) {
				field1274.method228(239);
			}

			try {
				if (field1047 != null && field1274.field624 > 0) {
					field1047.method42(field1274.field624, field1274.field623, 0);
					field1274.field624 = 0;
					field1218 = 0;
				}
			} catch (IOException var16) {
				method450();
			} catch (Exception var17) {
				method525();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1378.method212(arg4, arg1);
		field1379.method212(arg4, arg1 + arg2 - 16);
		class34.method170(field1049, 16, arg1 + 16, arg2 - 32, arg4);
		int var6 = (arg2 - 32) * arg2 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg0 / (arg3 - arg2);
		class34.method170(field1401, 16, arg1 + var7 + 16, var6, arg4);
		class34.method175(var6, arg4, arg1 + var7 + 16, field1342);
		class34.method175(var6, arg4 + 1, arg1 + 16 + var7, field1342);
		class34.method173(field1342, arg1 + var7 + 16, 16, arg4);
		class34.method173(field1342, arg1 + var7 + 17, 16, arg4);
		class34.method175(var6, arg4 + 15, arg1 + 16 + var7, field1228);
		class34.method175(var6 - 1, arg4 + 14, arg1 + var7 + 17, field1228);
		class34.method173(field1228, arg1 + var7 + var6 + 15, 16, arg4);
		class34.method173(field1228, arg1 + var7 + var6 + 14, 15, arg4 + 1);
	}

	@ObfuscatedName("client.a(ZLd;)Z")
	public final boolean method509(class4 arg0) {
		int var2 = arg0.field65;
		if (field1303 == 2) {
			if (var2 == 201) {
				field1057 = true;
				field1396 = false;
				field1447 = true;
				field1432 = "";
				field1156 = 1;
				field1307 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1057 = true;
				field1396 = false;
				field1447 = true;
				field1432 = "";
				field1156 = 2;
				field1307 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1219 = 250;
			return true;
		}

		if (var2 == 501) {
			field1057 = true;
			field1396 = false;
			field1447 = true;
			field1432 = "";
			field1156 = 4;
			field1307 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1057 = true;
			field1396 = false;
			field1447 = true;
			field1432 = "";
			field1156 = 5;
			field1307 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1370[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field959 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field959) {
							var5 = 0;
						}
					}

					if (!class64.field960[var5].field966 && class64.field960[var5].field961 == var3 + (field1039 ? 0 : 7)) {
						break;
					}
				}

				field1370[var3] = var5;
				field1151 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1281[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1204[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1204[var6].length) {
					var8 = 0;
				}
			}

			field1281[var6] = var8;
			field1151 = true;
		}

		if (var2 == 324 && !field1039) {
			field1039 = true;
			method472();
		}

		if (var2 == 325 && field1039) {
			field1039 = false;
			method472();
		}

		if (var2 == 326) {
			field1274.method228(13);
			field1274.method229(field1039 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1274.method229(field1370[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1274.method229(field1281[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1184 = !field1184;
		}

		if (var2 >= 601 && var2 <= 612) {
			method521();

			if (field1395.length() > 0) {
				field1274.method228(203);
				field1274.method235(class52.method310(field1395));
				field1274.method229(var2 - 601);
				field1274.method229(field1184 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
			if (field1132 && field1406 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field1066.method90(arg6, arg4, arg1);
			}

			if (arg2 == 1) {
				var8 = field1066.method91(arg6, arg1, arg4);
			}

			if (arg2 == 2) {
				var8 = field1066.method92(arg6, arg4, arg1);
			}

			if (arg2 == 3) {
				var8 = field1066.method93(arg6, arg4, arg1);
			}

			if (var8 != 0) {
				int var12 = field1066.method94(arg6, arg4, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field1066.method81(arg1, arg4, arg6);
					class57 var16 = class57.method334(var13);
					if (var16.field827) {
						field1433[arg6].method366(var15, arg1, arg4, var14, var16.field828);
					}
				}

				if (arg2 == 1) {
					field1066.method82(arg6, arg1, arg4);
				}

				if (arg2 == 2) {
					field1066.method83(arg6, arg1, arg4);
					class57 var17 = class57.method334(var13);
					if (var17.field825 + arg4 > 103 || var17.field825 + arg1 > 103 || var17.field826 + arg4 > 103 || var17.field826 + arg1 > 103) {
						return;
					}

					if (var17.field827) {
						field1433[arg6].method367(var15, var17.field828, var17.field825, var17.field826, arg4, arg1);
					}
				}

				if (arg2 == 3) {
					field1066.method84(arg6, arg1, arg4);
					class57 var18 = class57.method334(var13);
					if (var18.field827 && var18.field829) {
						field1433[arg6].method369(arg1, arg4);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field1069[1][arg4][arg1] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				class3.method31(arg1, arg3, var19, field1433[arg6], arg5, arg0, field1066, arg4, arg6, field1232);
				return;
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method511() {
		field1081 = 0;
		for (int var1 = -1; var1 < field1252 + field1243; var1++) {
			class26 var2;
			if (var1 == -1) {
				var2 = field1438;
			} else if (var1 < field1252) {
				var2 = field1251[field1253[var1]];
			} else {
				var2 = field1242[field1244[var1 - field1252]];
			}

			if (var2 != null && var2.method127()) {
				if (var1 >= field1252) {
					class59 var6 = ((class27) var2).field423;
					if (var6.field889 >= 0 && var6.field889 < field1377.length) {
						method493(var2, var2.field414 + 15);

						if (field1094 > -1) {
							field1377[var6.field889].method199(field1094 - 12, field1095 - 30);
						}
					}

					if (field1337 == 1 && field1244[var1 - field1252] == field1416 && field1417 % 20 < 10) {
						method493(var2, var2.field414 + 15);

						if (field1094 > -1) {
							field1377[2].method199(field1094 - 12, field1095 - 28);
						}
					}
				} else {
					int var3 = 30;
					class28 var4 = (class28) var2;
					if (var4.field427 != 0) {
						method493(var2, var2.field414 + 15);

						if (field1094 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field427 & 1 << var5) != 0) {
									field1377[var5].method199(field1094 - 12, field1095 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1337 == 10 && field1253[var1] == field1163) {
						method493(var2, var2.field414 + 15);

						if (field1094 > -1) {
							field1377[7].method199(field1094 - 12, field1095 - var3);
						}
					}
				}

				if (var2.field380 != null && (var1 >= field1252 || field1055 == 0 || field1055 == 3 || field1055 == 1 && method484(((class28) var2).field424))) {
					method493(var2, var2.field414);

					if (field1094 > -1 && field1081 < field1082) {
						field1086[field1081] = field1223.method216(var2.field380) / 2;
						field1085[field1081] = field1223.field619;
						field1083[field1081] = field1094;
						field1084[field1081] = field1095;
						field1087[field1081] = var2.field382;
						field1088[field1081] = var2.field383;
						field1089[field1081] = var2.field381;
						field1090[field1081++] = var2.field380;

						if (field1126 == 0 && var2.field383 == 1) {
							field1085[field1081] += 10;
							field1084[field1081] += 5;
						}

						if (field1126 == 0 && var2.field383 == 2) {
							field1086[field1081] = 60;
						}
					}
				}

				if (var2.field387 > field1417) {
					method493(var2, var2.field414 + 15);

					if (field1094 > -1) {
						int var7 = var2.field388 * 30 / var2.field389;
						if (var7 > 30) {
							var7 = 30;
						}

						class34.method170(0xFF00, var7, field1095 - 3, 5, field1094 - 15);
						class34.method170(0xFF0000, 30 - var7, field1095 - 3, 5, field1094 + var7 - 15);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field386[var8] > field1417) {
						method493(var2, var2.field414 / 2);

						if (field1094 > -1) {
							if (var8 == 1) {
								field1095 -= 20;
							}

							if (var8 == 2) {
								field1094 -= 15;
								field1095 -= 10;
							}

							if (var8 == 3) {
								field1094 += 15;
								field1095 -= 10;
							}

							field1160[var2.field385[var8]].method199(field1094 - 12, field1095 - 12);
							field1221.method214(field1094, String.valueOf(var2.field384[var8]), field1095 + 4, 0);
							field1221.method214(field1094 - 1, String.valueOf(var2.field384[var8]), field1095 + 3, 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1081; var9++) {
			int var10 = field1083[var9];
			int var11 = field1084[var9];
			int var12 = field1086[var9];
			int var13 = field1085[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1084[var15] - field1085[var15] && var11 - var13 < field1084[var15] + 2 && var10 - var12 < field1086[var15] + field1083[var15] && var10 + var12 > field1083[var15] - field1086[var15] && field1084[var15] - field1085[var15] < var11) {
						var11 = field1084[var15] - field1085[var15];
						var14 = true;
					}
				}
			}

			field1094 = field1083[var9];
			field1095 = field1084[var9] = var11;
			String var16 = field1090[var9];
			if (field1126 == 0) {
				int var17 = 0xFFFF00;
				if (field1087[var9] < 6) {
					var17 = field1270[field1087[var9]];
				}

				if (field1087[var9] == 6) {
					var17 = field1405 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1087[var9] == 7) {
					var17 = field1405 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1087[var9] == 8) {
					var17 = field1405 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1087[var9] == 9) {
					int var18 = 150 - field1089[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1087[var9] == 10) {
					int var19 = 150 - field1089[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1087[var9] == 11) {
					int var20 = 150 - field1089[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1088[var9] == 0) {
					field1223.method214(field1094, var16, field1095 + 1, 0);
					field1223.method214(field1094, var16, field1095, var17);
				}

				if (field1088[var9] == 1) {
					field1223.method218(var16, field1095 + 1, 0, field1405, field1094);
					field1223.method218(var16, field1095, var17, field1405, field1094);
				}

				if (field1088[var9] == 2) {
					int var21 = field1223.method216(var16);
					int var22 = (150 - field1089[var9]) * (var21 + 100) / 150;
					class34.method167(0, field1094 - 50, 334, field1094 + 50);
					field1223.method217(field1095 + 1, 0, var16, field1094 + 50 - var22);
					field1223.method217(field1095, var17, var16, field1094 + 50 - var22);
					class34.method166();
				}
			} else {
				field1223.method214(field1094, var16, field1095 + 1, 0);
				field1223.method214(field1094, var16, field1095, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method512() {
		field1103.method268();
		int var1 = field1195 + field1148 & 0x7FF;
		int var2 = field1438.field368 / 32 + 48;
		int var3 = 464 - field1438.field369 / 32;
		field1446.method203(field1177, 5, 25, field1122, var2, var3, field1261 + 256, var1, 151, 146);
		field1248.method203(field1351, 0, 0, field1312, 25, 25, 256, field1148, 33, 33);

		for (int var4 = 0; var4 < field1364; var4++) {
			int var5 = field1365[var4] * 4 + 2 - field1438.field368 / 32;
			int var6 = field1366[var4] * 4 + 2 - field1438.field369 / 32;
			method506(field1413[var4], var6, var5);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1415[field1406][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1438.field368 / 32;
					int var11 = var8 * 4 + 2 - field1438.field369 / 32;
					method506(field1343, var11, var10);
				}
			}
		}

		for (int var12 = 0; var12 < field1243; var12++) {
			class27 var13 = field1242[field1244[var12]];
			if (var13 != null && var13.method127() && var13.field423.field882) {
				int var14 = var13.field368 / 32 - field1438.field368 / 32;
				int var15 = var13.field369 / 32 - field1438.field369 / 32;
				method506(field1344, var15, var14);
			}
		}

		for (int var16 = 0; var16 < field1252; var16++) {
			class28 var17 = field1251[field1253[var16]];
			if (var17 != null && var17.method127()) {
				int var18 = var17.field368 / 32 - field1438.field368 / 32;
				int var19 = var17.field369 / 32 - field1438.field369 / 32;
				boolean var20 = false;
				long var21 = class52.method310(var17.field424);
				for (int var23 = 0; var23 < field1302; var23++) {
					if (field1205[var23] == var21 && field1187[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method506(field1346, var19, var18);
				} else {
					method506(field1345, var19, var18);
				}
			}
		}

		if (field1337 != 0 && field1417 % 20 < 10) {
			if (field1337 == 1 && field1416 >= 0 && field1416 < field1242.length) {
				class27 var24 = field1242[field1416];
				if (var24 != null) {
					int var25 = var24.field368 / 32 - field1438.field368 / 32;
					int var26 = var24.field369 / 32 - field1438.field369 / 32;
					method438(var25, var26, field1093);
				}
			}

			if (field1337 == 2) {
				int var27 = (field1042 - field1313) * 4 + 2 - field1438.field368 / 32;
				int var28 = (field1043 - field1314) * 4 + 2 - field1438.field369 / 32;
				method438(var27, var28, field1093);
			}

			if (field1337 == 10 && field1163 >= 0 && field1163 < field1251.length) {
				class28 var29 = field1251[field1163];
				if (var29 != null) {
					int var30 = var29.field368 / 32 - field1438.field368 / 32;
					int var31 = var29.field369 / 32 - field1438.field369 / 32;
					method438(var30, var31, field1093);
				}
			}
		}

		if (field1444 != 0) {
			int var32 = field1444 * 4 + 2 - field1438.field368 / 32;
			int var33 = field1445 * 4 + 2 - field1438.field369 / 32;
			method506(field1092, var33, var32);
		}

		class34.method170(0xFFFFFF, 3, 78, 3, 97);
		field1104.method268();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IIZI)Lyb;")
	public final class51 method513(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1363[0] != null) {
				var6 = field1363[0].method301(arg3);
			}
		} catch (Exception var28) {
		}

		if (var6 != null) {
			field1375.reset();
			field1375.update(var6);
			int var8 = (int) field1375.getValue();
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
			method13(arg4, "Requesting " + arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method464(arg0 + arg2);
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
						method13(arg4, "Loading " + arg1 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1363[0] != null) {
						field1363[0].method302(arg3, var6, var6.length);
					}
				} catch (Exception var27) {
					field1363[0] = null;
				}

				if (var6 != null) {
					field1375.reset();
					field1375.update(var6);
					int var23 = (int) field1375.getValue();
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

	@ObfuscatedName("client.i(B)V")
	public final void method514() {
		int var1 = field1071 * 128 + 64;
		int var2 = field1072 * 128 + 64;
		int var3 = method542(var1, var2, field1406) - field1073;

		if (field1319 < var1) {
			field1319 += (var1 - field1319) * field1075 / 1000 + field1074;
			if (field1319 > var1) {
				field1319 = var1;
			}
		}

		if (field1319 > var1) {
			field1319 -= (field1319 - var1) * field1075 / 1000 + field1074;
			if (field1319 < var1) {
				field1319 = var1;
			}
		}

		if (field1320 < var3) {
			field1320 += (var3 - field1320) * field1075 / 1000 + field1074;
			if (field1320 > var3) {
				field1320 = var3;
			}
		}

		if (field1320 > var3) {
			field1320 -= (field1320 - var3) * field1075 / 1000 + field1074;
			if (field1320 < var3) {
				field1320 = var3;
			}
		}

		if (field1321 < var2) {
			field1321 += (var2 - field1321) * field1075 / 1000 + field1074;
			if (field1321 > var2) {
				field1321 = var2;
			}
		}

		if (field1321 > var2) {
			field1321 -= (field1321 - var2) * field1075 / 1000 + field1074;
			if (field1321 < var2) {
				field1321 = var2;
			}
		}

		int var4 = field1189 * 128 + 64;
		int var5 = field1190 * 128 + 64;
		int var6 = method542(var4, var5, field1406) - field1191;
		int var7 = var4 - field1319;
		int var8 = var6 - field1320;
		int var9 = var5 - field1321;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1322 < var11) {
			field1322 += (var11 - field1322) * field1193 / 1000 + field1192;
			if (field1322 > var11) {
				field1322 = var11;
			}
		}

		if (field1322 > var11) {
			field1322 -= (field1322 - var11) * field1193 / 1000 + field1192;
			if (field1322 < var11) {
				field1322 = var11;
			}
		}

		int var13 = var12 - field1323;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1323 += field1193 * var13 / 1000 + field1192;
			field1323 &= 0x7FF;
		}

		if (var13 < 0) {
			field1323 -= -var13 * field1193 / 1000 + field1192;
			field1323 &= 0x7FF;
		}

		int var14 = var12 - field1323;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1323 = var12;
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method515(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method515(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method516() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1310[0] != -1) {
				field1194 = true;
				field1206 = 0;
				field1237 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1310[1] != -1) {
				field1194 = true;
				field1206 = 1;
				field1237 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1310[2] != -1) {
				field1194 = true;
				field1206 = 2;
				field1237 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1310[3] != -1) {
				field1194 = true;
				field1206 = 3;
				field1237 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1310[4] != -1) {
				field1194 = true;
				field1206 = 4;
				field1237 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1310[5] != -1) {
				field1194 = true;
				field1206 = 5;
				field1237 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1310[6] != -1) {
				field1194 = true;
				field1206 = 6;
				field1237 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1310[7] != -1) {
				field1194 = true;
				field1206 = 7;
				field1237 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1310[8] != -1) {
				field1194 = true;
				field1206 = 8;
				field1237 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1310[9] != -1) {
				field1194 = true;
				field1206 = 9;
				field1237 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1310[10] != -1) {
				field1194 = true;
				field1206 = 10;
				field1237 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1310[11] != -1) {
				field1194 = true;
				field1206 = 11;
				field1237 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1310[12] != -1) {
				field1194 = true;
				field1206 = 12;
				field1237 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1310[13] != -1) {
				field1194 = true;
				field1206 = 13;
				field1237 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public static final String method517(int arg0) {
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

	@ObfuscatedName("client.C(I)V")
	public final void method518() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.D(I)V")
	public final void method519() {
		while (true) {
			class40 var1 = field1050.method291();
			if (var1 == null) {
				return;
			}

			if (var1.field636 == 0) {
				class32.method137(var1.field638, var1.field637);

				if ((field1050.method287(var1.field637) & 0x62) != 0) {
					field1194 = true;

					if (field1220 != -1) {
						field1057 = true;
					}
				}
			}

			if (var1.field636 == 1 && var1.field638 != null) {
				class8.method59(var1.field638);
			}

			if (var1.field636 == 2 && field1398 == var1.field637 && var1.field638 != null) {
				method540(var1.field638, field1399);
			}

			if (var1.field636 == 3 && field1372 == 1) {
				for (int var2 = 0; var2 < field1233.length; var2++) {
					if (field1287[var2] == var1.field637) {
						field1233[var2] = var1.field638;

						if (var1.field638 == null) {
							field1287[var2] = -1;
						}

						break;
					}

					if (field1288[var2] == var1.field637) {
						field1213[var2] = var1.field638;

						if (var1.field638 == null) {
							field1288[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field636 == 93 && field1050.method286(var1.field637)) {
				class3.method17(field1050, new class39(var1.field638));
			}
		}
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method520(int arg0, class39 arg1) {
		arg1.method249();
		int var3 = arg1.method250(1);
		if (var3 != 0) {
			int var4 = arg1.method250(2);
			if (var4 == 0) {
				field1255[field1254++] = field1250;
			} else if (var4 == 1) {
				int var5 = arg1.method250(3);
				field1438.method125(var5, false);
				int var6 = arg1.method250(1);
				if (var6 == 1) {
					field1255[field1254++] = field1250;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method250(3);
				field1438.method125(var7, true);
				int var8 = arg1.method250(3);
				field1438.method125(var8, true);
				int var9 = arg1.method250(1);
				if (var9 == 1) {
					field1255[field1254++] = field1250;
				}
			} else if (var4 == 3) {
				field1406 = arg1.method250(2);
				int var10 = arg1.method250(7);
				int var11 = arg1.method250(7);
				int var12 = arg1.method250(1);
				field1438.method124(var12 == 1, var11, var10);
				int var13 = arg1.method250(1);
				if (var13 == 1) {
					field1255[field1254++] = field1250;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method521() {
		field1274.method228(58);

		if (field1212 != -1) {
			field1212 = -1;
			field1194 = true;
			field1063 = false;
			field1237 = true;
		}

		if (field1220 != -1) {
			field1220 = -1;
			field1057 = true;
			field1063 = false;
		}

		field1238 = -1;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method522() {
		field1102.method268();
		class35.field585 = field1420;
		field1164.method212(0, 0);

		if (field1212 != -1) {
			method543(0, 0, class4.field56[field1212], 0);
		} else if (field1310[field1206] != -1) {
			method543(0, 0, class4.field56[field1310[field1206]], 0);
		}

		if (field1247 && field1109 == 1) {
			method457();
		}

		field1102.method269(field9, 205, 553);
		field1104.method268();
		class35.field585 = field1421;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method523() {
		byte[] var1 = field1176.method309("title.dat", null);
		class36 var2 = new class36(var1, this);
		field1425.method268();
		var2.method197(0, 0);
		field1426.method268();
		var2.method197(0, -637);
		field1422.method268();
		var2.method197(0, -128);
		field1423.method268();
		var2.method197(-371, -202);
		field1424.method268();
		var2.method197(-171, -202);
		field1427.method268();
		var2.method197(-265, 0);
		field1428.method268();
		var2.method197(-265, -562);
		field1429.method268();
		var2.method197(-171, -128);
		field1430.method268();
		var2.method197(-171, -562);
		int[] var3 = new int[var2.field598];
		for (int var4 = 0; var4 < var2.field599; var4++) {
			for (int var5 = 0; var5 < var2.field598; var5++) {
				var3[var5] = var2.field597[var2.field598 * var4 + var2.field598 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field598; var6++) {
				var2.field597[var2.field598 * var4 + var6] = var3[var6];
			}
		}

		field1425.method268();
		var2.method197(0, 382);
		field1426.method268();
		var2.method197(0, -255);
		field1422.method268();
		var2.method197(0, 254);
		field1423.method268();
		var2.method197(-371, 180);
		field1424.method268();
		var2.method197(-171, 180);
		field1427.method268();
		var2.method197(-265, 382);
		field1428.method268();
		var2.method197(-265, -180);
		field1429.method268();
		var2.method197(-171, 254);
		field1430.method268();
		var2.method197(-171, -180);
		class36 var7 = new class36(field1176, "logo", 0);
		field1422.method268();
		var7.method199(382 - var7.field598 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1130 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method524() {
		field1146 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1056) {
				field1162++;
				method482();
				method482();
				method544();
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

		field1146 = false;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method525() {
		try {
			if (field1047 != null) {
				field1047.method38();
			}
		} catch (Exception var2) {
		}

		field1047 = null;
		field1263 = false;
		field1440 = 0;
		field1387 = "";
		field1388 = "";
		class6.method45();
		method529();
		field1066.method64();

		for (int var1 = 0; var1 < 4; var1++) {
			field1433[var1].method361();
		}

		System.gc();
		method518();
		field1144 = -1;
		field1398 = -1;
		field1280 = 0;
	}

	@ObfuscatedName("client.e(II)V")
	public final void method526(int arg0) {
		if (arg0 >= 0) {
			if (field1396) {
				field1396 = false;
				field1057 = true;
			}

			int var2 = field1347[arg0];
			int var3 = field1348[arg0];
			int var4 = field1349[arg0];
			int var5 = field1350[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 274) {
				class4 var6 = class4.field56[var3];
				field1097 = 1;
				field1098 = var3;
				field1099 = var6.field116;
				field1117 = 0;
				field1194 = true;
				String var7 = var6.field114;
				if (var7.indexOf(" ") != -1) {
					var7 = var7.substring(0, var7.indexOf(" "));
				}

				String var8 = var6.field114;
				if (var8.indexOf(" ") != -1) {
					var8 = var8.substring(var8.indexOf(" ") + 1);
				}

				field1100 = var7 + " " + var6.field115 + " " + var8;

				if (field1099 == 16) {
					field1194 = true;
					field1206 = 3;
					field1237 = true;
				}
			} else {
				if (var4 == 231) {
					class4 var9 = class4.field56[var3];
					boolean var10 = true;
					if (var9.field65 > 0) {
						var10 = method509(var9);
					}

					if (var10) {
						field1274.method228(244);
						field1274.method230(var3);
					}
				}

				if (var4 == 240) {
					class27 var11 = field1242[var5];
					if (var11 != null) {
						method442(2, 0, field1438.field418[0], 0, var11.field419[0], false, field1438.field419[0], 0, var11.field418[0], 1, 1);
						field1409 = field24;
						field1410 = field25;
						field1412 = 2;
						field1411 = 0;
						field1274.method228(231);
						field1274.method230(var5);
						field1274.method230(field1098);
					}
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class28 var12 = field1251[var5];
					if (var12 != null) {
						method442(2, 0, field1438.field418[0], 0, var12.field419[0], false, field1438.field419[0], 0, var12.field418[0], 1, 1);
						field1409 = field24;
						field1410 = field25;
						field1412 = 2;
						field1411 = 0;

						if (var4 == 387) {
							field1400 += var5;
							if (field1400 >= 66) {
								field1274.method228(233);
								field1274.method229(154);
							}

							field1274.method228(72);
						}

						if (var4 == 499) {
							field1274.method228(17);
						}

						if (var4 == 27) {
							field1274.method228(18);
						}

						if (var4 == 185) {
							field1274.method228(230);
						}

						if (var4 == 639) {
							field1245++;
							if (field1245 >= 52) {
								field1274.method228(121);
								field1274.method229(131);
							}

							field1274.method228(192);
						}

						field1274.method230(var5);
					}
				}

				if (var4 == 1152) {
					class60 var13 = class60.method350(var5);
					String var14;
					if (var13.field901 == null) {
						var14 = "It's a " + var13.field900 + ".";
					} else {
						var14 = new String(var13.field901);
					}

					method465("", var14, 0);
				}

				if (var4 == 721) {
					field1236 += var3;
					if (field1236 >= 139) {
						field1274.method228(28);
						field1274.method233(0);
					}

					method466(213, var3, var5, var2);
				}

				if (var4 == 357) {
					method466(87, var3, var5, var2);
				}

				if (var4 == 563) {
					field1274.method228(102);
					field1274.method230(var5);
					field1274.method230(var2);
					field1274.method230(var3);
					field1274.method230(field1098);
					field1293 = 0;
					field1294 = var3;
					field1295 = var2;
					field1296 = 2;
					if (class4.field56[var3].field62 == field1238) {
						field1296 = 1;
					}

					if (class4.field56[var3].field62 == field1220) {
						field1296 = 3;
					}
				}

				if (var4 == 398) {
					field1274.method228(200);
					field1274.method230(var5);
					field1274.method230(var2);
					field1274.method230(var3);
					field1274.method230(field1120);
					field1274.method230(field1118);
					field1274.method230(field1119);
					field1293 = 0;
					field1294 = var3;
					field1295 = var2;
					field1296 = 2;
					if (class4.field56[var3].field62 == field1238) {
						field1296 = 1;
					}

					if (class4.field56[var3].field62 == field1220) {
						field1296 = 3;
					}
				}

				if (var4 == 507 || var4 == 957) {
					String var15 = field1449[arg0];
					int var16 = var15.indexOf("@whi@");
					if (var16 != -1) {
						var15 = var15.substring(var16 + 5).trim();
						String var17 = class52.method314(class52.method311(class52.method310(var15)));
						boolean var18 = false;
						for (int var19 = 0; var19 < field1252; var19++) {
							class28 var20 = field1251[field1253[var19]];
							if (var20 != null && var20.field424 != null && var20.field424.equalsIgnoreCase(var17)) {
								method442(2, 0, field1438.field418[0], 0, var20.field419[0], false, field1438.field419[0], 0, var20.field418[0], 1, 1);

								if (var4 == 507) {
									field1400 += var5;
									if (field1400 >= 66) {
										field1274.method228(233);
										field1274.method229(154);
									}

									field1274.method228(72);
								}

								if (var4 == 957) {
									field1245++;
									if (field1245 >= 52) {
										field1274.method228(121);
										field1274.method229(131);
									}

									field1274.method228(192);
								}

								field1274.method230(field1253[var19]);
								var18 = true;
								break;
							}
						}

						if (!var18) {
							method465("", "Unable to find " + var17, 0);
						}
					}
				}

				if (var4 == 810 && method466(240, var3, var5, var2)) {
					field1274.method230(field1120);
					field1274.method230(field1118);
					field1274.method230(field1119);
				}

				if (var4 == 902) {
					String var21 = field1449[arg0];
					int var22 = var21.indexOf("@whi@");
					if (var22 != -1) {
						long var23 = class52.method310(var21.substring(var22 + 5).trim());
						int var25 = -1;
						for (int var26 = 0; var26 < field1302; var26++) {
							if (field1205[var26] == var23) {
								var25 = var26;
								break;
							}
						}

						if (var25 != -1 && field1187[var25] > 0) {
							field1057 = true;
							field1396 = false;
							field1447 = true;
							field1432 = "";
							field1156 = 3;
							field1041 = field1205[var25];
							field1307 = "Enter message to send to " + field1059[var25];
						}
					}
				}

				if (var4 == 899 && method466(26, var3, var5, var2)) {
					field1274.method230(field1098);
				}

				if (var4 == 1071) {
					method466(147, var3, var5, var2);
				}

				if (var4 == 1328) {
					class60 var27 = class60.method350(var5);
					class4 var28 = class4.field56[var3];
					String var29;
					if (var28 != null && var28.field58[var2] >= 100000) {
						var29 = var28.field58[var2] + " x " + var27.field900;
					} else if (var27.field901 == null) {
						var29 = "It's a " + var27.field900 + ".";
					} else {
						var29 = new String(var27.field901);
					}

					method465("", var29, 0);
				}

				if (var4 == 829) {
					class27 var30 = field1242[var5];
					if (var30 != null) {
						method442(2, 0, field1438.field418[0], 0, var30.field419[0], false, field1438.field419[0], 0, var30.field418[0], 1, 1);
						field1409 = field24;
						field1410 = field25;
						field1412 = 2;
						field1411 = 0;
						field1274.method228(119);
						field1274.method230(var5);
						field1274.method230(field1120);
						field1274.method230(field1118);
						field1274.method230(field1119);
					}
				}

				if (var4 == 131) {
					class28 var31 = field1251[var5];
					if (var31 != null) {
						method442(2, 0, field1438.field418[0], 0, var31.field419[0], false, field1438.field419[0], 0, var31.field418[0], 1, 1);
						field1409 = field24;
						field1410 = field25;
						field1412 = 2;
						field1411 = 0;
						field1274.method228(68);
						field1274.method230(var5);
						field1274.method230(field1098);
					}
				}

				if (var4 == 524) {
					String var32 = field1449[arg0];
					int var33 = var32.indexOf("@whi@");
					if (var33 != -1) {
						method521();
						field1395 = var32.substring(var33 + 5).trim();
						field1184 = false;

						for (int var34 = 0; var34 < class4.field56.length; var34++) {
							if (class4.field56[var34] != null && class4.field56[var34].field65 == 600) {
								field1159 = field1238 = class4.field56[var34].field62;
								break;
							}
						}
					}
				}

				if (var4 == 743) {
					field1128++;
					if (field1128 >= 124) {
						field1274.method228(77);
						field1274.method230(37954);
					}

					method466(98, var3, var5, var2);
				}

				if (var4 == 102) {
					field1117 = 1;
					field1118 = var2;
					field1119 = var3;
					field1120 = var5;
					field1121 = class60.method350(var5).field900;
					field1097 = 0;
					field1194 = true;
				} else {
					if (var4 == 225) {
						field1274.method228(244);
						field1274.method230(var3);
						class4 var35 = class4.field56[var3];
						if (var35.field71 != null && var35.field71[0][0] == 5) {
							int var36 = var35.field71[0][1];
							if (field1183[var36] != var35.field73[0]) {
								field1183[var36] = var35.field73[0];
								method559(var36);
								field1194 = true;
							}
						}
					}

					if (var4 == 625) {
						method466(33, var3, var5, var2);
					}

					if (var4 == 435) {
						field1274.method228(244);
						field1274.method230(var3);
						class4 var37 = class4.field56[var3];
						if (var37.field71 != null && var37.field71[0][0] == 5) {
							int var38 = var37.field71[0][1];
							field1183[var38] = 1 - field1183[var38];
							method559(var38);
							field1194 = true;
						}
					}

					if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
						String var39 = field1449[arg0];
						int var40 = var39.indexOf("@whi@");
						if (var40 != -1) {
							long var41 = class52.method310(var39.substring(var40 + 5).trim());
							if (var4 == 605) {
								method495(var41);
							}

							if (var4 == 47) {
								method557(var41);
							}

							if (var4 == 513) {
								method558(var41);
							}

							if (var4 == 884) {
								method460(var41);
							}
						}
					}

					if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
						class27 var43 = field1242[var5];
						if (var43 != null) {
							method442(2, 0, field1438.field418[0], 0, var43.field419[0], false, field1438.field419[0], 0, var43.field418[0], 1, 1);
							field1409 = field24;
							field1410 = field25;
							field1412 = 2;
							field1411 = 0;

							if (var4 == 309) {
								field1274.method228(69);
							}

							if (var4 == 242) {
								field1274.method228(143);
							}

							if (var4 == 793) {
								field1274.method228(118);
							}

							if (var4 == 209) {
								field1274.method228(195);
							}

							if (var4 == 852) {
								field1274.method228(122);
							}

							field1274.method230(var5);
						}
					}

					if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
						if (var4 == 555) {
							field1274.method228(59);
						}

						if (var4 == 582) {
							if ((var5 & 0x3) == 0) {
								field1077++;
							}

							if (field1077 >= 133) {
								field1274.method228(131);
								field1274.method230(6118);
							}

							field1274.method228(181);
						}

						if (var4 == 331) {
							field1274.method228(160);
						}

						if (var4 == 354) {
							field1274.method228(62);
						}

						if (var4 == 113) {
							field1274.method228(70);
						}

						field1274.method230(var5);
						field1274.method230(var2);
						field1274.method230(var3);
						field1293 = 0;
						field1294 = var3;
						field1295 = var2;
						field1296 = 2;
						if (class4.field56[var3].field62 == field1238) {
							field1296 = 1;
						}

						if (class4.field56[var3].field62 == field1220) {
							field1296 = 3;
						}
					}

					if (var4 == 111) {
						boolean var44 = method442(2, 0, field1438.field418[0], 0, var3, false, field1438.field419[0], 0, var2, 0, 0);
						if (!var44) {
							method442(2, 0, field1438.field418[0], 0, var3, false, field1438.field419[0], 0, var2, 1, 1);
						}

						field1409 = field24;
						field1410 = field25;
						field1412 = 2;
						field1411 = 0;
						field1274.method228(245);
						field1274.method230(field1313 + var2);
						field1274.method230(field1314 + var3);
						field1274.method230(var5);
						field1274.method230(field1120);
						field1274.method230(field1118);
						field1274.method230(field1119);
					}

					if (var4 == 1714) {
						class27 var46 = field1242[var5];
						if (var46 != null) {
							String var47;
							if (var46.field423.field867 == null) {
								var47 = "It's a " + var46.field423.field866 + ".";
							} else {
								var47 = new String(var46.field423.field867);
							}

							method465("", var47, 0);
						}
					}

					if (var4 == 718) {
						if (field1247) {
							field1066.method102(var2 - 4, var3 - 4);
						} else {
							field1066.method102(field24 - 4, field25 - 4);
						}
					}

					if (var4 == 1381) {
						int var48 = var5 >> 14 & 0x7FFF;
						class57 var49 = class57.method334(var48);
						String var50;
						if (var49.field822 == null) {
							var50 = "It's a " + var49.field821 + ".";
						} else {
							var50 = new String(var49.field822);
						}

						method465("", var50, 0);
					}

					if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
						if (var4 == 681) {
							field1096++;
							if (field1096 >= 116) {
								field1274.method228(162);
								field1274.method232(0xC6A439);
							}

							field1274.method228(163);
						}

						if (var4 == 694) {
							field1274.method228(243);
						}

						if (var4 == 100) {
							field1274.method228(74);
						}

						if (var4 == 962) {
							field1274.method228(228);
						}

						if (var4 == 795) {
							field1274.method228(80);
						}

						field1274.method230(var5);
						field1274.method230(var2);
						field1274.method230(var3);
						field1293 = 0;
						field1294 = var3;
						field1295 = var2;
						field1296 = 2;
						if (class4.field56[var3].field62 == field1238) {
							field1296 = 1;
						}

						if (class4.field56[var3].field62 == field1220) {
							field1296 = 3;
						}
					}

					if (var4 == 997 && !field1063) {
						field1274.method228(146);
						field1274.method230(var3);
						field1063 = true;
					}

					if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
						boolean var51 = method442(2, 0, field1438.field418[0], 0, var3, false, field1438.field419[0], 0, var2, 0, 0);
						if (!var51) {
							method442(2, 0, field1438.field418[0], 0, var3, false, field1438.field419[0], 0, var2, 1, 1);
						}

						field1409 = field24;
						field1410 = field25;
						field1412 = 2;
						field1411 = 0;

						if (var4 == 617) {
							field1274.method228(178);
						}

						if (var4 == 139) {
							if ((var2 & 0x3) == 0) {
								field1179++;
							}

							if (field1179 >= 123) {
								field1274.method228(187);
								field1274.method233(0);
							}

							field1274.method228(141);
						}

						if (var4 == 662) {
							field1360 += field1314;
							if (field1360 >= 118) {
								field1274.method228(56);
								field1274.method233(0);
							}

							field1274.method228(97);
						}

						if (var4 == 224) {
							field1207 += var3;
							if (field1207 >= 75) {
								field1274.method228(206);
								field1274.method229(19);
							}

							field1274.method228(47);
						}

						if (var4 == 778) {
							field1274.method228(67);
						}

						field1274.method230(field1313 + var2);
						field1274.method230(field1314 + var3);
						field1274.method230(var5);
					}

					if (var4 == 737) {
						method521();
					}

					if (var4 == 275) {
						class28 var53 = field1251[var5];
						if (var53 != null) {
							method442(2, 0, field1438.field418[0], 0, var53.field419[0], false, field1438.field419[0], 0, var53.field418[0], 1, 1);
							field1409 = field24;
							field1410 = field25;
							field1412 = 2;
							field1411 = 0;
							field1274.method228(113);
							field1274.method230(var5);
							field1274.method230(field1120);
							field1274.method230(field1118);
							field1274.method230(field1119);
						}
					}

					if (var4 == 370) {
						boolean var54 = method442(2, 0, field1438.field418[0], 0, var3, false, field1438.field419[0], 0, var2, 0, 0);
						if (!var54) {
							method442(2, 0, field1438.field418[0], 0, var3, false, field1438.field419[0], 0, var2, 1, 1);
						}

						field1409 = field24;
						field1410 = field25;
						field1412 = 2;
						field1411 = 0;
						field1274.method228(202);
						field1274.method230(field1313 + var2);
						field1274.method230(field1314 + var3);
						field1274.method230(var5);
						field1274.method230(field1098);
					}

					field1117 = 0;
					field1097 = 0;
					field1194 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZLmb;)V")
	public final void method527(int arg0, class39 arg1) {
		while (arg1.field625 + 21 < arg0 * 8) {
			int var3 = arg1.method250(14);
			if (var3 == 16383) {
				break;
			}

			if (field1242[var3] == null) {
				field1242[var3] = new class27();
			}

			class27 var4 = field1242[var3];
			field1244[field1243++] = var3;
			var4.field413 = field1417;
			var4.field423 = class59.method344(arg1.method250(11));
			var4.field372 = var4.field423.field868;
			var4.field416 = var4.field423.field890;
			var4.field375 = var4.field423.field872;
			var4.field376 = var4.field423.field873;
			var4.field377 = var4.field423.field874;
			var4.field378 = var4.field423.field875;
			var4.field373 = var4.field423.field871;
			int var5 = arg1.method250(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method124(false, field1438.field419[0] + var6, field1438.field418[0] + var5);
			int var7 = arg1.method250(1);
			if (var7 == 1) {
				field1255[field1254++] = var3;
			}
		}

		arg1.method251();
	}

	@ObfuscatedName("client.H(I)V")
	public final void method528() {
		field1340++;
		if (field1340 > 192) {
			field1340 = 0;
			field1274.method228(226);
			field1274.method229(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1238 != -1 && field1238 == field1159) {
						break;
					}

					if (field1447) {
						if (var1 >= 32 && var1 <= 122 && field1432.length() < 80) {
							field1432 = field1432 + (char) var1;
							field1057 = true;
						}

						if (var1 == 8 && field1432.length() > 0) {
							field1432 = field1432.substring(0, field1432.length() - 1);
							field1057 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1447 = false;
							field1057 = true;

							if (field1156 == 1) {
								long var2 = class52.method310(field1432);
								method495(var2);
							}

							if (field1156 == 2 && field1302 > 0) {
								long var4 = class52.method310(field1432);
								method558(var4);
							}

							if (field1156 == 3 && field1432.length() > 0) {
								field1274.method228(214);
								field1274.method229(0);
								int var6 = field1274.field624;
								field1274.method235(field1041);
								class53.method318(field1432, field1274);
								field1274.method238(field1274.field624 - var6);
								field1432 = class52.method315(field1432);
								field1432 = class71.method403(field1432);
								method465(class52.method314(class52.method311(field1041)), field1432, 6);

								if (field1308 == 2) {
									field1308 = 1;
									field1338 = true;
									field1274.method228(129);
									field1274.method229(field1055);
									field1274.method229(field1308);
									field1274.method229(field1068);
								}
							}

							if (field1156 == 4 && field1339 < 100) {
								long var7 = class52.method310(field1432);
								method557(var7);
							}

							if (field1156 == 5 && field1339 > 0) {
								long var9 = class52.method310(field1432);
								method460(var9);
							}
						}
					} else if (field1396) {
						if (var1 >= 48 && var1 <= 57 && field1436.length() < 10) {
							field1436 = field1436 + (char) var1;
							field1057 = true;
						}

						if (var1 == 8 && field1436.length() > 0) {
							field1436 = field1436.substring(0, field1436.length() - 1);
							field1057 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1436.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1436);
								} catch (Exception var16) {
								}

								field1274.method228(161);
								field1274.method233(var11);
							}

							field1396 = false;
							field1057 = true;
						}
					} else if (field1220 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1051.length() < 80) {
							field1051 = field1051 + (char) var1;
							field1057 = true;
						}

						if (var1 == 8 && field1051.length() > 0) {
							field1051 = field1051.substring(0, field1051.length() - 1);
							field1057 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1051.length() > 0) {
							if (field1367 == 2) {
								if (field1051.equals("::clientdrop")) {
									method450();
								}

								if (field1051.equals("::lag")) {
									method433();
								}

								if (field1051.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1050.method282(2); var12++) {
										field1050.method292(2, var12, (byte) 1);
									}
								}
							}

							if (field1051.startsWith("::")) {
								field1274.method228(86);
								field1274.method229(field1051.length() - 1);
								field1274.method236(field1051.substring(2));
							} else {
								byte var13 = 0;
								if (field1051.startsWith("yellow:")) {
									var13 = 0;
									field1051 = field1051.substring(7);
								}

								if (field1051.startsWith("red:")) {
									var13 = 1;
									field1051 = field1051.substring(4);
								}

								if (field1051.startsWith("green:")) {
									var13 = 2;
									field1051 = field1051.substring(6);
								}

								if (field1051.startsWith("cyan:")) {
									var13 = 3;
									field1051 = field1051.substring(5);
								}

								if (field1051.startsWith("purple:")) {
									var13 = 4;
									field1051 = field1051.substring(7);
								}

								if (field1051.startsWith("white:")) {
									var13 = 5;
									field1051 = field1051.substring(6);
								}

								if (field1051.startsWith("flash1:")) {
									var13 = 6;
									field1051 = field1051.substring(7);
								}

								if (field1051.startsWith("flash2:")) {
									var13 = 7;
									field1051 = field1051.substring(7);
								}

								if (field1051.startsWith("flash3:")) {
									var13 = 8;
									field1051 = field1051.substring(7);
								}

								if (field1051.startsWith("glow1:")) {
									var13 = 9;
									field1051 = field1051.substring(6);
								}

								if (field1051.startsWith("glow2:")) {
									var13 = 10;
									field1051 = field1051.substring(6);
								}

								if (field1051.startsWith("glow3:")) {
									var13 = 11;
									field1051 = field1051.substring(6);
								}

								byte var14 = 0;
								if (field1051.startsWith("wave:")) {
									var14 = 1;
									field1051 = field1051.substring(5);
								}

								if (field1051.startsWith("scroll:")) {
									var14 = 2;
									field1051 = field1051.substring(7);
								}

								field1274.method228(83);
								field1274.method229(0);
								int var15 = field1274.field624;
								field1274.method229(var13);
								field1274.method229(var14);
								class53.method318(field1051, field1274);
								field1274.method238(field1274.field624 - var15);
								field1051 = class52.method315(field1051);
								field1051 = class71.method403(field1051);
								field1438.field380 = field1051;
								field1438.field382 = var13;
								field1438.field383 = var14;
								field1438.field381 = 150;

								if (field1367 == 2) {
									method465("@cr2@" + field1438.field424, field1438.field380, 2);
								} else if (field1367 == 1) {
									method465("@cr1@" + field1438.field424, field1438.field380, 2);
								} else {
									method465(field1438.field424, field1438.field380, 2);
								}

								if (field1055 == 2) {
									field1055 = 3;
									field1338 = true;
									field1274.method228(129);
									field1274.method229(field1055);
									field1274.method229(field1308);
									field1274.method229(field1068);
								}
							}

							field1051 = "";
							field1057 = true;
						}
					}
				}

				if (var1 == 8 && field1395.length() > 0) {
					field1395 = field1395.substring(0, field1395.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1395.length() < 12) {
				field1395 = field1395 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method529() {
		class57.field852.method117();
		class57.field853.method117();
		class59.field891.method117();
		class60.field937.method117();
		class60.field938.method117();
		class28.field445.method117();
		class68.field1011.method117();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.b(ILd;)Z")
	public final boolean method530(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method476(arg0, var2);
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

	@ObfuscatedName("client.a(IIIILbb;)V")
	public final void method531(int arg0, int arg1, int arg2, class28 arg3) {
		if (field1438 != arg3 && field1359 < 400) {
			String var5 = arg3.field424 + method440(arg3.field430, field1438.field430) + " (level-" + arg3.field430 + ")";
			if (field1117 == 1) {
				field1449[field1359] = "Use " + field1121 + " with @whi@" + var5;
				field1349[field1359] = 275;
				field1350[field1359] = arg0;
				field1347[field1359] = arg2;
				field1348[field1359] = arg1;
				field1359++;
			} else if (field1097 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1139[var6] != null) {
						field1449[field1359] = field1139[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1139[var6].equalsIgnoreCase("attack")) {
							if (arg3.field430 > field1438.field430) {
								var7 = 2000;
							}
						} else if (field1140[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1349[field1359] = var7 + 639;
						}

						if (var6 == 1) {
							field1349[field1359] = var7 + 499;
						}

						if (var6 == 2) {
							field1349[field1359] = var7 + 27;
						}

						if (var6 == 3) {
							field1349[field1359] = var7 + 387;
						}

						if (var6 == 4) {
							field1349[field1359] = var7 + 185;
						}

						field1350[field1359] = arg0;
						field1347[field1359] = arg2;
						field1348[field1359] = arg1;
						field1359++;
					}
				}
			} else if ((field1099 & 0x8) == 8) {
				field1449[field1359] = field1100 + " @whi@" + var5;
				field1349[field1359] = 131;
				field1350[field1359] = arg0;
				field1347[field1359] = arg2;
				field1348[field1359] = arg1;
				field1359++;
			}

			for (int var8 = 0; var8 < field1359; var8++) {
				if (field1349[var8] == 718) {
					field1449[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IZLmb;)V")
	public final void method532(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1254; var3++) {
			int var4 = field1255[var3];
			class28 var5 = field1251[var4];
			int var6 = arg1.method239();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method239() << 8;
			}

			method498(var4, var6, var5, arg1);
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method533() {
		for (class41 var1 = (class41) field1373.method258(); var1 != null; var1 = (class41) field1373.method260()) {
			if (var1.field652 == -1) {
				var1.field651 = 0;
				method446(var1);
			} else {
				var1.method120();
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method534() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1408) {
			field1056 = false;
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

		if (field1376) {
			field1056 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1169) {
			field1056 = false;
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

	@ObfuscatedName("client.b(ZZ)V")
	public final void method535(boolean arg0) {
		if (field1438.field368 >> 7 == field1444 && field1438.field369 >> 7 == field1445) {
			field1444 = 0;
			field1325++;
			if (field1325 > 122) {
				field1325 = 0;
				field1274.method228(36);
				field1274.method229(62);
			}
		}

		int var2 = field1252;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class28 var4;
			int var5;
			if (arg0) {
				var4 = field1438;
				var5 = field1250 << 14;
			} else {
				var4 = field1251[field1253[var3]];
				var5 = field1253[var3] << 14;
			}

			if (var4 != null && var4.method127()) {
				var4.field443 = false;
				if ((field1132 && field1252 > 50 || field1252 > 200) && !arg0 && var4.field393 == var4.field373) {
					var4.field443 = true;
				}

				int var6 = var4.field368 >> 7;
				int var7 = var4.field369 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field438 == null || field1417 < var4.field433 || field1417 >= var4.field434) {
						if ((var4.field368 & 0x7F) == 0x40 && (var4.field369 & 0x7F) == 0x40) {
							if (field1443[var6][var7] == field1405) {
								continue;
							}

							field1443[var6][var7] = field1405;
						}

						var4.field432 = method542(var4.field368, var4.field369, field1406);
						field1066.method75(var5, var4.field368, var4.field432, var4, var4.field369, field1406, 60, var4.field371, var4.field370);
					} else {
						var4.field443 = false;
						var4.field432 = method542(var4.field368, var4.field369, field1406);
						field1066.method76(var4.field369, var4.field370, 60, var5, var4.field441, var4.field442, field1406, var4.field439, var4.field440, var4, var4.field432, var4.field368);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method536(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg0];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method536(var6.field61, arg1);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method530(var6);
				int var8;
				if (var7) {
					var8 = var6.field110;
				} else {
					var8 = var6.field109;
				}

				if (var8 != -1) {
					class66 var9 = class66.field980[var8];
					var6.field60 += arg1;
					while (var6.field60 > var9.method384(var6.field59)) {
						var6.field60 -= var9.method384(var6.field59) + 1;
						var6.field59++;
						if (var6.field59 >= var9.field981) {
							var6.field59 -= var9.field985;
							if (var6.field59 < 0 || var6.field59 >= var9.field981) {
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

	@ObfuscatedName("client.J(I)V")
	public final void method537() {
		for (class33 var1 = (class33) field1167.method258(); var1 != null; var1 = (class33) field1167.method260()) {
			if (field1406 != var1.field557 || var1.field563) {
				var1.method120();
			} else if (field1417 >= var1.field556) {
				var1.method164(field1091);

				if (var1.field563) {
					var1.method120();
				} else {
					field1066.method75(-1, var1.field558, var1.field560, var1, var1.field559, var1.field557, 60, false, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method538(class39 arg0, int arg1) {
		int var3 = arg0.method250(8);
		if (var3 < field1252) {
			for (int var4 = var3; var4 < field1252; var4++) {
				field1142[field1141++] = field1253[var4];
			}
		}

		if (var3 > field1252) {
			signlink.reporterror(field1387 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1252 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1253[var5];
			class28 var7 = field1251[var6];
			int var8 = arg0.method250(1);
			if (var8 == 0) {
				field1253[field1252++] = var6;
				var7.field413 = field1417;
			} else {
				int var9 = arg0.method250(2);
				if (var9 == 0) {
					field1253[field1252++] = var6;
					var7.field413 = field1417;
					field1255[field1254++] = var6;
				} else if (var9 == 1) {
					field1253[field1252++] = var6;
					var7.field413 = field1417;
					int var10 = arg0.method250(3);
					var7.method125(var10, false);
					int var11 = arg0.method250(1);
					if (var11 == 1) {
						field1255[field1254++] = var6;
					}
				} else if (var9 == 2) {
					field1253[field1252++] = var6;
					var7.field413 = field1417;
					int var12 = arg0.method250(3);
					var7.method125(var12, true);
					int var13 = arg0.method250(3);
					var7.method125(var13, true);
					int var14 = arg0.method250(1);
					if (var14 == 1) {
						field1255[field1254++] = var6;
					}
				} else if (var9 == 3) {
					field1142[field1141++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method539() {
		field1056 = false;
		while (field1146) {
			field1056 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1402 = null;
		field1403 = null;
		field1076 = null;
		field1282 = null;
		field1283 = null;
		field1284 = null;
		field1285 = null;
		field1380 = null;
		field1381 = null;
		field1226 = null;
		field1227 = null;
		field1230 = null;
		field1231 = null;
	}

	@ObfuscatedName("client.a(B[BZ)V")
	public final void method540(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.L(I)V")
	public final void method541() {
		if (field1117 == 0 && field1097 == 0) {
			field1449[field1359] = "Walk here";
			field1349[field1359] = 718;
			field1347[field1359] = field17;
			field1348[field1359] = field18;
			field1359++;
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

				if (var6 == 2 && field1066.method94(field1406, var4, var5, var3) >= 0) {
					class57 var8 = class57.method334(var7);
					if (field1117 == 1) {
						field1449[field1359] = "Use " + field1121 + " with @cya@" + var8.field821;
						field1349[field1359] = 810;
						field1350[field1359] = var3;
						field1347[field1359] = var4;
						field1348[field1359] = var5;
						field1359++;
					} else if (field1097 != 1) {
						if (var8.field837 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field837[var9] != null) {
									field1449[field1359] = var8.field837[var9] + " @cya@" + var8.field821;

									if (var9 == 0) {
										field1349[field1359] = 625;
									}

									if (var9 == 1) {
										field1349[field1359] = 721;
									}

									if (var9 == 2) {
										field1349[field1359] = 743;
									}

									if (var9 == 3) {
										field1349[field1359] = 357;
									}

									if (var9 == 4) {
										field1349[field1359] = 1071;
									}

									field1350[field1359] = var3;
									field1347[field1359] = var4;
									field1348[field1359] = var5;
									field1359++;
								}
							}
						}

						field1449[field1359] = "Examine @cya@" + var8.field821;
						field1349[field1359] = 1381;
						field1350[field1359] = var3;
						field1347[field1359] = var4;
						field1348[field1359] = var5;
						field1359++;
					} else if ((field1099 & 0x4) == 4) {
						field1449[field1359] = field1100 + " @cya@" + var8.field821;
						field1349[field1359] = 899;
						field1350[field1359] = var3;
						field1347[field1359] = var4;
						field1348[field1359] = var5;
						field1359++;
					}
				}

				if (var6 == 1) {
					class27 var10 = field1242[var7];
					if (var10.field423.field868 == 1 && (var10.field368 & 0x7F) == 0x40 && (var10.field369 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1243; var11++) {
							class27 var12 = field1242[field1244[var11]];
							if (var12 != null && var10 != var12 && var12.field423.field868 == 1 && var10.field368 == var12.field368 && var10.field369 == var12.field369) {
								method431(var4, var12.field423, var5, field1244[var11]);
							}
						}
					}

					method431(var4, var10.field423, var5, var7);
				}

				if (var6 == 0) {
					class28 var13 = field1251[var7];
					if ((var13.field368 & 0x7F) == 0x40 && (var13.field369 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1243; var14++) {
							class27 var15 = field1242[field1244[var14]];
							if (var15 != null && var15.field423.field868 == 1 && var13.field368 == var15.field368 && var13.field369 == var15.field369) {
								method431(var4, var15.field423, var5, field1244[var14]);
							}
						}

						for (int var16 = 0; var16 < field1252; var16++) {
							class28 var17 = field1251[field1253[var16]];
							if (var17 != null && var13 != var17 && var13.field368 == var17.field368 && var13.field369 == var17.field369) {
								method531(field1253[var16], var5, var4, var17);
							}
						}
					}

					method531(var7, var5, var4, var13);
				}

				if (var6 == 3) {
					class42 var18 = field1415[field1406][var4][var5];
					if (var18 != null) {
						for (class30 var19 = (class30) var18.method259(); var19 != null; var19 = (class30) var18.method261()) {
							class60 var20 = class60.method350(var19.field456);
							if (field1117 == 1) {
								field1449[field1359] = "Use " + field1121 + " with @lre@" + var20.field900;
								field1349[field1359] = 111;
								field1350[field1359] = var19.field456;
								field1347[field1359] = var4;
								field1348[field1359] = var5;
								field1359++;
							} else if (field1097 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field914 != null && var20.field914[var21] != null) {
										field1449[field1359] = var20.field914[var21] + " @lre@" + var20.field900;

										if (var21 == 0) {
											field1349[field1359] = 139;
										}

										if (var21 == 1) {
											field1349[field1359] = 778;
										}

										if (var21 == 2) {
											field1349[field1359] = 617;
										}

										if (var21 == 3) {
											field1349[field1359] = 224;
										}

										if (var21 == 4) {
											field1349[field1359] = 662;
										}

										field1350[field1359] = var19.field456;
										field1347[field1359] = var4;
										field1348[field1359] = var5;
										field1359++;
									} else if (var21 == 2) {
										field1449[field1359] = "Take @lre@" + var20.field900;
										field1349[field1359] = 617;
										field1350[field1359] = var19.field456;
										field1347[field1359] = var4;
										field1348[field1359] = var5;
										field1359++;
									}
								}

								field1449[field1359] = "Examine @lre@" + var20.field900;
								field1349[field1359] = 1152;
								field1350[field1359] = var19.field456;
								field1347[field1359] = var4;
								field1348[field1359] = var5;
								field1359++;
							} else if ((field1099 & 0x1) == 1) {
								field1449[field1359] = field1100 + " @lre@" + var20.field900;
								field1349[field1359] = 370;
								field1350[field1359] = var19.field456;
								field1347[field1359] = var4;
								field1348[field1359] = var5;
								field1359++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method10() {
		field1200 = true;
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method542(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field1069[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field1232[var6][var4][var5] + field1232[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1232[var6][var4][var5 + 1] + field1232[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(ZIILd;I)V")
	public final void method543(int arg0, int arg1, class4 arg2, int arg3) {
		if (arg2.field63 == 0 && arg2.field78 != null && (!arg2.field77 || field1127 == arg2.field61 || field1257 == arg2.field61 || field1197 == arg2.field61)) {
			int var5 = class34.field569;
			int var6 = class34.field567;
			int var7 = class34.field570;
			int var8 = class34.field568;
			class34.method167(arg1, arg0, arg2.field67 + arg1, arg2.field66 + arg0);
			int var9 = arg2.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field79[var10] + arg0;
				int var12 = arg2.field80[var10] + arg1 - arg3;
				class4 var13 = class4.field56[arg2.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method502(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method543(var11, var12, var13, var13.field76);

					if (var13.field75 > var13.field67) {
						method508(var13.field76, var12, var13.field67, var13.field75, var13.field66 + var11);
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
									if (var17 > class34.field569 - 32 && var17 < class34.field570 && var18 > class34.field567 - 32 && var18 < class34.field568 || field1355 != 0 && field1354 == var14) {
										int var22 = 0;
										if (field1117 == 1 && field1118 == var14 && field1119 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class36 var23 = class60.method356(var13.field58[var14], var21, var22);
										if (var23 != null) {
											if (field1355 != 0 && field1354 == var14 && field1353 == var13.field61) {
												var19 = field17 - field1356;
												var20 = field18 - field1357;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1306 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method201(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < class34.field567 && arg2.field76 > 0) {
													int var24 = (class34.field567 - var18 - var20) * field1091 / 3;
													if (var24 > field1091 * 10) {
														var24 = field1091 * 10;
													}

													if (var24 > arg2.field76) {
														var24 = arg2.field76;
													}

													arg2.field76 -= var24;
													field1357 += var24;
												}

												if (var18 + var20 + 32 > class34.field568 && arg2.field76 < arg2.field75 - arg2.field67) {
													int var25 = (var18 + var20 + 32 - class34.field568) * field1091 / 3;
													if (var25 > field1091 * 10) {
														var25 = field1091 * 10;
													}

													if (var25 > arg2.field75 - arg2.field67 - arg2.field76) {
														var25 = arg2.field75 - arg2.field67 - arg2.field76;
													}

													arg2.field76 += var25;
													field1357 -= var25;
												}
											} else if (field1296 != 0 && field1295 == var14 && field1294 == var13.field61) {
												var23.method201(var17, 128, var18);
											} else {
												var23.method199(var17, var18);
											}

											if (var23.field602 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1221.method217(var18 + var20 + 10, 0, method479(var26), var17 + var19 + 1);
												field1221.method217(var18 + var20 + 9, 0xFFFF00, method479(var26), var17 + var19);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									class36 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method199(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field63 == 3) {
						boolean var28 = false;
						if (field1197 == var13.field61 || field1257 == var13.field61 || field1127 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method530(var13)) {
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
								class34.method170(var29, var13.field66, var12, var13.field67, var11);
							} else {
								class34.method171(var13.field67, var12, var11, var13.field66, var29);
							}
						} else if (var13.field93) {
							class34.method169(256 - (var13.field68 & 0xFF), var11, var13.field67, var12, var29, var13.field66);
						} else {
							class34.method172(var11, var13.field67, var29, var12, 256 - (var13.field68 & 0xFF), var13.field66);
						}
					} else if (var13.field63 == 4) {
						class38 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1197 == var13.field61 || field1257 == var13.field61 || field1127 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method530(var13)) {
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

						if (var13.field64 == 6 && field1063) {
							var31 = "Please wait...";
							var33 = var13.field99;
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

									var31 = var31.substring(0, var35) + method452(method476(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method452(method476(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method452(method476(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method452(method476(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method452(method476(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method215(var41, var13.field66 / 2 + var11, var13.field95, var33, var34);
							} else {
								var30.method219(var33, var13.field95, var41, var34, var11);
							}

							var34 += var30.field619;
						}
					} else if (var13.field63 == 5) {
						class36 var42;
						if (method530(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method199(var11, var12);
						}
					} else if (var13.field63 == 6) {
						int var43 = class35.field579;
						int var44 = class35.field580;
						class35.field579 = var13.field66 / 2 + var11;
						class35.field580 = var13.field67 / 2 + var12;
						int var45 = class35.field583[var13.field112] * var13.field111 >> 16;
						int var46 = class35.field584[var13.field112] * var13.field111 >> 16;
						boolean var47 = method530(var13);
						int var48;
						if (var47) {
							var48 = var13.field110;
						} else {
							var48 = var13.field109;
						}

						class32 var49;
						if (var48 == -1) {
							var49 = var13.method34(-1, var47, -1);
						} else {
							class66 var50 = class66.field980[var48];
							var49 = var13.method34(var50.field982[var13.field59], var47, var50.field983[var13.field59]);
						}

						if (var49 != null) {
							var49.method159(0, var13.field113, 0, var13.field112, 0, var45, var46);
						}

						class35.field579 = var43;
						class35.field580 = var44;
					} else if (var13.field63 == 7) {
						class38 var51 = var13.field96;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field67; var53++) {
							for (int var54 = 0; var54 < var13.field66; var54++) {
								if (var13.field57[var52] > 0) {
									class60 var55 = class60.method350(var13.field57[var52] - 1);
									String var56 = var55.field900;
									if (var55.field911 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method517(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method215(var56, var13.field66 / 2 + var57, var13.field95, var13.field99, var58);
									} else {
										var51.method219(var13.field99, var13.field95, var56, var58, var57);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class34.method167(var6, var5, var8, var7);
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method544() {
		short var1 = 256;

		if (field1384 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1384 > 768) {
					field1282[var2] = method488(field1283[var2], 1024 - field1384, field1284[var2]);
				} else if (field1384 > 256) {
					field1282[var2] = field1284[var2];
				} else {
					field1282[var2] = method488(field1284[var2], 256 - field1384, field1283[var2]);
				}
			}
		} else if (field1385 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1385 > 768) {
					field1282[var3] = method488(field1283[var3], 1024 - field1385, field1285[var3]);
				} else if (field1385 > 256) {
					field1282[var3] = field1285[var3];
				} else {
					field1282[var3] = method488(field1285[var3], 256 - field1385, field1283[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1282[var4] = field1283[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1425.field657[var5] = field1230.field597[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1304[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1226[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1282[var12];
					int var15 = field1425.field657[var7];
					field1425.field657[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1425.method269(field9, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1426.field657[var16] = field1231.field597[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1304[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1226[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1282[var23];
					int var26 = field1426.field657[var18];
					field1426.field657[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1426.method269(field9, 0, 637);
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method545() {
		for (int var1 = 0; var1 < field1243; var1++) {
			int var2 = field1244[var1];
			class27 var3 = field1242[var2];
			if (var3 != null) {
				method546(var3, var3.field423.field868);
			}
		}
	}

	@ObfuscatedName("client.a(Lz;II)V")
	public final void method546(class26 arg0, int arg1) {
		if (arg0.field368 < 128 || arg0.field369 < 128 || arg0.field368 >= 13184 || arg0.field369 >= 13184) {
			arg0.field396 = -1;
			arg0.field401 = -1;
			arg0.field410 = 0;
			arg0.field411 = 0;
			arg0.field368 = arg0.field418[0] * 128 + arg0.field372 * 64;
			arg0.field369 = arg0.field419[0] * 128 + arg0.field372 * 64;
			arg0.method126();
		}

		if (field1438 == arg0 && (arg0.field368 < 1536 || arg0.field369 < 1536 || arg0.field368 >= 11776 || arg0.field369 >= 11776)) {
			arg0.field396 = -1;
			arg0.field401 = -1;
			arg0.field410 = 0;
			arg0.field411 = 0;
			arg0.field368 = arg0.field418[0] * 128 + arg0.field372 * 64;
			arg0.field369 = arg0.field419[0] * 128 + arg0.field372 * 64;
			arg0.method126();
		}

		if (arg0.field410 > field1417) {
			method547(arg0);
		} else if (arg0.field411 >= field1417) {
			method548(arg0);
		} else {
			method549(arg0);
		}

		method550(arg0);
		method551(arg0);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method547(class26 arg0) {
		int var2 = arg0.field410 - field1417;
		int var3 = arg0.field406 * 128 + arg0.field372 * 64;
		int var4 = arg0.field408 * 128 + arg0.field372 * 64;
		arg0.field368 += (var3 - arg0.field368) / var2;
		arg0.field369 += (var4 - arg0.field369) / var2;
		arg0.field421 = 0;

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
	public final void method548(class26 arg0) {
		if (field1417 == arg0.field411 || arg0.field396 == -1 || arg0.field399 != 0 || arg0.field398 + 1 > class66.field980[arg0.field396].method384(arg0.field397)) {
			int var2 = arg0.field411 - arg0.field410;
			int var3 = field1417 - arg0.field410;
			int var4 = arg0.field406 * 128 + arg0.field372 * 64;
			int var5 = arg0.field408 * 128 + arg0.field372 * 64;
			int var6 = arg0.field407 * 128 + arg0.field372 * 64;
			int var7 = arg0.field409 * 128 + arg0.field372 * 64;
			arg0.field368 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field369 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field421 = 0;

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

	@ObfuscatedName("client.b(Lz;I)V")
	public final void method549(class26 arg0) {
		arg0.field393 = arg0.field373;
		if (arg0.field417 == 0) {
			arg0.field421 = 0;
		} else {
			if (arg0.field396 != -1 && arg0.field399 == 0) {
				class66 var2 = class66.field980[arg0.field396];
				if (arg0.field422 > 0 && var2.field992 == 0) {
					arg0.field421++;
					return;
				}

				if (arg0.field422 <= 0 && var2.field993 == 0) {
					arg0.field421++;
					return;
				}
			}

			int var3 = arg0.field368;
			int var4 = arg0.field369;
			int var5 = arg0.field418[arg0.field417 - 1] * 128 + arg0.field372 * 64;
			int var6 = arg0.field419[arg0.field417 - 1] * 128 + arg0.field372 * 64;
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
				if (arg0.field415 != arg0.field370 && arg0.field390 == -1 && arg0.field416 != 0) {
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
					arg0.field417--;

					if (arg0.field422 > 0) {
						arg0.field422--;
						return;
					}
				}
			} else {
				arg0.field368 = var5;
				arg0.field369 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(Lz;Z)V")
	public final void method550(class26 arg0) {
		if (arg0.field416 != 0) {
			if (arg0.field390 != -1 && arg0.field390 < 32768) {
				class27 var2 = field1242[arg0.field390];
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
				if (field1079 == var5) {
					var5 = field1250;
				}

				class28 var6 = field1251[var5];
				if (var6 != null) {
					int var7 = arg0.field368 - var6.field368;
					int var8 = arg0.field369 - var6.field369;
					if (var7 != 0 || var8 != 0) {
						arg0.field415 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field391 != 0 || arg0.field392 != 0) && (arg0.field417 == 0 || arg0.field421 > 0)) {
				int var9 = arg0.field368 - (arg0.field391 - field1313 - field1313) * 64;
				int var10 = arg0.field369 - (arg0.field392 - field1314 - field1314) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field415 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field391 = 0;
				arg0.field392 = 0;
			}

			int var11 = arg0.field415 - arg0.field370 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field416 || var11 > 2048 - arg0.field416) {
					arg0.field370 = arg0.field415;
				} else if (var11 > 1024) {
					arg0.field370 -= arg0.field416;
				} else {
					arg0.field370 += arg0.field416;
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
	}

	@ObfuscatedName("client.a(ZLz;)V")
	public final void method551(class26 arg0) {
		arg0.field371 = false;

		if (arg0.field393 != -1) {
			class66 var2 = class66.field980[arg0.field393];
			arg0.field395++;
			if (arg0.field394 < var2.field981 && arg0.field395 > var2.method384(arg0.field394)) {
				arg0.field395 = 0;
				arg0.field394++;
			}

			if (arg0.field394 >= var2.field981) {
				arg0.field395 = 0;
				arg0.field394 = 0;
			}
		}

		if (arg0.field401 != -1 && field1417 >= arg0.field404) {
			if (arg0.field402 < 0) {
				arg0.field402 = 0;
			}

			class66 var3 = class68.field999[arg0.field401].field1003;
			arg0.field403++;
			while (arg0.field402 < var3.field981 && arg0.field403 > var3.method384(arg0.field402)) {
				arg0.field403 -= var3.method384(arg0.field402);
				arg0.field402++;
			}

			if (arg0.field402 >= var3.field981 && (arg0.field402 < 0 || arg0.field402 >= var3.field981)) {
				arg0.field401 = -1;
			}
		}

		if (arg0.field396 != -1 && arg0.field399 <= 1) {
			class66 var4 = class66.field980[arg0.field396];
			if (var4.field992 == 1 && arg0.field422 > 0 && arg0.field410 <= field1417 && arg0.field411 < field1417) {
				arg0.field399 = 1;
				return;
			}
		}

		if (arg0.field396 != -1 && arg0.field399 == 0) {
			class66 var5 = class66.field980[arg0.field396];
			arg0.field398++;
			while (arg0.field397 < var5.field981 && arg0.field398 > var5.method384(arg0.field397)) {
				arg0.field398 -= var5.method384(arg0.field397);
				arg0.field397++;
			}

			if (arg0.field397 >= var5.field981) {
				arg0.field397 -= var5.field985;
				arg0.field400++;
				if (arg0.field400 >= var5.field991) {
					arg0.field396 = -1;
				}

				if (arg0.field397 < 0 || arg0.field397 >= var5.field981) {
					arg0.field396 = -1;
				}
			}

			arg0.field371 = var5.field987;
		}

		if (arg0.field399 > 0) {
			arg0.field399--;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method552() {
		if (field1200) {
			field1200 = false;
			field1328.method269(field9, 4, 0);
			field1329.method269(field9, 357, 0);
			field1330.method269(field9, 4, 722);
			field1331.method269(field9, 205, 743);
			field1332.method269(field9, 0, 0);
			field1333.method269(field9, 4, 516);
			field1334.method269(field9, 205, 516);
			field1335.method269(field9, 357, 496);
			field1336.method269(field9, 338, 0);
			field1194 = true;
			field1057 = true;
			field1237 = true;
			field1338 = true;

			if (field1372 != 2) {
				field1104.method269(field9, 4, 4);
				field1103.method269(field9, 4, 550);
			}
		}

		if (field1372 == 2) {
			method467();
		}

		if (field1247 && field1109 == 1) {
			field1194 = true;
		}

		if (field1212 != -1) {
			boolean var1 = method536(field1212, field1091);
			if (var1) {
				field1194 = true;
			}
		}

		if (field1296 == 2) {
			field1194 = true;
		}

		if (field1355 == 2) {
			field1194 = true;
		}

		if (field1194) {
			method522();
			field1194 = false;
		}

		if (field1220 == -1) {
			field1067.field76 = field1326 - field1186 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method437(77, field1326, 0, field18 - 357, false, 463, field1067, field17 - 17);
			}

			int var2 = field1326 - field1067.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1326 - 77) {
				var2 = field1326 - 77;
			}

			if (field1186 != var2) {
				field1186 = var2;
				field1057 = true;
			}
		}

		if (field1220 != -1) {
			boolean var3 = method536(field1220, field1091);
			if (var3) {
				field1057 = true;
			}
		}

		if (field1296 == 3) {
			field1057 = true;
		}

		if (field1355 == 3) {
			field1057 = true;
		}

		if (field1171 != null) {
			field1057 = true;
		}

		if (field1247 && field1109 == 2) {
			field1057 = true;
		}

		if (field1057) {
			method497();
			field1057 = false;
		}

		if (field1372 == 2) {
			method512();
			field1103.method269(field9, 4, 550);
		}

		if (field1107 != -1) {
			field1237 = true;
		}

		if (field1237) {
			if (field1107 != -1 && field1206 == field1107) {
				field1107 = -1;
				field1274.method228(201);
				field1274.method229(field1206);
			}

			field1237 = false;
			field1125.method268();
			field1062.method212(0, 0);

			if (field1212 == -1) {
				if (field1310[field1206] != -1) {
					if (field1206 == 0) {
						field1134.method212(22, 10);
					}

					if (field1206 == 1) {
						field1135.method212(54, 8);
					}

					if (field1206 == 2) {
						field1135.method212(82, 8);
					}

					if (field1206 == 3) {
						field1136.method212(110, 8);
					}

					if (field1206 == 4) {
						field1138.method212(153, 8);
					}

					if (field1206 == 5) {
						field1138.method212(181, 8);
					}

					if (field1206 == 6) {
						field1137.method212(209, 9);
					}
				}

				if (field1310[0] != -1 && (field1107 != 0 || field1417 % 20 < 10)) {
					field1214[0].method212(29, 13);
				}

				if (field1310[1] != -1 && (field1107 != 1 || field1417 % 20 < 10)) {
					field1214[1].method212(53, 11);
				}

				if (field1310[2] != -1 && (field1107 != 2 || field1417 % 20 < 10)) {
					field1214[2].method212(82, 11);
				}

				if (field1310[3] != -1 && (field1107 != 3 || field1417 % 20 < 10)) {
					field1214[3].method212(115, 12);
				}

				if (field1310[4] != -1 && (field1107 != 4 || field1417 % 20 < 10)) {
					field1214[4].method212(153, 13);
				}

				if (field1310[5] != -1 && (field1107 != 5 || field1417 % 20 < 10)) {
					field1214[5].method212(180, 11);
				}

				if (field1310[6] != -1 && (field1107 != 6 || field1417 % 20 < 10)) {
					field1214[6].method212(208, 13);
				}
			}

			field1125.method269(field9, 160, 516);
			field1124.method268();
			field1061.method212(0, 0);

			if (field1212 == -1) {
				if (field1310[field1206] != -1) {
					if (field1206 == 7) {
						field1275.method212(42, 0);
					}

					if (field1206 == 8) {
						field1276.method212(74, 0);
					}

					if (field1206 == 9) {
						field1276.method212(102, 0);
					}

					if (field1206 == 10) {
						field1277.method212(130, 1);
					}

					if (field1206 == 11) {
						field1279.method212(173, 0);
					}

					if (field1206 == 12) {
						field1279.method212(201, 0);
					}

					if (field1206 == 13) {
						field1278.method212(229, 0);
					}
				}

				if (field1310[8] != -1 && (field1107 != 8 || field1417 % 20 < 10)) {
					field1214[7].method212(74, 2);
				}

				if (field1310[9] != -1 && (field1107 != 9 || field1417 % 20 < 10)) {
					field1214[8].method212(102, 3);
				}

				if (field1310[10] != -1 && (field1107 != 10 || field1417 % 20 < 10)) {
					field1214[9].method212(137, 4);
				}

				if (field1310[11] != -1 && (field1107 != 11 || field1417 % 20 < 10)) {
					field1214[10].method212(174, 2);
				}

				if (field1310[12] != -1 && (field1107 != 12 || field1417 % 20 < 10)) {
					field1214[11].method212(201, 2);
				}

				if (field1310[13] != -1 && (field1107 != 13 || field1417 % 20 < 10)) {
					field1214[12].method212(226, 2);
				}
			}

			field1124.method269(field9, 466, 496);
			field1104.method268();
		}

		if (field1338) {
			field1338 = false;
			field1123.method268();
			field1060.method212(0, 0);
			field1222.method215("Public chat", 55, true, 0xFFFFFF, 28);

			if (field1055 == 0) {
				field1222.method215("On", 55, true, 0xFF00, 41);
			}

			if (field1055 == 1) {
				field1222.method215("Friends", 55, true, 0xFFFF00, 41);
			}

			if (field1055 == 2) {
				field1222.method215("Off", 55, true, 0xFF0000, 41);
			}

			if (field1055 == 3) {
				field1222.method215("Hide", 55, true, 0xFFFF, 41);
			}

			field1222.method215("Private chat", 184, true, 0xFFFFFF, 28);

			if (field1308 == 0) {
				field1222.method215("On", 184, true, 0xFF00, 41);
			}

			if (field1308 == 1) {
				field1222.method215("Friends", 184, true, 0xFFFF00, 41);
			}

			if (field1308 == 2) {
				field1222.method215("Off", 184, true, 0xFF0000, 41);
			}

			field1222.method215("Trade/duel", 324, true, 0xFFFFFF, 28);

			if (field1068 == 0) {
				field1222.method215("On", 324, true, 0xFF00, 41);
			}

			if (field1068 == 1) {
				field1222.method215("Friends", 324, true, 0xFFFF00, 41);
			}

			if (field1068 == 2) {
				field1222.method215("Off", 324, true, 0xFF0000, 41);
			}

			field1222.method215("Report abuse", 458, true, 0xFFFFFF, 33);
			field1123.method269(field9, 453, 0);
			field1104.method268();
		}

		field1091 = 0;
	}

	@ObfuscatedName("client.N(I)V")
	public final void method553() {
		for (int var1 = 0; var1 < field1394; var1++) {
			if (field1451[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1188[var1] != field1418 || field1318[var1] != field1301) {
						class39 var3 = class55.method323(field1318[var1], field1188[var1]);
						if (System.currentTimeMillis() + var3.field624 / 22 > field1168 / 22 + field1170) {
							field1168 = var3.field624;
							field1170 = System.currentTimeMillis();

							if (method436(var3.field623, var3.field624)) {
								field1418 = field1188[var1];
								field1301 = field1318[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method451()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1451[var1] != -5) {
					field1451[var1] = -5;
				} else {
					field1394--;
					for (int var5 = var1; var5 < field1394; var5++) {
						field1188[var5] = field1188[var5 + 1];
						field1318[var5] = field1318[var5 + 1];
						field1451[var5] = field1451[var5 + 1];
					}

					var1--;
				}
			} else {
				field1451[var1]--;
			}
		}

		if (field1280 > 0) {
			field1280 -= 20;
			if (field1280 < 0) {
				field1280 = 0;
			}

			if (field1280 == 0 && field1291 && !field1132) {
				field1398 = field1144;
				field1399 = false;
				field1050.method289(2, field1398);
				return;
			}
		}
	}

	public final void init() {
		field1129 = Integer.parseInt(getParameter("nodeid"));
		field1130 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method480();
		} else {
			method470();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1131 = false;
		} else {
			field1131 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.O(I)Ljava/lang/String;")
	public final String method554() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.c(ZZ)V")
	public final void method555(boolean arg0) {
		for (int var2 = 0; var2 < field1243; var2++) {
			class27 var3 = field1242[field1244[var2]];
			int var4 = (field1244[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method127() && var3.field423.field886 == arg0) {
				int var5 = var3.field368 >> 7;
				int var6 = var3.field369 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field372 == 1 && (var3.field368 & 0x7F) == 0x40 && (var3.field369 & 0x7F) == 0x40) {
						if (field1443[var5][var6] == field1405) {
							continue;
						}

						field1443[var5][var6] = field1405;
					}

					field1066.method75(var4, var3.field368, method542(var3.field368, var3.field369, field1406), var3, var3.field369, field1406, (var3.field372 - 1) * 64 + 60, var3.field371, var3.field370);
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method556() {
		try {
			field1397 = -1;
			field1167.method262();
			field1390.method262();
			class35.method180();
			method529();
			field1066.method64();

			for (int var1 = 0; var1 < 4; var1++) {
				field1433[var1].method361();
			}

			System.gc();
			class3 var2 = new class3(field1232, field1069, 104, 104);
			int var3 = field1233.length;
			class3.field32 = class19.field266;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1286[var4] >> 8;
				int var6 = field1286[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1066.method65(field1406);
			} else {
				field1066.method65(0);
			}

			field1274.method228(239);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1286[var7] >> 8) * 64 - field1313;
				int var9 = (field1286[var7] & 0xFF) * 64 - field1314;
				byte[] var10 = field1233[var7];
				if (var10 != null) {
					var2.method15((field1211 - 6) * 8, var9, (field1210 - 6) * 8, var8, var10);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1286[var11] >> 8) * 64 - field1313;
				int var13 = (field1286[var11] & 0xFF) * 64 - field1314;
				byte[] var14 = field1233[var11];
				if (var14 == null && field1211 < 800) {
					var2.method14(64, var13, var12, 64);
				}
			}

			field1274.method228(239);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1213[var15];
				if (var16 != null) {
					int var17 = (field1286[var15] >> 8) * 64 - field1313;
					int var18 = (field1286[var15] & 0xFF) * 64 - field1314;
					var2.method18(field1066, var17, var18, var16, field1433);
				}
			}

			field1274.method228(239);
			var2.method20(field1066, field1433);
			field1104.method268();
			field1274.method228(239);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method560(var19, var20);
				}
			}

			method533();
		} catch (Exception var33) {
		}

		class57.field852.method117();

		if (field1132 && signlink.cache_dat != null) {
			int var22 = field1050.method282(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1050.method287(var23);
				if ((var24 & 0x79) == 0) {
					class32.method138(var23);
				}
			}
		}

		System.gc();
		class35.method181(20);
		field1050.method293();
		int var25 = (field1210 - 6) / 8 - 1;
		int var26 = (field1210 + 6) / 8 + 1;
		int var27 = (field1211 - 6) / 8 - 1;
		int var28 = (field1211 + 6) / 8 + 1;
		if (field1437) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1050.method284(var29, var30, 0);
					if (var31 != -1) {
						field1050.method294(var31, 3);
					}

					int var32 = field1050.method284(var29, var30, 1);
					if (var32 != -1) {
						field1050.method294(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method557(long arg0) {
		if (arg0 != 0L) {
			if (field1339 >= 100) {
				method465("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = class52.method314(class52.method311(arg0));
				for (int var4 = 0; var4 < field1339; var4++) {
					if (field1161[var4] == arg0) {
						method465("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1302; var5++) {
					if (field1205[var5] == arg0) {
						method465("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field1161[field1339++] = arg0;
				field1194 = true;
				field1274.method228(189);
				field1274.method235(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method558(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1302; var3++) {
				if (field1205[var3] == arg0) {
					field1302--;
					field1194 = true;

					for (int var4 = var3; var4 < field1302; var4++) {
						field1059[var4] = field1059[var4 + 1];
						field1187[var4] = field1187[var4 + 1];
						field1205[var4] = field1205[var4 + 1];
					}

					field1274.method228(84);
					field1274.method235(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method559(int arg0) {
		int var2 = class70.field1019[arg0].field1027;
		if (var2 != 0) {
			int var3 = field1183[arg0];
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

				class60.field938.method117();
				field1200 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1291;

				if (var3 == 0) {
					method449(field1291, 0);
					field1291 = true;
				}

				if (var3 == 1) {
					method449(field1291, -400);
					field1291 = true;
				}

				if (var3 == 2) {
					method449(field1291, -800);
					field1291 = true;
				}

				if (var3 == 3) {
					method449(field1291, -1200);
					field1291 = true;
				}

				if (var3 == 4) {
					field1291 = false;
				}

				if (field1291 != var4 && !field1132) {
					if (field1291) {
						field1398 = field1144;
						field1399 = false;
						field1050.method289(2, field1398);
					} else {
						method518();
					}

					field1280 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1155 = true;
					method477(0);
				}

				if (var3 == 1) {
					field1155 = true;
					method477(-400);
				}

				if (var3 == 2) {
					field1155 = true;
					method477(-800);
				}

				if (var3 == 3) {
					field1155 = true;
					method477(-1200);
				}

				if (var3 == 4) {
					field1155 = false;
				}
			}

			if (var2 == 5) {
				field1362 = var3;
			}

			if (var2 == 6) {
				field1126 = var3;
			}

			if (var2 == 8) {
				field1361 = var3;
				field1057 = true;
			}

			if (var2 == 9) {
				field1058 = var3;
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method560(int arg0, int arg1) {
		class42 var3 = field1415[field1406][arg0][arg1];
		if (var3 == null) {
			field1066.method85(field1406, arg0, arg1);
		} else {
			int var4 = -99999999;
			class30 var5 = null;
			for (class30 var6 = (class30) var3.method258(); var6 != null; var6 = (class30) var3.method260()) {
				class60 var7 = class60.method350(var6.field456);
				int var8 = var7.field912;
				if (var7.field911) {
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
			field1066.method71(field1406, arg1, method542(arg0 * 128 + 64, arg1 * 128 + 64, field1406), var12, var5, var10, var9, arg0);
		}
	}

	@ObfuscatedName("client.b(Lmb;II)V")
	public final void method561(class39 arg0, int arg1) {
		for (int var3 = 0; var3 < field1254; var3++) {
			int var4 = field1255[var3];
			class27 var5 = field1242[var4];
			int var6 = arg0.method239();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method239();
				int var8 = arg0.method239();
				var5.method128(var8, var7);
				var5.field387 = field1417 + 300;
				var5.field388 = arg0.method239();
				var5.field389 = arg0.method239();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg0.method241();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field396 == var9) {
					var5.field400 = 0;
				}

				int var10 = arg0.method239();
				if (var5.field396 == var9 && var9 != -1) {
					int var11 = class66.field980[var9].field994;
					if (var11 == 1) {
						var5.field397 = 0;
						var5.field398 = 0;
						var5.field399 = var10;
						var5.field400 = 0;
					}

					if (var11 == 2) {
						var5.field400 = 0;
					}
				} else if (var9 == -1 || var5.field396 == -1 || class66.field980[var9].field988 >= class66.field980[var5.field396].field988) {
					var5.field396 = var9;
					var5.field397 = 0;
					var5.field398 = 0;
					var5.field399 = var10;
					var5.field400 = 0;
					var5.field422 = var5.field417;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field390 = arg0.method241();
				if (var5.field390 == 0xFFFF) {
					var5.field390 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field380 = arg0.method246();
				var5.field381 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.method239();
				int var13 = arg0.method239();
				var5.method128(var13, var12);
				var5.field387 = field1417 + 300;
				var5.field388 = arg0.method239();
				var5.field389 = arg0.method239();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field423 = class59.method344(arg0.method241());
				var5.field372 = var5.field423.field868;
				var5.field416 = var5.field423.field890;
				var5.field375 = var5.field423.field872;
				var5.field376 = var5.field423.field873;
				var5.field377 = var5.field423.field874;
				var5.field378 = var5.field423.field875;
				var5.field373 = var5.field423.field871;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field401 = arg0.method241();
				int var14 = arg0.method244();
				var5.field405 = var14 >> 16;
				var5.field404 = (var14 & 0xFFFF) + field1417;
				var5.field402 = 0;
				var5.field403 = 0;

				if (var5.field404 > field1417) {
					var5.field402 = -1;
				}

				if (var5.field401 == 0xFFFF) {
					var5.field401 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field391 = arg0.method241();
				var5.field392 = arg0.method241();
			}
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method562() {
		try {
			int var1 = field1438.field368 + field1434;
			int var2 = field1438.field369 + field1240;
			if (field1157 - var1 < -500 || field1157 - var1 > 500 || field1158 - var2 < -500 || field1158 - var2 > 500) {
				field1157 = var1;
				field1158 = var2;
			}

			if (field1157 != var1) {
				field1157 += (var1 - field1157) / 16;
			}

			if (field1158 != var2) {
				field1158 += (var2 - field1158) / 16;
			}

			if (field27[1] == 1) {
				field1149 += (-field1149 - 24) / 2;
			} else if (field27[2] == 1) {
				field1149 += (24 - field1149) / 2;
			} else {
				field1149 /= 2;
			}

			if (field27[3] == 1) {
				field1150 += (12 - field1150) / 2;
			} else if (field27[4] == 1) {
				field1150 += (-field1150 - 12) / 2;
			} else {
				field1150 /= 2;
			}

			field1148 = field1149 / 2 + field1148 & 0x7FF;
			field1147 += field1150 / 2;
			if (field1147 < 128) {
				field1147 = 128;
			}

			if (field1147 > 383) {
				field1147 = 383;
			}

			int var3 = field1157 >> 7;
			int var4 = field1158 >> 7;
			int var5 = method542(field1157, field1158, field1406);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1406;
						if (var9 < 3 && (field1069[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1232[var9][var7][var8];
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

			if (var11 > field1311) {
				field1311 += (var11 - field1311) / 24;
			} else if (var11 < field1311) {
				field1311 += (var11 - field1311) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1438.field368 + "," + field1438.field369 + "," + field1157 + "," + field1158 + "," + field1210 + "," + field1211 + "," + field1313 + "," + field1314);
			throw new RuntimeException("eek");
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1289[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field1300[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
