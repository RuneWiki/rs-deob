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

@ObfuscatedName("client")
public final class client extends class1 {

	@ObfuscatedName("client.ab")
	public class35 field883;

	@ObfuscatedName("client.bb")
	public class35 field884;

	@ObfuscatedName("client.cb")
	public static boolean field885;

	@ObfuscatedName("client.db")
	public int field886;

	@ObfuscatedName("client.eb")
	public int[] field887 = new int[8];

	@ObfuscatedName("client.fb")
	public int field888 = -1;

	@ObfuscatedName("client.gb")
	public int field889 = -1;

	@ObfuscatedName("client.ib")
	public int field890;

	@ObfuscatedName("client.jb")
	public int[] field891 = new int[1000];

	@ObfuscatedName("client.kb")
	public int[] field892 = new int[1000];

	@ObfuscatedName("client.lb")
	public static boolean field893 = true;

	@ObfuscatedName("client.nb")
	public class34 field894;

	@ObfuscatedName("client.ob")
	public class34 field895;

	@ObfuscatedName("client.pb")
	public class34 field896;

	@ObfuscatedName("client.qb")
	public int[] field897;

	@ObfuscatedName("client.tb")
	public int[][] field898 = new int[104][104];

	@ObfuscatedName("client.ub")
	public class45 field899;

	@ObfuscatedName("client.vb")
	public class40 field900 = new class40();

	@ObfuscatedName("client.wb")
	public boolean field901 = false;

	@ObfuscatedName("client.xb")
	public class56 field902 = new class56();

	@ObfuscatedName("client.yb")
	public boolean field903 = false;

	@ObfuscatedName("client.zb")
	public class33 field904;

	@ObfuscatedName("client.ac")
	public boolean field928 = false;

	@ObfuscatedName("client.bc")
	public boolean field929 = false;

	@ObfuscatedName("client.cc")
	public class36 field930 = class36.method176(1);

	@ObfuscatedName("client.dc")
	public int field931 = -1;

	@ObfuscatedName("client.ec")
	public int field932 = 0x23201B;

	@ObfuscatedName("client.fc")
	public int field933;

	@ObfuscatedName("client.gc")
	public int field934 = 3;

	@ObfuscatedName("client.hc")
	public int field935;

	@ObfuscatedName("client.ic")
	public int field936;

	@ObfuscatedName("client.D")
	public String[] field861 = new String[500];

	@ObfuscatedName("client.E")
	public class33[] field862 = new class33[20];

	@ObfuscatedName("client.F")
	public boolean field863 = false;

	@ObfuscatedName("client.I")
	public int[] field866 = new int[151];

	@ObfuscatedName("client.J")
	public int[] field867 = new int[50];

	@ObfuscatedName("client.K")
	public class53[] field868 = new class53[4];

	@ObfuscatedName("client.S")
	public boolean field876 = false;

	@ObfuscatedName("client.X")
	public class33[] field880 = new class33[20];

	@ObfuscatedName("client.Qb")
	public class36 field920 = class36.method176(1);

	@ObfuscatedName("client.Rb")
	public class40 field921 = new class40();

	@ObfuscatedName("client.Sb")
	public int field922 = -1;

	@ObfuscatedName("client.Yb")
	public int field927 = -1;

	@ObfuscatedName("client.sc")
	public boolean field945 = false;

	@ObfuscatedName("client.tc")
	public boolean field946 = true;

	@ObfuscatedName("client.xc")
	public boolean field950 = false;

	@ObfuscatedName("client.Bc")
	public CRC32 field954 = new CRC32();

	@ObfuscatedName("client.Cc")
	public int field955 = 2048;

	@ObfuscatedName("client.Dc")
	public int field956 = 2047;

	@ObfuscatedName("client.Ec")
	public class25[] field957 = new class25[field955];

	@ObfuscatedName("client.Gc")
	public int[] field959 = new int[field955];

	@ObfuscatedName("client.Hc")
	public int[] field960 = new int[field955];

	@ObfuscatedName("client.Ic")
	public class36[] field961 = new class36[field955];

	@ObfuscatedName("client.Lc")
	public String[] field964 = new String[100];

	@ObfuscatedName("client.Nc")
	public int[] field966 = new int[7];

	@ObfuscatedName("client.Qc")
	public int field967 = 128;

	@ObfuscatedName("client.bd")
	public boolean field978 = true;

	@ObfuscatedName("client.cd")
	public boolean field979 = false;

	@ObfuscatedName("client.id")
	public final int field985 = 100;

	@ObfuscatedName("client.jd")
	public int[] field986 = new int[100];

	@ObfuscatedName("client.kd")
	public final int[] field987 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ld")
	public int[] field988 = new int[500];

	@ObfuscatedName("client.md")
	public int[] field989 = new int[500];

	@ObfuscatedName("client.nd")
	public int[] field990 = new int[500];

	@ObfuscatedName("client.od")
	public int[] field991 = new int[500];

	@ObfuscatedName("client.rd")
	public int[] field993 = new int[33];

	@ObfuscatedName("client.sd")
	public int[][] field994 = new int[104][104];

	@ObfuscatedName("client.td")
	public class33[] field995 = new class33[50];

	@ObfuscatedName("client.ud")
	public String field996 = "";

	@ObfuscatedName("client.vd")
	public String field997 = "";

	@ObfuscatedName("client.wd")
	public String field998 = "";

	@ObfuscatedName("client.yd")
	public int field1000 = 2;

	@ObfuscatedName("client.zd")
	public int[] field1001 = new int[33];

	@ObfuscatedName("client.Ad")
	public boolean field1002 = false;

	@ObfuscatedName("client.Bd")
	public int[] field1003 = new int[50];

	@ObfuscatedName("client.Cd")
	public byte[] field1004 = new byte[16384];

	@ObfuscatedName("client.Hd")
	public int field1009 = 0x332D25;

	@ObfuscatedName("client.Md")
	public int[] field1012 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Od")
	public class33[] field1013 = new class33[1000];

	@ObfuscatedName("client.Pd")
	public int[] field1014 = new int[256];

	@ObfuscatedName("client.Qd")
	public int[] field1015 = new int[50];

	@ObfuscatedName("client.Ud")
	public int field1018 = 2;

	@ObfuscatedName("client.Vd")
	public class40[][][] field1019 = new class40[4][104][104];

	@ObfuscatedName("client.Yd")
	public int field1022 = 1;

	@ObfuscatedName("client.he")
	public String field1031 = "";

	@ObfuscatedName("client.ie")
	public String field1032 = "";

	@ObfuscatedName("client.me")
	public int[] field1035 = new int[5];

	@ObfuscatedName("client.pe")
	public boolean field1038 = false;

	@ObfuscatedName("client.te")
	public int[] field1041 = new int[100];

	@ObfuscatedName("client.ue")
	public class36 field1042 = class36.method176(1);

	@ObfuscatedName("client.ve")
	public long[] field1043 = new long[100];

	@ObfuscatedName("client.xe")
	public int[] field1045 = new int[1000];

	@ObfuscatedName("client.Ge")
	public boolean field1054 = false;

	@ObfuscatedName("client.Ie")
	public boolean field1055 = false;

	@ObfuscatedName("client.Je")
	public int[] field1056 = new int[4000];

	@ObfuscatedName("client.Ke")
	public int[] field1057 = new int[4000];

	@ObfuscatedName("client.Pe")
	public int field1062 = 10;

	@ObfuscatedName("client.Qe")
	public String[] field1063 = new String[100];

	@ObfuscatedName("client.Re")
	public int[] field1064 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Ve")
	public int[] field1068 = new int[151];

	@ObfuscatedName("client.af")
	public class40 field1071 = new class40();

	@ObfuscatedName("client.gf")
	public class40 field1077 = new class40();

	@ObfuscatedName("client.hf")
	public class33[] field1078 = new class33[8];

	@ObfuscatedName("client.jf")
	public int field1079 = -1;

	@ObfuscatedName("client.tf")
	public String field1088 = "127.0.0.1";

	@ObfuscatedName("client.uf")
	public boolean field1089 = false;

	@ObfuscatedName("client.wf")
	public int[][] field1090 = new int[104][104];

	@ObfuscatedName("client.Hf")
	public boolean field1101 = false;

	@ObfuscatedName("client.If")
	public int field1102 = 0x766654;

	@ObfuscatedName("client.Jf")
	public class34[] field1103 = new class34[50];

	@ObfuscatedName("client.Kf")
	public class40 field1104 = new class40();

	@ObfuscatedName("client.Lf")
	public String field1105 = "";

	@ObfuscatedName("client.Mf")
	public String field1106 = "";

	@ObfuscatedName("client.Nf")
	public String field1107 = "";

	@ObfuscatedName("client.Of")
	public boolean field1108 = false;

	@ObfuscatedName("client.Wf")
	public int field1116 = 0x4D4233;

	@ObfuscatedName("client.bg")
	public int field1121 = 78;

	@ObfuscatedName("client.cg")
	public String field1122 = "";

	@ObfuscatedName("client.dg")
	public boolean field1123 = false;

	@ObfuscatedName("client.eg")
	public int field1124 = -1;

	@ObfuscatedName("client.sg")
	public String[] field1138 = new String[100];

	@ObfuscatedName("client.ug")
	public boolean field1140 = false;

	@ObfuscatedName("client.vg")
	public class24[] field1141 = new class24[8192];

	@ObfuscatedName("client.xg")
	public int[] field1143 = new int[8192];

	@ObfuscatedName("client.yg")
	public int[] field1144 = new int[2000];

	@ObfuscatedName("client.zg")
	public int[] field1145 = new int[100];

	@ObfuscatedName("client.N")
	public static final int[] field871 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.O")
	public static String field872 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Db")
	public static BigInteger field908 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Jc")
	public static BigInteger field962 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.je")
	public static int[] field1033 = new int[99];

	@ObfuscatedName("client.Se")
	public static final int[][] field1065 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Sd")
	public int field1016;

	@ObfuscatedName("client.Td")
	public int field1017;

	@ObfuscatedName("client.Xd")
	public int field1021;

	@ObfuscatedName("client.ce")
	public int field1026;

	@ObfuscatedName("client.de")
	public int field1027;

	@ObfuscatedName("client.ee")
	public int field1028;

	@ObfuscatedName("client.fe")
	public int field1029;

	@ObfuscatedName("client.ge")
	public int field1030;

	@ObfuscatedName("client.le")
	public int field1034;

	@ObfuscatedName("client.ne")
	public int field1036;

	@ObfuscatedName("client.oe")
	public int field1037;

	@ObfuscatedName("client.qe")
	public int field1039;

	@ObfuscatedName("client.se")
	public int field1040;

	@ObfuscatedName("client.we")
	public int field1044;

	@ObfuscatedName("client.ye")
	public int field1046;

	@ObfuscatedName("client.ze")
	public int field1047;

	@ObfuscatedName("client.Ae")
	public int field1048;

	@ObfuscatedName("client.Be")
	public int field1049;

	@ObfuscatedName("client.Ce")
	public int field1050;

	@ObfuscatedName("client.De")
	public int field1051;

	@ObfuscatedName("client.Ee")
	public int field1052;

	@ObfuscatedName("client.Fe")
	public int field1053;

	@ObfuscatedName("client.Le")
	public int field1058;

	@ObfuscatedName("client.Me")
	public int field1059;

	@ObfuscatedName("client.Ne")
	public int field1060;

	@ObfuscatedName("client.We")
	public int field1069;

	@ObfuscatedName("client.Ye")
	public int field1070;

	@ObfuscatedName("client.cf")
	public int field1073;

	@ObfuscatedName("client.df")
	public int field1074;

	@ObfuscatedName("client.ef")
	public int field1075;

	@ObfuscatedName("client.Pf")
	public static int field1109;

	@ObfuscatedName("client.Rf")
	public int field1111;

	@ObfuscatedName("client.Sf")
	public int field1112;

	@ObfuscatedName("client.Tf")
	public int field1113;

	@ObfuscatedName("client.Uf")
	public int field1114;

	@ObfuscatedName("client.Vf")
	public int field1115;

	@ObfuscatedName("client.fg")
	public int field1125;

	@ObfuscatedName("client.gg")
	public int field1126;

	@ObfuscatedName("client.ig")
	public int field1128;

	@ObfuscatedName("client.jg")
	public int field1129;

	@ObfuscatedName("client.kg")
	public int field1130;

	@ObfuscatedName("client.lg")
	public int field1131;

	@ObfuscatedName("client.mg")
	public int field1132;

	@ObfuscatedName("client.ng")
	public int field1133;

	@ObfuscatedName("client.og")
	public int field1134;

	@ObfuscatedName("client.pg")
	public int field1135;

	@ObfuscatedName("client.wg")
	public int field1142;

	@ObfuscatedName("client.Gg")
	public int field1152;

	@ObfuscatedName("client.T")
	public static int field877;

	@ObfuscatedName("client.U")
	public int field878;

	@ObfuscatedName("client.W")
	public int field879;

	@ObfuscatedName("client.Bb")
	public int field906;

	@ObfuscatedName("client.Cb")
	public int field907;

	@ObfuscatedName("client.Fb")
	public int field909;

	@ObfuscatedName("client.Wb")
	public int field926;

	@ObfuscatedName("client.jc")
	public int field937;

	@ObfuscatedName("client.kc")
	public int field938;

	@ObfuscatedName("client.mc")
	public int field939;

	@ObfuscatedName("client.nc")
	public int field940;

	@ObfuscatedName("client.oc")
	public int field941;

	@ObfuscatedName("client.pc")
	public int field942;

	@ObfuscatedName("client.qc")
	public int field943;

	@ObfuscatedName("client.uc")
	public int field947;

	@ObfuscatedName("client.vc")
	public int field948;

	@ObfuscatedName("client.wc")
	public int field949;

	@ObfuscatedName("client.zc")
	public int field952;

	@ObfuscatedName("client.Ac")
	public int field953;

	@ObfuscatedName("client.Fc")
	public int field958;

	@ObfuscatedName("client.Kc")
	public int field963;

	@ObfuscatedName("client.Mc")
	public int field965;

	@ObfuscatedName("client.Rc")
	public int field968;

	@ObfuscatedName("client.Sc")
	public int field969;

	@ObfuscatedName("client.Tc")
	public int field970;

	@ObfuscatedName("client.Uc")
	public int field971;

	@ObfuscatedName("client.Vc")
	public int field972;

	@ObfuscatedName("client.Wc")
	public int field973;

	@ObfuscatedName("client.Xc")
	public int field974;

	@ObfuscatedName("client.dd")
	public int field980;

	@ObfuscatedName("client.hd")
	public int field984;

	@ObfuscatedName("client.qd")
	public int field992;

	@ObfuscatedName("client.xd")
	public int field999;

	@ObfuscatedName("client.Ag")
	public long field1146;

	@ObfuscatedName("client.Wd")
	public class17 field1020;

	@ObfuscatedName("client.Id")
	public class25 field1010;

	@ObfuscatedName("client.Zd")
	public class33 field1023;

	@ObfuscatedName("client.ae")
	public class33 field1024;

	@ObfuscatedName("client.be")
	public class33 field1025;

	@ObfuscatedName("client.Te")
	public class33 field1066;

	@ObfuscatedName("client.Ue")
	public class33 field1067;

	@ObfuscatedName("client.ff")
	public class33 field1076;

	@ObfuscatedName("client.tg")
	public class33 field1139;

	@ObfuscatedName("client.Ab")
	public class33 field905;

	@ObfuscatedName("client.kf")
	public class34 field1080;

	@ObfuscatedName("client.lf")
	public class34 field1081;

	@ObfuscatedName("client.mf")
	public class34 field1082;

	@ObfuscatedName("client.nf")
	public class34 field1083;

	@ObfuscatedName("client.of")
	public class34 field1084;

	@ObfuscatedName("client.qg")
	public class34 field1136;

	@ObfuscatedName("client.rg")
	public class34 field1137;

	@ObfuscatedName("client.Bg")
	public class34 field1147;

	@ObfuscatedName("client.Cg")
	public class34 field1148;

	@ObfuscatedName("client.Dg")
	public class34 field1149;

	@ObfuscatedName("client.Eg")
	public class34 field1150;

	@ObfuscatedName("client.Fg")
	public class34 field1151;

	@ObfuscatedName("client.L")
	public class34 field869;

	@ObfuscatedName("client.M")
	public class34 field870;

	@ObfuscatedName("client.P")
	public class34 field873;

	@ObfuscatedName("client.Q")
	public class34 field874;

	@ObfuscatedName("client.R")
	public class34 field875;

	@ObfuscatedName("client.Zc")
	public class34 field976;

	@ObfuscatedName("client.ad")
	public class34 field977;

	@ObfuscatedName("client.Y")
	public class35 field881;

	@ObfuscatedName("client.Z")
	public class35 field882;

	@ObfuscatedName("client.Dd")
	public class42 field1005;

	@ObfuscatedName("client.Ed")
	public class42 field1006;

	@ObfuscatedName("client.Fd")
	public class42 field1007;

	@ObfuscatedName("client.Gd")
	public class42 field1008;

	@ObfuscatedName("client.qf")
	public class42 field1085;

	@ObfuscatedName("client.rf")
	public class42 field1086;

	@ObfuscatedName("client.sf")
	public class42 field1087;

	@ObfuscatedName("client.xf")
	public class42 field1091;

	@ObfuscatedName("client.yf")
	public class42 field1092;

	@ObfuscatedName("client.zf")
	public class42 field1093;

	@ObfuscatedName("client.Af")
	public class42 field1094;

	@ObfuscatedName("client.Bf")
	public class42 field1095;

	@ObfuscatedName("client.Cf")
	public class42 field1096;

	@ObfuscatedName("client.Df")
	public class42 field1097;

	@ObfuscatedName("client.Ef")
	public class42 field1098;

	@ObfuscatedName("client.Ff")
	public class42 field1099;

	@ObfuscatedName("client.Gf")
	public class42 field1100;

	@ObfuscatedName("client.Hb")
	public class42 field911;

	@ObfuscatedName("client.Ib")
	public class42 field912;

	@ObfuscatedName("client.Jb")
	public class42 field913;

	@ObfuscatedName("client.Kb")
	public class42 field914;

	@ObfuscatedName("client.Lb")
	public class42 field915;

	@ObfuscatedName("client.Mb")
	public class42 field916;

	@ObfuscatedName("client.Nb")
	public class42 field917;

	@ObfuscatedName("client.Ob")
	public class42 field918;

	@ObfuscatedName("client.Pb")
	public class42 field919;

	@ObfuscatedName("client.hg")
	public class46 field1127;

	@ObfuscatedName("client.yc")
	public class4 field951;

	@ObfuscatedName("client.Oe")
	public String field1061;

	@ObfuscatedName("client.bf")
	public String field1072;

	@ObfuscatedName("client.rc")
	public String field944;

	@ObfuscatedName("client.Xf")
	public int[] field1117;

	@ObfuscatedName("client.Yf")
	public int[] field1118;

	@ObfuscatedName("client.Zf")
	public int[] field1119;

	@ObfuscatedName("client.ag")
	public int[] field1120;

	@ObfuscatedName("client.G")
	public int[] field864;

	@ObfuscatedName("client.H")
	public int[] field865;

	@ObfuscatedName("client.Tb")
	public int[] field923;

	@ObfuscatedName("client.Ub")
	public int[] field924;

	@ObfuscatedName("client.Vb")
	public int[] field925;

	@ObfuscatedName("client.ed")
	public int[] field981;

	@ObfuscatedName("client.fd")
	public int[] field982;

	@ObfuscatedName("client.Gb")
	public class34[] field910;

	@ObfuscatedName("client.Ld")
	public byte[][] field1011;

	@ObfuscatedName("client.gd")
	public byte[][] field983;

	@ObfuscatedName("client.Qf")
	public byte[][][] field1110;

	@ObfuscatedName("client.Yc")
	public int[][][] field975;

	public static final void main(String[] arg0) {
		try {
			signlink.startpriv(InetAddress.getLocalHost());
			client var1 = new client();
			if (arg0.length > 0) {
				var1.field1062 = Integer.parseInt(arg0[0]);
			}

			if (arg0.length > 1) {
				var1.field1052 = Integer.parseInt(arg0[1]);
			}

			if (arg0.length > 2 && arg0[2].equalsIgnoreCase("lowmem")) {
				method324();
			} else {
				method325();
			}

			var1.method1(532, 789);
		} catch (Exception var3) {
		}
	}

	public final void init() {
		field1052 = Integer.parseInt(getParameter("portoff"));
		field1062 = Integer.parseInt(getParameter("nodeid"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method324();
		} else {
			method325();
		}

		method2(532, 789);
	}

	@ObfuscatedName("client.d(I)V")
	public static final void method324() {
		class17.field183 = true;
		class32.field477 = true;
		field893 = true;
		class3.field25 = true;
	}

	@ObfuscatedName("client.e(I)V")
	public static final void method325() {
		class17.field183 = false;
		class32.field477 = false;
		field893 = false;
		class3.field25 = false;
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		signlink.midi = "scape_main";

		if (field885) {
			field928 = true;
		} else {
			field885 = true;
			boolean var1 = false;
			String var2 = method396();
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
					field887[7] = 0;
					while (field887[7] == 0) {
						method13("Connecting to fileserver", 10);

						try {
							DataInputStream var4 = method397("crc" + (int) (Math.random() * 9.9999999E7D));
							class36 var5 = new class36(new byte[32]);
							var4.readFully(var5.field524, 0, 32);

							for (int var6 = 0; var6 < 8; var6++) {
								field887[var6] = var5.method190();
							}

							var4.close();
						} catch (IOException var50) {
							for (int var7 = var3; var7 > 0; var7--) {
								method13("Error loading - Will retry in " + var7 + " secs.", 10);

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

					field1127 = method326("title", "title screen", 10, field887[1]);
					field881 = new class35("p11", field1127);
					field882 = new class35("p12", field1127);
					field883 = new class35("b12", field1127);
					field884 = new class35("q8", field1127);
					method327();
					method332();
					class46 var8 = method326("config", "config", 20, field887[2]);
					class46 var9 = method326("interface", "interface", 30, field887[3]);
					class46 var10 = method326("media", "2d graphics", 40, field887[4]);
					class46 var11 = method326("models", "3d graphics", 50, field887[5]);
					class46 var12 = method326("textures", "textures", 60, field887[6]);
					class46 var13 = method326("wordenc", "chat system", 70, field887[7]);
					field1110 = new byte[4][104][104];
					field975 = new int[4][105][105];
					field1020 = new class17(4, field975, 104, 104);

					for (int var14 = 0; var14 < 4; var14++) {
						field868[var14] = new class53(104, 104);
					}

					field1139 = new class33(512, 512);
					method13("Unpacking media", 80);
					field873 = new class34(var10, "invback", 0);
					field875 = new class34(var10, "chatback", 0);
					field874 = new class34(var10, "mapback", 0);
					field894 = new class34(var10, "backbase1", 0);
					field895 = new class34(var10, "backbase2", 0);
					field896 = new class34(var10, "backhmid1", 0);
					field1136 = new class34(var10, "sideicons1", 0);
					field1137 = new class34(var10, "sideicons2", 0);
					field1076 = new class33("compass", 0, var10);

					try {
						for (int var15 = 0; var15 < 50; var15++) {
							field1103[var15] = new class34(var10, "mapscene", var15);
						}
					} catch (Exception var49) {
					}

					try {
						for (int var16 = 0; var16 < 50; var16++) {
							field995[var16] = new class33("mapfunction", var16, var10);
						}
					} catch (Exception var48) {
					}

					try {
						for (int var17 = 0; var17 < 20; var17++) {
							field880[var17] = new class33("hitmarks", var17, var10);
						}
					} catch (Exception var47) {
					}

					try {
						for (int var18 = 0; var18 < 20; var18++) {
							field862[var18] = new class33("headicons", var18, var10);
						}
					} catch (Exception var46) {
					}

					for (int var19 = 0; var19 < 8; var19++) {
						field1078[var19] = new class33("cross", var19, var10);
					}

					field1023 = new class33("mapdots", 0, var10);
					field1024 = new class33("mapdots", 1, var10);
					field1025 = new class33("mapdots", 2, var10);
					field869 = new class34(var10, "scrollbar", 0);
					field870 = new class34(var10, "scrollbar", 1);
					field1147 = new class34(var10, "redstone1", 0);
					field1148 = new class34(var10, "redstone2", 0);
					field1149 = new class34(var10, "redstone3", 0);
					field1150 = new class34(var10, "redstone1", 0);
					field1150.method164();
					field1151 = new class34(var10, "redstone2", 0);
					field1151.method164();
					field1080 = new class34(var10, "redstone1", 0);
					field1080.method165();
					field1081 = new class34(var10, "redstone2", 0);
					field1081.method165();
					field1082 = new class34(var10, "redstone3", 0);
					field1082.method165();
					field1083 = new class34(var10, "redstone1", 0);
					field1083.method164();
					field1083.method165();
					field1084 = new class34(var10, "redstone2", 0);
					field1084.method164();
					field1084.method165();
					class33 var20 = new class33("backleft1", 0, var10);
					field1091 = new class42(var20.field502, var20.field501, method11());
					var20.method153(0, 0);
					class33 var21 = new class33("backleft2", 0, var10);
					field1092 = new class42(var21.field502, var21.field501, method11());
					var21.method153(0, 0);
					class33 var22 = new class33("backright1", 0, var10);
					field1093 = new class42(var22.field502, var22.field501, method11());
					var22.method153(0, 0);
					class33 var23 = new class33("backright2", 0, var10);
					field1094 = new class42(var23.field502, var23.field501, method11());
					var23.method153(0, 0);
					class33 var24 = new class33("backtop1", 0, var10);
					field1095 = new class42(var24.field502, var24.field501, method11());
					var24.method153(0, 0);
					class33 var25 = new class33("backtop2", 0, var10);
					field1096 = new class42(var25.field502, var25.field501, method11());
					var25.method153(0, 0);
					class33 var26 = new class33("backvmid1", 0, var10);
					field1097 = new class42(var26.field502, var26.field501, method11());
					var26.method153(0, 0);
					class33 var27 = new class33("backvmid2", 0, var10);
					field1098 = new class42(var27.field502, var27.field501, method11());
					var27.method153(0, 0);
					class33 var28 = new class33("backvmid3", 0, var10);
					field1099 = new class42(var28.field502, var28.field501, method11());
					var28.method153(0, 0);
					class33 var29 = new class33("backhmid2", 0, var10);
					field1100 = new class42(var29.field502, var29.field501, method11());
					var29.method153(0, 0);
					method13("Unpacking textures", 85);
					class32.method140(var12);
					class32.method144(0.8D);
					class32.method139(20);
					method13("Unpacking models", 85);
					class30.method104(var11);
					class5.method33(var11);
					class6.method34(var11);
					method13("Unpacking config", 85);
					class58.method279(var8);
					class49.method235(var8);
					class54.method268(var8);
					class51.method247(var8);
					class50.method241(var8);
					class55.method271(var8);
					class59.method281(var8);
					class60.method284(var8);
					method13("Unpacking interfaces", 90);
					class35[] var30 = new class35[] { field881, field882, field883, field884 };
					class56.method275(var30, var10, var9);
					method13("Preparing game engine", 95);

					for (int var31 = 0; var31 < 33; var31++) {
						int var32 = 999;
						int var33 = 0;
						for (int var34 = 0; var34 < 35; var34++) {
							if (field874.field507[field874.field509 * var31 + var34] == 0) {
								if (var32 == 999) {
									var32 = var34;
								}
							} else if (var32 != 999) {
								var33 = var34;
								break;
							}
						}

						field993[var31] = var32;
						field1001[var31] = var33 - var32;
					}

					for (int var35 = 9; var35 < 160; var35++) {
						int var36 = 999;
						int var37 = 0;
						for (int var38 = 10; var38 < 168; var38++) {
							if (field874.field507[field874.field509 * var35 + var38] == 0 && (var38 > 34 || var35 > 34)) {
								if (var36 == 999) {
									var36 = var38;
								}
							} else if (var36 != 999) {
								var37 = var38;
								break;
							}
						}

						field1068[var35 - 9] = var36 - 21;
						field866[var35 - 9] = var37 - var36;
					}

					class32.method137(479, 96);
					field923 = class32.field488;
					class32.method137(190, 261);
					field924 = class32.field488;
					class32.method137(512, 334);
					field925 = class32.field488;
					int[] var39 = new int[9];
					for (int var40 = 0; var40 < 9; var40++) {
						int var41 = var40 * 32 + 128 + 15;
						int var42 = var41 * 3 + 600;
						int var43 = class32.field486[var41];
						var39[var40] = var42 * var43 >> 16;
					}

					class17.method69(334, 512, 800, var39, 500);
					class61.method286(var13);
				} catch (Exception var51) {
					field1108 = true;
				}
			} else {
				field1140 = true;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;II)Ltb;")
	public final class46 method326(String arg0, String arg1, int arg2, int arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg0);
		if (var6 != null) {
			field954.reset();
			field954.update(var6);
			int var7 = (int) field954.getValue();
			if (arg3 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class46(var6);
		}

		while (var6 == null) {
			method13("Requesting " + arg1, arg2);

			try {
				int var9 = 0;
				DataInputStream var10 = method397(arg0 + arg3);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				class36 var12 = new class36(var11);
				var12.field525 = 3;
				int var13 = var12.method189() + 6;
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
						method13("Loading " + arg1 + " - " + var17 + "%", arg2);
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					method13("Error loading - Will retry in " + var18 + " secs.", arg2);

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
		return new class46(var6);
	}

	@ObfuscatedName("client.f(I)V")
	public final void method327() {
		byte[] var1 = field1127.method225(null, "title.dat");
		class33 var2 = new class33(var1, this);
		field914.method210();
		var2.method153(0, 0);
		field915.method210();
		var2.method153(0, -661);
		field911.method210();
		var2.method153(0, -128);
		field912.method210();
		var2.method153(-386, -214);
		field913.method210();
		var2.method153(-186, -214);
		field916.method210();
		var2.method153(-265, 0);
		field917.method210();
		var2.method153(-265, -574);
		field918.method210();
		var2.method153(-186, -128);
		field919.method210();
		var2.method153(-186, -574);
		int[] var3 = new int[var2.field501];
		for (int var4 = 0; var4 < var2.field502; var4++) {
			for (int var5 = 0; var5 < var2.field501; var5++) {
				var3[var5] = var2.field500[var2.field501 * var4 + var2.field501 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field501; var6++) {
				var2.field500[var2.field501 * var4 + var6] = var3[var6];
			}
		}

		field914.method210();
		var2.method153(0, 394);
		field915.method210();
		var2.method153(0, -267);
		field911.method210();
		var2.method153(0, 266);
		field912.method210();
		var2.method153(-386, 180);
		field913.method210();
		var2.method153(-186, 180);
		field916.method210();
		var2.method153(-265, 394);
		field917.method210();
		var2.method153(-265, -180);
		field918.method210();
		var2.method153(-186, 212);
		field919.method210();
		var2.method153(-186, -180);
		class33 var7 = new class33("logo", 0, field1127);
		field911.method210();
		var7.method155(field6 / 2 - var7.field501 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IZ)V")
	public final void method13(String arg0, int arg1) {
		method330();

		if (field1127 == null) {
			super.method13(arg0, arg1);
		} else {
			field913.method210();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field883.method168(var4 / 2 - var5 - 26, var3 / 2, 0xFFFFFF, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			class31.method132(304, 34, var3 / 2 - 152, var6, 0x8C1111);
			class31.method132(302, 32, var3 / 2 - 151, var6 + 1, 0);
			class31.method131(0x8C1111, arg1 * 3, var6 + 2, 30, var3 / 2 - 150);
			class31.method131(0, 300 - arg1 * 3, var6 + 2, 30, arg1 * 3 + var3 / 2 - 150);
			field883.method168(var4 / 2 + 5 - var5, var3 / 2, 0xFFFFFF, arg0);
			field913.method211(field8, 214, 186);

			if (field1055) {
				field1055 = false;

				if (!field945) {
					field914.method211(field8, 0, 0);
					field915.method211(field8, 661, 0);
				}

				field911.method211(field8, 128, 0);
				field912.method211(field8, 214, 386);
				field916.method211(field8, 0, 265);
				field917.method211(field8, 574, 265);
				field918.method211(field8, 128, 186);
				field919.method211(field8, 574, 186);
			}
		}
	}

	@ObfuscatedName("client.a(I)V")
	public final void method7() {
		if (!field928 && !field1108 && !field1140) {
			field877++;

			if (field1038) {
				method344();
			} else {
				method331();
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method9() {
		if (field928 || field1108 || field1140) {
			method328();
		} else {
			if (field1038) {
				method346();
			} else {
				method338();
			}

			field1111 = 0;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method328() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		method4(1);

		if (field1108) {
			field945 = false;
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

		if (field1140) {
			field945 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field928) {
			field945 = false;
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

	@ObfuscatedName("client.c(I)V")
	public final void method10() {
		field1055 = true;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method329() {
		if (field1008 == null) {
			method333();
			field9 = null;
			field911 = null;
			field912 = null;
			field913 = null;
			field914 = null;
			field915 = null;
			field916 = null;
			field917 = null;
			field918 = null;
			field919 = null;
			field1008 = new class42(96, 479, method11());
			field1006 = new class42(160, 168, method11());
			class31.method130();
			field874.method166(0, 0);
			field1005 = new class42(261, 190, method11());
			field1007 = new class42(334, 512, method11());
			class31.method130();
			field1085 = new class42(61, 501, method11());
			field1086 = new class42(40, 288, method11());
			field1087 = new class42(66, 269, method11());
			field1055 = true;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method330() {
		if (field911 == null) {
			field9 = null;
			field1008 = null;
			field1006 = null;
			field1005 = null;
			field1007 = null;
			field1085 = null;
			field1086 = null;
			field1087 = null;
			field914 = new class42(265, 128, method11());
			class31.method130();
			field915 = new class42(265, 128, method11());
			class31.method130();
			field911 = new class42(186, 533, method11());
			class31.method130();
			field912 = new class42(146, 360, method11());
			class31.method130();
			field913 = new class42(200, 360, method11());
			class31.method130();
			field916 = new class42(267, 214, method11());
			class31.method130();
			field917 = new class42(267, 215, method11());
			class31.method130();
			field918 = new class42(79, 86, method11());
			class31.method130();
			field919 = new class42(79, 87, method11());
			class31.method130();

			if (field1127 != null) {
				method327();
				method332();
			}

			field1055 = true;
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method331() {
		if (field909 == 0) {
			int var1 = field6 / 2;
			int var2 = field7 / 2 + 90;
			if (field17 == 1 && field18 >= var1 - 75 && field18 <= var1 + 75 && field19 >= var2 - 20 && field19 <= var2 + 20) {
				field1105 = "";
				field1106 = "Enter your username & password.";
				field909 = 2;
				field1070 = 0;
				return;
			}
		} else if (field909 == 1 || field909 == 2) {
			int var3 = field7 / 2 - 30;
			var3 += 30;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1070 = 0;
			}

			var3 += 15;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3) {
				field1070 = 1;
			}

			var3 += 15;
			if (field17 == 1 && field19 >= var3 - 15 && field19 < var3 && field909 == 1) {
				field1070 = 2;
			}

			int var4 = field6 / 2 - 80;
			int var5 = field7 / 2 + 60;
			if (field17 == 1 && field18 >= var4 - 75 && field18 <= var4 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				if (field909 == 1) {
					method340(method395(), field996, field997);
				} else {
					method339(field996, field997, method395(), false);
				}
			}

			int var6 = field6 / 2 + 80;
			if (field17 == 1 && field18 >= var6 - 75 && field18 <= var6 + 75 && field19 >= var5 - 20 && field19 <= var5 + 20) {
				field909 = 0;
			}

			while (true) {
				int var7;
				boolean var8;
				var7 = method5();
				if (var7 == -1) {
					return;
				}

				var8 = false;
				for (int var9 = 0; var9 < field872.length(); var9++) {
					if (var7 == field872.charAt(var9)) {
						var8 = true;
						break;
					}
				}

				if (field1070 == 0) {
					if (var7 == 8 && field996.length() > 0) {
						field996 = field996.substring(0, field996.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1070 = 1;
					}

					if (var8) {
						field996 = field996 + (char) var7;
					}

					if (field996.length() > 12) {
						field996 = field996.substring(0, 12);
					}
				} else if (field1070 == 1) {
					if (var7 == 8 && field997.length() > 0) {
						field997 = field997.substring(0, field997.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						if (field909 == 1) {
							field1070 = 2;
						} else {
							field1070 = 0;
						}
					}

					if (var8) {
						field997 = field997 + (char) var7;
					}

					if (field997.length() > 20) {
						field997 = field997.substring(0, 20);
					}
				} else if (field1070 == 2) {
					if (var7 == 8 && field998.length() > 0) {
						field998 = field998.substring(0, field998.length() - 1);
					}

					if (var7 == 9 || var7 == 10 || var7 == 13) {
						field1070 = 0;
					}

					if (var8) {
						field998 = field998 + (char) var7;
					}

					if (field998.length() > 20) {
						field998 = field998.substring(0, 20);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method332() {
		field976 = new class34(field1127, "titlebox", 0);
		field977 = new class34(field1127, "titlebutton", 0);
		field910 = new class34[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field910[var1] = new class34(field1127, "runes", var1);
		}

		field904 = new class33(128, 265);
		field905 = new class33(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field904.field500[var2] = field914.field565[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field905.field500[var3] = field915.field565[var3];
		}

		field1118 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1118[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1118[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1118[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1118[var7 + 192] = 0xFFFFFF;
		}

		field1119 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1119[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1119[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1119[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1119[var11 + 192] = 0xFFFFFF;
		}

		field1120 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1120[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1120[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1120[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1120[var15 + 192] = 0xFFFFFF;
		}

		field1117 = new int[256];
		field981 = new int[32768];
		field982 = new int[32768];
		method334(null);
		field864 = new int[32768];
		field865 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field945) {
			field1123 = true;
			field945 = true;
			method12(this, 2);
		}
	}

	public final void run() {
		if (field1123) {
			field1002 = true;

			try {
				long var1 = System.currentTimeMillis();
				int var3 = 0;
				int var4 = 20;
				while (field945) {
					method335();
					method335();
					method337();
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

			field1002 = false;
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method333() {
		field945 = false;
		while (field1002) {
			field945 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field976 = null;
		field977 = null;
		field910 = null;
		field1117 = null;
		field1118 = null;
		field1119 = null;
		field1120 = null;
		field981 = null;
		field982 = null;
		field864 = null;
		field865 = null;
		field904 = null;
		field905 = null;
	}

	@ObfuscatedName("client.a(ILhb;)V")
	public final void method334(class34 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field981.length; var3++) {
			field981[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field981[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field982[var9] = (field981[var9 - 1] + field981[var9 + 1] + field981[var9 - 128] + field981[var9 + 128]) / 4;
				}
			}

			int[] var10 = field981;
			field981 = field982;
			field982 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field510; var12++) {
				for (int var13 = 0; var13 < arg0.field509; var13++) {
					if (arg0.field507[var11++] != 0) {
						int var14 = var13 + arg0.field511 + 16;
						int var15 = var12 + arg0.field512 + 16;
						int var16 = (var15 << 7) + var14;
						field981[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method335() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field864[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field864[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field865[var10] = (field864[var10 - 1] + field864[var10 + 1] + field864[var10 - 128] + field864[var10 + 128]) / 4;
			}
		}

		field1073 += 128;
		if (field1073 > field981.length) {
			field1073 -= field981.length;
			int var11 = (int) (Math.random() * 12.0D);
			method334(field910[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field865[var14 + 128] - field981[field1073 + var14 & field981.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field864[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1014[var16] = field1014[var16 + 1];
		}

		field1014[var1 - 1] = (int) (Math.sin(field877 / 14.0D) * 16.0D + Math.sin(field877 / 15.0D) * 14.0D + Math.sin(field877 / 16.0D) * 12.0D);

		if (field1046 > 0) {
			field1046 -= 4;
		}

		if (field1047 > 0) {
			field1047 -= 4;
		}

		if (field1046 == 0 && field1047 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1046 = 1024;
			}

			if (var17 == 1) {
				field1047 = 1024;
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method336(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method337() {
		short var1 = 256;

		if (field1046 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1046 > 768) {
					field1117[var2] = method336(field1119[var2], field1118[var2], 1024 - field1046);
				} else if (field1046 > 256) {
					field1117[var2] = field1119[var2];
				} else {
					field1117[var2] = method336(field1118[var2], field1119[var2], 256 - field1046);
				}
			}
		} else if (field1047 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1047 > 768) {
					field1117[var3] = method336(field1120[var3], field1118[var3], 1024 - field1047);
				} else if (field1047 > 256) {
					field1117[var3] = field1120[var3];
				} else {
					field1117[var3] = method336(field1118[var3], field1120[var3], 256 - field1047);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1117[var4] = field1118[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field914.field565[var5] = field904.field500[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1014[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field864[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1117[var12];
					int var15 = field914.field565[var7];
					field914.field565[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field914.method211(field8, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field915.field565[var16] = field905.field500[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1014[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field864[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1117[var23];
					int var26 = field915.field565[var18];
					field915.field565[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field915.method211(field8, 661, 0);
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method338() {
		method330();
		field913.method210();
		field976.method166(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field909 == 0) {
			int var3 = var2 / 2 - 80;
			field883.method169(var1 / 2, "Welcome to the RuneScape-2 BETA test.", var3, 0xFFFF00, true);
			var3 += 15;
			var3 += 15;
			field881.method169(var1 / 2, "Please note this test version of the game is provided for ", var3, 0xFFFFFF, true);
			var3 += 15;
			field881.method169(var1 / 2, "testing/preview purposes only. As such please bear in mind that:", var3, 0xFFFFFF, true);
			var3 += 15;
			var3 += 10;
			field881.method169(var1 / 2, "a) Everything you do/gain here will be forgotten when the beta ends.", var3, 0xFFFFFF, true);
			var3 += 15;
			field881.method169(var1 / 2, "b) No customer support is available for the beta.", var3, 0xFFFFFF, true);
			var3 += 15;
			field881.method169(var1 / 2, "c) The beta may be incomplete/buggy, we're still working on it.", var3, 0xFFFFFF, true);
			var3 += 15;
			field881.method169(var1 / 2, "d) The beta may be totally unavailable at times.", var3, 0xFFFFFF, true);
			var3 += 15;
			int var4 = var1 / 2;
			int var5 = var2 / 2 + 65;
			field977.method166(var4 - 73, var5 - 20);
			field883.method169(var1 / 2, "Click here to login.", var5 + 5, 0xFFFFFF, true);
		}

		if (field909 == 1 || field909 == 2) {
			int var6 = var2 / 2 - 50;
			if (field1105.length() > 0) {
				field883.method169(var1 / 2, field1105, var6 - 15, 0xFFFF00, true);
				field883.method169(var1 / 2, field1106, var6, 0xFFFF00, true);
				var6 += 30;
			} else {
				field883.method169(var1 / 2, field1106, var6 - 7, 0xFFFF00, true);
				var6 += 30;
			}

			field883.method173(true, var1 / 2 - 90, var6, 0xFFFFFF, "Username: " + field996 + (field1070 == 0 & field877 % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			field883.method173(true, var1 / 2 - 88, var6, 0xFFFFFF, "Password: " + class47.method232(field997) + (field1070 == 1 & field877 % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			if (field909 == 1) {
				field883.method173(true, var1 / 2 - 143, var6, 0xFFFFFF, "Confirm Password: " + class47.method232(field998) + (field1070 == 2 & field877 % 40 < 20 ? "@yel@|" : ""));
			}

			int var7 = var1 / 2 - 80;
			int var8 = var2 / 2 + 40;
			field977.method166(var7 - 73, var8 - 20);

			if (field909 == 1) {
				field883.method169(var7, "Create", var8 + 5, 0xFFFFFF, true);
			} else {
				field883.method169(var7, "Login", var8 + 5, 0xFFFFFF, true);
			}

			int var9 = var1 / 2 + 80;
			field977.method166(var9 - 73, var8 - 20);
			field883.method169(var9, "Cancel", var8 + 5, 0xFFFFFF, true);
		}

		field913.method211(field8, 214, 186);

		if (field1055) {
			field1055 = false;
			field911.method211(field8, 128, 0);
			field912.method211(field8, 214, 386);
			field916.method211(field8, 0, 265);
			field917.method211(field8, 574, 265);
			field918.method211(field8, 128, 186);
			field919.method211(field8, 574, 186);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;BIZ)V")
	public final void method339(String arg0, String arg1, int arg2, boolean arg3) {
		try {
			if (!arg3) {
				field1105 = "";
				field1106 = "Connecting to server...";
				method338();
			}

			field951 = new class4(method398(field1052 + 43594), this);
			field951.method31(field930.field524, 0, 8);
			field930.field525 = 0;
			field1146 = field930.method191();
			int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1146 >> 32), (int) field1146 };
			field920.field525 = 0;
			field920.method178(10);
			field920.method180(var5[0]);
			field920.method180(var5[1]);
			field920.method180(var5[2]);
			field920.method180(var5[3]);
			field920.method180(arg2);
			field920.method182(arg0);
			field920.method182(arg1);
			field920.method200(field908, field962);
			field1042.field525 = 0;

			if (arg3) {
				field1042.method178(18);
			} else {
				field1042.method178(16);
			}

			field1042.method178(field920.field525 + 32);

			for (int var6 = 0; var6 < 8; var6++) {
				field1042.method180(field887[var6]);
			}

			field1042.method183(field920.field525, 0, field920.field524);
			field920.field529 = new class45(var5);

			for (int var7 = 0; var7 < 4; var7++) {
				var5[var7] += 50;
			}

			field899 = new class45(var5);
			field951.method32(0, field1042.field524, field1042.field525);
			int var8 = field951.method29();
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var16) {
				}

				method339(arg0, arg1, arg2, arg3);
				return;
			}

			if (var8 == 2) {
				field1038 = true;
				field920.field525 = 0;
				field930.field525 = 0;
				field936 = -1;
				field935 = 0;
				field937 = 0;
				field953 = 0;

				if (!arg3) {
					field13 = 0;

					for (int var9 = 0; var9 < 100; var9++) {
						field1138[var9] = null;
					}

					field940 = 0;
					field1058 = 0;
					field878 = 0;
					field1079 = -1;
					field958 = 0;
					field1142 = 0;

					for (int var10 = 0; var10 < field955; var10++) {
						field957[var10] = null;
						field961[var10] = null;
					}

					for (int var11 = 0; var11 < 8192; var11++) {
						field1141[var11] = null;
					}

					field1010 = field957[field956] = new class25();
					field1104.method207();
					field900.method207();
					field1077.method207();

					for (int var12 = 0; var12 < 4; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							for (int var14 = 0; var14 < 104; var14++) {
								field1019[var12][var13][var14] = null;
							}
						}
					}

					field921 = new class40();
					field1053 = 0;
					field1124 = -1;
					field931 = -1;
					field927 = -1;
					field903 = false;
					field934 = 3;
					field929 = false;
					field1089 = false;
					field863 = false;
					field965 = 0;
					field946 = true;
					method388();

					for (int var15 = 0; var15 < 5; var15++) {
						field1035[var15] = 0;
					}

					method329();
				}

				return;
			}

			if (var8 == 3) {
				field1105 = "";
				field1106 = "Invalid username or password.";
				return;
			}

			if (var8 == 4) {
				field1105 = "Your account has been disabled.";
				field1106 = "Please check your message-centre for details.";
				return;
			}

			if (var8 == 5) {
				field1105 = "Your account is already logged in.";
				field1106 = "Try again in 60 secs...";
				return;
			}

			if (var8 == 6) {
				field1105 = "RuneScape has been updated!";
				field1106 = "Please reload this page.";
				return;
			}

			if (var8 == 7) {
				field1105 = "This world is full.";
				field1106 = "Please use a different world.";
				return;
			}

			if (var8 == 8) {
				field1105 = "Unable to connect.";
				field1106 = "Login server offline.";
				return;
			}

			if (var8 == 9) {
				field1105 = "Login limit exceeded.";
				field1106 = "Too many connections from your address.";
				return;
			}

			if (var8 == 10) {
				field1105 = "Unable to connect.";
				field1106 = "Bad session id.";
				return;
			}

			if (var8 == 11) {
				field1105 = "Unable to connect.";
				field1106 = "Login server rejected session.";
				return;
			}

			if (var8 == 12) {
				field1105 = "You need a members account to beta-test";
				field1106 = "Please subscribe, or play RS1 instead";
				return;
			}

			if (var8 == 13) {
				field1105 = "Could not complete login";
				field1106 = "Please try using a different world";
				return;
			}

			if (var8 == 14) {
				field1105 = "The server is being updated";
				field1106 = "Please wait 1 minute and try again";
				return;
			}
		} catch (IOException var17) {
			field1105 = "";
			field1106 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public final void method340(int arg0, String arg1, String arg2) {
		try {
			field1105 = "";
			field1106 = "Connecting to server...";
			method338();
			field951 = new class4(method398(field1052 + 43594), this);
			field951.method31(field930.field524, 0, 8);
			field930.field525 = 0;
			field1146 = field930.method191();
			field920.field525 = 0;
			field920.method178(10);
			field920.method180((int) Math.random() * 99999999);
			field920.method180((int) Math.random() * 99999999);
			field920.method181(field1146);
			field920.method180(arg0);
			field920.method182(arg1);
			field920.method182(arg2);
			field920.method200(field908, field962);
			field1042.field525 = 0;
			field1042.method178(17);
			field1042.method178(field920.field525);
			field1042.method183(field920.field525, 0, field920.field524);
			field951.method32(0, field1042.field524, field1042.field525);
			int var4 = field951.method29();
			if (var4 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var5) {
				}

				method340(arg0, arg1, arg2);
				return;
			}

			if (var4 == 2) {
				field1105 = "Username already taken.";
				field1106 = "Please choose a different name.";
				return;
			}

			if (var4 == 3) {
				field909 = 2;
				method339(field996, field997, arg0, false);
				return;
			}
		} catch (IOException var6) {
			field1105 = "";
			field1106 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method8() {
		try {
			if (field951 != null) {
				field951.method28();
			}
		} catch (Exception var1) {
		}

		field951 = null;
		signlink.midi = "null";
		field920 = null;
		field1042 = null;
		field930 = null;
		field897 = null;
		field983 = null;
		field1011 = null;
		field975 = null;
		field1110 = null;
		field1020 = null;
		field868 = null;
		field898 = null;
		field994 = null;
		field1056 = null;
		field1057 = null;
		field1004 = null;
		field1005 = null;
		field1006 = null;
		field1007 = null;
		field1008 = null;
		field1085 = null;
		field1086 = null;
		field1087 = null;
		field1091 = null;
		field1092 = null;
		field1093 = null;
		field1094 = null;
		field1095 = null;
		field1096 = null;
		field1097 = null;
		field1098 = null;
		field1099 = null;
		field1100 = null;
		field873 = null;
		field874 = null;
		field875 = null;
		field894 = null;
		field895 = null;
		field896 = null;
		field1136 = null;
		field1137 = null;
		field1147 = null;
		field1148 = null;
		field1149 = null;
		field1150 = null;
		field1151 = null;
		field1080 = null;
		field1081 = null;
		field1082 = null;
		field1083 = null;
		field1084 = null;
		field1076 = null;
		field880 = null;
		field862 = null;
		field1078 = null;
		field1023 = null;
		field1024 = null;
		field1025 = null;
		field1103 = null;
		field995 = null;
		field1090 = null;
		field957 = null;
		field959 = null;
		field960 = null;
		field961 = null;
		field1045 = null;
		field1141 = null;
		field1143 = null;
		field1019 = null;
		field921 = null;
		field1077 = null;
		field1104 = null;
		field900 = null;
		field1071 = null;
		field988 = null;
		field989 = null;
		field990 = null;
		field991 = null;
		field861 = null;
		field1144 = null;
		field891 = null;
		field892 = null;
		field1013 = null;
		field1139 = null;
		field1063 = null;
		field1145 = null;
		field914 = null;
		field915 = null;
		field911 = null;
		field912 = null;
		field913 = null;
		field916 = null;
		field917 = null;
		field918 = null;
		field919 = null;
		method333();
		class49.method236();
		class50.method242();
		class51.method248();
		class54.field742 = null;
		class55.field754 = null;
		class56.field760 = null;
		class57.field817 = null;
		class58.field823 = null;
		class59.field836 = null;
		class59.field843 = null;
		class60.field845 = null;
		field9 = null;
		class25.field327 = null;
		class32.method135();
		class17.method35();
		class30.method103();
		class5.field57 = null;
		class6.field61 = null;
		System.gc();
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method341() {
		class49.field669.method86();
		class49.field670.method86();
		class50.field698.method86();
		class51.field732.method86();
		class51.field733.method86();
		class25.field327.method86();
		class59.field843.method86();
	}

	@ObfuscatedName("client.k(I)V")
	public final void method342() {
		try {
			if (field951 != null) {
				field951.method28();
			}
		} catch (Exception var2) {
		}

		field951 = null;
		field1038 = false;
		field909 = 0;
		field996 = "";
		field997 = "";
		field998 = "";
		method341();
		field1020.method36();

		for (int var1 = 0; var1 < 4; var1++) {
			field868[var1].method256();
		}

		System.gc();

		if (field978) {
			signlink.midi = "null";
		}

		field1072 = null;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method343() {
		field1007.method210();
		field882.method168(144, 257, 0, "Connection lost");
		field882.method168(143, 256, 0xFFFFFF, "Connection lost");
		field882.method168(159, 257, 0, "Please wait - attempting to reestablish");
		field882.method168(158, 256, 0xFFFFFF, "Please wait - attempting to reestablish");
		field1007.method211(field8, 8, 11);
		field1038 = false;
		method339(field996, field997, method395(), true);

		if (!field1038) {
			method342();
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method344() {
		if (field953 > 1) {
			field953--;
		}

		for (int var1 = 0; var1 < 5 && method361(); var1++) {
		}

		field937++;
		if (field937 > 750) {
			method343();
		}

		method355();
		method357();

		for (int var2 = -1; var2 < field958; var2++) {
			int var3;
			if (var2 == -1) {
				var3 = field956;
			} else {
				var3 = field959[var2];
			}

			class25 var4 = field957[var3];
			if (var4.field268 > 0) {
				var4.field268--;
				if (var4.field268 == 0) {
					var4.field267 = null;
				}
			}
		}

		for (int var5 = 0; var5 < field1142; var5++) {
			int var6 = field1143[var5];
			class24 var7 = field1141[var6];
			if (var7.field268 > 0) {
				var7.field268--;
				if (var7.field268 == 0) {
					var7.field267 = null;
				}
			}
		}

		if (field878 == 2) {
			for (class38 var8 = (class38) field1077.method203(); var8 != null; var8 = (class38) field1077.method205()) {
				if (field877 >= var8.field553) {
					method362(var8.field546, var8.field552, var8.field549, var8.field548, var8.field547, var8.field551, var8.field550);
					var8.method89();
				}
			}
		}

		field980++;

		if (field1051 != 0) {
			field1050 += 20;
			if (field1050 >= 400) {
				field1051 = 0;
			}
		}

		if (field1115 != 0) {
			field1112++;
			if (field1112 >= 15) {
				if (field1115 == 2) {
					field876 = true;
				}

				if (field1115 == 3) {
					field979 = true;
				}

				field1115 = 0;
			}
		}

		if (class17.field217 != -1) {
			int var9 = class17.field217;
			int var10 = class17.field218;
			boolean var11 = method360(var10, 0, true, 0, var9, field1010.field303[0], 0, 0, 0, field1010.field304[0]);
			class17.field217 = -1;

			if (var11) {
				field1048 = field18;
				field1049 = field19;
				field1051 = 1;
				field1050 = 0;
			}
		}

		method369();

		if (field17 == 1) {
			int var12 = field18 - 21 - 561;
			int var13 = field19 - 9 - 5;
			if (var12 >= 0 && var13 >= 0 && var12 < 146 && var13 < 151) {
				var12 -= 73;
				var13 -= 75;
				int var14 = class32.field486[field968];
				int var15 = class32.field487[field968];
				int var16 = var12 * var15 + var13 * var14 >> 11;
				int var17 = var13 * var15 - var12 * var14 >> 11;
				int var18 = field1010.field256 + var16 >> 7;
				int var19 = field1010.field257 - var17 >> 7;
				method360(var19, 0, true, 0, var18, field1010.field303[0], 0, 0, 0, field1010.field304[0]);
			}
		}

		if (field17 == 1) {
			if (field18 >= 549 && field18 <= 583 && field19 >= 195 && field19 < 231) {
				field876 = true;
				field934 = 0;
				field950 = true;
			}

			if (field18 >= 579 && field18 <= 609 && field19 >= 194 && field19 < 231) {
				field876 = true;
				field934 = 1;
				field950 = true;
			}

			if (field18 >= 607 && field18 <= 637 && field19 >= 194 && field19 < 231) {
				field876 = true;
				field934 = 2;
				field950 = true;
			}

			if (field18 >= 635 && field18 <= 679 && field19 >= 194 && field19 < 229) {
				field876 = true;
				field934 = 3;
				field950 = true;
			}

			if (field18 >= 676 && field18 <= 706 && field19 >= 194 && field19 < 231) {
				field876 = true;
				field934 = 4;
				field950 = true;
			}

			if (field18 >= 704 && field18 <= 734 && field19 >= 194 && field19 < 231) {
				field876 = true;
				field934 = 5;
				field950 = true;
			}

			if (field18 >= 732 && field18 <= 766 && field19 >= 195 && field19 < 231) {
				field876 = true;
				field934 = 6;
				field950 = true;
			}

			if (field18 >= 582 && field18 <= 612 && field19 >= 492 && field19 < 529) {
				field876 = true;
				field934 = 8;
				field950 = true;
			}

			if (field18 >= 609 && field18 <= 639 && field19 >= 492 && field19 < 529) {
				field876 = true;
				field934 = 9;
				field950 = true;
			}

			if (field18 >= 637 && field18 <= 681 && field19 >= 493 && field19 < 528) {
				field876 = true;
				field934 = 10;
				field950 = true;
			}

			if (field18 >= 679 && field18 <= 709 && field19 >= 492 && field19 < 529) {
				field876 = true;
				field934 = 11;
				field950 = true;
			}
		}

		if (field17 == 1) {
			if (field18 >= 8 && field18 <= 108 && field19 >= 490 && field19 <= 522) {
				field1016 = (field1016 + 1) % 3;
				field1101 = true;
				field979 = true;
				field920.method177(173);
				field920.method178(field1016);
				field920.method178(field984);
				field920.method178(field963);
			}

			if (field18 >= 137 && field18 <= 237 && field19 >= 490 && field19 <= 522) {
				field984 = (field984 + 1) % 3;
				field1101 = true;
				field979 = true;
				field920.method177(173);
				field920.method178(field1016);
				field920.method178(field984);
				field920.method178(field963);
			}

			if (field18 >= 275 && field18 <= 375 && field19 >= 490 && field19 <= 522) {
				field963 = (field963 + 1) % 3;
				field1101 = true;
				field979 = true;
				field920.method177(173);
				field920.method178(field1016);
				field920.method178(field984);
				field920.method178(field963);
			}
		}

		if (field14 == 1 || field17 == 1) {
			field1111++;
		}

		if (field878 == 2) {
			method345();
		}

		while (true) {
			long var30;
			int var32;
			label585: while (true) {
				do {
					int var20;
					do {
						while (true) {
							var20 = method5();
							if (var20 == -1) {
								field13++;
								if (field13 > 4500) {
									field13 -= 500;
									field920.method177(135);
								}

								field1075++;
								if (field1075 > 500) {
									field1075 = 0;
									int var38 = (int) (Math.random() * 8.0D);
									if ((var38 & 0x1) == 1) {
										field999 += field1000;
									}

									if ((var38 & 0x2) == 2) {
										field1017 += field1018;
									}

									if ((var38 & 0x4) == 4) {
										field1021 += field1022;
									}
								}

								if (field999 < -50) {
									field1000 = 2;
								}

								if (field999 > 50) {
									field1000 = -2;
								}

								if (field1017 < -55) {
									field1018 = 2;
								}

								if (field1017 > 55) {
									field1018 = -2;
								}

								if (field1021 < -40) {
									field1022 = 1;
								}

								if (field1021 > 40) {
									field1022 = -1;
								}

								field938++;
								if (field938 > 50) {
									field920.method177(223);
								}

								try {
									if (field951 != null && field920.field525 > 0) {
										field951.method32(0, field920.field524, field920.field525);
										field920.field525 = 0;
										field938 = 0;
										return;
									}
								} catch (IOException var40) {
									method343();
									return;
								} catch (Exception var41) {
									method342();
								}

								return;
							}

							if (field863) {
								break;
							}

							if (field929) {
								if (var20 >= 48 && var20 <= 57 && field1032.length() < 10) {
									field1032 = field1032 + (char) var20;
									field979 = true;
								}

								if (var20 == 8 && field1032.length() > 0) {
									field1032 = field1032.substring(0, field1032.length() - 1);
									field979 = true;
								}

								if (var20 == 13 || var20 == 10) {
									if (field1032.length() > 0) {
										int var34 = 0;
										try {
											var34 = Integer.parseInt(field1032);
										} catch (Exception var42) {
										}

										field920.method177(217);
										field920.method180(var34);
									}

									field929 = false;
									field979 = true;
								}
							} else if (field1124 == -1) {
								if (var20 >= 32 && var20 <= 122 && field1031.length() < 80) {
									field1031 = field1031 + (char) var20;
									field979 = true;
								}

								if (var20 == 8 && field1031.length() > 0) {
									field1031 = field1031.substring(0, field1031.length() - 1);
									field979 = true;
								}

								if ((var20 == 13 || var20 == 10) && field1031.length() > 0) {
									if (field1031.equals("::clientdrop") && field11 != null) {
										method343();
									} else if (field1031.startsWith("::")) {
										field920.method177(37);
										field920.method178(field1031.length() - 1);
										field920.method182(field1031.substring(2));
									} else {
										byte var35 = 0;
										if (field1031.startsWith("yellow:")) {
											var35 = 0;
											field1031 = field1031.substring(7);
										}

										if (field1031.startsWith("red:")) {
											var35 = 1;
											field1031 = field1031.substring(4);
										}

										if (field1031.startsWith("green:")) {
											var35 = 2;
											field1031 = field1031.substring(6);
										}

										if (field1031.startsWith("cyan:")) {
											var35 = 3;
											field1031 = field1031.substring(5);
										}

										if (field1031.startsWith("purple:")) {
											var35 = 4;
											field1031 = field1031.substring(7);
										}

										if (field1031.startsWith("white:")) {
											var35 = 5;
											field1031 = field1031.substring(6);
										}

										if (field1031.startsWith("flash1:")) {
											var35 = 6;
											field1031 = field1031.substring(7);
										}

										if (field1031.startsWith("flash2:")) {
											var35 = 7;
											field1031 = field1031.substring(7);
										}

										if (field1031.startsWith("flash3:")) {
											var35 = 8;
											field1031 = field1031.substring(7);
										}

										if (field1031.startsWith("glow1:")) {
											var35 = 9;
											field1031 = field1031.substring(6);
										}

										if (field1031.startsWith("glow2:")) {
											var35 = 10;
											field1031 = field1031.substring(6);
										}

										if (field1031.startsWith("glow3:")) {
											var35 = 11;
											field1031 = field1031.substring(6);
										}

										byte var36 = 0;
										if (field1031.startsWith("wave:")) {
											var36 = 1;
											field1031 = field1031.substring(5);
										}

										if (field1031.startsWith("scroll:")) {
											var36 = 2;
											field1031 = field1031.substring(7);
										}

										field920.method177(18);
										field920.method178(0);
										int var37 = field920.field525;
										field920.method178(var35);
										field920.method178(var36);
										class48.method234(field920, field1031);
										field920.method184(field920.field525 - var37);
										field1031 = class47.method231(field1031);
										field1031 = class61.method296(field1031);
										field1010.field267 = field1031;
										field1010.field269 = var35;
										field1010.field270 = var36;
										field1010.field268 = 150;
										method391(2, field1010.field307, field1010.field267);

										if (field1016 == 2) {
											field1016 = 1;
											field1101 = true;
											field920.method177(173);
											field920.method178(field1016);
											field920.method178(field984);
											field920.method178(field963);
										}
									}

									field1031 = "";
									field979 = true;
								}
							}
						}

						if (var20 >= 32 && var20 <= 122 && field1122.length() < 80) {
							field1122 = field1122 + (char) var20;
							field979 = true;
						}

						if (var20 == 8 && field1122.length() > 0) {
							field1122 = field1122.substring(0, field1122.length() - 1);
							field979 = true;
						}
					} while (var20 != 13 && var20 != 10);

					field863 = false;
					field979 = true;

					if (field933 == 1 && field1053 < 100) {
						field1122 = class47.method230(class47.method229(field1122));
						if (field1122.length() > 0) {
							boolean var21 = false;
							for (int var22 = 0; var22 < field1053; var22++) {
								if (field1063[var22].equals(field1122)) {
									var21 = true;
									break;
								}
							}

							if (field1122.equals(field1010.field307)) {
								var21 = true;
							}

							if (!var21) {
								field1063[field1053] = field1122;
								field1145[field1053] = 0;
								field1053++;
								field876 = true;
								field920.method177(150);
								field920.method181(class47.method226(field1122));
							}
						}
					}

					if (field933 == 2 && field1053 > 0) {
						field1122 = class47.method230(class47.method229(field1122));
						if (field1122.length() > 0) {
							for (int var23 = 0; var23 < field1053; var23++) {
								if (field1063[var23].equals(field1122)) {
									field1053--;
									field876 = true;

									for (int var24 = var23; var24 < field1053; var24++) {
										field1063[var24] = field1063[var24 + 1];
										field1145[var24] = field1145[var24 + 1];
									}

									field920.method177(234);
									field920.method181(class47.method226(field1122));
									break;
								}
							}
						}
					}

					if (field933 == 3 && field1122.length() > 0 && field952 >= 0 && field952 < field1053) {
						field920.method177(12);
						field920.method178(0);
						int var25 = field920.field525;
						field920.method181(class47.method226(field1063[field952]));
						class48.method234(field920, field1122);
						field920.method184(field920.field525 - var25);
						field1122 = class47.method231(field1122);
						field1122 = class61.method296(field1122);
						method391(6, field1063[field952], field1122);

						if (field984 == 2) {
							field984 = 1;
							field1101 = true;
							field920.method177(173);
							field920.method178(field1016);
							field920.method178(field984);
							field920.method178(field963);
						}
					}

					if (field933 == 4 && field1034 < 100 && field1122.length() > 0) {
						long var26 = class47.method226(field1122);
						boolean var28 = false;
						for (int var29 = 0; var29 < field1034; var29++) {
							if (field1043[var29] == var26) {
								var28 = true;
								break;
							}
						}

						if (!var28) {
							field1043[field1034++] = var26;
							field876 = true;
							field920.method177(105);
							field920.method181(var26);
						}
					}
				} while (field933 != 5);

				if (field1034 > 0 && field1122.length() > 0) {
					var30 = class47.method226(field1122);
					for (var32 = 0; var32 < field1034; var32++) {
						if (field1043[var32] == var30) {
							break label585;
						}
					}
				}
			}

			field1034--;
			field876 = true;

			for (int var33 = var32; var33 < field1034; var33++) {
				field1043[var33] = field1043[var33 + 1];
			}

			field920.method177(92);
			field920.method181(var30);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method345() {
		int var1 = field1010.field256 + field999;
		int var2 = field1010.field257 + field1017;
		if (field1128 - var1 < -500 || field1128 - var1 > 500 || field1129 - var2 < -500 || field1129 - var2 > 500) {
			field1128 = var1;
			field1129 = var2;
		}

		if (field1128 != var1) {
			field1128 += (var1 - field1128) / 16;
		}

		if (field1129 != var2) {
			field1129 += (var2 - field1129) / 16;
		}

		if (field20[1] == 1) {
			field1130 += (-field1130 - 24) / 2;
		} else if (field20[2] == 1) {
			field1130 += (24 - field1130) / 2;
		} else {
			field1130 /= 2;
		}

		if (field20[3] == 1) {
			field1131 += (12 - field1131) / 2;
		} else if (field20[4] == 1) {
			field1131 += (-field1131 - 12) / 2;
		} else {
			field1131 /= 2;
		}

		field969 = field1130 / 2 + field969 & 0x7FF;
		field967 += field1131 / 2;
		field968 = field969 + field1021 & 0x7FF;

		if (field967 < 128) {
			field967 = 128;
		}

		if (field967 > 383) {
			field967 = 383;
		}

		int var3 = field1128 >> 7;
		int var4 = field1129 >> 7;
		int var5 = method349(field1128, field1129, field1069);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = field1069;
					if (var9 < 3 && (field1110[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - field975[var9][var7][var8];
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

		if (var11 > field974) {
			field974 += (var11 - field974) / 24;
		} else if (var11 < field974) {
			field974 += (var11 - field974) / 80;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method346() {
		if (field1055) {
			field1055 = false;
			field1091.method211(field8, 0, 11);
			field1092.method211(field8, 0, 375);
			field1093.method211(field8, 729, 5);
			field1094.method211(field8, 752, 231);
			field1095.method211(field8, 0, 0);
			field1096.method211(field8, 561, 0);
			field1097.method211(field8, 520, 11);
			field1098.method211(field8, 520, 231);
			field1099.method211(field8, 501, 375);
			field1100.method211(field8, 0, 345);
			field876 = true;
			field979 = true;
			field950 = true;
			field1101 = true;

			if (field878 != 2) {
				field1007.method211(field8, 8, 11);
				field1006.method211(field8, 561, 5);
			}
		}

		if (field878 == 2) {
			method347();
		}

		if (field1089 && field1026 == 1) {
			field876 = true;
		}

		if (field927 != -1) {
			boolean var1 = method384(field980, field927);
			if (var1) {
				field876 = true;
			}
		}

		if (field1115 == 2) {
			field876 = true;
		}

		if (field876) {
			method394();
			field876 = false;
		}

		if (field1124 == -1) {
			field902.field777 = field1121 - field1074 - 77;

			if (field15 > 453 && field15 < 565 && field16 > 350) {
				method377(0, 463, field15 - 22, 77, field16 - 375, field902, false, field1121);
			}

			int var2 = field1121 - field902.field777 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1121 - 77) {
				var2 = field1121 - 77;
			}

			if (field1074 != var2) {
				field1074 = var2;
				field979 = true;
			}
		}

		if (field1124 != -1) {
			boolean var3 = method384(field980, field1124);
			if (var3) {
				field979 = true;
			}
		}

		if (field1115 == 3) {
			field979 = true;
		}

		if (field979) {
			method392();
			field979 = false;
		}

		if (field878 == 2) {
			if (field893 && field1130 == 0 && field877 - field1126 > 25) {
				field1126 = field877;
				field1125 = 1 - field1125;
				if (field1125 == 0) {
					method389();
				} else {
					field1006.method211(field8, 561, 5);
				}
			}

			if (!field893) {
				method389();
				field1006.method211(field8, 561, 5);
			}
		}

		if (field950) {
			field950 = false;
			field1087.method210();
			field896.method166(0, 0);

			if (field927 == -1) {
				if (field934 == 0) {
					field1147.method166(29, 30);
				}

				if (field934 == 1) {
					field1148.method166(59, 29);
				}

				if (field934 == 2) {
					field1148.method166(87, 29);
				}

				if (field934 == 3) {
					field1149.method166(115, 29);
				}

				if (field934 == 4) {
					field1151.method166(156, 29);
				}

				if (field934 == 5) {
					field1151.method166(184, 29);
				}

				if (field934 == 6) {
					field1150.method166(212, 30);
				}

				field1136.method166(39, 33);
			}

			field1087.method211(field8, 520, 165);
			field1086.method210();
			field895.method166(0, 0);

			if (field927 == -1) {
				if (field934 == 7) {
					field1080.method166(49, 0);
				}

				if (field934 == 8) {
					field1081.method166(81, 0);
				}

				if (field934 == 9) {
					field1081.method166(108, 0);
				}

				if (field934 == 10) {
					field1082.method166(136, 1);
				}

				if (field934 == 11) {
					field1084.method166(178, 0);
				}

				if (field934 == 12) {
					field1084.method166(205, 0);
				}

				if (field934 == 13) {
					field1083.method166(233, 0);
				}

				field1137.method166(83, 4);
			}

			field1086.method211(field8, 501, 492);
			field1007.method210();
		}

		if (field1101) {
			field1101 = false;
			field1085.method210();
			field894.method166(0, 0);
			field882.method169(57, "Public chat", 33, 0xFFFFFF, true);

			if (field1016 == 0) {
				field882.method169(57, "On", 46, 0xFF00, true);
			}

			if (field1016 == 1) {
				field882.method169(57, "Friends", 46, 0xFFFF00, true);
			}

			if (field1016 == 2) {
				field882.method169(57, "Off", 46, 0xFF0000, true);
			}

			field882.method169(186, "Private chat", 33, 0xFFFFFF, true);

			if (field984 == 0) {
				field882.method169(186, "On", 46, 0xFF00, true);
			}

			if (field984 == 1) {
				field882.method169(186, "Friends", 46, 0xFFFF00, true);
			}

			if (field984 == 2) {
				field882.method169(186, "Off", 46, 0xFF0000, true);
			}

			field882.method169(326, "Trade/duel", 33, 0xFFFFFF, true);

			if (field963 == 0) {
				field882.method169(326, "On", 46, 0xFF00, true);
			}

			if (field963 == 1) {
				field882.method169(326, "Friends", 46, 0xFFFF00, true);
			}

			if (field963 == 2) {
				field882.method169(326, "Off", 46, 0xFF0000, true);
			}

			field1085.method211(field8, 0, 471);
			field1007.method210();
		}

		field980 = 0;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method347() {
		field1152++;
		for (int var1 = -1; var1 < field958; var1++) {
			class25 var2;
			int var3;
			if (var1 == -1) {
				var2 = field1010;
				var3 = field956 << 14;
			} else {
				var2 = field957[field959[var1]];
				var3 = field959[var1] << 14;
			}

			var2.field326 = false;
			if ((field893 && field958 > 50 || field958 > 200) && var1 != -1 && var2.field279 == var2.field265) {
				var2.field326 = true;
			}

			if (var2.method98()) {
				int var4 = var2.field256 >> 7;
				int var5 = var2.field257 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field321 == null || field877 < var2.field316 || field877 >= var2.field317) {
						if ((var2.field256 & 0x7F) == 0x40 && (var2.field257 & 0x7F) == 0x40) {
							if (field1090[var4][var5] == field1152) {
								continue;
							}

							field1090[var4][var5] = field1152;
						}

						var2.field315 = method349(var2.field256, var2.field257, field1069);
						field1020.method47(var2.field258, var2, var3, var2.field315, var2.field256, field1069, var2.field259, 60, var2.field257, null);
					} else {
						var2.field326 = false;
						var2.field315 = method349(var2.field256, var2.field257, field1069);
						field1020.method48(var2.field322, var2.field323, var2.field315, var2.field325, field1069, var2.field256, null, var2.field257, var2.field258, var2.field324, var3, 60, var2);
					}
				}
			}
		}

		for (int var6 = 0; var6 < field1142; var6++) {
			class24 var7 = field1141[field1143[var6]];
			int var8 = (field1143[var6] << 14) + 0x20000000;
			if (var7.method94()) {
				int var9 = var7.field256 >> 7;
				int var10 = var7.field257 >> 7;
				if (var9 >= 0 && var9 < 104 && var10 >= 0 && var10 < 104) {
					if (var7.field260 == 1 && (var7.field256 & 0x7F) == 0x40 && (var7.field257 & 0x7F) == 0x40) {
						if (field1090[var9][var10] == field1152) {
							continue;
						}

						field1090[var9][var10] = field1152;
					}

					field1020.method47(var7.field258, var7, var8, method349(var7.field256, var7.field257, field1069), var7.field256, field1069, var7.field259, (var7.field260 - 1) * 64 + 60, var7.field257, null);
				}
			}
		}

		for (class26 var11 = (class26) field1104.method203(); var11 != null; var11 = (class26) field1104.method205()) {
			if (field1069 != var11.field329 || field877 > var11.field335) {
				var11.method89();
			} else if (field877 >= var11.field334) {
				if (var11.field338 > 0) {
					class24 var12 = field1141[var11.field338 - 1];
					if (var12 != null) {
						var11.method99(var12.field257, method349(var12.field256, var12.field257, var11.field329) - var11.field333, var12.field256, field877);
					}
				}

				if (var11.field338 < 0) {
					int var13 = -var11.field338 - 1;
					class25 var14;
					if (field922 == var13) {
						var14 = field1010;
					} else {
						var14 = field957[var13];
					}

					if (var14 != null) {
						var11.method99(var14.field257, method349(var14.field256, var14.field257, var11.field329) - var11.field333, var14.field256, field877);
					}
				}

				var11.method100(field980);
				field1020.method47(var11.field348, var11, -1, (int) var11.field342, (int) var11.field340, field1069, 0, 60, (int) var11.field341, null);
			}
		}

		for (class27 var15 = (class27) field900.method203(); var15 != null; var15 = (class27) field900.method205()) {
			if (field1069 != var15.field354 || var15.field360) {
				var15.method89();
			} else if (field877 >= var15.field353) {
				var15.method101(field980);

				if (var15.field360) {
					var15.method89();
				} else {
					field1020.method47(0, var15, -1, var15.field357, var15.field355, var15.field354, 0, 60, var15.field356, null);
				}
			}
		}

		for (class39 var16 = (class39) field1071.method203(); var16 != null; var16 = (class39) field1071.method205()) {
			boolean var17 = false;
			var16.field561 += field980;

			if (var16.field560 == -1) {
				var16.field560 = 0;
				var17 = true;
			}

			while (var16.field561 > var16.field559.field827[var16.field560]) {
				var16.field561 -= var16.field559.field827[var16.field560] + 1;
				var16.field560++;
				var17 = true;

				if (var16.field560 >= var16.field559.field824) {
					var16.field560 -= var16.field559.field828;
					if (var16.field560 < 0 || var16.field560 >= var16.field559.field824) {
						break;
					}
				}
			}

			var16.method89();
			var17 = false;
			if (var17) {
				int var18 = 0;
				if (var16.field555 == 1) {
					var18 = field1020.method60(var16.field554, var16.field557, var16.field556);
				}

				if (var16.field555 == 2) {
					var18 = field1020.method61(var16.field554, var16.field556, var16.field557);
				}

				if (var18 != 0 && (var18 >> 14 & 0x7FFF) == var16.field558) {
					class49 var19 = class49.method237(var16.field558);
					int var20 = -1;
					if (var16.field560 != -1) {
						var20 = var16.field559.field825[var16.field560];
					}

					if (var16.field555 == 2) {
						int var21 = field1020.method63(var16.field554, var16.field556, var16.field557, var18) >> 6;
						class30 var22 = var19.method240(10, var21, 0, 0, 0, 0, var20);
						field1020.method52(var16.field554, var16.field556, var16.field557, var22);
					} else if (var16.field555 == 1) {
						class30 var23 = var19.method240(4, 0, 0, 0, 0, 0, var20);
						field1020.method53(var23, var16.field556, var16.field554, var16.field557);
					}
				} else {
					var16.method89();
				}
			}
		}

		int var24 = method349(field1128, field1129, field1069);
		field973 = field967;
		if (field974 / 256 > field973) {
			field973 = field974 / 256;
		}

		method350(field1129, field1128, field968, var24 - 50, field973, field973 * 3 + 600);
		int var25 = 3;
		if (field973 < 310) {
			int var26 = field970 >> 7;
			int var27 = field972 >> 7;
			int var28 = field1010.field256 >> 7;
			int var29 = field1010.field257 >> 7;

			if ((field1110[field1069][var26][var27] & 0x4) != 0) {
				var25 = field1069;
			}

			int var30;
			if (var28 > var26) {
				var30 = var28 - var26;
			} else {
				var30 = var26 - var28;
			}

			int var31;
			if (var29 > var27) {
				var31 = var29 - var27;
			} else {
				var31 = var27 - var29;
			}

			if (var30 > var31) {
				int var32 = var31 * 0x10000 / var30;
				int var33 = 32768;
				while (var26 != var28) {
					if (var26 < var28) {
						var26++;
					} else if (var26 > var28) {
						var26--;
					}

					if ((field1110[field1069][var26][var27] & 0x4) != 0) {
						var25 = field1069;
					}

					var33 += var32;
					if (var33 >= 0x10000) {
						var33 -= 0x10000;

						if (var27 < var29) {
							var27++;
						} else if (var27 > var29) {
							var27--;
						}

						if ((field1110[field1069][var26][var27] & 0x4) != 0) {
							var25 = field1069;
						}
					}
				}
			} else {
				int var34 = var30 * 0x10000 / var31;
				int var35 = 32768;
				while (var27 != var29) {
					if (var27 < var29) {
						var27++;
					} else if (var27 > var29) {
						var27--;
					}

					if ((field1110[field1069][var26][var27] & 0x4) != 0) {
						var25 = field1069;
					}

					var35 += var34;
					if (var35 >= 0x10000) {
						var35 -= 0x10000;

						if (var26 < var28) {
							var26++;
						} else if (var26 > var28) {
							var26--;
						}

						if ((field1110[field1069][var26][var27] & 0x4) != 0) {
							var25 = field1069;
						}
					}
				}
			}
		}

		if ((field1110[field1069][field1010.field256 >> 7][field1010.field257 >> 7] & 0x4) != 0) {
			var25 = field1069;
		}

		int var36 = class32.field497;
		class30.field458 = true;
		class30.field461 = 0;
		class30.field459 = field15 - 8;
		class30.field460 = field16 - 11;
		class31.method130();
		field1020.method72(field970, field971, field972, field973, field968, var25);
		field1020.method50();

		for (int var37 = -1; var37 < field958 + field1142; var37++) {
			class23 var38;
			if (var37 == -1) {
				var38 = field1010;
			} else if (var37 < field958) {
				var38 = field957[field959[var37]];
			} else {
				var38 = field1141[field1143[var37 - field958]];
			}

			if (var37 < field958) {
				class25 var39 = (class25) var38;
				if (var39.field310 != 0) {
					method348(var38.field300 + 15, var38);

					if (field888 > -1) {
						int var40 = 28;
						for (int var41 = 0; var41 < 8; var41++) {
							if ((var39.field310 & 1 << var41) != 0) {
								field862[var41].method155(field888 - 12, field889 - var40);
								var40 -= 25;
							}
						}
					}
				}
			}

			if (var38.field267 != null && (var37 >= field958 || field1016 == 0 || field1016 == 1 && method393(((class25) var38).field307))) {
				method348(var38.field300, var38);

				if (field888 > -1) {
					if (field939 == 0) {
						int var42 = 0xFFFF00;
						if (var38.field269 < 6) {
							var42 = field1012[var38.field269];
						}

						if (var38.field269 == 6) {
							var42 = field1152 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
						}

						if (var38.field269 == 7) {
							var42 = field1152 % 20 < 10 ? 0xFF : 0xFFFF;
						}

						if (var38.field269 == 8) {
							var42 = field1152 % 20 < 10 ? 0xB000 : 0x80FF80;
						}

						if (var38.field269 == 9) {
							int var43 = 150 - var38.field268;
							if (var43 < 50) {
								var42 = var43 * 1280 + 0xFF0000;
							} else if (var43 < 100) {
								var42 = 0xFFFF00 - (var43 - 50) * 0x50000;
							} else if (var43 < 150) {
								var42 = (var43 - 100) * 5 + 0xFF00;
							}
						}

						if (var38.field269 == 10) {
							int var44 = 150 - var38.field268;
							if (var44 < 50) {
								var42 = var44 * 5 + 0xFF0000;
							} else if (var44 < 100) {
								var42 = 0xFF00FF - (var44 - 50) * 0x50000;
							} else if (var44 < 150) {
								var42 = (var44 - 100) * 0x50000 + 255 - (var44 - 100) * 5;
							}
						}

						if (var38.field269 == 11) {
							int var45 = 150 - var38.field268;
							if (var45 < 50) {
								var42 = 0xFFFFFF - var45 * 327685;
							} else if (var45 < 100) {
								var42 = (var45 - 50) * 327685 + 0xFF00;
							} else if (var45 < 150) {
								var42 = 0xFFFFFF - (var45 - 100) * 0x50000;
							}
						}

						if (var38.field270 == 0) {
							field883.method168(field889 + 1, field888, 0, var38.field267);
							field883.method168(field889, field888, var42, var38.field267);
						}

						if (var38.field270 == 1) {
							field883.method172(field888, 0, field1152, field889 + 1, var38.field267);
							field883.method172(field888, var42, field1152, field889, var38.field267);
						}

						if (var38.field270 == 2) {
							int var46 = field883.method170(var38.field267);
							int var47 = (150 - var38.field268) * (var46 + 100) / 150;
							class31.method129(field888 + 50, field888 - 50, 0, 334);
							field883.method171(var38.field267, field888 + 50 - var47, field889 + 1, 0);
							field883.method171(var38.field267, field888 + 50 - var47, field889, var42);
							class31.method128();
						}
					} else {
						field883.method168(field889 + 1, field888, 0, var38.field267);
						field883.method168(field889, field888, 0xFFFF00, var38.field267);
					}
				}
			}

			if (var38.field273 > field877 + 100) {
				method348(var38.field300 + 15, var38);

				if (field888 > -1) {
					int var48 = var38.field274 * 30 / var38.field275;
					if (var48 > 30) {
						var48 = 30;
					}

					class31.method131(0xFF00, var48, field889 - 3, 5, field888 - 15);
					class31.method131(0xFF0000, 30 - var48, field889 - 3, 5, field888 + var48 - 15);
				}
			}

			if (var38.field273 > field877 + 330) {
				method348(var38.field300 / 2, var38);

				if (field888 > -1) {
					field880[var38.field272].method155(field888 - 12, field889 - 12);
					field881.method168(field889 + 4, field888, 0, String.valueOf(var38.field271));
					field881.method168(field889 + 3, field888 - 1, 0xFFFFFF, String.valueOf(var38.field271));
				}
			}
		}

		if (field1051 == 1) {
			field1078[field1050 / 100].method155(field1048 - 8 - 8, field1049 - 8 - 11);
		}

		if (field1051 == 2) {
			field1078[field1050 / 100 + 4].method155(field1048 - 8 - 8, field1049 - 8 - 11);
		}

		if (field931 != -1) {
			method376(0, class56.field760[field931], 0, 0);
		}

		int var49 = (field1010.field256 >> 7) + field1132;
		int var50 = (field1010.field257 >> 7) + field1133;
		if (var49 >= 2944 && var49 < 3392 && var50 >= 3520 && var50 < 6400) {
			field949 = (var50 - 3520) / 8 + 1;
		} else {
			field949 = 0;
		}

		if (!field1089) {
			method371();
			method367();
		} else if (field1026 == 0) {
			method368();
		}

		if (!field893 && class32.field496[17] >= var36) {
			class34 var51 = class32.field490[17];
			int var52 = var51.field510 * var51.field509 - 1;
			int var53 = field980 * var51.field509 * 2;
			byte[] var54 = var51.field507;
			byte[] var55 = field1004;
			for (int var56 = 0; var56 <= var52; var56++) {
				var55[var56] = var54[var56 - var53 & var52];
			}

			var51.field507 = var55;
			field1004 = var54;
			class32.method142(17);
		}

		if (field965 == 1) {
			field862[1].method155(5, 296);
		}

		if (field949 > 0) {
			field862[0].method155(472, 296);
			field882.method168(329, 484, 0xFFFF00, "Level: " + field949);
		} else if (field893) {
			int var57 = 0xFFFF00;
			Runtime var58 = Runtime.getRuntime();
			long var59 = var58.totalMemory();
			long var61 = var58.freeMemory();
			if (!signlink.sunjava && var59 - var61 > 0x2000000L && field877 > field1109 + 500) {
				method341();
				var58.gc();
				int var63 = 0xFF0000;
				field1109 = field877;
			}
		}

		if (field953 != 0) {
			int var64 = field953 / 50;
			int var65 = var64 / 60;
			var64 %= 60;
			if (var64 < 10) {
				field882.method168(329, 256, 0xFFFF00, "System update in: " + var65 + ":0" + var64);
			} else {
				field882.method168(329, 256, 0xFFFF00, "System update in: " + var65 + ":" + var64);
			}
		}

		field1007.method211(field8, 8, 11);
	}

	@ObfuscatedName("client.a(IILw;)V")
	public final void method348(int arg0, class23 arg1) {
		int var3 = arg1.field256;
		int var4 = arg1.field257;
		int var5 = method349(arg1.field256, arg1.field257, field1069) - arg0;
		field973 = field967;
		if (field974 / 256 > field973) {
			field973 = field974 / 256;
		}

		var3 -= field970;
		var5 -= field971;
		var4 -= field972;
		int var6 = class30.field463[field973];
		int var7 = class30.field464[field973];
		int var8 = class30.field463[field968];
		int var9 = class30.field464[field968];
		int var10 = var3 * var9 + var4 * var8 >> 16;
		var4 = var4 * var9 - var3 * var8 >> 16;
		int var12 = var5 * var7 - var4 * var6 >> 16;
		var4 = var4 * var7 + var5 * var6 >> 16;
		if (var4 >= 50) {
			field888 = (var10 << 9) / var4 + class32.field482;
			field889 = (var12 << 9) / var4 + class32.field483;
		} else {
			field888 = -1;
			field889 = -1;
		}
	}

	@ObfuscatedName("client.a(IBII)I")
	public final int method349(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		int var6 = arg2;
		if (arg2 < 3 && (field1110[1][var4][var5] & 0x2) == 2) {
			var6 = arg2 + 1;
		}

		int var7 = arg0 & 0x7F;
		int var8 = arg1 & 0x7F;
		int var9 = (128 - var7) * field975[var6][var4][var5] + field975[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * field975[var6][var4][var5 + 1] + field975[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = class30.field463[var7];
			int var13 = class30.field464[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class30.field463[var8];
			int var16 = class30.field464[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field970 = arg1 - var9;
		field971 = arg3 - var10;
		field972 = arg0 - var11;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method351() {
		try {
			field1079 = -1;
			field1077.method207();
			field1071.method207();
			field900.method207();
			field1104.method207();
			class32.method138();
			method341();
			field1020.method36();

			for (int var1 = 0; var1 < 4; var1++) {
				field868[var1].method256();
			}

			System.gc();
			class3 var2 = new class3(field1110, field975, 104, 104);
			byte[] var3 = new byte[100000];
			int var4 = field983.length;

			if (field893) {
				field1020.method37(field1069);
			} else {
				field1020.method37(0);
			}

			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = (field897[var5] >> 8) * 64 - field1132;
				int var7 = (field897[var5] & 0xFF) * 64 - field1133;
				byte[] var8 = field983[var5];
				if (var8 != null) {
					int var9 = (new class36(var8)).method190();
					class43.method213(var3, var9, var8, var8.length - 4, 4);
					var2.method15(var3, (field906 - 6) * 8, var7, var6, (field907 - 6) * 8);
				} else if (field907 < 800) {
					var2.method14(var7, 64, 64, var6);
				}
			}

			for (int var10 = 0; var10 < var4; var10++) {
				byte[] var11 = field1011[var10];
				if (var11 != null) {
					int var12 = (new class36(var11)).method190();
					class43.method213(var3, var12, var11, var11.length - 4, 4);
					int var13 = (field897[var10] >> 8) * 64 - field1132;
					int var14 = (field897[var10] & 0xFF) * 64 - field1133;
					var2.method16(var3, field1071, field868, field1020, var14, var13);
				}
			}

			var2.method18(field868, field1020);
			field1007.method210();

			for (int var15 = 0; var15 < 104; var15++) {
				for (int var16 = 0; var16 < 104; var16++) {
					method364(var15, var16);
				}
			}

			for (class37 var17 = (class37) field921.method203(); var17 != null; var17 = (class37) field921.method205()) {
				method362(var17.field536, var17.field542, var17.field539, var17.field538, var17.field537, var17.field541, var17.field540);
			}
		} catch (Exception var19) {
		}

		class49.field669.method86();
		System.gc();
		class32.method139(20);
	}

	@ObfuscatedName("client.b(II)V")
	public final void method352(int arg0) {
		int[] var2 = field1139.field500;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1110[arg0][var7][var5] & 0x18) == 0) {
					field1020.method68(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1110[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1020.method68(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field1139.method152();

		for (int var8 = 1; var8 < 103; var8++) {
			for (int var9 = 1; var9 < 103; var9++) {
				if ((field1110[arg0][var9][var8] & 0x18) == 0) {
					method353(var9, var8, arg0);
				}

				if (arg0 < 3 && (field1110[arg0 + 1][var9][var8] & 0x8) != 0) {
					method353(var9, var8, arg0 + 1);
				}
			}
		}

		field1007.method210();
		field890 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = field1020.method62(field1069, var10, var11);
				if (var12 != 0) {
					var12 = var12 >> 14 & 0x7FFF;
					int var13 = class49.method237(var12).field661;
					if (var13 >= 0) {
						field1013[field890] = field995[var13];
						field891[field890] = var10;
						field892[field890] = var11;
						field890++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)V")
	public final void method353(int arg0, int arg1, int arg2) {
		int var4 = field1020.method59(arg2, arg0, arg1);
		if (var4 != 0) {
			int var5 = field1020.method63(arg2, arg0, arg1, var4);
			int var6 = var5 >> 6 & 0x3;
			int var7 = var5 & 0x1F;
			int var8 = 0xEEEEEE;
			if (var4 > 0) {
				var8 = 0xEE0000;
			}

			int[] var9 = field1139.field500;
			int var10 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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

		int var11 = field1020.method61(arg2, arg0, arg1);
		if (var11 != 0) {
			int var12 = field1020.method63(arg2, arg0, arg1, var11);
			int var13 = var12 >> 6 & 0x3;
			int var14 = var12 & 0x1F;
			if (var14 == 9) {
				int var15 = 0xEEEEEE;
				if (var11 > 0) {
					var15 = 0xEE0000;
				}

				int[] var16 = field1139.field500;
				int var17 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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

			if (var14 == 10 || var14 == 11) {
				int var18 = var11 >> 14 & 0x7FFF;
				class49 var19 = class49.method237(var18);
				if (var19.field662 != -1) {
					class34 var20 = field1103[var19.field662];
					int var21 = (var19.field647 * 4 - var20.field509) / 2;
					int var22 = (var19.field648 * 4 - var20.field510) / 2;
					var20.method166(arg0 * 4 + var21 + 48, (104 - arg1 - var19.field648) * 4 + 48 + var22);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILw;I)V")
	public final void method354(int arg0, class23 arg1, int arg2) {
		if (arg1 == null) {
			System.out.println("null entity");
		} else {
			if (arg1.field256 < 0 || arg1.field257 < 0 || arg1.field256 >= 13312 || arg1.field257 >= 13312) {
				arg1.field282 = -1;
				arg1.field287 = -1;
				arg1.field296 = 0;
				arg1.field297 = 0;
				arg1.field256 = arg1.field303[0] * 128 + arg1.field260 * 64;
				arg1.field257 = arg1.field304[0] * 128 + arg1.field260 * 64;
				arg1.field302 = 0;
			}

			boolean var4 = false;
			if (arg1.field282 != -1 && arg1.field285 == 0) {
				try {
					class58 var5 = class58.field823[arg1.field282];
					if (var5.field829 == null) {
						var4 = true;
						arg1.field305++;
					}
				} catch (Exception var36) {
					System.out.println("e2: " + arg1.field282);
				}
			}

			if (arg1.field296 > field877) {
				int var6 = arg1.field296 - field877;
				int var7 = arg1.field292 * 128 + arg1.field260 * 64;
				int var8 = arg1.field294 * 128 + arg1.field260 * 64;
				arg1.field256 += (var7 - arg1.field256) / var6;
				arg1.field257 += (var8 - arg1.field257) / var6;
				arg1.field305 = 0;

				if (arg1.field298 == 0) {
					arg1.field301 = 1024;
				}

				if (arg1.field298 == 1) {
					arg1.field301 = 1536;
				}

				if (arg1.field298 == 2) {
					arg1.field301 = 0;
				}

				if (arg1.field298 == 3) {
					arg1.field301 = 512;
				}
			} else if (arg1.field297 >= field877) {
				try {
					if (field877 == arg1.field297 || !var4 || arg1.field284 + 1 > class58.field823[arg1.field282].field827[arg1.field283]) {
						int var9 = arg1.field297 - arg1.field296;
						int var10 = field877 - arg1.field296;
						int var11 = arg1.field292 * 128 + arg1.field260 * 64;
						int var12 = arg1.field294 * 128 + arg1.field260 * 64;
						int var13 = arg1.field293 * 128 + arg1.field260 * 64;
						int var14 = arg1.field295 * 128 + arg1.field260 * 64;
						arg1.field256 = ((var9 - var10) * var11 + var10 * var13) / var9;
						arg1.field257 = ((var9 - var10) * var12 + var10 * var14) / var9;
					}

					arg1.field305 = 0;

					if (arg1.field298 == 0) {
						arg1.field301 = 1024;
					}

					if (arg1.field298 == 1) {
						arg1.field301 = 1536;
					}

					if (arg1.field298 == 2) {
						arg1.field301 = 0;
					}

					if (arg1.field298 == 3) {
						arg1.field301 = 512;
					}

					arg1.field258 = arg1.field301;
				} catch (Exception var41) {
					System.out.println("e4: " + arg1.field282);
				}
			} else {
				try {
					if (arg1.field302 == 0) {
						arg1.field305 = 0;
					}

					if (arg1.field302 <= 0 || var4) {
						arg1.field279 = arg1.field265;
					} else {
						int var15 = arg1.field256;
						int var16 = arg1.field257;
						int var17 = arg1.field303[arg1.field302 - 1] * 128 + arg1.field260 * 64;
						int var18 = arg1.field304[arg1.field302 - 1] * 128 + arg1.field260 * 64;
						if (var17 - var15 <= 256 && var17 - var15 >= -256 && var18 - var16 <= 256 && var18 - var16 >= -256) {
							if (var15 < var17) {
								if (var16 < var18) {
									arg1.field301 = 1280;
								} else if (var16 > var18) {
									arg1.field301 = 1792;
								} else {
									arg1.field301 = 1536;
								}
							} else if (var15 > var17) {
								if (var16 < var18) {
									arg1.field301 = 768;
								} else if (var16 > var18) {
									arg1.field301 = 256;
								} else {
									arg1.field301 = 512;
								}
							} else if (var16 < var18) {
								arg1.field301 = 1024;
							} else {
								arg1.field301 = 0;
							}

							int var19 = arg1.field301 - arg1.field258 & 0x7FF;
							if (var19 > 1024) {
								var19 -= 2048;
							}

							int var20 = arg1.field262;
							if (var19 >= -256 && var19 <= 256) {
								var20 = arg1.field261;
							} else if (var19 >= 256 && var19 < 768) {
								var20 = arg1.field264;
							} else if (var19 >= -768 && var19 <= -256) {
								var20 = arg1.field263;
							}

							if (var20 == -1) {
								var20 = arg1.field261;
							}

							if (arg1.field279 != var20) {
								arg1.field279 = var20;
								arg1.field280 = 0;
								arg1.field281 = 0;
							}

							byte var21 = 4;
							if (arg1.field301 != arg1.field258 && arg1.field276 == -1) {
								var21 = 2;
							}

							if (arg1.field302 > 2) {
								var21 = 6;
							}

							if (arg1.field302 > 3) {
								var21 = 8;
							}

							if (arg1.field305 > 0 && arg1.field302 > 1) {
								var21 = 8;
								arg1.field305--;
							}

							if (var15 < var17) {
								arg1.field256 += var21;
								if (arg1.field256 > var17) {
									arg1.field256 = var17;
								}
							} else if (var15 > var17) {
								arg1.field256 -= var21;
								if (arg1.field256 < var17) {
									arg1.field256 = var17;
								}
							}

							if (var16 < var18) {
								arg1.field257 += var21;
								if (arg1.field257 > var18) {
									arg1.field257 = var18;
								}
							} else if (var16 > var18) {
								arg1.field257 -= var21;
								if (arg1.field257 < var18) {
									arg1.field257 = var18;
								}
							}

							if (arg1.field256 == var17 && arg1.field257 == var18) {
								arg1.field302--;
							}
						} else {
							arg1.field256 = var17;
							arg1.field257 = var18;
						}
					}
				} catch (Exception var42) {
					System.out.println("e5: " + arg1.field302);
				}
			}

			if (arg1.field276 != -1 && arg1.field276 < 32768) {
				try {
					class24 var22 = field1141[arg1.field276];
					if (var22 != null) {
						int var23 = arg1.field256 - var22.field256;
						int var24 = arg1.field257 - var22.field257;
						if (var23 != 0 || var24 != 0) {
							arg1.field301 = (int) (Math.atan2(var23, var24) * 325.949D) & 0x7FF;
						}
					}
				} catch (Exception var40) {
					System.out.println("e6: " + arg1.field276);
				}
			}

			if (arg1.field276 >= 32768) {
				try {
					int var25 = arg1.field276 - 32768;
					if (field922 == var25) {
						var25 = field956;
					}

					class25 var26 = field957[var25];
					if (var26 != null) {
						int var27 = arg1.field256 - var26.field256;
						int var28 = arg1.field257 - var26.field257;
						if (var27 != 0 || var28 != 0) {
							arg1.field301 = (int) (Math.atan2(var27, var28) * 325.949D) & 0x7FF;
						}
					}
				} catch (Exception var39) {
					System.out.println("e7: " + arg1.field276);
				}
			}

			if ((arg1.field277 != 0 || arg1.field278 != 0) && (arg1.field302 == 0 || arg1.field305 > 0)) {
				int var29 = arg1.field256 - (arg1.field277 - field1132 - field1132) * 64;
				int var30 = arg1.field257 - (arg1.field278 - field1133 - field1133) * 64;
				if (var29 != 0 || var30 != 0) {
					arg1.field301 = (int) (Math.atan2(var29, var30) * 325.949D) & 0x7FF;
				}

				arg1.field277 = 0;
				arg1.field278 = 0;
			}

			int var31 = arg1.field301 - arg1.field258 & 0x7FF;
			if (var31 != 0) {
				if (var31 < 32 || var31 > 2016) {
					arg1.field258 = arg1.field301;
				} else if (var31 > 1024) {
					arg1.field258 -= 32;
				} else {
					arg1.field258 += 32;
				}

				arg1.field258 &= 0x7FF;

				if (arg1.field279 == arg1.field265) {
					if (arg1.field266 == -1) {
						arg1.field279 = arg1.field261;
					} else {
						arg1.field279 = arg1.field266;
					}
				}
			}

			arg1.field259 = 0;

			if (arg1.field279 != -1) {
				try {
					class58 var32 = class58.field823[arg1.field279];
					arg1.field281++;
					if (arg1.field280 < var32.field824 && arg1.field281 > var32.field827[arg1.field280]) {
						arg1.field281 = 0;
						arg1.field280++;
					}

					if (arg1.field280 >= var32.field824) {
						arg1.field281 = 0;
						arg1.field280 = 0;
					}
				} catch (Exception var35) {
					System.out.println("e8: " + arg1.field279);
				}
			}

			if (arg1.field282 != -1 && arg1.field285 == 0) {
				try {
					class58 var33 = class58.field823[arg1.field282];
					arg1.field284++;
					while (arg1.field283 < var33.field824 && arg1.field284 > var33.field827[arg1.field283]) {
						arg1.field284 -= var33.field827[arg1.field283];
						arg1.field283++;
					}

					if (arg1.field283 >= var33.field824) {
						arg1.field283 -= var33.field828;
						arg1.field286++;
						if (arg1.field286 >= var33.field834) {
							arg1.field282 = -1;
						}

						if (arg1.field283 < 0 || arg1.field283 >= var33.field824) {
							arg1.field282 = -1;
						}
					}

					arg1.field259 = var33.field830;
				} catch (Exception var38) {
					System.out.println("e9: " + arg1.field282);
				}
			}

			if (arg1.field285 > 0) {
				arg1.field285--;
			}

			if (arg1.field287 != -1 && field877 >= arg1.field290) {
				try {
					if (arg1.field288 < 0) {
						arg1.field288 = 0;
					}

					class58 var34 = class59.field836[arg1.field287].field839;
					arg1.field289++;
					while (arg1.field288 < var34.field824 && arg1.field289 > var34.field827[arg1.field288]) {
						arg1.field289 -= var34.field827[arg1.field288];
						arg1.field288++;
					}

					if (arg1.field288 >= var34.field824) {
						arg1.field287 = -1;
						return;
					}
				} catch (Exception var37) {
					System.out.println("e10: " + arg1.field287);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method355() {
		for (int var1 = -1; var1 < field958; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field956;
			} else {
				var2 = field959[var1];
			}

			class25 var3 = field957[var2];
			method354(1, var3, var2 + 32768);
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method356(int arg0) {
		field957[arg0] = null;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method357() {
		for (int var1 = 0; var1 < field1142; var1++) {
			int var2 = field1143[var1];
			class24 var3 = field1141[var2];
			method354(var3.field306.field679, var3, var2);
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method358(int arg0) {
		if (field1141[arg0] != null) {
			field1141[arg0].field306 = null;
		}

		field1141[arg0] = null;
	}

	@ObfuscatedName("client.a(IIIII)V")
	public final void method359(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1020.method63(field1069, arg1, arg2, arg0);
		if (var6 != -1) {
			int var7 = var6 & 0x1F;
			int var8 = var6 >> 6 & 0x3;
			if (var7 == 10 || var7 == 11 || var7 == 22) {
				class49 var9 = class49.method237(var5);
				int var10;
				int var11;
				if (var8 == 0 || var8 == 2) {
					var10 = var9.field647;
					var11 = var9.field648;
				} else {
					var10 = var9.field648;
					var11 = var9.field647;
				}

				int var12 = var9.field668;
				if (var8 != 0) {
					var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
				}

				method360(arg2, 0, false, var10, arg1, field1010.field303[0], var12, var11, 0, field1010.field304[0]);
			} else {
				method360(arg2, var7 + 1, false, 0, arg1, field1010.field303[0], 0, 0, var8, field1010.field304[0]);
			}

			field1048 = field18;
			field1049 = field19;
			field1051 = 2;
			field1050 = 0;
			field920.method177(arg3);
			field920.method179(field1132 + arg1);
			field920.method179(field1133 + arg2);
			field920.method179(var5);
		}
	}

	@ObfuscatedName("client.a(IZIZIIIIIII)Z")
	public final boolean method360(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		byte var11 = 104;
		byte var12 = 104;
		for (int var13 = 0; var13 < var11; var13++) {
			for (int var14 = 0; var14 < var12; var14++) {
				field898[var13][var14] = 0;
				field994[var13][var14] = 99999999;
			}
		}

		int var15 = arg5;
		int var16 = arg9;
		field898[arg5][arg9] = 99;
		field994[arg5][arg9] = 0;
		byte var17 = 0;
		int var18 = 0;
		field1056[var17] = arg5;
		int var34 = var17 + 1;
		field1057[var17] = arg9;
		boolean var19 = false;
		int var20 = field1056.length;
		int[][] var21 = field868[field1069].field740;
		while (var34 != var18) {
			var15 = field1056[var18];
			var16 = field1057[var18];
			var18 = (var18 + 1) % var20;

			if (arg4 == var15 && arg0 == var16) {
				var19 = true;
				break;
			}

			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && field868[field1069].method265(var15, arg8, var16, arg0, arg1 - 1, arg4)) {
					var19 = true;
					break;
				}

				if (arg1 < 10 && field868[field1069].method266(arg0, var16, arg1 - 1, arg4, var15, arg8)) {
					var19 = true;
					break;
				}
			}

			if (arg3 != 0 && arg7 != 0 && field868[field1069].method267(arg7, var16, arg6, var15, arg4, arg3, arg0)) {
				var19 = true;
				break;
			}

			int var22 = field994[var15][var16] + 1;
			if (var15 > 0 && field898[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 0x280108) == 0) {
				field1056[var34] = var15 - 1;
				field1057[var34] = var16;
				var34 = (var34 + 1) % var20;
				field898[var15 - 1][var16] = 2;
				field994[var15 - 1][var16] = var22;
			}

			if (var15 < var11 - 1 && field898[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 0x280180) == 0) {
				field1056[var34] = var15 + 1;
				field1057[var34] = var16;
				var34 = (var34 + 1) % var20;
				field898[var15 + 1][var16] = 8;
				field994[var15 + 1][var16] = var22;
			}

			if (var16 > 0 && field898[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field1056[var34] = var15;
				field1057[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field898[var15][var16 - 1] = 1;
				field994[var15][var16 - 1] = var22;
			}

			if (var16 < var12 - 1 && field898[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field1056[var34] = var15;
				field1057[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field898[var15][var16 + 1] = 4;
				field994[var15][var16 + 1] = var22;
			}

			if (var15 > 0 && var16 > 0 && field898[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 0x28010E) == 0 && (var21[var15 - 1][var16] & 0x280108) == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field1056[var34] = var15 - 1;
				field1057[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field898[var15 - 1][var16 - 1] = 3;
				field994[var15 - 1][var16 - 1] = var22;
			}

			if (var15 < var11 - 1 && var16 > 0 && field898[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 0x280183) == 0 && (var21[var15 + 1][var16] & 0x280180) == 0 && (var21[var15][var16 - 1] & 0x280102) == 0) {
				field1056[var34] = var15 + 1;
				field1057[var34] = var16 - 1;
				var34 = (var34 + 1) % var20;
				field898[var15 + 1][var16 - 1] = 9;
				field994[var15 + 1][var16 - 1] = var22;
			}

			if (var15 > 0 && var16 < var12 - 1 && field898[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 0x280138) == 0 && (var21[var15 - 1][var16] & 0x280108) == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field1056[var34] = var15 - 1;
				field1057[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field898[var15 - 1][var16 + 1] = 6;
				field994[var15 - 1][var16 + 1] = var22;
			}

			if (var15 < var11 - 1 && var16 < var12 - 1 && field898[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 0x2801E0) == 0 && (var21[var15 + 1][var16] & 0x280180) == 0 && (var21[var15][var16 + 1] & 0x280120) == 0) {
				field1056[var34] = var15 + 1;
				field1057[var34] = var16 + 1;
				var34 = (var34 + 1) % var20;
				field898[var15 + 1][var16 + 1] = 12;
				field994[var15 + 1][var16 + 1] = var22;
			}
		}

		if (!var19) {
			if (arg2) {
				int var23 = 100;
				for (int var24 = 1; var24 < 2; var24++) {
					for (int var25 = arg4 - var24; var25 <= arg4 + var24; var25++) {
						for (int var26 = arg0 - var24; var26 <= arg0 + var24; var26++) {
							if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && field994[var25][var26] < var23) {
								var23 = field994[var25][var26];
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
		field1056[var27] = var15;
		int var35 = var27 + 1;
		field1057[var27] = var16;
		int var28;
		int var29 = var28 = field898[var15][var16];
		while (arg5 != var15 || arg9 != var16) {
			if (var28 != var29) {
				var28 = var29;
				field1056[var35] = var15;
				field1057[var35++] = var16;
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

			var29 = field898[var15][var16];
		}

		if (var35 > 0) {
			int var30 = var35;
			if (var35 > 25) {
				var30 = 25;
			}

			var35--;
			int var31 = field1056[var35];
			int var32 = field1057[var35];
			field920.method177(147);
			field920.method178(var30 + var30 + 2);
			field920.method179(field1132 + var31);
			field920.method179(field1133 + var32);

			for (int var33 = 1; var33 < var30; var33++) {
				var35--;
				field920.method178(field1056[var35] - var31);
				field920.method178(field1057[var35] - var32);
			}
		}

		return true;
	}

	@ObfuscatedName("client.q(I)Z")
	public final boolean method361() {
		if (field951 == null) {
			return false;
		}

		try {
			int var1 = field951.method30();
			if (var1 == 0) {
				return false;
			}

			if (field936 == -1) {
				field951.method31(field930.field524, 0, 1);
				field936 = field930.field524[0] & 0xFF;
				if (field899 != null) {
					field936 = field936 - field899.method221() & 0xFF;
				}

				field935 = class52.field735[field936];
				var1--;
			}

			if (field935 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field951.method31(field930.field524, 0, 1);
				field935 = field930.field524[0] & 0xFF;
				var1--;
			}

			if (field935 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field951.method31(field930.field524, 0, 2);
				field930.field525 = 0;
				field935 = field930.method187();
				var1 -= 2;
			}

			if (var1 < field935) {
				return false;
			}

			field930.field525 = 0;
			field951.method31(field930.field524, 0, field935);
			field937 = 0;

			if (field936 == 232) {
				field1007.method210();
				field882.method168(151, 257, 0, "Loading - please wait.");
				field882.method168(150, 256, 0xFFFFFF, "Loading - please wait.");
				field1007.method211(field8, 8, 11);
				field878 = 1;
				field906 = field930.method187();
				field907 = field930.method187();
				field1132 = (field906 - 6) * 8;
				field1133 = (field907 - 6) * 8;
				signlink.looprate(5);
				int var2 = (field935 - 2) / 10;
				field983 = new byte[var2][];
				field1011 = new byte[var2][];
				field897 = new int[var2];
				field920.method177(117);
				field920.method178(0);
				int var3 = 0;
				for (int var4 = 0; var4 < var2; var4++) {
					int var5 = field930.method185();
					int var6 = field930.method185();
					int var7 = field930.method190();
					int var8 = field930.method190();
					field897[var4] = (var5 << 8) + var6;

					if (var7 != 0) {
						byte[] var9 = signlink.cacheload("m" + var5 + "_" + var6);
						if (var9 != null) {
							field954.reset();
							field954.update(var9);

							if ((int) field954.getValue() != var7) {
								var9 = null;
							}
						}

						if (var9 == null) {
							field878 = 0;
							field920.method178(0);
							field920.method178(var5);
							field920.method178(var6);
							var3 += 3;
						} else {
							field983[var4] = var9;
						}
					}

					if (var8 != 0) {
						byte[] var10 = signlink.cacheload("l" + var5 + "_" + var6);
						if (var10 != null) {
							field954.reset();
							field954.update(var10);

							if ((int) field954.getValue() != var8) {
								var10 = null;
							}
						}

						if (var10 == null) {
							field878 = 0;
							field920.method178(1);
							field920.method178(var5);
							field920.method178(var6);
							var3 += 3;
						} else {
							field1011[var4] = var10;
						}
					}
				}

				field920.method184(var3);
				signlink.looprate(100);
				int var11 = field1132 - field1134;
				int var12 = field1133 - field1135;
				field1134 = field1132;
				field1135 = field1133;

				for (int var13 = 0; var13 < 8192; var13++) {
					class24 var14 = field1141[var13];
					if (var14 != null) {
						for (int var15 = 0; var15 < 10; var15++) {
							var14.field303[var15] -= var11;
							var14.field304[var15] -= var12;
						}

						var14.field256 -= var11 * 128;
						var14.field257 -= var12 * 128;
					}
				}

				for (int var16 = 0; var16 < field955; var16++) {
					class25 var17 = field957[var16];
					if (var17 != null) {
						for (int var18 = 0; var18 < 10; var18++) {
							var17.field303[var18] -= var11;
							var17.field304[var18] -= var12;
						}

						var17.field256 -= var11 * 128;
						var17.field257 -= var12 * 128;
					}
				}

				byte var19 = 0;
				byte var20 = 104;
				byte var21 = 1;
				if (var11 < 0) {
					var19 = 103;
					var20 = -1;
					var21 = -1;
				}

				byte var22 = 0;
				byte var23 = 104;
				byte var24 = 1;
				if (var12 < 0) {
					var22 = 103;
					var23 = -1;
					var24 = -1;
				}

				for (int var25 = var19; var25 != var20; var25 += var21) {
					for (int var26 = var22; var26 != var23; var26 += var24) {
						int var27 = var11 + var25;
						int var28 = var12 + var26;
						for (int var29 = 0; var29 < 4; var29++) {
							if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
								field1019[var29][var25][var26] = field1019[var29][var27][var28];
							} else {
								field1019[var29][var25][var26] = null;
							}
						}
					}
				}

				class37 var30 = (class37) field921.method203();
				while (var30 != null) {
					var30.field538 -= var11;
					var30.field539 -= var12;
					if (var30.field538 < 0 || var30.field539 < 0 || var30.field538 >= 104 || var30.field539 >= 104) {
						var30.method89();
					}

					var30 = (class37) field921.method205();
				}
			} else if (field936 == 217) {
				field965 = field930.method185();
			} else if (field936 == 248) {
				int var31 = field930.method187();
				int var32 = field930.method187();
				int var33 = var32 >> 10 & 0x1F;
				int var34 = var32 >> 5 & 0x1F;
				int var35 = var32 & 0x1F;
				class56.field760[var31].field799 = (var35 << 3) + (var33 << 19) + (var34 << 11);
			} else if (field936 == 98) {
				field876 = true;
				int var36 = field930.method185();
				int var37 = field930.method190();
				int var38 = field930.method185();
				field867[var36] = var37;
				field1015[var36] = var38;
				field1003[var36] = 1;
				for (int var39 = 0; var39 < 98; var39++) {
					if (var37 >= field1033[var39]) {
						field1003[var36] = var39 + 2;
					}
				}
			} else if (field936 == 5) {
				for (int var40 = 0; var40 < field957.length; var40++) {
					if (field957[var40] != null) {
						field957[var40].field282 = -1;
					}
				}

				for (int var41 = 0; var41 < field1141.length; var41++) {
					if (field1141[var41] != null) {
						field1141[var41].field282 = -1;
					}
				}
			} else if (field936 == 47) {
				method365(field935, field930);

				if (field878 == 1) {
					field878 = 2;
					class3.field26 = field1069;
					method351();
				}

				if (field893 && field878 == 2 && class3.field26 != field1069) {
					field1007.method210();
					field882.method168(151, 257, 0, "Loading - please wait.");
					field882.method168(150, 256, 0xFFFFFF, "Loading - please wait.");
					field1007.method211(field8, 8, 11);
					class3.field26 = field1069;
					method351();
				}

				if (field1079 != field1069 && field878 == 2) {
					field1079 = field1069;
					method352(field1069);
				}
			} else if (field936 == 234) {
				int var42 = field930.method187();
				int var43 = field930.method185();
				field1064[var43] = var42;
				field876 = true;
			} else if (field936 == 156) {
				String var44 = field930.method192();
				if (var44.endsWith(":tradereq:")) {
					String var45 = var44.substring(0, var44.indexOf(":"));
					long var46 = class47.method226(var45);
					boolean var48 = false;
					for (int var49 = 0; var49 < field1034; var49++) {
						if (field1043[var49] == var46) {
							var48 = true;
							break;
						}
					}

					if (!var48) {
						method391(4, var45, "wishes to trade with you.");
					}
				} else {
					method391(0, "", var44);
				}
			} else if (field936 == 220) {
				field1016 = field930.method185();
				field984 = field930.method185();
				field963 = field930.method185();
				field1101 = true;
				field979 = true;
			} else if (field936 == 149) {
				int var50 = field930.method187();
				int var51 = field930.method187();
				class56.field760[var50].field806 = var51;
			} else if (field936 == 95) {
				field947 = field930.method185();
				field948 = field930.method185();
			} else if (field936 == 235) {
				field876 = true;
				int var52 = field930.method187();
				byte var53 = field930.method186();
				if (field1144[var52] != var53) {
					field1144[var52] = var53;
					method385(var52);
				}
			} else if (field936 == 123) {
				int var54 = field930.method187();
				class56.field760[var54].field804 = field1010.method97();
			} else if (field936 == 44) {
				int var55 = field930.method185();
				int var56 = field930.method185();
				int var57 = -1;
				for (int var58 = 0; var58 < field897.length; var58++) {
					if ((var55 << 8) + var56 == field897[var58]) {
						var57 = var58;
					}
				}

				if (var57 != -1) {
					signlink.cachesave("l" + var55 + "_" + var56, field1011[var57]);
					field878 = 1;
				}
			} else if (field936 == 171) {
				int var59 = field930.method187();
				method383(var59);

				if (field927 != -1) {
					field927 = -1;
					field876 = true;
					field950 = true;
				}

				if (field1124 != -1) {
					field1124 = -1;
					field979 = true;
				}

				if (field929) {
					field929 = false;
					field979 = true;
				}

				field931 = var59;
				field903 = false;
			} else if (field936 == 197) {
				int var60 = field930.method185();
				int var61 = field930.method185();
				int var62 = field930.method187();
				int var63 = field930.method187();
				int var64 = -1;
				for (int var65 = 0; var65 < field897.length; var65++) {
					if ((var60 << 8) + var61 == field897[var65]) {
						var64 = var65;
					}
				}

				if (var64 != -1) {
					if (field983[var64] == null || field983[var64].length != var63) {
						field983[var64] = new byte[var63];
					}

					field930.method194(var62, field935 - 6, field983[var64]);
				}
			} else if (field936 == 181) {
				int var66 = field930.method187();
				int var67 = field930.method187();
				class50 var68 = class50.method243(var67);
				class56.field760[var66].field804 = var68.method246();
			} else if (field936 == 68) {
				field876 = true;
				int var69 = field930.method187();
				class56 var70 = class56.field760[var69];
				while (field930.field525 < field935) {
					int var71 = field930.method185();
					int var72 = field930.method187();
					int var73 = field930.method185();
					if (var73 == 255) {
						var73 = field930.method190();
					}

					if (var71 >= 0 && var71 < var70.field761.length) {
						var70.field761[var71] = var72;
						var70.field762[var71] = var73;
					}
				}
			} else if (field936 == 153 || field936 == 90 || field936 == 59 || field936 == 60 || field936 == 250 || field936 == 127 || field936 == 175 || field936 == 35 || field936 == 22) {
				method363(field930, field936);
			} else if (field936 == 61) {
				int var74 = field930.method187();
				boolean var75 = field930.method185() == 1;
				class56.field760[var74].field778 = var75;
			} else if (field936 == 80) {
				if (field927 != -1) {
					field927 = -1;
					field876 = true;
					field950 = true;
				}

				if (field1124 != -1) {
					field1124 = -1;
					field979 = true;
				}

				if (field929) {
					field929 = false;
					field979 = true;
				}

				field931 = -1;
				field903 = false;
			} else if (field936 == 225) {
				int var76 = field930.method185();
				int var77 = field930.method185();
				int var78 = field930.method187();
				int var79 = field930.method187();
				int var80 = -1;
				for (int var81 = 0; var81 < field897.length; var81++) {
					if ((var76 << 8) + var77 == field897[var81]) {
						var80 = var81;
					}
				}

				if (var80 != -1) {
					if (field1011[var80] == null || field1011[var80].length != var79) {
						field1011[var80] = new byte[var79];
					}

					field930.method194(var78, field935 - 6, field1011[var80]);
				}
			} else if (field936 == 51) {
				int var82 = field930.method185();
				int var83 = field930.method185();
				int var84 = -1;
				for (int var85 = 0; var85 < field897.length; var85++) {
					if ((var82 << 8) + var83 == field897[var85]) {
						var84 = var85;
					}
				}

				if (var84 != -1) {
					signlink.cachesave("m" + var82 + "_" + var83, field983[var84]);
					field878 = 1;
				}
			} else if (field936 == 100) {
				method366(field930, field935);
			} else if (field936 == 210) {
				int var86 = field930.method187();
				class56 var87 = class56.field760[var86];
				for (int var88 = 0; var88 < var87.field761.length; var88++) {
					var87.field761[var88] = -1;
					var87.field761[var88] = 0;
				}
			} else if (field936 == 42) {
				int var89 = field930.method187();
				int var90 = field930.method187();
				class56.field760[var89].field804 = new class30(var90);
			} else if (field936 == 254) {
				field934 = field930.method185();
				field876 = true;
				field950 = true;
			} else if (field936 == 114) {
				long var91 = field930.method191();
				int var93 = field930.method185();
				String var94 = class47.method230(class47.method227(var91));
				for (int var95 = 0; var95 < field1053; var95++) {
					if (var94.equals(field1063[var95])) {
						if (field1145[var95] != var93) {
							field1145[var95] = var93;
							field876 = true;

							if (var93 > 0) {
								method391(5, "", var94 + " has logged in.");
							}

							if (var93 == 0) {
								method391(5, "", var94 + " has logged out.");
							}
						}

						var94 = null;
						break;
					}
				}

				if (var94 != null && field1053 < 100) {
					field1063[field1053] = var94;
					field1145[field1053] = var93;
					field1053++;
					field876 = true;
				}

				boolean var96 = false;
				while (!var96) {
					var96 = true;
					for (int var97 = 0; var97 < field1053 - 1; var97++) {
						if (field1145[var97] != field1062 && field1145[var97 + 1] == field1062 || field1145[var97] == 0 && field1145[var97 + 1] != 0) {
							int var98 = field1145[var97];
							field1145[var97] = field1145[var97 + 1];
							field1145[var97 + 1] = var98;
							String var99 = field1063[var97];
							field1063[var97] = field1063[var97 + 1];
							field1063[var97 + 1] = var99;
							field876 = true;
							var96 = false;
						}
					}
				}
			} else if (field936 == 159) {
				String var100 = field930.method192();
				if (!var100.equals(field1072)) {
					field1072 = var100;

					if (field978) {
						signlink.midi = var100;
					}
				}
			} else if (field936 == 119) {
				field876 = true;
				int var101 = field930.method187();
				int var102 = field930.method190();
				if (field1144[var101] != var102) {
					field1144[var101] = var102;
					method385(var101);
				}
			} else if (field936 == 138) {
				int var103 = field930.method187();
				int var104 = field930.method187();

				if (field1124 != -1) {
					field1124 = -1;
					field979 = true;
				}

				if (field929) {
					field929 = false;
					field979 = true;
				}

				field931 = var103;
				field927 = var104;
				field876 = true;
				field950 = true;
				field903 = false;
			} else if (field936 == 48) {
				field947 = field930.method185();
				field948 = field930.method185();

				while (field930.field525 < field935) {
					int var105 = field930.method185();
					method363(field930, var105);
				}
			} else if (field936 == 27) {
				field922 = field930.method187();
			} else if (field936 == 85) {
				if (field978) {
					signlink.jingle = field930.method192();
					signlink.jinglelen = field930.method187();
				}
			} else if (field936 == 227) {
				field876 = true;
				int var106 = field930.method187();
				class56 var107 = class56.field760[var106];
				int var108 = field930.method185();
				for (int var109 = 0; var109 < var108; var109++) {
					var107.field761[var109] = field930.method187();
					int var110 = field930.method185();
					if (var110 == 255) {
						var110 = field930.method190();
					}

					var107.field762[var109] = var110;
				}

				for (int var111 = var108; var111 < var107.field761.length; var111++) {
					var107.field761[var111] = 0;
					var107.field762[var111] = 0;
				}
			} else if (field936 == 188) {
				field947 = field930.method185();
				field948 = field930.method185();
				for (int var112 = field947; var112 < field947 + 8; var112++) {
					for (int var113 = field948; var113 < field948 + 8; var113++) {
						if (field1019[field1069][var112][var113] != null) {
							field1019[field1069][var112][var113] = null;
							method364(var112, var113);
						}
					}
				}

				class37 var114 = (class37) field921.method203();
				while (var114 != null) {
					if (var114.field538 >= field947 && var114.field538 < field947 + 8 && var114.field539 >= field948 && var114.field539 < field948 + 8 && field1069 == var114.field536) {
						method362(var114.field536, var114.field545, var114.field539, var114.field538, var114.field537, var114.field544, var114.field543);
						var114.method89();
					}

					var114 = (class37) field921.method205();
				}
			} else if (field936 == 9) {
				int var115 = field930.method187();
				String var116 = field930.method192();
				class56.field760[var115].field797 = var116;
			} else if (field936 == 126) {
				method342();
				return false;
			} else if (field936 == 229) {
				long var117 = field930.method191();
				int var119 = field930.method190();
				boolean var120 = false;
				for (int var121 = 0; var121 < 100; var121++) {
					if (field986[var121] == var119) {
						var120 = true;
						break;
					}
				}

				for (int var122 = 0; var122 < field1034; var122++) {
					if (field1043[var122] == var117) {
						var120 = true;
						break;
					}
				}

				if (!var120) {
					field986[field886] = var119;
					field886 = (field886 + 1) % 100;
					String var123 = class48.method233(field930, field935 - 12);
					var123 = class61.method296(var123);
					method391(3, class47.method230(class47.method227(var117)), var123);
				}
			} else if (field936 == 6) {
				field1034 = field935 / 8;
				for (int var124 = 0; var124 < field1034; var124++) {
					field1043[var124] = field930.method191();
				}
			} else if (field936 == 53) {
				field953 = field930.method187() * 30;
			} else if (field936 == 116) {
				int var125 = field930.method187();
				method383(var125);

				if (field927 != -1) {
					field927 = -1;
					field876 = true;
					field950 = true;
				}

				field1124 = var125;
				field979 = true;
				field931 = -1;
				field903 = false;
			} else if (field936 == 107) {
				int var126 = field930.method187();
				int var127 = field930.method187();
				int var128 = field930.method187();
				class51 var129 = class51.method249(var127);
				class56.field760[var126].field804 = var129.method252();
				class56.field760[var126].field809 = var129.field711;
				class56.field760[var126].field810 = var129.field712;
				class56.field760[var126].field808 = var129.field710 * 100 / var128;
			} else if (field936 == 75) {
				field863 = false;
				field929 = true;
				field1032 = "";
				field979 = true;
			} else if (field936 == 124) {
				int var130 = field930.method187();
				method383(var130);

				if (field1124 != -1) {
					field1124 = -1;
					field979 = true;
				}

				if (field929) {
					field929 = false;
					field979 = true;
				}

				field927 = var130;
				field876 = true;
				field950 = true;
				field931 = -1;
				field903 = false;
			}

			field936 = -1;
		} catch (IOException var132) {
			method343();
		} catch (Exception var133) {
			method342();
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIBIIII)V")
	public final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (!field893 || field1069 == arg0) {
			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field1020.method59(arg0, arg3, arg2);
			}

			if (arg4 == 1) {
				var8 = field1020.method60(arg0, arg2, arg3);
			}

			if (arg4 == 2) {
				var8 = field1020.method61(arg0, arg3, arg2);
			}

			if (arg4 == 3) {
				var8 = field1020.method62(arg0, arg3, arg2);
			}

			if (var8 != 0) {
				int var12 = field1020.method63(arg0, arg3, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field1020.method54(arg0, arg3, arg2);
					class49 var16 = class49.method237(var13);
					if (var16.field649) {
						field868[arg0].method261(var16.field650, var15, arg3, var14, arg2);
					}
				}

				if (arg4 == 1) {
					field1020.method55(arg0, arg3, arg2);
				}

				if (arg4 == 2) {
					field1020.method56(arg0, arg2, arg3);
					class49 var17 = class49.method237(var13);
					if (var17.field649) {
						field868[arg0].method262(arg3, var17.field650, var17.field647, var17.field648, var15, arg2);
					}
				}

				if (arg4 == 3) {
					field1020.method57(arg0, arg2, arg3);
					class49 var18 = class49.method237(var13);
					if (var18.field649 && var18.field651) {
						field868[arg0].method264(arg2, arg3);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field1110[1][arg3][arg2] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				class3.method27(var19, field1071, arg2, arg0, arg5, field868[arg0], field975, arg6, field1020, arg3, arg1);
			}
		}
	}

	@ObfuscatedName("client.a(ZLjb;I)V")
	public final void method363(class36 arg0, int arg1) {
		if (arg1 == 22 || arg1 == 35) {
			int var3 = arg0.method185();
			int var4 = (var3 >> 4 & 0x7) + field947;
			int var5 = (var3 & 0x7) + field948;
			int var6 = arg0.method185();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field987[var7];
			int var10;
			if (arg1 == 35) {
				var10 = -1;
			} else {
				var10 = arg0.method187();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				class37 var11 = null;
				for (class37 var12 = (class37) field921.method203(); var12 != null; var12 = (class37) field921.method205()) {
					if (field1069 == var12.field536 && var12.field538 == var4 && var12.field539 == var5 && var12.field537 == var9) {
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
						var13 = field1020.method59(field1069, var4, var5);
					}

					if (var9 == 1) {
						var13 = field1020.method60(field1069, var5, var4);
					}

					if (var9 == 2) {
						var13 = field1020.method61(field1069, var4, var5);
					}

					if (var9 == 3) {
						var13 = field1020.method62(field1069, var4, var5);
					}

					if (var13 != 0) {
						int var17 = field1020.method63(field1069, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new class37();
					var11.field536 = field1069;
					var11.field537 = var9;
					var11.field538 = var4;
					var11.field539 = var5;
					var11.field543 = var14;
					var11.field545 = var15;
					var11.field544 = var16;
					field921.method201(var11);
				}

				var11.field540 = var10;
				var11.field542 = var7;
				var11.field541 = var8;
				method362(field1069, var7, var5, var4, var9, var8, var10);
			}
		} else if (arg1 == 175) {
			int var18 = arg0.method185();
			int var19 = (var18 >> 4 & 0x7) + field947;
			int var20 = (var18 & 0x7) + field948;
			int var21 = arg0.method185();
			int var22 = var21 >> 2;
			int var23 = field987[var22];
			int var24 = arg0.method187();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 1) {
					var25 = field1020.method60(field1069, var20, var19);
				}

				if (var23 == 2) {
					var25 = field1020.method61(field1069, var19, var20);
				}

				if (var25 != 0) {
					class39 var26 = new class39(var23, field1069, var25 >> 14 & 0x7FFF, class58.field823[var24], var19, var20);
					field1071.method201(var26);
				}
			}
		} else if (arg1 == 127) {
			int var27 = arg0.method185();
			int var28 = (var27 >> 4 & 0x7) + field947;
			int var29 = (var27 & 0x7) + field948;
			int var30 = arg0.method187();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				class21 var31 = new class21();
				var31.field255 = var30;

				if (field1019[field1069][var28][var29] == null) {
					field1019[field1069][var28][var29] = new class40();
				}

				field1019[field1069][var28][var29].method201(var31);
				method364(var28, var29);
			}
		} else if (arg1 == 250) {
			int var32 = arg0.method185();
			int var33 = (var32 >> 4 & 0x7) + field947;
			int var34 = (var32 & 0x7) + field948;
			int var35 = arg0.method187();
			if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
				class40 var36 = field1019[field1069][var33][var34];
				if (var36 != null) {
					for (class21 var37 = (class21) var36.method203(); var37 != null; var37 = (class21) var36.method205()) {
						if ((var35 & 0x7FFF) == var37.field255) {
							var37.method89();
							break;
						}
					}

					if (var36.method203() == null) {
						field1019[field1069][var33][var34] = null;
					}

					method364(var33, var34);
				}
			}
		} else if (arg1 == 60) {
			int var38 = arg0.method185();
			int var39 = (var38 >> 4 & 0x7) + field947;
			int var40 = (var38 & 0x7) + field948;
			int var41 = var39 + arg0.method186();
			int var42 = var40 + arg0.method186();
			int var43 = arg0.method188();
			int var44 = arg0.method187();
			int var45 = arg0.method185();
			int var46 = arg0.method185();
			int var47 = arg0.method187();
			int var48 = arg0.method187();
			int var49 = arg0.method185();
			int var50 = arg0.method185();
			if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
				var39 = var39 * 128 + 64;
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				class26 var51 = new class26(field1069, var50, var39, var49, method349(var39, var40, field1069) - var45, var44, field877 + var47, var46, var40, field877 + var48, var43);
				var51.method99(var42, method349(var41, var42, field1069) - var46, var41, field877 + var47);
				field1104.method201(var51);
			}
		} else if (arg1 == 59) {
			int var52 = arg0.method185();
			int var53 = (var52 >> 4 & 0x7) + field947;
			int var54 = (var52 & 0x7) + field948;
			int var55 = arg0.method187();
			int var56 = arg0.method185();
			int var57 = arg0.method187();
			if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
				var53 = var53 * 128 + 64;
				var54 = var54 * 128 + 64;
				class27 var58 = new class27(method349(var53, var54, field1069) - var56, var57, var55, field1069, var53, var54, field877);
				field900.method201(var58);
			}
		} else if (arg1 == 90) {
			int var59 = arg0.method185();
			int var60 = (var59 >> 4 & 0x7) + field947;
			int var61 = (var59 & 0x7) + field948;
			int var62 = arg0.method187();
			int var63 = arg0.method187();
			if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && field922 != var63) {
				class21 var64 = new class21();
				var64.field255 = var62;

				if (field1019[field1069][var60][var61] == null) {
					field1019[field1069][var60][var61] = new class40();
				}

				field1019[field1069][var60][var61].method201(var64);
				method364(var60, var61);
			}
		} else if (arg1 == 153) {
			int var65 = arg0.method185();
			int var66 = (var65 >> 4 & 0x7) + field947;
			int var67 = (var65 & 0x7) + field948;
			int var68 = arg0.method185();
			int var69 = var68 >> 2;
			int var70 = var68 & 0x3;
			int var71 = field987[var69];
			int var72 = arg0.method187();
			int var73 = arg0.method187();
			int var74 = arg0.method187();
			int var75 = arg0.method187();
			byte var76 = arg0.method186();
			byte var77 = arg0.method186();
			byte var78 = arg0.method186();
			byte var79 = arg0.method186();
			class25 var80;
			if (field922 == var75) {
				var80 = field1010;
			} else {
				var80 = field957[var75];
			}

			if (var80 != null) {
				class38 var81 = new class38(var69, field877 + var73, field1069, var67, var70, -1, var71, var66);
				field1077.method201(var81);
				class38 var82 = new class38(var69, field877 + var74, field1069, var67, var70, var72, var71, var66);
				field1077.method201(var82);
				int var83 = field975[field1069][var66][var67];
				int var84 = field975[field1069][var66 + 1][var67];
				int var85 = field975[field1069][var66 + 1][var67 + 1];
				int var86 = field975[field1069][var66][var67 + 1];
				class49 var87 = class49.method237(var72);
				var80.field316 = field877 + var73;
				var80.field317 = field877 + var74;
				var80.field321 = var87.method240(var69, var70, var83, var84, var85, var86, -1);
				int var88 = var87.field647;
				int var89 = var87.field648;
				if (var70 == 1 || var70 == 3) {
					var88 = var87.field648;
					var89 = var87.field647;
				}

				var80.field318 = var66 * 128 + var88 * 64;
				var80.field320 = var67 * 128 + var89 * 64;
				var80.field319 = method349(var80.field318, var80.field320, field1069);

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

				var80.field322 = var66 + var76;
				var80.field324 = var66 + var78;
				var80.field323 = var67 + var77;
				var80.field325 = var67 + var79;
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method364(int arg0, int arg1) {
		class40 var3 = field1019[field1069][arg0][arg1];
		if (var3 == null) {
			field1020.method58(field1069, arg0, arg1);
		} else {
			int var4 = -99999999;
			class51 var5 = null;
			for (class21 var6 = (class21) var3.method203(); var6 != null; var6 = (class21) var3.method205()) {
				class51 var7 = class51.method249(var6.field255);
				if (var7.field718 > var4) {
					var4 = var7.field718;
					var5 = var7;
				}
			}

			int var8 = (arg1 << 7) + arg0 + 0x60000000;
			field1020.method43(method349(arg0 * 128 + 64, arg1 * 128 + 64, field1069), field1069, var8, var5.method252(), arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IBLjb;)V")
	public final void method365(int arg0, class36 arg1) {
		int var3 = 0;
		arg1.method195();
		field1069 = arg1.method196(2);
		int var4 = arg1.method196(7);
		int var5 = arg1.method196(7);
		int var6 = arg1.method196(1);
		if (var6 == 1) {
			field960[var3++] = field956;
		}

		field1010.method91(var4, var5);
		field1044 = 0;
		int var7 = arg1.method196(8);
		if (var7 < field1142) {
			for (int var8 = var7; var8 < field958; var8++) {
				field1045[field1044++] = field959[var8];
				field957[field959[var8]].field299 = true;
			}
		}

		field958 = 0;
		for (int var9 = 0; var9 < var7; var9++) {
			int var10 = field959[var9];
			class25 var11 = field957[var10];
			int var12 = arg1.method196(1);
			if (var12 == 0) {
				field959[field958++] = var10;
			} else {
				int var13 = arg1.method196(2);
				if (var13 == 3) {
					field1045[field1044++] = var10;
					var11.field299 = true;
				} else {
					field959[field958++] = var10;

					if (var13 == 0) {
						field960[var3++] = var10;
					} else {
						if (var13 == 2) {
							field960[var3++] = var10;
						}

						int var14 = arg1.method196(3);
						if (var14 == 0) {
							var11.method92(1, -1);
						}

						if (var14 == 1) {
							var11.method92(1, 0);
						}

						if (var14 == 2) {
							var11.method92(1, 1);
						}

						if (var14 == 3) {
							var11.method92(0, -1);
						}

						if (var14 == 4) {
							var11.method92(0, 1);
						}

						if (var14 == 5) {
							var11.method92(-1, -1);
						}

						if (var14 == 6) {
							var11.method92(-1, 0);
						}

						if (var14 == 7) {
							var11.method92(-1, 1);
						}
					}
				}
			}
		}

		while (true) {
			int var15 = arg1.method196(11);
			if (var15 == 2047 || arg1.field526 + 10 >= arg0 * 8) {
				break;
			}

			if (field957[var15] == null) {
				field957[var15] = new class25();
				if (field961[var15] != null) {
					field957[var15].method95(field961[var15]);
				}
			}

			field959[field958++] = var15;
			class25 var16 = field957[var15];
			var16.field299 = false;
			int var17 = arg1.method196(5);
			if (var17 > 15) {
				var17 -= 32;
			}

			int var18 = arg1.method196(5);
			if (var18 > 15) {
				var18 -= 32;
			}

			var16.method91(field1010.field303[0] + var17, field1010.field304[0] + var18);
			field960[var3++] = var15;
		}

		arg1.method197();

		for (int var19 = 0; var19 < var3; var19++) {
			int var20 = field960[var19];
			class25 var21 = field957[var20];
			int var22 = arg1.method185();
			if ((var22 & 0x80) == 0x80) {
				var22 += arg1.method185() << 8;
			}

			if ((var22 & 0x1) == 1) {
				int var23 = arg1.method185();
				byte[] var24 = new byte[var23];
				class36 var25 = new class36(var24);
				arg1.method194(0, var23, var24);
				field961[var20] = var25;
				var21.method95(var25);
			}

			if ((var22 & 0x2) == 2) {
				int var26 = arg1.method187();
				if (var26 == 0xFFFF) {
					var26 = -1;
				}

				if (var21.field282 == var26) {
					var21.field286 = 0;
				}

				int var27 = arg1.method185();
				if (var26 == -1 || var21.field282 == -1 || class58.field823[var26].field831 > class58.field823[var21.field282].field831) {
					var21.field282 = var26;
					var21.field283 = 0;
					var21.field284 = 0;
					var21.field285 = var27;
					var21.field286 = 0;
				}
			}

			if ((var22 & 0x4) == 4) {
				var21.field276 = arg1.method187();
				if (var21.field276 == 0xFFFF) {
					var21.field276 = -1;
				}
			}

			if ((var22 & 0x8) == 8) {
				var21.field267 = arg1.method192();
				var21.field269 = 0;
				var21.field270 = 0;
				var21.field268 = 150;
				method391(2, var21.field307, var21.field267);
			}

			if ((var22 & 0x10) == 0x10) {
				var21.field271 = arg1.method185();
				var21.field272 = arg1.method185();
				var21.field273 = field877 + 400;
				var21.field274 = arg1.method185();
				var21.field275 = arg1.method185();
			}

			if ((var22 & 0x20) == 0x20) {
				var21.field277 = arg1.method187();
				var21.field278 = arg1.method187();
			}

			if ((var22 & 0x40) == 0x40) {
				int var28 = arg1.method187();
				int var29 = arg1.method185();
				long var30 = class47.method226(var21.field307);
				boolean var32 = false;
				for (int var33 = 0; var33 < field1034; var33++) {
					if (field1043[var33] == var30) {
						var32 = true;
						break;
					}
				}

				if (!var32) {
					String var34 = class48.method233(arg1, var29);
					var34 = class61.method296(var34);
					var21.field267 = var34;
					var21.field269 = var28 >> 8;
					var21.field270 = var28 & 0xFF;
					var21.field268 = 150;
					method391(2, var21.field307, var34);
				}
			}

			if ((var22 & 0x100) == 0x100) {
				var21.field287 = arg1.method187();
				int var35 = arg1.method190();
				var21.field291 = var35 >> 16;
				var21.field290 = (var35 & 0xFFFF) + field877;
				var21.field288 = 0;
				var21.field289 = 0;

				if (var21.field290 > field877) {
					var21.field288 = -1;
				}

				if (var21.field287 == 0xFFFF) {
					var21.field287 = -1;
				}
			}

			if ((var22 & 0x200) == 0x200) {
				var21.field292 = arg1.method185();
				var21.field294 = arg1.method185();
				var21.field293 = arg1.method185();
				var21.field295 = arg1.method185();
				var21.field296 = arg1.method187() + field877;
				var21.field297 = arg1.method187() + field877;
				var21.field298 = arg1.method185();
				var21.field302 = 0;
				var21.field303[0] = var21.field293;
				var21.field304[0] = var21.field295;
			}
		}

		for (int var36 = 0; var36 < field1044; var36++) {
			int var37 = field1045[var36];
			if (field957[var37].field299) {
				method356(var37);
			}
		}
	}

	@ObfuscatedName("client.a(Ljb;ZI)V")
	public final void method366(class36 arg0, int arg1) {
		field1044 = 0;
		arg0.method195();
		int var3 = arg0.method196(8);
		if (var3 < field1142) {
			for (int var4 = var3; var4 < field1142; var4++) {
				field1045[field1044++] = field1143[var4];
				field1141[field1143[var4]].field299 = true;
			}
		}

		int var5 = 0;
		field1142 = 0;
		for (int var6 = 0; var6 < var3; var6++) {
			int var7 = field1143[var6];
			class24 var8 = field1141[var7];
			int var9 = arg0.method196(1);
			if (var9 == 0) {
				field1143[field1142++] = var7;
			} else {
				int var10 = arg0.method196(2);
				if (var10 == 3) {
					field1045[field1044++] = var7;
					var8.field299 = true;
				} else {
					field1143[field1142++] = var7;

					if (var10 == 0) {
						field960[var5++] = var7;
					} else {
						if (var10 == 2) {
							field960[var5++] = var7;
						}

						int var11 = arg0.method196(3);
						if (var11 == 0) {
							var8.method92(1, -1);
						}

						if (var11 == 1) {
							var8.method92(1, 0);
						}

						if (var11 == 2) {
							var8.method92(1, 1);
						}

						if (var11 == 3) {
							var8.method92(0, -1);
						}

						if (var11 == 4) {
							var8.method92(0, 1);
						}

						if (var11 == 5) {
							var8.method92(-1, -1);
						}

						if (var11 == 6) {
							var8.method92(-1, 0);
						}

						if (var11 == 7) {
							var8.method92(-1, 1);
						}
					}
				}
			}
		}

		while (true) {
			int var12 = arg0.method196(13);
			if (var12 == 8191 || arg0.field526 + 21 >= arg1 * 8) {
				break;
			}

			field1143[field1142++] = var12;

			if (field1141[var12] == null) {
				field1141[var12] = new class24();
			}

			class24 var13 = field1141[var12];
			var13.field299 = false;
			var13.field306 = class50.method243(arg0.method196(11));
			var13.field260 = var13.field306.field679;
			var13.field261 = var13.field306.field683;
			var13.field262 = var13.field306.field684;
			var13.field263 = var13.field306.field685;
			var13.field264 = var13.field306.field686;
			var13.field265 = var13.field306.field682;
			int var14 = arg0.method196(5);
			if (var14 > 15) {
				var14 -= 32;
			}

			int var15 = arg0.method196(5);
			if (var15 > 15) {
				var15 -= 32;
			}

			var13.method91(field1010.field303[0] + var14, field1010.field304[0] + var15);
			int var16 = arg0.method196(1);
			if (var16 == 1) {
				field960[var5++] = var12;
			}
		}

		arg0.method197();

		for (int var17 = 0; var17 < var5; var17++) {
			int var18 = field960[var17];
			class24 var19 = field1141[var18];
			int var20 = arg0.method185();
			if ((var20 & 0x2) == 2) {
				int var21 = arg0.method187();
				if (var21 == 0xFFFF) {
					var21 = -1;
				}

				if (var19.field282 == var21) {
					var19.field286 = 0;
				}

				int var22 = arg0.method185();
				if (var21 == -1 || var19.field282 == -1 || class58.field823[var21].field831 > class58.field823[var19.field282].field831) {
					var19.field282 = var21;
					var19.field283 = 0;
					var19.field284 = 0;
					var19.field285 = var22;
					var19.field286 = 0;
				}
			}

			if ((var20 & 0x4) == 4) {
				var19.field276 = arg0.method187();
				if (var19.field276 == 0xFFFF) {
					var19.field276 = -1;
				}
			}

			if ((var20 & 0x8) == 8) {
				var19.field267 = arg0.method192();
				var19.field268 = 100;
			}

			if ((var20 & 0x10) == 0x10) {
				var19.field271 = arg0.method185();
				var19.field272 = arg0.method185();
				var19.field273 = field877 + 400;
				var19.field274 = arg0.method185();
				var19.field275 = arg0.method185();
			}

			if ((var20 & 0x20) == 0x20) {
				var19.field306 = class50.method243(arg0.method187());
				var19.field261 = var19.field306.field683;
				var19.field262 = var19.field306.field684;
				var19.field263 = var19.field306.field685;
				var19.field264 = var19.field306.field686;
				var19.field265 = var19.field306.field682;
			}

			if ((var20 & 0x40) == 0x40) {
				var19.field287 = arg0.method187();
				int var23 = arg0.method190();
				var19.field291 = var23 >> 16;
				var19.field290 = (var23 & 0xFFFF) + field877;
				var19.field288 = 0;
				var19.field289 = 0;

				if (var19.field290 > field877) {
					var19.field288 = -1;
				}

				if (var19.field287 == 0xFFFF) {
					var19.field287 = -1;
				}
			}
		}

		for (int var24 = 0; var24 < field1044; var24++) {
			int var25 = field1045[var24];
			if (field1141[var25].field299) {
				method358(var25);
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method367() {
		if (field1040 >= 2 || field940 != 0 || field1058 != 0) {
			String var1;
			if (field940 == 1 && field1040 < 2) {
				var1 = "Use " + field944 + " with...";
			} else if (field1058 == 1 && field1040 < 2) {
				var1 = field1061 + "...";
			} else {
				var1 = field861[field1040 - 1];
			}

			if (field1040 > 2) {
				var1 = var1 + "@whi@ / " + (field1040 - 2) + " more options";
			}

			field883.method173(true, 4, 15, 0xFFFFFF, var1);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method368() {
		int var1 = field1027;
		int var2 = field1028;
		int var3 = field1029;
		int var4 = field1030;
		int var5 = 0x5D5447;
		class31.method131(var5, var3, var2, var4, var1);
		class31.method131(0, var3 - 2, var2 + 1, 16, var1 + 1);
		class31.method132(var3 - 2, var4 - 19, var1 + 1, var2 + 18, 0);
		field883.method171("Choose Option", var1 + 3, var2 + 14, var5);
		int var6 = field15;
		int var7 = field16;
		if (field1026 == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (field1026 == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		for (int var8 = 0; var8 < field1040; var8++) {
			int var9 = (field1040 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field883.method173(true, var1 + 3, var9, var10, field861[var8]);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method369() {
		int var1 = field17;
		if (field1058 == 1 && field18 >= 520 && field19 >= 165 && field18 <= 788 && field19 <= 230) {
			var1 = 0;
		}

		if (field1089) {
			if (var1 != 1) {
				int var2 = field15;
				int var3 = field16;
				if (field1026 == 0) {
					var2 -= 8;
					var3 -= 11;
				}

				if (field1026 == 1) {
					var2 -= 562;
					var3 -= 231;
				}

				if (var2 < field1027 - 10 || var2 > field1029 + field1027 + 10 || var3 < field1028 - 10 || var3 > field1030 + field1028 + 10) {
					field1089 = false;

					if (field1026 == 1) {
						field876 = true;
					}
				}
			}

			if (var1 == 1) {
				int var4 = field1027;
				int var5 = field1028;
				int var6 = field1029;
				int var7 = field18;
				int var8 = field19;
				if (field1026 == 0) {
					var7 -= 8;
					var8 -= 11;
				}

				if (field1026 == 1) {
					var7 -= 562;
					var8 -= 231;
				}

				int var9 = -1;
				for (int var10 = 0; var10 < field1040; var10++) {
					int var11 = (field1040 - var10 - 1) * 15 + var5 + 31;
					if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
						var9 = var10;
					}
				}

				if (var9 != -1) {
					method370(var9);
				}

				field1089 = false;

				if (field1026 == 1) {
					field876 = true;
					return;
				}
			}
		} else {
			if (var1 == 1 && field1037 == 1 && field1040 > 2) {
				var1 = 2;
			}

			if (var1 == 1 && field1040 > 0) {
				method370(field1040 - 1);
			}

			if (var1 == 2 && field1040 > 0) {
				int var12 = field883.method170("Choose Option");
				for (int var13 = 0; var13 < field1040; var13++) {
					int var14 = field883.method170(field861[var13]);
					if (var14 > var12) {
						var12 = var14;
					}
				}

				var12 += 8;
				int var15 = field1040 * 15 + 21;
				if (field18 > 8 && field19 > 11 && field18 < 520 && field19 < 345) {
					int var16 = field18 - var12 / 2 - 8;
					if (var12 + var16 > 512) {
						var16 = 512 - var12;
					}

					if (var16 < 0) {
						var16 = 0;
					}

					int var17 = field19 - 11;
					if (var15 + var17 > 334) {
						var17 = 334 - var15;
					}

					if (var17 < 0) {
						var17 = 0;
					}

					field1089 = true;
					field1026 = 0;
					field1027 = var16;
					field1028 = var17;
					field1029 = var12;
					field1030 = field1040 * 15 + 22;
				}

				if (field18 > 562 && field19 > 231 && field18 < 752 && field19 < 492) {
					int var18 = field18 - var12 / 2 - 562;
					if (var18 < 0) {
						var18 = 0;
					} else if (var12 + var18 > 190) {
						var18 = 190 - var12;
					}

					int var19 = field19 - 231;
					if (var19 < 0) {
						var19 = 0;
					} else if (var15 + var19 > 261) {
						var19 = 261 - var15;
					}

					field1089 = true;
					field1026 = 1;
					field1027 = var18;
					field1028 = var19;
					field1029 = var12;
					field1030 = field1040 * 15 + 22;
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method370(int arg0) {
		if (arg0 >= 0) {
			if (field929) {
				field929 = false;
				field979 = true;
			}

			int var2 = field988[arg0];
			int var3 = field989[arg0];
			int var4 = field990[arg0];
			int var5 = field991[arg0];
			if (var4 == 636) {
				class25 var6 = field957[var5];
				if (var6 != null) {
					method360(var6.field304[0], 0, false, 1, var6.field303[0], field1010.field303[0], 0, 1, 0, field1010.field304[0]);
					field1048 = field18;
					field1049 = field19;
					field1051 = 2;
					field1050 = 0;
					field920.method177(185);
					field920.method179(var5);
					field920.method179(field943);
					field920.method179(field941);
					field920.method179(field942);
				}
			}

			if (var4 == 1294) {
				int var7 = var5 >> 14 & 0x7FFF;
				class49 var8 = class49.method237(var7);
				String var9;
				if (var8.field644 == null) {
					var9 = "It's a " + var8.field643 + ".";
				} else {
					var9 = new String(var8.field644);
				}

				method391(0, "", var9);
			}

			if (var4 == 700) {
				field920.method177(101);
				field920.method179(var3);
				class56 var10 = class56.field760[var3];
				if (var10.field772 != null && var10.field772[0][0] == 5) {
					int var11 = var10.field772[0][1];
					if (field1144[var11] != var10.field774[0]) {
						field1144[var11] = var10.field774[0];
						method385(var11);
						field876 = true;
					}
				}
			}

			if (var4 == 54) {
				method359(var5, var2, var3, 249);
			}

			if (var4 == 806) {
				class24 var12 = field1141[var5];
				if (var12 != null) {
					method360(var12.field304[0], 0, false, 1, var12.field303[0], field1010.field303[0], 0, 1, 0, field1010.field304[0]);
					field1048 = field18;
					field1049 = field19;
					field1051 = 2;
					field1050 = 0;
					field920.method177(28);
					field920.method179(var5);
					field920.method179(field943);
					field920.method179(field941);
					field920.method179(field942);
				}
			}

			if (var4 == 243) {
				method359(var5, var2, var3, 10);
				field920.method179(field1059);
			}

			if (var4 == 17) {
				class56 var13 = class56.field760[var3];
				field1058 = 1;
				field1059 = var3;
				field1060 = var13.field813;
				field940 = 0;
				String var14 = var13.field811;
				if (var14.indexOf(" ") != -1) {
					var14 = var14.substring(0, var14.indexOf(" "));
				}

				String var15 = var13.field811;
				if (var15.indexOf(" ") != -1) {
					var15 = var15.substring(var15.indexOf(" ") + 1);
				}

				field1061 = var14 + " " + var13.field812 + " " + var15;

				if (field1060 == 16) {
					field876 = true;
					field934 = 3;
					field950 = true;
				}
			} else {
				if (var4 == 284) {
					if (field1089) {
						field1020.method71(var3 - 11, var2 - 8);
					} else {
						field1020.method71(field19 - 11, field18 - 8);
					}
				}

				if (var4 == 669) {
					field940 = 1;
					field941 = var2;
					field942 = var3;
					field943 = var5;
					field944 = class51.method249(var5).field706;
					field1058 = 0;
				} else {
					if (var4 == 146) {
						method359(var5, var2, var3, 65);
					}

					if (var4 == 237) {
						method359(var5, var2, var3, 205);
						field920.method179(field943);
						field920.method179(field941);
						field920.method179(field942);
					}

					if (var4 == 739) {
						field920.method177(101);
						field920.method179(var3);
						class56 var16 = class56.field760[var3];
						if (var16.field772 != null && var16.field772[0][0] == 5) {
							int var17 = var16.field772[0][1];
							field1144[var17] = 1 - field1144[var17];
							method385(var17);
							field876 = true;
						}
					}

					if (var4 == 710 || var4 == 301 || var4 == 328 || var4 == 498 || var4 == 74) {
						class24 var18 = field1141[var5];
						if (var18 != null) {
							method360(var18.field304[0], 0, false, 1, var18.field303[0], field1010.field303[0], 0, 1, 0, field1010.field304[0]);
							field1048 = field18;
							field1049 = field19;
							field1051 = 2;
							field1050 = 0;

							if (var4 == 328) {
								field920.method177(107);
							}

							if (var4 == 301) {
								field920.method177(152);
							}

							if (var4 == 498) {
								field920.method177(119);
							}

							if (var4 == 74) {
								field920.method177(8);
							}

							if (var4 == 710) {
								field920.method177(41);
							}

							field920.method179(var5);
						}
					}

					if (var4 == 1682 || var4 == 1930 || var4 == 1754 || var4 == 1484) {
						class25 var19 = field957[var5];
						if (var19 != null) {
							method360(var19.field304[0], 0, false, 1, var19.field303[0], field1010.field303[0], 0, 1, 0, field1010.field304[0]);
							field1048 = field18;
							field1049 = field19;
							field1051 = 2;
							field1050 = 0;

							if (var4 == 1930) {
								field920.method177(212);
							}

							if (var4 == 1682) {
								field920.method177(192);
							}

							if (var4 == 1484) {
								field920.method177(172);
							}

							if (var4 == 1754) {
								field920.method177(251);
							}

							field920.method179(var5);
						}
					}

					if (var4 == 462) {
						method359(var5, var2, var3, 233);
					}

					if (var4 == 1971 || var4 == 1258) {
						class51 var20 = class51.method249(var5);
						String var21;
						if (var20.field707 == null) {
							var21 = "It's a " + var20.field706 + ".";
						} else {
							var21 = new String(var20.field707);
						}

						method391(0, "", var21);
					}

					if (var4 == 730) {
						class25 var22 = field957[var5];
						if (var22 != null) {
							method360(var22.field304[0], 0, false, 1, var22.field303[0], field1010.field303[0], 0, 1, 0, field1010.field304[0]);
							field1048 = field18;
							field1049 = field19;
							field1051 = 2;
							field1050 = 0;
							field920.method177(252);
							field920.method179(var5);
							field920.method179(field1059);
						}
					}

					if (var4 == 917 || var4 == 14 || var4 == 401 || var4 == 514 || var4 == 164) {
						boolean var23 = method360(var3, 0, false, 0, var2, field1010.field303[0], 0, 0, 0, field1010.field304[0]);
						if (!var23) {
							method360(var3, 0, false, 1, var2, field1010.field303[0], 0, 1, 0, field1010.field304[0]);
						}

						field1048 = field18;
						field1049 = field19;
						field1051 = 2;
						field1050 = 0;

						if (var4 == 164) {
							field920.method177(140);
						}

						if (var4 == 514) {
							field920.method177(235);
						}

						if (var4 == 401) {
							field920.method177(113);
						}

						if (var4 == 14) {
							field920.method177(61);
						}

						if (var4 == 917) {
							field920.method177(186);
						}

						field920.method179(field1132 + var2);
						field920.method179(field1133 + var3);
						field920.method179(var5);
					}

					if (var4 == 677 || var4 == 522 || var4 == 249 || var4 == 247 || var4 == 296) {
						if (var4 == 296) {
							field920.method177(38);
						}

						if (var4 == 247) {
							field920.method177(155);
						}

						if (var4 == 249) {
							field920.method177(146);
						}

						if (var4 == 522) {
							field920.method177(240);
						}

						if (var4 == 677) {
							field920.method177(121);
						}

						field920.method179(var5);
						field920.method179(var2);
						field920.method179(var3);
						field1112 = 0;
						field1113 = var3;
						field1114 = var2;
						field1115 = 2;
						if (class56.field760[var3].field766 == field931) {
							field1115 = 1;
						}

						if (class56.field760[var3].field766 == field1124) {
							field1115 = 3;
						}
					}

					if (var4 == 883 && !field903) {
						field920.method177(167);
						field920.method179(var3);
						field903 = true;
					}

					if (var4 == 754) {
						method359(var5, var2, var3, 216);
					}

					if (var4 == 39) {
						field920.method177(168);
						field920.method179(var5);
						field920.method179(var2);
						field920.method179(var3);
						field920.method179(field943);
						field920.method179(field941);
						field920.method179(field942);
						field1112 = 0;
						field1113 = var3;
						field1114 = var2;
						field1115 = 2;
						if (class56.field760[var3].field766 == field931) {
							field1115 = 1;
						}

						if (class56.field760[var3].field766 == field1124) {
							field1115 = 3;
						}
					}

					if (var4 == 981) {
						method359(var5, var2, var3, 221);
					}

					if (var4 == 454) {
						field920.method177(213);

						if (field927 != -1) {
							field927 = -1;
							field876 = true;
							field903 = false;
							field950 = true;
						}

						if (field1124 != -1) {
							field1124 = -1;
							field979 = true;
							field903 = false;
						}

						field931 = -1;
					}

					if (var4 == 759) {
						class56 var25 = class56.field760[var3];
						boolean var26 = true;
						if (var25.field769 > 0) {
							var26 = method387(var25);
						}

						if (var26) {
							field920.method177(101);
							field920.method179(var3);
						}
					}

					if (var4 == 160) {
						boolean var27 = method360(var3, 0, false, 0, var2, field1010.field303[0], 0, 0, 0, field1010.field304[0]);
						if (!var27) {
							method360(var3, 0, false, 1, var2, field1010.field303[0], 0, 1, 0, field1010.field304[0]);
						}

						field1048 = field18;
						field1049 = field19;
						field1051 = 2;
						field1050 = 0;
						field920.method177(42);
						field920.method179(field1132 + var2);
						field920.method179(field1133 + var3);
						field920.method179(var5);
						field920.method179(field943);
						field920.method179(field941);
						field920.method179(field942);
					}

					if (var4 == 678 || var4 == 523 || var4 == 836 || var4 == 548 || var4 == 62) {
						if (var4 == 548) {
							field920.method177(21);
						}

						if (var4 == 523) {
							field920.method177(181);
						}

						if (var4 == 836) {
							field920.method177(145);
						}

						if (var4 == 678) {
							field920.method177(175);
						}

						if (var4 == 62) {
							field920.method177(47);
						}

						field920.method179(var5);
						field920.method179(var2);
						field920.method179(var3);
						field1112 = 0;
						field1113 = var3;
						field1114 = var2;
						field1115 = 2;
						if (class56.field760[var3].field766 == field931) {
							field1115 = 1;
						}

						if (class56.field760[var3].field766 == field1124) {
							field1115 = 3;
						}
					}

					if (var4 == 130) {
						class24 var29 = field1141[var5];
						if (var29 != null) {
							method360(var29.field304[0], 0, false, 1, var29.field303[0], field1010.field303[0], 0, 1, 0, field1010.field304[0]);
							field1048 = field18;
							field1049 = field19;
							field1051 = 2;
							field1050 = 0;
							field920.method177(189);
							field920.method179(var5);
							field920.method179(field1059);
						}
					}

					if (var4 == 1725) {
						class24 var30 = field1141[var5];
						if (var30 != null) {
							String var31;
							if (var30.field306.field678 == null) {
								var31 = "It's a " + var30.field306.field677 + ".";
							} else {
								var31 = new String(var30.field306.field678);
							}

							method391(0, "", var31);
						}
					}

					if (var4 == 449) {
						field920.method177(247);
						field920.method179(var5);
						field920.method179(var2);
						field920.method179(var3);
						field920.method179(field1059);
						field1112 = 0;
						field1113 = var3;
						field1114 = var2;
						field1115 = 2;
						if (class56.field760[var3].field766 == field931) {
							field1115 = 1;
						}

						if (class56.field760[var3].field766 == field1124) {
							field1115 = 3;
						}
					}

					if (var4 == 504) {
						boolean var32 = method360(var3, 0, false, 0, var2, field1010.field303[0], 0, 0, 0, field1010.field304[0]);
						if (!var32) {
							method360(var3, 0, false, 1, var2, field1010.field303[0], 0, 1, 0, field1010.field304[0]);
						}

						field1048 = field18;
						field1049 = field19;
						field1051 = 2;
						field1050 = 0;
						field920.method177(244);
						field920.method179(field1132 + var2);
						field920.method179(field1133 + var3);
						field920.method179(var5);
						field920.method179(field1059);
					}

					field940 = 0;
					field1058 = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method371() {
		field861[0] = "Cancel";
		field990[0] = 1264;
		field1040 = 1;

		if (field15 > 8 && field16 > 11 && field15 < 520 && field16 < 345) {
			if (field931 == -1) {
				method372();
			} else {
				method382(class56.field760[field931], 8, field15, 0, field16, 11);
			}
		}

		if (field926 != field1036) {
			field926 = field1036;
		}

		field1036 = 0;

		if (field15 > 562 && field16 > 231 && field15 < 752 && field16 < 492) {
			if (field927 != -1) {
				method382(class56.field760[field927], 562, field15, 0, field16, 231);
			} else if (field1064[field934] != -1) {
				method382(class56.field760[field1064[field934]], 562, field15, 0, field16, 231);
			}
		}

		if (field1039 != field1036) {
			field876 = true;
			field1039 = field1036;
		}

		field1036 = 0;

		if (field15 > 22 && field16 > 375 && field15 < 501 && field16 < 471 && field1124 != -1) {
			method382(class56.field760[field1124], 22, field15, 0, field16, 375);
		}

		if (field1124 != -1 && field879 != field1036) {
			field979 = true;
			field879 = field1036;
		}

		boolean var1 = false;
		while (!var1) {
			var1 = true;
			for (int var2 = 0; var2 < field1040 - 1; var2++) {
				if (field990[var2] < 1000 && field990[var2 + 1] > 1000) {
					String var3 = field861[var2];
					field861[var2] = field861[var2 + 1];
					field861[var2 + 1] = var3;
					int var4 = field990[var2];
					field990[var2] = field990[var2 + 1];
					field990[var2 + 1] = var4;
					int var5 = field988[var2];
					field988[var2] = field988[var2 + 1];
					field988[var2 + 1] = var5;
					int var6 = field989[var2];
					field989[var2] = field989[var2 + 1];
					field989[var2 + 1] = var6;
					int var7 = field991[var2];
					field991[var2] = field991[var2 + 1];
					field991[var2 + 1] = var7;
					var1 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method372() {
		if (field940 == 0 && field1058 == 0) {
			field861[field1040] = "Walk here";
			field990[field1040] = 284;
			field988[field1040] = field15;
			field989[field1040] = field16;
			field1040++;
		}

		for (int var1 = 0; var1 < class30.field461; var1++) {
			int var2 = class30.field462[var1];
			int var3 = var2 & 0x7F;
			int var4 = var2 >> 7 & 0x7F;
			int var5 = var2 >> 29 & 0x3;
			int var6 = var2 >> 14 & 0x7FFF;
			if (var5 == 2 && field1020.method63(field1069, var3, var4, var2) >= 0) {
				class49 var7 = class49.method237(var6);
				if (field940 == 1) {
					field861[field1040] = "Use " + field944 + " with @cya@" + var7.field643;
					field990[field1040] = 237;
					field991[field1040] = var2;
					field988[field1040] = var3;
					field989[field1040] = var4;
					field1040++;
				} else if (field1058 != 1) {
					if (var7.field659 != null) {
						for (int var8 = 4; var8 >= 0; var8--) {
							if (var7.field659[var8] != null) {
								field861[field1040] = var7.field659[var8] + " @cya@" + var7.field643;

								if (var8 == 0) {
									field990[field1040] = 981;
								}

								if (var8 == 1) {
									field990[field1040] = 462;
								}

								if (var8 == 2) {
									field990[field1040] = 54;
								}

								if (var8 == 3) {
									field990[field1040] = 146;
								}

								if (var8 == 4) {
									field990[field1040] = 754;
								}

								field991[field1040] = var2;
								field988[field1040] = var3;
								field989[field1040] = var4;
								field1040++;
							}
						}
					}

					field861[field1040] = "Examine @cya@" + var7.field643;
					field990[field1040] = 1294;
					field991[field1040] = var2;
					field988[field1040] = var3;
					field989[field1040] = var4;
					field1040++;
				} else if ((field1060 & 0x4) == 4) {
					field861[field1040] = field1061 + " @cya@" + var7.field643;
					field990[field1040] = 243;
					field991[field1040] = var2;
					field988[field1040] = var3;
					field989[field1040] = var4;
					field1040++;
				}
			}

			if (var5 == 1) {
				class24 var9 = field1141[var6];
				if (var9.field306.field679 == 1 && (var9.field256 & 0x7F) == 0x40 && (var9.field257 & 0x7F) == 0x40) {
					for (int var10 = 0; var10 < field1142; var10++) {
						class24 var11 = field1141[field1143[var10]];
						if (var11 != null && var9 != var11 && var11.field306.field679 == 1 && var9.field256 == var11.field256 && var9.field257 == var11.field257) {
							method373(var3, var11.field306, var4, field1143[var10]);
						}
					}
				}

				method373(var3, var9.field306, var4, var6);
			}

			if (var5 == 0) {
				class25 var12 = field957[var6];
				if ((var12.field256 & 0x7F) == 0x40 && (var12.field257 & 0x7F) == 0x40) {
					for (int var13 = 0; var13 < field1142; var13++) {
						class24 var14 = field1141[field1143[var13]];
						if (var14 != null && var14.field306.field679 == 1 && var12.field256 == var14.field256 && var12.field257 == var14.field257) {
							method373(var3, var14.field306, var4, field1143[var13]);
						}
					}

					for (int var15 = 0; var15 < field958; var15++) {
						class25 var16 = field957[field959[var15]];
						if (var16 != null && var12 != var16 && var12.field256 == var16.field256 && var12.field257 == var16.field257) {
							method374(var4, var3, var16, field959[var15]);
						}
					}
				}

				method374(var4, var3, var12, var6);
			}

			if (var5 == 3) {
				class40 var17 = field1019[field1069][var3][var4];
				if (var17 != null) {
					for (class21 var18 = (class21) var17.method204(); var18 != null; var18 = (class21) var17.method206()) {
						class51 var19 = class51.method249(var18.field255);
						if (field940 == 1) {
							field861[field1040] = "Use " + field944 + " with @lre@" + var19.field706;
							field990[field1040] = 160;
							field991[field1040] = var18.field255;
							field988[field1040] = var3;
							field989[field1040] = var4;
							field1040++;
						} else if (field1058 != 1) {
							for (int var20 = 4; var20 >= 0; var20--) {
								if (var19.field720 != null && var19.field720[var20] != null) {
									field861[field1040] = var19.field720[var20] + " @lre@" + var19.field706;

									if (var20 == 0) {
										field990[field1040] = 917;
									}

									if (var20 == 1) {
										field990[field1040] = 14;
									}

									if (var20 == 2) {
										field990[field1040] = 401;
									}

									if (var20 == 3) {
										field990[field1040] = 514;
									}

									if (var20 == 4) {
										field990[field1040] = 164;
									}

									field991[field1040] = var18.field255;
									field988[field1040] = var3;
									field989[field1040] = var4;
									field1040++;
								} else if (var20 == 2) {
									field861[field1040] = "Take @lre@" + var19.field706;
									field990[field1040] = 401;
									field991[field1040] = var18.field255;
									field988[field1040] = var3;
									field989[field1040] = var4;
									field1040++;
								}
							}

							field861[field1040] = "Examine @lre@" + var19.field706;
							field990[field1040] = 1971;
							field991[field1040] = var18.field255;
							field988[field1040] = var3;
							field989[field1040] = var4;
							field1040++;
						} else if ((field1060 & 0x1) == 1) {
							field861[field1040] = field1061 + " @lre@" + var19.field706;
							field990[field1040] = 504;
							field991[field1040] = var18.field255;
							field988[field1040] = var3;
							field989[field1040] = var4;
							field1040++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILxb;II)V")
	public final void method373(int arg0, class50 arg1, int arg2, int arg3) {
		if (field1040 < 400) {
			String var5 = arg1.field677;
			if (arg1.field695 != 0) {
				var5 = var5 + method375(arg1.field695, field1010.field313) + " (level-" + arg1.field695 + ")";
			}

			if (field940 == 1) {
				field861[field1040] = "Use " + field944 + " with @yel@" + var5;
				field990[field1040] = 806;
				field991[field1040] = arg3;
				field988[field1040] = arg0;
				field989[field1040] = arg2;
				field1040++;
			} else if (field1058 != 1) {
				if (arg1.field690 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg1.field690[var6] != null) {
							field861[field1040] = arg1.field690[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field990[field1040] = 710;
							}

							if (var6 == 1) {
								field990[field1040] = 301;
							}

							if (var6 == 2) {
								field990[field1040] = 328;
							}

							if (var6 == 3) {
								field990[field1040] = 498;
							}

							if (var6 == 4) {
								field990[field1040] = 74;
							}

							field991[field1040] = arg3;
							field988[field1040] = arg0;
							field989[field1040] = arg2;
							field1040++;
						}
					}
				}

				field861[field1040] = "Examine @yel@" + var5;
				field990[field1040] = 1725;
				field991[field1040] = arg3;
				field988[field1040] = arg0;
				field989[field1040] = arg2;
				field1040++;
			} else if ((field1060 & 0x2) == 2) {
				field861[field1040] = field1061 + " @yel@" + var5;
				field990[field1040] = 130;
				field991[field1040] = arg3;
				field988[field1040] = arg0;
				field989[field1040] = arg2;
				field1040++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILy;II)V")
	public final void method374(int arg0, int arg1, class25 arg2, int arg3) {
		if (field1010 != arg2 && field1040 < 400) {
			String var5 = arg2.field307 + method375(arg2.field313, field1010.field313) + " (level-" + arg2.field313 + ")";
			if (field940 == 1) {
				field861[field1040] = "Use " + field944 + " with @whi@" + var5;
				field990[field1040] = 636;
				field991[field1040] = arg3;
				field988[field1040] = arg1;
				field989[field1040] = arg0;
				field1040++;
			} else if (field1058 != 1) {
				field861[field1040] = "Trade with @whi@" + var5;
				field990[field1040] = 1682;
				field991[field1040] = arg3;
				field988[field1040] = arg1;
				field989[field1040] = arg0;
				field1040++;
				field861[field1040] = "Follow @whi@" + var5;
				field990[field1040] = 1930;
				field991[field1040] = arg3;
				field988[field1040] = arg1;
				field989[field1040] = arg0;
				field1040++;
				if (field949 > 0) {
					field861[field1040] = "Attack @whi@" + var5;
					field990[field1040] = 1754;
					field991[field1040] = arg3;
					field988[field1040] = arg1;
					field989[field1040] = arg0;
					field1040++;
				}
			} else if ((field1060 & 0x8) == 8) {
				field861[field1040] = field1061 + " @whi@" + var5;
				field990[field1040] = 730;
				field991[field1040] = arg3;
				field988[field1040] = arg1;
				field989[field1040] = arg0;
				field1040++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIB)Ljava/lang/String;")
	public static final String method375(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(ILdc;III)V")
	public final void method376(int arg0, class56 arg1, int arg2, int arg3) {
		if (arg1.field767 == 0 && arg1.field779 != null && (!arg1.field778 || field926 == arg1.field765 || field1039 == arg1.field765 || field879 == arg1.field765)) {
			int var5 = class31.field472;
			int var6 = class31.field470;
			int var7 = class31.field473;
			int var8 = class31.field471;
			class31.method129(arg1.field770 + arg3, arg3, arg2, arg1.field771 + arg2);
			int var9 = arg1.field779.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field780[var10] + arg3;
				int var12 = arg1.field781[var10] + arg2 - arg0;
				class56 var13 = class56.field760[arg1.field779[var10]];
				if (var13.field769 > 0) {
					method386(var13);
				}

				if (var13.field767 == 0) {
					if (var13.field777 > var13.field776 - var13.field771) {
						var13.field777 = var13.field776 - var13.field771;
					}

					if (var13.field777 < 0) {
						var13.field777 = 0;
					}

					method376(var13.field777, var13, var12, var11);

					if (var13.field776 > var13.field771) {
						method378(var12, var13.field770 + var11, var13.field777, var13.field771, var13.field776);
					}
				} else if (var13.field767 != 1) {
					if (var13.field767 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field771; var15++) {
							for (int var16 = 0; var16 < var13.field770; var16++) {
								int var17 = (var13.field787 + 32) * var16 + var11;
								int var18 = (var13.field788 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field790[var14];
									var18 += var13.field791[var14];
								}

								if (var13.field761[var14] > 0) {
									int var19 = var13.field761[var14] - 1;
									class33 var20 = class51.method253(var19);
									if (field1115 != 0 && field1114 == var14 && field1113 == var13.field765) {
										var20.method157(var17, var18, 128);
									} else {
										var20.method155(var17, var18);
									}

									if (var20.field505 == 33 || var13.field762[var14] != 1) {
										int var21 = var13.field762[var14];
										field881.method171(String.valueOf(var21), var17 + 1, var18 + 10, 0);
										field881.method171(String.valueOf(var21), var17, var18 + 9, 0xFFFF00);
									}
								} else if (var13.field789 != null && var14 < 20) {
									class33 var22 = var13.field789[var14];
									if (var22 != null) {
										var22.method155(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field767 == 3) {
						if (var13.field793) {
							class31.method131(var13.field799, var13.field770, var12, var13.field771, var11);
						} else {
							class31.method132(var13.field770, var13.field771, var11, var12, var13.field799);
						}
					} else if (var13.field767 == 4) {
						class35 var23 = var13.field796;
						int var24 = var13.field799;
						String var25 = var13.field797;

						if ((field879 == var13.field765 || field1039 == var13.field765 || field926 == var13.field765) && var13.field801 != 0) {
							var24 = var13.field801;
						}

						if (method380(var13)) {
							var24 = var13.field800;

							if (var13.field798.length() > 0) {
								var25 = var13.field798;
							}
						}

						if (var13.field768 == 6 && field903) {
							var25 = "Please wait...";
							var24 = var13.field799;
						}

						int var26 = var23.field522 + var12;
						while (var25.length() > 0) {
							if (var25.indexOf("%") != -1) {
								while (true) {
									int var27 = var25.indexOf("%1");
									if (var27 == -1) {
										break;
									}

									var25 = var25.substring(0, var27) + method379(method381(0, var13)) + var25.substring(var27 + 2);
								}

								while (true) {
									int var28 = var25.indexOf("%2");
									if (var28 == -1) {
										break;
									}

									var25 = var25.substring(0, var28) + method379(method381(1, var13)) + var25.substring(var28 + 2);
								}

								while (true) {
									int var29 = var25.indexOf("%3");
									if (var29 == -1) {
										break;
									}

									var25 = var25.substring(0, var29) + method379(method381(2, var13)) + var25.substring(var29 + 2);
								}

								while (true) {
									int var30 = var25.indexOf("%4");
									if (var30 == -1) {
										break;
									}

									var25 = var25.substring(0, var30) + method379(method381(3, var13)) + var25.substring(var30 + 2);
								}

								while (true) {
									int var31 = var25.indexOf("%5");
									if (var31 == -1) {
										break;
									}

									var25 = var25.substring(0, var31) + method379(method381(4, var13)) + var25.substring(var31 + 2);
								}
							}

							int var32 = var25.indexOf("\\n");
							String var33;
							if (var32 == -1) {
								var33 = var25;
								var25 = "";
							} else {
								var33 = var25.substring(0, var32);
								var25 = var25.substring(var32 + 2);
							}

							if (var13.field794) {
								var23.method169(var13.field770 / 2 + var11, var33, var26, var24, var13.field795);
							} else {
								var23.method173(var13.field795, var11, var26, var24, var33);
							}

							var26 += var23.field522;
						}
					} else if (var13.field767 == 5) {
						class33 var34;
						if (method380(var13)) {
							var34 = var13.field803;
						} else {
							var34 = var13.field802;
						}

						if (var34 != null) {
							var34.method155(var11, var12);
						}
					} else if (var13.field767 == 6) {
						int var35 = class32.field482;
						int var36 = class32.field483;
						class32.field482 = var13.field770 / 2 + var11;
						class32.field483 = var13.field771 / 2 + var12;
						int var37 = class32.field486[var13.field809] * var13.field808 >> 16;
						int var38 = class32.field487[var13.field809] * var13.field808 >> 16;
						class30 var39;
						if (var13.field806 == -1) {
							var39 = var13.method276(-1, -1, method380(var13));
						} else {
							class58 var40 = class58.field823[var13.field806];
							var39 = var13.method276(var40.field825[var13.field763], var40.field826[var13.field763], method380(var13));
						}

						if (var39 != null) {
							var39.method121(var37, var38, 0, 0, 0, var13.field809, var13.field810);
						}

						class32.field482 = var35;
						class32.field483 = var36;
					} else if (var13.field767 == 7) {
						class35 var41 = var13.field796;
						int var42 = 0;
						for (int var43 = 0; var43 < var13.field771; var43++) {
							for (int var44 = 0; var44 < var13.field770; var44++) {
								if (var13.field761[var42] > 0) {
									class51 var45 = class51.method249(var13.field761[var42] - 1);
									String var46 = var45.field706;
									if (var45.field717 || var13.field762[var42] != 1) {
										var46 = var13.field762[var42] + "x " + var46;
									}

									int var47 = (var13.field787 + 115) * var44 + var11;
									int var48 = (var13.field788 + 12) * var43 + var12;
									if (var13.field794) {
										if (var13.field795) {
											var41.method168(var48 + 1, var13.field770 / 2 + var47 + 1, 0, var46);
										}

										var41.method168(var48, var13.field770 / 2 + var47, var13.field799, var46);
									} else {
										if (var13.field795) {
											var41.method171(var46, var47 + 1, var48 + 1, 0);
										}

										var41.method171(var46, var47, var48, var13.field799);
									}
								}

								var42++;
							}
						}
					}
				}
			}

			class31.method129(var7, var5, var6, var8);
		}
	}

	@ObfuscatedName("client.a(IIIIILdc;IZI)V")
	public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, class56 arg5, boolean arg6, int arg7) {
		if (field1054) {
			field992 = 32;
		} else {
			field992 = 0;
		}

		field1054 = false;
		if (arg2 >= arg1 && arg2 < arg1 + 16 && arg4 >= arg0 && arg4 < arg0 + 16) {
			arg5.field777 -= field1111 * 4;

			if (arg6) {
				field876 = true;
				return;
			}
		} else if (arg2 >= arg1 && arg2 < arg1 + 16 && arg4 >= arg0 + arg3 - 16 && arg4 < arg0 + arg3) {
			arg5.field777 += field1111 * 4;

			if (arg6) {
				field876 = true;
				return;
			}
		} else if (arg2 >= arg1 - field992 && arg2 < arg1 + field992 + 16 && arg4 >= arg0 + 16 && arg4 < arg0 + arg3 - 16 && field1111 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg0 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg5.field777 = (arg7 - arg3) * var10 / var11;

			if (arg6) {
				field876 = true;
			}

			field1054 = true;
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field869.method166(arg1, arg0);
		field870.method166(arg1, arg0 + arg3 - 16);
		class31.method131(field932, 16, arg0 + 16, arg3 - 32, arg1);
		int var6 = (arg3 - 32) * arg3 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg2 / (arg4 - arg3);
		class31.method131(field1116, 16, arg0 + var7 + 16, var6, arg1);
		class31.method134(arg0 + var7 + 16, arg1, var6, field1102);
		class31.method134(arg0 + var7 + 16, arg1 + 1, var6, field1102);
		class31.method133(field1102, arg0 + var7 + 16, 16, arg1);
		class31.method133(field1102, arg0 + var7 + 17, 16, arg1);
		class31.method134(arg0 + var7 + 16, arg1 + 15, var6, field1009);
		class31.method134(arg0 + var7 + 17, arg1 + 14, var6 - 1, field1009);
		class31.method133(field1009, arg0 + var7 + var6 + 15, 16, arg1);
		class31.method133(field1009, arg0 + var7 + var6 + 14, 15, arg1 + 1);
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public final String method379(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Ldc;I)Z")
	public final boolean method380(class56 arg0) {
		if (arg0.field773 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field773.length; var2++) {
			int var3 = method381(var2, arg0);
			int var4 = arg0.field774[var2];
			if (arg0.field773[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field773[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field773[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IILdc;)I")
	public final int method381(int arg0, class56 arg1) {
		if (arg1.field772 == null || arg0 >= arg1.field772.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field772[arg0];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				label93: while (true) {
					int var6;
					do {
						var6 = var3[var5++];
						if (var6 == 0) {
							return var4;
						}

						if (var6 == 1) {
							var4 += field1015[var3[var5++]];
						}

						if (var6 == 2) {
							var4 += field1003[var3[var5++]];
						}

						if (var6 == 3) {
							var4 += field867[var3[var5++]];
						}

						if (var6 == 4) {
							class56 var7 = class56.field760[var3[var5++]];
							int var8 = var3[var5++] + 1;
							for (int var9 = 0; var9 < var7.field761.length; var9++) {
								if (var7.field761[var9] == var8) {
									var4 += var7.field762[var9];
								}
							}
						}

						if (var6 == 5) {
							var4 += field1144[var3[var5++]];
						}

						if (var6 == 6) {
							var4 += field1033[field1003[var3[var5++]] - 1];
						}

						if (var6 == 7) {
							var4 += field1144[var3[var5++]] * 100 / 46875;
						}

						if (var6 == 8) {
							var4 += field1010.field313;
						}

						if (var6 == 9) {
							for (int var10 = 0; var10 < 19; var10++) {
								var4 += field1003[var10];
							}
						}
					} while (var6 != 10);

					class56 var11 = class56.field760[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field761.length; var13++) {
						if (var11.field761[var13] == var12) {
							break label93;
						}
					}
				}

				var4 += 999999999;
			}
		} catch (Exception var14) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(Ldc;ZIIIII)V")
	public final void method382(class56 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field767 == 0 && arg0.field779 != null && !arg0.field778 && (arg2 >= arg1 && arg4 >= arg5 && arg2 <= arg0.field770 + arg1 && arg4 <= arg0.field771 + arg5)) {
			int var7 = arg0.field779.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.field780[var8] + arg1;
				int var10 = arg0.field781[var8] + arg5 - arg3;
				class56 var11 = class56.field760[arg0.field779[var8]];
				if ((var11.field775 >= 0 || var11.field801 != 0) && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field770 + var9 && arg4 < var11.field771 + var10) {
					if (var11.field775 >= 0) {
						field1036 = var11.field775;
					} else {
						field1036 = var11.field765;
					}
				}

				if (var11.field767 == 0) {
					method382(var11, var9, arg2, var11.field777, arg4, var10);

					if (var11.field776 > var11.field771) {
						method377(var10, var11.field770 + var9, arg2, var11.field771, arg4, var11, true, var11.field776);
					}
				} else {
					if (var11.field768 == 1 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field770 + var9 && arg4 < var11.field771 + var10) {
						field861[field1040] = var11.field814;
						field990[field1040] = 759;
						field989[field1040] = var11.field765;
						field1040++;
					}

					if (var11.field768 == 2 && field1058 == 0 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field770 + var9 && arg4 < var11.field771 + var10) {
						String var12 = var11.field811;
						if (var12.indexOf(" ") != -1) {
							var12 = var12.substring(0, var12.indexOf(" "));
						}

						field861[field1040] = var12 + " @gre@" + var11.field812;
						field990[field1040] = 17;
						field989[field1040] = var11.field765;
						field1040++;
					}

					if (var11.field768 == 3 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field770 + var9 && arg4 < var11.field771 + var10) {
						field861[field1040] = "Close";
						field990[field1040] = 454;
						field989[field1040] = var11.field765;
						field1040++;
					}

					if (var11.field768 == 4 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field770 + var9 && arg4 < var11.field771 + var10) {
						field861[field1040] = var11.field814;
						field990[field1040] = 739;
						field989[field1040] = var11.field765;
						field1040++;
					}

					if (var11.field768 == 5 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field770 + var9 && arg4 < var11.field771 + var10) {
						field861[field1040] = var11.field814;
						field990[field1040] = 700;
						field989[field1040] = var11.field765;
						field1040++;
					}

					if (var11.field768 == 6 && !field903 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.field770 + var9 && arg4 < var11.field771 + var10) {
						field861[field1040] = var11.field814;
						field990[field1040] = 883;
						field989[field1040] = var11.field765;
						field1040++;
					}

					if (var11.field767 == 2) {
						int var13 = 0;
						for (int var14 = 0; var14 < var11.field771; var14++) {
							for (int var15 = 0; var15 < var11.field770; var15++) {
								if (var11.field761[var13] > 0) {
									int var16 = (var11.field787 + 32) * var15 + var9;
									int var17 = (var11.field788 + 32) * var14 + var10;
									if (var13 < 20) {
										var16 += var11.field790[var13];
										var17 += var11.field791[var13];
									}

									if (arg2 >= var16 && arg4 >= var17 && arg2 < var16 + 32 && arg4 < var17 + 32) {
										class51 var18 = class51.method249(var11.field761[var13] - 1);
										if (field940 == 1 && var11.field785) {
											if (field942 != var11.field765 || field941 != var13) {
												field861[field1040] = "Use " + field944 + " with @lre@" + var18.field706;
												field990[field1040] = 39;
												field991[field1040] = var18.field704;
												field988[field1040] = var13;
												field989[field1040] = var11.field765;
												field1040++;
											}
										} else if (field1058 != 1 || !var11.field785) {
											if (var11.field785) {
												for (int var19 = 4; var19 >= 3; var19--) {
													if (var18.field721 != null && var18.field721[var19] != null) {
														field861[field1040] = var18.field721[var19] + " @lre@" + var18.field706;

														if (var19 == 3) {
															field990[field1040] = 247;
														}

														if (var19 == 4) {
															field990[field1040] = 296;
														}

														field991[field1040] = var18.field704;
														field988[field1040] = var13;
														field989[field1040] = var11.field765;
														field1040++;
													} else if (var19 == 4) {
														field861[field1040] = "Drop @lre@" + var18.field706;
														field990[field1040] = 296;
														field991[field1040] = var18.field704;
														field988[field1040] = var13;
														field989[field1040] = var11.field765;
														field1040++;
													}
												}
											}

											if (var11.field786) {
												field861[field1040] = "Use @lre@" + var18.field706;
												field990[field1040] = 669;
												field991[field1040] = var18.field704;
												field988[field1040] = var13;
												field989[field1040] = var11.field765;
												field1040++;
											}

											if (var11.field785 && var18.field721 != null) {
												for (int var20 = 2; var20 >= 0; var20--) {
													if (var18.field721[var20] != null) {
														field861[field1040] = var18.field721[var20] + " @lre@" + var18.field706;

														if (var20 == 0) {
															field990[field1040] = 677;
														}

														if (var20 == 1) {
															field990[field1040] = 522;
														}

														if (var20 == 2) {
															field990[field1040] = 249;
														}

														field991[field1040] = var18.field704;
														field988[field1040] = var13;
														field989[field1040] = var11.field765;
														field1040++;
													}
												}
											}

											if (var11.field792 != null) {
												for (int var21 = 4; var21 >= 0; var21--) {
													if (var11.field792[var21] != null) {
														field861[field1040] = var11.field792[var21] + " @lre@" + var18.field706;

														if (var21 == 0) {
															field990[field1040] = 678;
														}

														if (var21 == 1) {
															field990[field1040] = 523;
														}

														if (var21 == 2) {
															field990[field1040] = 836;
														}

														if (var21 == 3) {
															field990[field1040] = 548;
														}

														if (var21 == 4) {
															field990[field1040] = 62;
														}

														field991[field1040] = var18.field704;
														field988[field1040] = var13;
														field989[field1040] = var11.field765;
														field1040++;
													}
												}
											}

											field861[field1040] = "Examine @lre@" + var18.field706;
											field990[field1040] = 1258;
											field991[field1040] = var18.field704;
											field1040++;
										} else if ((field1060 & 0x10) == 0x10) {
											field861[field1040] = field1061 + " @lre@" + var18.field706;
											field990[field1040] = 449;
											field991[field1040] = var18.field704;
											field988[field1040] = var13;
											field989[field1040] = var11.field765;
											field1040++;
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

	@ObfuscatedName("client.e(II)V")
	public final void method383(int arg0) {
		class56 var2 = class56.field760[arg0];
		for (int var3 = 0; var3 < var2.field779.length && var2.field779[var3] != -1; var3++) {
			class56 var4 = class56.field760[var2.field779[var3]];
			if (var4.field767 == 1) {
				method383(var4.field765);
			}

			var4.field763 = 0;
			var4.field764 = 0;
		}
	}

	@ObfuscatedName("client.a(BII)Z")
	public final boolean method384(int arg0, int arg1) {
		boolean var3 = false;
		class56 var4 = class56.field760[arg1];
		for (int var5 = 0; var5 < var4.field779.length && var4.field779[var5] != -1; var5++) {
			class56 var6 = class56.field760[var4.field779[var5]];
			if (var6.field767 == 1) {
				var3 |= method384(arg0, var6.field765);
			}

			if (var6.field806 != -1) {
				class58 var7 = class58.field823[var6.field806];
				var6.field764 += arg0;
				while (var6.field764 > var7.field827[var6.field763]) {
					var6.field764 -= var7.field827[var6.field763] + 1;
					var6.field763++;
					if (var6.field763 >= var7.field824) {
						var6.field763 -= var7.field828;
						if (var6.field763 < 0 || var6.field763 >= var7.field824) {
							var6.field763 = 0;
						}
					}

					var3 = true;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method385(int arg0) {
		int var2 = class60.field845[arg0].field853;
		if (var2 != 0) {
			int var3 = field1144[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class32.method144(0.9D);
				}

				if (var3 == 2) {
					class32.method144(0.8D);
				}

				if (var3 == 3) {
					class32.method144(0.7D);
				}

				if (var3 == 4) {
					class32.method144(0.6D);
				}

				class51.field733.method86();
				field1055 = true;
			}

			if (var2 == 3) {
				if (var3 == 1 && field978) {
					field978 = false;
					signlink.midi = "null";
				}

				if (var3 == 0 && !field978) {
					field978 = true;
					signlink.midi = field1072;
				}
			}

			if (var2 == 5) {
				field1037 = var3;
			}

			if (var2 == 6) {
				field939 = var3;
			}
		}
	}

	@ObfuscatedName("client.b(Ldc;I)V")
	public final void method386(class56 arg0) {
		int var2 = arg0.field769;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= field1053) {
				arg0.field797 = "";
				arg0.field768 = 0;
			} else {
				arg0.field797 = field1063[var2];
				arg0.field768 = 1;
				if (arg0.field814 == null) {
					arg0.field768 = 0;
				}
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= field1053) {
				arg0.field797 = "";
				arg0.field768 = 0;
			} else {
				if (field1145[var2] == 0) {
					arg0.field797 = "@red@Offline";
				} else if (field1145[var2] == field1062) {
					arg0.field797 = "@gre@World-" + (field1145[var2] - 9);
				} else {
					arg0.field797 = "@yel@World-" + (field1145[var2] - 9);
				}

				arg0.field768 = 1;
				if (arg0.field814 == null) {
					arg0.field768 = 0;
				}
			}
		} else if (var2 == 203) {
			arg0.field776 = field1053 * 15 + 20;
			if (arg0.field776 <= arg0.field771) {
				arg0.field776 = arg0.field771 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1034) {
				arg0.field797 = "";
				arg0.field768 = 0;
			} else {
				arg0.field797 = class47.method230(class47.method227(field1043[var2]));
			}
		} else if (var2 == 503) {
			arg0.field776 = field1034 * 15 + 20;
			if (arg0.field776 <= arg0.field771) {
				arg0.field776 = arg0.field771 + 1;
			}
		} else if (var2 == 327) {
			arg0.field809 = 150;
			arg0.field810 = (int) (Math.sin(field877 / 40.0D) * 256.0D) & 0x7FF;

			if (field901) {
				field901 = false;
				class30[] var3 = new class30[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = field966[var5];
					if (var6 >= 0) {
						var3[var4++] = class55.field754[var6].method273();
					}
				}

				class30 var7 = new class30(var4, var3);
				for (int var8 = 0; var8 < 5; var8++) {
					if (field1035[var8] != 0) {
						var7.method115(field1065[var8][0], field1065[var8][field1035[var8]]);

						if (var8 == 1) {
							var7.method115(field871[0], field871[field1035[var8]]);
						}
					}
				}

				var7.method108();
				var7.method109(class58.field823[field1010.field265].field825[0]);
				var7.method118(64, 850, -30, -50, -30, true);
				arg0.field804 = var7;
			}
		} else if (var2 == 324) {
			if (field1066 == null) {
				field1066 = arg0.field802;
				field1067 = arg0.field803;
			}

			if (field946) {
				arg0.field802 = field1067;
			} else {
				arg0.field802 = field1066;
			}
		} else if (var2 == 325) {
			if (field1066 == null) {
				field1066 = arg0.field802;
				field1067 = arg0.field803;
			}

			if (field946) {
				arg0.field802 = field1066;
			} else {
				arg0.field802 = field1067;
			}
		}
	}

	@ObfuscatedName("client.c(Ldc;I)Z")
	public final boolean method387(class56 arg0) {
		int var2 = arg0.field769;
		if (var2 == 201) {
			field979 = true;
			field929 = false;
			field863 = true;
			field1122 = "";
			field933 = 1;
			field1107 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field979 = true;
			field929 = false;
			field863 = true;
			field1122 = "";
			field933 = 2;
			field1107 = "Enter name of friend to delete from list";
		}

		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			if (field1145[var2] > 0) {
				field979 = true;
				field929 = false;
				field863 = true;
				field1122 = "";
				field933 = 3;
				field952 = var2;
				field1107 = "Enter message to send to " + field1063[var2];
			}
		}

		if (var2 == 501) {
			field979 = true;
			field929 = false;
			field863 = true;
			field1122 = "";
			field933 = 4;
			field1107 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field979 = true;
			field929 = false;
			field863 = true;
			field1122 = "";
			field933 = 5;
			field1107 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field966[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class55.field753 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class55.field753) {
							var5 = 0;
						}
					}

					if (class55.field754[var5].field755 == var3 + (field946 ? 0 : 7)) {
						break;
					}
				}

				field966[var3] = var5;
				field901 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1035[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1065[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1065[var6].length) {
					var8 = 0;
				}
			}

			field1035[var6] = var8;
			field901 = true;
		}

		if (var2 == 324 && !field946) {
			field946 = true;
			method388();
		}

		if (var2 == 325 && field946) {
			field946 = false;
			method388();
		}

		if (var2 != 326) {
			return false;
		}

		field920.method177(128);
		field920.method178(field946 ? 0 : 1);

		for (int var9 = 0; var9 < 7; var9++) {
			field920.method178(field966[var9]);
		}

		for (int var10 = 0; var10 < 5; var10++) {
			field920.method178(field1035[var10]);
		}

		return true;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method388() {
		field901 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field966[var1] = -1;
			for (int var2 = 0; var2 < class55.field753; var2++) {
				if (class55.field754[var2].field755 == var1 + (field946 ? 0 : 7)) {
					field966[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method389() {
		field1006.method210();
		int var1 = field1010.field256 / 32 + 48;
		int var2 = 464 - field1010.field257 / 32;
		field1139.method159(21, var1, var2, field968, 151, field866, 146, field1068, 9);
		field1076.method159(0, 25, 25, field968, 33, field1001, 33, field993, 0);

		for (int var3 = 0; var3 < field890; var3++) {
			int var4 = field891[var3] * 4 + 2 - field1010.field256 / 32;
			int var5 = field892[var3] * 4 + 2 - field1010.field257 / 32;
			method390(var4, var5, field1013[var3]);
		}

		for (int var6 = 0; var6 < 104; var6++) {
			for (int var7 = 0; var7 < 104; var7++) {
				class40 var8 = field1019[field1069][var6][var7];
				if (var8 != null) {
					int var9 = var6 * 4 + 2 - field1010.field256 / 32;
					int var10 = var7 * 4 + 2 - field1010.field257 / 32;
					method390(var9, var10, field1023);
				}
			}
		}

		for (int var11 = 0; var11 < field1142; var11++) {
			class24 var12 = field1141[field1143[var11]];
			if (var12 != null && var12.method94() && var12.field306.field694) {
				int var13 = var12.field256 / 32 - field1010.field256 / 32;
				int var14 = var12.field257 / 32 - field1010.field257 / 32;
				method390(var13, var14, field1024);
			}
		}

		for (int var15 = 0; var15 < field958; var15++) {
			class25 var16 = field957[field959[var15]];
			if (var16 != null && var16.method98()) {
				int var17 = var16.field256 / 32 - field1010.field256 / 32;
				int var18 = var16.field257 / 32 - field1010.field257 / 32;
				method390(var17, var18, field1025);
			}
		}

		class31.method131(0xFFFFFF, 3, 82, 3, 93);
		field1007.method210();
	}

	@ObfuscatedName("client.a(IIILgb;)V")
	public final void method390(int arg0, int arg1, class33 arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 <= 6400) {
			int var5 = class30.field463[field968];
			int var6 = class30.field464[field968];
			int var7 = arg0 * var6 + arg1 * var5 >> 16;
			int var8 = arg1 * var6 - arg0 * var5 >> 16;
			if (var4 > 2500) {
				arg2.method160(field874, var7 + 94 - arg2.field501 / 2, 83 - var8 - arg2.field502 / 2);
			} else {
				arg2.method155(var7 + 94 - arg2.field501 / 2, 83 - var8 - arg2.field502 / 2);
			}
		}
	}

	@ObfuscatedName("client.b(ILjava/lang/String;Ljava/lang/String;I)V")
	public final void method391(int arg0, String arg1, String arg2) {
		if (field1124 == -1) {
			field979 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1041[var4] = field1041[var4 - 1];
			field964[var4] = field964[var4 - 1];
			field1138[var4] = field1138[var4 - 1];
		}

		field1041[0] = arg0;
		field964[0] = arg1;
		field1138[0] = arg2;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method392() {
		field1008.method210();
		class32.field488 = field923;
		field875.method166(0, 0);

		if (field863) {
			field883.method168(40, 239, 0, field1107);
			field883.method168(60, 239, 128, field1122 + "*");
		} else if (field929) {
			field883.method168(40, 239, 0, "Enter amount to transfer:");
			field883.method168(60, 239, 128, field1032 + "*");
		} else if (field1124 == -1) {
			int var1 = 0;
			class31.method129(463, 0, 0, 77);

			for (int var2 = 0; var2 < 50; var2++) {
				if (field1138[var2] != null) {
					int var3 = field1041[var2];
					int var4 = field1074 + 70 - var1 * 14;
					if (var3 == 0) {
						if (var4 > 0 && var4 < 110) {
							field884.method171(field1138[var2], 4, var4, 0);
						}

						var1++;
					}

					if (var3 == 1) {
						if (var4 > 0 && var4 < 110) {
							field884.method171(field964[var2] + ":", 4, var4, 0xFFFFFF);
							field884.method171(field1138[var2], field884.method170(field964[var2]) + 12, var4, 255);
						}

						var1++;
					}

					if (var3 == 2 && (field1016 == 0 || field1016 == 1 && method393(field964[var2]))) {
						if (var4 > 0 && var4 < 110) {
							field884.method171(field964[var2] + ":", 4, var4, 0);
							field884.method171(field1138[var2], field884.method170(field964[var2]) + 12, var4, 255);
						}

						var1++;
					}

					if (var3 == 3 && (field984 == 0 || field984 == 1 && method393(field964[var2]))) {
						if (var4 > 0 && var4 < 110) {
							field884.method171("From " + field964[var2] + ":", 4, var4, 0);
							field884.method171(field1138[var2], field884.method170("From " + field964[var2]) + 12, var4, 0x800000);
						}

						var1++;
					}

					if (var3 == 4 && (field963 == 0 || field963 == 1 && method393(field964[var2]))) {
						if (var4 > 0 && var4 < 110) {
							field884.method171(field964[var2] + " " + field1138[var2], 4, var4, 0x800080);
						}

						var1++;
					}

					if (var3 == 5 && field984 < 2) {
						if (var4 > 0 && var4 < 110) {
							field884.method171(field1138[var2], 4, var4, 0x800000);
						}

						var1++;
					}

					if (var3 == 6 && field984 < 2) {
						if (var4 > 0 && var4 < 110) {
							field884.method171("To " + field964[var2] + ":", 4, var4, 0);
							field884.method171(field1138[var2], field884.method170("To " + field964[var2]) + 12, var4, 0x800000);
						}

						var1++;
					}
				}
			}

			class31.method128();
			field1121 = var1 * 14 + 7;
			if (field1121 < 78) {
				field1121 = 78;
			}

			method378(0, 463, field1121 - field1074 - 77, 77, field1121);
			field884.method171(field1031 + "*", 3, 90, 0);
			class31.method133(0, 77, 479, 0);
		} else {
			method376(0, class56.field760[field1124], 0, 0);
		}

		field1008.method211(field8, 22, 375);
		field1007.method210();
		class32.field488 = field925;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method393(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1053; var2++) {
			if (arg0.equalsIgnoreCase(field1063[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1010.field307)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method394() {
		field1005.method210();
		class32.field488 = field924;
		field873.method166(0, 0);

		if (field927 != -1) {
			method376(0, class56.field760[field927], 0, 0);
		} else if (field1064[field934] != -1) {
			method376(0, class56.field760[field1064[field934]], 0, 0);
		}

		if (field1089 && field1026 == 1) {
			method368();
		}

		field1005.method211(field8, 562, 231);
		field1007.method210();
		class32.field488 = field925;
	}

	@ObfuscatedName("client.v(I)I")
	public final int method395() {
		return 0;
	}

	@ObfuscatedName("client.c(B)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field11 != null) {
			return field11;
		}

		return this;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field11 != null) {
				return new URL("http://" + field1088 + ":" + (field1052 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.w(I)Ljava/lang/String;")
	public final String method396() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field11 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
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
	public final DataInputStream method397(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.x(I)Ljava/net/Socket;")
	public final Socket method398(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
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

	public final String getjingle() {
		if (signlink.jingle == null) {
			return "none";
		} else {
			String var1 = signlink.jingle + ".mid.gz";
			signlink.jingle = null;
			return var1;
		}
	}

	public final int getjinglelen() {
		return signlink.jinglelen;
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1033[var1] = var0 / 4;
		}
	}
}
