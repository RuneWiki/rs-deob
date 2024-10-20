package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field975 = new class162[4];

    @ObfuscatedName("client.ay")
    public static boolean field1016 = true;

    @ObfuscatedName("client.ap")
    public static int field914 = 1;

    @ObfuscatedName("client.ai")
    public static int field987 = 0;

    @ObfuscatedName("client.bv")
    public static int field916 = 0;

    @ObfuscatedName("client.bj")
    public static boolean field918 = false;

    @ObfuscatedName("client.bx")
    public static boolean field919 = false;

    @ObfuscatedName("client.bf")
    public static int field920 = 0;

    @ObfuscatedName("client.bo")
    public static int field970 = 0;

    @ObfuscatedName("client.bl")
    public static boolean field922 = true;

    @ObfuscatedName("client.bp")
    public static int field923 = 0;

    @ObfuscatedName("client.bt")
    public static long field1084 = 1L;

    @ObfuscatedName("client.bz")
    public static int field1022 = -1;

    @ObfuscatedName("client.by")
    public static int field926 = -1;

    @ObfuscatedName("client.bi")
    public static int field927 = -1;

    @ObfuscatedName("client.br")
    public static boolean field1179 = true;

    @ObfuscatedName("client.bg")
    public static boolean field929 = false;

    @ObfuscatedName("client.bb")
    public static int field1082 = 0;

    @ObfuscatedName("client.bk")
    public static int field931 = 0;

    @ObfuscatedName("client.bw")
    public static int field932 = 0;

    @ObfuscatedName("client.bu")
    public static int field1167 = 0;

    @ObfuscatedName("client.bq")
    public static int field934 = 0;

    @ObfuscatedName("client.ba")
    public static int field1137 = 0;

    @ObfuscatedName("client.cs")
    public static int field980 = 0;

    @ObfuscatedName("client.cy")
    public static int field937 = 0;

    @ObfuscatedName("client.cw")
    public static int field938 = 0;

    @ObfuscatedName("client.cv")
    public static class92 field999 = class92.field1415;

    @ObfuscatedName("client.cl")
    public static class92 field940 = class92.field1415;

    @ObfuscatedName("client.cp")
    public static int field982 = 0;

    @ObfuscatedName("client.cf")
    public static int field1052 = 0;

    @ObfuscatedName("client.cd")
    public static int field943 = 0;

    @ObfuscatedName("client.dn")
    public static int field946 = 0;

    @ObfuscatedName("client.dd")
    public static int field1153 = 0;

    @ObfuscatedName("client.dc")
    public static int field948 = 0;

    @ObfuscatedName("client.dk")
    public static int field1130 = 0;

    @ObfuscatedName("client.dm")
    public static int field950 = 0;

    @ObfuscatedName("client.dp")
    public static byte[] field1109 = null;

    @ObfuscatedName("client.dl")
    public static class87[] field952 = new class87[32768];

    @ObfuscatedName("client.dg")
    public static int field953 = 0;

    @ObfuscatedName("client.dj")
    public static int[] field954 = new int[32768];

    @ObfuscatedName("client.dr")
    public static int field955 = 0;

    @ObfuscatedName("client.du")
    public static int[] field956 = new int[250];

    @ObfuscatedName("client.eu")
    public static class180 field957 = new class180(5000);

    @ObfuscatedName("client.ek")
    public static class180 field958 = new class180(5000);

    @ObfuscatedName("client.ee")
    public static class180 field959 = new class180(15000);

    @ObfuscatedName("client.eq")
    public static int field960 = 0;

    @ObfuscatedName("client.eh")
    public static int field961 = 0;

    @ObfuscatedName("client.ey")
    public static int field962 = 0;

    @ObfuscatedName("client.ed")
    public static int field963 = 0;

    @ObfuscatedName("client.ea")
    public static int field964 = 0;

    @ObfuscatedName("client.el")
    public static int field965 = 0;

    @ObfuscatedName("client.ef")
    public static int field966 = 0;

    @ObfuscatedName("client.eo")
    public static int field967 = 0;

    @ObfuscatedName("client.ej")
    public static boolean field968 = false;

    @ObfuscatedName("client.es")
    public static HashMap field915 = new HashMap();

    @ObfuscatedName("client.en")
    public static int field1081 = 0;

    @ObfuscatedName("client.fa")
    public static int field1152 = 1;

    @ObfuscatedName("client.fj")
    public static int field972 = 0;

    @ObfuscatedName("client.ff")
    public static int field973 = 1;

    @ObfuscatedName("client.fq")
    public static int field1181 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field1083 = false;

    @ObfuscatedName("client.fr")
    public static int[][][] field977 = new int[4][13][13];

    @ObfuscatedName("client.fd")
    public static final int[] field978 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fn")
    public static int field1172 = 0;

    @ObfuscatedName("client.fl")
    public static int field1161 = 2;

    @ObfuscatedName("client.fk")
    public static int field981 = 0;

    @ObfuscatedName("client.fi")
    public static int field1162 = 2;

    @ObfuscatedName("client.fz")
    public static int field1126 = 0;

    @ObfuscatedName("client.fs")
    public static int field984 = 1;

    @ObfuscatedName("client.fy")
    public static int field985 = 0;

    @ObfuscatedName("client.fe")
    public static int field986 = 0;

    @ObfuscatedName("client.fh")
    public static int field1132 = 2;

    @ObfuscatedName("client.fp")
    public static int field1077 = 0;

    @ObfuscatedName("client.gw")
    public static int field1057 = 1;

    @ObfuscatedName("client.gf")
    public static int field990 = 0;

    @ObfuscatedName("client.gb")
    public static int field991 = 0;

    @ObfuscatedName("client.gi")
    public static int field992 = 2301979;

    @ObfuscatedName("client.gv")
    public static int field1177 = 5063219;

    @ObfuscatedName("client.gn")
    public static int field994 = 3353893;

    @ObfuscatedName("client.gt")
    public static int field995 = 7759444;

    @ObfuscatedName("client.gp")
    public static boolean field996 = false;

    @ObfuscatedName("client.go")
    public static int field913 = 0;

    @ObfuscatedName("client.gx")
    public static int field1108 = 128;

    @ObfuscatedName("client.hu")
    public static int field1000 = 0;

    @ObfuscatedName("client.hb")
    public static int field1001 = 0;

    @ObfuscatedName("client.hx")
    public static int field1002 = 0;

    @ObfuscatedName("client.he")
    public static int field1003 = 0;

    @ObfuscatedName("client.hl")
    public static int field1004 = 0;

    @ObfuscatedName("client.hk")
    public static int field1005 = 50;

    @ObfuscatedName("client.hj")
    public static int field1085 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field921 = false;

    @ObfuscatedName("client.hr")
    public static int field1008 = 0;

    @ObfuscatedName("client.hy")
    public static int field1009 = 0;

    @ObfuscatedName("client.hw")
    public static int field1010 = 50;

    @ObfuscatedName("client.hc")
    public static int[] field1011 = new int[field1010];

    @ObfuscatedName("client.hm")
    public static int[] field1106 = new int[field1010];

    @ObfuscatedName("client.hf")
    public static int[] field1013 = new int[field1010];

    @ObfuscatedName("client.hg")
    public static int[] field1039 = new int[field1010];

    @ObfuscatedName("client.hn")
    public static int[] field983 = new int[field1010];

    @ObfuscatedName("client.hs")
    public static int[] field1018 = new int[field1010];

    @ObfuscatedName("client.ht")
    public static int[] field1086 = new int[field1010];

    @ObfuscatedName("client.hp")
    public static String[] field969 = new String[field1010];

    @ObfuscatedName("client.ha")
    public static int[][] field1019 = new int[104][104];

    @ObfuscatedName("client.hq")
    public static int field1020 = 0;

    @ObfuscatedName("client.hd")
    public static int field1021 = -1;

    @ObfuscatedName("client.hv")
    public static int field1164 = -1;

    @ObfuscatedName("client.hh")
    public static int field1023 = 0;

    @ObfuscatedName("client.ij")
    public static int field971 = 0;

    @ObfuscatedName("client.is")
    public static int field1025 = 0;

    @ObfuscatedName("client.id")
    public static int field1196 = 0;

    @ObfuscatedName("client.it")
    public static String field989 = null;

    @ObfuscatedName("client.il")
    public static int field1027 = 0;

    @ObfuscatedName("client.ig")
    public static int field1028 = 0;

    @ObfuscatedName("client.if")
    public static int field1029 = 0;

    @ObfuscatedName("client.iq")
    public static int field1030 = 0;

    @ObfuscatedName("client.ik")
    public static int field997 = 0;

    @ObfuscatedName("client.ie")
    public static int field1032 = 0;

    @ObfuscatedName("client.ip")
    public static boolean field1033 = false;

    @ObfuscatedName("client.ir")
    public static int field1034 = 0;

    @ObfuscatedName("client.iu")
    public static int field1035 = 0;

    @ObfuscatedName("client.iy")
    public static class75[] field1036 = new class75[2048];

    @ObfuscatedName("client.iv")
    public static int field1037 = -1;

    @ObfuscatedName("client.im")
    public static int field1147 = 0;

    @ObfuscatedName("client.ic")
    public static int field951 = 0;

    @ObfuscatedName("client.ih")
    public static int[] field1040 = new int[1000];

    @ObfuscatedName("client.jj")
    public static final int[] field949 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jb")
    public static String[] field1042 = new String[8];

    @ObfuscatedName("client.jz")
    public static boolean[] field1043 = new boolean[8];

    @ObfuscatedName("client.jn")
    public static int[] field1044 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jk")
    public static int field1045 = -1;

    @ObfuscatedName("client.ji")
    public static class194[][][] field1046 = new class194[4][104][104];

    @ObfuscatedName("client.jl")
    public static class194 field1047 = new class194();

    @ObfuscatedName("client.jr")
    public static class194 field1048 = new class194();

    @ObfuscatedName("client.ja")
    public static class194 field1049 = new class194();

    @ObfuscatedName("client.js")
    public static int[] field1171 = new int[25];

    @ObfuscatedName("client.jm")
    public static int[] field1051 = new int[25];

    @ObfuscatedName("client.jx")
    public static int[] field1012 = new int[25];

    @ObfuscatedName("client.ju")
    public static int field1053 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field1054 = false;

    @ObfuscatedName("client.jv")
    public static int field1055 = 0;

    @ObfuscatedName("client.jh")
    public static int[] field1056 = new int[500];

    @ObfuscatedName("client.jf")
    public static int[] field998 = new int[500];

    @ObfuscatedName("client.jc")
    public static int[] field1105 = new int[500];

    @ObfuscatedName("client.je")
    public static int[] field1059 = new int[500];

    @ObfuscatedName("client.jp")
    public static String[] field1158 = new String[500];

    @ObfuscatedName("client.kb")
    public static String[] field924 = new String[500];

    @ObfuscatedName("client.kv")
    public static boolean field1062 = false;

    @ObfuscatedName("client.ki")
    public static int field1063 = -1;

    @ObfuscatedName("client.kg")
    public static boolean field1180 = false;

    @ObfuscatedName("client.ks")
    public static int field1065 = -1;

    @ObfuscatedName("client.ky")
    public static int field1061 = -1;

    @ObfuscatedName("client.kl")
    public static int field1119 = 0;

    @ObfuscatedName("client.kq")
    public static int field1095 = 50;

    @ObfuscatedName("client.kh")
    public static int field1069 = 0;

    @ObfuscatedName("client.kd")
    public static boolean field1072 = false;

    @ObfuscatedName("client.kp")
    public static int field1073 = -1;

    @ObfuscatedName("client.km")
    public static int field1074 = -1;

    @ObfuscatedName("client.ka")
    public static String field1075 = null;

    @ObfuscatedName("client.kj")
    public static String field1076 = null;

    @ObfuscatedName("client.kf")
    public static int field993 = -1;

    @ObfuscatedName("client.kz")
    public static class191 field1135 = new class191(8);

    @ObfuscatedName("client.kk")
    public static int field1079 = 0;

    @ObfuscatedName("client.kw")
    public static int field1080 = 0;

    @ObfuscatedName("client.kx")
    public static class217 field1148 = null;

    @ObfuscatedName("client.li")
    public static int field1007 = 0;

    @ObfuscatedName("client.lp")
    public static int field1198 = 0;

    @ObfuscatedName("client.lm")
    public static int field1133 = 0;

    @ObfuscatedName("client.ls")
    public static int field1026 = -1;

    @ObfuscatedName("client.lv")
    public static boolean field1041 = false;

    @ObfuscatedName("client.lr")
    public static boolean field1087 = false;

    @ObfuscatedName("client.lx")
    public static boolean field1088 = false;

    @ObfuscatedName("client.la")
    public static class217 field1089 = null;

    @ObfuscatedName("client.lb")
    public static class217 field1090 = null;

    @ObfuscatedName("client.lh")
    public static class217 field974 = null;

    @ObfuscatedName("client.lw")
    public static int field1092 = 0;

    @ObfuscatedName("client.ld")
    public static int field1093 = 0;

    @ObfuscatedName("client.lt")
    public static class217 field1094 = null;

    @ObfuscatedName("client.lq")
    public static boolean field928 = false;

    @ObfuscatedName("client.ll")
    public static int field1096 = -1;

    @ObfuscatedName("client.lk")
    public static int field1097 = -1;

    @ObfuscatedName("client.lz")
    public static boolean field1098 = false;

    @ObfuscatedName("client.ly")
    public static int field1099 = -1;

    @ObfuscatedName("client.lo")
    public static int field1100 = -1;

    @ObfuscatedName("client.lu")
    public static boolean field1101 = false;

    @ObfuscatedName("client.le")
    public static int field1111 = 1;

    @ObfuscatedName("client.mx")
    public static int[] field1103 = new int[32];

    @ObfuscatedName("client.mm")
    public static int field1104 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field930 = new int[32];

    @ObfuscatedName("client.mw")
    public static int field925 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field1107 = new int[32];

    @ObfuscatedName("client.md")
    public static int field1121 = 0;

    @ObfuscatedName("client.mf")
    public static int field933 = 0;

    @ObfuscatedName("client.mc")
    public static int field1110 = 0;

    @ObfuscatedName("client.mq")
    public static int field1014 = 0;

    @ObfuscatedName("client.mp")
    public static int field1112 = 0;

    @ObfuscatedName("client.mj")
    public static int field1113 = 0;

    @ObfuscatedName("client.mv")
    public static int field1114 = 0;

    @ObfuscatedName("client.mo")
    public static int field941 = 0;

    @ObfuscatedName("client.mb")
    public static class194 field1116 = new class194();

    @ObfuscatedName("client.mh")
    public static class194 field1117 = new class194();

    @ObfuscatedName("client.ml")
    public static class194 field1118 = new class194();

    @ObfuscatedName("client.mu")
    public static class191 field936 = new class191(512);

    @ObfuscatedName("client.my")
    public static int field1120 = 0;

    @ObfuscatedName("client.mr")
    public static int field1068 = -2;

    @ObfuscatedName("client.mt")
    public static boolean[] field1122 = new boolean[100];

    @ObfuscatedName("client.ma")
    public static boolean[] field1123 = new boolean[100];

    @ObfuscatedName("client.ms")
    public static boolean[] field1124 = new boolean[100];

    @ObfuscatedName("client.na")
    public static int[] field1125 = new int[100];

    @ObfuscatedName("client.nq")
    public static int[] field1067 = new int[100];

    @ObfuscatedName("client.ne")
    public static int[] field1127 = new int[100];

    @ObfuscatedName("client.nr")
    public static int[] field1128 = new int[100];

    @ObfuscatedName("client.ni")
    public static int field1129 = 0;

    @ObfuscatedName("client.ng")
    public static long field947 = 0L;

    @ObfuscatedName("client.np")
    public static boolean field1131 = true;

    @ObfuscatedName("client.nd")
    public static int[] field1064 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nc")
    public static int field939 = 0;

    @ObfuscatedName("client.nh")
    public static int field1134 = 0;

    @ObfuscatedName("client.nt")
    public static String field1015 = "";

    @ObfuscatedName("client.nx")
    public static long[] field1136 = new long[100];

    @ObfuscatedName("client.nz")
    public static int field1175 = 0;

    @ObfuscatedName("client.nu")
    public static int field1138 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field1139 = new int[128];

    @ObfuscatedName("client.ns")
    public static int[] field1140 = new int[128];

    @ObfuscatedName("client.nf")
    public static long field1141 = -1L;

    @ObfuscatedName("client.oy")
    public static String field1142 = null;

    @ObfuscatedName("client.of")
    public static String field1143 = null;

    @ObfuscatedName("client.on")
    public static int field1145 = -1;

    @ObfuscatedName("client.or")
    public static int field1146 = 0;

    @ObfuscatedName("client.oi")
    public static int[] field1115 = new int[1000];

    @ObfuscatedName("client.od")
    public static int[] field1066 = new int[1000];

    @ObfuscatedName("client.og")
    public static class286[] field1149 = new class286[1000];

    @ObfuscatedName("client.oh")
    public static int field1150 = 0;

    @ObfuscatedName("client.oc")
    public static int field1157 = 0;

    @ObfuscatedName("client.om")
    public static int field1017 = 0;

    @ObfuscatedName("client.oa")
    public static int field1031 = 255;

    @ObfuscatedName("client.ox")
    public static int field1154 = -1;

    @ObfuscatedName("client.op")
    public static boolean field1155 = false;

    @ObfuscatedName("client.ob")
    public static int field1156 = 127;

    @ObfuscatedName("client.oq")
    public static int field1006 = 127;

    @ObfuscatedName("client.po")
    public static int field1078 = 0;

    @ObfuscatedName("client.pm")
    public static int[] field1159 = new int[50];

    @ObfuscatedName("client.pc")
    public static int[] field1160 = new int[50];

    @ObfuscatedName("client.pj")
    public static int[] field1050 = new int[50];

    @ObfuscatedName("client.pe")
    public static int[] field1102 = new int[50];

    @ObfuscatedName("client.pl")
    public static class106[] field1163 = new class106[50];

    @ObfuscatedName("client.pq")
    public static boolean field988 = false;

    @ObfuscatedName("client.pz")
    public static boolean[] field1165 = new boolean[5];

    @ObfuscatedName("client.py")
    public static int[] field1166 = new int[5];

    @ObfuscatedName("client.ps")
    public static int[] field1191 = new int[5];

    @ObfuscatedName("client.qj")
    public static int[] field1168 = new int[5];

    @ObfuscatedName("client.qe")
    public static int[] field1169 = new int[5];

    @ObfuscatedName("client.qb")
    public static short field1170 = 256;

    @ObfuscatedName("client.qm")
    public static short field1058 = 205;

    @ObfuscatedName("client.qx")
    public static short field1038 = 256;

    @ObfuscatedName("client.qc")
    public static short field1173 = 320;

    @ObfuscatedName("client.qr")
    public static short field1174 = 1;

    @ObfuscatedName("client.qt")
    public static short field1193 = 32767;

    @ObfuscatedName("client.qs")
    public static short field1176 = 1;

    @ObfuscatedName("client.qd")
    public static short field976 = 32767;

    @ObfuscatedName("client.qy")
    public static int field1178 = 0;

    @ObfuscatedName("client.qq")
    public static int field1151 = 0;

    @ObfuscatedName("client.qa")
    public static int field942 = 0;

    @ObfuscatedName("client.qh")
    public static int field935 = 0;

    @ObfuscatedName("client.qu")
    public static int field1060 = 0;

    @ObfuscatedName("client.qz")
    public static int field1183 = 0;

    @ObfuscatedName("client.qv")
    public static int field1184 = 0;

    @ObfuscatedName("client.qo")
    public static class66[] field1185 = new class66[400];

    @ObfuscatedName("client.qw")
    public static class196 field1186 = new class196();

    @ObfuscatedName("client.qp")
    public static int field1187 = 0;

    @ObfuscatedName("client.qi")
    public static class71[] field1188 = new class71[400];

    @ObfuscatedName("client.qn")
    public static class214 field1189 = new class214();

    @ObfuscatedName("client.qk")
    public static int field1190 = -1;

    @ObfuscatedName("client.qg")
    public static int field1182 = -1;

    @ObfuscatedName("client.rj")
    public static class17[] field1192 = new class17[8];

    @ObfuscatedName("client.rr")
    public static long field1070 = -1L;

    @ObfuscatedName("client.ry")
    public static long field1194 = -1L;

    @ObfuscatedName("client.rz")
    public static final class74 field1195 = new class74();

    @ObfuscatedName("client.ru")
    public static int[] field1071 = new int[50];

    @ObfuscatedName("client.ro")
    public static int[] field1197 = new int[50];

    @ObfuscatedName("aw.ef(B)Lkt;")
    public static class289 method242() {
        return Statics.field2147;
    }

    @ObfuscatedName("client.ap(B)V")
    public final void method874() {
    }

    public final void init() {
        if (!this.method756()) {
            return;
        }
        class275[] var1 = new class275[] { class275.field3725, class275.field3718, class275.field3727, class275.field3728, class275.field3726, class275.field3719, class275.field3717, class275.field3724, class275.field3722, class275.field3714, class275.field3715, class275.field3716, class275.field3720, class275.field3721, class275.field3723 };
        class275[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3729);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3729)) {
                    case 1:
                        Statics.field1490 = class232.method2695(Integer.parseInt(var5));
                    case 2:
                    case 12:
                    case 13:
                    default:
                        break;
                    case 3:
                        Statics.field599 = var5;
                        break;
                    case 4:
                        Statics.field2549 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field916 = Integer.parseInt(var5);
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class89.field1396)) {
                        }
                        break;
                    case 7:
                        Statics.field2593 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class89.field1396)) {
                            field918 = true;
                        } else {
                            field918 = false;
                        }
                        break;
                    case 9:
                        Statics.field2214 = var5;
                        break;
                    case 10:
                        field920 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field987 = Integer.parseInt(var5);
                        break;
                    case 14:
                        field914 = Integer.parseInt(var5);
                        break;
                    case 15:
                        class233[] var6 = new class233[] { class233.field3195, class233.field3199, class233.field3194, class233.field3197, class233.field3196, class233.field3192 };
                        Statics.field917 = (class233) class169.method1611(var6, Integer.parseInt(var5));
                        if (Statics.field917 == class233.field3197) {
                            Statics.field282 = class290.field3848;
                        } else {
                            Statics.field282 = class290.field3856;
                        }
                }
            }
        }
        class140.field2116 = false;
        field919 = false;
        Statics.field2140 = this.getCodeBase().getHost();
        String var7 = Statics.field1490.field3185;
        byte var8 = 0;
        try {
            class156.method62("oldschool", var7, var8, 17);
        } catch (Exception var10) {
            class153.method1609((String) null, var10);
        }
        Statics.field591 = this;
        this.method754(765, 503, 144);
    }

    @ObfuscatedName("client.am(I)V")
    public final void method762() {
        Statics.field507 = field916 == 0 ? 43594 : field914 + 40000;
        Statics.field2424 = field916 == 0 ? 443 : field914 + 50000;
        Statics.field804 = Statics.field507;
        Statics.field2628 = class215.field2635;
        Statics.field2622 = class215.field2634;
        Statics.field2612 = class215.field2637;
        Statics.field3672 = class215.field2636;
        this.method784();
        this.method750();
        Statics.field313 = this.method746();
        Statics.field659 = new class161(255, class156.field2255, class156.field2260, 500000);
        class125 var1 = null;
        class82 var2 = new class82();
        try {
            var1 = class156.method2821("", Statics.field917.field3198, false);
            byte[] var3 = new byte[(int) var1.method2179()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2178(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class82(new class174(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method2177();
            }
        } catch (Exception var9) {
        }
        Statics.field802 = var2;
        this.method834();
        class57.method88(this, Statics.field1386);
        if (field916 != 0) {
            field929 = true;
        }
        method1712(Statics.field802.field1318);
    }

    @ObfuscatedName("client.ac(B)V")
    public final void method837() {
        field923++;
        this.method1046();
        while (true) {
            class194 var1 = class237.field3234;
            class234 var2;
            synchronized (class237.field3234) {
                var2 = (class234) class237.field3235.method3354();
            }
            if (var2 == null) {
                class204.method2400();
                method190();
                class51 var4 = class51.field627;
                synchronized (class51.field627) {
                    class51.field636++;
                    class51.field633 = class51.field634;
                    class51.field632 = 0;
                    if (class51.field628 >= 0) {
                        while (class51.field631 != class51.field628) {
                            int var6 = class51.field620[class51.field631];
                            class51.field631 = class51.field631 + 1 & 0x7F;
                            if (var6 < 0) {
                                class51.field625[~var6] = false;
                            } else {
                                if (!class51.field625[var6] && class51.field632 < class51.field630.length - 1) {
                                    class51.field630[++class51.field632 - 1] = var6;
                                }
                                class51.field625[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class51.field625[var5] = false;
                        }
                        class51.field628 = class51.field631;
                    }
                    if (class51.field632 > 0) {
                        class51.field636 = 0;
                    }
                    class51.field634 = class51.field639;
                }
                class60.method2902();
                if (Statics.field313 != null) {
                    int var8 = Statics.field313.method631();
                    field941 = var8;
                }
                if (field970 == 0) {
                    Statics.method2692();
                    Statics.field704.method2698();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field688[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field689[var10] = 0L;
                    }
                    Statics.field710 = 0;
                } else if (field970 == 5) {
                    class93.method49(this);
                    Statics.method2692();
                    Statics.field704.method2698();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field688[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field689[var12] = 0L;
                    }
                    Statics.field710 = 0;
                } else if (field970 == 10 || field970 == 11) {
                    class93.method49(this);
                } else if (field970 == 20) {
                    class93.method49(this);
                    this.method1049();
                } else if (field970 == 25) {
                    method2689(false);
                    field1081 = 0;
                    boolean var13 = true;
                    for (int var14 = 0; var14 < Statics.field522.length; var14++) {
                        if (Statics.field583[var14] != -1 && Statics.field522[var14] == null) {
                            Statics.field522[var14] = Statics.field1225.method3880(Statics.field583[var14], 0);
                            if (Statics.field522[var14] == null) {
                                var13 = false;
                                field1081++;
                            }
                        }
                        if (Statics.field422[var14] != -1 && Statics.field249[var14] == null) {
                            Statics.field249[var14] = Statics.field1225.method3831(Statics.field422[var14], 0, Statics.field734[var14]);
                            if (Statics.field249[var14] == null) {
                                var13 = false;
                                field1081++;
                            }
                        }
                    }
                    if (var13) {
                        field972 = 0;
                        boolean var15 = true;
                        for (int var16 = 0; var16 < Statics.field522.length; var16++) {
                            byte[] var17 = Statics.field249[var16];
                            if (var17 != null) {
                                int var18 = (Statics.field326[var16] >> 8) * 64 - Statics.field749;
                                int var19 = (Statics.field326[var16] & 0xFF) * 64 - Statics.field357;
                                if (field1083) {
                                    var18 = 10;
                                    var19 = 10;
                                }
                                boolean var21 = true;
                                class174 var22 = new class174(var17);
                                int var23 = -1;
                                label629: while (true) {
                                    int var24 = var22.method2934();
                                    if (var24 == 0) {
                                        var15 &= var21;
                                        break;
                                    }
                                    var23 += var24;
                                    int var25 = 0;
                                    boolean var26 = false;
                                    while (true) {
                                        while (!var26) {
                                            int var28 = var22.method2934();
                                            if (var28 == 0) {
                                                continue label629;
                                            }
                                            var25 += var28 - 1;
                                            int var29 = var25 & 0x3F;
                                            int var30 = var25 >> 6 & 0x3F;
                                            int var31 = var22.method2925() >> 2;
                                            int var32 = var18 + var30;
                                            int var33 = var19 + var29;
                                            if (var32 > 0 && var33 > 0 && var32 < 103 && var33 < 103) {
                                                class256 var34 = class256.method937(var23);
                                                if (var31 != 22 || !field919 || var34.field3465 != 0 || var34.field3460 == 1 || var34.field3477) {
                                                    if (!var34.method4233()) {
                                                        field972++;
                                                        var21 = false;
                                                    }
                                                    var26 = true;
                                                }
                                            }
                                        }
                                        int var27 = var22.method2934();
                                        if (var27 == 0) {
                                            break;
                                        }
                                        var22.method2925();
                                    }
                                }
                            }
                        }
                        if (var15) {
                            if (field1181 != 0) {
                                method2750(class226.field2864 + class89.field1394 + class89.field1391 + 100 + "%" + class89.field1392, true);
                            }
                            method190();
                            method1710();
                            method190();
                            Statics.field752.method2484();
                            method190();
                            System.gc();
                            for (int var36 = 0; var36 < 4; var36++) {
                                field975[var36].method2782();
                            }
                            for (int var37 = 0; var37 < 4; var37++) {
                                for (int var38 = 0; var38 < 104; var38++) {
                                    for (int var39 = 0; var39 < 104; var39++) {
                                        class62.field737[var37][var38][var39] = 0;
                                    }
                                }
                            }
                            method190();
                            class62.method156();
                            int var40 = Statics.field522.length;
                            for (class83 var41 = (class83) class83.field1326.method3372(); var41 != null; var41 = (class83) class83.field1326.method3358()) {
                                if (var41.field1331 != null) {
                                    Statics.field614.method1732(var41.field1331);
                                    var41.field1331 = null;
                                }
                                if (var41.field1336 != null) {
                                    Statics.field614.method1732(var41.field1336);
                                    var41.field1336 = null;
                                }
                            }
                            class83.field1326.method3351();
                            method2689(true);
                            if (!field1083) {
                                for (int var42 = 0; var42 < var40; var42++) {
                                    int var43 = (Statics.field326[var42] >> 8) * 64 - Statics.field749;
                                    int var44 = (Statics.field326[var42] & 0xFF) * 64 - Statics.field357;
                                    byte[] var45 = Statics.field522[var42];
                                    if (var45 != null) {
                                        method190();
                                        class62.method15(var45, var43, var44, Statics.field477 * 8 - 48, Statics.field1492 * 8 - 48, field975);
                                    }
                                }
                                for (int var46 = 0; var46 < var40; var46++) {
                                    int var47 = (Statics.field326[var46] >> 8) * 64 - Statics.field749;
                                    int var48 = (Statics.field326[var46] & 0xFF) * 64 - Statics.field357;
                                    byte[] var49 = Statics.field522[var46];
                                    if (var49 == null && Statics.field1492 < 800) {
                                        method190();
                                        class62.method192(var47, var48, 64, 64);
                                    }
                                }
                                method2689(true);
                                for (int var50 = 0; var50 < var40; var50++) {
                                    byte[] var51 = Statics.field249[var50];
                                    if (var51 != null) {
                                        int var52 = (Statics.field326[var50] >> 8) * 64 - Statics.field749;
                                        int var53 = (Statics.field326[var50] & 0xFF) * 64 - Statics.field357;
                                        method190();
                                        class140 var54 = Statics.field752;
                                        class162[] var55 = field975;
                                        class174 var56 = new class174(var51);
                                        int var57 = -1;
                                        while (true) {
                                            int var58 = var56.method2934();
                                            if (var58 == 0) {
                                                break;
                                            }
                                            var57 += var58;
                                            int var59 = 0;
                                            while (true) {
                                                int var60 = var56.method2934();
                                                if (var60 == 0) {
                                                    break;
                                                }
                                                var59 += var60 - 1;
                                                int var61 = var59 & 0x3F;
                                                int var62 = var59 >> 6 & 0x3F;
                                                int var63 = var59 >> 12;
                                                int var64 = var56.method2925();
                                                int var65 = var64 >> 2;
                                                int var66 = var64 & 0x3;
                                                int var67 = var52 + var62;
                                                int var68 = var53 + var61;
                                                if (var67 > 0 && var68 > 0 && var67 < 103 && var68 < 103) {
                                                    int var69 = var63;
                                                    if ((class62.field737[1][var67][var68] & 0x2) == 2) {
                                                        var69 = var63 - 1;
                                                    }
                                                    class162 var70 = null;
                                                    if (var69 >= 0) {
                                                        var70 = var55[var69];
                                                    }
                                                    class62.method182(var63, var67, var68, var57, var66, var65, var54, var70);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field1083) {
                                int var71 = 0;
                                label528: while (true) {
                                    if (var71 >= 4) {
                                        for (int var89 = 0; var89 < 13; var89++) {
                                            for (int var90 = 0; var90 < 13; var90++) {
                                                int var91 = field977[0][var89][var90];
                                                if (var91 == -1) {
                                                    class62.method192(var89 * 8, var90 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2689(true);
                                        int var92 = 0;
                                        while (true) {
                                            if (var92 >= 4) {
                                                break label528;
                                            }
                                            method190();
                                            for (int var93 = 0; var93 < 13; var93++) {
                                                label451: for (int var94 = 0; var94 < 13; var94++) {
                                                    int var95 = field977[var92][var93][var94];
                                                    if (var95 != -1) {
                                                        int var96 = var95 >> 24 & 0x3;
                                                        int var97 = var95 >> 1 & 0x3;
                                                        int var98 = var95 >> 14 & 0x3FF;
                                                        int var99 = var95 >> 3 & 0x7FF;
                                                        int var100 = (var98 / 8 << 8) + var99 / 8;
                                                        for (int var101 = 0; var101 < Statics.field326.length; var101++) {
                                                            if (Statics.field326[var101] == var100 && Statics.field249[var101] != null) {
                                                                byte[] var102 = Statics.field249[var101];
                                                                int var103 = var93 * 8;
                                                                int var104 = var94 * 8;
                                                                int var105 = (var98 & 0x7) * 8;
                                                                int var106 = (var99 & 0x7) * 8;
                                                                class140 var107 = Statics.field752;
                                                                class162[] var108 = field975;
                                                                class174 var109 = new class174(var102);
                                                                int var110 = -1;
                                                                while (true) {
                                                                    int var111 = var109.method2934();
                                                                    if (var111 == 0) {
                                                                        continue label451;
                                                                    }
                                                                    var110 += var111;
                                                                    int var112 = 0;
                                                                    while (true) {
                                                                        int var113 = var109.method2934();
                                                                        if (var113 == 0) {
                                                                            break;
                                                                        }
                                                                        var112 += var113 - 1;
                                                                        int var114 = var112 & 0x3F;
                                                                        int var115 = var112 >> 6 & 0x3F;
                                                                        int var116 = var112 >> 12;
                                                                        int var117 = var109.method2925();
                                                                        int var118 = var117 >> 2;
                                                                        int var119 = var117 & 0x3;
                                                                        if (var96 == var116 && var115 >= var105 && var115 < var105 + 8 && var114 >= var106 && var114 < var106 + 8) {
                                                                            class256 var120 = class256.method937(var110);
                                                                            int var121 = var103 + class216.method2903(var115 & 0x7, var114 & 0x7, var97, var120.field3458, var120.field3446, var119);
                                                                            int var123 = var115 & 0x7;
                                                                            int var124 = var114 & 0x7;
                                                                            int var126 = var120.field3458;
                                                                            int var127 = var120.field3446;
                                                                            if ((var119 & 0x1) == 1) {
                                                                                int var128 = var126;
                                                                                var126 = var127;
                                                                                var127 = var128;
                                                                            }
                                                                            int var129 = var97 & 0x3;
                                                                            int var130;
                                                                            if (var129 == 0) {
                                                                                var130 = var124;
                                                                            } else if (var129 == 1) {
                                                                                var130 = 7 - var123 - (var126 - 1);
                                                                            } else if (var129 == 2) {
                                                                                var130 = 7 - var124 - (var127 - 1);
                                                                            } else {
                                                                                var130 = var123;
                                                                            }
                                                                            int var131 = var104 + var130;
                                                                            if (var121 > 0 && var131 > 0 && var121 < 103 && var131 < 103) {
                                                                                int var132 = var92;
                                                                                if ((class62.field737[1][var121][var131] & 0x2) == 2) {
                                                                                    var132 = var92 - 1;
                                                                                }
                                                                                class162 var133 = null;
                                                                                if (var132 >= 0) {
                                                                                    var133 = var108[var132];
                                                                                }
                                                                                class62.method182(var92, var121, var131, var110, var97 + var119 & 0x3, var118, var107, var133);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var92++;
                                        }
                                    }
                                    method190();
                                    for (int var72 = 0; var72 < 13; var72++) {
                                        for (int var73 = 0; var73 < 13; var73++) {
                                            boolean var74 = false;
                                            int var75 = field977[var71][var72][var73];
                                            if (var75 != -1) {
                                                int var76 = var75 >> 24 & 0x3;
                                                int var77 = var75 >> 1 & 0x3;
                                                int var78 = var75 >> 14 & 0x3FF;
                                                int var79 = var75 >> 3 & 0x7FF;
                                                int var80 = (var78 / 8 << 8) + var79 / 8;
                                                for (int var81 = 0; var81 < Statics.field326.length; var81++) {
                                                    if (Statics.field326[var81] == var80 && Statics.field522[var81] != null) {
                                                        class62.method616(Statics.field522[var81], var71, var72 * 8, var73 * 8, var76, (var78 & 0x7) * 8, (var79 & 0x7) * 8, var77, field975);
                                                        var74 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var74) {
                                                int var82 = var71;
                                                int var83 = var72 * 8;
                                                int var84 = var73 * 8;
                                                for (int var85 = 0; var85 < 8; var85++) {
                                                    for (int var86 = 0; var86 < 8; var86++) {
                                                        class62.field748[var82][var83 + var85][var84 + var86] = 0;
                                                    }
                                                }
                                                if (var83 > 0) {
                                                    for (int var87 = 1; var87 < 8; var87++) {
                                                        class62.field748[var82][var83][var84 + var87] = class62.field748[var82][var83 - 1][var84 + var87];
                                                    }
                                                }
                                                if (var84 > 0) {
                                                    for (int var88 = 1; var88 < 8; var88++) {
                                                        class62.field748[var82][var83 + var88][var84] = class62.field748[var82][var83 + var88][var84 - 1];
                                                    }
                                                }
                                                if (var83 > 0 && class62.field748[var82][var83 - 1][var84] != 0) {
                                                    class62.field748[var82][var83][var84] = class62.field748[var82][var83 - 1][var84];
                                                } else if (var84 > 0 && class62.field748[var82][var83][var84 - 1] != 0) {
                                                    class62.field748[var82][var83][var84] = class62.field748[var82][var83][var84 - 1];
                                                } else if (var83 > 0 && var84 > 0 && class62.field748[var82][var83 - 1][var84 - 1] != 0) {
                                                    class62.field748[var82][var83][var84] = class62.field748[var82][var83 - 1][var84 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var71++;
                                }
                            }
                            method2689(true);
                            method1710();
                            method190();
                            class62.method179(Statics.field752, field975);
                            method2689(true);
                            int var134 = class62.field738;
                            if (var134 > Statics.field1449) {
                                var134 = Statics.field1449;
                            }
                            if (var134 < Statics.field1449 - 1) {
                                int var135 = Statics.field1449 - 1;
                            }
                            if (field919) {
                                Statics.field752.method2517(class62.field738);
                            } else {
                                Statics.field752.method2517(0);
                            }
                            for (int var136 = 0; var136 < 104; var136++) {
                                for (int var137 = 0; var137 < 104; var137++) {
                                    method4453(var136, var137);
                                }
                            }
                            method190();
                            method656();
                            class256.field3468.method3286();
                            if (Statics.field591.method775()) {
                                field957.method3159(116);
                                field957.method2909(1057001181);
                            }
                            if (!field1083) {
                                int var138 = (Statics.field477 - 6) / 8;
                                int var139 = (Statics.field477 + 6) / 8;
                                int var140 = (Statics.field1492 - 6) / 8;
                                int var141 = (Statics.field1492 + 6) / 8;
                                for (int var142 = var138 - 1; var142 <= var139 + 1; var142++) {
                                    for (int var143 = var140 - 1; var143 <= var141 + 1; var143++) {
                                        if (var142 < var138 || var142 > var139 || var143 < var140 || var143 > var141) {
                                            Statics.field1225.method3852("m" + var142 + "_" + var143);
                                            Statics.field1225.method3852("l" + var142 + "_" + var143);
                                        }
                                    }
                                }
                            }
                            method9(30);
                            method190();
                            Statics.field3212 = (byte[][][]) null;
                            Statics.field740 = (byte[][][]) null;
                            Statics.field352 = (byte[][][]) null;
                            Statics.field755 = (byte[][][]) null;
                            Statics.field644 = (int[][][]) null;
                            Statics.field262 = (byte[][][]) null;
                            Statics.field741 = (int[][]) null;
                            Statics.field2264 = null;
                            Statics.field742 = null;
                            Statics.field743 = null;
                            Statics.field570 = null;
                            Statics.field744 = null;
                            field957.method3159(174);
                            Statics.field704.method2698();
                            for (int var144 = 0; var144 < 32; var144++) {
                                field688[var144] = 0L;
                            }
                            for (int var145 = 0; var145 < 32; var145++) {
                                field689[var145] = 0L;
                            }
                            Statics.field710 = 0;
                        } else {
                            field1181 = 2;
                        }
                    } else {
                        field1181 = 1;
                    }
                }
                if (field970 == 30) {
                    this.method1050();
                } else if (field970 == 40 || field970 == 45) {
                    this.method1049();
                }
                return;
            }
            var2.field3203.method3941(var2.field3202, (int) var2.field2483, var2.field3201, false);
        }
    }

    @ObfuscatedName("client.ax(ZI)V")
    public final void method829(boolean arg0) {
        boolean var2;
        label138: {
            try {
                if (class204.field2516 == 2) {
                    if (Statics.field2609 == null) {
                        Statics.field2609 = class210.method3654(Statics.field2517, Statics.field2276, Statics.field3731);
                        if (Statics.field2609 == null) {
                            var2 = false;
                            break label138;
                        }
                    }
                    if (Statics.field329 == null) {
                        Statics.field329 = new class113(Statics.field2514, Statics.field2513);
                    }
                    if (Statics.field2518.method3513(Statics.field2609, Statics.field2515, Statics.field329, 22050)) {
                        Statics.field2518.method3488();
                        Statics.field2518.method3510(Statics.field1775);
                        Statics.field2518.method3463(Statics.field2609, Statics.field3691);
                        class204.field2516 = 0;
                        Statics.field2609 = null;
                        Statics.field329 = null;
                        Statics.field2517 = null;
                        var2 = true;
                        break label138;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2518.method3477();
                class204.field2516 = 0;
                Statics.field2609 = null;
                Statics.field329 = null;
                Statics.field2517 = null;
            }
            var2 = false;
        }
        if (var2 && field1155 && Statics.field2288 != null) {
            Statics.field2288.method1860();
        }
        if ((field970 == 10 || field970 == 20 || field970 == 30) && field947 != 0L && class176.method2396() > field947) {
            method1712(method2677());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1122[var5] = true;
            }
        }
        if (field970 == 0) {
            this.method770(class93.field1417, class93.field1434, arg0);
        } else if (field970 == 5) {
            class93.method10(Statics.field3289, Statics.field3630, Statics.field818, arg0);
        } else if (field970 == 10 || field970 == 11) {
            class93.method10(Statics.field3289, Statics.field3630, Statics.field818, arg0);
        } else if (field970 == 20) {
            class93.method10(Statics.field3289, Statics.field3630, Statics.field818, arg0);
        } else if (field970 == 25) {
            if (field1181 == 1) {
                if (field1081 > field1152) {
                    field1152 = field1081;
                }
                int var6 = (field1152 * 50 - field1081 * 50) / field1152;
                method2750(class226.field2864 + class89.field1394 + class89.field1391 + var6 + "%" + class89.field1392, false);
            } else if (field1181 == 2) {
                if (field972 > field973) {
                    field973 = field972;
                }
                int var7 = (field973 * 50 - field972 * 50) / field973 + 50;
                method2750(class226.field2864 + class89.field1394 + class89.field1391 + var7 + "%" + class89.field1392, false);
            } else {
                method2750(class226.field2864, false);
            }
        } else if (field970 == 30) {
            this.method1052();
        } else if (field970 == 40) {
            method2750(class226.field2865 + class89.field1394 + class226.field2866, false);
        } else if (field970 == 45) {
            method2750(class226.field3029, false);
        }
        if (field970 == 30 && field1129 == 0 && !arg0) {
            for (int var8 = 0; var8 < field1120; var8++) {
                if (field1123[var8]) {
                    Statics.field602.method740(field1125[var8], field1067[var8], field1127[var8], field1128[var8]);
                    field1123[var8] = false;
                }
            }
        } else if (field970 > 0) {
            Statics.field602.method727(0, 0);
            for (int var9 = 0; var9 < field1120; var9++) {
                field1123[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.av(B)V")
    public final void method769() {
        if (Statics.field1915.method1647()) {
            Statics.field1915.method1644();
        }
        if (Statics.field444 != null) {
            Statics.field444.field850 = false;
        }
        Statics.field444 = null;
        if (Statics.field243 != null) {
            Statics.field243.method2755();
            Statics.field243 = null;
        }
        class51.method133();
        if (class60.field727 != null) {
            class60 var1 = class60.field727;
            synchronized (class60.field727) {
                class60.field727 = null;
            }
        }
        Statics.field313 = null;
        if (Statics.field2288 != null) {
            Statics.field2288.method1894();
        }
        if (Statics.field2251 != null) {
            Statics.field2251.method1894();
        }
        class239.method2904();
        class237.method461();
        class156.method240();
    }

    @ObfuscatedName("j.ej(IB)V")
    public static void method9(int arg0) {
        if (field970 == arg0) {
            return;
        }
        if (field970 == 0) {
            Statics.field591.method771();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field1153 = 0;
            field948 = 0;
            field1130 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2150 != null) {
            Statics.field2150.method2755();
            Statics.field2150 = null;
        }
        if (field970 == 25) {
            field1181 = 0;
            field1081 = 0;
            field1152 = 1;
            field972 = 0;
            field973 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method2316(Statics.field354, Statics.field945, true, 0);
        } else if (arg0 == 20) {
            class93.method2316(Statics.field354, Statics.field945, true, field970 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method2316(Statics.field354, Statics.field945, false, 4);
        } else if (Statics.field1431) {
            Statics.field1419 = null;
            Statics.field821 = null;
            Statics.field1420 = null;
            Statics.field1421 = null;
            Statics.field1422 = null;
            Statics.field846 = null;
            Statics.field2427 = null;
            Statics.field479 = null;
            Statics.field1423 = null;
            Statics.field600 = null;
            Statics.field395 = null;
            Statics.field39 = null;
            Statics.field1406 = null;
            Statics.field837 = null;
            Statics.field642 = null;
            Statics.field2275 = null;
            Statics.field564 = null;
            Statics.field2185 = null;
            Statics.field13 = null;
            Statics.field2287 = null;
            Statics.field510 = null;
            Statics.field861 = null;
            class204.field2516 = 1;
            Statics.field2517 = null;
            Statics.field2276 = -1;
            Statics.field3731 = -1;
            Statics.field1775 = 0;
            Statics.field3691 = false;
            Statics.field2262 = 2;
            class239.method3806(true);
            Statics.field1431 = false;
        }
        field970 = arg0;
    }

    @ObfuscatedName("client.er(S)V")
    public void method1046() {
        if (field970 == 1000) {
            return;
        }
        long var1 = class176.method2396();
        int var3 = (int) (var1 - Statics.field3258);
        Statics.field3258 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class239.field3252 += var3;
        boolean var4;
        if (class239.field3262 == 0 && class239.field3257 == 0 && class239.field3260 == 0 && class239.field3255 == 0) {
            var4 = true;
        } else if (Statics.field3273 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class239.field3252 > 30000) {
                        throw new IOException();
                    }
                    while (class239.field3257 < 20 && class239.field3255 > 0) {
                        class235 var5 = (class235) class239.field3256.method3298();
                        class174 var6 = new class174(4);
                        var6.method2906(1);
                        var6.method2908((int) var5.field2483);
                        Statics.field3273.method2759(var6.field2401, 0, 4);
                        class239.field3269.method3296(var5, var5.field2483);
                        class239.field3255--;
                        class239.field3257++;
                    }
                    while (class239.field3262 < 20 && class239.field3260 > 0) {
                        class235 var7 = (class235) class239.field3254.method3235();
                        class174 var8 = new class174(4);
                        var8.method2906(0);
                        var8.method2908((int) var7.field2483);
                        Statics.field3273.method2759(var8.field2401, 0, 4);
                        var7.method3391();
                        class239.field3261.method3296(var7, var7.field2483);
                        class239.field3260--;
                        class239.field3262++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3273.method2757();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class239.field3252 = 0;
                        byte var11 = 0;
                        if (Statics.field328 == null) {
                            var11 = 8;
                        } else if (class239.field3264 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class239.field3263.field2400;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3273.method2765(class239.field3263.field2401, class239.field3263.field2400, var12);
                            if (class239.field3267 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class239.field3263.field2401[class239.field3263.field2400 + var13] ^= class239.field3267;
                                }
                            }
                            class239.field3263.field2400 += var12;
                            if (class239.field3263.field2400 < var11) {
                                break;
                            }
                            if (Statics.field328 == null) {
                                class239.field3263.field2400 = 0;
                                int var14 = class239.field3263.method2925();
                                int var15 = class239.field3263.method3065();
                                int var16 = class239.field3263.method2925();
                                int var17 = class239.field3263.method3058();
                                long var18 = (long) ((var14 << 16) + var15);
                                class235 var20 = (class235) class239.field3269.method3295(var18);
                                Statics.field1356 = true;
                                if (var20 == null) {
                                    var20 = (class235) class239.field3261.method3295(var18);
                                    Statics.field1356 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field328 = var20;
                                Statics.field2844 = new class174(var17 + var21 + Statics.field328.field3211);
                                Statics.field2844.method2906(var16);
                                Statics.field2844.method2909(var17);
                                class239.field3264 = 8;
                                class239.field3263.field2400 = 0;
                            } else if (class239.field3264 == 0) {
                                if (class239.field3263.field2401[0] == -1) {
                                    class239.field3264 = 1;
                                    class239.field3263.field2400 = 0;
                                } else {
                                    Statics.field328 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2844.field2401.length - Statics.field328.field3211;
                            int var23 = 512 - class239.field3264;
                            if (var23 > var22 - Statics.field2844.field2400) {
                                var23 = var22 - Statics.field2844.field2400;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3273.method2765(Statics.field2844.field2401, Statics.field2844.field2400, var23);
                            if (class239.field3267 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2844.field2401[Statics.field2844.field2400 + var24] ^= class239.field3267;
                                }
                            }
                            Statics.field2844.field2400 += var23;
                            class239.field3264 += var23;
                            if (Statics.field2844.field2400 == var22) {
                                if (Statics.field328.field2483 == 16711935L) {
                                    Statics.field11 = Statics.field2844;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class238 var26 = class239.field3266[var25];
                                        if (var26 != null) {
                                            Statics.field11.field2400 = var25 * 8 + 5;
                                            int var27 = Statics.field11.method3058();
                                            int var28 = Statics.field11.method3058();
                                            var26.method3939(var27, var28);
                                        }
                                    }
                                } else {
                                    class239.field3265.reset();
                                    class239.field3265.update(Statics.field2844.field2401, 0, var22);
                                    int var29 = (int) class239.field3265.getValue();
                                    if (Statics.field328.field3213 != var29) {
                                        try {
                                            Statics.field3273.method2755();
                                        } catch (Exception var35) {
                                        }
                                        class239.field3268++;
                                        Statics.field3273 = null;
                                        class239.field3267 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class239.field3268 = 0;
                                    class239.field3272 = 0;
                                    Statics.field328.field3214.method3940((int) (Statics.field328.field2483 & 0xFFFFL), Statics.field2844.field2401, (Statics.field328.field2483 & 0xFF0000L) == 16711680L, Statics.field1356);
                                }
                                Statics.field328.method3347();
                                if (Statics.field1356) {
                                    class239.field3257--;
                                } else {
                                    class239.field3262--;
                                }
                                class239.field3264 = 0;
                                Statics.field328 = null;
                                Statics.field2844 = null;
                            } else {
                                if (class239.field3264 != 512) {
                                    break;
                                }
                                class239.field3264 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3273.method2755();
                } catch (Exception var34) {
                }
                class239.field3272++;
                Statics.field3273 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1047();
        }
    }

    @ObfuscatedName("client.ec(I)V")
    public void method1047() {
        if (class239.field3268 >= 4) {
            this.method772("js5crc");
            field970 = 1000;
            return;
        }
        if (class239.field3272 >= 4) {
            if (field970 <= 5) {
                this.method772("js5io");
                field970 = 1000;
                return;
            }
            field943 = 3000;
            class239.field3272 = 3;
        }
        if (--field943 + 1 > 0) {
            return;
        }
        try {
            if (field1052 == 0) {
                Statics.field2421 = Statics.field679.method2714(Statics.field2140, Statics.field804);
                field1052++;
            }
            if (field1052 == 1) {
                if (Statics.field2421.field2237 == 2) {
                    this.method1048(-1);
                    return;
                }
                if (Statics.field2421.field2237 == 1) {
                    field1052++;
                }
            }
            if (field1052 == 2) {
                Statics.field323 = new class160((Socket) Statics.field2421.field2241, Statics.field679);
                class174 var1 = new class174(5);
                var1.method2906(15);
                var1.method2909(144);
                Statics.field323.method2759(var1.field2401, 0, 5);
                field1052++;
                Statics.field2519 = class176.method2396();
            }
            if (field1052 == 3) {
                if (field970 <= 5 || Statics.field323.method2757() > 0) {
                    int var2 = Statics.field323.method2756();
                    if (var2 != 0) {
                        this.method1048(var2);
                        return;
                    }
                    field1052++;
                } else if (class176.method2396() - Statics.field2519 > 30000L) {
                    this.method1048(-2);
                    return;
                }
            }
            if (field1052 == 4) {
                class160 var3 = Statics.field323;
                boolean var4 = field970 > 20;
                if (Statics.field3273 != null) {
                    try {
                        Statics.field3273.method2755();
                    } catch (Exception var14) {
                    }
                    Statics.field3273 = null;
                }
                Statics.field3273 = var3;
                class239.method3806(var4);
                class239.field3263.field2400 = 0;
                Statics.field328 = null;
                Statics.field2844 = null;
                class239.field3264 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3269.method3298();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3261.method3298();
                            if (var7 == null) {
                                if (class239.field3267 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2906(4);
                                        var8.method2906(class239.field3267);
                                        var8.method2907(0);
                                        Statics.field3273.method2759(var8.field2401, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3273.method2755();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3272++;
                                        Statics.field3273 = null;
                                    }
                                }
                                class239.field3252 = 0;
                                Statics.field3258 = class176.method2396();
                                Statics.field2421 = null;
                                Statics.field323 = null;
                                field1052 = 0;
                                field946 = 0;
                                return;
                            }
                            class239.field3254.method3224(var7);
                            class239.field3259.method3296(var7, var7.field2483);
                            class239.field3260++;
                            class239.field3262--;
                        }
                    }
                    class239.field3256.method3296(var6, var6.field2483);
                    class239.field3255++;
                    class239.field3257--;
                }
            }
        } catch (IOException var15) {
            this.method1048(-3);
        }
    }

    @ObfuscatedName("client.ex(II)V")
    public void method1048(int arg0) {
        Statics.field2421 = null;
        Statics.field323 = null;
        field1052 = 0;
        if (Statics.field804 == Statics.field507) {
            Statics.field804 = Statics.field2424;
        } else {
            Statics.field804 = Statics.field507;
        }
        field946++;
        if (field946 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field970 <= 5) {
                this.method772("js5connect_full");
                field970 = 1000;
            } else {
                field943 = 3000;
            }
        } else if (field946 >= 2 && arg0 == 6) {
            this.method772("js5connect_outofdate");
            field970 = 1000;
        } else if (field946 >= 4) {
            if (field970 <= 5) {
                this.method772("js5connect");
                field970 = 1000;
            } else {
                field943 = 3000;
            }
        }
    }

    @ObfuscatedName("client.eb(I)V")
    public final void method1049() {
        try {
            if (field1153 == 0) {
                if (Statics.field243 != null) {
                    Statics.field243.method2755();
                    Statics.field243 = null;
                }
                Statics.field3680 = null;
                field968 = false;
                field948 = 0;
                field1153 = 1;
            }
            if (field1153 == 1) {
                if (Statics.field3680 == null) {
                    Statics.field3680 = Statics.field679.method2714(Statics.field2140, Statics.field804);
                }
                if (Statics.field3680.field2237 == 2) {
                    throw new IOException();
                }
                if (Statics.field3680.field2237 == 1) {
                    Statics.field243 = new class160((Socket) Statics.field3680.field2241, Statics.field679);
                    Statics.field3680 = null;
                    field1153 = 2;
                }
            }
            if (field1153 == 2) {
                field957.field2400 = 0;
                field957.method2906(14);
                Statics.field243.method2759(field957.field2401, 0, 1);
                field959.field2400 = 0;
                field1153 = 3;
            }
            if (field1153 == 3) {
                if (Statics.field2288 != null) {
                    Statics.field2288.method1898();
                }
                if (Statics.field2251 != null) {
                    Statics.field2251.method1898();
                }
                int var1 = Statics.field243.method2756();
                if (Statics.field2288 != null) {
                    Statics.field2288.method1898();
                }
                if (Statics.field2251 != null) {
                    Statics.field2251.method1898();
                }
                if (var1 != 0) {
                    method6(var1);
                    return;
                }
                field959.field2400 = 0;
                field1153 = 4;
            }
            if (field1153 == 4) {
                if (field959.field2400 < 8) {
                    int var2 = Statics.field243.method2757();
                    if (var2 > 8 - field959.field2400) {
                        var2 = 8 - field959.field2400;
                    }
                    if (var2 > 0) {
                        Statics.field243.method2765(field959.field2401, field959.field2400, var2);
                        field959.field2400 += var2;
                    }
                }
                if (field959.field2400 == 8) {
                    field959.field2400 = 0;
                    Statics.field376 = field959.method2927();
                    field1153 = 5;
                }
            }
            if (field1153 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field376 >> 32), (int) (Statics.field376 & 0xFFFFFFFFFFFFFFFFL) };
                field957.field2400 = 0;
                field957.method2906(1);
                field957.method2906(class93.field1442.method14());
                field957.method2909(var3[0]);
                field957.method2909(var3[1]);
                field957.method2909(var3[2]);
                field957.method2909(var3[3]);
                switch(class93.field1442.field2207) {
                    case 0:
                    case 1:
                        field957.method2908(Statics.field2412);
                        field957.field2400 += 5;
                        break;
                    case 2:
                        field957.field2400 += 8;
                        break;
                    case 3:
                        field957.method2909((Integer) Statics.field802.field1314.get(class271.method1714(class93.field1440)));
                        field957.field2400 += 4;
                }
                field957.method2912(class93.field1427);
                field957.method2942(class91.field1405, class91.field1407);
                field958.field2400 = 0;
                if (field970 == 40) {
                    field958.method2906(18);
                } else {
                    field958.method2906(16);
                }
                field958.method2907(0);
                int var4 = field958.field2400;
                field958.method2909(144);
                field958.method2989(field957.field2401, 0, field957.field2400);
                int var5 = field958.field2400;
                field958.method2912(class93.field1440);
                field958.method2906((field1131 ? 1 : 0) << 1 | (field919 ? 1 : 0));
                field958.method2907(Statics.field2409);
                field958.method2907(Statics.field22);
                class180 var6 = field958;
                if (field1109 == null) {
                    byte[] var7 = new byte[24];
                    try {
                        class156.field2258.method2146(0L);
                        class156.field2258.method2156(var7);
                        int var8;
                        for (var8 = 0; var8 < 24 && var7[var8] == 0; var8++) {
                        }
                        if (var8 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var43) {
                        for (int var10 = 0; var10 < 24; var10++) {
                            var7[var10] = -1;
                        }
                    }
                    var6.method2989(var7, 0, var7.length);
                } else {
                    var6.method2989(field1109, 0, field1109.length);
                }
                field958.method2912(Statics.field599);
                field958.method2909(Statics.field2549);
                class174 var13 = new class174(Statics.field3184.method5056());
                Statics.field3184.method5055(var13);
                field958.method2989(var13.field2401, 0, var13.field2401.length);
                field958.method2906(Statics.field2593);
                field958.method2909(0);
                field958.method2909(Statics.field841.field3229);
                field958.method2909(Statics.field944.field3229);
                field958.method2909(Statics.field1375.field3229);
                field958.method2909(Statics.field766.field3229);
                field958.method2909(Statics.field656.field3229);
                field958.method2909(Statics.field1225.field3229);
                field958.method2909(Statics.field657.field3229);
                field958.method2909(Statics.field362.field3229);
                field958.method2909(Statics.field945.field3229);
                field958.method2909(Statics.field897.field3229);
                field958.method2909(Statics.field354.field3229);
                field958.method2909(Statics.field3250.field3229);
                field958.method2909(Statics.field1879.field3229);
                field958.method2909(Statics.field3208.field3229);
                field958.method2909(Statics.field754.field3229);
                field958.method2909(Statics.field292.field3229);
                field958.method2909(Statics.field349.field3229);
                field958.method2964(var3, var5, field958.field2400);
                field958.method2917(field958.field2400 - var4);
                Statics.field243.method2759(field958.field2401, 0, field958.field2400);
                field957.method3146(var3);
                for (int var14 = 0; var14 < 4; var14++) {
                    var3[var14] += 50;
                }
                field959.method3146(var3);
                field1153 = 6;
            }
            if (field1153 == 6 && Statics.field243.method2757() > 0) {
                int var15 = Statics.field243.method2756();
                if (var15 == 21 && field970 == 20) {
                    field1153 = 7;
                } else if (var15 == 2) {
                    field1153 = 9;
                } else if (var15 == 15 && field970 == 40) {
                    field960 = -1;
                    field1153 = 13;
                } else if (var15 == 23 && field1130 < 1) {
                    field1130++;
                    field1153 = 0;
                } else if (var15 == 29) {
                    field1153 = 11;
                } else {
                    method6(var15);
                    return;
                }
            }
            if (field1153 == 7 && Statics.field243.method2757() > 0) {
                field950 = (Statics.field243.method2756() + 3) * 60;
                field1153 = 8;
            }
            if (field1153 == 8) {
                field948 = 0;
                class93.method103(class226.field2893, class226.field2894, field950 / 60 + class226.field2915);
                if (--field950 <= 0) {
                    field1153 = 0;
                }
            } else {
                if (field1153 == 9 && Statics.field243.method2757() >= 13) {
                    boolean var16 = Statics.field243.method2756() == 1;
                    Statics.field243.method2765(field959.field2401, 0, 4);
                    field959.field2400 = 0;
                    boolean var17 = false;
                    if (var16) {
                        int var18 = field959.method3148() << 24;
                        int var19 = var18 | field959.method3148() << 16;
                        int var20 = var19 | field959.method3148() << 8;
                        int var21 = var20 | field959.method3148();
                        int var22 = class271.method1714(class93.field1440);
                        if (Statics.field802.field1314.size() >= 10 && !Statics.field802.field1314.containsKey(var22)) {
                            Iterator var23 = Statics.field802.field1314.entrySet().iterator();
                            var23.next();
                            var23.remove();
                        }
                        Statics.field802.field1314.put(var22, var21);
                        class82.method220();
                    }
                    field1133 = Statics.field243.method2756();
                    field1041 = Statics.field243.method2756() == 1;
                    field1037 = Statics.field243.method2756();
                    field1037 <<= 0x8;
                    field1037 += Statics.field243.method2756();
                    field1147 = Statics.field243.method2756();
                    Statics.field243.method2765(field959.field2401, 0, 1);
                    field959.field2400 = 0;
                    field961 = field959.method3148();
                    Statics.field243.method2765(field959.field2401, 0, 2);
                    field959.field2400 = 0;
                    field960 = field959.method3065();
                    try {
                        class53.method671(Statics.field591, "zap");
                    } catch (Throwable var42) {
                    }
                    field1153 = 10;
                }
                if (field1153 != 10) {
                    if (field1153 == 11 && Statics.field243.method2757() >= 2) {
                        field959.field2400 = 0;
                        Statics.field243.method2765(field959.field2401, 0, 2);
                        field959.field2400 = 0;
                        Statics.field1387 = field959.method3065();
                        field1153 = 12;
                    }
                    if (field1153 == 12 && Statics.field243.method2757() >= Statics.field1387) {
                        field959.field2400 = 0;
                        Statics.field243.method2765(field959.field2401, 0, Statics.field1387);
                        field959.field2400 = 0;
                        String var37 = field959.method3098();
                        String var38 = field959.method3098();
                        String var39 = field959.method3098();
                        class93.method103(var37, var38, var39);
                        method9(10);
                    }
                    if (field1153 == 13) {
                        if (field960 == -1) {
                            if (Statics.field243.method2757() < 2) {
                                return;
                            }
                            Statics.field243.method2765(field959.field2401, 0, 2);
                            field959.field2400 = 0;
                            field960 = field959.method3065();
                        }
                        if (Statics.field243.method2757() >= field960) {
                            Statics.field243.method2765(field959.field2401, 0, field960);
                            field959.field2400 = 0;
                            int var40 = field960;
                            method1209();
                            class97.method3(field959);
                            if (field959.field2400 != var40) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field948++;
                        if (field948 > 2000) {
                            if (field1130 < 1) {
                                if (Statics.field804 == Statics.field507) {
                                    Statics.field804 = Statics.field2424;
                                } else {
                                    Statics.field804 = Statics.field507;
                                }
                                field1130++;
                                field1153 = 0;
                            } else {
                                method6(-3);
                            }
                        }
                    }
                } else if (Statics.field243.method2757() >= field960) {
                    field959.field2400 = 0;
                    Statics.field243.method2765(field959.field2401, 0, field960);
                    field1084 = 1L;
                    field927 = -1;
                    Statics.field444.field845 = 0;
                    Statics.field761 = true;
                    field1179 = true;
                    field1141 = -1L;
                    class281.field3750 = new class192();
                    field957.field2400 = 0;
                    field959.field2400 = 0;
                    field961 = -1;
                    field964 = -1;
                    field965 = -1;
                    field966 = -1;
                    field962 = 0;
                    field1082 = 0;
                    field967 = 0;
                    field931 = 0;
                    field1055 = 0;
                    field1063 = -1;
                    field1054 = false;
                    class60.method4022(0);
                    class99.field1528.clear();
                    class99.field1525.method3261();
                    class99.field1526.method3431();
                    class99.field1531 = 0;
                    field1069 = 0;
                    field1072 = false;
                    field1078 = 0;
                    field1172 = (int) (Math.random() * 100.0D) - 50;
                    field981 = (int) (Math.random() * 110.0D) - 55;
                    field1126 = (int) (Math.random() * 80.0D) - 40;
                    field986 = (int) (Math.random() * 120.0D) - 60;
                    field1077 = (int) (Math.random() * 30.0D) - 20;
                    field1000 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field1017 = 0;
                    field1145 = -1;
                    field1150 = 0;
                    field1157 = 0;
                    field999 = class92.field1415;
                    field940 = class92.field1415;
                    field953 = 0;
                    class97.field1500 = 0;
                    for (int var25 = 0; var25 < 2048; var25++) {
                        class97.field1498[var25] = null;
                        class97.field1499[var25] = 1;
                    }
                    for (int var26 = 0; var26 < 2048; var26++) {
                        field1036[var26] = null;
                    }
                    for (int var27 = 0; var27 < 32768; var27++) {
                        field952[var27] = null;
                    }
                    field1045 = -1;
                    field1048.method3351();
                    field1049.method3351();
                    for (int var28 = 0; var28 < 4; var28++) {
                        for (int var29 = 0; var29 < 104; var29++) {
                            for (int var30 = 0; var30 < 104; var30++) {
                                field1046[var28][var29][var30] = null;
                            }
                        }
                    }
                    field1047 = new class194();
                    field1184 = 0;
                    field1183 = 0;
                    field1187 = 0;
                    for (int var31 = 0; var31 < Statics.field3290; var31++) {
                        class242 var32 = Statics.method1614(var31);
                        if (var32 != null) {
                            class212.field2613[var31] = 0;
                            class212.field2615[var31] = 0;
                        }
                    }
                    Statics.field1915.method1665();
                    field1026 = -1;
                    if (field993 != -1) {
                        class217.method3173(field993);
                    }
                    for (class69 var33 = (class69) field1135.method3298(); var33 != null; var33 = (class69) field1135.method3306()) {
                        method219(var33, true);
                    }
                    field993 = -1;
                    field1135 = new class191(8);
                    field1148 = null;
                    method1574();
                    field1189.method3711((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var34 = 0; var34 < 8; var34++) {
                        field1042[var34] = null;
                        field1043[var34] = false;
                    }
                    class64.field770 = new class191(32);
                    field922 = true;
                    for (int var35 = 0; var35 < 100; var35++) {
                        field1122[var35] = true;
                    }
                    method1383();
                    field1142 = null;
                    Statics.field370 = 0;
                    Statics.field17 = null;
                    for (int var36 = 0; var36 < 8; var36++) {
                        field1192[var36] = new class17();
                    }
                    Statics.field835 = null;
                    class97.method3(field959);
                    Statics.field477 = -1;
                    Statics.method2172(false);
                    field961 = -1;
                }
            }
        } catch (IOException var44) {
            if (field1130 < 1) {
                if (Statics.field804 == Statics.field507) {
                    Statics.field804 = Statics.field2424;
                } else {
                    Statics.field804 = Statics.field507;
                }
                field1130++;
                field1153 = 0;
            } else {
                method6(-2);
            }
        }
    }

    @ObfuscatedName("client.ei(B)V")
    public static void method1209() {
        field957.field2400 = 0;
        field959.field2400 = 0;
        field961 = -1;
        field964 = -1;
        field965 = -1;
        field966 = -1;
        field960 = 0;
        field962 = 0;
        field1082 = 0;
        method1574();
        field1017 = 0;
        field1150 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1036[var0] = null;
        }
        Statics.field2350 = null;
        for (int var1 = 0; var1 < field952.length; var1++) {
            class87 var2 = field952[var1];
            if (var2 != null) {
                var2.field1285 = -1;
                var2.field1254 = false;
            }
        }
        class64.field770 = new class191(32);
        method9(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1122[var3] = true;
        }
        method1383();
    }

    @ObfuscatedName("i.et(II)V")
    public static void method6(int arg0) {
        if (arg0 == -3) {
            class93.method103(class226.field2943, class226.field2897, class226.field3112);
        } else if (arg0 == -2) {
            class93.method103(class226.field2857, class226.field2900, class226.field2901);
        } else if (arg0 == -1) {
            class93.method103(class226.field2860, class226.field3032, class226.field2904);
        } else if (arg0 == 3) {
            class93.field1435 = 3;
        } else if (arg0 == 4) {
            class93.method103(class226.field2905, class226.field2906, class226.field2907);
        } else if (arg0 == 5) {
            class93.method103(class226.field2908, class226.field3051, class226.field2910);
        } else if (arg0 == 6) {
            class93.method103(class226.field2911, class226.field2912, class226.field2913);
        } else if (arg0 == 7) {
            class93.method103(class226.field2914, class226.field3089, class226.field2880);
        } else if (arg0 == 8) {
            class93.method103(class226.field3021, class226.field2918, class226.field2895);
        } else if (arg0 == 9) {
            class93.method103(class226.field2920, class226.field2921, class226.field2899);
        } else if (arg0 == 10) {
            class93.method103(class226.field3028, class226.field3042, class226.field2925);
        } else if (arg0 == 11) {
            class93.method103(class226.field2926, class226.field2856, class226.field2928);
        } else if (arg0 == 12) {
            class93.method103(class226.field2929, class226.field2930, class226.field3084);
        } else if (arg0 == 13) {
            class93.method103(class226.field2932, class226.field2875, class226.field2934);
        } else if (arg0 == 14) {
            class93.method103(class226.field2935, class226.field2936, class226.field2937);
        } else if (arg0 == 16) {
            class93.method103(class226.field2938, class226.field2975, class226.field3023);
        } else if (arg0 == 17) {
            class93.method103(class226.field2941, class226.field2942, class226.field3058);
        } else if (arg0 == 18) {
            class93.method103(class226.field3123, class226.field2945, class226.field2946);
        } else if (arg0 == 19) {
            class93.method103(class226.field2886, class226.field3094, class226.field2898);
        } else if (arg0 == 20) {
            class93.method103(class226.field2950, class226.field3024, class226.field3116);
        } else if (arg0 == 22) {
            class93.method103(class226.field2998, class226.field2954, class226.field2948);
        } else if (arg0 == 23) {
            class93.method103(class226.field3062, class226.field2957, class226.field2958);
        } else if (arg0 == 24) {
            class93.method103(class226.field3041, class226.field2916, class226.field2909);
        } else if (arg0 == 25) {
            class93.method103(class226.field2952, class226.field2963, class226.field2964);
        } else if (arg0 == 26) {
            class93.method103(class226.field3009, class226.field2966, class226.field3066);
        } else if (arg0 == 27) {
            class93.method103(class226.field3091, class226.field2953, class226.field2879);
        } else if (arg0 == 31) {
            class93.method103(class226.field2977, class226.field2978, class226.field2992);
        } else if (arg0 == 32) {
            class93.method103(class226.field2980, class226.field2981, class226.field2982);
        } else if (arg0 == 37) {
            class93.method103(class226.field2983, class226.field3057, class226.field2985);
        } else if (arg0 == 38) {
            class93.method103(class226.field2986, class226.field2987, class226.field3038);
        } else if (arg0 == 55) {
            class93.method103(class226.field2989, class226.field2990, class226.field2991);
        } else if (arg0 == 56) {
            class93.method103(class226.field3019, class226.field2993, class226.field2994);
            method9(11);
            return;
        } else if (arg0 == 57) {
            class93.method103(class226.field2995, class226.field2996, class226.field2997);
            method9(11);
            return;
        } else {
            class93.method103(class226.field3097, class226.field2999, class226.field3000);
        }
        method9(10);
    }

    @ObfuscatedName("w.ep(B)V")
    public static final void method154() {
        if (Statics.field243 != null) {
            Statics.field243.method2755();
            Statics.field243 = null;
        }
        method1710();
        Statics.field752.method2484();
        for (int var0 = 0; var0 < 4; var0++) {
            field975[var0].method2782();
        }
        System.gc();
        class204.field2516 = 1;
        Statics.field2517 = null;
        Statics.field2276 = -1;
        Statics.field3731 = -1;
        Statics.field1775 = 0;
        Statics.field3691 = false;
        Statics.field2262 = 2;
        field1154 = -1;
        field1155 = false;
        class83.method70();
        method9(10);
    }

    @ObfuscatedName("cx.ev(B)V")
    public static final void method1710() {
        class260.field3597.method3286();
        class247.method2885();
        class248.method1573();
        class256.method3826();
        class259.field3594.method3286();
        class259.field3562.method3286();
        class257.field3502.method3286();
        class257.field3503.method3286();
        class257.field3504.method3286();
        class261.method249();
        class246.field3328.method3286();
        class246.field3329.method3286();
        class251.field3386.method3286();
        class242.field3291.method3286();
        class255.field3420.method3286();
        class255.field3421.method3286();
        class255.field3422.method3286();
        class249.field3366.method3286();
        class249.field3367.method3286();
        class253.field3404.method3286();
        class252.field3389.method3286();
        class243.field3296.method3286();
        Statics.method1472();
        class217.method996();
        ((class126) Statics.field2040).method2202();
        class100.field1535.method3286();
        Statics.field841.method3844();
        Statics.field944.method3844();
        Statics.field766.method3844();
        Statics.field656.method3844();
        Statics.field1225.method3844();
        Statics.field657.method3844();
        Statics.field362.method3844();
        Statics.field945.method3844();
        Statics.field897.method3844();
        Statics.field354.method3844();
        Statics.field3250.method3844();
        Statics.field1879.method3844();
    }

    @ObfuscatedName("hx.ew(I)V")
    public static final void method3661() {
        if (field967 > 0) {
            method154();
        } else {
            method9(40);
            Statics.field2150 = Statics.field243;
            Statics.field243 = null;
        }
    }

    @ObfuscatedName("client.en(I)V")
    public final void method1050() {
        if (field1082 > 1) {
            field1082--;
        }
        if (field967 > 0) {
            field967--;
        }
        if (field968) {
            field968 = false;
            method3661();
            return;
        }
        if (!field1054) {
            method1574();
            field1158[0] = class226.field3030;
            field924[0] = "";
            field1105[0] = 1006;
            field1055 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1053(); var1++) {
        }
        if (field970 != 30) {
            return;
        }
        while (true) {
            class280 var2 = (class280) class281.field3750.method3321();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                Object var5 = Statics.field444.field849;
                synchronized (Statics.field444.field849) {
                    if (!field1016) {
                        Statics.field444.field845 = 0;
                    } else if (class60.field714 != 0 || Statics.field444.field845 >= 40) {
                        field957.method3159(236);
                        field957.method2906(0);
                        int var6 = field957.field2400;
                        int var7 = 0;
                        for (int var8 = 0; var8 < Statics.field444.field845 && field957.field2400 - var6 < 240; var8++) {
                            var7++;
                            int var9 = Statics.field444.field847[var8];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 502) {
                                var9 = 502;
                            }
                            int var10 = Statics.field444.field848[var8];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 764) {
                                var10 = 764;
                            }
                            int var11 = var9 * 765 + var10;
                            if (Statics.field444.field847[var8] == -1 && Statics.field444.field848[var8] == -1) {
                                var10 = -1;
                                var9 = -1;
                                var11 = 524287;
                            }
                            if (field1022 != var10 || field926 != var9) {
                                int var12 = var10 - field1022;
                                field1022 = var10;
                                int var13 = var9 - field926;
                                field926 = var9;
                                if (field927 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                    var12 += 32;
                                    var13 += 32;
                                    field957.method2907((field927 << 12) + (var12 << 6) + var13);
                                    field927 = 0;
                                } else if (field927 < 8) {
                                    field957.method2908((field927 << 19) + 8388608 + var11);
                                    field927 = 0;
                                } else {
                                    field957.method2909((field927 << 19) + -1073741824 + var11);
                                    field927 = 0;
                                }
                            } else if (field927 < 2047) {
                                field927++;
                            }
                        }
                        field957.method2918(field957.field2400 - var6);
                        if (var7 >= Statics.field444.field845) {
                            Statics.field444.field845 = 0;
                        } else {
                            Statics.field444.field845 -= var7;
                            for (int var14 = 0; var14 < Statics.field444.field845; var14++) {
                                Statics.field444.field848[var14] = Statics.field444.field848[var7 + var14];
                                Statics.field444.field847[var14] = Statics.field444.field847[var7 + var14];
                            }
                        }
                    }
                }
                if (class60.field714 == 1 || !Statics.field1799 && class60.field714 == 4 || class60.field714 == 2) {
                    long var16 = (class60.field726 - field1084 * -1L) / 50L;
                    if (var16 > 4095L) {
                        var16 = 4095L;
                    }
                    field1084 = class60.field726 * -1L;
                    int var18 = class60.field725;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field22) {
                        var18 = Statics.field22;
                    }
                    int var19 = class60.field724;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field2409) {
                        var19 = Statics.field2409;
                    }
                    int var20 = (int) var16;
                    field957.method3159(179);
                    field957.method2907((var20 << 1) + (class60.field714 == 2 ? 1 : 0));
                    field957.method2907(var19);
                    field957.method2907(var18);
                }
                if (class51.field632 > 0) {
                    field957.method3159(49);
                    field957.method2907(0);
                    int var21 = field957.field2400;
                    long var22 = class176.method2396();
                    for (int var24 = 0; var24 < class51.field632; var24++) {
                        long var25 = var22 - field1141;
                        if (var25 > 16777215L) {
                            var25 = 16777215L;
                        }
                        field1141 = var22;
                        field957.method2961((int) var25);
                        field957.method2906(class51.field630[var24]);
                    }
                    field957.method2917(field957.field2400 - var21);
                }
                if (field1085 > 0) {
                    field1085--;
                }
                if (class51.field625[96] || class51.field625[97] || class51.field625[98] || class51.field625[99]) {
                    field921 = true;
                }
                if (field921 && field1085 <= 0) {
                    field1085 = 20;
                    field921 = false;
                    field957.method3159(114);
                    field957.method2907(field1000);
                    field957.method2907(field1108);
                }
                if (Statics.field761 && !field1179) {
                    field1179 = true;
                    field957.method3159(158);
                    field957.method2906(1);
                }
                if (!Statics.field761 && field1179) {
                    field1179 = false;
                    field957.method3159(158);
                    field957.method2906(0);
                }
                method251();
                if (field970 != 30) {
                    return;
                }
                method3811();
                method2690();
                field962++;
                if (field962 > 750) {
                    method3661();
                    return;
                }
                method153();
                for (int var27 = 0; var27 < field953; var27++) {
                    int var28 = field954[var27];
                    class87 var29 = field952[var28];
                    if (var29 != null) {
                        method1002(var29, var29.field1379.field3578);
                    }
                }
                int[] var30 = class97.field1502;
                for (int var31 = 0; var31 < class97.field1500; var31++) {
                    class75 var32 = field1036[var30[var31]];
                    if (var32 != null && var32.field1267 > 0) {
                        var32.field1267--;
                        if (var32.field1267 == 0) {
                            var32.field1271 = null;
                        }
                    }
                }
                for (int var33 = 0; var33 < field953; var33++) {
                    int var34 = field954[var33];
                    class87 var35 = field952[var34];
                    if (var35 != null && var35.field1267 > 0) {
                        var35.field1267--;
                        if (var35.field1267 == 0) {
                            var35.field1271 = null;
                        }
                    }
                }
                field991++;
                if (field1196 != 0) {
                    field1025 += 20;
                    if (field1025 >= 400) {
                        field1196 = 0;
                    }
                }
                if (Statics.field3682 != null) {
                    field1027++;
                    if (field1027 >= 15) {
                        method1404(Statics.field3682);
                        Statics.field3682 = null;
                    }
                }
                class217 var36 = Statics.field1355;
                class217 var37 = Statics.field1320;
                Statics.field1355 = null;
                Statics.field1320 = null;
                field1094 = null;
                field1098 = false;
                field928 = false;
                field1138 = 0;
                while (Statics.method194() && field1138 < 128) {
                    if (field1133 >= 2 && class51.field625[82] && Statics.field1338 == 66) {
                        String var38 = class99.method989();
                        Statics.field591.method849(var38);
                    } else {
                        field1140[field1138] = Statics.field1338;
                        field1139[field1138] = Statics.field536;
                        field1138++;
                    }
                }
                if (field993 != -1) {
                    method3816(field993, 0, 0, Statics.field2409, Statics.field22, 0, 0);
                }
                field1111++;
                while (true) {
                    class70 var39;
                    class217 var40;
                    class217 var41;
                    do {
                        var39 = (class70) field1117.method3354();
                        if (var39 == null) {
                            while (true) {
                                class70 var42;
                                class217 var43;
                                class217 var44;
                                do {
                                    var42 = (class70) field1118.method3354();
                                    if (var42 == null) {
                                        while (true) {
                                            class70 var45;
                                            class217 var46;
                                            class217 var47;
                                            do {
                                                var45 = (class70) field1116.method3354();
                                                if (var45 == null) {
                                                    this.method1297();
                                                    if (Statics.field2147 != null) {
                                                        Statics.field2147.method4899(Statics.field1449, (Statics.field2350.field1234 >> 7) + Statics.field749, (Statics.field2350.field1276 >> 7) + Statics.field357, false);
                                                        Statics.field2147.method4913();
                                                    }
                                                    if (field1090 != null) {
                                                        this.method1235();
                                                    }
                                                    if (Statics.field1530 != null) {
                                                        method1404(Statics.field1530);
                                                        field1034++;
                                                        if (class60.field717 == 0) {
                                                            if (!field1033) {
                                                                int var54 = method1696();
                                                                if (field1055 > 2 && (field1053 == 1 && !method3729() || method229(var54))) {
                                                                    this.method1365(field1030, field997);
                                                                } else if (field1055 > 0) {
                                                                    method180(field1030, field997);
                                                                }
                                                            } else if (Statics.field1530 == Statics.field1205 && field1032 != field1029) {
                                                                class217 var48 = Statics.field1530;
                                                                byte var49 = 0;
                                                                if (field1080 == 1 && var48.field2721 == 206) {
                                                                    var49 = 1;
                                                                }
                                                                if (var48.field2659[field1032] <= 0) {
                                                                    var49 = 0;
                                                                }
                                                                if (class218.method4452(method4162(var48))) {
                                                                    int var50 = field1029;
                                                                    int var51 = field1032;
                                                                    var48.field2659[var51] = var48.field2659[var50];
                                                                    var48.field2772[var51] = var48.field2772[var50];
                                                                    var48.field2659[var50] = -1;
                                                                    var48.field2772[var50] = 0;
                                                                } else if (var49 == 1) {
                                                                    int var52 = field1029;
                                                                    int var53 = field1032;
                                                                    while (var52 != var53) {
                                                                        if (var52 > var53) {
                                                                            var48.method3734(var52 - 1, var52);
                                                                            var52--;
                                                                        } else if (var52 < var53) {
                                                                            var48.method3734(var52 + 1, var52);
                                                                            var52++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var48.method3734(field1032, field1029);
                                                                }
                                                                field957.method3159(143);
                                                                field957.method2953(field1032);
                                                                field957.method2946(var49);
                                                                field957.method2955(field1029);
                                                                field957.method2965(Statics.field1530.field2653);
                                                            }
                                                            field1027 = 10;
                                                            class60.field714 = 0;
                                                            Statics.field1530 = null;
                                                        } else if (field1034 >= 5 && (class60.field730 > field1030 + 5 || class60.field730 < field1030 - 5 || class60.field716 * 1327680731 > field997 + 5 || class60.field716 * 1327680731 < field997 - 5)) {
                                                            field1033 = true;
                                                        }
                                                    }
                                                    if (class140.method2523()) {
                                                        int var55 = class140.field2096;
                                                        int var56 = class140.field2097;
                                                        field957.method3159(201);
                                                        field957.method2906(5);
                                                        field957.method2954(Statics.field749 + var55);
                                                        field957.method2954(Statics.field357 + var56);
                                                        field957.method2945(class51.field625[82] ? (class51.field625[81] ? 2 : 1) : 0);
                                                        class140.method2593();
                                                        field1023 = class60.field724;
                                                        field971 = class60.field725;
                                                        field1196 = 1;
                                                        field1025 = 0;
                                                        field1150 = var55;
                                                        field1157 = var56;
                                                    }
                                                    if (Statics.field1355 != var36) {
                                                        if (var36 != null) {
                                                            method1404(var36);
                                                        }
                                                        if (Statics.field1355 != null) {
                                                            method1404(Statics.field1355);
                                                        }
                                                    }
                                                    if (Statics.field1320 != var37 && field1119 == field1095) {
                                                        if (var37 != null) {
                                                            method1404(var37);
                                                        }
                                                        if (Statics.field1320 != null) {
                                                            method1404(Statics.field1320);
                                                        }
                                                    }
                                                    if (Statics.field1320 == null) {
                                                        if (field1119 > 0) {
                                                            field1119--;
                                                        }
                                                    } else if (field1119 < field1095) {
                                                        field1119++;
                                                        if (field1119 == field1095) {
                                                            method1404(Statics.field1320);
                                                        }
                                                    }
                                                    method3976();
                                                    if (field988) {
                                                        method1577();
                                                    }
                                                    for (int var57 = 0; var57 < 5; var57++) {
                                                        int var10002 = field1169[var57]++;
                                                    }
                                                    Statics.field1915.method1642();
                                                    int var58 = ++class60.field712 - 1;
                                                    int var60 = class51.field636;
                                                    if (var58 > 15000 && var60 > 15000) {
                                                        field967 = 250;
                                                        class60.method4022(14500);
                                                        field957.method3159(196);
                                                    }
                                                    field985++;
                                                    if (field985 > 500) {
                                                        field985 = 0;
                                                        int var62 = (int) (Math.random() * 8.0D);
                                                        if ((var62 & 0x1) == 1) {
                                                            field1172 += field1161;
                                                        }
                                                        if ((var62 & 0x2) == 2) {
                                                            field981 += field1162;
                                                        }
                                                        if ((var62 & 0x4) == 4) {
                                                            field1126 += field984;
                                                        }
                                                    }
                                                    if (field1172 < -50) {
                                                        field1161 = 2;
                                                    }
                                                    if (field1172 > 50) {
                                                        field1161 = -2;
                                                    }
                                                    if (field981 < -55) {
                                                        field1162 = 2;
                                                    }
                                                    if (field981 > 55) {
                                                        field1162 = -2;
                                                    }
                                                    if (field1126 < -40) {
                                                        field984 = 1;
                                                    }
                                                    if (field1126 > 40) {
                                                        field984 = -1;
                                                    }
                                                    field990++;
                                                    if (field990 > 500) {
                                                        field990 = 0;
                                                        int var63 = (int) (Math.random() * 8.0D);
                                                        if ((var63 & 0x1) == 1) {
                                                            field986 += field1132;
                                                        }
                                                        if ((var63 & 0x2) == 2) {
                                                            field1077 += field1057;
                                                        }
                                                    }
                                                    if (field986 < -60) {
                                                        field1132 = 2;
                                                    }
                                                    if (field986 > 60) {
                                                        field1132 = -2;
                                                    }
                                                    if (field1077 < -20) {
                                                        field1057 = 1;
                                                    }
                                                    if (field1077 > 10) {
                                                        field1057 = -1;
                                                    }
                                                    for (class68 var64 = (class68) field1186.method3396(); var64 != null; var64 = (class68) field1186.method3399()) {
                                                        if ((long) var64.field815 < class176.method2396() / 1000L - 5L) {
                                                            if (var64.field814 > 0) {
                                                                class99.method1689(5, "", var64.field810 + class226.field3102);
                                                            }
                                                            if (var64.field814 == 0) {
                                                                class99.method1689(5, "", var64.field810 + class226.field2922);
                                                            }
                                                            var64.method3405();
                                                        }
                                                    }
                                                    field963++;
                                                    if (field963 > 50) {
                                                        field957.method3159(36);
                                                    }
                                                    try {
                                                        if (Statics.field243 != null && field957.field2400 > 0) {
                                                            Statics.field243.method2759(field957.field2401, 0, field957.field2400);
                                                            field957.field2400 = 0;
                                                            field963 = 0;
                                                        }
                                                    } catch (IOException var66) {
                                                        method3661();
                                                    }
                                                    return;
                                                }
                                                var46 = var45.field825;
                                                if (var46.field2654 < 0) {
                                                    break;
                                                }
                                                var47 = class217.method3143(var46.field2668);
                                            } while (var47 == null || var47.field2777 == null || var46.field2654 >= var47.field2777.length || var47.field2777[var46.field2654] != var46);
                                            class84.method3815(var45);
                                        }
                                    }
                                    var43 = var42.field825;
                                    if (var43.field2654 < 0) {
                                        break;
                                    }
                                    var44 = class217.method3143(var43.field2668);
                                } while (var44 == null || var44.field2777 == null || var43.field2654 >= var44.field2777.length || var44.field2777[var43.field2654] != var43);
                                class84.method3815(var42);
                            }
                        }
                        var40 = var39.field825;
                        if (var40.field2654 < 0) {
                            break;
                        }
                        var41 = class217.method3143(var40.field2668);
                    } while (var41 == null || var41.field2777 == null || var40.field2654 >= var41.field2777.length || var41.field2777[var40.field2654] != var40);
                    class84.method3815(var39);
                }
            }
            field957.method3159(58);
            field957.method2906(0);
            int var4 = field957.field2400;
            class281.method2688(field957);
            field957.method2918(field957.field2400 - var4);
        }
    }

    @ObfuscatedName("d.fa(I)V")
    public static final void method190() {
        if (Statics.field2251 != null) {
            Statics.field2251.method1867();
        }
        if (Statics.field2288 != null) {
            Statics.field2288.method1867();
        }
    }

    @ObfuscatedName("ex.fj(I)V")
    public static final void method2690() {
        for (int var0 = 0; var0 < field1078; var0++) {
            int var10002 = field1050[var0]--;
            if (field1050[var0] >= -10) {
                class106 var2 = field1163[var0];
                if (var2 == null) {
                    class106 var10000 = (class106) null;
                    var2 = class106.method1788(Statics.field656, field1159[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1050[var0] += var2.method1787();
                    field1163[var0] = var2;
                }
                if (field1050[var0] < 0) {
                    int var9;
                    if (field1102[var0] == 0) {
                        var9 = field1156;
                    } else {
                        int var3 = (field1102[var0] & 0xFF) * 128;
                        int var4 = field1102[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2350.field1234;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1102[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2350.field1276;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1050[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1006 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class108 var10 = var2.method1786().method1824(Statics.field2335);
                        class118 var11 = class118.method1999(var10, 100, var9);
                        var11.method1966(field1160[var0] - 1);
                        Statics.field614.method1731(var11);
                    }
                    field1050[var0] = -100;
                }
            } else {
                field1078--;
                for (int var1 = var0; var1 < field1078; var1++) {
                    field1159[var1] = field1159[var1 + 1];
                    field1163[var1] = field1163[var1 + 1];
                    field1160[var1] = field1160[var1 + 1];
                    field1050[var1] = field1050[var1 + 1];
                    field1102[var1] = field1102[var1 + 1];
                }
                var0--;
            }
        }
        if (field1155 && !class204.method547()) {
            if (field1031 != 0 && field1154 != -1) {
                class204.method3180(Statics.field657, field1154, 0, field1031, false);
            }
            field1155 = false;
        }
    }

    @ObfuscatedName("m.ff(Ljd;IIII)V")
    public static void method17(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1078 >= 50 || field1006 == 0 || arg0.field3616 == null || arg1 >= arg0.field3616.length) {
            return;
        }
        int var4 = arg0.field3616[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1159[field1078] = var5;
        field1160[field1078] = var6;
        field1050[field1078] = 0;
        field1163[field1078] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1102[field1078] = (var8 << 16) + (var9 << 8) + var7;
        field1078++;
    }

    @ObfuscatedName("o.fq(III)V")
    public static void method61(int arg0, int arg1) {
        if (field1031 != 0 && arg0 != -1) {
            class204.method3180(Statics.field3250, arg0, 0, field1031, false);
            field1155 = true;
        }
    }

    @ObfuscatedName("an.fu(I)V")
    public static final void method251() {
        if (Statics.field1449 == field1145) {
            return;
        }
        field1145 = Statics.field1449;
        int var0 = Statics.field1449;
        int[] var1 = Statics.field1788.field3788;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field737[var0][var6][var4] & 0x18) == 0) {
                    Statics.field752.method2602(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field737[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field752.method2602(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1788.method4762();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field737[var0][var10][var9] & 0x18) == 0) {
                    method3523(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field737[var0 + 1][var10][var9] & 0x8) != 0) {
                    method3523(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1146 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field752.method2513(Statics.field1449, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method937(var14).field3471;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field975[Statics.field1449].field2308;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x1240108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x1240180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x1240102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x1240120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        field1149[field1146] = Statics.field1301[var15].method4015(false);
                        field1115[field1146] = var16;
                        field1066[field1146] = var17;
                        field1146++;
                    }
                }
            }
        }
        Statics.field602.method4732();
    }

    @ObfuscatedName("he.fo(Lhj;III)V")
    public static final void method3669(class217 arg0, int arg1, int arg2) {
        if (field1017 != 0 && field1017 != 3 || class60.field714 != 1 && Statics.field1799 || class60.field714 != 4) {
            return;
        }
        class211 var3 = arg0.method3773(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field724 - arg1;
        int var5 = class60.field725 - arg2;
        if (!var3.method3663(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2611 / 2;
        int var7 = var5 - var3.field2606 / 2;
        int var8 = field986 + field1000 & 0x7FF;
        int var9 = class137.field2020[var8];
        int var10 = class137.field2044[var8];
        int var11 = (field1077 + 256) * var9 >> 8;
        int var12 = (field1077 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field2350.field1234 + var13 >> 7;
        int var16 = Statics.field2350.field1276 - var14 >> 7;
        field957.method3159(224);
        field957.method2906(18);
        field957.method2954(Statics.field749 + var15);
        field957.method2954(Statics.field357 + var16);
        field957.method2945(class51.field625[82] ? (class51.field625[81] ? 2 : 1) : 0);
        field957.method2906(var6);
        field957.method2906(var7);
        field957.method2907(field1000);
        field957.method2906(57);
        field957.method2906(field986);
        field957.method2906(field1077);
        field957.method2906(89);
        field957.method2907(Statics.field2350.field1234);
        field957.method2907(Statics.field2350.field1276);
        field957.method2906(63);
        field1150 = var15;
        field1157 = var16;
    }

    @ObfuscatedName("fk.fb(Ljava/lang/String;B)V")
    public static final void method3120(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field802.field1319 = !Statics.field802.field1319;
            class82.method220();
            if (Statics.field802.field1319) {
                class99.method1689(99, "", "Roofs are now all hidden");
            } else {
                class99.method1689(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field929 = !field929;
        }
        if (arg0.equalsIgnoreCase("clickbox")) {
            class134.field1945 = !class134.field1945;
            class99.method1689(99, "", "Clickbox Mode: " + (class134.field1945 ? "AABB" : "Legacy"));
        }
        if (field1133 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field232) {
                    class8.field232 = true;
                    class8.field235 = class12.field267;
                    class99.method1689(99, "", "AABB boxes: All");
                } else if (class8.field235 == class12.field267) {
                    class8.field232 = true;
                    class8.field235 = class12.field269;
                    class99.method1689(99, "", "AABB boxes: Mouse Over");
                } else {
                    class8.field232 = false;
                    class99.method1689(99, "", "AABB boxes: Off");
                }
            }
            if (arg0.equalsIgnoreCase("legacyboxes")) {
                class8.field233 = !class8.field233;
                class99.method1689(99, "", "Show legacy boxes: " + class8.field233);
            }
            if (arg0.equalsIgnoreCase("geotests")) {
                class8.field236 = !class8.field236;
                class99.method1689(99, "", "Show geometry tests: " + class8.field236);
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field929 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field929 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method3661();
            }
            if (arg0.equalsIgnoreCase("errortest") && field916 == 2) {
                throw new RuntimeException();
            }
        }
        field957.method3159(254);
        field957.method2906(arg0.length() + 1);
        field957.method2912(arg0);
    }

    @ObfuscatedName("cd.fw(I)V")
    public static final void method1577() {
        int var0 = Statics.field274 * 128 + 64;
        int var1 = Statics.field857 * 128 + 64;
        int var2 = method3174(var0, var1, Statics.field1449) - Statics.field2430;
        if (Statics.field19 < var0) {
            Statics.field19 += Statics.field2137 * (var0 - Statics.field19) / 1000 + Statics.field374;
            if (Statics.field19 > var0) {
                Statics.field19 = var0;
            }
        }
        if (Statics.field19 > var0) {
            Statics.field19 -= Statics.field2137 * (Statics.field19 - var0) / 1000 + Statics.field374;
            if (Statics.field19 < var0) {
                Statics.field19 = var0;
            }
        }
        if (Statics.field2512 < var2) {
            Statics.field2512 += Statics.field2137 * (var2 - Statics.field2512) / 1000 + Statics.field374;
            if (Statics.field2512 > var2) {
                Statics.field2512 = var2;
            }
        }
        if (Statics.field2512 > var2) {
            Statics.field2512 -= Statics.field2137 * (Statics.field2512 - var2) / 1000 + Statics.field374;
            if (Statics.field2512 < var2) {
                Statics.field2512 = var2;
            }
        }
        if (Statics.field764 < var1) {
            Statics.field764 += Statics.field2137 * (var1 - Statics.field764) / 1000 + Statics.field374;
            if (Statics.field764 > var1) {
                Statics.field764 = var1;
            }
        }
        if (Statics.field764 > var1) {
            Statics.field764 -= Statics.field2137 * (Statics.field764 - var1) / 1000 + Statics.field374;
            if (Statics.field764 < var1) {
                Statics.field764 = var1;
            }
        }
        int var3 = Statics.field709 * 128 + 64;
        int var4 = Statics.field2053 * 128 + 64;
        int var5 = method3174(var3, var4, Statics.field1449) - Statics.field20;
        int var6 = var3 - Statics.field19;
        int var7 = var5 - Statics.field2512;
        int var8 = var4 - Statics.field764;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field979 < var10) {
            Statics.field979 += Statics.field314 * (var10 - Statics.field979) / 1000 + Statics.field869;
            if (Statics.field979 > var10) {
                Statics.field979 = var10;
            }
        }
        if (Statics.field979 > var10) {
            Statics.field979 -= Statics.field314 * (Statics.field979 - var10) / 1000 + Statics.field869;
            if (Statics.field979 < var10) {
                Statics.field979 = var10;
            }
        }
        int var12 = var11 - Statics.field1369;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1369 += Statics.field314 * var12 / 1000 + Statics.field869;
            Statics.field1369 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1369 -= Statics.field314 * -var12 / 1000 + Statics.field869;
            Statics.field1369 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1369;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1369 = var11;
        }
    }

    @ObfuscatedName("ia.fc(I)V")
    public static final void method3976() {
        int var0 = field1172 + Statics.field2350.field1234;
        int var1 = field981 + Statics.field2350.field1276;
        if (Statics.field405 - var0 < -500 || Statics.field405 - var0 > 500 || Statics.field2259 - var1 < -500 || Statics.field2259 - var1 > 500) {
            Statics.field405 = var0;
            Statics.field2259 = var1;
        }
        if (Statics.field405 != var0) {
            Statics.field405 += (var0 - Statics.field405) / 16;
        }
        if (Statics.field2259 != var1) {
            Statics.field2259 += (var1 - Statics.field2259) / 16;
        }
        if (class60.field717 == 4 && Statics.field1799) {
            int var2 = class60.field716 * 1327680731 - field1004 * 1327680731;
            field1002 = var2 * 2;
            field1004 = (var2 == -1 || var2 == 1 ? class60.field716 * 1327680731 : (field1004 * 1327680731 + class60.field716 * 1327680731) / 2) * -1753198765;
            int var3 = field1003 - class60.field730;
            field1001 = var3 * 2;
            field1003 = var3 == -1 || var3 == 1 ? class60.field730 : (field1003 + class60.field730) / 2;
        } else {
            if (class51.field625[96]) {
                field1001 += (-24 - field1001) / 2;
            } else if (class51.field625[97]) {
                field1001 += (24 - field1001) / 2;
            } else {
                field1001 /= 2;
            }
            if (class51.field625[98]) {
                field1002 += (12 - field1002) / 2;
            } else if (class51.field625[99]) {
                field1002 += (-12 - field1002) / 2;
            } else {
                field1002 /= 2;
            }
            field1004 = class60.field716;
            field1003 = class60.field730;
        }
        field1000 = field1001 / 2 + field1000 & 0x7FF;
        field1108 += field1002 / 2;
        if (field1108 < 128) {
            field1108 = 128;
        }
        if (field1108 > 383) {
            field1108 = 383;
        }
        int var4 = Statics.field405 >> 7;
        int var5 = Statics.field2259 >> 7;
        int var6 = method3174(Statics.field405, Statics.field2259, Statics.field1449);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1449;
                    if (var10 < 3 && (class62.field737[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field748[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > field1008) {
            field1008 += (var12 - field1008) / 24;
        } else if (var12 < field1008) {
            field1008 += (var12 - field1008) / 80;
        }
    }

    @ObfuscatedName("t.fx(I)V")
    public static final void method153() {
        int var0 = class97.field1500;
        int[] var1 = class97.field1502;
        for (int var2 = 0; var2 < var0; var2++) {
            class75 var3 = field1036[var1[var2]];
            if (var3 != null) {
                method1002(var3, 1);
            }
        }
    }

    @ObfuscatedName("bk.fg(Lcs;II)V")
    public static final void method1002(class79 arg0, int arg1) {
        if (arg0.field1273 > field923) {
            int var2 = arg0.field1273 - field923;
            int var3 = arg0.field1269 * 128 + arg0.field1231 * 64;
            int var4 = arg0.field1287 * 128 + arg0.field1231 * 64;
            arg0.field1234 += (var3 - arg0.field1234) / var2;
            arg0.field1276 += (var4 - arg0.field1276) / var2;
            arg0.field1259 = 0;
            arg0.field1253 = arg0.field1275;
        } else if (arg0.field1274 >= field923) {
            if (field923 == arg0.field1274 || arg0.field1228 == -1 || arg0.field1278 != 0 || arg0.field1261 + 1 > class261.method2887(arg0.field1228).field3615[arg0.field1260]) {
                int var5 = arg0.field1274 - arg0.field1273;
                int var6 = field923 - arg0.field1273;
                int var7 = arg0.field1269 * 128 + arg0.field1231 * 64;
                int var8 = arg0.field1287 * 128 + arg0.field1231 * 64;
                int var9 = arg0.field1270 * 128 + arg0.field1231 * 64;
                int var10 = arg0.field1272 * 128 + arg0.field1231 * 64;
                arg0.field1234 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1276 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1259 = 0;
            arg0.field1253 = arg0.field1275;
            arg0.field1248 = arg0.field1253;
        } else {
            arg0.field1256 = arg0.field1232;
            if (arg0.field1281 == 0) {
                arg0.field1259 = 0;
            } else {
                label430: {
                    if (arg0.field1228 != -1 && arg0.field1278 == 0) {
                        class261 var11 = class261.method2887(arg0.field1228);
                        if (arg0.field1286 > 0 && var11.field3614 == 0) {
                            arg0.field1259++;
                            break label430;
                        }
                        if (arg0.field1286 <= 0 && var11.field3625 == 0) {
                            arg0.field1259++;
                            break label430;
                        }
                    }
                    int var12 = arg0.field1234;
                    int var13 = arg0.field1276;
                    int var14 = arg0.field1282[arg0.field1281 - 1] * 128 + arg0.field1231 * 64;
                    int var15 = arg0.field1283[arg0.field1281 - 1] * 128 + arg0.field1231 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field1253 = 1280;
                        } else if (var13 > var15) {
                            arg0.field1253 = 1792;
                        } else {
                            arg0.field1253 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field1253 = 768;
                        } else if (var13 > var15) {
                            arg0.field1253 = 256;
                        } else {
                            arg0.field1253 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field1253 = 1024;
                    } else if (var13 > var15) {
                        arg0.field1253 = 0;
                    }
                    byte var16 = arg0.field1284[arg0.field1281 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field1253 - arg0.field1248 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field1236;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field1235;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field1238;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field1266;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field1235;
                        }
                        arg0.field1256 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class87) {
                            var20 = ((class87) arg0).field1379.field3593;
                        }
                        if (var20) {
                            if (arg0.field1253 != arg0.field1248 && arg0.field1285 == -1 && arg0.field1243 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field1281 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field1281 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field1259 > 0 && arg0.field1281 > 1) {
                                var19 = 8;
                                arg0.field1259--;
                            }
                        } else {
                            if (arg0.field1281 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field1281 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field1259 > 0 && arg0.field1281 > 1) {
                                var19 = 8;
                                arg0.field1259--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field1256 == arg0.field1235 && arg0.field1239 != -1) {
                            arg0.field1256 = arg0.field1239;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field1234 += var19;
                                if (arg0.field1234 > var14) {
                                    arg0.field1234 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1234 -= var19;
                                if (arg0.field1234 < var14) {
                                    arg0.field1234 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field1276 += var19;
                                if (arg0.field1276 > var15) {
                                    arg0.field1276 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field1276 -= var19;
                                if (arg0.field1276 < var15) {
                                    arg0.field1276 = var15;
                                }
                            }
                        }
                        if (arg0.field1234 == var14 && arg0.field1276 == var15) {
                            arg0.field1281--;
                            if (arg0.field1286 > 0) {
                                arg0.field1286--;
                            }
                        }
                    } else {
                        arg0.field1234 = var14;
                        arg0.field1276 = var15;
                        arg0.field1281--;
                        if (arg0.field1286 > 0) {
                            arg0.field1286--;
                        }
                    }
                }
            }
        }
        if (arg0.field1234 < 128 || arg0.field1276 < 128 || arg0.field1234 >= 13184 || arg0.field1276 >= 13184) {
            arg0.field1228 = -1;
            arg0.field1246 = -1;
            arg0.field1273 = 0;
            arg0.field1274 = 0;
            arg0.field1234 = arg0.field1282[0] * 128 + arg0.field1231 * 64;
            arg0.field1276 = arg0.field1283[0] * 128 + arg0.field1231 * 64;
            arg0.method1387();
        }
        if (Statics.field2350 == arg0 && (arg0.field1234 < 1536 || arg0.field1276 < 1536 || arg0.field1234 >= 11776 || arg0.field1276 >= 11776)) {
            arg0.field1228 = -1;
            arg0.field1246 = -1;
            arg0.field1273 = 0;
            arg0.field1274 = 0;
            arg0.field1234 = arg0.field1282[0] * 128 + arg0.field1231 * 64;
            arg0.field1276 = arg0.field1283[0] * 128 + arg0.field1231 * 64;
            arg0.method1387();
        }
        if (arg0.field1243 != 0) {
            if (arg0.field1285 != -1) {
                class79 var21 = null;
                if (arg0.field1285 < 32768) {
                    var21 = field952[arg0.field1285];
                } else if (arg0.field1285 >= 32768) {
                    var21 = field1036[arg0.field1285 - 32768];
                }
                if (var21 != null) {
                    int var22 = arg0.field1234 - var21.field1234;
                    int var23 = arg0.field1276 - var21.field1276;
                    if (var22 != 0 || var23 != 0) {
                        arg0.field1253 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1254) {
                    arg0.field1285 = -1;
                    arg0.field1254 = false;
                }
            }
            if (arg0.field1255 != -1 && (arg0.field1281 == 0 || arg0.field1259 > 0)) {
                arg0.field1253 = arg0.field1255;
                arg0.field1255 = -1;
            }
            int var24 = arg0.field1253 - arg0.field1248 & 0x7FF;
            if (var24 == 0 && arg0.field1254) {
                arg0.field1285 = -1;
                arg0.field1254 = false;
            }
            if (var24 == 0) {
                arg0.field1279 = 0;
            } else {
                arg0.field1279++;
                if (var24 > 1024) {
                    arg0.field1248 -= arg0.field1243;
                    boolean var25 = true;
                    if (var24 < arg0.field1243 || var24 > 2048 - arg0.field1243) {
                        arg0.field1248 = arg0.field1253;
                        var25 = false;
                    }
                    if (arg0.field1256 == arg0.field1232 && (arg0.field1279 > 25 || var25)) {
                        if (arg0.field1233 == -1) {
                            arg0.field1256 = arg0.field1235;
                        } else {
                            arg0.field1256 = arg0.field1233;
                        }
                    }
                } else {
                    arg0.field1248 += arg0.field1243;
                    boolean var26 = true;
                    if (var24 < arg0.field1243 || var24 > 2048 - arg0.field1243) {
                        arg0.field1248 = arg0.field1253;
                        var26 = false;
                    }
                    if (arg0.field1256 == arg0.field1232 && (arg0.field1279 > 25 || var26)) {
                        if (arg0.field1249 == -1) {
                            arg0.field1256 = arg0.field1235;
                        } else {
                            arg0.field1256 = arg0.field1249;
                        }
                    }
                }
                arg0.field1248 &= 0x7FF;
            }
        }
        arg0.field1230 = false;
        if (arg0.field1256 != -1) {
            class261 var28 = class261.method2887(arg0.field1256);
            if (var28 == null || var28.field3617 == null) {
                arg0.field1256 = -1;
            } else {
                arg0.field1258++;
                if (arg0.field1240 < var28.field3617.length && arg0.field1258 > var28.field3615[arg0.field1240]) {
                    arg0.field1258 = 1;
                    arg0.field1240++;
                    method17(var28, arg0.field1240, arg0.field1234, arg0.field1276);
                }
                if (arg0.field1240 >= var28.field3617.length) {
                    arg0.field1258 = 0;
                    arg0.field1240 = 0;
                    method17(var28, arg0.field1240, arg0.field1234, arg0.field1276);
                }
            }
        }
        if (arg0.field1246 != -1 && field923 >= arg0.field1257) {
            if (arg0.field1265 < 0) {
                arg0.field1265 = 0;
            }
            int var29 = class246.method1711(arg0.field1246).field3341;
            if (var29 == -1) {
                arg0.field1246 = -1;
            } else {
                class261 var30 = class261.method2887(var29);
                if (var30 == null || var30.field3617 == null) {
                    arg0.field1246 = -1;
                } else {
                    arg0.field1250++;
                    if (arg0.field1265 < var30.field3617.length && arg0.field1250 > var30.field3615[arg0.field1265]) {
                        arg0.field1250 = 1;
                        arg0.field1265++;
                        method17(var30, arg0.field1265, arg0.field1234, arg0.field1276);
                    }
                    if (arg0.field1265 >= var30.field3617.length && (arg0.field1265 < 0 || arg0.field1265 >= var30.field3617.length)) {
                        arg0.field1246 = -1;
                    }
                }
            }
        }
        if (arg0.field1228 != -1 && arg0.field1278 <= 1) {
            class261 var31 = class261.method2887(arg0.field1228);
            if (var31.field3614 == 1 && arg0.field1286 > 0 && arg0.field1273 <= field923 && arg0.field1274 < field923) {
                arg0.field1278 = 1;
                return;
            }
        }
        if (arg0.field1228 != -1 && arg0.field1278 == 0) {
            class261 var32 = class261.method2887(arg0.field1228);
            if (var32 == null || var32.field3617 == null) {
                arg0.field1228 = -1;
            } else {
                arg0.field1261++;
                if (arg0.field1260 < var32.field3617.length && arg0.field1261 > var32.field3615[arg0.field1260]) {
                    arg0.field1261 = 1;
                    arg0.field1260++;
                    method17(var32, arg0.field1260, arg0.field1234, arg0.field1276);
                }
                if (arg0.field1260 >= var32.field3617.length) {
                    arg0.field1260 -= var32.field3608;
                    arg0.field1229++;
                    if (arg0.field1229 >= var32.field3623) {
                        arg0.field1228 = -1;
                    } else if (arg0.field1260 >= 0 && arg0.field1260 < var32.field3617.length) {
                        method17(var32, arg0.field1260, arg0.field1234, arg0.field1276);
                    } else {
                        arg0.field1228 = -1;
                    }
                }
                arg0.field1230 = var32.field3619;
            }
        }
        if (arg0.field1278 > 0) {
            arg0.field1278--;
        }
    }

    @ObfuscatedName("ah.fv(Lbw;III)V")
    public static void method466(class75 arg0, int arg1, int arg2) {
        if (arg0.field1228 == arg1 && arg1 != -1) {
            int var3 = class261.method2887(arg1).field3618;
            if (var3 == 1) {
                arg0.field1260 = 0;
                arg0.field1261 = 0;
                arg0.field1278 = arg2;
                arg0.field1229 = 0;
            }
            if (var3 == 2) {
                arg0.field1229 = 0;
            }
        } else if (arg1 == -1 || arg0.field1228 == -1 || class261.method2887(arg1).field3620 >= class261.method2887(arg0.field1228).field3620) {
            arg0.field1228 = arg1;
            arg0.field1260 = 0;
            arg0.field1261 = 0;
            arg0.field1278 = arg2;
            arg0.field1229 = 0;
            arg0.field1286 = arg0.field1281;
        }
    }

    @ObfuscatedName("el.fr(B)I")
    public static int method2677() {
        return field1131 ? 2 : 1;
    }

    @ObfuscatedName("cx.fd(IB)V")
    public static void method1712(int arg0) {
        field947 = 0L;
        if (arg0 >= 2) {
            field1131 = true;
        } else {
            field1131 = false;
        }
        if (method2677() == 1) {
            Statics.field591.method744(765, 503);
        } else {
            Statics.field591.method744(7680, 2160);
        }
        if (field970 >= 25) {
            method1383();
        }
    }

    @ObfuscatedName("ba.ft(I)V")
    public static void method1383() {
        field957.method3159(53);
        field957.method2906(method2677());
        field957.method2907(Statics.field2409);
        field957.method2907(Statics.field22);
    }

    @ObfuscatedName("client.u(B)V")
    public final void method749() {
        field947 = class176.method2396() + 500L;
        this.method1274();
        if (field993 != -1) {
            this.method1056(true);
        }
    }

    @ObfuscatedName("client.fm(B)V")
    public void method1274() {
        int var1 = Statics.field2409;
        int var2 = Statics.field22;
        if (this.field690 < var1) {
            int var3 = this.field690;
        }
        if (this.field691 < var2) {
            int var4 = this.field691;
        }
        if (Statics.field802 != null) {
            try {
                class53.method667(Statics.field591, "resize", new Object[] { method2677() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fn(B)V")
    public final void method1052() {
        if (field993 != -1) {
            method1038(field993);
        }
        for (int var1 = 0; var1 < field1120; var1++) {
            if (field1122[var1]) {
                field1123[var1] = true;
            }
            field1124[var1] = field1122[var1];
            field1122[var1] = false;
        }
        field1068 = field923;
        field1065 = -1;
        field1061 = -1;
        Statics.field1205 = null;
        if (field993 != -1) {
            field1120 = 0;
            method178(field993, 0, 0, Statics.field2409, Statics.field22, 0, 0, -1);
        }
        class282.method4642();
        if (field1054) {
            method1400();
        } else if (field1065 != -1) {
            method75(field1065, field1061);
        }
        if (field1129 == 3) {
            for (int var2 = 0; var2 < field1120; var2++) {
                if (field1124[var2]) {
                    class282.method4708(field1125[var2], field1067[var2], field1127[var2], field1128[var2], 16711935, 128);
                } else if (field1123[var2]) {
                    class282.method4708(field1125[var2], field1067[var2], field1127[var2], field1128[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field1449;
        int var4 = Statics.field2350.field1234;
        int var5 = Statics.field2350.field1276;
        int var6 = field991;
        for (class83 var7 = (class83) class83.field1326.method3372(); var7 != null; var7 = (class83) class83.field1326.method3358()) {
            if (var7.field1330 != -1 || var7.field1334 != null) {
                int var8 = 0;
                if (var4 > var7.field1328) {
                    var8 += var4 - var7.field1328;
                } else if (var4 < var7.field1323) {
                    var8 += var7.field1323 - var4;
                }
                if (var5 > var7.field1335) {
                    var8 += var5 - var7.field1335;
                } else if (var5 < var7.field1327) {
                    var8 += var7.field1327 - var5;
                }
                if (var8 - 64 > var7.field1329 || field1006 == 0 || var7.field1324 != var3) {
                    if (var7.field1331 != null) {
                        Statics.field614.method1732(var7.field1331);
                        var7.field1331 = null;
                    }
                    if (var7.field1336 != null) {
                        Statics.field614.method1732(var7.field1336);
                        var7.field1336 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = field1006 * (var7.field1329 - var8) / var7.field1329;
                    class106 var10000;
                    if (var7.field1331 != null) {
                        var7.field1331.method1967(var9);
                    } else if (var7.field1330 >= 0) {
                        var10000 = (class106) null;
                        class106 var10 = class106.method1788(Statics.field656, var7.field1330, 0);
                        if (var10 != null) {
                            class108 var11 = var10.method1786().method1824(Statics.field2335);
                            class118 var12 = class118.method1999(var11, 100, var9);
                            var12.method1966(-1);
                            Statics.field614.method1731(var12);
                            var7.field1331 = var12;
                        }
                    }
                    if (var7.field1336 != null) {
                        var7.field1336.method1967(var9);
                        if (!var7.field1336.method3343()) {
                            var7.field1336 = null;
                        }
                    } else if (var7.field1334 != null && (var7.field1325 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field1334.length);
                        var10000 = (class106) null;
                        class106 var14 = class106.method1788(Statics.field656, var7.field1334[var13], 0);
                        if (var14 != null) {
                            class108 var15 = var14.method1786().method1824(Statics.field2335);
                            class118 var16 = class118.method1999(var15, 100, var9);
                            var16.method1966(0);
                            Statics.field614.method1731(var16);
                            var7.field1336 = var16;
                            var7.field1325 = var7.field1332 + (int) (Math.random() * (double) (var7.field1333 - var7.field1332));
                        }
                    }
                }
            }
        }
        field991 = 0;
    }

    @ObfuscatedName("fj.fl(Ljava/lang/String;ZI)V")
    public static final void method2750(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field818.method4480(arg0, 250);
        int var6 = Statics.field818.method4470(arg0, 250) * 13;
        class282.method4722(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4658(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field818.method4478(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method991(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field602.method727(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1120; var11++) {
            if (field1127[var11] + field1125[var11] > var7 && field1125[var11] < var7 + var9 && field1128[var11] + field1067[var11] > var8 && field1067[var11] < var8 + var10) {
                field1123[var11] = true;
            }
        }
    }

    @ObfuscatedName("ji.fk(IIIIB)V")
    public static final void method4560(int arg0, int arg1, int arg2, int arg3) {
        field1020++;
        method1539(class67.field801);
        boolean var4 = false;
        if (field1045 >= 0) {
            int var5 = class97.field1500;
            int[] var6 = class97.field1502;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1045 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1539(class67.field806);
        }
        method3793(true);
        method1539(var4 ? class67.field803 : class67.field807);
        method3793(false);
        method4113();
        method1377();
        method3670(arg0, arg1, arg2, arg3, true);
        int var8 = field1178;
        int var9 = field1151;
        int var10 = field942;
        int var11 = field935;
        class282.method4643(var8, var9, var8 + var10, var9 + var11);
        class137.method2403();
        if (!field988) {
            int var12 = field1108;
            if (field1008 / 256 > var12) {
                var12 = field1008 / 256;
            }
            if (field1165[4] && field1191[4] + 128 > var12) {
                var12 = field1191[4] + 128;
            }
            int var13 = field1126 + field1000 & 0x7FF;
            int var14 = Statics.field405;
            int var15 = method3174(Statics.field2350.field1234, Statics.field2350.field1276, Statics.field1449) - field1005;
            int var16 = Statics.field2259;
            int var17 = var12 * 3 + 600;
            int var18 = 2048 - var12 & 0x7FF;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 0;
            int var21 = 0;
            int var22 = var17;
            if (var18 != 0) {
                int var23 = class137.field2020[var18];
                int var24 = class137.field2044[var18];
                int var25 = var21 * var24 - var17 * var23 >> 16;
                var22 = var21 * var23 + var17 * var24 >> 16;
                var21 = var25;
            }
            if (var19 != 0) {
                int var26 = class137.field2020[var19];
                int var27 = class137.field2044[var19];
                int var28 = var20 * var27 + var22 * var26 >> 16;
                var22 = var22 * var27 - var20 * var26 >> 16;
                var20 = var28;
            }
            Statics.field19 = var14 - var20;
            Statics.field2512 = var15 - var21;
            Statics.field764 = var16 - var22;
            Statics.field979 = var12;
            Statics.field1369 = var13;
        }
        int var29;
        if (field988) {
            int var30;
            if (Statics.field802.field1319) {
                var30 = Statics.field1449;
            } else {
                int var31 = method3174(Statics.field19, Statics.field764, Statics.field1449);
                if (var31 - Statics.field2512 >= 800 || (class62.field737[Statics.field1449][Statics.field19 >> 7][Statics.field764 >> 7] & 0x4) == 0) {
                    var30 = 3;
                } else {
                    var30 = Statics.field1449;
                }
            }
            var29 = var30;
        } else {
            var29 = method155();
        }
        int var32 = Statics.field19;
        int var33 = Statics.field2512;
        int var34 = Statics.field764;
        int var35 = Statics.field979;
        int var36 = Statics.field1369;
        for (int var37 = 0; var37 < 5; var37++) {
            if (field1165[var37]) {
                int var38 = (int) (Math.random() * (double) (field1166[var37] * 2 + 1) - (double) field1166[var37] + Math.sin((double) field1168[var37] / 100.0D * (double) field1169[var37]) * (double) field1191[var37]);
                if (var37 == 0) {
                    Statics.field19 += var38;
                }
                if (var37 == 1) {
                    Statics.field2512 += var38;
                }
                if (var37 == 2) {
                    Statics.field764 += var38;
                }
                if (var37 == 3) {
                    Statics.field1369 = Statics.field1369 + var38 & 0x7FF;
                }
                if (var37 == 4) {
                    Statics.field979 += var38;
                    if (Statics.field979 < 128) {
                        Statics.field979 = 128;
                    }
                    if (Statics.field979 > 383) {
                        Statics.field979 = 383;
                    }
                }
            }
        }
        int var39 = class60.field730;
        int var40 = class60.field716 * 1327680731;
        if (class60.field714 != 0) {
            var39 = class60.field724;
            var40 = class60.field725;
        }
        if (var39 >= var8 && var39 < var8 + var10 && var40 >= var9 && var40 < var9 + var11) {
            int var41 = var39 - var8;
            int var42 = var40 - var9;
            class135.field2002 = var41;
            class135.field2004 = var42;
            class135.field2008 = true;
            class135.field2010 = 0;
            class135.field2005 = false;
        } else {
            class135.method91();
        }
        method190();
        class282.method4722(var8, var9, var10, var11, 0);
        method190();
        int var43 = class137.field2029;
        class137.field2029 = field1060;
        Statics.field752.method2525(Statics.field19, Statics.field2512, Statics.field764, Statics.field979, Statics.field1369, var29);
        class8.method3668();
        class137.field2029 = var43;
        method190();
        Statics.field752.method2498();
        method1575(var8, var9, var10, var11);
        method2305(var8, var9);
        ((class126) Statics.field2040).method2214(field991);
        method1672(var8, var9, var10, var11);
        Statics.field19 = var32;
        Statics.field2512 = var33;
        Statics.field764 = var34;
        Statics.field979 = var35;
        Statics.field1369 = var36;
        if (field922 && class239.method2194(true, false) == 0) {
            field922 = false;
        }
        if (field922) {
            class282.method4722(var8, var9, var10, var11, 0);
            method2750(class226.field2864, false);
        }
    }

    @ObfuscatedName("he.fi(IIIIZI)V")
    public static final void method3670(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }
        int var6 = (field1058 - field1170) * var5 / 100 + field1170;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1176) {
            short var8 = field1176;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1193) {
                var6 = field1193;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4642();
                    class282.method4722(arg0, arg1, var10, arg3, -16777216);
                    class282.method4722(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field976) {
            short var11 = field976;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1174) {
                var6 = field1174;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4642();
                    class282.method4722(arg0, arg1, arg2, var13, -16777216);
                    class282.method4722(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1173 - field1038) * var5 / 100 + field1038;
        field1060 = arg3 * var6 * var14 / 85504 << 1;
        if (field942 != arg2 || field935 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2020[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2519(var15, 500, 800, arg2, arg3);
        }
        field1178 = arg0;
        field1151 = arg1;
        field942 = arg2;
        field935 = arg3;
    }

    @ObfuscatedName("cv.fz(Lbe;I)V")
    public static final void method1539(class67 arg0) {
        if (Statics.field2350.field1234 >> 7 == field1150 && Statics.field2350.field1276 >> 7 == field1157) {
            field1150 = 0;
        }
        int var1 = class97.field1500;
        int[] var2 = class97.field1502;
        int var3 = var1;
        if (class67.field801 == arg0 || class67.field806 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field801 == arg0) {
                var5 = Statics.field2350;
                var6 = Statics.field2350.field893 << 14;
            } else if (class67.field806 == arg0) {
                var5 = field1036[field1045];
                var6 = field1045 << 14;
            } else {
                var5 = field1036[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field803 == arg0 && field1045 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1015() && !var5.field891) {
                var5.field896 = false;
                if ((field919 && var1 > 50 || var1 > 200) && class67.field801 != arg0 && var5.field1256 == var5.field1232) {
                    var5.field896 = true;
                }
                int var7 = var5.field1234 >> 7;
                int var8 = var5.field1276 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field885 == null || field923 < var5.field879 || field923 >= var5.field880) {
                        if ((var5.field1234 & 0x7F) == 64 && (var5.field1276 & 0x7F) == 64) {
                            if (field1020 == field1019[var7][var8]) {
                                continue;
                            }
                            field1019[var7][var8] = field1020;
                        }
                        var5.field878 = method3174(var5.field1234, var5.field1276, Statics.field1449);
                        Statics.field752.method2495(Statics.field1449, var5.field1234, var5.field1276, var5.field878, 60, var5, var5.field1248, var6, var5.field1230);
                    } else {
                        var5.field896 = false;
                        var5.field878 = method3174(var5.field1234, var5.field1276, Statics.field1449);
                        Statics.field752.method2496(Statics.field1449, var5.field1234, var5.field1276, var5.field878, 60, var5, var5.field1248, var6, var5.field889, var5.field890, var5.field887, var5.field871);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hz.fs(ZI)V")
    public static final void method3793(boolean arg0) {
        for (int var1 = 0; var1 < field953; var1++) {
            class87 var2 = field952[field954[var1]];
            int var3 = (field954[var1] << 14) + 536870912;
            if (var2 != null && var2.method1015() && var2.field1379.field3561 == arg0 && var2.field1379.method4354()) {
                int var4 = var2.field1234 >> 7;
                int var5 = var2.field1276 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1231 == 1 && (var2.field1234 & 0x7F) == 64 && (var2.field1276 & 0x7F) == 64) {
                        if (field1020 == field1019[var4][var5]) {
                            continue;
                        }
                        field1019[var4][var5] = field1020;
                    }
                    if (!var2.field1379.field3592) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field752.method2495(Statics.field1449, var2.field1234, var2.field1276, method3174(var2.field1234 + (var2.field1231 * 64 - 64), var2.field1276 + (var2.field1231 * 64 - 64), Statics.field1449), var2.field1231 * 64 - 64 + 60, var2, var2.field1248, var3, var2.field1230);
                }
            }
        }
    }

    @ObfuscatedName("ip.fy(I)V")
    public static final void method4113() {
        for (class94 var0 = (class94) field1048.method3372(); var0 != null; var0 = (class94) field1048.method3358()) {
            if (Statics.field1449 != var0.field1455 || field923 > var0.field1461) {
                var0.method3347();
            } else if (field923 >= var0.field1464) {
                if (var0.field1459 > 0) {
                    class87 var1 = field952[var0.field1459 - 1];
                    if (var1 != null && var1.field1234 >= 0 && var1.field1234 < 13312 && var1.field1276 >= 0 && var1.field1276 < 13312) {
                        var0.method1602(var1.field1234, var1.field1276, method3174(var1.field1234, var1.field1276, var0.field1455) - var0.field1474, field923);
                    }
                }
                if (var0.field1459 < 0) {
                    int var2 = -var0.field1459 - 1;
                    class75 var3;
                    if (field1037 == var2) {
                        var3 = Statics.field2350;
                    } else {
                        var3 = field1036[var2];
                    }
                    if (var3 != null && var3.field1234 >= 0 && var3.field1234 < 13312 && var3.field1276 >= 0 && var3.field1276 < 13312) {
                        var0.method1602(var3.field1234, var3.field1276, method3174(var3.field1234, var3.field1276, var0.field1455) - var0.field1474, field923);
                    }
                }
                var0.method1603(field991);
                Statics.field752.method2495(Statics.field1449, (int) var0.field1466, (int) var0.field1460, (int) var0.field1468, 60, var0, var0.field1457, -1, false);
            }
        }
    }

    @ObfuscatedName("bq.fe(I)V")
    public static final void method1377() {
        for (class85 var0 = (class85) field1049.method3372(); var0 != null; var0 = (class85) field1049.method3358()) {
            if (Statics.field1449 != var0.field1359 || var0.field1362) {
                var0.method3347();
            } else if (field923 >= var0.field1366) {
                var0.method1542(field991);
                if (var0.field1362) {
                    var0.method3347();
                } else {
                    Statics.field752.method2495(var0.field1359, var0.field1368, var0.field1361, var0.field1360, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("w.fh(I)I")
    public static final int method155() {
        if (Statics.field802.field1319) {
            return Statics.field1449;
        }
        int var0 = 3;
        if (Statics.field979 < 310) {
            int var1 = Statics.field19 >> 7;
            int var2 = Statics.field764 >> 7;
            int var3 = Statics.field2350.field1234 >> 7;
            int var4 = Statics.field2350.field1276 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1449;
            }
            if ((class62.field737[Statics.field1449][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1449;
            }
            int var5;
            if (var3 > var1) {
                var5 = var3 - var1;
            } else {
                var5 = var1 - var3;
            }
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var1 < var3) {
                        var1++;
                    } else if (var1 > var3) {
                        var1--;
                    }
                    if ((class62.field737[Statics.field1449][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1449;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class62.field737[Statics.field1449][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1449;
                        }
                    }
                }
            } else {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class62.field737[Statics.field1449][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1449;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class62.field737[Statics.field1449][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1449;
                        }
                    }
                }
            }
        }
        if (Statics.field2350.field1234 >= 0 && Statics.field2350.field1276 >= 0 && Statics.field2350.field1234 < 13312 && Statics.field2350.field1276 < 13312) {
            if ((class62.field737[Statics.field1449][Statics.field2350.field1234 >> 7][Statics.field2350.field1276 >> 7] & 0x4) != 0) {
                var0 = Statics.field1449;
            }
            return var0;
        } else {
            return Statics.field1449;
        }
    }

    @ObfuscatedName("de.fp(III)V")
    public static final void method2305(int arg0, int arg1) {
        if (field931 == 2) {
            method189((field934 - Statics.field749 << 7) + field937, (field1137 - Statics.field357 << 7) + field938, field980 * 2);
            if (field1021 > -1 && field923 % 20 < 10) {
                Statics.field733[0].method4770(field1021 + arg0 - 12, field1164 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("i.gw(Lcs;IIIIIB)V")
    public static final void method8(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1015()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1379;
            if (var6.field3589 != null) {
                var6 = var6.method4372();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1500;
        int[] var8 = class97.field1502;
        int var9 = 3;
        if (!arg0.field1237.method3318()) {
            method2193(arg0, arg0.field1277 + 15);
            for (class86 var10 = (class86) arg0.field1237.method3321(); var10 != null; var10 = (class86) arg0.field1237.method3323()) {
                class80 var11 = var10.method1547(field923);
                if (var11 != null) {
                    class249 var12 = var10.field1374;
                    class286 var13 = var12.method4106();
                    class286 var14 = var12.method4112();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3376;
                    } else {
                        if (var12.field3377 * 2 < var14.field3779) {
                            var15 = var12.field3377;
                        }
                        var16 = var14.field3779 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field923 - var11.field1294;
                    int var20 = var11.field1291 * var16 / var12.field3376;
                    int var23;
                    if (var11.field1292 > var19) {
                        int var21 = var12.field3373 == 0 ? 0 : var19 / var12.field3373 * var12.field3373;
                        int var22 = var11.field1289 * var16 / var12.field3376;
                        var23 = (var20 - var22) * var21 / var11.field1292 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1292 + var12.field3371 - var19;
                        if (var12.field3372 >= 0) {
                            var17 = (var24 << 8) / (var12.field3371 - var12.field3372);
                        }
                    }
                    if (var11.field1291 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1021 + arg2 - (var16 >> 1);
                    int var26 = field1164 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1021 > -1) {
                            class282.method4722(var25, var26, var23, 5, 65280);
                            class282.method4722(var23 + var25, var26, var16 - var23, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var27 = var25 - var15;
                        int var28;
                        if (var16 == var23) {
                            var28 = var15 * 2 + var23;
                        } else {
                            var28 = var15 + var23;
                        }
                        int var29 = var13.field3785;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4776(var27, var26, var17);
                            class282.method4644(var27, var26, var27 + var28, var26 + var29);
                            var14.method4776(var27, var26, var17);
                        } else {
                            var13.method4770(var27, var26);
                            class282.method4644(var27, var26, var27 + var28, var26 + var29);
                            var14.method4770(var27, var26);
                        }
                        class282.method4643(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1548()) {
                    var10.method3347();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field891) {
                return;
            }
            if (var30.field873 != -1 || var30.field874 != -1) {
                method2193(arg0, arg0.field1277 + 15);
                if (field1021 > -1) {
                    if (var30.field873 != -1) {
                        Statics.field397[var30.field873].method4770(field1021 + arg2 - 12, field1164 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field874 != -1) {
                        Statics.field298[var30.field874].method4770(field1021 + arg2 - 12, field1164 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field931 == 10 && field1167 == var8[arg1]) {
                method2193(arg0, arg0.field1277 + 15);
                if (field1021 > -1) {
                    Statics.field733[1].method4770(field1021 + arg2 - 12, field1164 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1379;
            if (var31.field3589 != null) {
                var31 = var31.method4372();
            }
            if (var31.field3584 >= 0 && var31.field3584 < Statics.field298.length) {
                method2193(arg0, arg0.field1277 + 15);
                if (field1021 > -1) {
                    Statics.field298[var31.field3584].method4770(field1021 + arg2 - 12, field1164 + arg3 - 30);
                }
            }
            if (field931 == 1 && field932 == field954[arg1 - var7] && field923 % 20 < 10) {
                method2193(arg0, arg0.field1277 + 15);
                if (field1021 > -1) {
                    Statics.field733[0].method4770(field1021 + arg2 - 12, field1164 + arg3 - 28);
                }
            }
        }
        if (arg0.field1271 != null && (arg1 >= var7 || !arg0.field1242 && (field939 == 4 || !arg0.field1241 && (field939 == 0 || field939 == 3 || field939 == 1 && method27(((class75) arg0).field888, false))))) {
            method2193(arg0, arg0.field1277);
            if (field1021 > -1 && field1009 < field1010) {
                field1039[field1009] = Statics.field3289.method4467(arg0.field1271) / 2;
                field1013[field1009] = Statics.field3289.field3653;
                field1011[field1009] = field1021;
                field1106[field1009] = field1164;
                field983[field1009] = arg0.field1244;
                field1018[field1009] = arg0.field1245;
                field1086[field1009] = arg0.field1267;
                field969[field1009] = arg0.field1271;
                field1009++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1264[var32];
            int var34 = arg0.field1247[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field923) {
                    continue;
                }
                var35 = class255.method4618(arg0.field1247[var32]);
                var36 = var35.field3427;
                if (var35 != null && var35.field3418 != null) {
                    var35 = var35.method4197();
                    if (var35 == null) {
                        arg0.field1264[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1263[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method4618(var37);
                if (var38 != null && var38.field3418 != null) {
                    var38 = var38.method4197();
                }
            }
            if (var33 - var36 <= field923) {
                if (var35 == null) {
                    arg0.field1264[var32] = -1;
                } else {
                    method2193(arg0, arg0.field1277 / 2);
                    if (field1021 > -1) {
                        if (var32 == 1) {
                            field1164 -= 20;
                        }
                        if (var32 == 2) {
                            field1021 -= 15;
                            field1164 -= 10;
                        }
                        if (var32 == 3) {
                            field1021 += 15;
                            field1164 -= 10;
                        }
                        Object var39 = null;
                        Object var40 = null;
                        Object var41 = null;
                        Object var42 = null;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        class286 var51 = null;
                        class286 var52 = null;
                        class286 var53 = null;
                        class286 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class286 var64 = var35.method4195();
                        if (var64 != null) {
                            var43 = var64.field3779;
                            int var65 = var64.field3785;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3782;
                        }
                        class286 var66 = var35.method4196();
                        if (var66 != null) {
                            var44 = var66.field3779;
                            int var67 = var66.field3785;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3782;
                        }
                        class286 var68 = var35.method4192();
                        if (var68 != null) {
                            var45 = var68.field3779;
                            int var69 = var68.field3785;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3782;
                        }
                        class286 var70 = var35.method4198();
                        if (var70 != null) {
                            var46 = var70.field3779;
                            int var71 = var70.field3785;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3782;
                        }
                        if (var38 != null) {
                            var51 = var38.method4195();
                            if (var51 != null) {
                                var55 = var51.field3779;
                                int var72 = var51.field3785;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3782;
                            }
                            var52 = var38.method4196();
                            if (var52 != null) {
                                var56 = var52.field3779;
                                int var73 = var52.field3785;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3782;
                            }
                            var53 = var38.method4192();
                            if (var53 != null) {
                                var57 = var53.field3779;
                                int var74 = var53.field3785;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3782;
                            }
                            var54 = var38.method4198();
                            if (var54 != null) {
                                var58 = var54.field3779;
                                int var75 = var54.field3785;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3782;
                            }
                        }
                        class264 var76 = var35.method4199();
                        if (var76 == null) {
                            var76 = Statics.field3630;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field3630;
                        } else {
                            var77 = var38.method4199();
                            if (var77 == null) {
                                var77 = Statics.field3630;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4201(arg0.field1252[var32]);
                        int var83 = var76.method4467(var82);
                        if (var38 != null) {
                            var79 = var38.method4201(arg0.field1251[var32]);
                            var81 = var77.method4467(var79);
                        }
                        int var84 = 0;
                        int var85 = 0;
                        if (var44 > 0) {
                            if (var68 == null && var70 == null) {
                                var84 = 1;
                            } else {
                                var84 = var83 / var44 + 1;
                            }
                        }
                        if (var38 != null && var56 > 0) {
                            if (var53 == null && var54 == null) {
                                var85 = 1;
                            } else {
                                var85 = var81 / var56 + 1;
                            }
                        }
                        int var86 = 0;
                        int var87 = var86;
                        if (var43 > 0) {
                            var86 += var43;
                        }
                        var86 += 2;
                        int var88 = var86;
                        if (var45 > 0) {
                            var86 += var45;
                        }
                        int var89 = var86;
                        int var90 = var86;
                        int var92;
                        if (var44 > 0) {
                            int var91 = var44 * var84;
                            var92 = var86 + var91;
                            var90 = (var91 - var83) / 2 + var86;
                        } else {
                            var92 = var83 + var86;
                        }
                        int var93 = var92;
                        if (var46 > 0) {
                            var92 += var46;
                        }
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        int var97 = 0;
                        int var98 = 0;
                        if (var38 != null) {
                            var92 += 2;
                            var94 = var92;
                            if (var55 > 0) {
                                var92 += var55;
                            }
                            var92 += 2;
                            var95 = var92;
                            if (var57 > 0) {
                                var92 += var57;
                            }
                            var96 = var92;
                            var98 = var92;
                            if (var56 > 0) {
                                int var99 = var56 * var85;
                                var92 += var99;
                                var98 += (var99 - var81) / 2;
                            } else {
                                var92 += var81;
                            }
                            var97 = var92;
                            if (var58 > 0) {
                                var92 += var58;
                            }
                        }
                        int var100 = arg0.field1264[var32] - field923;
                        int var101 = var35.field3432 - var35.field3432 * var100 / var35.field3427;
                        int var102 = var35.field3433 * var100 / var35.field3427 + -var35.field3433;
                        int var103 = field1021 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1164 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3419 + var104 + 15;
                        int var108 = var107 - var76.field3668;
                        int var109 = var76.field3655 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3419 + var104 + 15;
                            int var111 = var110 - var77.field3668;
                            int var112 = var77.field3655 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3430 >= 0) {
                            var115 = (var100 << 8) / (var35.field3427 - var35.field3430);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4776(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4776(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4776(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4776(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4473(var82, var90 + var103, var107, var35.field3426, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4776(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4776(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4776(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4776(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4473(var79, var98 + var103, var110, var38.field3426, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4770(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4770(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4770(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4770(var93 + var103 - var50, var104);
                            }
                            var76.method4472(var82, var90 + var103, var107, var35.field3426 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4770(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4770(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4770(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4770(var97 + var103 - var62, var104);
                                }
                                var77.method4472(var79, var98 + var103, var110, var38.field3426 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.gf(IIIIB)V")
    public static final void method1575(int arg0, int arg1, int arg2, int arg3) {
        field1009 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class97.field1500;
        int[] var7 = class97.field1502;
        for (int var8 = 0; var8 < field953 + var6; var8++) {
            class79 var9;
            if (var8 < var6) {
                var9 = field1036[var7[var8]];
                if (field1045 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field952[field954[var8 - var6]];
            }
            method8(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method8(field1036[field1045], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field1009; var10++) {
            int var11 = field1011[var10];
            int var12 = field1106[var10];
            int var13 = field1039[var10];
            int var14 = field1013[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field1106[var16] - field1013[var16] && var12 - var14 < field1106[var16] + 2 && var11 - var13 < field1039[var16] + field1011[var16] && var11 + var13 > field1011[var16] - field1039[var16] && field1106[var16] - field1013[var16] < var12) {
                        var12 = field1106[var16] - field1013[var16];
                        var15 = true;
                    }
                }
            }
            field1021 = field1011[var10];
            field1164 = field1106[var10] = var12;
            String var17 = field969[var10];
            if (field1079 == 0) {
                int var18 = 16776960;
                if (field983[var10] < 6) {
                    var18 = field1064[field983[var10]];
                }
                if (field983[var10] == 6) {
                    var18 = field1020 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field983[var10] == 7) {
                    var18 = field1020 % 20 < 10 ? 255 : 65535;
                }
                if (field983[var10] == 8) {
                    var18 = field1020 % 20 < 10 ? 45056 : 8454016;
                }
                if (field983[var10] == 9) {
                    int var19 = 150 - field1086[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field983[var10] == 10) {
                    int var20 = 150 - field1086[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field983[var10] == 11) {
                    int var21 = 150 - field1086[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field1018[var10] == 0) {
                    Statics.field3289.method4507(var17, field1021 + arg0, field1164 + arg1, var18, 0);
                }
                if (field1018[var10] == 1) {
                    Statics.field3289.method4476(var17, field1021 + arg0, field1164 + arg1, var18, 0, field1020);
                }
                if (field1018[var10] == 2) {
                    Statics.field3289.method4474(var17, field1021 + arg0, field1164 + arg1, var18, 0, field1020);
                }
                if (field1018[var10] == 3) {
                    Statics.field3289.method4503(var17, field1021 + arg0, field1164 + arg1, var18, 0, field1020, 150 - field1086[var10]);
                }
                if (field1018[var10] == 4) {
                    int var22 = (150 - field1086[var10]) * (Statics.field3289.method4467(var17) + 100) / 150;
                    class282.method4644(field1021 + arg0 - 50, arg1, field1021 + arg0 + 50, arg1 + arg3);
                    Statics.field3289.method4472(var17, field1021 + arg0 + 50 - var22, field1164 + arg1, var18, 0);
                    class282.method4643(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field1018[var10] == 5) {
                    int var23 = 150 - field1086[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class282.method4644(arg0, field1164 + arg1 - Statics.field3289.field3653 - 1, arg0 + arg2, field1164 + arg1 + 5);
                    Statics.field3289.method4507(var17, field1021 + arg0, field1164 + arg1 + var24, var18, 0);
                    class282.method4643(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3289.method4507(var17, field1021 + arg0, field1164 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("cq.gb(IIIIB)V")
    public static final void method1672(int arg0, int arg1, int arg2, int arg3) {
        if (field1196 == 1) {
            Statics.field868[field1025 / 100].method4770(field1023 - 8, field971 - 8);
        }
        if (field1196 == 2) {
            Statics.field868[field1025 / 100 + 4].method4770(field1023 - 8, field971 - 8);
        }
        field1035 = 0;
        int var4 = (Statics.field2350.field1234 >> 7) + Statics.field749;
        int var5 = (Statics.field2350.field1276 >> 7) + Statics.field357;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field1035 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field1035 = 1;
        }
        if (field1035 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field1035 = 0;
        }
    }

    @ObfuscatedName("dg.gh(Lcs;II)V")
    public static final void method2193(class79 arg0, int arg1) {
        method189(arg0.field1234, arg0.field1276, arg1);
    }

    @ObfuscatedName("d.gj(IIII)V")
    public static final void method189(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1021 = -1;
            field1164 = -1;
            return;
        }
        int var3 = method3174(arg0, arg1, Statics.field1449) - arg2;
        int var4 = arg0 - Statics.field19;
        int var5 = var3 - Statics.field2512;
        int var6 = arg1 - Statics.field764;
        int var7 = class137.field2020[Statics.field979];
        int var8 = class137.field2044[Statics.field979];
        int var9 = class137.field2020[Statics.field1369];
        int var10 = class137.field2044[Statics.field1369];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1021 = field1060 * var11 / var15 + field942 / 2;
            field1164 = field1060 * var14 / var15 + field935 / 2;
        } else {
            field1021 = -1;
            field1164 = -1;
        }
    }

    @ObfuscatedName("fp.gg(IIIB)I")
    public static final int method3174(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field737[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field748[var5][var3][var4] + class62.field748[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field748[var5][var3][var4 + 1] + class62.field748[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bh.gc(IIZI)V")
    public static final void method882(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field477 == arg0 && Statics.field1492 == arg1) {
            return;
        }
        Statics.field477 = arg0;
        Statics.field1492 = arg1;
        method9(25);
        method2750(class226.field2864, true);
        int var3 = Statics.field749;
        int var4 = Statics.field357;
        Statics.field749 = (arg0 - 6) * 8;
        Statics.field357 = (arg1 - 6) * 8;
        int var5 = Statics.field749 - var3;
        int var6 = Statics.field357 - var4;
        int var7 = Statics.field749;
        int var8 = Statics.field357;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field952[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1282[var11] -= var5;
                    var10.field1283[var11] -= var6;
                }
                var10.field1234 -= var5 * 128;
                var10.field1276 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1036[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1282[var14] -= var5;
                    var13.field1283[var14] -= var6;
                }
                var13.field1234 -= var5 * 128;
                var13.field1276 -= var6 * 128;
            }
        }
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var5 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var6 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var22 = var18; var22 != var19; var22 += var20) {
                int var23 = var5 + var21;
                int var24 = var6 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        field1046[var25][var21][var22] = field1046[var25][var23][var24];
                    } else {
                        field1046[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1047.method3372(); var26 != null; var26 = (class77) field1047.method3358()) {
            var26.field1201 -= var5;
            var26.field1202 -= var6;
            if (var26.field1201 < 0 || var26.field1202 < 0 || var26.field1201 >= 104 || var26.field1202 >= 104) {
                var26.method3347();
            }
        }
        if (field1150 != 0) {
            field1150 -= var5;
            field1157 -= var6;
        }
        field1078 = 0;
        field988 = false;
        field1145 = -1;
        field1049.method3351();
        field1048.method3351();
        for (int var27 = 0; var27 < 4; var27++) {
            field975[var27].method2782();
        }
    }

    @ObfuscatedName("ex.gz(ZI)V")
    public static final void method2689(boolean arg0) {
        method190();
        field963++;
        if (field963 < 50 && !arg0) {
            return;
        }
        field963 = 0;
        if (field968 || Statics.field243 == null) {
            return;
        }
        field957.method3159(36);
        try {
            Statics.field243.method2759(field957.field2401, 0, field957.field2400);
            field957.field2400 = 0;
        } catch (IOException var2) {
            field968 = true;
        }
    }

    @ObfuscatedName("gq.gm(IIIIII)V")
    public static final void method3523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field752.method2510(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field752.method2579(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1788.field3788;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = class256.method937(var12);
            if (var13.field3472 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            } else {
                class285 var14 = Statics.field865[var13.field3472];
                if (var14 != null) {
                    int var15 = (var13.field3458 * 4 - var14.field3773) / 2;
                    int var16 = (var13.field3446 * 4 - var14.field3775) / 2;
                    var14.method4739(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3446) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field752.method2512(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field752.method2579(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = class256.method937(var21);
            if (var22.field3472 != -1) {
                class285 var23 = Statics.field865[var22.field3472];
                if (var23 != null) {
                    int var24 = (var22.field3458 * 4 - var23.field3773) / 2;
                    int var25 = (var22.field3446 * 4 - var23.field3775) / 2;
                    var23.method4739(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3446) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1788.field3788;
                int var28 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var27[var28 + 1536] = var26;
                    var27[var28 + 1024 + 1] = var26;
                    var27[var28 + 512 + 2] = var26;
                    var27[var28 + 3] = var26;
                } else {
                    var27[var28] = var26;
                    var27[var28 + 512 + 1] = var26;
                    var27[var28 + 1024 + 2] = var26;
                    var27[var28 + 1536 + 3] = var26;
                }
            }
        }
        int var29 = Statics.field752.method2513(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = class256.method937(var30);
        if (var31.field3472 == -1) {
            return;
        }
        class285 var32 = Statics.field865[var31.field3472];
        if (var32 != null) {
            int var33 = (var31.field3458 * 4 - var32.field3773) / 2;
            int var34 = (var31.field3446 * 4 - var32.field3775) / 2;
            var32.method4739(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3446) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gr(I)Z")
    public final boolean method1053() {
        if (Statics.field243 == null) {
            return false;
        }
        try {
            int var1 = Statics.field243.method2757();
            if (var1 == 0) {
                return false;
            }
            if (field961 == -1) {
                Statics.field243.method2765(field959.field2401, 0, 1);
                field959.field2400 = 0;
                field961 = field959.method3148();
                field960 = class273.field3706[field961];
                var1--;
            }
            if (field960 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field243.method2765(field959.field2401, 0, 1);
                field960 = field959.field2401[0] & 0xFF;
                var1--;
            }
            if (field960 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field243.method2765(field959.field2401, 0, 2);
                field959.field2400 = 0;
                field960 = field959.method3065();
                var1 -= 2;
            }
            if (var1 < field960) {
                return false;
            }
            field959.field2400 = 0;
            Statics.field243.method2765(field959.field2401, 0, field960);
            field962 = 0;
            field966 = field965;
            field965 = field964;
            field964 = field961;
            if (field961 == 208) {
                method4080(field959.method3098());
                field961 = -1;
                return true;
            }
            if (field961 == 203) {
                int var2 = field959.method2966();
                Statics.field1388 = Statics.field679.method2716(var2);
                field961 = -1;
                return true;
            }
            if (field961 == 17) {
                int var3 = field959.method2958();
                field993 = var3;
                this.method1056(false);
                method171(var3);
                class84.method4601(field993);
                for (int var4 = 0; var4 < 100; var4++) {
                    field1122[var4] = true;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 226) {
                method492();
                field1007 = field959.method2925();
                field1114 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 67) {
                field939 = field959.method2925();
                field1134 = field959.method2925();
                field961 = -1;
                return true;
            }
            if (field961 == 35) {
                int var5 = field959.method3058();
                int var6 = field959.method3065();
                int var7 = var6 >> 10 & 0x1F;
                int var8 = var6 >> 5 & 0x1F;
                int var9 = var6 & 0x1F;
                int var10 = (var9 << 3) + (var7 << 19) + (var8 << 11);
                class217 var11 = class217.method3143(var5);
                if (var11.field2785 != var10) {
                    var11.field2785 = var10;
                    method1404(var11);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 64) {
                String var12 = field959.method3098();
                int var13 = field959.method3065();
                byte var14 = field959.method2922();
                boolean var15 = false;
                if (var14 == -128) {
                    var15 = true;
                }
                if (var15) {
                    if (Statics.field370 == 0) {
                        field961 = -1;
                        return true;
                    }
                    boolean var16 = false;
                    int var17;
                    for (var17 = 0; var17 < Statics.field370 && (!Statics.field17[var17].field912.equals(var12) || Statics.field17[var17].field900 != var13); var17++) {
                    }
                    if (var17 < Statics.field370) {
                        while (var17 < Statics.field370 - 1) {
                            Statics.field17[var17] = Statics.field17[var17 + 1];
                            var17++;
                        }
                        Statics.field370--;
                        Statics.field17[Statics.field370] = null;
                    }
                } else {
                    field959.method3098();
                    class76 var18 = new class76();
                    var18.field912 = var12;
                    var18.field899 = Statics.method2789(var18.field912, Statics.field282);
                    var18.field900 = var13;
                    var18.field901 = var14;
                    int var19;
                    for (var19 = Statics.field370 - 1; var19 >= 0; var19--) {
                        int var20 = Statics.field17[var19].field899.compareTo(var18.field899);
                        if (var20 == 0) {
                            Statics.field17[var19].field900 = var13;
                            Statics.field17[var19].field901 = var14;
                            if (var12.equals(Statics.field2350.field888)) {
                                Statics.field1694 = var14;
                            }
                            field1014 = field1111;
                            field961 = -1;
                            return true;
                        }
                        if (var20 < 0) {
                            break;
                        }
                    }
                    if (Statics.field370 >= Statics.field17.length) {
                        field961 = -1;
                        return true;
                    }
                    for (int var21 = Statics.field370 - 1; var21 > var19; var21--) {
                        Statics.field17[var21 + 1] = Statics.field17[var21];
                    }
                    if (Statics.field370 == 0) {
                        Statics.field17 = new class76[100];
                    }
                    Statics.field17[var19 + 1] = var18;
                    Statics.field370++;
                    if (var12.equals(Statics.field2350.field888)) {
                        Statics.field1694 = var14;
                    }
                }
                field1014 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 219) {
                int var22 = field959.method3065();
                int var23 = field959.method2968();
                class217 var24 = class217.method3143(var23);
                if (var24 != null && var24.field2655 == 0) {
                    if (var22 > var24.field2677 - var24.field2693) {
                        var22 = var24.field2677 - var24.field2693;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var24.field2641 != var22) {
                        var24.field2641 = var22;
                        method1404(var24);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 217) {
                method154();
                field961 = -1;
                return false;
            }
            if (field961 == 114) {
                int var25 = field959.method3058();
                int var26 = field959.method3065();
                if (var25 < -70000) {
                    var26 += 32768;
                }
                class217 var27;
                if (var25 >= 0) {
                    var27 = class217.method3143(var25);
                } else {
                    var27 = null;
                }
                while (field959.field2400 < field960) {
                    int var28 = field959.method2934();
                    int var29 = field959.method3065();
                    int var30 = 0;
                    if (var29 != 0) {
                        var30 = field959.method2925();
                        if (var30 == 255) {
                            var30 = field959.method3058();
                        }
                    }
                    if (var27 != null && var28 >= 0 && var28 < var27.field2659.length) {
                        var27.field2659[var28] = var29;
                        var27.field2772[var28] = var30;
                    }
                    class64.method1399(var26, var28, var29 - 1, var30);
                }
                if (var27 != null) {
                    method1404(var27);
                }
                method492();
                field930[++field925 - 1 & 0x1F] = var26 & 0x7FFF;
                field961 = -1;
                return true;
            }
            if (field961 == 82) {
                field988 = true;
                Statics.field274 = field959.method2925();
                Statics.field857 = field959.method2925();
                Statics.field2430 = field959.method3065();
                Statics.field374 = field959.method2925();
                Statics.field2137 = field959.method2925();
                if (Statics.field2137 >= 100) {
                    Statics.field19 = Statics.field274 * 128 + 64;
                    Statics.field764 = Statics.field857 * 128 + 64;
                    Statics.field2512 = method3174(Statics.field19, Statics.field764, Statics.field1449) - Statics.field2430;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 63) {
                int var31 = field959.method2958();
                byte var32 = field959.method2922();
                class212.field2613[var31] = var32;
                if (class212.field2615[var31] != var32) {
                    class212.field2615[var31] = var32;
                }
                method1378(var31);
                field1103[++field1104 - 1 & 0x1F] = var31;
                field961 = -1;
                return true;
            }
            if (field961 == 157) {
                Statics.method2172(false);
                field959.method3148();
                int var33 = field959.method3065();
                class180 var34 = field959;
                int var35 = var34.field2400;
                class97.field1508 = 0;
                int var36 = 0;
                var34.method3149();
                for (int var37 = 0; var37 < class97.field1500; var37++) {
                    int var38 = class97.field1502[var37];
                    if ((class97.field1504[var38] & 0x1) == 0) {
                        if (var36 > 0) {
                            var36--;
                            class97.field1504[var38] = (byte) (class97.field1504[var38] | 0x2);
                        } else {
                            int var39 = var34.method3150(1);
                            if (var39 == 0) {
                                var36 = class97.method975(var34);
                                class97.field1504[var38] = (byte) (class97.field1504[var38] | 0x2);
                            } else {
                                class97.method161(var34, var38);
                            }
                        }
                    }
                }
                var34.method3151();
                if (var36 != 0) {
                    throw new RuntimeException();
                }
                var34.method3149();
                for (int var40 = 0; var40 < class97.field1500; var40++) {
                    int var41 = class97.field1502[var40];
                    if ((class97.field1504[var41] & 0x1) != 0) {
                        if (var36 > 0) {
                            var36--;
                            class97.field1504[var41] = (byte) (class97.field1504[var41] | 0x2);
                        } else {
                            int var42 = var34.method3150(1);
                            if (var42 == 0) {
                                var36 = class97.method975(var34);
                                class97.field1504[var41] = (byte) (class97.field1504[var41] | 0x2);
                            } else {
                                class97.method161(var34, var41);
                            }
                        }
                    }
                }
                var34.method3151();
                if (var36 != 0) {
                    throw new RuntimeException();
                }
                var34.method3149();
                for (int var43 = 0; var43 < class97.field1503; var43++) {
                    int var44 = class97.field1512[var43];
                    if ((class97.field1504[var44] & 0x1) != 0) {
                        if (var36 > 0) {
                            var36--;
                            class97.field1504[var44] = (byte) (class97.field1504[var44] | 0x2);
                        } else {
                            int var45 = var34.method3150(1);
                            if (var45 == 0) {
                                var36 = class97.method975(var34);
                                class97.field1504[var44] = (byte) (class97.field1504[var44] | 0x2);
                            } else if (class97.method1563(var34, var44)) {
                                class97.field1504[var44] = (byte) (class97.field1504[var44] | 0x2);
                            }
                        }
                    }
                }
                var34.method3151();
                if (var36 != 0) {
                    throw new RuntimeException();
                }
                var34.method3149();
                for (int var46 = 0; var46 < class97.field1503; var46++) {
                    int var47 = class97.field1512[var46];
                    if ((class97.field1504[var47] & 0x1) == 0) {
                        if (var36 > 0) {
                            var36--;
                            class97.field1504[var47] = (byte) (class97.field1504[var47] | 0x2);
                        } else {
                            int var48 = var34.method3150(1);
                            if (var48 == 0) {
                                var36 = class97.method975(var34);
                                class97.field1504[var47] = (byte) (class97.field1504[var47] | 0x2);
                            } else if (class97.method1563(var34, var47)) {
                                class97.field1504[var47] = (byte) (class97.field1504[var47] | 0x2);
                            }
                        }
                    }
                }
                var34.method3151();
                if (var36 != 0) {
                    throw new RuntimeException();
                }
                class97.field1500 = 0;
                class97.field1503 = 0;
                for (int var49 = 1; var49 < 2048; var49++) {
                    class97.field1504[var49] = (byte) (class97.field1504[var49] >> 1);
                    class75 var50 = field1036[var49];
                    if (var50 == null) {
                        class97.field1512[++class97.field1503 - 1] = var49;
                    } else {
                        class97.field1502[++class97.field1500 - 1] = var49;
                    }
                }
                for (int var51 = 0; var51 < class97.field1508; var51++) {
                    int var52 = class97.field1509[var51];
                    class75 var53 = field1036[var52];
                    int var54 = var34.method2925();
                    if ((var54 & 0x8) != 0) {
                        var54 += var34.method2925() << 8;
                    }
                    byte var55 = -1;
                    if ((var54 & 0x1) != 0) {
                        int var56 = var34.method2925();
                        byte[] var57 = new byte[var56];
                        class174 var58 = new class174(var57);
                        var34.method3005(var57, 0, var56);
                        class97.field1498[var52] = var58;
                        var53.method1022(var58);
                    }
                    if ((var54 & 0x80) != 0) {
                        int var59 = var34.method3065();
                        if (var59 == 65535) {
                            var59 = -1;
                        }
                        int var60 = var34.method2925();
                        method466(var53, var59, var60);
                    }
                    if ((var54 & 0x4) != 0) {
                        var53.field1285 = var34.method3065();
                        if (var53.field1285 == 65535) {
                            var53.field1285 = -1;
                        }
                    }
                    if ((var54 & 0x20) != 0) {
                        var53.field1271 = var34.method3098();
                        if (var53.field1271.charAt(0) == '~') {
                            var53.field1271 = var53.field1271.substring(1);
                            class99.method1689(2, var53.field888, var53.field1271);
                        } else if (Statics.field2350 == var53) {
                            class99.method1689(2, var53.field888, var53.field1271);
                        }
                        var53.field1241 = false;
                        var53.field1244 = 0;
                        var53.field1245 = 0;
                        var53.field1267 = 150;
                    }
                    if ((var54 & 0x10) != 0) {
                        int var61 = var34.method2925();
                        if (var61 > 0) {
                            for (int var62 = 0; var62 < var61; var62++) {
                                int var63 = -1;
                                int var64 = -1;
                                int var65 = -1;
                                int var66 = var34.method2934();
                                if (var66 == 32767) {
                                    var66 = var34.method2934();
                                    var64 = var34.method2934();
                                    var63 = var34.method2934();
                                    var65 = var34.method2934();
                                } else if (var66 == 32766) {
                                    var66 = -1;
                                } else {
                                    var64 = var34.method2934();
                                }
                                int var67 = var34.method2934();
                                var53.method1392(var66, var64, var63, var65, field923, var67);
                            }
                        }
                        int var68 = var34.method2925();
                        if (var68 > 0) {
                            for (int var69 = 0; var69 < var68; var69++) {
                                int var70 = var34.method2934();
                                int var71 = var34.method2934();
                                if (var71 == 32767) {
                                    var53.method1396(var70);
                                } else {
                                    int var72 = var34.method2934();
                                    int var73 = var34.method2925();
                                    int var74 = var71 > 0 ? var34.method2925() : var73;
                                    var53.method1389(var70, field923, var71, var72, var73, var74);
                                }
                            }
                        }
                    }
                    if ((var54 & 0x2) != 0) {
                        var53.field1255 = var34.method3065();
                        if (var53.field1281 == 0) {
                            var53.field1253 = var53.field1255;
                            var53.field1255 = -1;
                        }
                    }
                    if ((var54 & 0x40) != 0) {
                        int var75 = var34.method3065();
                        class231 var76 = (class231) class169.method1611(class231.method2845(), var34.method2925());
                        boolean var77 = var34.method2925() == 1;
                        int var78 = var34.method2925();
                        int var79 = var34.field2400;
                        if (var53.field888 != null && var53.field886 != null) {
                            boolean var80 = false;
                            if (var76.field3177 && method2886(var53.field888)) {
                                var80 = true;
                            }
                            if (!var80 && field1035 == 0 && !var53.field891) {
                                class97.field1510.field2400 = 0;
                                var34.method3005(class97.field1510.field2401, 0, var78);
                                class97.field1510.field2400 = 0;
                                class174 var81 = class97.field1510;
                                String var85;
                                try {
                                    int var82 = var81.method2934();
                                    if (var82 > 32767) {
                                        var82 = 32767;
                                    }
                                    byte[] var83 = new byte[var82];
                                    var81.field2400 += Statics.field3671.method2841(var81.field2401, var81.field2400, var83, 0, var82);
                                    String var84 = class267.method477(var83, 0, var82);
                                    var85 = var84;
                                } catch (Exception var499) {
                                    var85 = "Cabbage";
                                }
                                String var88 = class265.method4497(class271.method3926(var85));
                                var53.field1271 = var88.trim();
                                var53.field1244 = var75 >> 8;
                                var53.field1245 = var75 & 0xFF;
                                var53.field1267 = 150;
                                var53.field1241 = var77;
                                var53.field1242 = Statics.field2350 != var53 && var76.field3177 && field1015 != "" && var88.toLowerCase().indexOf(field1015) == -1;
                                int var89;
                                if (var76.field3180) {
                                    var89 = var77 ? 91 : 1;
                                } else {
                                    var89 = var77 ? 90 : 2;
                                }
                                if (var76.field3175 == -1) {
                                    class99.method1689(var89, var53.field888, var88);
                                } else {
                                    class99.method1689(var89, class89.method971(var76.field3175) + var53.field888, var88);
                                }
                            }
                        }
                        var34.field2400 = var78 + var79;
                    }
                    if ((var54 & 0x400) != 0) {
                        var53.field1246 = var34.method3065();
                        int var90 = var34.method3058();
                        var53.field1280 = var90 >> 16;
                        var53.field1257 = (var90 & 0xFFFF) + field923;
                        var53.field1265 = 0;
                        var53.field1250 = 0;
                        if (var53.field1257 > field923) {
                            var53.field1265 = -1;
                        }
                        if (var53.field1246 == 65535) {
                            var53.field1246 = -1;
                        }
                    }
                    if ((var54 & 0x100) != 0) {
                        var53.field1269 = var34.method2922();
                        var53.field1287 = var34.method2922();
                        var53.field1270 = var34.method2922();
                        var53.field1272 = var34.method2922();
                        var53.field1273 = var34.method3065() + field923;
                        var53.field1274 = var34.method3065() + field923;
                        var53.field1275 = var34.method3065();
                        if (var53.field894) {
                            var53.field1269 += var53.field895;
                            var53.field1287 += var53.field876;
                            var53.field1270 += var53.field895;
                            var53.field1272 += var53.field876;
                            var53.field1281 = 0;
                        } else {
                            var53.field1269 += var53.field1282[0];
                            var53.field1287 += var53.field1283[0];
                            var53.field1270 += var53.field1282[0];
                            var53.field1272 += var53.field1283[0];
                            var53.field1281 = 1;
                        }
                        var53.field1286 = 0;
                    }
                    if ((var54 & 0x1000) != 0) {
                        class97.field1499[var52] = var34.method2922();
                    }
                    if ((var54 & 0x800) != 0) {
                        var55 = var34.method2922();
                    }
                    if ((var54 & 0x200) != 0) {
                        for (int var91 = 0; var91 < 3; var91++) {
                            var53.field875[var91] = var34.method3098();
                        }
                    }
                    if (var53.field894) {
                        if (var55 == 127) {
                            var53.method1036(var53.field895, var53.field876);
                        } else {
                            byte var92;
                            if (var55 == -1) {
                                var92 = class97.field1499[var52];
                            } else {
                                var92 = var55;
                            }
                            var53.method1009(var53.field895, var53.field876, var92);
                        }
                    }
                }
                if (var34.field2400 - var35 != var33) {
                    throw new RuntimeException(var34.field2400 - var35 + " " + var33);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 5 || field961 == 27 || field961 == 31 || field961 == 246 || field961 == 236 || field961 == 77 || field961 == 180 || field961 == 47 || field961 == 90 || field961 == 173) {
                method456();
                field961 = -1;
                return true;
            }
            if (field961 == 68) {
                for (int var93 = 0; var93 < Statics.field3290; var93++) {
                    class242 var94 = Statics.method1614(var93);
                    if (var94 != null) {
                        class212.field2613[var93] = 0;
                        class212.field2615[var93] = 0;
                    }
                }
                method492();
                field1104 += 32;
                field961 = -1;
                return true;
            }
            if (field961 == 4) {
                for (int var95 = 0; var95 < field1036.length; var95++) {
                    if (field1036[var95] != null) {
                        field1036[var95].field1228 = -1;
                    }
                }
                for (int var96 = 0; var96 < field952.length; var96++) {
                    if (field952[var96] != null) {
                        field952[var96].field1228 = -1;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 169) {
                int var97 = field959.method2968();
                class217 var98 = class217.method3143(var97);
                for (int var99 = 0; var99 < var98.field2659.length; var99++) {
                    var98.field2659[var99] = -1;
                    var98.field2659[var99] = 0;
                }
                method1404(var98);
                field961 = -1;
                return true;
            }
            if (field961 == 11) {
                int var100 = field959.method2935();
                String var101 = field959.method3098();
                class217 var102 = class217.method3143(var100);
                if (!var101.equals(var102.field2644)) {
                    var102.field2644 = var101;
                    method1404(var102);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 57) {
                String var103 = field959.method3098();
                Object[] var104 = new Object[var103.length() + 1];
                for (int var105 = var103.length() - 1; var105 >= 0; var105--) {
                    if (var103.charAt(var105) == 's') {
                        var104[var105 + 1] = field959.method3098();
                    } else {
                        var104[var105 + 1] = Integer.valueOf(field959.method3058());
                    }
                }
                var104[0] = Integer.valueOf(field959.method3058());
                class70 var106 = new class70();
                var106.field834 = var104;
                class84.method3815(var106);
                field961 = -1;
                return true;
            }
            if (field961 == 245) {
                int var107 = field959.method2925();
                if (field959.method2925() == 0) {
                    field1192[var107] = new class17();
                    field959.field2400 += 18;
                } else {
                    field959.field2400--;
                    field1192[var107] = new class17(field959, false);
                }
                field1112 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 207) {
                int var108 = field959.method3065();
                int var109 = field959.method2925();
                int var110 = field959.method3065();
                if (field1156 != 0 && var109 != 0 && field1078 < 50) {
                    field1159[field1078] = var108;
                    field1160[field1078] = var109;
                    field1050[field1078] = var110;
                    field1163[field1078] = null;
                    field1102[field1078] = 0;
                    field1078++;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 28) {
                int var114 = field959.method2956();
                int var115 = field959.method2958();
                int var116 = field959.method2968();
                class217 var117 = class217.method3143(var116);
                var117.field2709 = (var115 << 16) + var114;
                field961 = -1;
                return true;
            }
            if (field961 == 108) {
                field988 = false;
                for (int var118 = 0; var118 < 5; var118++) {
                    field1165[var118] = false;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 187) {
                int var119 = field959.method2956();
                int var120 = field959.method3058();
                class212.field2613[var119] = var120;
                if (class212.field2615[var119] != var120) {
                    class212.field2615[var119] = var120;
                }
                method1378(var119);
                field1103[++field1104 - 1 & 0x1F] = var119;
                field961 = -1;
                return true;
            }
            if (field961 == 123) {
                method43(false);
                field961 = -1;
                return true;
            }
            if (field961 == 60) {
                Statics.field338 = class277.method3784(field959.method2925());
                field961 = -1;
                return true;
            }
            if (field961 == 62) {
                int var121 = field959.method2935();
                int var122 = field959.method2966();
                class69 var123 = (class69) field1135.method3295((long) var122);
                class69 var124 = (class69) field1135.method3295((long) var121);
                if (var124 != null) {
                    method219(var124, var123 == null || var123.field819 != var124.field819);
                }
                if (var123 != null) {
                    var123.method3347();
                    field1135.method3296(var123, (long) var121);
                }
                class217 var125 = class217.method3143(var122);
                if (var125 != null) {
                    method1404(var125);
                }
                class217 var126 = class217.method3143(var121);
                if (var126 != null) {
                    method1404(var126);
                    method162(Statics.field2678[var126.field2653 >>> 16], var126, true);
                }
                if (field993 != -1) {
                    int var127 = field993;
                    if (class217.method1008(var127)) {
                        method4451(Statics.field2678[var127], 1);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 250) {
                for (int var128 = 0; var128 < class212.field2615.length; var128++) {
                    if (class212.field2615[var128] != class212.field2613[var128]) {
                        class212.field2615[var128] = class212.field2613[var128];
                        method1378(var128);
                        field1103[++field1104 - 1 & 0x1F] = var128;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 39) {
                int var129 = field959.method2925();
                int var130 = field959.method2925();
                int var131 = field959.method2925();
                int var132 = field959.method2925();
                field1165[var129] = true;
                field1166[var129] = var130;
                field1191[var129] = var131;
                field1168[var129] = var132;
                field1169[var129] = 0;
                field961 = -1;
                return true;
            }
            if (field961 == 26) {
                int var133 = field959.method3058();
                int var134 = field959.method2960();
                class217 var135 = class217.method3143(var133);
                if (var135.field2700 != var134 || var134 == -1) {
                    var135.field2700 = var134;
                    var135.field2775 = 0;
                    var135.field2663 = 0;
                    method1404(var135);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 252) {
                int var136 = field959.method3058();
                int var137 = field959.method2924();
                int var138 = field959.method2959();
                class217 var139 = class217.method3143(var136);
                if (var139.field2662 != var138 || var139.field2704 != var137 || var139.field2682 != 0 || var139.field2778 != 0) {
                    var139.field2662 = var138;
                    var139.field2704 = var137;
                    var139.field2682 = 0;
                    var139.field2778 = 0;
                    method1404(var139);
                    this.method1315(var139);
                    if (var139.field2655 == 0) {
                        method162(Statics.field2678[var136 >> 16], var139, false);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 49) {
                field1082 = field959.method2957() * 30;
                field1114 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 240) {
                String var140 = field959.method3098();
                long var141 = field959.method2927();
                long var143 = (long) field959.method3065();
                long var145 = (long) field959.method2910();
                class231 var147 = (class231) class169.method1611(class231.method2845(), field959.method2925());
                long var148 = (var143 << 32) + var145;
                boolean var150 = false;
                for (int var151 = 0; var151 < 100; var151++) {
                    if (field1136[var151] == var148) {
                        var150 = true;
                        break;
                    }
                }
                if (var147.field3177 && method2886(var140)) {
                    var150 = true;
                }
                if (!var150 && field1035 == 0) {
                    field1136[field1175] = var148;
                    field1175 = (field1175 + 1) % 100;
                    class180 var152 = field959;
                    String var156;
                    try {
                        int var153 = var152.method2934();
                        if (var153 > 32767) {
                            var153 = 32767;
                        }
                        byte[] var154 = new byte[var153];
                        var152.field2400 += Statics.field3671.method2841(var152.field2401, var152.field2400, var154, 0, var153);
                        String var155 = class267.method477(var154, 0, var153);
                        var156 = var155;
                    } catch (Exception var498) {
                        var156 = "Cabbage";
                    }
                    String var159 = class265.method4497(class271.method3926(var156));
                    if (var147.field3175 == -1) {
                        class99.method3803(9, var140, var159, class269.method2691(var141));
                    } else {
                        class99.method3803(9, class89.method971(var147.field3175) + var140, var159, class269.method2691(var141));
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 38) {
                int var160 = field959.method2949();
                int var161 = field959.method2968();
                int var162 = field959.method2957();
                class69 var163 = (class69) field1135.method3295((long) var161);
                if (var163 != null) {
                    method219(var163, var163.field819 != var162);
                }
                method3825(var161, var162, var160);
                field961 = -1;
                return true;
            }
            if (field961 == 18) {
                int var164 = field959.method3058();
                int var165 = field959.method3065();
                if (var164 < -70000) {
                    var165 += 32768;
                }
                class217 var166;
                if (var164 >= 0) {
                    var166 = class217.method3143(var164);
                } else {
                    var166 = null;
                }
                if (var166 != null) {
                    for (int var167 = 0; var167 < var166.field2659.length; var167++) {
                        var166.field2659[var167] = 0;
                        var166.field2772[var167] = 0;
                    }
                }
                class64.method4272(var165);
                int var168 = field959.method3065();
                for (int var169 = 0; var169 < var168; var169++) {
                    int var170 = field959.method2950();
                    if (var170 == 255) {
                        var170 = field959.method2968();
                    }
                    int var171 = field959.method2958();
                    if (var166 != null && var169 < var166.field2659.length) {
                        var166.field2659[var169] = var171;
                        var166.field2772[var169] = var170;
                    }
                    class64.method1399(var165, var169, var171 - 1, var170);
                }
                if (var166 != null) {
                    method1404(var166);
                }
                method492();
                field930[++field925 - 1 & 0x1F] = var165 & 0x7FFF;
                field961 = -1;
                return true;
            }
            if (field961 == 143) {
                while (field959.field2400 < field960) {
                    int var172 = field959.method2925();
                    boolean var173 = (var172 & 0x1) == 1;
                    String var174 = field959.method3098();
                    String var175 = field959.method3098();
                    field959.method3098();
                    for (int var176 = 0; var176 < field1187; var176++) {
                        class71 var177 = field1188[var176];
                        if (var173) {
                            if (var175.equals(var177.field844)) {
                                var177.field844 = var174;
                                var177.field843 = var175;
                                var174 = null;
                                break;
                            }
                        } else if (var174.equals(var177.field844)) {
                            var177.field844 = var174;
                            var177.field843 = var175;
                            var174 = null;
                            break;
                        }
                    }
                    if (var174 != null && field1187 < 400) {
                        class71 var178 = new class71();
                        field1188[field1187] = var178;
                        var178.field844 = var174;
                        var178.field843 = var175;
                        field1187++;
                    }
                }
                field1110 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 29) {
                method43(true);
                field961 = -1;
                return true;
            }
            if (field961 == 130) {
                while (field959.field2400 < field960) {
                    boolean var179 = field959.method2925() == 1;
                    String var180 = field959.method3098();
                    String var181 = field959.method3098();
                    int var182 = field959.method3065();
                    int var183 = field959.method2925();
                    int var184 = field959.method2925();
                    boolean var185 = (var184 & 0x2) != 0;
                    boolean var186 = (var184 & 0x1) != 0;
                    if (var182 > 0) {
                        field959.method3098();
                        field959.method2925();
                        field959.method3058();
                    }
                    field959.method3098();
                    for (int var187 = 0; var187 < field1183; var187++) {
                        class66 var188 = field1185[var187];
                        if (var179) {
                            if (var181.equals(var188.field796)) {
                                var188.field796 = var180;
                                var188.field792 = var181;
                                var180 = null;
                                break;
                            }
                        } else if (var180.equals(var188.field796)) {
                            if (var188.field793 != var182) {
                                boolean var189 = true;
                                for (class68 var190 = (class68) field1186.method3396(); var190 != null; var190 = (class68) field1186.method3399()) {
                                    if (var190.field810.equals(var180)) {
                                        if (var182 != 0 && var190.field814 == 0) {
                                            var190.method3405();
                                            var189 = false;
                                        } else if (var182 == 0 && var190.field814 != 0) {
                                            var190.method3405();
                                            var189 = false;
                                        }
                                    }
                                }
                                if (var189) {
                                    field1186.method3395(new class68(var180, var182));
                                }
                                var188.field793 = var182;
                            }
                            var188.field792 = var181;
                            var188.field791 = var183;
                            var188.field794 = var185;
                            var188.field795 = var186;
                            var180 = null;
                            break;
                        }
                    }
                    if (var180 != null && field1183 < 400) {
                        class66 var191 = new class66();
                        field1185[field1183] = var191;
                        var191.field796 = var180;
                        var191.field792 = var181;
                        var191.field793 = var182;
                        var191.field791 = var183;
                        var191.field794 = var185;
                        var191.field795 = var186;
                        field1183++;
                    }
                }
                field1184 = 2;
                field1110 = field1111;
                boolean var192 = false;
                int var193 = field1183;
                while (var193 > 0) {
                    boolean var194 = true;
                    var193--;
                    for (int var195 = 0; var195 < var193; var195++) {
                        boolean var196 = false;
                        class66 var197 = field1185[var195];
                        class66 var198 = field1185[var195 + 1];
                        if (field914 != var197.field793 && field914 == var198.field793) {
                            var196 = true;
                        }
                        if (!var196 && var197.field793 == 0 && var198.field793 != 0) {
                            var196 = true;
                        }
                        if (!var196 && !var197.field794 && var198.field794) {
                            var196 = true;
                        }
                        if (!var196 && !var197.field795 && var198.field795) {
                            var196 = true;
                        }
                        if (var196) {
                            class66 var199 = field1185[var195];
                            field1185[var195] = field1185[var195 + 1];
                            field1185[var195 + 1] = var199;
                            var194 = false;
                        }
                    }
                    if (var194) {
                        break;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 239) {
                Statics.method2172(true);
                field959.method3148();
                int var200 = field959.method3065();
                class180 var201 = field959;
                int var202 = var201.field2400;
                class97.field1508 = 0;
                int var203 = 0;
                var201.method3149();
                for (int var204 = 0; var204 < class97.field1500; var204++) {
                    int var205 = class97.field1502[var204];
                    if ((class97.field1504[var205] & 0x1) == 0) {
                        if (var203 > 0) {
                            var203--;
                            class97.field1504[var205] = (byte) (class97.field1504[var205] | 0x2);
                        } else {
                            int var206 = var201.method3150(1);
                            if (var206 == 0) {
                                var203 = class97.method975(var201);
                                class97.field1504[var205] = (byte) (class97.field1504[var205] | 0x2);
                            } else {
                                class97.method161(var201, var205);
                            }
                        }
                    }
                }
                var201.method3151();
                if (var203 != 0) {
                    throw new RuntimeException();
                }
                var201.method3149();
                for (int var207 = 0; var207 < class97.field1500; var207++) {
                    int var208 = class97.field1502[var207];
                    if ((class97.field1504[var208] & 0x1) != 0) {
                        if (var203 > 0) {
                            var203--;
                            class97.field1504[var208] = (byte) (class97.field1504[var208] | 0x2);
                        } else {
                            int var209 = var201.method3150(1);
                            if (var209 == 0) {
                                var203 = class97.method975(var201);
                                class97.field1504[var208] = (byte) (class97.field1504[var208] | 0x2);
                            } else {
                                class97.method161(var201, var208);
                            }
                        }
                    }
                }
                var201.method3151();
                if (var203 != 0) {
                    throw new RuntimeException();
                }
                var201.method3149();
                for (int var210 = 0; var210 < class97.field1503; var210++) {
                    int var211 = class97.field1512[var210];
                    if ((class97.field1504[var211] & 0x1) != 0) {
                        if (var203 > 0) {
                            var203--;
                            class97.field1504[var211] = (byte) (class97.field1504[var211] | 0x2);
                        } else {
                            int var212 = var201.method3150(1);
                            if (var212 == 0) {
                                var203 = class97.method975(var201);
                                class97.field1504[var211] = (byte) (class97.field1504[var211] | 0x2);
                            } else if (class97.method1563(var201, var211)) {
                                class97.field1504[var211] = (byte) (class97.field1504[var211] | 0x2);
                            }
                        }
                    }
                }
                var201.method3151();
                if (var203 != 0) {
                    throw new RuntimeException();
                }
                var201.method3149();
                for (int var213 = 0; var213 < class97.field1503; var213++) {
                    int var214 = class97.field1512[var213];
                    if ((class97.field1504[var214] & 0x1) == 0) {
                        if (var203 > 0) {
                            var203--;
                            class97.field1504[var214] = (byte) (class97.field1504[var214] | 0x2);
                        } else {
                            int var215 = var201.method3150(1);
                            if (var215 == 0) {
                                var203 = class97.method975(var201);
                                class97.field1504[var214] = (byte) (class97.field1504[var214] | 0x2);
                            } else if (class97.method1563(var201, var214)) {
                                class97.field1504[var214] = (byte) (class97.field1504[var214] | 0x2);
                            }
                        }
                    }
                }
                var201.method3151();
                if (var203 != 0) {
                    throw new RuntimeException();
                }
                class97.field1500 = 0;
                class97.field1503 = 0;
                for (int var216 = 1; var216 < 2048; var216++) {
                    class97.field1504[var216] = (byte) (class97.field1504[var216] >> 1);
                    class75 var217 = field1036[var216];
                    if (var217 == null) {
                        class97.field1512[++class97.field1503 - 1] = var216;
                    } else {
                        class97.field1502[++class97.field1500 - 1] = var216;
                    }
                }
                for (int var218 = 0; var218 < class97.field1508; var218++) {
                    int var219 = class97.field1509[var218];
                    class75 var220 = field1036[var219];
                    int var221 = var201.method2925();
                    if ((var221 & 0x8) != 0) {
                        var221 += var201.method2925() << 8;
                    }
                    byte var222 = -1;
                    if ((var221 & 0x1) != 0) {
                        int var223 = var201.method2925();
                        byte[] var224 = new byte[var223];
                        class174 var225 = new class174(var224);
                        var201.method3005(var224, 0, var223);
                        class97.field1498[var219] = var225;
                        var220.method1022(var225);
                    }
                    if ((var221 & 0x80) != 0) {
                        int var226 = var201.method3065();
                        if (var226 == 65535) {
                            var226 = -1;
                        }
                        int var227 = var201.method2925();
                        method466(var220, var226, var227);
                    }
                    if ((var221 & 0x4) != 0) {
                        var220.field1285 = var201.method3065();
                        if (var220.field1285 == 65535) {
                            var220.field1285 = -1;
                        }
                    }
                    if ((var221 & 0x20) != 0) {
                        var220.field1271 = var201.method3098();
                        if (var220.field1271.charAt(0) == '~') {
                            var220.field1271 = var220.field1271.substring(1);
                            class99.method1689(2, var220.field888, var220.field1271);
                        } else if (Statics.field2350 == var220) {
                            class99.method1689(2, var220.field888, var220.field1271);
                        }
                        var220.field1241 = false;
                        var220.field1244 = 0;
                        var220.field1245 = 0;
                        var220.field1267 = 150;
                    }
                    if ((var221 & 0x10) != 0) {
                        int var228 = var201.method2925();
                        if (var228 > 0) {
                            for (int var229 = 0; var229 < var228; var229++) {
                                int var230 = -1;
                                int var231 = -1;
                                int var232 = -1;
                                int var233 = var201.method2934();
                                if (var233 == 32767) {
                                    var233 = var201.method2934();
                                    var231 = var201.method2934();
                                    var230 = var201.method2934();
                                    var232 = var201.method2934();
                                } else if (var233 == 32766) {
                                    var233 = -1;
                                } else {
                                    var231 = var201.method2934();
                                }
                                int var234 = var201.method2934();
                                var220.method1392(var233, var231, var230, var232, field923, var234);
                            }
                        }
                        int var235 = var201.method2925();
                        if (var235 > 0) {
                            for (int var236 = 0; var236 < var235; var236++) {
                                int var237 = var201.method2934();
                                int var238 = var201.method2934();
                                if (var238 == 32767) {
                                    var220.method1396(var237);
                                } else {
                                    int var239 = var201.method2934();
                                    int var240 = var201.method2925();
                                    int var241 = var238 > 0 ? var201.method2925() : var240;
                                    var220.method1389(var237, field923, var238, var239, var240, var241);
                                }
                            }
                        }
                    }
                    if ((var221 & 0x2) != 0) {
                        var220.field1255 = var201.method3065();
                        if (var220.field1281 == 0) {
                            var220.field1253 = var220.field1255;
                            var220.field1255 = -1;
                        }
                    }
                    if ((var221 & 0x40) != 0) {
                        int var242 = var201.method3065();
                        class231 var243 = (class231) class169.method1611(class231.method2845(), var201.method2925());
                        boolean var244 = var201.method2925() == 1;
                        int var245 = var201.method2925();
                        int var246 = var201.field2400;
                        if (var220.field888 != null && var220.field886 != null) {
                            boolean var247 = false;
                            if (var243.field3177 && method2886(var220.field888)) {
                                var247 = true;
                            }
                            if (!var247 && field1035 == 0 && !var220.field891) {
                                class97.field1510.field2400 = 0;
                                var201.method3005(class97.field1510.field2401, 0, var245);
                                class97.field1510.field2400 = 0;
                                class174 var248 = class97.field1510;
                                String var252;
                                try {
                                    int var249 = var248.method2934();
                                    if (var249 > 32767) {
                                        var249 = 32767;
                                    }
                                    byte[] var250 = new byte[var249];
                                    var248.field2400 += Statics.field3671.method2841(var248.field2401, var248.field2400, var250, 0, var249);
                                    String var251 = class267.method477(var250, 0, var249);
                                    var252 = var251;
                                } catch (Exception var497) {
                                    var252 = "Cabbage";
                                }
                                String var255 = class265.method4497(class271.method3926(var252));
                                var220.field1271 = var255.trim();
                                var220.field1244 = var242 >> 8;
                                var220.field1245 = var242 & 0xFF;
                                var220.field1267 = 150;
                                var220.field1241 = var244;
                                var220.field1242 = Statics.field2350 != var220 && var243.field3177 && field1015 != "" && var255.toLowerCase().indexOf(field1015) == -1;
                                int var256;
                                if (var243.field3180) {
                                    var256 = var244 ? 91 : 1;
                                } else {
                                    var256 = var244 ? 90 : 2;
                                }
                                if (var243.field3175 == -1) {
                                    class99.method1689(var256, var220.field888, var255);
                                } else {
                                    class99.method1689(var256, class89.method971(var243.field3175) + var220.field888, var255);
                                }
                            }
                        }
                        var201.field2400 = var245 + var246;
                    }
                    if ((var221 & 0x400) != 0) {
                        var220.field1246 = var201.method3065();
                        int var257 = var201.method3058();
                        var220.field1280 = var257 >> 16;
                        var220.field1257 = (var257 & 0xFFFF) + field923;
                        var220.field1265 = 0;
                        var220.field1250 = 0;
                        if (var220.field1257 > field923) {
                            var220.field1265 = -1;
                        }
                        if (var220.field1246 == 65535) {
                            var220.field1246 = -1;
                        }
                    }
                    if ((var221 & 0x100) != 0) {
                        var220.field1269 = var201.method2922();
                        var220.field1287 = var201.method2922();
                        var220.field1270 = var201.method2922();
                        var220.field1272 = var201.method2922();
                        var220.field1273 = var201.method3065() + field923;
                        var220.field1274 = var201.method3065() + field923;
                        var220.field1275 = var201.method3065();
                        if (var220.field894) {
                            var220.field1269 += var220.field895;
                            var220.field1287 += var220.field876;
                            var220.field1270 += var220.field895;
                            var220.field1272 += var220.field876;
                            var220.field1281 = 0;
                        } else {
                            var220.field1269 += var220.field1282[0];
                            var220.field1287 += var220.field1283[0];
                            var220.field1270 += var220.field1282[0];
                            var220.field1272 += var220.field1283[0];
                            var220.field1281 = 1;
                        }
                        var220.field1286 = 0;
                    }
                    if ((var221 & 0x1000) != 0) {
                        class97.field1499[var219] = var201.method2922();
                    }
                    if ((var221 & 0x800) != 0) {
                        var222 = var201.method2922();
                    }
                    if ((var221 & 0x200) != 0) {
                        for (int var258 = 0; var258 < 3; var258++) {
                            var220.field875[var258] = var201.method3098();
                        }
                    }
                    if (var220.field894) {
                        if (var222 == 127) {
                            var220.method1036(var220.field895, var220.field876);
                        } else {
                            byte var259;
                            if (var222 == -1) {
                                var259 = class97.field1499[var219];
                            } else {
                                var259 = var222;
                            }
                            var220.method1009(var220.field895, var220.field876, var259);
                        }
                    }
                }
                if (var201.field2400 - var202 != var200) {
                    throw new RuntimeException(var201.field2400 - var202 + " " + var200);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 162) {
                int var260 = field959.method2925();
                String var261 = field959.method3098();
                int var262 = field959.method2925();
                if (var260 >= 1 && var260 <= 8) {
                    if (var261.equalsIgnoreCase("null")) {
                        var261 = null;
                    }
                    field1042[var260 - 1] = var261;
                    field1043[var260 - 1] = var262 == 0;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 96) {
                int var263 = field959.method3058();
                int var264 = field959.method3058();
                if (Statics.field252 == null || !Statics.field252.isValid()) {
                    try {
                        Iterator var265 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var265.hasNext()) {
                            GarbageCollectorMXBean var266 = (GarbageCollectorMXBean) var265.next();
                            if (var266.isValid()) {
                                Statics.field252 = var266;
                                field1194 = -1L;
                                field1070 = -1L;
                            }
                        }
                    } catch (Throwable var505) {
                    }
                }
                long var268 = class176.method2396();
                int var270 = -1;
                if (Statics.field252 != null) {
                    long var271 = Statics.field252.getCollectionTime();
                    if (field1070 != -1L) {
                        long var273 = var271 - field1070;
                        long var275 = var268 - field1194;
                        if (var275 != 0L) {
                            var270 = (int) (var273 * 100L / var275);
                        }
                    }
                    field1070 = var271;
                    field1194 = var268;
                }
                field957.method3159(62);
                field957.method2909(var263);
                field957.method2909(var264);
                field957.method2945(var270);
                field957.method2947(field685);
                field961 = -1;
                return true;
            }
            if (field961 == 172) {
                if (field993 != -1) {
                    int var277 = field993;
                    if (class217.method1008(var277)) {
                        method4451(Statics.field2678[var277], 0);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 148) {
                class180 var278 = field959;
                int var279 = field960;
                int var280 = var278.field2400;
                class97.field1508 = 0;
                int var281 = 0;
                var278.method3149();
                for (int var282 = 0; var282 < class97.field1500; var282++) {
                    int var283 = class97.field1502[var282];
                    if ((class97.field1504[var283] & 0x1) == 0) {
                        if (var281 > 0) {
                            var281--;
                            class97.field1504[var283] = (byte) (class97.field1504[var283] | 0x2);
                        } else {
                            int var284 = var278.method3150(1);
                            if (var284 == 0) {
                                var281 = class97.method975(var278);
                                class97.field1504[var283] = (byte) (class97.field1504[var283] | 0x2);
                            } else {
                                class97.method161(var278, var283);
                            }
                        }
                    }
                }
                var278.method3151();
                if (var281 != 0) {
                    throw new RuntimeException();
                }
                var278.method3149();
                for (int var285 = 0; var285 < class97.field1500; var285++) {
                    int var286 = class97.field1502[var285];
                    if ((class97.field1504[var286] & 0x1) != 0) {
                        if (var281 > 0) {
                            var281--;
                            class97.field1504[var286] = (byte) (class97.field1504[var286] | 0x2);
                        } else {
                            int var287 = var278.method3150(1);
                            if (var287 == 0) {
                                var281 = class97.method975(var278);
                                class97.field1504[var286] = (byte) (class97.field1504[var286] | 0x2);
                            } else {
                                class97.method161(var278, var286);
                            }
                        }
                    }
                }
                var278.method3151();
                if (var281 != 0) {
                    throw new RuntimeException();
                }
                var278.method3149();
                for (int var288 = 0; var288 < class97.field1503; var288++) {
                    int var289 = class97.field1512[var288];
                    if ((class97.field1504[var289] & 0x1) != 0) {
                        if (var281 > 0) {
                            var281--;
                            class97.field1504[var289] = (byte) (class97.field1504[var289] | 0x2);
                        } else {
                            int var290 = var278.method3150(1);
                            if (var290 == 0) {
                                var281 = class97.method975(var278);
                                class97.field1504[var289] = (byte) (class97.field1504[var289] | 0x2);
                            } else if (class97.method1563(var278, var289)) {
                                class97.field1504[var289] = (byte) (class97.field1504[var289] | 0x2);
                            }
                        }
                    }
                }
                var278.method3151();
                if (var281 != 0) {
                    throw new RuntimeException();
                }
                var278.method3149();
                for (int var291 = 0; var291 < class97.field1503; var291++) {
                    int var292 = class97.field1512[var291];
                    if ((class97.field1504[var292] & 0x1) == 0) {
                        if (var281 > 0) {
                            var281--;
                            class97.field1504[var292] = (byte) (class97.field1504[var292] | 0x2);
                        } else {
                            int var293 = var278.method3150(1);
                            if (var293 == 0) {
                                var281 = class97.method975(var278);
                                class97.field1504[var292] = (byte) (class97.field1504[var292] | 0x2);
                            } else if (class97.method1563(var278, var292)) {
                                class97.field1504[var292] = (byte) (class97.field1504[var292] | 0x2);
                            }
                        }
                    }
                }
                var278.method3151();
                if (var281 != 0) {
                    throw new RuntimeException();
                }
                class97.field1500 = 0;
                class97.field1503 = 0;
                for (int var294 = 1; var294 < 2048; var294++) {
                    class97.field1504[var294] = (byte) (class97.field1504[var294] >> 1);
                    class75 var295 = field1036[var294];
                    if (var295 == null) {
                        class97.field1512[++class97.field1503 - 1] = var294;
                    } else {
                        class97.field1502[++class97.field1500 - 1] = var294;
                    }
                }
                for (int var296 = 0; var296 < class97.field1508; var296++) {
                    int var297 = class97.field1509[var296];
                    class75 var298 = field1036[var297];
                    int var299 = var278.method2925();
                    if ((var299 & 0x8) != 0) {
                        var299 += var278.method2925() << 8;
                    }
                    byte var300 = -1;
                    if ((var299 & 0x1) != 0) {
                        int var301 = var278.method2925();
                        byte[] var302 = new byte[var301];
                        class174 var303 = new class174(var302);
                        var278.method3005(var302, 0, var301);
                        class97.field1498[var297] = var303;
                        var298.method1022(var303);
                    }
                    if ((var299 & 0x80) != 0) {
                        int var304 = var278.method3065();
                        if (var304 == 65535) {
                            var304 = -1;
                        }
                        int var305 = var278.method2925();
                        method466(var298, var304, var305);
                    }
                    if ((var299 & 0x4) != 0) {
                        var298.field1285 = var278.method3065();
                        if (var298.field1285 == 65535) {
                            var298.field1285 = -1;
                        }
                    }
                    if ((var299 & 0x20) != 0) {
                        var298.field1271 = var278.method3098();
                        if (var298.field1271.charAt(0) == '~') {
                            var298.field1271 = var298.field1271.substring(1);
                            class99.method1689(2, var298.field888, var298.field1271);
                        } else if (Statics.field2350 == var298) {
                            class99.method1689(2, var298.field888, var298.field1271);
                        }
                        var298.field1241 = false;
                        var298.field1244 = 0;
                        var298.field1245 = 0;
                        var298.field1267 = 150;
                    }
                    if ((var299 & 0x10) != 0) {
                        int var306 = var278.method2925();
                        if (var306 > 0) {
                            for (int var307 = 0; var307 < var306; var307++) {
                                int var308 = -1;
                                int var309 = -1;
                                int var310 = -1;
                                int var311 = var278.method2934();
                                if (var311 == 32767) {
                                    var311 = var278.method2934();
                                    var309 = var278.method2934();
                                    var308 = var278.method2934();
                                    var310 = var278.method2934();
                                } else if (var311 == 32766) {
                                    var311 = -1;
                                } else {
                                    var309 = var278.method2934();
                                }
                                int var312 = var278.method2934();
                                var298.method1392(var311, var309, var308, var310, field923, var312);
                            }
                        }
                        int var313 = var278.method2925();
                        if (var313 > 0) {
                            for (int var314 = 0; var314 < var313; var314++) {
                                int var315 = var278.method2934();
                                int var316 = var278.method2934();
                                if (var316 == 32767) {
                                    var298.method1396(var315);
                                } else {
                                    int var317 = var278.method2934();
                                    int var318 = var278.method2925();
                                    int var319 = var316 > 0 ? var278.method2925() : var318;
                                    var298.method1389(var315, field923, var316, var317, var318, var319);
                                }
                            }
                        }
                    }
                    if ((var299 & 0x2) != 0) {
                        var298.field1255 = var278.method3065();
                        if (var298.field1281 == 0) {
                            var298.field1253 = var298.field1255;
                            var298.field1255 = -1;
                        }
                    }
                    if ((var299 & 0x40) != 0) {
                        int var320 = var278.method3065();
                        class231 var321 = (class231) class169.method1611(class231.method2845(), var278.method2925());
                        boolean var322 = var278.method2925() == 1;
                        int var323 = var278.method2925();
                        int var324 = var278.field2400;
                        if (var298.field888 != null && var298.field886 != null) {
                            boolean var325 = false;
                            if (var321.field3177 && method2886(var298.field888)) {
                                var325 = true;
                            }
                            if (!var325 && field1035 == 0 && !var298.field891) {
                                class97.field1510.field2400 = 0;
                                var278.method3005(class97.field1510.field2401, 0, var323);
                                class97.field1510.field2400 = 0;
                                class174 var326 = class97.field1510;
                                String var330;
                                try {
                                    int var327 = var326.method2934();
                                    if (var327 > 32767) {
                                        var327 = 32767;
                                    }
                                    byte[] var328 = new byte[var327];
                                    var326.field2400 += Statics.field3671.method2841(var326.field2401, var326.field2400, var328, 0, var327);
                                    String var329 = class267.method477(var328, 0, var327);
                                    var330 = var329;
                                } catch (Exception var496) {
                                    var330 = "Cabbage";
                                }
                                String var333 = class265.method4497(class271.method3926(var330));
                                var298.field1271 = var333.trim();
                                var298.field1244 = var320 >> 8;
                                var298.field1245 = var320 & 0xFF;
                                var298.field1267 = 150;
                                var298.field1241 = var322;
                                var298.field1242 = Statics.field2350 != var298 && var321.field3177 && field1015 != "" && var333.toLowerCase().indexOf(field1015) == -1;
                                int var334;
                                if (var321.field3180) {
                                    var334 = var322 ? 91 : 1;
                                } else {
                                    var334 = var322 ? 90 : 2;
                                }
                                if (var321.field3175 == -1) {
                                    class99.method1689(var334, var298.field888, var333);
                                } else {
                                    class99.method1689(var334, class89.method971(var321.field3175) + var298.field888, var333);
                                }
                            }
                        }
                        var278.field2400 = var323 + var324;
                    }
                    if ((var299 & 0x400) != 0) {
                        var298.field1246 = var278.method3065();
                        int var335 = var278.method3058();
                        var298.field1280 = var335 >> 16;
                        var298.field1257 = (var335 & 0xFFFF) + field923;
                        var298.field1265 = 0;
                        var298.field1250 = 0;
                        if (var298.field1257 > field923) {
                            var298.field1265 = -1;
                        }
                        if (var298.field1246 == 65535) {
                            var298.field1246 = -1;
                        }
                    }
                    if ((var299 & 0x100) != 0) {
                        var298.field1269 = var278.method2922();
                        var298.field1287 = var278.method2922();
                        var298.field1270 = var278.method2922();
                        var298.field1272 = var278.method2922();
                        var298.field1273 = var278.method3065() + field923;
                        var298.field1274 = var278.method3065() + field923;
                        var298.field1275 = var278.method3065();
                        if (var298.field894) {
                            var298.field1269 += var298.field895;
                            var298.field1287 += var298.field876;
                            var298.field1270 += var298.field895;
                            var298.field1272 += var298.field876;
                            var298.field1281 = 0;
                        } else {
                            var298.field1269 += var298.field1282[0];
                            var298.field1287 += var298.field1283[0];
                            var298.field1270 += var298.field1282[0];
                            var298.field1272 += var298.field1283[0];
                            var298.field1281 = 1;
                        }
                        var298.field1286 = 0;
                    }
                    if ((var299 & 0x1000) != 0) {
                        class97.field1499[var297] = var278.method2922();
                    }
                    if ((var299 & 0x800) != 0) {
                        var300 = var278.method2922();
                    }
                    if ((var299 & 0x200) != 0) {
                        for (int var336 = 0; var336 < 3; var336++) {
                            var298.field875[var336] = var278.method3098();
                        }
                    }
                    if (var298.field894) {
                        if (var300 == 127) {
                            var298.method1036(var298.field895, var298.field876);
                        } else {
                            byte var337;
                            if (var300 == -1) {
                                var337 = class97.field1499[var297];
                            } else {
                                var337 = var300;
                            }
                            var298.method1009(var298.field895, var298.field876, var337);
                        }
                    }
                }
                if (var278.field2400 - var280 != var279) {
                    throw new RuntimeException(var278.field2400 - var280 + " " + var279);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 10) {
                int var338 = field959.method2934();
                boolean var339 = field959.method2925() == 1;
                String var340 = "";
                boolean var341 = false;
                if (var339) {
                    var340 = field959.method3098();
                    if (method2886(var340)) {
                        var341 = true;
                    }
                }
                String var342 = field959.method3098();
                if (!var341) {
                    class99.method1689(var338, var340, var342);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 153) {
                int var343 = field959.method3058();
                int var344 = field959.method2958();
                if (var344 == 65535) {
                    var344 = -1;
                }
                int var345 = field959.method2935();
                class217 var346 = class217.method3143(var345);
                if (var346.field2652) {
                    var346.field2773 = var344;
                    var346.field2692 = var343;
                    class257 var348 = class257.method4344(var344);
                    var346.field2713 = var348.field3513;
                    var346.field2705 = var348.field3514;
                    var346.field2706 = var348.field3494;
                    var346.field2681 = var348.field3518;
                    var346.field2703 = var348.field3517;
                    var346.field2707 = var348.field3531;
                    if (var348.field3535 == 1) {
                        var346.field2711 = 1;
                    } else {
                        var346.field2711 = 2;
                    }
                    if (var346.field2690 > 0) {
                        var346.field2707 = var346.field2707 * 32 / var346.field2690;
                    } else if (var346.field2664 > 0) {
                        var346.field2707 = var346.field2707 * 32 / var346.field2664;
                    }
                    method1404(var346);
                } else if (var344 == -1) {
                    var346.field2696 = 0;
                    field961 = -1;
                    return true;
                } else {
                    class257 var347 = class257.method4344(var344);
                    var346.field2696 = 4;
                    var346.field2697 = var344;
                    var346.field2713 = var347.field3513;
                    var346.field2705 = var347.field3514;
                    var346.field2707 = var347.field3531 * 100 / var343;
                    method1404(var346);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 254) {
                field988 = true;
                Statics.field709 = field959.method2925();
                Statics.field2053 = field959.method2925();
                Statics.field20 = field959.method3065();
                Statics.field869 = field959.method2925();
                Statics.field314 = field959.method2925();
                if (Statics.field314 >= 100) {
                    int var349 = Statics.field709 * 128 + 64;
                    int var350 = Statics.field2053 * 128 + 64;
                    int var351 = method3174(var349, var350, Statics.field1449) - Statics.field20;
                    int var352 = var349 - Statics.field19;
                    int var353 = var351 - Statics.field2512;
                    int var354 = var350 - Statics.field764;
                    int var355 = (int) Math.sqrt((double) (var352 * var352 + var354 * var354));
                    Statics.field979 = (int) (Math.atan2((double) var353, (double) var355) * 325.949D) & 0x7FF;
                    Statics.field1369 = (int) (Math.atan2((double) var352, (double) var354) * -325.949D) & 0x7FF;
                    if (Statics.field979 < 128) {
                        Statics.field979 = 128;
                    }
                    if (Statics.field979 > 383) {
                        Statics.field979 = 383;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 109) {
                method492();
                field1198 = field959.method2924();
                field1114 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 204) {
                int var356 = field959.method2956();
                if (var356 == 65535) {
                    var356 = -1;
                }
                if (var356 == -1 && !field1155) {
                    Statics.field2518.method3477();
                    class204.field2516 = 1;
                    Statics.field2517 = null;
                } else if (var356 != -1 && field1154 != var356 && field1031 != 0 && !field1155) {
                    class204.method688(2, Statics.field657, var356, 0, field1031, false);
                }
                field1154 = var356;
                field961 = -1;
                return true;
            }
            if (field961 == 249) {
                int var357 = field959.method3065();
                if (var357 == 65535) {
                    var357 = -1;
                }
                int var358 = field959.method3013();
                method61(var357, var358);
                field961 = -1;
                return true;
            }
            if (field961 == 14) {
                field931 = field959.method2925();
                if (field931 == 1) {
                    field932 = field959.method3065();
                }
                if (field931 >= 2 && field931 <= 6) {
                    if (field931 == 2) {
                        field937 = 64;
                        field938 = 64;
                    }
                    if (field931 == 3) {
                        field937 = 0;
                        field938 = 64;
                    }
                    if (field931 == 4) {
                        field937 = 128;
                        field938 = 64;
                    }
                    if (field931 == 5) {
                        field937 = 64;
                        field938 = 0;
                    }
                    if (field931 == 6) {
                        field937 = 64;
                        field938 = 128;
                    }
                    field931 = 2;
                    field934 = field959.method3065();
                    field1137 = field959.method3065();
                    field980 = field959.method2925();
                }
                if (field931 == 10) {
                    field1167 = field959.method3065();
                }
                field961 = -1;
                return true;
            }
            if (field961 == 54) {
                method492();
                int var359 = field959.method2925();
                int var360 = field959.method2950();
                int var361 = field959.method2968();
                field1012[var360] = var361;
                field1171[var360] = var359;
                field1051[var360] = 1;
                for (int var362 = 0; var362 < 98; var362++) {
                    if (var361 >= class223.field2840[var362]) {
                        field1051[var360] = var362 + 2;
                    }
                }
                field1107[++field1121 - 1 & 0x1F] = var360;
                field961 = -1;
                return true;
            }
            if (field961 == 227) {
                class180 var363 = field959;
                int var364 = field960;
                class280 var365 = new class280();
                var365.field3741 = var363.method2925();
                var365.field3742 = var363.method3058();
                var365.field3743 = new int[var365.field3741];
                var365.field3744 = new int[var365.field3741];
                var365.field3749 = new Field[var365.field3741];
                var365.field3746 = new int[var365.field3741];
                var365.field3747 = new Method[var365.field3741];
                var365.field3748 = new byte[var365.field3741][][];
                for (int var366 = 0; var366 < var365.field3741; var366++) {
                    try {
                        int var367 = var363.method2925();
                        if (var367 == 0 || var367 == 1 || var367 == 2) {
                            String var368 = var363.method3098();
                            String var369 = var363.method3098();
                            int var370 = 0;
                            if (var367 == 1) {
                                var370 = var363.method3058();
                            }
                            var365.field3743[var366] = var367;
                            var365.field3746[var366] = var370;
                            if (class281.method458(var368).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var365.field3749[var366] = class281.method458(var368).getDeclaredField(var369);
                        } else if (var367 == 3 || var367 == 4) {
                            String var371 = var363.method3098();
                            String var372 = var363.method3098();
                            int var373 = var363.method2925();
                            String[] var374 = new String[var373];
                            for (int var375 = 0; var375 < var373; var375++) {
                                var374[var375] = var363.method3098();
                            }
                            String var376 = var363.method3098();
                            byte[][] var377 = new byte[var373][];
                            if (var367 == 3) {
                                for (int var378 = 0; var378 < var373; var378++) {
                                    int var379 = var363.method3058();
                                    var377[var378] = new byte[var379];
                                    var363.method3005(var377[var378], 0, var379);
                                }
                            }
                            var365.field3743[var366] = var367;
                            Class[] var380 = new Class[var373];
                            for (int var381 = 0; var381 < var373; var381++) {
                                var380[var381] = class281.method458(var374[var381]);
                            }
                            Class var382 = class281.method458(var376);
                            if (class281.method458(var371).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var383 = class281.method458(var371).getDeclaredMethods();
                            Method[] var384 = var383;
                            for (int var385 = 0; var385 < var384.length; var385++) {
                                Method var386 = var384[var385];
                                if (var386.getName().equals(var372)) {
                                    Class[] var387 = var386.getParameterTypes();
                                    if (var380.length == var387.length) {
                                        boolean var388 = true;
                                        for (int var389 = 0; var389 < var380.length; var389++) {
                                            if (var380[var389] != var387[var389]) {
                                                var388 = false;
                                                break;
                                            }
                                        }
                                        if (var388 && var382 == var386.getReturnType()) {
                                            var365.field3747[var366] = var386;
                                        }
                                    }
                                }
                            }
                            var365.field3748[var366] = var377;
                        }
                    } catch (ClassNotFoundException var500) {
                        var365.field3744[var366] = -1;
                    } catch (SecurityException var501) {
                        var365.field3744[var366] = -2;
                    } catch (NullPointerException var502) {
                        var365.field3744[var366] = -3;
                    } catch (Exception var503) {
                        var365.field3744[var366] = -4;
                    } catch (Throwable var504) {
                        var365.field3744[var366] = -5;
                    }
                }
                class281.field3750.method3324(var365);
                field961 = -1;
                return true;
            }
            if (field961 == 126) {
                Statics.field2339 = field959.method2949();
                Statics.field805 = field959.method2950();
                while (field959.field2400 < field960) {
                    field961 = field959.method2925();
                    method456();
                }
                field961 = -1;
                return true;
            }
            if (field961 == 161) {
                field1184 = 1;
                field1110 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 91) {
                int var395 = field959.method2968();
                class217 var396 = class217.method3143(var395);
                var396.field2696 = 3;
                var396.field2697 = Statics.field2350.field886.method3700();
                method1404(var396);
                field961 = -1;
                return true;
            }
            if (field961 == 191) {
                boolean var397 = field959.method2950() == 1;
                int var398 = field959.method3058();
                class217 var399 = class217.method3143(var398);
                if (var399.field2673 != var397) {
                    var399.field2673 = var397;
                    method1404(var399);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 56) {
                class97.field1500 = 0;
                for (int var400 = 0; var400 < 2048; var400++) {
                    class97.field1498[var400] = null;
                    class97.field1499[var400] = 1;
                }
                for (int var401 = 0; var401 < 2048; var401++) {
                    field1036[var401] = null;
                }
                class97.method3(field959);
                field961 = -1;
                return true;
            }
            if (field961 == 141) {
                boolean var402 = field959.method2925() == 1;
                if (var402) {
                    Statics.field1780 = class176.method2396() - field959.method2927();
                    Statics.field835 = new class14(field959, true);
                } else {
                    Statics.field835 = null;
                }
                field1113 = field1111;
                field961 = -1;
                return true;
            }
            if (field961 == 106) {
                int var403 = field959.method2956();
                class64 var404 = (class64) class64.field770.method3295((long) var403);
                if (var404 != null) {
                    var404.method3347();
                }
                field930[++field925 - 1 & 0x1F] = var403 & 0x7FFF;
                field961 = -1;
                return true;
            }
            if (field961 == 36) {
                Statics.field2339 = field959.method2925();
                Statics.field805 = field959.method2925();
                field961 = -1;
                return true;
            }
            if (field961 == 48) {
                field1017 = field959.method2925();
                field961 = -1;
                return true;
            }
            if (field961 == 116) {
                field1150 = field959.method2925();
                if (field1150 == 255) {
                    field1150 = 0;
                }
                field1157 = field959.method2925();
                if (field1157 == 255) {
                    field1157 = 0;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 202) {
                Statics.field2339 = field959.method2948();
                Statics.field805 = field959.method2949();
                for (int var405 = Statics.field805; var405 < Statics.field805 + 8; var405++) {
                    for (int var406 = Statics.field2339; var406 < Statics.field2339 + 8; var406++) {
                        if (field1046[Statics.field1449][var405][var406] != null) {
                            field1046[Statics.field1449][var405][var406] = null;
                            method4453(var405, var406);
                        }
                    }
                }
                for (class77 var407 = (class77) field1047.method3372(); var407 != null; var407 = (class77) field1047.method3358()) {
                    if (var407.field1201 >= Statics.field805 && var407.field1201 < Statics.field805 + 8 && var407.field1202 >= Statics.field2339 && var407.field1202 < Statics.field2339 + 8 && Statics.field1449 == var407.field1204) {
                        var407.field1214 = 0;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 55) {
                int var408 = field959.method2935();
                int var409 = field959.method2957();
                class217 var410 = class217.method3143(var408);
                if (var410.field2696 != 1 || var410.field2697 != var409) {
                    var410.field2696 = 1;
                    var410.field2697 = var409;
                    method1404(var410);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 46) {
                int var411 = field959.method2966();
                int var412 = field959.method2957();
                class217 var413 = class217.method3143(var411);
                if (var413.field2696 != 2 || var413.field2697 != var412) {
                    var413.field2696 = 2;
                    var413.field2697 = var412;
                    method1404(var413);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 181) {
                field959.field2400 += 28;
                if (field959.method2978()) {
                    class180 var414 = field959;
                    int var415 = field959.field2400 - 28;
                    byte[] var416 = var414.field2401;
                    if (field1109 == null) {
                        field1109 = new byte[24];
                    }
                    class184.method3183(var416, var415, field1109, 0, 24);
                    if (class156.field2258 != null) {
                        try {
                            class156.field2258.method2146(0L);
                            class156.field2258.method2150(var414.field2401, var415, 24);
                        } catch (Exception var495) {
                        }
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 59) {
                int var418 = field959.method3058();
                class69 var419 = (class69) field1135.method3295((long) var418);
                if (var419 != null) {
                    method219(var419, true);
                }
                if (field1148 != null) {
                    method1404(field1148);
                    field1148 = null;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 15) {
                String var420 = field959.method3098();
                long var421 = (long) field959.method3065();
                long var423 = (long) field959.method2910();
                class231 var425 = (class231) class169.method1611(class231.method2845(), field959.method2925());
                long var426 = (var421 << 32) + var423;
                boolean var428 = false;
                for (int var429 = 0; var429 < 100; var429++) {
                    if (field1136[var429] == var426) {
                        var428 = true;
                        break;
                    }
                }
                if (method2886(var420)) {
                    var428 = true;
                }
                if (!var428 && field1035 == 0) {
                    field1136[field1175] = var426;
                    field1175 = (field1175 + 1) % 100;
                    class180 var430 = field959;
                    String var434;
                    try {
                        int var431 = var430.method2934();
                        if (var431 > 32767) {
                            var431 = 32767;
                        }
                        byte[] var432 = new byte[var431];
                        var430.field2400 += Statics.field3671.method2841(var430.field2401, var430.field2400, var432, 0, var431);
                        String var433 = class267.method477(var432, 0, var431);
                        var434 = var433;
                    } catch (Exception var494) {
                        var434 = "Cabbage";
                    }
                    String var437 = class265.method4497(class271.method3926(var434));
                    byte var438;
                    if (var425.field3180) {
                        var438 = 7;
                    } else {
                        var438 = 3;
                    }
                    if (var425.field3175 == -1) {
                        class99.method1689(var438, var420, var437);
                    } else {
                        class99.method1689(var438, class89.method971(var425.field3175) + var420, var437);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 66) {
                int var439 = field959.method2966();
                int var440 = field959.method2958();
                if (var440 == 65535) {
                    var440 = -1;
                }
                int var441 = field959.method2958();
                if (var441 == 65535) {
                    var441 = -1;
                }
                int var442 = field959.method2935();
                for (int var443 = var440; var443 <= var441; var443++) {
                    long var444 = ((long) var439 << 32) + (long) var443;
                    class193 var446 = field936.method3295(var444);
                    if (var446 != null) {
                        var446.method3347();
                    }
                    field936.method3296(new class199(var442), var444);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 224) {
                int var447 = field959.method3065();
                int var448 = field959.method2956();
                int var449 = field959.method2935();
                int var450 = field959.method2956();
                class217 var451 = class217.method3143(var449);
                if (var451.field2713 != var447 || var451.field2705 != var450 || var451.field2707 != var448) {
                    var451.field2713 = var447;
                    var451.field2705 = var450;
                    var451.field2707 = var448;
                    method1404(var451);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 24) {
                String var452 = field959.method3098();
                class180 var453 = field959;
                String var457;
                try {
                    int var454 = var453.method2934();
                    if (var454 > 32767) {
                        var454 = 32767;
                    }
                    byte[] var455 = new byte[var454];
                    var453.field2400 += Statics.field3671.method2841(var453.field2401, var453.field2400, var455, 0, var454);
                    String var456 = class267.method477(var455, 0, var454);
                    var457 = var456;
                } catch (Exception var493) {
                    var457 = "Cabbage";
                }
                String var460 = class265.method4497(class271.method3926(var457));
                class99.method1689(6, var452, var460);
                field961 = -1;
                return true;
            }
            if (field961 == 154) {
                int var461 = field960 + field959.field2400;
                int var462 = field959.method3065();
                int var463 = field959.method3065();
                if (field993 != var462) {
                    field993 = var462;
                    this.method1056(false);
                    method171(field993);
                    class84.method4601(field993);
                    for (int var464 = 0; var464 < 100; var464++) {
                        field1122[var464] = true;
                    }
                }
                while (var463-- > 0) {
                    int var465 = field959.method3058();
                    int var466 = field959.method3065();
                    int var467 = field959.method2925();
                    class69 var468 = (class69) field1135.method3295((long) var465);
                    if (var468 != null && var468.field819 != var466) {
                        method219(var468, true);
                        var468 = null;
                    }
                    if (var468 == null) {
                        var468 = method3825(var465, var466, var467);
                    }
                    var468.field816 = true;
                }
                for (class69 var469 = (class69) field1135.method3298(); var469 != null; var469 = (class69) field1135.method3306()) {
                    if (var469.field816) {
                        var469.field816 = false;
                    } else {
                        method219(var469, true);
                    }
                }
                field936 = new class191(512);
                while (field959.field2400 < var461) {
                    int var470 = field959.method3058();
                    int var471 = field959.method3065();
                    int var472 = field959.method3065();
                    int var473 = field959.method3058();
                    for (int var474 = var471; var474 <= var472; var474++) {
                        long var475 = ((long) var470 << 32) + (long) var474;
                        field936.method3296(new class199(var473), var475);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 201) {
                field1014 = field1111;
                if (field960 == 0) {
                    field1142 = null;
                    field1143 = null;
                    Statics.field370 = 0;
                    Statics.field17 = null;
                    field961 = -1;
                    return true;
                }
                field1143 = field959.method3098();
                long var477 = field959.method2927();
                field1142 = class269.method548(var477);
                Statics.field1144 = field959.method2922();
                int var479 = field959.method2925();
                if (var479 == 255) {
                    field961 = -1;
                    return true;
                }
                Statics.field370 = var479;
                class76[] var480 = new class76[100];
                for (int var481 = 0; var481 < Statics.field370; var481++) {
                    var480[var481] = new class76();
                    var480[var481].field912 = field959.method3098();
                    var480[var481].field899 = Statics.method2789(var480[var481].field912, Statics.field282);
                    var480[var481].field900 = field959.method3065();
                    var480[var481].field901 = field959.method2922();
                    field959.method3098();
                    if (var480[var481].field912.equals(Statics.field2350.field888)) {
                        Statics.field1694 = var480[var481].field901;
                    }
                }
                boolean var482 = false;
                int var483 = Statics.field370;
                while (var483 > 0) {
                    boolean var484 = true;
                    var483--;
                    for (int var485 = 0; var485 < var483; var485++) {
                        if (var480[var485].field899.compareTo(var480[var485 + 1].field899) > 0) {
                            class76 var486 = var480[var485];
                            var480[var485] = var480[var485 + 1];
                            var480[var485 + 1] = var486;
                            var484 = false;
                        }
                    }
                    if (var484) {
                        break;
                    }
                }
                Statics.field17 = var480;
                field961 = -1;
                return true;
            }
            if (field961 == 86) {
                class81 var487 = new class81();
                var487.field1313 = field959.method3098();
                var487.field1308 = field959.method3065();
                int var488 = field959.method3058();
                var487.field1309 = var488;
                method9(45);
                Statics.field243.method2755();
                Statics.field243 = null;
                class93.method993(var487);
                field961 = -1;
                return false;
            }
            class153.method1609("" + field961 + class89.field1393 + field965 + class89.field1393 + field966 + class89.field1393 + field960, (Throwable) null);
            method154();
        } catch (IOException var506) {
            method3661();
        } catch (Exception var507) {
            String var491 = "" + field961 + class89.field1393 + field965 + class89.field1393 + field966 + class89.field1393 + field960 + class89.field1393 + (Statics.field749 + Statics.field2350.field1282[0]) + class89.field1393 + (Statics.field357 + Statics.field2350.field1283[0]) + class89.field1393;
            for (int var492 = 0; var492 < field960 && var492 < 50; var492++) {
                var491 = var491 + field959.field2401[var492] + class89.field1393;
            }
            class153.method1609(var491, var507);
            method154();
        }
        return true;
    }

    @ObfuscatedName("au.gs(B)V")
    public static final void method456() {
        if (field961 == 31) {
            byte var0 = field959.method2951();
            int var1 = field959.method2957();
            int var2 = field959.method2958();
            byte var3 = field959.method3069();
            int var4 = field959.method2950();
            int var5 = (var4 >> 4 & 0x7) + Statics.field805;
            int var6 = (var4 & 0x7) + Statics.field2339;
            int var7 = field959.method2956();
            int var8 = field959.method2956();
            byte var9 = field959.method3069();
            int var10 = field959.method2950();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field978[var11];
            byte var14 = field959.method2922();
            class75 var15;
            if (field1037 == var8) {
                var15 = Statics.field2350;
            } else {
                var15 = field1036[var8];
            }
            if (var15 != null) {
                class256 var16 = class256.method937(var2);
                int var17;
                int var18;
                if (var12 == 1 || var12 == 3) {
                    var17 = var16.field3446;
                    var18 = var16.field3458;
                } else {
                    var17 = var16.field3458;
                    var18 = var16.field3446;
                }
                int var19 = (var17 >> 1) + var5;
                int var20 = (var17 + 1 >> 1) + var5;
                int var21 = (var18 >> 1) + var6;
                int var22 = (var18 + 1 >> 1) + var6;
                int[][] var23 = class62.field748[Statics.field1449];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var5 << 7) + (var17 << 6);
                int var26 = (var6 << 7) + (var18 << 6);
                class134 var27 = var16.method4250(var11, var12, var23, var25, var24, var26);
                if (var27 != null) {
                    method977(Statics.field1449, var5, var6, var13, -1, 0, 0, var1 + 1, var7 + 1);
                    var15.field879 = field923 + var1;
                    var15.field880 = field923 + var7;
                    var15.field885 = var27;
                    var15.field881 = var5 * 128 + var17 * 64;
                    var15.field883 = var6 * 128 + var18 * 64;
                    var15.field882 = var24;
                    if (var3 > var14) {
                        byte var28 = var3;
                        var3 = var14;
                        var14 = var28;
                    }
                    if (var9 > var0) {
                        byte var29 = var9;
                        var9 = var0;
                        var0 = var29;
                    }
                    var15.field889 = var3 + var5;
                    var15.field887 = var5 + var14;
                    var15.field890 = var6 + var9;
                    var15.field871 = var0 + var6;
                }
            }
        }
        if (field961 == 27) {
            int var30 = field959.method2925();
            int var31 = (var30 >> 4 & 0x7) + Statics.field805;
            int var32 = (var30 & 0x7) + Statics.field2339;
            int var33 = field959.method3065();
            int var34 = field959.method3065();
            int var35 = field959.method3065();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class194 var36 = field1046[Statics.field1449][var31][var32];
                if (var36 != null) {
                    for (class95 var37 = (class95) var36.method3372(); var37 != null; var37 = (class95) var36.method3358()) {
                        if ((var33 & 0x7FFF) == var37.field1489 && var37.field1483 == var34) {
                            var37.field1483 = var35;
                            break;
                        }
                    }
                    method4453(var31, var32);
                }
            }
        } else if (field961 == 77) {
            int var38 = field959.method2948();
            int var39 = (var38 >> 4 & 0x7) + Statics.field805;
            int var40 = (var38 & 0x7) + Statics.field2339;
            int var41 = field959.method2957();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class194 var42 = field1046[Statics.field1449][var39][var40];
                if (var42 != null) {
                    for (class95 var43 = (class95) var42.method3372(); var43 != null; var43 = (class95) var42.method3358()) {
                        if ((var41 & 0x7FFF) == var43.field1489) {
                            var43.method3347();
                            break;
                        }
                    }
                    if (var42.method3372() == null) {
                        field1046[Statics.field1449][var39][var40] = null;
                    }
                    method4453(var39, var40);
                }
            }
        } else if (field961 == 173) {
            int var44 = field959.method2948();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field978[var45];
            int var48 = field959.method2958();
            int var49 = field959.method2949();
            int var50 = (var49 >> 4 & 0x7) + Statics.field805;
            int var51 = (var49 & 0x7) + Statics.field2339;
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                method977(Statics.field1449, var50, var51, var47, var48, var45, var46, 0, -1);
            }
        } else {
            if (field961 == 5) {
                int var52 = field959.method2925();
                int var53 = (var52 >> 4 & 0x7) + Statics.field805;
                int var54 = (var52 & 0x7) + Statics.field2339;
                int var55 = field959.method3065();
                int var56 = field959.method2925();
                int var57 = var56 >> 4 & 0xF;
                int var58 = var56 & 0x7;
                int var59 = field959.method2925();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    int var60 = var57 + 1;
                    if (Statics.field2350.field1282[0] >= var53 - var60 && Statics.field2350.field1282[0] <= var53 + var60 && Statics.field2350.field1283[0] >= var54 - var60 && Statics.field2350.field1283[0] <= var54 + var60 && field1006 != 0 && var58 > 0 && field1078 < 50) {
                        field1159[field1078] = var55;
                        field1160[field1078] = var58;
                        field1050[field1078] = var59;
                        field1163[field1078] = null;
                        field1102[field1078] = (var53 << 16) + (var54 << 8) + var57;
                        field1078++;
                    }
                }
            }
            if (field961 == 90) {
                int var61 = field959.method2948();
                int var62 = var61 >> 2;
                int var63 = var61 & 0x3;
                int var64 = field978[var62];
                int var65 = field959.method2948();
                int var66 = (var65 >> 4 & 0x7) + Statics.field805;
                int var67 = (var65 & 0x7) + Statics.field2339;
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    method977(Statics.field1449, var66, var67, var64, -1, var62, var63, 0, -1);
                }
            } else if (field961 == 236) {
                int var68 = field959.method2925();
                int var69 = (var68 >> 4 & 0x7) + Statics.field805;
                int var70 = (var68 & 0x7) + Statics.field2339;
                int var71 = var69 + field959.method2922();
                int var72 = var70 + field959.method2922();
                int var73 = field959.method2924();
                int var74 = field959.method3065();
                int var75 = field959.method2925() * 4;
                int var76 = field959.method2925() * 4;
                int var77 = field959.method3065();
                int var78 = field959.method3065();
                int var79 = field959.method2925();
                int var80 = field959.method2925();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var74 != 65535) {
                    int var81 = var69 * 128 + 64;
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    int var84 = var72 * 128 + 64;
                    class94 var85 = new class94(var74, Statics.field1449, var81, var82, method3174(var81, var82, Statics.field1449) - var75, field923 + var77, field923 + var78, var79, var80, var73, var76);
                    var85.method1602(var83, var84, method3174(var83, var84, Statics.field1449) - var76, field923 + var77);
                    field1048.method3384(var85);
                }
            } else if (field961 == 246) {
                int var86 = field959.method2925();
                int var87 = (var86 >> 4 & 0x7) + Statics.field805;
                int var88 = (var86 & 0x7) + Statics.field2339;
                int var89 = field959.method3065();
                int var90 = field959.method2925();
                int var91 = field959.method3065();
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    int var92 = var87 * 128 + 64;
                    int var93 = var88 * 128 + 64;
                    class85 var94 = new class85(var89, Statics.field1449, var92, var93, method3174(var92, var93, Statics.field1449) - var90, var91, field923);
                    field1049.method3384(var94);
                }
            } else if (field961 == 180) {
                int var95 = field959.method2925();
                int var96 = (var95 >> 4 & 0x7) + Statics.field805;
                int var97 = (var95 & 0x7) + Statics.field2339;
                int var98 = field959.method2957();
                int var99 = field959.method3065();
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    class95 var100 = new class95();
                    var100.field1489 = var99;
                    var100.field1483 = var98;
                    if (field1046[Statics.field1449][var96][var97] == null) {
                        field1046[Statics.field1449][var96][var97] = new class194();
                    }
                    field1046[Statics.field1449][var96][var97].method3384(var100);
                    method4453(var96, var97);
                }
            } else if (field961 == 47) {
                int var101 = field959.method2949();
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = field978[var102];
                int var105 = field959.method2956();
                int var106 = field959.method2925();
                int var107 = (var106 >> 4 & 0x7) + Statics.field805;
                int var108 = (var106 & 0x7) + Statics.field2339;
                if (var107 >= 0 && var108 >= 0 && var107 < 103 && var108 < 103) {
                    if (var104 == 0) {
                        class143 var109 = Statics.field752.method2671(Statics.field1449, var107, var108);
                        if (var109 != null) {
                            int var110 = var109.field2138 >> 14 & 0x7FFF;
                            if (var102 == 2) {
                                var109.field2141 = new class101(var110, 2, var103 + 4, Statics.field1449, var107, var108, var105, false, var109.field2141);
                                var109.field2131 = new class101(var110, 2, var103 + 1 & 0x3, Statics.field1449, var107, var108, var105, false, var109.field2131);
                            } else {
                                var109.field2141 = new class101(var110, var102, var103, Statics.field1449, var107, var108, var105, false, var109.field2141);
                            }
                        }
                    }
                    if (var104 == 1) {
                        class148 var111 = Statics.field752.method2557(Statics.field1449, var107, var108);
                        if (var111 != null) {
                            int var112 = var111.field2186 >> 14 & 0x7FFF;
                            if (var102 == 4 || var102 == 5) {
                                var111.field2184 = new class101(var112, 4, var103, Statics.field1449, var107, var108, var105, false, var111.field2184);
                            } else if (var102 == 6) {
                                var111.field2184 = new class101(var112, 4, var103 + 4, Statics.field1449, var107, var108, var105, false, var111.field2184);
                            } else if (var102 == 7) {
                                var111.field2184 = new class101(var112, 4, (var103 + 2 & 0x3) + 4, Statics.field1449, var107, var108, var105, false, var111.field2184);
                            } else if (var102 == 8) {
                                var111.field2184 = new class101(var112, 4, var103 + 4, Statics.field1449, var107, var108, var105, false, var111.field2184);
                                var111.field2179 = new class101(var112, 4, (var103 + 2 & 0x3) + 4, Statics.field1449, var107, var108, var105, false, var111.field2179);
                            }
                        }
                    }
                    if (var104 == 2) {
                        class149 var113 = Statics.field752.method2508(Statics.field1449, var107, var108);
                        if (var102 == 11) {
                            var102 = 10;
                        }
                        if (var113 != null) {
                            var113.field2199 = new class101(var113.field2202 >> 14 & 0x7FFF, var102, var103, Statics.field1449, var107, var108, var105, false, var113.field2199);
                        }
                    }
                    if (var104 == 3) {
                        class130 var114 = Statics.field752.method2568(Statics.field1449, var107, var108);
                        if (var114 != null) {
                            var114.field1880 = new class101(var114.field1870 >> 14 & 0x7FFF, 22, var103, Statics.field1449, var107, var108, var105, false, var114.field1880);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.gu(IIIIIIIIII)V")
    public static final void method977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1047.method3372(); var10 != null; var10 = (class77) field1047.method3358()) {
            if (var10.field1204 == arg0 && var10.field1201 == arg1 && var10.field1202 == arg2 && var10.field1200 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1204 = arg0;
            var9.field1200 = arg3;
            var9.field1201 = arg1;
            var9.field1202 = arg2;
            method4570(var9);
            field1047.method3384(var9);
        }
        var9.field1206 = arg4;
        var9.field1208 = arg5;
        var9.field1209 = arg6;
        var9.field1213 = arg7;
        var9.field1214 = arg8;
    }

    @ObfuscatedName("ai.ge(I)V")
    public static final void method656() {
        for (class77 var0 = (class77) field1047.method3372(); var0 != null; var0 = (class77) field1047.method3358()) {
            if (var0.field1214 == -1) {
                var0.field1213 = 0;
                method4570(var0);
            } else {
                var0.method3347();
            }
        }
    }

    @ObfuscatedName("jl.gi(Lbq;B)V")
    public static final void method4570(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1200 == 0) {
            var1 = Statics.field752.method2510(arg0.field1204, arg0.field1201, arg0.field1202);
        }
        if (arg0.field1200 == 1) {
            var1 = Statics.field752.method2511(arg0.field1204, arg0.field1201, arg0.field1202);
        }
        if (arg0.field1200 == 2) {
            var1 = Statics.field752.method2512(arg0.field1204, arg0.field1201, arg0.field1202);
        }
        if (arg0.field1200 == 3) {
            var1 = Statics.field752.method2513(arg0.field1204, arg0.field1201, arg0.field1202);
        }
        if (var1 != 0) {
            int var5 = Statics.field752.method2579(arg0.field1204, arg0.field1201, arg0.field1202, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1203 = var2;
        arg0.field1215 = var3;
        arg0.field1212 = var4;
    }

    @ObfuscatedName("hg.gv(B)V")
    public static final void method3811() {
        for (class77 var0 = (class77) field1047.method3372(); var0 != null; var0 = (class77) field1047.method3358()) {
            if (var0.field1214 > 0) {
                var0.field1214--;
            }
            if (var0.field1214 != 0) {
                if (var0.field1213 > 0) {
                    var0.field1213--;
                }
                if (var0.field1213 == 0 && var0.field1201 >= 1 && var0.field1202 >= 1 && var0.field1201 <= 102 && var0.field1202 <= 102 && (var0.field1206 < 0 || class62.method191(var0.field1206, var0.field1208))) {
                    method459(var0.field1204, var0.field1200, var0.field1201, var0.field1202, var0.field1206, var0.field1209, var0.field1208);
                    var0.field1213 = -1;
                    if (var0.field1206 == var0.field1203 && var0.field1203 == -1) {
                        var0.method3347();
                    } else if (var0.field1206 == var0.field1203 && var0.field1212 == var0.field1209 && var0.field1215 == var0.field1208) {
                        var0.method3347();
                    }
                }
            } else if (var0.field1203 < 0 || class62.method191(var0.field1203, var0.field1215)) {
                method459(var0.field1204, var0.field1200, var0.field1201, var0.field1202, var0.field1203, var0.field1212, var0.field1215);
                var0.method3347();
            }
        }
    }

    @ObfuscatedName("ak.gn(IIIIIIII)V")
    public static final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field919 && Statics.field1449 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field752.method2510(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field752.method2511(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field752.method2512(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field752.method2513(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field752.method2579(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field752.method2641(arg0, arg2, arg3);
                class256 var15 = class256.method937(var12);
                if (var15.field3460 != 0) {
                    field975[arg0].method2788(arg2, arg3, var13, var14, var15.field3461);
                }
            }
            if (arg1 == 1) {
                Statics.field752.method2502(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field752.method2581(arg0, arg2, arg3);
                class256 var16 = class256.method937(var12);
                if (var16.field3458 + arg2 > 103 || var16.field3458 + arg3 > 103 || var16.field3446 + arg2 > 103 || var16.field3446 + arg3 > 103) {
                    return;
                }
                if (var16.field3460 != 0) {
                    field975[arg0].method2781(arg2, arg3, var16.field3458, var16.field3446, var14, var16.field3461);
                }
            }
            if (arg1 == 3) {
                Statics.field752.method2649(arg0, arg2, arg3);
                class256 var17 = class256.method937(var12);
                if (var17.field3460 == 1) {
                    field975[arg0].method2791(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field737[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field752;
        class162 var20 = field975[arg0];
        class256 var21 = class256.method937(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3446;
            var23 = var21.field3458;
        } else {
            var22 = var21.field3458;
            var23 = var21.field3446;
        }
        int var24;
        int var25;
        if (arg2 + var22 <= 104) {
            var24 = (var22 >> 1) + arg2;
            var25 = (var22 + 1 >> 1) + arg2;
        } else {
            var24 = arg2;
            var25 = arg2 + 1;
        }
        int var26;
        int var27;
        if (arg3 + var23 <= 104) {
            var26 = (var23 >> 1) + arg3;
            var27 = (var23 + 1 >> 1) + arg3;
        } else {
            var26 = arg3;
            var27 = arg3 + 1;
        }
        int[][] var28 = class62.field748[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3465 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3483 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var34 = var21.method4250(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2490(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3460 == 1) {
                var20.method2803(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var57 = var21.method4250(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2494(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3460 != 0) {
                var20.method2784(arg2, arg3, var22, var23, var21.field3461);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var35 = var21.method4250(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2494(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3460 != 0) {
                var20.method2784(arg2, arg3, var22, var23, var21.field3461);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var36 = var21.method4250(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2492(arg0, arg2, arg3, var29, var36, (class142) null, class62.field745[arg5], 0, var32, var33);
            if (var21.field3460 != 0) {
                var20.method2786(arg2, arg3, arg6, arg5, var21.field3461);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var37 = var21.method4250(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2492(arg0, arg2, arg3, var29, var37, (class142) null, class62.field746[arg5], 0, var32, var33);
            if (var21.field3460 != 0) {
                var20.method2786(arg2, arg3, arg6, arg5, var21.field3461);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var39 = var21.method4250(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4250(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2492(arg0, arg2, arg3, var29, var39, var40, class62.field745[arg5], class62.field745[var38], var32, var33);
            if (var21.field3460 != 0) {
                var20.method2786(arg2, arg3, arg6, arg5, var21.field3461);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var41 = var21.method4250(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2492(arg0, arg2, arg3, var29, var41, (class142) null, class62.field746[arg5], 0, var32, var33);
            if (var21.field3460 != 0) {
                var20.method2786(arg2, arg3, arg6, arg5, var21.field3461);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var42 = var21.method4250(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2494(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3460 != 0) {
                var20.method2784(arg2, arg3, var22, var23, var21.field3461);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var43 = var21.method4250(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2493(arg0, arg2, arg3, var29, var43, (class142) null, class62.field745[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2510(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class256.method937(var45 >> 14 & 0x7FFF).field3467;
            }
            class142 var46;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var46 = var21.method4250(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2493(arg0, arg2, arg3, var29, var46, (class142) null, class62.field745[arg5], 0, class62.field747[arg5] * var44, class62.field753[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2510(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class256.method937(var48 >> 14 & 0x7FFF).field3467 / 2;
            }
            class142 var49;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var49 = var21.method4250(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2493(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class62.field739[arg5] * var47, class62.field750[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var51 = var21.method4250(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2493(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2510(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class256.method937(var53 >> 14 & 0x7FFF).field3467 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var55 = var21.method4250(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4250(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2493(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field739[arg5] * var52, class62.field750[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("jj.gt(III)V")
    public static final void method4453(int arg0, int arg1) {
        class194 var2 = field1046[Statics.field1449][arg0][arg1];
        if (var2 == null) {
            Statics.field752.method2556(Statics.field1449, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3372(); var6 != null; var6 = (class95) var2.method3358()) {
            class257 var7 = class257.method4344(var6.field1489);
            long var8 = (long) var7.field3509;
            if (var7.field3535 == 1) {
                var8 = (long) (var6.field1483 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field752.method2556(Statics.field1449, arg0, arg1);
            return;
        }
        var2.method3353(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3372(); var12 != null; var12 = (class95) var2.method3358()) {
            if (var5.field1489 != var12.field1489) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1489 != var12.field1489 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field752.method2491(Statics.field1449, arg0, arg1, method3174(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1449), var5, var13, var10, var11);
    }

    @ObfuscatedName("h.gp(ZI)V")
    public static final void method43(boolean arg0) {
        field951 = 0;
        field955 = 0;
        method1688();
        method55(arg0);
        method2696();
        for (int var1 = 0; var1 < field951; var1++) {
            int var2 = field1040[var1];
            if (field923 != field952[var2].field1262) {
                field952[var2].field1379 = null;
                field952[var2] = null;
            }
        }
        if (field960 != field959.field2400) {
            throw new RuntimeException(field959.field2400 + class89.field1393 + field960);
        }
        for (int var3 = 0; var3 < field953; var3++) {
            if (field952[field954[var3]] == null) {
                throw new RuntimeException(var3 + class89.field1393 + field953);
            }
        }
    }

    @ObfuscatedName("ca.go(I)V")
    public static final void method1688() {
        field959.method3149();
        int var0 = field959.method3150(8);
        if (var0 < field953) {
            for (int var1 = var0; var1 < field953; var1++) {
                field1040[++field951 - 1] = field954[var1];
            }
        }
        if (var0 > field953) {
            throw new RuntimeException("");
        }
        field953 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field954[var2];
            class87 var4 = field952[var3];
            int var5 = field959.method3150(1);
            if (var5 == 0) {
                field954[++field953 - 1] = var3;
                var4.field1262 = field923;
            } else {
                int var6 = field959.method3150(2);
                if (var6 == 0) {
                    field954[++field953 - 1] = var3;
                    var4.field1262 = field923;
                    field956[++field955 - 1] = var3;
                } else if (var6 == 1) {
                    field954[++field953 - 1] = var3;
                    var4.field1262 = field923;
                    int var7 = field959.method3150(3);
                    var4.method1553(var7, (byte) 1);
                    int var8 = field959.method3150(1);
                    if (var8 == 1) {
                        field956[++field955 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field954[++field953 - 1] = var3;
                    var4.field1262 = field923;
                    int var9 = field959.method3150(3);
                    var4.method1553(var9, (byte) 2);
                    int var10 = field959.method3150(3);
                    var4.method1553(var10, (byte) 2);
                    int var11 = field959.method3150(1);
                    if (var11 == 1) {
                        field956[++field955 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1040[++field951 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("e.gl(ZI)V")
    public static final void method55(boolean arg0) {
        while (true) {
            if (field959.method3145(field960) >= 27) {
                int var1 = field959.method3150(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field952[var1] == null) {
                        field952[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field952[var1];
                    field954[++field953 - 1] = var1;
                    var3.field1262 = field923;
                    int var4 = field959.method3150(1);
                    if (var4 == 1) {
                        field956[++field955 - 1] = var1;
                    }
                    var3.field1379 = Statics.method3798(field959.method3150(14));
                    int var5 = field959.method3150(1);
                    int var6;
                    if (arg0) {
                        var6 = field959.method3150(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field959.method3150(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field1044[field959.method3150(3)];
                    if (var2) {
                        var3.field1253 = var3.field1248 = var7;
                    }
                    int var8;
                    if (arg0) {
                        var8 = field959.method3150(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field959.method3150(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field1231 = var3.field1379.field3578;
                    var3.field1243 = var3.field1379.field3565;
                    if (var3.field1243 == 0) {
                        var3.field1248 = 0;
                    }
                    var3.field1235 = var3.field1379.field3580;
                    var3.field1236 = var3.field1379.field3572;
                    var3.field1266 = var3.field1379.field3573;
                    var3.field1238 = var3.field1379.field3574;
                    var3.field1232 = var3.field1379.field3575;
                    var3.field1233 = var3.field1379.field3569;
                    var3.field1249 = var3.field1379.field3570;
                    var3.method1554(Statics.field2350.field1282[0] + var6, Statics.field2350.field1283[0] + var8, var5 == 1);
                    continue;
                }
            }
            field959.method3151();
            return;
        }
    }

    @ObfuscatedName("eb.gd(I)V")
    public static final void method2696() {
        for (int var0 = 0; var0 < field955; var0++) {
            int var1 = field956[var0];
            class87 var2 = field952[var1];
            int var3 = field959.method2925();
            if ((var3 & 0x4) != 0) {
                int var4 = field959.method2950();
                if (var4 > 0) {
                    for (int var5 = 0; var5 < var4; var5++) {
                        int var6 = -1;
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = field959.method2934();
                        if (var9 == 32767) {
                            var9 = field959.method2934();
                            var7 = field959.method2934();
                            var6 = field959.method2934();
                            var8 = field959.method2934();
                        } else if (var9 == 32766) {
                            var9 = -1;
                        } else {
                            var7 = field959.method2934();
                        }
                        int var10 = field959.method2934();
                        var2.method1392(var9, var7, var6, var8, field923, var10);
                    }
                }
                int var11 = field959.method2948();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = field959.method2934();
                        int var14 = field959.method2934();
                        if (var14 == 32767) {
                            var2.method1396(var13);
                        } else {
                            int var15 = field959.method2934();
                            int var16 = field959.method2950();
                            int var17 = var14 > 0 ? field959.method2948() : var16;
                            var2.method1389(var13, field923, var14, var15, var16, var17);
                        }
                    }
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field1285 = field959.method2957();
                if (var2.field1285 == 65535) {
                    var2.field1285 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var18 = field959.method3065();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field959.method2949();
                if (var2.field1228 == var18 && var18 != -1) {
                    int var20 = class261.method2887(var18).field3618;
                    if (var20 == 1) {
                        var2.field1260 = 0;
                        var2.field1261 = 0;
                        var2.field1278 = var19;
                        var2.field1229 = 0;
                    }
                    if (var20 == 2) {
                        var2.field1229 = 0;
                    }
                } else if (var18 == -1 || var2.field1228 == -1 || class261.method2887(var18).field3620 >= class261.method2887(var2.field1228).field3620) {
                    var2.field1228 = var18;
                    var2.field1260 = 0;
                    var2.field1261 = 0;
                    var2.field1278 = var19;
                    var2.field1229 = 0;
                    var2.field1286 = var2.field1281;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var21 = field959.method3065();
                int var22 = field959.method2957();
                int var23 = var2.field1234 - (var21 - Statics.field749 - Statics.field749) * 64;
                int var24 = var2.field1276 - (var22 - Statics.field357 - Statics.field357) * 64;
                if (var23 != 0 || var24 != 0) {
                    var2.field1255 = (int) (Math.atan2((double) var23, (double) var24) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field1271 = field959.method3098();
                var2.field1267 = 100;
            }
            if ((var3 & 0x1) != 0) {
                var2.field1246 = field959.method2957();
                int var25 = field959.method2935();
                var2.field1280 = var25 >> 16;
                var2.field1257 = (var25 & 0xFFFF) + field923;
                var2.field1265 = 0;
                var2.field1250 = 0;
                if (var2.field1257 > field923) {
                    var2.field1265 = -1;
                }
                if (var2.field1246 == 65535) {
                    var2.field1246 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field1379 = Statics.method3798(field959.method2958());
                var2.field1231 = var2.field1379.field3578;
                var2.field1243 = var2.field1379.field3565;
                var2.field1235 = var2.field1379.field3580;
                var2.field1236 = var2.field1379.field3572;
                var2.field1266 = var2.field1379.field3573;
                var2.field1238 = var2.field1379.field3574;
                var2.field1232 = var2.field1379.field3575;
                var2.field1233 = var2.field1379.field3569;
                var2.field1249 = var2.field1379.field3570;
            }
        }
    }

    @ObfuscatedName("eb.gq(IIB)Lfw;")
    public static class164 method2694(int arg0, int arg1) {
        field1195.field2320 = arg0;
        field1195.field2321 = arg1;
        field1195.field2322 = 1;
        field1195.field2325 = 1;
        return field1195;
    }

    @ObfuscatedName("cf.ga(I)V")
    public static void method1574() {
        field1055 = 0;
        field1063 = -1;
        field1054 = false;
    }

    @ObfuscatedName("a.gy(III)V")
    public static final void method75(int arg0, int arg1) {
        if (field1055 < 2 && field1069 == 0 && !field1072) {
            return;
        }
        int var2 = method1696();
        String var3;
        if (field1069 == 1 && field1055 < 2) {
            var3 = class226.field3074 + class226.field3014 + field989 + " " + class89.field1389;
        } else if (field1072 && field1055 < 2) {
            var3 = field1075 + class226.field3014 + field1076 + " " + class89.field1389;
        } else {
            var3 = method1561(var2);
        }
        if (field1055 > 2) {
            var3 = var3 + class89.method909(16777215) + " " + '/' + " " + (field1055 - 2) + class226.field3008;
        }
        Statics.field3289.method4479(var3, arg0 + 4, arg1 + 15, 16777215, 0, field923 / 1000);
    }

    @ObfuscatedName("cs.gx(I)V")
    public static final void method1400() {
        int var0 = Statics.field247;
        int var1 = Statics.field2268;
        int var2 = Statics.field452;
        int var3 = Statics.field231;
        int var4 = 6116423;
        class282.method4722(var0, var1, var2, var3, var4);
        class282.method4722(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class282.method4658(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field3289.method4472(class226.field3007, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field730;
        int var6 = class60.field716 * 1327680731;
        for (int var7 = 0; var7 < field1055; var7++) {
            int var8 = (field1055 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field3289.method4472(method1561(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field247;
        int var11 = Statics.field2268;
        int var12 = Statics.field452;
        int var13 = Statics.field231;
        for (int var14 = 0; var14 < field1120; var14++) {
            if (field1127[var14] + field1125[var14] > var10 && field1125[var14] < var10 + var12 && field1128[var14] + field1067[var14] > var11 && field1067[var14] < var11 + var13) {
                field1123[var14] = true;
            }
        }
    }

    @ObfuscatedName("bi.hu(IIIII)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1120; var4++) {
            if (field1127[var4] + field1125[var4] > arg0 && field1125[var4] < arg0 + arg2 && field1128[var4] + field1067[var4] > arg1 && field1067[var4] < arg1 + arg3) {
                field1122[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hb(I)V")
    public final void method1297() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field1055 - 1; var2++) {
                if (field1105[var2] < 1000 && field1105[var2 + 1] > 1000) {
                    String var3 = field924[var2];
                    field924[var2] = field924[var2 + 1];
                    field924[var2 + 1] = var3;
                    String var4 = field1158[var2];
                    field1158[var2] = field1158[var2 + 1];
                    field1158[var2 + 1] = var4;
                    int var5 = field1105[var2];
                    field1105[var2] = field1105[var2 + 1];
                    field1105[var2 + 1] = var5;
                    int var6 = field1056[var2];
                    field1056[var2] = field1056[var2 + 1];
                    field1056[var2 + 1] = var6;
                    int var7 = field998[var2];
                    field998[var2] = field998[var2 + 1];
                    field998[var2 + 1] = var7;
                    int var8 = field1059[var2];
                    field1059[var2] = field1059[var2 + 1];
                    field1059[var2 + 1] = var8;
                    if (field1063 != -1) {
                        if (field1063 == var2) {
                            field1063 = var2 + 1;
                        } else if (field1063 == var2 + 1) {
                            field1063 = var2;
                        }
                    }
                    var1 = false;
                }
            }
        }
        if (Statics.field1530 != null || field1090 != null) {
            return;
        }
        int var26;
        int var28;
        int var29;
        label233: {
            int var9 = class60.field714;
            if (field1054) {
                if (var9 != 1 && (Statics.field1799 || var9 != 4)) {
                    int var10 = class60.field730;
                    int var11 = class60.field716 * 1327680731;
                    if (var10 < Statics.field247 - 10 || var10 > Statics.field452 + Statics.field247 + 10 || var11 < Statics.field2268 - 10 || var11 > Statics.field231 + Statics.field2268 + 10) {
                        field1054 = false;
                        method991(Statics.field247, Statics.field2268, Statics.field452, Statics.field231);
                    }
                }
                if (var9 == 1 || !Statics.field1799 && var9 == 4) {
                    int var12 = Statics.field247;
                    int var13 = Statics.field2268;
                    int var14 = Statics.field452;
                    int var15 = class60.field724;
                    int var16 = class60.field725;
                    int var17 = -1;
                    for (int var18 = 0; var18 < field1055; var18++) {
                        int var19 = (field1055 - 1 - var18) * 15 + var13 + 31;
                        if (var15 > var12 && var15 < var12 + var14 && var16 > var19 - 13 && var16 < var19 + 3) {
                            var17 = var18;
                        }
                    }
                    if (var17 != -1 && var17 >= 0) {
                        int var20 = field1056[var17];
                        int var21 = field998[var17];
                        int var22 = field1105[var17];
                        int var23 = field1059[var17];
                        String var24 = field1158[var17];
                        String var25 = field924[var17];
                        method457(var20, var21, var22, var23, var24, var25, class60.field724, class60.field725);
                    }
                    field1054 = false;
                    method991(Statics.field247, Statics.field2268, Statics.field452, Statics.field231);
                }
            } else {
                var26 = method1696();
                if ((var9 == 1 || !Statics.field1799 && var9 == 4) && var26 >= 0) {
                    int var27 = field1105[var26];
                    if (var27 == 39 || var27 == 40 || var27 == 41 || var27 == 42 || var27 == 43 || var27 == 33 || var27 == 34 || var27 == 35 || var27 == 36 || var27 == 37 || var27 == 38 || var27 == 1005) {
                        var28 = field1056[var26];
                        var29 = field998[var26];
                        class217 var30 = class217.method3143(var29);
                        int var31 = method4162(var30);
                        boolean var32 = (var31 >> 28 & 0x1) != 0;
                        if (var32) {
                            break label233;
                        }
                        class218 var10000 = (class218) null;
                        if (class218.method4452(method4162(var30))) {
                            break label233;
                        }
                    }
                }
                if ((var9 == 1 || !Statics.field1799 && var9 == 4) && (field1053 == 1 && field1055 > 2 && !method3729() || method229(var26))) {
                    var9 = 2;
                }
                if ((var9 == 1 || !Statics.field1799 && var9 == 4) && field1055 > 0 && var26 >= 0) {
                    int var34 = field1056[var26];
                    int var35 = field998[var26];
                    int var36 = field1105[var26];
                    int var37 = field1059[var26];
                    String var38 = field1158[var26];
                    String var39 = field924[var26];
                    method457(var34, var35, var36, var37, var38, var39, class60.field724, class60.field725);
                }
                if (var9 == 2 && field1055 > 0) {
                    this.method1365(class60.field724, class60.field725);
                }
            }
            return;
        }
        if (Statics.field1530 != null && !field1033) {
            int var33 = method1696();
            if (field1053 != 1 && !method229(var33) && field1055 > 0) {
                method180(field1030, field997);
            }
        }
        field1033 = false;
        field1034 = 0;
        if (Statics.field1530 != null) {
            method1404(Statics.field1530);
        }
        Statics.field1530 = class217.method3143(var29);
        field1029 = var28;
        field1030 = class60.field724;
        field997 = class60.field725;
        if (var26 >= 0) {
            Statics.field1410 = new class90();
            Statics.field1410.field1403 = field1056[var26];
            Statics.field1410.field1398 = field998[var26];
            Statics.field1410.field1399 = field1105[var26];
            Statics.field1410.field1402 = field1059[var26];
            Statics.field1410.field1401 = field1158[var26];
        }
        method1404(Statics.field1530);
    }

    @ObfuscatedName("client.hx(III)V")
    public final void method1365(int arg0, int arg1) {
        int var3 = Statics.field3289.method4467(class226.field3007);
        for (int var4 = 0; var4 < field1055; var4++) {
            int var5 = Statics.field3289.method4467(method1561(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field1055 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field2409) {
            var7 = Statics.field2409 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field22) {
            var8 = Statics.field22 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field752.method2487(Statics.field1449, arg0, arg1, false);
        field1054 = true;
        Statics.field247 = var7;
        Statics.field2268 = var8;
        Statics.field452 = var3;
        Statics.field231 = field1055 * 15 + 22;
    }

    @ObfuscatedName("ad.he(II)Z")
    public static final boolean method229(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1105[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("au.hl(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method457(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 48) {
            class75 var8 = field1036[arg3];
            if (var8 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(164);
                field957.method2946(class51.field625[82] ? 1 : 0);
                field957.method2954(arg3);
            }
        }
        if (arg2 == 51) {
            class75 var9 = field1036[arg3];
            if (var9 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(235);
                field957.method2906(class51.field625[82] ? 1 : 0);
                field957.method2953(arg3);
            }
        }
        if (arg2 == 25) {
            class217 var10 = class217.method239(arg1, arg0);
            if (var10 != null) {
                method4143();
                method1916(arg1, arg0, class218.method757(method4162(var10)), var10.field2773);
                field1069 = 0;
                String var11;
                if (class218.method757(method4162(var10)) == 0) {
                    var11 = null;
                } else if (var10.field2781 == null || var10.field2781.trim().length() == 0) {
                    var11 = null;
                } else {
                    var11 = var10.field2781;
                }
                field1075 = var11;
                if (field1075 == null) {
                    field1075 = "Null";
                }
                if (var10.field2652) {
                    field1076 = var10.field2726 + class89.method909(16777215);
                } else {
                    field1076 = class89.method909(65280) + var10.field2728 + class89.method909(16777215);
                }
            }
            return;
        }
        if (arg2 == 1) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(216);
            field957.method2907(Statics.field1091);
            field957.method2954(Statics.field749 + arg0);
            field957.method2954(arg3 >> 14 & 0x7FFF);
            field957.method2963(Statics.field2153);
            field957.method2946(class51.field625[82] ? 1 : 0);
            field957.method2955(Statics.field357 + arg1);
            field957.method2953(Statics.field325);
        }
        if (arg2 == 19) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(149);
            field957.method2953(arg3);
            field957.method2955(Statics.field749 + arg0);
            field957.method2947(class51.field625[82] ? 1 : 0);
            field957.method2907(Statics.field357 + arg1);
        }
        if (arg2 == 31) {
            field957.method3159(1);
            field957.method2965(Statics.field2153);
            field957.method2965(arg1);
            field957.method2907(arg0);
            field957.method2955(Statics.field325);
            field957.method2953(arg3);
            field957.method2954(Statics.field1091);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 34) {
            field957.method3159(131);
            field957.method3104(arg1);
            field957.method2953(arg3);
            field957.method2907(arg0);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 13) {
            class87 var12 = field952[arg3];
            if (var12 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(78);
                field957.method2906(class51.field625[82] ? 1 : 0);
                field957.method2954(arg3);
            }
        }
        if (arg2 == 1005) {
            class217 var13 = class217.method3143(arg1);
            if (var13 == null || var13.field2772[arg0] < 100000) {
                field957.method3159(200);
                field957.method2953(arg3);
            } else {
                class99.method1689(27, "", var13.field2772[arg0] + " x " + class257.method4344(arg3).field3507);
            }
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 12) {
            class87 var14 = field952[arg3];
            if (var14 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(134);
                field957.method2946(class51.field625[82] ? 1 : 0);
                field957.method2954(arg3);
            }
        }
        if (arg2 == 45) {
            class75 var15 = field1036[arg3];
            if (var15 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(225);
                field957.method2955(arg3);
                field957.method2906(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(138);
            field957.method2907(Statics.field749 + arg0);
            field957.method2947(class51.field625[82] ? 1 : 0);
            field957.method2907(arg3 >> 14 & 0x7FFF);
            field957.method2954(Statics.field357 + arg1);
        }
        if (arg2 == 35) {
            field957.method3159(92);
            field957.method2953(arg3);
            field957.method2965(arg1);
            field957.method2955(arg0);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 6) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(2);
            field957.method2954(arg3 >> 14 & 0x7FFF);
            field957.method2954(Statics.field357 + arg1);
            field957.method2954(Statics.field749 + arg0);
            field957.method2947(class51.field625[82] ? 1 : 0);
        }
        if (arg2 == 9) {
            class87 var16 = field952[arg3];
            if (var16 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(39);
                field957.method2907(arg3);
                field957.method2947(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field957.method3159(110);
            field957.method2907(arg0);
            field957.method2953(arg3);
            field957.method2909(arg1);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 1004) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field957.method3159(200);
            field957.method2953(arg3);
        }
        if (arg2 == 33) {
            field957.method3159(113);
            field957.method3104(arg1);
            field957.method2954(arg3);
            field957.method2953(arg0);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var17 = class217.method239(arg1, arg0);
            if (var17 != null) {
                int var18 = var17.field2773;
                class217 var19 = class217.method239(arg1, arg0);
                if (var19 != null) {
                    if (var19.field2753 != null) {
                        class70 var20 = new class70();
                        var20.field825 = var19;
                        var20.field828 = arg3;
                        var20.field829 = arg5;
                        var20.field834 = var19.field2753;
                        class84.method3815(var20);
                    }
                    boolean var21 = true;
                    if (var19.field2721 > 0) {
                        var21 = method3998(var19);
                    }
                    if (var21 && class218.method4855(method4162(var19), arg3 - 1)) {
                        if (arg3 == 1) {
                            field957.method3159(57);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 2) {
                            field957.method3159(54);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 3) {
                            field957.method3159(239);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 4) {
                            field957.method3159(193);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 5) {
                            field957.method3159(42);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 6) {
                            field957.method3159(229);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 7) {
                            field957.method3159(35);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 8) {
                            field957.method3159(166);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 9) {
                            field957.method3159(226);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                        if (arg3 == 10) {
                            field957.method3159(214);
                            field957.method2909(arg1);
                            field957.method2907(arg0);
                            field957.method2907(var18);
                        }
                    }
                }
            }
        }
        if (arg2 == 8) {
            class87 var22 = field952[arg3];
            if (var22 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(102);
                field957.method2955(arg3);
                field957.method2954(field1073);
                field957.method3104(Statics.field1376);
                field957.method2945(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class87 var23 = field952[arg3];
            if (var23 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(191);
                field957.method2955(arg3);
                field957.method2947(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field957.method3159(67);
            field957.method2963(arg1);
            field957.method2907(arg0);
            field957.method2955(arg3);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 1002) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field957.method3159(32);
            field957.method2954(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2147.method4917(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 5) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(87);
            field957.method2955(arg3 >> 14 & 0x7FFF);
            field957.method2953(Statics.field357 + arg1);
            field957.method2953(Statics.field749 + arg0);
            field957.method2946(class51.field625[82] ? 1 : 0);
        }
        if (arg2 == 40) {
            field957.method3159(118);
            field957.method2953(arg3);
            field957.method2965(arg1);
            field957.method2955(arg0);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 43) {
            field957.method3159(51);
            field957.method2909(arg1);
            field957.method2907(arg3);
            field957.method2907(arg0);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 30 && field1148 == null) {
            method253(arg1, arg0);
            field1148 = class217.method239(arg1, arg0);
            method1404(field1148);
        }
        if (arg2 == 20) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(207);
            field957.method2954(Statics.field749 + arg0);
            field957.method2953(Statics.field357 + arg1);
            field957.method2955(arg3);
            field957.method2945(class51.field625[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class75 var24 = field1036[arg3];
            if (var24 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(148);
                field957.method2906(class51.field625[82] ? 1 : 0);
                field957.method2907(arg3);
            }
        }
        if (arg2 == 58) {
            class217 var25 = class217.method239(arg1, arg0);
            if (var25 != null) {
                field957.method3159(29);
                field957.method2954(field1074);
                field957.method2907(field1073);
                field957.method2953(var25.field2773);
                field957.method2963(arg1);
                field957.method2955(arg0);
                field957.method2963(Statics.field1376);
            }
        }
        if (arg2 == 3) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(180);
            field957.method2954(Statics.field357 + arg1);
            field957.method2906(class51.field625[82] ? 1 : 0);
            field957.method2954(arg3 >> 14 & 0x7FFF);
            field957.method2954(Statics.field749 + arg0);
        }
        if (arg2 == 38) {
            method4143();
            class217 var26 = class217.method3143(arg1);
            field1069 = 1;
            Statics.field1091 = arg0;
            Statics.field2153 = arg1;
            Statics.field325 = arg3;
            method1404(var26);
            field989 = class89.method909(16748608) + class257.method4344(arg3).field3507 + class89.method909(16777215);
            if (field989 == null) {
                field989 = "null";
            }
            return;
        }
        if (arg2 == 37) {
            field957.method3159(139);
            field957.method2965(arg1);
            field957.method2953(arg0);
            field957.method2954(arg3);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 24) {
            class217 var27 = class217.method3143(arg1);
            boolean var28 = true;
            if (var27.field2721 > 0) {
                var28 = method3998(var27);
            }
            if (var28) {
                field957.method3159(253);
                field957.method2909(arg1);
            }
        }
        if (arg2 == 28) {
            field957.method3159(253);
            field957.method2909(arg1);
            class217 var29 = class217.method3143(arg1);
            if (var29.field2769 != null && var29.field2769[0][0] == 5) {
                int var30 = var29.field2769[0][1];
                class212.field2615[var30] = 1 - class212.field2615[var30];
                method1378(var30);
            }
        }
        if (arg2 == 49) {
            class75 var31 = field1036[arg3];
            if (var31 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(161);
                field957.method2907(arg3);
                field957.method2906(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class87 var32 = field952[arg3];
            if (var32 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(43);
                field957.method2906(class51.field625[82] ? 1 : 0);
                field957.method2955(arg3);
            }
        }
        if (arg2 == 50) {
            class75 var33 = field1036[arg3];
            if (var33 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(28);
                field957.method2945(class51.field625[82] ? 1 : 0);
                field957.method2954(arg3);
            }
        }
        if (arg2 == 21) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(199);
            field957.method2953(arg3);
            field957.method2906(class51.field625[82] ? 1 : 0);
            field957.method2953(Statics.field357 + arg1);
            field957.method2953(Statics.field749 + arg0);
        }
        if (arg2 == 32) {
            field957.method3159(83);
            field957.method3104(arg1);
            field957.method2954(field1073);
            field957.method2963(Statics.field1376);
            field957.method2953(arg3);
            field957.method2953(arg0);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 47) {
            class75 var34 = field1036[arg3];
            if (var34 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(77);
                field957.method2945(class51.field625[82] ? 1 : 0);
                field957.method2907(arg3);
            }
        }
        if (arg2 == 23) {
            if (field1054) {
                Statics.field752.method2522();
            } else {
                Statics.field752.method2487(Statics.field1449, arg0, arg1, true);
            }
        }
        if (arg2 == 41) {
            field957.method3159(115);
            field957.method2953(arg3);
            field957.method2955(arg0);
            field957.method3104(arg1);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 29) {
            field957.method3159(253);
            field957.method2909(arg1);
            class217 var35 = class217.method3143(arg1);
            if (var35.field2769 != null && var35.field2769[0][0] == 5) {
                int var36 = var35.field2769[0][1];
                if (class212.field2615[var36] != var35.field2767[0]) {
                    class212.field2615[var36] = var35.field2767[0];
                    method1378(var36);
                }
            }
        }
        if (arg2 == 16) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(34);
            field957.method2955(Statics.field1091);
            field957.method2909(Statics.field2153);
            field957.method2953(Statics.field357 + arg1);
            field957.method2953(arg3);
            field957.method2946(class51.field625[82] ? 1 : 0);
            field957.method2907(Statics.field325);
            field957.method2954(Statics.field749 + arg0);
        }
        if (arg2 == 46) {
            class75 var37 = field1036[arg3];
            if (var37 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(194);
                field957.method2945(class51.field625[82] ? 1 : 0);
                field957.method2954(arg3);
            }
        }
        if (arg2 == 1003) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            class87 var38 = field952[arg3];
            if (var38 != null) {
                class259 var39 = var38.field1379;
                if (var39.field3589 != null) {
                    var39 = var39.method4372();
                }
                if (var39 != null) {
                    field957.method3159(89);
                    field957.method2954(var39.field3563);
                }
            }
        }
        if (arg2 == 26) {
            field957.method3159(169);
            for (class69 var40 = (class69) field1135.method3298(); var40 != null; var40 = (class69) field1135.method3306()) {
                if (var40.field817 == 0 || var40.field817 == 3) {
                    method219(var40, true);
                }
            }
            if (field1148 != null) {
                method1404(field1148);
                field1148 = null;
            }
        }
        if (arg2 == 42) {
            field957.method3159(222);
            field957.method3104(arg1);
            field957.method2907(arg3);
            field957.method2955(arg0);
            field1027 = 0;
            Statics.field3682 = class217.method3143(arg1);
            field1028 = arg0;
        }
        if (arg2 == 17) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(117);
            field957.method2906(class51.field625[82] ? 1 : 0);
            field957.method2955(Statics.field749 + arg0);
            field957.method2907(field1073);
            field957.method2955(Statics.field357 + arg1);
            field957.method2907(arg3);
            field957.method2963(Statics.field1376);
        }
        if (arg2 == 7) {
            class87 var41 = field952[arg3];
            if (var41 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(142);
                field957.method2953(arg3);
                field957.method2965(Statics.field2153);
                field957.method2907(Statics.field325);
                field957.method2955(Statics.field1091);
                field957.method2947(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(56);
            field957.method2954(arg3);
            field957.method2906(class51.field625[82] ? 1 : 0);
            field957.method2954(Statics.field357 + arg1);
            field957.method2953(Statics.field749 + arg0);
        }
        if (arg2 == 14) {
            class75 var42 = field1036[arg3];
            if (var42 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(136);
                field957.method3104(Statics.field2153);
                field957.method2953(arg3);
                field957.method2953(Statics.field1091);
                field957.method2907(Statics.field325);
                field957.method2946(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(189);
            field957.method2947(class51.field625[82] ? 1 : 0);
            field957.method2955(Statics.field357 + arg1);
            field957.method2907(arg3 >> 14 & 0x7FFF);
            field957.method2954(Statics.field749 + arg0);
        }
        if (arg2 == 15) {
            class75 var43 = field1036[arg3];
            if (var43 != null) {
                field1023 = arg6;
                field971 = arg7;
                field1196 = 2;
                field1025 = 0;
                field1150 = arg0;
                field1157 = arg1;
                field957.method3159(81);
                field957.method2963(Statics.field1376);
                field957.method2907(arg3);
                field957.method2947(class51.field625[82] ? 1 : 0);
                field957.method2907(field1073);
            }
        }
        if (arg2 == 18) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(218);
            field957.method2945(class51.field625[82] ? 1 : 0);
            field957.method2907(Statics.field749 + arg0);
            field957.method2907(Statics.field357 + arg1);
            field957.method2953(arg3);
        }
        if (arg2 == 2) {
            field1023 = arg6;
            field971 = arg7;
            field1196 = 2;
            field1025 = 0;
            field1150 = arg0;
            field1157 = arg1;
            field957.method3159(175);
            field957.method2954(field1073);
            field957.method3104(Statics.field1376);
            field957.method2954(Statics.field357 + arg1);
            field957.method2955(arg3 >> 14 & 0x7FFF);
            field957.method2954(Statics.field749 + arg0);
            field957.method2945(class51.field625[82] ? 1 : 0);
        }
        if (field1069 != 0) {
            field1069 = 0;
            method1404(class217.method3143(Statics.field2153));
        }
        if (field1072) {
            method4143();
        }
        if (Statics.field3682 != null && field1027 == 0) {
            method1404(Statics.field3682);
        }
    }

    @ObfuscatedName("ct.hk(ILjava/lang/String;B)V")
    public static void method1463(int arg0, String arg1) {
        int var2 = class97.field1500;
        int[] var3 = class97.field1502;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field1036[var3[var5]];
            if (var6 != null && Statics.field2350 != var6 && var6.field888 != null && var6.field888.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field957.method3159(148);
                    field957.method2906(0);
                    field957.method2907(var3[var5]);
                } else if (arg0 == 4) {
                    field957.method3159(77);
                    field957.method2945(0);
                    field957.method2907(var3[var5]);
                } else if (arg0 == 6) {
                    field957.method3159(161);
                    field957.method2907(var3[var5]);
                    field957.method2906(0);
                } else if (arg0 == 7) {
                    field957.method3159(28);
                    field957.method2945(0);
                    field957.method2954(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method1689(4, "", class226.field3003 + arg1);
        }
    }

    @ObfuscatedName("dk.ho(IIIIS)V")
    public static void method1916(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = class217.method239(arg0, arg1);
        if (var4 != null && var4.field2744 != null) {
            class70 var5 = new class70();
            var5.field825 = var4;
            var5.field834 = var4.field2744;
            class84.method3815(var5);
        }
        field1074 = arg3;
        field1072 = true;
        Statics.field1376 = arg0;
        field1073 = arg1;
        Statics.field2837 = arg2;
        method1404(var4);
    }

    @ObfuscatedName("iu.hi(I)V")
    public static void method4143() {
        if (!field1072) {
            return;
        }
        class217 var0 = class217.method239(Statics.field1376, field1073);
        if (var0 != null && var0.field2745 != null) {
            class70 var1 = new class70();
            var1.field825 = var0;
            var1.field834 = var0.field2745;
            class84.method3815(var1);
        }
        field1072 = false;
        method1404(var0);
    }

    @ObfuscatedName("an.hj(IIB)V")
    public static void method253(int arg0, int arg1) {
        field957.method3159(70);
        field957.method2907(arg1);
        field957.method2909(arg0);
    }

    @ObfuscatedName("iy.hz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4189(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method546(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("af.hr(Ljava/lang/String;Ljava/lang/String;IIIIZS)V")
    public static final void method546(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1054 || field1055 >= 500) {
            return;
        }
        field1158[field1055] = arg0;
        field924[field1055] = arg1;
        field1105[field1055] = arg2;
        field1059[field1055] = arg3;
        field1056[field1055] = arg4;
        field998[field1055] = arg5;
        if (arg6) {
            field1063 = field1055;
        }
        field1055++;
    }

    @ObfuscatedName("ch.hy(I)I")
    public static final int method1696() {
        if (field1055 <= 0) {
            return -1;
        } else if (field1180 && class51.field625[81] && field1063 != -1) {
            return field1063;
        } else {
            return field1055 - 1;
        }
    }

    @ObfuscatedName("hj.hw(B)Z")
    public static final boolean method3729() {
        if (field1055 <= 0) {
            return false;
        } else {
            return field1180 && class51.field625[81] && field1063 != -1;
        }
    }

    @ObfuscatedName("cs.hc(I)V")
    public static void method1401() {
        for (int var0 = 0; var0 < field1055; var0++) {
            int var1 = field1105[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1055 - 1) {
                    for (int var3 = var0; var3 < field1055 - 1; var3++) {
                        field1158[var3] = field1158[var3 + 1];
                        field924[var3] = field924[var3 + 1];
                        field1105[var3] = field1105[var3 + 1];
                        field1059[var3] = field1059[var3 + 1];
                        field1056[var3] = field1056[var3 + 1];
                        field998[var3] = field998[var3 + 1];
                    }
                }
                field1055--;
            }
        }
    }

    @ObfuscatedName("cn.hm(II)Ljava/lang/String;")
    public static String method1561(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field924[arg0].length() > 0) {
            return field1158[arg0] + class226.field3014 + field924[arg0];
        } else {
            return field1158[arg0];
        }
    }

    @ObfuscatedName("aw.hf(Lic;IIII)V")
    public static final void method243(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1055 >= 400) {
            return;
        }
        if (arg0.field3589 != null) {
            arg0 = arg0.method4372();
        }
        if (arg0 == null || !arg0.field3592 || arg0.field3583 && field1026 != arg1) {
            return;
        }
        String var4 = arg0.field3564;
        if (arg0.field3581 != 0) {
            int var6 = arg0.field3581;
            int var7 = Statics.field2350.field884;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method909(16711680);
            } else if (var8 < -6) {
                var9 = class89.method909(16723968);
            } else if (var8 < -3) {
                var9 = class89.method909(16740352);
            } else if (var8 < 0) {
                var9 = class89.method909(16756736);
            } else if (var8 > 9) {
                var9 = class89.method909(65280);
            } else if (var8 > 6) {
                var9 = class89.method909(4259584);
            } else if (var8 > 3) {
                var9 = class89.method909(8453888);
            } else if (var8 > 0) {
                var9 = class89.method909(12648192);
            } else {
                var9 = class89.method909(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1391 + class226.field3010 + arg0.field3581 + class89.field1392;
        }
        if (arg0.field3583 && field1062) {
            method4189(class226.field3005, class89.method909(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1069 == 1) {
            method4189(class226.field3074, field989 + " " + class89.field1389 + " " + class89.method909(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1072) {
            int var10 = arg0.field3583 && field1062 ? 2000 : 0;
            String[] var11 = arg0.field3579;
            if (field1088) {
                var11 = Statics.method58(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field3006)) {
                        int var13 = 0;
                        if (var12 == 0) {
                            var13 = var10 + 9;
                        }
                        if (var12 == 1) {
                            var13 = var10 + 10;
                        }
                        if (var12 == 2) {
                            var13 = var10 + 11;
                        }
                        if (var12 == 3) {
                            var13 = var10 + 12;
                        }
                        if (var12 == 4) {
                            var13 = var10 + 13;
                        }
                        method4189(var11[var12], class89.method909(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field3006)) {
                        short var15 = 0;
                        if (field940 != class92.field1415) {
                            if (field940 == class92.field1411 || field940 == class92.field1413 && arg0.field3581 > Statics.field2350.field884) {
                                var15 = 2000;
                            }
                            int var16 = 0;
                            if (var14 == 0) {
                                var16 = var15 + 9;
                            }
                            if (var14 == 1) {
                                var16 = var15 + 10;
                            }
                            if (var14 == 2) {
                                var16 = var15 + 11;
                            }
                            if (var14 == 3) {
                                var16 = var15 + 12;
                            }
                            if (var14 == 4) {
                                var16 = var15 + 13;
                            }
                            method4189(var11[var14], class89.method909(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3583 || !field1062) {
                method4189(class226.field3005, class89.method909(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2837 & 0x2) == 2) {
            method4189(field1075, field1076 + " " + class89.field1389 + " " + class89.method909(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hx.hg(Lbw;IIII)V")
    public static final void method3662(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2350 == arg0 || field1055 >= 400) {
            return;
        }
        String var9;
        if (arg0.field877 == 0) {
            String var4 = arg0.field875[0] + arg0.field888 + arg0.field875[1];
            int var5 = arg0.field884;
            int var6 = Statics.field2350.field884;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method909(16711680);
            } else if (var7 < -6) {
                var8 = class89.method909(16723968);
            } else if (var7 < -3) {
                var8 = class89.method909(16740352);
            } else if (var7 < 0) {
                var8 = class89.method909(16756736);
            } else if (var7 > 9) {
                var8 = class89.method909(65280);
            } else if (var7 > 6) {
                var8 = class89.method909(4259584);
            } else if (var7 > 3) {
                var8 = class89.method909(8453888);
            } else if (var7 > 0) {
                var8 = class89.method909(12648192);
            } else {
                var8 = class89.method909(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1391 + class226.field3010 + arg0.field884 + class89.field1392 + arg0.field875[2];
        } else {
            var9 = arg0.field875[0] + arg0.field888 + arg0.field875[1] + " " + class89.field1391 + class226.field3011 + arg0.field877 + class89.field1392 + arg0.field875[2];
        }
        if (field1069 == 1) {
            method4189(class226.field3074, field989 + " " + class89.field1389 + " " + class89.method909(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1072) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1042[var10] != null) {
                    short var11 = 0;
                    if (field1042[var10].equalsIgnoreCase(class226.field3006)) {
                        if (field999 == class92.field1415) {
                            continue;
                        }
                        if (field999 == class92.field1411 || field999 == class92.field1413 && arg0.field884 > Statics.field2350.field884) {
                            var11 = 2000;
                        }
                        if (Statics.field2350.field872 != 0 && arg0.field872 != 0) {
                            if (Statics.field2350.field872 == arg0.field872) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1043[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field949[var10] + var11;
                    method4189(field1042[var10], class89.method909(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2837 & 0x8) == 8) {
            method4189(field1075, field1076 + " " + class89.field1389 + " " + class89.method909(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1055; var14++) {
            if (field1105[var14] == 23) {
                field924[var14] = class89.method909(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("q.hn(IIIIIIIII)V")
    public static final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method1008(arg0)) {
            Statics.field1367 = null;
            Statics.method3172(Statics.field2678[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1367 != null) {
                Statics.method3172(Statics.field1367, -1412584499, arg1, arg2, arg3, arg4, Statics.field2324, Statics.field584, arg7);
                Statics.field1367 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1122[var8] = true;
            }
        } else {
            field1122[arg7] = true;
        }
    }

    @ObfuscatedName("bu.ht(Ljava/lang/String;Lhj;I)Ljava/lang/String;")
    public static String method1037(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method462(method4450(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1388 != null) {
                    var5 = class271.method2195(Statics.field1388.field2233);
                    if (Statics.field1388.field2241 != null) {
                        var5 = (String) Statics.field1388.field2241;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("g.hp(IB)Ljava/lang/String;")
    public static final String method53(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1393 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method909(65408) + var1.substring(0, var1.length() - 8) + class226.field3015 + " " + class89.field1391 + var1 + class89.field1392 + class89.field1395;
        } else if (var1.length() > 6) {
            return " " + class89.method909(16777215) + var1.substring(0, var1.length() - 4) + class226.field3017 + " " + class89.field1391 + var1 + class89.field1392 + class89.field1395;
        } else {
            return " " + class89.method909(16776960) + var1 + class89.field1395;
        }
    }

    @ObfuscatedName("client.ha(ZB)V")
    public final void method1056(boolean arg0) {
        method1(field993, Statics.field2409, Statics.field22, arg0);
    }

    @ObfuscatedName("client.hq(Lhj;I)V")
    public void method1315(class217 arg0) {
        class217 var2 = arg0.field2668 == -1 ? null : class217.method3143(arg0.field2668);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2409;
            var4 = Statics.field22;
        } else {
            var3 = var2.field2701;
            var4 = var2.field2693;
        }
        Statics.method4(arg0, var3, var4, false);
        method981(arg0, var3, var4);
    }

    @ObfuscatedName("l.hd([Lhj;Lhj;ZI)V")
    public static void method162(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2676 == 0 ? arg1.field2701 : arg1.field2676;
        int var4 = arg1.field2677 == 0 ? arg1.field2693 : arg1.field2677;
        method621(arg0, arg1.field2653, var3, var4, arg2);
        if (arg1.field2777 != null) {
            method621(arg1.field2777, arg1.field2653, var3, var4, arg2);
        }
        class69 var5 = (class69) field1135.method3295((long) arg1.field2653);
        if (var5 != null) {
            method1(var5.field819, var3, var4, arg2);
        }
        if (arg1.field2721 == 1337) {
        }
    }

    @ObfuscatedName("p.hv(IIIZI)V")
    public static final void method1(int arg0, int arg1, int arg2, boolean arg3) {
        if (class217.method1008(arg0)) {
            method621(Statics.field2678[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("aj.hh([Lhj;IIIZS)V")
    public static void method621(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2668 == arg1) {
                Statics.method4(var6, arg2, arg3, arg4);
                method981(var6, arg2, arg3);
                if (var6.field2674 > var6.field2676 - var6.field2701) {
                    var6.field2674 = var6.field2676 - var6.field2701;
                }
                if (var6.field2674 < 0) {
                    var6.field2674 = 0;
                }
                if (var6.field2641 > var6.field2677 - var6.field2693) {
                    var6.field2641 = var6.field2677 - var6.field2693;
                }
                if (var6.field2641 < 0) {
                    var6.field2641 = 0;
                }
                if (var6.field2655 == 0) {
                    method162(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("by.is(Lhj;IIB)V")
    public static void method981(class217 arg0, int arg1, int arg2) {
        if (arg0.field2682 == 0) {
            arg0.field2666 = arg0.field2662;
        } else if (arg0.field2682 == 1) {
            arg0.field2666 = (arg1 - arg0.field2701) / 2 + arg0.field2662;
        } else if (arg0.field2682 == 2) {
            arg0.field2666 = arg1 - arg0.field2701 - arg0.field2662;
        } else if (arg0.field2682 == 3) {
            arg0.field2666 = arg0.field2662 * arg1 >> 14;
        } else if (arg0.field2682 == 4) {
            arg0.field2666 = (arg0.field2662 * arg1 >> 14) + (arg1 - arg0.field2701) / 2;
        } else {
            arg0.field2666 = arg1 - arg0.field2701 - (arg0.field2662 * arg1 >> 14);
        }
        if (arg0.field2778 == 0) {
            arg0.field2665 = arg0.field2704;
        } else if (arg0.field2778 == 1) {
            arg0.field2665 = (arg2 - arg0.field2693) / 2 + arg0.field2704;
        } else if (arg0.field2778 == 2) {
            arg0.field2665 = arg2 - arg0.field2693 - arg0.field2704;
        } else if (arg0.field2778 == 3) {
            arg0.field2665 = arg0.field2704 * arg2 >> 14;
        } else if (arg0.field2778 == 4) {
            arg0.field2665 = (arg0.field2704 * arg2 >> 14) + (arg2 - arg0.field2693) / 2;
        } else {
            arg0.field2665 = arg2 - arg0.field2693 - (arg0.field2704 * arg2 >> 14);
        }
        if (!field1087 || arg0.field2655 != 0) {
            return;
        }
        if (arg0.field2666 < 0) {
            arg0.field2666 = 0;
        } else if (arg0.field2701 + arg0.field2666 > arg1) {
            arg0.field2666 = arg1 - arg0.field2701;
        }
        if (arg0.field2665 < 0) {
            arg0.field2665 = 0;
        } else if (arg0.field2693 + arg0.field2665 > arg2) {
            arg0.field2665 = arg2 - arg0.field2693;
        }
    }

    @ObfuscatedName("ah.id(Lhj;IIIIIII)V")
    public static final void method463(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field996) {
            field913 = 32;
        } else {
            field913 = 0;
        }
        field996 = false;
        if (class60.field717 == 1 || !Statics.field1799 && class60.field717 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2641 -= 4;
                method1404(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2641 += 4;
                method1404(arg0);
            } else if (arg5 >= arg1 - field913 && arg5 < field913 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2641 = (arg4 - arg3) * var8 / var9;
                method1404(arg0);
                field996 = true;
            }
        }
        if (field941 == 0) {
            return;
        }
        int var10 = arg0.field2701;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2641 += field941 * 45;
            method1404(arg0);
        }
    }

    @ObfuscatedName("bg.it(IIIIII)V")
    public static final void method994(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field708[0].method4739(arg0, arg1);
        Statics.field708[1].method4739(arg0, arg1 + arg3 - 16);
        class282.method4722(arg0, arg1 + 16, 16, arg3 - 32, field992);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class282.method4722(arg0, arg1 + 16 + var6, 16, var5, field1177);
        class282.method4662(arg0, arg1 + 16 + var6, var5, field995);
        class282.method4662(arg0 + 1, arg1 + 16 + var6, var5, field995);
        class282.method4655(arg0, arg1 + 16 + var6, 16, field995);
        class282.method4655(arg0, arg1 + 17 + var6, 16, field995);
        class282.method4662(arg0 + 15, arg1 + 16 + var6, var5, field994);
        class282.method4662(arg0 + 14, arg1 + 17 + var6, var5 - 1, field994);
        class282.method4655(arg0, arg1 + 15 + var6 + var5, 16, field994);
        class282.method4655(arg0 + 1, arg1 + 14 + var6 + var5, 15, field994);
    }

    @ObfuscatedName("as.ia(IB)Ljava/lang/String;")
    public static final String method462(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("jj.ig(Lhj;II)I")
    public static final int method4450(class217 arg0, int arg1) {
        if (arg0.field2769 == null || arg1 >= arg0.field2769.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2769[arg1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            while (true) {
                int var6 = var2[var4++];
                int var7 = 0;
                byte var8 = 0;
                if (var6 == 0) {
                    return var3;
                }
                if (var6 == 1) {
                    var7 = field1171[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1051[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1012[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method3143(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method4344(var12).field3520 || field918)) {
                        for (int var13 = 0; var13 < var11.field2659.length; var13++) {
                            if (var12 + 1 == var11.field2659[var13]) {
                                var7 += var11.field2772[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2615[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2840[field1051[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2615[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2350.field884;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2841[var14]) {
                            var7 += field1051[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method3143(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method4344(var18).field3520 || field918)) {
                        for (int var19 = 0; var19 < var17.field2659.length; var19++) {
                            if (var18 + 1 == var17.field2659[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1007;
                }
                if (var6 == 12) {
                    var7 = field1198;
                }
                if (var6 == 13) {
                    int var20 = class212.field2615[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method3578(var22);
                }
                if (var6 == 15) {
                    var8 = 1;
                }
                if (var6 == 16) {
                    var8 = 2;
                }
                if (var6 == 17) {
                    var8 = 3;
                }
                if (var6 == 18) {
                    var7 = (Statics.field2350.field1234 >> 7) + Statics.field749;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2350.field1276 >> 7) + Statics.field357;
                }
                if (var6 == 20) {
                    var7 = var2[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @ObfuscatedName("ht.ii(IIIIIIII)V")
    public static final void method3816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method1008(arg0)) {
            method7(Statics.field2678[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("i.in([Lhj;IIIIIIII)V")
    public static final void method7(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2652 || var9.field2655 == 0 || var9.field2733 || method4162(var9) != 0 || field974 == var9 || var9.field2721 == 1338) && var9.field2668 == arg1 && (!var9.field2652 || !method992(var9))) {
                int var10 = var9.field2666 + arg6;
                int var11 = var9.field2665 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2655 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2655 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2701 + var10;
                    int var19 = var9.field2693 + var11;
                    if (var18 < var10) {
                        var16 = var18;
                        var18 = var10;
                    }
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    var18++;
                    var19++;
                    var12 = var16 > arg2 ? var16 : arg2;
                    var13 = var17 > arg3 ? var17 : arg3;
                    var14 = var18 < arg4 ? var18 : arg4;
                    var15 = var19 < arg5 ? var19 : arg5;
                } else {
                    int var22 = var9.field2701 + var10;
                    int var23 = var9.field2693 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1090 == var9) {
                    field1098 = true;
                    field1099 = var10;
                    field1100 = var11;
                }
                if (!var9.field2652 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field730;
                    int var25 = class60.field716 * 1327680731;
                    if (class60.field714 != 0) {
                        var24 = class60.field724;
                        var25 = class60.field725;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2721 == 1337) {
                        if (!field922 && !field1054 && var26) {
                            if (field1069 == 0 && !field1072) {
                                method4189(class226.field3048, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class135.field2010; var29++) {
                                int var30 = class135.field2003[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field752.method2579(Statics.field1449, var31, var32, var30) >= 0) {
                                        class256 var35 = class256.method937(var34);
                                        if (var35.field3484 != null) {
                                            var35 = var35.method4238();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field1069 == 1) {
                                            method4189(class226.field3074, field989 + " " + class89.field1389 + " " + class89.method909(65535) + var35.field3459, 1, var30, var31, var32);
                                        } else if (!field1072) {
                                            String[] var36 = var35.field3470;
                                            if (field1088) {
                                                var36 = Statics.method58(var36);
                                            }
                                            if (var36 != null) {
                                                for (int var37 = 4; var37 >= 0; var37--) {
                                                    if (var36[var37] != null) {
                                                        short var38 = 0;
                                                        if (var37 == 0) {
                                                            var38 = 3;
                                                        }
                                                        if (var37 == 1) {
                                                            var38 = 4;
                                                        }
                                                        if (var37 == 2) {
                                                            var38 = 5;
                                                        }
                                                        if (var37 == 3) {
                                                            var38 = 6;
                                                        }
                                                        if (var37 == 4) {
                                                            var38 = 1001;
                                                        }
                                                        method4189(var36[var37], class89.method909(65535) + var35.field3459, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method4189(class226.field3005, class89.method909(65535) + var35.field3459, 1002, var35.field3450 << 14, var31, var32);
                                        } else if ((Statics.field2837 & 0x4) == 4) {
                                            method4189(field1075, field1076 + " " + class89.field1389 + " " + class89.method909(65535) + var35.field3459, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class87 var39 = field952[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1379.field3578 == 1 && (var39.field1234 & 0x7F) == 64 && (var39.field1276 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field953; var40++) {
                                                class87 var41 = field952[field954[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1379.field3578 == 1 && var39.field1234 == var41.field1234 && var39.field1276 == var41.field1276) {
                                                    method243(var41.field1379, field954[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class97.field1500;
                                            int[] var43 = class97.field1502;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class75 var45 = field1036[var43[var44]];
                                                if (var45 != null && var39.field1234 == var45.field1234 && var39.field1276 == var45.field1276) {
                                                    method3662(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method243(var39.field1379, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class75 var46 = field1036[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1234 & 0x7F) == 64 && (var46.field1276 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field953; var47++) {
                                                class87 var48 = field952[field954[var47]];
                                                if (var48 != null && var48.field1379.field3578 == 1 && var46.field1234 == var48.field1234 && var46.field1276 == var48.field1276) {
                                                    method243(var48.field1379, field954[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class97.field1500;
                                            int[] var50 = class97.field1502;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class75 var52 = field1036[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1234 == var52.field1234 && var46.field1276 == var52.field1276) {
                                                    method3662(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1045 == var34) {
                                            var27 = var30;
                                        } else {
                                            method3662(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class194 var53 = field1046[Statics.field1449][var31][var32];
                                        if (var53 != null) {
                                            for (class95 var54 = (class95) var53.method3379(); var54 != null; var54 = (class95) var53.method3359()) {
                                                class257 var55 = class257.method4344(var54.field1489);
                                                if (field1069 == 1) {
                                                    method4189(class226.field3074, field989 + " " + class89.field1389 + " " + class89.method909(16748608) + var55.field3507, 16, var54.field1489, var31, var32);
                                                } else if (!field1072) {
                                                    String[] var56 = var55.field3521;
                                                    if (field1088) {
                                                        var56 = Statics.method58(var56);
                                                    }
                                                    for (int var57 = 4; var57 >= 0; var57--) {
                                                        if (var56 != null && var56[var57] != null) {
                                                            byte var58 = 0;
                                                            if (var57 == 0) {
                                                                var58 = 18;
                                                            }
                                                            if (var57 == 1) {
                                                                var58 = 19;
                                                            }
                                                            if (var57 == 2) {
                                                                var58 = 20;
                                                            }
                                                            if (var57 == 3) {
                                                                var58 = 21;
                                                            }
                                                            if (var57 == 4) {
                                                                var58 = 22;
                                                            }
                                                            method4189(var56[var57], class89.method909(16748608) + var55.field3507, var58, var54.field1489, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method4189(class226.field2855, class89.method909(16748608) + var55.field3507, 20, var54.field1489, var31, var32);
                                                        }
                                                    }
                                                    method4189(class226.field3005, class89.method909(16748608) + var55.field3507, 1004, var54.field1489, var31, var32);
                                                } else if ((Statics.field2837 & 0x1) == 1) {
                                                    method4189(field1075, field1076 + " " + class89.field1389 + " " + class89.method909(16748608) + var55.field3507, 17, var54.field1489, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class75 var61 = field1036[field1045];
                                method3662(var61, field1045, var59, var60);
                            }
                        }
                    } else if (var9.field2721 == 1338) {
                        method3669(var9, var10, var11);
                    } else {
                        if (var9.field2721 == 1400) {
                            Statics.field2147.method5045(class60.field730, class60.field716 * 1327680731, var26, var10, var11, var9.field2701, var9.field2693);
                        }
                        if (!field1054 && var26) {
                            if (var9.field2721 == 1400) {
                                Statics.field2147.method4971(var10, var11, var9.field2701, var9.field2693, var24, var25);
                            } else {
                                int var62 = var24 - var10;
                                int var63 = var25 - var11;
                                if (var9.field2656 == 1) {
                                    method4189(var9.field2770, "", 24, 0, 0, var9.field2653);
                                }
                                if (var9.field2656 == 2 && !field1072) {
                                    String var64;
                                    if (class218.method757(method4162(var9)) == 0) {
                                        var64 = null;
                                    } else if (var9.field2781 == null || var9.field2781.trim().length() == 0) {
                                        var64 = null;
                                    } else {
                                        var64 = var9.field2781;
                                    }
                                    if (var64 != null) {
                                        method4189(var64, class89.method909(65280) + var9.field2728, 25, 0, -1, var9.field2653);
                                    }
                                }
                                if (var9.field2656 == 3) {
                                    method4189(class226.field2862, "", 26, 0, 0, var9.field2653);
                                }
                                if (var9.field2656 == 4) {
                                    method4189(var9.field2770, "", 28, 0, 0, var9.field2653);
                                }
                                if (var9.field2656 == 5) {
                                    method4189(var9.field2770, "", 29, 0, 0, var9.field2653);
                                }
                                if (var9.field2656 == 6 && field1148 == null) {
                                    method4189(var9.field2770, "", 30, 0, -1, var9.field2653);
                                }
                                if (var9.field2655 == 2) {
                                    int var66 = 0;
                                    for (int var67 = 0; var67 < var9.field2693; var67++) {
                                        for (int var68 = 0; var68 < var9.field2701; var68++) {
                                            int var69 = (var9.field2719 + 32) * var68;
                                            int var70 = (var9.field2720 + 32) * var67;
                                            if (var66 < 20) {
                                                var69 += var9.field2657[var66];
                                                var70 += var9.field2722[var66];
                                            }
                                            if (var62 >= var69 && var63 >= var70 && var62 < var69 + 32 && var63 < var70 + 32) {
                                                field1032 = var66;
                                                Statics.field1205 = var9;
                                                if (var9.field2659[var66] > 0) {
                                                    class257 var71 = class257.method4344(var9.field2659[var66] - 1);
                                                    if (field1069 == 1 && class218.method1039(method4162(var9))) {
                                                        if (Statics.field2153 != var9.field2653 || Statics.field1091 != var66) {
                                                            method4189(class226.field3074, field989 + " " + class89.field1389 + " " + class89.method909(16748608) + var71.field3507, 31, var71.field3505, var66, var9.field2653);
                                                        }
                                                    } else if (!field1072 || !class218.method1039(method4162(var9))) {
                                                        String[] var72 = var71.field3522;
                                                        if (field1088) {
                                                            var72 = Statics.method58(var72);
                                                        }
                                                        int var73 = var71.method4297();
                                                        if (class218.method1039(method4162(var9))) {
                                                            for (int var74 = 4; var74 >= 3; var74--) {
                                                                boolean var75 = var73 == var74;
                                                                if (var72 != null && var72[var74] != null) {
                                                                    byte var76;
                                                                    if (var74 == 3) {
                                                                        var76 = 36;
                                                                    } else {
                                                                        var76 = 37;
                                                                    }
                                                                    method546(var72[var74], class89.method909(16748608) + var71.field3507, var76, var71.field3505, var66, var9.field2653, var75);
                                                                } else if (var74 == 4) {
                                                                    method546(class226.field2959, class89.method909(16748608) + var71.field3507, 37, var71.field3505, var66, var9.field2653, var75);
                                                                }
                                                            }
                                                        }
                                                        int var77 = method4162(var9);
                                                        boolean var78 = (var77 >> 31 & 0x1) != 0;
                                                        if (var78) {
                                                            method4189(class226.field3074, class89.method909(16748608) + var71.field3507, 38, var71.field3505, var66, var9.field2653);
                                                        }
                                                        class218 var10000 = (class218) null;
                                                        if (class218.method1039(method4162(var9)) && var72 != null) {
                                                            for (int var79 = 2; var79 >= 0; var79--) {
                                                                boolean var80 = var73 == var79;
                                                                if (var72[var79] != null) {
                                                                    byte var81 = 0;
                                                                    if (var79 == 0) {
                                                                        var81 = 33;
                                                                    }
                                                                    if (var79 == 1) {
                                                                        var81 = 34;
                                                                    }
                                                                    if (var79 == 2) {
                                                                        var81 = 35;
                                                                    }
                                                                    method546(var72[var79], class89.method909(16748608) + var71.field3507, var81, var71.field3505, var66, var9.field2653, var80);
                                                                }
                                                            }
                                                        }
                                                        String[] var82 = var9.field2724;
                                                        if (field1088) {
                                                            var82 = Statics.method58(var82);
                                                        }
                                                        if (var82 != null) {
                                                            for (int var83 = 4; var83 >= 0; var83--) {
                                                                if (var82[var83] != null) {
                                                                    byte var84 = 0;
                                                                    if (var83 == 0) {
                                                                        var84 = 39;
                                                                    }
                                                                    if (var83 == 1) {
                                                                        var84 = 40;
                                                                    }
                                                                    if (var83 == 2) {
                                                                        var84 = 41;
                                                                    }
                                                                    if (var83 == 3) {
                                                                        var84 = 42;
                                                                    }
                                                                    if (var83 == 4) {
                                                                        var84 = 43;
                                                                    }
                                                                    method4189(var82[var83], class89.method909(16748608) + var71.field3507, var84, var71.field3505, var66, var9.field2653);
                                                                }
                                                            }
                                                        }
                                                        method4189(class226.field3005, class89.method909(16748608) + var71.field3507, 1005, var71.field3505, var66, var9.field2653);
                                                    } else if ((Statics.field2837 & 0x10) == 16) {
                                                        method4189(field1075, field1076 + " " + class89.field1389 + " " + class89.method909(16748608) + var71.field3507, 32, var71.field3505, var66, var9.field2653);
                                                    }
                                                }
                                            }
                                            var66++;
                                        }
                                    }
                                }
                                if (var9.field2652) {
                                    if (field1072) {
                                        int var85 = method4162(var9);
                                        boolean var86 = (var85 >> 21 & 0x1) != 0;
                                        if (var86 && (Statics.field2837 & 0x20) == 32) {
                                            method4189(field1075, field1076 + " " + class89.field1389 + " " + var9.field2726, 58, 0, var9.field2654, var9.field2653);
                                        }
                                    } else {
                                        for (int var87 = 9; var87 >= 5; var87--) {
                                            String var88 = method1555(var9, var87);
                                            if (var88 != null) {
                                                method4189(var88, var9.field2726, 1007, var87 + 1, var9.field2654, var9.field2653);
                                            }
                                        }
                                        String var89;
                                        if (class218.method757(method4162(var9)) == 0) {
                                            var89 = null;
                                        } else if (var9.field2781 == null || var9.field2781.trim().length() == 0) {
                                            var89 = null;
                                        } else {
                                            var89 = var9.field2781;
                                        }
                                        if (var89 != null) {
                                            method4189(var89, var9.field2726, 25, 0, var9.field2654, var9.field2653);
                                        }
                                        for (int var91 = 4; var91 >= 0; var91--) {
                                            String var92 = method1555(var9, var91);
                                            if (var92 != null) {
                                                method4189(var92, var9.field2726, 57, var91 + 1, var9.field2654, var9.field2653);
                                            }
                                        }
                                        if (class218.method176(method4162(var9))) {
                                            method4189(class226.field2969, "", 30, 0, var9.field2654, var9.field2653);
                                        }
                                    }
                                }
                            }
                        }
                        if (var9.field2655 == 0) {
                            if (!var9.field2652 && method992(var9) && Statics.field1355 != var9) {
                                continue;
                            }
                            method7(arg0, var9.field2653, var12, var13, var14, var15, var10 - var9.field2674, var11 - var9.field2641);
                            if (var9.field2777 != null) {
                                method7(var9.field2777, var9.field2653, var12, var13, var14, var15, var10 - var9.field2674, var11 - var9.field2641);
                            }
                            class69 var93 = (class69) field1135.method3295((long) var9.field2653);
                            if (var93 != null) {
                                if (var93.field817 == 0 && class60.field730 >= var12 && class60.field716 * 1327680731 >= var13 && class60.field730 < var14 && class60.field716 * 1327680731 < var15 && !field1054 && !field1087) {
                                    for (class70 var94 = (class70) field1116.method3372(); var94 != null; var94 = (class70) field1116.method3358()) {
                                        if (var94.field824) {
                                            var94.method3347();
                                            var94.field825.field2675 = false;
                                        }
                                    }
                                    if (Statics.field453 == 0) {
                                        field1090 = null;
                                        field974 = null;
                                    }
                                    if (!field1054) {
                                        method1574();
                                        field1158[0] = class226.field3030;
                                        field924[0] = "";
                                        field1105[0] = 1006;
                                        field1055 = 1;
                                    }
                                }
                                method3816(var93.field819, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2652) {
                            if (var9.field2679) {
                                if (class60.field730 >= var12 && class60.field716 * 1327680731 >= var13 && class60.field730 < var14 && class60.field716 * 1327680731 < var15) {
                                    for (class70 var95 = (class70) field1116.method3372(); var95 != null; var95 = (class70) field1116.method3358()) {
                                        if (var95.field824) {
                                            var95.method3347();
                                            var95.field825.field2675 = false;
                                        }
                                    }
                                    if (Statics.field453 == 0) {
                                        field1090 = null;
                                        field974 = null;
                                    }
                                    if (!field1054) {
                                        field1158[0] = class226.field3030;
                                        field924[0] = "";
                                        field1105[0] = 1006;
                                        field1055 = 1;
                                    }
                                }
                            } else if (var9.field2787 && class60.field730 >= var12 && class60.field716 * 1327680731 >= var13 && class60.field730 < var14 && class60.field716 * 1327680731 < var15) {
                                for (class70 var96 = (class70) field1116.method3372(); var96 != null; var96 = (class70) field1116.method3358()) {
                                    if (var96.field824 && var96.field825.field2754 == var96.field834) {
                                        var96.method3347();
                                    }
                                }
                            }
                            boolean var97;
                            if (class60.field730 >= var12 && class60.field716 * 1327680731 >= var13 && class60.field730 < var14 && class60.field716 * 1327680731 < var15) {
                                var97 = true;
                            } else {
                                var97 = false;
                            }
                            boolean var98 = false;
                            if ((class60.field717 == 1 || !Statics.field1799 && class60.field717 == 4) && var97) {
                                var98 = true;
                            }
                            boolean var99 = false;
                            if ((class60.field714 == 1 || !Statics.field1799 && class60.field714 == 4) && class60.field724 >= var12 && class60.field725 >= var13 && class60.field724 < var14 && class60.field725 < var15) {
                                var99 = true;
                            }
                            if (var99) {
                                method663(var9, class60.field724 - var10, class60.field725 - var11);
                            }
                            if (var9.field2721 == 1400) {
                                Statics.field2147.method4929(class60.field730, class60.field716 * 1327680731, var97 & var98);
                            }
                            if (field1090 != null && field1090 != var9 && var97) {
                                int var100 = method4162(var9);
                                boolean var101 = (var100 >> 20 & 0x1) != 0;
                                if (var101) {
                                    field1094 = var9;
                                }
                            }
                            if (field974 == var9) {
                                field928 = true;
                                field1096 = var10;
                                field1097 = var11;
                            }
                            if (var9.field2733) {
                                if (var97 && field941 != 0 && var9.field2754 != null) {
                                    class70 var102 = new class70();
                                    var102.field824 = true;
                                    var102.field825 = var9;
                                    var102.field827 = field941;
                                    var102.field834 = var9.field2754;
                                    field1116.method3384(var102);
                                }
                                if (field1090 != null || Statics.field1530 != null || field1054) {
                                    var99 = false;
                                    var98 = false;
                                    var97 = false;
                                }
                                if (!var9.field2779 && var99) {
                                    var9.field2779 = true;
                                    if (var9.field2735 != null) {
                                        class70 var103 = new class70();
                                        var103.field824 = true;
                                        var103.field825 = var9;
                                        var103.field823 = class60.field724 - var10;
                                        var103.field827 = class60.field725 - var11;
                                        var103.field834 = var9.field2735;
                                        field1116.method3384(var103);
                                    }
                                }
                                if (var9.field2779 && var98 && var9.field2736 != null) {
                                    class70 var104 = new class70();
                                    var104.field824 = true;
                                    var104.field825 = var9;
                                    var104.field823 = class60.field730 - var10;
                                    var104.field827 = class60.field716 * 1327680731 - var11;
                                    var104.field834 = var9.field2736;
                                    field1116.method3384(var104);
                                }
                                if (var9.field2779 && !var98) {
                                    var9.field2779 = false;
                                    if (var9.field2708 != null) {
                                        class70 var105 = new class70();
                                        var105.field824 = true;
                                        var105.field825 = var9;
                                        var105.field823 = class60.field730 - var10;
                                        var105.field827 = class60.field716 * 1327680731 - var11;
                                        var105.field834 = var9.field2708;
                                        field1118.method3384(var105);
                                    }
                                }
                                if (var98 && var9.field2738 != null) {
                                    class70 var106 = new class70();
                                    var106.field824 = true;
                                    var106.field825 = var9;
                                    var106.field823 = class60.field730 - var10;
                                    var106.field827 = class60.field716 * 1327680731 - var11;
                                    var106.field834 = var9.field2738;
                                    field1116.method3384(var106);
                                }
                                if (!var9.field2675 && var97) {
                                    var9.field2675 = true;
                                    if (var9.field2739 != null) {
                                        class70 var107 = new class70();
                                        var107.field824 = true;
                                        var107.field825 = var9;
                                        var107.field823 = class60.field730 - var10;
                                        var107.field827 = class60.field716 * 1327680731 - var11;
                                        var107.field834 = var9.field2739;
                                        field1116.method3384(var107);
                                    }
                                }
                                if (var9.field2675 && var97 && var9.field2740 != null) {
                                    class70 var108 = new class70();
                                    var108.field824 = true;
                                    var108.field825 = var9;
                                    var108.field823 = class60.field730 - var10;
                                    var108.field827 = class60.field716 * 1327680731 - var11;
                                    var108.field834 = var9.field2740;
                                    field1116.method3384(var108);
                                }
                                if (var9.field2675 && !var97) {
                                    var9.field2675 = false;
                                    if (var9.field2756 != null) {
                                        class70 var109 = new class70();
                                        var109.field824 = true;
                                        var109.field825 = var9;
                                        var109.field823 = class60.field730 - var10;
                                        var109.field827 = class60.field716 * 1327680731 - var11;
                                        var109.field834 = var9.field2756;
                                        field1118.method3384(var109);
                                    }
                                }
                                if (var9.field2752 != null) {
                                    class70 var110 = new class70();
                                    var110.field825 = var9;
                                    var110.field834 = var9.field2752;
                                    field1117.method3384(var110);
                                }
                                if (var9.field2683 != null && field1104 > var9.field2771) {
                                    if (var9.field2732 == null || field1104 - var9.field2771 > 32) {
                                        class70 var115 = new class70();
                                        var115.field825 = var9;
                                        var115.field834 = var9.field2683;
                                        field1116.method3384(var115);
                                    } else {
                                        label943: for (int var111 = var9.field2771; var111 < field1104; var111++) {
                                            int var112 = field1103[var111 & 0x1F];
                                            for (int var113 = 0; var113 < var9.field2732.length; var113++) {
                                                if (var9.field2732[var113] == var112) {
                                                    class70 var114 = new class70();
                                                    var114.field825 = var9;
                                                    var114.field834 = var9.field2683;
                                                    field1116.method3384(var114);
                                                    break label943;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2771 = field1104;
                                }
                                if (var9.field2748 != null && field925 > var9.field2782) {
                                    if (var9.field2749 == null || field925 - var9.field2782 > 32) {
                                        class70 var120 = new class70();
                                        var120.field825 = var9;
                                        var120.field834 = var9.field2748;
                                        field1116.method3384(var120);
                                    } else {
                                        label919: for (int var116 = var9.field2782; var116 < field925; var116++) {
                                            int var117 = field930[var116 & 0x1F];
                                            for (int var118 = 0; var118 < var9.field2749.length; var118++) {
                                                if (var9.field2749[var118] == var117) {
                                                    class70 var119 = new class70();
                                                    var119.field825 = var9;
                                                    var119.field834 = var9.field2748;
                                                    field1116.method3384(var119);
                                                    break label919;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2782 = field925;
                                }
                                if (var9.field2741 != null && field1121 > var9.field2774) {
                                    if (var9.field2751 == null || field1121 - var9.field2774 > 32) {
                                        class70 var125 = new class70();
                                        var125.field825 = var9;
                                        var125.field834 = var9.field2741;
                                        field1116.method3384(var125);
                                    } else {
                                        label895: for (int var121 = var9.field2774; var121 < field1121; var121++) {
                                            int var122 = field1107[var121 & 0x1F];
                                            for (int var123 = 0; var123 < var9.field2751.length; var123++) {
                                                if (var9.field2751[var123] == var122) {
                                                    class70 var124 = new class70();
                                                    var124.field825 = var9;
                                                    var124.field834 = var9.field2741;
                                                    field1116.method3384(var124);
                                                    break label895;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2774 = field1121;
                                }
                                if (field933 > var9.field2780 && var9.field2755 != null) {
                                    class70 var126 = new class70();
                                    var126.field825 = var9;
                                    var126.field834 = var9.field2755;
                                    field1116.method3384(var126);
                                }
                                if (field1110 > var9.field2780 && var9.field2757 != null) {
                                    class70 var127 = new class70();
                                    var127.field825 = var9;
                                    var127.field834 = var9.field2757;
                                    field1116.method3384(var127);
                                }
                                if (field1014 > var9.field2780 && var9.field2758 != null) {
                                    class70 var128 = new class70();
                                    var128.field825 = var9;
                                    var128.field834 = var9.field2758;
                                    field1116.method3384(var128);
                                }
                                if (field1112 > var9.field2780 && var9.field2763 != null) {
                                    class70 var129 = new class70();
                                    var129.field825 = var9;
                                    var129.field834 = var9.field2763;
                                    field1116.method3384(var129);
                                }
                                if (field1113 > var9.field2780 && var9.field2764 != null) {
                                    class70 var130 = new class70();
                                    var130.field825 = var9;
                                    var130.field834 = var9.field2764;
                                    field1116.method3384(var130);
                                }
                                if (field1114 > var9.field2780 && var9.field2759 != null) {
                                    class70 var131 = new class70();
                                    var131.field825 = var9;
                                    var131.field834 = var9.field2759;
                                    field1116.method3384(var131);
                                }
                                var9.field2780 = field1111;
                                if (var9.field2650 != null) {
                                    for (int var132 = 0; var132 < field1138; var132++) {
                                        class70 var133 = new class70();
                                        var133.field825 = var9;
                                        var133.field830 = field1140[var132];
                                        var133.field831 = field1139[var132];
                                        var133.field834 = var9.field2650;
                                        field1116.method3384(var133);
                                    }
                                }
                            }
                        }
                        if (!var9.field2652 && field1090 == null && Statics.field1530 == null && !field1054) {
                            if ((var9.field2658 >= 0 || var9.field2765 != 0) && class60.field730 >= var12 && class60.field716 * 1327680731 >= var13 && class60.field730 < var14 && class60.field716 * 1327680731 < var15) {
                                if (var9.field2658 >= 0) {
                                    Statics.field1355 = arg0[var9.field2658];
                                } else {
                                    Statics.field1355 = var9;
                                }
                            }
                            if (var9.field2655 == 8 && class60.field730 >= var12 && class60.field716 * 1327680731 >= var13 && class60.field730 < var14 && class60.field716 * 1327680731 < var15) {
                                Statics.field1320 = var9;
                            }
                            if (var9.field2677 > var9.field2693) {
                                method463(var9, var9.field2701 + var10, var11, var9.field2693, var9.field2677, class60.field730, class60.field716 * 1327680731);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jj.if([Lhj;II)V")
    public static final void method4451(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2655 == 0) {
                    if (var3.field2777 != null) {
                        method4451(var3.field2777, arg1);
                    }
                    class69 var4 = (class69) field1135.method3295((long) var3.field2653);
                    if (var4 != null) {
                        int var5 = var4.field819;
                        if (class217.method1008(var5)) {
                            method4451(Statics.field2678[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2760 != null) {
                    class70 var6 = new class70();
                    var6.field825 = var3;
                    var6.field834 = var3.field2760;
                    class84.method3815(var6);
                }
                if (arg1 == 1 && var3.field2761 != null) {
                    if (var3.field2654 >= 0) {
                        class217 var7 = class217.method3143(var3.field2653);
                        if (var7 == null || var7.field2777 == null || var3.field2654 >= var7.field2777.length || var7.field2777[var3.field2654] != var3) {
                            continue;
                        }
                    }
                    class70 var8 = new class70();
                    var8.field825 = var3;
                    var8.field834 = var3.field2761;
                    class84.method3815(var8);
                }
            }
        }
    }

    @ObfuscatedName("az.ix(Lhj;III)V")
    public static final void method663(class217 arg0, int arg1, int arg2) {
        if (field1090 != null || field1054 || arg0 == null || method218(arg0) == null) {
            return;
        }
        field1090 = arg0;
        field974 = method218(arg0);
        field1092 = arg1;
        field1093 = arg2;
        Statics.field453 = 0;
        field1101 = false;
        int var3 = method1696();
        if (var3 == -1) {
            return;
        }
        Statics.field1410 = new class90();
        Statics.field1410.field1403 = field1056[var3];
        Statics.field1410.field1398 = field998[var3];
        Statics.field1410.field1399 = field1105[var3];
        Statics.field1410.field1402 = field1059[var3];
        Statics.field1410.field1401 = field1158[var3];
    }

    @ObfuscatedName("client.iq(I)V")
    public final void method1235() {
        method1404(field1090);
        Statics.field453++;
        if (field1098 && field928) {
            int var1 = class60.field730;
            int var2 = class60.field716 * 1327680731;
            int var3 = var1 - field1092;
            int var4 = var2 - field1093;
            if (var3 < field1096) {
                var3 = field1096;
            }
            if (field1090.field2701 + var3 > field1096 + field974.field2701) {
                var3 = field1096 + field974.field2701 - field1090.field2701;
            }
            if (var4 < field1097) {
                var4 = field1097;
            }
            if (field1090.field2693 + var4 > field1097 + field974.field2693) {
                var4 = field1097 + field974.field2693 - field1090.field2693;
            }
            int var5 = var3 - field1099;
            int var6 = var4 - field1100;
            int var7 = field1090.field2729;
            if (Statics.field453 > field1090.field2730 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1101 = true;
            }
            int var8 = field974.field2674 + (var3 - field1096);
            int var9 = field974.field2641 + (var4 - field1097);
            if (field1090.field2786 != null && field1101) {
                class70 var10 = new class70();
                var10.field825 = field1090;
                var10.field823 = var8;
                var10.field827 = var9;
                var10.field834 = field1090.field2786;
                class84.method3815(var10);
            }
            if (class60.field717 == 0) {
                if (field1101) {
                    if (field1090.field2743 != null) {
                        class70 var11 = new class70();
                        var11.field825 = field1090;
                        var11.field823 = var8;
                        var11.field827 = var9;
                        var11.field836 = field1094;
                        var11.field834 = field1090.field2743;
                        class84.method3815(var11);
                    }
                    if (field1094 != null && method2882(field1090) != null) {
                        field957.method3159(10);
                        field957.method2953(field1094.field2773);
                        field957.method2954(field1090.field2654);
                        field957.method2965(field1094.field2653);
                        field957.method3104(field1090.field2653);
                        field957.method2954(field1090.field2773);
                        field957.method2907(field1094.field2654);
                    }
                } else {
                    int var12 = method1696();
                    if (field1055 > 2 && !(field1053 != 1 || method3729()) || method229(var12)) {
                        this.method1365(field1099 + field1092, field1100 + field1093);
                    } else if (field1055 > 0) {
                        method180(field1099 + field1092, field1100 + field1093);
                    }
                }
                field1090 = null;
            }
        } else if (Statics.field453 > 1) {
            field1090 = null;
        }
    }

    @ObfuscatedName("k.ik(III)V")
    public static void method180(int arg0, int arg1) {
        class90 var2 = Statics.field1410;
        method457(var2.field1403, var2.field1398, var2.field1399, var2.field1402, var2.field1401, var2.field1401, arg0, arg1);
        Statics.field1410 = null;
    }

    @ObfuscatedName("cy.ie(Lhj;I)V")
    public static void method1404(class217 arg0) {
        if (field1068 == arg0.field2702) {
            field1122[arg0.field2784] = true;
        }
    }

    @ObfuscatedName("ac.ip(I)V")
    public static void method492() {
        for (class69 var0 = (class69) field1135.method3298(); var0 != null; var0 = (class69) field1135.method3306()) {
            int var1 = var0.field819;
            if (class217.method1008(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field2678[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2652;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2483;
                    class217 var6 = class217.method3143(var5);
                    if (var6 != null) {
                        method1404(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.ir(Lhj;I)Lhj;")
    public static class217 method218(class217 arg0) {
        class217 var1 = method2882(arg0);
        if (var1 == null) {
            var1 = arg0.field2768;
        }
        return var1;
    }

    @ObfuscatedName("q.iw(II)V")
    public static final void method171(int arg0) {
        if (!class217.method1008(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2678[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2775 = 0;
                var3.field2663 = 0;
            }
        }
    }

    @ObfuscatedName("bu.iz(IB)V")
    public static final void method1038(int arg0) {
        if (class217.method1008(arg0)) {
            method78(Statics.field2678[arg0], -1);
        }
    }

    @ObfuscatedName("a.iy([Lhj;II)V")
    public static final void method78(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2668 == arg1 && (!var3.field2652 || !method992(var3))) {
                if (var3.field2655 == 0) {
                    if (!var3.field2652 && method992(var3) && Statics.field1355 != var3) {
                        continue;
                    }
                    method78(arg0, var3.field2653);
                    if (var3.field2777 != null) {
                        method78(var3.field2777, var3.field2653);
                    }
                    class69 var4 = (class69) field1135.method3295((long) var3.field2653);
                    if (var4 != null) {
                        method1038(var4.field819);
                    }
                }
                if (var3.field2655 == 6) {
                    if (var3.field2700 != -1 || var3.field2667 != -1) {
                        boolean var5 = Statics.method472(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2667;
                        } else {
                            var6 = var3.field2700;
                        }
                        if (var6 != -1) {
                            class261 var7 = class261.method2887(var6);
                            var3.field2663 += field991;
                            while (var3.field2663 > var7.field3615[var3.field2775]) {
                                var3.field2663 -= var7.field3615[var3.field2775];
                                var3.field2775++;
                                if (var3.field2775 >= var7.field3617.length) {
                                    var3.field2775 -= var7.field3608;
                                    if (var3.field2775 < 0 || var3.field2775 >= var7.field3617.length) {
                                        var3.field2775 = 0;
                                    }
                                }
                                method1404(var3);
                            }
                        }
                    }
                    if (var3.field2709 != 0 && !var3.field2652) {
                        int var8 = var3.field2709 >> 16;
                        int var9 = var3.field2709 << 16 >> 16;
                        int var10 = field991 * var8;
                        int var11 = field991 * var9;
                        var3.field2713 = var3.field2713 + var10 & 0x7FF;
                        var3.field2705 = var3.field2705 + var11 & 0x7FF;
                        method1404(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.io(II)V")
    public static final void method1378(int arg0) {
        method492();
        for (class83 var1 = (class83) class83.field1326.method3372(); var1 != null; var1 = (class83) class83.field1326.method3358()) {
            if (var1.field1337 != null) {
                var1.method1465();
            }
        }
        int var2 = Statics.method1614(arg0).field3293;
        if (var2 == 0) {
            return;
        }
        int var3 = class212.field2615[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class137.method2408(0.9D);
                ((class126) Statics.field2040).method2209(0.9D);
            }
            if (var3 == 2) {
                class137.method2408(0.8D);
                ((class126) Statics.field2040).method2209(0.8D);
            }
            if (var3 == 3) {
                class137.method2408(0.7D);
                ((class126) Statics.field2040).method2209(0.7D);
            }
            if (var3 == 4) {
                class137.method2408(0.6D);
                ((class126) Statics.field2040).method2209(0.6D);
            }
            class257.method16();
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (field1031 != var4) {
                if (field1031 == 0 && field1154 != -1) {
                    class204.method3180(Statics.field657, field1154, 0, var4, false);
                    field1155 = false;
                } else if (var4 == 0) {
                    Statics.field2518.method3477();
                    class204.field2516 = 1;
                    Statics.field2517 = null;
                    field1155 = false;
                } else {
                    class204.method544(var4);
                }
                field1031 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1156 = 127;
            }
            if (var3 == 1) {
                field1156 = 96;
            }
            if (var3 == 2) {
                field1156 = 64;
            }
            if (var3 == 3) {
                field1156 = 32;
            }
            if (var3 == 4) {
                field1156 = 0;
            }
        }
        if (var2 == 5) {
            field1053 = var3;
        }
        if (var2 == 6) {
            field1079 = var3;
        }
        if (var2 == 9) {
            field1080 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1006 = 127;
            }
            if (var3 == 1) {
                field1006 = 96;
            }
            if (var3 == 2) {
                field1006 = 64;
            }
            if (var3 == 3) {
                field1006 = 32;
            }
            if (var3 == 4) {
                field1006 = 0;
            }
        }
        if (var2 == 17) {
            field1026 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class92[] var5 = new class92[] { class92.field1415, class92.field1413, class92.field1411, class92.field1412 };
            field999 = (class92) class169.method1611(var5, var3);
            if (field999 == null) {
                field999 = class92.field1413;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1045 = -1;
            } else {
                field1045 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class92[] var6 = new class92[] { class92.field1415, class92.field1413, class92.field1411, class92.field1412 };
        field940 = (class92) class169.method1611(var6, var3);
        if (field940 == null) {
            field940 = class92.field1413;
        }
    }

    @ObfuscatedName("hv.iv(IIII)Lby;")
    public static final class69 method3825(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field819 = arg1;
        var3.field817 = arg2;
        field1135.method3296(var3, (long) arg0);
        method171(arg1);
        class217 var4 = class217.method3143(arg0);
        method1404(var4);
        if (field1148 != null) {
            method1404(field1148);
            field1148 = null;
        }
        method1401();
        method162(Statics.field2678[arg0 >> 16], var4, false);
        class84.method4601(arg1);
        if (field993 != -1) {
            int var5 = field993;
            if (class217.method1008(var5)) {
                method4451(Statics.field2678[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ae.im(Lby;ZI)V")
    public static final void method219(class69 arg0, boolean arg1) {
        int var2 = arg0.field819;
        int var3 = (int) arg0.field2483;
        arg0.method3347();
        if (arg1) {
            class217.method3173(var2);
        }
        for (class199 var4 = (class199) field936.method3298(); var4 != null; var4 = (class199) field936.method3306()) {
            if ((long) var2 == (var4.field2483 >> 48 & 0xFFFFL)) {
                var4.method3347();
            }
        }
        class217 var5 = class217.method3143(var3);
        if (var5 != null) {
            method1404(var5);
        }
        method1401();
        if (field993 != -1) {
            int var6 = field993;
            if (class217.method1008(var6)) {
                method4451(Statics.field2678[var6], 1);
            }
        }
    }

    @ObfuscatedName("ii.ib(Lhj;I)Z")
    public static final boolean method3998(class217 arg0) {
        int var1 = arg0.field2721;
        if (var1 == 205) {
            field967 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1189.method3693(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1189.method3706(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1189.method3695(false);
        }
        if (var1 == 325) {
            field1189.method3695(true);
        }
        if (var1 == 326) {
            field957.method3159(146);
            field1189.method3696(field957);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("es.ic(IIIILjp;Lhx;I)V")
    public static final void method2693(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method123(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field986 + field1000 & 0x7FF;
        int var8 = class137.field2020[var7];
        int var9 = class137.field2044[var7];
        int var10 = var8 * 256 / (field1077 + 256);
        int var11 = var9 * 256 / (field1077 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field578.method4767(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("b.ih(IIIILjp;Lhx;I)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field986 + field1000 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2020[var6];
        int var9 = class137.field2044[var6];
        int var10 = var8 * 256 / (field1077 + 256);
        int var11 = var9 * 256 / (field1077 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4813(arg5.field2611 / 2 + var12 - arg4.field3784 / 2, arg5.field2606 / 2 - var13 - arg4.field3786 / 2, arg0, arg1, arg5.field2611, arg5.field2606, arg5.field2608, arg5.field2607);
        } else {
            arg4.method4770(arg5.field2611 / 2 + arg0 + var12 - arg4.field3784 / 2, arg5.field2606 / 2 + arg1 - var13 - arg4.field3786 / 2);
        }
    }

    @ObfuscatedName("z.jd(Ljava/lang/String;ZI)Z")
    public static boolean method27(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method2789(arg0, Statics.field282);
        for (int var3 = 0; var3 < field1183; var3++) {
            if (var2.equalsIgnoreCase(Statics.method2789(field1185[var3].field796, Statics.field282)) && (!arg1 || field1185[var3].field793 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method2789(Statics.field2350.field888, Statics.field282))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fd.jj(Ljava/lang/String;B)Z")
    public static boolean method2886(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method2789(arg0, Statics.field282);
        for (int var2 = 0; var2 < field1187; var2++) {
            class71 var3 = field1188[var2];
            if (var1.equalsIgnoreCase(Statics.method2789(var3.field844, Statics.field282))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method2789(var3.field843, Statics.field282))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cc.jb(Ljava/lang/String;ZI)V")
    public static final void method1613(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1187 < 100 || field1147 == 1) || field1187 >= 400) {
            class99.method1689(31, "", class226.field3022);
            return;
        }
        String var2 = Statics.method2789(arg0, Statics.field282);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1187; var3++) {
            class71 var4 = field1188[var3];
            String var5 = Statics.method2789(var4.field844, Statics.field282);
            if (var5 != null && var5.equals(var2)) {
                class99.method1689(31, "", arg0 + class226.field3135);
                return;
            }
            if (var4.field843 != null) {
                String var6 = Statics.method2789(var4.field843, Statics.field282);
                if (var6 != null && var6.equals(var2)) {
                    class99.method1689(31, "", arg0 + class226.field3135);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1183; var7++) {
            class66 var8 = field1185[var7];
            String var9 = Statics.method2789(var8.field796, Statics.field282);
            if (var9 != null && var9.equals(var2)) {
                class99.method1689(31, "", class226.field2971 + arg0 + class226.field3117);
                return;
            }
            if (var8.field792 != null) {
                String var10 = Statics.method2789(var8.field792, Statics.field282);
                if (var10 != null && var10.equals(var2)) {
                    class99.method1689(31, "", class226.field2971 + arg0 + class226.field3117);
                    return;
                }
            }
        }
        if (Statics.method2789(Statics.field2350.field888, Statics.field282).equals(var2)) {
            class99.method1689(31, "", class226.field3025);
        } else {
            field957.method3159(4);
            field957.method2906(Statics.method1708(arg0));
            field957.method2912(arg0);
        }
    }

    @ObfuscatedName("ix.jz(Ljava/lang/String;I)V")
    public static final void method4044(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method2789(arg0, Statics.field282);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1183; var2++) {
            class66 var3 = field1185[var2];
            String var4 = var3.field796;
            String var5 = Statics.method2789(var4, Statics.field282);
            if (class278.method1685(arg0, var1, var4, var5)) {
                field1183--;
                for (int var6 = var2; var6 < field1183; var6++) {
                    field1185[var6] = field1185[var6 + 1];
                }
                field1110 = field1111;
                field957.method3159(211);
                field957.method2906(Statics.method1708(arg0));
                field957.method2912(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("p.jn(Ljava/lang/String;B)V")
    public static final void method2(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method2789(arg0, Statics.field282);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1187; var2++) {
            class71 var3 = field1188[var2];
            String var4 = var3.field844;
            String var5 = Statics.method2789(var4, Statics.field282);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1187--;
                for (int var7 = var2; var7 < field1187; var7++) {
                    field1188[var7] = field1188[var7 + 1];
                }
                field1110 = field1111;
                field957.method3159(140);
                field957.method2906(Statics.method1708(arg0));
                field957.method2912(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("r.jk(Ljava/lang/String;II)V")
    public static final void method99(String arg0, int arg1) {
        field957.method3159(141);
        field957.method2906(Statics.method1708(arg0) + 1);
        field957.method2946(arg1);
        field957.method2912(arg0);
    }

    @ObfuscatedName("bt.ji(B)V")
    public static final void method973() {
        field957.method3159(163);
        field957.method2906(0);
    }

    @ObfuscatedName("iw.jl(Lhj;I)I")
    public static int method4162(class217 arg0) {
        class199 var1 = (class199) field936.method3295(((long) arg0.field2653 << 32) + (long) arg0.field2654);
        return var1 == null ? arg0.field2725 : var1.field2497;
    }

    @ObfuscatedName("fr.jr(Lhj;B)Lhj;")
    public static class217 method2882(class217 arg0) {
        int var1 = class218.method545(method4162(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class217.method3143(arg0.field2668);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("br.ja(Lhj;B)Z")
    public static boolean method992(class217 arg0) {
        if (field1087) {
            if (method4162(arg0) != 0) {
                return false;
            }
            if (arg0.field2655 == 0) {
                return false;
            }
        }
        return arg0.field2673;
    }

    @ObfuscatedName("cp.js(Lhj;IB)Ljava/lang/String;")
    public static String method1555(class217 arg0, int arg1) {
        if (!class218.method4855(method4162(arg0), arg1) && arg0.field2753 == null) {
            return null;
        } else if (arg0.field2727 == null || arg0.field2727.length <= arg1 || arg0.field2727[arg1] == null || arg0.field2727[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2727[arg1];
        }
    }

    @ObfuscatedName("am.jm(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method491(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field916 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field916 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field916 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field916 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field916 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field599 != null) {
            var3 = "/p=" + Statics.field599;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field920 + "/a=" + Statics.field2549 + var3 + "/";
    }

    @ObfuscatedName("ik.jx(Ljava/lang/String;B)V")
    public static void method4080(String arg0) {
        Statics.field599 = arg0;
        try {
            String var1 = Statics.field591.getParameter(class275.field3725.field3729);
            String var2 = Statics.field591.getParameter(class275.field3727.field3729);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class183.method2223(class176.method2396() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class53.method666(Statics.field591, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("y.ju(Ljava/lang/String;ZI)V")
    public static void method87(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3501; var5++) {
            class257 var6 = class257.method4344(var5);
            if ((!arg1 || var6.field3547) && var6.field3539 == -1 && var6.field3507.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field245 = -1;
                    Statics.field270 = null;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var7 = new short[var3.length * 2];
                    for (int var8 = 0; var8 < var4; var8++) {
                        var7[var8] = var3[var8];
                    }
                    var3 = var7;
                }
                var3[var4++] = (short) var5;
            }
        }
        Statics.field270 = var3;
        Statics.field1638 = 0;
        Statics.field245 = var4;
        String[] var9 = new String[Statics.field245];
        for (int var10 = 0; var10 < Statics.field245; var10++) {
            var9[var10] = class257.method4344(var3[var10]).field3507;
        }
        class171.method2222(var9, Statics.field270);
    }

    @ObfuscatedName("hw.jq(Lfl;I)V")
    public static void method3801(class174 arg0) {
        if (field1109 != null) {
            arg0.method2989(field1109, 0, field1109.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class156.field2258.method2146(0L);
            class156.field2258.method2156(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var7) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2989(var1, 0, var1.length);
    }
}
