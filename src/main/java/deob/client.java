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
	public int field960 = 2048;

	@ObfuscatedName("client.bb")
	public int field961 = 2047;

	@ObfuscatedName("client.cb")
	public class26[] field962 = new class26[field960];

	@ObfuscatedName("client.db")
	public int field963;

	@ObfuscatedName("client.eb")
	public int[] field964 = new int[field960];

	@ObfuscatedName("client.fb")
	public int field965;

	@ObfuscatedName("client.gb")
	public int[] field966 = new int[field960];

	@ObfuscatedName("client.hb")
	public class37[] field967 = new class37[field960];

	@ObfuscatedName("client.ib")
	public int[] field968 = new int[5];

	@ObfuscatedName("client.jb")
	public int field969 = -1;

	@ObfuscatedName("client.kb")
	public int field970;

	@ObfuscatedName("client.lb")
	public int field971;

	@ObfuscatedName("client.nb")
	public int[][] field972 = new int[104][104];

	@ObfuscatedName("client.ob")
	public class34[] field973 = new class34[8];

	@ObfuscatedName("client.pb")
	public class35 field974;

	@ObfuscatedName("client.qb")
	public class35 field975;

	@ObfuscatedName("client.rb")
	public byte[][] field976;

	@ObfuscatedName("client.sb")
	public int field977;

	@ObfuscatedName("client.tb")
	public boolean field978 = false;

	@ObfuscatedName("client.vb")
	public int field979;

	@ObfuscatedName("client.wb")
	public int field980;

	@ObfuscatedName("client.xb")
	public int[] field981 = new int[1000];

	@ObfuscatedName("client.yb")
	public int[] field982 = new int[1000];

	@ObfuscatedName("client.zb")
	public int field983;

	@ObfuscatedName("client.ac")
	public class35 field1007;

	@ObfuscatedName("client.bc")
	public class35 field1008;

	@ObfuscatedName("client.cc")
	public int field1009;

	@ObfuscatedName("client.dc")
	public int field1010 = 1;

	@ObfuscatedName("client.ec")
	public String field1011 = "";

	@ObfuscatedName("client.fc")
	public class35 field1012;

	@ObfuscatedName("client.gc")
	public class35 field1013;

	@ObfuscatedName("client.hc")
	public class18 field1014;

	@ObfuscatedName("client.jc")
	public class34[] field1015 = new class34[20];

	@ObfuscatedName("client.kc")
	public class37 field1016 = class37.method196(1);

	@ObfuscatedName("client.lc")
	public int[] field1017 = new int[2000];

	@ObfuscatedName("client.mc")
	public boolean field1018 = false;

	@ObfuscatedName("client.E")
	public class41 field942 = new class41();

	@ObfuscatedName("client.G")
	public class41 field944 = new class41();

	@ObfuscatedName("client.H")
	public int[] field945 = new int[151];

	@ObfuscatedName("client.M")
	public int field950 = -1;

	@ObfuscatedName("client.O")
	public class34[] field951 = new class34[20];

	@ObfuscatedName("client.W")
	public int[] field956 = new int[100];

	@ObfuscatedName("client.X")
	public String[] field957 = new String[100];

	@ObfuscatedName("client.Y")
	public String[] field958 = new String[100];

	@ObfuscatedName("client.Z")
	public boolean field959 = false;

	@ObfuscatedName("client.Cb")
	public boolean field986 = false;

	@ObfuscatedName("client.Kb")
	public class41 field992 = new class41();

	@ObfuscatedName("client.Nb")
	public int field995 = 0x766654;

	@ObfuscatedName("client.Ob")
	public Object field996 = new Object();

	@ObfuscatedName("client.Qb")
	public int field998 = 2;

	@ObfuscatedName("client.Sb")
	public int[] field999 = new int[50];

	@ObfuscatedName("client.Tb")
	public class37 field1000 = class37.method196(1);

	@ObfuscatedName("client.rc")
	public int field1023 = -1;

	@ObfuscatedName("client.vc")
	public int field1027 = -1;

	@ObfuscatedName("client.xc")
	public class25[] field1029 = new class25[8192];

	@ObfuscatedName("client.zc")
	public int[] field1031 = new int[8192];

	@ObfuscatedName("client.Ac")
	public int[] field1032 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Cc")
	public boolean field1033 = false;

	@ObfuscatedName("client.Dc")
	public int[][] field1034 = new int[104][104];

	@ObfuscatedName("client.Hc")
	public boolean field1038 = true;

	@ObfuscatedName("client.Rc")
	public int field1045 = -1;

	@ObfuscatedName("client.Sc")
	public int field1046 = -1;

	@ObfuscatedName("client.Xc")
	public int field1049 = 50;

	@ObfuscatedName("client.Yc")
	public int[] field1050 = new int[field1049];

	@ObfuscatedName("client.Zc")
	public int[] field1051 = new int[field1049];

	@ObfuscatedName("client.ad")
	public int[] field1052 = new int[field1049];

	@ObfuscatedName("client.bd")
	public int[] field1053 = new int[field1049];

	@ObfuscatedName("client.cd")
	public int[] field1054 = new int[field1049];

	@ObfuscatedName("client.dd")
	public int[] field1055 = new int[field1049];

	@ObfuscatedName("client.ed")
	public int[] field1056 = new int[field1049];

	@ObfuscatedName("client.fd")
	public String[] field1057 = new String[field1049];

	@ObfuscatedName("client.gd")
	public final int field1058 = 100;

	@ObfuscatedName("client.hd")
	public int[] field1059 = new int[100];

	@ObfuscatedName("client.id")
	public int[] field1060 = new int[50];

	@ObfuscatedName("client.od")
	public int field1066 = 3;

	@ObfuscatedName("client.ud")
	public boolean field1069 = false;

	@ObfuscatedName("client.wd")
	public boolean field1071 = false;

	@ObfuscatedName("client.yd")
	public int[] field1072 = new int[256];

	@ObfuscatedName("client.Bd")
	public int[][] field1075 = new int[104][104];

	@ObfuscatedName("client.Cd")
	public int field1076 = -1;

	@ObfuscatedName("client.Ed")
	public String field1078 = "";

	@ObfuscatedName("client.Nd")
	public class35[] field1086 = new class35[13];

	@ObfuscatedName("client.Od")
	public int[] field1087 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Pd")
	public int field1088 = 0x23201B;

	@ObfuscatedName("client.Td")
	public int field1091 = 1;

	@ObfuscatedName("client.Ud")
	public String[] field1092 = new String[100];

	@ObfuscatedName("client.Xd")
	public CRC32 field1094 = new CRC32();

	@ObfuscatedName("client.Zd")
	public int field1096 = 2;

	@ObfuscatedName("client.be")
	public int field1098 = -1;

	@ObfuscatedName("client.ce")
	public int[] field1099 = new int[500];

	@ObfuscatedName("client.de")
	public int[] field1100 = new int[500];

	@ObfuscatedName("client.ee")
	public int[] field1101 = new int[500];

	@ObfuscatedName("client.fe")
	public int[] field1102 = new int[500];

	@ObfuscatedName("client.ie")
	public boolean field1105 = false;

	@ObfuscatedName("client.we")
	public int field1117 = 0x332D25;

	@ObfuscatedName("client.Oe")
	public int field1131 = -1;

	@ObfuscatedName("client.Pe")
	public String[] field1132 = new String[500];

	@ObfuscatedName("client.Se")
	public boolean field1135 = false;

	@ObfuscatedName("client.Ye")
	public int field1141 = -1;

	@ObfuscatedName("client.Ze")
	public boolean field1142 = false;

	@ObfuscatedName("client.af")
	public class34[] field1143 = new class34[50];

	@ObfuscatedName("client.bf")
	public int[] field1144 = new int[5];

	@ObfuscatedName("client.jf")
	public int field1151 = -1;

	@ObfuscatedName("client.lf")
	public boolean field1152 = true;

	@ObfuscatedName("client.mf")
	public String field1153 = "";

	@ObfuscatedName("client.nf")
	public String field1154 = "";

	@ObfuscatedName("client.uf")
	public boolean field1161 = false;

	@ObfuscatedName("client.vf")
	public class37 field1162 = class37.method196(1);

	@ObfuscatedName("client.wf")
	public String field1163 = "";

	@ObfuscatedName("client.yf")
	public String field1165 = "";

	@ObfuscatedName("client.zf")
	public boolean field1166 = false;

	@ObfuscatedName("client.Jf")
	public int[] field1176 = new int[7];

	@ObfuscatedName("client.Pf")
	public boolean field1180 = false;

	@ObfuscatedName("client.Qf")
	public class35[] field1181 = new class35[50];

	@ObfuscatedName("client.Tf")
	public int[] field1183 = new int[50];

	@ObfuscatedName("client.Xf")
	public int[] field1186 = new int[100];

	@ObfuscatedName("client.Zf")
	public int[] field1188 = new int[50];

	@ObfuscatedName("client.cg")
	public boolean field1191 = true;

	@ObfuscatedName("client.gg")
	public boolean field1194 = false;

	@ObfuscatedName("client.hg")
	public final int[] field1195 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.kg")
	public String field1198 = "";

	@ObfuscatedName("client.lg")
	public String field1199 = "";

	@ObfuscatedName("client.mg")
	public boolean field1200 = false;

	@ObfuscatedName("client.sg")
	public int field1206 = 0x4D4233;

	@ObfuscatedName("client.zg")
	public int[] field1211 = new int[33];

	@ObfuscatedName("client.Ag")
	public boolean[] field1212 = new boolean[5];

	@ObfuscatedName("client.Cg")
	public int[] field1214 = new int[50];

	@ObfuscatedName("client.Hg")
	public class41 field1219 = new class41();

	@ObfuscatedName("client.Jg")
	public boolean field1221 = false;

	@ObfuscatedName("client.Ng")
	public int field1225 = 2;

	@ObfuscatedName("client.Ug")
	public int[] field1232 = new int[151];

	@ObfuscatedName("client.Vg")
	public int[] field1233 = new int[33];

	@ObfuscatedName("client.Wg")
	public int[] field1234 = new int[50];

	@ObfuscatedName("client.Xg")
	public String field1235 = "";

	@ObfuscatedName("client.Zg")
	public boolean field1237 = true;

	@ObfuscatedName("client.ch")
	public class34[] field1240 = new class34[1000];

	@ObfuscatedName("client.dh")
	public class41[][][] field1241 = new class41[4][104][104];

	@ObfuscatedName("client.lh")
	public int field1248 = -1;

	@ObfuscatedName("client.mh")
	public int[] field1249 = new int[5];

	@ObfuscatedName("client.nh")
	public int field1250 = 78;

	@ObfuscatedName("client.oh")
	public int[] field1251 = new int[5];

	@ObfuscatedName("client.qh")
	public boolean field1253 = false;

	@ObfuscatedName("client.Bh")
	public long[] field1264 = new long[100];

	@ObfuscatedName("client.Ph")
	public boolean field1278 = false;

	@ObfuscatedName("client.Qh")
	public boolean field1279 = false;

	@ObfuscatedName("client.Rh")
	public byte[] field1280 = new byte[16384];

	@ObfuscatedName("client.Yh")
	public int[] field1287 = new int[5];

	@ObfuscatedName("client.Zh")
	public int field1288 = 128;

	@ObfuscatedName("client.ei")
	public boolean field1292 = false;

	@ObfuscatedName("client.fi")
	public class57[] field1293 = new class57[4];

	@ObfuscatedName("client.li")
	public boolean field1299 = false;

	@ObfuscatedName("client.yi")
	public int[] field1312 = new int[1000];

	@ObfuscatedName("client.Ji")
	public boolean field1321 = false;

	@ObfuscatedName("client.Ni")
	public class41 field1324 = new class41();

	@ObfuscatedName("client.Ri")
	public long[] field1328 = new long[100];

	@ObfuscatedName("client.Si")
	public int[] field1329 = new int[2000];

	@ObfuscatedName("client.Ti")
	public int[] field1330 = new int[4000];

	@ObfuscatedName("client.Ui")
	public int[] field1331 = new int[4000];

	@ObfuscatedName("client.Vi")
	public class60 field1332 = new class60();

	@ObfuscatedName("client.Wi")
	public boolean field1333 = false;

	@ObfuscatedName("client.Zi")
	public int[] field1336 = new int[9];

	@ObfuscatedName("client.Gc")
	public static final int[][] field1037 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.he")
	public static final int[] field1104 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.qf")
	public static int field1157 = 10;

	@ObfuscatedName("client.sf")
	public static boolean field1159 = true;

	@ObfuscatedName("client.Vf")
	public static BigInteger field1185 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.kh")
	public static BigInteger field1247 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Mh")
	public static int[] field1275 = new int[99];

	@ObfuscatedName("client.Mi")
	public static String field1323 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.nc")
	public int field1019;

	@ObfuscatedName("client.oc")
	public int field1020;

	@ObfuscatedName("client.pc")
	public static int field1021;

	@ObfuscatedName("client.qc")
	public int field1022;

	@ObfuscatedName("client.sc")
	public int field1024;

	@ObfuscatedName("client.wc")
	public int field1028;

	@ObfuscatedName("client.yc")
	public int field1030;

	@ObfuscatedName("client.Fc")
	public int field1036;

	@ObfuscatedName("client.Ic")
	public int field1039;

	@ObfuscatedName("client.Pc")
	public int field1043;

	@ObfuscatedName("client.Qc")
	public int field1044;

	@ObfuscatedName("client.Vc")
	public static int field1047;

	@ObfuscatedName("client.Wc")
	public int field1048;

	@ObfuscatedName("client.jd")
	public int field1061;

	@ObfuscatedName("client.kd")
	public int field1062;

	@ObfuscatedName("client.ld")
	public int field1063;

	@ObfuscatedName("client.md")
	public int field1064;

	@ObfuscatedName("client.pd")
	public int field1067;

	@ObfuscatedName("client.qd")
	public int field1068;

	@ObfuscatedName("client.vd")
	public int field1070;

	@ObfuscatedName("client.Dd")
	public static int field1077;

	@ObfuscatedName("client.Fd")
	public int field1079;

	@ObfuscatedName("client.Gd")
	public int field1080;

	@ObfuscatedName("client.Hd")
	public int field1081;

	@ObfuscatedName("client.Id")
	public int field1082;

	@ObfuscatedName("client.Jd")
	public int field1083;

	@ObfuscatedName("client.Kd")
	public int field1084;

	@ObfuscatedName("client.Md")
	public static int field1085;

	@ObfuscatedName("client.Sd")
	public int field1090;

	@ObfuscatedName("client.Vd")
	public int field1093;

	@ObfuscatedName("client.Yd")
	public int field1095;

	@ObfuscatedName("client.ke")
	public int field1106;

	@ObfuscatedName("client.xe")
	public int field1118;

	@ObfuscatedName("client.ze")
	public int field1119;

	@ObfuscatedName("client.Ae")
	public int field1120;

	@ObfuscatedName("client.Be")
	public int field1121;

	@ObfuscatedName("client.Ce")
	public int field1122;

	@ObfuscatedName("client.He")
	public int field1125;

	@ObfuscatedName("client.Je")
	public int field1127;

	@ObfuscatedName("client.Me")
	public static int field1129;

	@ObfuscatedName("client.Ne")
	public int field1130;

	@ObfuscatedName("client.Te")
	public int field1136;

	@ObfuscatedName("client.Ue")
	public int field1137;

	@ObfuscatedName("client.Ve")
	public int field1138;

	@ObfuscatedName("client.We")
	public int field1139;

	@ObfuscatedName("client.Xe")
	public int field1140;

	@ObfuscatedName("client.cf")
	public int field1145;

	@ObfuscatedName("client.df")
	public int field1146;

	@ObfuscatedName("client.ef")
	public int field1147;

	@ObfuscatedName("client.ff")
	public int field1148;

	@ObfuscatedName("client.gf")
	public int field1149;

	@ObfuscatedName("client.hf")
	public int field1150;

	@ObfuscatedName("client.of")
	public int field1155;

	@ObfuscatedName("client.rf")
	public static int field1158;

	@ObfuscatedName("client.xf")
	public int field1164;

	@ObfuscatedName("client.Ef")
	public static int field1171;

	@ObfuscatedName("client.Ff")
	public int field1172;

	@ObfuscatedName("client.Gf")
	public int field1173;

	@ObfuscatedName("client.Hf")
	public int field1174;

	@ObfuscatedName("client.If")
	public int field1175;

	@ObfuscatedName("client.Sf")
	public int field1182;

	@ObfuscatedName("client.Uf")
	public static int field1184;

	@ObfuscatedName("client.Yf")
	public int field1187;

	@ObfuscatedName("client.ag")
	public int field1189;

	@ObfuscatedName("client.bg")
	public int field1190;

	@ObfuscatedName("client.dg")
	public int field1192;

	@ObfuscatedName("client.ig")
	public int field1196;

	@ObfuscatedName("client.jg")
	public int field1197;

	@ObfuscatedName("client.ng")
	public int field1201;

	@ObfuscatedName("client.og")
	public int field1202;

	@ObfuscatedName("client.pg")
	public int field1203;

	@ObfuscatedName("client.qg")
	public int field1204;

	@ObfuscatedName("client.rg")
	public int field1205;

	@ObfuscatedName("client.Bg")
	public static int field1213;

	@ObfuscatedName("client.Dg")
	public int field1215;

	@ObfuscatedName("client.Eg")
	public int field1216;

	@ObfuscatedName("client.Gg")
	public int field1218;

	@ObfuscatedName("client.Kg")
	public int field1222;

	@ObfuscatedName("client.Lg")
	public int field1223;

	@ObfuscatedName("client.Mg")
	public int field1224;

	@ObfuscatedName("client.Og")
	public int field1226;

	@ObfuscatedName("client.Pg")
	public int field1227;

	@ObfuscatedName("client.Qg")
	public int field1228;

	@ObfuscatedName("client.Rg")
	public int field1229;

	@ObfuscatedName("client.Sg")
	public int field1230;

	@ObfuscatedName("client.Tg")
	public int field1231;

	@ObfuscatedName("client.Yg")
	public static int field1236;

	@ObfuscatedName("client.ah")
	public int field1238;

	@ObfuscatedName("client.bh")
	public int field1239;

	@ObfuscatedName("client.eh")
	public int field1242;

	@ObfuscatedName("client.fh")
	public int field1243;

	@ObfuscatedName("client.gh")
	public int field1244;

	@ObfuscatedName("client.hh")
	public int field1245;

	@ObfuscatedName("client.ph")
	public static int field1252;

	@ObfuscatedName("client.vh")
	public static int field1258;

	@ObfuscatedName("client.wh")
	public int field1259;

	@ObfuscatedName("client.xh")
	public int field1260;

	@ObfuscatedName("client.yh")
	public int field1261;

	@ObfuscatedName("client.zh")
	public int field1262;

	@ObfuscatedName("client.Ah")
	public int field1263;

	@ObfuscatedName("client.Ih")
	public int field1271;

	@ObfuscatedName("client.Jh")
	public int field1272;

	@ObfuscatedName("client.Kh")
	public int field1273;

	@ObfuscatedName("client.Lh")
	public int field1274;

	@ObfuscatedName("client.Oh")
	public int field1277;

	@ObfuscatedName("client.Xh")
	public int field1286;

	@ObfuscatedName("client.ai")
	public int field1289;

	@ObfuscatedName("client.bi")
	public int field1290;

	@ObfuscatedName("client.ci")
	public int field1291;

	@ObfuscatedName("client.gi")
	public int field1294;

	@ObfuscatedName("client.hi")
	public int field1295;

	@ObfuscatedName("client.ii")
	public int field1296;

	@ObfuscatedName("client.mi")
	public int field1300;

	@ObfuscatedName("client.wi")
	public int field1310;

	@ObfuscatedName("client.xi")
	public int field1311;

	@ObfuscatedName("client.Bi")
	public int field1314;

	@ObfuscatedName("client.Ci")
	public int field1315;

	@ObfuscatedName("client.Di")
	public int field1316;

	@ObfuscatedName("client.Ei")
	public int field1317;

	@ObfuscatedName("client.Fi")
	public int field1318;

	@ObfuscatedName("client.Gi")
	public int field1319;

	@ObfuscatedName("client.Hi")
	public static int field1320;

	@ObfuscatedName("client.Oi")
	public int field1325;

	@ObfuscatedName("client.Pi")
	public int field1326;

	@ObfuscatedName("client.Qi")
	public int field1327;

	@ObfuscatedName("client.Xi")
	public int field1334;

	@ObfuscatedName("client.Yi")
	public static int field1335;

	@ObfuscatedName("client.D")
	public int field941;

	@ObfuscatedName("client.F")
	public int field943;

	@ObfuscatedName("client.I")
	public int field946;

	@ObfuscatedName("client.J")
	public int field947;

	@ObfuscatedName("client.K")
	public int field948;

	@ObfuscatedName("client.L")
	public static int field949;

	@ObfuscatedName("client.Q")
	public int field952;

	@ObfuscatedName("client.U")
	public int field954;

	@ObfuscatedName("client.V")
	public int field955;

	@ObfuscatedName("client.Ab")
	public int field984;

	@ObfuscatedName("client.Bb")
	public int field985;

	@ObfuscatedName("client.Ib")
	public static int field991;

	@ObfuscatedName("client.Lb")
	public int field993;

	@ObfuscatedName("client.Mb")
	public int field994;

	@ObfuscatedName("client.Pb")
	public int field997;

	@ObfuscatedName("client.Ke")
	public long field1128;

	@ObfuscatedName("client.Ig")
	public long field1220;

	@ObfuscatedName("client.jh")
	public long field1246;

	@ObfuscatedName("client.Wh")
	public class26 field1285;

	@ObfuscatedName("client.zd")
	public class34 field1073;

	@ObfuscatedName("client.Ad")
	public class34 field1074;

	@ObfuscatedName("client.Qd")
	public class34 field1089;

	@ObfuscatedName("client.De")
	public class34 field1123;

	@ObfuscatedName("client.Ee")
	public class34 field1124;

	@ObfuscatedName("client.vg")
	public class34 field1207;

	@ObfuscatedName("client.wg")
	public class34 field1208;

	@ObfuscatedName("client.xg")
	public class34 field1209;

	@ObfuscatedName("client.yg")
	public class34 field1210;

	@ObfuscatedName("client.Fg")
	public class34 field1217;

	@ObfuscatedName("client.Li")
	public class34 field1322;

	@ObfuscatedName("client.Ub")
	public class35 field1001;

	@ObfuscatedName("client.Vb")
	public class35 field1002;

	@ObfuscatedName("client.Wb")
	public class35 field1003;

	@ObfuscatedName("client.Xb")
	public class35 field1004;

	@ObfuscatedName("client.Yb")
	public class35 field1005;

	@ObfuscatedName("client.Zb")
	public class35 field1006;

	@ObfuscatedName("client.Mc")
	public class35 field1040;

	@ObfuscatedName("client.Nc")
	public class35 field1041;

	@ObfuscatedName("client.Oc")
	public class35 field1042;

	@ObfuscatedName("client.Dh")
	public class35 field1266;

	@ObfuscatedName("client.Eh")
	public class35 field1267;

	@ObfuscatedName("client.Fh")
	public class35 field1268;

	@ObfuscatedName("client.Gh")
	public class35 field1269;

	@ObfuscatedName("client.Hh")
	public class35 field1270;

	@ObfuscatedName("client.rh")
	public class36 field1254;

	@ObfuscatedName("client.sh")
	public class36 field1255;

	@ObfuscatedName("client.th")
	public class36 field1256;

	@ObfuscatedName("client.uh")
	public class36 field1257;

	@ObfuscatedName("client.le")
	public class43 field1107;

	@ObfuscatedName("client.me")
	public class43 field1108;

	@ObfuscatedName("client.ne")
	public class43 field1109;

	@ObfuscatedName("client.oe")
	public class43 field1110;

	@ObfuscatedName("client.pe")
	public class43 field1111;

	@ObfuscatedName("client.qe")
	public class43 field1112;

	@ObfuscatedName("client.re")
	public class43 field1113;

	@ObfuscatedName("client.se")
	public class43 field1114;

	@ObfuscatedName("client.te")
	public class43 field1115;

	@ObfuscatedName("client.ue")
	public class43 field1116;

	@ObfuscatedName("client.Mf")
	public class43 field1177;

	@ObfuscatedName("client.Nf")
	public class43 field1178;

	@ObfuscatedName("client.Of")
	public class43 field1179;

	@ObfuscatedName("client.Sh")
	public class43 field1281;

	@ObfuscatedName("client.Th")
	public class43 field1282;

	@ObfuscatedName("client.Uh")
	public class43 field1283;

	@ObfuscatedName("client.Vh")
	public class43 field1284;

	@ObfuscatedName("client.ni")
	public class43 field1301;

	@ObfuscatedName("client.oi")
	public class43 field1302;

	@ObfuscatedName("client.pi")
	public class43 field1303;

	@ObfuscatedName("client.qi")
	public class43 field1304;

	@ObfuscatedName("client.ri")
	public class43 field1305;

	@ObfuscatedName("client.si")
	public class43 field1306;

	@ObfuscatedName("client.ti")
	public class43 field1307;

	@ObfuscatedName("client.ui")
	public class43 field1308;

	@ObfuscatedName("client.vi")
	public class43 field1309;

	@ObfuscatedName("client.R")
	public class46 field953;

	@ObfuscatedName("client.pf")
	public class47 field1156;

	@ObfuscatedName("client.eg")
	public class4 field1193;

	@ObfuscatedName("client.nd")
	public String field1065;

	@ObfuscatedName("client.ge")
	public String field1103;

	@ObfuscatedName("client.ji")
	public String field1297;

	@ObfuscatedName("client.ki")
	public String field1298;

	@ObfuscatedName("client.zi")
	public String field1313;

	@ObfuscatedName("client.ae")
	public static boolean field1097;

	@ObfuscatedName("client.tf")
	public static boolean field1160;

	@ObfuscatedName("client.tc")
	public int[] field1025;

	@ObfuscatedName("client.uc")
	public int[] field1026;

	@ObfuscatedName("client.Ec")
	public int[] field1035;

	@ObfuscatedName("client.Qe")
	public int[] field1133;

	@ObfuscatedName("client.Re")
	public int[] field1134;

	@ObfuscatedName("client.Af")
	public int[] field1167;

	@ObfuscatedName("client.Bf")
	public int[] field1168;

	@ObfuscatedName("client.Cf")
	public int[] field1169;

	@ObfuscatedName("client.Df")
	public int[] field1170;

	@ObfuscatedName("client.Fb")
	public int[] field988;

	@ObfuscatedName("client.Gb")
	public int[] field989;

	@ObfuscatedName("client.Hb")
	public int[] field990;

	@ObfuscatedName("client.Ch")
	public class35[] field1265;

	@ObfuscatedName("client.Nh")
	public byte[][] field1276;

	@ObfuscatedName("client.Ie")
	public byte[][][] field1126;

	@ObfuscatedName("client.Eb")
	public int[][][] field987;

	@ObfuscatedName("client.a(IIILhb;)V")
	public final void method363(int arg0, int arg1, class34 arg2) {
		int var4 = field1289 + field1095 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = class31.field478[var4];
			int var7 = class31.field479[var4];
			var6 = var6 * 256 / (field1009 + 256);
			var7 = var7 * 256 / (field1009 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method180(field1041, 83 - var9 - arg2.field521 / 2, var8 + 94 - arg2.field520 / 2);
			} else {
				arg2.method173(83 - var9 - arg2.field521 / 2, var8 + 94 - arg2.field520 / 2);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method364() {
		if (field1067 == 2) {
			method371((field1316 - field1243 << 7) + field1319, field1317 * 2, (field1315 - field1242 << 7) + field1318);

			if (field1045 > -1 && field1320 % 20 < 10) {
				field1015[2].method173(field1046 - 28, field1045 - 12);
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method365() {
		field1071 = false;
		while (field1333) {
			field1071 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field974 = null;
		field975 = null;
		field1265 = null;
		field1167 = null;
		field1168 = null;
		field1169 = null;
		field1170 = null;
		field1025 = null;
		field1026 = null;
		field1133 = null;
		field1134 = null;
		field1123 = null;
		field1124 = null;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method12(Runnable arg0, int arg1) {
		if (signlink.mainapp == null) {
			super.method12(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(II[BZ)V")
	public final void method366(int arg0, byte[] arg1, boolean arg2) {
		signlink.midifade = arg2 ? 1 : 0;
		signlink.midisave(arg1, arg0);
	}

	@ObfuscatedName("client.d(B)V")
	public final void method367() {
		field1039++;
		method452();
		method401();
		method397();
		method380();
		method375();

		if (!field1161) {
			int var1 = field1288;
			if (field954 / 256 > var1) {
				var1 = field954 / 256;
			}

			if (field1212[4] && field1249[4] + 128 > var1) {
				var1 = field1249[4] + 128;
			}

			int var2 = field1289 + field1090 & 0x7FF;
			method468(field983, method420(field1285.field268, field1285.field269, field1334) - 50, var2, var1 * 3 + 600, var1, field984);
		}

		int var3;
		if (field1161) {
			var3 = method403();
		} else {
			var3 = method402();
		}

		int var4 = field1145;
		int var5 = field1146;
		int var6 = field1147;
		int var7 = field1148;
		int var8 = field1149;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1212[var9]) {
				int var10 = (int) (Math.random() * (field1144[var9] * 2 + 1) + Math.sin(field1251[var9] / 100.0D * field1287[var9]) * field1249[var9] - field1144[var9]);
				if (var9 == 0) {
					field1145 += var10;
				}

				if (var9 == 1) {
					field1146 += var10;
				}

				if (var9 == 2) {
					field1147 += var10;
				}

				if (var9 == 3) {
					field1149 = field1149 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1148 += var10;
					if (field1148 < 128) {
						field1148 = 128;
					}

					if (field1148 > 383) {
						field1148 = 383;
					}
				}
			}
		}

		int var11 = class33.field512;
		class31.field473 = true;
		class31.field476 = 0;
		class31.field474 = field15 - 8;
		class31.field475 = field16 - 11;
		class32.method148();
		field1014.method90(var3, field1146, field1147, field1145, field1149, field1148);
		field1014.method64();
		method377();
		method364();
		method383(var11);
		method396();
		field1283.method236(11, 8, field8);
		field1145 = var4;
		field1146 = var5;
		field1147 = var6;
		field1148 = var7;
		field1149 = var8;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method9() {
		if (field1135 || field1069 || field1292) {
			method430();
		} else {
			if (field1279) {
				method479();
			} else {
				method416();
			}

			field1190 = 0;
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;I)V")
	public final void method13(String arg0, int arg1) {
		method448();

		if (field1156 == null) {
			super.method13(arg0, arg1);
		} else {
			field1303.method235();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1256.method188(var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", var3 / 2, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class32.method150(304, 0x8C1111, var3 / 2 - 152, var6, 34);
			class32.method150(302, 0, var3 / 2 - 151, var6 + 1, 32);
			class32.method149(var3 / 2 - 150, arg1 * 3, 0x8C1111, var6 + 2, 30);
			class32.method149(arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, 0, var6 + 2, 30);
			field1256.method188(var4 / 2 + 5 - var5, arg0, var3 / 2, 0xFFFFFF);
			field1303.method236(186, 214, field8);

			if (field1278) {
				field1278 = false;

				if (!field1071) {
					field1304.method236(0, 0, field8);
					field1305.method236(0, 661, field8);
				}

				field1301.method236(0, 128, field8);
				field1302.method236(386, 214, field8);
				field1306.method236(265, 0, field8);
				field1307.method236(265, 574, field8);
				field1308.method236(186, 128, field8);
				field1309.method236(186, 574, field8);
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method368() {
		if (field1061 == 0 && field1294 == 0) {
			field1132[field971] = "Walk here";
			field1101[field971] = 981;
			field1099[field971] = field15;
			field1100[field971] = field16;
			field971++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field476; var2++) {
			int var3 = class31.field477[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1014.method81(field1334, var4, var5, var3) >= 0) {
					class53 var8 = class53.method275(var7);
					if (field1061 == 1) {
						field1132[field971] = "Use " + field1065 + " with @cya@" + var8.field702;
						field1101[field971] = 505;
						field1102[field971] = var3;
						field1099[field971] = var4;
						field1100[field971] = var5;
						field971++;
					} else if (field1294 != 1) {
						if (var8.field718 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field718[var9] != null) {
									field1132[field971] = var8.field718[var9] + " @cya@" + var8.field702;

									if (var9 == 0) {
										field1101[field971] = 798;
									}

									if (var9 == 1) {
										field1101[field971] = 829;
									}

									if (var9 == 2) {
										field1101[field971] = 873;
									}

									if (var9 == 3) {
										field1101[field971] = 104;
									}

									if (var9 == 4) {
										field1101[field971] = 1659;
									}

									field1102[field971] = var3;
									field1099[field971] = var4;
									field1100[field971] = var5;
									field971++;
								}
							}
						}

						field1132[field971] = "Examine @cya@" + var8.field702;
						field1101[field971] = 1418;
						field1102[field971] = var3;
						field1099[field971] = var4;
						field1100[field971] = var5;
						field971++;
					} else if ((field1296 & 0x4) == 4) {
						field1132[field971] = field1297 + " @cya@" + var8.field702;
						field1101[field971] = 737;
						field1102[field971] = var3;
						field1099[field971] = var4;
						field1100[field971] = var5;
						field971++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field1029[var7];
					if (var10.field320.field742 == 1 && (var10.field268 & 0x7F) == 0x40 && (var10.field269 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1030; var11++) {
							class25 var12 = field1029[field1031[var11]];
							if (var12 != null && var10 != var12 && var12.field320.field742 == 1 && var10.field268 == var12.field268 && var10.field269 == var12.field269) {
								method446(field1031[var11], var5, var4, var12.field320);
							}
						}
					}

					method446(var7, var5, var4, var10.field320);
				}

				if (var6 == 0) {
					class26 var13 = field962[var7];
					if ((var13.field268 & 0x7F) == 0x40 && (var13.field269 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1030; var14++) {
							class25 var15 = field1029[field1031[var14]];
							if (var15 != null && var15.field320.field742 == 1 && var13.field268 == var15.field268 && var13.field269 == var15.field269) {
								method446(field1031[var14], var5, var4, var15.field320);
							}
						}

						for (int var16 = 0; var16 < field963; var16++) {
							class26 var17 = field962[field964[var16]];
							if (var17 != null && var13 != var17 && var13.field268 == var17.field268 && var13.field269 == var17.field269) {
								method440(var4, field964[var16], var5, var17);
							}
						}
					}

					method440(var4, var7, var5, var13);
				}

				if (var6 == 3) {
					class41 var18 = field1241[field1334][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method229(); var19 != null; var19 = (class22) var18.method231()) {
							class55 var20 = class55.method287(var19.field266);
							if (field1061 == 1) {
								field1132[field971] = "Use " + field1065 + " with @lre@" + var20.field770;
								field1101[field971] = 203;
								field1102[field971] = var19.field266;
								field1099[field971] = var4;
								field1100[field971] = var5;
								field971++;
							} else if (field1294 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field784 != null && var20.field784[var21] != null) {
										field1132[field971] = var20.field784[var21] + " @lre@" + var20.field770;

										if (var21 == 0) {
											field1101[field971] = 56;
										}

										if (var21 == 1) {
											field1101[field971] = 321;
										}

										if (var21 == 2) {
											field1101[field971] = 552;
										}

										if (var21 == 3) {
											field1101[field971] = 43;
										}

										if (var21 == 4) {
											field1101[field971] = 687;
										}

										field1102[field971] = var19.field266;
										field1099[field971] = var4;
										field1100[field971] = var5;
										field971++;
									} else if (var21 == 2) {
										field1132[field971] = "Take @lre@" + var20.field770;
										field1101[field971] = 552;
										field1102[field971] = var19.field266;
										field1099[field971] = var4;
										field1100[field971] = var5;
										field971++;
									}
								}

								field1132[field971] = "Examine @lre@" + var20.field770;
								field1101[field971] = 1308;
								field1102[field971] = var19.field266;
								field1099[field971] = var4;
								field1100[field971] = var5;
								field971++;
							} else if ((field1296 & 0x1) == 1) {
								field1132[field971] = field1297 + " @lre@" + var20.field770;
								field1101[field971] = 543;
								field1102[field971] = var19.field266;
								field1099[field971] = var4;
								field1100[field971] = var5;
								field971++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method369() {
		if (field1203 == 0) {
			field1132[0] = "Cancel";
			field1101[0] = 1333;
			field971 = 1;
			method447(field16, field15);
			field1314 = 0;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field1098 == -1) {
					method368();
				} else {
					method421(class60.field829[field1098], 11, field16, 0, 8, field15);
				}
			}

			if (field1314 != field1187) {
				field1187 = field1314;
			}

			field1314 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field1141 != -1) {
					method421(class60.field829[field1141], 231, field16, 0, 562, field15);
				} else if (field1087[field1066] != -1) {
					method421(class60.field829[field1087[field1066]], 231, field16, 0, 562, field15);
				}
			}

			if (field948 != field1314) {
				field1018 = true;
				field948 = field1314;
			}

			field1314 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 431 && field16 < 471) {
				if (field1248 == -1) {
					method484(field16 - 375, field15 - 22);
				} else {
					method421(class60.field829[field1248], 375, field16, 0, 22, field15);
				}
			}

			if (field1248 != -1 && field1314 != field1226) {
				field986 = true;
				field1226 = field1314;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field971 - 1; var2++) {
					if (field1101[var2] < 1000 && field1101[var2 + 1] > 1000) {
						String var3 = field1132[var2];
						field1132[var2] = field1132[var2 + 1];
						field1132[var2 + 1] = var3;
						int var4 = field1101[var2];
						field1101[var2] = field1101[var2 + 1];
						field1101[var2 + 1] = var4;
						int var5 = field1099[var2];
						field1099[var2] = field1099[var2 + 1];
						field1099[var2 + 1] = var5;
						int var6 = field1100[var2];
						field1100[var2] = field1100[var2 + 1];
						field1100[var2 + 1] = var6;
						int var7 = field1102[var2];
						field1102[var2] = field1102[var2 + 1];
						field1102[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lx;II)V")
	public final void method370(class24 arg0, int arg1) {
		method371(arg0.field269, arg1, arg0.field268);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method371(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method420(arg2, arg0, field1334) - arg1;
			arg2 -= field1145;
			var4 -= field1146;
			arg0 -= field1147;
			int var5 = class31.field478[field1148];
			int var6 = class31.field479[field1148];
			int var7 = class31.field478[field1149];
			int var8 = class31.field479[field1149];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1045 = (var9 << 9) / arg0 + class33.field497;
				field1046 = (var11 << 9) / arg0 + class33.field498;
			} else {
				field1045 = -1;
				field1046 = -1;
			}
		} else {
			field1045 = -1;
			field1046 = -1;
		}
	}

	@ObfuscatedName("client.a(BIZ)V")
	public final void method372(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(BLkb;I)V")
	public final void method373(class37 arg0, int arg1) {
		while (arg0.field541 + 21 < arg1 * 8) {
			int var3 = arg0.method220(13);
			if (var3 == 8191) {
				break;
			}

			if (field1029[var3] == null) {
				field1029[var3] = new class25();
			}

			class25 var4 = field1029[var3];
			field1031[field1030++] = var3;
			var4.field312 = field1320;
			var4.field320 = class54.method281(arg0.method220(11));
			var4.field272 = var4.field320.field742;
			var4.field275 = var4.field320.field746;
			var4.field276 = var4.field320.field747;
			var4.field277 = var4.field320.field748;
			var4.field278 = var4.field320.field749;
			var4.field273 = var4.field320.field745;
			int var5 = arg0.method220(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method220(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method109(field1285.field317[0] + var6, false, field1285.field316[0] + var5);
			int var7 = arg0.method220(1);
			if (var7 == 1) {
				field966[field965++] = var3;
			}
		}

		arg0.method221();
	}

	@ObfuscatedName("client.a(Lhc;I)Z")
	public final boolean method374(class60 arg0) {
		int var2 = arg0.field838;
		if (var2 == 201) {
			field986 = true;
			field1033 = false;
			field1194 = true;
			field1165 = "";
			field952 = 1;
			field1163 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field986 = true;
			field1033 = false;
			field1194 = true;
			field1165 = "";
			field952 = 2;
			field1163 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1084 = 250;
			return true;
		}

		if (var2 == 501) {
			field986 = true;
			field1033 = false;
			field1194 = true;
			field1165 = "";
			field952 = 4;
			field1163 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field986 = true;
			field1033 = false;
			field1194 = true;
			field1165 = "";
			field952 = 5;
			field1163 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1176[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class59.field821 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class59.field821) {
							var5 = 0;
						}
					}

					if (!class59.field822[var5].field828 && class59.field822[var5].field823 == var3 + (field1038 ? 0 : 7)) {
						break;
					}
				}

				field1176[var3] = var5;
				field1253 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field968[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1037[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1037[var6].length) {
					var8 = 0;
				}
			}

			field968[var6] = var8;
			field1253 = true;
		}

		if (var2 == 324 && !field1038) {
			field1038 = true;
			method463();
		}

		if (var2 == 325 && field1038) {
			field1038 = false;
			method463();
		}

		if (var2 == 326) {
			field1016.method198(239);
			field1016.method199(field1038 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1016.method199(field1176[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1016.method199(field968[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field959 = !field959;
		}

		if (var2 >= 601 && var2 <= 612) {
			method453();

			if (field1235.length() > 0) {
				field1016.method198(252);
				field1016.method205(class48.method251(field1235));
				field1016.method199(var2 - 601);
				field1016.method199(field959 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method375() {
		for (class40 var1 = (class40) field1324.method228(); var1 != null; var1 = (class40) field1324.method230()) {
			boolean var2 = false;
			var1.field576 += field1239;

			if (var1.field575 == -1) {
				var1.field575 = 0;
				var2 = true;
			}

			while (var1.field576 > var1.field574.field899[var1.field575]) {
				var1.field576 -= var1.field574.field899[var1.field575] + 1;
				var1.field575++;
				var2 = true;

				if (var1.field575 >= var1.field574.field896) {
					var1.field575 -= var1.field574.field900;
					if (var1.field575 < 0 || var1.field575 >= var1.field574.field896) {
						break;
					}
				}
			}

			var1.method107();
			var2 = false;
			if (var2) {
				int var3 = var1.field569;
				int var4 = var1.field571;
				int var5 = var1.field572;
				int var6 = 0;
				if (var1.field570 == 0) {
					var6 = field1014.method77(var3, var4, var5);
				}

				if (var1.field570 == 1) {
					var6 = field1014.method78(var5, var3, var4);
				}

				if (var1.field570 == 2) {
					var6 = field1014.method79(var3, var4, var5);
				}

				if (var1.field570 == 3) {
					var6 = field1014.method80(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field573) {
					int var7 = field987[var3][var4][var5];
					int var8 = field987[var3][var4 + 1][var5];
					int var9 = field987[var3][var4 + 1][var5 + 1];
					int var10 = field987[var3][var4][var5 + 1];
					class53 var11 = class53.method275(var1.field573);
					int var12 = -1;
					if (var1.field575 != -1) {
						var12 = var1.field574.field897[var1.field575];
					}

					if (var1.field570 == 2) {
						int var13 = field1014.method81(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						class31 var16 = var11.method278(var14, var15, var7, var8, var9, var10, var12);
						field1014.method66(var4, var16, var3, var5);
					} else if (var1.field570 == 1) {
						class31 var17 = var11.method278(4, 0, var7, var8, var9, var10, var12);
						field1014.method68(var17, var4, var5, var3);
					} else if (var1.field570 == 0) {
						int var18 = field1014.method81(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							class31 var22 = var11.method278(2, var20 + 4, var7, var8, var9, var10, var12);
							class31 var23 = var11.method278(2, var21, var7, var8, var9, var10, var12);
							field1014.method71(var23, var22, var5, var3, var4);
						} else {
							class31 var24 = var11.method278(var19, var20, var7, var8, var9, var10, var12);
							field1014.method70(var3, var24, var4, var5);
						}
					} else if (var1.field570 == 3) {
						int var25 = field1014.method81(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						class31 var27 = var11.method278(22, var26, var7, var8, var9, var10, var12);
						field1014.method69(var27, var3, var4, var5);
					}
				} else {
					var1.method107();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg2 >= 1 && arg1 <= 102 && arg2 <= 102) {
			if (field1160 && field1334 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field1014.method77(arg4, arg1, arg2);
			}

			if (arg6 == 1) {
				var8 = field1014.method78(arg2, arg4, arg1);
			}

			if (arg6 == 2) {
				var8 = field1014.method79(arg4, arg1, arg2);
			}

			if (arg6 == 3) {
				var8 = field1014.method80(arg4, arg1, arg2);
			}

			if (var8 != 0) {
				int var12 = field1014.method81(arg4, arg1, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field1014.method72(arg4, arg2, arg1);
					class53 var16 = class53.method275(var13);
					if (var16.field708) {
						field1293[arg4].method300(var16.field709, arg2, var14, arg1, var15);
					}
				}

				if (arg6 == 1) {
					field1014.method73(arg2, arg1, arg4);
				}

				if (arg6 == 2) {
					field1014.method74(arg4, arg1, arg2);
					class53 var17 = class53.method275(var13);
					if (var17.field706 + arg1 > 103 || var17.field706 + arg2 > 103 || var17.field707 + arg1 > 103 || var17.field707 + arg2 > 103) {
						return;
					}

					if (var17.field708) {
						field1293[arg4].method301(var15, var17.field706, arg1, arg2, var17.field709, var17.field707);
					}
				}

				if (arg6 == 3) {
					field1014.method75(arg1, arg2, arg4);
					class53 var18 = class53.method275(var13);
					if (var18.field708 && var18.field710) {
						field1293[arg4].method303(arg2, arg1);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field1126[1][arg1][arg2] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				class3.method28(field1293[arg4], field1324, arg2, arg3, field1014, field987, arg5, arg4, arg0, var19, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method377() {
		field1048 = 0;
		for (int var1 = -1; var1 < field963 + field1030; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field1285;
			} else if (var1 < field963) {
				var2 = field962[field964[var1]];
			} else {
				var2 = field1029[field1031[var1 - field963]];
			}

			if (var2 != null && var2.method111()) {
				if (var1 < field963) {
					int var3 = 30;
					class26 var4 = (class26) var2;
					if (var4.field324 != 0) {
						method370(var2, var2.field313 + 15);

						if (field1045 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field324 & 1 << var5) != 0) {
									field1015[var5].method173(field1046 - var3, field1045 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1067 == 10 && field964[var1] == field1238) {
						method370(var2, var2.field313 + 15);

						if (field1045 > -1) {
							field1015[7].method173(field1046 - var3, field1045 - 12);
						}
					}
				} else if (field1067 == 1 && field1031[var1 - field963] == field1274 && field1320 % 20 < 10) {
					method370(var2, var2.field313 + 15);

					if (field1045 > -1) {
						field1015[2].method173(field1046 - 28, field1045 - 12);
					}
				}

				if (var2.field280 != null && (var1 >= field963 || field993 == 0 || field993 == 3 || field993 == 1 && method444(((class26) var2).field321))) {
					method370(var2, var2.field313);

					if (field1045 > -1 && field1048 < field1049) {
						field1053[field1048] = field1256.method190(var2.field280) / 2;
						field1052[field1048] = field1256.field537;
						field1050[field1048] = field1045;
						field1051[field1048] = field1046;
						field1054[field1048] = var2.field282;
						field1055[field1048] = var2.field283;
						field1056[field1048] = var2.field281;
						field1057[field1048++] = var2.field280;

						if (field970 == 0 && var2.field283 == 1) {
							field1052[field1048] += 10;
							field1051[field1048] += 5;
						}

						if (field970 == 0 && var2.field283 == 2) {
							field1053[field1048] = 60;
						}
					}
				}

				if (var2.field286 > field1320 + 100) {
					method370(var2, var2.field313 + 15);

					if (field1045 > -1) {
						int var6 = var2.field287 * 30 / var2.field288;
						if (var6 > 30) {
							var6 = 30;
						}

						class32.method149(field1045 - 15, var6, 0xFF00, field1046 - 3, 5);
						class32.method149(field1045 + var6 - 15, 30 - var6, 0xFF0000, field1046 - 3, 5);
					}
				}

				if (var2.field286 > field1320 + 330) {
					method370(var2, var2.field313 / 2);

					if (field1045 > -1) {
						field951[var2.field285].method173(field1046 - 12, field1045 - 12);
						field1254.method188(field1046 + 4, String.valueOf(var2.field284), field1045, 0);
						field1254.method188(field1046 + 3, String.valueOf(var2.field284), field1045 - 1, 0xFFFFFF);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field1048; var7++) {
			int var8 = field1050[var7];
			int var9 = field1051[var7];
			int var10 = field1053[var7];
			int var11 = field1052[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field1051[var13] - field1052[var13] && var9 - var11 < field1051[var13] + 2 && var8 - var10 < field1053[var13] + field1050[var13] && var8 + var10 > field1050[var13] - field1053[var13] && field1051[var13] - field1052[var13] < var9) {
						var9 = field1051[var13] - field1052[var13];
						var12 = true;
					}
				}
			}

			field1045 = field1050[var7];
			field1046 = field1051[var7] = var9;
			String var14 = field1057[var7];
			if (field970 == 0) {
				int var15 = 0xFFFF00;
				if (field1054[var7] < 6) {
					var15 = field1032[field1054[var7]];
				}

				if (field1054[var7] == 6) {
					var15 = field1039 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1054[var7] == 7) {
					var15 = field1039 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1054[var7] == 8) {
					var15 = field1039 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1054[var7] == 9) {
					int var16 = 150 - field1056[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1054[var7] == 10) {
					int var17 = 150 - field1056[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1054[var7] == 11) {
					int var18 = 150 - field1056[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1055[var7] == 0) {
					field1256.method188(field1046 + 1, var14, field1045, 0);
					field1256.method188(field1046, var14, field1045, var15);
				}

				if (field1055[var7] == 1) {
					field1256.method192(0, field1039, field1045, field1046 + 1, var14);
					field1256.method192(var15, field1039, field1045, field1046, var14);
				}

				if (field1055[var7] == 2) {
					int var19 = field1256.method190(var14);
					int var20 = (150 - field1056[var7]) * (var19 + 100) / 150;
					class32.method147(field1045 - 50, 0, field1045 + 50, 334);
					field1256.method191(field1046 + 1, var14, field1045 + 50 - var20, 0);
					field1256.method191(field1046, var14, field1045 + 50 - var20, var15);
					class32.method146();
				}
			} else {
				field1256.method188(field1046 + 1, var14, field1045, 0);
				field1256.method188(field1046, var14, field1045, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(IBIII)Z")
	public final boolean method378(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field1014.method81(field1334, arg0, arg2, arg3);
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
				var10 = var9.field706;
				var11 = var9.field707;
			} else {
				var10 = var9.field707;
				var11 = var9.field706;
			}

			int var12 = var9.field730;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method486(0, false, 2, field1285.field316[0], arg2, field1285.field317[0], var12, 0, arg0, var11, var10);
		} else {
			method486(var7 + 1, false, 2, field1285.field316[0], arg2, field1285.field317[0], 0, var8, arg0, 0, 0);
		}

		field1119 = field18;
		field1120 = field19;
		field1122 = 2;
		field1121 = 0;
		field1016.method198(arg1);
		field1016.method200(field1242 + arg0);
		field1016.method200(field1243 + arg2);
		field1016.method200(var5);
		return true;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method379() {
		int var1 = field1228;
		int var2 = field1229;
		int var3 = field1230;
		int var4 = field1231;
		int var5 = 0x5D5447;
		class32.method149(var1, var3, var5, var2, var4);
		class32.method149(var1 + 1, var3 - 2, 0, var2 + 1, 16);
		class32.method150(var3 - 2, 0, var1 + 1, var2 + 18, var4 - 19);
		field1256.method191(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field15;
		int var7 = field16;
		if (field1227 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1227 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field1227 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field971; var8++) {
			int var9 = (field971 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1256.method193(field1132[var8], var10, var1 + 3, true, var9);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method380() {
		for (class28 var1 = (class28) field942.method228(); var1 != null; var1 = (class28) field942.method230()) {
			if (field1334 != var1.field368 || var1.field374) {
				var1.method107();
			} else if (field1320 >= var1.field367) {
				var1.method118(field1239);

				if (var1.field374) {
					var1.method107();
				} else {
					field1014.method61(null, var1.field371, -1, var1.field370, 0, 60, false, var1.field369, var1, var1.field368);
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method381() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field993 = (field993 + 1) % 4;
				field1105 = true;
				field986 = true;
				field1016.method198(197);
				field1016.method199(field993);
				field1016.method199(field1068);
				field1016.method199(field1155);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field1068 = (field1068 + 1) % 3;
				field1105 = true;
				field986 = true;
				field1016.method198(197);
				field1016.method199(field993);
				field1016.method199(field1068);
				field1016.method199(field1155);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field1155 = (field1155 + 1) % 3;
				field1105 = true;
				field986 = true;
				field1016.method198(197);
				field1016.method199(field993);
				field1016.method199(field1068);
				field1016.method199(field1155);
			}

			if (field18 >= 416 && field18 <= 516 && field19 >= 490 && field19 <= 522) {
				method453();
				field1235 = "";
				field959 = false;

				for (int var1 = 0; var1 < class60.field829.length; var1++) {
					if (class60.field829[var1] != null && class60.field829[var1].field838 == 600) {
						field1131 = field1098 = class60.field829[var1].field835;
						break;
					}
				}
			}

			field1171++;
			if (field1171 > 195) {
				field1171 = 0;
				field1016.method198(24);
				field1016.method199(239);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method382(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1023 != -1) {
			field1103 = arg2;
			field17 = 0;
		}

		if (field1248 == -1) {
			field986 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field956[var4] = field956[var4 - 1];
			field957[var4] = field957[var4 - 1];
			field958[var4] = field958[var4 - 1];
		}

		field956[0] = arg0;
		field957[0] = arg1;
		field958[0] = arg2;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method383(int arg0) {
		if (!field1160) {
			if (class33.field511[17] >= arg0) {
				class35 var2 = class33.field505[17];
				int var3 = var2.field525 * var2.field524 - 1;
				int var4 = field1239 * var2.field524 * 2;
				byte[] var5 = var2.field522;
				byte[] var6 = field1280;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field522 = var6;
				field1280 = var5;
				class33.method160(17);
			}

			if (class33.field511[24] >= arg0) {
				class35 var8 = class33.field505[24];
				int var9 = var8.field525 * var8.field524 - 1;
				int var10 = field1239 * var8.field524 * 2;
				byte[] var11 = var8.field522;
				byte[] var12 = field1280;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field522 = var12;
				field1280 = var11;
				class33.method160(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void method384(class37 arg0, int arg1) {
		while (arg0.field541 + 10 < arg1 * 8) {
			int var3 = arg0.method220(11);
			if (var3 == 2047) {
				break;
			}

			if (field962[var3] == null) {
				field962[var3] = new class26();
				if (field967[var3] != null) {
					field962[var3].method113(field967[var3]);
				}
			}

			field964[field963++] = var3;
			class26 var4 = field962[var3];
			var4.field312 = field1320;
			int var5 = arg0.method220(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method220(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method220(1);
			var4.method109(field1285.field317[0] + var6, var7 == 1, field1285.field316[0] + var5);
			int var8 = arg0.method220(1);
			if (var8 == 1) {
				field966[field965++] = var3;
			}
		}

		arg0.method221();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(ZLkb;I)V")
	public final void method385(class37 arg0, int arg1) {
		field1311 = 0;
		field965 = 0;
		method424(arg0, arg1);
		method398(arg0, arg1);
		method384(arg0, arg1);
		method431(arg0, arg1);

		for (int var3 = 0; var3 < field1311; var3++) {
			int var4 = field1312[var3];
			if (field1320 != field962[var4].field312) {
				field962[var4] = null;
			}
		}

		if (arg0.field540 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field540 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field963; var5++) {
			if (field962[field964[var5]] == null) {
				signlink.reporterror(field1198 + " null entry in pl list - pos:" + var5 + " size:" + field963);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method386(int arg0) {
		if (arg0 >= 0) {
			if (field1033) {
				field1033 = false;
				field986 = true;
			}

			int var2 = field1099[arg0];
			int var3 = field1100[arg0];
			int var4 = field1101[arg0];
			int var5 = field1102[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 316) {
				String var6 = field1132[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					method453();
					field1235 = var6.substring(var7 + 5).trim();
					field959 = false;

					for (int var8 = 0; var8 < class60.field829.length; var8++) {
						if (class60.field829[var8] != null && class60.field829[var8].field838 == 600) {
							field1131 = field1098 = class60.field829[var8].field835;
							break;
						}
					}
				}
			}

			if (var4 == 48) {
				class26 var9 = field962[var5];
				if (var9 != null) {
					method486(0, false, 2, field1285.field316[0], var9.field317[0], field1285.field317[0], 0, 0, var9.field316[0], 1, 1);
					field1119 = field18;
					field1120 = field19;
					field1122 = 2;
					field1121 = 0;
					field1016.method198(39);
					field1016.method200(var5);
					field1016.method200(field1295);
				}
			}

			if (var4 == 1308) {
				class55 var10 = class55.method287(var5);
				String var11;
				if (var10.field771 == null) {
					var11 = "It's a " + var10.field770 + ".";
				} else {
					var11 = new String(var10.field771);
				}

				method382(0, "", var11);
			}

			if (var4 == 63) {
				field1016.method198(158);
				field1016.method200(var5);
				field1016.method200(var2);
				field1016.method200(var3);
				field1016.method200(field1295);
				field1172 = 0;
				field1173 = var3;
				field1174 = var2;
				field1175 = 2;
				if (class60.field829[var3].field835 == field1098) {
					field1175 = 1;
				}

				if (class60.field829[var3].field835 == field1248) {
					field1175 = 3;
				}
			}

			if (var4 == 1814) {
				class25 var12 = field1029[var5];
				if (var12 != null) {
					String var13;
					if (var12.field320.field741 == null) {
						var13 = "It's a " + var12.field320.field740 + ".";
					} else {
						var13 = new String(var12.field320.field741);
					}

					method382(0, "", var13);
				}
			}

			if (var4 == 706) {
				class60 var14 = class60.field829[var3];
				boolean var15 = true;
				if (var14.field838 > 0) {
					var15 = method374(var14);
				}

				if (var15) {
					field1016.method198(222);
					field1016.method200(var3);
				}
			}

			if (var4 == 1659) {
				method378(var2, 181, var3, var5);
			}

			if (var4 == 104) {
				method378(var2, 168, var3, var5);
			}

			if (var4 == 73 && !field1166) {
				field1016.method198(218);
				field1016.method200(var3);
				field1166 = true;
			}

			if (var4 == 988 || var4 == 345 || var4 == 249 || var4 == 960 || var4 == 40) {
				class25 var16 = field1029[var5];
				if (var16 != null) {
					method486(0, false, 2, field1285.field316[0], var16.field317[0], field1285.field317[0], 0, 0, var16.field316[0], 1, 1);
					field1119 = field18;
					field1120 = field19;
					field1122 = 2;
					field1121 = 0;

					if (var4 == 960) {
						field1016.method198(114);
					}

					if (var4 == 345) {
						field1077 += var5;
						if (field1077 >= 116) {
							field1016.method198(217);
						}

						field1016.method198(191);
					}

					if (var4 == 249) {
						field1016.method198(89);
					}

					if (var4 == 40) {
						field1016.method198(198);
					}

					if (var4 == 988) {
						field1016.method198(236);
					}

					field1016.method200(var5);
				}
			}

			if (var4 == 1418) {
				int var17 = var5 >> 14 & 0x7FFF;
				class53 var18 = class53.method275(var17);
				String var19;
				if (var18.field703 == null) {
					var19 = "It's a " + var18.field702 + ".";
				} else {
					var19 = new String(var18.field703);
				}

				method382(0, "", var19);
			}

			if (var4 == 500) {
				class25 var20 = field1029[var5];
				if (var20 != null) {
					method486(0, false, 2, field1285.field316[0], var20.field317[0], field1285.field317[0], 0, 0, var20.field316[0], 1, 1);
					field1119 = field18;
					field1120 = field19;
					field1122 = 2;
					field1121 = 0;
					field1016.method198(244);
					field1016.method200(var5);
					field1016.method200(field1295);
				}
			}

			if (var4 == 967) {
				field1016.method198(222);
				field1016.method200(var3);
				class60 var21 = class60.field829[var3];
				if (var21.field843 != null && var21.field843[0][0] == 5) {
					int var22 = var21.field843[0][1];
					field1017[var22] = 1 - field1017[var22];
					method487(var22);
					field1018 = true;
				}
			}

			if (var4 == 941) {
				class60 var23 = class60.field829[var3];
				field1294 = 1;
				field1295 = var3;
				field1296 = var23.field884;
				field1061 = 0;
				String var24 = var23.field882;
				if (var24.indexOf(" ") != -1) {
					var24 = var24.substring(0, var24.indexOf(" "));
				}

				String var25 = var23.field882;
				if (var25.indexOf(" ") != -1) {
					var25 = var25.substring(var25.indexOf(" ") + 1);
				}

				field1297 = var24 + " " + var23.field883 + " " + var25;

				if (field1296 == 16) {
					field1018 = true;
					field1066 = 3;
					field978 = true;
				}
			} else {
				if (var4 == 543) {
					boolean var26 = method486(0, false, 2, field1285.field316[0], var3, field1285.field317[0], 0, 0, var2, 0, 0);
					if (!var26) {
						method486(0, false, 2, field1285.field316[0], var3, field1285.field317[0], 0, 0, var2, 1, 1);
					}

					field1119 = field18;
					field1120 = field19;
					field1122 = 2;
					field1121 = 0;
					field1016.method198(241);
					field1016.method200(field1242 + var2);
					field1016.method200(field1243 + var3);
					field1016.method200(var5);
					field1016.method200(field1295);
				}

				if (var4 == 1974) {
					class55 var28 = class55.method287(var5);
					String var29;
					if (var3 >= 100000) {
						var29 = var3 + " x " + var28.field770;
					} else if (var28.field771 == null) {
						var29 = "It's a " + var28.field770 + ".";
					} else {
						var29 = new String(var28.field771);
					}

					method382(0, "", var29);
				}

				if (var4 == 829) {
					field1085 += var3;
					if (field1085 >= 132) {
						field1016.method198(27);
						field1016.method200(17379);
					}

					method378(var2, 223, var3, var5);
				}

				if (var4 == 103) {
					class26 var30 = field962[var5];
					if (var30 != null) {
						method486(0, false, 2, field1285.field316[0], var30.field317[0], field1285.field317[0], 0, 0, var30.field316[0], 1, 1);
						field1119 = field18;
						field1120 = field19;
						field1122 = 2;
						field1121 = 0;
						field1016.method198(184);
						field1016.method200(var5);
						field1016.method200(field1064);
						field1016.method200(field1062);
						field1016.method200(field1063);
					}
				}

				if (var4 == 672) {
					field1016.method198(222);
					field1016.method200(var3);
					class60 var31 = class60.field829[var3];
					if (var31.field843 != null && var31.field843[0][0] == 5) {
						int var32 = var31.field843[0][1];
						if (field1017[var32] != var31.field845[0]) {
							field1017[var32] = var31.field845[0];
							method487(var32);
							field1018 = true;
						}
					}
				}

				if (var4 == 357) {
					field1061 = 1;
					field1062 = var2;
					field1063 = var3;
					field1064 = var5;
					field1065 = class55.method287(var5).field770;
					field1294 = 0;
				} else {
					if (var4 == 237) {
						field1016.method198(106);
						field1016.method200(var5);
						field1016.method200(var2);
						field1016.method200(var3);
						field1016.method200(field1064);
						field1016.method200(field1062);
						field1016.method200(field1063);
						field1172 = 0;
						field1173 = var3;
						field1174 = var2;
						field1175 = 2;
						if (class60.field829[var3].field835 == field1098) {
							field1175 = 1;
						}

						if (class60.field829[var3].field835 == field1248) {
							field1175 = 3;
						}
					}

					if (var4 == 871 || var4 == 526 || var4 == 156 || var4 == 120 || var4 == 796) {
						if (var4 == 796) {
							if ((var5 & 0x3) == 0) {
								field1258++;
							}

							if (field1258 >= 124) {
								field1016.method198(167);
								field1016.method203(0);
							}

							field1016.method198(122);
						}

						if (var4 == 526) {
							field1016.method198(0);
						}

						if (var4 == 120) {
							field1016.method198(112);
						}

						if (var4 == 871) {
							field949 += var5;
							if (field949 >= 76) {
								field1016.method198(214);
								field1016.method199(171);
							}

							field1016.method198(140);
						}

						if (var4 == 156) {
							field1335++;
							if (field1335 >= 62) {
								field1016.method198(82);
								field1016.method199(142);
							}

							field1016.method198(155);
						}

						field1016.method200(var5);
						field1016.method200(var2);
						field1016.method200(var3);
						field1172 = 0;
						field1173 = var3;
						field1174 = var2;
						field1175 = 2;
						if (class60.field829[var3].field835 == field1098) {
							field1175 = 1;
						}

						if (class60.field829[var3].field835 == field1248) {
							field1175 = 3;
						}
					}

					if (var4 == 595 || var4 == 835) {
						String var33 = field1132[arg0];
						int var34 = var33.indexOf("@whi@");
						if (var34 != -1) {
							var33 = var33.substring(var34 + 5).trim();
							String var35 = class48.method255(class48.method252(class48.method251(var33)));
							boolean var36 = false;
							for (int var37 = 0; var37 < field963; var37++) {
								class26 var38 = field962[field964[var37]];
								if (var38 != null && var38.field321 != null && var38.field321.equalsIgnoreCase(var35)) {
									method486(0, false, 2, field1285.field316[0], var38.field317[0], field1285.field317[0], 0, 0, var38.field316[0], 1, 1);

									if (var4 == 595) {
										field1016.method198(245);
									}

									if (var4 == 835) {
										field1016.method198(173);
									}

									field1016.method200(field964[var37]);
									var36 = true;
									break;
								}
							}

							if (!var36) {
								method382(0, "", "Unable to find " + var35);
							}
						}
					}

					if (var4 == 309) {
						method453();
					}

					if (var4 == 447 || var4 == 158 || var4 == 804 || var4 == 521) {
						String var39 = field1132[arg0];
						int var40 = var39.indexOf("@whi@");
						if (var40 != -1) {
							long var41 = class48.method251(var39.substring(var40 + 5).trim());
							if (var4 == 447) {
								method412(var41);
							}

							if (var4 == 158) {
								method456(var41);
							}

							if (var4 == 804) {
								method417(var41);
							}

							if (var4 == 521) {
								method461(var41);
							}
						}
					}

					if (var4 == 737 && method378(var2, 9, var3, var5)) {
						field1016.method200(field1295);
					}

					if (var4 == 798) {
						field991++;
						if (field991 >= 135) {
							field1016.method198(253);
							field1016.method200(10151);
						}

						method378(var2, 207, var3, var5);
					}

					if (var4 == 493) {
						class25 var43 = field1029[var5];
						if (var43 != null) {
							method486(0, false, 2, field1285.field316[0], var43.field317[0], field1285.field317[0], 0, 0, var43.field316[0], 1, 1);
							field1119 = field18;
							field1120 = field19;
							field1122 = 2;
							field1121 = 0;
							field1016.method198(36);
							field1016.method200(var5);
							field1016.method200(field1064);
							field1016.method200(field1062);
							field1016.method200(field1063);
						}
					}

					if (var4 == 203) {
						boolean var44 = method486(0, false, 2, field1285.field316[0], var3, field1285.field317[0], 0, 0, var2, 0, 0);
						if (!var44) {
							method486(0, false, 2, field1285.field316[0], var3, field1285.field317[0], 0, 0, var2, 1, 1);
						}

						field1119 = field18;
						field1120 = field19;
						field1122 = 2;
						field1121 = 0;
						field1016.method198(183);
						field1016.method200(field1242 + var2);
						field1016.method200(field1243 + var3);
						field1016.method200(var5);
						field1016.method200(field1064);
						field1016.method200(field1062);
						field1016.method200(field1063);
					}

					if (var4 == 873) {
						method378(var2, 196, var3, var5);
					}

					if (var4 == 981) {
						if (field1180) {
							field1014.method89(var2 - 8, var3 - 11);
						} else {
							field1014.method89(field18 - 8, field19 - 11);
						}
					}

					if (var4 == 1528 || var4 == 1741 || var4 == 593 || var4 == 1596) {
						class26 var46 = field962[var5];
						if (var46 != null) {
							method486(0, false, 2, field1285.field316[0], var46.field317[0], field1285.field317[0], 0, 0, var46.field316[0], 1, 1);
							field1119 = field18;
							field1120 = field19;
							field1122 = 2;
							field1121 = 0;

							if (var4 == 1596) {
								field1016.method198(173);
							}

							if (var4 == 1741) {
								if ((var5 & 0x3) == 0) {
									field1184++;
								}

								if (field1184 >= 139) {
									field1016.method198(84);
									field1016.method203(0);
								}

								field1016.method198(63);
							}

							if (var4 == 1528) {
								field1016.method198(245);
							}

							if (var4 == 593) {
								field1016.method198(28);
							}

							field1016.method200(var5);
						}
					}

					if (var4 == 134 || var4 == 701 || var4 == 570 || var4 == 719 || var4 == 440) {
						if (var4 == 134) {
							field1016.method198(90);
						}

						if (var4 == 701) {
							field1016.method198(47);
						}

						if (var4 == 719) {
							field1016.method198(186);
						}

						if (var4 == 570) {
							field1016.method198(121);
						}

						if (var4 == 440) {
							field1016.method198(31);
						}

						field1016.method200(var5);
						field1016.method200(var2);
						field1016.method200(var3);
						field1172 = 0;
						field1173 = var3;
						field1174 = var2;
						field1175 = 2;
						if (class60.field829[var3].field835 == field1098) {
							field1175 = 1;
						}

						if (class60.field829[var3].field835 == field1248) {
							field1175 = 3;
						}
					}

					if (var4 == 125) {
						String var47 = field1132[arg0];
						int var48 = var47.indexOf("@whi@");
						if (var48 != -1) {
							long var49 = class48.method251(var47.substring(var48 + 5).trim());
							int var51 = -1;
							for (int var52 = 0; var52 < field1192; var52++) {
								if (field1328[var52] == var49) {
									var51 = var52;
									break;
								}
							}

							if (var51 != -1 && field1186[var51] > 0) {
								field986 = true;
								field1033 = false;
								field1194 = true;
								field1165 = "";
								field952 = 3;
								field1246 = field1328[var51];
								field1163 = "Enter message to send to " + field1092[var51];
							}
						}
					}

					if (var4 == 505 && method378(var2, 139, var3, var5)) {
						field1016.method200(field1064);
						field1016.method200(field1062);
						field1016.method200(field1063);
					}

					if (var4 == 56 || var4 == 321 || var4 == 552 || var4 == 43 || var4 == 687) {
						boolean var53 = method486(0, false, 2, field1285.field316[0], var3, field1285.field317[0], 0, 0, var2, 0, 0);
						if (!var53) {
							method486(0, false, 2, field1285.field316[0], var3, field1285.field317[0], 0, 0, var2, 1, 1);
						}

						field1119 = field18;
						field1120 = field19;
						field1122 = 2;
						field1121 = 0;

						if (var4 == 43) {
							field1016.method198(143);
						}

						if (var4 == 552) {
							field1016.method198(226);
						}

						if (var4 == 687) {
							field1213++;
							if (field1213 >= 121) {
								field1016.method198(13);
								field1016.method199(128);
							}

							field1016.method198(192);
						}

						if (var4 == 321) {
							field1016.method198(48);
						}

						if (var4 == 56) {
							field1016.method198(91);
						}

						field1016.method200(field1242 + var2);
						field1016.method200(field1243 + var3);
						field1016.method200(var5);
					}

					field1061 = 0;
					field1294 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method387() {
		field1142 = false;

		while (field1237) {
			try {
				Thread.sleep(50L);
			} catch (Exception var15) {
			}

			String var2;
			int var3;
			int var4;
			synchronized (field996) {
				var2 = field1298;
				var3 = field1079;
				var4 = field1130;
				field1298 = null;
				field1079 = 0;
				field1130 = 0;
			}

			if (var2 != null) {
				byte[] var5 = signlink.cacheload(var2 + ".mid");
				if (var5 != null && var3 != 12345678) {
					field1094.reset();
					field1094.update(var5);
					int var6 = (int) field1094.getValue();
					if (var3 != var6) {
						var5 = null;
					}
				}

				if (var5 == null) {
					try {
						DataInputStream var7 = method469(var2 + "_" + var3 + ".mid");
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
				method366(var12, var13, true);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method388() {
		int var1 = field1285.field268 + field997;
		int var2 = field1285.field269 + field1224;
		if (field983 - var1 < -500 || field983 - var1 > 500 || field984 - var2 < -500 || field984 - var2 > 500) {
			field983 = var1;
			field984 = var2;
		}

		if (field983 != var1) {
			field983 += (var1 - field983) / 16;
		}

		if (field984 != var2) {
			field984 += (var2 - field984) / 16;
		}

		if (field20[1] == 1) {
			field1290 += (-field1290 - 24) / 2;
		} else if (field20[2] == 1) {
			field1290 += (24 - field1290) / 2;
		} else {
			field1290 /= 2;
		}

		if (field20[3] == 1) {
			field1291 += (12 - field1291) / 2;
		} else if (field20[4] == 1) {
			field1291 += (-field1291 - 12) / 2;
		} else {
			field1291 /= 2;
		}

		field1289 = field1290 / 2 + field1289 & 0x7FF;
		field1288 += field1291 / 2;
		if (field1288 < 128) {
			field1288 = 128;
		}

		if (field1288 > 383) {
			field1288 = 383;
		}

		int var3 = field983 >> 7;
		int var4 = field984 >> 7;
		int var5 = method420(field983, field984, field1334);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1334;
					if (var9 < 3 && (field1126[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field987[var9][var7][var8];
					if (var10 > var6) {
						var6 = var10;
					}
				}
			}
		}

		field1047++;
		if (field1047 > 77) {
			field1047 = 0;
			field1016.method198(57);
		}

		int var11 = var6 * 192;
		if (var11 > 98048) {
			var11 = 98048;
		}

		if (var11 < 32768) {
			var11 = 32768;
		}

		if (var11 > field954) {
			field954 += (var11 - field954) / 24;
		} else if (var11 < field954) {
			field954 += (var11 - field954) / 80;
		}
	}

	@ObfuscatedName("client.h(I)Ljava/net/Socket;")
	public final Socket method389(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1193 != null) {
				field1193.method29();
			}
		} catch (Exception var1) {
		}

		field1193 = null;
		method470();
		field1237 = false;
		field1016 = null;
		field1162 = null;
		field1000 = null;
		field1035 = null;
		field976 = null;
		field1276 = null;
		field987 = null;
		field1126 = null;
		field1014 = null;
		field1293 = null;
		field1075 = null;
		field972 = null;
		field1330 = null;
		field1331 = null;
		field1280 = null;
		field1281 = null;
		field1282 = null;
		field1283 = null;
		field1284 = null;
		field1177 = null;
		field1178 = null;
		field1179 = null;
		field1107 = null;
		field1108 = null;
		field1109 = null;
		field1110 = null;
		field1111 = null;
		field1112 = null;
		field1113 = null;
		field1114 = null;
		field1115 = null;
		field1116 = null;
		field1040 = null;
		field1041 = null;
		field1042 = null;
		field1001 = null;
		field1002 = null;
		field1003 = null;
		field1086 = null;
		field1266 = null;
		field1267 = null;
		field1268 = null;
		field1269 = null;
		field1270 = null;
		field1004 = null;
		field1005 = null;
		field1006 = null;
		field1007 = null;
		field1008 = null;
		field1089 = null;
		field951 = null;
		field1015 = null;
		field973 = null;
		field1207 = null;
		field1208 = null;
		field1209 = null;
		field1210 = null;
		field1181 = null;
		field1143 = null;
		field1034 = null;
		field962 = null;
		field964 = null;
		field966 = null;
		field967 = null;
		field1312 = null;
		field1029 = null;
		field1031 = null;
		field1241 = null;
		field944 = null;
		field992 = null;
		field1219 = null;
		field942 = null;
		field1324 = null;
		field1099 = null;
		field1100 = null;
		field1101 = null;
		field1102 = null;
		field1132 = null;
		field1017 = null;
		field981 = null;
		field982 = null;
		field1240 = null;
		field1217 = null;
		field1092 = null;
		field1328 = null;
		field1186 = null;
		field1304 = null;
		field1305 = null;
		field1301 = null;
		field1302 = null;
		field1303 = null;
		field1306 = null;
		field1307 = null;
		field1308 = null;
		field1309 = null;
		method365();
		class53.method274();
		class54.method280();
		class55.method286();
		class58.field810 = null;
		class59.field822 = null;
		class60.field829 = null;
		class61.field888 = null;
		class62.field895 = null;
		class63.field908 = null;
		class63.field920 = null;
		class64.field922 = null;
		field9 = null;
		class26.field341 = null;
		class33.method153();
		class18.method49();
		class31.method120();
		class6.field66 = null;
		class7.field70 = null;
		System.gc();
	}

	@ObfuscatedName("client.i(I)V")
	public final void method390() {
		if (field1028 > 1) {
			field1028--;
		}

		if (field1084 > 0) {
			field1084--;
		}

		for (int var1 = 0; var1 < 5 && method423(); var1++) {
		}

		if (field1279) {
			for (int var2 = 0; var2 < field1022; var2++) {
				if (field1188[var2] <= 0) {
					boolean var3 = false;
					try {
						if (field1234[var2] != field1076 || field1060[var2] != field969) {
							class37 var4 = class51.method264(field1234[var2], field1060[var2]);
							if (System.currentTimeMillis() + var4.field540 / 22 > field1044 / 22 + field1128) {
								field1044 = var4.field540;
								field1128 = System.currentTimeMillis();

								if (method405(var4.field539, var4.field540)) {
									field1076 = field1234[var2];
									field969 = field1060[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!method406()) {
							var3 = true;
						}
					} catch (Exception var20) {
					}

					if (var3 && field1188[var2] != -5) {
						field1188[var2] = -5;
					} else {
						field1022--;
						for (int var6 = var2; var6 < field1022; var6++) {
							field1234[var6] = field1234[var6 + 1];
							field1060[var6] = field1060[var6 + 1];
							field1188[var6] = field1188[var6 + 1];
						}

						var2--;
					}
				} else {
					field1188[var2]--;
				}
			}

			if (field1164 > 0) {
				field1164 -= 20;
				if (field1164 < 0) {
					field1164 = 0;
				}

				if (field1164 == 0 && field1152 && !field1160) {
					method459(field1093, field1313, field1218);
				}
			}

			if (class5.field58) {
				class37 var7 = class5.method36();
				if (var7 != null) {
					field1016.method198(53);
					field1016.method200(var7.field540);
					field1016.method207(var7.field539, var7.field540, 0);
					var7.method197();
				}
			}

			field1082++;
			if (field1082 > 750) {
				method410();
			}

			method432();
			method472();
			method429();
			method460();

			if ((field20[1] == 1 || field20[2] == 1 || field20[3] == 1 || field20[4] == 1) && field985++ > 5) {
				field985 = 0;
				field1016.method198(109);
				field1016.method200(field1288);
				field1016.method200(field1289);
				field1016.method199(field1095);
				field1016.method199(field1009);
			}

			field1239++;

			if (field1122 != 0) {
				field1121 += 20;
				if (field1121 >= 400) {
					field1122 = 0;
				}
			}

			if (field1175 != 0) {
				field1172++;
				if (field1172 >= 15) {
					if (field1175 == 2) {
						field1018 = true;
					}

					if (field1175 == 3) {
						field986 = true;
					}

					field1175 = 0;
				}
			}

			if (field1203 != 0) {
				field1150++;

				if (field15 > field1204 + 5 || field15 < field1204 - 5 || field16 > field1205 + 5 || field16 < field1205 - 5) {
					field1200 = true;
				}

				if (field14 == 0) {
					if (field1203 == 2) {
						field1018 = true;
					}

					if (field1203 == 3) {
						field986 = true;
					}

					field1203 = 0;

					if (field1200 && field1150 >= 5) {
						field947 = -1;
						method369();

						if (field947 == field1201 && field946 != field1202) {
							class60 var8 = class60.field829[field1201];
							int var9 = var8.field830[field946];
							var8.field830[field946] = var8.field830[field1202];
							var8.field830[field1202] = var9;
							int var10 = var8.field831[field946];
							var8.field831[field946] = var8.field831[field1202];
							var8.field831[field1202] = var10;
							field1016.method198(80);
							field1016.method200(field1201);
							field1016.method200(field1202);
							field1016.method200(field946);
						}
					} else if ((field1106 == 1 || method425(field971 - 1)) && field971 > 2) {
						method481();
					} else if (field971 > 0) {
						method386(field971 - 1);
					}

					field1172 = 10;
					field17 = 0;
				}
			}

			if (class18.field228 != -1) {
				int var11 = class18.field228;
				int var12 = class18.field229;
				boolean var13 = method486(0, true, 0, field1285.field316[0], var12, field1285.field317[0], 0, 0, var11, 0, 0);
				class18.field228 = -1;

				if (var13) {
					field1119 = field18;
					field1120 = field19;
					field1122 = 1;
					field1121 = 0;
				}
			}

			if (field17 == 1 && field1103 != null) {
				field1103 = null;
				field986 = true;
				field17 = 0;
			}

			method426();
			method414();
			method443();
			method381();

			if (field14 == 1 || field17 == 1) {
				field1190++;
			}

			if (field1043 == 2) {
				method388();
			}

			if (field1043 == 2 && field1161) {
				method441();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				field1287[var14]++;
			}

			method488();
			field1252++;
			if (field1252 > 54) {
				field1252 = 0;
				field1016.method198(180);
			}

			field13++;
			if (field13 > 4500) {
				field1084 = 250;
				field13 -= 500;
				field1016.method198(161);
			}

			field1036++;
			if (field1036 > 500) {
				field1036 = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					field997 += field998;
				}

				if ((var15 & 0x2) == 2) {
					field1224 += field1225;
				}

				if ((var15 & 0x4) == 4) {
					field1090 += field1091;
				}
			}

			if (field997 < -50) {
				field998 = 2;
			}

			if (field997 > 50) {
				field998 = -2;
			}

			if (field1224 < -55) {
				field1225 = 2;
			}

			if (field1224 > 55) {
				field1225 = -2;
			}

			if (field1090 < -40) {
				field1091 = 1;
			}

			if (field1090 > 40) {
				field1091 = -1;
			}

			field1277++;
			if (field1277 > 500) {
				field1277 = 0;
				int var16 = (int) (Math.random() * 8.0D);
				if ((var16 & 0x1) == 1) {
					field1095 += field1096;
				}

				if ((var16 & 0x2) == 2) {
					field1009 += field1010;
				}
			}

			if (field1095 < -60) {
				field1096 = 2;
			}

			if (field1095 > 60) {
				field1096 = -2;
			}

			if (field1009 < -20) {
				field1010 = 1;
			}

			if (field1009 > 10) {
				field1010 = -1;
			}

			field1083++;
			if (field1083 > 50) {
				field1016.method198(126);
			}

			try {
				if (field1193 != null && field1016.field540 > 0) {
					field1193.method33(0, field1016.field539, field1016.field540);
					field1016.field540 = 0;
					field1083 = 0;
				}
			} catch (IOException var18) {
				method410();
			} catch (Exception var19) {
				method465();
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method391() {
		field1281.method235();
		class33.field503 = field989;
		field1040.method186(0, 0);

		if (field1141 != -1) {
			method434(class60.field829[field1141], 0, 0, 0);
		} else if (field1087[field1066] != -1) {
			method434(class60.field829[field1087[field1066]], 0, 0, 0);
		}

		if (field1180 && field1227 == 1) {
			method379();
		}

		field1281.method236(231, 562, field8);
		field1283.method235();
		class33.field503 = field990;
	}

	@ObfuscatedName("client.a(IIIIIB)V")
	public final void method392(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1012.method186(arg3, arg4);
		field1013.method186(arg1 + arg3 - 16, arg4);
		class32.method149(arg4, 16, field1088, arg3 + 16, arg1 - 32);
		int var6 = (arg1 - 32) * arg1 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg2 / (arg0 - arg1);
		class32.method149(arg4, 16, field1206, arg3 + var7 + 16, var6);
		class32.method152(field995, arg3 + var7 + 16, var6, arg4);
		class32.method152(field995, arg3 + var7 + 16, var6, arg4 + 1);
		class32.method151(16, arg3 + var7 + 16, arg4, field995);
		class32.method151(16, arg3 + var7 + 17, arg4, field995);
		class32.method152(field1117, arg3 + var7 + 16, var6, arg4 + 15);
		class32.method152(field1117, arg3 + var7 + 17, var6 - 1, arg4 + 14);
		class32.method151(16, arg3 + var7 + var6 + 15, arg4, field1117);
		class32.method151(15, arg3 + var7 + var6 + 14, arg4 + 1, field1117);
	}

	@ObfuscatedName("client.k(I)V")
	public static final void method393() {
		class18.field194 = true;
		class33.field492 = true;
		field1160 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method394() {
		field1282.method235();
		int var1 = field1289 + field1095 & 0x7FF;
		int var2 = field1285.field268 / 32 + 48;
		int var3 = 464 - field1285.field269 / 32;
		field1217.method179(field1232, 151, field1009 + 256, var3, 9, var2, 21, field945, var1, 146);
		field1089.method179(field1211, 33, 256, 25, 0, 25, 0, field1233, field1289, 33);

		for (int var4 = 0; var4 < field980; var4++) {
			int var5 = field981[var4] * 4 + 2 - field1285.field268 / 32;
			int var6 = field982[var4] * 4 + 2 - field1285.field269 / 32;
			method363(var6, var5, field1240[var4]);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class41 var9 = field1241[field1334][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1285.field268 / 32;
					int var11 = var8 * 4 + 2 - field1285.field269 / 32;
					method363(var11, var10, field1207);
				}
			}
		}

		for (int var12 = 0; var12 < field1030; var12++) {
			class25 var13 = field1029[field1031[var12]];
			if (var13 != null && var13.method111() && var13.field320.field757) {
				int var14 = var13.field268 / 32 - field1285.field268 / 32;
				int var15 = var13.field269 / 32 - field1285.field269 / 32;
				method363(var15, var14, field1208);
			}
		}

		for (int var16 = 0; var16 < field963; var16++) {
			class26 var17 = field962[field964[var16]];
			if (var17 != null && var17.method111()) {
				int var18 = var17.field268 / 32 - field1285.field268 / 32;
				int var19 = var17.field269 / 32 - field1285.field269 / 32;
				boolean var20 = false;
				long var21 = class48.method251(var17.field321);
				for (int var23 = 0; var23 < field1192; var23++) {
					if (field1328[var23] == var21 && field1186[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method363(var19, var18, field1210);
				} else {
					method363(var19, var18, field1209);
				}
			}
		}

		if (field1215 != 0) {
			int var24 = field1215 * 4 + 2 - field1285.field268 / 32;
			int var25 = field1216 * 4 + 2 - field1285.field269 / 32;
			method363(var25, var24, field1322);
		}

		class32.method149(93, 3, 0xFFFFFF, 82, 3);
		field1283.method235();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method395(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1153 = "";
				field1154 = "Connecting to server...";
				method416();
			}

			field1193 = new class4(method389(field1158 + 43594), this);
			field1193.method32(field1000.field539, 0, 8);
			field1000.field540 = 0;
			field1220 = field1000.method215();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1220 >> 32), (int) field1220 };
			field1016.field540 = 0;
			field1016.method199(10);
			field1016.method203(var4[0]);
			field1016.method203(var4[1]);
			field1016.method203(var4[2]);
			field1016.method203(var4[3]);
			field1016.method203(signlink.uid);
			field1016.method206(arg0);
			field1016.method206(arg1);
			field1016.method224(field1247, field1185);
			field1162.field540 = 0;

			if (arg2) {
				field1162.method199(18);
			} else {
				field1162.method199(16);
			}

			field1162.method199(field1016.field540 + 36 + 1 + 1);
			field1162.method199(217);
			field1162.method199(field1160 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1162.method203(field1336[var5]);
			}

			field1162.method207(field1016.field539, field1016.field540, 0);
			field1016.field544 = new class46(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field953 = new class46(var4);
			field1193.method33(0, field1162.field539, field1162.field540);
			int var7 = field1193.method30();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method395(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field1321 = true;
				} else {
					field1321 = false;
				}

				class5.method35(false);
				field1279 = true;
				field1016.field540 = 0;
				field1000.field540 = 0;
				field1081 = -1;
				field1271 = -1;
				field1272 = -1;
				field1273 = -1;
				field1080 = 0;
				field1082 = 0;
				field1028 = 0;
				field1084 = 0;
				field1067 = 0;
				field971 = 0;
				field1180 = false;
				field13 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field958[var8] = null;
				}

				field1061 = 0;
				field1294 = 0;
				field1043 = 0;
				field1022 = 0;
				field997 = (int) (Math.random() * 100.0D) - 50;
				field1224 = (int) (Math.random() * 110.0D) - 55;
				field1090 = (int) (Math.random() * 80.0D) - 40;
				field1095 = (int) (Math.random() * 120.0D) - 60;
				field1009 = (int) (Math.random() * 30.0D) - 20;
				field1289 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1151 = -1;
				field1215 = 0;
				field1216 = 0;
				field963 = 0;
				field1030 = 0;

				for (int var9 = 0; var9 < field960; var9++) {
					field962[var9] = null;
					field967[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1029[var10] = null;
				}

				field1285 = field962[field961] = new class26();
				field1219.method232();
				field942.method232();
				field992.method232();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1241[var11][var12][var13] = null;
						}
					}
				}

				field944 = new class41();
				field1192 = 0;
				field1023 = -1;
				field1248 = -1;
				field1098 = -1;
				field1141 = -1;
				field1166 = false;
				field1066 = 3;
				field1033 = false;
				field1180 = false;
				field1194 = false;
				field1103 = null;
				field1197 = 0;
				field950 = -1;
				field1038 = true;
				method463();

				for (int var14 = 0; var14 < 5; var14++) {
					field968[var14] = 0;
				}

				field1335 = 0;
				field1213 = 0;
				field1085 = 0;
				field1021 = 0;
				field1258 = 0;
				field1184 = 0;
				field1077 = 0;
				field949 = 0;
				field991 = 0;
				method435();
				return;
			}

			if (var7 == 3) {
				field1153 = "";
				field1154 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field1153 = "Your account has been disabled.";
				field1154 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field1153 = "Your account is already logged in.";
				field1154 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field1153 = "RuneScape has been updated!";
				field1154 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field1153 = "This world is full.";
				field1154 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field1153 = "Unable to connect.";
				field1154 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field1153 = "Login limit exceeded.";
				field1154 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field1153 = "Unable to connect.";
				field1154 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field1154 = "Login server rejected session.";
				field1154 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field1153 = "You need a members account to login to this world.";
				field1154 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field1153 = "Could not complete login.";
				field1154 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field1153 = "The server is being updated.";
				field1154 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field1279 = true;
				field1016.field540 = 0;
				field1000.field540 = 0;
				field1081 = -1;
				field1271 = -1;
				field1272 = -1;
				field1273 = -1;
				field1080 = 0;
				field1082 = 0;
				field1028 = 0;
				field971 = 0;
				field1180 = false;
				return;
			}

			if (var7 == 16) {
				field1153 = "Login attempts exceeded.";
				field1154 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field1153 = "You are standing in a members-only area.";
				field1154 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field1153 = "";
			field1154 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method396() {
		method471();

		if (field1122 == 1) {
			field973[field1121 / 100].method173(field1120 - 8 - 11, field1119 - 8 - 8);
		}

		if (field1122 == 2) {
			field973[field1121 / 100 + 4].method173(field1120 - 8 - 11, field1119 - 8 - 8);
			field1236++;
			if (field1236 > 161) {
				field1236 = 0;
				field1016.method198(128);
				field1016.method200(9331);
			}
		}

		if (field1098 != -1) {
			method464(field1098, field1239);
			method434(class60.field829[field1098], 0, 0, 0);
		}

		method409();

		if (!field1180) {
			method369();
			method482();
		} else if (field1227 == 0) {
			method379();
		}

		if (field1197 == 1) {
			if (field1127 > 0 || field1118 == 1) {
				field1015[1].method173(258, 472);
			} else {
				field1015[1].method173(296, 472);
			}
		}

		if (field1127 > 0) {
			field1015[0].method173(296, 472);
			field1255.method188(329, "Level: " + field1127, 484, 0xFFFF00);
		}

		if (field1118 == 1) {
			field1015[6].method173(296, 472);
			field1255.method188(329, "Arena", 484, 0xFFFF00);
		}

		if (field1028 != 0) {
			int var1 = field1028 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1255.method191(329, "System update in: " + var2 + ":0" + var1, 4, 0xFFFF00);
			} else {
				field1255.method191(329, "System update in: " + var2 + ":" + var1, 4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method397() {
		for (class27 var1 = (class27) field1219.method228(); var1 != null; var1 = (class27) field1219.method230()) {
			if (field1334 != var1.field343 || field1320 > var1.field349) {
				var1.method107();
			} else if (field1320 >= var1.field348) {
				if (var1.field352 > 0) {
					class25 var2 = field1029[var1.field352 - 1];
					if (var2 != null) {
						var1.method116(method420(var2.field268, var2.field269, var1.field343) - var1.field347, var2.field268, var2.field269, field1320);
					}
				}

				if (var1.field352 < 0) {
					int var3 = -var1.field352 - 1;
					class26 var4;
					if (field1027 == var3) {
						var4 = field1285;
					} else {
						var4 = field962[var3];
					}

					if (var4 != null) {
						var1.method116(method420(var4.field268, var4.field269, var1.field343) - var1.field347, var4.field268, var4.field269, field1320);
					}
				}

				var1.method117(field1239);
				field1014.method61(null, (int) var1.field356, -1, (int) var1.field355, var1.field362, 60, false, (int) var1.field354, var1, field1334);
			}
		}
	}

	@ObfuscatedName("client.b(ZLkb;I)V")
	public final void method398(class37 arg0, int arg1) {
		int var3 = arg0.method220(8);
		if (var3 < field963) {
			for (int var4 = var3; var4 < field963; var4++) {
				field1312[field1311++] = field964[var4];
			}
		}

		if (var3 > field963) {
			signlink.reporterror(field1198 + " Too many players");
			throw new RuntimeException("eek");
		}

		field963 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field964[var5];
			class26 var7 = field962[var6];
			int var8 = arg0.method220(1);
			if (var8 == 0) {
				field964[field963++] = var6;
				var7.field312 = field1320;
			} else {
				int var9 = arg0.method220(2);
				if (var9 == 0) {
					field964[field963++] = var6;
					var7.field312 = field1320;
					field966[field965++] = var6;
				} else if (var9 == 1) {
					field964[field963++] = var6;
					var7.field312 = field1320;
					int var10 = arg0.method220(3);
					var7.method110(false, var10);
					int var11 = arg0.method220(1);
					if (var11 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 2) {
					field964[field963++] = var6;
					var7.field312 = field1320;
					int var12 = arg0.method220(3);
					var7.method110(true, var12);
					int var13 = arg0.method220(3);
					var7.method110(true, var13);
					int var14 = arg0.method220(1);
					if (var14 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 3) {
					field1312[field1311++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILhc;)V")
	public final void method399(class60 arg0) {
		int var2 = arg0.field838;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1192) {
				arg0.field868 = "";
				arg0.field837 = 0;
			} else {
				arg0.field868 = field1092[var2];
				arg0.field837 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1192) {
				arg0.field868 = "";
				arg0.field837 = 0;
			} else {
				if (field1186[var2] == 0) {
					arg0.field868 = "@red@Offline";
				} else if (field1186[var2] == field1157) {
					arg0.field868 = "@gre@World-" + (field1186[var2] - 9);
				} else {
					arg0.field868 = "@yel@World-" + (field1186[var2] - 9);
				}

				arg0.field837 = 1;
			}
		} else if (var2 == 203) {
			arg0.field847 = field1192 * 15 + 20;
			if (arg0.field847 <= arg0.field840) {
				arg0.field847 = arg0.field840 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1070) {
				arg0.field868 = "";
				arg0.field837 = 0;
			} else {
				arg0.field868 = class48.method255(class48.method252(field1264[var2]));
				arg0.field837 = 1;
			}
		} else if (var2 == 503) {
			arg0.field847 = field1070 * 15 + 20;
			if (arg0.field847 <= arg0.field840) {
				arg0.field847 = arg0.field840 + 1;
			}
		} else if (var2 == 327) {
			arg0.field880 = 150;
			arg0.field881 = (int) (Math.sin(field1320 / 40.0D) * 256.0D) & 0x7FF;

			if (field1253) {
				field1253 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1176[var5];
					if (var6 >= 0) {
						var3[var4++] = class59.field822[var6].method312();
					}
				}

				class31 var7 = new class31(var3, var4);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field968[var8] != 0) {
						var7.method133(field1037[var8][0], field1037[var8][field968[var8]]);

						if (var8 == 1) {
							var7.method133(field1104[0], field1104[field968[var8]]);
						}
					}
				}

				var7.method126();
				var7.method127(class62.field895[field1285.field273].field897[0]);
				var7.method136(64, 850, -30, -50, -30, true);
				arg0.field875 = var7;
			}
		} else if (var2 == 324) {
			if (field1073 == null) {
				field1073 = arg0.field873;
				field1074 = arg0.field874;
			}

			if (field1038) {
				arg0.field873 = field1074;
			} else {
				arg0.field873 = field1073;
			}
		} else if (var2 == 325) {
			if (field1073 == null) {
				field1073 = arg0.field873;
				field1074 = arg0.field874;
			}

			if (field1038) {
				arg0.field873 = field1073;
			} else {
				arg0.field873 = field1074;
			}
		} else if (var2 == 600) {
			arg0.field868 = field1235;
			if (field1320 % 20 < 10) {
				arg0.field868 = arg0.field868 + "|";
			} else {
				arg0.field868 = arg0.field868 + " ";
			}
		} else if (var2 == 613) {
			if (!field1321) {
				arg0.field868 = "";
			} else if (field959) {
				arg0.field870 = 0xFF0000;
				arg0.field868 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field870 = 0xFFFFFF;
				arg0.field868 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field941 == 0) {
				arg0.field868 = "";
			} else {
				String var9;
				if (field1300 == 0) {
					var9 = "earlier today";
				} else if (field1300 == 1) {
					var9 = "yesterday";
				} else {
					var9 = field1300 + " days ago";
				}

				arg0.field868 = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1024 == 0) {
				arg0.field868 = "0 unread messages";
				arg0.field870 = 0xFFFF00;
			}

			if (field1024 == 1) {
				arg0.field868 = "1 unread message";
				arg0.field870 = 0xFF00;
			}

			if (field1024 > 1) {
				arg0.field868 = field1024 + " unread messages";
				arg0.field870 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field979 == 201) {
				arg0.field868 = "";
			} else if (field979 == 200) {
				arg0.field868 = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (field979 == 0) {
					var10 = "Earlier today";
				} else if (field979 == 1) {
					var10 = "Yesterday";
				} else {
					var10 = field979 + " days ago";
				}

				arg0.field868 = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field979 == 201) {
				arg0.field868 = "";
			} else if (field979 == 200) {
				arg0.field868 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field868 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field979 == 201) {
				arg0.field868 = "";
			} else if (field979 == 200) {
				arg0.field868 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field868 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IIIILhc;IIIZ)V")
	public final void method400(int arg0, int arg1, int arg2, class60 arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (field1299) {
			field1182 = 32;
		} else {
			field1182 = 0;
		}

		field1299 = false;
		if (arg2 >= arg6 && arg2 < arg6 + 16 && arg4 >= arg0 && arg4 < arg0 + 16) {
			arg3.field848 -= field1190 * 4;

			if (arg7) {
				field1018 = true;
				return;
			}
		} else if (arg2 >= arg6 && arg2 < arg6 + 16 && arg4 >= arg0 + arg5 - 16 && arg4 < arg0 + arg5) {
			arg3.field848 += field1190 * 4;

			if (arg7) {
				field1018 = true;
				return;
			}
		} else if (arg2 >= arg6 - field1182 && arg2 < arg6 + field1182 + 16 && arg4 >= arg0 + 16 && arg4 < arg0 + arg5 - 16 && field1190 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg0 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg3.field848 = (arg1 - arg5) * var10 / var11;

			if (arg7) {
				field1018 = true;
			}

			field1299 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method401() {
		for (int var1 = 0; var1 < field1030; var1++) {
			class25 var2 = field1029[field1031[var1]];
			int var3 = (field1031[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method111()) {
				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field272 == 1 && (var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
						if (field1034[var4][var5] == field1039) {
							continue;
						}

						field1034[var4][var5] = field1039;
					}

					field1014.method61(null, method420(var2.field268, var2.field269, field1334), var3, var2.field269, var2.field270, (var2.field272 - 1) * 64 + 60, var2.field271, var2.field268, var2, field1334);
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)I")
	public final int method402() {
		int var1 = 3;
		if (field1148 < 310) {
			int var2 = field1145 >> 7;
			int var3 = field1147 >> 7;
			int var4 = field1285.field268 >> 7;
			int var5 = field1285.field269 >> 7;

			if ((field1126[field1334][var2][var3] & 0x4) != 0) {
				var1 = field1334;
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

					if ((field1126[field1334][var2][var3] & 0x4) != 0) {
						var1 = field1334;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1126[field1334][var2][var3] & 0x4) != 0) {
							var1 = field1334;
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

					if ((field1126[field1334][var2][var3] & 0x4) != 0) {
						var1 = field1334;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1126[field1334][var2][var3] & 0x4) != 0) {
							var1 = field1334;
						}
					}
				}
			}
		}

		if ((field1126[field1334][field1285.field268 >> 7][field1285.field269 >> 7] & 0x4) != 0) {
			var1 = field1334;
		}

		return var1;
	}

	@ObfuscatedName("client.g(Z)I")
	public final int method403() {
		int var1 = method420(field1145, field1147, field1334);
		if (var1 - field1146 < 800 && (field1126[field1334][field1145 >> 7][field1147 >> 7] & 0x4) != 0) {
			return field1334;
		}

		return 3;
	}

	@ObfuscatedName("client.b(Lhc;I)Z")
	public final boolean method404(class60 arg0) {
		if (arg0.field844 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field844.length; var2++) {
			int var3 = method436(var2, arg0);
			int var4 = arg0.field845[var2];
			if (arg0.field844[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field844[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field844[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method405(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.j(B)Z")
	public final boolean method406() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method407(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method408() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1133[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1133[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1134[var10] = (field1133[var10 - 1] + field1133[var10 + 1] + field1133[var10 - 128] + field1133[var10 + 128]) / 4;
			}
		}

		field1286 += 128;
		if (field1286 > field1025.length) {
			field1286 -= field1025.length;
			int var11 = (int) (Math.random() * 12.0D);
			method442(field1265[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1134[var14 + 128] - field1025[field1286 + var14 & field1025.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1133[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1072[var16] = field1072[var16 + 1];
		}

		field1072[var1 - 1] = (int) (Math.sin(field1320 / 14.0D) * 16.0D + Math.sin(field1320 / 15.0D) * 14.0D + Math.sin(field1320 / 16.0D) * 12.0D);

		if (field1326 > 0) {
			field1326 -= 4;
		}

		if (field1327 > 0) {
			field1327 -= 4;
		}

		if (field1326 == 0 && field1327 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1326 = 1024;
			}

			if (var17 == 1) {
				field1327 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method409() {
		int var1 = (field1285.field268 >> 7) + field1242;
		int var2 = (field1285.field269 >> 7) + field1243;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1127 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1127 = (var2 - 9920) / 8 + 1;
		} else {
			field1127 = 0;
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

		field1325 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1325 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1325 = 1;
		}

		if (field1325 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1325 = 0;
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method410() {
		if (field1084 > 0) {
			method465();
		} else {
			field1283.method235();
			field1255.method188(144, "Connection lost", 257, 0);
			field1255.method188(143, "Connection lost", 256, 0xFFFFFF);
			field1255.method188(159, "Please wait - attempting to reestablish", 257, 0);
			field1255.method188(158, "Please wait - attempting to reestablish", 256, 0xFFFFFF);
			field1283.method236(11, 8, field8);
			field1215 = 0;
			class4 var1 = field1193;
			field1279 = false;
			method395(field1198, field1199, true);

			if (!field1279) {
				method465();
			}

			try {
				var1.method29();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method411() {
		if (field977 == 0) {
			int var1 = field6 / 2 - 80;
			int var2 = field7 / 2 + 20;
			var2 += 20;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field977 = 3;
				field955 = 0;
			}

			int var3 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var3 - 75 && field18 <= var3 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1153 = "";
				field1154 = "Enter your username & password.";
				field977 = 2;
				field955 = 0;
			}
		} else if (field977 == 2) {
			int var4 = field7 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field955 = 0;
			}

			var4 += 15;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field955 = 1;
			}

			var4 += 15;
			int var5 = field6 / 2 - 80;
			int var6 = field7 / 2 + 50;
			var6 += 20;
			if (field17 == 1 && field18 >= var5 - 75 && field18 <= var5 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				method395(field1198, field1199, false);
			}

			int var7 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var7 - 75 && field18 <= var7 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				field977 = 0;
				field1198 = "";
				field1199 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1323.length(); var10++) {
					if (var8 == field1323.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field955 == 0) {
					if (var8 == 8 && field1198.length() > 0) {
						field1198 = field1198.substring(0, field1198.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field955 = 1;
					}

					if (var9) {
						field1198 = field1198 + (char) var8;
					}

					if (field1198.length() > 12) {
						field1198 = field1198.substring(0, 12);
					}
				} else if (field955 == 1) {
					if (var8 == 8 && field1199.length() > 0) {
						field1199 = field1199.substring(0, field1199.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field955 = 0;
					}

					if (var9) {
						field1199 = field1199 + (char) var8;
					}

					if (field1199.length() > 20) {
						field1199 = field1199.substring(0, 20);
					}
				}
			}
		} else if (field977 == 3) {
			int var11 = field6 / 2;
			int var12 = field7 / 2 + 50;
			var12 += 20;
			if (field17 == 1 && field18 >= var11 - 75 && field18 <= var11 + 75 && field19 >= var12 - 20 && field19 <= var12 + 20) {
				field977 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method412(long arg0) {
		if (arg0 != 0L) {
			if (field1192 >= 100) {
				method382(0, "", "Your friends list is full. Max of 100 hit");
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field1192; var4++) {
					if (field1328[var4] == arg0) {
						method382(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1070; var5++) {
					if (field1264[var5] == arg0) {
						method382(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1285.field321)) {
					field1092[field1192] = var3;
					field1328[field1192] = arg0;
					field1186[field1192] = 0;
					field1192++;
					field1018 = true;
					field1016.method198(66);
					field1016.method205(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Lkb;II)V")
	public final void method413(class37 arg0, int arg1) {
		arg0.method219();
		int var3 = arg0.method220(8);
		if (var3 < field1030) {
			for (int var4 = var3; var4 < field1030; var4++) {
				field1312[field1311++] = field1031[var4];
			}
		}

		if (var3 > field1030) {
			signlink.reporterror(field1198 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1030 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1031[var5];
			class25 var7 = field1029[var6];
			int var8 = arg0.method220(1);
			if (var8 == 0) {
				field1031[field1030++] = var6;
				var7.field312 = field1320;
			} else {
				int var9 = arg0.method220(2);
				if (var9 == 0) {
					field1031[field1030++] = var6;
					var7.field312 = field1320;
					field966[field965++] = var6;
				} else if (var9 == 1) {
					field1031[field1030++] = var6;
					var7.field312 = field1320;
					int var10 = arg0.method220(3);
					var7.method110(false, var10);
					int var11 = arg0.method220(1);
					if (var11 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 2) {
					field1031[field1030++] = var6;
					var7.field312 = field1320;
					int var12 = arg0.method220(3);
					var7.method110(true, var12);
					int var13 = arg0.method220(3);
					var7.method110(true, var13);
					int var14 = arg0.method220(1);
					if (var14 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 3) {
					field1312[field1311++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method414() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1289 + field1095 & 0x7FF;
				int var4 = class33.field501[var3];
				int var5 = class33.field502[var3];
				var4 = (field1009 + 256) * var4 >> 8;
				var5 = (field1009 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1285.field268 + var6 >> 7;
				int var9 = field1285.field269 - var7 >> 7;
				boolean var10 = method486(0, true, 1, field1285.field316[0], var9, field1285.field317[0], 0, 0, var8, 0, 0);
				if (var10) {
					field1016.method199(var1);
					field1016.method199(var2);
					field1016.method200(field1289);
					field1016.method199(57);
					field1016.method199(field1095);
					field1016.method199(field1009);
					field1016.method199(89);
					field1016.method200(field1285.field268);
					field1016.method200(field1285.field269);
					field1016.method199(field943);
					field1016.method199(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;IZ)V")
	public final void method415(class37 arg0, int arg1) {
		field1311 = 0;
		field965 = 0;
		method413(arg0, arg1);
		method373(arg0, arg1);
		method438(arg0, arg1);

		for (int var3 = 0; var3 < field1311; var3++) {
			int var4 = field1312[var3];
			if (field1320 != field1029[var4].field312) {
				field1029[var4].field320 = null;
				field1029[var4] = null;
			}
		}

		if (arg0.field540 != arg1) {
			signlink.reporterror(field1198 + " size mismatch in getnpcpos - pos:" + arg0.field540 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1030; var5++) {
			if (field1029[field1031[var5]] == null) {
				signlink.reporterror(field1198 + " null entry in npc list - pos:" + var5 + " size:" + field1030);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (!field1160) {
			field1142 = true;
			field1237 = true;
			method12(this, 2);
			method459(12345678, "scape_main", 40000);
		}

		if (field1097) {
			field1135 = true;
		} else {
			field1097 = true;
			boolean var1 = false;
			String var2 = method445();
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
					field1336[8] = 0;
					while (field1336[8] == 0) {
						method13("Connecting to fileserver", 10);

						try {
							DataInputStream var4 = method469("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[36]);
							var4.readFully(var5.field539, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								field1336[var6] = var5.method214();
							}

							var4.close();
						} catch (IOException var54) {
							for (int var7 = var3; var7 > 0; var7--) {
								method13("Error loading - Will retry in " + var7 + " secs.", 10);

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

					field1156 = method451(10, "title screen", field1336[1], "title");
					field1254 = new class36("p11", field1156);
					field1255 = new class36("p12", field1156);
					field1256 = new class36("b12", field1156);
					field1257 = new class36("q8", field1156);
					method480();
					method428();
					class47 var8 = method451(15, "config", field1336[2], "config");
					class47 var9 = method451(20, "interface", field1336[3], "interface");
					class47 var10 = method451(30, "2d graphics", field1336[4], "media");
					class47 var11 = method451(40, "3d graphics", field1336[5], "models");
					class47 var12 = method451(60, "textures", field1336[6], "textures");
					class47 var13 = method451(65, "chat system", field1336[7], "wordenc");
					class47 var14 = method451(70, "sound effects", field1336[8], "sounds");
					field1126 = new byte[4][104][104];
					field987 = new int[4][105][105];
					field1014 = new class18(104, 4, 104, field987);

					for (int var15 = 0; var15 < 4; var15++) {
						field1293[var15] = new class57(104, 104);
					}

					field1217 = new class34(512, 512);
					method13("Unpacking media", 75);
					field1040 = new class35(var10, "invback", 0);
					field1042 = new class35(var10, "chatback", 0);
					field1041 = new class35(var10, "mapback", 0);
					field1001 = new class35(var10, "backbase1", 0);
					field1002 = new class35(var10, "backbase2", 0);
					field1003 = new class35(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						field1086[var16] = new class35(var10, "sideicons", var16);
					}

					field1089 = new class34(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							field1181[var17] = new class35(var10, "mapscene", var17);
						}
					} catch (Exception var53) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							field1143[var18] = new class34(var10, "mapfunction", var18);
						}
					} catch (Exception var52) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							field951[var19] = new class34(var10, "hitmarks", var19);
						}
					} catch (Exception var51) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							field1015[var20] = new class34(var10, "headicons", var20);
						}
					} catch (Exception var50) {
					}

					field1322 = new class34(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						field973[var21] = new class34(var10, "cross", var21);
					}

					field1207 = new class34(var10, "mapdots", 0);
					field1208 = new class34(var10, "mapdots", 1);
					field1209 = new class34(var10, "mapdots", 2);
					field1210 = new class34(var10, "mapdots", 3);
					field1012 = new class35(var10, "scrollbar", 0);
					field1013 = new class35(var10, "scrollbar", 1);
					field1266 = new class35(var10, "redstone1", 0);
					field1267 = new class35(var10, "redstone2", 0);
					field1268 = new class35(var10, "redstone3", 0);
					field1269 = new class35(var10, "redstone1", 0);
					field1269.method184();
					field1270 = new class35(var10, "redstone2", 0);
					field1270.method184();
					field1004 = new class35(var10, "redstone1", 0);
					field1004.method185();
					field1005 = new class35(var10, "redstone2", 0);
					field1005.method185();
					field1006 = new class35(var10, "redstone3", 0);
					field1006.method185();
					field1007 = new class35(var10, "redstone1", 0);
					field1007.method184();
					field1007.method185();
					field1008 = new class35(var10, "redstone2", 0);
					field1008.method184();
					field1008.method185();
					class34 var22 = new class34(var10, "backleft1", 0);
					field1107 = new class43(var22.field516, method11(), var22.field517);
					var22.method171(0, 0);
					class34 var23 = new class34(var10, "backleft2", 0);
					field1108 = new class43(var23.field516, method11(), var23.field517);
					var23.method171(0, 0);
					class34 var24 = new class34(var10, "backright1", 0);
					field1109 = new class43(var24.field516, method11(), var24.field517);
					var24.method171(0, 0);
					class34 var25 = new class34(var10, "backright2", 0);
					field1110 = new class43(var25.field516, method11(), var25.field517);
					var25.method171(0, 0);
					class34 var26 = new class34(var10, "backtop1", 0);
					field1111 = new class43(var26.field516, method11(), var26.field517);
					var26.method171(0, 0);
					class34 var27 = new class34(var10, "backtop2", 0);
					field1112 = new class43(var27.field516, method11(), var27.field517);
					var27.method171(0, 0);
					class34 var28 = new class34(var10, "backvmid1", 0);
					field1113 = new class43(var28.field516, method11(), var28.field517);
					var28.method171(0, 0);
					class34 var29 = new class34(var10, "backvmid2", 0);
					field1114 = new class43(var29.field516, method11(), var29.field517);
					var29.method171(0, 0);
					class34 var30 = new class34(var10, "backvmid3", 0);
					field1115 = new class43(var30.field516, method11(), var30.field517);
					var30.method171(0, 0);
					class34 var31 = new class34(var10, "backhmid2", 0);
					field1116 = new class43(var31.field516, method11(), var31.field517);
					var31.method171(0, 0);
					method13("Unpacking textures", 80);
					class33.method158(var12);
					class33.method162(0.8D);
					class33.method157(20);
					method13("Unpacking models", 83);
					class31.method121(var11);
					class6.method47(var11);
					class7.method48(var11);
					method13("Unpacking config", 86);
					class62.method318(var8);
					class53.method273(var8);
					class58.method307(var8);
					class55.method285(var8);
					class54.method279(var8);
					class59.method310(var8);
					class63.method320(var8);
					class64.method323(var8);
					class55.field767 = field1159;

					if (!field1160) {
						method13("Unpacking sounds", 90);
						byte[] var32 = var14.method250("sounds.dat", null);
						class37 var33 = new class37(var32);
						class51.method263(var33);
					}

					method13("Unpacking interfaces", 92);
					class36[] var34 = new class36[] { field1254, field1255, field1256, field1257 };
					class60.method314(var10, var34, var9);
					method13("Preparing game engine", 97);

					for (int var35 = 0; var35 < 33; var35++) {
						int var36 = 999;
						int var37 = 0;
						for (int var38 = 0; var38 < 35; var38++) {
							if (field1041.field522[field1041.field524 * var35 + var38] == 0) {
								if (var36 == 999) {
									var36 = var38;
								}
							} else if (var36 != 999) {
								var37 = var38;
								break;
							}
						}

						field1233[var35] = var36;
						field1211[var35] = var37 - var36;
					}

					for (int var39 = 9; var39 < 160; var39++) {
						int var40 = 999;
						int var41 = 0;
						for (int var42 = 10; var42 < 168; var42++) {
							if (field1041.field522[field1041.field524 * var39 + var42] == 0 && (var42 > 34 || var39 > 34)) {
								if (var40 == 999) {
									var40 = var42;
								}
							} else if (var40 != 999) {
								var41 = var42;
								break;
							}
						}

						field945[var39 - 9] = var40 - 21;
						field1232[var39 - 9] = var41 - var40;
					}

					class33.method155(96, 479);
					field988 = class33.field503;
					class33.method155(261, 190);
					field989 = class33.field503;
					class33.method155(334, 512);
					field990 = class33.field503;
					int[] var43 = new int[9];
					for (int var44 = 0; var44 < 9; var44++) {
						int var45 = var44 * 32 + 128 + 15;
						int var46 = var45 * 3 + 600;
						int var47 = class33.field501[var45];
						var43[var44] = var46 * var47 >> 16;
					}

					class18.method87(var43, 800, 334, 500, 512);
					class65.method325(var13);
				} catch (Exception var55) {
					field1069 = true;
				}
			} else {
				field1292 = true;
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method416() {
		method448();
		field1303.method235();
		field974.method186(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field977 == 0) {
			int var3 = var2 / 2 - 20;
			field1256.method189("Welcome to RuneScape", var3, 0xFFFF00, true, var1 / 2);
			var3 += 30;
			int var4 = var1 / 2 - 80;
			int var5 = var2 / 2 + 20;
			field975.method186(var5 - 20, var4 - 73);
			field1256.method189("New user", var5 + 5, 0xFFFFFF, true, var4);
			int var6 = var1 / 2 + 80;
			field975.method186(var5 - 20, var6 - 73);
			field1256.method189("Existing User", var5 + 5, 0xFFFFFF, true, var6);
		}

		if (field977 == 2) {
			int var7 = var2 / 2 - 40;
			if (field1153.length() > 0) {
				field1256.method189(field1153, var7 - 15, 0xFFFF00, true, var1 / 2);
				field1256.method189(field1154, var7, 0xFFFF00, true, var1 / 2);
				var7 += 30;
			} else {
				field1256.method189(field1154, var7 - 7, 0xFFFF00, true, var1 / 2);
				var7 += 30;
			}

			field1256.method193("Username: " + field1198 + (field955 == 0 & field1320 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var1 / 2 - 90, true, var7);
			var7 += 15;
			field1256.method193("Password: " + class48.method257(field1199) + (field955 == 1 & field1320 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var1 / 2 - 88, true, var7);
			var7 += 15;
			int var8 = var1 / 2 - 80;
			int var9 = var2 / 2 + 50;
			field975.method186(var9 - 20, var8 - 73);
			field1256.method189("Login", var9 + 5, 0xFFFFFF, true, var8);
			int var10 = var1 / 2 + 80;
			field975.method186(var9 - 20, var10 - 73);
			field1256.method189("Cancel", var9 + 5, 0xFFFFFF, true, var10);
		}

		if (field977 == 3) {
			field1256.method189("Create a free account", var2 / 2 - 60, 0xFFFF00, true, var1 / 2);
			int var11 = var2 / 2 - 35;
			field1256.method189("To create a new account you need to", var11, 0xFFFFFF, true, var1 / 2);
			var11 += 15;
			field1256.method189("go back to the main RuneScape webpage", var11, 0xFFFFFF, true, var1 / 2);
			var11 += 15;
			field1256.method189("and choose the red 'create account'", var11, 0xFFFFFF, true, var1 / 2);
			var11 += 15;
			field1256.method189("button at the top right of that page.", var11, 0xFFFFFF, true, var1 / 2);
			var11 += 15;
			int var12 = var1 / 2;
			int var13 = var2 / 2 + 50;
			field975.method186(var13 - 20, var12 - 73);
			field1256.method189("Cancel", var13 + 5, 0xFFFFFF, true, var12);
		}

		field1303.method236(186, 214, field8);

		if (field1278) {
			field1278 = false;
			field1301.method236(0, 128, field8);
			field1302.method236(386, 214, field8);
			field1306.method236(265, 0, field8);
			field1307.method236(265, 574, field8);
			field1308.method236(186, 128, field8);
			field1309.method236(186, 574, field8);
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method417(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1192; var3++) {
				if (field1328[var3] == arg0) {
					field1192--;
					field1018 = true;

					for (int var4 = var3; var4 < field1192; var4++) {
						field1092[var4] = field1092[var4 + 1];
						field1186[var4] = field1186[var4 + 1];
						field1328[var4] = field1328[var4 + 1];
					}

					field1016.method198(210);
					field1016.method205(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(III)Ljava/lang/String;")
	public static final String method418(int arg0, int arg1) {
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

	@ObfuscatedName("client.k(Z)V")
	public final void method419() {
		field1284.method235();
		class33.field503 = field988;
		field1042.method186(0, 0);

		if (field1194) {
			field1256.method188(40, field1163, 239, 0);
			field1256.method188(60, field1165 + "*", 239, 128);
		} else if (field1033) {
			field1256.method188(40, "Enter amount to transfer:", 239, 0);
			field1256.method188(60, field1078 + "*", 239, 128);
		} else if (field1103 != null) {
			field1256.method188(40, field1103, 239, 0);
			field1256.method188(60, "Click to continue", 239, 128);
		} else if (field1248 != -1) {
			method434(class60.field829[field1248], 0, 0, 0);
		} else if (field1023 == -1) {
			class36 var1 = field1255;
			int var2 = 0;
			class32.method147(0, 0, 463, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field958[var3] != null) {
					int var4 = field956[var3];
					int var5 = field1125 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, field958[var3], 4, 0);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, field957[var3] + ":", 4, 0xFFFFFF);
							var1.method191(var5, field958[var3], var1.method190(field957[var3]) + 12, 255);
						}

						var2++;
					}

					if (var4 == 2 && (field993 == 0 || field993 == 1 && method444(field957[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, field957[var3] + ":", 4, 0);
							var1.method191(var5, field958[var3], var1.method190(field957[var3]) + 12, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1196 == 0 && (var4 == 7 || field1068 == 0 || field1068 == 1 && method444(field957[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, "From " + field957[var3] + ":", 4, 0);
							var1.method191(var5, field958[var3], var1.method190("From " + field957[var3]) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1155 == 0 || field1155 == 1 && method444(field957[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, field957[var3] + " " + field958[var3], 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1196 == 0 && field1068 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, field958[var3], 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1196 == 0 && field1068 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, "To " + field957[var3] + ":", 4, 0);
							var1.method191(var5, field958[var3], var1.method190("To " + field957[var3]) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1155 == 0 || field1155 == 1 && method444(field957[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(var5, field957[var3] + " " + field958[var3], 4, 0xCBB789);
						}

						var2++;
					}
				}
			}

			class32.method146();
			field1250 = var2 * 14 + 7;
			if (field1250 < 78) {
				field1250 = 78;
			}

			method392(field1250, 77, field1250 - field1125 - 77, 0, 463);
			var1.method191(90, class48.method255(field1198) + ":", 4, 0);
			var1.method191(90, field1011 + "*", var1.method190(field1198 + ": ") + 6, 255);
			class32.method151(479, 77, 0, 0);
		} else {
			method434(class60.field829[field1023], 0, 0, 0);
		}

		if (field1180 && field1227 == 2) {
			method379();
		}

		field1284.method236(375, 22, field8);
		field1283.method235();
		class33.field503 = field990;
	}

	@ObfuscatedName("client.a(IBII)I")
	public final int method420(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		int var6 = arg2;
		if (arg2 < 3 && (field1126[1][var4][var5] & 0x2) == 2) {
			var6 = arg2 + 1;
		}

		int var7 = arg0 & 0x7F;
		int var8 = arg1 & 0x7F;
		int var9 = (128 - var7) * field987[var6][var4][var5] + field987[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field987[var6][var4][var5 + 1] + field987[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.a(Lhc;IIIZII)V")
	public final void method421(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field836 == 0 && arg0.field850 != null && !arg0.field849 && (arg5 >= arg4 && arg2 >= arg1 && arg5 <= arg0.field839 + arg4 && arg2 <= arg0.field840 + arg1)) {
			int var7 = arg0.field850.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.field851[var8] + arg4;
				int var10 = arg0.field852[var8] + arg1 - arg3;
				class60 var11 = class60.field829[arg0.field850[var8]];
				var9 += var11.field841;
				var10 += var11.field842;
				if ((var11.field846 >= 0 || var11.field872 != 0) && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field839 + var9 && arg2 < var11.field840 + var10) {
					if (var11.field846 >= 0) {
						field1314 = var11.field846;
					} else {
						field1314 = var11.field834;
					}
				}

				if (var11.field836 == 0) {
					method421(var11, var10, arg2, var11.field848, var9, arg5);

					if (var11.field847 > var11.field840) {
						method400(var10, var11.field847, arg5, var11, arg2, var11.field840, var11.field839 + var9, true);
					}
				} else {
					if (var11.field837 == 1 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field839 + var9 && arg2 < var11.field840 + var10) {
						boolean var12 = false;
						if (var11.field838 != 0) {
							var12 = method455(var11);
						}

						if (!var12) {
							field1132[field971] = var11.field885;
							field1101[field971] = 706;
							field1100[field971] = var11.field834;
							field971++;
						}
					}

					if (var11.field837 == 2 && field1294 == 0 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field839 + var9 && arg2 < var11.field840 + var10) {
						String var13 = var11.field882;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1132[field971] = var13 + " @gre@" + var11.field883;
						field1101[field971] = 941;
						field1100[field971] = var11.field834;
						field971++;
					}

					if (var11.field837 == 3 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field839 + var9 && arg2 < var11.field840 + var10) {
						field1132[field971] = "Close";
						field1101[field971] = 309;
						field1100[field971] = var11.field834;
						field971++;
					}

					if (var11.field837 == 4 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field839 + var9 && arg2 < var11.field840 + var10) {
						field1132[field971] = var11.field885;
						field1101[field971] = 967;
						field1100[field971] = var11.field834;
						field971++;
					}

					if (var11.field837 == 5 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field839 + var9 && arg2 < var11.field840 + var10) {
						field1132[field971] = var11.field885;
						field1101[field971] = 672;
						field1100[field971] = var11.field834;
						field971++;
					}

					if (var11.field837 == 6 && !field1166 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field839 + var9 && arg2 < var11.field840 + var10) {
						field1132[field971] = var11.field885;
						field1101[field971] = 73;
						field1100[field971] = var11.field834;
						field971++;
					}

					if (var11.field836 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field840; var15++) {
							for (int var16 = 0; var16 < var11.field839; var16++) {
								int var17 = (var11.field858 + 32) * var16 + var9;
								int var18 = (var11.field859 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field861[var14];
									var18 += var11.field862[var14];
								}

								if (arg5 >= var17 && arg2 >= var18 && arg5 < var17 + 32 && arg2 < var18 + 32) {
									field946 = var14;
									field947 = var11.field834;

									if (var11.field830[var14] > 0) {
										class55 var19 = class55.method287(var11.field830[var14] - 1);
										if (field1061 == 1 && var11.field856) {
											if (field1063 != var11.field834 || field1062 != var14) {
												field1132[field971] = "Use " + field1065 + " with @lre@" + var19.field770;
												field1101[field971] = 237;
												field1102[field971] = var19.field768;
												field1099[field971] = var14;
												field1100[field971] = var11.field834;
												field971++;
											}
										} else if (field1294 != 1 || !var11.field856) {
											if (var11.field856) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field785 != null && var19.field785[var20] != null) {
														field1132[field971] = var19.field785[var20] + " @lre@" + var19.field770;

														if (var20 == 3) {
															field1101[field971] = 120;
														}

														if (var20 == 4) {
															field1101[field971] = 796;
														}

														field1102[field971] = var19.field768;
														field1099[field971] = var14;
														field1100[field971] = var11.field834;
														field971++;
													} else if (var20 == 4) {
														field1132[field971] = "Drop @lre@" + var19.field770;
														field1101[field971] = 796;
														field1102[field971] = var19.field768;
														field1099[field971] = var14;
														field1100[field971] = var11.field834;
														field971++;
													}
												}
											}

											if (var11.field857) {
												field1132[field971] = "Use @lre@" + var19.field770;
												field1101[field971] = 357;
												field1102[field971] = var19.field768;
												field1099[field971] = var14;
												field1100[field971] = var11.field834;
												field971++;
											}

											if (var11.field856 && var19.field785 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field785[var21] != null) {
														field1132[field971] = var19.field785[var21] + " @lre@" + var19.field770;

														if (var21 == 0) {
															field1101[field971] = 871;
														}

														if (var21 == 1) {
															field1101[field971] = 526;
														}

														if (var21 == 2) {
															field1101[field971] = 156;
														}

														field1102[field971] = var19.field768;
														field1099[field971] = var14;
														field1100[field971] = var11.field834;
														field971++;
													}
												}
											}

											if (var11.field863 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field863[var22] != null) {
														field1132[field971] = var11.field863[var22] + " @lre@" + var19.field770;

														if (var22 == 0) {
															field1101[field971] = 134;
														}

														if (var22 == 1) {
															field1101[field971] = 701;
														}

														if (var22 == 2) {
															field1101[field971] = 570;
														}

														if (var22 == 3) {
															field1101[field971] = 719;
														}

														if (var22 == 4) {
															field1101[field971] = 440;
														}

														field1102[field971] = var19.field768;
														field1099[field971] = var14;
														field1100[field971] = var11.field834;
														field971++;
													}
												}
											}

											field1132[field971] = "Examine @lre@" + var19.field770;
											field1101[field971] = 1974;
											field1102[field971] = var19.field768;
											field1100[field971] = var11.field831[var14];
											field971++;
										} else if ((field1296 & 0x10) == 0x10) {
											field1132[field971] = field1297 + " @lre@" + var19.field770;
											field1101[field971] = 63;
											field1102[field971] = var19.field768;
											field1099[field971] = var14;
											field1100[field971] = var11.field834;
											field971++;
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

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method422(int arg0) {
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

	@ObfuscatedName("client.q(I)Z")
	public final boolean method423() {
		if (field1193 == null) {
			return false;
		}

		try {
			int var1 = field1193.method31();
			if (var1 == 0) {
				return false;
			}

			if (field1081 == -1) {
				field1193.method32(field1000.field539, 0, 1);
				field1081 = field1000.field539[0] & 0xFF;
				if (field953 != null) {
					field1081 = field1081 - field953.method246() & 0xFF;
				}

				field1080 = class56.field803[field1081];
				var1--;
			}

			if (field1080 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1193.method32(field1000.field539, 0, 1);
				field1080 = field1000.field539[0] & 0xFF;
				var1--;
			}

			if (field1080 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1193.method32(field1000.field539, 0, 2);
				field1000.field540 = 0;
				field1080 = field1000.method211();
				var1 -= 2;
			}

			if (var1 < field1080) {
				return false;
			}

			field1000.field540 = 0;
			field1193.method32(field1000.field539, 0, field1080);
			field1082 = 0;
			field1273 = field1272;
			field1272 = field1271;
			field1271 = field1081;

			if (field1081 == 98) {
				field950 = field1000.method209();
				if (field950 == field1066) {
					if (field950 == 3) {
						field1066 = 1;
					} else {
						field1066 = 3;
					}

					field1018 = true;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 212) {
				int var2 = field1000.method211();
				int var3 = field1000.method211();
				int var4 = var3 >> 10 & 0x1F;
				int var5 = var3 >> 5 & 0x1F;
				int var6 = var3 & 0x1F;
				class60.field829[var2].field870 = (var6 << 3) + (var4 << 19) + (var5 << 11);
				field1081 = -1;
				return true;
			}

			if (field1081 == 213) {
				field993 = field1000.method209();
				field1068 = field1000.method209();
				field1155 = field1000.method209();
				field1105 = true;
				field986 = true;
				field1081 = -1;
				return true;
			}

			if (field1081 == 106) {
				int var7 = field1000.method211();
				method483(var7);

				if (field1141 != -1) {
					field1141 = -1;
					field1018 = true;
					field978 = true;
				}

				field1248 = var7;
				field986 = true;
				field1098 = -1;
				field1166 = false;
				field1081 = -1;
				return true;
			}

			if (field1081 == 191) {
				int var8 = field1000.method211();
				int var9 = field1000.method212();
				int var10 = field1000.method212();
				class60 var11 = class60.field829[var8];
				var11.field841 = var9;
				var11.field842 = var10;
				field1081 = -1;
				return true;
			}

			if (field1081 == 71) {
				int var12 = field1000.method209();
				int var13 = field1000.method209();
				int var14 = field1000.method209();
				int var15 = field1000.method209();
				field1212[var12] = true;
				field1144[var12] = var13;
				field1249[var12] = var14;
				field1251[var12] = var15;
				field1287[var12] = 0;
				field1081 = -1;
				return true;
			}

			if (field1081 == 12) {
				int var16 = field1000.method209();
				int var17 = field1000.method209();
				int var18 = -1;
				for (int var19 = 0; var19 < field1035.length; var19++) {
					if ((var16 << 8) + var17 == field1035[var19]) {
						var18 = var19;
					}
				}

				if (var18 != -1) {
					signlink.cachesave("m" + var16 + "_" + var17, field976[var18]);
					field1043 = 1;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 35) {
				int var20 = field1000.method209();
				int var21 = field1000.method209();
				int var22 = field1000.method211();
				int var23 = field1000.method211();
				int var24 = -1;
				for (int var25 = 0; var25 < field1035.length; var25++) {
					if ((var20 << 8) + var21 == field1035[var25]) {
						var24 = var25;
					}
				}

				if (var24 != -1) {
					if (field1276[var24] == null || field1276[var24].length != var23) {
						field1276[var24] = new byte[var23];
					}

					field1000.method218(var22, field1080 - 6, field1276[var24]);
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 250) {
				field1019 = field1000.method209();
				field1020 = field1000.method209();
				field1081 = -1;
				return true;
			}

			if (field1081 == 253) {
				int var26 = field1000.method211();
				int var27 = field1000.method211();
				int var28 = field1000.method211();
				class60 var29 = class60.field829[var26];
				class31 var30 = var29.field875;
				if (var30 != null) {
					var30.method133(var27, var28);
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 248) {
				int var31 = field1000.method211();
				int var32 = field1000.method211();
				class60.field829[var31].field875 = new class31(var32);
				field1081 = -1;
				return true;
			}

			if (field1081 == 230) {
				if (field1152 && !field1160) {
					int var33 = field1000.method211();
					int var34 = field1000.method214();
					int var35 = field1080 - 6;
					byte[] var36 = new byte[var34];
					class44.method238(var36, var34, field1000.field539, var35, field1000.field540);
					method366(var34, var36, false);
					field1164 = var33;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 140) {
				long var37 = field1000.method215();
				int var39 = field1000.method209();
				String var40 = class48.method255(class48.method252(var37));
				for (int var41 = 0; var41 < field1192; var41++) {
					if (field1328[var41] == var37) {
						if (field1186[var41] != var39) {
							field1186[var41] = var39;
							field1018 = true;

							if (var39 > 0) {
								method382(5, "", var40 + " has logged in.");
							}

							if (var39 == 0) {
								method382(5, "", var40 + " has logged out.");
							}
						}

						var40 = null;
						break;
					}
				}

				if (var40 != null && field1192 < 100) {
					field1328[field1192] = var37;
					field1092[field1192] = var40;
					field1186[field1192] = var39;
					field1192++;
					field1018 = true;
				}

				boolean var42 = false;
				while (!var42) {
					var42 = true;
					for (int var43 = 0; var43 < field1192 - 1; var43++) {
						if (field1186[var43] != field1157 && field1186[var43 + 1] == field1157 || field1186[var43] == 0 && field1186[var43 + 1] != 0) {
							int var44 = field1186[var43];
							field1186[var43] = field1186[var43 + 1];
							field1186[var43 + 1] = var44;
							String var45 = field1092[var43];
							field1092[var43] = field1092[var43 + 1];
							field1092[var43 + 1] = var45;
							long var46 = field1328[var43];
							field1328[var43] = field1328[var43 + 1];
							field1328[var43 + 1] = var46;
							field1018 = true;
							var42 = false;
						}
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 132) {
				class5.method35(true);
				field1081 = -1;
				return true;
			}

			if (field1081 == 55) {
				for (int var48 = 0; var48 < field962.length; var48++) {
					if (field962[var48] != null) {
						field962[var48].field295 = -1;
					}
				}

				for (int var49 = 0; var49 < field1029.length; var49++) {
					if (field1029[var49] != null) {
						field1029[var49].field295 = -1;
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 218) {
				int var50 = field1000.method211();
				boolean var51 = field1000.method209() == 1;
				class60.field829[var50].field849 = var51;
				field1081 = -1;
				return true;
			}

			if (field1081 == 113) {
				field1070 = field1080 / 8;
				for (int var52 = 0; var52 < field1070; var52++) {
					field1264[var52] = field1000.method215();
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 125) {
				field1215 = 0;
				field1081 = -1;
				return true;
			}

			if (field1081 == 235) {
				int var53 = field1000.method211();
				int var54 = field1000.method214();
				field1329[var53] = var54;

				if (field1017[var53] != var54) {
					field1017[var53] = var54;
					method487(var53);
					field1018 = true;

					if (field1023 != -1) {
						field986 = true;
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 174) {
				field1161 = true;
				field1136 = field1000.method209();
				field1137 = field1000.method209();
				field1138 = field1000.method211();
				field1139 = field1000.method209();
				field1140 = field1000.method209();
				if (field1140 >= 100) {
					field1145 = field1136 * 128 + 64;
					field1147 = field1137 * 128 + 64;
					field1146 = method420(field1136, field1137, field1334) - field1138;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 47) {
				field1161 = false;

				for (int var55 = 0; var55 < 5; var55++) {
					field1212[var55] = false;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 48) {
				int var56 = field1000.method211();
				int var57 = field1000.method211();
				class54 var58 = class54.method281(var57);
				class60.field829[var56].field875 = var58.method284();
				field1081 = -1;
				return true;
			}

			if (field1081 == 240) {
				field1161 = true;
				field1259 = field1000.method209();
				field1260 = field1000.method209();
				field1261 = field1000.method211();
				field1262 = field1000.method209();
				field1263 = field1000.method209();
				if (field1263 >= 100) {
					int var59 = field1259 * 128 + 64;
					int var60 = field1260 * 128 + 64;
					int var61 = method420(field1259, field1260, field1334) - field1261;
					int var62 = var59 - field1145;
					int var63 = var61 - field1146;
					int var64 = var60 - field1147;
					int var65 = (int) Math.sqrt(var62 * var62 + var64 * var64);
					field1148 = (int) (Math.atan2(var63, var65) * 325.949D) & 0x7FF;
					field1149 = (int) (Math.atan2(var62, var64) * -325.949D) & 0x7FF;

					if (field1148 < 128) {
						field1148 = 128;
					}

					if (field1148 > 383) {
						field1148 = 383;
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 201) {
				long var66 = field1000.method215();
				int var68 = field1000.method214();
				int var69 = field1000.method209();
				boolean var70 = false;
				for (int var71 = 0; var71 < 100; var71++) {
					if (field1059[var71] == var68) {
						var70 = true;
						break;
					}
				}

				if (var69 <= 1) {
					for (int var72 = 0; var72 < field1070; var72++) {
						if (field1264[var72] == var66) {
							var70 = true;
							break;
						}
					}
				}

				if (!var70 && field1325 == 0) {
					try {
						field1059[field1310] = var68;
						field1310 = (field1310 + 1) % 100;
						String var73 = class49.method258(field1080 - 13, field1000);
						var73 = class65.method335(var73);
						if (var69 > 1) {
							method382(7, class48.method255(class48.method252(var66)), var73);
						} else {
							method382(3, class48.method255(class48.method252(var66)), var73);
						}
					} catch (Exception var179) {
						signlink.reporterror("cde1");
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 186) {
				int var75 = field1000.method211();
				class60 var76 = class60.field829[var75];
				for (int var77 = 0; var77 < var76.field830.length; var77++) {
					var76.field830[var77] = -1;
					var76.field830[var77] = 0;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 231) {
				int var78 = field1000.method211();
				int var79 = field1000.method211();

				if (field1248 != -1) {
					field1248 = -1;
					field986 = true;
				}

				if (field1033) {
					field1033 = false;
					field986 = true;
				}

				field1098 = var78;
				field1141 = var79;
				field1018 = true;
				field978 = true;
				field1166 = false;
				field1081 = -1;
				return true;
			}

			if (field1081 == 255) {
				if (field1141 != -1) {
					field1141 = -1;
					field1018 = true;
					field978 = true;
				}

				if (field1248 != -1) {
					field1248 = -1;
					field986 = true;
				}

				if (field1033) {
					field1033 = false;
					field986 = true;
				}

				field1098 = -1;
				field1166 = false;
				field1081 = -1;
				return true;
			}

			if (field1081 == 202) {
				int var80 = field1000.method211();
				int var81 = field1000.method209();
				int var82 = field1000.method211();
				if (field1191 && !field1160 && field1022 < 50) {
					field1234[field1022] = var80;
					field1060[field1022] = var81;
					field1188[field1022] = class51.field664[var80] + var82;
					field1022++;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 216) {
				for (int var83 = 0; var83 < field1017.length; var83++) {
					if (field1329[var83] != field1017[var83]) {
						field1017[var83] = field1329[var83];
						method487(var83);
						field1018 = true;
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 33) {
				int var84 = field1000.method211();
				int var85 = field1000.method211();
				int var86 = field1000.method211();
				class55 var87 = class55.method287(var85);
				class60.field829[var84].field875 = var87.method291(50);
				class60.field829[var84].field880 = var87.field775;
				class60.field829[var84].field881 = var87.field776;
				class60.field829[var84].field879 = var87.field774 * 100 / var86;
				field1081 = -1;
				return true;
			}

			if (field1081 == 39) {
				method465();
				field1081 = -1;
				return false;
			}

			if (field1081 == 169) {
				int var88 = field1000.method211();
				class60.field829[var88].field875 = field1285.method115();
				field1081 = -1;
				return true;
			}

			if (field1081 == 57) {
				if (field1066 == 12) {
					field1018 = true;
				}

				field994 = field1000.method212();
				field1081 = -1;
				return true;
			}

			if (field1081 == 153) {
				int var89 = field1000.method211();
				method483(var89);

				if (field1248 != -1) {
					field1248 = -1;
					field986 = true;
				}

				if (field1033) {
					field1033 = false;
					field986 = true;
				}

				field1141 = var89;
				field1018 = true;
				field978 = true;
				field1098 = -1;
				field1166 = false;
				field1081 = -1;
				return true;
			}

			if (field1081 == 176) {
				int var90 = field1000.method211();
				String var91 = field1000.method216();
				class60.field829[var90].field868 = var91;

				if (field1087[field1066] == class60.field829[var90].field835) {
					field1018 = true;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 3) {
				int var92 = field1000.method211();
				int var93 = field1000.method211();
				if (field1222 == var92 && field1223 == var93 && field1043 != 0) {
					field1081 = -1;
					return true;
				}

				field1222 = var92;
				field1223 = var93;
				field1242 = (field1222 - 6) * 8;
				field1243 = (field1223 - 6) * 8;
				field1043 = 1;
				field1283.method235();
				field1255.method188(151, "Loading - please wait.", 257, 0);
				field1255.method188(150, "Loading - please wait.", 256, 0xFFFFFF);
				field1283.method236(11, 8, field8);
				signlink.looprate(5);
				int var94 = (field1080 - 2) / 10;
				field976 = new byte[var94][];
				field1276 = new byte[var94][];
				field1035 = new int[var94];
				field1016.method198(131);
				field1016.method199(0);
				int var95 = 0;
				for (int var96 = 0; var96 < var94; var96++) {
					int var97 = field1000.method209();
					int var98 = field1000.method209();
					int var99 = field1000.method214();
					int var100 = field1000.method214();
					field1035[var96] = (var97 << 8) + var98;

					if (var99 != 0) {
						byte[] var101 = signlink.cacheload("m" + var97 + "_" + var98);
						if (var101 != null) {
							field1094.reset();
							field1094.update(var101);

							if ((int) field1094.getValue() != var99) {
								var101 = null;
							}
						}

						if (var101 == null) {
							field1043 = 0;
							field1016.method199(0);
							field1016.method199(var97);
							field1016.method199(var98);
							var95 += 3;
						} else {
							field976[var96] = var101;
						}
					}

					if (var100 != 0) {
						byte[] var102 = signlink.cacheload("l" + var97 + "_" + var98);
						if (var102 != null) {
							field1094.reset();
							field1094.update(var102);

							if ((int) field1094.getValue() != var100) {
								var102 = null;
							}
						}

						if (var102 == null) {
							field1043 = 0;
							field1016.method199(1);
							field1016.method199(var97);
							field1016.method199(var98);
							var95 += 3;
						} else {
							field1276[var96] = var102;
						}
					}
				}

				field1016.method208(var95);
				signlink.looprate(50);
				field1283.method235();

				if (field1043 == 0) {
					field1255.method188(166, "Map area updated since last visit, so load will take longer this time only", 257, 0);
					field1255.method188(165, "Map area updated since last visit, so load will take longer this time only", 256, 0xFFFFFF);
				}

				field1283.method236(11, 8, field8);
				int var103 = field1242 - field1244;
				int var104 = field1243 - field1245;
				field1244 = field1242;
				field1245 = field1243;

				for (int var105 = 0; var105 < 8192; var105++) {
					class25 var106 = field1029[var105];
					if (var106 != null) {
						for (int var107 = 0; var107 < 10; var107++) {
							var106.field316[var107] -= var103;
							var106.field317[var107] -= var104;
						}

						var106.field268 -= var103 * 128;
						var106.field269 -= var104 * 128;
					}
				}

				for (int var108 = 0; var108 < field960; var108++) {
					class26 var109 = field962[var108];
					if (var109 != null) {
						for (int var110 = 0; var110 < 10; var110++) {
							var109.field316[var110] -= var103;
							var109.field317[var110] -= var104;
						}

						var109.field268 -= var103 * 128;
						var109.field269 -= var104 * 128;
					}
				}

				byte var111 = 0;
				byte var112 = 104;
				byte var113 = 1;
				if (var103 < 0) {
					var111 = 103;
					var112 = -1;
					var113 = -1;
				}

				byte var114 = 0;
				byte var115 = 104;
				byte var116 = 1;
				if (var104 < 0) {
					var114 = 103;
					var115 = -1;
					var116 = -1;
				}

				for (int var117 = var111; var117 != var112; var117 += var113) {
					for (int var118 = var114; var118 != var115; var118 += var116) {
						int var119 = var103 + var117;
						int var120 = var104 + var118;
						for (int var121 = 0; var121 < 4; var121++) {
							if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
								field1241[var121][var117][var118] = field1241[var121][var119][var120];
							} else {
								field1241[var121][var117][var118] = null;
							}
						}
					}
				}

				for (class38 var122 = (class38) field944.method228(); var122 != null; var122 = (class38) field944.method230()) {
					var122.field553 -= var103;
					var122.field554 -= var104;
					if (var122.field553 < 0 || var122.field554 < 0 || var122.field553 >= 104 || var122.field554 >= 104) {
						var122.method107();
					}
				}

				if (field1215 != 0) {
					field1215 -= var103;
					field1216 -= var104;
				}

				field1161 = false;
				field1081 = -1;
				return true;
			}

			if (field1081 == 165) {
				int var123 = field1000.method212();
				field1023 = var123;
				field986 = true;
				field1081 = -1;
				return true;
			}

			if (field1081 == 147) {
				field1019 = field1000.method209();
				field1020 = field1000.method209();
				for (int var124 = field1019; var124 < field1019 + 8; var124++) {
					for (int var125 = field1020; var125 < field1020 + 8; var125++) {
						if (field1241[field1334][var124][var125] != null) {
							field1241[field1334][var124][var125] = null;
							method437(var124, var125);
						}
					}
				}

				for (class38 var126 = (class38) field944.method228(); var126 != null; var126 = (class38) field944.method230()) {
					if (var126.field553 >= field1019 && var126.field553 < field1019 + 8 && var126.field554 >= field1020 && var126.field554 < field1020 + 8 && field1334 == var126.field551) {
						method376(var126.field559, var126.field553, var126.field554, var126.field558, var126.field551, var126.field560, var126.field552);
						var126.method107();
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 85) {
				field1066 = field1000.method209();
				field1018 = true;
				field978 = true;
				field1081 = -1;
				return true;
			}

			if (field1081 == 107) {
				if (field1066 == 12) {
					field1018 = true;
				}

				field1189 = field1000.method209();
				field1081 = -1;
				return true;
			}

			if (field1081 == 192) {
				field1019 = field1000.method209();
				field1020 = field1000.method209();

				while (field1000.field540 < field1080) {
					int var127 = field1000.method209();
					method433(var127, field1000);
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 38) {
				field1018 = true;
				int var128 = field1000.method211();
				class60 var129 = class60.field829[var128];
				while (field1000.field540 < field1080) {
					int var130 = field1000.method209();
					int var131 = field1000.method211();
					int var132 = field1000.method209();
					if (var132 == 255) {
						var132 = field1000.method214();
					}

					if (var130 >= 0 && var130 < var129.field830.length) {
						var129.field830[var130] = var131;
						var129.field831[var130] = var132;
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 80) {
				int var133 = field1000.method211();
				int var134 = field1000.method211();
				class60.field829[var133].field877 = var134;
				field1081 = -1;
				return true;
			}

			if (field1081 == 100) {
				int var135 = field1000.method211();
				int var136 = field1000.method209();

				if (var135 == 0xFFFF) {
					var135 = -1;
				}

				field1087[var136] = var135;
				field1018 = true;
				field978 = true;
				field1081 = -1;
				return true;
			}

			if (field1081 == 128) {
				method415(field1000, field1080);
				field1081 = -1;
				return true;
			}

			if (field1081 == 242) {
				field1028 = field1000.method211() * 30;
				field1081 = -1;
				return true;
			}

			if (field1081 == 177) {
				field1027 = field1000.method211();
				field1081 = -1;
				return true;
			}

			if (field1081 == 112) {
				String var137 = field1000.method216();
				if (var137.endsWith(":tradereq:")) {
					String var138 = var137.substring(0, var137.indexOf(":"));
					long var139 = class48.method251(var138);
					boolean var141 = false;
					for (int var142 = 0; var142 < field1070; var142++) {
						if (field1264[var142] == var139) {
							var141 = true;
							break;
						}
					}

					if (!var141 && field1325 == 0) {
						method382(4, var138, "wishes to trade with you.");
					}
				} else if (var137.endsWith(":duelreq:")) {
					String var143 = var137.substring(0, var137.indexOf(":"));
					long var144 = class48.method251(var143);
					boolean var146 = false;
					for (int var147 = 0; var147 < field1070; var147++) {
						if (field1264[var147] == var144) {
							var146 = true;
							break;
						}
					}

					if (!var146 && field1325 == 0) {
						method382(8, var143, "wishes to duel with you.");
					}
				} else {
					method382(0, "", var137);
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 42) {
				field1067 = field1000.method209();
				if (field1067 == 1) {
					field1274 = field1000.method211();
				}

				if (field1067 >= 2 && field1067 <= 6) {
					if (field1067 == 2) {
						field1318 = 64;
						field1319 = 64;
					}

					if (field1067 == 3) {
						field1318 = 0;
						field1319 = 64;
					}

					if (field1067 == 4) {
						field1318 = 128;
						field1319 = 64;
					}

					if (field1067 == 5) {
						field1318 = 64;
						field1319 = 0;
					}

					if (field1067 == 6) {
						field1318 = 64;
						field1319 = 128;
					}

					field1067 = 2;
					field1315 = field1000.method211();
					field1316 = field1000.method211();
					field1317 = field1000.method209();
				}

				if (field1067 == 10) {
					field1238 = field1000.method211();
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 180) {
				int var148 = field1000.method211();
				method483(var148);

				if (field1141 != -1) {
					field1141 = -1;
					field1018 = true;
					field978 = true;
				}

				if (field1248 != -1) {
					field1248 = -1;
					field986 = true;
				}

				if (field1033) {
					field1033 = false;
					field986 = true;
				}

				field1098 = var148;
				field1166 = false;
				field1081 = -1;
				return true;
			}

			if (field1081 == 66) {
				int var149 = field1000.method209();
				int var150 = field1000.method209();
				int var151 = field1000.method211();
				int var152 = field1000.method211();
				int var153 = -1;
				for (int var154 = 0; var154 < field1035.length; var154++) {
					if ((var149 << 8) + var150 == field1035[var154]) {
						var153 = var154;
					}
				}

				if (var153 != -1) {
					if (field976[var153] == null || field976[var153].length != var152) {
						field976[var153] = new byte[var152];
					}

					field1000.method218(var151, field1080 - 6, field976[var153]);
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 72) {
				field1197 = field1000.method209();
				field1081 = -1;
				return true;
			}

			if (field1081 == 117 || field1081 == 25 || field1081 == 127 || field1081 == 195 || field1081 == 1 || field1081 == 61 || field1081 == 246 || field1081 == 78 || field1081 == 214 || field1081 == 220) {
				method433(field1081, field1000);
				field1081 = -1;
				return true;
			}

			if (field1081 == 60) {
				int var155 = field1000.method209();
				int var156 = field1000.method209();
				int var157 = -1;
				for (int var158 = 0; var158 < field1035.length; var158++) {
					if ((var155 << 8) + var156 == field1035[var158]) {
						var157 = var158;
					}
				}

				if (var157 != -1) {
					signlink.cachesave("l" + var155 + "_" + var156, field1276[var157]);
					field1043 = 1;
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 171) {
				field941 = field1000.method214();
				field1300 = field1000.method211();
				field979 = field1000.method209();
				field1024 = field1000.method211();

				if (field941 != 0 && field1098 == -1) {
					signlink.dnslookup(class48.method254(field941));
					method453();
					short var159 = 650;
					if (field979 != 201) {
						var159 = 655;
					}

					field1235 = "";
					field959 = false;

					for (int var160 = 0; var160 < class60.field829.length; var160++) {
						if (class60.field829[var160] != null && class60.field829[var160].field838 == var159) {
							field1098 = class60.field829[var160].field835;
							break;
						}
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 68) {
				class5.method34();
				field1081 = -1;
				return true;
			}

			if (field1081 == 92) {
				String var161 = field1000.method216();
				int var162 = field1000.method214();
				int var163 = field1000.method214();
				if (!var161.equals(field1313) && field1152 && !field1160) {
					method459(var162, var161, var163);
				}

				field1313 = var161;
				field1093 = var162;
				field1218 = var163;
				field1164 = 0;
				field1081 = -1;
				return true;
			}

			if (field1081 == 133) {
				int var164 = field1000.method211();
				byte var165 = field1000.method210();
				field1329[var164] = var165;

				if (field1017[var164] != var165) {
					field1017[var164] = var165;
					method487(var164);
					field1018 = true;

					if (field1023 != -1) {
						field986 = true;
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 49) {
				method385(field1000, field1080);

				if (field1043 == 1) {
					field1043 = 2;
					class3.field26 = field1334;
					method427();
				}

				if (field1160 && field1043 == 2 && class3.field26 != field1334) {
					field1283.method235();
					field1255.method188(151, "Loading - please wait.", 257, 0);
					field1255.method188(150, "Loading - please wait.", 256, 0xFFFFFF);
					field1283.method236(11, 8, field8);
					class3.field26 = field1334;
					method427();
				}

				if (field1334 != field1151 && field1043 == 2) {
					field1151 = field1334;
					method449(field1334);
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 94) {
				field1018 = true;
				int var166 = field1000.method209();
				int var167 = field1000.method214();
				int var168 = field1000.method209();
				field999[var166] = var167;
				field1183[var166] = var168;
				field1214[var166] = 1;
				for (int var169 = 0; var169 < 98; var169++) {
					if (var167 >= field1275[var169]) {
						field1214[var166] = var169 + 2;
					}
				}

				field1081 = -1;
				return true;
			}

			if (field1081 == 254) {
				field1194 = false;
				field1033 = true;
				field1078 = "";
				field986 = true;
				field1081 = -1;
				return true;
			}

			if (field1081 == 123) {
				field1018 = true;
				int var170 = field1000.method211();
				class60 var171 = class60.field829[var170];
				int var172 = field1000.method209();
				for (int var173 = 0; var173 < var172; var173++) {
					var171.field830[var173] = field1000.method211();
					int var174 = field1000.method209();
					if (var174 == 255) {
						var174 = field1000.method214();
					}

					var171.field831[var173] = var174;
				}

				for (int var175 = var172; var175 < var171.field830.length; var175++) {
					var171.field830[var175] = 0;
					var171.field831[var175] = 0;
				}

				field1081 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1081 + "," + field1080 + " - " + field1272 + "," + field1273);
			method465();
		} catch (IOException var180) {
			method410();
		} catch (Exception var181) {
			String var177 = "T2 - " + field1081 + "," + field1272 + "," + field1273 + " - " + field1080 + "," + (field1285.field316[0] + field1242) + "," + (field1285.field317[0] + field1243) + " - ";
			for (int var178 = 0; var178 < field1080 && var178 < 50; var178++) {
				var177 = var177 + field1000.field539[var178] + ",";
			}

			signlink.reporterror(var177);
			method465();
		}

		return true;
	}

	@ObfuscatedName("client.a(Lkb;IB)V")
	public final void method424(class37 arg0, int arg1) {
		arg0.method219();
		int var3 = arg0.method220(1);
		if (var3 != 0) {
			int var4 = arg0.method220(2);
			if (var4 == 0) {
				field966[field965++] = field961;
			} else if (var4 == 1) {
				int var5 = arg0.method220(3);
				field1285.method110(false, var5);
				int var6 = arg0.method220(1);
				if (var6 == 1) {
					field966[field965++] = field961;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method220(3);
				field1285.method110(true, var7);
				int var8 = arg0.method220(3);
				field1285.method110(true, var8);
				int var9 = arg0.method220(1);
				if (var9 == 1) {
					field966[field965++] = field961;
				}
			} else if (var4 == 3) {
				field1334 = arg0.method220(2);
				int var10 = arg0.method220(7);
				int var11 = arg0.method220(7);
				int var12 = arg0.method220(1);
				field1285.method109(var11, var12 == 1, var10);
				int var13 = arg0.method220(1);
				if (var13 == 1) {
					field966[field965++] = field961;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Z")
	public final boolean method425(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1101[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 447) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method426() {
		if (field1203 == 0) {
			int var1 = field17;
			if (field1294 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field1180) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field1227 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1227 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field1227 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field1228 - 10 || var2 > field1230 + field1228 + 10 || var3 < field1229 - 10 || var3 > field1231 + field1229 + 10) {
						field1180 = false;

						if (field1227 == 1) {
							field1018 = true;
						}

						if (field1227 == 2) {
							field986 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1228;
					int var5 = field1229;
					int var6 = field1230;
					int var7 = field18;
					int var8 = field19;
					if (field1227 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1227 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field1227 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field971; var10++) {
						int var11 = (field971 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method386(var9);
					}

					field1180 = false;

					if (field1227 == 1) {
						field1018 = true;
					}

					if (field1227 == 2) {
						field986 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field971 > 0) {
					int var12 = field1101[field971 - 1];
					if (var12 == 134 || var12 == 701 || var12 == 570 || var12 == 719 || var12 == 440 || var12 == 871 || var12 == 526 || var12 == 156 || var12 == 120 || var12 == 796 || var12 == 357) {
						int var13 = field1099[field971 - 1];
						int var14 = field1100[field971 - 1];
						class60 var15 = class60.field829[var14];
						if (var15.field855) {
							field1200 = false;
							field1150 = 0;
							field1201 = var14;
							field1202 = var13;
							field1203 = 2;
							field1204 = field18;
							field1205 = field19;

							if (class60.field829[var14].field835 == field1098) {
								field1203 = 1;
							}

							if (class60.field829[var14].field835 == field1248) {
								field1203 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1106 == 1 || method425(field971 - 1)) && field971 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field971 > 0) {
					method386(field971 - 1);
				}

				if (var1 != 2 || field971 <= 0) {
					return;
				}

				method481();
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method427() {
		try {
			field1151 = -1;
			field992.method232();
			field1324.method232();
			field942.method232();
			field1219.method232();
			class33.method156();
			method466();
			field1014.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1293[var1].method295();
			}

			System.gc();
			class3 var2 = new class3(field1126, field987, 104, 104);
			byte[] var3 = new byte[100000];
			int var4 = field976.length;
			class3.field25 = class18.field194;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1035[var5] >> 8;
				int var7 = field1035[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field25 = false;
				}
			}

			if (class3.field25) {
				field1014.method51(field1334);
			} else {
				field1014.method51(0);
			}

			field1016.method198(126);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1035[var8] >> 8) * 64 - field1242;
				int var10 = (field1035[var8] & 0xFF) * 64 - field1243;
				byte[] var11 = field976[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method214();
					class44.method238(var3, var12, var11, var11.length - 4, 4);
					var2.method15((field1223 - 6) * 8, var9, var10, var3, (field1222 - 6) * 8);
				} else if (field1223 < 800) {
					var2.method14(var9, var10, 64, 64);
				}
			}

			field1016.method198(126);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field1276[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method214();
					class44.method238(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1035[var13] >> 8) * 64 - field1242;
					int var17 = (field1035[var13] & 0xFF) * 64 - field1243;
					var2.method16(field1014, field1324, var3, field1293, var16, var17);
				}
			}

			field1016.method198(126);
			var2.method18(field1014, field1293);
			field1283.method235();
			field1016.method198(126);

			for (class40 var18 = (class40) field1324.method228(); var18 != null; var18 = (class40) field1324.method230()) {
				if ((field1126[1][var18.field571][var18.field572] & 0x2) == 2) {
					var18.field569--;
					if (var18.field569 < 0) {
						var18.method107();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method437(var19, var20);
				}
			}

			for (class38 var21 = (class38) field944.method228(); var21 != null; var21 = (class38) field944.method230()) {
				method376(var21.field556, var21.field553, var21.field554, var21.field555, var21.field551, var21.field557, var21.field552);
			}
		} catch (Exception var23) {
		}

		class53.field732.method104();
		System.gc();
		class33.method157(20);
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method428() {
		field974 = new class35(field1156, "titlebox", 0);
		field975 = new class35(field1156, "titlebutton", 0);
		field1265 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1265[var1] = new class35(field1156, "runes", var1);
		}

		field1123 = new class34(128, 265);
		field1124 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1123.field515[var2] = field1304.field580[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1124.field515[var3] = field1305.field580[var3];
		}

		field1168 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1168[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1168[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1168[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1168[var7 + 192] = 0xFFFFFF;
		}

		field1169 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1169[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1169[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1169[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1169[var11 + 192] = 0xFFFFFF;
		}

		field1170 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1170[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1170[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1170[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1170[var15 + 192] = 0xFFFFFF;
		}

		field1167 = new int[256];
		field1025 = new int[32768];
		field1026 = new int[32768];
		method442(null);
		field1133 = new int[32768];
		field1134 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1071) {
			field1221 = true;
			field1071 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method429() {
		for (int var1 = -1; var1 < field963; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field961;
			} else {
				var2 = field964[var1];
			}

			class26 var3 = field962[var2];
			if (var3 != null && var3.field281 > 0) {
				var3.field281--;
				if (var3.field281 == 0) {
					var3.field280 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1030; var4++) {
			int var5 = field1031[var4];
			class25 var6 = field1029[var5];
			if (var6 != null && var6.field281 > 0) {
				var6.field281--;
				if (var6.field281 == 0) {
					var6.field280 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method430() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1069) {
			field1071 = false;
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

		if (field1292) {
			field1071 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1135) {
			field1071 = false;
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

	@ObfuscatedName("client.b(Lkb;IZ)V")
	public final void method431(class37 arg0, int arg1) {
		for (int var3 = 0; var3 < field965; var3++) {
			int var4 = field966[var3];
			class26 var5 = field962[var4];
			int var6 = arg0.method209();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method209() << 8;
			}

			method467(arg0, var6, var4, var5);
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method432() {
		for (int var1 = -1; var1 < field963; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field961;
			} else {
				var2 = field964[var1];
			}

			class26 var3 = field962[var2];
			if (var3 != null) {
				method473(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(IZLkb;)V")
	public final void method433(int arg0, class37 arg1) {
		if (arg0 == 220 || arg0 == 214) {
			int var3 = arg1.method209();
			int var4 = (var3 >> 4 & 0x7) + field1019;
			int var5 = (var3 & 0x7) + field1020;
			int var6 = arg1.method209();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1195[var7];
			int var10;
			if (arg0 == 214) {
				var10 = -1;
			} else {
				var10 = arg1.method211();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field944.method228(); var12 != null; var12 = (class38) field944.method230()) {
					if (field1334 == var12.field551 && var12.field553 == var4 && var12.field554 == var5 && var12.field552 == var9) {
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
						var13 = field1014.method77(field1334, var4, var5);
					}

					if (var9 == 1) {
						var13 = field1014.method78(var5, field1334, var4);
					}

					if (var9 == 2) {
						var13 = field1014.method79(field1334, var4, var5);
					}

					if (var9 == 3) {
						var13 = field1014.method80(field1334, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field1014.method81(field1334, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field551 = field1334;
					var11.field552 = var9;
					var11.field553 = var4;
					var11.field554 = var5;
					var11.field558 = var14;
					var11.field560 = var15;
					var11.field559 = var16;
					field944.method225(var11);
				}

				var11.field555 = var10;
				var11.field557 = var7;
				var11.field556 = var8;
				method376(var8, var4, var5, var10, field1334, var7, var9);
			}
		} else if (arg0 == 78) {
			int var18 = arg1.method209();
			int var19 = (var18 >> 4 & 0x7) + field1019;
			int var20 = (var18 & 0x7) + field1020;
			int var21 = arg1.method209();
			int var22 = var21 >> 2;
			int var23 = field1195[var22];
			int var24 = arg1.method211();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = field1014.method77(field1334, var19, var20);
				}

				if (var23 == 1) {
					var25 = field1014.method78(var20, field1334, var19);
				}

				if (var23 == 2) {
					var25 = field1014.method79(field1334, var19, var20);
				}

				if (var23 == 3) {
					var25 = field1014.method80(field1334, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(false, var25 >> 14 & 0x7FFF, var19, var20, class62.field895[var24], field1334, var23);
					field1324.method225(var26);
				}
			}
		} else if (arg0 == 246) {
			int var27 = arg1.method209();
			int var28 = (var27 >> 4 & 0x7) + field1019;
			int var29 = (var27 & 0x7) + field1020;
			int var30 = arg1.method211();
			int var31 = arg1.method211();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var32 = new class22();
				var32.field266 = var30;
				var32.field267 = var31;

				if (field1241[field1334][var28][var29] == null) {
					field1241[field1334][var28][var29] = new class41();
				}

				field1241[field1334][var28][var29].method225(var32);
				method437(var28, var29);
			}
		} else if (arg0 == 61) {
			int var33 = arg1.method209();
			int var34 = (var33 >> 4 & 0x7) + field1019;
			int var35 = (var33 & 0x7) + field1020;
			int var36 = arg1.method211();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				class41 var37 = field1241[field1334][var34][var35];
				if (var37 != null) {
					for (class22 var38 = (class22) var37.method228(); var38 != null; var38 = (class22) var37.method230()) {
						if ((var36 & 0x7FFF) == var38.field266) {
							var38.method107();
							break;
						}
					}

					if (var37.method228() == null) {
						field1241[field1334][var34][var35] = null;
					}

					method437(var34, var35);
				}
			}
		} else if (arg0 == 1) {
			int var39 = arg1.method209();
			int var40 = (var39 >> 4 & 0x7) + field1019;
			int var41 = (var39 & 0x7) + field1020;
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
				class27 var52 = new class27(var50, field1334, field1320 + var48, var41, var47, var44, var51, method420(var40, var41, field1334) - var46, var45, var40, field1320 + var49);
				var52.method116(method420(var42, var43, field1334) - var47, var42, var43, field1320 + var48);
				field1219.method225(var52);
			}
		} else if (arg0 == 195) {
			int var53 = arg1.method209();
			int var54 = (var53 >> 4 & 0x7) + field1019;
			int var55 = (var53 & 0x7) + field1020;
			int var56 = arg1.method211();
			int var57 = arg1.method209();
			int var58 = arg1.method211();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				class28 var59 = new class28(var55, field1334, method420(var54, var55, field1334) - var57, var56, var54, var58, field1320);
				field942.method225(var59);
			}
		} else if (arg0 == 127) {
			int var60 = arg1.method209();
			int var61 = (var60 >> 4 & 0x7) + field1019;
			int var62 = (var60 & 0x7) + field1020;
			int var63 = arg1.method211();
			int var64 = arg1.method211();
			int var65 = arg1.method211();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && field1027 != var65) {
				class22 var66 = new class22();
				var66.field266 = var63;
				var66.field267 = var64;

				if (field1241[field1334][var61][var62] == null) {
					field1241[field1334][var61][var62] = new class41();
				}

				field1241[field1334][var61][var62].method225(var66);
				method437(var61, var62);
			}
		} else if (arg0 == 25) {
			int var67 = arg1.method209();
			int var68 = (var67 >> 4 & 0x7) + field1019;
			int var69 = (var67 & 0x7) + field1020;
			int var70 = arg1.method209();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = field1195[var71];
			int var74 = arg1.method211();
			int var75 = arg1.method211();
			int var76 = arg1.method211();
			int var77 = arg1.method211();
			byte var78 = arg1.method210();
			byte var79 = arg1.method210();
			byte var80 = arg1.method210();
			byte var81 = arg1.method210();
			class26 var82;
			if (field1027 == var77) {
				var82 = field1285;
			} else {
				var82 = field962[var77];
			}

			if (var82 != null) {
				class39 var83 = new class39(field1320 + var75, var72, var71, var68, var73, -1, var69, field1334);
				field992.method225(var83);
				class39 var84 = new class39(field1320 + var76, var72, var71, var68, var73, var74, var69, field1334);
				field992.method225(var84);
				int var85 = field987[field1334][var68][var69];
				int var86 = field987[field1334][var68 + 1][var69];
				int var87 = field987[field1334][var68 + 1][var69 + 1];
				int var88 = field987[field1334][var68][var69 + 1];
				class53 var89 = class53.method275(var74);
				var82.field330 = field1320 + var75;
				var82.field331 = field1320 + var76;
				var82.field335 = var89.method278(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.field706;
				int var91 = var89.field707;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.field707;
					var91 = var89.field706;
				}

				var82.field332 = var68 * 128 + var90 * 64;
				var82.field334 = var69 * 128 + var91 * 64;
				var82.field333 = method420(var82.field332, var82.field334, field1334);

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

				var82.field336 = var68 + var78;
				var82.field338 = var68 + var80;
				var82.field337 = var69 + var79;
				var82.field339 = var69 + var81;
			}
		} else if (arg0 == 117) {
			int var94 = arg1.method209();
			int var95 = (var94 >> 4 & 0x7) + field1019;
			int var96 = (var94 & 0x7) + field1020;
			int var97 = arg1.method211();
			int var98 = arg1.method211();
			int var99 = arg1.method211();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1241[field1334][var95][var96];
				if (var100 != null) {
					for (class22 var101 = (class22) var100.method228(); var101 != null; var101 = (class22) var100.method230()) {
						if ((var97 & 0x7FFF) == var101.field266 && var101.field267 == var98) {
							var101.field267 = var99;
							break;
						}
					}

					method437(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;IIII)V")
	public final void method434(class60 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field836 == 0 && arg0.field850 != null && (!arg0.field849 || field1187 == arg0.field834 || field948 == arg0.field834 || field1226 == arg0.field834)) {
			int var5 = class32.field487;
			int var6 = class32.field485;
			int var7 = class32.field488;
			int var8 = class32.field486;
			class32.method147(arg3, arg1, arg0.field839 + arg3, arg0.field840 + arg1);
			int var9 = arg0.field850.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field851[var10] + arg3;
				int var12 = arg0.field852[var10] + arg1 - arg2;
				class60 var13 = class60.field829[arg0.field850[var10]];
				var11 += var13.field841;
				var12 += var13.field842;

				if (var13.field838 > 0) {
					method399(var13);
				}

				if (var13.field836 == 0) {
					if (var13.field848 > var13.field847 - var13.field840) {
						var13.field848 = var13.field847 - var13.field840;
					}

					if (var13.field848 < 0) {
						var13.field848 = 0;
					}

					method434(var13, var12, var13.field848, var11);

					if (var13.field847 > var13.field840) {
						method392(var13.field847, var13.field840, var13.field848, var12, var13.field839 + var11);
					}
				} else if (var13.field836 != 1) {
					if (var13.field836 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field840; var15++) {
							for (int var16 = 0; var16 < var13.field839; var16++) {
								int var17 = (var13.field858 + 32) * var16 + var11;
								int var18 = (var13.field859 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field861[var14];
									var18 += var13.field862[var14];
								}

								if (var13.field830[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field830[var14] - 1;
									class34 var22 = class55.method292(var13.field831[var14], var21);
									if (field1203 != 0 && field1202 == var14 && field1201 == var13.field834) {
										var19 = field15 - field1204;
										var20 = field16 - field1205;

										if (var19 < 5 && var19 > -5) {
											var19 = 0;
										}

										if (var20 < 5 && var20 > -5) {
											var20 = 0;
										}

										if (field1150 < 5) {
											var19 = 0;
											var20 = 0;
										}

										var22.method177(var17 + var19, 128, var18 + var20);
									} else if (field1175 != 0 && field1174 == var14 && field1173 == var13.field834) {
										var22.method177(var17, 128, var18);
									} else {
										var22.method173(var18, var17);
									}

									if (var22.field520 == 33 || var13.field831[var14] != 1) {
										int var23 = var13.field831[var14];
										field1254.method191(var18 + var20 + 10, method439(var23), var17 + var19 + 1, 0);
										field1254.method191(var18 + var20 + 9, method439(var23), var17 + var19, 0xFFFF00);
									}
								} else if (var13.field860 != null && var14 < 20) {
									class34 var24 = var13.field860[var14];
									if (var24 != null) {
										var24.method173(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field836 == 3) {
						if (var13.field864) {
							class32.method149(var11, var13.field839, var13.field870, var12, var13.field840);
						} else {
							class32.method150(var13.field839, var13.field870, var11, var12, var13.field840);
						}
					} else if (var13.field836 == 4) {
						class36 var25 = var13.field867;
						int var26 = var13.field870;
						String var27 = var13.field868;

						if ((field1226 == var13.field834 || field948 == var13.field834 || field1187 == var13.field834) && var13.field872 != 0) {
							var26 = var13.field872;
						}

						if (method404(var13)) {
							var26 = var13.field871;

							if (var13.field869.length() > 0) {
								var27 = var13.field869;
							}
						}

						if (var13.field837 == 6 && field1166) {
							var27 = "Please wait...";
							var26 = var13.field870;
						}

						int var28 = var25.field537 + var12;
						while (var27.length() > 0) {
							if (var27.indexOf("%") != -1) {
								while (true) {
									int var29 = var27.indexOf("%1");
									if (var29 == -1) {
										break;
									}

									var27 = var27.substring(0, var29) + method485(method436(0, var13)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method485(method436(1, var13)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method485(method436(2, var13)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method485(method436(3, var13)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method485(method436(4, var13)) + var27.substring(var33 + 2);
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

							if (var13.field865) {
								var25.method189(var35, var28, var26, var13.field866, var13.field839 / 2 + var11);
							} else {
								var25.method193(var35, var26, var11, var13.field866, var28);
							}

							var28 += var25.field537;
						}
					} else if (var13.field836 == 5) {
						class34 var36;
						if (method404(var13)) {
							var36 = var13.field874;
						} else {
							var36 = var13.field873;
						}

						if (var36 != null) {
							var36.method173(var12, var11);
						}
					} else if (var13.field836 == 6) {
						int var37 = class33.field497;
						int var38 = class33.field498;
						class33.field497 = var13.field839 / 2 + var11;
						class33.field498 = var13.field840 / 2 + var12;
						int var39 = class33.field501[var13.field880] * var13.field879 >> 16;
						int var40 = class33.field502[var13.field880] * var13.field879 >> 16;
						boolean var41 = method404(var13);
						int var42;
						if (var41) {
							var42 = var13.field878;
						} else {
							var42 = var13.field877;
						}

						class31 var43;
						if (var42 == -1) {
							var43 = var13.method315(-1, -1, var41);
						} else {
							class62 var44 = class62.field895[var42];
							var43 = var13.method315(var44.field897[var13.field832], var44.field898[var13.field832], var41);
						}

						if (var43 != null) {
							var43.method139(0, var13.field881, 0, var13.field880, 0, var39, var40);
						}

						class33.field497 = var37;
						class33.field498 = var38;
					} else if (var13.field836 == 7) {
						class36 var45 = var13.field867;
						int var46 = 0;
						for (int var47 = 0; var47 < var13.field840; var47++) {
							for (int var48 = 0; var48 < var13.field839; var48++) {
								if (var13.field830[var46] > 0) {
									class55 var49 = class55.method287(var13.field830[var46] - 1);
									String var50 = var49.field770;
									if (var49.field781 || var13.field831[var46] != 1) {
										var50 = var50 + " x" + method422(var13.field831[var46]);
									}

									int var51 = (var13.field858 + 115) * var48 + var11;
									int var52 = (var13.field859 + 12) * var47 + var12;
									if (var13.field865) {
										var45.method189(var50, var52, var13.field870, var13.field866, var13.field839 / 2 + var51);
									} else {
										var45.method193(var50, var13.field870, var51, var13.field866, var52);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class32.method147(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method435() {
		if (field1284 == null) {
			method365();
			field9 = null;
			field1301 = null;
			field1302 = null;
			field1303 = null;
			field1304 = null;
			field1305 = null;
			field1306 = null;
			field1307 = null;
			field1308 = null;
			field1309 = null;
			field1284 = new class43(479, method11(), 96);
			field1282 = new class43(168, method11(), 160);
			class32.method148();
			field1041.method186(0, 0);
			field1281 = new class43(190, method11(), 261);
			field1283 = new class43(512, method11(), 334);
			class32.method148();
			field1177 = new class43(501, method11(), 61);
			field1178 = new class43(288, method11(), 40);
			field1179 = new class43(269, method11(), 66);
			field1278 = true;
		}
	}

	@ObfuscatedName("client.a(ILhc;I)I")
	public final int method436(int arg0, class60 arg1) {
		if (arg1.field843 == null || arg0 >= arg1.field843.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field843[arg0];
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
					var4 += field1214[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field999[var3[var5++]];
				}

				if (var6 == 4) {
					class60 var7 = class60.field829[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field830.length; var9++) {
						if (var7.field830[var9] == var8) {
							var4 += var7.field831[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field1017[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1275[field1214[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1017[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1285.field327;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1214[var10];
					}
				}

				if (var6 == 10) {
					class60 var11 = class60.field829[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field830.length; var13++) {
						if (var11.field830[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field1189;
				}

				if (var6 == 12) {
					var4 += field994;
				}

				if (var6 == 13) {
					int var14 = field1017[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	public final void init() {
		field1157 = Integer.parseInt(getParameter("nodeid"));
		field1158 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method393();
		} else {
			method457();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1159 = false;
		} else {
			field1159 = true;
		}

		method2(532, 789);
	}

	public final void run() {
		if (field1221) {
			method450();
		} else if (field1142) {
			method387();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method10() {
		field1278 = true;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method437(int arg0, int arg1) {
		class41 var3 = field1241[field1334][arg0][arg1];
		if (var3 == null) {
			field1014.method76(field1334, arg0, arg1);
		} else {
			int var4 = -99999999;
			class22 var5 = null;
			for (class22 var6 = (class22) var3.method228(); var6 != null; var6 = (class22) var3.method230()) {
				class55 var7 = class55.method287(var6.field266);
				int var8 = var7.field782;
				if (var7.field781) {
					var8 = (var6.field267 + 1) * var8;
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
				if (var5.field266 != var13.field266 && var9 == -1) {
					var9 = var13.field266;
					var11 = var13.field267;
				}

				if (var5.field266 != var13.field266 && var13.field266 != var9 && var10 == -1) {
					var10 = var13.field266;
					var12 = var13.field267;
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
			class55 var17 = class55.method287(var5.field266);
			field1014.method57(var14, method420(arg0 * 128 + 64, arg1 * 128 + 64, field1334), var15, field1334, arg1, arg0, var17.method291(var5.field267), var16);
		}
	}

	@ObfuscatedName("client.b(BLkb;I)V")
	public final void method438(class37 arg0, int arg1) {
		for (int var3 = 0; var3 < field965; var3++) {
			int var4 = field966[var3];
			class25 var5 = field1029[var4];
			int var6 = arg0.method209();
			if ((var6 & 0x2) == 2) {
				int var7 = arg0.method211();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field295 == var7) {
					var5.field299 = 0;
				}

				int var8 = arg0.method209();
				if (var7 == -1 || var5.field295 == -1 || class62.field895[var7].field903 > class62.field895[var5.field295].field903 || class62.field895[var5.field295].field903 == 0) {
					var5.field295 = var7;
					var5.field296 = 0;
					var5.field297 = 0;
					var5.field298 = var8;
					var5.field299 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field289 = arg0.method211();
				if (var5.field289 == 0xFFFF) {
					var5.field289 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field280 = arg0.method216();
				var5.field281 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field284 = arg0.method209();
				var5.field285 = arg0.method209();
				var5.field286 = field1320 + 400;
				var5.field287 = arg0.method209();
				var5.field288 = arg0.method209();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field320 = class54.method281(arg0.method211());
				var5.field275 = var5.field320.field746;
				var5.field276 = var5.field320.field747;
				var5.field277 = var5.field320.field748;
				var5.field278 = var5.field320.field749;
				var5.field273 = var5.field320.field745;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field300 = arg0.method211();
				int var9 = arg0.method214();
				var5.field304 = var9 >> 16;
				var5.field303 = (var9 & 0xFFFF) + field1320;
				var5.field301 = 0;
				var5.field302 = 0;

				if (var5.field303 > field1320) {
					var5.field301 = -1;
				}

				if (var5.field300 == 0xFFFF) {
					var5.field300 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field290 = arg0.method211();
				var5.field291 = arg0.method211();
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method439(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IIIILz;)V")
	public final void method440(int arg0, int arg1, int arg2, class26 arg3) {
		if (field1285 != arg3 && field971 < 400) {
			String var5 = arg3.field321 + method418(arg3.field327, field1285.field327) + " (level-" + arg3.field327 + ")";
			if (field1061 == 1) {
				field1132[field971] = "Use " + field1065 + " with @whi@" + var5;
				field1101[field971] = 103;
				field1102[field971] = arg1;
				field1099[field971] = arg0;
				field1100[field971] = arg2;
				field971++;
			} else if (field1294 != 1) {
				field1132[field971] = "Follow @whi@" + var5;
				field1101[field971] = 1741;
				field1102[field971] = arg1;
				field1099[field971] = arg0;
				field1100[field971] = arg2;
				field971++;
				if (field1325 == 0) {
					field1132[field971] = "Trade with @whi@" + var5;
					field1101[field971] = 1528;
					field1102[field971] = arg1;
					field1099[field971] = arg0;
					field1100[field971] = arg2;
					field971++;
				}

				if (field1127 > 0) {
					field1132[field971] = "Attack @whi@" + var5;

					if (field1285.field327 >= arg3.field327) {
						field1101[field971] = 593;
					} else {
						field1101[field971] = 2593;
					}

					field1102[field971] = arg1;
					field1099[field971] = arg0;
					field1100[field971] = arg2;
					field971++;
				}

				if (field1118 == 1) {
					field1132[field971] = "Fight @whi@" + var5;
					field1101[field971] = 593;
					field1102[field971] = arg1;
					field1099[field971] = arg0;
					field1100[field971] = arg2;
					field971++;
				}

				if (field1118 == 2) {
					field1132[field971] = "Duel-with @whi@" + var5;
					field1101[field971] = 1596;
					field1102[field971] = arg1;
					field1099[field971] = arg0;
					field1100[field971] = arg2;
					field971++;
				}
			} else if ((field1296 & 0x8) == 8) {
				field1132[field971] = field1297 + " @whi@" + var5;
				field1101[field971] = 48;
				field1102[field971] = arg1;
				field1099[field971] = arg0;
				field1100[field971] = arg2;
				field971++;
			}

			for (int var6 = 0; var6 < field971; var6++) {
				if (field1101[var6] == 981) {
					field1132[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method441() {
		int var1 = field1136 * 128 + 64;
		int var2 = field1137 * 128 + 64;
		int var3 = method420(field1136, field1137, field1334) - field1138;

		if (field1145 < var1) {
			field1145 += (var1 - field1145) * field1140 / 1000 + field1139;
			if (field1145 > var1) {
				field1145 = var1;
			}
		}

		if (field1145 > var1) {
			field1145 -= (field1145 - var1) * field1140 / 1000 + field1139;
			if (field1145 < var1) {
				field1145 = var1;
			}
		}

		if (field1146 < var3) {
			field1146 += (var3 - field1146) * field1140 / 1000 + field1139;
			if (field1146 > var3) {
				field1146 = var3;
			}
		}

		if (field1146 > var3) {
			field1146 -= (field1146 - var3) * field1140 / 1000 + field1139;
			if (field1146 < var3) {
				field1146 = var3;
			}
		}

		if (field1147 < var2) {
			field1147 += (var2 - field1147) * field1140 / 1000 + field1139;
			if (field1147 > var2) {
				field1147 = var2;
			}
		}

		if (field1147 > var2) {
			field1147 -= (field1147 - var2) * field1140 / 1000 + field1139;
			if (field1147 < var2) {
				field1147 = var2;
			}
		}

		int var4 = field1259 * 128 + 64;
		int var5 = field1260 * 128 + 64;
		int var6 = method420(field1259, field1260, field1334) - field1261;
		int var7 = var4 - field1145;
		int var8 = var6 - field1146;
		int var9 = var5 - field1147;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1148 < var11) {
			field1148 += (var11 - field1148) * field1263 / 1000 + field1262;
			if (field1148 > var11) {
				field1148 = var11;
			}
		}

		if (field1148 > var11) {
			field1148 -= (field1148 - var11) * field1263 / 1000 + field1262;
			if (field1148 < var11) {
				field1148 = var11;
			}
		}

		int var13 = var12 - field1149;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1149 += field1263 * var13 / 1000 + field1262;
			field1149 &= 0x7FF;
		}

		if (var13 < 0) {
			field1149 -= -var13 * field1263 / 1000 + field1262;
			field1149 &= 0x7FF;
		}

		int var14 = var12 - field1149;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1149 = var12;
		}
	}

	@ObfuscatedName("client.a(BLib;)V")
	public final void method442(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1025.length; var3++) {
			field1025[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1025[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1026[var9] = (field1025[var9 - 1] + field1025[var9 + 1] + field1025[var9 - 128] + field1025[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1025;
			field1025 = field1026;
			field1026 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field525; var12++) {
				for (int var13 = 0; var13 < arg0.field524; var13++) {
					if (arg0.field522[var11++] != 0) {
						int var14 = var13 + arg0.field526 + 16;
						int var15 = var12 + arg0.field527 + 16;
						int var16 = (var15 << 7) + var14;
						field1025[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method443() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231 && field1087[0] != -1) {
				field1018 = true;
				field1066 = 0;
				field978 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231 && field1087[1] != -1) {
				field1018 = true;
				field1066 = 1;
				field978 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231 && field1087[2] != -1) {
				field1018 = true;
				field1066 = 2;
				field978 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229 && field1087[3] != -1) {
				field1018 = true;
				field1066 = 3;
				field978 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231 && field1087[4] != -1) {
				field1018 = true;
				field1066 = 4;
				field978 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231 && field1087[5] != -1) {
				field1018 = true;
				field1066 = 5;
				field978 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231 && field1087[6] != -1) {
				field1018 = true;
				field1066 = 6;
				field978 = true;
			}

			if (field18 >= 550 && field18 <= 584 && field19 >= 492 && field19 < 528 && field1087[7] != -1) {
				field1018 = true;
				field1066 = 7;
				field978 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529 && field1087[8] != -1) {
				field1018 = true;
				field1066 = 8;
				field978 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529 && field1087[9] != -1) {
				field1018 = true;
				field1066 = 9;
				field978 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528 && field1087[10] != -1) {
				field1018 = true;
				field1066 = 10;
				field978 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529 && field1087[11] != -1) {
				field1018 = true;
				field1066 = 11;
				field978 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529 && field1087[12] != -1) {
				field1018 = true;
				field1066 = 12;
				field978 = true;
			}

			if (field18 >= 734 && field18 <= 768 && field19 >= 492 && field19 < 528 && field1087[13] != -1) {
				field1018 = true;
				field1066 = 13;
				field978 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Z)Z")
	public final boolean method444(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1192; var2++) {
			if (arg0.equalsIgnoreCase(field1092[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1285.field321)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.l(B)Ljava/lang/String;")
	public final String method445() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIIILbc;)V")
	public final void method446(int arg0, int arg1, int arg2, class54 arg3) {
		if (field971 < 400) {
			String var5 = arg3.field740;
			if (arg3.field758 != 0) {
				var5 = var5 + method418(arg3.field758, field1285.field327) + " (level-" + arg3.field758 + ")";
			}

			if (field1061 == 1) {
				field1132[field971] = "Use " + field1065 + " with @yel@" + var5;
				field1101[field971] = 493;
				field1102[field971] = arg0;
				field1099[field971] = arg2;
				field1100[field971] = arg1;
				field971++;
			} else if (field1294 != 1) {
				if (arg3.field753 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg3.field753[var6] != null && !arg3.field753[var6].equalsIgnoreCase("attack")) {
							field1132[field971] = arg3.field753[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1101[field971] = 988;
							}

							if (var6 == 1) {
								field1101[field971] = 345;
							}

							if (var6 == 2) {
								field1101[field971] = 249;
							}

							if (var6 == 3) {
								field1101[field971] = 960;
							}

							if (var6 == 4) {
								field1101[field971] = 40;
							}

							field1102[field971] = arg0;
							field1099[field971] = arg2;
							field1100[field971] = arg1;
							field971++;
						}
					}
				}

				if (arg3.field753 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg3.field753[var7] != null && arg3.field753[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg3.field758 > field1285.field327) {
								var8 = 2000;
							}

							field1132[field971] = arg3.field753[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1101[field971] = var8 + 988;
							}

							if (var7 == 1) {
								field1101[field971] = var8 + 345;
							}

							if (var7 == 2) {
								field1101[field971] = var8 + 249;
							}

							if (var7 == 3) {
								field1101[field971] = var8 + 960;
							}

							if (var7 == 4) {
								field1101[field971] = var8 + 40;
							}

							field1102[field971] = arg0;
							field1099[field971] = arg2;
							field1100[field971] = arg1;
							field971++;
						}
					}
				}

				field1132[field971] = "Examine @yel@" + var5;
				field1101[field971] = 1814;
				field1102[field971] = arg0;
				field1099[field971] = arg2;
				field1100[field971] = arg1;
				field971++;
			} else if ((field1296 & 0x2) == 2) {
				field1132[field971] = field1297 + " @yel@" + var5;
				field1101[field971] = 500;
				field1102[field971] = arg0;
				field1099[field971] = arg2;
				field1100[field971] = arg1;
				field971++;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method447(int arg0, int arg1) {
		if (field1196 != 0) {
			int var3 = 0;
			if (field1028 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field958[var4] != null) {
					int var5 = field956[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field1068 == 0 || field1068 == 1 && method444(field957[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field15 > 8 && field15 < 520 && arg0 - 11 > var6 - 10 && arg0 - 11 <= var6 + 3) {
							if (field1321) {
								field1132[field971] = "Report abuse @whi@" + field957[var4];
								field1101[field971] = 2316;
								field971++;
							}

							field1132[field971] = "Add ignore @whi@" + field957[var4];
							field1101[field971] = 2158;
							field971++;
							field1132[field971] = "Add friend @whi@" + field957[var4];
							field1101[field971] = 2447;
							field971++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field1068 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method448() {
		if (field1301 == null) {
			field9 = null;
			field1284 = null;
			field1282 = null;
			field1281 = null;
			field1283 = null;
			field1177 = null;
			field1178 = null;
			field1179 = null;
			field1304 = new class43(128, method11(), 265);
			class32.method148();
			field1305 = new class43(128, method11(), 265);
			class32.method148();
			field1301 = new class43(533, method11(), 186);
			class32.method148();
			field1302 = new class43(360, method11(), 146);
			class32.method148();
			field1303 = new class43(360, method11(), 200);
			class32.method148();
			field1306 = new class43(214, method11(), 267);
			class32.method148();
			field1307 = new class43(215, method11(), 267);
			class32.method148();
			field1308 = new class43(86, method11(), 79);
			class32.method148();
			field1309 = new class43(87, method11(), 79);
			class32.method148();

			if (field1156 != null) {
				method480();
				method428();
			}

			field1278 = true;
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 217);

			if (arg0.length == 4) {
				field1157 = Integer.parseInt(arg0[0]);
				field1158 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method393();
				} else if (arg0[2].equals("highmem")) {
					method457();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					field1159 = false;
				} else if (arg0[3].equals("members")) {
					field1159 = true;
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

	@ObfuscatedName("client.e(II)V")
	public final void method449(int arg0) {
		int[] var2 = field1217.field515;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1126[arg0][var7][var5] & 0x18) == 0) {
					field1014.method86(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1126[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1014.method86(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field1217.method170();

		for (int var8 = 1; var8 < 103; var8++) {
			for (int var9 = 1; var9 < 103; var9++) {
				if ((field1126[arg0][var9][var8] & 0x18) == 0) {
					method454(var9, arg0, var8);
				}

				if (arg0 < 3 && (field1126[arg0 + 1][var9][var8] & 0x8) != 0) {
					method454(var9, arg0 + 1, var8);
				}
			}
		}

		field1283.method235();
		field980 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = field1014.method80(field1334, var10, var11);
				if (var12 != 0) {
					var12 = var12 >> 14 & 0x7FFF;
					int var13 = class53.method275(var12).field720;
					if (var13 >= 0) {
						field1240[field980] = field1143[var13];
						field981[field980] = var10;
						field982[field980] = var11;
						field980++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method450() {
		field1333 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1071) {
				method408();
				method408();
				method462();
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

		field1333 = false;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ZILjava/lang/String;)Lub;")
	public final class47 method451(int arg0, String arg1, int arg2, String arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg3);
		if (var6 != null) {
			field1094.reset();
			field1094.update(var6);
			int var7 = (int) field1094.getValue();
			if (arg2 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class47(var6);
		}

		while (var6 == null) {
			method13("Requesting " + arg1, arg0);

			try {
				int var9 = 0;
				DataInputStream var10 = method469(arg3 + arg2);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				class37 var12 = new class37(var11);
				var12.field540 = 3;
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
						method13("Loading " + arg1 + " - " + var17 + "%", arg0);
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					method13("Error loading - Will retry in " + var18 + " secs.", arg0);

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

	@ObfuscatedName("client.y(I)V")
	public final void method452() {
		if (field1285.field268 >> 7 == field1215 && field1285.field269 >> 7 == field1216) {
			field1215 = 0;
		}

		for (int var1 = -1; var1 < field963; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1285;
				var3 = field961 << 14;
			} else {
				var2 = field962[field964[var1]];
				var3 = field964[var1] << 14;
			}

			if (var2 != null && var2.method111()) {
				var2.field340 = false;
				if ((field1160 && field963 > 50 || field963 > 200) && var1 != -1 && var2.field292 == var2.field273) {
					var2.field340 = true;
				}

				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field335 == null || field1320 < var2.field330 || field1320 >= var2.field331) {
						if ((var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
							if (field1034[var4][var5] == field1039) {
								continue;
							}

							field1034[var4][var5] = field1039;
						}

						var2.field329 = method420(var2.field268, var2.field269, field1334);
						field1014.method61(null, var2.field329, var3, var2.field269, var2.field270, 60, var2.field271, var2.field268, var2, field1334);
					} else {
						var2.field340 = false;
						var2.field329 = method420(var2.field268, var2.field269, field1334);
						field1014.method62(var2.field270, var2.field339, field1334, var2.field336, var2.field338, null, var2.field268, var2, var2.field337, 60, var2.field329, var3, var2.field269);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method453() {
		field1016.method198(153);

		if (field1141 != -1) {
			field1141 = -1;
			field1018 = true;
			field1166 = false;
			field978 = true;
		}

		if (field1248 != -1) {
			field1248 = -1;
			field986 = true;
			field1166 = false;
		}

		field1098 = -1;
	}

	@ObfuscatedName("client.a(IIIB)V")
	public final void method454(int arg0, int arg1, int arg2) {
		int var4 = field1014.method77(arg1, arg0, arg2);
		if (var4 != 0) {
			int var5 = field1014.method81(arg1, arg0, arg2, var4);
			int var6 = var5 >> 6 & 0x3;
			int var7 = var5 & 0x1F;
			int var8 = 0xEEEEEE;
			if (var4 > 0) {
				var8 = 0xEE0000;
			}

			int[] var9 = field1217.field515;
			int var10 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
			int var11 = var4 >> 14 & 0x7FFF;
			class53 var12 = class53.method275(var11);
			if (var12.field721 == -1) {
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
				class35 var13 = field1181[var12.field721];
				if (var13 != null) {
					int var14 = (var12.field706 * 4 - var13.field524) / 2;
					int var15 = (var12.field707 * 4 - var13.field525) / 2;
					var13.method186((104 - arg2 - var12.field707) * 4 + var15 + 48, arg0 * 4 + 48 + var14);
				}
			}
		}

		int var16 = field1014.method79(arg1, arg0, arg2);
		if (var16 != 0) {
			int var17 = field1014.method81(arg1, arg0, arg2, var16);
			int var18 = var17 >> 6 & 0x3;
			int var19 = var17 & 0x1F;
			int var20 = var16 >> 14 & 0x7FFF;
			class53 var21 = class53.method275(var20);
			if (var21.field721 != -1) {
				class35 var22 = field1181[var21.field721];
				if (var22 != null) {
					int var23 = (var21.field706 * 4 - var22.field524) / 2;
					int var24 = (var21.field707 * 4 - var22.field525) / 2;
					var22.method186((104 - arg2 - var21.field707) * 4 + var24 + 48, arg0 * 4 + 48 + var23);
				}
			} else if (var19 == 9) {
				int var25 = 0xEEEEEE;
				if (var16 > 0) {
					var25 = 0xEE0000;
				}

				int[] var26 = field1217.field515;
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

		int var28 = field1014.method80(arg1, arg0, arg2);
		if (var28 != 0) {
			int var29 = var28 >> 14 & 0x7FFF;
			class53 var30 = class53.method275(var29);
			if (var30.field721 != -1) {
				class35 var31 = field1181[var30.field721];
				if (var31 != null) {
					int var32 = (var30.field706 * 4 - var31.field524) / 2;
					int var33 = (var30.field707 * 4 - var31.field525) / 2;
					var31.method186((104 - arg2 - var30.field707) * 4 + var33 + 48, arg0 * 4 + 48 + var32);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLhc;)Z")
	public final boolean method455(class60 arg0) {
		int var2 = arg0.field838;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1132[field971] = "Remove @whi@" + field1092[var2];
			field1101[field971] = 804;
			field971++;
			field1132[field971] = "Message @whi@" + field1092[var2];
			field1101[field971] = 125;
			field971++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1132[field971] = "Remove @whi@" + arg0.field868;
			field1101[field971] = 521;
			field971++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(IJ)V")
	public final void method456(long arg0) {
		if (arg0 != 0L) {
			if (field1070 >= 100) {
				method382(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field1070; var4++) {
					if (field1264[var4] == arg0) {
						method382(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1192; var5++) {
					if (field1328[var5] == arg0) {
						method382(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1264[field1070++] = arg0;
				field1018 = true;
				field1016.method198(175);
				field1016.method205(arg0);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public static final void method457() {
		class18.field194 = false;
		class33.field492 = false;
		field1160 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method458(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;II)V")
	public final void method459(int arg0, String arg1, int arg2) {
		if (arg1 != null) {
			synchronized (field996) {
				field1298 = arg1;
				field1079 = arg0;
				field1130 = arg2;
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method460() {
		if (field1043 == 2) {
			for (class39 var1 = (class39) field992.method228(); var1 != null; var1 = (class39) field992.method230()) {
				if (field1320 >= var1.field568) {
					method376(var1.field566, var1.field563, var1.field564, var1.field565, var1.field561, var1.field567, var1.field562);
					var1.method107();
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method461(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1070; var3++) {
				if (field1264[var3] == arg0) {
					field1070--;
					field1018 = true;

					for (int var4 = var3; var4 < field1070; var4++) {
						field1264[var4] = field1264[var4 + 1];
					}

					field1016.method198(68);
					field1016.method205(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method462() {
		short var1 = 256;

		if (field1326 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1326 > 768) {
					field1167[var2] = method458(1024 - field1326, field1169[var2], field1168[var2]);
				} else if (field1326 > 256) {
					field1167[var2] = field1169[var2];
				} else {
					field1167[var2] = method458(256 - field1326, field1168[var2], field1169[var2]);
				}
			}
		} else if (field1327 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1327 > 768) {
					field1167[var3] = method458(1024 - field1327, field1170[var3], field1168[var3]);
				} else if (field1327 > 256) {
					field1167[var3] = field1170[var3];
				} else {
					field1167[var3] = method458(256 - field1327, field1168[var3], field1170[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1167[var4] = field1168[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1304.field580[var5] = field1123.field515[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1072[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1133[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1167[var12];
					int var15 = field1304.field580[var7];
					field1304.field580[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1304.method236(0, 0, field8);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1305.field580[var16] = field1124.field515[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1072[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1133[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1167[var23];
					int var26 = field1305.field580[var18];
					field1305.field580[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1305.method236(0, 661, field8);
	}

	@ObfuscatedName("client.B(I)V")
	public final void method463() {
		field1253 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1176[var1] = -1;
			for (int var2 = 0; var2 < class59.field821; var2++) {
				if (!class59.field822[var2].field828 && class59.field822[var2].field823 == var1 + (field1038 ? 0 : 7)) {
					field1176[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method464(int arg0, int arg1) {
		boolean var3 = false;
		class60 var4 = class60.field829[arg0];
		for (int var5 = 0; var5 < var4.field850.length && var4.field850[var5] != -1; var5++) {
			class60 var6 = class60.field829[var4.field850[var5]];
			if (var6.field836 == 1) {
				var3 |= method464(var6.field834, arg1);
			}

			if (var6.field836 == 6 && (var6.field877 != -1 || var6.field878 != -1)) {
				boolean var7 = method404(var6);
				int var8;
				if (var7) {
					var8 = var6.field878;
				} else {
					var8 = var6.field877;
				}

				if (var8 != -1) {
					class62 var9 = class62.field895[var8];
					var6.field833 += arg1;
					while (var6.field833 > var9.field899[var6.field832]) {
						var6.field833 -= var9.field899[var6.field832] + 1;
						var6.field832++;
						if (var6.field832 >= var9.field896) {
							var6.field832 -= var9.field900;
							if (var6.field832 < 0 || var6.field832 >= var9.field896) {
								var6.field832 = 0;
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
	public final void method465() {
		try {
			if (field1193 != null) {
				field1193.method29();
			}
		} catch (Exception var2) {
		}

		field1193 = null;
		field1279 = false;
		field977 = 0;
		field1198 = "";
		field1199 = "";
		class5.method35(false);
		method466();
		field1014.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1293[var1].method295();
		}

		System.gc();
		method470();
		field1313 = null;
		field1164 = 0;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field11 != null) {
			return field11;
		}

		return this;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method466() {
		class53.field732.method104();
		class53.field733.method104();
		class54.field761.method104();
		class55.field800.method104();
		class55.field801.method104();
		class26.field341.method104();
		class63.field920.method104();
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://127.0.0.1:" + (field1158 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(BLkb;IILz;)V")
	public final void method467(class37 arg0, int arg1, int arg2, class26 arg3) {
		if ((arg1 & 0x1) == 1) {
			int var5 = arg0.method209();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg0.method218(0, var5, var6);
			field967[arg2] = var7;
			arg3.method113(var7);
		}

		if ((arg1 & 0x2) == 2) {
			int var8 = arg0.method211();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg3.field295 == var8) {
				arg3.field299 = 0;
			}

			int var9 = arg0.method209();
			if (var8 == -1 || arg3.field295 == -1 || class62.field895[var8].field903 > class62.field895[arg3.field295].field903 || class62.field895[arg3.field295].field903 == 0) {
				arg3.field295 = var8;
				arg3.field296 = 0;
				arg3.field297 = 0;
				arg3.field298 = var9;
				arg3.field299 = 0;
			}
		}

		if ((arg1 & 0x4) == 4) {
			arg3.field289 = arg0.method211();
			if (arg3.field289 == 0xFFFF) {
				arg3.field289 = -1;
			}
		}

		if ((arg1 & 0x8) == 8) {
			arg3.field280 = arg0.method216();
			arg3.field282 = 0;
			arg3.field283 = 0;
			arg3.field281 = 150;
			method382(2, arg3.field321, arg3.field280);
		}

		if ((arg1 & 0x10) == 0x10) {
			arg3.field284 = arg0.method209();
			arg3.field285 = arg0.method209();
			arg3.field286 = field1320 + 400;
			arg3.field287 = arg0.method209();
			arg3.field288 = arg0.method209();
		}

		if ((arg1 & 0x20) == 0x20) {
			arg3.field290 = arg0.method211();
			arg3.field291 = arg0.method211();
		}

		if ((arg1 & 0x40) == 0x40) {
			int var10 = arg0.method211();
			int var11 = arg0.method209();
			int var12 = arg0.method209();
			int var13 = arg0.field540;

			if (arg3.field321 != null) {
				long var14 = class48.method251(arg3.field321);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1070; var17++) {
						if (field1264[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1325 == 0) {
					try {
						String var18 = class49.method258(var12, arg0);
						var18 = class65.method335(var18);
						arg3.field280 = var18;
						arg3.field282 = var10 >> 8;
						arg3.field283 = var10 & 0xFF;
						arg3.field281 = 150;

						if (var11 > 1) {
							method382(1, arg3.field321, var18);
						} else {
							method382(2, arg3.field321, var18);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field540 = var12 + var13;
		}

		if ((arg1 & 0x100) == 0x100) {
			arg3.field300 = arg0.method211();
			int var20 = arg0.method214();
			arg3.field304 = var20 >> 16;
			arg3.field303 = (var20 & 0xFFFF) + field1320;
			arg3.field301 = 0;
			arg3.field302 = 0;

			if (arg3.field303 > field1320) {
				arg3.field301 = -1;
			}

			if (arg3.field300 == 0xFFFF) {
				arg3.field300 = -1;
			}
		}

		if ((arg1 & 0x200) == 0x200) {
			arg3.field305 = arg0.method209();
			arg3.field307 = arg0.method209();
			arg3.field306 = arg0.method209();
			arg3.field308 = arg0.method209();
			arg3.field309 = arg0.method211() + field1320;
			arg3.field310 = arg0.method211() + field1320;
			arg3.field311 = arg0.method209();
			arg3.field315 = 0;
			arg3.field316[0] = arg3.field306;
			arg3.field317[0] = arg3.field308;
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = class31.field478[var7];
			int var13 = class31.field479[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field478[var8];
			int var16 = class31.field479[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1145 = arg0 - var9;
		field1146 = arg1 - var10;
		field1147 = arg5 - var11;
		field1148 = arg4;
		field1149 = arg2;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method469(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.o(B)V")
	public final void method470() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.p(B)V")
	public final void method471() {
		if (field1196 != 0) {
			class36 var1 = field1255;
			int var2 = 0;
			if (field1028 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field958[var3] != null) {
					int var4 = field956[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1068 == 0 || field1068 == 1 && method444(field957[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method191(var5, "From " + field957[var3] + ": " + field958[var3], 4, 0);
						var1.method191(var5 - 1, "From " + field957[var3] + ": " + field958[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1068 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method191(var6, field958[var3], 4, 0);
						var1.method191(var6 - 1, field958[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1068 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method191(var7, "To " + field957[var3] + ": " + field958[var3], 4, 0);
						var1.method191(var7 - 1, "To " + field957[var3] + ": " + field958[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method472() {
		for (int var1 = 0; var1 < field1030; var1++) {
			int var2 = field1031[var1];
			class25 var3 = field1029[var2];
			if (var3 != null) {
				method473(var3, var3.field320.field742);
			}
		}
	}

	@ObfuscatedName("client.a(ZLx;I)V")
	public final void method473(class24 arg0, int arg1) {
		if (arg0.field268 < 128 || arg0.field269 < 128 || arg0.field268 >= 13184 || arg0.field269 >= 13184) {
			arg0.field295 = -1;
			arg0.field300 = -1;
			arg0.field309 = 0;
			arg0.field310 = 0;
			arg0.field268 = arg0.field316[0] * 128 + arg0.field272 * 64;
			arg0.field269 = arg0.field317[0] * 128 + arg0.field272 * 64;
			arg0.field315 = 0;
		}

		if (field1285 == arg0 && (arg0.field268 < 1536 || arg0.field269 < 1536 || arg0.field268 >= 11776 || arg0.field269 >= 11776)) {
			arg0.field295 = -1;
			arg0.field300 = -1;
			arg0.field309 = 0;
			arg0.field310 = 0;
			arg0.field268 = arg0.field316[0] * 128 + arg0.field272 * 64;
			arg0.field269 = arg0.field317[0] * 128 + arg0.field272 * 64;
			arg0.field315 = 0;
		}

		if (arg0.field309 > field1320) {
			method474(arg0);
		} else if (arg0.field310 >= field1320) {
			method475(arg0);
		} else {
			method476(arg0);
		}

		method477(arg0);
		method478(arg0);
	}

	@ObfuscatedName("client.a(Lx;I)V")
	public final void method474(class24 arg0) {
		int var2 = arg0.field309 - field1320;
		int var3 = arg0.field305 * 128 + arg0.field272 * 64;
		int var4 = arg0.field307 * 128 + arg0.field272 * 64;
		arg0.field268 += (var3 - arg0.field268) / var2;
		arg0.field269 += (var4 - arg0.field269) / var2;
		arg0.field319 = 0;

		if (arg0.field311 == 0) {
			arg0.field314 = 1024;
		}

		if (arg0.field311 == 1) {
			arg0.field314 = 1536;
		}

		if (arg0.field311 == 2) {
			arg0.field314 = 0;
		}

		if (arg0.field311 == 3) {
			arg0.field314 = 512;
		}
	}

	@ObfuscatedName("client.a(ILx;)V")
	public final void method475(class24 arg0) {
		if (field1320 == arg0.field310 || arg0.field295 == -1 || arg0.field298 != 0 || arg0.field297 + 1 > class62.field895[arg0.field295].field899[arg0.field296]) {
			int var2 = arg0.field310 - arg0.field309;
			int var3 = field1320 - arg0.field309;
			int var4 = arg0.field305 * 128 + arg0.field272 * 64;
			int var5 = arg0.field307 * 128 + arg0.field272 * 64;
			int var6 = arg0.field306 * 128 + arg0.field272 * 64;
			int var7 = arg0.field308 * 128 + arg0.field272 * 64;
			arg0.field268 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field269 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field319 = 0;

		if (arg0.field311 == 0) {
			arg0.field314 = 1024;
		}

		if (arg0.field311 == 1) {
			arg0.field314 = 1536;
		}

		if (arg0.field311 == 2) {
			arg0.field314 = 0;
		}

		if (arg0.field311 == 3) {
			arg0.field314 = 512;
		}

		arg0.field270 = arg0.field314;
	}

	@ObfuscatedName("client.b(Lx;I)V")
	public final void method476(class24 arg0) {
		arg0.field292 = arg0.field273;
		if (arg0.field315 == 0) {
			arg0.field319 = 0;
		} else {
			if (arg0.field295 != -1 && arg0.field298 == 0) {
				class62 var2 = class62.field895[arg0.field295];
				if (var2.field901 == null) {
					arg0.field319++;
					return;
				}
			}

			int var3 = arg0.field268;
			int var4 = arg0.field269;
			int var5 = arg0.field316[arg0.field315 - 1] * 128 + arg0.field272 * 64;
			int var6 = arg0.field317[arg0.field315 - 1] * 128 + arg0.field272 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field314 = 1280;
					} else if (var4 > var6) {
						arg0.field314 = 1792;
					} else {
						arg0.field314 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field314 = 768;
					} else if (var4 > var6) {
						arg0.field314 = 256;
					} else {
						arg0.field314 = 512;
					}
				} else if (var4 < var6) {
					arg0.field314 = 1024;
				} else {
					arg0.field314 = 0;
				}

				int var7 = arg0.field314 - arg0.field270 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field276;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field275;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field278;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field277;
				}

				if (var8 == -1) {
					var8 = arg0.field275;
				}

				arg0.field292 = var8;
				int var9 = 4;
				if (arg0.field314 != arg0.field270 && arg0.field289 == -1) {
					var9 = 2;
				}

				if (arg0.field315 > 2) {
					var9 = 6;
				}

				if (arg0.field315 > 3) {
					var9 = 8;
				}

				if (arg0.field319 > 0 && arg0.field315 > 1) {
					var9 = 8;
					arg0.field319--;
				}

				if (arg0.field318[arg0.field315 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field292 == arg0.field275 && arg0.field279 != -1) {
					arg0.field292 = arg0.field279;
				}

				if (var3 < var5) {
					arg0.field268 += var9;
					if (arg0.field268 > var5) {
						arg0.field268 = var5;
					}
				} else if (var3 > var5) {
					arg0.field268 -= var9;
					if (arg0.field268 < var5) {
						arg0.field268 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field269 += var9;
					if (arg0.field269 > var6) {
						arg0.field269 = var6;
					}
				} else if (var4 > var6) {
					arg0.field269 -= var9;
					if (arg0.field269 < var6) {
						arg0.field269 = var6;
					}
				}

				if (arg0.field268 == var5 && arg0.field269 == var6) {
					arg0.field315--;
				}
			} else {
				arg0.field268 = var5;
				arg0.field269 = var6;
			}
		}
	}

	@ObfuscatedName("client.c(Lx;I)V")
	public final void method477(class24 arg0) {
		if (arg0.field289 != -1 && arg0.field289 < 32768) {
			class25 var2 = field1029[arg0.field289];
			if (var2 != null) {
				int var3 = arg0.field268 - var2.field268;
				int var4 = arg0.field269 - var2.field269;
				if (var3 != 0 || var4 != 0) {
					arg0.field314 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field289 >= 32768) {
			int var5 = arg0.field289 - 32768;
			if (field1027 == var5) {
				var5 = field961;
			}

			class26 var6 = field962[var5];
			if (var6 != null) {
				int var7 = arg0.field268 - var6.field268;
				int var8 = arg0.field269 - var6.field269;
				if (var7 != 0 || var8 != 0) {
					arg0.field314 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field290 != 0 || arg0.field291 != 0) && (arg0.field315 == 0 || arg0.field319 > 0)) {
			int var9 = arg0.field268 - (arg0.field290 - field1242 - field1242) * 64;
			int var10 = arg0.field269 - (arg0.field291 - field1243 - field1243) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field314 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field290 = 0;
			arg0.field291 = 0;
		}

		int var11 = arg0.field314 - arg0.field270 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field270 = arg0.field314;
			} else if (var11 > 1024) {
				arg0.field270 -= 32;
			} else {
				arg0.field270 += 32;
			}

			arg0.field270 &= 0x7FF;
			if (arg0.field292 == arg0.field273 && arg0.field314 != arg0.field270) {
				if (arg0.field274 != -1) {
					arg0.field292 = arg0.field274;
					return;
				}

				arg0.field292 = arg0.field275;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lx;B)V")
	public final void method478(class24 arg0) {
		arg0.field271 = false;

		if (arg0.field292 != -1) {
			class62 var2 = class62.field895[arg0.field292];
			arg0.field294++;
			if (arg0.field293 < var2.field896 && arg0.field294 > var2.field899[arg0.field293]) {
				arg0.field294 = 0;
				arg0.field293++;
			}

			if (arg0.field293 >= var2.field896) {
				arg0.field294 = 0;
				arg0.field293 = 0;
			}
		}

		if (arg0.field295 != -1 && arg0.field298 == 0) {
			class62 var3 = class62.field895[arg0.field295];
			arg0.field297++;
			while (arg0.field296 < var3.field896 && arg0.field297 > var3.field899[arg0.field296]) {
				arg0.field297 -= var3.field899[arg0.field296];
				arg0.field296++;
			}

			if (arg0.field296 >= var3.field896) {
				arg0.field296 -= var3.field900;
				arg0.field299++;
				if (arg0.field299 >= var3.field906) {
					arg0.field295 = -1;
				}

				if (arg0.field296 < 0 || arg0.field296 >= var3.field896) {
					arg0.field295 = -1;
				}
			}

			arg0.field271 = var3.field902;
		}

		if (arg0.field298 > 0) {
			arg0.field298--;
		}

		if (arg0.field300 != -1 && field1320 >= arg0.field303) {
			if (arg0.field301 < 0) {
				arg0.field301 = 0;
			}

			class62 var4 = class63.field908[arg0.field300].field911;
			arg0.field302++;
			while (arg0.field301 < var4.field896 && arg0.field302 > var4.field899[arg0.field301]) {
				arg0.field302 -= var4.field899[arg0.field301];
				arg0.field301++;
			}

			if (arg0.field301 >= var4.field896) {
				if (arg0.field301 < 0 || arg0.field301 >= var4.field896) {
					arg0.field300 = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method479() {
		if (field1278) {
			field1278 = false;
			field1107.method236(11, 0, field8);
			field1108.method236(375, 0, field8);
			field1109.method236(5, 729, field8);
			field1110.method236(231, 752, field8);
			field1111.method236(0, 0, field8);
			field1112.method236(0, 561, field8);
			field1113.method236(11, 520, field8);
			field1114.method236(231, 520, field8);
			field1115.method236(375, 501, field8);
			field1116.method236(345, 0, field8);
			field1018 = true;
			field986 = true;
			field978 = true;
			field1105 = true;

			if (field1043 != 2) {
				field1283.method236(11, 8, field8);
				field1282.method236(5, 561, field8);
			}
		}

		if (field1043 == 2) {
			method367();
		}

		if (field1180 && field1227 == 1) {
			field1018 = true;
		}

		if (field1141 != -1) {
			boolean var1 = method464(field1141, field1239);
			if (var1) {
				field1018 = true;
			}
		}

		if (field1175 == 2) {
			field1018 = true;
		}

		if (field1203 == 2) {
			field1018 = true;
		}

		if (field1018) {
			method391();
			field1018 = false;
		}

		if (field1248 == -1) {
			field1332.field848 = field1250 - field1125 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method400(0, field1250, field15 - 22, field1332, field16 - 375, 77, 463, false);
			}

			int var2 = field1250 - field1332.field848 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1250 - 77) {
				var2 = field1250 - 77;
			}

			if (field1125 != var2) {
				field1125 = var2;
				field986 = true;
			}

			field1129++;
			if (field1129 > 87) {
				field1129 = 0;
				field1016.method198(225);
			}
		}

		if (field1248 != -1) {
			boolean var3 = method464(field1248, field1239);
			if (var3) {
				field986 = true;
			}
		}

		if (field1175 == 3) {
			field986 = true;
		}

		if (field1203 == 3) {
			field986 = true;
		}

		if (field1103 != null) {
			field986 = true;
		}

		if (field1180 && field1227 == 2) {
			field986 = true;
		}

		if (field986) {
			method419();
			field986 = false;
		}

		if (field1043 == 2) {
			method394();
			field1282.method236(5, 561, field8);
		}

		if (field950 != -1) {
			field978 = true;
		}

		if (field978) {
			if (field950 != -1 && field950 == field1066) {
				field950 = -1;
				field1016.method198(50);
				field1016.method199(field1066);
			}

			field978 = false;
			field1179.method235();
			field1003.method186(0, 0);

			if (field1141 == -1) {
				if (field1087[field1066] != -1) {
					if (field1066 == 0) {
						field1266.method186(30, 29);
					}

					if (field1066 == 1) {
						field1267.method186(29, 59);
					}

					if (field1066 == 2) {
						field1267.method186(29, 87);
					}

					if (field1066 == 3) {
						field1268.method186(29, 115);
					}

					if (field1066 == 4) {
						field1270.method186(29, 156);
					}

					if (field1066 == 5) {
						field1270.method186(29, 184);
					}

					if (field1066 == 6) {
						field1269.method186(30, 212);
					}
				}

				if (field1087[0] != -1 && (field950 != 0 || field1320 % 20 < 10)) {
					field1086[0].method186(34, 35);
				}

				if (field1087[1] != -1 && (field950 != 1 || field1320 % 20 < 10)) {
					field1086[1].method186(32, 59);
				}

				if (field1087[2] != -1 && (field950 != 2 || field1320 % 20 < 10)) {
					field1086[2].method186(32, 86);
				}

				if (field1087[3] != -1 && (field950 != 3 || field1320 % 20 < 10)) {
					field1086[3].method186(33, 121);
				}

				if (field1087[4] != -1 && (field950 != 4 || field1320 % 20 < 10)) {
					field1086[4].method186(34, 157);
				}

				if (field1087[5] != -1 && (field950 != 5 || field1320 % 20 < 10)) {
					field1086[5].method186(32, 185);
				}

				if (field1087[6] != -1 && (field950 != 6 || field1320 % 20 < 10)) {
					field1086[6].method186(34, 212);
				}
			}

			field1179.method236(165, 520, field8);
			field1178.method235();
			field1002.method186(0, 0);

			if (field1141 == -1) {
				if (field1087[field1066] != -1) {
					if (field1066 == 7) {
						field1004.method186(0, 49);
					}

					if (field1066 == 8) {
						field1005.method186(0, 81);
					}

					if (field1066 == 9) {
						field1005.method186(0, 108);
					}

					if (field1066 == 10) {
						field1006.method186(1, 136);
					}

					if (field1066 == 11) {
						field1008.method186(0, 178);
					}

					if (field1066 == 12) {
						field1008.method186(0, 205);
					}

					if (field1066 == 13) {
						field1007.method186(0, 233);
					}
				}

				if (field1087[8] != -1 && (field950 != 8 || field1320 % 20 < 10)) {
					field1086[7].method186(2, 80);
				}

				if (field1087[9] != -1 && (field950 != 9 || field1320 % 20 < 10)) {
					field1086[8].method186(3, 107);
				}

				if (field1087[10] != -1 && (field950 != 10 || field1320 % 20 < 10)) {
					field1086[9].method186(4, 142);
				}

				if (field1087[11] != -1 && (field950 != 11 || field1320 % 20 < 10)) {
					field1086[10].method186(2, 179);
				}

				if (field1087[12] != -1 && (field950 != 12 || field1320 % 20 < 10)) {
					field1086[11].method186(2, 206);
				}

				if (field1087[13] != -1 && (field950 != 13 || field1320 % 20 < 10)) {
					field1086[12].method186(2, 230);
				}
			}

			field1178.method236(492, 501, field8);
			field1283.method235();
		}

		if (field1105) {
			field1105 = false;
			field1177.method235();
			field1001.method186(0, 0);
			field1255.method189("Public chat", 33, 0xFFFFFF, true, 57);

			if (field993 == 0) {
				field1255.method189("On", 46, 0xFF00, true, 57);
			}

			if (field993 == 1) {
				field1255.method189("Friends", 46, 0xFFFF00, true, 57);
			}

			if (field993 == 2) {
				field1255.method189("Off", 46, 0xFF0000, true, 57);
			}

			if (field993 == 3) {
				field1255.method189("Hide", 46, 0xFFFF, true, 57);
			}

			field1255.method189("Private chat", 33, 0xFFFFFF, true, 186);

			if (field1068 == 0) {
				field1255.method189("On", 46, 0xFF00, true, 186);
			}

			if (field1068 == 1) {
				field1255.method189("Friends", 46, 0xFFFF00, true, 186);
			}

			if (field1068 == 2) {
				field1255.method189("Off", 46, 0xFF0000, true, 186);
			}

			field1255.method189("Trade/duel", 33, 0xFFFFFF, true, 326);

			if (field1155 == 0) {
				field1255.method189("On", 46, 0xFF00, true, 326);
			}

			if (field1155 == 1) {
				field1255.method189("Friends", 46, 0xFFFF00, true, 326);
			}

			if (field1155 == 2) {
				field1255.method189("Off", 46, 0xFF0000, true, 326);
			}

			field1255.method189("Report abuse", 38, 0xFFFFFF, true, 462);
			field1177.method236(471, 0, field8);
			field1283.method235();
		}

		field1239 = 0;
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method480() {
		byte[] var1 = field1156.method250("title.dat", null);
		class34 var2 = new class34(var1, this);
		field1304.method235();
		var2.method171(0, 0);
		field1305.method235();
		var2.method171(0, -661);
		field1301.method235();
		var2.method171(0, -128);
		field1302.method235();
		var2.method171(-386, -214);
		field1303.method235();
		var2.method171(-186, -214);
		field1306.method235();
		var2.method171(-265, 0);
		field1307.method235();
		var2.method171(-265, -574);
		field1308.method235();
		var2.method171(-186, -128);
		field1309.method235();
		var2.method171(-186, -574);
		int[] var3 = new int[var2.field516];
		for (int var4 = 0; var4 < var2.field517; var4++) {
			for (int var5 = 0; var5 < var2.field516; var5++) {
				var3[var5] = var2.field515[var2.field516 * var4 + var2.field516 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field516; var6++) {
				var2.field515[var2.field516 * var4 + var6] = var3[var6];
			}
		}

		field1304.method235();
		var2.method171(0, 394);
		field1305.method235();
		var2.method171(0, -267);
		field1301.method235();
		var2.method171(0, 266);
		field1302.method235();
		var2.method171(-386, 180);
		field1303.method235();
		var2.method171(-186, 180);
		field1306.method235();
		var2.method171(-265, 394);
		field1307.method235();
		var2.method171(-265, -180);
		field1308.method235();
		var2.method171(-186, 212);
		field1309.method235();
		var2.method171(-186, -180);
		class34 var7 = new class34(field1156, "logo", 0);
		field1301.method235();
		var7.method173(18, field6 / 2 - var7.field516 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field1135 && !field1069 && !field1292) {
			field1320++;

			if (field1279) {
				method390();
			} else {
				method411();
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method481() {
		int var1 = field1256.method190("Choose Option");
		for (int var2 = 0; var2 < field971; var2++) {
			int var3 = field1256.method190(field1132[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field971 * 15 + 21;
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

			field1180 = true;
			field1227 = 0;
			field1228 = var5;
			field1229 = var6;
			field1230 = var1;
			field1231 = field971 * 15 + 22;
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

			field1180 = true;
			field1227 = 1;
			field1228 = var7;
			field1229 = var8;
			field1230 = var1;
			field1231 = field971 * 15 + 22;
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

			field1180 = true;
			field1227 = 2;
			field1228 = var9;
			field1229 = var10;
			field1230 = var1;
			field1231 = field971 * 15 + 22;
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method482() {
		if (field971 >= 2 || field1061 != 0 || field1294 != 0) {
			String var1;
			if (field1061 == 1 && field971 < 2) {
				var1 = "Use " + field1065 + " with...";
			} else if (field1294 == 1 && field971 < 2) {
				var1 = field1297 + "...";
			} else {
				var1 = field1132[field971 - 1];
			}

			if (field971 > 2) {
				var1 = var1 + "@whi@ / " + (field971 - 2) + " more options";
			}

			field1256.method193(var1, 0xFFFFFF, 4, true, 15);
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method483(int arg0) {
		class60 var2 = class60.field829[arg0];
		for (int var3 = 0; var3 < var2.field850.length && var2.field850[var3] != -1; var3++) {
			class60 var4 = class60.field829[var2.field850[var3]];
			if (var4.field836 == 1) {
				method483(var4.field834);
			}

			var4.field832 = 0;
			var4.field833 = 0;
		}
	}

	@ObfuscatedName("client.b(ZII)V")
	public final void method484(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field958[var4] != null) {
				int var5 = field956[var4];
				int var6 = field1125 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field993 == 0 || field993 == 1 && method444(field957[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !field957[var4].equals(field1285.field321)) {
						if (field1321) {
							field1132[field971] = "Report abuse @whi@" + field957[var4];
							field1101[field971] = 316;
							field971++;
						}

						field1132[field971] = "Add ignore @whi@" + field957[var4];
						field1101[field971] = 158;
						field971++;
						field1132[field971] = "Add friend @whi@" + field957[var4];
						field1101[field971] = 447;
						field971++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1196 == 0 && (var5 == 7 || field1068 == 0 || field1068 == 1 && method444(field957[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1321) {
							field1132[field971] = "Report abuse @whi@" + field957[var4];
							field1101[field971] = 316;
							field971++;
						}

						field1132[field971] = "Add ignore @whi@" + field957[var4];
						field1101[field971] = 158;
						field971++;
						field1132[field971] = "Add friend @whi@" + field957[var4];
						field1101[field971] = 447;
						field971++;
					}

					var3++;
				}

				if (var5 == 4 && (field1155 == 0 || field1155 == 1 && method444(field957[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1132[field971] = "Accept trade @whi@" + field957[var4];
						field1101[field971] = 595;
						field971++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1196 == 0 && field1068 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1155 == 0 || field1155 == 1 && method444(field957[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1132[field971] = "Accept duel @whi@" + field957[var4];
						field1101[field971] = 835;
						field971++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method485(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IZIIIIIIIIII)Z")
	public final boolean method486(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1075[var14][var15] = 0;
				field972[var14][var15] = 99999999;
			}
		}

		int var16 = arg3;
		int var17 = arg5;
		field1075[arg3][arg5] = 99;
		field972[arg3][arg5] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1330[var18] = arg3;
		int var35 = var18 + 1;
		field1331[var18] = arg5;
		boolean var20 = false;
		int var21 = field1330.length;
		int[][] var22 = field1293[field1334].field808;
		while (var35 != var19) {
			var16 = field1330[var19];
			var17 = field1331[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg4 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field1293[field1334].method304(arg4, arg8, var17, arg7, var16, arg0 - 1)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field1293[field1334].method305(arg8, var17, arg7, arg4, var16, arg0 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg10 != 0 && arg9 != 0 && field1293[field1334].method306(var16, var17, arg4, arg8, arg6, arg9, arg10)) {
				var20 = true;
				break;
			}

			int var23 = field972[var16][var17] + 1;
			if (var16 > 0 && field1075[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1330[var35] = var16 - 1;
				field1331[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1075[var16 - 1][var17] = 2;
				field972[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1075[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1330[var35] = var16 + 1;
				field1331[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1075[var16 + 1][var17] = 8;
				field972[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1075[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1330[var35] = var16;
				field1331[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1075[var16][var17 - 1] = 1;
				field972[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1075[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1330[var35] = var16;
				field1331[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1075[var16][var17 + 1] = 4;
				field972[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1075[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1330[var35] = var16 - 1;
				field1331[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1075[var16 - 1][var17 - 1] = 3;
				field972[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1075[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1330[var35] = var16 + 1;
				field1331[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1075[var16 + 1][var17 - 1] = 9;
				field972[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1075[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1330[var35] = var16 - 1;
				field1331[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1075[var16 - 1][var17 + 1] = 6;
				field972[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1075[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1330[var35] = var16 + 1;
				field1331[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1075[var16 + 1][var17 + 1] = 12;
				field972[var16 + 1][var17 + 1] = var23;
			}
		}

		field943 = 0;
		if (!var20) {
			if (arg1) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
						for (int var27 = arg4 - var25; var27 <= arg4 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field972[var26][var27] < var24) {
								var24 = field972[var26][var27];
								var16 = var26;
								var17 = var27;
								field943 = 1;
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
		field1330[var28] = var16;
		int var36 = var28 + 1;
		field1331[var28] = var17;
		int var29;
		int var30 = var29 = field1075[var16][var17];
		while (arg3 != var16 || arg5 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1330[var36] = var16;
				field1331[var36++] = var17;
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

			var30 = field1075[var16][var17];
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
		int var32 = field1330[var36];
		int var33 = field1331[var36];
		field1021 += var31;
		if (field1021 >= 121) {
			field1016.method198(215);
			field1016.method200(19217);
		}

		if (arg2 == 0) {
			field1016.method198(74);
			field1016.method199(var31 + var31 + 3);
		}

		if (arg2 == 1) {
			field1016.method198(37);
			field1016.method199(var31 + var31 + 3 + 14);
		}

		if (arg2 == 2) {
			field1016.method198(73);
			field1016.method199(var31 + var31 + 3);
		}

		if (field20[5] == 1) {
			field1016.method199(1);
		} else {
			field1016.method199(0);
		}

		field1016.method200(field1242 + var32);
		field1016.method200(field1243 + var33);
		field1215 = field1330[0];
		field1216 = field1331[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1016.method199(field1330[var36] - var32);
			field1016.method199(field1331[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.h(II)V")
	public final void method487(int arg0) {
		int var2 = class64.field922[arg0].field930;
		if (var2 != 0) {
			int var3 = field1017[arg0];
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

				class55.field801.method104();
				field1278 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1152;

				if (var3 == 0) {
					method372(0, field1152);
					field1152 = true;
				}

				if (var3 == 1) {
					method372(-400, field1152);
					field1152 = true;
				}

				if (var3 == 2) {
					method372(-800, field1152);
					field1152 = true;
				}

				if (var3 == 3) {
					method372(-1200, field1152);
					field1152 = true;
				}

				if (var3 == 4) {
					field1152 = false;
				}

				if (field1152 != var4) {
					if (field1152) {
						method459(field1093, field1313, field1218);
					} else {
						method470();
					}

					field1164 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1191 = true;
					method407(0);
				}

				if (var3 == 1) {
					field1191 = true;
					method407(-400);
				}

				if (var3 == 2) {
					field1191 = true;
					method407(-800);
				}

				if (var3 == 3) {
					field1191 = true;
					method407(-1200);
				}

				if (var3 == 4) {
					field1191 = false;
				}
			}

			if (var2 == 5) {
				field1106 = var3;
			}

			if (var2 == 6) {
				field970 = var3;
			}

			if (var2 == 8) {
				field1196 = var3;
				field986 = true;
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method488() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1098 != -1 && field1131 == field1098) {
				if (var1 == 8 && field1235.length() > 0) {
					field1235 = field1235.substring(0, field1235.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1235.length() < 12) {
					field1235 = field1235 + (char) var1;
				}
			} else if (field1194) {
				if (var1 >= 32 && var1 <= 122 && field1165.length() < 80) {
					field1165 = field1165 + (char) var1;
					field986 = true;
				}

				if (var1 == 8 && field1165.length() > 0) {
					field1165 = field1165.substring(0, field1165.length() - 1);
					field986 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1194 = false;
					field986 = true;

					if (field952 == 1) {
						long var2 = class48.method251(field1165);
						method412(var2);
					}

					if (field952 == 2 && field1192 > 0) {
						long var4 = class48.method251(field1165);
						method417(var4);
					}

					if (field952 == 3 && field1165.length() > 0) {
						field1016.method198(6);
						field1016.method199(0);
						int var6 = field1016.field540;
						field1016.method205(field1246);
						class49.method259(field1016, field1165);
						field1016.method208(field1016.field540 - var6);
						field1165 = class48.method256(field1165);
						field1165 = class65.method335(field1165);
						method382(6, class48.method255(class48.method252(field1246)), field1165);

						if (field1068 == 2) {
							field1068 = 1;
							field1105 = true;
							field1016.method198(197);
							field1016.method199(field993);
							field1016.method199(field1068);
							field1016.method199(field1155);
						}
					}

					if (field952 == 4 && field1070 < 100) {
						long var7 = class48.method251(field1165);
						method456(var7);
					}

					if (field952 == 5 && field1070 > 0) {
						long var9 = class48.method251(field1165);
						method461(var9);
					}
				}
			} else if (field1033) {
				if (var1 >= 48 && var1 <= 57 && field1078.length() < 10) {
					field1078 = field1078 + (char) var1;
					field986 = true;
				}

				if (var1 == 8 && field1078.length() > 0) {
					field1078 = field1078.substring(0, field1078.length() - 1);
					field986 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1078.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1078);
						} catch (Exception var15) {
						}

						field1016.method198(147);
						field1016.method203(var11);
					}

					field1033 = false;
					field986 = true;
				}
			} else if (field1248 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1011.length() < 80) {
					field1011 = field1011 + (char) var1;
					field986 = true;
				}

				if (var1 == 8 && field1011.length() > 0) {
					field1011 = field1011.substring(0, field1011.length() - 1);
					field986 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1011.length() > 0) {
					if (field1011.equals("::clientdrop") && (field11 != null || method445().indexOf("192.168.1.") != -1)) {
						method410();
					} else if (field1011.startsWith("::")) {
						field1016.method198(251);
						field1016.method199(field1011.length() - 1);
						field1016.method206(field1011.substring(2));
					} else {
						byte var12 = 0;
						if (field1011.startsWith("yellow:")) {
							var12 = 0;
							field1011 = field1011.substring(7);
						}

						if (field1011.startsWith("red:")) {
							var12 = 1;
							field1011 = field1011.substring(4);
						}

						if (field1011.startsWith("green:")) {
							var12 = 2;
							field1011 = field1011.substring(6);
						}

						if (field1011.startsWith("cyan:")) {
							var12 = 3;
							field1011 = field1011.substring(5);
						}

						if (field1011.startsWith("purple:")) {
							var12 = 4;
							field1011 = field1011.substring(7);
						}

						if (field1011.startsWith("white:")) {
							var12 = 5;
							field1011 = field1011.substring(6);
						}

						if (field1011.startsWith("flash1:")) {
							var12 = 6;
							field1011 = field1011.substring(7);
						}

						if (field1011.startsWith("flash2:")) {
							var12 = 7;
							field1011 = field1011.substring(7);
						}

						if (field1011.startsWith("flash3:")) {
							var12 = 8;
							field1011 = field1011.substring(7);
						}

						if (field1011.startsWith("glow1:")) {
							var12 = 9;
							field1011 = field1011.substring(6);
						}

						if (field1011.startsWith("glow2:")) {
							var12 = 10;
							field1011 = field1011.substring(6);
						}

						if (field1011.startsWith("glow3:")) {
							var12 = 11;
							field1011 = field1011.substring(6);
						}

						byte var13 = 0;
						if (field1011.startsWith("wave:")) {
							var13 = 1;
							field1011 = field1011.substring(5);
						}

						if (field1011.startsWith("scroll:")) {
							var13 = 2;
							field1011 = field1011.substring(7);
						}

						field1016.method198(42);
						field1016.method199(0);
						int var14 = field1016.field540;
						field1016.method199(var12);
						field1016.method199(var13);
						class49.method259(field1016, field1011);
						field1016.method208(field1016.field540 - var14);
						field1011 = class48.method256(field1011);
						field1011 = class65.method335(field1011);
						field1285.field280 = field1011;
						field1285.field282 = var12;
						field1285.field283 = var13;
						field1285.field281 = 150;
						method382(2, field1285.field321, field1285.field280);

						if (field993 == 2) {
							field993 = 3;
							field1105 = true;
							field1016.method198(197);
							field1016.method199(field993);
							field1016.method199(field1068);
							field1016.method199(field1155);
						}
					}

					field1011 = "";
					field986 = true;
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
			field1275[var1] = var0 / 4;
		}
	}
}
