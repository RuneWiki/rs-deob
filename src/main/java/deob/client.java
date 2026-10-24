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
	public static int field966;

	@ObfuscatedName("client.bb")
	public String field967 = "";

	@ObfuscatedName("client.cb")
	public int field968;

	@ObfuscatedName("client.db")
	public int field969;

	@ObfuscatedName("client.eb")
	public class34 field970;

	@ObfuscatedName("client.fb")
	public class34[] field971 = new class34[1000];

	@ObfuscatedName("client.gb")
	public int field972 = 0x23201B;

	@ObfuscatedName("client.hb")
	public boolean field973 = false;

	@ObfuscatedName("client.ib")
	public boolean field974 = false;

	@ObfuscatedName("client.jb")
	public boolean field975 = false;

	@ObfuscatedName("client.lb")
	public int field976 = -1;

	@ObfuscatedName("client.mb")
	public boolean field977 = false;

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
	public boolean field983 = false;

	@ObfuscatedName("client.tb")
	public int field984;

	@ObfuscatedName("client.ub")
	public class35 field985;

	@ObfuscatedName("client.vb")
	public class35 field986;

	@ObfuscatedName("client.wb")
	public class35 field987;

	@ObfuscatedName("client.xb")
	public int[] field988 = new int[50];

	@ObfuscatedName("client.yb")
	public int field989 = -1;

	@ObfuscatedName("client.zb")
	public int field990;

	@ObfuscatedName("client.ac")
	public class4 field1009;

	@ObfuscatedName("client.bc")
	public int field1010;

	@ObfuscatedName("client.cc")
	public int field1011;

	@ObfuscatedName("client.dc")
	public int field1012;

	@ObfuscatedName("client.ec")
	public int field1013;

	@ObfuscatedName("client.fc")
	public int field1014;

	@ObfuscatedName("client.gc")
	public int[] field1015 = new int[33];

	@ObfuscatedName("client.hc")
	public int field1016 = -1;

	@ObfuscatedName("client.ic")
	public int field1017;

	@ObfuscatedName("client.jc")
	public int[] field1018 = new int[50];

	@ObfuscatedName("client.kc")
	public static final int[] field1019 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.lc")
	public int field1020;

	@ObfuscatedName("client.mc")
	public int[] field1021 = new int[33];

	@ObfuscatedName("client.C")
	public String field942 = "";

	@ObfuscatedName("client.I")
	public int field948 = 128;

	@ObfuscatedName("client.M")
	public class41 field952 = new class41();

	@ObfuscatedName("client.N")
	public boolean field953 = false;

	@ObfuscatedName("client.P")
	public byte[] field955 = new byte[16384];

	@ObfuscatedName("client.Q")
	public int[] field956 = new int[4000];

	@ObfuscatedName("client.R")
	public int[] field957 = new int[4000];

	@ObfuscatedName("client.Cb")
	public int[] field992 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Gb")
	public boolean field995 = true;

	@ObfuscatedName("client.Kb")
	public class37 field999 = class37.method196(1);

	@ObfuscatedName("client.Lb")
	public final int field1000 = 100;

	@ObfuscatedName("client.Mb")
	public int[] field1001 = new int[100];

	@ObfuscatedName("client.Ob")
	public String field1002 = "";

	@ObfuscatedName("client.Pb")
	public String field1003 = "";

	@ObfuscatedName("client.Rb")
	public final int[] field1004 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Vb")
	public class34[] field1006 = new class34[20];

	@ObfuscatedName("client.Zb")
	public boolean field1008 = true;

	@ObfuscatedName("client.oc")
	public class41 field1022 = new class41();

	@ObfuscatedName("client.pc")
	public boolean field1023 = false;

	@ObfuscatedName("client.vc")
	public boolean field1029 = false;

	@ObfuscatedName("client.xc")
	public String[] field1030 = new String[500];

	@ObfuscatedName("client.zc")
	public boolean field1031 = true;

	@ObfuscatedName("client.Ec")
	public int field1035 = -1;

	@ObfuscatedName("client.Fc")
	public int field1036 = -1;

	@ObfuscatedName("client.Oc")
	public boolean field1043 = false;

	@ObfuscatedName("client.Pc")
	public boolean field1044 = false;

	@ObfuscatedName("client.Qc")
	public int[] field1045 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Rc")
	public CRC32 field1046 = new CRC32();

	@ObfuscatedName("client.Tc")
	public String field1048 = "";

	@ObfuscatedName("client.Uc")
	public int field1049 = -1;

	@ObfuscatedName("client.Vc")
	public long[] field1050 = new long[100];

	@ObfuscatedName("client.Wc")
	public int[] field1051 = new int[256];

	@ObfuscatedName("client.cd")
	public boolean[] field1057 = new boolean[5];

	@ObfuscatedName("client.jd")
	public int field1064 = 1;

	@ObfuscatedName("client.kd")
	public int[] field1065 = new int[151];

	@ObfuscatedName("client.od")
	public int field1069 = 1;

	@ObfuscatedName("client.qd")
	public int[] field1071 = new int[50];

	@ObfuscatedName("client.vd")
	public class60 field1076 = new class60();

	@ObfuscatedName("client.xd")
	public int field1078 = 2;

	@ObfuscatedName("client.Vd")
	public long[] field1101 = new long[100];

	@ObfuscatedName("client.de")
	public int field1108 = -1;

	@ObfuscatedName("client.le")
	public int[][] field1116 = new int[104][104];

	@ObfuscatedName("client.me")
	public boolean field1117 = false;

	@ObfuscatedName("client.ne")
	public int[][] field1118 = new int[104][104];

	@ObfuscatedName("client.se")
	public Object field1122 = new Object();

	@ObfuscatedName("client.we")
	public class41 field1126 = new class41();

	@ObfuscatedName("client.De")
	public int field1132 = -1;

	@ObfuscatedName("client.Ee")
	public class34[] field1133 = new class34[20];

	@ObfuscatedName("client.Fe")
	public class35[] field1134 = new class35[13];

	@ObfuscatedName("client.He")
	public boolean field1136 = false;

	@ObfuscatedName("client.Ke")
	public int[] field1138 = new int[5];

	@ObfuscatedName("client.Ne")
	public int field1141 = 0x766654;

	@ObfuscatedName("client.Te")
	public int[] field1145 = new int[5];

	@ObfuscatedName("client.Ue")
	public boolean field1146 = false;

	@ObfuscatedName("client.We")
	public int[] field1147 = new int[2000];

	@ObfuscatedName("client.df")
	public int field1152 = -1;

	@ObfuscatedName("client.ff")
	public class34[] field1154 = new class34[50];

	@ObfuscatedName("client.nf")
	public class37 field1161 = class37.method196(1);

	@ObfuscatedName("client.pf")
	public boolean field1163 = false;

	@ObfuscatedName("client.Bf")
	public class25[] field1173 = new class25[8192];

	@ObfuscatedName("client.Df")
	public int[] field1175 = new int[8192];

	@ObfuscatedName("client.Ef")
	public int[] field1176 = new int[100];

	@ObfuscatedName("client.Ff")
	public class35[] field1177 = new class35[50];

	@ObfuscatedName("client.Gf")
	public class41[][][] field1178 = new class41[4][104][104];

	@ObfuscatedName("client.Hf")
	public boolean field1179 = false;

	@ObfuscatedName("client.Mf")
	public String[] field1184 = new String[100];

	@ObfuscatedName("client.Nf")
	public boolean field1185 = false;

	@ObfuscatedName("client.Tf")
	public int field1190 = 0x332D25;

	@ObfuscatedName("client.Uf")
	public int[] field1191 = new int[7];

	@ObfuscatedName("client.Zf")
	public int field1196 = 2048;

	@ObfuscatedName("client.ag")
	public int field1197 = 2047;

	@ObfuscatedName("client.bg")
	public class26[] field1198 = new class26[field1196];

	@ObfuscatedName("client.dg")
	public int[] field1200 = new int[field1196];

	@ObfuscatedName("client.fg")
	public int[] field1202 = new int[field1196];

	@ObfuscatedName("client.gg")
	public class37[] field1203 = new class37[field1196];

	@ObfuscatedName("client.jg")
	public int field1206 = -1;

	@ObfuscatedName("client.ng")
	public int[][] field1210 = new int[104][104];

	@ObfuscatedName("client.og")
	public int[] field1211 = new int[2000];

	@ObfuscatedName("client.pg")
	public String field1212 = "";

	@ObfuscatedName("client.qg")
	public String field1213 = "";

	@ObfuscatedName("client.sg")
	public int field1215 = 2;

	@ObfuscatedName("client.tg")
	public int[] field1216 = new int[50];

	@ObfuscatedName("client.Bg")
	public class57[] field1224 = new class57[4];

	@ObfuscatedName("client.Dg")
	public int[] field1226 = new int[5];

	@ObfuscatedName("client.Fg")
	public int[] field1227 = new int[50];

	@ObfuscatedName("client.Ig")
	public int[] field1230 = new int[100];

	@ObfuscatedName("client.Jg")
	public String[] field1231 = new String[100];

	@ObfuscatedName("client.Kg")
	public String[] field1232 = new String[100];

	@ObfuscatedName("client.Lg")
	public class41 field1233 = new class41();

	@ObfuscatedName("client.Ng")
	public class34[] field1234 = new class34[8];

	@ObfuscatedName("client.Pg")
	public boolean field1235 = false;

	@ObfuscatedName("client.Sg")
	public int field1238 = -1;

	@ObfuscatedName("client.Tg")
	public int field1239 = 78;

	@ObfuscatedName("client.Xg")
	public boolean field1243 = false;

	@ObfuscatedName("client.hh")
	public boolean field1253 = true;

	@ObfuscatedName("client.lh")
	public boolean field1257 = false;

	@ObfuscatedName("client.mh")
	public int[] field1258 = new int[5];

	@ObfuscatedName("client.ph")
	public String field1260 = "";

	@ObfuscatedName("client.wh")
	public String field1267 = "";

	@ObfuscatedName("client.xh")
	public boolean field1268 = false;

	@ObfuscatedName("client.Ah")
	public int[] field1271 = new int[500];

	@ObfuscatedName("client.Bh")
	public int[] field1272 = new int[500];

	@ObfuscatedName("client.Ch")
	public int[] field1273 = new int[500];

	@ObfuscatedName("client.Dh")
	public int[] field1274 = new int[500];

	@ObfuscatedName("client.Eh")
	public boolean field1275 = false;

	@ObfuscatedName("client.Fh")
	public int[] field1276 = new int[50];

	@ObfuscatedName("client.Hh")
	public int field1278 = 3;

	@ObfuscatedName("client.Ih")
	public int field1279 = 0x4D4233;

	@ObfuscatedName("client.Th")
	public int field1289 = 50;

	@ObfuscatedName("client.Uh")
	public int[] field1290 = new int[field1289];

	@ObfuscatedName("client.Vh")
	public int[] field1291 = new int[field1289];

	@ObfuscatedName("client.Wh")
	public int[] field1292 = new int[field1289];

	@ObfuscatedName("client.Xh")
	public int[] field1293 = new int[field1289];

	@ObfuscatedName("client.Yh")
	public int[] field1294 = new int[field1289];

	@ObfuscatedName("client.Zh")
	public int[] field1295 = new int[field1289];

	@ObfuscatedName("client.ai")
	public int[] field1296 = new int[field1289];

	@ObfuscatedName("client.bi")
	public String[] field1297 = new String[field1289];

	@ObfuscatedName("client.ei")
	public int[] field1300 = new int[1000];

	@ObfuscatedName("client.fi")
	public class37 field1301 = class37.method196(1);

	@ObfuscatedName("client.hi")
	public int[] field1303 = new int[9];

	@ObfuscatedName("client.xi")
	public int[] field1317 = new int[5];

	@ObfuscatedName("client.Fi")
	public int field1325 = -1;

	@ObfuscatedName("client.Ii")
	public int[] field1327 = new int[1000];

	@ObfuscatedName("client.Ji")
	public int[] field1328 = new int[1000];

	@ObfuscatedName("client.Ki")
	public int[] field1329 = new int[151];

	@ObfuscatedName("client.Li")
	public boolean field1330 = false;

	@ObfuscatedName("client.Mi")
	public class41 field1331 = new class41();

	@ObfuscatedName("client.Pi")
	public int field1333 = 2;

	@ObfuscatedName("client.Ri")
	public boolean field1335 = false;

	@ObfuscatedName("client.sd")
	public static final int[][] field1073 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Pe")
	public static int[] field1143 = new int[99];

	@ObfuscatedName("client.If")
	public static int field1180 = 10;

	@ObfuscatedName("client.Kf")
	public static boolean field1182 = true;

	@ObfuscatedName("client.Vf")
	public static BigInteger field1192 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.kh")
	public static BigInteger field1256 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Si")
	public static String field1336 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ub")
	public int field1005;

	@ObfuscatedName("client.Bc")
	public static int field1033;

	@ObfuscatedName("client.Dc")
	public int field1034;

	@ObfuscatedName("client.Gc")
	public int field1037;

	@ObfuscatedName("client.Hc")
	public int field1038;

	@ObfuscatedName("client.Ic")
	public int field1039;

	@ObfuscatedName("client.Jc")
	public int field1040;

	@ObfuscatedName("client.Kc")
	public int field1041;

	@ObfuscatedName("client.Lc")
	public int field1042;

	@ObfuscatedName("client.Sc")
	public int field1047;

	@ObfuscatedName("client.Xc")
	public int field1052;

	@ObfuscatedName("client.dd")
	public int field1058;

	@ObfuscatedName("client.ed")
	public int field1059;

	@ObfuscatedName("client.fd")
	public int field1060;

	@ObfuscatedName("client.gd")
	public int field1061;

	@ObfuscatedName("client.hd")
	public int field1062;

	@ObfuscatedName("client.id")
	public int field1063;

	@ObfuscatedName("client.ld")
	public int field1066;

	@ObfuscatedName("client.md")
	public int field1067;

	@ObfuscatedName("client.nd")
	public int field1068;

	@ObfuscatedName("client.pd")
	public int field1070;

	@ObfuscatedName("client.rd")
	public int field1072;

	@ObfuscatedName("client.wd")
	public int field1077;

	@ObfuscatedName("client.Cd")
	public int field1083;

	@ObfuscatedName("client.Dd")
	public int field1084;

	@ObfuscatedName("client.Ed")
	public int field1085;

	@ObfuscatedName("client.Fd")
	public int field1086;

	@ObfuscatedName("client.Qd")
	public static int field1097;

	@ObfuscatedName("client.Wd")
	public int field1102;

	@ObfuscatedName("client.ee")
	public int field1109;

	@ObfuscatedName("client.oe")
	public int field1119;

	@ObfuscatedName("client.qe")
	public int field1120;

	@ObfuscatedName("client.re")
	public int field1121;

	@ObfuscatedName("client.te")
	public int field1123;

	@ObfuscatedName("client.ue")
	public int field1124;

	@ObfuscatedName("client.ve")
	public int field1125;

	@ObfuscatedName("client.xe")
	public int field1127;

	@ObfuscatedName("client.ze")
	public int field1128;

	@ObfuscatedName("client.Ae")
	public int field1129;

	@ObfuscatedName("client.Be")
	public int field1130;

	@ObfuscatedName("client.Ce")
	public int field1131;

	@ObfuscatedName("client.Ge")
	public int field1135;

	@ObfuscatedName("client.Ie")
	public int field1137;

	@ObfuscatedName("client.Me")
	public int field1140;

	@ObfuscatedName("client.Oe")
	public int field1142;

	@ObfuscatedName("client.Qe")
	public int field1144;

	@ObfuscatedName("client.Xe")
	public int field1148;

	@ObfuscatedName("client.Ye")
	public int field1149;

	@ObfuscatedName("client.Ze")
	public int field1150;

	@ObfuscatedName("client.af")
	public int field1151;

	@ObfuscatedName("client.ef")
	public int field1153;

	@ObfuscatedName("client.gf")
	public int field1155;

	@ObfuscatedName("client.hf")
	public int field1156;

	@ObfuscatedName("client.jf")
	public int field1157;

	@ObfuscatedName("client.kf")
	public int field1158;

	@ObfuscatedName("client.lf")
	public int field1159;

	@ObfuscatedName("client.mf")
	public int field1160;

	@ObfuscatedName("client.of")
	public static int field1162;

	@ObfuscatedName("client.qf")
	public int field1164;

	@ObfuscatedName("client.vf")
	public static int field1169;

	@ObfuscatedName("client.wf")
	public static int field1170;

	@ObfuscatedName("client.yf")
	public int field1171;

	@ObfuscatedName("client.zf")
	public int field1172;

	@ObfuscatedName("client.Cf")
	public int field1174;

	@ObfuscatedName("client.Jf")
	public static int field1181;

	@ObfuscatedName("client.Pf")
	public int field1187;

	@ObfuscatedName("client.Qf")
	public static int field1188;

	@ObfuscatedName("client.Rf")
	public int field1189;

	@ObfuscatedName("client.Wf")
	public static int field1193;

	@ObfuscatedName("client.Xf")
	public static int field1194;

	@ObfuscatedName("client.Yf")
	public static int field1195;

	@ObfuscatedName("client.cg")
	public int field1199;

	@ObfuscatedName("client.eg")
	public int field1201;

	@ObfuscatedName("client.lg")
	public int field1208;

	@ObfuscatedName("client.mg")
	public static int field1209;

	@ObfuscatedName("client.rg")
	public int field1214;

	@ObfuscatedName("client.vg")
	public static int field1218;

	@ObfuscatedName("client.wg")
	public int field1219;

	@ObfuscatedName("client.xg")
	public int field1220;

	@ObfuscatedName("client.zg")
	public static int field1222;

	@ObfuscatedName("client.Ag")
	public int field1223;

	@ObfuscatedName("client.Cg")
	public int field1225;

	@ObfuscatedName("client.Gg")
	public int field1228;

	@ObfuscatedName("client.Hg")
	public int field1229;

	@ObfuscatedName("client.Qg")
	public int field1236;

	@ObfuscatedName("client.Rg")
	public int field1237;

	@ObfuscatedName("client.Ug")
	public int field1240;

	@ObfuscatedName("client.oh")
	public int field1259;

	@ObfuscatedName("client.qh")
	public int field1261;

	@ObfuscatedName("client.rh")
	public int field1262;

	@ObfuscatedName("client.sh")
	public int field1263;

	@ObfuscatedName("client.th")
	public int field1264;

	@ObfuscatedName("client.uh")
	public int field1265;

	@ObfuscatedName("client.vh")
	public int field1266;

	@ObfuscatedName("client.Gh")
	public int field1277;

	@ObfuscatedName("client.Jh")
	public int field1280;

	@ObfuscatedName("client.Kh")
	public int field1281;

	@ObfuscatedName("client.Lh")
	public int field1282;

	@ObfuscatedName("client.Mh")
	public int field1283;

	@ObfuscatedName("client.Nh")
	public int field1284;

	@ObfuscatedName("client.Ph")
	public int field1285;

	@ObfuscatedName("client.Qh")
	public int field1286;

	@ObfuscatedName("client.Rh")
	public int field1287;

	@ObfuscatedName("client.Sh")
	public int field1288;

	@ObfuscatedName("client.di")
	public int field1299;

	@ObfuscatedName("client.gi")
	public int field1302;

	@ObfuscatedName("client.ji")
	public int field1304;

	@ObfuscatedName("client.ki")
	public int field1305;

	@ObfuscatedName("client.li")
	public int field1306;

	@ObfuscatedName("client.mi")
	public int field1307;

	@ObfuscatedName("client.pi")
	public int field1310;

	@ObfuscatedName("client.qi")
	public int field1311;

	@ObfuscatedName("client.ti")
	public int field1313;

	@ObfuscatedName("client.ui")
	public int field1314;

	@ObfuscatedName("client.vi")
	public int field1315;

	@ObfuscatedName("client.yi")
	public int field1318;

	@ObfuscatedName("client.zi")
	public int field1319;

	@ObfuscatedName("client.Ai")
	public static int field1320;

	@ObfuscatedName("client.Bi")
	public int field1321;

	@ObfuscatedName("client.Ci")
	public int field1322;

	@ObfuscatedName("client.Di")
	public int field1323;

	@ObfuscatedName("client.Ei")
	public int field1324;

	@ObfuscatedName("client.Hi")
	public int field1326;

	@ObfuscatedName("client.Oi")
	public int field1332;

	@ObfuscatedName("client.Qi")
	public int field1334;

	@ObfuscatedName("client.B")
	public int field941;

	@ObfuscatedName("client.J")
	public int field949;

	@ObfuscatedName("client.K")
	public int field950;

	@ObfuscatedName("client.L")
	public int field951;

	@ObfuscatedName("client.T")
	public int field959;

	@ObfuscatedName("client.Z")
	public static int field965;

	@ObfuscatedName("client.Ab")
	public int field991;

	@ObfuscatedName("client.Eb")
	public int field994;

	@ObfuscatedName("client.Ib")
	public int field997;

	@ObfuscatedName("client.Xb")
	public long field1007;

	@ObfuscatedName("client.Le")
	public long field1139;

	@ObfuscatedName("client.S")
	public long field958;

	@ObfuscatedName("client.ci")
	public class18 field1298;

	@ObfuscatedName("client.si")
	public class26 field1312;

	@ObfuscatedName("client.td")
	public class34 field1074;

	@ObfuscatedName("client.ud")
	public class34 field1075;

	@ObfuscatedName("client.fe")
	public class34 field1110;

	@ObfuscatedName("client.ge")
	public class34 field1111;

	@ObfuscatedName("client.kg")
	public class34 field1207;

	@ObfuscatedName("client.D")
	public class34 field943;

	@ObfuscatedName("client.E")
	public class34 field944;

	@ObfuscatedName("client.F")
	public class34 field945;

	@ObfuscatedName("client.G")
	public class34 field946;

	@ObfuscatedName("client.Db")
	public class34 field993;

	@ObfuscatedName("client.qc")
	public class35 field1024;

	@ObfuscatedName("client.rc")
	public class35 field1025;

	@ObfuscatedName("client.sc")
	public class35 field1026;

	@ObfuscatedName("client.tc")
	public class35 field1027;

	@ObfuscatedName("client.uc")
	public class35 field1028;

	@ObfuscatedName("client.Xd")
	public class35 field1103;

	@ObfuscatedName("client.Yd")
	public class35 field1104;

	@ObfuscatedName("client.Zd")
	public class35 field1105;

	@ObfuscatedName("client.ae")
	public class35 field1106;

	@ObfuscatedName("client.be")
	public class35 field1107;

	@ObfuscatedName("client.rf")
	public class35 field1165;

	@ObfuscatedName("client.sf")
	public class35 field1166;

	@ObfuscatedName("client.tf")
	public class35 field1167;

	@ObfuscatedName("client.Vg")
	public class35 field1241;

	@ObfuscatedName("client.Wg")
	public class35 field1242;

	@ObfuscatedName("client.ih")
	public class35 field1254;

	@ObfuscatedName("client.jh")
	public class35 field1255;

	@ObfuscatedName("client.he")
	public class36 field1112;

	@ObfuscatedName("client.ie")
	public class36 field1113;

	@ObfuscatedName("client.je")
	public class36 field1114;

	@ObfuscatedName("client.ke")
	public class36 field1115;

	@ObfuscatedName("client.yd")
	public class43 field1079;

	@ObfuscatedName("client.zd")
	public class43 field1080;

	@ObfuscatedName("client.Ad")
	public class43 field1081;

	@ObfuscatedName("client.Bd")
	public class43 field1082;

	@ObfuscatedName("client.Gd")
	public class43 field1087;

	@ObfuscatedName("client.Hd")
	public class43 field1088;

	@ObfuscatedName("client.Id")
	public class43 field1089;

	@ObfuscatedName("client.Jd")
	public class43 field1090;

	@ObfuscatedName("client.Kd")
	public class43 field1091;

	@ObfuscatedName("client.Ld")
	public class43 field1092;

	@ObfuscatedName("client.Md")
	public class43 field1093;

	@ObfuscatedName("client.Nd")
	public class43 field1094;

	@ObfuscatedName("client.Od")
	public class43 field1095;

	@ObfuscatedName("client.Pd")
	public class43 field1096;

	@ObfuscatedName("client.Sd")
	public class43 field1098;

	@ObfuscatedName("client.Td")
	public class43 field1099;

	@ObfuscatedName("client.Ud")
	public class43 field1100;

	@ObfuscatedName("client.Yg")
	public class43 field1244;

	@ObfuscatedName("client.Zg")
	public class43 field1245;

	@ObfuscatedName("client.ah")
	public class43 field1246;

	@ObfuscatedName("client.bh")
	public class43 field1247;

	@ObfuscatedName("client.ch")
	public class43 field1248;

	@ObfuscatedName("client.dh")
	public class43 field1249;

	@ObfuscatedName("client.eh")
	public class43 field1250;

	@ObfuscatedName("client.fh")
	public class43 field1251;

	@ObfuscatedName("client.gh")
	public class43 field1252;

	@ObfuscatedName("client.uf")
	public class46 field1168;

	@ObfuscatedName("client.oi")
	public class47 field1309;

	@ObfuscatedName("client.ig")
	public String field1205;

	@ObfuscatedName("client.ug")
	public String field1217;

	@ObfuscatedName("client.yg")
	public String field1221;

	@ObfuscatedName("client.ni")
	public String field1308;

	@ObfuscatedName("client.wi")
	public String field1316;

	@ObfuscatedName("client.Lf")
	public static boolean field1183;

	@ObfuscatedName("client.H")
	public static boolean field947;

	@ObfuscatedName("client.Yc")
	public int[] field1053;

	@ObfuscatedName("client.Zc")
	public int[] field1054;

	@ObfuscatedName("client.ad")
	public int[] field1055;

	@ObfuscatedName("client.bd")
	public int[] field1056;

	@ObfuscatedName("client.Of")
	public int[] field1186;

	@ObfuscatedName("client.yh")
	public int[] field1269;

	@ObfuscatedName("client.zh")
	public int[] field1270;

	@ObfuscatedName("client.U")
	public int[] field960;

	@ObfuscatedName("client.V")
	public int[] field961;

	@ObfuscatedName("client.W")
	public int[] field962;

	@ObfuscatedName("client.X")
	public int[] field963;

	@ObfuscatedName("client.Y")
	public int[] field964;

	@ObfuscatedName("client.O")
	public class35[] field954;

	@ObfuscatedName("client.hg")
	public byte[][] field1204;

	@ObfuscatedName("client.Hb")
	public byte[][] field996;

	@ObfuscatedName("client.Jb")
	public byte[][][] field998;

	@ObfuscatedName("client.Ac")
	public int[][][] field1032;

	@ObfuscatedName("client.f(I)V")
	public final void method363() {
		for (class40 var1 = (class40) field1331.method228(); var1 != null; var1 = (class40) field1331.method230()) {
			boolean var2 = false;
			var1.field576 += field1135;

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
					var6 = field1298.method77(var3, var4, var5);
				}

				if (var1.field570 == 1) {
					var6 = field1298.method78(var4, var5, var3);
				}

				if (var1.field570 == 2) {
					var6 = field1298.method79(var3, var4, var5);
				}

				if (var1.field570 == 3) {
					var6 = field1298.method80(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field573) {
					int var7 = field1032[var3][var4][var5];
					int var8 = field1032[var3][var4 + 1][var5];
					int var9 = field1032[var3][var4 + 1][var5 + 1];
					int var10 = field1032[var3][var4][var5 + 1];
					class53 var11 = class53.method275(var1.field573);
					int var12 = -1;
					if (var1.field575 != -1) {
						var12 = var1.field574.field897[var1.field575];
					}

					if (var1.field570 == 2) {
						int var13 = field1298.method81(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						class31 var16 = var11.method278(var14, var15, var7, var8, var9, var10, var12);
						field1298.method66(var4, var3, var16, var5);
					} else if (var1.field570 == 1) {
						class31 var17 = var11.method278(4, 0, var7, var8, var9, var10, var12);
						field1298.method68(var17, var5, var3, var4);
					} else if (var1.field570 == 0) {
						int var18 = field1298.method81(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							class31 var22 = var11.method278(2, var20 + 4, var7, var8, var9, var10, var12);
							class31 var23 = var11.method278(2, var21, var7, var8, var9, var10, var12);
							field1298.method71(var3, var22, var5, var4, var23);
						} else {
							class31 var24 = var11.method278(var19, var20, var7, var8, var9, var10, var12);
							field1298.method70(var5, var4, var3, var24);
						}
					} else if (var1.field570 == 3) {
						int var25 = field1298.method81(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						class31 var27 = var11.method278(22, var26, var7, var8, var9, var10, var12);
						field1298.method69(var4, var5, var3, var27);
					}
				} else {
					var1.method107();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZIILhc;)V")
	public final void method364(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class60 arg7) {
		if (field1185) {
			field1229 = 32;
		} else {
			field1229 = 0;
		}

		field1185 = false;
		if (arg1 >= arg3 && arg1 < arg3 + 16 && arg2 >= arg6 && arg2 < arg6 + 16) {
			arg7.field848 -= field1259 * 4;

			if (arg4) {
				field975 = true;
				return;
			}
		} else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg2 >= arg5 + arg6 - 16 && arg2 < arg5 + arg6) {
			arg7.field848 += field1259 * 4;

			if (arg4) {
				field975 = true;
				return;
			}
		} else if (arg1 >= arg3 - field1229 && arg1 < arg3 + field1229 + 16 && arg2 >= arg6 + 16 && arg2 < arg5 + arg6 - 16 && field1259 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg6 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg7.field848 = (arg0 - arg5) * var10 / var11;

			if (arg4) {
				field975 = true;
			}

			field1185 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1241.method186(arg1, arg0);
		field1242.method186(arg1, arg0 + arg2 - 16);
		class32.method149(16, arg2 - 32, field972, arg0 + 16, arg1);
		int var6 = (arg2 - 32) * arg2 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg4 / (arg3 - arg2);
		class32.method149(16, var6, field1279, arg0 + var7 + 16, arg1);
		class32.method152(var6, field1141, arg0 + var7 + 16, arg1);
		class32.method152(var6, field1141, arg0 + var7 + 16, arg1 + 1);
		class32.method151(arg0 + var7 + 16, field1141, arg1, 16);
		class32.method151(arg0 + var7 + 17, field1141, arg1, 16);
		class32.method152(var6, field1190, arg0 + var7 + 16, arg1 + 15);
		class32.method152(var6 - 1, field1190, arg0 + var7 + 17, arg1 + 14);
		class32.method151(arg0 + var7 + var6 + 15, field1190, arg1, 16);
		class32.method151(arg0 + var7 + var6 + 14, field1190, arg1 + 1, 15);
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method366() {
		int var1 = field1261 * 128 + 64;
		int var2 = field1262 * 128 + 64;
		int var3 = method449(field1189, field1262, field1261) - field1263;

		if (field1010 < var1) {
			field1010 += (var1 - field1010) * field1265 / 1000 + field1264;
			if (field1010 > var1) {
				field1010 = var1;
			}
		}

		if (field1010 > var1) {
			field1010 -= (field1010 - var1) * field1265 / 1000 + field1264;
			if (field1010 < var1) {
				field1010 = var1;
			}
		}

		if (field1011 < var3) {
			field1011 += (var3 - field1011) * field1265 / 1000 + field1264;
			if (field1011 > var3) {
				field1011 = var3;
			}
		}

		if (field1011 > var3) {
			field1011 -= (field1011 - var3) * field1265 / 1000 + field1264;
			if (field1011 < var3) {
				field1011 = var3;
			}
		}

		if (field1012 < var2) {
			field1012 += (var2 - field1012) * field1265 / 1000 + field1264;
			if (field1012 > var2) {
				field1012 = var2;
			}
		}

		if (field1012 > var2) {
			field1012 -= (field1012 - var2) * field1265 / 1000 + field1264;
			if (field1012 < var2) {
				field1012 = var2;
			}
		}

		int var4 = field1280 * 128 + 64;
		int var5 = field1281 * 128 + 64;
		int var6 = method449(field1189, field1281, field1280) - field1282;
		int var7 = var4 - field1010;
		int var8 = var6 - field1011;
		int var9 = var5 - field1012;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1013 < var11) {
			field1013 += (var11 - field1013) * field1284 / 1000 + field1283;
			if (field1013 > var11) {
				field1013 = var11;
			}
		}

		if (field1013 > var11) {
			field1013 -= (field1013 - var11) * field1284 / 1000 + field1283;
			if (field1013 < var11) {
				field1013 = var11;
			}
		}

		int var13 = var12 - field1014;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1014 += field1284 * var13 / 1000 + field1283;
			field1014 &= 0x7FF;
		}

		if (var13 < 0) {
			field1014 -= -var13 * field1284 / 1000 + field1283;
			field1014 &= 0x7FF;
		}

		int var14 = var12 - field1014;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1014 = var12;
		}
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String method367(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.g(I)V")
	public final void method368() {
		if (field1034 >= 2 || field1304 != 0 || field1313 != 0) {
			String var1;
			if (field1304 == 1 && field1034 < 2) {
				var1 = "Use " + field1308 + " with...";
			} else if (field1313 == 1 && field1034 < 2) {
				var1 = field1316 + "...";
			} else {
				var1 = field1030[field1034 - 1];
			}

			if (field1034 > 2) {
				var1 = var1 + "@whi@ / " + (field1034 - 2) + " more options";
			}

			field1114.method193(true, var1, 15, 4, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.a(Lkb;IB)V")
	public final void method369(class37 arg0, int arg1) {
		while (arg0.field541 + 21 < arg1 * 8) {
			int var3 = arg0.method220(13);
			if (var3 == 8191) {
				break;
			}

			if (field1173[var3] == null) {
				field1173[var3] = new class25();
			}

			class25 var4 = field1173[var3];
			field1175[field1174++] = var3;
			var4.field312 = field1209;
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

			var4.method109(field1312.field316[0] + var5, field1312.field317[0] + var6, false);
			int var7 = arg0.method220(1);
			if (var7 == 1) {
				field1202[field1201++] = var3;
			}
		}

		arg0.method221();
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (!field1183) {
			field1029 = true;
			field995 = true;
			method12(this, 2);
			method425(40000, "scape_main", 12345678);
		}

		if (field947) {
			field1257 = true;
		} else {
			field947 = true;
			boolean var1 = false;
			String var2 = method477();
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
					field1303[8] = 0;
					while (field1303[8] == 0) {
						method13(10, "Connecting to fileserver");

						try {
							DataInputStream var4 = method479("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[36]);
							var4.readFully(var5.field539, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								field1303[var6] = var5.method214();
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

					field1309 = method459("title screen", "title", 10, field1303[1]);
					field1112 = new class36("p11", field1309);
					field1113 = new class36("p12", field1309);
					field1114 = new class36("b12", field1309);
					field1115 = new class36("q8", field1309);
					method447();
					method395();
					class47 var8 = method459("config", "config", 15, field1303[2]);
					class47 var9 = method459("interface", "interface", 20, field1303[3]);
					class47 var10 = method459("2d graphics", "media", 30, field1303[4]);
					class47 var11 = method459("3d graphics", "models", 40, field1303[5]);
					class47 var12 = method459("textures", "textures", 60, field1303[6]);
					class47 var13 = method459("chat system", "wordenc", 65, field1303[7]);
					class47 var14 = method459("sound effects", "sounds", 70, field1303[8]);
					field998 = new byte[4][104][104];
					field1032 = new int[4][105][105];
					field1298 = new class18(field1032, 4, 104, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1224[var15] = new class57(104, 104);
					}

					field970 = new class34(512, 512);
					method13(75, "Unpacking media");
					field985 = new class35(var10, "invback", 0);
					field987 = new class35(var10, "chatback", 0);
					field986 = new class35(var10, "mapback", 0);
					field1165 = new class35(var10, "backbase1", 0);
					field1166 = new class35(var10, "backbase2", 0);
					field1167 = new class35(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						field1134[var16] = new class35(var10, "sideicons", var16);
					}

					field1207 = new class34(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							field1177[var17] = new class35(var10, "mapscene", var17);
						}
					} catch (Exception var53) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							field1154[var18] = new class34(var10, "mapfunction", var18);
						}
					} catch (Exception var52) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							field1133[var19] = new class34(var10, "hitmarks", var19);
						}
					} catch (Exception var51) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							field1006[var20] = new class34(var10, "headicons", var20);
						}
					} catch (Exception var50) {
					}

					field993 = new class34(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						field1234[var21] = new class34(var10, "cross", var21);
					}

					field943 = new class34(var10, "mapdots", 0);
					field944 = new class34(var10, "mapdots", 1);
					field945 = new class34(var10, "mapdots", 2);
					field946 = new class34(var10, "mapdots", 3);
					field1241 = new class35(var10, "scrollbar", 0);
					field1242 = new class35(var10, "scrollbar", 1);
					field1024 = new class35(var10, "redstone1", 0);
					field1025 = new class35(var10, "redstone2", 0);
					field1026 = new class35(var10, "redstone3", 0);
					field1027 = new class35(var10, "redstone1", 0);
					field1027.method184();
					field1028 = new class35(var10, "redstone2", 0);
					field1028.method184();
					field1103 = new class35(var10, "redstone1", 0);
					field1103.method185();
					field1104 = new class35(var10, "redstone2", 0);
					field1104.method185();
					field1105 = new class35(var10, "redstone3", 0);
					field1105.method185();
					field1106 = new class35(var10, "redstone1", 0);
					field1106.method184();
					field1106.method185();
					field1107 = new class35(var10, "redstone2", 0);
					field1107.method184();
					field1107.method185();
					class34 var22 = new class34(var10, "backleft1", 0);
					field1087 = new class43(var22.field516, var22.field517, method11());
					var22.method171(0, 0);
					class34 var23 = new class34(var10, "backleft2", 0);
					field1088 = new class43(var23.field516, var23.field517, method11());
					var23.method171(0, 0);
					class34 var24 = new class34(var10, "backright1", 0);
					field1089 = new class43(var24.field516, var24.field517, method11());
					var24.method171(0, 0);
					class34 var25 = new class34(var10, "backright2", 0);
					field1090 = new class43(var25.field516, var25.field517, method11());
					var25.method171(0, 0);
					class34 var26 = new class34(var10, "backtop1", 0);
					field1091 = new class43(var26.field516, var26.field517, method11());
					var26.method171(0, 0);
					class34 var27 = new class34(var10, "backtop2", 0);
					field1092 = new class43(var27.field516, var27.field517, method11());
					var27.method171(0, 0);
					class34 var28 = new class34(var10, "backvmid1", 0);
					field1093 = new class43(var28.field516, var28.field517, method11());
					var28.method171(0, 0);
					class34 var29 = new class34(var10, "backvmid2", 0);
					field1094 = new class43(var29.field516, var29.field517, method11());
					var29.method171(0, 0);
					class34 var30 = new class34(var10, "backvmid3", 0);
					field1095 = new class43(var30.field516, var30.field517, method11());
					var30.method171(0, 0);
					class34 var31 = new class34(var10, "backhmid2", 0);
					field1096 = new class43(var31.field516, var31.field517, method11());
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
					class55.field767 = field1182;

					if (!field1183) {
						method13(90, "Unpacking sounds");
						byte[] var32 = var14.method250(null, "sounds.dat");
						class37 var33 = new class37(var32);
						class51.method263(var33);
					}

					method13(92, "Unpacking interfaces");
					class36[] var34 = new class36[] { field1112, field1113, field1114, field1115 };
					class60.method314(var9, var34, var10);
					method13(97, "Preparing game engine");

					for (int var35 = 0; var35 < 33; var35++) {
						int var36 = 999;
						int var37 = 0;
						for (int var38 = 0; var38 < 35; var38++) {
							if (field986.field522[field986.field524 * var35 + var38] == 0) {
								if (var36 == 999) {
									var36 = var38;
								}
							} else if (var36 != 999) {
								var37 = var38;
								break;
							}
						}

						field1021[var35] = var36;
						field1015[var35] = var37 - var36;
					}

					for (int var39 = 9; var39 < 160; var39++) {
						int var40 = 999;
						int var41 = 0;
						for (int var42 = 10; var42 < 168; var42++) {
							if (field986.field522[field986.field524 * var39 + var42] == 0 && (var42 > 34 || var39 > 34)) {
								if (var40 == 999) {
									var40 = var42;
								}
							} else if (var40 != 999) {
								var41 = var42;
								break;
							}
						}

						field1065[var39 - 9] = var40 - 21;
						field1329[var39 - 9] = var41 - var40;
					}

					class33.method155(96, 479);
					field960 = class33.field503;
					class33.method155(261, 190);
					field961 = class33.field503;
					class33.method155(334, 512);
					field962 = class33.field503;
					int[] var43 = new int[9];
					for (int var44 = 0; var44 < 9; var44++) {
						int var45 = var44 * 32 + 128 + 15;
						int var46 = var45 * 3 + 600;
						int var47 = class33.field501[var45];
						var43[var44] = var46 * var47 >> 16;
					}

					class18.method87(512, var43, 800, 334, 500);
					class65.method325(var13);
				} catch (Exception var55) {
					field1179 = true;
				}
			} else {
				field974 = true;
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method10() {
		field1335 = true;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method370(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1109; var2++) {
			if (arg0.equalsIgnoreCase(field1184[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1312.field321)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.h(I)V")
	public final void method371() {
		field1029 = false;

		while (field995) {
			try {
				Thread.sleep(50L);
			} catch (Exception var15) {
			}

			String var2;
			int var3;
			int var4;
			synchronized (field1122) {
				var2 = field1221;
				var3 = field1310;
				var4 = field1302;
				field1221 = null;
				field1310 = 0;
				field1302 = 0;
			}

			if (var2 != null) {
				byte[] var5 = signlink.cacheload(var2 + ".mid");
				if (var5 != null && var3 != 12345678) {
					field1046.reset();
					field1046.update(var5);
					int var6 = (int) field1046.getValue();
					if (var3 != var6) {
						var5 = null;
					}
				}

				if (var5 == null) {
					try {
						DataInputStream var7 = method479(var2 + "_" + var3 + ".mid");
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
				method460(true, var13, var12);
			}
		}
	}

	@ObfuscatedName("client.a(IILhc;)I")
	public final int method372(int arg0, class60 arg1) {
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
					var4 += field1018[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1227[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1276[var3[var5++]];
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
					var4 += field1147[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1143[field1227[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1147[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1312.field327;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1227[var10];
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
					var4 += field1187;
				}

				if (var6 == 12) {
					var4 += field1171;
				}

				if (var6 == 13) {
					int var14 = field1147[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method373() {
		int var1 = field1059;
		int var2 = field1060;
		int var3 = field1061;
		int var4 = field1062;
		int var5 = 0x5D5447;
		class32.method149(var3, var4, var5, var2, var1);
		class32.method149(var3 - 2, 16, 0, var2 + 1, var1 + 1);
		class32.method150(var2 + 18, var4 - 19, 0, var3 - 2, var1 + 1);
		field1114.method191(var5, var1 + 3, "Choose Option", var2 + 14);
		int var6 = field15;
		int var7 = field16;
		if (field1058 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1058 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (field1058 == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < field1034; var8++) {
			int var9 = (field1034 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1114.method193(true, field1030[var8], var9, var1 + 3, var10);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method374() {
		if (field1208 == 2) {
			method470((field979 - field1322 << 7) + field982, field980 * 2, (field978 - field1321 << 7) + field981);

			if (field1035 > -1 && field1209 % 20 < 10) {
				field1006[2].method173(field1035 - 12, field1036 - 28);
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method375() {
		field1225++;
		method398();
		method412();
		method480();
		method481();
		method363();

		if (!field1163) {
			int var1 = field948;
			if (field1219 / 256 > var1) {
				var1 = field1219 / 256;
			}

			if (field1057[4] && field1226[4] + 128 > var1) {
				var1 = field1226[4] + 128;
			}

			int var2 = field949 + field1068 & 0x7FF;
			method397(var2, field1123, method449(field1189, field1312.field269, field1312.field268) - 50, var1 * 3 + 600, field1124, var1);
		}

		int var3;
		if (field1163) {
			var3 = method400();
		} else {
			var3 = method399();
		}

		int var4 = field1010;
		int var5 = field1011;
		int var6 = field1012;
		int var7 = field1013;
		int var8 = field1014;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1057[var9]) {
				int var10 = (int) (Math.random() * (field1317[var9] * 2 + 1) + Math.sin(field1145[var9] / 100.0D * field1138[var9]) * field1226[var9] - field1317[var9]);
				if (var9 == 0) {
					field1010 += var10;
				}

				if (var9 == 1) {
					field1011 += var10;
				}

				if (var9 == 2) {
					field1012 += var10;
				}

				if (var9 == 3) {
					field1014 = field1014 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1013 += var10;
					if (field1013 < 128) {
						field1013 = 128;
					}

					if (field1013 > 383) {
						field1013 = 383;
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
		field1298.method90(field1013, field1010, field1011, var3, field1012, field1014);
		field1298.method64();
		method482();
		method374();
		method433(var11);
		method442();
		field1081.method236(8, 11, field8);
		field1010 = var4;
		field1011 = var5;
		field1012 = var6;
		field1013 = var7;
		field1014 = var8;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method376() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field1318 = (field1318 + 1) % 4;
				field983 = true;
				field1044 = true;
				field1301.method198(197);
				field1301.method199(field1318);
				field1301.method199(field997);
				field1301.method199(field990);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field997 = (field997 + 1) % 3;
				field983 = true;
				field1044 = true;
				field1301.method198(197);
				field1301.method199(field1318);
				field1301.method199(field997);
				field1301.method199(field990);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field990 = (field990 + 1) % 3;
				field983 = true;
				field1044 = true;
				field1301.method198(197);
				field1301.method199(field1318);
				field1301.method199(field997);
				field1301.method199(field990);
			}

			if (field18 >= 416 && field18 <= 516 && field19 >= 490 && field19 <= 522) {
				method378();
				field967 = "";
				field1243 = false;

				for (int var1 = 0; var1 < class60.field829.length; var1++) {
					if (class60.field829[var1] != null && class60.field829[var1].field838 == 600) {
						field1049 = field1016 = class60.field829[var1].field835;
						break;
					}
				}
			}

			field1170++;
			if (field1170 > 195) {
				field1170 = 0;
				field1301.method198(24);
				field1301.method199(239);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1009 != null) {
				field1009.method29();
			}
		} catch (Exception var1) {
		}

		field1009 = null;
		method464();
		field995 = false;
		field1301 = null;
		field1161 = null;
		field999 = null;
		field1186 = null;
		field996 = null;
		field1204 = null;
		field1032 = null;
		field998 = null;
		field1298 = null;
		field1224 = null;
		field1210 = null;
		field1116 = null;
		field956 = null;
		field957 = null;
		field955 = null;
		field1079 = null;
		field1080 = null;
		field1081 = null;
		field1082 = null;
		field1098 = null;
		field1099 = null;
		field1100 = null;
		field1087 = null;
		field1088 = null;
		field1089 = null;
		field1090 = null;
		field1091 = null;
		field1092 = null;
		field1093 = null;
		field1094 = null;
		field1095 = null;
		field1096 = null;
		field985 = null;
		field986 = null;
		field987 = null;
		field1165 = null;
		field1166 = null;
		field1167 = null;
		field1134 = null;
		field1024 = null;
		field1025 = null;
		field1026 = null;
		field1027 = null;
		field1028 = null;
		field1103 = null;
		field1104 = null;
		field1105 = null;
		field1106 = null;
		field1107 = null;
		field1207 = null;
		field1133 = null;
		field1006 = null;
		field1234 = null;
		field943 = null;
		field944 = null;
		field945 = null;
		field946 = null;
		field1177 = null;
		field1154 = null;
		field1118 = null;
		field1198 = null;
		field1200 = null;
		field1202 = null;
		field1203 = null;
		field1300 = null;
		field1173 = null;
		field1175 = null;
		field1178 = null;
		field1022 = null;
		field952 = null;
		field1126 = null;
		field1233 = null;
		field1331 = null;
		field1271 = null;
		field1272 = null;
		field1273 = null;
		field1274 = null;
		field1030 = null;
		field1147 = null;
		field1327 = null;
		field1328 = null;
		field971 = null;
		field970 = null;
		field1184 = null;
		field1101 = null;
		field1176 = null;
		field1247 = null;
		field1248 = null;
		field1244 = null;
		field1245 = null;
		field1246 = null;
		field1249 = null;
		field1250 = null;
		field1251 = null;
		field1252 = null;
		method393();
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

	public final void run() {
		if (field977) {
			method486();
		} else if (field1029) {
			method371();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IILhc;IIII)V")
	public final void method377(int arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field836 == 0 && arg1.field850 != null && !arg1.field849 && (arg2 >= arg3 && arg4 >= arg5 && arg2 <= arg1.field839 + arg3 && arg4 <= arg1.field840 + arg5)) {
			int var7 = arg1.field850.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field851[var8] + arg3;
				int var10 = arg1.field852[var8] + arg5 - arg0;
				class60 var11 = class60.field829[arg1.field850[var8]];
				var9 += var11.field841;
				var10 += var11.field842;
				if ((var11.field846 >= 0 || var11.field872 != 0) && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field839 + var9 && arg4 < var11.field840 + var10) {
					if (var11.field846 >= 0) {
						field1228 = var11.field846;
					} else {
						field1228 = var11.field834;
					}
				}

				if (var11.field836 == 0) {
					method377(var11.field848, var11, arg2, var9, arg4, var10);

					if (var11.field847 > var11.field840) {
						method364(var11.field847, arg2, arg4, var11.field839 + var9, true, var11.field840, var10, var11);
					}
				} else {
					if (var11.field837 == 1 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field839 + var9 && arg4 < var11.field840 + var10) {
						boolean var12 = false;
						if (var11.field838 != 0) {
							var12 = method431(var11);
						}

						if (!var12) {
							field1030[field1034] = var11.field885;
							field1273[field1034] = 706;
							field1272[field1034] = var11.field834;
							field1034++;
						}
					}

					if (var11.field837 == 2 && field1313 == 0 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field839 + var9 && arg4 < var11.field840 + var10) {
						String var13 = var11.field882;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1030[field1034] = var13 + " @gre@" + var11.field883;
						field1273[field1034] = 941;
						field1272[field1034] = var11.field834;
						field1034++;
					}

					if (var11.field837 == 3 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field839 + var9 && arg4 < var11.field840 + var10) {
						field1030[field1034] = "Close";
						field1273[field1034] = 309;
						field1272[field1034] = var11.field834;
						field1034++;
					}

					if (var11.field837 == 4 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field839 + var9 && arg4 < var11.field840 + var10) {
						field1030[field1034] = var11.field885;
						field1273[field1034] = 967;
						field1272[field1034] = var11.field834;
						field1034++;
					}

					if (var11.field837 == 5 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field839 + var9 && arg4 < var11.field840 + var10) {
						field1030[field1034] = var11.field885;
						field1273[field1034] = 672;
						field1272[field1034] = var11.field834;
						field1034++;
					}

					if (var11.field837 == 6 && !field1117 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field839 + var9 && arg4 < var11.field840 + var10) {
						field1030[field1034] = var11.field885;
						field1273[field1034] = 73;
						field1272[field1034] = var11.field834;
						field1034++;
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

								if (arg2 >= var17 && arg4 >= var18 && arg2 < var17 + 32 && arg4 < var18 + 32) {
									field1236 = var14;
									field1237 = var11.field834;

									if (var11.field830[var14] > 0) {
										class55 var19 = class55.method287(var11.field830[var14] - 1);
										if (field1304 == 1 && var11.field856) {
											if (field1306 != var11.field834 || field1305 != var14) {
												field1030[field1034] = "Use " + field1308 + " with @lre@" + var19.field770;
												field1273[field1034] = 237;
												field1274[field1034] = var19.field768;
												field1271[field1034] = var14;
												field1272[field1034] = var11.field834;
												field1034++;
											}
										} else if (field1313 != 1 || !var11.field856) {
											if (var11.field856) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field785 != null && var19.field785[var20] != null) {
														field1030[field1034] = var19.field785[var20] + " @lre@" + var19.field770;

														if (var20 == 3) {
															field1273[field1034] = 120;
														}

														if (var20 == 4) {
															field1273[field1034] = 796;
														}

														field1274[field1034] = var19.field768;
														field1271[field1034] = var14;
														field1272[field1034] = var11.field834;
														field1034++;
													} else if (var20 == 4) {
														field1030[field1034] = "Drop @lre@" + var19.field770;
														field1273[field1034] = 796;
														field1274[field1034] = var19.field768;
														field1271[field1034] = var14;
														field1272[field1034] = var11.field834;
														field1034++;
													}
												}
											}

											if (var11.field857) {
												field1030[field1034] = "Use @lre@" + var19.field770;
												field1273[field1034] = 357;
												field1274[field1034] = var19.field768;
												field1271[field1034] = var14;
												field1272[field1034] = var11.field834;
												field1034++;
											}

											if (var11.field856 && var19.field785 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field785[var21] != null) {
														field1030[field1034] = var19.field785[var21] + " @lre@" + var19.field770;

														if (var21 == 0) {
															field1273[field1034] = 871;
														}

														if (var21 == 1) {
															field1273[field1034] = 526;
														}

														if (var21 == 2) {
															field1273[field1034] = 156;
														}

														field1274[field1034] = var19.field768;
														field1271[field1034] = var14;
														field1272[field1034] = var11.field834;
														field1034++;
													}
												}
											}

											if (var11.field863 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field863[var22] != null) {
														field1030[field1034] = var11.field863[var22] + " @lre@" + var19.field770;

														if (var22 == 0) {
															field1273[field1034] = 134;
														}

														if (var22 == 1) {
															field1273[field1034] = 701;
														}

														if (var22 == 2) {
															field1273[field1034] = 570;
														}

														if (var22 == 3) {
															field1273[field1034] = 719;
														}

														if (var22 == 4) {
															field1273[field1034] = 440;
														}

														field1274[field1034] = var19.field768;
														field1271[field1034] = var14;
														field1272[field1034] = var11.field834;
														field1034++;
													}
												}
											}

											field1030[field1034] = "Examine @lre@" + var19.field770;
											field1273[field1034] = 1974;
											field1274[field1034] = var19.field768;
											field1272[field1034] = var11.field831[var14];
											field1034++;
										} else if ((field1315 & 0x10) == 0x10) {
											field1030[field1034] = field1316 + " @lre@" + var19.field770;
											field1273[field1034] = 63;
											field1274[field1034] = var19.field768;
											field1271[field1034] = var14;
											field1272[field1034] = var11.field834;
											field1034++;
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

	@ObfuscatedName("client.k(I)V")
	public final void method378() {
		field1301.method198(153);

		if (field1238 != -1) {
			field1238 = -1;
			field975 = true;
			field1117 = false;
			field1146 = true;
		}

		if (field1152 != -1) {
			field1152 = -1;
			field1044 = true;
			field1117 = false;
		}

		field1016 = -1;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method379() {
		try {
			if (field1009 != null) {
				field1009.method29();
			}
		} catch (Exception var2) {
		}

		field1009 = null;
		field1330 = false;
		field1155 = 0;
		field1002 = "";
		field1003 = "";
		class5.method35(false);
		method415();
		field1298.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1224[var1].method295();
		}

		System.gc();
		method464();
		field1205 = null;
		field1017 = 0;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method380(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field989 != -1) {
			field1217 = arg2;
			field17 = 0;
		}

		if (field1152 == -1) {
			field1044 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1230[var4] = field1230[var4 - 1];
			field1231[var4] = field1231[var4 - 1];
			field1232[var4] = field1232[var4 - 1];
		}

		field1230[0] = arg0;
		field1231[0] = arg1;
		field1232[0] = arg2;
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void method381(class37 arg0, int arg1) {
		while (arg0.field541 + 10 < arg1 * 8) {
			int var3 = arg0.method220(11);
			if (var3 == 2047) {
				break;
			}

			if (field1198[var3] == null) {
				field1198[var3] = new class26();
				if (field1203[var3] != null) {
					field1198[var3].method113(field1203[var3]);
				}
			}

			field1200[field1199++] = var3;
			class26 var4 = field1198[var3];
			var4.field312 = field1209;
			int var5 = arg0.method220(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method220(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method220(1);
			var4.method109(field1312.field316[0] + var5, field1312.field317[0] + var6, var7 == 1);
			int var8 = arg0.method220(1);
			if (var8 == 1) {
				field1202[field1201++] = var3;
			}
		}

		arg0.method221();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method382(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1212 = "";
				field1213 = "Connecting to server...";
				method487();
			}

			field1009 = new class4(this, method452(field1181 + 43594));
			field1009.method32(field999.field539, 0, 8);
			field999.field540 = 0;
			field958 = field999.method215();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field958 >> 32), (int) field958 };
			field1301.field540 = 0;
			field1301.method199(10);
			field1301.method203(var4[0]);
			field1301.method203(var4[1]);
			field1301.method203(var4[2]);
			field1301.method203(var4[3]);
			field1301.method203(signlink.uid);
			field1301.method206(arg0);
			field1301.method206(arg1);
			field1301.method224(field1256, field1192);
			field1161.field540 = 0;

			if (arg2) {
				field1161.method199(18);
			} else {
				field1161.method199(16);
			}

			field1161.method199(field1301.field540 + 36 + 1 + 1);
			field1161.method199(218);
			field1161.method199(field1183 ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				field1161.method203(field1303[var5]);
			}

			field1161.method207(field1301.field540, field1301.field539, 0);
			field1301.field544 = new class46(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			field1168 = new class46(var4);
			field1009.method33(field1161.field540, field1161.field539, 0);
			int var7 = field1009.method30();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				method382(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					field973 = true;
				} else {
					field973 = false;
				}

				class5.method35(false);
				field1330 = true;
				field1301.field540 = 0;
				field999.field540 = 0;
				field1038 = -1;
				field1285 = -1;
				field1286 = -1;
				field1287 = -1;
				field1037 = 0;
				field1039 = 0;
				field1070 = 0;
				field1041 = 0;
				field1208 = 0;
				field1034 = 0;
				field1235 = false;
				field13 = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					field1232[var8] = null;
				}

				field1304 = 0;
				field1313 = 0;
				field1140 = 0;
				field1119 = 0;
				field1077 = (int) (Math.random() * 100.0D) - 50;
				field1214 = (int) (Math.random() * 110.0D) - 55;
				field1068 = (int) (Math.random() * 80.0D) - 40;
				field1332 = (int) (Math.random() * 120.0D) - 60;
				field1063 = (int) (Math.random() * 30.0D) - 20;
				field949 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1325 = -1;
				field968 = 0;
				field969 = 0;
				field1199 = 0;
				field1174 = 0;

				for (int var9 = 0; var9 < field1196; var9++) {
					field1198[var9] = null;
					field1203[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					field1173[var10] = null;
				}

				field1312 = field1198[field1197] = new class26();
				field1126.method232();
				field1233.method232();
				field952.method232();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							field1178[var11][var12][var13] = null;
						}
					}
				}

				field1022 = new class41();
				field1109 = 0;
				field989 = -1;
				field1152 = -1;
				field1016 = -1;
				field1238 = -1;
				field1117 = false;
				field1278 = 3;
				field953 = false;
				field1235 = false;
				field1023 = false;
				field1217 = null;
				field1102 = 0;
				field1132 = -1;
				field1253 = true;
				method386();

				for (int var14 = 0; var14 < 5; var14++) {
					field1258[var14] = 0;
				}

				field1188 = 0;
				field966 = 0;
				field1033 = 0;
				field1169 = 0;
				field1097 = 0;
				field1193 = 0;
				field1162 = 0;
				field1195 = 0;
				field1320 = 0;
				method416();
				return;
			}

			if (var7 == 3) {
				field1212 = "";
				field1213 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				field1212 = "Your account has been disabled.";
				field1213 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				field1212 = "Your account is already logged in.";
				field1213 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				field1212 = "RuneScape has been updated!";
				field1213 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				field1212 = "This world is full.";
				field1213 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				field1212 = "Unable to connect.";
				field1213 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				field1212 = "Login limit exceeded.";
				field1213 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				field1212 = "Unable to connect.";
				field1213 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				field1213 = "Login server rejected session.";
				field1213 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				field1212 = "You need a members account to login to this world.";
				field1213 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				field1212 = "Could not complete login.";
				field1213 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				field1212 = "The server is being updated.";
				field1213 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				field1330 = true;
				field1301.field540 = 0;
				field999.field540 = 0;
				field1038 = -1;
				field1285 = -1;
				field1286 = -1;
				field1287 = -1;
				field1037 = 0;
				field1039 = 0;
				field1070 = 0;
				field1034 = 0;
				field1235 = false;
				return;
			}

			if (var7 == 16) {
				field1212 = "Login attempts exceeded.";
				field1213 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				field1212 = "You are standing in a members-only area.";
				field1213 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			field1212 = "";
			field1213 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method383() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231 && field992[0] != -1) {
				field975 = true;
				field1278 = 0;
				field1146 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231 && field992[1] != -1) {
				field975 = true;
				field1278 = 1;
				field1146 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231 && field992[2] != -1) {
				field975 = true;
				field1278 = 2;
				field1146 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229 && field992[3] != -1) {
				field975 = true;
				field1278 = 3;
				field1146 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231 && field992[4] != -1) {
				field975 = true;
				field1278 = 4;
				field1146 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231 && field992[5] != -1) {
				field975 = true;
				field1278 = 5;
				field1146 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231 && field992[6] != -1) {
				field975 = true;
				field1278 = 6;
				field1146 = true;
			}

			if (field18 >= 550 && field18 <= 584 && field19 >= 492 && field19 < 528 && field992[7] != -1) {
				field975 = true;
				field1278 = 7;
				field1146 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529 && field992[8] != -1) {
				field975 = true;
				field1278 = 8;
				field1146 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529 && field992[9] != -1) {
				field975 = true;
				field1278 = 9;
				field1146 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528 && field992[10] != -1) {
				field975 = true;
				field1278 = 10;
				field1146 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529 && field992[11] != -1) {
				field975 = true;
				field1278 = 11;
				field1146 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529 && field992[12] != -1) {
				field975 = true;
				field1278 = 12;
				field1146 = true;
			}

			if (field18 >= 734 && field18 <= 768 && field19 >= 492 && field19 < 528 && field992[13] != -1) {
				field975 = true;
				field1278 = 13;
				field1146 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method384(int arg0, int arg1) {
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

	@ObfuscatedName("client.e(Z)V")
	public final void method385() {
		if (field1005 != 0) {
			class36 var1 = field1113;
			int var2 = 0;
			if (field1070 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1232[var3] != null) {
					int var4 = field1230[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field997 == 0 || field997 == 1 && method370(field1231[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.method191(0, 4, "From " + field1231[var3] + ": " + field1232[var3], var5);
						var1.method191(0xFFFF, 4, "From " + field1231[var3] + ": " + field1232[var3], var5 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field997 < 2) {
						int var6 = 329 - var2 * 13;
						var1.method191(0, 4, field1232[var3], var6);
						var1.method191(0xFFFF, 4, field1232[var3], var6 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field997 < 2) {
						int var7 = 329 - var2 * 13;
						var1.method191(0, 4, "To " + field1231[var3] + ": " + field1232[var3], var7);
						var1.method191(0xFFFF, 4, "To " + field1231[var3] + ": " + field1232[var3], var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method386() {
		field1275 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1191[var1] = -1;
			for (int var2 = 0; var2 < class59.field821; var2++) {
				if (!class59.field822[var2].field828 && class59.field822[var2].field823 == var1 + (field1253 ? 0 : 7)) {
					field1191[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLkb;)V")
	public final void method387(int arg0, class37 arg1) {
		if (arg0 == 220 || arg0 == 214) {
			int var3 = arg1.method209();
			int var4 = (var3 >> 4 & 0x7) + field1128;
			int var5 = (var3 & 0x7) + field1129;
			int var6 = arg1.method209();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1004[var7];
			int var10;
			if (arg0 == 214) {
				var10 = -1;
			} else {
				var10 = arg1.method211();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field1022.method228(); var12 != null; var12 = (class38) field1022.method230()) {
					if (field1189 == var12.field551 && var12.field553 == var4 && var12.field554 == var5 && var12.field552 == var9) {
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
						var13 = field1298.method77(field1189, var4, var5);
					}

					if (var9 == 1) {
						var13 = field1298.method78(var4, var5, field1189);
					}

					if (var9 == 2) {
						var13 = field1298.method79(field1189, var4, var5);
					}

					if (var9 == 3) {
						var13 = field1298.method80(field1189, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field1298.method81(field1189, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field551 = field1189;
					var11.field552 = var9;
					var11.field553 = var4;
					var11.field554 = var5;
					var11.field558 = var14;
					var11.field560 = var15;
					var11.field559 = var16;
					field1022.method225(var11);
				}

				var11.field555 = var10;
				var11.field557 = var7;
				var11.field556 = var8;
				method475(var7, var8, var10, var4, var5, field1189, var9);
			}
		} else if (arg0 == 78) {
			int var18 = arg1.method209();
			int var19 = (var18 >> 4 & 0x7) + field1128;
			int var20 = (var18 & 0x7) + field1129;
			int var21 = arg1.method209();
			int var22 = var21 >> 2;
			int var23 = field1004[var22];
			int var24 = arg1.method211();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = field1298.method77(field1189, var19, var20);
				}

				if (var23 == 1) {
					var25 = field1298.method78(var19, var20, field1189);
				}

				if (var23 == 2) {
					var25 = field1298.method79(field1189, var19, var20);
				}

				if (var23 == 3) {
					var25 = field1298.method80(field1189, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(var25 >> 14 & 0x7FFF, var20, field1189, var23, false, var19, class62.field895[var24]);
					field1331.method225(var26);
				}
			}
		} else if (arg0 == 246) {
			int var27 = arg1.method209();
			int var28 = (var27 >> 4 & 0x7) + field1128;
			int var29 = (var27 & 0x7) + field1129;
			int var30 = arg1.method211();
			int var31 = arg1.method211();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var32 = new class22();
				var32.field266 = var30;
				var32.field267 = var31;

				if (field1178[field1189][var28][var29] == null) {
					field1178[field1189][var28][var29] = new class41();
				}

				field1178[field1189][var28][var29].method225(var32);
				method451(var28, var29);
			}
		} else if (arg0 == 61) {
			int var33 = arg1.method209();
			int var34 = (var33 >> 4 & 0x7) + field1128;
			int var35 = (var33 & 0x7) + field1129;
			int var36 = arg1.method211();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				class41 var37 = field1178[field1189][var34][var35];
				if (var37 != null) {
					for (class22 var38 = (class22) var37.method228(); var38 != null; var38 = (class22) var37.method230()) {
						if ((var36 & 0x7FFF) == var38.field266) {
							var38.method107();
							break;
						}
					}

					if (var37.method228() == null) {
						field1178[field1189][var34][var35] = null;
					}

					method451(var34, var35);
				}
			}
		} else if (arg0 == 1) {
			int var39 = arg1.method209();
			int var40 = (var39 >> 4 & 0x7) + field1128;
			int var41 = (var39 & 0x7) + field1129;
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
				class27 var52 = new class27(var44, var50, var45, var41, var40, field1189, var47, field1209 + var48, field1209 + var49, var51, method449(field1189, var41, var40) - var46);
				var52.method116(var42, method449(field1189, var43, var42) - var47, var43, field1209 + var48);
				field1126.method225(var52);
			}
		} else if (arg0 == 195) {
			int var53 = arg1.method209();
			int var54 = (var53 >> 4 & 0x7) + field1128;
			int var55 = (var53 & 0x7) + field1129;
			int var56 = arg1.method211();
			int var57 = arg1.method209();
			int var58 = arg1.method211();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				class28 var59 = new class28(var55, field1209, var58, field1189, var56, method449(field1189, var55, var54) - var57, var54);
				field1233.method225(var59);
			}
		} else if (arg0 == 127) {
			int var60 = arg1.method209();
			int var61 = (var60 >> 4 & 0x7) + field1128;
			int var62 = (var60 & 0x7) + field1129;
			int var63 = arg1.method211();
			int var64 = arg1.method211();
			int var65 = arg1.method211();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && field976 != var65) {
				class22 var66 = new class22();
				var66.field266 = var63;
				var66.field267 = var64;

				if (field1178[field1189][var61][var62] == null) {
					field1178[field1189][var61][var62] = new class41();
				}

				field1178[field1189][var61][var62].method225(var66);
				method451(var61, var62);
			}
		} else if (arg0 == 25) {
			int var67 = arg1.method209();
			int var68 = (var67 >> 4 & 0x7) + field1128;
			int var69 = (var67 & 0x7) + field1129;
			int var70 = arg1.method209();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = field1004[var71];
			int var74 = arg1.method211();
			int var75 = arg1.method211();
			int var76 = arg1.method211();
			int var77 = arg1.method211();
			byte var78 = arg1.method210();
			byte var79 = arg1.method210();
			byte var80 = arg1.method210();
			byte var81 = arg1.method210();
			class26 var82;
			if (field976 == var77) {
				var82 = field1312;
			} else {
				var82 = field1198[var77];
			}

			if (var82 != null) {
				class39 var83 = new class39(-1, var69, var68, field1209 + var75, field1189, var73, var72, var71);
				field952.method225(var83);
				class39 var84 = new class39(var74, var69, var68, field1209 + var76, field1189, var73, var72, var71);
				field952.method225(var84);
				int var85 = field1032[field1189][var68][var69];
				int var86 = field1032[field1189][var68 + 1][var69];
				int var87 = field1032[field1189][var68 + 1][var69 + 1];
				int var88 = field1032[field1189][var68][var69 + 1];
				class53 var89 = class53.method275(var74);
				var82.field330 = field1209 + var75;
				var82.field331 = field1209 + var76;
				var82.field335 = var89.method278(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.field706;
				int var91 = var89.field707;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.field707;
					var91 = var89.field706;
				}

				var82.field332 = var68 * 128 + var90 * 64;
				var82.field334 = var69 * 128 + var91 * 64;
				var82.field333 = method449(field1189, var82.field334, var82.field332);

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
			int var95 = (var94 >> 4 & 0x7) + field1128;
			int var96 = (var94 & 0x7) + field1129;
			int var97 = arg1.method211();
			int var98 = arg1.method211();
			int var99 = arg1.method211();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1178[field1189][var95][var96];
				if (var100 != null) {
					for (class22 var101 = (class22) var100.method228(); var101 != null; var101 = (class22) var100.method230()) {
						if ((var97 & 0x7FFF) == var101.field266 && var101.field267 == var98) {
							var101.field267 = var99;
							break;
						}
					}

					method451(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method388(int arg0) {
		class60 var2 = class60.field829[arg0];
		for (int var3 = 0; var3 < var2.field850.length && var2.field850[var3] != -1; var3++) {
			class60 var4 = class60.field829[var2.field850[var3]];
			if (var4.field836 == 1) {
				method388(var4.field834);
			}

			var4.field832 = 0;
			var4.field833 = 0;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method389(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1164; var3++) {
				if (field1050[var3] == arg0) {
					field1164--;
					field975 = true;

					for (int var4 = var3; var4 < field1164; var4++) {
						field1050[var4] = field1050[var4 + 1];
					}

					field1301.method198(68);
					field1301.method205(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Lkb;II)V")
	public final void method390(class37 arg0, int arg1) {
		field1299 = 0;
		field1201 = 0;
		method409(arg0, arg1);
		method369(arg0, arg1);
		method404(arg1, arg0);

		for (int var3 = 0; var3 < field1299; var3++) {
			int var4 = field1300[var3];
			if (field1209 != field1173[var4].field312) {
				field1173[var4].field320 = null;
				field1173[var4] = null;
			}
		}

		if (arg0.field540 != arg1) {
			signlink.reporterror(field1002 + " size mismatch in getnpcpos - pos:" + arg0.field540 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1174; var5++) {
			if (field1173[field1175[var5]] == null) {
				signlink.reporterror(field1002 + " null entry in npc list - pos:" + var5 + " size:" + field1174);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method391() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field949 + field1332 & 0x7FF;
				int var4 = class33.field501[var3];
				int var5 = class33.field502[var3];
				var4 = (field1063 + 256) * var4 >> 8;
				var5 = (field1063 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1312.field268 + var6 >> 7;
				int var9 = field1312.field269 - var7 >> 7;
				boolean var10 = method474(0, var9, field1312.field317[0], 1, 0, field1312.field316[0], 0, var8, true, 0, 0);
				if (var10) {
					field1301.method199(var1);
					field1301.method199(var2);
					field1301.method200(field949);
					field1301.method199(57);
					field1301.method199(field1332);
					field1301.method199(field1063);
					field1301.method199(89);
					field1301.method200(field1312.field268);
					field1301.method200(field1312.field269);
					field1301.method199(field1311);
					field1301.method199(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method392() {
		field1079.method235();
		class33.field503 = field961;
		field985.method186(0, 0);

		if (field1238 != -1) {
			method448(0, 0, 0, class60.field829[field1238]);
		} else if (field992[field1278] != -1) {
			method448(0, 0, 0, class60.field829[field992[field1278]]);
		}

		if (field1235 && field1058 == 1) {
			method373();
		}

		field1079.method236(562, 231, field8);
		field1081.method235();
		class33.field503 = field962;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method393() {
		field1136 = false;
		while (field1043) {
			field1136 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1254 = null;
		field1255 = null;
		field954 = null;
		field1053 = null;
		field1054 = null;
		field1055 = null;
		field1056 = null;
		field963 = null;
		field964 = null;
		field1269 = null;
		field1270 = null;
		field1074 = null;
		field1075 = null;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method394() {
		if (field1041 > 0) {
			method379();
		} else {
			field1081.method235();
			field1113.method188("Connection lost", 144, 257, 0);
			field1113.method188("Connection lost", 143, 256, 0xFFFFFF);
			field1113.method188("Please wait - attempting to reestablish", 159, 257, 0);
			field1113.method188("Please wait - attempting to reestablish", 158, 256, 0xFFFFFF);
			field1081.method236(8, 11, field8);
			field968 = 0;
			class4 var1 = field1009;
			field1330 = false;
			method382(field1002, field1003, true);

			if (!field1330) {
				method379();
			}

			try {
				var1.method29();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method395() {
		field1254 = new class35(field1309, "titlebox", 0);
		field1255 = new class35(field1309, "titlebutton", 0);
		field954 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field954[var1] = new class35(field1309, "runes", var1);
		}

		field1074 = new class34(128, 265);
		field1075 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1074.field515[var2] = field1247.field580[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1075.field515[var3] = field1248.field580[var3];
		}

		field1054 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1054[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1054[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1054[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1054[var7 + 192] = 0xFFFFFF;
		}

		field1055 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1055[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1055[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1055[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1055[var11 + 192] = 0xFFFFFF;
		}

		field1056 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1056[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1056[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1056[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1056[var15 + 192] = 0xFFFFFF;
		}

		field1053 = new int[256];
		field963 = new int[32768];
		field964 = new int[32768];
		method427(null);
		field1269 = new int[32768];
		field1270 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1136) {
			field977 = true;
			field1136 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(IZI)Z")
	public final boolean method396(int arg0, int arg1) {
		boolean var3 = false;
		class60 var4 = class60.field829[arg1];
		for (int var5 = 0; var5 < var4.field850.length && var4.field850[var5] != -1; var5++) {
			class60 var6 = class60.field829[var4.field850[var5]];
			if (var6.field836 == 1) {
				var3 |= method396(arg0, var6.field834);
			}

			if (var6.field836 == 6 && (var6.field877 != -1 || var6.field878 != -1)) {
				boolean var7 = method405(var6);
				int var8;
				if (var7) {
					var8 = var6.field878;
				} else {
					var8 = var6.field877;
				}

				if (var8 != -1) {
					class62 var9 = class62.field895[var8];
					var6.field833 += arg0;
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

	@ObfuscatedName("client.a(IBIIIII)V")
	public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
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

		field1010 = arg1 - var9;
		field1011 = arg2 - var10;
		field1012 = arg4 - var11;
		field1013 = arg5;
		field1014 = arg0;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method398() {
		if (field1312.field268 >> 7 == field968 && field1312.field269 >> 7 == field969) {
			field968 = 0;
		}

		for (int var1 = -1; var1 < field1199; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1312;
				var3 = field1197 << 14;
			} else {
				var2 = field1198[field1200[var1]];
				var3 = field1200[var1] << 14;
			}

			if (var2 != null && var2.method111()) {
				var2.field340 = false;
				if ((field1183 && field1199 > 50 || field1199 > 200) && var1 != -1 && var2.field292 == var2.field273) {
					var2.field340 = true;
				}

				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field335 == null || field1209 < var2.field330 || field1209 >= var2.field331) {
						if ((var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
							if (field1118[var4][var5] == field1225) {
								continue;
							}

							field1118[var4][var5] = field1225;
						}

						var2.field329 = method449(field1189, var2.field269, var2.field268);
						field1298.method61(var2.field269, 60, var2.field329, null, var2.field270, var2.field271, var3, var2.field268, var2, field1189);
					} else {
						var2.field340 = false;
						var2.field329 = method449(field1189, var2.field269, var2.field268);
						field1298.method62(var2.field338, var2.field337, field1189, var2, var2.field329, var2.field339, var2.field269, null, 60, var2.field268, var3, var2.field336, var2.field270);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method7() {
		if (!field1257 && !field1179 && !field974) {
			field1209++;

			if (field1330) {
				method476();
			} else {
				method478();
			}
		}
	}

	@ObfuscatedName("client.e(B)I")
	public final int method399() {
		int var1 = 3;
		if (field1013 < 310) {
			int var2 = field1010 >> 7;
			int var3 = field1012 >> 7;
			int var4 = field1312.field268 >> 7;
			int var5 = field1312.field269 >> 7;

			if ((field998[field1189][var2][var3] & 0x4) != 0) {
				var1 = field1189;
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

					if ((field998[field1189][var2][var3] & 0x4) != 0) {
						var1 = field1189;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field998[field1189][var2][var3] & 0x4) != 0) {
							var1 = field1189;
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

					if ((field998[field1189][var2][var3] & 0x4) != 0) {
						var1 = field1189;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field998[field1189][var2][var3] & 0x4) != 0) {
							var1 = field1189;
						}
					}
				}
			}
		}

		if ((field998[field1189][field1312.field268 >> 7][field1312.field269 >> 7] & 0x4) != 0) {
			var1 = field1189;
		}

		return var1;
	}

	@ObfuscatedName("client.p(I)I")
	public final int method400() {
		int var1 = method449(field1189, field1012, field1010);
		if (var1 - field1011 < 800 && (field998[field1189][field1010 >> 7][field1012 >> 7] & 0x4) != 0) {
			return field1189;
		}

		return 3;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method401() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1016 != -1 && field1049 == field1016) {
				if (var1 == 8 && field967.length() > 0) {
					field967 = field967.substring(0, field967.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field967.length() < 12) {
					field967 = field967 + (char) var1;
				}
			} else if (field1023) {
				if (var1 >= 32 && var1 <= 122 && field942.length() < 80) {
					field942 = field942 + (char) var1;
					field1044 = true;
				}

				if (var1 == 8 && field942.length() > 0) {
					field942 = field942.substring(0, field942.length() - 1);
					field1044 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1023 = false;
					field1044 = true;

					if (field1072 == 1) {
						long var2 = class48.method251(field942);
						method483(var2);
					}

					if (field1072 == 2 && field1109 > 0) {
						long var4 = class48.method251(field942);
						method440(var4);
					}

					if (field1072 == 3 && field942.length() > 0) {
						field1301.method198(6);
						field1301.method199(0);
						int var6 = field1301.field540;
						field1301.method205(field1139);
						class49.method259(field1301, field942);
						field1301.method208(field1301.field540 - var6);
						field942 = class48.method256(field942);
						field942 = class65.method335(field942);
						method380(6, class48.method255(class48.method252(field1139)), field942);

						if (field997 == 2) {
							field997 = 1;
							field983 = true;
							field1301.method198(197);
							field1301.method199(field1318);
							field1301.method199(field997);
							field1301.method199(field990);
						}
					}

					if (field1072 == 4 && field1164 < 100) {
						long var7 = class48.method251(field942);
						method454(var7);
					}

					if (field1072 == 5 && field1164 > 0) {
						long var9 = class48.method251(field942);
						method389(var9);
					}
				}
			} else if (field953) {
				if (var1 >= 48 && var1 <= 57 && field1048.length() < 10) {
					field1048 = field1048 + (char) var1;
					field1044 = true;
				}

				if (var1 == 8 && field1048.length() > 0) {
					field1048 = field1048.substring(0, field1048.length() - 1);
					field1044 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1048.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1048);
						} catch (Exception var15) {
						}

						field1301.method198(147);
						field1301.method203(var11);
					}

					field953 = false;
					field1044 = true;
				}
			} else if (field1152 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1267.length() < 80) {
					field1267 = field1267 + (char) var1;
					field1044 = true;
				}

				if (var1 == 8 && field1267.length() > 0) {
					field1267 = field1267.substring(0, field1267.length() - 1);
					field1044 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1267.length() > 0) {
					if (field1267.equals("::clientdrop") && (field11 != null || method477().indexOf("192.168.1.") != -1)) {
						method394();
					} else if (field1267.startsWith("::")) {
						field1301.method198(251);
						field1301.method199(field1267.length() - 1);
						field1301.method206(field1267.substring(2));
					} else {
						byte var12 = 0;
						if (field1267.startsWith("yellow:")) {
							var12 = 0;
							field1267 = field1267.substring(7);
						}

						if (field1267.startsWith("red:")) {
							var12 = 1;
							field1267 = field1267.substring(4);
						}

						if (field1267.startsWith("green:")) {
							var12 = 2;
							field1267 = field1267.substring(6);
						}

						if (field1267.startsWith("cyan:")) {
							var12 = 3;
							field1267 = field1267.substring(5);
						}

						if (field1267.startsWith("purple:")) {
							var12 = 4;
							field1267 = field1267.substring(7);
						}

						if (field1267.startsWith("white:")) {
							var12 = 5;
							field1267 = field1267.substring(6);
						}

						if (field1267.startsWith("flash1:")) {
							var12 = 6;
							field1267 = field1267.substring(7);
						}

						if (field1267.startsWith("flash2:")) {
							var12 = 7;
							field1267 = field1267.substring(7);
						}

						if (field1267.startsWith("flash3:")) {
							var12 = 8;
							field1267 = field1267.substring(7);
						}

						if (field1267.startsWith("glow1:")) {
							var12 = 9;
							field1267 = field1267.substring(6);
						}

						if (field1267.startsWith("glow2:")) {
							var12 = 10;
							field1267 = field1267.substring(6);
						}

						if (field1267.startsWith("glow3:")) {
							var12 = 11;
							field1267 = field1267.substring(6);
						}

						byte var13 = 0;
						if (field1267.startsWith("wave:")) {
							var13 = 1;
							field1267 = field1267.substring(5);
						}

						if (field1267.startsWith("scroll:")) {
							var13 = 2;
							field1267 = field1267.substring(7);
						}

						field1301.method198(42);
						field1301.method199(0);
						int var14 = field1301.field540;
						field1301.method199(var12);
						field1301.method199(var13);
						class49.method259(field1301, field1267);
						field1301.method208(field1301.field540 - var14);
						field1267 = class48.method256(field1267);
						field1267 = class65.method335(field1267);
						field1312.field280 = field1267;
						field1312.field282 = var12;
						field1312.field283 = var13;
						field1312.field281 = 150;
						method380(2, field1312.field321, field1312.field280);

						if (field1318 == 2) {
							field1318 = 3;
							field983 = true;
							field1301.method198(197);
							field1301.method199(field1318);
							field1301.method199(field997);
							field1301.method199(field990);
						}
					}

					field1267 = "";
					field1044 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method402() {
		try {
			field1325 = -1;
			field952.method232();
			field1331.method232();
			field1233.method232();
			field1126.method232();
			class33.method156();
			method415();
			field1298.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1224[var1].method295();
			}

			System.gc();
			class3 var2 = new class3(field1032, 104, field998, 104);
			byte[] var3 = new byte[100000];
			int var4 = field996.length;
			class3.field25 = class18.field194;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1186[var5] >> 8;
				int var7 = field1186[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field25 = false;
				}
			}

			if (class3.field25) {
				field1298.method51(field1189);
			} else {
				field1298.method51(0);
			}

			field1301.method198(126);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1186[var8] >> 8) * 64 - field1321;
				int var10 = (field1186[var8] & 0xFF) * 64 - field1322;
				byte[] var11 = field996[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method214();
					class44.method238(var3, var12, var11, var11.length - 4, 4);
					var2.method15((field1066 - 6) * 8, var3, var9, var10, (field1067 - 6) * 8);
				} else if (field1067 < 800) {
					var2.method14(var10, 64, 64, var9);
				}
			}

			field1301.method198(126);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field1204[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method214();
					class44.method238(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1186[var13] >> 8) * 64 - field1321;
					int var17 = (field1186[var13] & 0xFF) * 64 - field1322;
					var2.method16(field1331, field1298, var16, field1224, var3, var17);
				}
			}

			field1301.method198(126);
			var2.method18(field1298, field1224);
			field1081.method235();
			field1301.method198(126);

			for (class40 var18 = (class40) field1331.method228(); var18 != null; var18 = (class40) field1331.method230()) {
				if ((field998[1][var18.field571][var18.field572] & 0x2) == 2) {
					var18.field569--;
					if (var18.field569 < 0) {
						var18.method107();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method451(var19, var20);
				}
			}

			for (class38 var21 = (class38) field1022.method228(); var21 != null; var21 = (class38) field1022.method230()) {
				method475(var21.field557, var21.field556, var21.field555, var21.field553, var21.field554, var21.field551, var21.field552);
			}
		} catch (Exception var23) {
		}

		class53.field732.method104();
		System.gc();
		class33.method157(20);
	}

	@ObfuscatedName("client.s(I)V")
	public final void method403() {
		for (int var1 = -1; var1 < field1199; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1197;
			} else {
				var2 = field1200[var1];
			}

			class26 var3 = field1198[var2];
			if (var3 != null && var3.field281 > 0) {
				var3.field281--;
				if (var3.field281 == 0) {
					var3.field280 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1174; var4++) {
			int var5 = field1175[var4];
			class25 var6 = field1173[var5];
			if (var6 != null && var6.field281 > 0) {
				var6.field281--;
				if (var6.field281 == 0) {
					var6.field280 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void method404(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field1201; var3++) {
			int var4 = field1202[var3];
			class25 var5 = field1173[var4];
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
				if (var7 == -1 || var5.field295 == -1 || class62.field895[var7].field903 > class62.field895[var5.field295].field903 || class62.field895[var5.field295].field903 == 0) {
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
				var5.field286 = field1209 + 400;
				var5.field287 = arg1.method209();
				var5.field288 = arg1.method209();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field320 = class54.method281(arg1.method211());
				var5.field275 = var5.field320.field746;
				var5.field276 = var5.field320.field747;
				var5.field277 = var5.field320.field748;
				var5.field278 = var5.field320.field749;
				var5.field273 = var5.field320.field745;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field300 = arg1.method211();
				int var9 = arg1.method214();
				var5.field304 = var9 >> 16;
				var5.field303 = (var9 & 0xFFFF) + field1209;
				var5.field301 = 0;
				var5.field302 = 0;

				if (var5.field303 > field1209) {
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

	@ObfuscatedName("client.a(ZLhc;)Z")
	public final boolean method405(class60 arg0) {
		if (arg0.field844 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field844.length; var2++) {
			int var3 = method372(var2, arg0);
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

	@ObfuscatedName("client.a(ILz;III)V")
	public final void method406(class26 arg0, int arg1, int arg2, int arg3) {
		if (field1312 != arg0 && field1034 < 400) {
			String var5 = arg0.field321 + method384(field1312.field327, arg0.field327) + " (level-" + arg0.field327 + ")";
			if (field1304 == 1) {
				field1030[field1034] = "Use " + field1308 + " with @whi@" + var5;
				field1273[field1034] = 103;
				field1274[field1034] = arg1;
				field1271[field1034] = arg2;
				field1272[field1034] = arg3;
				field1034++;
			} else if (field1313 != 1) {
				field1030[field1034] = "Follow @whi@" + var5;
				field1273[field1034] = 1741;
				field1274[field1034] = arg1;
				field1271[field1034] = arg2;
				field1272[field1034] = arg3;
				field1034++;
				if (field1020 == 0) {
					field1030[field1034] = "Trade with @whi@" + var5;
					field1273[field1034] = 1528;
					field1274[field1034] = arg1;
					field1271[field1034] = arg2;
					field1272[field1034] = arg3;
					field1034++;
				}

				if (field1042 > 0) {
					field1030[field1034] = "Attack @whi@" + var5;

					if (field1312.field327 >= arg0.field327) {
						field1273[field1034] = 593;
					} else {
						field1273[field1034] = 2593;
					}

					field1274[field1034] = arg1;
					field1271[field1034] = arg2;
					field1272[field1034] = arg3;
					field1034++;
				}

				if (field994 == 1) {
					field1030[field1034] = "Fight @whi@" + var5;
					field1273[field1034] = 593;
					field1274[field1034] = arg1;
					field1271[field1034] = arg2;
					field1272[field1034] = arg3;
					field1034++;
				}

				if (field994 == 2) {
					field1030[field1034] = "Duel-with @whi@" + var5;
					field1273[field1034] = 1596;
					field1274[field1034] = arg1;
					field1271[field1034] = arg2;
					field1272[field1034] = arg3;
					field1034++;
				}
			} else if ((field1315 & 0x8) == 8) {
				field1030[field1034] = field1316 + " @whi@" + var5;
				field1273[field1034] = 48;
				field1274[field1034] = arg1;
				field1271[field1034] = arg2;
				field1272[field1034] = arg3;
				field1034++;
			}

			for (int var6 = 0; var6 < field1034; var6++) {
				if (field1273[var6] == 981) {
					field1030[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;I)Z")
	public final boolean method407(class60 arg0) {
		int var2 = arg0.field838;
		if (var2 == 201) {
			field1044 = true;
			field953 = false;
			field1023 = true;
			field942 = "";
			field1072 = 1;
			field1260 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1044 = true;
			field953 = false;
			field1023 = true;
			field942 = "";
			field1072 = 2;
			field1260 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1041 = 250;
			return true;
		}

		if (var2 == 501) {
			field1044 = true;
			field953 = false;
			field1023 = true;
			field942 = "";
			field1072 = 4;
			field1260 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1044 = true;
			field953 = false;
			field1023 = true;
			field942 = "";
			field1072 = 5;
			field1260 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1191[var3];
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

					if (!class59.field822[var5].field828 && class59.field822[var5].field823 == var3 + (field1253 ? 0 : 7)) {
						break;
					}
				}

				field1191[var3] = var5;
				field1275 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1258[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1073[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1073[var6].length) {
					var8 = 0;
				}
			}

			field1258[var6] = var8;
			field1275 = true;
		}

		if (var2 == 324 && !field1253) {
			field1253 = true;
			method386();
		}

		if (var2 == 325 && field1253) {
			field1253 = false;
			method386();
		}

		if (var2 == 326) {
			field1301.method198(239);
			field1301.method199(field1253 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1301.method199(field1191[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1301.method199(field1258[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1243 = !field1243;
		}

		if (var2 >= 601 && var2 <= 612) {
			method378();

			if (field967.length() > 0) {
				field1301.method198(252);
				field1301.method205(class48.method251(field967));
				field1301.method199(var2 - 601);
				field1301.method199(field1243 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.t(I)Z")
	public final boolean method408() {
		if (field1009 == null) {
			return false;
		}

		try {
			int var1 = field1009.method31();
			if (var1 == 0) {
				return false;
			}

			if (field1038 == -1) {
				field1009.method32(field999.field539, 0, 1);
				field1038 = field999.field539[0] & 0xFF;
				if (field1168 != null) {
					field1038 = field1038 - field1168.method246() & 0xFF;
				}

				field1037 = class56.field803[field1038];
				var1--;
			}

			if (field1037 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1009.method32(field999.field539, 0, 1);
				field1037 = field999.field539[0] & 0xFF;
				var1--;
			}

			if (field1037 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1009.method32(field999.field539, 0, 2);
				field999.field540 = 0;
				field1037 = field999.method211();
				var1 -= 2;
			}

			if (var1 < field1037) {
				return false;
			}

			field999.field540 = 0;
			field1009.method32(field999.field539, 0, field1037);
			field1039 = 0;
			field1287 = field1286;
			field1286 = field1285;
			field1285 = field1038;

			if (field1038 == 153) {
				int var2 = field999.method211();
				method388(var2);

				if (field1152 != -1) {
					field1152 = -1;
					field1044 = true;
				}

				if (field953) {
					field953 = false;
					field1044 = true;
				}

				field1238 = var2;
				field975 = true;
				field1146 = true;
				field1016 = -1;
				field1117 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 180) {
				int var3 = field999.method211();
				method388(var3);

				if (field1238 != -1) {
					field1238 = -1;
					field975 = true;
					field1146 = true;
				}

				if (field1152 != -1) {
					field1152 = -1;
					field1044 = true;
				}

				if (field953) {
					field953 = false;
					field1044 = true;
				}

				field1016 = var3;
				field1117 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 201) {
				long var4 = field999.method215();
				int var6 = field999.method214();
				int var7 = field999.method209();
				boolean var8 = false;
				for (int var9 = 0; var9 < 100; var9++) {
					if (field1001[var9] == var6) {
						var8 = true;
						break;
					}
				}

				if (var7 <= 1) {
					for (int var10 = 0; var10 < field1164; var10++) {
						if (field1050[var10] == var4) {
							var8 = true;
							break;
						}
					}
				}

				if (!var8 && field1020 == 0) {
					try {
						field1001[field1266] = var6;
						field1266 = (field1266 + 1) % 100;
						String var11 = class49.method258(field1037 - 13, field999);
						var11 = class65.method335(var11);
						if (var7 > 1) {
							method380(7, class48.method255(class48.method252(var4)), var11);
						} else {
							method380(3, class48.method255(class48.method252(var4)), var11);
						}
					} catch (Exception var179) {
						signlink.reporterror("cde1");
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 112) {
				String var13 = field999.method216();
				if (var13.endsWith(":tradereq:")) {
					String var14 = var13.substring(0, var13.indexOf(":"));
					long var15 = class48.method251(var14);
					boolean var17 = false;
					for (int var18 = 0; var18 < field1164; var18++) {
						if (field1050[var18] == var15) {
							var17 = true;
							break;
						}
					}

					if (!var17 && field1020 == 0) {
						method380(4, var14, "wishes to trade with you.");
					}
				} else if (var13.endsWith(":duelreq:")) {
					String var19 = var13.substring(0, var13.indexOf(":"));
					long var20 = class48.method251(var19);
					boolean var22 = false;
					for (int var23 = 0; var23 < field1164; var23++) {
						if (field1050[var23] == var20) {
							var22 = true;
							break;
						}
					}

					if (!var22 && field1020 == 0) {
						method380(8, var19, "wishes to duel with you.");
					}
				} else {
					method380(0, "", var13);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 147) {
				field1128 = field999.method209();
				field1129 = field999.method209();
				for (int var24 = field1128; var24 < field1128 + 8; var24++) {
					for (int var25 = field1129; var25 < field1129 + 8; var25++) {
						if (field1178[field1189][var24][var25] != null) {
							field1178[field1189][var24][var25] = null;
							method451(var24, var25);
						}
					}
				}

				for (class38 var26 = (class38) field1022.method228(); var26 != null; var26 = (class38) field1022.method230()) {
					if (var26.field553 >= field1128 && var26.field553 < field1128 + 8 && var26.field554 >= field1129 && var26.field554 < field1129 + 8 && field1189 == var26.field551) {
						method475(var26.field560, var26.field559, var26.field558, var26.field553, var26.field554, var26.field551, var26.field552);
						var26.method107();
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 98) {
				field1132 = field999.method209();
				if (field1278 == field1132) {
					if (field1132 == 3) {
						field1278 = 1;
					} else {
						field1278 = 3;
					}

					field975 = true;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 132) {
				class5.method35(true);
				field1038 = -1;
				return true;
			}

			if (field1038 == 125) {
				field968 = 0;
				field1038 = -1;
				return true;
			}

			if (field1038 == 42) {
				field1208 = field999.method209();
				if (field1208 == 1) {
					field1137 = field999.method211();
				}

				if (field1208 >= 2 && field1208 <= 6) {
					if (field1208 == 2) {
						field981 = 64;
						field982 = 64;
					}

					if (field1208 == 3) {
						field981 = 0;
						field982 = 64;
					}

					if (field1208 == 4) {
						field981 = 128;
						field982 = 64;
					}

					if (field1208 == 5) {
						field981 = 64;
						field982 = 0;
					}

					if (field1208 == 6) {
						field981 = 64;
						field982 = 128;
					}

					field1208 = 2;
					field978 = field999.method211();
					field979 = field999.method211();
					field980 = field999.method209();
				}

				if (field1208 == 10) {
					field1277 = field999.method211();
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 80) {
				int var27 = field999.method211();
				int var28 = field999.method211();
				class60.field829[var27].field877 = var28;
				field1038 = -1;
				return true;
			}

			if (field1038 == 231) {
				int var29 = field999.method211();
				int var30 = field999.method211();

				if (field1152 != -1) {
					field1152 = -1;
					field1044 = true;
				}

				if (field953) {
					field953 = false;
					field1044 = true;
				}

				field1016 = var29;
				field1238 = var30;
				field975 = true;
				field1146 = true;
				field1117 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 133) {
				int var31 = field999.method211();
				byte var32 = field999.method210();
				field1211[var31] = var32;

				if (field1147[var31] != var32) {
					field1147[var31] = var32;
					method457(var31);
					field975 = true;

					if (field989 != -1) {
						field1044 = true;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 106) {
				int var33 = field999.method211();
				method388(var33);

				if (field1238 != -1) {
					field1238 = -1;
					field975 = true;
					field1146 = true;
				}

				field1152 = var33;
				field1044 = true;
				field1016 = -1;
				field1117 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 176) {
				int var34 = field999.method211();
				String var35 = field999.method216();
				class60.field829[var34].field868 = var35;

				if (field992[field1278] == class60.field829[var34].field835) {
					field975 = true;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 165) {
				int var36 = field999.method212();
				field989 = var36;
				field1044 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 255) {
				if (field1238 != -1) {
					field1238 = -1;
					field975 = true;
					field1146 = true;
				}

				if (field1152 != -1) {
					field1152 = -1;
					field1044 = true;
				}

				if (field953) {
					field953 = false;
					field1044 = true;
				}

				field1016 = -1;
				field1117 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 38) {
				field975 = true;
				int var37 = field999.method211();
				class60 var38 = class60.field829[var37];
				while (field999.field540 < field1037) {
					int var39 = field999.method209();
					int var40 = field999.method211();
					int var41 = field999.method209();
					if (var41 == 255) {
						var41 = field999.method214();
					}

					if (var39 >= 0 && var39 < var38.field830.length) {
						var38.field830[var39] = var40;
						var38.field831[var39] = var41;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 213) {
				field1318 = field999.method209();
				field997 = field999.method209();
				field990 = field999.method209();
				field983 = true;
				field1044 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 48) {
				int var42 = field999.method211();
				int var43 = field999.method211();
				class54 var44 = class54.method281(var43);
				class60.field829[var42].field875 = var44.method284();
				field1038 = -1;
				return true;
			}

			if (field1038 == 174) {
				field1163 = true;
				field1261 = field999.method209();
				field1262 = field999.method209();
				field1263 = field999.method211();
				field1264 = field999.method209();
				field1265 = field999.method209();
				if (field1265 >= 100) {
					field1010 = field1261 * 128 + 64;
					field1012 = field1262 * 128 + 64;
					field1011 = method449(field1189, field1262, field1261) - field1263;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 218) {
				int var45 = field999.method211();
				boolean var46 = field999.method209() == 1;
				class60.field829[var45].field849 = var46;
				field1038 = -1;
				return true;
			}

			if (field1038 == 117 || field1038 == 25 || field1038 == 127 || field1038 == 195 || field1038 == 1 || field1038 == 61 || field1038 == 246 || field1038 == 78 || field1038 == 214 || field1038 == 220) {
				method387(field1038, field999);
				field1038 = -1;
				return true;
			}

			if (field1038 == 3) {
				int var47 = field999.method211();
				int var48 = field999.method211();
				if (field1066 == var47 && field1067 == var48 && field1140 != 0) {
					field1038 = -1;
					return true;
				}

				field1066 = var47;
				field1067 = var48;
				field1321 = (field1066 - 6) * 8;
				field1322 = (field1067 - 6) * 8;
				field1140 = 1;
				field1081.method235();
				field1113.method188("Loading - please wait.", 151, 257, 0);
				field1113.method188("Loading - please wait.", 150, 256, 0xFFFFFF);
				field1081.method236(8, 11, field8);
				signlink.looprate(5);
				int var49 = (field1037 - 2) / 10;
				field996 = new byte[var49][];
				field1204 = new byte[var49][];
				field1186 = new int[var49];
				field1301.method198(131);
				field1301.method199(0);
				int var50 = 0;
				for (int var51 = 0; var51 < var49; var51++) {
					int var52 = field999.method209();
					int var53 = field999.method209();
					int var54 = field999.method214();
					int var55 = field999.method214();
					field1186[var51] = (var52 << 8) + var53;

					if (var54 != 0) {
						byte[] var56 = signlink.cacheload("m" + var52 + "_" + var53);
						if (var56 != null) {
							field1046.reset();
							field1046.update(var56);

							if ((int) field1046.getValue() != var54) {
								var56 = null;
							}
						}

						if (var56 == null) {
							field1140 = 0;
							field1301.method199(0);
							field1301.method199(var52);
							field1301.method199(var53);
							var50 += 3;
						} else {
							field996[var51] = var56;
						}
					}

					if (var55 != 0) {
						byte[] var57 = signlink.cacheload("l" + var52 + "_" + var53);
						if (var57 != null) {
							field1046.reset();
							field1046.update(var57);

							if ((int) field1046.getValue() != var55) {
								var57 = null;
							}
						}

						if (var57 == null) {
							field1140 = 0;
							field1301.method199(1);
							field1301.method199(var52);
							field1301.method199(var53);
							var50 += 3;
						} else {
							field1204[var51] = var57;
						}
					}
				}

				field1301.method208(var50);
				signlink.looprate(50);
				field1081.method235();

				if (field1140 == 0) {
					field1113.method188("Map area updated since last visit, so load will take longer this time only", 166, 257, 0);
					field1113.method188("Map area updated since last visit, so load will take longer this time only", 165, 256, 0xFFFFFF);
				}

				field1081.method236(8, 11, field8);
				int var58 = field1321 - field1323;
				int var59 = field1322 - field1324;
				field1323 = field1321;
				field1324 = field1322;

				for (int var60 = 0; var60 < 8192; var60++) {
					class25 var61 = field1173[var60];
					if (var61 != null) {
						for (int var62 = 0; var62 < 10; var62++) {
							var61.field316[var62] -= var58;
							var61.field317[var62] -= var59;
						}

						var61.field268 -= var58 * 128;
						var61.field269 -= var59 * 128;
					}
				}

				for (int var63 = 0; var63 < field1196; var63++) {
					class26 var64 = field1198[var63];
					if (var64 != null) {
						for (int var65 = 0; var65 < 10; var65++) {
							var64.field316[var65] -= var58;
							var64.field317[var65] -= var59;
						}

						var64.field268 -= var58 * 128;
						var64.field269 -= var59 * 128;
					}
				}

				byte var66 = 0;
				byte var67 = 104;
				byte var68 = 1;
				if (var58 < 0) {
					var66 = 103;
					var67 = -1;
					var68 = -1;
				}

				byte var69 = 0;
				byte var70 = 104;
				byte var71 = 1;
				if (var59 < 0) {
					var69 = 103;
					var70 = -1;
					var71 = -1;
				}

				for (int var72 = var66; var72 != var67; var72 += var68) {
					for (int var73 = var69; var73 != var70; var73 += var71) {
						int var74 = var58 + var72;
						int var75 = var59 + var73;
						for (int var76 = 0; var76 < 4; var76++) {
							if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
								field1178[var76][var72][var73] = field1178[var76][var74][var75];
							} else {
								field1178[var76][var72][var73] = null;
							}
						}
					}
				}

				for (class38 var77 = (class38) field1022.method228(); var77 != null; var77 = (class38) field1022.method230()) {
					var77.field553 -= var58;
					var77.field554 -= var59;
					if (var77.field553 < 0 || var77.field554 < 0 || var77.field553 >= 104 || var77.field554 >= 104) {
						var77.method107();
					}
				}

				if (field968 != 0) {
					field968 -= var58;
					field969 -= var59;
				}

				field1163 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 123) {
				field975 = true;
				int var78 = field999.method211();
				class60 var79 = class60.field829[var78];
				int var80 = field999.method209();
				for (int var81 = 0; var81 < var80; var81++) {
					var79.field830[var81] = field999.method211();
					int var82 = field999.method209();
					if (var82 == 255) {
						var82 = field999.method214();
					}

					var79.field831[var81] = var82;
				}

				for (int var83 = var80; var83 < var79.field830.length; var83++) {
					var79.field830[var83] = 0;
					var79.field831[var83] = 0;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 55) {
				for (int var84 = 0; var84 < field1198.length; var84++) {
					if (field1198[var84] != null) {
						field1198[var84].field295 = -1;
					}
				}

				for (int var85 = 0; var85 < field1173.length; var85++) {
					if (field1173[var85] != null) {
						field1173[var85].field295 = -1;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 66) {
				int var86 = field999.method209();
				int var87 = field999.method209();
				int var88 = field999.method211();
				int var89 = field999.method211();
				int var90 = -1;
				for (int var91 = 0; var91 < field1186.length; var91++) {
					if ((var86 << 8) + var87 == field1186[var91]) {
						var90 = var91;
					}
				}

				if (var90 != -1) {
					if (field996[var90] == null || field996[var90].length != var89) {
						field996[var90] = new byte[var89];
					}

					field999.method218(field1037 - 6, field996[var90], var88);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 212) {
				int var92 = field999.method211();
				int var93 = field999.method211();
				int var94 = var93 >> 10 & 0x1F;
				int var95 = var93 >> 5 & 0x1F;
				int var96 = var93 & 0x1F;
				class60.field829[var92].field870 = (var96 << 3) + (var94 << 19) + (var95 << 11);
				field1038 = -1;
				return true;
			}

			if (field1038 == 33) {
				int var97 = field999.method211();
				int var98 = field999.method211();
				int var99 = field999.method211();
				class55 var100 = class55.method287(var98);
				class60.field829[var97].field875 = var100.method291(50);
				class60.field829[var97].field880 = var100.field775;
				class60.field829[var97].field881 = var100.field776;
				class60.field829[var97].field879 = var100.field774 * 100 / var99;
				field1038 = -1;
				return true;
			}

			if (field1038 == 60) {
				int var101 = field999.method209();
				int var102 = field999.method209();
				int var103 = -1;
				for (int var104 = 0; var104 < field1186.length; var104++) {
					if ((var101 << 8) + var102 == field1186[var104]) {
						var103 = var104;
					}
				}

				if (var103 != -1) {
					signlink.cachesave("l" + var101 + "_" + var102, field1204[var103]);
					field1140 = 1;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 169) {
				int var105 = field999.method211();
				class60.field829[var105].field875 = field1312.method115();
				field1038 = -1;
				return true;
			}

			if (field1038 == 100) {
				int var106 = field999.method211();
				int var107 = field999.method209();

				if (var106 == 0xFFFF) {
					var106 = -1;
				}

				field992[var107] = var106;
				field975 = true;
				field1146 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 191) {
				int var108 = field999.method211();
				int var109 = field999.method212();
				int var110 = field999.method212();
				class60 var111 = class60.field829[var108];
				var111.field841 = var109;
				var111.field842 = var110;
				field1038 = -1;
				return true;
			}

			if (field1038 == 68) {
				class5.method34();
				field1038 = -1;
				return true;
			}

			if (field1038 == 248) {
				int var112 = field999.method211();
				int var113 = field999.method211();
				class60.field829[var112].field875 = new class31(var113);
				field1038 = -1;
				return true;
			}

			if (field1038 == 240) {
				field1163 = true;
				field1280 = field999.method209();
				field1281 = field999.method209();
				field1282 = field999.method211();
				field1283 = field999.method209();
				field1284 = field999.method209();
				if (field1284 >= 100) {
					int var114 = field1280 * 128 + 64;
					int var115 = field1281 * 128 + 64;
					int var116 = method449(field1189, field1281, field1280) - field1282;
					int var117 = var114 - field1010;
					int var118 = var116 - field1011;
					int var119 = var115 - field1012;
					int var120 = (int) Math.sqrt(var117 * var117 + var119 * var119);
					field1013 = (int) (Math.atan2(var118, var120) * 325.949D) & 0x7FF;
					field1014 = (int) (Math.atan2(var117, var119) * -325.949D) & 0x7FF;

					if (field1013 < 128) {
						field1013 = 128;
					}

					if (field1013 > 383) {
						field1013 = 383;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 94) {
				field975 = true;
				int var121 = field999.method209();
				int var122 = field999.method214();
				int var123 = field999.method209();
				field1276[var121] = var122;
				field1018[var121] = var123;
				field1227[var121] = 1;
				for (int var124 = 0; var124 < 98; var124++) {
					if (var122 >= field1143[var124]) {
						field1227[var121] = var124 + 2;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 171) {
				field1142 = field999.method214();
				field1052 = field999.method211();
				field1127 = field999.method209();
				field1220 = field999.method211();

				if (field1142 != 0 && field1016 == -1) {
					signlink.dnslookup(class48.method254(field1142));
					method378();
					short var125 = 650;
					if (field1127 != 201) {
						var125 = 655;
					}

					field967 = "";
					field1243 = false;

					for (int var126 = 0; var126 < class60.field829.length; var126++) {
						if (class60.field829[var126] != null && class60.field829[var126].field838 == var125) {
							field1016 = class60.field829[var126].field835;
							break;
						}
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 250) {
				field1128 = field999.method209();
				field1129 = field999.method209();
				field1038 = -1;
				return true;
			}

			if (field1038 == 192) {
				field1128 = field999.method209();
				field1129 = field999.method209();

				while (field999.field540 < field1037) {
					int var127 = field999.method209();
					method387(var127, field999);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 71) {
				int var128 = field999.method209();
				int var129 = field999.method209();
				int var130 = field999.method209();
				int var131 = field999.method209();
				field1057[var128] = true;
				field1317[var128] = var129;
				field1226[var128] = var130;
				field1145[var128] = var131;
				field1138[var128] = 0;
				field1038 = -1;
				return true;
			}

			if (field1038 == 235) {
				int var132 = field999.method211();
				int var133 = field999.method214();
				field1211[var132] = var133;

				if (field1147[var132] != var133) {
					field1147[var132] = var133;
					method457(var132);
					field975 = true;

					if (field989 != -1) {
						field1044 = true;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 12) {
				int var134 = field999.method209();
				int var135 = field999.method209();
				int var136 = -1;
				for (int var137 = 0; var137 < field1186.length; var137++) {
					if ((var134 << 8) + var135 == field1186[var137]) {
						var136 = var137;
					}
				}

				if (var136 != -1) {
					signlink.cachesave("m" + var134 + "_" + var135, field996[var136]);
					field1140 = 1;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 140) {
				long var138 = field999.method215();
				int var140 = field999.method209();
				String var141 = class48.method255(class48.method252(var138));
				for (int var142 = 0; var142 < field1109; var142++) {
					if (field1101[var142] == var138) {
						if (field1176[var142] != var140) {
							field1176[var142] = var140;
							field975 = true;

							if (var140 > 0) {
								method380(5, "", var141 + " has logged in.");
							}

							if (var140 == 0) {
								method380(5, "", var141 + " has logged out.");
							}
						}

						var141 = null;
						break;
					}
				}

				if (var141 != null && field1109 < 100) {
					field1101[field1109] = var138;
					field1184[field1109] = var141;
					field1176[field1109] = var140;
					field1109++;
					field975 = true;
				}

				boolean var143 = false;
				while (!var143) {
					var143 = true;
					for (int var144 = 0; var144 < field1109 - 1; var144++) {
						if (field1176[var144] != field1180 && field1176[var144 + 1] == field1180 || field1176[var144] == 0 && field1176[var144 + 1] != 0) {
							int var145 = field1176[var144];
							field1176[var144] = field1176[var144 + 1];
							field1176[var144 + 1] = var145;
							String var146 = field1184[var144];
							field1184[var144] = field1184[var144 + 1];
							field1184[var144 + 1] = var146;
							long var147 = field1101[var144];
							field1101[var144] = field1101[var144 + 1];
							field1101[var144 + 1] = var147;
							field975 = true;
							var143 = false;
						}
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 49) {
				method466(field1037, field999);

				if (field1140 == 1) {
					field1140 = 2;
					class3.field26 = field1189;
					method402();
				}

				if (field1183 && field1140 == 2 && class3.field26 != field1189) {
					field1081.method235();
					field1113.method188("Loading - please wait.", 151, 257, 0);
					field1113.method188("Loading - please wait.", 150, 256, 0xFFFFFF);
					field1081.method236(8, 11, field8);
					class3.field26 = field1189;
					method402();
				}

				if (field1325 != field1189 && field1140 == 2) {
					field1325 = field1189;
					method410(field1189);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 35) {
				int var149 = field999.method209();
				int var150 = field999.method209();
				int var151 = field999.method211();
				int var152 = field999.method211();
				int var153 = -1;
				for (int var154 = 0; var154 < field1186.length; var154++) {
					if ((var149 << 8) + var150 == field1186[var154]) {
						var153 = var154;
					}
				}

				if (var153 != -1) {
					if (field1204[var153] == null || field1204[var153].length != var152) {
						field1204[var153] = new byte[var152];
					}

					field999.method218(field1037 - 6, field1204[var153], var151);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 113) {
				field1164 = field1037 / 8;
				for (int var155 = 0; var155 < field1164; var155++) {
					field1050[var155] = field999.method215();
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 72) {
				field1102 = field999.method209();
				field1038 = -1;
				return true;
			}

			if (field1038 == 47) {
				field1163 = false;

				for (int var156 = 0; var156 < 5; var156++) {
					field1057[var156] = false;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 128) {
				method390(field999, field1037);
				field1038 = -1;
				return true;
			}

			if (field1038 == 85) {
				field1278 = field999.method209();
				field975 = true;
				field1146 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 107) {
				if (field1278 == 12) {
					field975 = true;
				}

				field1187 = field999.method209();
				field1038 = -1;
				return true;
			}

			if (field1038 == 202) {
				int var157 = field999.method211();
				int var158 = field999.method209();
				int var159 = field999.method211();
				if (field1031 && !field1183 && field1119 < 50) {
					field1216[field1119] = var157;
					field1071[field1119] = var158;
					field988[field1119] = class51.field664[var157] + var159;
					field1119++;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 216) {
				for (int var160 = 0; var160 < field1147.length; var160++) {
					if (field1211[var160] != field1147[var160]) {
						field1147[var160] = field1211[var160];
						method457(var160);
						field975 = true;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 92) {
				String var161 = field999.method216();
				int var162 = field999.method214();
				int var163 = field999.method214();
				if (!var161.equals(field1205) && field1008 && !field1183) {
					method425(var163, var161, var162);
				}

				field1205 = var161;
				field1172 = var162;
				field991 = var163;
				field1017 = 0;
				field1038 = -1;
				return true;
			}

			if (field1038 == 254) {
				field1023 = false;
				field953 = true;
				field1048 = "";
				field1044 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 253) {
				int var164 = field999.method211();
				int var165 = field999.method211();
				int var166 = field999.method211();
				class60 var167 = class60.field829[var164];
				class31 var168 = var167.field875;
				if (var168 != null) {
					var168.method133(var165, var166);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 57) {
				if (field1278 == 12) {
					field975 = true;
				}

				field1171 = field999.method212();
				field1038 = -1;
				return true;
			}

			if (field1038 == 230) {
				if (field1008 && !field1183) {
					int var169 = field999.method211();
					int var170 = field999.method214();
					int var171 = field1037 - 6;
					byte[] var172 = new byte[var170];
					class44.method238(var172, var170, field999.field539, var171, field999.field540);
					method460(false, var172, var170);
					field1017 = var169;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 242) {
				field1070 = field999.method211() * 30;
				field1038 = -1;
				return true;
			}

			if (field1038 == 39) {
				method379();
				field1038 = -1;
				return false;
			}

			if (field1038 == 186) {
				int var173 = field999.method211();
				class60 var174 = class60.field829[var173];
				for (int var175 = 0; var175 < var174.field830.length; var175++) {
					var174.field830[var175] = -1;
					var174.field830[var175] = 0;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 177) {
				field976 = field999.method211();
				field1038 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1038 + "," + field1037 + " - " + field1286 + "," + field1287);
			method379();
		} catch (IOException var180) {
			method394();
		} catch (Exception var181) {
			String var177 = "T2 - " + field1038 + "," + field1286 + "," + field1287 + " - " + field1037 + "," + (field1312.field316[0] + field1321) + "," + (field1312.field317[0] + field1322) + " - ";
			for (int var178 = 0; var178 < field1037 && var178 < 50; var178++) {
				var177 = var177 + field999.field539[var178] + ",";
			}

			signlink.reporterror(var177);
			method379();
		}

		return true;
	}

	@ObfuscatedName("client.a(BLkb;I)V")
	public final void method409(class37 arg0, int arg1) {
		arg0.method219();
		int var3 = arg0.method220(8);
		if (var3 < field1174) {
			for (int var4 = var3; var4 < field1174; var4++) {
				field1300[field1299++] = field1175[var4];
			}
		}

		if (var3 > field1174) {
			signlink.reporterror(field1002 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1174 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1175[var5];
			class25 var7 = field1173[var6];
			int var8 = arg0.method220(1);
			if (var8 == 0) {
				field1175[field1174++] = var6;
				var7.field312 = field1209;
			} else {
				int var9 = arg0.method220(2);
				if (var9 == 0) {
					field1175[field1174++] = var6;
					var7.field312 = field1209;
					field1202[field1201++] = var6;
				} else if (var9 == 1) {
					field1175[field1174++] = var6;
					var7.field312 = field1209;
					int var10 = arg0.method220(3);
					var7.method110(false, var10);
					int var11 = arg0.method220(1);
					if (var11 == 1) {
						field1202[field1201++] = var6;
					}
				} else if (var9 == 2) {
					field1175[field1174++] = var6;
					var7.field312 = field1209;
					int var12 = arg0.method220(3);
					var7.method110(true, var12);
					int var13 = arg0.method220(3);
					var7.method110(true, var13);
					int var14 = arg0.method220(1);
					if (var14 == 1) {
						field1202[field1201++] = var6;
					}
				} else if (var9 == 3) {
					field1300[field1299++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method410(int arg0) {
		int[] var2 = field970.field515;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field998[arg0][var7][var5] & 0x18) == 0) {
					field1298.method86(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field998[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1298.method86(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field970.method170();

		for (int var8 = 1; var8 < 103; var8++) {
			for (int var9 = 1; var9 < 103; var9++) {
				if ((field998[arg0][var9][var8] & 0x18) == 0) {
					method411(arg0, var8, var9);
				}

				if (arg0 < 3 && (field998[arg0 + 1][var9][var8] & 0x8) != 0) {
					method411(arg0 + 1, var8, var9);
				}
			}
		}

		field1081.method235();
		field1326 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = field1298.method80(field1189, var10, var11);
				if (var12 != 0) {
					var12 = var12 >> 14 & 0x7FFF;
					int var13 = class53.method275(var12).field720;
					if (var13 >= 0) {
						field971[field1326] = field1154[var13];
						field1327[field1326] = var10;
						field1328[field1326] = var11;
						field1326++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method411(int arg0, int arg1, int arg2) {
		int var4 = field1298.method77(arg0, arg2, arg1);
		if (var4 != 0) {
			int var5 = field1298.method81(arg0, arg2, arg1, var4);
			int var6 = var5 >> 6 & 0x3;
			int var7 = var5 & 0x1F;
			int var8 = 0xEEEEEE;
			if (var4 > 0) {
				var8 = 0xEE0000;
			}

			int[] var9 = field970.field515;
			int var10 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
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
				class35 var13 = field1177[var12.field721];
				if (var13 != null) {
					int var14 = (var12.field706 * 4 - var13.field524) / 2;
					int var15 = (var12.field707 * 4 - var13.field525) / 2;
					var13.method186(arg2 * 4 + var14 + 48, (104 - arg1 - var12.field707) * 4 + 48 + var15);
				}
			}
		}

		int var16 = field1298.method79(arg0, arg2, arg1);
		if (var16 != 0) {
			int var17 = field1298.method81(arg0, arg2, arg1, var16);
			int var18 = var17 >> 6 & 0x3;
			int var19 = var17 & 0x1F;
			int var20 = var16 >> 14 & 0x7FFF;
			class53 var21 = class53.method275(var20);
			if (var21.field721 != -1) {
				class35 var22 = field1177[var21.field721];
				if (var22 != null) {
					int var23 = (var21.field706 * 4 - var22.field524) / 2;
					int var24 = (var21.field707 * 4 - var22.field525) / 2;
					var22.method186(arg2 * 4 + var23 + 48, (104 - arg1 - var21.field707) * 4 + 48 + var24);
				}
			} else if (var19 == 9) {
				int var25 = 0xEEEEEE;
				if (var16 > 0) {
					var25 = 0xEE0000;
				}

				int[] var26 = field970.field515;
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

		int var28 = field1298.method80(arg0, arg2, arg1);
		if (var28 != 0) {
			int var29 = var28 >> 14 & 0x7FFF;
			class53 var30 = class53.method275(var29);
			if (var30.field721 != -1) {
				class35 var31 = field1177[var30.field721];
				if (var31 != null) {
					int var32 = (var30.field706 * 4 - var31.field524) / 2;
					int var33 = (var30.field707 * 4 - var31.field525) / 2;
					var31.method186(arg2 * 4 + var32 + 48, (104 - arg1 - var30.field707) * 4 + 48 + var33);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method412() {
		for (int var1 = 0; var1 < field1174; var1++) {
			class25 var2 = field1173[field1175[var1]];
			int var3 = (field1175[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method111()) {
				int var4 = var2.field268 >> 7;
				int var5 = var2.field269 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field272 == 1 && (var2.field268 & 0x7F) == 0x40 && (var2.field269 & 0x7F) == 0x40) {
						if (field1118[var4][var5] == field1225) {
							continue;
						}

						field1118[var4][var5] = field1225;
					}

					field1298.method61(var2.field269, (var2.field272 - 1) * 64 + 60, method449(field1189, var2.field269, var2.field268), null, var2.field270, var2.field271, var3, var2.field268, var2, field1189);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;Lz;III)V")
	public final void method413(class37 arg0, class26 arg1, int arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg0.method209();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg0.method218(var5, var6, 0);
			field1203[arg2] = var7;
			arg1.method113(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg0.method211();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg1.field295 == var8) {
				arg1.field299 = 0;
			}

			int var9 = arg0.method209();
			if (var8 == -1 || arg1.field295 == -1 || class62.field895[var8].field903 > class62.field895[arg1.field295].field903 || class62.field895[arg1.field295].field903 == 0) {
				arg1.field295 = var8;
				arg1.field296 = 0;
				arg1.field297 = 0;
				arg1.field298 = var9;
				arg1.field299 = 0;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg1.field289 = arg0.method211();
			if (arg1.field289 == 0xFFFF) {
				arg1.field289 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg1.field280 = arg0.method216();
			arg1.field282 = 0;
			arg1.field283 = 0;
			arg1.field281 = 150;
			method380(2, arg1.field321, arg1.field280);
		}

		if ((arg3 & 0x10) == 0x10) {
			arg1.field284 = arg0.method209();
			arg1.field285 = arg0.method209();
			arg1.field286 = field1209 + 400;
			arg1.field287 = arg0.method209();
			arg1.field288 = arg0.method209();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg1.field290 = arg0.method211();
			arg1.field291 = arg0.method211();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var10 = arg0.method211();
			int var11 = arg0.method209();
			int var12 = arg0.method209();
			int var13 = arg0.field540;

			if (arg1.field321 != null) {
				long var14 = class48.method251(arg1.field321);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field1164; var17++) {
						if (field1050[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field1020 == 0) {
					try {
						String var18 = class49.method258(var12, arg0);
						var18 = class65.method335(var18);
						arg1.field280 = var18;
						arg1.field282 = var10 >> 8;
						arg1.field283 = var10 & 0xFF;
						arg1.field281 = 150;

						if (var11 > 1) {
							method380(1, arg1.field321, var18);
						} else {
							method380(2, arg1.field321, var18);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field540 = var12 + var13;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg1.field300 = arg0.method211();
			int var20 = arg0.method214();
			arg1.field304 = var20 >> 16;
			arg1.field303 = (var20 & 0xFFFF) + field1209;
			arg1.field301 = 0;
			arg1.field302 = 0;

			if (arg1.field303 > field1209) {
				arg1.field301 = -1;
			}

			if (arg1.field300 == 0xFFFF) {
				arg1.field300 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg1.field305 = arg0.method209();
			arg1.field307 = arg0.method209();
			arg1.field306 = arg0.method209();
			arg1.field308 = arg0.method209();
			arg1.field309 = arg0.method211() + field1209;
			arg1.field310 = arg0.method211() + field1209;
			arg1.field311 = arg0.method209();
			arg1.field315 = 0;
			arg1.field316[0] = arg1.field306;
			arg1.field317[0] = arg1.field308;
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public final String method414(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method13(int arg0, String arg1) {
		method444();

		if (field1309 == null) {
			super.method13(arg0, arg1);
		} else {
			field1246.method235();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1114.method188("RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			class32.method150(var6, 34, 0x8C1111, 304, var3 / 2 - 152);
			class32.method150(var6 + 1, 32, 0, 302, var3 / 2 - 151);
			class32.method149(arg0 * 3, 30, 0x8C1111, var6 + 2, var3 / 2 - 150);
			class32.method149(300 - arg0 * 3, 30, 0, var6 + 2, arg0 * 3 + (var3 / 2 - 150));
			field1114.method188(arg1, var4 / 2 + 5 - var5, var3 / 2, 0xFFFFFF);
			field1246.method236(214, 186, field8);

			if (field1335) {
				field1335 = false;

				if (!field1136) {
					field1247.method236(0, 0, field8);
					field1248.method236(661, 0, field8);
				}

				field1244.method236(128, 0, field8);
				field1245.method236(214, 386, field8);
				field1249.method236(0, 265, field8);
				field1250.method236(574, 265, field8);
				field1251.method236(128, 186, field8);
				field1252.method236(574, 186, field8);
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method415() {
		class53.field732.method104();
		class53.field733.method104();
		class54.field761.method104();
		class55.field800.method104();
		class55.field801.method104();
		class26.field341.method104();
		class63.field920.method104();
	}

	@ObfuscatedName("client.w(I)V")
	public final void method416() {
		if (field1082 == null) {
			method393();
			field9 = null;
			field1244 = null;
			field1245 = null;
			field1246 = null;
			field1247 = null;
			field1248 = null;
			field1249 = null;
			field1250 = null;
			field1251 = null;
			field1252 = null;
			field1082 = new class43(479, 96, method11());
			field1080 = new class43(168, 160, method11());
			class32.method148();
			field986.method186(0, 0);
			field1079 = new class43(190, 261, method11());
			field1081 = new class43(512, 334, method11());
			class32.method148();
			field1098 = new class43(501, 61, method11());
			field1099 = new class43(288, 40, method11());
			field1100 = new class43(269, 66, method11());
			field1335 = true;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method417() {
		for (int var1 = 0; var1 < field1174; var1++) {
			int var2 = field1175[var1];
			class25 var3 = field1173[var2];
			if (var3 != null) {
				method418(var3.field320.field742, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILx;B)V")
	public final void method418(int arg0, class24 arg1) {
		if (arg1.field268 < 128 || arg1.field269 < 128 || arg1.field268 >= 13184 || arg1.field269 >= 13184) {
			arg1.field295 = -1;
			arg1.field300 = -1;
			arg1.field309 = 0;
			arg1.field310 = 0;
			arg1.field268 = arg1.field316[0] * 128 + arg1.field272 * 64;
			arg1.field269 = arg1.field317[0] * 128 + arg1.field272 * 64;
			arg1.field315 = 0;
		}

		if (field1312 == arg1 && (arg1.field268 < 1536 || arg1.field269 < 1536 || arg1.field268 >= 11776 || arg1.field269 >= 11776)) {
			arg1.field295 = -1;
			arg1.field300 = -1;
			arg1.field309 = 0;
			arg1.field310 = 0;
			arg1.field268 = arg1.field316[0] * 128 + arg1.field272 * 64;
			arg1.field269 = arg1.field317[0] * 128 + arg1.field272 * 64;
			arg1.field315 = 0;
		}

		if (arg1.field309 > field1209) {
			method419(arg1);
		} else if (arg1.field310 >= field1209) {
			method420(arg1);
		} else {
			method421(arg1);
		}

		method422(arg1);
		method423(arg1);
	}

	@ObfuscatedName("client.a(ZLx;)V")
	public final void method419(class24 arg0) {
		int var2 = arg0.field309 - field1209;
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
	public final void method420(class24 arg0) {
		if (field1209 == arg0.field310 || arg0.field295 == -1 || arg0.field298 != 0 || arg0.field297 + 1 > class62.field895[arg0.field295].field899[arg0.field296]) {
			int var2 = arg0.field310 - arg0.field309;
			int var3 = field1209 - arg0.field309;
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

	@ObfuscatedName("client.a(Lx;B)V")
	public final void method421(class24 arg0) {
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

	@ObfuscatedName("client.a(Lx;I)V")
	public final void method422(class24 arg0) {
		if (arg0.field289 != -1 && arg0.field289 < 32768) {
			class25 var2 = field1173[arg0.field289];
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
			if (field976 == var5) {
				var5 = field1197;
			}

			class26 var6 = field1198[var5];
			if (var6 != null) {
				int var7 = arg0.field268 - var6.field268;
				int var8 = arg0.field269 - var6.field269;
				if (var7 != 0 || var8 != 0) {
					arg0.field314 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field290 != 0 || arg0.field291 != 0) && (arg0.field315 == 0 || arg0.field319 > 0)) {
			int var9 = arg0.field268 - (arg0.field290 - field1321 - field1321) * 64;
			int var10 = arg0.field269 - (arg0.field291 - field1322 - field1322) * 64;
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

	@ObfuscatedName("client.b(ZLx;)V")
	public final void method423(class24 arg0) {
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

		if (arg0.field300 != -1 && field1209 >= arg0.field303) {
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

	@ObfuscatedName("client.x(I)V")
	public final void method424() {
		if (field1335) {
			field1335 = false;
			field1087.method236(0, 11, field8);
			field1088.method236(0, 375, field8);
			field1089.method236(729, 5, field8);
			field1090.method236(752, 231, field8);
			field1091.method236(0, 0, field8);
			field1092.method236(561, 0, field8);
			field1093.method236(520, 11, field8);
			field1094.method236(520, 231, field8);
			field1095.method236(501, 375, field8);
			field1096.method236(0, 345, field8);
			field975 = true;
			field1044 = true;
			field1146 = true;
			field983 = true;

			if (field1140 != 2) {
				field1081.method236(8, 11, field8);
				field1080.method236(561, 5, field8);
			}
		}

		if (field1140 == 2) {
			method375();
		}

		if (field1235 && field1058 == 1) {
			field975 = true;
		}

		if (field1238 != -1) {
			boolean var1 = method396(field1135, field1238);
			if (var1) {
				field975 = true;
			}
		}

		if (field1151 == 2) {
			field975 = true;
		}

		if (field1158 == 2) {
			field975 = true;
		}

		if (field975) {
			method392();
			field975 = false;
		}

		if (field1152 == -1) {
			field1076.field848 = field1239 - field1047 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method364(field1239, field15 - 22, field16 - 375, 463, false, 77, 0, field1076);
			}

			int var2 = field1239 - field1076.field848 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1239 - 77) {
				var2 = field1239 - 77;
			}

			if (field1047 != var2) {
				field1047 = var2;
				field1044 = true;
			}

			field965++;
			if (field965 > 87) {
				field965 = 0;
				field1301.method198(225);
			}
		}

		if (field1152 != -1) {
			boolean var3 = method396(field1135, field1152);
			if (var3) {
				field1044 = true;
			}
		}

		if (field1151 == 3) {
			field1044 = true;
		}

		if (field1158 == 3) {
			field1044 = true;
		}

		if (field1217 != null) {
			field1044 = true;
		}

		if (field1235 && field1058 == 2) {
			field1044 = true;
		}

		if (field1044) {
			method430();
			field1044 = false;
		}

		if (field1140 == 2) {
			method453();
			field1080.method236(561, 5, field8);
		}

		if (field1132 != -1) {
			field1146 = true;
		}

		if (field1146) {
			if (field1132 != -1 && field1278 == field1132) {
				field1132 = -1;
				field1301.method198(50);
				field1301.method199(field1278);
			}

			field1146 = false;
			field1100.method235();
			field1167.method186(0, 0);

			if (field1238 == -1) {
				if (field992[field1278] != -1) {
					if (field1278 == 0) {
						field1024.method186(29, 30);
					}

					if (field1278 == 1) {
						field1025.method186(59, 29);
					}

					if (field1278 == 2) {
						field1025.method186(87, 29);
					}

					if (field1278 == 3) {
						field1026.method186(115, 29);
					}

					if (field1278 == 4) {
						field1028.method186(156, 29);
					}

					if (field1278 == 5) {
						field1028.method186(184, 29);
					}

					if (field1278 == 6) {
						field1027.method186(212, 30);
					}
				}

				if (field992[0] != -1 && (field1132 != 0 || field1209 % 20 < 10)) {
					field1134[0].method186(35, 34);
				}

				if (field992[1] != -1 && (field1132 != 1 || field1209 % 20 < 10)) {
					field1134[1].method186(59, 32);
				}

				if (field992[2] != -1 && (field1132 != 2 || field1209 % 20 < 10)) {
					field1134[2].method186(86, 32);
				}

				if (field992[3] != -1 && (field1132 != 3 || field1209 % 20 < 10)) {
					field1134[3].method186(121, 33);
				}

				if (field992[4] != -1 && (field1132 != 4 || field1209 % 20 < 10)) {
					field1134[4].method186(157, 34);
				}

				if (field992[5] != -1 && (field1132 != 5 || field1209 % 20 < 10)) {
					field1134[5].method186(185, 32);
				}

				if (field992[6] != -1 && (field1132 != 6 || field1209 % 20 < 10)) {
					field1134[6].method186(212, 34);
				}
			}

			field1100.method236(520, 165, field8);
			field1099.method235();
			field1166.method186(0, 0);

			if (field1238 == -1) {
				if (field992[field1278] != -1) {
					if (field1278 == 7) {
						field1103.method186(49, 0);
					}

					if (field1278 == 8) {
						field1104.method186(81, 0);
					}

					if (field1278 == 9) {
						field1104.method186(108, 0);
					}

					if (field1278 == 10) {
						field1105.method186(136, 1);
					}

					if (field1278 == 11) {
						field1107.method186(178, 0);
					}

					if (field1278 == 12) {
						field1107.method186(205, 0);
					}

					if (field1278 == 13) {
						field1106.method186(233, 0);
					}
				}

				if (field992[8] != -1 && (field1132 != 8 || field1209 % 20 < 10)) {
					field1134[7].method186(80, 2);
				}

				if (field992[9] != -1 && (field1132 != 9 || field1209 % 20 < 10)) {
					field1134[8].method186(107, 3);
				}

				if (field992[10] != -1 && (field1132 != 10 || field1209 % 20 < 10)) {
					field1134[9].method186(142, 4);
				}

				if (field992[11] != -1 && (field1132 != 11 || field1209 % 20 < 10)) {
					field1134[10].method186(179, 2);
				}

				if (field992[12] != -1 && (field1132 != 12 || field1209 % 20 < 10)) {
					field1134[11].method186(206, 2);
				}

				if (field992[13] != -1 && (field1132 != 13 || field1209 % 20 < 10)) {
					field1134[12].method186(230, 2);
				}
			}

			field1099.method236(501, 492, field8);
			field1081.method235();
		}

		if (field983) {
			field983 = false;
			field1098.method235();
			field1165.method186(0, 0);
			field1113.method189("Public chat", 0xFFFFFF, 57, 33, true);

			if (field1318 == 0) {
				field1113.method189("On", 0xFF00, 57, 46, true);
			}

			if (field1318 == 1) {
				field1113.method189("Friends", 0xFFFF00, 57, 46, true);
			}

			if (field1318 == 2) {
				field1113.method189("Off", 0xFF0000, 57, 46, true);
			}

			if (field1318 == 3) {
				field1113.method189("Hide", 0xFFFF, 57, 46, true);
			}

			field1113.method189("Private chat", 0xFFFFFF, 186, 33, true);

			if (field997 == 0) {
				field1113.method189("On", 0xFF00, 186, 46, true);
			}

			if (field997 == 1) {
				field1113.method189("Friends", 0xFFFF00, 186, 46, true);
			}

			if (field997 == 2) {
				field1113.method189("Off", 0xFF0000, 186, 46, true);
			}

			field1113.method189("Trade/duel", 0xFFFFFF, 326, 33, true);

			if (field990 == 0) {
				field1113.method189("On", 0xFF00, 326, 46, true);
			}

			if (field990 == 1) {
				field1113.method189("Friends", 0xFFFF00, 326, 46, true);
			}

			if (field990 == 2) {
				field1113.method189("Off", 0xFF0000, 326, 46, true);
			}

			field1113.method189("Report abuse", 0xFFFFFF, 462, 38, true);
			field1098.method236(0, 471, field8);
			field1081.method235();
		}

		field1135 = 0;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;II)V")
	public final void method425(int arg0, String arg1, int arg2) {
		if (arg1 != null) {
			synchronized (field1122) {
				field1221 = arg1;
				field1310 = arg2;
				field1302 = arg0;
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 218);

			if (arg0.length == 4) {
				field1180 = Integer.parseInt(arg0[0]);
				field1181 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method473();
				} else if (arg0[2].equals("highmem")) {
					method428();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					field1182 = false;
				} else if (arg0[3].equals("members")) {
					field1182 = true;
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

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://127.0.0.1:" + (field1181 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IZZ)V")
	public final void method426(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ILib;)V")
	public final void method427(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field963.length; var3++) {
			field963[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field963[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field964[var9] = (field963[var9 - 1] + field963[var9 + 1] + field963[var9 - 128] + field963[var9 + 128]) / 4;
				}
			}

			int[] var10 = field963;
			field963 = field964;
			field964 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field525; var12++) {
				for (int var13 = 0; var13 < arg0.field524; var13++) {
					if (arg0.field522[var11++] != 0) {
						int var14 = var13 + arg0.field526 + 16;
						int var15 = var12 + arg0.field527 + 16;
						int var16 = (var15 << 7) + var14;
						field963[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public static final void method428() {
		class18.field194 = false;
		class33.field492 = false;
		field1183 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method429() {
		for (int var1 = -1; var1 < field1199; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1197;
			} else {
				var2 = field1200[var1];
			}

			class26 var3 = field1198[var2];
			if (var3 != null) {
				method418(1, var3);
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method430() {
		field1082.method235();
		class33.field503 = field960;
		field987.method186(0, 0);

		if (field1023) {
			field1114.method188(field1260, 40, 239, 0);
			field1114.method188(field942 + "*", 60, 239, 128);
		} else if (field953) {
			field1114.method188("Enter amount to transfer:", 40, 239, 0);
			field1114.method188(field1048 + "*", 60, 239, 128);
		} else if (field1217 != null) {
			field1114.method188(field1217, 40, 239, 0);
			field1114.method188("Click to continue", 60, 239, 128);
		} else if (field1152 != -1) {
			method448(0, 0, 0, class60.field829[field1152]);
		} else if (field989 == -1) {
			class36 var1 = field1113;
			int var2 = 0;
			class32.method147(0, 463, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1232[var3] != null) {
					int var4 = field1230[var3];
					int var5 = field1047 + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0, 4, field1232[var3], var5);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0xFFFFFF, 4, field1231[var3] + ":", var5);
							var1.method191(255, var1.method190(field1231[var3]) + 12, field1232[var3], var5);
						}

						var2++;
					}

					if (var4 == 2 && (field1318 == 0 || field1318 == 1 && method370(field1231[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0, 4, field1231[var3] + ":", var5);
							var1.method191(255, var1.method190(field1231[var3]) + 12, field1232[var3], var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1005 == 0 && (var4 == 7 || field997 == 0 || field997 == 1 && method370(field1231[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0, 4, "From " + field1231[var3] + ":", var5);
							var1.method191(0x800000, var1.method190("From " + field1231[var3]) + 12, field1232[var3], var5);
						}

						var2++;
					}

					if (var4 == 4 && (field990 == 0 || field990 == 1 && method370(field1231[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0x800080, 4, field1231[var3] + " " + field1232[var3], var5);
						}

						var2++;
					}

					if (var4 == 5 && field1005 == 0 && field997 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0x800000, 4, field1232[var3], var5);
						}

						var2++;
					}

					if (var4 == 6 && field1005 == 0 && field997 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0, 4, "To " + field1231[var3] + ":", var5);
							var1.method191(0x800000, var1.method190("To " + field1231[var3]) + 12, field1232[var3], var5);
						}

						var2++;
					}

					if (var4 == 8 && (field990 == 0 || field990 == 1 && method370(field1231[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.method191(0xCBB789, 4, field1231[var3] + " " + field1232[var3], var5);
						}

						var2++;
					}
				}
			}

			class32.method146();
			field1239 = var2 * 14 + 7;
			if (field1239 < 78) {
				field1239 = 78;
			}

			method365(0, 463, 77, field1239, field1239 - field1047 - 77);
			var1.method191(0, 4, class48.method255(field1002) + ":", 90);
			var1.method191(255, var1.method190(field1002 + ": ") + 6, field1267 + "*", 90);
			class32.method151(77, 0, 0, 479);
		} else {
			method448(0, 0, 0, class60.field829[field989]);
		}

		if (field1235 && field1058 == 2) {
			method373();
		}

		field1082.method236(22, 375, field8);
		field1081.method235();
		class33.field503 = field962;
	}

	@ObfuscatedName("client.a(Lhc;B)Z")
	public final boolean method431(class60 arg0) {
		int var2 = arg0.field838;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			field1030[field1034] = "Remove @whi@" + field1184[var2];
			field1273[field1034] = 804;
			field1034++;
			field1030[field1034] = "Message @whi@" + field1184[var2];
			field1273[field1034] = 125;
			field1034++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			field1030[field1034] = "Remove @whi@" + arg0.field868;
			field1273[field1034] = 521;
			field1034++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IB)Z")
	public final boolean method432(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1273[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 447) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method433(int arg0) {
		if (!field1183) {
			if (class33.field511[17] >= arg0) {
				class35 var2 = class33.field505[17];
				int var3 = var2.field525 * var2.field524 - 1;
				int var4 = field1135 * var2.field524 * 2;
				byte[] var5 = var2.field522;
				byte[] var6 = field955;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field522 = var6;
				field955 = var5;
				class33.method160(17);
			}

			if (class33.field511[24] >= arg0) {
				class35 var8 = class33.field505[24];
				int var9 = var8.field525 * var8.field524 - 1;
				int var10 = field1135 * var8.field524 * 2;
				byte[] var11 = var8.field522;
				byte[] var12 = field955;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field522 = var12;
				field955 = var11;
				class33.method160(24);
				return;
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

	@ObfuscatedName("client.c(Lkb;II)V")
	public final void method434(class37 arg0, int arg1) {
		arg0.method219();
		int var3 = arg0.method220(1);
		if (var3 != 0) {
			int var4 = arg0.method220(2);
			if (var4 == 0) {
				field1202[field1201++] = field1197;
			} else if (var4 == 1) {
				int var5 = arg0.method220(3);
				field1312.method110(false, var5);
				int var6 = arg0.method220(1);
				if (var6 == 1) {
					field1202[field1201++] = field1197;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method220(3);
				field1312.method110(true, var7);
				int var8 = arg0.method220(3);
				field1312.method110(true, var8);
				int var9 = arg0.method220(1);
				if (var9 == 1) {
					field1202[field1201++] = field1197;
				}
			} else if (var4 == 3) {
				field1189 = arg0.method220(2);
				int var10 = arg0.method220(7);
				int var11 = arg0.method220(7);
				int var12 = arg0.method220(1);
				field1312.method109(var10, var11, var12 == 1);
				int var13 = arg0.method220(1);
				if (var13 == 1) {
					field1202[field1201++] = field1197;
				}
			}
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method435(int arg0, int arg1) {
		if (field1005 != 0) {
			int var3 = 0;
			if (field1070 != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (field1232[var4] != null) {
					int var5 = field1230[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || field997 == 0 || field997 == 1 && method370(field1231[var4]))) {
						int var6 = 329 - var3 * 13;
						if (field15 > 8 && field15 < 520 && arg0 - 11 > var6 - 10 && arg0 - 11 <= var6 + 3) {
							if (field973) {
								field1030[field1034] = "Report abuse @whi@" + field1231[var4];
								field1273[field1034] = 2316;
								field1034++;
							}

							field1030[field1034] = "Add ignore @whi@" + field1231[var4];
							field1273[field1034] = 2158;
							field1034++;
							field1030[field1034] = "Add friend @whi@" + field1231[var4];
							field1273[field1034] = 2447;
							field1034++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && field997 < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	public final void init() {
		field1180 = Integer.parseInt(getParameter("nodeid"));
		field1181 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method473();
		} else {
			method428();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1182 = false;
		} else {
			field1182 = true;
		}

		method2(532, 789);
	}

	@ObfuscatedName("client.d(II)V")
	public final void method436(int arg0) {
		if (arg0 >= 0) {
			if (field953) {
				field953 = false;
				field1044 = true;
			}

			int var2 = field1271[arg0];
			int var3 = field1272[arg0];
			int var4 = field1273[arg0];
			int var5 = field1274[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 988 || var4 == 345 || var4 == 249 || var4 == 960 || var4 == 40) {
				class25 var6 = field1173[var5];
				if (var6 != null) {
					method474(1, var6.field317[0], field1312.field317[0], 2, 0, field1312.field316[0], 0, var6.field316[0], false, 0, 1);
					field1083 = field18;
					field1084 = field19;
					field1086 = 2;
					field1085 = 0;

					if (var4 == 960) {
						field1301.method198(114);
					}

					if (var4 == 249) {
						field1301.method198(89);
					}

					if (var4 == 40) {
						field1301.method198(198);
					}

					if (var4 == 345) {
						field1162 += var5;
						if (field1162 >= 116) {
							field1301.method198(217);
						}

						field1301.method198(191);
					}

					if (var4 == 988) {
						field1301.method198(236);
					}

					field1301.method200(var5);
				}
			}

			if (var4 == 73 && !field1117) {
				field1301.method198(218);
				field1301.method200(var3);
				field1117 = true;
			}

			if (var4 == 316) {
				String var7 = field1030[arg0];
				int var8 = var7.indexOf("@whi@");
				if (var8 != -1) {
					method378();
					field967 = var7.substring(var8 + 5).trim();
					field1243 = false;

					for (int var9 = 0; var9 < class60.field829.length; var9++) {
						if (class60.field829[var9] != null && class60.field829[var9].field838 == 600) {
							field1049 = field1016 = class60.field829[var9].field835;
							break;
						}
					}
				}
			}

			if (var4 == 543) {
				boolean var10 = method474(0, var3, field1312.field317[0], 2, 0, field1312.field316[0], 0, var2, false, 0, 0);
				if (!var10) {
					method474(1, var3, field1312.field317[0], 2, 0, field1312.field316[0], 0, var2, false, 0, 1);
				}

				field1083 = field18;
				field1084 = field19;
				field1086 = 2;
				field1085 = 0;
				field1301.method198(241);
				field1301.method200(field1321 + var2);
				field1301.method200(field1322 + var3);
				field1301.method200(var5);
				field1301.method200(field1314);
			}

			if (var4 == 798) {
				field1320++;
				if (field1320 >= 135) {
					field1301.method198(253);
					field1301.method200(10151);
				}

				method445(207, var2, var3, var5);
			}

			if (var4 == 1308) {
				class55 var12 = class55.method287(var5);
				String var13;
				if (var12.field771 == null) {
					var13 = "It's a " + var12.field770 + ".";
				} else {
					var13 = new String(var12.field771);
				}

				method380(0, "", var13);
			}

			if (var4 == 357) {
				field1304 = 1;
				field1305 = var2;
				field1306 = var3;
				field1307 = var5;
				field1308 = class55.method287(var5).field770;
				field1313 = 0;
			} else {
				if (var4 == 309) {
					method378();
				}

				if (var4 == 1418) {
					int var14 = var5 >> 14 & 0x7FFF;
					class53 var15 = class53.method275(var14);
					String var16;
					if (var15.field703 == null) {
						var16 = "It's a " + var15.field702 + ".";
					} else {
						var16 = new String(var15.field703);
					}

					method380(0, "", var16);
				}

				if (var4 == 871 || var4 == 526 || var4 == 156 || var4 == 120 || var4 == 796) {
					if (var4 == 526) {
						field1301.method198(0);
					}

					if (var4 == 120) {
						field1301.method198(112);
					}

					if (var4 == 871) {
						field1195 += var5;
						if (field1195 >= 76) {
							field1301.method198(214);
							field1301.method199(171);
						}

						field1301.method198(140);
					}

					if (var4 == 156) {
						field1188++;
						if (field1188 >= 62) {
							field1301.method198(82);
							field1301.method199(142);
						}

						field1301.method198(155);
					}

					if (var4 == 796) {
						if ((var5 & 0x3) == 0) {
							field1097++;
						}

						if (field1097 >= 124) {
							field1301.method198(167);
							field1301.method203(0);
						}

						field1301.method198(122);
					}

					field1301.method200(var5);
					field1301.method200(var2);
					field1301.method200(var3);
					field1148 = 0;
					field1149 = var3;
					field1150 = var2;
					field1151 = 2;
					if (class60.field829[var3].field835 == field1016) {
						field1151 = 1;
					}

					if (class60.field829[var3].field835 == field1152) {
						field1151 = 3;
					}
				}

				if (var4 == 203) {
					boolean var17 = method474(0, var3, field1312.field317[0], 2, 0, field1312.field316[0], 0, var2, false, 0, 0);
					if (!var17) {
						method474(1, var3, field1312.field317[0], 2, 0, field1312.field316[0], 0, var2, false, 0, 1);
					}

					field1083 = field18;
					field1084 = field19;
					field1086 = 2;
					field1085 = 0;
					field1301.method198(183);
					field1301.method200(field1321 + var2);
					field1301.method200(field1322 + var3);
					field1301.method200(var5);
					field1301.method200(field1307);
					field1301.method200(field1305);
					field1301.method200(field1306);
				}

				if (var4 == 873) {
					method445(196, var2, var3, var5);
				}

				if (var4 == 48) {
					class26 var19 = field1198[var5];
					if (var19 != null) {
						method474(1, var19.field317[0], field1312.field317[0], 2, 0, field1312.field316[0], 0, var19.field316[0], false, 0, 1);
						field1083 = field18;
						field1084 = field19;
						field1086 = 2;
						field1085 = 0;
						field1301.method198(39);
						field1301.method200(var5);
						field1301.method200(field1314);
					}
				}

				if (var4 == 829) {
					field1033 += var3;
					if (field1033 >= 132) {
						field1301.method198(27);
						field1301.method200(17379);
					}

					method445(223, var2, var3, var5);
				}

				if (var4 == 737 && method445(9, var2, var3, var5)) {
					field1301.method200(field1314);
				}

				if (var4 == 672) {
					field1301.method198(222);
					field1301.method200(var3);
					class60 var20 = class60.field829[var3];
					if (var20.field843 != null && var20.field843[0][0] == 5) {
						int var21 = var20.field843[0][1];
						if (field1147[var21] != var20.field845[0]) {
							field1147[var21] = var20.field845[0];
							method457(var21);
							field975 = true;
						}
					}
				}

				if (var4 == 505 && method445(139, var2, var3, var5)) {
					field1301.method200(field1307);
					field1301.method200(field1305);
					field1301.method200(field1306);
				}

				if (var4 == 56 || var4 == 321 || var4 == 552 || var4 == 43 || var4 == 687) {
					boolean var22 = method474(0, var3, field1312.field317[0], 2, 0, field1312.field316[0], 0, var2, false, 0, 0);
					if (!var22) {
						method474(1, var3, field1312.field317[0], 2, 0, field1312.field316[0], 0, var2, false, 0, 1);
					}

					field1083 = field18;
					field1084 = field19;
					field1086 = 2;
					field1085 = 0;

					if (var4 == 687) {
						field966++;
						if (field966 >= 121) {
							field1301.method198(13);
							field1301.method199(128);
						}

						field1301.method198(192);
					}

					if (var4 == 43) {
						field1301.method198(143);
					}

					if (var4 == 321) {
						field1301.method198(48);
					}

					if (var4 == 56) {
						field1301.method198(91);
					}

					if (var4 == 552) {
						field1301.method198(226);
					}

					field1301.method200(field1321 + var2);
					field1301.method200(field1322 + var3);
					field1301.method200(var5);
				}

				if (var4 == 500) {
					class25 var24 = field1173[var5];
					if (var24 != null) {
						method474(1, var24.field317[0], field1312.field317[0], 2, 0, field1312.field316[0], 0, var24.field316[0], false, 0, 1);
						field1083 = field18;
						field1084 = field19;
						field1086 = 2;
						field1085 = 0;
						field1301.method198(244);
						field1301.method200(var5);
						field1301.method200(field1314);
					}
				}

				if (var4 == 706) {
					class60 var25 = class60.field829[var3];
					boolean var26 = true;
					if (var25.field838 > 0) {
						var26 = method407(var25);
					}

					if (var26) {
						field1301.method198(222);
						field1301.method200(var3);
					}
				}

				if (var4 == 981) {
					if (field1235) {
						field1298.method89(var3 - 11, var2 - 8);
					} else {
						field1298.method89(field19 - 11, field18 - 8);
					}
				}

				if (var4 == 595 || var4 == 835) {
					String var27 = field1030[arg0];
					int var28 = var27.indexOf("@whi@");
					if (var28 != -1) {
						var27 = var27.substring(var28 + 5).trim();
						String var29 = class48.method255(class48.method252(class48.method251(var27)));
						boolean var30 = false;
						for (int var31 = 0; var31 < field1199; var31++) {
							class26 var32 = field1198[field1200[var31]];
							if (var32 != null && var32.field321 != null && var32.field321.equalsIgnoreCase(var29)) {
								method474(1, var32.field317[0], field1312.field317[0], 2, 0, field1312.field316[0], 0, var32.field316[0], false, 0, 1);

								if (var4 == 595) {
									field1301.method198(245);
								}

								if (var4 == 835) {
									field1301.method198(173);
								}

								field1301.method200(field1200[var31]);
								var30 = true;
								break;
							}
						}

						if (!var30) {
							method380(0, "", "Unable to find " + var29);
						}
					}
				}

				if (var4 == 104) {
					method445(168, var2, var3, var5);
				}

				if (var4 == 125) {
					String var33 = field1030[arg0];
					int var34 = var33.indexOf("@whi@");
					if (var34 != -1) {
						long var35 = class48.method251(var33.substring(var34 + 5).trim());
						int var37 = -1;
						for (int var38 = 0; var38 < field1109; var38++) {
							if (field1101[var38] == var35) {
								var37 = var38;
								break;
							}
						}

						if (var37 != -1 && field1176[var37] > 0) {
							field1044 = true;
							field953 = false;
							field1023 = true;
							field942 = "";
							field1072 = 3;
							field1139 = field1101[var37];
							field1260 = "Enter message to send to " + field1184[var37];
						}
					}
				}

				if (var4 == 237) {
					field1301.method198(106);
					field1301.method200(var5);
					field1301.method200(var2);
					field1301.method200(var3);
					field1301.method200(field1307);
					field1301.method200(field1305);
					field1301.method200(field1306);
					field1148 = 0;
					field1149 = var3;
					field1150 = var2;
					field1151 = 2;
					if (class60.field829[var3].field835 == field1016) {
						field1151 = 1;
					}

					if (class60.field829[var3].field835 == field1152) {
						field1151 = 3;
					}
				}

				if (var4 == 103) {
					class26 var39 = field1198[var5];
					if (var39 != null) {
						method474(1, var39.field317[0], field1312.field317[0], 2, 0, field1312.field316[0], 0, var39.field316[0], false, 0, 1);
						field1083 = field18;
						field1084 = field19;
						field1086 = 2;
						field1085 = 0;
						field1301.method198(184);
						field1301.method200(var5);
						field1301.method200(field1307);
						field1301.method200(field1305);
						field1301.method200(field1306);
					}
				}

				if (var4 == 941) {
					class60 var40 = class60.field829[var3];
					field1313 = 1;
					field1314 = var3;
					field1315 = var40.field884;
					field1304 = 0;
					String var41 = var40.field882;
					if (var41.indexOf(" ") != -1) {
						var41 = var41.substring(0, var41.indexOf(" "));
					}

					String var42 = var40.field882;
					if (var42.indexOf(" ") != -1) {
						var42 = var42.substring(var42.indexOf(" ") + 1);
					}

					field1316 = var41 + " " + var40.field883 + " " + var42;

					if (field1315 == 16) {
						field975 = true;
						field1278 = 3;
						field1146 = true;
					}
				} else {
					if (var4 == 493) {
						class25 var43 = field1173[var5];
						if (var43 != null) {
							method474(1, var43.field317[0], field1312.field317[0], 2, 0, field1312.field316[0], 0, var43.field316[0], false, 0, 1);
							field1083 = field18;
							field1084 = field19;
							field1086 = 2;
							field1085 = 0;
							field1301.method198(36);
							field1301.method200(var5);
							field1301.method200(field1307);
							field1301.method200(field1305);
							field1301.method200(field1306);
						}
					}

					if (var4 == 1974) {
						class55 var44 = class55.method287(var5);
						String var45;
						if (var3 >= 100000) {
							var45 = var3 + " x " + var44.field770;
						} else if (var44.field771 == null) {
							var45 = "It's a " + var44.field770 + ".";
						} else {
							var45 = new String(var44.field771);
						}

						method380(0, "", var45);
					}

					if (var4 == 1814) {
						class25 var46 = field1173[var5];
						if (var46 != null) {
							String var47;
							if (var46.field320.field741 == null) {
								var47 = "It's a " + var46.field320.field740 + ".";
							} else {
								var47 = new String(var46.field320.field741);
							}

							method380(0, "", var47);
						}
					}

					if (var4 == 1659) {
						method445(181, var2, var3, var5);
					}

					if (var4 == 134 || var4 == 701 || var4 == 570 || var4 == 719 || var4 == 440) {
						if (var4 == 440) {
							field1301.method198(31);
						}

						if (var4 == 701) {
							field1301.method198(47);
						}

						if (var4 == 570) {
							field1301.method198(121);
						}

						if (var4 == 719) {
							field1301.method198(186);
						}

						if (var4 == 134) {
							field1301.method198(90);
						}

						field1301.method200(var5);
						field1301.method200(var2);
						field1301.method200(var3);
						field1148 = 0;
						field1149 = var3;
						field1150 = var2;
						field1151 = 2;
						if (class60.field829[var3].field835 == field1016) {
							field1151 = 1;
						}

						if (class60.field829[var3].field835 == field1152) {
							field1151 = 3;
						}
					}

					if (var4 == 1528 || var4 == 1741 || var4 == 593 || var4 == 1596) {
						class26 var48 = field1198[var5];
						if (var48 != null) {
							method474(1, var48.field317[0], field1312.field317[0], 2, 0, field1312.field316[0], 0, var48.field316[0], false, 0, 1);
							field1083 = field18;
							field1084 = field19;
							field1086 = 2;
							field1085 = 0;

							if (var4 == 1528) {
								field1301.method198(245);
							}

							if (var4 == 593) {
								field1301.method198(28);
							}

							if (var4 == 1596) {
								field1301.method198(173);
							}

							if (var4 == 1741) {
								if ((var5 & 0x3) == 0) {
									field1193++;
								}

								if (field1193 >= 139) {
									field1301.method198(84);
									field1301.method203(0);
								}

								field1301.method198(63);
							}

							field1301.method200(var5);
						}
					}

					if (var4 == 447 || var4 == 158 || var4 == 804 || var4 == 521) {
						String var49 = field1030[arg0];
						int var50 = var49.indexOf("@whi@");
						if (var50 != -1) {
							long var51 = class48.method251(var49.substring(var50 + 5).trim());
							if (var4 == 447) {
								method483(var51);
							}

							if (var4 == 158) {
								method454(var51);
							}

							if (var4 == 804) {
								method440(var51);
							}

							if (var4 == 521) {
								method389(var51);
							}
						}
					}

					if (var4 == 63) {
						field1301.method198(158);
						field1301.method200(var5);
						field1301.method200(var2);
						field1301.method200(var3);
						field1301.method200(field1314);
						field1148 = 0;
						field1149 = var3;
						field1150 = var2;
						field1151 = 2;
						if (class60.field829[var3].field835 == field1016) {
							field1151 = 1;
						}

						if (class60.field829[var3].field835 == field1152) {
							field1151 = 3;
						}
					}

					if (var4 == 967) {
						field1301.method198(222);
						field1301.method200(var3);
						class60 var53 = class60.field829[var3];
						if (var53.field843 != null && var53.field843[0][0] == 5) {
							int var54 = var53.field843[0][1];
							field1147[var54] = 1 - field1147[var54];
							method457(var54);
							field975 = true;
						}
					}

					field1304 = 0;
					field1313 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method437(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1232[var4] != null) {
				int var5 = field1230[var4];
				int var6 = field1047 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1318 == 0 || field1318 == 1 && method370(field1231[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !field1231[var4].equals(field1312.field321)) {
						if (field973) {
							field1030[field1034] = "Report abuse @whi@" + field1231[var4];
							field1273[field1034] = 316;
							field1034++;
						}

						field1030[field1034] = "Add ignore @whi@" + field1231[var4];
						field1273[field1034] = 158;
						field1034++;
						field1030[field1034] = "Add friend @whi@" + field1231[var4];
						field1273[field1034] = 447;
						field1034++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1005 == 0 && (var5 == 7 || field997 == 0 || field997 == 1 && method370(field1231[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field973) {
							field1030[field1034] = "Report abuse @whi@" + field1231[var4];
							field1273[field1034] = 316;
							field1034++;
						}

						field1030[field1034] = "Add ignore @whi@" + field1231[var4];
						field1273[field1034] = 158;
						field1034++;
						field1030[field1034] = "Add friend @whi@" + field1231[var4];
						field1273[field1034] = 447;
						field1034++;
					}

					var3++;
				}

				if (var5 == 4 && (field990 == 0 || field990 == 1 && method370(field1231[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1030[field1034] = "Accept trade @whi@" + field1231[var4];
						field1273[field1034] = 595;
						field1034++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1005 == 0 && field997 < 2) {
					var3++;
				}

				if (var5 == 8 && (field990 == 0 || field990 == 1 && method370(field1231[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1030[field1034] = "Accept duel @whi@" + field1231[var4];
						field1273[field1034] = 835;
						field1034++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method438(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method439() {
		if (field1158 == 0) {
			int var1 = field17;
			if (field1313 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field1235) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field1058 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field1058 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (field1058 == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < field1059 - 10 || var2 > field1061 + field1059 + 10 || var3 < field1060 - 10 || var3 > field1062 + field1060 + 10) {
						field1235 = false;

						if (field1058 == 1) {
							field975 = true;
						}

						if (field1058 == 2) {
							field1044 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1059;
					int var5 = field1060;
					int var6 = field1061;
					int var7 = field18;
					int var8 = field19;
					if (field1058 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field1058 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (field1058 == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1034; var10++) {
						int var11 = (field1034 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method436(var9);
					}

					field1235 = false;

					if (field1058 == 1) {
						field975 = true;
					}

					if (field1058 == 2) {
						field1044 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1034 > 0) {
					int var12 = field1273[field1034 - 1];
					if (var12 == 134 || var12 == 701 || var12 == 570 || var12 == 719 || var12 == 440 || var12 == 871 || var12 == 526 || var12 == 156 || var12 == 120 || var12 == 796 || var12 == 357) {
						int var13 = field1271[field1034 - 1];
						int var14 = field1272[field1034 - 1];
						class60 var15 = class60.field829[var14];
						if (var15.field855) {
							field1268 = false;
							field1120 = 0;
							field1156 = var14;
							field1157 = var13;
							field1158 = 2;
							field1159 = field18;
							field1160 = field19;

							if (class60.field829[var14].field835 == field1016) {
								field1158 = 1;
							}

							if (class60.field829[var14].field835 == field1152) {
								field1158 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1153 == 1 || method432(field1034 - 1)) && field1034 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1034 > 0) {
					method436(field1034 - 1);
				}

				if (var1 != 2 || field1034 <= 0) {
					return;
				}

				method458();
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method440(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1109; var3++) {
				if (field1101[var3] == arg0) {
					field1109--;
					field975 = true;

					for (int var4 = var3; var4 < field1109; var4++) {
						field1184[var4] = field1184[var4 + 1];
						field1176[var4] = field1176[var4 + 1];
						field1101[var4] = field1101[var4 + 1];
					}

					field1301.method198(210);
					field1301.method205(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method441() {
		short var1 = 256;

		if (field1130 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1130 > 768) {
					field1053[var2] = method438(1024 - field1130, field1055[var2], field1054[var2]);
				} else if (field1130 > 256) {
					field1053[var2] = field1055[var2];
				} else {
					field1053[var2] = method438(256 - field1130, field1054[var2], field1055[var2]);
				}
			}
		} else if (field1131 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1131 > 768) {
					field1053[var3] = method438(1024 - field1131, field1056[var3], field1054[var3]);
				} else if (field1131 > 256) {
					field1053[var3] = field1056[var3];
				} else {
					field1053[var3] = method438(256 - field1131, field1054[var3], field1056[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1053[var4] = field1054[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1247.field580[var5] = field1074.field515[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1051[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1269[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1053[var12];
					int var15 = field1247.field580[var7];
					field1247.field580[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1247.method236(0, 0, field8);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1248.field580[var16] = field1075.field515[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1051[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1269[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1053[var23];
					int var26 = field1248.field580[var18];
					field1248.field580[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1248.method236(661, 0, field8);
	}

	@ObfuscatedName("client.B(I)V")
	public final void method442() {
		method385();

		if (field1086 == 1) {
			field1234[field1085 / 100].method173(field1083 - 8 - 8, field1084 - 8 - 11);
		}

		if (field1086 == 2) {
			field1234[field1085 / 100 + 4].method173(field1083 - 8 - 8, field1084 - 8 - 11);
			field1218++;
			if (field1218 > 161) {
				field1218 = 0;
				field1301.method198(128);
				field1301.method200(9331);
			}
		}

		if (field1016 != -1) {
			method396(field1135, field1016);
			method448(0, 0, 0, class60.field829[field1016]);
		}

		method446();

		if (!field1235) {
			method443();
			method368();
		} else if (field1058 == 0) {
			method373();
		}

		if (field1102 == 1) {
			if (field1042 > 0 || field994 == 1) {
				field1006[1].method173(472, 258);
			} else {
				field1006[1].method173(472, 296);
			}
		}

		if (field1042 > 0) {
			field1006[0].method173(472, 296);
			field1113.method188("Level: " + field1042, 329, 484, 0xFFFF00);
		}

		if (field994 == 1) {
			field1006[6].method173(472, 296);
			field1113.method188("Arena", 329, 484, 0xFFFF00);
		}

		if (field1070 != 0) {
			int var1 = field1070 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1113.method191(0xFFFF00, 4, "System update in: " + var2 + ":0" + var1, 329);
			} else {
				field1113.method191(0xFFFF00, 4, "System update in: " + var2 + ":" + var1, 329);
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method443() {
		if (field1158 == 0) {
			field1030[0] = "Cancel";
			field1273[0] = 1333;
			field1034 = 1;
			method435(field16, field15);
			field1228 = 0;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field1016 == -1) {
					method471();
				} else {
					method377(0, class60.field829[field1016], field15, 8, field16, 11);
				}
			}

			if (field941 != field1228) {
				field941 = field1228;
			}

			field1228 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field1238 != -1) {
					method377(0, class60.field829[field1238], field15, 562, field16, 231);
				} else if (field992[field1278] != -1) {
					method377(0, class60.field829[field992[field1278]], field15, 562, field16, 231);
				}
			}

			if (field1228 != field1121) {
				field975 = true;
				field1121 = field1228;
			}

			field1228 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 431 && field16 < 471) {
				if (field1152 == -1) {
					method437(field16 - 375, field15 - 22);
				} else {
					method377(0, class60.field829[field1152], field15, 22, field16, 375);
				}
			}

			if (field1152 != -1 && field1240 != field1228) {
				field1044 = true;
				field1240 = field1228;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1034 - 1; var2++) {
					if (field1273[var2] < 1000 && field1273[var2 + 1] > 1000) {
						String var3 = field1030[var2];
						field1030[var2] = field1030[var2 + 1];
						field1030[var2 + 1] = var3;
						int var4 = field1273[var2];
						field1273[var2] = field1273[var2 + 1];
						field1273[var2 + 1] = var4;
						int var5 = field1271[var2];
						field1271[var2] = field1271[var2 + 1];
						field1271[var2 + 1] = var5;
						int var6 = field1272[var2];
						field1272[var2] = field1272[var2 + 1];
						field1272[var2 + 1] = var6;
						int var7 = field1274[var2];
						field1274[var2] = field1274[var2 + 1];
						field1274[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method444() {
		if (field1244 == null) {
			field9 = null;
			field1082 = null;
			field1080 = null;
			field1079 = null;
			field1081 = null;
			field1098 = null;
			field1099 = null;
			field1100 = null;
			field1247 = new class43(128, 265, method11());
			class32.method148();
			field1248 = new class43(128, 265, method11());
			class32.method148();
			field1244 = new class43(533, 186, method11());
			class32.method148();
			field1245 = new class43(360, 146, method11());
			class32.method148();
			field1246 = new class43(360, 200, method11());
			class32.method148();
			field1249 = new class43(214, 267, method11());
			class32.method148();
			field1250 = new class43(215, 267, method11());
			class32.method148();
			field1251 = new class43(86, 79, method11());
			class32.method148();
			field1252 = new class43(87, 79, method11());
			class32.method148();

			if (field1309 != null) {
				method447();
				method395();
			}

			field1335 = true;
		}
	}

	@ObfuscatedName("client.a(IZIII)Z")
	public final boolean method445(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field1298.method81(field1189, arg1, arg2, arg3);
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

			method474(var11, arg2, field1312.field317[0], 2, 0, field1312.field316[0], var12, arg1, false, 0, var10);
		} else {
			method474(0, arg2, field1312.field317[0], 2, var8, field1312.field316[0], 0, arg1, false, var7 + 1, 0);
		}

		field1083 = field18;
		field1084 = field19;
		field1086 = 2;
		field1085 = 0;
		field1301.method198(arg0);
		field1301.method200(field1321 + arg1);
		field1301.method200(field1322 + arg2);
		field1301.method200(var5);
		return true;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method446() {
		int var1 = (field1312.field268 >> 7) + field1321;
		int var2 = (field1312.field269 >> 7) + field1322;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1042 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1042 = (var2 - 9920) / 8 + 1;
		} else {
			field1042 = 0;
		}

		field994 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field994 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field994 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field994 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field994 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field994 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field994 = 1;
			}
		}

		if (field994 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field994 = 2;
		}

		field1020 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1020 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1020 = 1;
		}

		if (field1020 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1020 = 0;
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method447() {
		byte[] var1 = field1309.method250(null, "title.dat");
		class34 var2 = new class34(var1, this);
		field1247.method235();
		var2.method171(0, 0);
		field1248.method235();
		var2.method171(-661, 0);
		field1244.method235();
		var2.method171(-128, 0);
		field1245.method235();
		var2.method171(-214, -386);
		field1246.method235();
		var2.method171(-214, -186);
		field1249.method235();
		var2.method171(0, -265);
		field1250.method235();
		var2.method171(-574, -265);
		field1251.method235();
		var2.method171(-128, -186);
		field1252.method235();
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

		field1247.method235();
		var2.method171(394, 0);
		field1248.method235();
		var2.method171(-267, 0);
		field1244.method235();
		var2.method171(266, 0);
		field1245.method235();
		var2.method171(180, -386);
		field1246.method235();
		var2.method171(180, -186);
		field1249.method235();
		var2.method171(394, -265);
		field1250.method235();
		var2.method171(-180, -265);
		field1251.method235();
		var2.method171(212, -186);
		field1252.method235();
		var2.method171(-180, -186);
		class34 var7 = new class34(field1309, "logo", 0);
		field1244.method235();
		var7.method173(field6 / 2 - var7.field516 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IIIILhc;)V")
	public final void method448(int arg0, int arg1, int arg2, class60 arg3) {
		if (arg3.field836 == 0 && arg3.field850 != null && (!arg3.field849 || field941 == arg3.field834 || field1121 == arg3.field834 || field1240 == arg3.field834)) {
			int var5 = class32.field487;
			int var6 = class32.field485;
			int var7 = class32.field488;
			int var8 = class32.field486;
			class32.method147(arg2, arg3.field839 + arg1, arg3.field840 + arg2, arg1);
			int var9 = arg3.field850.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field851[var10] + arg1;
				int var12 = arg3.field852[var10] + arg2 - arg0;
				class60 var13 = class60.field829[arg3.field850[var10]];
				var11 += var13.field841;
				var12 += var13.field842;

				if (var13.field838 > 0) {
					method468(var13);
				}

				if (var13.field836 == 0) {
					if (var13.field848 > var13.field847 - var13.field840) {
						var13.field848 = var13.field847 - var13.field840;
					}

					if (var13.field848 < 0) {
						var13.field848 = 0;
					}

					method448(var13.field848, var11, var12, var13);

					if (var13.field847 > var13.field840) {
						method365(var12, var13.field839 + var11, var13.field840, var13.field847, var13.field848);
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
									class34 var22 = class55.method292(var21, var13.field831[var14]);
									if (field1158 != 0 && field1157 == var14 && field1156 == var13.field834) {
										var19 = field15 - field1159;
										var20 = field16 - field1160;

										if (var19 < 5 && var19 > -5) {
											var19 = 0;
										}

										if (var20 < 5 && var20 > -5) {
											var20 = 0;
										}

										if (field1120 < 5) {
											var19 = 0;
											var20 = 0;
										}

										var22.method177(var17 + var19, 128, var18 + var20);
									} else if (field1151 != 0 && field1150 == var14 && field1149 == var13.field834) {
										var22.method177(var17, 128, var18);
									} else {
										var22.method173(var17, var18);
									}

									if (var22.field520 == 33 || var13.field831[var14] != 1) {
										int var23 = var13.field831[var14];
										field1112.method191(0, var17 + var19 + 1, method367(var23), var18 + var20 + 10);
										field1112.method191(0xFFFF00, var17 + var19, method367(var23), var18 + var20 + 9);
									}
								} else if (var13.field860 != null && var14 < 20) {
									class34 var24 = var13.field860[var14];
									if (var24 != null) {
										var24.method173(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field836 == 3) {
						if (var13.field864) {
							class32.method149(var13.field839, var13.field840, var13.field870, var12, var11);
						} else {
							class32.method150(var12, var13.field840, var13.field870, var13.field839, var11);
						}
					} else if (var13.field836 == 4) {
						class36 var25 = var13.field867;
						int var26 = var13.field870;
						String var27 = var13.field868;

						if ((field1240 == var13.field834 || field1121 == var13.field834 || field941 == var13.field834) && var13.field872 != 0) {
							var26 = var13.field872;
						}

						if (method405(var13)) {
							var26 = var13.field871;

							if (var13.field869.length() > 0) {
								var27 = var13.field869;
							}
						}

						if (var13.field837 == 6 && field1117) {
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

									var27 = var27.substring(0, var29) + method414(method372(0, var13)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method414(method372(1, var13)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method414(method372(2, var13)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method414(method372(3, var13)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method414(method372(4, var13)) + var27.substring(var33 + 2);
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
								var25.method189(var35, var26, var13.field839 / 2 + var11, var28, var13.field866);
							} else {
								var25.method193(var13.field866, var35, var28, var11, var26);
							}

							var28 += var25.field537;
						}
					} else if (var13.field836 == 5) {
						class34 var36;
						if (method405(var13)) {
							var36 = var13.field874;
						} else {
							var36 = var13.field873;
						}

						if (var36 != null) {
							var36.method173(var11, var12);
						}
					} else if (var13.field836 == 6) {
						int var37 = class33.field497;
						int var38 = class33.field498;
						class33.field497 = var13.field839 / 2 + var11;
						class33.field498 = var13.field840 / 2 + var12;
						int var39 = class33.field501[var13.field880] * var13.field879 >> 16;
						int var40 = class33.field502[var13.field880] * var13.field879 >> 16;
						boolean var41 = method405(var13);
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
										var50 = var50 + " x" + method484(var13.field831[var46]);
									}

									int var51 = (var13.field858 + 115) * var48 + var11;
									int var52 = (var13.field859 + 12) * var47 + var12;
									if (var13.field865) {
										var45.method189(var50, var13.field870, var13.field839 / 2 + var51, var52, var13.field866);
									} else {
										var45.method193(var13.field866, var50, var52, var51, var13.field870);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			class32.method147(var6, var7, var8, var5);
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method449(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		int var6 = arg0;
		if (arg0 < 3 && (field998[1][var4][var5] & 0x2) == 2) {
			var6 = arg0 + 1;
		}

		int var7 = arg2 & 0x7F;
		int var8 = arg1 & 0x7F;
		int var9 = (128 - var7) * field1032[var6][var4][var5] + field1032[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field1032[var6][var4][var5 + 1] + field1032[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.a(Lkb;ZI)V")
	public final void method450(class37 arg0, int arg1) {
		int var3 = arg0.method220(8);
		if (var3 < field1199) {
			for (int var4 = var3; var4 < field1199; var4++) {
				field1300[field1299++] = field1200[var4];
			}
		}

		if (var3 > field1199) {
			signlink.reporterror(field1002 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1199 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1200[var5];
			class26 var7 = field1198[var6];
			int var8 = arg0.method220(1);
			if (var8 == 0) {
				field1200[field1199++] = var6;
				var7.field312 = field1209;
			} else {
				int var9 = arg0.method220(2);
				if (var9 == 0) {
					field1200[field1199++] = var6;
					var7.field312 = field1209;
					field1202[field1201++] = var6;
				} else if (var9 == 1) {
					field1200[field1199++] = var6;
					var7.field312 = field1209;
					int var10 = arg0.method220(3);
					var7.method110(false, var10);
					int var11 = arg0.method220(1);
					if (var11 == 1) {
						field1202[field1201++] = var6;
					}
				} else if (var9 == 2) {
					field1200[field1199++] = var6;
					var7.field312 = field1209;
					int var12 = arg0.method220(3);
					var7.method110(true, var12);
					int var13 = arg0.method220(3);
					var7.method110(true, var13);
					int var14 = arg0.method220(1);
					if (var14 == 1) {
						field1202[field1201++] = var6;
					}
				} else if (var9 == 3) {
					field1300[field1299++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method451(int arg0, int arg1) {
		class41 var3 = field1178[field1189][arg0][arg1];
		if (var3 == null) {
			field1298.method76(field1189, arg0, arg1);
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
			field1298.method57(var16, arg1, arg0, field1189, var17.method291(var5.field267), method449(field1189, arg1 * 128 + 64, arg0 * 128 + 64), var15, var14);
		}
	}

	@ObfuscatedName("client.G(I)Ljava/net/Socket;")
	public final Socket method452(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method453() {
		field1080.method235();
		int var1 = field949 + field1332 & 0x7FF;
		int var2 = field1312.field268 / 32 + 48;
		int var3 = 464 - field1312.field269 / 32;
		field970.method179(21, field1065, 151, 9, var3, var1, field1329, field1063 + 256, var2, 146);
		field1207.method179(0, field1021, 33, 0, 25, field949, field1015, 256, 25, 33);

		for (int var4 = 0; var4 < field1326; var4++) {
			int var5 = field1327[var4] * 4 + 2 - field1312.field268 / 32;
			int var6 = field1328[var4] * 4 + 2 - field1312.field269 / 32;
			method455(var6, var5, field971[var4]);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class41 var9 = field1178[field1189][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1312.field268 / 32;
					int var11 = var8 * 4 + 2 - field1312.field269 / 32;
					method455(var11, var10, field943);
				}
			}
		}

		for (int var12 = 0; var12 < field1174; var12++) {
			class25 var13 = field1173[field1175[var12]];
			if (var13 != null && var13.method111() && var13.field320.field757) {
				int var14 = var13.field268 / 32 - field1312.field268 / 32;
				int var15 = var13.field269 / 32 - field1312.field269 / 32;
				method455(var15, var14, field944);
			}
		}

		for (int var16 = 0; var16 < field1199; var16++) {
			class26 var17 = field1198[field1200[var16]];
			if (var17 != null && var17.method111()) {
				int var18 = var17.field268 / 32 - field1312.field268 / 32;
				int var19 = var17.field269 / 32 - field1312.field269 / 32;
				boolean var20 = false;
				long var21 = class48.method251(var17.field321);
				for (int var23 = 0; var23 < field1109; var23++) {
					if (field1101[var23] == var21 && field1176[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method455(var19, var18, field946);
				} else {
					method455(var19, var18, field945);
				}
			}
		}

		if (field968 != 0) {
			int var24 = field968 * 4 + 2 - field1312.field268 / 32;
			int var25 = field969 * 4 + 2 - field1312.field269 / 32;
			method455(var25, var24, field993);
		}

		class32.method149(3, 3, 0xFFFFFF, 82, 93);
		field1081.method235();
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method454(long arg0) {
		if (arg0 != 0L) {
			if (field1164 >= 100) {
				method380(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field1164; var4++) {
					if (field1050[var4] == arg0) {
						method380(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1109; var5++) {
					if (field1101[var5] == arg0) {
						method380(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1050[field1164++] = arg0;
				field975 = true;
				field1301.method198(175);
				field1301.method205(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IIILhb;)V")
	public final void method455(int arg0, int arg1, class34 arg2) {
		int var4 = field949 + field1332 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = class31.field478[var4];
			int var7 = class31.field479[var4];
			var6 = var6 * 256 / (field1063 + 256);
			var7 = var7 * 256 / (field1063 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method180(var8 + 94 - arg2.field520 / 2, 83 - var9 - arg2.field521 / 2, field986);
			} else {
				arg2.method173(var8 + 94 - arg2.field520 / 2, 83 - var9 - arg2.field521 / 2);
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method456() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1269[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1269[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1270[var10] = (field1269[var10 - 1] + field1269[var10 + 1] + field1269[var10 - 128] + field1269[var10 + 128]) / 4;
			}
		}

		field1144 += 128;
		if (field1144 > field963.length) {
			field1144 -= field963.length;
			int var11 = (int) (Math.random() * 12.0D);
			method427(field954[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1270[var14 + 128] - field963[field1144 + var14 & field963.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1269[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1051[var16] = field1051[var16 + 1];
		}

		field1051[var1 - 1] = (int) (Math.sin(field1209 / 14.0D) * 16.0D + Math.sin(field1209 / 15.0D) * 14.0D + Math.sin(field1209 / 16.0D) * 12.0D);

		if (field1130 > 0) {
			field1130 -= 4;
		}

		if (field1131 > 0) {
			field1131 -= 4;
		}

		if (field1130 == 0 && field1131 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1130 = 1024;
			}

			if (var17 == 1) {
				field1131 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method457(int arg0) {
		int var2 = class64.field922[arg0].field930;
		if (var2 != 0) {
			int var3 = field1147[arg0];
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
				field1335 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1008;

				if (var3 == 0) {
					method426(0, field1008);
					field1008 = true;
				}

				if (var3 == 1) {
					method426(-400, field1008);
					field1008 = true;
				}

				if (var3 == 2) {
					method426(-800, field1008);
					field1008 = true;
				}

				if (var3 == 3) {
					method426(-1200, field1008);
					field1008 = true;
				}

				if (var3 == 4) {
					field1008 = false;
				}

				if (field1008 != var4) {
					if (field1008) {
						method425(field991, field1205, field1172);
					} else {
						method464();
					}

					field1017 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1031 = true;
					method463(0);
				}

				if (var3 == 1) {
					field1031 = true;
					method463(-400);
				}

				if (var3 == 2) {
					field1031 = true;
					method463(-800);
				}

				if (var3 == 3) {
					field1031 = true;
					method463(-1200);
				}

				if (var3 == 4) {
					field1031 = false;
				}
			}

			if (var2 == 5) {
				field1153 = var3;
			}

			if (var2 == 6) {
				field1319 = var3;
			}

			if (var2 == 8) {
				field1005 = var3;
				field1044 = true;
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.H(I)V")
	public final void method458() {
		int var1 = field1114.method190("Choose Option");
		for (int var2 = 0; var2 < field1034; var2++) {
			int var3 = field1114.method190(field1030[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1034 * 15 + 21;
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

			field1235 = true;
			field1058 = 0;
			field1059 = var5;
			field1060 = var6;
			field1061 = var1;
			field1062 = field1034 * 15 + 22;
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

			field1235 = true;
			field1058 = 1;
			field1059 = var7;
			field1060 = var8;
			field1061 = var1;
			field1062 = field1034 * 15 + 22;
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

			field1235 = true;
			field1058 = 2;
			field1059 = var9;
			field1060 = var10;
			field1061 = var1;
			field1062 = field1034 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;II)Lub;")
	public final class47 method459(String arg0, String arg1, int arg2, int arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg1);
		if (var6 != null) {
			field1046.reset();
			field1046.update(var6);
			int var7 = (int) field1046.getValue();
			if (arg3 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class47(var6);
		}

		while (var6 == null) {
			method13(arg2, "Requesting " + arg0);

			try {
				int var9 = 0;
				DataInputStream var10 = method479(arg1 + arg3);
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
						method13(arg2, "Loading " + arg0 + " - " + var17 + "%");
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					method13(arg2, "Error loading - Will retry in " + var18 + " secs.");

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

	@ObfuscatedName("client.a(ZZ[BI)V")
	public final void method460(boolean arg0, byte[] arg1, int arg2) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg2);
	}

	@ObfuscatedName("client.a(IB[B)Z")
	public final boolean method461(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.I(I)Z")
	public final boolean method462() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.g(II)V")
	public final void method463(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method464() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.d(Lkb;II)V")
	public final void method465(class37 arg0, int arg1) {
		for (int var3 = 0; var3 < field1201; var3++) {
			int var4 = field1202[var3];
			class26 var5 = field1198[var4];
			int var6 = arg0.method209();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method209() << 8;
			}

			method413(arg0, var5, var4, var6);
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

	@ObfuscatedName("client.a(IILkb;)V")
	public final void method466(int arg0, class37 arg1) {
		field1299 = 0;
		field1201 = 0;
		method434(arg1, arg0);
		method450(arg1, arg0);
		method381(arg1, arg0);
		method465(arg1, arg0);

		for (int var3 = 0; var3 < field1299; var3++) {
			int var4 = field1300[var3];
			if (field1209 != field1198[var4].field312) {
				field1198[var4] = null;
			}
		}

		if (arg1.field540 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field540 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1199; var5++) {
			if (field1198[field1200[var5]] == null) {
				signlink.reporterror(field1002 + " null entry in pl list - pos:" + var5 + " size:" + field1199);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method467() {
		if (field1140 == 2) {
			for (class39 var1 = (class39) field952.method228(); var1 != null; var1 = (class39) field952.method230()) {
				if (field1209 >= var1.field568) {
					method475(var1.field567, var1.field566, var1.field565, var1.field563, var1.field564, var1.field561, var1.field562);
					var1.method107();
				}
			}
		}
	}

	@ObfuscatedName("client.b(Lhc;B)V")
	public final void method468(class60 arg0) {
		int var2 = arg0.field838;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1109) {
				arg0.field868 = "";
				arg0.field837 = 0;
			} else {
				arg0.field868 = field1184[var2];
				arg0.field837 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1109) {
				arg0.field868 = "";
				arg0.field837 = 0;
			} else {
				if (field1176[var2] == 0) {
					arg0.field868 = "@red@Offline";
				} else if (field1176[var2] == field1180) {
					arg0.field868 = "@gre@World-" + (field1176[var2] - 9);
				} else {
					arg0.field868 = "@yel@World-" + (field1176[var2] - 9);
				}

				arg0.field837 = 1;
			}
		} else if (var2 == 203) {
			arg0.field847 = field1109 * 15 + 20;
			if (arg0.field847 <= arg0.field840) {
				arg0.field847 = arg0.field840 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1164) {
				arg0.field868 = "";
				arg0.field837 = 0;
			} else {
				arg0.field868 = class48.method255(class48.method252(field1050[var2]));
				arg0.field837 = 1;
			}
		} else if (var2 == 503) {
			arg0.field847 = field1164 * 15 + 20;
			if (arg0.field847 <= arg0.field840) {
				arg0.field847 = arg0.field840 + 1;
			}
		} else if (var2 == 327) {
			arg0.field880 = 150;
			arg0.field881 = (int) (Math.sin(field1209 / 40.0D) * 256.0D) & 0x7FF;

			if (field1275) {
				field1275 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1191[var5];
					if (var6 >= 0) {
						var3[var4++] = class59.field822[var6].method312();
					}
				}

				class31 var7 = new class31(var3, var4);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field1258[var8] != 0) {
						var7.method133(field1073[var8][0], field1073[var8][field1258[var8]]);

						if (var8 == 1) {
							var7.method133(field1019[0], field1019[field1258[var8]]);
						}
					}
				}

				var7.method126();
				var7.method127(class62.field895[field1312.field273].field897[0]);
				var7.method136(64, 850, -30, -50, -30, true);
				arg0.field875 = var7;
			}
		} else if (var2 == 324) {
			if (field1110 == null) {
				field1110 = arg0.field873;
				field1111 = arg0.field874;
			}

			if (field1253) {
				arg0.field873 = field1111;
			} else {
				arg0.field873 = field1110;
			}
		} else if (var2 == 325) {
			if (field1110 == null) {
				field1110 = arg0.field873;
				field1111 = arg0.field874;
			}

			if (field1253) {
				arg0.field873 = field1110;
			} else {
				arg0.field873 = field1111;
			}
		} else if (var2 == 600) {
			arg0.field868 = field967;
			if (field1209 % 20 < 10) {
				arg0.field868 = arg0.field868 + "|";
			} else {
				arg0.field868 = arg0.field868 + " ";
			}
		} else if (var2 == 613) {
			if (!field973) {
				arg0.field868 = "";
			} else if (field1243) {
				arg0.field870 = 0xFF0000;
				arg0.field868 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field870 = 0xFFFFFF;
				arg0.field868 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1142 == 0) {
				arg0.field868 = "";
			} else {
				String var9;
				if (field1052 == 0) {
					var9 = "earlier today";
				} else if (field1052 == 1) {
					var9 = "yesterday";
				} else {
					var9 = field1052 + " days ago";
				}

				arg0.field868 = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1220 == 0) {
				arg0.field868 = "0 unread messages";
				arg0.field870 = 0xFFFF00;
			}

			if (field1220 == 1) {
				arg0.field868 = "1 unread message";
				arg0.field870 = 0xFF00;
			}

			if (field1220 > 1) {
				arg0.field868 = field1220 + " unread messages";
				arg0.field870 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1127 == 201) {
				arg0.field868 = "";
			} else if (field1127 == 200) {
				arg0.field868 = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (field1127 == 0) {
					var10 = "Earlier today";
				} else if (field1127 == 1) {
					var10 = "Yesterday";
				} else {
					var10 = field1127 + " days ago";
				}

				arg0.field868 = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1127 == 201) {
				arg0.field868 = "";
			} else if (field1127 == 200) {
				arg0.field868 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field868 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1127 == 201) {
				arg0.field868 = "";
			} else if (field1127 == 200) {
				arg0.field868 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field868 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(ZILx;)V")
	public final void method469(int arg0, class24 arg1) {
		method470(arg1.field269, arg0, arg1.field268);
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method470(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method449(field1189, arg0, arg2) - arg1;
			arg2 -= field1010;
			var4 -= field1011;
			arg0 -= field1012;
			int var5 = class31.field478[field1013];
			int var6 = class31.field479[field1013];
			int var7 = class31.field478[field1014];
			int var8 = class31.field479[field1014];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1035 = (var9 << 9) / arg0 + class33.field497;
				field1036 = (var11 << 9) / arg0 + class33.field498;
			} else {
				field1035 = -1;
				field1036 = -1;
			}
		} else {
			field1035 = -1;
			field1036 = -1;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method471() {
		if (field1304 == 0 && field1313 == 0) {
			field1030[field1034] = "Walk here";
			field1273[field1034] = 981;
			field1271[field1034] = field15;
			field1272[field1034] = field16;
			field1034++;
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

				if (var6 == 2 && field1298.method81(field1189, var4, var5, var3) >= 0) {
					class53 var8 = class53.method275(var7);
					if (field1304 == 1) {
						field1030[field1034] = "Use " + field1308 + " with @cya@" + var8.field702;
						field1273[field1034] = 505;
						field1274[field1034] = var3;
						field1271[field1034] = var4;
						field1272[field1034] = var5;
						field1034++;
					} else if (field1313 != 1) {
						if (var8.field718 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field718[var9] != null) {
									field1030[field1034] = var8.field718[var9] + " @cya@" + var8.field702;

									if (var9 == 0) {
										field1273[field1034] = 798;
									}

									if (var9 == 1) {
										field1273[field1034] = 829;
									}

									if (var9 == 2) {
										field1273[field1034] = 873;
									}

									if (var9 == 3) {
										field1273[field1034] = 104;
									}

									if (var9 == 4) {
										field1273[field1034] = 1659;
									}

									field1274[field1034] = var3;
									field1271[field1034] = var4;
									field1272[field1034] = var5;
									field1034++;
								}
							}
						}

						field1030[field1034] = "Examine @cya@" + var8.field702;
						field1273[field1034] = 1418;
						field1274[field1034] = var3;
						field1271[field1034] = var4;
						field1272[field1034] = var5;
						field1034++;
					} else if ((field1315 & 0x4) == 4) {
						field1030[field1034] = field1316 + " @cya@" + var8.field702;
						field1273[field1034] = 737;
						field1274[field1034] = var3;
						field1271[field1034] = var4;
						field1272[field1034] = var5;
						field1034++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field1173[var7];
					if (var10.field320.field742 == 1 && (var10.field268 & 0x7F) == 0x40 && (var10.field269 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1174; var11++) {
							class25 var12 = field1173[field1175[var11]];
							if (var12 != null && var10 != var12 && var12.field320.field742 == 1 && var10.field268 == var12.field268 && var10.field269 == var12.field269) {
								method485(var4, field1175[var11], var12.field320, var5);
							}
						}
					}

					method485(var4, var7, var10.field320, var5);
				}

				if (var6 == 0) {
					class26 var13 = field1198[var7];
					if ((var13.field268 & 0x7F) == 0x40 && (var13.field269 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1174; var14++) {
							class25 var15 = field1173[field1175[var14]];
							if (var15 != null && var15.field320.field742 == 1 && var13.field268 == var15.field268 && var13.field269 == var15.field269) {
								method485(var4, field1175[var14], var15.field320, var5);
							}
						}

						for (int var16 = 0; var16 < field1199; var16++) {
							class26 var17 = field1198[field1200[var16]];
							if (var17 != null && var13 != var17 && var13.field268 == var17.field268 && var13.field269 == var17.field269) {
								method406(var17, field1200[var16], var4, var5);
							}
						}
					}

					method406(var13, var7, var4, var5);
				}

				if (var6 == 3) {
					class41 var18 = field1178[field1189][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method229(); var19 != null; var19 = (class22) var18.method231()) {
							class55 var20 = class55.method287(var19.field266);
							if (field1304 == 1) {
								field1030[field1034] = "Use " + field1308 + " with @lre@" + var20.field770;
								field1273[field1034] = 203;
								field1274[field1034] = var19.field266;
								field1271[field1034] = var4;
								field1272[field1034] = var5;
								field1034++;
							} else if (field1313 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field784 != null && var20.field784[var21] != null) {
										field1030[field1034] = var20.field784[var21] + " @lre@" + var20.field770;

										if (var21 == 0) {
											field1273[field1034] = 56;
										}

										if (var21 == 1) {
											field1273[field1034] = 321;
										}

										if (var21 == 2) {
											field1273[field1034] = 552;
										}

										if (var21 == 3) {
											field1273[field1034] = 43;
										}

										if (var21 == 4) {
											field1273[field1034] = 687;
										}

										field1274[field1034] = var19.field266;
										field1271[field1034] = var4;
										field1272[field1034] = var5;
										field1034++;
									} else if (var21 == 2) {
										field1030[field1034] = "Take @lre@" + var20.field770;
										field1273[field1034] = 552;
										field1274[field1034] = var19.field266;
										field1271[field1034] = var4;
										field1272[field1034] = var5;
										field1034++;
									}
								}

								field1030[field1034] = "Examine @lre@" + var20.field770;
								field1273[field1034] = 1308;
								field1274[field1034] = var19.field266;
								field1271[field1034] = var4;
								field1272[field1034] = var5;
								field1034++;
							} else if ((field1315 & 0x1) == 1) {
								field1030[field1034] = field1316 + " @lre@" + var20.field770;
								field1273[field1034] = 543;
								field1274[field1034] = var19.field266;
								field1271[field1034] = var4;
								field1272[field1034] = var5;
								field1034++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method472() {
		int var1 = field1312.field268 + field1077;
		int var2 = field1312.field269 + field1214;
		if (field1123 - var1 < -500 || field1123 - var1 > 500 || field1124 - var2 < -500 || field1124 - var2 > 500) {
			field1123 = var1;
			field1124 = var2;
		}

		if (field1123 != var1) {
			field1123 += (var1 - field1123) / 16;
		}

		if (field1124 != var2) {
			field1124 += (var2 - field1124) / 16;
		}

		if (field20[1] == 1) {
			field950 += (-field950 - 24) / 2;
		} else if (field20[2] == 1) {
			field950 += (24 - field950) / 2;
		} else {
			field950 /= 2;
		}

		if (field20[3] == 1) {
			field951 += (12 - field951) / 2;
		} else if (field20[4] == 1) {
			field951 += (-field951 - 12) / 2;
		} else {
			field951 /= 2;
		}

		field949 = field950 / 2 + field949 & 0x7FF;
		field948 += field951 / 2;
		if (field948 < 128) {
			field948 = 128;
		}

		if (field948 > 383) {
			field948 = 383;
		}

		int var3 = field1123 >> 7;
		int var4 = field1124 >> 7;
		int var5 = method449(field1189, field1124, field1123);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1189;
					if (var9 < 3 && (field998[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field1032[var9][var7][var8];
					if (var10 > var6) {
						var6 = var10;
					}
				}
			}
		}

		field1222++;
		if (field1222 > 77) {
			field1222 = 0;
			field1301.method198(57);
		}

		int var11 = var6 * 192;
		if (var11 > 98048) {
			var11 = 98048;
		}

		if (var11 < 32768) {
			var11 = 32768;
		}

		if (var11 > field1219) {
			field1219 += (var11 - field1219) / 24;
		} else if (var11 < field1219) {
			field1219 += (var11 - field1219) / 80;
		}
	}

	@ObfuscatedName("client.j(B)V")
	public static final void method473() {
		class18.field194 = true;
		class33.field492 = true;
		field1183 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.a(IIIIIIIIIZII)Z")
	public final boolean method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1210[var14][var15] = 0;
				field1116[var14][var15] = 99999999;
			}
		}

		int var16 = arg5;
		int var17 = arg2;
		field1210[arg5][arg2] = 99;
		field1116[arg5][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field956[var18] = arg5;
		int var35 = var18 + 1;
		field957[var18] = arg2;
		boolean var20 = false;
		int var21 = field956.length;
		int[][] var22 = field1224[field1189].field808;
		while (var35 != var19) {
			var16 = field956[var19];
			var17 = field957[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && field1224[field1189].method304(arg9 - 1, arg7, arg1, var17, arg4, var16)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && field1224[field1189].method305(arg1, var17, arg9 - 1, arg7, arg4, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg10 != 0 && arg0 != 0 && field1224[field1189].method306(arg1, arg7, var17, arg6, var16, arg0, arg10)) {
				var20 = true;
				break;
			}

			int var23 = field1116[var16][var17] + 1;
			if (var16 > 0 && field1210[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field956[var35] = var16 - 1;
				field957[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1210[var16 - 1][var17] = 2;
				field1116[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1210[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field956[var35] = var16 + 1;
				field957[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1210[var16 + 1][var17] = 8;
				field1116[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1210[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field956[var35] = var16;
				field957[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1210[var16][var17 - 1] = 1;
				field1116[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1210[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field956[var35] = var16;
				field957[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1210[var16][var17 + 1] = 4;
				field1116[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1210[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field956[var35] = var16 - 1;
				field957[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1210[var16 - 1][var17 - 1] = 3;
				field1116[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1210[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field956[var35] = var16 + 1;
				field957[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1210[var16 + 1][var17 - 1] = 9;
				field1116[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1210[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field956[var35] = var16 - 1;
				field957[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1210[var16 - 1][var17 + 1] = 6;
				field1116[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1210[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field956[var35] = var16 + 1;
				field957[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1210[var16 + 1][var17 + 1] = 12;
				field1116[var16 + 1][var17 + 1] = var23;
			}
		}

		field1311 = 0;
		if (!var20) {
			if (arg8) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg7 - var25; var26 <= arg7 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1116[var26][var27] < var24) {
								var24 = field1116[var26][var27];
								var16 = var26;
								var17 = var27;
								field1311 = 1;
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
		field956[var28] = var16;
		int var36 = var28 + 1;
		field957[var28] = var17;
		int var29;
		int var30 = var29 = field1210[var16][var17];
		while (arg5 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field956[var36] = var16;
				field957[var36++] = var17;
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

			var30 = field1210[var16][var17];
		}

		if (var36 <= 0) {
			if (arg3 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field956[var36];
		int var33 = field957[var36];
		field1169 += var31;
		if (field1169 >= 121) {
			field1301.method198(215);
			field1301.method200(19217);
		}

		if (arg3 == 0) {
			field1301.method198(74);
			field1301.method199(var31 + var31 + 3);
		}

		if (arg3 == 1) {
			field1301.method198(37);
			field1301.method199(var31 + var31 + 3 + 14);
		}

		if (arg3 == 2) {
			field1301.method198(73);
			field1301.method199(var31 + var31 + 3);
		}

		if (field20[5] == 1) {
			field1301.method199(1);
		} else {
			field1301.method199(0);
		}

		field1301.method200(field1321 + var32);
		field1301.method200(field1322 + var33);
		field968 = field956[0];
		field969 = field957[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1301.method199(field956[var36] - var32);
			field1301.method199(field957[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 1 && arg4 >= 1 && arg3 <= 102 && arg4 <= 102) {
			if (field1183 && field1189 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field1298.method77(arg5, arg3, arg4);
			}

			if (arg6 == 1) {
				var8 = field1298.method78(arg3, arg4, arg5);
			}

			if (arg6 == 2) {
				var8 = field1298.method79(arg5, arg3, arg4);
			}

			if (arg6 == 3) {
				var8 = field1298.method80(arg5, arg3, arg4);
			}

			if (var8 != 0) {
				int var12 = field1298.method81(arg5, arg3, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field1298.method72(arg4, arg5, arg3);
					class53 var16 = class53.method275(var13);
					if (var16.field708) {
						field1224[arg5].method300(arg4, var15, arg3, var14, var16.field709);
					}
				}

				if (arg6 == 1) {
					field1298.method73(arg5, arg4, arg3);
				}

				if (arg6 == 2) {
					field1298.method74(arg4, arg3, arg5);
					class53 var17 = class53.method275(var13);
					if (var17.field706 + arg3 > 103 || var17.field706 + arg4 > 103 || var17.field707 + arg3 > 103 || var17.field707 + arg4 > 103) {
						return;
					}

					if (var17.field708) {
						field1224[arg5].method301(var15, arg3, var17.field707, arg4, var17.field709, var17.field706);
					}
				}

				if (arg6 == 3) {
					field1298.method75(arg4, arg3, arg5);
					class53 var18 = class53.method275(var13);
					if (var18.field708 && var18.field710) {
						field1224[arg5].method303(arg4, arg3);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field998[1][arg3][arg4] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				class3.method28(field1298, field1331, field1032, arg4, arg3, var19, field1224[arg5], arg2, arg5, arg0, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method476() {
		if (field1070 > 1) {
			field1070--;
		}

		if (field1041 > 0) {
			field1041--;
		}

		for (int var1 = 0; var1 < 5 && method408(); var1++) {
		}

		if (field1330) {
			for (int var2 = 0; var2 < field1119; var2++) {
				if (field988[var2] <= 0) {
					boolean var3 = false;
					try {
						if (field1216[var2] != field1108 || field1071[var2] != field1206) {
							class37 var4 = class51.method264(field1071[var2], field1216[var2]);
							if (System.currentTimeMillis() + var4.field540 / 22 > field984 / 22 + field1007) {
								field984 = var4.field540;
								field1007 = System.currentTimeMillis();

								if (method461(var4.field540, var4.field539)) {
									field1108 = field1216[var2];
									field1206 = field1071[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!method462()) {
							var3 = true;
						}
					} catch (Exception var20) {
					}

					if (var3 && field988[var2] != -5) {
						field988[var2] = -5;
					} else {
						field1119--;
						for (int var6 = var2; var6 < field1119; var6++) {
							field1216[var6] = field1216[var6 + 1];
							field1071[var6] = field1071[var6 + 1];
							field988[var6] = field988[var6 + 1];
						}

						var2--;
					}
				} else {
					field988[var2]--;
				}
			}

			if (field1017 > 0) {
				field1017 -= 20;
				if (field1017 < 0) {
					field1017 = 0;
				}

				if (field1017 == 0 && field1008 && !field1183) {
					method425(field991, field1205, field1172);
				}
			}

			if (class5.field58) {
				class37 var7 = class5.method36();
				if (var7 != null) {
					field1301.method198(53);
					field1301.method200(var7.field540);
					field1301.method207(var7.field540, var7.field539, 0);
					var7.method197();
				}
			}

			field1039++;
			if (field1039 > 750) {
				method394();
			}

			method429();
			method417();
			method403();
			method467();

			if ((field20[1] == 1 || field20[2] == 1 || field20[3] == 1 || field20[4] == 1) && field1125++ > 5) {
				field1125 = 0;
				field1301.method198(109);
				field1301.method200(field948);
				field1301.method200(field949);
				field1301.method199(field1332);
				field1301.method199(field1063);
			}

			field1135++;

			if (field1086 != 0) {
				field1085 += 20;
				if (field1085 >= 400) {
					field1086 = 0;
				}
			}

			if (field1151 != 0) {
				field1148++;
				if (field1148 >= 15) {
					if (field1151 == 2) {
						field975 = true;
					}

					if (field1151 == 3) {
						field1044 = true;
					}

					field1151 = 0;
				}
			}

			if (field1158 != 0) {
				field1120++;

				if (field15 > field1159 + 5 || field15 < field1159 - 5 || field16 > field1160 + 5 || field16 < field1160 - 5) {
					field1268 = true;
				}

				if (field14 == 0) {
					if (field1158 == 2) {
						field975 = true;
					}

					if (field1158 == 3) {
						field1044 = true;
					}

					field1158 = 0;

					if (field1268 && field1120 >= 5) {
						field1237 = -1;
						method443();

						if (field1237 == field1156 && field1236 != field1157) {
							class60 var8 = class60.field829[field1156];
							int var9 = var8.field830[field1236];
							var8.field830[field1236] = var8.field830[field1157];
							var8.field830[field1157] = var9;
							int var10 = var8.field831[field1236];
							var8.field831[field1236] = var8.field831[field1157];
							var8.field831[field1157] = var10;
							field1301.method198(80);
							field1301.method200(field1156);
							field1301.method200(field1157);
							field1301.method200(field1236);
						}
					} else if ((field1153 == 1 || method432(field1034 - 1)) && field1034 > 2) {
						method458();
					} else if (field1034 > 0) {
						method436(field1034 - 1);
					}

					field1148 = 10;
					field17 = 0;
				}
			}

			if (class18.field228 != -1) {
				int var11 = class18.field228;
				int var12 = class18.field229;
				boolean var13 = method474(0, var12, field1312.field317[0], 0, 0, field1312.field316[0], 0, var11, true, 0, 0);
				class18.field228 = -1;

				if (var13) {
					field1083 = field18;
					field1084 = field19;
					field1086 = 1;
					field1085 = 0;
				}
			}

			if (field17 == 1 && field1217 != null) {
				field1217 = null;
				field1044 = true;
				field17 = 0;
			}

			method439();
			method391();
			method383();
			method376();

			if (field14 == 1 || field17 == 1) {
				field1259++;
			}

			if (field1140 == 2) {
				method472();
			}

			if (field1140 == 2 && field1163) {
				method366();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				field1138[var14]++;
			}

			method401();
			field1194++;
			if (field1194 > 54) {
				field1194 = 0;
				field1301.method198(180);
			}

			field13++;
			if (field13 > 4500) {
				field1041 = 250;
				field13 -= 500;
				field1301.method198(161);
			}

			field959++;
			if (field959 > 500) {
				field959 = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					field1077 += field1078;
				}

				if ((var15 & 0x2) == 2) {
					field1214 += field1215;
				}

				if ((var15 & 0x4) == 4) {
					field1068 += field1069;
				}
			}

			if (field1077 < -50) {
				field1078 = 2;
			}

			if (field1077 > 50) {
				field1078 = -2;
			}

			if (field1214 < -55) {
				field1215 = 2;
			}

			if (field1214 > 55) {
				field1215 = -2;
			}

			if (field1068 < -40) {
				field1069 = 1;
			}

			if (field1068 > 40) {
				field1069 = -1;
			}

			field1334++;
			if (field1334 > 500) {
				field1334 = 0;
				int var16 = (int) (Math.random() * 8.0D);
				if ((var16 & 0x1) == 1) {
					field1332 += field1333;
				}

				if ((var16 & 0x2) == 2) {
					field1063 += field1064;
				}
			}

			if (field1332 < -60) {
				field1333 = 2;
			}

			if (field1332 > 60) {
				field1333 = -2;
			}

			if (field1063 < -20) {
				field1064 = 1;
			}

			if (field1063 > 10) {
				field1064 = -1;
			}

			field1040++;
			if (field1040 > 50) {
				field1301.method198(126);
			}

			try {
				if (field1009 != null && field1301.field540 > 0) {
					field1009.method33(field1301.field540, field1301.field539, 0);
					field1301.field540 = 0;
					field1040 = 0;
				}
			} catch (IOException var18) {
				method394();
			} catch (Exception var19) {
				method379();
			}
		}
	}

	@ObfuscatedName("client.M(I)Ljava/lang/String;")
	public final String method477() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method478() {
		if (field1155 == 0) {
			int var1 = field6 / 2 - 80;
			int var2 = field7 / 2 + 20;
			var2 += 20;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1155 = 3;
				field1223 = 0;
			}

			int var3 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var3 - 75 && field18 <= var3 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1212 = "";
				field1213 = "Enter your username & password.";
				field1155 = 2;
				field1223 = 0;
			}
		} else if (field1155 == 2) {
			int var4 = field7 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1223 = 0;
			}

			var4 += 15;
			if (field17 == 1 && field19 >= var4 - 15 && field19 < var4) {
				field1223 = 1;
			}

			var4 += 15;
			int var5 = field6 / 2 - 80;
			int var6 = field7 / 2 + 50;
			var6 += 20;
			if (field17 == 1 && field18 >= var5 - 75 && field18 <= var5 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				method382(field1002, field1003, false);
			}

			int var7 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var7 - 75 && field18 <= var7 + 75 && field19 >= var6 - 20 && field19 <= var6 + 20) {
				field1155 = 0;
				field1002 = "";
				field1003 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1336.length(); var10++) {
					if (var8 == field1336.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1223 == 0) {
					if (var8 == 8 && field1002.length() > 0) {
						field1002 = field1002.substring(0, field1002.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1223 = 1;
					}

					if (var9) {
						field1002 = field1002 + (char) var8;
					}

					if (field1002.length() > 12) {
						field1002 = field1002.substring(0, 12);
					}
				} else if (field1223 == 1) {
					if (var8 == 8 && field1003.length() > 0) {
						field1003 = field1003.substring(0, field1003.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1223 = 0;
					}

					if (var9) {
						field1003 = field1003 + (char) var8;
					}

					if (field1003.length() > 20) {
						field1003 = field1003.substring(0, 20);
					}
				}
			}
		} else if (field1155 == 3) {
			int var11 = field6 / 2;
			int var12 = field7 / 2 + 50;
			var12 += 20;
			if (field17 == 1 && field18 >= var11 - 75 && field18 <= var11 + 75 && field19 >= var12 - 20 && field19 <= var12 + 20) {
				field1155 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method479(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.a(B)V")
	public final void method9() {
		if (field1257 || field1179 || field974) {
			method488();
		} else {
			if (field1330) {
				method424();
			} else {
				method487();
			}

			field1259 = 0;
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method480() {
		for (class27 var1 = (class27) field1126.method228(); var1 != null; var1 = (class27) field1126.method230()) {
			if (field1189 != var1.field343 || field1209 > var1.field349) {
				var1.method107();
			} else if (field1209 >= var1.field348) {
				if (var1.field352 > 0) {
					class25 var2 = field1173[var1.field352 - 1];
					if (var2 != null) {
						var1.method116(var2.field268, method449(var1.field343, var2.field269, var2.field268) - var1.field347, var2.field269, field1209);
					}
				}

				if (var1.field352 < 0) {
					int var3 = -var1.field352 - 1;
					class26 var4;
					if (field976 == var3) {
						var4 = field1312;
					} else {
						var4 = field1198[var3];
					}

					if (var4 != null) {
						var1.method116(var4.field268, method449(var1.field343, var4.field269, var4.field268) - var1.field347, var4.field269, field1209);
					}
				}

				var1.method117(field1135);
				field1298.method61((int) var1.field355, 60, (int) var1.field356, null, var1.field362, false, -1, (int) var1.field354, var1, field1189);
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method481() {
		for (class28 var1 = (class28) field1233.method228(); var1 != null; var1 = (class28) field1233.method230()) {
			if (field1189 != var1.field368 || var1.field374) {
				var1.method107();
			} else if (field1209 >= var1.field367) {
				var1.method118(field1135);

				if (var1.field374) {
					var1.method107();
				} else {
					field1298.method61(var1.field370, 60, var1.field371, null, 0, false, -1, var1.field369, var1, var1.field368);
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method482() {
		field1288 = 0;
		for (int var1 = -1; var1 < field1199 + field1174; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field1312;
			} else if (var1 < field1199) {
				var2 = field1198[field1200[var1]];
			} else {
				var2 = field1173[field1175[var1 - field1199]];
			}

			if (var2 != null && var2.method111()) {
				if (var1 < field1199) {
					int var3 = 30;
					class26 var4 = (class26) var2;
					if (var4.field324 != 0) {
						method469(var2.field313 + 15, var2);

						if (field1035 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field324 & 1 << var5) != 0) {
									field1006[var5].method173(field1035 - 12, field1036 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1208 == 10 && field1200[var1] == field1277) {
						method469(var2.field313 + 15, var2);

						if (field1035 > -1) {
							field1006[7].method173(field1035 - 12, field1036 - var3);
						}
					}
				} else if (field1208 == 1 && field1175[var1 - field1199] == field1137 && field1209 % 20 < 10) {
					method469(var2.field313 + 15, var2);

					if (field1035 > -1) {
						field1006[2].method173(field1035 - 12, field1036 - 28);
					}
				}

				if (var2.field280 != null && (var1 >= field1199 || field1318 == 0 || field1318 == 3 || field1318 == 1 && method370(((class26) var2).field321))) {
					method469(var2.field313, var2);

					if (field1035 > -1 && field1288 < field1289) {
						field1293[field1288] = field1114.method190(var2.field280) / 2;
						field1292[field1288] = field1114.field537;
						field1290[field1288] = field1035;
						field1291[field1288] = field1036;
						field1294[field1288] = var2.field282;
						field1295[field1288] = var2.field283;
						field1296[field1288] = var2.field281;
						field1297[field1288++] = var2.field280;

						if (field1319 == 0 && var2.field283 == 1) {
							field1292[field1288] += 10;
							field1291[field1288] += 5;
						}

						if (field1319 == 0 && var2.field283 == 2) {
							field1293[field1288] = 60;
						}
					}
				}

				if (var2.field286 > field1209 + 100) {
					method469(var2.field313 + 15, var2);

					if (field1035 > -1) {
						int var6 = var2.field287 * 30 / var2.field288;
						if (var6 > 30) {
							var6 = 30;
						}

						class32.method149(var6, 5, 0xFF00, field1036 - 3, field1035 - 15);
						class32.method149(30 - var6, 5, 0xFF0000, field1036 - 3, field1035 - 15 + var6);
					}
				}

				if (var2.field286 > field1209 + 330) {
					method469(var2.field313 / 2, var2);

					if (field1035 > -1) {
						field1133[var2.field285].method173(field1035 - 12, field1036 - 12);
						field1112.method188(String.valueOf(var2.field284), field1036 + 4, field1035, 0);
						field1112.method188(String.valueOf(var2.field284), field1036 + 3, field1035 - 1, 0xFFFFFF);
					}
				}
			}
		}

		for (int var7 = 0; var7 < field1288; var7++) {
			int var8 = field1290[var7];
			int var9 = field1291[var7];
			int var10 = field1293[var7];
			int var11 = field1292[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > field1291[var13] - field1292[var13] && var9 - var11 < field1291[var13] + 2 && var8 - var10 < field1293[var13] + field1290[var13] && var8 + var10 > field1290[var13] - field1293[var13] && field1291[var13] - field1292[var13] < var9) {
						var9 = field1291[var13] - field1292[var13];
						var12 = true;
					}
				}
			}

			field1035 = field1290[var7];
			field1036 = field1291[var7] = var9;
			String var14 = field1297[var7];
			if (field1319 == 0) {
				int var15 = 0xFFFF00;
				if (field1294[var7] < 6) {
					var15 = field1045[field1294[var7]];
				}

				if (field1294[var7] == 6) {
					var15 = field1225 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1294[var7] == 7) {
					var15 = field1225 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1294[var7] == 8) {
					var15 = field1225 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1294[var7] == 9) {
					int var16 = 150 - field1296[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (field1294[var7] == 10) {
					int var17 = 150 - field1296[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (field1294[var7] == 11) {
					int var18 = 150 - field1296[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (field1295[var7] == 0) {
					field1114.method188(var14, field1036 + 1, field1035, 0);
					field1114.method188(var14, field1036, field1035, var15);
				}

				if (field1295[var7] == 1) {
					field1114.method192(0, var14, field1225, field1035, field1036 + 1);
					field1114.method192(var15, var14, field1225, field1035, field1036);
				}

				if (field1295[var7] == 2) {
					int var19 = field1114.method190(var14);
					int var20 = (150 - field1296[var7]) * (var19 + 100) / 150;
					class32.method147(0, field1035 + 50, 334, field1035 - 50);
					field1114.method191(0, field1035 + 50 - var20, var14, field1036 + 1);
					field1114.method191(var15, field1035 + 50 - var20, var14, field1036);
					class32.method146();
				}
			} else {
				field1114.method188(var14, field1036 + 1, field1035, 0);
				field1114.method188(var14, field1036, field1035, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method483(long arg0) {
		if (arg0 != 0L) {
			if (field1109 >= 100) {
				method380(0, "", "Your friends list is full. Max of 100 hit");
			} else {
				String var3 = class48.method255(class48.method252(arg0));
				for (int var4 = 0; var4 < field1109; var4++) {
					if (field1101[var4] == arg0) {
						method380(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1164; var5++) {
					if (field1050[var5] == arg0) {
						method380(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1312.field321)) {
					field1184[field1109] = var3;
					field1101[field1109] = arg0;
					field1176[field1109] = 0;
					field1109++;
					field975 = true;
					field1301.method198(66);
					field1301.method205(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static final String method484(int arg0) {
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

	@ObfuscatedName("client.a(IILbc;II)V")
	public final void method485(int arg0, int arg1, class54 arg2, int arg3) {
		if (field1034 < 400) {
			String var5 = arg2.field740;
			if (arg2.field758 != 0) {
				var5 = var5 + method384(field1312.field327, arg2.field758) + " (level-" + arg2.field758 + ")";
			}

			if (field1304 == 1) {
				field1030[field1034] = "Use " + field1308 + " with @yel@" + var5;
				field1273[field1034] = 493;
				field1274[field1034] = arg1;
				field1271[field1034] = arg0;
				field1272[field1034] = arg3;
				field1034++;
			} else if (field1313 != 1) {
				if (arg2.field753 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg2.field753[var6] != null && !arg2.field753[var6].equalsIgnoreCase("attack")) {
							field1030[field1034] = arg2.field753[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1273[field1034] = 988;
							}

							if (var6 == 1) {
								field1273[field1034] = 345;
							}

							if (var6 == 2) {
								field1273[field1034] = 249;
							}

							if (var6 == 3) {
								field1273[field1034] = 960;
							}

							if (var6 == 4) {
								field1273[field1034] = 40;
							}

							field1274[field1034] = arg1;
							field1271[field1034] = arg0;
							field1272[field1034] = arg3;
							field1034++;
						}
					}
				}

				if (arg2.field753 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg2.field753[var7] != null && arg2.field753[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg2.field758 > field1312.field327) {
								var8 = 2000;
							}

							field1030[field1034] = arg2.field753[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1273[field1034] = var8 + 988;
							}

							if (var7 == 1) {
								field1273[field1034] = var8 + 345;
							}

							if (var7 == 2) {
								field1273[field1034] = var8 + 249;
							}

							if (var7 == 3) {
								field1273[field1034] = var8 + 960;
							}

							if (var7 == 4) {
								field1273[field1034] = var8 + 40;
							}

							field1274[field1034] = arg1;
							field1271[field1034] = arg0;
							field1272[field1034] = arg3;
							field1034++;
						}
					}
				}

				field1030[field1034] = "Examine @yel@" + var5;
				field1273[field1034] = 1814;
				field1274[field1034] = arg1;
				field1271[field1034] = arg0;
				field1272[field1034] = arg3;
				field1034++;
			} else if ((field1315 & 0x2) == 2) {
				field1030[field1034] = field1316 + " @yel@" + var5;
				field1273[field1034] = 500;
				field1274[field1034] = arg1;
				field1271[field1034] = arg0;
				field1272[field1034] = arg3;
				field1034++;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method486() {
		field1043 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1136) {
				method456();
				method456();
				method441();
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

		field1043 = false;
	}

	@ObfuscatedName("client.P(I)V")
	public final void method487() {
		method444();
		field1246.method235();
		field1254.method186(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1155 == 0) {
			int var3 = var2 / 2 - 20;
			field1114.method189("Welcome to RuneScape", 0xFFFF00, var1 / 2, var3, true);
			var3 += 30;
			int var4 = var1 / 2 - 80;
			int var5 = var2 / 2 + 20;
			field1255.method186(var4 - 73, var5 - 20);
			field1114.method189("New user", 0xFFFFFF, var4, var5 + 5, true);
			int var6 = var1 / 2 + 80;
			field1255.method186(var6 - 73, var5 - 20);
			field1114.method189("Existing User", 0xFFFFFF, var6, var5 + 5, true);
		}

		if (field1155 == 2) {
			int var7 = var2 / 2 - 40;
			if (field1212.length() > 0) {
				field1114.method189(field1212, 0xFFFF00, var1 / 2, var7 - 15, true);
				field1114.method189(field1213, 0xFFFF00, var1 / 2, var7, true);
				var7 += 30;
			} else {
				field1114.method189(field1213, 0xFFFF00, var1 / 2, var7 - 7, true);
				var7 += 30;
			}

			field1114.method193(true, "Username: " + field1002 + (field1223 == 0 & field1209 % 40 < 20 ? "@yel@|" : ""), var7, var1 / 2 - 90, 0xFFFFFF);
			var7 += 15;
			field1114.method193(true, "Password: " + class48.method257(field1003) + (field1223 == 1 & field1209 % 40 < 20 ? "@yel@|" : ""), var7, var1 / 2 - 88, 0xFFFFFF);
			var7 += 15;
			int var8 = var1 / 2 - 80;
			int var9 = var2 / 2 + 50;
			field1255.method186(var8 - 73, var9 - 20);
			field1114.method189("Login", 0xFFFFFF, var8, var9 + 5, true);
			int var10 = var1 / 2 + 80;
			field1255.method186(var10 - 73, var9 - 20);
			field1114.method189("Cancel", 0xFFFFFF, var10, var9 + 5, true);
		}

		if (field1155 == 3) {
			field1114.method189("Create a free account", 0xFFFF00, var1 / 2, var2 / 2 - 60, true);
			int var11 = var2 / 2 - 35;
			field1114.method189("To create a new account you need to", 0xFFFFFF, var1 / 2, var11, true);
			var11 += 15;
			field1114.method189("go back to the main RuneScape webpage", 0xFFFFFF, var1 / 2, var11, true);
			var11 += 15;
			field1114.method189("and choose the red 'create account'", 0xFFFFFF, var1 / 2, var11, true);
			var11 += 15;
			field1114.method189("button at the top right of that page.", 0xFFFFFF, var1 / 2, var11, true);
			var11 += 15;
			int var12 = var1 / 2;
			int var13 = var2 / 2 + 50;
			field1255.method186(var12 - 73, var13 - 20);
			field1114.method189("Cancel", 0xFFFFFF, var12, var13 + 5, true);
		}

		field1246.method236(214, 186, field8);

		if (field1335) {
			field1335 = false;
			field1244.method236(128, 0, field8);
			field1245.method236(214, 386, field8);
			field1249.method236(0, 265, field8);
			field1250.method236(574, 265, field8);
			field1251.method236(128, 186, field8);
			field1252.method236(574, 186, field8);
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method488() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1179) {
			field1136 = false;
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

		if (field974) {
			field1136 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1257) {
			field1136 = false;
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

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1143[var1] = var0 / 4;
		}
	}
}
