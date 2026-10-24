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
	public int field966;

	@ObfuscatedName("client.bb")
	public int field967;

	@ObfuscatedName("client.cb")
	public int field968;

	@ObfuscatedName("client.db")
	public int field969;

	@ObfuscatedName("client.eb")
	public int[] field970 = new int[151];

	@ObfuscatedName("client.fb")
	public static int field971;

	@ObfuscatedName("client.hb")
	public int field972;

	@ObfuscatedName("client.ib")
	public class41 field973 = new class41();

	@ObfuscatedName("client.jb")
	public int field974;

	@ObfuscatedName("client.kb")
	public int field975;

	@ObfuscatedName("client.lb")
	public int field976 = 2;

	@ObfuscatedName("client.mb")
	public long field977;

	@ObfuscatedName("client.nb")
	public class34[] field978 = new class34[20];

	@ObfuscatedName("client.ob")
	public String field979;

	@ObfuscatedName("client.pb")
	public int[][][] field980;

	@ObfuscatedName("client.qb")
	public int field981;

	@ObfuscatedName("client.rb")
	public class4 field982;

	@ObfuscatedName("client.sb")
	public class57[] field983 = new class57[4];

	@ObfuscatedName("client.tb")
	public class34 field984;

	@ObfuscatedName("client.ub")
	public class34 field985;

	@ObfuscatedName("client.vb")
	public class34 field986;

	@ObfuscatedName("client.wb")
	public class34 field987;

	@ObfuscatedName("client.xb")
	public static int field988;

	@ObfuscatedName("client.yb")
	public static BigInteger field989 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.zb")
	public int field990;

	@ObfuscatedName("client.ac")
	public int field1010;

	@ObfuscatedName("client.bc")
	public int[] field1011 = new int[33];

	@ObfuscatedName("client.cc")
	public static int field1012;

	@ObfuscatedName("client.dc")
	public class43 field1013;

	@ObfuscatedName("client.ec")
	public class43 field1014;

	@ObfuscatedName("client.fc")
	public class43 field1015;

	@ObfuscatedName("client.gc")
	public class43 field1016;

	@ObfuscatedName("client.hc")
	public class43 field1017;

	@ObfuscatedName("client.ic")
	public class43 field1018;

	@ObfuscatedName("client.jc")
	public class43 field1019;

	@ObfuscatedName("client.kc")
	public class43 field1020;

	@ObfuscatedName("client.lc")
	public class43 field1021;

	@ObfuscatedName("client.mc")
	public class43 field1022;

	@ObfuscatedName("client.B")
	public int field942 = -1;

	@ObfuscatedName("client.C")
	public boolean field943 = false;

	@ObfuscatedName("client.D")
	public int[] field944 = new int[50];

	@ObfuscatedName("client.E")
	public boolean field945 = false;

	@ObfuscatedName("client.I")
	public int field949 = 2;

	@ObfuscatedName("client.M")
	public int[] field953 = new int[5];

	@ObfuscatedName("client.N")
	public int[] field954 = new int[50];

	@ObfuscatedName("client.Q")
	public int[] field957 = new int[5];

	@ObfuscatedName("client.W")
	public class25[] field962 = new class25[8192];

	@ObfuscatedName("client.Y")
	public int[] field964 = new int[8192];

	@ObfuscatedName("client.Ab")
	public int field991 = 2;

	@ObfuscatedName("client.Gb")
	public int[] field993 = new int[50];

	@ObfuscatedName("client.Hb")
	public String field994 = "";

	@ObfuscatedName("client.Jb")
	public int field995 = -1;

	@ObfuscatedName("client.Ob")
	public class41 field999 = new class41();

	@ObfuscatedName("client.Qb")
	public class34[] field1000 = new class34[20];

	@ObfuscatedName("client.Vb")
	public boolean field1005 = true;

	@ObfuscatedName("client.Xb")
	public int field1007 = 128;

	@ObfuscatedName("client.qc")
	public boolean field1026 = false;

	@ObfuscatedName("client.tc")
	public boolean field1029 = false;

	@ObfuscatedName("client.uc")
	public int[] field1030 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.vc")
	public int field1031 = 0x23201B;

	@ObfuscatedName("client.Kc")
	public int field1046 = -1;

	@ObfuscatedName("client.Lc")
	public boolean field1047 = false;

	@ObfuscatedName("client.Mc")
	public boolean field1048 = false;

	@ObfuscatedName("client.Pc")
	public String field1050 = "";

	@ObfuscatedName("client.Qc")
	public boolean field1051 = true;

	@ObfuscatedName("client.Tc")
	public int[] field1053 = new int[50];

	@ObfuscatedName("client.ad")
	public boolean field1059 = false;

	@ObfuscatedName("client.kd")
	public class34[] field1069 = new class34[8];

	@ObfuscatedName("client.ld")
	public class41 field1070 = new class41();

	@ObfuscatedName("client.md")
	public int field1071 = -1;

	@ObfuscatedName("client.nd")
	public boolean field1072 = false;

	@ObfuscatedName("client.pd")
	public final int[] field1074 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.sd")
	public boolean field1077 = false;

	@ObfuscatedName("client.vd")
	public int field1080 = -1;

	@ObfuscatedName("client.wd")
	public int[][] field1081 = new int[104][104];

	@ObfuscatedName("client.Ad")
	public int field1085 = 0x332D25;

	@ObfuscatedName("client.Ld")
	public int[] field1094 = new int[5];

	@ObfuscatedName("client.Qd")
	public boolean field1099 = false;

	@ObfuscatedName("client.Td")
	public class37 field1102 = class37.method196(1);

	@ObfuscatedName("client.Vd")
	public boolean field1104 = false;

	@ObfuscatedName("client.Wd")
	public CRC32 field1105 = new CRC32();

	@ObfuscatedName("client.Xd")
	public int field1106 = -1;

	@ObfuscatedName("client.ae")
	public int[] field1108 = new int[9];

	@ObfuscatedName("client.ce")
	public String field1110 = "";

	@ObfuscatedName("client.de")
	public boolean field1111 = true;

	@ObfuscatedName("client.ge")
	public int[] field1114 = new int[1000];

	@ObfuscatedName("client.he")
	public int[] field1115 = new int[1000];

	@ObfuscatedName("client.me")
	public class34[] field1120 = new class34[1000];

	@ObfuscatedName("client.ne")
	public int field1121 = -1;

	@ObfuscatedName("client.oe")
	public int field1122 = -1;

	@ObfuscatedName("client.pe")
	public boolean field1123 = false;

	@ObfuscatedName("client.qe")
	public boolean field1124 = true;

	@ObfuscatedName("client.se")
	public String[] field1125 = new String[500];

	@ObfuscatedName("client.te")
	public int field1126 = 78;

	@ObfuscatedName("client.ve")
	public String[] field1128 = new String[100];

	@ObfuscatedName("client.we")
	public int[] field1129 = new int[2000];

	@ObfuscatedName("client.ye")
	public int[] field1131 = new int[5];

	@ObfuscatedName("client.ze")
	public int[] field1132 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Ae")
	public boolean field1133 = false;

	@ObfuscatedName("client.Ee")
	public boolean field1136 = false;

	@ObfuscatedName("client.Fe")
	public int[] field1137 = new int[2000];

	@ObfuscatedName("client.Ge")
	public boolean field1138 = false;

	@ObfuscatedName("client.Le")
	public int[][] field1143 = new int[104][104];

	@ObfuscatedName("client.Ne")
	public int[] field1145 = new int[100];

	@ObfuscatedName("client.Oe")
	public String[] field1146 = new String[100];

	@ObfuscatedName("client.Pe")
	public String[] field1147 = new String[100];

	@ObfuscatedName("client.Se")
	public int[] field1149 = new int[256];

	@ObfuscatedName("client.Te")
	public boolean field1150 = false;

	@ObfuscatedName("client.Ue")
	public int field1151 = 2048;

	@ObfuscatedName("client.Ve")
	public int field1152 = 2047;

	@ObfuscatedName("client.We")
	public class26[] field1153 = new class26[field1151];

	@ObfuscatedName("client.Ye")
	public int[] field1155 = new int[field1151];

	@ObfuscatedName("client.af")
	public int[] field1157 = new int[field1151];

	@ObfuscatedName("client.bf")
	public class37[] field1158 = new class37[field1151];

	@ObfuscatedName("client.df")
	public class35[] field1159 = new class35[50];

	@ObfuscatedName("client.ef")
	public int field1160 = -1;

	@ObfuscatedName("client.Bf")
	public boolean field1181 = false;

	@ObfuscatedName("client.Df")
	public long[] field1183 = new long[100];

	@ObfuscatedName("client.Hf")
	public int field1185 = 1;

	@ObfuscatedName("client.Lf")
	public int field1189 = 3;

	@ObfuscatedName("client.Pf")
	public Object field1193 = new Object();

	@ObfuscatedName("client.Qf")
	public int field1194 = -1;

	@ObfuscatedName("client.Tf")
	public int[] field1197 = new int[100];

	@ObfuscatedName("client.Uf")
	public int field1198 = 0x4D4233;

	@ObfuscatedName("client.hg")
	public boolean field1211 = false;

	@ObfuscatedName("client.jg")
	public int[] field1213 = new int[151];

	@ObfuscatedName("client.lg")
	public class37 field1214 = class37.method196(1);

	@ObfuscatedName("client.og")
	public String field1216 = "";

	@ObfuscatedName("client.pg")
	public String field1217 = "";

	@ObfuscatedName("client.sg")
	public int field1220 = 50;

	@ObfuscatedName("client.tg")
	public int[] field1221 = new int[field1220];

	@ObfuscatedName("client.ug")
	public int[] field1222 = new int[field1220];

	@ObfuscatedName("client.vg")
	public int[] field1223 = new int[field1220];

	@ObfuscatedName("client.wg")
	public int[] field1224 = new int[field1220];

	@ObfuscatedName("client.xg")
	public int[] field1225 = new int[field1220];

	@ObfuscatedName("client.yg")
	public int[] field1226 = new int[field1220];

	@ObfuscatedName("client.zg")
	public int[] field1227 = new int[field1220];

	@ObfuscatedName("client.Ag")
	public String[] field1228 = new String[field1220];

	@ObfuscatedName("client.Cg")
	public int[] field1230 = new int[50];

	@ObfuscatedName("client.Eg")
	public class35[] field1232 = new class35[13];

	@ObfuscatedName("client.Kg")
	public int[][] field1238 = new int[104][104];

	@ObfuscatedName("client.Ng")
	public class60 field1241 = new class60();

	@ObfuscatedName("client.Og")
	public class37 field1242 = class37.method196(1);

	@ObfuscatedName("client.Pg")
	public boolean field1243 = false;

	@ObfuscatedName("client.Qg")
	public boolean field1244 = false;

	@ObfuscatedName("client.Rg")
	public class41 field1245 = new class41();

	@ObfuscatedName("client.Wg")
	public boolean[] field1250 = new boolean[5];

	@ObfuscatedName("client.Zg")
	public String field1251 = "";

	@ObfuscatedName("client.eh")
	public int[] field1256 = new int[33];

	@ObfuscatedName("client.ih")
	public int[] field1259 = new int[500];

	@ObfuscatedName("client.jh")
	public int[] field1260 = new int[500];

	@ObfuscatedName("client.kh")
	public int[] field1261 = new int[500];

	@ObfuscatedName("client.lh")
	public int[] field1262 = new int[500];

	@ObfuscatedName("client.nh")
	public int[] field1264 = new int[1000];

	@ObfuscatedName("client.oh")
	public int field1265 = -1;

	@ObfuscatedName("client.yh")
	public int[] field1275 = new int[7];

	@ObfuscatedName("client.Ph")
	public int[] field1291 = new int[5];

	@ObfuscatedName("client.Xh")
	public class41[][][] field1298 = new class41[4][104][104];

	@ObfuscatedName("client.Yh")
	public boolean field1299 = false;

	@ObfuscatedName("client.di")
	public int field1303 = -1;

	@ObfuscatedName("client.ei")
	public long[] field1304 = new long[100];

	@ObfuscatedName("client.gi")
	public byte[] field1305 = new byte[16384];

	@ObfuscatedName("client.ii")
	public class34[] field1306 = new class34[50];

	@ObfuscatedName("client.li")
	public int[] field1309 = new int[50];

	@ObfuscatedName("client.mi")
	public boolean field1310 = false;

	@ObfuscatedName("client.oi")
	public String field1312 = "";

	@ObfuscatedName("client.qi")
	public final int field1313 = 100;

	@ObfuscatedName("client.ri")
	public int[] field1314 = new int[100];

	@ObfuscatedName("client.xi")
	public boolean field1318 = false;

	@ObfuscatedName("client.zi")
	public int field1320 = 0x766654;

	@ObfuscatedName("client.Bi")
	public String field1322 = "";

	@ObfuscatedName("client.Ci")
	public String field1323 = "";

	@ObfuscatedName("client.Ji")
	public int field1330 = 1;

	@ObfuscatedName("client.Ni")
	public int[] field1332 = new int[4000];

	@ObfuscatedName("client.Oi")
	public int[] field1333 = new int[4000];

	@ObfuscatedName("client.Pi")
	public class41 field1334 = new class41();

	@ObfuscatedName("client.gd")
	public static BigInteger field1065 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Sg")
	public static int field1246 = 10;

	@ObfuscatedName("client.Ug")
	public static boolean field1248 = true;

	@ObfuscatedName("client.hh")
	public static final int[][] field1258 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Oh")
	public static int[] field1290 = new int[99];

	@ObfuscatedName("client.Th")
	public static final int[] field1294 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Wh")
	public static String field1297 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ub")
	public static int field1004;

	@ObfuscatedName("client.Yb")
	public int field1008;

	@ObfuscatedName("client.Zb")
	public int field1009;

	@ObfuscatedName("client.rc")
	public int field1027;

	@ObfuscatedName("client.sc")
	public int field1028;

	@ObfuscatedName("client.xc")
	public int field1033;

	@ObfuscatedName("client.yc")
	public int field1034;

	@ObfuscatedName("client.zc")
	public int field1035;

	@ObfuscatedName("client.Oc")
	public int field1049;

	@ObfuscatedName("client.Sc")
	public static int field1052;

	@ObfuscatedName("client.Vc")
	public int field1054;

	@ObfuscatedName("client.Wc")
	public int field1055;

	@ObfuscatedName("client.Xc")
	public int field1056;

	@ObfuscatedName("client.Yc")
	public int field1057;

	@ObfuscatedName("client.Zc")
	public int field1058;

	@ObfuscatedName("client.bd")
	public int field1060;

	@ObfuscatedName("client.cd")
	public int field1061;

	@ObfuscatedName("client.dd")
	public int field1062;

	@ObfuscatedName("client.ed")
	public int field1063;

	@ObfuscatedName("client.fd")
	public int field1064;

	@ObfuscatedName("client.hd")
	public int field1066;

	@ObfuscatedName("client.id")
	public int field1067;

	@ObfuscatedName("client.jd")
	public int field1068;

	@ObfuscatedName("client.qd")
	public int field1075;

	@ObfuscatedName("client.rd")
	public int field1076;

	@ObfuscatedName("client.td")
	public int field1078;

	@ObfuscatedName("client.ud")
	public int field1079;

	@ObfuscatedName("client.xd")
	public int field1082;

	@ObfuscatedName("client.yd")
	public int field1083;

	@ObfuscatedName("client.Dd")
	public int field1086;

	@ObfuscatedName("client.Fd")
	public static int field1088;

	@ObfuscatedName("client.Kd")
	public int field1093;

	@ObfuscatedName("client.Pd")
	public int field1098;

	@ObfuscatedName("client.Sd")
	public int field1101;

	@ObfuscatedName("client.Ud")
	public int field1103;

	@ObfuscatedName("client.Yd")
	public int field1107;

	@ObfuscatedName("client.be")
	public int field1109;

	@ObfuscatedName("client.ee")
	public int field1112;

	@ObfuscatedName("client.fe")
	public int field1113;

	@ObfuscatedName("client.ie")
	public int field1116;

	@ObfuscatedName("client.je")
	public int field1117;

	@ObfuscatedName("client.ke")
	public int field1118;

	@ObfuscatedName("client.le")
	public int field1119;

	@ObfuscatedName("client.ue")
	public int field1127;

	@ObfuscatedName("client.Be")
	public static int field1134;

	@ObfuscatedName("client.Ce")
	public static int field1135;

	@ObfuscatedName("client.He")
	public int field1139;

	@ObfuscatedName("client.Ie")
	public int field1140;

	@ObfuscatedName("client.Me")
	public static int field1144;

	@ObfuscatedName("client.Qe")
	public int field1148;

	@ObfuscatedName("client.Xe")
	public int field1154;

	@ObfuscatedName("client.Ze")
	public int field1156;

	@ObfuscatedName("client.ff")
	public int field1161;

	@ObfuscatedName("client.gf")
	public int field1162;

	@ObfuscatedName("client.hf")
	public int field1163;

	@ObfuscatedName("client.jf")
	public int field1164;

	@ObfuscatedName("client.nf")
	public int field1168;

	@ObfuscatedName("client.of")
	public int field1169;

	@ObfuscatedName("client.pf")
	public int field1170;

	@ObfuscatedName("client.rf")
	public int field1172;

	@ObfuscatedName("client.sf")
	public int field1173;

	@ObfuscatedName("client.tf")
	public int field1174;

	@ObfuscatedName("client.uf")
	public int field1175;

	@ObfuscatedName("client.vf")
	public int field1176;

	@ObfuscatedName("client.wf")
	public int field1177;

	@ObfuscatedName("client.xf")
	public int field1178;

	@ObfuscatedName("client.Cf")
	public int field1182;

	@ObfuscatedName("client.Gf")
	public int field1184;

	@ObfuscatedName("client.If")
	public static int field1186;

	@ObfuscatedName("client.Jf")
	public static int field1187;

	@ObfuscatedName("client.Kf")
	public int field1188;

	@ObfuscatedName("client.Of")
	public int field1192;

	@ObfuscatedName("client.ag")
	public int field1204;

	@ObfuscatedName("client.bg")
	public int field1205;

	@ObfuscatedName("client.cg")
	public int field1206;

	@ObfuscatedName("client.dg")
	public int field1207;

	@ObfuscatedName("client.eg")
	public int field1208;

	@ObfuscatedName("client.fg")
	public int field1209;

	@ObfuscatedName("client.gg")
	public int field1210;

	@ObfuscatedName("client.ig")
	public int field1212;

	@ObfuscatedName("client.ng")
	public int field1215;

	@ObfuscatedName("client.rg")
	public int field1219;

	@ObfuscatedName("client.Bg")
	public static int field1229;

	@ObfuscatedName("client.Dg")
	public int field1231;

	@ObfuscatedName("client.Fg")
	public int field1233;

	@ObfuscatedName("client.Gg")
	public int field1234;

	@ObfuscatedName("client.Hg")
	public int field1235;

	@ObfuscatedName("client.Ig")
	public int field1236;

	@ObfuscatedName("client.Jg")
	public int field1237;

	@ObfuscatedName("client.Lg")
	public int field1239;

	@ObfuscatedName("client.Mg")
	public int field1240;

	@ObfuscatedName("client.Tg")
	public static int field1247;

	@ObfuscatedName("client.ah")
	public int field1252;

	@ObfuscatedName("client.bh")
	public int field1253;

	@ObfuscatedName("client.ch")
	public int field1254;

	@ObfuscatedName("client.gh")
	public int field1257;

	@ObfuscatedName("client.mh")
	public int field1263;

	@ObfuscatedName("client.qh")
	public int field1267;

	@ObfuscatedName("client.rh")
	public int field1268;

	@ObfuscatedName("client.sh")
	public int field1269;

	@ObfuscatedName("client.th")
	public int field1270;

	@ObfuscatedName("client.uh")
	public int field1271;

	@ObfuscatedName("client.vh")
	public int field1272;

	@ObfuscatedName("client.wh")
	public int field1273;

	@ObfuscatedName("client.xh")
	public int field1274;

	@ObfuscatedName("client.zh")
	public int field1276;

	@ObfuscatedName("client.Ah")
	public int field1277;

	@ObfuscatedName("client.Bh")
	public int field1278;

	@ObfuscatedName("client.Ch")
	public int field1279;

	@ObfuscatedName("client.Dh")
	public int field1280;

	@ObfuscatedName("client.Uh")
	public int field1295;

	@ObfuscatedName("client.Vh")
	public int field1296;

	@ObfuscatedName("client.Zh")
	public int field1300;

	@ObfuscatedName("client.ai")
	public int field1301;

	@ObfuscatedName("client.bi")
	public int field1302;

	@ObfuscatedName("client.ji")
	public int field1307;

	@ObfuscatedName("client.ki")
	public int field1308;

	@ObfuscatedName("client.si")
	public int field1315;

	@ObfuscatedName("client.yi")
	public int field1319;

	@ObfuscatedName("client.Di")
	public int field1324;

	@ObfuscatedName("client.Ei")
	public int field1325;

	@ObfuscatedName("client.Fi")
	public int field1326;

	@ObfuscatedName("client.Gi")
	public int field1327;

	@ObfuscatedName("client.Hi")
	public int field1328;

	@ObfuscatedName("client.Ii")
	public int field1329;

	@ObfuscatedName("client.Ki")
	public int field1331;

	@ObfuscatedName("client.F")
	public int field946;

	@ObfuscatedName("client.G")
	public static int field947;

	@ObfuscatedName("client.H")
	public int field948;

	@ObfuscatedName("client.J")
	public static int field950;

	@ObfuscatedName("client.K")
	public static int field951;

	@ObfuscatedName("client.O")
	public int field955;

	@ObfuscatedName("client.P")
	public int field956;

	@ObfuscatedName("client.X")
	public int field963;

	@ObfuscatedName("client.Z")
	public int field965;

	@ObfuscatedName("client.Fb")
	public int field992;

	@ObfuscatedName("client.Kb")
	public int field996;

	@ObfuscatedName("client.Lb")
	public int field997;

	@ObfuscatedName("client.xe")
	public long field1130;

	@ObfuscatedName("client.ph")
	public long field1266;

	@ObfuscatedName("client.Nb")
	public class18 field998;

	@ObfuscatedName("client.qf")
	public class26 field1171;

	@ObfuscatedName("client.zd")
	public class34 field1084;

	@ObfuscatedName("client.Rd")
	public class34 field1100;

	@ObfuscatedName("client.Je")
	public class34 field1141;

	@ObfuscatedName("client.Ke")
	public class34 field1142;

	@ObfuscatedName("client.zf")
	public class34 field1180;

	@ObfuscatedName("client.ui")
	public class34 field1316;

	@ObfuscatedName("client.vi")
	public class34 field1317;

	@ObfuscatedName("client.Rb")
	public class35 field1001;

	@ObfuscatedName("client.Sb")
	public class35 field1002;

	@ObfuscatedName("client.Tb")
	public class35 field1003;

	@ObfuscatedName("client.Mf")
	public class35 field1190;

	@ObfuscatedName("client.Nf")
	public class35 field1191;

	@ObfuscatedName("client.Rf")
	public class35 field1195;

	@ObfuscatedName("client.Sf")
	public class35 field1196;

	@ObfuscatedName("client.Vf")
	public class35 field1199;

	@ObfuscatedName("client.Wf")
	public class35 field1200;

	@ObfuscatedName("client.Xf")
	public class35 field1201;

	@ObfuscatedName("client.Yf")
	public class35 field1202;

	@ObfuscatedName("client.Zf")
	public class35 field1203;

	@ObfuscatedName("client.Gh")
	public class35 field1283;

	@ObfuscatedName("client.Hh")
	public class35 field1284;

	@ObfuscatedName("client.Ih")
	public class35 field1285;

	@ObfuscatedName("client.Jh")
	public class35 field1286;

	@ObfuscatedName("client.Kh")
	public class35 field1287;

	@ObfuscatedName("client.Qi")
	public class35 field1335;

	@ObfuscatedName("client.Ri")
	public class35 field1336;

	@ObfuscatedName("client.Si")
	public class35 field1337;

	@ObfuscatedName("client.Gd")
	public class36 field1089;

	@ObfuscatedName("client.Hd")
	public class36 field1090;

	@ObfuscatedName("client.Id")
	public class36 field1091;

	@ObfuscatedName("client.Jd")
	public class36 field1092;

	@ObfuscatedName("client.nc")
	public class43 field1023;

	@ObfuscatedName("client.oc")
	public class43 field1024;

	@ObfuscatedName("client.pc")
	public class43 field1025;

	@ObfuscatedName("client.Ac")
	public class43 field1036;

	@ObfuscatedName("client.Bc")
	public class43 field1037;

	@ObfuscatedName("client.Cc")
	public class43 field1038;

	@ObfuscatedName("client.Dc")
	public class43 field1039;

	@ObfuscatedName("client.Ec")
	public class43 field1040;

	@ObfuscatedName("client.Fc")
	public class43 field1041;

	@ObfuscatedName("client.Gc")
	public class43 field1042;

	@ObfuscatedName("client.Hc")
	public class43 field1043;

	@ObfuscatedName("client.Ic")
	public class43 field1044;

	@ObfuscatedName("client.Jc")
	public class43 field1045;

	@ObfuscatedName("client.kf")
	public class43 field1165;

	@ObfuscatedName("client.lf")
	public class43 field1166;

	@ObfuscatedName("client.mf")
	public class43 field1167;

	@ObfuscatedName("client.Sh")
	public class46 field1293;

	@ObfuscatedName("client.od")
	public class47 field1073;

	@ObfuscatedName("client.wc")
	public String field1032;

	@ObfuscatedName("client.yf")
	public String field1179;

	@ObfuscatedName("client.dh")
	public String field1255;

	@ObfuscatedName("client.ni")
	public String field1311;

	@ObfuscatedName("client.qg")
	public static boolean field1218;

	@ObfuscatedName("client.Vg")
	public static boolean field1249;

	@ObfuscatedName("client.Md")
	public int[] field1095;

	@ObfuscatedName("client.Nd")
	public int[] field1096;

	@ObfuscatedName("client.Od")
	public int[] field1097;

	@ObfuscatedName("client.Eh")
	public int[] field1281;

	@ObfuscatedName("client.Fh")
	public int[] field1282;

	@ObfuscatedName("client.Mh")
	public int[] field1288;

	@ObfuscatedName("client.Nh")
	public int[] field1289;

	@ObfuscatedName("client.Ai")
	public int[] field1321;

	@ObfuscatedName("client.S")
	public int[] field958;

	@ObfuscatedName("client.T")
	public int[] field959;

	@ObfuscatedName("client.U")
	public int[] field960;

	@ObfuscatedName("client.V")
	public int[] field961;

	@ObfuscatedName("client.L")
	public class35[] field952;

	@ObfuscatedName("client.Wb")
	public byte[][] field1006;

	@ObfuscatedName("client.Qh")
	public byte[][] field1292;

	@ObfuscatedName("client.Ed")
	public byte[][][] field1087;

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method363(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.d(I)V")
	public final void method364() {
		field1318 = false;
		while (field1059) {
			field1318 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1190 = null;
		field1191 = null;
		field952 = null;
		field958 = null;
		field959 = null;
		field960 = null;
		field961 = null;
		field1281 = null;
		field1282 = null;
		field1288 = null;
		field1289 = null;
		field1141 = null;
		field1142 = null;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method365(int arg0) {
		int[] var2 = field1084.field515;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1087[arg0][var7][var5] & 0x18) == 0) {
					field998.method86(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1087[arg0 + 1][var7][var5] & 0x8) != 0) {
					field998.method86(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field1084.method170();

		for (int var8 = 1; var8 < 103; var8++) {
			for (int var9 = 1; var9 < 103; var9++) {
				if ((field1087[arg0][var9][var8] & 0x18) == 0) {
					method396(arg0, var8, var9);
				}

				if (arg0 < 3 && (field1087[arg0 + 1][var9][var8] & 0x8) != 0) {
					method396(arg0 + 1, var8, var9);
				}
			}
		}

		field1015.method235();
		field1113 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = field998.method80(field1315, var10, var11);
				if (var12 != 0) {
					var12 = var12 >> 14 & 0x7FFF;
					int var13 = class53.method275(var12).field721;
					if (var13 >= 0) {
						field1120[field1113] = field1306[var13];
						field1114[field1113] = var10;
						field1115[field1113] = var11;
						field1113++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method366(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method367(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IIIIIZZLhc;I)V")
	public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class60 arg6, int arg7) {
		if (field1026) {
			field1076 = 32;
		} else {
			field1076 = 0;
		}

		field1026 = false;
		if (arg0 >= arg4 && arg0 < arg4 + 16 && arg7 >= arg2 && arg7 < arg2 + 16) {
			arg6.field849 -= field1302 * 4;

			if (arg5) {
				field1104 = true;
				return;
			}
		} else if (arg0 >= arg4 && arg0 < arg4 + 16 && arg7 >= arg2 + arg3 - 16 && arg7 < arg2 + arg3) {
			arg6.field849 += field1302 * 4;

			if (arg5) {
				field1104 = true;
				return;
			}
		} else if (arg0 >= arg4 - field1076 && arg0 < arg4 + field1076 + 16 && arg7 >= arg2 + 16 && arg7 < arg2 + arg3 - 16 && field1302 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg2 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg6.field849 = (arg1 - arg3) * var10 / var11;

			if (arg5) {
				field1104 = true;
			}

			field1026 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method369(int arg0) {
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

	@ObfuscatedName("client.e(I)V")
	public final void method370() {
		if (field1326 == 0) {
			field1125[0] = "Cancel";
			field1261[0] = 1333;
			field997 = 1;
			method406(field15, field16);
			field1274 = 0;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field1265 == -1) {
					method416();
				} else {
					method460(8, class60.field830[field1265], field16, field15, 0, 11);
				}
			}

			if (field1274 != field1066) {
				field1066 = field1274;
			}

			field1274 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field1194 != -1) {
					method460(562, class60.field830[field1194], field16, field15, 0, 231);
				} else if (field1132[field1189] != -1) {
					method460(562, class60.field830[field1132[field1189]], field16, field15, 0, 231);
				}
			}

			if (field1274 != field1101) {
				field1104 = true;
				field1101 = field1274;
			}

			field1274 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 431 && field16 < 471) {
				if (field942 == -1) {
					method423(field16 - 375, field15 - 22);
				} else {
					method460(22, class60.field830[field942], field16, field15, 0, 375);
				}
			}

			if (field942 != -1 && field1274 != field1112) {
				field1181 = true;
				field1112 = field1274;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field997 - 1; var2++) {
					if (field1261[var2] < 1000 && field1261[var2 + 1] > 1000) {
						String var3 = field1125[var2];
						field1125[var2] = field1125[var2 + 1];
						field1125[var2 + 1] = var3;
						int var4 = field1261[var2];
						field1261[var2] = field1261[var2 + 1];
						field1261[var2 + 1] = var4;
						int var5 = field1259[var2];
						field1259[var2] = field1259[var2 + 1];
						field1259[var2 + 1] = var5;
						int var6 = field1260[var2];
						field1260[var2] = field1260[var2 + 1];
						field1260[var2 + 1] = var6;
						int var7 = field1262[var2];
						field1262[var2] = field1262[var2 + 1];
						field1262[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method371() {
		field1013.method235();
		class33.field503 = field1096;
		field1001.method186(0, 0);

		if (field1194 != -1) {
			method459(class60.field830[field1194], 0, 0, 0);
		} else if (field1132[field1189] != -1) {
			method459(class60.field830[field1132[field1189]], 0, 0, 0);
		}

		if (field943 && field1276 == 1) {
			method456();
		}

		field1013.method236(231, field8, 562);
		field1015.method235();
		class33.field503 = field1097;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method372(int arg0) {
		int var2 = class64.field923[arg0].field931;
		if (var2 != 0) {
			int var3 = field1137[arg0];
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

				class55.field802.method104();
				field1099 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1005;

				if (var3 == 0) {
					method425(0, field1005);
					field1005 = true;
				}

				if (var3 == 1) {
					method425(-400, field1005);
					field1005 = true;
				}

				if (var3 == 2) {
					method425(-800, field1005);
					field1005 = true;
				}

				if (var3 == 3) {
					method425(-1200, field1005);
					field1005 = true;
				}

				if (var3 == 4) {
					field1005 = false;
				}

				if (field1005 != var4) {
					if (field1005) {
						method471(field1331, field1311, field1054);
					} else {
						method426();
					}

					field1078 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1051 = true;
					method386(0);
				}

				if (var3 == 1) {
					field1051 = true;
					method386(-400);
				}

				if (var3 == 2) {
					field1051 = true;
					method386(-800);
				}

				if (var3 == 3) {
					field1051 = true;
					method386(-1200);
				}

				if (var3 == 4) {
					field1051 = false;
				}
			}

			if (var2 == 5) {
				field996 = var3;
			}

			if (var2 == 6) {
				field1067 = var3;
			}

			if (var2 == 8) {
				field1079 = var3;
				field1181 = true;
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method373() {
		if (field1016 == null) {
			method364();
			field9 = null;
			field1017 = null;
			field1018 = null;
			field1019 = null;
			field1020 = null;
			field1021 = null;
			field1022 = null;
			field1023 = null;
			field1024 = null;
			field1025 = null;
			field1016 = new class43(96, method11(), 479);
			field1014 = new class43(160, method11(), 168);
			class32.method148();
			field1002.method186(0, 0);
			field1013 = new class43(261, method11(), 190);
			field1015 = new class43(334, method11(), 512);
			class32.method148();
			field1165 = new class43(61, method11(), 501);
			field1166 = new class43(40, method11(), 288);
			field1167 = new class43(66, method11(), 269);
			field1099 = true;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method374(long arg0) {
		if (arg0 != 0L) {
			if (field1300 >= 100) {
				method431("Your friends list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field1300; var4++) {
					if (field1183[var4] == arg0) {
						method431(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1209; var5++) {
					if (field1304[var5] == arg0) {
						method431("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field1171.field321)) {
					field1128[field1300] = var3;
					field1183[field1300] = arg0;
					field1197[field1300] = 0;
					field1300++;
					field1104 = true;
					field1214.method198(66);
					field1214.method205(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILhc;)Z")
	public final boolean method375(class60 arg0) {
		if (arg0.field845 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field845.length; var2++) {
			int var3 = method485(var2, arg0);
			int var4 = arg0.field846[var2];
			if (arg0.field845[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field845[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field845[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method376(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ILx;B)V")
	public final void method377(int arg0, class24 arg1) {
		method378(arg1.field269, arg1.field268, arg0);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method378(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method488(field1315, arg0, arg1) - arg2;
			arg1 -= field1204;
			var4 -= field1205;
			arg0 -= field1206;
			int var5 = class31.field478[field1207];
			int var6 = class31.field479[field1207];
			int var7 = class31.field478[field1208];
			int var8 = class31.field479[field1208];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1121 = (var9 << 9) / arg0 + class33.field497;
				field1122 = (var11 << 9) / arg0 + class33.field498;
			} else {
				field1121 = -1;
				field1122 = -1;
			}
		} else {
			field1121 = -1;
			field1122 = -1;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method379() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field981 = (field981 + 1) % 3;
				field1077 = true;
				field1181 = true;
				field1214.method198(197);
				field1214.method199(field981);
				field1214.method199(field1035);
				field1214.method199(field1192);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field1035 = (field1035 + 1) % 3;
				field1077 = true;
				field1181 = true;
				field1214.method198(197);
				field1214.method199(field981);
				field1214.method199(field1035);
				field1214.method199(field1192);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field1192 = (field1192 + 1) % 3;
				field1077 = true;
				field1181 = true;
				field1214.method198(197);
				field1214.method199(field981);
				field1214.method199(field1035);
				field1214.method199(field1192);
			}

			if (field18 >= 416 && field18 <= 516 && field19 >= 490 && field19 <= 522) {
				method472();
				field1110 = "";
				field1047 = false;

				for (int var1 = 0; var1 < class60.field830.length; var1++) {
					if (class60.field830[var1] != null && class60.field830[var1].field839 == 600) {
						field1080 = field1265 = class60.field830[var1].field836;
						break;
					}
				}
			}

			field1004++;
			if (field1004 > 195) {
				field1004 = 0;
				field1214.method198(24);
				field1214.method199(239);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method380(long arg0) {
		if (arg0 != 0L) {
			if (field1209 >= 100) {
				method431("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field1209; var4++) {
					if (field1304[var4] == arg0) {
						method431(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1300; var5++) {
					if (field1183[var5] == arg0) {
						method431("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field1304[field1209++] = arg0;
				field1104 = true;
				field1214.method198(175);
				field1214.method205(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIIIIII)Z")
	public final boolean method381(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1238[var14][var15] = 0;
				field1143[var14][var15] = 99999999;
			}
		}

		int var16 = arg9;
		int var17 = arg2;
		field1238[arg9][arg2] = 99;
		field1143[arg9][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1332[var18] = arg9;
		int var35 = var18 + 1;
		field1333[var18] = arg2;
		boolean var20 = false;
		int var21 = field1332.length;
		int[][] var22 = field983[field1315].field809;
		while (var35 != var19) {
			var16 = field1332[var19];
			var17 = field1333[var19];
			var19 = (var19 + 1) % var21;

			if (arg4 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field983[field1315].method304(arg4, arg8, var17, arg10, arg7 - 1, var16)) {
					var20 = true;
					break;
				}

				if (arg7 < 10 && field983[field1315].method305(arg4, var17, arg7 - 1, arg10, var16, arg8)) {
					var20 = true;
					break;
				}
			}

			if (arg1 != 0 && arg3 != 0 && field983[field1315].method306(var17, arg4, arg5, arg1, arg10, var16, arg3)) {
				var20 = true;
				break;
			}

			int var23 = field1143[var16][var17] + 1;
			if (var16 > 0 && field1238[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1332[var35] = var16 - 1;
				field1333[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1238[var16 - 1][var17] = 2;
				field1143[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1238[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1332[var35] = var16 + 1;
				field1333[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1238[var16 + 1][var17] = 8;
				field1143[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1238[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1332[var35] = var16;
				field1333[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1238[var16][var17 - 1] = 1;
				field1143[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1238[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1332[var35] = var16;
				field1333[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1238[var16][var17 + 1] = 4;
				field1143[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1238[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1332[var35] = var16 - 1;
				field1333[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1238[var16 - 1][var17 - 1] = 3;
				field1143[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1238[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1332[var35] = var16 + 1;
				field1333[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1238[var16 + 1][var17 - 1] = 9;
				field1143[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1238[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1332[var35] = var16 - 1;
				field1333[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1238[var16 - 1][var17 + 1] = 6;
				field1143[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1238[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1332[var35] = var16 + 1;
				field1333[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1238[var16 + 1][var17 + 1] = 12;
				field1143[var16 + 1][var17 + 1] = var23;
			}
		}

		field1212 = 0;
		if (!var20) {
			if (arg0) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg4 - var25; var26 <= arg4 + var25; var26++) {
						for (int var27 = arg10 - var25; var27 <= arg10 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1143[var26][var27] < var24) {
								var24 = field1143[var26][var27];
								var16 = var26;
								var17 = var27;
								field1212 = 1;
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
		field1332[var28] = var16;
		int var36 = var28 + 1;
		field1333[var28] = var17;
		int var29;
		int var30 = var29 = field1238[var16][var17];
		while (arg9 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1332[var36] = var16;
				field1333[var36++] = var17;
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

			var30 = field1238[var16][var17];
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
		int var32 = field1332[var36];
		int var33 = field1333[var36];
		field1052 += var31;
		if (field1052 >= 121) {
			field1214.method198(215);
			field1214.method200(19217);
		}

		if (arg6 == 0) {
			field1214.method198(74);
			field1214.method199(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field1214.method198(37);
			field1214.method199(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field1214.method198(73);
			field1214.method199(var31 + var31 + 3);
		}

		if (field20[5] == 1) {
			field1214.method199(1);
		} else {
			field1214.method199(0);
		}

		field1214.method200(field1161 + var32);
		field1214.method200(field1162 + var33);
		field1082 = field1332[0];
		field1083 = field1333[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1214.method199(field1332[var36] - var32);
			field1214.method199(field1333[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method382() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231 && field1132[0] != -1) {
				field1104 = true;
				field1189 = 0;
				field1211 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231 && field1132[1] != -1) {
				field1104 = true;
				field1189 = 1;
				field1211 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231 && field1132[2] != -1) {
				field1104 = true;
				field1189 = 2;
				field1211 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229 && field1132[3] != -1) {
				field1104 = true;
				field1189 = 3;
				field1211 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231 && field1132[4] != -1) {
				field1104 = true;
				field1189 = 4;
				field1211 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231 && field1132[5] != -1) {
				field1104 = true;
				field1189 = 5;
				field1211 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231 && field1132[6] != -1) {
				field1104 = true;
				field1189 = 6;
				field1211 = true;
			}

			if (field18 >= 550 && field18 <= 584 && field19 >= 492 && field19 < 528 && field1132[7] != -1) {
				field1104 = true;
				field1189 = 7;
				field1211 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529 && field1132[8] != -1) {
				field1104 = true;
				field1189 = 8;
				field1211 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529 && field1132[9] != -1) {
				field1104 = true;
				field1189 = 9;
				field1211 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528 && field1132[10] != -1) {
				field1104 = true;
				field1189 = 10;
				field1211 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529 && field1132[11] != -1) {
				field1104 = true;
				field1189 = 11;
				field1211 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529 && field1132[12] != -1) {
				field1104 = true;
				field1189 = 12;
				field1211 = true;
			}

			if (field18 >= 734 && field18 <= 768 && field19 >= 492 && field19 < 528 && field1132[13] != -1) {
				field1104 = true;
				field1189 = 13;
				field1211 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;I)Z")
	public final boolean method383(class60 arg0) {
		int var2 = arg0.field839;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1125[field997] = "Remove @whi@" + field1128[var2];
			field1261[field997] = 804;
			field997++;
			field1125[field997] = "Message @whi@" + field1128[var2];
			field1261[field997] = 125;
			field997++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1125[field997] = "Remove @whi@" + arg0.field869;
			field1261[field997] = 521;
			field997++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method384(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.h(I)Z")
	public final boolean method385() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.d(II)V")
	public final void method386(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method387() {
		for (class40 var1 = (class40) field973.method228(); var1 != null; var1 = (class40) field973.method230()) {
			boolean var2 = false;
			var1.field577 += field1103;

			if (var1.field576 == -1) {
				var1.field576 = 0;
				var2 = true;
			}

			while (var1.field577 > var1.field575.field900[var1.field576]) {
				var1.field577 -= var1.field575.field900[var1.field576] + 1;
				var1.field576++;
				var2 = true;

				if (var1.field576 >= var1.field575.field897) {
					var1.field576 -= var1.field575.field901;
					if (var1.field576 < 0 || var1.field576 >= var1.field575.field897) {
						break;
					}
				}
			}

			var1.method107();
			var2 = false;
			if (var2) {
				int var3 = var1.field570;
				int var4 = var1.field572;
				int var5 = var1.field573;
				int var6 = 0;
				if (var1.field571 == 0) {
					var6 = field998.method77(var3, var4, var5);
				}

				if (var1.field571 == 1) {
					var6 = field998.method78(var4, var5, var3);
				}

				if (var1.field571 == 2) {
					var6 = field998.method79(var3, var4, var5);
				}

				if (var1.field571 == 3) {
					var6 = field998.method80(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field574) {
					int var7 = field980[var3][var4][var5];
					int var8 = field980[var3][var4 + 1][var5];
					int var9 = field980[var3][var4 + 1][var5 + 1];
					int var10 = field980[var3][var4][var5 + 1];
					class53 var11 = class53.method275(var1.field574);
					int var12 = -1;
					if (var1.field576 != -1) {
						var12 = var1.field575.field898[var1.field576];
					}

					if (var1.field571 == 2) {
						int var13 = field998.method81(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						class31 var16 = var11.method278(var14, var15, var7, var8, var9, var10, var12);
						field998.method66(var16, var4, var3, var5);
					} else if (var1.field571 == 1) {
						class31 var17 = var11.method278(4, 0, var7, var8, var9, var10, var12);
						field998.method68(var3, var17, var4, var5);
					} else if (var1.field571 == 0) {
						int var18 = field998.method81(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							class31 var22 = var11.method278(2, var20 + 4, var7, var8, var9, var10, var12);
							class31 var23 = var11.method278(2, var21, var7, var8, var9, var10, var12);
							field998.method71(var22, var23, var4, var5, var3);
						} else {
							class31 var24 = var11.method278(var19, var20, var7, var8, var9, var10, var12);
							field998.method70(var3, var5, var24, var4);
						}
					} else if (var1.field571 == 3) {
						int var25 = field998.method81(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						class31 var27 = var11.method278(22, var26, var7, var8, var9, var10, var12);
						field998.method69(var5, var27, var3, var4);
					}
				} else {
					var1.method107();
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

	@ObfuscatedName("client.j(I)Ljava/net/Socket;")
	public final Socket method388(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(ILhc;)V")
	public final void method389(class60 arg0) {
		int var2 = arg0.field839;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1300) {
				arg0.field869 = "";
				arg0.field838 = 0;
			} else {
				arg0.field869 = field1128[var2];
				arg0.field838 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1300) {
				arg0.field869 = "";
				arg0.field838 = 0;
			} else {
				if (field1197[var2] == 0) {
					arg0.field869 = "@red@Offline";
				} else if (field1197[var2] == field1246) {
					arg0.field869 = "@gre@World-" + (field1197[var2] - 9);
				} else {
					arg0.field869 = "@yel@World-" + (field1197[var2] - 9);
				}

				arg0.field838 = 1;
			}
		} else if (var2 == 203) {
			arg0.field848 = field1300 * 15 + 20;
			if (arg0.field848 <= arg0.field841) {
				arg0.field848 = arg0.field841 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1209) {
				arg0.field869 = "";
				arg0.field838 = 0;
			} else {
				arg0.field869 = class48.method255(class48.method252(field1304[var2]));
				arg0.field838 = 1;
			}
		} else if (var2 == 503) {
			arg0.field848 = field1209 * 15 + 20;
			if (arg0.field848 <= arg0.field841) {
				arg0.field848 = arg0.field841 + 1;
			}
		} else if (var2 == 327) {
			arg0.field881 = 150;
			arg0.field882 = (int) (Math.sin(field1134 / 40.0D) * 256.0D) & 0x7FF;

			if (field1123) {
				field1123 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1275[var5];
					if (var6 >= 0) {
						var3[var4++] = class59.field823[var6].method312();
					}
				}

				class31 var7 = new class31(var4, var3);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field1094[var8] != 0) {
						var7.method133(field1258[var8][0], field1258[var8][field1094[var8]]);

						if (var8 == 1) {
							var7.method133(field1294[0], field1294[field1094[var8]]);
						}
					}
				}

				var7.method126();
				var7.method127(class62.field896[field1171.field273].field898[0]);
				var7.method136(64, 850, -30, -50, -30, true);
				arg0.field876 = var7;
			}
		} else if (var2 == 324) {
			if (field1316 == null) {
				field1316 = arg0.field874;
				field1317 = arg0.field875;
			}

			if (field1124) {
				arg0.field874 = field1317;
			} else {
				arg0.field874 = field1316;
			}
		} else if (var2 == 325) {
			if (field1316 == null) {
				field1316 = arg0.field874;
				field1317 = arg0.field875;
			}

			if (field1124) {
				arg0.field874 = field1316;
			} else {
				arg0.field874 = field1317;
			}
		} else if (var2 == 600) {
			arg0.field869 = field1110;
			if (field1134 % 20 < 10) {
				arg0.field869 = arg0.field869 + "|";
			} else {
				arg0.field869 = arg0.field869 + " ";
			}
		} else if (var2 == 613) {
			if (!field945) {
				arg0.field869 = "";
			} else if (field1047) {
				arg0.field871 = 0xFF0000;
				arg0.field869 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field871 = 0xFFFFFF;
				arg0.field869 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field972 == 0) {
				arg0.field869 = "";
			} else {
				String var9;
				if (field1319 == 0) {
					var9 = "earlier today";
				} else if (field1319 == 1) {
					var9 = "yesterday";
				} else {
					var9 = field1319 + " days ago";
				}

				arg0.field869 = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1140 == 0) {
				arg0.field869 = "0 unread messages";
				arg0.field871 = 0xFFFF00;
			}

			if (field1140 == 1) {
				arg0.field869 = "1 unread message";
				arg0.field871 = 0xFF00;
			}

			if (field1140 > 1) {
				arg0.field869 = field1140 + " unread messages";
				arg0.field871 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1086 == 201) {
				arg0.field869 = "";
			} else if (field1086 == 200) {
				arg0.field869 = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (field1086 == 0) {
					var10 = "Earlier today";
				} else if (field1086 == 1) {
					var10 = "Yesterday";
				} else {
					var10 = field1086 + " days ago";
				}

				arg0.field869 = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1086 == 201) {
				arg0.field869 = "";
			} else if (field1086 == 200) {
				arg0.field869 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field869 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1086 == 201) {
				arg0.field869 = "";
			} else if (field1086 == 200) {
				arg0.field869 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field869 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method390() {
		class53.field733.method104();
		class53.field734.method104();
		class54.field762.method104();
		class55.field801.method104();
		class55.field802.method104();
		class26.field341.method104();
		class63.field921.method104();
	}

	@ObfuscatedName("client.l(I)V")
	public final void method391() {
		if (field1017 == null) {
			field9 = null;
			field1016 = null;
			field1014 = null;
			field1013 = null;
			field1015 = null;
			field1165 = null;
			field1166 = null;
			field1167 = null;
			field1020 = new class43(265, method11(), 128);
			class32.method148();
			field1021 = new class43(265, method11(), 128);
			class32.method148();
			field1017 = new class43(186, method11(), 533);
			class32.method148();
			field1018 = new class43(146, method11(), 360);
			class32.method148();
			field1019 = new class43(200, method11(), 360);
			class32.method148();
			field1022 = new class43(267, method11(), 214);
			class32.method148();
			field1023 = new class43(267, method11(), 215);
			class32.method148();
			field1024 = new class43(79, method11(), 86);
			class32.method148();
			field1025 = new class43(79, method11(), 87);
			class32.method148();

			if (field1073 != null) {
				method412();
				method407();
			}

			field1099 = true;
		}
	}

	@ObfuscatedName("client.a(Lkb;BI)V")
	public final void method392(class37 arg0, int arg1) {
		arg0.method219();
		int var3 = arg0.method220(1);
		if (var3 != 0) {
			int var4 = arg0.method220(2);
			if (var4 == 0) {
				field1157[field1156++] = field1152;
			} else if (var4 == 1) {
				int var5 = arg0.method220(3);
				field1171.method110(false, var5);
				int var6 = arg0.method220(1);
				if (var6 == 1) {
					field1157[field1156++] = field1152;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method220(3);
				field1171.method110(true, var7);
				int var8 = arg0.method220(3);
				field1171.method110(true, var8);
				int var9 = arg0.method220(1);
				if (var9 == 1) {
					field1157[field1156++] = field1152;
				}
			} else if (var4 == 3) {
				field1315 = arg0.method220(2);
				int var10 = arg0.method220(7);
				int var11 = arg0.method220(7);
				int var12 = arg0.method220(1);
				field1171.method109(var10, var12 == 1, var11);
				int var13 = arg0.method220(1);
				if (var13 == 1) {
					field1157[field1156++] = field1152;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method393() {
		if (field997 >= 2 || field1175 != 0 || field1252 != 0) {
			String var1;
			if (field1175 == 1 && field997 < 2) {
				var1 = "Use " + field1179 + " with...";
			} else if (field1252 == 1 && field997 < 2) {
				var1 = field1255 + "...";
			} else {
				var1 = field1125[field997 - 1];
			}

			if (field997 > 2) {
				var1 = var1 + "@whi@ / " + (field997 - 2) + " more options";
			}

			field1091.method193(0xFFFFFF, 15, true, var1, 4);
		}
	}

	@ObfuscatedName("client.a(Lkb;IB)V")
	public final void method394(class37 arg0, int arg1) {
		if (arg1 == 220 || arg1 == 214) {
			int var3 = arg0.method209();
			int var4 = (var3 >> 4 & 0x7) + field1295;
			int var5 = (var3 & 0x7) + field1296;
			int var6 = arg0.method209();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1074[var7];
			int var10;
			if (arg1 == 214) {
				var10 = -1;
			} else {
				var10 = arg0.method211();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field1245.method228(); var12 != null; var12 = (class38) field1245.method230()) {
					if (field1315 == var12.field552 && var12.field554 == var4 && var12.field555 == var5 && var12.field553 == var9) {
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
						var13 = field998.method77(field1315, var4, var5);
					}

					if (var9 == 1) {
						var13 = field998.method78(var4, var5, field1315);
					}

					if (var9 == 2) {
						var13 = field998.method79(field1315, var4, var5);
					}

					if (var9 == 3) {
						var13 = field998.method80(field1315, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field998.method81(field1315, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field552 = field1315;
					var11.field553 = var9;
					var11.field554 = var4;
					var11.field555 = var5;
					var11.field559 = var14;
					var11.field561 = var15;
					var11.field560 = var16;
					field1245.method225(var11);
				}

				var11.field556 = var10;
				var11.field558 = var7;
				var11.field557 = var8;
				method429(var7, field1315, var9, var10, var8, var4, var5);
			}
		} else if (arg1 == 78) {
			int var18 = arg0.method209();
			int var19 = (var18 >> 4 & 0x7) + field1295;
			int var20 = (var18 & 0x7) + field1296;
			int var21 = arg0.method209();
			int var22 = var21 >> 2;
			int var23 = field1074[var22];
			int var24 = arg0.method211();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = field998.method77(field1315, var19, var20);
				}

				if (var23 == 1) {
					var25 = field998.method78(var19, var20, field1315);
				}

				if (var23 == 2) {
					var25 = field998.method79(field1315, var19, var20);
				}

				if (var23 == 3) {
					var25 = field998.method80(field1315, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(var19, var20, false, var25 >> 14 & 0x7FFF, field1315, var23, class62.field896[var24]);
					field973.method225(var26);
				}
			}
		} else if (arg1 == 246) {
			int var27 = arg0.method209();
			int var28 = (var27 >> 4 & 0x7) + field1295;
			int var29 = (var27 & 0x7) + field1296;
			int var30 = arg0.method211();
			int var31 = arg0.method211();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var32 = new class22();
				var32.field266 = var30;
				var32.field267 = var31;

				if (field1298[field1315][var28][var29] == null) {
					field1298[field1315][var28][var29] = new class41();
				}

				field1298[field1315][var28][var29].method225(var32);
				method422(var28, var29);
			}
		} else if (arg1 == 61) {
			int var33 = arg0.method209();
			int var34 = (var33 >> 4 & 0x7) + field1295;
			int var35 = (var33 & 0x7) + field1296;
			int var36 = arg0.method211();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				class41 var37 = field1298[field1315][var34][var35];
				if (var37 != null) {
					for (class22 var38 = (class22) var37.method228(); var38 != null; var38 = (class22) var37.method230()) {
						if ((var36 & 0x7FFF) == var38.field266) {
							var38.method107();
							break;
						}
					}

					if (var37.method228() == null) {
						field1298[field1315][var34][var35] = null;
					}

					method422(var34, var35);
				}
			}
		} else if (arg1 == 1) {
			int var39 = arg0.method209();
			int var40 = (var39 >> 4 & 0x7) + field1295;
			int var41 = (var39 & 0x7) + field1296;
			int var42 = var40 + arg0.method210();
			int var43 = var41 + arg0.method210();
			int var44 = arg0.method212();
			int var45 = arg0.method211();
			int var46 = arg0.method209();
			int var47 = arg0.method209();
			int var48 = arg0.method211();
			int var49 = arg0.method211();
			int var50 = arg0.method209();
			int var51 = arg0.method209();
			if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				class27 var52 = new class27(field1134 + var48, field1134 + var49, var45, var51, var41, var50, var47, var40, method488(field1315, var41, var40) - var46, var44, field1315);
				var52.method116(method488(field1315, var43, var42) - var47, field1134 + var48, var42, var43);
				field1070.method225(var52);
			}
		} else if (arg1 == 195) {
			int var53 = arg0.method209();
			int var54 = (var53 >> 4 & 0x7) + field1295;
			int var55 = (var53 & 0x7) + field1296;
			int var56 = arg0.method211();
			int var57 = arg0.method209();
			int var58 = arg0.method211();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				class28 var59 = new class28(method488(field1315, var55, var54) - var57, var55, field1315, var58, var56, field1134, var54);
				field1334.method225(var59);
			}
		} else if (arg1 == 127) {
			int var60 = arg0.method209();
			int var61 = (var60 >> 4 & 0x7) + field1295;
			int var62 = (var60 & 0x7) + field1296;
			int var63 = arg0.method211();
			int var64 = arg0.method211();
			int var65 = arg0.method211();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && field995 != var65) {
				class22 var66 = new class22();
				var66.field266 = var63;
				var66.field267 = var64;

				if (field1298[field1315][var61][var62] == null) {
					field1298[field1315][var61][var62] = new class41();
				}

				field1298[field1315][var61][var62].method225(var66);
				method422(var61, var62);
			}
		} else if (arg1 == 25) {
			int var67 = arg0.method209();
			int var68 = (var67 >> 4 & 0x7) + field1295;
			int var69 = (var67 & 0x7) + field1296;
			int var70 = arg0.method209();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = field1074[var71];
			int var74 = arg0.method211();
			int var75 = arg0.method211();
			int var76 = arg0.method211();
			int var77 = arg0.method211();
			byte var78 = arg0.method210();
			byte var79 = arg0.method210();
			byte var80 = arg0.method210();
			byte var81 = arg0.method210();
			class26 var82;
			if (field995 == var77) {
				var82 = field1171;
			} else {
				var82 = field1153[var77];
			}

			if (var82 != null) {
				class39 var83 = new class39(-1, var71, field1134 + var75, var73, var72, var69, var68, field1315);
				field999.method225(var83);
				class39 var84 = new class39(var74, var71, field1134 + var76, var73, var72, var69, var68, field1315);
				field999.method225(var84);
				int var85 = field980[field1315][var68][var69];
				int var86 = field980[field1315][var68 + 1][var69];
				int var87 = field980[field1315][var68 + 1][var69 + 1];
				int var88 = field980[field1315][var68][var69 + 1];
				class53 var89 = class53.method275(var74);
				var82.field330 = field1134 + var75;
				var82.field331 = field1134 + var76;
				var82.field335 = var89.method278(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.field707;
				int var91 = var89.field708;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.field708;
					var91 = var89.field707;
				}

				var82.field332 = var68 * 128 + var90 * 64;
				var82.field334 = var69 * 128 + var91 * 64;
				var82.field333 = method488(field1315, var82.field334, var82.field332);

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
		} else if (arg1 == 117) {
			int var94 = arg0.method209();
			int var95 = (var94 >> 4 & 0x7) + field1295;
			int var96 = (var94 & 0x7) + field1296;
			int var97 = arg0.method211();
			int var98 = arg0.method211();
			int var99 = arg0.method211();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1298[field1315][var95][var96];
				if (var100 != null) {
					for (class22 var101 = (class22) var100.method228(); var101 != null; var101 = (class22) var100.method230()) {
						if ((var97 & 0x7FFF) == var101.field266 && var101.field267 == var98) {
							var101.field267 = var99;
							break;
						}
					}

					method422(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method395() {
		int var1 = field1233 * 128 + 64;
		int var2 = field1234 * 128 + 64;
		int var3 = method488(field1315, field1234, field1233) - field1235;

		if (field1204 < var1) {
			field1204 += (var1 - field1204) * field1237 / 1000 + field1236;
			if (field1204 > var1) {
				field1204 = var1;
			}
		}

		if (field1204 > var1) {
			field1204 -= (field1204 - var1) * field1237 / 1000 + field1236;
			if (field1204 < var1) {
				field1204 = var1;
			}
		}

		if (field1205 < var3) {
			field1205 += (var3 - field1205) * field1237 / 1000 + field1236;
			if (field1205 > var3) {
				field1205 = var3;
			}
		}

		if (field1205 > var3) {
			field1205 -= (field1205 - var3) * field1237 / 1000 + field1236;
			if (field1205 < var3) {
				field1205 = var3;
			}
		}

		if (field1206 < var2) {
			field1206 += (var2 - field1206) * field1237 / 1000 + field1236;
			if (field1206 > var2) {
				field1206 = var2;
			}
		}

		if (field1206 > var2) {
			field1206 -= (field1206 - var2) * field1237 / 1000 + field1236;
			if (field1206 < var2) {
				field1206 = var2;
			}
		}

		int var4 = field965 * 128 + 64;
		int var5 = field966 * 128 + 64;
		int var6 = method488(field1315, field966, field965) - field967;
		int var7 = var4 - field1204;
		int var8 = var6 - field1205;
		int var9 = var5 - field1206;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1207 < var11) {
			field1207 += (var11 - field1207) * field969 / 1000 + field968;
			if (field1207 > var11) {
				field1207 = var11;
			}
		}

		if (field1207 > var11) {
			field1207 -= (field1207 - var11) * field969 / 1000 + field968;
			if (field1207 < var11) {
				field1207 = var11;
			}
		}

		int var13 = var12 - field1208;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1208 += field969 * var13 / 1000 + field968;
			field1208 &= 0x7FF;
		}

		if (var13 < 0) {
			field1208 -= -var13 * field969 / 1000 + field968;
			field1208 &= 0x7FF;
		}

		int var14 = var12 - field1208;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1208 = var12;
		}
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method396(int arg0, int arg1, int arg2) {
		int var4 = field998.method77(arg0, arg2, arg1);
		if (var4 != 0) {
			int var5 = field998.method81(arg0, arg2, arg1, var4);
			int var6 = var5 >> 6 & 0x3;
			int var7 = var5 & 0x1F;
			int var8 = 0xEEEEEE;
			if (var4 > 0) {
				var8 = 0xEE0000;
			}

			int[] var9 = field1084.field515;
			int var10 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
			int var11 = var4 >> 14 & 0x7FFF;
			class53 var12 = class53.method275(var11);
			if (var12.field722 == -1) {
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
				class35 var13 = field1159[var12.field722];
				if (var13 != null) {
					int var14 = (var12.field707 * 4 - var13.field524) / 2;
					int var15 = (var12.field708 * 4 - var13.field525) / 2;
					var13.method186((104 - arg1 - var12.field708) * 4 + var15 + 48, arg2 * 4 + 48 + var14);
				}
			}
		}

		int var16 = field998.method79(arg0, arg2, arg1);
		if (var16 != 0) {
			int var17 = field998.method81(arg0, arg2, arg1, var16);
			int var18 = var17 >> 6 & 0x3;
			int var19 = var17 & 0x1F;
			int var20 = var16 >> 14 & 0x7FFF;
			class53 var21 = class53.method275(var20);
			if (var21.field722 != -1) {
				class35 var22 = field1159[var21.field722];
				if (var22 != null) {
					int var23 = (var21.field707 * 4 - var22.field524) / 2;
					int var24 = (var21.field708 * 4 - var22.field525) / 2;
					var22.method186((104 - arg1 - var21.field708) * 4 + var24 + 48, arg2 * 4 + 48 + var23);
				}
			} else if (var19 == 9) {
				int var25 = 0xEEEEEE;
				if (var16 > 0) {
					var25 = 0xEE0000;
				}

				int[] var26 = field1084.field515;
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

		int var28 = field998.method80(arg0, arg2, arg1);
		if (var28 != 0) {
			int var29 = var28 >> 14 & 0x7FFF;
			class53 var30 = class53.method275(var29);
			if (var30.field722 != -1) {
				class35 var31 = field1159[var30.field722];
				if (var31 != null) {
					int var32 = (var30.field707 * 4 - var31.field524) / 2;
					int var33 = (var30.field708 * 4 - var31.field525) / 2;
					var31.method186((104 - arg1 - var30.field708) * 4 + var33 + 48, arg2 * 4 + 48 + var32);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field1029 && !field1244 && !field1072) {
			field1134++;

			if (field1133) {
				method446();
			} else {
				method439();
			}
		}
	}

	@ObfuscatedName("client.a(IIILz;I)V")
	public final void method397(int arg0, int arg1, class26 arg2, int arg3) {
		if (field1171 != arg2 && field997 < 400) {
			String var5 = arg2.field321 + method445(field1171.field327, arg2.field327) + " (level-" + arg2.field327 + ")";
			if (field1175 == 1) {
				field1125[field997] = "Use " + field1179 + " with @whi@" + var5;
				field1261[field997] = 103;
				field1262[field997] = arg0;
				field1259[field997] = arg3;
				field1260[field997] = arg1;
				field997++;
			} else if (field1252 != 1) {
				field1125[field997] = "Follow @whi@" + var5;
				field1261[field997] = 1741;
				field1262[field997] = arg0;
				field1259[field997] = arg3;
				field1260[field997] = arg1;
				field997++;
				if (field1182 == 0) {
					field1125[field997] = "Trade with @whi@" + var5;
					field1261[field997] = 1528;
					field1262[field997] = arg0;
					field1259[field997] = arg3;
					field1260[field997] = arg1;
					field997++;
				}

				if (field1049 > 0) {
					field1125[field997] = "Attack @whi@" + var5;

					if (field1171.field327 >= arg2.field327) {
						field1261[field997] = 593;
					} else {
						field1261[field997] = 2593;
					}

					field1262[field997] = arg0;
					field1259[field997] = arg3;
					field1260[field997] = arg1;
					field997++;
				}

				if (field1127 == 1) {
					field1125[field997] = "Fight @whi@" + var5;
					field1261[field997] = 593;
					field1262[field997] = arg0;
					field1259[field997] = arg3;
					field1260[field997] = arg1;
					field997++;
				}

				if (field1127 == 2) {
					field1125[field997] = "Duel-with @whi@" + var5;
					field1261[field997] = 1596;
					field1262[field997] = arg0;
					field1259[field997] = arg3;
					field1260[field997] = arg1;
					field997++;
				}
			} else if ((field1254 & 0x8) == 8) {
				field1125[field997] = field1255 + " @whi@" + var5;
				field1261[field997] = 48;
				field1262[field997] = arg0;
				field1259[field997] = arg3;
				field1260[field997] = arg1;
				field997++;
			}

			for (int var6 = 0; var6 < field997; var6++) {
				if (field1261[var6] == 981) {
					field1125[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(ILhc;)Z")
	public final boolean method398(class60 arg0) {
		int var2 = arg0.field839;
		if (var2 == 201) {
			field1181 = true;
			field1299 = false;
			field1136 = true;
			field1251 = "";
			field1107 = 1;
			field994 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1181 = true;
			field1299 = false;
			field1136 = true;
			field1251 = "";
			field1107 = 2;
			field994 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1064 = 250;
			return true;
		}

		if (var2 == 501) {
			field1181 = true;
			field1299 = false;
			field1136 = true;
			field1251 = "";
			field1107 = 4;
			field994 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1181 = true;
			field1299 = false;
			field1136 = true;
			field1251 = "";
			field1107 = 5;
			field994 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1275[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class59.field822 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class59.field822) {
							var5 = 0;
						}
					}

					if (!class59.field823[var5].field829 && class59.field823[var5].field824 == var3 + (field1124 ? 0 : 7)) {
						break;
					}
				}

				field1275[var3] = var5;
				field1123 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1094[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1258[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1258[var6].length) {
					var8 = 0;
				}
			}

			field1094[var6] = var8;
			field1123 = true;
		}

		if (var2 == 324 && !field1124) {
			field1124 = true;
			method487();
		}

		if (var2 == 325 && field1124) {
			field1124 = false;
			method487();
		}

		if (var2 == 326) {
			field1214.method198(239);
			field1214.method199(field1124 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1214.method199(field1275[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1214.method199(field1094[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1047 = !field1047;
		}

		if (var2 >= 601 && var2 <= 612) {
			method472();

			if (field1110.length() > 0) {
				field1214.method198(252);
				field1214.method205(class48.method251(field1110));
				field1214.method199(var2 - 601);
				field1214.method199(field1047 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.n(I)V")
	public static final void method399() {
		class18.field194 = true;
		class33.field492 = true;
		field1249 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.e(B)V")
	public static final void method400() {
		class18.field194 = false;
		class33.field492 = false;
		field1249 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.a(Lhb;BII)V")
	public final void method401(class34 arg0, int arg1, int arg2) {
		int var4 = field990 + field1008 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field478[var4];
			int var7 = class31.field479[var4];
			var6 = var6 * 256 / (field1329 + 256);
			var7 = var7 * 256 / (field1329 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method180(var8 + 94 - arg0.field520 / 2, 83 - var9 - arg0.field521 / 2, field1002);
			} else {
				arg0.method173(83 - var9 - arg0.field521 / 2, var8 + 94 - arg0.field520 / 2);
			}
		}
	}

	@ObfuscatedName("client.c(IJ)V")
	public final void method402(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1300; var3++) {
				if (field1183[var3] == arg0) {
					field1300--;
					field1104 = true;

					for (int var4 = var3; var4 < field1300; var4++) {
						field1128[var4] = field1128[var4 + 1];
						field1197[var4] = field1197[var4 + 1];
						field1183[var4] = field1183[var4 + 1];
					}

					field1214.method198(210);
					field1214.method205(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZLbc;I)V")
	public final void method403(int arg0, int arg1, class54 arg2, int arg3) {
		if (field997 < 400) {
			String var5 = arg2.field741;
			if (arg2.field759 != 0) {
				var5 = var5 + method445(field1171.field327, arg2.field759) + " (level-" + arg2.field759 + ")";
			}

			if (field1175 == 1) {
				field1125[field997] = "Use " + field1179 + " with @yel@" + var5;
				field1261[field997] = 493;
				field1262[field997] = arg3;
				field1259[field997] = arg0;
				field1260[field997] = arg1;
				field997++;
			} else if (field1252 != 1) {
				if (arg2.field754 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg2.field754[var6] != null && !arg2.field754[var6].equalsIgnoreCase("attack")) {
							field1125[field997] = arg2.field754[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1261[field997] = 988;
							}

							if (var6 == 1) {
								field1261[field997] = 345;
							}

							if (var6 == 2) {
								field1261[field997] = 249;
							}

							if (var6 == 3) {
								field1261[field997] = 960;
							}

							if (var6 == 4) {
								field1261[field997] = 40;
							}

							field1262[field997] = arg3;
							field1259[field997] = arg0;
							field1260[field997] = arg1;
							field997++;
						}
					}
				}

				if (arg2.field754 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg2.field754[var7] != null && arg2.field754[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg2.field759 > field1171.field327) {
								var8 = 2000;
							}

							field1125[field997] = arg2.field754[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1261[field997] = var8 + 988;
							}

							if (var7 == 1) {
								field1261[field997] = var8 + 345;
							}

							if (var7 == 2) {
								field1261[field997] = var8 + 249;
							}

							if (var7 == 3) {
								field1261[field997] = var8 + 960;
							}

							if (var7 == 4) {
								field1261[field997] = var8 + 40;
							}

							field1262[field997] = arg3;
							field1259[field997] = arg0;
							field1260[field997] = arg1;
							field997++;
						}
					}
				}

				field1125[field997] = "Examine @yel@" + var5;
				field1261[field997] = 1814;
				field1262[field997] = arg3;
				field1259[field997] = arg0;
				field1260[field997] = arg1;
				field997++;
			} else if ((field1254 & 0x2) == 2) {
				field1125[field997] = field1255 + " @yel@" + var5;
				field1261[field997] = 500;
				field1262[field997] = arg3;
				field1259[field997] = arg0;
				field1260[field997] = arg1;
				field997++;
				return;
			}
		}
	}

	public final void run() {
		if (field1138) {
			method421();
		} else if (field1048) {
			method483();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method404() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1265 != -1 && field1265 == field1080) {
				if (var1 == 8 && field1110.length() > 0) {
					field1110 = field1110.substring(0, field1110.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1110.length() < 12) {
					field1110 = field1110 + (char) var1;
				}
			} else if (field1136) {
				if (var1 >= 32 && var1 <= 122 && field1251.length() < 80) {
					field1251 = field1251 + (char) var1;
					field1181 = true;
				}

				if (var1 == 8 && field1251.length() > 0) {
					field1251 = field1251.substring(0, field1251.length() - 1);
					field1181 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1136 = false;
					field1181 = true;

					if (field1107 == 1) {
						long var2 = class48.method251(field1251);
						method374(var2);
					}

					if (field1107 == 2 && field1300 > 0) {
						long var4 = class48.method251(field1251);
						method402(var4);
					}

					if (field1107 == 3 && field1251.length() > 0) {
						field1214.method198(6);
						field1214.method199(0);
						int var6 = field1214.field541;
						field1214.method205(field977);
						class49.method259(field1251, field1214);
						field1214.method208(field1214.field541 - var6);
						field1251 = class48.method256(field1251);
						field1251 = class65.method335(field1251);
						method431(field1251, class48.method255(class48.method252(field977)), 6);

						if (field1035 == 2) {
							field1035 = 1;
							field1077 = true;
							field1214.method198(197);
							field1214.method199(field981);
							field1214.method199(field1035);
							field1214.method199(field1192);
						}
					}

					if (field1107 == 4 && field1209 < 100) {
						long var7 = class48.method251(field1251);
						method380(var7);
					}

					if (field1107 == 5 && field1209 > 0) {
						long var9 = class48.method251(field1251);
						method413(var9);
					}
				}
			} else if (field1299) {
				if (var1 >= 48 && var1 <= 57 && field1312.length() < 10) {
					field1312 = field1312 + (char) var1;
					field1181 = true;
				}

				if (var1 == 8 && field1312.length() > 0) {
					field1312 = field1312.substring(0, field1312.length() - 1);
					field1181 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1312.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1312);
						} catch (Exception var15) {
						}

						field1214.method198(147);
						field1214.method203(var11);
					}

					field1299 = false;
					field1181 = true;
				}
			} else if (field942 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1050.length() < 80) {
					field1050 = field1050 + (char) var1;
					field1181 = true;
				}

				if (var1 == 8 && field1050.length() > 0) {
					field1050 = field1050.substring(0, field1050.length() - 1);
					field1181 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1050.length() > 0) {
					if (field1050.equals("::clientdrop") && (field11 != null || method453().indexOf("192.168.1.") != -1)) {
						method442();
					} else if (field1050.startsWith("::")) {
						field1214.method198(251);
						field1214.method199(field1050.length() - 1);
						field1214.method206(field1050.substring(2));
					} else {
						byte var12 = 0;
						if (field1050.startsWith("yellow:")) {
							var12 = 0;
							field1050 = field1050.substring(7);
						}

						if (field1050.startsWith("red:")) {
							var12 = 1;
							field1050 = field1050.substring(4);
						}

						if (field1050.startsWith("green:")) {
							var12 = 2;
							field1050 = field1050.substring(6);
						}

						if (field1050.startsWith("cyan:")) {
							var12 = 3;
							field1050 = field1050.substring(5);
						}

						if (field1050.startsWith("purple:")) {
							var12 = 4;
							field1050 = field1050.substring(7);
						}

						if (field1050.startsWith("white:")) {
							var12 = 5;
							field1050 = field1050.substring(6);
						}

						if (field1050.startsWith("flash1:")) {
							var12 = 6;
							field1050 = field1050.substring(7);
						}

						if (field1050.startsWith("flash2:")) {
							var12 = 7;
							field1050 = field1050.substring(7);
						}

						if (field1050.startsWith("flash3:")) {
							var12 = 8;
							field1050 = field1050.substring(7);
						}

						if (field1050.startsWith("glow1:")) {
							var12 = 9;
							field1050 = field1050.substring(6);
						}

						if (field1050.startsWith("glow2:")) {
							var12 = 10;
							field1050 = field1050.substring(6);
						}

						if (field1050.startsWith("glow3:")) {
							var12 = 11;
							field1050 = field1050.substring(6);
						}

						byte var13 = 0;
						if (field1050.startsWith("wave:")) {
							var13 = 1;
							field1050 = field1050.substring(5);
						}

						if (field1050.startsWith("scroll:")) {
							var13 = 2;
							field1050 = field1050.substring(7);
						}

						field1214.method198(42);
						field1214.method199(0);
						int var14 = field1214.field541;
						field1214.method199(var12);
						field1214.method199(var13);
						class49.method259(field1050, field1214);
						field1214.method208(field1214.field541 - var14);
						field1050 = class48.method256(field1050);
						field1050 = class65.method335(field1050);
						field1171.field280 = field1050;
						field1171.field282 = var12;
						field1171.field283 = var13;
						field1171.field281 = 150;
						method431(field1171.field280, field1171.field321, 2);

						if (field981 == 2) {
							field981 = 1;
							field1077 = true;
							field1214.method198(197);
							field1214.method199(field981);
							field1214.method199(field1035);
							field1214.method199(field1192);
						}
					}

					field1050 = "";
					field1181 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method405() {
		field1231++;
		method463();
		method420();
		method462();
		method447();
		method387();

		if (!field1243) {
			int var1 = field1007;
			if (field1148 / 256 > var1) {
				var1 = field1148 / 256;
			}

			if (field1250[4] && field957[4] + 128 > var1) {
				var1 = field957[4] + 128;
			}

			int var2 = field1184 + field1008 & 0x7FF;
			method444(var1, var1 * 3 + 600, method488(field1315, field1171.field269, field1171.field268) - 50, var2, field1168, field1169);
		}

		int var3;
		if (field1243) {
			var3 = method441();
		} else {
			var3 = method440();
		}

		int var4 = field1204;
		int var5 = field1205;
		int var6 = field1206;
		int var7 = field1207;
		int var8 = field1208;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1250[var9]) {
				int var10 = (int) (Math.random() * (field1131[var9] * 2 + 1) + Math.sin(field1291[var9] / 100.0D * field953[var9]) * field957[var9] - field1131[var9]);
				if (var9 == 0) {
					field1204 += var10;
				}

				if (var9 == 1) {
					field1205 += var10;
				}

				if (var9 == 2) {
					field1206 += var10;
				}

				if (var9 == 3) {
					field1208 = field1208 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1207 += var10;
					if (field1207 < 128) {
						field1207 = 128;
					}

					if (field1207 > 383) {
						field1207 = 383;
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
		field998.method90(field1205, field1206, field1208, field1204, var3, field1207);
		field998.method64();
		method470();
		method419();
		method465(var11);
		method411();
		field1015.method236(11, field8, 8);
		field1204 = var4;
		field1205 = var5;
		field1206 = var6;
		field1207 = var7;
		field1208 = var8;
	}

	@ObfuscatedName("client.a(III)V")
	public final void method406(int arg0, int arg1) {
		if (field1079 != 0) {
			int var3 = 0;
			if (field974 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field1147[var4] != null) {
					int var5 = field1145[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field1035 == 0 || field1035 == 1 && method437(field1146[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field15 > 8 && field15 < 520 && arg1 - 11 > var6 - 10 && arg1 - 11 <= var6 + 3) {
							if (field945) {
								field1125[field997] = "Report abuse @whi@" + field1146[var4];
								field1261[field997] = 2316;
								field997++;
							}

							field1125[field997] = "Add ignore @whi@" + field1146[var4];
							field1261[field997] = 2158;
							field997++;
							field1125[field997] = "Add friend @whi@" + field1146[var4];
							field1261[field997] = 2447;
							field997++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field1035 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method407() {
		field1190 = new class35(field1073, "titlebox", 0);
		field1191 = new class35(field1073, "titlebutton", 0);
		field952 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field952[var1] = new class35(field1073, "runes", var1);
		}

		field1141 = new class34(128, 265);
		field1142 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1141.field515[var2] = field1020.field581[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1142.field515[var3] = field1021.field581[var3];
		}

		field959 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field959[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field959[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field959[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field959[var7 + 192] = 0xFFFFFF;
		}

		field960 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field960[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field960[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field960[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field960[var11 + 192] = 0xFFFFFF;
		}

		field961 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field961[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field961[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field961[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field961[var15 + 192] = 0xFFFFFF;
		}

		field958 = new int[256];
		field1281 = new int[32768];
		field1282 = new int[32768];
		method455(null);
		field1288 = new int[32768];
		field1289 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1318) {
			field1138 = true;
			field1318 = true;
			method12(this, 2);
		}
	}

	public final void init() {
		field1246 = Integer.parseInt(getParameter("nodeid"));
		field1247 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method399();
		} else {
			method400();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1248 = false;
		} else {
			field1248 = true;
		}

		method2(789, 532);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method408() {
		if (field1210 == 2) {
			for (class39 var1 = (class39) field999.method228(); var1 != null; var1 = (class39) field999.method230()) {
				if (field1134 >= var1.field569) {
					method429(var1.field568, var1.field562, var1.field563, var1.field566, var1.field567, var1.field564, var1.field565);
					var1.method107();
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method409(int arg0, int arg1) {
		boolean var3 = false;
		class60 var4 = class60.field830[arg0];
		for (int var5 = 0; var5 < var4.field851.length && var4.field851[var5] != -1; var5++) {
			class60 var6 = class60.field830[var4.field851[var5]];
			if (var6.field837 == 1) {
				var3 |= method409(var6.field835, arg1);
			}

			if (var6.field837 == 6 && (var6.field878 != -1 || var6.field879 != -1)) {
				boolean var7 = method375(var6);
				int var8;
				if (var7) {
					var8 = var6.field879;
				} else {
					var8 = var6.field878;
				}

				if (var8 != -1) {
					class62 var9 = class62.field896[var8];
					var6.field834 += arg1;
					while (var6.field834 > var9.field900[var6.field833]) {
						var6.field834 -= var9.field900[var6.field833] + 1;
						var6.field833++;
						if (var6.field833 >= var9.field897) {
							var6.field833 -= var9.field901;
							if (var6.field833 < 0 || var6.field833 >= var9.field897) {
								var6.field833 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method410() {
		int var1 = field1091.method190("Choose Option");
		for (int var2 = 0; var2 < field997; var2++) {
			int var3 = field1091.method190(field1125[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field997 * 15 + 21;
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

			field943 = true;
			field1276 = 0;
			field1277 = var5;
			field1278 = var6;
			field1279 = var1;
			field1280 = field997 * 15 + 22;
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

			field943 = true;
			field1276 = 1;
			field1277 = var7;
			field1278 = var8;
			field1279 = var1;
			field1280 = field997 * 15 + 22;
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

			field943 = true;
			field1276 = 2;
			field1277 = var9;
			field1278 = var10;
			field1279 = var1;
			field1280 = field997 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field982 != null) {
				field982.method29();
			}
		} catch (Exception var1) {
		}

		field982 = null;
		method426();
		field1111 = false;
		field1214 = null;
		field1102 = null;
		field1242 = null;
		field1321 = null;
		field1006 = null;
		field1292 = null;
		field980 = null;
		field1087 = null;
		field998 = null;
		field983 = null;
		field1238 = null;
		field1143 = null;
		field1332 = null;
		field1333 = null;
		field1305 = null;
		field1013 = null;
		field1014 = null;
		field1015 = null;
		field1016 = null;
		field1165 = null;
		field1166 = null;
		field1167 = null;
		field1036 = null;
		field1037 = null;
		field1038 = null;
		field1039 = null;
		field1040 = null;
		field1041 = null;
		field1042 = null;
		field1043 = null;
		field1044 = null;
		field1045 = null;
		field1001 = null;
		field1002 = null;
		field1003 = null;
		field1335 = null;
		field1336 = null;
		field1337 = null;
		field1232 = null;
		field1199 = null;
		field1200 = null;
		field1201 = null;
		field1202 = null;
		field1203 = null;
		field1283 = null;
		field1284 = null;
		field1285 = null;
		field1286 = null;
		field1287 = null;
		field1100 = null;
		field978 = null;
		field1000 = null;
		field1069 = null;
		field984 = null;
		field985 = null;
		field986 = null;
		field987 = null;
		field1159 = null;
		field1306 = null;
		field1081 = null;
		field1153 = null;
		field1155 = null;
		field1157 = null;
		field1158 = null;
		field1264 = null;
		field962 = null;
		field964 = null;
		field1298 = null;
		field1245 = null;
		field999 = null;
		field1070 = null;
		field1334 = null;
		field973 = null;
		field1259 = null;
		field1260 = null;
		field1261 = null;
		field1262 = null;
		field1125 = null;
		field1137 = null;
		field1114 = null;
		field1115 = null;
		field1120 = null;
		field1084 = null;
		field1128 = null;
		field1183 = null;
		field1197 = null;
		field1020 = null;
		field1021 = null;
		field1017 = null;
		field1018 = null;
		field1019 = null;
		field1022 = null;
		field1023 = null;
		field1024 = null;
		field1025 = null;
		method364();
		class53.method274();
		class54.method280();
		class55.method286();
		class58.field811 = null;
		class59.field823 = null;
		class60.field830 = null;
		class61.field889 = null;
		class62.field896 = null;
		class63.field909 = null;
		class63.field921 = null;
		class64.field923 = null;
		field9 = null;
		class26.field341 = null;
		class33.method153();
		class18.method49();
		class31.method120();
		class6.field66 = null;
		class7.field70 = null;
		System.gc();
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method411() {
		method433();

		if (field1119 == 1) {
			field1069[field1118 / 100].method173(field1117 - 8 - 11, field1116 - 8 - 8);
		}

		if (field1119 == 2) {
			field1069[field1118 / 100 + 4].method173(field1117 - 8 - 11, field1116 - 8 - 8);
			field1144++;
			if (field1144 > 161) {
				field1144 = 0;
				field1214.method198(128);
				field1214.method200(9331);
			}
		}

		if (field1265 != -1) {
			method409(field1265, field1103);
			method459(class60.field830[field1265], 0, 0, 0);
		}

		method450();

		if (!field943) {
			method370();
			method393();
		} else if (field1276 == 0) {
			method456();
		}

		if (field1027 == 1) {
			if (field1049 > 0 || field1127 == 1) {
				field1000[1].method173(258, 472);
			} else {
				field1000[1].method173(296, 472);
			}
		}

		if (field1049 > 0) {
			field1000[0].method173(296, 472);
			field1090.method188(0xFFFF00, "Level: " + field1049, 329, 484);
		}

		if (field1127 == 1) {
			field1000[6].method173(296, 472);
			field1090.method188(0xFFFF00, "Arena", 329, 484);
		}

		if (field974 != 0) {
			int var1 = field974 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1090.method191(4, 329, "System update in: " + var2 + ":0" + var1, 0xFFFF00);
			} else {
				field1090.method191(4, 329, "System update in: " + var2 + ":" + var1, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method412() {
		byte[] var1 = field1073.method250(null, "title.dat");
		class34 var2 = new class34(var1, this);
		field1020.method235();
		var2.method171(0, 0);
		field1021.method235();
		var2.method171(-661, 0);
		field1017.method235();
		var2.method171(-128, 0);
		field1018.method235();
		var2.method171(-214, -386);
		field1019.method235();
		var2.method171(-214, -186);
		field1022.method235();
		var2.method171(0, -265);
		field1023.method235();
		var2.method171(-574, -265);
		field1024.method235();
		var2.method171(-128, -186);
		field1025.method235();
		var2.method171(-574, -186);
		int[] var3 = new int[var2.field516];
		for (int var4 = 0; var4 < var2.field517; var4++) {
			for (int var5 = 0; var5 < var2.field516; var5++) {
				var3[var5] = var2.field515[var2.field516 * var4 + var2.field516 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field516; var6++) {
				var2.field515[var2.field516 * var4 + var6] = var3[var6];
			}
		}

		field1020.method235();
		var2.method171(394, 0);
		field1021.method235();
		var2.method171(-267, 0);
		field1017.method235();
		var2.method171(266, 0);
		field1018.method235();
		var2.method171(180, -386);
		field1019.method235();
		var2.method171(180, -186);
		field1022.method235();
		var2.method171(394, -265);
		field1023.method235();
		var2.method171(-180, -265);
		field1024.method235();
		var2.method171(212, -186);
		field1025.method235();
		var2.method171(-180, -186);
		class34 var7 = new class34(field1073, "logo", 0);
		field1017.method235();
		var7.method173(18, field6 / 2 - var7.field516 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method413(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1209; var3++) {
				if (field1304[var3] == arg0) {
					field1209--;
					field1104 = true;

					for (int var4 = var3; var4 < field1209; var4++) {
						field1304[var4] = field1304[var4 + 1];
					}

					field1214.method198(68);
					field1214.method205(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		method391();

		if (field1073 == null) {
			super.method13(arg0, arg1);
		} else {
			field1019.method235();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1091.method188(0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			class32.method150(0x8C1111, 304, var3 / 2 - 152, var6, 34);
			class32.method150(0, 302, var3 / 2 - 151, var6 + 1, 32);
			class32.method149(0x8C1111, arg0 * 3, var6 + 2, 30, var3 / 2 - 150);
			class32.method149(0, 300 - arg0 * 3, var6 + 2, 30, arg0 * 3 + var3 / 2 - 150);
			field1091.method188(0xFFFFFF, arg1, var4 / 2 + 5 - var5, var3 / 2);
			field1019.method236(186, field8, 214);

			if (field1099) {
				field1099 = false;

				if (!field1318) {
					field1020.method236(0, field8, 0);
					field1021.method236(0, field8, 661);
				}

				field1017.method236(0, field8, 128);
				field1018.method236(386, field8, 214);
				field1022.method236(265, field8, 0);
				field1023.method236(265, field8, 574);
				field1024.method236(186, field8, 128);
				field1025.method236(186, field8, 574);
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method414() {
		try {
			field1071 = -1;
			field999.method232();
			field973.method232();
			field1334.method232();
			field1070.method232();
			class33.method156();
			method390();
			field998.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field983[var1].method295();
			}

			System.gc();
			class3 var2 = new class3(104, field1087, field980, 104);
			byte[] var3 = new byte[100000];
			int var4 = field1006.length;
			class3.field25 = class18.field194;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1321[var5] >> 8;
				int var7 = field1321[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field25 = false;
				}
			}

			if (class3.field25) {
				field998.method51(field1315);
			} else {
				field998.method51(0);
			}

			field1214.method198(126);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1321[var8] >> 8) * 64 - field1161;
				int var10 = (field1321[var8] & 0xFF) * 64 - field1162;
				byte[] var11 = field1006[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method214();
					class44.method238(var3, var12, var11, var11.length - 4, 4);
					var2.method15(var9, var10, (field1239 - 6) * 8, var3, (field1240 - 6) * 8);
				} else if (field1240 < 800) {
					var2.method14(64, var9, 64, var10);
				}
			}

			field1214.method198(126);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field1292[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method214();
					class44.method238(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1321[var13] >> 8) * 64 - field1161;
					int var17 = (field1321[var13] & 0xFF) * 64 - field1162;
					var2.method16(var17, var3, field973, field983, var16, field998);
				}
			}

			field1214.method198(126);
			var2.method18(field998, field983);
			field1015.method235();
			field1214.method198(126);

			for (class40 var18 = (class40) field973.method228(); var18 != null; var18 = (class40) field973.method230()) {
				if ((field1087[1][var18.field572][var18.field573] & 0x2) == 2) {
					var18.field570--;
					if (var18.field570 < 0) {
						var18.method107();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method422(var19, var20);
				}
			}

			for (class38 var21 = (class38) field1245.method228(); var21 != null; var21 = (class38) field1245.method230()) {
				method429(var21.field558, var21.field552, var21.field553, var21.field556, var21.field557, var21.field554, var21.field555);
			}
		} catch (Exception var23) {
		}

		class53.field733.method104();
		System.gc();
		class33.method157(20);
	}

	@ObfuscatedName("client.r(I)V")
	public final void method415() {
		for (int var1 = -1; var1 < field1154; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1152;
			} else {
				var2 = field1155[var1];
			}

			class26 var3 = field1153[var2];
			if (var3 != null && var3.field281 > 0) {
				var3.field281--;
				if (var3.field281 == 0) {
					var3.field280 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field963; var4++) {
			int var5 = field964[var4];
			class25 var6 = field962[var5];
			if (var6 != null && var6.field281 > 0) {
				var6.field281--;
				if (var6.field281 == 0) {
					var6.field280 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method416() {
		if (field1175 == 0 && field1252 == 0) {
			field1125[field997] = "Walk here";
			field1261[field997] = 981;
			field1259[field997] = field15;
			field1260[field997] = field16;
			field997++;
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

				if (var6 == 2 && field998.method81(field1315, var4, var5, var3) >= 0) {
					class53 var8 = class53.method275(var7);
					if (field1175 == 1) {
						field1125[field997] = "Use " + field1179 + " with @cya@" + var8.field703;
						field1261[field997] = 505;
						field1262[field997] = var3;
						field1259[field997] = var4;
						field1260[field997] = var5;
						field997++;
					} else if (field1252 != 1) {
						if (var8.field719 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field719[var9] != null) {
									field1125[field997] = var8.field719[var9] + " @cya@" + var8.field703;

									if (var9 == 0) {
										field1261[field997] = 798;
									}

									if (var9 == 1) {
										field1261[field997] = 829;
									}

									if (var9 == 2) {
										field1261[field997] = 873;
									}

									if (var9 == 3) {
										field1261[field997] = 104;
									}

									if (var9 == 4) {
										field1261[field997] = 1659;
									}

									field1262[field997] = var3;
									field1259[field997] = var4;
									field1260[field997] = var5;
									field997++;
								}
							}
						}

						field1125[field997] = "Examine @cya@" + var8.field703;
						field1261[field997] = 1418;
						field1262[field997] = var3;
						field1259[field997] = var4;
						field1260[field997] = var5;
						field997++;
					} else if ((field1254 & 0x4) == 4) {
						field1125[field997] = field1255 + " @cya@" + var8.field703;
						field1261[field997] = 737;
						field1262[field997] = var3;
						field1259[field997] = var4;
						field1260[field997] = var5;
						field997++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field962[var7];
					if (var10.field320.field743 == 1 && (var10.field268 & 0x7F) == 0x40 && (var10.field269 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field963; var11++) {
							class25 var12 = field962[field964[var11]];
							if (var12 != null && var10 != var12 && var12.field320.field743 == 1 && var10.field268 == var12.field268 && var10.field269 == var12.field269) {
								method403(var4, var5, var12.field320, field964[var11]);
							}
						}
					}

					method403(var4, var5, var10.field320, var7);
				}

				if (var6 == 0) {
					class26 var13 = field1153[var7];
					if ((var13.field268 & 0x7F) == 0x40 && (var13.field269 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field963; var14++) {
							class25 var15 = field962[field964[var14]];
							if (var15 != null && var15.field320.field743 == 1 && var13.field268 == var15.field268 && var13.field269 == var15.field269) {
								method403(var4, var5, var15.field320, field964[var14]);
							}
						}

						for (int var16 = 0; var16 < field1154; var16++) {
							class26 var17 = field1153[field1155[var16]];
							if (var17 != null && var13 != var17 && var13.field268 == var17.field268 && var13.field269 == var17.field269) {
								method397(field1155[var16], var5, var17, var4);
							}
						}
					}

					method397(var7, var5, var13, var4);
				}

				if (var6 == 3) {
					class41 var18 = field1298[field1315][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method229(); var19 != null; var19 = (class22) var18.method231()) {
							class55 var20 = class55.method287(var19.field266);
							if (field1175 == 1) {
								field1125[field997] = "Use " + field1179 + " with @lre@" + var20.field771;
								field1261[field997] = 203;
								field1262[field997] = var19.field266;
								field1259[field997] = var4;
								field1260[field997] = var5;
								field997++;
							} else if (field1252 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field785 != null && var20.field785[var21] != null) {
										field1125[field997] = var20.field785[var21] + " @lre@" + var20.field771;

										if (var21 == 0) {
											field1261[field997] = 56;
										}

										if (var21 == 1) {
											field1261[field997] = 321;
										}

										if (var21 == 2) {
											field1261[field997] = 552;
										}

										if (var21 == 3) {
											field1261[field997] = 43;
										}

										if (var21 == 4) {
											field1261[field997] = 687;
										}

										field1262[field997] = var19.field266;
										field1259[field997] = var4;
										field1260[field997] = var5;
										field997++;
									} else if (var21 == 2) {
										field1125[field997] = "Take @lre@" + var20.field771;
										field1261[field997] = 552;
										field1262[field997] = var19.field266;
										field1259[field997] = var4;
										field1260[field997] = var5;
										field997++;
									}
								}

								field1125[field997] = "Examine @lre@" + var20.field771;
								field1261[field997] = 1308;
								field1262[field997] = var19.field266;
								field1259[field997] = var4;
								field1260[field997] = var5;
								field997++;
							} else if ((field1254 & 0x1) == 1) {
								field1125[field997] = field1255 + " @lre@" + var20.field771;
								field1261[field997] = 543;
								field1262[field997] = var19.field266;
								field1259[field997] = var4;
								field1260[field997] = var5;
								field997++;
							}
						}
					}
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

	@ObfuscatedName("client.a(ILkb;B)V")
	public final void method417(int arg0, class37 arg1) {
		field1263 = 0;
		field1156 = 0;
		method392(arg1, arg0);
		method424(arg0, arg1);
		method486(arg0, arg1);
		method448(arg0, arg1);

		for (int var3 = 0; var3 < field1263; var3++) {
			int var4 = field1264[var3];
			if (field1134 != field1153[var4].field312) {
				field1153[var4] = null;
			}
		}

		if (arg1.field541 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field541 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1154; var5++) {
			if (field1153[field1155[var5]] == null) {
				signlink.reporterror(field1322 + " null entry in pl list - pos:" + var5 + " size:" + field1154);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a([BZIZ)V")
	public final void method418(byte[] arg0, int arg1, boolean arg2) {
		signlink.midifade = arg2 ? 1 : 0;
		signlink.midisave(arg0, arg1);
	}

	@ObfuscatedName("client.t(I)V")
	public final void method419() {
		if (field1075 == 2) {
			method378((field1268 - field1162 << 7) + field1271, (field1267 - field1161 << 7) + field1270, field1269 * 2);

			if (field1121 > -1 && field1134 % 20 < 10) {
				field1000[2].method173(field1122 - 28, field1121 - 12);
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method420() {
		for (int var1 = 0; var1 < field963; var1++) {
			class25 var2 = field962[field964[var1]];
			int var3 = (field964[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method111()) {
				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field272 == 1 && (var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
						if (field1081[var4][var5] == field1231) {
							continue;
						}

						field1081[var4][var5] = field1231;
					}

					field998.method61(var3, method488(field1315, var2.field269, var2.field268), var2, null, var2.field269, var2.field271, field1315, var2.field270, var2.field268, (var2.field272 - 1) * 64 + 60);
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method421() {
		field1059 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1318) {
				method451();
				method451();
				method484();
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

		field1059 = false;
	}

	@ObfuscatedName("client.e(II)V")
	public final void method422(int arg0, int arg1) {
		class41 var3 = field1298[field1315][arg0][arg1];
		if (var3 == null) {
			field998.method76(field1315, arg0, arg1);
		} else {
			int var4 = -99999999;
			class22 var5 = null;
			for (class22 var6 = (class22) var3.method228(); var6 != null; var6 = (class22) var3.method230()) {
				class55 var7 = class55.method287(var6.field266);
				int var8 = var7.field783;
				if (var7.field782) {
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
			field998.method57(field1315, method488(field1315, arg1 * 128 + 64, arg0 * 128 + 64), var17.method291(var5.field267), var16, var14, var15, arg0, arg1);
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method10() {
		field1099 = true;
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method423(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1147[var4] != null) {
				int var5 = field1145[var4];
				int var6 = field1033 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field981 == 0 || field981 == 1 && method437(field1146[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !field1146[var4].equals(field1171.field321)) {
						if (field945) {
							field1125[field997] = "Report abuse @whi@" + field1146[var4];
							field1261[field997] = 316;
							field997++;
						}

						field1125[field997] = "Add ignore @whi@" + field1146[var4];
						field1261[field997] = 158;
						field997++;
						field1125[field997] = "Add friend @whi@" + field1146[var4];
						field1261[field997] = 447;
						field997++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1079 == 0 && (var5 == 7 || field1035 == 0 || field1035 == 1 && method437(field1146[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field945) {
							field1125[field997] = "Report abuse @whi@" + field1146[var4];
							field1261[field997] = 316;
							field997++;
						}

						field1125[field997] = "Add ignore @whi@" + field1146[var4];
						field1261[field997] = 158;
						field997++;
						field1125[field997] = "Add friend @whi@" + field1146[var4];
						field1261[field997] = 447;
						field997++;
					}

					var3++;
				}

				if (var5 == 4 && (field1192 == 0 || field1192 == 1 && method437(field1146[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1125[field997] = "Accept trade @whi@" + field1146[var4];
						field1261[field997] = 595;
						field997++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1079 == 0 && field1035 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1192 == 0 || field1192 == 1 && method437(field1146[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1125[field997] = "Accept duel @whi@" + field1146[var4];
						field1261[field997] = 835;
						field997++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILkb;)V")
	public final void method424(int arg0, class37 arg1) {
		int var3 = arg1.method220(8);
		if (var3 < field1154) {
			for (int var4 = var3; var4 < field1154; var4++) {
				field1264[field1263++] = field1155[var4];
			}
		}

		if (var3 > field1154) {
			signlink.reporterror(field1322 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1154 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1155[var5];
			class26 var7 = field1153[var6];
			int var8 = arg1.method220(1);
			if (var8 == 0) {
				field1155[field1154++] = var6;
				var7.field312 = field1134;
			} else {
				int var9 = arg1.method220(2);
				if (var9 == 0) {
					field1155[field1154++] = var6;
					var7.field312 = field1134;
					field1157[field1156++] = var6;
				} else if (var9 == 1) {
					field1155[field1154++] = var6;
					var7.field312 = field1134;
					int var10 = arg1.method220(3);
					var7.method110(false, var10);
					int var11 = arg1.method220(1);
					if (var11 == 1) {
						field1157[field1156++] = var6;
					}
				} else if (var9 == 2) {
					field1155[field1154++] = var6;
					var7.field312 = field1134;
					int var12 = arg1.method220(3);
					var7.method110(true, var12);
					int var13 = arg1.method220(3);
					var7.method110(true, var13);
					int var14 = arg1.method220(1);
					if (var14 == 1) {
						field1157[field1156++] = var6;
					}
				} else if (var9 == 3) {
					field1264[field1263++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIZ)V")
	public final void method425(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method426() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IBIIII)V")
	public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1195.method186(arg0, arg2);
		field1196.method186(arg0 + arg1 - 16, arg2);
		class32.method149(field1031, 16, arg0 + 16, arg1 - 32, arg2);
		int var6 = (arg1 - 32) * arg1 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg4 / (arg3 - arg1);
		class32.method149(field1198, 16, arg0 + var7 + 16, var6, arg2);
		class32.method152(arg2, var6, arg0 + var7 + 16, field1320);
		class32.method152(arg2 + 1, var6, arg0 + var7 + 16, field1320);
		class32.method151(arg0 + var7 + 16, arg2, 16, field1320);
		class32.method151(arg0 + var7 + 17, arg2, 16, field1320);
		class32.method152(arg2 + 15, var6, arg0 + var7 + 16, field1085);
		class32.method152(arg2 + 14, var6 - 1, arg0 + var7 + 17, field1085);
		class32.method151(arg0 + var7 + var6 + 15, arg2, 16, field1085);
		class32.method151(arg0 + var7 + var6 + 14, arg2 + 1, 15, field1085);
	}

	@ObfuscatedName("client.w(I)V")
	public final void method428() {
		try {
			if (field982 != null) {
				field982.method29();
			}
		} catch (Exception var2) {
		}

		field982 = null;
		field1133 = false;
		field1301 = 0;
		field1322 = "";
		field1323 = "";
		class5.method35(false);
		method390();
		field998.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field983[var1].method295();
		}

		System.gc();
		method426();
		field1311 = null;
		field1078 = 0;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
			if (field1249 && field1315 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field998.method77(arg1, arg5, arg6);
			}

			if (arg2 == 1) {
				var8 = field998.method78(arg5, arg6, arg1);
			}

			if (arg2 == 2) {
				var8 = field998.method79(arg1, arg5, arg6);
			}

			if (arg2 == 3) {
				var8 = field998.method80(arg1, arg5, arg6);
			}

			if (var8 != 0) {
				int var12 = field998.method81(arg1, arg5, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field998.method72(arg5, arg6, arg1);
					class53 var16 = class53.method275(var13);
					if (var16.field709) {
						field983[arg1].method300(var14, var15, arg6, arg5, var16.field710);
					}
				}

				if (arg2 == 1) {
					field998.method73(arg6, arg5, arg1);
				}

				if (arg2 == 2) {
					field998.method74(arg6, arg5, arg1);
					class53 var17 = class53.method275(var13);
					if (var17.field707 + arg5 > 103 || var17.field707 + arg6 > 103 || var17.field708 + arg5 > 103 || var17.field708 + arg6 > 103) {
						return;
					}

					if (var17.field709) {
						field983[arg1].method301(var17.field707, var15, arg5, var17.field710, var17.field708, arg6);
					}
				}

				if (arg2 == 3) {
					field998.method75(arg1, arg6, arg5);
					class53 var18 = class53.method275(var13);
					if (var18.field709 && var18.field711) {
						field983[arg1].method303(arg6, arg5);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field1087[1][arg5][arg6] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				class3.method28(arg0, arg4, arg5, field980, arg1, var19, field983[arg1], arg3, arg6, field973, field998);
				return;
			}
		}
	}

	@ObfuscatedName("client.x(I)Z")
	public final boolean method430() {
		if (field982 == null) {
			return false;
		}

		try {
			int var1 = field982.method31();
			if (var1 == 0) {
				return false;
			}

			if (field1061 == -1) {
				field982.method32(field1242.field540, 0, 1);
				field1061 = field1242.field540[0] & 0xFF;
				if (field1293 != null) {
					field1061 = field1061 - field1293.method246() & 0xFF;
				}

				field1060 = class56.field804[field1061];
				var1--;
			}

			if (field1060 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field982.method32(field1242.field540, 0, 1);
				field1060 = field1242.field540[0] & 0xFF;
				var1--;
			}

			if (field1060 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field982.method32(field1242.field540, 0, 2);
				field1242.field541 = 0;
				field1060 = field1242.method211();
				var1 -= 2;
			}

			if (var1 < field1060) {
				return false;
			}

			field1242.field541 = 0;
			field982.method32(field1242.field540, 0, field1060);
			field1062 = 0;
			field1174 = field1173;
			field1173 = field1172;
			field1172 = field1061;

			if (field1061 == 128) {
				method467(field1060, field1242);
				field1061 = -1;
				return true;
			}

			if (field1061 == 107) {
				if (field1189 == 12) {
					field1104 = true;
				}

				field992 = field1242.method209();
				field1061 = -1;
				return true;
			}

			if (field1061 == 94) {
				field1104 = true;
				int var2 = field1242.method209();
				int var3 = field1242.method214();
				int var4 = field1242.method209();
				field1230[var2] = var3;
				field944[var2] = var4;
				field993[var2] = 1;
				for (int var5 = 0; var5 < 98; var5++) {
					if (var3 >= field1290[var5]) {
						field993[var2] = var5 + 2;
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 123) {
				field1104 = true;
				int var6 = field1242.method211();
				class60 var7 = class60.field830[var6];
				int var8 = field1242.method209();
				for (int var9 = 0; var9 < var8; var9++) {
					var7.field831[var9] = field1242.method211();
					int var10 = field1242.method209();
					if (var10 == 255) {
						var10 = field1242.method214();
					}

					var7.field832[var9] = var10;
				}

				for (int var11 = var8; var11 < var7.field831.length; var11++) {
					var7.field831[var11] = 0;
					var7.field832[var11] = 0;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 125) {
				field1082 = 0;
				field1061 = -1;
				return true;
			}

			if (field1061 == 240) {
				field1243 = true;
				field965 = field1242.method209();
				field966 = field1242.method209();
				field967 = field1242.method211();
				field968 = field1242.method209();
				field969 = field1242.method209();
				if (field969 >= 100) {
					int var12 = field965 * 128 + 64;
					int var13 = field966 * 128 + 64;
					int var14 = method488(field1315, field966, field965) - field967;
					int var15 = var12 - field1204;
					int var16 = var14 - field1205;
					int var17 = var13 - field1206;
					int var18 = (int) Math.sqrt(var15 * var15 + var17 * var17);
					field1207 = (int) (Math.atan2(var16, var18) * 325.949D) & 0x7FF;
					field1208 = (int) (Math.atan2(var15, var17) * -325.949D) & 0x7FF;

					if (field1207 < 128) {
						field1207 = 128;
					}

					if (field1207 > 383) {
						field1207 = 383;
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 48) {
				int var19 = field1242.method211();
				int var20 = field1242.method211();
				class54 var21 = class54.method281(var20);
				class60.field830[var19].field876 = var21.method284();
				field1061 = -1;
				return true;
			}

			if (field1061 == 216) {
				for (int var22 = 0; var22 < field1137.length; var22++) {
					if (field1137[var22] != field1129[var22]) {
						field1137[var22] = field1129[var22];
						method372(var22);
						field1104 = true;
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 3) {
				int var23 = field1242.method211();
				int var24 = field1242.method211();
				if (field1239 == var23 && field1240 == var24 && field1210 != 0) {
					field1061 = -1;
					return true;
				}

				field1239 = var23;
				field1240 = var24;
				field1161 = (field1239 - 6) * 8;
				field1162 = (field1240 - 6) * 8;
				field1210 = 1;
				field1015.method235();
				field1090.method188(0, "Loading - please wait.", 151, 257);
				field1090.method188(0xFFFFFF, "Loading - please wait.", 150, 256);
				field1015.method236(11, field8, 8);
				signlink.looprate(5);
				int var25 = (field1060 - 2) / 10;
				field1006 = new byte[var25][];
				field1292 = new byte[var25][];
				field1321 = new int[var25];
				field1214.method198(131);
				field1214.method199(0);
				int var26 = 0;
				for (int var27 = 0; var27 < var25; var27++) {
					int var28 = field1242.method209();
					int var29 = field1242.method209();
					int var30 = field1242.method214();
					int var31 = field1242.method214();
					field1321[var27] = (var28 << 8) + var29;

					if (var30 != 0) {
						byte[] var32 = signlink.cacheload("m" + var28 + "_" + var29);
						if (var32 != null) {
							field1105.reset();
							field1105.update(var32);

							if ((int) field1105.getValue() != var30) {
								var32 = null;
							}
						}

						if (var32 == null) {
							field1210 = 0;
							field1214.method199(0);
							field1214.method199(var28);
							field1214.method199(var29);
							var26 += 3;
						} else {
							field1006[var27] = var32;
						}
					}

					if (var31 != 0) {
						byte[] var33 = signlink.cacheload("l" + var28 + "_" + var29);
						if (var33 != null) {
							field1105.reset();
							field1105.update(var33);

							if ((int) field1105.getValue() != var31) {
								var33 = null;
							}
						}

						if (var33 == null) {
							field1210 = 0;
							field1214.method199(1);
							field1214.method199(var28);
							field1214.method199(var29);
							var26 += 3;
						} else {
							field1292[var27] = var33;
						}
					}
				}

				field1214.method208(var26);
				signlink.looprate(50);
				field1015.method235();

				if (field1210 == 0) {
					field1090.method188(0, "Map area updated since last visit, so load will take longer this time only", 166, 257);
					field1090.method188(0xFFFFFF, "Map area updated since last visit, so load will take longer this time only", 165, 256);
				}

				field1015.method236(11, field8, 8);
				int var34 = field1161 - field1163;
				int var35 = field1162 - field1164;
				field1163 = field1161;
				field1164 = field1162;

				for (int var36 = 0; var36 < 8192; var36++) {
					class25 var37 = field962[var36];
					if (var37 != null) {
						for (int var38 = 0; var38 < 10; var38++) {
							var37.field316[var38] -= var34;
							var37.field317[var38] -= var35;
						}

						var37.field268 -= var34 * 128;
						var37.field269 -= var35 * 128;
					}
				}

				for (int var39 = 0; var39 < field1151; var39++) {
					class26 var40 = field1153[var39];
					if (var40 != null) {
						for (int var41 = 0; var41 < 10; var41++) {
							var40.field316[var41] -= var34;
							var40.field317[var41] -= var35;
						}

						var40.field268 -= var34 * 128;
						var40.field269 -= var35 * 128;
					}
				}

				byte var42 = 0;
				byte var43 = 104;
				byte var44 = 1;
				if (var34 < 0) {
					var42 = 103;
					var43 = -1;
					var44 = -1;
				}

				byte var45 = 0;
				byte var46 = 104;
				byte var47 = 1;
				if (var35 < 0) {
					var45 = 103;
					var46 = -1;
					var47 = -1;
				}

				for (int var48 = var42; var48 != var43; var48 += var44) {
					for (int var49 = var45; var49 != var46; var49 += var47) {
						int var50 = var34 + var48;
						int var51 = var35 + var49;
						for (int var52 = 0; var52 < 4; var52++) {
							if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
								field1298[var52][var48][var49] = field1298[var52][var50][var51];
							} else {
								field1298[var52][var48][var49] = null;
							}
						}
					}
				}

				for (class38 var53 = (class38) field1245.method228(); var53 != null; var53 = (class38) field1245.method230()) {
					var53.field554 -= var34;
					var53.field555 -= var35;
					if (var53.field554 < 0 || var53.field555 < 0 || var53.field554 >= 104 || var53.field555 >= 104) {
						var53.method107();
					}
				}

				if (field1082 != 0) {
					field1082 -= var34;
					field1083 -= var35;
				}

				field1243 = false;
				field1061 = -1;
				return true;
			}

			if (field1061 == 147) {
				field1295 = field1242.method209();
				field1296 = field1242.method209();
				for (int var54 = field1295; var54 < field1295 + 8; var54++) {
					for (int var55 = field1296; var55 < field1296 + 8; var55++) {
						if (field1298[field1315][var54][var55] != null) {
							field1298[field1315][var54][var55] = null;
							method422(var54, var55);
						}
					}
				}

				for (class38 var56 = (class38) field1245.method228(); var56 != null; var56 = (class38) field1245.method230()) {
					if (var56.field554 >= field1295 && var56.field554 < field1295 + 8 && var56.field555 >= field1296 && var56.field555 < field1296 + 8 && field1315 == var56.field552) {
						method429(var56.field561, var56.field552, var56.field553, var56.field559, var56.field560, var56.field554, var56.field555);
						var56.method107();
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 60) {
				int var57 = field1242.method209();
				int var58 = field1242.method209();
				int var59 = -1;
				for (int var60 = 0; var60 < field1321.length; var60++) {
					if ((var57 << 8) + var58 == field1321[var60]) {
						var59 = var60;
					}
				}

				if (var59 != -1) {
					signlink.cachesave("l" + var57 + "_" + var58, field1292[var59]);
					field1210 = 1;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 171) {
				field972 = field1242.method214();
				field1319 = field1242.method211();
				field1086 = field1242.method209();
				field1140 = field1242.method211();

				if (field972 != 0 && field1265 == -1) {
					signlink.dnslookup(class48.method254(field972));
					method472();
					short var61 = 650;
					if (field1086 != 201) {
						var61 = 655;
					}

					field1110 = "";
					field1047 = false;

					for (int var62 = 0; var62 < class60.field830.length; var62++) {
						if (class60.field830[var62] != null && class60.field830[var62].field839 == var61) {
							field1265 = class60.field830[var62].field836;
							break;
						}
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 132) {
				class5.method35(true);
				field1061 = -1;
				return true;
			}

			if (field1061 == 191) {
				int var63 = field1242.method211();
				int var64 = field1242.method212();
				int var65 = field1242.method212();
				class60 var66 = class60.field830[var63];
				var66.field842 = var64;
				var66.field843 = var65;
				field1061 = -1;
				return true;
			}

			if (field1061 == 202) {
				int var67 = field1242.method211();
				int var68 = field1242.method209();
				int var69 = field1242.method211();
				if (field1051 && !field1249 && field1109 < 50) {
					field1053[field1109] = var67;
					field954[field1109] = var68;
					field1309[field1109] = class51.field665[var67] + var69;
					field1109++;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 80) {
				int var70 = field1242.method211();
				int var71 = field1242.method211();
				class60.field830[var70].field878 = var71;
				field1061 = -1;
				return true;
			}

			if (field1061 == 180) {
				int var72 = field1242.method211();
				method457(var72);

				if (field1194 != -1) {
					field1194 = -1;
					field1104 = true;
					field1211 = true;
				}

				if (field942 != -1) {
					field942 = -1;
					field1181 = true;
				}

				if (field1299) {
					field1299 = false;
					field1181 = true;
				}

				field1265 = var72;
				field1150 = false;
				field1061 = -1;
				return true;
			}

			if (field1061 == 212) {
				int var73 = field1242.method211();
				int var74 = field1242.method211();
				int var75 = var74 >> 10 & 0x1F;
				int var76 = var74 >> 5 & 0x1F;
				int var77 = var74 & 0x1F;
				class60.field830[var73].field871 = (var77 << 3) + (var75 << 19) + (var76 << 11);
				field1061 = -1;
				return true;
			}

			if (field1061 == 57) {
				if (field1189 == 12) {
					field1104 = true;
				}

				field956 = field1242.method212();
				field1061 = -1;
				return true;
			}

			if (field1061 == 113) {
				field1209 = field1060 / 8;
				for (int var78 = 0; var78 < field1209; var78++) {
					field1304[var78] = field1242.method215();
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 250) {
				field1295 = field1242.method209();
				field1296 = field1242.method209();
				field1061 = -1;
				return true;
			}

			if (field1061 == 255) {
				if (field1194 != -1) {
					field1194 = -1;
					field1104 = true;
					field1211 = true;
				}

				if (field942 != -1) {
					field942 = -1;
					field1181 = true;
				}

				if (field1299) {
					field1299 = false;
					field1181 = true;
				}

				field1265 = -1;
				field1150 = false;
				field1061 = -1;
				return true;
			}

			if (field1061 == 66) {
				int var79 = field1242.method209();
				int var80 = field1242.method209();
				int var81 = field1242.method211();
				int var82 = field1242.method211();
				int var83 = -1;
				for (int var84 = 0; var84 < field1321.length; var84++) {
					if ((var79 << 8) + var80 == field1321[var84]) {
						var83 = var84;
					}
				}

				if (var83 != -1) {
					if (field1006[var83] == null || field1006[var83].length != var82) {
						field1006[var83] = new byte[var82];
					}

					field1242.method218(var81, field1006[var83], field1060 - 6);
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 71) {
				int var85 = field1242.method209();
				int var86 = field1242.method209();
				int var87 = field1242.method209();
				int var88 = field1242.method209();
				field1250[var85] = true;
				field1131[var85] = var86;
				field957[var85] = var87;
				field1291[var85] = var88;
				field953[var85] = 0;
				field1061 = -1;
				return true;
			}

			if (field1061 == 231) {
				int var89 = field1242.method211();
				int var90 = field1242.method211();

				if (field942 != -1) {
					field942 = -1;
					field1181 = true;
				}

				if (field1299) {
					field1299 = false;
					field1181 = true;
				}

				field1265 = var89;
				field1194 = var90;
				field1104 = true;
				field1211 = true;
				field1150 = false;
				field1061 = -1;
				return true;
			}

			if (field1061 == 254) {
				field1136 = false;
				field1299 = true;
				field1312 = "";
				field1181 = true;
				field1061 = -1;
				return true;
			}

			if (field1061 == 38) {
				field1104 = true;
				int var91 = field1242.method211();
				class60 var92 = class60.field830[var91];
				while (field1242.field541 < field1060) {
					int var93 = field1242.method209();
					int var94 = field1242.method211();
					int var95 = field1242.method209();
					if (var95 == 255) {
						var95 = field1242.method214();
					}

					if (var93 >= 0 && var93 < var92.field831.length) {
						var92.field831[var93] = var94;
						var92.field832[var93] = var95;
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 35) {
				int var96 = field1242.method209();
				int var97 = field1242.method209();
				int var98 = field1242.method211();
				int var99 = field1242.method211();
				int var100 = -1;
				for (int var101 = 0; var101 < field1321.length; var101++) {
					if ((var96 << 8) + var97 == field1321[var101]) {
						var100 = var101;
					}
				}

				if (var100 != -1) {
					if (field1292[var100] == null || field1292[var100].length != var99) {
						field1292[var100] = new byte[var99];
					}

					field1242.method218(var98, field1292[var100], field1060 - 6);
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 165) {
				int var102 = field1242.method212();
				field1046 = var102;
				field1181 = true;
				field1061 = -1;
				return true;
			}

			if (field1061 == 192) {
				field1295 = field1242.method209();
				field1296 = field1242.method209();

				while (field1242.field541 < field1060) {
					int var103 = field1242.method209();
					method394(field1242, var103);
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 47) {
				field1243 = false;

				for (int var104 = 0; var104 < 5; var104++) {
					field1250[var104] = false;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 213) {
				field981 = field1242.method209();
				field1035 = field1242.method209();
				field1192 = field1242.method209();
				field1077 = true;
				field1181 = true;
				field1061 = -1;
				return true;
			}

			if (field1061 == 169) {
				int var105 = field1242.method211();
				class60.field830[var105].field876 = field1171.method115();
				field1061 = -1;
				return true;
			}

			if (field1061 == 133) {
				int var106 = field1242.method211();
				byte var107 = field1242.method210();
				field1129[var106] = var107;

				if (field1137[var106] != var107) {
					field1137[var106] = var107;
					method372(var106);
					field1104 = true;

					if (field1046 != -1) {
						field1181 = true;
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 92) {
				String var108 = field1242.method216();
				int var109 = field1242.method214();
				int var110 = field1242.method214();
				if (!var108.equals(field1311) && field1005 && !field1249) {
					method471(var110, var108, var109);
				}

				field1311 = var108;
				field1054 = var109;
				field1331 = var110;
				field1078 = 0;
				field1061 = -1;
				return true;
			}

			if (field1061 == 218) {
				int var111 = field1242.method211();
				boolean var112 = field1242.method209() == 1;
				class60.field830[var111].field850 = var112;
				field1061 = -1;
				return true;
			}

			if (field1061 == 72) {
				field1027 = field1242.method209();
				field1061 = -1;
				return true;
			}

			if (field1061 == 186) {
				int var113 = field1242.method211();
				class60 var114 = class60.field830[var113];
				for (int var115 = 0; var115 < var114.field831.length; var115++) {
					var114.field831[var115] = -1;
					var114.field831[var115] = 0;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 177) {
				field995 = field1242.method211();
				field1061 = -1;
				return true;
			}

			if (field1061 == 85) {
				field1189 = field1242.method209();
				field1104 = true;
				field1211 = true;
				field1061 = -1;
				return true;
			}

			if (field1061 == 42) {
				field1075 = field1242.method209();
				if (field1075 == 1) {
					field946 = field1242.method211();
				}

				if (field1075 >= 2 && field1075 <= 6) {
					if (field1075 == 2) {
						field1270 = 64;
						field1271 = 64;
					}

					if (field1075 == 3) {
						field1270 = 0;
						field1271 = 64;
					}

					if (field1075 == 4) {
						field1270 = 128;
						field1271 = 64;
					}

					if (field1075 == 5) {
						field1270 = 64;
						field1271 = 0;
					}

					if (field1075 == 6) {
						field1270 = 64;
						field1271 = 128;
					}

					field1075 = 2;
					field1267 = field1242.method211();
					field1268 = field1242.method211();
					field1269 = field1242.method209();
				}

				if (field1075 == 10) {
					field1215 = field1242.method211();
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 100) {
				int var116 = field1242.method211();
				int var117 = field1242.method209();

				if (var116 == 0xFFFF) {
					var116 = -1;
				}

				field1132[var117] = var116;
				field1104 = true;
				field1211 = true;
				field1061 = -1;
				return true;
			}

			if (field1061 == 140) {
				long var118 = field1242.method215();
				int var120 = field1242.method209();
				String var121 = class48.method255(class48.method252(var118));
				for (int var122 = 0; var122 < field1300; var122++) {
					if (field1183[var122] == var118) {
						if (field1197[var122] != var120) {
							field1197[var122] = var120;
							field1104 = true;

							if (var120 > 0) {
								method431(var121 + " has logged in.", "", 5);
							}

							if (var120 == 0) {
								method431(var121 + " has logged out.", "", 5);
							}
						}

						var121 = null;
						break;
					}
				}

				if (var121 != null && field1300 < 100) {
					field1183[field1300] = var118;
					field1128[field1300] = var121;
					field1197[field1300] = var120;
					field1300++;
					field1104 = true;
				}

				boolean var123 = false;
				while (!var123) {
					var123 = true;
					for (int var124 = 0; var124 < field1300 - 1; var124++) {
						if (field1197[var124] != field1246 && field1197[var124 + 1] == field1246 || field1197[var124] == 0 && field1197[var124 + 1] != 0) {
							int var125 = field1197[var124];
							field1197[var124] = field1197[var124 + 1];
							field1197[var124 + 1] = var125;
							String var126 = field1128[var124];
							field1128[var124] = field1128[var124 + 1];
							field1128[var124 + 1] = var126;
							long var127 = field1183[var124];
							field1183[var124] = field1183[var124 + 1];
							field1183[var124 + 1] = var127;
							field1104 = true;
							var123 = false;
						}
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 248) {
				int var129 = field1242.method211();
				int var130 = field1242.method211();
				class60.field830[var129].field876 = new class31(var130);
				field1061 = -1;
				return true;
			}

			if (field1061 == 201) {
				long var131 = field1242.method215();
				int var133 = field1242.method214();
				int var134 = field1242.method209();
				boolean var135 = false;
				for (int var136 = 0; var136 < 100; var136++) {
					if (field1314[var136] == var133) {
						var135 = true;
						break;
					}
				}

				if (var134 <= 1) {
					for (int var137 = 0; var137 < field1209; var137++) {
						if (field1304[var137] == var131) {
							var135 = true;
							break;
						}
					}
				}

				if (!var135 && field1182 == 0) {
					try {
						field1314[field1028] = var133;
						field1028 = (field1028 + 1) % 100;
						String var138 = class49.method258(field1242, field1060 - 13);
						var138 = class65.method335(var138);
						if (var134 > 1) {
							method431(var138, class48.method255(class48.method252(var131)), 7);
						} else {
							method431(var138, class48.method255(class48.method252(var131)), 3);
						}
					} catch (Exception var179) {
						signlink.reporterror("cde1");
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 230) {
				if (field1005 && !field1249) {
					int var140 = field1242.method211();
					int var141 = field1242.method214();
					int var142 = field1060 - 6;
					byte[] var143 = new byte[var141];
					class44.method238(var143, var141, field1242.field540, var142, field1242.field541);
					method418(var143, var141, false);
					field1078 = var140;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 112) {
				String var144 = field1242.method216();
				if (var144.endsWith(":tradereq:")) {
					String var145 = var144.substring(0, var144.indexOf(":"));
					long var146 = class48.method251(var145);
					boolean var148 = false;
					for (int var149 = 0; var149 < field1209; var149++) {
						if (field1304[var149] == var146) {
							var148 = true;
							break;
						}
					}

					if (!var148 && field1182 == 0) {
						method431("wishes to trade with you.", var145, 4);
					}
				} else if (var144.endsWith(":duelreq:")) {
					String var150 = var144.substring(0, var144.indexOf(":"));
					long var151 = class48.method251(var150);
					boolean var153 = false;
					for (int var154 = 0; var154 < field1209; var154++) {
						if (field1304[var154] == var151) {
							var153 = true;
							break;
						}
					}

					if (!var153 && field1182 == 0) {
						method431("wishes to duel with you.", var150, 8);
					}
				} else {
					method431(var144, "", 0);
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 174) {
				field1243 = true;
				field1233 = field1242.method209();
				field1234 = field1242.method209();
				field1235 = field1242.method211();
				field1236 = field1242.method209();
				field1237 = field1242.method209();
				if (field1237 >= 100) {
					field1204 = field1233 * 128 + 64;
					field1206 = field1234 * 128 + 64;
					field1205 = method488(field1315, field1234, field1233) - field1235;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 117 || field1061 == 25 || field1061 == 127 || field1061 == 195 || field1061 == 1 || field1061 == 61 || field1061 == 246 || field1061 == 78 || field1061 == 214 || field1061 == 220) {
				method394(field1242, field1061);
				field1061 = -1;
				return true;
			}

			if (field1061 == 235) {
				int var155 = field1242.method211();
				int var156 = field1242.method214();
				field1129[var155] = var156;

				if (field1137[var155] != var156) {
					field1137[var155] = var156;
					method372(var155);
					field1104 = true;

					if (field1046 != -1) {
						field1181 = true;
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 49) {
				method417(field1060, field1242);

				if (field1210 == 1) {
					field1210 = 2;
					class3.field26 = field1315;
					method414();
				}

				if (field1249 && field1210 == 2 && class3.field26 != field1315) {
					field1015.method235();
					field1090.method188(0, "Loading - please wait.", 151, 257);
					field1090.method188(0xFFFFFF, "Loading - please wait.", 150, 256);
					field1015.method236(11, field8, 8);
					class3.field26 = field1315;
					method414();
				}

				if (field1315 != field1071 && field1210 == 2) {
					field1071 = field1315;
					method365(field1315);
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 176) {
				int var157 = field1242.method211();
				String var158 = field1242.method216();
				class60.field830[var157].field869 = var158;

				if (field1132[field1189] == class60.field830[var157].field836) {
					field1104 = true;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 39) {
				method428();
				field1061 = -1;
				return false;
			}

			if (field1061 == 12) {
				int var159 = field1242.method209();
				int var160 = field1242.method209();
				int var161 = -1;
				for (int var162 = 0; var162 < field1321.length; var162++) {
					if ((var159 << 8) + var160 == field1321[var162]) {
						var161 = var162;
					}
				}

				if (var161 != -1) {
					signlink.cachesave("m" + var159 + "_" + var160, field1006[var161]);
					field1210 = 1;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 98) {
				field1106 = field1242.method209();
				if (field1189 == field1106) {
					if (field1106 == 3) {
						field1189 = 1;
					} else {
						field1189 = 3;
					}

					field1104 = true;
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 68) {
				class5.method34();
				field1061 = -1;
				return true;
			}

			if (field1061 == 242) {
				field974 = field1242.method211() * 30;
				field1061 = -1;
				return true;
			}

			if (field1061 == 55) {
				for (int var163 = 0; var163 < field1153.length; var163++) {
					if (field1153[var163] != null) {
						field1153[var163].field295 = -1;
					}
				}

				for (int var164 = 0; var164 < field962.length; var164++) {
					if (field962[var164] != null) {
						field962[var164].field295 = -1;
					}
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 253) {
				int var165 = field1242.method211();
				int var166 = field1242.method211();
				int var167 = field1242.method211();
				class60 var168 = class60.field830[var165];
				class31 var169 = var168.field876;
				if (var169 != null) {
					var169.method133(var166, var167);
				}

				field1061 = -1;
				return true;
			}

			if (field1061 == 33) {
				int var170 = field1242.method211();
				int var171 = field1242.method211();
				int var172 = field1242.method211();
				class55 var173 = class55.method287(var171);
				class60.field830[var170].field876 = var173.method291(50);
				class60.field830[var170].field881 = var173.field776;
				class60.field830[var170].field882 = var173.field777;
				class60.field830[var170].field880 = var173.field775 * 100 / var172;
				field1061 = -1;
				return true;
			}

			if (field1061 == 153) {
				int var174 = field1242.method211();
				method457(var174);

				if (field942 != -1) {
					field942 = -1;
					field1181 = true;
				}

				if (field1299) {
					field1299 = false;
					field1181 = true;
				}

				field1194 = var174;
				field1104 = true;
				field1211 = true;
				field1265 = -1;
				field1150 = false;
				field1061 = -1;
				return true;
			}

			if (field1061 == 106) {
				int var175 = field1242.method211();
				method457(var175);

				if (field1194 != -1) {
					field1194 = -1;
					field1104 = true;
					field1211 = true;
				}

				field942 = var175;
				field1181 = true;
				field1265 = -1;
				field1150 = false;
				field1061 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1061 + "," + field1060 + " - " + field1173 + "," + field1174);
			method428();
		} catch (IOException var180) {
			method442();
		} catch (Exception var181) {
			String var177 = "T2 - " + field1061 + "," + field1173 + "," + field1174 + " - " + field1060 + "," + (field1171.field316[0] + field1161) + "," + (field1171.field317[0] + field1162) + " - ";
			for (int var178 = 0; var178 < field1060 && var178 < 50; var178++) {
				var177 = var177 + field1242.field540[var178] + ",";
			}

			signlink.reporterror(var177);
			method428();
		}

		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method431(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1046 != -1) {
			field1032 = arg0;
			field17 = 0;
		}

		if (field942 == -1) {
			field1181 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1145[var4] = field1145[var4 - 1];
			field1146[var4] = field1146[var4 - 1];
			field1147[var4] = field1147[var4 - 1];
		}

		field1145[0] = arg2;
		field1146[0] = arg1;
		field1147[0] = arg0;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method432() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1244) {
			field1318 = false;
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

		if (field1072) {
			field1318 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1029) {
			field1318 = false;
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

	@ObfuscatedName("client.g(Z)V")
	public final void method433() {
		if (field1079 != 0) {
			class36 var1 = field1090;
			int var2 = 0;
			if (field974 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1147[var3] != null) {
					int var4 = field1145[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1035 == 0 || field1035 == 1 && method437(field1146[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method191(4, var5, "From " + field1146[var3] + ": " + field1147[var3], 0);
						var1.method191(4, var5 - 1, "From " + field1146[var3] + ": " + field1147[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1035 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method191(4, var6, field1147[var3], 0);
						var1.method191(4, var6 - 1, field1147[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1035 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method191(4, var7, "To " + field1146[var3] + ": " + field1147[var3], 0);
						var1.method191(4, var7 - 1, "To " + field1146[var3] + ": " + field1147[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZILkb;)V")
	public final void method434(int arg0, class37 arg1) {
		arg1.method219();
		int var3 = arg1.method220(8);
		if (var3 < field963) {
			for (int var4 = var3; var4 < field963; var4++) {
				field1264[field1263++] = field964[var4];
			}
		}

		if (var3 > field963) {
			signlink.reporterror(field1322 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field963 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field964[var5];
			class25 var7 = field962[var6];
			int var8 = arg1.method220(1);
			if (var8 == 0) {
				field964[field963++] = var6;
				var7.field312 = field1134;
			} else {
				int var9 = arg1.method220(2);
				if (var9 == 0) {
					field964[field963++] = var6;
					var7.field312 = field1134;
					field1157[field1156++] = var6;
				} else if (var9 == 1) {
					field964[field963++] = var6;
					var7.field312 = field1134;
					int var10 = arg1.method220(3);
					var7.method110(false, var10);
					int var11 = arg1.method220(1);
					if (var11 == 1) {
						field1157[field1156++] = var6;
					}
				} else if (var9 == 2) {
					field964[field963++] = var6;
					var7.field312 = field1134;
					int var12 = arg1.method220(3);
					var7.method110(true, var12);
					int var13 = arg1.method220(3);
					var7.method110(true, var13);
					int var14 = arg1.method220(1);
					if (var14 == 1) {
						field1157[field1156++] = var6;
					}
				} else if (var9 == 3) {
					field1264[field1263++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILkb;)V")
	public final void method435(int arg0, class37 arg1) {
		while (arg1.field542 + 21 < arg0 * 8) {
			int var3 = arg1.method220(13);
			if (var3 == 8191) {
				break;
			}

			if (field962[var3] == null) {
				field962[var3] = new class25();
			}

			class25 var4 = field962[var3];
			field964[field963++] = var3;
			var4.field312 = field1134;
			var4.field320 = class54.method281(arg1.method220(11));
			var4.field272 = var4.field320.field743;
			var4.field275 = var4.field320.field747;
			var4.field276 = var4.field320.field748;
			var4.field277 = var4.field320.field749;
			var4.field278 = var4.field320.field750;
			var4.field273 = var4.field320.field746;
			int var5 = arg1.method220(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method220(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method109(field1171.field316[0] + var5, false, field1171.field317[0] + var6);
			int var7 = arg1.method220(1);
			if (var7 == 1) {
				field1157[field1156++] = var3;
			}
		}

		arg1.method221();
	}

	@ObfuscatedName("client.y(I)V")
	public final void method436() {
		for (int var1 = -1; var1 < field1154; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1152;
			} else {
				var2 = field1155[var1];
			}

			class26 var3 = field1153[var2];
			if (var3 != null) {
				method475(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method437(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1300; var2++) {
			if (arg0.equalsIgnoreCase(field1128[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1171.field321)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method438() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field990 + field1008 & 0x7FF;
				int var4 = class33.field501[var3];
				int var5 = class33.field502[var3];
				var4 = (field1329 + 256) * var4 >> 8;
				var5 = (field1329 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1171.field268 + var6 >> 7;
				int var9 = field1171.field269 - var7 >> 7;
				boolean var10 = method381(true, 0, field1171.field317[0], 0, var8, 0, 1, 0, 0, field1171.field316[0], var9);
				if (var10) {
					field1214.method199(var1);
					field1214.method199(var2);
					field1214.method200(field1008);
					field1214.method199(57);
					field1214.method199(field990);
					field1214.method199(field1329);
					field1214.method199(89);
					field1214.method200(field1171.field268);
					field1214.method200(field1171.field269);
					field1214.method199(field1212);
					field1214.method199(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method439() {
		if (field1301 == 0) {
			int var1 = field6 / 2;
			int var2 = field7 / 2 + 90;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1216 = "";
				field1217 = "Enter your username & password.";
				field1301 = 2;
				field1068 = 0;
			}
		} else if (field1301 == 2) {
			int var3 = field7 / 2 - 30;
			var3 += 30;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1068 = 0;
			}

			var3 += 15;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1068 = 1;
			}

			var3 += 15;
			int var4 = field6 / 2 - 80;
			int var5 = field7 / 2 + 60;
			if (field17 == 1 && field18 >= var4 - 75 && field18 <= var4 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				method469(field1322, field1323, false);
			}

			int var6 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var6 - 75 && field18 <= var6 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				field1301 = 0;
				field1322 = "";
				field1323 = "";
			}

			while (true) {
				int var7;
				boolean var8;
				var7 = method5();
				if (var7 == -1) {
					return;
				}

				var8 = false;
				for (int var9 = 0; var9 < field1297.length(); var9++) {
					if (var7 == field1297.charAt(var9)) {
						var8 = true;
						break;
					}
				}

				if (field1068 == 0) {
					if (var7 == 8 && field1322.length() > 0) {
						field1322 = field1322.substring(0, field1322.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1068 = 1;
					}

					if (var8) {
						field1322 = field1322 + (char) var7;
					}

					if (field1322.length() > 12) {
						field1322 = field1322.substring(0, 12);
					}
				} else if (field1068 == 1) {
					if (var7 == 8 && field1323.length() > 0) {
						field1323 = field1323.substring(0, field1323.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1068 = 0;
					}

					if (var8) {
						field1323 = field1323 + (char) var7;
					}

					if (field1323.length() > 20) {
						field1323 = field1323.substring(0, 20);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)I")
	public final int method440() {
		int var1 = 3;
		if (field1207 < 310) {
			int var2 = field1204 >> 7;
			int var3 = field1206 >> 7;
			int var4 = field1171.field268 >> 7;
			int var5 = field1171.field269 >> 7;

			if ((field1087[field1315][var2][var3] & 0x4) != 0) {
				var1 = field1315;
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

					if ((field1087[field1315][var2][var3] & 0x4) != 0) {
						var1 = field1315;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1087[field1315][var2][var3] & 0x4) != 0) {
							var1 = field1315;
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

					if ((field1087[field1315][var2][var3] & 0x4) != 0) {
						var1 = field1315;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1087[field1315][var2][var3] & 0x4) != 0) {
							var1 = field1315;
						}
					}
				}
			}
		}

		if ((field1087[field1315][field1171.field268 >> 7][field1171.field269 >> 7] & 0x4) != 0) {
			var1 = field1315;
		}

		return var1;
	}

	@ObfuscatedName("client.j(B)I")
	public final int method441() {
		int var1 = method488(field1315, field1206, field1204);
		if (var1 - field1205 < 800 && (field1087[field1315][field1204 >> 7][field1206 >> 7] & 0x4) != 0) {
			return field1315;
		}

		return 3;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method442() {
		if (field1064 > 0) {
			method428();
		} else {
			field1015.method235();
			field1090.method188(0, "Connection lost", 144, 257);
			field1090.method188(0xFFFFFF, "Connection lost", 143, 256);
			field1090.method188(0, "Please wait - attempting to reestablish", 159, 257);
			field1090.method188(0xFFFFFF, "Please wait - attempting to reestablish", 158, 256);
			field1015.method236(11, field8, 8);
			field1082 = 0;
			class4 var1 = field982;
			field1133 = false;
			method469(field1322, field1323, true);

			if (!field1133) {
				method428();
			}

			try {
				var1.method29();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method443(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 >> 14 & 0x7FFF;
		int var6 = field998.method81(field1315, arg0, arg3, arg2);
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
				var10 = var9.field707;
				var11 = var9.field708;
			} else {
				var10 = var9.field708;
				var11 = var9.field707;
			}

			int var12 = var9.field731;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method381(false, var10, field1171.field317[0], var11, arg0, var12, 2, 0, 0, field1171.field316[0], arg3);
		} else {
			method381(false, 0, field1171.field317[0], 0, arg0, 0, 2, var7 + 1, var8, field1171.field316[0], arg3);
		}

		field1116 = field18;
		field1117 = field19;
		field1119 = 2;
		field1118 = 0;
		field1214.method198(arg1);
		field1214.method200(field1161 + arg0);
		field1214.method200(field1162 + arg3);
		field1214.method200(var5);
		return true;
	}

	@ObfuscatedName("client.a(IIIZIII)V")
	public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
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

		field1204 = arg4 - var9;
		field1205 = arg2 - var10;
		field1206 = arg5 - var11;
		field1207 = arg0;
		field1208 = arg3;
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method445(int arg0, int arg1) {
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

	@ObfuscatedName("client.k(B)V")
	public final void method446() {
		if (field974 > 1) {
			field974--;
		}

		if (field1064 > 0) {
			field1064--;
		}

		for (int var1 = 0; var1 < 5 && method430(); var1++) {
		}

		if (field1133) {
			for (int var2 = 0; var2 < field1109; var2++) {
				if (field1309[var2] <= 0) {
					boolean var3 = false;
					try {
						if (field1053[var2] != field1160 || field954[var2] != field1303) {
							class37 var4 = class51.method264(field954[var2], field1053[var2]);
							if (System.currentTimeMillis() + var4.field541 / 22 > field1257 / 22 + field1266) {
								field1257 = var4.field541;
								field1266 = System.currentTimeMillis();

								if (method384(var4.field540, var4.field541)) {
									field1160 = field1053[var2];
									field1303 = field954[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!method385()) {
							var3 = true;
						}
					} catch (Exception var20) {
					}

					if (var3 && field1309[var2] != -5) {
						field1309[var2] = -5;
					} else {
						field1109--;
						for (int var6 = var2; var6 < field1109; var6++) {
							field1053[var6] = field1053[var6 + 1];
							field954[var6] = field954[var6 + 1];
							field1309[var6] = field1309[var6 + 1];
						}

						var2--;
					}
				} else {
					field1309[var2]--;
				}
			}

			if (field1078 > 0) {
				field1078 -= 20;
				if (field1078 < 0) {
					field1078 = 0;
				}

				if (field1078 == 0 && field1005 && !field1249) {
					method471(field1331, field1311, field1054);
				}
			}

			if (class5.field58) {
				class37 var7 = class5.method36();
				if (var7 != null) {
					field1214.method198(53);
					field1214.method200(var7.field541);
					field1214.method207(var7.field540, 0, var7.field541);
					var7.method197();
				}
			}

			field1062++;
			if (field1062 > 750) {
				method442();
			}

			method436();
			method474();
			method415();
			method408();

			if ((field20[1] == 1 || field20[2] == 1 || field20[3] == 1 || field20[4] == 1) && field1170++ > 5) {
				field1170 = 0;
				field1214.method198(109);
				field1214.method200(field1007);
				field1214.method200(field1008);
				field1214.method199(field990);
				field1214.method199(field1329);
			}

			field1103++;

			if (field1119 != 0) {
				field1118 += 20;
				if (field1118 >= 400) {
					field1119 = 0;
				}
			}

			if (field1058 != 0) {
				field1055++;
				if (field1055 >= 15) {
					if (field1058 == 2) {
						field1104 = true;
					}

					if (field1058 == 3) {
						field1181 = true;
					}

					field1058 = 0;
				}
			}

			if (field1326 != 0) {
				field1188++;

				if (field15 > field1327 + 5 || field15 < field1327 - 5 || field16 > field1328 + 5 || field16 < field1328 - 5) {
					field1310 = true;
				}

				if (field14 == 0) {
					if (field1326 == 2) {
						field1104 = true;
					}

					if (field1326 == 3) {
						field1181 = true;
					}

					field1326 = 0;

					if (field1310 && field1188 >= 5) {
						field1308 = -1;
						method370();

						if (field1324 == field1308 && field1325 != field1307) {
							class60 var8 = class60.field830[field1324];
							int var9 = var8.field831[field1307];
							var8.field831[field1307] = var8.field831[field1325];
							var8.field831[field1325] = var9;
							int var10 = var8.field832[field1307];
							var8.field832[field1307] = var8.field832[field1325];
							var8.field832[field1325] = var10;
							field1214.method198(80);
							field1214.method200(field1324);
							field1214.method200(field1325);
							field1214.method200(field1307);
						}
					} else if ((field996 == 1 || method461(field997 - 1)) && field997 > 2) {
						method410();
					} else if (field997 > 0) {
						method466(field997 - 1);
					}

					field1055 = 10;
					field17 = 0;
				}
			}

			if (class18.field228 != -1) {
				int var11 = class18.field228;
				int var12 = class18.field229;
				boolean var13 = method381(true, 0, field1171.field317[0], 0, var11, 0, 0, 0, 0, field1171.field316[0], var12);
				class18.field228 = -1;

				if (var13) {
					field1116 = field18;
					field1117 = field19;
					field1119 = 1;
					field1118 = 0;
				}
			}

			if (field17 == 1 && field1032 != null) {
				field1032 = null;
				field1181 = true;
				field17 = 0;
			}

			method452();
			method438();
			method382();
			method379();

			if (field14 == 1 || field17 == 1) {
				field1302++;
			}

			if (field1210 == 2) {
				method458();
			}

			if (field1210 == 2 && field1243) {
				method395();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				field953[var14]++;
			}

			method404();
			field947++;
			if (field947 > 54) {
				field947 = 0;
				field1214.method198(180);
			}

			field13++;
			if (field13 > 4500) {
				field1064 = 250;
				field13 -= 500;
				field1214.method198(161);
			}

			field1093++;
			if (field1093 > 500) {
				field1093 = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					field975 += field976;
				}

				if ((var15 & 0x2) == 2) {
					field948 += field949;
				}

				if ((var15 & 0x4) == 4) {
					field1184 += field1185;
				}
			}

			if (field975 < -50) {
				field976 = 2;
			}

			if (field975 > 50) {
				field976 = -2;
			}

			if (field948 < -55) {
				field949 = 2;
			}

			if (field948 > 55) {
				field949 = -2;
			}

			if (field1184 < -40) {
				field1185 = 1;
			}

			if (field1184 > 40) {
				field1185 = -1;
			}

			field1098++;
			if (field1098 > 500) {
				field1098 = 0;
				int var16 = (int) (Math.random() * 8.0D);
				if ((var16 & 0x1) == 1) {
					field990 += field991;
				}

				if ((var16 & 0x2) == 2) {
					field1329 += field1330;
				}
			}

			if (field990 < -60) {
				field991 = 2;
			}

			if (field990 > 60) {
				field991 = -2;
			}

			if (field1329 < -20) {
				field1330 = 1;
			}

			if (field1329 > 10) {
				field1330 = -1;
			}

			field1063++;
			if (field1063 > 50) {
				field1214.method198(126);
			}

			try {
				if (field982 != null && field1214.field541 > 0) {
					field982.method33(field1214.field540, field1214.field541, 0);
					field1214.field541 = 0;
					field1063 = 0;
				}
			} catch (IOException var18) {
				method442();
			} catch (Exception var19) {
				method428();
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method447() {
		for (class28 var1 = (class28) field1334.method228(); var1 != null; var1 = (class28) field1334.method230()) {
			if (field1315 != var1.field368 || var1.field374) {
				var1.method107();
			} else if (field1134 >= var1.field367) {
				var1.method118(field1103);

				if (var1.field374) {
					var1.method107();
				} else {
					field998.method61(-1, var1.field371, var1, null, var1.field370, false, var1.field368, 0, var1.field369, 60);
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZILkb;)V")
	public final void method448(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field1156; var3++) {
			int var4 = field1157[var3];
			class26 var5 = field1153[var4];
			int var6 = arg1.method209();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method209() << 8;
			}

			method473(arg1, var4, var5, var6);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BIILjava/lang/String;)Lub;")
	public final class47 method449(String arg0, int arg1, int arg2, String arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg3);
		if (var6 != null) {
			field1105.reset();
			field1105.update(var6);
			int var7 = (int) field1105.getValue();
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
				DataInputStream var10 = method363(arg3 + arg2);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				class37 var12 = new class37(var11);
				var12.field541 = 3;
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

	@ObfuscatedName("client.D(I)V")
	public final void method450() {
		int var1 = (field1171.field268 >> 7) + field1161;
		int var2 = (field1171.field269 >> 7) + field1162;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1049 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1049 = (var2 - 9920) / 8 + 1;
		} else {
			field1049 = 0;
		}

		field1127 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1127 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1127 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1127 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1127 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1127 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1127 = 1;
			}
		}

		if (field1127 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1127 = 2;
		}

		field1182 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1182 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1182 = 1;
		}

		if (field1182 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1182 = 0;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method451() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1288[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1288[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1289[var10] = (field1288[var10 - 1] + field1288[var10 + 1] + field1288[var10 - 128] + field1288[var10 + 128]) / 4;
			}
		}

		field1139 += 128;
		if (field1139 > field1281.length) {
			field1139 -= field1281.length;
			int var11 = (int) (Math.random() * 12.0D);
			method455(field952[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1289[var14 + 128] - field1281[field1139 + var14 & field1281.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1288[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1149[var16] = field1149[var16 + 1];
		}

		field1149[var1 - 1] = (int) (Math.sin(field1134 / 14.0D) * 16.0D + Math.sin(field1134 / 15.0D) * 14.0D + Math.sin(field1134 / 16.0D) * 12.0D);

		if (field1272 > 0) {
			field1272 -= 4;
		}

		if (field1273 > 0) {
			field1273 -= 4;
		}

		if (field1272 == 0 && field1273 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1272 = 1024;
			}

			if (var17 == 1) {
				field1273 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method452() {
		if (field1326 == 0) {
			int var1 = field17;
			if (field1252 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field943) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field1276 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1276 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field1276 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field1277 - 10 || var2 > field1279 + field1277 + 10 || var3 < field1278 - 10 || var3 > field1280 + field1278 + 10) {
						field943 = false;

						if (field1276 == 1) {
							field1104 = true;
						}

						if (field1276 == 2) {
							field1181 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1277;
					int var5 = field1278;
					int var6 = field1279;
					int var7 = field18;
					int var8 = field19;
					if (field1276 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1276 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field1276 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field997; var10++) {
						int var11 = (field997 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method466(var9);
					}

					field943 = false;

					if (field1276 == 1) {
						field1104 = true;
					}

					if (field1276 == 2) {
						field1181 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field997 > 0) {
					int var12 = field1261[field997 - 1];
					if (var12 == 134 || var12 == 701 || var12 == 570 || var12 == 719 || var12 == 440 || var12 == 871 || var12 == 526 || var12 == 156 || var12 == 120 || var12 == 796 || var12 == 357) {
						int var13 = field1259[field997 - 1];
						int var14 = field1260[field997 - 1];
						class60 var15 = class60.field830[var14];
						if (var15.field856) {
							field1310 = false;
							field1188 = 0;
							field1324 = var14;
							field1325 = var13;
							field1326 = 2;
							field1327 = field18;
							field1328 = field19;

							if (class60.field830[var14].field836 == field1265) {
								field1326 = 1;
							}

							if (class60.field830[var14].field836 == field942) {
								field1326 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field996 == 1 || method461(field997 - 1)) && field997 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field997 > 0) {
					method466(field997 - 1);
				}

				if (var1 != 2 || field997 <= 0) {
					return;
				}

				method410();
			}
		}
	}

	@ObfuscatedName("client.F(I)Ljava/lang/String;")
	public final String method453() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method454() {
		field1014.method235();
		int var1 = field990 + field1008 & 0x7FF;
		int var2 = field1171.field268 / 32 + 48;
		int var3 = 464 - field1171.field269 / 32;
		field1084.method179(9, 146, var3, field1213, 21, field970, var2, 151, var1, field1329 + 256);
		field1100.method179(0, 33, 25, field1011, 0, field1256, 25, 33, field1008, 256);

		for (int var4 = 0; var4 < field1113; var4++) {
			int var5 = field1114[var4] * 4 + 2 - field1171.field268 / 32;
			int var6 = field1115[var4] * 4 + 2 - field1171.field269 / 32;
			method401(field1120[var4], var5, var6);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class41 var9 = field1298[field1315][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1171.field268 / 32;
					int var11 = var8 * 4 + 2 - field1171.field269 / 32;
					method401(field984, var10, var11);
				}
			}
		}

		for (int var12 = 0; var12 < field963; var12++) {
			class25 var13 = field962[field964[var12]];
			if (var13 != null && var13.method111() && var13.field320.field758) {
				int var14 = var13.field268 / 32 - field1171.field268 / 32;
				int var15 = var13.field269 / 32 - field1171.field269 / 32;
				method401(field985, var14, var15);
			}
		}

		for (int var16 = 0; var16 < field1154; var16++) {
			class26 var17 = field1153[field1155[var16]];
			if (var17 != null && var17.method111()) {
				int var18 = var17.field268 / 32 - field1171.field268 / 32;
				int var19 = var17.field269 / 32 - field1171.field269 / 32;
				boolean var20 = false;
				long var21 = class48.method251(var17.field321);
				for (int var23 = 0; var23 < field1300; var23++) {
					if (field1183[var23] == var21 && field1197[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method401(field987, var18, var19);
				} else {
					method401(field986, var18, var19);
				}
			}
		}

		if (field1082 != 0) {
			int var24 = field1082 * 4 + 2 - field1171.field268 / 32;
			int var25 = field1083 * 4 + 2 - field1171.field269 / 32;
			method401(field1180, var24, var25);
		}

		class32.method149(0xFFFFFF, 3, 82, 3, 93);
		field1015.method235();
	}

	@ObfuscatedName("client.a(Lib;I)V")
	public final void method455(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1281.length; var3++) {
			field1281[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1281[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1282[var9] = (field1281[var9 - 1] + field1281[var9 + 1] + field1281[var9 - 128] + field1281[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1281;
			field1281 = field1282;
			field1282 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field525; var12++) {
				for (int var13 = 0; var13 < arg0.field524; var13++) {
					if (arg0.field522[var11++] != 0) {
						int var14 = var13 + arg0.field526 + 16;
						int var15 = var12 + arg0.field527 + 16;
						int var16 = (var15 << 7) + var14;
						field1281[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method456() {
		int var1 = field1277;
		int var2 = field1278;
		int var3 = field1279;
		int var4 = field1280;
		int var5 = 0x5D5447;
		class32.method149(var5, var3, var2, var4, var1);
		class32.method149(0, var3 - 2, var2 + 1, 16, var1 + 1);
		class32.method150(0, var3 - 2, var1 + 1, var2 + 18, var4 - 19);
		field1091.method191(var1 + 3, var2 + 14, "Choose Option", var5);
		int var6 = field15;
		int var7 = field16;
		if (field1276 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1276 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field1276 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field997; var8++) {
			int var9 = (field997 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1091.method193(var10, var9, true, field1125[var8], var1 + 3);
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method457(int arg0) {
		class60 var2 = class60.field830[arg0];
		for (int var3 = 0; var3 < var2.field851.length && var2.field851[var3] != -1; var3++) {
			class60 var4 = class60.field830[var2.field851[var3]];
			if (var4.field837 == 1) {
				method457(var4.field835);
			}

			var4.field833 = 0;
			var4.field834 = 0;
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method458() {
		int var1 = field1171.field268 + field975;
		int var2 = field1171.field269 + field948;
		if (field1168 - var1 < -500 || field1168 - var1 > 500 || field1169 - var2 < -500 || field1169 - var2 > 500) {
			field1168 = var1;
			field1169 = var2;
		}

		if (field1168 != var1) {
			field1168 += (var1 - field1168) / 16;
		}

		if (field1169 != var2) {
			field1169 += (var2 - field1169) / 16;
		}

		if (field20[1] == 1) {
			field1009 += (-field1009 - 24) / 2;
		} else if (field20[2] == 1) {
			field1009 += (24 - field1009) / 2;
		} else {
			field1009 /= 2;
		}

		if (field20[3] == 1) {
			field1010 += (12 - field1010) / 2;
		} else if (field20[4] == 1) {
			field1010 += (-field1010 - 12) / 2;
		} else {
			field1010 /= 2;
		}

		field1008 = field1009 / 2 + field1008 & 0x7FF;
		field1007 += field1010 / 2;
		if (field1007 < 128) {
			field1007 = 128;
		}

		if (field1007 > 383) {
			field1007 = 383;
		}

		int var3 = field1168 >> 7;
		int var4 = field1169 >> 7;
		int var5 = method488(field1315, field1169, field1168);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1315;
					if (var9 < 3 && (field1087[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field980[var9][var7][var8];
					if (var10 > var6) {
						var6 = var10;
					}
				}
			}
		}

		field1187++;
		if (field1187 > 77) {
			field1187 = 0;
			field1214.method198(57);
		}

		int var11 = var6 * 192;
		if (var11 > 98048) {
			var11 = 98048;
		}

		if (var11 < 32768) {
			var11 = 32768;
		}

		if (var11 > field1148) {
			field1148 += (var11 - field1148) / 24;
		} else if (var11 < field1148) {
			field1148 += (var11 - field1148) / 80;
		}
	}

	@ObfuscatedName("client.a(Lhc;IIIZ)V")
	public final void method459(class60 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field837 == 0 && arg0.field851 != null && (!arg0.field850 || field1066 == arg0.field835 || field1101 == arg0.field835 || field1112 == arg0.field835)) {
			int var5 = class32.field487;
			int var6 = class32.field485;
			int var7 = class32.field488;
			int var8 = class32.field486;
			class32.method147(arg3, arg1, arg0.field841 + arg3, arg0.field840 + arg1);
			int var9 = arg0.field851.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field852[var10] + arg1;
				int var12 = arg0.field853[var10] + arg3 - arg2;
				class60 var13 = class60.field830[arg0.field851[var10]];
				var11 += var13.field842;
				var12 += var13.field843;

				if (var13.field839 > 0) {
					method389(var13);
				}

				if (var13.field837 == 0) {
					if (var13.field849 > var13.field848 - var13.field841) {
						var13.field849 = var13.field848 - var13.field841;
					}

					if (var13.field849 < 0) {
						var13.field849 = 0;
					}

					method459(var13, var11, var13.field849, var12);

					if (var13.field848 > var13.field841) {
						method427(var12, var13.field841, var13.field840 + var11, var13.field848, var13.field849);
					}
				} else if (var13.field837 != 1) {
					if (var13.field837 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field841; var15++) {
							for (int var16 = 0; var16 < var13.field840; var16++) {
								int var17 = (var13.field859 + 32) * var16 + var11;
								int var18 = (var13.field860 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field862[var14];
									var18 += var13.field863[var14];
								}

								if (var13.field831[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field831[var14] - 1;
									class34 var22 = class55.method292(var13.field832[var14], var21);
									if (field1326 != 0 && field1325 == var14 && field1324 == var13.field835) {
										var19 = field15 - field1327;
										var20 = field16 - field1328;

										if (var19 < 5 && var19 > -5) {
											var19 = 0;
										}

										if (var20 < 5 && var20 > -5) {
											var20 = 0;
										}

										if (field1188 < 5) {
											var19 = 0;
											var20 = 0;
										}

										var22.method177(128, var18 + var20, var17 + var19);
									} else if (field1058 != 0 && field1057 == var14 && field1056 == var13.field835) {
										var22.method177(128, var18, var17);
									} else {
										var22.method173(var18, var17);
									}

									if (var22.field520 == 33 || var13.field832[var14] != 1) {
										int var23 = var13.field832[var14];
										field1089.method191(var17 + var19 + 1, var18 + 10 + var20, method366(var23), 0);
										field1089.method191(var17 + var19, var18 + 9 + var20, method366(var23), 0xFFFF00);
									}
								} else if (var13.field861 != null && var14 < 20) {
									class34 var24 = var13.field861[var14];
									if (var24 != null) {
										var24.method173(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field837 == 3) {
						if (var13.field865) {
							class32.method149(var13.field871, var13.field840, var12, var13.field841, var11);
						} else {
							class32.method150(var13.field871, var13.field840, var11, var12, var13.field841);
						}
					} else if (var13.field837 == 4) {
						class36 var25 = var13.field868;
						int var26 = var13.field871;
						String var27 = var13.field869;

						if ((field1112 == var13.field835 || field1101 == var13.field835 || field1066 == var13.field835) && var13.field873 != 0) {
							var26 = var13.field873;
						}

						if (method375(var13)) {
							var26 = var13.field872;

							if (var13.field870.length() > 0) {
								var27 = var13.field870;
							}
						}

						if (var13.field838 == 6 && field1150) {
							var27 = "Please wait...";
							var26 = var13.field871;
						}

						int var28 = var25.field538 + var12;
						while (var27.length() > 0) {
							if (var27.indexOf("%") != -1) {
								while (true) {
									int var29 = var27.indexOf("%1");
									if (var29 == -1) {
										break;
									}

									var27 = var27.substring(0, var29) + method367(method485(0, var13)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method367(method485(1, var13)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method367(method485(2, var13)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method367(method485(3, var13)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method367(method485(4, var13)) + var27.substring(var33 + 2);
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

							if (var13.field866) {
								var25.method189(var28, var26, var13.field840 / 2 + var11, var35, var13.field867);
							} else {
								var25.method193(var26, var28, var13.field867, var35, var11);
							}

							var28 += var25.field538;
						}
					} else if (var13.field837 == 5) {
						class34 var36;
						if (method375(var13)) {
							var36 = var13.field875;
						} else {
							var36 = var13.field874;
						}

						if (var36 != null) {
							var36.method173(var12, var11);
						}
					} else if (var13.field837 == 6) {
						int var37 = class33.field497;
						int var38 = class33.field498;
						class33.field497 = var13.field840 / 2 + var11;
						class33.field498 = var13.field841 / 2 + var12;
						int var39 = class33.field501[var13.field881] * var13.field880 >> 16;
						int var40 = class33.field502[var13.field881] * var13.field880 >> 16;
						boolean var41 = method375(var13);
						int var42;
						if (var41) {
							var42 = var13.field879;
						} else {
							var42 = var13.field878;
						}

						class31 var43;
						if (var42 == -1) {
							var43 = var13.method315(-1, -1, var41);
						} else {
							class62 var44 = class62.field896[var42];
							var43 = var13.method315(var44.field898[var13.field833], var44.field899[var13.field833], var41);
						}

						if (var43 != null) {
							var43.method139(0, var13.field882, 0, var13.field881, 0, var39, var40);
						}

						class33.field497 = var37;
						class33.field498 = var38;
					} else if (var13.field837 == 7) {
						class36 var45 = var13.field868;
						int var46 = 0;
						for (int var47 = 0; var47 < var13.field841; var47++) {
							for (int var48 = 0; var48 < var13.field840; var48++) {
								if (var13.field831[var46] > 0) {
									class55 var49 = class55.method287(var13.field831[var46] - 1);
									String var50 = var49.field771;
									if (var49.field782 || var13.field832[var46] != 1) {
										var50 = var50 + " x" + method369(var13.field832[var46]);
									}

									int var51 = (var13.field859 + 115) * var48 + var11;
									int var52 = (var13.field860 + 12) * var47 + var12;
									if (var13.field866) {
										var45.method189(var52, var13.field871, var13.field840 / 2 + var51, var50, var13.field867);
									} else {
										var45.method193(var13.field871, var52, var13.field867, var50, var51);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class32.method147(var6, var5, var8, var7);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://127.0.0.1:" + (field1247 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IILhc;IIII)V")
	public final void method460(int arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field837 == 0 && arg1.field851 != null && !arg1.field850 && (arg3 >= arg0 && arg2 >= arg5 && arg3 <= arg1.field840 + arg0 && arg2 <= arg1.field841 + arg5)) {
			int var7 = arg1.field851.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field852[var8] + arg0;
				int var10 = arg1.field853[var8] + arg5 - arg4;
				class60 var11 = class60.field830[arg1.field851[var8]];
				var9 += var11.field842;
				var10 += var11.field843;
				if ((var11.field847 >= 0 || var11.field873 != 0) && arg3 >= var9 && arg2 >= var10 && arg3 < var11.field840 + var9 && arg2 < var11.field841 + var10) {
					if (var11.field847 >= 0) {
						field1274 = var11.field847;
					} else {
						field1274 = var11.field835;
					}
				}

				if (var11.field837 == 0) {
					method460(var9, var11, arg2, arg3, var11.field849, var10);

					if (var11.field848 > var11.field841) {
						method368(arg3, var11.field848, var10, var11.field841, var11.field840 + var9, true, var11, arg2);
					}
				} else {
					if (var11.field838 == 1 && arg3 >= var9 && arg2 >= var10 && arg3 < var11.field840 + var9 && arg2 < var11.field841 + var10) {
						boolean var12 = false;
						if (var11.field839 != 0) {
							var12 = method383(var11);
						}

						if (!var12) {
							field1125[field997] = var11.field886;
							field1261[field997] = 706;
							field1260[field997] = var11.field835;
							field997++;
						}
					}

					if (var11.field838 == 2 && field1252 == 0 && arg3 >= var9 && arg2 >= var10 && arg3 < var11.field840 + var9 && arg2 < var11.field841 + var10) {
						String var13 = var11.field883;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1125[field997] = var13 + " @gre@" + var11.field884;
						field1261[field997] = 941;
						field1260[field997] = var11.field835;
						field997++;
					}

					if (var11.field838 == 3 && arg3 >= var9 && arg2 >= var10 && arg3 < var11.field840 + var9 && arg2 < var11.field841 + var10) {
						field1125[field997] = "Close";
						field1261[field997] = 309;
						field1260[field997] = var11.field835;
						field997++;
					}

					if (var11.field838 == 4 && arg3 >= var9 && arg2 >= var10 && arg3 < var11.field840 + var9 && arg2 < var11.field841 + var10) {
						field1125[field997] = var11.field886;
						field1261[field997] = 967;
						field1260[field997] = var11.field835;
						field997++;
					}

					if (var11.field838 == 5 && arg3 >= var9 && arg2 >= var10 && arg3 < var11.field840 + var9 && arg2 < var11.field841 + var10) {
						field1125[field997] = var11.field886;
						field1261[field997] = 672;
						field1260[field997] = var11.field835;
						field997++;
					}

					if (var11.field838 == 6 && !field1150 && arg3 >= var9 && arg2 >= var10 && arg3 < var11.field840 + var9 && arg2 < var11.field841 + var10) {
						field1125[field997] = var11.field886;
						field1261[field997] = 73;
						field1260[field997] = var11.field835;
						field997++;
					}

					if (var11.field837 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field841; var15++) {
							for (int var16 = 0; var16 < var11.field840; var16++) {
								int var17 = (var11.field859 + 32) * var16 + var9;
								int var18 = (var11.field860 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field862[var14];
									var18 += var11.field863[var14];
								}

								if (arg3 >= var17 && arg2 >= var18 && arg3 < var17 + 32 && arg2 < var18 + 32) {
									field1307 = var14;
									field1308 = var11.field835;

									if (var11.field831[var14] > 0) {
										class55 var19 = class55.method287(var11.field831[var14] - 1);
										if (field1175 == 1 && var11.field857) {
											if (field1177 != var11.field835 || field1176 != var14) {
												field1125[field997] = "Use " + field1179 + " with @lre@" + var19.field771;
												field1261[field997] = 237;
												field1262[field997] = var19.field769;
												field1259[field997] = var14;
												field1260[field997] = var11.field835;
												field997++;
											}
										} else if (field1252 != 1 || !var11.field857) {
											if (var11.field857) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field786 != null && var19.field786[var20] != null) {
														field1125[field997] = var19.field786[var20] + " @lre@" + var19.field771;

														if (var20 == 3) {
															field1261[field997] = 120;
														}

														if (var20 == 4) {
															field1261[field997] = 796;
														}

														field1262[field997] = var19.field769;
														field1259[field997] = var14;
														field1260[field997] = var11.field835;
														field997++;
													} else if (var20 == 4) {
														field1125[field997] = "Drop @lre@" + var19.field771;
														field1261[field997] = 796;
														field1262[field997] = var19.field769;
														field1259[field997] = var14;
														field1260[field997] = var11.field835;
														field997++;
													}
												}
											}

											if (var11.field858) {
												field1125[field997] = "Use @lre@" + var19.field771;
												field1261[field997] = 357;
												field1262[field997] = var19.field769;
												field1259[field997] = var14;
												field1260[field997] = var11.field835;
												field997++;
											}

											if (var11.field857 && var19.field786 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field786[var21] != null) {
														field1125[field997] = var19.field786[var21] + " @lre@" + var19.field771;

														if (var21 == 0) {
															field1261[field997] = 871;
														}

														if (var21 == 1) {
															field1261[field997] = 526;
														}

														if (var21 == 2) {
															field1261[field997] = 156;
														}

														field1262[field997] = var19.field769;
														field1259[field997] = var14;
														field1260[field997] = var11.field835;
														field997++;
													}
												}
											}

											if (var11.field864 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field864[var22] != null) {
														field1125[field997] = var11.field864[var22] + " @lre@" + var19.field771;

														if (var22 == 0) {
															field1261[field997] = 134;
														}

														if (var22 == 1) {
															field1261[field997] = 701;
														}

														if (var22 == 2) {
															field1261[field997] = 570;
														}

														if (var22 == 3) {
															field1261[field997] = 719;
														}

														if (var22 == 4) {
															field1261[field997] = 440;
														}

														field1262[field997] = var19.field769;
														field1259[field997] = var14;
														field1260[field997] = var11.field835;
														field997++;
													}
												}
											}

											field1125[field997] = "Examine @lre@" + var19.field771;
											field1261[field997] = 1974;
											field1262[field997] = var19.field769;
											field1260[field997] = var11.field832[var14];
											field997++;
										} else if ((field1254 & 0x10) == 0x10) {
											field1125[field997] = field1255 + " @lre@" + var19.field771;
											field1261[field997] = 63;
											field1262[field997] = var19.field769;
											field1259[field997] = var14;
											field1260[field997] = var11.field835;
											field997++;
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

	@ObfuscatedName("client.b(ZI)Z")
	public final boolean method461(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1261[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 447) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method462() {
		for (class27 var1 = (class27) field1070.method228(); var1 != null; var1 = (class27) field1070.method230()) {
			if (field1315 != var1.field343 || field1134 > var1.field349) {
				var1.method107();
			} else if (field1134 >= var1.field348) {
				if (var1.field352 > 0) {
					class25 var2 = field962[var1.field352 - 1];
					if (var2 != null) {
						var1.method116(method488(var1.field343, var2.field269, var2.field268) - var1.field347, field1134, var2.field268, var2.field269);
					}
				}

				if (var1.field352 < 0) {
					int var3 = -var1.field352 - 1;
					class26 var4;
					if (field995 == var3) {
						var4 = field1171;
					} else {
						var4 = field1153[var3];
					}

					if (var4 != null) {
						var1.method116(method488(var1.field343, var4.field269, var4.field268) - var1.field347, field1134, var4.field268, var4.field269);
					}
				}

				var1.method117(field1103);
				field998.method61(-1, (int) var1.field356, var1, null, (int) var1.field355, false, field1315, var1.field362, (int) var1.field354, 60);
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method463() {
		if (field1171.field268 >> 7 == field1082 && field1171.field269 >> 7 == field1083) {
			field1082 = 0;
		}

		for (int var1 = -1; var1 < field1154; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1171;
				var3 = field1152 << 14;
			} else {
				var2 = field1153[field1155[var1]];
				var3 = field1155[var1] << 14;
			}

			if (var2 != null && var2.method111()) {
				var2.field340 = false;
				if ((field1249 && field1154 > 50 || field1154 > 200) && var1 != -1 && var2.field292 == var2.field273) {
					var2.field340 = true;
				}

				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field335 == null || field1134 < var2.field330 || field1134 >= var2.field331) {
						if ((var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
							if (field1081[var4][var5] == field1231) {
								continue;
							}

							field1081[var4][var5] = field1231;
						}

						var2.field329 = method488(field1315, var2.field269, var2.field268);
						field998.method61(var3, var2.field329, var2, null, var2.field269, var2.field271, field1315, var2.field270, var2.field268, 60);
					} else {
						var2.field340 = false;
						var2.field329 = method488(field1315, var2.field269, var2.field268);
						field998.method62(var2.field329, field1315, 60, var3, var2.field269, var2.field338, null, var2.field339, var2.field270, var2, var2.field336, var2.field337, var2.field268);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method464() {
		method391();
		field1019.method235();
		field1190.method186(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1301 == 0) {
			int var3 = var2 / 2 - 80;
			var3 += 55;
			field1091.method189(var3, 0xFFFF00, var1 / 2, "Welcome to RuneScape", true);
			var3 += 15;
			var3 += 60;
			int var4 = var1 / 2;
			int var5 = var2 / 2 + 65;
			field1191.method186(var5 - 20, var4 - 73);
			field1091.method189(var5 + 5, 0xFFFFFF, var1 / 2, "Click here to login.", true);
		}

		if (field1301 == 2) {
			int var6 = var2 / 2 - 50;
			if (field1216.length() > 0) {
				field1091.method189(var6 - 15, 0xFFFF00, var1 / 2, field1216, true);
				field1091.method189(var6, 0xFFFF00, var1 / 2, field1217, true);
				var6 += 30;
			} else {
				field1091.method189(var6 - 7, 0xFFFF00, var1 / 2, field1217, true);
				var6 += 30;
			}

			field1091.method193(0xFFFFFF, var6, true, "Username: " + field1322 + (field1068 == 0 & field1134 % 40 < 20 ? "@yel@|" : ""), var1 / 2 - 90);
			var6 += 15;
			field1091.method193(0xFFFFFF, var6, true, "Password: " + class48.method257(field1323) + (field1068 == 1 & field1134 % 40 < 20 ? "@yel@|" : ""), var1 / 2 - 88);
			var6 += 15;
			int var7 = var1 / 2 - 80;
			int var8 = var2 / 2 + 40;
			field1191.method186(var8 - 20, var7 - 73);
			field1091.method189(var8 + 5, 0xFFFFFF, var7, "Login", true);
			int var9 = var1 / 2 + 80;
			field1191.method186(var8 - 20, var9 - 73);
			field1091.method189(var8 + 5, 0xFFFFFF, var9, "Cancel", true);
		}

		field1019.method236(186, field8, 214);

		if (field1099) {
			field1099 = false;
			field1017.method236(0, field8, 128);
			field1018.method236(386, field8, 214);
			field1022.method236(265, field8, 0);
			field1023.method236(265, field8, 574);
			field1024.method236(186, field8, 128);
			field1025.method236(186, field8, 574);
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method465(int arg0) {
		if (!field1249) {
			if (class33.field511[17] >= arg0) {
				class35 var2 = class33.field505[17];
				int var3 = var2.field525 * var2.field524 - 1;
				int var4 = field1103 * var2.field524 * 2;
				byte[] var5 = var2.field522;
				byte[] var6 = field1305;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field522 = var6;
				field1305 = var5;
				class33.method160(17);
			}

			if (class33.field511[24] >= arg0) {
				class35 var8 = class33.field505[24];
				int var9 = var8.field525 * var8.field524 - 1;
				int var10 = field1103 * var8.field524 * 2;
				byte[] var11 = var8.field522;
				byte[] var12 = field1305;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field522 = var12;
				field1305 = var11;
				class33.method160(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method466(int arg0) {
		if (arg0 >= 0) {
			if (field1299) {
				field1299 = false;
				field1181 = true;
			}

			int var2 = field1259[arg0];
			int var3 = field1260[arg0];
			int var4 = field1261[arg0];
			int var5 = field1262[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 309) {
				method472();
			}

			if (var4 == 134 || var4 == 701 || var4 == 570 || var4 == 719 || var4 == 440) {
				if (var4 == 134) {
					field1214.method198(90);
				}

				if (var4 == 570) {
					field1214.method198(121);
				}

				if (var4 == 719) {
					field1214.method198(186);
				}

				if (var4 == 440) {
					field1214.method198(31);
				}

				if (var4 == 701) {
					field1214.method198(47);
				}

				field1214.method200(var5);
				field1214.method200(var2);
				field1214.method200(var3);
				field1055 = 0;
				field1056 = var3;
				field1057 = var2;
				field1058 = 2;
				if (class60.field830[var3].field836 == field1265) {
					field1058 = 1;
				}

				if (class60.field830[var3].field836 == field942) {
					field1058 = 3;
				}
			}

			if (var4 == 73 && !field1150) {
				field1214.method198(218);
				field1214.method200(var3);
				field1150 = true;
			}

			if (var4 == 56 || var4 == 321 || var4 == 552 || var4 == 43 || var4 == 687) {
				boolean var6 = method381(false, 0, field1171.field317[0], 0, var2, 0, 2, 0, 0, field1171.field316[0], var3);
				if (!var6) {
					method381(false, 1, field1171.field317[0], 1, var2, 0, 2, 0, 0, field1171.field316[0], var3);
				}

				field1116 = field18;
				field1117 = field19;
				field1119 = 2;
				field1118 = 0;

				if (var4 == 321) {
					field1214.method198(48);
				}

				if (var4 == 687) {
					field951++;
					if (field951 >= 121) {
						field1214.method198(13);
						field1214.method199(128);
					}

					field1214.method198(192);
				}

				if (var4 == 43) {
					field1214.method198(143);
				}

				if (var4 == 552) {
					field1214.method198(226);
				}

				if (var4 == 56) {
					field1214.method198(91);
				}

				field1214.method200(field1161 + var2);
				field1214.method200(field1162 + var3);
				field1214.method200(var5);
			}

			if (var4 == 1528 || var4 == 1741 || var4 == 593 || var4 == 1596) {
				class26 var8 = field1153[var5];
				if (var8 != null) {
					method381(false, 1, field1171.field317[0], 1, var8.field316[0], 0, 2, 0, 0, field1171.field316[0], var8.field317[0]);
					field1116 = field18;
					field1117 = field19;
					field1119 = 2;
					field1118 = 0;

					if (var4 == 593) {
						field1214.method198(28);
					}

					if (var4 == 1596) {
						field1214.method198(173);
					}

					if (var4 == 1741) {
						if ((var5 & 0x3) == 0) {
							field1135++;
						}

						if (field1135 >= 139) {
							field1214.method198(84);
							field1214.method203(0);
						}

						field1214.method198(63);
					}

					if (var4 == 1528) {
						field1214.method198(245);
					}

					field1214.method200(var5);
				}
			}

			if (var4 == 706) {
				class60 var9 = class60.field830[var3];
				boolean var10 = true;
				if (var9.field839 > 0) {
					var10 = method398(var9);
				}

				if (var10) {
					field1214.method198(222);
					field1214.method200(var3);
				}
			}

			if (var4 == 737 && method443(var2, 9, var5, var3)) {
				field1214.method200(field1253);
			}

			if (var4 == 1418) {
				int var11 = var5 >> 14 & 0x7FFF;
				class53 var12 = class53.method275(var11);
				String var13;
				if (var12.field704 == null) {
					var13 = "It's a " + var12.field703 + ".";
				} else {
					var13 = new String(var12.field704);
				}

				method431(var13, "", 0);
			}

			if (var4 == 1974) {
				class55 var14 = class55.method287(var5);
				String var15;
				if (var3 >= 100000) {
					var15 = var3 + " x " + var14.field771;
				} else if (var14.field772 == null) {
					var15 = "It's a " + var14.field771 + ".";
				} else {
					var15 = new String(var14.field772);
				}

				method431(var15, "", 0);
			}

			if (var4 == 357) {
				field1175 = 1;
				field1176 = var2;
				field1177 = var3;
				field1178 = var5;
				field1179 = class55.method287(var5).field771;
				field1252 = 0;
			} else {
				if (var4 == 988 || var4 == 345 || var4 == 249 || var4 == 960 || var4 == 40) {
					class25 var16 = field962[var5];
					if (var16 != null) {
						method381(false, 1, field1171.field317[0], 1, var16.field316[0], 0, 2, 0, 0, field1171.field316[0], var16.field317[0]);
						field1116 = field18;
						field1117 = field19;
						field1119 = 2;
						field1118 = 0;

						if (var4 == 960) {
							field1214.method198(114);
						}

						if (var4 == 345) {
							field971 += var5;
							if (field971 >= 116) {
								field1214.method198(217);
							}

							field1214.method198(191);
						}

						if (var4 == 249) {
							field1214.method198(89);
						}

						if (var4 == 40) {
							field1214.method198(198);
						}

						if (var4 == 988) {
							field1214.method198(236);
						}

						field1214.method200(var5);
					}
				}

				if (var4 == 967) {
					field1214.method198(222);
					field1214.method200(var3);
					class60 var17 = class60.field830[var3];
					if (var17.field844 != null && var17.field844[0][0] == 5) {
						int var18 = var17.field844[0][1];
						field1137[var18] = 1 - field1137[var18];
						method372(var18);
						field1104 = true;
					}
				}

				if (var4 == 447 || var4 == 158 || var4 == 804 || var4 == 521) {
					String var19 = field1125[arg0];
					int var20 = var19.indexOf("@whi@");
					if (var20 != -1) {
						long var21 = class48.method251(var19.substring(var20 + 5).trim());
						if (var4 == 447) {
							method374(var21);
						}

						if (var4 == 158) {
							method380(var21);
						}

						if (var4 == 804) {
							method402(var21);
						}

						if (var4 == 521) {
							method413(var21);
						}
					}
				}

				if (var4 == 103) {
					class26 var23 = field1153[var5];
					if (var23 != null) {
						method381(false, 1, field1171.field317[0], 1, var23.field316[0], 0, 2, 0, 0, field1171.field316[0], var23.field317[0]);
						field1116 = field18;
						field1117 = field19;
						field1119 = 2;
						field1118 = 0;
						field1214.method198(184);
						field1214.method200(var5);
						field1214.method200(field1178);
						field1214.method200(field1176);
						field1214.method200(field1177);
					}
				}

				if (var4 == 981) {
					if (field943) {
						field998.method89(var3 - 11, var2 - 8);
					} else {
						field998.method89(field19 - 11, field18 - 8);
					}
				}

				if (var4 == 798) {
					field1012++;
					if (field1012 >= 135) {
						field1214.method198(253);
						field1214.method200(10151);
					}

					method443(var2, 207, var5, var3);
				}

				if (var4 == 595 || var4 == 835) {
					String var24 = field1125[arg0];
					int var25 = var24.indexOf("@whi@");
					if (var25 != -1) {
						var24 = var24.substring(var25 + 5).trim();
						String var26 = class48.method255(class48.method252(class48.method251(var24)));
						boolean var27 = false;
						for (int var28 = 0; var28 < field1154; var28++) {
							class26 var29 = field1153[field1155[var28]];
							if (var29 != null && var29.field321 != null && var29.field321.equalsIgnoreCase(var26)) {
								method381(false, 1, field1171.field317[0], 1, var29.field316[0], 0, 2, 0, 0, field1171.field316[0], var29.field317[0]);

								if (var4 == 595) {
									field1214.method198(245);
								}

								if (var4 == 835) {
									field1214.method198(173);
								}

								field1214.method200(field1155[var28]);
								var27 = true;
								break;
							}
						}

						if (!var27) {
							method431("Unable to find " + var26, "", 0);
						}
					}
				}

				if (var4 == 829) {
					field1088 += var3;
					if (field1088 >= 132) {
						field1214.method198(27);
						field1214.method200(17379);
					}

					method443(var2, 223, var5, var3);
				}

				if (var4 == 1659) {
					method443(var2, 181, var5, var3);
				}

				if (var4 == 543) {
					boolean var30 = method381(false, 0, field1171.field317[0], 0, var2, 0, 2, 0, 0, field1171.field316[0], var3);
					if (!var30) {
						method381(false, 1, field1171.field317[0], 1, var2, 0, 2, 0, 0, field1171.field316[0], var3);
					}

					field1116 = field18;
					field1117 = field19;
					field1119 = 2;
					field1118 = 0;
					field1214.method198(241);
					field1214.method200(field1161 + var2);
					field1214.method200(field1162 + var3);
					field1214.method200(var5);
					field1214.method200(field1253);
				}

				if (var4 == 505 && method443(var2, 139, var5, var3)) {
					field1214.method200(field1178);
					field1214.method200(field1176);
					field1214.method200(field1177);
				}

				if (var4 == 873) {
					method443(var2, 196, var5, var3);
				}

				if (var4 == 941) {
					class60 var32 = class60.field830[var3];
					field1252 = 1;
					field1253 = var3;
					field1254 = var32.field885;
					field1175 = 0;
					String var33 = var32.field883;
					if (var33.indexOf(" ") != -1) {
						var33 = var33.substring(0, var33.indexOf(" "));
					}

					String var34 = var32.field883;
					if (var34.indexOf(" ") != -1) {
						var34 = var34.substring(var34.indexOf(" ") + 1);
					}

					field1255 = var33 + " " + var32.field884 + " " + var34;

					if (field1254 == 16) {
						field1104 = true;
						field1189 = 3;
						field1211 = true;
					}
				} else {
					if (var4 == 1308) {
						class55 var35 = class55.method287(var5);
						String var36;
						if (var35.field772 == null) {
							var36 = "It's a " + var35.field771 + ".";
						} else {
							var36 = new String(var35.field772);
						}

						method431(var36, "", 0);
					}

					if (var4 == 672) {
						field1214.method198(222);
						field1214.method200(var3);
						class60 var37 = class60.field830[var3];
						if (var37.field844 != null && var37.field844[0][0] == 5) {
							int var38 = var37.field844[0][1];
							if (field1137[var38] != var37.field846[0]) {
								field1137[var38] = var37.field846[0];
								method372(var38);
								field1104 = true;
							}
						}
					}

					if (var4 == 63) {
						field1214.method198(158);
						field1214.method200(var5);
						field1214.method200(var2);
						field1214.method200(var3);
						field1214.method200(field1253);
						field1055 = 0;
						field1056 = var3;
						field1057 = var2;
						field1058 = 2;
						if (class60.field830[var3].field836 == field1265) {
							field1058 = 1;
						}

						if (class60.field830[var3].field836 == field942) {
							field1058 = 3;
						}
					}

					if (var4 == 1814) {
						class25 var39 = field962[var5];
						if (var39 != null) {
							String var40;
							if (var39.field320.field742 == null) {
								var40 = "It's a " + var39.field320.field741 + ".";
							} else {
								var40 = new String(var39.field320.field742);
							}

							method431(var40, "", 0);
						}
					}

					if (var4 == 125) {
						String var41 = field1125[arg0];
						int var42 = var41.indexOf("@whi@");
						if (var42 != -1) {
							long var43 = class48.method251(var41.substring(var42 + 5).trim());
							int var45 = -1;
							for (int var46 = 0; var46 < field1300; var46++) {
								if (field1183[var46] == var43) {
									var45 = var46;
									break;
								}
							}

							if (var45 != -1 && field1197[var45] > 0) {
								field1181 = true;
								field1299 = false;
								field1136 = true;
								field1251 = "";
								field1107 = 3;
								field977 = field1183[var45];
								field994 = "Enter message to send to " + field1128[var45];
							}
						}
					}

					if (var4 == 493) {
						class25 var47 = field962[var5];
						if (var47 != null) {
							method381(false, 1, field1171.field317[0], 1, var47.field316[0], 0, 2, 0, 0, field1171.field316[0], var47.field317[0]);
							field1116 = field18;
							field1117 = field19;
							field1119 = 2;
							field1118 = 0;
							field1214.method198(36);
							field1214.method200(var5);
							field1214.method200(field1178);
							field1214.method200(field1176);
							field1214.method200(field1177);
						}
					}

					if (var4 == 104) {
						method443(var2, 168, var5, var3);
					}

					if (var4 == 48) {
						class26 var48 = field1153[var5];
						if (var48 != null) {
							method381(false, 1, field1171.field317[0], 1, var48.field316[0], 0, 2, 0, 0, field1171.field316[0], var48.field317[0]);
							field1116 = field18;
							field1117 = field19;
							field1119 = 2;
							field1118 = 0;
							field1214.method198(39);
							field1214.method200(var5);
							field1214.method200(field1253);
						}
					}

					if (var4 == 871 || var4 == 526 || var4 == 156 || var4 == 120 || var4 == 796) {
						if (var4 == 120) {
							field1214.method198(112);
						}

						if (var4 == 871) {
							field988 += var5;
							if (field988 >= 76) {
								field1214.method198(214);
								field1214.method199(171);
							}

							field1214.method198(140);
						}

						if (var4 == 796) {
							if ((var5 & 0x3) == 0) {
								field1186++;
							}

							if (field1186 >= 124) {
								field1214.method198(167);
								field1214.method203(0);
							}

							field1214.method198(122);
						}

						if (var4 == 156) {
							field1229++;
							if (field1229 >= 62) {
								field1214.method198(82);
								field1214.method199(142);
							}

							field1214.method198(155);
						}

						if (var4 == 526) {
							field1214.method198(0);
						}

						field1214.method200(var5);
						field1214.method200(var2);
						field1214.method200(var3);
						field1055 = 0;
						field1056 = var3;
						field1057 = var2;
						field1058 = 2;
						if (class60.field830[var3].field836 == field1265) {
							field1058 = 1;
						}

						if (class60.field830[var3].field836 == field942) {
							field1058 = 3;
						}
					}

					if (var4 == 203) {
						boolean var49 = method381(false, 0, field1171.field317[0], 0, var2, 0, 2, 0, 0, field1171.field316[0], var3);
						if (!var49) {
							method381(false, 1, field1171.field317[0], 1, var2, 0, 2, 0, 0, field1171.field316[0], var3);
						}

						field1116 = field18;
						field1117 = field19;
						field1119 = 2;
						field1118 = 0;
						field1214.method198(183);
						field1214.method200(field1161 + var2);
						field1214.method200(field1162 + var3);
						field1214.method200(var5);
						field1214.method200(field1178);
						field1214.method200(field1176);
						field1214.method200(field1177);
					}

					if (var4 == 316) {
						String var51 = field1125[arg0];
						int var52 = var51.indexOf("@whi@");
						if (var52 != -1) {
							method472();
							field1110 = var51.substring(var52 + 5).trim();
							field1047 = false;

							for (int var53 = 0; var53 < class60.field830.length; var53++) {
								if (class60.field830[var53] != null && class60.field830[var53].field839 == 600) {
									field1080 = field1265 = class60.field830[var53].field836;
									break;
								}
							}
						}
					}

					if (var4 == 500) {
						class25 var54 = field962[var5];
						if (var54 != null) {
							method381(false, 1, field1171.field317[0], 1, var54.field316[0], 0, 2, 0, 0, field1171.field316[0], var54.field317[0]);
							field1116 = field18;
							field1117 = field19;
							field1119 = 2;
							field1118 = 0;
							field1214.method198(244);
							field1214.method200(var5);
							field1214.method200(field1253);
						}
					}

					if (var4 == 237) {
						field1214.method198(106);
						field1214.method200(var5);
						field1214.method200(var2);
						field1214.method200(var3);
						field1214.method200(field1178);
						field1214.method200(field1176);
						field1214.method200(field1177);
						field1055 = 0;
						field1056 = var3;
						field1057 = var2;
						field1058 = 2;
						if (class60.field830[var3].field836 == field1265) {
							field1058 = 1;
						}

						if (class60.field830[var3].field836 == field942) {
							field1058 = 3;
						}
					}

					field1175 = 0;
					field1252 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method9() {
		if (field1029 || field1244 || field1072) {
			method432();
		} else {
			if (field1133) {
				method481();
			} else {
				method464();
			}

			field1302 = 0;
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void method467(int arg0, class37 arg1) {
		field1263 = 0;
		field1156 = 0;
		method434(arg0, arg1);
		method435(arg0, arg1);
		method482(arg0, arg1);

		for (int var3 = 0; var3 < field1263; var3++) {
			int var4 = field1264[var3];
			if (field1134 != field962[var4].field312) {
				field962[var4].field320 = null;
				field962[var4] = null;
			}
		}

		if (arg1.field541 != arg0) {
			signlink.reporterror(field1322 + " size mismatch in getnpcpos - pos:" + arg1.field541 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field963; var5++) {
			if (field962[field964[var5]] == null) {
				signlink.reporterror(field1322 + " null entry in npc list - pos:" + var5 + " size:" + field963);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method468() {
		field1016.method235();
		class33.field503 = field1095;
		field1003.method186(0, 0);

		if (field1136) {
			field1091.method188(0, field994, 40, 239);
			field1091.method188(128, field1251 + "*", 60, 239);
		} else if (field1299) {
			field1091.method188(0, "Enter amount to transfer:", 40, 239);
			field1091.method188(128, field1312 + "*", 60, 239);
		} else if (field1032 != null) {
			field1091.method188(0, field1032, 40, 239);
			field1091.method188(128, "Click to continue", 60, 239);
		} else if (field942 != -1) {
			method459(class60.field830[field942], 0, 0, 0);
		} else if (field1046 == -1) {
			class36 var1 = field1090;
			int var2 = 0;
			class32.method147(0, 0, 77, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1147[var3] != null) {
					int var4 = field1145[var3];
					int var5 = field1033 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, field1147[var3], 0);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, field1146[var3] + ":", 0xFFFFFF);
							var1.method191(var1.method190(field1146[var3]) + 12, var5, field1147[var3], 255);
						}

						var2++;
					}

					if (var4 == 2 && (field981 == 0 || field981 == 1 && method437(field1146[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, field1146[var3] + ":", 0);
							var1.method191(var1.method190(field1146[var3]) + 12, var5, field1147[var3], 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1079 == 0 && (var4 == 7 || field1035 == 0 || field1035 == 1 && method437(field1146[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, "From " + field1146[var3] + ":", 0);
							var1.method191(var1.method190("From " + field1146[var3]) + 12, var5, field1147[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1192 == 0 || field1192 == 1 && method437(field1146[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, field1146[var3] + " " + field1147[var3], 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1079 == 0 && field1035 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, field1147[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1079 == 0 && field1035 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, "To " + field1146[var3] + ":", 0);
							var1.method191(var1.method190("To " + field1146[var3]) + 12, var5, field1147[var3], 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1192 == 0 || field1192 == 1 && method437(field1146[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(4, var5, field1146[var3] + " " + field1147[var3], 0xCBB789);
						}

						var2++;
					}
				}
			}

			class32.method146();
			field1126 = var2 * 14 + 7;
			if (field1126 < 78) {
				field1126 = 78;
			}

			method427(0, 77, 463, field1126, field1126 - field1033 - 77);
			var1.method191(4, 90, class48.method255(field1322) + ":", 0);
			var1.method191(var1.method190(field1322 + ": ") + 6, 90, field1050 + "*", 255);
			class32.method151(77, 0, 479, 0);
		} else {
			method459(class60.field830[field1046], 0, 0, 0);
		}

		if (field943 && field1276 == 2) {
			method456();
		}

		field1016.method236(375, field8, 22);
		field1015.method235();
		class33.field503 = field1097;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method469(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1216 = "";
				field1217 = "Connecting to server...";
				method464();
			}

			field982 = new class4(this, method388(field1247 + 43594));
			field982.method32(field1242.field540, 0, 8);
			field1242.field541 = 0;
			field1130 = field1242.method215();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1130 >> 32), (int) field1130 };
			field1214.field541 = 0;
			field1214.method199(10);
			field1214.method203(var4[0]);
			field1214.method203(var4[1]);
			field1214.method203(var4[2]);
			field1214.method203(var4[3]);
			field1214.method203(signlink.uid);
			field1214.method206(arg0);
			field1214.method206(arg1);
			field1214.method224(field1065, field989);
			field1102.field541 = 0;

			if (arg2) {
				field1102.method199(18);
			} else {
				field1102.method199(16);
			}

			field1102.method199(field1214.field541 + 36 + 1 + 1);
			field1102.method199(215);
			field1102.method199(field1249 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1102.method203(field1108[var5]);
			}

			field1102.method207(field1214.field540, 0, field1214.field541);
			field1214.field545 = new class46(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1293 = new class46(var4);
			field982.method33(field1102.field540, field1102.field541, 0);
			int var7 = field982.method30();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method469(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field945 = true;
				} else {
					field945 = false;
				}

				class5.method35(false);
				field1133 = true;
				field1214.field541 = 0;
				field1242.field541 = 0;
				field1061 = -1;
				field1172 = -1;
				field1173 = -1;
				field1174 = -1;
				field1060 = 0;
				field1062 = 0;
				field974 = 0;
				field1064 = 0;
				field1075 = 0;
				field997 = 0;
				field943 = false;
				field13 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field1147[var8] = null;
				}

				field1175 = 0;
				field1252 = 0;
				field1210 = 0;
				field1109 = 0;
				field975 = (int) (Math.random() * 100.0D) - 50;
				field948 = (int) (Math.random() * 110.0D) - 55;
				field1184 = (int) (Math.random() * 80.0D) - 40;
				field990 = (int) (Math.random() * 120.0D) - 60;
				field1329 = (int) (Math.random() * 30.0D) - 20;
				field1008 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1071 = -1;
				field1082 = 0;
				field1083 = 0;
				field1154 = 0;
				field963 = 0;

				for (int var9 = 0; var9 < field1151; var9++) {
					field1153[var9] = null;
					field1158[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field962[var10] = null;
				}

				field1171 = field1153[field1152] = new class26();
				field1070.method232();
				field1334.method232();
				field999.method232();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1298[var11][var12][var13] = null;
						}
					}
				}

				field1245 = new class41();
				field1300 = 0;
				field1046 = -1;
				field942 = -1;
				field1265 = -1;
				field1194 = -1;
				field1150 = false;
				field1189 = 3;
				field1299 = false;
				field943 = false;
				field1136 = false;
				field1032 = null;
				field1027 = 0;
				field1106 = -1;
				field1124 = true;
				method487();

				for (int var14 = 0; var14 < 5; var14++) {
					field1094[var14] = 0;
				}

				field1229 = 0;
				field951 = 0;
				field1088 = 0;
				field1052 = 0;
				field1186 = 0;
				field1135 = 0;
				field971 = 0;
				field988 = 0;
				field1012 = 0;
				method373();
				return;
			}

			if (var7 == 3) {
				field1216 = "";
				field1217 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field1216 = "Your account has been disabled.";
				field1217 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field1216 = "Your account is already logged in.";
				field1217 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field1216 = "RuneScape has been updated!";
				field1217 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field1216 = "This world is full.";
				field1217 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field1216 = "Unable to connect.";
				field1217 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field1216 = "Login limit exceeded.";
				field1217 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field1216 = "Unable to connect.";
				field1217 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field1217 = "Login server rejected session.";
				field1217 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field1216 = "You need a members account to login to this world.";
				field1217 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field1216 = "Could not complete login.";
				field1217 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field1216 = "The server is being updated.";
				field1217 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field1133 = true;
				field1214.field541 = 0;
				field1242.field541 = 0;
				field1061 = -1;
				field1172 = -1;
				field1173 = -1;
				field1174 = -1;
				field1060 = 0;
				field1062 = 0;
				field974 = 0;
				field997 = 0;
				field943 = false;
				return;
			}

			if (var7 == 16) {
				field1216 = "Login attempts exceeded.";
				field1217 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field1216 = "You are standing in a members-only area.";
				field1217 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field1216 = "";
			field1217 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method470() {
		field1219 = 0;
		for (int var1 = -1; var1 < field963 + field1154; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field1171;
			} else if (var1 < field1154) {
				var2 = field1153[field1155[var1]];
			} else {
				var2 = field962[field964[var1 - field1154]];
			}

			if (var2 != null && var2.method111()) {
				if (var1 < field1154) {
					int var3 = 30;
					class26 var4 = (class26) var2;
					if (var4.field324 != 0) {
						method377(var2.field313 + 15, var2);

						if (field1121 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field324 & 1 << var5) != 0) {
									field1000[var5].method173(field1122 - var3, field1121 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1075 == 10 && field1155[var1] == field1215) {
						method377(var2.field313 + 15, var2);

						if (field1121 > -1) {
							field1000[7].method173(field1122 - var3, field1121 - 12);
						}
					}
				} else if (field1075 == 1 && field964[var1 - field1154] == field946 && field1134 % 20 < 10) {
					method377(var2.field313 + 15, var2);

					if (field1121 > -1) {
						field1000[2].method173(field1122 - 28, field1121 - 12);
					}
				}

				if (var2.field280 != null && (var1 >= field1154 || field981 == 0 || field981 == 1 && method437(((class26) var2).field321))) {
					method377(var2.field313, var2);

					if (field1121 > -1 && field1219 < field1220) {
						field1224[field1219] = field1091.method190(var2.field280) / 2;
						field1223[field1219] = field1091.field538;
						field1221[field1219] = field1121;
						field1222[field1219] = field1122;
						field1225[field1219] = var2.field282;
						field1226[field1219] = var2.field283;
						field1227[field1219] = var2.field281;
						field1228[field1219++] = var2.field280;

						if (field1067 == 0 && var2.field283 == 1) {
							field1223[field1219] += 10;
							field1222[field1219] += 5;
						}

						if (field1067 == 0 && var2.field283 == 2) {
							field1224[field1219] = 60;
						}
					}
				}

				if (var2.field286 > field1134 + 100) {
					method377(var2.field313 + 15, var2);

					if (field1121 > -1) {
						int var6 = var2.field287 * 30 / var2.field288;
						if (var6 > 30) {
							var6 = 30;
						}

						class32.method149(0xFF00, var6, field1122 - 3, 5, field1121 - 15);
						class32.method149(0xFF0000, 30 - var6, field1122 - 3, 5, field1121 + var6 - 15);
					}
				}

				if (var2.field286 > field1134 + 330) {
					method377(var2.field313 / 2, var2);

					if (field1121 > -1) {
						field978[var2.field285].method173(field1122 - 12, field1121 - 12);
						field1089.method188(0, String.valueOf(var2.field284), field1122 + 4, field1121);
						field1089.method188(0xFFFFFF, String.valueOf(var2.field284), field1122 + 3, field1121 - 1);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field1219; var7++) {
			int var8 = field1221[var7];
			int var9 = field1222[var7];
			int var10 = field1224[var7];
			int var11 = field1223[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field1222[var13] - field1223[var13] && var9 - var11 < field1222[var13] + 2 && var8 - var10 < field1224[var13] + field1221[var13] && var8 + var10 > field1221[var13] - field1224[var13] && field1222[var13] - field1223[var13] < var9) {
						var9 = field1222[var13] - field1223[var13];
						var12 = true;
					}
				}
			}

			field1121 = field1221[var7];
			field1122 = field1222[var7] = var9;
			String var14 = field1228[var7];
			if (field1067 == 0) {
				int var15 = 0xFFFF00;
				if (field1225[var7] < 6) {
					var15 = field1030[field1225[var7]];
				}

				if (field1225[var7] == 6) {
					var15 = field1231 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1225[var7] == 7) {
					var15 = field1231 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1225[var7] == 8) {
					var15 = field1231 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1225[var7] == 9) {
					int var16 = 150 - field1227[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1225[var7] == 10) {
					int var17 = 150 - field1227[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1225[var7] == 11) {
					int var18 = 150 - field1227[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1226[var7] == 0) {
					field1091.method188(0, var14, field1122 + 1, field1121);
					field1091.method188(var15, var14, field1122, field1121);
				}

				if (field1226[var7] == 1) {
					field1091.method192(field1122 + 1, field1121, 0, var14, field1231);
					field1091.method192(field1122, field1121, var15, var14, field1231);
				}

				if (field1226[var7] == 2) {
					int var19 = field1091.method190(var14);
					int var20 = (150 - field1227[var7]) * (var19 + 100) / 150;
					class32.method147(0, field1121 - 50, 334, field1121 + 50);
					field1091.method191(field1121 + 50 - var20, field1122 + 1, var14, 0);
					field1091.method191(field1121 + 50 - var20, field1122, var14, var15);
					class32.method146();
				}
			} else {
				field1091.method188(0, var14, field1122 + 1, field1121);
				field1091.method188(0xFFFF00, var14, field1122, field1121);
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;II)V")
	public final void method471(int arg0, String arg1, int arg2) {
		if (arg1 != null) {
			synchronized (field1193) {
				field979 = arg1;
				field1034 = arg2;
				field955 = arg0;
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method472() {
		field1214.method198(153);

		if (field1194 != -1) {
			field1194 = -1;
			field1104 = true;
			field1150 = false;
			field1211 = true;
		}

		if (field942 != -1) {
			field942 = -1;
			field1181 = true;
			field1150 = false;
		}

		field1265 = -1;
	}

	@ObfuscatedName("client.a(Lkb;IILz;I)V")
	public final void method473(class37 arg0, int arg1, class26 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg0.method209();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg0.method218(0, var6, var5);
			field1158[arg1] = var7;
			arg2.method113(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg0.method211();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field295 == var8) {
				arg2.field299 = 0;
			}

			int var9 = arg0.method209();
			if (var8 == -1 || arg2.field295 == -1 || class62.field896[var8].field904 > class62.field896[arg2.field295].field904 || class62.field896[arg2.field295].field904 == 0) {
				arg2.field295 = var8;
				arg2.field296 = 0;
				arg2.field297 = 0;
				arg2.field298 = var9;
				arg2.field299 = 0;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg2.field289 = arg0.method211();
			if (arg2.field289 == 0xFFFF) {
				arg2.field289 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg2.field280 = arg0.method216();
			arg2.field282 = 0;
			arg2.field283 = 0;
			arg2.field281 = 150;
			method431(arg2.field280, arg2.field321, 2);
		}

		if ((arg3 & 0x10) == 0x10) {
			arg2.field284 = arg0.method209();
			arg2.field285 = arg0.method209();
			arg2.field286 = field1134 + 400;
			arg2.field287 = arg0.method209();
			arg2.field288 = arg0.method209();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg2.field290 = arg0.method211();
			arg2.field291 = arg0.method211();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var10 = arg0.method211();
			int var11 = arg0.method209();
			int var12 = arg0.method209();
			int var13 = arg0.field541;

			if (arg2.field321 != null) {
				long var14 = class48.method251(arg2.field321);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1209; var17++) {
						if (field1304[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1182 == 0) {
					try {
						String var18 = class49.method258(arg0, var12);
						var18 = class65.method335(var18);
						arg2.field280 = var18;
						arg2.field282 = var10 >> 8;
						arg2.field283 = var10 & 0xFF;
						arg2.field281 = 150;

						if (var11 > 1) {
							method431(var18, arg2.field321, 1);
						} else {
							method431(var18, arg2.field321, 2);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field541 = var12 + var13;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg2.field300 = arg0.method211();
			int var20 = arg0.method214();
			arg2.field304 = var20 >> 16;
			arg2.field303 = (var20 & 0xFFFF) + field1134;
			arg2.field301 = 0;
			arg2.field302 = 0;

			if (arg2.field303 > field1134) {
				arg2.field301 = -1;
			}

			if (arg2.field300 == 0xFFFF) {
				arg2.field300 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg2.field305 = arg0.method209();
			arg2.field307 = arg0.method209();
			arg2.field306 = arg0.method209();
			arg2.field308 = arg0.method209();
			arg2.field309 = arg0.method211() + field1134;
			arg2.field310 = arg0.method211() + field1134;
			arg2.field311 = arg0.method209();
			arg2.field315 = 0;
			arg2.field316[0] = arg2.field306;
			arg2.field317[0] = arg2.field308;
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method474() {
		for (int var1 = 0; var1 < field963; var1++) {
			int var2 = field964[var1];
			class25 var3 = field962[var2];
			if (var3 != null) {
				method475(var3.field320.field743, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILx;)V")
	public final void method475(int arg0, class24 arg1) {
		if (arg1.field268 < 128 || arg1.field269 < 128 || arg1.field268 >= 13184 || arg1.field269 >= 13184) {
			arg1.field295 = -1;
			arg1.field300 = -1;
			arg1.field309 = 0;
			arg1.field310 = 0;
			arg1.field268 = arg1.field316[0] * 128 + arg1.field272 * 64;
			arg1.field269 = arg1.field317[0] * 128 + arg1.field272 * 64;
			arg1.field315 = 0;
		}

		if (field1171 == arg1 && (arg1.field268 < 1536 || arg1.field269 < 1536 || arg1.field268 >= 11776 || arg1.field269 >= 11776)) {
			arg1.field295 = -1;
			arg1.field300 = -1;
			arg1.field309 = 0;
			arg1.field310 = 0;
			arg1.field268 = arg1.field316[0] * 128 + arg1.field272 * 64;
			arg1.field269 = arg1.field317[0] * 128 + arg1.field272 * 64;
			arg1.field315 = 0;
		}

		if (arg1.field309 > field1134) {
			method476(arg1);
		} else if (arg1.field310 >= field1134) {
			method477(arg1);
		} else {
			method478(arg1);
		}

		method479(arg1);
		method480(arg1);
	}

	@ObfuscatedName("client.a(BLx;)V")
	public final void method476(class24 arg0) {
		int var2 = arg0.field309 - field1134;
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
	public final void method477(class24 arg0) {
		if (field1134 == arg0.field310 || arg0.field295 == -1 || arg0.field298 != 0 || arg0.field297 + 1 > class62.field896[arg0.field295].field900[arg0.field296]) {
			int var2 = arg0.field310 - arg0.field309;
			int var3 = field1134 - arg0.field309;
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

	@ObfuscatedName("client.a(Lx;I)V")
	public final void method478(class24 arg0) {
		arg0.field292 = arg0.field273;
		if (arg0.field315 == 0) {
			arg0.field319 = 0;
		} else {
			if (arg0.field295 != -1 && arg0.field298 == 0) {
				class62 var2 = class62.field896[arg0.field295];
				if (var2.field902 == null) {
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

	@ObfuscatedName("client.b(ILx;)V")
	public final void method479(class24 arg0) {
		if (arg0.field289 != -1 && arg0.field289 < 32768) {
			class25 var2 = field962[arg0.field289];
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
			if (field995 == var5) {
				var5 = field1152;
			}

			class26 var6 = field1153[var5];
			if (var6 != null) {
				int var7 = arg0.field268 - var6.field268;
				int var8 = arg0.field269 - var6.field269;
				if (var7 != 0 || var8 != 0) {
					arg0.field314 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field290 != 0 || arg0.field291 != 0) && (arg0.field315 == 0 || arg0.field319 > 0)) {
			int var9 = arg0.field268 - (arg0.field290 - field1161 - field1161) * 64;
			int var10 = arg0.field269 - (arg0.field291 - field1162 - field1162) * 64;
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

	@ObfuscatedName("client.b(Lx;I)V")
	public final void method480(class24 arg0) {
		arg0.field271 = false;

		if (arg0.field292 != -1) {
			class62 var2 = class62.field896[arg0.field292];
			arg0.field294++;
			if (arg0.field293 < var2.field897 && arg0.field294 > var2.field900[arg0.field293]) {
				arg0.field294 = 0;
				arg0.field293++;
			}

			if (arg0.field293 >= var2.field897) {
				arg0.field294 = 0;
				arg0.field293 = 0;
			}
		}

		if (arg0.field295 != -1 && arg0.field298 == 0) {
			class62 var3 = class62.field896[arg0.field295];
			arg0.field297++;
			while (arg0.field296 < var3.field897 && arg0.field297 > var3.field900[arg0.field296]) {
				arg0.field297 -= var3.field900[arg0.field296];
				arg0.field296++;
			}

			if (arg0.field296 >= var3.field897) {
				arg0.field296 -= var3.field901;
				arg0.field299++;
				if (arg0.field299 >= var3.field907) {
					arg0.field295 = -1;
				}

				if (arg0.field296 < 0 || arg0.field296 >= var3.field897) {
					arg0.field295 = -1;
				}
			}

			arg0.field271 = var3.field903;
		}

		if (arg0.field298 > 0) {
			arg0.field298--;
		}

		if (arg0.field300 != -1 && field1134 >= arg0.field303) {
			if (arg0.field301 < 0) {
				arg0.field301 = 0;
			}

			class62 var4 = class63.field909[arg0.field300].field912;
			arg0.field302++;
			while (arg0.field301 < var4.field897 && arg0.field302 > var4.field900[arg0.field301]) {
				arg0.field302 -= var4.field900[arg0.field301];
				arg0.field301++;
			}

			if (arg0.field301 >= var4.field897) {
				if (arg0.field301 < 0 || arg0.field301 >= var4.field897) {
					arg0.field300 = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method481() {
		if (field1099) {
			field1099 = false;
			field1036.method236(11, field8, 0);
			field1037.method236(375, field8, 0);
			field1038.method236(5, field8, 729);
			field1039.method236(231, field8, 752);
			field1040.method236(0, field8, 0);
			field1041.method236(0, field8, 561);
			field1042.method236(11, field8, 520);
			field1043.method236(231, field8, 520);
			field1044.method236(375, field8, 501);
			field1045.method236(345, field8, 0);
			field1104 = true;
			field1181 = true;
			field1211 = true;
			field1077 = true;

			if (field1210 != 2) {
				field1015.method236(11, field8, 8);
				field1014.method236(5, field8, 561);
			}
		}

		if (field1210 == 2) {
			method405();
		}

		if (field943 && field1276 == 1) {
			field1104 = true;
		}

		if (field1194 != -1) {
			boolean var1 = method409(field1194, field1103);
			if (var1) {
				field1104 = true;
			}
		}

		if (field1058 == 2) {
			field1104 = true;
		}

		if (field1326 == 2) {
			field1104 = true;
		}

		if (field1104) {
			method371();
			field1104 = false;
		}

		if (field942 == -1) {
			field1241.field849 = field1126 - field1033 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method368(field15 - 22, field1126, 0, 77, 463, false, field1241, field16 - 375);
			}

			int var2 = field1126 - field1241.field849 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1126 - 77) {
				var2 = field1126 - 77;
			}

			if (field1033 != var2) {
				field1033 = var2;
				field1181 = true;
			}

			field950++;
			if (field950 > 87) {
				field950 = 0;
				field1214.method198(225);
			}
		}

		if (field942 != -1) {
			boolean var3 = method409(field942, field1103);
			if (var3) {
				field1181 = true;
			}
		}

		if (field1058 == 3) {
			field1181 = true;
		}

		if (field1326 == 3) {
			field1181 = true;
		}

		if (field1032 != null) {
			field1181 = true;
		}

		if (field943 && field1276 == 2) {
			field1181 = true;
		}

		if (field1181) {
			method468();
			field1181 = false;
		}

		if (field1210 == 2) {
			method454();
			field1014.method236(5, field8, 561);
		}

		if (field1106 != -1) {
			field1211 = true;
		}

		if (field1211) {
			if (field1106 != -1 && field1189 == field1106) {
				field1106 = -1;
				field1214.method198(50);
				field1214.method199(field1189);
			}

			field1211 = false;
			field1167.method235();
			field1337.method186(0, 0);

			if (field1194 == -1) {
				if (field1132[field1189] != -1) {
					if (field1189 == 0) {
						field1199.method186(30, 29);
					}

					if (field1189 == 1) {
						field1200.method186(29, 59);
					}

					if (field1189 == 2) {
						field1200.method186(29, 87);
					}

					if (field1189 == 3) {
						field1201.method186(29, 115);
					}

					if (field1189 == 4) {
						field1203.method186(29, 156);
					}

					if (field1189 == 5) {
						field1203.method186(29, 184);
					}

					if (field1189 == 6) {
						field1202.method186(30, 212);
					}
				}

				if (field1132[0] != -1 && (field1106 != 0 || field1134 % 20 < 10)) {
					field1232[0].method186(34, 35);
				}

				if (field1132[1] != -1 && (field1106 != 1 || field1134 % 20 < 10)) {
					field1232[1].method186(32, 59);
				}

				if (field1132[2] != -1 && (field1106 != 2 || field1134 % 20 < 10)) {
					field1232[2].method186(32, 86);
				}

				if (field1132[3] != -1 && (field1106 != 3 || field1134 % 20 < 10)) {
					field1232[3].method186(33, 121);
				}

				if (field1132[4] != -1 && (field1106 != 4 || field1134 % 20 < 10)) {
					field1232[4].method186(34, 157);
				}

				if (field1132[5] != -1 && (field1106 != 5 || field1134 % 20 < 10)) {
					field1232[5].method186(32, 185);
				}

				if (field1132[6] != -1 && (field1106 != 6 || field1134 % 20 < 10)) {
					field1232[6].method186(34, 212);
				}
			}

			field1167.method236(165, field8, 520);
			field1166.method235();
			field1336.method186(0, 0);

			if (field1194 == -1) {
				if (field1132[field1189] != -1) {
					if (field1189 == 7) {
						field1283.method186(0, 49);
					}

					if (field1189 == 8) {
						field1284.method186(0, 81);
					}

					if (field1189 == 9) {
						field1284.method186(0, 108);
					}

					if (field1189 == 10) {
						field1285.method186(1, 136);
					}

					if (field1189 == 11) {
						field1287.method186(0, 178);
					}

					if (field1189 == 12) {
						field1287.method186(0, 205);
					}

					if (field1189 == 13) {
						field1286.method186(0, 233);
					}
				}

				if (field1132[8] != -1 && (field1106 != 8 || field1134 % 20 < 10)) {
					field1232[7].method186(2, 80);
				}

				if (field1132[9] != -1 && (field1106 != 9 || field1134 % 20 < 10)) {
					field1232[8].method186(3, 107);
				}

				if (field1132[10] != -1 && (field1106 != 10 || field1134 % 20 < 10)) {
					field1232[9].method186(4, 142);
				}

				if (field1132[11] != -1 && (field1106 != 11 || field1134 % 20 < 10)) {
					field1232[10].method186(2, 179);
				}

				if (field1132[12] != -1 && (field1106 != 12 || field1134 % 20 < 10)) {
					field1232[11].method186(2, 206);
				}

				if (field1132[13] != -1 && (field1106 != 13 || field1134 % 20 < 10)) {
					field1232[12].method186(2, 230);
				}
			}

			field1166.method236(492, field8, 501);
			field1015.method235();
		}

		if (field1077) {
			field1077 = false;
			field1165.method235();
			field1335.method186(0, 0);
			field1090.method189(33, 0xFFFFFF, 57, "Public chat", true);

			if (field981 == 0) {
				field1090.method189(46, 0xFF00, 57, "On", true);
			}

			if (field981 == 1) {
				field1090.method189(46, 0xFFFF00, 57, "Friends", true);
			}

			if (field981 == 2) {
				field1090.method189(46, 0xFF0000, 57, "Off", true);
			}

			field1090.method189(33, 0xFFFFFF, 186, "Private chat", true);

			if (field1035 == 0) {
				field1090.method189(46, 0xFF00, 186, "On", true);
			}

			if (field1035 == 1) {
				field1090.method189(46, 0xFFFF00, 186, "Friends", true);
			}

			if (field1035 == 2) {
				field1090.method189(46, 0xFF0000, 186, "Off", true);
			}

			field1090.method189(33, 0xFFFFFF, 326, "Trade/duel", true);

			if (field1192 == 0) {
				field1090.method189(46, 0xFF00, 326, "On", true);
			}

			if (field1192 == 1) {
				field1090.method189(46, 0xFFFF00, 326, "Friends", true);
			}

			if (field1192 == 2) {
				field1090.method189(46, 0xFF0000, 326, "Off", true);
			}

			field1090.method189(38, 0xFFFFFF, 462, "Report abuse", true);
			field1165.method236(471, field8, 0);
			field1015.method235();
		}

		field1103 = 0;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 215);

			if (arg0.length == 4) {
				field1246 = Integer.parseInt(arg0[0]);
				field1247 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method399();
				} else if (arg0[2].equals("highmem")) {
					method400();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					field1248 = false;
				} else if (arg0[3].equals("members")) {
					field1248 = true;
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

	@ObfuscatedName("client.a(IBLkb;)V")
	public final void method482(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field1156; var3++) {
			int var4 = field1157[var3];
			class25 var5 = field962[var4];
			int var6 = arg1.method209();
			if ((var6 & 0x2) == 2) {
				int var7 = arg1.method211();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field295 == var7) {
					var5.field299 = 0;
				}

				int var8 = arg1.method209();
				if (var7 == -1 || var5.field295 == -1 || class62.field896[var7].field904 > class62.field896[var5.field295].field904 || class62.field896[var5.field295].field904 == 0) {
					var5.field295 = var7;
					var5.field296 = 0;
					var5.field297 = 0;
					var5.field298 = var8;
					var5.field299 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field289 = arg1.method211();
				if (var5.field289 == 0xFFFF) {
					var5.field289 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field280 = arg1.method216();
				var5.field281 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field284 = arg1.method209();
				var5.field285 = arg1.method209();
				var5.field286 = field1134 + 400;
				var5.field287 = arg1.method209();
				var5.field288 = arg1.method209();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field320 = class54.method281(arg1.method211());
				var5.field275 = var5.field320.field747;
				var5.field276 = var5.field320.field748;
				var5.field277 = var5.field320.field749;
				var5.field278 = var5.field320.field750;
				var5.field273 = var5.field320.field746;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field300 = arg1.method211();
				int var9 = arg1.method214();
				var5.field304 = var9 >> 16;
				var5.field303 = (var9 & 0xFFFF) + field1134;
				var5.field301 = 0;
				var5.field302 = 0;

				if (var5.field303 > field1134) {
					var5.field301 = -1;
				}

				if (var5.field300 == 0xFFFF) {
					var5.field300 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field290 = arg1.method211();
				var5.field291 = arg1.method211();
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (!field1249) {
			field1048 = true;
			field1111 = true;
			method12(this, 2);
			method471(40000, "scape_main", 12345678);
		}

		if (field1218) {
			field1029 = true;
		} else {
			field1218 = true;
			boolean var1 = false;
			String var2 = method453();
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
					field1108[8] = 0;
					while (field1108[8] == 0) {
						method13(10, "Connecting to fileserver");

						try {
							DataInputStream var4 = method363("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[36]);
							var4.readFully(var5.field540, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								field1108[var6] = var5.method214();
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

					field1073 = method449("title screen", 10, field1108[1], "title");
					field1089 = new class36(field1073, "p11", -17780);
					field1090 = new class36(field1073, "p12", -17780);
					field1091 = new class36(field1073, "b12", -17780);
					field1092 = new class36(field1073, "q8", -17780);
					method412();
					method407();
					class47 var8 = method449("config", 15, field1108[2], "config");
					class47 var9 = method449("interface", 20, field1108[3], "interface");
					class47 var10 = method449("2d graphics", 30, field1108[4], "media");
					class47 var11 = method449("3d graphics", 40, field1108[5], "models");
					class47 var12 = method449("textures", 60, field1108[6], "textures");
					class47 var13 = method449("chat system", 65, field1108[7], "wordenc");
					class47 var14 = method449("sound effects", 70, field1108[8], "sounds");
					field1087 = new byte[4][104][104];
					field980 = new int[4][105][105];
					field998 = new class18(4, field980, 104, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field983[var15] = new class57(104, 104);
					}

					field1084 = new class34(512, 512);
					method13(75, "Unpacking media");
					field1001 = new class35(var10, "invback", 0);
					field1003 = new class35(var10, "chatback", 0);
					field1002 = new class35(var10, "mapback", 0);
					field1335 = new class35(var10, "backbase1", 0);
					field1336 = new class35(var10, "backbase2", 0);
					field1337 = new class35(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						field1232[var16] = new class35(var10, "sideicons", var16);
					}

					field1100 = new class34(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							field1159[var17] = new class35(var10, "mapscene", var17);
						}
					} catch (Exception var53) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							field1306[var18] = new class34(var10, "mapfunction", var18);
						}
					} catch (Exception var52) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							field978[var19] = new class34(var10, "hitmarks", var19);
						}
					} catch (Exception var51) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							field1000[var20] = new class34(var10, "headicons", var20);
						}
					} catch (Exception var50) {
					}

					field1180 = new class34(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						field1069[var21] = new class34(var10, "cross", var21);
					}

					field984 = new class34(var10, "mapdots", 0);
					field985 = new class34(var10, "mapdots", 1);
					field986 = new class34(var10, "mapdots", 2);
					field987 = new class34(var10, "mapdots", 3);
					field1195 = new class35(var10, "scrollbar", 0);
					field1196 = new class35(var10, "scrollbar", 1);
					field1199 = new class35(var10, "redstone1", 0);
					field1200 = new class35(var10, "redstone2", 0);
					field1201 = new class35(var10, "redstone3", 0);
					field1202 = new class35(var10, "redstone1", 0);
					field1202.method184();
					field1203 = new class35(var10, "redstone2", 0);
					field1203.method184();
					field1283 = new class35(var10, "redstone1", 0);
					field1283.method185();
					field1284 = new class35(var10, "redstone2", 0);
					field1284.method185();
					field1285 = new class35(var10, "redstone3", 0);
					field1285.method185();
					field1286 = new class35(var10, "redstone1", 0);
					field1286.method184();
					field1286.method185();
					field1287 = new class35(var10, "redstone2", 0);
					field1287.method184();
					field1287.method185();
					class34 var22 = new class34(var10, "backleft1", 0);
					field1036 = new class43(var22.field517, method11(), var22.field516);
					var22.method171(0, 0);
					class34 var23 = new class34(var10, "backleft2", 0);
					field1037 = new class43(var23.field517, method11(), var23.field516);
					var23.method171(0, 0);
					class34 var24 = new class34(var10, "backright1", 0);
					field1038 = new class43(var24.field517, method11(), var24.field516);
					var24.method171(0, 0);
					class34 var25 = new class34(var10, "backright2", 0);
					field1039 = new class43(var25.field517, method11(), var25.field516);
					var25.method171(0, 0);
					class34 var26 = new class34(var10, "backtop1", 0);
					field1040 = new class43(var26.field517, method11(), var26.field516);
					var26.method171(0, 0);
					class34 var27 = new class34(var10, "backtop2", 0);
					field1041 = new class43(var27.field517, method11(), var27.field516);
					var27.method171(0, 0);
					class34 var28 = new class34(var10, "backvmid1", 0);
					field1042 = new class43(var28.field517, method11(), var28.field516);
					var28.method171(0, 0);
					class34 var29 = new class34(var10, "backvmid2", 0);
					field1043 = new class43(var29.field517, method11(), var29.field516);
					var29.method171(0, 0);
					class34 var30 = new class34(var10, "backvmid3", 0);
					field1044 = new class43(var30.field517, method11(), var30.field516);
					var30.method171(0, 0);
					class34 var31 = new class34(var10, "backhmid2", 0);
					field1045 = new class43(var31.field517, method11(), var31.field516);
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
					class55.field768 = field1248;

					if (!field1249) {
						method13(90, "Unpacking sounds");
						byte[] var32 = var14.method250(null, "sounds.dat");
						class37 var33 = new class37(var32);
						class51.method263(var33);
					}

					method13(92, "Unpacking interfaces");
					class36[] var34 = new class36[] { field1089, field1090, field1091, field1092 };
					class60.method314(var9, var34, var10);
					method13(97, "Preparing game engine");

					for (int var35 = 0; var35 < 33; var35++) {
						int var36 = 999;
						int var37 = 0;
						for (int var38 = 0; var38 < 35; var38++) {
							if (field1002.field522[field1002.field524 * var35 + var38] == 0) {
								if (var36 == 999) {
									var36 = var38;
								}
							} else if (var36 != 999) {
								var37 = var38;
								break;
							}
						}

						field1256[var35] = var36;
						field1011[var35] = var37 - var36;
					}

					for (int var39 = 9; var39 < 160; var39++) {
						int var40 = 999;
						int var41 = 0;
						for (int var42 = 10; var42 < 168; var42++) {
							if (field1002.field522[field1002.field524 * var39 + var42] == 0 && (var42 > 34 || var39 > 34)) {
								if (var40 == 999) {
									var40 = var42;
								}
							} else if (var40 != 999) {
								var41 = var42;
								break;
							}
						}

						field970[var39 - 9] = var40 - 21;
						field1213[var39 - 9] = var41 - var40;
					}

					class33.method155(96, 479);
					field1095 = class33.field503;
					class33.method155(261, 190);
					field1096 = class33.field503;
					class33.method155(334, 512);
					field1097 = class33.field503;
					int[] var43 = new int[9];
					for (int var44 = 0; var44 < 9; var44++) {
						int var45 = var44 * 32 + 128 + 15;
						int var46 = var45 * 3 + 600;
						int var47 = class33.field501[var45];
						var43[var44] = var46 * var47 >> 16;
					}

					class18.method87(334, 512, var43, 800, 500);
					class65.method325(var13);
				} catch (Exception var55) {
					field1244 = true;
				}
			} else {
				field1072 = true;
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method483() {
		field1048 = false;

		while (field1111) {
			try {
				Thread.sleep(50L);
			} catch (Exception var15) {
			}

			String var2;
			int var3;
			int var4;
			synchronized (field1193) {
				var2 = field979;
				var3 = field1034;
				var4 = field955;
				field979 = null;
				field1034 = 0;
				field955 = 0;
			}

			if (var2 != null) {
				byte[] var5 = signlink.cacheload(var2 + ".mid");
				if (var5 != null && var3 != 12345678) {
					field1105.reset();
					field1105.update(var5);
					int var6 = (int) field1105.getValue();
					if (var3 != var6) {
						var5 = null;
					}
				}

				if (var5 == null) {
					try {
						DataInputStream var7 = method363(var2 + "_" + var3 + ".mid");
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
				method418(var13, var12, true);
			}
		}
	}

	@ObfuscatedName("client.c(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field11 != null) {
			return field11;
		}

		return this;
	}

	@ObfuscatedName("client.N(I)V")
	public final void method484() {
		short var1 = 256;

		if (field1272 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1272 > 768) {
					field958[var2] = method376(field960[var2], 1024 - field1272, field959[var2]);
				} else if (field1272 > 256) {
					field958[var2] = field960[var2];
				} else {
					field958[var2] = method376(field959[var2], 256 - field1272, field960[var2]);
				}
			}
		} else if (field1273 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1273 > 768) {
					field958[var3] = method376(field961[var3], 1024 - field1273, field959[var3]);
				} else if (field1273 > 256) {
					field958[var3] = field961[var3];
				} else {
					field958[var3] = method376(field959[var3], 256 - field1273, field961[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field958[var4] = field959[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1020.field581[var5] = field1141.field515[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1149[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1288[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field958[var12];
					int var15 = field1020.field581[var7];
					field1020.field581[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1020.method236(0, field8, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1021.field581[var16] = field1142.field515[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1149[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1288[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field958[var23];
					int var26 = field1021.field581[var18];
					field1021.field581[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1021.method236(0, field8, 661);
	}

	@ObfuscatedName("client.a(ILhc;I)I")
	public final int method485(int arg0, class60 arg1) {
		if (arg1.field844 == null || arg0 >= arg1.field844.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field844[arg0];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field944[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field993[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1230[var3[var5++]];
				}

				if (var6 == 4) {
					class60 var7 = class60.field830[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field831.length; var9++) {
						if (var7.field831[var9] == var8) {
							var4 += var7.field832[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field1137[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1290[field993[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1137[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1171.field327;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field993[var10];
					}
				}

				if (var6 == 10) {
					class60 var11 = class60.field830[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field831.length; var13++) {
						if (var11.field831[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field992;
				}

				if (var6 == 12) {
					var4 += field956;
				}

				if (var6 == 13) {
					int var14 = field1137[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.c(IILkb;)V")
	public final void method486(int arg0, class37 arg1) {
		while (arg1.field542 + 10 < arg0 * 8) {
			int var3 = arg1.method220(11);
			if (var3 == 2047) {
				break;
			}

			if (field1153[var3] == null) {
				field1153[var3] = new class26();
				if (field1158[var3] != null) {
					field1153[var3].method113(field1158[var3]);
				}
			}

			field1155[field1154++] = var3;
			class26 var4 = field1153[var3];
			var4.field312 = field1134;
			int var5 = arg1.method220(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method220(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method220(1);
			var4.method109(field1171.field316[0] + var5, var7 == 1, field1171.field317[0] + var6);
			int var8 = arg1.method220(1);
			if (var8 == 1) {
				field1157[field1156++] = var3;
			}
		}

		arg1.method221();
	}

	@ObfuscatedName("client.O(I)V")
	public final void method487() {
		field1123 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1275[var1] = -1;
			for (int var2 = 0; var2 < class59.field822; var2++) {
				if (!class59.field823[var2].field829 && class59.field823[var2].field824 == var1 + (field1124 ? 0 : 7)) {
					field1275[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method488(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		int var6 = arg0;
		if (arg0 < 3 && (field1087[1][var4][var5] & 0x2) == 2) {
			var6 = arg0 + 1;
		}

		int var7 = arg2 & 0x7F;
		int var8 = arg1 & 0x7F;
		int var9 = (128 - var7) * field980[var6][var4][var5] + field980[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field980[var6][var4][var5 + 1] + field980[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1290[var1] = var0 / 4;
		}
	}
}
