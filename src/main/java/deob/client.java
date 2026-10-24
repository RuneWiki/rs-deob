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
	public class43 field968;

	@ObfuscatedName("client.bb")
	public class43 field969;

	@ObfuscatedName("client.cb")
	public class43 field970;

	@ObfuscatedName("client.db")
	public class43 field971;

	@ObfuscatedName("client.eb")
	public class43 field972;

	@ObfuscatedName("client.fb")
	public int[] field973 = new int[50];

	@ObfuscatedName("client.gb")
	public int field974;

	@ObfuscatedName("client.hb")
	public int field975;

	@ObfuscatedName("client.ib")
	public class60 field976 = new class60();

	@ObfuscatedName("client.jb")
	public static int field977;

	@ObfuscatedName("client.kb")
	public int[] field978 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.mb")
	public int field979 = -1;

	@ObfuscatedName("client.nb")
	public boolean field980 = false;

	@ObfuscatedName("client.ob")
	public long field981;

	@ObfuscatedName("client.pb")
	public CRC32 field982 = new CRC32();

	@ObfuscatedName("client.qb")
	public int field983;

	@ObfuscatedName("client.rb")
	public class47 field984;

	@ObfuscatedName("client.sb")
	public int field985;

	@ObfuscatedName("client.tb")
	public int field986;

	@ObfuscatedName("client.ub")
	public int field987;

	@ObfuscatedName("client.vb")
	public String field988;

	@ObfuscatedName("client.yb")
	public class35[] field989 = new class35[13];

	@ObfuscatedName("client.zb")
	public int field990;

	@ObfuscatedName("client.ac")
	public int field1017 = 1;

	@ObfuscatedName("client.bc")
	public int field1018;

	@ObfuscatedName("client.cc")
	public int field1019;

	@ObfuscatedName("client.dc")
	public int field1020;

	@ObfuscatedName("client.ec")
	public int field1021;

	@ObfuscatedName("client.fc")
	public int field1022;

	@ObfuscatedName("client.gc")
	public int field1023;

	@ObfuscatedName("client.hc")
	public int field1024;

	@ObfuscatedName("client.ic")
	public int field1025;

	@ObfuscatedName("client.jc")
	public int field1026;

	@ObfuscatedName("client.kc")
	public boolean field1027 = true;

	@ObfuscatedName("client.lc")
	public String field1028;

	@ObfuscatedName("client.mc")
	public int field1029;

	@ObfuscatedName("client.F")
	public String field948 = "";

	@ObfuscatedName("client.G")
	public String field949 = "";

	@ObfuscatedName("client.H")
	public int[] field950 = new int[5];

	@ObfuscatedName("client.J")
	public class35[] field952 = new class35[50];

	@ObfuscatedName("client.N")
	public boolean field956 = false;

	@ObfuscatedName("client.U")
	public boolean field962 = false;

	@ObfuscatedName("client.Ab")
	public String field991 = "";

	@ObfuscatedName("client.Fb")
	public int field996 = 50;

	@ObfuscatedName("client.Gb")
	public int[] field997 = new int[field996];

	@ObfuscatedName("client.Hb")
	public int[] field998 = new int[field996];

	@ObfuscatedName("client.Ib")
	public int[] field999 = new int[field996];

	@ObfuscatedName("client.Jb")
	public int[] field1000 = new int[field996];

	@ObfuscatedName("client.Kb")
	public int[] field1001 = new int[field996];

	@ObfuscatedName("client.Lb")
	public int[] field1002 = new int[field996];

	@ObfuscatedName("client.Mb")
	public int[] field1003 = new int[field996];

	@ObfuscatedName("client.Nb")
	public String[] field1004 = new String[field996];

	@ObfuscatedName("client.Xb")
	public class41 field1014 = new class41();

	@ObfuscatedName("client.Yb")
	public int field1015 = -1;

	@ObfuscatedName("client.oc")
	public int[] field1030 = new int[2000];

	@ObfuscatedName("client.rc")
	public boolean field1032 = false;

	@ObfuscatedName("client.sc")
	public int[] field1033 = new int[5];

	@ObfuscatedName("client.tc")
	public boolean field1034 = false;

	@ObfuscatedName("client.uc")
	public final int[] field1035 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.zc")
	public int[] field1040 = new int[151];

	@ObfuscatedName("client.Ec")
	public int field1045 = -1;

	@ObfuscatedName("client.Fc")
	public String field1046 = "";

	@ObfuscatedName("client.Sc")
	public String[] field1057 = new String[500];

	@ObfuscatedName("client.Uc")
	public int[] field1059 = new int[5];

	@ObfuscatedName("client.Wc")
	public boolean field1061 = false;

	@ObfuscatedName("client.Xc")
	public boolean field1062 = false;

	@ObfuscatedName("client.Yc")
	public int field1063 = 78;

	@ObfuscatedName("client.Zc")
	public boolean field1064 = false;

	@ObfuscatedName("client.bd")
	public int field1066 = 1;

	@ObfuscatedName("client.cd")
	public String[] field1067 = new String[100];

	@ObfuscatedName("client.dd")
	public class41 field1068 = new class41();

	@ObfuscatedName("client.ed")
	public class34[] field1069 = new class34[8];

	@ObfuscatedName("client.fd")
	public int[] field1070 = new int[256];

	@ObfuscatedName("client.hd")
	public byte[] field1072 = new byte[16384];

	@ObfuscatedName("client.od")
	public int field1077 = -1;

	@ObfuscatedName("client.pd")
	public int field1078 = -1;

	@ObfuscatedName("client.td")
	public int[] field1082 = new int[50];

	@ObfuscatedName("client.ud")
	public boolean field1083 = false;

	@ObfuscatedName("client.wd")
	public int[] field1085 = new int[50];

	@ObfuscatedName("client.xd")
	public final int field1086 = 100;

	@ObfuscatedName("client.yd")
	public int[] field1087 = new int[100];

	@ObfuscatedName("client.Ad")
	public boolean field1089 = false;

	@ObfuscatedName("client.Gd")
	public String field1095 = "";

	@ObfuscatedName("client.Hd")
	public String field1096 = "";

	@ObfuscatedName("client.Id")
	public boolean field1097 = false;

	@ObfuscatedName("client.Ld")
	public int field1100 = 3;

	@ObfuscatedName("client.Md")
	public boolean field1101 = false;

	@ObfuscatedName("client.Nd")
	public String field1102 = "";

	@ObfuscatedName("client.Qd")
	public boolean field1105 = true;

	@ObfuscatedName("client.Td")
	public long[] field1107 = new long[100];

	@ObfuscatedName("client.Wd")
	public int field1110 = 0x23201B;

	@ObfuscatedName("client.ce")
	public int field1116 = 0x332D25;

	@ObfuscatedName("client.le")
	public int[] field1123 = new int[100];

	@ObfuscatedName("client.me")
	public String[] field1124 = new String[100];

	@ObfuscatedName("client.ne")
	public String[] field1125 = new String[100];

	@ObfuscatedName("client.ve")
	public String field1133 = "";

	@ObfuscatedName("client.Ae")
	public int field1138 = -1;

	@ObfuscatedName("client.Be")
	public class25[] field1139 = new class25[8192];

	@ObfuscatedName("client.De")
	public int[] field1141 = new int[8192];

	@ObfuscatedName("client.He")
	public class34[] field1144 = new class34[50];

	@ObfuscatedName("client.Qe")
	public int[] field1151 = new int[1000];

	@ObfuscatedName("client.We")
	public int field1157 = 0x766654;

	@ObfuscatedName("client.Xe")
	public int[] field1158 = new int[2000];

	@ObfuscatedName("client.Ye")
	public class34[] field1159 = new class34[20];

	@ObfuscatedName("client.hf")
	public boolean field1167 = false;

	@ObfuscatedName("client.of")
	public int field1171 = 2;

	@ObfuscatedName("client.wf")
	public int field1178 = 128;

	@ObfuscatedName("client.Af")
	public boolean field1182 = false;

	@ObfuscatedName("client.Bf")
	public int[] field1183 = new int[50];

	@ObfuscatedName("client.Of")
	public int field1194 = -1;

	@ObfuscatedName("client.Wf")
	public long[] field1201 = new long[100];

	@ObfuscatedName("client.Zf")
	public int field1204 = -1;

	@ObfuscatedName("client.cg")
	public class41 field1207 = new class41();

	@ObfuscatedName("client.dg")
	public class37 field1208 = class37.method203(1);

	@ObfuscatedName("client.fg")
	public boolean field1210 = false;

	@ObfuscatedName("client.gg")
	public boolean field1211 = false;

	@ObfuscatedName("client.hg")
	public int field1212 = 2048;

	@ObfuscatedName("client.ig")
	public int field1213 = 2047;

	@ObfuscatedName("client.jg")
	public class26[] field1214 = new class26[field1212];

	@ObfuscatedName("client.lg")
	public int[] field1216 = new int[field1212];

	@ObfuscatedName("client.ng")
	public int[] field1218 = new int[field1212];

	@ObfuscatedName("client.og")
	public class37[] field1219 = new class37[field1212];

	@ObfuscatedName("client.pg")
	public int[][] field1220 = new int[104][104];

	@ObfuscatedName("client.rg")
	public int field1222 = 2;

	@ObfuscatedName("client.Cg")
	public int[] field1233 = new int[4000];

	@ObfuscatedName("client.Dg")
	public int[] field1234 = new int[4000];

	@ObfuscatedName("client.Fg")
	public int[] field1236 = new int[9];

	@ObfuscatedName("client.Ig")
	public boolean field1239 = true;

	@ObfuscatedName("client.Lg")
	public int[] field1242 = new int[50];

	@ObfuscatedName("client.Mg")
	public class34[] field1243 = new class34[1000];

	@ObfuscatedName("client.Vg")
	public boolean field1250 = false;

	@ObfuscatedName("client.Wg")
	public int[] field1251 = new int[50];

	@ObfuscatedName("client.bh")
	public int[] field1256 = new int[100];

	@ObfuscatedName("client.ch")
	public int[] field1257 = new int[5];

	@ObfuscatedName("client.fh")
	public int[] field1260 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.gh")
	public int[] field1261 = new int[5];

	@ObfuscatedName("client.hh")
	public class41[][][] field1262 = new class41[4][104][104];

	@ObfuscatedName("client.jh")
	public int[] field1263 = new int[33];

	@ObfuscatedName("client.oh")
	public class37 field1266 = class37.method203(1);

	@ObfuscatedName("client.rh")
	public int[] field1267 = new int[7];

	@ObfuscatedName("client.th")
	public boolean field1268 = true;

	@ObfuscatedName("client.uh")
	public int[][] field1269 = new int[104][104];

	@ObfuscatedName("client.vh")
	public class37 field1270 = class37.method203(1);

	@ObfuscatedName("client.wh")
	public boolean field1271 = false;

	@ObfuscatedName("client.zh")
	public int field1274 = 2;

	@ObfuscatedName("client.Ch")
	public boolean field1277 = false;

	@ObfuscatedName("client.Fh")
	public class34[] field1280 = new class34[20];

	@ObfuscatedName("client.Hh")
	public int[] field1282 = new int[500];

	@ObfuscatedName("client.Ih")
	public int[] field1283 = new int[500];

	@ObfuscatedName("client.Jh")
	public int[] field1284 = new int[500];

	@ObfuscatedName("client.Kh")
	public int[] field1285 = new int[500];

	@ObfuscatedName("client.Lh")
	public Object field1286 = new Object();

	@ObfuscatedName("client.Nh")
	public int field1287 = -1;

	@ObfuscatedName("client.Sh")
	public int field1291 = -1;

	@ObfuscatedName("client.Vh")
	public String field1294 = "";

	@ObfuscatedName("client.Wh")
	public boolean field1295 = false;

	@ObfuscatedName("client.Zh")
	public int field1298 = -1;

	@ObfuscatedName("client.bi")
	public boolean[] field1300 = new boolean[5];

	@ObfuscatedName("client.ii")
	public int field1306 = -1;

	@ObfuscatedName("client.ji")
	public int[][] field1307 = new int[104][104];

	@ObfuscatedName("client.li")
	public int[] field1309 = new int[1000];

	@ObfuscatedName("client.mi")
	public int[] field1310 = new int[1000];

	@ObfuscatedName("client.ni")
	public boolean field1311 = false;

	@ObfuscatedName("client.oi")
	public int[] field1312 = new int[151];

	@ObfuscatedName("client.Ii")
	public boolean field1330 = false;

	@ObfuscatedName("client.Ki")
	public class57[] field1331 = new class57[4];

	@ObfuscatedName("client.Mi")
	public int[] field1332 = new int[33];

	@ObfuscatedName("client.Ni")
	public class41 field1333 = new class41();

	@ObfuscatedName("client.Qi")
	public int field1335 = 0x4D4233;

	@ObfuscatedName("client.Vi")
	public class41 field1340 = new class41();

	@ObfuscatedName("client.Yi")
	public boolean field1343 = false;

	@ObfuscatedName("client.Gc")
	public static final int[][] field1047 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Hc")
	public static int[] field1048 = new int[99];

	@ObfuscatedName("client.ge")
	public static int field1119 = 10;

	@ObfuscatedName("client.ie")
	public static boolean field1121 = true;

	@ObfuscatedName("client.bf")
	public static BigInteger field1161 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Sf")
	public static String field1197 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Jg")
	public static BigInteger field1240 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ti")
	public static final int[] field1316 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Pb")
	public int field1006;

	@ObfuscatedName("client.Qb")
	public int field1007;

	@ObfuscatedName("client.Rb")
	public int field1008;

	@ObfuscatedName("client.Sb")
	public int field1009;

	@ObfuscatedName("client.Tb")
	public int field1010;

	@ObfuscatedName("client.Ub")
	public int field1011;

	@ObfuscatedName("client.Vb")
	public int field1012;

	@ObfuscatedName("client.Wb")
	public int field1013;

	@ObfuscatedName("client.Zb")
	public int field1016;

	@ObfuscatedName("client.pc")
	public int field1031;

	@ObfuscatedName("client.vc")
	public int field1036;

	@ObfuscatedName("client.wc")
	public int field1037;

	@ObfuscatedName("client.xc")
	public int field1038;

	@ObfuscatedName("client.yc")
	public int field1039;

	@ObfuscatedName("client.Ic")
	public static int field1049;

	@ObfuscatedName("client.Jc")
	public static int field1050;

	@ObfuscatedName("client.Lc")
	public static int field1051;

	@ObfuscatedName("client.Nc")
	public int field1052;

	@ObfuscatedName("client.Oc")
	public int field1053;

	@ObfuscatedName("client.Pc")
	public int field1054;

	@ObfuscatedName("client.Qc")
	public int field1055;

	@ObfuscatedName("client.Rc")
	public int field1056;

	@ObfuscatedName("client.Tc")
	public int field1058;

	@ObfuscatedName("client.Vc")
	public int field1060;

	@ObfuscatedName("client.ad")
	public int field1065;

	@ObfuscatedName("client.id")
	public int field1073;

	@ObfuscatedName("client.kd")
	public int field1074;

	@ObfuscatedName("client.qd")
	public int field1079;

	@ObfuscatedName("client.rd")
	public int field1080;

	@ObfuscatedName("client.sd")
	public int field1081;

	@ObfuscatedName("client.vd")
	public int field1084;

	@ObfuscatedName("client.zd")
	public int field1088;

	@ObfuscatedName("client.Bd")
	public int field1090;

	@ObfuscatedName("client.Cd")
	public int field1091;

	@ObfuscatedName("client.Dd")
	public int field1092;

	@ObfuscatedName("client.Ed")
	public int field1093;

	@ObfuscatedName("client.Fd")
	public int field1094;

	@ObfuscatedName("client.Jd")
	public static int field1098;

	@ObfuscatedName("client.Kd")
	public int field1099;

	@ObfuscatedName("client.Sd")
	public int field1106;

	@ObfuscatedName("client.Xd")
	public int field1111;

	@ObfuscatedName("client.Yd")
	public int field1112;

	@ObfuscatedName("client.Zd")
	public int field1113;

	@ObfuscatedName("client.ae")
	public int field1114;

	@ObfuscatedName("client.be")
	public int field1115;

	@ObfuscatedName("client.ee")
	public static int field1117;

	@ObfuscatedName("client.fe")
	public int field1118;

	@ObfuscatedName("client.he")
	public static int field1120;

	@ObfuscatedName("client.pe")
	public static int field1127;

	@ObfuscatedName("client.ue")
	public static int field1132;

	@ObfuscatedName("client.we")
	public int field1134;

	@ObfuscatedName("client.Ce")
	public int field1140;

	@ObfuscatedName("client.Ee")
	public int field1142;

	@ObfuscatedName("client.Fe")
	public int field1143;

	@ObfuscatedName("client.Pe")
	public int field1150;

	@ObfuscatedName("client.Re")
	public int field1152;

	@ObfuscatedName("client.Se")
	public int field1153;

	@ObfuscatedName("client.Te")
	public int field1154;

	@ObfuscatedName("client.Ue")
	public int field1155;

	@ObfuscatedName("client.Ve")
	public int field1156;

	@ObfuscatedName("client.Ze")
	public int field1160;

	@ObfuscatedName("client.df")
	public static int field1163;

	@ObfuscatedName("client.ef")
	public int field1164;

	@ObfuscatedName("client.mf")
	public int field1169;

	@ObfuscatedName("client.nf")
	public int field1170;

	@ObfuscatedName("client.qf")
	public int field1173;

	@ObfuscatedName("client.xf")
	public int field1179;

	@ObfuscatedName("client.yf")
	public int field1180;

	@ObfuscatedName("client.zf")
	public int field1181;

	@ObfuscatedName("client.Cf")
	public int field1184;

	@ObfuscatedName("client.Ef")
	public static int field1185;

	@ObfuscatedName("client.Pf")
	public int field1195;

	@ObfuscatedName("client.Tf")
	public int field1198;

	@ObfuscatedName("client.Uf")
	public int field1199;

	@ObfuscatedName("client.Vf")
	public int field1200;

	@ObfuscatedName("client.Xf")
	public static int field1202;

	@ObfuscatedName("client.ag")
	public int field1205;

	@ObfuscatedName("client.bg")
	public int field1206;

	@ObfuscatedName("client.kg")
	public int field1215;

	@ObfuscatedName("client.mg")
	public int field1217;

	@ObfuscatedName("client.qg")
	public int field1221;

	@ObfuscatedName("client.sg")
	public int field1223;

	@ObfuscatedName("client.tg")
	public int field1224;

	@ObfuscatedName("client.xg")
	public int field1228;

	@ObfuscatedName("client.Eg")
	public static int field1235;

	@ObfuscatedName("client.Gg")
	public int field1237;

	@ObfuscatedName("client.Hg")
	public int field1238;

	@ObfuscatedName("client.Kg")
	public int field1241;

	@ObfuscatedName("client.Ng")
	public int field1244;

	@ObfuscatedName("client.Og")
	public int field1245;

	@ObfuscatedName("client.Pg")
	public int field1246;

	@ObfuscatedName("client.Qg")
	public int field1247;

	@ObfuscatedName("client.Ug")
	public static int field1249;

	@ObfuscatedName("client.Xg")
	public int field1252;

	@ObfuscatedName("client.Yg")
	public int field1253;

	@ObfuscatedName("client.Zg")
	public int field1254;

	@ObfuscatedName("client.ah")
	public int field1255;

	@ObfuscatedName("client.kh")
	public int field1264;

	@ObfuscatedName("client.mh")
	public int field1265;

	@ObfuscatedName("client.xh")
	public int field1272;

	@ObfuscatedName("client.yh")
	public int field1273;

	@ObfuscatedName("client.Bh")
	public int field1276;

	@ObfuscatedName("client.Dh")
	public static int field1278;

	@ObfuscatedName("client.Gh")
	public int field1281;

	@ObfuscatedName("client.Th")
	public int field1292;

	@ObfuscatedName("client.Uh")
	public int field1293;

	@ObfuscatedName("client.di")
	public int field1301;

	@ObfuscatedName("client.ei")
	public int field1302;

	@ObfuscatedName("client.fi")
	public int field1303;

	@ObfuscatedName("client.gi")
	public int field1304;

	@ObfuscatedName("client.hi")
	public int field1305;

	@ObfuscatedName("client.ki")
	public int field1308;

	@ObfuscatedName("client.pi")
	public int field1313;

	@ObfuscatedName("client.qi")
	public int field1314;

	@ObfuscatedName("client.Di")
	public int field1326;

	@ObfuscatedName("client.Ei")
	public int field1327;

	@ObfuscatedName("client.Fi")
	public int field1328;

	@ObfuscatedName("client.Gi")
	public int field1329;

	@ObfuscatedName("client.Pi")
	public int field1334;

	@ObfuscatedName("client.Ui")
	public int field1339;

	@ObfuscatedName("client.Zi")
	public static int field1344;

	@ObfuscatedName("client.I")
	public int field951;

	@ObfuscatedName("client.K")
	public int field953;

	@ObfuscatedName("client.L")
	public int field954;

	@ObfuscatedName("client.M")
	public int field955;

	@ObfuscatedName("client.P")
	public int field957;

	@ObfuscatedName("client.Q")
	public int field958;

	@ObfuscatedName("client.R")
	public int field959;

	@ObfuscatedName("client.S")
	public int field960;

	@ObfuscatedName("client.T")
	public int field961;

	@ObfuscatedName("client.Bb")
	public static int field992;

	@ObfuscatedName("client.Cb")
	public int field993;

	@ObfuscatedName("client.Db")
	public int field994;

	@ObfuscatedName("client.Eb")
	public int field995;

	@ObfuscatedName("client.md")
	public long field1075;

	@ObfuscatedName("client.kf")
	public long field1168;

	@ObfuscatedName("client.pf")
	public class18 field1172;

	@ObfuscatedName("client.Qh")
	public class26 field1290;

	@ObfuscatedName("client.Ac")
	public class34 field1041;

	@ObfuscatedName("client.Bc")
	public class34 field1042;

	@ObfuscatedName("client.Cc")
	public class34 field1043;

	@ObfuscatedName("client.Dc")
	public class34 field1044;

	@ObfuscatedName("client.nd")
	public class34 field1076;

	@ObfuscatedName("client.Od")
	public class34 field1103;

	@ObfuscatedName("client.Pd")
	public class34 field1104;

	@ObfuscatedName("client.cf")
	public class34 field1162;

	@ObfuscatedName("client.ri")
	public class34 field1315;

	@ObfuscatedName("client.Wi")
	public class34 field1341;

	@ObfuscatedName("client.Xi")
	public class34 field1342;

	@ObfuscatedName("client.Je")
	public class35 field1145;

	@ObfuscatedName("client.Ke")
	public class35 field1146;

	@ObfuscatedName("client.Le")
	public class35 field1147;

	@ObfuscatedName("client.Me")
	public class35 field1148;

	@ObfuscatedName("client.Ne")
	public class35 field1149;

	@ObfuscatedName("client.Ff")
	public class35 field1186;

	@ObfuscatedName("client.Gf")
	public class35 field1187;

	@ObfuscatedName("client.Hf")
	public class35 field1188;

	@ObfuscatedName("client.Jf")
	public class35 field1189;

	@ObfuscatedName("client.Kf")
	public class35 field1190;

	@ObfuscatedName("client.Lf")
	public class35 field1191;

	@ObfuscatedName("client.Mf")
	public class35 field1192;

	@ObfuscatedName("client.Nf")
	public class35 field1193;

	@ObfuscatedName("client.ug")
	public class35 field1225;

	@ObfuscatedName("client.vg")
	public class35 field1226;

	@ObfuscatedName("client.wg")
	public class35 field1227;

	@ObfuscatedName("client.Oh")
	public class35 field1288;

	@ObfuscatedName("client.Ph")
	public class35 field1289;

	@ObfuscatedName("client.Xh")
	public class35 field1296;

	@ObfuscatedName("client.Yh")
	public class35 field1297;

	@ObfuscatedName("client.qe")
	public class36 field1128;

	@ObfuscatedName("client.re")
	public class36 field1129;

	@ObfuscatedName("client.se")
	public class36 field1130;

	@ObfuscatedName("client.te")
	public class36 field1131;

	@ObfuscatedName("client.xe")
	public class43 field1135;

	@ObfuscatedName("client.ye")
	public class43 field1136;

	@ObfuscatedName("client.ze")
	public class43 field1137;

	@ObfuscatedName("client.yg")
	public class43 field1229;

	@ObfuscatedName("client.zg")
	public class43 field1230;

	@ObfuscatedName("client.Ag")
	public class43 field1231;

	@ObfuscatedName("client.Bg")
	public class43 field1232;

	@ObfuscatedName("client.ui")
	public class43 field1317;

	@ObfuscatedName("client.vi")
	public class43 field1318;

	@ObfuscatedName("client.wi")
	public class43 field1319;

	@ObfuscatedName("client.xi")
	public class43 field1320;

	@ObfuscatedName("client.yi")
	public class43 field1321;

	@ObfuscatedName("client.zi")
	public class43 field1322;

	@ObfuscatedName("client.Ai")
	public class43 field1323;

	@ObfuscatedName("client.Bi")
	public class43 field1324;

	@ObfuscatedName("client.Ci")
	public class43 field1325;

	@ObfuscatedName("client.V")
	public class43 field963;

	@ObfuscatedName("client.W")
	public class43 field964;

	@ObfuscatedName("client.X")
	public class43 field965;

	@ObfuscatedName("client.Y")
	public class43 field966;

	@ObfuscatedName("client.Z")
	public class43 field967;

	@ObfuscatedName("client.eg")
	public class46 field1209;

	@ObfuscatedName("client.Ah")
	public class4 field1275;

	@ObfuscatedName("client.ff")
	public String field1165;

	@ObfuscatedName("client.gf")
	public String field1166;

	@ObfuscatedName("client.Rg")
	public String field1248;

	@ObfuscatedName("client.je")
	public static boolean field1122;

	@ObfuscatedName("client.ai")
	public static boolean field1299;

	@ObfuscatedName("client.gd")
	public int[] field1071;

	@ObfuscatedName("client.Ud")
	public int[] field1108;

	@ObfuscatedName("client.Vd")
	public int[] field1109;

	@ObfuscatedName("client.sf")
	public int[] field1174;

	@ObfuscatedName("client.tf")
	public int[] field1175;

	@ObfuscatedName("client.uf")
	public int[] field1176;

	@ObfuscatedName("client.vf")
	public int[] field1177;

	@ObfuscatedName("client.dh")
	public int[] field1258;

	@ObfuscatedName("client.eh")
	public int[] field1259;

	@ObfuscatedName("client.Ri")
	public int[] field1336;

	@ObfuscatedName("client.Si")
	public int[] field1337;

	@ObfuscatedName("client.Ti")
	public int[] field1338;

	@ObfuscatedName("client.Eh")
	public class35[] field1279;

	@ObfuscatedName("client.oe")
	public byte[][] field1126;

	@ObfuscatedName("client.Yf")
	public byte[][] field1203;

	@ObfuscatedName("client.Rf")
	public byte[][][] field1196;

	@ObfuscatedName("client.Ob")
	public int[][][] field1005;

	@ObfuscatedName("client.a(IILhc;II)V")
	public final void method371(int arg0, int arg1, class60 arg2, int arg3) {
		if (arg2.field842 == 0 && arg2.field856 != null && (!arg2.field855 || field1079 == arg2.field840 || field1223 == arg2.field840 || field1272 == arg2.field840)) {
			int var5 = class32.field489;
			int var6 = class32.field487;
			int var7 = class32.field490;
			int var8 = class32.field488;
			class32.method148(arg1, arg2.field845 + arg1, arg2.field846 + arg3, arg3);
			int var9 = arg2.field856.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field857[var10] + arg1;
				int var12 = arg2.field858[var10] + arg3 - arg0;
				class60 var13 = class60.field835[arg2.field856[var10]];
				var11 += var13.field847;
				var12 += var13.field848;

				if (var13.field844 > 0) {
					method426(var13);
				}

				if (var13.field842 == 0) {
					if (var13.field854 > var13.field853 - var13.field846) {
						var13.field854 = var13.field853 - var13.field846;
					}

					if (var13.field854 < 0) {
						var13.field854 = 0;
					}

					method371(var13.field854, var11, var13, var12);

					if (var13.field853 > var13.field846) {
						method403(var13.field853, var12, var13.field846, var13.field854, var13.field845 + var11);
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
									if (var17 >= -32 && var17 <= 512 && var18 >= -32 && var18 <= 334 || field1011 != 0 && field1010 == var14) {
										class34 var22 = class55.method299(var21, var13.field837[var14]);
										if (field1011 != 0 && field1010 == var14 && field1009 == var13.field840) {
											var19 = field15 - field1012;
											var20 = field16 - field1013;

											if (var19 < 5 && var19 > -5) {
												var19 = 0;
											}

											if (var20 < 5 && var20 > -5) {
												var20 = 0;
											}

											if (field1008 < 5) {
												var19 = 0;
												var20 = 0;
											}

											var22.method179(var17 + var19, var18 + var20, 128);
										} else if (field1329 != 0 && field1328 == var14 && field1327 == var13.field840) {
											var22.method179(var17, var18, 128);
										} else {
											var22.method175(var18, var17);
										}

										if (var22.field522 == 33 || var13.field837[var14] != 1) {
											int var23 = var13.field837[var14];
											field1128.method194(var18 + var20 + 10, method408(var23), 0, var17 + var19 + 1);
											field1128.method194(var18 + var20 + 9, method408(var23), 0xFFFF00, var17 + var19);
										}
									}
								} else if (var13.field866 != null && var14 < 20) {
									class34 var24 = var13.field866[var14];
									if (var24 != null) {
										var24.method175(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field842 == 3) {
						if (var13.field870) {
							class32.method150(var12, var13.field845, var11, var13.field846, var13.field876);
						} else {
							class32.method151(var13.field845, var13.field846, var12, var11, var13.field876);
						}
					} else if (var13.field842 == 4) {
						class36 var25 = var13.field873;
						int var26 = var13.field876;
						String var27 = var13.field874;

						if ((field1272 == var13.field840 || field1223 == var13.field840 || field1079 == var13.field840) && var13.field878 != 0) {
							var26 = var13.field878;
						}

						if (method463(var13)) {
							var26 = var13.field877;

							if (var13.field875.length() > 0) {
								var27 = var13.field875;
							}
						}

						if (var13.field843 == 6 && field1295) {
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

									var27 = var27.substring(0, var29) + method460(method466(var13, 0)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method460(method466(var13, 1)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method460(method466(var13, 2)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method460(method466(var13, 3)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method460(method466(var13, 4)) + var27.substring(var33 + 2);
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
								var25.method192(var35, var13.field872, var26, var13.field845 / 2 + var11, var28);
							} else {
								var25.method196(var28, var11, var13.field872, var26, var35);
							}

							var28 += var25.field539;
						}
					} else if (var13.field842 == 5) {
						class34 var36;
						if (method463(var13)) {
							var36 = var13.field880;
						} else {
							var36 = var13.field879;
						}

						if (var36 != null) {
							var36.method175(var12, var11);
						}
					} else if (var13.field842 == 6) {
						int var37 = class33.field499;
						int var38 = class33.field500;
						class33.field499 = var13.field845 / 2 + var11;
						class33.field500 = var13.field846 / 2 + var12;
						int var39 = class33.field503[var13.field886] * var13.field885 >> 16;
						int var40 = class33.field504[var13.field886] * var13.field885 >> 16;
						boolean var41 = method463(var13);
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
										var50 = var50 + " x" + method398(var13.field837[var46]);
									}

									int var51 = (var13.field864 + 115) * var48 + var11;
									int var52 = (var13.field865 + 12) * var47 + var12;
									if (var13.field871) {
										var45.method192(var50, var13.field872, var13.field876, var13.field845 / 2 + var51, var52);
									} else {
										var45.method196(var52, var51, var13.field872, var13.field876, var50);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class32.method148(var5, var7, var8, var6);
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void method372(class37 arg0, int arg1) {
		arg0.method226();
		int var3 = arg0.method227(8);
		if (var3 < field1140) {
			for (int var4 = var3; var4 < field1140; var4++) {
				field1151[field1150++] = field1141[var4];
			}
		}

		if (var3 > field1140) {
			signlink.reporterror(field1095 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1140 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1141[var5];
			class25 var7 = field1139[var6];
			int var8 = arg0.method227(1);
			if (var8 == 0) {
				field1141[field1140++] = var6;
				var7.field314 = field1202;
			} else {
				int var9 = arg0.method227(2);
				if (var9 == 0) {
					field1141[field1140++] = var6;
					var7.field314 = field1202;
					field1218[field1217++] = var6;
				} else if (var9 == 1) {
					field1141[field1140++] = var6;
					var7.field314 = field1202;
					int var10 = arg0.method227(3);
					var7.method111(var10, false);
					int var11 = arg0.method227(1);
					if (var11 == 1) {
						field1218[field1217++] = var6;
					}
				} else if (var9 == 2) {
					field1141[field1140++] = var6;
					var7.field314 = field1202;
					int var12 = arg0.method227(3);
					var7.method111(var12, true);
					int var13 = arg0.method227(3);
					var7.method111(var13, true);
					int var14 = arg0.method227(1);
					if (var14 == 1) {
						field1218[field1217++] = var6;
					}
				} else if (var9 == 3) {
					field1151[field1150++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method373() {
		if (field1031 >= 2 || field1244 != 0 || field985 != 0) {
			String var1;
			if (field1244 == 1 && field1031 < 2) {
				var1 = "Use " + field1248 + " with...";
			} else if (field985 == 1 && field1031 < 2) {
				var1 = field988 + "...";
			} else {
				var1 = field1057[field1031 - 1];
			}

			if (field1031 > 2) {
				var1 = var1 + "@whi@ / " + (field1031 - 2) + " more options";
			}

			field1130.method197(15, 0xFFFFFF, var1, field1202 / 1000, true, 4);
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method374(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1060; var3++) {
				if (field1201[var3] == arg0) {
					field1060--;
					field962 = true;

					for (int var4 = var3; var4 < field1060; var4++) {
						field1067[var4] = field1067[var4 + 1];
						field1256[var4] = field1256[var4 + 1];
						field1201[var4] = field1201[var4 + 1];
					}

					field1266.method205(11);
					field1266.method212(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method375(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1125[var4] != null) {
				int var5 = field1123[var4];
				int var6 = field990 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1334 == 0 || field1334 == 1 && method470(field1124[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !field1124[var4].equals(field1290.field323)) {
						if (field1271) {
							field1057[field1031] = "Report abuse @whi@" + field1124[var4];
							field1284[field1031] = 34;
							field1031++;
						}

						field1057[field1031] = "Add ignore @whi@" + field1124[var4];
						field1284[field1031] = 436;
						field1031++;
						field1057[field1031] = "Add friend @whi@" + field1124[var4];
						field1284[field1031] = 406;
						field1031++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1241 == 0 && (var5 == 7 || field974 == 0 || field974 == 1 && method470(field1124[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1271) {
							field1057[field1031] = "Report abuse @whi@" + field1124[var4];
							field1284[field1031] = 34;
							field1031++;
						}

						field1057[field1031] = "Add ignore @whi@" + field1124[var4];
						field1284[field1031] = 436;
						field1031++;
						field1057[field1031] = "Add friend @whi@" + field1124[var4];
						field1284[field1031] = 406;
						field1031++;
					}

					var3++;
				}

				if (var5 == 4 && (field1099 == 0 || field1099 == 1 && method470(field1124[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1057[field1031] = "Accept trade @whi@" + field1124[var4];
						field1284[field1031] = 903;
						field1031++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1241 == 0 && field974 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1099 == 0 || field1099 == 1 && method470(field1124[var4]))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1057[field1031] = "Accept duel @whi@" + field1124[var4];
						field1284[field1031] = 363;
						field1031++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method376() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field1334 = (field1334 + 1) % 4;
				field1250 = true;
				field1034 = true;
				field1266.method205(244);
				field1266.method206(field1334);
				field1266.method206(field974);
				field1266.method206(field1099);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field974 = (field974 + 1) % 3;
				field1250 = true;
				field1034 = true;
				field1266.method205(244);
				field1266.method206(field1334);
				field1266.method206(field974);
				field1266.method206(field1099);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field1099 = (field1099 + 1) % 3;
				field1250 = true;
				field1034 = true;
				field1266.method205(244);
				field1266.method206(field1334);
				field1266.method206(field974);
				field1266.method206(field1099);
			}

			if (field18 >= 416 && field18 <= 516 && field19 >= 490 && field19 <= 522) {
				method422();
				field1133 = "";
				field1064 = false;

				for (int var1 = 0; var1 < class60.field835.length; var1++) {
					if (class60.field835[var1] != null && class60.field835[var1].field844 == 600) {
						field1291 = field979 = class60.field835[var1].field841;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method377(long arg0) {
		if (arg0 != 0L) {
			if (field1160 >= 100) {
				method379("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = class48.method262(class48.method259(arg0));
				for (int var4 = 0; var4 < field1160; var4++) {
					if (field1107[var4] == arg0) {
						method379(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1060; var5++) {
					if (field1201[var5] == arg0) {
						method379("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field1107[field1160++] = arg0;
				field962 = true;
				field1266.method205(79);
				field1266.method212(arg0);
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method378() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1089) {
			field1101 = false;
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

		if (field1061) {
			field1101 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1311) {
			field1101 = false;
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

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;I)V")
	public final void method379(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1306 != -1) {
			field1165 = arg0;
			field17 = 0;
		}

		if (field1045 == -1) {
			field1034 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1123[var4] = field1123[var4 - 1];
			field1124[var4] = field1124[var4 - 1];
			field1125[var4] = field1125[var4 - 1];
		}

		field1123[0] = arg2;
		field1124[0] = arg1;
		field1125[0] = arg0;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method380() {
		if (field1011 == 0) {
			field1057[0] = "Cancel";
			field1284[0] = 1252;
			field1031 = 1;
			method406(field16, field15);
			field994 = 0;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field979 == -1) {
					method438();
				} else {
					method459(8, 0, 11, field16, field15, class60.field835[field979]);
				}
			}

			if (field994 != field1079) {
				field1079 = field994;
			}

			field994 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field1298 != -1) {
					method459(562, 0, 231, field16, field15, class60.field835[field1298]);
				} else if (field978[field1100] != -1) {
					method459(562, 0, 231, field16, field15, class60.field835[field978[field1100]]);
				}
			}

			if (field994 != field1223) {
				field962 = true;
				field1223 = field994;
			}

			field994 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 431 && field16 < 471) {
				if (field1045 == -1) {
					method375(field15 - 22, field16 - 375);
				} else {
					method459(22, 0, 375, field16, field15, class60.field835[field1045]);
				}
			}

			if (field1045 != -1 && field994 != field1272) {
				field1034 = true;
				field1272 = field994;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1031 - 1; var2++) {
					if (field1284[var2] < 1000 && field1284[var2 + 1] > 1000) {
						String var3 = field1057[var2];
						field1057[var2] = field1057[var2 + 1];
						field1057[var2 + 1] = var3;
						int var4 = field1284[var2];
						field1284[var2] = field1284[var2 + 1];
						field1284[var2 + 1] = var4;
						int var5 = field1282[var2];
						field1282[var2] = field1282[var2 + 1];
						field1282[var2 + 1] = var5;
						int var6 = field1283[var2];
						field1283[var2] = field1283[var2 + 1];
						field1283[var2 + 1] = var6;
						int var7 = field1285[var2];
						field1285[var2] = field1285[var2 + 1];
						field1285[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method381() {
		byte[] var1 = field984.method257(null, "title.dat");
		class34 var2 = new class34(var1, this);
		field1320.method242();
		var2.method173(0, 0);
		field1321.method242();
		var2.method173(-661, 0);
		field1317.method242();
		var2.method173(-128, 0);
		field1318.method242();
		var2.method173(-214, -386);
		field1319.method242();
		var2.method173(-214, -186);
		field1322.method242();
		var2.method173(0, -265);
		field1323.method242();
		var2.method173(-574, -265);
		field1324.method242();
		var2.method173(-128, -186);
		field1325.method242();
		var2.method173(-574, -186);
		int[] var3 = new int[var2.field518];
		for (int var4 = 0; var4 < var2.field519; var4++) {
			for (int var5 = 0; var5 < var2.field518; var5++) {
				var3[var5] = var2.field517[var2.field518 * var4 + var2.field518 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field518; var6++) {
				var2.field517[var2.field518 * var4 + var6] = var3[var6];
			}
		}

		field1320.method242();
		var2.method173(394, 0);
		field1321.method242();
		var2.method173(-267, 0);
		field1317.method242();
		var2.method173(266, 0);
		field1318.method242();
		var2.method173(180, -386);
		field1319.method242();
		var2.method173(180, -186);
		field1322.method242();
		var2.method173(394, -265);
		field1323.method242();
		var2.method173(-180, -265);
		field1324.method242();
		var2.method173(212, -186);
		field1325.method242();
		var2.method173(-180, -186);
		class34 var7 = new class34(field984, "logo", 0);
		field1317.method242();
		var7.method175(18, field6 / 2 - var7.field518 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.c(B)V")
	public final void method382() {
		if (field1317 == null) {
			field9 = null;
			field1232 = null;
			field1230 = null;
			field1229 = null;
			field1231 = null;
			field1135 = null;
			field1136 = null;
			field1137 = null;
			field1320 = new class43(265, 128, method11());
			class32.method149();
			field1321 = new class43(265, 128, method11());
			class32.method149();
			field1317 = new class43(186, 533, method11());
			class32.method149();
			field1318 = new class43(146, 360, method11());
			class32.method149();
			field1319 = new class43(200, 360, method11());
			class32.method149();
			field1322 = new class43(267, 214, method11());
			class32.method149();
			field1323 = new class43(267, 215, method11());
			class32.method149();
			field1324 = new class43(79, 86, method11());
			class32.method149();
			field1325 = new class43(79, 87, method11());
			class32.method149();

			if (field984 != null) {
				method381();
				method458();
			}

			field1277 = true;
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method383(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.h(I)Z")
	public final boolean method384() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.b(II)V")
	public final void method385(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(BLhc;)Z")
	public final boolean method386(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 == 201) {
			field1034 = true;
			field980 = false;
			field1182 = true;
			field1046 = "";
			field1237 = 1;
			field1294 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1034 = true;
			field980 = false;
			field1182 = true;
			field1046 = "";
			field1237 = 2;
			field1294 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field961 = 250;
			return true;
		}

		if (var2 == 501) {
			field1034 = true;
			field980 = false;
			field1182 = true;
			field1046 = "";
			field1237 = 4;
			field1294 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1034 = true;
			field980 = false;
			field1182 = true;
			field1046 = "";
			field1237 = 5;
			field1294 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1267[var3];
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

					if (!class59.field828[var5].field834 && class59.field828[var5].field829 == var3 + (field1239 ? 0 : 7)) {
						break;
					}
				}

				field1267[var3] = var5;
				field1210 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field950[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1047[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1047[var6].length) {
					var8 = 0;
				}
			}

			field950[var6] = var8;
			field1210 = true;
		}

		if (var2 == 324 && !field1239) {
			field1239 = true;
			method461();
		}

		if (var2 == 325 && field1239) {
			field1239 = false;
			method461();
		}

		if (var2 == 326) {
			field1266.method205(52);
			field1266.method206(field1239 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1266.method206(field1267[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1266.method206(field950[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1064 = !field1064;
		}

		if (var2 >= 601 && var2 <= 612) {
			method422();

			if (field1133.length() > 0) {
				field1266.method205(190);
				field1266.method212(class48.method258(field1133));
				field1266.method206(var2 - 601);
				field1266.method206(field1064 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(ILkb;B)V")
	public final void method387(int arg0, class37 arg1) {
		arg1.method226();
		int var3 = arg1.method227(1);
		if (var3 != 0) {
			int var4 = arg1.method227(2);
			if (var4 == 0) {
				field1218[field1217++] = field1213;
			} else if (var4 == 1) {
				int var5 = arg1.method227(3);
				field1290.method111(var5, false);
				int var6 = arg1.method227(1);
				if (var6 == 1) {
					field1218[field1217++] = field1213;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method227(3);
				field1290.method111(var7, true);
				int var8 = arg1.method227(3);
				field1290.method111(var8, true);
				int var9 = arg1.method227(1);
				if (var9 == 1) {
					field1218[field1217++] = field1213;
				}
			} else if (var4 == 3) {
				field1080 = arg1.method227(2);
				int var10 = arg1.method227(7);
				int var11 = arg1.method227(7);
				int var12 = arg1.method227(1);
				field1290.method110(var10, var12 == 1, var11);
				int var13 = arg1.method227(1);
				if (var13 == 1) {
					field1218[field1217++] = field1213;
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

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1172.method78(arg3, arg1, arg0);
		if (var6 != 0) {
			int var7 = field1172.method82(arg3, arg1, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field1315.field517;
			int var12 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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
				class35 var15 = field952[var14.field724];
				if (var15 != null) {
					int var16 = (var14.field709 * 4 - var15.field526) / 2;
					int var17 = (var14.field710 * 4 - var15.field527) / 2;
					var15.method189((104 - arg0 - var14.field710) * 4 + var17 + 48, arg1 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field1172.method80(arg3, arg1, arg0);
		if (var18 != 0) {
			int var19 = field1172.method82(arg3, arg1, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class53 var23 = class53.method282(var22);
			if (var23.field724 != -1) {
				class35 var24 = field952[var23.field724];
				if (var24 != null) {
					int var25 = (var23.field709 * 4 - var24.field526) / 2;
					int var26 = (var23.field710 * 4 - var24.field527) / 2;
					var24.method189((104 - arg0 - var23.field710) * 4 + var26 + 48, arg1 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1315.field517;
				int var29 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field1172.method81(arg3, arg1, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class53 var32 = class53.method282(var31);
			if (var32.field724 != -1) {
				class35 var33 = field952[var32.field724];
				if (var33 != null) {
					int var34 = (var32.field709 * 4 - var33.field526) / 2;
					int var35 = (var32.field710 * 4 - var33.field527) / 2;
					var33.method189((104 - arg0 - var32.field710) * 4 + var35 + 48, arg1 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1275 != null) {
				field1275.method29();
			}
		} catch (Exception var1) {
		}

		field1275 = null;
		method390();
		field1268 = false;
		field1266 = null;
		field1208 = null;
		field1270 = null;
		field1071 = null;
		field1203 = null;
		field1126 = null;
		field1005 = null;
		field1196 = null;
		field1172 = null;
		field1331 = null;
		field1307 = null;
		field1220 = null;
		field1233 = null;
		field1234 = null;
		field1072 = null;
		field1229 = null;
		field1230 = null;
		field1231 = null;
		field1232 = null;
		field1135 = null;
		field1136 = null;
		field1137 = null;
		field963 = null;
		field964 = null;
		field965 = null;
		field966 = null;
		field967 = null;
		field968 = null;
		field969 = null;
		field970 = null;
		field971 = null;
		field972 = null;
		field1225 = null;
		field1226 = null;
		field1227 = null;
		field1186 = null;
		field1187 = null;
		field1188 = null;
		field989 = null;
		field1145 = null;
		field1146 = null;
		field1147 = null;
		field1148 = null;
		field1149 = null;
		field1189 = null;
		field1190 = null;
		field1191 = null;
		field1192 = null;
		field1193 = null;
		field1076 = null;
		field1280 = null;
		field1159 = null;
		field1069 = null;
		field1041 = null;
		field1042 = null;
		field1043 = null;
		field1044 = null;
		field952 = null;
		field1144 = null;
		field1269 = null;
		field1214 = null;
		field1216 = null;
		field1218 = null;
		field1219 = null;
		field1151 = null;
		field1139 = null;
		field1141 = null;
		field1262 = null;
		field1207 = null;
		field1340 = null;
		field1068 = null;
		field1014 = null;
		field1333 = null;
		field1282 = null;
		field1283 = null;
		field1284 = null;
		field1285 = null;
		field1057 = null;
		field1158 = null;
		field1309 = null;
		field1310 = null;
		field1243 = null;
		field1315 = null;
		field1067 = null;
		field1201 = null;
		field1256 = null;
		field1320 = null;
		field1321 = null;
		field1317 = null;
		field1318 = null;
		field1319 = null;
		field1322 = null;
		field1323 = null;
		field1324 = null;
		field1325 = null;
		method401();
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

	@ObfuscatedName("client.i(I)V")
	public final void method389() {
		method382();
		field1319.method242();
		field1296.method189(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1293 == 0) {
			int var3 = var2 / 2 - 20;
			field1130.method192("Welcome to RuneScape", true, 0xFFFF00, var1 / 2, var3);
			var3 += 30;
			int var4 = var1 / 2 - 80;
			int var5 = var2 / 2 + 20;
			field1297.method189(var5 - 20, var4 - 73);
			field1130.method192("New user", true, 0xFFFFFF, var4, var5 + 5);
			int var6 = var1 / 2 + 80;
			field1297.method189(var5 - 20, var6 - 73);
			field1130.method192("Existing User", true, 0xFFFFFF, var6, var5 + 5);
		}

		if (field1293 == 2) {
			int var7 = var2 / 2 - 40;
			if (field948.length() > 0) {
				field1130.method192(field948, true, 0xFFFF00, var1 / 2, var7 - 15);
				field1130.method192(field949, true, 0xFFFF00, var1 / 2, var7);
				var7 += 30;
			} else {
				field1130.method192(field949, true, 0xFFFF00, var1 / 2, var7 - 7);
				var7 += 30;
			}

			field1130.method196(var7, var1 / 2 - 90, true, 0xFFFFFF, "Username: " + field1095 + (field1088 == 0 & field1202 % 40 < 20 ? "@yel@|" : ""));
			var7 += 15;
			field1130.method196(var7, var1 / 2 - 88, true, 0xFFFFFF, "Password: " + class48.method264(field1096) + (field1088 == 1 & field1202 % 40 < 20 ? "@yel@|" : ""));
			var7 += 15;
			int var8 = var1 / 2 - 80;
			int var9 = var2 / 2 + 50;
			field1297.method189(var9 - 20, var8 - 73);
			field1130.method192("Login", true, 0xFFFFFF, var8, var9 + 5);
			int var10 = var1 / 2 + 80;
			field1297.method189(var9 - 20, var10 - 73);
			field1130.method192("Cancel", true, 0xFFFFFF, var10, var9 + 5);
		}

		if (field1293 == 3) {
			field1130.method192("Create a free account", true, 0xFFFF00, var1 / 2, var2 / 2 - 60);
			int var11 = var2 / 2 - 35;
			field1130.method192("To create a new account you need to", true, 0xFFFFFF, var1 / 2, var11);
			var11 += 15;
			field1130.method192("go back to the main RuneScape webpage", true, 0xFFFFFF, var1 / 2, var11);
			var11 += 15;
			field1130.method192("and choose the red 'create account'", true, 0xFFFFFF, var1 / 2, var11);
			var11 += 15;
			field1130.method192("button at the top right of that page.", true, 0xFFFFFF, var1 / 2, var11);
			var11 += 15;
			int var12 = var1 / 2;
			int var13 = var2 / 2 + 50;
			field1297.method189(var13 - 20, var12 - 73);
			field1130.method192("Cancel", true, 0xFFFFFF, var12, var13 + 5);
		}

		field1319.method243(field8, 186, 214);

		if (field1277) {
			field1277 = false;
			field1317.method243(field8, 0, 128);
			field1318.method243(field8, 386, 214);
			field1322.method243(field8, 265, 0);
			field1323.method243(field8, 265, 574);
			field1324.method243(field8, 186, 128);
			field1325.method243(field8, 186, 574);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method390() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.c(II)V")
	public final void method391(int arg0) {
		class60 var2 = class60.field835[arg0];
		for (int var3 = 0; var3 < var2.field856.length && var2.field856[var3] != -1; var3++) {
			class60 var4 = class60.field835[var2.field856[var3]];
			if (var4.field842 == 1) {
				method391(var4.field840);
			}

			var4.field838 = 0;
			var4.field839 = 0;
		}
	}

	@ObfuscatedName("client.a([BZZI)V")
	public final void method392(byte[] arg0, boolean arg1, int arg2) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg2);
	}

	@ObfuscatedName("client.j(I)Ljava/lang/String;")
	public final String method393() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method394(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method395() {
		short var1 = 256;

		if (field953 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field953 > 768) {
					field1174[var2] = method394(field1175[var2], field1176[var2], 1024 - field953);
				} else if (field953 > 256) {
					field1174[var2] = field1176[var2];
				} else {
					field1174[var2] = method394(field1176[var2], field1175[var2], 256 - field953);
				}
			}
		} else if (field954 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field954 > 768) {
					field1174[var3] = method394(field1175[var3], field1177[var3], 1024 - field954);
				} else if (field954 > 256) {
					field1174[var3] = field1177[var3];
				} else {
					field1174[var3] = method394(field1177[var3], field1175[var3], 256 - field954);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1174[var4] = field1175[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1320.field583[var5] = field1103.field517[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1070[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1108[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1174[var12];
					int var15 = field1320.field583[var7];
					field1320.field583[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1320.method243(field8, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1321.field583[var16] = field1104.field517[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1070[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1108[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1174[var23];
					int var26 = field1321.field583[var18];
					field1321.field583[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1321.method243(field8, 0, 661);
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method396() {
		for (int var1 = -1; var1 < field1215; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1213;
			} else {
				var2 = field1216[var1];
			}

			class26 var3 = field1214[var2];
			if (var3 != null) {
				method449(var3, 1);
			}
		}

		field1049++;
		if (field1049 > 1406) {
			field1049 = 0;
			field1266.method205(219);
			field1266.method206(0);
			int var4 = field1266.field543;
			field1266.method206(162);
			field1266.method206(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method206(84);
			}

			field1266.method207(31824);
			field1266.method207(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method206(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method206(134);
			}

			field1266.method206(100);
			field1266.method206(94);
			field1266.method207(35521);
			field1266.method215(field1266.field543 - var4);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method397() {
		method446();

		if (field1056 == 1) {
			field1069[field1055 / 100].method175(field1054 - 8 - 11, field1053 - 8 - 8);
		}

		if (field1056 == 2) {
			field1069[field1055 / 100 + 4].method175(field1054 - 8 - 11, field1053 - 8 - 8);
		}

		if (field979 != -1) {
			method476(field979, field1292);
			method371(0, 0, class60.field835[field979], 0);
		}

		method486();

		if (!field1167) {
			method380();
			method373();
		} else if (field1022 == 0) {
			method409();
		}

		if (field1281 == 1) {
			if (field983 > 0 || field1074 == 1) {
				field1159[1].method175(258, 472);
			} else {
				field1159[1].method175(296, 472);
			}
		}

		if (field983 > 0) {
			field1159[0].method175(296, 472);
			field1129.method191(484, 329, "Level: " + field983, 0xFFFF00);
		}

		if (field1074 == 1) {
			field1159[6].method175(296, 472);
			field1129.method191(484, 329, "Arena", 0xFFFF00);
		}

		if (field1264 != 0) {
			int var1 = field1264 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1129.method194(329, "System update in: " + var2 + ":0" + var1, 0xFFFF00, 4);
			} else {
				field1129.method194(329, "System update in: " + var2 + ":" + var1, 0xFFFF00, 4);
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method398(int arg0) {
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

	@ObfuscatedName("client.a(Lib;I)V")
	public final void method399(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1258.length; var3++) {
			field1258[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1258[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1259[var9] = (field1258[var9 - 1] + field1258[var9 + 1] + field1258[var9 - 128] + field1258[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1258;
			field1258 = field1259;
			field1259 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field527; var12++) {
				for (int var13 = 0; var13 < arg0.field526; var13++) {
					if (arg0.field524[var11++] != 0) {
						int var14 = var13 + arg0.field528 + 16;
						int var15 = var12 + arg0.field529 + 16;
						int var16 = (var15 << 7) + var14;
						field1258[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLkb;)V")
	public final void method400(int arg0, class37 arg1) {
		int var3 = arg1.method227(8);
		if (var3 < field1215) {
			for (int var4 = var3; var4 < field1215; var4++) {
				field1151[field1150++] = field1216[var4];
			}
		}

		if (var3 > field1215) {
			signlink.reporterror(field1095 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1215 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1216[var5];
			class26 var7 = field1214[var6];
			int var8 = arg1.method227(1);
			if (var8 == 0) {
				field1216[field1215++] = var6;
				var7.field314 = field1202;
			} else {
				int var9 = arg1.method227(2);
				if (var9 == 0) {
					field1216[field1215++] = var6;
					var7.field314 = field1202;
					field1218[field1217++] = var6;
				} else if (var9 == 1) {
					field1216[field1215++] = var6;
					var7.field314 = field1202;
					int var10 = arg1.method227(3);
					var7.method111(var10, false);
					int var11 = arg1.method227(1);
					if (var11 == 1) {
						field1218[field1217++] = var6;
					}
				} else if (var9 == 2) {
					field1216[field1215++] = var6;
					var7.field314 = field1202;
					int var12 = arg1.method227(3);
					var7.method111(var12, true);
					int var13 = arg1.method227(3);
					var7.method111(var13, true);
					int var14 = arg1.method227(1);
					if (var14 == 1) {
						field1218[field1217++] = var6;
					}
				} else if (var9 == 3) {
					field1151[field1150++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method401() {
		field1101 = false;
		while (field1062) {
			field1101 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1296 = null;
		field1297 = null;
		field1279 = null;
		field1174 = null;
		field1175 = null;
		field1176 = null;
		field1177 = null;
		field1258 = null;
		field1259 = null;
		field1108 = null;
		field1109 = null;
		field1103 = null;
		field1104 = null;
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (!field1122) {
			field1330 = true;
			field1268 = true;
			method12(this, 2);
			method485("scape_main", 40000, 12345678);
		}

		if (field1299) {
			field1311 = true;
		} else {
			field1299 = true;
			boolean var1 = false;
			String var2 = method393();
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
					field1236[8] = 0;
					while (field1236[8] == 0) {
						method13("Connecting to fileserver", 10);

						try {
							DataInputStream var4 = method435("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[36]);
							var4.readFully(var5.field542, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								field1236[var6] = var5.method221();
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

					field984 = method477("title", 10, field1236[1], "title screen");
					field1128 = new class36(field984, "p11");
					field1129 = new class36(field984, "p12");
					field1130 = new class36(field984, "b12");
					field1131 = new class36(field984, "q8");
					method381();
					method458();
					class47 var8 = method477("config", 15, field1236[2], "config");
					class47 var9 = method477("interface", 20, field1236[3], "interface");
					class47 var10 = method477("media", 30, field1236[4], "2d graphics");
					class47 var11 = method477("models", 40, field1236[5], "3d graphics");
					class47 var12 = method477("textures", 60, field1236[6], "textures");
					class47 var13 = method477("wordenc", 65, field1236[7], "chat system");
					class47 var14 = method477("sounds", 70, field1236[8], "sound effects");
					field1196 = new byte[4][104][104];
					field1005 = new int[4][105][105];
					field1172 = new class18(4, 104, field1005, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1331[var15] = new class57(104, 104);
					}

					field1315 = new class34(512, 512);
					method13("Unpacking media", 75);
					field1225 = new class35(var10, "invback", 0);
					field1227 = new class35(var10, "chatback", 0);
					field1226 = new class35(var10, "mapback", 0);
					field1186 = new class35(var10, "backbase1", 0);
					field1187 = new class35(var10, "backbase2", 0);
					field1188 = new class35(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						field989[var16] = new class35(var10, "sideicons", var16);
					}

					field1076 = new class34(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							field952[var17] = new class35(var10, "mapscene", var17);
						}
					} catch (Exception var58) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							field1144[var18] = new class34(var10, "mapfunction", var18);
						}
					} catch (Exception var57) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							field1280[var19] = new class34(var10, "hitmarks", var19);
						}
					} catch (Exception var56) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							field1159[var20] = new class34(var10, "headicons", var20);
						}
					} catch (Exception var55) {
					}

					field1162 = new class34(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						field1069[var21] = new class34(var10, "cross", var21);
					}

					field1041 = new class34(var10, "mapdots", 0);
					field1042 = new class34(var10, "mapdots", 1);
					field1043 = new class34(var10, "mapdots", 2);
					field1044 = new class34(var10, "mapdots", 3);
					field1288 = new class35(var10, "scrollbar", 0);
					field1289 = new class35(var10, "scrollbar", 1);
					field1145 = new class35(var10, "redstone1", 0);
					field1146 = new class35(var10, "redstone2", 0);
					field1147 = new class35(var10, "redstone3", 0);
					field1148 = new class35(var10, "redstone1", 0);
					field1148.method186();
					field1149 = new class35(var10, "redstone2", 0);
					field1149.method186();
					field1189 = new class35(var10, "redstone1", 0);
					field1189.method187();
					field1190 = new class35(var10, "redstone2", 0);
					field1190.method187();
					field1191 = new class35(var10, "redstone3", 0);
					field1191.method187();
					field1192 = new class35(var10, "redstone1", 0);
					field1192.method186();
					field1192.method187();
					field1193 = new class35(var10, "redstone2", 0);
					field1193.method186();
					field1193.method187();
					class34 var22 = new class34(var10, "backleft1", 0);
					field963 = new class43(var22.field519, var22.field518, method11());
					var22.method173(0, 0);
					class34 var23 = new class34(var10, "backleft2", 0);
					field964 = new class43(var23.field519, var23.field518, method11());
					var23.method173(0, 0);
					class34 var24 = new class34(var10, "backright1", 0);
					field965 = new class43(var24.field519, var24.field518, method11());
					var24.method173(0, 0);
					class34 var25 = new class34(var10, "backright2", 0);
					field966 = new class43(var25.field519, var25.field518, method11());
					var25.method173(0, 0);
					class34 var26 = new class34(var10, "backtop1", 0);
					field967 = new class43(var26.field519, var26.field518, method11());
					var26.method173(0, 0);
					class34 var27 = new class34(var10, "backtop2", 0);
					field968 = new class43(var27.field519, var27.field518, method11());
					var27.method173(0, 0);
					class34 var28 = new class34(var10, "backvmid1", 0);
					field969 = new class43(var28.field519, var28.field518, method11());
					var28.method173(0, 0);
					class34 var29 = new class34(var10, "backvmid2", 0);
					field970 = new class43(var29.field519, var29.field518, method11());
					var29.method173(0, 0);
					class34 var30 = new class34(var10, "backvmid3", 0);
					field971 = new class43(var30.field519, var30.field518, method11());
					var30.method173(0, 0);
					class34 var31 = new class34(var10, "backhmid2", 0);
					field972 = new class43(var31.field519, var31.field518, method11());
					var31.method173(0, 0);
					int var32 = (int) (Math.random() * 21.0D) - 10;
					int var33 = (int) (Math.random() * 21.0D) - 10;
					int var34 = (int) (Math.random() * 21.0D) - 10;
					int var35 = (int) (Math.random() * 41.0D) - 20;
					for (int var36 = 0; var36 < 50; var36++) {
						if (field1144[var36] != null) {
							field1144[var36].method172(var34 + var35, var33 + var35, var32 + var35);
						}

						if (field952[var36] != null) {
							field952[var36].method188(var34 + var35, var33 + var35, var32 + var35);
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
					class55.field770 = field1121;

					if (!field1122) {
						method13("Unpacking sounds", 90);
						byte[] var37 = var14.method257(null, "sounds.dat");
						class37 var38 = new class37(var37);
						class51.method270(var38);
					}

					method13("Unpacking interfaces", 92);
					class36[] var39 = new class36[] { field1128, field1129, field1130, field1131 };
					class60.method322(var10, var9, var39);
					method13("Preparing game engine", 97);

					for (int var40 = 0; var40 < 33; var40++) {
						int var41 = 999;
						int var42 = 0;
						for (int var43 = 0; var43 < 35; var43++) {
							if (field1226.field524[field1226.field526 * var40 + var43] == 0) {
								if (var41 == 999) {
									var41 = var43;
								}
							} else if (var41 != 999) {
								var42 = var43;
								break;
							}
						}

						field1263[var40] = var41;
						field1332[var40] = var42 - var41;
					}

					for (int var44 = 9; var44 < 160; var44++) {
						int var45 = 999;
						int var46 = 0;
						for (int var47 = 10; var47 < 168; var47++) {
							if (field1226.field524[field1226.field526 * var44 + var47] == 0 && (var47 > 34 || var44 > 34)) {
								if (var45 == 999) {
									var45 = var47;
								}
							} else if (var45 != 999) {
								var46 = var47;
								break;
							}
						}

						field1312[var44 - 9] = var45 - 21;
						field1040[var44 - 9] = var46 - var45;
					}

					class33.method156(479, 96);
					field1336 = class33.field505;
					class33.method156(190, 261);
					field1337 = class33.field505;
					class33.method156(512, 334);
					field1338 = class33.field505;
					int[] var48 = new int[9];
					for (int var49 = 0; var49 < 9; var49++) {
						int var50 = var49 * 32 + 128 + 15;
						int var51 = var50 * 3 + 600;
						int var52 = class33.field503[var50];
						var48[var49] = var51 * var52 >> 16;
					}

					class18.method88(512, 334, 500, var48, 800);
					class65.method333(var13);
				} catch (Exception var60) {
					field1089 = true;
				}
			} else {
				field1061 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
			if (field1122 && field1080 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field1172.method78(arg5, arg6, arg0);
			}

			if (arg1 == 1) {
				var8 = field1172.method79(arg6, arg5, arg0);
			}

			if (arg1 == 2) {
				var8 = field1172.method80(arg5, arg6, arg0);
			}

			if (arg1 == 3) {
				var8 = field1172.method81(arg5, arg6, arg0);
			}

			if (var8 != 0) {
				int var12 = field1172.method82(arg5, arg6, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field1172.method73(arg6, arg5, arg0);
					class53 var16 = class53.method282(var13);
					if (var16.field711) {
						field1331[arg5].method307(arg6, var14, arg0, var16.field712, var15);
					}
				}

				if (arg1 == 1) {
					field1172.method74(arg0, arg6, arg5);
				}

				if (arg1 == 2) {
					field1172.method75(arg5, arg0, arg6);
					class53 var17 = class53.method282(var13);
					if (var17.field709 + arg6 > 103 || var17.field709 + arg0 > 103 || var17.field710 + arg6 > 103 || var17.field710 + arg0 > 103) {
						return;
					}

					if (var17.field711) {
						field1331[arg5].method308(var15, var17.field712, arg6, arg0, var17.field709, var17.field710);
					}
				}

				if (arg1 == 3) {
					field1172.method76(arg0, arg5, arg6);
					class53 var18 = class53.method282(var13);
					if (var18.field711 && var18.field713) {
						field1331[arg5].method310(arg0, arg6);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field1196[1][arg6][arg0] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				class3.method28(arg5, arg3, arg6, arg4, var19, arg0, field1331[arg5], field1172, arg2, field1333, field1005);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1288.method189(arg1, arg4);
		field1289.method189(arg1 + arg2 - 16, arg4);
		class32.method150(arg1 + 16, 16, arg4, arg2 - 32, field1110);
		int var6 = (arg2 - 32) * arg2 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg3 / (arg0 - arg2);
		class32.method150(arg1 + var7 + 16, 16, arg4, var6, field1335);
		class32.method153(var6, arg1 + var7 + 16, arg4, field1157);
		class32.method153(var6, arg1 + var7 + 16, arg4 + 1, field1157);
		class32.method152(arg1 + var7 + 16, field1157, 16, arg4);
		class32.method152(arg1 + var7 + 17, field1157, 16, arg4);
		class32.method153(var6, arg1 + var7 + 16, arg4 + 15, field1116);
		class32.method153(var6 - 1, arg1 + 17 + var7, arg4 + 14, field1116);
		class32.method152(arg1 + var7 + var6 + 15, field1116, 16, arg4);
		class32.method152(arg1 + var7 + var6 + 14, field1116, 15, arg4 + 1);
	}

	@ObfuscatedName("client.e(II)V")
	public final void method404(int arg0) {
		int[] var2 = field1315.field517;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1196[arg0][var7][var5] & 0x18) == 0) {
					field1172.method87(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1196[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1172.method87(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1315.method171();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1196[arg0][var11][var10] & 0x18) == 0) {
					method388(var10, var11, var8, arg0, var9);
				}

				if (arg0 < 3 && (field1196[arg0 + 1][var11][var10] & 0x8) != 0) {
					method388(var10, var11, var8, arg0 + 1, var9);
				}
			}
		}

		field1231.method242();
		field1308 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1172.method81(field1080, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class53.method282(var14).field723;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1331[field1080].field813;
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

						field1243[field1308] = field1144[var15];
						field1309[field1308] = var16;
						field1310[field1308] = var17;
						field1308++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method9() {
		if (field1311 || field1089 || field1061) {
			method378();
		} else {
			if (field1032) {
				method455();
			} else {
				method389();
			}

			field1205 = 0;
		}
	}

	@ObfuscatedName("client.a(IIBIIII)V")
	public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = class31.field480[var7];
			int var13 = class31.field481[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field480[var8];
			int var16 = class31.field481[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1152 = arg1 - var9;
		field1153 = arg3 - var10;
		field1154 = arg4 - var11;
		field1155 = arg5;
		field1156 = arg2;
	}

	@ObfuscatedName("client.a(BII)V")
	public final void method406(int arg0, int arg1) {
		if (field1241 != 0) {
			int var3 = 0;
			if (field1264 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field1125[var4] != null) {
					int var5 = field1123[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field974 == 0 || field974 == 1 && method470(field1124[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field15 > 8 && field15 < 520 && arg0 - 11 > var6 - 10 && arg0 - 11 <= var6 + 3) {
							if (field1271) {
								field1057[field1031] = "Report abuse @whi@" + field1124[var4];
								field1284[field1031] = 2034;
								field1031++;
							}

							field1057[field1031] = "Add ignore @whi@" + field1124[var4];
							field1284[field1031] = 2436;
							field1031++;
							field1057[field1031] = "Add friend @whi@" + field1124[var4];
							field1284[field1031] = 2406;
							field1031++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field974 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method407(int arg0) {
		if (!field1122) {
			if (class33.field513[17] >= arg0) {
				class35 var2 = class33.field507[17];
				int var3 = var2.field527 * var2.field526 - 1;
				int var4 = field1292 * var2.field526 * 2;
				byte[] var5 = var2.field524;
				byte[] var6 = field1072;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field524 = var6;
				field1072 = var5;
				class33.method161(17);
			}

			if (class33.field513[24] >= arg0) {
				class35 var8 = class33.field507[24];
				int var9 = var8.field527 * var8.field526 - 1;
				int var10 = field1292 * var8.field526 * 2;
				byte[] var11 = var8.field524;
				byte[] var12 = field1072;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field524 = var12;
				field1072 = var11;
				class33.method161(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method408(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.l(I)V")
	public final void method409() {
		int var1 = field1023;
		int var2 = field1024;
		int var3 = field1025;
		int var4 = field1026;
		int var5 = 0x5D5447;
		class32.method150(var2, var3, var1, var4, var5);
		class32.method150(var2 + 1, var3 - 2, var1 + 1, 16, 0);
		class32.method151(var3 - 2, var4 - 19, var2 + 18, var1 + 1, 0);
		field1130.method194(var2 + 14, "Choose Option", var5, var1 + 3);
		int var6 = field15;
		int var7 = field16;
		if (field1022 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1022 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field1022 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field1031; var8++) {
			int var9 = (field1031 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1130.method196(var9, var1 + 3, true, var10, field1057[var8]);
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method410() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1108[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1108[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1109[var10] = (field1108[var10 - 1] + field1108[var10 + 1] + field1108[var10 - 128] + field1108[var10 + 128]) / 4;
			}
		}

		field951 += 128;
		if (field951 > field1258.length) {
			field951 -= field1258.length;
			int var11 = (int) (Math.random() * 12.0D);
			method399(field1279[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1109[var14 + 128] - field1258[field951 + var14 & field1258.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1108[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1070[var16] = field1070[var16 + 1];
		}

		field1070[var1 - 1] = (int) (Math.sin(field1202 / 14.0D) * 16.0D + Math.sin(field1202 / 15.0D) * 14.0D + Math.sin(field1202 / 16.0D) * 12.0D);

		if (field953 > 0) {
			field953 -= 4;
		}

		if (field954 > 0) {
			field954 -= 4;
		}

		if (field953 == 0 && field954 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field953 = 1024;
			}

			if (var17 == 1) {
				field954 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method411() {
		int var1 = field1290.field270 + field1170;
		int var2 = field1290.field271 + field1273;
		if (field1019 - var1 < -500 || field1019 - var1 > 500 || field1020 - var2 < -500 || field1020 - var2 > 500) {
			field1019 = var1;
			field1020 = var2;
		}

		if (field1019 != var1) {
			field1019 += (var1 - field1019) / 16;
		}

		if (field1020 != var2) {
			field1020 += (var2 - field1020) / 16;
		}

		if (field20[1] == 1) {
			field1180 += (-field1180 - 24) / 2;
		} else if (field20[2] == 1) {
			field1180 += (24 - field1180) / 2;
		} else {
			field1180 /= 2;
		}

		if (field20[3] == 1) {
			field1181 += (12 - field1181) / 2;
		} else if (field20[4] == 1) {
			field1181 += (-field1181 - 12) / 2;
		} else {
			field1181 /= 2;
		}

		field1179 = field1180 / 2 + field1179 & 0x7FF;
		field1178 += field1181 / 2;
		if (field1178 < 128) {
			field1178 = 128;
		}

		if (field1178 > 383) {
			field1178 = 383;
		}

		int var3 = field1019 >> 7;
		int var4 = field1020 >> 7;
		int var5 = method495(field1020, field1080, field1019);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1080;
					if (var9 < 3 && (field1196[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field1005[var9][var7][var8];
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

		if (var11 > field1164) {
			field1164 += (var11 - field1164) / 24;
		} else if (var11 < field1164) {
			field1164 += (var11 - field1164) / 80;
		}
	}

	@ObfuscatedName("client.a(IZIILbc;)V")
	public final void method412(int arg0, int arg1, int arg2, class54 arg3) {
		if (field1031 < 400) {
			String var5 = arg3.field743;
			if (arg3.field761 != 0) {
				var5 = var5 + method462(field1290.field329, arg3.field761) + " (level-" + arg3.field761 + ")";
			}

			if (field1244 == 1) {
				field1057[field1031] = "Use " + field1248 + " with @yel@" + var5;
				field1284[field1031] = 900;
				field1285[field1031] = arg1;
				field1282[field1031] = arg2;
				field1283[field1031] = arg0;
				field1031++;
			} else if (field985 != 1) {
				if (arg3.field756 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg3.field756[var6] != null && !arg3.field756[var6].equalsIgnoreCase("attack")) {
							field1057[field1031] = arg3.field756[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1284[field1031] = 728;
							}

							if (var6 == 1) {
								field1284[field1031] = 542;
							}

							if (var6 == 2) {
								field1284[field1031] = 6;
							}

							if (var6 == 3) {
								field1284[field1031] = 963;
							}

							if (var6 == 4) {
								field1284[field1031] = 245;
							}

							field1285[field1031] = arg1;
							field1282[field1031] = arg2;
							field1283[field1031] = arg0;
							field1031++;
						}
					}
				}

				if (arg3.field756 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg3.field756[var7] != null && arg3.field756[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg3.field761 > field1290.field329) {
								var8 = 2000;
							}

							field1057[field1031] = arg3.field756[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1284[field1031] = var8 + 728;
							}

							if (var7 == 1) {
								field1284[field1031] = var8 + 542;
							}

							if (var7 == 2) {
								field1284[field1031] = var8 + 6;
							}

							if (var7 == 3) {
								field1284[field1031] = var8 + 963;
							}

							if (var7 == 4) {
								field1284[field1031] = var8 + 245;
							}

							field1285[field1031] = arg1;
							field1282[field1031] = arg2;
							field1283[field1031] = arg0;
							field1031++;
						}
					}
				}

				field1057[field1031] = "Examine @yel@" + var5;
				field1284[field1031] = 1607;
				field1285[field1031] = arg1;
				field1282[field1031] = arg2;
				field1283[field1031] = arg0;
				field1031++;
			} else if ((field987 & 0x2) == 2) {
				field1057[field1031] = field988 + " @yel@" + var5;
				field1284[field1031] = 265;
				field1285[field1031] = arg1;
				field1282[field1031] = arg2;
				field1283[field1031] = arg0;
				field1031++;
				return;
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method413() {
		field1230.method242();
		int var1 = field1221 + field1179 & 0x7FF;
		int var2 = field1290.field270 / 32 + 48;
		int var3 = 464 - field1290.field271 / 32;
		field1315.method181(var1, var2, 21, var3, field1040, field1065 + 256, 151, 146, 9, field1312);
		field1076.method181(field1179, 25, 0, 25, field1332, 256, 33, 33, 0, field1263);

		for (int var4 = 0; var4 < field1308; var4++) {
			int var5 = field1309[var4] * 4 + 2 - field1290.field270 / 32;
			int var6 = field1310[var4] * 4 + 2 - field1290.field271 / 32;
			method427(field1243[var4], var5, var6);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class41 var9 = field1262[field1080][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1290.field270 / 32;
					int var11 = var8 * 4 + 2 - field1290.field271 / 32;
					method427(field1041, var10, var11);
				}
			}
		}

		for (int var12 = 0; var12 < field1140; var12++) {
			class25 var13 = field1139[field1141[var12]];
			if (var13 != null && var13.method112() && var13.field322.field760) {
				int var14 = var13.field270 / 32 - field1290.field270 / 32;
				int var15 = var13.field271 / 32 - field1290.field271 / 32;
				method427(field1042, var14, var15);
			}
		}

		for (int var16 = 0; var16 < field1215; var16++) {
			class26 var17 = field1214[field1216[var16]];
			if (var17 != null && var17.method112()) {
				int var18 = var17.field270 / 32 - field1290.field270 / 32;
				int var19 = var17.field271 / 32 - field1290.field271 / 32;
				boolean var20 = false;
				long var21 = class48.method258(var17.field323);
				for (int var23 = 0; var23 < field1060; var23++) {
					if (field1201[var23] == var21 && field1256[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method427(field1044, var18, var19);
				} else {
					method427(field1043, var18, var19);
				}
			}
		}

		if (field1313 != 0) {
			int var24 = field1313 * 4 + 2 - field1290.field270 / 32;
			int var25 = field1314 * 4 + 2 - field1290.field271 / 32;
			method427(field1162, var24, var25);
		}

		class32.method150(82, 3, 93, 3, 0xFFFFFF);
		field1231.method242();
	}

	@ObfuscatedName("client.i(Z)Z")
	public final boolean method414() {
		if (field1275 == null) {
			return false;
		}

		try {
			int var1 = field1275.method31();
			if (var1 == 0) {
				return false;
			}

			if (field958 == -1) {
				field1275.method32(field1270.field542, 0, 1);
				field958 = field1270.field542[0] & 0xFF;
				if (field1209 != null) {
					field958 = field958 - field1209.method253() & 0xFF;
				}

				field957 = class56.field808[field958];
				var1--;
			}

			if (field957 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1275.method32(field1270.field542, 0, 1);
				field957 = field1270.field542[0] & 0xFF;
				var1--;
			}

			if (field957 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1275.method32(field1270.field542, 0, 2);
				field1270.field543 = 0;
				field957 = field1270.method218();
				var1 -= 2;
			}

			if (var1 < field957) {
				return false;
			}

			field1270.field543 = 0;
			field1275.method32(field1270.field542, 0, field957);
			field959 = 0;
			field1200 = field1199;
			field1199 = field1198;
			field1198 = field958;

			if (field958 == 1) {
				method437(field957, field1270);
				field958 = -1;
				return true;
			}

			if (field958 == 195) {
				int var2 = field1270.method218();
				method391(var2);

				if (field1045 != -1) {
					field1045 = -1;
					field1034 = true;
				}

				if (field980) {
					field980 = false;
					field1034 = true;
				}

				field1298 = var2;
				field962 = true;
				field1211 = true;
				field979 = -1;
				field1295 = false;
				field958 = -1;
				return true;
			}

			if (field958 == 103) {
				int var3 = field1270.method218();
				int var4 = field1270.method218();
				int var5 = field1270.method218();
				class60 var6 = class60.field835[var3];
				class31 var7 = var6.field881;
				if (var7 != null) {
					var7.method134(var4, var5);
				}

				field958 = -1;
				return true;
			}

			if (field958 == 151 || field958 == 23 || field958 == 50 || field958 == 191 || field958 == 69 || field958 == 49 || field958 == 223 || field958 == 42 || field958 == 76 || field958 == 59) {
				method496(field1270, field958);
				field958 = -1;
				return true;
			}

			if (field958 == 197) {
				int var8 = field1270.method218();
				class60.field835[var8].field881 = field1290.method116();
				field958 = -1;
				return true;
			}

			if (field958 == 87) {
				int var9 = field1270.method218();
				int var10 = field1270.method218();
				class60.field835[var9].field881 = new class31(var10);
				field958 = -1;
				return true;
			}

			if (field958 == 41) {
				long var11 = field1270.method222();
				int var13 = field1270.method221();
				int var14 = field1270.method216();
				boolean var15 = false;
				for (int var16 = 0; var16 < 100; var16++) {
					if (field1087[var16] == var13) {
						var15 = true;
						break;
					}
				}

				if (var14 <= 1) {
					for (int var17 = 0; var17 < field1160; var17++) {
						if (field1107[var17] == var11) {
							var15 = true;
							break;
						}
					}
				}

				if (!var15 && field1029 == 0) {
					try {
						field1087[field993] = var13;
						field993 = (field993 + 1) % 100;
						String var18 = class49.method265(field1270, field957 - 13);
						var18 = class65.method343(var18);
						if (var14 > 1) {
							method379(var18, class48.method262(class48.method259(var11)), 7);
						} else {
							method379(var18, class48.method262(class48.method259(var11)), 3);
						}
					} catch (Exception var180) {
						signlink.reporterror("cde1");
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 4) {
				String var20 = field1270.method223();
				if (var20.endsWith(":tradereq:")) {
					String var21 = var20.substring(0, var20.indexOf(":"));
					long var22 = class48.method258(var21);
					boolean var24 = false;
					for (int var25 = 0; var25 < field1160; var25++) {
						if (field1107[var25] == var22) {
							var24 = true;
							break;
						}
					}

					if (!var24 && field1029 == 0) {
						method379("wishes to trade with you.", var21, 4);
					}
				} else if (var20.endsWith(":duelreq:")) {
					String var26 = var20.substring(0, var20.indexOf(":"));
					long var27 = class48.method258(var26);
					boolean var29 = false;
					for (int var30 = 0; var30 < field1160; var30++) {
						if (field1107[var30] == var27) {
							var29 = true;
							break;
						}
					}

					if (!var29 && field1029 == 0) {
						method379("wishes to duel with you.", var26, 8);
					}
				} else {
					method379(var20, "", 0);
				}

				field958 = -1;
				return true;
			}

			if (field958 == 28) {
				int var31 = field1270.method218();
				int var32 = field1270.method218();

				if (field1045 != -1) {
					field1045 = -1;
					field1034 = true;
				}

				if (field980) {
					field980 = false;
					field1034 = true;
				}

				field979 = var31;
				field1298 = var32;
				field962 = true;
				field1211 = true;
				field1295 = false;
				field958 = -1;
				return true;
			}

			if (field958 == 3) {
				field1097 = true;
				field1301 = field1270.method216();
				field1302 = field1270.method216();
				field1303 = field1270.method218();
				field1304 = field1270.method216();
				field1305 = field1270.method216();
				if (field1305 >= 100) {
					field1152 = field1301 * 128 + 64;
					field1154 = field1302 * 128 + 64;
					field1153 = method495(field1302, field1080, field1301) - field1303;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 226) {
				class5.method34();
				field958 = -1;
				return true;
			}

			if (field958 == 7) {
				field1142 = field1270.method216();
				field1143 = field1270.method216();
				field958 = -1;
				return true;
			}

			if (field958 == 129) {
				if (field1298 != -1) {
					field1298 = -1;
					field962 = true;
					field1211 = true;
				}

				if (field1045 != -1) {
					field1045 = -1;
					field1034 = true;
				}

				if (field980) {
					field980 = false;
					field1034 = true;
				}

				field979 = -1;
				field1295 = false;
				field958 = -1;
				return true;
			}

			if (field958 == 20) {
				int var33 = field1270.method216();
				int var34 = field1270.method216();
				int var35 = -1;
				for (int var36 = 0; var36 < field1071.length; var36++) {
					if ((var33 << 8) + var34 == field1071[var36]) {
						var35 = var36;
					}
				}

				if (var35 != -1) {
					signlink.cachesave("l" + var33 + "_" + var34, field1126[var35]);
					field1073 = 1;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 44) {
				field962 = true;
				int var37 = field1270.method216();
				int var38 = field1270.method221();
				int var39 = field1270.method216();
				field1242[var37] = var38;
				field1183[var37] = var39;
				field973[var37] = 1;
				for (int var40 = 0; var40 < 98; var40++) {
					if (var38 >= field1048[var40]) {
						field973[var37] = var40 + 2;
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 212) {
				if (field1105 && !field1122) {
					int var41 = field1270.method218();
					int var42 = field1270.method221();
					int var43 = field957 - 6;
					byte[] var44 = new byte[var42];
					class44.method245(var44, var42, field1270.field542, var43, field1270.field543);
					method392(var44, false, var42);
					field975 = var41;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 126) {
				field1287 = field1270.method216();
				if (field1287 == field1100) {
					if (field1287 == 3) {
						field1100 = 1;
					} else {
						field1100 = 3;
					}

					field962 = true;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 243) {
				field1182 = false;
				field980 = true;
				field991 = "";
				field1034 = true;
				field958 = -1;
				return true;
			}

			if (field958 == 46) {
				int var45 = field1270.method218();
				int var46 = field1270.method218();
				int var47 = field1270.method218();
				class55 var48 = class55.method294(var46);
				class60.field835[var45].field881 = var48.method298(50);
				class60.field835[var45].field886 = var48.field778;
				class60.field835[var45].field887 = var48.field779;
				class60.field835[var45].field885 = var48.field777 * 100 / var47;
				field958 = -1;
				return true;
			}

			if (field958 == 136) {
				for (int var49 = 0; var49 < field1214.length; var49++) {
					if (field1214[var49] != null) {
						field1214[var49].field297 = -1;
					}
				}

				for (int var50 = 0; var50 < field1139.length; var50++) {
					if (field1139[var50] != null) {
						field1139[var50].field297 = -1;
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 26) {
				int var51 = field1270.method218();
				boolean var52 = field1270.method216() == 1;
				class60.field835[var51].field855 = var52;
				field958 = -1;
				return true;
			}

			if (field958 == 167) {
				int var53 = field1270.method218();
				int var54 = field1270.method216();

				if (var53 == 0xFFFF) {
					var53 = -1;
				}

				field978[var54] = var53;
				field962 = true;
				field1211 = true;
				field958 = -1;
				return true;
			}

			if (field958 == 13) {
				int var55 = field1270.method216();
				int var56 = field1270.method216();
				int var57 = field1270.method216();
				int var58 = field1270.method216();
				field1300[var55] = true;
				field1257[var55] = var56;
				field1261[var55] = var57;
				field1059[var55] = var58;
				field1033[var55] = 0;
				field958 = -1;
				return true;
			}

			if (field958 == 209) {
				int var59 = field1270.method218();
				int var60 = field1270.method219();
				int var61 = field1270.method219();
				class60 var62 = class60.field835[var59];
				var62.field847 = var60;
				var62.field848 = var61;
				field958 = -1;
				return true;
			}

			if (field958 == 162) {
				field1142 = field1270.method216();
				field1143 = field1270.method216();

				while (field1270.field543 < field957) {
					int var63 = field1270.method216();
					method496(field1270, var63);
				}

				field958 = -1;
				return true;
			}

			if (field958 == 204) {
				int var64 = field1270.method218();
				int var65 = field1270.method218();
				class54 var66 = class54.method288(var65);
				class60.field835[var64].field881 = var66.method291();
				field958 = -1;
				return true;
			}

			if (field958 == 2) {
				int var67 = field1270.method218();
				int var68 = field1270.method218();
				int var69 = var68 >> 10 & 0x1F;
				int var70 = var68 >> 5 & 0x1F;
				int var71 = var68 & 0x1F;
				class60.field835[var67].field876 = (var71 << 3) + (var69 << 19) + (var70 << 11);
				field958 = -1;
				return true;
			}

			if (field958 == 12) {
				int var72 = field1270.method218();
				int var73 = field1270.method216();
				int var74 = field1270.method218();
				if (field1027 && !field1122 && field1052 < 50) {
					field1251[field1052] = var72;
					field1082[field1052] = var73;
					field1085[field1052] = class51.field667[var72] + var74;
					field1052++;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 43) {
				field1264 = field1270.method218() * 30;
				field958 = -1;
				return true;
			}

			if (field958 == 239) {
				field1097 = false;

				for (int var75 = 0; var75 < 5; var75++) {
					field1300[var75] = false;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 150) {
				int var76 = field1270.method218();
				byte var77 = field1270.method217();
				field1030[var76] = var77;

				if (field1158[var76] != var77) {
					field1158[var76] = var77;
					method441(var76);
					field962 = true;

					if (field1306 != -1) {
						field1034 = true;
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 84) {
				field1100 = field1270.method216();
				field962 = true;
				field1211 = true;
				field958 = -1;
				return true;
			}

			if (field958 == 213) {
				field962 = true;
				int var78 = field1270.method218();
				class60 var79 = class60.field835[var78];
				while (field1270.field543 < field957) {
					int var80 = field1270.method216();
					int var81 = field1270.method218();
					int var82 = field1270.method216();
					if (var82 == 255) {
						var82 = field1270.method221();
					}

					if (var80 >= 0 && var80 < var79.field836.length) {
						var79.field836[var80] = var81;
						var79.field837[var80] = var82;
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 54) {
				String var83 = field1270.method223();
				int var84 = field1270.method221();
				int var85 = field1270.method221();
				if (!var83.equals(field1028) && field1105 && !field1122) {
					method485(var83, var85, var84);
				}

				field1028 = var83;
				field1238 = var84;
				field1173 = var85;
				field975 = 0;
				field958 = -1;
				return true;
			}

			if (field958 == 98) {
				field962 = true;
				int var86 = field1270.method218();
				class60 var87 = class60.field835[var86];
				int var88 = field1270.method216();
				for (int var89 = 0; var89 < var88; var89++) {
					var87.field836[var89] = field1270.method218();
					int var90 = field1270.method216();
					if (var90 == 255) {
						var90 = field1270.method221();
					}

					var87.field837[var89] = var90;
				}

				for (int var91 = var88; var91 < var87.field836.length; var91++) {
					var87.field836[var91] = 0;
					var87.field837[var91] = 0;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 139) {
				field1138 = field1270.method218();
				field958 = -1;
				return true;
			}

			if (field958 == 193) {
				for (int var92 = 0; var92 < field1158.length; var92++) {
					if (field1158[var92] != field1030[var92]) {
						field1158[var92] = field1030[var92];
						method441(var92);
						field962 = true;
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 15) {
				int var93 = field1270.method218();
				class60 var94 = class60.field835[var93];
				for (int var95 = 0; var95 < var94.field836.length; var95++) {
					var94.field836[var95] = -1;
					var94.field836[var95] = 0;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 135) {
				field1142 = field1270.method216();
				field1143 = field1270.method216();
				for (int var96 = field1142; var96 < field1142 + 8; var96++) {
					for (int var97 = field1143; var97 < field1143 + 8; var97++) {
						if (field1262[field1080][var96][var97] != null) {
							field1262[field1080][var96][var97] = null;
							method430(var96, var97);
						}
					}
				}

				for (class38 var98 = (class38) field1207.method235(); var98 != null; var98 = (class38) field1207.method237()) {
					if (var98.field556 >= field1142 && var98.field556 < field1142 + 8 && var98.field557 >= field1143 && var98.field557 < field1143 + 8 && field1080 == var98.field554) {
						method402(var98.field557, var98.field555, var98.field561, var98.field563, var98.field562, var98.field554, var98.field556);
						var98.method108();
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 184) {
				method489(field1270, field957);

				if (field1073 == 1) {
					field1073 = 2;
					class3.field26 = field1080;
					method474();
				}

				if (field1122 && field1073 == 2 && class3.field26 != field1080) {
					field1231.method242();
					field1129.method191(257, 151, "Loading - please wait.", 0);
					field1129.method191(256, 150, "Loading - please wait.", 0xFFFFFF);
					field1231.method243(field8, 11, 8);
					class3.field26 = field1080;
					method474();
				}

				if (field1204 != field1080 && field1073 == 2) {
					field1204 = field1080;
					method404(field1080);
				}

				field958 = -1;
				return true;
			}

			if (field958 == 68) {
				if (field1100 == 12) {
					field962 = true;
				}

				field1007 = field1270.method216();
				field958 = -1;
				return true;
			}

			if (field958 == 80) {
				int var99 = field1270.method216();
				int var100 = field1270.method216();
				int var101 = -1;
				for (int var102 = 0; var102 < field1071.length; var102++) {
					if ((var99 << 8) + var100 == field1071[var102]) {
						var101 = var102;
					}
				}

				if (var101 != -1) {
					signlink.cachesave("m" + var99 + "_" + var100, field1203[var101]);
					field1073 = 1;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 133) {
				class37 var103 = class5.method37();
				if (var103 != null) {
					field1266.method205(81);
					field1266.method207(var103.field543);
					field1266.method214(var103.field542, var103.field543, 0);
					var103.method204();
				}

				field958 = -1;
				return true;
			}

			if (field958 == 254) {
				field1281 = field1270.method216();
				field958 = -1;
				return true;
			}

			if (field958 == 32) {
				field1334 = field1270.method216();
				field974 = field1270.method216();
				field1099 = field1270.method216();
				field1250 = true;
				field1034 = true;
				field958 = -1;
				return true;
			}

			if (field958 == 220) {
				int var104 = field1270.method216();
				int var105 = field1270.method216();
				int var106 = field1270.method218();
				int var107 = field1270.method218();
				int var108 = -1;
				for (int var109 = 0; var109 < field1071.length; var109++) {
					if ((var104 << 8) + var105 == field1071[var109]) {
						var108 = var109;
					}
				}

				if (var108 != -1) {
					if (field1126[var108] == null || field1126[var108].length != var107) {
						field1126[var108] = new byte[var107];
					}

					field1270.method225(field957 - 6, field1126[var108], var106);
				}

				field958 = -1;
				return true;
			}

			if (field958 == 74) {
				field1097 = true;
				field1090 = field1270.method216();
				field1091 = field1270.method216();
				field1092 = field1270.method218();
				field1093 = field1270.method216();
				field1094 = field1270.method216();
				if (field1094 >= 100) {
					int var110 = field1090 * 128 + 64;
					int var111 = field1091 * 128 + 64;
					int var112 = method495(field1091, field1080, field1090) - field1092;
					int var113 = var110 - field1152;
					int var114 = var112 - field1153;
					int var115 = var111 - field1154;
					int var116 = (int) Math.sqrt(var113 * var113 + var115 * var115);
					field1155 = (int) (Math.atan2(var114, var116) * 325.949D) & 0x7FF;
					field1156 = (int) (Math.atan2(var113, var115) * -325.949D) & 0x7FF;

					if (field1155 < 128) {
						field1155 = 128;
					}

					if (field1155 > 383) {
						field1155 = 383;
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 142) {
				method420();
				field958 = -1;
				return false;
			}

			if (field958 == 14) {
				int var117 = field1270.method218();
				method391(var117);

				if (field1298 != -1) {
					field1298 = -1;
					field962 = true;
					field1211 = true;
				}

				field1045 = var117;
				field1034 = true;
				field979 = -1;
				field1295 = false;
				field958 = -1;
				return true;
			}

			if (field958 == 175) {
				int var118 = field1270.method218();
				int var119 = field1270.method221();
				field1030[var118] = var119;

				if (field1158[var118] != var119) {
					field1158[var118] = var119;
					method441(var118);
					field962 = true;

					if (field1306 != -1) {
						field1034 = true;
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 201) {
				int var120 = field1270.method218();
				String var121 = field1270.method223();
				class60.field835[var120].field874 = var121;

				if (field978[field1100] == class60.field835[var120].field841) {
					field962 = true;
				}

				field958 = -1;
				return true;
			}

			if (field958 == 19) {
				field1313 = 0;
				field958 = -1;
				return true;
			}

			if (field958 == 146) {
				int var122 = field1270.method218();
				int var123 = field1270.method218();
				class60.field835[var122].field883 = var123;
				field958 = -1;
				return true;
			}

			if (field958 == 25) {
				field1118 = field1270.method216();
				if (field1118 == 1) {
					field1184 = field1270.method218();
				}

				if (field1118 >= 2 && field1118 <= 6) {
					if (field1118 == 2) {
						field1114 = 64;
						field1115 = 64;
					}

					if (field1118 == 3) {
						field1114 = 0;
						field1115 = 64;
					}

					if (field1118 == 4) {
						field1114 = 128;
						field1115 = 64;
					}

					if (field1118 == 5) {
						field1114 = 64;
						field1115 = 0;
					}

					if (field1118 == 6) {
						field1114 = 64;
						field1115 = 128;
					}

					field1118 = 2;
					field1111 = field1270.method218();
					field1112 = field1270.method218();
					field1113 = field1270.method216();
				}

				if (field1118 == 10) {
					field1206 = field1270.method218();
				}

				field958 = -1;
				return true;
			}

			if (field958 == 140) {
				field1018 = field1270.method221();
				field1265 = field1270.method218();
				field1058 = field1270.method216();
				field1169 = field1270.method218();

				if (field1018 != 0 && field979 == -1) {
					signlink.dnslookup(class48.method261(field1018));
					method422();
					short var124 = 650;
					if (field1058 != 201) {
						var124 = 655;
					}

					field1133 = "";
					field1064 = false;

					for (int var125 = 0; var125 < class60.field835.length; var125++) {
						if (class60.field835[var125] != null && class60.field835[var125].field844 == var124) {
							field979 = class60.field835[var125].field841;
							break;
						}
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 132) {
				int var126 = field1270.method216();
				int var127 = field1270.method216();
				int var128 = field1270.method218();
				int var129 = field1270.method218();
				int var130 = -1;
				for (int var131 = 0; var131 < field1071.length; var131++) {
					if ((var126 << 8) + var127 == field1071[var131]) {
						var130 = var131;
					}
				}

				if (var130 != -1) {
					if (field1203[var130] == null || field1203[var130].length != var129) {
						field1203[var130] = new byte[var129];
					}

					field1270.method225(field957 - 6, field1203[var130], var128);
				}

				field958 = -1;
				return true;
			}

			if (field958 == 22) {
				if (field1100 == 12) {
					field962 = true;
				}

				field1106 = field1270.method219();
				field958 = -1;
				return true;
			}

			if (field958 == 185) {
				int var132 = field1270.method219();
				field1306 = var132;
				field1034 = true;
				field958 = -1;
				return true;
			}

			if (field958 == 152) {
				long var133 = field1270.method222();
				int var135 = field1270.method216();
				String var136 = class48.method262(class48.method259(var133));
				for (int var137 = 0; var137 < field1060; var137++) {
					if (field1201[var137] == var133) {
						if (field1256[var137] != var135) {
							field1256[var137] = var135;
							field962 = true;

							if (var135 > 0) {
								method379(var136 + " has logged in.", "", 5);
							}

							if (var135 == 0) {
								method379(var136 + " has logged out.", "", 5);
							}
						}

						var136 = null;
						break;
					}
				}

				if (var136 != null && field1060 < 100) {
					field1201[field1060] = var133;
					field1067[field1060] = var136;
					field1256[field1060] = var135;
					field1060++;
					field962 = true;
				}

				boolean var138 = false;
				while (!var138) {
					var138 = true;
					for (int var139 = 0; var139 < field1060 - 1; var139++) {
						if (field1256[var139] != field1119 && field1256[var139 + 1] == field1119 || field1256[var139] == 0 && field1256[var139 + 1] != 0) {
							int var140 = field1256[var139];
							field1256[var139] = field1256[var139 + 1];
							field1256[var139 + 1] = var140;
							String var141 = field1067[var139];
							field1067[var139] = field1067[var139 + 1];
							field1067[var139 + 1] = var141;
							long var142 = field1201[var139];
							field1201[var139] = field1201[var139 + 1];
							field1201[var139 + 1] = var142;
							field962 = true;
							var138 = false;
						}
					}
				}

				field958 = -1;
				return true;
			}

			if (field958 == 237) {
				int var144 = field1270.method218();
				int var145 = field1270.method218();
				if (field1254 == var144 && field1255 == var145 && field1073 != 0) {
					field958 = -1;
					return true;
				}

				field1254 = var144;
				field1255 = var145;
				field1036 = (field1254 - 6) * 8;
				field1037 = (field1255 - 6) * 8;
				field1073 = 1;
				field1231.method242();
				field1129.method191(257, 151, "Loading - please wait.", 0);
				field1129.method191(256, 150, "Loading - please wait.", 0xFFFFFF);
				field1231.method243(field8, 11, 8);
				signlink.looprate(5);
				int var146 = (field957 - 2) / 10;
				field1203 = new byte[var146][];
				field1126 = new byte[var146][];
				field1071 = new int[var146];
				field1266.method205(150);
				field1266.method206(0);
				int var147 = 0;
				for (int var148 = 0; var148 < var146; var148++) {
					int var149 = field1270.method216();
					int var150 = field1270.method216();
					int var151 = field1270.method221();
					int var152 = field1270.method221();
					field1071[var148] = (var149 << 8) + var150;

					if (var151 != 0) {
						byte[] var153 = signlink.cacheload("m" + var149 + "_" + var150);
						if (var153 != null) {
							field982.reset();
							field982.update(var153);

							if ((int) field982.getValue() != var151) {
								var153 = null;
							}
						}

						if (var153 == null) {
							field1073 = 0;
							field1266.method206(0);
							field1266.method206(var149);
							field1266.method206(var150);
							var147 += 3;
						} else {
							field1203[var148] = var153;
						}
					}

					if (var152 != 0) {
						byte[] var154 = signlink.cacheload("l" + var149 + "_" + var150);
						if (var154 != null) {
							field982.reset();
							field982.update(var154);

							if ((int) field982.getValue() != var152) {
								var154 = null;
							}
						}

						if (var154 == null) {
							field1073 = 0;
							field1266.method206(1);
							field1266.method206(var149);
							field1266.method206(var150);
							var147 += 3;
						} else {
							field1126[var148] = var154;
						}
					}
				}

				field1266.method215(var147);
				signlink.looprate(50);
				field1231.method242();

				if (field1073 == 0) {
					field1129.method191(257, 166, "Map area updated since last visit, so load will take longer this time only", 0);
					field1129.method191(256, 165, "Map area updated since last visit, so load will take longer this time only", 0xFFFFFF);
				}

				field1231.method243(field8, 11, 8);
				int var155 = field1036 - field1038;
				int var156 = field1037 - field1039;
				field1038 = field1036;
				field1039 = field1037;

				for (int var157 = 0; var157 < 8192; var157++) {
					class25 var158 = field1139[var157];
					if (var158 != null) {
						for (int var159 = 0; var159 < 10; var159++) {
							var158.field318[var159] -= var155;
							var158.field319[var159] -= var156;
						}

						var158.field270 -= var155 * 128;
						var158.field271 -= var156 * 128;
					}
				}

				for (int var160 = 0; var160 < field1212; var160++) {
					class26 var161 = field1214[var160];
					if (var161 != null) {
						for (int var162 = 0; var162 < 10; var162++) {
							var161.field318[var162] -= var155;
							var161.field319[var162] -= var156;
						}

						var161.field270 -= var155 * 128;
						var161.field271 -= var156 * 128;
					}
				}

				byte var163 = 0;
				byte var164 = 104;
				byte var165 = 1;
				if (var155 < 0) {
					var163 = 103;
					var164 = -1;
					var165 = -1;
				}

				byte var166 = 0;
				byte var167 = 104;
				byte var168 = 1;
				if (var156 < 0) {
					var166 = 103;
					var167 = -1;
					var168 = -1;
				}

				for (int var169 = var163; var169 != var164; var169 += var165) {
					for (int var170 = var166; var170 != var167; var170 += var168) {
						int var171 = var155 + var169;
						int var172 = var156 + var170;
						for (int var173 = 0; var173 < 4; var173++) {
							if (var171 >= 0 && var172 >= 0 && var171 < 104 && var172 < 104) {
								field1262[var173][var169][var170] = field1262[var173][var171][var172];
							} else {
								field1262[var173][var169][var170] = null;
							}
						}
					}
				}

				for (class38 var174 = (class38) field1207.method235(); var174 != null; var174 = (class38) field1207.method237()) {
					var174.field556 -= var155;
					var174.field557 -= var156;
					if (var174.field556 < 0 || var174.field557 < 0 || var174.field556 >= 104 || var174.field557 >= 104) {
						var174.method108();
					}
				}

				if (field1313 != 0) {
					field1313 -= var155;
					field1314 -= var156;
				}

				field1097 = false;
				field958 = -1;
				return true;
			}

			if (field958 == 168) {
				int var175 = field1270.method218();
				method391(var175);

				if (field1298 != -1) {
					field1298 = -1;
					field962 = true;
					field1211 = true;
				}

				if (field1045 != -1) {
					field1045 = -1;
					field1034 = true;
				}

				if (field980) {
					field980 = false;
					field1034 = true;
				}

				field979 = var175;
				field1295 = false;
				field958 = -1;
				return true;
			}

			if (field958 == 21) {
				field1160 = field957 / 8;
				for (int var176 = 0; var176 < field1160; var176++) {
					field1107[var176] = field1270.method222();
				}

				field958 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field958 + "," + field957 + " - " + field1199 + "," + field1200);
			method420();
		} catch (IOException var181) {
			method418();
		} catch (Exception var182) {
			String var178 = "T2 - " + field958 + "," + field1199 + "," + field1200 + " - " + field957 + "," + (field1290.field318[0] + field1036) + "," + (field1290.field319[0] + field1037) + " - ";
			for (int var179 = 0; var179 < field957 && var179 < 50; var179++) {
				var178 = var178 + field1270.field542[var179] + ",";
			}

			signlink.reporterror(var178);
			method420();
		}

		return true;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method415() {
		if (field1264 > 1) {
			field1264--;
		}

		if (field961 > 0) {
			field961--;
		}

		for (int var1 = 0; var1 < 5 && method414(); var1++) {
		}

		if (field1032) {
			for (int var2 = 0; var2 < field1052; var2++) {
				if (field1085[var2] <= 0) {
					boolean var3 = false;
					try {
						if (field1251[var2] != field1015 || field1082[var2] != field1194) {
							class37 var4 = class51.method271(field1082[var2], field1251[var2]);
							if (System.currentTimeMillis() + var4.field543 / 22 > field1134 / 22 + field981) {
								field1134 = var4.field543;
								field981 = System.currentTimeMillis();

								if (method383(var4.field543, var4.field542)) {
									field1015 = field1251[var2];
									field1194 = field1082[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!method384()) {
							var3 = true;
						}
					} catch (Exception var20) {
					}

					if (var3 && field1085[var2] != -5) {
						field1085[var2] = -5;
					} else {
						field1052--;
						for (int var6 = var2; var6 < field1052; var6++) {
							field1251[var6] = field1251[var6 + 1];
							field1082[var6] = field1082[var6 + 1];
							field1085[var6] = field1085[var6 + 1];
						}

						var2--;
					}
				} else {
					field1085[var2]--;
				}
			}

			if (field975 > 0) {
				field975 -= 20;
				if (field975 < 0) {
					field975 = 0;
				}

				if (field975 == 0 && field1105 && !field1122) {
					method485(field1028, field1173, field1238);
				}
			}

			class37 var7 = class5.method36();
			if (var7 != null) {
				field1266.method205(81);
				field1266.method207(var7.field543);
				field1266.method214(var7.field542, var7.field543, 0);
				var7.method204();
			}

			field959++;
			if (field959 > 750) {
				method418();
			}

			method396();
			method448();
			method457();
			method425();

			if ((field20[1] == 1 || field20[2] == 1 || field20[3] == 1 || field20[4] == 1) && field1021++ > 5) {
				field1021 = 0;
				field1266.method205(189);
				field1266.method207(field1178);
				field1266.method207(field1179);
				field1266.method206(field1221);
				field1266.method206(field1065);
			}

			field1292++;

			if (field1056 != 0) {
				field1055 += 20;
				if (field1055 >= 400) {
					field1056 = 0;
				}
			}

			if (field1329 != 0) {
				field1326++;
				if (field1326 >= 15) {
					if (field1329 == 2) {
						field962 = true;
					}

					if (field1329 == 3) {
						field1034 = true;
					}

					field1329 = 0;
				}
			}

			if (field1011 != 0) {
				field1008++;

				if (field15 > field1012 + 5 || field15 < field1012 - 5 || field16 > field1013 + 5 || field16 < field1013 - 5) {
					field1083 = true;
				}

				if (field14 == 0) {
					if (field1011 == 2) {
						field962 = true;
					}

					if (field1011 == 3) {
						field1034 = true;
					}

					field1011 = 0;

					if (field1083 && field1008 >= 5) {
						field1253 = -1;
						method380();

						if (field1253 == field1009 && field1252 != field1010) {
							class60 var8 = class60.field835[field1009];
							int var9 = var8.field836[field1252];
							var8.field836[field1252] = var8.field836[field1010];
							var8.field836[field1010] = var9;
							int var10 = var8.field837[field1252];
							var8.field837[field1252] = var8.field837[field1010];
							var8.field837[field1010] = var10;
							field1266.method205(159);
							field1266.method207(field1009);
							field1266.method207(field1010);
							field1266.method207(field1252);
						}
					} else if ((field1339 == 1 || method471(field1031 - 1)) && field1031 > 2) {
						method467();
					} else if (field1031 > 0) {
						method436(field1031 - 1);
					}

					field1326 = 10;
					field17 = 0;
				}
			}

			field1051++;
			if (field1051 > 127) {
				field1051 = 0;
				field1266.method205(215);
				field1266.method209(0x4C2B2C);
			}

			if (class18.field230 != -1) {
				int var11 = class18.field230;
				int var12 = class18.field231;
				boolean var13 = method484(field1290.field319[0], 0, 0, var12, true, 0, var11, 0, field1290.field318[0], 0, 0);
				class18.field230 = -1;

				if (var13) {
					field1053 = field18;
					field1054 = field19;
					field1056 = 1;
					field1055 = 0;
				}
			}

			if (field17 == 1 && field1165 != null) {
				field1165 = null;
				field1034 = true;
				field17 = 0;
			}

			method490();
			method483();
			method432();
			method376();

			if (field14 == 1 || field17 == 1) {
				field1205++;
			}

			if (field1073 == 2) {
				method411();
			}

			if (field1073 == 2 && field1097) {
				method464();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				field1033[var14]++;
			}

			method480();
			field13++;
			if (field13 > 4500) {
				field961 = 250;
				field13 -= 500;
				field1266.method205(70);
			}

			field955++;
			if (field955 > 500) {
				field955 = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					field1170 += field1171;
				}

				if ((var15 & 0x2) == 2) {
					field1273 += field1274;
				}

				if ((var15 & 0x4) == 4) {
					field1016 += field1017;
				}
			}

			if (field1170 < -50) {
				field1171 = 2;
			}

			if (field1170 > 50) {
				field1171 = -2;
			}

			if (field1273 < -55) {
				field1274 = 2;
			}

			if (field1273 > 55) {
				field1274 = -2;
			}

			if (field1016 < -40) {
				field1017 = 1;
			}

			if (field1016 > 40) {
				field1017 = -1;
			}

			field1276++;
			if (field1276 > 500) {
				field1276 = 0;
				int var16 = (int) (Math.random() * 8.0D);
				if ((var16 & 0x1) == 1) {
					field1221 += field1222;
				}

				if ((var16 & 0x2) == 2) {
					field1065 += field1066;
				}
			}

			if (field1221 < -60) {
				field1222 = 2;
			}

			if (field1221 > 60) {
				field1222 = -2;
			}

			if (field1065 < -20) {
				field1066 = 1;
			}

			if (field1065 > 10) {
				field1066 = -1;
			}

			field1117++;
			if (field1117 > 110) {
				field1117 = 0;
				field1266.method205(236);
				field1266.method210(0);
			}

			field960++;
			if (field960 > 50) {
				field1266.method205(108);
			}

			try {
				if (field1275 != null && field1266.field543 > 0) {
					field1275.method33(field1266.field542, 0, field1266.field543);
					field1266.field543 = 0;
					field960 = 0;
				}
			} catch (IOException var18) {
				method418();
			} catch (Exception var19) {
				method420();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method13(String arg0, int arg1) {
		method382();

		if (field984 == null) {
			super.method13(arg0, arg1);
		} else {
			field1319.method242();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1130.method191(var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class32.method151(304, 34, var6, var3 / 2 - 152, 0x8C1111);
			class32.method151(302, 32, var6 + 1, var3 / 2 - 151, 0);
			class32.method150(var6 + 2, arg1 * 3, var3 / 2 - 150, 30, 0x8C1111);
			class32.method150(var6 + 2, 300 - arg1 * 3, arg1 * 3 + var3 / 2 - 150, 30, 0);
			field1130.method191(var3 / 2, var4 / 2 + 5 - var5, arg0, 0xFFFFFF);
			field1319.method243(field8, 186, 214);

			if (field1277) {
				field1277 = false;

				if (!field1101) {
					field1320.method243(field8, 0, 0);
					field1321.method243(field8, 0, 661);
				}

				field1317.method243(field8, 0, 128);
				field1318.method243(field8, 386, 214);
				field1322.method243(field8, 265, 0);
				field1323.method243(field8, 265, 574);
				field1324.method243(field8, 186, 128);
				field1325.method243(field8, 186, 574);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method416(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field948 = "";
				field949 = "Connecting to server...";
				method389();
			}

			field1275 = new class4(this, method481(field1120 + 43594));
			field1275.method32(field1270.field542, 0, 8);
			field1270.field543 = 0;
			field1168 = field1270.method222();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1168 >> 32), (int) field1168 };
			field1266.field543 = 0;
			field1266.method206(10);
			field1266.method210(var4[0]);
			field1266.method210(var4[1]);
			field1266.method210(var4[2]);
			field1266.method210(var4[3]);
			field1266.method210(signlink.uid);
			field1266.method213(arg0);
			field1266.method213(arg1);
			field1266.method231(field1161, field1240);
			field1208.field543 = 0;

			if (arg2) {
				field1208.method206(18);
			} else {
				field1208.method206(16);
			}

			field1208.method206(field1266.field543 + 36 + 1 + 1);
			field1208.method206(222);
			field1208.method206(field1122 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1208.method210(field1236[var5]);
			}

			field1208.method214(field1266.field542, field1266.field543, 0);
			field1266.field547 = new class46(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1209 = new class46(var4);
			field1275.method33(field1208.field542, 0, field1208.field543);
			int var7 = field1275.method30();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method416(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field1271 = true;
				} else {
					field1271 = false;
				}

				class5.method35();
				field1032 = true;
				field1266.field543 = 0;
				field1270.field543 = 0;
				field958 = -1;
				field1198 = -1;
				field1199 = -1;
				field1200 = -1;
				field957 = 0;
				field959 = 0;
				field1264 = 0;
				field961 = 0;
				field1118 = 0;
				field1031 = 0;
				field1167 = false;
				field13 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field1125[var8] = null;
				}

				field1244 = 0;
				field985 = 0;
				field1073 = 0;
				field1052 = 0;
				field1170 = (int) (Math.random() * 100.0D) - 50;
				field1273 = (int) (Math.random() * 110.0D) - 55;
				field1016 = (int) (Math.random() * 80.0D) - 40;
				field1221 = (int) (Math.random() * 120.0D) - 60;
				field1065 = (int) (Math.random() * 30.0D) - 20;
				field1179 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1204 = -1;
				field1313 = 0;
				field1314 = 0;
				field1215 = 0;
				field1140 = 0;

				for (int var9 = 0; var9 < field1212; var9++) {
					field1214[var9] = null;
					field1219[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1139[var10] = null;
				}

				field1290 = field1214[field1213] = new class26();
				field1068.method239();
				field1014.method239();
				field1340.method239();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1262[var11][var12][var13] = null;
						}
					}
				}

				field1207 = new class41();
				field1060 = 0;
				field1306 = -1;
				field1045 = -1;
				field979 = -1;
				field1298 = -1;
				field1295 = false;
				field1100 = 3;
				field980 = false;
				field1167 = false;
				field1182 = false;
				field1165 = null;
				field1281 = 0;
				field1287 = -1;
				field1239 = true;
				method461();

				for (int var14 = 0; var14 < 5; var14++) {
					field950[var14] = 0;
				}

				field977 = 0;
				field1278 = 0;
				field1127 = 0;
				field1163 = 0;
				field1235 = 0;
				field1050 = 0;
				field1344 = 0;
				field992 = 0;
				field1098 = 0;
				method434();
				return;
			}

			if (var7 == 3) {
				field948 = "";
				field949 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field948 = "Your account has been disabled.";
				field949 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field948 = "Your account is already logged in.";
				field949 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field948 = "RuneScape has been updated!";
				field949 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field948 = "This world is full.";
				field949 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field948 = "Unable to connect.";
				field949 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field948 = "Login limit exceeded.";
				field949 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field948 = "Unable to connect.";
				field949 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field949 = "Login server rejected session.";
				field949 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field948 = "You need a members account to login to this world.";
				field949 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field948 = "Could not complete login.";
				field949 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field948 = "The server is being updated.";
				field949 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field1032 = true;
				field1266.field543 = 0;
				field1270.field543 = 0;
				field958 = -1;
				field1198 = -1;
				field1199 = -1;
				field1200 = -1;
				field957 = 0;
				field959 = 0;
				field1264 = 0;
				field1031 = 0;
				field1167 = false;
				return;
			}

			if (var7 == 16) {
				field948 = "Login attempts exceeded.";
				field949 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field948 = "You are standing in a members-only area.";
				field949 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field948 = "";
			field949 = "Error connecting to server.";
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 222);

			if (arg0.length == 4) {
				field1119 = Integer.parseInt(arg0[0]);
				field1120 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method479();
				} else if (arg0[2].equals("highmem")) {
					method429();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					field1121 = false;
				} else if (arg0[3].equals("members")) {
					field1121 = true;
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

	@ObfuscatedName("client.d(B)V")
	public final void method417() {
		if (field1290.field270 >> 7 == field1313 && field1290.field271 >> 7 == field1314) {
			field1313 = 0;
		}

		for (int var1 = -1; var1 < field1215; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1290;
				var3 = field1213 << 14;
			} else {
				var2 = field1214[field1216[var1]];
				var3 = field1216[var1] << 14;
			}

			if (var2 != null && var2.method112()) {
				var2.field342 = false;
				if ((field1122 && field1215 > 50 || field1215 > 200) && var1 != -1 && var2.field294 == var2.field275) {
					var2.field342 = true;
				}

				int var4 = var2.field270 >> 7;
				int var5 = var2.field271 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field337 == null || field1202 < var2.field332 || field1202 >= var2.field333) {
						if ((var2.field270 & 0x7F) == 0x40 && (var2.field271 & 0x7F) == 0x40) {
							if (field1269[var4][var5] == field1195) {
								continue;
							}

							field1269[var4][var5] = field1195;
						}

						var2.field331 = method495(var2.field271, field1080, var2.field270);
						field1172.method62(60, var2.field270, var2.field271, null, var3, var2.field331, var2.field272, field1080, var2, var2.field273);
					} else {
						var2.field342 = false;
						var2.field331 = method495(var2.field271, field1080, var2.field270);
						field1172.method63(null, var2.field271, var2.field339, var3, 60, var2, var2.field340, var2.field338, var2.field270, var2.field331, var2.field272, field1080, var2.field341);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method418() {
		if (field961 > 0) {
			method420();
		} else {
			field1231.method242();
			field1129.method191(257, 144, "Connection lost", 0);
			field1129.method191(256, 143, "Connection lost", 0xFFFFFF);
			field1129.method191(257, 159, "Please wait - attempting to reestablish", 0);
			field1129.method191(256, 158, "Please wait - attempting to reestablish", 0xFFFFFF);
			field1231.method243(field8, 11, 8);
			field1313 = 0;
			class4 var1 = field1275;
			field1032 = false;
			method416(field1095, field1096, true);

			if (!field1032) {
				method420();
			}

			try {
				var1.method29();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method419() {
		field995 = 0;
		for (int var1 = -1; var1 < field1215 + field1140; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field1290;
			} else if (var1 < field1215) {
				var2 = field1214[field1216[var1]];
			} else {
				var2 = field1139[field1141[var1 - field1215]];
			}

			if (var2 != null && var2.method112()) {
				if (var1 < field1215) {
					int var3 = 30;
					class26 var4 = (class26) var2;
					if (var4.field326 != 0) {
						method423(var2.field315 + 15, var2);

						if (field1077 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field326 & 1 << var5) != 0) {
									field1159[var5].method175(field1078 - var3, field1077 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1118 == 10 && field1216[var1] == field1206) {
						method423(var2.field315 + 15, var2);

						if (field1077 > -1) {
							field1159[7].method175(field1078 - var3, field1077 - 12);
						}
					}
				} else if (field1118 == 1 && field1141[var1 - field1215] == field1184 && field1202 % 20 < 10) {
					method423(var2.field315 + 15, var2);

					if (field1077 > -1) {
						field1159[2].method175(field1078 - 28, field1077 - 12);
					}
				}

				if (var2.field282 != null && (var1 >= field1215 || field1334 == 0 || field1334 == 3 || field1334 == 1 && method470(((class26) var2).field323))) {
					method423(var2.field315, var2);

					if (field1077 > -1 && field995 < field996) {
						field1000[field995] = field1130.method193(var2.field282) / 2;
						field999[field995] = field1130.field539;
						field997[field995] = field1077;
						field998[field995] = field1078;
						field1001[field995] = var2.field284;
						field1002[field995] = var2.field285;
						field1003[field995] = var2.field283;
						field1004[field995++] = var2.field282;

						if (field1084 == 0 && var2.field285 == 1) {
							field999[field995] += 10;
							field998[field995] += 5;
						}

						if (field1084 == 0 && var2.field285 == 2) {
							field1000[field995] = 60;
						}
					}
				}

				if (var2.field288 > field1202 + 100) {
					method423(var2.field315 + 15, var2);

					if (field1077 > -1) {
						int var6 = var2.field289 * 30 / var2.field290;
						if (var6 > 30) {
							var6 = 30;
						}

						class32.method150(field1078 - 3, var6, field1077 - 15, 5, 0xFF00);
						class32.method150(field1078 - 3, 30 - var6, field1077 + var6 - 15, 5, 0xFF0000);
					}
				}

				if (var2.field288 > field1202 + 330) {
					method423(var2.field315 / 2, var2);

					if (field1077 > -1) {
						field1280[var2.field287].method175(field1078 - 12, field1077 - 12);
						field1128.method191(field1077, field1078 + 4, String.valueOf(var2.field286), 0);
						field1128.method191(field1077 - 1, field1078 + 3, String.valueOf(var2.field286), 0xFFFFFF);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field995; var7++) {
			int var8 = field997[var7];
			int var9 = field998[var7];
			int var10 = field1000[var7];
			int var11 = field999[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field998[var13] - field999[var13] && var9 - var11 < field998[var13] + 2 && var8 - var10 < field997[var13] + field1000[var13] && var8 + var10 > field997[var13] - field1000[var13] && field998[var13] - field999[var13] < var9) {
						var9 = field998[var13] - field999[var13];
						var12 = true;
					}
				}
			}

			field1077 = field997[var7];
			field1078 = field998[var7] = var9;
			String var14 = field1004[var7];
			if (field1084 == 0) {
				int var15 = 0xFFFF00;
				if (field1001[var7] < 6) {
					var15 = field1260[field1001[var7]];
				}

				if (field1001[var7] == 6) {
					var15 = field1195 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1001[var7] == 7) {
					var15 = field1195 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1001[var7] == 8) {
					var15 = field1195 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1001[var7] == 9) {
					int var16 = 150 - field1003[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1001[var7] == 10) {
					int var17 = 150 - field1003[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1001[var7] == 11) {
					int var18 = 150 - field1003[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1002[var7] == 0) {
					field1130.method191(field1077, field1078 + 1, var14, 0);
					field1130.method191(field1077, field1078, var14, var15);
				}

				if (field1002[var7] == 1) {
					field1130.method195(field1078 + 1, field1077, var14, 0, field1195);
					field1130.method195(field1078, field1077, var14, var15, field1195);
				}

				if (field1002[var7] == 2) {
					int var19 = field1130.method193(var14);
					int var20 = (150 - field1003[var7]) * (var19 + 100) / 150;
					class32.method148(field1077 - 50, field1077 + 50, 334, 0);
					field1130.method194(field1078 + 1, var14, 0, field1077 + 50 - var20);
					field1130.method194(field1078, var14, var15, field1077 + 50 - var20);
					class32.method147();
				}
			} else {
				field1130.method191(field1077, field1078 + 1, var14, 0);
				field1130.method191(field1077, field1078, var14, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method420() {
		try {
			if (field1275 != null) {
				field1275.method29();
			}
		} catch (Exception var2) {
		}

		field1275 = null;
		field1032 = false;
		field1293 = 0;
		field1095 = "";
		field1096 = "";
		class5.method35();
		method492();
		field1172.method51();

		for (int var1 = 0; var1 < 4; var1++) {
			field1331[var1].method302();
		}

		System.gc();
		method390();
		field1028 = null;
		field975 = 0;
	}

	@ObfuscatedName("client.b(IBLkb;)V")
	public final void method421(int arg0, class37 arg1) {
		while (arg1.field544 + 21 < arg0 * 8) {
			int var3 = arg1.method227(13);
			if (var3 == 8191) {
				break;
			}

			if (field1139[var3] == null) {
				field1139[var3] = new class25();
			}

			class25 var4 = field1139[var3];
			field1141[field1140++] = var3;
			var4.field314 = field1202;
			var4.field322 = class54.method288(arg1.method227(11));
			var4.field274 = var4.field322.field745;
			var4.field277 = var4.field322.field749;
			var4.field278 = var4.field322.field750;
			var4.field279 = var4.field322.field751;
			var4.field280 = var4.field322.field752;
			var4.field275 = var4.field322.field748;
			int var5 = arg1.method227(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method227(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method110(field1290.field318[0] + var5, false, field1290.field319[0] + var6);
			int var7 = arg1.method227(1);
			if (var7 == 1) {
				field1218[field1217++] = var3;
			}
		}

		arg1.method228();
	}

	@ObfuscatedName("client.a(B)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field11 != null) {
			return field11;
		}

		return this;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method422() {
		field1266.method205(231);

		if (field1298 != -1) {
			field1298 = -1;
			field962 = true;
			field1295 = false;
			field1211 = true;
		}

		if (field1045 != -1) {
			field1045 = -1;
			field1034 = true;
			field1295 = false;
		}

		field979 = -1;
	}

	@ObfuscatedName("client.a(IZLx;)V")
	public final void method423(int arg0, class24 arg1) {
		method424(arg1.field271, arg0, arg1.field270);
	}

	@ObfuscatedName("client.a(BIII)V")
	public final void method424(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method495(arg0, field1080, arg2) - arg1;
			arg2 -= field1152;
			var4 -= field1153;
			arg0 -= field1154;
			int var5 = class31.field480[field1155];
			int var6 = class31.field481[field1155];
			int var7 = class31.field480[field1156];
			int var8 = class31.field481[field1156];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1077 = (var9 << 9) / arg0 + class33.field499;
				field1078 = (var11 << 9) / arg0 + class33.field500;
			} else {
				field1077 = -1;
				field1078 = -1;
			}
		} else {
			field1077 = -1;
			field1078 = -1;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method425() {
		if (field1073 == 2) {
			for (class39 var1 = (class39) field1340.method235(); var1 != null; var1 = (class39) field1340.method237()) {
				if (field1202 >= var1.field571) {
					method402(var1.field567, var1.field565, var1.field568, var1.field570, var1.field569, var1.field564, var1.field566);
					var1.method108();
				}
			}

			field1132++;
			if (field1132 > 85) {
				field1132 = 0;
				field1266.method205(85);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;I)V")
	public final void method426(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1060) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				arg0.field874 = field1067[var2];
				arg0.field843 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1060) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				if (field1256[var2] == 0) {
					arg0.field874 = "@red@Offline";
				} else if (field1256[var2] == field1119) {
					arg0.field874 = "@gre@World-" + (field1256[var2] - 9);
				} else {
					arg0.field874 = "@yel@World-" + (field1256[var2] - 9);
				}

				arg0.field843 = 1;
			}
		} else if (var2 == 203) {
			arg0.field853 = field1060 * 15 + 20;
			if (arg0.field853 <= arg0.field846) {
				arg0.field853 = arg0.field846 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1160) {
				arg0.field874 = "";
				arg0.field843 = 0;
			} else {
				arg0.field874 = class48.method262(class48.method259(field1107[var2]));
				arg0.field843 = 1;
			}
		} else if (var2 == 503) {
			arg0.field853 = field1160 * 15 + 20;
			if (arg0.field853 <= arg0.field846) {
				arg0.field853 = arg0.field846 + 1;
			}
		} else if (var2 == 327) {
			arg0.field886 = 150;
			arg0.field887 = (int) (Math.sin(field1202 / 40.0D) * 256.0D) & 0x7FF;

			if (field1210) {
				field1210 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1267[var5];
					if (var6 >= 0) {
						var3[var4++] = class59.field828[var6].method320();
					}
				}

				class31 var7 = new class31(var3, var4);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field950[var8] != 0) {
						var7.method134(field1047[var8][0], field1047[var8][field950[var8]]);

						if (var8 == 1) {
							var7.method134(field1316[0], field1316[field950[var8]]);
						}
					}
				}

				var7.method127();
				var7.method128(class62.field901[field1290.field275].field903[0]);
				var7.method137(64, 850, -30, -50, -30, true);
				arg0.field881 = var7;
			}
		} else if (var2 == 324) {
			if (field1341 == null) {
				field1341 = arg0.field879;
				field1342 = arg0.field880;
			}

			if (field1239) {
				arg0.field879 = field1342;
			} else {
				arg0.field879 = field1341;
			}
		} else if (var2 == 325) {
			if (field1341 == null) {
				field1341 = arg0.field879;
				field1342 = arg0.field880;
			}

			if (field1239) {
				arg0.field879 = field1341;
			} else {
				arg0.field879 = field1342;
			}
		} else if (var2 == 600) {
			arg0.field874 = field1133;
			if (field1202 % 20 < 10) {
				arg0.field874 = arg0.field874 + "|";
			} else {
				arg0.field874 = arg0.field874 + " ";
			}
		} else if (var2 == 613) {
			if (!field1271) {
				arg0.field874 = "";
			} else if (field1064) {
				arg0.field876 = 0xFF0000;
				arg0.field874 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field876 = 0xFFFFFF;
				arg0.field874 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1018 == 0) {
				arg0.field874 = "";
			} else {
				String var9;
				if (field1265 == 0) {
					var9 = "earlier today";
				} else if (field1265 == 1) {
					var9 = "yesterday";
				} else {
					var9 = field1265 + " days ago";
				}

				arg0.field874 = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1169 == 0) {
				arg0.field874 = "0 unread messages";
				arg0.field876 = 0xFFFF00;
			}

			if (field1169 == 1) {
				arg0.field874 = "1 unread message";
				arg0.field876 = 0xFF00;
			}

			if (field1169 > 1) {
				arg0.field874 = field1169 + " unread messages";
				arg0.field876 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1058 == 201) {
				arg0.field874 = "";
			} else if (field1058 == 200) {
				arg0.field874 = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (field1058 == 0) {
					var10 = "Earlier today";
				} else if (field1058 == 1) {
					var10 = "Yesterday";
				} else {
					var10 = field1058 + " days ago";
				}

				arg0.field874 = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1058 == 201) {
				arg0.field874 = "";
			} else if (field1058 == 200) {
				arg0.field874 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field874 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1058 == 201) {
				arg0.field874 = "";
			} else if (field1058 == 200) {
				arg0.field874 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field874 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://127.0.0.1:" + (field1120 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(Lhb;III)V")
	public final void method427(class34 arg0, int arg1, int arg2) {
		int var4 = field1221 + field1179 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field480[var4];
			int var7 = class31.field481[var4];
			var6 = var6 * 256 / (field1065 + 256);
			var7 = var7 * 256 / (field1065 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method182(field1226, var8 + 94 - arg0.field522 / 2, 83 - var9 - arg0.field523 / 2);
			} else {
				arg0.method175(83 - var9 - arg0.field523 / 2, var8 + 94 - arg0.field522 / 2);
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method428() {
		field1232.method242();
		class33.field505 = field1336;
		field1227.method189(0, 0);

		if (field1182) {
			field1130.method191(239, 40, field1294, 0);
			field1130.method191(239, 60, field1046 + "*", 128);
		} else if (field980) {
			field1130.method191(239, 40, "Enter amount:", 0);
			field1130.method191(239, 60, field991 + "*", 128);
		} else if (field1165 != null) {
			field1130.method191(239, 40, field1165, 0);
			field1130.method191(239, 60, "Click to continue", 128);
		} else if (field1045 != -1) {
			method371(0, 0, class60.field835[field1045], 0);
		} else if (field1306 == -1) {
			class36 var1 = field1129;
			int var2 = 0;
			class32.method148(0, 463, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1125[var3] != null) {
					int var4 = field1123[var3];
					int var5 = field990 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, field1125[var3], 0, 4);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, field1124[var3] + ":", 0xFFFFFF, 4);
							var1.method194(var5, field1125[var3], 255, var1.method193(field1124[var3]) + 12);
						}

						var2++;
					}

					if (var4 == 2 && (field1334 == 0 || field1334 == 1 && method470(field1124[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, field1124[var3] + ":", 0, 4);
							var1.method194(var5, field1125[var3], 255, var1.method193(field1124[var3]) + 12);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1241 == 0 && (var4 == 7 || field974 == 0 || field974 == 1 && method470(field1124[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, "From " + field1124[var3] + ":", 0, 4);
							var1.method194(var5, field1125[var3], 0x800000, var1.method193("From " + field1124[var3]) + 12);
						}

						var2++;
					}

					if (var4 == 4 && (field1099 == 0 || field1099 == 1 && method470(field1124[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, field1124[var3] + " " + field1125[var3], 0x800080, 4);
						}

						var2++;
					}

					if (var4 == 5 && field1241 == 0 && field974 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, field1125[var3], 0x800000, 4);
						}

						var2++;
					}

					if (var4 == 6 && field1241 == 0 && field974 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, "To " + field1124[var3] + ":", 0, 4);
							var1.method194(var5, field1125[var3], 0x800000, var1.method193("To " + field1124[var3]) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field1099 == 0 || field1099 == 1 && method470(field1124[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var5, field1124[var3] + " " + field1125[var3], 0xCBB789, 4);
						}

						var2++;
					}
				}
			}

			class32.method147();
			field1063 = var2 * 14 + 7;
			if (field1063 < 78) {
				field1063 = 78;
			}

			method403(field1063, 0, 77, field1063 - field990 - 77, 463);
			var1.method194(90, class48.method262(field1095) + ":", 0, 4);
			var1.method194(90, field1102 + "*", 255, var1.method193(field1095 + ": ") + 6);
			class32.method152(77, 0, 479, 0);
		} else {
			method371(0, 0, class60.field835[field1306], 0);
		}

		if (field1167 && field1022 == 2) {
			method409();
		}

		field1232.method243(field8, 375, 22);
		field1231.method242();
		class33.field505 = field1338;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method12(Runnable arg0, int arg1) {
		if (signlink.mainapp == null) {
			super.method12(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.s(I)V")
	public static final void method429() {
		class18.field196 = false;
		class33.field494 = false;
		field1122 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method430(int arg0, int arg1) {
		class41 var3 = field1262[field1080][arg0][arg1];
		if (var3 == null) {
			field1172.method77(field1080, arg0, arg1);
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
			field1172.method58(var17.method298(var5.field269), var16, method495(arg1 * 128 + 64, field1080, arg0 * 128 + 64), arg0, field1080, arg1, var15, var14);
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method431() {
		field1330 = false;

		while (field1268) {
			try {
				Thread.sleep(50L);
			} catch (Exception var15) {
			}

			String var2;
			int var3;
			int var4;
			synchronized (field1286) {
				var2 = field1166;
				var3 = field1006;
				var4 = field1224;
				field1166 = null;
				field1006 = 0;
				field1224 = 0;
			}

			if (var2 != null) {
				byte[] var5 = signlink.cacheload(var2 + ".mid");
				if (var5 != null && var3 != 12345678) {
					field982.reset();
					field982.update(var5);
					int var6 = (int) field982.getValue();
					if (var3 != var6) {
						var5 = null;
					}
				}

				if (var5 == null) {
					try {
						DataInputStream var7 = method435(var2 + "_" + var3 + ".mid");
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
				method392(var13, true, var12);
			}
		}
	}

	public final void run() {
		if (field956) {
			method491();
		} else if (field1330) {
			method431();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method432() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231 && field978[0] != -1) {
				field962 = true;
				field1100 = 0;
				field1211 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231 && field978[1] != -1) {
				field962 = true;
				field1100 = 1;
				field1211 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231 && field978[2] != -1) {
				field962 = true;
				field1100 = 2;
				field1211 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229 && field978[3] != -1) {
				field962 = true;
				field1100 = 3;
				field1211 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231 && field978[4] != -1) {
				field962 = true;
				field1100 = 4;
				field1211 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231 && field978[5] != -1) {
				field962 = true;
				field1100 = 5;
				field1211 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231 && field978[6] != -1) {
				field962 = true;
				field1100 = 6;
				field1211 = true;
			}

			if (field18 >= 550 && field18 <= 584 && field19 >= 492 && field19 < 528 && field978[7] != -1) {
				field962 = true;
				field1100 = 7;
				field1211 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529 && field978[8] != -1) {
				field962 = true;
				field1100 = 8;
				field1211 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529 && field978[9] != -1) {
				field962 = true;
				field1100 = 9;
				field1211 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528 && field978[10] != -1) {
				field962 = true;
				field1100 = 10;
				field1211 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529 && field978[11] != -1) {
				field962 = true;
				field1100 = 11;
				field1211 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529 && field978[12] != -1) {
				field962 = true;
				field1100 = 12;
				field1211 = true;
			}

			if (field18 >= 734 && field18 <= 768 && field19 >= 492 && field19 < 528 && field978[13] != -1) {
				field962 = true;
				field1100 = 13;
				field1211 = true;
			}

			field1249++;
			if (field1249 > 150) {
				field1249 = 0;
				field1266.method205(233);
				field1266.method206(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILhc;BIIZII)V")
	public final void method433(int arg0, int arg1, class60 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		if (field1343) {
			field1228 = 32;
		} else {
			field1228 = 0;
		}

		field1343 = false;
		if (arg1 >= arg3 && arg1 < arg3 + 16 && arg0 >= arg7 && arg0 < arg7 + 16) {
			arg2.field854 -= field1205 * 4;

			if (arg5) {
				field962 = true;
				return;
			}
		} else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg0 >= arg4 + arg7 - 16 && arg0 < arg4 + arg7) {
			arg2.field854 += field1205 * 4;

			if (arg5) {
				field962 = true;
				return;
			}
		} else if (arg1 >= arg3 - field1228 && arg1 < arg3 + field1228 + 16 && arg0 >= arg7 + 16 && arg0 < arg4 + arg7 - 16 && field1205 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg6;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg7 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg2.field854 = (arg6 - arg4) * var10 / var11;

			if (arg5) {
				field962 = true;
			}

			field1343 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method434() {
		if (field1232 == null) {
			method401();
			field9 = null;
			field1317 = null;
			field1318 = null;
			field1319 = null;
			field1320 = null;
			field1321 = null;
			field1322 = null;
			field1323 = null;
			field1324 = null;
			field1325 = null;
			field1232 = new class43(96, 479, method11());
			field1230 = new class43(160, 168, method11());
			class32.method149();
			field1226.method189(0, 0);
			field1229 = new class43(261, 190, method11());
			field1231 = new class43(334, 512, method11());
			class32.method149();
			field1135 = new class43(61, 501, method11());
			field1136 = new class43(40, 288, method11());
			field1137 = new class43(66, 269, method11());
			field1277 = true;
		}
	}

	public final void init() {
		field1119 = Integer.parseInt(getParameter("nodeid"));
		field1120 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method479();
		} else {
			method429();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1121 = false;
		} else {
			field1121 = true;
		}

		method2(532, 789);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method435(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.h(II)V")
	public final void method436(int arg0) {
		if (arg0 >= 0) {
			if (field980) {
				field980 = false;
				field1034 = true;
			}

			int var2 = field1282[arg0];
			int var3 = field1283[arg0];
			int var4 = field1284[arg0];
			int var5 = field1285[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 450 && method473(var2, var3, var5, 75)) {
				field1266.method207(field1247);
				field1266.method207(field1245);
				field1266.method207(field1246);
			}

			if (var4 == 581) {
				if ((var5 & 0x3) == 0) {
					field977++;
				}

				if (field977 >= 99) {
					field1266.method205(7);
					field1266.method210(0);
				}

				method473(var2, var3, var5, 97);
			}

			if (var4 == 285) {
				method473(var2, var3, var5, 245);
			}

			if (var4 == 900) {
				class25 var6 = field1139[var5];
				if (var6 != null) {
					method484(field1290.field319[0], 0, 2, var6.field319[0], false, 0, var6.field318[0], 1, field1290.field318[0], 1, 0);
					field1053 = field18;
					field1054 = field19;
					field1056 = 2;
					field1055 = 0;
					field1266.method205(202);
					field1266.method207(var5);
					field1266.method207(field1247);
					field1266.method207(field1245);
					field1266.method207(field1246);
				}
			}

			if (var4 == 1102) {
				class55 var7 = class55.method294(var5);
				String var8;
				if (var7.field774 == null) {
					var8 = "It's a " + var7.field773 + ".";
				} else {
					var8 = new String(var7.field774);
				}

				method379(var8, "", 0);
			}

			if (var4 == 1175) {
				int var9 = var5 >> 14 & 0x7FFF;
				class53 var10 = class53.method282(var9);
				String var11;
				if (var10.field706 == null) {
					var11 = "It's a " + var10.field705 + ".";
				} else {
					var11 = new String(var10.field706);
				}

				method379(var11, "", 0);
			}

			if (var4 == 465) {
				field1266.method205(155);
				field1266.method207(var3);
				class60 var12 = class60.field835[var3];
				if (var12.field849 != null && var12.field849[0][0] == 5) {
					int var13 = var12.field849[0][1];
					field1158[var13] = 1 - field1158[var13];
					method441(var13);
					field962 = true;
				}
			}

			if (var4 == 930) {
				class60 var14 = class60.field835[var3];
				field985 = 1;
				field986 = var3;
				field987 = var14.field890;
				field1244 = 0;
				String var15 = var14.field888;
				if (var15.indexOf(" ") != -1) {
					var15 = var15.substring(0, var15.indexOf(" "));
				}

				String var16 = var14.field888;
				if (var16.indexOf(" ") != -1) {
					var16 = var16.substring(var16.indexOf(" ") + 1);
				}

				field988 = var15 + " " + var14.field889 + " " + var16;

				if (field987 == 16) {
					field962 = true;
					field1100 = 3;
					field1211 = true;
				}
			} else {
				if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
					if (var4 == 478) {
						if ((var2 & 0x3) == 0) {
							field1235++;
						}

						if (field1235 >= 90) {
							field1266.method205(220);
						}

						field1266.method205(157);
					}

					if (var4 == 347) {
						field1266.method205(211);
					}

					if (var4 == 405) {
						field1127 += var5;
						if (field1127 >= 97) {
							field1266.method205(30);
							field1266.method209(0xE42D58);
						}

						field1266.method205(195);
					}

					if (var4 == 38) {
						field1266.method205(71);
					}

					if (var4 == 422) {
						field1266.method205(133);
					}

					field1266.method207(var5);
					field1266.method207(var2);
					field1266.method207(var3);
					field1326 = 0;
					field1327 = var3;
					field1328 = var2;
					field1329 = 2;
					if (class60.field835[var3].field841 == field979) {
						field1329 = 1;
					}

					if (class60.field835[var3].field841 == field1045) {
						field1329 = 3;
					}
				}

				if (var4 == 951) {
					class60 var17 = class60.field835[var3];
					boolean var18 = true;
					if (var17.field844 > 0) {
						var18 = method386(var17);
					}

					if (var18) {
						field1266.method205(155);
						field1266.method207(var3);
					}
				}

				if (var4 == 367) {
					class26 var19 = field1214[var5];
					if (var19 != null) {
						method484(field1290.field319[0], 0, 2, var19.field319[0], false, 0, var19.field318[0], 1, field1290.field318[0], 1, 0);
						field1053 = field18;
						field1054 = field19;
						field1056 = 2;
						field1055 = 0;
						field1266.method205(248);
						field1266.method207(var5);
						field1266.method207(field1247);
						field1266.method207(field1245);
						field1266.method207(field1246);
					}
				}

				if (var4 == 265) {
					class25 var20 = field1139[var5];
					if (var20 != null) {
						method484(field1290.field319[0], 0, 2, var20.field319[0], false, 0, var20.field318[0], 1, field1290.field318[0], 1, 0);
						field1053 = field18;
						field1054 = field19;
						field1056 = 2;
						field1055 = 0;
						field1266.method205(134);
						field1266.method207(var5);
						field1266.method207(field986);
					}
				}

				if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
					class25 var21 = field1139[var5];
					if (var21 != null) {
						method484(field1290.field319[0], 0, 2, var21.field319[0], false, 0, var21.field318[0], 1, field1290.field318[0], 1, 0);
						field1053 = field18;
						field1054 = field19;
						field1056 = 2;
						field1055 = 0;

						if (var4 == 542) {
							field1266.method205(8);
						}

						if (var4 == 728) {
							field1266.method205(194);
						}

						if (var4 == 245) {
							if ((var5 & 0x3) == 0) {
								field1163++;
							}

							if (field1163 >= 85) {
								field1266.method205(176);
								field1266.method207(39596);
							}

							field1266.method205(100);
						}

						if (var4 == 6) {
							if ((var5 & 0x3) == 0) {
								field1278++;
							}

							if (field1278 >= 124) {
								field1266.method205(88);
								field1266.method210(0);
							}

							field1266.method205(27);
						}

						if (var4 == 963) {
							field1266.method205(113);
						}

						field1266.method207(var5);
					}
				}

				if (var4 == 1607) {
					class25 var22 = field1139[var5];
					if (var22 != null) {
						String var23;
						if (var22.field322.field744 == null) {
							var23 = "It's a " + var22.field322.field743 + ".";
						} else {
							var23 = new String(var22.field322.field744);
						}

						method379(var23, "", 0);
					}
				}

				if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
					if (var4 == 596) {
						field1266.method205(59);
					}

					if (var4 == 22) {
						field1266.method205(212);
					}

					if (var4 == 602) {
						field1266.method205(31);
					}

					if (var4 == 415) {
						if ((var3 & 0x3) == 0) {
							field1344++;
						}

						if (field1344 >= 55) {
							field1266.method205(17);
							field1266.method210(0);
						}

						field1266.method205(6);
					}

					if (var4 == 892) {
						if ((var2 & 0x3) == 0) {
							field1098++;
						}

						if (field1098 >= 130) {
							field1266.method205(238);
							field1266.method206(177);
						}

						field1266.method205(38);
					}

					field1266.method207(var5);
					field1266.method207(var2);
					field1266.method207(var3);
					field1326 = 0;
					field1327 = var3;
					field1328 = var2;
					field1329 = 2;
					if (class60.field835[var3].field841 == field979) {
						field1329 = 1;
					}

					if (class60.field835[var3].field841 == field1045) {
						field1329 = 3;
					}
				}

				if (var4 == 188) {
					field1244 = 1;
					field1245 = var2;
					field1246 = var3;
					field1247 = var5;
					field1248 = class55.method294(var5).field773;
					field985 = 0;
				} else {
					if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
						String var24 = field1057[arg0];
						int var25 = var24.indexOf("@whi@");
						if (var25 != -1) {
							long var26 = class48.method258(var24.substring(var25 + 5).trim());
							if (var4 == 406) {
								method465(var26);
							}

							if (var4 == 436) {
								method377(var26);
							}

							if (var4 == 557) {
								method374(var26);
							}

							if (var4 == 556) {
								method493(var26);
							}
						}
					}

					if (var4 == 55 && method473(var2, var3, var5, 9)) {
						field1266.method207(field986);
					}

					if (var4 == 660) {
						if (field1167) {
							field1172.method90(var3 - 11, var2 - 8);
						} else {
							field1172.method90(field19 - 11, field18 - 8);
						}
					}

					if (var4 == 504) {
						method473(var2, var3, var5, 172);
					}

					if (var4 == 651) {
						class26 var28 = field1214[var5];
						if (var28 != null) {
							method484(field1290.field319[0], 0, 2, var28.field319[0], false, 0, var28.field318[0], 1, field1290.field318[0], 1, 0);
							field1053 = field18;
							field1054 = field19;
							field1056 = 2;
							field1055 = 0;
							field1266.method205(177);
							field1266.method207(var5);
							field1266.method207(field986);
						}
					}

					if (var4 == 1773) {
						class55 var29 = class55.method294(var5);
						String var30;
						if (var3 >= 100000) {
							var30 = var3 + " x " + var29.field773;
						} else if (var29.field774 == null) {
							var30 = "It's a " + var29.field773 + ".";
						} else {
							var30 = new String(var29.field774);
						}

						method379(var30, "", 0);
					}

					if (var4 == 903 || var4 == 363) {
						String var31 = field1057[arg0];
						int var32 = var31.indexOf("@whi@");
						if (var32 != -1) {
							var31 = var31.substring(var32 + 5).trim();
							String var33 = class48.method262(class48.method259(class48.method258(var31)));
							boolean var34 = false;
							for (int var35 = 0; var35 < field1215; var35++) {
								class26 var36 = field1214[field1216[var35]];
								if (var36 != null && var36.field323 != null && var36.field323.equalsIgnoreCase(var33)) {
									method484(field1290.field319[0], 0, 2, var36.field319[0], false, 0, var36.field318[0], 1, field1290.field318[0], 1, 0);

									if (var4 == 903) {
										field1266.method205(206);
									}

									if (var4 == 363) {
										field1266.method205(164);
									}

									field1266.method207(field1216[var35]);
									var34 = true;
									break;
								}
							}

							if (!var34) {
								method379("Unable to find " + var33, "", 0);
							}
						}
					}

					if (var4 == 391) {
						field1266.method205(48);
						field1266.method207(var5);
						field1266.method207(var2);
						field1266.method207(var3);
						field1266.method207(field986);
						field1326 = 0;
						field1327 = var3;
						field1328 = var2;
						field1329 = 2;
						if (class60.field835[var3].field841 == field979) {
							field1329 = 1;
						}

						if (class60.field835[var3].field841 == field1045) {
							field1329 = 3;
						}
					}

					if (var4 == 1501) {
						field1050 += field1037;
						if (field1050 >= 92) {
							field1266.method205(66);
							field1266.method210(0);
						}

						method473(var2, var3, var5, 116);
					}

					if (var4 == 364) {
						method473(var2, var3, var5, 96);
					}

					if (var4 == 965) {
						boolean var37 = method484(field1290.field319[0], 0, 2, var3, false, 0, var2, 0, field1290.field318[0], 0, 0);
						if (!var37) {
							method484(field1290.field319[0], 0, 2, var3, false, 0, var2, 1, field1290.field318[0], 1, 0);
						}

						field1053 = field18;
						field1054 = field19;
						field1056 = 2;
						field1055 = 0;
						field1266.method205(138);
						field1266.method207(field1036 + var2);
						field1266.method207(field1037 + var3);
						field1266.method207(var5);
						field1266.method207(field986);
					}

					if (var4 == 881) {
						field1266.method205(130);
						field1266.method207(var5);
						field1266.method207(var2);
						field1266.method207(var3);
						field1266.method207(field1247);
						field1266.method207(field1245);
						field1266.method207(field1246);
						field1326 = 0;
						field1327 = var3;
						field1328 = var2;
						field1329 = 2;
						if (class60.field835[var3].field841 == field979) {
							field1329 = 1;
						}

						if (class60.field835[var3].field841 == field1045) {
							field1329 = 3;
						}
					}

					if (var4 == 217) {
						boolean var39 = method484(field1290.field319[0], 0, 2, var3, false, 0, var2, 0, field1290.field318[0], 0, 0);
						if (!var39) {
							method484(field1290.field319[0], 0, 2, var3, false, 0, var2, 1, field1290.field318[0], 1, 0);
						}

						field1053 = field18;
						field1054 = field19;
						field1056 = 2;
						field1055 = 0;
						field1266.method205(239);
						field1266.method207(field1036 + var2);
						field1266.method207(field1037 + var3);
						field1266.method207(var5);
						field1266.method207(field1247);
						field1266.method207(field1245);
						field1266.method207(field1246);
					}

					if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
						boolean var41 = method484(field1290.field319[0], 0, 2, var3, false, 0, var2, 0, field1290.field318[0], 0, 0);
						if (!var41) {
							method484(field1290.field319[0], 0, 2, var3, false, 0, var2, 1, field1290.field318[0], 1, 0);
						}

						field1053 = field18;
						field1054 = field19;
						field1056 = 2;
						field1055 = 0;

						if (var4 == 746) {
							field1266.method205(178);
						}

						if (var4 == 99) {
							field1266.method205(200);
						}

						if (var4 == 224) {
							field1266.method205(140);
						}

						if (var4 == 993) {
							field1266.method205(40);
						}

						if (var4 == 877) {
							field1266.method205(247);
						}

						field1266.method207(field1036 + var2);
						field1266.method207(field1037 + var3);
						field1266.method207(var5);
					}

					if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
						class26 var43 = field1214[var5];
						if (var43 != null) {
							method484(field1290.field319[0], 0, 2, var43.field319[0], false, 0, var43.field318[0], 1, field1290.field318[0], 1, 0);
							field1053 = field18;
							field1054 = field19;
							field1056 = 2;
							field1055 = 0;

							if (var4 == 1373) {
								field1266.method205(206);
							}

							if (var4 == 1101) {
								field1266.method205(164);
							}

							if (var4 == 1544) {
								field1266.method205(185);
							}

							if (var4 == 151) {
								field992++;
								if (field992 >= 90) {
									field1266.method205(2);
									field1266.method207(31114);
								}

								field1266.method205(53);
							}

							field1266.method207(var5);
						}
					}

					if (var4 == 947) {
						method422();
					}

					if (var4 == 679) {
						String var44 = field1057[arg0];
						int var45 = var44.indexOf("@whi@");
						if (var45 != -1) {
							long var46 = class48.method258(var44.substring(var45 + 5).trim());
							int var48 = -1;
							for (int var49 = 0; var49 < field1060; var49++) {
								if (field1201[var49] == var46) {
									var48 = var49;
									break;
								}
							}

							if (var48 != -1 && field1256[var48] > 0) {
								field1034 = true;
								field980 = false;
								field1182 = true;
								field1046 = "";
								field1237 = 3;
								field1075 = field1201[var48];
								field1294 = "Enter message to send to " + field1067[var48];
							}
						}
					}

					if (var4 == 960) {
						field1266.method205(155);
						field1266.method207(var3);
						class60 var50 = class60.field835[var3];
						if (var50.field849 != null && var50.field849[0][0] == 5) {
							int var51 = var50.field849[0][1];
							if (field1158[var51] != var50.field851[0]) {
								field1158[var51] = var50.field851[0];
								method441(var51);
								field962 = true;
							}
						}
					}

					if (var4 == 34) {
						String var52 = field1057[arg0];
						int var53 = var52.indexOf("@whi@");
						if (var53 != -1) {
							method422();
							field1133 = var52.substring(var53 + 5).trim();
							field1064 = false;

							for (int var54 = 0; var54 < class60.field835.length; var54++) {
								if (class60.field835[var54] != null && class60.field835[var54].field844 == 600) {
									field1291 = field979 = class60.field835[var54].field841;
									break;
								}
							}
						}
					}

					if (var4 == 44 && !field1295) {
						field1266.method205(235);
						field1266.method207(var3);
						field1295 = true;
					}

					field1244 = 0;
					field985 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZILkb;)V")
	public final void method437(int arg0, class37 arg1) {
		field1150 = 0;
		field1217 = 0;
		method372(arg1, arg0);
		method421(arg0, arg1);
		method444(arg1, arg0);

		for (int var3 = 0; var3 < field1150; var3++) {
			int var4 = field1151[var3];
			if (field1202 != field1139[var4].field314) {
				field1139[var4].field322 = null;
				field1139[var4] = null;
			}
		}

		if (arg1.field543 != arg0) {
			signlink.reporterror(field1095 + " size mismatch in getnpcpos - pos:" + arg1.field543 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1140; var5++) {
			if (field1139[field1141[var5]] == null) {
				signlink.reporterror(field1095 + " null entry in npc list - pos:" + var5 + " size:" + field1140);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method438() {
		if (field1244 == 0 && field985 == 0) {
			field1057[field1031] = "Walk here";
			field1284[field1031] = 660;
			field1282[field1031] = field15;
			field1283[field1031] = field16;
			field1031++;
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

				if (var6 == 2 && field1172.method82(field1080, var4, var5, var3) >= 0) {
					class53 var8 = class53.method282(var7);
					if (field1244 == 1) {
						field1057[field1031] = "Use " + field1248 + " with @cya@" + var8.field705;
						field1284[field1031] = 450;
						field1285[field1031] = var3;
						field1282[field1031] = var4;
						field1283[field1031] = var5;
						field1031++;
					} else if (field985 != 1) {
						if (var8.field721 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field721[var9] != null) {
									field1057[field1031] = var8.field721[var9] + " @cya@" + var8.field705;

									if (var9 == 0) {
										field1284[field1031] = 285;
									}

									if (var9 == 1) {
										field1284[field1031] = 504;
									}

									if (var9 == 2) {
										field1284[field1031] = 364;
									}

									if (var9 == 3) {
										field1284[field1031] = 581;
									}

									if (var9 == 4) {
										field1284[field1031] = 1501;
									}

									field1285[field1031] = var3;
									field1282[field1031] = var4;
									field1283[field1031] = var5;
									field1031++;
								}
							}
						}

						field1057[field1031] = "Examine @cya@" + var8.field705;
						field1284[field1031] = 1175;
						field1285[field1031] = var3;
						field1282[field1031] = var4;
						field1283[field1031] = var5;
						field1031++;
					} else if ((field987 & 0x4) == 4) {
						field1057[field1031] = field988 + " @cya@" + var8.field705;
						field1284[field1031] = 55;
						field1285[field1031] = var3;
						field1282[field1031] = var4;
						field1283[field1031] = var5;
						field1031++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field1139[var7];
					if (var10.field322.field745 == 1 && (var10.field270 & 0x7F) == 0x40 && (var10.field271 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1140; var11++) {
							class25 var12 = field1139[field1141[var11]];
							if (var12 != null && var10 != var12 && var12.field322.field745 == 1 && var10.field270 == var12.field270 && var10.field271 == var12.field271) {
								method412(var5, field1141[var11], var4, var12.field322);
							}
						}
					}

					method412(var5, var7, var4, var10.field322);
				}

				if (var6 == 0) {
					class26 var13 = field1214[var7];
					if ((var13.field270 & 0x7F) == 0x40 && (var13.field271 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1140; var14++) {
							class25 var15 = field1139[field1141[var14]];
							if (var15 != null && var15.field322.field745 == 1 && var13.field270 == var15.field270 && var13.field271 == var15.field271) {
								method412(var5, field1141[var14], var4, var15.field322);
							}
						}

						for (int var16 = 0; var16 < field1215; var16++) {
							class26 var17 = field1214[field1216[var16]];
							if (var17 != null && var13 != var17 && var13.field270 == var17.field270 && var13.field271 == var17.field271) {
								method468(var17, var5, var4, field1216[var16]);
							}
						}
					}

					method468(var13, var5, var4, var7);
				}

				if (var6 == 3) {
					class41 var18 = field1262[field1080][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method236(); var19 != null; var19 = (class22) var18.method238()) {
							class55 var20 = class55.method294(var19.field268);
							if (field1244 == 1) {
								field1057[field1031] = "Use " + field1248 + " with @lre@" + var20.field773;
								field1284[field1031] = 217;
								field1285[field1031] = var19.field268;
								field1282[field1031] = var4;
								field1283[field1031] = var5;
								field1031++;
							} else if (field985 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field787 != null && var20.field787[var21] != null) {
										field1057[field1031] = var20.field787[var21] + " @lre@" + var20.field773;

										if (var21 == 0) {
											field1284[field1031] = 224;
										}

										if (var21 == 1) {
											field1284[field1031] = 993;
										}

										if (var21 == 2) {
											field1284[field1031] = 99;
										}

										if (var21 == 3) {
											field1284[field1031] = 746;
										}

										if (var21 == 4) {
											field1284[field1031] = 877;
										}

										field1285[field1031] = var19.field268;
										field1282[field1031] = var4;
										field1283[field1031] = var5;
										field1031++;
									} else if (var21 == 2) {
										field1057[field1031] = "Take @lre@" + var20.field773;
										field1284[field1031] = 99;
										field1285[field1031] = var19.field268;
										field1282[field1031] = var4;
										field1283[field1031] = var5;
										field1031++;
									}
								}

								field1057[field1031] = "Examine @lre@" + var20.field773;
								field1284[field1031] = 1102;
								field1285[field1031] = var19.field268;
								field1282[field1031] = var4;
								field1283[field1031] = var5;
								field1031++;
							} else if ((field987 & 0x1) == 1) {
								field1057[field1031] = field988 + " @lre@" + var20.field773;
								field1284[field1031] = 965;
								field1285[field1031] = var19.field268;
								field1282[field1031] = var4;
								field1283[field1031] = var5;
								field1031++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILkb;B)V")
	public final void method439(int arg0, class37 arg1) {
		while (arg1.field544 + 10 < arg0 * 8) {
			int var3 = arg1.method227(11);
			if (var3 == 2047) {
				break;
			}

			if (field1214[var3] == null) {
				field1214[var3] = new class26();
				if (field1219[var3] != null) {
					field1214[var3].method114(field1219[var3]);
				}
			}

			field1216[field1215++] = var3;
			class26 var4 = field1214[var3];
			var4.field314 = field1202;
			int var5 = arg1.method227(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method227(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method227(1);
			var4.method110(field1290.field318[0] + var5, var7 == 1, field1290.field319[0] + var6);
			int var8 = arg1.method227(1);
			if (var8 == 1) {
				field1218[field1217++] = var3;
			}
		}

		arg1.method228();
	}

	@ObfuscatedName("client.a(Lkb;IZ)V")
	public final void method440(class37 arg0, int arg1) {
		for (int var3 = 0; var3 < field1217; var3++) {
			int var4 = field1218[var3];
			class26 var5 = field1214[var4];
			int var6 = arg0.method216();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method216() << 8;
			}

			method445(var4, var5, arg0, var6);
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method441(int arg0) {
		int var2 = class64.field929[arg0].field937;
		if (var2 != 0) {
			int var3 = field1158[arg0];
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
				field1277 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1105;

				if (var3 == 0) {
					method478(0, field1105);
					field1105 = true;
				}

				if (var3 == 1) {
					method478(-400, field1105);
					field1105 = true;
				}

				if (var3 == 2) {
					method478(-800, field1105);
					field1105 = true;
				}

				if (var3 == 3) {
					method478(-1200, field1105);
					field1105 = true;
				}

				if (var3 == 4) {
					field1105 = false;
				}

				if (field1105 != var4) {
					if (field1105) {
						method485(field1028, field1173, field1238);
					} else {
						method390();
					}

					field975 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1027 = true;
					method385(0);
				}

				if (var3 == 1) {
					field1027 = true;
					method385(-400);
				}

				if (var3 == 2) {
					field1027 = true;
					method385(-800);
				}

				if (var3 == 3) {
					field1027 = true;
					method385(-1200);
				}

				if (var3 == 4) {
					field1027 = false;
				}
			}

			if (var2 == 5) {
				field1339 = var3;
			}

			if (var2 == 6) {
				field1084 = var3;
			}

			if (var2 == 8) {
				field1241 = var3;
				field1034 = true;
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method442() {
		for (int var1 = 0; var1 < field1140; var1++) {
			class25 var2 = field1139[field1141[var1]];
			int var3 = (field1141[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method112()) {
				int var4 = var2.field270 >> 7;
				int var5 = var2.field271 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field274 == 1 && (var2.field270 & 0x7F) == 0x40 && (var2.field271 & 0x7F) == 0x40) {
						if (field1269[var4][var5] == field1195) {
							continue;
						}

						field1269[var4][var5] = field1195;
					}

					field1172.method62((var2.field274 - 1) * 64 + 60, var2.field270, var2.field271, null, var3, method495(var2.field271, field1080, var2.field270), var2.field272, field1080, var2, var2.field273);
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method443() {
		field1229.method242();
		class33.field505 = field1337;
		field1225.method189(0, 0);

		if (field1298 != -1) {
			method371(0, 0, class60.field835[field1298], 0);
		} else if (field978[field1100] != -1) {
			method371(0, 0, class60.field835[field978[field1100]], 0);
		}

		if (field1167 && field1022 == 1) {
			method409();
		}

		field1229.method243(field8, 231, 562);
		field1231.method242();
		class33.field505 = field1338;
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void method444(class37 arg0, int arg1) {
		for (int var3 = 0; var3 < field1217; var3++) {
			int var4 = field1218[var3];
			class25 var5 = field1139[var4];
			int var6 = arg0.method216();
			if ((var6 & 0x2) == 2) {
				int var7 = arg0.method218();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field297 == var7) {
					var5.field301 = 0;
				}

				int var8 = arg0.method216();
				if (var7 == -1 || var5.field297 == -1 || class62.field901[var7].field909 > class62.field901[var5.field297].field909 || class62.field901[var5.field297].field909 == 0) {
					var5.field297 = var7;
					var5.field298 = 0;
					var5.field299 = 0;
					var5.field300 = var8;
					var5.field301 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field291 = arg0.method218();
				if (var5.field291 == 0xFFFF) {
					var5.field291 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field282 = arg0.method223();
				var5.field283 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field286 = arg0.method216();
				var5.field287 = arg0.method216();
				var5.field288 = field1202 + 400;
				var5.field289 = arg0.method216();
				var5.field290 = arg0.method216();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field322 = class54.method288(arg0.method218());
				var5.field277 = var5.field322.field749;
				var5.field278 = var5.field322.field750;
				var5.field279 = var5.field322.field751;
				var5.field280 = var5.field322.field752;
				var5.field275 = var5.field322.field748;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field302 = arg0.method218();
				int var9 = arg0.method221();
				var5.field306 = var9 >> 16;
				var5.field305 = (var9 & 0xFFFF) + field1202;
				var5.field303 = 0;
				var5.field304 = 0;

				if (var5.field305 > field1202) {
					var5.field303 = -1;
				}

				if (var5.field302 == 0xFFFF) {
					var5.field302 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field292 = arg0.method218();
				var5.field293 = arg0.method218();
			}
		}
	}

	@ObfuscatedName("client.a(ILz;Lkb;II)V")
	public final void method445(int arg0, class26 arg1, class37 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg2.method216();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg2.method225(var5, var6, 0);
			field1219[arg0] = var7;
			arg1.method114(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg2.method218();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg1.field297 == var8) {
				arg1.field301 = 0;
			}

			int var9 = arg2.method216();
			if (var8 == -1 || arg1.field297 == -1 || class62.field901[var8].field909 > class62.field901[arg1.field297].field909 || class62.field901[arg1.field297].field909 == 0) {
				arg1.field297 = var8;
				arg1.field298 = 0;
				arg1.field299 = 0;
				arg1.field300 = var9;
				arg1.field301 = 0;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg1.field291 = arg2.method218();
			if (arg1.field291 == 0xFFFF) {
				arg1.field291 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg1.field282 = arg2.method223();
			arg1.field284 = 0;
			arg1.field285 = 0;
			arg1.field283 = 150;
			method379(arg1.field282, arg1.field323, 2);
		}

		if ((arg3 & 0x10) == 0x10) {
			arg1.field286 = arg2.method216();
			arg1.field287 = arg2.method216();
			arg1.field288 = field1202 + 400;
			arg1.field289 = arg2.method216();
			arg1.field290 = arg2.method216();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg1.field292 = arg2.method218();
			arg1.field293 = arg2.method218();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var10 = arg2.method218();
			int var11 = arg2.method216();
			int var12 = arg2.method216();
			int var13 = arg2.field543;

			if (arg1.field323 != null) {
				long var14 = class48.method258(arg1.field323);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1160; var17++) {
						if (field1107[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1029 == 0) {
					try {
						String var18 = class49.method265(arg2, var12);
						var18 = class65.method343(var18);
						arg1.field282 = var18;
						arg1.field284 = var10 >> 8;
						arg1.field285 = var10 & 0xFF;
						arg1.field283 = 150;

						if (var11 > 1) {
							method379(var18, arg1.field323, 1);
						} else {
							method379(var18, arg1.field323, 2);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field543 = var12 + var13;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg1.field302 = arg2.method218();
			int var20 = arg2.method221();
			arg1.field306 = var20 >> 16;
			arg1.field305 = (var20 & 0xFFFF) + field1202;
			arg1.field303 = 0;
			arg1.field304 = 0;

			if (arg1.field305 > field1202) {
				arg1.field303 = -1;
			}

			if (arg1.field302 == 0xFFFF) {
				arg1.field302 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg1.field307 = arg2.method216();
			arg1.field309 = arg2.method216();
			arg1.field308 = arg2.method216();
			arg1.field310 = arg2.method216();
			arg1.field311 = arg2.method218() + field1202;
			arg1.field312 = arg2.method218() + field1202;
			arg1.field313 = arg2.method216();
			arg1.field317 = 0;
			arg1.field318[0] = arg1.field308;
			arg1.field319[0] = arg1.field310;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method446() {
		if (field1241 != 0) {
			class36 var1 = field1129;
			int var2 = 0;
			if (field1264 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1125[var3] != null) {
					int var4 = field1123[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field974 == 0 || field974 == 1 && method470(field1124[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method194(var5, "From " + field1124[var3] + ": " + field1125[var3], 0, 4);
						var1.method194(var5 - 1, "From " + field1124[var3] + ": " + field1125[var3], 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field974 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method194(var6, field1125[var3], 0, 4);
						var1.method194(var6 - 1, field1125[var3], 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field974 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method194(var7, "To " + field1124[var3] + ": " + field1125[var3], 0, 4);
						var1.method194(var7 - 1, "To " + field1124[var3] + ": " + field1125[var3], 0xFFFF, 4);
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
	public final void method447() {
		for (class28 var1 = (class28) field1014.method235(); var1 != null; var1 = (class28) field1014.method237()) {
			if (field1080 != var1.field370 || var1.field376) {
				var1.method108();
			} else if (field1202 >= var1.field369) {
				var1.method119(field1292);

				if (var1.field376) {
					var1.method108();
				} else {
					field1172.method62(60, var1.field371, var1.field372, null, -1, var1.field373, 0, var1.field370, var1, false);
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method448() {
		for (int var1 = 0; var1 < field1140; var1++) {
			int var2 = field1141[var1];
			class25 var3 = field1139[var2];
			if (var3 != null) {
				method449(var3, var3.field322.field745);
			}
		}
	}

	@ObfuscatedName("client.a(Lx;ZI)V")
	public final void method449(class24 arg0, int arg1) {
		if (arg0.field270 < 128 || arg0.field271 < 128 || arg0.field270 >= 13184 || arg0.field271 >= 13184) {
			arg0.field297 = -1;
			arg0.field302 = -1;
			arg0.field311 = 0;
			arg0.field312 = 0;
			arg0.field270 = arg0.field318[0] * 128 + arg0.field274 * 64;
			arg0.field271 = arg0.field319[0] * 128 + arg0.field274 * 64;
			arg0.field317 = 0;
		}

		if (field1290 == arg0 && (arg0.field270 < 1536 || arg0.field271 < 1536 || arg0.field270 >= 11776 || arg0.field271 >= 11776)) {
			arg0.field297 = -1;
			arg0.field302 = -1;
			arg0.field311 = 0;
			arg0.field312 = 0;
			arg0.field270 = arg0.field318[0] * 128 + arg0.field274 * 64;
			arg0.field271 = arg0.field319[0] * 128 + arg0.field274 * 64;
			arg0.field317 = 0;
		}

		if (arg0.field311 > field1202) {
			method450(arg0);
		} else if (arg0.field312 >= field1202) {
			method451(arg0);
		} else {
			method452(arg0);
		}

		method453(arg0);
		method454(arg0);
	}

	@ObfuscatedName("client.a(Lx;I)V")
	public final void method450(class24 arg0) {
		int var2 = arg0.field311 - field1202;
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

	@ObfuscatedName("client.b(Lx;I)V")
	public final void method451(class24 arg0) {
		if (field1202 == arg0.field312 || arg0.field297 == -1 || arg0.field300 != 0 || arg0.field299 + 1 > class62.field901[arg0.field297].field905[arg0.field298]) {
			int var2 = arg0.field312 - arg0.field311;
			int var3 = field1202 - arg0.field311;
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

	@ObfuscatedName("client.c(Lx;I)V")
	public final void method452(class24 arg0) {
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

	@ObfuscatedName("client.a(ZLx;)V")
	public final void method453(class24 arg0) {
		if (arg0.field291 != -1 && arg0.field291 < 32768) {
			class25 var2 = field1139[arg0.field291];
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
			if (field1138 == var5) {
				var5 = field1213;
			}

			class26 var6 = field1214[var5];
			if (var6 != null) {
				int var7 = arg0.field270 - var6.field270;
				int var8 = arg0.field271 - var6.field271;
				if (var7 != 0 || var8 != 0) {
					arg0.field316 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field292 != 0 || arg0.field293 != 0) && (arg0.field317 == 0 || arg0.field321 > 0)) {
			int var9 = arg0.field270 - (arg0.field292 - field1036 - field1036) * 64;
			int var10 = arg0.field271 - (arg0.field293 - field1037 - field1037) * 64;
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

	@ObfuscatedName("client.a(ILx;)V")
	public final void method454(class24 arg0) {
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

		if (arg0.field302 != -1 && field1202 >= arg0.field305) {
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

	@ObfuscatedName("client.j(B)V")
	public final void method455() {
		if (field1277) {
			field1277 = false;
			field963.method243(field8, 11, 0);
			field964.method243(field8, 375, 0);
			field965.method243(field8, 5, 729);
			field966.method243(field8, 231, 752);
			field967.method243(field8, 0, 0);
			field968.method243(field8, 0, 561);
			field969.method243(field8, 11, 520);
			field970.method243(field8, 231, 520);
			field971.method243(field8, 375, 501);
			field972.method243(field8, 345, 0);
			field962 = true;
			field1034 = true;
			field1211 = true;
			field1250 = true;

			if (field1073 != 2) {
				field1231.method243(field8, 11, 8);
				field1230.method243(field8, 5, 561);
			}
		}

		if (field1073 == 2) {
			method469();
		}

		if (field1167 && field1022 == 1) {
			field962 = true;
		}

		if (field1298 != -1) {
			boolean var1 = method476(field1298, field1292);
			if (var1) {
				field962 = true;
			}
		}

		if (field1329 == 2) {
			field962 = true;
		}

		if (field1011 == 2) {
			field962 = true;
		}

		if (field962) {
			method443();
			field962 = false;
		}

		if (field1045 == -1) {
			field976.field854 = field1063 - field990 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method433(field16 - 375, field15 - 22, field976, 463, 77, false, field1063, 0);
			}

			int var2 = field1063 - field976.field854 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1063 - 77) {
				var2 = field1063 - 77;
			}

			if (field990 != var2) {
				field990 = var2;
				field1034 = true;
			}
		}

		if (field1045 != -1) {
			boolean var3 = method476(field1045, field1292);
			if (var3) {
				field1034 = true;
			}
		}

		if (field1329 == 3) {
			field1034 = true;
		}

		if (field1011 == 3) {
			field1034 = true;
		}

		if (field1165 != null) {
			field1034 = true;
		}

		if (field1167 && field1022 == 2) {
			field1034 = true;
		}

		if (field1034) {
			method428();
			field1034 = false;
		}

		if (field1073 == 2) {
			method413();
			field1230.method243(field8, 5, 561);
		}

		if (field1287 != -1) {
			field1211 = true;
		}

		if (field1211) {
			if (field1287 != -1 && field1287 == field1100) {
				field1287 = -1;
				field1266.method205(175);
				field1266.method206(field1100);
			}

			field1211 = false;
			field1137.method242();
			field1188.method189(0, 0);

			if (field1298 == -1) {
				if (field978[field1100] != -1) {
					if (field1100 == 0) {
						field1145.method189(30, 29);
					}

					if (field1100 == 1) {
						field1146.method189(29, 59);
					}

					if (field1100 == 2) {
						field1146.method189(29, 87);
					}

					if (field1100 == 3) {
						field1147.method189(29, 115);
					}

					if (field1100 == 4) {
						field1149.method189(29, 156);
					}

					if (field1100 == 5) {
						field1149.method189(29, 184);
					}

					if (field1100 == 6) {
						field1148.method189(30, 212);
					}
				}

				if (field978[0] != -1 && (field1287 != 0 || field1202 % 20 < 10)) {
					field989[0].method189(34, 35);
				}

				if (field978[1] != -1 && (field1287 != 1 || field1202 % 20 < 10)) {
					field989[1].method189(32, 59);
				}

				if (field978[2] != -1 && (field1287 != 2 || field1202 % 20 < 10)) {
					field989[2].method189(32, 86);
				}

				if (field978[3] != -1 && (field1287 != 3 || field1202 % 20 < 10)) {
					field989[3].method189(33, 121);
				}

				if (field978[4] != -1 && (field1287 != 4 || field1202 % 20 < 10)) {
					field989[4].method189(34, 157);
				}

				if (field978[5] != -1 && (field1287 != 5 || field1202 % 20 < 10)) {
					field989[5].method189(32, 185);
				}

				if (field978[6] != -1 && (field1287 != 6 || field1202 % 20 < 10)) {
					field989[6].method189(34, 212);
				}
			}

			field1137.method243(field8, 165, 520);
			field1136.method242();
			field1187.method189(0, 0);

			if (field1298 == -1) {
				if (field978[field1100] != -1) {
					if (field1100 == 7) {
						field1189.method189(0, 49);
					}

					if (field1100 == 8) {
						field1190.method189(0, 81);
					}

					if (field1100 == 9) {
						field1190.method189(0, 108);
					}

					if (field1100 == 10) {
						field1191.method189(1, 136);
					}

					if (field1100 == 11) {
						field1193.method189(0, 178);
					}

					if (field1100 == 12) {
						field1193.method189(0, 205);
					}

					if (field1100 == 13) {
						field1192.method189(0, 233);
					}
				}

				if (field978[8] != -1 && (field1287 != 8 || field1202 % 20 < 10)) {
					field989[7].method189(2, 80);
				}

				if (field978[9] != -1 && (field1287 != 9 || field1202 % 20 < 10)) {
					field989[8].method189(3, 107);
				}

				if (field978[10] != -1 && (field1287 != 10 || field1202 % 20 < 10)) {
					field989[9].method189(4, 142);
				}

				if (field978[11] != -1 && (field1287 != 11 || field1202 % 20 < 10)) {
					field989[10].method189(2, 179);
				}

				if (field978[12] != -1 && (field1287 != 12 || field1202 % 20 < 10)) {
					field989[11].method189(2, 206);
				}

				if (field978[13] != -1 && (field1287 != 13 || field1202 % 20 < 10)) {
					field989[12].method189(2, 230);
				}
			}

			field1136.method243(field8, 492, 501);
			field1231.method242();
		}

		if (field1250) {
			field1250 = false;
			field1135.method242();
			field1186.method189(0, 0);
			field1129.method192("Public chat", true, 0xFFFFFF, 57, 33);

			if (field1334 == 0) {
				field1129.method192("On", true, 0xFF00, 57, 46);
			}

			if (field1334 == 1) {
				field1129.method192("Friends", true, 0xFFFF00, 57, 46);
			}

			if (field1334 == 2) {
				field1129.method192("Off", true, 0xFF0000, 57, 46);
			}

			if (field1334 == 3) {
				field1129.method192("Hide", true, 0xFFFF, 57, 46);
			}

			field1129.method192("Private chat", true, 0xFFFFFF, 186, 33);

			if (field974 == 0) {
				field1129.method192("On", true, 0xFF00, 186, 46);
			}

			if (field974 == 1) {
				field1129.method192("Friends", true, 0xFFFF00, 186, 46);
			}

			if (field974 == 2) {
				field1129.method192("Off", true, 0xFF0000, 186, 46);
			}

			field1129.method192("Trade/duel", true, 0xFFFFFF, 326, 33);

			if (field1099 == 0) {
				field1129.method192("On", true, 0xFF00, 326, 46);
			}

			if (field1099 == 1) {
				field1129.method192("Friends", true, 0xFFFF00, 326, 46);
			}

			if (field1099 == 2) {
				field1129.method192("Off", true, 0xFF0000, 326, 46);
			}

			field1129.method192("Report abuse", true, 0xFFFFFF, 462, 38);
			field1135.method243(field8, 471, 0);
			field1231.method242();
		}

		field1292 = 0;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method456() {
		for (class40 var1 = (class40) field1333.method235(); var1 != null; var1 = (class40) field1333.method237()) {
			boolean var2 = false;
			var1.field579 += field1292;

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
					var6 = field1172.method78(var3, var4, var5);
				}

				if (var1.field573 == 1) {
					var6 = field1172.method79(var4, var3, var5);
				}

				if (var1.field573 == 2) {
					var6 = field1172.method80(var3, var4, var5);
				}

				if (var1.field573 == 3) {
					var6 = field1172.method81(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field576) {
					int var7 = field1005[var3][var4][var5];
					int var8 = field1005[var3][var4 + 1][var5];
					int var9 = field1005[var3][var4 + 1][var5 + 1];
					int var10 = field1005[var3][var4][var5 + 1];
					class53 var11 = class53.method282(var1.field576);
					int var12 = -1;
					if (var1.field578 != -1) {
						var12 = var1.field577.field903[var1.field578];
					}

					if (var1.field573 == 2) {
						int var13 = field1172.method82(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						class31 var16 = var11.method285(var14, var15, var7, var8, var9, var10, var12);
						field1172.method67(var16, var3, var5, var4);
					} else if (var1.field573 == 1) {
						class31 var17 = var11.method285(4, 0, var7, var8, var9, var10, var12);
						field1172.method69(var5, var4, var3, var17);
					} else if (var1.field573 == 0) {
						int var18 = field1172.method82(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							class31 var22 = var11.method285(2, var20 + 4, var7, var8, var9, var10, var12);
							class31 var23 = var11.method285(2, var21, var7, var8, var9, var10, var12);
							field1172.method72(var23, var3, var5, var4, var22);
						} else {
							class31 var24 = var11.method285(var19, var20, var7, var8, var9, var10, var12);
							field1172.method71(var4, var3, var24, var5);
						}
					} else if (var1.field573 == 3) {
						int var25 = field1172.method82(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						class31 var27 = var11.method285(22, var26, var7, var8, var9, var10, var12);
						field1172.method70(var5, var4, var3, var27);
					}
				} else {
					var1.method108();
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method457() {
		for (int var1 = -1; var1 < field1215; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1213;
			} else {
				var2 = field1216[var1];
			}

			class26 var3 = field1214[var2];
			if (var3 != null && var3.field283 > 0) {
				var3.field283--;
				if (var3.field283 == 0) {
					var3.field282 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1140; var4++) {
			int var5 = field1141[var4];
			class25 var6 = field1139[var5];
			if (var6 != null && var6.field283 > 0) {
				var6.field283--;
				if (var6.field283 == 0) {
					var6.field282 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method458() {
		field1296 = new class35(field984, "titlebox", 0);
		field1297 = new class35(field984, "titlebutton", 0);
		field1279 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1279[var1] = new class35(field984, "runes", var1);
		}

		field1103 = new class34(128, 265);
		field1104 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1103.field517[var2] = field1320.field583[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1104.field517[var3] = field1321.field583[var3];
		}

		field1175 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1175[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1175[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1175[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1175[var7 + 192] = 0xFFFFFF;
		}

		field1176 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1176[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1176[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1176[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1176[var11 + 192] = 0xFFFFFF;
		}

		field1177 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1177[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1177[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1177[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1177[var15 + 192] = 0xFFFFFF;
		}

		field1174 = new int[256];
		field1258 = new int[32768];
		field1259 = new int[32768];
		method399(null);
		field1108 = new int[32768];
		field1109 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1101) {
			field956 = true;
			field1101 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field1311 && !field1089 && !field1061) {
			field1202++;

			if (field1032) {
				method415();
			} else {
				method494();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIILhc;)V")
	public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5) {
		if (arg5.field842 == 0 && arg5.field856 != null && !arg5.field855 && (arg4 >= arg0 && arg3 >= arg2 && arg4 <= arg5.field845 + arg0 && arg3 <= arg5.field846 + arg2)) {
			int var7 = arg5.field856.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field857[var8] + arg0;
				int var10 = arg5.field858[var8] + arg2 - arg1;
				class60 var11 = class60.field835[arg5.field856[var8]];
				var9 += var11.field847;
				var10 += var11.field848;
				if ((var11.field852 >= 0 || var11.field878 != 0) && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
					if (var11.field852 >= 0) {
						field994 = var11.field852;
					} else {
						field994 = var11.field840;
					}
				}

				if (var11.field842 == 0) {
					method459(var9, var11.field854, var10, arg3, arg4, var11);

					if (var11.field853 > var11.field846) {
						method433(arg3, arg4, var11, var11.field845 + var9, var11.field846, true, var11.field853, var10);
					}
				} else {
					if (var11.field843 == 1 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						boolean var12 = false;
						if (var11.field844 != 0) {
							var12 = method482(var11);
						}

						if (!var12) {
							field1057[field1031] = var11.field891;
							field1284[field1031] = 951;
							field1283[field1031] = var11.field840;
							field1031++;
						}
					}

					if (var11.field843 == 2 && field985 == 0 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						String var13 = var11.field888;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1057[field1031] = var13 + " @gre@" + var11.field889;
						field1284[field1031] = 930;
						field1283[field1031] = var11.field840;
						field1031++;
					}

					if (var11.field843 == 3 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1057[field1031] = "Close";
						field1284[field1031] = 947;
						field1283[field1031] = var11.field840;
						field1031++;
					}

					if (var11.field843 == 4 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1057[field1031] = var11.field891;
						field1284[field1031] = 465;
						field1283[field1031] = var11.field840;
						field1031++;
					}

					if (var11.field843 == 5 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1057[field1031] = var11.field891;
						field1284[field1031] = 960;
						field1283[field1031] = var11.field840;
						field1031++;
					}

					if (var11.field843 == 6 && !field1295 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field845 + var9 && arg3 < var11.field846 + var10) {
						field1057[field1031] = var11.field891;
						field1284[field1031] = 44;
						field1283[field1031] = var11.field840;
						field1031++;
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

								if (arg4 >= var17 && arg3 >= var18 && arg4 < var17 + 32 && arg3 < var18 + 32) {
									field1252 = var14;
									field1253 = var11.field840;

									if (var11.field836[var14] > 0) {
										class55 var19 = class55.method294(var11.field836[var14] - 1);
										if (field1244 == 1 && var11.field862) {
											if (field1246 != var11.field840 || field1245 != var14) {
												field1057[field1031] = "Use " + field1248 + " with @lre@" + var19.field773;
												field1284[field1031] = 881;
												field1285[field1031] = var19.field771;
												field1282[field1031] = var14;
												field1283[field1031] = var11.field840;
												field1031++;
											}
										} else if (field985 != 1 || !var11.field862) {
											if (var11.field862) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field788 != null && var19.field788[var20] != null) {
														field1057[field1031] = var19.field788[var20] + " @lre@" + var19.field773;

														if (var20 == 3) {
															field1284[field1031] = 478;
														}

														if (var20 == 4) {
															field1284[field1031] = 347;
														}

														field1285[field1031] = var19.field771;
														field1282[field1031] = var14;
														field1283[field1031] = var11.field840;
														field1031++;
													} else if (var20 == 4) {
														field1057[field1031] = "Drop @lre@" + var19.field773;
														field1284[field1031] = 347;
														field1285[field1031] = var19.field771;
														field1282[field1031] = var14;
														field1283[field1031] = var11.field840;
														field1031++;
													}
												}
											}

											if (var11.field863) {
												field1057[field1031] = "Use @lre@" + var19.field773;
												field1284[field1031] = 188;
												field1285[field1031] = var19.field771;
												field1282[field1031] = var14;
												field1283[field1031] = var11.field840;
												field1031++;
											}

											if (var11.field862 && var19.field788 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field788[var21] != null) {
														field1057[field1031] = var19.field788[var21] + " @lre@" + var19.field773;

														if (var21 == 0) {
															field1284[field1031] = 405;
														}

														if (var21 == 1) {
															field1284[field1031] = 38;
														}

														if (var21 == 2) {
															field1284[field1031] = 422;
														}

														field1285[field1031] = var19.field771;
														field1282[field1031] = var14;
														field1283[field1031] = var11.field840;
														field1031++;
													}
												}
											}

											if (var11.field869 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field869[var22] != null) {
														field1057[field1031] = var11.field869[var22] + " @lre@" + var19.field773;

														if (var22 == 0) {
															field1284[field1031] = 602;
														}

														if (var22 == 1) {
															field1284[field1031] = 596;
														}

														if (var22 == 2) {
															field1284[field1031] = 22;
														}

														if (var22 == 3) {
															field1284[field1031] = 892;
														}

														if (var22 == 4) {
															field1284[field1031] = 415;
														}

														field1285[field1031] = var19.field771;
														field1282[field1031] = var14;
														field1283[field1031] = var11.field840;
														field1031++;
													}
												}
											}

											field1057[field1031] = "Examine @lre@" + var19.field773;
											field1284[field1031] = 1773;
											field1285[field1031] = var19.field771;
											field1283[field1031] = var11.field837[var14];
											field1031++;
										} else if ((field987 & 0x10) == 0x10) {
											field1057[field1031] = field988 + " @lre@" + var19.field773;
											field1284[field1031] = 391;
											field1285[field1031] = var19.field771;
											field1282[field1031] = var14;
											field1283[field1031] = var11.field840;
											field1031++;
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

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public final String method460(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method461() {
		field1210 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1267[var1] = -1;
			for (int var2 = 0; var2 < class59.field827; var2++) {
				if (!class59.field828[var2].field834 && class59.field828[var2].field829 == var1 + (field1239 ? 0 : 7)) {
					field1267[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method10() {
		field1277 = true;
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method462(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(Lhc;I)Z")
	public final boolean method463(class60 arg0) {
		if (arg0.field850 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field850.length; var2++) {
			int var3 = method466(arg0, var2);
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

	@ObfuscatedName("client.B(I)V")
	public final void method464() {
		int var1 = field1301 * 128 + 64;
		int var2 = field1302 * 128 + 64;
		int var3 = method495(field1302, field1080, field1301) - field1303;

		if (field1152 < var1) {
			field1152 += (var1 - field1152) * field1305 / 1000 + field1304;
			if (field1152 > var1) {
				field1152 = var1;
			}
		}

		if (field1152 > var1) {
			field1152 -= (field1152 - var1) * field1305 / 1000 + field1304;
			if (field1152 < var1) {
				field1152 = var1;
			}
		}

		if (field1153 < var3) {
			field1153 += (var3 - field1153) * field1305 / 1000 + field1304;
			if (field1153 > var3) {
				field1153 = var3;
			}
		}

		if (field1153 > var3) {
			field1153 -= (field1153 - var3) * field1305 / 1000 + field1304;
			if (field1153 < var3) {
				field1153 = var3;
			}
		}

		if (field1154 < var2) {
			field1154 += (var2 - field1154) * field1305 / 1000 + field1304;
			if (field1154 > var2) {
				field1154 = var2;
			}
		}

		if (field1154 > var2) {
			field1154 -= (field1154 - var2) * field1305 / 1000 + field1304;
			if (field1154 < var2) {
				field1154 = var2;
			}
		}

		int var4 = field1090 * 128 + 64;
		int var5 = field1091 * 128 + 64;
		int var6 = method495(field1091, field1080, field1090) - field1092;
		int var7 = var4 - field1152;
		int var8 = var6 - field1153;
		int var9 = var5 - field1154;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1155 < var11) {
			field1155 += (var11 - field1155) * field1094 / 1000 + field1093;
			if (field1155 > var11) {
				field1155 = var11;
			}
		}

		if (field1155 > var11) {
			field1155 -= (field1155 - var11) * field1094 / 1000 + field1093;
			if (field1155 < var11) {
				field1155 = var11;
			}
		}

		int var13 = var12 - field1156;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1156 += field1094 * var13 / 1000 + field1093;
			field1156 &= 0x7FF;
		}

		if (var13 < 0) {
			field1156 -= -var13 * field1094 / 1000 + field1093;
			field1156 &= 0x7FF;
		}

		int var14 = var12 - field1156;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1156 = var12;
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method465(long arg0) {
		if (arg0 != 0L) {
			if (field1060 >= 100) {
				method379("Your friends list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = class48.method262(class48.method259(arg0));
				for (int var4 = 0; var4 < field1060; var4++) {
					if (field1201[var4] == arg0) {
						method379(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1160; var5++) {
					if (field1107[var5] == arg0) {
						method379("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field1290.field323)) {
					field1067[field1060] = var3;
					field1201[field1060] = arg0;
					field1256[field1060] = 0;
					field1060++;
					field962 = true;
					field1266.method205(118);
					field1266.method212(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILhc;I)I")
	public final int method466(class60 arg0, int arg1) {
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
					var4 += field1183[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field973[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1242[var3[var5++]];
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
					var4 += field1158[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1048[field973[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1158[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1290.field329;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field973[var10];
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
					var4 += field1007;
				}

				if (var6 == 12) {
					var4 += field1106;
				}

				if (var6 == 13) {
					int var14 = field1158[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method467() {
		int var1 = field1130.method193("Choose Option");
		for (int var2 = 0; var2 < field1031; var2++) {
			int var3 = field1130.method193(field1057[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1031 * 15 + 21;
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

			field1167 = true;
			field1022 = 0;
			field1023 = var5;
			field1024 = var6;
			field1025 = var1;
			field1026 = field1031 * 15 + 22;
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

			field1167 = true;
			field1022 = 1;
			field1023 = var7;
			field1024 = var8;
			field1025 = var1;
			field1026 = field1031 * 15 + 22;
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

			field1167 = true;
			field1022 = 2;
			field1023 = var9;
			field1024 = var10;
			field1025 = var1;
			field1026 = field1031 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ILz;III)V")
	public final void method468(class26 arg0, int arg1, int arg2, int arg3) {
		if (field1290 != arg0 && field1031 < 400) {
			String var5 = arg0.field323 + method462(field1290.field329, arg0.field329) + " (level-" + arg0.field329 + ")";
			if (field1244 == 1) {
				field1057[field1031] = "Use " + field1248 + " with @whi@" + var5;
				field1284[field1031] = 367;
				field1285[field1031] = arg3;
				field1282[field1031] = arg2;
				field1283[field1031] = arg1;
				field1031++;
			} else if (field985 != 1) {
				field1057[field1031] = "Follow @whi@" + var5;
				field1284[field1031] = 1544;
				field1285[field1031] = arg3;
				field1282[field1031] = arg2;
				field1283[field1031] = arg1;
				field1031++;
				if (field1029 == 0) {
					field1057[field1031] = "Trade with @whi@" + var5;
					field1284[field1031] = 1373;
					field1285[field1031] = arg3;
					field1282[field1031] = arg2;
					field1283[field1031] = arg1;
					field1031++;
				}

				if (field983 > 0) {
					field1057[field1031] = "Attack @whi@" + var5;

					if (field1290.field329 >= arg0.field329) {
						field1284[field1031] = 151;
					} else {
						field1284[field1031] = 2151;
					}

					field1285[field1031] = arg3;
					field1282[field1031] = arg2;
					field1283[field1031] = arg1;
					field1031++;
				}

				if (field1074 == 1) {
					field1057[field1031] = "Fight @whi@" + var5;
					field1284[field1031] = 151;
					field1285[field1031] = arg3;
					field1282[field1031] = arg2;
					field1283[field1031] = arg1;
					field1031++;
				}

				if (field1074 == 2) {
					field1057[field1031] = "Duel-with @whi@" + var5;
					field1284[field1031] = 1101;
					field1285[field1031] = arg3;
					field1282[field1031] = arg2;
					field1283[field1031] = arg1;
					field1031++;
				}
			} else if ((field987 & 0x8) == 8) {
				field1057[field1031] = field988 + " @whi@" + var5;
				field1284[field1031] = 651;
				field1285[field1031] = arg3;
				field1282[field1031] = arg2;
				field1283[field1031] = arg1;
				field1031++;
			}

			for (int var6 = 0; var6 < field1031; var6++) {
				if (field1284[var6] == 660) {
					field1057[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method469() {
		field1195++;
		method417();
		method442();
		method475();
		method447();
		method456();

		if (!field1097) {
			int var1 = field1178;
			if (field1164 / 256 > var1) {
				var1 = field1164 / 256;
			}

			if (field1300[4] && field1261[4] + 128 > var1) {
				var1 = field1261[4] + 128;
			}

			int var2 = field1179 + field1016 & 0x7FF;
			method405(var1 * 3 + 600, field1019, var2, method495(field1290.field271, field1080, field1290.field270) - 50, field1020, var1);
			field1185++;
			if (field1185 > 1802) {
				field1185 = 0;
				field1266.method205(146);
				field1266.method206(0);
				int var3 = field1266.field543;
				field1266.method207(29711);
				field1266.method206(70);
				field1266.method206((int) (Math.random() * 256.0D));
				field1266.method206(242);
				field1266.method206(186);
				field1266.method206(39);
				field1266.method206(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1266.method206(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1266.method207(57856);
				}

				field1266.method207((int) (Math.random() * 65536.0D));
				field1266.method215(field1266.field543 - var3);
			}
		}

		int var4;
		if (field1097) {
			var4 = method488();
		} else {
			var4 = method487();
		}

		int var5 = field1152;
		int var6 = field1153;
		int var7 = field1154;
		int var8 = field1155;
		int var9 = field1156;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1300[var10]) {
				int var11 = (int) (Math.random() * (field1257[var10] * 2 + 1) + Math.sin(field1059[var10] / 100.0D * field1033[var10]) * field1261[var10] - field1257[var10]);
				if (var10 == 0) {
					field1152 += var11;
				}

				if (var10 == 1) {
					field1153 += var11;
				}

				if (var10 == 2) {
					field1154 += var11;
				}

				if (var10 == 3) {
					field1156 = field1156 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1155 += var11;
					if (field1155 < 128) {
						field1155 = 128;
					}

					if (field1155 > 383) {
						field1155 = 383;
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
		field1172.method91(field1156, var4, field1152, field1154, field1153, field1155);
		field1172.method65();
		method419();
		method472();
		method407(var12);
		method397();
		field1231.method243(field8, 11, 8);
		field1152 = var5;
		field1153 = var6;
		field1154 = var7;
		field1155 = var8;
		field1156 = var9;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method470(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1060; var2++) {
			if (arg0.equalsIgnoreCase(field1067[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1290.field323)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.i(II)Z")
	public final boolean method471(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1284[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method472() {
		if (field1118 == 2) {
			method424((field1112 - field1037 << 7) + field1115, field1113 * 2, (field1111 - field1036 << 7) + field1114);

			if (field1077 > -1 && field1202 % 20 < 10) {
				field1159[2].method175(field1078 - 28, field1077 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZ)Z")
	public final boolean method473(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 >> 14 & 0x7FFF;
		int var6 = field1172.method82(field1080, arg0, arg1, arg2);
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

			method484(field1290.field319[0], 0, 2, arg1, false, var12, arg0, var11, field1290.field318[0], var10, 0);
		} else {
			method484(field1290.field319[0], var7 + 1, 2, arg1, false, 0, arg0, 0, field1290.field318[0], 0, var8);
		}

		field1053 = field18;
		field1054 = field19;
		field1056 = 2;
		field1055 = 0;
		field1266.method205(arg3);
		field1266.method207(field1036 + arg0);
		field1266.method207(field1037 + arg1);
		field1266.method207(var5);
		return true;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method474() {
		try {
			field1204 = -1;
			field1340.method239();
			field1333.method239();
			field1014.method239();
			field1068.method239();
			class33.method157();
			method492();
			field1172.method51();

			for (int var1 = 0; var1 < 4; var1++) {
				field1331[var1].method302();
			}

			System.gc();
			class3 var2 = new class3(104, field1196, 104, field1005);
			byte[] var3 = new byte[100000];
			int var4 = field1203.length;
			class3.field25 = class18.field196;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1071[var5] >> 8;
				int var7 = field1071[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field25 = false;
				}
			}

			if (class3.field25) {
				field1172.method52(field1080);
			} else {
				field1172.method52(0);
			}

			field1266.method205(108);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1071[var8] >> 8) * 64 - field1036;
				int var10 = (field1071[var8] & 0xFF) * 64 - field1037;
				byte[] var11 = field1203[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method221();
					class44.method245(var3, var12, var11, var11.length - 4, 4);
					var2.method15(var10, (field1255 - 6) * 8, (field1254 - 6) * 8, var3, var9);
				} else if (field1255 < 800) {
					var2.method14(64, var9, var10, 64);
				}
			}

			field1266.method205(108);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field1126[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method221();
					class44.method245(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1071[var13] >> 8) * 64 - field1036;
					int var17 = (field1071[var13] & 0xFF) * 64 - field1037;
					var2.method16(field1333, var3, field1331, field1172, var17, var16);
				}
			}

			field1266.method205(108);
			var2.method18(field1331, field1172);
			field1231.method242();
			field1266.method205(108);

			for (class40 var18 = (class40) field1333.method235(); var18 != null; var18 = (class40) field1333.method237()) {
				if ((field1196[1][var18.field574][var18.field575] & 0x2) == 2) {
					var18.field572--;
					if (var18.field572 < 0) {
						var18.method108();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method430(var19, var20);
				}
			}

			for (class38 var21 = (class38) field1207.method235(); var21 != null; var21 = (class38) field1207.method237()) {
				method402(var21.field557, var21.field555, var21.field558, var21.field560, var21.field559, var21.field554, var21.field556);
			}
		} catch (Exception var23) {
		}

		class53.field735.method105();
		System.gc();
		class33.method158(20);
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method475() {
		for (class27 var1 = (class27) field1068.method235(); var1 != null; var1 = (class27) field1068.method237()) {
			if (field1080 != var1.field345 || field1202 > var1.field351) {
				var1.method108();
			} else if (field1202 >= var1.field350) {
				if (var1.field354 > 0) {
					class25 var2 = field1139[var1.field354 - 1];
					if (var2 != null) {
						var1.method117(var2.field270, field1202, var2.field271, method495(var2.field271, var1.field345, var2.field270) - var1.field349);
					}
				}

				if (var1.field354 < 0) {
					int var3 = -var1.field354 - 1;
					class26 var4;
					if (field1138 == var3) {
						var4 = field1290;
					} else {
						var4 = field1214[var3];
					}

					if (var4 != null) {
						var1.method117(var4.field270, field1202, var4.field271, method495(var4.field271, var1.field345, var4.field270) - var1.field349);
					}
				}

				var1.method118(field1292);
				field1172.method62(60, (int) var1.field356, (int) var1.field357, null, -1, (int) var1.field358, var1.field364, field1080, var1, false);
			}
		}
	}

	@ObfuscatedName("client.b(IIB)Z")
	public final boolean method476(int arg0, int arg1) {
		boolean var3 = false;
		class60 var4 = class60.field835[arg0];
		for (int var5 = 0; var5 < var4.field856.length && var4.field856[var5] != -1; var5++) {
			class60 var6 = class60.field835[var4.field856[var5]];
			if (var6.field842 == 1) {
				var3 |= method476(var6.field840, arg1);
			}

			if (var6.field842 == 6 && (var6.field883 != -1 || var6.field884 != -1)) {
				boolean var7 = method463(var6);
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

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;)Lub;")
	public final class47 method477(String arg0, int arg1, int arg2, String arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg0);
		if (var6 != null) {
			field982.reset();
			field982.update(var6);
			int var7 = (int) field982.getValue();
			if (arg2 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class47(var6);
		}

		while (var6 == null) {
			method13("Requesting " + arg3, arg1);

			try {
				int var9 = 0;
				DataInputStream var10 = method435(arg0 + arg2);
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
						method13("Loading " + arg3 + " - " + var17 + "%", arg1);
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					method13("Error loading - Will retry in " + var18 + " secs.", arg1);

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

		signlink.cachesave(arg0, var6);
		return new class47(var6);
	}

	@ObfuscatedName("client.a(BIZ)V")
	public final void method478(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public static final void method479() {
		class18.field196 = true;
		class33.field494 = true;
		field1122 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method480() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field979 != -1 && field979 == field1291) {
				if (var1 == 8 && field1133.length() > 0) {
					field1133 = field1133.substring(0, field1133.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1133.length() < 12) {
					field1133 = field1133 + (char) var1;
				}
			} else if (field1182) {
				if (var1 >= 32 && var1 <= 122 && field1046.length() < 80) {
					field1046 = field1046 + (char) var1;
					field1034 = true;
				}

				if (var1 == 8 && field1046.length() > 0) {
					field1046 = field1046.substring(0, field1046.length() - 1);
					field1034 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1182 = false;
					field1034 = true;

					if (field1237 == 1) {
						long var2 = class48.method258(field1046);
						method465(var2);
					}

					if (field1237 == 2 && field1060 > 0) {
						long var4 = class48.method258(field1046);
						method374(var4);
					}

					if (field1237 == 3 && field1046.length() > 0) {
						field1266.method205(148);
						field1266.method206(0);
						int var6 = field1266.field543;
						field1266.method212(field1075);
						class49.method266(field1266, field1046);
						field1266.method215(field1266.field543 - var6);
						field1046 = class48.method263(field1046);
						field1046 = class65.method343(field1046);
						method379(field1046, class48.method262(class48.method259(field1075)), 6);

						if (field974 == 2) {
							field974 = 1;
							field1250 = true;
							field1266.method205(244);
							field1266.method206(field1334);
							field1266.method206(field974);
							field1266.method206(field1099);
						}
					}

					if (field1237 == 4 && field1160 < 100) {
						long var7 = class48.method258(field1046);
						method377(var7);
					}

					if (field1237 == 5 && field1160 > 0) {
						long var9 = class48.method258(field1046);
						method493(var9);
					}
				}
			} else if (field980) {
				if (var1 >= 48 && var1 <= 57 && field991.length() < 10) {
					field991 = field991 + (char) var1;
					field1034 = true;
				}

				if (var1 == 8 && field991.length() > 0) {
					field991 = field991.substring(0, field991.length() - 1);
					field1034 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field991.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field991);
						} catch (Exception var15) {
						}

						field1266.method205(237);
						field1266.method210(var11);
					}

					field980 = false;
					field1034 = true;
				}
			} else if (field1045 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1102.length() < 80) {
					field1102 = field1102 + (char) var1;
					field1034 = true;
				}

				if (var1 == 8 && field1102.length() > 0) {
					field1102 = field1102.substring(0, field1102.length() - 1);
					field1034 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1102.length() > 0) {
					if (field1102.equals("::clientdrop") && (field11 != null || method393().indexOf("192.168.1.") != -1)) {
						method418();
					} else if (field1102.startsWith("::")) {
						field1266.method205(4);
						field1266.method206(field1102.length() - 1);
						field1266.method213(field1102.substring(2));
					} else {
						byte var12 = 0;
						if (field1102.startsWith("yellow:")) {
							var12 = 0;
							field1102 = field1102.substring(7);
						}

						if (field1102.startsWith("red:")) {
							var12 = 1;
							field1102 = field1102.substring(4);
						}

						if (field1102.startsWith("green:")) {
							var12 = 2;
							field1102 = field1102.substring(6);
						}

						if (field1102.startsWith("cyan:")) {
							var12 = 3;
							field1102 = field1102.substring(5);
						}

						if (field1102.startsWith("purple:")) {
							var12 = 4;
							field1102 = field1102.substring(7);
						}

						if (field1102.startsWith("white:")) {
							var12 = 5;
							field1102 = field1102.substring(6);
						}

						if (field1102.startsWith("flash1:")) {
							var12 = 6;
							field1102 = field1102.substring(7);
						}

						if (field1102.startsWith("flash2:")) {
							var12 = 7;
							field1102 = field1102.substring(7);
						}

						if (field1102.startsWith("flash3:")) {
							var12 = 8;
							field1102 = field1102.substring(7);
						}

						if (field1102.startsWith("glow1:")) {
							var12 = 9;
							field1102 = field1102.substring(6);
						}

						if (field1102.startsWith("glow2:")) {
							var12 = 10;
							field1102 = field1102.substring(6);
						}

						if (field1102.startsWith("glow3:")) {
							var12 = 11;
							field1102 = field1102.substring(6);
						}

						byte var13 = 0;
						if (field1102.startsWith("wave:")) {
							var13 = 1;
							field1102 = field1102.substring(5);
						}

						if (field1102.startsWith("scroll:")) {
							var13 = 2;
							field1102 = field1102.substring(7);
						}

						field1266.method205(158);
						field1266.method206(0);
						int var14 = field1266.field543;
						field1266.method206(var12);
						field1266.method206(var13);
						class49.method266(field1266, field1102);
						field1266.method215(field1266.field543 - var14);
						field1102 = class48.method263(field1102);
						field1102 = class65.method343(field1102);
						field1290.field282 = field1102;
						field1290.field284 = var12;
						field1290.field285 = var13;
						field1290.field283 = 150;
						method379(field1290.field282, field1290.field323, 2);

						if (field1334 == 2) {
							field1334 = 3;
							field1250 = true;
							field1266.method205(244);
							field1266.method206(field1334);
							field1266.method206(field974);
							field1266.method206(field1099);
						}
					}

					field1102 = "";
					field1034 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)Ljava/net/Socket;")
	public final Socket method481(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.c(Lhc;I)Z")
	public final boolean method482(class60 arg0) {
		int var2 = arg0.field844;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1057[field1031] = "Remove @whi@" + field1067[var2];
			field1284[field1031] = 557;
			field1031++;
			field1057[field1031] = "Message @whi@" + field1067[var2];
			field1284[field1031] = 679;
			field1031++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1057[field1031] = "Remove @whi@" + arg0.field874;
			field1284[field1031] = 556;
			field1031++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method483() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1221 + field1179 & 0x7FF;
				int var4 = class33.field503[var3];
				int var5 = class33.field504[var3];
				var4 = (field1065 + 256) * var4 >> 8;
				var5 = (field1065 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1290.field270 + var6 >> 7;
				int var9 = field1290.field271 - var7 >> 7;
				boolean var10 = method484(field1290.field319[0], 0, 1, var9, true, 0, var8, 0, field1290.field318[0], 0, 0);
				if (var10) {
					field1266.method206(var1);
					field1266.method206(var2);
					field1266.method207(field1179);
					field1266.method206(57);
					field1266.method206(field1221);
					field1266.method206(field1065);
					field1266.method206(89);
					field1266.method207(field1290.field270);
					field1266.method207(field1290.field271);
					field1266.method206(field1081);
					field1266.method206(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZIIIIIII)Z")
	public final boolean method484(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1307[var14][var15] = 0;
				field1220[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg0;
		field1307[arg8][arg0] = 99;
		field1220[arg8][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1233[var18] = arg8;
		int var35 = var18 + 1;
		field1234[var18] = arg0;
		boolean var20 = false;
		int var21 = field1233.length;
		int[][] var22 = field1331[field1080].field813;
		while (var35 != var19) {
			var16 = field1233[var19];
			var17 = field1234[var19];
			var19 = (var19 + 1) % var21;

			if (arg6 == var16 && arg3 == var17) {
				var20 = true;
				break;
			}

			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && field1331[field1080].method311(arg3, arg1 - 1, var17, arg10, arg6, var16)) {
					var20 = true;
					break;
				}

				if (arg1 < 10 && field1331[field1080].method312(var17, arg6, var16, arg3, arg1 - 1, arg10)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg7 != 0 && field1331[field1080].method313(var16, arg9, arg3, arg6, arg7, arg5, var17)) {
				var20 = true;
				break;
			}

			int var23 = field1220[var16][var17] + 1;
			if (var16 > 0 && field1307[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1233[var35] = var16 - 1;
				field1234[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1307[var16 - 1][var17] = 2;
				field1220[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1307[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1233[var35] = var16 + 1;
				field1234[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1307[var16 + 1][var17] = 8;
				field1220[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1307[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1233[var35] = var16;
				field1234[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1307[var16][var17 - 1] = 1;
				field1220[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1307[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1233[var35] = var16;
				field1234[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1307[var16][var17 + 1] = 4;
				field1220[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1307[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1233[var35] = var16 - 1;
				field1234[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1307[var16 - 1][var17 - 1] = 3;
				field1220[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1307[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1233[var35] = var16 + 1;
				field1234[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1307[var16 + 1][var17 - 1] = 9;
				field1220[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1307[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1233[var35] = var16 - 1;
				field1234[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1307[var16 - 1][var17 + 1] = 6;
				field1220[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1307[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1233[var35] = var16 + 1;
				field1234[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1307[var16 + 1][var17 + 1] = 12;
				field1220[var16 + 1][var17 + 1] = var23;
			}
		}

		field1081 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg6 - var25; var26 <= arg6 + var25; var26++) {
						for (int var27 = arg3 - var25; var27 <= arg3 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1220[var26][var27] < var24) {
								var24 = field1220[var26][var27];
								var16 = var26;
								var17 = var27;
								field1081 = 1;
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
		field1233[var28] = var16;
		int var36 = var28 + 1;
		field1234[var28] = var17;
		int var29;
		int var30 = var29 = field1307[var16][var17];
		while (arg8 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1233[var36] = var16;
				field1234[var36++] = var17;
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

			var30 = field1307[var16][var17];
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
		int var32 = field1233[var36];
		int var33 = field1234[var36];

		if (arg2 == 0) {
			field1266.method205(181);
			field1266.method206(var31 + var31 + 3);
		}

		if (arg2 == 1) {
			field1266.method205(165);
			field1266.method206(var31 + var31 + 3 + 14);
		}

		if (arg2 == 2) {
			field1266.method205(93);
			field1266.method206(var31 + var31 + 3);
		}

		if (field20[5] == 1) {
			field1266.method206(1);
		} else {
			field1266.method206(0);
		}

		field1266.method207(field1036 + var32);
		field1266.method207(field1037 + var33);
		field1313 = field1233[0];
		field1314 = field1234[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1266.method206(field1233[var36] - var32);
			field1266.method206(field1234[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;III)V")
	public final void method485(String arg0, int arg1, int arg2) {
		if (arg0 != null) {
			synchronized (field1286) {
				field1166 = arg0;
				field1006 = arg2;
				field1224 = arg1;
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method486() {
		int var1 = (field1290.field270 >> 7) + field1036;
		int var2 = (field1290.field271 >> 7) + field1037;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field983 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field983 = (var2 - 9920) / 8 + 1;
		} else {
			field983 = 0;
		}

		field1074 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1074 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1074 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1074 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1074 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1074 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1074 = 1;
			}
		}

		if (field1074 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1074 = 2;
		}

		field1029 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1029 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1029 = 1;
		}

		if (field1029 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1029 = 0;
		}
	}

	@ObfuscatedName("client.n(B)I")
	public final int method487() {
		int var1 = 3;
		if (field1155 < 310) {
			int var2 = field1152 >> 7;
			int var3 = field1154 >> 7;
			int var4 = field1290.field270 >> 7;
			int var5 = field1290.field271 >> 7;

			if ((field1196[field1080][var2][var3] & 0x4) != 0) {
				var1 = field1080;
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

					if ((field1196[field1080][var2][var3] & 0x4) != 0) {
						var1 = field1080;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1196[field1080][var2][var3] & 0x4) != 0) {
							var1 = field1080;
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

					if ((field1196[field1080][var2][var3] & 0x4) != 0) {
						var1 = field1080;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1196[field1080][var2][var3] & 0x4) != 0) {
							var1 = field1080;
						}
					}
				}
			}
		}

		if ((field1196[field1080][field1290.field270 >> 7][field1290.field271 >> 7] & 0x4) != 0) {
			var1 = field1080;
		}

		return var1;
	}

	@ObfuscatedName("client.o(B)I")
	public final int method488() {
		int var1 = method495(field1154, field1080, field1152);
		if (var1 - field1153 < 800 && (field1196[field1080][field1152 >> 7][field1154 >> 7] & 0x4) != 0) {
			return field1080;
		}

		return 3;
	}

	@ObfuscatedName("client.b(Lkb;II)V")
	public final void method489(class37 arg0, int arg1) {
		field1150 = 0;
		field1217 = 0;
		method387(arg1, arg0);
		method400(arg1, arg0);
		method439(arg1, arg0);
		method440(arg0, arg1);

		for (int var3 = 0; var3 < field1150; var3++) {
			int var4 = field1151[var3];
			if (field1202 != field1214[var4].field314) {
				field1214[var4] = null;
			}
		}

		if (arg0.field543 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field543 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1215; var5++) {
			if (field1214[field1216[var5]] == null) {
				signlink.reporterror(field1095 + " null entry in pl list - pos:" + var5 + " size:" + field1215);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method490() {
		if (field1011 == 0) {
			int var1 = field17;
			if (field985 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field1167) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field1022 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1022 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field1022 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field1023 - 10 || var2 > field1025 + field1023 + 10 || var3 < field1024 - 10 || var3 > field1026 + field1024 + 10) {
						field1167 = false;

						if (field1022 == 1) {
							field962 = true;
						}

						if (field1022 == 2) {
							field1034 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1023;
					int var5 = field1024;
					int var6 = field1025;
					int var7 = field18;
					int var8 = field19;
					if (field1022 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1022 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field1022 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1031; var10++) {
						int var11 = (field1031 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method436(var9);
					}

					field1167 = false;

					if (field1022 == 1) {
						field962 = true;
					}

					if (field1022 == 2) {
						field1034 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1031 > 0) {
					int var12 = field1284[field1031 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = field1282[field1031 - 1];
						int var14 = field1283[field1031 - 1];
						class60 var15 = class60.field835[var14];
						if (var15.field861) {
							field1083 = false;
							field1008 = 0;
							field1009 = var14;
							field1010 = var13;
							field1011 = 2;
							field1012 = field18;
							field1013 = field19;

							if (class60.field835[var14].field841 == field979) {
								field1011 = 1;
							}

							if (class60.field835[var14].field841 == field1045) {
								field1011 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1339 == 1 || method471(field1031 - 1)) && field1031 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1031 > 0) {
					method436(field1031 - 1);
				}

				if (var1 != 2 || field1031 <= 0) {
					return;
				}

				method467();
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method491() {
		field1062 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1101) {
				method410();
				method410();
				method395();
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

		field1062 = false;
	}

	@ObfuscatedName("client.p(B)V")
	public final void method492() {
		class53.field735.method105();
		class53.field736.method105();
		class54.field764.method105();
		class55.field805.method105();
		class55.field806.method105();
		class26.field343.method105();
		class63.field927.method105();
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method493(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1160; var3++) {
				if (field1107[var3] == arg0) {
					field1160--;
					field962 = true;

					for (int var4 = var3; var4 < field1160; var4++) {
						field1107[var4] = field1107[var4 + 1];
					}

					field1266.method205(171);
					field1266.method212(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method494() {
		if (field1293 == 0) {
			int var1 = field6 / 2 - 80;
			int var2 = field7 / 2 + 20;
			var2 += 20;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1293 = 3;
				field1088 = 0;
			}

			int var3 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var3 - 75 && field18 <= var3 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field948 = "";
				field949 = "Enter your username & password.";
				field1293 = 2;
				field1088 = 0;
			}
		} else if (field1293 == 2) {
			int var4 = field7 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1088 = 0;
			}

			var4 += 15;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1088 = 1;
			}

			var4 += 15;
			int var5 = field6 / 2 - 80;
			int var6 = field7 / 2 + 50;
			var6 += 20;
			if (field17 == 1 && field18 >= var5 - 75 && field18 <= var5 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				method416(field1095, field1096, false);
			}

			int var7 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var7 - 75 && field18 <= var7 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				field1293 = 0;
				field1095 = "";
				field1096 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1197.length(); var10++) {
					if (var8 == field1197.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1088 == 0) {
					if (var8 == 8 && field1095.length() > 0) {
						field1095 = field1095.substring(0, field1095.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1088 = 1;
					}

					if (var9) {
						field1095 = field1095 + (char) var8;
					}

					if (field1095.length() > 12) {
						field1095 = field1095.substring(0, 12);
					}
				} else if (field1088 == 1) {
					if (var8 == 8 && field1096.length() > 0) {
						field1096 = field1096.substring(0, field1096.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1088 = 0;
					}

					if (var9) {
						field1096 = field1096 + (char) var8;
					}

					if (field1096.length() > 20) {
						field1096 = field1096.substring(0, 20);
					}
				}
			}
		} else if (field1293 == 3) {
			int var11 = field6 / 2;
			int var12 = field7 / 2 + 50;
			var12 += 20;
			if (field17 == 1 && field18 >= var11 - 75 && field18 <= var11 + 75 && field19 >= var12 - 20 && field19 <= var12 + 20) {
				field1293 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method495(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		int var6 = arg1;
		if (arg1 < 3 && (field1196[1][var4][var5] & 0x2) == 2) {
			var6 = arg1 + 1;
		}

		int var7 = arg2 & 0x7F;
		int var8 = arg0 & 0x7F;
		int var9 = (128 - var7) * field1005[var6][var4][var5] + field1005[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field1005[var6][var4][var5 + 1] + field1005[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.c(Lkb;II)V")
	public final void method496(class37 arg0, int arg1) {
		if (arg1 == 59 || arg1 == 76) {
			int var3 = arg0.method216();
			int var4 = (var3 >> 4 & 0x7) + field1142;
			int var5 = (var3 & 0x7) + field1143;
			int var6 = arg0.method216();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1035[var7];
			int var10;
			if (arg1 == 76) {
				var10 = -1;
			} else {
				var10 = arg0.method218();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field1207.method235(); var12 != null; var12 = (class38) field1207.method237()) {
					if (field1080 == var12.field554 && var12.field556 == var4 && var12.field557 == var5 && var12.field555 == var9) {
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
						var13 = field1172.method78(field1080, var4, var5);
					}

					if (var9 == 1) {
						var13 = field1172.method79(var4, field1080, var5);
					}

					if (var9 == 2) {
						var13 = field1172.method80(field1080, var4, var5);
					}

					if (var9 == 3) {
						var13 = field1172.method81(field1080, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field1172.method82(field1080, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field554 = field1080;
					var11.field555 = var9;
					var11.field556 = var4;
					var11.field557 = var5;
					var11.field561 = var14;
					var11.field563 = var15;
					var11.field562 = var16;
					field1207.method232(var11);
				}

				var11.field558 = var10;
				var11.field560 = var7;
				var11.field559 = var8;
				method402(var5, var9, var10, var7, var8, field1080, var4);
			}
		} else if (arg1 == 42) {
			int var18 = arg0.method216();
			int var19 = (var18 >> 4 & 0x7) + field1142;
			int var20 = (var18 & 0x7) + field1143;
			int var21 = arg0.method216();
			int var22 = var21 >> 2;
			int var23 = field1035[var22];
			int var24 = arg0.method218();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = field1172.method78(field1080, var19, var20);
				}

				if (var23 == 1) {
					var25 = field1172.method79(var19, field1080, var20);
				}

				if (var23 == 2) {
					var25 = field1172.method80(field1080, var19, var20);
				}

				if (var23 == 3) {
					var25 = field1172.method81(field1080, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(var20, var19, class62.field901[var24], var23, var25 >> 14 & 0x7FFF, false, field1080);
					field1333.method232(var26);
				}
			}
		} else if (arg1 == 223) {
			int var27 = arg0.method216();
			int var28 = (var27 >> 4 & 0x7) + field1142;
			int var29 = (var27 & 0x7) + field1143;
			int var30 = arg0.method218();
			int var31 = arg0.method218();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var32 = new class22();
				var32.field268 = var30;
				var32.field269 = var31;

				if (field1262[field1080][var28][var29] == null) {
					field1262[field1080][var28][var29] = new class41();
				}

				field1262[field1080][var28][var29].method232(var32);
				method430(var28, var29);
			}
		} else if (arg1 == 49) {
			int var33 = arg0.method216();
			int var34 = (var33 >> 4 & 0x7) + field1142;
			int var35 = (var33 & 0x7) + field1143;
			int var36 = arg0.method218();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				class41 var37 = field1262[field1080][var34][var35];
				if (var37 != null) {
					for (class22 var38 = (class22) var37.method235(); var38 != null; var38 = (class22) var37.method237()) {
						if ((var36 & 0x7FFF) == var38.field268) {
							var38.method108();
							break;
						}
					}

					if (var37.method235() == null) {
						field1262[field1080][var34][var35] = null;
					}

					method430(var34, var35);
				}
			}
		} else if (arg1 == 69) {
			int var39 = arg0.method216();
			int var40 = (var39 >> 4 & 0x7) + field1142;
			int var41 = (var39 & 0x7) + field1143;
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
				class27 var52 = new class27(var41, var45, field1202 + var48, var44, field1202 + var49, var51, var47, method495(var41, field1080, var40) - var46, field1080, var50, var40);
				var52.method117(var42, field1202 + var48, var43, method495(var43, field1080, var42) - var47);
				field1068.method232(var52);
			}
		} else if (arg1 == 191) {
			int var53 = arg0.method216();
			int var54 = (var53 >> 4 & 0x7) + field1142;
			int var55 = (var53 & 0x7) + field1143;
			int var56 = arg0.method218();
			int var57 = arg0.method216();
			int var58 = arg0.method218();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				class28 var59 = new class28(field1080, var55, field1202, var56, var58, var54, method495(var55, field1080, var54) - var57);
				field1014.method232(var59);
			}
		} else if (arg1 == 50) {
			int var60 = arg0.method216();
			int var61 = (var60 >> 4 & 0x7) + field1142;
			int var62 = (var60 & 0x7) + field1143;
			int var63 = arg0.method218();
			int var64 = arg0.method218();
			int var65 = arg0.method218();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && field1138 != var65) {
				class22 var66 = new class22();
				var66.field268 = var63;
				var66.field269 = var64;

				if (field1262[field1080][var61][var62] == null) {
					field1262[field1080][var61][var62] = new class41();
				}

				field1262[field1080][var61][var62].method232(var66);
				method430(var61, var62);
			}
		} else if (arg1 == 23) {
			int var67 = arg0.method216();
			int var68 = (var67 >> 4 & 0x7) + field1142;
			int var69 = (var67 & 0x7) + field1143;
			int var70 = arg0.method216();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = field1035[var71];
			int var74 = arg0.method218();
			int var75 = arg0.method218();
			int var76 = arg0.method218();
			int var77 = arg0.method218();
			byte var78 = arg0.method217();
			byte var79 = arg0.method217();
			byte var80 = arg0.method217();
			byte var81 = arg0.method217();
			class26 var82;
			if (field1138 == var77) {
				var82 = field1290;
			} else {
				var82 = field1214[var77];
			}

			if (var82 != null) {
				class39 var83 = new class39(field1080, var69, field1202 + var75, var72, var68, var71, var73, -1);
				field1340.method232(var83);
				class39 var84 = new class39(field1080, var69, field1202 + var76, var72, var68, var71, var73, var74);
				field1340.method232(var84);
				int var85 = field1005[field1080][var68][var69];
				int var86 = field1005[field1080][var68 + 1][var69];
				int var87 = field1005[field1080][var68 + 1][var69 + 1];
				int var88 = field1005[field1080][var68][var69 + 1];
				class53 var89 = class53.method282(var74);
				var82.field332 = field1202 + var75;
				var82.field333 = field1202 + var76;
				var82.field337 = var89.method285(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.field709;
				int var91 = var89.field710;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.field710;
					var91 = var89.field709;
				}

				var82.field334 = var68 * 128 + var90 * 64;
				var82.field336 = var69 * 128 + var91 * 64;
				var82.field335 = method495(var82.field336, field1080, var82.field334);

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
			int var95 = (var94 >> 4 & 0x7) + field1142;
			int var96 = (var94 & 0x7) + field1143;
			int var97 = arg0.method218();
			int var98 = arg0.method218();
			int var99 = arg0.method218();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1262[field1080][var95][var96];
				if (var100 != null) {
					for (class22 var101 = (class22) var100.method235(); var101 != null; var101 = (class22) var100.method237()) {
						if ((var97 & 0x7FFF) == var101.field268 && var101.field269 == var98) {
							var101.field269 = var99;
							break;
						}
					}

					method430(var95, var96);
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
			field1048[var1] = var0 / 4;
		}
	}
}
