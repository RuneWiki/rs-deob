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

	@ObfuscatedName("client.jb")
	public boolean field968 = false;

	@ObfuscatedName("client.kb")
	public class43 field969;

	@ObfuscatedName("client.lb")
	public class43 field970;

	@ObfuscatedName("client.mb")
	public class43 field971;

	@ObfuscatedName("client.nb")
	public class43 field972;

	@ObfuscatedName("client.ob")
	public class43 field973;

	@ObfuscatedName("client.pb")
	public class43 field974;

	@ObfuscatedName("client.qb")
	public class43 field975;

	@ObfuscatedName("client.rb")
	public class43 field976;

	@ObfuscatedName("client.sb")
	public class43 field977;

	@ObfuscatedName("client.tb")
	public int field978;

	@ObfuscatedName("client.ub")
	public int field979 = 2;

	@ObfuscatedName("client.vb")
	public boolean field980 = false;

	@ObfuscatedName("client.xb")
	public class41 field981 = new class41();

	@ObfuscatedName("client.yb")
	public int field982 = -1;

	@ObfuscatedName("client.zb")
	public int field983;

	@ObfuscatedName("client.ac")
	public class34[] field1008 = new class34[20];

	@ObfuscatedName("client.bc")
	public int field1009;

	@ObfuscatedName("client.cc")
	public int field1010;

	@ObfuscatedName("client.dc")
	public int field1011;

	@ObfuscatedName("client.ec")
	public int field1012;

	@ObfuscatedName("client.fc")
	public String field1013;

	@ObfuscatedName("client.gc")
	public int field1014;

	@ObfuscatedName("client.hc")
	public int field1015;

	@ObfuscatedName("client.ic")
	public int field1016;

	@ObfuscatedName("client.jc")
	public static int field1017;

	@ObfuscatedName("client.mc")
	public int[] field1018 = new int[2000];

	@ObfuscatedName("client.C")
	public boolean field939 = false;

	@ObfuscatedName("client.E")
	public int field941 = 2;

	@ObfuscatedName("client.F")
	public boolean field942 = false;

	@ObfuscatedName("client.O")
	public boolean field949 = true;

	@ObfuscatedName("client.R")
	public class41 field951 = new class41();

	@ObfuscatedName("client.S")
	public byte[] field952 = new byte[16384];

	@ObfuscatedName("client.Z")
	public String[] field959 = new String[100];

	@ObfuscatedName("client.Ab")
	public class57[] field984 = new class57[4];

	@ObfuscatedName("client.Gb")
	public int[] field990 = new int[2000];

	@ObfuscatedName("client.Jb")
	public String field993 = "";

	@ObfuscatedName("client.Kb")
	public String field994 = "";

	@ObfuscatedName("client.Nb")
	public int[] field996 = new int[5];

	@ObfuscatedName("client.Pb")
	public String[] field998 = new String[100];

	@ObfuscatedName("client.Wb")
	public long[] field1005 = new long[100];

	@ObfuscatedName("client.Xb")
	public boolean[] field1006 = new boolean[5];

	@ObfuscatedName("client.Zb")
	public int[] field1007 = new int[100];

	@ObfuscatedName("client.sc")
	public int field1024 = -1;

	@ObfuscatedName("client.tc")
	public String field1025 = "";

	@ObfuscatedName("client.vc")
	public String[] field1026 = new String[100];

	@ObfuscatedName("client.xc")
	public class25[] field1028 = new class25[8192];

	@ObfuscatedName("client.zc")
	public int[] field1030 = new int[8192];

	@ObfuscatedName("client.Ec")
	public class37 field1034 = class37.method195(1);

	@ObfuscatedName("client.Fc")
	public boolean field1035 = false;

	@ObfuscatedName("client.Hc")
	public final int[] field1037 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ic")
	public int[] field1038 = new int[5];

	@ObfuscatedName("client.Mc")
	public String field1042 = "";

	@ObfuscatedName("client.Nc")
	public class35[] field1043 = new class35[50];

	@ObfuscatedName("client.Qc")
	public class34[] field1045 = new class34[1000];

	@ObfuscatedName("client.Vc")
	public int field1049 = 78;

	@ObfuscatedName("client.Zc")
	public int[][] field1053 = new int[104][104];

	@ObfuscatedName("client.kd")
	public int field1064 = -1;

	@ObfuscatedName("client.ld")
	public int field1065 = -1;

	@ObfuscatedName("client.nd")
	public boolean field1067 = false;

	@ObfuscatedName("client.td")
	public class41 field1073 = new class41();

	@ObfuscatedName("client.ud")
	public boolean field1074 = false;

	@ObfuscatedName("client.wd")
	public boolean field1076 = false;

	@ObfuscatedName("client.xd")
	public String field1077 = "";

	@ObfuscatedName("client.Fd")
	public int[] field1085 = new int[50];

	@ObfuscatedName("client.Gd")
	public int field1086 = -1;

	@ObfuscatedName("client.Ld")
	public int[] field1090 = new int[100];

	@ObfuscatedName("client.Td")
	public class41[][][] field1097 = new class41[4][104][104];

	@ObfuscatedName("client.ee")
	public boolean field1108 = false;

	@ObfuscatedName("client.he")
	public int field1111 = 128;

	@ObfuscatedName("client.ve")
	public String[] field1125 = new String[500];

	@ObfuscatedName("client.xe")
	public int[] field1127 = new int[33];

	@ObfuscatedName("client.ye")
	public class41 field1128 = new class41();

	@ObfuscatedName("client.ze")
	public int[] field1129 = new int[5];

	@ObfuscatedName("client.Ae")
	public boolean field1130 = false;

	@ObfuscatedName("client.Ee")
	public int[] field1132 = new int[50];

	@ObfuscatedName("client.Fe")
	public int[] field1133 = new int[256];

	@ObfuscatedName("client.He")
	public int[] field1135 = new int[151];

	@ObfuscatedName("client.Ie")
	public int field1136 = -1;

	@ObfuscatedName("client.Je")
	public boolean field1137 = false;

	@ObfuscatedName("client.Le")
	public int[] field1139 = new int[1000];

	@ObfuscatedName("client.Me")
	public int[] field1140 = new int[1000];

	@ObfuscatedName("client.Re")
	public int field1145 = -1;

	@ObfuscatedName("client.df")
	public int[] field1155 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.gf")
	public int field1157 = 0x4D4233;

	@ObfuscatedName("client.hf")
	public int field1158 = -1;

	@ObfuscatedName("client.kf")
	public int field1160 = 0x23201B;

	@ObfuscatedName("client.mf")
	public boolean field1161 = false;

	@ObfuscatedName("client.sf")
	public String field1167 = "";

	@ObfuscatedName("client.tf")
	public String field1168 = "";

	@ObfuscatedName("client.uf")
	public boolean field1169 = false;

	@ObfuscatedName("client.Bf")
	public int field1175 = 1;

	@ObfuscatedName("client.Ef")
	public boolean field1177 = false;

	@ObfuscatedName("client.Ff")
	public class35[] field1178 = new class35[13];

	@ObfuscatedName("client.Sf")
	public int field1191 = 0x766654;

	@ObfuscatedName("client.Tf")
	public boolean field1192 = false;

	@ObfuscatedName("client.Uf")
	public CRC32 field1193 = new CRC32();

	@ObfuscatedName("client.Yf")
	public class37 field1196 = class37.method195(1);

	@ObfuscatedName("client.gg")
	public int field1203 = 50;

	@ObfuscatedName("client.hg")
	public int[] field1204 = new int[field1203];

	@ObfuscatedName("client.ig")
	public int[] field1205 = new int[field1203];

	@ObfuscatedName("client.jg")
	public int[] field1206 = new int[field1203];

	@ObfuscatedName("client.kg")
	public int[] field1207 = new int[field1203];

	@ObfuscatedName("client.lg")
	public int[] field1208 = new int[field1203];

	@ObfuscatedName("client.mg")
	public int[] field1209 = new int[field1203];

	@ObfuscatedName("client.ng")
	public int[] field1210 = new int[field1203];

	@ObfuscatedName("client.og")
	public String[] field1211 = new String[field1203];

	@ObfuscatedName("client.pg")
	public int[] field1212 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.rg")
	public int field1214 = -1;

	@ObfuscatedName("client.sg")
	public String field1215 = "";

	@ObfuscatedName("client.yg")
	public int[] field1221 = new int[1000];

	@ObfuscatedName("client.Ag")
	public boolean field1223 = false;

	@ObfuscatedName("client.Cg")
	public class41 field1224 = new class41();

	@ObfuscatedName("client.Dg")
	public boolean field1225 = false;

	@ObfuscatedName("client.Eg")
	public int[] field1226 = new int[50];

	@ObfuscatedName("client.Hg")
	public int field1229 = 3;

	@ObfuscatedName("client.Ig")
	public boolean field1230 = false;

	@ObfuscatedName("client.Sg")
	public int[][] field1238 = new int[104][104];

	@ObfuscatedName("client.Xg")
	public boolean field1243 = false;

	@ObfuscatedName("client.Yg")
	public int[] field1244 = new int[5];

	@ObfuscatedName("client.Zg")
	public int[] field1245 = new int[50];

	@ObfuscatedName("client.eh")
	public boolean field1250 = false;

	@ObfuscatedName("client.lh")
	public int field1257 = -1;

	@ObfuscatedName("client.oh")
	public int[] field1260 = new int[4000];

	@ObfuscatedName("client.ph")
	public int[] field1261 = new int[4000];

	@ObfuscatedName("client.sh")
	public class34[] field1263 = new class34[8];

	@ObfuscatedName("client.th")
	public int[][] field1264 = new int[104][104];

	@ObfuscatedName("client.uh")
	public int[] field1265 = new int[9];

	@ObfuscatedName("client.Ah")
	public int[] field1271 = new int[50];

	@ObfuscatedName("client.Bh")
	public final int field1272 = 100;

	@ObfuscatedName("client.Ch")
	public int[] field1273 = new int[100];

	@ObfuscatedName("client.Eh")
	public boolean field1275 = false;

	@ObfuscatedName("client.Hh")
	public int[] field1277 = new int[7];

	@ObfuscatedName("client.Ih")
	public long[] field1278 = new long[100];

	@ObfuscatedName("client.Jh")
	public class60 field1279 = new class60();

	@ObfuscatedName("client.Kh")
	public int field1280 = -1;

	@ObfuscatedName("client.Lh")
	public int field1281 = -1;

	@ObfuscatedName("client.Nh")
	public int[] field1283 = new int[151];

	@ObfuscatedName("client.Oh")
	public int[] field1284 = new int[5];

	@ObfuscatedName("client.Rh")
	public boolean field1287 = false;

	@ObfuscatedName("client.Th")
	public class37 field1289 = class37.method195(1);

	@ObfuscatedName("client.Xh")
	public int field1292 = 0x332D25;

	@ObfuscatedName("client.Yh")
	public int[] field1293 = new int[33];

	@ObfuscatedName("client.fi")
	public class34[] field1300 = new class34[20];

	@ObfuscatedName("client.li")
	public class34[] field1304 = new class34[50];

	@ObfuscatedName("client.mi")
	public String field1305 = "";

	@ObfuscatedName("client.ni")
	public boolean field1306 = true;

	@ObfuscatedName("client.oi")
	public int[] field1307 = new int[50];

	@ObfuscatedName("client.wi")
	public boolean field1315 = true;

	@ObfuscatedName("client.xi")
	public int[] field1316 = new int[500];

	@ObfuscatedName("client.yi")
	public int[] field1317 = new int[500];

	@ObfuscatedName("client.zi")
	public int[] field1318 = new int[500];

	@ObfuscatedName("client.Ai")
	public int[] field1319 = new int[500];

	@ObfuscatedName("client.Bi")
	public boolean field1320 = true;

	@ObfuscatedName("client.Cc")
	public static final int[][] field1033 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Jc")
	public static int[] field1039 = new int[99];

	@ObfuscatedName("client.Ud")
	public static int field1098 = 10;

	@ObfuscatedName("client.Wd")
	public static boolean field1100 = true;

	@ObfuscatedName("client.pe")
	public static final int[] field1119 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.zh")
	public static String field1270 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Sh")
	public static BigInteger field1288 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Vh")
	public static BigInteger field1290 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Rb")
	public int field1000;

	@ObfuscatedName("client.Sb")
	public int field1001;

	@ObfuscatedName("client.Tb")
	public int field1002;

	@ObfuscatedName("client.Ub")
	public int field1003;

	@ObfuscatedName("client.wc")
	public int field1027;

	@ObfuscatedName("client.yc")
	public int field1029;

	@ObfuscatedName("client.Ac")
	public int field1031;

	@ObfuscatedName("client.Kc")
	public static int field1040;

	@ObfuscatedName("client.Lc")
	public int field1041;

	@ObfuscatedName("client.Oc")
	public static int field1044;

	@ObfuscatedName("client.Rc")
	public int field1046;

	@ObfuscatedName("client.Sc")
	public int field1047;

	@ObfuscatedName("client.Uc")
	public int field1048;

	@ObfuscatedName("client.Xc")
	public int field1051;

	@ObfuscatedName("client.Yc")
	public static int field1052;

	@ObfuscatedName("client.ad")
	public int field1054;

	@ObfuscatedName("client.bd")
	public int field1055;

	@ObfuscatedName("client.cd")
	public int field1056;

	@ObfuscatedName("client.dd")
	public int field1057;

	@ObfuscatedName("client.ed")
	public int field1058;

	@ObfuscatedName("client.fd")
	public int field1059;

	@ObfuscatedName("client.jd")
	public int field1063;

	@ObfuscatedName("client.md")
	public int field1066;

	@ObfuscatedName("client.od")
	public int field1068;

	@ObfuscatedName("client.pd")
	public int field1069;

	@ObfuscatedName("client.qd")
	public int field1070;

	@ObfuscatedName("client.rd")
	public int field1071;

	@ObfuscatedName("client.sd")
	public int field1072;

	@ObfuscatedName("client.yd")
	public int field1078;

	@ObfuscatedName("client.zd")
	public int field1079;

	@ObfuscatedName("client.Ad")
	public static int field1080;

	@ObfuscatedName("client.Bd")
	public int field1081;

	@ObfuscatedName("client.Ed")
	public int field1084;

	@ObfuscatedName("client.Kd")
	public static int field1089;

	@ObfuscatedName("client.Vd")
	public static int field1099;

	@ObfuscatedName("client.Yd")
	public int field1102;

	@ObfuscatedName("client.Zd")
	public int field1103;

	@ObfuscatedName("client.ae")
	public int field1104;

	@ObfuscatedName("client.be")
	public int field1105;

	@ObfuscatedName("client.ce")
	public int field1106;

	@ObfuscatedName("client.de")
	public static int field1107;

	@ObfuscatedName("client.fe")
	public int field1109;

	@ObfuscatedName("client.ie")
	public int field1112;

	@ObfuscatedName("client.je")
	public int field1113;

	@ObfuscatedName("client.ke")
	public int field1114;

	@ObfuscatedName("client.le")
	public int field1115;

	@ObfuscatedName("client.me")
	public int field1116;

	@ObfuscatedName("client.ne")
	public int field1117;

	@ObfuscatedName("client.oe")
	public int field1118;

	@ObfuscatedName("client.we")
	public int field1126;

	@ObfuscatedName("client.De")
	public int field1131;

	@ObfuscatedName("client.Ke")
	public int field1138;

	@ObfuscatedName("client.Ne")
	public int field1141;

	@ObfuscatedName("client.Se")
	public int field1146;

	@ObfuscatedName("client.Te")
	public int field1147;

	@ObfuscatedName("client.Ue")
	public int field1148;

	@ObfuscatedName("client.Ve")
	public int field1149;

	@ObfuscatedName("client.We")
	public int field1150;

	@ObfuscatedName("client.Xe")
	public int field1151;

	@ObfuscatedName("client.Ye")
	public int field1152;

	@ObfuscatedName("client.Ze")
	public int field1153;

	@ObfuscatedName("client.af")
	public int field1154;

	@ObfuscatedName("client.jf")
	public int field1159;

	@ObfuscatedName("client.nf")
	public int field1162;

	@ObfuscatedName("client.of")
	public int field1163;

	@ObfuscatedName("client.pf")
	public int field1164;

	@ObfuscatedName("client.qf")
	public int field1165;

	@ObfuscatedName("client.rf")
	public int field1166;

	@ObfuscatedName("client.Af")
	public int field1174;

	@ObfuscatedName("client.Gf")
	public int field1179;

	@ObfuscatedName("client.Hf")
	public int field1180;

	@ObfuscatedName("client.Vf")
	public int field1194;

	@ObfuscatedName("client.dg")
	public int field1200;

	@ObfuscatedName("client.eg")
	public static int field1201;

	@ObfuscatedName("client.fg")
	public int field1202;

	@ObfuscatedName("client.qg")
	public static int field1213;

	@ObfuscatedName("client.vg")
	public int field1218;

	@ObfuscatedName("client.wg")
	public int field1219;

	@ObfuscatedName("client.xg")
	public int field1220;

	@ObfuscatedName("client.Og")
	public int field1236;

	@ObfuscatedName("client.Pg")
	public static int field1237;

	@ObfuscatedName("client.Ug")
	public int field1240;

	@ObfuscatedName("client.Vg")
	public int field1241;

	@ObfuscatedName("client.gh")
	public int field1252;

	@ObfuscatedName("client.hh")
	public int field1253;

	@ObfuscatedName("client.ih")
	public int field1254;

	@ObfuscatedName("client.jh")
	public int field1255;

	@ObfuscatedName("client.kh")
	public int field1256;

	@ObfuscatedName("client.mh")
	public int field1258;

	@ObfuscatedName("client.vh")
	public static int field1266;

	@ObfuscatedName("client.wh")
	public int field1267;

	@ObfuscatedName("client.xh")
	public int field1268;

	@ObfuscatedName("client.yh")
	public int field1269;

	@ObfuscatedName("client.Dh")
	public int field1274;

	@ObfuscatedName("client.Gh")
	public int field1276;

	@ObfuscatedName("client.Mh")
	public static int field1282;

	@ObfuscatedName("client.Qh")
	public int field1286;

	@ObfuscatedName("client.Wh")
	public int field1291;

	@ObfuscatedName("client.Zh")
	public int field1294;

	@ObfuscatedName("client.ai")
	public int field1295;

	@ObfuscatedName("client.bi")
	public int field1296;

	@ObfuscatedName("client.ci")
	public int field1297;

	@ObfuscatedName("client.di")
	public int field1298;

	@ObfuscatedName("client.ei")
	public int field1299;

	@ObfuscatedName("client.ji")
	public static int field1302;

	@ObfuscatedName("client.pi")
	public int field1308;

	@ObfuscatedName("client.qi")
	public static int field1309;

	@ObfuscatedName("client.ri")
	public int field1310;

	@ObfuscatedName("client.si")
	public int field1311;

	@ObfuscatedName("client.ti")
	public int field1312;

	@ObfuscatedName("client.ui")
	public int field1313;

	@ObfuscatedName("client.vi")
	public int field1314;

	@ObfuscatedName("client.Ei")
	public int field1321;

	@ObfuscatedName("client.D")
	public int field940;

	@ObfuscatedName("client.G")
	public int field943;

	@ObfuscatedName("client.H")
	public int field944;

	@ObfuscatedName("client.I")
	public int field945;

	@ObfuscatedName("client.J")
	public int field946;

	@ObfuscatedName("client.K")
	public int field947;

	@ObfuscatedName("client.L")
	public int field948;

	@ObfuscatedName("client.Q")
	public static int field950;

	@ObfuscatedName("client.T")
	public int field953;

	@ObfuscatedName("client.U")
	public int field954;

	@ObfuscatedName("client.V")
	public int field955;

	@ObfuscatedName("client.W")
	public int field956;

	@ObfuscatedName("client.X")
	public int field957;

	@ObfuscatedName("client.Y")
	public int field958;

	@ObfuscatedName("client.Hb")
	public int field991;

	@ObfuscatedName("client.Mb")
	public static int field995;

	@ObfuscatedName("client.Ob")
	public int field997;

	@ObfuscatedName("client.Jg")
	public long field1231;

	@ObfuscatedName("client.nh")
	public long field1259;

	@ObfuscatedName("client.Ph")
	public long field1285;

	@ObfuscatedName("client.Ib")
	public class18 field992;

	@ObfuscatedName("client.ki")
	public class26 field1303;

	@ObfuscatedName("client.nc")
	public class34 field1019;

	@ObfuscatedName("client.oc")
	public class34 field1020;

	@ObfuscatedName("client.Df")
	public class34 field1176;

	@ObfuscatedName("client.tg")
	public class34 field1216;

	@ObfuscatedName("client.ug")
	public class34 field1217;

	@ObfuscatedName("client.Wg")
	public class34 field1242;

	@ObfuscatedName("client.ah")
	public class34 field1246;

	@ObfuscatedName("client.bh")
	public class34 field1247;

	@ObfuscatedName("client.ch")
	public class34 field1248;

	@ObfuscatedName("client.dh")
	public class34 field1249;

	@ObfuscatedName("client.gi")
	public class34 field1301;

	@ObfuscatedName("client.pc")
	public class35 field1021;

	@ObfuscatedName("client.qc")
	public class35 field1022;

	@ObfuscatedName("client.rc")
	public class35 field1023;

	@ObfuscatedName("client.Hd")
	public class35 field1087;

	@ObfuscatedName("client.Id")
	public class35 field1088;

	@ObfuscatedName("client.qe")
	public class35 field1120;

	@ObfuscatedName("client.re")
	public class35 field1121;

	@ObfuscatedName("client.se")
	public class35 field1122;

	@ObfuscatedName("client.te")
	public class35 field1123;

	@ObfuscatedName("client.ue")
	public class35 field1124;

	@ObfuscatedName("client.Oe")
	public class35 field1142;

	@ObfuscatedName("client.Pe")
	public class35 field1143;

	@ObfuscatedName("client.Qe")
	public class35 field1144;

	@ObfuscatedName("client.Fg")
	public class35 field1227;

	@ObfuscatedName("client.Gg")
	public class35 field1228;

	@ObfuscatedName("client.Bb")
	public class35 field985;

	@ObfuscatedName("client.Cb")
	public class35 field986;

	@ObfuscatedName("client.Db")
	public class35 field987;

	@ObfuscatedName("client.Eb")
	public class35 field988;

	@ObfuscatedName("client.Fb")
	public class35 field989;

	@ObfuscatedName("client.wf")
	public class36 field1170;

	@ObfuscatedName("client.xf")
	public class36 field1171;

	@ObfuscatedName("client.yf")
	public class36 field1172;

	@ObfuscatedName("client.zf")
	public class36 field1173;

	@ObfuscatedName("client.gd")
	public class43 field1060;

	@ObfuscatedName("client.hd")
	public class43 field1061;

	@ObfuscatedName("client.id")
	public class43 field1062;

	@ObfuscatedName("client.If")
	public class43 field1181;

	@ObfuscatedName("client.Jf")
	public class43 field1182;

	@ObfuscatedName("client.Kf")
	public class43 field1183;

	@ObfuscatedName("client.Lf")
	public class43 field1184;

	@ObfuscatedName("client.Mf")
	public class43 field1185;

	@ObfuscatedName("client.Nf")
	public class43 field1186;

	@ObfuscatedName("client.Of")
	public class43 field1187;

	@ObfuscatedName("client.Pf")
	public class43 field1188;

	@ObfuscatedName("client.Qf")
	public class43 field1189;

	@ObfuscatedName("client.Rf")
	public class43 field1190;

	@ObfuscatedName("client.Kg")
	public class43 field1232;

	@ObfuscatedName("client.Lg")
	public class43 field1233;

	@ObfuscatedName("client.Mg")
	public class43 field1234;

	@ObfuscatedName("client.Ng")
	public class43 field1235;

	@ObfuscatedName("client.Wf")
	public class46 field1195;

	@ObfuscatedName("client.ge")
	public class47 field1110;

	@ObfuscatedName("client.fh")
	public class4 field1251;

	@ObfuscatedName("client.Vb")
	public String field1004;

	@ObfuscatedName("client.Bc")
	public String field1032;

	@ObfuscatedName("client.Gc")
	public String field1036;

	@ObfuscatedName("client.Xd")
	public static boolean field1101;

	@ObfuscatedName("client.rh")
	public static boolean field1262;

	@ObfuscatedName("client.vd")
	public byte[] field1075;

	@ObfuscatedName("client.Cd")
	public int[] field1082;

	@ObfuscatedName("client.Dd")
	public int[] field1083;

	@ObfuscatedName("client.Md")
	public int[] field1091;

	@ObfuscatedName("client.Nd")
	public int[] field1092;

	@ObfuscatedName("client.Pd")
	public int[] field1093;

	@ObfuscatedName("client.Qd")
	public int[] field1094;

	@ObfuscatedName("client.Rd")
	public int[] field1095;

	@ObfuscatedName("client.Sd")
	public int[] field1096;

	@ObfuscatedName("client.ag")
	public int[] field1197;

	@ObfuscatedName("client.bg")
	public int[] field1198;

	@ObfuscatedName("client.cg")
	public int[] field1199;

	@ObfuscatedName("client.Tg")
	public int[] field1239;

	@ObfuscatedName("client.ff")
	public class35[] field1156;

	@ObfuscatedName("client.Wc")
	public byte[][] field1050;

	@ObfuscatedName("client.Qb")
	public byte[][] field999;

	@ObfuscatedName("client.Ge")
	public byte[][][] field1134;

	@ObfuscatedName("client.zg")
	public int[][][] field1222;

	@ObfuscatedName("client.a(IIIIIILhc;)V")
	public final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5) {
		if (arg5.field834 == 0 && arg5.field848 != null && !arg5.field847 && (arg2 >= arg4 && arg0 >= arg1 && arg2 <= arg5.field837 + arg4 && arg0 <= arg5.field838 + arg1)) {
			int var7 = arg5.field848.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field849[var8] + arg4;
				int var10 = arg5.field850[var8] + arg1 - arg3;
				class60 var11 = class60.field827[arg5.field848[var8]];
				var9 += var11.field839;
				var10 += var11.field840;
				if ((var11.field844 >= 0 || var11.field870 != 0) && arg2 >= var9 && arg0 >= var10 && arg2 < var11.field837 + var9 && arg0 < var11.field838 + var10) {
					if (var11.field844 >= 0) {
						field1048 = var11.field844;
					} else {
						field1048 = var11.field832;
					}
				}

				if (var11.field834 == 0) {
					method362(arg0, var10, arg2, var11.field846, var9, var11);

					if (var11.field845 > var11.field838) {
						method465(true, arg0, var11, var10, var11.field837 + var9, var11.field845, var11.field838, arg2);
					}
				} else {
					if (var11.field835 == 1 && arg2 >= var9 && arg0 >= var10 && arg2 < var11.field837 + var9 && arg0 < var11.field838 + var10) {
						field1125[field983] = var11.field883;
						field1318[field983] = 238;
						field1317[field983] = var11.field832;
						field983++;
					}

					if (var11.field835 == 2 && field1001 == 0 && arg2 >= var9 && arg0 >= var10 && arg2 < var11.field837 + var9 && arg0 < var11.field838 + var10) {
						String var12 = var11.field880;
						if (var12.indexOf(" ") != -1) {
							var12 = var12.substring(0, var12.indexOf(" "));
						}

						field1125[field983] = var12 + " @gre@" + var11.field881;
						field1318[field983] = 409;
						field1317[field983] = var11.field832;
						field983++;
					}

					if (var11.field835 == 3 && arg2 >= var9 && arg0 >= var10 && arg2 < var11.field837 + var9 && arg0 < var11.field838 + var10) {
						field1125[field983] = "Close";
						field1318[field983] = 975;
						field1317[field983] = var11.field832;
						field983++;
					}

					if (var11.field835 == 4 && arg2 >= var9 && arg0 >= var10 && arg2 < var11.field837 + var9 && arg0 < var11.field838 + var10) {
						field1125[field983] = var11.field883;
						field1318[field983] = 261;
						field1317[field983] = var11.field832;
						field983++;
					}

					if (var11.field835 == 5 && arg2 >= var9 && arg0 >= var10 && arg2 < var11.field837 + var9 && arg0 < var11.field838 + var10) {
						field1125[field983] = var11.field883;
						field1318[field983] = 779;
						field1317[field983] = var11.field832;
						field983++;
					}

					if (var11.field835 == 6 && !field968 && arg2 >= var9 && arg0 >= var10 && arg2 < var11.field837 + var9 && arg0 < var11.field838 + var10) {
						field1125[field983] = var11.field883;
						field1318[field983] = 785;
						field1317[field983] = var11.field832;
						field983++;
					}

					if (var11.field834 == 2) {
						int var13 = 0;
						for (int var14 = 0; var14 < var11.field838; var14++) {
							for (int var15 = 0; var15 < var11.field837; var15++) {
								int var16 = (var11.field856 + 32) * var15 + var9;
								int var17 = (var11.field857 + 32) * var14 + var10;
								if (var13 < 20) {
									var16 += var11.field859[var13];
									var17 += var11.field860[var13];
								}

								if (arg2 >= var16 && arg0 >= var17 && arg2 < var16 + 32 && arg0 < var17 + 32) {
									field1146 = var13;
									field1147 = var11.field832;

									if (var11.field828[var13] > 0) {
										class55 var18 = class55.method286(var11.field828[var13] - 1);
										if (field1009 == 1 && var11.field854) {
											if (field1011 != var11.field832 || field1010 != var13) {
												field1125[field983] = "Use " + field1013 + " with @lre@" + var18.field769;
												field1318[field983] = 278;
												field1319[field983] = var18.field767;
												field1316[field983] = var13;
												field1317[field983] = var11.field832;
												field983++;
											}
										} else if (field1001 != 1 || !var11.field854) {
											if (var11.field854) {
												for (int var19 = 4; var19 >= 3; var19--) {
													if (var18.field784 != null && var18.field784[var19] != null) {
														field1125[field983] = var18.field784[var19] + " @lre@" + var18.field769;

														if (var19 == 3) {
															field1318[field983] = 274;
														}

														if (var19 == 4) {
															field1318[field983] = 618;
														}

														field1319[field983] = var18.field767;
														field1316[field983] = var13;
														field1317[field983] = var11.field832;
														field983++;
													} else if (var19 == 4) {
														field1125[field983] = "Drop @lre@" + var18.field769;
														field1318[field983] = 618;
														field1319[field983] = var18.field767;
														field1316[field983] = var13;
														field1317[field983] = var11.field832;
														field983++;
													}
												}
											}

											if (var11.field855) {
												field1125[field983] = "Use @lre@" + var18.field769;
												field1318[field983] = 215;
												field1319[field983] = var18.field767;
												field1316[field983] = var13;
												field1317[field983] = var11.field832;
												field983++;
											}

											if (var11.field854 && var18.field784 != null) {
												for (int var20 = 2; var20 >= 0; var20--) {
													if (var18.field784[var20] != null) {
														field1125[field983] = var18.field784[var20] + " @lre@" + var18.field769;

														if (var20 == 0) {
															field1318[field983] = 382;
														}

														if (var20 == 1) {
															field1318[field983] = 635;
														}

														if (var20 == 2) {
															field1318[field983] = 939;
														}

														field1319[field983] = var18.field767;
														field1316[field983] = var13;
														field1317[field983] = var11.field832;
														field983++;
													}
												}
											}

											if (var11.field861 != null) {
												for (int var21 = 4; var21 >= 0; var21--) {
													if (var11.field861[var21] != null) {
														field1125[field983] = var11.field861[var21] + " @lre@" + var18.field769;

														if (var21 == 0) {
															field1318[field983] = 71;
														}

														if (var21 == 1) {
															field1318[field983] = 897;
														}

														if (var21 == 2) {
															field1318[field983] = 500;
														}

														if (var21 == 3) {
															field1318[field983] = 837;
														}

														if (var21 == 4) {
															field1318[field983] = 460;
														}

														field1319[field983] = var18.field767;
														field1316[field983] = var13;
														field1317[field983] = var11.field832;
														field983++;
													}
												}
											}

											field1125[field983] = "Examine @lre@" + var18.field769;
											field1318[field983] = 1654;
											field1319[field983] = var18.field767;
											field1317[field983] = var11.field829[var13];
											field983++;
										} else if ((field1003 & 0x10) == 0x10) {
											field1125[field983] = field1004 + " @lre@" + var18.field769;
											field1318[field983] = 45;
											field1319[field983] = var18.field767;
											field1316[field983] = var13;
											field1317[field983] = var11.field832;
											field983++;
										}
									}
								}

								var13++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method363() {
		field1076 = false;
		while (field1243) {
			field1076 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1087 = null;
		field1088 = null;
		field1156 = null;
		field1093 = null;
		field1094 = null;
		field1095 = null;
		field1096 = null;
		field1091 = null;
		field1092 = null;
		field1082 = null;
		field1083 = null;
		field1216 = null;
		field1217 = null;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method364() {
		class53.field731.method103();
		class53.field732.method103();
		class54.field760.method103();
		class55.field799.method103();
		class55.field800.method103();
		class26.field341.method103();
		class63.field918.method103();
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = class31.field478[var7];
			int var13 = class31.field479[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field478[var8];
			int var16 = class31.field479[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field943 = arg2 - var9;
		field944 = arg3 - var10;
		field945 = arg0 - var11;
		field946 = arg5;
		field947 = arg4;
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method366(int arg0) {
		class60 var2 = class60.field827[arg0];
		for (int var3 = 0; var3 < var2.field848.length && var2.field848[var3] != -1; var3++) {
			class60 var4 = class60.field827[var2.field848[var3]];
			if (var4.field834 == 1) {
				method366(var4.field832);
			}

			var4.field830 = 0;
			var4.field831 = 0;
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method367(int arg0, int arg1) {
		class41 var3 = field1097[field1180][arg0][arg1];
		if (var3 == null) {
			field992.method75(field1180, arg0, arg1);
		} else {
			int var4 = -99999999;
			class22 var5 = null;
			for (class22 var6 = (class22) var3.method227(); var6 != null; var6 = (class22) var3.method229()) {
				class55 var7 = class55.method286(var6.field266);
				int var8 = var7.field781;
				if (var7.field780) {
					var8 = (var6.field267 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method225(var5);
			int var9 = -1;
			int var10 = -1;
			int var11 = 0;
			int var12 = 0;
			for (class22 var13 = (class22) var3.method227(); var13 != null; var13 = (class22) var3.method229()) {
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
				var14 = class55.method286(var9).method290(var11);
			}

			class31 var15 = null;
			if (var10 != -1) {
				var15 = class55.method286(var10).method290(var12);
			}

			int var16 = (arg1 << 7) + arg0 + 0x60000000;
			class55 var17 = class55.method286(var5.field266);
			field992.method57(method419(field1180, arg0 * 128 + 64, arg1 * 128 + 64), arg1, var15, field1180, var14, var16, arg0, var17.method290(var5.field267));
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method368() {
		try {
			field1214 = -1;
			field1224.method231();
			field951.method231();
			field1128.method231();
			field1073.method231();
			class33.method155();
			method364();
			field992.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field984[var1].method294();
			}

			System.gc();
			class3 var2 = new class3(104, field1134, field1222, 104);
			byte[] var3 = new byte[100000];
			int var4 = field999.length;
			class3.field25 = class18.field194;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1239[var5] >> 8;
				int var7 = field1239[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field25 = false;
				}
			}

			if (class3.field25) {
				field992.method51(field1180);
			} else {
				field992.method51(0);
			}

			field1034.method197(186);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1239[var8] >> 8) * 64 - field954;
				int var10 = (field1239[var8] & 0xFF) * 64 - field955;
				byte[] var11 = field999[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method213();
					class44.method237(var3, var12, var11, var11.length - 4, 4);
					var2.method15(var3, var10, (field1154 - 6) * 8, (field1153 - 6) * 8, var9);
				} else if (field1154 < 800) {
					var2.method14(var10, 64, var9, 64);
				}
			}

			field1034.method197(186);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field1050[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method213();
					class44.method237(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1239[var13] >> 8) * 64 - field954;
					int var17 = (field1239[var13] & 0xFF) * 64 - field955;
					var2.method16(var16, field984, var3, field951, field992, var17);
				}
			}

			field1034.method197(186);
			var2.method18(field992, field984);
			field1234.method234();
			field1034.method197(186);

			for (class40 var18 = (class40) field951.method227(); var18 != null; var18 = (class40) field951.method229()) {
				if ((field1134[1][var18.field571][var18.field572] & 0x2) == 2) {
					var18.field569--;
					if (var18.field569 < 0) {
						var18.method106();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method367(var19, var20);
				}
			}

			for (class38 var21 = (class38) field981.method227(); var21 != null; var21 = (class38) field981.method229()) {
				method455(var21.field553, var21.field556, var21.field552, var21.field551, var21.field555, var21.field554, var21.field557);
			}
		} catch (Exception var23) {
		}

		class53.field731.method103();
		System.gc();
		class33.method156(20);
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method369(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method370(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.g(I)V")
	public final void method371() {
		for (int var1 = 0; var1 < field1029; var1++) {
			class25 var2 = field1028[field1030[var1]];
			int var3 = (field1030[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method110()) {
				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field272 == 1 && (var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
						if (field1053[var4][var5] == field1027) {
							continue;
						}

						field1053[var4][var5] = field1027;
					}

					field992.method61(var2.field270, var2, null, var3, var2.field268, var2.field271, (var2.field272 - 1) * 64 + 60, field1180, var2.field269, method419(field1180, var2.field268, var2.field269));
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method372(int arg0) {
		int var2 = class64.field920[arg0].field928;
		if (var2 != 0) {
			int var3 = field1018[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class33.method161(0.9D);
				}

				if (var3 == 2) {
					class33.method161(0.8D);
				}

				if (var3 == 3) {
					class33.method161(0.7D);
				}

				if (var3 == 4) {
					class33.method161(0.6D);
				}

				class55.field800.method103();
				field1130 = true;
			}

			if (var2 == 2) {
				if (var3 == 0) {
					field1306 = true;
					signlink.jinglevol = 0;
				}

				if (var3 == 1) {
					field1306 = true;
					signlink.jinglevol = -400;
				}

				if (var3 == 2) {
					field1306 = true;
					signlink.jinglevol = -800;
				}

				if (var3 == 3) {
					field1306 = true;
					signlink.jinglevol = -1200;
				}

				if (var3 == 4) {
					field1306 = false;
				}
			}

			if (var2 == 3) {
				boolean var4 = field1315;
				int var5 = signlink.musicvol;

				if (var3 == 0) {
					field1315 = true;
					signlink.musicvol = 0;
				}

				if (var3 == 1) {
					field1315 = true;
					signlink.musicvol = -400;
				}

				if (var3 == 2) {
					field1315 = true;
					signlink.musicvol = -800;
				}

				if (var3 == 3) {
					field1315 = true;
					signlink.musicvol = -1200;
				}

				if (var3 == 4) {
					field1315 = false;
				}

				if (field1315 != var4 || signlink.musicvol != var5) {
					if (field1315) {
						method417(field1032);
					} else {
						method417("null");
					}
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field949 = true;
					signlink.wavevol = 0;
				}

				if (var3 == 1) {
					field949 = true;
					signlink.wavevol = -400;
				}

				if (var3 == 2) {
					field949 = true;
					signlink.wavevol = -800;
				}

				if (var3 == 3) {
					field949 = true;
					signlink.wavevol = -1200;
				}

				if (var3 == 4) {
					field949 = false;
				}
			}

			if (var2 == 5) {
				field1179 = var3;
			}

			if (var2 == 6) {
				field1159 = var3;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method373() {
		for (int var1 = -1; var1 < field963; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field961;
			} else {
				var2 = field964[var1];
			}

			class26 var3 = field962[var2];
			if (var3 != null) {
				method382(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method374() {
		if (field1164 == 0) {
			field1125[0] = "Cancel";
			field1318[0] = 1033;
			field983 = 1;
			field1048 = 0;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field1086 == -1) {
					method451();
				} else {
					method362(field16, 11, field15, 0, 8, class60.field827[field1086]);
				}
			}

			if (field1048 != field1041) {
				field1041 = field1048;
			}

			field1048 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field982 != -1) {
					method362(field16, 231, field15, 0, 562, class60.field827[field982]);
				} else if (field1212[field1229] != -1) {
					method362(field16, 231, field15, 0, 562, class60.field827[field1212[field1229]]);
				}
			}

			if (field1274 != field1048) {
				field1074 = true;
				field1274 = field1048;
			}

			field1048 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 501 && field16 < 471 && field1024 != -1) {
				method362(field16, 375, field15, 0, 22, class60.field827[field1024]);
			}

			if (field1024 != -1 && field1299 != field1048) {
				field1223 = true;
				field1299 = field1048;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field983 - 1; var2++) {
					if (field1318[var2] < 1000 && field1318[var2 + 1] > 1000) {
						String var3 = field1125[var2];
						field1125[var2] = field1125[var2 + 1];
						field1125[var2 + 1] = var3;
						int var4 = field1318[var2];
						field1318[var2] = field1318[var2 + 1];
						field1318[var2 + 1] = var4;
						int var5 = field1316[var2];
						field1316[var2] = field1316[var2 + 1];
						field1316[var2 + 1] = var5;
						int var6 = field1317[var2];
						field1317[var2] = field1317[var2 + 1];
						field1317[var2 + 1] = var6;
						int var7 = field1319[var2];
						field1319[var2] = field1319[var2 + 1];
						field1319[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method375(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1145 != -1) {
			field1036 = arg1;
			field17 = 0;
		}

		if (field1024 == -1) {
			field1223 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1090[var4] = field1090[var4 - 1];
			field959[var4] = field959[var4 - 1];
			field1026[var4] = field1026[var4 - 1];
		}

		field1090[0] = arg0;
		field959[0] = arg2;
		field1026[0] = arg1;
	}

	@ObfuscatedName("client.a(IZLkb;)V")
	public final void method376(int arg0, class37 arg1) {
		while (arg1.field541 + 21 < arg0 * 8) {
			int var3 = arg1.method219(13);
			if (var3 == 8191) {
				break;
			}

			if (field1028[var3] == null) {
				field1028[var3] = new class25();
			}

			class25 var4 = field1028[var3];
			field1030[field1029++] = var3;
			var4.field312 = field1266;
			var4.field320 = class54.method280(arg1.method219(11));
			var4.field272 = var4.field320.field741;
			var4.field275 = var4.field320.field745;
			var4.field276 = var4.field320.field746;
			var4.field277 = var4.field320.field747;
			var4.field278 = var4.field320.field748;
			var4.field273 = var4.field320.field744;
			int var5 = arg1.method219(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method219(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method108(field1303.field316[0] + var5, field1303.field317[0] + var6, false);
			int var7 = arg1.method219(1);
			if (var7 == 1) {
				field966[field965++] = var3;
			}
		}

		arg1.method220();
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://127.0.0.1:" + (field1099 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.i(I)V")
	public final void method377() {
		if (field969 == null) {
			field9 = null;
			field1235 = null;
			field1233 = null;
			field1232 = null;
			field1234 = null;
			field1060 = null;
			field1061 = null;
			field1062 = null;
			field972 = new class43(method11(), 128, 265);
			class32.method147();
			field973 = new class43(method11(), 128, 265);
			class32.method147();
			field969 = new class43(method11(), 533, 186);
			class32.method147();
			field970 = new class43(method11(), 360, 146);
			class32.method147();
			field971 = new class43(method11(), 360, 200);
			class32.method147();
			field974 = new class43(method11(), 214, 267);
			class32.method147();
			field975 = new class43(method11(), 215, 267);
			class32.method147();
			field976 = new class43(method11(), 86, 79);
			class32.method147();
			field977 = new class43(method11(), 87, 79);
			class32.method147();

			if (field1110 != null) {
				method463();
				method409();
			}

			field1130 = true;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method378() {
		int var1 = field1303.field268 + field978;
		int var2 = field1303.field269 + field940;
		if (field1267 - var1 < -500 || field1267 - var1 > 500 || field1268 - var2 < -500 || field1268 - var2 > 500) {
			field1267 = var1;
			field1268 = var2;
		}

		if (field1267 != var1) {
			field1267 += (var1 - field1267) / 16;
		}

		if (field1268 != var2) {
			field1268 += (var2 - field1268) / 16;
		}

		if (field20[1] == 1) {
			field1113 += (-field1113 - 24) / 2;
		} else if (field20[2] == 1) {
			field1113 += (24 - field1113) / 2;
		} else {
			field1113 /= 2;
		}

		if (field20[3] == 1) {
			field1114 += (12 - field1114) / 2;
		} else if (field20[4] == 1) {
			field1114 += (-field1114 - 12) / 2;
		} else {
			field1114 /= 2;
		}

		field1112 = field1113 / 2 + field1112 & 0x7FF;
		field1111 += field1114 / 2;
		if (field1111 < 128) {
			field1111 = 128;
		}

		if (field1111 > 383) {
			field1111 = 383;
		}

		int var3 = field1267 >> 7;
		int var4 = field1268 >> 7;
		int var5 = method419(field1180, field1267, field1268);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1180;
					if (var9 < 3 && (field1134[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field1222[var9][var7][var8];
					if (var10 > var6) {
						var6 = var10;
					}
				}
			}
		}

		field1213++;
		if (field1213 > 77) {
			field1213 = 0;
			field1034.method197(156);
		}

		int var11 = var6 * 192;
		if (var11 > 98048) {
			var11 = 98048;
		}

		if (var11 < 32768) {
			var11 = 32768;
		}

		if (var11 > field953) {
			field953 += (var11 - field953) / 24;
		} else if (var11 < field953) {
			field953 += (var11 - field953) / 80;
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method379(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field992.method80(field1180, arg2, arg0, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class53 var9 = class53.method274(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field705;
				var11 = var9.field706;
			} else {
				var10 = var9.field706;
				var11 = var9.field705;
			}

			int var12 = var9.field729;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method434(false, arg0, field1303.field316[0], var11, var10, field1303.field317[0], 0, 0, var12, arg2);
		} else {
			method434(false, arg0, field1303.field316[0], 0, 0, field1303.field317[0], var8, var7 + 1, 0, arg2);
		}

		field1068 = field18;
		field1069 = field19;
		field1071 = 2;
		field1070 = 0;
		field1034.method197(arg1);
		field1034.method199(field954 + arg2);
		field1034.method199(field955 + arg0);
		field1034.method199(var5);
		return true;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method380(int arg0) {
		int[] var2 = field1242.field515;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1134[arg0][var7][var5] & 0x18) == 0) {
					field992.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1134[arg0 + 1][var7][var5] & 0x8) != 0) {
					field992.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field1242.method169();

		for (int var8 = 1; var8 < 103; var8++) {
			for (int var9 = 1; var9 < 103; var9++) {
				if ((field1134[arg0][var9][var8] & 0x18) == 0) {
					method445(arg0, var8, var9);
				}

				if (arg0 < 3 && (field1134[arg0 + 1][var9][var8] & 0x8) != 0) {
					method445(arg0 + 1, var8, var9);
				}
			}
		}

		field1234.method234();
		field1138 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = field992.method79(field1180, var10, var11);
				if (var12 != 0) {
					var12 = var12 >> 14 & 0x7FFF;
					int var13 = class53.method274(var12).field719;
					if (var13 >= 0) {
						field1045[field1138] = field1304[var13];
						field1139[field1138] = var10;
						field1140[field1138] = var11;
						field1138++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method381() {
		for (int var1 = 0; var1 < field1029; var1++) {
			int var2 = field1030[var1];
			class25 var3 = field1028[var2];
			if (var3 != null) {
				method382(var3, var3.field320.field741);
			}
		}
	}

	@ObfuscatedName("client.a(ILx;I)V")
	public final void method382(class24 arg0, int arg1) {
		if (arg0.field268 < 128 || arg0.field269 < 128 || arg0.field268 >= 13184 || arg0.field269 >= 13184) {
			arg0.field295 = -1;
			arg0.field300 = -1;
			arg0.field309 = 0;
			arg0.field310 = 0;
			arg0.field268 = arg0.field316[0] * 128 + arg0.field272 * 64;
			arg0.field269 = arg0.field317[0] * 128 + arg0.field272 * 64;
			arg0.field315 = 0;
		}

		if (field1303 == arg0 && (arg0.field268 < 1536 || arg0.field269 < 1536 || arg0.field268 >= 11776 || arg0.field269 >= 11776)) {
			arg0.field295 = -1;
			arg0.field300 = -1;
			arg0.field309 = 0;
			arg0.field310 = 0;
			arg0.field268 = arg0.field316[0] * 128 + arg0.field272 * 64;
			arg0.field269 = arg0.field317[0] * 128 + arg0.field272 * 64;
			arg0.field315 = 0;
		}

		if (arg0.field309 > field1266) {
			method383(arg0);
		} else if (arg0.field310 >= field1266) {
			method384(arg0);
		} else {
			method385(arg0);
		}

		method386(arg0);
		method387(arg0);
	}

	@ObfuscatedName("client.a(Lx;I)V")
	public final void method383(class24 arg0) {
		int var2 = arg0.field309 - field1266;
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

	@ObfuscatedName("client.a(BLx;)V")
	public final void method384(class24 arg0) {
		if (field1266 == arg0.field310 || arg0.field295 == -1 || arg0.field298 != 0 || arg0.field297 + 1 > class62.field893[arg0.field295].field897[arg0.field296]) {
			int var2 = arg0.field310 - arg0.field309;
			int var3 = field1266 - arg0.field309;
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

	@ObfuscatedName("client.a(ILx;)V")
	public final void method385(class24 arg0) {
		arg0.field292 = arg0.field273;
		if (arg0.field315 == 0) {
			arg0.field319 = 0;
		} else {
			if (arg0.field295 != -1 && arg0.field298 == 0) {
				class62 var2 = class62.field893[arg0.field295];
				if (var2.field899 == null) {
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

	@ObfuscatedName("client.b(Lx;I)V")
	public final void method386(class24 arg0) {
		if (arg0.field289 != -1 && arg0.field289 < 32768) {
			class25 var2 = field1028[arg0.field289];
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
			if (field1158 == var5) {
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
			int var9 = arg0.field268 - (arg0.field290 - field954 - field954) * 64;
			int var10 = arg0.field269 - (arg0.field291 - field955 - field955) * 64;
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

	@ObfuscatedName("client.a(ZLx;)V")
	public final void method387(class24 arg0) {
		arg0.field271 = false;

		if (arg0.field292 != -1) {
			class62 var2 = class62.field893[arg0.field292];
			arg0.field294++;
			if (arg0.field293 < var2.field894 && arg0.field294 > var2.field897[arg0.field293]) {
				arg0.field294 = 0;
				arg0.field293++;
			}

			if (arg0.field293 >= var2.field894) {
				arg0.field294 = 0;
				arg0.field293 = 0;
			}
		}

		if (arg0.field295 != -1 && arg0.field298 == 0) {
			class62 var3 = class62.field893[arg0.field295];
			arg0.field297++;
			while (arg0.field296 < var3.field894 && arg0.field297 > var3.field897[arg0.field296]) {
				arg0.field297 -= var3.field897[arg0.field296];
				arg0.field296++;
			}

			if (arg0.field296 >= var3.field894) {
				arg0.field296 -= var3.field898;
				arg0.field299++;
				if (arg0.field299 >= var3.field904) {
					arg0.field295 = -1;
				}

				if (arg0.field296 < 0 || arg0.field296 >= var3.field894) {
					arg0.field295 = -1;
				}
			}

			arg0.field271 = var3.field900;
		}

		if (arg0.field298 > 0) {
			arg0.field298--;
		}

		if (arg0.field300 != -1 && field1266 >= arg0.field303) {
			if (arg0.field301 < 0) {
				arg0.field301 = 0;
			}

			class62 var4 = class63.field906[arg0.field300].field909;
			arg0.field302++;
			while (arg0.field301 < var4.field894 && arg0.field302 > var4.field897[arg0.field301]) {
				arg0.field302 -= var4.field897[arg0.field301];
				arg0.field301++;
			}

			if (arg0.field301 >= var4.field894) {
				if (arg0.field301 < 0 || arg0.field301 >= var4.field894) {
					arg0.field300 = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method388() {
		if (field1130) {
			field1130 = false;
			field1181.method235(field8, 0, 11);
			field1182.method235(field8, 0, 375);
			field1183.method235(field8, 729, 5);
			field1184.method235(field8, 752, 231);
			field1185.method235(field8, 0, 0);
			field1186.method235(field8, 561, 0);
			field1187.method235(field8, 520, 11);
			field1188.method235(field8, 520, 231);
			field1189.method235(field8, 501, 375);
			field1190.method235(field8, 0, 345);
			field1074 = true;
			field1223 = true;
			field1225 = true;
			field1169 = true;

			if (field948 != 2) {
				field1234.method235(field8, 8, 11);
				field1233.method235(field8, 561, 5);
			}
		}

		if (field948 == 2) {
			method416();
		}

		if (field1067 && field1148 == 1) {
			field1074 = true;
		}

		if (field982 != -1) {
			boolean var1 = method447(field1031, field982);
			if (var1) {
				field1074 = true;
			}
		}

		if (field1298 == 2) {
			field1074 = true;
		}

		if (field1164 == 2) {
			field1074 = true;
		}

		if (field1074) {
			method443();
			field1074 = false;
		}

		if (field1024 == -1) {
			field1279.field846 = field1049 - field1294 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method465(false, field16 - 375, field1279, 0, 463, field1049, 77, field15 - 22);
			}

			int var2 = field1049 - field1279.field846 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1049 - 77) {
				var2 = field1049 - 77;
			}

			if (field1294 != var2) {
				field1294 = var2;
				field1223 = true;
			}

			field1107++;
			if (field1107 > 87) {
				field1107 = 0;
				field1034.method197(108);
			}
		}

		if (field1024 != -1) {
			boolean var3 = method447(field1031, field1024);
			if (var3) {
				field1223 = true;
			}
		}

		if (field1298 == 3) {
			field1223 = true;
		}

		if (field1164 == 3) {
			field1223 = true;
		}

		if (field1036 != null) {
			field1223 = true;
		}

		if (field1223) {
			method401();
			field1223 = false;
		}

		if (field948 == 2) {
			if (field1101 && field1113 == 0 && field1266 - field1219 > 25) {
				field1219 = field1266;
				field1218 = 1 - field1218;
				if (field1218 == 0) {
					method389();
				} else {
					field1233.method235(field8, 561, 5);
				}
			}

			if (!field1101) {
				method389();
				field1233.method235(field8, 561, 5);
			}
		}

		if (field1136 != -1) {
			field1225 = true;
		}

		if (field1225) {
			if (field1136 != -1 && field1229 == field1136) {
				field1136 = -1;
				field1034.method197(193);
				field1034.method198(field1229);
			}

			field1225 = false;
			field1062.method234();
			field1023.method185(0, 0);

			if (field982 == -1) {
				if (field1212[field1229] != -1) {
					if (field1229 == 0) {
						field1120.method185(29, 30);
					}

					if (field1229 == 1) {
						field1121.method185(59, 29);
					}

					if (field1229 == 2) {
						field1121.method185(87, 29);
					}

					if (field1229 == 3) {
						field1122.method185(115, 29);
					}

					if (field1229 == 4) {
						field1124.method185(156, 29);
					}

					if (field1229 == 5) {
						field1124.method185(184, 29);
					}

					if (field1229 == 6) {
						field1123.method185(212, 30);
					}
				}

				if (field1212[0] != -1 && (field1136 != 0 || field1266 % 20 < 10)) {
					field1178[0].method185(35, 34);
				}

				if (field1212[1] != -1 && (field1136 != 1 || field1266 % 20 < 10)) {
					field1178[1].method185(59, 32);
				}

				if (field1212[2] != -1 && (field1136 != 2 || field1266 % 20 < 10)) {
					field1178[2].method185(86, 32);
				}

				if (field1212[3] != -1 && (field1136 != 3 || field1266 % 20 < 10)) {
					field1178[3].method185(121, 33);
				}

				if (field1212[4] != -1 && (field1136 != 4 || field1266 % 20 < 10)) {
					field1178[4].method185(157, 34);
				}

				if (field1212[5] != -1 && (field1136 != 5 || field1266 % 20 < 10)) {
					field1178[5].method185(185, 32);
				}

				if (field1212[6] != -1 && (field1136 != 6 || field1266 % 20 < 10)) {
					field1178[6].method185(212, 34);
				}
			}

			field1062.method235(field8, 520, 165);
			field1061.method234();
			field1022.method185(0, 0);

			if (field982 == -1) {
				if (field1212[field1229] != -1) {
					if (field1229 == 7) {
						field985.method185(49, 0);
					}

					if (field1229 == 8) {
						field986.method185(81, 0);
					}

					if (field1229 == 9) {
						field986.method185(108, 0);
					}

					if (field1229 == 10) {
						field987.method185(136, 1);
					}

					if (field1229 == 11) {
						field989.method185(178, 0);
					}

					if (field1229 == 12) {
						field989.method185(205, 0);
					}

					if (field1229 == 13) {
						field988.method185(233, 0);
					}
				}

				if (field1212[8] != -1 && (field1136 != 8 || field1266 % 20 < 10)) {
					field1178[7].method185(80, 2);
				}

				if (field1212[9] != -1 && (field1136 != 9 || field1266 % 20 < 10)) {
					field1178[8].method185(107, 3);
				}

				if (field1212[10] != -1 && (field1136 != 10 || field1266 % 20 < 10)) {
					field1178[9].method185(142, 4);
				}

				if (field1212[11] != -1 && (field1136 != 11 || field1266 % 20 < 10)) {
					field1178[10].method185(179, 2);
				}

				if (field1212[12] != -1 && (field1136 != 12 || field1266 % 20 < 10)) {
					field1178[11].method185(206, 2);
				}

				if (field1212[13] != -1 && (field1136 != 13 || field1266 % 20 < 10)) {
					field1178[12].method185(230, 2);
				}
			}

			field1061.method235(field8, 501, 492);
			field1234.method234();
		}

		if (field1169) {
			field1169 = false;
			field1060.method234();
			field1021.method185(0, 0);
			field1171.method188(33, "Public chat", 0xFFFFFF, true, 57);

			if (field958 == 0) {
				field1171.method188(46, "On", 0xFF00, true, 57);
			}

			if (field958 == 1) {
				field1171.method188(46, "Friends", 0xFFFF00, true, 57);
			}

			if (field958 == 2) {
				field1171.method188(46, "Off", 0xFF0000, true, 57);
			}

			field1171.method188(33, "Private chat", 0xFFFFFF, true, 186);

			if (field1081 == 0) {
				field1171.method188(46, "On", 0xFF00, true, 186);
			}

			if (field1081 == 1) {
				field1171.method188(46, "Friends", 0xFFFF00, true, 186);
			}

			if (field1081 == 2) {
				field1171.method188(46, "Off", 0xFF0000, true, 186);
			}

			field1171.method188(33, "Trade/duel", 0xFFFFFF, true, 326);

			if (field1308 == 0) {
				field1171.method188(46, "On", 0xFF00, true, 326);
			}

			if (field1308 == 1) {
				field1171.method188(46, "Friends", 0xFFFF00, true, 326);
			}

			if (field1308 == 2) {
				field1171.method188(46, "Off", 0xFF0000, true, 326);
			}

			field1171.method188(38, "Report abuse", 0xFFFFFF, true, 462);
			field1060.method235(field8, 0, 471);
			field1234.method234();
		}

		field1031 = 0;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method389() {
		field1233.method234();
		int var1 = field1303.field268 / 32 + 48;
		int var2 = 464 - field1303.field269 / 32;
		field1242.method178(var1, field1135, field1112, 9, var2, 151, 146, 21, field1283);
		field1301.method178(25, field1293, field1112, 0, 25, 33, 33, 0, field1127);

		for (int var3 = 0; var3 < field1138; var3++) {
			int var4 = field1139[var3] * 4 + 2 - field1303.field268 / 32;
			int var5 = field1140[var3] * 4 + 2 - field1303.field269 / 32;
			method438(var4, field1045[var3], var5);
		}

		for (int var6 = 0; var6 < 104; var6++) {
			for (int var7 = 0; var7 < 104; var7++) {
				class41 var8 = field1097[field1180][var6][var7];
				if (var8 != null) {
					int var9 = var6 * 4 + 2 - field1303.field268 / 32;
					int var10 = var7 * 4 + 2 - field1303.field269 / 32;
					method438(var9, field1246, var10);
				}
			}
		}

		for (int var11 = 0; var11 < field1029; var11++) {
			class25 var12 = field1028[field1030[var11]];
			if (var12 != null && var12.method110() && var12.field320.field756) {
				int var13 = var12.field268 / 32 - field1303.field268 / 32;
				int var14 = var12.field269 / 32 - field1303.field269 / 32;
				method438(var13, field1247, var14);
			}
		}

		for (int var15 = 0; var15 < field963; var15++) {
			class26 var16 = field962[field964[var15]];
			if (var16 != null && var16.method110()) {
				int var17 = var16.field268 / 32 - field1303.field268 / 32;
				int var18 = var16.field269 / 32 - field1303.field269 / 32;
				boolean var19 = false;
				long var20 = class48.method250(var16.field321);
				for (int var22 = 0; var22 < field1084; var22++) {
					if (field1278[var22] == var20 && field1007[var22] != 0) {
						var19 = true;
						break;
					}
				}

				if (var19) {
					method438(var17, field1249, var18);
				} else {
					method438(var17, field1248, var18);
				}
			}
		}

		if (field1240 != 0) {
			int var23 = field1240 * 4 + 2 - field1303.field268 / 32;
			int var24 = field1241 * 4 + 2 - field1303.field269 / 32;
			method438(var23, field1176, var24);
		}

		class32.method148(0xFFFFFF, 82, 93, 3, 3);
		field1234.method234();
	}

	@ObfuscatedName("client.f(I)V")
	public final void method10() {
		field1130 = true;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method390() {
		for (class27 var1 = (class27) field1073.method227(); var1 != null; var1 = (class27) field1073.method229()) {
			if (field1180 != var1.field343 || field1266 > var1.field349) {
				var1.method106();
			} else if (field1266 >= var1.field348) {
				if (var1.field352 > 0) {
					class25 var2 = field1028[var1.field352 - 1];
					if (var2 != null) {
						var1.method115(var2.field269, method419(var1.field343, var2.field268, var2.field269) - var1.field347, field1266, var2.field268);
					}
				}

				if (var1.field352 < 0) {
					int var3 = -var1.field352 - 1;
					class26 var4;
					if (field1158 == var3) {
						var4 = field1303;
					} else {
						var4 = field962[var3];
					}

					if (var4 != null) {
						var1.method115(var4.field269, method419(var1.field343, var4.field268, var4.field269) - var1.field347, field1266, var4.field268);
					}
				}

				var1.method116(field1031);
				field992.method61(var1.field362, var1, null, -1, (int) var1.field354, false, 60, field1180, (int) var1.field355, (int) var1.field356);
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method391() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1230) {
			field1076 = false;
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

		if (field1108) {
			field1076 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1287) {
			field1076 = false;
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

	@ObfuscatedName("client.g(B)V")
	public final void method392() {
		if (field1286 == 0) {
			int var1 = field6 / 2;
			int var2 = field7 / 2 + 90;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field993 = "";
				field994 = "Enter your username & password.";
				field1286 = 2;
				field1141 = 0;
			}
		} else if (field1286 == 2) {
			int var3 = field7 / 2 - 30;
			var3 += 30;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1141 = 0;
			}

			var3 += 15;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1141 = 1;
			}

			var3 += 15;
			int var4 = field6 / 2 - 80;
			int var5 = field7 / 2 + 60;
			if (field17 == 1 && field18 >= var4 - 75 && field18 <= var4 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				method406(field1167, field1168, false);
			}

			int var6 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var6 - 75 && field18 <= var6 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				field1286 = 0;
				field1167 = "";
				field1168 = "";
			}

			while (true) {
				int var7;
				boolean var8;
				var7 = method5();
				if (var7 == -1) {
					return;
				}

				var8 = false;
				for (int var9 = 0; var9 < field1270.length(); var9++) {
					if (var7 == field1270.charAt(var9)) {
						var8 = true;
						break;
					}
				}

				if (field1141 == 0) {
					if (var7 == 8 && field1167.length() > 0) {
						field1167 = field1167.substring(0, field1167.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1141 = 1;
					}

					if (var8) {
						field1167 = field1167 + (char) var7;
					}

					if (field1167.length() > 12) {
						field1167 = field1167.substring(0, 12);
					}
				} else if (field1141 == 1) {
					if (var7 == 8 && field1168.length() > 0) {
						field1168 = field1168.substring(0, field1168.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1141 = 0;
					}

					if (var8) {
						field1168 = field1168 + (char) var7;
					}

					if (field1168.length() > 20) {
						field1168 = field1168.substring(0, 20);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method393() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231 && field1212[0] != -1) {
				field1074 = true;
				field1229 = 0;
				field1225 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231 && field1212[1] != -1) {
				field1074 = true;
				field1229 = 1;
				field1225 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231 && field1212[2] != -1) {
				field1074 = true;
				field1229 = 2;
				field1225 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229 && field1212[3] != -1) {
				field1074 = true;
				field1229 = 3;
				field1225 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231 && field1212[4] != -1) {
				field1074 = true;
				field1229 = 4;
				field1225 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231 && field1212[5] != -1) {
				field1074 = true;
				field1229 = 5;
				field1225 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231 && field1212[6] != -1) {
				field1074 = true;
				field1229 = 6;
				field1225 = true;
			}

			if (field18 >= 550 && field18 <= 584 && field19 >= 492 && field19 < 528 && field1212[7] != -1) {
				field1074 = true;
				field1229 = 7;
				field1225 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529 && field1212[8] != -1) {
				field1074 = true;
				field1229 = 8;
				field1225 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529 && field1212[9] != -1) {
				field1074 = true;
				field1229 = 9;
				field1225 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528 && field1212[10] != -1) {
				field1074 = true;
				field1229 = 10;
				field1225 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529 && field1212[11] != -1) {
				field1074 = true;
				field1229 = 11;
				field1225 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529 && field1212[12] != -1) {
				field1074 = true;
				field1229 = 12;
				field1225 = true;
			}

			if (field18 >= 734 && field18 <= 768 && field19 >= 492 && field19 < 528 && field1212[13] != -1) {
				field1074 = true;
				field1229 = 13;
				field1225 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILz;III)V")
	public final void method394(int arg0, class26 arg1, int arg2, int arg3) {
		if (field1303 != arg1 && field983 < 400) {
			String var5 = arg1.field321 + method473(arg1.field327, field1303.field327) + " (level-" + arg1.field327 + ")";
			if (field1009 == 1) {
				field1125[field983] = "Use " + field1013 + " with @whi@" + var5;
				field1318[field983] = 65;
				field1319[field983] = arg2;
				field1316[field983] = arg0;
				field1317[field983] = arg3;
				field983++;
			} else if (field1001 != 1) {
				field1125[field983] = "Follow @whi@" + var5;
				field1318[field983] = 1958;
				field1319[field983] = arg2;
				field1316[field983] = arg0;
				field1317[field983] = arg3;
				field983++;
				if (field1269 == 0) {
					field1125[field983] = "Trade with @whi@" + var5;
					field1318[field983] = 1390;
					field1319[field983] = arg2;
					field1316[field983] = arg0;
					field1317[field983] = arg3;
					field983++;
				}

				if (field1109 > 0) {
					field1125[field983] = "Attack @whi@" + var5;

					if (field1303.field327 >= arg1.field327) {
						field1318[field983] = 905;
					} else {
						field1318[field983] = 2905;
					}

					field1319[field983] = arg2;
					field1316[field983] = arg0;
					field1317[field983] = arg3;
					field983++;
				}

				if (field1131 == 1) {
					field1125[field983] = "Fight @whi@" + var5;
					field1318[field983] = 905;
					field1319[field983] = arg2;
					field1316[field983] = arg0;
					field1317[field983] = arg3;
					field983++;
				}

				if (field1131 == 2) {
					field1125[field983] = "Duel-with @whi@" + var5;
					field1318[field983] = 656;
					field1319[field983] = arg2;
					field1316[field983] = arg0;
					field1317[field983] = arg3;
					field983++;
				}
			} else if ((field1003 & 0x8) == 8) {
				field1125[field983] = field1004 + " @whi@" + var5;
				field1318[field983] = 92;
				field1319[field983] = arg2;
				field1316[field983] = arg0;
				field1317[field983] = arg3;
				field983++;
			}

			for (int var6 = 0; var6 < field983; var6++) {
				if (field1318[var6] == 256) {
					field1125[var6] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method395(int arg0) {
		if (arg0 >= 0) {
			if (field1137) {
				field1137 = false;
				field1223 = true;
			}

			int var2 = field1316[arg0];
			int var3 = field1317[arg0];
			int var4 = field1318[arg0];
			int var5 = field1319[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 825 && method379(var3, 43, var2, var5)) {
				field1034.method199(field1012);
				field1034.method199(field1010);
				field1034.method199(field1011);
			}

			if (var4 == 238) {
				class60 var6 = class60.field827[var3];
				boolean var7 = true;
				if (var6.field836 > 0) {
					var7 = method439(var6);
				}

				if (var7) {
					field1034.method197(203);
					field1034.method199(var3);
				}
			}

			if (var4 == 771 && method379(var3, 109, var2, var5)) {
				field1034.method199(field1002);
			}

			if (var4 == 788) {
				boolean var8 = method434(false, var3, field1303.field316[0], 0, 0, field1303.field317[0], 0, 0, 0, var2);
				if (!var8) {
					method434(false, var3, field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var2);
				}

				field1068 = field18;
				field1069 = field19;
				field1071 = 2;
				field1070 = 0;
				field1034.method197(88);
				field1034.method199(field954 + var2);
				field1034.method199(field955 + var3);
				field1034.method199(var5);
				field1034.method199(field1002);
			}

			if (var4 == 106) {
				boolean var10 = method434(false, var3, field1303.field316[0], 0, 0, field1303.field317[0], 0, 0, 0, var2);
				if (!var10) {
					method434(false, var3, field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var2);
				}

				field1068 = field18;
				field1069 = field19;
				field1071 = 2;
				field1070 = 0;
				field1034.method197(31);
				field1034.method199(field954 + var2);
				field1034.method199(field955 + var3);
				field1034.method199(var5);
				field1034.method199(field1012);
				field1034.method199(field1010);
				field1034.method199(field1011);
			}

			if (var4 == 779) {
				field1034.method197(203);
				field1034.method199(var3);
				class60 var12 = class60.field827[var3];
				if (var12.field841 != null && var12.field841[0][0] == 5) {
					int var13 = var12.field841[0][1];
					if (field1018[var13] != var12.field843[0]) {
						field1018[var13] = var12.field843[0];
						method372(var13);
						field1074 = true;
					}
				}
			}

			if (var4 == 1387) {
				int var14 = var5 >> 14 & 0x7FFF;
				class53 var15 = class53.method274(var14);
				String var16;
				if (var15.field702 == null) {
					var16 = "It's a " + var15.field701 + ".";
				} else {
					var16 = new String(var15.field702);
				}

				method375(0, var16, "");
			}

			if (var4 == 129) {
				class25 var17 = field1028[var5];
				if (var17 != null) {
					method434(false, var17.field317[0], field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var17.field316[0]);
					field1068 = field18;
					field1069 = field19;
					field1071 = 2;
					field1070 = 0;
					field1034.method197(139);
					field1034.method199(var5);
					field1034.method199(field1002);
				}
			}

			if (var4 == 1536) {
				class55 var18 = class55.method286(var5);
				String var19;
				if (var18.field770 == null) {
					var19 = "It's a " + var18.field769 + ".";
				} else {
					var19 = new String(var18.field770);
				}

				method375(0, var19, "");
			}

			if (var4 == 688) {
				class25 var20 = field1028[var5];
				if (var20 != null) {
					method434(false, var20.field317[0], field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var20.field316[0]);
					field1068 = field18;
					field1069 = field19;
					field1071 = 2;
					field1070 = 0;
					field1034.method197(106);
					field1034.method199(var5);
					field1034.method199(field1012);
					field1034.method199(field1010);
					field1034.method199(field1011);
				}
			}

			if (var4 == 278) {
				field1034.method197(42);
				field1034.method199(var5);
				field1034.method199(var2);
				field1034.method199(var3);
				field1034.method199(field1012);
				field1034.method199(field1010);
				field1034.method199(field1011);
				field1295 = 0;
				field1296 = var3;
				field1297 = var2;
				field1298 = 2;
				if (class60.field827[var3].field833 == field1086) {
					field1298 = 1;
				}

				if (class60.field827[var3].field833 == field1024) {
					field1298 = 3;
				}
			}

			if (var4 == 382 || var4 == 635 || var4 == 939 || var4 == 274 || var4 == 618) {
				if (var4 == 635) {
					field1034.method197(145);
				}

				if (var4 == 939) {
					field1044++;
					if (field1044 >= 62) {
						field1034.method197(208);
						field1034.method198(142);
					}

					field1034.method197(63);
				}

				if (var4 == 382) {
					field1017 += var5;
					if (field1017 >= 76) {
						field1034.method197(112);
						field1034.method198(171);
					}

					field1034.method197(255);
				}

				if (var4 == 274) {
					field1034.method197(59);
				}

				if (var4 == 618) {
					if ((var5 & 0x3) == 0) {
						field1040++;
					}

					if (field1040 >= 124) {
						field1034.method197(236);
						field1034.method202(0);
					}

					field1034.method197(163);
				}

				field1034.method199(var5);
				field1034.method199(var2);
				field1034.method199(var3);
				field1295 = 0;
				field1296 = var3;
				field1297 = var2;
				field1298 = 2;
				if (class60.field827[var3].field833 == field1086) {
					field1298 = 1;
				}

				if (class60.field827[var3].field833 == field1024) {
					field1298 = 3;
				}
			}

			if (var4 == 1390 || var4 == 1958 || var4 == 905 || var4 == 656) {
				class26 var21 = field962[var5];
				if (var21 != null) {
					method434(false, var21.field317[0], field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var21.field316[0]);
					field1068 = field18;
					field1069 = field19;
					field1071 = 2;
					field1070 = 0;

					if (var4 == 1958) {
						if ((var5 & 0x3) == 0) {
							field1201++;
						}

						if (field1201 >= 139) {
							field1034.method197(111);
							field1034.method202(0);
						}

						field1034.method197(3);
					}

					if (var4 == 656) {
						field1034.method197(50);
					}

					if (var4 == 1390) {
						field1034.method197(232);
					}

					if (var4 == 905) {
						field1034.method197(12);
					}

					field1034.method199(var5);
				}
			}

			if (var4 == 71 || var4 == 897 || var4 == 500 || var4 == 837 || var4 == 460) {
				if (var4 == 897) {
					field1034.method197(227);
				}

				if (var4 == 460) {
					field1034.method197(5);
				}

				if (var4 == 837) {
					field1034.method197(180);
				}

				if (var4 == 71) {
					field1034.method197(61);
				}

				if (var4 == 500) {
					field1034.method197(10);
				}

				field1034.method199(var5);
				field1034.method199(var2);
				field1034.method199(var3);
				field1295 = 0;
				field1296 = var3;
				field1297 = var2;
				field1298 = 2;
				if (class60.field827[var3].field833 == field1086) {
					field1298 = 1;
				}

				if (class60.field827[var3].field833 == field1024) {
					field1298 = 3;
				}
			}

			if (var4 == 782) {
				field1080 += var3;
				if (field1080 >= 132) {
					field1034.method197(231);
					field1034.method199(17379);
				}

				method379(var3, 242, var2, var5);
			}

			if (var4 == 68) {
				method379(var3, 171, var2, var5);
			}

			if (var4 == 975) {
				method431();
			}

			if (var4 == 215) {
				field1009 = 1;
				field1010 = var2;
				field1011 = var3;
				field1012 = var5;
				field1013 = class55.method286(var5).field769;
				field1001 = 0;
			} else {
				if (var4 == 45) {
					field1034.method197(174);
					field1034.method199(var5);
					field1034.method199(var2);
					field1034.method199(var3);
					field1034.method199(field1002);
					field1295 = 0;
					field1296 = var3;
					field1297 = var2;
					field1298 = 2;
					if (class60.field827[var3].field833 == field1086) {
						field1298 = 1;
					}

					if (class60.field827[var3].field833 == field1024) {
						field1298 = 3;
					}
				}

				if (var4 == 943) {
					field950++;
					if (field950 >= 135) {
						field1034.method197(85);
						field1034.method199(10151);
					}

					method379(var3, 140, var2, var5);
				}

				if (var4 == 614 || var4 == 719 || var4 == 969 || var4 == 890 || var4 == 983) {
					class25 var22 = field1028[var5];
					if (var22 != null) {
						method434(false, var22.field317[0], field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var22.field316[0]);
						field1068 = field18;
						field1069 = field19;
						field1071 = 2;
						field1070 = 0;

						if (var4 == 890) {
							field1034.method197(33);
						}

						if (var4 == 983) {
							field1034.method197(175);
						}

						if (var4 == 614) {
							field1034.method197(122);
						}

						if (var4 == 969) {
							field1034.method197(87);
						}

						if (var4 == 719) {
							field1089 += var5;
							if (field1089 >= 116) {
								field1034.method197(121);
							}

							field1034.method197(60);
						}

						field1034.method199(var5);
					}
				}

				if (var4 == 256) {
					if (field1067) {
						field992.method88(var2 - 8, var3 - 11);
					} else {
						field992.method88(field18 - 8, field19 - 11);
					}
				}

				if (var4 == 409) {
					class60 var23 = class60.field827[var3];
					field1001 = 1;
					field1002 = var3;
					field1003 = var23.field882;
					field1009 = 0;
					String var24 = var23.field880;
					if (var24.indexOf(" ") != -1) {
						var24 = var24.substring(0, var24.indexOf(" "));
					}

					String var25 = var23.field880;
					if (var25.indexOf(" ") != -1) {
						var25 = var25.substring(var25.indexOf(" ") + 1);
					}

					field1004 = var24 + " " + var23.field881 + " " + var25;

					if (field1003 == 16) {
						field1074 = true;
						field1229 = 3;
						field1225 = true;
					}
				} else {
					if (var4 == 393) {
						method379(var3, 51, var2, var5);
					}

					if (var4 == 653) {
						method379(var3, 62, var2, var5);
					}

					if (var4 == 1654) {
						class55 var26 = class55.method286(var5);
						String var27;
						if (var3 >= 100000) {
							var27 = var3 + " x " + var26.field769;
						} else if (var26.field770 == null) {
							var27 = "It's a " + var26.field769 + ".";
						} else {
							var27 = new String(var26.field770);
						}

						method375(0, var27, "");
					}

					if (var4 == 785 && !field968) {
						field1034.method197(197);
						field1034.method199(var3);
						field968 = true;
					}

					if (var4 == 261) {
						field1034.method197(203);
						field1034.method199(var3);
						class60 var28 = class60.field827[var3];
						if (var28.field841 != null && var28.field841[0][0] == 5) {
							int var29 = var28.field841[0][1];
							field1018[var29] = 1 - field1018[var29];
							method372(var29);
							field1074 = true;
						}
					}

					if (var4 == 1586) {
						class25 var30 = field1028[var5];
						if (var30 != null) {
							String var31;
							if (var30.field320.field740 == null) {
								var31 = "It's a " + var30.field320.field739 + ".";
							} else {
								var31 = new String(var30.field320.field740);
							}

							method375(0, var31, "");
						}
					}

					if (var4 == 308 || var4 == 445 || var4 == 848 || var4 == 221 || var4 == 273) {
						boolean var32 = method434(false, var3, field1303.field316[0], 0, 0, field1303.field317[0], 0, 0, 0, var2);
						if (!var32) {
							method434(false, var3, field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var2);
						}

						field1068 = field18;
						field1069 = field19;
						field1071 = 2;
						field1070 = 0;

						if (var4 == 445) {
							field1034.method197(17);
						}

						if (var4 == 221) {
							field1034.method197(69);
						}

						if (var4 == 273) {
							field1309++;
							if (field1309 >= 121) {
								field1034.method197(210);
								field1034.method198(128);
							}

							field1034.method197(135);
						}

						if (var4 == 848) {
							field1034.method197(55);
						}

						if (var4 == 308) {
							field1034.method197(239);
						}

						field1034.method199(field954 + var2);
						field1034.method199(field955 + var3);
						field1034.method199(var5);
					}

					if (var4 == 92) {
						class26 var34 = field962[var5];
						if (var34 != null) {
							method434(false, var34.field317[0], field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var34.field316[0]);
							field1068 = field18;
							field1069 = field19;
							field1071 = 2;
							field1070 = 0;
							field1034.method197(4);
							field1034.method199(var5);
							field1034.method199(field1002);
						}
					}

					if (var4 == 65) {
						class26 var35 = field962[var5];
						if (var35 != null) {
							method434(false, var35.field317[0], field1303.field316[0], 1, 1, field1303.field317[0], 0, 0, 0, var35.field316[0]);
							field1068 = field18;
							field1069 = field19;
							field1071 = 2;
							field1070 = 0;
							field1034.method197(100);
							field1034.method199(var5);
							field1034.method199(field1012);
							field1034.method199(field1010);
							field1034.method199(field1011);
						}
					}

					field1009 = 0;
					field1001 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method396(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1084; var2++) {
			if (arg0.equalsIgnoreCase(field998[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1303.field321)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method397() {
		method377();
		field971.method234();
		field1087.method185(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1286 == 0) {
			int var3 = var2 / 2 - 80;
			field1172.method188(var3, "Welcome to the RuneScape-2 BETA test.", 0xFFFF00, true, var1 / 2);
			var3 += 15;
			var3 += 15;
			field1170.method188(var3, "Please note this test version of the game is provided for ", 0xFFFFFF, true, var1 / 2);
			var3 += 15;
			field1170.method188(var3, "testing/preview purposes only. As such please bear in mind that:", 0xFFFFFF, true, var1 / 2);
			var3 += 15;
			var3 += 10;
			field1170.method188(var3, "a) Everything you do/gain here will be forgotten when the beta ends.", 0xFFFFFF, true, var1 / 2);
			var3 += 15;
			field1170.method188(var3, "b) No customer support is available for the beta.", 0xFFFFFF, true, var1 / 2);
			var3 += 15;
			field1170.method188(var3, "c) The beta may be incomplete/buggy, we're still working on it.", 0xFFFFFF, true, var1 / 2);
			var3 += 15;
			field1170.method188(var3, "d) The beta may be totally unavailable at times.", 0xFFFFFF, true, var1 / 2);
			var3 += 15;
			int var4 = var1 / 2;
			int var5 = var2 / 2 + 65;
			field1088.method185(var4 - 73, var5 - 20);
			field1172.method188(var5 + 5, "Click here to login.", 0xFFFFFF, true, var1 / 2);
		}

		if (field1286 == 2) {
			int var6 = var2 / 2 - 50;
			if (field993.length() > 0) {
				field1172.method188(var6 - 15, field993, 0xFFFF00, true, var1 / 2);
				field1172.method188(var6, field994, 0xFFFF00, true, var1 / 2);
				var6 += 30;
			} else {
				field1172.method188(var6 - 7, field994, 0xFFFF00, true, var1 / 2);
				var6 += 30;
			}

			field1172.method192(true, 0xFFFFFF, var1 / 2 - 90, var6, "Username: " + field1167 + (field1141 == 0 & field1266 % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			field1172.method192(true, 0xFFFFFF, var1 / 2 - 88, var6, "Password: " + class48.method256(field1168) + (field1141 == 1 & field1266 % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			int var7 = var1 / 2 - 80;
			int var8 = var2 / 2 + 40;
			field1088.method185(var7 - 73, var8 - 20);
			field1172.method188(var8 + 5, "Login", 0xFFFFFF, true, var7);
			int var9 = var1 / 2 + 80;
			field1088.method185(var9 - 73, var8 - 20);
			field1172.method188(var8 + 5, "Cancel", 0xFFFFFF, true, var9);
		}

		field971.method235(field8, 214, 186);

		if (field1130) {
			field1130 = false;
			field969.method235(field8, 128, 0);
			field970.method235(field8, 214, 386);
			field974.method235(field8, 0, 265);
			field975.method235(field8, 574, 265);
			field976.method235(field8, 128, 186);
			field977.method235(field8, 574, 186);
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method398() {
		if (field1200 == 2) {
			method472(field1104 * 2, (field1103 - field955 << 7) + field1106, (field1102 - field954 << 7) + field1105);

			if (field1280 > -1 && field1266 % 20 < 10) {
				field1300[2].method172(field1280 - 12, field1281 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(BLib;)V")
	public final void method399(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1091.length; var3++) {
			field1091[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1091[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1092[var9] = (field1091[var9 - 1] + field1091[var9 + 1] + field1091[var9 - 128] + field1091[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1091;
			field1091 = field1092;
			field1092 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field525; var12++) {
				for (int var13 = 0; var13 < arg0.field524; var13++) {
					if (arg0.field522[var11++] != 0) {
						int var14 = var13 + arg0.field526 + 16;
						int var15 = var12 + arg0.field527 + 16;
						int var16 = (var15 << 7) + var14;
						field1091[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method400(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.n(I)V")
	public final void method401() {
		field1235.method234();
		class33.field503 = field1197;
		field1144.method185(0, 0);

		if (field1177) {
			field1172.method187(field1215, 40, 239, 0);
			field1172.method187(field1042 + "*", 60, 239, 128);
		} else if (field1137) {
			field1172.method187("Enter amount to transfer:", 40, 239, 0);
			field1172.method187(field1077 + "*", 60, 239, 128);
		} else if (field1036 != null) {
			field1172.method187(field1036, 40, 239, 0);
			field1172.method187("Click to continue", 60, 239, 128);
		} else if (field1024 != -1) {
			method469(0, class60.field827[field1024], 0, 0);
		} else if (field1145 == -1) {
			class36 var1 = field1171;
			int var2 = 0;
			class32.method146(0, 0, 463, 77);

			for (int var3 = 0; var3 < 50; var3++) {
				if (field1026[var3] != null) {
					int var4 = field1090[var3];
					int var5 = field1294 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method190(field1026[var3], 4, var5, 0);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method190(field959[var3] + ":", 4, var5, 0xFFFFFF);
							var1.method190(field1026[var3], var1.method189(field959[var3]) + 12, var5, 255);
						}

						var2++;
					}

					if (var4 == 2 && (field958 == 0 || field958 == 1 && method396(field959[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method190(field959[var3] + ":", 4, var5, 0);
							var1.method190(field1026[var3], var1.method189(field959[var3]) + 12, var5, 255);
						}

						var2++;
					}

					if (var4 == 3 && (field1081 == 0 || field1081 == 1 && method396(field959[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method190("From " + field959[var3] + ":", 4, var5, 0);
							var1.method190(field1026[var3], var1.method189("From " + field959[var3]) + 12, var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1308 == 0 || field1308 == 1 && method396(field959[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method190(field959[var3] + " " + field1026[var3], 4, var5, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1081 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method190(field1026[var3], 4, var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1081 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method190("To " + field959[var3] + ":", 4, var5, 0);
							var1.method190(field1026[var3], var1.method189("To " + field959[var3]) + 12, var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 7) {
						if (var5 > 0 && var5 < 110) {
							var1.method190("From " + field959[var3] + ":", 4, var5, 0);
							var1.method190(field1026[var3], var1.method189("From " + field959[var3]) + 12, var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1308 == 0 || field1308 == 1 && method396(field959[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method190(field959[var3] + " " + field1026[var3], 4, var5, 0xCBB789);
						}

						var2++;
					}
				}
			}

			class32.method145();
			field1049 = var2 * 14 + 7;
			if (field1049 < 78) {
				field1049 = 78;
			}

			method404(463, field1049 - field1294 - 77, 77, 0, field1049);
			var1.method190(class48.method254(field1167) + ":", 4, 90, 0);
			var1.method190(field1025 + "*", var1.method189(field1167 + ": ") + 6, 90, 255);
			class32.method150(0, 77, 479, 0);
		} else {
			method469(0, class60.field827[field1145], 0, 0);
		}

		field1235.method235(field8, 22, 375);
		field1234.method234();
		class33.field503 = field1199;
	}

	public final void init() {
		field1098 = Integer.parseInt(getParameter("nodeid"));
		field1099 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method461();
		} else {
			method403();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1100 = false;
		} else {
			field1100 = true;
		}

		method2(789, 532);
	}

	@ObfuscatedName("client.o(I)V")
	public final void method402() {
		int var1 = field1149;
		int var2 = field1150;
		int var3 = field1151;
		int var4 = field1152;
		int var5 = 0x5D5447;
		class32.method148(var5, var2, var1, var3, var4);
		class32.method148(0, var2 + 1, var1 + 1, var3 - 2, 16);
		class32.method149(var3 - 2, 0, var2 + 18, var1 + 1, var4 - 19);
		field1172.method190("Choose Option", var1 + 3, var2 + 14, var5);
		int var6 = field15;
		int var7 = field16;
		if (field1148 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1148 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		for (int var8 = 0; var8 < field983; var8++) {
			int var9 = (field983 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1172.method192(true, var10, var1 + 3, var9, field1125[var8]);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public static final void method403() {
		class18.field194 = false;
		class33.field492 = false;
		field1101 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1227.method185(arg0, arg3);
		field1228.method185(arg0, arg2 + arg3 - 16);
		class32.method148(field1160, arg3 + 16, arg0, 16, arg2 - 32);
		int var6 = (arg2 - 32) * arg2 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg1 / (arg4 - arg2);
		class32.method148(field1157, arg3 + var7 + 16, arg0, 16, var6);
		class32.method151(var6, field1191, arg3 + var7 + 16, arg0);
		class32.method151(var6, field1191, arg3 + var7 + 16, arg0 + 1);
		class32.method150(arg0, arg3 + var7 + 16, 16, field1191);
		class32.method150(arg0, arg3 + var7 + 17, 16, field1191);
		class32.method151(var6, field1292, arg3 + var7 + 16, arg0 + 15);
		class32.method151(var6 - 1, field1292, arg3 + var7 + 17, arg0 + 14);
		class32.method150(arg0, arg3 + var7 + var6 + 15, 16, field1292);
		class32.method150(arg0 + 1, arg3 + 14 + var7 + var6, 15, field1292);
	}

	@ObfuscatedName("client.b(IZLkb;)V")
	public final void method405(int arg0, class37 arg1) {
		field1220 = 0;
		field965 = 0;
		method448(arg0, arg1);
		method441(arg1, arg0);
		method453(arg0, arg1);
		method414(arg0, arg1);

		for (int var3 = 0; var3 < field1220; var3++) {
			int var4 = field1221[var3];
			if (field1266 != field962[var4].field312) {
				field962[var4] = null;
			}
		}

		if (arg1.field540 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field540 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field963; var5++) {
			if (field962[field964[var5]] == null) {
				signlink.reporterror(field1167 + " null entry in pl list - pos:" + var5 + " size:" + field963);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method406(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field993 = "";
				field994 = "Connecting to server...";
				method397();
			}

			field1251 = new class4(method429(field1099 + 43594), this);
			field1251.method32(field1196.field539, 0, 8);
			field1196.field540 = 0;
			field1285 = field1196.method214();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1285 >> 32), (int) field1285 };
			field1034.field540 = 0;
			field1034.method198(10);
			field1034.method202(var4[0]);
			field1034.method202(var4[1]);
			field1034.method202(var4[2]);
			field1034.method202(var4[3]);
			field1034.method202(signlink.uid);
			field1034.method205(arg0);
			field1034.method205(arg1);
			field1034.method223(field1290, field1288);
			field1289.field540 = 0;

			if (arg2) {
				field1289.method198(18);
			} else {
				field1289.method198(16);
			}

			field1289.method198(field1034.field540 + 36 + 1);
			field1289.method198(204);

			for (int var5 = 0; var5 < 9; var5++) {
				field1289.method202(field1265[var5]);
			}

			field1289.method206(field1034.field540, field1034.field539, 0);
			field1034.field544 = new class46(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1195 = new class46(var4);
			field1251.method33(field1289.field539, field1289.field540, 0);
			int var7 = field1251.method30();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method406(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field1192 = true;
				} else {
					field1192 = false;
				}

				class5.method35(false);
				field1250 = true;
				field1034.field540 = 0;
				field1196.field540 = 0;
				field1253 = -1;
				field1115 = -1;
				field1116 = -1;
				field1117 = -1;
				field1252 = 0;
				field1254 = 0;
				field1047 = 0;
				field1256 = 0;
				field1200 = 0;
				field983 = 0;
				field1067 = false;
				field13 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field1026[var8] = null;
				}

				field1009 = 0;
				field1001 = 0;
				field948 = 0;
				field1236 = 0;
				field1214 = -1;
				field1240 = 0;
				field1241 = 0;
				field963 = 0;
				field1029 = 0;

				for (int var9 = 0; var9 < field960; var9++) {
					field962[var9] = null;
					field967[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1028[var10] = null;
				}

				field1303 = field962[field961] = new class26();
				field1073.method231();
				field1128.method231();
				field1224.method231();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1097[var11][var12][var13] = null;
						}
					}
				}

				field981 = new class41();
				field1084 = 0;
				field1145 = -1;
				field1024 = -1;
				field1086 = -1;
				field982 = -1;
				field968 = false;
				field1229 = 3;
				field1137 = false;
				field1067 = false;
				field1177 = false;
				field1036 = null;
				field1063 = 0;
				field1320 = true;
				method462();

				for (int var14 = 0; var14 < 5; var14++) {
					field1038[var14] = 0;
				}

				field1044 = 0;
				field1309 = 0;
				field1080 = 0;
				field1052 = 0;
				field1040 = 0;
				field1201 = 0;
				field1089 = 0;
				field1017 = 0;
				field950 = 0;
				method411();
				return;
			}

			if (var7 == 3) {
				field993 = "";
				field994 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field993 = "Your account has been disabled.";
				field994 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field993 = "Your account is already logged in.";
				field994 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field993 = "RuneScape has been updated!";
				field994 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field993 = "This world is full.";
				field994 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field993 = "Unable to connect.";
				field994 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field993 = "Login limit exceeded.";
				field994 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field993 = "Unable to connect.";
				field994 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field994 = "Login server rejected session.";
				field994 = "Please try again";
				return;
			}

			if (var7 == 12) {
				field993 = "You need a members account to beta-test";
				field994 = "Please subscribe, or play RS1 instead";
				return;
			}

			if (var7 == 13) {
				field993 = "Could not complete login";
				field994 = "Please try using a different world";
				return;
			}

			if (var7 == 14) {
				field993 = "The server is being updated";
				field994 = "Please wait 1 minute and try again";
				return;
			}

			if (var7 == 15) {
				field1250 = true;
				field1034.field540 = 0;
				field1196.field540 = 0;
				field1253 = -1;
				field1115 = -1;
				field1116 = -1;
				field1117 = -1;
				field1252 = 0;
				field1254 = 0;
				field1047 = 0;
				field983 = 0;
				field1067 = false;
				return;
			}

			if (var7 == 16) {
				field993 = "Login attempts exceeded";
				field994 = "Please wait 1 minute and try again";
				return;
			}

			if (var7 == 17) {
				field993 = "You are standing in a members-only area";
				field994 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field993 = "";
			field994 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method407() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field958 = (field958 + 1) % 3;
				field1169 = true;
				field1223 = true;
				field1034.method197(206);
				field1034.method198(field958);
				field1034.method198(field1081);
				field1034.method198(field1308);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field1081 = (field1081 + 1) % 3;
				field1169 = true;
				field1223 = true;
				field1034.method197(206);
				field1034.method198(field958);
				field1034.method198(field1081);
				field1034.method198(field1308);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field1308 = (field1308 + 1) % 3;
				field1169 = true;
				field1223 = true;
				field1034.method197(206);
				field1034.method198(field958);
				field1034.method198(field1081);
				field1034.method198(field1308);
			}

			if (field18 >= 416 && field18 <= 516 && field19 >= 490 && field19 <= 522) {
				method431();
				field1305 = "";
				field1161 = false;

				for (int var1 = 0; var1 < class60.field827.length; var1++) {
					if (class60.field827[var1] != null && class60.field827[var1].field836 == 600) {
						field1257 = field1086 = class60.field827[var1].field833;
						break;
					}
				}
			}

			field1282++;
			if (field1282 > 195) {
				field1282 = 0;
				field1034.method197(29);
				field1034.method198(239);
				return;
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method408() {
		for (class28 var1 = (class28) field1128.method227(); var1 != null; var1 = (class28) field1128.method229()) {
			if (field1180 != var1.field368 || var1.field374) {
				var1.method106();
			} else if (field1266 >= var1.field367) {
				var1.method117(field1031);

				if (var1.field374) {
					var1.method106();
				} else {
					field992.method61(0, var1, null, -1, var1.field369, false, 60, var1.field368, var1.field370, var1.field371);
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method409() {
		field1087 = new class35(field1110, "titlebox", 0);
		field1088 = new class35(field1110, "titlebutton", 0);
		field1156 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1156[var1] = new class35(field1110, "runes", var1);
		}

		field1216 = new class34(128, 265);
		field1217 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1216.field515[var2] = field972.field580[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1217.field515[var3] = field973.field580[var3];
		}

		field1094 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1094[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1094[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1094[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1094[var7 + 192] = 0xFFFFFF;
		}

		field1095 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1095[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1095[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1095[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1095[var11 + 192] = 0xFFFFFF;
		}

		field1096 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1096[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1096[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1096[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1096[var15 + 192] = 0xFFFFFF;
		}

		field1093 = new int[256];
		field1091 = new int[32768];
		field1092 = new int[32768];
		method399(null);
		field1082 = new int[32768];
		field1083 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1076) {
			field980 = true;
			field1076 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method410(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method411() {
		if (field1235 == null) {
			method363();
			field9 = null;
			field969 = null;
			field970 = null;
			field971 = null;
			field972 = null;
			field973 = null;
			field974 = null;
			field975 = null;
			field976 = null;
			field977 = null;
			field1235 = new class43(method11(), 479, 96);
			field1233 = new class43(method11(), 168, 160);
			class32.method147();
			field1143.method185(0, 0);
			field1232 = new class43(method11(), 190, 261);
			field1234 = new class43(method11(), 512, 334);
			class32.method147();
			field1060 = new class43(method11(), 501, 61);
			field1061 = new class43(method11(), 288, 40);
			field1062 = new class43(method11(), 269, 66);
			field1130 = true;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method412() {
		int var1 = (field1303.field268 >> 7) + field954;
		int var2 = (field1303.field269 >> 7) + field955;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1109 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1109 = (var2 - 9920) / 8 + 1;
		} else {
			field1109 = 0;
		}

		field1131 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1131 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1131 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1131 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1131 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1131 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1131 = 1;
			}
		}

		if (field1131 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1131 = 2;
		}

		field1269 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1269 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1269 = 1;
		}

		if (field1269 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1269 = 0;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method413() {
		if (field1256 > 0) {
			method464();
		} else {
			field1234.method234();
			field1171.method187("Connection lost", 144, 257, 0);
			field1171.method187("Connection lost", 143, 256, 0xFFFFFF);
			field1171.method187("Please wait - attempting to reestablish", 159, 257, 0);
			field1171.method187("Please wait - attempting to reestablish", 158, 256, 0xFFFFFF);
			field1234.method235(field8, 8, 11);
			field1240 = 0;
			class4 var1 = field1251;
			field1250 = false;
			method406(field1167, field1168, true);

			if (!field1250) {
				method464();
			}

			try {
				var1.method29();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void method414(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field965; var3++) {
			int var4 = field966[var3];
			class26 var5 = field962[var4];
			int var6 = arg1.method208();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method208() << 8;
			}

			method460(var5, arg1, var6, var4);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method415() {
		int var1 = field1055 * 128 + 64;
		int var2 = field1056 * 128 + 64;
		int var3 = method419(field1180, field1055, field1056) - field1057;

		if (field943 < var1) {
			field943 += (var1 - field943) * field1059 / 1000 + field1058;
			if (field943 > var1) {
				field943 = var1;
			}
		}

		if (field943 > var1) {
			field943 -= (field943 - var1) * field1059 / 1000 + field1058;
			if (field943 < var1) {
				field943 = var1;
			}
		}

		if (field944 < var3) {
			field944 += (var3 - field944) * field1059 / 1000 + field1058;
			if (field944 > var3) {
				field944 = var3;
			}
		}

		if (field944 > var3) {
			field944 -= (field944 - var3) * field1059 / 1000 + field1058;
			if (field944 < var3) {
				field944 = var3;
			}
		}

		if (field945 < var2) {
			field945 += (var2 - field945) * field1059 / 1000 + field1058;
			if (field945 > var2) {
				field945 = var2;
			}
		}

		if (field945 > var2) {
			field945 -= (field945 - var2) * field1059 / 1000 + field1058;
			if (field945 < var2) {
				field945 = var2;
			}
		}

		int var4 = field1310 * 128 + 64;
		int var5 = field1311 * 128 + 64;
		int var6 = method419(field1180, field1310, field1311) - field1312;
		int var7 = var4 - field943;
		int var8 = var6 - field944;
		int var9 = var5 - field945;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field946 < var11) {
			field946 += (var11 - field946) * field1314 / 1000 + field1313;
			if (field946 > var11) {
				field946 = var11;
			}
		}

		if (field946 > var11) {
			field946 -= (field946 - var11) * field1314 / 1000 + field1313;
			if (field946 < var11) {
				field946 = var11;
			}
		}

		int var13 = var12 - field947;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field947 += field1314 * var13 / 1000 + field1313;
		}

		if (var13 < 0) {
			field947 -= -var13 * field1314 / 1000 + field1313;
		}

		int var14 = var12 - field947;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field947 = var12;
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method416() {
		field1027++;
		method430();
		method371();
		method390();
		method408();
		method459();

		if (!field1275) {
			int var1 = field1111;
			if (field953 / 256 > var1) {
				var1 = field953 / 256;
			}

			if (field1006[4] && field1244[4] + 128 > var1) {
				var1 = field1244[4] + 128;
			}

			int var2 = field1174 + field1112 & 0x7FF;
			method365(field1268, var1 * 3 + 600, field1267, method420(field1303.field268, field1267, field1180, field1268, field1303.field269) - 50, var2, var1);
		}

		int var3;
		if (field1275) {
			var3 = method433();
		} else {
			var3 = method432();
		}

		int var4 = field943;
		int var5 = field944;
		int var6 = field945;
		int var7 = field946;
		int var8 = field947;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1006[var9]) {
				int var10 = (int) (Math.random() * (field1284[var9] * 2 + 1) + Math.sin(field1129[var9] / 100.0D * field996[var9]) * field1244[var9] - field1284[var9]);
				if (var9 == 0) {
					field943 += var10;
				}

				if (var9 == 1) {
					field944 += var10;
				}

				if (var9 == 2) {
					field945 += var10;
				}

				if (var9 == 3) {
					field947 = field947 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field946 += var10;
					if (field946 < 128) {
						field946 = 128;
					}

					if (field946 > 383) {
						field946 = 383;
					}
				}
			}
		}

		int var11 = class33.field512;
		class31.field473 = true;
		class31.field476 = 0;
		class31.field474 = field15 - 8;
		class31.field475 = field16 - 11;
		class32.method147();
		field992.method89(field944, field945, field946, field947, var3, field943);
		field992.method64();
		method466();
		method398();
		method421(var11);
		method456();
		field1234.method235(field8, 8, 11);
		field943 = var4;
		field944 = var5;
		field945 = var6;
		field946 = var7;
		field947 = var8;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method417(String arg0) {
		signlink.music = arg0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;II)Lub;")
	public final class47 method418(String arg0, int arg1, String arg2, int arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg0);
		if (var6 != null) {
			field1193.reset();
			field1193.update(var6);
			int var7 = (int) field1193.getValue();
			if (arg1 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class47(var6);
		}

		while (var6 == null) {
			method13(arg3, "Requesting " + arg2);

			try {
				int var9 = 0;
				DataInputStream var10 = method400(arg0 + arg1);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				class37 var12 = new class37(var11);
				var12.field540 = 3;
				int var13 = var12.method212() + 6;
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
						method13(arg3, "Loading " + arg2 + " - " + var17 + "%");
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					method13(arg3, "Error loading - Will retry in " + var18 + " secs.");

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

	@ObfuscatedName("client.b(IIII)I")
	public final int method419(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		int var6 = arg0;
		if (arg0 < 3 && (field1134[1][var4][var5] & 0x2) == 2) {
			var6 = arg0 + 1;
		}

		int var7 = arg1 & 0x7F;
		int var8 = arg2 & 0x7F;
		int var9 = (128 - var7) * field1222[var6][var4][var5] + field1222[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field1222[var6][var4][var5 + 1] + field1222[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.b(IIIIII)I")
	public final int method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = arg2;
		if (arg2 < 3 && (field1134[1][arg0 >> 7][arg4 >> 7] & 0x2) == 2) {
			var6 = arg2 + 1;
		}

		int var7 = arg1 >> 7;
		int var8 = arg3 >> 7;
		int var9 = arg1 & 0x7F;
		int var10 = arg3 & 0x7F;
		int var11 = (128 - var9) * field1222[var6][var7][var8] + field1222[var6][var7 + 1][var8] * var9 >> 7;
		int var12 = (128 - var9) * field1222[var6][var7][var8 + 1] + field1222[var6][var7 + 1][var8 + 1] * var9 >> 7;
		return (128 - var10) * var11 + var10 * var12 >> 7;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method421(int arg0) {
		if (!field1101) {
			if (class33.field511[17] >= arg0) {
				class35 var2 = class33.field505[17];
				int var3 = var2.field525 * var2.field524 - 1;
				int var4 = field1031 * var2.field524 * 2;
				byte[] var5 = var2.field522;
				byte[] var6 = field952;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field522 = var6;
				field952 = var5;
				class33.method159(17);
			}

			if (class33.field511[24] >= arg0) {
				class35 var8 = class33.field505[24];
				int var9 = var8.field525 * var8.field524 - 1;
				int var10 = field1031 * var8.field524 * 2;
				byte[] var11 = var8.field522;
				byte[] var12 = field952;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field522 = var12;
				field952 = var11;
				class33.method159(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.w(I)Z")
	public final boolean method422() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method423(int arg0) {
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

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 204);

			if (arg0.length == 4) {
				field1098 = Integer.parseInt(arg0[0]);
				field1099 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method461();
				} else if (arg0[2].equals("highmem")) {
					method403();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					field1100 = false;
				} else if (arg0[3].equals("members")) {
					field1100 = true;
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

	@ObfuscatedName("client.f(Z)Ljava/lang/String;")
	public final String method424() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(II[BI)V")
	public final void method425(int arg0, byte[] arg1, int arg2) {
		signlink.jinglesave(arg1, arg2, arg0);
	}

	@ObfuscatedName("client.x(I)V")
	public final void method426() {
		if (field948 == 2) {
			for (class39 var1 = (class39) field1224.method227(); var1 != null; var1 = (class39) field1224.method229()) {
				if (field1266 >= var1.field568) {
					method455(var1.field563, var1.field566, var1.field562, var1.field561, var1.field565, var1.field564, var1.field567);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method427() {
		if (field1164 == 0) {
			int var1 = field17;
			if (field1001 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field1067) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field1148 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1148 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (var2 < field1149 - 10 || var2 > field1151 + field1149 + 10 || var3 < field1150 - 10 || var3 > field1152 + field1150 + 10) {
						field1067 = false;

						if (field1148 == 1) {
							field1074 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1149;
					int var5 = field1150;
					int var6 = field1151;
					int var7 = field18;
					int var8 = field19;
					if (field1148 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1148 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field983; var10++) {
						int var11 = (field983 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method395(var9);
					}

					field1067 = false;

					if (field1148 == 1) {
						field1074 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field983 > 0) {
					int var12 = field1318[field983 - 1];
					if (var12 == 71 || var12 == 897 || var12 == 500 || var12 == 837 || var12 == 460 || var12 == 382 || var12 == 635 || var12 == 939 || var12 == 274 || var12 == 618 || var12 == 215) {
						int var13 = field1316[field983 - 1];
						int var14 = field1317[field983 - 1];
						class60 var15 = class60.field827[var14];
						if (var15.field853) {
							field942 = false;
							field1066 = 0;
							field1162 = var14;
							field1163 = var13;
							field1164 = 2;
							field1165 = field18;
							field1166 = field19;

							if (class60.field827[var14].field833 == field1086) {
								field1164 = 1;
							}

							if (class60.field827[var14].field833 == field1024) {
								field1164 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && field1179 == 1 && field983 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field983 > 0) {
					method395(field983 - 1);
				}

				if (var1 != 2 || field983 <= 0) {
					return;
				}

				method437();
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method428() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1082[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1082[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1083[var10] = (field1082[var10 - 1] + field1082[var10 + 1] + field1082[var10 - 128] + field1082[var10 + 128]) / 4;
			}
		}

		field1258 += 128;
		if (field1258 > field1091.length) {
			field1258 -= field1091.length;
			int var11 = (int) (Math.random() * 12.0D);
			method399(field1156[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1083[var14 + 128] - field1091[field1258 + var14 & field1091.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1082[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1133[var16] = field1133[var16 + 1];
		}

		field1133[var1 - 1] = (int) (Math.sin(field1266 / 14.0D) * 16.0D + Math.sin(field1266 / 15.0D) * 14.0D + Math.sin(field1266 / 16.0D) * 12.0D);

		if (field1014 > 0) {
			field1014 -= 4;
		}

		if (field1015 > 0) {
			field1015 -= 4;
		}

		if (field1014 == 0 && field1015 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1014 = 1024;
			}

			if (var17 == 1) {
				field1015 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.z(I)Ljava/net/Socket;")
	public final Socket method429(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method430() {
		if (field1303.field268 >> 7 == field1240 && field1303.field269 >> 7 == field1241) {
			field1240 = 0;
		}

		for (int var1 = -1; var1 < field963; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1303;
				var3 = field961 << 14;
			} else {
				var2 = field962[field964[var1]];
				var3 = field964[var1] << 14;
			}

			if (var2 != null && var2.method110()) {
				var2.field340 = false;
				if ((field1101 && field963 > 50 || field963 > 200) && var1 != -1 && var2.field292 == var2.field273) {
					var2.field340 = true;
				}

				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field335 == null || field1266 < var2.field330 || field1266 >= var2.field331) {
						if ((var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
							if (field1053[var4][var5] == field1027) {
								continue;
							}

							field1053[var4][var5] = field1027;
						}

						var2.field329 = method419(field1180, var2.field268, var2.field269);
						field992.method61(var2.field270, var2, null, var3, var2.field268, var2.field271, 60, field1180, var2.field269, var2.field329);
					} else {
						var2.field340 = false;
						var2.field329 = method419(field1180, var2.field268, var2.field269);
						field992.method62(var2.field269, var2.field339, var3, field1180, var2, 60, var2.field329, var2.field337, var2.field336, var2.field270, null, var2.field338, var2.field268);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method431() {
		field1034.method197(40);

		if (field982 != -1) {
			field982 = -1;
			field1074 = true;
			field968 = false;
			field1225 = true;
		}

		if (field1024 != -1) {
			field1024 = -1;
			field1223 = true;
			field968 = false;
		}

		field1086 = -1;
	}

	@ObfuscatedName("client.e(I)V")
	public final void method9() {
		if (field1287 || field1230 || field1108) {
			method391();
		} else {
			if (field1250) {
				method388();
			} else {
				method397();
			}

			field1072 = 0;
		}
	}

	@ObfuscatedName("client.A(I)I")
	public final int method432() {
		int var1 = 3;
		if (field946 < 310) {
			int var2 = field943 >> 7;
			int var3 = field945 >> 7;
			int var4 = field1303.field268 >> 7;
			int var5 = field1303.field269 >> 7;

			if ((field1134[field1180][var2][var3] & 0x4) != 0) {
				var1 = field1180;
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

					if ((field1134[field1180][var2][var3] & 0x4) != 0) {
						var1 = field1180;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1134[field1180][var2][var3] & 0x4) != 0) {
							var1 = field1180;
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

					if ((field1134[field1180][var2][var3] & 0x4) != 0) {
						var1 = field1180;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1134[field1180][var2][var3] & 0x4) != 0) {
							var1 = field1180;
						}
					}
				}
			}
		}

		if ((field1134[field1180][field1303.field268 >> 7][field1303.field269 >> 7] & 0x4) != 0) {
			var1 = field1180;
		}

		return var1;
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method433() {
		int var1 = method419(field1180, field943, field945);
		if (var1 - field944 < 800 && (field1134[field1180][field943 >> 7][field945 >> 7] & 0x4) != 0) {
			return field1180;
		}

		return 3;
	}

	@ObfuscatedName("client.a(ZIIIIIIIZII)Z")
	public final boolean method434(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		byte var11 = 104;
		byte var12 = 104;
		for (int var13 = 0; var13 < var11; var13++) {
			for (int var14 = 0; var14 < var12; var14++) {
				field1264[var13][var14] = 0;
				field1238[var13][var14] = 99999999;
			}
		}

		int var15 = arg2;
		int var16 = arg5;
		field1264[arg2][arg5] = 99;
		field1238[arg2][arg5] = 0;
		byte var17 = 0;
		int var18 = 0;
		field1260[var17] = arg2;
		int var34 = var17 + 1;
		field1261[var17] = arg5;
		boolean var19 = false;
		int var20 = field1260.length;
		int[][] var21 = field984[field1180].field807;
		while (var34 != var18) {
			var15 = field1260[var18];
			var16 = field1261[var18];
			var18 = (var18 + 1) % var20;

			if (arg9 == var15 && arg1 == var16) {
				var19 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field984[field1180].method303(var15, arg6, arg9, var16, arg7 - 1, arg1)) {
					var19 = true;
					break;
				}

				if (arg7 < 10 && field984[field1180].method304(arg7 - 1, arg1, arg6, var15, arg9, var16)) {
					var19 = true;
					break;
				}
			}

			if (arg4 != 0 && arg3 != 0 && field984[field1180].method305(arg9, arg1, var16, var15, arg3, arg8, arg4)) {
				var19 = true;
				break;
			}

			int var22 = field1238[var15][var16] + 1;
			if (var15 > 0 && field1264[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 0x280108) == 0) {
				field1260[var34] = var15 - 1;
				field1261[var34] = var16;
				var34 = (var34 + 1) % var20;
				field1264[var15 - 1][var16] = 2;
				field1238[var15 - 1][var16] = var22;
			}

			if (var15 < var11 - 1 && field1264[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 0x280180) == 0) {
				field1260[var34] = var15 + 1;
				field1261[var34] = var16;
				var34 = (var34 + 1) % var20;
				field1264[var15 + 1][var16] = 8;
				field1238[var15 + 1][var16] = var22;
			}

			if (var16 > 0 && field1264[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field1260[var34] = var15;
				field1261[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field1264[var15][var16 - 1] = 1;
				field1238[var15][var16 - 1] = var22;
			}

			if (var16 < var12 - 1 && field1264[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field1260[var34] = var15;
				field1261[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field1264[var15][var16 + 1] = 4;
				field1238[var15][var16 + 1] = var22;
			}

			if (var15 > 0 && var16 > 0 && field1264[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 0x28010E) == 0 && (var21[var15 - 1][var16] & 0x280108) == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field1260[var34] = var15 - 1;
				field1261[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field1264[var15 - 1][var16 - 1] = 3;
				field1238[var15 - 1][var16 - 1] = var22;
			}

			if (var15 < var11 - 1 && var16 > 0 && field1264[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 0x280183) == 0 && (var21[var15 + 1][var16] & 0x280180) == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field1260[var34] = var15 + 1;
				field1261[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field1264[var15 + 1][var16 - 1] = 9;
				field1238[var15 + 1][var16 - 1] = var22;
			}

			if (var15 > 0 && var16 < var12 - 1 && field1264[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 0x280138) == 0 && (var21[var15 - 1][var16] & 0x280108) == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field1260[var34] = var15 - 1;
				field1261[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field1264[var15 - 1][var16 + 1] = 6;
				field1238[var15 - 1][var16 + 1] = var22;
			}

			if (var15 < var11 - 1 && var16 < var12 - 1 && field1264[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 0x2801E0) == 0 && (var21[var15 + 1][var16] & 0x280180) == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field1260[var34] = var15 + 1;
				field1261[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field1264[var15 + 1][var16 + 1] = 12;
				field1238[var15 + 1][var16 + 1] = var22;
			}
		}

		if (!var19) {
			if (arg0) {
				int var23 = 100;
				for (int var24 = 1; var24 < 2; var24++) {
					for (int var25 = arg9 - var24; var25 <= arg9 + var24; var25++) {
						for (int var26 = arg1 - var24; var26 <= arg1 + var24; var26++) {
							if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && field1238[var25][var26] < var23) {
								var23 = field1238[var25][var26];
								var15 = var25;
								var16 = var26;
								var19 = true;
							}
						}
					}

					if (var19) {
						break;
					}
				}
			}

			if (!var19) {
				return false;
			}
		}

		byte var27 = 0;
		field1260[var27] = var15;
		int var35 = var27 + 1;
		field1261[var27] = var16;
		int var28;
		int var29 = var28 = field1264[var15][var16];
		while (arg2 != var15 || arg5 != var16) {
			if (var28 != var29) {
				var28 = var29;
				field1260[var35] = var15;
				field1261[var35++] = var16;
			}

			if ((var29 & 0x2) != 0) {
				var15++;
			} else if ((var29 & 0x8) != 0) {
				var15--;
			}

			if ((var29 & 0x1) != 0) {
				var16++;
			} else if ((var29 & 0x4) != 0) {
				var16--;
			}

			var29 = field1264[var15][var16];
		}

		if (var35 > 0) {
			int var30 = var35;
			if (var35 > 25) {
				var30 = 25;
			}

			var35--;
			int var31 = field1260[var35];
			int var32 = field1261[var35];
			field1052 += var30;
			if (field1052 >= 121) {
				field1034.method197(241);
				field1034.method199(19217);
			}

			if (field20[5] == 1) {
				field1034.method197(205);
			} else {
				field1034.method197(169);
			}

			field1034.method198(var30 + var30 + 2);
			field1034.method199(field954 + var31);
			field1034.method199(field955 + var32);
			field1240 = field1260[0];
			field1241 = field1261[0];

			for (int var33 = 1; var33 < var30; var33++) {
				var35--;
				field1034.method198(field1260[var35] - var31);
				field1034.method198(field1261[var35] - var32);
			}
		}

		return true;
	}

	@ObfuscatedName("client.b(ILkb;I)V")
	public final void method435(class37 arg0, int arg1) {
		field1220 = 0;
		field965 = 0;
		method454(arg1, arg0);
		method376(arg1, arg0);
		method452(arg1, arg0);

		for (int var3 = 0; var3 < field1220; var3++) {
			int var4 = field1221[var3];
			if (field1266 != field1028[var4].field312) {
				field1028[var4].field320 = null;
				field1028[var4] = null;
			}
		}

		if (arg0.field540 != arg1) {
			signlink.reporterror(field1167 + " size mismatch in getnpcpos - pos:" + arg0.field540 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1029; var5++) {
			if (field1028[field1030[var5]] == null) {
				signlink.reporterror(field1167 + " null entry in npc list - pos:" + var5 + " size:" + field1029);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method436() {
		if (field1047 > 1) {
			field1047--;
		}

		if (field1256 > 0) {
			field1256--;
		}

		for (int var1 = 0; var1 < 5 && method442(); var1++) {
		}

		if (field1250) {
			for (int var2 = 0; var2 < field1236; var2++) {
				if (field1226[var2] <= 0) {
					boolean var3 = false;
					try {
						if (field1085[var2] != field1064 || field1245[var2] != field1065) {
							class37 var4 = class51.method263(field1085[var2], field1245[var2]);
							if (System.currentTimeMillis() + var4.field540 / 22 > field1000 / 22 + field1231) {
								field1000 = var4.field540;
								field1231 = System.currentTimeMillis();

								if (method370(var4.field539, var4.field540)) {
									field1064 = field1085[var2];
									field1065 = field1245[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!method422()) {
							var3 = true;
						}
					} catch (Exception var19) {
					}

					if (var3 && field1226[var2] != -5) {
						field1226[var2] = -5;
					} else {
						field1236--;
						for (int var6 = var2; var6 < field1236; var6++) {
							field1085[var6] = field1085[var6 + 1];
							field1245[var6] = field1245[var6 + 1];
							field1226[var6] = field1226[var6 + 1];
						}

						var2--;
					}
				} else {
					field1226[var2]--;
				}
			}

			if (class5.field58) {
				class37 var7 = class5.method36();
				if (var7 != null) {
					field1034.method197(196);
					field1034.method199(var7.field540);
					field1034.method206(var7.field540, var7.field539, 0);
					var7.method196();
				}
			}

			field1254++;
			if (field1254 > 750) {
				method413();
			}

			method373();
			method381();
			method444();
			method426();
			field1031++;

			if (field1071 != 0) {
				field1070 += 20;
				if (field1070 >= 400) {
					field1071 = 0;
				}
			}

			if (field1298 != 0) {
				field1295++;
				if (field1295 >= 15) {
					if (field1298 == 2) {
						field1074 = true;
					}

					if (field1298 == 3) {
						field1223 = true;
					}

					field1298 = 0;
				}
			}

			if (field1164 != 0) {
				field1066++;

				if (field15 > field1165 + 5 || field15 < field1165 - 5 || field16 > field1166 + 5 || field16 < field1166 - 5) {
					field942 = true;
				}

				if (field14 == 0) {
					if (field1164 == 2) {
						field1074 = true;
					}

					if (field1164 == 3) {
						field1223 = true;
					}

					field1164 = 0;

					if (field942 && field1066 >= 5) {
						field1147 = -1;
						method374();

						if (field1162 == field1147 && field1163 != field1146) {
							class60 var8 = class60.field827[field1162];
							int var9 = var8.field828[field1146];
							var8.field828[field1146] = var8.field828[field1163];
							var8.field828[field1163] = var9;
							int var10 = var8.field829[field1146];
							var8.field829[field1146] = var8.field829[field1163];
							var8.field829[field1163] = var10;
							field1034.method197(162);
							field1034.method199(field1162);
							field1034.method199(field1163);
							field1034.method199(field1146);
						}
					} else if (field1179 == 1 && field983 > 2) {
						method437();
					} else if (field983 > 0) {
						method395(field983 - 1);
					}

					field1295 = 10;
					field17 = 0;
				}
			}

			if (class18.field228 != -1) {
				int var11 = class18.field228;
				int var12 = class18.field229;
				boolean var13 = method434(true, var12, field1303.field316[0], 0, 0, field1303.field317[0], 0, 0, 0, var11);
				class18.field228 = -1;

				if (var13) {
					field1068 = field18;
					field1069 = field19;
					field1071 = 1;
					field1070 = 0;
				}
			}

			if (field17 == 1 && field1036 != null) {
				field1036 = null;
				field1223 = true;
				field17 = 0;
			}

			method427();
			method446();
			method393();
			method407();

			if (field14 == 1 || field17 == 1) {
				field1072++;
			}

			if (field948 == 2) {
				method378();
			}

			if (field948 == 2 && field1275) {
				method415();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				field996[var14]++;
			}

			method440();
			field995++;
			if (field995 > 54) {
				field995 = 0;
				field1034.method197(39);
			}

			field13++;
			if (field13 > 4500) {
				field1256 = 250;
				field13 -= 500;
				field1034.method197(38);
			}

			field991++;
			if (field991 > 500) {
				field991 = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					field978 += field979;
				}

				if ((var15 & 0x2) == 2) {
					field940 += field941;
				}

				if ((var15 & 0x4) == 4) {
					field1174 += field1175;
				}
			}

			if (field978 < -50) {
				field979 = 2;
			}

			if (field978 > 50) {
				field979 = -2;
			}

			if (field940 < -55) {
				field941 = 2;
			}

			if (field940 > 55) {
				field941 = -2;
			}

			if (field1174 < -40) {
				field1175 = 1;
			}

			if (field1174 > 40) {
				field1175 = -1;
			}

			field1255++;
			if (field1255 > 50) {
				field1034.method197(186);
			}

			try {
				if (field1251 != null && field1034.field540 > 0) {
					field1251.method33(field1034.field539, field1034.field540, 0);
					field1034.field540 = 0;
					field1255 = 0;
				}
			} catch (IOException var17) {
				method413();
			} catch (Exception var18) {
				method464();
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method437() {
		int var1 = field1172.method189("Choose Option");
		for (int var2 = 0; var2 < field983; var2++) {
			int var3 = field1172.method189(field1125[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field983 * 15 + 21;
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

			field1067 = true;
			field1148 = 0;
			field1149 = var5;
			field1150 = var6;
			field1151 = var1;
			field1152 = field983 * 15 + 22;
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

			field1067 = true;
			field1148 = 1;
			field1149 = var7;
			field1150 = var8;
			field1151 = var1;
			field1152 = field983 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(IILhb;I)V")
	public final void method438(int arg0, class34 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 <= 6400) {
			int var5 = class31.field478[field1112];
			int var6 = class31.field479[field1112];
			int var7 = arg0 * var6 + arg2 * var5 >> 16;
			int var8 = arg2 * var6 - arg0 * var5 >> 16;
			if (var4 > 2500) {
				arg1.method179(83 - var8 - arg1.field521 / 2, field1143, var7 + 94 - arg1.field520 / 2);
			} else {
				arg1.method172(var7 + 94 - arg1.field520 / 2, 83 - var8 - arg1.field521 / 2);
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;B)Z")
	public final boolean method439(class60 arg0) {
		int var2 = arg0.field836;
		if (var2 == 201) {
			field1223 = true;
			field1137 = false;
			field1177 = true;
			field1042 = "";
			field1118 = 1;
			field1215 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1223 = true;
			field1137 = false;
			field1177 = true;
			field1042 = "";
			field1118 = 2;
			field1215 = "Enter name of friend to delete from list";
		}

		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			if (var2 >= 0 && var2 < field1084 && field1007[var2] > 0) {
				field1223 = true;
				field1137 = false;
				field1177 = true;
				field1042 = "";
				field1118 = 3;
				field1259 = field1278[var2];
				field1215 = "Enter message to send to " + field998[var2];
			}
		}

		if (var2 == 205) {
			field1256 = 250;
			return true;
		}

		if (var2 == 501) {
			field1223 = true;
			field1137 = false;
			field1177 = true;
			field1042 = "";
			field1118 = 4;
			field1215 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1223 = true;
			field1137 = false;
			field1177 = true;
			field1042 = "";
			field1118 = 5;
			field1215 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1277[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class59.field820 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class59.field820) {
							var5 = 0;
						}
					}

					if (class59.field821[var5].field822 == var3 + (field1320 ? 0 : 7)) {
						break;
					}
				}

				field1277[var3] = var5;
				field939 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1038[var6];
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

			field1038[var6] = var8;
			field939 = true;
		}

		if (var2 == 324 && !field1320) {
			field1320 = true;
			method462();
		}

		if (var2 == 325 && field1320) {
			field1320 = false;
			method462();
		}

		if (var2 == 326) {
			field1034.method197(128);
			field1034.method198(field1320 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1034.method198(field1277[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1034.method198(field1038[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1161 = !field1161;
		}

		if (var2 >= 601 && var2 <= 612) {
			method431();

			if (field1305.length() > 0) {
				field1034.method197(53);
				field1034.method204(class48.method250(field1305));
				field1034.method198(var2 - 601);
				field1034.method198(field1161 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method440() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1086 != -1 && field1257 == field1086) {
				if (var1 == 8 && field1305.length() > 0) {
					field1305 = field1305.substring(0, field1305.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1305.length() < 12) {
					field1305 = field1305 + (char) var1;
				}
			} else if (field1177) {
				if (var1 >= 32 && var1 <= 122 && field1042.length() < 80) {
					field1042 = field1042 + (char) var1;
					field1223 = true;
				}

				if (var1 == 8 && field1042.length() > 0) {
					field1042 = field1042.substring(0, field1042.length() - 1);
					field1223 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1177 = false;
					field1223 = true;

					if (field1118 == 1 && field1084 < 100) {
						long var2 = class48.method250(field1042);
						field1042 = class48.method254(class48.method251(var2));
						if (var2 != 0L) {
							boolean var4 = false;
							for (int var5 = 0; var5 < field1084; var5++) {
								if (field1278[var5] == var2) {
									method375(0, field1042 + " is already on your friend list", "");
									var4 = true;
									break;
								}
							}

							for (int var6 = 0; var6 < field1291; var6++) {
								if (field1005[var6] == var2) {
									method375(0, "Please remove " + field1042 + " from your ignore list first", "");
									var4 = true;
									break;
								}
							}

							if (field1042.equals(field1303.field321)) {
								var4 = true;
							}

							if (!var4) {
								field998[field1084] = field1042;
								field1278[field1084] = var2;
								field1007[field1084] = 0;
								field1084++;
								field1074 = true;
								field1034.method197(115);
								field1034.method204(var2);
							}
						}
					}

					if (field1118 == 2 && field1084 > 0) {
						long var7 = class48.method250(field1042);
						field1042 = class48.method254(class48.method251(var7));

						if (var7 != 0L) {
							for (int var9 = 0; var9 < field1084; var9++) {
								if (field1278[var9] == var7) {
									field1084--;
									field1074 = true;

									for (int var10 = var9; var10 < field1084; var10++) {
										field998[var10] = field998[var10 + 1];
										field1007[var10] = field1007[var10 + 1];
										field1278[var10] = field1278[var10 + 1];
									}

									field1034.method197(57);
									field1034.method204(var7);
									break;
								}
							}
						}
					}

					if (field1118 == 3 && field1042.length() > 0) {
						field1034.method197(250);
						field1034.method198(0);
						int var11 = field1034.field540;
						field1034.method204(field1259);
						class49.method258(field1034, field1042);
						field1034.method207(field1034.field540 - var11);
						field1042 = class48.method255(field1042);
						field1042 = class65.method334(field1042);
						method375(6, field1042, class48.method254(class48.method251(field1259)));

						if (field1081 == 2) {
							field1081 = 1;
							field1169 = true;
							field1034.method197(206);
							field1034.method198(field958);
							field1034.method198(field1081);
							field1034.method198(field1308);
						}
					}

					if (field1118 == 4 && field1291 < 100 && field1042.length() > 0) {
						long var12 = class48.method250(field1042);
						boolean var14 = false;
						for (int var15 = 0; var15 < field1291; var15++) {
							if (field1005[var15] == var12) {
								method375(0, field1042 + " is already on your ignore list", "");
								var14 = true;
								break;
							}
						}

						for (int var16 = 0; var16 < field1084; var16++) {
							if (field1278[var16] == var12) {
								method375(0, "Please remove " + field1042 + " from your friend list first", "");
								var14 = true;
								break;
							}
						}

						if (!var14) {
							field1005[field1291++] = var12;
							field1074 = true;
							field1034.method197(251);
							field1034.method204(var12);
						}
					}

					if (field1118 == 5 && field1291 > 0 && field1042.length() > 0) {
						long var17 = class48.method250(field1042);
						for (int var19 = 0; var19 < field1291; var19++) {
							if (field1005[var19] == var17) {
								field1291--;
								field1074 = true;

								for (int var20 = var19; var20 < field1291; var20++) {
									field1005[var20] = field1005[var20 + 1];
								}

								field1034.method197(188);
								field1034.method204(var17);
								break;
							}
						}
					}
				}
			} else if (field1137) {
				if (var1 >= 48 && var1 <= 57 && field1077.length() < 10) {
					field1077 = field1077 + (char) var1;
					field1223 = true;
				}

				if (var1 == 8 && field1077.length() > 0) {
					field1077 = field1077.substring(0, field1077.length() - 1);
					field1223 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1077.length() > 0) {
						int var21 = 0;
						try {
							var21 = Integer.parseInt(field1077);
						} catch (Exception var25) {
						}

						field1034.method197(184);
						field1034.method202(var21);
					}

					field1137 = false;
					field1223 = true;
				}
			} else if (field1024 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1025.length() < 80) {
					field1025 = field1025 + (char) var1;
					field1223 = true;
				}

				if (var1 == 8 && field1025.length() > 0) {
					field1025 = field1025.substring(0, field1025.length() - 1);
					field1223 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1025.length() > 0) {
					if (field1025.equals("::clientdrop") && field11 != null) {
						method413();
					} else if (field1025.startsWith("::")) {
						field1034.method197(24);
						field1034.method198(field1025.length() - 1);
						field1034.method205(field1025.substring(2));
					} else {
						byte var22 = 0;
						if (field1025.startsWith("yellow:")) {
							var22 = 0;
							field1025 = field1025.substring(7);
						}

						if (field1025.startsWith("red:")) {
							var22 = 1;
							field1025 = field1025.substring(4);
						}

						if (field1025.startsWith("green:")) {
							var22 = 2;
							field1025 = field1025.substring(6);
						}

						if (field1025.startsWith("cyan:")) {
							var22 = 3;
							field1025 = field1025.substring(5);
						}

						if (field1025.startsWith("purple:")) {
							var22 = 4;
							field1025 = field1025.substring(7);
						}

						if (field1025.startsWith("white:")) {
							var22 = 5;
							field1025 = field1025.substring(6);
						}

						if (field1025.startsWith("flash1:")) {
							var22 = 6;
							field1025 = field1025.substring(7);
						}

						if (field1025.startsWith("flash2:")) {
							var22 = 7;
							field1025 = field1025.substring(7);
						}

						if (field1025.startsWith("flash3:")) {
							var22 = 8;
							field1025 = field1025.substring(7);
						}

						if (field1025.startsWith("glow1:")) {
							var22 = 9;
							field1025 = field1025.substring(6);
						}

						if (field1025.startsWith("glow2:")) {
							var22 = 10;
							field1025 = field1025.substring(6);
						}

						if (field1025.startsWith("glow3:")) {
							var22 = 11;
							field1025 = field1025.substring(6);
						}

						byte var23 = 0;
						if (field1025.startsWith("wave:")) {
							var23 = 1;
							field1025 = field1025.substring(5);
						}

						if (field1025.startsWith("scroll:")) {
							var23 = 2;
							field1025 = field1025.substring(7);
						}

						field1034.method197(11);
						field1034.method198(0);
						int var24 = field1034.field540;
						field1034.method198(var22);
						field1034.method198(var23);
						class49.method258(field1034, field1025);
						field1034.method207(field1034.field540 - var24);
						field1025 = class48.method255(field1025);
						field1025 = class65.method334(field1025);
						field1303.field280 = field1025;
						field1303.field282 = var22;
						field1303.field283 = var23;
						field1303.field281 = 150;
						method375(2, field1303.field280, field1303.field321);

						if (field958 == 2) {
							field958 = 1;
							field1169 = true;
							field1034.method197(206);
							field1034.method198(field958);
							field1034.method198(field1081);
							field1034.method198(field1308);
						}
					}

					field1025 = "";
					field1223 = true;
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

	@ObfuscatedName("client.c(ILkb;I)V")
	public final void method441(class37 arg0, int arg1) {
		int var3 = arg0.method219(8);
		if (var3 < field963) {
			for (int var4 = var3; var4 < field963; var4++) {
				field1221[field1220++] = field964[var4];
			}
		}

		if (var3 > field963) {
			signlink.reporterror(field1167 + " Too many players");
			throw new RuntimeException("eek");
		}

		field963 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field964[var5];
			class26 var7 = field962[var6];
			int var8 = arg0.method219(1);
			if (var8 == 0) {
				field964[field963++] = var6;
				var7.field312 = field1266;
			} else {
				int var9 = arg0.method219(2);
				if (var9 == 0) {
					field964[field963++] = var6;
					var7.field312 = field1266;
					field966[field965++] = var6;
				} else if (var9 == 1) {
					field964[field963++] = var6;
					var7.field312 = field1266;
					int var10 = arg0.method219(3);
					var7.method109(false, var10);
					int var11 = arg0.method219(1);
					if (var11 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 2) {
					field964[field963++] = var6;
					var7.field312 = field1266;
					int var12 = arg0.method219(3);
					var7.method109(true, var12);
					int var13 = arg0.method219(3);
					var7.method109(true, var13);
					int var14 = arg0.method219(1);
					if (var14 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 3) {
					field1221[field1220++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)Z")
	public final boolean method442() {
		if (field1251 == null) {
			return false;
		}

		try {
			int var1 = field1251.method31();
			if (var1 == 0) {
				return false;
			}

			if (field1253 == -1) {
				field1251.method32(field1196.field539, 0, 1);
				field1253 = field1196.field539[0] & 0xFF;
				if (field1195 != null) {
					field1253 = field1253 - field1195.method245() & 0xFF;
				}

				field1252 = class56.field802[field1253];
				var1--;
			}

			if (field1252 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1251.method32(field1196.field539, 0, 1);
				field1252 = field1196.field539[0] & 0xFF;
				var1--;
			}

			if (field1252 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1251.method32(field1196.field539, 0, 2);
				field1196.field540 = 0;
				field1252 = field1196.method210();
				var1 -= 2;
			}

			if (var1 < field1252) {
				return false;
			}

			field1196.field540 = 0;
			field1251.method32(field1196.field539, 0, field1252);
			field1254 = 0;
			field1117 = field1116;
			field1116 = field1115;
			field1115 = field1253;

			if (field1253 == 94) {
				if (field1229 == 12) {
					field1074 = true;
				}

				field997 = field1196.method208();
				field1253 = -1;
				return true;
			}

			if (field1253 == 148) {
				method405(field1252, field1196);

				if (field948 == 1) {
					field948 = 2;
					class3.field26 = field1180;
					method368();
				}

				if (field1101 && field948 == 2 && class3.field26 != field1180) {
					field1234.method234();
					field1171.method187("Loading - please wait.", 151, 257, 0);
					field1171.method187("Loading - please wait.", 150, 256, 0xFFFFFF);
					field1234.method235(field8, 8, 11);
					class3.field26 = field1180;
					method368();
				}

				if (field1214 != field1180 && field948 == 2) {
					field1214 = field1180;
					method380(field1180);
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 167) {
				int var2 = field1196.method210();
				int var3 = field1196.method210();
				int var4 = var3 >> 10 & 0x1F;
				int var5 = var3 >> 5 & 0x1F;
				int var6 = var3 & 0x1F;
				class60.field827[var2].field868 = (var6 << 3) + (var4 << 19) + (var5 << 11);
				field1253 = -1;
				return true;
			}

			if (field1253 == 161) {
				class5.method34();
				field1253 = -1;
				return true;
			}

			if (field1253 == 86) {
				int var7 = field1196.method208();
				int var8 = field1196.method208();
				int var9 = -1;
				for (int var10 = 0; var10 < field1239.length; var10++) {
					if ((var7 << 8) + var8 == field1239[var10]) {
						var9 = var10;
					}
				}

				if (var9 != -1) {
					signlink.cachesave("m" + var7 + "_" + var8, field999[var9]);
					field948 = 1;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 195) {
				int var11 = field1196.method210();
				int var12 = field1196.method208();

				if (var11 == 0xFFFF) {
					var11 = -1;
				}

				field1212[var12] = var11;
				field1074 = true;
				field1225 = true;
				field1253 = -1;
				return true;
			}

			if (field1253 == 240) {
				int var13 = field1196.method210();
				String var14 = field1196.method215();
				class60.field827[var13].field866 = var14;

				if (field1212[field1229] == class60.field827[var13].field833) {
					field1074 = true;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 231) {
				field1240 = 0;
				field1253 = -1;
				return true;
			}

			if (field1253 == 151) {
				field958 = field1196.method208();
				field1081 = field1196.method208();
				field1308 = field1196.method208();
				field1169 = true;
				field1223 = true;
				field1253 = -1;
				return true;
			}

			if (field1253 == 48) {
				long var15 = field1196.method214();
				int var17 = field1196.method208();
				String var18 = class48.method254(class48.method251(var15));
				for (int var19 = 0; var19 < field1084; var19++) {
					if (field1278[var19] == var15) {
						if (field1007[var19] != var17) {
							field1007[var19] = var17;
							field1074 = true;

							if (var17 > 0) {
								method375(5, var18 + " has logged in.", "");
							}

							if (var17 == 0) {
								method375(5, var18 + " has logged out.", "");
							}
						}

						var18 = null;
						break;
					}
				}

				if (var18 != null && field1084 < 100) {
					field1278[field1084] = var15;
					field998[field1084] = var18;
					field1007[field1084] = var17;
					field1084++;
					field1074 = true;
				}

				boolean var20 = false;
				while (!var20) {
					var20 = true;
					for (int var21 = 0; var21 < field1084 - 1; var21++) {
						if (field1007[var21] != field1098 && field1007[var21 + 1] == field1098 || field1007[var21] == 0 && field1007[var21 + 1] != 0) {
							int var22 = field1007[var21];
							field1007[var21] = field1007[var21 + 1];
							field1007[var21 + 1] = var22;
							String var23 = field998[var21];
							field998[var21] = field998[var21 + 1];
							field998[var21 + 1] = var23;
							long var24 = field1278[var21];
							field1278[var21] = field1278[var21 + 1];
							field1278[var21 + 1] = var24;
							field1074 = true;
							var20 = false;
						}
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 60) {
				field1291 = field1252 / 8;
				for (int var26 = 0; var26 < field1291; var26++) {
					field1005[var26] = field1196.method214();
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 29) {
				int var27 = field1196.method210();
				int var28 = field1196.method210();
				if (field1153 == var27 && field1154 == var28 && field948 != 0) {
					field1253 = -1;
					return true;
				}

				field1153 = var27;
				field1154 = var28;
				field954 = (field1153 - 6) * 8;
				field955 = (field1154 - 6) * 8;
				field948 = 1;
				field1234.method234();
				field1171.method187("Loading - please wait.", 151, 257, 0);
				field1171.method187("Loading - please wait.", 150, 256, 0xFFFFFF);
				field1234.method235(field8, 8, 11);
				signlink.looprate(5);
				int var29 = (field1252 - 2) / 10;
				field999 = new byte[var29][];
				field1050 = new byte[var29][];
				field1239 = new int[var29];
				field1034.method197(58);
				field1034.method198(0);
				int var30 = 0;
				for (int var31 = 0; var31 < var29; var31++) {
					int var32 = field1196.method208();
					int var33 = field1196.method208();
					int var34 = field1196.method213();
					int var35 = field1196.method213();
					field1239[var31] = (var32 << 8) + var33;

					if (var34 != 0) {
						byte[] var36 = signlink.cacheload("m" + var32 + "_" + var33);
						if (var36 != null) {
							field1193.reset();
							field1193.update(var36);

							if ((int) field1193.getValue() != var34) {
								var36 = null;
							}
						}

						if (var36 == null) {
							field948 = 0;
							field1034.method198(0);
							field1034.method198(var32);
							field1034.method198(var33);
							var30 += 3;
						} else {
							field999[var31] = var36;
						}
					}

					if (var35 != 0) {
						byte[] var37 = signlink.cacheload("l" + var32 + "_" + var33);
						if (var37 != null) {
							field1193.reset();
							field1193.update(var37);

							if ((int) field1193.getValue() != var35) {
								var37 = null;
							}
						}

						if (var37 == null) {
							field948 = 0;
							field1034.method198(1);
							field1034.method198(var32);
							field1034.method198(var33);
							var30 += 3;
						} else {
							field1050[var31] = var37;
						}
					}
				}

				field1034.method207(var30);
				signlink.looprate(50);
				field1234.method234();

				if (field948 == 0) {
					field1171.method187("Map area updated since last visit, so load will take longer this time only", 166, 257, 0);
					field1171.method187("Map area updated since last visit, so load will take longer this time only", 165, 256, 0xFFFFFF);
				}

				field1234.method235(field8, 8, 11);
				int var38 = field954 - field956;
				int var39 = field955 - field957;
				field956 = field954;
				field957 = field955;

				for (int var40 = 0; var40 < 8192; var40++) {
					class25 var41 = field1028[var40];
					if (var41 != null) {
						for (int var42 = 0; var42 < 10; var42++) {
							var41.field316[var42] -= var38;
							var41.field317[var42] -= var39;
						}

						var41.field268 -= var38 * 128;
						var41.field269 -= var39 * 128;
					}
				}

				for (int var43 = 0; var43 < field960; var43++) {
					class26 var44 = field962[var43];
					if (var44 != null) {
						for (int var45 = 0; var45 < 10; var45++) {
							var44.field316[var45] -= var38;
							var44.field317[var45] -= var39;
						}

						var44.field268 -= var38 * 128;
						var44.field269 -= var39 * 128;
					}
				}

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
								field1097[var56][var52][var53] = field1097[var56][var54][var55];
							} else {
								field1097[var56][var52][var53] = null;
							}
						}
					}
				}

				for (class38 var57 = (class38) field981.method227(); var57 != null; var57 = (class38) field981.method229()) {
					var57.field553 -= var38;
					var57.field554 -= var39;
					if (var57.field553 < 0 || var57.field554 < 0 || var57.field553 >= 104 || var57.field554 >= 104) {
						var57.method106();
					}
				}

				if (field1240 != 0) {
					field1240 -= var38;
					field1241 -= var39;
				}

				field1275 = false;
				field1253 = -1;
				return true;
			}

			if (field1253 == 188) {
				int var58 = field1196.method210();
				int var59 = field1196.method210();
				class60.field827[var58].field875 = var59;
				field1253 = -1;
				return true;
			}

			if (field1253 == 233) {
				int var60 = field1196.method210();
				int var61 = field1196.method210();
				class54 var62 = class54.method280(var61);
				class60.field827[var60].field873 = var62.method283();
				field1253 = -1;
				return true;
			}

			if (field1253 == 208) {
				field1136 = field1196.method208();
				if (field1229 == field1136) {
					if (field1136 == 3) {
						field1229 = 1;
					} else {
						field1229 = 3;
					}

					field1074 = true;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 18) {
				method435(field1196, field1252);
				field1253 = -1;
				return true;
			}

			if (field1253 == 24) {
				int var63 = field1196.method210();
				boolean var64 = field1196.method208() == 1;
				class60.field827[var63].field847 = var64;
				field1253 = -1;
				return true;
			}

			if (field1253 == 171) {
				int var65 = field1196.method208();
				int var66 = field1196.method208();
				int var67 = -1;
				for (int var68 = 0; var68 < field1239.length; var68++) {
					if ((var65 << 8) + var66 == field1239[var68]) {
						var67 = var68;
					}
				}

				if (var67 != -1) {
					signlink.cachesave("l" + var65 + "_" + var66, field1050[var67]);
					field948 = 1;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 199) {
				field1177 = false;
				field1137 = true;
				field1077 = "";
				field1223 = true;
				field1253 = -1;
				return true;
			}

			if (field1253 == 34) {
				int var69 = field1196.method210();
				byte var70 = field1196.method209();
				field990[var69] = var70;

				if (field1018[var69] != var70) {
					field1018[var69] = var70;
					method372(var69);
					field1074 = true;

					if (field1145 != -1) {
						field1223 = true;
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 235) {
				field1078 = field1196.method208();
				field1079 = field1196.method208();
				for (int var71 = field1078; var71 < field1078 + 8; var71++) {
					for (int var72 = field1079; var72 < field1079 + 8; var72++) {
						if (field1097[field1180][var71][var72] != null) {
							field1097[field1180][var71][var72] = null;
							method367(var71, var72);
						}
					}
				}

				for (class38 var73 = (class38) field981.method227(); var73 != null; var73 = (class38) field981.method229()) {
					if (var73.field553 >= field1078 && var73.field553 < field1078 + 8 && var73.field554 >= field1079 && var73.field554 < field1079 + 8 && field1180 == var73.field551) {
						method455(var73.field553, var73.field559, var73.field552, var73.field551, var73.field558, var73.field554, var73.field560);
						var73.method106();
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 22) {
				field1200 = field1196.method208();
				if (field1200 == 1) {
					field1194 = field1196.method210();
				}

				if (field1200 >= 2 && field1200 <= 6) {
					if (field1200 == 2) {
						field1105 = 64;
						field1106 = 64;
					}

					if (field1200 == 3) {
						field1105 = 0;
						field1106 = 64;
					}

					if (field1200 == 4) {
						field1105 = 128;
						field1106 = 64;
					}

					if (field1200 == 5) {
						field1105 = 64;
						field1106 = 0;
					}

					if (field1200 == 6) {
						field1105 = 64;
						field1106 = 128;
					}

					field1200 = 2;
					field1102 = field1196.method210();
					field1103 = field1196.method210();
					field1104 = field1196.method208();
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 135) {
				method464();
				field1253 = -1;
				return false;
			}

			if (field1253 == 185) {
				for (int var74 = 0; var74 < field1018.length; var74++) {
					if (field990[var74] != field1018[var74]) {
						field1018[var74] = field990[var74];
						method372(var74);
						field1074 = true;
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 248) {
				for (int var75 = 0; var75 < field962.length; var75++) {
					if (field962[var75] != null) {
						field962[var75].field295 = -1;
					}
				}

				for (int var76 = 0; var76 < field1028.length; var76++) {
					if (field1028[var76] != null) {
						field1028[var76].field295 = -1;
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 26) {
				if (field1229 == 12) {
					field1074 = true;
				}

				field1051 = field1196.method211();
				field1253 = -1;
				return true;
			}

			if (field1253 == 154) {
				int var77 = field1196.method210();
				int var78 = field1196.method210();
				int var79 = field1196.method210();
				class60 var80 = class60.field827[var77];
				class31 var81 = var80.field873;
				if (var81 != null) {
					var81.method132(var78, var79);
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 112) {
				field1275 = false;

				for (int var82 = 0; var82 < 5; var82++) {
					field1006[var82] = false;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 5) {
				int var83 = field1196.method208();
				int var84 = field1196.method208();
				int var85 = field1196.method208();
				int var86 = field1196.method208();
				field1006[var83] = true;
				field1284[var83] = var84;
				field1244[var83] = var85;
				field1129[var83] = var86;
				field996[var83] = 0;
				field1253 = -1;
				return true;
			}

			if (field1253 == 124) {
				field1275 = true;
				field1310 = field1196.method208();
				field1311 = field1196.method208();
				field1312 = field1196.method210();
				field1313 = field1196.method208();
				field1314 = field1196.method208();
				if (field1314 >= 100) {
					int var87 = field1310 * 128 + 64;
					int var88 = field1311 * 128 + 64;
					int var89 = method419(field1180, field1310, field1311) - field1312;
					int var90 = var87 - field943;
					int var91 = var89 - field944;
					int var92 = var88 - field945;
					int var93 = (int) Math.sqrt(var90 * var90 + var92 * var92);
					field946 = (int) (Math.atan2(var91, var93) * 325.949D) & 0x7FF;
					field947 = (int) (Math.atan2(var90, var92) * -325.949D) & 0x7FF;

					if (field946 < 128) {
						field946 = 128;
					}

					if (field946 > 383) {
						field946 = 383;
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 116) {
				field1229 = field1196.method208();
				field1074 = true;
				field1225 = true;
				field1253 = -1;
				return true;
			}

			if (field1253 == 236) {
				field1016 = field1196.method213();
				field1276 = field1196.method210();
				field1046 = field1196.method208();
				field1054 = field1196.method210();

				if (field1016 != 0 && field1086 == -1) {
					signlink.dnslookup(class48.method253(field1016));
					method431();
					short var94 = 650;
					if (field1046 != 201) {
						var94 = 655;
					}

					field1305 = "";
					field1161 = false;

					for (int var95 = 0; var95 < class60.field827.length; var95++) {
						if (class60.field827[var95] != null && class60.field827[var95].field836 == var94) {
							field1086 = class60.field827[var95].field833;
							break;
						}
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 245) {
				class5.method35(true);
				field1253 = -1;
				return true;
			}

			if (field1253 == 7) {
				int var96 = field1196.method210();
				int var97 = field1196.method210();
				int var98 = field1196.method210();
				class55 var99 = class55.method286(var97);
				class60.field827[var96].field873 = var99.method290(50);
				class60.field827[var96].field878 = var99.field774;
				class60.field827[var96].field879 = var99.field775;
				class60.field827[var96].field877 = var99.field773 * 100 / var98;
				field1253 = -1;
				return true;
			}

			if (field1253 == 223) {
				int var100 = field1196.method210();
				method366(var100);

				if (field1024 != -1) {
					field1024 = -1;
					field1223 = true;
				}

				if (field1137) {
					field1137 = false;
					field1223 = true;
				}

				field982 = var100;
				field1074 = true;
				field1225 = true;
				field1086 = -1;
				field968 = false;
				field1253 = -1;
				return true;
			}

			if (field1253 == 191) {
				field1078 = field1196.method208();
				field1079 = field1196.method208();
				field1253 = -1;
				return true;
			}

			if (field1253 == 156 || field1253 == 146 || field1253 == 181 || field1253 == 209 || field1253 == 175 || field1253 == 106 || field1253 == 134 || field1253 == 63 || field1253 == 140 || field1253 == 204) {
				method458(field1196, field1253);
				field1253 = -1;
				return true;
			}

			if (field1253 == 90) {
				int var101 = field1196.method208();
				int var102 = field1196.method208();
				int var103 = field1196.method210();
				int var104 = field1196.method210();
				int var105 = -1;
				for (int var106 = 0; var106 < field1239.length; var106++) {
					if ((var101 << 8) + var102 == field1239[var106]) {
						var105 = var106;
					}
				}

				if (var105 != -1) {
					if (field1050[var105] == null || field1050[var105].length != var104) {
						field1050[var105] = new byte[var104];
					}

					field1196.method217(field1050[var105], field1252 - 6, var103);
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 38) {
				int var107 = field1196.method210();
				class60.field827[var107].field873 = field1303.method114();
				field1253 = -1;
				return true;
			}

			if (field1253 == 138) {
				field1047 = field1196.method210() * 30;
				field1253 = -1;
				return true;
			}

			if (field1253 == 150) {
				if (field1306 && !field1101) {
					if (field1075 == null) {
						field1075 = new byte[10000];
					}

					int var108 = field1196.method210();
					int var109 = field1196.method213();
					int var110 = field1252 - 6;
					class44.method237(field1075, var109, field1196.field539, var110, field1196.field540);
					method425(var108, field1075, var109);
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 32) {
				field1158 = field1196.method210();
				field1253 = -1;
				return true;
			}

			if (field1253 == 170) {
				int var111 = field1196.method210();
				int var112 = field1196.method211();
				int var113 = field1196.method211();
				class60 var114 = class60.field827[var111];
				var114.field839 = var112;
				var114.field840 = var113;
				field1253 = -1;
				return true;
			}

			if (field1253 == 16) {
				field1074 = true;
				int var115 = field1196.method210();
				class60 var116 = class60.field827[var115];
				while (field1196.field540 < field1252) {
					int var117 = field1196.method208();
					int var118 = field1196.method210();
					int var119 = field1196.method208();
					if (var119 == 255) {
						var119 = field1196.method213();
					}

					if (var117 >= 0 && var117 < var116.field828.length) {
						var116.field828[var117] = var118;
						var116.field829[var117] = var119;
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 187) {
				String var120 = field1196.method215();
				if (!var120.equals(field1032)) {
					field1032 = var120;

					if (field1315) {
						method417(var120);
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 47) {
				field1074 = true;
				int var121 = field1196.method210();
				class60 var122 = class60.field827[var121];
				int var123 = field1196.method208();
				for (int var124 = 0; var124 < var123; var124++) {
					var122.field828[var124] = field1196.method210();
					int var125 = field1196.method208();
					if (var125 == 255) {
						var125 = field1196.method213();
					}

					var122.field829[var124] = var125;
				}

				for (int var126 = var123; var126 < var122.field828.length; var126++) {
					var122.field828[var126] = 0;
					var122.field829[var126] = 0;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 55) {
				int var127 = field1196.method210();
				class60 var128 = class60.field827[var127];
				for (int var129 = 0; var129 < var128.field828.length; var129++) {
					var128.field828[var129] = -1;
					var128.field828[var129] = 0;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 234) {
				field1078 = field1196.method208();
				field1079 = field1196.method208();

				while (field1196.field540 < field1252) {
					int var130 = field1196.method208();
					method458(field1196, var130);
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 160) {
				int var131 = field1196.method210();
				int var132 = field1196.method208();
				int var133 = field1196.method210();
				if (field949 && !field1101 && field1236 < 50) {
					field1085[field1236] = var131;
					field1245[field1236] = var132;
					field1226[field1236] = class51.field663[var131] + var133;
					field1236++;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 89) {
				int var134 = field1196.method210();
				method366(var134);

				if (field982 != -1) {
					field982 = -1;
					field1074 = true;
					field1225 = true;
				}

				field1024 = var134;
				field1223 = true;
				field1086 = -1;
				field968 = false;
				field1253 = -1;
				return true;
			}

			if (field1253 == 37) {
				int var135 = field1196.method210();
				method366(var135);

				if (field982 != -1) {
					field982 = -1;
					field1074 = true;
					field1225 = true;
				}

				if (field1024 != -1) {
					field1024 = -1;
					field1223 = true;
				}

				if (field1137) {
					field1137 = false;
					field1223 = true;
				}

				field1086 = var135;
				field968 = false;
				field1253 = -1;
				return true;
			}

			if (field1253 == 9) {
				if (field982 != -1) {
					field982 = -1;
					field1074 = true;
					field1225 = true;
				}

				if (field1024 != -1) {
					field1024 = -1;
					field1223 = true;
				}

				if (field1137) {
					field1137 = false;
					field1223 = true;
				}

				field1086 = -1;
				field968 = false;
				field1253 = -1;
				return true;
			}

			if (field1253 == 203) {
				long var136 = field1196.method214();
				int var138 = field1196.method213();
				int var139 = field1196.method208();
				boolean var140 = false;
				for (int var141 = 0; var141 < 100; var141++) {
					if (field1273[var141] == var138) {
						var140 = true;
						break;
					}
				}

				if (var139 <= 1) {
					for (int var142 = 0; var142 < field1291; var142++) {
						if (field1005[var142] == var136) {
							var140 = true;
							break;
						}
					}
				}

				if (!var140 && field1269 == 0) {
					try {
						field1273[field1321] = var138;
						field1321 = (field1321 + 1) % 100;
						String var143 = class49.method257(field1252 - 13, field1196);
						var143 = class65.method334(var143);
						if (var139 > 1) {
							method375(7, var143, class48.method254(class48.method251(var136)));
						} else {
							method375(3, var143, class48.method254(class48.method251(var136)));
						}
					} catch (Exception var176) {
						signlink.reporterror("cde1");
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 102) {
				field1275 = true;
				field1055 = field1196.method208();
				field1056 = field1196.method208();
				field1057 = field1196.method210();
				field1058 = field1196.method208();
				field1059 = field1196.method208();
				if (field1059 >= 100) {
					field943 = field1055 * 128 + 64;
					field945 = field1056 * 128 + 64;
					field944 = method419(field1180, field1055, field1056) - field1057;
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 74) {
				field1063 = field1196.method208();
				field1253 = -1;
				return true;
			}

			if (field1253 == 121) {
				int var145 = field1196.method210();
				int var146 = field1196.method210();
				class60.field827[var145].field873 = new class31(var146);
				field1253 = -1;
				return true;
			}

			if (field1253 == 120) {
				int var147 = field1196.method210();
				int var148 = field1196.method210();

				if (field1024 != -1) {
					field1024 = -1;
					field1223 = true;
				}

				if (field1137) {
					field1137 = false;
					field1223 = true;
				}

				field1086 = var147;
				field982 = var148;
				field1074 = true;
				field1225 = true;
				field968 = false;
				field1253 = -1;
				return true;
			}

			if (field1253 == 36) {
				int var149 = field1196.method208();
				int var150 = field1196.method208();
				int var151 = field1196.method210();
				int var152 = field1196.method210();
				int var153 = -1;
				for (int var154 = 0; var154 < field1239.length; var154++) {
					if ((var149 << 8) + var150 == field1239[var154]) {
						var153 = var154;
					}
				}

				if (var153 != -1) {
					if (field999[var153] == null || field999[var153].length != var152) {
						field999[var153] = new byte[var152];
					}

					field1196.method217(field999[var153], field1252 - 6, var151);
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 118) {
				field1074 = true;
				int var155 = field1196.method208();
				int var156 = field1196.method213();
				int var157 = field1196.method208();
				field1132[var155] = var156;
				field1307[var155] = var157;
				field1271[var155] = 1;
				for (int var158 = 0; var158 < 98; var158++) {
					if (var156 >= field1039[var158]) {
						field1271[var155] = var158 + 2;
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 230) {
				int var159 = field1196.method210();
				int var160 = field1196.method213();
				field990[var159] = var160;

				if (field1018[var159] != var160) {
					field1018[var159] = var160;
					method372(var159);
					field1074 = true;

					if (field1145 != -1) {
						field1223 = true;
					}
				}

				field1253 = -1;
				return true;
			}

			if (field1253 == 27) {
				int var161 = field1196.method211();
				field1145 = var161;
				field1223 = true;
				field1253 = -1;
				return true;
			}

			if (field1253 == 35) {
				String var162 = field1196.method215();
				if (var162.endsWith(":tradereq:")) {
					String var163 = var162.substring(0, var162.indexOf(":"));
					long var164 = class48.method250(var163);
					boolean var166 = false;
					for (int var167 = 0; var167 < field1291; var167++) {
						if (field1005[var167] == var164) {
							var166 = true;
							break;
						}
					}

					if (!var166 && field1269 == 0) {
						method375(4, "wishes to trade with you.", var163);
					}
				} else if (var162.endsWith(":duelreq:")) {
					String var168 = var162.substring(0, var162.indexOf(":"));
					long var169 = class48.method250(var168);
					boolean var171 = false;
					for (int var172 = 0; var172 < field1291; var172++) {
						if (field1005[var172] == var169) {
							var171 = true;
							break;
						}
					}

					if (!var171 && field1269 == 0) {
						method375(8, "wishes to duel with you.", var168);
					}
				} else {
					method375(0, var162, "");
				}

				field1253 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1253 + "," + field1252 + " - " + field1116 + "," + field1117);
			method464();
		} catch (IOException var177) {
			method413();
		} catch (Exception var178) {
			String var174 = "T2 - " + field1253 + "," + field1116 + "," + field1117 + " - " + field1252 + "," + (field1303.field316[0] + field954) + "," + (field1303.field317[0] + field955) + " - ";
			for (int var175 = 0; var175 < field1252 && var175 < 50; var175++) {
				var174 = var174 + field1196.field539[var175] + ",";
			}

			signlink.reporterror(var174);
			method464();
		}

		return true;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method443() {
		field1232.method234();
		class33.field503 = field1198;
		field1142.method185(0, 0);

		if (field982 != -1) {
			method469(0, class60.field827[field982], 0, 0);
		} else if (field1212[field1229] != -1) {
			method469(0, class60.field827[field1212[field1229]], 0, 0);
		}

		if (field1067 && field1148 == 1) {
			method402();
		}

		field1232.method235(field8, 562, 231);
		field1234.method234();
		class33.field503 = field1199;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method444() {
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

		for (int var4 = 0; var4 < field1029; var4++) {
			int var5 = field1030[var4];
			class25 var6 = field1028[var5];
			if (var6 != null && var6.field281 > 0) {
				var6.field281--;
				if (var6.field281 == 0) {
					var6.field280 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method445(int arg0, int arg1, int arg2) {
		int var4 = field992.method76(arg0, arg2, arg1);
		if (var4 != 0) {
			int var5 = field992.method80(arg0, arg2, arg1, var4);
			int var6 = var5 >> 6 & 0x3;
			int var7 = var5 & 0x1F;
			int var8 = 0xEEEEEE;
			if (var4 > 0) {
				var8 = 0xEE0000;
			}

			int[] var9 = field1242.field515;
			int var10 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
			int var11 = var4 >> 14 & 0x7FFF;
			class53 var12 = class53.method274(var11);
			if (var12.field720 == -1) {
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
				class35 var13 = field1043[var12.field720];
				if (var13 != null) {
					int var14 = (var12.field705 * 4 - var13.field524) / 2;
					int var15 = (var12.field706 * 4 - var13.field525) / 2;
					var13.method185(arg2 * 4 + var14 + 48, (104 - arg1 - var12.field706) * 4 + 48 + var15);
				}
			}
		}

		int var16 = field992.method78(arg0, arg2, arg1);
		if (var16 != 0) {
			int var17 = field992.method80(arg0, arg2, arg1, var16);
			int var18 = var17 >> 6 & 0x3;
			int var19 = var17 & 0x1F;
			int var20 = var16 >> 14 & 0x7FFF;
			class53 var21 = class53.method274(var20);
			if (var21.field720 != -1) {
				class35 var22 = field1043[var21.field720];
				if (var22 != null) {
					int var23 = (var21.field705 * 4 - var22.field524) / 2;
					int var24 = (var21.field706 * 4 - var22.field525) / 2;
					var22.method185(arg2 * 4 + var23 + 48, (104 - arg1 - var21.field706) * 4 + 48 + var24);
				}
			} else if (var19 == 9) {
				int var25 = 0xEEEEEE;
				if (var16 > 0) {
					var25 = 0xEE0000;
				}

				int[] var26 = field1242.field515;
				int var27 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
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

		int var28 = field992.method79(arg0, arg2, arg1);
		if (var28 != 0) {
			int var29 = var28 >> 14 & 0x7FFF;
			class53 var30 = class53.method274(var29);
			if (var30.field720 != -1) {
				class35 var31 = field1043[var30.field720];
				if (var31 != null) {
					int var32 = (var30.field705 * 4 - var31.field524) / 2;
					int var33 = (var30.field706 * 4 - var31.field525) / 2;
					var31.method185(arg2 * 4 + var32 + 48, (104 - arg1 - var30.field706) * 4 + 48 + var33);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method446() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = class33.field501[field1112];
				int var4 = class33.field502[field1112];
				int var5 = var1 * var4 + var2 * var3 >> 11;
				int var6 = var2 * var4 - var1 * var3 >> 11;
				int var7 = field1303.field268 + var5 >> 7;
				int var8 = field1303.field269 - var6 >> 7;
				method434(true, var8, field1303.field316[0], 0, 0, field1303.field317[0], 0, 0, 0, var7);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(III)Z")
	public final boolean method447(int arg0, int arg1) {
		boolean var3 = false;
		class60 var4 = class60.field827[arg1];
		for (int var5 = 0; var5 < var4.field848.length && var4.field848[var5] != -1; var5++) {
			class60 var6 = class60.field827[var4.field848[var5]];
			if (var6.field834 == 1) {
				var3 |= method447(arg0, var6.field832);
			}

			if (var6.field834 == 6 && (var6.field875 != -1 || var6.field876 != -1)) {
				boolean var7 = method474(var6);
				int var8;
				if (var7) {
					var8 = var6.field876;
				} else {
					var8 = var6.field875;
				}

				if (var8 != -1) {
					class62 var9 = class62.field893[var8];
					var6.field831 += arg0;
					while (var6.field831 > var9.field897[var6.field830]) {
						var6.field831 -= var9.field897[var6.field830] + 1;
						var6.field830++;
						if (var6.field830 >= var9.field894) {
							var6.field830 -= var9.field898;
							if (var6.field830 < 0 || var6.field830 >= var9.field894) {
								var6.field830 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(IILkb;)V")
	public final void method448(int arg0, class37 arg1) {
		arg1.method218();
		int var3 = arg1.method219(1);
		if (var3 != 0) {
			int var4 = arg1.method219(2);
			if (var4 == 0) {
				field966[field965++] = field961;
			} else if (var4 == 1) {
				int var5 = arg1.method219(3);
				field1303.method109(false, var5);
				int var6 = arg1.method219(1);
				if (var6 == 1) {
					field966[field965++] = field961;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method219(3);
				field1303.method109(true, var7);
				int var8 = arg1.method219(3);
				field1303.method109(true, var8);
				int var9 = arg1.method219(1);
				if (var9 == 1) {
					field966[field965++] = field961;
				}
			} else if (var4 == 3) {
				field1180 = arg1.method219(2);
				int var10 = arg1.method219(7);
				int var11 = arg1.method219(7);
				int var12 = arg1.method219(1);
				field1303.method108(var10, var11, var12 == 1);
				int var13 = arg1.method219(1);
				if (var13 == 1) {
					field966[field965++] = field961;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lbc;BIII)V")
	public final void method449(class54 arg0, int arg1, int arg2, int arg3) {
		if (field983 < 400) {
			String var5 = arg0.field739;
			if (arg0.field757 != 0) {
				var5 = var5 + method473(arg0.field757, field1303.field327) + " (level-" + arg0.field757 + ")";
			}

			if (field1009 == 1) {
				field1125[field983] = "Use " + field1013 + " with @yel@" + var5;
				field1318[field983] = 688;
				field1319[field983] = arg3;
				field1316[field983] = arg2;
				field1317[field983] = arg1;
				field983++;
			} else if (field1001 != 1) {
				if (arg0.field752 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg0.field752[var6] != null && !arg0.field752[var6].equalsIgnoreCase("attack")) {
							field1125[field983] = arg0.field752[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1318[field983] = 614;
							}

							if (var6 == 1) {
								field1318[field983] = 719;
							}

							if (var6 == 2) {
								field1318[field983] = 969;
							}

							if (var6 == 3) {
								field1318[field983] = 890;
							}

							if (var6 == 4) {
								field1318[field983] = 983;
							}

							field1319[field983] = arg3;
							field1316[field983] = arg2;
							field1317[field983] = arg1;
							field983++;
						}
					}
				}

				if (arg0.field752 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg0.field752[var7] != null && arg0.field752[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg0.field757 > field1303.field327) {
								var8 = 2000;
							}

							field1125[field983] = arg0.field752[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1318[field983] = var8 + 614;
							}

							if (var7 == 1) {
								field1318[field983] = var8 + 719;
							}

							if (var7 == 2) {
								field1318[field983] = var8 + 969;
							}

							if (var7 == 3) {
								field1318[field983] = var8 + 890;
							}

							if (var7 == 4) {
								field1318[field983] = var8 + 983;
							}

							field1319[field983] = arg3;
							field1316[field983] = arg2;
							field1317[field983] = arg1;
							field983++;
						}
					}
				}

				field1125[field983] = "Examine @yel@" + var5;
				field1318[field983] = 1586;
				field1319[field983] = arg3;
				field1316[field983] = arg2;
				field1317[field983] = arg1;
				field983++;
			} else if ((field1003 & 0x2) == 2) {
				field1125[field983] = field1004 + " @yel@" + var5;
				field1318[field983] = 129;
				field1319[field983] = arg3;
				field1316[field983] = arg2;
				field1317[field983] = arg1;
				field983++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILhc;)V")
	public final void method450(class60 arg0) {
		int var2 = arg0.field836;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1084) {
				arg0.field866 = "";
				arg0.field835 = 0;
			} else {
				arg0.field866 = field998[var2];
				arg0.field835 = 1;
				if (arg0.field883 == null) {
					arg0.field835 = 0;
				}
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1084) {
				arg0.field866 = "";
				arg0.field835 = 0;
			} else {
				if (field1007[var2] == 0) {
					arg0.field866 = "@red@Offline";
				} else if (field1007[var2] == field1098) {
					arg0.field866 = "@gre@World-" + (field1007[var2] - 9);
				} else {
					arg0.field866 = "@yel@World-" + (field1007[var2] - 9);
				}

				arg0.field835 = 1;
				if (arg0.field883 == null) {
					arg0.field835 = 0;
				}
			}
		} else if (var2 == 203) {
			arg0.field845 = field1084 * 15 + 20;
			if (arg0.field845 <= arg0.field838) {
				arg0.field845 = arg0.field838 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1291) {
				arg0.field866 = "";
				arg0.field835 = 0;
			} else {
				arg0.field866 = class48.method254(class48.method251(field1005[var2]));
			}
		} else if (var2 == 503) {
			arg0.field845 = field1291 * 15 + 20;
			if (arg0.field845 <= arg0.field838) {
				arg0.field845 = arg0.field838 + 1;
			}
		} else if (var2 == 327) {
			arg0.field878 = 150;
			arg0.field879 = (int) (Math.sin(field1266 / 40.0D) * 256.0D) & 0x7FF;

			if (field939) {
				field939 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1277[var5];
					if (var6 >= 0) {
						var3[var4++] = class59.field821[var6].method311();
					}
				}

				class31 var7 = new class31(var4, var3);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field1038[var8] != 0) {
						var7.method132(field1033[var8][0], field1033[var8][field1038[var8]]);

						if (var8 == 1) {
							var7.method132(field1119[0], field1119[field1038[var8]]);
						}
					}
				}

				var7.method125();
				var7.method126(class62.field893[field1303.field273].field895[0]);
				var7.method135(64, 850, -30, -50, -30, true);
				arg0.field873 = var7;
			}
		} else if (var2 == 324) {
			if (field1019 == null) {
				field1019 = arg0.field871;
				field1020 = arg0.field872;
			}

			if (field1320) {
				arg0.field871 = field1020;
			} else {
				arg0.field871 = field1019;
			}
		} else if (var2 == 325) {
			if (field1019 == null) {
				field1019 = arg0.field871;
				field1020 = arg0.field872;
			}

			if (field1320) {
				arg0.field871 = field1019;
			} else {
				arg0.field871 = field1020;
			}
		} else if (var2 == 600) {
			arg0.field866 = field1305;
			if (field1266 % 20 < 10) {
				arg0.field866 = arg0.field866 + "|";
			} else {
				arg0.field866 = arg0.field866 + " ";
			}
		} else if (var2 == 613) {
			if (!field1192) {
				arg0.field866 = "";
			} else if (field1161) {
				arg0.field868 = 0xFF0000;
				arg0.field866 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field868 = 0xFFFFFF;
				arg0.field866 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1016 == 0) {
				arg0.field866 = "";
			} else {
				String var9;
				if (field1276 == 0) {
					var9 = "earlier today";
				} else if (field1276 == 1) {
					var9 = "yesterday";
				} else {
					var9 = field1276 + " days ago";
				}

				arg0.field866 = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1054 == 0) {
				arg0.field866 = "0 unread messages";
				arg0.field868 = 0xFFFF00;
			}

			if (field1054 == 1) {
				arg0.field866 = "1 unread message";
				arg0.field868 = 0xFF00;
			}

			if (field1054 > 1) {
				arg0.field866 = field1054 + " unread messages";
				arg0.field868 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1046 == 201) {
				arg0.field866 = "";
			} else if (field1046 == 200) {
				arg0.field866 = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (field1046 == 0) {
					var10 = "Earlier today";
				} else if (field1046 == 1) {
					var10 = "Yesterday";
				} else {
					var10 = field1046 + " days ago";
				}

				arg0.field866 = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1046 == 201) {
				arg0.field866 = "";
			} else if (field1046 == 200) {
				arg0.field866 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field866 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1046 == 201) {
				arg0.field866 = "";
			} else if (field1046 == 200) {
				arg0.field866 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field866 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method451() {
		if (field1009 == 0 && field1001 == 0) {
			field1125[field983] = "Walk here";
			field1318[field983] = 256;
			field1316[field983] = field15;
			field1317[field983] = field16;
			field983++;
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

				if (var6 == 2 && field992.method80(field1180, var4, var5, var3) >= 0) {
					class53 var8 = class53.method274(var7);
					if (field1009 == 1) {
						field1125[field983] = "Use " + field1013 + " with @cya@" + var8.field701;
						field1318[field983] = 825;
						field1319[field983] = var3;
						field1316[field983] = var4;
						field1317[field983] = var5;
						field983++;
					} else if (field1001 != 1) {
						if (var8.field717 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field717[var9] != null) {
									field1125[field983] = var8.field717[var9] + " @cya@" + var8.field701;

									if (var9 == 0) {
										field1318[field983] = 943;
									}

									if (var9 == 1) {
										field1318[field983] = 782;
									}

									if (var9 == 2) {
										field1318[field983] = 393;
									}

									if (var9 == 3) {
										field1318[field983] = 68;
									}

									if (var9 == 4) {
										field1318[field983] = 653;
									}

									field1319[field983] = var3;
									field1316[field983] = var4;
									field1317[field983] = var5;
									field983++;
								}
							}
						}

						field1125[field983] = "Examine @cya@" + var8.field701;
						field1318[field983] = 1387;
						field1319[field983] = var3;
						field1316[field983] = var4;
						field1317[field983] = var5;
						field983++;
					} else if ((field1003 & 0x4) == 4) {
						field1125[field983] = field1004 + " @cya@" + var8.field701;
						field1318[field983] = 771;
						field1319[field983] = var3;
						field1316[field983] = var4;
						field1317[field983] = var5;
						field983++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field1028[var7];
					if (var10.field320.field741 == 1 && (var10.field268 & 0x7F) == 0x40 && (var10.field269 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1029; var11++) {
							class25 var12 = field1028[field1030[var11]];
							if (var12 != null && var10 != var12 && var12.field320.field741 == 1 && var10.field268 == var12.field268 && var10.field269 == var12.field269) {
								method449(var12.field320, var5, var4, field1030[var11]);
							}
						}
					}

					method449(var10.field320, var5, var4, var7);
				}

				if (var6 == 0) {
					class26 var13 = field962[var7];
					if ((var13.field268 & 0x7F) == 0x40 && (var13.field269 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1029; var14++) {
							class25 var15 = field1028[field1030[var14]];
							if (var15 != null && var15.field320.field741 == 1 && var13.field268 == var15.field268 && var13.field269 == var15.field269) {
								method449(var15.field320, var5, var4, field1030[var14]);
							}
						}

						for (int var16 = 0; var16 < field963; var16++) {
							class26 var17 = field962[field964[var16]];
							if (var17 != null && var13 != var17 && var13.field268 == var17.field268 && var13.field269 == var17.field269) {
								method394(var4, var17, field964[var16], var5);
							}
						}
					}

					method394(var4, var13, var7, var5);
				}

				if (var6 == 3) {
					class41 var18 = field1097[field1180][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method228(); var19 != null; var19 = (class22) var18.method230()) {
							class55 var20 = class55.method286(var19.field266);
							if (field1009 == 1) {
								field1125[field983] = "Use " + field1013 + " with @lre@" + var20.field769;
								field1318[field983] = 106;
								field1319[field983] = var19.field266;
								field1316[field983] = var4;
								field1317[field983] = var5;
								field983++;
							} else if (field1001 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field783 != null && var20.field783[var21] != null) {
										field1125[field983] = var20.field783[var21] + " @lre@" + var20.field769;

										if (var21 == 0) {
											field1318[field983] = 308;
										}

										if (var21 == 1) {
											field1318[field983] = 445;
										}

										if (var21 == 2) {
											field1318[field983] = 848;
										}

										if (var21 == 3) {
											field1318[field983] = 221;
										}

										if (var21 == 4) {
											field1318[field983] = 273;
										}

										field1319[field983] = var19.field266;
										field1316[field983] = var4;
										field1317[field983] = var5;
										field983++;
									} else if (var21 == 2) {
										field1125[field983] = "Take @lre@" + var20.field769;
										field1318[field983] = 848;
										field1319[field983] = var19.field266;
										field1316[field983] = var4;
										field1317[field983] = var5;
										field983++;
									}
								}

								field1125[field983] = "Examine @lre@" + var20.field769;
								field1318[field983] = 1536;
								field1319[field983] = var19.field266;
								field1316[field983] = var4;
								field1317[field983] = var5;
								field983++;
							} else if ((field1003 & 0x1) == 1) {
								field1125[field983] = field1004 + " @lre@" + var20.field769;
								field1318[field983] = 788;
								field1319[field983] = var19.field266;
								field1316[field983] = var4;
								field1317[field983] = var5;
								field983++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILkb;)V")
	public final void method452(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field965; var3++) {
			int var4 = field966[var3];
			class25 var5 = field1028[var4];
			int var6 = arg1.method208();
			if ((var6 & 0x2) == 2) {
				int var7 = arg1.method210();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field295 == var7) {
					var5.field299 = 0;
				}

				int var8 = arg1.method208();
				if (var7 == -1 || var5.field295 == -1 || class62.field893[var7].field901 > class62.field893[var5.field295].field901 || class62.field893[var5.field295].field901 == 0) {
					var5.field295 = var7;
					var5.field296 = 0;
					var5.field297 = 0;
					var5.field298 = var8;
					var5.field299 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field289 = arg1.method210();
				if (var5.field289 == 0xFFFF) {
					var5.field289 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field280 = arg1.method215();
				var5.field281 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field284 = arg1.method208();
				var5.field285 = arg1.method208();
				var5.field286 = field1266 + 400;
				var5.field287 = arg1.method208();
				var5.field288 = arg1.method208();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field320 = class54.method280(arg1.method210());
				var5.field275 = var5.field320.field745;
				var5.field276 = var5.field320.field746;
				var5.field277 = var5.field320.field747;
				var5.field278 = var5.field320.field748;
				var5.field273 = var5.field320.field744;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field300 = arg1.method210();
				int var9 = arg1.method213();
				var5.field304 = var9 >> 16;
				var5.field303 = (var9 & 0xFFFF) + field1266;
				var5.field301 = 0;
				var5.field302 = 0;

				if (var5.field303 > field1266) {
					var5.field301 = -1;
				}

				if (var5.field300 == 0xFFFF) {
					var5.field300 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field290 = arg1.method210();
				var5.field291 = arg1.method210();
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method7() {
		if (!field1287 && !field1230 && !field1108) {
			field1266++;

			if (field1250) {
				method436();
			} else {
				method392();
			}
		}
	}

	@ObfuscatedName("client.d(ILkb;I)V")
	public final void method453(int arg0, class37 arg1) {
		while (arg1.field541 + 10 < arg0 * 8) {
			int var3 = arg1.method219(11);
			if (var3 == 2047) {
				break;
			}

			if (field962[var3] == null) {
				field962[var3] = new class26();
				if (field967[var3] != null) {
					field962[var3].method112(field967[var3]);
				}
			}

			field964[field963++] = var3;
			class26 var4 = field962[var3];
			var4.field312 = field1266;
			int var5 = arg1.method219(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method219(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method219(1);
			var4.method108(field1303.field316[0] + var5, field1303.field317[0] + var6, var7 == 1);
			field966[field965++] = var3;
		}

		arg1.method220();
	}

	@ObfuscatedName("client.a(ILkb;Z)V")
	public final void method454(int arg0, class37 arg1) {
		arg1.method218();
		int var3 = arg1.method219(8);
		if (var3 < field1029) {
			for (int var4 = var3; var4 < field1029; var4++) {
				field1221[field1220++] = field1030[var4];
			}
		}

		if (var3 > field1029) {
			signlink.reporterror(field1167 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1029 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1030[var5];
			class25 var7 = field1028[var6];
			int var8 = arg1.method219(1);
			if (var8 == 0) {
				field1030[field1029++] = var6;
				var7.field312 = field1266;
			} else {
				int var9 = arg1.method219(2);
				if (var9 == 0) {
					field1030[field1029++] = var6;
					var7.field312 = field1266;
					field966[field965++] = var6;
				} else if (var9 == 1) {
					field1030[field1029++] = var6;
					var7.field312 = field1266;
					int var10 = arg1.method219(3);
					var7.method109(false, var10);
					int var11 = arg1.method219(1);
					if (var11 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 2) {
					field1030[field1029++] = var6;
					var7.field312 = field1266;
					int var12 = arg1.method219(3);
					var7.method109(true, var12);
					int var13 = arg1.method219(3);
					var7.method109(true, var13);
					int var14 = arg1.method219(1);
					if (var14 == 1) {
						field966[field965++] = var6;
					}
				} else if (var9 == 3) {
					field1221[field1220++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIII)V")
	public final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
			if (field1101 && field1180 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field992.method76(arg3, arg0, arg5);
			}

			if (arg2 == 1) {
				var8 = field992.method77(arg0, arg3, arg5);
			}

			if (arg2 == 2) {
				var8 = field992.method78(arg3, arg0, arg5);
			}

			if (arg2 == 3) {
				var8 = field992.method79(arg3, arg0, arg5);
			}

			if (var8 != 0) {
				int var12 = field992.method80(arg3, arg0, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field992.method71(arg0, arg3, arg5);
					class53 var16 = class53.method274(var13);
					if (var16.field707) {
						field984[arg3].method299(arg5, var16.field708, var14, arg0, var15);
					}
				}

				if (arg2 == 1) {
					field992.method72(arg0, arg3, arg5);
				}

				if (arg2 == 2) {
					field992.method73(arg5, arg3, arg0);
					class53 var17 = class53.method274(var13);
					if (var17.field705 + arg0 > 103 || var17.field705 + arg5 > 103 || var17.field706 + arg0 > 103 || var17.field706 + arg5 > 103) {
						return;
					}

					if (var17.field707) {
						field984[arg3].method300(var17.field706, arg0, var17.field708, var17.field705, var15, arg5);
					}
				}

				if (arg2 == 3) {
					field992.method74(arg3, arg0, arg5);
					class53 var18 = class53.method274(var13);
					if (var18.field707 && var18.field709) {
						field984[arg3].method302(arg5, arg0);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field1134[1][arg0][arg5] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				class3.method28(field992, arg4, field984[arg3], arg0, field1222, arg5, arg3, field951, var19, arg6, arg1);
				return;
			}
		}
	}

	public final int getjinglelen() {
		return signlink.jinglems;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method456() {
		if (field1071 == 1) {
			field1263[field1070 / 100].method172(field1068 - 8 - 8, field1069 - 8 - 11);
		}

		if (field1071 == 2) {
			field1263[field1070 / 100 + 4].method172(field1068 - 8 - 8, field1069 - 8 - 11);
			field1237++;
			if (field1237 > 161) {
				field1237 = 0;
				field1034.method197(249);
				field1034.method199(9331);
			}
		}

		if (field1086 != -1) {
			method447(field1031, field1086);
			method469(0, class60.field827[field1086], 0, 0);
		}

		method412();

		if (!field1067) {
			method374();
			method457();
		} else if (field1148 == 0) {
			method402();
		}

		if (field1063 == 1) {
			field1300[1].method172(5, 296);
		}

		if (field1109 > 0) {
			field1300[0].method172(472, 296);
			field1171.method187("Level: " + field1109, 329, 484, 0xFFFF00);
		}

		if (field1131 == 1) {
			field1300[0].method172(472, 296);
			field1171.method187("Arena", 329, 484, 0xFFFF00);
		} else if (field1101) {
			int var1 = 0xFFFF00;
			Runtime var2 = Runtime.getRuntime();
			long var3 = var2.totalMemory();
			long var5 = var2.freeMemory();
			if (!signlink.sunjava && var3 - var5 > 0x2000000L && field1266 > field1302 + 500) {
				method364();
				var2.gc();
				int var7 = 0xFF0000;
				field1302 = field1266;
			}
		}

		if (field1047 != 0) {
			int var8 = field1047 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1171.method187("System update in: " + var9 + ":0" + var8, 329, 256, 0xFFFF00);
			} else {
				field1171.method187("System update in: " + var9 + ":" + var8, 329, 256, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method457() {
		if (field983 >= 2 || field1009 != 0 || field1001 != 0) {
			String var1;
			if (field1009 == 1 && field983 < 2) {
				var1 = "Use " + field1013 + " with...";
			} else if (field1001 == 1 && field983 < 2) {
				var1 = field1004 + "...";
			} else {
				var1 = field1125[field983 - 1];
			}

			if (field983 > 2) {
				var1 = var1 + "@whi@ / " + (field983 - 2) + " more options";
			}

			field1172.method192(true, 0xFFFFFF, 4, 15, var1);
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		method417("scape_main");

		if (field1262) {
			field1287 = true;
		} else {
			field1262 = true;
			boolean var1 = false;
			String var2 = method424();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
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
					field1265[8] = 0;
					while (field1265[8] == 0) {
						method13(10, "Connecting to fileserver");

						try {
							DataInputStream var4 = method400("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[36]);
							var4.readFully(var5.field539, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								field1265[var6] = var5.method213();
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

					field1110 = method418("title", field1265[1], "title screen", 10);
					field1170 = new class36("p11", field1110);
					field1171 = new class36("p12", field1110);
					field1172 = new class36("b12", field1110);
					field1173 = new class36("q8", field1110);
					method463();
					method409();
					class47 var8 = method418("config", field1265[2], "config", 15);
					class47 var9 = method418("interface", field1265[3], "interface", 20);
					class47 var10 = method418("media", field1265[4], "2d graphics", 30);
					class47 var11 = method418("models", field1265[5], "3d graphics", 40);
					class47 var12 = method418("textures", field1265[6], "textures", 60);
					class47 var13 = method418("wordenc", field1265[7], "chat system", 65);
					class47 var14 = method418("sounds", field1265[8], "sound effects", 70);
					field1134 = new byte[4][104][104];
					field1222 = new int[4][105][105];
					field992 = new class18(field1222, 4, 104, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field984[var15] = new class57(104, 104);
					}

					field1242 = new class34(512, 512);
					method13(75, "Unpacking media");
					field1142 = new class35(var10, "invback", 0);
					field1144 = new class35(var10, "chatback", 0);
					field1143 = new class35(var10, "mapback", 0);
					field1021 = new class35(var10, "backbase1", 0);
					field1022 = new class35(var10, "backbase2", 0);
					field1023 = new class35(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						field1178[var16] = new class35(var10, "sideicons", var16);
					}

					field1301 = new class34(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							field1043[var17] = new class35(var10, "mapscene", var17);
						}
					} catch (Exception var53) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							field1304[var18] = new class34(var10, "mapfunction", var18);
						}
					} catch (Exception var52) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							field1008[var19] = new class34(var10, "hitmarks", var19);
						}
					} catch (Exception var51) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							field1300[var20] = new class34(var10, "headicons", var20);
						}
					} catch (Exception var50) {
					}

					field1176 = new class34(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						field1263[var21] = new class34(var10, "cross", var21);
					}

					field1246 = new class34(var10, "mapdots", 0);
					field1247 = new class34(var10, "mapdots", 1);
					field1248 = new class34(var10, "mapdots", 2);
					field1249 = new class34(var10, "mapdots", 3);
					field1227 = new class35(var10, "scrollbar", 0);
					field1228 = new class35(var10, "scrollbar", 1);
					field1120 = new class35(var10, "redstone1", 0);
					field1121 = new class35(var10, "redstone2", 0);
					field1122 = new class35(var10, "redstone3", 0);
					field1123 = new class35(var10, "redstone1", 0);
					field1123.method183();
					field1124 = new class35(var10, "redstone2", 0);
					field1124.method183();
					field985 = new class35(var10, "redstone1", 0);
					field985.method184();
					field986 = new class35(var10, "redstone2", 0);
					field986.method184();
					field987 = new class35(var10, "redstone3", 0);
					field987.method184();
					field988 = new class35(var10, "redstone1", 0);
					field988.method183();
					field988.method184();
					field989 = new class35(var10, "redstone2", 0);
					field989.method183();
					field989.method184();
					class34 var22 = new class34(var10, "backleft1", 0);
					field1181 = new class43(method11(), var22.field516, var22.field517);
					var22.method170(0, 0);
					class34 var23 = new class34(var10, "backleft2", 0);
					field1182 = new class43(method11(), var23.field516, var23.field517);
					var23.method170(0, 0);
					class34 var24 = new class34(var10, "backright1", 0);
					field1183 = new class43(method11(), var24.field516, var24.field517);
					var24.method170(0, 0);
					class34 var25 = new class34(var10, "backright2", 0);
					field1184 = new class43(method11(), var25.field516, var25.field517);
					var25.method170(0, 0);
					class34 var26 = new class34(var10, "backtop1", 0);
					field1185 = new class43(method11(), var26.field516, var26.field517);
					var26.method170(0, 0);
					class34 var27 = new class34(var10, "backtop2", 0);
					field1186 = new class43(method11(), var27.field516, var27.field517);
					var27.method170(0, 0);
					class34 var28 = new class34(var10, "backvmid1", 0);
					field1187 = new class43(method11(), var28.field516, var28.field517);
					var28.method170(0, 0);
					class34 var29 = new class34(var10, "backvmid2", 0);
					field1188 = new class43(method11(), var29.field516, var29.field517);
					var29.method170(0, 0);
					class34 var30 = new class34(var10, "backvmid3", 0);
					field1189 = new class43(method11(), var30.field516, var30.field517);
					var30.method170(0, 0);
					class34 var31 = new class34(var10, "backhmid2", 0);
					field1190 = new class43(method11(), var31.field516, var31.field517);
					var31.method170(0, 0);
					method13(80, "Unpacking textures");
					class33.method157(var12);
					class33.method161(0.8D);
					class33.method156(20);
					method13(83, "Unpacking models");
					class31.method120(var11);
					class6.method47(var11);
					class7.method48(var11);
					method13(86, "Unpacking config");
					class62.method317(var8);
					class53.method272(var8);
					class58.method306(var8);
					class55.method284(var8);
					class54.method278(var8);
					class59.method309(var8);
					class63.method319(var8);
					class64.method322(var8);
					class55.field766 = field1100;

					if (!field1101) {
						method13(90, "Unpacking sounds");
						byte[] var32 = var14.method249("sounds.dat", null);
						class37 var33 = new class37(var32);
						class51.method262(var33);
					}

					method13(92, "Unpacking interfaces");
					class36[] var34 = new class36[] { field1170, field1171, field1172, field1173 };
					class60.method313(var10, var9, var34);
					method13(97, "Preparing game engine");

					for (int var35 = 0; var35 < 33; var35++) {
						int var36 = 999;
						int var37 = 0;
						for (int var38 = 0; var38 < 35; var38++) {
							if (field1143.field522[field1143.field524 * var35 + var38] == 0) {
								if (var36 == 999) {
									var36 = var38;
								}
							} else if (var36 != 999) {
								var37 = var38;
								break;
							}
						}

						field1127[var35] = var36;
						field1293[var35] = var37 - var36;
					}

					for (int var39 = 9; var39 < 160; var39++) {
						int var40 = 999;
						int var41 = 0;
						for (int var42 = 10; var42 < 168; var42++) {
							if (field1143.field522[field1143.field524 * var39 + var42] == 0 && (var42 > 34 || var39 > 34)) {
								if (var40 == 999) {
									var40 = var42;
								}
							} else if (var40 != 999) {
								var41 = var42;
								break;
							}
						}

						field1283[var39 - 9] = var40 - 21;
						field1135[var39 - 9] = var41 - var40;
					}

					class33.method154(479, 96);
					field1197 = class33.field503;
					class33.method154(190, 261);
					field1198 = class33.field503;
					class33.method154(512, 334);
					field1199 = class33.field503;
					int[] var43 = new int[9];
					for (int var44 = 0; var44 < 9; var44++) {
						int var45 = var44 * 32 + 128 + 15;
						int var46 = var45 * 3 + 600;
						int var47 = class33.field501[var45];
						var43[var44] = var46 * var47 >> 16;
					}

					class18.method86(512, 800, var43, 500, 334);
					class65.method324(var13);
				} catch (Exception var55) {
					field1230 = true;
				}
			} else {
				field1108 = true;
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void method458(class37 arg0, int arg1) {
		if (arg1 == 204 || arg1 == 140) {
			int var3 = arg0.method208();
			int var4 = (var3 >> 4 & 0x7) + field1078;
			int var5 = (var3 & 0x7) + field1079;
			int var6 = arg0.method208();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1037[var7];
			int var10;
			if (arg1 == 140) {
				var10 = -1;
			} else {
				var10 = arg0.method210();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field981.method227(); var12 != null; var12 = (class38) field981.method229()) {
					if (field1180 == var12.field551 && var12.field553 == var4 && var12.field554 == var5 && var12.field552 == var9) {
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
						var13 = field992.method76(field1180, var4, var5);
					}

					if (var9 == 1) {
						var13 = field992.method77(var4, field1180, var5);
					}

					if (var9 == 2) {
						var13 = field992.method78(field1180, var4, var5);
					}

					if (var9 == 3) {
						var13 = field992.method79(field1180, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field992.method80(field1180, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field551 = field1180;
					var11.field552 = var9;
					var11.field553 = var4;
					var11.field554 = var5;
					var11.field558 = var14;
					var11.field560 = var15;
					var11.field559 = var16;
					field981.method224(var11);
				}

				var11.field555 = var10;
				var11.field557 = var7;
				var11.field556 = var8;
				method455(var4, var8, var9, field1180, var10, var5, var7);
			}
		} else if (arg1 == 63) {
			int var18 = arg0.method208();
			int var19 = (var18 >> 4 & 0x7) + field1078;
			int var20 = (var18 & 0x7) + field1079;
			int var21 = arg0.method208();
			int var22 = var21 >> 2;
			int var23 = field1037[var22];
			int var24 = arg0.method210();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = field992.method76(field1180, var19, var20);
				}

				if (var23 == 1) {
					var25 = field992.method77(var19, field1180, var20);
				}

				if (var23 == 2) {
					var25 = field992.method78(field1180, var19, var20);
				}

				if (var23 == 3) {
					var25 = field992.method79(field1180, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(var25 >> 14 & 0x7FFF, var20, field1180, class62.field893[var24], var19, var23, false);
					field951.method224(var26);
				}
			}
		} else if (arg1 == 134) {
			int var27 = arg0.method208();
			int var28 = (var27 >> 4 & 0x7) + field1078;
			int var29 = (var27 & 0x7) + field1079;
			int var30 = arg0.method210();
			int var31 = arg0.method210();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var32 = new class22();
				var32.field266 = var30;
				var32.field267 = var31;

				if (field1097[field1180][var28][var29] == null) {
					field1097[field1180][var28][var29] = new class41();
				}

				field1097[field1180][var28][var29].method224(var32);
				method367(var28, var29);
			}
		} else if (arg1 == 106) {
			int var33 = arg0.method208();
			int var34 = (var33 >> 4 & 0x7) + field1078;
			int var35 = (var33 & 0x7) + field1079;
			int var36 = arg0.method210();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				class41 var37 = field1097[field1180][var34][var35];
				if (var37 != null) {
					for (class22 var38 = (class22) var37.method227(); var38 != null; var38 = (class22) var37.method229()) {
						if ((var36 & 0x7FFF) == var38.field266) {
							var38.method106();
							break;
						}
					}

					if (var37.method227() == null) {
						field1097[field1180][var34][var35] = null;
					}

					method367(var34, var35);
				}
			}
		} else if (arg1 == 175) {
			int var39 = arg0.method208();
			int var40 = (var39 >> 4 & 0x7) + field1078;
			int var41 = (var39 & 0x7) + field1079;
			int var42 = var40 + arg0.method209();
			int var43 = var41 + arg0.method209();
			int var44 = arg0.method211();
			int var45 = arg0.method210();
			int var46 = arg0.method208();
			int var47 = arg0.method208();
			int var48 = arg0.method210();
			int var49 = arg0.method210();
			int var50 = arg0.method208();
			int var51 = arg0.method208();
			if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				class27 var52 = new class27(field1180, var40, field1266 + var49, var51, method419(field1180, var40, var41) - var46, var50, var47, var45, var44, field1266 + var48, var41);
				var52.method115(var43, method419(field1180, var42, var43) - var47, field1266 + var48, var42);
				field1073.method224(var52);
			}
		} else if (arg1 == 209) {
			int var53 = arg0.method208();
			int var54 = (var53 >> 4 & 0x7) + field1078;
			int var55 = (var53 & 0x7) + field1079;
			int var56 = arg0.method210();
			int var57 = arg0.method208();
			int var58 = arg0.method210();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				class28 var59 = new class28(var58, method419(field1180, var54, var55) - var57, var56, var55, var54, field1266, field1180);
				field1128.method224(var59);
			}
		} else if (arg1 == 181) {
			int var60 = arg0.method208();
			int var61 = (var60 >> 4 & 0x7) + field1078;
			int var62 = (var60 & 0x7) + field1079;
			int var63 = arg0.method210();
			int var64 = arg0.method210();
			int var65 = arg0.method210();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && field1158 != var65) {
				class22 var66 = new class22();
				var66.field266 = var63;
				var66.field267 = var64;

				if (field1097[field1180][var61][var62] == null) {
					field1097[field1180][var61][var62] = new class41();
				}

				field1097[field1180][var61][var62].method224(var66);
				method367(var61, var62);
			}
		} else if (arg1 == 146) {
			int var67 = arg0.method208();
			int var68 = (var67 >> 4 & 0x7) + field1078;
			int var69 = (var67 & 0x7) + field1079;
			int var70 = arg0.method208();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = field1037[var71];
			int var74 = arg0.method210();
			int var75 = arg0.method210();
			int var76 = arg0.method210();
			int var77 = arg0.method210();
			byte var78 = arg0.method209();
			byte var79 = arg0.method209();
			byte var80 = arg0.method209();
			byte var81 = arg0.method209();
			class26 var82;
			if (field1158 == var77) {
				var82 = field1303;
			} else {
				var82 = field962[var77];
			}

			if (var82 != null) {
				class39 var83 = new class39(var68, var73, var72, field1180, -1, var71, var69, field1266 + var75);
				field1224.method224(var83);
				class39 var84 = new class39(var68, var73, var72, field1180, var74, var71, var69, field1266 + var76);
				field1224.method224(var84);
				int var85 = field1222[field1180][var68][var69];
				int var86 = field1222[field1180][var68 + 1][var69];
				int var87 = field1222[field1180][var68 + 1][var69 + 1];
				int var88 = field1222[field1180][var68][var69 + 1];
				class53 var89 = class53.method274(var74);
				var82.field330 = field1266 + var75;
				var82.field331 = field1266 + var76;
				var82.field335 = var89.method277(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.field705;
				int var91 = var89.field706;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.field706;
					var91 = var89.field705;
				}

				var82.field332 = var68 * 128 + var90 * 64;
				var82.field334 = var69 * 128 + var91 * 64;
				var82.field333 = method419(field1180, var82.field332, var82.field334);

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
		} else if (arg1 == 156) {
			int var94 = arg0.method208();
			int var95 = (var94 >> 4 & 0x7) + field1078;
			int var96 = (var94 & 0x7) + field1079;
			int var97 = arg0.method210();
			int var98 = arg0.method210();
			int var99 = arg0.method210();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1097[field1180][var95][var96];
				if (var100 != null) {
					for (class22 var101 = (class22) var100.method227(); var101 != null; var101 = (class22) var100.method229()) {
						if ((var97 & 0x7FFF) == var101.field266 && var101.field267 == var98) {
							var101.field267 = var99;
							break;
						}
					}

					method367(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method459() {
		for (class40 var1 = (class40) field951.method227(); var1 != null; var1 = (class40) field951.method229()) {
			boolean var2 = false;
			var1.field576 += field1031;

			if (var1.field575 == -1) {
				var1.field575 = 0;
				var2 = true;
			}

			while (var1.field576 > var1.field574.field897[var1.field575]) {
				var1.field576 -= var1.field574.field897[var1.field575] + 1;
				var1.field575++;
				var2 = true;

				if (var1.field575 >= var1.field574.field894) {
					var1.field575 -= var1.field574.field898;
					if (var1.field575 < 0 || var1.field575 >= var1.field574.field894) {
						break;
					}
				}
			}

			var1.method106();
			var2 = false;
			if (var2) {
				int var3 = var1.field569;
				int var4 = var1.field571;
				int var5 = var1.field572;
				int var6 = 0;
				if (var1.field570 == 0) {
					var6 = field992.method76(var3, var4, var5);
				}

				if (var1.field570 == 1) {
					var6 = field992.method77(var4, var3, var5);
				}

				if (var1.field570 == 2) {
					var6 = field992.method78(var3, var4, var5);
				}

				if (var1.field570 == 3) {
					var6 = field992.method79(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field573) {
					int var7 = field1222[var3][var4][var5];
					int var8 = field1222[var3][var4 + 1][var5];
					int var9 = field1222[var3][var4 + 1][var5 + 1];
					int var10 = field1222[var3][var4][var5 + 1];
					class53 var11 = class53.method274(var1.field573);
					int var12 = -1;
					if (var1.field575 != -1) {
						var12 = var1.field574.field895[var1.field575];
					}

					if (var1.field570 == 2) {
						int var13 = field992.method80(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						class31 var16 = var11.method277(var14, var15, var7, var8, var9, var10, var12);
						field992.method66(var4, var16, var5, var3);
					} else if (var1.field570 == 1) {
						class31 var17 = var11.method277(4, 0, var7, var8, var9, var10, var12);
						field992.method67(var4, var17, var5, var3);
					} else if (var1.field570 == 0) {
						int var18 = field992.method80(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							class31 var22 = var11.method277(2, var20 + 4, var7, var8, var9, var10, var12);
							class31 var23 = var11.method277(2, var21, var7, var8, var9, var10, var12);
							field992.method70(var4, var22, var5, var23, var3);
						} else {
							class31 var24 = var11.method277(var19, var20, var7, var8, var9, var10, var12);
							field992.method69(var5, var24, var4, var3);
						}
					} else if (var1.field570 == 3) {
						int var25 = field992.method80(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						class31 var27 = var11.method277(22, var26, var7, var8, var9, var10, var12);
						field992.method68(var5, var27, var4, var3);
					}
				} else {
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILz;Lkb;II)V")
	public final void method460(class26 arg0, class37 arg1, int arg2, int arg3) {
		if ((arg2 & 0x1) == 1) {
			int var5 = arg1.method208();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg1.method217(var6, var5, 0);
			field967[arg3] = var7;
			arg0.method112(var7);
		}

		if ((arg2 & 0x2) == 2) {
			int var8 = arg1.method210();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg0.field295 == var8) {
				arg0.field299 = 0;
			}

			int var9 = arg1.method208();
			if (var8 == -1 || arg0.field295 == -1 || class62.field893[var8].field901 > class62.field893[arg0.field295].field901 || class62.field893[arg0.field295].field901 == 0) {
				arg0.field295 = var8;
				arg0.field296 = 0;
				arg0.field297 = 0;
				arg0.field298 = var9;
				arg0.field299 = 0;
			}
		}

		if ((arg2 & 0x4) == 4) {
			arg0.field289 = arg1.method210();
			if (arg0.field289 == 0xFFFF) {
				arg0.field289 = -1;
			}
		}

		if ((arg2 & 0x8) == 8) {
			arg0.field280 = arg1.method215();
			arg0.field282 = 0;
			arg0.field283 = 0;
			arg0.field281 = 150;
			method375(2, arg0.field280, arg0.field321);
		}

		if ((arg2 & 0x10) == 0x10) {
			arg0.field284 = arg1.method208();
			arg0.field285 = arg1.method208();
			arg0.field286 = field1266 + 400;
			arg0.field287 = arg1.method208();
			arg0.field288 = arg1.method208();
		}

		if ((arg2 & 0x20) == 0x20) {
			arg0.field290 = arg1.method210();
			arg0.field291 = arg1.method210();
		}

		if ((arg2 & 0x40) == 0x40) {
			int var10 = arg1.method210();
			int var11 = arg1.method208();
			int var12 = arg1.method208();
			int var13 = arg1.field540;

			if (arg0.field321 != null) {
				long var14 = class48.method250(arg0.field321);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1291; var17++) {
						if (field1005[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1269 == 0) {
					try {
						String var18 = class49.method257(var12, arg1);
						var18 = class65.method334(var18);
						arg0.field280 = var18;
						arg0.field282 = var10 >> 8;
						arg0.field283 = var10 & 0xFF;
						arg0.field281 = 150;

						if (var11 > 1) {
							method375(1, var18, arg0.field321);
						} else {
							method375(2, var18, arg0.field321);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field540 = var12 + var13;
		}

		if ((arg2 & 0x100) == 0x100) {
			arg0.field300 = arg1.method210();
			int var20 = arg1.method213();
			arg0.field304 = var20 >> 16;
			arg0.field303 = (var20 & 0xFFFF) + field1266;
			arg0.field301 = 0;
			arg0.field302 = 0;

			if (arg0.field303 > field1266) {
				arg0.field301 = -1;
			}

			if (arg0.field300 == 0xFFFF) {
				arg0.field300 = -1;
			}
		}

		if ((arg2 & 0x200) == 0x200) {
			arg0.field305 = arg1.method208();
			arg0.field307 = arg1.method208();
			arg0.field306 = arg1.method208();
			arg0.field308 = arg1.method208();
			arg0.field309 = arg1.method210() + field1266;
			arg0.field310 = arg1.method210() + field1266;
			arg0.field311 = arg1.method208();
			arg0.field315 = 0;
			arg0.field316[0] = arg0.field306;
			arg0.field317[0] = arg0.field308;
		}
	}

	@ObfuscatedName("client.H(I)V")
	public static final void method461() {
		class18.field194 = true;
		class33.field492 = true;
		field1101 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method462() {
		field939 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1277[var1] = -1;
			for (int var2 = 0; var2 < class59.field820; var2++) {
				if (class59.field821[var2].field822 == var1 + (field1320 ? 0 : 7)) {
					field1277[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method463() {
		byte[] var1 = field1110.method249("title.dat", null);
		class34 var2 = new class34(var1, this);
		field972.method234();
		var2.method170(0, 0);
		field973.method234();
		var2.method170(0, -661);
		field969.method234();
		var2.method170(0, -128);
		field970.method234();
		var2.method170(-386, -214);
		field971.method234();
		var2.method170(-186, -214);
		field974.method234();
		var2.method170(-265, 0);
		field975.method234();
		var2.method170(-265, -574);
		field976.method234();
		var2.method170(-186, -128);
		field977.method234();
		var2.method170(-186, -574);
		int[] var3 = new int[var2.field516];
		for (int var4 = 0; var4 < var2.field517; var4++) {
			for (int var5 = 0; var5 < var2.field516; var5++) {
				var3[var5] = var2.field515[var2.field516 * var4 + var2.field516 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field516; var6++) {
				var2.field515[var2.field516 * var4 + var6] = var3[var6];
			}
		}

		field972.method234();
		var2.method170(0, 394);
		field973.method234();
		var2.method170(0, -267);
		field969.method234();
		var2.method170(0, 266);
		field970.method234();
		var2.method170(-386, 180);
		field971.method234();
		var2.method170(-186, 180);
		field974.method234();
		var2.method170(-265, 394);
		field975.method234();
		var2.method170(-265, -180);
		field976.method234();
		var2.method170(-186, 212);
		field977.method234();
		var2.method170(-186, -180);
		class34 var7 = new class34(field1110, "logo", 0);
		field969.method234();
		var7.method172(field6 / 2 - var7.field516 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.l(B)V")
	public final void method464() {
		try {
			if (field1251 != null) {
				field1251.method29();
			}
		} catch (Exception var2) {
		}

		field1251 = null;
		field1250 = false;
		field1286 = 0;
		field1167 = "";
		field1168 = "";
		class5.method35(false);
		method364();
		field992.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field984[var1].method294();
		}

		System.gc();
		method417("null");
		field1032 = null;
	}

	@ObfuscatedName("client.a(ZIILhc;IIIII)V")
	public final void method465(boolean arg0, int arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field1035) {
			field1126 = 32;
		} else {
			field1126 = 0;
		}

		field1035 = false;
		if (arg7 >= arg4 && arg7 < arg4 + 16 && arg1 >= arg3 && arg1 < arg3 + 16) {
			arg2.field846 -= field1072 * 4;

			if (arg0) {
				field1074 = true;
				return;
			}
		} else if (arg7 >= arg4 && arg7 < arg4 + 16 && arg1 >= arg3 + arg6 - 16 && arg1 < arg3 + arg6) {
			arg2.field846 += field1072 * 4;

			if (arg0) {
				field1074 = true;
				return;
			}
		} else if (arg7 >= arg4 - field1126 && arg7 < arg4 + field1126 + 16 && arg1 >= arg3 + 16 && arg1 < arg3 + arg6 - 16 && field1072 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg3 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg2.field846 = (arg5 - arg6) * var10 / var11;

			if (arg0) {
				field1074 = true;
			}

			field1035 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method466() {
		field1202 = 0;
		for (int var1 = -1; var1 < field963 + field1029; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field1303;
			} else if (var1 < field963) {
				var2 = field962[field964[var1]];
			} else {
				var2 = field1028[field1030[var1 - field963]];
			}

			if (var2 != null && var2.method110()) {
				if (var1 < field963) {
					class26 var3 = (class26) var2;
					if (var3.field324 != 0) {
						method471(var2, var2.field313 + 15);

						if (field1280 > -1) {
							int var4 = 28;
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var3.field324 & 1 << var5) != 0) {
									field1300[var5].method172(field1280 - 12, field1281 - var4);
									var4 -= 25;
								}
							}
						}
					}
				} else if (field1200 == 1 && field1030[var1 - field963] == field1194 && field1266 % 20 < 10) {
					method471(var2, var2.field313 + 15);

					if (field1280 > -1) {
						field1300[2].method172(field1280 - 12, field1281 - 28);
					}
				}

				if (var2.field280 != null && (var1 >= field963 || field958 == 0 || field958 == 1 && method396(((class26) var2).field321))) {
					method471(var2, var2.field313);

					if (field1280 > -1 && field1202 < field1203) {
						field1207[field1202] = field1172.method189(var2.field280) / 2;
						field1206[field1202] = field1172.field537;
						field1204[field1202] = field1280;
						field1205[field1202] = field1281;
						field1208[field1202] = var2.field282;
						field1209[field1202] = var2.field283;
						field1210[field1202] = var2.field281;
						field1211[field1202++] = var2.field280;

						if (field1159 == 0 && var2.field283 == 1) {
							field1206[field1202] += 10;
							field1205[field1202] += 5;
						}

						if (field1159 == 0 && var2.field283 == 2) {
							field1207[field1202] = 60;
						}
					}
				}

				if (var2.field286 > field1266 + 100) {
					method471(var2, var2.field313 + 15);

					if (field1280 > -1) {
						int var6 = var2.field287 * 30 / var2.field288;
						if (var6 > 30) {
							var6 = 30;
						}

						class32.method148(0xFF00, field1281 - 3, field1280 - 15, var6, 5);
						class32.method148(0xFF0000, field1281 - 3, field1280 - 15 + var6, 30 - var6, 5);
					}
				}

				if (var2.field286 > field1266 + 330) {
					method471(var2, var2.field313 / 2);

					if (field1280 > -1) {
						field1008[var2.field285].method172(field1280 - 12, field1281 - 12);
						field1170.method187(String.valueOf(var2.field284), field1281 + 4, field1280, 0);
						field1170.method187(String.valueOf(var2.field284), field1281 + 3, field1280 - 1, 0xFFFFFF);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field1202; var7++) {
			int var8 = field1204[var7];
			int var9 = field1205[var7];
			int var10 = field1207[var7];
			int var11 = field1206[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field1205[var13] - field1206[var13] && var9 - var11 < field1205[var13] + 2 && var8 - var10 < field1207[var13] + field1204[var13] && var8 + var10 > field1204[var13] - field1207[var13] && field1205[var13] - field1206[var13] < var9) {
						var9 = field1205[var13] - field1206[var13];
						var12 = true;
					}
				}
			}

			field1280 = field1204[var7];
			field1281 = field1205[var7] = var9;
			String var14 = field1211[var7];
			if (field1159 == 0) {
				int var15 = 0xFFFF00;
				if (field1208[var7] < 6) {
					var15 = field1155[field1208[var7]];
				}

				if (field1208[var7] == 6) {
					var15 = field1027 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1208[var7] == 7) {
					var15 = field1027 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1208[var7] == 8) {
					var15 = field1027 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1208[var7] == 9) {
					int var16 = 150 - field1210[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1208[var7] == 10) {
					int var17 = 150 - field1210[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1208[var7] == 11) {
					int var18 = 150 - field1210[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1209[var7] == 0) {
					field1172.method187(var14, field1281 + 1, field1280, 0);
					field1172.method187(var14, field1281, field1280, var15);
				}

				if (field1209[var7] == 1) {
					field1172.method191(var14, field1280, field1281 + 1, 0, field1027);
					field1172.method191(var14, field1280, field1281, var15, field1027);
				}

				if (field1209[var7] == 2) {
					int var19 = field1172.method189(var14);
					int var20 = (150 - field1210[var7]) * (var19 + 100) / 150;
					class32.method146(field1280 - 50, 0, field1280 + 50, 334);
					field1172.method190(var14, field1280 + 50 - var20, field1281 + 1, 0);
					field1172.method190(var14, field1280 + 50 - var20, field1281, var15);
					class32.method145();
				}
			} else {
				field1172.method187(var14, field1281 + 1, field1280, 0);
				field1172.method187(var14, field1281, field1280, 0xFFFF00);
			}
		}
	}

	public final void run() {
		if (field980) {
			field1243 = true;

			try {
				long var1 = System.currentTimeMillis();
				int var3 = 0;
				int var4 = 20;
				while (field1076) {
					method428();
					method428();
					method467();
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

			field1243 = false;
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method467() {
		short var1 = 256;

		if (field1014 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1014 > 768) {
					field1093[var2] = method410(field1094[var2], 1024 - field1014, field1095[var2]);
				} else if (field1014 > 256) {
					field1093[var2] = field1095[var2];
				} else {
					field1093[var2] = method410(field1095[var2], 256 - field1014, field1094[var2]);
				}
			}
		} else if (field1015 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1015 > 768) {
					field1093[var3] = method410(field1094[var3], 1024 - field1015, field1096[var3]);
				} else if (field1015 > 256) {
					field1093[var3] = field1096[var3];
				} else {
					field1093[var3] = method410(field1096[var3], 256 - field1015, field1094[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1093[var4] = field1094[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field972.field580[var5] = field1216.field515[var5];
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
				int var12 = field1082[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1093[var12];
					int var15 = field972.field580[var7];
					field972.field580[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field972.method235(field8, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field973.field580[var16] = field1217.field515[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1133[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1082[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1093[var23];
					int var26 = field973.field580[var18];
					field973.field580[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field973.method235(field8, 661, 0);
	}

	@ObfuscatedName("client.a(Lhc;II)I")
	public final int method468(class60 arg0, int arg1) {
		if (arg0.field841 == null || arg1 >= arg0.field841.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field841[arg1];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1307[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1271[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1132[var3[var5++]];
				}

				if (var6 == 4) {
					class60 var7 = class60.field827[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field828.length; var9++) {
						if (var7.field828[var9] == var8) {
							var4 += var7.field829[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field1018[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1039[field1271[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1018[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1303.field327;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1271[var10];
					}
				}

				if (var6 == 10) {
					class60 var11 = class60.field827[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field828.length; var13++) {
						if (var11.field828[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field997;
				}

				if (var6 == 12) {
					var4 += field1051;
				}

				if (var6 == 13) {
					int var14 = field1018[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		method377();

		if (field1110 == null) {
			super.method13(arg0, arg1);
		} else {
			field971.method234();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1172.method187("RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class32.method149(304, 0x8C1111, var6, var3 / 2 - 152, 34);
			class32.method149(302, 0, var6 + 1, var3 / 2 - 151, 32);
			class32.method148(0x8C1111, var6 + 2, var3 / 2 - 150, arg0 * 3, 30);
			class32.method148(0, var6 + 2, arg0 * 3 + (var3 / 2 - 150), 300 - arg0 * 3, 30);
			field1172.method187(arg1, var4 / 2 + 5 - var5, var3 / 2, 0xFFFFFF);
			field971.method235(field8, 214, 186);

			if (field1130) {
				field1130 = false;

				if (!field1076) {
					field972.method235(field8, 0, 0);
					field973.method235(field8, 661, 0);
				}

				field969.method235(field8, 128, 0);
				field970.method235(field8, 214, 386);
				field974.method235(field8, 0, 265);
				field975.method235(field8, 574, 265);
				field976.method235(field8, 128, 186);
				field977.method235(field8, 574, 186);
			}
		}
	}

	@ObfuscatedName("client.a(ILhc;BII)V")
	public final void method469(int arg0, class60 arg1, int arg2, int arg3) {
		if (arg1.field834 == 0 && arg1.field848 != null && (!arg1.field847 || field1041 == arg1.field832 || field1274 == arg1.field832 || field1299 == arg1.field832)) {
			int var5 = class32.field487;
			int var6 = class32.field485;
			int var7 = class32.field488;
			int var8 = class32.field486;
			class32.method146(arg0, arg2, arg1.field837 + arg0, arg1.field838 + arg2);
			int var9 = arg1.field848.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field849[var10] + arg0;
				int var12 = arg1.field850[var10] + arg2 - arg3;
				class60 var13 = class60.field827[arg1.field848[var10]];
				var11 += var13.field839;
				var12 += var13.field840;

				if (var13.field836 > 0) {
					method450(var13);
				}

				if (var13.field834 == 0) {
					if (var13.field846 > var13.field845 - var13.field838) {
						var13.field846 = var13.field845 - var13.field838;
					}

					if (var13.field846 < 0) {
						var13.field846 = 0;
					}

					method469(var11, var13, var12, var13.field846);

					if (var13.field845 > var13.field838) {
						method404(var13.field837 + var11, var13.field846, var13.field838, var12, var13.field845);
					}
				} else if (var13.field834 != 1) {
					if (var13.field834 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field838; var15++) {
							for (int var16 = 0; var16 < var13.field837; var16++) {
								int var17 = (var13.field856 + 32) * var16 + var11;
								int var18 = (var13.field857 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field859[var14];
									var18 += var13.field860[var14];
								}

								if (var13.field828[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field828[var14] - 1;
									class34 var22 = class55.method291(var21, var13.field829[var14]);
									if (field1164 != 0 && field1163 == var14 && field1162 == var13.field832) {
										var19 = field15 - field1165;
										var20 = field16 - field1166;

										if (var19 < 5 && var19 > -5) {
											var19 = 0;
										}

										if (var20 < 5 && var20 > -5) {
											var20 = 0;
										}

										if (field1066 < 5) {
											var19 = 0;
											var20 = 0;
										}

										var22.method176(var17 + var19, var18 + var20, 128);
									} else if (field1298 != 0 && field1297 == var14 && field1296 == var13.field832) {
										var22.method176(var17, var18, 128);
									} else {
										var22.method172(var17, var18);
									}

									if (var22.field520 == 33 || var13.field829[var14] != 1) {
										int var23 = var13.field829[var14];
										field1170.method190(method470(var23), var17 + var19 + 1, var18 + 10 + var20, 0);
										field1170.method190(method470(var23), var17 + var19, var18 + 9 + var20, 0xFFFF00);
									}
								} else if (var13.field858 != null && var14 < 20) {
									class34 var24 = var13.field858[var14];
									if (var24 != null) {
										var24.method172(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field834 == 3) {
						if (var13.field862) {
							class32.method148(var13.field868, var12, var11, var13.field837, var13.field838);
						} else {
							class32.method149(var13.field837, var13.field868, var12, var11, var13.field838);
						}
					} else if (var13.field834 == 4) {
						class36 var25 = var13.field865;
						int var26 = var13.field868;
						String var27 = var13.field866;

						if ((field1299 == var13.field832 || field1274 == var13.field832 || field1041 == var13.field832) && var13.field870 != 0) {
							var26 = var13.field870;
						}

						if (method474(var13)) {
							var26 = var13.field869;

							if (var13.field867.length() > 0) {
								var27 = var13.field867;
							}
						}

						if (var13.field835 == 6 && field968) {
							var27 = "Please wait...";
							var26 = var13.field868;
						}

						int var28 = var25.field537 + var12;
						while (var27.length() > 0) {
							if (var27.indexOf("%") != -1) {
								while (true) {
									int var29 = var27.indexOf("%1");
									if (var29 == -1) {
										break;
									}

									var27 = var27.substring(0, var29) + method369(method468(var13, 0)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method369(method468(var13, 1)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method369(method468(var13, 2)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method369(method468(var13, 3)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method369(method468(var13, 4)) + var27.substring(var33 + 2);
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

							if (var13.field863) {
								var25.method188(var28, var35, var26, var13.field864, var13.field837 / 2 + var11);
							} else {
								var25.method192(var13.field864, var26, var11, var28, var35);
							}

							var28 += var25.field537;
						}
					} else if (var13.field834 == 5) {
						class34 var36;
						if (method474(var13)) {
							var36 = var13.field872;
						} else {
							var36 = var13.field871;
						}

						if (var36 != null) {
							var36.method172(var11, var12);
						}
					} else if (var13.field834 == 6) {
						int var37 = class33.field497;
						int var38 = class33.field498;
						class33.field497 = var13.field837 / 2 + var11;
						class33.field498 = var13.field838 / 2 + var12;
						int var39 = class33.field501[var13.field878] * var13.field877 >> 16;
						int var40 = class33.field502[var13.field878] * var13.field877 >> 16;
						boolean var41 = method474(var13);
						int var42;
						if (var41) {
							var42 = var13.field876;
						} else {
							var42 = var13.field875;
						}

						class31 var43;
						if (var42 == -1) {
							var43 = var13.method314(-1, -1, var41);
						} else {
							class62 var44 = class62.field893[var42];
							var43 = var13.method314(var44.field895[var13.field830], var44.field896[var13.field830], var41);
						}

						if (var43 != null) {
							var43.method138(0, var13.field879, 0, var13.field878, 0, var39, var40);
						}

						class33.field497 = var37;
						class33.field498 = var38;
					} else if (var13.field834 == 7) {
						class36 var45 = var13.field865;
						int var46 = 0;
						for (int var47 = 0; var47 < var13.field838; var47++) {
							for (int var48 = 0; var48 < var13.field837; var48++) {
								if (var13.field828[var46] > 0) {
									class55 var49 = class55.method286(var13.field828[var46] - 1);
									String var50 = var49.field769;
									if (var49.field780 || var13.field829[var46] != 1) {
										var50 = var50 + " x" + method423(var13.field829[var46]);
									}

									int var51 = (var13.field856 + 115) * var48 + var11;
									int var52 = (var13.field857 + 12) * var47 + var12;
									if (var13.field863) {
										var45.method188(var52, var50, var13.field868, var13.field864, var13.field837 / 2 + var51);
									} else {
										var45.method192(var13.field864, var13.field868, var51, var52, var50);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class32.method146(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method470(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(Lx;BI)V")
	public final void method471(class24 arg0, int arg1) {
		method472(arg1, arg0.field269, arg0.field268);
	}

	@ObfuscatedName("client.a(IIIZ)V")
	public final void method472(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method419(field1180, arg2, arg1) - arg0;
			arg2 -= field943;
			var4 -= field944;
			arg1 -= field945;
			int var5 = class31.field478[field946];
			int var6 = class31.field479[field946];
			int var7 = class31.field478[field947];
			int var8 = class31.field479[field947];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field1280 = (var9 << 9) / arg1 + class33.field497;
				field1281 = (var11 << 9) / arg1 + class33.field498;
			} else {
				field1280 = -1;
				field1281 = -1;
			}
		} else {
			field1280 = -1;
			field1281 = -1;
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method473(int arg0, int arg1) {
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

	public final String getjingle() {
		if (signlink.jingle == null) {
			return "none";
		} else {
			String var1 = signlink.jingle;
			signlink.jingle = null;
			return var1;
		}
	}

	@ObfuscatedName("client.a(Lhc;I)Z")
	public final boolean method474(class60 arg0) {
		if (arg0.field842 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field842.length; var2++) {
			int var3 = method468(arg0, var2);
			int var4 = arg0.field843[var2];
			if (arg0.field842[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field842[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field842[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1251 != null) {
				field1251.method29();
			}
		} catch (Exception var1) {
		}

		field1251 = null;
		method417("null");
		field1034 = null;
		field1289 = null;
		field1196 = null;
		field1239 = null;
		field999 = null;
		field1050 = null;
		field1222 = null;
		field1134 = null;
		field992 = null;
		field984 = null;
		field1264 = null;
		field1238 = null;
		field1260 = null;
		field1261 = null;
		field952 = null;
		field1232 = null;
		field1233 = null;
		field1234 = null;
		field1235 = null;
		field1060 = null;
		field1061 = null;
		field1062 = null;
		field1181 = null;
		field1182 = null;
		field1183 = null;
		field1184 = null;
		field1185 = null;
		field1186 = null;
		field1187 = null;
		field1188 = null;
		field1189 = null;
		field1190 = null;
		field1142 = null;
		field1143 = null;
		field1144 = null;
		field1021 = null;
		field1022 = null;
		field1023 = null;
		field1178 = null;
		field1120 = null;
		field1121 = null;
		field1122 = null;
		field1123 = null;
		field1124 = null;
		field985 = null;
		field986 = null;
		field987 = null;
		field988 = null;
		field989 = null;
		field1301 = null;
		field1008 = null;
		field1300 = null;
		field1263 = null;
		field1246 = null;
		field1247 = null;
		field1248 = null;
		field1249 = null;
		field1043 = null;
		field1304 = null;
		field1053 = null;
		field962 = null;
		field964 = null;
		field966 = null;
		field967 = null;
		field1221 = null;
		field1028 = null;
		field1030 = null;
		field1097 = null;
		field981 = null;
		field1224 = null;
		field1073 = null;
		field1128 = null;
		field951 = null;
		field1316 = null;
		field1317 = null;
		field1318 = null;
		field1319 = null;
		field1125 = null;
		field1018 = null;
		field1139 = null;
		field1140 = null;
		field1045 = null;
		field1242 = null;
		field998 = null;
		field1278 = null;
		field1007 = null;
		field972 = null;
		field973 = null;
		field969 = null;
		field970 = null;
		field971 = null;
		field974 = null;
		field975 = null;
		field976 = null;
		field977 = null;
		method363();
		class53.method273();
		class54.method279();
		class55.method285();
		class58.field809 = null;
		class59.field821 = null;
		class60.field827 = null;
		class61.field886 = null;
		class62.field893 = null;
		class63.field906 = null;
		class63.field918 = null;
		class64.field920 = null;
		field9 = null;
		class26.field341 = null;
		class33.method152();
		class18.method49();
		class31.method119();
		class6.field66 = null;
		class7.field70 = null;
		System.gc();
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

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1039[var1] = var0 / 4;
		}
	}
}
