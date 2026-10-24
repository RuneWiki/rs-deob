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
	public int field901;

	@ObfuscatedName("client.bb")
	public int field902;

	@ObfuscatedName("client.cb")
	public boolean field903 = false;

	@ObfuscatedName("client.db")
	public boolean field904 = true;

	@ObfuscatedName("client.eb")
	public int[] field905 = new int[100];

	@ObfuscatedName("client.fb")
	public static boolean field906 = true;

	@ObfuscatedName("client.gb")
	public static final int[] field907 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.hb")
	public class41[][][] field908 = new class41[4][104][104];

	@ObfuscatedName("client.ib")
	public String field909;

	@ObfuscatedName("client.jb")
	public int field910;

	@ObfuscatedName("client.kb")
	public int field911;

	@ObfuscatedName("client.lb")
	public int field912;

	@ObfuscatedName("client.mb")
	public int field913;

	@ObfuscatedName("client.nb")
	public int field914;

	@ObfuscatedName("client.ob")
	public class36 field915;

	@ObfuscatedName("client.pb")
	public class36 field916;

	@ObfuscatedName("client.qb")
	public class36 field917;

	@ObfuscatedName("client.rb")
	public class36 field918;

	@ObfuscatedName("client.tb")
	public int field919 = 78;

	@ObfuscatedName("client.ub")
	public static int[] field920 = new int[99];

	@ObfuscatedName("client.xb")
	public boolean field921 = false;

	@ObfuscatedName("client.yb")
	public boolean field922 = false;

	@ObfuscatedName("client.zb")
	public int field923;

	@ObfuscatedName("client.ac")
	public int field947;

	@ObfuscatedName("client.cc")
	public int field948;

	@ObfuscatedName("client.dc")
	public int field949;

	@ObfuscatedName("client.ec")
	public int field950;

	@ObfuscatedName("client.fc")
	public int field951;

	@ObfuscatedName("client.gc")
	public String field952;

	@ObfuscatedName("client.hc")
	public int[] field953 = new int[8];

	@ObfuscatedName("client.ic")
	public class35[] field954 = new class35[50];

	@ObfuscatedName("client.jc")
	public int field955 = 10;

	@ObfuscatedName("client.H")
	public CRC32 field884 = new CRC32();

	@ObfuscatedName("client.U")
	public class41 field896 = new class41();

	@ObfuscatedName("client.V")
	public boolean field897 = false;

	@ObfuscatedName("client.X")
	public boolean field899 = false;

	@ObfuscatedName("client.Z")
	public class41 field900 = new class41();

	@ObfuscatedName("client.Bb")
	public long[] field924 = new long[100];

	@ObfuscatedName("client.Cb")
	public int field925 = -1;

	@ObfuscatedName("client.Gb")
	public int field929 = 2;

	@ObfuscatedName("client.Lb")
	public String field934 = "";

	@ObfuscatedName("client.Nb")
	public int[] field935 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Rb")
	public String[] field939 = new String[100];

	@ObfuscatedName("client.Sb")
	public int field940 = -1;

	@ObfuscatedName("client.Ub")
	public boolean field942 = false;

	@ObfuscatedName("client.kc")
	public String[] field956 = new String[500];

	@ObfuscatedName("client.lc")
	public int[] field957 = new int[256];

	@ObfuscatedName("client.nc")
	public int[] field959 = new int[4000];

	@ObfuscatedName("client.oc")
	public int[] field960 = new int[4000];

	@ObfuscatedName("client.qc")
	public boolean field962 = false;

	@ObfuscatedName("client.yc")
	public boolean field969 = false;

	@ObfuscatedName("client.Bc")
	public class54[] field972 = new class54[4];

	@ObfuscatedName("client.Dc")
	public boolean field974 = false;

	@ObfuscatedName("client.Ec")
	public boolean field975 = false;

	@ObfuscatedName("client.Hc")
	public String field978 = "";

	@ObfuscatedName("client.Ic")
	public String field979 = "";

	@ObfuscatedName("client.Jc")
	public String field980 = "";

	@ObfuscatedName("client.Kc")
	public class41 field981 = new class41();

	@ObfuscatedName("client.Lc")
	public boolean field982 = false;

	@ObfuscatedName("client.Nc")
	public int field984 = 2048;

	@ObfuscatedName("client.Oc")
	public int field985 = 2047;

	@ObfuscatedName("client.Pc")
	public class26[] field986 = new class26[field984];

	@ObfuscatedName("client.Rc")
	public int[] field988 = new int[field984];

	@ObfuscatedName("client.Tc")
	public int[] field990 = new int[field984];

	@ObfuscatedName("client.Uc")
	public class37[] field991 = new class37[field984];

	@ObfuscatedName("client.Vc")
	public int field992 = -1;

	@ObfuscatedName("client.Wc")
	public int field993 = -1;

	@ObfuscatedName("client.Zc")
	public boolean field996 = false;

	@ObfuscatedName("client.bd")
	public boolean field998 = false;

	@ObfuscatedName("client.dd")
	public boolean[] field1000 = new boolean[5];

	@ObfuscatedName("client.gd")
	public int[] field1003 = new int[1000];

	@ObfuscatedName("client.hd")
	public int[] field1004 = new int[1000];

	@ObfuscatedName("client.pd")
	public int[] field1010 = new int[50];

	@ObfuscatedName("client.vd")
	public int[] field1013 = new int[100];

	@ObfuscatedName("client.wd")
	public String field1014 = "";

	@ObfuscatedName("client.zd")
	public int[] field1016 = new int[33];

	@ObfuscatedName("client.Bd")
	public int[] field1018 = new int[5];

	@ObfuscatedName("client.Nd")
	public int[] field1030 = new int[151];

	@ObfuscatedName("client.ae")
	public String[] field1041 = new String[100];

	@ObfuscatedName("client.be")
	public int[] field1042 = new int[33];

	@ObfuscatedName("client.ie")
	public int[] field1048 = new int[2000];

	@ObfuscatedName("client.pe")
	public int[] field1054 = new int[5];

	@ObfuscatedName("client.qe")
	public final int field1055 = 100;

	@ObfuscatedName("client.re")
	public int[] field1056 = new int[100];

	@ObfuscatedName("client.se")
	public boolean field1057 = false;

	@ObfuscatedName("client.ue")
	public int[] field1059 = new int[1000];

	@ObfuscatedName("client.ye")
	public boolean field1062 = false;

	@ObfuscatedName("client.Ae")
	public int[] field1063 = new int[50];

	@ObfuscatedName("client.De")
	public class34[] field1065 = new class34[20];

	@ObfuscatedName("client.Ee")
	public int field1066 = 0x332D25;

	@ObfuscatedName("client.Ge")
	public int[] field1067 = new int[500];

	@ObfuscatedName("client.He")
	public int[] field1068 = new int[500];

	@ObfuscatedName("client.Ie")
	public int[] field1069 = new int[500];

	@ObfuscatedName("client.Je")
	public int[] field1070 = new int[500];

	@ObfuscatedName("client.Ke")
	public byte[] field1071 = new byte[16384];

	@ObfuscatedName("client.Te")
	public int[][] field1079 = new int[104][104];

	@ObfuscatedName("client.Ue")
	public int[] field1080 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.We")
	public int[] field1081 = new int[151];

	@ObfuscatedName("client.Xe")
	public class41 field1082 = new class41();

	@ObfuscatedName("client.df")
	public int[] field1088 = new int[5];

	@ObfuscatedName("client.ef")
	public String[] field1089 = new String[100];

	@ObfuscatedName("client.kf")
	public int field1094 = 1;

	@ObfuscatedName("client.lf")
	public int field1095 = 0x766654;

	@ObfuscatedName("client.mf")
	public class34[] field1096 = new class34[1000];

	@ObfuscatedName("client.nf")
	public int field1097 = -1;

	@ObfuscatedName("client.of")
	public int[][] field1098 = new int[104][104];

	@ObfuscatedName("client.qf")
	public int field1100 = 0x23201B;

	@ObfuscatedName("client.sf")
	public int[] field1101 = new int[7];

	@ObfuscatedName("client.tf")
	public class34[] field1102 = new class34[50];

	@ObfuscatedName("client.uf")
	public class57 field1103 = new class57();

	@ObfuscatedName("client.wf")
	public String field1104 = "";

	@ObfuscatedName("client.xf")
	public boolean field1105 = false;

	@ObfuscatedName("client.Jf")
	public final int[] field1117 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Kf")
	public class37 field1118 = class37.method190(1);

	@ObfuscatedName("client.Lf")
	public int field1119 = 0x4D4233;

	@ObfuscatedName("client.Pf")
	public boolean field1123 = false;

	@ObfuscatedName("client.Qf")
	public int field1124 = 3;

	@ObfuscatedName("client.Uf")
	public int[][] field1127 = new int[104][104];

	@ObfuscatedName("client.Wf")
	public int field1129 = 2;

	@ObfuscatedName("client.Zf")
	public boolean field1132 = false;

	@ObfuscatedName("client.gg")
	public int field1139 = 128;

	@ObfuscatedName("client.ug")
	public class37 field1152 = class37.method190(1);

	@ObfuscatedName("client.Ag")
	public class41 field1158 = new class41();

	@ObfuscatedName("client.Eg")
	public String field1162 = "";

	@ObfuscatedName("client.Fg")
	public int[] field1163 = new int[50];

	@ObfuscatedName("client.Gg")
	public int[] field1164 = new int[5];

	@ObfuscatedName("client.Pg")
	public class34[] field1170 = new class34[8];

	@ObfuscatedName("client.Qg")
	public class37 field1171 = class37.method190(1);

	@ObfuscatedName("client.Tg")
	public int field1174 = -1;

	@ObfuscatedName("client.Vg")
	public class25[] field1176 = new class25[8192];

	@ObfuscatedName("client.Xg")
	public int[] field1178 = new int[8192];

	@ObfuscatedName("client.Yg")
	public int[] field1179 = new int[5];

	@ObfuscatedName("client.bh")
	public boolean field1182 = true;

	@ObfuscatedName("client.ch")
	public long[] field1183 = new long[100];

	@ObfuscatedName("client.dh")
	public boolean field1184 = false;

	@ObfuscatedName("client.eh")
	public String field1185 = "";

	@ObfuscatedName("client.fh")
	public String field1186 = "";

	@ObfuscatedName("client.lh")
	public class34[] field1191 = new class34[20];

	@ObfuscatedName("client.mh")
	public int field1192 = -1;

	@ObfuscatedName("client.xh")
	public boolean field1203 = false;

	@ObfuscatedName("client.yh")
	public String field1204 = "127.0.0.1";

	@ObfuscatedName("client.Kb")
	public static BigInteger field933 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Yc")
	public static String field995 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.yd")
	public static BigInteger field1015 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.vg")
	public static final int[][] field1153 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.ed")
	public int field1001;

	@ObfuscatedName("client.fd")
	public int field1002;

	@ObfuscatedName("client.kd")
	public int field1005;

	@ObfuscatedName("client.ld")
	public int field1006;

	@ObfuscatedName("client.md")
	public int field1007;

	@ObfuscatedName("client.nd")
	public int field1008;

	@ObfuscatedName("client.od")
	public int field1009;

	@ObfuscatedName("client.qd")
	public int field1011;

	@ObfuscatedName("client.ud")
	public int field1012;

	@ObfuscatedName("client.Cd")
	public int field1019;

	@ObfuscatedName("client.Dd")
	public int field1020;

	@ObfuscatedName("client.Ed")
	public int field1021;

	@ObfuscatedName("client.Fd")
	public int field1022;

	@ObfuscatedName("client.Gd")
	public int field1023;

	@ObfuscatedName("client.Od")
	public int field1031;

	@ObfuscatedName("client.Pd")
	public int field1032;

	@ObfuscatedName("client.Qd")
	public int field1033;

	@ObfuscatedName("client.Rd")
	public int field1034;

	@ObfuscatedName("client.Sd")
	public int field1035;

	@ObfuscatedName("client.Ud")
	public static int field1036;

	@ObfuscatedName("client.Wd")
	public int field1037;

	@ObfuscatedName("client.Xd")
	public int field1038;

	@ObfuscatedName("client.Yd")
	public int field1039;

	@ObfuscatedName("client.Zd")
	public int field1040;

	@ObfuscatedName("client.ce")
	public int field1043;

	@ObfuscatedName("client.de")
	public int field1044;

	@ObfuscatedName("client.ee")
	public int field1045;

	@ObfuscatedName("client.fe")
	public int field1046;

	@ObfuscatedName("client.he")
	public int field1047;

	@ObfuscatedName("client.je")
	public int field1049;

	@ObfuscatedName("client.te")
	public int field1058;

	@ObfuscatedName("client.Le")
	public int field1072;

	@ObfuscatedName("client.Me")
	public int field1073;

	@ObfuscatedName("client.Pe")
	public int field1075;

	@ObfuscatedName("client.Qe")
	public int field1076;

	@ObfuscatedName("client.Re")
	public int field1077;

	@ObfuscatedName("client.Se")
	public int field1078;

	@ObfuscatedName("client.Ye")
	public int field1083;

	@ObfuscatedName("client.Ze")
	public int field1084;

	@ObfuscatedName("client.af")
	public int field1085;

	@ObfuscatedName("client.bf")
	public int field1086;

	@ObfuscatedName("client.cf")
	public int field1087;

	@ObfuscatedName("client.ff")
	public int field1090;

	@ObfuscatedName("client.jf")
	public int field1093;

	@ObfuscatedName("client.If")
	public int field1116;

	@ObfuscatedName("client.Mf")
	public int field1120;

	@ObfuscatedName("client.Nf")
	public int field1121;

	@ObfuscatedName("client.Of")
	public int field1122;

	@ObfuscatedName("client.Sf")
	public int field1125;

	@ObfuscatedName("client.Tf")
	public int field1126;

	@ObfuscatedName("client.Vf")
	public int field1128;

	@ObfuscatedName("client.Yf")
	public int field1131;

	@ObfuscatedName("client.ag")
	public int field1133;

	@ObfuscatedName("client.bg")
	public int field1134;

	@ObfuscatedName("client.cg")
	public int field1135;

	@ObfuscatedName("client.dg")
	public int field1136;

	@ObfuscatedName("client.eg")
	public int field1137;

	@ObfuscatedName("client.fg")
	public int field1138;

	@ObfuscatedName("client.hg")
	public int field1140;

	@ObfuscatedName("client.ig")
	public int field1141;

	@ObfuscatedName("client.jg")
	public int field1142;

	@ObfuscatedName("client.kg")
	public int field1143;

	@ObfuscatedName("client.lg")
	public int field1144;

	@ObfuscatedName("client.mg")
	public int field1145;

	@ObfuscatedName("client.og")
	public int field1146;

	@ObfuscatedName("client.pg")
	public int field1147;

	@ObfuscatedName("client.qg")
	public int field1148;

	@ObfuscatedName("client.zg")
	public int field1157;

	@ObfuscatedName("client.Ig")
	public int field1165;

	@ObfuscatedName("client.Mg")
	public int field1167;

	@ObfuscatedName("client.Wg")
	public int field1177;

	@ObfuscatedName("client.Zg")
	public int field1180;

	@ObfuscatedName("client.ah")
	public int field1181;

	@ObfuscatedName("client.gh")
	public int field1187;

	@ObfuscatedName("client.hh")
	public int field1188;

	@ObfuscatedName("client.E")
	public int field881;

	@ObfuscatedName("client.F")
	public int field882;

	@ObfuscatedName("client.G")
	public int field883;

	@ObfuscatedName("client.J")
	public int field885;

	@ObfuscatedName("client.Fb")
	public int field928;

	@ObfuscatedName("client.Pb")
	public int field937;

	@ObfuscatedName("client.Qb")
	public int field938;

	@ObfuscatedName("client.Tb")
	public int field941;

	@ObfuscatedName("client.Wb")
	public int field943;

	@ObfuscatedName("client.Xb")
	public int field944;

	@ObfuscatedName("client.Yb")
	public int field945;

	@ObfuscatedName("client.mc")
	public int field958;

	@ObfuscatedName("client.zc")
	public int field970;

	@ObfuscatedName("client.Ac")
	public int field971;

	@ObfuscatedName("client.Cc")
	public int field973;

	@ObfuscatedName("client.Gc")
	public int field977;

	@ObfuscatedName("client.Mc")
	public int field983;

	@ObfuscatedName("client.Qc")
	public int field987;

	@ObfuscatedName("client.Sc")
	public int field989;

	@ObfuscatedName("client.Xc")
	public static int field994;

	@ObfuscatedName("client.ad")
	public int field997;

	@ObfuscatedName("client.Ce")
	public long field1064;

	@ObfuscatedName("client.Fc")
	public class18 field976;

	@ObfuscatedName("client.Ob")
	public class26 field936;

	@ObfuscatedName("client.ke")
	public class34 field1050;

	@ObfuscatedName("client.le")
	public class34 field1051;

	@ObfuscatedName("client.me")
	public class34 field1052;

	@ObfuscatedName("client.ne")
	public class34 field1053;

	@ObfuscatedName("client.we")
	public class34 field1060;

	@ObfuscatedName("client.xe")
	public class34 field1061;

	@ObfuscatedName("client.Hf")
	public class34 field1115;

	@ObfuscatedName("client.Lg")
	public class34 field1166;

	@ObfuscatedName("client.Db")
	public class34 field926;

	@ObfuscatedName("client.Eb")
	public class34 field927;

	@ObfuscatedName("client.gf")
	public class35 field1091;

	@ObfuscatedName("client.hf")
	public class35 field1092;

	@ObfuscatedName("client.Bg")
	public class35 field1159;

	@ObfuscatedName("client.Cg")
	public class35 field1160;

	@ObfuscatedName("client.Dg")
	public class35 field1161;

	@ObfuscatedName("client.Rg")
	public class35 field1172;

	@ObfuscatedName("client.Sg")
	public class35 field1173;

	@ObfuscatedName("client.jh")
	public class35 field1189;

	@ObfuscatedName("client.kh")
	public class35 field1190;

	@ObfuscatedName("client.P")
	public class35 field891;

	@ObfuscatedName("client.Q")
	public class35 field892;

	@ObfuscatedName("client.R")
	public class35 field893;

	@ObfuscatedName("client.S")
	public class35 field894;

	@ObfuscatedName("client.T")
	public class35 field895;

	@ObfuscatedName("client.Hb")
	public class35 field930;

	@ObfuscatedName("client.Ib")
	public class35 field931;

	@ObfuscatedName("client.Jb")
	public class35 field932;

	@ObfuscatedName("client.rc")
	public class35 field963;

	@ObfuscatedName("client.sc")
	public class35 field964;

	@ObfuscatedName("client.tc")
	public class35 field965;

	@ObfuscatedName("client.uc")
	public class35 field966;

	@ObfuscatedName("client.vc")
	public class35 field967;

	@ObfuscatedName("client.yf")
	public class43 field1106;

	@ObfuscatedName("client.zf")
	public class43 field1107;

	@ObfuscatedName("client.Af")
	public class43 field1108;

	@ObfuscatedName("client.Bf")
	public class43 field1109;

	@ObfuscatedName("client.Cf")
	public class43 field1110;

	@ObfuscatedName("client.Df")
	public class43 field1111;

	@ObfuscatedName("client.Ef")
	public class43 field1112;

	@ObfuscatedName("client.Ff")
	public class43 field1113;

	@ObfuscatedName("client.Gf")
	public class43 field1114;

	@ObfuscatedName("client.wg")
	public class43 field1154;

	@ObfuscatedName("client.xg")
	public class43 field1155;

	@ObfuscatedName("client.yg")
	public class43 field1156;

	@ObfuscatedName("client.nh")
	public class43 field1193;

	@ObfuscatedName("client.oh")
	public class43 field1194;

	@ObfuscatedName("client.ph")
	public class43 field1195;

	@ObfuscatedName("client.qh")
	public class43 field1196;

	@ObfuscatedName("client.rh")
	public class43 field1197;

	@ObfuscatedName("client.sh")
	public class43 field1198;

	@ObfuscatedName("client.th")
	public class43 field1199;

	@ObfuscatedName("client.uh")
	public class43 field1200;

	@ObfuscatedName("client.vh")
	public class43 field1201;

	@ObfuscatedName("client.wh")
	public class43 field1202;

	@ObfuscatedName("client.K")
	public class43 field886;

	@ObfuscatedName("client.L")
	public class43 field887;

	@ObfuscatedName("client.M")
	public class43 field888;

	@ObfuscatedName("client.N")
	public class43 field889;

	@ObfuscatedName("client.O")
	public class46 field890;

	@ObfuscatedName("client.wc")
	public class47 field968;

	@ObfuscatedName("client.cd")
	public class4 field999;

	@ObfuscatedName("client.Zb")
	public String field946;

	@ObfuscatedName("client.Ad")
	public static boolean field1017;

	@ObfuscatedName("client.Hd")
	public int[] field1024;

	@ObfuscatedName("client.Id")
	public int[] field1025;

	@ObfuscatedName("client.Jd")
	public int[] field1026;

	@ObfuscatedName("client.Kd")
	public int[] field1027;

	@ObfuscatedName("client.Ld")
	public int[] field1028;

	@ObfuscatedName("client.Md")
	public int[] field1029;

	@ObfuscatedName("client.Oe")
	public int[] field1074;

	@ObfuscatedName("client.rg")
	public int[] field1149;

	@ObfuscatedName("client.sg")
	public int[] field1150;

	@ObfuscatedName("client.tg")
	public int[] field1151;

	@ObfuscatedName("client.Ng")
	public int[] field1168;

	@ObfuscatedName("client.Og")
	public int[] field1169;

	@ObfuscatedName("client.Xf")
	public class35[] field1130;

	@ObfuscatedName("client.pf")
	public byte[][] field1099;

	@ObfuscatedName("client.Ug")
	public byte[][] field1175;

	@ObfuscatedName("client.W")
	public byte[][][] field898;

	@ObfuscatedName("client.pc")
	public int[][][] field961;

	@ObfuscatedName("client.c(Z)V")
	public final void method340() {
		short var1 = 256;

		if (field1147 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1147 > 768) {
					field1026[var2] = method437(field1027[var2], 1024 - field1147, field1028[var2]);
				} else if (field1147 > 256) {
					field1026[var2] = field1028[var2];
				} else {
					field1026[var2] = method437(field1028[var2], 256 - field1147, field1027[var2]);
				}
			}
		} else if (field1148 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1148 > 768) {
					field1026[var3] = method437(field1027[var3], 1024 - field1148, field1029[var3]);
				} else if (field1148 > 256) {
					field1026[var3] = field1029[var3];
				} else {
					field1026[var3] = method437(field1029[var3], 256 - field1148, field1027[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1026[var4] = field1027[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1109.field577[var5] = field926.field512[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field957[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1024[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1026[var12];
					int var15 = field1109.field577[var7];
					field1109.field577[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1109.method228(0, field8, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1110.field577[var16] = field927.field512[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field957[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1024[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1026[var23];
					int var26 = field1110.field577[var18];
					field1110.field577[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1110.method228(661, field8, 0);
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method341(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		int var6 = arg2;
		if (arg2 < 3 && (field898[1][var4][var5] & 0x2) == 2) {
			var6 = arg2 + 1;
		}

		int var7 = arg0 & 0x7F;
		int var8 = arg1 & 0x7F;
		int var9 = (128 - var7) * field961[var6][var4][var5] + field961[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field961[var6][var4][var5 + 1] + field961[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method342(int arg0, int arg1) {
		class41 var3 = field908[field958][arg0][arg1];
		if (var3 == null) {
			field976.method73(field958, arg0, arg1);
		} else {
			int var4 = -99999999;
			class22 var5 = null;
			for (class22 var6 = (class22) var3.method220(); var6 != null; var6 = (class22) var3.method222()) {
				class52 var7 = class52.method265(var6.field264);
				int var8 = var7.field735;
				if (var7.field734) {
					var8 *= 10;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method218(var5);
			int var9 = -1;
			int var10 = -1;
			for (class22 var11 = (class22) var3.method220(); var11 != null; var11 = (class22) var3.method222()) {
				if (var5.field264 != var11.field264 && var9 == -1) {
					var9 = var11.field264;
				}

				if (var5.field264 != var11.field264 && var11.field264 != var9 && var10 == -1) {
					var10 = var11.field264;
				}
			}

			class31 var12 = null;
			if (var9 != -1) {
				var12 = class52.method265(var9).method268();
			}

			class31 var13 = null;
			if (var10 != -1) {
				var13 = class52.method265(var10).method268();
			}

			int var14 = (arg1 << 7) + arg0 + 0x60000000;
			class52 var15 = class52.method265(var5.field264);
			field976.method57(arg0, method341(arg0 * 128 + 64, arg1 * 128 + 64, field958), var15.method268(), var12, var14, var13, arg1, field958);
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method343() {
		int var1 = 3;
		if (field1137 < 310) {
			int var2 = field1134 >> 7;
			int var3 = field1136 >> 7;
			int var4 = field936.field265 >> 7;
			int var5 = field936.field266 >> 7;

			if ((field898[field958][var2][var3] & 0x4) != 0) {
				var1 = field958;
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

					if ((field898[field958][var2][var3] & 0x4) != 0) {
						var1 = field958;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field898[field958][var2][var3] & 0x4) != 0) {
							var1 = field958;
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

					if ((field898[field958][var2][var3] & 0x4) != 0) {
						var1 = field958;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field898[field958][var2][var3] & 0x4) != 0) {
							var1 = field958;
						}
					}
				}
			}
		}

		if ((field898[field958][field936.field265 >> 7][field936.field266 >> 7] & 0x4) != 0) {
			var1 = field958;
		}

		return var1;
	}

	@ObfuscatedName("client.e(I)I")
	public final int method344() {
		int var1 = method341(field1134, field1136, field958);
		if (var1 - field1135 < 800 && (field898[field958][field1134 >> 7][field1136 >> 7] & 0x4) != 0) {
			return field958;
		}

		return 3;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method345() {
		if (field948 == 0 && field943 == 0) {
			field956[field947] = "Walk here";
			field1069[field947] = 404;
			field1067[field947] = field15;
			field1068[field947] = field16;
			field947++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field473; var2++) {
			int var3 = class31.field474[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field976.method78(field958, var4, var5, var3) >= 0) {
					class50 var8 = class50.method253(var7);
					if (field948 == 1) {
						field956[field947] = "Use " + field952 + " with @cya@" + var8.field656;
						field1069[field947] = 174;
						field1070[field947] = var3;
						field1067[field947] = var4;
						field1068[field947] = var5;
						field947++;
					} else if (field943 != 1) {
						if (var8.field672 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field672[var9] != null) {
									field956[field947] = var8.field672[var9] + " @cya@" + var8.field656;

									if (var9 == 0) {
										field1069[field947] = 447;
									}

									if (var9 == 1) {
										field1069[field947] = 846;
									}

									if (var9 == 2) {
										field1069[field947] = 34;
									}

									if (var9 == 3) {
										field1069[field947] = 310;
									}

									if (var9 == 4) {
										field1069[field947] = 647;
									}

									field1070[field947] = var3;
									field1067[field947] = var4;
									field1068[field947] = var5;
									field947++;
								}
							}
						}

						field956[field947] = "Examine @cya@" + var8.field656;
						field1069[field947] = 1419;
						field1070[field947] = var3;
						field1067[field947] = var4;
						field1068[field947] = var5;
						field947++;
					} else if ((field945 & 0x4) == 4) {
						field956[field947] = field946 + " @cya@" + var8.field656;
						field1069[field947] = 792;
						field1070[field947] = var3;
						field1067[field947] = var4;
						field1068[field947] = var5;
						field947++;
					}
				}

				if (var6 == 1) {
					class25 var10 = field1176[var7];
					if (var10.field317.field696 == 1 && (var10.field265 & 0x7F) == 0x40 && (var10.field266 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1177; var11++) {
							class25 var12 = field1176[field1178[var11]];
							if (var12 != null && var10 != var12 && var12.field317.field696 == 1 && var10.field265 == var12.field265 && var10.field266 == var12.field266) {
								method416(var5, field1178[var11], var4, var12.field317);
							}
						}
					}

					method416(var5, var7, var4, var10.field317);
				}

				if (var6 == 0) {
					class26 var13 = field986[var7];
					if ((var13.field265 & 0x7F) == 0x40 && (var13.field266 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1177; var14++) {
							class25 var15 = field1176[field1178[var14]];
							if (var15 != null && var15.field317.field696 == 1 && var13.field265 == var15.field265 && var13.field266 == var15.field266) {
								method416(var5, field1178[var14], var4, var15.field317);
							}
						}

						for (int var16 = 0; var16 < field987; var16++) {
							class26 var17 = field986[field988[var16]];
							if (var17 != null && var13 != var17 && var13.field265 == var17.field265 && var13.field266 == var17.field266) {
								method436(var17, field988[var16], var5, var4);
							}
						}
					}

					method436(var13, var7, var5, var4);
				}

				if (var6 == 3) {
					class41 var18 = field908[field958][var4][var5];
					if (var18 != null) {
						for (class22 var19 = (class22) var18.method221(); var19 != null; var19 = (class22) var18.method223()) {
							class52 var20 = class52.method265(var19.field264);
							if (field948 == 1) {
								field956[field947] = "Use " + field952 + " with @lre@" + var20.field723;
								field1069[field947] = 652;
								field1070[field947] = var19.field264;
								field1067[field947] = var4;
								field1068[field947] = var5;
								field947++;
							} else if (field943 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field737 != null && var20.field737[var21] != null) {
										field956[field947] = var20.field737[var21] + " @lre@" + var20.field723;

										if (var21 == 0) {
											field1069[field947] = 533;
										}

										if (var21 == 1) {
											field1069[field947] = 947;
										}

										if (var21 == 2) {
											field1069[field947] = 705;
										}

										if (var21 == 3) {
											field1069[field947] = 912;
										}

										if (var21 == 4) {
											field1069[field947] = 603;
										}

										field1070[field947] = var19.field264;
										field1067[field947] = var4;
										field1068[field947] = var5;
										field947++;
									} else if (var21 == 2) {
										field956[field947] = "Take @lre@" + var20.field723;
										field1069[field947] = 705;
										field1070[field947] = var19.field264;
										field1067[field947] = var4;
										field1068[field947] = var5;
										field947++;
									}
								}

								field956[field947] = "Examine @lre@" + var20.field723;
								field1069[field947] = 1585;
								field1070[field947] = var19.field264;
								field1067[field947] = var4;
								field1068[field947] = var5;
								field947++;
							} else if ((field945 & 0x1) == 1) {
								field956[field947] = field946 + " @lre@" + var20.field723;
								field1069[field947] = 926;
								field1070[field947] = var19.field264;
								field1067[field947] = var4;
								field1068[field947] = var5;
								field947++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method346() {
		if (field1046 == 1) {
			field1170[field1045 / 100].method169(field1044 - 8 - 11, field1043 - 8 - 8);
		}

		if (field1046 == 2) {
			field1170[field1045 / 100 + 4].method169(field1044 - 8 - 11, field1043 - 8 - 8);
		}

		if (field1174 != -1) {
			method378(class57.field777[field1174], 0, 0, 0);
		}

		int var1 = (field936.field265 >> 7) + field1075;
		int var2 = (field936.field266 >> 7) + field1076;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field970 = (var2 - 3520) / 8 + 1;
		} else {
			field970 = 0;
		}

		if (!field1062) {
			method405();
			method440();
		} else if (field910 == 0) {
			method401();
		}

		if (field941 == 1) {
			field1065[1].method169(296, 5);
		}

		if (field970 > 0) {
			field1065[0].method169(296, 472);
			field916.method182(329, 0xFFFF00, 484, "Level: " + field970);
		} else if (field906) {
			int var3 = 0xFFFF00;
			Runtime var4 = Runtime.getRuntime();
			long var5 = var4.totalMemory();
			long var7 = var4.freeMemory();
			if (!signlink.sunjava && var5 - var7 > 0x2000000L && field994 > field1036 + 500) {
				method382();
				var4.gc();
				int var9 = 0xFF0000;
				field1036 = field994;
			}
		}

		if (field973 != 0) {
			int var10 = field973 / 50;
			int var11 = var10 / 60;
			var10 %= 60;
			if (var10 < 10) {
				field916.method182(329, 0xFFFF00, 256, "System update in: " + var11 + ":0" + var10);
			} else {
				field916.method182(329, 0xFFFF00, 256, "System update in: " + var11 + ":" + var10);
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method347() {
		for (class28 var1 = (class28) field900.method220(); var1 != null; var1 = (class28) field900.method222()) {
			if (field958 != var1.field365 || var1.field371) {
				var1.method104();
			} else if (field994 >= var1.field364) {
				var1.method115(field977);

				if (var1.field371) {
					var1.method104();
				} else {
					field976.method61(null, var1.field368, var1.field367, 0, var1.field366, var1.field365, 0, var1, 60, -1);
				}
			}
		}
	}

	public final int getjinglelen() {
		return signlink.jinglelen;
	}

	@ObfuscatedName("client.a(ILec;I)I")
	public final int method348(int arg0, class57 arg1) {
		if (arg1.field791 == null || arg0 >= arg1.field791.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field791[arg0];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1163[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1063[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1010[var3[var5++]];
				}

				if (var6 == 4) {
					class57 var7 = class57.field777[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field778.length; var9++) {
						if (var7.field778[var9] == var8) {
							var4 += var7.field779[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field1048[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field920[field1063[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1048[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field936.field324;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1063[var10];
					}
				}

				if (var6 == 10) {
					class57 var11 = class57.field777[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field778.length; var13++) {
						if (var11.field778[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field1167;
				}

				if (var6 == 12) {
					var4 += field1125;
				}
			}
		} catch (Exception var14) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(IZLjava/lang/String;ILjava/lang/String;)Lub;")
	public final class47 method349(int arg0, String arg1, int arg2, String arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg3);
		if (var6 != null) {
			field884.reset();
			field884.update(var6);
			int var7 = (int) field884.getValue();
			if (arg0 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class47(var6);
		}

		while (var6 == null) {
			method13(arg2, "Requesting " + arg1);

			try {
				int var9 = 0;
				DataInputStream var10 = method428(arg3 + arg0);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				class37 var12 = new class37(var11);
				var12.field537 = 3;
				int var13 = var12.method205() + 6;
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
						method13(arg2, "Loading " + arg1 + " - " + var17 + "%");
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

		signlink.cachesave(arg3, var6);
		return new class47(var6);
	}

	@ObfuscatedName("client.i(I)V")
	public final void method350() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1057) {
			field1123 = false;
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

		if (field1132) {
			field1123 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1184) {
			field1123 = false;
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

	@ObfuscatedName("client.j(I)Z")
	public final boolean method351() {
		if (field999 == null) {
			return false;
		}

		try {
			int var1 = field999.method30();
			if (var1 == 0) {
				return false;
			}

			if (field1038 == -1) {
				field999.method31(field1118.field536, 0, 1);
				field1038 = field1118.field536[0] & 0xFF;
				if (field890 != null) {
					field1038 = field1038 - field890.method238() & 0xFF;
				}

				field1037 = class53.field752[field1038];
				var1--;
			}

			if (field1037 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field999.method31(field1118.field536, 0, 1);
				field1037 = field1118.field536[0] & 0xFF;
				var1--;
			}

			if (field1037 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field999.method31(field1118.field536, 0, 2);
				field1118.field537 = 0;
				field1037 = field1118.method203();
				var1 -= 2;
			}

			if (var1 < field1037) {
				return false;
			}

			field1118.field537 = 0;
			field999.method31(field1118.field536, 0, field1037);
			field1039 = 0;
			field1122 = field1121;
			field1121 = field1120;
			field1120 = field1038;

			if (field1038 == 55) {
				int var2 = field1118.method201();
				int var3 = field1118.method201();
				int var4 = field1118.method203();
				int var5 = field1118.method203();
				int var6 = -1;
				for (int var7 = 0; var7 < field1074.length; var7++) {
					if ((var2 << 8) + var3 == field1074[var7]) {
						var6 = var7;
					}
				}

				if (var6 != -1) {
					if (field1175[var6] == null || field1175[var6].length != var5) {
						field1175[var6] = new byte[var5];
					}

					field1118.method210(field1175[var6], field1037 - 6, var4);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 74) {
				field974 = false;
				field998 = true;
				field1162 = "";
				field897 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 1) {
				int var8 = field1118.method201();
				int var9 = field1118.method201();
				int var10 = field1118.method201();
				int var11 = field1118.method201();
				field1000[var8] = true;
				field1088[var8] = var9;
				field1054[var8] = var10;
				field1164[var8] = var11;
				field1179[var8] = 0;
				field1038 = -1;
				return true;
			}

			if (field1038 == 86) {
				if (field1124 == 12) {
					field982 = true;
				}

				field1125 = field1118.method203();
				field1038 = -1;
				return true;
			}

			if (field1038 == 199) {
				int var12 = field1118.method203();
				int var13 = field1118.method203();
				class51 var14 = class51.method259(var13);
				class57.field777[var12].field823 = var14.method262();
				field1038 = -1;
				return true;
			}

			if (field1038 == 78) {
				int var15 = field1118.method201();
				int var16 = field1118.method201();
				int var17 = -1;
				for (int var18 = 0; var18 < field1074.length; var18++) {
					if ((var15 << 8) + var16 == field1074[var18]) {
						var17 = var18;
					}
				}

				if (var17 != -1) {
					signlink.cachesave("l" + var15 + "_" + var16, field1099[var17]);
					field1181 = 1;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 44 || field1038 == 19 || field1038 == 114 || field1038 == 17 || field1038 == 144 || field1038 == 96 || field1038 == 217 || field1038 == 171 || field1038 == 140) {
				method353(field1118, field1038);
				field1038 = -1;
				return true;
			}

			if (field1038 == 136) {
				int var19 = field1118.method203();
				int var20 = field1118.method203();
				int var21 = var20 >> 10 & 0x1F;
				int var22 = var20 >> 5 & 0x1F;
				int var23 = var20 & 0x1F;
				class57.field777[var19].field818 = (var23 << 3) + (var21 << 19) + (var22 << 11);
				field1038 = -1;
				return true;
			}

			if (field1038 == 187) {
				int var24 = field1118.method203();
				int var25 = field1118.method203();
				class57.field777[var24].field823 = new class31(var25);
				field1038 = -1;
				return true;
			}

			if (field1038 == 168) {
				method362(field1118, field1037);

				if (field1181 == 1) {
					field1181 = 2;
					class3.field26 = field958;
					method402();
				}

				if (field906 && field1181 == 2 && class3.field26 != field958) {
					field888.method227();
					field916.method182(151, 0, 257, "Loading - please wait.");
					field916.method182(150, 0xFFFFFF, 256, "Loading - please wait.");
					field888.method228(8, field8, 11);
					class3.field26 = field958;
					method402();
				}

				if (field958 != field1097 && field1181 == 2) {
					field1097 = field958;
					method432(field958);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 76) {
				field922 = false;

				for (int var26 = 0; var26 < 5; var26++) {
					field1000[var26] = false;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 200) {
				field1124 = field1118.method201();
				field982 = true;
				field1203 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 34) {
				field922 = true;
				field1083 = field1118.method201();
				field1084 = field1118.method201();
				field1085 = field1118.method203();
				field1086 = field1118.method201();
				field1087 = field1118.method201();
				if (field1087 >= 100) {
					field1134 = field1083 * 128 + 64;
					field1136 = field1084 * 128 + 64;
					field1135 = method341(field1083, field1084, field958) - field1085;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 227) {
				int var27 = field1118.method203();
				int var28 = field1118.method203();
				if (field937 == var27 && field938 == var28 && field1181 != 0) {
					field1038 = -1;
					return true;
				}

				field937 = var27;
				field938 = var28;
				field1075 = (field937 - 6) * 8;
				field1076 = (field938 - 6) * 8;
				field1181 = 1;
				field888.method227();
				field916.method182(151, 0, 257, "Loading - please wait.");
				field916.method182(150, 0xFFFFFF, 256, "Loading - please wait.");
				field888.method228(8, field8, 11);
				signlink.looprate(5);
				int var29 = (field1037 - 2) / 10;
				field1175 = new byte[var29][];
				field1099 = new byte[var29][];
				field1074 = new int[var29];
				field1171.method192(188);
				field1171.method193(0);
				int var30 = 0;
				for (int var31 = 0; var31 < var29; var31++) {
					int var32 = field1118.method201();
					int var33 = field1118.method201();
					int var34 = field1118.method206();
					int var35 = field1118.method206();
					field1074[var31] = (var32 << 8) + var33;

					if (var34 != 0) {
						byte[] var36 = signlink.cacheload("m" + var32 + "_" + var33);
						if (var36 != null) {
							field884.reset();
							field884.update(var36);

							if ((int) field884.getValue() != var34) {
								var36 = null;
							}
						}

						if (var36 == null) {
							field1181 = 0;
							field1171.method193(0);
							field1171.method193(var32);
							field1171.method193(var33);
							var30 += 3;
						} else {
							field1175[var31] = var36;
						}
					}

					if (var35 != 0) {
						byte[] var37 = signlink.cacheload("l" + var32 + "_" + var33);
						if (var37 != null) {
							field884.reset();
							field884.update(var37);

							if ((int) field884.getValue() != var35) {
								var37 = null;
							}
						}

						if (var37 == null) {
							field1181 = 0;
							field1171.method193(1);
							field1171.method193(var32);
							field1171.method193(var33);
							var30 += 3;
						} else {
							field1099[var31] = var37;
						}
					}
				}

				field1171.method200(var30);
				signlink.looprate(100);
				int var38 = field1075 - field1077;
				int var39 = field1076 - field1078;
				field1077 = field1075;
				field1078 = field1076;

				for (int var40 = 0; var40 < 8192; var40++) {
					class25 var41 = field1176[var40];
					if (var41 != null) {
						for (int var42 = 0; var42 < 10; var42++) {
							var41.field313[var42] -= var38;
							var41.field314[var42] -= var39;
						}

						var41.field265 -= var38 * 128;
						var41.field266 -= var39 * 128;
					}
				}

				for (int var43 = 0; var43 < field984; var43++) {
					class26 var44 = field986[var43];
					if (var44 != null) {
						for (int var45 = 0; var45 < 10; var45++) {
							var44.field313[var45] -= var38;
							var44.field314[var45] -= var39;
						}

						var44.field265 -= var38 * 128;
						var44.field266 -= var39 * 128;
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
								field908[var56][var52][var53] = field908[var56][var54][var55];
							} else {
								field908[var56][var52][var53] = null;
							}
						}
					}
				}

				for (class38 var57 = (class38) field981.method220(); var57 != null; var57 = (class38) field981.method222()) {
					var57.field550 -= var38;
					var57.field551 -= var39;
					if (var57.field550 < 0 || var57.field551 < 0 || var57.field550 >= 104 || var57.field551 >= 104) {
						var57.method104();
					}
				}

				field922 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 197) {
				field982 = true;
				int var58 = field1118.method203();
				byte var59 = field1118.method202();
				if (field1048[var58] != var59) {
					field1048[var58] = var59;
					method363(var58);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 141) {
				for (int var60 = 0; var60 < field986.length; var60++) {
					if (field986[var60] != null) {
						field986[var60].field292 = -1;
					}
				}

				for (int var61 = 0; var61 < field1176.length; var61++) {
					if (field1176[var61] != null) {
						field1176[var61].field292 = -1;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 38) {
				int var62 = field1118.method203();
				int var63 = field1118.method203();
				class57.field777[var62].field825 = var63;
				field1038 = -1;
				return true;
			}

			if (field1038 == 134) {
				field1072 = field1118.method201();
				field1073 = field1118.method201();

				while (field1118.field537 < field1037) {
					int var64 = field1118.method201();
					method353(field1118, var64);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 204) {
				field1072 = field1118.method201();
				field1073 = field1118.method201();
				for (int var65 = field1072; var65 < field1072 + 8; var65++) {
					for (int var66 = field1073; var66 < field1073 + 8; var66++) {
						if (field908[field958][var65][var66] != null) {
							field908[field958][var65][var66] = null;
							method342(var65, var66);
						}
					}
				}

				for (class38 var67 = (class38) field981.method220(); var67 != null; var67 = (class38) field981.method222()) {
					if (var67.field550 >= field1072 && var67.field550 < field1072 + 8 && var67.field551 >= field1073 && var67.field551 < field1073 + 8 && field958 == var67.field548) {
						method435(var67.field548, var67.field557, var67.field551, var67.field550, var67.field549, var67.field555, var67.field556);
						var67.method104();
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 163) {
				field1072 = field1118.method201();
				field1073 = field1118.method201();
				field1038 = -1;
				return true;
			}

			if (field1038 == 157) {
				int var68 = field1118.method201();
				int var69 = field1118.method201();
				int var70 = field1118.method203();
				int var71 = field1118.method203();
				int var72 = -1;
				for (int var73 = 0; var73 < field1074.length; var73++) {
					if ((var68 << 8) + var69 == field1074[var73]) {
						var72 = var73;
					}
				}

				if (var72 != -1) {
					if (field1099[var72] == null || field1099[var72].length != var71) {
						field1099[var72] = new byte[var71];
					}

					field1118.method210(field1099[var72], field1037 - 6, var70);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 24) {
				field973 = field1118.method203() * 30;
				field1038 = -1;
				return true;
			}

			if (field1038 == 131) {
				int var74 = field1118.method203();
				int var75 = field1118.method203();
				int var76 = field1118.method203();
				class57 var77 = class57.field777[var74];
				class31 var78 = var77.field823;
				if (var78 != null) {
					var78.method129(var75, var76);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 20) {
				long var79 = field1118.method207();
				int var81 = field1118.method206();
				boolean var82 = false;
				for (int var83 = 0; var83 < 100; var83++) {
					if (field1056[var83] == var81) {
						var82 = true;
						break;
					}
				}

				for (int var84 = 0; var84 < field1126; var84++) {
					if (field924[var84] == var79) {
						var82 = true;
						break;
					}
				}

				if (!var82) {
					field1056[field923] = var81;
					field923 = (field923 + 1) % 100;
					String var85 = class49.method249(field1037 - 12, field1118);
					var85 = class62.method312(var85);
					method400(var85, 3, class48.method246(class48.method244(var79)));
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 85) {
				field982 = true;
				int var86 = field1118.method201();
				int var87 = field1118.method206();
				int var88 = field1118.method201();
				field1010[var86] = var87;
				field1163[var86] = var88;
				field1063[var86] = 1;
				for (int var89 = 0; var89 < 98; var89++) {
					if (var87 >= field920[var89]) {
						field1063[var86] = var89 + 2;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 95) {
				field941 = field1118.method201();
				field1038 = -1;
				return true;
			}

			if (field1038 == 248) {
				int var90 = field1118.method203();
				boolean var91 = field1118.method201() == 1;
				class57.field777[var90].field797 = var91;
				field1038 = -1;
				return true;
			}

			if (field1038 == 253) {
				field982 = true;
				int var92 = field1118.method203();
				class57 var93 = class57.field777[var92];
				int var94 = field1118.method201();
				for (int var95 = 0; var95 < var94; var95++) {
					var93.field778[var95] = field1118.method203();
					int var96 = field1118.method201();
					if (var96 == 255) {
						var96 = field1118.method206();
					}

					var93.field779[var95] = var96;
				}

				for (int var97 = var94; var97 < var93.field778.length; var97++) {
					var93.field778[var97] = 0;
					var93.field779[var97] = 0;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 210) {
				int var98 = field1118.method203();
				int var99 = field1118.method201();
				field935[var99] = var98;
				field982 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 192) {
				method352();
				field1038 = -1;
				return false;
			}

			if (field1038 == 21) {
				if (field904) {
					signlink.jingle = field1118.method208();
					signlink.jinglelen = field1118.method203();
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 243) {
				int var100 = field1118.method203();
				class57 var101 = class57.field777[var100];
				for (int var102 = 0; var102 < var101.field778.length; var102++) {
					var101.field778[var102] = -1;
					var101.field778[var102] = 0;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 115) {
				int var103 = field1118.method203();
				method371(var103);

				if (field940 != -1) {
					field940 = -1;
					field897 = true;
				}

				if (field998) {
					field998 = false;
					field897 = true;
				}

				field1192 = var103;
				field982 = true;
				field1203 = true;
				field1174 = -1;
				field1105 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 183) {
				method364(field1118, field1037);
				field1038 = -1;
				return true;
			}

			if (field1038 == 87) {
				int var104 = field1118.method203();
				class57.field777[var104].field823 = field936.method112();
				field1038 = -1;
				return true;
			}

			if (field1038 == 137) {
				int var105 = field1118.method203();
				method371(var105);

				if (field1192 != -1) {
					field1192 = -1;
					field982 = true;
					field1203 = true;
				}

				if (field940 != -1) {
					field940 = -1;
					field897 = true;
				}

				if (field998) {
					field998 = false;
					field897 = true;
				}

				field1174 = var105;
				field1105 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 50) {
				int var106 = field1118.method201();
				int var107 = field1118.method201();
				int var108 = -1;
				for (int var109 = 0; var109 < field1074.length; var109++) {
					if ((var106 << 8) + var107 == field1074[var109]) {
						var108 = var109;
					}
				}

				if (var108 != -1) {
					signlink.cachesave("m" + var106 + "_" + var107, field1175[var108]);
					field1181 = 1;
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 213) {
				long var110 = field1118.method207();
				int var112 = field1118.method201();
				String var113 = class48.method246(class48.method244(var110));
				for (int var114 = 0; var114 < field883; var114++) {
					if (field1183[var114] == var110) {
						if (field1013[var114] != var112) {
							field1013[var114] = var112;
							field982 = true;

							if (var112 > 0) {
								method400(var113 + " has logged in.", 5, "");
							}

							if (var112 == 0) {
								method400(var113 + " has logged out.", 5, "");
							}
						}

						var113 = null;
						break;
					}
				}

				if (var113 != null && field883 < 100) {
					field1183[field883] = var110;
					field939[field883] = var113;
					field1013[field883] = var112;
					field883++;
					field982 = true;
				}

				boolean var115 = false;
				while (!var115) {
					var115 = true;
					for (int var116 = 0; var116 < field883 - 1; var116++) {
						if (field1013[var116] != field955 && field1013[var116 + 1] == field955 || field1013[var116] == 0 && field1013[var116 + 1] != 0) {
							int var117 = field1013[var116];
							field1013[var116] = field1013[var116 + 1];
							field1013[var116 + 1] = var117;
							String var118 = field939[var116];
							field939[var116] = field939[var116 + 1];
							field939[var116 + 1] = var118;
							long var119 = field1183[var116];
							field1183[var116] = field1183[var116 + 1];
							field1183[var116 + 1] = var119;
							field982 = true;
							var115 = false;
						}
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 212) {
				if (field1124 == 12) {
					field982 = true;
				}

				field1167 = field1118.method201();
				field1038 = -1;
				return true;
			}

			if (field1038 == 54) {
				int var121 = field1118.method203();
				method371(var121);

				if (field1192 != -1) {
					field1192 = -1;
					field982 = true;
					field1203 = true;
				}

				field940 = var121;
				field897 = true;
				field1174 = -1;
				field1105 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 98) {
				field1188 = field1118.method201();
				field997 = field1118.method201();
				field1047 = field1118.method201();
				field899 = true;
				field897 = true;
				field1038 = -1;
				return true;
			}

			if (field1038 == 16) {
				field982 = true;
				int var122 = field1118.method203();
				class57 var123 = class57.field777[var122];
				while (field1118.field537 < field1037) {
					int var124 = field1118.method201();
					int var125 = field1118.method203();
					int var126 = field1118.method201();
					if (var126 == 255) {
						var126 = field1118.method206();
					}

					if (var124 >= 0 && var124 < var123.field778.length) {
						var123.field778[var124] = var125;
						var123.field779[var124] = var126;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 128) {
				int var127 = field1118.method203();
				int var128 = field1118.method203();

				if (field940 != -1) {
					field940 = -1;
					field897 = true;
				}

				if (field998) {
					field998 = false;
					field897 = true;
				}

				field1174 = var127;
				field1192 = var128;
				field982 = true;
				field1203 = true;
				field1105 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 206) {
				String var129 = field1118.method208();
				if (!var129.equals(field909)) {
					field909 = var129;

					if (field904) {
						signlink.midi = var129;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 108) {
				field925 = field1118.method203();
				field1038 = -1;
				return true;
			}

			if (field1038 == 240) {
				if (field1192 != -1) {
					field1192 = -1;
					field982 = true;
					field1203 = true;
				}

				if (field940 != -1) {
					field940 = -1;
					field897 = true;
				}

				if (field998) {
					field998 = false;
					field897 = true;
				}

				field1174 = -1;
				field1105 = false;
				field1038 = -1;
				return true;
			}

			if (field1038 == 30) {
				field982 = true;
				int var130 = field1118.method203();
				int var131 = field1118.method206();
				if (field1048[var130] != var131) {
					field1048[var130] = var131;
					method363(var130);
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 93) {
				field922 = true;
				field1019 = field1118.method201();
				field1020 = field1118.method201();
				field1021 = field1118.method203();
				field1022 = field1118.method201();
				field1023 = field1118.method201();
				if (field1023 >= 100) {
					int var132 = field1019 * 128 + 64;
					int var133 = field1020 * 128 + 64;
					int var134 = method341(field1019, field1020, field958) - field1021;
					int var135 = var132 - field1134;
					int var136 = var134 - field1135;
					int var137 = var133 - field1136;
					int var138 = (int) Math.sqrt(var135 * var135 + var137 * var137);
					field1137 = (int) (Math.atan2(var136, var138) * 325.949D) & 0x7FF;
					field1138 = (int) (Math.atan2(var135, var137) * -325.949D) & 0x7FF;

					if (field1137 < 128) {
						field1137 = 128;
					}

					if (field1137 > 383) {
						field1137 = 383;
					}
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 138) {
				int var139 = field1118.method203();
				String var140 = field1118.method208();
				class57.field777[var139].field816 = var140;
				field1038 = -1;
				return true;
			}

			if (field1038 == 10) {
				int var141 = field1118.method203();
				int var142 = field1118.method203();
				int var143 = field1118.method203();
				class52 var144 = class52.method265(var142);
				class57.field777[var141].field823 = var144.method268();
				class57.field777[var141].field828 = var144.field728;
				class57.field777[var141].field829 = var144.field729;
				class57.field777[var141].field827 = var144.field727 * 100 / var143;
				field1038 = -1;
				return true;
			}

			if (field1038 == 164) {
				String var145 = field1118.method208();
				if (var145.endsWith(":tradereq:")) {
					String var146 = var145.substring(0, var145.indexOf(":"));
					long var147 = class48.method243(var146);
					boolean var149 = false;
					for (int var150 = 0; var150 < field1126; var150++) {
						if (field924[var150] == var147) {
							var149 = true;
							break;
						}
					}

					if (!var149) {
						method400("wishes to trade with you.", 4, var146);
					}
				} else {
					method400(var145, 0, "");
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 175) {
				field1126 = field1037 / 8;
				for (int var151 = 0; var151 < field1126; var151++) {
					field924[var151] = field1118.method207();
				}

				field1038 = -1;
				return true;
			}

			if (field1038 == 101) {
				int var152 = field1118.method203();
				int var153 = field1118.method204();
				int var154 = field1118.method204();
				class57 var155 = class57.field777[var152];
				var155.field789 = var153;
				var155.field790 = var154;
				field1038 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1038 + "," + field1037 + " - " + field1121 + "," + field1122);
			method352();
		} catch (IOException var159) {
			method359();
		} catch (Exception var160) {
			String var157 = "T2 - " + field1038 + "," + field1121 + "," + field1122 + " - " + field1037 + "," + (field936.field313[0] + field1075) + "," + (field936.field314[0] + field1076) + " - ";
			for (int var158 = 0; var158 < field1037 && var158 < 50; var158++) {
				var157 = var157 + field1118.field536[var158] + ",";
			}

			signlink.reporterror(var157);
			method352();
		}

		return true;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method352() {
		try {
			if (field999 != null) {
				field999.method28();
			}
		} catch (Exception var2) {
		}

		field999 = null;
		field969 = false;
		field1131 = 0;
		class5.method34();
		field978 = "";
		field979 = "";
		field980 = "";
		method382();
		field976.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field972[var1].method272();
		}

		System.gc();

		if (field904) {
			signlink.midi = "null";
		}

		field909 = null;
	}

	@ObfuscatedName("client.a(Lkb;ZI)V")
	public final void method353(class37 arg0, int arg1) {
		if (arg1 == 140 || arg1 == 171) {
			int var3 = arg0.method201();
			int var4 = (var3 >> 4 & 0x7) + field1072;
			int var5 = (var3 & 0x7) + field1073;
			int var6 = arg0.method201();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1117[var7];
			int var10;
			if (arg1 == 171) {
				var10 = -1;
			} else {
				var10 = arg0.method203();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class38 var11 = null;
				for (class38 var12 = (class38) field981.method220(); var12 != null; var12 = (class38) field981.method222()) {
					if (field958 == var12.field548 && var12.field550 == var4 && var12.field551 == var5 && var12.field549 == var9) {
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
						var13 = field976.method74(field958, var4, var5);
					}

					if (var9 == 1) {
						var13 = field976.method75(var4, var5, field958);
					}

					if (var9 == 2) {
						var13 = field976.method76(field958, var4, var5);
					}

					if (var9 == 3) {
						var13 = field976.method77(field958, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field976.method78(field958, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class38();
					var11.field548 = field958;
					var11.field549 = var9;
					var11.field550 = var4;
					var11.field551 = var5;
					var11.field555 = var14;
					var11.field557 = var15;
					var11.field556 = var16;
					field981.method217(var11);
				}

				var11.field552 = var10;
				var11.field554 = var7;
				var11.field553 = var8;
				method435(field958, var7, var5, var4, var9, var10, var8);
			}
		} else if (arg1 == 217) {
			int var18 = arg0.method201();
			int var19 = (var18 >> 4 & 0x7) + field1072;
			int var20 = (var18 & 0x7) + field1073;
			int var21 = arg0.method201();
			int var22 = var21 >> 2;
			int var23 = field1117[var22];
			int var24 = arg0.method203();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 1) {
					var25 = field976.method75(var19, var20, field958);
				}

				if (var23 == 2) {
					var25 = field976.method76(field958, var19, var20);
				}

				if (var25 != 0) {
					class40 var26 = new class40(var23, field958, var25 >> 14 & 0x7FFF, false, class59.field843[var24], var20, var19);
					field1158.method217(var26);
				}
			}
		} else if (arg1 == 96) {
			int var27 = arg0.method201();
			int var28 = (var27 >> 4 & 0x7) + field1072;
			int var29 = (var27 & 0x7) + field1073;
			int var30 = arg0.method203();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class22 var31 = new class22();
				var31.field264 = var30;

				if (field908[field958][var28][var29] == null) {
					field908[field958][var28][var29] = new class41();
				}

				field908[field958][var28][var29].method217(var31);
				method342(var28, var29);
			}
		} else if (arg1 == 144) {
			int var32 = arg0.method201();
			int var33 = (var32 >> 4 & 0x7) + field1072;
			int var34 = (var32 & 0x7) + field1073;
			int var35 = arg0.method203();
			if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
				class41 var36 = field908[field958][var33][var34];
				if (var36 != null) {
					for (class22 var37 = (class22) var36.method220(); var37 != null; var37 = (class22) var36.method222()) {
						if ((var35 & 0x7FFF) == var37.field264) {
							var37.method104();
							break;
						}
					}

					if (var36.method220() == null) {
						field908[field958][var33][var34] = null;
					}

					method342(var33, var34);
				}
			}
		} else if (arg1 == 17) {
			int var38 = arg0.method201();
			int var39 = (var38 >> 4 & 0x7) + field1072;
			int var40 = (var38 & 0x7) + field1073;
			int var41 = var39 + arg0.method202();
			int var42 = var40 + arg0.method202();
			int var43 = arg0.method204();
			int var44 = arg0.method203();
			int var45 = arg0.method201();
			int var46 = arg0.method201();
			int var47 = arg0.method203();
			int var48 = arg0.method203();
			int var49 = arg0.method201();
			int var50 = arg0.method201();
			if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
				var39 = var39 * 128 + 64;
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				class27 var51 = new class27(var39, field994 + var48, var50, var44, method341(var39, var40, field958) - var45, field958, var43, field994 + var47, var49, var40, var46);
				var51.method113(method341(var41, var42, field958) - var46, var42, field994 + var47, var41);
				field1082.method217(var51);
			}
		} else if (arg1 == 114) {
			int var52 = arg0.method201();
			int var53 = (var52 >> 4 & 0x7) + field1072;
			int var54 = (var52 & 0x7) + field1073;
			int var55 = arg0.method203();
			int var56 = arg0.method201();
			int var57 = arg0.method203();
			if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
				var53 = var53 * 128 + 64;
				var54 = var54 * 128 + 64;
				class28 var58 = new class28(var54, method341(var53, var54, field958) - var56, var53, var57, var55, field994, field958);
				field900.method217(var58);
			}
		} else if (arg1 == 19) {
			int var59 = arg0.method201();
			int var60 = (var59 >> 4 & 0x7) + field1072;
			int var61 = (var59 & 0x7) + field1073;
			int var62 = arg0.method203();
			int var63 = arg0.method203();
			if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && field925 != var63) {
				class22 var64 = new class22();
				var64.field264 = var62;

				if (field908[field958][var60][var61] == null) {
					field908[field958][var60][var61] = new class41();
				}

				field908[field958][var60][var61].method217(var64);
				method342(var60, var61);
			}
		} else if (arg1 == 44) {
			int var65 = arg0.method201();
			int var66 = (var65 >> 4 & 0x7) + field1072;
			int var67 = (var65 & 0x7) + field1073;
			int var68 = arg0.method201();
			int var69 = var68 >> 2;
			int var70 = var68 & 0x3;
			int var71 = field1117[var69];
			int var72 = arg0.method203();
			int var73 = arg0.method203();
			int var74 = arg0.method203();
			int var75 = arg0.method203();
			byte var76 = arg0.method202();
			byte var77 = arg0.method202();
			byte var78 = arg0.method202();
			byte var79 = arg0.method202();
			class26 var80;
			if (field925 == var75) {
				var80 = field936;
			} else {
				var80 = field986[var75];
			}

			if (var80 != null) {
				class39 var81 = new class39(field994 + var73, var66, var67, var69, var71, field958, var70, -1);
				field896.method217(var81);
				class39 var82 = new class39(field994 + var74, var66, var67, var69, var71, field958, var70, var72);
				field896.method217(var82);
				int var83 = field961[field958][var66][var67];
				int var84 = field961[field958][var66 + 1][var67];
				int var85 = field961[field958][var66 + 1][var67 + 1];
				int var86 = field961[field958][var66][var67 + 1];
				class50 var87 = class50.method253(var72);
				var80.field327 = field994 + var73;
				var80.field328 = field994 + var74;
				var80.field332 = var87.method256(var69, var70, var83, var84, var85, var86, -1);
				int var88 = var87.field660;
				int var89 = var87.field661;
				if (var70 == 1 || var70 == 3) {
					var88 = var87.field661;
					var89 = var87.field660;
				}

				var80.field329 = var66 * 128 + var88 * 64;
				var80.field331 = var67 * 128 + var89 * 64;
				var80.field330 = method341(var80.field329, var80.field331, field958);

				if (var76 > var78) {
					byte var90 = var76;
					var76 = var78;
					var78 = var90;
				}

				if (var77 > var79) {
					byte var91 = var77;
					var77 = var79;
					var79 = var91;
				}

				var80.field333 = var66 + var76;
				var80.field335 = var66 + var78;
				var80.field334 = var67 + var77;
				var80.field336 = var67 + var79;
				return;
			}
		}
	}

	public final void run() {
		if (field975) {
			field962 = true;

			try {
				long var1 = System.currentTimeMillis();
				int var3 = 0;
				int var4 = 20;
				while (field1123) {
					method374();
					method374();
					method340();
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

			field962 = false;
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void method354(class37 arg0, int arg1) {
		while (arg0.field538 + 10 < arg1 * 8) {
			int var3 = arg0.method212(11);
			if (var3 == 2047) {
				break;
			}

			if (field986[var3] == null) {
				field986[var3] = new class26();
				if (field991[var3] != null) {
					field986[var3].method110(field991[var3]);
				}
			}

			field988[field987++] = var3;
			class26 var4 = field986[var3];
			var4.field309 = field994;
			int var5 = arg0.method212(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method212(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method106(field936.field313[0] + var5, field936.field314[0] + var6);
			field990[field989++] = var3;
		}

		arg0.method213();
	}

	@ObfuscatedName("client.l(I)V")
	public final void method355() {
		int var1 = field917.method184("Choose Option");
		for (int var2 = 0; var2 < field947; var2++) {
			int var3 = field917.method184(field956[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field947 * 15 + 21;
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

			field1062 = true;
			field910 = 0;
			field911 = var5;
			field912 = var6;
			field913 = var1;
			field914 = field947 * 15 + 22;
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

			field1062 = true;
			field910 = 1;
			field911 = var7;
			field912 = var8;
			field913 = var1;
			field914 = field947 * 15 + 22;
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method356() {
		if (field1181 == 2) {
			for (class39 var1 = (class39) field896.method220(); var1 != null; var1 = (class39) field896.method222()) {
				if (field994 >= var1.field565) {
					method435(var1.field558, var1.field564, var1.field561, var1.field560, var1.field559, var1.field562, var1.field563);
					var1.method104();
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method357() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field974) {
				if (var1 >= 32 && var1 <= 122 && field1104.length() < 80) {
					field1104 = field1104 + (char) var1;
					field897 = true;
				}

				if (var1 == 8 && field1104.length() > 0) {
					field1104 = field1104.substring(0, field1104.length() - 1);
					field897 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field974 = false;
					field897 = true;

					if (field1187 == 1 && field883 < 100) {
						long var2 = class48.method243(field1104);
						field1104 = class48.method246(class48.method244(var2));
						if (var2 != 0L) {
							boolean var4 = false;
							for (int var5 = 0; var5 < field883; var5++) {
								if (field1183[var5] == var2) {
									method400(field1104 + " is already on your friend list", 0, "");
									var4 = true;
									break;
								}
							}

							for (int var6 = 0; var6 < field1126; var6++) {
								if (field924[var6] == var2) {
									method400("Please remove " + field1104 + " from your ignore list first", 0, "");
									var4 = true;
									break;
								}
							}

							if (field1104.equals(field936.field318)) {
								var4 = true;
							}

							if (!var4) {
								field939[field883] = field1104;
								field1183[field883] = var2;
								field1013[field883] = 0;
								field883++;
								field982 = true;
								field1171.method192(28);
								field1171.method197(var2);
							}
						}
					}

					if (field1187 == 2 && field883 > 0) {
						long var7 = class48.method243(field1104);
						field1104 = class48.method246(class48.method244(var7));

						if (var7 != 0L) {
							for (int var9 = 0; var9 < field883; var9++) {
								if (field1183[var9] == var7) {
									field883--;
									field982 = true;

									for (int var10 = var9; var10 < field883; var10++) {
										field939[var10] = field939[var10 + 1];
										field1013[var10] = field1013[var10 + 1];
										field1183[var10] = field1183[var10 + 1];
									}

									field1171.method192(195);
									field1171.method197(var7);
									break;
								}
							}
						}
					}

					if (field1187 == 3 && field1104.length() > 0 && field885 >= 0 && field885 < field883) {
						field1171.method192(74);
						field1171.method193(0);
						int var11 = field1171.field537;
						field1171.method197(field1183[field885]);
						class49.method250(field1104, field1171);
						field1171.method200(field1171.field537 - var11);
						field1104 = class48.method247(field1104);
						field1104 = class62.method312(field1104);
						method400(field1104, 6, field939[field885]);

						if (field997 == 2) {
							field997 = 1;
							field899 = true;
							field1171.method192(227);
							field1171.method193(field1188);
							field1171.method193(field997);
							field1171.method193(field1047);
						}
					}

					if (field1187 == 4 && field1126 < 100 && field1104.length() > 0) {
						long var12 = class48.method243(field1104);
						boolean var14 = false;
						for (int var15 = 0; var15 < field1126; var15++) {
							if (field924[var15] == var12) {
								method400(field1104 + " is already on your ignore list", 0, "");
								var14 = true;
								break;
							}
						}

						for (int var16 = 0; var16 < field883; var16++) {
							if (field1183[var16] == var12) {
								method400("Please remove " + field1104 + " from your friend list first", 0, "");
								var14 = true;
								break;
							}
						}

						if (!var14) {
							field924[field1126++] = var12;
							field982 = true;
							field1171.method192(170);
							field1171.method197(var12);
						}
					}

					if (field1187 == 5 && field1126 > 0 && field1104.length() > 0) {
						long var17 = class48.method243(field1104);
						for (int var19 = 0; var19 < field1126; var19++) {
							if (field924[var19] == var17) {
								field1126--;
								field982 = true;

								for (int var20 = var19; var20 < field1126; var20++) {
									field924[var20] = field924[var20 + 1];
								}

								field1171.method192(97);
								field1171.method197(var17);
								break;
							}
						}
					}
				}
			} else if (field998) {
				if (var1 >= 48 && var1 <= 57 && field1162.length() < 10) {
					field1162 = field1162 + (char) var1;
					field897 = true;
				}

				if (var1 == 8 && field1162.length() > 0) {
					field1162 = field1162.substring(0, field1162.length() - 1);
					field897 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1162.length() > 0) {
						int var21 = 0;
						try {
							var21 = Integer.parseInt(field1162);
						} catch (Exception var25) {
						}

						field1171.method192(41);
						field1171.method196(var21);
					}

					field998 = false;
					field897 = true;
				}
			} else if (field940 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1014.length() < 80) {
					field1014 = field1014 + (char) var1;
					field897 = true;
				}

				if (var1 == 8 && field1014.length() > 0) {
					field1014 = field1014.substring(0, field1014.length() - 1);
					field897 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1014.length() > 0) {
					if (field1014.equals("::clientdrop") && field11 != null) {
						method359();
					} else if (field1014.startsWith("::")) {
						field1171.method192(237);
						field1171.method193(field1014.length() - 1);
						field1171.method198(field1014.substring(2));
					} else {
						byte var22 = 0;
						if (field1014.startsWith("yellow:")) {
							var22 = 0;
							field1014 = field1014.substring(7);
						}

						if (field1014.startsWith("red:")) {
							var22 = 1;
							field1014 = field1014.substring(4);
						}

						if (field1014.startsWith("green:")) {
							var22 = 2;
							field1014 = field1014.substring(6);
						}

						if (field1014.startsWith("cyan:")) {
							var22 = 3;
							field1014 = field1014.substring(5);
						}

						if (field1014.startsWith("purple:")) {
							var22 = 4;
							field1014 = field1014.substring(7);
						}

						if (field1014.startsWith("white:")) {
							var22 = 5;
							field1014 = field1014.substring(6);
						}

						if (field1014.startsWith("flash1:")) {
							var22 = 6;
							field1014 = field1014.substring(7);
						}

						if (field1014.startsWith("flash2:")) {
							var22 = 7;
							field1014 = field1014.substring(7);
						}

						if (field1014.startsWith("flash3:")) {
							var22 = 8;
							field1014 = field1014.substring(7);
						}

						if (field1014.startsWith("glow1:")) {
							var22 = 9;
							field1014 = field1014.substring(6);
						}

						if (field1014.startsWith("glow2:")) {
							var22 = 10;
							field1014 = field1014.substring(6);
						}

						if (field1014.startsWith("glow3:")) {
							var22 = 11;
							field1014 = field1014.substring(6);
						}

						byte var23 = 0;
						if (field1014.startsWith("wave:")) {
							var23 = 1;
							field1014 = field1014.substring(5);
						}

						if (field1014.startsWith("scroll:")) {
							var23 = 2;
							field1014 = field1014.substring(7);
						}

						field1171.method192(54);
						field1171.method193(0);
						int var24 = field1171.field537;
						field1171.method193(var22);
						field1171.method193(var23);
						class49.method250(field1014, field1171);
						field1171.method200(field1171.field537 - var24);
						field1014 = class48.method247(field1014);
						field1014 = class62.method312(field1014);
						field936.field277 = field1014;
						field936.field279 = var22;
						field936.field280 = var23;
						field936.field278 = 150;
						method400(field936.field277, 2, field936.field318);

						if (field1188 == 2) {
							field1188 = 1;
							field899 = true;
							field1171.method192(227);
							field1171.method193(field1188);
							field1171.method193(field997);
							field1171.method193(field1047);
						}
					}

					field1014 = "";
					field897 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method358(int arg0) {
		if (!field906 && class33.field508[17] >= arg0) {
			class35 var2 = class33.field502[17];
			int var3 = var2.field522 * var2.field521 - 1;
			int var4 = field977 * var2.field521 * 2;
			byte[] var5 = var2.field519;
			byte[] var6 = field1071;
			for (int var7 = 0; var7 <= var3; var7++) {
				var6[var7] = var5[var7 - var4 & var3];
			}

			var2.field519 = var6;
			field1071 = var5;
			class33.method156(17);
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method359() {
		field888.method227();
		field916.method182(144, 0, 257, "Connection lost");
		field916.method182(143, 0xFFFFFF, 256, "Connection lost");
		field916.method182(159, 0, 257, "Please wait - attempting to reestablish");
		field916.method182(158, 0xFFFFFF, 256, "Please wait - attempting to reestablish");
		field888.method228(8, field8, 11);
		class4 var1 = field999;
		field969 = false;
		method427(field978, field979, method396(), true);

		if (!field969) {
			method352();
		}

		try {
			var1.method28();
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("client.a(IBLkb;)V")
	public final void method360(int arg0, class37 arg1) {
		arg1.method211();
		int var3 = arg1.method212(8);
		if (var3 < field1177) {
			for (int var4 = var3; var4 < field1177; var4++) {
				field1059[field1058++] = field1178[var4];
			}
		}

		if (var3 > field1177) {
			signlink.reporterror(field978 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1177 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1178[var5];
			class25 var7 = field1176[var6];
			int var8 = arg1.method212(1);
			if (var8 == 0) {
				field1178[field1177++] = var6;
				var7.field309 = field994;
			} else {
				int var9 = arg1.method212(2);
				if (var9 == 0) {
					field1178[field1177++] = var6;
					var7.field309 = field994;
					field990[field989++] = var6;
				} else if (var9 == 1) {
					field1178[field1177++] = var6;
					var7.field309 = field994;
					int var10 = arg1.method212(3);
					var7.method107(false, var10);
					int var11 = arg1.method212(1);
					if (var11 == 1) {
						field990[field989++] = var6;
					}
				} else if (var9 == 2) {
					field1178[field1177++] = var6;
					var7.field309 = field994;
					int var12 = arg1.method212(3);
					var7.method107(true, var12);
					int var13 = arg1.method212(3);
					var7.method107(true, var13);
					int var14 = arg1.method212(1);
					if (var14 == 1) {
						field990[field989++] = var6;
					}
				} else if (var9 == 3) {
					field1059[field1058++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method361() {
		for (int var1 = -1; var1 < field987 + field1177; var1++) {
			class24 var2;
			if (var1 == -1) {
				var2 = field936;
			} else if (var1 < field987) {
				var2 = field986[field988[var1]];
			} else {
				var2 = field1176[field1178[var1 - field987]];
			}

			if (var2 != null && var2.method108()) {
				if (var1 < field987) {
					class26 var3 = (class26) var2;
					if (var3.field321 != 0) {
						method368(var2.field310 + 15, var2);

						if (field992 > -1) {
							int var4 = 28;
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var3.field321 & 1 << var5) != 0) {
									field1065[var5].method169(field993 - var4, field992 - 12);
									var4 -= 25;
								}
							}
						}
					}
				}

				if (var2.field277 != null && (var1 >= field987 || field1188 == 0 || field1188 == 1 && method397(((class26) var2).field318))) {
					method368(var2.field310, var2);

					if (field992 > -1) {
						if (field1157 == 0) {
							int var6 = 0xFFFF00;
							if (var2.field279 < 6) {
								var6 = field1080[var2.field279];
							}

							if (var2.field279 == 6) {
								var6 = field1011 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
							}

							if (var2.field279 == 7) {
								var6 = field1011 % 20 < 10 ? 0xFF : 0xFFFF;
							}

							if (var2.field279 == 8) {
								var6 = field1011 % 20 < 10 ? 0xB000 : 0x80FF80;
							}

							if (var2.field279 == 9) {
								int var7 = 150 - var2.field278;
								if (var7 < 50) {
									var6 = var7 * 1280 + 0xFF0000;
								} else if (var7 < 100) {
									var6 = 0xFFFF00 - (var7 - 50) * 0x50000;
								} else if (var7 < 150) {
									var6 = (var7 - 100) * 5 + 0xFF00;
								}
							}

							if (var2.field279 == 10) {
								int var8 = 150 - var2.field278;
								if (var8 < 50) {
									var6 = var8 * 5 + 0xFF0000;
								} else if (var8 < 100) {
									var6 = 0xFF00FF - (var8 - 50) * 0x50000;
								} else if (var8 < 150) {
									var6 = (var8 - 100) * 0x50000 + 255 - (var8 - 100) * 5;
								}
							}

							if (var2.field279 == 11) {
								int var9 = 150 - var2.field278;
								if (var9 < 50) {
									var6 = 0xFFFFFF - var9 * 327685;
								} else if (var9 < 100) {
									var6 = (var9 - 50) * 327685 + 0xFF00;
								} else if (var9 < 150) {
									var6 = 0xFFFFFF - (var9 - 100) * 0x50000;
								}
							}

							if (var2.field280 == 0) {
								field917.method182(field993 + 1, 0, field992, var2.field277);
								field917.method182(field993, var6, field992, var2.field277);
							}

							if (var2.field280 == 1) {
								field917.method186(field993 + 1, 0, var2.field277, field1011, field992);
								field917.method186(field993, var6, var2.field277, field1011, field992);
							}

							if (var2.field280 == 2) {
								int var10 = field917.method184(var2.field277);
								int var11 = (150 - var2.field278) * (var10 + 100) / 150;
								class32.method143(334, field992 + 50, 0, field992 - 50);
								field917.method185(var2.field277, field992 + 50 - var11, 0, field993 + 1);
								field917.method185(var2.field277, field992 + 50 - var11, var6, field993);
								class32.method142();
							}
						} else {
							field917.method182(field993 + 1, 0, field992, var2.field277);
							field917.method182(field993, 0xFFFF00, field992, var2.field277);
						}
					}
				}

				if (var2.field283 > field994 + 100) {
					method368(var2.field310 + 15, var2);

					if (field992 > -1) {
						int var12 = var2.field284 * 30 / var2.field285;
						if (var12 > 30) {
							var12 = 30;
						}

						class32.method145(0xFF00, 5, field993 - 3, var12, field992 - 15);
						class32.method145(0xFF0000, 5, field993 - 3, 30 - var12, field992 + var12 - 15);
					}
				}

				if (var2.field283 > field994 + 330) {
					method368(var2.field310 / 2, var2);

					if (field992 > -1) {
						field1191[var2.field282].method169(field993 - 12, field992 - 12);
						field915.method182(field993 + 4, 0, field992, String.valueOf(var2.field281));
						field915.method182(field993 + 3, 0xFFFFFF, field992 - 1, String.valueOf(var2.field281));
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void method362(class37 arg0, int arg1) {
		field1058 = 0;
		field989 = 0;
		method442(arg1, arg0);
		method376(arg0, arg1);
		method354(arg0, arg1);
		method391(arg0, arg1);

		for (int var3 = 0; var3 < field1058; var3++) {
			int var4 = field1059[var3];
			if (field994 != field986[var4].field309) {
				field986[var4] = null;
			}
		}

		if (arg0.field537 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field537 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field987; var5++) {
			if (field986[field988[var5]] == null) {
				signlink.reporterror(field978 + " null entry in pl list - pos:" + var5 + " size:" + field987);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method363(int arg0) {
		int var2 = class61.field865[arg0].field873;
		if (var2 != 0) {
			int var3 = field1048[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class33.method158(0.9D);
				}

				if (var3 == 2) {
					class33.method158(0.8D);
				}

				if (var3 == 3) {
					class33.method158(0.7D);
				}

				if (var3 == 4) {
					class33.method158(0.6D);
				}

				class52.field750.method101();
				field921 = true;
			}

			if (var2 == 3) {
				if (var3 == 1 && field904) {
					field904 = false;
					signlink.midi = "null";
				}

				if (var3 == 0 && !field904) {
					field904 = true;
					signlink.midi = field909;
				}
			}

			if (var2 == 5) {
				field983 = var3;
			}

			if (var2 == 6) {
				field1157 = var3;
			}
		}
	}

	@ObfuscatedName("client.b(Lkb;II)V")
	public final void method364(class37 arg0, int arg1) {
		field1058 = 0;
		field989 = 0;
		method360(arg1, arg0);
		method415(arg0, arg1);
		method418(arg1, arg0);

		for (int var3 = 0; var3 < field1058; var3++) {
			int var4 = field1059[var3];
			if (field994 != field1176[var4].field309) {
				field1176[var4].field317 = null;
				field1176[var4] = null;
			}
		}

		if (arg0.field537 != arg1) {
			signlink.reporterror(field978 + " size mismatch in getnpcpos - pos:" + arg0.field537 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1177; var5++) {
			if (field1176[field1178[var5]] == null) {
				signlink.reporterror(field978 + " null entry in npc list - pos:" + var5 + " size:" + field1177);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method365() {
		for (int var1 = -1; var1 < field987; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field985;
			} else {
				var2 = field988[var1];
			}

			class26 var3 = field986[var2];
			if (var3 != null && var3.field278 > 0) {
				var3.field278--;
				if (var3.field278 == 0) {
					var3.field277 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1177; var4++) {
			int var5 = field1178[var4];
			class25 var6 = field1176[var5];
			if (var6 != null && var6.field278 > 0) {
				var6.field278--;
				if (var6.field278 == 0) {
					var6.field277 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method366() {
		if (field889 == null) {
			method441();
			field9 = null;
			field1106 = null;
			field1107 = null;
			field1108 = null;
			field1109 = null;
			field1110 = null;
			field1111 = null;
			field1112 = null;
			field1113 = null;
			field1114 = null;
			field889 = new class43(96, method11(), 479);
			field887 = new class43(160, method11(), 168);
			class32.method144();
			field931.method180(0, 0);
			field886 = new class43(261, method11(), 190);
			field888 = new class43(334, method11(), 512);
			class32.method144();
			field1154 = new class43(61, method11(), 501);
			field1155 = new class43(40, method11(), 288);
			field1156 = new class43(66, method11(), 269);
			field921 = true;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method367() {
		field903 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1101[var1] = -1;
			for (int var2 = 0; var2 < class56.field770; var2++) {
				if (class56.field771[var2].field772 == var1 + (field1182 ? 0 : 7)) {
					field1101[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLx;)V")
	public final void method368(int arg0, class24 arg1) {
		int var3 = arg1.field265;
		int var4 = arg1.field266;
		if (var3 >= 128 && var4 >= 128 && var3 <= 13056 && var4 <= 13056) {
			int var5 = method341(var3, var4, field958) - arg0;
			var3 -= field1134;
			var5 -= field1135;
			var4 -= field1136;
			int var6 = class31.field475[field1137];
			int var7 = class31.field476[field1137];
			int var8 = class31.field475[field1138];
			int var9 = class31.field476[field1138];
			int var10 = var3 * var9 + var4 * var8 >> 16;
			var4 = var4 * var9 - var3 * var8 >> 16;
			int var12 = var5 * var7 - var4 * var6 >> 16;
			var4 = var4 * var7 + var5 * var6 >> 16;
			if (var4 >= 50) {
				field992 = (var10 << 9) / var4 + class33.field494;
				field993 = (var12 << 9) / var4 + class33.field495;
			} else {
				field992 = -1;
				field993 = -1;
			}
		} else {
			field992 = -1;
			field993 = -1;
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method369(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.b(B)V")
	public final void method370() {
		field1011++;
		method420();
		method403();
		method417();
		method347();
		method386();

		if (!field922) {
			int var1 = field1139;
			if (field1145 / 256 > var1) {
				var1 = field1145 / 256;
			}

			if (field1000[4] && field1054[4] + 128 > var1) {
				var1 = field1054[4] + 128;
			}

			int var2 = field1140 + field1093 & 0x7FF;
			method404(method341(field1143, field1144, field958) - 50, var1, field1144, var1 * 3 + 600, field1143, var2);
		}

		int var3;
		if (field922) {
			var3 = method344();
		} else {
			var3 = method343();
		}

		int var4 = field1134;
		int var5 = field1135;
		int var6 = field1136;
		int var7 = field1137;
		int var8 = field1138;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1000[var9]) {
				int var10 = (int) (Math.random() * (field1088[var9] * 2 + 1) + Math.sin(field1164[var9] / 100.0D * field1179[var9]) * field1054[var9] - field1088[var9]);
				if (var9 == 0) {
					field1134 += var10;
				}

				if (var9 == 1) {
					field1135 += var10;
				}

				if (var9 == 2) {
					field1136 += var10;
				}

				if (var9 == 3) {
					field1138 = field1138 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1137 += var10;
					if (field1137 < 128) {
						field1137 = 128;
					}

					if (field1137 > 383) {
						field1137 = 383;
					}
				}
			}
		}

		int var11 = class33.field509;
		class31.field470 = true;
		class31.field473 = 0;
		class31.field471 = field15 - 8;
		class31.field472 = field16 - 11;
		class32.method144();
		field976.method87(field1134, var3, field1135, field1136, field1137, field1138);
		field976.method64();
		method361();
		method358(var11);
		method346();
		field888.method228(8, field8, 11);
		field1134 = var4;
		field1135 = var5;
		field1136 = var6;
		field1137 = var7;
		field1138 = var8;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method371(int arg0) {
		class57 var2 = class57.field777[arg0];
		for (int var3 = 0; var3 < var2.field798.length && var2.field798[var3] != -1; var3++) {
			class57 var4 = class57.field777[var2.field798[var3]];
			if (var4.field784 == 1) {
				method371(var4.field782);
			}

			var4.field780 = 0;
			var4.field781 = 0;
		}
	}

	@ObfuscatedName("client.a(IZI)Z")
	public final boolean method372(int arg0, int arg1) {
		boolean var3 = false;
		class57 var4 = class57.field777[arg0];
		for (int var5 = 0; var5 < var4.field798.length && var4.field798[var5] != -1; var5++) {
			class57 var6 = class57.field777[var4.field798[var5]];
			if (var6.field784 == 1) {
				var3 |= method372(var6.field782, arg1);
			}

			if (var6.field825 != -1) {
				class59 var7 = class59.field843[var6.field825];
				var6.field781 += arg1;
				while (var6.field781 > var7.field847[var6.field780]) {
					var6.field781 -= var7.field847[var6.field780] + 1;
					var6.field780++;
					if (var6.field780 >= var7.field844) {
						var6.field780 -= var7.field848;
						if (var6.field780 < 0 || var6.field780 >= var7.field844) {
							var6.field780 = 0;
						}
					}

					var3 = true;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;I)V")
	public final void method373(String arg0, String arg1, int arg2) {
		try {
			field1185 = "";
			field1186 = "Connecting to server...";
			method399();
			field999 = new class4(this, method423(field1133 + 43594));
			field999.method31(field1118.field536, 0, 8);
			field1118.field537 = 0;
			field1064 = field1118.method207();
			field1171.field537 = 0;
			field1171.method193(10);
			field1171.method196((int) Math.random() * 99999999);
			field1171.method196((int) Math.random() * 99999999);
			field1171.method197(field1064);
			field1171.method196(arg2);
			field1171.method198(arg0);
			field1171.method198(arg1);
			field1171.method216(field1015, field933);
			field1152.field537 = 0;
			field1152.method193(17);
			field1152.method193(field1171.field537);
			field1152.method199(field1171.field536, 0, field1171.field537);
			field999.method32(field1152.field536, field1152.field537, 0);
			int var4 = field999.method29();
			if (var4 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var5) {
				}

				method373(arg0, arg1, arg2);
				return;
			}

			if (var4 == 2) {
				field1185 = "Username already taken.";
				field1186 = "Please choose a different name.";
				return;
			}

			if (var4 == 3) {
				field1131 = 2;
				method427(field978, field979, arg2, false);
				return;
			}
		} catch (IOException var6) {
			field1185 = "";
			field1186 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method374() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1024[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1024[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1025[var10] = (field1024[var10 - 1] + field1024[var10 + 1] + field1024[var10 - 128] + field1024[var10 + 128]) / 4;
			}
		}

		field1180 += 128;
		if (field1180 > field1168.length) {
			field1180 -= field1168.length;
			int var11 = (int) (Math.random() * 12.0D);
			method422(field1130[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1025[var14 + 128] - field1168[field1180 + var14 & field1168.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1024[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field957[var16] = field957[var16 + 1];
		}

		field957[var1 - 1] = (int) (Math.sin(field994 / 14.0D) * 16.0D + Math.sin(field994 / 15.0D) * 14.0D + Math.sin(field994 / 16.0D) * 12.0D);

		if (field1147 > 0) {
			field1147 -= 4;
		}

		if (field1148 > 0) {
			field1148 -= 4;
		}

		if (field1147 == 0 && field1148 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1147 = 1024;
			}

			if (var17 == 1) {
				field1148 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method375() {
		if (field1106 == null) {
			field9 = null;
			field889 = null;
			field887 = null;
			field886 = null;
			field888 = null;
			field1154 = null;
			field1155 = null;
			field1156 = null;
			field1109 = new class43(265, method11(), 128);
			class32.method144();
			field1110 = new class43(265, method11(), 128);
			class32.method144();
			field1106 = new class43(186, method11(), 533);
			class32.method144();
			field1107 = new class43(146, method11(), 360);
			class32.method144();
			field1108 = new class43(200, method11(), 360);
			class32.method144();
			field1111 = new class43(267, method11(), 214);
			class32.method144();
			field1112 = new class43(267, method11(), 215);
			class32.method144();
			field1113 = new class43(79, method11(), 86);
			class32.method144();
			field1114 = new class43(79, method11(), 87);
			class32.method144();

			if (field968 != null) {
				method430();
				method381();
			}

			field921 = true;
		}
	}

	@ObfuscatedName("client.a(Lkb;IZ)V")
	public final void method376(class37 arg0, int arg1) {
		int var3 = arg0.method212(8);
		if (var3 < field987) {
			for (int var4 = var3; var4 < field987; var4++) {
				field1059[field1058++] = field988[var4];
			}
		}

		if (var3 > field987) {
			signlink.reporterror(field978 + " Too many players");
			throw new RuntimeException("eek");
		}

		field987 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field988[var5];
			class26 var7 = field986[var6];
			int var8 = arg0.method212(1);
			if (var8 == 0) {
				field988[field987++] = var6;
				var7.field309 = field994;
			} else {
				int var9 = arg0.method212(2);
				if (var9 == 0) {
					field988[field987++] = var6;
					var7.field309 = field994;
					field990[field989++] = var6;
				} else if (var9 == 1) {
					field988[field987++] = var6;
					var7.field309 = field994;
					int var10 = arg0.method212(3);
					var7.method107(false, var10);
					int var11 = arg0.method212(1);
					if (var11 == 1) {
						field990[field989++] = var6;
					}
				} else if (var9 == 2) {
					field988[field987++] = var6;
					var7.field309 = field994;
					int var12 = arg0.method212(3);
					var7.method107(true, var12);
					int var13 = arg0.method212(3);
					var7.method107(true, var13);
					int var14 = arg0.method212(1);
					if (var14 == 1) {
						field990[field989++] = var6;
					}
				} else if (var9 == 3) {
					field1059[field1058++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method377() {
		int var1 = field936.field265 + field1128;
		int var2 = field936.field266 + field928;
		if (field1143 - var1 < -500 || field1143 - var1 > 500 || field1144 - var2 < -500 || field1144 - var2 > 500) {
			field1143 = var1;
			field1144 = var2;
		}

		if (field1143 != var1) {
			field1143 += (var1 - field1143) / 16;
		}

		if (field1144 != var2) {
			field1144 += (var2 - field1144) / 16;
		}

		if (field20[1] == 1) {
			field1141 += (-field1141 - 24) / 2;
		} else if (field20[2] == 1) {
			field1141 += (24 - field1141) / 2;
		} else {
			field1141 /= 2;
		}

		if (field20[3] == 1) {
			field1142 += (12 - field1142) / 2;
		} else if (field20[4] == 1) {
			field1142 += (-field1142 - 12) / 2;
		} else {
			field1142 /= 2;
		}

		field1140 = field1141 / 2 + field1140 & 0x7FF;
		field1139 += field1142 / 2;
		if (field1139 < 128) {
			field1139 = 128;
		}

		if (field1139 > 383) {
			field1139 = 383;
		}

		int var3 = field1143 >> 7;
		int var4 = field1144 >> 7;
		int var5 = method341(field1143, field1144, field958);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field958;
					if (var9 < 3 && (field898[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field961[var9][var7][var8];
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

		if (var11 > field1145) {
			field1145 += (var11 - field1145) / 24;
		} else if (var11 < field1145) {
			field1145 += (var11 - field1145) / 80;
		}
	}

	@ObfuscatedName("client.a(ZLec;III)V")
	public final void method378(class57 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field784 == 0 && arg0.field798 != null && (!arg0.field797 || field1035 == arg0.field782 || field1146 == arg0.field782 || field1012 == arg0.field782)) {
			int var5 = class32.field484;
			int var6 = class32.field482;
			int var7 = class32.field485;
			int var8 = class32.field483;
			class32.method143(arg0.field788 + arg1, arg0.field787 + arg3, arg1, arg3);
			int var9 = arg0.field798.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field799[var10] + arg3;
				int var12 = arg0.field800[var10] + arg1 - arg2;
				class57 var13 = class57.field777[arg0.field798[var10]];
				var11 += var13.field789;
				var12 += var13.field790;

				if (var13.field786 > 0) {
					method392(var13);
				}

				if (var13.field784 == 0) {
					if (var13.field796 > var13.field795 - var13.field788) {
						var13.field796 = var13.field795 - var13.field788;
					}

					if (var13.field796 < 0) {
						var13.field796 = 0;
					}

					method378(var13, var12, var13.field796, var11);

					if (var13.field795 > var13.field788) {
						method421(var12, var13.field787 + var11, var13.field795, var13.field796, var13.field788);
					}
				} else if (var13.field784 != 1) {
					if (var13.field784 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field788; var15++) {
							for (int var16 = 0; var16 < var13.field787; var16++) {
								int var17 = (var13.field806 + 32) * var16 + var11;
								int var18 = (var13.field807 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field809[var14];
									var18 += var13.field810[var14];
								}

								if (var13.field778[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field778[var14] - 1;
									class34 var22 = class52.method269(var21);
									if (field1007 != 0 && field1006 == var14 && field1005 == var13.field782) {
										var19 = field15 - field1008;
										var20 = field16 - field1009;

										if (var19 < 5 && var19 > -5) {
											var19 = 0;
										}

										if (var20 < 5 && var20 > -5) {
											var20 = 0;
										}

										var22.method171(var17 + var19, 128, var18 + var20);
									} else if (field1034 != 0 && field1033 == var14 && field1032 == var13.field782) {
										var22.method171(var17, 128, var18);
									} else {
										var22.method169(var18, var17);
									}

									if (var22.field517 == 33 || var13.field779[var14] != 1) {
										int var23 = var13.field779[var14];
										field915.method185(String.valueOf(var23), var17 + var19 + 1, 0, var18 + var20 + 10);
										field915.method185(String.valueOf(var23), var17 + var19, 0xFFFF00, var18 + var20 + 9);
									}
								} else if (var13.field808 != null && var14 < 20) {
									class34 var24 = var13.field808[var14];
									if (var24 != null) {
										var24.method169(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field784 == 3) {
						if (var13.field812) {
							class32.method145(var13.field818, var13.field788, var12, var13.field787, var11);
						} else {
							class32.method146(var13.field818, var12, var13.field787, var13.field788, var11);
						}
					} else if (var13.field784 == 4) {
						class36 var25 = var13.field815;
						int var26 = var13.field818;
						String var27 = var13.field816;

						if ((field1012 == var13.field782 || field1146 == var13.field782 || field1035 == var13.field782) && var13.field820 != 0) {
							var26 = var13.field820;
						}

						if (method433(var13)) {
							var26 = var13.field819;

							if (var13.field817.length() > 0) {
								var27 = var13.field817;
							}
						}

						if (var13.field785 == 6 && field1105) {
							var27 = "Please wait...";
							var26 = var13.field818;
						}

						int var28 = var25.field534 + var12;
						while (var27.length() > 0) {
							if (var27.indexOf("%") != -1) {
								while (true) {
									int var29 = var27.indexOf("%1");
									if (var29 == -1) {
										break;
									}

									var27 = var27.substring(0, var29) + method369(method348(0, var13)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + method369(method348(1, var13)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + method369(method348(2, var13)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + method369(method348(3, var13)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + method369(method348(4, var13)) + var27.substring(var33 + 2);
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

							if (var13.field813) {
								var25.method183(var28, var13.field787 / 2 + var11, var26, var35, var13.field814);
							} else {
								var25.method187(var13.field814, var11, var26, var28, var35);
							}

							var28 += var25.field534;
						}
					} else if (var13.field784 == 5) {
						class34 var36;
						if (method433(var13)) {
							var36 = var13.field822;
						} else {
							var36 = var13.field821;
						}

						if (var36 != null) {
							var36.method169(var12, var11);
						}
					} else if (var13.field784 == 6) {
						int var37 = class33.field494;
						int var38 = class33.field495;
						class33.field494 = var13.field787 / 2 + var11;
						class33.field495 = var13.field788 / 2 + var12;
						int var39 = class33.field498[var13.field828] * var13.field827 >> 16;
						int var40 = class33.field499[var13.field828] * var13.field827 >> 16;
						class31 var41;
						if (var13.field825 == -1) {
							var41 = var13.method292(-1, -1, method433(var13));
						} else {
							class59 var42 = class59.field843[var13.field825];
							var41 = var13.method292(var42.field845[var13.field780], var42.field846[var13.field780], method433(var13));
						}

						if (var41 != null) {
							var41.method135(0, var13.field829, 0, var13.field828, 0, var39, var40);
						}

						class33.field494 = var37;
						class33.field495 = var38;
					} else if (var13.field784 == 7) {
						class36 var43 = var13.field815;
						int var44 = 0;
						for (int var45 = 0; var45 < var13.field788; var45++) {
							for (int var46 = 0; var46 < var13.field787; var46++) {
								if (var13.field778[var44] > 0) {
									class52 var47 = class52.method265(var13.field778[var44] - 1);
									String var48 = var47.field723;
									if (var47.field734 || var13.field779[var44] != 1) {
										var48 = var13.field779[var44] + "x " + var48;
									}

									int var49 = (var13.field806 + 115) * var46 + var11;
									int var50 = (var13.field807 + 12) * var45 + var12;
									if (var13.field813) {
										if (var13.field814) {
											var43.method182(var50 + 1, 0, var13.field787 / 2 + var49 + 1, var48);
										}

										var43.method182(var50, var13.field818, var13.field787 / 2 + var49, var48);
									} else {
										if (var13.field814) {
											var43.method185(var48, var49 + 1, 0, var50 + 1);
										}

										var43.method185(var48, var49, var13.field818, var50);
									}
								}

								var44++;
							}
						}
					}
				}
			}

			class32.method143(var8, var7, var6, var5);
		}
	}

	@ObfuscatedName("client.a(BILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		method375();

		if (field968 == null) {
			super.method13(arg0, arg1);
		} else {
			field1108.method227();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field917.method182(var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			class32.method146(0x8C1111, var6, 304, 34, var3 / 2 - 152);
			class32.method146(0, var6 + 1, 302, 32, var3 / 2 - 151);
			class32.method145(0x8C1111, 30, var6 + 2, arg0 * 3, var3 / 2 - 150);
			class32.method145(0, 30, var6 + 2, 300 - arg0 * 3, arg0 * 3 + var3 / 2 - 150);
			field917.method182(var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2, arg1);
			field1108.method228(214, field8, 186);

			if (field921) {
				field921 = false;

				if (!field1123) {
					field1109.method228(0, field8, 0);
					field1110.method228(661, field8, 0);
				}

				field1106.method228(128, field8, 0);
				field1107.method228(214, field8, 386);
				field1111.method228(0, field8, 265);
				field1112.method228(574, field8, 265);
				field1113.method228(128, field8, 186);
				field1114.method228(574, field8, 186);
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method9() {
		if (field1184 || field1057 || field1132) {
			method350();
		} else {
			if (field969) {
				method413();
			} else {
				method399();
			}

			field1001 = 0;
		}
	}

	@ObfuscatedName("client.a(Lz;BILkb;I)V")
	public final void method379(class26 arg0, int arg1, class37 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg2.method201();
			byte[] var6 = new byte[var5];
			class37 var7 = new class37(var6);
			arg2.method210(var6, var5, 0);
			field991[arg1] = var7;
			arg0.method110(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg2.method203();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg0.field292 == var8) {
				arg0.field296 = 0;
			}

			int var9 = arg2.method201();
			if (var8 == -1 || arg0.field292 == -1 || class59.field843[var8].field851 > class59.field843[arg0.field292].field851 || class59.field843[arg0.field292].field851 == 0) {
				arg0.field292 = var8;
				arg0.field293 = 0;
				arg0.field294 = 0;
				arg0.field295 = var9;
				arg0.field296 = 0;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg0.field286 = arg2.method203();
			if (arg0.field286 == 0xFFFF) {
				arg0.field286 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg0.field277 = arg2.method208();
			arg0.field279 = 0;
			arg0.field280 = 0;
			arg0.field278 = 150;
			method400(arg0.field277, 2, arg0.field318);
		}

		if ((arg3 & 0x10) == 0x10) {
			arg0.field281 = arg2.method201();
			arg0.field282 = arg2.method201();
			arg0.field283 = field994 + 400;
			arg0.field284 = arg2.method201();
			arg0.field285 = arg2.method201();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg0.field287 = arg2.method203();
			arg0.field288 = arg2.method203();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var10 = arg2.method203();
			int var11 = arg2.method201();
			int var12 = arg2.field537;

			if (arg0.field318 != null) {
				long var13 = class48.method243(arg0.field318);
				boolean var15 = false;
				for (int var16 = 0; var16 < field1126; var16++) {
					if (field924[var16] == var13) {
						var15 = true;
						break;
					}
				}

				if (!var15) {
					String var17 = class49.method249(var11, arg2);
					var17 = class62.method312(var17);
					arg0.field277 = var17;
					arg0.field279 = var10 >> 8;
					arg0.field280 = var10 & 0xFF;
					arg0.field278 = 150;
					method400(var17, 2, arg0.field318);
				}
			}

			arg2.field537 = var11 + var12;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg0.field297 = arg2.method203();
			int var18 = arg2.method206();
			arg0.field301 = var18 >> 16;
			arg0.field300 = (var18 & 0xFFFF) + field994;
			arg0.field298 = 0;
			arg0.field299 = 0;

			if (arg0.field300 > field994) {
				arg0.field298 = -1;
			}

			if (arg0.field297 == 0xFFFF) {
				arg0.field297 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg0.field302 = arg2.method201();
			arg0.field304 = arg2.method201();
			arg0.field303 = arg2.method201();
			arg0.field305 = arg2.method201();
			arg0.field306 = arg2.method203() + field994;
			arg0.field307 = arg2.method203() + field994;
			arg0.field308 = arg2.method201();
			arg0.field312 = 0;
			arg0.field313[0] = arg0.field303;
			arg0.field314[0] = arg0.field305;
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method380() {
		if (field1131 == 0) {
			int var1 = field6 / 2;
			int var2 = field7 / 2 + 90;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1185 = "";
				field1186 = "Enter your username & password.";
				field1131 = 2;
				field1090 = 0;
				return;
			}
		} else if (field1131 == 1 || field1131 == 2) {
			int var3 = field7 / 2 - 30;
			var3 += 30;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1090 = 0;
			}

			var3 += 15;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1090 = 1;
			}

			var3 += 15;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3 && field1131 == 1) {
				field1090 = 2;
			}

			int var4 = field6 / 2 - 80;
			int var5 = field7 / 2 + 60;
			if (field17 == 1 && field18 >= var4 - 75 && field18 <= var4 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				if (field1131 == 1) {
					method373(field978, field979, method396());
				} else {
					method427(field978, field979, method396(), false);
				}
			}

			int var6 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var6 - 75 && field18 <= var6 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				field1131 = 0;
			}

			while (true) {
				int var7;
				boolean var8;
				var7 = method5();
				if (var7 == -1) {
					return;
				}

				var8 = false;
				for (int var9 = 0; var9 < field995.length(); var9++) {
					if (var7 == field995.charAt(var9)) {
						var8 = true;
						break;
					}
				}

				if (field1090 == 0) {
					if (var7 == 8 && field978.length() > 0) {
						field978 = field978.substring(0, field978.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1090 = 1;
					}

					if (var8) {
						field978 = field978 + (char) var7;
					}

					if (field978.length() > 12) {
						field978 = field978.substring(0, 12);
					}
				} else if (field1090 == 1) {
					if (var7 == 8 && field979.length() > 0) {
						field979 = field979.substring(0, field979.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						if (field1131 == 1) {
							field1090 = 2;
						} else {
							field1090 = 0;
						}
					}

					if (var8) {
						field979 = field979 + (char) var7;
					}

					if (field979.length() > 20) {
						field979 = field979.substring(0, 20);
					}
				} else if (field1090 == 2) {
					if (var7 == 8 && field980.length() > 0) {
						field980 = field980.substring(0, field980.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1090 = 0;
					}

					if (var8) {
						field980 = field980 + (char) var7;
					}

					if (field980.length() > 20) {
						field980 = field980.substring(0, 20);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method381() {
		field1172 = new class35(field968, "titlebox", 0);
		field1173 = new class35(field968, "titlebutton", 0);
		field1130 = new class35[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1130[var1] = new class35(field968, "runes", var1);
		}

		field926 = new class34(128, 265);
		field927 = new class34(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field926.field512[var2] = field1109.field577[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field927.field512[var3] = field1110.field577[var3];
		}

		field1027 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1027[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1027[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1027[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1027[var7 + 192] = 0xFFFFFF;
		}

		field1028 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1028[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1028[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1028[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1028[var11 + 192] = 0xFFFFFF;
		}

		field1029 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1029[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1029[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1029[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1029[var15 + 192] = 0xFFFFFF;
		}

		field1026 = new int[256];
		field1168 = new int[32768];
		field1169 = new int[32768];
		method422(null);
		field1024 = new int[32768];
		field1025 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1123) {
			field975 = true;
			field1123 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method382() {
		class50.field686.method101();
		class50.field687.method101();
		class51.field715.method101();
		class52.field749.method101();
		class52.field750.method101();
		class26.field338.method101();
		class60.field863.method101();
	}

	@ObfuscatedName("client.a(IIIILec;II)V")
	public final void method383(int arg0, int arg1, int arg2, class57 arg3, int arg4, int arg5) {
		if (arg3.field784 == 0 && arg3.field798 != null && !arg3.field797 && (arg2 >= arg1 && arg4 >= arg5 && arg2 <= arg3.field787 + arg1 && arg4 <= arg3.field788 + arg5)) {
			int var7 = arg3.field798.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.field799[var8] + arg1;
				int var10 = arg3.field800[var8] + arg5 - arg0;
				class57 var11 = class57.field777[arg3.field798[var8]];
				var9 += var11.field789;
				var10 += var11.field790;
				if ((var11.field794 >= 0 || var11.field820 != 0) && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field787 + var9 && arg4 < var11.field788 + var10) {
					if (var11.field794 >= 0) {
						field1049 = var11.field794;
					} else {
						field1049 = var11.field782;
					}
				}

				if (var11.field784 == 0) {
					method383(var11.field796, var9, arg2, var11, arg4, var10);

					if (var11.field795 > var11.field788) {
						method424(true, var11.field795, arg2, var11, var11.field787 + var9, var11.field788, arg4, var10);
					}
				} else {
					if (var11.field785 == 1 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field787 + var9 && arg4 < var11.field788 + var10) {
						field956[field947] = var11.field833;
						field1069[field947] = 508;
						field1068[field947] = var11.field782;
						field947++;
					}

					if (var11.field785 == 2 && field943 == 0 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field787 + var9 && arg4 < var11.field788 + var10) {
						String var12 = var11.field830;
						if (var12.indexOf(" ") != -1) {
							var12 = var12.substring(0, var12.indexOf(" "));
						}

						field956[field947] = var12 + " @gre@" + var11.field831;
						field1069[field947] = 458;
						field1068[field947] = var11.field782;
						field947++;
					}

					if (var11.field785 == 3 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field787 + var9 && arg4 < var11.field788 + var10) {
						field956[field947] = "Close";
						field1069[field947] = 850;
						field1068[field947] = var11.field782;
						field947++;
					}

					if (var11.field785 == 4 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field787 + var9 && arg4 < var11.field788 + var10) {
						field956[field947] = var11.field833;
						field1069[field947] = 170;
						field1068[field947] = var11.field782;
						field947++;
					}

					if (var11.field785 == 5 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field787 + var9 && arg4 < var11.field788 + var10) {
						field956[field947] = var11.field833;
						field1069[field947] = 638;
						field1068[field947] = var11.field782;
						field947++;
					}

					if (var11.field785 == 6 && !field1105 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field787 + var9 && arg4 < var11.field788 + var10) {
						field956[field947] = var11.field833;
						field1069[field947] = 199;
						field1068[field947] = var11.field782;
						field947++;
					}

					if (var11.field784 == 2) {
						int var13 = 0;
						for (int var14 = 0; var14 < var11.field788; var14++) {
							for (int var15 = 0; var15 < var11.field787; var15++) {
								int var16 = (var11.field806 + 32) * var15 + var9;
								int var17 = (var11.field807 + 32) * var14 + var10;
								if (var13 < 20) {
									var16 += var11.field809[var13];
									var17 += var11.field810[var13];
								}

								if (arg2 >= var16 && arg4 >= var17 && arg2 < var16 + 32 && arg4 < var17 + 32) {
									field901 = var13;
									field902 = var11.field782;

									if (var11.field778[var13] > 0) {
										class52 var18 = class52.method265(var11.field778[var13] - 1);
										if (field948 == 1 && var11.field804) {
											if (field950 != var11.field782 || field949 != var13) {
												field956[field947] = "Use " + field952 + " with @lre@" + var18.field723;
												field1069[field947] = 786;
												field1070[field947] = var18.field721;
												field1067[field947] = var13;
												field1068[field947] = var11.field782;
												field947++;
											}
										} else if (field943 != 1 || !var11.field804) {
											if (var11.field804) {
												for (int var19 = 4; var19 >= 3; var19--) {
													if (var18.field738 != null && var18.field738[var19] != null) {
														field956[field947] = var18.field738[var19] + " @lre@" + var18.field723;

														if (var19 == 3) {
															field1069[field947] = 294;
														}

														if (var19 == 4) {
															field1069[field947] = 622;
														}

														field1070[field947] = var18.field721;
														field1067[field947] = var13;
														field1068[field947] = var11.field782;
														field947++;
													} else if (var19 == 4) {
														field956[field947] = "Drop @lre@" + var18.field723;
														field1069[field947] = 622;
														field1070[field947] = var18.field721;
														field1067[field947] = var13;
														field1068[field947] = var11.field782;
														field947++;
													}
												}
											}

											if (var11.field805) {
												field956[field947] = "Use @lre@" + var18.field723;
												field1069[field947] = 517;
												field1070[field947] = var18.field721;
												field1067[field947] = var13;
												field1068[field947] = var11.field782;
												field947++;
											}

											if (var11.field804 && var18.field738 != null) {
												for (int var20 = 2; var20 >= 0; var20--) {
													if (var18.field738[var20] != null) {
														field956[field947] = var18.field738[var20] + " @lre@" + var18.field723;

														if (var20 == 0) {
															field1069[field947] = 649;
														}

														if (var20 == 1) {
															field1069[field947] = 408;
														}

														if (var20 == 2) {
															field1069[field947] = 176;
														}

														field1070[field947] = var18.field721;
														field1067[field947] = var13;
														field1068[field947] = var11.field782;
														field947++;
													}
												}
											}

											if (var11.field811 != null) {
												for (int var21 = 4; var21 >= 0; var21--) {
													if (var11.field811[var21] != null) {
														field956[field947] = var11.field811[var21] + " @lre@" + var18.field723;

														if (var21 == 0) {
															field1069[field947] = 288;
														}

														if (var21 == 1) {
															field1069[field947] = 776;
														}

														if (var21 == 2) {
															field1069[field947] = 857;
														}

														if (var21 == 3) {
															field1069[field947] = 881;
														}

														if (var21 == 4) {
															field1069[field947] = 688;
														}

														field1070[field947] = var18.field721;
														field1067[field947] = var13;
														field1068[field947] = var11.field782;
														field947++;
													}
												}
											}

											field956[field947] = "Examine @lre@" + var18.field723;
											field1069[field947] = 1685;
											field1070[field947] = var18.field721;
											field947++;
										} else if ((field945 & 0x10) == 0x10) {
											field956[field947] = field946 + " @lre@" + var18.field723;
											field1069[field947] = 602;
											field1070[field947] = var18.field721;
											field1067[field947] = var13;
											field1068[field947] = var11.field782;
											field947++;
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

	@ObfuscatedName("client.d(II)V")
	public final void method384(int arg0) {
		if (arg0 >= 0) {
			if (field998) {
				field998 = false;
				field897 = true;
			}

			int var2 = field1067[arg0];
			int var3 = field1068[arg0];
			int var4 = field1069[arg0];
			int var5 = field1070[arg0];

			if (var4 == 170) {
				field1171.method192(167);
				field1171.method194(var3);
				class57 var6 = class57.field777[var3];
				if (var6.field791 != null && var6.field791[0][0] == 5) {
					int var7 = var6.field791[0][1];
					field1048[var7] = 1 - field1048[var7];
					method363(var7);
					field982 = true;
				}
			}

			if (var4 == 647) {
				method395(var3, var2, var5, 249);
			}

			if (var4 == 517) {
				field948 = 1;
				field949 = var2;
				field950 = var3;
				field951 = var5;
				field952 = class52.method265(var5).field723;
				field943 = 0;
			} else {
				if (var4 == 310) {
					method395(var3, var2, var5, 82);
				}

				if (var4 == 490 || var4 == 914 || var4 == 75 || var4 == 486 || var4 == 772) {
					class25 var8 = field1176[var5];
					if (var8 != null) {
						method398(var8.field314[0], 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var8.field313[0]);
						field1043 = field18;
						field1044 = field19;
						field1046 = 2;
						field1045 = 0;

						if (var4 == 75) {
							field1171.method192(228);
						}

						if (var4 == 914) {
							field1171.method192(55);
						}

						if (var4 == 490) {
							field1171.method192(160);
						}

						if (var4 == 486) {
							field1171.method192(88);
						}

						if (var4 == 772) {
							field1171.method192(37);
						}

						field1171.method194(var5);
					}
				}

				if (var4 == 792 && method395(var3, var2, var5, 177)) {
					field1171.method194(field944);
				}

				if (var4 == 174 && method395(var3, var2, var5, 7)) {
					field1171.method194(field951);
					field1171.method194(field949);
					field1171.method194(field950);
				}

				if (var4 == 1318) {
					class25 var9 = field1176[var5];
					if (var9 != null) {
						String var10;
						if (var9.field317.field695 == null) {
							var10 = "It's a " + var9.field317.field694 + ".";
						} else {
							var10 = new String(var9.field317.field695);
						}

						method400(var10, 0, "");
					}
				}

				if (var4 == 404) {
					if (field1062) {
						field976.method86(var2 - 8, var3 - 11);
					} else {
						field976.method86(field18 - 8, field19 - 11);
					}
				}

				if (var4 == 652) {
					boolean var11 = method398(var3, 0, false, 0, 0, 0, 0, field936.field314[0], field936.field313[0], var2);
					if (!var11) {
						method398(var3, 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var2);
					}

					field1043 = field18;
					field1044 = field19;
					field1046 = 2;
					field1045 = 0;
					field1171.method192(209);
					field1171.method194(field1075 + var2);
					field1171.method194(field1076 + var3);
					field1171.method194(var5);
					field1171.method194(field951);
					field1171.method194(field949);
					field1171.method194(field950);
				}

				if (var4 == 786) {
					field1171.method192(40);
					field1171.method194(var5);
					field1171.method194(var2);
					field1171.method194(var3);
					field1171.method194(field951);
					field1171.method194(field949);
					field1171.method194(field950);
					field1031 = 0;
					field1032 = var3;
					field1033 = var2;
					field1034 = 2;
					if (class57.field777[var3].field783 == field1174) {
						field1034 = 1;
					}

					if (class57.field777[var3].field783 == field940) {
						field1034 = 3;
					}
				}

				if (var4 == 364 || var4 == 900 || var4 == 487 || var4 == 953) {
					class26 var13 = field986[var5];
					if (var13 != null) {
						method398(var13.field314[0], 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var13.field313[0]);
						field1043 = field18;
						field1044 = field19;
						field1046 = 2;
						field1045 = 0;

						if (var4 == 900) {
							field1171.method192(3);
						}

						if (var4 == 953) {
							field1171.method192(232);
						}

						if (var4 == 364) {
							field1171.method192(216);
						}

						if (var4 == 487) {
							field1171.method192(13);
						}

						field1171.method194(var5);
					}
				}

				if (var4 == 1419) {
					int var14 = var5 >> 14 & 0x7FFF;
					class50 var15 = class50.method253(var14);
					String var16;
					if (var15.field657 == null) {
						var16 = "It's a " + var15.field656 + ".";
					} else {
						var16 = new String(var15.field657);
					}

					method400(var16, 0, "");
				}

				if (var4 == 34) {
					method395(var3, var2, var5, 229);
				}

				if (var4 == 288 || var4 == 776 || var4 == 857 || var4 == 881 || var4 == 688) {
					if (var4 == 776) {
						field1171.method192(53);
					}

					if (var4 == 688) {
						field1171.method192(220);
					}

					if (var4 == 857) {
						field1171.method192(146);
					}

					if (var4 == 288) {
						field1171.method192(184);
					}

					if (var4 == 881) {
						field1171.method192(240);
					}

					field1171.method194(var5);
					field1171.method194(var2);
					field1171.method194(var3);
					field1031 = 0;
					field1032 = var3;
					field1033 = var2;
					field1034 = 2;
					if (class57.field777[var3].field783 == field1174) {
						field1034 = 1;
					}

					if (class57.field777[var3].field783 == field940) {
						field1034 = 3;
					}
				}

				if (var4 == 199 && !field1105) {
					field1171.method192(194);
					field1171.method194(var3);
					field1105 = true;
				}

				if (var4 == 985) {
					class25 var17 = field1176[var5];
					if (var17 != null) {
						method398(var17.field314[0], 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var17.field313[0]);
						field1043 = field18;
						field1044 = field19;
						field1046 = 2;
						field1045 = 0;
						field1171.method192(144);
						field1171.method194(var5);
						field1171.method194(field951);
						field1171.method194(field949);
						field1171.method194(field950);
					}
				}

				if (var4 == 850) {
					field1171.method192(122);

					if (field1192 != -1) {
						field1192 = -1;
						field982 = true;
						field1105 = false;
						field1203 = true;
					}

					if (field940 != -1) {
						field940 = -1;
						field897 = true;
						field1105 = false;
					}

					field1174 = -1;
				}

				if (var4 == 926) {
					boolean var18 = method398(var3, 0, false, 0, 0, 0, 0, field936.field314[0], field936.field313[0], var2);
					if (!var18) {
						method398(var3, 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var2);
					}

					field1043 = field18;
					field1044 = field19;
					field1046 = 2;
					field1045 = 0;
					field1171.method192(45);
					field1171.method194(field1075 + var2);
					field1171.method194(field1076 + var3);
					field1171.method194(var5);
					field1171.method194(field944);
				}

				if (var4 == 602) {
					field1171.method192(231);
					field1171.method194(var5);
					field1171.method194(var2);
					field1171.method194(var3);
					field1171.method194(field944);
					field1031 = 0;
					field1032 = var3;
					field1033 = var2;
					field1034 = 2;
					if (class57.field777[var3].field783 == field1174) {
						field1034 = 1;
					}

					if (class57.field777[var3].field783 == field940) {
						field1034 = 3;
					}
				}

				if (var4 == 649 || var4 == 408 || var4 == 176 || var4 == 294 || var4 == 622) {
					if (var4 == 176) {
						field1171.method192(9);
					}

					if (var4 == 622) {
						field1171.method192(110);
					}

					if (var4 == 649) {
						field1171.method192(80);
					}

					if (var4 == 408) {
						field1171.method192(139);
					}

					if (var4 == 294) {
						field1171.method192(26);
					}

					field1171.method194(var5);
					field1171.method194(var2);
					field1171.method194(var3);
					field1031 = 0;
					field1032 = var3;
					field1033 = var2;
					field1034 = 2;
					if (class57.field777[var3].field783 == field1174) {
						field1034 = 1;
					}

					if (class57.field777[var3].field783 == field940) {
						field1034 = 3;
					}
				}

				if (var4 == 533 || var4 == 947 || var4 == 705 || var4 == 912 || var4 == 603) {
					boolean var20 = method398(var3, 0, false, 0, 0, 0, 0, field936.field314[0], field936.field313[0], var2);
					if (!var20) {
						method398(var3, 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var2);
					}

					field1043 = field18;
					field1044 = field19;
					field1046 = 2;
					field1045 = 0;

					if (var4 == 912) {
						field1171.method192(142);
					}

					if (var4 == 705) {
						field1171.method192(96);
					}

					if (var4 == 603) {
						field1171.method192(131);
					}

					if (var4 == 947) {
						field1171.method192(251);
					}

					if (var4 == 533) {
						field1171.method192(91);
					}

					field1171.method194(field1075 + var2);
					field1171.method194(field1076 + var3);
					field1171.method194(var5);
				}

				if (var4 == 1585 || var4 == 1685) {
					class52 var22 = class52.method265(var5);
					String var23;
					if (var22.field724 == null) {
						var23 = "It's a " + var22.field723 + ".";
					} else {
						var23 = new String(var22.field724);
					}

					method400(var23, 0, "");
				}

				if (var4 == 638) {
					field1171.method192(167);
					field1171.method194(var3);
					class57 var24 = class57.field777[var3];
					if (var24.field791 != null && var24.field791[0][0] == 5) {
						int var25 = var24.field791[0][1];
						if (field1048[var25] != var24.field793[0]) {
							field1048[var25] = var24.field793[0];
							method363(var25);
							field982 = true;
						}
					}
				}

				if (var4 == 447) {
					method395(var3, var2, var5, 16);
				}

				if (var4 == 458) {
					class57 var26 = class57.field777[var3];
					field943 = 1;
					field944 = var3;
					field945 = var26.field832;
					field948 = 0;
					String var27 = var26.field830;
					if (var27.indexOf(" ") != -1) {
						var27 = var27.substring(0, var27.indexOf(" "));
					}

					String var28 = var26.field830;
					if (var28.indexOf(" ") != -1) {
						var28 = var28.substring(var28.indexOf(" ") + 1);
					}

					field946 = var27 + " " + var26.field831 + " " + var28;

					if (field945 == 16) {
						field982 = true;
						field1124 = 3;
						field1203 = true;
					}
				} else {
					if (var4 == 508) {
						class57 var29 = class57.field777[var3];
						boolean var30 = true;
						if (var29.field786 > 0) {
							var30 = method393(var29);
						}

						if (var30) {
							field1171.method192(167);
							field1171.method194(var3);
						}
					}

					if (var4 == 846) {
						method395(var3, var2, var5, 171);
					}

					if (var4 == 946) {
						class25 var31 = field1176[var5];
						if (var31 != null) {
							method398(var31.field314[0], 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var31.field313[0]);
							field1043 = field18;
							field1044 = field19;
							field1046 = 2;
							field1045 = 0;
							field1171.method192(213);
							field1171.method194(var5);
							field1171.method194(field944);
						}
					}

					if (var4 == 989) {
						class26 var32 = field986[var5];
						if (var32 != null) {
							method398(var32.field314[0], 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var32.field313[0]);
							field1043 = field18;
							field1044 = field19;
							field1046 = 2;
							field1045 = 0;
							field1171.method192(172);
							field1171.method194(var5);
							field1171.method194(field944);
						}
					}

					if (var4 == 933) {
						class26 var33 = field986[var5];
						if (var33 != null) {
							method398(var33.field314[0], 0, false, 1, 1, 0, 0, field936.field314[0], field936.field313[0], var33.field313[0]);
							field1043 = field18;
							field1044 = field19;
							field1046 = 2;
							field1045 = 0;
							field1171.method192(10);
							field1171.method194(var5);
							field1171.method194(field951);
							field1171.method194(field949);
							field1171.method194(field950);
						}
					}

					field948 = 0;
					field943 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method385() {
		if (field973 > 1) {
			field973--;
		}

		for (int var1 = 0; var1 < 5 && method351(); var1++) {
		}

		if (field969) {
			if (class5.field58) {
				class37 var2 = class5.method35();
				if (var2 != null) {
					field1171.method192(35);
					field1171.method194(var2.field537);
					field1171.method199(var2.field536, 0, var2.field537);
					var2.method191();
				}
			}

			field1039++;
			if (field1039 > 750) {
				method359();
			}

			method439();
			method406();
			method365();
			method356();
			field977++;

			if (field1046 != 0) {
				field1045 += 20;
				if (field1045 >= 400) {
					field1046 = 0;
				}
			}

			if (field1034 != 0) {
				field1031++;
				if (field1031 >= 15) {
					if (field1034 == 2) {
						field982 = true;
					}

					if (field1034 == 3) {
						field897 = true;
					}

					field1034 = 0;
				}
			}

			if (field1007 != 0) {
				if (field15 > field1008 + 5 || field15 < field1008 - 5 || field16 > field1009 + 5 || field16 < field1009 - 5) {
					field942 = true;
				}

				if (field14 == 0) {
					if (field1007 == 2) {
						field982 = true;
					}

					if (field1007 == 3) {
						field897 = true;
					}

					field1007 = 0;

					if (field942) {
						field902 = -1;
						method405();

						if (field902 == field1005 && field901 != field1006) {
							class57 var3 = class57.field777[field1005];
							int var4 = var3.field778[field901];
							var3.field778[field901] = var3.field778[field1006];
							var3.field778[field1006] = var4;
							int var5 = var3.field779[field901];
							var3.field779[field901] = var3.field779[field1006];
							var3.field779[field1006] = var5;
							field1171.method192(61);
							field1171.method194(field1005);
							field1171.method194(field1006);
							field1171.method194(field901);
						}
					} else if (field983 == 1 && field947 > 2) {
						method355();
					} else if (field947 > 0) {
						method384(field947 - 1);
					}

					field1031 = 10;
					field17 = 0;
				}
			}

			if (class18.field226 != -1) {
				int var6 = class18.field226;
				int var7 = class18.field227;
				boolean var8 = method398(var7, 0, true, 0, 0, 0, 0, field936.field314[0], field936.field313[0], var6);
				class18.field226 = -1;

				if (var8) {
					field1043 = field18;
					field1044 = field19;
					field1046 = 1;
					field1045 = 0;
				}
			}

			method425();
			method394();
			method390();
			method389();

			if (field14 == 1 || field17 == 1) {
				field1001++;
			}

			if (field1181 == 2) {
				method377();
			}

			if (field1181 == 2 && field922) {
				method388();
			}

			for (int var9 = 0; var9 < 5; var9++) {
				field1179[var9]++;
			}

			method357();
			field13++;
			if (field13 > 4500) {
				field13 -= 500;
				field1171.method192(126);
			}

			field1165++;
			if (field1165 > 500) {
				field1165 = 0;
				int var10 = (int) (Math.random() * 8.0D);
				if ((var10 & 0x1) == 1) {
					field1128 += field1129;
				}

				if ((var10 & 0x2) == 2) {
					field928 += field929;
				}

				if ((var10 & 0x4) == 4) {
					field1093 += field1094;
				}
			}

			if (field1128 < -50) {
				field1129 = 2;
			}

			if (field1128 > 50) {
				field1129 = -2;
			}

			if (field928 < -55) {
				field929 = 2;
			}

			if (field928 > 55) {
				field929 = -2;
			}

			if (field1093 < -40) {
				field1094 = 1;
			}

			if (field1093 > 40) {
				field1094 = -1;
			}

			field1040++;
			if (field1040 > 50) {
				field1171.method192(87);
			}

			try {
				if (field999 != null && field1171.field537 > 0) {
					field999.method32(field1171.field536, field1171.field537, 0);
					field1171.field537 = 0;
					field1040 = 0;
				}
			} catch (IOException var12) {
				method359();
			} catch (Exception var13) {
				method352();
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method386() {
		for (class40 var1 = (class40) field1158.method220(); var1 != null; var1 = (class40) field1158.method222()) {
			boolean var2 = false;
			var1.field573 += field977;

			if (var1.field572 == -1) {
				var1.field572 = 0;
				var2 = true;
			}

			while (var1.field573 > var1.field571.field847[var1.field572]) {
				var1.field573 -= var1.field571.field847[var1.field572] + 1;
				var1.field572++;
				var2 = true;

				if (var1.field572 >= var1.field571.field844) {
					var1.field572 -= var1.field571.field848;
					if (var1.field572 < 0 || var1.field572 >= var1.field571.field844) {
						break;
					}
				}
			}

			var1.method104();
			var2 = false;
			if (var2) {
				int var3 = var1.field566;
				int var4 = var1.field568;
				int var5 = var1.field569;
				int var6 = 0;
				if (var1.field567 == 0) {
					var6 = field976.method74(var3, var4, var5);
				}

				if (var1.field567 == 1) {
					var6 = field976.method75(var4, var5, var3);
				}

				if (var1.field567 == 2) {
					var6 = field976.method76(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.field570) {
					int var7 = field961[var3][var4][var5];
					int var8 = field961[var3][var4 + 1][var5];
					int var9 = field961[var3][var4 + 1][var5 + 1];
					int var10 = field961[var3][var4][var5 + 1];
					class50 var11 = class50.method253(var1.field570);
					int var12 = -1;
					if (var1.field572 != -1) {
						var12 = var1.field571.field845[var1.field572];
					}

					if (var1.field567 == 2) {
						int var13 = field976.method78(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;
						class31 var16 = var11.method256(var14, var15, var7, var8, var9, var10, var12);
						field976.method66(var16, var5, var4, var3);
					} else if (var1.field567 == 1) {
						class31 var17 = var11.method256(4, 0, var7, var8, var9, var10, var12);
						field976.method67(var4, var5, var17, var3);
					} else if (var1.field567 == 0) {
						int var18 = field976.method78(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						class31 var21 = var11.method256(var19, var20, var7, var8, var9, var10, var12);
						field976.method68(var21, var3, var5, var4);
					}
				} else {
					var1.method104();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBI)Ljava/lang/String;")
	public static final String method387(int arg0, int arg1) {
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

	@ObfuscatedName("client.v(I)V")
	public final void method388() {
		int var1 = field1083 * 128 + 64;
		int var2 = field1084 * 128 + 64;
		int var3 = method341(field1083, field1084, field958) - field1085;

		if (field1134 < var1) {
			field1134 += (var1 - field1134) * field1087 / 1000 + field1086;
			if (field1134 > var1) {
				field1134 = var1;
			}
		}

		if (field1134 > var1) {
			field1134 -= (field1134 - var1) * field1087 / 1000 + field1086;
			if (field1134 < var1) {
				field1134 = var1;
			}
		}

		if (field1135 < var3) {
			field1135 += (var3 - field1135) * field1087 / 1000 + field1086;
			if (field1135 > var3) {
				field1135 = var3;
			}
		}

		if (field1135 > var3) {
			field1135 -= (field1135 - var3) * field1087 / 1000 + field1086;
			if (field1135 < var3) {
				field1135 = var3;
			}
		}

		if (field1136 < var2) {
			field1136 += (var2 - field1136) * field1087 / 1000 + field1086;
			if (field1136 > var2) {
				field1136 = var2;
			}
		}

		if (field1136 > var2) {
			field1136 -= (field1136 - var2) * field1087 / 1000 + field1086;
			if (field1136 < var2) {
				field1136 = var2;
			}
		}

		int var4 = field1019 * 128 + 64;
		int var5 = field1020 * 128 + 64;
		int var6 = method341(field1019, field1020, field958) - field1021;
		int var7 = var4 - field1134;
		int var8 = var6 - field1135;
		int var9 = var5 - field1136;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1137 < var11) {
			field1137 += (var11 - field1137) * field1023 / 1000 + field1022;
			if (field1137 > var11) {
				field1137 = var11;
			}
		}

		if (field1137 > var11) {
			field1137 -= (field1137 - var11) * field1023 / 1000 + field1022;
			if (field1137 < var11) {
				field1137 = var11;
			}
		}

		int var13 = var12 - field1138;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1138 += field1023 * var13 / 1000 + field1022;
		}

		if (var13 < 0) {
			field1138 -= -var13 * field1023 / 1000 + field1022;
		}

		int var14 = var12 - field1138;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1138 = var12;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method389() {
		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field1188 = (field1188 + 1) % 3;
				field899 = true;
				field897 = true;
				field1171.method192(227);
				field1171.method193(field1188);
				field1171.method193(field997);
				field1171.method193(field1047);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field997 = (field997 + 1) % 3;
				field899 = true;
				field897 = true;
				field1171.method192(227);
				field1171.method193(field1188);
				field1171.method193(field997);
				field1171.method193(field1047);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field1047 = (field1047 + 1) % 3;
				field899 = true;
				field897 = true;
				field1171.method192(227);
				field1171.method193(field1188);
				field1171.method193(field997);
				field1171.method193(field1047);
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method390() {
		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231) {
				field982 = true;
				field1124 = 0;
				field1203 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231) {
				field982 = true;
				field1124 = 1;
				field1203 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231) {
				field982 = true;
				field1124 = 2;
				field1203 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229) {
				field982 = true;
				field1124 = 3;
				field1203 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231) {
				field982 = true;
				field1124 = 4;
				field1203 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231) {
				field982 = true;
				field1124 = 5;
				field1203 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231) {
				field982 = true;
				field1124 = 6;
				field1203 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529) {
				field982 = true;
				field1124 = 8;
				field1203 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529) {
				field982 = true;
				field1124 = 9;
				field1203 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528) {
				field982 = true;
				field1124 = 10;
				field1203 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529) {
				field982 = true;
				field1124 = 11;
				field1203 = true;
			}

			if (field18 >= 706 && field18 <= 736 && field19 >= 492 && field19 < 529) {
				field982 = true;
				field1124 = 12;
				field1203 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(Lkb;II)V")
	public final void method391(class37 arg0, int arg1) {
		for (int var3 = 0; var3 < field989; var3++) {
			int var4 = field990[var3];
			class26 var5 = field986[var4];
			int var6 = arg0.method201();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method201() << 8;
			}

			method379(var5, var4, arg0, var6);
		}
	}

	@ObfuscatedName("client.a(BLec;)V")
	public final void method392(class57 arg0) {
		int var2 = arg0.field786;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field883) {
				arg0.field816 = "";
				arg0.field785 = 0;
			} else {
				arg0.field816 = field939[var2];
				arg0.field785 = 1;
				if (arg0.field833 == null) {
					arg0.field785 = 0;
				}
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field883) {
				arg0.field816 = "";
				arg0.field785 = 0;
			} else {
				if (field1013[var2] == 0) {
					arg0.field816 = "@red@Offline";
				} else if (field1013[var2] == field955) {
					arg0.field816 = "@gre@World-" + (field1013[var2] - 9);
				} else {
					arg0.field816 = "@yel@World-" + (field1013[var2] - 9);
				}

				arg0.field785 = 1;
				if (arg0.field833 == null) {
					arg0.field785 = 0;
				}
			}
		} else if (var2 == 203) {
			arg0.field795 = field883 * 15 + 20;
			if (arg0.field795 <= arg0.field788) {
				arg0.field795 = arg0.field788 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1126) {
				arg0.field816 = "";
				arg0.field785 = 0;
			} else {
				arg0.field816 = class48.method246(class48.method244(field924[var2]));
			}
		} else if (var2 == 503) {
			arg0.field795 = field1126 * 15 + 20;
			if (arg0.field795 <= arg0.field788) {
				arg0.field795 = arg0.field788 + 1;
			}
		} else if (var2 == 327) {
			arg0.field828 = 150;
			arg0.field829 = (int) (Math.sin(field994 / 40.0D) * 256.0D) & 0x7FF;

			if (field903) {
				field903 = false;
				class31[] var3 = new class31[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field1101[var5];
					if (var6 >= 0) {
						var3[var4++] = class56.field771[var6].method289();
					}
				}

				class31 var7 = new class31(var4, var3);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field1018[var8] != 0) {
						var7.method129(field1153[var8][0], field1153[var8][field1018[var8]]);

						if (var8 == 1) {
							var7.method129(field907[0], field907[field1018[var8]]);
						}
					}
				}

				var7.method122();
				var7.method123(class59.field843[field936.field270].field845[0]);
				var7.method132(64, 850, -30, -50, -30, true);
				arg0.field823 = var7;
			}
		} else if (var2 == 324) {
			if (field1060 == null) {
				field1060 = arg0.field821;
				field1061 = arg0.field822;
			}

			if (field1182) {
				arg0.field821 = field1061;
			} else {
				arg0.field821 = field1060;
			}
		} else if (var2 == 325) {
			if (field1060 == null) {
				field1060 = arg0.field821;
				field1061 = arg0.field822;
			}

			if (field1182) {
				arg0.field821 = field1060;
			} else {
				arg0.field821 = field1061;
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(Lec;B)Z")
	public final boolean method393(class57 arg0) {
		int var2 = arg0.field786;
		if (var2 == 201) {
			field897 = true;
			field998 = false;
			field974 = true;
			field1104 = "";
			field1187 = 1;
			field934 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field897 = true;
			field998 = false;
			field974 = true;
			field1104 = "";
			field1187 = 2;
			field934 = "Enter name of friend to delete from list";
		}

		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			if (field1013[var2] > 0) {
				field897 = true;
				field998 = false;
				field974 = true;
				field1104 = "";
				field1187 = 3;
				field885 = var2;
				field934 = "Enter message to send to " + field939[var2];
			}
		}

		if (var2 == 501) {
			field897 = true;
			field998 = false;
			field974 = true;
			field1104 = "";
			field1187 = 4;
			field934 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field897 = true;
			field998 = false;
			field974 = true;
			field1104 = "";
			field1187 = 5;
			field934 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1101[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class56.field770 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class56.field770) {
							var5 = 0;
						}
					}

					if (class56.field771[var5].field772 == var3 + (field1182 ? 0 : 7)) {
						break;
					}
				}

				field1101[var3] = var5;
				field903 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1018[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1153[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1153[var6].length) {
					var8 = 0;
				}
			}

			field1018[var6] = var8;
			field903 = true;
		}

		if (var2 == 324 && !field1182) {
			field1182 = true;
			method367();
		}

		if (var2 == 325 && field1182) {
			field1182 = false;
			method367();
		}

		if (var2 != 326) {
			return false;
		}

		field1171.method192(134);
		field1171.method193(field1182 ? 0 : 1);

		for (int var9 = 0; var9 < 7; var9++) {
			field1171.method193(field1101[var9]);
		}

		for (int var10 = 0; var10 < 5; var10++) {
			field1171.method193(field1018[var10]);
		}

		return true;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method7() {
		if (!field1184 && !field1057 && !field1132) {
			field994++;

			if (field969) {
				method385();
			} else {
				method380();
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method394() {
		if (field17 == 1) {
			int var1 = field18 - 21 - 561;
			int var2 = field19 - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = class33.field498[field1140];
				int var4 = class33.field499[field1140];
				int var5 = var1 * var4 + var2 * var3 >> 11;
				int var6 = var2 * var4 - var1 * var3 >> 11;
				int var7 = field936.field265 + var5 >> 7;
				int var8 = field936.field266 - var6 >> 7;
				method398(var8, 0, true, 0, 0, 0, 0, field936.field314[0], field936.field313[0], var7);
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
				return new URL("http://" + field1204 + ":" + (field1133 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method395(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 >> 14 & 0x7FFF;
		int var6 = field976.method78(field958, arg1, arg0, arg2);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class50 var9 = class50.method253(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field660;
				var11 = var9.field661;
			} else {
				var10 = var9.field661;
				var11 = var9.field660;
			}

			int var12 = var9.field684;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method398(arg0, 0, false, var11, var10, var12, 0, field936.field314[0], field936.field313[0], arg1);
		} else {
			method398(arg0, var7 + 1, false, 0, 0, 0, var8, field936.field314[0], field936.field313[0], arg1);
		}

		field1043 = field18;
		field1044 = field19;
		field1046 = 2;
		field1045 = 0;
		field1171.method192(arg3);
		field1171.method194(field1075 + arg1);
		field1171.method194(field1076 + arg0);
		field1171.method194(var5);
		return true;
	}

	@ObfuscatedName("client.z(I)I")
	public final int method396() {
		return 0;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method397(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field883; var2++) {
			if (arg0.equalsIgnoreCase(field939[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field936.field318)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IZIZIIIIIII)Z")
	public final boolean method398(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		byte var11 = 104;
		byte var12 = 104;
		for (int var13 = 0; var13 < var11; var13++) {
			for (int var14 = 0; var14 < var12; var14++) {
				field1079[var13][var14] = 0;
				field1127[var13][var14] = 99999999;
			}
		}

		int var15 = arg8;
		int var16 = arg7;
		field1079[arg8][arg7] = 99;
		field1127[arg8][arg7] = 0;
		byte var17 = 0;
		int var18 = 0;
		field959[var17] = arg8;
		int var34 = var17 + 1;
		field960[var17] = arg7;
		boolean var19 = false;
		int var20 = field959.length;
		int[][] var21 = field972[field958].field757;
		while (var34 != var18) {
			var15 = field959[var18];
			var16 = field960[var18];
			var18 = (var18 + 1) % var20;

			if (arg9 == var15 && arg0 == var16) {
				var19 = true;
				break;
			}

			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && field972[field958].method281(var16, arg1 - 1, arg6, arg0, arg9, var15)) {
					var19 = true;
					break;
				}

				if (arg1 < 10 && field972[field958].method282(arg9, var16, var15, arg1 - 1, arg0, arg6)) {
					var19 = true;
					break;
				}
			}

			if (arg4 != 0 && arg3 != 0 && field972[field958].method283(arg5, arg4, arg0, arg3, arg9, var15, var16)) {
				var19 = true;
				break;
			}

			int var22 = field1127[var15][var16] + 1;
			if (var15 > 0 && field1079[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 0x280108) == 0) {
				field959[var34] = var15 - 1;
				field960[var34] = var16;
				var34 = (var34 + 1) % var20;
				field1079[var15 - 1][var16] = 2;
				field1127[var15 - 1][var16] = var22;
			}

			if (var15 < var11 - 1 && field1079[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 0x280180) == 0) {
				field959[var34] = var15 + 1;
				field960[var34] = var16;
				var34 = (var34 + 1) % var20;
				field1079[var15 + 1][var16] = 8;
				field1127[var15 + 1][var16] = var22;
			}

			if (var16 > 0 && field1079[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field959[var34] = var15;
				field960[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field1079[var15][var16 - 1] = 1;
				field1127[var15][var16 - 1] = var22;
			}

			if (var16 < var12 - 1 && field1079[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field959[var34] = var15;
				field960[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field1079[var15][var16 + 1] = 4;
				field1127[var15][var16 + 1] = var22;
			}

			if (var15 > 0 && var16 > 0 && field1079[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 0x28010E) == 0 && (var21[var15 - 1][var16] & 0x280108) == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field959[var34] = var15 - 1;
				field960[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field1079[var15 - 1][var16 - 1] = 3;
				field1127[var15 - 1][var16 - 1] = var22;
			}

			if (var15 < var11 - 1 && var16 > 0 && field1079[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 0x280183) == 0 && (var21[var15 + 1][var16] & 0x280180) == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field959[var34] = var15 + 1;
				field960[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field1079[var15 + 1][var16 - 1] = 9;
				field1127[var15 + 1][var16 - 1] = var22;
			}

			if (var15 > 0 && var16 < var12 - 1 && field1079[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 0x280138) == 0 && (var21[var15 - 1][var16] & 0x280108) == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field959[var34] = var15 - 1;
				field960[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field1079[var15 - 1][var16 + 1] = 6;
				field1127[var15 - 1][var16 + 1] = var22;
			}

			if (var15 < var11 - 1 && var16 < var12 - 1 && field1079[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 0x2801E0) == 0 && (var21[var15 + 1][var16] & 0x280180) == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field959[var34] = var15 + 1;
				field960[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field1079[var15 + 1][var16 + 1] = 12;
				field1127[var15 + 1][var16 + 1] = var22;
			}
		}

		if (!var19) {
			if (arg2) {
				int var23 = 100;
				for (int var24 = 1; var24 < 2; var24++) {
					for (int var25 = arg9 - var24; var25 <= arg9 + var24; var25++) {
						for (int var26 = arg0 - var24; var26 <= arg0 + var24; var26++) {
							if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && field1127[var25][var26] < var23) {
								var23 = field1127[var25][var26];
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
		field959[var27] = var15;
		int var35 = var27 + 1;
		field960[var27] = var16;
		int var28;
		int var29 = var28 = field1079[var15][var16];
		while (arg8 != var15 || arg7 != var16) {
			if (var28 != var29) {
				var28 = var29;
				field959[var35] = var15;
				field960[var35++] = var16;
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

			var29 = field1079[var15][var16];
		}

		if (var35 > 0) {
			int var30 = var35;
			if (var35 > 25) {
				var30 = 25;
			}

			var35--;
			int var31 = field959[var35];
			int var32 = field960[var35];

			if (field20[5] == 1) {
				field1171.method192(230);
			} else {
				field1171.method192(204);
			}

			field1171.method193(var30 + var30 + 2);
			field1171.method194(field1075 + var31);
			field1171.method194(field1076 + var32);

			for (int var33 = 1; var33 < var30; var33++) {
				var35--;
				field1171.method193(field959[var35] - var31);
				field1171.method193(field960[var35] - var32);
			}
		}

		return true;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method399() {
		method375();
		field1108.method227();
		field1172.method180(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1131 == 0) {
			int var3 = var2 / 2 - 80;
			field917.method183(var3, var1 / 2, 0xFFFF00, "Welcome to the RuneScape-2 BETA test.", true);
			var3 += 15;
			var3 += 15;
			field915.method183(var3, var1 / 2, 0xFFFFFF, "Please note this test version of the game is provided for ", true);
			var3 += 15;
			field915.method183(var3, var1 / 2, 0xFFFFFF, "testing/preview purposes only. As such please bear in mind that:", true);
			var3 += 15;
			var3 += 10;
			field915.method183(var3, var1 / 2, 0xFFFFFF, "a) Everything you do/gain here will be forgotten when the beta ends.", true);
			var3 += 15;
			field915.method183(var3, var1 / 2, 0xFFFFFF, "b) No customer support is available for the beta.", true);
			var3 += 15;
			field915.method183(var3, var1 / 2, 0xFFFFFF, "c) The beta may be incomplete/buggy, we're still working on it.", true);
			var3 += 15;
			field915.method183(var3, var1 / 2, 0xFFFFFF, "d) The beta may be totally unavailable at times.", true);
			var3 += 15;
			int var4 = var1 / 2;
			int var5 = var2 / 2 + 65;
			field1173.method180(var5 - 20, var4 - 73);
			field917.method183(var5 + 5, var1 / 2, 0xFFFFFF, "Click here to login.", true);
		}

		if (field1131 == 1 || field1131 == 2) {
			int var6 = var2 / 2 - 50;
			if (field1185.length() > 0) {
				field917.method183(var6 - 15, var1 / 2, 0xFFFF00, field1185, true);
				field917.method183(var6, var1 / 2, 0xFFFF00, field1186, true);
				var6 += 30;
			} else {
				field917.method183(var6 - 7, var1 / 2, 0xFFFF00, field1186, true);
				var6 += 30;
			}

			field917.method187(true, var1 / 2 - 90, 0xFFFFFF, var6, "Username: " + field978 + (field1090 == 0 & field994 % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			field917.method187(true, var1 / 2 - 88, 0xFFFFFF, var6, "Password: " + class48.method248(field979) + (field1090 == 1 & field994 % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			if (field1131 == 1) {
				field917.method187(true, var1 / 2 - 143, 0xFFFFFF, var6, "Confirm Password: " + class48.method248(field980) + (field1090 == 2 & field994 % 40 < 20 ? "@yel@|" : ""));
			}

			int var7 = var1 / 2 - 80;
			int var8 = var2 / 2 + 40;
			field1173.method180(var8 - 20, var7 - 73);

			if (field1131 == 1) {
				field917.method183(var8 + 5, var7, 0xFFFFFF, "Create", true);
			} else {
				field917.method183(var8 + 5, var7, 0xFFFFFF, "Login", true);
			}

			int var9 = var1 / 2 + 80;
			field1173.method180(var8 - 20, var9 - 73);
			field917.method183(var8 + 5, var9, 0xFFFFFF, "Cancel", true);
		}

		field1108.method228(214, field8, 186);

		if (field921) {
			field921 = false;
			field1106.method228(128, field8, 0);
			field1107.method228(214, field8, 386);
			field1111.method228(0, field8, 265);
			field1112.method228(574, field8, 265);
			field1113.method228(128, field8, 186);
			field1114.method228(574, field8, 186);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IILjava/lang/String;)V")
	public final void method400(String arg0, int arg1, String arg2) {
		if (field940 == -1) {
			field897 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field905[var4] = field905[var4 - 1];
			field1089[var4] = field1089[var4 - 1];
			field1041[var4] = field1041[var4 - 1];
		}

		field905[0] = arg1;
		field1089[0] = arg2;
		field1041[0] = arg0;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method401() {
		int var1 = field911;
		int var2 = field912;
		int var3 = field913;
		int var4 = field914;
		int var5 = 0x5D5447;
		class32.method145(var5, var4, var2, var3, var1);
		class32.method145(0, 16, var2 + 1, var3 - 2, var1 + 1);
		class32.method146(0, var2 + 18, var3 - 2, var4 - 19, var1 + 1);
		field917.method185("Choose Option", var1 + 3, var5, var2 + 14);
		int var6 = field15;
		int var7 = field16;
		if (field910 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field910 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		for (int var8 = 0; var8 < field947; var8++) {
			int var9 = (field947 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field917.method187(true, var1 + 3, var10, var9, field956[var8]);
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method402() {
		try {
			field1097 = -1;
			field896.method224();
			field1158.method224();
			field900.method224();
			field1082.method224();
			class33.method152();
			method382();
			field976.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field972[var1].method272();
			}

			System.gc();
			class3 var2 = new class3(field898, 104, 104, field961);
			byte[] var3 = new byte[100000];
			int var4 = field1175.length;
			class3.field25 = class18.field192;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1074[var5] >> 8;
				int var7 = field1074[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					class3.field25 = false;
				}
			}

			if (field906) {
				field976.method51(field958);
			} else {
				field976.method51(0);
			}

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1074[var8] >> 8) * 64 - field1075;
				int var10 = (field1074[var8] & 0xFF) * 64 - field1076;
				byte[] var11 = field1175[var8];
				if (var11 != null) {
					int var12 = (new class37(var11)).method206();
					class44.method230(var3, var12, var11, var11.length - 4, 4);
					var2.method15(var10, (field937 - 6) * 8, (field938 - 6) * 8, var3, var9);
				} else if (field938 < 800) {
					var2.method14(var10, 64, var9, 64);
				}
			}

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = field1099[var13];
				if (var14 != null) {
					int var15 = (new class37(var14)).method206();
					class44.method230(var3, var15, var14, var14.length - 4, 4);
					int var16 = (field1074[var13] >> 8) * 64 - field1075;
					int var17 = (field1074[var13] & 0xFF) * 64 - field1076;
					var2.method16(var3, field976, field972, var17, var16, field1158);
				}
			}

			var2.method18(field976, field972);
			field888.method227();

			for (class40 var18 = (class40) field1158.method220(); var18 != null; var18 = (class40) field1158.method222()) {
				if ((field898[1][var18.field568][var18.field569] & 0x2) == 2) {
					var18.field566--;
					if (var18.field566 < 0) {
						var18.method104();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method342(var19, var20);
				}
			}

			for (class38 var21 = (class38) field981.method220(); var21 != null; var21 = (class38) field981.method222()) {
				method435(var21.field548, var21.field554, var21.field551, var21.field550, var21.field549, var21.field552, var21.field553);
			}
		} catch (Exception var23) {
		}

		class50.field686.method101();
		System.gc();
		class33.method153(20);
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method403() {
		for (int var1 = 0; var1 < field1177; var1++) {
			class25 var2 = field1176[field1178[var1]];
			int var3 = (field1178[var1] << 14) + 0x20000000;
			if (var2 != null && var2.method108()) {
				int var4 = var2.field265 >> 7;
				int var5 = var2.field266 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field269 == 1 && (var2.field265 & 0x7F) == 0x40 && (var2.field266 & 0x7F) == 0x40) {
						if (field1098[var4][var5] == field1011) {
							continue;
						}

						field1098[var4][var5] = field1011;
					}

					field976.method61(null, method341(var2.field265, var2.field266, field958), var2.field266, var2.field267, var2.field265, field958, var2.field268, var2, (var2.field269 - 1) * 64 + 60, var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIBIII)V")
	public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = class31.field475[var7];
			int var13 = class31.field476[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field475[var8];
			int var16 = class31.field476[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1134 = arg4 - var9;
		field1135 = arg0 - var10;
		field1136 = arg2 - var11;
		field1137 = arg1;
		field1138 = arg5;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method405() {
		if (field1007 == 0) {
			field956[0] = "Cancel";
			field1069[0] = 1005;
			field947 = 1;

			if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
				if (field1174 == -1) {
					method345();
				} else {
					method383(0, 8, field15, class57.field777[field1174], field16, 11);
				}
			}

			if (field1049 != field1035) {
				field1035 = field1049;
			}

			field1049 = 0;

			if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
				if (field1192 != -1) {
					method383(0, 562, field15, class57.field777[field1192], field16, 231);
				} else if (field935[field1124] != -1) {
					method383(0, 562, field15, class57.field777[field935[field1124]], field16, 231);
				}
			}

			if (field1146 != field1049) {
				field982 = true;
				field1146 = field1049;
			}

			field1049 = 0;

			if (field15 > 22 && field16 > 375 && field15 < 501 && field16 < 471 && field940 != -1) {
				method383(0, 22, field15, class57.field777[field940], field16, 375);
			}

			if (field940 != -1 && field1049 != field1012) {
				field897 = true;
				field1012 = field1049;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field947 - 1; var2++) {
					if (field1069[var2] < 1000 && field1069[var2 + 1] > 1000) {
						String var3 = field956[var2];
						field956[var2] = field956[var2 + 1];
						field956[var2 + 1] = var3;
						int var4 = field1069[var2];
						field1069[var2] = field1069[var2 + 1];
						field1069[var2 + 1] = var4;
						int var5 = field1067[var2];
						field1067[var2] = field1067[var2 + 1];
						field1067[var2 + 1] = var5;
						int var6 = field1068[var2];
						field1068[var2] = field1068[var2 + 1];
						field1068[var2 + 1] = var6;
						int var7 = field1070[var2];
						field1070[var2] = field1070[var2 + 1];
						field1070[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method406() {
		for (int var1 = 0; var1 < field1177; var1++) {
			int var2 = field1178[var1];
			class25 var3 = field1176[var2];
			if (var3 != null) {
				method407(var3.field317.field696, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ZILx;)V")
	public final void method407(int arg0, class24 arg1) {
		if (arg1.field265 < 128 || arg1.field266 < 128 || arg1.field265 >= 13184 || arg1.field266 >= 13184) {
			arg1.field292 = -1;
			arg1.field297 = -1;
			arg1.field306 = 0;
			arg1.field307 = 0;
			arg1.field265 = arg1.field313[0] * 128 + arg1.field269 * 64;
			arg1.field266 = arg1.field314[0] * 128 + arg1.field269 * 64;
			arg1.field312 = 0;
		}

		if (field936 == arg1 && (arg1.field265 < 1536 || arg1.field266 < 1536 || arg1.field265 >= 11776 || arg1.field266 >= 11776)) {
			arg1.field292 = -1;
			arg1.field297 = -1;
			arg1.field306 = 0;
			arg1.field307 = 0;
			arg1.field265 = arg1.field313[0] * 128 + arg1.field269 * 64;
			arg1.field266 = arg1.field314[0] * 128 + arg1.field269 * 64;
			arg1.field312 = 0;
		}

		if (arg1.field306 > field994) {
			method408(arg1);
		} else if (arg1.field307 >= field994) {
			method409(arg1);
		} else {
			method410(arg1);
		}

		method411(arg1);
		method412(arg1);
	}

	@ObfuscatedName("client.a(ZLx;)V")
	public final void method408(class24 arg0) {
		int var2 = arg0.field306 - field994;
		int var3 = arg0.field302 * 128 + arg0.field269 * 64;
		int var4 = arg0.field304 * 128 + arg0.field269 * 64;
		arg0.field265 += (var3 - arg0.field265) / var2;
		arg0.field266 += (var4 - arg0.field266) / var2;
		arg0.field316 = 0;

		if (arg0.field308 == 0) {
			arg0.field311 = 1024;
		}

		if (arg0.field308 == 1) {
			arg0.field311 = 1536;
		}

		if (arg0.field308 == 2) {
			arg0.field311 = 0;
		}

		if (arg0.field308 == 3) {
			arg0.field311 = 512;
		}
	}

	@ObfuscatedName("client.a(Lx;Z)V")
	public final void method409(class24 arg0) {
		if (field994 == arg0.field307 || arg0.field292 == -1 || arg0.field295 != 0 || arg0.field294 + 1 > class59.field843[arg0.field292].field847[arg0.field293]) {
			int var2 = arg0.field307 - arg0.field306;
			int var3 = field994 - arg0.field306;
			int var4 = arg0.field302 * 128 + arg0.field269 * 64;
			int var5 = arg0.field304 * 128 + arg0.field269 * 64;
			int var6 = arg0.field303 * 128 + arg0.field269 * 64;
			int var7 = arg0.field305 * 128 + arg0.field269 * 64;
			arg0.field265 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field266 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field316 = 0;

		if (arg0.field308 == 0) {
			arg0.field311 = 1024;
		}

		if (arg0.field308 == 1) {
			arg0.field311 = 1536;
		}

		if (arg0.field308 == 2) {
			arg0.field311 = 0;
		}

		if (arg0.field308 == 3) {
			arg0.field311 = 512;
		}

		arg0.field267 = arg0.field311;
	}

	@ObfuscatedName("client.a(ILx;)V")
	public final void method410(class24 arg0) {
		arg0.field289 = arg0.field270;
		if (arg0.field312 == 0) {
			arg0.field316 = 0;
		} else {
			if (arg0.field292 != -1 && arg0.field295 == 0) {
				class59 var2 = class59.field843[arg0.field292];
				if (var2.field849 == null) {
					arg0.field316++;
					return;
				}
			}

			int var3 = arg0.field265;
			int var4 = arg0.field266;
			int var5 = arg0.field313[arg0.field312 - 1] * 128 + arg0.field269 * 64;
			int var6 = arg0.field314[arg0.field312 - 1] * 128 + arg0.field269 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field311 = 1280;
					} else if (var4 > var6) {
						arg0.field311 = 1792;
					} else {
						arg0.field311 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field311 = 768;
					} else if (var4 > var6) {
						arg0.field311 = 256;
					} else {
						arg0.field311 = 512;
					}
				} else if (var4 < var6) {
					arg0.field311 = 1024;
				} else {
					arg0.field311 = 0;
				}

				int var7 = arg0.field311 - arg0.field267 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field273;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field272;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field275;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field274;
				}

				if (var8 == -1) {
					var8 = arg0.field272;
				}

				arg0.field289 = var8;
				int var9 = 4;
				if (arg0.field311 != arg0.field267 && arg0.field286 == -1) {
					var9 = 2;
				}

				if (arg0.field312 > 2) {
					var9 = 6;
				}

				if (arg0.field312 > 3) {
					var9 = 8;
				}

				if (arg0.field316 > 0 && arg0.field312 > 1) {
					var9 = 8;
					arg0.field316--;
				}

				if (arg0.field315[arg0.field312 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field289 == arg0.field272 && arg0.field276 != -1) {
					arg0.field289 = arg0.field276;
				}

				if (var3 < var5) {
					arg0.field265 += var9;
					if (arg0.field265 > var5) {
						arg0.field265 = var5;
					}
				} else if (var3 > var5) {
					arg0.field265 -= var9;
					if (arg0.field265 < var5) {
						arg0.field265 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field266 += var9;
					if (arg0.field266 > var6) {
						arg0.field266 = var6;
					}
				} else if (var4 > var6) {
					arg0.field266 -= var9;
					if (arg0.field266 < var6) {
						arg0.field266 = var6;
					}
				}

				if (arg0.field265 == var5 && arg0.field266 == var6) {
					arg0.field312--;
				}
			} else {
				arg0.field265 = var5;
				arg0.field266 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(Lx;I)V")
	public final void method411(class24 arg0) {
		if (arg0.field286 != -1 && arg0.field286 < 32768) {
			class25 var2 = field1176[arg0.field286];
			if (var2 != null) {
				int var3 = arg0.field265 - var2.field265;
				int var4 = arg0.field266 - var2.field266;
				if (var3 != 0 || var4 != 0) {
					arg0.field311 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field286 >= 32768) {
			int var5 = arg0.field286 - 32768;
			if (field925 == var5) {
				var5 = field985;
			}

			class26 var6 = field986[var5];
			if (var6 != null) {
				int var7 = arg0.field265 - var6.field265;
				int var8 = arg0.field266 - var6.field266;
				if (var7 != 0 || var8 != 0) {
					arg0.field311 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field287 != 0 || arg0.field288 != 0) && (arg0.field312 == 0 || arg0.field316 > 0)) {
			int var9 = arg0.field265 - (arg0.field287 - field1075 - field1075) * 64;
			int var10 = arg0.field266 - (arg0.field288 - field1076 - field1076) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field311 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field287 = 0;
			arg0.field288 = 0;
		}

		int var11 = arg0.field311 - arg0.field267 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field267 = arg0.field311;
			} else if (var11 > 1024) {
				arg0.field267 -= 32;
			} else {
				arg0.field267 += 32;
			}

			arg0.field267 &= 0x7FF;
			if (arg0.field289 == arg0.field270 && arg0.field311 != arg0.field267) {
				if (arg0.field271 != -1) {
					arg0.field289 = arg0.field271;
					return;
				}

				arg0.field289 = arg0.field272;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ZLx;)V")
	public final void method412(class24 arg0) {
		arg0.field268 = 0;

		if (arg0.field289 != -1) {
			class59 var2 = class59.field843[arg0.field289];
			arg0.field291++;
			if (arg0.field290 < var2.field844 && arg0.field291 > var2.field847[arg0.field290]) {
				arg0.field291 = 0;
				arg0.field290++;
			}

			if (arg0.field290 >= var2.field844) {
				arg0.field291 = 0;
				arg0.field290 = 0;
			}
		}

		if (arg0.field292 != -1 && arg0.field295 == 0) {
			class59 var3 = class59.field843[arg0.field292];
			arg0.field294++;
			while (arg0.field293 < var3.field844 && arg0.field294 > var3.field847[arg0.field293]) {
				arg0.field294 -= var3.field847[arg0.field293];
				arg0.field293++;
			}

			if (arg0.field293 >= var3.field844) {
				arg0.field293 -= var3.field848;
				arg0.field296++;
				if (arg0.field296 >= var3.field854) {
					arg0.field292 = -1;
				}

				if (arg0.field293 < 0 || arg0.field293 >= var3.field844) {
					arg0.field292 = -1;
				}
			}

			arg0.field268 = var3.field850;
		}

		if (arg0.field295 > 0) {
			arg0.field295--;
		}

		if (arg0.field297 != -1 && field994 >= arg0.field300) {
			if (arg0.field298 < 0) {
				arg0.field298 = 0;
			}

			class59 var4 = class60.field856[arg0.field297].field859;
			arg0.field299++;
			while (arg0.field298 < var4.field844 && arg0.field299 > var4.field847[arg0.field298]) {
				arg0.field299 -= var4.field847[arg0.field298];
				arg0.field298++;
			}

			if (arg0.field298 >= var4.field844) {
				arg0.field297 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method413() {
		if (field921) {
			field921 = false;
			field1193.method228(0, field8, 11);
			field1194.method228(0, field8, 375);
			field1195.method228(729, field8, 5);
			field1196.method228(752, field8, 231);
			field1197.method228(0, field8, 0);
			field1198.method228(561, field8, 0);
			field1199.method228(520, field8, 11);
			field1200.method228(520, field8, 231);
			field1201.method228(501, field8, 375);
			field1202.method228(0, field8, 345);
			field982 = true;
			field897 = true;
			field1203 = true;
			field899 = true;

			if (field1181 != 2) {
				field888.method228(8, field8, 11);
				field887.method228(561, field8, 5);
			}
		}

		if (field1181 == 2) {
			method370();
		}

		if (field1062 && field910 == 1) {
			field982 = true;
		}

		if (field1192 != -1) {
			boolean var1 = method372(field1192, field977);
			if (var1) {
				field982 = true;
			}
		}

		if (field1034 == 2) {
			field982 = true;
		}

		if (field1007 == 2) {
			field982 = true;
		}

		if (field982) {
			method429();
			field982 = false;
		}

		if (field940 == -1) {
			field1103.field796 = field919 - field971 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method424(false, field919, field15 - 22, field1103, 463, 77, field16 - 375, 0);
			}

			int var2 = field919 - field1103.field796 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field919 - 77) {
				var2 = field919 - 77;
			}

			if (field971 != var2) {
				field971 = var2;
				field897 = true;
			}
		}

		if (field940 != -1) {
			boolean var3 = method372(field940, field977);
			if (var3) {
				field897 = true;
			}
		}

		if (field1034 == 3) {
			field897 = true;
		}

		if (field1007 == 3) {
			field897 = true;
		}

		if (field897) {
			method443();
			field897 = false;
		}

		if (field1181 == 2) {
			if (field906 && field1141 == 0 && field994 - field882 > 25) {
				field882 = field994;
				field881 = 1 - field881;
				if (field881 == 0) {
					method426();
				} else {
					field887.method228(561, field8, 5);
				}
			}

			if (!field906) {
				method426();
				field887.method228(561, field8, 5);
			}
		}

		if (field1203) {
			field1203 = false;
			field1156.method227();
			field1161.method180(0, 0);

			if (field1192 == -1) {
				if (field1124 == 0) {
					field891.method180(30, 29);
				}

				if (field1124 == 1) {
					field892.method180(29, 59);
				}

				if (field1124 == 2) {
					field892.method180(29, 87);
				}

				if (field1124 == 3) {
					field893.method180(29, 115);
				}

				if (field1124 == 4) {
					field895.method180(29, 156);
				}

				if (field1124 == 5) {
					field895.method180(29, 184);
				}

				if (field1124 == 6) {
					field894.method180(30, 212);
				}

				field1091.method180(33, 39);
			}

			field1156.method228(520, field8, 165);
			field1155.method227();
			field1160.method180(0, 0);

			if (field1192 == -1) {
				if (field1124 == 7) {
					field963.method180(0, 49);
				}

				if (field1124 == 8) {
					field964.method180(0, 81);
				}

				if (field1124 == 9) {
					field964.method180(0, 108);
				}

				if (field1124 == 10) {
					field965.method180(1, 136);
				}

				if (field1124 == 11) {
					field967.method180(0, 178);
				}

				if (field1124 == 12) {
					field967.method180(0, 205);
				}

				if (field1124 == 13) {
					field966.method180(0, 233);
				}

				field1092.method180(4, 83);
			}

			field1155.method228(501, field8, 492);
			field888.method227();
		}

		if (field899) {
			field899 = false;
			field1154.method227();
			field1159.method180(0, 0);
			field916.method183(33, 57, 0xFFFFFF, "Public chat", true);

			if (field1188 == 0) {
				field916.method183(46, 57, 0xFF00, "On", true);
			}

			if (field1188 == 1) {
				field916.method183(46, 57, 0xFFFF00, "Friends", true);
			}

			if (field1188 == 2) {
				field916.method183(46, 57, 0xFF0000, "Off", true);
			}

			field916.method183(33, 186, 0xFFFFFF, "Private chat", true);

			if (field997 == 0) {
				field916.method183(46, 186, 0xFF00, "On", true);
			}

			if (field997 == 1) {
				field916.method183(46, 186, 0xFFFF00, "Friends", true);
			}

			if (field997 == 2) {
				field916.method183(46, 186, 0xFF0000, "Off", true);
			}

			field916.method183(33, 326, 0xFFFFFF, "Trade/duel", true);

			if (field1047 == 0) {
				field916.method183(46, 326, 0xFF00, "On", true);
			}

			if (field1047 == 1) {
				field916.method183(46, 326, 0xFFFF00, "Friends", true);
			}

			if (field1047 == 2) {
				field916.method183(46, 326, 0xFF0000, "Off", true);
			}

			field1154.method228(0, field8, 471);
			field888.method227();
		}

		field977 = 0;
	}

	@ObfuscatedName("client.e(B)Ljava/lang/String;")
	public final String method414() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.b(ILkb;I)V")
	public final void method415(class37 arg0, int arg1) {
		while (arg0.field538 + 21 < arg1 * 8) {
			int var3 = arg0.method212(13);
			if (var3 == 8191) {
				break;
			}

			if (field1176[var3] == null) {
				field1176[var3] = new class25();
			}

			class25 var4 = field1176[var3];
			field1178[field1177++] = var3;
			var4.field309 = field994;
			var4.field317 = class51.method259(arg0.method212(11));
			var4.field269 = var4.field317.field696;
			var4.field272 = var4.field317.field700;
			var4.field273 = var4.field317.field701;
			var4.field274 = var4.field317.field702;
			var4.field275 = var4.field317.field703;
			var4.field270 = var4.field317.field699;
			int var5 = arg0.method212(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method212(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method106(field936.field313[0] + var5, field936.field314[0] + var6);
			int var7 = arg0.method212(1);
			if (var7 == 1) {
				field990[field989++] = var3;
			}
		}

		arg0.method213();
	}

	public static final void main(String[] arg0) {
		try {
			signlink.startpriv(InetAddress.getLocalHost());
			client var1 = new client();
			if (arg0.length > 0) {
				var1.field955 = Integer.parseInt(arg0[0]);
			}

			if (arg0.length > 1) {
				var1.field1133 = Integer.parseInt(arg0[1]);
			}

			if (arg0.length > 2 && arg0[2].equalsIgnoreCase("lowmem")) {
				method419();
			} else {
				method438();
			}

			var1.method1(789, 532);
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IIILyb;I)V")
	public final void method416(int arg0, int arg1, int arg2, class51 arg3) {
		if (field947 < 400) {
			String var5 = arg3.field694;
			if (arg3.field712 != 0) {
				var5 = var5 + method387(arg3.field712, field936.field324) + " (level-" + arg3.field712 + ")";
			}

			if (field948 == 1) {
				field956[field947] = "Use " + field952 + " with @yel@" + var5;
				field1069[field947] = 985;
				field1070[field947] = arg1;
				field1067[field947] = arg2;
				field1068[field947] = arg0;
				field947++;
			} else if (field943 != 1) {
				if (arg3.field707 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg3.field707[var6] != null) {
							field956[field947] = arg3.field707[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1069[field947] = 490;
							}

							if (var6 == 1) {
								field1069[field947] = 914;
							}

							if (var6 == 2) {
								field1069[field947] = 75;
							}

							if (var6 == 3) {
								field1069[field947] = 486;
							}

							if (var6 == 4) {
								field1069[field947] = 772;
							}

							field1070[field947] = arg1;
							field1067[field947] = arg2;
							field1068[field947] = arg0;
							field947++;
						}
					}
				}

				field956[field947] = "Examine @yel@" + var5;
				field1069[field947] = 1318;
				field1070[field947] = arg1;
				field1067[field947] = arg2;
				field1068[field947] = arg0;
				field947++;
			} else if ((field945 & 0x2) == 2) {
				field956[field947] = field946 + " @yel@" + var5;
				field1069[field947] = 946;
				field1070[field947] = arg1;
				field1067[field947] = arg2;
				field1068[field947] = arg0;
				field947++;
				return;
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method417() {
		for (class27 var1 = (class27) field1082.method220(); var1 != null; var1 = (class27) field1082.method222()) {
			if (field958 != var1.field340 || field994 > var1.field346) {
				var1.method104();
			} else if (field994 >= var1.field345) {
				if (var1.field349 > 0) {
					class25 var2 = field1176[var1.field349 - 1];
					if (var2 != null) {
						var1.method113(method341(var2.field265, var2.field266, var1.field340) - var1.field344, var2.field266, field994, var2.field265);
					}
				}

				if (var1.field349 < 0) {
					int var3 = -var1.field349 - 1;
					class26 var4;
					if (field925 == var3) {
						var4 = field936;
					} else {
						var4 = field986[var3];
					}

					if (var4 != null) {
						var1.method113(method341(var4.field265, var4.field266, var1.field340) - var1.field344, var4.field266, field994, var4.field265);
					}
				}

				var1.method114(field977);
				field976.method61(null, (int) var1.field353, (int) var1.field352, var1.field359, (int) var1.field351, field958, 0, var1, 60, -1);
			}
		}
	}

	@ObfuscatedName("client.a(IILkb;)V")
	public final void method418(int arg0, class37 arg1) {
		for (int var3 = 0; var3 < field989; var3++) {
			int var4 = field990[var3];
			class25 var5 = field1176[var4];
			int var6 = arg1.method201();
			if ((var6 & 0x2) == 2) {
				int var7 = arg1.method203();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.field292 == var7) {
					var5.field296 = 0;
				}

				int var8 = arg1.method201();
				if (var7 == -1 || var5.field292 == -1 || class59.field843[var7].field851 > class59.field843[var5.field292].field851 || class59.field843[var5.field292].field851 == 0) {
					var5.field292 = var7;
					var5.field293 = 0;
					var5.field294 = 0;
					var5.field295 = var8;
					var5.field296 = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field286 = arg1.method203();
				if (var5.field286 == 0xFFFF) {
					var5.field286 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field277 = arg1.method208();
				var5.field278 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.field281 = arg1.method201();
				var5.field282 = arg1.method201();
				var5.field283 = field994 + 400;
				var5.field284 = arg1.method201();
				var5.field285 = arg1.method201();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field317 = class51.method259(arg1.method203());
				var5.field272 = var5.field317.field700;
				var5.field273 = var5.field317.field701;
				var5.field274 = var5.field317.field702;
				var5.field275 = var5.field317.field703;
				var5.field270 = var5.field317.field699;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field297 = arg1.method203();
				int var9 = arg1.method206();
				var5.field301 = var9 >> 16;
				var5.field300 = (var9 & 0xFFFF) + field994;
				var5.field298 = 0;
				var5.field299 = 0;

				if (var5.field300 > field994) {
					var5.field298 = -1;
				}

				if (var5.field297 == 0xFFFF) {
					var5.field297 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field287 = arg1.method203();
				var5.field288 = arg1.method203();
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public static final void method419() {
		class18.field192 = true;
		class33.field489 = true;
		field906 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method420() {
		for (int var1 = -1; var1 < field987; var1++) {
			class26 var2;
			int var3;
			if (var1 == -1) {
				var2 = field936;
				var3 = field985 << 14;
			} else {
				var2 = field986[field988[var1]];
				var3 = field988[var1] << 14;
			}

			if (var2 != null && var2.method108()) {
				var2.field337 = false;
				if ((field906 && field987 > 50 || field987 > 200) && var1 != -1 && var2.field289 == var2.field270) {
					var2.field337 = true;
				}

				int var4 = var2.field265 >> 7;
				int var5 = var2.field266 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field332 == null || field994 < var2.field327 || field994 >= var2.field328) {
						if ((var2.field265 & 0x7F) == 0x40 && (var2.field266 & 0x7F) == 0x40) {
							if (field1098[var4][var5] == field1011) {
								continue;
							}

							field1098[var4][var5] = field1011;
						}

						var2.field326 = method341(var2.field265, var2.field266, field958);
						field976.method61(null, var2.field326, var2.field266, var2.field267, var2.field265, field958, var2.field268, var2, 60, var3);
					} else {
						var2.field337 = false;
						var2.field326 = method341(var2.field265, var2.field266, field958);
						field976.method62(60, var2.field334, null, var2.field333, var2.field267, var2.field265, var2.field266, var3, var2.field326, var2, var2.field335, var2.field336, field958);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field999 != null) {
				field999.method28();
			}
		} catch (Exception var1) {
		}

		field999 = null;
		signlink.midi = "null";
		field1171 = null;
		field1152 = null;
		field1118 = null;
		field1074 = null;
		field1175 = null;
		field1099 = null;
		field961 = null;
		field898 = null;
		field976 = null;
		field972 = null;
		field1079 = null;
		field1127 = null;
		field959 = null;
		field960 = null;
		field1071 = null;
		field886 = null;
		field887 = null;
		field888 = null;
		field889 = null;
		field1154 = null;
		field1155 = null;
		field1156 = null;
		field1193 = null;
		field1194 = null;
		field1195 = null;
		field1196 = null;
		field1197 = null;
		field1198 = null;
		field1199 = null;
		field1200 = null;
		field1201 = null;
		field1202 = null;
		field930 = null;
		field931 = null;
		field932 = null;
		field1159 = null;
		field1160 = null;
		field1161 = null;
		field1091 = null;
		field1092 = null;
		field891 = null;
		field892 = null;
		field893 = null;
		field894 = null;
		field895 = null;
		field963 = null;
		field964 = null;
		field965 = null;
		field966 = null;
		field967 = null;
		field1115 = null;
		field1191 = null;
		field1065 = null;
		field1170 = null;
		field1050 = null;
		field1051 = null;
		field1052 = null;
		field1053 = null;
		field954 = null;
		field1102 = null;
		field1098 = null;
		field986 = null;
		field988 = null;
		field990 = null;
		field991 = null;
		field1059 = null;
		field1176 = null;
		field1178 = null;
		field908 = null;
		field981 = null;
		field896 = null;
		field1082 = null;
		field900 = null;
		field1158 = null;
		field1067 = null;
		field1068 = null;
		field1069 = null;
		field1070 = null;
		field956 = null;
		field1048 = null;
		field1003 = null;
		field1004 = null;
		field1096 = null;
		field1166 = null;
		field939 = null;
		field1183 = null;
		field1013 = null;
		field1109 = null;
		field1110 = null;
		field1106 = null;
		field1107 = null;
		field1108 = null;
		field1111 = null;
		field1112 = null;
		field1113 = null;
		field1114 = null;
		method441();
		class50.method252();
		class51.method258();
		class52.method264();
		class55.field759 = null;
		class56.field771 = null;
		class57.field777 = null;
		class58.field836 = null;
		class59.field843 = null;
		class60.field856 = null;
		class60.field863 = null;
		class61.field865 = null;
		field9 = null;
		class26.field338 = null;
		class33.method149();
		class18.method49();
		class31.method117();
		class6.field64 = null;
		class7.field68 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IZIIII)V")
	public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1189.method180(arg0, arg1);
		field1190.method180(arg0 + arg4 - 16, arg1);
		class32.method145(field1100, arg4 - 32, arg0 + 16, 16, arg1);
		int var6 = (arg4 - 32) * arg4 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg3 / (arg2 - arg4);
		class32.method145(field1119, var6, arg0 + var7 + 16, 16, arg1);
		class32.method148(field1095, arg0 + var7 + 16, arg1, var6);
		class32.method148(field1095, arg0 + var7 + 16, arg1 + 1, var6);
		class32.method147(16, arg1, arg0 + var7 + 16, field1095);
		class32.method147(16, arg1, arg0 + var7 + 17, field1095);
		class32.method148(field1066, arg0 + var7 + 16, arg1 + 15, var6);
		class32.method148(field1066, arg0 + var7 + 17, arg1 + 14, var6 - 1);
		class32.method147(16, arg1, arg0 + var7 + var6 + 15, field1066);
		class32.method147(15, arg1 + 1, arg0 + 14 + var7 + var6, field1066);
	}

	@ObfuscatedName("client.a(BLib;)V")
	public final void method422(class35 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1168.length; var3++) {
			field1168[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1168[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1169[var9] = (field1168[var9 - 1] + field1168[var9 + 1] + field1168[var9 - 128] + field1168[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1168;
			field1168 = field1169;
			field1169 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field522; var12++) {
				for (int var13 = 0; var13 < arg0.field521; var13++) {
					if (arg0.field519[var11++] != 0) {
						int var14 = var13 + arg0.field523 + 16;
						int var15 = var12 + arg0.field524 + 16;
						int var16 = (var15 << 7) + var14;
						field1168[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		signlink.midi = "scape_main";

		if (field1017) {
			field1184 = true;
		} else {
			field1017 = true;
			boolean var1 = false;
			String var2 = method414();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.252")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}

			if (var2.endsWith("69.1.68.43")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				try {
					int var3 = 5;
					field953[7] = 0;
					while (field953[7] == 0) {
						method13(10, "Connecting to fileserver");

						try {
							DataInputStream var4 = method428("crc" + (int) (Math.random() * 9.9999999E7D));
							class37 var5 = new class37(new byte[32]);
							var4.readFully(var5.field536, 0, 32);

							for (int var6 = 0; var6 < 8; var6++) {
								field953[var6] = var5.method206();
							}

							var4.close();
						} catch (IOException var50) {
							for (int var7 = var3; var7 > 0; var7--) {
								method13(10, "Error loading - Will retry in " + var7 + " secs.");

								try {
									Thread.sleep(1000L);
								} catch (Exception var45) {
								}
							}

							var3 *= 2;
							if (var3 > 60) {
								var3 = 60;
							}
						}
					}

					field968 = method349(field953[1], "title screen", 10, "title");
					field915 = new class36(field968, "p11");
					field916 = new class36(field968, "p12");
					field917 = new class36(field968, "b12");
					field918 = new class36(field968, "q8");
					method430();
					method381();
					class47 var8 = method349(field953[2], "config", 20, "config");
					class47 var9 = method349(field953[3], "interface", 30, "interface");
					class47 var10 = method349(field953[4], "2d graphics", 40, "media");
					class47 var11 = method349(field953[5], "3d graphics", 50, "models");
					class47 var12 = method349(field953[6], "textures", 60, "textures");
					class47 var13 = method349(field953[7], "chat system", 70, "wordenc");
					field898 = new byte[4][104][104];
					field961 = new int[4][105][105];
					field976 = new class18(field961, 4, 104, 104);

					for (int var14 = 0; var14 < 4; var14++) {
						field972[var14] = new class54(104, 104);
					}

					field1166 = new class34(512, 512);
					method13(80, "Unpacking media");
					field930 = new class35(var10, "invback", 0);
					field932 = new class35(var10, "chatback", 0);
					field931 = new class35(var10, "mapback", 0);
					field1159 = new class35(var10, "backbase1", 0);
					field1160 = new class35(var10, "backbase2", 0);
					field1161 = new class35(var10, "backhmid1", 0);
					field1091 = new class35(var10, "sideicons1", 0);
					field1092 = new class35(var10, "sideicons2", 0);
					field1115 = new class34(var10, "compass", 0);

					try {
						for (int var15 = 0; var15 < 50; var15++) {
							field954[var15] = new class35(var10, "mapscene", var15);
						}
					} catch (Exception var49) {
					}

					try {
						for (int var16 = 0; var16 < 50; var16++) {
							field1102[var16] = new class34(var10, "mapfunction", var16);
						}
					} catch (Exception var48) {
					}

					try {
						for (int var17 = 0; var17 < 20; var17++) {
							field1191[var17] = new class34(var10, "hitmarks", var17);
						}
					} catch (Exception var47) {
					}

					try {
						for (int var18 = 0; var18 < 20; var18++) {
							field1065[var18] = new class34(var10, "headicons", var18);
						}
					} catch (Exception var46) {
					}

					for (int var19 = 0; var19 < 8; var19++) {
						field1170[var19] = new class34(var10, "cross", var19);
					}

					field1050 = new class34(var10, "mapdots", 0);
					field1051 = new class34(var10, "mapdots", 1);
					field1052 = new class34(var10, "mapdots", 2);
					field1053 = new class34(var10, "mapdots", 3);
					field1189 = new class35(var10, "scrollbar", 0);
					field1190 = new class35(var10, "scrollbar", 1);
					field891 = new class35(var10, "redstone1", 0);
					field892 = new class35(var10, "redstone2", 0);
					field893 = new class35(var10, "redstone3", 0);
					field894 = new class35(var10, "redstone1", 0);
					field894.method178();
					field895 = new class35(var10, "redstone2", 0);
					field895.method178();
					field963 = new class35(var10, "redstone1", 0);
					field963.method179();
					field964 = new class35(var10, "redstone2", 0);
					field964.method179();
					field965 = new class35(var10, "redstone3", 0);
					field965.method179();
					field966 = new class35(var10, "redstone1", 0);
					field966.method178();
					field966.method179();
					field967 = new class35(var10, "redstone2", 0);
					field967.method178();
					field967.method179();
					class34 var20 = new class34(var10, "backleft1", 0);
					field1193 = new class43(var20.field514, method11(), var20.field513);
					var20.method167(0, 0);
					class34 var21 = new class34(var10, "backleft2", 0);
					field1194 = new class43(var21.field514, method11(), var21.field513);
					var21.method167(0, 0);
					class34 var22 = new class34(var10, "backright1", 0);
					field1195 = new class43(var22.field514, method11(), var22.field513);
					var22.method167(0, 0);
					class34 var23 = new class34(var10, "backright2", 0);
					field1196 = new class43(var23.field514, method11(), var23.field513);
					var23.method167(0, 0);
					class34 var24 = new class34(var10, "backtop1", 0);
					field1197 = new class43(var24.field514, method11(), var24.field513);
					var24.method167(0, 0);
					class34 var25 = new class34(var10, "backtop2", 0);
					field1198 = new class43(var25.field514, method11(), var25.field513);
					var25.method167(0, 0);
					class34 var26 = new class34(var10, "backvmid1", 0);
					field1199 = new class43(var26.field514, method11(), var26.field513);
					var26.method167(0, 0);
					class34 var27 = new class34(var10, "backvmid2", 0);
					field1200 = new class43(var27.field514, method11(), var27.field513);
					var27.method167(0, 0);
					class34 var28 = new class34(var10, "backvmid3", 0);
					field1201 = new class43(var28.field514, method11(), var28.field513);
					var28.method167(0, 0);
					class34 var29 = new class34(var10, "backhmid2", 0);
					field1202 = new class43(var29.field514, method11(), var29.field513);
					var29.method167(0, 0);
					method13(85, "Unpacking textures");
					class33.method154(var12);
					class33.method158(0.8D);
					class33.method153(20);
					method13(85, "Unpacking models");
					class31.method118(var11);
					class6.method47(var11);
					class7.method48(var11);
					method13(85, "Unpacking config");
					class59.method295(var8);
					class50.method251(var8);
					class55.method284(var8);
					class52.method263(var8);
					class51.method257(var8);
					class56.method287(var8);
					class60.method297(var8);
					class61.method300(var8);
					method13(90, "Unpacking interfaces");
					class36[] var30 = new class36[] { field915, field916, field917, field918 };
					class57.method291(var10, var9, var30);
					method13(95, "Preparing game engine");

					for (int var31 = 0; var31 < 33; var31++) {
						int var32 = 999;
						int var33 = 0;
						for (int var34 = 0; var34 < 35; var34++) {
							if (field931.field519[field931.field521 * var31 + var34] == 0) {
								if (var32 == 999) {
									var32 = var34;
								}
							} else if (var32 != 999) {
								var33 = var34;
								break;
							}
						}

						field1042[var31] = var32;
						field1016[var31] = var33 - var32;
					}

					for (int var35 = 9; var35 < 160; var35++) {
						int var36 = 999;
						int var37 = 0;
						for (int var38 = 10; var38 < 168; var38++) {
							if (field931.field519[field931.field521 * var35 + var38] == 0 && (var38 > 34 || var35 > 34)) {
								if (var36 == 999) {
									var36 = var38;
								}
							} else if (var36 != 999) {
								var37 = var38;
								break;
							}
						}

						field1030[var35 - 9] = var36 - 21;
						field1081[var35 - 9] = var37 - var36;
					}

					class33.method151(479, 96);
					field1149 = class33.field500;
					class33.method151(190, 261);
					field1150 = class33.field500;
					class33.method151(512, 334);
					field1151 = class33.field500;
					int[] var39 = new int[9];
					for (int var40 = 0; var40 < 9; var40++) {
						int var41 = var40 * 32 + 128 + 15;
						int var42 = var41 * 3 + 600;
						int var43 = class33.field498[var41];
						var39[var40] = var42 * var43 >> 16;
					}

					class18.method84(512, 334, var39, 800, 500);
					class62.method302(var13);
				} catch (Exception var51) {
					field1057 = true;
				}
			} else {
				field1132 = true;
			}
		}
	}

	@ObfuscatedName("client.H(I)Ljava/net/Socket;")
	public final Socket method423(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	public final String getjingle() {
		if (signlink.jingle == null) {
			return "none";
		} else {
			String var1 = signlink.jingle + ".mid.gz";
			signlink.jingle = null;
			return var1;
		}
	}

	@ObfuscatedName("client.a(ZIILec;IBIII)V")
	public final void method424(boolean arg0, int arg1, int arg2, class57 arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field996) {
			field1116 = 32;
		} else {
			field1116 = 0;
		}

		field996 = false;
		if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg7 && arg6 < arg7 + 16) {
			arg3.field796 -= field1001 * 4;

			if (arg0) {
				field982 = true;
				return;
			}
		} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg5 + arg7 - 16 && arg6 < arg5 + arg7) {
			arg3.field796 += field1001 * 4;

			if (arg0) {
				field982 = true;
				return;
			}
		} else if (arg2 >= arg4 - field1116 && arg2 < arg4 + field1116 + 16 && arg6 >= arg7 + 16 && arg6 < arg5 + arg7 - 16 && field1001 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg7 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg3.field796 = (arg1 - arg5) * var10 / var11;

			if (arg0) {
				field982 = true;
			}

			field996 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method425() {
		if (field1007 == 0) {
			int var1 = field17;
			if (field943 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
				var1 = 0;
			}

			if (field1062) {
				if (var1 != 1) {
					int var2 = field15;
					int var3 = field16;
					if (field910 == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (field910 == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (var2 < field911 - 10 || var2 > field913 + field911 + 10 || var3 < field912 - 10 || var3 > field914 + field912 + 10) {
						field1062 = false;

						if (field910 == 1) {
							field982 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field911;
					int var5 = field912;
					int var6 = field913;
					int var7 = field18;
					int var8 = field19;
					if (field910 == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (field910 == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field947; var10++) {
						int var11 = (field947 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method384(var9);
					}

					field1062 = false;

					if (field910 == 1) {
						field982 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field947 > 0) {
					int var12 = field1069[field947 - 1];
					if (var12 == 288 || var12 == 776 || var12 == 857 || var12 == 881 || var12 == 688 || var12 == 649 || var12 == 408 || var12 == 176 || var12 == 294 || var12 == 622 || var12 == 517) {
						int var13 = field1067[field947 - 1];
						int var14 = field1068[field947 - 1];
						class57 var15 = class57.field777[var14];
						if (var15.field803) {
							field942 = false;
							field1005 = var14;
							field1006 = var13;
							field1007 = 2;
							field1008 = field18;
							field1009 = field19;

							if (class57.field777[var14].field783 == field1174) {
								field1007 = 1;
							}

							if (class57.field777[var14].field783 == field940) {
								field1007 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && field983 == 1 && field947 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field947 > 0) {
					method384(field947 - 1);
				}

				if (var1 != 2 || field947 <= 0) {
					return;
				}

				method355();
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method426() {
		field887.method227();
		int var1 = field936.field265 / 32 + 48;
		int var2 = 464 - field936.field266 / 32;
		field1166.method173(field1081, 146, 151, field1030, 21, 9, var1, field1140, var2);
		field1115.method173(field1016, 33, 33, field1042, 0, 0, 25, field1140, 25);

		for (int var3 = 0; var3 < field1002; var3++) {
			int var4 = field1003[var3] * 4 + 2 - field936.field265 / 32;
			int var5 = field1004[var3] * 4 + 2 - field936.field266 / 32;
			method434(var5, field1096[var3], var4);
		}

		for (int var6 = 0; var6 < 104; var6++) {
			for (int var7 = 0; var7 < 104; var7++) {
				class41 var8 = field908[field958][var6][var7];
				if (var8 != null) {
					int var9 = var6 * 4 + 2 - field936.field265 / 32;
					int var10 = var7 * 4 + 2 - field936.field266 / 32;
					method434(var10, field1050, var9);
				}
			}
		}

		for (int var11 = 0; var11 < field1177; var11++) {
			class25 var12 = field1176[field1178[var11]];
			if (var12 != null && var12.method108() && var12.field317.field711) {
				int var13 = var12.field265 / 32 - field936.field265 / 32;
				int var14 = var12.field266 / 32 - field936.field266 / 32;
				method434(var14, field1051, var13);
			}
		}

		for (int var15 = 0; var15 < field987; var15++) {
			class26 var16 = field986[field988[var15]];
			if (var16 != null && var16.method108()) {
				int var17 = var16.field265 / 32 - field936.field265 / 32;
				int var18 = var16.field266 / 32 - field936.field266 / 32;
				boolean var19 = false;
				long var20 = class48.method243(var16.field318);
				for (int var22 = 0; var22 < field883; var22++) {
					if (field1183[var22] == var20 && field1013[var22] != 0) {
						var19 = true;
						break;
					}
				}

				if (var19) {
					method434(var18, field1053, var17);
				} else {
					method434(var18, field1052, var17);
				}
			}
		}

		class32.method145(0xFFFFFF, 3, 82, 3, 93);
		field888.method227();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public final void method427(String arg0, String arg1, int arg2, boolean arg3) {
		signlink.errorname = arg0;

		try {
			if (!arg3) {
				field1185 = "";
				field1186 = "Connecting to server...";
				method399();
			}

			field999 = new class4(this, method423(field1133 + 43594));
			field999.method31(field1118.field536, 0, 8);
			field1118.field537 = 0;
			field1064 = field1118.method207();
			int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1064 >> 32), (int) field1064 };
			field1171.field537 = 0;
			field1171.method193(10);
			field1171.method196(var5[0]);
			field1171.method196(var5[1]);
			field1171.method196(var5[2]);
			field1171.method196(var5[3]);
			field1171.method196(arg2);
			field1171.method198(arg0);
			field1171.method198(arg1);
			field1171.method216(field1015, field933);
			field1152.field537 = 0;

			if (arg3) {
				field1152.method193(18);
			} else {
				field1152.method193(16);
			}

			field1152.method193(field1171.field537 + 32 + 1);
			field1152.method193(194);

			for (int var6 = 0; var6 < 8; var6++) {
				field1152.method196(field953[var6]);
			}

			field1152.method199(field1171.field536, 0, field1171.field537);
			field1171.field541 = new class46(var5);

			for (int var7 = 0; var7 < 4; var7++) {
				var5[var7] += 50;
			}

			field890 = new class46(var5);
			field999.method32(field1152.field536, field1152.field537, 0);
			int var8 = field999.method29();
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var16) {
				}

				method427(arg0, arg1, arg2, arg3);
				return;
			}

			if (var8 == 2) {
				field969 = true;
				field1171.field537 = 0;
				field1118.field537 = 0;
				field1038 = -1;
				field1120 = -1;
				field1121 = -1;
				field1122 = -1;
				field1037 = 0;
				field1039 = 0;
				field973 = 0;
				field947 = 0;
				field1062 = false;
				field13 = 0;

				for (int var9 = 0; var9 < 100; var9++) {
					field1041[var9] = null;
				}

				field948 = 0;
				field943 = 0;
				field1181 = 0;
				field1097 = -1;
				field987 = 0;
				field1177 = 0;

				for (int var10 = 0; var10 < field984; var10++) {
					field986[var10] = null;
					field991[var10] = null;
				}

				for (int var11 = 0; var11 < 8192; var11++) {
					field1176[var11] = null;
				}

				field936 = field986[field985] = new class26();
				field1082.method224();
				field900.method224();
				field896.method224();

				for (int var12 = 0; var12 < 4; var12++) {
					for (int var13 = 0; var13 < 104; var13++) {
						for (int var14 = 0; var14 < 104; var14++) {
							field908[var12][var13][var14] = null;
						}
					}
				}

				field981 = new class41();
				field883 = 0;
				field940 = -1;
				field1174 = -1;
				field1192 = -1;
				field1105 = false;
				field1124 = 3;
				field998 = false;
				field1062 = false;
				field974 = false;
				field941 = 0;
				field1182 = true;
				method367();

				for (int var15 = 0; var15 < 5; var15++) {
					field1018[var15] = 0;
				}

				method366();

				if (field1133 >= 3) {
					class5.method33();
				}

				return;
			}

			if (var8 == 3) {
				field1185 = "";
				field1186 = "Invalid username or password.";
				return;
			}

			if (var8 == 4) {
				field1185 = "Your account has been disabled.";
				field1186 = "Please check your message-centre for details.";
				return;
			}

			if (var8 == 5) {
				field1185 = "Your account is already logged in.";
				field1186 = "Try again in 60 secs...";
				return;
			}

			if (var8 == 6) {
				field1185 = "RuneScape has been updated!";
				field1186 = "Please reload this page.";
				return;
			}

			if (var8 == 7) {
				field1185 = "This world is full.";
				field1186 = "Please use a different world.";
				return;
			}

			if (var8 == 8) {
				field1185 = "Unable to connect.";
				field1186 = "Login server offline.";
				return;
			}

			if (var8 == 9) {
				field1185 = "Login limit exceeded.";
				field1186 = "Too many connections from your address.";
				return;
			}

			if (var8 == 10) {
				field1185 = "Unable to connect.";
				field1186 = "Bad session id.";
				return;
			}

			if (var8 == 11) {
				field1186 = "Login server rejected session.";
				field1186 = "Please try again";
				return;
			}

			if (var8 == 12) {
				field1185 = "You need a members account to beta-test";
				field1186 = "Please subscribe, or play RS1 instead";
				return;
			}

			if (var8 == 13) {
				field1185 = "Could not complete login";
				field1186 = "Please try using a different world";
				return;
			}

			if (var8 == 14) {
				field1185 = "The server is being updated";
				field1186 = "Please wait 1 minute and try again";
				return;
			}

			if (var8 == 15) {
				field969 = true;
				field1171.field537 = 0;
				field1118.field537 = 0;
				field1038 = -1;
				field1120 = -1;
				field1121 = -1;
				field1122 = -1;
				field1037 = 0;
				field1039 = 0;
				field973 = 0;
				field947 = 0;
				field1062 = false;

				if (field1133 >= 3) {
					class5.method33();
				}

				return;
			}

			if (var8 == 16) {
				field1185 = "Login attempts exceeded";
				field1186 = "Please wait 1 minute and try again";
				return;
			}
		} catch (IOException var17) {
			field1185 = "";
			field1186 = "Error connecting to server.";
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

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method428(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.f(B)V")
	public final void method429() {
		field886.method227();
		class33.field500 = field1150;
		field930.method180(0, 0);

		if (field1192 != -1) {
			method378(class57.field777[field1192], 0, 0, 0);
		} else if (field935[field1124] != -1) {
			method378(class57.field777[field935[field1124]], 0, 0, 0);
		}

		if (field1062 && field910 == 1) {
			method401();
		}

		field886.method228(562, field8, 231);
		field888.method227();
		class33.field500 = field1151;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method430() {
		byte[] var1 = field968.method242(null, "title.dat");
		class34 var2 = new class34(var1, this);
		field1109.method227();
		var2.method167(0, 0);
		field1110.method227();
		var2.method167(0, -661);
		field1106.method227();
		var2.method167(0, -128);
		field1107.method227();
		var2.method167(-386, -214);
		field1108.method227();
		var2.method167(-186, -214);
		field1111.method227();
		var2.method167(-265, 0);
		field1112.method227();
		var2.method167(-265, -574);
		field1113.method227();
		var2.method167(-186, -128);
		field1114.method227();
		var2.method167(-186, -574);
		int[] var3 = new int[var2.field513];
		for (int var4 = 0; var4 < var2.field514; var4++) {
			for (int var5 = 0; var5 < var2.field513; var5++) {
				var3[var5] = var2.field512[var2.field513 * var4 + var2.field513 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field513; var6++) {
				var2.field512[var2.field513 * var4 + var6] = var3[var6];
			}
		}

		field1109.method227();
		var2.method167(0, 394);
		field1110.method227();
		var2.method167(0, -267);
		field1106.method227();
		var2.method167(0, 266);
		field1107.method227();
		var2.method167(-386, 180);
		field1108.method227();
		var2.method167(-186, 180);
		field1111.method227();
		var2.method167(-265, 394);
		field1112.method227();
		var2.method167(-265, -180);
		field1113.method227();
		var2.method167(-186, 212);
		field1114.method227();
		var2.method167(-186, -180);
		class34 var7 = new class34(field968, "logo", 0);
		field1106.method227();
		var7.method169(18, field6 / 2 - var7.field513 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method10() {
		field921 = true;
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method431(int arg0, int arg1, int arg2) {
		int var4 = field976.method74(arg2, arg1, arg0);
		if (var4 != 0) {
			int var5 = field976.method78(arg2, arg1, arg0, var4);
			int var6 = var5 >> 6 & 0x3;
			int var7 = var5 & 0x1F;
			int var8 = 0xEEEEEE;
			if (var4 > 0) {
				var8 = 0xEE0000;
			}

			int[] var9 = field1166.field512;
			int var10 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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
		}

		int var11 = field976.method76(arg2, arg1, arg0);
		if (var11 != 0) {
			int var12 = field976.method78(arg2, arg1, arg0, var11);
			int var13 = var12 >> 6 & 0x3;
			int var14 = var12 & 0x1F;
			if (var14 == 9) {
				int var15 = 0xEEEEEE;
				if (var11 > 0) {
					var15 = 0xEE0000;
				}

				int[] var16 = field1166.field512;
				int var17 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
				if (var13 == 0 || var13 == 2) {
					var16[var17 + 1536] = var15;
					var16[var17 + 1024 + 1] = var15;
					var16[var17 + 512 + 2] = var15;
					var16[var17 + 3] = var15;
				} else {
					var16[var17] = var15;
					var16[var17 + 512 + 1] = var15;
					var16[var17 + 1024 + 2] = var15;
					var16[var17 + 1536 + 3] = var15;
				}
			}

			if (var14 != 10 && var14 != 11) {
				return;
			}

			int var18 = var11 >> 14 & 0x7FFF;
			class50 var19 = class50.method253(var18);
			if (var19.field675 != -1) {
				class35 var20 = field954[var19.field675];
				int var21 = (var19.field660 * 4 - var20.field521) / 2;
				int var22 = (var19.field661 * 4 - var20.field522) / 2;
				var20.method180((104 - arg0 - var19.field661) * 4 + var22 + 48, arg1 * 4 + 48 + var21);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method432(int arg0) {
		int[] var2 = field1166.field512;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field898[arg0][var7][var5] & 0x18) == 0) {
					field976.method83(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field898[arg0 + 1][var7][var5] & 0x8) != 0) {
					field976.method83(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field1166.method166();

		for (int var8 = 1; var8 < 103; var8++) {
			for (int var9 = 1; var9 < 103; var9++) {
				if ((field898[arg0][var9][var8] & 0x18) == 0) {
					method431(var8, var9, arg0);
				}

				if (arg0 < 3 && (field898[arg0 + 1][var9][var8] & 0x8) != 0) {
					method431(var8, var9, arg0 + 1);
				}
			}
		}

		field888.method227();
		field1002 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = field976.method77(field958, var10, var11);
				if (var12 != 0) {
					var12 = var12 >> 14 & 0x7FFF;
					int var13 = class50.method253(var12).field674;
					if (var13 >= 0) {
						field1096[field1002] = field1102[var13];
						field1003[field1002] = var10;
						field1004[field1002] = var11;
						field1002++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(BLec;)Z")
	public final boolean method433(class57 arg0) {
		if (arg0.field792 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field792.length; var2++) {
			int var3 = method348(var2, arg0);
			int var4 = arg0.field793[var2];
			if (arg0.field792[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field792[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field792[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	public final void init() {
		field1133 = Integer.parseInt(getParameter("portoff"));
		field955 = Integer.parseInt(getParameter("nodeid"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method419();
		} else {
			method438();
		}

		method2(789, 532);
	}

	public final String gettune() {
		if (signlink.midi == null) {
			return "none";
		} else {
			String var1 = signlink.midi + ".mid.gz";
			signlink.midi = null;
			return var1;
		}
	}

	@ObfuscatedName("client.a(BILhb;I)V")
	public final void method434(int arg0, class34 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 <= 6400) {
			int var5 = class31.field475[field1140];
			int var6 = class31.field476[field1140];
			int var7 = arg0 * var5 + arg2 * var6 >> 16;
			int var8 = arg0 * var6 - arg2 * var5 >> 16;
			if (var4 > 2500) {
				arg1.method174(var7 + 94 - arg1.field513 / 2, field931, 83 - var8 - arg1.field514 / 2);
			} else {
				arg1.method169(83 - var8 - arg1.field514 / 2, var7 + 94 - arg1.field513 / 2);
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIII)V")
	public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 1 && arg2 >= 1 && arg3 <= 102 && arg2 <= 102) {
			if (field906 && field958 != arg0) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field976.method74(arg0, arg3, arg2);
			}

			if (arg4 == 1) {
				var8 = field976.method75(arg3, arg2, arg0);
			}

			if (arg4 == 2) {
				var8 = field976.method76(arg0, arg3, arg2);
			}

			if (arg4 == 3) {
				var8 = field976.method77(arg0, arg3, arg2);
			}

			if (var8 != 0) {
				int var12 = field976.method78(arg0, arg3, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field976.method69(arg0, arg3, arg2);
					class50 var16 = class50.method253(var13);
					if (var16.field662) {
						field972[arg0].method277(arg3, var15, var16.field663, arg2, var14);
					}
				}

				if (arg4 == 1) {
					field976.method70(arg3, arg0, arg2);
				}

				if (arg4 == 2) {
					field976.method71(arg2, arg0, arg3);
					class50 var17 = class50.method253(var13);
					if (var17.field660 + arg3 > 103 || var17.field660 + arg2 > 103 || var17.field661 + arg3 > 103 || var17.field661 + arg2 > 103) {
						return;
					}

					if (var17.field662) {
						field972[arg0].method278(arg2, var17.field661, var17.field663, var17.field660, var15, arg3);
					}
				}

				if (arg4 == 3) {
					field976.method72(arg2, arg3, arg0);
					class50 var18 = class50.method253(var13);
					if (var18.field662 && var18.field664) {
						field972[arg0].method280(arg3, arg2);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field898[1][arg3][arg2] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				class3.method27(arg5, field976, arg1, arg6, arg0, arg3, field972[arg0], field1158, field961, arg2, var19);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILz;III)V")
	public final void method436(class26 arg0, int arg1, int arg2, int arg3) {
		if (field936 != arg0 && field947 < 400) {
			String var5 = arg0.field318 + method387(arg0.field324, field936.field324) + " (level-" + arg0.field324 + ")";
			if (field948 == 1) {
				field956[field947] = "Use " + field952 + " with @whi@" + var5;
				field1069[field947] = 933;
				field1070[field947] = arg1;
				field1067[field947] = arg3;
				field1068[field947] = arg2;
				field947++;
			} else if (field943 != 1) {
				field956[field947] = "Follow @whi@" + var5;
				field1069[field947] = 900;
				field1070[field947] = arg1;
				field1067[field947] = arg3;
				field1068[field947] = arg2;
				field947++;
				field956[field947] = "Trade with @whi@" + var5;
				field1069[field947] = 364;
				field1070[field947] = arg1;
				field1067[field947] = arg3;
				field1068[field947] = arg2;
				field947++;

				if (field970 <= 0) {
					return;
				}

				field956[field947] = "Attack @whi@" + var5;
				field1069[field947] = 487;
				field1070[field947] = arg1;
				field1067[field947] = arg3;
				field1068[field947] = arg2;
				field947++;
			} else if ((field945 & 0x8) == 8) {
				field956[field947] = field946 + " @whi@" + var5;
				field1069[field947] = 989;
				field1070[field947] = arg1;
				field1067[field947] = arg3;
				field1068[field947] = arg2;
				field947++;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method437(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.J(I)V")
	public static final void method438() {
		class18.field192 = false;
		class33.field489 = false;
		field906 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.K(I)V")
	public final void method439() {
		for (int var1 = -1; var1 < field987; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field985;
			} else {
				var2 = field988[var1];
			}

			class26 var3 = field986[var2];
			if (var3 != null) {
				method407(1, var3);
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method440() {
		if (field947 >= 2 || field948 != 0 || field943 != 0) {
			String var1;
			if (field948 == 1 && field947 < 2) {
				var1 = "Use " + field952 + " with...";
			} else if (field943 == 1 && field947 < 2) {
				var1 = field946 + "...";
			} else {
				var1 = field956[field947 - 1];
			}

			if (field947 > 2) {
				var1 = var1 + "@whi@ / " + (field947 - 2) + " more options";
			}

			field917.method187(true, 4, 0xFFFFFF, 15, var1);
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method441() {
		field1123 = false;
		while (field962) {
			field1123 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1172 = null;
		field1173 = null;
		field1130 = null;
		field1026 = null;
		field1027 = null;
		field1028 = null;
		field1029 = null;
		field1168 = null;
		field1169 = null;
		field1024 = null;
		field1025 = null;
		field926 = null;
		field927 = null;
	}

	@ObfuscatedName("client.c(ILkb;I)V")
	public final void method442(int arg0, class37 arg1) {
		arg1.method211();
		int var3 = arg1.method212(1);
		if (var3 != 0) {
			int var4 = arg1.method212(2);
			if (var4 == 0) {
				field990[field989++] = field985;
			} else if (var4 == 1) {
				int var5 = arg1.method212(3);
				field936.method107(false, var5);
				int var6 = arg1.method212(1);
				if (var6 == 1) {
					field990[field989++] = field985;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method212(3);
				field936.method107(true, var7);
				int var8 = arg1.method212(3);
				field936.method107(true, var8);
				int var9 = arg1.method212(1);
				if (var9 == 1) {
					field990[field989++] = field985;
				}
			} else if (var4 == 3) {
				field958 = arg1.method212(2);
				int var10 = arg1.method212(7);
				int var11 = arg1.method212(7);
				field936.method106(var10, var11);
				int var12 = arg1.method212(1);
				if (var12 == 1) {
					field990[field989++] = field985;
				}
			}
		}
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

	@ObfuscatedName("client.g(B)V")
	public final void method443() {
		field889.method227();
		class33.field500 = field1149;
		field932.method180(0, 0);

		if (field974) {
			field917.method182(40, 0, 239, field934);
			field917.method182(60, 128, 239, field1104 + "*");
		} else if (field998) {
			field917.method182(40, 0, 239, "Enter amount to transfer:");
			field917.method182(60, 128, 239, field1162 + "*");
		} else if (field940 == -1) {
			int var1 = 0;
			class32.method143(77, 463, 0, 0);

			for (int var2 = 0; var2 < 50; var2++) {
				if (field1041[var2] != null) {
					int var3 = field905[var2];
					int var4 = field971 + 70 - var1 * 14;
					if (var3 == 0) {
						if (var4 > 0 && var4 < 110) {
							field918.method185(field1041[var2], 4, 0, var4);
						}

						var1++;
					}

					if (var3 == 1) {
						if (var4 > 0 && var4 < 110) {
							field918.method185(field1089[var2] + ":", 4, 0xFFFFFF, var4);
							field918.method185(field1041[var2], field918.method184(field1089[var2]) + 12, 255, var4);
						}

						var1++;
					}

					if (var3 == 2 && (field1188 == 0 || field1188 == 1 && method397(field1089[var2]))) {
						if (var4 > 0 && var4 < 110) {
							field918.method185(field1089[var2] + ":", 4, 0, var4);
							field918.method185(field1041[var2], field918.method184(field1089[var2]) + 12, 255, var4);
						}

						var1++;
					}

					if (var3 == 3 && (field997 == 0 || field997 == 1 && method397(field1089[var2]))) {
						if (var4 > 0 && var4 < 110) {
							field918.method185("From " + field1089[var2] + ":", 4, 0, var4);
							field918.method185(field1041[var2], field918.method184("From " + field1089[var2]) + 12, 0x800000, var4);
						}

						var1++;
					}

					if (var3 == 4 && (field1047 == 0 || field1047 == 1 && method397(field1089[var2]))) {
						if (var4 > 0 && var4 < 110) {
							field918.method185(field1089[var2] + " " + field1041[var2], 4, 0x800080, var4);
						}

						var1++;
					}

					if (var3 == 5 && field997 < 2) {
						if (var4 > 0 && var4 < 110) {
							field918.method185(field1041[var2], 4, 0x800000, var4);
						}

						var1++;
					}

					if (var3 == 6 && field997 < 2) {
						if (var4 > 0 && var4 < 110) {
							field918.method185("To " + field1089[var2] + ":", 4, 0, var4);
							field918.method185(field1041[var2], field918.method184("To " + field1089[var2]) + 12, 0x800000, var4);
						}

						var1++;
					}
				}
			}

			class32.method142();
			field919 = var1 * 14 + 7;
			if (field919 < 78) {
				field919 = 78;
			}

			method421(0, 463, field919, field919 - field971 - 77, 77);
			field918.method185(field1014 + "*", 3, 0, 90);
			class32.method147(479, 0, 77, 0);
		} else {
			method378(class57.field777[field940], 0, 0, 0);
		}

		field889.method228(22, field8, 375);
		field888.method227();
		class33.field500 = field1151;
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field920[var1] = var0 / 4;
		}
	}
}
