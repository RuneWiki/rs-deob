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
	public String field966 = "";

	@ObfuscatedName("client.bb")
	public int[] field967 = new int[2000];

	@ObfuscatedName("client.cb")
	public String field968;

	@ObfuscatedName("client.db")
	public byte[][] field969;

	@ObfuscatedName("client.eb")
	public int field970 = 0x4D4233;

	@ObfuscatedName("client.fb")
	public long field971;

	@ObfuscatedName("client.gb")
	public String field972 = "";

	@ObfuscatedName("client.hb")
	public boolean field973 = true;

	@ObfuscatedName("client.ib")
	public int field974;

	@ObfuscatedName("client.jb")
	public int field975 = 1;

	@ObfuscatedName("client.kb")
	public int field976 = -1;

	@ObfuscatedName("client.mb")
	public int[] field977 = new int[151];

	@ObfuscatedName("client.nb")
	public int field978;

	@ObfuscatedName("client.ob")
	public int field979;

	@ObfuscatedName("client.pb")
	public int field980;

	@ObfuscatedName("client.qb")
	public int field981;

	@ObfuscatedName("client.rb")
	public int field982;

	@ObfuscatedName("client.sb")
	public int field983;

	@ObfuscatedName("client.tb")
	public int field984;

	@ObfuscatedName("client.ub")
	public int field985;

	@ObfuscatedName("client.vb")
	public int field986;

	@ObfuscatedName("client.wb")
	public int field987;

	@ObfuscatedName("client.xb")
	public String field988;

	@ObfuscatedName("client.yb")
	public class35 field989;

	@ObfuscatedName("client.zb")
	public class35 field990;

	@ObfuscatedName("client.ac")
	public int field1016;

	@ObfuscatedName("client.bc")
	public int field1017;

	@ObfuscatedName("client.cc")
	public int field1018;

	@ObfuscatedName("client.dc")
	public int field1019;

	@ObfuscatedName("client.ec")
	public int field1020;

	@ObfuscatedName("client.fc")
	public int field1021;

	@ObfuscatedName("client.gc")
	public int field1022;

	@ObfuscatedName("client.hc")
	public int field1023;

	@ObfuscatedName("client.ic")
	public String field1024 = "";

	@ObfuscatedName("client.jc")
	public static String field1025 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.kc")
	public int field1026;

	@ObfuscatedName("client.lc")
	public int[] field1027 = new int[500];

	@ObfuscatedName("client.mc")
	public int[] field1028 = new int[500];

	@ObfuscatedName("client.H")
	public boolean field949 = false;

	@ObfuscatedName("client.J")
	public int field951 = 0x23201B;

	@ObfuscatedName("client.N")
	public class41 field955 = new class41();

	@ObfuscatedName("client.P")
	public boolean field957 = false;

	@ObfuscatedName("client.S")
	public int[] field960 = new int[50];

	@ObfuscatedName("client.U")
	public boolean field961 = false;

	@ObfuscatedName("client.Z")
	public String field965 = "";

	@ObfuscatedName("client.Gb")
	public int[] field997 = new int[33];

	@ObfuscatedName("client.Kb")
	public boolean field1000 = false;

	@ObfuscatedName("client.Mb")
	public boolean field1002 = false;

	@ObfuscatedName("client.Ob")
	public class34[] field1004 = new class34[20];

	@ObfuscatedName("client.Pb")
	public int[] field1005 = new int[2000];

	@ObfuscatedName("client.Qb")
	public int field1006 = -1;

	@ObfuscatedName("client.Sb")
	public String field1008 = "";

	@ObfuscatedName("client.Tb")
	public String field1009 = "";

	@ObfuscatedName("client.Vb")
	public long[] field1011 = new long[100];

	@ObfuscatedName("client.Wb")
	public boolean field1012 = false;

	@ObfuscatedName("client.Xb")
	public class41 field1013 = new class41();

	@ObfuscatedName("client.nc")
	public int[] field1029 = new int[500];

	@ObfuscatedName("client.oc")
	public int[] field1030 = new int[500];

	@ObfuscatedName("client.qc")
	public int field1032 = 0x332D25;

	@ObfuscatedName("client.xc")
	public int[] field1039 = new int[5];

	@ObfuscatedName("client.Bc")
	public class41 field1042 = new class41();

	@ObfuscatedName("client.Hc")
	public boolean[] field1046 = new boolean[5];

	@ObfuscatedName("client.Jc")
	public final int[] field1047 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Kc")
	public int[] field1048 = new int[100];

	@ObfuscatedName("client.Lc")
	public String[] field1049 = new String[100];

	@ObfuscatedName("client.Mc")
	public String[] field1050 = new String[100];

	@ObfuscatedName("client.Oc")
	public int field1052 = 2;

	@ObfuscatedName("client.Qc")
	public int field1054 = 2;

	@ObfuscatedName("client.Rc")
	public int[] field1055 = new int[50];

	@ObfuscatedName("client.ad")
	public int field1064 = 78;

	@ObfuscatedName("client.bd")
	public boolean field1065 = false;

	@ObfuscatedName("client.wd")
	public String[] field1085 = new String[100];

	@ObfuscatedName("client.Dd")
	public int[] field1092 = new int[50];

	@ObfuscatedName("client.Jd")
	public class25[] field1098 = new class25[8192];

	@ObfuscatedName("client.Ld")
	public int[] field1100 = new int[8192];

	@ObfuscatedName("client.Nd")
	public int field1101 = 2048;

	@ObfuscatedName("client.Od")
	public int field1102 = 2047;

	@ObfuscatedName("client.Pd")
	public class26[] field1103 = new class26[field1101];

	@ObfuscatedName("client.Rd")
	public int[] field1105 = new int[field1101];

	@ObfuscatedName("client.Td")
	public int[] field1107 = new int[field1101];

	@ObfuscatedName("client.Ud")
	public class37[] field1108 = new class37[field1101];

	@ObfuscatedName("client.Vd")
	public int[] field1109 = new int[5];

	@ObfuscatedName("client.Wd")
	public int[][] field1110 = new int[104][104];

	@ObfuscatedName("client.Yd")
	public boolean field1112 = false;

	@ObfuscatedName("client.de")
	public int field1116 = -1;

	@ObfuscatedName("client.fe")
	public int[] field1118 = new int[50];

	@ObfuscatedName("client.le")
	public boolean field1124 = false;

	@ObfuscatedName("client.oe")
	public int[] field1127 = new int[5];

	@ObfuscatedName("client.qe")
	public boolean field1129 = false;

	@ObfuscatedName("client.re")
	public String[] field1130 = new String[500];

	@ObfuscatedName("client.te")
	public int field1131 = -1;

	@ObfuscatedName("client.ue")
	public int field1132 = -1;

	@ObfuscatedName("client.ze")
	public int[] field1137 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Ae")
	public class41[][][] field1138 = new class41[4][104][104];

	@ObfuscatedName("client.Ee")
	public int[] field1142 = new int[1000];

	@ObfuscatedName("client.Fe")
	public int[] field1143 = new int[1000];

	@ObfuscatedName("client.Ne")
	public boolean field1151 = false;

	@ObfuscatedName("client.Oe")
	public int field1152 = 0x766654;

	@ObfuscatedName("client.We")
	public class34[] field1160 = new class34[8];

	@ObfuscatedName("client.Ye")
	public class37 field1161 = class37.method203(1);

	@ObfuscatedName("client.ff")
	public int[] field1168 = new int[256];

	@ObfuscatedName("client.hf")
	public String field1169 = "";

	@ObfuscatedName("client.nf")
	public class37 field1174 = class37.method203(1);

	@ObfuscatedName("client.of")
	public int field1175 = -1;

	@ObfuscatedName("client.qf")
	public class60 field1177 = new class60();

	@ObfuscatedName("client.rf")
	public boolean field1178 = false;

	@ObfuscatedName("client.wf")
	public boolean field1182 = false;

	@ObfuscatedName("client.Bf")
	public int[] field1185 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Df")
	public int[] field1187 = new int[50];

	@ObfuscatedName("client.Ff")
	public final int field1189 = 100;

	@ObfuscatedName("client.Gf")
	public int[] field1190 = new int[100];

	@ObfuscatedName("client.If")
	public CRC32 field1192 = new CRC32();

	@ObfuscatedName("client.Mf")
	public byte[] field1193 = new byte[16384];

	@ObfuscatedName("client.Nf")
	public boolean field1194 = false;

	@ObfuscatedName("client.Qf")
	public boolean field1197 = false;

	@ObfuscatedName("client.Rf")
	public int[] field1198 = new int[7];

	@ObfuscatedName("client.Sf")
	public boolean field1199 = false;

	@ObfuscatedName("client.Tf")
	public int field1200 = -1;

	@ObfuscatedName("client.Wf")
	public boolean field1203 = false;

	@ObfuscatedName("client.Yf")
	public long[] field1204 = new long[100];

	@ObfuscatedName("client.ng")
	public Object field1219 = new Object();

	@ObfuscatedName("client.rg")
	public boolean field1221 = false;

	@ObfuscatedName("client.Bg")
	public int field1231 = 1;

	@ObfuscatedName("client.Hg")
	public int[] field1237 = new int[1000];

	@ObfuscatedName("client.Ig")
	public int field1238 = -1;

	@ObfuscatedName("client.Lg")
	public class37 field1239 = class37.method203(1);

	@ObfuscatedName("client.Ng")
	public int[] field1240 = new int[5];

	@ObfuscatedName("client.Ug")
	public class34[] field1247 = new class34[20];

	@ObfuscatedName("client.ah")
	public int[] field1252 = new int[5];

	@ObfuscatedName("client.bh")
	public boolean field1253 = true;

	@ObfuscatedName("client.gh")
	public int field1258 = 50;

	@ObfuscatedName("client.hh")
	public int[] field1259 = new int[field1258];

	@ObfuscatedName("client.ih")
	public int[] field1260 = new int[field1258];

	@ObfuscatedName("client.jh")
	public int[] field1261 = new int[field1258];

	@ObfuscatedName("client.kh")
	public int[] field1262 = new int[field1258];

	@ObfuscatedName("client.lh")
	public int[] field1263 = new int[field1258];

	@ObfuscatedName("client.mh")
	public int[] field1264 = new int[field1258];

	@ObfuscatedName("client.nh")
	public int[] field1265 = new int[field1258];

	@ObfuscatedName("client.oh")
	public String[] field1266 = new String[field1258];

	@ObfuscatedName("client.sh")
	public int[][] field1270 = new int[104][104];

	@ObfuscatedName("client.vh")
	public int field1273 = -1;

	@ObfuscatedName("client.wh")
	public String field1274 = "";

	@ObfuscatedName("client.yh")
	public boolean field1276 = true;

	@ObfuscatedName("client.Ah")
	public int field1277 = 3;

	@ObfuscatedName("client.Dh")
	public int field1280 = 2;

	@ObfuscatedName("client.Eh")
	public class34[] field1281 = new class34[50];

	@ObfuscatedName("client.Fh")
	public String field1282 = "";

	@ObfuscatedName("client.Gh")
	public int field1283 = -1;

	@ObfuscatedName("client.Jh")
	public int field1286 = 128;

	@ObfuscatedName("client.Nh")
	public boolean field1290 = false;

	@ObfuscatedName("client.Oh")
	public int[] field1291 = new int[100];

	@ObfuscatedName("client.Ph")
	public boolean field1292 = false;

	@ObfuscatedName("client.Qh")
	public class41 field1293 = new class41();

	@ObfuscatedName("client.Wh")
	public boolean field1299 = true;

	@ObfuscatedName("client.Yh")
	public class35[] field1301 = new class35[50];

	@ObfuscatedName("client.gi")
	public int[] field1309 = new int[4000];

	@ObfuscatedName("client.hi")
	public int[] field1310 = new int[4000];

	@ObfuscatedName("client.mi")
	public int[] field1315 = new int[9];

	@ObfuscatedName("client.ri")
	public class57[] field1318 = new class57[4];

	@ObfuscatedName("client.ui")
	public int field1320 = -1;

	@ObfuscatedName("client.yi")
	public class34[] field1323 = new class34[1000];

	@ObfuscatedName("client.Ai")
	public int field1325 = -1;

	@ObfuscatedName("client.Bi")
	public int[] field1326 = new int[151];

	@ObfuscatedName("client.Hi")
	public boolean field1332 = false;

	@ObfuscatedName("client.Ii")
	public class35[] field1333 = new class35[13];

	@ObfuscatedName("client.Li")
	public class41 field1336 = new class41();

	@ObfuscatedName("client.Mi")
	public boolean field1337 = false;

	@ObfuscatedName("client.Pi")
	public int[] field1339 = new int[33];

	@ObfuscatedName("client.Qi")
	public boolean field1340 = false;

	@ObfuscatedName("client.Ri")
	public int[] field1341 = new int[50];

	@ObfuscatedName("client.Si")
	public int[][] field1342 = new int[104][104];

	@ObfuscatedName("client.Xd")
	public static BigInteger field1111 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.pf")
	public static BigInteger field1176 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.lg")
	public static int[] field1217 = new int[99];

	@ObfuscatedName("client.Og")
	public static final int[] field1241 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.rh")
	public static final int[][] field1269 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Sh")
	public static int field1295 = 10;

	@ObfuscatedName("client.Uh")
	public static boolean field1297 = true;

	@ObfuscatedName("client.Lb")
	public int field1001;

	@ObfuscatedName("client.Nb")
	public int field1003;

	@ObfuscatedName("client.Ub")
	public int field1010;

	@ObfuscatedName("client.Yb")
	public int field1014;

	@ObfuscatedName("client.Zb")
	public int field1015;

	@ObfuscatedName("client.pc")
	public int field1031;

	@ObfuscatedName("client.rc")
	public static int field1033;

	@ObfuscatedName("client.sc")
	public int field1034;

	@ObfuscatedName("client.zc")
	public static int field1040;

	@ObfuscatedName("client.Dc")
	public int field1043;

	@ObfuscatedName("client.Fc")
	public int field1044;

	@ObfuscatedName("client.Gc")
	public int field1045;

	@ObfuscatedName("client.Nc")
	public int field1051;

	@ObfuscatedName("client.Pc")
	public int field1053;

	@ObfuscatedName("client.Yc")
	public int field1062;

	@ObfuscatedName("client.cd")
	public int field1066;

	@ObfuscatedName("client.dd")
	public int field1067;

	@ObfuscatedName("client.hd")
	public int field1070;

	@ObfuscatedName("client.id")
	public int field1071;

	@ObfuscatedName("client.jd")
	public int field1072;

	@ObfuscatedName("client.vd")
	public int field1084;

	@ObfuscatedName("client.xd")
	public int field1086;

	@ObfuscatedName("client.yd")
	public int field1087;

	@ObfuscatedName("client.zd")
	public int field1088;

	@ObfuscatedName("client.Ad")
	public int field1089;

	@ObfuscatedName("client.Bd")
	public int field1090;

	@ObfuscatedName("client.Cd")
	public int field1091;

	@ObfuscatedName("client.Ed")
	public static int field1093;

	@ObfuscatedName("client.Fd")
	public int field1094;

	@ObfuscatedName("client.Gd")
	public int field1095;

	@ObfuscatedName("client.Hd")
	public int field1096;

	@ObfuscatedName("client.Id")
	public int field1097;

	@ObfuscatedName("client.Kd")
	public int field1099;

	@ObfuscatedName("client.Qd")
	public int field1104;

	@ObfuscatedName("client.Sd")
	public int field1106;

	@ObfuscatedName("client.ae")
	public static int field1113;

	@ObfuscatedName("client.ce")
	public int field1115;

	@ObfuscatedName("client.ge")
	public int field1119;

	@ObfuscatedName("client.he")
	public int field1120;

	@ObfuscatedName("client.ie")
	public int field1121;

	@ObfuscatedName("client.je")
	public int field1122;

	@ObfuscatedName("client.ke")
	public int field1123;

	@ObfuscatedName("client.me")
	public int field1125;

	@ObfuscatedName("client.ne")
	public int field1126;

	@ObfuscatedName("client.pe")
	public static int field1128;

	@ObfuscatedName("client.ve")
	public int field1133;

	@ObfuscatedName("client.we")
	public static int field1134;

	@ObfuscatedName("client.xe")
	public int field1135;

	@ObfuscatedName("client.ye")
	public int field1136;

	@ObfuscatedName("client.De")
	public int field1141;

	@ObfuscatedName("client.Ge")
	public int field1144;

	@ObfuscatedName("client.Pe")
	public static int field1153;

	@ObfuscatedName("client.Ve")
	public int field1159;

	@ObfuscatedName("client.df")
	public int field1166;

	@ObfuscatedName("client.ef")
	public int field1167;

	@ObfuscatedName("client.lf")
	public static int field1172;

	@ObfuscatedName("client.mf")
	public int field1173;

	@ObfuscatedName("client.sf")
	public int field1179;

	@ObfuscatedName("client.tf")
	public static int field1180;

	@ObfuscatedName("client.vf")
	public int field1181;

	@ObfuscatedName("client.xf")
	public int field1183;

	@ObfuscatedName("client.yf")
	public int field1184;

	@ObfuscatedName("client.Cf")
	public int field1186;

	@ObfuscatedName("client.Ef")
	public static int field1188;

	@ObfuscatedName("client.Hf")
	public int field1191;

	@ObfuscatedName("client.Uf")
	public int field1201;

	@ObfuscatedName("client.Vf")
	public int field1202;

	@ObfuscatedName("client.Zf")
	public int field1205;

	@ObfuscatedName("client.mg")
	public int field1218;

	@ObfuscatedName("client.sg")
	public int field1222;

	@ObfuscatedName("client.tg")
	public int field1223;

	@ObfuscatedName("client.ug")
	public static int field1224;

	@ObfuscatedName("client.wg")
	public int field1226;

	@ObfuscatedName("client.xg")
	public int field1227;

	@ObfuscatedName("client.yg")
	public int field1228;

	@ObfuscatedName("client.zg")
	public int field1229;

	@ObfuscatedName("client.Ag")
	public int field1230;

	@ObfuscatedName("client.Cg")
	public int field1232;

	@ObfuscatedName("client.Dg")
	public int field1233;

	@ObfuscatedName("client.Eg")
	public int field1234;

	@ObfuscatedName("client.Fg")
	public int field1235;

	@ObfuscatedName("client.Gg")
	public int field1236;

	@ObfuscatedName("client.Pg")
	public int field1242;

	@ObfuscatedName("client.Qg")
	public int field1243;

	@ObfuscatedName("client.Rg")
	public int field1244;

	@ObfuscatedName("client.Sg")
	public int field1245;

	@ObfuscatedName("client.Tg")
	public int field1246;

	@ObfuscatedName("client.Xg")
	public int field1249;

	@ObfuscatedName("client.Yg")
	public int field1250;

	@ObfuscatedName("client.fh")
	public int field1257;

	@ObfuscatedName("client.ph")
	public int field1267;

	@ObfuscatedName("client.th")
	public int field1271;

	@ObfuscatedName("client.uh")
	public int field1272;

	@ObfuscatedName("client.xh")
	public static int field1275;

	@ObfuscatedName("client.Bh")
	public int field1278;

	@ObfuscatedName("client.Ch")
	public int field1279;

	@ObfuscatedName("client.Ih")
	public static int field1285;

	@ObfuscatedName("client.Kh")
	public int field1287;

	@ObfuscatedName("client.Lh")
	public int field1288;

	@ObfuscatedName("client.Mh")
	public int field1289;

	@ObfuscatedName("client.Th")
	public static int field1296;

	@ObfuscatedName("client.Xh")
	public static int field1300;

	@ObfuscatedName("client.ci")
	public int field1305;

	@ObfuscatedName("client.di")
	public int field1306;

	@ObfuscatedName("client.ei")
	public int field1307;

	@ObfuscatedName("client.oi")
	public static int field1316;

	@ObfuscatedName("client.pi")
	public int field1317;

	@ObfuscatedName("client.si")
	public static int field1319;

	@ObfuscatedName("client.vi")
	public int field1321;

	@ObfuscatedName("client.zi")
	public int field1324;

	@ObfuscatedName("client.Ci")
	public int field1327;

	@ObfuscatedName("client.Di")
	public int field1328;

	@ObfuscatedName("client.Ei")
	public int field1329;

	@ObfuscatedName("client.Fi")
	public int field1330;

	@ObfuscatedName("client.Gi")
	public int field1331;

	@ObfuscatedName("client.Ki")
	public int field1335;

	@ObfuscatedName("client.Oi")
	public int field1338;

	@ObfuscatedName("client.Ui")
	public int field1343;

	@ObfuscatedName("client.Vi")
	public int field1344;

	@ObfuscatedName("client.G")
	public int field948;

	@ObfuscatedName("client.K")
	public int field952;

	@ObfuscatedName("client.L")
	public int field953;

	@ObfuscatedName("client.M")
	public int field954;

	@ObfuscatedName("client.Q")
	public int field958;

	@ObfuscatedName("client.R")
	public int field959;

	@ObfuscatedName("client.Bb")
	public int field992;

	@ObfuscatedName("client.Cb")
	public int field993;

	@ObfuscatedName("client.Db")
	public int field994;

	@ObfuscatedName("client.Eb")
	public int field995;

	@ObfuscatedName("client.Fb")
	public int field996;

	@ObfuscatedName("client.Hb")
	public int field998;

	@ObfuscatedName("client.Jb")
	public int field999;

	@ObfuscatedName("client.vg")
	public long field1225;

	@ObfuscatedName("client.O")
	public long field956;

	@ObfuscatedName("client.Hh")
	public class18 field1284;

	@ObfuscatedName("client.Rb")
	public class26 field1007;

	@ObfuscatedName("client.tc")
	public class34 field1035;

	@ObfuscatedName("client.uc")
	public class34 field1036;

	@ObfuscatedName("client.vc")
	public class34 field1037;

	@ObfuscatedName("client.wc")
	public class34 field1038;

	@ObfuscatedName("client.ed")
	public class34 field1068;

	@ObfuscatedName("client.fd")
	public class34 field1069;

	@ObfuscatedName("client.Be")
	public class34 field1139;

	@ObfuscatedName("client.Ce")
	public class34 field1140;

	@ObfuscatedName("client.og")
	public class34 field1220;

	@ObfuscatedName("client.Zg")
	public class34 field1251;

	@ObfuscatedName("client.Rh")
	public class34 field1294;

	@ObfuscatedName("client.Tc")
	public class35 field1057;

	@ObfuscatedName("client.Uc")
	public class35 field1058;

	@ObfuscatedName("client.Vc")
	public class35 field1059;

	@ObfuscatedName("client.Wc")
	public class35 field1060;

	@ObfuscatedName("client.Xc")
	public class35 field1061;

	@ObfuscatedName("client.kd")
	public class35 field1073;

	@ObfuscatedName("client.ld")
	public class35 field1074;

	@ObfuscatedName("client.Le")
	public class35 field1149;

	@ObfuscatedName("client.Me")
	public class35 field1150;

	@ObfuscatedName("client.Qe")
	public class35 field1154;

	@ObfuscatedName("client.Re")
	public class35 field1155;

	@ObfuscatedName("client.Se")
	public class35 field1156;

	@ObfuscatedName("client.Te")
	public class35 field1157;

	@ObfuscatedName("client.Ue")
	public class35 field1158;

	@ObfuscatedName("client.Zh")
	public class35 field1302;

	@ObfuscatedName("client.ai")
	public class35 field1303;

	@ObfuscatedName("client.bi")
	public class35 field1304;

	@ObfuscatedName("client.Ab")
	public class35 field991;

	@ObfuscatedName("client.Ze")
	public class36 field1162;

	@ObfuscatedName("client.af")
	public class36 field1163;

	@ObfuscatedName("client.bf")
	public class36 field1164;

	@ObfuscatedName("client.cf")
	public class36 field1165;

	@ObfuscatedName("client.md")
	public class43 field1075;

	@ObfuscatedName("client.nd")
	public class43 field1076;

	@ObfuscatedName("client.od")
	public class43 field1077;

	@ObfuscatedName("client.pd")
	public class43 field1078;

	@ObfuscatedName("client.qd")
	public class43 field1079;

	@ObfuscatedName("client.rd")
	public class43 field1080;

	@ObfuscatedName("client.sd")
	public class43 field1081;

	@ObfuscatedName("client.td")
	public class43 field1082;

	@ObfuscatedName("client.ud")
	public class43 field1083;

	@ObfuscatedName("client.He")
	public class43 field1145;

	@ObfuscatedName("client.Ie")
	public class43 field1146;

	@ObfuscatedName("client.Je")
	public class43 field1147;

	@ObfuscatedName("client.Ke")
	public class43 field1148;

	@ObfuscatedName("client.bg")
	public class43 field1207;

	@ObfuscatedName("client.cg")
	public class43 field1208;

	@ObfuscatedName("client.dg")
	public class43 field1209;

	@ObfuscatedName("client.eg")
	public class43 field1210;

	@ObfuscatedName("client.fg")
	public class43 field1211;

	@ObfuscatedName("client.gg")
	public class43 field1212;

	@ObfuscatedName("client.hg")
	public class43 field1213;

	@ObfuscatedName("client.ig")
	public class43 field1214;

	@ObfuscatedName("client.jg")
	public class43 field1215;

	@ObfuscatedName("client.kg")
	public class43 field1216;

	@ObfuscatedName("client.ch")
	public class43 field1254;

	@ObfuscatedName("client.dh")
	public class43 field1255;

	@ObfuscatedName("client.eh")
	public class43 field1256;

	@ObfuscatedName("client.Ji")
	public class46 field1334;

	@ObfuscatedName("client.I")
	public class47 field950;

	@ObfuscatedName("client.Ac")
	public class4 field1041;

	@ObfuscatedName("client.ag")
	public String field1206;

	@ObfuscatedName("client.fi")
	public String field1308;

	@ObfuscatedName("client.xi")
	public String field1322;

	@ObfuscatedName("client.be")
	public static boolean field1114;

	@ObfuscatedName("client.Vh")
	public static boolean field1298;

	@ObfuscatedName("client.Sc")
	public int[] field1056;

	@ObfuscatedName("client.jf")
	public int[] field1170;

	@ObfuscatedName("client.kf")
	public int[] field1171;

	@ObfuscatedName("client.Of")
	public int[] field1195;

	@ObfuscatedName("client.Pf")
	public int[] field1196;

	@ObfuscatedName("client.ii")
	public int[] field1311;

	@ObfuscatedName("client.ji")
	public int[] field1312;

	@ObfuscatedName("client.ki")
	public int[] field1313;

	@ObfuscatedName("client.li")
	public int[] field1314;

	@ObfuscatedName("client.V")
	public int[] field962;

	@ObfuscatedName("client.W")
	public int[] field963;

	@ObfuscatedName("client.X")
	public int[] field964;

	@ObfuscatedName("client.ee")
	public class35[] field1117;

	@ObfuscatedName("client.qh")
	public byte[][] field1268;

	@ObfuscatedName("client.Zc")
	public byte[][][] field1063;

	@ObfuscatedName("client.Wg")
	public int[][][] field1248;

	@ObfuscatedName("client.h(I)V")
	public final void method371() {
		if (field1148 == null) {
			method412();
			field9 = null;
			field1075 = null;
			field1076 = null;
			field1077 = null;
			field1078 = null;
			field1079 = null;
			field1080 = null;
			field1081 = null;
			field1082 = null;
			field1083 = null;
			field1148 = new class43(96, 479, method11());
			field1146 = new class43(160, 168, method11());
			class32.method149();
			field1303.method189(0, 0);
			field1145 = new class43(261, 190, method11());
			field1147 = new class43(334, 512, method11());
			class32.method149();
			field1254 = new class43(61, 501, method11());
			field1255 = new class43(40, 288, method11());
			field1256 = new class43(66, 269, method11());
			field1203 = true;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method372() {
		field1257 = 0;
		for (int var1 = -1; var1 < field1104 + field1099; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field1007;
			} else if (var1 < field1104) {
				var2 = field1103[field1105[var1]];
			} else {
				var2 = field1098[field1100[var1 - field1104]];
			}

			if (var2 != null && var2.method112()) {
				if (var1 < field1104) {
					int var3 = 30;
					class26 var4 = (class26) var2;
					if (var4.field326 != 0) {
						method402(var2, var2.field315 + 15);

						if (field1131 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field326 & 1 << var5) != 0) {
									field1004[var5].method175(field1131 - 12, field1132 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1070 == 10 && field1105[var1] == field1324) {
						method402(var2, var2.field315 + 15);

						if (field1131 > -1) {
							field1004[7].method175(field1131 - 12, field1132 - var3);
						}
					}
				} else if (field1070 == 1 && field1100[var1 - field1104] == field1338 && field1316 % 20 < 10) {
					method402(var2, var2.field315 + 15);

					if (field1131 > -1) {
						field1004[2].method175(field1131 - 12, field1132 - 28);
					}
				}

				if (var2.field282 != null && (var1 >= field1104 || field1084 == 0 || field1084 == 3 || field1084 == 1 && method389(((class26) var2).field323))) {
					method402(var2, var2.field315);

					if (field1131 > -1 && field1257 < field1258) {
						field1262[field1257] = field1164.method193(var2.field282) / 2;
						field1261[field1257] = field1164.field539;
						field1259[field1257] = field1131;
						field1260[field1257] = field1132;
						field1263[field1257] = var2.field284;
						field1264[field1257] = var2.field285;
						field1265[field1257] = var2.field283;
						field1266[field1257++] = var2.field282;

						if (field1066 == 0 && var2.field285 == 1) {
							field1261[field1257] += 10;
							field1260[field1257] += 5;
						}

						if (field1066 == 0 && var2.field285 == 2) {
							field1262[field1257] = 60;
						}
					}
				}

				if (var2.field288 > field1316 + 100) {
					method402(var2, var2.field315 + 15);

					if (field1131 > -1) {
						int var6 = var2.field289 * 30 / var2.field290;
						if (var6 > 30) {
							var6 = 30;
						}

						class32.method150(field1132 - 3, var6, 0xFF00, field1131 - 15, 5);
						class32.method150(field1132 - 3, 30 - var6, 0xFF0000, field1131 + var6 - 15, 5);
					}
				}

				if (var2.field288 > field1316 + 330) {
					method402(var2, var2.field315 / 2);

					if (field1131 > -1) {
						field1247[var2.field287].method175(field1131 - 12, field1132 - 12);
						field1162.method191(0, String.valueOf(var2.field286), field1131, field1132 + 4);
						field1162.method191(0xFFFFFF, String.valueOf(var2.field286), field1131 - 1, field1132 + 3);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field1257; var7++) {
			int var8 = field1259[var7];
			int var9 = field1260[var7];
			int var10 = field1262[var7];
			int var11 = field1261[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field1260[var13] - field1261[var13] && var9 - var11 < field1260[var13] + 2 && var8 - var10 < field1262[var13] + field1259[var13] && var8 + var10 > field1259[var13] - field1262[var13] && field1260[var13] - field1261[var13] < var9) {
						var9 = field1260[var13] - field1261[var13];
						var12 = true;
					}
				}
			}

			field1131 = field1259[var7];
			field1132 = field1260[var7] = var9;
			String var14 = field1266[var7];
			if (field1066 == 0) {
				int var15 = 0xFFFF00;
				if (field1263[var7] < 6) {
					var15 = field1185[field1263[var7]];
				}

				if (field1263[var7] == 6) {
					var15 = field1133 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1263[var7] == 7) {
					var15 = field1133 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1263[var7] == 8) {
					var15 = field1133 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1263[var7] == 9) {
					int var16 = 150 - field1265[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1263[var7] == 10) {
					int var17 = 150 - field1265[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1263[var7] == 11) {
					int var18 = 150 - field1265[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1264[var7] == 0) {
					field1164.method191(0, var14, field1131, field1132 + 1);
					field1164.method191(var15, var14, field1131, field1132);
				}

				if (field1264[var7] == 1) {
					field1164.method195(var14, field1133, field1132 + 1, field1131, 0);
					field1164.method195(var14, field1133, field1132, field1131, var15);
				}

				if (field1264[var7] == 2) {
					int var19 = field1164.method193(var14);
					int var20 = (150 - field1265[var7]) * (var19 + 100) / 150;
					class32.method148(334, field1131 + 50, field1131 - 50, 0);
					field1164.method194(field1131 + 50 - var20, var14, field1132 + 1, 0);
					field1164.method194(field1131 + 50 - var20, var14, field1132, var15);
					class32.method147();
				}
			} else {
				field1164.method191(0, var14, field1131, field1132 + 1);
				field1164.method191(0xFFFF00, var14, field1131, field1132);
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method373() {
		for (int var1 = 0; var1 < field1099; var1++) {
			int var2 = field1100[var1];
			class25 var3 = field1098[var2];
			if (var3 != null) {
				method374(var3.field322.field745, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILx;B)V")
	public final void method374(int arg0, class24 arg1) {
		if (arg1.field270 < 128 || arg1.field271 < 128 || arg1.field270 >= 13184 || arg1.field271 >= 13184) {
			arg1.field297 = -1;
			arg1.field302 = -1;
			arg1.field311 = 0;
			arg1.field312 = 0;
			arg1.field270 = arg1.field318[0] * 128 + arg1.field274 * 64;
			arg1.field271 = arg1.field319[0] * 128 + arg1.field274 * 64;
			arg1.field317 = 0;
		}

		if (field1007 == arg1 && (arg1.field270 < 1536 || arg1.field271 < 1536 || arg1.field270 >= 11776 || arg1.field271 >= 11776)) {
			arg1.field297 = -1;
			arg1.field302 = -1;
			arg1.field311 = 0;
			arg1.field312 = 0;
			arg1.field270 = arg1.field318[0] * 128 + arg1.field274 * 64;
			arg1.field271 = arg1.field319[0] * 128 + arg1.field274 * 64;
			arg1.field317 = 0;
		}

		if (arg1.field311 > field1316) {
			method375(arg1);
		} else if (arg1.field312 >= field1316) {
			method376(arg1);
		} else {
			method377(arg1);
		}

		method378(arg1);
		method379(arg1);
	}

	@ObfuscatedName("client.a(ILx;)V")
	public final void method375(class24 arg0) {
		int var2 = arg0.field311 - field1316;
		int var3 = arg0.field307 * 128 + arg0.field274 * 64;
		int var4 = arg0.field309 * 128 + arg0.field274 * 64;
		arg0.field270 += (var3 - arg0.field270) / var2;
		arg0.field271 += (var4 - arg0.field271) / var2;
		arg0.field321 = 0;

		if (arg0.field313 == 0) {
			arg0.field316 = 1024;
		}

		if (arg0.field313 == 1) {
			arg0.field316 = 1536;
		}

		if (arg0.field313 == 2) {
			arg0.field316 = 0;
		}

		if (arg0.field313 == 3) {
			arg0.field316 = 512;
		}
	}

	@ObfuscatedName("client.a(BLx;)V")
	public final void method376(class24 arg0) {
		if (field1316 == arg0.field312 || arg0.field297 == -1 || arg0.field300 != 0 || arg0.field299 + 1 > class62.field901[arg0.field297].field905[arg0.field298]) {
			int var2 = arg0.field312 - arg0.field311;
			int var3 = field1316 - arg0.field311;
			int var4 = arg0.field307 * 128 + arg0.field274 * 64;
			int var5 = arg0.field309 * 128 + arg0.field274 * 64;
			int var6 = arg0.field308 * 128 + arg0.field274 * 64;
			int var7 = arg0.field310 * 128 + arg0.field274 * 64;
			arg0.field270 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field271 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field321 = 0;

		if (arg0.field313 == 0) {
			arg0.field316 = 1024;
		}

		if (arg0.field313 == 1) {
			arg0.field316 = 1536;
		}

		if (arg0.field313 == 2) {
			arg0.field316 = 0;
		}

		if (arg0.field313 == 3) {
			arg0.field316 = 512;
		}

		arg0.field272 = arg0.field316;
	}

	@ObfuscatedName("client.a(Lx;Z)V")
	public final void method377(class24 arg0) {
		arg0.field294 = arg0.field275;
		if (arg0.field317 == 0) {
			arg0.field321 = 0;
		} else {
			if (arg0.field297 != -1 && arg0.field300 == 0) {
				class62 var2 = class62.field901[arg0.field297];
				if (var2.field907 == null) {
					arg0.field321++;
					return;
				}
			}

			int var3 = arg0.field270;
			int var4 = arg0.field271;
			int var5 = arg0.field318[arg0.field317 - 1] * 128 + arg0.field274 * 64;
			int var6 = arg0.field319[arg0.field317 - 1] * 128 + arg0.field274 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field316 = 1280;
					} else if (var4 > var6) {
						arg0.field316 = 1792;
					} else {
						arg0.field316 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field316 = 768;
					} else if (var4 > var6) {
						arg0.field316 = 256;
					} else {
						arg0.field316 = 512;
					}
				} else if (var4 < var6) {
					arg0.field316 = 1024;
				} else {
					arg0.field316 = 0;
				}

				int var7 = arg0.field316 - arg0.field272 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field278;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field277;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field280;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field279;
				}

				if (var8 == -1) {
					var8 = arg0.field277;
				}

				arg0.field294 = var8;
				int var9 = 4;
				if (arg0.field316 != arg0.field272 && arg0.field291 == -1) {
					var9 = 2;
				}

				if (arg0.field317 > 2) {
					var9 = 6;
				}

				if (arg0.field317 > 3) {
					var9 = 8;
				}

				if (arg0.field321 > 0 && arg0.field317 > 1) {
					var9 = 8;
					arg0.field321--;
				}

				if (arg0.field320[arg0.field317 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field294 == arg0.field277 && arg0.field281 != -1) {
					arg0.field294 = arg0.field281;
				}

				if (var3 < var5) {
					arg0.field270 += var9;
					if (arg0.field270 > var5) {
						arg0.field270 = var5;
					}
				} else if (var3 > var5) {
					arg0.field270 -= var9;
					if (arg0.field270 < var5) {
						arg0.field270 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field271 += var9;
					if (arg0.field271 > var6) {
						arg0.field271 = var6;
					}
				} else if (var4 > var6) {
					arg0.field271 -= var9;
					if (arg0.field271 < var6) {
						arg0.field271 = var6;
					}
				}

				if (arg0.field270 == var5 && arg0.field271 == var6) {
					arg0.field317--;
				}
			} else {
				arg0.field270 = var5;
				arg0.field271 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(ILx;)V")
	public final void method378(class24 arg0) {
		if (arg0.field291 != -1 && arg0.field291 < 32768) {
			class25 var2 = field1098[arg0.field291];
			if (var2 != null) {
				int var3 = arg0.field270 - var2.field270;
				int var4 = arg0.field271 - var2.field271;
				if (var3 != 0 || var4 != 0) {
					arg0.field316 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field291 >= 32768) {
			int var5 = arg0.field291 - 32768;
			if (field1273 == var5) {
				var5 = field1102;
			}

			class26 var6 = field1103[var5];
			if (var6 != null) {
				int var7 = arg0.field270 - var6.field270;
				int var8 = arg0.field271 - var6.field271;
				if (var7 != 0 || var8 != 0) {
					arg0.field316 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field292 != 0 || arg0.field293 != 0) && (arg0.field317 == 0 || arg0.field321 > 0)) {
			int var9 = arg0.field270 - (arg0.field292 - field992 - field992) * 64;
			int var10 = arg0.field271 - (arg0.field293 - field993 - field993) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field316 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field292 = 0;
			arg0.field293 = 0;
		}

		int var11 = arg0.field316 - arg0.field272 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field272 = arg0.field316;
			} else if (var11 > 1024) {
				arg0.field272 -= 32;
			} else {
				arg0.field272 += 32;
			}

			arg0.field272 &= 0x7FF;
			if (arg0.field294 == arg0.field275 && arg0.field316 != arg0.field272) {
				if (arg0.field276 != -1) {
					arg0.field294 = arg0.field276;
					return;
				}

				arg0.field294 = arg0.field277;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(ILx;)V")
	public final void method379(class24 arg0) {
		arg0.field273 = false;

		if (arg0.field294 != -1) {
			class62 var2 = class62.field901[arg0.field294];
			arg0.field296++;
			if (arg0.field295 < var2.field902 && arg0.field296 > var2.field905[arg0.field295]) {
				arg0.field296 = 0;
				arg0.field295++;
			}

			if (arg0.field295 >= var2.field902) {
				arg0.field296 = 0;
				arg0.field295 = 0;
			}
		}

		if (arg0.field297 != -1 && arg0.field300 == 0) {
			class62 var3 = class62.field901[arg0.field297];
			arg0.field299++;
			while (arg0.field298 < var3.field902 && arg0.field299 > var3.field905[arg0.field298]) {
				arg0.field299 -= var3.field905[arg0.field298];
				arg0.field298++;
			}

			if (arg0.field298 >= var3.field902) {
				arg0.field298 -= var3.field906;
				arg0.field301++;
				if (arg0.field301 >= var3.field912) {
					arg0.field297 = -1;
				}

				if (arg0.field298 < 0 || arg0.field298 >= var3.field902) {
					arg0.field297 = -1;
				}
			}

			arg0.field273 = var3.field908;
		}

		if (arg0.field300 > 0) {
			arg0.field300--;
		}

		if (arg0.field302 != -1 && field1316 >= arg0.field305) {
			if (arg0.field303 < 0) {
				arg0.field303 = 0;
			}

			class62 var4 = class63.field914[arg0.field302].field918;
			arg0.field304++;
			while (arg0.field303 < var4.field902 && arg0.field304 > var4.field905[arg0.field303]) {
				arg0.field304 -= var4.field905[arg0.field303];
				arg0.field303++;
			}

			if (arg0.field303 >= var4.field902) {
				if (arg0.field303 < 0 || arg0.field303 >= var4.field902) {
					arg0.field302 = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method380() {
		if (field1203) {
			field1203 = false;
			field1207.method243(11, field8, 0);
			field1208.method243(375, field8, 0);
			field1209.method243(5, field8, 729);
			field1210.method243(231, field8, 752);
			field1211.method243(0, field8, 0);
			field1212.method243(0, field8, 561);
			field1213.method243(11, field8, 520);
			field1214.method243(231, field8, 520);
			field1215.method243(375, field8, 501);
			field1216.method243(345, field8, 0);
			field1151 = true;
			field949 = true;
			field1197 = true;
			field1194 = true;

			if (field1126 != 2) {
				field1147.method243(11, field8, 8);
				field1146.method243(5, field8, 561);
			}
		}

		if (field1126 == 2) {
			method471();
		}

		if (field1182 && field1086 == 1) {
			field1151 = true;
		}

		if (field976 != -1) {
			boolean var1 = method424(field1167, field976);
			if (var1) {
				field1151 = true;
			}
		}

		if (field1229 == 2) {
			field1151 = true;
		}

		if (field1016 == 2) {
			field1151 = true;
		}

		if (field1151) {
			method394();
			field1151 = false;
		}

		if (field1320 == -1) {
			field1177.field854 = field1064 - field998 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method384(false, 0, 77, field15 - 22, field1064, field16 - 375, 463, field1177);
			}

			int var2 = field1064 - field1177.field854 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1064 - 77) {
				var2 = field1064 - 77;
			}

			if (field998 != var2) {
				field998 = var2;
				field949 = true;
			}
		}

		if (field1320 != -1) {
			boolean var3 = method424(field1167, field1320);
			if (var3) {
				field949 = true;
			}
		}

		if (field1229 == 3) {
			field949 = true;
		}

		if (field1016 == 3) {
			field949 = true;
		}

		if (field1206 != null) {
			field949 = true;
		}

		if (field1182 && field1086 == 2) {
			field949 = true;
		}

		if (field949) {
			method408();
			field949 = false;
		}

		if (field1126 == 2) {
			method441();
			field1146.method243(5, field8, 561);
		}

		if (field1325 != -1) {
			field1197 = true;
		}

		if (field1197) {
			if (field1325 != -1 && field1325 == field1277) {
				field1325 = -1;
				field1174.method205(175);
				field1174.method206(field1277);
			}

			field1197 = false;
			field1256.method242();
			field991.method189(0, 0);

			if (field976 == -1) {
				if (field1137[field1277] != -1) {
					if (field1277 == 0) {
						field1057.method189(29, 30);
					}

					if (field1277 == 1) {
						field1058.method189(59, 29);
					}

					if (field1277 == 2) {
						field1058.method189(87, 29);
					}

					if (field1277 == 3) {
						field1059.method189(115, 29);
					}

					if (field1277 == 4) {
						field1061.method189(156, 29);
					}

					if (field1277 == 5) {
						field1061.method189(184, 29);
					}

					if (field1277 == 6) {
						field1060.method189(212, 30);
					}
				}

				if (field1137[0] != -1 && (field1325 != 0 || field1316 % 20 < 10)) {
					field1333[0].method189(35, 34);
				}

				if (field1137[1] != -1 && (field1325 != 1 || field1316 % 20 < 10)) {
					field1333[1].method189(59, 32);
				}

				if (field1137[2] != -1 && (field1325 != 2 || field1316 % 20 < 10)) {
					field1333[2].method189(86, 32);
				}

				if (field1137[3] != -1 && (field1325 != 3 || field1316 % 20 < 10)) {
					field1333[3].method189(121, 33);
				}

				if (field1137[4] != -1 && (field1325 != 4 || field1316 % 20 < 10)) {
					field1333[4].method189(157, 34);
				}

				if (field1137[5] != -1 && (field1325 != 5 || field1316 % 20 < 10)) {
					field1333[5].method189(185, 32);
				}

				if (field1137[6] != -1 && (field1325 != 6 || field1316 % 20 < 10)) {
					field1333[6].method189(212, 34);
				}
			}

			field1256.method243(165, field8, 520);
			field1255.method242();
			field990.method189(0, 0);

			if (field976 == -1) {
				if (field1137[field1277] != -1) {
					if (field1277 == 7) {
						field1154.method189(49, 0);
					}

					if (field1277 == 8) {
						field1155.method189(81, 0);
					}

					if (field1277 == 9) {
						field1155.method189(108, 0);
					}

					if (field1277 == 10) {
						field1156.method189(136, 1);
					}

					if (field1277 == 11) {
						field1158.method189(178, 0);
					}

					if (field1277 == 12) {
						field1158.method189(205, 0);
					}

					if (field1277 == 13) {
						field1157.method189(233, 0);
					}
				}

				if (field1137[8] != -1 && (field1325 != 8 || field1316 % 20 < 10)) {
					field1333[7].method189(80, 2);
				}

				if (field1137[9] != -1 && (field1325 != 9 || field1316 % 20 < 10)) {
					field1333[8].method189(107, 3);
				}

				if (field1137[10] != -1 && (field1325 != 10 || field1316 % 20 < 10)) {
					field1333[9].method189(142, 4);
				}

				if (field1137[11] != -1 && (field1325 != 11 || field1316 % 20 < 10)) {
					field1333[10].method189(179, 2);
				}

				if (field1137[12] != -1 && (field1325 != 12 || field1316 % 20 < 10)) {
					field1333[11].method189(206, 2);
				}

				if (field1137[13] != -1 && (field1325 != 13 || field1316 % 20 < 10)) {
					field1333[12].method189(230, 2);
				}
			}

			field1255.method243(492, field8, 501);
			field1147.method242();
		}

		if (field1194) {
			field1194 = false;
			field1254.method242();
			field989.method189(0, 0);
			field1163.method192(57, "Public chat", 0xFFFFFF, 33, true);

			if (field1084 == 0) {
				field1163.method192(57, "On", 0xFF00, 46, true);
			}

			if (field1084 == 1) {
				field1163.method192(57, "Friends", 0xFFFF00, 46, true);
			}

			if (field1084 == 2) {
				field1163.method192(57, "Off", 0xFF0000, 46, true);
			}

			if (field1084 == 3) {
				field1163.method192(57, "Hide", 0xFFFF, 46, true);
			}

			field1163.method192(186, "Private chat", 0xFFFFFF, 33, true);

			if (field1317 == 0) {
				field1163.method192(186, "On", 0xFF00, 46, true);
			}

			if (field1317 == 1) {
				field1163.method192(186, "Friends", 0xFFFF00, 46, true);
			}

			if (field1317 == 2) {
				field1163.method192(186, "Off", 0xFF0000, 46, true);
			}

			field1163.method192(326, "Trade/duel", 0xFFFFFF, 33, true);

			if (field1232 == 0) {
				field1163.method192(326, "On", 0xFF00, 46, true);
			}

			if (field1232 == 1) {
				field1163.method192(326, "Friends", 0xFFFF00, 46, true);
			}

			if (field1232 == 2) {
				field1163.method192(326, "Off", 0xFF0000, 46, true);
			}

			field1163.method192(462, "Report abuse", 0xFFFFFF, 38, true);
			field1254.method243(471, field8, 0);
			field1147.method242();
		}

		field1167 = 0;
	}

	@ObfuscatedName("client.a(IILkb;)V")
	public final void method381(int arg0, class37 arg1) {
		while (arg1.field544 + 10 < arg0 * 8) {
			int var3 = arg1.method227(11);
			if (var3 == 2047) {
				break;
			}

			if (field1103[var3] == null) {
				field1103[var3] = new class26();
				if (field1108[var3] != null) {
					field1103[var3].method114(field1108[var3]);
				}
			}

			field1105[field1104++] = var3;
			class26 var4 = field1103[var3];
			var4.field314 = field1316;
			int var5 = arg1.method227(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method227(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method227(1);
			var4.method110(field1007.field319[0] + var6, var7 == 1, field1007.field318[0] + var5);
			int var8 = arg1.method227(1);
			if (var8 == 1) {
				field1107[field1106++] = var3;
			}
		}

		arg1.method228();
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method382(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		int var6 = arg1;
		if (arg1 < 3 && (field1063[1][var4][var5] & 0x2) == 2) {
			var6 = arg1 + 1;
		}

		int var7 = arg0 & 0x7F;
		int var8 = arg2 & 0x7F;
		int var9 = (128 - var7) * field1248[var6][var4][var5] + field1248[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field1248[var6][var4][var5 + 1] + field1248[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method383() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1238 != -1 && field1238 == field1175) {
				if (var1 == 8 && field1282.length() > 0) {
					field1282 = field1282.substring(0, field1282.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1282.length() < 12) {
					field1282 = field1282 + (char) var1;
				}
			} else if (field1129) {
				if (var1 >= 32 && var1 <= 122 && field1024.length() < 80) {
					field1024 = field1024 + (char) var1;
					field949 = true;
				}

				if (var1 == 8 && field1024.length() > 0) {
					field1024 = field1024.substring(0, field1024.length() - 1);
					field949 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1129 = false;
					field949 = true;

					if (field1001 == 1) {
						long var2 = class48.method258(field1024);
						method396(var2);
					}

					if (field1001 == 2 && field1010 > 0) {
						long var4 = class48.method258(field1024);
						method496(var4);
					}

					if (field1001 == 3 && field1024.length() > 0) {
						field1174.method205(148);
						field1174.method206(0);
						int var6 = field1174.field543;
						field1174.method212(field956);
						class49.method266(field1024, field1174);
						field1174.method215(field1174.field543 - var6);
						field1024 = class48.method263(field1024);
						field1024 = class65.method343(field1024);
						method391(6, class48.method262(class48.method259(field956)), field1024);

						if (field1317 == 2) {
							field1317 = 1;
							field1194 = true;
							field1174.method205(244);
							field1174.method206(field1084);
							field1174.method206(field1317);
							field1174.method206(field1232);
						}
					}

					if (field1001 == 4 && field1067 < 100) {
						long var7 = class48.method258(field1024);
						method414(var7);
					}

					if (field1001 == 5 && field1067 > 0) {
						long var9 = class48.method258(field1024);
						method447(var9);
					}
				}
			} else if (field1290) {
				if (var1 >= 48 && var1 <= 57 && field1274.length() < 10) {
					field1274 = field1274 + (char) var1;
					field949 = true;
				}

				if (var1 == 8 && field1274.length() > 0) {
					field1274 = field1274.substring(0, field1274.length() - 1);
					field949 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1274.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1274);
						} catch (Exception var15) {
						}

						field1174.method205(237);
						field1174.method210(var11);
					}

					field1290 = false;
					field949 = true;
				}
			} else if (field1320 == -1) {
				if (var1 >= 32 && var1 <= 122 && field972.length() < 80) {
					field972 = field972 + (char) var1;
					field949 = true;
				}

				if (var1 == 8 && field972.length() > 0) {
					field972 = field972.substring(0, field972.length() - 1);
					field949 = true;
				}

				if ((var1 == 13 || var1 == 10) && field972.length() > 0) {
					if (field972.equals("::clientdrop") && (field11 != null || method442().indexOf("192.168.1.") != -1)) {
						method472();
					} else if (field972.startsWith("::")) {
						field1174.method205(4);
						field1174.method206(field972.length() - 1);
						field1174.method213(field972.substring(2));
					} else {
						byte var12 = 0;
						if (field972.startsWith("yellow:")) {
							var12 = 0;
							field972 = field972.substring(7);
						}

						if (field972.startsWith("red:")) {
							var12 = 1;
							field972 = field972.substring(4);
						}

						if (field972.startsWith("green:")) {
							var12 = 2;
							field972 = field972.substring(6);
						}

						if (field972.startsWith("cyan:")) {
							var12 = 3;
							field972 = field972.substring(5);
						}

						if (field972.startsWith("purple:")) {
							var12 = 4;
							field972 = field972.substring(7);
						}

						if (field972.startsWith("white:")) {
							var12 = 5;
							field972 = field972.substring(6);
						}

						if (field972.startsWith("flash1:")) {
							var12 = 6;
							field972 = field972.substring(7);
						}

						if (field972.startsWith("flash2:")) {
							var12 = 7;
							field972 = field972.substring(7);
						}

						if (field972.startsWith("flash3:")) {
							var12 = 8;
							field972 = field972.substring(7);
						}

						if (field972.startsWith("glow1:")) {
							var12 = 9;
							field972 = field972.substring(6);
						}

						if (field972.startsWith("glow2:")) {
							var12 = 10;
							field972 = field972.substring(6);
						}

						if (field972.startsWith("glow3:")) {
							var12 = 11;
							field972 = field972.substring(6);
						}

						byte var13 = 0;
						if (field972.startsWith("wave:")) {
							var13 = 1;
							field972 = field972.substring(5);
						}

						if (field972.startsWith("scroll:")) {
							var13 = 2;
							field972 = field972.substring(7);
						}

						field1174.method205(158);
						field1174.method206(0);
						int var14 = field1174.field543;
						field1174.method206(var12);
						field1174.method206(var13);
						class49.method266(field972, field1174);
						field1174.method215(field1174.field543 - var14);
						field972 = class48.method263(field972);
						field972 = class65.method343(field972);
						field1007.field282 = field972;
						field1007.field284 = var12;
						field1007.field285 = var13;
						field1007.field283 = 150;
						method391(2, field1007.field323, field1007.field282);

						if (field1084 == 2) {
							field1084 = 3;
							field1194 = true;
							field1174.method205(244);
							field1174.method206(field1084);
							field1174.method206(field1317);
							field1174.method206(field1232);
						}
					}

					field972 = "";
					field949 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIILhc;Z)V")
	public final void method384(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class60 arg7) {
		if (field1124) {
			field1125 = 32;
		} else {
			field1125 = 0;
		}

		field1124 = false;
		if (arg3 >= arg6 && arg3 < arg6 + 16 && arg5 >= arg1 && arg5 < arg1 + 16) {
			arg7.field854 -= field1191 * 4;

			if (arg0) {
				field1151 = true;
				return;
			}
		} else if (arg3 >= arg6 && arg3 < arg6 + 16 && arg5 >= arg1 + arg2 - 16 && arg5 < arg1 + arg2) {
			arg7.field854 += field1191 * 4;

			if (arg0) {
				field1151 = true;
				return;
			}
		} else if (arg3 >= arg6 - field1125 && arg3 < arg6 + field1125 + 16 && arg5 >= arg1 + 16 && arg5 < arg1 + arg2 - 16 && field1191 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg4;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg1 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg7.field854 = (arg4 - arg2) * var10 / var11;

			if (arg0) {
				field1151 = true;
			}

			field1124 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method385() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method386(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.l(I)V")
	public final void method387() {
		method466();

		if (field1097 == 1) {
			field1160[field1096 / 100].method175(field1094 - 8 - 8, field1095 - 8 - 11);
		}

		if (field1097 == 2) {
			field1160[field1096 / 100 + 4].method175(field1094 - 8 - 8, field1095 - 8 - 11);
		}

		if (field1238 != -1) {
			method424(field1167, field1238);
			method409(0, 0, class60.field835[field1238], 0);
		}

		method416();

		if (!field1182) {
			method448();
			method486();
		} else if (field1086 == 0) {
			method439();
		}

		if (field1135 == 1) {
			if (field1205 > 0 || field1278 == 1) {
				field1004[1].method175(472, 258);
			} else {
				field1004[1].method175(472, 296);
			}
		}

		if (field1205 > 0) {
			field1004[0].method175(472, 296);
			field1163.method191(0xFFFF00, "Level: " + field1205, 484, 329);
		}

		if (field1278 == 1) {
			field1004[6].method175(472, 296);
			field1163.method191(0xFFFF00, "Arena", 484, 329);
		}

		if (field1091 != 0) {
			int var1 = field1091 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1163.method194(4, "System update in: " + var2 + ":0" + var1, 329, 0xFFFF00);
			} else {
				field1163.method194(4, "System update in: " + var2 + ":" + var1, 329, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;Z)V")
	public final void method388(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1010) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				arg0.field874 = field1085[var2];
				arg0.field843 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1010) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				if (field1291[var2] == 0) {
					arg0.field874 = "@red@Offline";
				} else if (field1291[var2] == field1295) {
					arg0.field874 = "@gre@World-" + (field1291[var2] - 9);
				} else {
					arg0.field874 = "@yel@World-" + (field1291[var2] - 9);
				}

				arg0.field843 = 1;
			}
		} else if (var2 == 203) {
			arg0.field853 = field1010 * 15 + 20;
			if (arg0.field853 <= arg0.field846) {
				arg0.field853 = arg0.field846 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1067) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				arg0.field874 = class48.method262(class48.method259(field1011[var2]));
				arg0.field843 = 1;
			}
		} else if (var2 == 503) {
			arg0.field853 = field1067 * 15 + 20;
			if (arg0.field853 <= arg0.field846) {
				arg0.field853 = arg0.field846 + 1;
			}
		} else if (var2 == 327) {
			arg0.field886 = 150;
			arg0.field887 = (int) (Math.sin(field1316 / 40.0D) * 256.0D) & 0x7FF;

			if (field1337) {
				field1337 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1198[var5];
					if (var6 >= 0) {
						var3[var4++] = class59.field828[var6].method320();
					}
				}

				class31 var7 = new class31(var3, var4);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field1127[var8] != 0) {
						var7.method134(field1269[var8][0], field1269[var8][field1127[var8]]);

						if (var8 == 1) {
							var7.method134(field1241[0], field1241[field1127[var8]]);
						}
					}
				}

				var7.method127();
				var7.method128(class62.field901[field1007.field275].field903[0]);
				var7.method137(64, 850, -30, -50, -30, true);
				arg0.field881 = var7;
			}
		} else if (var2 == 324) {
			if (field1139 == null) {
				field1139 = arg0.field879;
				field1140 = arg0.field880;
			}

			if (field1253) {
				arg0.field879 = field1140;
			} else {
				arg0.field879 = field1139;
			}
		} else if (var2 == 325) {
			if (field1139 == null) {
				field1139 = arg0.field879;
				field1140 = arg0.field880;
			}

			if (field1253) {
				arg0.field879 = field1139;
			} else {
				arg0.field879 = field1140;
			}
		} else if (var2 == 600) {
			arg0.field874 = field1282;
			if (field1316 % 20 < 10) {
				arg0.field874 = arg0.field874 + "|";
			} else {
				arg0.field874 = arg0.field874 + " ";
			}
		} else if (var2 == 613) {
			if (!field1199) {
				arg0.field874 = "";
			} else if (field1065) {
				arg0.field876 = 0xFF0000;
				arg0.field874 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field876 = 0xFFFFFF;
				arg0.field874 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1166 == 0) {
				arg0.field874 = "";
			} else {
				String var9;
				if (field1045 == 0) {
					var9 = "earlier today";
				} else if (field1045 == 1) {
					var9 = "yesterday";
				} else {
					var9 = field1045 + " days ago";
				}

				arg0.field874 = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1335 == 0) {
				arg0.field874 = "0 unread messages";
				arg0.field876 = 0xFFFF00;
			}

			if (field1335 == 1) {
				arg0.field874 = "1 unread message";
				arg0.field876 = 0xFF00;
			}

			if (field1335 > 1) {
				arg0.field874 = field1335 + " unread messages";
				arg0.field876 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1003 == 201) {
				arg0.field874 = "";
			} else if (field1003 == 200) {
				arg0.field874 = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (field1003 == 0) {
					var10 = "Earlier today";
				} else if (field1003 == 1) {
					var10 = "Yesterday";
				} else {
					var10 = field1003 + " days ago";
				}

				arg0.field874 = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1003 == 201) {
				arg0.field874 = "";
			} else if (field1003 == 200) {
				arg0.field874 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field874 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1003 == 201) {
				arg0.field874 = "";
			} else if (field1003 == 200) {
				arg0.field874 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field874 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Z)Z")
	public final boolean method389(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1010; var2++) {
			if (arg0.equalsIgnoreCase(field1085[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1007.field323)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method390(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1073.method189(arg3, arg4);
		field1074.method189(arg3, arg2 + arg4 - 16);
		class32.method150(arg4 + 16, 16, field951, arg3, arg2 - 32);
		int var6 = (arg2 - 32) * arg2 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg0 / (arg1 - arg2);
		class32.method150(arg4 + var7 + 16, 16, field970, arg3, var6);
		class32.method153(arg3, arg4 + var7 + 16, var6, field1152);
		class32.method153(arg3 + 1, arg4 + 16 + var7, var6, field1152);
		class32.method152(field1152, 16, arg3, arg4 + var7 + 16);
		class32.method152(field1152, 16, arg3, arg4 + var7 + 17);
		class32.method153(arg3 + 15, arg4 + 16 + var7, var6, field1032);
		class32.method153(arg3 + 14, arg4 + 17 + var7, var6 - 1, field1032);
		class32.method152(field1032, 16, arg3, arg4 + var7 + var6 + 15);
		class32.method152(field1032, 15, arg3 + 1, arg4 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.c(I)V")
	public final void method7() {
		if (!field1002 && !field961 && !field1112) {
			field1316++;

			if (field1000) {
				method404();
			} else {
				method450();
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;)V")
	public final void method391(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1200 != -1) {
			field1206 = arg2;
			field17 = 0;
		}

		if (field1320 == -1) {
			field949 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1048[var4] = field1048[var4 - 1];
			field1049[var4] = field1049[var4 - 1];
			field1050[var4] = field1050[var4 - 1];
		}

		field1048[0] = arg0;
		field1049[0] = arg1;
		field1050[0] = arg2;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method392() {
		for (class27 var1 = (class27) field955.method235(); var1 != null; var1 = (class27) field955.method237()) {
			if (field978 != var1.field345 || field1316 > var1.field351) {
				var1.method108();
			} else if (field1316 >= var1.field350) {
				if (var1.field354 > 0) {
					class25 var2 = field1098[var1.field354 - 1];
					if (var2 != null) {
						var1.method117(var2.field271, field1316, method382(var2.field270, var1.field345, var2.field271) - var1.field349, var2.field270);
					}
				}

				if (var1.field354 < 0) {
					int var3 = -var1.field354 - 1;
					class26 var4;
					if (field1273 == var3) {
						var4 = field1007;
					} else {
						var4 = field1103[var3];
					}

					if (var4 != null) {
						var1.method117(var4.field271, field1316, method382(var4.field270, var1.field345, var4.field271) - var1.field349, var4.field270);
					}
				}

				var1.method118(field1167);
				field1284.method62(var1, null, false, (int) var1.field358, 60, var1.field364, (int) var1.field357, field978, (int) var1.field356, -1);
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method393() {
		field1174.method205(231);

		if (field976 != -1) {
			field976 = -1;
			field1151 = true;
			field1340 = false;
			field1197 = true;
		}

		if (field1320 != -1) {
			field1320 = -1;
			field949 = true;
			field1340 = false;
		}

		field1238 = -1;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method394() {
		field1145.method242();
		class33.field505 = field963;
		field1302.method189(0, 0);

		if (field976 != -1) {
			method409(0, 0, class60.field835[field976], 0);
		} else if (field1137[field1277] != -1) {
			method409(0, 0, class60.field835[field1137[field1277]], 0);
		}

		if (field1182 && field1086 == 1) {
			method439();
		}

		field1145.method243(231, field8, 562);
		field1147.method242();
		class33.field505 = field964;
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public static final String method395(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.g(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field11 != null) {
			return field11;
		}

		return this;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method396(long arg0) {
		if (arg0 != 0L) {
			if (field1010 >= 100) {
				method391(0, "", "Your friends list is full. Max of 100 hit");
			} else {
				String var3 = class48.method262(class48.method259(arg0));
				for (int var4 = 0; var4 < field1010; var4++) {
					if (field1204[var4] == arg0) {
						method391(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1067; var5++) {
					if (field1011[var5] == arg0) {
						method391(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1007.field323)) {
					field1085[field1010] = var3;
					field1204[field1010] = arg0;
					field1291[field1010] = 0;
					field1010++;
					field1151 = true;
					field1174.method205(118);
					field1174.method212(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method397() {
		int var1 = field1019 * 128 + 64;
		int var2 = field1020 * 128 + 64;
		int var3 = method382(field1019, field978, field1020) - field1021;

		if (field1119 < var1) {
			field1119 += (var1 - field1119) * field1023 / 1000 + field1022;
			if (field1119 > var1) {
				field1119 = var1;
			}
		}

		if (field1119 > var1) {
			field1119 -= (field1119 - var1) * field1023 / 1000 + field1022;
			if (field1119 < var1) {
				field1119 = var1;
			}
		}

		if (field1120 < var3) {
			field1120 += (var3 - field1120) * field1023 / 1000 + field1022;
			if (field1120 > var3) {
				field1120 = var3;
			}
		}

		if (field1120 > var3) {
			field1120 -= (field1120 - var3) * field1023 / 1000 + field1022;
			if (field1120 < var3) {
				field1120 = var3;
			}
		}

		if (field1121 < var2) {
			field1121 += (var2 - field1121) * field1023 / 1000 + field1022;
			if (field1121 > var2) {
				field1121 = var2;
			}
		}

		if (field1121 > var2) {
			field1121 -= (field1121 - var2) * field1023 / 1000 + field1022;
			if (field1121 < var2) {
				field1121 = var2;
			}
		}

		int var4 = field1327 * 128 + 64;
		int var5 = field1328 * 128 + 64;
		int var6 = method382(field1327, field978, field1328) - field1329;
		int var7 = var4 - field1119;
		int var8 = var6 - field1120;
		int var9 = var5 - field1121;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1122 < var11) {
			field1122 += (var11 - field1122) * field1331 / 1000 + field1330;
			if (field1122 > var11) {
				field1122 = var11;
			}
		}

		if (field1122 > var11) {
			field1122 -= (field1122 - var11) * field1331 / 1000 + field1330;
			if (field1122 < var11) {
				field1122 = var11;
			}
		}

		int var13 = var12 - field1123;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1123 += field1331 * var13 / 1000 + field1330;
			field1123 &= 0x7FF;
		}

		if (var13 < 0) {
			field1123 -= -var13 * field1331 / 1000 + field1330;
			field1123 &= 0x7FF;
		}

		int var14 = var12 - field1123;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1123 = var12;
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method398(int arg0, int arg1) {
		class41 var3 = field1138[field978][arg0][arg1];
		if (var3 == null) {
			field1284.method77(field978, arg0, arg1);
		} else {
			int var4 = -99999999;
			class22 var5 = null;
			for (class22 var6 = (class22) var3.method235(); var6 != null; var6 = (class22) var3.method237()) {
				class55 var7 = class55.method294(var6.field268);
				int var8 = var7.field785;
				if (var7.field784) {
					var8 = (var6.field269 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method233(var5);
			int var9 = -1;
			int var10 = -1;
			int var11 = 0;
			int var12 = 0;
			for (class22 var13 = (class22) var3.method235(); var13 != null; var13 = (class22) var3.method237()) {
				if (var5.field268 != var13.field268 && var9 == -1) {
					var9 = var13.field268;
					var11 = var13.field269;
				}

				if (var5.field268 != var13.field268 && var13.field268 != var9 && var10 == -1) {
					var10 = var13.field268;
					var12 = var13.field269;
				}
			}

			class31 var14 = null;
			if (var9 != -1) {
				var14 = class55.method294(var9).method298(var11);
			}

			class31 var15 = null;
			if (var10 != -1) {
				var15 = class55.method294(var10).method298(var12);
			}

			int var16 = (arg1 << 7) + arg0 + 0x60000000;
			class55 var17 = class55.method294(var5.field268);
			field1284.method58(var16, arg1, method382(arg0 * 128 + 64, field978, arg1 * 128 + 64), field978, arg0, var15, var14, var17.method298(var5.field269));
		}
	}

	@ObfuscatedName("client.a(BLhc;)Z")
	public final boolean method399(class60 arg0) {
		if (arg0.field850 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field850.length; var2++) {
			int var3 = method487(arg0, var2);
			int var4 = arg0.field851[var2];
			if (arg0.field850[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field850[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field850[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method400() {
		if (field1126 == 2) {
			for (class39 var1 = (class39) field1013.method235(); var1 != null; var1 = (class39) field1013.method237()) {
				if (field1316 >= var1.field571) {
					method436(var1.field564, var1.field565, var1.field570, var1.field568, var1.field567, var1.field566, var1.field569);
					var1.method108();
				}
			}

			field1093++;
			if (field1093 > 85) {
				field1093 = 0;
				field1174.method205(85);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void method401(int arg0, class37 arg1) {
		arg1.method226();
		int var3 = arg1.method227(8);
		if (var3 < field1099) {
			for (int var4 = var3; var4 < field1099; var4++) {
				field1237[field1236++] = field1100[var4];
			}
		}

		if (var3 > field1099) {
			signlink.reporterror(field965 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1099 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1100[var5];
			class25 var7 = field1098[var6];
			int var8 = arg1.method227(1);
			if (var8 == 0) {
				field1100[field1099++] = var6;
				var7.field314 = field1316;
			} else {
				int var9 = arg1.method227(2);
				if (var9 == 0) {
					field1100[field1099++] = var6;
					var7.field314 = field1316;
					field1107[field1106++] = var6;
				} else if (var9 == 1) {
					field1100[field1099++] = var6;
					var7.field314 = field1316;
					int var10 = arg1.method227(3);
					var7.method111(false, var10);
					int var11 = arg1.method227(1);
					if (var11 == 1) {
						field1107[field1106++] = var6;
					}
				} else if (var9 == 2) {
					field1100[field1099++] = var6;
					var7.field314 = field1316;
					int var12 = arg1.method227(3);
					var7.method111(true, var12);
					int var13 = arg1.method227(3);
					var7.method111(true, var13);
					int var14 = arg1.method227(1);
					if (var14 == 1) {
						field1107[field1106++] = var6;
					}
				} else if (var9 == 3) {
					field1237[field1236++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lx;IZ)V")
	public final void method402(class24 arg0, int arg1) {
		method403(arg0.field270, arg1, arg0.field271);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method403(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method382(arg0, field978, arg2) - arg1;
			arg0 -= field1119;
			var4 -= field1120;
			arg2 -= field1121;
			int var5 = class31.field480[field1122];
			int var6 = class31.field481[field1122];
			int var7 = class31.field480[field1123];
			int var8 = class31.field481[field1123];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field1131 = (var9 << 9) / arg2 + class33.field499;
				field1132 = (var11 << 9) / arg2 + class33.field500;
			} else {
				field1131 = -1;
				field1132 = -1;
			}
		} else {
			field1131 = -1;
			field1132 = -1;
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method404() {
		if (field1091 > 1) {
			field1091--;
		}

		if (field1246 > 0) {
			field1246--;
		}

		for (int var1 = 0; var1 < 5 && method425(); var1++) {
		}

		if (field1000) {
			for (int var2 = 0; var2 < field1115; var2++) {
				if (field1092[var2] <= 0) {
					boolean var3 = false;
					try {
						if (field960[var2] != field1283 || field1341[var2] != field1006) {
							class37 var4 = class51.method271(field1341[var2], field960[var2]);
							if (System.currentTimeMillis() + var4.field543 / 22 > field1181 / 22 + field971) {
								field1181 = var4.field543;
								field971 = System.currentTimeMillis();

								if (method451(var4.field542, var4.field543)) {
									field1283 = field960[var2];
									field1006 = field1341[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!method452()) {
							var3 = true;
						}
					} catch (Exception var20) {
					}

					if (var3 && field1092[var2] != -5) {
						field1092[var2] = -5;
					} else {
						field1115--;
						for (int var6 = var2; var6 < field1115; var6++) {
							field960[var6] = field960[var6 + 1];
							field1341[var6] = field1341[var6 + 1];
							field1092[var6] = field1092[var6 + 1];
						}

						var2--;
					}
				} else {
					field1092[var2]--;
				}
			}

			if (field1184 > 0) {
				field1184 -= 20;
				if (field1184 < 0) {
					field1184 = 0;
				}

				if (field1184 == 0 && field1276 && !field1298) {
					method481(field968, field1321, field1173);
				}
			}

			class37 var7 = class5.method36();
			if (var7 != null) {
				field1174.method205(81);
				field1174.method207(var7.field543);
				field1174.method214(var7.field543, var7.field542, 0);
				var7.method204();
			}

			field1244++;
			if (field1244 > 750) {
				method472();
			}

			method428();
			method373();
			method461();
			method400();

			if ((field20[1] == 1 || field20[2] == 1 || field20[3] == 1 || field20[4] == 1) && field954++ > 5) {
				field954 = 0;
				field1174.method205(189);
				field1174.method207(field1286);
				field1174.method207(field1287);
				field1174.method206(field1279);
				field1174.method206(field1230);
			}

			field1167++;

			if (field1097 != 0) {
				field1096 += 20;
				if (field1096 >= 400) {
					field1097 = 0;
				}
			}

			if (field1229 != 0) {
				field1226++;
				if (field1226 >= 15) {
					if (field1229 == 2) {
						field1151 = true;
					}

					if (field1229 == 3) {
						field949 = true;
					}

					field1229 = 0;
				}
			}

			if (field1016 != 0) {
				field1044++;

				if (field15 > field1017 + 5 || field15 < field1017 - 5 || field16 > field1018 + 5 || field16 < field1018 - 5) {
					field1178 = true;
				}

				if (field14 == 0) {
					if (field1016 == 2) {
						field1151 = true;
					}

					if (field1016 == 3) {
						field949 = true;
					}

					field1016 = 0;

					if (field1178 && field1044 >= 5) {
						field959 = -1;
						method448();

						if (field959 == field1014 && field958 != field1015) {
							class60 var8 = class60.field835[field1014];
							int var9 = var8.field836[field958];
							var8.field836[field958] = var8.field836[field1015];
							var8.field836[field1015] = var9;
							int var10 = var8.field837[field958];
							var8.field837[field958] = var8.field837[field1015];
							var8.field837[field1015] = var10;
							field1174.method205(159);
							field1174.method207(field1014);
							field1174.method207(field1015);
							field1174.method207(field958);
						}
					} else if ((field1031 == 1 || method435(field1062 - 1)) && field1062 > 2) {
						method419();
					} else if (field1062 > 0) {
						method454(field1062 - 1);
					}

					field1226 = 10;
					field17 = 0;
				}
			}

			field1134++;
			if (field1134 > 127) {
				field1134 = 0;
				field1174.method205(215);
				field1174.method209(0x4C2B2C);
			}

			if (class18.field230 != -1) {
				int var11 = class18.field230;
				int var12 = class18.field231;
				boolean var13 = method420(0, var11, true, 0, 0, field1007.field319[0], 0, 0, field1007.field318[0], var12, 0);
				class18.field230 = -1;

				if (var13) {
					field1094 = field18;
					field1095 = field19;
					field1097 = 1;
					field1096 = 0;
				}
			}

			if (field17 == 1 && field1206 != null) {
				field1206 = null;
				field949 = true;
				field17 = 0;
			}

			method437();
			method468();
			method446();
			method482();

			if (field14 == 1 || field17 == 1) {
				field1191++;
			}

			if (field1126 == 2) {
				method474();
			}

			if (field1126 == 2 && field957) {
				method397();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				field1240[var14]++;
			}

			method383();
			field13++;
			if (field13 > 4500) {
				field1246 = 250;
				field13 -= 500;
				field1174.method205(70);
			}

			field1183++;
			if (field1183 > 500) {
				field1183 = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					field1053 += field1054;
				}

				if ((var15 & 0x2) == 2) {
					field1051 += field1052;
				}

				if ((var15 & 0x4) == 4) {
					field974 += field975;
				}
			}

			if (field1053 < -50) {
				field1054 = 2;
			}

			if (field1053 > 50) {
				field1054 = -2;
			}

			if (field1051 < -55) {
				field1052 = 2;
			}

			if (field1051 > 55) {
				field1052 = -2;
			}

			if (field974 < -40) {
				field975 = 1;
			}

			if (field974 > 40) {
				field975 = -1;
			}

			field1202++;
			if (field1202 > 500) {
				field1202 = 0;
				int var16 = (int) (Math.random() * 8.0D);
				if ((var16 & 0x1) == 1) {
					field1279 += field1280;
				}

				if ((var16 & 0x2) == 2) {
					field1230 += field1231;
				}
			}

			if (field1279 < -60) {
				field1280 = 2;
			}

			if (field1279 > 60) {
				field1280 = -2;
			}

			if (field1230 < -20) {
				field1231 = 1;
			}

			if (field1230 > 10) {
				field1231 = -1;
			}

			field1188++;
			if (field1188 > 110) {
				field1188 = 0;
				field1174.method205(236);
				field1174.method210(0);
			}

			field1245++;
			if (field1245 > 50) {
				field1174.method205(108);
			}

			try {
				if (field1041 != null && field1174.field543 > 0) {
					field1041.method33(field1174.field543, 0, field1174.field542);
					field1174.field543 = 0;
					field1245 = 0;
				}
			} catch (IOException var18) {
				method472();
			} catch (Exception var19) {
				method491();
			}
		}
	}

	@ObfuscatedName("client.a(IZI)Ljava/lang/String;")
	public static final String method405(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IBI)V")
	public final void method406(int arg0, int arg1) {
		if (field1186 != 0) {
			int var3 = 0;
			if (field1091 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field1050[var4] != null) {
					int var5 = field1048[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field1317 == 0 || field1317 == 1 && method389(field1049[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field15 > 8 && field15 < 520 && arg0 - 11 > var6 - 10 && arg0 - 11 <= var6 + 3) {
							if (field1199) {
								field1130[field1062] = "Report abuse @whi@" + field1049[var4];
								field1029[field1062] = 2034;
								field1062++;
							}

							field1130[field1062] = "Add ignore @whi@" + field1049[var4];
							field1029[field1062] = 2436;
							field1062++;
							field1130[field1062] = "Add friend @whi@" + field1049[var4];
							field1029[field1062] = 2406;
							field1062++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field1317 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public static final void method407() {
		class18.field196 = true;
		class33.field494 = true;
		field1298 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method408() {
		field1148.method242();
		class33.field505 = field962;
		field1304.method189(0, 0);

		if (field1129) {
			field1164.method191(0, field1169, 239, 40);
			field1164.method191(128, field1024 + "*", 239, 60);
		} else if (field1290) {
			field1164.method191(0, "Enter amount:", 239, 40);
			field1164.method191(128, field1274 + "*", 239, 60);
		} else if (field1206 != null) {
			field1164.method191(0, field1206, 239, 40);
			field1164.method191(128, "Click to continue", 239, 60);
		} else if (field1320 != -1) {
			method409(0, 0, class60.field835[field1320], 0);
		} else if (field1200 == -1) {
			class36 var1 = field1163;
			int var2 = 0;
			class32.method148(77, 463, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1050[var3] != null) {
					int var4 = field1048[var3];
					int var5 = field998 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, field1050[var3], var5, 0);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, field1049[var3] + ":", var5, 0xFFFFFF);
							var1.method194(var1.method193(field1049[var3]) + 12, field1050[var3], var5, 255);
						}

						var2++;
					}

					if (var4 == 2 && (field1084 == 0 || field1084 == 1 && method389(field1049[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, field1049[var3] + ":", var5, 0);
							var1.method194(var1.method193(field1049[var3]) + 12, field1050[var3], var5, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1186 == 0 && (var4 == 7 || field1317 == 0 || field1317 == 1 && method389(field1049[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, "From " + field1049[var3] + ":", var5, 0);
							var1.method194(var1.method193("From " + field1049[var3]) + 12, field1050[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1232 == 0 || field1232 == 1 && method389(field1049[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, field1049[var3] + " " + field1050[var3], var5, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1186 == 0 && field1317 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, field1050[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1186 == 0 && field1317 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, "To " + field1049[var3] + ":", var5, 0);
							var1.method194(var1.method193("To " + field1049[var3]) + 12, field1050[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1232 == 0 || field1232 == 1 && method389(field1049[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(4, field1049[var3] + " " + field1050[var3], var5, 0xCBB789);
						}

						var2++;
					}
				}
			}

			class32.method147();
			field1064 = var2 * 14 + 7;
			if (field1064 < 78) {
				field1064 = 78;
			}

			method390(field1064 - field998 - 77, field1064, 77, 463, 0);
			var1.method194(4, class48.method262(field965) + ":", 90, 0);
			var1.method194(var1.method193(field965 + ": ") + 6, field972 + "*", 90, 255);
			class32.method152(0, 479, 0, 77);
		} else {
			method409(0, 0, class60.field835[field1200], 0);
		}

		if (field1182 && field1086 == 2) {
			method439();
		}

		field1148.method243(375, field8, 22);
		field1147.method242();
		class33.field505 = field964;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 224);

			if (arg0.length == 4) {
				field1295 = Integer.parseInt(arg0[0]);
				field1296 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method407();
				} else if (arg0[2].equals("highmem")) {
					method440();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					field1297 = false;
				} else if (arg0[3].equals("members")) {
					field1297 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method1(789, 532);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IILhc;II)V")
	public final void method409(int arg0, int arg1, class60 arg2, int arg3) {
		if (arg2.field842 == 0 && arg2.field856 != null && (!arg2.field855 || field999 == arg2.field840 || field1034 == arg2.field840 || field1218 == arg2.field840)) {
			int var5 = class32.field489;
			int var6 = class32.field487;
			int var7 = class32.field490;
			int var8 = class32.field488;
			class32.method148(arg2.field846 + arg1, arg2.field845 + arg3, arg3, arg1);
			int var9 = arg2.field856.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field857[var10] + arg3;
				int var12 = arg2.field858[var10] + arg1 - arg0;
				class60 var13 = class60.field835[arg2.field856[var10]];
				var11 += var13.field847;
				var12 += var13.field848;

				if (var13.field844 > 0) {
					method388(var13);
				}

				if (var13.field842 == 0) {
					if (var13.field854 > var13.field853 - var13.field846) {
						var13.field854 = var13.field853 - var13.field846;
					}

					if (var13.field854 < 0) {
						var13.field854 = 0;
					}

					method409(var13.field854, var12, var13, var11);

					if (var13.field853 > var13.field846) {
						method390(var13.field854, var13.field853, var13.field846, var13.field845 + var11, var12);
					}
				} else if (var13.field842 != 1) {
					if (var13.field842 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field846; var15++) {
							for (int var16 = 0; var16 < var13.field845; var16++) {
								int var17 = (var13.field864 + 32) * var16 + var11;
								int var18 = (var13.field865 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field867[var14];
									var18 += var13.field868[var14];
								}

								if (var13.field836[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field836[var14] - 1;
									if (var17 >= -32 && var17 <= 512 && var18 >= -32 && var18 <= 334 || field1016 != 0 && field1015 == var14) {
										class34 var22 = class55.method299(var13.field837[var14], var21);
										if (field1016 != 0 && field1015 == var14 && field1014 == var13.field840) {
											var19 = field15 - field1017;
											var20 = field16 - field1018;

											if (var19 < 5 && var19 > -5) {
												var19 = 0;
											}

											if (var20 < 5 && var20 > -5) {
												var20 = 0;
											}

											if (field1044 < 5) {
												var19 = 0;
												var20 = 0;
											}

											var22.method179(var17 + var19, 128, var18 + var20);
										} else if (field1229 != 0 && field1228 == var14 && field1227 == var13.field840) {
											var22.method179(var17, 128, var18);
										} else {
											var22.method175(var17, var18);
										}

										if (var22.field522 == 33 || var13.field837[var14] != 1) {
											int var23 = var13.field837[var14];
											field1162.method194(var17 + var19 + 1, method395(var23), var18 + var20 + 10, 0);
											field1162.method194(var17 + var19, method395(var23), var18 + var20 + 9, 0xFFFF00);
										}
									}
								} else if (var13.field866 != null && var14 < 20) {
									class34 var24 = var13.field866[var14];
									if (var24 != null) {
										var24.method175(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field842 == 3) {
						if (var13.field870) {
							class32.method150(var12, var13.field845, var13.field876, var11, var13.field846);
						} else {
							class32.method151(var13.field846, var13.field845, var13.field876, var11, var12);
						}
					} else if (var13.field842 == 4) {
						class36 var25 = var13.field873;
						int var26 = var13.field876;
						String var27 = var13.field874;

						if ((field1218 == var13.field840 || field1034 == var13.field840 || field999 == var13.field840) && var13.field878 != 0) {
							var26 = var13.field878;
						}

						if (method399(var13)) {
							var26 = var13.field877;

							if (var13.field875.length() > 0) {
								var27 = var13.field875;
							}
						}

						if (var13.field843 == 6 && field1340) {
							var27 = "Please wait...";
							var26 = var13.field876;
						}

						int var28 = var25.field539 + var12;
						while (var27.length() > 0) {
							if (var27.indexOf("%") != -1) {
								while (true) {
									int var29 = var27.indexOf("%1");
									if (var29 == -1) {
										break;
									}

									var27 = var27.substring(0, var29) + method465(method487(var13, 0)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method465(method487(var13, 1)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method465(method487(var13, 2)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method465(method487(var13, 3)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method465(method487(var13, 4)) + var27.substring(var33 + 2);
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

							if (var13.field871) {
								var25.method192(var13.field845 / 2 + var11, var35, var26, var28, var13.field872);
							} else {
								var25.method196(var11, var13.field872, var35, var26, var28);
							}

							var28 += var25.field539;
						}
					} else if (var13.field842 == 5) {
						class34 var36;
						if (method399(var13)) {
							var36 = var13.field880;
						} else {
							var36 = var13.field879;
						}

						if (var36 != null) {
							var36.method175(var11, var12);
						}
					} else if (var13.field842 == 6) {
						int var37 = class33.field499;
						int var38 = class33.field500;
						class33.field499 = var13.field845 / 2 + var11;
						class33.field500 = var13.field846 / 2 + var12;
						int var39 = class33.field503[var13.field886] * var13.field885 >> 16;
						int var40 = class33.field504[var13.field886] * var13.field885 >> 16;
						boolean var41 = method399(var13);
						int var42;
						if (var41) {
							var42 = var13.field884;
						} else {
							var42 = var13.field883;
						}

						class31 var43;
						if (var42 == -1) {
							var43 = var13.method323(-1, -1, var41);
						} else {
							class62 var44 = class62.field901[var42];
							var43 = var13.method323(var44.field903[var13.field838], var44.field904[var13.field838], var41);
						}

						if (var43 != null) {
							var43.method140(0, var13.field887, 0, var13.field886, 0, var39, var40);
						}

						class33.field499 = var37;
						class33.field500 = var38;
					} else if (var13.field842 == 7) {
						class36 var45 = var13.field873;
						int var46 = 0;
						for (int var47 = 0; var47 < var13.field846; var47++) {
							for (int var48 = 0; var48 < var13.field845; var48++) {
								if (var13.field836[var46] > 0) {
									class55 var49 = class55.method294(var13.field836[var46] - 1);
									String var50 = var49.field773;
									if (var49.field784 || var13.field837[var46] != 1) {
										var50 = var50 + " x" + method429(var13.field837[var46]);
									}

									int var51 = (var13.field864 + 115) * var48 + var11;
									int var52 = (var13.field865 + 12) * var47 + var12;
									if (var13.field871) {
										var45.method192(var13.field845 / 2 + var51, var50, var13.field876, var52, var13.field872);
									} else {
										var45.method196(var51, var13.field872, var50, var13.field876, var52);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class32.method148(var8, var7, var5, var6);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method410(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1008 = "";
				field1009 = "Connecting to server...";
				method475();
			}

			field1041 = new class4(this, method467(field1296 + 43594));
			field1041.method32(field1161.field542, 0, 8);
			field1161.field543 = 0;
			field1225 = field1161.method222();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1225 >> 32), (int) field1225 };
			field1174.field543 = 0;
			field1174.method206(10);
			field1174.method210(var4[0]);
			field1174.method210(var4[1]);
			field1174.method210(var4[2]);
			field1174.method210(var4[3]);
			field1174.method210(signlink.uid);
			field1174.method213(arg0);
			field1174.method213(arg1);
			field1174.method231(field1111, field1176);
			field1239.field543 = 0;

			if (arg2) {
				field1239.method206(18);
			} else {
				field1239.method206(16);
			}

			field1239.method206(field1174.field543 + 36 + 1 + 1);
			field1239.method206(224);
			field1239.method206(field1298 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1239.method210(field1315[var5]);
			}

			field1239.method214(field1174.field543, field1174.field542, 0);
			field1174.field547 = new class46(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1334 = new class46(var4);
			field1041.method33(field1239.field543, 0, field1239.field542);
			int var7 = field1041.method30();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method410(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field1199 = true;
				} else {
					field1199 = false;
				}

				class5.method35();
				field1000 = true;
				field1174.field543 = 0;
				field1161.field543 = 0;
				field1243 = -1;
				field1233 = -1;
				field1234 = -1;
				field1235 = -1;
				field1242 = 0;
				field1244 = 0;
				field1091 = 0;
				field1246 = 0;
				field1070 = 0;
				field1062 = 0;
				field1182 = false;
				field13 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field1050[var8] = null;
				}

				field984 = 0;
				field1305 = 0;
				field1126 = 0;
				field1115 = 0;
				field1053 = (int) (Math.random() * 100.0D) - 50;
				field1051 = (int) (Math.random() * 110.0D) - 55;
				field974 = (int) (Math.random() * 80.0D) - 40;
				field1279 = (int) (Math.random() * 120.0D) - 60;
				field1230 = (int) (Math.random() * 30.0D) - 20;
				field1287 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1116 = -1;
				field1249 = 0;
				field1250 = 0;
				field1104 = 0;
				field1099 = 0;

				for (int var9 = 0; var9 < field1101; var9++) {
					field1103[var9] = null;
					field1108[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1098[var10] = null;
				}

				field1007 = field1103[field1102] = new class26();
				field955.method239();
				field1293.method239();
				field1013.method239();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1138[var11][var12][var13] = null;
						}
					}
				}

				field1336 = new class41();
				field1010 = 0;
				field1200 = -1;
				field1320 = -1;
				field1238 = -1;
				field976 = -1;
				field1340 = false;
				field1277 = 3;
				field1290 = false;
				field1182 = false;
				field1129 = false;
				field1206 = null;
				field1135 = 0;
				field1325 = -1;
				field1253 = true;
				method455();

				for (int var14 = 0; var14 < 5; var14++) {
					field1127[var14] = 0;
				}

				field1113 = 0;
				field1300 = 0;
				field1285 = 0;
				field1153 = 0;
				field1180 = 0;
				field1224 = 0;
				field1172 = 0;
				field1128 = 0;
				field1033 = 0;
				method371();
				return;
			}

			if (var7 == 3) {
				field1008 = "";
				field1009 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field1008 = "Your account has been disabled.";
				field1009 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field1008 = "Your account is already logged in.";
				field1009 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field1008 = "RuneScape has been updated!";
				field1009 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field1008 = "This world is full.";
				field1009 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field1008 = "Unable to connect.";
				field1009 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field1008 = "Login limit exceeded.";
				field1009 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field1008 = "Unable to connect.";
				field1009 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field1009 = "Login server rejected session.";
				field1009 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field1008 = "You need a members account to login to this world.";
				field1009 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field1008 = "Could not complete login.";
				field1009 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field1008 = "The server is being updated.";
				field1009 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field1000 = true;
				field1174.field543 = 0;
				field1161.field543 = 0;
				field1243 = -1;
				field1233 = -1;
				field1234 = -1;
				field1235 = -1;
				field1242 = 0;
				field1244 = 0;
				field1091 = 0;
				field1062 = 0;
				field1182 = false;
				return;
			}

			if (var7 == 16) {
				field1008 = "Login attempts exceeded.";
				field1009 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field1008 = "You are standing in a members-only area.";
				field1009 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field1008 = "";
			field1009 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method411() {
		if (field1007.field270 >> 7 == field1249 && field1007.field271 >> 7 == field1250) {
			field1249 = 0;
		}

		for (int var1 = -1; var1 < field1104; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1007;
				var3 = field1102 << 14;
			} else {
				var2 = field1103[field1105[var1]];
				var3 = field1105[var1] << 14;
			}

			if (var2 != null && var2.method112()) {
				var2.field342 = false;
				if ((field1298 && field1104 > 50 || field1104 > 200) && var1 != -1 && var2.field294 == var2.field275) {
					var2.field342 = true;
				}

				int var4 = var2.field270 >> 7;
				int var5 = var2.field271 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field337 == null || field1316 < var2.field332 || field1316 >= var2.field333) {
						if ((var2.field270 & 0x7F) == 0x40 && (var2.field271 & 0x7F) == 0x40) {
							if (field1342[var4][var5] == field1133) {
								continue;
							}

							field1342[var4][var5] = field1133;
						}

						var2.field331 = method382(var2.field270, field978, var2.field271);
						field1284.method62(var2, null, var2.field273, var2.field331, 60, var2.field272, var2.field271, field978, var2.field270, var3);
					} else {
						var2.field342 = false;
						var2.field331 = method382(var2.field270, field978, var2.field271);
						field1284.method63(60, var2.field270, var2, field978, var2.field340, var2.field272, var2.field341, var3, var2.field331, var2.field339, var2.field338, null, var2.field271);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method412() {
		field1332 = false;
		while (field1012) {
			field1332 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1149 = null;
		field1150 = null;
		field1117 = null;
		field1311 = null;
		field1312 = null;
		field1313 = null;
		field1314 = null;
		field1170 = null;
		field1171 = null;
		field1195 = null;
		field1196 = null;
		field1068 = null;
		field1069 = null;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method413() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field961) {
			field1332 = false;
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
			field1332 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1002) {
			field1332 = false;
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

	@ObfuscatedName("client.a(JI)V")
	public final void method414(long arg0) {
		if (arg0 != 0L) {
			if (field1067 >= 100) {
				method391(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class48.method262(class48.method259(arg0));
				for (int var4 = 0; var4 < field1067; var4++) {
					if (field1011[var4] == arg0) {
						method391(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1010; var5++) {
					if (field1204[var5] == arg0) {
						method391(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1011[field1067++] = arg0;
				field1151 = true;
				field1174.method205(79);
				field1174.method212(arg0);
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method415() {
		if (field1070 == 2) {
			method403((field979 - field992 << 7) + field982, field981 * 2, (field980 - field993 << 7) + field983);

			if (field1131 > -1 && field1316 % 20 < 10) {
				field1004[2].method175(field1131 - 12, field1132 - 28);
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method416() {
		int var1 = (field1007.field270 >> 7) + field992;
		int var2 = (field1007.field271 >> 7) + field993;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1205 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1205 = (var2 - 9920) / 8 + 1;
		} else {
			field1205 = 0;
		}

		field1278 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1278 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1278 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1278 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1278 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1278 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1278 = 1;
			}
		}

		if (field1278 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1278 = 2;
		}

		field1223 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1223 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1223 = 1;
		}

		if (field1223 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1223 = 0;
		}
	}

	@ObfuscatedName("client.a(IILhb;B)V")
	public final void method417(int arg0, int arg1, class34 arg2) {
		int var4 = field1287 + field1279 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = class31.field480[var4];
			int var7 = class31.field481[var4];
			var6 = var6 * 256 / (field1230 + 256);
			var7 = var7 * 256 / (field1230 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method182(field1303, var8 + 94 - arg2.field522 / 2, 83 - var9 - arg2.field523 / 2);
			} else {
				arg2.method175(var8 + 94 - arg2.field522 / 2, 83 - var9 - arg2.field523 / 2);
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void method418(class37 arg0, int arg1) {
		if (arg1 == 59 || arg1 == 76) {
			int var3 = arg0.method216();
			int var4 = (var3 >> 4 & 0x7) + field1343;
			int var5 = (var3 & 0x7) + field1344;
			int var6 = arg0.method216();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1047[var7];
			int var10;
			if (arg1 == 76) {
				var10 = -1;
			} else {
				var10 = arg0.method218();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field1336.method235(); var12 != null; var12 = (class38) field1336.method237()) {
					if (field978 == var12.field554 && var12.field556 == var4 && var12.field557 == var5 && var12.field555 == var9) {
						var11 = var12;
						break;
					}
				}

				if (var11 == null) {
					int var13 = 0;
					int var14 = -1;
					int var15 = 0;
					int var16 = 0;

					if (var9 == 0) {
						var13 = field1284.method78(field978, var4, var5);
					}

					if (var9 == 1) {
						var13 = field1284.method79(field978, var5, var4);
					}

					if (var9 == 2) {
						var13 = field1284.method80(field978, var4, var5);
					}

					if (var9 == 3) {
						var13 = field1284.method81(field978, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field1284.method82(field978, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field554 = field978;
					var11.field555 = var9;
					var11.field556 = var4;
					var11.field557 = var5;
					var11.field561 = var14;
					var11.field563 = var15;
					var11.field562 = var16;
					field1336.method232(var11);
				}

				var11.field558 = var10;
				var11.field560 = var7;
				var11.field559 = var8;
				method436(field978, var9, var7, var10, var5, var4, var8);
			}
		} else if (arg1 == 42) {
			int var18 = arg0.method216();
			int var19 = (var18 >> 4 & 0x7) + field1343;
			int var20 = (var18 & 0x7) + field1344;
			int var21 = arg0.method216();
			int var22 = var21 >> 2;
			int var23 = field1047[var22];
			int var24 = arg0.method218();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = field1284.method78(field978, var19, var20);
				}

				if (var23 == 1) {
					var25 = field1284.method79(field978, var20, var19);
				}

				if (var23 == 2) {
					var25 = field1284.method80(field978, var19, var20);
				}

				if (var23 == 3) {
					var25 = field1284.method81(field978, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(var19, var20, false, var23, var25 >> 14 & 0x7FFF, field978, class62.field901[var24]);
					field1042.method232(var26);
				}
			}
		} else if (arg1 == 223) {
			int var27 = arg0.method216();
			int var28 = (var27 >> 4 & 0x7) + field1343;
			int var29 = (var27 & 0x7) + field1344;
			int var30 = arg0.method218();
			int var31 = arg0.method218();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var32 = new class22();
				var32.field268 = var30;
				var32.field269 = var31;

				if (field1138[field978][var28][var29] == null) {
					field1138[field978][var28][var29] = new class41();
				}

				field1138[field978][var28][var29].method232(var32);
				method398(var28, var29);
			}
		} else if (arg1 == 49) {
			int var33 = arg0.method216();
			int var34 = (var33 >> 4 & 0x7) + field1343;
			int var35 = (var33 & 0x7) + field1344;
			int var36 = arg0.method218();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				class41 var37 = field1138[field978][var34][var35];
				if (var37 != null) {
					for (class22 var38 = (class22) var37.method235(); var38 != null; var38 = (class22) var37.method237()) {
						if ((var36 & 0x7FFF) == var38.field268) {
							var38.method108();
							break;
						}
					}

					if (var37.method235() == null) {
						field1138[field978][var34][var35] = null;
					}

					method398(var34, var35);
				}
			}
		} else if (arg1 == 69) {
			int var39 = arg0.method216();
			int var40 = (var39 >> 4 & 0x7) + field1343;
			int var41 = (var39 & 0x7) + field1344;
			int var42 = var40 + arg0.method217();
			int var43 = var41 + arg0.method217();
			int var44 = arg0.method219();
			int var45 = arg0.method218();
			int var46 = arg0.method216();
			int var47 = arg0.method216();
			int var48 = arg0.method218();
			int var49 = arg0.method218();
			int var50 = arg0.method216();
			int var51 = arg0.method216();
			if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				class27 var52 = new class27(field1316 + var48, var44, var50, field978, var47, var41, field1316 + var49, method382(var40, field978, var41) - var46, var51, var45, var40);
				var52.method117(var43, field1316 + var48, method382(var42, field978, var43) - var47, var42);
				field955.method232(var52);
			}
		} else if (arg1 == 191) {
			int var53 = arg0.method216();
			int var54 = (var53 >> 4 & 0x7) + field1343;
			int var55 = (var53 & 0x7) + field1344;
			int var56 = arg0.method218();
			int var57 = arg0.method216();
			int var58 = arg0.method218();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				class28 var59 = new class28(var58, field1316, method382(var54, field978, var55) - var57, var56, var54, var55, field978);
				field1293.method232(var59);
			}
		} else if (arg1 == 50) {
			int var60 = arg0.method216();
			int var61 = (var60 >> 4 & 0x7) + field1343;
			int var62 = (var60 & 0x7) + field1344;
			int var63 = arg0.method218();
			int var64 = arg0.method218();
			int var65 = arg0.method218();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && field1273 != var65) {
				class22 var66 = new class22();
				var66.field268 = var63;
				var66.field269 = var64;

				if (field1138[field978][var61][var62] == null) {
					field1138[field978][var61][var62] = new class41();
				}

				field1138[field978][var61][var62].method232(var66);
				method398(var61, var62);
			}
		} else if (arg1 == 23) {
			int var67 = arg0.method216();
			int var68 = (var67 >> 4 & 0x7) + field1343;
			int var69 = (var67 & 0x7) + field1344;
			int var70 = arg0.method216();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = field1047[var71];
			int var74 = arg0.method218();
			int var75 = arg0.method218();
			int var76 = arg0.method218();
			int var77 = arg0.method218();
			byte var78 = arg0.method217();
			byte var79 = arg0.method217();
			byte var80 = arg0.method217();
			byte var81 = arg0.method217();
			class26 var82;
			if (field1273 == var77) {
				var82 = field1007;
			} else {
				var82 = field1103[var77];
			}

			if (var82 != null) {
				class39 var83 = new class39(field978, var73, var72, var71, var69, field1316 + var75, var68, -1);
				field1013.method232(var83);
				class39 var84 = new class39(field978, var73, var72, var71, var69, field1316 + var76, var68, var74);
				field1013.method232(var84);
				int var85 = field1248[field978][var68][var69];
				int var86 = field1248[field978][var68 + 1][var69];
				int var87 = field1248[field978][var68 + 1][var69 + 1];
				int var88 = field1248[field978][var68][var69 + 1];
				class53 var89 = class53.method282(var74);
				var82.field332 = field1316 + var75;
				var82.field333 = field1316 + var76;
				var82.field337 = var89.method285(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.field709;
				int var91 = var89.field710;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.field710;
					var91 = var89.field709;
				}

				var82.field334 = var68 * 128 + var90 * 64;
				var82.field336 = var69 * 128 + var91 * 64;
				var82.field335 = method382(var82.field334, field978, var82.field336);

				if (var78 > var80) {
					byte var92 = var78;
					var78 = var80;
					var80 = var92;
				}

				if (var79 > var81) {
					byte var93 = var79;
					var79 = var81;
					var81 = var93;
				}

				var82.field338 = var68 + var78;
				var82.field340 = var68 + var80;
				var82.field339 = var69 + var79;
				var82.field341 = var69 + var81;
			}
		} else if (arg1 == 151) {
			int var94 = arg0.method216();
			int var95 = (var94 >> 4 & 0x7) + field1343;
			int var96 = (var94 & 0x7) + field1344;
			int var97 = arg0.method218();
			int var98 = arg0.method218();
			int var99 = arg0.method218();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1138[field978][var95][var96];
				if (var100 != null) {
					for (class22 var101 = (class22) var100.method235(); var101 != null; var101 = (class22) var100.method237()) {
						if ((var97 & 0x7FFF) == var101.field268 && var101.field269 == var98) {
							var101.field269 = var99;
							break;
						}
					}

					method398(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method419() {
		int var1 = field1164.method193("Choose Option");
		for (int var2 = 0; var2 < field1062; var2++) {
			int var3 = field1164.method193(field1130[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1062 * 15 + 21;
		if (field18 > 8 && field19 > 11 && field18 < 520 && field19 < 345) {
			int var5 = field18 - var1 / 2 - 8;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field19 - 11;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field1182 = true;
			field1086 = 0;
			field1087 = var5;
			field1088 = var6;
			field1089 = var1;
			field1090 = field1062 * 15 + 22;
		}

		if (field18 > 562 && field19 > 231 && field18 < 752 && field19 < 492) {
			int var7 = field18 - var1 / 2 - 562;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field19 - 231;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field1182 = true;
			field1086 = 1;
			field1087 = var7;
			field1088 = var8;
			field1089 = var1;
			field1090 = field1062 * 15 + 22;
		}

		if (field18 > 22 && field19 > 375 && field18 < 501 && field19 < 471) {
			int var9 = field18 - var1 / 2 - 22;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field19 - 375;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field1182 = true;
			field1086 = 2;
			field1087 = var9;
			field1088 = var10;
			field1089 = var1;
			field1090 = field1062 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(IIZZIIIIIIII)Z")
	public final boolean method420(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1270[var14][var15] = 0;
				field1110[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg5;
		field1270[arg8][arg5] = 99;
		field1110[arg8][arg5] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1309[var18] = arg8;
		int var35 = var18 + 1;
		field1310[var18] = arg5;
		boolean var20 = false;
		int var21 = field1309.length;
		int[][] var22 = field1318[field978].field813;
		while (var35 != var19) {
			var16 = field1309[var19];
			var17 = field1310[var19];
			var19 = (var19 + 1) % var21;

			if (arg1 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field1318[field978].method311(var17, arg1, arg10 - 1, arg6, arg9, var16)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field1318[field978].method312(var16, arg9, var17, arg1, arg6, arg10 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg3 != 0 && field1318[field978].method313(arg9, arg3, arg0, var17, arg7, arg1, var16)) {
				var20 = true;
				break;
			}

			int var23 = field1110[var16][var17] + 1;
			if (var16 > 0 && field1270[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1309[var35] = var16 - 1;
				field1310[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1270[var16 - 1][var17] = 2;
				field1110[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1270[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1309[var35] = var16 + 1;
				field1310[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1270[var16 + 1][var17] = 8;
				field1110[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1270[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1309[var35] = var16;
				field1310[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1270[var16][var17 - 1] = 1;
				field1110[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1270[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1309[var35] = var16;
				field1310[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1270[var16][var17 + 1] = 4;
				field1110[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1270[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1309[var35] = var16 - 1;
				field1310[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1270[var16 - 1][var17 - 1] = 3;
				field1110[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1270[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1309[var35] = var16 + 1;
				field1310[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1270[var16 + 1][var17 - 1] = 9;
				field1110[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1270[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1309[var35] = var16 - 1;
				field1310[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1270[var16 - 1][var17 + 1] = 6;
				field1110[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1270[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1309[var35] = var16 + 1;
				field1310[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1270[var16 + 1][var17 + 1] = 12;
				field1110[var16 + 1][var17 + 1] = var23;
			}
		}

		field996 = 0;
		if (!var20) {
			if (arg2) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg1 - var25; var26 <= arg1 + var25; var26++) {
						for (int var27 = arg9 - var25; var27 <= arg9 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1110[var26][var27] < var24) {
								var24 = field1110[var26][var27];
								var16 = var26;
								var17 = var27;
								field996 = 1;
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
		field1309[var28] = var16;
		int var36 = var28 + 1;
		field1310[var28] = var17;
		int var29;
		int var30 = var29 = field1270[var16][var17];
		while (arg8 != var16 || arg5 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1309[var36] = var16;
				field1310[var36++] = var17;
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

			var30 = field1270[var16][var17];
		}

		if (var36 <= 0) {
			if (arg4 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1309[var36];
		int var33 = field1310[var36];

		if (arg4 == 0) {
			field1174.method205(181);
			field1174.method206(var31 + var31 + 3);
		}

		if (arg4 == 1) {
			field1174.method205(165);
			field1174.method206(var31 + var31 + 3 + 14);
		}

		if (arg4 == 2) {
			field1174.method205(93);
			field1174.method206(var31 + var31 + 3);
		}

		if (field20[5] == 1) {
			field1174.method206(1);
		} else {
			field1174.method206(0);
		}

		field1174.method207(field992 + var32);
		field1174.method207(field993 + var33);
		field1249 = field1309[0];
		field1250 = field1310[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1174.method206(field1309[var36] - var32);
			field1174.method206(field1310[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.b(Lkb;II)V")
	public final void method421(class37 arg0, int arg1) {
		field1236 = 0;
		field1106 = 0;
		method485(arg0, arg1);
		method469(arg0, arg1);
		method381(arg1, arg0);
		method459(arg0, arg1);

		for (int var3 = 0; var3 < field1236; var3++) {
			int var4 = field1237[var3];
			if (field1316 != field1103[var4].field314) {
				field1103[var4] = null;
			}
		}

		if (arg0.field543 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field543 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1104; var5++) {
			if (field1103[field1105[var5]] == null) {
				signlink.reporterror(field965 + " null entry in pl list - pos:" + var5 + " size:" + field1104);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIBII)Z")
	public final boolean method422(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field1284.method82(field978, arg0, arg2, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class53 var9 = class53.method282(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field709;
				var11 = var9.field710;
			} else {
				var10 = var9.field710;
				var11 = var9.field709;
			}

			int var12 = var9.field733;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method420(var10, arg0, false, var11, 2, field1007.field319[0], 0, var12, field1007.field318[0], arg2, 0);
		} else {
			method420(0, arg0, false, 0, 2, field1007.field319[0], var8, 0, field1007.field318[0], arg2, var7 + 1);
		}

		field1094 = field18;
		field1095 = field19;
		field1097 = 2;
		field1096 = 0;
		field1174.method205(arg1);
		field1174.method207(field992 + arg0);
		field1174.method207(field993 + arg2);
		field1174.method207(var5);
		return true;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method423() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1195[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1195[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1196[var10] = (field1195[var10 - 1] + field1195[var10 + 1] + field1195[var10 - 128] + field1195[var10 + 128]) / 4;
			}
		}

		field1136 += 128;
		if (field1136 > field1170.length) {
			field1136 -= field1170.length;
			int var11 = (int) (Math.random() * 12.0D);
			method427(field1117[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1196[var14 + 128] - field1170[field1136 + var14 & field1170.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1195[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1168[var16] = field1168[var16 + 1];
		}

		field1168[var1 - 1] = (int) (Math.sin(field1316 / 14.0D) * 16.0D + Math.sin(field1316 / 15.0D) * 14.0D + Math.sin(field1316 / 16.0D) * 12.0D);

		if (field1071 > 0) {
			field1071 -= 4;
		}

		if (field1072 > 0) {
			field1072 -= 4;
		}

		if (field1071 == 0 && field1072 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1071 = 1024;
			}

			if (var17 == 1) {
				field1072 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IZI)Z")
	public final boolean method424(int arg0, int arg1) {
		boolean var3 = false;
		class60 var4 = class60.field835[arg1];
		for (int var5 = 0; var5 < var4.field856.length && var4.field856[var5] != -1; var5++) {
			class60 var6 = class60.field835[var4.field856[var5]];
			if (var6.field842 == 1) {
				var3 |= method424(arg0, var6.field840);
			}

			if (var6.field842 == 6 && (var6.field883 != -1 || var6.field884 != -1)) {
				boolean var7 = method399(var6);
				int var8;
				if (var7) {
					var8 = var6.field884;
				} else {
					var8 = var6.field883;
				}

				if (var8 != -1) {
					class62 var9 = class62.field901[var8];
					var6.field839 += arg0;
					while (var6.field839 > var9.field905[var6.field838]) {
						var6.field839 -= var9.field905[var6.field838] + 1;
						var6.field838++;
						if (var6.field838 >= var9.field902) {
							var6.field838 -= var9.field906;
							if (var6.field838 < 0 || var6.field838 >= var9.field902) {
								var6.field838 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.e(B)Z")
	public final boolean method425() {
		if (field1041 == null) {
			return false;
		}

		try {
			int var1 = field1041.method31();
			if (var1 == 0) {
				return false;
			}

			if (field1243 == -1) {
				field1041.method32(field1161.field542, 0, 1);
				field1243 = field1161.field542[0] & 0xFF;
				if (field1334 != null) {
					field1243 = field1243 - field1334.method253() & 0xFF;
				}

				field1242 = class56.field808[field1243];
				var1--;
			}

			if (field1242 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1041.method32(field1161.field542, 0, 1);
				field1242 = field1161.field542[0] & 0xFF;
				var1--;
			}

			if (field1242 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1041.method32(field1161.field542, 0, 2);
				field1161.field543 = 0;
				field1242 = field1161.method218();
				var1 -= 2;
			}

			if (var1 < field1242) {
				return false;
			}

			field1161.field543 = 0;
			field1041.method32(field1161.field542, 0, field1242);
			field1244 = 0;
			field1235 = field1234;
			field1234 = field1233;
			field1233 = field1243;

			if (field1243 == 133) {
				class37 var2 = class5.method37();
				if (var2 != null) {
					field1174.method205(81);
					field1174.method207(var2.field543);
					field1174.method214(var2.field543, var2.field542, 0);
					var2.method204();
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 139) {
				field1273 = field1161.method218();
				field1243 = -1;
				return true;
			}

			if (field1243 == 142) {
				method491();
				field1243 = -1;
				return false;
			}

			if (field1243 == 168) {
				int var3 = field1161.method218();
				method490(var3);

				if (field976 != -1) {
					field976 = -1;
					field1151 = true;
					field1197 = true;
				}

				if (field1320 != -1) {
					field1320 = -1;
					field949 = true;
				}

				if (field1290) {
					field1290 = false;
					field949 = true;
				}

				field1238 = var3;
				field1340 = false;
				field1243 = -1;
				return true;
			}

			if (field1243 == 243) {
				field1129 = false;
				field1290 = true;
				field1274 = "";
				field949 = true;
				field1243 = -1;
				return true;
			}

			if (field1243 == 103) {
				int var4 = field1161.method218();
				int var5 = field1161.method218();
				int var6 = field1161.method218();
				class60 var7 = class60.field835[var4];
				class31 var8 = var7.field881;
				if (var8 != null) {
					var8.method134(var5, var6);
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 204) {
				int var9 = field1161.method218();
				int var10 = field1161.method218();
				class54 var11 = class54.method288(var10);
				class60.field835[var9].field881 = var11.method291();
				field1243 = -1;
				return true;
			}

			if (field1243 == 46) {
				int var12 = field1161.method218();
				int var13 = field1161.method218();
				int var14 = field1161.method218();
				class55 var15 = class55.method294(var13);
				class60.field835[var12].field881 = var15.method298(50);
				class60.field835[var12].field886 = var15.field778;
				class60.field835[var12].field887 = var15.field779;
				class60.field835[var12].field885 = var15.field777 * 100 / var14;
				field1243 = -1;
				return true;
			}

			if (field1243 == 74) {
				field957 = true;
				field1327 = field1161.method216();
				field1328 = field1161.method216();
				field1329 = field1161.method218();
				field1330 = field1161.method216();
				field1331 = field1161.method216();
				if (field1331 >= 100) {
					int var16 = field1327 * 128 + 64;
					int var17 = field1328 * 128 + 64;
					int var18 = method382(field1327, field978, field1328) - field1329;
					int var19 = var16 - field1119;
					int var20 = var18 - field1120;
					int var21 = var17 - field1121;
					int var22 = (int) Math.sqrt(var19 * var19 + var21 * var21);
					field1122 = (int) (Math.atan2(var20, var22) * 325.949D) & 0x7FF;
					field1123 = (int) (Math.atan2(var19, var21) * -325.949D) & 0x7FF;

					if (field1122 < 128) {
						field1122 = 128;
					}

					if (field1122 > 383) {
						field1122 = 383;
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 226) {
				class5.method34();
				field1243 = -1;
				return true;
			}

			if (field1243 == 43) {
				field1091 = field1161.method218() * 30;
				field1243 = -1;
				return true;
			}

			if (field1243 == 22) {
				if (field1277 == 12) {
					field1151 = true;
				}

				field1179 = field1161.method219();
				field1243 = -1;
				return true;
			}

			if (field1243 == 140) {
				field1166 = field1161.method221();
				field1045 = field1161.method218();
				field1003 = field1161.method216();
				field1335 = field1161.method218();

				if (field1166 != 0 && field1238 == -1) {
					signlink.dnslookup(class48.method261(field1166));
					method393();
					short var23 = 650;
					if (field1003 != 201) {
						var23 = 655;
					}

					field1282 = "";
					field1065 = false;

					for (int var24 = 0; var24 < class60.field835.length; var24++) {
						if (class60.field835[var24] != null && class60.field835[var24].field844 == var23) {
							field1238 = class60.field835[var24].field841;
							break;
						}
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 132) {
				int var25 = field1161.method216();
				int var26 = field1161.method216();
				int var27 = field1161.method218();
				int var28 = field1161.method218();
				int var29 = -1;
				for (int var30 = 0; var30 < field1056.length; var30++) {
					if ((var25 << 8) + var26 == field1056[var30]) {
						var29 = var30;
					}
				}

				if (var29 != -1) {
					if (field1268[var29] == null || field1268[var29].length != var28) {
						field1268[var29] = new byte[var28];
					}

					field1161.method225(var27, field1242 - 6, field1268[var29]);
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 44) {
				field1151 = true;
				int var31 = field1161.method216();
				int var32 = field1161.method221();
				int var33 = field1161.method216();
				field1055[var31] = var32;
				field1118[var31] = var33;
				field1187[var31] = 1;
				for (int var34 = 0; var34 < 98; var34++) {
					if (var32 >= field1217[var34]) {
						field1187[var31] = var34 + 2;
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 197) {
				int var35 = field1161.method218();
				class60.field835[var35].field881 = field1007.method116();
				field1243 = -1;
				return true;
			}

			if (field1243 == 20) {
				int var36 = field1161.method216();
				int var37 = field1161.method216();
				int var38 = -1;
				for (int var39 = 0; var39 < field1056.length; var39++) {
					if ((var36 << 8) + var37 == field1056[var39]) {
						var38 = var39;
					}
				}

				if (var38 != -1) {
					signlink.cachesave("l" + var36 + "_" + var37, field969[var38]);
					field1126 = 1;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 1) {
				method478(field1242, field1161);
				field1243 = -1;
				return true;
			}

			if (field1243 == 195) {
				int var40 = field1161.method218();
				method490(var40);

				if (field1320 != -1) {
					field1320 = -1;
					field949 = true;
				}

				if (field1290) {
					field1290 = false;
					field949 = true;
				}

				field976 = var40;
				field1151 = true;
				field1197 = true;
				field1238 = -1;
				field1340 = false;
				field1243 = -1;
				return true;
			}

			if (field1243 == 146) {
				int var41 = field1161.method218();
				int var42 = field1161.method218();
				class60.field835[var41].field883 = var42;
				field1243 = -1;
				return true;
			}

			if (field1243 == 28) {
				int var43 = field1161.method218();
				int var44 = field1161.method218();

				if (field1320 != -1) {
					field1320 = -1;
					field949 = true;
				}

				if (field1290) {
					field1290 = false;
					field949 = true;
				}

				field1238 = var43;
				field976 = var44;
				field1151 = true;
				field1197 = true;
				field1340 = false;
				field1243 = -1;
				return true;
			}

			if (field1243 == 209) {
				int var45 = field1161.method218();
				int var46 = field1161.method219();
				int var47 = field1161.method219();
				class60 var48 = class60.field835[var45];
				var48.field847 = var46;
				var48.field848 = var47;
				field1243 = -1;
				return true;
			}

			if (field1243 == 239) {
				field957 = false;

				for (int var49 = 0; var49 < 5; var49++) {
					field1046[var49] = false;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 7) {
				field1343 = field1161.method216();
				field1344 = field1161.method216();
				field1243 = -1;
				return true;
			}

			if (field1243 == 2) {
				int var50 = field1161.method218();
				int var51 = field1161.method218();
				int var52 = var51 >> 10 & 0x1F;
				int var53 = var51 >> 5 & 0x1F;
				int var54 = var51 & 0x1F;
				class60.field835[var50].field876 = (var54 << 3) + (var52 << 19) + (var53 << 11);
				field1243 = -1;
				return true;
			}

			if (field1243 == 212) {
				if (field1276 && !field1298) {
					int var55 = field1161.method218();
					int var56 = field1161.method221();
					int var57 = field1242 - 6;
					byte[] var58 = new byte[var56];
					class44.method245(var58, var56, field1161.field542, var57, field1161.field543);
					method464(false, var56, var58);
					field1184 = var55;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 167) {
				int var59 = field1161.method218();
				int var60 = field1161.method216();

				if (var59 == 0xFFFF) {
					var59 = -1;
				}

				field1137[var60] = var59;
				field1151 = true;
				field1197 = true;
				field1243 = -1;
				return true;
			}

			if (field1243 == 213) {
				field1151 = true;
				int var61 = field1161.method218();
				class60 var62 = class60.field835[var61];
				while (field1161.field543 < field1242) {
					int var63 = field1161.method216();
					int var64 = field1161.method218();
					int var65 = field1161.method216();
					if (var65 == 255) {
						var65 = field1161.method221();
					}

					if (var63 >= 0 && var63 < var62.field836.length) {
						var62.field836[var63] = var64;
						var62.field837[var63] = var65;
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 21) {
				field1067 = field1242 / 8;
				for (int var66 = 0; var66 < field1067; var66++) {
					field1011[var66] = field1161.method222();
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 87) {
				int var67 = field1161.method218();
				int var68 = field1161.method218();
				class60.field835[var67].field881 = new class31(var68);
				field1243 = -1;
				return true;
			}

			if (field1243 == 32) {
				field1084 = field1161.method216();
				field1317 = field1161.method216();
				field1232 = field1161.method216();
				field1194 = true;
				field949 = true;
				field1243 = -1;
				return true;
			}

			if (field1243 == 220) {
				int var69 = field1161.method216();
				int var70 = field1161.method216();
				int var71 = field1161.method218();
				int var72 = field1161.method218();
				int var73 = -1;
				for (int var74 = 0; var74 < field1056.length; var74++) {
					if ((var69 << 8) + var70 == field1056[var74]) {
						var73 = var74;
					}
				}

				if (var73 != -1) {
					if (field969[var73] == null || field969[var73].length != var72) {
						field969[var73] = new byte[var72];
					}

					field1161.method225(var71, field1242 - 6, field969[var73]);
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 129) {
				if (field976 != -1) {
					field976 = -1;
					field1151 = true;
					field1197 = true;
				}

				if (field1320 != -1) {
					field1320 = -1;
					field949 = true;
				}

				if (field1290) {
					field1290 = false;
					field949 = true;
				}

				field1238 = -1;
				field1340 = false;
				field1243 = -1;
				return true;
			}

			if (field1243 == 152) {
				long var75 = field1161.method222();
				int var77 = field1161.method216();
				String var78 = class48.method262(class48.method259(var75));
				for (int var79 = 0; var79 < field1010; var79++) {
					if (field1204[var79] == var75) {
						if (field1291[var79] != var77) {
							field1291[var79] = var77;
							field1151 = true;

							if (var77 > 0) {
								method391(5, "", var78 + " has logged in.");
							}

							if (var77 == 0) {
								method391(5, "", var78 + " has logged out.");
							}
						}

						var78 = null;
						break;
					}
				}

				if (var78 != null && field1010 < 100) {
					field1204[field1010] = var75;
					field1085[field1010] = var78;
					field1291[field1010] = var77;
					field1010++;
					field1151 = true;
				}

				boolean var80 = false;
				while (!var80) {
					var80 = true;
					for (int var81 = 0; var81 < field1010 - 1; var81++) {
						if (field1291[var81] != field1295 && field1291[var81 + 1] == field1295 || field1291[var81] == 0 && field1291[var81 + 1] != 0) {
							int var82 = field1291[var81];
							field1291[var81] = field1291[var81 + 1];
							field1291[var81 + 1] = var82;
							String var83 = field1085[var81];
							field1085[var81] = field1085[var81 + 1];
							field1085[var81 + 1] = var83;
							long var84 = field1204[var81];
							field1204[var81] = field1204[var81 + 1];
							field1204[var81 + 1] = var84;
							field1151 = true;
							var80 = false;
						}
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 98) {
				field1151 = true;
				int var86 = field1161.method218();
				class60 var87 = class60.field835[var86];
				int var88 = field1161.method216();
				for (int var89 = 0; var89 < var88; var89++) {
					var87.field836[var89] = field1161.method218();
					int var90 = field1161.method216();
					if (var90 == 255) {
						var90 = field1161.method221();
					}

					var87.field837[var89] = var90;
				}

				for (int var91 = var88; var91 < var87.field836.length; var91++) {
					var87.field836[var91] = 0;
					var87.field837[var91] = 0;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 68) {
				if (field1277 == 12) {
					field1151 = true;
				}

				field1201 = field1161.method216();
				field1243 = -1;
				return true;
			}

			if (field1243 == 19) {
				field1249 = 0;
				field1243 = -1;
				return true;
			}

			if (field1243 == 136) {
				for (int var92 = 0; var92 < field1103.length; var92++) {
					if (field1103[var92] != null) {
						field1103[var92].field297 = -1;
					}
				}

				for (int var93 = 0; var93 < field1098.length; var93++) {
					if (field1098[var93] != null) {
						field1098[var93].field297 = -1;
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 135) {
				field1343 = field1161.method216();
				field1344 = field1161.method216();
				for (int var94 = field1343; var94 < field1343 + 8; var94++) {
					for (int var95 = field1344; var95 < field1344 + 8; var95++) {
						if (field1138[field978][var94][var95] != null) {
							field1138[field978][var94][var95] = null;
							method398(var94, var95);
						}
					}
				}

				for (class38 var96 = (class38) field1336.method235(); var96 != null; var96 = (class38) field1336.method237()) {
					if (var96.field556 >= field1343 && var96.field556 < field1343 + 8 && var96.field557 >= field1344 && var96.field557 < field1344 + 8 && field978 == var96.field554) {
						method436(var96.field554, var96.field555, var96.field563, var96.field561, var96.field557, var96.field556, var96.field562);
						var96.method108();
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 12) {
				int var97 = field1161.method218();
				int var98 = field1161.method216();
				int var99 = field1161.method218();
				if (field1299 && !field1298 && field1115 < 50) {
					field960[field1115] = var97;
					field1341[field1115] = var98;
					field1092[field1115] = class51.field667[var97] + var99;
					field1115++;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 162) {
				field1343 = field1161.method216();
				field1344 = field1161.method216();

				while (field1161.field543 < field1242) {
					int var100 = field1161.method216();
					method418(field1161, var100);
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 184) {
				method421(field1161, field1242);

				if (field1126 == 1) {
					field1126 = 2;
					class3.field26 = field978;
					method476();
				}

				if (field1298 && field1126 == 2 && class3.field26 != field978) {
					field1147.method242();
					field1163.method191(0, "Loading - please wait.", 257, 151);
					field1163.method191(0xFFFFFF, "Loading - please wait.", 256, 150);
					field1147.method243(11, field8, 8);
					class3.field26 = field978;
					method476();
				}

				if (field978 != field1116 && field1126 == 2) {
					field1116 = field978;
					method456(field978);
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 14) {
				int var101 = field1161.method218();
				method490(var101);

				if (field976 != -1) {
					field976 = -1;
					field1151 = true;
					field1197 = true;
				}

				field1320 = var101;
				field949 = true;
				field1238 = -1;
				field1340 = false;
				field1243 = -1;
				return true;
			}

			if (field1243 == 185) {
				int var102 = field1161.method219();
				field1200 = var102;
				field949 = true;
				field1243 = -1;
				return true;
			}

			if (field1243 == 3) {
				field957 = true;
				field1019 = field1161.method216();
				field1020 = field1161.method216();
				field1021 = field1161.method218();
				field1022 = field1161.method216();
				field1023 = field1161.method216();
				if (field1023 >= 100) {
					field1119 = field1019 * 128 + 64;
					field1121 = field1020 * 128 + 64;
					field1120 = method382(field1019, field978, field1020) - field1021;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 4) {
				String var103 = field1161.method223();
				if (var103.endsWith(":tradereq:")) {
					String var104 = var103.substring(0, var103.indexOf(":"));
					long var105 = class48.method258(var104);
					boolean var107 = false;
					for (int var108 = 0; var108 < field1067; var108++) {
						if (field1011[var108] == var105) {
							var107 = true;
							break;
						}
					}

					if (!var107 && field1223 == 0) {
						method391(4, var104, "wishes to trade with you.");
					}
				} else if (var103.endsWith(":duelreq:")) {
					String var109 = var103.substring(0, var103.indexOf(":"));
					long var110 = class48.method258(var109);
					boolean var112 = false;
					for (int var113 = 0; var113 < field1067; var113++) {
						if (field1011[var113] == var110) {
							var112 = true;
							break;
						}
					}

					if (!var112 && field1223 == 0) {
						method391(8, var109, "wishes to duel with you.");
					}
				} else {
					method391(0, "", var103);
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 175) {
				int var114 = field1161.method218();
				int var115 = field1161.method221();
				field1005[var114] = var115;

				if (field967[var114] != var115) {
					field967[var114] = var115;
					method493(var114);
					field1151 = true;

					if (field1200 != -1) {
						field949 = true;
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 25) {
				field1070 = field1161.method216();
				if (field1070 == 1) {
					field1338 = field1161.method218();
				}

				if (field1070 >= 2 && field1070 <= 6) {
					if (field1070 == 2) {
						field982 = 64;
						field983 = 64;
					}

					if (field1070 == 3) {
						field982 = 0;
						field983 = 64;
					}

					if (field1070 == 4) {
						field982 = 128;
						field983 = 64;
					}

					if (field1070 == 5) {
						field982 = 64;
						field983 = 0;
					}

					if (field1070 == 6) {
						field982 = 64;
						field983 = 128;
					}

					field1070 = 2;
					field979 = field1161.method218();
					field980 = field1161.method218();
					field981 = field1161.method216();
				}

				if (field1070 == 10) {
					field1324 = field1161.method218();
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 201) {
				int var116 = field1161.method218();
				String var117 = field1161.method223();
				class60.field835[var116].field874 = var117;

				if (field1137[field1277] == class60.field835[var116].field841) {
					field1151 = true;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 237) {
				int var118 = field1161.method218();
				int var119 = field1161.method218();
				if (field1271 == var118 && field1272 == var119 && field1126 != 0) {
					field1243 = -1;
					return true;
				}

				field1271 = var118;
				field1272 = var119;
				field992 = (field1271 - 6) * 8;
				field993 = (field1272 - 6) * 8;
				field1126 = 1;
				field1147.method242();
				field1163.method191(0, "Loading - please wait.", 257, 151);
				field1163.method191(0xFFFFFF, "Loading - please wait.", 256, 150);
				field1147.method243(11, field8, 8);
				signlink.looprate(5);
				int var120 = (field1242 - 2) / 10;
				field1268 = new byte[var120][];
				field969 = new byte[var120][];
				field1056 = new int[var120];
				field1174.method205(150);
				field1174.method206(0);
				int var121 = 0;
				for (int var122 = 0; var122 < var120; var122++) {
					int var123 = field1161.method216();
					int var124 = field1161.method216();
					int var125 = field1161.method221();
					int var126 = field1161.method221();
					field1056[var122] = (var123 << 8) + var124;

					if (var125 != 0) {
						byte[] var127 = signlink.cacheload("m" + var123 + "_" + var124);
						if (var127 != null) {
							field1192.reset();
							field1192.update(var127);

							if ((int) field1192.getValue() != var125) {
								var127 = null;
							}
						}

						if (var127 == null) {
							field1126 = 0;
							field1174.method206(0);
							field1174.method206(var123);
							field1174.method206(var124);
							var121 += 3;
						} else {
							field1268[var122] = var127;
						}
					}

					if (var126 != 0) {
						byte[] var128 = signlink.cacheload("l" + var123 + "_" + var124);
						if (var128 != null) {
							field1192.reset();
							field1192.update(var128);

							if ((int) field1192.getValue() != var126) {
								var128 = null;
							}
						}

						if (var128 == null) {
							field1126 = 0;
							field1174.method206(1);
							field1174.method206(var123);
							field1174.method206(var124);
							var121 += 3;
						} else {
							field969[var122] = var128;
						}
					}
				}

				field1174.method215(var121);
				signlink.looprate(50);
				field1147.method242();

				if (field1126 == 0) {
					field1163.method191(0, "Map area updated since last visit, so load will take longer this time only", 257, 166);
					field1163.method191(0xFFFFFF, "Map area updated since last visit, so load will take longer this time only", 256, 165);
				}

				field1147.method243(11, field8, 8);
				int var129 = field992 - field994;
				int var130 = field993 - field995;
				field994 = field992;
				field995 = field993;

				for (int var131 = 0; var131 < 8192; var131++) {
					class25 var132 = field1098[var131];
					if (var132 != null) {
						for (int var133 = 0; var133 < 10; var133++) {
							var132.field318[var133] -= var129;
							var132.field319[var133] -= var130;
						}

						var132.field270 -= var129 * 128;
						var132.field271 -= var130 * 128;
					}
				}

				for (int var134 = 0; var134 < field1101; var134++) {
					class26 var135 = field1103[var134];
					if (var135 != null) {
						for (int var136 = 0; var136 < 10; var136++) {
							var135.field318[var136] -= var129;
							var135.field319[var136] -= var130;
						}

						var135.field270 -= var129 * 128;
						var135.field271 -= var130 * 128;
					}
				}

				byte var137 = 0;
				byte var138 = 104;
				byte var139 = 1;
				if (var129 < 0) {
					var137 = 103;
					var138 = -1;
					var139 = -1;
				}

				byte var140 = 0;
				byte var141 = 104;
				byte var142 = 1;
				if (var130 < 0) {
					var140 = 103;
					var141 = -1;
					var142 = -1;
				}

				for (int var143 = var137; var143 != var138; var143 += var139) {
					for (int var144 = var140; var144 != var141; var144 += var142) {
						int var145 = var129 + var143;
						int var146 = var130 + var144;
						for (int var147 = 0; var147 < 4; var147++) {
							if (var145 >= 0 && var146 >= 0 && var145 < 104 && var146 < 104) {
								field1138[var147][var143][var144] = field1138[var147][var145][var146];
							} else {
								field1138[var147][var143][var144] = null;
							}
						}
					}
				}

				for (class38 var148 = (class38) field1336.method235(); var148 != null; var148 = (class38) field1336.method237()) {
					var148.field556 -= var129;
					var148.field557 -= var130;
					if (var148.field556 < 0 || var148.field557 < 0 || var148.field556 >= 104 || var148.field557 >= 104) {
						var148.method108();
					}
				}

				if (field1249 != 0) {
					field1249 -= var129;
					field1250 -= var130;
				}

				field957 = false;
				field1243 = -1;
				return true;
			}

			if (field1243 == 193) {
				for (int var149 = 0; var149 < field967.length; var149++) {
					if (field967[var149] != field1005[var149]) {
						field967[var149] = field1005[var149];
						method493(var149);
						field1151 = true;
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 26) {
				int var150 = field1161.method218();
				boolean var151 = field1161.method216() == 1;
				class60.field835[var150].field855 = var151;
				field1243 = -1;
				return true;
			}

			if (field1243 == 13) {
				int var152 = field1161.method216();
				int var153 = field1161.method216();
				int var154 = field1161.method216();
				int var155 = field1161.method216();
				field1046[var152] = true;
				field1039[var152] = var153;
				field1252[var152] = var154;
				field1109[var152] = var155;
				field1240[var152] = 0;
				field1243 = -1;
				return true;
			}

			if (field1243 == 84) {
				field1277 = field1161.method216();
				field1151 = true;
				field1197 = true;
				field1243 = -1;
				return true;
			}

			if (field1243 == 151 || field1243 == 23 || field1243 == 50 || field1243 == 191 || field1243 == 69 || field1243 == 49 || field1243 == 223 || field1243 == 42 || field1243 == 76 || field1243 == 59) {
				method418(field1161, field1243);
				field1243 = -1;
				return true;
			}

			if (field1243 == 15) {
				int var156 = field1161.method218();
				class60 var157 = class60.field835[var156];
				for (int var158 = 0; var158 < var157.field836.length; var158++) {
					var157.field836[var158] = -1;
					var157.field836[var158] = 0;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 54) {
				String var159 = field1161.method223();
				int var160 = field1161.method221();
				int var161 = field1161.method221();
				if (!var159.equals(field968) && field1276 && !field1298) {
					method481(var159, var160, var161);
				}

				field968 = var159;
				field1321 = var160;
				field1173 = var161;
				field1184 = 0;
				field1243 = -1;
				return true;
			}

			if (field1243 == 254) {
				field1135 = field1161.method216();
				field1243 = -1;
				return true;
			}

			if (field1243 == 126) {
				field1325 = field1161.method216();
				if (field1325 == field1277) {
					if (field1325 == 3) {
						field1277 = 1;
					} else {
						field1277 = 3;
					}

					field1151 = true;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 80) {
				int var162 = field1161.method216();
				int var163 = field1161.method216();
				int var164 = -1;
				for (int var165 = 0; var165 < field1056.length; var165++) {
					if ((var162 << 8) + var163 == field1056[var165]) {
						var164 = var165;
					}
				}

				if (var164 != -1) {
					signlink.cachesave("m" + var162 + "_" + var163, field1268[var164]);
					field1126 = 1;
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 150) {
				int var166 = field1161.method218();
				byte var167 = field1161.method217();
				field1005[var166] = var167;

				if (field967[var166] != var167) {
					field967[var166] = var167;
					method493(var166);
					field1151 = true;

					if (field1200 != -1) {
						field949 = true;
					}
				}

				field1243 = -1;
				return true;
			}

			if (field1243 == 41) {
				long var168 = field1161.method222();
				int var170 = field1161.method221();
				int var171 = field1161.method216();
				boolean var172 = false;
				for (int var173 = 0; var173 < 100; var173++) {
					if (field1190[var173] == var170) {
						var172 = true;
						break;
					}
				}

				if (var171 <= 1) {
					for (int var174 = 0; var174 < field1067; var174++) {
						if (field1011[var174] == var168) {
							var172 = true;
							break;
						}
					}
				}

				if (!var172 && field1223 == 0) {
					try {
						field1190[field1159] = var170;
						field1159 = (field1159 + 1) % 100;
						String var175 = class49.method265(field1242 - 13, field1161);
						var175 = class65.method343(var175);
						if (var171 > 1) {
							method391(7, class48.method262(class48.method259(var168)), var175);
						} else {
							method391(3, class48.method262(class48.method259(var168)), var175);
						}
					} catch (Exception var180) {
						signlink.reporterror("cde1");
					}
				}

				field1243 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1243 + "," + field1242 + " - " + field1234 + "," + field1235);
			method491();
		} catch (IOException var181) {
			method472();
		} catch (Exception var182) {
			String var178 = "T2 - " + field1243 + "," + field1234 + "," + field1235 + " - " + field1242 + "," + (field1007.field318[0] + field992) + "," + (field1007.field319[0] + field993) + " - ";
			for (int var179 = 0; var179 < field1242 && var179 < 50; var179++) {
				var178 = var178 + field1161.field542[var179] + ",";
			}

			signlink.reporterror(var178);
			method491();
		}

		return true;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method10() {
		field1203 = true;
	}

	@ObfuscatedName("client.a(IIIZIILhc;)V")
	public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5) {
		if (arg5.field842 == 0 && arg5.field856 != null && !arg5.field855 && (arg1 >= arg4 && arg0 >= arg2 && arg1 <= arg5.field845 + arg4 && arg0 <= arg5.field846 + arg2)) {
			int var7 = arg5.field856.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field857[var8] + arg4;
				int var10 = arg5.field858[var8] + arg2 - arg3;
				class60 var11 = class60.field835[arg5.field856[var8]];
				var9 += var11.field847;
				var10 += var11.field848;
				if ((var11.field852 >= 0 || var11.field878 != 0) && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field845 + var9 && arg0 < var11.field846 + var10) {
					if (var11.field852 >= 0) {
						field1267 = var11.field852;
					} else {
						field1267 = var11.field840;
					}
				}

				if (var11.field842 == 0) {
					method426(arg0, arg1, var10, var11.field854, var9, var11);

					if (var11.field853 > var11.field846) {
						method384(true, var10, var11.field846, arg1, var11.field853, arg0, var11.field845 + var9, var11);
					}
				} else {
					if (var11.field843 == 1 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field845 + var9 && arg0 < var11.field846 + var10) {
						boolean var12 = false;
						if (var11.field844 != 0) {
							var12 = method449(var11);
						}

						if (!var12) {
							field1130[field1062] = var11.field891;
							field1029[field1062] = 951;
							field1028[field1062] = var11.field840;
							field1062++;
						}
					}

					if (var11.field843 == 2 && field1305 == 0 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field845 + var9 && arg0 < var11.field846 + var10) {
						String var13 = var11.field888;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1130[field1062] = var13 + " @gre@" + var11.field889;
						field1029[field1062] = 930;
						field1028[field1062] = var11.field840;
						field1062++;
					}

					if (var11.field843 == 3 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field845 + var9 && arg0 < var11.field846 + var10) {
						field1130[field1062] = "Close";
						field1029[field1062] = 947;
						field1028[field1062] = var11.field840;
						field1062++;
					}

					if (var11.field843 == 4 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field845 + var9 && arg0 < var11.field846 + var10) {
						field1130[field1062] = var11.field891;
						field1029[field1062] = 465;
						field1028[field1062] = var11.field840;
						field1062++;
					}

					if (var11.field843 == 5 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field845 + var9 && arg0 < var11.field846 + var10) {
						field1130[field1062] = var11.field891;
						field1029[field1062] = 960;
						field1028[field1062] = var11.field840;
						field1062++;
					}

					if (var11.field843 == 6 && !field1340 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field845 + var9 && arg0 < var11.field846 + var10) {
						field1130[field1062] = var11.field891;
						field1029[field1062] = 44;
						field1028[field1062] = var11.field840;
						field1062++;
					}

					if (var11.field842 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field846; var15++) {
							for (int var16 = 0; var16 < var11.field845; var16++) {
								int var17 = (var11.field864 + 32) * var16 + var9;
								int var18 = (var11.field865 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field867[var14];
									var18 += var11.field868[var14];
								}

								if (arg1 >= var17 && arg0 >= var18 && arg1 < var17 + 32 && arg0 < var18 + 32) {
									field958 = var14;
									field959 = var11.field840;

									if (var11.field836[var14] > 0) {
										class55 var19 = class55.method294(var11.field836[var14] - 1);
										if (field984 == 1 && var11.field862) {
											if (field986 != var11.field840 || field985 != var14) {
												field1130[field1062] = "Use " + field988 + " with @lre@" + var19.field773;
												field1029[field1062] = 881;
												field1030[field1062] = var19.field771;
												field1027[field1062] = var14;
												field1028[field1062] = var11.field840;
												field1062++;
											}
										} else if (field1305 != 1 || !var11.field862) {
											if (var11.field862) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field788 != null && var19.field788[var20] != null) {
														field1130[field1062] = var19.field788[var20] + " @lre@" + var19.field773;

														if (var20 == 3) {
															field1029[field1062] = 478;
														}

														if (var20 == 4) {
															field1029[field1062] = 347;
														}

														field1030[field1062] = var19.field771;
														field1027[field1062] = var14;
														field1028[field1062] = var11.field840;
														field1062++;
													} else if (var20 == 4) {
														field1130[field1062] = "Drop @lre@" + var19.field773;
														field1029[field1062] = 347;
														field1030[field1062] = var19.field771;
														field1027[field1062] = var14;
														field1028[field1062] = var11.field840;
														field1062++;
													}
												}
											}

											if (var11.field863) {
												field1130[field1062] = "Use @lre@" + var19.field773;
												field1029[field1062] = 188;
												field1030[field1062] = var19.field771;
												field1027[field1062] = var14;
												field1028[field1062] = var11.field840;
												field1062++;
											}

											if (var11.field862 && var19.field788 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field788[var21] != null) {
														field1130[field1062] = var19.field788[var21] + " @lre@" + var19.field773;

														if (var21 == 0) {
															field1029[field1062] = 405;
														}

														if (var21 == 1) {
															field1029[field1062] = 38;
														}

														if (var21 == 2) {
															field1029[field1062] = 422;
														}

														field1030[field1062] = var19.field771;
														field1027[field1062] = var14;
														field1028[field1062] = var11.field840;
														field1062++;
													}
												}
											}

											if (var11.field869 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field869[var22] != null) {
														field1130[field1062] = var11.field869[var22] + " @lre@" + var19.field773;

														if (var22 == 0) {
															field1029[field1062] = 602;
														}

														if (var22 == 1) {
															field1029[field1062] = 596;
														}

														if (var22 == 2) {
															field1029[field1062] = 22;
														}

														if (var22 == 3) {
															field1029[field1062] = 892;
														}

														if (var22 == 4) {
															field1029[field1062] = 415;
														}

														field1030[field1062] = var19.field771;
														field1027[field1062] = var14;
														field1028[field1062] = var11.field840;
														field1062++;
													}
												}
											}

											field1130[field1062] = "Examine @lre@" + var19.field773;
											field1029[field1062] = 1773;
											field1030[field1062] = var19.field771;
											field1028[field1062] = var11.field837[var14];
											field1062++;
										} else if ((field1307 & 0x10) == 0x10) {
											field1130[field1062] = field1308 + " @lre@" + var19.field773;
											field1029[field1062] = 391;
											field1030[field1062] = var19.field771;
											field1027[field1062] = var14;
											field1028[field1062] = var11.field840;
											field1062++;
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

	@ObfuscatedName("client.a(Lib;I)V")
	public final void method427(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1170.length; var3++) {
			field1170[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1170[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1171[var9] = (field1170[var9 - 1] + field1170[var9 + 1] + field1170[var9 - 128] + field1170[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1170;
			field1170 = field1171;
			field1171 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field527; var12++) {
				for (int var13 = 0; var13 < arg0.field526; var13++) {
					if (arg0.field524[var11++] != 0) {
						int var14 = var13 + arg0.field528 + 16;
						int var15 = var12 + arg0.field529 + 16;
						int var16 = (var15 << 7) + var14;
						field1170[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method428() {
		for (int var1 = -1; var1 < field1104; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1102;
			} else {
				var2 = field1105[var1];
			}

			class26 var3 = field1103[var2];
			if (var3 != null) {
				method374(1, var3);
			}
		}

		field1319++;
		if (field1319 > 1406) {
			field1319 = 0;
			field1174.method205(219);
			field1174.method206(0);
			int var4 = field1174.field543;
			field1174.method206(162);
			field1174.method206(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1174.method206(84);
			}

			field1174.method207(31824);
			field1174.method207(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1174.method206(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1174.method206(134);
			}

			field1174.method206(100);
			field1174.method206(94);
			field1174.method207(35521);
			field1174.method215(field1174.field543 - var4);
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method429(int arg0) {
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

	@ObfuscatedName("client.g(B)V")
	public final void method430() {
		for (class40 var1 = (class40) field1042.method235(); var1 != null; var1 = (class40) field1042.method237()) {
			boolean var2 = false;
			var1.field579 += field1167;

			if (var1.field578 == -1) {
				var1.field578 = 0;
				var2 = true;
			}

			while (var1.field579 > var1.field577.field905[var1.field578]) {
				var1.field579 -= var1.field577.field905[var1.field578] + 1;
				var1.field578++;
				var2 = true;

				if (var1.field578 >= var1.field577.field902) {
					var1.field578 -= var1.field577.field906;
					if (var1.field578 < 0 || var1.field578 >= var1.field577.field902) {
						break;
					}
				}
			}

			var1.method108();
			var2 = false;
			if (var2) {
				int var3 = var1.field572;
				int var4 = var1.field574;
				int var5 = var1.field575;
				int var6 = 0;
				if (var1.field573 == 0) {
					var6 = field1284.method78(var3, var4, var5);
				}

				if (var1.field573 == 1) {
					var6 = field1284.method79(var3, var5, var4);
				}

				if (var1.field573 == 2) {
					var6 = field1284.method80(var3, var4, var5);
				}

				if (var1.field573 == 3) {
					var6 = field1284.method81(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field576) {
					int var7 = field1248[var3][var4][var5];
					int var8 = field1248[var3][var4 + 1][var5];
					int var9 = field1248[var3][var4 + 1][var5 + 1];
					int var10 = field1248[var3][var4][var5 + 1];
					class53 var11 = class53.method282(var1.field576);
					int var12 = -1;
					if (var1.field578 != -1) {
						var12 = var1.field577.field903[var1.field578];
					}

					if (var1.field573 == 2) {
						int var13 = field1284.method82(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						class31 var16 = var11.method285(var14, var15, var7, var8, var9, var10, var12);
						field1284.method67(var3, var5, var16, var4);
					} else if (var1.field573 == 1) {
						class31 var17 = var11.method285(4, 0, var7, var8, var9, var10, var12);
						field1284.method69(var3, var17, var4, var5);
					} else if (var1.field573 == 0) {
						int var18 = field1284.method82(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							class31 var22 = var11.method285(2, var20 + 4, var7, var8, var9, var10, var12);
							class31 var23 = var11.method285(2, var21, var7, var8, var9, var10, var12);
							field1284.method72(var23, var3, var22, var5, var4);
						} else {
							class31 var24 = var11.method285(var19, var20, var7, var8, var9, var10, var12);
							field1284.method71(var4, var24, var5, var3);
						}
					} else if (var1.field573 == 3) {
						int var25 = field1284.method82(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						class31 var27 = var11.method285(22, var26, var7, var8, var9, var10, var12);
						field1284.method70(var4, var5, var27, var3);
					}
				} else {
					var1.method108();
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method431() {
		short var1 = 256;

		if (field1071 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1071 > 768) {
					field1311[var2] = method473(1024 - field1071, field1313[var2], field1312[var2]);
				} else if (field1071 > 256) {
					field1311[var2] = field1313[var2];
				} else {
					field1311[var2] = method473(256 - field1071, field1312[var2], field1313[var2]);
				}
			}
		} else if (field1072 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1072 > 768) {
					field1311[var3] = method473(1024 - field1072, field1314[var3], field1312[var3]);
				} else if (field1072 > 256) {
					field1311[var3] = field1314[var3];
				} else {
					field1311[var3] = method473(256 - field1072, field1312[var3], field1314[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1311[var4] = field1312[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1078.field583[var5] = field1068.field517[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1168[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1195[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1311[var12];
					int var15 = field1078.field583[var7];
					field1078.field583[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1078.method243(0, field8, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1079.field583[var16] = field1069.field517[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1168[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1195[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1311[var23];
					int var26 = field1079.field583[var18];
					field1079.field583[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1079.method243(0, field8, 661);
	}

	public final void init() {
		field1295 = Integer.parseInt(getParameter("nodeid"));
		field1296 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method407();
		} else {
			method440();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1297 = false;
		} else {
			field1297 = true;
		}

		method2(532, 789);
	}

	@ObfuscatedName("client.y(I)V")
	public final void method432() {
		for (class28 var1 = (class28) field1293.method235(); var1 != null; var1 = (class28) field1293.method237()) {
			if (field978 != var1.field370 || var1.field376) {
				var1.method108();
			} else if (field1316 >= var1.field369) {
				var1.method119(field1167);

				if (var1.field376) {
					var1.method108();
				} else {
					field1284.method62(var1, null, false, var1.field373, 60, 0, var1.field372, var1.field370, var1.field371, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method433() {
		if (field1075 == null) {
			field9 = null;
			field1148 = null;
			field1146 = null;
			field1145 = null;
			field1147 = null;
			field1254 = null;
			field1255 = null;
			field1256 = null;
			field1078 = new class43(265, 128, method11());
			class32.method149();
			field1079 = new class43(265, 128, method11());
			class32.method149();
			field1075 = new class43(186, 533, method11());
			class32.method149();
			field1076 = new class43(146, 360, method11());
			class32.method149();
			field1077 = new class43(200, 360, method11());
			class32.method149();
			field1080 = new class43(267, 214, method11());
			class32.method149();
			field1081 = new class43(267, 215, method11());
			class32.method149();
			field1082 = new class43(79, 86, method11());
			class32.method149();
			field1083 = new class43(79, 87, method11());
			class32.method149();

			if (field950 != null) {
				method434();
				method483();
			}

			field1203 = true;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method434() {
		byte[] var1 = field950.method257(null, "title.dat");
		class34 var2 = new class34(var1, this);
		field1078.method242();
		var2.method173(0, 0);
		field1079.method242();
		var2.method173(0, -661);
		field1075.method242();
		var2.method173(0, -128);
		field1076.method242();
		var2.method173(-386, -214);
		field1077.method242();
		var2.method173(-186, -214);
		field1080.method242();
		var2.method173(-265, 0);
		field1081.method242();
		var2.method173(-265, -574);
		field1082.method242();
		var2.method173(-186, -128);
		field1083.method242();
		var2.method173(-186, -574);
		int[] var3 = new int[var2.field518];
		for (int var4 = 0; var4 < var2.field519; var4++) {
			for (int var5 = 0; var5 < var2.field518; var5++) {
				var3[var5] = var2.field517[var2.field518 * var4 + var2.field518 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field518; var6++) {
				var2.field517[var2.field518 * var4 + var6] = var3[var6];
			}
		}

		field1078.method242();
		var2.method173(0, 394);
		field1079.method242();
		var2.method173(0, -267);
		field1075.method242();
		var2.method173(0, 266);
		field1076.method242();
		var2.method173(-386, 180);
		field1077.method242();
		var2.method173(-186, 180);
		field1080.method242();
		var2.method173(-265, 394);
		field1081.method242();
		var2.method173(-265, -180);
		field1082.method242();
		var2.method173(-186, 212);
		field1083.method242();
		var2.method173(-186, -180);
		class34 var7 = new class34(field950, "logo", 0);
		field1075.method242();
		var7.method175(field6 / 2 - var7.field518 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ZI)Z")
	public final boolean method435(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1029[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	public final void run() {
		if (field1221) {
			method477();
		} else if (field1292) {
			method457();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg4 >= 1 && arg5 <= 102 && arg4 <= 102) {
			if (field1298 && field978 != arg0) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field1284.method78(arg0, arg5, arg4);
			}

			if (arg1 == 1) {
				var8 = field1284.method79(arg0, arg4, arg5);
			}

			if (arg1 == 2) {
				var8 = field1284.method80(arg0, arg5, arg4);
			}

			if (arg1 == 3) {
				var8 = field1284.method81(arg0, arg5, arg4);
			}

			if (var8 != 0) {
				int var12 = field1284.method82(arg0, arg5, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field1284.method73(arg4, arg5, arg0);
					class53 var16 = class53.method282(var13);
					if (var16.field711) {
						field1318[arg0].method307(arg5, arg4, var16.field712, var14, var15);
					}
				}

				if (arg1 == 1) {
					field1284.method74(arg0, arg5, arg4);
				}

				if (arg1 == 2) {
					field1284.method75(arg0, arg4, arg5);
					class53 var17 = class53.method282(var13);
					if (var17.field709 + arg5 > 103 || var17.field709 + arg4 > 103 || var17.field710 + arg5 > 103 || var17.field710 + arg4 > 103) {
						return;
					}

					if (var17.field711) {
						field1318[arg0].method308(arg5, arg4, var17.field710, var15, var17.field712, var17.field709);
					}
				}

				if (arg1 == 3) {
					field1284.method76(arg4, arg5, arg0);
					class53 var18 = class53.method282(var13);
					if (var18.field711 && var18.field713) {
						field1318[arg0].method310(arg5, arg4);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field1063[1][arg5][arg4] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				class3.method28(arg2, arg3, field1042, arg0, arg5, arg4, field1318[arg0], field1284, var19, arg6, field1248);
				return;
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method437() {
		if (field1016 == 0) {
			int var1 = field17;
			if (field1305 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field1182) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field1086 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1086 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field1086 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field1087 - 10 || var2 > field1089 + field1087 + 10 || var3 < field1088 - 10 || var3 > field1090 + field1088 + 10) {
						field1182 = false;

						if (field1086 == 1) {
							field1151 = true;
						}

						if (field1086 == 2) {
							field949 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1087;
					int var5 = field1088;
					int var6 = field1089;
					int var7 = field18;
					int var8 = field19;
					if (field1086 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1086 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field1086 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1062; var10++) {
						int var11 = (field1062 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method454(var9);
					}

					field1182 = false;

					if (field1086 == 1) {
						field1151 = true;
					}

					if (field1086 == 2) {
						field949 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1062 > 0) {
					int var12 = field1029[field1062 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = field1027[field1062 - 1];
						int var14 = field1028[field1062 - 1];
						class60 var15 = class60.field835[var14];
						if (var15.field861) {
							field1178 = false;
							field1044 = 0;
							field1014 = var14;
							field1015 = var13;
							field1016 = 2;
							field1017 = field18;
							field1018 = field19;

							if (class60.field835[var14].field841 == field1238) {
								field1016 = 1;
							}

							if (class60.field835[var14].field841 == field1320) {
								field1016 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1031 == 1 || method435(field1062 - 1)) && field1062 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1062 > 0) {
					method454(field1062 - 1);
				}

				if (var1 != 2 || field1062 <= 0) {
					return;
				}

				method419();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;III)Lub;")
	public final class47 method438(String arg0, String arg1, int arg2, int arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg1);
		if (var6 != null) {
			field1192.reset();
			field1192.update(var6);
			int var7 = (int) field1192.getValue();
			if (arg2 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class47(var6);
		}

		while (var6 == null) {
			method13("Requesting " + arg0, arg3);

			try {
				int var9 = 0;
				DataInputStream var10 = method386(arg1 + arg2);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				class37 var12 = new class37(var11);
				var12.field543 = 3;
				int var13 = var12.method220() + 6;
				int var14 = 6;
				var6 = new byte[var13];
				for (int var15 = 0; var15 < 6; var15++) {
					var6[var15] = var11[var15];
				}

				while (var14 < var13) {
					int var16 = var13 - var14;
					if (var16 > 1000) {
						var16 = 1000;
					}

					var14 += var10.read(var6, var14, var16);
					int var17 = var14 * 100 / var13;
					if (var9 != var17) {
						method13("Loading " + arg0 + " - " + var17 + "%", arg3);
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					method13("Error loading - Will retry in " + var18 + " secs.", arg3);

					try {
						Thread.sleep(1000L);
					} catch (Exception var20) {
					}
				}

				var5 *= 2;
				if (var5 > 60) {
					var5 = 60;
				}
			}
		}

		signlink.cachesave(arg1, var6);
		return new class47(var6);
	}

	@ObfuscatedName("client.B(I)V")
	public final void method439() {
		int var1 = field1087;
		int var2 = field1088;
		int var3 = field1089;
		int var4 = field1090;
		int var5 = 0x5D5447;
		class32.method150(var2, var3, var5, var1, var4);
		class32.method150(var2 + 1, var3 - 2, 0, var1 + 1, 16);
		class32.method151(var4 - 19, var3 - 2, 0, var1 + 1, var2 + 18);
		field1164.method194(var1 + 3, "Choose Option", var2 + 14, var5);
		int var6 = field15;
		int var7 = field16;
		if (field1086 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1086 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field1086 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field1062; var8++) {
			int var9 = (field1062 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1164.method196(var1 + 3, true, field1130[var8], var10, var9);
		}
	}

	@ObfuscatedName("client.C(I)V")
	public static final void method440() {
		class18.field196 = false;
		class33.field494 = false;
		field1298 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method441() {
		field1146.method242();
		int var1 = field1287 + field1279 & 0x7FF;
		int var2 = field1007.field270 / 32 + 48;
		int var3 = 464 - field1007.field271 / 32;
		field1251.method181(21, 9, field1230 + 256, 151, var3, var1, 146, field977, field1326, var2);
		field1220.method181(0, 0, 256, 33, 25, field1287, 33, field997, field1339, 25);

		for (int var4 = 0; var4 < field1141; var4++) {
			int var5 = field1142[var4] * 4 + 2 - field1007.field270 / 32;
			int var6 = field1143[var4] * 4 + 2 - field1007.field271 / 32;
			method417(var6, var5, field1323[var4]);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class41 var9 = field1138[field978][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1007.field270 / 32;
					int var11 = var8 * 4 + 2 - field1007.field271 / 32;
					method417(var11, var10, field1035);
				}
			}
		}

		for (int var12 = 0; var12 < field1099; var12++) {
			class25 var13 = field1098[field1100[var12]];
			if (var13 != null && var13.method112() && var13.field322.field760) {
				int var14 = var13.field270 / 32 - field1007.field270 / 32;
				int var15 = var13.field271 / 32 - field1007.field271 / 32;
				method417(var15, var14, field1036);
			}
		}

		for (int var16 = 0; var16 < field1104; var16++) {
			class26 var17 = field1103[field1105[var16]];
			if (var17 != null && var17.method112()) {
				int var18 = var17.field270 / 32 - field1007.field270 / 32;
				int var19 = var17.field271 / 32 - field1007.field271 / 32;
				boolean var20 = false;
				long var21 = class48.method258(var17.field323);
				for (int var23 = 0; var23 < field1010; var23++) {
					if (field1204[var23] == var21 && field1291[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method417(var19, var18, field1038);
				} else {
					method417(var19, var18, field1037);
				}
			}
		}

		if (field1249 != 0) {
			int var24 = field1249 * 4 + 2 - field1007.field270 / 32;
			int var25 = field1250 * 4 + 2 - field1007.field271 / 32;
			method417(var25, var24, field1294);
		}

		class32.method150(82, 3, 0xFFFFFF, 93, 3);
		field1147.method242();
	}

	@ObfuscatedName("client.i(B)Ljava/lang/String;")
	public final String method442() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1284.method78(arg0, arg4, arg3);
		if (var6 != 0) {
			int var7 = field1284.method82(arg0, arg4, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field1251.field517;
			int var12 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class53 var14 = class53.method282(var13);
			if (var14.field724 == -1) {
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
				class35 var15 = field1301[var14.field724];
				if (var15 != null) {
					int var16 = (var14.field709 * 4 - var15.field526) / 2;
					int var17 = (var14.field710 * 4 - var15.field527) / 2;
					var15.method189(arg4 * 4 + var16 + 48, (104 - arg3 - var14.field710) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1284.method80(arg0, arg4, arg3);
		if (var18 != 0) {
			int var19 = field1284.method82(arg0, arg4, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class53 var23 = class53.method282(var22);
			if (var23.field724 != -1) {
				class35 var24 = field1301[var23.field724];
				if (var24 != null) {
					int var25 = (var23.field709 * 4 - var24.field526) / 2;
					int var26 = (var23.field710 * 4 - var24.field527) / 2;
					var24.method189(arg4 * 4 + var25 + 48, (104 - arg3 - var23.field710) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1251.field517;
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

		int var30 = field1284.method81(arg0, arg4, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class53 var32 = class53.method282(var31);
			if (var32.field724 != -1) {
				class35 var33 = field1301[var32.field724];
				if (var33 != null) {
					int var34 = (var32.field709 * 4 - var33.field526) / 2;
					int var35 = (var32.field710 * 4 - var33.field527) / 2;
					var33.method189(arg4 * 4 + var34 + 48, (104 - arg3 - var32.field710) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILz;I)V")
	public final void method444(int arg0, int arg1, int arg2, class26 arg3) {
		if (field1007 != arg3 && field1062 < 400) {
			String var5 = arg3.field323 + method405(arg3.field329, field1007.field329) + " (level-" + arg3.field329 + ")";
			if (field984 == 1) {
				field1130[field1062] = "Use " + field988 + " with @whi@" + var5;
				field1029[field1062] = 367;
				field1030[field1062] = arg0;
				field1027[field1062] = arg1;
				field1028[field1062] = arg2;
				field1062++;
			} else if (field1305 != 1) {
				field1130[field1062] = "Follow @whi@" + var5;
				field1029[field1062] = 1544;
				field1030[field1062] = arg0;
				field1027[field1062] = arg1;
				field1028[field1062] = arg2;
				field1062++;
				if (field1223 == 0) {
					field1130[field1062] = "Trade with @whi@" + var5;
					field1029[field1062] = 1373;
					field1030[field1062] = arg0;
					field1027[field1062] = arg1;
					field1028[field1062] = arg2;
					field1062++;
				}

				if (field1205 > 0) {
					field1130[field1062] = "Attack @whi@" + var5;

					if (field1007.field329 >= arg3.field329) {
						field1029[field1062] = 151;
					} else {
						field1029[field1062] = 2151;
					}

					field1030[field1062] = arg0;
					field1027[field1062] = arg1;
					field1028[field1062] = arg2;
					field1062++;
				}

				if (field1278 == 1) {
					field1130[field1062] = "Fight @whi@" + var5;
					field1029[field1062] = 151;
					field1030[field1062] = arg0;
					field1027[field1062] = arg1;
					field1028[field1062] = arg2;
					field1062++;
				}

				if (field1278 == 2) {
					field1130[field1062] = "Duel-with @whi@" + var5;
					field1029[field1062] = 1101;
					field1030[field1062] = arg0;
					field1027[field1062] = arg1;
					field1028[field1062] = arg2;
					field1062++;
				}
			} else if ((field1307 & 0x8) == 8) {
				field1130[field1062] = field1308 + " @whi@" + var5;
				field1029[field1062] = 651;
				field1030[field1062] = arg0;
				field1027[field1062] = arg1;
				field1028[field1062] = arg2;
				field1062++;
			}

			for (int var6 = 0; var6 < field1062; var6++) {
				if (field1029[var6] == 660) {
					field1130[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method445(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method446() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231 && field1137[0] != -1) {
				field1151 = true;
				field1277 = 0;
				field1197 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231 && field1137[1] != -1) {
				field1151 = true;
				field1277 = 1;
				field1197 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231 && field1137[2] != -1) {
				field1151 = true;
				field1277 = 2;
				field1197 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229 && field1137[3] != -1) {
				field1151 = true;
				field1277 = 3;
				field1197 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231 && field1137[4] != -1) {
				field1151 = true;
				field1277 = 4;
				field1197 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231 && field1137[5] != -1) {
				field1151 = true;
				field1277 = 5;
				field1197 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231 && field1137[6] != -1) {
				field1151 = true;
				field1277 = 6;
				field1197 = true;
			}

			if (field18 >= 550 && field18 <= 584 && field19 >= 492 && field19 < 528 && field1137[7] != -1) {
				field1151 = true;
				field1277 = 7;
				field1197 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529 && field1137[8] != -1) {
				field1151 = true;
				field1277 = 8;
				field1197 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529 && field1137[9] != -1) {
				field1151 = true;
				field1277 = 9;
				field1197 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528 && field1137[10] != -1) {
				field1151 = true;
				field1277 = 10;
				field1197 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529 && field1137[11] != -1) {
				field1151 = true;
				field1277 = 11;
				field1197 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529 && field1137[12] != -1) {
				field1151 = true;
				field1277 = 12;
				field1197 = true;
			}

			if (field18 >= 734 && field18 <= 768 && field19 >= 492 && field19 < 528 && field1137[13] != -1) {
				field1151 = true;
				field1277 = 13;
				field1197 = true;
			}

			field1275++;
			if (field1275 > 150) {
				field1275 = 0;
				field1174.method205(233);
				field1174.method206(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method447(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1067; var3++) {
				if (field1011[var3] == arg0) {
					field1067--;
					field1151 = true;

					for (int var4 = var3; var4 < field1067; var4++) {
						field1011[var4] = field1011[var4 + 1];
					}

					field1174.method205(171);
					field1174.method212(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1041 != null) {
				field1041.method29();
			}
		} catch (Exception var1) {
		}

		field1041 = null;
		method385();
		field973 = false;
		field1174 = null;
		field1239 = null;
		field1161 = null;
		field1056 = null;
		field1268 = null;
		field969 = null;
		field1248 = null;
		field1063 = null;
		field1284 = null;
		field1318 = null;
		field1270 = null;
		field1110 = null;
		field1309 = null;
		field1310 = null;
		field1193 = null;
		field1145 = null;
		field1146 = null;
		field1147 = null;
		field1148 = null;
		field1254 = null;
		field1255 = null;
		field1256 = null;
		field1207 = null;
		field1208 = null;
		field1209 = null;
		field1210 = null;
		field1211 = null;
		field1212 = null;
		field1213 = null;
		field1214 = null;
		field1215 = null;
		field1216 = null;
		field1302 = null;
		field1303 = null;
		field1304 = null;
		field989 = null;
		field990 = null;
		field991 = null;
		field1333 = null;
		field1057 = null;
		field1058 = null;
		field1059 = null;
		field1060 = null;
		field1061 = null;
		field1154 = null;
		field1155 = null;
		field1156 = null;
		field1157 = null;
		field1158 = null;
		field1220 = null;
		field1247 = null;
		field1004 = null;
		field1160 = null;
		field1035 = null;
		field1036 = null;
		field1037 = null;
		field1038 = null;
		field1301 = null;
		field1281 = null;
		field1342 = null;
		field1103 = null;
		field1105 = null;
		field1107 = null;
		field1108 = null;
		field1237 = null;
		field1098 = null;
		field1100 = null;
		field1138 = null;
		field1336 = null;
		field1013 = null;
		field955 = null;
		field1293 = null;
		field1042 = null;
		field1027 = null;
		field1028 = null;
		field1029 = null;
		field1030 = null;
		field1130 = null;
		field967 = null;
		field1142 = null;
		field1143 = null;
		field1323 = null;
		field1251 = null;
		field1085 = null;
		field1204 = null;
		field1291 = null;
		field1078 = null;
		field1079 = null;
		field1075 = null;
		field1076 = null;
		field1077 = null;
		field1080 = null;
		field1081 = null;
		field1082 = null;
		field1083 = null;
		method412();
		class53.method281();
		class54.method287();
		class55.method293();
		class58.field815 = null;
		class59.field828 = null;
		class60.field835 = null;
		class61.field894 = null;
		class62.field901 = null;
		class63.field914 = null;
		class63.field927 = null;
		class64.field929 = null;
		field9 = null;
		class26.field343 = null;
		class33.method154();
		class18.method50();
		class31.method121();
		class6.field68 = null;
		class7.field72 = null;
		System.gc();
	}

	@ObfuscatedName("client.j(B)V")
	public final void method448() {
		if (field1016 == 0) {
			field1130[0] = "Cancel";
			field1029[0] = 1252;
			field1062 = 1;
			method406(field16, field15);
			field1267 = 0;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field1238 == -1) {
					method458();
				} else {
					method426(field16, field15, 11, 0, 8, class60.field835[field1238]);
				}
			}

			if (field999 != field1267) {
				field999 = field1267;
			}

			field1267 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field976 != -1) {
					method426(field16, field15, 231, 0, 562, class60.field835[field976]);
				} else if (field1137[field1277] != -1) {
					method426(field16, field15, 231, 0, 562, class60.field835[field1137[field1277]]);
				}
			}

			if (field1267 != field1034) {
				field1151 = true;
				field1034 = field1267;
			}

			field1267 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 431 && field16 < 471) {
				if (field1320 == -1) {
					method470(field16 - 375, field15 - 22);
				} else {
					method426(field16, field15, 375, 0, 22, class60.field835[field1320]);
				}
			}

			if (field1320 != -1 && field1267 != field1218) {
				field949 = true;
				field1218 = field1267;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1062 - 1; var2++) {
					if (field1029[var2] < 1000 && field1029[var2 + 1] > 1000) {
						String var3 = field1130[var2];
						field1130[var2] = field1130[var2 + 1];
						field1130[var2 + 1] = var3;
						int var4 = field1029[var2];
						field1029[var2] = field1029[var2 + 1];
						field1029[var2 + 1] = var4;
						int var5 = field1027[var2];
						field1027[var2] = field1027[var2 + 1];
						field1027[var2 + 1] = var5;
						int var6 = field1028[var2];
						field1028[var2] = field1028[var2 + 1];
						field1028[var2 + 1] = var6;
						int var7 = field1030[var2];
						field1030[var2] = field1030[var2 + 1];
						field1030[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Lhc;Z)Z")
	public final boolean method449(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1130[field1062] = "Remove @whi@" + field1085[var2];
			field1029[field1062] = 557;
			field1062++;
			field1130[field1062] = "Message @whi@" + field1085[var2];
			field1029[field1062] = 679;
			field1062++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1130[field1062] = "Remove @whi@" + arg0.field874;
			field1029[field1062] = 556;
			field1062++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method450() {
		if (field948 == 0) {
			int var1 = field6 / 2 - 80;
			int var2 = field7 / 2 + 20;
			var2 += 20;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field948 = 3;
				field1026 = 0;
			}

			int var3 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var3 - 75 && field18 <= var3 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1008 = "";
				field1009 = "Enter your username & password.";
				field948 = 2;
				field1026 = 0;
			}
		} else if (field948 == 2) {
			int var4 = field7 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1026 = 0;
			}

			var4 += 15;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1026 = 1;
			}

			var4 += 15;
			int var5 = field6 / 2 - 80;
			int var6 = field7 / 2 + 50;
			var6 += 20;
			if (field17 == 1 && field18 >= var5 - 75 && field18 <= var5 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				method410(field965, field966, false);
			}

			int var7 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var7 - 75 && field18 <= var7 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				field948 = 0;
				field965 = "";
				field966 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1025.length(); var10++) {
					if (var8 == field1025.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1026 == 0) {
					if (var8 == 8 && field965.length() > 0) {
						field965 = field965.substring(0, field965.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1026 = 1;
					}

					if (var9) {
						field965 = field965 + (char) var8;
					}

					if (field965.length() > 12) {
						field965 = field965.substring(0, 12);
					}
				} else if (field1026 == 1) {
					if (var8 == 8 && field966.length() > 0) {
						field966 = field966.substring(0, field966.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1026 = 0;
					}

					if (var9) {
						field966 = field966 + (char) var8;
					}

					if (field966.length() > 20) {
						field966 = field966.substring(0, 20);
					}
				}
			}
		} else if (field948 == 3) {
			int var11 = field6 / 2;
			int var12 = field7 / 2 + 50;
			var12 += 20;
			if (field17 == 1 && field18 >= var11 - 75 && field18 <= var11 + 75 && field19 >= var12 - 20 && field19 <= var12 + 20) {
				field948 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method13(String arg0, int arg1) {
		method433();

		if (field950 == null) {
			super.method13(arg0, arg1);
		} else {
			field1077.method242();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1164.method191(0xFFFFFF, "RuneScape is loading - please wait...", var3 / 2, var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			class32.method151(34, 304, 0x8C1111, var3 / 2 - 152, var6);
			class32.method151(32, 302, 0, var3 / 2 - 151, var6 + 1);
			class32.method150(var6 + 2, arg1 * 3, 0x8C1111, var3 / 2 - 150, 30);
			class32.method150(var6 + 2, 300 - arg1 * 3, 0, arg1 * 3 + var3 / 2 - 150, 30);
			field1164.method191(0xFFFFFF, arg0, var3 / 2, var4 / 2 + 5 - var5);
			field1077.method243(186, field8, 214);

			if (field1203) {
				field1203 = false;

				if (!field1332) {
					field1078.method243(0, field8, 0);
					field1079.method243(0, field8, 661);
				}

				field1075.method243(0, field8, 128);
				field1076.method243(386, field8, 214);
				field1080.method243(265, field8, 0);
				field1081.method243(265, field8, 574);
				field1082.method243(186, field8, 128);
				field1083.method243(186, field8, 574);
			}
		}
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method451(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.F(I)Z")
	public final boolean method452() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.c(II)V")
	public final void method453(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method454(int arg0) {
		if (arg0 >= 0) {
			if (field1290) {
				field1290 = false;
				field949 = true;
			}

			int var2 = field1027[arg0];
			int var3 = field1028[arg0];
			int var4 = field1029[arg0];
			int var5 = field1030[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 951) {
				class60 var6 = class60.field835[var3];
				boolean var7 = true;
				if (var6.field844 > 0) {
					var7 = method484(var6);
				}

				if (var7) {
					field1174.method205(155);
					field1174.method207(var3);
				}
			}

			if (var4 == 900) {
				class25 var8 = field1098[var5];
				if (var8 != null) {
					method420(1, var8.field318[0], false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var8.field319[0], 0);
					field1094 = field18;
					field1095 = field19;
					field1097 = 2;
					field1096 = 0;
					field1174.method205(202);
					field1174.method207(var5);
					field1174.method207(field987);
					field1174.method207(field985);
					field1174.method207(field986);
				}
			}

			if (var4 == 930) {
				class60 var9 = class60.field835[var3];
				field1305 = 1;
				field1306 = var3;
				field1307 = var9.field890;
				field984 = 0;
				String var10 = var9.field888;
				if (var10.indexOf(" ") != -1) {
					var10 = var10.substring(0, var10.indexOf(" "));
				}

				String var11 = var9.field888;
				if (var11.indexOf(" ") != -1) {
					var11 = var11.substring(var11.indexOf(" ") + 1);
				}

				field1308 = var10 + " " + var9.field889 + " " + var11;

				if (field1307 == 16) {
					field1151 = true;
					field1277 = 3;
					field1197 = true;
				}
			} else {
				if (var4 == 465) {
					field1174.method205(155);
					field1174.method207(var3);
					class60 var12 = class60.field835[var3];
					if (var12.field849 != null && var12.field849[0][0] == 5) {
						int var13 = var12.field849[0][1];
						field967[var13] = 1 - field967[var13];
						method493(var13);
						field1151 = true;
					}
				}

				if (var4 == 651) {
					class26 var14 = field1103[var5];
					if (var14 != null) {
						method420(1, var14.field318[0], false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var14.field319[0], 0);
						field1094 = field18;
						field1095 = field19;
						field1097 = 2;
						field1096 = 0;
						field1174.method205(177);
						field1174.method207(var5);
						field1174.method207(field1306);
					}
				}

				if (var4 == 965) {
					boolean var15 = method420(0, var2, false, 0, 2, field1007.field319[0], 0, 0, field1007.field318[0], var3, 0);
					if (!var15) {
						method420(1, var2, false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var3, 0);
					}

					field1094 = field18;
					field1095 = field19;
					field1097 = 2;
					field1096 = 0;
					field1174.method205(138);
					field1174.method207(field992 + var2);
					field1174.method207(field993 + var3);
					field1174.method207(var5);
					field1174.method207(field1306);
				}

				if (var4 == 1607) {
					class25 var17 = field1098[var5];
					if (var17 != null) {
						String var18;
						if (var17.field322.field744 == null) {
							var18 = "It's a " + var17.field322.field743 + ".";
						} else {
							var18 = new String(var17.field322.field744);
						}

						method391(0, "", var18);
					}
				}

				if (var4 == 55 && method422(var2, 9, var3, var5)) {
					field1174.method207(field1306);
				}

				if (var4 == 217) {
					boolean var19 = method420(0, var2, false, 0, 2, field1007.field319[0], 0, 0, field1007.field318[0], var3, 0);
					if (!var19) {
						method420(1, var2, false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var3, 0);
					}

					field1094 = field18;
					field1095 = field19;
					field1097 = 2;
					field1096 = 0;
					field1174.method205(239);
					field1174.method207(field992 + var2);
					field1174.method207(field993 + var3);
					field1174.method207(var5);
					field1174.method207(field987);
					field1174.method207(field985);
					field1174.method207(field986);
				}

				if (var4 == 679) {
					String var21 = field1130[arg0];
					int var22 = var21.indexOf("@whi@");
					if (var22 != -1) {
						long var23 = class48.method258(var21.substring(var22 + 5).trim());
						int var25 = -1;
						for (int var26 = 0; var26 < field1010; var26++) {
							if (field1204[var26] == var23) {
								var25 = var26;
								break;
							}
						}

						if (var25 != -1 && field1291[var25] > 0) {
							field949 = true;
							field1290 = false;
							field1129 = true;
							field1024 = "";
							field1001 = 3;
							field956 = field1204[var25];
							field1169 = "Enter message to send to " + field1085[var25];
						}
					}
				}

				if (var4 == 1501) {
					field1224 += field993;
					if (field1224 >= 92) {
						field1174.method205(66);
						field1174.method210(0);
					}

					method422(var2, 116, var3, var5);
				}

				if (var4 == 1773) {
					class55 var27 = class55.method294(var5);
					String var28;
					if (var3 >= 100000) {
						var28 = var3 + " x " + var27.field773;
					} else if (var27.field774 == null) {
						var28 = "It's a " + var27.field773 + ".";
					} else {
						var28 = new String(var27.field774);
					}

					method391(0, "", var28);
				}

				if (var4 == 947) {
					method393();
				}

				if (var4 == 903 || var4 == 363) {
					String var29 = field1130[arg0];
					int var30 = var29.indexOf("@whi@");
					if (var30 != -1) {
						var29 = var29.substring(var30 + 5).trim();
						String var31 = class48.method262(class48.method259(class48.method258(var29)));
						boolean var32 = false;
						for (int var33 = 0; var33 < field1104; var33++) {
							class26 var34 = field1103[field1105[var33]];
							if (var34 != null && var34.field323 != null && var34.field323.equalsIgnoreCase(var31)) {
								method420(1, var34.field318[0], false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var34.field319[0], 0);

								if (var4 == 903) {
									field1174.method205(206);
								}

								if (var4 == 363) {
									field1174.method205(164);
								}

								field1174.method207(field1105[var33]);
								var32 = true;
								break;
							}
						}

						if (!var32) {
							method391(0, "", "Unable to find " + var31);
						}
					}
				}

				if (var4 == 367) {
					class26 var35 = field1103[var5];
					if (var35 != null) {
						method420(1, var35.field318[0], false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var35.field319[0], 0);
						field1094 = field18;
						field1095 = field19;
						field1097 = 2;
						field1096 = 0;
						field1174.method205(248);
						field1174.method207(var5);
						field1174.method207(field987);
						field1174.method207(field985);
						field1174.method207(field986);
					}
				}

				if (var4 == 660) {
					if (field1182) {
						field1284.method90(var3 - 11, var2 - 8);
					} else {
						field1284.method90(field19 - 11, field18 - 8);
					}
				}

				if (var4 == 34) {
					String var36 = field1130[arg0];
					int var37 = var36.indexOf("@whi@");
					if (var37 != -1) {
						method393();
						field1282 = var36.substring(var37 + 5).trim();
						field1065 = false;

						for (int var38 = 0; var38 < class60.field835.length; var38++) {
							if (class60.field835[var38] != null && class60.field835[var38].field844 == 600) {
								field1175 = field1238 = class60.field835[var38].field841;
								break;
							}
						}
					}
				}

				if (var4 == 364) {
					method422(var2, 96, var3, var5);
				}

				if (var4 == 188) {
					field984 = 1;
					field985 = var2;
					field986 = var3;
					field987 = var5;
					field988 = class55.method294(var5).field773;
					field1305 = 0;
				} else {
					if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
						class25 var39 = field1098[var5];
						if (var39 != null) {
							method420(1, var39.field318[0], false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var39.field319[0], 0);
							field1094 = field18;
							field1095 = field19;
							field1097 = 2;
							field1096 = 0;

							if (var4 == 963) {
								field1174.method205(113);
							}

							if (var4 == 6) {
								if ((var5 & 0x3) == 0) {
									field1300++;
								}

								if (field1300 >= 124) {
									field1174.method205(88);
									field1174.method210(0);
								}

								field1174.method205(27);
							}

							if (var4 == 728) {
								field1174.method205(194);
							}

							if (var4 == 542) {
								field1174.method205(8);
							}

							if (var4 == 245) {
								if ((var5 & 0x3) == 0) {
									field1153++;
								}

								if (field1153 >= 85) {
									field1174.method205(176);
									field1174.method207(39596);
								}

								field1174.method205(100);
							}

							field1174.method207(var5);
						}
					}

					if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
						String var40 = field1130[arg0];
						int var41 = var40.indexOf("@whi@");
						if (var41 != -1) {
							long var42 = class48.method258(var40.substring(var41 + 5).trim());
							if (var4 == 406) {
								method396(var42);
							}

							if (var4 == 436) {
								method414(var42);
							}

							if (var4 == 557) {
								method496(var42);
							}

							if (var4 == 556) {
								method447(var42);
							}
						}
					}

					if (var4 == 450 && method422(var2, 75, var3, var5)) {
						field1174.method207(field987);
						field1174.method207(field985);
						field1174.method207(field986);
					}

					if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
						class26 var44 = field1103[var5];
						if (var44 != null) {
							method420(1, var44.field318[0], false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var44.field319[0], 0);
							field1094 = field18;
							field1095 = field19;
							field1097 = 2;
							field1096 = 0;

							if (var4 == 1101) {
								field1174.method205(164);
							}

							if (var4 == 151) {
								field1128++;
								if (field1128 >= 90) {
									field1174.method205(2);
									field1174.method207(31114);
								}

								field1174.method205(53);
							}

							if (var4 == 1544) {
								field1174.method205(185);
							}

							if (var4 == 1373) {
								field1174.method205(206);
							}

							field1174.method207(var5);
						}
					}

					if (var4 == 581) {
						if ((var5 & 0x3) == 0) {
							field1113++;
						}

						if (field1113 >= 99) {
							field1174.method205(7);
							field1174.method210(0);
						}

						method422(var2, 97, var3, var5);
					}

					if (var4 == 285) {
						method422(var2, 245, var3, var5);
					}

					if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
						if (var4 == 405) {
							field1285 += var5;
							if (field1285 >= 97) {
								field1174.method205(30);
								field1174.method209(0xE42D58);
							}

							field1174.method205(195);
						}

						if (var4 == 38) {
							field1174.method205(71);
						}

						if (var4 == 347) {
							field1174.method205(211);
						}

						if (var4 == 422) {
							field1174.method205(133);
						}

						if (var4 == 478) {
							if ((var2 & 0x3) == 0) {
								field1180++;
							}

							if (field1180 >= 90) {
								field1174.method205(220);
							}

							field1174.method205(157);
						}

						field1174.method207(var5);
						field1174.method207(var2);
						field1174.method207(var3);
						field1226 = 0;
						field1227 = var3;
						field1228 = var2;
						field1229 = 2;
						if (class60.field835[var3].field841 == field1238) {
							field1229 = 1;
						}

						if (class60.field835[var3].field841 == field1320) {
							field1229 = 3;
						}
					}

					if (var4 == 960) {
						field1174.method205(155);
						field1174.method207(var3);
						class60 var45 = class60.field835[var3];
						if (var45.field849 != null && var45.field849[0][0] == 5) {
							int var46 = var45.field849[0][1];
							if (field967[var46] != var45.field851[0]) {
								field967[var46] = var45.field851[0];
								method493(var46);
								field1151 = true;
							}
						}
					}

					if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
						boolean var47 = method420(0, var2, false, 0, 2, field1007.field319[0], 0, 0, field1007.field318[0], var3, 0);
						if (!var47) {
							method420(1, var2, false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var3, 0);
						}

						field1094 = field18;
						field1095 = field19;
						field1097 = 2;
						field1096 = 0;

						if (var4 == 746) {
							field1174.method205(178);
						}

						if (var4 == 877) {
							field1174.method205(247);
						}

						if (var4 == 99) {
							field1174.method205(200);
						}

						if (var4 == 224) {
							field1174.method205(140);
						}

						if (var4 == 993) {
							field1174.method205(40);
						}

						field1174.method207(field992 + var2);
						field1174.method207(field993 + var3);
						field1174.method207(var5);
					}

					if (var4 == 1102) {
						class55 var49 = class55.method294(var5);
						String var50;
						if (var49.field774 == null) {
							var50 = "It's a " + var49.field773 + ".";
						} else {
							var50 = new String(var49.field774);
						}

						method391(0, "", var50);
					}

					if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
						if (var4 == 892) {
							if ((var2 & 0x3) == 0) {
								field1033++;
							}

							if (field1033 >= 130) {
								field1174.method205(238);
								field1174.method206(177);
							}

							field1174.method205(38);
						}

						if (var4 == 22) {
							field1174.method205(212);
						}

						if (var4 == 415) {
							if ((var3 & 0x3) == 0) {
								field1172++;
							}

							if (field1172 >= 55) {
								field1174.method205(17);
								field1174.method210(0);
							}

							field1174.method205(6);
						}

						if (var4 == 596) {
							field1174.method205(59);
						}

						if (var4 == 602) {
							field1174.method205(31);
						}

						field1174.method207(var5);
						field1174.method207(var2);
						field1174.method207(var3);
						field1226 = 0;
						field1227 = var3;
						field1228 = var2;
						field1229 = 2;
						if (class60.field835[var3].field841 == field1238) {
							field1229 = 1;
						}

						if (class60.field835[var3].field841 == field1320) {
							field1229 = 3;
						}
					}

					if (var4 == 504) {
						method422(var2, 172, var3, var5);
					}

					if (var4 == 1175) {
						int var51 = var5 >> 14 & 0x7FFF;
						class53 var52 = class53.method282(var51);
						String var53;
						if (var52.field706 == null) {
							var53 = "It's a " + var52.field705 + ".";
						} else {
							var53 = new String(var52.field706);
						}

						method391(0, "", var53);
					}

					if (var4 == 265) {
						class25 var54 = field1098[var5];
						if (var54 != null) {
							method420(1, var54.field318[0], false, 1, 2, field1007.field319[0], 0, 0, field1007.field318[0], var54.field319[0], 0);
							field1094 = field18;
							field1095 = field19;
							field1097 = 2;
							field1096 = 0;
							field1174.method205(134);
							field1174.method207(var5);
							field1174.method207(field1306);
						}
					}

					if (var4 == 44 && !field1340) {
						field1174.method205(235);
						field1174.method207(var3);
						field1340 = true;
					}

					if (var4 == 391) {
						field1174.method205(48);
						field1174.method207(var5);
						field1174.method207(var2);
						field1174.method207(var3);
						field1174.method207(field1306);
						field1226 = 0;
						field1227 = var3;
						field1228 = var2;
						field1229 = 2;
						if (class60.field835[var3].field841 == field1238) {
							field1229 = 1;
						}

						if (class60.field835[var3].field841 == field1320) {
							field1229 = 3;
						}
					}

					if (var4 == 881) {
						field1174.method205(130);
						field1174.method207(var5);
						field1174.method207(var2);
						field1174.method207(var3);
						field1174.method207(field987);
						field1174.method207(field985);
						field1174.method207(field986);
						field1226 = 0;
						field1227 = var3;
						field1228 = var2;
						field1229 = 2;
						if (class60.field835[var3].field841 == field1238) {
							field1229 = 1;
						}

						if (class60.field835[var3].field841 == field1320) {
							field1229 = 3;
						}
					}

					field984 = 0;
					field1305 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method9() {
		if (field1002 || field961 || field1112) {
			method413();
		} else {
			if (field1000) {
				method380();
			} else {
				method475();
			}

			field1191 = 0;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method455() {
		field1337 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1198[var1] = -1;
			for (int var2 = 0; var2 < class59.field827; var2++) {
				if (!class59.field828[var2].field834 && class59.field828[var2].field829 == var1 + (field1253 ? 0 : 7)) {
					field1198[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method456(int arg0) {
		int[] var2 = field1251.field517;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1063[arg0][var7][var5] & 0x18) == 0) {
					field1284.method87(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1063[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1284.method87(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1251.method171();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1063[arg0][var11][var10] & 0x18) == 0) {
					method443(arg0, var8, var9, var10, var11);
				}

				if (arg0 < 3 && (field1063[arg0 + 1][var11][var10] & 0x8) != 0) {
					method443(arg0 + 1, var8, var9, var10, var11);
				}
			}
		}

		field1147.method242();
		field1141 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1284.method81(field978, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class53.method282(var14).field723;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1318[field978].field813;
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

						field1323[field1141] = field1281[var15];
						field1142[field1141] = var16;
						field1143[field1141] = var17;
						field1141++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method457() {
		field1292 = false;

		while (field973) {
			try {
				Thread.sleep(50L);
			} catch (Exception var15) {
			}

			String var2;
			int var3;
			int var4;
			synchronized (field1219) {
				var2 = field1322;
				var3 = field1144;
				var4 = field1222;
				field1322 = null;
				field1144 = 0;
				field1222 = 0;
			}

			if (var2 != null) {
				byte[] var5 = signlink.cacheload(var2 + ".mid");
				if (var5 != null && var3 != 12345678) {
					field1192.reset();
					field1192.update(var5);
					int var6 = (int) field1192.getValue();
					if (var3 != var6) {
						var5 = null;
					}
				}

				if (var5 == null) {
					try {
						DataInputStream var7 = method386(var2 + "_" + var3 + ".mid");
						var5 = new byte[var4];
						int var9;
						for (int var8 = 0; var8 < var4; var8 += var9) {
							var9 = var7.read(var5, var8, var4 - var8);
							if (var9 == -1) {
								byte[] var10 = new byte[var8];
								for (int var11 = 0; var11 < var8; var11++) {
									var10[var11] = var5[var11];
								}

								var5 = var10;
								var4 = var8;
								break;
							}
						}

						var7.close();
						signlink.cachesave(var2 + ".mid", var5);
					} catch (Exception var16) {
					}
				}

				if (var5 == null) {
					return;
				}

				int var12 = (new class37(var5)).method221();
				byte[] var13 = new byte[var12];
				class44.method245(var13, var12, var5, var4, 4);
				method464(true, var12, var13);
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method458() {
		if (field984 == 0 && field1305 == 0) {
			field1130[field1062] = "Walk here";
			field1029[field1062] = 660;
			field1027[field1062] = field15;
			field1028[field1062] = field16;
			field1062++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field478; var2++) {
			int var3 = class31.field479[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1284.method82(field978, var4, var5, var3) >= 0) {
					class53 var8 = class53.method282(var7);
					if (field984 == 1) {
						field1130[field1062] = "Use " + field988 + " with @cya@" + var8.field705;
						field1029[field1062] = 450;
						field1030[field1062] = var3;
						field1027[field1062] = var4;
						field1028[field1062] = var5;
						field1062++;
					} else if (field1305 != 1) {
						if (var8.field721 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field721[var9] != null) {
									field1130[field1062] = var8.field721[var9] + " @cya@" + var8.field705;

									if (var9 == 0) {
										field1029[field1062] = 285;
									}

									if (var9 == 1) {
										field1029[field1062] = 504;
									}

									if (var9 == 2) {
										field1029[field1062] = 364;
									}

									if (var9 == 3) {
										field1029[field1062] = 581;
									}

									if (var9 == 4) {
										field1029[field1062] = 1501;
									}

									field1030[field1062] = var3;
									field1027[field1062] = var4;
									field1028[field1062] = var5;
									field1062++;
								}
							}
						}

						field1130[field1062] = "Examine @cya@" + var8.field705;
						field1029[field1062] = 1175;
						field1030[field1062] = var3;
						field1027[field1062] = var4;
						field1028[field1062] = var5;
						field1062++;
					} else if ((field1307 & 0x4) == 4) {
						field1130[field1062] = field1308 + " @cya@" + var8.field705;
						field1029[field1062] = 55;
						field1030[field1062] = var3;
						field1027[field1062] = var4;
						field1028[field1062] = var5;
						field1062++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field1098[var7];
					if (var10.field322.field745 == 1 && (var10.field270 & 0x7F) == 0x40 && (var10.field271 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1099; var11++) {
							class25 var12 = field1098[field1100[var11]];
							if (var12 != null && var10 != var12 && var12.field322.field745 == 1 && var10.field270 == var12.field270 && var10.field271 == var12.field271) {
								method479(var12.field322, var5, field1100[var11], var4);
							}
						}
					}

					method479(var10.field322, var5, var7, var4);
				}

				if (var6 == 0) {
					class26 var13 = field1103[var7];
					if ((var13.field270 & 0x7F) == 0x40 && (var13.field271 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1099; var14++) {
							class25 var15 = field1098[field1100[var14]];
							if (var15 != null && var15.field322.field745 == 1 && var13.field270 == var15.field270 && var13.field271 == var15.field271) {
								method479(var15.field322, var5, field1100[var14], var4);
							}
						}

						for (int var16 = 0; var16 < field1104; var16++) {
							class26 var17 = field1103[field1105[var16]];
							if (var17 != null && var13 != var17 && var13.field270 == var17.field270 && var13.field271 == var17.field271) {
								method444(field1105[var16], var4, var5, var17);
							}
						}
					}

					method444(var7, var4, var5, var13);
				}

				if (var6 == 3) {
					class41 var18 = field1138[field978][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method236(); var19 != null; var19 = (class22) var18.method238()) {
							class55 var20 = class55.method294(var19.field268);
							if (field984 == 1) {
								field1130[field1062] = "Use " + field988 + " with @lre@" + var20.field773;
								field1029[field1062] = 217;
								field1030[field1062] = var19.field268;
								field1027[field1062] = var4;
								field1028[field1062] = var5;
								field1062++;
							} else if (field1305 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field787 != null && var20.field787[var21] != null) {
										field1130[field1062] = var20.field787[var21] + " @lre@" + var20.field773;

										if (var21 == 0) {
											field1029[field1062] = 224;
										}

										if (var21 == 1) {
											field1029[field1062] = 993;
										}

										if (var21 == 2) {
											field1029[field1062] = 99;
										}

										if (var21 == 3) {
											field1029[field1062] = 746;
										}

										if (var21 == 4) {
											field1029[field1062] = 877;
										}

										field1030[field1062] = var19.field268;
										field1027[field1062] = var4;
										field1028[field1062] = var5;
										field1062++;
									} else if (var21 == 2) {
										field1130[field1062] = "Take @lre@" + var20.field773;
										field1029[field1062] = 99;
										field1030[field1062] = var19.field268;
										field1027[field1062] = var4;
										field1028[field1062] = var5;
										field1062++;
									}
								}

								field1130[field1062] = "Examine @lre@" + var20.field773;
								field1029[field1062] = 1102;
								field1030[field1062] = var19.field268;
								field1027[field1062] = var4;
								field1028[field1062] = var5;
								field1062++;
							} else if ((field1307 & 0x1) == 1) {
								field1130[field1062] = field1308 + " @lre@" + var20.field773;
								field1029[field1062] = 965;
								field1030[field1062] = var19.field268;
								field1027[field1062] = var4;
								field1028[field1062] = var5;
								field1062++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;IZ)V")
	public final void method459(class37 arg0, int arg1) {
		for (int var3 = 0; var3 < field1106; var3++) {
			int var4 = field1107[var3];
			class26 var5 = field1103[var4];
			int var6 = arg0.method216();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method216() << 8;
			}

			method495(var5, var4, var6, arg0);
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (!field1298) {
			field1292 = true;
			field973 = true;
			method12(this, 2);
			method481("scape_main", 12345678, 40000);
		}

		if (field1114) {
			field1002 = true;
		} else {
			field1114 = true;
			boolean var1 = false;
			String var2 = method442();
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
				try {
					int var3 = 5;
					field1315[8] = 0;
					while (field1315[8] == 0) {
						method13("Connecting to fileserver", 10);

						try {
							DataInputStream var4 = method386("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[36]);
							var4.readFully(var5.field542, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								field1315[var6] = var5.method221();
							}

							var4.close();
						} catch (IOException var59) {
							for (int var7 = var3; var7 > 0; var7--) {
								method13("Error loading - Will retry in " + var7 + " secs.", 10);

								try {
									Thread.sleep(1000L);
								} catch (Exception var54) {
								}
							}

							var3 *= 2;
							if (var3 > 60) {
								var3 = 60;
							}
						}
					}

					field950 = method438("title screen", "title", field1315[1], 10);
					field1162 = new class36(field950, "p11");
					field1163 = new class36(field950, "p12");
					field1164 = new class36(field950, "b12");
					field1165 = new class36(field950, "q8");
					method434();
					method483();
					class47 var8 = method438("config", "config", field1315[2], 15);
					class47 var9 = method438("interface", "interface", field1315[3], 20);
					class47 var10 = method438("2d graphics", "media", field1315[4], 30);
					class47 var11 = method438("3d graphics", "models", field1315[5], 40);
					class47 var12 = method438("textures", "textures", field1315[6], 60);
					class47 var13 = method438("chat system", "wordenc", field1315[7], 65);
					class47 var14 = method438("sound effects", "sounds", field1315[8], 70);
					field1063 = new byte[4][104][104];
					field1248 = new int[4][105][105];
					field1284 = new class18(4, field1248, 104, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1318[var15] = new class57(104, 104);
					}

					field1251 = new class34(512, 512);
					method13("Unpacking media", 75);
					field1302 = new class35(var10, "invback", 0);
					field1304 = new class35(var10, "chatback", 0);
					field1303 = new class35(var10, "mapback", 0);
					field989 = new class35(var10, "backbase1", 0);
					field990 = new class35(var10, "backbase2", 0);
					field991 = new class35(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						field1333[var16] = new class35(var10, "sideicons", var16);
					}

					field1220 = new class34(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							field1301[var17] = new class35(var10, "mapscene", var17);
						}
					} catch (Exception var58) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							field1281[var18] = new class34(var10, "mapfunction", var18);
						}
					} catch (Exception var57) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							field1247[var19] = new class34(var10, "hitmarks", var19);
						}
					} catch (Exception var56) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							field1004[var20] = new class34(var10, "headicons", var20);
						}
					} catch (Exception var55) {
					}

					field1294 = new class34(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						field1160[var21] = new class34(var10, "cross", var21);
					}

					field1035 = new class34(var10, "mapdots", 0);
					field1036 = new class34(var10, "mapdots", 1);
					field1037 = new class34(var10, "mapdots", 2);
					field1038 = new class34(var10, "mapdots", 3);
					field1073 = new class35(var10, "scrollbar", 0);
					field1074 = new class35(var10, "scrollbar", 1);
					field1057 = new class35(var10, "redstone1", 0);
					field1058 = new class35(var10, "redstone2", 0);
					field1059 = new class35(var10, "redstone3", 0);
					field1060 = new class35(var10, "redstone1", 0);
					field1060.method186();
					field1061 = new class35(var10, "redstone2", 0);
					field1061.method186();
					field1154 = new class35(var10, "redstone1", 0);
					field1154.method187();
					field1155 = new class35(var10, "redstone2", 0);
					field1155.method187();
					field1156 = new class35(var10, "redstone3", 0);
					field1156.method187();
					field1157 = new class35(var10, "redstone1", 0);
					field1157.method186();
					field1157.method187();
					field1158 = new class35(var10, "redstone2", 0);
					field1158.method186();
					field1158.method187();
					class34 var22 = new class34(var10, "backleft1", 0);
					field1207 = new class43(var22.field519, var22.field518, method11());
					var22.method173(0, 0);
					class34 var23 = new class34(var10, "backleft2", 0);
					field1208 = new class43(var23.field519, var23.field518, method11());
					var23.method173(0, 0);
					class34 var24 = new class34(var10, "backright1", 0);
					field1209 = new class43(var24.field519, var24.field518, method11());
					var24.method173(0, 0);
					class34 var25 = new class34(var10, "backright2", 0);
					field1210 = new class43(var25.field519, var25.field518, method11());
					var25.method173(0, 0);
					class34 var26 = new class34(var10, "backtop1", 0);
					field1211 = new class43(var26.field519, var26.field518, method11());
					var26.method173(0, 0);
					class34 var27 = new class34(var10, "backtop2", 0);
					field1212 = new class43(var27.field519, var27.field518, method11());
					var27.method173(0, 0);
					class34 var28 = new class34(var10, "backvmid1", 0);
					field1213 = new class43(var28.field519, var28.field518, method11());
					var28.method173(0, 0);
					class34 var29 = new class34(var10, "backvmid2", 0);
					field1214 = new class43(var29.field519, var29.field518, method11());
					var29.method173(0, 0);
					class34 var30 = new class34(var10, "backvmid3", 0);
					field1215 = new class43(var30.field519, var30.field518, method11());
					var30.method173(0, 0);
					class34 var31 = new class34(var10, "backhmid2", 0);
					field1216 = new class43(var31.field519, var31.field518, method11());
					var31.method173(0, 0);
					int var32 = (int) (Math.random() * 21.0D) - 10;
					int var33 = (int) (Math.random() * 21.0D) - 10;
					int var34 = (int) (Math.random() * 21.0D) - 10;
					int var35 = (int) (Math.random() * 41.0D) - 20;
					for (int var36 = 0; var36 < 50; var36++) {
						if (field1281[var36] != null) {
							field1281[var36].method172(var32 + var35, var33 + var35, var34 + var35);
						}

						if (field1301[var36] != null) {
							field1301[var36].method188(var32 + var35, var33 + var35, var34 + var35);
						}
					}

					method13("Unpacking textures", 80);
					class33.method159(var12);
					class33.method163(0.8D);
					class33.method158(20);
					method13("Unpacking models", 83);
					class31.method122(var11);
					class6.method48(var11);
					class7.method49(var11);
					method13("Unpacking config", 86);
					class62.method326(var8);
					class53.method280(var8);
					class58.method314(var8);
					class55.method292(var8);
					class54.method286(var8);
					class59.method318(var8);
					class63.method328(var8);
					class64.method331(var8);
					class55.field770 = field1297;

					if (!field1298) {
						method13("Unpacking sounds", 90);
						byte[] var37 = var14.method257(null, "sounds.dat");
						class37 var38 = new class37(var37);
						class51.method270(var38);
					}

					method13("Unpacking interfaces", 92);
					class36[] var39 = new class36[] { field1162, field1163, field1164, field1165 };
					class60.method322(var10, var39, var9);
					method13("Preparing game engine", 97);

					for (int var40 = 0; var40 < 33; var40++) {
						int var41 = 999;
						int var42 = 0;
						for (int var43 = 0; var43 < 35; var43++) {
							if (field1303.field524[field1303.field526 * var40 + var43] == 0) {
								if (var41 == 999) {
									var41 = var43;
								}
							} else if (var41 != 999) {
								var42 = var43;
								break;
							}
						}

						field997[var40] = var41;
						field1339[var40] = var42 - var41;
					}

					for (int var44 = 9; var44 < 160; var44++) {
						int var45 = 999;
						int var46 = 0;
						for (int var47 = 10; var47 < 168; var47++) {
							if (field1303.field524[field1303.field526 * var44 + var47] == 0 && (var47 > 34 || var44 > 34)) {
								if (var45 == 999) {
									var45 = var47;
								}
							} else if (var45 != 999) {
								var46 = var47;
								break;
							}
						}

						field977[var44 - 9] = var45 - 21;
						field1326[var44 - 9] = var46 - var45;
					}

					class33.method156(96, 479);
					field962 = class33.field505;
					class33.method156(261, 190);
					field963 = class33.field505;
					class33.method156(334, 512);
					field964 = class33.field505;
					int[] var48 = new int[9];
					for (int var49 = 0; var49 < 9; var49++) {
						int var50 = var49 * 32 + 128 + 15;
						int var51 = var50 * 3 + 600;
						int var52 = class33.field503[var50];
						var48[var49] = var51 * var52 >> 16;
					}

					class18.method88(334, 500, var48, 800, 512);
					class65.method333(var13);
				} catch (Exception var60) {
					field961 = true;
				}
			} else {
				field1112 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = class31.field480[var7];
			int var13 = class31.field481[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field480[var8];
			int var16 = class31.field481[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1119 = arg0 - var9;
		field1120 = arg1 - var10;
		field1121 = arg3 - var11;
		field1122 = arg2;
		field1123 = arg5;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method461() {
		for (int var1 = -1; var1 < field1104; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1102;
			} else {
				var2 = field1105[var1];
			}

			class26 var3 = field1103[var2];
			if (var3 != null && var3.field283 > 0) {
				var3.field283--;
				if (var3.field283 == 0) {
					var3.field282 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1099; var4++) {
			int var5 = field1100[var4];
			class25 var6 = field1098[var5];
			if (var6 != null && var6.field283 > 0) {
				var6.field283--;
				if (var6.field283 == 0) {
					var6.field282 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method462() {
		class53.field735.method105();
		class53.field736.method105();
		class54.field764.method105();
		class55.field805.method105();
		class55.field806.method105();
		class26.field343.method105();
		class63.field927.method105();
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method12(Runnable arg0, int arg1) {
		if (signlink.mainapp == null) {
			super.method12(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.b(ILkb;I)V")
	public final void method463(class37 arg0, int arg1) {
		while (arg0.field544 + 21 < arg1 * 8) {
			int var3 = arg0.method227(13);
			if (var3 == 8191) {
				break;
			}

			if (field1098[var3] == null) {
				field1098[var3] = new class25();
			}

			class25 var4 = field1098[var3];
			field1100[field1099++] = var3;
			var4.field314 = field1316;
			var4.field322 = class54.method288(arg0.method227(11));
			var4.field274 = var4.field322.field745;
			var4.field277 = var4.field322.field749;
			var4.field278 = var4.field322.field750;
			var4.field279 = var4.field322.field751;
			var4.field280 = var4.field322.field752;
			var4.field275 = var4.field322.field748;
			int var5 = arg0.method227(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method227(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method110(field1007.field319[0] + var6, false, field1007.field318[0] + var5);
			int var7 = arg0.method227(1);
			if (var7 == 1) {
				field1107[field1106++] = var3;
			}
		}

		arg0.method228();
	}

	@ObfuscatedName("client.a(IZI[B)V")
	public final void method464(boolean arg0, int arg1, byte[] arg2) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg2, arg1);
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public final String method465(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method466() {
		if (field1186 != 0) {
			class36 var1 = field1163;
			int var2 = 0;
			if (field1091 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1050[var3] != null) {
					int var4 = field1048[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1317 == 0 || field1317 == 1 && method389(field1049[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method194(4, "From " + field1049[var3] + ": " + field1050[var3], var5, 0);
						var1.method194(4, "From " + field1049[var3] + ": " + field1050[var3], var5 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1317 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method194(4, field1050[var3], var6, 0);
						var1.method194(4, field1050[var3], var6 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1317 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method194(4, "To " + field1049[var3] + ": " + field1050[var3], var7, 0);
						var1.method194(4, "To " + field1049[var3] + ": " + field1050[var3], var7 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)Ljava/net/Socket;")
	public final Socket method467(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method468() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1287 + field1279 & 0x7FF;
				int var4 = class33.field503[var3];
				int var5 = class33.field504[var3];
				var4 = (field1230 + 256) * var4 >> 8;
				var5 = (field1230 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1007.field270 + var6 >> 7;
				int var9 = field1007.field271 - var7 >> 7;
				boolean var10 = method420(0, var8, true, 0, 1, field1007.field319[0], 0, 0, field1007.field318[0], var9, 0);
				if (var10) {
					field1174.method206(var1);
					field1174.method206(var2);
					field1174.method207(field1287);
					field1174.method206(57);
					field1174.method206(field1279);
					field1174.method206(field1230);
					field1174.method206(89);
					field1174.method207(field1007.field270);
					field1174.method207(field1007.field271);
					field1174.method206(field996);
					field1174.method206(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Lkb;II)V")
	public final void method469(class37 arg0, int arg1) {
		int var3 = arg0.method227(8);
		if (var3 < field1104) {
			for (int var4 = var3; var4 < field1104; var4++) {
				field1237[field1236++] = field1105[var4];
			}
		}

		if (var3 > field1104) {
			signlink.reporterror(field965 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1104 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1105[var5];
			class26 var7 = field1103[var6];
			int var8 = arg0.method227(1);
			if (var8 == 0) {
				field1105[field1104++] = var6;
				var7.field314 = field1316;
			} else {
				int var9 = arg0.method227(2);
				if (var9 == 0) {
					field1105[field1104++] = var6;
					var7.field314 = field1316;
					field1107[field1106++] = var6;
				} else if (var9 == 1) {
					field1105[field1104++] = var6;
					var7.field314 = field1316;
					int var10 = arg0.method227(3);
					var7.method111(false, var10);
					int var11 = arg0.method227(1);
					if (var11 == 1) {
						field1107[field1106++] = var6;
					}
				} else if (var9 == 2) {
					field1105[field1104++] = var6;
					var7.field314 = field1316;
					int var12 = arg0.method227(3);
					var7.method111(true, var12);
					int var13 = arg0.method227(3);
					var7.method111(true, var13);
					int var14 = arg0.method227(1);
					if (var14 == 1) {
						field1107[field1106++] = var6;
					}
				} else if (var9 == 3) {
					field1237[field1236++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method470(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1050[var4] != null) {
				int var5 = field1048[var4];
				int var6 = field998 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1084 == 0 || field1084 == 1 && method389(field1049[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !field1049[var4].equals(field1007.field323)) {
						if (field1199) {
							field1130[field1062] = "Report abuse @whi@" + field1049[var4];
							field1029[field1062] = 34;
							field1062++;
						}

						field1130[field1062] = "Add ignore @whi@" + field1049[var4];
						field1029[field1062] = 436;
						field1062++;
						field1130[field1062] = "Add friend @whi@" + field1049[var4];
						field1029[field1062] = 406;
						field1062++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1186 == 0 && (var5 == 7 || field1317 == 0 || field1317 == 1 && method389(field1049[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1199) {
							field1130[field1062] = "Report abuse @whi@" + field1049[var4];
							field1029[field1062] = 34;
							field1062++;
						}

						field1130[field1062] = "Add ignore @whi@" + field1049[var4];
						field1029[field1062] = 436;
						field1062++;
						field1130[field1062] = "Add friend @whi@" + field1049[var4];
						field1029[field1062] = 406;
						field1062++;
					}

					var3++;
				}

				if (var5 == 4 && (field1232 == 0 || field1232 == 1 && method389(field1049[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1130[field1062] = "Accept trade @whi@" + field1049[var4];
						field1029[field1062] = 903;
						field1062++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1186 == 0 && field1317 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1232 == 0 || field1232 == 1 && method389(field1049[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1130[field1062] = "Accept duel @whi@" + field1049[var4];
						field1029[field1062] = 363;
						field1062++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method471() {
		field1133++;
		method411();
		method480();
		method392();
		method432();
		method430();

		if (!field957) {
			int var1 = field1286;
			if (field1043 / 256 > var1) {
				var1 = field1043 / 256;
			}

			if (field1046[4] && field1252[4] + 128 > var1) {
				var1 = field1252[4] + 128;
			}

			int var2 = field974 + field1287 & 0x7FF;
			method460(field952, method382(field1007.field270, field978, field1007.field271) - 50, var1, field953, var1 * 3 + 600, var2);
			field1040++;
			if (field1040 > 1802) {
				field1040 = 0;
				field1174.method205(146);
				field1174.method206(0);
				int var3 = field1174.field543;
				field1174.method207(29711);
				field1174.method206(70);
				field1174.method206((int) (Math.random() * 256.0D));
				field1174.method206(242);
				field1174.method206(186);
				field1174.method206(39);
				field1174.method206(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1174.method206(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1174.method207(57856);
				}

				field1174.method207((int) (Math.random() * 65536.0D));
				field1174.method215(field1174.field543 - var3);
			}
		}

		int var4;
		if (field957) {
			var4 = method489();
		} else {
			var4 = method488();
		}

		int var5 = field1119;
		int var6 = field1120;
		int var7 = field1121;
		int var8 = field1122;
		int var9 = field1123;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1046[var10]) {
				int var11 = (int) (Math.random() * (field1039[var10] * 2 + 1) + Math.sin(field1109[var10] / 100.0D * field1240[var10]) * field1252[var10] - field1039[var10]);
				if (var10 == 0) {
					field1119 += var11;
				}

				if (var10 == 1) {
					field1120 += var11;
				}

				if (var10 == 2) {
					field1121 += var11;
				}

				if (var10 == 3) {
					field1123 = field1123 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1122 += var11;
					if (field1122 < 128) {
						field1122 = 128;
					}

					if (field1122 > 383) {
						field1122 = 383;
					}
				}
			}
		}

		int var12 = class33.field514;
		class31.field475 = true;
		class31.field478 = 0;
		class31.field476 = field15 - 8;
		class31.field477 = field16 - 11;
		class32.method149();
		field1284.method91(var4, field1123, field1119, field1122, field1120, field1121);
		field1284.method65();
		method372();
		method415();
		method492(var12);
		method387();
		field1147.method243(11, field8, 8);
		field1119 = var5;
		field1120 = var6;
		field1121 = var7;
		field1122 = var8;
		field1123 = var9;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method472() {
		if (field1246 > 0) {
			method491();
		} else {
			field1147.method242();
			field1163.method191(0, "Connection lost", 257, 144);
			field1163.method191(0xFFFFFF, "Connection lost", 256, 143);
			field1163.method191(0, "Please wait - attempting to reestablish", 257, 159);
			field1163.method191(0xFFFFFF, "Please wait - attempting to reestablish", 256, 158);
			field1147.method243(11, field8, 8);
			field1249 = 0;
			class4 var1 = field1041;
			field1000 = false;
			method410(field965, field966, true);

			if (!field1000) {
				method491();
			}

			try {
				var1.method29();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method473(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method474() {
		int var1 = field1007.field270 + field1053;
		int var2 = field1007.field271 + field1051;
		if (field952 - var1 < -500 || field952 - var1 > 500 || field953 - var2 < -500 || field953 - var2 > 500) {
			field952 = var1;
			field953 = var2;
		}

		if (field952 != var1) {
			field952 += (var1 - field952) / 16;
		}

		if (field953 != var2) {
			field953 += (var2 - field953) / 16;
		}

		if (field20[1] == 1) {
			field1288 += (-field1288 - 24) / 2;
		} else if (field20[2] == 1) {
			field1288 += (24 - field1288) / 2;
		} else {
			field1288 /= 2;
		}

		if (field20[3] == 1) {
			field1289 += (12 - field1289) / 2;
		} else if (field20[4] == 1) {
			field1289 += (-field1289 - 12) / 2;
		} else {
			field1289 /= 2;
		}

		field1287 = field1288 / 2 + field1287 & 0x7FF;
		field1286 += field1289 / 2;
		if (field1286 < 128) {
			field1286 = 128;
		}

		if (field1286 > 383) {
			field1286 = 383;
		}

		int var3 = field952 >> 7;
		int var4 = field953 >> 7;
		int var5 = method382(field952, field978, field953);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field978;
					if (var9 < 3 && (field1063[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field1248[var9][var7][var8];
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

		if (var11 > field1043) {
			field1043 += (var11 - field1043) / 24;
		} else if (var11 < field1043) {
			field1043 += (var11 - field1043) / 80;
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method475() {
		method433();
		field1077.method242();
		field1149.method189(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field948 == 0) {
			int var3 = var2 / 2 - 20;
			field1164.method192(var1 / 2, "Welcome to RuneScape", 0xFFFF00, var3, true);
			var3 += 30;
			int var4 = var1 / 2 - 80;
			int var5 = var2 / 2 + 20;
			field1150.method189(var4 - 73, var5 - 20);
			field1164.method192(var4, "New user", 0xFFFFFF, var5 + 5, true);
			int var6 = var1 / 2 + 80;
			field1150.method189(var6 - 73, var5 - 20);
			field1164.method192(var6, "Existing User", 0xFFFFFF, var5 + 5, true);
		}

		if (field948 == 2) {
			int var7 = var2 / 2 - 40;
			if (field1008.length() > 0) {
				field1164.method192(var1 / 2, field1008, 0xFFFF00, var7 - 15, true);
				field1164.method192(var1 / 2, field1009, 0xFFFF00, var7, true);
				var7 += 30;
			} else {
				field1164.method192(var1 / 2, field1009, 0xFFFF00, var7 - 7, true);
				var7 += 30;
			}

			field1164.method196(var1 / 2 - 90, true, "Username: " + field965 + (field1026 == 0 & field1316 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var7);
			var7 += 15;
			field1164.method196(var1 / 2 - 88, true, "Password: " + class48.method264(field966) + (field1026 == 1 & field1316 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var7);
			var7 += 15;
			int var8 = var1 / 2 - 80;
			int var9 = var2 / 2 + 50;
			field1150.method189(var8 - 73, var9 - 20);
			field1164.method192(var8, "Login", 0xFFFFFF, var9 + 5, true);
			int var10 = var1 / 2 + 80;
			field1150.method189(var10 - 73, var9 - 20);
			field1164.method192(var10, "Cancel", 0xFFFFFF, var9 + 5, true);
		}

		if (field948 == 3) {
			field1164.method192(var1 / 2, "Create a free account", 0xFFFF00, var2 / 2 - 60, true);
			int var11 = var2 / 2 - 35;
			field1164.method192(var1 / 2, "To create a new account you need to", 0xFFFFFF, var11, true);
			var11 += 15;
			field1164.method192(var1 / 2, "go back to the main RuneScape webpage", 0xFFFFFF, var11, true);
			var11 += 15;
			field1164.method192(var1 / 2, "and choose the red 'create account'", 0xFFFFFF, var11, true);
			var11 += 15;
			field1164.method192(var1 / 2, "button at the top right of that page.", 0xFFFFFF, var11, true);
			var11 += 15;
			int var12 = var1 / 2;
			int var13 = var2 / 2 + 50;
			field1150.method189(var12 - 73, var13 - 20);
			field1164.method192(var12, "Cancel", 0xFFFFFF, var13 + 5, true);
		}

		field1077.method243(186, field8, 214);

		if (field1203) {
			field1203 = false;
			field1075.method243(0, field8, 128);
			field1076.method243(386, field8, 214);
			field1080.method243(265, field8, 0);
			field1081.method243(265, field8, 574);
			field1082.method243(186, field8, 128);
			field1083.method243(186, field8, 574);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method476() {
		try {
			field1116 = -1;
			field1013.method239();
			field1042.method239();
			field1293.method239();
			field955.method239();
			class33.method157();
			method462();
			field1284.method51();

			for (int var1 = 0; var1 < 4; var1++) {
				field1318[var1].method302();
			}

			System.gc();
			class3 var2 = new class3(104, field1063, field1248, 104);
			byte[] var3 = new byte[100000];
			int var4 = field1268.length;
			class3.field25 = class18.field196;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1056[var5] >> 8;
				int var7 = field1056[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field25 = false;
				}
			}

			if (class3.field25) {
				field1284.method52(field978);
			} else {
				field1284.method52(0);
			}

			field1174.method205(108);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1056[var8] >> 8) * 64 - field992;
				int var10 = (field1056[var8] & 0xFF) * 64 - field993;
				byte[] var11 = field1268[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method221();
					class44.method245(var3, var12, var11, var11.length - 4, 4);
					var2.method15((field1271 - 6) * 8, (field1272 - 6) * 8, var9, var3, var10);
				} else if (field1272 < 800) {
					var2.method14(var9, 64, 64, var10);
				}
			}

			field1174.method205(108);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field969[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method221();
					class44.method245(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1056[var13] >> 8) * 64 - field992;
					int var17 = (field1056[var13] & 0xFF) * 64 - field993;
					var2.method16(field1318, var17, field1284, field1042, var3, var16);
				}
			}

			field1174.method205(108);
			var2.method18(field1284, field1318);
			field1147.method242();
			field1174.method205(108);

			for (class40 var18 = (class40) field1042.method235(); var18 != null; var18 = (class40) field1042.method237()) {
				if ((field1063[1][var18.field574][var18.field575] & 0x2) == 2) {
					var18.field572--;
					if (var18.field572 < 0) {
						var18.method108();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method398(var19, var20);
				}
			}

			for (class38 var21 = (class38) field1336.method235(); var21 != null; var21 = (class38) field1336.method237()) {
				method436(var21.field554, var21.field555, var21.field560, var21.field558, var21.field557, var21.field556, var21.field559);
			}
		} catch (Exception var23) {
		}

		class53.field735.method105();
		System.gc();
		class33.method158(20);
	}

	@ObfuscatedName("client.M(I)V")
	public final void method477() {
		field1012 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1332) {
				method423();
				method423();
				method431();
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

		field1012 = false;
	}

	@ObfuscatedName("client.b(IILkb;)V")
	public final void method478(int arg0, class37 arg1) {
		field1236 = 0;
		field1106 = 0;
		method401(arg0, arg1);
		method463(arg1, arg0);
		method494(arg0, arg1);

		for (int var3 = 0; var3 < field1236; var3++) {
			int var4 = field1237[var3];
			if (field1316 != field1098[var4].field314) {
				field1098[var4].field322 = null;
				field1098[var4] = null;
			}
		}

		if (arg1.field543 != arg0) {
			signlink.reporterror(field965 + " size mismatch in getnpcpos - pos:" + arg1.field543 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1099; var5++) {
			if (field1098[field1100[var5]] == null) {
				signlink.reporterror(field965 + " null entry in npc list - pos:" + var5 + " size:" + field1099);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ILbc;III)V")
	public final void method479(class54 arg0, int arg1, int arg2, int arg3) {
		if (field1062 < 400) {
			String var5 = arg0.field743;
			if (arg0.field761 != 0) {
				var5 = var5 + method405(arg0.field761, field1007.field329) + " (level-" + arg0.field761 + ")";
			}

			if (field984 == 1) {
				field1130[field1062] = "Use " + field988 + " with @yel@" + var5;
				field1029[field1062] = 900;
				field1030[field1062] = arg2;
				field1027[field1062] = arg3;
				field1028[field1062] = arg1;
				field1062++;
			} else if (field1305 != 1) {
				if (arg0.field756 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg0.field756[var6] != null && !arg0.field756[var6].equalsIgnoreCase("attack")) {
							field1130[field1062] = arg0.field756[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1029[field1062] = 728;
							}

							if (var6 == 1) {
								field1029[field1062] = 542;
							}

							if (var6 == 2) {
								field1029[field1062] = 6;
							}

							if (var6 == 3) {
								field1029[field1062] = 963;
							}

							if (var6 == 4) {
								field1029[field1062] = 245;
							}

							field1030[field1062] = arg2;
							field1027[field1062] = arg3;
							field1028[field1062] = arg1;
							field1062++;
						}
					}
				}

				if (arg0.field756 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg0.field756[var7] != null && arg0.field756[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg0.field761 > field1007.field329) {
								var8 = 2000;
							}

							field1130[field1062] = arg0.field756[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1029[field1062] = var8 + 728;
							}

							if (var7 == 1) {
								field1029[field1062] = var8 + 542;
							}

							if (var7 == 2) {
								field1029[field1062] = var8 + 6;
							}

							if (var7 == 3) {
								field1029[field1062] = var8 + 963;
							}

							if (var7 == 4) {
								field1029[field1062] = var8 + 245;
							}

							field1030[field1062] = arg2;
							field1027[field1062] = arg3;
							field1028[field1062] = arg1;
							field1062++;
						}
					}
				}

				field1130[field1062] = "Examine @yel@" + var5;
				field1029[field1062] = 1607;
				field1030[field1062] = arg2;
				field1027[field1062] = arg3;
				field1028[field1062] = arg1;
				field1062++;
			} else if ((field1307 & 0x2) == 2) {
				field1130[field1062] = field1308 + " @yel@" + var5;
				field1029[field1062] = 265;
				field1030[field1062] = arg2;
				field1027[field1062] = arg3;
				field1028[field1062] = arg1;
				field1062++;
				return;
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method480() {
		for (int var1 = 0; var1 < field1099; var1++) {
			class25 var2 = field1098[field1100[var1]];
			int var3 = (field1100[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method112()) {
				int var4 = var2.field270 >> 7;
				int var5 = var2.field271 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field274 == 1 && (var2.field270 & 0x7F) == 0x40 && (var2.field271 & 0x7F) == 0x40) {
						if (field1342[var4][var5] == field1133) {
							continue;
						}

						field1342[var4][var5] = field1133;
					}

					field1284.method62(var2, null, var2.field273, method382(var2.field270, field978, var2.field271), (var2.field274 - 1) * 64 + 60, var2.field272, var2.field271, field978, var2.field270, var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIB)V")
	public final void method481(String arg0, int arg1, int arg2) {
		if (arg0 != null) {
			synchronized (field1219) {
				field1322 = arg0;
				field1144 = arg1;
				field1222 = arg2;
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method482() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field1084 = (field1084 + 1) % 4;
				field1194 = true;
				field949 = true;
				field1174.method205(244);
				field1174.method206(field1084);
				field1174.method206(field1317);
				field1174.method206(field1232);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field1317 = (field1317 + 1) % 3;
				field1194 = true;
				field949 = true;
				field1174.method205(244);
				field1174.method206(field1084);
				field1174.method206(field1317);
				field1174.method206(field1232);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field1232 = (field1232 + 1) % 3;
				field1194 = true;
				field949 = true;
				field1174.method205(244);
				field1174.method206(field1084);
				field1174.method206(field1317);
				field1174.method206(field1232);
			}

			if (field18 >= 416 && field18 <= 516 && field19 >= 490 && field19 <= 522) {
				method393();
				field1282 = "";
				field1065 = false;

				for (int var1 = 0; var1 < class60.field835.length; var1++) {
					if (class60.field835[var1] != null && class60.field835[var1].field844 == 600) {
						field1175 = field1238 = class60.field835[var1].field841;
						return;
					}
				}

				return;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://127.0.0.1:" + (field1296 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.P(I)V")
	public final void method483() {
		field1149 = new class35(field950, "titlebox", 0);
		field1150 = new class35(field950, "titlebutton", 0);
		field1117 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1117[var1] = new class35(field950, "runes", var1);
		}

		field1068 = new class34(128, 265);
		field1069 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1068.field517[var2] = field1078.field583[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1069.field517[var3] = field1079.field583[var3];
		}

		field1312 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1312[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1312[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1312[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1312[var7 + 192] = 0xFFFFFF;
		}

		field1313 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1313[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1313[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1313[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1313[var11 + 192] = 0xFFFFFF;
		}

		field1314 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1314[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1314[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1314[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1314[var15 + 192] = 0xFFFFFF;
		}

		field1311 = new int[256];
		field1170 = new int[32768];
		field1171 = new int[32768];
		method427(null);
		field1195 = new int[32768];
		field1196 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1332) {
			field1221 = true;
			field1332 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(Lhc;I)Z")
	public final boolean method484(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 == 201) {
			field949 = true;
			field1290 = false;
			field1129 = true;
			field1024 = "";
			field1001 = 1;
			field1169 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field949 = true;
			field1290 = false;
			field1129 = true;
			field1024 = "";
			field1001 = 2;
			field1169 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1246 = 250;
			return true;
		}

		if (var2 == 501) {
			field949 = true;
			field1290 = false;
			field1129 = true;
			field1024 = "";
			field1001 = 4;
			field1169 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field949 = true;
			field1290 = false;
			field1129 = true;
			field1024 = "";
			field1001 = 5;
			field1169 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1198[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class59.field827 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class59.field827) {
							var5 = 0;
						}
					}

					if (!class59.field828[var5].field834 && class59.field828[var5].field829 == var3 + (field1253 ? 0 : 7)) {
						break;
					}
				}

				field1198[var3] = var5;
				field1337 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1127[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1269[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1269[var6].length) {
					var8 = 0;
				}
			}

			field1127[var6] = var8;
			field1337 = true;
		}

		if (var2 == 324 && !field1253) {
			field1253 = true;
			method455();
		}

		if (var2 == 325 && field1253) {
			field1253 = false;
			method455();
		}

		if (var2 == 326) {
			field1174.method205(52);
			field1174.method206(field1253 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1174.method206(field1198[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1174.method206(field1127[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1065 = !field1065;
		}

		if (var2 >= 601 && var2 <= 612) {
			method393();

			if (field1282.length() > 0) {
				field1174.method205(190);
				field1174.method212(class48.method258(field1282));
				field1174.method206(var2 - 601);
				field1174.method206(field1065 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.c(ILkb;I)V")
	public final void method485(class37 arg0, int arg1) {
		arg0.method226();
		int var3 = arg0.method227(1);
		if (var3 != 0) {
			int var4 = arg0.method227(2);
			if (var4 == 0) {
				field1107[field1106++] = field1102;
			} else if (var4 == 1) {
				int var5 = arg0.method227(3);
				field1007.method111(false, var5);
				int var6 = arg0.method227(1);
				if (var6 == 1) {
					field1107[field1106++] = field1102;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method227(3);
				field1007.method111(true, var7);
				int var8 = arg0.method227(3);
				field1007.method111(true, var8);
				int var9 = arg0.method227(1);
				if (var9 == 1) {
					field1107[field1106++] = field1102;
				}
			} else if (var4 == 3) {
				field978 = arg0.method227(2);
				int var10 = arg0.method227(7);
				int var11 = arg0.method227(7);
				int var12 = arg0.method227(1);
				field1007.method110(var11, var12 == 1, var10);
				int var13 = arg0.method227(1);
				if (var13 == 1) {
					field1107[field1106++] = field1102;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method486() {
		if (field1062 >= 2 || field984 != 0 || field1305 != 0) {
			String var1;
			if (field984 == 1 && field1062 < 2) {
				var1 = "Use " + field988 + " with...";
			} else if (field1305 == 1 && field1062 < 2) {
				var1 = field1308 + "...";
			} else {
				var1 = field1130[field1062 - 1];
			}

			if (field1062 > 2) {
				var1 = var1 + "@whi@ / " + (field1062 - 2) + " more options";
			}

			field1164.method197(field1316 / 1000, 4, 15, true, 0xFFFFFF, var1);
		}
	}

	@ObfuscatedName("client.a(Lhc;II)I")
	public final int method487(class60 arg0, int arg1) {
		if (arg0.field849 == null || arg1 >= arg0.field849.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field849[arg1];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1118[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1187[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1055[var3[var5++]];
				}

				if (var6 == 4) {
					class60 var7 = class60.field835[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field836.length; var9++) {
						if (var7.field836[var9] == var8) {
							var4 += var7.field837[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field967[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1217[field1187[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field967[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1007.field329;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1187[var10];
					}
				}

				if (var6 == 10) {
					class60 var11 = class60.field835[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field836.length; var13++) {
						if (var11.field836[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field1201;
				}

				if (var6 == 12) {
					var4 += field1179;
				}

				if (var6 == 13) {
					int var14 = field967[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.Q(I)I")
	public final int method488() {
		int var1 = 3;
		if (field1122 < 310) {
			int var2 = field1119 >> 7;
			int var3 = field1121 >> 7;
			int var4 = field1007.field270 >> 7;
			int var5 = field1007.field271 >> 7;

			if ((field1063[field978][var2][var3] & 0x4) != 0) {
				var1 = field978;
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

					if ((field1063[field978][var2][var3] & 0x4) != 0) {
						var1 = field978;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1063[field978][var2][var3] & 0x4) != 0) {
							var1 = field978;
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

					if ((field1063[field978][var2][var3] & 0x4) != 0) {
						var1 = field978;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1063[field978][var2][var3] & 0x4) != 0) {
							var1 = field978;
						}
					}
				}
			}
		}

		if ((field1063[field978][field1007.field270 >> 7][field1007.field271 >> 7] & 0x4) != 0) {
			var1 = field978;
		}

		return var1;
	}

	@ObfuscatedName("client.h(Z)I")
	public final int method489() {
		int var1 = method382(field1119, field978, field1121);
		if (var1 - field1120 < 800 && (field1063[field978][field1119 >> 7][field1121 >> 7] & 0x4) != 0) {
			return field978;
		}

		return 3;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method490(int arg0) {
		class60 var2 = class60.field835[arg0];
		for (int var3 = 0; var3 < var2.field856.length && var2.field856[var3] != -1; var3++) {
			class60 var4 = class60.field835[var2.field856[var3]];
			if (var4.field842 == 1) {
				method490(var4.field840);
			}

			var4.field838 = 0;
			var4.field839 = 0;
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method491() {
		try {
			if (field1041 != null) {
				field1041.method29();
			}
		} catch (Exception var2) {
		}

		field1041 = null;
		field1000 = false;
		field948 = 0;
		field965 = "";
		field966 = "";
		class5.method35();
		method462();
		field1284.method51();

		for (int var1 = 0; var1 < 4; var1++) {
			field1318[var1].method302();
		}

		System.gc();
		method385();
		field968 = null;
		field1184 = 0;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method492(int arg0) {
		if (!field1298) {
			if (class33.field513[17] >= arg0) {
				class35 var2 = class33.field507[17];
				int var3 = var2.field527 * var2.field526 - 1;
				int var4 = field1167 * var2.field526 * 2;
				byte[] var5 = var2.field524;
				byte[] var6 = field1193;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field524 = var6;
				field1193 = var5;
				class33.method161(17);
			}

			if (class33.field513[24] >= arg0) {
				class35 var8 = class33.field507[24];
				int var9 = var8.field527 * var8.field526 - 1;
				int var10 = field1167 * var8.field526 * 2;
				byte[] var11 = var8.field524;
				byte[] var12 = field1193;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field524 = var12;
				field1193 = var11;
				class33.method161(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method493(int arg0) {
		int var2 = class64.field929[arg0].field937;
		if (var2 != 0) {
			int var3 = field967[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class33.method163(0.9D);
				}

				if (var3 == 2) {
					class33.method163(0.8D);
				}

				if (var3 == 3) {
					class33.method163(0.7D);
				}

				if (var3 == 4) {
					class33.method163(0.6D);
				}

				class55.field806.method105();
				field1203 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1276;

				if (var3 == 0) {
					method445(field1276, 0);
					field1276 = true;
				}

				if (var3 == 1) {
					method445(field1276, -400);
					field1276 = true;
				}

				if (var3 == 2) {
					method445(field1276, -800);
					field1276 = true;
				}

				if (var3 == 3) {
					method445(field1276, -1200);
					field1276 = true;
				}

				if (var3 == 4) {
					field1276 = false;
				}

				if (field1276 != var4) {
					if (field1276) {
						method481(field968, field1321, field1173);
					} else {
						method385();
					}

					field1184 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1299 = true;
					method453(0);
				}

				if (var3 == 1) {
					field1299 = true;
					method453(-400);
				}

				if (var3 == 2) {
					field1299 = true;
					method453(-800);
				}

				if (var3 == 3) {
					field1299 = true;
					method453(-1200);
				}

				if (var3 == 4) {
					field1299 = false;
				}
			}

			if (var2 == 5) {
				field1031 = var3;
			}

			if (var2 == 6) {
				field1066 = var3;
			}

			if (var2 == 8) {
				field1186 = var3;
				field949 = true;
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(ZILkb;)V")
	public final void method494(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field1106; var3++) {
			int var4 = field1107[var3];
			class25 var5 = field1098[var4];
			int var6 = arg1.method216();
			if ((var6 & 0x2) == 2) {
				int var7 = arg1.method218();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field297 == var7) {
					var5.field301 = 0;
				}

				int var8 = arg1.method216();
				if (var7 == -1 || var5.field297 == -1 || class62.field901[var7].field909 > class62.field901[var5.field297].field909 || class62.field901[var5.field297].field909 == 0) {
					var5.field297 = var7;
					var5.field298 = 0;
					var5.field299 = 0;
					var5.field300 = var8;
					var5.field301 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field291 = arg1.method218();
				if (var5.field291 == 0xFFFF) {
					var5.field291 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field282 = arg1.method223();
				var5.field283 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field286 = arg1.method216();
				var5.field287 = arg1.method216();
				var5.field288 = field1316 + 400;
				var5.field289 = arg1.method216();
				var5.field290 = arg1.method216();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field322 = class54.method288(arg1.method218());
				var5.field277 = var5.field322.field749;
				var5.field278 = var5.field322.field750;
				var5.field279 = var5.field322.field751;
				var5.field280 = var5.field322.field752;
				var5.field275 = var5.field322.field748;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field302 = arg1.method218();
				int var9 = arg1.method221();
				var5.field306 = var9 >> 16;
				var5.field305 = (var9 & 0xFFFF) + field1316;
				var5.field303 = 0;
				var5.field304 = 0;

				if (var5.field305 > field1316) {
					var5.field303 = -1;
				}

				if (var5.field302 == 0xFFFF) {
					var5.field302 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field292 = arg1.method218();
				var5.field293 = arg1.method218();
			}
		}
	}

	@ObfuscatedName("client.a(Lz;IIILkb;)V")
	public final void method495(class26 arg0, int arg1, int arg2, class37 arg3) {
		if ((arg2 & 0x1) == 1) {
			int var5 = arg3.method216();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg3.method225(0, var5, var6);
			field1108[arg1] = var7;
			arg0.method114(var7);
		}

		if ((arg2 & 0x2) == 2) {
			int var8 = arg3.method218();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg0.field297 == var8) {
				arg0.field301 = 0;
			}

			int var9 = arg3.method216();
			if (var8 == -1 || arg0.field297 == -1 || class62.field901[var8].field909 > class62.field901[arg0.field297].field909 || class62.field901[arg0.field297].field909 == 0) {
				arg0.field297 = var8;
				arg0.field298 = 0;
				arg0.field299 = 0;
				arg0.field300 = var9;
				arg0.field301 = 0;
			}
		}

		if ((arg2 & 0x4) == 4) {
			arg0.field291 = arg3.method218();
			if (arg0.field291 == 0xFFFF) {
				arg0.field291 = -1;
			}
		}

		if ((arg2 & 0x8) == 8) {
			arg0.field282 = arg3.method223();
			arg0.field284 = 0;
			arg0.field285 = 0;
			arg0.field283 = 150;
			method391(2, arg0.field323, arg0.field282);
		}

		if ((arg2 & 0x10) == 0x10) {
			arg0.field286 = arg3.method216();
			arg0.field287 = arg3.method216();
			arg0.field288 = field1316 + 400;
			arg0.field289 = arg3.method216();
			arg0.field290 = arg3.method216();
		}

		if ((arg2 & 0x20) == 0x20) {
			arg0.field292 = arg3.method218();
			arg0.field293 = arg3.method218();
		}

		if ((arg2 & 0x40) == 0x40) {
			int var10 = arg3.method218();
			int var11 = arg3.method216();
			int var12 = arg3.method216();
			int var13 = arg3.field543;

			if (arg0.field323 != null) {
				long var14 = class48.method258(arg0.field323);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1067; var17++) {
						if (field1011[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1223 == 0) {
					try {
						String var18 = class49.method265(var12, arg3);
						var18 = class65.method343(var18);
						arg0.field282 = var18;
						arg0.field284 = var10 >> 8;
						arg0.field285 = var10 & 0xFF;
						arg0.field283 = 150;

						if (var11 > 1) {
							method391(1, arg0.field323, var18);
						} else {
							method391(2, arg0.field323, var18);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field543 = var12 + var13;
		}

		if ((arg2 & 0x100) == 0x100) {
			arg0.field302 = arg3.method218();
			int var20 = arg3.method221();
			arg0.field306 = var20 >> 16;
			arg0.field305 = (var20 & 0xFFFF) + field1316;
			arg0.field303 = 0;
			arg0.field304 = 0;

			if (arg0.field305 > field1316) {
				arg0.field303 = -1;
			}

			if (arg0.field302 == 0xFFFF) {
				arg0.field302 = -1;
			}
		}

		if ((arg2 & 0x200) == 0x200) {
			arg0.field307 = arg3.method216();
			arg0.field309 = arg3.method216();
			arg0.field308 = arg3.method216();
			arg0.field310 = arg3.method216();
			arg0.field311 = arg3.method218() + field1316;
			arg0.field312 = arg3.method218() + field1316;
			arg0.field313 = arg3.method216();
			arg0.field317 = 0;
			arg0.field318[0] = arg0.field308;
			arg0.field319[0] = arg0.field310;
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method496(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1010; var3++) {
				if (field1204[var3] == arg0) {
					field1010--;
					field1151 = true;

					for (int var4 = var3; var4 < field1010; var4++) {
						field1085[var4] = field1085[var4 + 1];
						field1291[var4] = field1291[var4 + 1];
						field1204[var4] = field1204[var4 + 1];
					}

					field1174.method205(11);
					field1174.method212(arg0);
					return;
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
			field1217[var1] = var0 / 4;
		}
	}
}
