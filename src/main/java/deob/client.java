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
	public boolean field965 = false;

	@ObfuscatedName("client.bb")
	public class41 field966 = new class41();

	@ObfuscatedName("client.cb")
	public int field967 = -1;

	@ObfuscatedName("client.db")
	public class35[] field968 = new class35[50];

	@ObfuscatedName("client.eb")
	public int field969;

	@ObfuscatedName("client.fb")
	public int field970 = 2;

	@ObfuscatedName("client.hb")
	public static int field971 = 10;

	@ObfuscatedName("client.ib")
	public static int field972;

	@ObfuscatedName("client.jb")
	public static boolean field973 = true;

	@ObfuscatedName("client.kb")
	public static boolean field974;

	@ObfuscatedName("client.lb")
	public int[] field975 = new int[50];

	@ObfuscatedName("client.mb")
	public int field976;

	@ObfuscatedName("client.pb")
	public class35 field977;

	@ObfuscatedName("client.qb")
	public class35 field978;

	@ObfuscatedName("client.rb")
	public class35 field979;

	@ObfuscatedName("client.sb")
	public class35 field980;

	@ObfuscatedName("client.tb")
	public class35 field981;

	@ObfuscatedName("client.vb")
	public boolean field982 = false;

	@ObfuscatedName("client.wb")
	public int field983;

	@ObfuscatedName("client.xb")
	public int[] field984 = new int[50];

	@ObfuscatedName("client.yb")
	public String field985;

	@ObfuscatedName("client.bc")
	public static String field1009 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.cc")
	public class37 field1010 = class37.method196(1);

	@ObfuscatedName("client.dc")
	public int field1011;

	@ObfuscatedName("client.ec")
	public int field1012;

	@ObfuscatedName("client.fc")
	public class35[] field1013 = new class35[13];

	@ObfuscatedName("client.gc")
	public int[] field1014 = new int[5];

	@ObfuscatedName("client.ic")
	public int field1015;

	@ObfuscatedName("client.jc")
	public int field1016;

	@ObfuscatedName("client.I")
	public class41 field947 = new class41();

	@ObfuscatedName("client.K")
	public boolean field949 = false;

	@ObfuscatedName("client.L")
	public final int field950 = 100;

	@ObfuscatedName("client.M")
	public int[] field951 = new int[100];

	@ObfuscatedName("client.O")
	public int[] field953 = new int[5];

	@ObfuscatedName("client.P")
	public long[] field954 = new long[100];

	@ObfuscatedName("client.Ab")
	public int field986 = -1;

	@ObfuscatedName("client.Gb")
	public int[] field990 = new int[5];

	@ObfuscatedName("client.Hb")
	public Object field991 = new Object();

	@ObfuscatedName("client.Lb")
	public int field994 = 50;

	@ObfuscatedName("client.Mb")
	public int[] field995 = new int[field994];

	@ObfuscatedName("client.Nb")
	public int[] field996 = new int[field994];

	@ObfuscatedName("client.Ob")
	public int[] field997 = new int[field994];

	@ObfuscatedName("client.Pb")
	public int[] field998 = new int[field994];

	@ObfuscatedName("client.Qb")
	public int[] field999 = new int[field994];

	@ObfuscatedName("client.Rb")
	public int[] field1000 = new int[field994];

	@ObfuscatedName("client.Sb")
	public int[] field1001 = new int[field994];

	@ObfuscatedName("client.Tb")
	public String[] field1002 = new String[field994];

	@ObfuscatedName("client.Wb")
	public byte[] field1005 = new byte[16384];

	@ObfuscatedName("client.tc")
	public int[] field1022 = new int[100];

	@ObfuscatedName("client.uc")
	public String[] field1023 = new String[100];

	@ObfuscatedName("client.vc")
	public String[] field1024 = new String[100];

	@ObfuscatedName("client.yc")
	public int field1026 = 128;

	@ObfuscatedName("client.Jc")
	public class60 field1034 = new class60();

	@ObfuscatedName("client.Oc")
	public class41 field1039 = new class41();

	@ObfuscatedName("client.Qc")
	public int field1040 = 2048;

	@ObfuscatedName("client.Rc")
	public int field1041 = 2047;

	@ObfuscatedName("client.Sc")
	public class26[] field1042 = new class26[field1040];

	@ObfuscatedName("client.Uc")
	public int[] field1044 = new int[field1040];

	@ObfuscatedName("client.Wc")
	public int[] field1046 = new int[field1040];

	@ObfuscatedName("client.Xc")
	public class37[] field1047 = new class37[field1040];

	@ObfuscatedName("client.Yc")
	public int[] field1048 = new int[50];

	@ObfuscatedName("client.Zc")
	public final int[] field1049 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.dd")
	public String[] field1053 = new String[500];

	@ObfuscatedName("client.ed")
	public boolean field1054 = true;

	@ObfuscatedName("client.fd")
	public boolean field1055 = false;

	@ObfuscatedName("client.gd")
	public int[] field1056 = new int[2000];

	@ObfuscatedName("client.hd")
	public boolean field1057 = false;

	@ObfuscatedName("client.ld")
	public int[] field1061 = new int[500];

	@ObfuscatedName("client.md")
	public int[] field1062 = new int[500];

	@ObfuscatedName("client.nd")
	public int[] field1063 = new int[500];

	@ObfuscatedName("client.od")
	public int[] field1064 = new int[500];

	@ObfuscatedName("client.td")
	public int field1069 = -1;

	@ObfuscatedName("client.ud")
	public int field1070 = -1;

	@ObfuscatedName("client.vd")
	public int field1071 = 0x332D25;

	@ObfuscatedName("client.wd")
	public boolean field1072 = true;

	@ObfuscatedName("client.yd")
	public int field1074 = 2;

	@ObfuscatedName("client.zd")
	public int field1075 = -1;

	@ObfuscatedName("client.Ad")
	public int[][] field1076 = new int[104][104];

	@ObfuscatedName("client.Cd")
	public int[][] field1078 = new int[104][104];

	@ObfuscatedName("client.Dd")
	public boolean field1079 = false;

	@ObfuscatedName("client.Fd")
	public int field1081 = 2;

	@ObfuscatedName("client.Gd")
	public String field1082 = "";

	@ObfuscatedName("client.Jd")
	public int field1085 = 1;

	@ObfuscatedName("client.Ld")
	public boolean field1087 = false;

	@ObfuscatedName("client.Pd")
	public int field1091 = 4;

	@ObfuscatedName("client.Qd")
	public boolean field1092 = false;

	@ObfuscatedName("client.Sd")
	public class34[] field1094 = new class34[50];

	@ObfuscatedName("client.Ud")
	public boolean field1096 = false;

	@ObfuscatedName("client.ge")
	public int[] field1108 = new int[151];

	@ObfuscatedName("client.ie")
	public boolean[] field1110 = new boolean[5];

	@ObfuscatedName("client.ke")
	public int field1112 = 0x766654;

	@ObfuscatedName("client.re")
	public class41[][][] field1118 = new class41[4][104][104];

	@ObfuscatedName("client.te")
	public int[] field1120 = new int[1000];

	@ObfuscatedName("client.ue")
	public int[] field1121 = new int[1000];

	@ObfuscatedName("client.xe")
	public int[] field1124 = new int[4000];

	@ObfuscatedName("client.ye")
	public int[] field1125 = new int[4000];

	@ObfuscatedName("client.Ae")
	public String field1127 = "";

	@ObfuscatedName("client.He")
	public CRC32 field1134 = new CRC32();

	@ObfuscatedName("client.Je")
	public class25[] field1135 = new class25[8192];

	@ObfuscatedName("client.Le")
	public int[] field1137 = new int[8192];

	@ObfuscatedName("client.Me")
	public String[] field1138 = new String[100];

	@ObfuscatedName("client.Ne")
	public int field1139 = -1;

	@ObfuscatedName("client.Oe")
	public boolean field1140 = true;

	@ObfuscatedName("client.Pe")
	public boolean field1141 = false;

	@ObfuscatedName("client.Se")
	public int[][] field1143 = new int[104][104];

	@ObfuscatedName("client.af")
	public boolean field1148 = false;

	@ObfuscatedName("client.gf")
	public int[] field1152 = new int[2000];

	@ObfuscatedName("client.hf")
	public boolean field1153 = true;

	@ObfuscatedName("client.uf")
	public int[] field1165 = new int[100];

	@ObfuscatedName("client.xf")
	public class37 field1168 = class37.method196(1);

	@ObfuscatedName("client.yf")
	public class41 field1169 = new class41();

	@ObfuscatedName("client.Df")
	public int[] field1172 = new int[1000];

	@ObfuscatedName("client.Ef")
	public boolean field1173 = false;

	@ObfuscatedName("client.Gf")
	public int[] field1175 = new int[50];

	@ObfuscatedName("client.Hf")
	public String field1176 = "";

	@ObfuscatedName("client.If")
	public String field1177 = "";

	@ObfuscatedName("client.Kf")
	public int field1179 = 1;

	@ObfuscatedName("client.Lf")
	public boolean field1180 = false;

	@ObfuscatedName("client.Mf")
	public int field1181 = -1;

	@ObfuscatedName("client.Nf")
	public int[] field1182 = new int[33];

	@ObfuscatedName("client.Pf")
	public class41 field1184 = new class41();

	@ObfuscatedName("client.Rf")
	public class37 field1186 = class37.method196(1);

	@ObfuscatedName("client.Sf")
	public boolean field1187 = false;

	@ObfuscatedName("client.dg")
	public int[] field1198 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.gg")
	public String field1201 = "";

	@ObfuscatedName("client.jg")
	public boolean field1204 = false;

	@ObfuscatedName("client.og")
	public class34[] field1208 = new class34[20];

	@ObfuscatedName("client.pg")
	public int[] field1209 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Pg")
	public boolean field1233 = false;

	@ObfuscatedName("client.Rg")
	public String field1234 = "";

	@ObfuscatedName("client.Xg")
	public int field1240 = -1;

	@ObfuscatedName("client.Zg")
	public int field1242 = -1;

	@ObfuscatedName("client.ah")
	public int field1243 = -1;

	@ObfuscatedName("client.xh")
	public int field1265 = -1;

	@ObfuscatedName("client.Bh")
	public int field1268 = 0x23201B;

	@ObfuscatedName("client.Ch")
	public boolean field1269 = false;

	@ObfuscatedName("client.Dh")
	public long[] field1270 = new long[100];

	@ObfuscatedName("client.Fh")
	public boolean field1272 = false;

	@ObfuscatedName("client.Gh")
	public int field1273 = -1;

	@ObfuscatedName("client.Lh")
	public boolean field1278 = false;

	@ObfuscatedName("client.Qh")
	public class34[] field1281 = new class34[20];

	@ObfuscatedName("client.Th")
	public String field1284 = "";

	@ObfuscatedName("client.ei")
	public boolean field1294 = false;

	@ObfuscatedName("client.fi")
	public boolean field1295 = false;

	@ObfuscatedName("client.gi")
	public String field1296 = "";

	@ObfuscatedName("client.hi")
	public String field1297 = "";

	@ObfuscatedName("client.ii")
	public int field1298 = 78;

	@ObfuscatedName("client.ki")
	public int[] field1299 = new int[50];

	@ObfuscatedName("client.ni")
	public boolean field1302 = false;

	@ObfuscatedName("client.vi")
	public int[] field1309 = new int[9];

	@ObfuscatedName("client.wi")
	public int field1310 = 3;

	@ObfuscatedName("client.yi")
	public int[] field1312 = new int[5];

	@ObfuscatedName("client.Ai")
	public class57[] field1314 = new class57[4];

	@ObfuscatedName("client.Bi")
	public class34[] field1315 = new class34[1000];

	@ObfuscatedName("client.Ci")
	public int[] field1316 = new int[7];

	@ObfuscatedName("client.Di")
	public int[] field1317 = new int[50];

	@ObfuscatedName("client.Ji")
	public int[] field1322 = new int[151];

	@ObfuscatedName("client.Oi")
	public int[] field1327 = new int[5];

	@ObfuscatedName("client.Vi")
	public int[] field1332 = new int[256];

	@ObfuscatedName("client.Xi")
	public class34[] field1333 = new class34[8];

	@ObfuscatedName("client.Yi")
	public boolean field1334 = false;

	@ObfuscatedName("client.fj")
	public int[] field1341 = new int[33];

	@ObfuscatedName("client.gj")
	public int field1342 = 0x4D4233;

	@ObfuscatedName("client.N")
	public static int[] field952 = new int[99];

	@ObfuscatedName("client.Bd")
	public static final int[] field1077 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.tf")
	public static BigInteger field1164 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ig")
	public static BigInteger field1203 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Qi")
	public static final int[][] field1329 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Xb")
	public int field1006;

	@ObfuscatedName("client.Yb")
	public int field1007;

	@ObfuscatedName("client.nc")
	public int field1017;

	@ObfuscatedName("client.xc")
	public int field1025;

	@ObfuscatedName("client.zc")
	public int field1027;

	@ObfuscatedName("client.Ac")
	public int field1028;

	@ObfuscatedName("client.Bc")
	public int field1029;

	@ObfuscatedName("client.Dc")
	public int field1031;

	@ObfuscatedName("client.Gc")
	public int field1033;

	@ObfuscatedName("client.Tc")
	public int field1043;

	@ObfuscatedName("client.Vc")
	public int field1045;

	@ObfuscatedName("client.ad")
	public int field1050;

	@ObfuscatedName("client.bd")
	public int field1051;

	@ObfuscatedName("client.cd")
	public int field1052;

	@ObfuscatedName("client.jd")
	public int field1059;

	@ObfuscatedName("client.kd")
	public int field1060;

	@ObfuscatedName("client.pd")
	public static int field1065;

	@ObfuscatedName("client.rd")
	public int field1067;

	@ObfuscatedName("client.sd")
	public int field1068;

	@ObfuscatedName("client.xd")
	public int field1073;

	@ObfuscatedName("client.Ed")
	public int field1080;

	@ObfuscatedName("client.Hd")
	public int field1083;

	@ObfuscatedName("client.Id")
	public int field1084;

	@ObfuscatedName("client.Rd")
	public static int field1093;

	@ObfuscatedName("client.Td")
	public int field1095;

	@ObfuscatedName("client.Vd")
	public int field1097;

	@ObfuscatedName("client.Wd")
	public int field1098;

	@ObfuscatedName("client.Xd")
	public int field1099;

	@ObfuscatedName("client.Yd")
	public int field1100;

	@ObfuscatedName("client.ee")
	public int field1106;

	@ObfuscatedName("client.fe")
	public int field1107;

	@ObfuscatedName("client.he")
	public int field1109;

	@ObfuscatedName("client.le")
	public int field1113;

	@ObfuscatedName("client.me")
	public int field1114;

	@ObfuscatedName("client.ne")
	public int field1115;

	@ObfuscatedName("client.oe")
	public int field1116;

	@ObfuscatedName("client.pe")
	public int field1117;

	@ObfuscatedName("client.se")
	public int field1119;

	@ObfuscatedName("client.ve")
	public int field1122;

	@ObfuscatedName("client.we")
	public int field1123;

	@ObfuscatedName("client.ze")
	public int field1126;

	@ObfuscatedName("client.Be")
	public int field1128;

	@ObfuscatedName("client.Ce")
	public int field1129;

	@ObfuscatedName("client.De")
	public int field1130;

	@ObfuscatedName("client.Ee")
	public int field1131;

	@ObfuscatedName("client.Fe")
	public int field1132;

	@ObfuscatedName("client.Ke")
	public int field1136;

	@ObfuscatedName("client.Qe")
	public int field1142;

	@ObfuscatedName("client.Ye")
	public static int field1147;

	@ObfuscatedName("client.cf")
	public static int field1149;

	@ObfuscatedName("client.ef")
	public int field1150;

	@ObfuscatedName("client.ff")
	public int field1151;

	@ObfuscatedName("client.sf")
	public int field1163;

	@ObfuscatedName("client.vf")
	public static int field1166;

	@ObfuscatedName("client.wf")
	public static int field1167;

	@ObfuscatedName("client.zf")
	public static int field1170;

	@ObfuscatedName("client.Cf")
	public int field1171;

	@ObfuscatedName("client.Ff")
	public int field1174;

	@ObfuscatedName("client.Jf")
	public int field1178;

	@ObfuscatedName("client.Of")
	public int field1183;

	@ObfuscatedName("client.Qf")
	public int field1185;

	@ObfuscatedName("client.eg")
	public int field1199;

	@ObfuscatedName("client.fg")
	public static int field1200;

	@ObfuscatedName("client.hg")
	public int field1202;

	@ObfuscatedName("client.lg")
	public int field1206;

	@ObfuscatedName("client.ng")
	public int field1207;

	@ObfuscatedName("client.qg")
	public int field1210;

	@ObfuscatedName("client.rg")
	public int field1211;

	@ObfuscatedName("client.sg")
	public int field1212;

	@ObfuscatedName("client.tg")
	public int field1213;

	@ObfuscatedName("client.ug")
	public int field1214;

	@ObfuscatedName("client.vg")
	public int field1215;

	@ObfuscatedName("client.xg")
	public int field1216;

	@ObfuscatedName("client.yg")
	public int field1217;

	@ObfuscatedName("client.zg")
	public int field1218;

	@ObfuscatedName("client.Ag")
	public int field1219;

	@ObfuscatedName("client.Bg")
	public int field1220;

	@ObfuscatedName("client.Dg")
	public int field1222;

	@ObfuscatedName("client.Eg")
	public int field1223;

	@ObfuscatedName("client.Fg")
	public int field1224;

	@ObfuscatedName("client.Gg")
	public int field1225;

	@ObfuscatedName("client.Hg")
	public int field1226;

	@ObfuscatedName("client.Og")
	public int field1232;

	@ObfuscatedName("client.Sg")
	public int field1235;

	@ObfuscatedName("client.Tg")
	public int field1236;

	@ObfuscatedName("client.Ug")
	public int field1237;

	@ObfuscatedName("client.Vg")
	public int field1238;

	@ObfuscatedName("client.Wg")
	public int field1239;

	@ObfuscatedName("client.Yg")
	public int field1241;

	@ObfuscatedName("client.ih")
	public int field1250;

	@ObfuscatedName("client.jh")
	public int field1251;

	@ObfuscatedName("client.kh")
	public int field1252;

	@ObfuscatedName("client.lh")
	public int field1253;

	@ObfuscatedName("client.mh")
	public int field1254;

	@ObfuscatedName("client.nh")
	public int field1255;

	@ObfuscatedName("client.oh")
	public int field1256;

	@ObfuscatedName("client.ph")
	public int field1257;

	@ObfuscatedName("client.qh")
	public int field1258;

	@ObfuscatedName("client.rh")
	public int field1259;

	@ObfuscatedName("client.sh")
	public int field1260;

	@ObfuscatedName("client.th")
	public int field1261;

	@ObfuscatedName("client.uh")
	public int field1262;

	@ObfuscatedName("client.vh")
	public int field1263;

	@ObfuscatedName("client.wh")
	public int field1264;

	@ObfuscatedName("client.Ah")
	public int field1267;

	@ObfuscatedName("client.Eh")
	public int field1271;

	@ObfuscatedName("client.Nh")
	public static int field1279;

	@ObfuscatedName("client.Ph")
	public int field1280;

	@ObfuscatedName("client.Sh")
	public int field1283;

	@ObfuscatedName("client.Yh")
	public static int field1288;

	@ObfuscatedName("client.Zh")
	public int field1289;

	@ObfuscatedName("client.ai")
	public int field1290;

	@ObfuscatedName("client.bi")
	public int field1291;

	@ObfuscatedName("client.ci")
	public int field1292;

	@ObfuscatedName("client.mi")
	public int field1301;

	@ObfuscatedName("client.oi")
	public int field1303;

	@ObfuscatedName("client.ui")
	public int field1308;

	@ObfuscatedName("client.xi")
	public static int field1311;

	@ObfuscatedName("client.zi")
	public static int field1313;

	@ObfuscatedName("client.Ni")
	public int field1326;

	@ObfuscatedName("client.Pi")
	public int field1328;

	@ObfuscatedName("client.Ti")
	public int field1330;

	@ObfuscatedName("client.Ui")
	public int field1331;

	@ObfuscatedName("client.Zi")
	public int field1335;

	@ObfuscatedName("client.aj")
	public int field1336;

	@ObfuscatedName("client.bj")
	public int field1337;

	@ObfuscatedName("client.cj")
	public int field1338;

	@ObfuscatedName("client.dj")
	public int field1339;

	@ObfuscatedName("client.ej")
	public int field1340;

	@ObfuscatedName("client.hj")
	public static int field1343;

	@ObfuscatedName("client.J")
	public int field948;

	@ObfuscatedName("client.Q")
	public static int field955;

	@ObfuscatedName("client.R")
	public int field956;

	@ObfuscatedName("client.U")
	public int field959;

	@ObfuscatedName("client.V")
	public int field960;

	@ObfuscatedName("client.W")
	public int field961;

	@ObfuscatedName("client.X")
	public int field962;

	@ObfuscatedName("client.Y")
	public int field963;

	@ObfuscatedName("client.Z")
	public static int field964;

	@ObfuscatedName("client.Bb")
	public int field987;

	@ObfuscatedName("client.Cb")
	public int field988;

	@ObfuscatedName("client.Eb")
	public int field989;

	@ObfuscatedName("client.Kb")
	public int field993;

	@ObfuscatedName("client.Ec")
	public long field1032;

	@ObfuscatedName("client.id")
	public long field1058;

	@ObfuscatedName("client.je")
	public long field1111;

	@ObfuscatedName("client.Ki")
	public class18 field1323;

	@ObfuscatedName("client.Cc")
	public class26 field1030;

	@ObfuscatedName("client.Zb")
	public class34 field1008;

	@ObfuscatedName("client.Kc")
	public class34 field1035;

	@ObfuscatedName("client.Lc")
	public class34 field1036;

	@ObfuscatedName("client.Mc")
	public class34 field1037;

	@ObfuscatedName("client.Nc")
	public class34 field1038;

	@ObfuscatedName("client.hh")
	public class34 field1249;

	@ObfuscatedName("client.Li")
	public class34 field1324;

	@ObfuscatedName("client.Mi")
	public class34 field1325;

	@ObfuscatedName("client.S")
	public class34 field957;

	@ObfuscatedName("client.T")
	public class34 field958;

	@ObfuscatedName("client.Jb")
	public class34 field992;

	@ObfuscatedName("client.Ub")
	public class35 field1003;

	@ObfuscatedName("client.Vb")
	public class35 field1004;

	@ObfuscatedName("client.Zd")
	public class35 field1101;

	@ObfuscatedName("client.ae")
	public class35 field1102;

	@ObfuscatedName("client.bh")
	public class35 field1244;

	@ObfuscatedName("client.ch")
	public class35 field1245;

	@ObfuscatedName("client.dh")
	public class35 field1246;

	@ObfuscatedName("client.eh")
	public class35 field1247;

	@ObfuscatedName("client.fh")
	public class35 field1248;

	@ObfuscatedName("client.Vh")
	public class35 field1285;

	@ObfuscatedName("client.Wh")
	public class35 field1286;

	@ObfuscatedName("client.Xh")
	public class35 field1287;

	@ObfuscatedName("client.Ei")
	public class35 field1318;

	@ObfuscatedName("client.Fi")
	public class35 field1319;

	@ObfuscatedName("client.Gi")
	public class35 field1320;

	@ObfuscatedName("client.Hh")
	public class36 field1274;

	@ObfuscatedName("client.Ih")
	public class36 field1275;

	@ObfuscatedName("client.Jh")
	public class36 field1276;

	@ObfuscatedName("client.Kh")
	public class36 field1277;

	@ObfuscatedName("client.pc")
	public class43 field1018;

	@ObfuscatedName("client.qc")
	public class43 field1019;

	@ObfuscatedName("client.rc")
	public class43 field1020;

	@ObfuscatedName("client.sc")
	public class43 field1021;

	@ObfuscatedName("client.be")
	public class43 field1103;

	@ObfuscatedName("client.ce")
	public class43 field1104;

	@ObfuscatedName("client.de")
	public class43 field1105;

	@ObfuscatedName("client.jf")
	public class43 field1154;

	@ObfuscatedName("client.kf")
	public class43 field1155;

	@ObfuscatedName("client.lf")
	public class43 field1156;

	@ObfuscatedName("client.mf")
	public class43 field1157;

	@ObfuscatedName("client.nf")
	public class43 field1158;

	@ObfuscatedName("client.of")
	public class43 field1159;

	@ObfuscatedName("client.pf")
	public class43 field1160;

	@ObfuscatedName("client.qf")
	public class43 field1161;

	@ObfuscatedName("client.rf")
	public class43 field1162;

	@ObfuscatedName("client.Tf")
	public class43 field1188;

	@ObfuscatedName("client.Uf")
	public class43 field1189;

	@ObfuscatedName("client.Vf")
	public class43 field1190;

	@ObfuscatedName("client.Wf")
	public class43 field1191;

	@ObfuscatedName("client.Xf")
	public class43 field1192;

	@ObfuscatedName("client.Yf")
	public class43 field1193;

	@ObfuscatedName("client.Zf")
	public class43 field1194;

	@ObfuscatedName("client.ag")
	public class43 field1195;

	@ObfuscatedName("client.bg")
	public class43 field1196;

	@ObfuscatedName("client.cg")
	public class43 field1197;

	@ObfuscatedName("client.li")
	public class46 field1300;

	@ObfuscatedName("client.zh")
	public class47 field1266;

	@ObfuscatedName("client.kg")
	public class4 field1205;

	@ObfuscatedName("client.qd")
	public String field1066;

	@ObfuscatedName("client.Ge")
	public String field1133;

	@ObfuscatedName("client.Ue")
	public String field1144;

	@ObfuscatedName("client.di")
	public String field1293;

	@ObfuscatedName("client.Kd")
	public static boolean field1086;

	@ObfuscatedName("client.Nd")
	public int[] field1089;

	@ObfuscatedName("client.Od")
	public int[] field1090;

	@ObfuscatedName("client.Cg")
	public int[] field1221;

	@ObfuscatedName("client.Jg")
	public int[] field1227;

	@ObfuscatedName("client.Kg")
	public int[] field1228;

	@ObfuscatedName("client.Lg")
	public int[] field1229;

	@ObfuscatedName("client.Mg")
	public int[] field1230;

	@ObfuscatedName("client.Ng")
	public int[] field1231;

	@ObfuscatedName("client.qi")
	public int[] field1304;

	@ObfuscatedName("client.ri")
	public int[] field1305;

	@ObfuscatedName("client.si")
	public int[] field1306;

	@ObfuscatedName("client.ti")
	public int[] field1307;

	@ObfuscatedName("client.We")
	public class35[] field1146;

	@ObfuscatedName("client.Rh")
	public byte[][] field1282;

	@ObfuscatedName("client.Hi")
	public byte[][] field1321;

	@ObfuscatedName("client.Md")
	public byte[][][] field1088;

	@ObfuscatedName("client.Ve")
	public int[][][] field1145;

	@ObfuscatedName("client.f(I)V")
	public final void method363() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field969 + field1027 & 0x7FF;
				int var4 = class33.field503[var3];
				int var5 = class33.field504[var3];
				var4 = (field1178 + 256) * var4 >> 8;
				var5 = (field1178 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1030.field269 + var6 >> 7;
				int var9 = field1030.field270 - var7 >> 7;
				boolean var10 = method454(field1030.field318[0], 0, 0, var8, var9, true, 0, field1030.field317[0], 0, 1, 0);
				if (var10) {
					field1186.method199(var1);
					field1186.method199(var2);
					field1186.method200(field1027);
					field1186.method199(57);
					field1186.method199(field969);
					field1186.method199(field1178);
					field1186.method199(89);
					field1186.method200(field1030.field269);
					field1186.method200(field1030.field270);
					field1186.method199(field1206);
					field1186.method199(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIILhc;)V")
	public final void method364(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5) {
		if (arg5.field842 == 0 && arg5.field856 != null && !arg5.field855 && (arg0 >= arg1 && arg3 >= arg4 && arg0 <= arg5.field845 + arg1 && arg3 <= arg5.field846 + arg4)) {
			int var7 = arg5.field856.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field857[var8] + arg1;
				int var10 = arg5.field858[var8] + arg4 - arg2;
				class60 var11 = class60.field835[arg5.field856[var8]];
				var9 += var11.field847;
				var10 += var11.field848;
				if ((var11.field852 >= 0 || var11.field878 != 0) && arg0 >= var9 && arg3 >= var10 && arg0 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
					if (var11.field852 >= 0) {
						field1280 = var11.field852;
					} else {
						field1280 = var11.field840;
					}
				}

				if (var11.field842 == 0) {
					method364(arg0, var9, var11.field854, arg3, var10, var11);

					if (var11.field853 > var11.field846) {
						method378(var11, arg0, var10, var11.field846, var11.field853, var11.field845 + var9, arg3, true);
					}
				} else {
					if (var11.field843 == 1 && arg0 >= var9 && arg3 >= var10 && arg0 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						boolean var12 = false;
						if (var11.field844 != 0) {
							var12 = method365(var11);
						}

						if (!var12) {
							field1053[field1174] = var11.field891;
							field1063[field1174] = 706;
							field1062[field1174] = var11.field840;
							field1174++;
						}
					}

					if (var11.field843 == 2 && field1290 == 0 && arg0 >= var9 && arg3 >= var10 && arg0 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						String var13 = var11.field888;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1053[field1174] = var13 + " @gre@" + var11.field889;
						field1063[field1174] = 941;
						field1062[field1174] = var11.field840;
						field1174++;
					}

					if (var11.field843 == 3 && arg0 >= var9 && arg3 >= var10 && arg0 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1053[field1174] = "Close";
						field1063[field1174] = 309;
						field1062[field1174] = var11.field840;
						field1174++;
					}

					if (var11.field843 == 4 && arg0 >= var9 && arg3 >= var10 && arg0 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1053[field1174] = var11.field891;
						field1063[field1174] = 967;
						field1062[field1174] = var11.field840;
						field1174++;
					}

					if (var11.field843 == 5 && arg0 >= var9 && arg3 >= var10 && arg0 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1053[field1174] = var11.field891;
						field1063[field1174] = 672;
						field1062[field1174] = var11.field840;
						field1174++;
					}

					if (var11.field843 == 6 && !field1204 && arg0 >= var9 && arg3 >= var10 && arg0 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1053[field1174] = var11.field891;
						field1063[field1174] = 73;
						field1062[field1174] = var11.field840;
						field1174++;
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

								if (arg0 >= var17 && arg3 >= var18 && arg0 < var17 + 32 && arg3 < var18 + 32) {
									field1059 = var14;
									field1060 = var11.field840;

									if (var11.field836[var14] > 0) {
										class55 var19 = class55.method287(var11.field836[var14] - 1);
										if (field1129 == 1 && var11.field862) {
											if (field1131 != var11.field840 || field1130 != var14) {
												field1053[field1174] = "Use " + field1133 + " with @lre@" + var19.field774;
												field1063[field1174] = 237;
												field1064[field1174] = var19.field772;
												field1061[field1174] = var14;
												field1062[field1174] = var11.field840;
												field1174++;
											}
										} else if (field1290 != 1 || !var11.field862) {
											if (var11.field862) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field789 != null && var19.field789[var20] != null) {
														field1053[field1174] = var19.field789[var20] + " @lre@" + var19.field774;

														if (var20 == 3) {
															field1063[field1174] = 120;
														}

														if (var20 == 4) {
															field1063[field1174] = 796;
														}

														field1064[field1174] = var19.field772;
														field1061[field1174] = var14;
														field1062[field1174] = var11.field840;
														field1174++;
													} else if (var20 == 4) {
														field1053[field1174] = "Drop @lre@" + var19.field774;
														field1063[field1174] = 796;
														field1064[field1174] = var19.field772;
														field1061[field1174] = var14;
														field1062[field1174] = var11.field840;
														field1174++;
													}
												}
											}

											if (var11.field863) {
												field1053[field1174] = "Use @lre@" + var19.field774;
												field1063[field1174] = 357;
												field1064[field1174] = var19.field772;
												field1061[field1174] = var14;
												field1062[field1174] = var11.field840;
												field1174++;
											}

											if (var11.field862 && var19.field789 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field789[var21] != null) {
														field1053[field1174] = var19.field789[var21] + " @lre@" + var19.field774;

														if (var21 == 0) {
															field1063[field1174] = 871;
														}

														if (var21 == 1) {
															field1063[field1174] = 526;
														}

														if (var21 == 2) {
															field1063[field1174] = 156;
														}

														field1064[field1174] = var19.field772;
														field1061[field1174] = var14;
														field1062[field1174] = var11.field840;
														field1174++;
													}
												}
											}

											if (var11.field869 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field869[var22] != null) {
														field1053[field1174] = var11.field869[var22] + " @lre@" + var19.field774;

														if (var22 == 0) {
															field1063[field1174] = 134;
														}

														if (var22 == 1) {
															field1063[field1174] = 701;
														}

														if (var22 == 2) {
															field1063[field1174] = 570;
														}

														if (var22 == 3) {
															field1063[field1174] = 719;
														}

														if (var22 == 4) {
															field1063[field1174] = 440;
														}

														field1064[field1174] = var19.field772;
														field1061[field1174] = var14;
														field1062[field1174] = var11.field840;
														field1174++;
													}
												}
											}

											field1053[field1174] = "Examine @lre@" + var19.field774;
											field1063[field1174] = 1974;
											field1064[field1174] = var19.field772;
											field1062[field1174] = var11.field837[var14];
											field1174++;
										} else if ((field1292 & 0x10) == 0x10) {
											field1053[field1174] = field1293 + " @lre@" + var19.field774;
											field1063[field1174] = 63;
											field1064[field1174] = var19.field772;
											field1061[field1174] = var14;
											field1062[field1174] = var11.field840;
											field1174++;
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

	@ObfuscatedName("client.a(ZLhc;)Z")
	public final boolean method365(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1053[field1174] = "Remove @whi@" + field1138[var2];
			field1063[field1174] = 804;
			field1174++;
			field1053[field1174] = "Message @whi@" + field1138[var2];
			field1063[field1174] = 125;
			field1174++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1053[field1174] = "Remove @whi@" + arg0.field874;
			field1063[field1174] = 521;
			field1174++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method366() {
		byte[] var1 = field1266.method250("title.dat", null);
		class34 var2 = new class34(var1, this);
		field1157.method235();
		var2.method171(0, 0);
		field1158.method235();
		var2.method171(-661, 0);
		field1154.method235();
		var2.method171(-128, 0);
		field1155.method235();
		var2.method171(-214, -386);
		field1156.method235();
		var2.method171(-214, -186);
		field1159.method235();
		var2.method171(0, -265);
		field1160.method235();
		var2.method171(-574, -265);
		field1161.method235();
		var2.method171(-128, -186);
		field1162.method235();
		var2.method171(-574, -186);
		int[] var3 = new int[var2.field518];
		for (int var4 = 0; var4 < var2.field519; var4++) {
			for (int var5 = 0; var5 < var2.field518; var5++) {
				var3[var5] = var2.field517[var2.field518 * var4 + var2.field518 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field518; var6++) {
				var2.field517[var2.field518 * var4 + var6] = var3[var6];
			}
		}

		field1157.method235();
		var2.method171(394, 0);
		field1158.method235();
		var2.method171(-267, 0);
		field1154.method235();
		var2.method171(266, 0);
		field1155.method235();
		var2.method171(180, -386);
		field1156.method235();
		var2.method171(180, -186);
		field1159.method235();
		var2.method171(394, -265);
		field1160.method235();
		var2.method171(-180, -265);
		field1161.method235();
		var2.method171(212, -186);
		field1162.method235();
		var2.method171(-180, -186);
		class34 var7 = new class34(field1266, "logo", 0);
		field1154.method235();
		var7.method173(field6 / 2 - var7.field518 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ZLhc;I)I")
	public final int method367(class60 arg0, int arg1) {
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
					var4 += field1299[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field984[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1175[var3[var5++]];
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
					var4 += field1152[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field952[field984[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1152[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1030.field328;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field984[var10];
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
					var4 += field1289;
				}

				if (var6 == 12) {
					var4 += field1207;
				}

				if (var6 == 13) {
					int var14 = field1152[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method368() {
		try {
			if (field1205 != null) {
				field1205.method29();
			}
		} catch (Exception var2) {
		}

		field1205 = null;
		field965 = false;
		field1202 = 0;
		field1296 = "";
		field1297 = "";
		class5.method35(false);
		method449();
		field1323.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1314[var1].method295();
		}

		System.gc();
		method384();
		field1066 = null;
		field1126 = 0;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method369() {
		for (class27 var1 = (class27) field1169.method228(); var1 != null; var1 = (class27) field1169.method230()) {
			if (field1017 != var1.field344 || field1147 > var1.field350) {
				var1.method107();
			} else if (field1147 >= var1.field349) {
				if (var1.field353 > 0) {
					class25 var2 = field1135[var1.field353 - 1];
					if (var2 != null) {
						var1.method116(var2.field269, method447(var2.field270, var2.field269, var1.field344) - var1.field348, var2.field270, field1147);
					}
				}

				if (var1.field353 < 0) {
					int var3 = -var1.field353 - 1;
					class26 var4;
					if (field1181 == var3) {
						var4 = field1030;
					} else {
						var4 = field1042[var3];
					}

					if (var4 != null) {
						var1.method116(var4.field269, method447(var4.field270, var4.field269, var1.field344) - var1.field348, var4.field270, field1147);
					}
				}

				var1.method117(field989);
				field1323.method61(60, var1.field363, (int) var1.field355, (int) var1.field357, -1, field1017, var1, null, (int) var1.field356, false);
			}
		}
	}

	@ObfuscatedName("client.h(I)Ljava/net/Socket;")
	public final Socket method370(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.i(I)V")
	public final void method371() {
		if (field1239 > 0) {
			method368();
		} else {
			field1020.method235();
			field1275.method188(257, 144, "Connection lost", 0);
			field1275.method188(256, 143, "Connection lost", 0xFFFFFF);
			field1275.method188(257, 159, "Please wait - attempting to reestablish", 0);
			field1275.method188(256, 158, "Please wait - attempting to reestablish", 0xFFFFFF);
			field1020.method236(11, field8, 8);
			field1006 = 0;
			class4 var1 = field1205;
			field965 = false;
			method456(field1296, field1297, true);

			if (!field965) {
				method368();
			}

			try {
				var1.method29();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method372(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1331; var3++) {
				if (field954[var3] == arg0) {
					field1331--;
					field1294 = true;

					for (int var4 = var3; var4 < field1331; var4++) {
						field954[var4] = field954[var4 + 1];
					}

					field1186.method198(68);
					field1186.method205(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method373(long arg0) {
		if (arg0 != 0L) {
			if (field956 >= 100) {
				method391("Your friends list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field956; var4++) {
					if (field1270[var4] == arg0) {
						method391(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1331; var5++) {
					if (field954[var5] == arg0) {
						method391("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field1030.field322)) {
					field1138[field956] = var3;
					field1270[field956] = arg0;
					field1165[field956] = 0;
					field956++;
					field1294 = true;
					field1186.method198(66);
					field1186.method205(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method374() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field1328 = (field1328 + 1) % 4;
				field1079 = true;
				field1173 = true;
				field1186.method198(197);
				field1186.method199(field1328);
				field1186.method199(field1123);
				field1186.method199(field1083);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field1123 = (field1123 + 1) % 3;
				field1079 = true;
				field1173 = true;
				field1186.method198(197);
				field1186.method199(field1328);
				field1186.method199(field1123);
				field1186.method199(field1083);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field1083 = (field1083 + 1) % 3;
				field1079 = true;
				field1173 = true;
				field1186.method198(197);
				field1186.method199(field1328);
				field1186.method199(field1123);
				field1186.method199(field1083);
			}

			if (field18 >= 416 && field18 <= 516 && field19 >= 490 && field19 <= 522) {
				method398();
				field1127 = "";
				field1269 = false;

				for (int var1 = 0; var1 < class60.field835.length; var1++) {
					if (class60.field835[var1] != null && class60.field835[var1].field844 == 600) {
						field1273 = field1240 = class60.field835[var1].field841;
						break;
					}
				}
			}

			field1343++;
			if (field1343 > 195) {
				field1343 = 0;
				field1186.method198(24);
				field1186.method199(239);
				return;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method375() {
		if (field1308 == 2) {
			for (class39 var1 = (class39) field1184.method228(); var1 != null; var1 = (class39) field1184.method230()) {
				if (field1147 >= var1.field570) {
					method445(var1.field564, var1.field568, var1.field569, var1.field566, var1.field565, var1.field563, var1.field567);
					var1.method107();
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method376() {
		int var1 = field1030.field269 + field1080;
		int var2 = field1030.field270 + field1073;
		if (field1050 - var1 < -500 || field1050 - var1 > 500 || field1051 - var2 < -500 || field1051 - var2 > 500) {
			field1050 = var1;
			field1051 = var2;
		}

		if (field1050 != var1) {
			field1050 += (var1 - field1050) / 16;
		}

		if (field1051 != var2) {
			field1051 += (var2 - field1051) / 16;
		}

		if (field20[1] == 1) {
			field1028 += (-field1028 - 24) / 2;
		} else if (field20[2] == 1) {
			field1028 += (24 - field1028) / 2;
		} else {
			field1028 /= 2;
		}

		if (field20[3] == 1) {
			field1029 += (12 - field1029) / 2;
		} else if (field20[4] == 1) {
			field1029 += (-field1029 - 12) / 2;
		} else {
			field1029 /= 2;
		}

		field1027 = field1028 / 2 + field1027 & 0x7FF;
		field1026 += field1029 / 2;
		if (field1026 < 128) {
			field1026 = 128;
		}

		if (field1026 > 383) {
			field1026 = 383;
		}

		int var3 = field1050 >> 7;
		int var4 = field1051 >> 7;
		int var5 = method447(field1051, field1050, field1017);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1017;
					if (var9 < 3 && (field1088[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field1145[var9][var7][var8];
					if (var10 > var6) {
						var6 = var10;
					}
				}
			}
		}

		field1093++;
		if (field1093 > 77) {
			field1093 = 0;
			field1186.method198(57);
		}

		int var11 = var6 * 192;
		if (var11 > 98048) {
			var11 = 98048;
		}

		if (var11 < 32768) {
			var11 = 32768;
		}

		if (var11 > field1015) {
			field1015 += (var11 - field1015) / 24;
		} else if (var11 < field1015) {
			field1015 += (var11 - field1015) / 80;
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method377(int arg0) {
		int[] var2 = field1008.field517;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1088[arg0][var7][var5] & 0x18) == 0) {
					field1323.method86(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1088[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1323.method86(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field1008.method170();

		for (int var8 = 1; var8 < 103; var8++) {
			for (int var9 = 1; var9 < 103; var9++) {
				if ((field1088[arg0][var9][var8] & 0x18) == 0) {
					method403(var9, arg0, var8);
				}

				if (arg0 < 3 && (field1088[arg0 + 1][var9][var8] & 0x8) != 0) {
					method403(var9, arg0 + 1, var8);
				}
			}
		}

		field1020.method235();
		field1119 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = field1323.method80(field1017, var10, var11);
				if (var12 != 0) {
					var12 = var12 >> 14 & 0x7FFF;
					int var13 = class53.method275(var12).field724;
					if (var13 >= 0) {
						field1315[field1119] = field1094[var13];
						field1120[field1119] = var10;
						field1121[field1119] = var11;
						field1119++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLhc;IIIIIIZ)V")
	public final void method378(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (field1278) {
			field1326 = 32;
		} else {
			field1326 = 0;
		}

		field1278 = false;
		if (arg1 >= arg5 && arg1 < arg5 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
			arg0.field854 -= field1012 * 4;

			if (arg7) {
				field1294 = true;
				return;
			}
		} else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
			arg0.field854 += field1012 * 4;

			if (arg7) {
				field1294 = true;
				return;
			}
		} else if (arg1 >= arg5 - field1326 && arg1 < arg5 + field1326 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16 && field1012 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg4;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg2 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg0.field854 = (arg4 - arg3) * var10 / var11;

			if (arg7) {
				field1294 = true;
			}

			field1278 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(ILhb;IZ)V")
	public final void method379(int arg0, class34 arg1, int arg2) {
		int var4 = field969 + field1027 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field480[var4];
			int var7 = class31.field481[var4];
			var6 = var6 * 256 / (field1178 + 256);
			var7 = var7 * 256 / (field1178 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method180(var8 + 94 - arg1.field522 / 2, 83 - var9 - arg1.field523 / 2, field1319);
			} else {
				arg1.method173(var8 + 94 - arg1.field522 / 2, 83 - var9 - arg1.field523 / 2);
			}
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method380(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method381() {
		method478();

		if (field1340 == 1) {
			field1333[field1339 / 100].method173(field1337 - 8 - 8, field1338 - 8 - 11);
		}

		if (field1340 == 2) {
			field1333[field1339 / 100 + 4].method173(field1337 - 8 - 8, field1338 - 8 - 11);
			field1288++;
			if (field1288 > 161) {
				field1288 = 0;
				field1186.method198(128);
				field1186.method200(9331);
			}
		}

		if (field1240 != -1) {
			method486(field1240, field989);
			method409(class60.field835[field1240], 0, 0, 0);
		}

		method484();

		if (!field1087) {
			method443();
			method397();
		} else if (field959 == 0) {
			method444();
		}

		if (field1031 == 1) {
			if (field1185 > 0 || field1335 == 1) {
				field1208[1].method173(472, 258);
			} else {
				field1208[1].method173(472, 296);
			}
		}

		if (field1185 > 0) {
			field1208[0].method173(472, 296);
			field1275.method188(484, 329, "Level: " + field1185, 0xFFFF00);
		}

		if (field1335 == 1) {
			field1208[6].method173(472, 296);
			field1275.method188(484, 329, "Arena", 0xFFFF00);
		}

		if (field1330 != 0) {
			int var1 = field1330 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1275.method191(4, 0xFFFF00, "System update in: " + var2 + ":0" + var1, 329);
			} else {
				field1275.method191(4, 0xFFFF00, "System update in: " + var2 + ":" + var1, 329);
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method382() {
		if (field1154 == null) {
			field9 = null;
			field1021 = null;
			field1019 = null;
			field1018 = null;
			field1020 = null;
			field1103 = null;
			field1104 = null;
			field1105 = null;
			field1157 = new class43(265, method11(), 128);
			class32.method148();
			field1158 = new class43(265, method11(), 128);
			class32.method148();
			field1154 = new class43(186, method11(), 533);
			class32.method148();
			field1155 = new class43(146, method11(), 360);
			class32.method148();
			field1156 = new class43(200, method11(), 360);
			class32.method148();
			field1159 = new class43(267, method11(), 214);
			class32.method148();
			field1160 = new class43(267, method11(), 215);
			class32.method148();
			field1161 = new class43(79, method11(), 86);
			class32.method148();
			field1162 = new class43(79, method11(), 87);
			class32.method148();

			if (field1266 != null) {
				method366();
				method476();
			}

			field1233 = true;
		}
	}

	@ObfuscatedName("client.a(IZ)Z")
	public final boolean method383(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1063[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 447) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method384() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(BII)V")
	public final void method385(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1024[var4] != null) {
				int var5 = field1022[var4];
				int var6 = field1163 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1328 == 0 || field1328 == 1 && method464(field1023[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !field1023[var4].equals(field1030.field322)) {
						if (field1148) {
							field1053[field1174] = "Report abuse @whi@" + field1023[var4];
							field1063[field1174] = 316;
							field1174++;
						}

						field1053[field1174] = "Add ignore @whi@" + field1023[var4];
						field1063[field1174] = 158;
						field1174++;
						field1053[field1174] = "Add friend @whi@" + field1023[var4];
						field1063[field1174] = 447;
						field1174++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field948 == 0 && (var5 == 7 || field1123 == 0 || field1123 == 1 && method464(field1023[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1148) {
							field1053[field1174] = "Report abuse @whi@" + field1023[var4];
							field1063[field1174] = 316;
							field1174++;
						}

						field1053[field1174] = "Add ignore @whi@" + field1023[var4];
						field1063[field1174] = 158;
						field1174++;
						field1053[field1174] = "Add friend @whi@" + field1023[var4];
						field1063[field1174] = 447;
						field1174++;
					}

					var3++;
				}

				if (var5 == 4 && (field1083 == 0 || field1083 == 1 && method464(field1023[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1053[field1174] = "Accept trade @whi@" + field1023[var4];
						field1063[field1174] = 595;
						field1174++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field948 == 0 && field1123 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1083 == 0 || field1083 == 1 && method464(field1023[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1053[field1174] = "Accept duel @whi@" + field1023[var4];
						field1063[field1174] = 835;
						field1174++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILkb;Lz;I)V")
	public final void method386(int arg0, int arg1, class37 arg2, class26 arg3) {
		if ((arg1 & 0x1) == 1) {
			int var5 = arg2.method209();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg2.method218(0, var6, var5);
			field1047[arg0] = var7;
			arg3.method113(var7);
		}

		if ((arg1 & 0x2) == 2) {
			int var8 = arg2.method211();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg3.field296 == var8) {
				arg3.field300 = 0;
			}

			int var9 = arg2.method209();
			if (var8 == -1 || arg3.field296 == -1 || class62.field901[var8].field909 > class62.field901[arg3.field296].field909 || class62.field901[arg3.field296].field909 == 0) {
				arg3.field296 = var8;
				arg3.field297 = 0;
				arg3.field298 = 0;
				arg3.field299 = var9;
				arg3.field300 = 0;
			}
		}

		if ((arg1 & 0x4) == 4) {
			arg3.field290 = arg2.method211();
			if (arg3.field290 == 0xFFFF) {
				arg3.field290 = -1;
			}
		}

		if ((arg1 & 0x8) == 8) {
			arg3.field281 = arg2.method216();
			arg3.field283 = 0;
			arg3.field284 = 0;
			arg3.field282 = 150;
			method391(arg3.field281, 2, arg3.field322);
		}

		if ((arg1 & 0x10) == 0x10) {
			arg3.field285 = arg2.method209();
			arg3.field286 = arg2.method209();
			arg3.field287 = field1147 + 400;
			arg3.field288 = arg2.method209();
			arg3.field289 = arg2.method209();
		}

		if ((arg1 & 0x20) == 0x20) {
			arg3.field291 = arg2.method211();
			arg3.field292 = arg2.method211();
		}

		if ((arg1 & 0x40) == 0x40) {
			int var10 = arg2.method211();
			int var11 = arg2.method209();
			int var12 = arg2.method209();
			int var13 = arg2.field542;

			if (arg3.field322 != null) {
				long var14 = class48.method251(arg3.field322);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1331; var17++) {
						if (field954[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1128 == 0) {
					try {
						String var18 = class49.method258(var12, arg2);
						var18 = class65.method335(var18);
						arg3.field281 = var18;
						arg3.field283 = var10 >> 8;
						arg3.field284 = var10 & 0xFF;
						arg3.field282 = 150;

						if (var11 > 1) {
							method391(var18, 1, arg3.field322);
						} else {
							method391(var18, 2, arg3.field322);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field542 = var12 + var13;
		}

		if ((arg1 & 0x100) == 0x100) {
			arg3.field301 = arg2.method211();
			int var20 = arg2.method214();
			arg3.field305 = var20 >> 16;
			arg3.field304 = (var20 & 0xFFFF) + field1147;
			arg3.field302 = 0;
			arg3.field303 = 0;

			if (arg3.field304 > field1147) {
				arg3.field302 = -1;
			}

			if (arg3.field301 == 0xFFFF) {
				arg3.field301 = -1;
			}
		}

		if ((arg1 & 0x200) == 0x200) {
			arg3.field306 = arg2.method209();
			arg3.field308 = arg2.method209();
			arg3.field307 = arg2.method209();
			arg3.field309 = arg2.method209();
			arg3.field310 = arg2.method211() + field1147;
			arg3.field311 = arg2.method211() + field1147;
			arg3.field312 = arg2.method209();
			arg3.field316 = 0;
			arg3.field317[0] = arg3.field307;
			arg3.field318[0] = arg3.field309;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method387() {
		short var1 = 256;

		if (field1150 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1150 > 768) {
					field1304[var2] = method480(1024 - field1150, field1305[var2], field1306[var2]);
				} else if (field1150 > 256) {
					field1304[var2] = field1306[var2];
				} else {
					field1304[var2] = method480(256 - field1150, field1306[var2], field1305[var2]);
				}
			}
		} else if (field1151 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1151 > 768) {
					field1304[var3] = method480(1024 - field1151, field1305[var3], field1307[var3]);
				} else if (field1151 > 256) {
					field1304[var3] = field1307[var3];
				} else {
					field1304[var3] = method480(256 - field1151, field1307[var3], field1305[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1304[var4] = field1305[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1157.field583[var5] = field957.field517[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1332[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1227[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1304[var12];
					int var15 = field1157.field583[var7];
					field1157.field583[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1157.method236(0, field8, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1158.field583[var16] = field958.field517[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1332[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1227[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1304[var23];
					int var26 = field1158.field583[var18];
					field1158.field583[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1158.method236(0, field8, 661);
	}

	@ObfuscatedName("client.a(IBLkb;)V")
	public final void method388(int arg0, class37 arg1) {
		int var3 = arg1.method220(8);
		if (var3 < field1043) {
			for (int var4 = var3; var4 < field1043; var4++) {
				field1172[field1171++] = field1044[var4];
			}
		}

		if (var3 > field1043) {
			signlink.reporterror(field1296 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1043 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1044[var5];
			class26 var7 = field1042[var6];
			int var8 = arg1.method220(1);
			if (var8 == 0) {
				field1044[field1043++] = var6;
				var7.field313 = field1147;
			} else {
				int var9 = arg1.method220(2);
				if (var9 == 0) {
					field1044[field1043++] = var6;
					var7.field313 = field1147;
					field1046[field1045++] = var6;
				} else if (var9 == 1) {
					field1044[field1043++] = var6;
					var7.field313 = field1147;
					int var10 = arg1.method220(3);
					var7.method110(var10, false);
					int var11 = arg1.method220(1);
					if (var11 == 1) {
						field1046[field1045++] = var6;
					}
				} else if (var9 == 2) {
					field1044[field1043++] = var6;
					var7.field313 = field1147;
					int var12 = arg1.method220(3);
					var7.method110(var12, true);
					int var13 = arg1.method220(3);
					var7.method110(var13, true);
					int var14 = arg1.method220(1);
					if (var14 == 1) {
						field1046[field1045++] = var6;
					}
				} else if (var9 == 3) {
					field1172[field1171++] = var6;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 219);

			if (arg0.length == 4) {
				field971 = Integer.parseInt(arg0[0]);
				field972 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method474();
				} else if (arg0[2].equals("highmem")) {
					method401();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					field973 = false;
				} else if (arg0[3].equals("members")) {
					field973 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method1(532, 789);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method389() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1272) {
			field1092 = false;
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

		if (field1334) {
			field1092 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1295) {
			field1092 = false;
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

	@ObfuscatedName("client.c(Z)V")
	public final void method390() {
		for (int var1 = -1; var1 < field1043; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1041;
			} else {
				var2 = field1044[var1];
			}

			class26 var3 = field1042[var2];
			if (var3 != null) {
				method420(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IZLjava/lang/String;)V")
	public final void method391(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field1075 != -1) {
			field1144 = arg0;
			field17 = 0;
		}

		if (field1242 == -1) {
			field1173 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1022[var4] = field1022[var4 - 1];
			field1023[var4] = field1023[var4 - 1];
			field1024[var4] = field1024[var4 - 1];
		}

		field1022[0] = arg1;
		field1023[0] = arg2;
		field1024[0] = arg0;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method9() {
		if (field1295 || field1272 || field1334) {
			method389();
		} else {
			if (field965) {
				method426();
			} else {
				method392();
			}

			field1012 = 0;
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method392() {
		method382();
		field1156.method235();
		field1101.method186(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1202 == 0) {
			int var3 = var2 / 2 - 20;
			field1276.method189(var3, "Welcome to RuneScape", true, 0xFFFF00, var1 / 2);
			var3 += 30;
			int var4 = var1 / 2 - 80;
			int var5 = var2 / 2 + 20;
			field1102.method186(var4 - 73, var5 - 20);
			field1276.method189(var5 + 5, "New user", true, 0xFFFFFF, var4);
			int var6 = var1 / 2 + 80;
			field1102.method186(var6 - 73, var5 - 20);
			field1276.method189(var5 + 5, "Existing User", true, 0xFFFFFF, var6);
		}

		if (field1202 == 2) {
			int var7 = var2 / 2 - 40;
			if (field1176.length() > 0) {
				field1276.method189(var7 - 15, field1176, true, 0xFFFF00, var1 / 2);
				field1276.method189(var7, field1177, true, 0xFFFF00, var1 / 2);
				var7 += 30;
			} else {
				field1276.method189(var7 - 7, field1177, true, 0xFFFF00, var1 / 2);
				var7 += 30;
			}

			field1276.method193(var1 / 2 - 90, 0xFFFFFF, var7, "Username: " + field1296 + (field1303 == 0 & field1147 % 40 < 20 ? "@yel@|" : ""), true);
			var7 += 15;
			field1276.method193(var1 / 2 - 88, 0xFFFFFF, var7, "Password: " + class48.method257(field1297) + (field1303 == 1 & field1147 % 40 < 20 ? "@yel@|" : ""), true);
			var7 += 15;
			int var8 = var1 / 2 - 80;
			int var9 = var2 / 2 + 50;
			field1102.method186(var8 - 73, var9 - 20);
			field1276.method189(var9 + 5, "Login", true, 0xFFFFFF, var8);
			int var10 = var1 / 2 + 80;
			field1102.method186(var10 - 73, var9 - 20);
			field1276.method189(var9 + 5, "Cancel", true, 0xFFFFFF, var10);
		}

		if (field1202 == 3) {
			field1276.method189(var2 / 2 - 60, "Create a free account", true, 0xFFFF00, var1 / 2);
			int var11 = var2 / 2 - 35;
			field1276.method189(var11, "To create a new account you need to", true, 0xFFFFFF, var1 / 2);
			var11 += 15;
			field1276.method189(var11, "go back to the main RuneScape webpage", true, 0xFFFFFF, var1 / 2);
			var11 += 15;
			field1276.method189(var11, "and choose the red 'create account'", true, 0xFFFFFF, var1 / 2);
			var11 += 15;
			field1276.method189(var11, "button at the top right of that page.", true, 0xFFFFFF, var1 / 2);
			var11 += 15;
			int var12 = var1 / 2;
			int var13 = var2 / 2 + 50;
			field1102.method186(var12 - 73, var13 - 20);
			field1276.method189(var13 + 5, "Cancel", true, 0xFFFFFF, var12);
		}

		field1156.method236(186, field8, 214);

		if (field1233) {
			field1233 = false;
			field1154.method236(0, field8, 128);
			field1155.method236(386, field8, 214);
			field1159.method236(265, field8, 0);
			field1160.method236(265, field8, 574);
			field1161.method236(186, field8, 128);
			field1162.method236(186, field8, 574);
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void method393(class37 arg0, int arg1) {
		arg0.method219();
		int var3 = arg0.method220(1);
		if (var3 != 0) {
			int var4 = arg0.method220(2);
			if (var4 == 0) {
				field1046[field1045++] = field1041;
			} else if (var4 == 1) {
				int var5 = arg0.method220(3);
				field1030.method110(var5, false);
				int var6 = arg0.method220(1);
				if (var6 == 1) {
					field1046[field1045++] = field1041;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method220(3);
				field1030.method110(var7, true);
				int var8 = arg0.method220(3);
				field1030.method110(var8, true);
				int var9 = arg0.method220(1);
				if (var9 == 1) {
					field1046[field1045++] = field1041;
				}
			} else if (var4 == 3) {
				field1017 = arg0.method220(2);
				int var10 = arg0.method220(7);
				int var11 = arg0.method220(7);
				int var12 = arg0.method220(1);
				field1030.method109(var11, var12 == 1, var10);
				int var13 = arg0.method220(1);
				if (var13 == 1) {
					field1046[field1045++] = field1041;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method394() {
		int var1 = field1276.method190("Choose Option");
		for (int var2 = 0; var2 < field1174; var2++) {
			int var3 = field1276.method190(field1053[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1174 * 15 + 21;
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

			field1087 = true;
			field959 = 0;
			field960 = var5;
			field961 = var6;
			field962 = var1;
			field963 = field1174 * 15 + 22;
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

			field1087 = true;
			field959 = 1;
			field960 = var7;
			field961 = var8;
			field962 = var1;
			field963 = field1174 * 15 + 22;
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

			field1087 = true;
			field959 = 2;
			field960 = var9;
			field961 = var10;
			field962 = var1;
			field963 = field1174 * 15 + 22;
		}
	}

	public final void run() {
		if (field1096) {
			method442();
		} else if (field949) {
			method488();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(BILkb;)V")
	public final void method395(int arg0, class37 arg1) {
		if (arg0 == 220 || arg0 == 214) {
			int var3 = arg1.method209();
			int var4 = (var3 >> 4 & 0x7) + field987;
			int var5 = (var3 & 0x7) + field988;
			int var6 = arg1.method209();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1049[var7];
			int var10;
			if (arg0 == 214) {
				var10 = -1;
			} else {
				var10 = arg1.method211();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field947.method228(); var12 != null; var12 = (class38) field947.method230()) {
					if (field1017 == var12.field553 && var12.field555 == var4 && var12.field556 == var5 && var12.field554 == var9) {
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
						var13 = field1323.method77(field1017, var4, var5);
					}

					if (var9 == 1) {
						var13 = field1323.method78(field1017, var5, var4);
					}

					if (var9 == 2) {
						var13 = field1323.method79(field1017, var4, var5);
					}

					if (var9 == 3) {
						var13 = field1323.method80(field1017, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field1323.method81(field1017, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field553 = field1017;
					var11.field554 = var9;
					var11.field555 = var4;
					var11.field556 = var5;
					var11.field560 = var14;
					var11.field562 = var15;
					var11.field561 = var16;
					field947.method225(var11);
				}

				var11.field557 = var10;
				var11.field559 = var7;
				var11.field558 = var8;
				method445(var9, var8, var7, var5, var4, field1017, var10);
			}
		} else if (arg0 == 78) {
			int var18 = arg1.method209();
			int var19 = (var18 >> 4 & 0x7) + field987;
			int var20 = (var18 & 0x7) + field988;
			int var21 = arg1.method209();
			int var22 = var21 >> 2;
			int var23 = field1049[var22];
			int var24 = arg1.method211();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = field1323.method77(field1017, var19, var20);
				}

				if (var23 == 1) {
					var25 = field1323.method78(field1017, var20, var19);
				}

				if (var23 == 2) {
					var25 = field1323.method79(field1017, var19, var20);
				}

				if (var23 == 3) {
					var25 = field1323.method80(field1017, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(var23, var20, field1017, false, class62.field901[var24], field1091, var25 >> 14 & 0x7FFF, var19);
					field1039.method225(var26);
				}
			}
		} else if (arg0 == 246) {
			int var27 = arg1.method209();
			int var28 = (var27 >> 4 & 0x7) + field987;
			int var29 = (var27 & 0x7) + field988;
			int var30 = arg1.method211();
			int var31 = arg1.method211();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var32 = new class22();
				var32.field267 = var30;
				var32.field268 = var31;

				if (field1118[field1017][var28][var29] == null) {
					field1118[field1017][var28][var29] = new class41();
				}

				field1118[field1017][var28][var29].method225(var32);
				method459(var28, var29);
			}
		} else if (arg0 == 61) {
			int var33 = arg1.method209();
			int var34 = (var33 >> 4 & 0x7) + field987;
			int var35 = (var33 & 0x7) + field988;
			int var36 = arg1.method211();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				class41 var37 = field1118[field1017][var34][var35];
				if (var37 != null) {
					for (class22 var38 = (class22) var37.method228(); var38 != null; var38 = (class22) var37.method230()) {
						if ((var36 & 0x7FFF) == var38.field267) {
							var38.method107();
							break;
						}
					}

					if (var37.method228() == null) {
						field1118[field1017][var34][var35] = null;
					}

					method459(var34, var35);
				}
			}
		} else if (arg0 == 1) {
			int var39 = arg1.method209();
			int var40 = (var39 >> 4 & 0x7) + field987;
			int var41 = (var39 & 0x7) + field988;
			int var42 = var40 + arg1.method210();
			int var43 = var41 + arg1.method210();
			int var44 = arg1.method212();
			int var45 = arg1.method211();
			int var46 = arg1.method209();
			int var47 = arg1.method209();
			int var48 = arg1.method211();
			int var49 = arg1.method211();
			int var50 = arg1.method209();
			int var51 = arg1.method209();
			if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				class27 var52 = new class27(field1147 + var49, method447(var41, var40, field1017) - var46, var51, field1147 + var48, field1017, var44, var50, var41, var45, var40, var47);
				var52.method116(var42, method447(var43, var42, field1017) - var47, var43, field1147 + var48);
				field1169.method225(var52);
			}
		} else if (arg0 == 195) {
			int var53 = arg1.method209();
			int var54 = (var53 >> 4 & 0x7) + field987;
			int var55 = (var53 & 0x7) + field988;
			int var56 = arg1.method211();
			int var57 = arg1.method209();
			int var58 = arg1.method211();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				class28 var59 = new class28(var56, var58, field1017, var55, var54, field1147, method447(var55, var54, field1017) - var57);
				field966.method225(var59);
			}
		} else if (arg0 == 127) {
			int var60 = arg1.method209();
			int var61 = (var60 >> 4 & 0x7) + field987;
			int var62 = (var60 & 0x7) + field988;
			int var63 = arg1.method211();
			int var64 = arg1.method211();
			int var65 = arg1.method211();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && field1181 != var65) {
				class22 var66 = new class22();
				var66.field267 = var63;
				var66.field268 = var64;

				if (field1118[field1017][var61][var62] == null) {
					field1118[field1017][var61][var62] = new class41();
				}

				field1118[field1017][var61][var62].method225(var66);
				method459(var61, var62);
			}
		} else if (arg0 == 25) {
			int var67 = arg1.method209();
			int var68 = (var67 >> 4 & 0x7) + field987;
			int var69 = (var67 & 0x7) + field988;
			int var70 = arg1.method209();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = field1049[var71];
			int var74 = arg1.method211();
			int var75 = arg1.method211();
			int var76 = arg1.method211();
			int var77 = arg1.method211();
			byte var78 = arg1.method210();
			byte var79 = arg1.method210();
			byte var80 = arg1.method210();
			byte var81 = arg1.method210();
			class26 var82;
			if (field1181 == var77) {
				var82 = field1030;
			} else {
				var82 = field1042[var77];
			}

			if (var82 != null) {
				class39 var83 = new class39(var72, field1017, var71, field1147 + var75, var73, -1, var69, var68);
				field1184.method225(var83);
				class39 var84 = new class39(var72, field1017, var71, field1147 + var76, var73, var74, var69, var68);
				field1184.method225(var84);
				int var85 = field1145[field1017][var68][var69];
				int var86 = field1145[field1017][var68 + 1][var69];
				int var87 = field1145[field1017][var68 + 1][var69 + 1];
				int var88 = field1145[field1017][var68][var69 + 1];
				class53 var89 = class53.method275(var74);
				var82.field331 = field1147 + var75;
				var82.field332 = field1147 + var76;
				var82.field336 = var89.method278(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.field710;
				int var91 = var89.field711;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.field711;
					var91 = var89.field710;
				}

				var82.field333 = var68 * 128 + var90 * 64;
				var82.field335 = var69 * 128 + var91 * 64;
				var82.field334 = method447(var82.field335, var82.field333, field1017);

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

				var82.field337 = var68 + var78;
				var82.field339 = var68 + var80;
				var82.field338 = var69 + var79;
				var82.field340 = var69 + var81;
			}
		} else if (arg0 == 117) {
			int var94 = arg1.method209();
			int var95 = (var94 >> 4 & 0x7) + field987;
			int var96 = (var94 & 0x7) + field988;
			int var97 = arg1.method211();
			int var98 = arg1.method211();
			int var99 = arg1.method211();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1118[field1017][var95][var96];
				if (var100 != null) {
					for (class22 var101 = (class22) var100.method228(); var101 != null; var101 = (class22) var100.method230()) {
						if ((var97 & 0x7FFF) == var101.field267 && var101.field268 == var98) {
							var101.field268 = var99;
							break;
						}
					}

					method459(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLhc;)Z")
	public final boolean method396(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 == 201) {
			field1173 = true;
			field1141 = false;
			field1187 = true;
			field1201 = "";
			field1095 = 1;
			field1234 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1173 = true;
			field1141 = false;
			field1187 = true;
			field1201 = "";
			field1095 = 2;
			field1234 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1239 = 250;
			return true;
		}

		if (var2 == 501) {
			field1173 = true;
			field1141 = false;
			field1187 = true;
			field1201 = "";
			field1095 = 4;
			field1234 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1173 = true;
			field1141 = false;
			field1187 = true;
			field1201 = "";
			field1095 = 5;
			field1234 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1316[var3];
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

					if (!class59.field828[var5].field834 && class59.field828[var5].field829 == var3 + (field1072 ? 0 : 7)) {
						break;
					}
				}

				field1316[var3] = var5;
				field982 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field990[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1329[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1329[var6].length) {
					var8 = 0;
				}
			}

			field990[var6] = var8;
			field982 = true;
		}

		if (var2 == 324 && !field1072) {
			field1072 = true;
			method432();
		}

		if (var2 == 325 && field1072) {
			field1072 = false;
			method432();
		}

		if (var2 == 326) {
			field1186.method198(239);
			field1186.method199(field1072 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1186.method199(field1316[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1186.method199(field990[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1269 = !field1269;
		}

		if (var2 >= 601 && var2 <= 612) {
			method398();

			if (field1127.length() > 0) {
				field1186.method198(252);
				field1186.method205(class48.method251(field1127));
				field1186.method199(var2 - 601);
				field1186.method199(field1269 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method397() {
		if (field1174 >= 2 || field1129 != 0 || field1290 != 0) {
			String var1;
			if (field1129 == 1 && field1174 < 2) {
				var1 = "Use " + field1133 + " with...";
			} else if (field1290 == 1 && field1174 < 2) {
				var1 = field1293 + "...";
			} else {
				var1 = field1053[field1174 - 1];
			}

			if (field1174 > 2) {
				var1 = var1 + "@whi@ / " + (field1174 - 2) + " more options";
			}

			field1276.method193(4, 0xFFFFFF, 15, var1, true);
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method398() {
		field1186.method198(153);

		if (field1243 != -1) {
			field1243 = -1;
			field1294 = true;
			field1204 = false;
			field1055 = true;
		}

		if (field1242 != -1) {
			field1242 = -1;
			field1173 = true;
			field1204 = false;
		}

		field1240 = -1;
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method399(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IJ)V")
	public final void method400(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field956; var3++) {
				if (field1270[var3] == arg0) {
					field956--;
					field1294 = true;

					for (int var4 = var3; var4 < field956; var4++) {
						field1138[var4] = field1138[var4 + 1];
						field1165[var4] = field1165[var4 + 1];
						field1270[var4] = field1270[var4 + 1];
					}

					field1186.method198(210);
					field1186.method205(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public static final void method401() {
		class18.field195 = false;
		class33.field494 = false;
		field974 = false;
		class3.field26 = false;
	}

	@ObfuscatedName("client.a(ILkb;B)V")
	public final void method402(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field1045; var3++) {
			int var4 = field1046[var3];
			class26 var5 = field1042[var4];
			int var6 = arg1.method209();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method209() << 8;
			}

			method386(var4, var6, arg1, var5);
		}
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method403(int arg0, int arg1, int arg2) {
		int var4 = field1323.method77(arg1, arg0, arg2);
		if (var4 != 0) {
			int var5 = field1323.method81(arg1, arg0, arg2, var4);
			int var6 = var5 >> 6 & 0x3;
			int var7 = var5 & 0x1F;
			int var8 = 0xEEEEEE;
			if (var4 > 0) {
				var8 = 0xEE0000;
			}

			int[] var9 = field1008.field517;
			int var10 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
			int var11 = var4 >> 14 & 0x7FFF;
			class53 var12 = class53.method275(var11);
			if (var12.field725 == -1) {
				if (var7 == 0 || var7 == 2) {
					if (var6 == 0) {
						var9[var10] = var8;
						var9[var10 + 512] = var8;
						var9[var10 + 1024] = var8;
						var9[var10 + 1536] = var8;
					} else if (var6 == 1) {
						var9[var10] = var8;
						var9[var10 + 1] = var8;
						var9[var10 + 2] = var8;
						var9[var10 + 3] = var8;
					} else if (var6 == 2) {
						var9[var10 + 3] = var8;
						var9[var10 + 3 + 512] = var8;
						var9[var10 + 3 + 1024] = var8;
						var9[var10 + 3 + 1536] = var8;
					} else if (var6 == 3) {
						var9[var10 + 1536] = var8;
						var9[var10 + 1536 + 1] = var8;
						var9[var10 + 1536 + 2] = var8;
						var9[var10 + 1536 + 3] = var8;
					}
				}

				if (var7 == 3) {
					if (var6 == 0) {
						var9[var10] = var8;
					} else if (var6 == 1) {
						var9[var10 + 3] = var8;
					} else if (var6 == 2) {
						var9[var10 + 3 + 1536] = var8;
					} else if (var6 == 3) {
						var9[var10 + 1536] = var8;
					}
				}

				if (var7 == 2) {
					if (var6 == 3) {
						var9[var10] = var8;
						var9[var10 + 512] = var8;
						var9[var10 + 1024] = var8;
						var9[var10 + 1536] = var8;
					} else if (var6 == 0) {
						var9[var10] = var8;
						var9[var10 + 1] = var8;
						var9[var10 + 2] = var8;
						var9[var10 + 3] = var8;
					} else if (var6 == 1) {
						var9[var10 + 3] = var8;
						var9[var10 + 3 + 512] = var8;
						var9[var10 + 3 + 1024] = var8;
						var9[var10 + 3 + 1536] = var8;
					} else if (var6 == 2) {
						var9[var10 + 1536] = var8;
						var9[var10 + 1536 + 1] = var8;
						var9[var10 + 1536 + 2] = var8;
						var9[var10 + 1536 + 3] = var8;
					}
				}
			} else {
				class35 var13 = field968[var12.field725];
				if (var13 != null) {
					int var14 = (var12.field710 * 4 - var13.field526) / 2;
					int var15 = (var12.field711 * 4 - var13.field527) / 2;
					var13.method186(arg0 * 4 + var14 + 48, (104 - arg2 - var12.field711) * 4 + 48 + var15);
				}
			}
		}

		int var16 = field1323.method79(arg1, arg0, arg2);
		if (var16 != 0) {
			int var17 = field1323.method81(arg1, arg0, arg2, var16);
			int var18 = var17 >> 6 & 0x3;
			int var19 = var17 & 0x1F;
			int var20 = var16 >> 14 & 0x7FFF;
			class53 var21 = class53.method275(var20);
			if (var21.field725 != -1) {
				class35 var22 = field968[var21.field725];
				if (var22 != null) {
					int var23 = (var21.field710 * 4 - var22.field526) / 2;
					int var24 = (var21.field711 * 4 - var22.field527) / 2;
					var22.method186(arg0 * 4 + var23 + 48, (104 - arg2 - var21.field711) * 4 + 48 + var24);
				}
			} else if (var19 == 9) {
				int var25 = 0xEEEEEE;
				if (var16 > 0) {
					var25 = 0xEE0000;
				}

				int[] var26 = field1008.field517;
				int var27 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
				if (var18 == 0 || var18 == 2) {
					var26[var27 + 1536] = var25;
					var26[var27 + 1024 + 1] = var25;
					var26[var27 + 512 + 2] = var25;
					var26[var27 + 3] = var25;
				} else {
					var26[var27] = var25;
					var26[var27 + 512 + 1] = var25;
					var26[var27 + 1024 + 2] = var25;
					var26[var27 + 1536 + 3] = var25;
				}
			}
		}

		int var28 = field1323.method80(arg1, arg0, arg2);
		if (var28 != 0) {
			int var29 = var28 >> 14 & 0x7FFF;
			class53 var30 = class53.method275(var29);
			if (var30.field725 != -1) {
				class35 var31 = field968[var30.field725];
				if (var31 != null) {
					int var32 = (var30.field710 * 4 - var31.field526) / 2;
					int var33 = (var30.field711 * 4 - var31.field527) / 2;
					var31.method186(arg0 * 4 + var32 + 48, (104 - arg2 - var30.field711) * 4 + 48 + var33);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method7() {
		if (!field1295 && !field1272 && !field1334) {
			field1147++;

			if (field965) {
				method475();
			} else {
				method440();
			}
		}
	}

	@ObfuscatedName("client.a(Lz;IIII)V")
	public final void method404(class26 arg0, int arg1, int arg2, int arg3) {
		if (field1030 != arg0 && field1174 < 400) {
			String var5 = arg0.field322 + method399(arg0.field328, field1030.field328) + " (level-" + arg0.field328 + ")";
			if (field1129 == 1) {
				field1053[field1174] = "Use " + field1133 + " with @whi@" + var5;
				field1063[field1174] = 103;
				field1064[field1174] = arg3;
				field1061[field1174] = arg1;
				field1062[field1174] = arg2;
				field1174++;
			} else if (field1290 != 1) {
				field1053[field1174] = "Follow @whi@" + var5;
				field1063[field1174] = 1741;
				field1064[field1174] = arg3;
				field1061[field1174] = arg1;
				field1062[field1174] = arg2;
				field1174++;
				if (field1128 == 0) {
					field1053[field1174] = "Trade with @whi@" + var5;
					field1063[field1174] = 1528;
					field1064[field1174] = arg3;
					field1061[field1174] = arg1;
					field1062[field1174] = arg2;
					field1174++;
				}

				if (field1185 > 0) {
					field1053[field1174] = "Attack @whi@" + var5;

					if (field1030.field328 >= arg0.field328) {
						field1063[field1174] = 593;
					} else {
						field1063[field1174] = 2593;
					}

					field1064[field1174] = arg3;
					field1061[field1174] = arg1;
					field1062[field1174] = arg2;
					field1174++;
				}

				if (field1335 == 1) {
					field1053[field1174] = "Fight @whi@" + var5;
					field1063[field1174] = 593;
					field1064[field1174] = arg3;
					field1061[field1174] = arg1;
					field1062[field1174] = arg2;
					field1174++;
				}

				if (field1335 == 2) {
					field1053[field1174] = "Duel-with @whi@" + var5;
					field1063[field1174] = 1596;
					field1064[field1174] = arg3;
					field1061[field1174] = arg1;
					field1062[field1174] = arg2;
					field1174++;
				}
			} else if ((field1292 & 0x8) == 8) {
				field1053[field1174] = field1293 + " @whi@" + var5;
				field1063[field1174] = 48;
				field1064[field1174] = arg3;
				field1061[field1174] = arg1;
				field1062[field1174] = arg2;
				field1174++;
			}

			for (int var6 = 0; var6 < field1174; var6++) {
				if (field1063[var6] == 981) {
					field1053[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLib;)V")
	public final void method405(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1089.length; var3++) {
			field1089[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1089[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1090[var9] = (field1089[var9 - 1] + field1089[var9 + 1] + field1089[var9 - 128] + field1089[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1089;
			field1089 = field1090;
			field1090 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field527; var12++) {
				for (int var13 = 0; var13 < arg0.field526; var13++) {
					if (arg0.field524[var11++] != 0) {
						int var14 = var13 + arg0.field528 + 16;
						int var15 = var12 + arg0.field529 + 16;
						int var16 = (var15 << 7) + var14;
						field1089[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;I)V")
	public final void method406(int arg0, int arg1, String arg2) {
		if (arg2 != null) {
			synchronized (field991) {
				field985 = arg2;
				field1107 = arg1;
				field1254 = arg0;
			}
		}
	}

	@ObfuscatedName("client.b(ILkb;I)V")
	public final void method407(int arg0, class37 arg1) {
		arg1.method219();
		int var3 = arg1.method220(8);
		if (var3 < field1136) {
			for (int var4 = var3; var4 < field1136; var4++) {
				field1172[field1171++] = field1137[var4];
			}
		}

		if (var3 > field1136) {
			signlink.reporterror(field1296 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1136 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1137[var5];
			class25 var7 = field1135[var6];
			int var8 = arg1.method220(1);
			if (var8 == 0) {
				field1137[field1136++] = var6;
				var7.field313 = field1147;
			} else {
				int var9 = arg1.method220(2);
				if (var9 == 0) {
					field1137[field1136++] = var6;
					var7.field313 = field1147;
					field1046[field1045++] = var6;
				} else if (var9 == 1) {
					field1137[field1136++] = var6;
					var7.field313 = field1147;
					int var10 = arg1.method220(3);
					var7.method110(var10, false);
					int var11 = arg1.method220(1);
					if (var11 == 1) {
						field1046[field1045++] = var6;
					}
				} else if (var9 == 2) {
					field1137[field1136++] = var6;
					var7.field313 = field1147;
					int var12 = arg1.method220(3);
					var7.method110(var12, true);
					int var13 = arg1.method220(3);
					var7.method110(var13, true);
					int var14 = arg1.method220(1);
					if (var14 == 1) {
						field1046[field1045++] = var6;
					}
				} else if (var9 == 3) {
					field1172[field1171++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public static final String method408(int arg0) {
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

	@ObfuscatedName("client.a(Lhc;ZIII)V")
	public final void method409(class60 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field842 == 0 && arg0.field856 != null && (!arg0.field855 || field1183 == arg0.field840 || field1109 == arg0.field840 || field1122 == arg0.field840)) {
			int var5 = class32.field489;
			int var6 = class32.field487;
			int var7 = class32.field490;
			int var8 = class32.field488;
			class32.method147(arg0.field846 + arg1, arg3, arg1, arg0.field845 + arg3);
			int var9 = arg0.field856.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field857[var10] + arg3;
				int var12 = arg0.field858[var10] + arg1 - arg2;
				class60 var13 = class60.field835[arg0.field856[var10]];
				var11 += var13.field847;
				var12 += var13.field848;

				if (var13.field844 > 0) {
					method415(var13);
				}

				if (var13.field842 == 0) {
					if (var13.field854 > var13.field853 - var13.field846) {
						var13.field854 = var13.field853 - var13.field846;
					}

					if (var13.field854 < 0) {
						var13.field854 = 0;
					}

					method409(var13, var12, var13.field854, var11);

					if (var13.field853 > var13.field846) {
						method431(var13.field846, var12, var13.field854, var13.field845 + var11, var13.field853);
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
									class34 var22 = class55.method292(var21, var13.field837[var14]);
									if (field1115 != 0 && field1114 == var14 && field1113 == var13.field840) {
										var19 = field15 - field1116;
										var20 = field16 - field1117;

										if (var19 < 5 && var19 > -5) {
											var19 = 0;
										}

										if (var20 < 5 && var20 > -5) {
											var20 = 0;
										}

										if (field983 < 5) {
											var19 = 0;
											var20 = 0;
										}

										var22.method177(var18 + var20, var17 + var19, 128);
									} else if (field1253 != 0 && field1252 == var14 && field1251 == var13.field840) {
										var22.method177(var18, var17, 128);
									} else {
										var22.method173(var17, var18);
									}

									if (var22.field522 == 33 || var13.field837[var14] != 1) {
										int var23 = var13.field837[var14];
										field1274.method191(var17 + var19 + 1, 0, method448(var23), var18 + var20 + 10);
										field1274.method191(var17 + var19, 0xFFFF00, method448(var23), var18 + var20 + 9);
									}
								} else if (var13.field866 != null && var14 < 20) {
									class34 var24 = var13.field866[var14];
									if (var24 != null) {
										var24.method173(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field842 == 3) {
						if (var13.field870) {
							class32.method149(var13.field876, var11, var12, var13.field845, var13.field846);
						} else {
							class32.method150(var13.field876, var11, var12, var13.field846, var13.field845);
						}
					} else if (var13.field842 == 4) {
						class36 var25 = var13.field873;
						int var26 = var13.field876;
						String var27 = var13.field874;

						if ((field1122 == var13.field840 || field1109 == var13.field840 || field1183 == var13.field840) && var13.field878 != 0) {
							var26 = var13.field878;
						}

						if (method437(var13)) {
							var26 = var13.field877;

							if (var13.field875.length() > 0) {
								var27 = var13.field875;
							}
						}

						if (var13.field843 == 6 && field1204) {
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

									var27 = var27.substring(0, var29) + method414(method367(var13, 0)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method414(method367(var13, 1)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method414(method367(var13, 2)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method414(method367(var13, 3)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method414(method367(var13, 4)) + var27.substring(var33 + 2);
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
								var25.method189(var28, var35, var13.field872, var26, var13.field845 / 2 + var11);
							} else {
								var25.method193(var11, var26, var28, var35, var13.field872);
							}

							var28 += var25.field539;
						}
					} else if (var13.field842 == 5) {
						class34 var36;
						if (method437(var13)) {
							var36 = var13.field880;
						} else {
							var36 = var13.field879;
						}

						if (var36 != null) {
							var36.method173(var11, var12);
						}
					} else if (var13.field842 == 6) {
						int var37 = class33.field499;
						int var38 = class33.field500;
						class33.field499 = var13.field845 / 2 + var11;
						class33.field500 = var13.field846 / 2 + var12;
						int var39 = class33.field503[var13.field886] * var13.field885 >> 16;
						int var40 = class33.field504[var13.field886] * var13.field885 >> 16;
						boolean var41 = method437(var13);
						int var42;
						if (var41) {
							var42 = var13.field884;
						} else {
							var42 = var13.field883;
						}

						class31 var43;
						if (var42 == -1) {
							var43 = var13.method315(-1, -1, var41);
						} else {
							class62 var44 = class62.field901[var42];
							var43 = var13.method315(var44.field903[var13.field838], var44.field904[var13.field838], var41);
						}

						if (var43 != null) {
							var43.method139(0, var13.field887, 0, var13.field886, 0, var39, var40);
						}

						class33.field499 = var37;
						class33.field500 = var38;
					} else if (var13.field842 == 7) {
						class36 var45 = var13.field873;
						int var46 = 0;
						for (int var47 = 0; var47 < var13.field846; var47++) {
							for (int var48 = 0; var48 < var13.field845; var48++) {
								if (var13.field836[var46] > 0) {
									class55 var49 = class55.method287(var13.field836[var46] - 1);
									String var50 = var49.field774;
									if (var49.field785 || var13.field837[var46] != 1) {
										var50 = var50 + " x" + method408(var13.field837[var46]);
									}

									int var51 = (var13.field864 + 115) * var48 + var11;
									int var52 = (var13.field865 + 12) * var47 + var12;
									if (var13.field871) {
										var45.method189(var52, var50, var13.field872, var13.field876, var13.field845 / 2 + var51);
									} else {
										var45.method193(var51, var13.field876, var52, var50, var13.field872);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class32.method147(var8, var5, var6, var7);
		}
	}

	@ObfuscatedName("client.e(Z)Ljava/lang/String;")
	public final String method410() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method411() {
		field993 = 0;
		for (int var1 = -1; var1 < field1136 + field1043; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field1030;
			} else if (var1 < field1043) {
				var2 = field1042[field1044[var1]];
			} else {
				var2 = field1135[field1137[var1 - field1043]];
			}

			if (var2 != null && var2.method111()) {
				if (var1 < field1043) {
					int var3 = 30;
					class26 var4 = (class26) var2;
					if (var4.field325 != 0) {
						method427(var2.field314 + 15, var2);

						if (field1069 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field325 & 1 << var5) != 0) {
									field1208[var5].method173(field1069 - 12, field1070 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1210 == 10 && field1044[var1] == field1255) {
						method427(var2.field314 + 15, var2);

						if (field1069 > -1) {
							field1208[7].method173(field1069 - 12, field1070 - var3);
						}
					}
				} else if (field1210 == 1 && field1137[var1 - field1043] == field1025 && field1147 % 20 < 10) {
					method427(var2.field314 + 15, var2);

					if (field1069 > -1) {
						field1208[2].method173(field1069 - 12, field1070 - 28);
					}
				}

				if (var2.field281 != null && (var1 >= field1043 || field1328 == 0 || field1328 == 3 || field1328 == 1 && method464(((class26) var2).field322))) {
					method427(var2.field314, var2);

					if (field1069 > -1 && field993 < field994) {
						field998[field993] = field1276.method190(var2.field281) / 2;
						field997[field993] = field1276.field539;
						field995[field993] = field1069;
						field996[field993] = field1070;
						field999[field993] = var2.field283;
						field1000[field993] = var2.field284;
						field1001[field993] = var2.field282;
						field1002[field993++] = var2.field281;

						if (field1033 == 0 && var2.field284 == 1) {
							field997[field993] += 10;
							field996[field993] += 5;
						}

						if (field1033 == 0 && var2.field284 == 2) {
							field998[field993] = 60;
						}
					}
				}

				if (var2.field287 > field1147 + 100) {
					method427(var2.field314 + 15, var2);

					if (field1069 > -1) {
						int var6 = var2.field288 * 30 / var2.field289;
						if (var6 > 30) {
							var6 = 30;
						}

						class32.method149(0xFF00, field1069 - 15, field1070 - 3, var6, 5);
						class32.method149(0xFF0000, field1069 + var6 - 15, field1070 - 3, 30 - var6, 5);
					}
				}

				if (var2.field287 > field1147 + 330) {
					method427(var2.field314 / 2, var2);

					if (field1069 > -1) {
						field1281[var2.field286].method173(field1069 - 12, field1070 - 12);
						field1274.method188(field1069, field1070 + 4, String.valueOf(var2.field285), 0);
						field1274.method188(field1069 - 1, field1070 + 3, String.valueOf(var2.field285), 0xFFFFFF);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field993; var7++) {
			int var8 = field995[var7];
			int var9 = field996[var7];
			int var10 = field998[var7];
			int var11 = field997[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field996[var13] - field997[var13] && var9 - var11 < field996[var13] + 2 && var8 - var10 < field998[var13] + field995[var13] && var8 + var10 > field995[var13] - field998[var13] && field996[var13] - field997[var13] < var9) {
						var9 = field996[var13] - field997[var13];
						var12 = true;
					}
				}
			}

			field1069 = field995[var7];
			field1070 = field996[var7] = var9;
			String var14 = field1002[var7];
			if (field1033 == 0) {
				int var15 = 0xFFFF00;
				if (field999[var7] < 6) {
					var15 = field1209[field999[var7]];
				}

				if (field999[var7] == 6) {
					var15 = field1199 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field999[var7] == 7) {
					var15 = field1199 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field999[var7] == 8) {
					var15 = field1199 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field999[var7] == 9) {
					int var16 = 150 - field1001[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field999[var7] == 10) {
					int var17 = 150 - field1001[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field999[var7] == 11) {
					int var18 = 150 - field1001[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1000[var7] == 0) {
					field1276.method188(field1069, field1070 + 1, var14, 0);
					field1276.method188(field1069, field1070, var14, var15);
				}

				if (field1000[var7] == 1) {
					field1276.method192(field1069, field1070 + 1, var14, field1199, 0);
					field1276.method192(field1069, field1070, var14, field1199, var15);
				}

				if (field1000[var7] == 2) {
					int var19 = field1276.method190(var14);
					int var20 = (150 - field1001[var7]) * (var19 + 100) / 150;
					class32.method147(334, field1069 - 50, 0, field1069 + 50);
					field1276.method191(field1069 + 50 - var20, 0, var14, field1070 + 1);
					field1276.method191(field1069 + 50 - var20, var15, var14, field1070);
					class32.method146();
				}
			} else {
				field1276.method188(field1069, field1070 + 1, var14, 0);
				field1276.method188(field1069, field1070, var14, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method412() {
		field1018.method235();
		class33.field505 = field1230;
		field1318.method186(0, 0);

		if (field1243 != -1) {
			method409(class60.field835[field1243], 0, 0, 0);
		} else if (field1198[field1310] != -1) {
			method409(class60.field835[field1198[field1310]], 0, 0, 0);
		}

		if (field1087 && field959 == 1) {
			method444();
		}

		field1018.method236(231, field8, 562);
		field1020.method235();
		class33.field505 = field1231;
	}

	@ObfuscatedName("client.a(Lbc;IZII)V")
	public final void method413(class54 arg0, int arg1, int arg2, int arg3) {
		if (field1174 < 400) {
			String var5 = arg0.field744;
			if (arg0.field762 != 0) {
				var5 = var5 + method399(arg0.field762, field1030.field328) + " (level-" + arg0.field762 + ")";
			}

			if (field1129 == 1) {
				field1053[field1174] = "Use " + field1133 + " with @yel@" + var5;
				field1063[field1174] = 493;
				field1064[field1174] = arg3;
				field1061[field1174] = arg2;
				field1062[field1174] = arg1;
				field1174++;
			} else if (field1290 != 1) {
				if (arg0.field757 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg0.field757[var6] != null && !arg0.field757[var6].equalsIgnoreCase("attack")) {
							field1053[field1174] = arg0.field757[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1063[field1174] = 988;
							}

							if (var6 == 1) {
								field1063[field1174] = 345;
							}

							if (var6 == 2) {
								field1063[field1174] = 249;
							}

							if (var6 == 3) {
								field1063[field1174] = 960;
							}

							if (var6 == 4) {
								field1063[field1174] = 40;
							}

							field1064[field1174] = arg3;
							field1061[field1174] = arg2;
							field1062[field1174] = arg1;
							field1174++;
						}
					}
				}

				if (arg0.field757 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg0.field757[var7] != null && arg0.field757[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg0.field762 > field1030.field328) {
								var8 = 2000;
							}

							field1053[field1174] = arg0.field757[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1063[field1174] = var8 + 988;
							}

							if (var7 == 1) {
								field1063[field1174] = var8 + 345;
							}

							if (var7 == 2) {
								field1063[field1174] = var8 + 249;
							}

							if (var7 == 3) {
								field1063[field1174] = var8 + 960;
							}

							if (var7 == 4) {
								field1063[field1174] = var8 + 40;
							}

							field1064[field1174] = arg3;
							field1061[field1174] = arg2;
							field1062[field1174] = arg1;
							field1174++;
						}
					}
				}

				field1053[field1174] = "Examine @yel@" + var5;
				field1063[field1174] = 1814;
				field1064[field1174] = arg3;
				field1061[field1174] = arg2;
				field1062[field1174] = arg1;
				field1174++;
			} else if ((field1292 & 0x2) == 2) {
				field1053[field1174] = field1293 + " @yel@" + var5;
				field1063[field1174] = 500;
				field1064[field1174] = arg3;
				field1061[field1174] = arg2;
				field1062[field1174] = arg1;
				field1174++;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public final String method414(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Lhc;I)V")
	public final void method415(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field956) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				arg0.field874 = field1138[var2];
				arg0.field843 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field956) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				if (field1165[var2] == 0) {
					arg0.field874 = "@red@Offline";
				} else if (field1165[var2] == field971) {
					arg0.field874 = "@gre@World-" + (field1165[var2] - 9);
				} else {
					arg0.field874 = "@yel@World-" + (field1165[var2] - 9);
				}

				arg0.field843 = 1;
			}
		} else if (var2 == 203) {
			arg0.field853 = field956 * 15 + 20;
			if (arg0.field853 <= arg0.field846) {
				arg0.field853 = arg0.field846 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1331) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				arg0.field874 = class48.method255(class48.method252(field954[var2]));
				arg0.field843 = 1;
			}
		} else if (var2 == 503) {
			arg0.field853 = field1331 * 15 + 20;
			if (arg0.field853 <= arg0.field846) {
				arg0.field853 = arg0.field846 + 1;
			}
		} else if (var2 == 327) {
			arg0.field886 = 150;
			arg0.field887 = (int) (Math.sin(field1147 / 40.0D) * 256.0D) & 0x7FF;

			if (field982) {
				field982 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1316[var5];
					if (var6 >= 0) {
						var3[var4++] = class59.field828[var6].method312();
					}
				}

				class31 var7 = new class31(6, var4, var3);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field990[var8] != 0) {
						var7.method133(field1329[var8][0], field1329[var8][field990[var8]]);

						if (var8 == 1) {
							var7.method133(field1077[0], field1077[field990[var8]]);
						}
					}
				}

				var7.method126();
				var7.method127(class62.field901[field1030.field274].field903[0]);
				var7.method136(64, 850, -30, -50, -30, true);
				arg0.field881 = var7;
			}
		} else if (var2 == 324) {
			if (field1324 == null) {
				field1324 = arg0.field879;
				field1325 = arg0.field880;
			}

			if (field1072) {
				arg0.field879 = field1325;
			} else {
				arg0.field879 = field1324;
			}
		} else if (var2 == 325) {
			if (field1324 == null) {
				field1324 = arg0.field879;
				field1325 = arg0.field880;
			}

			if (field1072) {
				arg0.field879 = field1324;
			} else {
				arg0.field879 = field1325;
			}
		} else if (var2 == 600) {
			arg0.field874 = field1127;
			if (field1147 % 20 < 10) {
				arg0.field874 = arg0.field874 + "|";
			} else {
				arg0.field874 = arg0.field874 + " ";
			}
		} else if (var2 == 613) {
			if (!field1148) {
				arg0.field874 = "";
			} else if (field1269) {
				arg0.field876 = 0xFF0000;
				arg0.field874 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field876 = 0xFFFFFF;
				arg0.field874 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1100 == 0) {
				arg0.field874 = "";
			} else {
				String var9;
				if (field1011 == 0) {
					var9 = "earlier today";
				} else if (field1011 == 1) {
					var9 = "yesterday";
				} else {
					var9 = field1011 + " days ago";
				}

				arg0.field874 = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1241 == 0) {
				arg0.field874 = "0 unread messages";
				arg0.field876 = 0xFFFF00;
			}

			if (field1241 == 1) {
				arg0.field874 = "1 unread message";
				arg0.field876 = 0xFF00;
			}

			if (field1241 > 1) {
				arg0.field874 = field1241 + " unread messages";
				arg0.field876 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1271 == 201) {
				arg0.field874 = "";
			} else if (field1271 == 200) {
				arg0.field874 = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (field1271 == 0) {
					var10 = "Earlier today";
				} else if (field1271 == 1) {
					var10 = "Yesterday";
				} else {
					var10 = field1271 + " days ago";
				}

				arg0.field874 = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1271 == 201) {
				arg0.field874 = "";
			} else if (field1271 == 200) {
				arg0.field874 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field874 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1271 == 201) {
				arg0.field874 = "";
			} else if (field1271 == 200) {
				arg0.field874 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field874 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void method416(class37 arg0, int arg1) {
		field1171 = 0;
		field1045 = 0;
		method393(arg0, arg1);
		method388(arg1, arg0);
		method453(arg0, arg1);
		method402(arg1, arg0);

		for (int var3 = 0; var3 < field1171; var3++) {
			int var4 = field1172[var3];
			if (field1147 != field1042[var4].field313) {
				field1042[var4] = null;
			}
		}

		if (arg0.field542 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field542 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1043; var5++) {
			if (field1042[field1044[var5]] == null) {
				signlink.reporterror(field1296 + " null entry in pl list - pos:" + var5 + " size:" + field1043);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method417(int arg0) {
		if (!field974) {
			if (class33.field513[17] >= arg0) {
				class35 var2 = class33.field507[17];
				int var3 = var2.field527 * var2.field526 - 1;
				int var4 = field989 * var2.field526 * 2;
				byte[] var5 = var2.field524;
				byte[] var6 = field1005;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field524 = var6;
				field1005 = var5;
				class33.method160(17);
			}

			if (class33.field513[24] >= arg0) {
				class35 var8 = class33.field507[24];
				int var9 = var8.field527 * var8.field526 - 1;
				int var10 = field989 * var8.field526 * 2;
				byte[] var11 = var8.field524;
				byte[] var12 = field1005;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field524 = var12;
				field1005 = var11;
				class33.method160(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method418() {
		if (field1129 == 0 && field1290 == 0) {
			field1053[field1174] = "Walk here";
			field1063[field1174] = 981;
			field1061[field1174] = field15;
			field1062[field1174] = field16;
			field1174++;
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

				if (var6 == 2 && field1323.method81(field1017, var4, var5, var3) >= 0) {
					class53 var8 = class53.method275(var7);
					if (field1129 == 1) {
						field1053[field1174] = "Use " + field1133 + " with @cya@" + var8.field706;
						field1063[field1174] = 505;
						field1064[field1174] = var3;
						field1061[field1174] = var4;
						field1062[field1174] = var5;
						field1174++;
					} else if (field1290 != 1) {
						if (var8.field722 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field722[var9] != null) {
									field1053[field1174] = var8.field722[var9] + " @cya@" + var8.field706;

									if (var9 == 0) {
										field1063[field1174] = 798;
									}

									if (var9 == 1) {
										field1063[field1174] = 829;
									}

									if (var9 == 2) {
										field1063[field1174] = 873;
									}

									if (var9 == 3) {
										field1063[field1174] = 104;
									}

									if (var9 == 4) {
										field1063[field1174] = 1659;
									}

									field1064[field1174] = var3;
									field1061[field1174] = var4;
									field1062[field1174] = var5;
									field1174++;
								}
							}
						}

						field1053[field1174] = "Examine @cya@" + var8.field706;
						field1063[field1174] = 1418;
						field1064[field1174] = var3;
						field1061[field1174] = var4;
						field1062[field1174] = var5;
						field1174++;
					} else if ((field1292 & 0x4) == 4) {
						field1053[field1174] = field1293 + " @cya@" + var8.field706;
						field1063[field1174] = 737;
						field1064[field1174] = var3;
						field1061[field1174] = var4;
						field1062[field1174] = var5;
						field1174++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field1135[var7];
					if (var10.field321.field746 == 1 && (var10.field269 & 0x7F) == 0x40 && (var10.field270 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1136; var11++) {
							class25 var12 = field1135[field1137[var11]];
							if (var12 != null && var10 != var12 && var12.field321.field746 == 1 && var10.field269 == var12.field269 && var10.field270 == var12.field270) {
								method413(var12.field321, var5, var4, field1137[var11]);
							}
						}
					}

					method413(var10.field321, var5, var4, var7);
				}

				if (var6 == 0) {
					class26 var13 = field1042[var7];
					if ((var13.field269 & 0x7F) == 0x40 && (var13.field270 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1136; var14++) {
							class25 var15 = field1135[field1137[var14]];
							if (var15 != null && var15.field321.field746 == 1 && var13.field269 == var15.field269 && var13.field270 == var15.field270) {
								method413(var15.field321, var5, var4, field1137[var14]);
							}
						}

						for (int var16 = 0; var16 < field1043; var16++) {
							class26 var17 = field1042[field1044[var16]];
							if (var17 != null && var13 != var17 && var13.field269 == var17.field269 && var13.field270 == var17.field270) {
								method404(var17, var4, var5, field1044[var16]);
							}
						}
					}

					method404(var13, var4, var5, var7);
				}

				if (var6 == 3) {
					class41 var18 = field1118[field1017][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method229(); var19 != null; var19 = (class22) var18.method231()) {
							class55 var20 = class55.method287(var19.field267);
							if (field1129 == 1) {
								field1053[field1174] = "Use " + field1133 + " with @lre@" + var20.field774;
								field1063[field1174] = 203;
								field1064[field1174] = var19.field267;
								field1061[field1174] = var4;
								field1062[field1174] = var5;
								field1174++;
							} else if (field1290 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field788 != null && var20.field788[var21] != null) {
										field1053[field1174] = var20.field788[var21] + " @lre@" + var20.field774;

										if (var21 == 0) {
											field1063[field1174] = 56;
										}

										if (var21 == 1) {
											field1063[field1174] = 321;
										}

										if (var21 == 2) {
											field1063[field1174] = 552;
										}

										if (var21 == 3) {
											field1063[field1174] = 43;
										}

										if (var21 == 4) {
											field1063[field1174] = 687;
										}

										field1064[field1174] = var19.field267;
										field1061[field1174] = var4;
										field1062[field1174] = var5;
										field1174++;
									} else if (var21 == 2) {
										field1053[field1174] = "Take @lre@" + var20.field774;
										field1063[field1174] = 552;
										field1064[field1174] = var19.field267;
										field1061[field1174] = var4;
										field1062[field1174] = var5;
										field1174++;
									}
								}

								field1053[field1174] = "Examine @lre@" + var20.field774;
								field1063[field1174] = 1308;
								field1064[field1174] = var19.field267;
								field1061[field1174] = var4;
								field1062[field1174] = var5;
								field1174++;
							} else if ((field1292 & 0x1) == 1) {
								field1053[field1174] = field1293 + " @lre@" + var20.field774;
								field1063[field1174] = 543;
								field1064[field1174] = var19.field267;
								field1061[field1174] = var4;
								field1062[field1174] = var5;
								field1174++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method419() {
		for (int var1 = 0; var1 < field1136; var1++) {
			int var2 = field1137[var1];
			class25 var3 = field1135[var2];
			if (var3 != null) {
				method420(var3.field321.field746, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILx;)V")
	public final void method420(int arg0, class24 arg1) {
		if (arg1.field269 < 128 || arg1.field270 < 128 || arg1.field269 >= 13184 || arg1.field270 >= 13184) {
			arg1.field296 = -1;
			arg1.field301 = -1;
			arg1.field310 = 0;
			arg1.field311 = 0;
			arg1.field269 = arg1.field317[0] * 128 + arg1.field273 * 64;
			arg1.field270 = arg1.field318[0] * 128 + arg1.field273 * 64;
			arg1.field316 = 0;
		}

		if (field1030 == arg1 && (arg1.field269 < 1536 || arg1.field270 < 1536 || arg1.field269 >= 11776 || arg1.field270 >= 11776)) {
			arg1.field296 = -1;
			arg1.field301 = -1;
			arg1.field310 = 0;
			arg1.field311 = 0;
			arg1.field269 = arg1.field317[0] * 128 + arg1.field273 * 64;
			arg1.field270 = arg1.field318[0] * 128 + arg1.field273 * 64;
			arg1.field316 = 0;
		}

		if (arg1.field310 > field1147) {
			method421(arg1);
		} else if (arg1.field311 >= field1147) {
			method422(arg1);
		} else {
			method423(arg1);
		}

		method424(arg1);
		method425(arg1);
	}

	@ObfuscatedName("client.a(Lx;I)V")
	public final void method421(class24 arg0) {
		int var2 = arg0.field310 - field1147;
		int var3 = arg0.field306 * 128 + arg0.field273 * 64;
		int var4 = arg0.field308 * 128 + arg0.field273 * 64;
		arg0.field269 += (var3 - arg0.field269) / var2;
		arg0.field270 += (var4 - arg0.field270) / var2;
		arg0.field320 = 0;

		if (arg0.field312 == 0) {
			arg0.field315 = 1024;
		}

		if (arg0.field312 == 1) {
			arg0.field315 = 1536;
		}

		if (arg0.field312 == 2) {
			arg0.field315 = 0;
		}

		if (arg0.field312 == 3) {
			arg0.field315 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLx;)V")
	public final void method422(class24 arg0) {
		if (field1147 == arg0.field311 || arg0.field296 == -1 || arg0.field299 != 0 || arg0.field298 + 1 > class62.field901[arg0.field296].field905[arg0.field297]) {
			int var2 = arg0.field311 - arg0.field310;
			int var3 = field1147 - arg0.field310;
			int var4 = arg0.field306 * 128 + arg0.field273 * 64;
			int var5 = arg0.field308 * 128 + arg0.field273 * 64;
			int var6 = arg0.field307 * 128 + arg0.field273 * 64;
			int var7 = arg0.field309 * 128 + arg0.field273 * 64;
			arg0.field269 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field270 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field320 = 0;

		if (arg0.field312 == 0) {
			arg0.field315 = 1024;
		}

		if (arg0.field312 == 1) {
			arg0.field315 = 1536;
		}

		if (arg0.field312 == 2) {
			arg0.field315 = 0;
		}

		if (arg0.field312 == 3) {
			arg0.field315 = 512;
		}

		arg0.field271 = arg0.field315;
	}

	@ObfuscatedName("client.a(ILx;)V")
	public final void method423(class24 arg0) {
		arg0.field293 = arg0.field274;
		if (arg0.field316 == 0) {
			arg0.field320 = 0;
		} else {
			if (arg0.field296 != -1 && arg0.field299 == 0) {
				class62 var2 = class62.field901[arg0.field296];
				if (var2.field907 == null) {
					arg0.field320++;
					return;
				}
			}

			int var3 = arg0.field269;
			int var4 = arg0.field270;
			int var5 = arg0.field317[arg0.field316 - 1] * 128 + arg0.field273 * 64;
			int var6 = arg0.field318[arg0.field316 - 1] * 128 + arg0.field273 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field315 = 1280;
					} else if (var4 > var6) {
						arg0.field315 = 1792;
					} else {
						arg0.field315 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field315 = 768;
					} else if (var4 > var6) {
						arg0.field315 = 256;
					} else {
						arg0.field315 = 512;
					}
				} else if (var4 < var6) {
					arg0.field315 = 1024;
				} else {
					arg0.field315 = 0;
				}

				int var7 = arg0.field315 - arg0.field271 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field277;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field276;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field279;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field278;
				}

				if (var8 == -1) {
					var8 = arg0.field276;
				}

				arg0.field293 = var8;
				int var9 = 4;
				if (arg0.field315 != arg0.field271 && arg0.field290 == -1) {
					var9 = 2;
				}

				if (arg0.field316 > 2) {
					var9 = 6;
				}

				if (arg0.field316 > 3) {
					var9 = 8;
				}

				if (arg0.field320 > 0 && arg0.field316 > 1) {
					var9 = 8;
					arg0.field320--;
				}

				if (arg0.field319[arg0.field316 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field293 == arg0.field276 && arg0.field280 != -1) {
					arg0.field293 = arg0.field280;
				}

				if (var3 < var5) {
					arg0.field269 += var9;
					if (arg0.field269 > var5) {
						arg0.field269 = var5;
					}
				} else if (var3 > var5) {
					arg0.field269 -= var9;
					if (arg0.field269 < var5) {
						arg0.field269 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field270 += var9;
					if (arg0.field270 > var6) {
						arg0.field270 = var6;
					}
				} else if (var4 > var6) {
					arg0.field270 -= var9;
					if (arg0.field270 < var6) {
						arg0.field270 = var6;
					}
				}

				if (arg0.field269 == var5 && arg0.field270 == var6) {
					arg0.field316--;
				}
			} else {
				arg0.field269 = var5;
				arg0.field270 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(Lx;Z)V")
	public final void method424(class24 arg0) {
		if (arg0.field290 != -1 && arg0.field290 < 32768) {
			class25 var2 = field1135[arg0.field290];
			if (var2 != null) {
				int var3 = arg0.field269 - var2.field269;
				int var4 = arg0.field270 - var2.field270;
				if (var3 != 0 || var4 != 0) {
					arg0.field315 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field290 >= 32768) {
			int var5 = arg0.field290 - 32768;
			if (field1181 == var5) {
				var5 = field1041;
			}

			class26 var6 = field1042[var5];
			if (var6 != null) {
				int var7 = arg0.field269 - var6.field269;
				int var8 = arg0.field270 - var6.field270;
				if (var7 != 0 || var8 != 0) {
					arg0.field315 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field291 != 0 || arg0.field292 != 0) && (arg0.field316 == 0 || arg0.field320 > 0)) {
			int var9 = arg0.field269 - (arg0.field291 - field1256 - field1256) * 64;
			int var10 = arg0.field270 - (arg0.field292 - field1257 - field1257) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field315 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field291 = 0;
			arg0.field292 = 0;
		}

		int var11 = arg0.field315 - arg0.field271 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field271 = arg0.field315;
			} else if (var11 > 1024) {
				arg0.field271 -= 32;
			} else {
				arg0.field271 += 32;
			}

			arg0.field271 &= 0x7FF;
			if (arg0.field293 == arg0.field274 && arg0.field315 != arg0.field271) {
				if (arg0.field275 != -1) {
					arg0.field293 = arg0.field275;
					return;
				}

				arg0.field293 = arg0.field276;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILx;)V")
	public final void method425(class24 arg0) {
		arg0.field272 = false;

		if (arg0.field293 != -1) {
			class62 var2 = class62.field901[arg0.field293];
			arg0.field295++;
			if (arg0.field294 < var2.field902 && arg0.field295 > var2.field905[arg0.field294]) {
				arg0.field295 = 0;
				arg0.field294++;
			}

			if (arg0.field294 >= var2.field902) {
				arg0.field295 = 0;
				arg0.field294 = 0;
			}
		}

		if (arg0.field296 != -1 && arg0.field299 == 0) {
			class62 var3 = class62.field901[arg0.field296];
			arg0.field298++;
			while (arg0.field297 < var3.field902 && arg0.field298 > var3.field905[arg0.field297]) {
				arg0.field298 -= var3.field905[arg0.field297];
				arg0.field297++;
			}

			if (arg0.field297 >= var3.field902) {
				arg0.field297 -= var3.field906;
				arg0.field300++;
				if (arg0.field300 >= var3.field912) {
					arg0.field296 = -1;
				}

				if (arg0.field297 < 0 || arg0.field297 >= var3.field902) {
					arg0.field296 = -1;
				}
			}

			arg0.field272 = var3.field908;
		}

		if (arg0.field299 > 0) {
			arg0.field299--;
		}

		if (arg0.field301 != -1 && field1147 >= arg0.field304) {
			if (arg0.field302 < 0) {
				arg0.field302 = 0;
			}

			class62 var4 = class63.field914[arg0.field301].field917;
			arg0.field303++;
			while (arg0.field302 < var4.field902 && arg0.field303 > var4.field905[arg0.field302]) {
				arg0.field303 -= var4.field905[arg0.field302];
				arg0.field302++;
			}

			if (arg0.field302 >= var4.field902) {
				if (arg0.field302 < 0 || arg0.field302 >= var4.field902) {
					arg0.field301 = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method426() {
		if (field1233) {
			field1233 = false;
			field1188.method236(11, field8, 0);
			field1189.method236(375, field8, 0);
			field1190.method236(5, field8, 729);
			field1191.method236(231, field8, 752);
			field1192.method236(0, field8, 0);
			field1193.method236(0, field8, 561);
			field1194.method236(11, field8, 520);
			field1195.method236(231, field8, 520);
			field1196.method236(375, field8, 501);
			field1197.method236(345, field8, 0);
			field1294 = true;
			field1173 = true;
			field1055 = true;
			field1079 = true;

			if (field1308 != 2) {
				field1020.method236(11, field8, 8);
				field1019.method236(5, field8, 561);
			}
		}

		if (field1308 == 2) {
			method482();
		}

		if (field1087 && field959 == 1) {
			field1294 = true;
		}

		if (field1243 != -1) {
			boolean var1 = method486(field1243, field989);
			if (var1) {
				field1294 = true;
			}
		}

		if (field1253 == 2) {
			field1294 = true;
		}

		if (field1115 == 2) {
			field1294 = true;
		}

		if (field1294) {
			method412();
			field1294 = false;
		}

		if (field1242 == -1) {
			field1034.field854 = field1298 - field1163 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method378(field1034, field15 - 22, 0, 77, field1298, 463, field16 - 375, false);
			}

			int var2 = field1298 - field1034.field854 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1298 - 77) {
				var2 = field1298 - 77;
			}

			if (field1163 != var2) {
				field1163 = var2;
				field1173 = true;
			}

			field1167++;
			if (field1167 > 87) {
				field1167 = 0;
				field1186.method198(225);
			}
		}

		if (field1242 != -1) {
			boolean var3 = method486(field1242, field989);
			if (var3) {
				field1173 = true;
			}
		}

		if (field1253 == 3) {
			field1173 = true;
		}

		if (field1115 == 3) {
			field1173 = true;
		}

		if (field1144 != null) {
			field1173 = true;
		}

		if (field1087 && field959 == 2) {
			field1173 = true;
		}

		if (field1173) {
			method433();
			field1173 = false;
		}

		if (field1308 == 2) {
			method457();
			field1019.method236(5, field8, 561);
		}

		if (field1265 != -1) {
			field1055 = true;
		}

		if (field1055) {
			if (field1265 != -1 && field1310 == field1265) {
				field1265 = -1;
				field1186.method198(50);
				field1186.method199(field1310);
			}

			field1055 = false;
			field1105.method235();
			field1287.method186(0, 0);

			if (field1243 == -1) {
				if (field1198[field1310] != -1) {
					if (field1310 == 0) {
						field1244.method186(29, 30);
					}

					if (field1310 == 1) {
						field1245.method186(59, 29);
					}

					if (field1310 == 2) {
						field1245.method186(87, 29);
					}

					if (field1310 == 3) {
						field1246.method186(115, 29);
					}

					if (field1310 == 4) {
						field1248.method186(156, 29);
					}

					if (field1310 == 5) {
						field1248.method186(184, 29);
					}

					if (field1310 == 6) {
						field1247.method186(212, 30);
					}
				}

				if (field1198[0] != -1 && (field1265 != 0 || field1147 % 20 < 10)) {
					field1013[0].method186(35, 34);
				}

				if (field1198[1] != -1 && (field1265 != 1 || field1147 % 20 < 10)) {
					field1013[1].method186(59, 32);
				}

				if (field1198[2] != -1 && (field1265 != 2 || field1147 % 20 < 10)) {
					field1013[2].method186(86, 32);
				}

				if (field1198[3] != -1 && (field1265 != 3 || field1147 % 20 < 10)) {
					field1013[3].method186(121, 33);
				}

				if (field1198[4] != -1 && (field1265 != 4 || field1147 % 20 < 10)) {
					field1013[4].method186(157, 34);
				}

				if (field1198[5] != -1 && (field1265 != 5 || field1147 % 20 < 10)) {
					field1013[5].method186(185, 32);
				}

				if (field1198[6] != -1 && (field1265 != 6 || field1147 % 20 < 10)) {
					field1013[6].method186(212, 34);
				}
			}

			field1105.method236(165, field8, 520);
			field1104.method235();
			field1286.method186(0, 0);

			if (field1243 == -1) {
				if (field1198[field1310] != -1) {
					if (field1310 == 7) {
						field977.method186(49, 0);
					}

					if (field1310 == 8) {
						field978.method186(81, 0);
					}

					if (field1310 == 9) {
						field978.method186(108, 0);
					}

					if (field1310 == 10) {
						field979.method186(136, 1);
					}

					if (field1310 == 11) {
						field981.method186(178, 0);
					}

					if (field1310 == 12) {
						field981.method186(205, 0);
					}

					if (field1310 == 13) {
						field980.method186(233, 0);
					}
				}

				if (field1198[8] != -1 && (field1265 != 8 || field1147 % 20 < 10)) {
					field1013[7].method186(80, 2);
				}

				if (field1198[9] != -1 && (field1265 != 9 || field1147 % 20 < 10)) {
					field1013[8].method186(107, 3);
				}

				if (field1198[10] != -1 && (field1265 != 10 || field1147 % 20 < 10)) {
					field1013[9].method186(142, 4);
				}

				if (field1198[11] != -1 && (field1265 != 11 || field1147 % 20 < 10)) {
					field1013[10].method186(179, 2);
				}

				if (field1198[12] != -1 && (field1265 != 12 || field1147 % 20 < 10)) {
					field1013[11].method186(206, 2);
				}

				if (field1198[13] != -1 && (field1265 != 13 || field1147 % 20 < 10)) {
					field1013[12].method186(230, 2);
				}
			}

			field1104.method236(492, field8, 501);
			field1020.method235();
		}

		if (field1079) {
			field1079 = false;
			field1103.method235();
			field1285.method186(0, 0);
			field1275.method189(33, "Public chat", true, 0xFFFFFF, 57);

			if (field1328 == 0) {
				field1275.method189(46, "On", true, 0xFF00, 57);
			}

			if (field1328 == 1) {
				field1275.method189(46, "Friends", true, 0xFFFF00, 57);
			}

			if (field1328 == 2) {
				field1275.method189(46, "Off", true, 0xFF0000, 57);
			}

			if (field1328 == 3) {
				field1275.method189(46, "Hide", true, 0xFFFF, 57);
			}

			field1275.method189(33, "Private chat", true, 0xFFFFFF, 186);

			if (field1123 == 0) {
				field1275.method189(46, "On", true, 0xFF00, 186);
			}

			if (field1123 == 1) {
				field1275.method189(46, "Friends", true, 0xFFFF00, 186);
			}

			if (field1123 == 2) {
				field1275.method189(46, "Off", true, 0xFF0000, 186);
			}

			field1275.method189(33, "Trade/duel", true, 0xFFFFFF, 326);

			if (field1083 == 0) {
				field1275.method189(46, "On", true, 0xFF00, 326);
			}

			if (field1083 == 1) {
				field1275.method189(46, "Friends", true, 0xFFFF00, 326);
			}

			if (field1083 == 2) {
				field1275.method189(46, "Off", true, 0xFF0000, 326);
			}

			field1275.method189(38, "Report abuse", true, 0xFFFFFF, 462);
			field1103.method236(471, field8, 0);
			field1020.method235();
		}

		field989 = 0;
	}

	@ObfuscatedName("client.a(ILx;I)V")
	public final void method427(int arg0, class24 arg1) {
		method428(arg1.field270, arg1.field269, arg0);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method428(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method447(arg0, arg1, field1017) - arg2;
			arg1 -= field1211;
			var4 -= field1212;
			arg0 -= field1213;
			int var5 = class31.field480[field1214];
			int var6 = class31.field481[field1214];
			int var7 = class31.field480[field1215];
			int var8 = class31.field481[field1215];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1069 = (var9 << 9) / arg0 + class33.field499;
				field1070 = (var11 << 9) / arg0 + class33.field500;
			} else {
				field1069 = -1;
				field1070 = -1;
			}
		} else {
			field1069 = -1;
			field1070 = -1;
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method429() {
		int var1 = field1216 * 128 + 64;
		int var2 = field1217 * 128 + 64;
		int var3 = method447(field1217, field1216, field1017) - field1218;

		if (field1211 < var1) {
			field1211 += (var1 - field1211) * field1220 / 1000 + field1219;
			if (field1211 > var1) {
				field1211 = var1;
			}
		}

		if (field1211 > var1) {
			field1211 -= (field1211 - var1) * field1220 / 1000 + field1219;
			if (field1211 < var1) {
				field1211 = var1;
			}
		}

		if (field1212 < var3) {
			field1212 += (var3 - field1212) * field1220 / 1000 + field1219;
			if (field1212 > var3) {
				field1212 = var3;
			}
		}

		if (field1212 > var3) {
			field1212 -= (field1212 - var3) * field1220 / 1000 + field1219;
			if (field1212 < var3) {
				field1212 = var3;
			}
		}

		if (field1213 < var2) {
			field1213 += (var2 - field1213) * field1220 / 1000 + field1219;
			if (field1213 > var2) {
				field1213 = var2;
			}
		}

		if (field1213 > var2) {
			field1213 -= (field1213 - var2) * field1220 / 1000 + field1219;
			if (field1213 < var2) {
				field1213 = var2;
			}
		}

		int var4 = field1222 * 128 + 64;
		int var5 = field1223 * 128 + 64;
		int var6 = method447(field1223, field1222, field1017) - field1224;
		int var7 = var4 - field1211;
		int var8 = var6 - field1212;
		int var9 = var5 - field1213;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1214 < var11) {
			field1214 += (var11 - field1214) * field1226 / 1000 + field1225;
			if (field1214 > var11) {
				field1214 = var11;
			}
		}

		if (field1214 > var11) {
			field1214 -= (field1214 - var11) * field1226 / 1000 + field1225;
			if (field1214 < var11) {
				field1214 = var11;
			}
		}

		int var13 = var12 - field1215;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1215 += field1226 * var13 / 1000 + field1225;
			field1215 &= 0x7FF;
		}

		if (var13 < 0) {
			field1215 -= -var13 * field1226 / 1000 + field1225;
			field1215 &= 0x7FF;
		}

		int var14 = var12 - field1215;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1215 = var12;
		}
	}

	@ObfuscatedName("client.c(III)V")
	public final void method430(int arg0, int arg1) {
		if (field948 != 0) {
			int var3 = 0;
			if (field1330 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field1024[var4] != null) {
					int var5 = field1022[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field1123 == 0 || field1123 == 1 && method464(field1023[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field15 > 8 && field15 < 520 && arg0 - 11 > var6 - 10 && arg0 - 11 <= var6 + 3) {
							if (field1148) {
								field1053[field1174] = "Report abuse @whi@" + field1023[var4];
								field1063[field1174] = 2316;
								field1174++;
							}

							field1053[field1174] = "Add ignore @whi@" + field1023[var4];
							field1063[field1174] = 2158;
							field1174++;
							field1053[field1174] = "Add friend @whi@" + field1023[var4];
							field1063[field1174] = 2447;
							field1174++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field1123 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1003.method186(arg3, arg1);
		field1004.method186(arg3, arg0 + arg1 - 16);
		class32.method149(field1268, arg3, arg1 + 16, 16, arg0 - 32);
		int var6 = (arg0 - 32) * arg0 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg2 / (arg4 - arg0);
		class32.method149(field1342, arg3, arg1 + var7 + 16, 16, var6);
		class32.method152(arg1 + var7 + 16, field1112, var6, arg3);
		class32.method152(arg1 + var7 + 16, field1112, var6, arg3 + 1);
		class32.method151(field1112, arg1 + var7 + 16, arg3, 16);
		class32.method151(field1112, arg1 + var7 + 17, arg3, 16);
		class32.method152(arg1 + var7 + 16, field1071, var6, arg3 + 15);
		class32.method152(arg1 + var7 + 17, field1071, var6 - 1, arg3 + 14);
		class32.method151(field1071, arg1 + var7 + var6 + 15, arg3, 16);
		class32.method151(field1071, arg1 + var7 + var6 + 14, arg3 + 1, 15);
	}

	@ObfuscatedName("client.g(B)V")
	public final void method432() {
		field982 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1316[var1] = -1;
			for (int var2 = 0; var2 < class59.field827; var2++) {
				if (!class59.field828[var2].field834 && class59.field828[var2].field829 == var1 + (field1072 ? 0 : 7)) {
					field1316[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method433() {
		field1021.method235();
		class33.field505 = field1229;
		field1320.method186(0, 0);

		if (field1187) {
			field1276.method188(239, 40, field1234, 0);
			field1276.method188(239, 60, field1201 + "*", 128);
		} else if (field1141) {
			field1276.method188(239, 40, "Enter amount to transfer:", 0);
			field1276.method188(239, 60, field1082 + "*", 128);
		} else if (field1144 != null) {
			field1276.method188(239, 40, field1144, 0);
			field1276.method188(239, 60, "Click to continue", 128);
		} else if (field1242 != -1) {
			method409(class60.field835[field1242], 0, 0, 0);
		} else if (field1075 == -1) {
			class36 var1 = field1275;
			int var2 = 0;
			class32.method147(77, 0, 0, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1024[var3] != null) {
					int var4 = field1022[var3];
					int var5 = field1163 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0, field1024[var3], var5);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0xFFFFFF, field1023[var3] + ":", var5);
							var1.method191(var1.method190(field1023[var3]) + 12, 255, field1024[var3], var5);
						}

						var2++;
					}

					if (var4 == 2 && (field1328 == 0 || field1328 == 1 && method464(field1023[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0, field1023[var3] + ":", var5);
							var1.method191(var1.method190(field1023[var3]) + 12, 255, field1024[var3], var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field948 == 0 && (var4 == 7 || field1123 == 0 || field1123 == 1 && method464(field1023[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0, "From " + field1023[var3] + ":", var5);
							var1.method191(var1.method190("From " + field1023[var3]) + 12, 0x800000, field1024[var3], var5);
						}

						var2++;
					}

					if (var4 == 4 && (field1083 == 0 || field1083 == 1 && method464(field1023[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0x800080, field1023[var3] + " " + field1024[var3], var5);
						}

						var2++;
					}

					if (var4 == 5 && field948 == 0 && field1123 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0x800000, field1024[var3], var5);
						}

						var2++;
					}

					if (var4 == 6 && field948 == 0 && field1123 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0, "To " + field1023[var3] + ":", var5);
							var1.method191(var1.method190("To " + field1023[var3]) + 12, 0x800000, field1024[var3], var5);
						}

						var2++;
					}

					if (var4 == 8 && (field1083 == 0 || field1083 == 1 && method464(field1023[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, 0xCBB789, field1023[var3] + " " + field1024[var3], var5);
						}

						var2++;
					}
				}
			}

			class32.method146();
			field1298 = var2 * 14 + 7;
			if (field1298 < 78) {
				field1298 = 78;
			}

			method431(77, 0, field1298 - field1163 - 77, 463, field1298);
			var1.method191(4, 0, class48.method255(field1296) + ":", 90);
			var1.method191(var1.method190(field1296 + ": ") + 6, 255, field1284 + "*", 90);
			class32.method151(0, 77, 0, 479);
		} else {
			method409(class60.field835[field1075], 0, 0, 0);
		}

		if (field1087 && field959 == 2) {
			method444();
		}

		field1021.method236(375, field8, 22);
		field1020.method235();
		class33.field505 = field1231;
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method434(int arg0) {
		class60 var2 = class60.field835[arg0];
		for (int var3 = 0; var3 < var2.field856.length && var2.field856[var3] != -1; var3++) {
			class60 var4 = class60.field835[var2.field856[var3]];
			if (var4.field842 == 1) {
				method434(var4.field840);
			}

			var4.field838 = 0;
			var4.field839 = 0;
		}
	}

	@ObfuscatedName("client.u(I)Z")
	public final boolean method435() {
		if (field1205 == null) {
			return false;
		}

		try {
			int var1 = field1205.method31();
			if (var1 == 0) {
				return false;
			}

			if (field1236 == -1) {
				field1205.method32(field1168.field541, 0, 1);
				field1236 = field1168.field541[0] & 0xFF;
				if (field1300 != null) {
					field1236 = field1236 - field1300.method246() & 0xFF;
				}

				field1235 = class56.field809[field1236];
				var1--;
			}

			if (field1235 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1205.method32(field1168.field541, 0, 1);
				field1235 = field1168.field541[0] & 0xFF;
				var1--;
			}

			if (field1235 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1205.method32(field1168.field541, 0, 2);
				field1168.field542 = 0;
				field1235 = field1168.method211();
				var1 -= 2;
			}

			if (var1 < field1235) {
				return false;
			}

			field1168.field542 = 0;
			field1205.method32(field1168.field541, 0, field1235);
			field1237 = 0;
			field1099 = field1098;
			field1098 = field1097;
			field1097 = field1236;

			if (field1236 == 169) {
				int var2 = field1168.method211();
				class60.field835[var2].field881 = field1030.method115();
				field1236 = -1;
				return true;
			}

			if (field1236 == 212) {
				int var3 = field1168.method211();
				int var4 = field1168.method211();
				int var5 = var4 >> 10 & 0x1F;
				int var6 = var4 >> 5 & 0x1F;
				int var7 = var4 & 0x1F;
				class60.field835[var3].field876 = (var7 << 3) + (var5 << 19) + (var6 << 11);
				field1236 = -1;
				return true;
			}

			if (field1236 == 242) {
				field1330 = field1168.method211() * 30;
				field1236 = -1;
				return true;
			}

			if (field1236 == 235) {
				int var8 = field1168.method211();
				int var9 = field1168.method214();
				field1056[var8] = var9;

				if (field1152[var8] != var9) {
					field1152[var8] = var9;
					method441(var8);
					field1294 = true;

					if (field1075 != -1) {
						field1173 = true;
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 202) {
				int var10 = field1168.method211();
				int var11 = field1168.method209();
				int var12 = field1168.method211();
				if (field1140 && !field974 && field1336 < 50) {
					field1048[field1336] = var10;
					field975[field1336] = var11;
					field1317[field1336] = class51.field668[var10] + var12;
					field1336++;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 57) {
				if (field1310 == 12) {
					field1294 = true;
				}

				field1207 = field1168.method212();
				field1236 = -1;
				return true;
			}

			if (field1236 == 39) {
				method368();
				field1236 = -1;
				return false;
			}

			if (field1236 == 240) {
				field1302 = true;
				field1222 = field1168.method209();
				field1223 = field1168.method209();
				field1224 = field1168.method211();
				field1225 = field1168.method209();
				field1226 = field1168.method209();
				if (field1226 >= 100) {
					int var13 = field1222 * 128 + 64;
					int var14 = field1223 * 128 + 64;
					int var15 = method447(field1223, field1222, field1017) - field1224;
					int var16 = var13 - field1211;
					int var17 = var15 - field1212;
					int var18 = var14 - field1213;
					int var19 = (int) Math.sqrt(var16 * var16 + var18 * var18);
					field1214 = (int) (Math.atan2(var17, var19) * 325.949D) & 0x7FF;
					field1215 = (int) (Math.atan2(var16, var18) * -325.949D) & 0x7FF;

					if (field1214 < 128) {
						field1214 = 128;
					}

					if (field1214 > 383) {
						field1214 = 383;
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 201) {
				long var20 = field1168.method215();
				int var22 = field1168.method214();
				int var23 = field1168.method209();
				boolean var24 = false;
				for (int var25 = 0; var25 < 100; var25++) {
					if (field951[var25] == var22) {
						var24 = true;
						break;
					}
				}

				if (var23 <= 1) {
					for (int var26 = 0; var26 < field1331; var26++) {
						if (field954[var26] == var20) {
							var24 = true;
							break;
						}
					}
				}

				if (!var24 && field1128 == 0) {
					try {
						field951[field1301] = var22;
						field1301 = (field1301 + 1) % 100;
						String var27 = class49.method258(field1235 - 13, field1168);
						var27 = class65.method335(var27);
						if (var23 > 1) {
							method391(var27, 7, class48.method255(class48.method252(var20)));
						} else {
							method391(var27, 3, class48.method255(class48.method252(var20)));
						}
					} catch (Exception var179) {
						signlink.reporterror("cde1");
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 66) {
				int var29 = field1168.method209();
				int var30 = field1168.method209();
				int var31 = field1168.method211();
				int var32 = field1168.method211();
				int var33 = -1;
				for (int var34 = 0; var34 < field1221.length; var34++) {
					if ((var29 << 8) + var30 == field1221[var34]) {
						var33 = var34;
					}
				}

				if (var33 != -1) {
					if (field1321[var33] == null || field1321[var33].length != var32) {
						field1321[var33] = new byte[var32];
					}

					field1168.method218(var31, field1321[var33], field1235 - 6);
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 213) {
				field1328 = field1168.method209();
				field1123 = field1168.method209();
				field1083 = field1168.method209();
				field1079 = true;
				field1173 = true;
				field1236 = -1;
				return true;
			}

			if (field1236 == 177) {
				field1181 = field1168.method211();
				field1236 = -1;
				return true;
			}

			if (field1236 == 192) {
				field987 = field1168.method209();
				field988 = field1168.method209();

				while (field1168.field542 < field1235) {
					int var35 = field1168.method209();
					method395(var35, field1168);
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 174) {
				field1302 = true;
				field1216 = field1168.method209();
				field1217 = field1168.method209();
				field1218 = field1168.method211();
				field1219 = field1168.method209();
				field1220 = field1168.method209();
				if (field1220 >= 100) {
					field1211 = field1216 * 128 + 64;
					field1213 = field1217 * 128 + 64;
					field1212 = method447(field1217, field1216, field1017) - field1218;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 128) {
				method463(field1168, field1235);
				field1236 = -1;
				return true;
			}

			if (field1236 == 112) {
				String var36 = field1168.method216();
				if (var36.endsWith(":tradereq:")) {
					String var37 = var36.substring(0, var36.indexOf(":"));
					long var38 = class48.method251(var37);
					boolean var40 = false;
					for (int var41 = 0; var41 < field1331; var41++) {
						if (field954[var41] == var38) {
							var40 = true;
							break;
						}
					}

					if (!var40 && field1128 == 0) {
						method391("wishes to trade with you.", 4, var37);
					}
				} else if (var36.endsWith(":duelreq:")) {
					String var42 = var36.substring(0, var36.indexOf(":"));
					long var43 = class48.method251(var42);
					boolean var45 = false;
					for (int var46 = 0; var46 < field1331; var46++) {
						if (field954[var46] == var43) {
							var45 = true;
							break;
						}
					}

					if (!var45 && field1128 == 0) {
						method391("wishes to duel with you.", 8, var42);
					}
				} else {
					method391(var36, 0, "");
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 230) {
				if (field1054 && !field974) {
					int var47 = field1168.method211();
					int var48 = field1168.method214();
					int var49 = field1235 - 6;
					byte[] var50 = new byte[var48];
					class44.method238(var50, var48, field1168.field541, var49, field1168.field542);
					method458(var48, false, var50);
					field1126 = var47;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 250) {
				field987 = field1168.method209();
				field988 = field1168.method209();
				field1236 = -1;
				return true;
			}

			if (field1236 == 48) {
				int var51 = field1168.method211();
				int var52 = field1168.method211();
				class54 var53 = class54.method281(var52);
				class60.field835[var51].field881 = var53.method284();
				field1236 = -1;
				return true;
			}

			if (field1236 == 47) {
				field1302 = false;

				for (int var54 = 0; var54 < 5; var54++) {
					field1110[var54] = false;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 35) {
				int var55 = field1168.method209();
				int var56 = field1168.method209();
				int var57 = field1168.method211();
				int var58 = field1168.method211();
				int var59 = -1;
				for (int var60 = 0; var60 < field1221.length; var60++) {
					if ((var55 << 8) + var56 == field1221[var60]) {
						var59 = var60;
					}
				}

				if (var59 != -1) {
					if (field1282[var59] == null || field1282[var59].length != var58) {
						field1282[var59] = new byte[var58];
					}

					field1168.method218(var57, field1282[var59], field1235 - 6);
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 153) {
				int var61 = field1168.method211();
				method434(var61);

				if (field1242 != -1) {
					field1242 = -1;
					field1173 = true;
				}

				if (field1141) {
					field1141 = false;
					field1173 = true;
				}

				field1243 = var61;
				field1294 = true;
				field1055 = true;
				field1240 = -1;
				field1204 = false;
				field1236 = -1;
				return true;
			}

			if (field1236 == 253) {
				int var62 = field1168.method211();
				int var63 = field1168.method211();
				int var64 = field1168.method211();
				class60 var65 = class60.field835[var62];
				class31 var66 = var65.field881;
				if (var66 != null) {
					var66.method133(var63, var64);
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 33) {
				int var67 = field1168.method211();
				int var68 = field1168.method211();
				int var69 = field1168.method211();
				class55 var70 = class55.method287(var68);
				class60.field835[var67].field881 = var70.method291(50);
				class60.field835[var67].field886 = var70.field779;
				class60.field835[var67].field887 = var70.field780;
				class60.field835[var67].field885 = var70.field778 * 100 / var69;
				field1236 = -1;
				return true;
			}

			if (field1236 == 60) {
				int var71 = field1168.method209();
				int var72 = field1168.method209();
				int var73 = -1;
				for (int var74 = 0; var74 < field1221.length; var74++) {
					if ((var71 << 8) + var72 == field1221[var74]) {
						var73 = var74;
					}
				}

				if (var73 != -1) {
					signlink.cachesave("l" + var71 + "_" + var72, field1282[var73]);
					field1308 = 1;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 132) {
				class5.method35(true);
				field1236 = -1;
				return true;
			}

			if (field1236 == 107) {
				if (field1310 == 12) {
					field1294 = true;
				}

				field1289 = field1168.method209();
				field1236 = -1;
				return true;
			}

			if (field1236 == 255) {
				if (field1243 != -1) {
					field1243 = -1;
					field1294 = true;
					field1055 = true;
				}

				if (field1242 != -1) {
					field1242 = -1;
					field1173 = true;
				}

				if (field1141) {
					field1141 = false;
					field1173 = true;
				}

				field1240 = -1;
				field1204 = false;
				field1236 = -1;
				return true;
			}

			if (field1236 == 42) {
				field1210 = field1168.method209();
				if (field1210 == 1) {
					field1025 = field1168.method211();
				}

				if (field1210 >= 2 && field1210 <= 6) {
					if (field1210 == 2) {
						field1263 = 64;
						field1264 = 64;
					}

					if (field1210 == 3) {
						field1263 = 0;
						field1264 = 64;
					}

					if (field1210 == 4) {
						field1263 = 128;
						field1264 = 64;
					}

					if (field1210 == 5) {
						field1263 = 64;
						field1264 = 0;
					}

					if (field1210 == 6) {
						field1263 = 64;
						field1264 = 128;
					}

					field1210 = 2;
					field1260 = field1168.method211();
					field1261 = field1168.method211();
					field1262 = field1168.method209();
				}

				if (field1210 == 10) {
					field1255 = field1168.method211();
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 248) {
				int var75 = field1168.method211();
				int var76 = field1168.method211();
				class60.field835[var75].field881 = new class31(var76);
				field1236 = -1;
				return true;
			}

			if (field1236 == 94) {
				field1294 = true;
				int var77 = field1168.method209();
				int var78 = field1168.method214();
				int var79 = field1168.method209();
				field1175[var77] = var78;
				field1299[var77] = var79;
				field984[var77] = 1;
				for (int var80 = 0; var80 < 98; var80++) {
					if (var78 >= field952[var80]) {
						field984[var77] = var80 + 2;
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 113) {
				field1331 = field1235 / 8;
				for (int var81 = 0; var81 < field1331; var81++) {
					field954[var81] = field1168.method215();
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 123) {
				field1294 = true;
				int var82 = field1168.method211();
				class60 var83 = class60.field835[var82];
				int var84 = field1168.method209();
				for (int var85 = 0; var85 < var84; var85++) {
					var83.field836[var85] = field1168.method211();
					int var86 = field1168.method209();
					if (var86 == 255) {
						var86 = field1168.method214();
					}

					var83.field837[var85] = var86;
				}

				for (int var87 = var84; var87 < var83.field836.length; var87++) {
					var83.field836[var87] = 0;
					var83.field837[var87] = 0;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 12) {
				int var88 = field1168.method209();
				int var89 = field1168.method209();
				int var90 = -1;
				for (int var91 = 0; var91 < field1221.length; var91++) {
					if ((var88 << 8) + var89 == field1221[var91]) {
						var90 = var91;
					}
				}

				if (var90 != -1) {
					signlink.cachesave("m" + var88 + "_" + var89, field1321[var90]);
					field1308 = 1;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 231) {
				int var92 = field1168.method211();
				int var93 = field1168.method211();

				if (field1242 != -1) {
					field1242 = -1;
					field1173 = true;
				}

				if (field1141) {
					field1141 = false;
					field1173 = true;
				}

				field1240 = var92;
				field1243 = var93;
				field1294 = true;
				field1055 = true;
				field1204 = false;
				field1236 = -1;
				return true;
			}

			if (field1236 == 147) {
				field987 = field1168.method209();
				field988 = field1168.method209();
				for (int var94 = field987; var94 < field987 + 8; var94++) {
					for (int var95 = field988; var95 < field988 + 8; var95++) {
						if (field1118[field1017][var94][var95] != null) {
							field1118[field1017][var94][var95] = null;
							method459(var94, var95);
						}
					}
				}

				for (class38 var96 = (class38) field947.method228(); var96 != null; var96 = (class38) field947.method230()) {
					if (var96.field555 >= field987 && var96.field555 < field987 + 8 && var96.field556 >= field988 && var96.field556 < field988 + 8 && field1017 == var96.field553) {
						method445(var96.field554, var96.field561, var96.field562, var96.field556, var96.field555, var96.field553, var96.field560);
						var96.method107();
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 171) {
				field1100 = field1168.method214();
				field1011 = field1168.method211();
				field1271 = field1168.method209();
				field1241 = field1168.method211();

				if (field1100 != 0 && field1240 == -1) {
					signlink.dnslookup(class48.method254(field1100));
					method398();
					short var97 = 650;
					if (field1271 != 201) {
						var97 = 655;
					}

					field1127 = "";
					field1269 = false;

					for (int var98 = 0; var98 < class60.field835.length; var98++) {
						if (class60.field835[var98] != null && class60.field835[var98].field844 == var97) {
							field1240 = class60.field835[var98].field841;
							break;
						}
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 72) {
				field1031 = field1168.method209();
				field1236 = -1;
				return true;
			}

			if (field1236 == 176) {
				int var99 = field1168.method211();
				String var100 = field1168.method216();
				class60.field835[var99].field874 = var100;

				if (field1198[field1310] == class60.field835[var99].field841) {
					field1294 = true;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 71) {
				int var101 = field1168.method209();
				int var102 = field1168.method209();
				int var103 = field1168.method209();
				int var104 = field1168.method209();
				field1110[var101] = true;
				field1014[var101] = var102;
				field1312[var101] = var103;
				field1327[var101] = var104;
				field953[var101] = 0;
				field1236 = -1;
				return true;
			}

			if (field1236 == 68) {
				class5.method34();
				field1236 = -1;
				return true;
			}

			if (field1236 == 106) {
				int var105 = field1168.method211();
				method434(var105);

				if (field1243 != -1) {
					field1243 = -1;
					field1294 = true;
					field1055 = true;
				}

				field1242 = var105;
				field1173 = true;
				field1240 = -1;
				field1204 = false;
				field1236 = -1;
				return true;
			}

			if (field1236 == 85) {
				field1310 = field1168.method209();
				field1294 = true;
				field1055 = true;
				field1236 = -1;
				return true;
			}

			if (field1236 == 140) {
				long var106 = field1168.method215();
				int var108 = field1168.method209();
				String var109 = class48.method255(class48.method252(var106));
				for (int var110 = 0; var110 < field956; var110++) {
					if (field1270[var110] == var106) {
						if (field1165[var110] != var108) {
							field1165[var110] = var108;
							field1294 = true;

							if (var108 > 0) {
								method391(var109 + " has logged in.", 5, "");
							}

							if (var108 == 0) {
								method391(var109 + " has logged out.", 5, "");
							}
						}

						var109 = null;
						break;
					}
				}

				if (var109 != null && field956 < 100) {
					field1270[field956] = var106;
					field1138[field956] = var109;
					field1165[field956] = var108;
					field956++;
					field1294 = true;
				}

				boolean var111 = false;
				while (!var111) {
					var111 = true;
					for (int var112 = 0; var112 < field956 - 1; var112++) {
						if (field1165[var112] != field971 && field1165[var112 + 1] == field971 || field1165[var112] == 0 && field1165[var112 + 1] != 0) {
							int var113 = field1165[var112];
							field1165[var112] = field1165[var112 + 1];
							field1165[var112 + 1] = var113;
							String var114 = field1138[var112];
							field1138[var112] = field1138[var112 + 1];
							field1138[var112 + 1] = var114;
							long var115 = field1270[var112];
							field1270[var112] = field1270[var112 + 1];
							field1270[var112 + 1] = var115;
							field1294 = true;
							var111 = false;
						}
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 165) {
				int var117 = field1168.method212();
				field1075 = var117;
				field1173 = true;
				field1236 = -1;
				return true;
			}

			if (field1236 == 216) {
				for (int var118 = 0; var118 < field1152.length; var118++) {
					if (field1152[var118] != field1056[var118]) {
						field1152[var118] = field1056[var118];
						method441(var118);
						field1294 = true;
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 117 || field1236 == 25 || field1236 == 127 || field1236 == 195 || field1236 == 1 || field1236 == 61 || field1236 == 246 || field1236 == 78 || field1236 == 214 || field1236 == 220) {
				method395(field1236, field1168);
				field1236 = -1;
				return true;
			}

			if (field1236 == 180) {
				int var119 = field1168.method211();
				method434(var119);

				if (field1243 != -1) {
					field1243 = -1;
					field1294 = true;
					field1055 = true;
				}

				if (field1242 != -1) {
					field1242 = -1;
					field1173 = true;
				}

				if (field1141) {
					field1141 = false;
					field1173 = true;
				}

				field1240 = var119;
				field1204 = false;
				field1236 = -1;
				return true;
			}

			if (field1236 == 125) {
				field1006 = 0;
				field1236 = -1;
				return true;
			}

			if (field1236 == 191) {
				int var120 = field1168.method211();
				int var121 = field1168.method212();
				int var122 = field1168.method212();
				class60 var123 = class60.field835[var120];
				var123.field847 = var121;
				var123.field848 = var122;
				field1236 = -1;
				return true;
			}

			if (field1236 == 3) {
				int var124 = field1168.method211();
				int var125 = field1168.method211();
				if (field1067 == var124 && field1068 == var125 && field1308 != 0) {
					field1236 = -1;
					return true;
				}

				field1067 = var124;
				field1068 = var125;
				field1256 = (field1067 - 6) * 8;
				field1257 = (field1068 - 6) * 8;
				field1308 = 1;
				field1020.method235();
				field1275.method188(257, 151, "Loading - please wait.", 0);
				field1275.method188(256, 150, "Loading - please wait.", 0xFFFFFF);
				field1020.method236(11, field8, 8);
				signlink.looprate(5);
				int var126 = (field1235 - 2) / 10;
				field1321 = new byte[var126][];
				field1282 = new byte[var126][];
				field1221 = new int[var126];
				field1186.method198(131);
				field1186.method199(0);
				int var127 = 0;
				for (int var128 = 0; var128 < var126; var128++) {
					int var129 = field1168.method209();
					int var130 = field1168.method209();
					int var131 = field1168.method214();
					int var132 = field1168.method214();
					field1221[var128] = (var129 << 8) + var130;

					if (var131 != 0) {
						byte[] var133 = signlink.cacheload("m" + var129 + "_" + var130);
						if (var133 != null) {
							field1134.reset();
							field1134.update(var133);

							if ((int) field1134.getValue() != var131) {
								var133 = null;
							}
						}

						if (var133 == null) {
							field1308 = 0;
							field1186.method199(0);
							field1186.method199(var129);
							field1186.method199(var130);
							var127 += 3;
						} else {
							field1321[var128] = var133;
						}
					}

					if (var132 != 0) {
						byte[] var134 = signlink.cacheload("l" + var129 + "_" + var130);
						if (var134 != null) {
							field1134.reset();
							field1134.update(var134);

							if ((int) field1134.getValue() != var132) {
								var134 = null;
							}
						}

						if (var134 == null) {
							field1308 = 0;
							field1186.method199(1);
							field1186.method199(var129);
							field1186.method199(var130);
							var127 += 3;
						} else {
							field1282[var128] = var134;
						}
					}
				}

				field1186.method208(var127);
				signlink.looprate(50);
				field1020.method235();

				if (field1308 == 0) {
					field1275.method188(257, 166, "Map area updated since last visit, so load will take longer this time only", 0);
					field1275.method188(256, 165, "Map area updated since last visit, so load will take longer this time only", 0xFFFFFF);
				}

				field1020.method236(11, field8, 8);
				int var135 = field1256 - field1258;
				int var136 = field1257 - field1259;
				field1258 = field1256;
				field1259 = field1257;

				for (int var137 = 0; var137 < 8192; var137++) {
					class25 var138 = field1135[var137];
					if (var138 != null) {
						for (int var139 = 0; var139 < 10; var139++) {
							var138.field317[var139] -= var135;
							var138.field318[var139] -= var136;
						}

						var138.field269 -= var135 * 128;
						var138.field270 -= var136 * 128;
					}
				}

				for (int var140 = 0; var140 < field1040; var140++) {
					class26 var141 = field1042[var140];
					if (var141 != null) {
						for (int var142 = 0; var142 < 10; var142++) {
							var141.field317[var142] -= var135;
							var141.field318[var142] -= var136;
						}

						var141.field269 -= var135 * 128;
						var141.field270 -= var136 * 128;
					}
				}

				byte var143 = 0;
				byte var144 = 104;
				byte var145 = 1;
				if (var135 < 0) {
					var143 = 103;
					var144 = -1;
					var145 = -1;
				}

				byte var146 = 0;
				byte var147 = 104;
				byte var148 = 1;
				if (var136 < 0) {
					var146 = 103;
					var147 = -1;
					var148 = -1;
				}

				for (int var149 = var143; var149 != var144; var149 += var145) {
					for (int var150 = var146; var150 != var147; var150 += var148) {
						int var151 = var135 + var149;
						int var152 = var136 + var150;
						for (int var153 = 0; var153 < 4; var153++) {
							if (var151 >= 0 && var152 >= 0 && var151 < 104 && var152 < 104) {
								field1118[var153][var149][var150] = field1118[var153][var151][var152];
							} else {
								field1118[var153][var149][var150] = null;
							}
						}
					}
				}

				for (class38 var154 = (class38) field947.method228(); var154 != null; var154 = (class38) field947.method230()) {
					var154.field555 -= var135;
					var154.field556 -= var136;
					if (var154.field555 < 0 || var154.field556 < 0 || var154.field555 >= 104 || var154.field556 >= 104) {
						var154.method107();
					}
				}

				if (field1006 != 0) {
					field1006 -= var135;
					field1007 -= var136;
				}

				field1302 = false;
				field1236 = -1;
				return true;
			}

			if (field1236 == 49) {
				method416(field1168, field1235);

				if (field1308 == 1) {
					field1308 = 2;
					class3.field27 = field1017;
					method471();
				}

				if (field974 && field1308 == 2 && class3.field27 != field1017) {
					field1020.method235();
					field1275.method188(257, 151, "Loading - please wait.", 0);
					field1275.method188(256, 150, "Loading - please wait.", 0xFFFFFF);
					field1020.method236(11, field8, 8);
					class3.field27 = field1017;
					method471();
				}

				if (field1139 != field1017 && field1308 == 2) {
					field1139 = field1017;
					method377(field1017);
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 92) {
				String var155 = field1168.method216();
				int var156 = field1168.method214();
				int var157 = field1168.method214();
				if (!var155.equals(field1066) && field1054 && !field974) {
					method406(var157, var156, var155);
				}

				field1066 = var155;
				field1106 = var156;
				field1283 = var157;
				field1126 = 0;
				field1236 = -1;
				return true;
			}

			if (field1236 == 133) {
				int var158 = field1168.method211();
				byte var159 = field1168.method210();
				field1056[var158] = var159;

				if (field1152[var158] != var159) {
					field1152[var158] = var159;
					method441(var158);
					field1294 = true;

					if (field1075 != -1) {
						field1173 = true;
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 55) {
				for (int var160 = 0; var160 < field1042.length; var160++) {
					if (field1042[var160] != null) {
						field1042[var160].field296 = -1;
					}
				}

				for (int var161 = 0; var161 < field1135.length; var161++) {
					if (field1135[var161] != null) {
						field1135[var161].field296 = -1;
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 80) {
				int var162 = field1168.method211();
				int var163 = field1168.method211();
				class60.field835[var162].field883 = var163;
				field1236 = -1;
				return true;
			}

			if (field1236 == 38) {
				field1294 = true;
				int var164 = field1168.method211();
				class60 var165 = class60.field835[var164];
				while (field1168.field542 < field1235) {
					int var166 = field1168.method209();
					int var167 = field1168.method211();
					int var168 = field1168.method209();
					if (var168 == 255) {
						var168 = field1168.method214();
					}

					if (var166 >= 0 && var166 < var165.field836.length) {
						var165.field836[var166] = var167;
						var165.field837[var166] = var168;
					}
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 100) {
				int var169 = field1168.method211();
				int var170 = field1168.method209();

				if (var169 == 0xFFFF) {
					var169 = -1;
				}

				field1198[var170] = var169;
				field1294 = true;
				field1055 = true;
				field1236 = -1;
				return true;
			}

			if (field1236 == 186) {
				int var171 = field1168.method211();
				class60 var172 = class60.field835[var171];
				for (int var173 = 0; var173 < var172.field836.length; var173++) {
					var172.field836[var173] = -1;
					var172.field836[var173] = 0;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 218) {
				int var174 = field1168.method211();
				boolean var175 = field1168.method209() == 1;
				class60.field835[var174].field855 = var175;
				field1236 = -1;
				return true;
			}

			if (field1236 == 98) {
				field1265 = field1168.method209();
				if (field1310 == field1265) {
					if (field1265 == 3) {
						field1310 = 1;
					} else {
						field1310 = 3;
					}

					field1294 = true;
				}

				field1236 = -1;
				return true;
			}

			if (field1236 == 254) {
				field1187 = false;
				field1141 = true;
				field1082 = "";
				field1173 = true;
				field1236 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1236 + "," + field1235 + " - " + field1098 + "," + field1099);
			method368();
		} catch (IOException var180) {
			method371();
		} catch (Exception var181) {
			String var177 = "T2 - " + field1236 + "," + field1098 + "," + field1099 + " - " + field1235 + "," + (field1030.field317[0] + field1256) + "," + (field1030.field318[0] + field1257) + " - ";
			for (int var178 = 0; var178 < field1235 && var178 < 50; var178++) {
				var177 = var177 + field1168.field541[var178] + ",";
			}

			signlink.reporterror(var177);
			method368();
		}

		return true;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method436() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1227[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1227[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1228[var10] = (field1227[var10 - 1] + field1227[var10 + 1] + field1227[var10 - 128] + field1227[var10 + 128]) / 4;
			}
		}

		field1142 += 128;
		if (field1142 > field1089.length) {
			field1142 -= field1089.length;
			int var11 = (int) (Math.random() * 12.0D);
			method405(field1146[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1228[var14 + 128] - field1089[field1142 + var14 & field1089.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1227[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1332[var16] = field1332[var16 + 1];
		}

		field1332[var1 - 1] = (int) (Math.sin(field1147 / 14.0D) * 16.0D + Math.sin(field1147 / 15.0D) * 14.0D + Math.sin(field1147 / 16.0D) * 12.0D);

		if (field1150 > 0) {
			field1150 -= 4;
		}

		if (field1151 > 0) {
			field1151 -= 4;
		}

		if (field1150 == 0 && field1151 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1150 = 1024;
			}

			if (var17 == 1) {
				field1151 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;B)Z")
	public final boolean method437(class60 arg0) {
		if (arg0.field850 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field850.length; var2++) {
			int var3 = method367(arg0, var2);
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

	@ObfuscatedName("client.a(Lkb;BI)V")
	public final void method438(class37 arg0, int arg1) {
		while (arg0.field543 + 21 < arg1 * 8) {
			int var3 = arg0.method220(13);
			if (var3 == 8191) {
				break;
			}

			if (field1135[var3] == null) {
				field1135[var3] = new class25();
			}

			class25 var4 = field1135[var3];
			field1137[field1136++] = var3;
			var4.field313 = field1147;
			var4.field321 = class54.method281(arg0.method220(11));
			var4.field273 = var4.field321.field746;
			var4.field276 = var4.field321.field750;
			var4.field277 = var4.field321.field751;
			var4.field278 = var4.field321.field752;
			var4.field279 = var4.field321.field753;
			var4.field274 = var4.field321.field749;
			int var5 = arg0.method220(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method220(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method109(field1030.field318[0] + var6, false, field1030.field317[0] + var5);
			int var7 = arg0.method220(1);
			if (var7 == 1) {
				field1046[field1045++] = var3;
			}
		}

		arg0.method221();
	}

	@ObfuscatedName("client.a(BLjava/lang/String;IILjava/lang/String;)Lub;")
	public final class47 method439(String arg0, int arg1, int arg2, String arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg3);
		if (var6 != null) {
			field1134.reset();
			field1134.update(var6);
			int var7 = (int) field1134.getValue();
			if (arg2 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class47(var6);
		}

		while (var6 == null) {
			method13(arg1, "Requesting " + arg0);

			try {
				int var9 = 0;
				DataInputStream var10 = method477(arg3 + arg2);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				class37 var12 = new class37(var11);
				var12.field542 = 3;
				int var13 = var12.method213() + 6;
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
						method13(arg1, "Loading " + arg0 + " - " + var17 + "%");
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					method13(arg1, "Error loading - Will retry in " + var18 + " secs.");

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

		signlink.cachesave(arg3, var6);
		return new class47(var6);
	}

	@ObfuscatedName("client.w(I)V")
	public final void method440() {
		if (field1202 == 0) {
			int var1 = field6 / 2 - 80;
			int var2 = field7 / 2 + 20;
			var2 += 20;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1202 = 3;
				field1303 = 0;
			}

			int var3 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var3 - 75 && field18 <= var3 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1176 = "";
				field1177 = "Enter your username & password.";
				field1202 = 2;
				field1303 = 0;
			}
		} else if (field1202 == 2) {
			int var4 = field7 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1303 = 0;
			}

			var4 += 15;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1303 = 1;
			}

			var4 += 15;
			int var5 = field6 / 2 - 80;
			int var6 = field7 / 2 + 50;
			var6 += 20;
			if (field17 == 1 && field18 >= var5 - 75 && field18 <= var5 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				method456(field1296, field1297, false);
			}

			int var7 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var7 - 75 && field18 <= var7 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				field1202 = 0;
				field1296 = "";
				field1297 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1009.length(); var10++) {
					if (var8 == field1009.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1303 == 0) {
					if (var8 == 8 && field1296.length() > 0) {
						field1296 = field1296.substring(0, field1296.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1303 = 1;
					}

					if (var9) {
						field1296 = field1296 + (char) var8;
					}

					if (field1296.length() > 12) {
						field1296 = field1296.substring(0, 12);
					}
				} else if (field1303 == 1) {
					if (var8 == 8 && field1297.length() > 0) {
						field1297 = field1297.substring(0, field1297.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1303 = 0;
					}

					if (var9) {
						field1297 = field1297 + (char) var8;
					}

					if (field1297.length() > 20) {
						field1297 = field1297.substring(0, 20);
					}
				}
			}
		} else if (field1202 == 3) {
			int var11 = field6 / 2;
			int var12 = field7 / 2 + 50;
			var12 += 20;
			if (field17 == 1 && field18 >= var11 - 75 && field18 <= var11 + 75 && field19 >= var12 - 20 && field19 <= var12 + 20) {
				field1202 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method441(int arg0) {
		int var2 = class64.field928[arg0].field936;
		if (var2 != 0) {
			int var3 = field1152[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class33.method162(0.9D);
				}

				if (var3 == 2) {
					class33.method162(0.8D);
				}

				if (var3 == 3) {
					class33.method162(0.7D);
				}

				if (var3 == 4) {
					class33.method162(0.6D);
				}

				class55.field807.method104();
				field1233 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1054;

				if (var3 == 0) {
					method380(field1054, 0);
					field1054 = true;
				}

				if (var3 == 1) {
					method380(field1054, -400);
					field1054 = true;
				}

				if (var3 == 2) {
					method380(field1054, -800);
					field1054 = true;
				}

				if (var3 == 3) {
					method380(field1054, -1200);
					field1054 = true;
				}

				if (var3 == 4) {
					field1054 = false;
				}

				if (field1054 != var4) {
					if (field1054) {
						method406(field1283, field1106, field1066);
					} else {
						method384();
					}

					field1126 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1140 = true;
					method470(0);
				}

				if (var3 == 1) {
					field1140 = true;
					method470(-400);
				}

				if (var3 == 2) {
					field1140 = true;
					method470(-800);
				}

				if (var3 == 3) {
					field1140 = true;
					method470(-1200);
				}

				if (var3 == 4) {
					field1140 = false;
				}
			}

			if (var2 == 5) {
				field1267 = var3;
			}

			if (var2 == 6) {
				field1033 = var3;
			}

			if (var2 == 8) {
				field948 = var3;
				field1173 = true;
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method442() {
		field1180 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1092) {
				method436();
				method436();
				method387();
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

		field1180 = false;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method443() {
		if (field1115 == 0) {
			field1053[0] = "Cancel";
			field1063[0] = 1333;
			field1174 = 1;
			method430(field16, field15);
			field1280 = 0;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field1240 == -1) {
					method418();
				} else {
					method364(field15, 8, 0, field16, 11, class60.field835[field1240]);
				}
			}

			if (field1280 != field1183) {
				field1183 = field1280;
			}

			field1280 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field1243 != -1) {
					method364(field15, 562, 0, field16, 231, class60.field835[field1243]);
				} else if (field1198[field1310] != -1) {
					method364(field15, 562, 0, field16, 231, class60.field835[field1198[field1310]]);
				}
			}

			if (field1280 != field1109) {
				field1294 = true;
				field1109 = field1280;
			}

			field1280 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 431 && field16 < 471) {
				if (field1242 == -1) {
					method385(field15 - 22, field16 - 375);
				} else {
					method364(field15, 22, 0, field16, 375, class60.field835[field1242]);
				}
			}

			if (field1242 != -1 && field1280 != field1122) {
				field1173 = true;
				field1122 = field1280;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1174 - 1; var2++) {
					if (field1063[var2] < 1000 && field1063[var2 + 1] > 1000) {
						String var3 = field1053[var2];
						field1053[var2] = field1053[var2 + 1];
						field1053[var2 + 1] = var3;
						int var4 = field1063[var2];
						field1063[var2] = field1063[var2 + 1];
						field1063[var2 + 1] = var4;
						int var5 = field1061[var2];
						field1061[var2] = field1061[var2 + 1];
						field1061[var2 + 1] = var5;
						int var6 = field1062[var2];
						field1062[var2] = field1062[var2 + 1];
						field1062[var2 + 1] = var6;
						int var7 = field1064[var2];
						field1064[var2] = field1064[var2 + 1];
						field1064[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field11 != null) {
			return field11;
		}

		return this;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method444() {
		int var1 = field960;
		int var2 = field961;
		int var3 = field962;
		int var4 = field963;
		int var5 = 0x5D5447;
		class32.method149(var5, var1, var2, var3, var4);
		class32.method149(0, var1 + 1, var2 + 1, var3 - 2, 16);
		class32.method150(0, var1 + 1, var2 + 18, var4 - 19, var3 - 2);
		field1276.method191(var1 + 3, var5, "Choose Option", var2 + 14);
		int var6 = field15;
		int var7 = field16;
		if (field959 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field959 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field959 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field1174; var8++) {
			int var9 = (field1174 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1276.method193(var1 + 3, var10, var9, field1053[var8], true);
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
			if (field974 && field1017 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field1323.method77(arg5, arg4, arg3);
			}

			if (arg0 == 1) {
				var8 = field1323.method78(arg5, arg3, arg4);
			}

			if (arg0 == 2) {
				var8 = field1323.method79(arg5, arg4, arg3);
			}

			if (arg0 == 3) {
				var8 = field1323.method80(arg5, arg4, arg3);
			}

			if (var8 != 0) {
				int var12 = field1323.method81(arg5, arg4, arg3, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field1323.method72(arg5, arg3, arg4);
					class53 var16 = class53.method275(var13);
					if (var16.field712) {
						field1314[arg5].method300(var15, arg3, var14, arg4, var16.field713);
					}
				}

				if (arg0 == 1) {
					field1323.method73(arg3, arg5, arg4);
				}

				if (arg0 == 2) {
					field1323.method74(arg5, arg4, arg3);
					class53 var17 = class53.method275(var13);
					if (var17.field710 + arg4 > 103 || var17.field710 + arg3 > 103 || var17.field711 + arg4 > 103 || var17.field711 + arg3 > 103) {
						return;
					}

					if (var17.field712) {
						field1314[arg5].method301(arg3, var17.field710, var17.field711, var17.field713, var15, arg4);
					}
				}

				if (arg0 == 3) {
					field1323.method75(arg5, arg4, arg3);
					class53 var18 = class53.method275(var13);
					if (var18.field712 && var18.field714) {
						field1314[arg5].method303(arg3, arg4);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field1088[1][arg4][arg3] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				class3.method28(field1314[arg5], arg5, arg3, field1145, arg6, field1039, arg4, arg2, field1323, var19, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1205 != null) {
				field1205.method29();
			}
		} catch (Exception var1) {
		}

		field1205 = null;
		method384();
		field1153 = false;
		field1186 = null;
		field1010 = null;
		field1168 = null;
		field1221 = null;
		field1321 = null;
		field1282 = null;
		field1145 = null;
		field1088 = null;
		field1323 = null;
		field1314 = null;
		field1078 = null;
		field1076 = null;
		field1124 = null;
		field1125 = null;
		field1005 = null;
		field1018 = null;
		field1019 = null;
		field1020 = null;
		field1021 = null;
		field1103 = null;
		field1104 = null;
		field1105 = null;
		field1188 = null;
		field1189 = null;
		field1190 = null;
		field1191 = null;
		field1192 = null;
		field1193 = null;
		field1194 = null;
		field1195 = null;
		field1196 = null;
		field1197 = null;
		field1318 = null;
		field1319 = null;
		field1320 = null;
		field1285 = null;
		field1286 = null;
		field1287 = null;
		field1013 = null;
		field1244 = null;
		field1245 = null;
		field1246 = null;
		field1247 = null;
		field1248 = null;
		field977 = null;
		field978 = null;
		field979 = null;
		field980 = null;
		field981 = null;
		field992 = null;
		field1281 = null;
		field1208 = null;
		field1333 = null;
		field1035 = null;
		field1036 = null;
		field1037 = null;
		field1038 = null;
		field968 = null;
		field1094 = null;
		field1143 = null;
		field1042 = null;
		field1044 = null;
		field1046 = null;
		field1047 = null;
		field1172 = null;
		field1135 = null;
		field1137 = null;
		field1118 = null;
		field947 = null;
		field1184 = null;
		field1169 = null;
		field966 = null;
		field1039 = null;
		field1061 = null;
		field1062 = null;
		field1063 = null;
		field1064 = null;
		field1053 = null;
		field1152 = null;
		field1120 = null;
		field1121 = null;
		field1315 = null;
		field1008 = null;
		field1138 = null;
		field1270 = null;
		field1165 = null;
		field1157 = null;
		field1158 = null;
		field1154 = null;
		field1155 = null;
		field1156 = null;
		field1159 = null;
		field1160 = null;
		field1161 = null;
		field1162 = null;
		method472();
		class53.method274();
		class54.method280();
		class55.method286();
		class58.field816 = null;
		class59.field828 = null;
		class60.field835 = null;
		class61.field894 = null;
		class62.field901 = null;
		class63.field914 = null;
		class63.field926 = null;
		class64.field928 = null;
		field9 = null;
		class26.field342 = null;
		class33.method153();
		class18.method49();
		class31.method120();
		class6.field67 = null;
		class7.field71 = null;
		System.gc();
	}

	@ObfuscatedName("client.z(I)V")
	public final void method446() {
		for (class28 var1 = (class28) field966.method228(); var1 != null; var1 = (class28) field966.method230()) {
			if (field1017 != var1.field369 || var1.field375) {
				var1.method107();
			} else if (field1147 >= var1.field368) {
				var1.method118(field989);

				if (var1.field375) {
					var1.method107();
				} else {
					field1323.method61(60, 0, var1.field370, var1.field372, -1, var1.field369, var1, null, var1.field371, false);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int method447(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		int var6 = arg2;
		if (arg2 < 3 && (field1088[1][var4][var5] & 0x2) == 2) {
			var6 = arg2 + 1;
		}

		int var7 = arg1 & 0x7F;
		int var8 = arg0 & 0x7F;
		int var9 = (128 - var7) * field1145[var6][var4][var5] + field1145[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field1145[var6][var4][var5 + 1] + field1145[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method448(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	public final void init() {
		field971 = Integer.parseInt(getParameter("nodeid"));
		field972 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method474();
		} else {
			method401();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field973 = false;
		} else {
			field973 = true;
		}

		method2(789, 532);
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method449() {
		class53.field736.method104();
		class53.field737.method104();
		class54.field765.method104();
		class55.field806.method104();
		class55.field807.method104();
		class26.field342.method104();
		class63.field926.method104();
	}

	@ObfuscatedName("client.i(B)V")
	public final void method450() {
		for (class40 var1 = (class40) field1039.method228(); var1 != null; var1 = (class40) field1039.method230()) {
			boolean var2 = false;
			var1.field579 += field989;

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

			var1.method107();
			var2 = false;
			if (var2) {
				int var3 = var1.field572;
				int var4 = var1.field574;
				int var5 = var1.field575;
				int var6 = 0;
				if (var1.field573 == 0) {
					var6 = field1323.method77(var3, var4, var5);
				}

				if (var1.field573 == 1) {
					var6 = field1323.method78(var3, var5, var4);
				}

				if (var1.field573 == 2) {
					var6 = field1323.method79(var3, var4, var5);
				}

				if (var1.field573 == 3) {
					var6 = field1323.method80(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field576) {
					int var7 = field1145[var3][var4][var5];
					int var8 = field1145[var3][var4 + 1][var5];
					int var9 = field1145[var3][var4 + 1][var5 + 1];
					int var10 = field1145[var3][var4][var5 + 1];
					class53 var11 = class53.method275(var1.field576);
					int var12 = -1;
					if (var1.field578 != -1) {
						var12 = var1.field577.field903[var1.field578];
					}

					if (var1.field573 == 2) {
						int var13 = field1323.method81(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						class31 var16 = var11.method278(var14, var15, var7, var8, var9, var10, var12);
						field1323.method66(var3, var16, var4, var5);
					} else if (var1.field573 == 1) {
						class31 var17 = var11.method278(4, 0, var7, var8, var9, var10, var12);
						field1323.method68(var4, var17, var5, var3);
					} else if (var1.field573 == 0) {
						int var18 = field1323.method81(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							class31 var22 = var11.method278(2, var20 + 4, var7, var8, var9, var10, var12);
							class31 var23 = var11.method278(2, var21, var7, var8, var9, var10, var12);
							field1323.method71(var4, var5, var22, var3, var23);
						} else {
							class31 var24 = var11.method278(var19, var20, var7, var8, var9, var10, var12);
							field1323.method70(var5, var4, var24, var3);
						}
					} else if (var1.field573 == 3) {
						int var25 = field1323.method81(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						class31 var27 = var11.method278(22, var26, var7, var8, var9, var10, var12);
						field1323.method69(var5, var4, var3, var27);
					}
				} else {
					var1.method107();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBII)V")
	public final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = class31.field480[var7];
			int var13 = class31.field481[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field480[var8];
			int var16 = class31.field481[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1211 = arg1 - var9;
		field1212 = arg5 - var10;
		field1213 = arg0 - var11;
		field1214 = arg3;
		field1215 = arg4;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method452() {
		for (int var1 = -1; var1 < field1043; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1041;
			} else {
				var2 = field1044[var1];
			}

			class26 var3 = field1042[var2];
			if (var3 != null && var3.field282 > 0) {
				var3.field282--;
				if (var3.field282 == 0) {
					var3.field281 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1136; var4++) {
			int var5 = field1137[var4];
			class25 var6 = field1135[var5];
			if (var6 != null && var6.field282 > 0) {
				var6.field282--;
				if (var6.field282 == 0) {
					var6.field281 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method12(Runnable arg0, int arg1) {
		if (signlink.mainapp == null) {
			super.method12(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(Lkb;IZ)V")
	public final void method453(class37 arg0, int arg1) {
		while (arg0.field543 + 10 < arg1 * 8) {
			int var3 = arg0.method220(11);
			if (var3 == 2047) {
				break;
			}

			if (field1042[var3] == null) {
				field1042[var3] = new class26();
				if (field1047[var3] != null) {
					field1042[var3].method113(field1047[var3]);
				}
			}

			field1044[field1043++] = var3;
			class26 var4 = field1042[var3];
			var4.field313 = field1147;
			int var5 = arg0.method220(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method220(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method220(1);
			var4.method109(field1030.field318[0] + var6, var7 == 1, field1030.field317[0] + var5);
			int var8 = arg0.method220(1);
			if (var8 == 1) {
				field1046[field1045++] = var3;
			}
		}

		arg0.method221();
	}

	@ObfuscatedName("client.a(IIIIIIZIIIII)Z")
	public final boolean method454(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1078[var14][var15] = 0;
				field1076[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg0;
		field1078[arg7][arg0] = 99;
		field1076[arg7][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1124[var18] = arg7;
		int var35 = var18 + 1;
		field1125[var18] = arg0;
		boolean var20 = false;
		int var21 = field1124.length;
		int[][] var22 = field1314[field1017].field814;
		while (var35 != var19) {
			var16 = field1124[var19];
			var17 = field1125[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg4 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field1314[field1017].method304(arg4, var16, arg3, arg6, arg2 - 1, var17)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field1314[field1017].method305(arg3, var16, arg6, arg4, var17, arg2 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg8 != 0 && arg10 != 0 && field1314[field1017].method306(arg8, arg3, arg10, arg4, var17, var16, arg1)) {
				var20 = true;
				break;
			}

			int var23 = field1076[var16][var17] + 1;
			if (var16 > 0 && field1078[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1124[var35] = var16 - 1;
				field1125[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1078[var16 - 1][var17] = 2;
				field1076[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1078[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1124[var35] = var16 + 1;
				field1125[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1078[var16 + 1][var17] = 8;
				field1076[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1078[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1124[var35] = var16;
				field1125[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1078[var16][var17 - 1] = 1;
				field1076[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1078[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1124[var35] = var16;
				field1125[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1078[var16][var17 + 1] = 4;
				field1076[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1078[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1124[var35] = var16 - 1;
				field1125[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1078[var16 - 1][var17 - 1] = 3;
				field1076[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1078[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1124[var35] = var16 + 1;
				field1125[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1078[var16 + 1][var17 - 1] = 9;
				field1076[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1078[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1124[var35] = var16 - 1;
				field1125[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1078[var16 - 1][var17 + 1] = 6;
				field1076[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1078[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1124[var35] = var16 + 1;
				field1125[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1078[var16 + 1][var17 + 1] = 12;
				field1076[var16 + 1][var17 + 1] = var23;
			}
		}

		field1206 = 0;
		if (!var20) {
			if (arg5) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg4 - var25; var27 <= arg4 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1076[var26][var27] < var24) {
								var24 = field1076[var26][var27];
								var16 = var26;
								var17 = var27;
								field1206 = 1;
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
		field1124[var28] = var16;
		int var36 = var28 + 1;
		field1125[var28] = var17;
		int var29;
		int var30 = var29 = field1078[var16][var17];
		while (arg7 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1124[var36] = var16;
				field1125[var36++] = var17;
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

			var30 = field1078[var16][var17];
		}

		if (var36 <= 0) {
			if (arg9 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1124[var36];
		int var33 = field1125[var36];
		field964 += var31;
		if (field964 >= 121) {
			field1186.method198(215);
			field1186.method200(19217);
		}

		if (arg9 == 0) {
			field1186.method198(74);
			field1186.method199(var31 + var31 + 3);
		}

		if (arg9 == 1) {
			field1186.method198(37);
			field1186.method199(var31 + var31 + 3 + 14);
		}

		if (arg9 == 2) {
			field1186.method198(73);
			field1186.method199(var31 + var31 + 3);
		}

		if (field20[5] == 1) {
			field1186.method199(1);
		} else {
			field1186.method199(0);
		}

		field1186.method200(field1256 + var32);
		field1186.method200(field1257 + var33);
		field1006 = field1124[0];
		field1007 = field1125[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1186.method199(field1124[var36] - var32);
			field1186.method199(field1125[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method455() {
		if (field1021 == null) {
			method472();
			field9 = null;
			field1154 = null;
			field1155 = null;
			field1156 = null;
			field1157 = null;
			field1158 = null;
			field1159 = null;
			field1160 = null;
			field1161 = null;
			field1162 = null;
			field1021 = new class43(96, method11(), 479);
			field1019 = new class43(160, method11(), 168);
			class32.method148();
			field1319.method186(0, 0);
			field1018 = new class43(261, method11(), 190);
			field1020 = new class43(334, method11(), 512);
			class32.method148();
			field1103 = new class43(61, method11(), 501);
			field1104 = new class43(40, method11(), 288);
			field1105 = new class43(66, method11(), 269);
			field1233 = true;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method456(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1176 = "";
				field1177 = "Connecting to server...";
				method392();
			}

			field1205 = new class4(this, method370(field972 + 43594));
			field1205.method32(field1168.field541, 0, 8);
			field1168.field542 = 0;
			field1032 = field1168.method215();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1032 >> 32), (int) field1032 };
			field1186.field542 = 0;
			field1186.method199(10);
			field1186.method203(var4[0]);
			field1186.method203(var4[1]);
			field1186.method203(var4[2]);
			field1186.method203(var4[3]);
			field1186.method203(signlink.uid);
			field1186.method206(arg0);
			field1186.method206(arg1);
			field1186.method224(field1203, field1164);
			field1010.field542 = 0;

			if (arg2) {
				field1010.method199(18);
			} else {
				field1010.method199(16);
			}

			field1010.method199(field1186.field542 + 36 + 1 + 1);
			field1010.method199(219);
			field1010.method199(field974 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1010.method203(field1309[var5]);
			}

			field1010.method207(field1186.field542, field1186.field541, 0);
			field1186.field546 = new class46(var4, 0);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1300 = new class46(var4, 0);
			field1205.method33(0, field1010.field541, field1010.field542);
			int var7 = field1205.method30();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method456(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field1148 = true;
				} else {
					field1148 = false;
				}

				class5.method35(false);
				field965 = true;
				field1186.field542 = 0;
				field1168.field542 = 0;
				field1236 = -1;
				field1097 = -1;
				field1098 = -1;
				field1099 = -1;
				field1235 = 0;
				field1237 = 0;
				field1330 = 0;
				field1239 = 0;
				field1210 = 0;
				field1174 = 0;
				field1087 = false;
				field13 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field1024[var8] = null;
				}

				field1129 = 0;
				field1290 = 0;
				field1308 = 0;
				field1336 = 0;
				field1080 = (int) (Math.random() * 100.0D) - 50;
				field1073 = (int) (Math.random() * 110.0D) - 55;
				field1084 = (int) (Math.random() * 80.0D) - 40;
				field969 = (int) (Math.random() * 120.0D) - 60;
				field1178 = (int) (Math.random() * 30.0D) - 20;
				field1027 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1139 = -1;
				field1006 = 0;
				field1007 = 0;
				field1043 = 0;
				field1136 = 0;

				for (int var9 = 0; var9 < field1040; var9++) {
					field1042[var9] = null;
					field1047[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1135[var10] = null;
				}

				field1030 = field1042[field1041] = new class26();
				field1169.method232();
				field966.method232();
				field1184.method232();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1118[var11][var12][var13] = null;
						}
					}
				}

				field947 = new class41();
				field956 = 0;
				field1075 = -1;
				field1242 = -1;
				field1240 = -1;
				field1243 = -1;
				field1204 = false;
				field1310 = 3;
				field1141 = false;
				field1087 = false;
				field1187 = false;
				field1144 = null;
				field1031 = 0;
				field1265 = -1;
				field1072 = true;
				method432();

				for (int var14 = 0; var14 < 5; var14++) {
					field990[var14] = 0;
				}

				field955 = 0;
				field1149 = 0;
				field1200 = 0;
				field964 = 0;
				field1313 = 0;
				field1065 = 0;
				field1166 = 0;
				field1311 = 0;
				field1170 = 0;
				method455();
				return;
			}

			if (var7 == 3) {
				field1176 = "";
				field1177 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field1176 = "Your account has been disabled.";
				field1177 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field1176 = "Your account is already logged in.";
				field1177 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field1176 = "RuneScape has been updated!";
				field1177 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field1176 = "This world is full.";
				field1177 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field1176 = "Unable to connect.";
				field1177 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field1176 = "Login limit exceeded.";
				field1177 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field1176 = "Unable to connect.";
				field1177 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field1177 = "Login server rejected session.";
				field1177 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field1176 = "You need a members account to login to this world.";
				field1177 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field1176 = "Could not complete login.";
				field1177 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field1176 = "The server is being updated.";
				field1177 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field965 = true;
				field1186.field542 = 0;
				field1168.field542 = 0;
				field1236 = -1;
				field1097 = -1;
				field1098 = -1;
				field1099 = -1;
				field1235 = 0;
				field1237 = 0;
				field1330 = 0;
				field1174 = 0;
				field1087 = false;
				return;
			}

			if (var7 == 16) {
				field1176 = "Login attempts exceeded.";
				field1177 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field1176 = "You are standing in a members-only area.";
				field1177 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field1176 = "";
			field1177 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method457() {
		field1019.method235();
		int var1 = field969 + field1027 & 0x7FF;
		int var2 = field1030.field269 / 32 + 48;
		int var3 = 464 - field1030.field270 / 32;
		field1008.method179(var2, 146, 21, var3, var1, field1178 + 256, 9, field1108, field1322, 151);
		field992.method179(25, 33, 0, 25, field1027, 256, 0, field1341, field1182, 33);

		for (int var4 = 0; var4 < field1119; var4++) {
			int var5 = field1120[var4] * 4 + 2 - field1030.field269 / 32;
			int var6 = field1121[var4] * 4 + 2 - field1030.field270 / 32;
			method379(var5, field1315[var4], var6);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class41 var9 = field1118[field1017][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1030.field269 / 32;
					int var11 = var8 * 4 + 2 - field1030.field270 / 32;
					method379(var10, field1035, var11);
				}
			}
		}

		for (int var12 = 0; var12 < field1136; var12++) {
			class25 var13 = field1135[field1137[var12]];
			if (var13 != null && var13.method111() && var13.field321.field761) {
				int var14 = var13.field269 / 32 - field1030.field269 / 32;
				int var15 = var13.field270 / 32 - field1030.field270 / 32;
				method379(var14, field1036, var15);
			}
		}

		for (int var16 = 0; var16 < field1043; var16++) {
			class26 var17 = field1042[field1044[var16]];
			if (var17 != null && var17.method111()) {
				int var18 = var17.field269 / 32 - field1030.field269 / 32;
				int var19 = var17.field270 / 32 - field1030.field270 / 32;
				boolean var20 = false;
				long var21 = class48.method251(var17.field322);
				for (int var23 = 0; var23 < field956; var23++) {
					if (field1270[var23] == var21 && field1165[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method379(var18, field1038, var19);
				} else {
					method379(var18, field1037, var19);
				}
			}
		}

		if (field1006 != 0) {
			int var24 = field1006 * 4 + 2 - field1030.field269 / 32;
			int var25 = field1007 * 4 + 2 - field1030.field270 / 32;
			method379(var24, field1249, var25);
		}

		class32.method149(0xFFFFFF, 93, 82, 3, 3);
		field1020.method235();
	}

	@ObfuscatedName("client.a(IZI[B)V")
	public final void method458(int arg0, boolean arg1, byte[] arg2) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg2, arg0);
	}

	@ObfuscatedName("client.d(II)V")
	public final void method459(int arg0, int arg1) {
		class41 var3 = field1118[field1017][arg0][arg1];
		if (var3 == null) {
			field1323.method76(field1017, arg0, arg1);
		} else {
			int var4 = -99999999;
			class22 var5 = null;
			for (class22 var6 = (class22) var3.method228(); var6 != null; var6 = (class22) var3.method230()) {
				class55 var7 = class55.method287(var6.field267);
				int var8 = var7.field786;
				if (var7.field785) {
					var8 = (var6.field268 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method226(var5);
			int var9 = -1;
			int var10 = -1;
			int var11 = 0;
			int var12 = 0;
			for (class22 var13 = (class22) var3.method228(); var13 != null; var13 = (class22) var3.method230()) {
				if (var5.field267 != var13.field267 && var9 == -1) {
					var9 = var13.field267;
					var11 = var13.field268;
				}

				if (var5.field267 != var13.field267 && var13.field267 != var9 && var10 == -1) {
					var10 = var13.field267;
					var12 = var13.field268;
				}
			}

			class31 var14 = null;
			if (var9 != -1) {
				var14 = class55.method287(var9).method291(var11);
			}

			class31 var15 = null;
			if (var10 != -1) {
				var15 = class55.method287(var10).method291(var12);
			}

			int var16 = (arg1 << 7) + arg0 + 0x60000000;
			class55 var17 = class55.method287(var5.field267);
			field1323.method57(var16, arg0, var15, var14, var17.method291(var5.field268), field1017, arg1, method447(arg1 * 128 + 64, arg0 * 128 + 64, field1017));
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.k(Z)I")
	public final int method460() {
		int var1 = 3;
		if (field1214 < 310) {
			int var2 = field1211 >> 7;
			int var3 = field1213 >> 7;
			int var4 = field1030.field269 >> 7;
			int var5 = field1030.field270 >> 7;

			if ((field1088[field1017][var2][var3] & 0x4) != 0) {
				var1 = field1017;
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

					if ((field1088[field1017][var2][var3] & 0x4) != 0) {
						var1 = field1017;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1088[field1017][var2][var3] & 0x4) != 0) {
							var1 = field1017;
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

					if ((field1088[field1017][var2][var3] & 0x4) != 0) {
						var1 = field1017;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1088[field1017][var2][var3] & 0x4) != 0) {
							var1 = field1017;
						}
					}
				}
			}
		}

		if ((field1088[field1017][field1030.field269 >> 7][field1030.field270 >> 7] & 0x4) != 0) {
			var1 = field1017;
		}

		return var1;
	}

	@ObfuscatedName("client.l(Z)I")
	public final int method461() {
		int var1 = method447(field1213, field1211, field1017);
		if (var1 - field1212 < 800 && (field1088[field1017][field1211 >> 7][field1213 >> 7] & 0x4) != 0) {
			return field1017;
		}

		return 3;
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method462(long arg0) {
		if (arg0 != 0L) {
			if (field1331 >= 100) {
				method391("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field1331; var4++) {
					if (field954[var4] == arg0) {
						method391(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field956; var5++) {
					if (field1270[var5] == arg0) {
						method391("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field954[field1331++] = arg0;
				field1294 = true;
				field1186.method198(175);
				field1186.method205(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(Lkb;II)V")
	public final void method463(class37 arg0, int arg1) {
		field1171 = 0;
		field1045 = 0;
		method407(arg1, arg0);
		method438(arg0, arg1);
		method473(arg1, arg0);

		for (int var3 = 0; var3 < field1171; var3++) {
			int var4 = field1172[var3];
			if (field1147 != field1135[var4].field313) {
				field1135[var4].field321 = null;
				field1135[var4] = null;
			}
		}

		if (arg0.field542 != arg1) {
			signlink.reporterror(field1296 + " size mismatch in getnpcpos - pos:" + arg0.field542 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1136; var5++) {
			if (field1135[field1137[var5]] == null) {
				signlink.reporterror(field1296 + " null entry in npc list - pos:" + var5 + " size:" + field1136);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method464(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field956; var2++) {
			if (arg0.equalsIgnoreCase(field1138[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1030.field322)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method465() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1240 != -1 && field1273 == field1240) {
				if (var1 == 8 && field1127.length() > 0) {
					field1127 = field1127.substring(0, field1127.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1127.length() < 12) {
					field1127 = field1127 + (char) var1;
				}
			} else if (field1187) {
				if (var1 >= 32 && var1 <= 122 && field1201.length() < 80) {
					field1201 = field1201 + (char) var1;
					field1173 = true;
				}

				if (var1 == 8 && field1201.length() > 0) {
					field1201 = field1201.substring(0, field1201.length() - 1);
					field1173 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1187 = false;
					field1173 = true;

					if (field1095 == 1) {
						long var2 = class48.method251(field1201);
						method373(var2);
					}

					if (field1095 == 2 && field956 > 0) {
						long var4 = class48.method251(field1201);
						method400(var4);
					}

					if (field1095 == 3 && field1201.length() > 0) {
						field1186.method198(6);
						field1186.method199(0);
						int var6 = field1186.field542;
						field1186.method205(field1058);
						class49.method259(field1201, field1186);
						field1186.method208(field1186.field542 - var6);
						field1201 = class48.method256(field1201);
						field1201 = class65.method335(field1201);
						method391(field1201, 6, class48.method255(class48.method252(field1058)));

						if (field1123 == 2) {
							field1123 = 1;
							field1079 = true;
							field1186.method198(197);
							field1186.method199(field1328);
							field1186.method199(field1123);
							field1186.method199(field1083);
						}
					}

					if (field1095 == 4 && field1331 < 100) {
						long var7 = class48.method251(field1201);
						method462(var7);
					}

					if (field1095 == 5 && field1331 > 0) {
						long var9 = class48.method251(field1201);
						method372(var9);
					}
				}
			} else if (field1141) {
				if (var1 >= 48 && var1 <= 57 && field1082.length() < 10) {
					field1082 = field1082 + (char) var1;
					field1173 = true;
				}

				if (var1 == 8 && field1082.length() > 0) {
					field1082 = field1082.substring(0, field1082.length() - 1);
					field1173 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1082.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1082);
						} catch (Exception var15) {
						}

						field1186.method198(147);
						field1186.method203(var11);
					}

					field1141 = false;
					field1173 = true;
				}
			} else if (field1242 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1284.length() < 80) {
					field1284 = field1284 + (char) var1;
					field1173 = true;
				}

				if (var1 == 8 && field1284.length() > 0) {
					field1284 = field1284.substring(0, field1284.length() - 1);
					field1173 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1284.length() > 0) {
					if (field1284.equals("::clientdrop") && (field11 != null || method410().indexOf("192.168.1.") != -1)) {
						method371();
					} else if (field1284.startsWith("::")) {
						field1186.method198(251);
						field1186.method199(field1284.length() - 1);
						field1186.method206(field1284.substring(2));
					} else {
						byte var12 = 0;
						if (field1284.startsWith("yellow:")) {
							var12 = 0;
							field1284 = field1284.substring(7);
						}

						if (field1284.startsWith("red:")) {
							var12 = 1;
							field1284 = field1284.substring(4);
						}

						if (field1284.startsWith("green:")) {
							var12 = 2;
							field1284 = field1284.substring(6);
						}

						if (field1284.startsWith("cyan:")) {
							var12 = 3;
							field1284 = field1284.substring(5);
						}

						if (field1284.startsWith("purple:")) {
							var12 = 4;
							field1284 = field1284.substring(7);
						}

						if (field1284.startsWith("white:")) {
							var12 = 5;
							field1284 = field1284.substring(6);
						}

						if (field1284.startsWith("flash1:")) {
							var12 = 6;
							field1284 = field1284.substring(7);
						}

						if (field1284.startsWith("flash2:")) {
							var12 = 7;
							field1284 = field1284.substring(7);
						}

						if (field1284.startsWith("flash3:")) {
							var12 = 8;
							field1284 = field1284.substring(7);
						}

						if (field1284.startsWith("glow1:")) {
							var12 = 9;
							field1284 = field1284.substring(6);
						}

						if (field1284.startsWith("glow2:")) {
							var12 = 10;
							field1284 = field1284.substring(6);
						}

						if (field1284.startsWith("glow3:")) {
							var12 = 11;
							field1284 = field1284.substring(6);
						}

						byte var13 = 0;
						if (field1284.startsWith("wave:")) {
							var13 = 1;
							field1284 = field1284.substring(5);
						}

						if (field1284.startsWith("scroll:")) {
							var13 = 2;
							field1284 = field1284.substring(7);
						}

						field1186.method198(42);
						field1186.method199(0);
						int var14 = field1186.field542;
						field1186.method199(var12);
						field1186.method199(var13);
						class49.method259(field1284, field1186);
						field1186.method208(field1186.field542 - var14);
						field1284 = class48.method256(field1284);
						field1284 = class65.method335(field1284);
						field1030.field281 = field1284;
						field1030.field283 = var12;
						field1030.field284 = var13;
						field1030.field282 = 150;
						method391(field1030.field281, 2, field1030.field322);

						if (field1328 == 2) {
							field1328 = 3;
							field1079 = true;
							field1186.method198(197);
							field1186.method199(field1328);
							field1186.method199(field1123);
							field1186.method199(field1083);
						}
					}

					field1284 = "";
					field1173 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method466() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231 && field1198[0] != -1) {
				field1294 = true;
				field1310 = 0;
				field1055 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231 && field1198[1] != -1) {
				field1294 = true;
				field1310 = 1;
				field1055 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231 && field1198[2] != -1) {
				field1294 = true;
				field1310 = 2;
				field1055 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229 && field1198[3] != -1) {
				field1294 = true;
				field1310 = 3;
				field1055 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231 && field1198[4] != -1) {
				field1294 = true;
				field1310 = 4;
				field1055 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231 && field1198[5] != -1) {
				field1294 = true;
				field1310 = 5;
				field1055 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231 && field1198[6] != -1) {
				field1294 = true;
				field1310 = 6;
				field1055 = true;
			}

			if (field18 >= 550 && field18 <= 584 && field19 >= 492 && field19 < 528 && field1198[7] != -1) {
				field1294 = true;
				field1310 = 7;
				field1055 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529 && field1198[8] != -1) {
				field1294 = true;
				field1310 = 8;
				field1055 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529 && field1198[9] != -1) {
				field1294 = true;
				field1310 = 9;
				field1055 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528 && field1198[10] != -1) {
				field1294 = true;
				field1310 = 10;
				field1055 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529 && field1198[11] != -1) {
				field1294 = true;
				field1310 = 11;
				field1055 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529 && field1198[12] != -1) {
				field1294 = true;
				field1310 = 12;
				field1055 = true;
			}

			if (field18 >= 734 && field18 <= 768 && field19 >= 492 && field19 < 528 && field1198[13] != -1) {
				field1294 = true;
				field1310 = 13;
				field1055 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method467() {
		if (field1210 == 2) {
			method428((field1261 - field1257 << 7) + field1264, (field1260 - field1256 << 7) + field1263, field1262 * 2);

			if (field1069 > -1 && field1147 % 20 < 10) {
				field1208[2].method173(field1069 - 12, field1070 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method468(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.n(Z)Z")
	public final boolean method469() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.e(II)V")
	public final void method470(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method471() {
		try {
			field1139 = -1;
			field1184.method232();
			field1039.method232();
			field966.method232();
			field1169.method232();
			class33.method156();
			method449();
			field1323.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1314[var1].method295();
			}

			System.gc();
			class3 var2 = new class3(104, field1145, 104, field1088);
			byte[] var3 = new byte[100000];
			int var4 = field1321.length;
			class3.field26 = class18.field195;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1221[var5] >> 8;
				int var7 = field1221[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field26 = false;
				}
			}

			if (class3.field26) {
				field1323.method51(field1017);
			} else {
				field1323.method51(0);
			}

			field1186.method198(126);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1221[var8] >> 8) * 64 - field1256;
				int var10 = (field1221[var8] & 0xFF) * 64 - field1257;
				byte[] var11 = field1321[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method214();
					class44.method238(var3, var12, var11, var11.length - 4, 4);
					var2.method15(var3, (field1068 - 6) * 8, var9, (field1067 - 6) * 8, var10);
				} else if (field1068 < 800) {
					var2.method14(var10, var9, 64, 64);
				}
			}

			field1186.method198(126);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field1282[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method214();
					class44.method238(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1221[var13] >> 8) * 64 - field1256;
					int var17 = (field1221[var13] & 0xFF) * 64 - field1257;
					var2.method16(var16, var3, field1039, field1314, var17, field1323);
				}
			}

			field1186.method198(126);
			var2.method18(field1323, field1314);
			field1020.method235();
			field1186.method198(126);

			for (class40 var18 = (class40) field1039.method228(); var18 != null; var18 = (class40) field1039.method230()) {
				if ((field1088[1][var18.field574][var18.field575] & 0x2) == 2) {
					var18.field572--;
					if (var18.field572 < 0) {
						var18.method107();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method459(var19, var20);
				}
			}

			for (class38 var21 = (class38) field947.method228(); var21 != null; var21 = (class38) field947.method230()) {
				method445(var21.field554, var21.field558, var21.field559, var21.field556, var21.field555, var21.field553, var21.field557);
			}
		} catch (Exception var23) {
		}

		class53.field736.method104();
		System.gc();
		class33.method157(20);
	}

	@ObfuscatedName("client.l(B)V")
	public final void method472() {
		field1092 = false;
		while (field1180) {
			field1092 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1101 = null;
		field1102 = null;
		field1146 = null;
		field1304 = null;
		field1305 = null;
		field1306 = null;
		field1307 = null;
		field1089 = null;
		field1090 = null;
		field1227 = null;
		field1228 = null;
		field957 = null;
		field958 = null;
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (!field974) {
			field949 = true;
			field1153 = true;
			method12(this, 2);
			method406(40000, 12345678, "scape_main");
		}

		if (field1086) {
			field1295 = true;
		} else {
			field1086 = true;
			boolean var1 = false;
			String var2 = method410();
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
					field1309[8] = 0;
					while (field1309[8] == 0) {
						method13(10, "Connecting to fileserver");

						try {
							DataInputStream var4 = method477("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[36]);
							var4.readFully(var5.field541, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								field1309[var6] = var5.method214();
							}

							var4.close();
						} catch (IOException var54) {
							for (int var7 = var3; var7 > 0; var7--) {
								method13(10, "Error loading - Will retry in " + var7 + " secs.");

								try {
									Thread.sleep(1000L);
								} catch (Exception var49) {
								}
							}

							var3 *= 2;
							if (var3 > 60) {
								var3 = 60;
							}
						}
					}

					field1266 = method439("title screen", 10, field1309[1], "title");
					field1274 = new class36("p11", field1266);
					field1275 = new class36("p12", field1266);
					field1276 = new class36("b12", field1266);
					field1277 = new class36("q8", field1266);
					method366();
					method476();
					class47 var8 = method439("config", 15, field1309[2], "config");
					class47 var9 = method439("interface", 20, field1309[3], "interface");
					class47 var10 = method439("2d graphics", 30, field1309[4], "media");
					class47 var11 = method439("3d graphics", 40, field1309[5], "models");
					class47 var12 = method439("textures", 60, field1309[6], "textures");
					class47 var13 = method439("chat system", 65, field1309[7], "wordenc");
					class47 var14 = method439("sound effects", 70, field1309[8], "sounds");
					field1088 = new byte[4][104][104];
					field1145 = new int[4][105][105];
					field1323 = new class18(field1145, 4, 104, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1314[var15] = new class57(104, 104);
					}

					field1008 = new class34(512, 512);
					method13(75, "Unpacking media");
					field1318 = new class35(var10, "invback", 0);
					field1320 = new class35(var10, "chatback", 0);
					field1319 = new class35(var10, "mapback", 0);
					field1285 = new class35(var10, "backbase1", 0);
					field1286 = new class35(var10, "backbase2", 0);
					field1287 = new class35(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						field1013[var16] = new class35(var10, "sideicons", var16);
					}

					field992 = new class34(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							field968[var17] = new class35(var10, "mapscene", var17);
						}
					} catch (Exception var53) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							field1094[var18] = new class34(var10, "mapfunction", var18);
						}
					} catch (Exception var52) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							field1281[var19] = new class34(var10, "hitmarks", var19);
						}
					} catch (Exception var51) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							field1208[var20] = new class34(var10, "headicons", var20);
						}
					} catch (Exception var50) {
					}

					field1249 = new class34(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						field1333[var21] = new class34(var10, "cross", var21);
					}

					field1035 = new class34(var10, "mapdots", 0);
					field1036 = new class34(var10, "mapdots", 1);
					field1037 = new class34(var10, "mapdots", 2);
					field1038 = new class34(var10, "mapdots", 3);
					field1003 = new class35(var10, "scrollbar", 0);
					field1004 = new class35(var10, "scrollbar", 1);
					field1244 = new class35(var10, "redstone1", 0);
					field1245 = new class35(var10, "redstone2", 0);
					field1246 = new class35(var10, "redstone3", 0);
					field1247 = new class35(var10, "redstone1", 0);
					field1247.method184();
					field1248 = new class35(var10, "redstone2", 0);
					field1248.method184();
					field977 = new class35(var10, "redstone1", 0);
					field977.method185();
					field978 = new class35(var10, "redstone2", 0);
					field978.method185();
					field979 = new class35(var10, "redstone3", 0);
					field979.method185();
					field980 = new class35(var10, "redstone1", 0);
					field980.method184();
					field980.method185();
					field981 = new class35(var10, "redstone2", 0);
					field981.method184();
					field981.method185();
					class34 var22 = new class34(var10, "backleft1", 0);
					field1188 = new class43(var22.field519, method11(), var22.field518);
					var22.method171(0, 0);
					class34 var23 = new class34(var10, "backleft2", 0);
					field1189 = new class43(var23.field519, method11(), var23.field518);
					var23.method171(0, 0);
					class34 var24 = new class34(var10, "backright1", 0);
					field1190 = new class43(var24.field519, method11(), var24.field518);
					var24.method171(0, 0);
					class34 var25 = new class34(var10, "backright2", 0);
					field1191 = new class43(var25.field519, method11(), var25.field518);
					var25.method171(0, 0);
					class34 var26 = new class34(var10, "backtop1", 0);
					field1192 = new class43(var26.field519, method11(), var26.field518);
					var26.method171(0, 0);
					class34 var27 = new class34(var10, "backtop2", 0);
					field1193 = new class43(var27.field519, method11(), var27.field518);
					var27.method171(0, 0);
					class34 var28 = new class34(var10, "backvmid1", 0);
					field1194 = new class43(var28.field519, method11(), var28.field518);
					var28.method171(0, 0);
					class34 var29 = new class34(var10, "backvmid2", 0);
					field1195 = new class43(var29.field519, method11(), var29.field518);
					var29.method171(0, 0);
					class34 var30 = new class34(var10, "backvmid3", 0);
					field1196 = new class43(var30.field519, method11(), var30.field518);
					var30.method171(0, 0);
					class34 var31 = new class34(var10, "backhmid2", 0);
					field1197 = new class43(var31.field519, method11(), var31.field518);
					var31.method171(0, 0);
					method13(80, "Unpacking textures");
					class33.method158(var12);
					class33.method162(0.8D);
					class33.method157(20);
					method13(83, "Unpacking models");
					class31.method121(var11);
					class6.method47(var11);
					class7.method48(var11);
					method13(86, "Unpacking config");
					class62.method318(var8);
					class53.method273(var8);
					class58.method307(var8);
					class55.method285(var8);
					class54.method279(var8);
					class59.method310(var8);
					class63.method320(var8);
					class64.method323(var8);
					class55.field771 = field973;

					if (!field974) {
						method13(90, "Unpacking sounds");
						byte[] var32 = var14.method250("sounds.dat", null);
						class37 var33 = new class37(var32);
						class51.method263(var33);
					}

					method13(92, "Unpacking interfaces");
					class36[] var34 = new class36[] { field1274, field1275, field1276, field1277 };
					class60.method314(var34, var10, var9);
					method13(97, "Preparing game engine");

					for (int var35 = 0; var35 < 33; var35++) {
						int var36 = 999;
						int var37 = 0;
						for (int var38 = 0; var38 < 35; var38++) {
							if (field1319.field524[field1319.field526 * var35 + var38] == 0) {
								if (var36 == 999) {
									var36 = var38;
								}
							} else if (var36 != 999) {
								var37 = var38;
								break;
							}
						}

						field1182[var35] = var36;
						field1341[var35] = var37 - var36;
					}

					for (int var39 = 9; var39 < 160; var39++) {
						int var40 = 999;
						int var41 = 0;
						for (int var42 = 10; var42 < 168; var42++) {
							if (field1319.field524[field1319.field526 * var39 + var42] == 0 && (var42 > 34 || var39 > 34)) {
								if (var40 == 999) {
									var40 = var42;
								}
							} else if (var40 != 999) {
								var41 = var42;
								break;
							}
						}

						field1322[var39 - 9] = var40 - 21;
						field1108[var39 - 9] = var41 - var40;
					}

					class33.method155(96, 479);
					field1229 = class33.field505;
					class33.method155(261, 190);
					field1230 = class33.field505;
					class33.method155(334, 512);
					field1231 = class33.field505;
					int[] var43 = new int[9];
					for (int var44 = 0; var44 < 9; var44++) {
						int var45 = var44 * 32 + 128 + 15;
						int var46 = var45 * 3 + 600;
						int var47 = class33.field503[var45];
						var43[var44] = var46 * var47 >> 16;
					}

					class18.method87(334, 800, 512, 500, var43);
					class65.method325(var13);
				} catch (Exception var55) {
					field1272 = true;
				}
			} else {
				field1334 = true;
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;Z)V")
	public final void method473(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field1045; var3++) {
			int var4 = field1046[var3];
			class25 var5 = field1135[var4];
			int var6 = arg1.method209();
			if ((var6 & 0x2) == 2) {
				int var7 = arg1.method211();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field296 == var7) {
					var5.field300 = 0;
				}

				int var8 = arg1.method209();
				if (var7 == -1 || var5.field296 == -1 || class62.field901[var7].field909 > class62.field901[var5.field296].field909 || class62.field901[var5.field296].field909 == 0) {
					var5.field296 = var7;
					var5.field297 = 0;
					var5.field298 = 0;
					var5.field299 = var8;
					var5.field300 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field290 = arg1.method211();
				if (var5.field290 == 0xFFFF) {
					var5.field290 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field281 = arg1.method216();
				var5.field282 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field285 = arg1.method209();
				var5.field286 = arg1.method209();
				var5.field287 = field1147 + 400;
				var5.field288 = arg1.method209();
				var5.field289 = arg1.method209();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field321 = class54.method281(arg1.method211());
				var5.field276 = var5.field321.field750;
				var5.field277 = var5.field321.field751;
				var5.field278 = var5.field321.field752;
				var5.field279 = var5.field321.field753;
				var5.field274 = var5.field321.field749;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field301 = arg1.method211();
				int var9 = arg1.method214();
				var5.field305 = var9 >> 16;
				var5.field304 = (var9 & 0xFFFF) + field1147;
				var5.field302 = 0;
				var5.field303 = 0;

				if (var5.field304 > field1147) {
					var5.field302 = -1;
				}

				if (var5.field301 == 0xFFFF) {
					var5.field301 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field291 = arg1.method211();
				var5.field292 = arg1.method211();
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public static final void method474() {
		class18.field195 = true;
		class33.field494 = true;
		field974 = true;
		class3.field26 = true;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method10() {
		field1233 = true;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method475() {
		if (field1330 > 1) {
			field1330--;
		}

		if (field1239 > 0) {
			field1239--;
		}

		for (int var1 = 0; var1 < 5 && method435(); var1++) {
		}

		if (field965) {
			for (int var2 = 0; var2 < field1336; var2++) {
				if (field1317[var2] <= 0) {
					boolean var3 = false;
					try {
						if (field1048[var2] != field986 || field975[var2] != field967) {
							class37 var4 = class51.method264(field1048[var2], field975[var2]);
							if (System.currentTimeMillis() + var4.field542 / 22 > field976 / 22 + field1111) {
								field976 = var4.field542;
								field1111 = System.currentTimeMillis();

								if (method468(var4.field541, var4.field542)) {
									field986 = field1048[var2];
									field967 = field975[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!method469()) {
							var3 = true;
						}
					} catch (Exception var20) {
					}

					if (var3 && field1317[var2] != -5) {
						field1317[var2] = -5;
					} else {
						field1336--;
						for (int var6 = var2; var6 < field1336; var6++) {
							field1048[var6] = field1048[var6 + 1];
							field975[var6] = field975[var6 + 1];
							field1317[var6] = field1317[var6 + 1];
						}

						var2--;
					}
				} else {
					field1317[var2]--;
				}
			}

			if (field1126 > 0) {
				field1126 -= 20;
				if (field1126 < 0) {
					field1126 = 0;
				}

				if (field1126 == 0 && field1054 && !field974) {
					method406(field1283, field1106, field1066);
				}
			}

			if (class5.field59) {
				class37 var7 = class5.method36();
				if (var7 != null) {
					field1186.method198(53);
					field1186.method200(var7.field542);
					field1186.method207(var7.field542, var7.field541, 0);
					var7.method197();
				}
			}

			field1237++;
			if (field1237 > 750) {
				method371();
			}

			method390();
			method419();
			method452();
			method375();

			if ((field20[1] == 1 || field20[2] == 1 || field20[3] == 1 || field20[4] == 1) && field1052++ > 5) {
				field1052 = 0;
				field1186.method198(109);
				field1186.method200(field1026);
				field1186.method200(field1027);
				field1186.method199(field969);
				field1186.method199(field1178);
			}

			field989++;

			if (field1340 != 0) {
				field1339 += 20;
				if (field1339 >= 400) {
					field1340 = 0;
				}
			}

			if (field1253 != 0) {
				field1250++;
				if (field1250 >= 15) {
					if (field1253 == 2) {
						field1294 = true;
					}

					if (field1253 == 3) {
						field1173 = true;
					}

					field1253 = 0;
				}
			}

			if (field1115 != 0) {
				field983++;

				if (field15 > field1116 + 5 || field15 < field1116 - 5 || field16 > field1117 + 5 || field16 < field1117 - 5) {
					field1057 = true;
				}

				if (field14 == 0) {
					if (field1115 == 2) {
						field1294 = true;
					}

					if (field1115 == 3) {
						field1173 = true;
					}

					field1115 = 0;

					if (field1057 && field983 >= 5) {
						field1060 = -1;
						method443();

						if (field1113 == field1060 && field1114 != field1059) {
							class60 var8 = class60.field835[field1113];
							int var9 = var8.field836[field1059];
							var8.field836[field1059] = var8.field836[field1114];
							var8.field836[field1114] = var9;
							int var10 = var8.field837[field1059];
							var8.field837[field1059] = var8.field837[field1114];
							var8.field837[field1114] = var10;
							field1186.method198(80);
							field1186.method200(field1113);
							field1186.method200(field1114);
							field1186.method200(field1059);
						}
					} else if ((field1267 == 1 || method383(field1174 - 1)) && field1174 > 2) {
						method394();
					} else if (field1174 > 0) {
						method481(field1174 - 1);
					}

					field1250 = 10;
					field17 = 0;
				}
			}

			if (class18.field229 != -1) {
				int var11 = class18.field229;
				int var12 = class18.field230;
				boolean var13 = method454(field1030.field318[0], 0, 0, var11, var12, true, 0, field1030.field317[0], 0, 0, 0);
				class18.field229 = -1;

				if (var13) {
					field1337 = field18;
					field1338 = field19;
					field1340 = 1;
					field1339 = 0;
				}
			}

			if (field17 == 1 && field1144 != null) {
				field1144 = null;
				field1173 = true;
				field17 = 0;
			}

			method479();
			method363();
			method466();
			method374();

			if (field14 == 1 || field17 == 1) {
				field1012++;
			}

			if (field1308 == 2) {
				method376();
			}

			if (field1308 == 2 && field1302) {
				method429();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				field953[var14]++;
			}

			method465();
			field1279++;
			if (field1279 > 54) {
				field1279 = 0;
				field1186.method198(180);
			}

			field13++;
			if (field13 > 4500) {
				field1239 = 250;
				field13 -= 500;
				field1186.method198(161);
			}

			field1016++;
			if (field1016 > 500) {
				field1016 = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					field1080 += field1081;
				}

				if ((var15 & 0x2) == 2) {
					field1073 += field1074;
				}

				if ((var15 & 0x4) == 4) {
					field1084 += field1085;
				}
			}

			if (field1080 < -50) {
				field1081 = 2;
			}

			if (field1080 > 50) {
				field1081 = -2;
			}

			if (field1073 < -55) {
				field1074 = 2;
			}

			if (field1073 > 55) {
				field1074 = -2;
			}

			if (field1084 < -40) {
				field1085 = 1;
			}

			if (field1084 > 40) {
				field1085 = -1;
			}

			field1232++;
			if (field1232 > 500) {
				field1232 = 0;
				int var16 = (int) (Math.random() * 8.0D);
				if ((var16 & 0x1) == 1) {
					field969 += field970;
				}

				if ((var16 & 0x2) == 2) {
					field1178 += field1179;
				}
			}

			if (field969 < -60) {
				field970 = 2;
			}

			if (field969 > 60) {
				field970 = -2;
			}

			if (field1178 < -20) {
				field1179 = 1;
			}

			if (field1178 > 10) {
				field1179 = -1;
			}

			field1238++;
			if (field1238 > 50) {
				field1186.method198(126);
			}

			try {
				if (field1205 != null && field1186.field542 > 0) {
					field1205.method33(0, field1186.field541, field1186.field542);
					field1186.field542 = 0;
					field1238 = 0;
				}
			} catch (IOException var18) {
				method371();
			} catch (Exception var19) {
				method368();
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method476() {
		field1101 = new class35(field1266, "titlebox", 0);
		field1102 = new class35(field1266, "titlebutton", 0);
		field1146 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1146[var1] = new class35(field1266, "runes", var1);
		}

		field957 = new class34(128, 265);
		field958 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field957.field517[var2] = field1157.field583[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field958.field517[var3] = field1158.field583[var3];
		}

		field1305 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1305[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1305[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1305[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1305[var7 + 192] = 0xFFFFFF;
		}

		field1306 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1306[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1306[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1306[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1306[var11 + 192] = 0xFFFFFF;
		}

		field1307 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1307[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1307[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1307[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1307[var15 + 192] = 0xFFFFFF;
		}

		field1304 = new int[256];
		field1089 = new int[32768];
		field1090 = new int[32768];
		method405(null);
		field1227 = new int[32768];
		field1228 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1092) {
			field1096 = true;
			field1092 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method477(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method478() {
		if (field948 != 0) {
			class36 var1 = field1275;
			int var2 = 0;
			if (field1330 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1024[var3] != null) {
					int var4 = field1022[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1123 == 0 || field1123 == 1 && method464(field1023[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method191(4, 0, "From " + field1023[var3] + ": " + field1024[var3], var5);
						var1.method191(4, 0xFFFF, "From " + field1023[var3] + ": " + field1024[var3], var5 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1123 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method191(4, 0, field1024[var3], var6);
						var1.method191(4, 0xFFFF, field1024[var3], var6 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1123 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method191(4, 0, "To " + field1023[var3] + ": " + field1024[var3], var7);
						var1.method191(4, 0xFFFF, "To " + field1023[var3] + ": " + field1024[var3], var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://127.0.0.1:" + (field972 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		method382();

		if (field1266 == null) {
			super.method13(arg0, arg1);
		} else {
			field1156.method235();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1276.method188(var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class32.method150(0x8C1111, var3 / 2 - 152, var6, 34, 304);
			class32.method150(0, var3 / 2 - 151, var6 + 1, 32, 302);
			class32.method149(0x8C1111, var3 / 2 - 150, var6 + 2, arg0 * 3, 30);
			class32.method149(0, arg0 * 3 + var3 / 2 - 150, var6 + 2, 300 - arg0 * 3, 30);
			field1276.method188(var3 / 2, var4 / 2 + 5 - var5, arg1, 0xFFFFFF);
			field1156.method236(186, field8, 214);

			if (field1233) {
				field1233 = false;

				if (!field1092) {
					field1157.method236(0, field8, 0);
					field1158.method236(0, field8, 661);
				}

				field1154.method236(0, field8, 128);
				field1155.method236(386, field8, 214);
				field1159.method236(265, field8, 0);
				field1160.method236(265, field8, 574);
				field1161.method236(186, field8, 128);
				field1162.method236(186, field8, 574);
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method479() {
		if (field1115 == 0) {
			int var1 = field17;
			if (field1290 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field1087) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field959 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field959 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field959 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field960 - 10 || var2 > field962 + field960 + 10 || var3 < field961 - 10 || var3 > field963 + field961 + 10) {
						field1087 = false;

						if (field959 == 1) {
							field1294 = true;
						}

						if (field959 == 2) {
							field1173 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field960;
					int var5 = field961;
					int var6 = field962;
					int var7 = field18;
					int var8 = field19;
					if (field959 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field959 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field959 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1174; var10++) {
						int var11 = (field1174 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method481(var9);
					}

					field1087 = false;

					if (field959 == 1) {
						field1294 = true;
					}

					if (field959 == 2) {
						field1173 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1174 > 0) {
					int var12 = field1063[field1174 - 1];
					if (var12 == 134 || var12 == 701 || var12 == 570 || var12 == 719 || var12 == 440 || var12 == 871 || var12 == 526 || var12 == 156 || var12 == 120 || var12 == 796 || var12 == 357) {
						int var13 = field1061[field1174 - 1];
						int var14 = field1062[field1174 - 1];
						class60 var15 = class60.field835[var14];
						if (var15.field861) {
							field1057 = false;
							field983 = 0;
							field1113 = var14;
							field1114 = var13;
							field1115 = 2;
							field1116 = field18;
							field1117 = field19;

							if (class60.field835[var14].field841 == field1240) {
								field1115 = 1;
							}

							if (class60.field835[var14].field841 == field1242) {
								field1115 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1267 == 1 || method383(field1174 - 1)) && field1174 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1174 > 0) {
					method481(field1174 - 1);
				}

				if (var1 != 2 || field1174 <= 0) {
					return;
				}

				method394();
			}
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method480(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method481(int arg0) {
		if (arg0 >= 0) {
			if (field1141) {
				field1141 = false;
				field1173 = true;
			}

			int var2 = field1061[arg0];
			int var3 = field1062[arg0];
			int var4 = field1063[arg0];
			int var5 = field1064[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 493) {
				class25 var6 = field1135[var5];
				if (var6 != null) {
					method454(field1030.field318[0], 0, 0, var6.field317[0], var6.field318[0], false, 0, field1030.field317[0], 1, 2, 1);
					field1337 = field18;
					field1338 = field19;
					field1340 = 2;
					field1339 = 0;
					field1186.method198(36);
					field1186.method200(var5);
					field1186.method200(field1132);
					field1186.method200(field1130);
					field1186.method200(field1131);
				}
			}

			if (var4 == 134 || var4 == 701 || var4 == 570 || var4 == 719 || var4 == 440) {
				if (var4 == 719) {
					field1186.method198(186);
				}

				if (var4 == 701) {
					field1186.method198(47);
				}

				if (var4 == 134) {
					field1186.method198(90);
				}

				if (var4 == 570) {
					field1186.method198(121);
				}

				if (var4 == 440) {
					field1186.method198(31);
				}

				field1186.method200(var5);
				field1186.method200(var2);
				field1186.method200(var3);
				field1250 = 0;
				field1251 = var3;
				field1252 = var2;
				field1253 = 2;
				if (class60.field835[var3].field841 == field1240) {
					field1253 = 1;
				}

				if (class60.field835[var3].field841 == field1242) {
					field1253 = 3;
				}
			}

			if (var4 == 125) {
				String var7 = field1053[arg0];
				int var8 = var7.indexOf("@whi@");
				if (var8 != -1) {
					long var9 = class48.method251(var7.substring(var8 + 5).trim());
					int var11 = -1;
					for (int var12 = 0; var12 < field956; var12++) {
						if (field1270[var12] == var9) {
							var11 = var12;
							break;
						}
					}

					if (var11 != -1 && field1165[var11] > 0) {
						field1173 = true;
						field1141 = false;
						field1187 = true;
						field1201 = "";
						field1095 = 3;
						field1058 = field1270[var11];
						field1234 = "Enter message to send to " + field1138[var11];
					}
				}
			}

			if (var4 == 1308) {
				class55 var13 = class55.method287(var5);
				String var14;
				if (var13.field775 == null) {
					var14 = "It's a " + var13.field774 + ".";
				} else {
					var14 = new String(var13.field775);
				}

				method391(var14, 0, "");
			}

			if (var4 == 798) {
				field1170++;
				if (field1170 >= 135) {
					field1186.method198(253);
					field1186.method200(10151);
				}

				method483(var2, 207, var3, var5);
			}

			if (var4 == 829) {
				field1200 += var3;
				if (field1200 >= 132) {
					field1186.method198(27);
					field1186.method200(17379);
				}

				method483(var2, 223, var3, var5);
			}

			if (var4 == 48) {
				class26 var15 = field1042[var5];
				if (var15 != null) {
					method454(field1030.field318[0], 0, 0, var15.field317[0], var15.field318[0], false, 0, field1030.field317[0], 1, 2, 1);
					field1337 = field18;
					field1338 = field19;
					field1340 = 2;
					field1339 = 0;
					field1186.method198(39);
					field1186.method200(var5);
					field1186.method200(field1291);
				}
			}

			if (var4 == 104) {
				method483(var2, 168, var3, var5);
			}

			if (var4 == 237) {
				field1186.method198(106);
				field1186.method200(var5);
				field1186.method200(var2);
				field1186.method200(var3);
				field1186.method200(field1132);
				field1186.method200(field1130);
				field1186.method200(field1131);
				field1250 = 0;
				field1251 = var3;
				field1252 = var2;
				field1253 = 2;
				if (class60.field835[var3].field841 == field1240) {
					field1253 = 1;
				}

				if (class60.field835[var3].field841 == field1242) {
					field1253 = 3;
				}
			}

			if (var4 == 203) {
				boolean var16 = method454(field1030.field318[0], 0, 0, var2, var3, false, 0, field1030.field317[0], 0, 2, 0);
				if (!var16) {
					method454(field1030.field318[0], 0, 0, var2, var3, false, 0, field1030.field317[0], 1, 2, 1);
				}

				field1337 = field18;
				field1338 = field19;
				field1340 = 2;
				field1339 = 0;
				field1186.method198(183);
				field1186.method200(field1256 + var2);
				field1186.method200(field1257 + var3);
				field1186.method200(var5);
				field1186.method200(field1132);
				field1186.method200(field1130);
				field1186.method200(field1131);
			}

			if (var4 == 981) {
				if (field1087) {
					field1323.method89(var3 - 11, var2 - 8);
				} else {
					field1323.method89(field19 - 11, field18 - 8);
				}
			}

			if (var4 == 967) {
				field1186.method198(222);
				field1186.method200(var3);
				class60 var18 = class60.field835[var3];
				if (var18.field849 != null && var18.field849[0][0] == 5) {
					int var19 = var18.field849[0][1];
					field1152[var19] = 1 - field1152[var19];
					method441(var19);
					field1294 = true;
				}
			}

			if (var4 == 447 || var4 == 158 || var4 == 804 || var4 == 521) {
				String var20 = field1053[arg0];
				int var21 = var20.indexOf("@whi@");
				if (var21 != -1) {
					long var22 = class48.method251(var20.substring(var21 + 5).trim());
					if (var4 == 447) {
						method373(var22);
					}

					if (var4 == 158) {
						method462(var22);
					}

					if (var4 == 804) {
						method400(var22);
					}

					if (var4 == 521) {
						method372(var22);
					}
				}
			}

			if (var4 == 316) {
				String var24 = field1053[arg0];
				int var25 = var24.indexOf("@whi@");
				if (var25 != -1) {
					method398();
					field1127 = var24.substring(var25 + 5).trim();
					field1269 = false;

					for (int var26 = 0; var26 < class60.field835.length; var26++) {
						if (class60.field835[var26] != null && class60.field835[var26].field844 == 600) {
							field1273 = field1240 = class60.field835[var26].field841;
							break;
						}
					}
				}
			}

			if (var4 == 103) {
				class26 var27 = field1042[var5];
				if (var27 != null) {
					method454(field1030.field318[0], 0, 0, var27.field317[0], var27.field318[0], false, 0, field1030.field317[0], 1, 2, 1);
					field1337 = field18;
					field1338 = field19;
					field1340 = 2;
					field1339 = 0;
					field1186.method198(184);
					field1186.method200(var5);
					field1186.method200(field1132);
					field1186.method200(field1130);
					field1186.method200(field1131);
				}
			}

			if (var4 == 357) {
				field1129 = 1;
				field1130 = var2;
				field1131 = var3;
				field1132 = var5;
				field1133 = class55.method287(var5).field774;
				field1290 = 0;
			} else {
				if (var4 == 543) {
					boolean var28 = method454(field1030.field318[0], 0, 0, var2, var3, false, 0, field1030.field317[0], 0, 2, 0);
					if (!var28) {
						method454(field1030.field318[0], 0, 0, var2, var3, false, 0, field1030.field317[0], 1, 2, 1);
					}

					field1337 = field18;
					field1338 = field19;
					field1340 = 2;
					field1339 = 0;
					field1186.method198(241);
					field1186.method200(field1256 + var2);
					field1186.method200(field1257 + var3);
					field1186.method200(var5);
					field1186.method200(field1291);
				}

				if (var4 == 1418) {
					int var30 = var5 >> 14 & 0x7FFF;
					class53 var31 = class53.method275(var30);
					String var32;
					if (var31.field707 == null) {
						var32 = "It's a " + var31.field706 + ".";
					} else {
						var32 = new String(var31.field707);
					}

					method391(var32, 0, "");
				}

				if (var4 == 595 || var4 == 835) {
					String var33 = field1053[arg0];
					int var34 = var33.indexOf("@whi@");
					if (var34 != -1) {
						var33 = var33.substring(var34 + 5).trim();
						String var35 = class48.method255(class48.method252(class48.method251(var33)));
						boolean var36 = false;
						for (int var37 = 0; var37 < field1043; var37++) {
							class26 var38 = field1042[field1044[var37]];
							if (var38 != null && var38.field322 != null && var38.field322.equalsIgnoreCase(var35)) {
								method454(field1030.field318[0], 0, 0, var38.field317[0], var38.field318[0], false, 0, field1030.field317[0], 1, 2, 1);

								if (var4 == 595) {
									field1186.method198(245);
								}

								if (var4 == 835) {
									field1186.method198(173);
								}

								field1186.method200(field1044[var37]);
								var36 = true;
								break;
							}
						}

						if (!var36) {
							method391("Unable to find " + var35, 0, "");
						}
					}
				}

				if (var4 == 1814) {
					class25 var39 = field1135[var5];
					if (var39 != null) {
						String var40;
						if (var39.field321.field745 == null) {
							var40 = "It's a " + var39.field321.field744 + ".";
						} else {
							var40 = new String(var39.field321.field745);
						}

						method391(var40, 0, "");
					}
				}

				if (var4 == 505 && method483(var2, 139, var3, var5)) {
					field1186.method200(field1132);
					field1186.method200(field1130);
					field1186.method200(field1131);
				}

				if (var4 == 706) {
					class60 var41 = class60.field835[var3];
					boolean var42 = true;
					if (var41.field844 > 0) {
						var42 = method396(var41);
					}

					if (var42) {
						field1186.method198(222);
						field1186.method200(var3);
					}
				}

				if (var4 == 73 && !field1204) {
					field1186.method198(218);
					field1186.method200(var3);
					field1204 = true;
				}

				if (var4 == 672) {
					field1186.method198(222);
					field1186.method200(var3);
					class60 var43 = class60.field835[var3];
					if (var43.field849 != null && var43.field849[0][0] == 5) {
						int var44 = var43.field849[0][1];
						if (field1152[var44] != var43.field851[0]) {
							field1152[var44] = var43.field851[0];
							method441(var44);
							field1294 = true;
						}
					}
				}

				if (var4 == 988 || var4 == 345 || var4 == 249 || var4 == 960 || var4 == 40) {
					class25 var45 = field1135[var5];
					if (var45 != null) {
						method454(field1030.field318[0], 0, 0, var45.field317[0], var45.field318[0], false, 0, field1030.field317[0], 1, 2, 1);
						field1337 = field18;
						field1338 = field19;
						field1340 = 2;
						field1339 = 0;

						if (var4 == 345) {
							field1166 += var5;
							if (field1166 >= 116) {
								field1186.method198(217);
							}

							field1186.method198(191);
						}

						if (var4 == 249) {
							field1186.method198(89);
						}

						if (var4 == 988) {
							field1186.method198(236);
						}

						if (var4 == 40) {
							field1186.method198(198);
						}

						if (var4 == 960) {
							field1186.method198(114);
						}

						field1186.method200(var5);
					}
				}

				if (var4 == 873) {
					method483(var2, 196, var3, var5);
				}

				if (var4 == 309) {
					method398();
				}

				if (var4 == 1974) {
					class55 var46 = class55.method287(var5);
					String var47;
					if (var3 >= 100000) {
						var47 = var3 + " x " + var46.field774;
					} else if (var46.field775 == null) {
						var47 = "It's a " + var46.field774 + ".";
					} else {
						var47 = new String(var46.field775);
					}

					method391(var47, 0, "");
				}

				if (var4 == 871 || var4 == 526 || var4 == 156 || var4 == 120 || var4 == 796) {
					if (var4 == 526) {
						field1186.method198(0);
					}

					if (var4 == 871) {
						field1311 += var5;
						if (field1311 >= 76) {
							field1186.method198(214);
							field1186.method199(171);
						}

						field1186.method198(140);
					}

					if (var4 == 120) {
						field1186.method198(112);
					}

					if (var4 == 156) {
						field955++;
						if (field955 >= 62) {
							field1186.method198(82);
							field1186.method199(142);
						}

						field1186.method198(155);
					}

					if (var4 == 796) {
						if ((var5 & 0x3) == 0) {
							field1313++;
						}

						if (field1313 >= 124) {
							field1186.method198(167);
							field1186.method203(0);
						}

						field1186.method198(122);
					}

					field1186.method200(var5);
					field1186.method200(var2);
					field1186.method200(var3);
					field1250 = 0;
					field1251 = var3;
					field1252 = var2;
					field1253 = 2;
					if (class60.field835[var3].field841 == field1240) {
						field1253 = 1;
					}

					if (class60.field835[var3].field841 == field1242) {
						field1253 = 3;
					}
				}

				if (var4 == 1528 || var4 == 1741 || var4 == 593 || var4 == 1596) {
					class26 var48 = field1042[var5];
					if (var48 != null) {
						method454(field1030.field318[0], 0, 0, var48.field317[0], var48.field318[0], false, 0, field1030.field317[0], 1, 2, 1);
						field1337 = field18;
						field1338 = field19;
						field1340 = 2;
						field1339 = 0;

						if (var4 == 593) {
							field1186.method198(28);
						}

						if (var4 == 1596) {
							field1186.method198(173);
						}

						if (var4 == 1528) {
							field1186.method198(245);
						}

						if (var4 == 1741) {
							if ((var5 & 0x3) == 0) {
								field1065++;
							}

							if (field1065 >= 139) {
								field1186.method198(84);
								field1186.method203(0);
							}

							field1186.method198(63);
						}

						field1186.method200(var5);
					}
				}

				if (var4 == 1659) {
					method483(var2, 181, var3, var5);
				}

				if (var4 == 737 && method483(var2, 9, var3, var5)) {
					field1186.method200(field1291);
				}

				if (var4 == 63) {
					field1186.method198(158);
					field1186.method200(var5);
					field1186.method200(var2);
					field1186.method200(var3);
					field1186.method200(field1291);
					field1250 = 0;
					field1251 = var3;
					field1252 = var2;
					field1253 = 2;
					if (class60.field835[var3].field841 == field1240) {
						field1253 = 1;
					}

					if (class60.field835[var3].field841 == field1242) {
						field1253 = 3;
					}
				}

				if (var4 == 500) {
					class25 var49 = field1135[var5];
					if (var49 != null) {
						method454(field1030.field318[0], 0, 0, var49.field317[0], var49.field318[0], false, 0, field1030.field317[0], 1, 2, 1);
						field1337 = field18;
						field1338 = field19;
						field1340 = 2;
						field1339 = 0;
						field1186.method198(244);
						field1186.method200(var5);
						field1186.method200(field1291);
					}
				}

				if (var4 == 56 || var4 == 321 || var4 == 552 || var4 == 43 || var4 == 687) {
					boolean var50 = method454(field1030.field318[0], 0, 0, var2, var3, false, 0, field1030.field317[0], 0, 2, 0);
					if (!var50) {
						method454(field1030.field318[0], 0, 0, var2, var3, false, 0, field1030.field317[0], 1, 2, 1);
					}

					field1337 = field18;
					field1338 = field19;
					field1340 = 2;
					field1339 = 0;

					if (var4 == 43) {
						field1186.method198(143);
					}

					if (var4 == 687) {
						field1149++;
						if (field1149 >= 121) {
							field1186.method198(13);
							field1186.method199(128);
						}

						field1186.method198(192);
					}

					if (var4 == 56) {
						field1186.method198(91);
					}

					if (var4 == 552) {
						field1186.method198(226);
					}

					if (var4 == 321) {
						field1186.method198(48);
					}

					field1186.method200(field1256 + var2);
					field1186.method200(field1257 + var3);
					field1186.method200(var5);
				}

				if (var4 == 941) {
					class60 var52 = class60.field835[var3];
					field1290 = 1;
					field1291 = var3;
					field1292 = var52.field890;
					field1129 = 0;
					String var53 = var52.field888;
					if (var53.indexOf(" ") != -1) {
						var53 = var53.substring(0, var53.indexOf(" "));
					}

					String var54 = var52.field888;
					if (var54.indexOf(" ") != -1) {
						var54 = var54.substring(var54.indexOf(" ") + 1);
					}

					field1293 = var53 + " " + var52.field889 + " " + var54;

					if (field1292 == 16) {
						field1294 = true;
						field1310 = 3;
						field1055 = true;
					}
				} else {
					field1129 = 0;
					field1290 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method482() {
		field1199++;
		method487();
		method485();
		method369();
		method446();
		method450();

		if (!field1302) {
			int var1 = field1026;
			if (field1015 / 256 > var1) {
				var1 = field1015 / 256;
			}

			if (field1110[4] && field1312[4] + 128 > var1) {
				var1 = field1312[4] + 128;
			}

			int var2 = field1084 + field1027 & 0x7FF;
			method451(field1051, field1050, var1 * 3 + 600, var1, var2, method447(field1030.field270, field1030.field269, field1017) - 50);
		}

		int var3;
		if (field1302) {
			var3 = method461();
		} else {
			var3 = method460();
		}

		int var4 = field1211;
		int var5 = field1212;
		int var6 = field1213;
		int var7 = field1214;
		int var8 = field1215;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1110[var9]) {
				int var10 = (int) (Math.random() * (field1014[var9] * 2 + 1) + Math.sin(field1327[var9] / 100.0D * field953[var9]) * field1312[var9] - field1014[var9]);
				if (var9 == 0) {
					field1211 += var10;
				}

				if (var9 == 1) {
					field1212 += var10;
				}

				if (var9 == 2) {
					field1213 += var10;
				}

				if (var9 == 3) {
					field1215 = field1215 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1214 += var10;
					if (field1214 < 128) {
						field1214 = 128;
					}

					if (field1214 > 383) {
						field1214 = 383;
					}
				}
			}
		}

		int var11 = class33.field514;
		class31.field475 = true;
		class31.field478 = 0;
		class31.field476 = field15 - 8;
		class31.field477 = field16 - 11;
		class32.method148();
		field1323.method90(field1212, field1214, var3, field1211, field1213, field1215);
		field1323.method64();
		method411();
		method467();
		method417(var11);
		method381();
		field1020.method236(11, field8, 8);
		field1211 = var4;
		field1212 = var5;
		field1213 = var6;
		field1214 = var7;
		field1215 = var8;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method483(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field1323.method81(field1017, arg0, arg2, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class53 var9 = class53.method275(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field710;
				var11 = var9.field711;
			} else {
				var10 = var9.field711;
				var11 = var9.field710;
			}

			int var12 = var9.field734;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method454(field1030.field318[0], var12, 0, arg0, arg2, false, 0, field1030.field317[0], var10, 2, var11);
		} else {
			method454(field1030.field318[0], 0, var7 + 1, arg0, arg2, false, var8, field1030.field317[0], 0, 2, 0);
		}

		field1337 = field18;
		field1338 = field19;
		field1340 = 2;
		field1339 = 0;
		field1186.method198(arg1);
		field1186.method200(field1256 + arg0);
		field1186.method200(field1257 + arg2);
		field1186.method200(var5);
		return true;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method484() {
		int var1 = (field1030.field269 >> 7) + field1256;
		int var2 = (field1030.field270 >> 7) + field1257;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1185 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1185 = (var2 - 9920) / 8 + 1;
		} else {
			field1185 = 0;
		}

		field1335 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1335 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1335 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1335 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1335 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1335 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1335 = 1;
			}
		}

		if (field1335 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1335 = 2;
		}

		field1128 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1128 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1128 = 1;
		}

		if (field1128 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1128 = 0;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method485() {
		for (int var1 = 0; var1 < field1136; var1++) {
			class25 var2 = field1135[field1137[var1]];
			int var3 = (field1137[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method111()) {
				int var4 = var2.field269 >> 7;
				int var5 = var2.field270 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field273 == 1 && (var2.field269 & 0x7F) == 0x40 && (var2.field270 & 0x7F) == 0x40) {
						if (field1143[var4][var5] == field1199) {
							continue;
						}

						field1143[var4][var5] = field1199;
					}

					field1323.method61((var2.field273 - 1) * 64 + 60, var2.field271, var2.field269, method447(var2.field270, var2.field269, field1017), var3, field1017, var2, null, var2.field270, var2.field272);
				}
			}
		}
	}

	@ObfuscatedName("client.d(III)Z")
	public final boolean method486(int arg0, int arg1) {
		boolean var3 = false;
		class60 var4 = class60.field835[arg0];
		for (int var5 = 0; var5 < var4.field856.length && var4.field856[var5] != -1; var5++) {
			class60 var6 = class60.field835[var4.field856[var5]];
			if (var6.field842 == 1) {
				var3 |= method486(var6.field840, arg1);
			}

			if (var6.field842 == 6 && (var6.field883 != -1 || var6.field884 != -1)) {
				boolean var7 = method437(var6);
				int var8;
				if (var7) {
					var8 = var6.field884;
				} else {
					var8 = var6.field883;
				}

				if (var8 != -1) {
					class62 var9 = class62.field901[var8];
					var6.field839 += arg1;
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

	@ObfuscatedName("client.n(B)V")
	public final void method487() {
		if (field1030.field269 >> 7 == field1006 && field1030.field270 >> 7 == field1007) {
			field1006 = 0;
		}

		for (int var1 = -1; var1 < field1043; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1030;
				var3 = field1041 << 14;
			} else {
				var2 = field1042[field1044[var1]];
				var3 = field1044[var1] << 14;
			}

			if (var2 != null && var2.method111()) {
				var2.field341 = false;
				if ((field974 && field1043 > 50 || field1043 > 200) && var1 != -1 && var2.field293 == var2.field274) {
					var2.field341 = true;
				}

				int var4 = var2.field269 >> 7;
				int var5 = var2.field270 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field336 == null || field1147 < var2.field331 || field1147 >= var2.field332) {
						if ((var2.field269 & 0x7F) == 0x40 && (var2.field270 & 0x7F) == 0x40) {
							if (field1143[var4][var5] == field1199) {
								continue;
							}

							field1143[var4][var5] = field1199;
						}

						var2.field330 = method447(var2.field270, var2.field269, field1017);
						field1323.method61(60, var2.field271, var2.field269, var2.field330, var3, field1017, var2, null, var2.field270, var2.field272);
					} else {
						var2.field341 = false;
						var2.field330 = method447(var2.field270, var2.field269, field1017);
						field1323.method62(var2.field338, var2.field340, var2.field330, var2.field270, var3, null, var2.field337, var2.field339, var2, field1017, 60, var2.field269, var2.field271);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method488() {
		field949 = false;

		while (field1153) {
			try {
				Thread.sleep(50L);
			} catch (Exception var15) {
			}

			String var2;
			int var3;
			int var4;
			synchronized (field991) {
				var2 = field985;
				var3 = field1107;
				var4 = field1254;
				field985 = null;
				field1107 = 0;
				field1254 = 0;
			}

			if (var2 != null) {
				byte[] var5 = signlink.cacheload(var2 + ".mid");
				if (var5 != null && var3 != 12345678) {
					field1134.reset();
					field1134.update(var5);
					int var6 = (int) field1134.getValue();
					if (var3 != var6) {
						var5 = null;
					}
				}

				if (var5 == null) {
					try {
						DataInputStream var7 = method477(var2 + "_" + var3 + ".mid");
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

				int var12 = (new class37(var5)).method214();
				byte[] var13 = new byte[var12];
				class44.method238(var13, var12, var5, var4, 4);
				method458(var12, true, var13);
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field952[var1] = var0 / 4;
		}
	}
}
